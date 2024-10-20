package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dh")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dh.d")
    public static class116 field1809 = new class116();

    @ObfuscatedName("dh.c")
    public static volatile int field1801 = 0;

    @ObfuscatedName("dh.n")
    public static volatile int field1802 = 0;

    @ObfuscatedName("dh.q")
    public static volatile int field1813 = -1;

    @ObfuscatedName("dh.t")
    public static volatile int field1804 = -1;

    @ObfuscatedName("dh.p")
    public static int field1800 = 0;

    @ObfuscatedName("dh.u")
    public static int field1806 = 0;

    @ObfuscatedName("dh.z")
    public static int field1807 = 0;

    @ObfuscatedName("dh.l")
    public static volatile int field1808 = 0;

    @ObfuscatedName("dh.v")
    public static volatile int field1811 = 0;

    @ObfuscatedName("dh.g")
    public static volatile int field1810 = 0;

    @ObfuscatedName("dh.w")
    public static volatile long field1818 = 0L;

    @ObfuscatedName("dh.r")
    public static int field1812 = 0;

    @ObfuscatedName("dh.s")
    public static int field1803 = 0;

    @ObfuscatedName("dh.k")
    public static int field1814 = 0;

    @ObfuscatedName("dh.e")
    public static long field1815 = 0L;

    @ObfuscatedName("i.d(B)I")
    public static int method194() {
        return ++field1801 - 1;
    }

    @ObfuscatedName("ah.c(IB)V")
    public static void method891(int arg0) {
        field1801 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1811 = arg0.getX();
            field1810 = arg0.getY();
            field1818 = class132.method1336();
            if (arg0.isAltDown()) {
                field1808 = 4;
                field1802 = 4;
            } else if (arg0.isMetaDown()) {
                field1808 = 2;
                field1802 = 2;
            } else {
                field1808 = 1;
                field1802 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1802 = 0;
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
        if (field1809 != null) {
            field1801 = 0;
            field1813 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1813 = -1;
            field1804 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1813 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1813 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1809 != null) {
            field1802 = 0;
        }
    }
}
