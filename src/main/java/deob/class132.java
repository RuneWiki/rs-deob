package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eo")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eo.o")
    public static class132 field2043 = new class132();

    @ObfuscatedName("eo.l")
    public static volatile int field2037 = 0;

    @ObfuscatedName("eo.g")
    public static volatile int field2051 = 0;

    @ObfuscatedName("eo.u")
    public static volatile int field2038 = -1;

    @ObfuscatedName("eo.q")
    public static volatile int field2035 = -1;

    @ObfuscatedName("eo.r")
    public static int field2040 = 0;

    @ObfuscatedName("eo.v")
    public static int field2041 = 0;

    @ObfuscatedName("eo.y")
    public static volatile int field2048 = 0;

    @ObfuscatedName("eo.k")
    public static int field2050 = 0;

    @ObfuscatedName("eo.c")
    public static volatile int field2042 = 0;

    @ObfuscatedName("eo.j")
    public static volatile int field2045 = 0;

    @ObfuscatedName("eo.m")
    public static volatile long field2046 = 0L;

    @ObfuscatedName("eo.a")
    public static int field2047 = 0;

    @ObfuscatedName("eo.f")
    public static int field2049 = 0;

    @ObfuscatedName("eo.i")
    public static int field2055 = 0;

    @ObfuscatedName("eo.n")
    public static long field2039 = 0L;

    @ObfuscatedName("dx.o(Ljava/awt/Component;I)V")
    public static void method2533(Component arg0) {
        arg0.removeMouseListener(field2043);
        arg0.removeMouseMotionListener(field2043);
        arg0.removeFocusListener(field2043);
        field2051 = 0;
    }

    @ObfuscatedName("dx.l(I)V")
    public static void method2527() {
        class132 var0 = field2043;
        synchronized (field2043) {
            field2040 = field2051;
            field2041 = field2038;
            field2050 = field2035;
            field2047 = field2048;
            field2049 = field2042;
            field2055 = field2045;
            field2039 = field2046;
            field2048 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2043 != null) {
            field2037 = 0;
            field2042 = arg0.getX();
            field2045 = arg0.getY();
            field2046 = class107.method2661();
            if (arg0.isAltDown()) {
                field2048 = 4;
                field2051 = 4;
            } else if (arg0.isMetaDown()) {
                field2048 = 2;
                field2051 = 2;
            } else {
                field2048 = 1;
                field2051 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2043 != null) {
            field2037 = 0;
            field2051 = 0;
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
        if (field2043 != null) {
            field2037 = 0;
            field2038 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2043 != null) {
            field2037 = 0;
            field2038 = -1;
            field2035 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2043 != null) {
            field2037 = 0;
            field2038 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2043 != null) {
            field2037 = 0;
            field2038 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2043 != null) {
            field2051 = 0;
        }
    }
}
