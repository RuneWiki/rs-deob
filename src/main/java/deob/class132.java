package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ez")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ez.y")
    public static volatile int field2082 = 0;

    @ObfuscatedName("ez.k")
    public static int field2071 = 0;

    @ObfuscatedName("ez.g")
    public static class132 field2067 = new class132();

    @ObfuscatedName("ez.n")
    public static volatile int field2066 = 0;

    @ObfuscatedName("ez.t")
    public static volatile int field2073 = 0;

    @ObfuscatedName("ez.e")
    public static volatile int field2078 = -1;

    @ObfuscatedName("ez.q")
    public static volatile int field2065 = -1;

    @ObfuscatedName("ez.z")
    public static int field2070 = 0;

    @ObfuscatedName("ez.v")
    public static int field2072 = 0;

    @ObfuscatedName("ez.b")
    public static volatile int field2074 = 0;

    @ObfuscatedName("ez.f")
    public static volatile int field2069 = 0;

    @ObfuscatedName("ez.i")
    public static volatile long field2076 = 0L;

    @ObfuscatedName("ez.w")
    public static int field2068 = 0;

    @ObfuscatedName("ez.l")
    public static int field2077 = 0;

    @ObfuscatedName("ez.j")
    public static int field2079 = 0;

    @ObfuscatedName("ez.s")
    public static long field2080 = 0L;

    @ObfuscatedName("b.y(B)V")
    public static void method104() {
        if (field2067 != null) {
            class132 var0 = field2067;
            synchronized (field2067) {
                field2067 = null;
            }
        }
    }

    @ObfuscatedName("ey.k(II)V")
    public static void method2598(int arg0) {
        field2066 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2067 != null) {
            field2066 = 0;
            field2074 = arg0.getX();
            field2069 = arg0.getY();
            field2076 = class107.method78();
            if (arg0.isAltDown()) {
                field2082 = 4;
                field2073 = 4;
            } else if (arg0.isMetaDown()) {
                field2082 = 2;
                field2073 = 2;
            } else {
                field2082 = 1;
                field2073 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2067 != null) {
            field2066 = 0;
            field2073 = 0;
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
        if (field2067 != null) {
            field2066 = 0;
            field2078 = arg0.getX();
            field2065 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2067 != null) {
            field2066 = 0;
            field2078 = -1;
            field2065 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2067 != null) {
            field2066 = 0;
            field2078 = arg0.getX();
            field2065 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2067 != null) {
            field2066 = 0;
            field2078 = arg0.getX();
            field2065 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2067 != null) {
            field2073 = 0;
        }
    }
}
