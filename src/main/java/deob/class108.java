package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bz")
public class class108 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bz.f")
    public static int field1802 = 0;

    @ObfuscatedName("bz.g")
    public static volatile long field1796 = 0L;

    @ObfuscatedName("bz.d")
    public static volatile int field1795 = -1;

    @ObfuscatedName("bz.e")
    public static int field1808 = 0;

    @ObfuscatedName("bz.b")
    public static class108 field1799 = new class108();

    @ObfuscatedName("bz.o")
    public static int field1807 = 0;

    @ObfuscatedName("bz.l")
    public static int field1800 = 0;

    @ObfuscatedName("bz.j")
    public static volatile int field1804 = 0;

    @ObfuscatedName("bz.k")
    public static int field1801 = 0;

    @ObfuscatedName("bz.h")
    public static volatile int field1811 = 0;

    @ObfuscatedName("bz.w")
    public static volatile int field1797 = 0;

    @ObfuscatedName("bz.t")
    public static volatile int field1805 = -1;

    @ObfuscatedName("bz.s")
    public static volatile int field1803 = 0;

    @ObfuscatedName("bz.q")
    public static int field1809 = 0;

    @ObfuscatedName("bz.z")
    public static long field1810 = 0L;

    @ObfuscatedName("bz.x")
    public static volatile int field1806 = 0;

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1804 = arg0.getX();
            field1806 = arg0.getY();
            field1796 = class38.method2385();
            if (arg0.isMetaDown()) {
                field1803 = 2;
                field1797 = 2;
            } else {
                field1803 = 1;
                field1797 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1797 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1805 = arg0.getX();
            field1795 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1805 = -1;
            field1795 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1805 = arg0.getX();
            field1795 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1799 != null) {
            field1811 = 0;
            field1805 = arg0.getX();
            field1795 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1799 != null) {
            field1797 = 0;
        }
    }

    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @ObfuscatedName("bb.b(B)V")
    public static void method2307() {
        if (field1799 != null) {
            class108 var0 = field1799;
            synchronized (field1799) {
                field1799 = null;
            }
        }
    }

    @ObfuscatedName("bc.k(IB)V")
    public static void method2309(int arg0) {
        field1811 = arg0;
    }

    @ObfuscatedName("cl.h(I)I")
    public static int method2513() {
        return ++field1811 - 1;
    }
}
