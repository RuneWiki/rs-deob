package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bz")
public class class108 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bz.f")
    public static volatile int field1745 = 0;

    @ObfuscatedName("bz.g")
    public static int field1743 = 0;

    @ObfuscatedName("bz.e")
    public static volatile int field1741 = 0;

    @ObfuscatedName("bz.n")
    public static int field1742 = 0;

    @ObfuscatedName("bz.o")
    public static volatile int field1739 = 0;

    @ObfuscatedName("bz.l")
    public static int field1748 = 0;

    @ObfuscatedName("bz.j")
    public static class108 field1751 = new class108();

    @ObfuscatedName("bz.h")
    public static volatile int field1740 = -1;

    @ObfuscatedName("bz.i")
    public static int field1749 = 0;

    @ObfuscatedName("bz.w")
    public static int field1737 = 0;

    @ObfuscatedName("bz.t")
    public static volatile int field1744 = -1;

    @ObfuscatedName("bz.s")
    public static long field1755 = 0L;

    @ObfuscatedName("bz.r")
    public static int field1750 = 0;

    @ObfuscatedName("bz.p")
    public static volatile int field1738 = 0;

    @ObfuscatedName("bz.z")
    public static volatile long field1747 = 0L;

    @ObfuscatedName("bz.x")
    public static volatile int field1746 = 0;

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1745 = arg0.getX();
            field1746 = arg0.getY();
            field1747 = Statics.method1882();
            if (arg0.isMetaDown()) {
                field1741 = 2;
                field1739 = 2;
            } else {
                field1741 = 1;
                field1739 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1739 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1744 = arg0.getX();
            field1740 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1744 = -1;
            field1740 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1744 = arg0.getX();
            field1740 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1751 != null) {
            field1738 = 0;
            field1744 = arg0.getX();
            field1740 = arg0.getY();
        }
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1751 != null) {
            field1739 = 0;
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @ObfuscatedName("bk.o(II)V")
    public static void method2079(int arg0) {
        field1738 = arg0;
    }

    @ObfuscatedName("ag.j(Ljava/awt/Component;I)V")
    public static void method3491(Component arg0) {
        arg0.removeMouseListener(field1751);
        arg0.removeMouseMotionListener(field1751);
        arg0.removeFocusListener(field1751);
        field1739 = 0;
    }
}
