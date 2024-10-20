package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dh")
public class class124 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dh.m")
    public static class124 field1964 = new class124();

    @ObfuscatedName("dh.k")
    public static int field1969 = 0;

    @ObfuscatedName("dh.y")
    public static volatile int field1980 = 0;

    @ObfuscatedName("dh.g")
    public static volatile int field1967 = 0;

    @ObfuscatedName("dh.r")
    public static volatile int field1965 = 0;

    @ObfuscatedName("dh.i")
    public static volatile int field1966 = -1;

    @ObfuscatedName("dh.f")
    public static volatile int field1971 = -1;

    @ObfuscatedName("dh.a")
    public static int field1968 = 0;

    @ObfuscatedName("dh.w")
    public static int field1970 = 0;

    @ObfuscatedName("dh.u")
    public static volatile int field1979 = 0;

    @ObfuscatedName("dh.d")
    public static volatile int field1973 = 0;

    @ObfuscatedName("dh.t")
    public static volatile long field1974 = 0L;

    @ObfuscatedName("dh.j")
    public static int field1972 = 0;

    @ObfuscatedName("dh.q")
    public static int field1976 = 0;

    @ObfuscatedName("dh.p")
    public static int field1977 = 0;

    @ObfuscatedName("dh.v")
    public static long field1978 = 0L;

    @ObfuscatedName("m.y(II)V")
    public static void method3(int arg0) {
        field1967 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1964 != null) {
            field1967 = 0;
            field1979 = arg0.getX();
            field1973 = arg0.getY();
            field1974 = class100.method100();
            if (arg0.isAltDown()) {
                field1980 = 4;
                field1965 = 4;
            } else if (arg0.isMetaDown()) {
                field1980 = 2;
                field1965 = 2;
            } else {
                field1980 = 1;
                field1965 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1964 != null) {
            field1967 = 0;
            field1965 = 0;
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
        if (field1964 != null) {
            field1967 = 0;
            field1966 = arg0.getX();
            field1971 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1964 != null) {
            field1967 = 0;
            field1966 = -1;
            field1971 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1964 != null) {
            field1967 = 0;
            field1966 = arg0.getX();
            field1971 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1964 != null) {
            field1967 = 0;
            field1966 = arg0.getX();
            field1971 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1964 != null) {
            field1965 = 0;
        }
    }
}
