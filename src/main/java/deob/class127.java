package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dr")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dr.i")
    public static class127 field2004 = new class127();

    @ObfuscatedName("dr.c")
    public static volatile int field1991 = 0;

    @ObfuscatedName("dr.h")
    public static volatile int field1992 = 0;

    @ObfuscatedName("dr.v")
    public static volatile int field1993 = -1;

    @ObfuscatedName("dr.q")
    public static volatile int field1990 = -1;

    @ObfuscatedName("dr.s")
    public static int field1994 = 0;

    @ObfuscatedName("dr.g")
    public static int field1996 = 0;

    @ObfuscatedName("dr.u")
    public static int field1997 = 0;

    @ObfuscatedName("dr.d")
    public static volatile int field1998 = 0;

    @ObfuscatedName("dr.y")
    public static volatile int field1995 = 0;

    @ObfuscatedName("dr.e")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dr.l")
    public static volatile long field2006 = 0L;

    @ObfuscatedName("dr.o")
    public static int field2002 = 0;

    @ObfuscatedName("dr.w")
    public static int field2003 = 0;

    @ObfuscatedName("dr.t")
    public static int field1999 = 0;

    @ObfuscatedName("dr.z")
    public static long field2005 = 0L;

    @ObfuscatedName("dg.i(Ljava/awt/Component;I)V")
    public static void method2432(Component arg0) {
        arg0.addMouseListener(field2004);
        arg0.addMouseMotionListener(field2004);
        arg0.addFocusListener(field2004);
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1995 = arg0.getX();
            field2000 = arg0.getY();
            field2006 = class103.method1055();
            if (arg0.isAltDown()) {
                field1998 = 4;
                field1992 = 4;
            } else if (arg0.isMetaDown()) {
                field1998 = 2;
                field1992 = 2;
            } else {
                field1998 = 1;
                field1992 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1992 = 0;
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
        if (field2004 != null) {
            field1991 = 0;
            field1993 = arg0.getX();
            field1990 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1993 = -1;
            field1990 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1993 = arg0.getX();
            field1990 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2004 != null) {
            field1991 = 0;
            field1993 = arg0.getX();
            field1990 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2004 != null) {
            field1992 = 0;
        }
    }
}
