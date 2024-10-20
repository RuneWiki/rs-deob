package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("de")
public class class124 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("de.z")
    public static class124 field1994 = new class124();

    @ObfuscatedName("de.n")
    public static volatile int field1981 = 0;

    @ObfuscatedName("de.u")
    public static volatile int field1982 = 0;

    @ObfuscatedName("de.t")
    public static volatile int field1999 = -1;

    @ObfuscatedName("de.e")
    public static volatile int field1984 = -1;

    @ObfuscatedName("de.a")
    public static int field1985 = 0;

    @ObfuscatedName("de.l")
    public static int field1991 = 0;

    @ObfuscatedName("de.v")
    public static int field1986 = 0;

    @ObfuscatedName("de.j")
    public static volatile int field1987 = 0;

    @ObfuscatedName("de.k")
    public static volatile int field1989 = 0;

    @ObfuscatedName("de.g")
    public static volatile int field1990 = 0;

    @ObfuscatedName("de.d")
    public static volatile long field1980 = 0L;

    @ObfuscatedName("de.b")
    public static int field1992 = 0;

    @ObfuscatedName("de.i")
    public static int field1993 = 0;

    @ObfuscatedName("de.o")
    public static int field1988 = 0;

    @ObfuscatedName("de.x")
    public static long field1995 = 0L;

    @ObfuscatedName("bl.z(Ljava/awt/Component;B)V")
    public static void method1341(Component arg0) {
        arg0.addMouseListener(field1994);
        arg0.addMouseMotionListener(field1994);
        arg0.addFocusListener(field1994);
    }

    @ObfuscatedName("bg.n(Ljava/awt/Component;B)V")
    public static void method1425(Component arg0) {
        arg0.removeMouseListener(field1994);
        arg0.removeMouseMotionListener(field1994);
        arg0.removeFocusListener(field1994);
        field1982 = 0;
    }

    @ObfuscatedName("t.u(I)I")
    public static int method34() {
        return ++field1981 - 1;
    }

    @ObfuscatedName("bm.t(II)V")
    public static void method1605(int arg0) {
        field1981 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1994 != null) {
            field1981 = 0;
            field1989 = arg0.getX();
            field1990 = arg0.getY();
            field1980 = class100.method496();
            if (arg0.isAltDown()) {
                field1987 = 4;
                field1982 = 4;
            } else if (arg0.isMetaDown()) {
                field1987 = 2;
                field1982 = 2;
            } else {
                field1987 = 1;
                field1982 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1994 != null) {
            field1981 = 0;
            field1982 = 0;
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
        if (field1994 != null) {
            field1981 = 0;
            field1999 = arg0.getX();
            field1984 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1994 != null) {
            field1981 = 0;
            field1999 = -1;
            field1984 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1994 != null) {
            field1981 = 0;
            field1999 = arg0.getX();
            field1984 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1994 != null) {
            field1981 = 0;
            field1999 = arg0.getX();
            field1984 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1994 != null) {
            field1982 = 0;
        }
    }
}
