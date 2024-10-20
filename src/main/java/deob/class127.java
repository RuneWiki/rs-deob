package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("dr")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("dr.y")
    public static volatile int field2008 = 0;

    @ObfuscatedName("dr.u")
    public static class127 field2003 = new class127();

    @ObfuscatedName("dr.k")
    public static int field2005 = 0;

    @ObfuscatedName("dr.v")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dr.l")
    public static volatile int field2001 = 0;

    @ObfuscatedName("dr.g")
    public static volatile int field2002 = -1;

    @ObfuscatedName("dr.a")
    public static volatile int field2017 = -1;

    @ObfuscatedName("dr.x")
    public static int field2006 = 0;

    @ObfuscatedName("dr.r")
    public static int field2004 = 0;

    @ObfuscatedName("dr.w")
    public static volatile int field1999 = 0;

    @ObfuscatedName("dr.c")
    public static volatile int field2009 = 0;

    @ObfuscatedName("dr.f")
    public static volatile long field2016 = 0L;

    @ObfuscatedName("dr.o")
    public static int field2011 = 0;

    @ObfuscatedName("dr.p")
    public static int field2013 = 0;

    @ObfuscatedName("dr.n")
    public static int field2015 = 0;

    @ObfuscatedName("dr.m")
    public static long field2014 = 0L;

    @ObfuscatedName("ct.y(Ljava/awt/Component;I)V")
    public static void method1849(Component arg0) {
        arg0.addMouseListener(field2003);
        arg0.addMouseMotionListener(field2003);
        arg0.addFocusListener(field2003);
    }

    @ObfuscatedName("br.u(I)V")
    public static void method1592() {
        class127 var0 = field2003;
        synchronized (field2003) {
            field2004 = field2001;
            field2005 = field2002;
            field2006 = field2017;
            field2011 = field2008;
            field2013 = field1999;
            field2015 = field2009;
            field2014 = field2016;
            field2008 = 0;
        }
    }

    @ObfuscatedName("cn.k(I)I")
    public static int method1768() {
        return ++field2000 - 1;
    }

    @ObfuscatedName("gl.v(II)V")
    public static void method3401(int arg0) {
        field2000 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2003 != null) {
            field2000 = 0;
            field1999 = arg0.getX();
            field2009 = arg0.getY();
            field2016 = class103.method790();
            if (arg0.isAltDown()) {
                field2008 = 4;
                field2001 = 4;
            } else if (arg0.isMetaDown()) {
                field2008 = 2;
                field2001 = 2;
            } else {
                field2008 = 1;
                field2001 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2003 != null) {
            field2000 = 0;
            field2001 = 0;
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
        if (field2003 != null) {
            field2000 = 0;
            field2002 = arg0.getX();
            field2017 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2003 != null) {
            field2000 = 0;
            field2002 = -1;
            field2017 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2003 != null) {
            field2000 = 0;
            field2002 = arg0.getX();
            field2017 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2003 != null) {
            field2000 = 0;
            field2002 = arg0.getX();
            field2017 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2003 != null) {
            field2001 = 0;
        }
    }
}
