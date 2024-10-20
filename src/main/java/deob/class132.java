package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ea")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ea.n")
    public static class132 field2053 = new class132();

    @ObfuscatedName("ea.o")
    public static volatile int field2044 = 0;

    @ObfuscatedName("ea.a")
    public static volatile int field2054 = 0;

    @ObfuscatedName("ea.w")
    public static volatile int field2046 = -1;

    @ObfuscatedName("ea.m")
    public static volatile int field2047 = -1;

    @ObfuscatedName("ea.h")
    public static int field2048 = 0;

    @ObfuscatedName("ea.i")
    public static int field2049 = 0;

    @ObfuscatedName("ea.r")
    public static int field2050 = 0;

    @ObfuscatedName("ea.l")
    public static volatile int field2051 = 0;

    @ObfuscatedName("ea.f")
    public static volatile int field2052 = 0;

    @ObfuscatedName("ea.e")
    public static volatile int field2045 = 0;

    @ObfuscatedName("ea.z")
    public static volatile long field2056 = 0L;

    @ObfuscatedName("ea.v")
    public static int field2055 = 0;

    @ObfuscatedName("ea.x")
    public static int field2043 = 0;

    @ObfuscatedName("ea.q")
    public static int field2057 = 0;

    @ObfuscatedName("ea.b")
    public static long field2058 = 0L;

    @ObfuscatedName("ee.n(I)I")
    public static int method2704() {
        return ++field2044 - 1;
    }

    @ObfuscatedName("dq.o(II)V")
    public static void method2655(int arg0) {
        field2044 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2053 != null) {
            field2044 = 0;
            field2052 = arg0.getX();
            field2045 = arg0.getY();
            field2056 = class107.method1430();
            if (arg0.isAltDown()) {
                field2051 = 4;
                field2054 = 4;
            } else if (arg0.isMetaDown()) {
                field2051 = 2;
                field2054 = 2;
            } else {
                field2051 = 1;
                field2054 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2053 != null) {
            field2044 = 0;
            field2054 = 0;
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
        if (field2053 != null) {
            field2044 = 0;
            field2046 = arg0.getX();
            field2047 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2053 != null) {
            field2044 = 0;
            field2046 = -1;
            field2047 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2053 != null) {
            field2044 = 0;
            field2046 = arg0.getX();
            field2047 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2053 != null) {
            field2044 = 0;
            field2046 = arg0.getX();
            field2047 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2053 != null) {
            field2054 = 0;
        }
    }
}
