package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("el")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("el.ow")
    public static class131 field2064 = null;

    @ObfuscatedName("el.os")
    public static int field2063 = 0;

    @ObfuscatedName("el.og")
    public static long field2052 = 0L;

    @ObfuscatedName("el.oa")
    public static boolean field2053 = false;

    @ObfuscatedName("el.om")
    public static int field2055 = 20;

    @ObfuscatedName("el.oi")
    public static int field2050 = 1;

    @ObfuscatedName("el.ot")
    public static int field2057 = 0;

    @ObfuscatedName("el.oe")
    public static long[] field2058 = new long[32];

    @ObfuscatedName("el.pe")
    public static long[] field2056 = new long[32];

    @ObfuscatedName("el.pn")
    public static volatile boolean field2060 = true;

    @ObfuscatedName("el.px")
    public static int field2061 = 500;

    @ObfuscatedName("el.pu")
    public static volatile boolean field2062 = false;

    @ObfuscatedName("el.pq")
    public static volatile long field2051 = 0L;

    @ObfuscatedName("el.pz")
    public static volatile boolean field2059 = true;

    @ObfuscatedName("el.op")
    public boolean field2054 = false;

    @ObfuscatedName("el.nt(IIII)V")
    public final void method2596(int arg0, int arg1, int arg2) {
        try {
            if (field2064 != null) {
                field2063++;
                if (field2063 >= 3) {
                    this.method2600("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2064 = this;
            Statics.field80 = arg0;
            Statics.field1907 = arg1;
            Statics.field1253 = arg2;
            Statics.field2078 = this;
            if (Statics.field708 == null) {
                Statics.field708 = new class123();
            }
            Statics.field708.method2465(this, 1);
        } catch (Exception var5) {
            class135.method583((String) null, var5);
            this.method2600("crash");
        }
    }

    @ObfuscatedName("el.nz(I)V")
    public final synchronized void method2590() {
        Container var1;
        if (Statics.field1479 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1479;
        }
        if (Statics.field1523 != null) {
            Statics.field1523.removeFocusListener(this);
            var1.remove(Statics.field1523);
        }
        Statics.field1523 = new class126(this);
        var1.add(Statics.field1523);
        Statics.field1523.setSize(Statics.field80, Statics.field1907);
        Statics.field1523.setVisible(true);
        if (Statics.field1479 == null) {
            Statics.field1523.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1479.getInsets();
            Statics.field1523.setLocation(var2.left, var2.top);
        }
        Statics.field1523.addFocusListener(this);
        Statics.field1523.requestFocus();
        field2060 = true;
        field2062 = false;
        field2051 = class103.method790();
    }

    @ObfuscatedName("el.nc(I)Z")
    public final boolean method2591() {
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
                this.method2600("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1955 != null) {
                String var1 = Statics.field1955.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1950;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2600("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class196.method2396(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class196.method2055(var4, 10, true);
                        if (var5 && class196.method1(var4) < 10) {
                            this.method2600("wrongjava");
                            return;
                        }
                    }
                    field2050 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2590();
            int var6 = Statics.field80;
            int var7 = Statics.field1907;
            Canvas var8 = Statics.field1523;
            class71 var10;
            try {
                class75 var9 = new class75();
                var9.method1331(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var18) {
                class69 var12 = new class69();
                var12.method1331(var6, var7, var8);
                var10 = var12;
            }
            Statics.field1822 = var10;
            this.method166();
            class120 var13;
            try {
                var13 = new class134();
            } catch (Throwable var17) {
                var13 = new class128();
            }
            Statics.field1653 = var13;
            while (field2052 == 0L || class103.method790() < field2052) {
                Statics.field954 = Statics.field1653.method2426(field2055, field2050);
                for (int var15 = 0; var15 < Statics.field954; var15++) {
                    this.method2594();
                }
                this.method2593();
                class129.method149(Statics.field708, Statics.field1523);
            }
        } catch (Exception var19) {
            class135.method583((String) null, var19);
            this.method2600("crash");
        }
        this.method2589();
    }

    @ObfuscatedName("el.nx(B)V")
    public void method2594() {
        long var1 = class103.method790();
        long var3 = field2056[Statics.field1239];
        field2056[Statics.field1239] = var1;
        Statics.field1239 = Statics.field1239 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1937 = field2059;
        }
        this.method375();
    }

    @ObfuscatedName("el.nw(I)V")
    public void method2593() {
        long var1 = class103.method790();
        long var3 = field2058[Statics.field709];
        field2058[Statics.field709] = var1;
        Statics.field709 = Statics.field709 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2057 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2061 - 1 > 50) {
            field2061 -= 50;
            field2060 = true;
            Statics.field1523.setSize(Statics.field80, Statics.field1907);
            Statics.field1523.setVisible(true);
            if (Statics.field1479 == null) {
                Statics.field1523.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1479.getInsets();
                Statics.field1523.setLocation(var6.left, var6.top);
            }
        }
        this.method168();
    }

    @ObfuscatedName("el.nj(I)V")
    public final synchronized void method2589() {
        if (field2053) {
            return;
        }
        field2053 = true;
        try {
            Statics.field1523.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method169();
        } catch (Exception var7) {
        }
        if (Statics.field1479 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field708 != null) {
            try {
                Statics.field708.method2473();
            } catch (Exception var5) {
            }
        }
        this.method163();
    }

    @ObfuscatedName("bu.ng(B)V")
    public static final void method1396() {
        Statics.field1653.method2435();
        for (int var0 = 0; var0 < 32; var0++) {
            field2058[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2056[var1] = 0L;
        }
        Statics.field954 = 0;
    }

    public void start() {
        if (field2064 == this && !field2053) {
            field2052 = 0L;
        }
    }

    public void stop() {
        if (field2064 == this && !field2053) {
            field2052 = class103.method790() + 4000L;
        }
    }

    public void destroy() {
        if (field2064 == this && !field2053) {
            field2052 = class103.method790();
            class114.method140(5000L);
            this.method2589();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2064 != this || field2053) {
            return;
        }
        field2060 = true;
        if (Statics.field1950 != null && Statics.field1950.startsWith("1.5") && class103.method790() - field2051 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field80 && var2.height >= Statics.field1907) {
                field2062 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2059 = true;
        field2060 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2059 = false;
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

    @ObfuscatedName("ax.nl(I)V")
    public static final void method661() {
        Statics.field1908 = null;
        Statics.field778 = null;
        Statics.field1280 = null;
    }

    @ObfuscatedName("el.nn(Ljava/lang/String;B)V")
    public void method2600(String arg0) {
        if (this.field2054) {
            return;
        }
        this.field2054 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("el.x(I)V")
    public abstract void method169();

    @ObfuscatedName("el.l(S)V")
    public abstract void method166();

    public abstract void init();

    @ObfuscatedName("el.g(B)V")
    public abstract void method375();

    @ObfuscatedName("el.a(I)V")
    public abstract void method168();

    @ObfuscatedName("el.k(I)V")
    public abstract void method163();
}
