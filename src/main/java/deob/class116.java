package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dm")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dm.n")
    public static class116 field1800 = new class116();

    @ObfuscatedName("dm.d")
    public static volatile int field1806 = 0;

    @ObfuscatedName("dm.m")
    public static volatile int field1799 = 0;

    @ObfuscatedName("dm.h")
    public static volatile int field1808 = -1;

    @ObfuscatedName("dm.w")
    public static volatile int field1801 = -1;

    @ObfuscatedName("dm.r")
    public static int field1802 = 0;

    @ObfuscatedName("dm.c")
    public static int field1812 = 0;

    @ObfuscatedName("dm.p")
    public static int field1811 = 0;

    @ObfuscatedName("dm.g")
    public static volatile int field1805 = 0;

    @ObfuscatedName("dm.z")
    public static volatile int field1803 = 0;

    @ObfuscatedName("dm.q")
    public static volatile int field1804 = 0;

    @ObfuscatedName("dm.l")
    public static volatile long field1798 = 0L;

    @ObfuscatedName("dm.y")
    public static int field1809 = 0;

    @ObfuscatedName("dm.e")
    public static int field1810 = 0;

    @ObfuscatedName("dm.x")
    public static int field1807 = 0;

    @ObfuscatedName("dm.f")
    public static long field1797 = 0L;

    @ObfuscatedName("n.n(Ljava/awt/Component;I)V")
    public static void method12(Component arg0) {
        arg0.addMouseListener(field1800);
        arg0.addMouseMotionListener(field1800);
        arg0.addFocusListener(field1800);
    }

    @ObfuscatedName("q.d(Ljava/awt/Component;I)V")
    public static void method120(Component arg0) {
        arg0.removeMouseListener(field1800);
        arg0.removeMouseMotionListener(field1800);
        arg0.removeFocusListener(field1800);
        field1799 = 0;
    }

    @ObfuscatedName("cm.m(B)V")
    public static void method1837() {
        if (field1800 != null) {
            class116 var0 = field1800;
            synchronized (field1800) {
                field1800 = null;
            }
        }
    }

    @ObfuscatedName("ag.h(I)V")
    public static void method721() {
        class116 var0 = field1800;
        synchronized (field1800) {
            field1802 = field1799;
            field1812 = field1808;
            field1811 = field1801 * 1256376163;
            field1809 = field1805;
            field1810 = field1803;
            field1807 = field1804;
            field1797 = field1798;
            field1805 = 0;
        }
    }

    @ObfuscatedName("x.w(B)I")
    public static int method190() {
        return ++field1806 - 1;
    }

    @ObfuscatedName("av.r(IB)V")
    public static void method616(int arg0) {
        field1806 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1800 != null) {
            field1806 = 0;
            field1803 = arg0.getX();
            field1804 = arg0.getY();
            field1798 = class163.method3594();
            if (arg0.isAltDown()) {
                field1805 = 4;
                field1799 = 4;
            } else if (arg0.isMetaDown()) {
                field1805 = 2;
                field1799 = 2;
            } else {
                field1805 = 1;
                field1799 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1800 != null) {
            field1806 = 0;
            field1799 = 0;
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
        if (field1800 != null) {
            field1806 = 0;
            field1808 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1800 != null) {
            field1806 = 0;
            field1808 = -1;
            field1801 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1800 != null) {
            field1806 = 0;
            field1808 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1800 != null) {
            field1806 = 0;
            field1808 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1800 != null) {
            field1799 = 0;
        }
    }
}
