package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ea")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ea.q")
    public static class132 field2004 = new class132();

    @ObfuscatedName("ea.s")
    public static volatile int field1999 = 0;

    @ObfuscatedName("ea.h")
    public static volatile int field1998 = 0;

    @ObfuscatedName("ea.e")
    public static volatile int field2008 = -1;

    @ObfuscatedName("ea.n")
    public static volatile int field2002 = -1;

    @ObfuscatedName("ea.t")
    public static int field2003 = 0;

    @ObfuscatedName("ea.l")
    public static int field2011 = 0;

    @ObfuscatedName("ea.m")
    public static int field2005 = 0;

    @ObfuscatedName("ea.o")
    public static volatile int field2006 = 0;

    @ObfuscatedName("ea.k")
    public static volatile int field2007 = 0;

    @ObfuscatedName("ea.p")
    public static volatile int field2012 = 0;

    @ObfuscatedName("ea.u")
    public static volatile long field2001 = 0L;

    @ObfuscatedName("ea.g")
    public static int field2000 = 0;

    @ObfuscatedName("ea.a")
    public static int field2009 = 0;

    @ObfuscatedName("ea.y")
    public static int field2010 = 0;

    @ObfuscatedName("ea.d")
    public static long field2013 = 0L;

    @ObfuscatedName("ca.q(Ljava/awt/Component;I)V")
    public static void method1896(Component arg0) {
        arg0.addMouseListener(field2004);
        arg0.addMouseMotionListener(field2004);
        arg0.addFocusListener(field2004);
    }

    @ObfuscatedName("dz.s(Ljava/awt/Component;B)V")
    public static void method2462(Component arg0) {
        arg0.removeMouseListener(field2004);
        arg0.removeMouseMotionListener(field2004);
        arg0.removeFocusListener(field2004);
        field1998 = 0;
    }

    @ObfuscatedName("client.h(I)V")
    public static void method384() {
        if (field2004 != null) {
            class132 var0 = field2004;
            synchronized (field2004) {
                field2004 = null;
            }
        }
    }

    @ObfuscatedName("eb.e(II)V")
    public static void method2550(int arg0) {
        field1999 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2004 != null) {
            field1999 = 0;
            field2007 = arg0.getX();
            field2012 = arg0.getY();
            field2001 = class107.method2434();
            if (arg0.isAltDown()) {
                field2006 = 4;
                field1998 = 4;
            } else if (arg0.isMetaDown()) {
                field2006 = 2;
                field1998 = 2;
            } else {
                field2006 = 1;
                field1998 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2004 != null) {
            field1999 = 0;
            field1998 = 0;
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
        if (field2004 != null) {
            field1999 = 0;
            field2008 = arg0.getX();
            field2002 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2004 != null) {
            field1999 = 0;
            field2008 = -1;
            field2002 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2004 != null) {
            field1999 = 0;
            field2008 = arg0.getX();
            field2002 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2004 != null) {
            field1999 = 0;
            field2008 = arg0.getX();
            field2002 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2004 != null) {
            field1998 = 0;
        }
    }
}
