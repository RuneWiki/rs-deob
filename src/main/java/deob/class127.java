package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dq")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dq.t")
    public static class127 field1998 = new class127();

    @ObfuscatedName("dq.s")
    public static volatile int field2008 = 0;

    @ObfuscatedName("dq.f")
    public static volatile int field1994 = 0;

    @ObfuscatedName("dq.e")
    public static volatile int field1995 = -1;

    @ObfuscatedName("dq.d")
    public static volatile int field1992 = -1;

    @ObfuscatedName("dq.n")
    public static int field2005 = 0;

    @ObfuscatedName("dq.v")
    public static int field1996 = 0;

    @ObfuscatedName("dq.z")
    public static int field1999 = 0;

    @ObfuscatedName("dq.j")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dq.u")
    public static volatile int field2001 = 0;

    @ObfuscatedName("dq.g")
    public static volatile int field2002 = 0;

    @ObfuscatedName("dq.a")
    public static volatile long field2003 = 0L;

    @ObfuscatedName("dq.c")
    public static int field2004 = 0;

    @ObfuscatedName("dq.w")
    public static int field1993 = 0;

    @ObfuscatedName("dq.l")
    public static int field2006 = 0;

    @ObfuscatedName("dq.q")
    public static long field2007 = 0L;

    @ObfuscatedName("client.t(Ljava/awt/Component;I)V")
    public static void method237(Component arg0) {
        arg0.addMouseListener(field1998);
        arg0.addMouseMotionListener(field1998);
        arg0.addFocusListener(field1998);
    }

    @ObfuscatedName("cp.s(Ljava/awt/Component;B)V")
    public static void method1743(Component arg0) {
        arg0.removeMouseListener(field1998);
        arg0.removeMouseMotionListener(field1998);
        arg0.removeFocusListener(field1998);
        field1994 = 0;
    }

    @ObfuscatedName("l.f(I)V")
    public static void method159() {
        if (field1998 != null) {
            class127 var0 = field1998;
            synchronized (field1998) {
                field1998 = null;
            }
        }
    }

    @ObfuscatedName("da.e(I)I")
    public static int method2342() {
        return ++field2008 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1998 != null) {
            field2008 = 0;
            field2001 = arg0.getX();
            field2002 = arg0.getY();
            field2003 = class103.method2037();
            if (arg0.isAltDown()) {
                field2000 = 4;
                field1994 = 4;
            } else if (arg0.isMetaDown()) {
                field2000 = 2;
                field1994 = 2;
            } else {
                field2000 = 1;
                field1994 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1998 != null) {
            field2008 = 0;
            field1994 = 0;
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
        if (field1998 != null) {
            field2008 = 0;
            field1995 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1998 != null) {
            field2008 = 0;
            field1995 = -1;
            field1992 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1998 != null) {
            field2008 = 0;
            field1995 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1998 != null) {
            field2008 = 0;
            field1995 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1998 != null) {
            field1994 = 0;
        }
    }
}
