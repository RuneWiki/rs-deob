package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dy")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dy.n")
    public static class127 field1995 = new class127();

    @ObfuscatedName("dy.x")
    public static int field1990 = 0;

    @ObfuscatedName("dy.k")
    public static int field1989 = 0;

    @ObfuscatedName("dy.i")
    public static volatile int field1991 = 0;

    @ObfuscatedName("dy.d")
    public static volatile int field1999 = 0;

    @ObfuscatedName("dy.q")
    public static volatile int field1986 = -1;

    @ObfuscatedName("dy.m")
    public static volatile int field1983 = -1;

    @ObfuscatedName("dy.a")
    public static int field1988 = 0;

    @ObfuscatedName("dy.w")
    public static volatile int field1987 = 0;

    @ObfuscatedName("dy.e")
    public static volatile int field1992 = 0;

    @ObfuscatedName("dy.o")
    public static volatile int field1993 = 0;

    @ObfuscatedName("dy.v")
    public static volatile long field1994 = 0L;

    @ObfuscatedName("dy.z")
    public static int field1998 = 0;

    @ObfuscatedName("dy.j")
    public static int field1996 = 0;

    @ObfuscatedName("dy.r")
    public static int field1997 = 0;

    @ObfuscatedName("dy.c")
    public static long field2000 = 0L;

    @ObfuscatedName("al.n(I)V")
    public static void method548() {
        if (field1995 != null) {
            class127 var0 = field1995;
            synchronized (field1995) {
                field1995 = null;
            }
        }
    }

    @ObfuscatedName("do.x(I)V")
    public static void method2392() {
        class127 var0 = field1995;
        synchronized (field1995) {
            field1988 = field1999;
            field1989 = field1986;
            field1990 = field1983;
            field1998 = field1987;
            field1996 = field1992;
            field1997 = field1993;
            field2000 = field1994;
            field1987 = 0;
        }
    }

    @ObfuscatedName("x.k(I)I")
    public static int method10() {
        return ++field1991 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1995 != null) {
            field1991 = 0;
            field1992 = arg0.getX();
            field1993 = arg0.getY();
            field1994 = class103.method1066();
            if (arg0.isAltDown()) {
                field1987 = 4;
                field1999 = 4;
            } else if (arg0.isMetaDown()) {
                field1987 = 2;
                field1999 = 2;
            } else {
                field1987 = 1;
                field1999 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1995 != null) {
            field1991 = 0;
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
        if (field1995 != null) {
            field1991 = 0;
            field1986 = arg0.getX();
            field1983 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1995 != null) {
            field1991 = 0;
            field1986 = -1;
            field1983 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1995 != null) {
            field1991 = 0;
            field1986 = arg0.getX();
            field1983 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1995 != null) {
            field1991 = 0;
            field1986 = arg0.getX();
            field1983 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1995 != null) {
            field1999 = 0;
        }
    }
}
