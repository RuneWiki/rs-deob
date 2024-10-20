package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("db")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("db.b")
    public static class116 field1801 = new class116();

    @ObfuscatedName("db.l")
    public static volatile int field1808 = 0;

    @ObfuscatedName("db.i")
    public static volatile int field1798 = 0;

    @ObfuscatedName("db.t")
    public static volatile int field1796 = -1;

    @ObfuscatedName("db.k")
    public static int field1803 = 0;

    @ObfuscatedName("db.h")
    public static volatile int field1800 = -1;

    @ObfuscatedName("db.n")
    public static int field1810 = 0;

    @ObfuscatedName("db.f")
    public static int field1802 = 0;

    @ObfuscatedName("db.a")
    public static volatile int field1804 = 0;

    @ObfuscatedName("db.r")
    public static volatile int field1805 = 0;

    @ObfuscatedName("db.x")
    public static volatile int field1806 = 0;

    @ObfuscatedName("db.z")
    public static volatile long field1807 = 0L;

    @ObfuscatedName("db.p")
    public static int field1797 = 0;

    @ObfuscatedName("db.s")
    public static int field1809 = 0;

    @ObfuscatedName("db.o")
    public static int field1799 = 0;

    @ObfuscatedName("db.y")
    public static long field1811 = 0L;

    @ObfuscatedName("aj.b(Ljava/awt/Component;I)V")
    public static void method634(Component arg0) {
        arg0.addMouseListener(field1801);
        arg0.addMouseMotionListener(field1801);
        arg0.addFocusListener(field1801);
    }

    @ObfuscatedName("d.l(Ljava/awt/Component;I)V")
    public static void method260(Component arg0) {
        arg0.removeMouseListener(field1801);
        arg0.removeMouseMotionListener(field1801);
        arg0.removeFocusListener(field1801);
        field1798 = 0;
    }

    @ObfuscatedName("dd.i(I)I")
    public static int method2022() {
        return ++field1808 - 1;
    }

    @ObfuscatedName("bz.t(IB)V")
    public static void method1408(int arg0) {
        field1808 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1801 != null) {
            field1808 = 0;
            field1805 = arg0.getX();
            field1806 = arg0.getY();
            field1807 = class156.method910();
            if (arg0.isAltDown()) {
                field1804 = 4;
                field1798 = 4;
            } else if (arg0.isMetaDown()) {
                field1804 = 2;
                field1798 = 2;
            } else {
                field1804 = 1;
                field1798 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1801 != null) {
            field1808 = 0;
            field1798 = 0;
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
        if (field1801 != null) {
            field1808 = 0;
            field1796 = arg0.getX();
            field1800 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1801 != null) {
            field1808 = 0;
            field1796 = -1;
            field1800 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1801 != null) {
            field1808 = 0;
            field1796 = arg0.getX();
            field1800 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1801 != null) {
            field1808 = 0;
            field1796 = arg0.getX();
            field1800 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1801 != null) {
            field1798 = 0;
        }
    }
}
