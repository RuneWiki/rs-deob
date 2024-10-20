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

@ObfuscatedName("eh")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eh.om")
    public static class131 field2049 = null;

    @ObfuscatedName("eh.ow")
    public static int field2041 = 0;

    @ObfuscatedName("eh.oh")
    public static long field2050 = 0L;

    @ObfuscatedName("eh.oy")
    public static boolean field2043 = false;

    @ObfuscatedName("eh.ox")
    public static int field2045 = 20;

    @ObfuscatedName("eh.oz")
    public static int field2046 = 1;

    @ObfuscatedName("eh.op")
    public static int field2056 = 0;

    @ObfuscatedName("eh.pc")
    public static long[] field2048 = new long[32];

    @ObfuscatedName("eh.pq")
    public static long[] field2053 = new long[32];

    @ObfuscatedName("eh.pl")
    public static volatile boolean field2051 = true;

    @ObfuscatedName("eh.pe")
    public static int field2052 = 500;

    @ObfuscatedName("eh.pj")
    public static volatile boolean field2042 = false;

    @ObfuscatedName("eh.pz")
    public static volatile long field2054 = 0L;

    @ObfuscatedName("eh.pi")
    public static volatile boolean field2055 = true;

    @ObfuscatedName("eh.oe")
    public boolean field2044 = false;

    @ObfuscatedName("eh.pk(IIII)V")
    public final void method2614(int arg0, int arg1, int arg2) {
        try {
            if (field2049 != null) {
                field2041++;
                if (field2041 >= 3) {
                    this.method2586("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2049 = this;
            Statics.field1284 = arg0;
            Statics.field1506 = arg1;
            Statics.field2024 = arg2;
            Statics.field2070 = this;
            if (Statics.field2672 == null) {
                Statics.field2672 = new class123();
            }
            Statics.field2672.method2463(this, 1);
        } catch (Exception var5) {
            class135.method457((String) null, var5);
            this.method2586("crash");
        }
    }

    @ObfuscatedName("eh.ph(B)V")
    public final synchronized void method2579() {
        Container var1;
        if (Statics.field699 == null) {
            var1 = this;
        } else {
            var1 = Statics.field699;
        }
        if (Statics.field2040 != null) {
            Statics.field2040.removeFocusListener(this);
            var1.remove(Statics.field2040);
        }
        Statics.field2040 = new class126(this);
        var1.add(Statics.field2040);
        Statics.field2040.setSize(Statics.field1284, Statics.field1506);
        Statics.field2040.setVisible(true);
        if (Statics.field699 == null) {
            Statics.field2040.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field699.getInsets();
            Statics.field2040.setLocation(var2.left, var2.top);
        }
        Statics.field2040.addFocusListener(this);
        Statics.field2040.requestFocus();
        field2051 = true;
        field2042 = false;
        field2054 = class103.method1957();
    }

    @ObfuscatedName("eh.po(I)Z")
    public final boolean method2580() {
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
                this.method2586("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1943 != null) {
                String var1 = Statics.field1943.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1936;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2586("wrongjava");
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
                        if (class199.method2545(var6)) {
                            int var7 = class199.method2945(var6, 10, true);
                            if (var7 < 10) {
                                this.method2586("wrongjava");
                                return;
                            }
                        }
                    }
                    field2046 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2579();
            int var8 = Statics.field1284;
            int var9 = Statics.field1506;
            Canvas var10 = Statics.field2040;
            class71 var12;
            try {
                class75 var11 = new class75();
                var11.method1330(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var23) {
                class69 var14 = new class69();
                var14.method1330(var8, var9, var10);
                var12 = var14;
            }
            Statics.field977 = var12;
            this.method167();
            class120 var15;
            try {
                var15 = new class134();
            } catch (Throwable var22) {
                var15 = new class128();
            }
            Statics.field163 = var15;
            label99: while (true) {
                class123 var18;
                Canvas var19;
                do {
                    if (field2050 != 0L && class103.method1957() >= field2050) {
                        break label99;
                    }
                    Statics.field989 = Statics.field163.method2437(field2045, field2046);
                    for (int var17 = 0; var17 < Statics.field989; var17++) {
                        this.method2631();
                    }
                    this.method2582();
                    var18 = Statics.field2672;
                    var19 = Statics.field2040;
                } while (var18.field1942 == null);
                for (int var20 = 0; var20 < 50 && var18.field1942.peekEvent() != null; var20++) {
                    class114.method2357(1L);
                }
                if (var19 != null) {
                    var18.field1942.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var24) {
            class135.method457((String) null, var24);
            this.method2586("crash");
        }
        this.method2583();
    }

    @ObfuscatedName("eh.ps(I)V")
    public void method2631() {
        long var1 = class103.method1957();
        long var3 = field2053[Statics.field2652];
        field2053[Statics.field2652] = var1;
        Statics.field2652 = Statics.field2652 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field26 = field2055;
        }
        this.method189();
    }

    @ObfuscatedName("eh.pn(I)V")
    public void method2582() {
        long var1 = class103.method1957();
        long var3 = field2048[Statics.field953];
        field2048[Statics.field953] = var1;
        Statics.field953 = Statics.field953 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2056 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2052 - 1 > 50) {
            field2052 -= 50;
            field2051 = true;
            Statics.field2040.setSize(Statics.field1284, Statics.field1506);
            Statics.field2040.setVisible(true);
            if (Statics.field699 == null) {
                Statics.field2040.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field699.getInsets();
                Statics.field2040.setLocation(var6.left, var6.top);
            }
        }
        this.method168();
    }

    @ObfuscatedName("eh.pr(B)V")
    public final synchronized void method2583() {
        if (field2043) {
            return;
        }
        field2043 = true;
        try {
            Statics.field2040.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method169();
        } catch (Exception var7) {
        }
        if (Statics.field699 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2672 != null) {
            try {
                Statics.field2672.method2481();
            } catch (Exception var5) {
            }
        }
        this.method164();
    }

    public void start() {
        if (field2049 == this && !field2043) {
            field2050 = 0L;
        }
    }

    public void stop() {
        if (field2049 == this && !field2043) {
            field2050 = class103.method1957() + 4000L;
        }
    }

    public void destroy() {
        if (field2049 == this && !field2043) {
            field2050 = class103.method1957();
            class114.method2357(5000L);
            this.method2583();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2049 != this || field2043) {
            return;
        }
        field2051 = true;
        if (Statics.field1936 != null && Statics.field1936.startsWith("1.5") && class103.method1957() - field2054 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1284 && var2.height >= Statics.field1506) {
                field2042 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2055 = true;
        field2051 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2055 = false;
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

    @ObfuscatedName("eh.pl(Ljava/lang/String;I)V")
    public void method2586(String arg0) {
        if (this.field2044) {
            return;
        }
        this.field2044 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eh.u(I)V")
    public abstract void method169();

    @ObfuscatedName("eh.q(I)V")
    public abstract void method167();

    public abstract void init();

    @ObfuscatedName("eh.l(I)V")
    public abstract void method189();

    @ObfuscatedName("eh.m(I)V")
    public abstract void method168();

    @ObfuscatedName("eh.g(I)V")
    public abstract void method164();
}
