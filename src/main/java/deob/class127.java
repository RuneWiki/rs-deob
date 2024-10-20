package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dm")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dm.p")
    public static class127 field1994 = new class127();

    @ObfuscatedName("dm.g")
    public static volatile int field1996 = 0;

    @ObfuscatedName("dm.x")
    public static int field1995 = 0;

    @ObfuscatedName("dm.c")
    public static volatile int field1998 = 0;

    @ObfuscatedName("dm.n")
    public static volatile int field1991 = -1;

    @ObfuscatedName("dm.s")
    public static volatile int field1992 = -1;

    @ObfuscatedName("dm.r")
    public static int field2001 = 0;

    @ObfuscatedName("dm.w")
    public static int field1990 = 0;

    @ObfuscatedName("dm.u")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dm.d")
    public static volatile int field1997 = 0;

    @ObfuscatedName("dm.h")
    public static volatile int field1989 = 0;

    @ObfuscatedName("dm.a")
    public static volatile long field1999 = 0L;

    @ObfuscatedName("dm.y")
    public static int field2003 = 0;

    @ObfuscatedName("dm.v")
    public static int field1988 = 0;

    @ObfuscatedName("dm.e")
    public static int field2002 = 0;

    @ObfuscatedName("dm.b")
    public static long field1993 = 0L;

    @ObfuscatedName("cy.p(Ljava/awt/Component;I)V")
    public static void method2100(Component arg0) {
        arg0.addMouseListener(field1994);
        arg0.addMouseMotionListener(field1994);
        arg0.addFocusListener(field1994);
    }

    @ObfuscatedName("aj.g(I)V")
    public static void method696() {
        if (field1994 != null) {
            class127 var0 = field1994;
            synchronized (field1994) {
                field1994 = null;
            }
        }
    }

    @ObfuscatedName("an.x(I)V")
    public static void method553() {
        class127 var0 = field1994;
        synchronized (field1994) {
            field2001 = field1998;
            field1990 = field1991;
            field1995 = field1992;
            field2003 = field2000;
            field1988 = field1997;
            field2002 = field1989;
            field1993 = field1999;
            field2000 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1994 != null) {
            field1996 = 0;
            field1997 = arg0.getX();
            field1989 = arg0.getY();
            field1999 = class103.method550();
            if (arg0.isAltDown()) {
                field2000 = 4;
                field1998 = 4;
            } else if (arg0.isMetaDown()) {
                field2000 = 2;
                field1998 = 2;
            } else {
                field2000 = 1;
                field1998 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1994 != null) {
            field1996 = 0;
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
        if (field1994 != null) {
            field1996 = 0;
            field1991 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1994 != null) {
            field1996 = 0;
            field1991 = -1;
            field1992 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1994 != null) {
            field1996 = 0;
            field1991 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1994 != null) {
            field1996 = 0;
            field1991 = arg0.getX();
            field1992 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1994 != null) {
            field1998 = 0;
        }
    }
}
