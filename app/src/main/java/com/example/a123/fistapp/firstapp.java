package com.example.a123.fistapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class firstapp extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello, World!");
        setContentView(tv);
    }
}