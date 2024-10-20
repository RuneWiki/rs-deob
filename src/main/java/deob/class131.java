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

@ObfuscatedName("em")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("em.ou")
    public static class131 field2062 = null;

    @ObfuscatedName("em.os")
    public static int field2066 = 0;

    @ObfuscatedName("em.oc")
    public static long field2053 = 0L;

    @ObfuscatedName("em.oe")
    public static boolean field2054 = false;

    @ObfuscatedName("em.oa")
    public static int field2061 = 20;

    @ObfuscatedName("em.ol")
    public static int field2052 = 1;

    @ObfuscatedName("em.oo")
    public static int field2058 = 0;

    @ObfuscatedName("em.pq")
    public static long[] field2059 = new long[32];

    @ObfuscatedName("em.pc")
    public static long[] field2060 = new long[32];

    @ObfuscatedName("em.pa")
    public static volatile boolean field2055 = true;

    @ObfuscatedName("em.pz")
    public static int field2056 = 500;

    @ObfuscatedName("em.px")
    public static volatile boolean field2063 = false;

    @ObfuscatedName("em.po")
    public static volatile long field2064 = 0L;

    @ObfuscatedName("em.pw")
    public static volatile boolean field2065 = true;

    @ObfuscatedName("em.on")
    public boolean field2057 = false;

    @ObfuscatedName("em.oe(IIII)V")
    public final void method2597(int arg0, int arg1, int arg2) {
        try {
            if (field2062 != null) {
                field2066++;
                if (field2066 >= 3) {
                    this.method2595("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2062 = this;
            Statics.field982 = arg0;
            Statics.field1902 = arg1;
            Statics.field2080 = arg2;
            Statics.field2085 = this;
            if (Statics.field1005 == null) {
                Statics.field1005 = new class123();
            }
            Statics.field1005.method2463(this, 1);
        } catch (Exception var5) {
            class135.method2560((String) null, var5);
            this.method2595("crash");
        }
    }

    @ObfuscatedName("em.on(B)V")
    public final synchronized void method2590() {
        Container var1;
        if (Statics.field941 == null) {
            var1 = this;
        } else {
            var1 = Statics.field941;
        }
        if (Statics.field1657 != null) {
            Statics.field1657.removeFocusListener(this);
            var1.remove(Statics.field1657);
        }
        Statics.field1657 = new class126(this);
        var1.add(Statics.field1657);
        Statics.field1657.setSize(Statics.field982, Statics.field1902);
        Statics.field1657.setVisible(true);
        if (Statics.field941 == null) {
            Statics.field1657.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field941.getInsets();
            Statics.field1657.setLocation(var2.left, var2.top);
        }
        Statics.field1657.addFocusListener(this);
        Statics.field1657.requestFocus();
        field2055 = true;
        field2063 = false;
        field2064 = class103.method2455();
    }

    @ObfuscatedName("em.ob(I)Z")
    public final boolean method2585() {
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
                this.method2595("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1956 != null) {
                String var1 = Statics.field1956.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1950;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2595("wrongjava");
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
                        if (class199.method2523(var6)) {
                            int var7 = class199.method1369(var6, 10, true);
                            if (var7 < 10) {
                                this.method2595("wrongjava");
                                return;
                            }
                        }
                    }
                    field2052 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2590();
            Statics.field1684 = class71.method29(Statics.field982, Statics.field1902, Statics.field1657);
            this.method185();
            Statics.field701 = class120.method2363();
            label83: while (true) {
                class123 var9;
                Canvas var10;
                do {
                    if (field2053 != 0L && class103.method2455() >= field2053) {
                        break label83;
                    }
                    Statics.field1354 = Statics.field701.method2437(field2061, field2052);
                    for (int var8 = 0; var8 < Statics.field1354; var8++) {
                        this.method2613();
                    }
                    this.method2587();
                    var9 = Statics.field1005;
                    var10 = Statics.field1657;
                } while (var9.field1951 == null);
                for (int var11 = 0; var11 < 50 && var9.field1951.peekEvent() != null; var11++) {
                    class114.method500(1L);
                }
                if (var10 != null) {
                    var9.field1951.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var13) {
            class135.method2560((String) null, var13);
            this.method2595("crash");
        }
        this.method2588();
    }

    @ObfuscatedName("em.oa(I)V")
    public void method2613() {
        long var1 = class103.method2455();
        long var3 = field2060[Statics.field1674];
        field2060[Statics.field1674] = var1;
        Statics.field1674 = Statics.field1674 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field696 = field2065;
        }
        this.method186();
    }

    @ObfuscatedName("em.ol(I)V")
    public void method2587() {
        long var1 = class103.method2455();
        long var3 = field2059[Statics.field142];
        field2059[Statics.field142] = var1;
        Statics.field142 = Statics.field142 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2058 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2056 - 1 > 50) {
            field2056 -= 50;
            field2055 = true;
            Statics.field1657.setSize(Statics.field982, Statics.field1902);
            Statics.field1657.setVisible(true);
            if (Statics.field941 == null) {
                Statics.field1657.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field941.getInsets();
                Statics.field1657.setLocation(var6.left, var6.top);
            }
        }
        this.method187();
    }

    @ObfuscatedName("em.oo(B)V")
    public final synchronized void method2588() {
        if (field2054) {
            return;
        }
        field2054 = true;
        try {
            Statics.field1657.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method188();
        } catch (Exception var7) {
        }
        if (Statics.field941 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1005 != null) {
            try {
                Statics.field1005.method2460();
            } catch (Exception var5) {
            }
        }
        this.method283();
    }

    @ObfuscatedName("c.ok(I)V")
    public static final void method94() {
        Statics.field701.method2439();
        for (int var0 = 0; var0 < 32; var0++) {
            field2059[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2060[var1] = 0L;
        }
        Statics.field1354 = 0;
    }

    public void start() {
        if (field2062 == this && !field2054) {
            field2053 = 0L;
        }
    }

    public void stop() {
        if (field2062 == this && !field2054) {
            field2053 = class103.method2455() + 4000L;
        }
    }

    public void destroy() {
        if (field2062 == this && !field2054) {
            field2053 = class103.method2455();
            class114.method500(5000L);
            this.method2588();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2062 != this || field2054) {
            return;
        }
        field2055 = true;
        if (Statics.field1950 != null && Statics.field1950.startsWith("1.5") && class103.method2455() - field2064 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field982 && var2.height >= Statics.field1902) {
                field2063 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2065 = true;
        field2055 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2065 = false;
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

    @ObfuscatedName("em.or(Ljava/lang/String;I)V")
    public void method2595(String arg0) {
        if (this.field2057) {
            return;
        }
        this.field2057 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("em.c(I)V")
    public abstract void method186();

    @ObfuscatedName("em.q(I)V")
    public abstract void method188();

    @ObfuscatedName("em.g(I)V")
    public abstract void method185();

    @ObfuscatedName("em.i(I)V")
    public abstract void method283();

    @ObfuscatedName("em.o(I)V")
    public abstract void method187();
}
