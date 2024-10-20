package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dl")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dl.z")
    public static class127 field1990 = new class127();

    @ObfuscatedName("dl.j")
    public static volatile int field1982 = 0;

    @ObfuscatedName("dl.a")
    public static volatile int field1983 = 0;

    @ObfuscatedName("dl.y")
    public static volatile int field1994 = 0;

    @ObfuscatedName("dl.i")
    public static volatile int field1985 = -1;

    @ObfuscatedName("dl.b")
    public static volatile int field1986 = -1;

    @ObfuscatedName("dl.s")
    public static int field1987 = 0;

    @ObfuscatedName("dl.q")
    public static int field1988 = 0;

    @ObfuscatedName("dl.p")
    public static int field1989 = 0;

    @ObfuscatedName("dl.h")
    public static volatile int field1991 = 0;

    @ObfuscatedName("dl.r")
    public static volatile int field1992 = 0;

    @ObfuscatedName("dl.o")
    public static volatile long field1993 = 0L;

    @ObfuscatedName("dl.f")
    public static int field1996 = 0;

    @ObfuscatedName("dl.u")
    public static int field1995 = 0;

    @ObfuscatedName("dl.c")
    public static int field2002 = 0;

    @ObfuscatedName("dl.l")
    public static long field1984 = 0L;

    @ObfuscatedName("ak.z(Ljava/awt/Component;I)V")
    public static void method580(Component arg0) {
        arg0.addMouseListener(field1990);
        arg0.addMouseMotionListener(field1990);
        arg0.addFocusListener(field1990);
    }

    @ObfuscatedName("h.a(I)V")
    public static void method118() {
        if (field1990 != null) {
            class127 var0 = field1990;
            synchronized (field1990) {
                field1990 = null;
            }
        }
    }

    @ObfuscatedName("au.y(I)V")
    public static void method766() {
        class127 var0 = field1990;
        synchronized (field1990) {
            field1987 = field1983;
            field1988 = field1985;
            field1989 = field1986 * 1006522501;
            field1996 = field1994;
            field1995 = field1991;
            field2002 = field1992;
            field1984 = field1993;
            field1994 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1990 != null) {
            field1982 = 0;
            field1991 = arg0.getX();
            field1992 = arg0.getY();
            field1993 = class103.method26();
            if (arg0.isAltDown()) {
                field1994 = 4;
                field1983 = 4;
            } else if (arg0.isMetaDown()) {
                field1994 = 2;
                field1983 = 2;
            } else {
                field1994 = 1;
                field1983 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1990 != null) {
            field1982 = 0;
            field1983 = 0;
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
        if (field1990 != null) {
            field1982 = 0;
            field1985 = arg0.getX();
            field1986 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1990 != null) {
            field1982 = 0;
            field1985 = -1;
            field1986 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1990 != null) {
            field1982 = 0;
            field1985 = arg0.getX();
            field1986 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1990 != null) {
            field1982 = 0;
            field1985 = arg0.getX();
            field1986 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1990 != null) {
            field1983 = 0;
        }
    }
}
