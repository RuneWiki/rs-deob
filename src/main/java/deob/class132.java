package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eb")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eb.n")
    public static class132 field2058 = new class132();

    @ObfuscatedName("eb.g")
    public static volatile int field2054 = 0;

    @ObfuscatedName("eb.a")
    public static volatile int field2055 = 0;

    @ObfuscatedName("eb.m")
    public static volatile int field2056 = -1;

    @ObfuscatedName("eb.s")
    public static volatile int field2057 = -1;

    @ObfuscatedName("eb.j")
    public static int field2062 = 0;

    @ObfuscatedName("eb.f")
    public static int field2070 = 0;

    @ObfuscatedName("eb.b")
    public static int field2067 = 0;

    @ObfuscatedName("eb.t")
    public static volatile int field2061 = 0;

    @ObfuscatedName("eb.i")
    public static volatile int field2059 = 0;

    @ObfuscatedName("eb.c")
    public static volatile int field2063 = 0;

    @ObfuscatedName("eb.k")
    public static volatile long field2064 = 0L;

    @ObfuscatedName("eb.x")
    public static int field2065 = 0;

    @ObfuscatedName("eb.e")
    public static int field2066 = 0;

    @ObfuscatedName("eb.q")
    public static int field2060 = 0;

    @ObfuscatedName("eb.o")
    public static long field2068 = 0L;

    @ObfuscatedName("dn.n(Ljava/awt/Component;I)V")
    public static void method2155(Component arg0) {
        arg0.removeMouseListener(field2058);
        arg0.removeMouseMotionListener(field2058);
        arg0.removeFocusListener(field2058);
        field2055 = 0;
    }

    @ObfuscatedName("de.g(I)I")
    public static int method2163() {
        return ++field2054 - 1;
    }

    @ObfuscatedName("aq.a(II)V")
    public static void method566(int arg0) {
        field2054 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2058 != null) {
            field2054 = 0;
            field2059 = arg0.getX();
            field2063 = arg0.getY();
            field2064 = class107.method3364();
            if (arg0.isAltDown()) {
                field2061 = 4;
                field2055 = 4;
            } else if (arg0.isMetaDown()) {
                field2061 = 2;
                field2055 = 2;
            } else {
                field2061 = 1;
                field2055 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2058 != null) {
            field2054 = 0;
            field2055 = 0;
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
        if (field2058 != null) {
            field2054 = 0;
            field2056 = arg0.getX();
            field2057 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2058 != null) {
            field2054 = 0;
            field2056 = -1;
            field2057 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2058 != null) {
            field2054 = 0;
            field2056 = arg0.getX();
            field2057 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2058 != null) {
            field2054 = 0;
            field2056 = arg0.getX();
            field2057 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2058 != null) {
            field2055 = 0;
        }
    }
}
