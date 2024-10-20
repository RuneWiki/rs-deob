package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dp")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dp.g")
    public static class127 field2006 = new class127();

    @ObfuscatedName("dp.i")
    public static volatile int field2007 = 0;

    @ObfuscatedName("dp.k")
    public static int field2008 = 0;

    @ObfuscatedName("dp.e")
    public static volatile int field2011 = 0;

    @ObfuscatedName("dp.w")
    public static volatile int field2015 = -1;

    @ObfuscatedName("dp.m")
    public static volatile int field2010 = -1;

    @ObfuscatedName("dp.u")
    public static int field2009 = 0;

    @ObfuscatedName("dp.j")
    public static int field2013 = 0;

    @ObfuscatedName("dp.o")
    public static volatile int field2014 = 0;

    @ObfuscatedName("dp.h")
    public static volatile int field2019 = 0;

    @ObfuscatedName("dp.b")
    public static volatile int field2016 = 0;

    @ObfuscatedName("dp.r")
    public static volatile long field2012 = 0L;

    @ObfuscatedName("dp.l")
    public static int field2018 = 0;

    @ObfuscatedName("dp.x")
    public static int field2017 = 0;

    @ObfuscatedName("dp.q")
    public static int field2020 = 0;

    @ObfuscatedName("dp.t")
    public static long field2021 = 0L;

    @ObfuscatedName("cx.g(I)V")
    public static void method1836() {
        class127 var0 = field2006;
        synchronized (field2006) {
            field2009 = field2011;
            field2008 = field2015;
            field2013 = field2010;
            field2018 = field2014;
            field2017 = field2019;
            field2020 = field2016;
            field2021 = field2012;
            field2014 = 0;
        }
    }

    @ObfuscatedName("i.i(IB)V")
    public static void method11(int arg0) {
        field2007 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2019 = arg0.getX();
            field2016 = arg0.getY();
            field2012 = class103.method98();
            if (arg0.isAltDown()) {
                field2014 = 4;
                field2011 = 4;
            } else if (arg0.isMetaDown()) {
                field2014 = 2;
                field2011 = 2;
            } else {
                field2014 = 1;
                field2011 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2011 = 0;
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
        if (field2006 != null) {
            field2007 = 0;
            field2015 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2015 = -1;
            field2010 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2015 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2015 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2006 != null) {
            field2011 = 0;
        }
    }
}
