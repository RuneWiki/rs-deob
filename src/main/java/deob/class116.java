package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dw")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dw.i")
    public static class116 field1799 = new class116();

    @ObfuscatedName("dw.e")
    public static volatile int field1791 = 0;

    @ObfuscatedName("dw.f")
    public static volatile int field1793 = 0;

    @ObfuscatedName("dw.k")
    public static int field1795 = 0;

    @ObfuscatedName("dw.g")
    public static volatile int field1794 = -1;

    @ObfuscatedName("dw.n")
    public static volatile int field1802 = -1;

    @ObfuscatedName("dw.a")
    public static int field1796 = 0;

    @ObfuscatedName("dw.q")
    public static int field1798 = 0;

    @ObfuscatedName("dw.w")
    public static volatile int field1807 = 0;

    @ObfuscatedName("dw.v")
    public static volatile int field1792 = 0;

    @ObfuscatedName("dw.h")
    public static volatile int field1801 = 0;

    @ObfuscatedName("dw.p")
    public static volatile long field1797 = 0L;

    @ObfuscatedName("dw.l")
    public static int field1803 = 0;

    @ObfuscatedName("dw.c")
    public static int field1804 = 0;

    @ObfuscatedName("dw.m")
    public static int field1805 = 0;

    @ObfuscatedName("dw.r")
    public static long field1806 = 0L;

    @ObfuscatedName("ae.i(Ljava/awt/Component;B)V")
    public static void method847(Component arg0) {
        arg0.addMouseListener(field1799);
        arg0.addMouseMotionListener(field1799);
        arg0.addFocusListener(field1799);
    }

    @ObfuscatedName("ex.e(Ljava/awt/Component;I)V")
    public static void method2548(Component arg0) {
        arg0.removeMouseListener(field1799);
        arg0.removeMouseMotionListener(field1799);
        arg0.removeFocusListener(field1799);
        field1793 = 0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1799 != null) {
            field1791 = 0;
            field1792 = arg0.getX();
            field1801 = arg0.getY();
            field1797 = class156.method1307();
            if (arg0.isAltDown()) {
                field1807 = 4;
                field1793 = 4;
            } else if (arg0.isMetaDown()) {
                field1807 = 2;
                field1793 = 2;
            } else {
                field1807 = 1;
                field1793 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1799 != null) {
            field1791 = 0;
            field1793 = 0;
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
        if (field1799 != null) {
            field1791 = 0;
            field1794 = arg0.getX();
            field1802 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1799 != null) {
            field1791 = 0;
            field1794 = -1;
            field1802 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1799 != null) {
            field1791 = 0;
            field1794 = arg0.getX();
            field1802 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1799 != null) {
            field1791 = 0;
            field1794 = arg0.getX();
            field1802 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1799 != null) {
            field1793 = 0;
        }
    }
}
