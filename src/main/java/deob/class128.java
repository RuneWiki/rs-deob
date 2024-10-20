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

@ObfuscatedName("dq")
public abstract class class128 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dq.oi")
    public static class128 field2030 = null;

    @ObfuscatedName("dq.ou")
    public static int field2016 = 0;

    @ObfuscatedName("dq.oq")
    public static long field2017 = 0L;

    @ObfuscatedName("dq.ow")
    public static boolean field2018 = false;

    @ObfuscatedName("dq.pg")
    public static int field2020 = 20;

    @ObfuscatedName("dq.pn")
    public static int field2021 = 1;

    @ObfuscatedName("dq.pj")
    public static int field2022 = 0;

    @ObfuscatedName("dq.pr")
    public static long[] field2023 = new long[32];

    @ObfuscatedName("dq.px")
    public static long[] field2024 = new long[32];

    @ObfuscatedName("dq.pc")
    public static volatile boolean field2031 = true;

    @ObfuscatedName("dq.ps")
    public static int field2026 = 500;

    @ObfuscatedName("dq.ph")
    public static volatile boolean field2015 = false;

    @ObfuscatedName("dq.pl")
    public static volatile long field2028 = 0L;

    @ObfuscatedName("dq.pi")
    public static volatile boolean field2025 = true;

    @ObfuscatedName("dq.ot")
    public boolean field2027 = false;

    @ObfuscatedName("dq.pk(IIII)V")
    public final void method2580(int arg0, int arg1, int arg2) {
        try {
            if (field2030 != null) {
                field2016++;
                if (field2016 >= 3) {
                    this.method2590("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2030 = this;
            Statics.field2440 = arg0;
            Statics.field74 = arg1;
            Statics.field2045 = arg2;
            Statics.field2052 = this;
            if (Statics.field1949 == null) {
                Statics.field1949 = new class120();
            }
            Statics.field1949.method2468(this, 1);
        } catch (Exception var5) {
            class132.method130((String) null, var5);
            this.method2590("crash");
        }
    }

    @ObfuscatedName("dq.pp(I)V")
    public final synchronized void method2592() {
        Container var1;
        if (Statics.field51 == null) {
            var1 = this;
        } else {
            var1 = Statics.field51;
        }
        if (Statics.field591 != null) {
            Statics.field591.removeFocusListener(this);
            var1.remove(Statics.field591);
        }
        Statics.field591 = new class123(this);
        var1.add(Statics.field591);
        Statics.field591.setSize(Statics.field2440, Statics.field74);
        Statics.field591.setVisible(true);
        if (Statics.field51 == null) {
            Statics.field591.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field51.getInsets();
            Statics.field591.setLocation(var2.left, var2.top);
        }
        Statics.field591.addFocusListener(this);
        Statics.field591.requestFocus();
        field2031 = true;
        field2015 = false;
        field2028 = class100.method100();
    }

    @ObfuscatedName("dq.pw(B)Z")
    public final boolean method2582() {
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
                this.method2590("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1901 != null) {
                String var1 = Statics.field1901.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1900;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2590("wrongjava");
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
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label211: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label211;
                                    }
                                    if (var12 == '+') {
                                        break label211;
                                    }
                                }
                                int var22;
                                if (var12 >= '0' && var12 <= '9') {
                                    var22 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var22 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var22 = var12 - 'W';
                                }
                                if (var22 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var22 = -var22;
                                }
                                int var14 = var9 * 10 + var22;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class189.method2557(var6) < 10) {
                            this.method2590("wrongjava");
                            return;
                        }
                    }
                    field2021 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2592();
            Statics.field2608 = class68.method2523(Statics.field2440, Statics.field74, Statics.field591);
            this.method173();
            Statics.field1871 = class117.method1307();
            label110: while (true) {
                class120 var17;
                Canvas var18;
                do {
                    if (field2017 != 0L && class100.method100() >= field2017) {
                        break label110;
                    }
                    Statics.field575 = Statics.field1871.method2446(field2020, field2021);
                    for (int var16 = 0; var16 < Statics.field575; var16++) {
                        this.method2583();
                    }
                    this.method2591();
                    var17 = Statics.field1949;
                    var18 = Statics.field591;
                } while (var17.field1906 == null);
                for (int var19 = 0; var19 < 50 && var17.field1906.peekEvent() != null; var19++) {
                    class111.method59(1L);
                }
                if (var18 != null) {
                    var17.field1906.postEvent(new ActionEvent(var18, 1001, "dummy"));
                }
            }
        } catch (Exception var21) {
            class132.method130((String) null, var21);
            this.method2590("crash");
        }
        this.method2585();
    }

    @ObfuscatedName("dq.pq(I)V")
    public void method2583() {
        long var1 = class100.method100();
        long var3 = field2024[Statics.field571];
        field2024[Statics.field571] = var1;
        Statics.field571 = Statics.field571 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1607 = field2025;
        }
        this.method174();
    }

    @ObfuscatedName("dq.po(I)V")
    public void method2591() {
        long var1 = class100.method100();
        long var3 = field2023[Statics.field1815];
        field2023[Statics.field1815] = var1;
        Statics.field1815 = Statics.field1815 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2022 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2026 - 1 > 50) {
            field2026 -= 50;
            field2031 = true;
            Statics.field591.setSize(Statics.field2440, Statics.field74);
            Statics.field591.setVisible(true);
            if (Statics.field51 == null) {
                Statics.field591.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field51.getInsets();
                Statics.field591.setLocation(var6.left, var6.top);
            }
        }
        this.method175();
    }

    @ObfuscatedName("dq.pa(I)V")
    public final synchronized void method2585() {
        if (field2018) {
            return;
        }
        field2018 = true;
        try {
            Statics.field591.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method176();
        } catch (Exception var7) {
        }
        if (Statics.field51 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1949 != null) {
            try {
                Statics.field1949.method2467();
            } catch (Exception var5) {
            }
        }
        this.method386();
    }

    @ObfuscatedName("d.pc(B)V")
    public static final void method129() {
        Statics.field1871.method2445();
        for (int var0 = 0; var0 < 32; var0++) {
            field2023[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2024[var1] = 0L;
        }
        Statics.field575 = 0;
    }

    public void start() {
        if (field2030 == this && !field2018) {
            field2017 = 0L;
        }
    }

    public void stop() {
        if (field2030 == this && !field2018) {
            field2017 = class100.method100() + 4000L;
        }
    }

    public void destroy() {
        if (field2030 == this && !field2018) {
            field2017 = class100.method100();
            class111.method59(5000L);
            this.method2585();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2030 != this || field2018) {
            return;
        }
        field2031 = true;
        if (Statics.field1900 != null && Statics.field1900.startsWith("1.5") && class100.method100() - field2028 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2440 && var2.height >= Statics.field74) {
                field2015 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2025 = true;
        field2031 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2025 = false;
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

    @ObfuscatedName("dq.ps(Ljava/lang/String;I)V")
    public void method2590(String arg0) {
        if (this.field2027) {
            return;
        }
        this.field2027 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("dq.f(I)V")
    public abstract void method174();

    @ObfuscatedName("dq.a(I)V")
    public abstract void method175();

    @ObfuscatedName("dq.w(I)V")
    public abstract void method176();

    @ObfuscatedName("dq.i(I)V")
    public abstract void method173();

    @ObfuscatedName("dq.y(I)V")
    public abstract void method386();
}
