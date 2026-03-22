package com.example.demo_12;
/**
 * @author      Yaara Lugasi.yl7717@bs.amalnet.k12.il
 * @version     1.0
 * @since		22/3/2026
 */

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    public Switch aSwitch;
    public ToggleButton toggleButton;
    public ConstraintLayout constraintLayout;

    /**
     * @param.aSwitch.שולט בסוג הצבע
     * @param.toggleButton.שולט בבחירת הצבע
     * @param.constraintLayout.רכיב המסך שמשתנה לו הצבע
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.main);
        aSwitch = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggle);
        aSwitch.setChecked(true);
    }

    public void clicked(View view) {
        if (toggleButton.isChecked() && aSwitch.isChecked()) {
            constraintLayout.setBackgroundColor(Color.RED);
        } if (toggleButton.isChecked() && !aSwitch.isChecked()) {
            constraintLayout.setBackgroundColor(Color.BLUE);
        } if (!aSwitch.isChecked() && !toggleButton.isChecked()) {
            constraintLayout.setBackgroundColor(Color.MAGENTA);
        } if (!toggleButton.isChecked() && aSwitch.isChecked()) {
            constraintLayout.setBackgroundColor(Color.GREEN);
        }
    }
}