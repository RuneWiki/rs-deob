package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ef")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ef.p")
    public static class132 field2060 = new class132();

    @ObfuscatedName("ef.k")
    public static int field2050 = 0;

    @ObfuscatedName("ef.e")
    public static volatile int field2052 = 0;

    @ObfuscatedName("ef.f")
    public static volatile int field2047 = 0;

    @ObfuscatedName("ef.w")
    public static volatile int field2054 = -1;

    @ObfuscatedName("ef.t")
    public static volatile int field2045 = -1;

    @ObfuscatedName("ef.s")
    public static int field2049 = 0;

    @ObfuscatedName("ef.c")
    public static int field2051 = 0;

    @ObfuscatedName("ef.d")
    public static volatile int field2044 = 0;

    @ObfuscatedName("ef.v")
    public static volatile int field2053 = 0;

    @ObfuscatedName("ef.m")
    public static volatile int field2046 = 0;

    @ObfuscatedName("ef.h")
    public static volatile long field2055 = 0L;

    @ObfuscatedName("ef.n")
    public static int field2056 = 0;

    @ObfuscatedName("ef.x")
    public static int field2057 = 0;

    @ObfuscatedName("ef.o")
    public static int field2058 = 0;

    @ObfuscatedName("ef.r")
    public static long field2059 = 0L;

    @ObfuscatedName("dn.p(Ljava/awt/Component;B)V")
    public static void method2461(Component arg0) {
        arg0.removeMouseListener(field2060);
        arg0.removeMouseMotionListener(field2060);
        arg0.removeFocusListener(field2060);
        field2047 = 0;
    }

    @ObfuscatedName("ds.k(B)V")
    public static void method2473() {
        if (field2060 != null) {
            class132 var0 = field2060;
            synchronized (field2060) {
                field2060 = null;
            }
        }
    }

    @ObfuscatedName("gw.e(S)V")
    public static void method3559() {
        class132 var0 = field2060;
        synchronized (field2060) {
            field2049 = field2047;
            field2050 = field2054;
            field2051 = field2045;
            field2056 = field2044;
            field2057 = field2053;
            field2058 = field2046;
            field2059 = field2055;
            field2044 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2060 != null) {
            field2052 = 0;
            field2053 = arg0.getX();
            field2046 = arg0.getY();
            field2055 = class107.method579();
            if (arg0.isAltDown()) {
                field2044 = 4;
                field2047 = 4;
            } else if (arg0.isMetaDown()) {
                field2044 = 2;
                field2047 = 2;
            } else {
                field2044 = 1;
                field2047 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2060 != null) {
            field2052 = 0;
            field2047 = 0;
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
        if (field2060 != null) {
            field2052 = 0;
            field2054 = arg0.getX();
            field2045 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2060 != null) {
            field2052 = 0;
            field2054 = -1;
            field2045 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2060 != null) {
            field2052 = 0;
            field2054 = arg0.getX();
            field2045 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2060 != null) {
            field2052 = 0;
            field2054 = arg0.getX();
            field2045 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2060 != null) {
            field2047 = 0;
        }
    }
}
