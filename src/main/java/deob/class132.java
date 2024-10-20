package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("em")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("em.t")
    public static class132 field2024 = new class132();

    @ObfuscatedName("em.b")
    public static volatile int field2021 = 0;

    @ObfuscatedName("em.p")
    public static volatile int field2023 = 0;

    @ObfuscatedName("em.e")
    public static volatile int field2032 = -1;

    @ObfuscatedName("em.i")
    public static volatile int field2022 = -1;

    @ObfuscatedName("em.o")
    public static int field2026 = 0;

    @ObfuscatedName("em.f")
    public static int field2027 = 0;

    @ObfuscatedName("em.d")
    public static int field2038 = 0;

    @ObfuscatedName("em.j")
    public static volatile int field2025 = 0;

    @ObfuscatedName("em.x")
    public static volatile int field2030 = 0;

    @ObfuscatedName("em.v")
    public static volatile int field2031 = 0;

    @ObfuscatedName("em.a")
    public static volatile long field2037 = 0L;

    @ObfuscatedName("em.l")
    public static int field2033 = 0;

    @ObfuscatedName("em.h")
    public static int field2034 = 0;

    @ObfuscatedName("em.c")
    public static int field2035 = 0;

    @ObfuscatedName("em.u")
    public static long field2036 = 0L;

    @ObfuscatedName("ci.b(B)V")
    public static void method1925() {
        if (field2024 != null) {
            class132 var0 = field2024;
            synchronized (field2024) {
                field2024 = null;
            }
        }
    }

    @ObfuscatedName("dc.p(B)V")
    public static void method2195() {
        class132 var0 = field2024;
        synchronized (field2024) {
            field2026 = field2023;
            field2027 = field2032;
            field2038 = field2022;
            field2033 = field2025;
            field2034 = field2030;
            field2035 = field2031;
            field2036 = field2037;
            field2025 = 0;
        }
    }

    @ObfuscatedName("bo.e(B)I")
    public static int method1403() {
        return ++field2021 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2024 != null) {
            field2021 = 0;
            field2030 = arg0.getX();
            field2031 = arg0.getY();
            field2037 = class107.method591();
            if (arg0.isAltDown()) {
                field2025 = 4;
                field2023 = 4;
            } else if (arg0.isMetaDown()) {
                field2025 = 2;
                field2023 = 2;
            } else {
                field2025 = 1;
                field2023 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2024 != null) {
            field2021 = 0;
            field2023 = 0;
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
        if (field2024 != null) {
            field2021 = 0;
            field2032 = arg0.getX();
            field2022 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2024 != null) {
            field2021 = 0;
            field2032 = -1;
            field2022 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2024 != null) {
            field2021 = 0;
            field2032 = arg0.getX();
            field2022 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2024 != null) {
            field2021 = 0;
            field2032 = arg0.getX();
            field2022 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2024 != null) {
            field2023 = 0;
        }
    }
}
