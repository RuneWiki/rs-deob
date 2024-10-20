package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("df")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("df.k")
    public static int field2007 = 0;

    @ObfuscatedName("df.y")
    public static volatile int field2009 = 0;

    @ObfuscatedName("df.s")
    public static class127 field2017 = new class127();

    @ObfuscatedName("df.g")
    public static volatile int field2002 = 0;

    @ObfuscatedName("df.h")
    public static volatile int field2001 = 0;

    @ObfuscatedName("df.l")
    public static volatile int field2003 = -1;

    @ObfuscatedName("df.e")
    public static volatile int field2014 = -1;

    @ObfuscatedName("df.u")
    public static int field2006 = 0;

    @ObfuscatedName("df.j")
    public static int field2008 = 0;

    @ObfuscatedName("df.c")
    public static volatile int field2010 = 0;

    @ObfuscatedName("df.d")
    public static volatile int field2011 = 0;

    @ObfuscatedName("df.v")
    public static volatile long field2012 = 0L;

    @ObfuscatedName("df.n")
    public static int field2004 = 0;

    @ObfuscatedName("df.z")
    public static int field2013 = 0;

    @ObfuscatedName("df.a")
    public static int field2015 = 0;

    @ObfuscatedName("df.t")
    public static long field2016 = 0L;

    @ObfuscatedName("cu.k(Ljava/awt/Component;B)V")
    public static void method1971(Component arg0) {
        arg0.addMouseListener(field2017);
        arg0.addMouseMotionListener(field2017);
        arg0.addFocusListener(field2017);
    }

    @ObfuscatedName("ba.y(Ljava/awt/Component;I)V")
    public static void method1326(Component arg0) {
        arg0.removeMouseListener(field2017);
        arg0.removeMouseMotionListener(field2017);
        arg0.removeFocusListener(field2017);
        field2001 = 0;
    }

    @ObfuscatedName("y.s(I)V")
    public static void method8() {
        if (field2017 != null) {
            class127 var0 = field2017;
            synchronized (field2017) {
                field2017 = null;
            }
        }
    }

    @ObfuscatedName("dp.g(I)V")
    public static void method2441() {
        class127 var0 = field2017;
        synchronized (field2017) {
            field2006 = field2001;
            field2007 = field2003;
            field2008 = field2014;
            field2004 = field2009;
            field2013 = field2010;
            field2015 = field2011;
            field2016 = field2012;
            field2009 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2017 != null) {
            field2002 = 0;
            field2010 = arg0.getX();
            field2011 = arg0.getY();
            field2012 = class103.method16();
            if (arg0.isAltDown()) {
                field2009 = 4;
                field2001 = 4;
            } else if (arg0.isMetaDown()) {
                field2009 = 2;
                field2001 = 2;
            } else {
                field2009 = 1;
                field2001 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2017 != null) {
            field2002 = 0;
            field2001 = 0;
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
            field2002 = 0;
            field2003 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2017 != null) {
            field2002 = 0;
            field2003 = -1;
            field2014 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2017 != null) {
            field2002 = 0;
            field2003 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2017 != null) {
            field2002 = 0;
            field2003 = arg0.getX();
            field2014 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2017 != null) {
            field2001 = 0;
        }
    }
}
