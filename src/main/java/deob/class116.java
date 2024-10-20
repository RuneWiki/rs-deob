package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("do")
public class class116 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("do.o")
    public static class116 field1811 = new class116();

    @ObfuscatedName("do.m")
    public static volatile int field1810 = 0;

    @ObfuscatedName("do.b")
    public static volatile int field1828 = 0;

    @ObfuscatedName("do.g")
    public static volatile int field1812 = -1;

    @ObfuscatedName("do.h")
    public static volatile int field1813 = -1;

    @ObfuscatedName("do.v")
    public static int field1823 = 0;

    @ObfuscatedName("do.l")
    public static int field1815 = 0;

    @ObfuscatedName("do.c")
    public static int field1822 = 0;

    @ObfuscatedName("do.u")
    public static volatile int field1817 = 0;

    @ObfuscatedName("do.k")
    public static volatile int field1818 = 0;

    @ObfuscatedName("do.z")
    public static volatile int field1819 = 0;

    @ObfuscatedName("do.y")
    public static volatile long field1820 = 0L;

    @ObfuscatedName("do.j")
    public static int field1821 = 0;

    @ObfuscatedName("do.f")
    public static int field1824 = 0;

    @ObfuscatedName("do.p")
    public static int field1826 = 0;

    @ObfuscatedName("do.i")
    public static long field1814 = 0L;

    @ObfuscatedName("client.o(Ljava/awt/Component;I)V")
    public static void method556(Component arg0) {
        arg0.addMouseListener(field1811);
        arg0.addMouseMotionListener(field1811);
        arg0.addFocusListener(field1811);
    }

    @ObfuscatedName("an.m(I)V")
    public static void method713() {
        if (field1811 != null) {
            class116 var0 = field1811;
            synchronized (field1811) {
                field1811 = null;
            }
        }
    }

    @ObfuscatedName("da.b(I)I")
    public static int method2008() {
        return ++field1810 - 1;
    }

    @ObfuscatedName("i.g(II)V")
    public static void method178(int arg0) {
        field1810 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1811 != null) {
            field1810 = 0;
            field1818 = arg0.getX();
            field1819 = arg0.getY();
            field1820 = class156.method2009();
            if (arg0.isAltDown()) {
                field1817 = 4;
                field1828 = 4;
            } else if (arg0.isMetaDown()) {
                field1817 = 2;
                field1828 = 2;
            } else {
                field1817 = 1;
                field1828 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1811 != null) {
            field1810 = 0;
            field1828 = 0;
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
        if (field1811 != null) {
            field1810 = 0;
            field1812 = arg0.getX();
            field1813 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1811 != null) {
            field1810 = 0;
            field1812 = -1;
            field1813 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1811 != null) {
            field1810 = 0;
            field1812 = arg0.getX();
            field1813 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1811 != null) {
            field1810 = 0;
            field1812 = arg0.getX();
            field1813 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1811 != null) {
            field1828 = 0;
        }
    }
}
