package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("do")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("do.c")
    public static class129 field1993 = new class129();

    @ObfuscatedName("do.j")
    public static volatile int field1990 = 0;

    @ObfuscatedName("do.y")
    public static volatile int field1994 = 0;

    @ObfuscatedName("do.r")
    public static volatile int field2002 = 0;

    @ObfuscatedName("do.f")
    public static volatile int field1989 = -1;

    @ObfuscatedName("do.l")
    public static volatile int field1998 = -1;

    @ObfuscatedName("do.b")
    public static int field1991 = 0;

    @ObfuscatedName("do.k")
    public static int field1987 = 0;

    @ObfuscatedName("do.g")
    public static int field1988 = 0;

    @ObfuscatedName("do.v")
    public static volatile int field1995 = 0;

    @ObfuscatedName("do.i")
    public static volatile int field1996 = 0;

    @ObfuscatedName("do.x")
    public static volatile long field1997 = 0L;

    @ObfuscatedName("do.h")
    public static int field1986 = 0;

    @ObfuscatedName("do.w")
    public static int field1999 = 0;

    @ObfuscatedName("do.s")
    public static int field2000 = 0;

    @ObfuscatedName("do.p")
    public static long field2001 = 0L;

    @ObfuscatedName("f.c(Ljava/awt/Component;B)V")
    public static void method27(Component arg0) {
        arg0.addMouseListener(field1993);
        arg0.addMouseMotionListener(field1993);
        arg0.addFocusListener(field1993);
    }

    @ObfuscatedName("am.y(B)I")
    public static int method791() {
        return ++field1990 - 1;
    }

    @ObfuscatedName("bu.r(IS)V")
    public static void method1310(int arg0) {
        field1990 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1993 != null) {
            field1990 = 0;
            field1995 = arg0.getX();
            field1996 = arg0.getY();
            field1997 = class104.method1388();
            if (arg0.isAltDown()) {
                field1994 = 4;
                field2002 = 4;
            } else if (arg0.isMetaDown()) {
                field1994 = 2;
                field2002 = 2;
            } else {
                field1994 = 1;
                field2002 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1993 != null) {
            field1990 = 0;
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
        if (field1993 != null) {
            field1990 = 0;
            field1989 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1993 != null) {
            field1990 = 0;
            field1989 = -1;
            field1998 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1993 != null) {
            field1990 = 0;
            field1989 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1993 != null) {
            field1990 = 0;
            field1989 = arg0.getX();
            field1998 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1993 != null) {
            field2002 = 0;
        }
    }
}
