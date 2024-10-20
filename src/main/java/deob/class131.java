package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ez")
public class class131 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ez.p")
    public static class131 field2013 = new class131();

    @ObfuscatedName("ez.y")
    public static volatile int field2011 = 0;

    @ObfuscatedName("ez.d")
    public static volatile int field2004 = 0;

    @ObfuscatedName("ez.c")
    public static volatile int field2015 = 0;

    @ObfuscatedName("ez.r")
    public static volatile int field2006 = -1;

    @ObfuscatedName("ez.f")
    public static volatile int field2007 = -1;

    @ObfuscatedName("ez.z")
    public static int field2008 = 0;

    @ObfuscatedName("ez.o")
    public static int field2009 = 0;

    @ObfuscatedName("ez.k")
    public static int field2010 = 0;

    @ObfuscatedName("ez.s")
    public static volatile int field2012 = 0;

    @ObfuscatedName("ez.h")
    public static volatile int field2005 = 0;

    @ObfuscatedName("ez.m")
    public static volatile long field2014 = 0L;

    @ObfuscatedName("ez.w")
    public static int field2017 = 0;

    @ObfuscatedName("ez.q")
    public static int field2016 = 0;

    @ObfuscatedName("ez.u")
    public static int field2020 = 0;

    @ObfuscatedName("ez.e")
    public static long field2018 = 0L;

    @ObfuscatedName("eq.p(Ljava/awt/Component;I)V")
    public static void method2726(Component arg0) {
        arg0.addMouseListener(field2013);
        arg0.addMouseMotionListener(field2013);
        arg0.addFocusListener(field2013);
    }

    @ObfuscatedName("dh.y(Ljava/awt/Component;I)V")
    public static void method2556(Component arg0) {
        arg0.removeMouseListener(field2013);
        arg0.removeMouseMotionListener(field2013);
        arg0.removeFocusListener(field2013);
        field2015 = 0;
    }

    @ObfuscatedName("al.d(B)V")
    public static void method619() {
        class131 var0 = field2013;
        synchronized (field2013) {
            field2008 = field2015;
            field2009 = field2006;
            field2010 = field2007;
            field2017 = field2011;
            field2016 = field2012;
            field2020 = field2005;
            field2018 = field2014;
            field2011 = 0;
        }
    }

    @ObfuscatedName("db.c(I)I")
    public static int method2535() {
        return ++field2004 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2013 != null) {
            field2004 = 0;
            field2012 = arg0.getX();
            field2005 = arg0.getY();
            field2014 = class106.method870();
            if (arg0.isAltDown()) {
                field2011 = 4;
                field2015 = 4;
            } else if (arg0.isMetaDown()) {
                field2011 = 2;
                field2015 = 2;
            } else {
                field2011 = 1;
                field2015 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2013 != null) {
            field2004 = 0;
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
        if (field2013 != null) {
            field2004 = 0;
            field2006 = arg0.getX();
            field2007 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2013 != null) {
            field2004 = 0;
            field2006 = -1;
            field2007 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2013 != null) {
            field2004 = 0;
            field2006 = arg0.getX();
            field2007 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2013 != null) {
            field2004 = 0;
            field2006 = arg0.getX();
            field2007 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2013 != null) {
            field2015 = 0;
        }
    }
}
