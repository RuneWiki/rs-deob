package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dj")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dj.g")
    public static class127 field2037 = new class127();

    @ObfuscatedName("dj.s")
    public static volatile int field2023 = 0;

    @ObfuscatedName("dj.v")
    public static volatile int field2024 = 0;

    @ObfuscatedName("dj.o")
    public static volatile int field2027 = -1;

    @ObfuscatedName("dj.k")
    public static int field2035 = 0;

    @ObfuscatedName("dj.m")
    public static volatile int field2026 = -1;

    @ObfuscatedName("dj.i")
    public static int field2022 = 0;

    @ObfuscatedName("dj.t")
    public static int field2029 = 0;

    @ObfuscatedName("dj.l")
    public static volatile int field2030 = 0;

    @ObfuscatedName("dj.p")
    public static volatile int field2031 = 0;

    @ObfuscatedName("dj.r")
    public static volatile int field2032 = 0;

    @ObfuscatedName("dj.j")
    public static volatile long field2033 = 0L;

    @ObfuscatedName("dj.c")
    public static int field2034 = 0;

    @ObfuscatedName("dj.q")
    public static int field2028 = 0;

    @ObfuscatedName("dj.n")
    public static int field2036 = 0;

    @ObfuscatedName("dj.h")
    public static long field2025 = 0L;

    @ObfuscatedName("r.g(Ljava/awt/Component;B)V")
    public static void method122(Component arg0) {
        arg0.addMouseListener(field2037);
        arg0.addMouseMotionListener(field2037);
        arg0.addFocusListener(field2037);
    }

    @ObfuscatedName("cw.s(Ljava/awt/Component;B)V")
    public static void method1839(Component arg0) {
        arg0.removeMouseListener(field2037);
        arg0.removeMouseMotionListener(field2037);
        arg0.removeFocusListener(field2037);
        field2024 = 0;
    }

    @ObfuscatedName("c.v(S)V")
    public static void method134() {
        if (field2037 != null) {
            class127 var0 = field2037;
            synchronized (field2037) {
                field2037 = null;
            }
        }
    }

    @ObfuscatedName("eu.o(IB)V")
    public static void method2836(int arg0) {
        field2023 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2037 != null) {
            field2023 = 0;
            field2031 = arg0.getX();
            field2032 = arg0.getY();
            field2033 = class103.method1837();
            if (arg0.isAltDown()) {
                field2030 = 4;
                field2024 = 4;
            } else if (arg0.isMetaDown()) {
                field2030 = 2;
                field2024 = 2;
            } else {
                field2030 = 1;
                field2024 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2037 != null) {
            field2023 = 0;
            field2024 = 0;
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
        if (field2037 != null) {
            field2023 = 0;
            field2027 = arg0.getX();
            field2026 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2037 != null) {
            field2023 = 0;
            field2027 = -1;
            field2026 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2037 != null) {
            field2023 = 0;
            field2027 = arg0.getX();
            field2026 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2037 != null) {
            field2023 = 0;
            field2027 = arg0.getX();
            field2026 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2037 != null) {
            field2024 = 0;
        }
    }
}
