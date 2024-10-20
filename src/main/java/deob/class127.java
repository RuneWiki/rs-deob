package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dy")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dy.b")
    public static class127 field2009 = new class127();

    @ObfuscatedName("dy.u")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dy.x")
    public static int field2005 = 0;

    @ObfuscatedName("dy.j")
    public static volatile int field2001 = 0;

    @ObfuscatedName("dy.o")
    public static volatile int field2015 = -1;

    @ObfuscatedName("dy.n")
    public static volatile int field1998 = -1;

    @ObfuscatedName("dy.y")
    public static volatile int field2006 = 0;

    @ObfuscatedName("dy.f")
    public static int field2011 = 0;

    @ObfuscatedName("dy.p")
    public static int field2004 = 0;

    @ObfuscatedName("dy.l")
    public static volatile int field2007 = 0;

    @ObfuscatedName("dy.k")
    public static volatile int field2008 = 0;

    @ObfuscatedName("dy.q")
    public static volatile long field1999 = 0L;

    @ObfuscatedName("dy.e")
    public static int field2010 = 0;

    @ObfuscatedName("dy.t")
    public static int field2013 = 0;

    @ObfuscatedName("dy.g")
    public static int field2012 = 0;

    @ObfuscatedName("dy.c")
    public static long field2017 = 0L;

    @ObfuscatedName("aq.b(I)V")
    public static void method850() {
        if (field2009 != null) {
            class127 var0 = field2009;
            synchronized (field2009) {
                field2009 = null;
            }
        }
    }

    @ObfuscatedName("ax.u(B)V")
    public static void method997() {
        class127 var0 = field2009;
        synchronized (field2009) {
            field2011 = field2001;
            field2004 = field2015;
            field2005 = field1998;
            field2010 = field2006;
            field2013 = field2007;
            field2012 = field2008;
            field2017 = field1999;
            field2006 = 0;
        }
    }

    @ObfuscatedName("ae.x(II)V")
    public static void method795(int arg0) {
        field2000 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2009 != null) {
            field2000 = 0;
            field2007 = arg0.getX();
            field2008 = arg0.getY();
            field1999 = class103.method29();
            if (arg0.isAltDown()) {
                field2006 = 4;
                field2001 = 4;
            } else if (arg0.isMetaDown()) {
                field2006 = 2;
                field2001 = 2;
            } else {
                field2006 = 1;
                field2001 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2009 != null) {
            field2000 = 0;
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
        if (field2009 != null) {
            field2000 = 0;
            field2015 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2009 != null) {
            field2000 = 0;
            field2015 = -1;
            field1998 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2009 != null) {
            field2000 = 0;
            field2015 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2009 != null) {
            field2000 = 0;
            field2015 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2009 != null) {
            field2001 = 0;
        }
    }
}
