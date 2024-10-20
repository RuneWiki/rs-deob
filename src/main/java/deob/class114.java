package deob;

import java.applet.Applet;
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

@ObfuscatedName("dn")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dn.pc")
    public static class114 field1786 = null;

    @ObfuscatedName("dn.qr")
    public static int field1794 = 0;

    @ObfuscatedName("dn.qb")
    public static long field1785 = 0L;

    @ObfuscatedName("dn.qk")
    public static boolean field1784 = false;

    @ObfuscatedName("dn.qq")
    public static int field1799 = 20;

    @ObfuscatedName("dn.qa")
    public static int field1789 = 1;

    @ObfuscatedName("dn.qw")
    public static int field1790 = 0;

    @ObfuscatedName("dn.qn")
    public static long[] field1792 = new long[32];

    @ObfuscatedName("dn.qv")
    public static long[] field1796 = new long[32];

    @ObfuscatedName("dn.qd")
    public static int field1793 = 0;

    @ObfuscatedName("dn.ql")
    public static int field1783 = 0;

    @ObfuscatedName("dn.rg")
    public static volatile boolean field1788 = true;

    @ObfuscatedName("dn.rf")
    public static int field1797 = 500;

    @ObfuscatedName("dn.ro")
    public static boolean field1798 = false;

    @ObfuscatedName("dn.rn")
    public static volatile boolean field1795 = false;

    @ObfuscatedName("dn.ru")
    public static volatile long field1800 = 0L;

    @ObfuscatedName("dn.rr")
    public static volatile boolean field1801 = true;

    @ObfuscatedName("dn.qh")
    public boolean field1787 = false;

    @ObfuscatedName("dn.qa(IIIB)V")
    public final void method2008(int arg0, int arg1, int arg2) {
        try {
            if (field1786 != null) {
                field1794++;
                if (field1794 >= 3) {
                    this.method2018("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1786 = this;
            Statics.field756 = arg0;
            Statics.field2208 = arg1;
            Statics.field1682 = arg2;
            Statics.field1681 = this;
            if (Statics.field1756 == null) {
                Statics.field1756 = new class104();
            }
            Statics.field1756.method1885(this, 1);
        } catch (Exception var5) {
            Statics.method1851((String) null, var5);
            this.method2018("crash");
        }
    }

    @ObfuscatedName("dn.qw(I)V")
    public final synchronized void method2040() {
        Container var1 = this.method2019();
        if (Statics.field900 != null) {
            Statics.field900.removeFocusListener(this);
            var1.remove(Statics.field900);
        }
        Statics.field756 = Math.max(var1.getWidth(), Statics.field832);
        Statics.field2208 = Math.max(var1.getHeight(), Statics.field1803);
        if (Statics.field1861 != null) {
            Insets var2 = Statics.field1861.getInsets();
            Statics.field756 -= var2.right + var2.left;
            Statics.field2208 -= var2.top + var2.bottom;
        }
        Statics.field900 = new class112(this);
        var1.add(Statics.field900);
        Statics.field900.setSize(Statics.field756, Statics.field2208);
        Statics.field900.setVisible(true);
        if (Statics.field1861 == var1) {
            Insets var3 = Statics.field1861.getInsets();
            Statics.field900.setLocation(field1793 + var3.left, field1783 + var3.top);
        } else {
            Statics.field900.setLocation(field1793, field1783);
        }
        Statics.field900.addFocusListener(this);
        Statics.field900.requestFocus();
        field1788 = true;
        class221 var4 = class221.method70(Statics.field756, Statics.field2208, Statics.field900);
        if (Statics.field1828 != null) {
            Statics.field1828.method3762(var4.field3196.getGraphics(), 0, 0);
        }
        Statics.field1828 = var4;
        field1795 = false;
        field1800 = class156.method848();
    }

    @ObfuscatedName("dn.qi(B)Z")
    public final boolean method2010() {
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
                this.method2018("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1701 != null) {
                String var1 = Statics.field1701.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1693;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2018("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method3611(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class208.method1994(var4)) {
                            int var5 = class208.method3324(var4, 10, true);
                            if (var5 < 10) {
                                this.method2018("wrongjava");
                                return;
                            }
                        }
                    }
                    field1789 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2040();
            this.method241();
            class110 var6;
            try {
                var6 = new class99();
            } catch (Throwable var10) {
                var6 = new class100();
            }
            Statics.field1591 = var6;
            while (field1785 == 0L || class156.method848() < field1785) {
                Statics.field1584 = Statics.field1591.method1856(field1799, field1789);
                for (int var8 = 0; var8 < Statics.field1584; var8++) {
                    this.method2011();
                }
                this.method2017();
                class109.method3196(Statics.field1756, Statics.field900);
            }
        } catch (Exception var11) {
            Statics.method1851((String) null, var11);
            this.method2018("crash");
        }
        this.method2028();
    }

    @ObfuscatedName("dn.qz(I)V")
    public void method2011() {
        long var1 = class156.method848();
        long var3 = field1796[Statics.field294];
        field1796[Statics.field294] = var1;
        Statics.field294 = Statics.field294 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1804 = field1801;
        }
        this.method530();
    }

    @ObfuscatedName("dn.qn(I)V")
    public void method2017() {
        Container var1 = this.method2019();
        long var2 = class156.method848();
        long var4 = field1792[Statics.field835];
        field1792[Statics.field835] = var2;
        Statics.field835 = Statics.field835 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1790 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1797 - 1 > 50) {
            field1797 -= 50;
            field1788 = true;
            Statics.field900.setSize(Statics.field756, Statics.field2208);
            Statics.field900.setVisible(true);
            if (Statics.field1861 == var1) {
                Insets var7 = Statics.field1861.getInsets();
                Statics.field900.setLocation(field1793 + var7.left, field1783 + var7.top);
            } else {
                Statics.field900.setLocation(field1793, field1783);
            }
        }
        this.method243();
    }

    @ObfuscatedName("dn.qj(B)V")
    public final synchronized void method2028() {
        if (field1784) {
            return;
        }
        field1784 = true;
        try {
            Statics.field900.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method244();
        } catch (Exception var7) {
        }
        if (Statics.field1861 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1756 != null) {
            try {
                Statics.field1756.method1882();
            } catch (Exception var5) {
            }
        }
        this.method288();
    }

    @ObfuscatedName("cl.qv(I)V")
    public static final void method1479() {
        Statics.field1591.method1855();
        for (int var0 = 0; var0 < 32; var0++) {
            field1792[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1796[var1] = 0L;
        }
        Statics.field1584 = 0;
    }

    public void start() {
        if (field1786 == this && !field1784) {
            field1785 = 0L;
        }
    }

    public void stop() {
        if (field1786 == this && !field1784) {
            field1785 = class156.method848() + 4000L;
        }
    }

    public void destroy() {
        if (field1786 == this && !field1784) {
            field1785 = class156.method848();
            class162.method2141(5000L);
            this.method2028();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1786 != this || field1784) {
            return;
        }
        field1788 = true;
        if (Statics.field1693 != null && Statics.field1693.startsWith("1.5") && class156.method848() - field1800 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field756 && var2.height >= Statics.field2208) {
                field1795 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1801 = true;
        field1788 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1801 = false;
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

    @ObfuscatedName("dn.qt(Ljava/lang/String;S)V")
    public void method2018(String arg0) {
        if (this.field1787) {
            return;
        }
        this.field1787 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dn.qx(I)Ljava/awt/Container;")
    public Container method2019() {
        return Statics.field1861 == null ? this : Statics.field1861;
    }

    @ObfuscatedName("dn.qe(I)Ljava/awt/Dimension;")
    public Dimension method2020() {
        Container var1 = this.method2019();
        int var2 = Math.max(var1.getWidth(), Statics.field832);
        int var3 = Math.max(var1.getHeight(), Statics.field1803);
        if (Statics.field1861 != null) {
            Insets var4 = Statics.field1861.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("dn.n(B)V")
    public abstract void method241();

    @ObfuscatedName("dn.m(I)V")
    public abstract void method530();

    @ObfuscatedName("dn.w(I)V")
    public abstract void method243();

    public abstract void init();

    @ObfuscatedName("dn.r(I)V")
    public abstract void method288();

    @ObfuscatedName("dn.j(I)V")
    public abstract void method244();
}
