package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dx")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dx.e")
    public static class127 field2006 = new class127();

    @ObfuscatedName("dx.p")
    public static volatile int field2007 = 0;

    @ObfuscatedName("dx.a")
    public static volatile int field2002 = 0;

    @ObfuscatedName("dx.g")
    public static volatile int field2012 = -1;

    @ObfuscatedName("dx.u")
    public static volatile int field2011 = -1;

    @ObfuscatedName("dx.k")
    public static int field2004 = 0;

    @ObfuscatedName("dx.m")
    public static int field2005 = 0;

    @ObfuscatedName("dx.t")
    public static int field2001 = 0;

    @ObfuscatedName("dx.l")
    public static volatile int field2008 = 0;

    @ObfuscatedName("dx.f")
    public static volatile int field2009 = 0;

    @ObfuscatedName("dx.c")
    public static volatile int field2010 = 0;

    @ObfuscatedName("dx.i")
    public static volatile long field2015 = 0L;

    @ObfuscatedName("dx.o")
    public static int field2000 = 0;

    @ObfuscatedName("dx.d")
    public static int field2013 = 0;

    @ObfuscatedName("dx.b")
    public static int field2014 = 0;

    @ObfuscatedName("dx.v")
    public static long field2003 = 0L;

    @ObfuscatedName("cv.e(Ljava/awt/Component;I)V")
    public static void method2064(Component arg0) {
        arg0.addMouseListener(field2006);
        arg0.addMouseMotionListener(field2006);
        arg0.addFocusListener(field2006);
    }

    @ObfuscatedName("m.p(Ljava/awt/Component;I)V")
    public static void method76(Component arg0) {
        arg0.removeMouseListener(field2006);
        arg0.removeMouseMotionListener(field2006);
        arg0.removeFocusListener(field2006);
        field2002 = 0;
    }

    @ObfuscatedName("b.a(B)V")
    public static void method139() {
        if (field2006 != null) {
            class127 var0 = field2006;
            synchronized (field2006) {
                field2006 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2009 = arg0.getX();
            field2010 = arg0.getY();
            field2015 = class103.method527();
            if (arg0.isAltDown()) {
                field2008 = 4;
                field2002 = 4;
            } else if (arg0.isMetaDown()) {
                field2008 = 2;
                field2002 = 2;
            } else {
                field2008 = 1;
                field2002 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2002 = 0;
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
            field2012 = arg0.getX();
            field2011 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2012 = -1;
            field2011 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2012 = arg0.getX();
            field2011 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2006 != null) {
            field2007 = 0;
            field2012 = arg0.getX();
            field2011 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2006 != null) {
            field2002 = 0;
        }
    }
}
