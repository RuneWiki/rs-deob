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

@ObfuscatedName("ew")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ew.os")
    public static class131 field2056 = null;

    @ObfuscatedName("ew.oz")
    public static int field2050 = 0;

    @ObfuscatedName("ew.od")
    public static long field2051 = 0L;

    @ObfuscatedName("ew.oo")
    public static boolean field2052 = false;

    @ObfuscatedName("ew.ot")
    public static int field2054 = 20;

    @ObfuscatedName("ew.ox")
    public static int field2049 = 1;

    @ObfuscatedName("ew.oh")
    public static int field2062 = 0;

    @ObfuscatedName("ew.ow")
    public static long[] field2057 = new long[32];

    @ObfuscatedName("ew.pn")
    public static long[] field2058 = new long[32];

    @ObfuscatedName("ew.pi")
    public static volatile boolean field2059 = true;

    @ObfuscatedName("ew.px")
    public static int field2060 = 500;

    @ObfuscatedName("ew.po")
    public static volatile boolean field2061 = false;

    @ObfuscatedName("ew.pl")
    public static volatile long field2055 = 0L;

    @ObfuscatedName("ew.pb")
    public static volatile boolean field2053 = true;

    @ObfuscatedName("ew.ov")
    public boolean field2064 = false;

    @ObfuscatedName("ew.px(IIII)V")
    public final void method2612(int arg0, int arg1, int arg2) {
        try {
            if (field2056 != null) {
                field2050++;
                if (field2050 >= 3) {
                    this.method2601("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2056 = this;
            Statics.field160 = arg0;
            Statics.field2025 = arg1;
            Statics.field2076 = arg2;
            Statics.field2081 = this;
            if (Statics.field1761 == null) {
                Statics.field1761 = new class123();
            }
            Statics.field1761.method2487(this, 1);
        } catch (Exception var5) {
            class135.method3292((String) null, var5);
            this.method2601("crash");
        }
    }

    @ObfuscatedName("ew.po(I)V")
    public final synchronized void method2602() {
        Container var1;
        if (Statics.field1812 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1812;
        }
        if (Statics.field1978 != null) {
            Statics.field1978.removeFocusListener(this);
            var1.remove(Statics.field1978);
        }
        Statics.field1978 = new class126(this);
        var1.add(Statics.field1978);
        Statics.field1978.setSize(Statics.field160, Statics.field2025);
        Statics.field1978.setVisible(true);
        if (Statics.field1812 == null) {
            Statics.field1978.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1812.getInsets();
            Statics.field1978.setLocation(var2.left, var2.top);
        }
        Statics.field1978.addFocusListener(this);
        Statics.field1978.requestFocus();
        field2059 = true;
        field2061 = false;
        field2055 = class103.method29();
    }

    @ObfuscatedName("ew.pl(B)Z")
    public final boolean method2603() {
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
                this.method2601("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1945 != null) {
                String var1 = Statics.field1945.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1823;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2601("wrongjava");
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
                        if (class197.method167(var6)) {
                            int var7 = class197.method308(var6, 10, true);
                            if (var7 < 10) {
                                this.method2601("wrongjava");
                                return;
                            }
                        }
                    }
                    field2049 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2602();
            int var8 = Statics.field160;
            int var9 = Statics.field2025;
            Canvas var10 = Statics.field1978;
            class71 var12;
            try {
                class75 var11 = new class75();
                var11.method1342(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var23) {
                class69 var14 = new class69();
                var14.method1342(var8, var9, var10);
                var12 = var14;
            }
            Statics.field678 = var12;
            this.method171();
            class120 var15;
            try {
                var15 = new class134();
            } catch (Throwable var22) {
                var15 = new class128();
            }
            Statics.field924 = var15;
            label99: while (true) {
                class123 var18;
                Canvas var19;
                do {
                    if (field2051 != 0L && class103.method29() >= field2051) {
                        break label99;
                    }
                    Statics.field572 = Statics.field924.method2466(field2054, field2049);
                    for (int var17 = 0; var17 < Statics.field572; var17++) {
                        this.method2604();
                    }
                    this.method2605();
                    var18 = Statics.field1761;
                    var19 = Statics.field1978;
                } while (var18.field1941 == null);
                for (int var20 = 0; var20 < 50 && var18.field1941.peekEvent() != null; var20++) {
                    class114.method2914(1L);
                }
                if (var19 != null) {
                    var18.field1941.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var24) {
            class135.method3292((String) null, var24);
            this.method2601("crash");
        }
        this.method2606();
    }

    @ObfuscatedName("ew.pw(I)V")
    public void method2604() {
        long var1 = class103.method29();
        long var3 = field2058[Statics.field974];
        field2058[Statics.field974] = var1;
        Statics.field974 = Statics.field974 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field828 = field2053;
        }
        this.method172();
    }

    @ObfuscatedName("ew.pb(I)V")
    public void method2605() {
        long var1 = class103.method29();
        long var3 = field2057[Statics.field252];
        field2057[Statics.field252] = var1;
        Statics.field252 = Statics.field252 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2062 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2060 - 1 > 50) {
            field2060 -= 50;
            field2059 = true;
            Statics.field1978.setSize(Statics.field160, Statics.field2025);
            Statics.field1978.setVisible(true);
            if (Statics.field1812 == null) {
                Statics.field1978.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1812.getInsets();
                Statics.field1978.setLocation(var6.left, var6.top);
            }
        }
        this.method173();
    }

    @ObfuscatedName("ew.ps(I)V")
    public final synchronized void method2606() {
        if (field2052) {
            return;
        }
        field2052 = true;
        try {
            Statics.field1978.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method359();
        } catch (Exception var7) {
        }
        if (Statics.field1812 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1761 != null) {
            try {
                Statics.field1761.method2483();
            } catch (Exception var5) {
            }
        }
        this.method169();
    }

    public void start() {
        if (field2056 == this && !field2052) {
            field2051 = 0L;
        }
    }

    public void stop() {
        if (field2056 == this && !field2052) {
            field2051 = class103.method29() + 4000L;
        }
    }

    public void destroy() {
        if (field2056 == this && !field2052) {
            field2051 = class103.method29();
            class114.method2914(5000L);
            this.method2606();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2056 != this || field2052) {
            return;
        }
        field2059 = true;
        if (Statics.field1823 != null && Statics.field1823.startsWith("1.5") && class103.method29() - field2055 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field160 && var2.height >= Statics.field2025) {
                field2061 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2053 = true;
        field2059 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2053 = false;
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

    @ObfuscatedName("db.pe(I)V")
    public static final void method2385() {
        Statics.field1809 = null;
        Statics.field893 = null;
        Statics.field835 = null;
    }

    @ObfuscatedName("ew.py(Ljava/lang/String;S)V")
    public void method2601(String arg0) {
        if (this.field2064) {
            return;
        }
        this.field2064 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ew.u(I)V")
    public abstract void method169();

    @ObfuscatedName("ew.j(I)V")
    public abstract void method171();

    @ObfuscatedName("ew.n(I)V")
    public abstract void method173();

    @ObfuscatedName("ew.y(I)V")
    public abstract void method359();

    @ObfuscatedName("ew.o(S)V")
    public abstract void method172();

    public abstract void init();
}
