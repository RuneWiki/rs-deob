package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ea")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ea.om")
    public static class131 field2048 = null;

    @ObfuscatedName("ea.oq")
    public static int field2043 = 0;

    @ObfuscatedName("ea.on")
    public static long field2057 = 0L;

    @ObfuscatedName("ea.of")
    public static boolean field2045 = false;

    @ObfuscatedName("ea.ow")
    public static int field2047 = 20;

    @ObfuscatedName("ea.oa")
    public static int field2042 = 1;

    @ObfuscatedName("ea.ob")
    public static int field2049 = 0;

    @ObfuscatedName("ea.pv")
    public static long[] field2050 = new long[32];

    @ObfuscatedName("ea.ph")
    public static long[] field2054 = new long[32];

    @ObfuscatedName("ea.pi")
    public static volatile boolean field2044 = true;

    @ObfuscatedName("ea.pm")
    public static int field2053 = 500;

    @ObfuscatedName("ea.pe")
    public static volatile boolean field2052 = false;

    @ObfuscatedName("ea.pj")
    public static volatile long field2055 = 0L;

    @ObfuscatedName("ea.ps")
    public static volatile boolean field2056 = true;

    @ObfuscatedName("ea.oc")
    public boolean field2046 = false;

    @ObfuscatedName("ea.ps(IIII)V")
    public final void method2527(int arg0, int arg1, int arg2) {
        try {
            if (field2048 != null) {
                field2043++;
                if (field2043 >= 3) {
                    this.method2536("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2048 = this;
            Statics.field227 = arg0;
            Statics.field534 = arg1;
            Statics.field2958 = arg2;
            Statics.field2076 = this;
            if (Statics.field1450 == null) {
                Statics.field1450 = new class123();
            }
            Statics.field1450.method2414(this, 1);
        } catch (Exception var5) {
            class135.method1996((String) null, var5);
            this.method2536("crash");
        }
    }

    @ObfuscatedName("ea.pb(I)V")
    public final synchronized void method2528() {
        Container var1;
        if (Statics.field2456 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2456;
        }
        if (Statics.field128 != null) {
            Statics.field128.removeFocusListener(this);
            var1.remove(Statics.field128);
        }
        Statics.field128 = new class126(this);
        var1.add(Statics.field128);
        Statics.field128.setSize(Statics.field227, Statics.field534);
        Statics.field128.setVisible(true);
        if (Statics.field2456 == null) {
            Statics.field128.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2456.getInsets();
            Statics.field128.setLocation(var2.left, var2.top);
        }
        Statics.field128.addFocusListener(this);
        Statics.field128.requestFocus();
        field2044 = true;
        field2052 = false;
        field2055 = class103.method833();
    }

    @ObfuscatedName("ea.pd(I)Z")
    public final boolean method2529() {
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
                this.method2536("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1940 != null) {
                String var1 = Statics.field1940.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1934;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2536("wrongjava");
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
                        if (class199.method3410(var6) && class199.method486(var6) < 10) {
                            this.method2536("wrongjava");
                            return;
                        }
                    }
                    field2042 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2528();
            int var7 = Statics.field227;
            int var8 = Statics.field534;
            Canvas var9 = Statics.field128;
            class71 var11;
            try {
                class75 var10 = new class75();
                var10.method1323(var7, var8, var9);
                var11 = var10;
            } catch (Throwable var19) {
                class69 var13 = new class69();
                var13.method1323(var7, var8, var9);
                var11 = var13;
            }
            Statics.field574 = var11;
            this.method163();
            Statics.field2490 = class120.method15();
            label91: while (true) {
                class123 var15;
                Canvas var16;
                do {
                    if (field2057 != 0L && class103.method833() >= field2057) {
                        break label91;
                    }
                    Statics.field250 = Statics.field2490.method2384(field2047, field2042);
                    for (int var14 = 0; var14 < Statics.field250; var14++) {
                        this.method2588();
                    }
                    this.method2531();
                    var15 = Statics.field1450;
                    var16 = Statics.field128;
                } while (var15.field1945 == null);
                for (int var17 = 0; var17 < 50 && var15.field1945.peekEvent() != null; var17++) {
                    class114.method134(1L);
                }
                if (var16 != null) {
                    var15.field1945.postEvent(new ActionEvent(var16, 1001, "dummy"));
                }
            }
        } catch (Exception var20) {
            class135.method1996((String) null, var20);
            this.method2536("crash");
        }
        this.method2532();
    }

    @ObfuscatedName("ea.py(I)V")
    public void method2588() {
        long var1 = class103.method833();
        long var3 = field2054[Statics.field1009];
        field2054[Statics.field1009] = var1;
        Statics.field1009 = Statics.field1009 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field228 = field2056;
        }
        this.method452();
    }

    @ObfuscatedName("ea.pw(B)V")
    public void method2531() {
        long var1 = class103.method833();
        long var3 = field2050[Statics.field1449];
        field2050[Statics.field1449] = var1;
        Statics.field1449 = Statics.field1449 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2049 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2053 - 1 > 50) {
            field2053 -= 50;
            field2044 = true;
            Statics.field128.setSize(Statics.field227, Statics.field534);
            Statics.field128.setVisible(true);
            if (Statics.field2456 == null) {
                Statics.field128.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2456.getInsets();
                Statics.field128.setLocation(var6.left, var6.top);
            }
        }
        this.method165();
    }

    @ObfuscatedName("ea.pf(B)V")
    public final synchronized void method2532() {
        if (field2045) {
            return;
        }
        field2045 = true;
        try {
            Statics.field128.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method166();
        } catch (Exception var7) {
        }
        if (Statics.field2456 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1450 != null) {
            try {
                Statics.field1450.method2411();
            } catch (Exception var5) {
            }
        }
        this.method161();
    }

    @ObfuscatedName("do.pa(I)V")
    public static final void method2453() {
        Statics.field2490.method2383();
        for (int var0 = 0; var0 < 32; var0++) {
            field2050[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2054[var1] = 0L;
        }
        Statics.field250 = 0;
    }

    public void start() {
        if (field2048 == this && !field2045) {
            field2057 = 0L;
        }
    }

    public void stop() {
        if (field2048 == this && !field2045) {
            field2057 = class103.method833() + 4000L;
        }
    }

    public void destroy() {
        if (field2048 == this && !field2045) {
            field2057 = class103.method833();
            class114.method134(5000L);
            this.method2532();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2048 != this || field2045) {
            return;
        }
        field2044 = true;
        if (Statics.field1934 != null && Statics.field1934.startsWith("1.5") && class103.method833() - field2055 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field227 && var2.height >= Statics.field534) {
                field2052 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2056 = true;
        field2044 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2056 = false;
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

    @ObfuscatedName("ao.px(I)V")
    public static final void method577() {
        Statics.field150 = null;
        Statics.field996 = null;
        Statics.field132 = null;
    }

    @ObfuscatedName("ea.pg(Ljava/lang/String;I)V")
    public void method2536(String arg0) {
        if (this.field2046) {
            return;
        }
        this.field2046 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ea.r(I)V")
    public abstract void method452();

    public abstract void init();

    @ObfuscatedName("ea.w(B)V")
    public abstract void method163();

    @ObfuscatedName("ea.l(B)V")
    public abstract void method165();

    @ObfuscatedName("ea.o(I)V")
    public abstract void method161();

    @ObfuscatedName("ea.s(B)V")
    public abstract void method166();
}
