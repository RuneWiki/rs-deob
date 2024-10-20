package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dr")
public class class129 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dr.e")
    public static class129 field2005 = new class129();

    @ObfuscatedName("dr.v")
    public static volatile int field1998 = 0;

    @ObfuscatedName("dr.k")
    public static int field2003 = 0;

    @ObfuscatedName("dr.g")
    public static volatile int field2002 = 0;

    @ObfuscatedName("dr.q")
    public static volatile int field2011 = -1;

    @ObfuscatedName("dr.l")
    public static volatile int field2001 = -1;

    @ObfuscatedName("dr.a")
    public static int field1999 = 0;

    @ObfuscatedName("dr.b")
    public static int field2004 = 0;

    @ObfuscatedName("dr.z")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dr.w")
    public static volatile int field2007 = 0;

    @ObfuscatedName("dr.j")
    public static volatile int field2006 = 0;

    @ObfuscatedName("dr.p")
    public static volatile long field2008 = 0L;

    @ObfuscatedName("dr.n")
    public static int field2009 = 0;

    @ObfuscatedName("dr.r")
    public static int field2010 = 0;

    @ObfuscatedName("dr.s")
    public static int field1997 = 0;

    @ObfuscatedName("dr.f")
    public static long field2012 = 0L;

    @ObfuscatedName("cg.e(Ljava/awt/Component;I)V")
    public static void method2041(Component arg0) {
        arg0.addMouseListener(field2005);
        arg0.addMouseMotionListener(field2005);
        arg0.addFocusListener(field2005);
    }

    @ObfuscatedName("j.v(Ljava/awt/Component;I)V")
    public static void method126(Component arg0) {
        arg0.removeMouseListener(field2005);
        arg0.removeMouseMotionListener(field2005);
        arg0.removeFocusListener(field2005);
        field2002 = 0;
    }

    @ObfuscatedName("cz.k(I)V")
    public static void method1961() {
        if (field2005 != null) {
            class129 var0 = field2005;
            synchronized (field2005) {
                field2005 = null;
            }
        }
    }

    @ObfuscatedName("ao.g(B)V")
    public static void method588() {
        class129 var0 = field2005;
        synchronized (field2005) {
            field1999 = field2002;
            field2003 = field2011;
            field2004 = field2001;
            field2009 = field2000;
            field2010 = field2007;
            field1997 = field2006;
            field2012 = field2008;
            field2000 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2005 != null) {
            field1998 = 0;
            field2007 = arg0.getX();
            field2006 = arg0.getY();
            field2008 = class104.method567();
            if (arg0.isAltDown()) {
                field2000 = 4;
                field2002 = 4;
            } else if (arg0.isMetaDown()) {
                field2000 = 2;
                field2002 = 2;
            } else {
                field2000 = 1;
                field2002 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2005 != null) {
            field1998 = 0;
            field2002 = 0;
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
        if (field2005 != null) {
            field1998 = 0;
            field2011 = arg0.getX();
            field2001 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2005 != null) {
            field1998 = 0;
            field2011 = -1;
            field2001 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2005 != null) {
            field1998 = 0;
            field2011 = arg0.getX();
            field2001 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2005 != null) {
            field1998 = 0;
            field2011 = arg0.getX();
            field2001 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2005 != null) {
            field2002 = 0;
        }
    }
}
