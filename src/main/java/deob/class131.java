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

@ObfuscatedName("er")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.ok")
    public static class131 field2059 = null;

    @ObfuscatedName("er.oz")
    public static int field2056 = 0;

    @ObfuscatedName("er.oa")
    public static long field2046 = 0L;

    @ObfuscatedName("er.oy")
    public static boolean field2045 = false;

    @ObfuscatedName("er.oe")
    public static int field2049 = 20;

    @ObfuscatedName("er.ot")
    public static int field2050 = 1;

    @ObfuscatedName("er.on")
    public static int field2051 = 0;

    @ObfuscatedName("er.pm")
    public static long[] field2044 = new long[32];

    @ObfuscatedName("er.pe")
    public static long[] field2053 = new long[32];

    @ObfuscatedName("er.pp")
    public static volatile boolean field2054 = true;

    @ObfuscatedName("er.pk")
    public static int field2055 = 500;

    @ObfuscatedName("er.ps")
    public static volatile boolean field2048 = false;

    @ObfuscatedName("er.pn")
    public static volatile long field2057 = 0L;

    @ObfuscatedName("er.pi")
    public static volatile boolean field2058 = true;

    @ObfuscatedName("er.od")
    public boolean field2052 = false;

    @ObfuscatedName("er.oy(IIIB)V")
    public final void method2632(int arg0, int arg1, int arg2) {
        try {
            if (field2059 != null) {
                field2056++;
                if (field2056 >= 3) {
                    this.method2611("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2059 = this;
            Statics.field1526 = arg0;
            Statics.field1682 = arg1;
            Statics.field2074 = arg2;
            Statics.field2079 = this;
            if (Statics.field1680 == null) {
                Statics.field1680 = new class123();
            }
            Statics.field1680.method2463(this, 1);
        } catch (Exception var5) {
            class135.method1963((String) null, var5);
            this.method2611("crash");
        }
    }

    @ObfuscatedName("er.od(I)V")
    public final synchronized void method2577() {
        Container var1;
        if (Statics.field1907 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1907;
        }
        if (Statics.field1589 != null) {
            Statics.field1589.removeFocusListener(this);
            var1.remove(Statics.field1589);
        }
        Statics.field1589 = new class126(this);
        var1.add(Statics.field1589);
        Statics.field1589.setSize(Statics.field1526, Statics.field1682);
        Statics.field1589.setVisible(true);
        if (Statics.field1907 == null) {
            Statics.field1589.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1907.getInsets();
            Statics.field1589.setLocation(var2.left, var2.top);
        }
        Statics.field1589.addFocusListener(this);
        Statics.field1589.requestFocus();
        field2054 = true;
        field2048 = false;
        field2057 = class103.method470();
    }

    @ObfuscatedName("er.oq(I)Z")
    public final boolean method2578() {
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
                this.method2611("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1961 != null) {
                String var1 = Statics.field1961.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1953;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2611("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class199.method3288(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class199.method1973(var4)) {
                            int var5 = class199.method125(var4, 10, true);
                            if (var5 < 10) {
                                this.method2611("wrongjava");
                                return;
                            }
                        }
                    }
                    field2050 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2577();
            int var6 = Statics.field1526;
            int var7 = Statics.field1682;
            Canvas var8 = Statics.field1589;
            class71 var10;
            try {
                class75 var9 = new class75();
                var9.method1389(var6, var7, var8);
                var10 = var9;
            } catch (Throwable var21) {
                class69 var12 = new class69();
                var12.method1389(var6, var7, var8);
                var10 = var12;
            }
            Statics.field582 = var10;
            this.method202();
            class120 var13;
            try {
                var13 = new class134();
            } catch (Throwable var20) {
                var13 = new class128();
            }
            Statics.field2010 = var13;
            label93: while (true) {
                class123 var16;
                Canvas var17;
                do {
                    if (field2046 != 0L && class103.method470() >= field2046) {
                        break label93;
                    }
                    Statics.field1775 = Statics.field2010.method2432(field2049, field2050);
                    for (int var15 = 0; var15 < Statics.field1775; var15++) {
                        this.method2595();
                    }
                    this.method2580();
                    var16 = Statics.field1680;
                    var17 = Statics.field1589;
                } while (var16.field1959 == null);
                for (int var18 = 0; var18 < 50 && var16.field1959.peekEvent() != null; var18++) {
                    class114.method2808(1L);
                }
                if (var17 != null) {
                    var16.field1959.postEvent(new ActionEvent(var17, 1001, "dummy"));
                }
            }
        } catch (Exception var22) {
            class135.method1963((String) null, var22);
            this.method2611("crash");
        }
        this.method2579();
    }

    @ObfuscatedName("er.oe(B)V")
    public void method2595() {
        long var1 = class103.method470();
        long var3 = field2053[Statics.field1972];
        field2053[Statics.field1972] = var1;
        Statics.field1972 = Statics.field1972 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field626 = field2058;
        }
        this.method249();
    }

    @ObfuscatedName("er.ot(I)V")
    public void method2580() {
        long var1 = class103.method470();
        long var3 = field2044[Statics.field1519];
        field2044[Statics.field1519] = var1;
        Statics.field1519 = Statics.field1519 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2051 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2055 - 1 > 50) {
            field2055 -= 50;
            field2054 = true;
            Statics.field1589.setSize(Statics.field1526, Statics.field1682);
            Statics.field1589.setVisible(true);
            if (Statics.field1907 == null) {
                Statics.field1589.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1907.getInsets();
                Statics.field1589.setLocation(var6.left, var6.top);
            }
        }
        this.method165();
    }

    @ObfuscatedName("er.on(I)V")
    public final synchronized void method2579() {
        if (field2045) {
            return;
        }
        field2045 = true;
        try {
            Statics.field1589.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method169();
        } catch (Exception var7) {
        }
        if (Statics.field1907 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1680 != null) {
            try {
                Statics.field1680.method2460();
            } catch (Exception var5) {
            }
        }
        this.method161();
    }

    @ObfuscatedName("am.oi(B)V")
    public static final void method788() {
        Statics.field2010.method2433();
        for (int var0 = 0; var0 < 32; var0++) {
            field2044[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2053[var1] = 0L;
        }
        Statics.field1775 = 0;
    }

    public void start() {
        if (field2059 == this && !field2045) {
            field2046 = 0L;
        }
    }

    public void stop() {
        if (field2059 == this && !field2045) {
            field2046 = class103.method470() + 4000L;
        }
    }

    public void destroy() {
        if (field2059 == this && !field2045) {
            field2046 = class103.method470();
            class114.method2808(5000L);
            this.method2579();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2059 != this || field2045) {
            return;
        }
        field2054 = true;
        if (Statics.field1953 != null && Statics.field1953.startsWith("1.5") && class103.method470() - field2057 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1526 && var2.height >= Statics.field1682) {
                field2048 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2058 = true;
        field2054 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2058 = false;
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

    @ObfuscatedName("eg.of(I)V")
    public static final void method2804() {
        Statics.field1285 = null;
        Statics.field1989 = null;
        Statics.field789 = null;
    }

    @ObfuscatedName("er.pm(Ljava/lang/String;I)V")
    public void method2611(String arg0) {
        if (this.field2052) {
            return;
        }
        this.field2052 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("er.p(I)V")
    public abstract void method202();

    @ObfuscatedName("er.o(I)V")
    public abstract void method249();

    @ObfuscatedName("er.b(I)V")
    public abstract void method165();

    @ObfuscatedName("er.m(I)V")
    public abstract void method161();

    @ObfuscatedName("er.x(I)V")
    public abstract void method169();
}
