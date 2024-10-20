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

@ObfuscatedName("en")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("en.ov")
    public static class131 field2024 = null;

    @ObfuscatedName("en.oj")
    public static int field2016 = 0;

    @ObfuscatedName("en.oq")
    public static long field2022 = 0L;

    @ObfuscatedName("en.ob")
    public static boolean field2020 = false;

    @ObfuscatedName("en.of")
    public static int field2028 = 20;

    @ObfuscatedName("en.ok")
    public static int field2021 = 1;

    @ObfuscatedName("en.ow")
    public static int field2018 = 0;

    @ObfuscatedName("en.pb")
    public static long[] field2023 = new long[32];

    @ObfuscatedName("en.pk")
    public static long[] field2017 = new long[32];

    @ObfuscatedName("en.pe")
    public static volatile boolean field2026 = true;

    @ObfuscatedName("en.pg")
    public static int field2027 = 500;

    @ObfuscatedName("en.pw")
    public static volatile boolean field2025 = false;

    @ObfuscatedName("en.pt")
    public static volatile long field2029 = 0L;

    @ObfuscatedName("en.pp")
    public static volatile boolean field2030 = true;

    @ObfuscatedName("en.oo")
    public boolean field2019 = false;

    @ObfuscatedName("en.oo(IIII)V")
    public final void method2583(int arg0, int arg1, int arg2) {
        try {
            if (field2024 != null) {
                field2016++;
                if (field2016 >= 3) {
                    this.method2580("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2024 = this;
            Statics.field147 = arg0;
            Statics.field602 = arg1;
            Statics.field2044 = arg2;
            Statics.field2047 = this;
            if (Statics.field777 == null) {
                Statics.field777 = new class123();
            }
            Statics.field777.method2458(this, 1);
        } catch (Exception var5) {
            class135.method1362((String) null, var5);
            this.method2580("crash");
        }
    }

    @ObfuscatedName("en.oc(I)V")
    public final synchronized void method2627() {
        Container var1;
        if (Statics.field1829 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1829;
        }
        if (Statics.field2015 != null) {
            Statics.field2015.removeFocusListener(this);
            var1.remove(Statics.field2015);
        }
        Statics.field2015 = new class126(this);
        var1.add(Statics.field2015);
        Statics.field2015.setSize(Statics.field147, Statics.field602);
        Statics.field2015.setVisible(true);
        if (Statics.field1829 == null) {
            Statics.field2015.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1829.getInsets();
            Statics.field2015.setLocation(var2.left, var2.top);
        }
        Statics.field2015.addFocusListener(this);
        Statics.field2015.requestFocus();
        field2026 = true;
        field2025 = false;
        field2029 = class103.method1861();
    }

    @ObfuscatedName("en.of(B)Z")
    public final boolean method2616() {
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
                this.method2580("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1757 != null) {
                String var1 = Statics.field1757.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1926;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2580("wrongjava");
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
                        if (class199.method2375(var6) && class199.method33(var6) < 10) {
                            this.method2580("wrongjava");
                            return;
                        }
                    }
                    field2021 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2627();
            Statics.field1952 = class71.method12(Statics.field147, Statics.field602, Statics.field2015);
            this.method165();
            Statics.field1654 = class120.method459();
            label83: while (true) {
                class123 var8;
                Canvas var9;
                do {
                    if (field2022 != 0L && class103.method1861() >= field2022) {
                        break label83;
                    }
                    Statics.field1266 = Statics.field1654.method2426(field2028, field2021);
                    for (int var7 = 0; var7 < Statics.field1266; var7++) {
                        this.method2573();
                    }
                    this.method2574();
                    var8 = Statics.field777;
                    var9 = Statics.field2015;
                } while (var8.field1930 == null);
                for (int var10 = 0; var10 < 50 && var8.field1930.peekEvent() != null; var10++) {
                    class114.method1854(1L);
                }
                if (var9 != null) {
                    var8.field1930.postEvent(new ActionEvent(var9, 1001, "dummy"));
                }
            }
        } catch (Exception var12) {
            class135.method1362((String) null, var12);
            this.method2580("crash");
        }
        this.method2626();
    }

    @ObfuscatedName("en.ok(I)V")
    public void method2573() {
        long var1 = class103.method1861();
        long var3 = field2017[Statics.field1652];
        field2017[Statics.field1652] = var1;
        Statics.field1652 = Statics.field1652 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1798 = field2030;
        }
        this.method198();
    }

    @ObfuscatedName("en.ow(I)V")
    public void method2574() {
        long var1 = class103.method1861();
        long var3 = field2023[Statics.field1344];
        field2023[Statics.field1344] = var1;
        Statics.field1344 = Statics.field1344 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2018 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2027 - 1 > 50) {
            field2027 -= 50;
            field2026 = true;
            Statics.field2015.setSize(Statics.field147, Statics.field602);
            Statics.field2015.setVisible(true);
            if (Statics.field1829 == null) {
                Statics.field2015.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1829.getInsets();
                Statics.field2015.setLocation(var6.left, var6.top);
            }
        }
        this.method166();
    }

    @ObfuscatedName("en.os(I)V")
    public final synchronized void method2626() {
        if (field2020) {
            return;
        }
        field2020 = true;
        try {
            Statics.field2015.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method230();
        } catch (Exception var7) {
        }
        if (Statics.field1829 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field777 != null) {
            try {
                Statics.field777.method2449();
            } catch (Exception var5) {
            }
        }
        this.method289();
    }

    public void start() {
        if (field2024 == this && !field2020) {
            field2022 = 0L;
        }
    }

    public void stop() {
        if (field2024 == this && !field2020) {
            field2022 = class103.method1861() + 4000L;
        }
    }

    public void destroy() {
        if (field2024 == this && !field2020) {
            field2022 = class103.method1861();
            class114.method1854(5000L);
            this.method2626();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2024 != this || field2020) {
            return;
        }
        field2026 = true;
        if (Statics.field1926 != null && Statics.field1926.startsWith("1.5") && class103.method1861() - field2029 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field147 && var2.height >= Statics.field602) {
                field2025 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2030 = true;
        field2026 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2030 = false;
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

    @ObfuscatedName("en.ol(Ljava/lang/String;B)V")
    public void method2580(String arg0) {
        if (this.field2019) {
            return;
        }
        this.field2019 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("en.y(B)V")
    public abstract void method165();

    public abstract void init();

    @ObfuscatedName("en.g(I)V")
    public abstract void method198();

    @ObfuscatedName("en.l(B)V")
    public abstract void method166();

    @ObfuscatedName("en.h(B)V")
    public abstract void method230();

    @ObfuscatedName("en.i(I)V")
    public abstract void method289();
}
