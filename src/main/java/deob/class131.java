package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("ee")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ee.oz")
    public static class131 field2052 = null;

    @ObfuscatedName("ee.oi")
    public static int field2063 = 0;

    @ObfuscatedName("ee.og")
    public static long field2053 = 0L;

    @ObfuscatedName("ee.op")
    public static boolean field2056 = false;

    @ObfuscatedName("ee.om")
    public static int field2066 = 20;

    @ObfuscatedName("ee.ot")
    public static int field2065 = 1;

    @ObfuscatedName("ee.oh")
    public static int field2051 = 0;

    @ObfuscatedName("ee.pf")
    public static long[] field2059 = new long[32];

    @ObfuscatedName("ee.pj")
    public static long[] field2060 = new long[32];

    @ObfuscatedName("ee.pd")
    public static volatile boolean field2061 = true;

    @ObfuscatedName("ee.pb")
    public static int field2062 = 500;

    @ObfuscatedName("ee.pt")
    public static volatile boolean field2054 = false;

    @ObfuscatedName("ee.pw")
    public static volatile long field2064 = 0L;

    @ObfuscatedName("ee.px")
    public static volatile boolean field2058 = true;

    @ObfuscatedName("ee.on")
    public boolean field2055 = false;

    @ObfuscatedName("ee.oj(IIIS)V")
    public final void method2580(int arg0, int arg1, int arg2) {
        try {
            if (field2052 != null) {
                field2063++;
                if (field2063 >= 3) {
                    this.method2582("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2052 = this;
            Statics.field1068 = arg0;
            Statics.field2475 = arg1;
            Statics.field2081 = arg2;
            Statics.field2086 = this;
            if (Statics.field1064 == null) {
                Statics.field1064 = new class123();
            }
            Statics.field1064.method2461(this, 1);
        } catch (Exception var5) {
            class135.method33((String) null, var5);
            this.method2582("crash");
        }
    }

    @ObfuscatedName("ee.ok(I)V")
    public final synchronized void method2621() {
        Container var1;
        if (Statics.field1900 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1900;
        }
        if (Statics.field1255 != null) {
            Statics.field1255.removeFocusListener(this);
            var1.remove(Statics.field1255);
        }
        Statics.field1255 = new class126(this);
        var1.add(Statics.field1255);
        Statics.field1255.setSize(Statics.field1068, Statics.field2475);
        Statics.field1255.setVisible(true);
        if (Statics.field1900 == null) {
            Statics.field1255.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1900.getInsets();
            Statics.field1255.setLocation(var2.left, var2.top);
        }
        Statics.field1255.addFocusListener(this);
        Statics.field1255.requestFocus();
        field2061 = true;
        field2054 = false;
        field2064 = class103.method98();
    }

    @ObfuscatedName("ee.ol(S)Z")
    public final boolean method2575() {
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
                this.method2582("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1941 != null) {
                String var1 = Statics.field1941.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1939;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2582("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var23;
                                if (var12 >= '0' && var12 <= '9') {
                                    var23 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var23 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var23 = var12 - 'W';
                                }
                                if (var23 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var23 = -var23;
                                }
                                int var14 = var9 * 10 + var23;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class200.method97(var6, 10, true);
                            if (var16 < 10) {
                                this.method2582("wrongjava");
                                return;
                            }
                        }
                    }
                    field2065 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2621();
            Statics.field1849 = class71.method29(Statics.field1068, Statics.field2475, Statics.field1255);
            this.method173();
            class120 var17;
            try {
                var17 = new class134();
            } catch (Throwable var21) {
                var17 = new class128();
            }
            Statics.field1053 = var17;
            while (field2053 == 0L || class103.method98() < field2053) {
                Statics.field568 = Statics.field1053.method2431(field2066, field2065);
                for (int var19 = 0; var19 < Statics.field568; var19++) {
                    this.method2576();
                }
                this.method2577();
                class129.method1311(Statics.field1064, Statics.field1255);
            }
        } catch (Exception var22) {
            class135.method33((String) null, var22);
            this.method2582("crash");
        }
        this.method2579();
    }

    @ObfuscatedName("ee.oq(I)V")
    public void method2576() {
        long var1 = class103.method98();
        long var3 = field2060[Statics.field521];
        field2060[Statics.field521] = var1;
        Statics.field521 = Statics.field521 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field622 = field2058;
        }
        this.method174();
    }

    @ObfuscatedName("ee.ob(I)V")
    public void method2577() {
        long var1 = class103.method98();
        long var3 = field2059[Statics.field139];
        field2059[Statics.field139] = var1;
        Statics.field139 = Statics.field139 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2051 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2062 - 1 > 50) {
            field2062 -= 50;
            field2061 = true;
            Statics.field1255.setSize(Statics.field1068, Statics.field2475);
            Statics.field1255.setVisible(true);
            if (Statics.field1900 == null) {
                Statics.field1255.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1900.getInsets();
                Statics.field1255.setLocation(var6.left, var6.top);
            }
        }
        this.method178();
    }

    @ObfuscatedName("ee.od(B)V")
    public final synchronized void method2579() {
        if (field2056) {
            return;
        }
        field2056 = true;
        try {
            Statics.field1255.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method263();
        } catch (Exception var7) {
        }
        if (Statics.field1900 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1064 != null) {
            try {
                Statics.field1064.method2457();
            } catch (Exception var5) {
            }
        }
        this.method171();
    }

    @ObfuscatedName("q.oa(I)V")
    public static final void method155() {
        Statics.field1053.method2430();
        for (int var0 = 0; var0 < 32; var0++) {
            field2059[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2060[var1] = 0L;
        }
        Statics.field568 = 0;
    }

    public void start() {
        if (field2052 == this && !field2056) {
            field2053 = 0L;
        }
    }

    public void stop() {
        if (field2052 == this && !field2056) {
            field2053 = class103.method98() + 4000L;
        }
    }

    public void destroy() {
        if (field2052 == this && !field2056) {
            field2053 = class103.method98();
            class114.method1935(5000L);
            this.method2579();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2052 != this || field2056) {
            return;
        }
        field2061 = true;
        if (Statics.field1939 != null && Statics.field1939.startsWith("1.5") && class103.method98() - field2064 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1068 && var2.height >= Statics.field2475) {
                field2054 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2058 = true;
        field2061 = true;
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

    @ObfuscatedName("dr.ow(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2419(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1255.getGraphics();
            if (Statics.field1915 == null) {
                Statics.field1915 = new Font("Helvetica", 1, 13);
                Statics.field16 = Statics.field1255.getFontMetrics(Statics.field1915);
            }
            if (field2061) {
                field2061 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1068, Statics.field2475);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field59 == null) {
                    Statics.field59 = Statics.field1255.createImage(304, 34);
                }
                Graphics var4 = Statics.field59.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1915);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field16.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field59, Statics.field1068 / 2 - 152, Statics.field2475 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1068 / 2 - 152;
                int var7 = Statics.field2475 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1915);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field16.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1255.repaint();
        }
    }

    @ObfuscatedName("m.oo(I)V")
    public static final void method83() {
        Statics.field59 = null;
        Statics.field1915 = null;
        Statics.field16 = null;
    }

    @ObfuscatedName("ee.oz(Ljava/lang/String;I)V")
    public void method2582(String arg0) {
        if (this.field2055) {
            return;
        }
        this.field2055 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ee.w(B)V")
    public abstract void method173();

    public abstract void init();

    @ObfuscatedName("ee.j(B)V")
    public abstract void method263();

    @ObfuscatedName("ee.m(I)V")
    public abstract void method174();

    @ObfuscatedName("ee.u(B)V")
    public abstract void method178();

    @ObfuscatedName("ee.k(B)V")
    public abstract void method171();
}
