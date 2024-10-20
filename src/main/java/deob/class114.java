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

@ObfuscatedName("df")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("df.pu")
    public static class114 field1783 = null;

    @ObfuscatedName("df.qd")
    public static int field1771 = 0;

    @ObfuscatedName("df.qj")
    public static long field1768 = 0L;

    @ObfuscatedName("df.qx")
    public static boolean field1769 = false;

    @ObfuscatedName("df.qn")
    public static int field1770 = 20;

    @ObfuscatedName("df.qf")
    public static int field1772 = 1;

    @ObfuscatedName("df.ql")
    public static int field1773 = 0;

    @ObfuscatedName("df.qp")
    public static long[] field1774 = new long[32];

    @ObfuscatedName("df.qo")
    public static long[] field1775 = new long[32];

    @ObfuscatedName("df.qs")
    public static int field1767 = 0;

    @ObfuscatedName("df.qw")
    public static int field1784 = 0;

    @ObfuscatedName("df.rc")
    public static volatile boolean field1778 = true;

    @ObfuscatedName("df.re")
    public static int field1779 = 500;

    @ObfuscatedName("df.rz")
    public static boolean field1780 = false;

    @ObfuscatedName("df.rt")
    public static volatile boolean field1781 = false;

    @ObfuscatedName("df.rj")
    public static volatile long field1782 = 0L;

    @ObfuscatedName("df.ru")
    public static volatile boolean field1766 = true;

    @ObfuscatedName("df.qi")
    public boolean field1777 = false;

    @ObfuscatedName("df.qt(IIIS)V")
    public final void method1984(int arg0, int arg1, int arg2) {
        try {
            if (field1783 != null) {
                field1771++;
                if (field1771 >= 3) {
                    this.method1994("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1783 = this;
            Statics.field2761 = arg0;
            Statics.field2727 = arg1;
            Statics.field1642 = arg2;
            Statics.field1640 = this;
            if (Statics.field897 == null) {
                Statics.field897 = new class104();
            }
            Statics.field897.method1852(this, 1);
        } catch (Exception var5) {
            class102.method3059((String) null, var5);
            this.method1994("crash");
        }
    }

    @ObfuscatedName("df.qg(I)V")
    public final synchronized void method1985() {
        Container var1 = this.method1995();
        if (Statics.field1090 != null) {
            Statics.field1090.removeFocusListener(this);
            var1.remove(Statics.field1090);
        }
        Statics.field2761 = Math.max(var1.getWidth(), Statics.field1564);
        Statics.field2727 = Math.max(var1.getHeight(), Statics.field211);
        if (Statics.field27 != null) {
            Insets var2 = Statics.field27.getInsets();
            Statics.field2761 -= var2.right + var2.left;
            Statics.field2727 -= var2.top + var2.bottom;
        }
        Statics.field1090 = new class112(this);
        var1.add(Statics.field1090);
        Statics.field1090.setSize(Statics.field2761, Statics.field2727);
        Statics.field1090.setVisible(true);
        if (Statics.field27 == var1) {
            Insets var3 = Statics.field27.getInsets();
            Statics.field1090.setLocation(field1767 + var3.left, field1784 + var3.top);
        } else {
            Statics.field1090.setLocation(field1767, field1784);
        }
        Statics.field1090.addFocusListener(this);
        Statics.field1090.requestFocus();
        field1778 = true;
        class225 var4 = class225.method3592(Statics.field2761, Statics.field2727, Statics.field1090);
        if (Statics.field1527 != null) {
            Statics.field1527.method3848(var4.field3216.getGraphics(), 0, 0);
        }
        Statics.field1527 = var4;
        field1781 = false;
        field1782 = class132.method1336();
    }

    @ObfuscatedName("df.qs(I)Z")
    public final boolean method2004() {
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
                this.method1994("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1660 != null) {
                String var1 = Statics.field1660.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1669;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1994("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class215.method2456(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class215.method2842(var4)) {
                            int var5 = class215.method594(var4, 10, true);
                            if (var5 < 10) {
                                this.method1994("wrongjava");
                                return;
                            }
                        }
                    }
                    field1772 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1985();
            this.method262();
            class110 var6;
            try {
                var6 = new class99();
            } catch (Throwable var10) {
                var6 = new class100();
            }
            Statics.field917 = var6;
            while (field1768 == 0L || class132.method1336() < field1768) {
                Statics.field131 = Statics.field917.method1826(field1770, field1772);
                for (int var8 = 0; var8 < Statics.field131; var8++) {
                    this.method1987();
                }
                this.method1988();
                class109.method2728(Statics.field897, Statics.field1090);
            }
        } catch (Exception var11) {
            class102.method3059((String) null, var11);
            this.method1994("crash");
        }
        this.method1989();
    }

    @ObfuscatedName("df.qw(I)V")
    public void method1987() {
        long var1 = class132.method1336();
        long var3 = field1775[Statics.field1728];
        field1775[Statics.field1728] = var1;
        Statics.field1728 = Statics.field1728 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2832 = field1766;
        }
        this.method374();
    }

    @ObfuscatedName("df.qa(I)V")
    public void method1988() {
        Container var1 = this.method1995();
        long var2 = class132.method1336();
        long var4 = field1774[Statics.field1175];
        field1774[Statics.field1175] = var2;
        Statics.field1175 = Statics.field1175 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1773 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1779 - 1 > 50) {
            field1779 -= 50;
            field1778 = true;
            Statics.field1090.setSize(Statics.field2761, Statics.field2727);
            Statics.field1090.setVisible(true);
            if (Statics.field27 == var1) {
                Insets var7 = Statics.field27.getInsets();
                Statics.field1090.setLocation(field1767 + var7.left, field1784 + var7.top);
            } else {
                Statics.field1090.setLocation(field1767, field1784);
            }
        }
        this.method451();
    }

    @ObfuscatedName("df.qe(I)V")
    public final synchronized void method1989() {
        if (field1769) {
            return;
        }
        field1769 = true;
        try {
            Statics.field1090.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method265();
        } catch (Exception var7) {
        }
        if (Statics.field27 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field897 != null) {
            try {
                Statics.field897.method1860();
            } catch (Exception var5) {
            }
        }
        this.method260();
    }

    public void start() {
        if (field1783 == this && !field1769) {
            field1768 = 0L;
        }
    }

    public void stop() {
        if (field1783 == this && !field1769) {
            field1768 = class132.method1336() + 4000L;
        }
    }

    public void destroy() {
        if (field1783 == this && !field1769) {
            field1768 = class132.method1336();
            class138.method15(5000L);
            this.method1989();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1783 != this || field1769) {
            return;
        }
        field1778 = true;
        if (Statics.field1669 != null && Statics.field1669.startsWith("1.5") && class132.method1336() - field1782 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2761 && var2.height >= Statics.field2727) {
                field1781 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1766 = true;
        field1778 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1766 = false;
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

    @ObfuscatedName("df.qy(Ljava/lang/String;B)V")
    public void method1994(String arg0) {
        if (this.field1777) {
            return;
        }
        this.field1777 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("df.qu(B)Ljava/awt/Container;")
    public Container method1995() {
        return Statics.field27 == null ? this : Statics.field27;
    }

    @ObfuscatedName("df.qc(B)Ljava/awt/Dimension;")
    public Dimension method1996() {
        Container var1 = this.method1995();
        int var2 = Math.max(var1.getWidth(), Statics.field1564);
        int var3 = Math.max(var1.getHeight(), Statics.field211);
        if (Statics.field27 != null) {
            Insets var4 = Statics.field27.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("df.r(S)V")
    public abstract void method262();

    @ObfuscatedName("df.s(I)V")
    public abstract void method374();

    @ObfuscatedName("df.e(S)V")
    public abstract void method265();

    @ObfuscatedName("df.p(I)V")
    public abstract void method260();

    @ObfuscatedName("df.k(I)V")
    public abstract void method451();
}
