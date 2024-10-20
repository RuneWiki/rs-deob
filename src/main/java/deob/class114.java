package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("de")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("de.py")
    public static class114 field1777 = null;

    @ObfuscatedName("de.pr")
    public static int field1772 = 0;

    @ObfuscatedName("de.pk")
    public static long field1773 = 0L;

    @ObfuscatedName("de.ph")
    public static boolean field1774 = false;

    @ObfuscatedName("de.pc")
    public static int field1785 = 20;

    @ObfuscatedName("de.qb")
    public static int field1778 = 1;

    @ObfuscatedName("de.ql")
    public static int field1776 = 0;

    @ObfuscatedName("de.qg")
    public static long[] field1779 = new long[32];

    @ObfuscatedName("de.qq")
    public static long[] field1780 = new long[32];

    @ObfuscatedName("de.qh")
    public static int field1781 = 0;

    @ObfuscatedName("de.qd")
    public static int field1782 = 0;

    @ObfuscatedName("de.qx")
    public static volatile boolean field1784 = true;

    @ObfuscatedName("de.qz")
    public static int field1783 = 500;

    @ObfuscatedName("de.qt")
    public static boolean field1771 = false;

    @ObfuscatedName("de.qp")
    public static volatile boolean field1787 = false;

    @ObfuscatedName("de.qi")
    public static volatile long field1786 = 0L;

    @ObfuscatedName("de.rd")
    public static volatile boolean field1789 = true;

    @ObfuscatedName("de.pj")
    public boolean field1775 = false;

    @ObfuscatedName("de.rg(IIIB)V")
    public final void method1925(int arg0, int arg1, int arg2) {
        try {
            if (field1777 != null) {
                field1772++;
                if (field1772 >= 3) {
                    this.method1935("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1777 = this;
            Statics.field187 = arg0;
            Statics.field908 = arg1;
            Statics.field1654 = arg2;
            Statics.field1653 = this;
            if (Statics.field253 == null) {
                Statics.field253 = new class104();
            }
            Statics.field253.method1806(this, 1);
        } catch (Exception var5) {
            class102.method690((String) null, var5);
            this.method1935("crash");
        }
    }

    @ObfuscatedName("de.ro(I)V")
    public final synchronized void method1927() {
        Container var1 = this.method1951();
        if (Statics.field578 != null) {
            Statics.field578.removeFocusListener(this);
            var1.remove(Statics.field578);
        }
        Statics.field187 = Math.max(var1.getWidth(), Statics.field2119);
        Statics.field908 = Math.max(var1.getHeight(), Statics.field1188);
        if (Statics.field1856 != null) {
            Insets var2 = Statics.field1856.getInsets();
            Statics.field187 -= var2.right + var2.left;
            Statics.field908 -= var2.top + var2.bottom;
        }
        Statics.field578 = new class112(this);
        var1.add(Statics.field578);
        Statics.field578.setSize(Statics.field187, Statics.field908);
        Statics.field578.setVisible(true);
        if (Statics.field1856 == var1) {
            Insets var3 = Statics.field1856.getInsets();
            Statics.field578.setLocation(field1781 + var3.left, field1782 + var3.top);
        } else {
            Statics.field578.setLocation(field1781, field1782);
        }
        Statics.field578.addFocusListener(this);
        Statics.field578.requestFocus();
        field1784 = true;
        int var4 = Statics.field187;
        int var5 = Statics.field908;
        Canvas var6 = Statics.field578;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3626(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3626(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1059 != null) {
            Statics.field1059.method3625(var8.field3185.getGraphics(), 0, 0);
        }
        Statics.field1059 = var8;
        field1787 = false;
        field1786 = Statics.method28();
    }

    @ObfuscatedName("de.rc(B)Z")
    public final boolean method1928() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
            return true;
        } else if (var1.equals("mechscape.com") || var1.endsWith(".mechscape.com")) {
            return true;
        } else if (var1.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                var1 = var1.substring(0, var1.length() - 1);
            }
            if (var1.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1935("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1671 != null) {
                String var1 = Statics.field1671.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1670;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1935("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method3072(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class208.method2965(var4, 10, true);
                        if (var5) {
                            int var6 = class208.method814(var4, 10, true);
                            if (var6 < 10) {
                                this.method1935("wrongjava");
                                return;
                            }
                        }
                    }
                    field1778 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1927();
            this.method535();
            Statics.field1655 = class110.method1755();
            while (field1773 == 0L || Statics.method28() < field1773) {
                Statics.field896 = Statics.field1655.method1776(field1785, field1778);
                for (int var7 = 0; var7 < Statics.field896; var7++) {
                    this.method1930();
                }
                this.method1958();
                class109.method758(Statics.field253, Statics.field578);
            }
        } catch (Exception var9) {
            class102.method690((String) null, var9);
            this.method1935("crash");
        }
        this.method1931();
    }

    @ObfuscatedName("de.rp(B)V")
    public void method1930() {
        long var1 = Statics.method28();
        long var3 = field1780[Statics.field2197];
        field1780[Statics.field2197] = var1;
        Statics.field2197 = Statics.field2197 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field957 = field1789;
        }
        this.method233();
    }

    @ObfuscatedName("de.rt(B)V")
    public void method1958() {
        Container var1 = this.method1951();
        long var2 = Statics.method28();
        long var4 = field1779[Statics.field887];
        field1779[Statics.field887] = var2;
        Statics.field887 = Statics.field887 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1776 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1783 - 1 > 50) {
            field1783 -= 50;
            field1784 = true;
            Statics.field578.setSize(Statics.field187, Statics.field908);
            Statics.field578.setVisible(true);
            if (Statics.field1856 == var1) {
                Insets var7 = Statics.field1856.getInsets();
                Statics.field578.setLocation(field1781 + var7.left, field1782 + var7.top);
            } else {
                Statics.field578.setLocation(field1781, field1782);
            }
        }
        this.method234();
    }

    @ObfuscatedName("de.rw(B)V")
    public final synchronized void method1931() {
        if (field1774) {
            return;
        }
        field1774 = true;
        try {
            Statics.field578.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method391();
        } catch (Exception var7) {
        }
        if (Statics.field1856 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field253 != null) {
            try {
                Statics.field253.method1825();
            } catch (Exception var5) {
            }
        }
        this.method229();
    }

    public void start() {
        if (field1777 == this && !field1774) {
            field1773 = 0L;
        }
    }

    public void stop() {
        if (field1777 == this && !field1774) {
            field1773 = Statics.method28() + 4000L;
        }
    }

    public void destroy() {
        if (field1777 == this && !field1774) {
            field1773 = Statics.method28();
            class162.method746(5000L);
            this.method1931();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1777 != this || field1774) {
            return;
        }
        field1784 = true;
        if (Statics.field1670 != null && Statics.field1670.startsWith("1.5") && Statics.method28() - field1786 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field187 && var2.height >= Statics.field908) {
                field1787 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1789 = true;
        field1784 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1789 = false;
    }

    public final void windowActivated(WindowEvent arg0) {
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void windowIconified(WindowEvent arg0) {
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    @ObfuscatedName("de.re(Ljava/lang/String;B)V")
    public void method1935(String arg0) {
        if (this.field1775) {
            return;
        }
        this.field1775 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("de.rq(I)Ljava/awt/Container;")
    public Container method1951() {
        return Statics.field1856 == null ? this : Statics.field1856;
    }

    @ObfuscatedName("de.rf(I)Ljava/awt/Dimension;")
    public Dimension method1946() {
        Container var1 = this.method1951();
        int var2 = Math.max(var1.getWidth(), Statics.field2119);
        int var3 = Math.max(var1.getHeight(), Statics.field1188);
        if (Statics.field1856 != null) {
            Insets var4 = Statics.field1856.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("de.k(I)V")
    public abstract void method229();

    public abstract void init();

    @ObfuscatedName("de.m(I)V")
    public abstract void method391();

    @ObfuscatedName("de.n(I)V")
    public abstract void method234();

    @ObfuscatedName("de.x(B)V")
    public abstract void method535();

    @ObfuscatedName("de.r(I)V")
    public abstract void method233();
}
