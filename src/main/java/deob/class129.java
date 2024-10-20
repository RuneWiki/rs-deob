package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dv")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dv.f")
    public static class129 field2019 = new class129();

    @ObfuscatedName("dv.k")
    public static int field2017 = 0;

    @ObfuscatedName("dv.y")
    public static volatile int field2024 = 0;

    @ObfuscatedName("dv.e")
    public static volatile int field2012 = 0;

    @ObfuscatedName("dv.r")
    public static volatile int field2013 = 0;

    @ObfuscatedName("dv.a")
    public static volatile int field2023 = -1;

    @ObfuscatedName("dv.n")
    public static volatile int field2015 = -1;

    @ObfuscatedName("dv.x")
    public static int field2018 = 0;

    @ObfuscatedName("dv.g")
    public static int field2016 = 0;

    @ObfuscatedName("dv.o")
    public static volatile int field2020 = 0;

    @ObfuscatedName("dv.p")
    public static volatile int field2021 = 0;

    @ObfuscatedName("dv.v")
    public static volatile long field2014 = 0L;

    @ObfuscatedName("dv.w")
    public static int field2022 = 0;

    @ObfuscatedName("dv.t")
    public static int field2030 = 0;

    @ObfuscatedName("dv.s")
    public static int field2011 = 0;

    @ObfuscatedName("dv.b")
    public static long field2026 = 0L;

    @ObfuscatedName("l.f(Ljava/awt/Component;B)V")
    public static void method499(Component arg0) {
        arg0.addMouseListener(field2019);
        arg0.addMouseMotionListener(field2019);
        arg0.addFocusListener(field2019);
    }

    @ObfuscatedName("cd.k(I)V")
    public static void method2087() {
        class129 var0 = field2019;
        synchronized (field2019) {
            field2016 = field2013;
            field2017 = field2023;
            field2018 = field2015;
            field2022 = field2024;
            field2030 = field2020;
            field2011 = field2021;
            field2026 = field2014;
            field2024 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
            field2020 = arg0.getX();
            field2021 = arg0.getY();
            field2014 = class104.method1417();
            if (arg0.isAltDown()) {
                field2024 = 4;
                field2013 = 4;
            } else if (arg0.isMetaDown()) {
                field2024 = 2;
                field2013 = 2;
            } else {
                field2024 = 1;
                field2013 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
            field2013 = 0;
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
        if (field2019 != null) {
            field2012 = 0;
            field2023 = arg0.getX();
            field2015 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
            field2023 = -1;
            field2015 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
            field2023 = arg0.getX();
            field2015 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
            field2023 = arg0.getX();
            field2015 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2019 != null) {
            field2013 = 0;
        }
    }
}
