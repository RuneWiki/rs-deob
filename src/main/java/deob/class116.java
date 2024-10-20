package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bt")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bt.g")
    public static volatile int field1813 = 0;

    @ObfuscatedName("bt.d")
    public static int field1810 = 0;

    @ObfuscatedName("bt.e")
    public static int field1805 = 0;

    @ObfuscatedName("bt.b")
    public static volatile int field1806 = 0;

    @ObfuscatedName("bt.c")
    public static volatile int field1818 = 0;

    @ObfuscatedName("bt.a")
    public static volatile long field1812 = 0L;

    @ObfuscatedName("bt.m")
    public static volatile int field1808 = -1;

    @ObfuscatedName("bt.j")
    public static volatile int field1804 = 0;

    @ObfuscatedName("bt.k")
    public static int field1817 = 0;

    @ObfuscatedName("bt.i")
    public static volatile int field1807 = -1;

    @ObfuscatedName("bt.v")
    public static class116 field1811 = new class116();

    @ObfuscatedName("bt.u")
    public static int field1815 = 0;

    @ObfuscatedName("bt.p")
    public static long field1819 = 0L;

    @ObfuscatedName("bt.z")
    public static int field1809 = 0;

    @ObfuscatedName("bt.y")
    public static volatile int field1814 = 0;

    @ObfuscatedName("bt.x")
    public static int field1816 = 0;

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1806 = 0;
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

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1807 = -1;
            field1808 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1807 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1807 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1811 != null) {
            field1806 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1813 = arg0.getX();
            field1814 = arg0.getY();
            field1812 = class42.method1378();
            if (arg0.isMetaDown()) {
                field1804 = 2;
                field1806 = 2;
            } else {
                field1804 = 1;
                field1806 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (field1811 != null) {
            field1818 = 0;
            field1807 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    @ObfuscatedName("s.b(I)I")
    public static int method1361() {
        return ++field1818 - 1;
    }

    @ObfuscatedName("by.v(Ljava/awt/Component;B)V")
    public static void method1946(Component arg0) {
        arg0.addMouseListener(field1811);
        arg0.addMouseMotionListener(field1811);
        arg0.addFocusListener(field1811);
    }

    @ObfuscatedName("ce.c(Ljava/awt/Component;I)V")
    public static void method2810(Component arg0) {
        arg0.removeMouseListener(field1811);
        arg0.removeMouseMotionListener(field1811);
        arg0.removeFocusListener(field1811);
        field1806 = 0;
    }
}
