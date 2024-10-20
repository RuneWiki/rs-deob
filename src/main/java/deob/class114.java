package deob;

import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("br")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("br.oj")
    public static class114 field1793 = null;

    @ObfuscatedName("br.oz")
    public static int field1791 = 0;

    @ObfuscatedName("br.ou")
    public static long field1789 = 0L;

    @ObfuscatedName("br.os")
    public static boolean field1786 = false;

    @ObfuscatedName("br.ov")
    public static int field1788 = 20;

    @ObfuscatedName("br.oo")
    public static int field1784 = 1;

    @ObfuscatedName("br.od")
    public static int field1790 = 0;

    @ObfuscatedName("br.ph")
    public static long[] field1783 = new long[32];

    @ObfuscatedName("br.pw")
    public static long[] field1792 = new long[32];

    @ObfuscatedName("br.pp")
    public static volatile boolean field1794 = true;

    @ObfuscatedName("br.pl")
    public static int field1797 = 500;

    @ObfuscatedName("br.pe")
    public static volatile boolean field1795 = false;

    @ObfuscatedName("br.pv")
    public static volatile long field1796 = 0L;

    @ObfuscatedName("br.pz")
    public static volatile boolean field1785 = true;

    @ObfuscatedName("br.ok")
    public boolean field1787 = false;

    @ObfuscatedName("br.po(IIIB)V")
    public final void method1987(int arg0, int arg1, int arg2) {
        try {
            if (field1793 != null) {
                field1791++;
                if (field1791 >= 3) {
                    this.method2000("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1793 = this;
            Statics.field1932 = arg0;
            Statics.field1257 = arg1;
            Statics.field535 = arg2;
            Statics.field2038 = this;
            if (Statics.field2717 == null) {
                Statics.field2717 = new class130();
            }
            Statics.field2717.method2224(this, 1);
        } catch (Exception var5) {
            class136.method1295((String) null, var5);
            this.method2000("crash");
        }
    }

    @ObfuscatedName("br.pc(B)V")
    public final synchronized void method1988() {
        Container var1;
        if (Statics.field580 == null) {
            var1 = this;
        } else {
            var1 = Statics.field580;
        }
        if (Statics.field1009 != null) {
            Statics.field1009.removeFocusListener(this);
            var1.remove(Statics.field1009);
        }
        Statics.field1009 = new class108(this);
        var1.add(Statics.field1009);
        Statics.field1009.setSize(Statics.field1932, Statics.field1257);
        Statics.field1009.setVisible(true);
        if (Statics.field580 == null) {
            Statics.field1009.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field580.getInsets();
            Statics.field1009.setLocation(var2.left, var2.top);
        }
        Statics.field1009.addFocusListener(this);
        Statics.field1009.requestFocus();
        field1794 = true;
        field1795 = false;
        field1796 = class42.method1378();
    }

    @ObfuscatedName("br.pg(B)Z")
    public final boolean method1989() {
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
                this.method2000("invalidhost");
                return false;
            }
        }
    }

    @ObfuscatedName("br.pq(B)V")
    public void method1991() {
        long var1 = class42.method1378();
        long var3 = field1792[Statics.field1918];
        field1792[Statics.field1918] = var1;
        Statics.field1918 = Statics.field1918 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2304 = field1785;
        }
        this.method1593();
    }

    @ObfuscatedName("br.pt(I)V")
    public final synchronized void method1993() {
        if (field1786) {
            return;
        }
        field1786 = true;
        try {
            Statics.field1009.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method1595();
        } catch (Exception var7) {
        }
        if (Statics.field580 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2717 != null) {
            try {
                Statics.field2717.method2243();
            } catch (Exception var5) {
            }
        }
        this.method1590();
    }

    public void stop() {
        if (field1793 == this && !field1786) {
            field1789 = class42.method1378() + 4000L;
        }
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1793 != this || field1786) {
            return;
        }
        field1794 = true;
        if (Statics.field1944 != null && Statics.field1944.startsWith("1.5") && class42.method1378() - field1796 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1932 && var2.height >= Statics.field1257) {
                field1795 = true;
            }
        }
    }

    public final void windowActivated(WindowEvent arg0) {
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

    public abstract void init();

    @ObfuscatedName("br.x(I)V")
    public abstract void method1592();

    @ObfuscatedName("br.d(B)V")
    public abstract void method1593();

    @ObfuscatedName("br.j(I)V")
    public abstract void method1707();

    @ObfuscatedName("br.g(B)V")
    public abstract void method1595();

    @ObfuscatedName("br.pu(Ljava/lang/String;B)V")
    public void method2000(String arg0) {
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

    @ObfuscatedName("br.m(I)V")
    public abstract void method1590();

    public final void focusLost(FocusEvent arg0) {
        field1785 = false;
    }

    public void start() {
        if (field1793 == this && !field1786) {
            field1789 = 0L;
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public void destroy() {
        if (field1793 == this && !field1786) {
            field1789 = class42.method1378();
            class134.method1468(5000L);
            this.method1993();
        }
    }

    public void run() {
        try {
            if (Statics.field1935 != null) {
                String var1 = Statics.field1935.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1944;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2000("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class97.method2285(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class97.method3043(var4) && class97.method2271(var4) < 10) {
                            this.method2000("wrongjava");
                            return;
                        }
                    }
                    field1784 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1988();
            Statics.field1059 = class159.method2078(Statics.field1932, Statics.field1257, Statics.field1009);
            this.method1592();
            Statics.field1094 = class115.method3142();
            while (field1789 == 0L || class42.method1378() < field1789) {
                Statics.field1330 = Statics.field1094.method2068(field1788, field1784);
                for (int var5 = 0; var5 < Statics.field1330; var5++) {
                    this.method1991();
                }
                this.method2065();
                class127.method1078(Statics.field2717, Statics.field1009);
            }
        } catch (Exception var7) {
            class136.method1295((String) null, var7);
            this.method2000("crash");
        }
        this.method1993();
    }

    public final void focusGained(FocusEvent arg0) {
        field1785 = true;
        field1794 = true;
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    @ObfuscatedName("br.py(I)V")
    public void method2065() {
        long var1 = class42.method1378();
        long var3 = field1783[Statics.field1769];
        field1783[Statics.field1769] = var1;
        Statics.field1769 = Statics.field1769 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1790 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1797 - 1 > 50) {
            field1797 -= 50;
            field1794 = true;
            Statics.field1009.setSize(Statics.field1932, Statics.field1257);
            Statics.field1009.setVisible(true);
            if (Statics.field580 == null) {
                Statics.field1009.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field580.getInsets();
                Statics.field1009.setLocation(var6.left, var6.top);
            }
        }
        this.method1707();
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    @ObfuscatedName("d.pp(B)V")
    public static final void method922() {
        Statics.field1284 = null;
        Statics.field1112 = null;
        Statics.field1780 = null;
    }
}
