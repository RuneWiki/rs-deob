package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("es")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("es.oo")
    public static class131 field2063 = null;

    @ObfuscatedName("es.ow")
    public static int field2051 = 0;

    @ObfuscatedName("es.ot")
    public static long field2052 = 0L;

    @ObfuscatedName("es.on")
    public static boolean field2050 = false;

    @ObfuscatedName("es.oi")
    public static int field2055 = 20;

    @ObfuscatedName("es.ox")
    public static int field2060 = 1;

    @ObfuscatedName("es.oq")
    public static int field2057 = 0;

    @ObfuscatedName("es.pd")
    public static long[] field2059 = new long[32];

    @ObfuscatedName("es.ph")
    public static long[] field2053 = new long[32];

    @ObfuscatedName("es.py")
    public static volatile boolean field2056 = true;

    @ObfuscatedName("es.pq")
    public static int field2061 = 500;

    @ObfuscatedName("es.pc")
    public static volatile boolean field2062 = false;

    @ObfuscatedName("es.px")
    public static volatile long field2058 = 0L;

    @ObfuscatedName("es.pn")
    public static volatile boolean field2064 = true;

    @ObfuscatedName("es.ob")
    public boolean field2054 = false;

    @ObfuscatedName("es.ol(IIIB)V")
    public final void method2595(int arg0, int arg1, int arg2) {
        try {
            if (field2063 != null) {
                field2051++;
                if (field2051 >= 3) {
                    this.method2606("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2063 = this;
            Statics.field1861 = arg0;
            Statics.field1248 = arg1;
            Statics.field2080 = arg2;
            Statics.field2079 = this;
            if (Statics.field1752 == null) {
                Statics.field1752 = new class123();
            }
            Statics.field1752.method2481(this, 1);
        } catch (Exception var5) {
            class135.method2083((String) null, var5);
            this.method2606("crash");
        }
    }

    @ObfuscatedName("es.oh(B)V")
    public final synchronized void method2649() {
        Container var1;
        if (Statics.field1639 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1639;
        }
        if (Statics.field208 != null) {
            Statics.field208.removeFocusListener(this);
            var1.remove(Statics.field208);
        }
        Statics.field208 = new class126(this);
        var1.add(Statics.field208);
        Statics.field208.setSize(Statics.field1861, Statics.field1248);
        Statics.field208.setVisible(true);
        if (Statics.field1639 == null) {
            Statics.field208.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1639.getInsets();
            Statics.field208.setLocation(var2.left, var2.top);
        }
        Statics.field208.addFocusListener(this);
        Statics.field208.requestFocus();
        field2056 = true;
        field2062 = false;
        field2058 = class103.method16();
    }

    @ObfuscatedName("es.ou(I)Z")
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
                this.method2606("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1935 != null) {
                String var1 = Statics.field1935.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1934;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2606("wrongjava");
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
                        boolean var7 = class200.method2060(var6, 10, true);
                        if (var7) {
                            int var8 = class200.method3177(var6, 10, true);
                            if (var8 < 10) {
                                this.method2606("wrongjava");
                                return;
                            }
                        }
                    }
                    field2060 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2649();
            Statics.field2431 = class71.method119(Statics.field1861, Statics.field1248, Statics.field208);
            this.method158();
            class120 var9;
            try {
                var9 = new class134();
            } catch (Throwable var16) {
                var9 = new class128();
            }
            Statics.field1678 = var9;
            label91: while (true) {
                class123 var12;
                Canvas var13;
                do {
                    if (field2052 != 0L && class103.method16() >= field2052) {
                        break label91;
                    }
                    Statics.field2703 = Statics.field1678.method2454(field2055, field2060);
                    for (int var11 = 0; var11 < Statics.field2703; var11++) {
                        this.method2667();
                    }
                    this.method2665();
                    var12 = Statics.field1752;
                    var13 = Statics.field208;
                } while (var12.field1942 == null);
                for (int var14 = 0; var14 < 50 && var12.field1942.peekEvent() != null; var14++) {
                    class114.method1888(1L);
                }
                if (var13 != null) {
                    var12.field1942.postEvent(new ActionEvent(var13, 1001, "dummy"));
                }
            }
        } catch (Exception var17) {
            class135.method2083((String) null, var17);
            this.method2606("crash");
        }
        this.method2600();
    }

    @ObfuscatedName("es.of(B)V")
    public void method2667() {
        long var1 = class103.method16();
        long var3 = field2053[Statics.field1910];
        field2053[Statics.field1910] = var1;
        Statics.field1910 = Statics.field1910 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field221 = field2064;
        }
        this.method159();
    }

    @ObfuscatedName("es.op(I)V")
    public void method2665() {
        long var1 = class103.method16();
        long var3 = field2059[Statics.field1940];
        field2059[Statics.field1940] = var1;
        Statics.field1940 = Statics.field1940 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2057 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2061 - 1 > 50) {
            field2061 -= 50;
            field2056 = true;
            Statics.field208.setSize(Statics.field1861, Statics.field1248);
            Statics.field208.setVisible(true);
            if (Statics.field1639 == null) {
                Statics.field208.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1639.getInsets();
                Statics.field208.setLocation(var6.left, var6.top);
            }
        }
        this.method160();
    }

    @ObfuscatedName("es.oe(S)V")
    public final synchronized void method2600() {
        if (field2050) {
            return;
        }
        field2050 = true;
        try {
            Statics.field208.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method161();
        } catch (Exception var7) {
        }
        if (Statics.field1639 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1752 != null) {
            try {
                Statics.field1752.method2494();
            } catch (Exception var5) {
            }
        }
        this.method219();
    }

    @ObfuscatedName("w.om(I)V")
    public static final void method453() {
        Statics.field1678.method2453();
        for (int var0 = 0; var0 < 32; var0++) {
            field2059[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2053[var1] = 0L;
        }
        Statics.field2703 = 0;
    }

    public void start() {
        if (field2063 == this && !field2050) {
            field2052 = 0L;
        }
    }

    public void stop() {
        if (field2063 == this && !field2050) {
            field2052 = class103.method16() + 4000L;
        }
    }

    public void destroy() {
        if (field2063 == this && !field2050) {
            field2052 = class103.method16();
            class114.method1888(5000L);
            this.method2600();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2063 != this || field2050) {
            return;
        }
        field2056 = true;
        if (Statics.field1934 != null && Statics.field1934.startsWith("1.5") && class103.method16() - field2058 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1861 && var2.height >= Statics.field1248) {
                field2062 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2064 = true;
        field2056 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2064 = false;
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

    @ObfuscatedName("cu.oj(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method1969(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field208.getGraphics();
            if (Statics.field1880 == null) {
                Statics.field1880 = new Font("Helvetica", 1, 13);
                Statics.field145 = Statics.field208.getFontMetrics(Statics.field1880);
            }
            if (field2056) {
                field2056 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1861, Statics.field1248);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1043 == null) {
                    Statics.field1043 = Statics.field208.createImage(304, 34);
                }
                Graphics var4 = Statics.field1043.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1880);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field145.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1043, Statics.field1861 / 2 - 152, Statics.field1248 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1861 / 2 - 152;
                int var7 = Statics.field1248 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1880);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field145.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field208.repaint();
        }
    }

    @ObfuscatedName("df.og(I)V")
    public static final void method2566() {
        Statics.field1043 = null;
        Statics.field1880 = null;
        Statics.field145 = null;
    }

    @ObfuscatedName("es.od(Ljava/lang/String;I)V")
    public void method2606(String arg0) {
        if (this.field2054) {
            return;
        }
        this.field2054 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("es.j(B)V")
    public abstract void method158();

    @ObfuscatedName("es.d(I)V")
    public abstract void method160();

    @ObfuscatedName("es.l(B)V")
    public abstract void method219();

    @ObfuscatedName("es.v(I)V")
    public abstract void method161();

    @ObfuscatedName("es.c(B)V")
    public abstract void method159();
}
