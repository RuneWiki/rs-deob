package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dc")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dc.t")
    public static class127 field1987 = new class127();

    @ObfuscatedName("dc.o")
    public static volatile int field1982 = 0;

    @ObfuscatedName("dc.i")
    public static volatile int field1976 = 0;

    @ObfuscatedName("dc.p")
    public static volatile int field1977 = -1;

    @ObfuscatedName("dc.c")
    public static volatile int field1978 = -1;

    @ObfuscatedName("dc.y")
    public static volatile int field1986 = 0;

    @ObfuscatedName("dc.g")
    public static int field1979 = 0;

    @ObfuscatedName("dc.l")
    public static int field1974 = 0;

    @ObfuscatedName("dc.h")
    public static int field1981 = 0;

    @ObfuscatedName("dc.n")
    public static volatile int field1983 = 0;

    @ObfuscatedName("dc.w")
    public static volatile int field1984 = 0;

    @ObfuscatedName("dc.m")
    public static volatile long field1985 = 0L;

    @ObfuscatedName("dc.x")
    public static int field1975 = 0;

    @ObfuscatedName("dc.b")
    public static int field1980 = 0;

    @ObfuscatedName("dc.u")
    public static int field1988 = 0;

    @ObfuscatedName("dc.r")
    public static long field1989 = 0L;

    @ObfuscatedName("dj.t(Ljava/awt/Component;I)V")
    public static void method2394(Component arg0) {
        arg0.addMouseListener(field1987);
        arg0.addMouseMotionListener(field1987);
        arg0.addFocusListener(field1987);
    }

    @ObfuscatedName("ai.o(Ljava/awt/Component;I)V")
    public static void method742(Component arg0) {
        arg0.removeMouseListener(field1987);
        arg0.removeMouseMotionListener(field1987);
        arg0.removeFocusListener(field1987);
        field1976 = 0;
    }

    @ObfuscatedName("dt.i(I)V")
    public static void method2436() {
        if (field1987 != null) {
            class127 var0 = field1987;
            synchronized (field1987) {
                field1987 = null;
            }
        }
    }

    @ObfuscatedName("fo.p(S)V")
    public static void method3089() {
        class127 var0 = field1987;
        synchronized (field1987) {
            field1979 = field1976;
            field1974 = field1977;
            field1981 = field1978;
            field1975 = field1986;
            field1980 = field1983;
            field1988 = field1984;
            field1989 = field1985;
            field1986 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1987 != null) {
            field1982 = 0;
            field1983 = arg0.getX();
            field1984 = arg0.getY();
            field1985 = class103.method1861();
            if (arg0.isAltDown()) {
                field1986 = 4;
                field1976 = 4;
            } else if (arg0.isMetaDown()) {
                field1986 = 2;
                field1976 = 2;
            } else {
                field1986 = 1;
                field1976 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1987 != null) {
            field1982 = 0;
            field1976 = 0;
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
        if (field1987 != null) {
            field1982 = 0;
            field1977 = arg0.getX();
            field1978 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1987 != null) {
            field1982 = 0;
            field1977 = -1;
            field1978 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1987 != null) {
            field1982 = 0;
            field1977 = arg0.getX();
            field1978 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1987 != null) {
            field1982 = 0;
            field1977 = arg0.getX();
            field1978 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1987 != null) {
            field1976 = 0;
        }
    }
}
