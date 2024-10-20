package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ed")
public class class131 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ed.b")
    public static class131 field2033 = new class131();

    @ObfuscatedName("ed.e")
    public static volatile int field2026 = 0;

    @ObfuscatedName("ed.i")
    public static volatile int field2037 = 0;

    @ObfuscatedName("ed.k")
    public static int field2022 = 0;

    @ObfuscatedName("ed.h")
    public static volatile int field2023 = -1;

    @ObfuscatedName("ed.p")
    public static volatile int field2024 = -1;

    @ObfuscatedName("ed.n")
    public static int field2025 = 0;

    @ObfuscatedName("ed.o")
    public static int field2036 = 0;

    @ObfuscatedName("ed.g")
    public static volatile int field2028 = 0;

    @ObfuscatedName("ed.z")
    public static volatile int field2029 = 0;

    @ObfuscatedName("ed.t")
    public static volatile int field2030 = 0;

    @ObfuscatedName("ed.y")
    public static volatile long field2027 = 0L;

    @ObfuscatedName("ed.w")
    public static int field2032 = 0;

    @ObfuscatedName("ed.x")
    public static int field2021 = 0;

    @ObfuscatedName("ed.v")
    public static int field2035 = 0;

    @ObfuscatedName("ed.q")
    public static long field2031 = 0L;

    @ObfuscatedName("dh.b(Ljava/awt/Component;S)V")
    public static void method2081(Component arg0) {
        arg0.addMouseListener(field2033);
        arg0.addMouseMotionListener(field2033);
        arg0.addFocusListener(field2033);
    }

    @ObfuscatedName("ca.e(Ljava/awt/Component;B)V")
    public static void method1958(Component arg0) {
        arg0.removeMouseListener(field2033);
        arg0.removeMouseMotionListener(field2033);
        arg0.removeFocusListener(field2033);
        field2037 = 0;
    }

    @ObfuscatedName("e.i(B)V")
    public static void method12() {
        if (field2033 != null) {
            class131 var0 = field2033;
            synchronized (field2033) {
                field2033 = null;
            }
        }
    }

    @ObfuscatedName("ax.k(I)V")
    public static void method843() {
        class131 var0 = field2033;
        synchronized (field2033) {
            field2025 = field2037;
            field2022 = field2023;
            field2036 = field2024 * 1497291507;
            field2032 = field2028;
            field2021 = field2029;
            field2035 = field2030;
            field2031 = field2027;
            field2028 = 0;
        }
    }

    @ObfuscatedName("c.h(II)V")
    public static void method486(int arg0) {
        field2026 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2033 != null) {
            field2026 = 0;
            field2029 = arg0.getX();
            field2030 = arg0.getY();
            field2027 = class106.method3592();
            if (arg0.isAltDown()) {
                field2028 = 4;
                field2037 = 4;
            } else if (arg0.isMetaDown()) {
                field2028 = 2;
                field2037 = 2;
            } else {
                field2028 = 1;
                field2037 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2033 != null) {
            field2026 = 0;
            field2037 = 0;
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
        if (field2033 != null) {
            field2026 = 0;
            field2023 = arg0.getX();
            field2024 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2033 != null) {
            field2026 = 0;
            field2023 = -1;
            field2024 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2033 != null) {
            field2026 = 0;
            field2023 = arg0.getX();
            field2024 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2033 != null) {
            field2026 = 0;
            field2023 = arg0.getX();
            field2024 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2033 != null) {
            field2037 = 0;
        }
    }
}
