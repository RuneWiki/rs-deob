package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dk")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dk.x")
    public static int field1807 = 0;

    @ObfuscatedName("dk.n")
    public static class116 field1804 = new class116();

    @ObfuscatedName("dk.g")
    public static volatile int field1801 = 0;

    @ObfuscatedName("dk.v")
    public static volatile int field1802 = 0;

    @ObfuscatedName("dk.y")
    public static volatile int field1805 = 0;

    @ObfuscatedName("dk.p")
    public static volatile int field1800 = -1;

    @ObfuscatedName("dk.j")
    public static volatile int field1808 = -1;

    @ObfuscatedName("dk.m")
    public static int field1803 = 0;

    @ObfuscatedName("dk.a")
    public static int field1806 = 0;

    @ObfuscatedName("dk.i")
    public static volatile int field1809 = 0;

    @ObfuscatedName("dk.s")
    public static volatile int field1810 = 0;

    @ObfuscatedName("dk.k")
    public static volatile long field1811 = 0L;

    @ObfuscatedName("dk.f")
    public static int field1812 = 0;

    @ObfuscatedName("dk.o")
    public static int field1813 = 0;

    @ObfuscatedName("dk.q")
    public static int field1814 = 0;

    @ObfuscatedName("dk.c")
    public static long field1815 = 0L;

    @ObfuscatedName("dc.x(Ljava/awt/Component;I)V")
    public static void method1979(Component arg0) {
        arg0.addMouseListener(field1804);
        arg0.addMouseMotionListener(field1804);
        arg0.addFocusListener(field1804);
    }

    @ObfuscatedName("bn.n(I)I")
    public static int method1139() {
        return ++field1801 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1804 != null) {
            field1801 = 0;
            field1809 = arg0.getX();
            field1810 = arg0.getY();
            field1811 = class156.method1898();
            if (arg0.isAltDown()) {
                field1805 = 4;
                field1802 = 4;
            } else if (arg0.isMetaDown()) {
                field1805 = 2;
                field1802 = 2;
            } else {
                field1805 = 1;
                field1802 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1804 != null) {
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
        if (field1804 != null) {
            field1801 = 0;
            field1800 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1804 != null) {
            field1801 = 0;
            field1800 = -1;
            field1808 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1804 != null) {
            field1801 = 0;
            field1800 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1804 != null) {
            field1801 = 0;
            field1800 = arg0.getX();
            field1808 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1804 != null) {
            field1802 = 0;
        }
    }
}
