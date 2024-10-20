package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dz")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dz.k")
    public static int field2011 = 0;

    @ObfuscatedName("dz.r")
    public static class127 field2007 = new class127();

    @ObfuscatedName("dz.y")
    public static volatile int field2013 = 0;

    @ObfuscatedName("dz.w")
    public static volatile int field2005 = 0;

    @ObfuscatedName("dz.m")
    public static volatile int field2006 = 0;

    @ObfuscatedName("dz.j")
    public static volatile int field2021 = -1;

    @ObfuscatedName("dz.g")
    public static volatile int field2009 = -1;

    @ObfuscatedName("dz.p")
    public static int field2018 = 0;

    @ObfuscatedName("dz.o")
    public static int field2008 = 0;

    @ObfuscatedName("dz.b")
    public static volatile int field2012 = 0;

    @ObfuscatedName("dz.x")
    public static volatile int field2015 = 0;

    @ObfuscatedName("dz.n")
    public static volatile long field2016 = 0L;

    @ObfuscatedName("dz.d")
    public static int field2017 = 0;

    @ObfuscatedName("dz.s")
    public static int field2014 = 0;

    @ObfuscatedName("dz.v")
    public static int field2019 = 0;

    @ObfuscatedName("dz.t")
    public static long field2020 = 0L;

    @ObfuscatedName("cr.k(B)V")
    public static void method1784() {
        class127 var0 = field2007;
        synchronized (field2007) {
            field2018 = field2006;
            field2011 = field2021;
            field2008 = field2009 * 1086823495;
            field2017 = field2013;
            field2014 = field2012;
            field2019 = field2015;
            field2020 = field2016;
            field2013 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2007 != null) {
            field2005 = 0;
            field2012 = arg0.getX();
            field2015 = arg0.getY();
            field2016 = class103.method470();
            if (arg0.isAltDown()) {
                field2013 = 4;
                field2006 = 4;
            } else if (arg0.isMetaDown()) {
                field2013 = 2;
                field2006 = 2;
            } else {
                field2013 = 1;
                field2006 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2007 != null) {
            field2005 = 0;
            field2006 = 0;
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
        if (field2007 != null) {
            field2005 = 0;
            field2021 = arg0.getX();
            field2009 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2007 != null) {
            field2005 = 0;
            field2021 = -1;
            field2009 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2007 != null) {
            field2005 = 0;
            field2021 = arg0.getX();
            field2009 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2007 != null) {
            field2005 = 0;
            field2021 = arg0.getX();
            field2009 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2007 != null) {
            field2006 = 0;
        }
    }
}
