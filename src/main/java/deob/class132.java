package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ep")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ep.e")
    public static class132 field2015 = new class132();

    @ObfuscatedName("ep.a")
    public static volatile int field2002 = 0;

    @ObfuscatedName("ep.l")
    public static volatile int field2003 = 0;

    @ObfuscatedName("ep.c")
    public static volatile int field2011 = -1;

    @ObfuscatedName("ep.u")
    public static volatile int field2005 = -1;

    @ObfuscatedName("ep.w")
    public static int field2016 = 0;

    @ObfuscatedName("ep.i")
    public static int field2007 = 0;

    @ObfuscatedName("ep.r")
    public static int field2008 = 0;

    @ObfuscatedName("ep.f")
    public static volatile int field2009 = 0;

    @ObfuscatedName("ep.g")
    public static volatile int field2004 = 0;

    @ObfuscatedName("ep.o")
    public static volatile int field2001 = 0;

    @ObfuscatedName("ep.h")
    public static volatile long field2012 = 0L;

    @ObfuscatedName("ep.s")
    public static int field2013 = 0;

    @ObfuscatedName("ep.j")
    public static int field2014 = 0;

    @ObfuscatedName("ep.m")
    public static int field2006 = 0;

    @ObfuscatedName("ep.t")
    public static long field2010 = 0L;

    @ObfuscatedName("z.e(Ljava/awt/Component;I)V")
    public static void method195(Component arg0) {
        arg0.addMouseListener(field2015);
        arg0.addMouseMotionListener(field2015);
        arg0.addFocusListener(field2015);
    }

    @ObfuscatedName("ck.a(I)V")
    public static void method1933() {
        class132 var0 = field2015;
        synchronized (field2015) {
            field2016 = field2003;
            field2007 = field2011;
            field2008 = field2005;
            field2013 = field2009;
            field2014 = field2004;
            field2006 = field2001;
            field2010 = field2012;
            field2009 = 0;
        }
    }

    @ObfuscatedName("e.l(I)I")
    public static int method3() {
        return ++field2002 - 1;
    }

    @ObfuscatedName("cc.c(IB)V")
    public static void method2088(int arg0) {
        field2002 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2015 != null) {
            field2002 = 0;
            field2004 = arg0.getX();
            field2001 = arg0.getY();
            field2012 = class107.method635();
            if (arg0.isAltDown()) {
                field2009 = 4;
                field2003 = 4;
            } else if (arg0.isMetaDown()) {
                field2009 = 2;
                field2003 = 2;
            } else {
                field2009 = 1;
                field2003 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2015 != null) {
            field2002 = 0;
            field2003 = 0;
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
        if (field2015 != null) {
            field2002 = 0;
            field2011 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2015 != null) {
            field2002 = 0;
            field2011 = -1;
            field2005 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2015 != null) {
            field2002 = 0;
            field2011 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2015 != null) {
            field2002 = 0;
            field2011 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2015 != null) {
            field2003 = 0;
        }
    }
}
