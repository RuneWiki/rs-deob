package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ds")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ds.l")
    public static class129 field1993 = new class129();

    @ObfuscatedName("ds.y")
    public static volatile int field1998 = 0;

    @ObfuscatedName("ds.g")
    public static volatile int field1991 = 0;

    @ObfuscatedName("ds.j")
    public static volatile int field1992 = 0;

    @ObfuscatedName("ds.w")
    public static volatile int field2003 = -1;

    @ObfuscatedName("ds.c")
    public static volatile int field1994 = -1;

    @ObfuscatedName("ds.x")
    public static int field1997 = 0;

    @ObfuscatedName("ds.f")
    public static int field1995 = 0;

    @ObfuscatedName("ds.t")
    public static int field1990 = 0;

    @ObfuscatedName("ds.n")
    public static volatile int field1999 = 0;

    @ObfuscatedName("ds.p")
    public static volatile int field2000 = 0;

    @ObfuscatedName("ds.a")
    public static volatile long field2001 = 0L;

    @ObfuscatedName("ds.o")
    public static int field2002 = 0;

    @ObfuscatedName("ds.b")
    public static int field1996 = 0;

    @ObfuscatedName("ds.r")
    public static int field2004 = 0;

    @ObfuscatedName("ds.z")
    public static long field2005 = 0L;

    @ObfuscatedName("dt.l(Ljava/awt/Component;I)V")
    public static void method2471(Component arg0) {
        arg0.addMouseListener(field1993);
        arg0.addMouseMotionListener(field1993);
        arg0.addFocusListener(field1993);
    }

    @ObfuscatedName("s.y(II)V")
    public static void method457(int arg0) {
        field1991 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1993 != null) {
            field1991 = 0;
            field1999 = arg0.getX();
            field2000 = arg0.getY();
            field2001 = class104.method2616();
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
        if (field1993 != null) {
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
        if (field1993 != null) {
            field1991 = 0;
            field2003 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1993 != null) {
            field1991 = 0;
            field2003 = -1;
            field1994 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1993 != null) {
            field1991 = 0;
            field2003 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1993 != null) {
            field1991 = 0;
            field2003 = arg0.getX();
            field1994 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1993 != null) {
            field1992 = 0;
        }
    }
}
