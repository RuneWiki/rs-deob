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

@ObfuscatedName("eo")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eo.ou")
    public static class131 field2043 = null;

    @ObfuscatedName("eo.or")
    public static int field2053 = 0;

    @ObfuscatedName("eo.ow")
    public static long field2039 = 0L;

    @ObfuscatedName("eo.oj")
    public static boolean field2042 = false;

    @ObfuscatedName("eo.oa")
    public static int field2044 = 20;

    @ObfuscatedName("eo.ok")
    public static int field2045 = 1;

    @ObfuscatedName("eo.oc")
    public static int field2046 = 0;

    @ObfuscatedName("eo.pt")
    public static long[] field2041 = new long[32];

    @ObfuscatedName("eo.pl")
    public static long[] field2048 = new long[32];

    @ObfuscatedName("eo.pm")
    public static volatile boolean field2049 = true;

    @ObfuscatedName("eo.pj")
    public static int field2050 = 500;

    @ObfuscatedName("eo.pp")
    public static volatile boolean field2051 = false;

    @ObfuscatedName("eo.pz")
    public static volatile long field2052 = 0L;

    @ObfuscatedName("eo.py")
    public static volatile boolean field2047 = true;

    @ObfuscatedName("eo.ob")
    public boolean field2040 = false;

    @ObfuscatedName("eo.oh(IIII)V")
    public final void method2684(int arg0, int arg1, int arg2) {
        try {
            if (field2043 != null) {
                field2053++;
                if (field2053 >= 3) {
                    this.method2630("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2043 = this;
            Statics.field849 = arg0;
            Statics.field1070 = arg1;
            Statics.field2071 = arg2;
            Statics.field2072 = this;
            if (Statics.field649 == null) {
                Statics.field649 = new class123();
            }
            Statics.field649.method2498(this, 1);
        } catch (Exception var5) {
            class135.method2595((String) null, var5);
            this.method2630("crash");
        }
    }

    @ObfuscatedName("eo.oz(B)V")
    public final synchronized void method2626() {
        Container var1;
        if (Statics.field1657 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1657;
        }
        if (Statics.field2018 != null) {
            Statics.field2018.removeFocusListener(this);
            var1.remove(Statics.field2018);
        }
        Statics.field2018 = new class126(this);
        var1.add(Statics.field2018);
        Statics.field2018.setSize(Statics.field849, Statics.field1070);
        Statics.field2018.setVisible(true);
        if (Statics.field1657 == null) {
            Statics.field2018.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1657.getInsets();
            Statics.field2018.setLocation(var2.left, var2.top);
        }
        Statics.field2018.addFocusListener(this);
        Statics.field2018.requestFocus();
        field2049 = true;
        field2051 = false;
        field2052 = class103.method1055();
    }

    @ObfuscatedName("eo.pt(B)Z")
    public final boolean method2664() {
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
                this.method2630("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1932 != null) {
                String var1 = Statics.field1932.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1939;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2630("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class199.method2916(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class199.method30(var4) && class199.method2988(var4) < 10) {
                            this.method2630("wrongjava");
                            return;
                        }
                    }
                    field2045 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2626();
            Statics.field1280 = class71.method86(Statics.field849, Statics.field1070, Statics.field2018);
            this.method253();
            class120 var5;
            try {
                var5 = new class134();
            } catch (Throwable var9) {
                var5 = new class128();
            }
            Statics.field972 = var5;
            while (field2039 == 0L || class103.method1055() < field2039) {
                Statics.field1688 = Statics.field972.method2472(field2044, field2045);
                for (int var7 = 0; var7 < Statics.field1688; var7++) {
                    this.method2623();
                }
                this.method2669();
                class129.method29(Statics.field649, Statics.field2018);
            }
        } catch (Exception var10) {
            class135.method2595((String) null, var10);
            this.method2630("crash");
        }
        this.method2625();
    }

    @ObfuscatedName("eo.pv(I)V")
    public void method2623() {
        long var1 = class103.method1055();
        long var3 = field2048[Statics.field2224];
        field2048[Statics.field2224] = var1;
        Statics.field2224 = Statics.field2224 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field579 = field2047;
        }
        this.method170();
    }

    @ObfuscatedName("eo.pl(I)V")
    public void method2669() {
        long var1 = class103.method1055();
        long var3 = field2041[Statics.field1778];
        field2041[Statics.field1778] = var1;
        Statics.field1778 = Statics.field1778 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2046 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2050 - 1 > 50) {
            field2050 -= 50;
            field2049 = true;
            Statics.field2018.setSize(Statics.field849, Statics.field1070);
            Statics.field2018.setVisible(true);
            if (Statics.field1657 == null) {
                Statics.field2018.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1657.getInsets();
                Statics.field2018.setLocation(var6.left, var6.top);
            }
        }
        this.method409();
    }

    @ObfuscatedName("eo.po(B)V")
    public final synchronized void method2625() {
        if (field2042) {
            return;
        }
        field2042 = true;
        try {
            Statics.field2018.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method172();
        } catch (Exception var7) {
        }
        if (Statics.field1657 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field649 != null) {
            try {
                Statics.field649.method2515();
            } catch (Exception var5) {
            }
        }
        this.method175();
    }

    @ObfuscatedName("dz.pw(I)V")
    public static final void method2519() {
        Statics.field972.method2470();
        for (int var0 = 0; var0 < 32; var0++) {
            field2041[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2048[var1] = 0L;
        }
        Statics.field1688 = 0;
    }

    public void start() {
        if (field2043 == this && !field2042) {
            field2039 = 0L;
        }
    }

    public void stop() {
        if (field2043 == this && !field2042) {
            field2039 = class103.method1055() + 4000L;
        }
    }

    public void destroy() {
        if (field2043 == this && !field2042) {
            field2039 = class103.method1055();
            class114.method743(5000L);
            this.method2625();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2043 != this || field2042) {
            return;
        }
        field2049 = true;
        if (Statics.field1939 != null && Statics.field1939.startsWith("1.5") && class103.method1055() - field2052 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field849 && var2.height >= Statics.field1070) {
                field2051 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2047 = true;
        field2049 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2047 = false;
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

    @ObfuscatedName("eo.pb(Ljava/lang/String;I)V")
    public void method2630(String arg0) {
        if (this.field2040) {
            return;
        }
        this.field2040 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eo.u(S)V")
    public abstract void method170();

    @ObfuscatedName("eo.v(I)V")
    public abstract void method175();

    @ObfuscatedName("eo.y(I)V")
    public abstract void method172();

    @ObfuscatedName("eo.g(I)V")
    public abstract void method253();

    @ObfuscatedName("eo.d(I)V")
    public abstract void method409();
}
