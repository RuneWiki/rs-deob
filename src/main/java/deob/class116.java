package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dc")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dc.f")
    public static class116 field1813 = new class116();

    @ObfuscatedName("dc.i")
    public static volatile int field1823 = 0;

    @ObfuscatedName("dc.u")
    public static volatile int field1830 = 0;

    @ObfuscatedName("dc.h")
    public static volatile int field1815 = -1;

    @ObfuscatedName("dc.r")
    public static volatile int field1816 = -1;

    @ObfuscatedName("dc.o")
    public static int field1812 = 0;

    @ObfuscatedName("dc.l")
    public static int field1818 = 0;

    @ObfuscatedName("dc.n")
    public static int field1819 = 0;

    @ObfuscatedName("dc.m")
    public static volatile int field1820 = 0;

    @ObfuscatedName("dc.w")
    public static volatile int field1821 = 0;

    @ObfuscatedName("dc.j")
    public static volatile int field1822 = 0;

    @ObfuscatedName("dc.s")
    public static volatile long field1817 = 0L;

    @ObfuscatedName("dc.q")
    public static int field1824 = 0;

    @ObfuscatedName("dc.d")
    public static int field1826 = 0;

    @ObfuscatedName("dc.p")
    public static int field1814 = 0;

    @ObfuscatedName("dc.y")
    public static long field1827 = 0L;

    @ObfuscatedName("cg.f(Ljava/awt/Component;I)V")
    public static void method1581(Component arg0) {
        arg0.addMouseListener(field1813);
        arg0.addMouseMotionListener(field1813);
        arg0.addFocusListener(field1813);
    }

    @ObfuscatedName("ek.i(Ljava/awt/Component;I)V")
    public static void method2647(Component arg0) {
        arg0.removeMouseListener(field1813);
        arg0.removeMouseMotionListener(field1813);
        arg0.removeFocusListener(field1813);
        field1830 = 0;
    }

    @ObfuscatedName("aa.u(I)V")
    public static void method845() {
        if (field1813 != null) {
            class116 var0 = field1813;
            synchronized (field1813) {
                field1813 = null;
            }
        }
    }

    @ObfuscatedName("gf.r(B)V")
    public static void method3374() {
        class116 var0 = field1813;
        synchronized (field1813) {
            field1812 = field1830;
            field1818 = field1815;
            field1819 = field1816;
            field1824 = field1820;
            field1826 = field1821;
            field1814 = field1822;
            field1827 = field1817;
            field1820 = 0;
        }
    }

    @ObfuscatedName("eh.o(I)I")
    public static int method2565() {
        return ++field1823 - 1;
    }

    @ObfuscatedName("an.l(II)V")
    public static void method585(int arg0) {
        field1823 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1813 != null) {
            field1823 = 0;
            field1821 = arg0.getX();
            field1822 = arg0.getY();
            field1817 = class156.method848();
            if (arg0.isAltDown()) {
                field1820 = 4;
                field1830 = 4;
            } else if (arg0.isMetaDown()) {
                field1820 = 2;
                field1830 = 2;
            } else {
                field1820 = 1;
                field1830 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1813 != null) {
            field1823 = 0;
            field1830 = 0;
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
            field1823 = 0;
            field1815 = arg0.getX();
            field1816 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1813 != null) {
            field1823 = 0;
            field1815 = -1;
            field1816 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1813 != null) {
            field1823 = 0;
            field1815 = arg0.getX();
            field1816 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1813 != null) {
            field1823 = 0;
            field1815 = arg0.getX();
            field1816 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1813 != null) {
            field1830 = 0;
        }
    }
}
