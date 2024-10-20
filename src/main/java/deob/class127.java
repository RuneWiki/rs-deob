package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dp")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dp.e")
    public static class127 field2007 = new class127();

    @ObfuscatedName("dp.o")
    public static volatile int field1998 = 0;

    @ObfuscatedName("dp.y")
    public static volatile int field2001 = 0;

    @ObfuscatedName("dp.b")
    public static volatile int field1999 = 0;

    @ObfuscatedName("dp.w")
    public static volatile int field2013 = -1;

    @ObfuscatedName("dp.r")
    public static volatile int field2005 = -1;

    @ObfuscatedName("dp.l")
    public static int field2002 = 0;

    @ObfuscatedName("dp.s")
    public static int field2003 = 0;

    @ObfuscatedName("dp.f")
    public static int field2004 = 0;

    @ObfuscatedName("dp.x")
    public static volatile int field2006 = 0;

    @ObfuscatedName("dp.h")
    public static volatile int field2012 = 0;

    @ObfuscatedName("dp.a")
    public static volatile long field2008 = 0L;

    @ObfuscatedName("dp.u")
    public static int field2009 = 0;

    @ObfuscatedName("dp.v")
    public static int field2010 = 0;

    @ObfuscatedName("dp.i")
    public static int field2011 = 0;

    @ObfuscatedName("dp.n")
    public static long field2017 = 0L;

    @ObfuscatedName("m.e(B)V")
    public static void method528() {
        if (field2007 != null) {
            class127 var0 = field2007;
            synchronized (field2007) {
                field2007 = null;
            }
        }
    }

    @ObfuscatedName("fl.o(II)V")
    public static void method3048(int arg0) {
        field1998 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2007 != null) {
            field1998 = 0;
            field2006 = arg0.getX();
            field2012 = arg0.getY();
            field2008 = class103.method833();
            if (arg0.isAltDown()) {
                field2001 = 4;
                field1999 = 4;
            } else if (arg0.isMetaDown()) {
                field2001 = 2;
                field1999 = 2;
            } else {
                field2001 = 1;
                field1999 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2007 != null) {
            field1998 = 0;
            field1999 = 0;
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
            field1998 = 0;
            field2013 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2007 != null) {
            field1998 = 0;
            field2013 = -1;
            field2005 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2007 != null) {
            field1998 = 0;
            field2013 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2007 != null) {
            field1998 = 0;
            field2013 = arg0.getX();
            field2005 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2007 != null) {
            field1999 = 0;
        }
    }
}
