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

@ObfuscatedName("ef")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.os")
    public static class131 field2058 = null;

    @ObfuscatedName("ef.oy")
    public static int field2069 = 0;

    @ObfuscatedName("ef.od")
    public static long field2054 = 0L;

    @ObfuscatedName("ef.oo")
    public static boolean field2056 = false;

    @ObfuscatedName("ef.oj")
    public static int field2059 = 20;

    @ObfuscatedName("ef.ow")
    public static int field2063 = 1;

    @ObfuscatedName("ef.ov")
    public static int field2060 = 0;

    @ObfuscatedName("ef.oz")
    public static long[] field2061 = new long[32];

    @ObfuscatedName("ef.pi")
    public static long[] field2062 = new long[32];

    @ObfuscatedName("ef.pm")
    public static volatile boolean field2068 = true;

    @ObfuscatedName("ef.pq")
    public static int field2064 = 500;

    @ObfuscatedName("ef.px")
    public static volatile boolean field2065 = false;

    @ObfuscatedName("ef.pe")
    public static volatile long field2066 = 0L;

    @ObfuscatedName("ef.pw")
    public static volatile boolean field2067 = true;

    @ObfuscatedName("ef.om")
    public boolean field2057 = false;

    @ObfuscatedName("ef.ng(IIII)V")
    public final void method2674(int arg0, int arg1, int arg2) {
        try {
            if (field2058 != null) {
                field2069++;
                if (field2069 >= 3) {
                    this.method2641("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2058 = this;
            Statics.field145 = arg0;
            Statics.field547 = arg1;
            Statics.field1918 = arg2;
            Statics.field2084 = this;
            if (Statics.field1884 == null) {
                Statics.field1884 = new class123();
            }
            Statics.field1884.method2492(this, 1);
        } catch (Exception var5) {
            class135.method495((String) null, var5);
            this.method2641("crash");
        }
    }

    @ObfuscatedName("ef.ne(I)V")
    public final synchronized void method2658() {
        Container var1;
        if (Statics.field1278 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1278;
        }
        if (Statics.field1521 != null) {
            Statics.field1521.removeFocusListener(this);
            var1.remove(Statics.field1521);
        }
        Statics.field1521 = new class126(this);
        var1.add(Statics.field1521);
        Statics.field1521.setSize(Statics.field145, Statics.field547);
        Statics.field1521.setVisible(true);
        if (Statics.field1278 == null) {
            Statics.field1521.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1278.getInsets();
            Statics.field1521.setLocation(var2.left, var2.top);
        }
        Statics.field1521.addFocusListener(this);
        Statics.field1521.requestFocus();
        field2068 = true;
        field2065 = false;
        field2066 = class103.method553();
    }

    @ObfuscatedName("ef.nn(I)Z")
    public final boolean method2673() {
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
                this.method2641("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1947 != null) {
                String var1 = Statics.field1947.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1892;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2641("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class197.method816(var2.charAt(var3)); var3++) {
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
                            label162: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label162;
                                    }
                                    if (var10 == '+') {
                                        break label162;
                                    }
                                }
                                int var18;
                                if (var10 >= '0' && var10 <= '9') {
                                    var18 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var18 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var18 = var10 - 'W';
                                }
                                if (var18 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var18 = -var18;
                                }
                                int var12 = var7 * 10 + var18;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class197.method456(var4, 10, true);
                            if (var14 < 10) {
                                this.method2641("wrongjava");
                                return;
                            }
                        }
                    }
                    field2063 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2658();
            Statics.field200 = class71.method698(Statics.field145, Statics.field547, Statics.field1521);
            this.method167();
            Statics.field1523 = class120.method137();
            while (field2054 == 0L || class103.method553() < field2054) {
                Statics.field1060 = Statics.field1523.method2458(field2059, field2063);
                for (int var15 = 0; var15 < Statics.field1060; var15++) {
                    this.method2635();
                }
                this.method2636();
                class129.method472(Statics.field1884, Statics.field1521);
            }
        } catch (Exception var17) {
            class135.method495((String) null, var17);
            this.method2641("crash");
        }
        this.method2637();
    }

    @ObfuscatedName("ef.nt(I)V")
    public void method2635() {
        long var1 = class103.method553();
        long var3 = field2062[Statics.field240];
        field2062[Statics.field240] = var1;
        Statics.field240 = Statics.field240 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2055 = field2067;
        }
        this.method168();
    }

    @ObfuscatedName("ef.nm(I)V")
    public void method2636() {
        long var1 = class103.method553();
        long var3 = field2061[Statics.field1281];
        field2061[Statics.field1281] = var1;
        Statics.field1281 = Statics.field1281 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2060 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2064 - 1 > 50) {
            field2064 -= 50;
            field2068 = true;
            Statics.field1521.setSize(Statics.field145, Statics.field547);
            Statics.field1521.setVisible(true);
            if (Statics.field1278 == null) {
                Statics.field1521.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1278.getInsets();
                Statics.field1521.setLocation(var6.left, var6.top);
            }
        }
        this.method186();
    }

    @ObfuscatedName("ef.ou(B)V")
    public final synchronized void method2637() {
        if (field2056) {
            return;
        }
        field2056 = true;
        try {
            Statics.field1521.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method170();
        } catch (Exception var7) {
        }
        if (Statics.field1278 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1884 != null) {
            try {
                Statics.field1884.method2489();
            } catch (Exception var5) {
            }
        }
        this.method165();
    }

    @ObfuscatedName("at.og(B)V")
    public static final void method767() {
        Statics.field1523.method2462();
        for (int var0 = 0; var0 < 32; var0++) {
            field2061[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2062[var1] = 0L;
        }
        Statics.field1060 = 0;
    }

    public void start() {
        if (field2058 == this && !field2056) {
            field2054 = 0L;
        }
    }

    public void stop() {
        if (field2058 == this && !field2056) {
            field2054 = class103.method553() + 4000L;
        }
    }

    public void destroy() {
        if (field2058 == this && !field2056) {
            field2054 = class103.method553();
            class114.method589(5000L);
            this.method2637();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2058 != this || field2056) {
            return;
        }
        field2068 = true;
        if (Statics.field1892 != null && Statics.field1892.startsWith("1.5") && class103.method553() - field2066 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field145 && var2.height >= Statics.field547) {
                field2065 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2067 = true;
        field2068 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2067 = false;
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

    @ObfuscatedName("df.or(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2628(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1521.getGraphics();
            if (Statics.field1272 == null) {
                Statics.field1272 = new Font("Helvetica", 1, 13);
                Statics.field1056 = Statics.field1521.getFontMetrics(Statics.field1272);
            }
            if (field2068) {
                field2068 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field145, Statics.field547);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field95 == null) {
                    Statics.field95 = Statics.field1521.createImage(304, 34);
                }
                Graphics var4 = Statics.field95.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1272);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1056.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field95, Statics.field145 / 2 - 152, Statics.field547 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field145 / 2 - 152;
                int var7 = Statics.field547 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1272);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1056.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1521.repaint();
        }
    }

    @ObfuscatedName("ei.ok(I)V")
    public static final void method2850() {
        Statics.field95 = null;
        Statics.field1272 = null;
        Statics.field1056 = null;
    }

    @ObfuscatedName("ef.oi(Ljava/lang/String;B)V")
    public void method2641(String arg0) {
        if (this.field2057) {
            return;
        }
        this.field2057 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("ef.r(B)V")
    public abstract void method167();

    @ObfuscatedName("ef.e(I)V")
    public abstract void method168();

    @ObfuscatedName("ef.k(I)V")
    public abstract void method186();

    @ObfuscatedName("ef.b(B)V")
    public abstract void method170();

    @ObfuscatedName("ef.z(I)V")
    public abstract void method165();
}
