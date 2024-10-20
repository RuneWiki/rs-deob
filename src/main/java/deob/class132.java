package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ez")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ez.b")
    public static class132 field2062 = new class132();

    @ObfuscatedName("ez.e")
    public static volatile int field2047 = 0;

    @ObfuscatedName("ez.a")
    public static volatile int field2049 = 0;

    @ObfuscatedName("ez.k")
    public static int field2053 = 0;

    @ObfuscatedName("ez.p")
    public static volatile int field2050 = -1;

    @ObfuscatedName("ez.l")
    public static volatile int field2051 = -1;

    @ObfuscatedName("ez.u")
    public static int field2065 = 0;

    @ObfuscatedName("ez.o")
    public static int field2054 = 0;

    @ObfuscatedName("ez.m")
    public static volatile int field2055 = 0;

    @ObfuscatedName("ez.q")
    public static volatile int field2056 = 0;

    @ObfuscatedName("ez.v")
    public static volatile int field2057 = 0;

    @ObfuscatedName("ez.n")
    public static volatile long field2058 = 0L;

    @ObfuscatedName("ez.z")
    public static int field2059 = 0;

    @ObfuscatedName("ez.r")
    public static int field2060 = 0;

    @ObfuscatedName("ez.i")
    public static int field2048 = 0;

    @ObfuscatedName("ez.s")
    public static long field2052 = 0L;

    @ObfuscatedName("hm.b(II)V")
    public static void method3485(int arg0) {
        field2047 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2062 != null) {
            field2047 = 0;
            field2056 = arg0.getX();
            field2057 = arg0.getY();
            field2058 = class107.method3468();
            if (arg0.isAltDown()) {
                field2055 = 4;
                field2049 = 4;
            } else if (arg0.isMetaDown()) {
                field2055 = 2;
                field2049 = 2;
            } else {
                field2055 = 1;
                field2049 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2062 != null) {
            field2047 = 0;
            field2049 = 0;
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
        if (field2062 != null) {
            field2047 = 0;
            field2050 = arg0.getX();
            field2051 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2062 != null) {
            field2047 = 0;
            field2050 = -1;
            field2051 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2062 != null) {
            field2047 = 0;
            field2050 = arg0.getX();
            field2051 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2062 != null) {
            field2047 = 0;
            field2050 = arg0.getX();
            field2051 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2062 != null) {
            field2049 = 0;
        }
    }
}
