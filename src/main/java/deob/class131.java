package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eb")
public class class131 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eb.v")
    public static class131 field2017 = new class131();

    @ObfuscatedName("eb.t")
    public static volatile int field2013 = 0;

    @ObfuscatedName("eb.f")
    public static volatile int field2015 = 0;

    @ObfuscatedName("eb.j")
    public static volatile int field2016 = -1;

    @ObfuscatedName("eb.l")
    public static volatile int field2014 = -1;

    @ObfuscatedName("eb.g")
    public static int field2018 = 0;

    @ObfuscatedName("eb.k")
    public static int field2019 = 0;

    @ObfuscatedName("eb.p")
    public static int field2020 = 0;

    @ObfuscatedName("eb.y")
    public static volatile int field2030 = 0;

    @ObfuscatedName("eb.m")
    public static volatile int field2022 = 0;

    @ObfuscatedName("eb.o")
    public static volatile int field2028 = 0;

    @ObfuscatedName("eb.c")
    public static volatile long field2024 = 0L;

    @ObfuscatedName("eb.r")
    public static int field2025 = 0;

    @ObfuscatedName("eb.s")
    public static int field2026 = 0;

    @ObfuscatedName("eb.n")
    public static int field2027 = 0;

    @ObfuscatedName("eb.q")
    public static long field2021 = 0L;

    @ObfuscatedName("dz.v(Ljava/awt/Component;B)V")
    public static void method2503(Component arg0) {
        arg0.addMouseListener(field2017);
        arg0.addMouseMotionListener(field2017);
        arg0.addFocusListener(field2017);
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2022 = arg0.getX();
            field2028 = arg0.getY();
            field2024 = class106.method487();
            if (arg0.isAltDown()) {
                field2030 = 4;
                field2015 = 4;
            } else if (arg0.isMetaDown()) {
                field2030 = 2;
                field2015 = 2;
            } else {
                field2030 = 1;
                field2015 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2015 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2016 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2016 = -1;
            field2014 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2016 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2017 != null) {
            field2013 = 0;
            field2016 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2017 != null) {
            field2015 = 0;
        }
    }
}
