package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("bk")
public abstract class class122 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bk.oa")
    public static class122 field1860 = null;

    @ObfuscatedName("bk.oi")
    public static int field1862 = 0;

    @ObfuscatedName("bk.ow")
    public static long field1865 = 0L;

    @ObfuscatedName("bk.ox")
    public static boolean field1859 = false;

    @ObfuscatedName("bk.os")
    public static int field1875 = 20;

    @ObfuscatedName("bk.oy")
    public static int field1864 = 1;

    @ObfuscatedName("bk.oc")
    public static int field1861 = 0;

    @ObfuscatedName("bk.pm")
    public static long[] field1866 = new long[32];

    @ObfuscatedName("bk.pa")
    public static long[] field1867 = new long[32];

    @ObfuscatedName("bk.po")
    public static volatile boolean field1868 = true;

    @ObfuscatedName("bk.pn")
    public static int field1869 = 500;

    @ObfuscatedName("bk.pr")
    public static volatile boolean field1870 = false;

    @ObfuscatedName("bk.pj")
    public static volatile long field1871 = 0L;

    @ObfuscatedName("bk.pq")
    public static volatile boolean field1872 = true;

    @ObfuscatedName("bk.oz")
    public boolean field1874 = false;

    @ObfuscatedName("bk.oy(IIII)V")
    public final void method2023(int arg0, int arg1, int arg2) {
        try {
            if (field1860 != null) {
                field1862++;
                if (field1862 >= 3) {
                    this.method2032("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1860 = this;
            Statics.field1099 = arg0;
            Statics.field488 = arg1;
            Statics.field2018 = arg2;
            Statics.field2344 = this;
            if (Statics.field2009 == null) {
                Statics.field2009 = new class110();
            }
            Statics.field2009.method1905(this, 1);
        } catch (Exception var5) {
            class156.method2297((String) null, var5);
            this.method2032("crash");
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    @ObfuscatedName("bk.ol(B)Z")
    public final boolean method2024() {
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
                this.method2032("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1761 != null) {
                String var1 = Statics.field1761.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field57;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2032("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        boolean var7 = class99.method2362(var6, 10, true);
                        if (var7 && class99.method2705(var6) < 10) {
                            this.method2032("wrongjava");
                            return;
                        }
                    }
                    field1864 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2037();
            int var8 = Statics.field1099;
            int var9 = Statics.field488;
            Canvas var10 = Statics.field2359;
            class137 var12;
            try {
                class155 var11 = new class155();
                var11.method2281(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var20) {
                class157 var14 = new class157();
                var14.method2281(var8, var9, var10);
                var12 = var14;
            }
            Statics.field879 = var12;
            this.method1555();
            class113 var15;
            try {
                var15 = new class138();
            } catch (Throwable var19) {
                var15 = new class118();
            }
            Statics.field491 = var15;
            while (field1865 == 0L || Statics.method1882() < field1865) {
                Statics.field2227 = Statics.field491.method1934(field1875, field1864);
                for (int var17 = 0; var17 < Statics.field2227; var17++) {
                    this.method2025();
                }
                this.method2026();
                class111.method858(Statics.field2009, Statics.field2359);
            }
        } catch (Exception var21) {
            class156.method2297((String) null, var21);
            this.method2032("crash");
        }
        this.method2027();
    }

    @ObfuscatedName("bk.pt(B)V")
    public void method2025() {
        long var1 = Statics.method1882();
        long var3 = field1867[Statics.field385];
        field1867[Statics.field385] = var1;
        Statics.field385 = Statics.field385 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1020 = field1872;
        }
        this.method1556();
    }

    @ObfuscatedName("bk.pm(I)V")
    public void method2026() {
        long var1 = Statics.method1882();
        long var3 = field1866[Statics.field2546];
        field1866[Statics.field2546] = var1;
        Statics.field2546 = Statics.field2546 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1861 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1869 - 1 > 50) {
            field1869 -= 50;
            field1868 = true;
            Statics.field2359.setSize(Statics.field1099, Statics.field488);
            Statics.field2359.setVisible(true);
            if (Statics.field2513 == null) {
                Statics.field2359.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2513.getInsets();
                Statics.field2359.setLocation(var6.left, var6.top);
            }
        }
        this.method1557();
    }

    @ObfuscatedName("bk.pe(I)V")
    public final synchronized void method2027() {
        if (field1859) {
            return;
        }
        field1859 = true;
        try {
            Statics.field2359.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method1558();
        } catch (Exception var7) {
        }
        if (Statics.field2513 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2009 != null) {
            try {
                Statics.field2009.method1902();
            } catch (Exception var5) {
            }
        }
        this.method1698();
    }

    public void start() {
        if (field1860 == this && !field1859) {
            field1865 = 0L;
        }
    }

    public void stop() {
        if (field1860 == this && !field1859) {
            field1865 = Statics.method1882() + 4000L;
        }
    }

    public void destroy() {
        if (field1860 == this && !field1859) {
            field1865 = Statics.method1882();
            class30.method1166(5000L);
            this.method2027();
        }
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1860 != this || field1859) {
            return;
        }
        field1868 = true;
        if (Statics.field57 != null && Statics.field57.startsWith("1.5") && Statics.method1882() - field1871 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1099 && var2.height >= Statics.field488) {
                field1870 = true;
            }
        }
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void focusLost(FocusEvent arg0) {
        field1872 = false;
    }

    public abstract void init();

    @ObfuscatedName("bk.n(B)V")
    public abstract void method1556();

    @ObfuscatedName("bk.g(I)V")
    public abstract void method1557();

    @ObfuscatedName("bk.e(I)V")
    public abstract void method1558();

    @ObfuscatedName("bk.pv(Ljava/lang/String;B)V")
    public void method2032(String arg0) {
        if (this.field1874) {
            return;
        }
        this.field1874 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bk.o(B)V")
    public abstract void method1698();

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @ObfuscatedName("bk.oc(B)V")
    public final synchronized void method2037() {
        Container var1;
        if (Statics.field2513 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2513;
        }
        if (Statics.field2359 != null) {
            Statics.field2359.removeFocusListener(this);
            var1.remove(Statics.field2359);
        }
        Statics.field2359 = new class131(this);
        var1.add(Statics.field2359);
        Statics.field2359.setSize(Statics.field1099, Statics.field488);
        Statics.field2359.setVisible(true);
        if (Statics.field2513 == null) {
            Statics.field2359.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2513.getInsets();
            Statics.field2359.setLocation(var2.left, var2.top);
        }
        Statics.field2359.addFocusListener(this);
        Statics.field2359.requestFocus();
        field1868 = true;
        field1870 = false;
        field1871 = Statics.method1882();
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void windowActivated(WindowEvent arg0) {
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    public final void windowIconified(WindowEvent arg0) {
    }

    @ObfuscatedName("bk.r(B)V")
    public abstract void method1555();

    public final void focusGained(FocusEvent arg0) {
        field1872 = true;
        field1868 = true;
    }

    @ObfuscatedName("dd.py(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method632(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2359.getGraphics();
            if (Statics.field2583 == null) {
                Statics.field2583 = new Font("Helvetica", 1, 13);
                Statics.field1851 = Statics.field2359.getFontMetrics(Statics.field2583);
            }
            if (field1868) {
                field1868 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1099, Statics.field488);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2400 == null) {
                    Statics.field2400 = Statics.field2359.createImage(304, 34);
                }
                Graphics var4 = Statics.field2400.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2583);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1851.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2400, Statics.field1099 / 2 - 152, Statics.field488 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1099 / 2 - 152;
                int var7 = Statics.field488 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field2583);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1851.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2359.repaint();
        }
    }

    @ObfuscatedName("dr.pa(I)V")
    public static final void method757() {
        Statics.field491.method1933();
        for (int var0 = 0; var0 < 32; var0++) {
            field1866[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1867[var1] = 0L;
        }
        Statics.field2227 = 0;
    }
}
