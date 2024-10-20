package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dq")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dq.q")
    public static class116 field1813 = new class116();

    @ObfuscatedName("dq.d")
    public static volatile int field1794 = 0;

    @ObfuscatedName("dq.h")
    public static volatile int field1810 = 0;

    @ObfuscatedName("dq.p")
    public static volatile int field1796 = -1;

    @ObfuscatedName("dq.j")
    public static volatile int field1803 = -1;

    @ObfuscatedName("dq.n")
    public static int field1795 = 0;

    @ObfuscatedName("dq.r")
    public static int field1793 = 0;

    @ObfuscatedName("dq.c")
    public static int field1800 = 0;

    @ObfuscatedName("dq.i")
    public static volatile int field1801 = 0;

    @ObfuscatedName("dq.o")
    public static volatile int field1802 = 0;

    @ObfuscatedName("dq.m")
    public static volatile int field1798 = 0;

    @ObfuscatedName("dq.s")
    public static volatile long field1804 = 0L;

    @ObfuscatedName("dq.u")
    public static int field1805 = 0;

    @ObfuscatedName("dq.b")
    public static int field1797 = 0;

    @ObfuscatedName("dq.v")
    public static int field1807 = 0;

    @ObfuscatedName("dq.f")
    public static long field1808 = 0L;

    @ObfuscatedName("t.q(I)I")
    public static int method196() {
        return ++field1794 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1813 != null) {
            field1794 = 0;
            field1802 = arg0.getX();
            field1798 = arg0.getY();
            field1804 = class156.method12();
            if (arg0.isAltDown()) {
                field1801 = 4;
                field1810 = 4;
            } else if (arg0.isMetaDown()) {
                field1801 = 2;
                field1810 = 2;
            } else {
                field1801 = 1;
                field1810 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1813 != null) {
            field1794 = 0;
            field1810 = 0;
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
        if (field1813 != null) {
            field1794 = 0;
            field1796 = arg0.getX();
            field1803 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1813 != null) {
            field1794 = 0;
            field1796 = -1;
            field1803 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1813 != null) {
            field1794 = 0;
            field1796 = arg0.getX();
            field1803 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1813 != null) {
            field1794 = 0;
            field1796 = arg0.getX();
            field1803 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1813 != null) {
            field1810 = 0;
        }
    }
}
