package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dp")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dp.g")
    public static class127 field1994 = new class127();

    @ObfuscatedName("dp.s")
    public static volatile int field1986 = 0;

    @ObfuscatedName("dp.h")
    public static volatile int field1987 = 0;

    @ObfuscatedName("dp.m")
    public static volatile int field2000 = -1;

    @ObfuscatedName("dp.u")
    public static volatile int field1989 = -1;

    @ObfuscatedName("dp.j")
    public static int field1985 = 0;

    @ObfuscatedName("dp.b")
    public static int field1992 = 0;

    @ObfuscatedName("dp.v")
    public static int field1988 = 0;

    @ObfuscatedName("dp.y")
    public static volatile int field1993 = 0;

    @ObfuscatedName("dp.w")
    public static volatile int field1990 = 0;

    @ObfuscatedName("dp.x")
    public static volatile int field1995 = 0;

    @ObfuscatedName("dp.k")
    public static volatile long field1996 = 0L;

    @ObfuscatedName("dp.o")
    public static int field1997 = 0;

    @ObfuscatedName("dp.a")
    public static int field1998 = 0;

    @ObfuscatedName("dp.f")
    public static int field1999 = 0;

    @ObfuscatedName("dp.r")
    public static long field2003 = 0L;

    @ObfuscatedName("cc.g(Ljava/awt/Component;B)V")
    public static void method1859(Component arg0) {
        arg0.addMouseListener(field1994);
        arg0.addMouseMotionListener(field1994);
        arg0.addFocusListener(field1994);
    }

    @ObfuscatedName("e.s(II)V")
    public static void method177(int arg0) {
        field1986 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1994 != null) {
            field1986 = 0;
            field1990 = arg0.getX();
            field1995 = arg0.getY();
            field1996 = class103.method494();
            if (arg0.isAltDown()) {
                field1993 = 4;
                field1987 = 4;
            } else if (arg0.isMetaDown()) {
                field1993 = 2;
                field1987 = 2;
            } else {
                field1993 = 1;
                field1987 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1994 != null) {
            field1986 = 0;
            field1987 = 0;
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
            field1986 = 0;
            field2000 = arg0.getX();
            field1989 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1994 != null) {
            field1986 = 0;
            field2000 = -1;
            field1989 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1994 != null) {
            field1986 = 0;
            field2000 = arg0.getX();
            field1989 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1994 != null) {
            field1986 = 0;
            field2000 = arg0.getX();
            field1989 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1994 != null) {
            field1987 = 0;
        }
    }
}
