package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dc")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dc.k")
    public static int field1800 = 0;

    @ObfuscatedName("dc.y")
    public static volatile int field1802 = 0;

    @ObfuscatedName("dc.o")
    public static class116 field1809 = new class116();

    @ObfuscatedName("dc.r")
    public static volatile int field1794 = 0;

    @ObfuscatedName("dc.w")
    public static volatile int field1796 = 0;

    @ObfuscatedName("dc.j")
    public static volatile int field1797 = -1;

    @ObfuscatedName("dc.q")
    public static volatile int field1798 = -1;

    @ObfuscatedName("dc.d")
    public static int field1806 = 0;

    @ObfuscatedName("dc.n")
    public static int field1795 = 0;

    @ObfuscatedName("dc.c")
    public static volatile int field1803 = 0;

    @ObfuscatedName("dc.s")
    public static volatile int field1804 = 0;

    @ObfuscatedName("dc.g")
    public static volatile long field1799 = 0L;

    @ObfuscatedName("dc.i")
    public static int field1805 = 0;

    @ObfuscatedName("dc.v")
    public static int field1801 = 0;

    @ObfuscatedName("dc.a")
    public static int field1808 = 0;

    @ObfuscatedName("dc.h")
    public static long field1807 = 0L;

    @ObfuscatedName("co.k(Ljava/awt/Component;B)V")
    public static void method1618(Component arg0) {
        arg0.addMouseListener(field1809);
        arg0.addMouseMotionListener(field1809);
        arg0.addFocusListener(field1809);
    }

    @ObfuscatedName("gt.y(Ljava/awt/Component;I)V")
    public static void method3236(Component arg0) {
        arg0.removeMouseListener(field1809);
        arg0.removeMouseMotionListener(field1809);
        arg0.removeFocusListener(field1809);
        field1796 = 0;
    }

    @ObfuscatedName("d.o(B)V")
    public static void method111() {
        if (field1809 != null) {
            class116 var0 = field1809;
            synchronized (field1809) {
                field1809 = null;
            }
        }
    }

    @ObfuscatedName("l.r(B)V")
    public static void method262() {
        class116 var0 = field1809;
        synchronized (field1809) {
            field1806 = field1796;
            field1800 = field1797;
            field1795 = field1798;
            field1805 = field1802;
            field1801 = field1803;
            field1808 = field1804;
            field1807 = field1799;
            field1802 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1809 != null) {
            field1794 = 0;
            field1803 = arg0.getX();
            field1804 = arg0.getY();
            field1799 = class163.method225();
            if (arg0.isAltDown()) {
                field1802 = 4;
                field1796 = 4;
            } else if (arg0.isMetaDown()) {
                field1802 = 2;
                field1796 = 2;
            } else {
                field1802 = 1;
                field1796 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1809 != null) {
            field1794 = 0;
            field1796 = 0;
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
            field1794 = 0;
            field1797 = arg0.getX();
            field1798 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1809 != null) {
            field1794 = 0;
            field1797 = -1;
            field1798 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1809 != null) {
            field1794 = 0;
            field1797 = arg0.getX();
            field1798 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1809 != null) {
            field1794 = 0;
            field1797 = arg0.getX();
            field1798 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1809 != null) {
            field1796 = 0;
        }
    }
}
