package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dp")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dp.j")
    public static class127 field2013 = new class127();

    @ObfuscatedName("dp.z")
    public static volatile int field2017 = 0;

    @ObfuscatedName("dp.y")
    public static volatile int field2014 = 0;

    @ObfuscatedName("dp.h")
    public static volatile int field2009 = 0;

    @ObfuscatedName("dp.r")
    public static volatile int field2010 = -1;

    @ObfuscatedName("dp.e")
    public static volatile int field2008 = -1;

    @ObfuscatedName("dp.k")
    public static int field2016 = 0;

    @ObfuscatedName("dp.b")
    public static int field2012 = 0;

    @ObfuscatedName("dp.n")
    public static int field2011 = 0;

    @ObfuscatedName("dp.a")
    public static volatile int field2022 = 0;

    @ObfuscatedName("dp.q")
    public static volatile int field2015 = 0;

    @ObfuscatedName("dp.i")
    public static volatile long field2018 = 0L;

    @ObfuscatedName("dp.f")
    public static int field2019 = 0;

    @ObfuscatedName("dp.o")
    public static int field2020 = 0;

    @ObfuscatedName("dp.t")
    public static int field2021 = 0;

    @ObfuscatedName("dp.c")
    public static long field2007 = 0L;

    @ObfuscatedName("cw.j(Ljava/awt/Component;B)V")
    public static void method1980(Component arg0) {
        arg0.addMouseListener(field2013);
        arg0.addMouseMotionListener(field2013);
        arg0.addFocusListener(field2013);
    }

    @ObfuscatedName("bl.z(S)V")
    public static void method1365() {
        if (field2013 != null) {
            class127 var0 = field2013;
            synchronized (field2013) {
                field2013 = null;
            }
        }
    }

    @ObfuscatedName("cs.y(I)I")
    public static int method2073() {
        return ++field2017 - 1;
    }

    @ObfuscatedName("bg.h(IB)V")
    public static void method1053(int arg0) {
        field2017 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2013 != null) {
            field2017 = 0;
            field2022 = arg0.getX();
            field2015 = arg0.getY();
            field2018 = class103.method553();
            if (arg0.isAltDown()) {
                field2014 = 4;
                field2009 = 4;
            } else if (arg0.isMetaDown()) {
                field2014 = 2;
                field2009 = 2;
            } else {
                field2014 = 1;
                field2009 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2013 != null) {
            field2017 = 0;
            field2009 = 0;
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
        if (field2013 != null) {
            field2017 = 0;
            field2010 = arg0.getX();
            field2008 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2013 != null) {
            field2017 = 0;
            field2010 = -1;
            field2008 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2013 != null) {
            field2017 = 0;
            field2010 = arg0.getX();
            field2008 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2013 != null) {
            field2017 = 0;
            field2010 = arg0.getX();
            field2008 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2013 != null) {
            field2009 = 0;
        }
    }
}
