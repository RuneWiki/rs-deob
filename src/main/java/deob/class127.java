package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dh")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dh.g")
    public static class127 field2028 = new class127();

    @ObfuscatedName("dh.v")
    public static volatile int field2018 = 0;

    @ObfuscatedName("dh.z")
    public static volatile int field2019 = 0;

    @ObfuscatedName("dh.h")
    public static volatile int field2020 = -1;

    @ObfuscatedName("dh.k")
    public static int field2023 = 0;

    @ObfuscatedName("dh.l")
    public static volatile int field2030 = -1;

    @ObfuscatedName("dh.e")
    public static int field2022 = 0;

    @ObfuscatedName("dh.j")
    public static int field2017 = 0;

    @ObfuscatedName("dh.n")
    public static volatile int field2025 = 0;

    @ObfuscatedName("dh.f")
    public static volatile int field2026 = 0;

    @ObfuscatedName("dh.a")
    public static volatile int field2029 = 0;

    @ObfuscatedName("dh.i")
    public static volatile long field2021 = 0L;

    @ObfuscatedName("dh.y")
    public static int field2033 = 0;

    @ObfuscatedName("dh.p")
    public static int field2027 = 0;

    @ObfuscatedName("dh.q")
    public static int field2031 = 0;

    @ObfuscatedName("dh.t")
    public static long field2032 = 0L;

    @ObfuscatedName("ao.g(Ljava/awt/Component;B)V")
    public static void method719(Component arg0) {
        arg0.addMouseListener(field2028);
        arg0.addMouseMotionListener(field2028);
        arg0.addFocusListener(field2028);
    }

    @ObfuscatedName("a.v(Ljava/awt/Component;I)V")
    public static void method117(Component arg0) {
        arg0.removeMouseListener(field2028);
        arg0.removeMouseMotionListener(field2028);
        arg0.removeFocusListener(field2028);
        field2019 = 0;
    }

    @ObfuscatedName("f.z(I)V")
    public static void method110() {
        if (field2028 != null) {
            class127 var0 = field2028;
            synchronized (field2028) {
                field2028 = null;
            }
        }
    }

    @ObfuscatedName("aw.h(I)V")
    public static void method609() {
        class127 var0 = field2028;
        synchronized (field2028) {
            field2022 = field2019;
            field2023 = field2020;
            field2017 = field2030 * 1223939261;
            field2033 = field2025;
            field2027 = field2026;
            field2031 = field2029;
            field2032 = field2021;
            field2025 = 0;
        }
    }

    @ObfuscatedName("af.l(II)V")
    public static void method890(int arg0) {
        field2018 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2028 != null) {
            field2018 = 0;
            field2026 = arg0.getX();
            field2029 = arg0.getY();
            field2021 = class103.method19();
            if (arg0.isAltDown()) {
                field2025 = 4;
                field2019 = 4;
            } else if (arg0.isMetaDown()) {
                field2025 = 2;
                field2019 = 2;
            } else {
                field2025 = 1;
                field2019 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2028 != null) {
            field2018 = 0;
            field2019 = 0;
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
        if (field2028 != null) {
            field2018 = 0;
            field2020 = arg0.getX();
            field2030 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2028 != null) {
            field2018 = 0;
            field2020 = -1;
            field2030 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2028 != null) {
            field2018 = 0;
            field2020 = arg0.getX();
            field2030 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2028 != null) {
            field2018 = 0;
            field2020 = arg0.getX();
            field2030 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2028 != null) {
            field2019 = 0;
        }
    }
}
