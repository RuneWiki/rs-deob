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

@ObfuscatedName("ee")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ee.om")
    public static class131 field2031 = null;

    @ObfuscatedName("ee.oe")
    public static int field2032 = 0;

    @ObfuscatedName("ee.oz")
    public static long field2033 = 0L;

    @ObfuscatedName("ee.ou")
    public static boolean field2034 = false;

    @ObfuscatedName("ee.os")
    public static int field2035 = 20;

    @ObfuscatedName("ee.od")
    public static int field2037 = 1;

    @ObfuscatedName("ee.oh")
    public static int field2038 = 0;

    @ObfuscatedName("ee.pc")
    public static long[] field2039 = new long[32];

    @ObfuscatedName("ee.pa")
    public static long[] field2040 = new long[32];

    @ObfuscatedName("ee.pr")
    public static volatile boolean field2047 = true;

    @ObfuscatedName("ee.pk")
    public static int field2042 = 500;

    @ObfuscatedName("ee.pf")
    public static volatile boolean field2043 = false;

    @ObfuscatedName("ee.pb")
    public static volatile long field2044 = 0L;

    @ObfuscatedName("ee.ph")
    public static volatile boolean field2036 = true;

    @ObfuscatedName("ee.ox")
    public boolean field2041 = false;

    @ObfuscatedName("ee.pr(IIII)V")
    public final void method2580(int arg0, int arg1, int arg2) {
        try {
            if (field2031 != null) {
                field2032++;
                if (field2032 >= 3) {
                    this.method2614("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2031 = this;
            Statics.field1860 = arg0;
            Statics.field1976 = arg1;
            Statics.field2066 = arg2;
            Statics.field2061 = this;
            if (Statics.field235 == null) {
                Statics.field235 = new class123();
            }
            Statics.field235.method2443(this, 1);
        } catch (Exception var5) {
            class135.method1860((String) null, var5);
            this.method2614("crash");
        }
    }

    @ObfuscatedName("ee.po(B)V")
    public final synchronized void method2597() {
        Container var1;
        if (Statics.field639 == null) {
            var1 = this;
        } else {
            var1 = Statics.field639;
        }
        if (Statics.field2027 != null) {
            Statics.field2027.removeFocusListener(this);
            var1.remove(Statics.field2027);
        }
        Statics.field2027 = new class126(this);
        var1.add(Statics.field2027);
        Statics.field2027.setSize(Statics.field1860, Statics.field1976);
        Statics.field2027.setVisible(true);
        if (Statics.field639 == null) {
            Statics.field2027.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field639.getInsets();
            Statics.field2027.setLocation(var2.left, var2.top);
        }
        Statics.field2027.addFocusListener(this);
        Statics.field2027.requestFocus();
        field2047 = true;
        field2043 = false;
        field2044 = class103.method494();
    }

    @ObfuscatedName("ee.pk(I)Z")
    public final boolean method2565() {
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
                this.method2614("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1942 != null) {
                String var1 = Statics.field1942.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1934;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2614("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class200.method1858(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class200.method2533(var4, 10, true);
                        if (var5) {
                            int var6 = class200.method2999(var4, 10, true);
                            if (var6 < 10) {
                                this.method2614("wrongjava");
                                return;
                            }
                        }
                    }
                    field2037 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2597();
            int var7 = Statics.field1860;
            int var8 = Statics.field1976;
            Canvas var9 = Statics.field2027;
            class71 var11;
            try {
                class75 var10 = new class75();
                var10.method1349(var7, var8, var9);
                var11 = var10;
            } catch (Throwable var19) {
                class69 var13 = new class69();
                var13.method1349(var7, var8, var9);
                var11 = var13;
            }
            Statics.field1114 = var11;
            this.method182();
            class120 var14;
            try {
                var14 = new class134();
            } catch (Throwable var18) {
                var14 = new class128();
            }
            Statics.field783 = var14;
            while (field2033 == 0L || class103.method494() < field2033) {
                Statics.field129 = Statics.field783.method2418(field2035, field2037);
                for (int var16 = 0; var16 < Statics.field129; var16++) {
                    this.method2571();
                }
                this.method2579();
                class129.method1838(Statics.field235, Statics.field2027);
            }
        } catch (Exception var20) {
            class135.method1860((String) null, var20);
            this.method2614("crash");
        }
        this.method2578();
    }

    @ObfuscatedName("ee.pf(B)V")
    public void method2571() {
        long var1 = class103.method494();
        long var3 = field2040[Statics.field1524];
        field2040[Statics.field1524] = var1;
        Statics.field1524 = Statics.field1524 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1906 = field2036;
        }
        this.method183();
    }

    @ObfuscatedName("ee.pb(I)V")
    public void method2579() {
        long var1 = class103.method494();
        long var3 = field2039[Statics.field2105];
        field2039[Statics.field2105] = var1;
        Statics.field2105 = Statics.field2105 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2038 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2042 - 1 > 50) {
            field2042 -= 50;
            field2047 = true;
            Statics.field2027.setSize(Statics.field1860, Statics.field1976);
            Statics.field2027.setVisible(true);
            if (Statics.field639 == null) {
                Statics.field2027.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field639.getInsets();
                Statics.field2027.setLocation(var6.left, var6.top);
            }
        }
        this.method184();
    }

    @ObfuscatedName("ee.pl(B)V")
    public final synchronized void method2578() {
        if (field2034) {
            return;
        }
        field2034 = true;
        try {
            Statics.field2027.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method185();
        } catch (Exception var7) {
        }
        if (Statics.field639 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field235 != null) {
            try {
                Statics.field235.method2438();
            } catch (Exception var5) {
            }
        }
        this.method375();
    }

    public void start() {
        if (field2031 == this && !field2034) {
            field2033 = 0L;
        }
    }

    public void stop() {
        if (field2031 == this && !field2034) {
            field2033 = class103.method494() + 4000L;
        }
    }

    public void destroy() {
        if (field2031 == this && !field2034) {
            field2033 = class103.method494();
            class114.method2036(5000L);
            this.method2578();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2031 != this || field2034) {
            return;
        }
        field2047 = true;
        if (Statics.field1934 != null && Statics.field1934.startsWith("1.5") && class103.method494() - field2044 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1860 && var2.height >= Statics.field1976) {
                field2043 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2036 = true;
        field2047 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2036 = false;
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

    @ObfuscatedName("aj.ph(B)V")
    public static final void method558() {
        Statics.field1271 = null;
        Statics.field2013 = null;
        Statics.field1115 = null;
    }

    @ObfuscatedName("ee.py(Ljava/lang/String;I)V")
    public void method2614(String arg0) {
        if (this.field2041) {
            return;
        }
        this.field2041 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ee.y(I)V")
    public abstract void method182();

    public abstract void init();

    @ObfuscatedName("ee.k(B)V")
    public abstract void method185();

    @ObfuscatedName("ee.j(B)V")
    public abstract void method375();

    @ObfuscatedName("ee.x(I)V")
    public abstract void method184();

    @ObfuscatedName("ee.w(I)V")
    public abstract void method183();
}
