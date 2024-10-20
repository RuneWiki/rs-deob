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

@ObfuscatedName("ef")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.og")
    public static class131 field2038 = null;

    @ObfuscatedName("ef.oy")
    public static int field2044 = 0;

    @ObfuscatedName("ef.ow")
    public static long field2051 = 0L;

    @ObfuscatedName("ef.op")
    public static boolean field2039 = false;

    @ObfuscatedName("ef.ob")
    public static int field2041 = 20;

    @ObfuscatedName("ef.oh")
    public static int field2042 = 1;

    @ObfuscatedName("ef.of")
    public static int field2043 = 0;

    @ObfuscatedName("ef.pd")
    public static long[] field2040 = new long[32];

    @ObfuscatedName("ef.pp")
    public static long[] field2045 = new long[32];

    @ObfuscatedName("ef.py")
    public static volatile boolean field2046 = true;

    @ObfuscatedName("ef.ph")
    public static int field2047 = 500;

    @ObfuscatedName("ef.px")
    public static volatile boolean field2048 = false;

    @ObfuscatedName("ef.pr")
    public static volatile long field2049 = 0L;

    @ObfuscatedName("ef.po")
    public static volatile boolean field2050 = true;

    @ObfuscatedName("ef.oq")
    public boolean field2037 = false;

    @ObfuscatedName("ef.qz(IIIB)V")
    public final void method2673(int arg0, int arg1, int arg2) {
        try {
            if (field2038 != null) {
                field2044++;
                if (field2044 >= 3) {
                    this.method2667("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2038 = this;
            Statics.field1848 = arg0;
            Statics.field521 = arg1;
            Statics.field2065 = arg2;
            Statics.field2066 = this;
            if (Statics.field2680 == null) {
                Statics.field2680 = new class123();
            }
            Statics.field2680.method2546(this, 1);
        } catch (Exception var5) {
            class135.method2121((String) null, var5);
            this.method2667("crash");
        }
    }

    @ObfuscatedName("ef.qw(B)V")
    public final synchronized void method2717() {
        Container var1;
        if (Statics.field1514 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1514;
        }
        if (Statics.field1272 != null) {
            Statics.field1272.removeFocusListener(this);
            var1.remove(Statics.field1272);
        }
        Statics.field1272 = new class126(this);
        var1.add(Statics.field1272);
        Statics.field1272.setSize(Statics.field1848, Statics.field521);
        Statics.field1272.setVisible(true);
        if (Statics.field1514 == null) {
            Statics.field1272.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1514.getInsets();
            Statics.field1272.setLocation(var2.left, var2.top);
        }
        Statics.field1272.addFocusListener(this);
        Statics.field1272.requestFocus();
        field2046 = true;
        field2048 = false;
        field2049 = class103.method550();
    }

    @ObfuscatedName("ef.qb(I)Z")
    public final boolean method2706() {
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
                this.method2667("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1934 != null) {
                String var1 = Statics.field1934.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1931;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2667("wrongjava");
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
                        boolean var7 = class200.method554(var6, 10, true);
                        if (var7) {
                            int var8 = class200.method2594(var6, 10, true);
                            if (var8 < 10) {
                                this.method2667("wrongjava");
                                return;
                            }
                        }
                    }
                    field2042 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2717();
            int var9 = Statics.field1848;
            int var10 = Statics.field521;
            Canvas var11 = Statics.field1272;
            class71 var13;
            try {
                class75 var12 = new class75();
                var12.method1395(var9, var10, var11);
                var13 = var12;
            } catch (Throwable var24) {
                class69 var15 = new class69();
                var15.method1395(var9, var10, var11);
                var13 = var15;
            }
            Statics.field2011 = var13;
            this.method470();
            class120 var16;
            try {
                var16 = new class134();
            } catch (Throwable var23) {
                var16 = new class128();
            }
            Statics.field61 = var16;
            label99: while (true) {
                class123 var19;
                Canvas var20;
                do {
                    if (field2051 != 0L && class103.method550() >= field2051) {
                        break label99;
                    }
                    Statics.field1268 = Statics.field61.method2503(field2041, field2042);
                    for (int var18 = 0; var18 < Statics.field1268; var18++) {
                        this.method2659();
                    }
                    this.method2660();
                    var19 = Statics.field2680;
                    var20 = Statics.field1272;
                } while (var19.field1938 == null);
                for (int var21 = 0; var21 < 50 && var19.field1938.peekEvent() != null; var21++) {
                    class114.method1917(1L);
                }
                if (var20 != null) {
                    var19.field1938.postEvent(new ActionEvent(var20, 1001, "dummy"));
                }
            }
        } catch (Exception var25) {
            class135.method2121((String) null, var25);
            this.method2667("crash");
        }
        this.method2661();
    }

    @ObfuscatedName("ef.qk(B)V")
    public void method2659() {
        long var1 = class103.method550();
        long var3 = field2045[Statics.field1822];
        field2045[Statics.field1822] = var1;
        Statics.field1822 = Statics.field1822 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field550 = field2050;
        }
        this.method171();
    }

    @ObfuscatedName("ef.qi(I)V")
    public void method2660() {
        long var1 = class103.method550();
        long var3 = field2040[Statics.field220];
        field2040[Statics.field220] = var1;
        Statics.field220 = Statics.field220 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2043 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2047 - 1 > 50) {
            field2047 -= 50;
            field2046 = true;
            Statics.field1272.setSize(Statics.field1848, Statics.field521);
            Statics.field1272.setVisible(true);
            if (Statics.field1514 == null) {
                Statics.field1272.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1514.getInsets();
                Statics.field1272.setLocation(var6.left, var6.top);
            }
        }
        this.method172();
    }

    @ObfuscatedName("ef.qh(B)V")
    public final synchronized void method2661() {
        if (field2039) {
            return;
        }
        field2039 = true;
        try {
            Statics.field1272.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method173();
        } catch (Exception var7) {
        }
        if (Statics.field1514 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2680 != null) {
            try {
                Statics.field2680.method2526();
            } catch (Exception var5) {
            }
        }
        this.method168();
    }

    public void start() {
        if (field2038 == this && !field2039) {
            field2051 = 0L;
        }
    }

    public void stop() {
        if (field2038 == this && !field2039) {
            field2051 = class103.method550() + 4000L;
        }
    }

    public void destroy() {
        if (field2038 == this && !field2039) {
            field2051 = class103.method550();
            class114.method1917(5000L);
            this.method2661();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2038 != this || field2039) {
            return;
        }
        field2046 = true;
        if (Statics.field1931 != null && Statics.field1931.startsWith("1.5") && class103.method550() - field2049 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1848 && var2.height >= Statics.field521) {
                field2048 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2050 = true;
        field2046 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2050 = false;
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

    @ObfuscatedName("ef.qo(Ljava/lang/String;B)V")
    public void method2667(String arg0) {
        if (this.field2037) {
            return;
        }
        this.field2037 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ef.w(I)V")
    public abstract void method171();

    @ObfuscatedName("ef.d(I)V")
    public abstract void method173();

    public abstract void init();

    @ObfuscatedName("ef.r(I)V")
    public abstract void method470();

    @ObfuscatedName("ef.u(I)V")
    public abstract void method172();

    @ObfuscatedName("ef.n(B)V")
    public abstract void method168();
}
