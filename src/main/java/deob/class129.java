package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dz")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dz.g")
    public static class129 field2006 = new class129();

    @ObfuscatedName("dz.j")
    public static volatile int field1991 = 0;

    @ObfuscatedName("dz.z")
    public static volatile int field1992 = 0;

    @ObfuscatedName("dz.b")
    public static volatile int field2004 = -1;

    @ObfuscatedName("dz.k")
    public static int field1996 = 0;

    @ObfuscatedName("dz.c")
    public static volatile int field1994 = -1;

    @ObfuscatedName("dz.w")
    public static int field1995 = 0;

    @ObfuscatedName("dz.l")
    public static int field1997 = 0;

    @ObfuscatedName("dz.n")
    public static volatile int field1998 = 0;

    @ObfuscatedName("dz.d")
    public static volatile int field1999 = 0;

    @ObfuscatedName("dz.h")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dz.y")
    public static volatile long field2001 = 0L;

    @ObfuscatedName("dz.p")
    public static int field1990 = 0;

    @ObfuscatedName("dz.i")
    public static int field2002 = 0;

    @ObfuscatedName("dz.s")
    public static int field2003 = 0;

    @ObfuscatedName("dz.f")
    public static long field2005 = 0L;

    @ObfuscatedName("cu.g(Ljava/awt/Component;I)V")
    public static void method2023(Component arg0) {
        arg0.removeMouseListener(field2006);
        arg0.removeMouseMotionListener(field2006);
        arg0.removeFocusListener(field2006);
        field1992 = 0;
    }

    @ObfuscatedName("bf.j(S)V")
    public static void method1357() {
        if (field2006 != null) {
            class129 var0 = field2006;
            synchronized (field2006) {
                field2006 = null;
            }
        }
    }

    @ObfuscatedName("f.z(IB)V")
    public static void method156(int arg0) {
        field1991 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2006 != null) {
            field1991 = 0;
            field1999 = arg0.getX();
            field2000 = arg0.getY();
            field2001 = class104.method528();
            if (arg0.isAltDown()) {
                field1998 = 4;
                field1992 = 4;
            } else if (arg0.isMetaDown()) {
                field1998 = 2;
                field1992 = 2;
            } else {
                field1998 = 1;
                field1992 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2006 != null) {
            field1991 = 0;
            field1992 = 0;
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
            field1991 = 0;
            field2004 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2006 != null) {
            field1991 = 0;
            field2004 = -1;
            field1994 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2006 != null) {
            field1991 = 0;
            field2004 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2006 != null) {
            field1991 = 0;
            field2004 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2006 != null) {
            field1992 = 0;
        }
    }
}
