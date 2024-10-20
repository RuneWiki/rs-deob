package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dl")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dl.x")
    public static int field2002 = 0;

    @ObfuscatedName("dl.v")
    public static class129 field2003 = new class129();

    @ObfuscatedName("dl.m")
    public static volatile int field2004 = 0;

    @ObfuscatedName("dl.e")
    public static volatile int field1997 = 0;

    @ObfuscatedName("dl.h")
    public static volatile int field1998 = -1;

    @ObfuscatedName("dl.p")
    public static volatile int field2010 = -1;

    @ObfuscatedName("dl.j")
    public static int field2000 = 0;

    @ObfuscatedName("dl.i")
    public static int field2001 = 0;

    @ObfuscatedName("dl.u")
    public static volatile int field1995 = 0;

    @ObfuscatedName("dl.l")
    public static volatile int field2012 = 0;

    @ObfuscatedName("dl.k")
    public static volatile int field2005 = 0;

    @ObfuscatedName("dl.q")
    public static volatile long field2009 = 0L;

    @ObfuscatedName("dl.b")
    public static int field2007 = 0;

    @ObfuscatedName("dl.w")
    public static int field2008 = 0;

    @ObfuscatedName("dl.g")
    public static int field1999 = 0;

    @ObfuscatedName("dl.s")
    public static long field1996 = 0L;

    @ObfuscatedName("cy.x(Ljava/awt/Component;B)V")
    public static void method2063(Component arg0) {
        arg0.addMouseListener(field2003);
        arg0.addMouseMotionListener(field2003);
        arg0.addFocusListener(field2003);
    }

    @ObfuscatedName("f.v(I)I")
    public static int method482() {
        return ++field2004 - 1;
    }

    @ObfuscatedName("dm.m(II)V")
    public static void method2327(int arg0) {
        field2004 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2003 != null) {
            field2004 = 0;
            field2012 = arg0.getX();
            field2005 = arg0.getY();
            field2009 = class104.method27();
            if (arg0.isAltDown()) {
                field1995 = 4;
                field1997 = 4;
            } else if (arg0.isMetaDown()) {
                field1995 = 2;
                field1997 = 2;
            } else {
                field1995 = 1;
                field1997 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2003 != null) {
            field2004 = 0;
            field1997 = 0;
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
        if (field2003 != null) {
            field2004 = 0;
            field1998 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2003 != null) {
            field2004 = 0;
            field1998 = -1;
            field2010 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2003 != null) {
            field2004 = 0;
            field1998 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2003 != null) {
            field2004 = 0;
            field1998 = arg0.getX();
            field2010 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2003 != null) {
            field1997 = 0;
        }
    }
}
