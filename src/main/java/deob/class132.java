package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eh")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eh.n")
    public static class132 field2046 = new class132();

    @ObfuscatedName("eh.w")
    public static volatile int field2032 = 0;

    @ObfuscatedName("eh.i")
    public static volatile int field2033 = 0;

    @ObfuscatedName("eh.e")
    public static volatile int field2042 = -1;

    @ObfuscatedName("eh.h")
    public static volatile int field2035 = -1;

    @ObfuscatedName("eh.q")
    public static int field2036 = 0;

    @ObfuscatedName("eh.l")
    public static int field2037 = 0;

    @ObfuscatedName("eh.c")
    public static int field2038 = 0;

    @ObfuscatedName("eh.f")
    public static volatile int field2039 = 0;

    @ObfuscatedName("eh.s")
    public static volatile int field2040 = 0;

    @ObfuscatedName("eh.m")
    public static volatile int field2041 = 0;

    @ObfuscatedName("eh.y")
    public static volatile long field2051 = 0L;

    @ObfuscatedName("eh.b")
    public static int field2043 = 0;

    @ObfuscatedName("eh.v")
    public static int field2034 = 0;

    @ObfuscatedName("eh.z")
    public static int field2045 = 0;

    @ObfuscatedName("eh.u")
    public static long field2044 = 0L;

    @ObfuscatedName("ag.n(Ljava/awt/Component;I)V")
    public static void method673(Component arg0) {
        arg0.addMouseListener(field2046);
        arg0.addMouseMotionListener(field2046);
        arg0.addFocusListener(field2046);
    }

    @ObfuscatedName("df.w(II)V")
    public static void method2399(int arg0) {
        field2032 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2046 != null) {
            field2032 = 0;
            field2040 = arg0.getX();
            field2041 = arg0.getY();
            field2051 = class107.method2784();
            if (arg0.isAltDown()) {
                field2039 = 4;
                field2033 = 4;
            } else if (arg0.isMetaDown()) {
                field2039 = 2;
                field2033 = 2;
            } else {
                field2039 = 1;
                field2033 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2046 != null) {
            field2032 = 0;
            field2033 = 0;
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
        if (field2046 != null) {
            field2032 = 0;
            field2042 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2046 != null) {
            field2032 = 0;
            field2042 = -1;
            field2035 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2046 != null) {
            field2032 = 0;
            field2042 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2046 != null) {
            field2032 = 0;
            field2042 = arg0.getX();
            field2035 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2046 != null) {
            field2033 = 0;
        }
    }
}
