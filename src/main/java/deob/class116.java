package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dk")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dk.b")
    public static class116 field1799 = new class116();

    @ObfuscatedName("dk.e")
    public static volatile int field1790 = 0;

    @ObfuscatedName("dk.c")
    public static volatile int field1795 = 0;

    @ObfuscatedName("dk.l")
    public static volatile int field1784 = -1;

    @ObfuscatedName("dk.y")
    public static volatile int field1789 = 0;

    @ObfuscatedName("dk.j")
    public static volatile int field1785 = -1;

    @ObfuscatedName("dk.g")
    public static int field1786 = 0;

    @ObfuscatedName("dk.s")
    public static int field1787 = 0;

    @ObfuscatedName("dk.r")
    public static int field1783 = 0;

    @ObfuscatedName("dk.t")
    public static volatile int field1797 = 0;

    @ObfuscatedName("dk.k")
    public static volatile int field1791 = 0;

    @ObfuscatedName("dk.f")
    public static volatile long field1794 = 0L;

    @ObfuscatedName("dk.a")
    public static int field1793 = 0;

    @ObfuscatedName("dk.v")
    public static int field1782 = 0;

    @ObfuscatedName("dk.d")
    public static int field1781 = 0;

    @ObfuscatedName("dk.o")
    public static long field1796 = 0L;

    @ObfuscatedName("bf.b(I)V")
    public static void method1055() {
        class116 var0 = field1799;
        synchronized (field1799) {
            field1786 = field1795;
            field1787 = field1784;
            field1783 = field1785 * 1650973011;
            field1793 = field1789;
            field1782 = field1797;
            field1781 = field1791;
            field1796 = field1794;
            field1789 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1799 != null) {
            field1790 = 0;
            field1797 = arg0.getX();
            field1791 = arg0.getY();
            field1794 = class156.method81();
            if (arg0.isAltDown()) {
                field1789 = 4;
                field1795 = 4;
            } else if (arg0.isMetaDown()) {
                field1789 = 2;
                field1795 = 2;
            } else {
                field1789 = 1;
                field1795 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1799 != null) {
            field1790 = 0;
            field1795 = 0;
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
            field1790 = 0;
            field1784 = arg0.getX();
            field1785 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1799 != null) {
            field1790 = 0;
            field1784 = -1;
            field1785 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1799 != null) {
            field1790 = 0;
            field1784 = arg0.getX();
            field1785 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1799 != null) {
            field1790 = 0;
            field1784 = arg0.getX();
            field1785 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1799 != null) {
            field1795 = 0;
        }
    }
}
