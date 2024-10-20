package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("du")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("du.s")
    public static class116 field1798 = new class116();

    @ObfuscatedName("du.c")
    public static volatile int field1803 = 0;

    @ObfuscatedName("du.f")
    public static volatile int field1799 = 0;

    @ObfuscatedName("du.h")
    public static volatile int field1800 = -1;

    @ObfuscatedName("du.a")
    public static volatile int field1801 = -1;

    @ObfuscatedName("du.g")
    public static int field1802 = 0;

    @ObfuscatedName("du.k")
    public static int field1811 = 0;

    @ObfuscatedName("du.u")
    public static int field1804 = 0;

    @ObfuscatedName("du.b")
    public static volatile int field1805 = 0;

    @ObfuscatedName("du.x")
    public static volatile int field1809 = 0;

    @ObfuscatedName("du.r")
    public static volatile int field1807 = 0;

    @ObfuscatedName("du.n")
    public static volatile long field1806 = 0L;

    @ObfuscatedName("du.m")
    public static int field1808 = 0;

    @ObfuscatedName("du.j")
    public static int field1810 = 0;

    @ObfuscatedName("du.w")
    public static int field1797 = 0;

    @ObfuscatedName("du.p")
    public static long field1812 = 0L;

    @ObfuscatedName("eq.s(Ljava/awt/Component;I)V")
    public static void method2384(Component arg0) {
        arg0.addMouseListener(field1798);
        arg0.addMouseMotionListener(field1798);
        arg0.addFocusListener(field1798);
    }

    @ObfuscatedName("an.c(Ljava/awt/Component;S)V")
    public static void method689(Component arg0) {
        arg0.removeMouseListener(field1798);
        arg0.removeMouseMotionListener(field1798);
        arg0.removeFocusListener(field1798);
        field1799 = 0;
    }

    @ObfuscatedName("bb.f(I)I")
    public static int method975() {
        return ++field1803 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1798 != null) {
            field1803 = 0;
            field1809 = arg0.getX();
            field1807 = arg0.getY();
            field1806 = Statics.method28();
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
        if (field1798 != null) {
            field1803 = 0;
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
        if (field1798 != null) {
            field1803 = 0;
            field1800 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1798 != null) {
            field1803 = 0;
            field1800 = -1;
            field1801 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1798 != null) {
            field1803 = 0;
            field1800 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1798 != null) {
            field1803 = 0;
            field1800 = arg0.getX();
            field1801 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1798 != null) {
            field1799 = 0;
        }
    }
}
