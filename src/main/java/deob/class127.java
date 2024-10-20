package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dx")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dx.k")
    public static int field2010 = 0;

    @ObfuscatedName("dx.b")
    public static class127 field2019 = new class127();

    @ObfuscatedName("dx.e")
    public static volatile int field2024 = 0;

    @ObfuscatedName("dx.i")
    public static volatile int field2012 = 0;

    @ObfuscatedName("dx.t")
    public static volatile int field2013 = -1;

    @ObfuscatedName("dx.z")
    public static volatile int field2014 = -1;

    @ObfuscatedName("dx.g")
    public static int field2011 = 0;

    @ObfuscatedName("dx.c")
    public static int field2017 = 0;

    @ObfuscatedName("dx.o")
    public static volatile int field2018 = 0;

    @ObfuscatedName("dx.q")
    public static volatile int field2016 = 0;

    @ObfuscatedName("dx.w")
    public static volatile int field2020 = 0;

    @ObfuscatedName("dx.y")
    public static volatile long field2021 = 0L;

    @ObfuscatedName("dx.p")
    public static int field2022 = 0;

    @ObfuscatedName("dx.m")
    public static int field2023 = 0;

    @ObfuscatedName("dx.a")
    public static int field2015 = 0;

    @ObfuscatedName("dx.u")
    public static long field2025 = 0L;

    @ObfuscatedName("do.k(Ljava/awt/Component;I)V")
    public static void method2418(Component arg0) {
        arg0.addMouseListener(field2019);
        arg0.addMouseMotionListener(field2019);
        arg0.addFocusListener(field2019);
    }

    @ObfuscatedName("p.b(Ljava/awt/Component;I)V")
    public static void method150(Component arg0) {
        arg0.removeMouseListener(field2019);
        arg0.removeMouseMotionListener(field2019);
        arg0.removeFocusListener(field2019);
        field2012 = 0;
    }

    @ObfuscatedName("dm.e(I)V")
    public static void method2433() {
        if (field2019 != null) {
            class127 var0 = field2019;
            synchronized (field2019) {
                field2019 = null;
            }
        }
    }

    @ObfuscatedName("aw.i(B)I")
    public static int method566() {
        return ++field2024 - 1;
    }

    @ObfuscatedName("aq.t(II)V")
    public static void method1018(int arg0) {
        field2024 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2019 != null) {
            field2024 = 0;
            field2016 = arg0.getX();
            field2020 = arg0.getY();
            field2021 = class103.method2455();
            if (arg0.isAltDown()) {
                field2018 = 4;
                field2012 = 4;
            } else if (arg0.isMetaDown()) {
                field2018 = 2;
                field2012 = 2;
            } else {
                field2018 = 1;
                field2012 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2019 != null) {
            field2024 = 0;
            field2012 = 0;
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
            field2024 = 0;
            field2013 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2019 != null) {
            field2024 = 0;
            field2013 = -1;
            field2014 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2019 != null) {
            field2024 = 0;
            field2013 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2019 != null) {
            field2024 = 0;
            field2013 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2019 != null) {
            field2012 = 0;
        }
    }
}
