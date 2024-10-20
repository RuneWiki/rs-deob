package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dr")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dr.p")
    public static class116 field1809 = new class116();

    @ObfuscatedName("dr.g")
    public static volatile int field1801 = 0;

    @ObfuscatedName("dr.x")
    public static int field1815 = 0;

    @ObfuscatedName("dr.q")
    public static volatile int field1807 = 0;

    @ObfuscatedName("dr.d")
    public static volatile int field1803 = -1;

    @ObfuscatedName("dr.k")
    public static int field1806 = 0;

    @ObfuscatedName("dr.j")
    public static volatile int field1804 = -1;

    @ObfuscatedName("dr.s")
    public static int field1805 = 0;

    @ObfuscatedName("dr.o")
    public static volatile int field1808 = 0;

    @ObfuscatedName("dr.a")
    public static volatile int field1802 = 0;

    @ObfuscatedName("dr.c")
    public static volatile int field1810 = 0;

    @ObfuscatedName("dr.m")
    public static volatile long field1811 = 0L;

    @ObfuscatedName("dr.h")
    public static int field1814 = 0;

    @ObfuscatedName("dr.r")
    public static int field1812 = 0;

    @ObfuscatedName("dr.u")
    public static int field1813 = 0;

    @ObfuscatedName("dr.i")
    public static long field1800 = 0L;

    @ObfuscatedName("bk.p(Ljava/awt/Component;I)V")
    public static void method1330(Component arg0) {
        arg0.addMouseListener(field1809);
        arg0.addMouseMotionListener(field1809);
        arg0.addFocusListener(field1809);
    }

    @ObfuscatedName("bq.g(Ljava/awt/Component;B)V")
    public static void method1300(Component arg0) {
        arg0.removeMouseListener(field1809);
        arg0.removeMouseMotionListener(field1809);
        arg0.removeFocusListener(field1809);
        field1807 = 0;
    }

    @ObfuscatedName("bl.x(I)I")
    public static int method994() {
        return ++field1801 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1802 = arg0.getX();
            field1810 = arg0.getY();
            field1811 = class156.method1597();
            if (arg0.isAltDown()) {
                field1808 = 4;
                field1807 = 4;
            } else if (arg0.isMetaDown()) {
                field1808 = 2;
                field1807 = 2;
            } else {
                field1808 = 1;
                field1807 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1807 = 0;
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
            field1803 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1803 = -1;
            field1804 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1803 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1809 != null) {
            field1801 = 0;
            field1803 = arg0.getX();
            field1804 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1809 != null) {
            field1807 = 0;
        }
    }
}
