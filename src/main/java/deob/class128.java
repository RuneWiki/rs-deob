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

@ObfuscatedName("db")
public abstract class class128 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("db.ow")
    public static class128 field2040 = null;

    @ObfuscatedName("db.oy")
    public static int field2039 = 0;

    @ObfuscatedName("db.og")
    public static long field2034 = 0L;

    @ObfuscatedName("db.on")
    public static boolean field2035 = false;

    @ObfuscatedName("db.pw")
    public static int field2037 = 20;

    @ObfuscatedName("db.pk")
    public static int field2038 = 1;

    @ObfuscatedName("db.pl")
    public static int field2033 = 0;

    @ObfuscatedName("db.pg")
    public static long[] field2041 = new long[32];

    @ObfuscatedName("db.pe")
    public static long[] field2032 = new long[32];

    @ObfuscatedName("db.pn")
    public static volatile boolean field2042 = true;

    @ObfuscatedName("db.pj")
    public static int field2043 = 500;

    @ObfuscatedName("db.ps")
    public static volatile boolean field2044 = false;

    @ObfuscatedName("db.pa")
    public static volatile long field2046 = 0L;

    @ObfuscatedName("db.py")
    public static volatile boolean field2045 = true;

    @ObfuscatedName("db.om")
    public boolean field2036 = false;

    @ObfuscatedName("db.pm(IIII)V")
    public final void method2622(int arg0, int arg1, int arg2) {
        try {
            if (field2040 != null) {
                field2039++;
                if (field2039 >= 3) {
                    this.method2676("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2040 = this;
            Statics.field2022 = arg0;
            Statics.field27 = arg1;
            Statics.field2066 = arg2;
            Statics.field2064 = this;
            if (Statics.field1249 == null) {
                Statics.field1249 = new class120();
            }
            Statics.field1249.method2523(this, 1);
        } catch (Exception var5) {
            class132.method508((String) null, var5);
            this.method2676("crash");
        }
    }

    @ObfuscatedName("db.pf(I)V")
    public final synchronized void method2634() {
        Container var1;
        if (Statics.field138 == null) {
            var1 = this;
        } else {
            var1 = Statics.field138;
        }
        if (Statics.field1915 != null) {
            Statics.field1915.removeFocusListener(this);
            var1.remove(Statics.field1915);
        }
        Statics.field1915 = new class123(this);
        var1.add(Statics.field1915);
        Statics.field1915.setSize(Statics.field2022, Statics.field27);
        Statics.field1915.setVisible(true);
        if (Statics.field138 == null) {
            Statics.field1915.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field138.getInsets();
            Statics.field1915.setLocation(var2.left, var2.top);
        }
        Statics.field1915.addFocusListener(this);
        Statics.field1915.requestFocus();
        field2042 = true;
        field2044 = false;
        field2046 = class100.method496();
    }

    @ObfuscatedName("db.pr(I)Z")
    public final boolean method2624() {
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
                this.method2676("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1925 != null) {
                String var1 = Statics.field1925.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1918;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2676("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class189.method553(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class189.method2620(var4) && class189.method2725(var4) < 10) {
                            this.method2676("wrongjava");
                            return;
                        }
                    }
                    field2038 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2634();
            Statics.field1913 = class68.method793(Statics.field2022, Statics.field27, Statics.field1915);
            this.method189();
            class117 var5;
            try {
                var5 = new class131();
            } catch (Throwable var9) {
                var5 = new class125();
            }
            Statics.field171 = var5;
            while (field2034 == 0L || class100.method496() < field2034) {
                Statics.field160 = Statics.field171.method2478(field2037, field2038);
                for (int var7 = 0; var7 < Statics.field160; var7++) {
                    this.method2644();
                }
                this.method2626();
                class126.method534(Statics.field1249, Statics.field1915);
            }
        } catch (Exception var10) {
            class132.method508((String) null, var10);
            this.method2676("crash");
        }
        this.method2627();
    }

    @ObfuscatedName("db.po(B)V")
    public void method2644() {
        long var1 = class100.method496();
        long var3 = field2032[Statics.field1489];
        field2032[Statics.field1489] = var1;
        Statics.field1489 = Statics.field1489 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field134 = field2045;
        }
        this.method305();
    }

    @ObfuscatedName("db.pt(I)V")
    public void method2626() {
        long var1 = class100.method496();
        long var3 = field2041[Statics.field1490];
        field2041[Statics.field1490] = var1;
        Statics.field1490 = Statics.field1490 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2033 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2043 - 1 > 50) {
            field2043 -= 50;
            field2042 = true;
            Statics.field1915.setSize(Statics.field2022, Statics.field27);
            Statics.field1915.setVisible(true);
            if (Statics.field138 == null) {
                Statics.field1915.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field138.getInsets();
                Statics.field1915.setLocation(var6.left, var6.top);
            }
        }
        this.method282();
    }

    @ObfuscatedName("db.pv(B)V")
    public final synchronized void method2627() {
        if (field2035) {
            return;
        }
        field2035 = true;
        try {
            Statics.field1915.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method441();
        } catch (Exception var7) {
        }
        if (Statics.field138 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1249 != null) {
            try {
                Statics.field1249.method2503();
            } catch (Exception var5) {
            }
        }
        this.method187();
    }

    @ObfuscatedName("dk.pn(I)V")
    public static final void method2463() {
        Statics.field171.method2471();
        for (int var0 = 0; var0 < 32; var0++) {
            field2041[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2032[var1] = 0L;
        }
        Statics.field160 = 0;
    }

    public void start() {
        if (field2040 == this && !field2035) {
            field2034 = 0L;
        }
    }

    public void stop() {
        if (field2040 == this && !field2035) {
            field2034 = class100.method496() + 4000L;
        }
    }

    public void destroy() {
        if (field2040 == this && !field2035) {
            field2034 = class100.method496();
            class111.method1306(5000L);
            this.method2627();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2040 != this || field2035) {
            return;
        }
        field2042 = true;
        if (Statics.field1918 != null && Statics.field1918.startsWith("1.5") && class100.method496() - field2046 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2022 && var2.height >= Statics.field27) {
                field2044 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2045 = true;
        field2042 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2045 = false;
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

    @ObfuscatedName("db.pq(Ljava/lang/String;B)V")
    public void method2676(String arg0) {
        if (this.field2036) {
            return;
        }
        this.field2036 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("db.a(B)V")
    public abstract void method189();

    @ObfuscatedName("db.l(B)V")
    public abstract void method305();

    @ObfuscatedName("db.j(I)V")
    public abstract void method441();

    @ObfuscatedName("db.v(I)V")
    public abstract void method282();

    @ObfuscatedName("db.u(B)V")
    public abstract void method187();
}
