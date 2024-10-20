package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ek")
public class class132 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ek.n")
    public static class132 field2068 = new class132();

    @ObfuscatedName("ek.d")
    public static volatile int field2055 = 0;

    @ObfuscatedName("ek.z")
    public static volatile int field2057 = 0;

    @ObfuscatedName("ek.y")
    public static volatile int field2070 = 0;

    @ObfuscatedName("ek.e")
    public static volatile int field2058 = -1;

    @ObfuscatedName("ek.g")
    public static volatile int field2059 = -1;

    @ObfuscatedName("ek.f")
    public static int field2060 = 0;

    @ObfuscatedName("ek.m")
    public static int field2061 = 0;

    @ObfuscatedName("ek.a")
    public static int field2062 = 0;

    @ObfuscatedName("ek.h")
    public static volatile int field2064 = 0;

    @ObfuscatedName("ek.l")
    public static volatile int field2065 = 0;

    @ObfuscatedName("ek.u")
    public static volatile long field2066 = 0L;

    @ObfuscatedName("ek.q")
    public static int field2067 = 0;

    @ObfuscatedName("ek.k")
    public static int field2069 = 0;

    @ObfuscatedName("ek.x")
    public static int field2063 = 0;

    @ObfuscatedName("ek.r")
    public static long field2056 = 0L;

    @ObfuscatedName("dc.n(Ljava/awt/Component;B)V")
    public static void method2504(Component arg0) {
        arg0.removeMouseListener(field2068);
        arg0.removeMouseMotionListener(field2068);
        arg0.removeFocusListener(field2068);
        field2057 = 0;
    }

    @ObfuscatedName("df.z(I)I")
    public static int method2516() {
        return ++field2055 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2068 != null) {
            field2055 = 0;
            field2064 = arg0.getX();
            field2065 = arg0.getY();
            field2066 = class107.method1670();
            if (arg0.isAltDown()) {
                field2070 = 4;
                field2057 = 4;
            } else if (arg0.isMetaDown()) {
                field2070 = 2;
                field2057 = 2;
            } else {
                field2070 = 1;
                field2057 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2068 != null) {
            field2055 = 0;
            field2057 = 0;
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
        if (field2068 != null) {
            field2055 = 0;
            field2058 = arg0.getX();
            field2059 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2068 != null) {
            field2055 = 0;
            field2058 = -1;
            field2059 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2068 != null) {
            field2055 = 0;
            field2058 = arg0.getX();
            field2059 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2068 != null) {
            field2055 = 0;
            field2058 = arg0.getX();
            field2059 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2068 != null) {
            field2057 = 0;
        }
    }
}
