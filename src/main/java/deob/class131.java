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

@ObfuscatedName("er")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.on")
    public static class131 field2072 = null;

    @ObfuscatedName("er.ob")
    public static int field2060 = 0;

    @ObfuscatedName("er.ol")
    public static long field2061 = 0L;

    @ObfuscatedName("er.op")
    public static boolean field2066 = false;

    @ObfuscatedName("er.ow")
    public static int field2064 = 20;

    @ObfuscatedName("er.ok")
    public static int field2059 = 1;

    @ObfuscatedName("er.ou")
    public static int field2069 = 0;

    @ObfuscatedName("er.pk")
    public static long[] field2070 = new long[32];

    @ObfuscatedName("er.pi")
    public static long[] field2068 = new long[32];

    @ObfuscatedName("er.pc")
    public static volatile boolean field2062 = true;

    @ObfuscatedName("er.pl")
    public static int field2065 = 500;

    @ObfuscatedName("er.pp")
    public static volatile boolean field2067 = false;

    @ObfuscatedName("er.pb")
    public static volatile long field2071 = 0L;

    @ObfuscatedName("er.pf")
    public static volatile boolean field2073 = true;

    @ObfuscatedName("er.oo")
    public boolean field2063 = false;

    @ObfuscatedName("er.ol(IIII)V")
    public final void method2587(int arg0, int arg1, int arg2) {
        try {
            if (field2072 != null) {
                field2060++;
                if (field2060 >= 3) {
                    this.method2632("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2072 = this;
            Statics.field1270 = arg0;
            Statics.field1271 = arg1;
            Statics.field2089 = arg2;
            Statics.field2093 = this;
            if (Statics.field985 == null) {
                Statics.field985 = new class123();
            }
            Statics.field985.method2472(this, 1);
        } catch (Exception var5) {
            class135.method495((String) null, var5);
            this.method2632("crash");
        }
    }

    @ObfuscatedName("er.op(B)V")
    public final synchronized void method2588() {
        Container var1;
        if (Statics.field891 == null) {
            var1 = this;
        } else {
            var1 = Statics.field891;
        }
        if (Statics.field632 != null) {
            Statics.field632.removeFocusListener(this);
            var1.remove(Statics.field632);
        }
        Statics.field632 = new class126(this);
        var1.add(Statics.field632);
        Statics.field632.setSize(Statics.field1270, Statics.field1271);
        Statics.field632.setVisible(true);
        if (Statics.field891 == null) {
            Statics.field632.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field891.getInsets();
            Statics.field632.setLocation(var2.left, var2.top);
        }
        Statics.field632.addFocusListener(this);
        Statics.field632.requestFocus();
        field2062 = true;
        field2067 = false;
        field2071 = class103.method19();
    }

    @ObfuscatedName("er.oo(I)Z")
    public final boolean method2652() {
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
                this.method2632("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1962 != null) {
                String var1 = Statics.field1962.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1920;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2632("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class199.method705(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label171: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label171;
                                    }
                                    if (var10 == '+') {
                                        break label171;
                                    }
                                }
                                int var20;
                                if (var10 >= '0' && var10 <= '9') {
                                    var20 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var20 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var20 = var10 - 'W';
                                }
                                if (var20 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var20 = -var20;
                                }
                                int var12 = var7 * 10 + var20;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class199.method1889(var4) < 10) {
                            this.method2632("wrongjava");
                            return;
                        }
                    }
                    field2059 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2588();
            Statics.field1889 = class71.method917(Statics.field1270, Statics.field1271, Statics.field632);
            this.method166();
            class120 var14;
            try {
                var14 = new class134();
            } catch (Throwable var18) {
                var14 = new class128();
            }
            Statics.field1759 = var14;
            while (field2061 == 0L || class103.method19() < field2061) {
                Statics.field2754 = Statics.field1759.method2442(field2064, field2059);
                for (int var16 = 0; var16 < Statics.field2754; var16++) {
                    this.method2612();
                }
                this.method2592();
                class129.method1625(Statics.field985, Statics.field632);
            }
        } catch (Exception var19) {
            class135.method495((String) null, var19);
            this.method2632("crash");
        }
        this.method2591();
    }

    @ObfuscatedName("er.os(I)V")
    public void method2612() {
        long var1 = class103.method19();
        long var3 = field2068[Statics.field1925];
        field2068[Statics.field1925] = var1;
        Statics.field1925 = Statics.field1925 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1851 = field2073;
        }
        this.method167();
    }

    @ObfuscatedName("er.ow(S)V")
    public void method2592() {
        long var1 = class103.method19();
        long var3 = field2070[Statics.field625];
        field2070[Statics.field625] = var1;
        Statics.field625 = Statics.field625 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2069 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2065 - 1 > 50) {
            field2065 -= 50;
            field2062 = true;
            Statics.field632.setSize(Statics.field1270, Statics.field1271);
            Statics.field632.setVisible(true);
            if (Statics.field891 == null) {
                Statics.field632.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field891.getInsets();
                Statics.field632.setLocation(var6.left, var6.top);
            }
        }
        this.method168();
    }

    @ObfuscatedName("er.ok(B)V")
    public final synchronized void method2591() {
        if (field2066) {
            return;
        }
        field2066 = true;
        try {
            Statics.field632.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method169();
        } catch (Exception var7) {
        }
        if (Statics.field891 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field985 != null) {
            try {
                Statics.field985.method2491();
            } catch (Exception var5) {
            }
        }
        this.method164();
    }

    @ObfuscatedName("bu.ou(B)V")
    public static final void method1089() {
        Statics.field1759.method2448();
        for (int var0 = 0; var0 < 32; var0++) {
            field2070[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2068[var1] = 0L;
        }
        Statics.field2754 = 0;
    }

    public void start() {
        if (field2072 == this && !field2066) {
            field2061 = 0L;
        }
    }

    public void stop() {
        if (field2072 == this && !field2066) {
            field2061 = class103.method19() + 4000L;
        }
    }

    public void destroy() {
        if (field2072 == this && !field2066) {
            field2061 = class103.method19();
            class114.method2962(5000L);
            this.method2591();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2072 != this || field2066) {
            return;
        }
        field2062 = true;
        if (Statics.field1920 != null && Statics.field1920.startsWith("1.5") && class103.method19() - field2071 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1270 && var2.height >= Statics.field1271) {
                field2067 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2073 = true;
        field2062 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2073 = false;
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

    @ObfuscatedName("i.oe(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method122(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field632.getGraphics();
            if (Statics.field1509 == null) {
                Statics.field1509 = new Font("Helvetica", 1, 13);
                Statics.field135 = Statics.field632.getFontMetrics(Statics.field1509);
            }
            if (field2062) {
                field2062 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1270, Statics.field1271);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1674 == null) {
                    Statics.field1674 = Statics.field632.createImage(304, 34);
                }
                Graphics var4 = Statics.field1674.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1509);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field135.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1674, Statics.field1270 / 2 - 152, Statics.field1271 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1270 / 2 - 152;
                int var7 = Statics.field1271 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1509);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field135.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field632.repaint();
        }
    }

    @ObfuscatedName("df.oj(I)V")
    public static final void method2521() {
        Statics.field1674 = null;
        Statics.field1509 = null;
        Statics.field135 = null;
    }

    @ObfuscatedName("er.pk(Ljava/lang/String;I)V")
    public void method2632(String arg0) {
        if (this.field2063) {
            return;
        }
        this.field2063 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("er.l(B)V")
    public abstract void method166();

    @ObfuscatedName("er.j(B)V")
    public abstract void method168();

    @ObfuscatedName("er.z(I)V")
    public abstract void method164();

    @ObfuscatedName("er.e(I)V")
    public abstract void method167();

    @ObfuscatedName("er.n(I)V")
    public abstract void method169();

    public abstract void init();
}
