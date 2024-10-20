package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dq")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dq.e")
    public static class127 field2004 = new class127();

    @ObfuscatedName("dq.v")
    public static volatile int field1991 = 0;

    @ObfuscatedName("dq.i")
    public static volatile int field1992 = 0;

    @ObfuscatedName("dq.g")
    public static volatile int field1990 = -1;

    @ObfuscatedName("dq.x")
    public static int field1997 = 0;

    @ObfuscatedName("dq.b")
    public static volatile int field1994 = -1;

    @ObfuscatedName("dq.q")
    public static int field1995 = 0;

    @ObfuscatedName("dq.l")
    public static int field2007 = 0;

    @ObfuscatedName("dq.m")
    public static volatile int field2008 = 0;

    @ObfuscatedName("dq.u")
    public static volatile int field1999 = 0;

    @ObfuscatedName("dq.s")
    public static volatile int field1993 = 0;

    @ObfuscatedName("dq.f")
    public static volatile long field1998 = 0L;

    @ObfuscatedName("dq.p")
    public static int field2002 = 0;

    @ObfuscatedName("dq.w")
    public static int field2003 = 0;

    @ObfuscatedName("dq.y")
    public static int field2005 = 0;

    @ObfuscatedName("dq.h")
    public static long field1996 = 0L;

    @ObfuscatedName("fz.e(Ljava/awt/Component;S)V")
    public static void method3073(Component arg0) {
        arg0.addMouseListener(field2004);
        arg0.addMouseMotionListener(field2004);
        arg0.addFocusListener(field2004);
    }

    @ObfuscatedName("at.v(Ljava/awt/Component;I)V")
    public static void method753(Component arg0) {
        arg0.removeMouseListener(field2004);
        arg0.removeMouseMotionListener(field2004);
        arg0.removeFocusListener(field2004);
        field1992 = 0;
    }

    @ObfuscatedName("s.i(S)V")
    public static void method130() {
        if (field2004 != null) {
            class127 var0 = field2004;
            synchronized (field2004) {
                field2004 = null;
            }
        }
    }

    @ObfuscatedName("g.g(IS)V")
    public static void method30(int arg0) {
        field1991 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1999 = arg0.getX();
            field1993 = arg0.getY();
            field1998 = class103.method1957();
            if (arg0.isAltDown()) {
                field2008 = 4;
                field1992 = 4;
            } else if (arg0.isMetaDown()) {
                field2008 = 2;
                field1992 = 2;
            } else {
                field2008 = 1;
                field1992 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2004 != null) {
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
        if (field2004 != null) {
            field1991 = 0;
            field1990 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1990 = -1;
            field1994 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1990 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1990 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2004 != null) {
            field1992 = 0;
        }
    }
}
