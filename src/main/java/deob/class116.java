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
    public static int field1802 = 0;

    @ObfuscatedName("dk.j")
    public static class116 field1809 = new class116();

    @ObfuscatedName("dk.c")
    public static volatile int field1803 = 0;

    @ObfuscatedName("dk.d")
    public static volatile int field1804 = 0;

    @ObfuscatedName("dk.w")
    public static volatile int field1805 = -1;

    @ObfuscatedName("dk.h")
    public static volatile int field1811 = -1;

    @ObfuscatedName("dk.u")
    public static int field1807 = 0;

    @ObfuscatedName("dk.k")
    public static int field1808 = 0;

    @ObfuscatedName("dk.g")
    public static volatile int field1810 = 0;

    @ObfuscatedName("dk.y")
    public static volatile int field1806 = 0;

    @ObfuscatedName("dk.e")
    public static volatile int field1812 = 0;

    @ObfuscatedName("dk.q")
    public static volatile long field1813 = 0L;

    @ObfuscatedName("dk.v")
    public static int field1814 = 0;

    @ObfuscatedName("dk.l")
    public static int field1815 = 0;

    @ObfuscatedName("dk.s")
    public static int field1816 = 0;

    @ObfuscatedName("dk.r")
    public static long field1817 = 0L;

    @ObfuscatedName("ee.x(Ljava/awt/Component;B)V")
    public static void method2484(Component arg0) {
        arg0.removeMouseListener(field1809);
        arg0.removeMouseMotionListener(field1809);
        arg0.removeFocusListener(field1809);
        field1804 = 0;
    }

    @ObfuscatedName("ek.c(I)I")
    public static int method2652() {
        return ++field1803 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1809 != null) {
            field1803 = 0;
            field1806 = arg0.getX();
            field1812 = arg0.getY();
            field1813 = class156.method1888();
            if (arg0.isAltDown()) {
                field1810 = 4;
                field1804 = 4;
            } else if (arg0.isMetaDown()) {
                field1810 = 2;
                field1804 = 2;
            } else {
                field1810 = 1;
                field1804 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1809 != null) {
            field1803 = 0;
            field1804 = 0;
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
            field1803 = 0;
            field1805 = arg0.getX();
            field1811 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1809 != null) {
            field1803 = 0;
            field1805 = -1;
            field1811 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1809 != null) {
            field1803 = 0;
            field1805 = arg0.getX();
            field1811 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1809 != null) {
            field1803 = 0;
            field1805 = arg0.getX();
            field1811 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1809 != null) {
            field1804 = 0;
        }
    }
}
