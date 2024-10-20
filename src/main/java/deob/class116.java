package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("do")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("do.u")
    public static class116 field1799 = new class116();

    @ObfuscatedName("do.x")
    public static int field1790 = 0;

    @ObfuscatedName("do.i")
    public static volatile int field1784 = 0;

    @ObfuscatedName("do.a")
    public static volatile int field1785 = 0;

    @ObfuscatedName("do.f")
    public static volatile int field1796 = -1;

    @ObfuscatedName("do.c")
    public static volatile int field1787 = -1;

    @ObfuscatedName("do.d")
    public static int field1788 = 0;

    @ObfuscatedName("do.l")
    public static int field1789 = 0;

    @ObfuscatedName("do.g")
    public static volatile int field1791 = 0;

    @ObfuscatedName("do.z")
    public static volatile int field1783 = 0;

    @ObfuscatedName("do.t")
    public static volatile int field1793 = 0;

    @ObfuscatedName("do.m")
    public static volatile long field1794 = 0L;

    @ObfuscatedName("do.q")
    public static int field1795 = 0;

    @ObfuscatedName("do.e")
    public static int field1792 = 0;

    @ObfuscatedName("do.v")
    public static int field1797 = 0;

    @ObfuscatedName("do.j")
    public static long field1798 = 0L;

    @ObfuscatedName("ak.u(Ljava/awt/Component;I)V")
    public static void method731(Component arg0) {
        arg0.removeMouseListener(field1799);
        arg0.removeMouseMotionListener(field1799);
        arg0.removeFocusListener(field1799);
        field1785 = 0;
    }

    @ObfuscatedName("ao.x(I)V")
    public static void method864() {
        class116 var0 = field1799;
        synchronized (field1799) {
            field1788 = field1785;
            field1789 = field1796;
            field1790 = field1787 * 2063535519;
            field1795 = field1791;
            field1792 = field1783;
            field1797 = field1793;
            field1798 = field1794;
            field1791 = 0;
        }
    }

    @ObfuscatedName("ck.i(I)I")
    public static int method1796() {
        return ++field1784 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1799 != null) {
            field1784 = 0;
            field1783 = arg0.getX();
            field1793 = arg0.getY();
            field1794 = class156.method118();
            if (arg0.isAltDown()) {
                field1791 = 4;
                field1785 = 4;
            } else if (arg0.isMetaDown()) {
                field1791 = 2;
                field1785 = 2;
            } else {
                field1791 = 1;
                field1785 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1799 != null) {
            field1784 = 0;
            field1785 = 0;
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
            field1784 = 0;
            field1796 = arg0.getX();
            field1787 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1799 != null) {
            field1784 = 0;
            field1796 = -1;
            field1787 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1799 != null) {
            field1784 = 0;
            field1796 = arg0.getX();
            field1787 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1799 != null) {
            field1784 = 0;
            field1796 = arg0.getX();
            field1787 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1799 != null) {
            field1785 = 0;
        }
    }
}
