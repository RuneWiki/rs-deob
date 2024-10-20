package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("et")
public class class131 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("et.a")
    public static class131 field2042 = new class131();

    @ObfuscatedName("et.v")
    public static volatile int field2025 = 0;

    @ObfuscatedName("et.i")
    public static volatile int field2043 = 0;

    @ObfuscatedName("et.b")
    public static volatile int field2027 = -1;

    @ObfuscatedName("et.l")
    public static volatile int field2028 = -1;

    @ObfuscatedName("et.m")
    public static int field2029 = 0;

    @ObfuscatedName("et.w")
    public static int field2030 = 0;

    @ObfuscatedName("et.e")
    public static int field2031 = 0;

    @ObfuscatedName("et.n")
    public static volatile int field2032 = 0;

    @ObfuscatedName("et.s")
    public static volatile int field2033 = 0;

    @ObfuscatedName("et.k")
    public static volatile int field2038 = 0;

    @ObfuscatedName("et.f")
    public static volatile long field2035 = 0L;

    @ObfuscatedName("et.d")
    public static int field2036 = 0;

    @ObfuscatedName("et.x")
    public static int field2024 = 0;

    @ObfuscatedName("et.o")
    public static int field2026 = 0;

    @ObfuscatedName("et.q")
    public static long field2039 = 0L;

    @ObfuscatedName("ao.a(Ljava/awt/Component;I)V")
    public static void method813(Component arg0) {
        arg0.addMouseListener(field2042);
        arg0.addMouseMotionListener(field2042);
        arg0.addFocusListener(field2042);
    }

    @ObfuscatedName("cv.v(I)V")
    public static void method1964() {
        class131 var0 = field2042;
        synchronized (field2042) {
            field2029 = field2043;
            field2030 = field2027;
            field2031 = field2028 * -1441954017;
            field2036 = field2032;
            field2024 = field2033;
            field2026 = field2038;
            field2039 = field2035;
            field2032 = 0;
        }
    }

    @ObfuscatedName("cu.i(I)I")
    public static int method2058() {
        return ++field2025 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2042 != null) {
            field2025 = 0;
            field2033 = arg0.getX();
            field2038 = arg0.getY();
            field2035 = class106.method2471();
            if (arg0.isAltDown()) {
                field2032 = 4;
                field2043 = 4;
            } else if (arg0.isMetaDown()) {
                field2032 = 2;
                field2043 = 2;
            } else {
                field2032 = 1;
                field2043 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2042 != null) {
            field2025 = 0;
            field2043 = 0;
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
        if (field2042 != null) {
            field2025 = 0;
            field2027 = arg0.getX();
            field2028 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2042 != null) {
            field2025 = 0;
            field2027 = -1;
            field2028 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2042 != null) {
            field2025 = 0;
            field2027 = arg0.getX();
            field2028 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2042 != null) {
            field2025 = 0;
            field2027 = arg0.getX();
            field2028 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2042 != null) {
            field2043 = 0;
        }
    }
}
