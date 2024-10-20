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

@ObfuscatedName("ev")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ev.oj")
    public static class131 field2041 = null;

    @ObfuscatedName("ev.ot")
    public static int field2044 = 0;

    @ObfuscatedName("ev.oc")
    public static long field2038 = 0L;

    @ObfuscatedName("ev.oi")
    public static boolean field2039 = false;

    @ObfuscatedName("ev.oe")
    public static int field2037 = 20;

    @ObfuscatedName("ev.oa")
    public static int field2042 = 1;

    @ObfuscatedName("ev.om")
    public static int field2043 = 0;

    @ObfuscatedName("ev.or")
    public static long[] field2048 = new long[32];

    @ObfuscatedName("ev.pk")
    public static long[] field2045 = new long[32];

    @ObfuscatedName("ev.pz")
    public static volatile boolean field2046 = true;

    @ObfuscatedName("ev.ph")
    public static int field2047 = 500;

    @ObfuscatedName("ev.pj")
    public static volatile boolean field2050 = false;

    @ObfuscatedName("ev.pa")
    public static volatile long field2049 = 0L;

    @ObfuscatedName("ev.pm")
    public static volatile boolean field2036 = true;

    @ObfuscatedName("ev.ow")
    public boolean field2040 = false;

    @ObfuscatedName("ev.os(IIIS)V")
    public final void method2602(int arg0, int arg1, int arg2) {
        try {
            if (field2041 != null) {
                field2044++;
                if (field2044 >= 3) {
                    this.method2614("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2041 = this;
            Statics.field2075 = arg0;
            Statics.field1429 = arg1;
            Statics.field2065 = arg2;
            Statics.field2068 = this;
            if (Statics.field1881 == null) {
                Statics.field1881 = new class123();
            }
            Statics.field1881.method2484(this, 1);
        } catch (Exception var5) {
            class135.method2452((String) null, var5);
            this.method2614("crash");
        }
    }

    @ObfuscatedName("ev.ok(B)V")
    public final synchronized void method2619() {
        Container var1;
        if (Statics.field101 == null) {
            var1 = this;
        } else {
            var1 = Statics.field101;
        }
        if (Statics.field2676 != null) {
            Statics.field2676.removeFocusListener(this);
            var1.remove(Statics.field2676);
        }
        Statics.field2676 = new class126(this);
        var1.add(Statics.field2676);
        Statics.field2676.setSize(Statics.field2075, Statics.field1429);
        Statics.field2676.setVisible(true);
        if (Statics.field101 == null) {
            Statics.field2676.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field101.getInsets();
            Statics.field2676.setLocation(var2.left, var2.top);
        }
        Statics.field2676.addFocusListener(this);
        Statics.field2676.requestFocus();
        field2046 = true;
        field2050 = false;
        field2049 = class103.method26();
    }

    @ObfuscatedName("ev.ol(I)Z")
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
                this.method2614("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1927 != null) {
                String var1 = Statics.field1927.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1924;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2614("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class197.method2402(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class197.method175(var4)) {
                            int var5 = class197.method2389(var4, 10, true);
                            if (var5 < 10) {
                                this.method2614("wrongjava");
                                return;
                            }
                        }
                    }
                    field2042 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2619();
            Statics.field1631 = class71.method12(Statics.field2075, Statics.field1429, Statics.field2676);
            this.method394();
            class120 var6;
            try {
                var6 = new class134();
            } catch (Throwable var13) {
                var6 = new class128();
            }
            Statics.field1065 = var6;
            label85: while (true) {
                class123 var9;
                Canvas var10;
                do {
                    if (field2038 != 0L && class103.method26() >= field2038) {
                        break label85;
                    }
                    Statics.field1249 = Statics.field1065.method2458(field2037, field2042);
                    for (int var8 = 0; var8 < Statics.field1249; var8++) {
                        this.method2605();
                    }
                    this.method2606();
                    var9 = Statics.field1881;
                    var10 = Statics.field2676;
                } while (var9.field1926 == null);
                for (int var11 = 0; var11 < 50 && var9.field1926.peekEvent() != null; var11++) {
                    class114.method1960(1L);
                }
                if (var10 != null) {
                    var9.field1926.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class135.method2452((String) null, var14);
            this.method2614("crash");
        }
        this.method2646();
    }

    @ObfuscatedName("ev.oj(I)V")
    public void method2605() {
        long var1 = class103.method26();
        long var3 = field2045[Statics.field658];
        field2045[Statics.field658] = var1;
        Statics.field658 = Statics.field658 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1821 = field2036;
        }
        this.method176();
    }

    @ObfuscatedName("ev.ot(I)V")
    public void method2606() {
        long var1 = class103.method26();
        long var3 = field2048[Statics.field1792];
        field2048[Statics.field1792] = var1;
        Statics.field1792 = Statics.field1792 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2043 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2047 - 1 > 50) {
            field2047 -= 50;
            field2046 = true;
            Statics.field2676.setSize(Statics.field2075, Statics.field1429);
            Statics.field2676.setVisible(true);
            if (Statics.field101 == null) {
                Statics.field2676.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field101.getInsets();
                Statics.field2676.setLocation(var6.left, var6.top);
            }
        }
        this.method308();
    }

    @ObfuscatedName("ev.oc(I)V")
    public final synchronized void method2646() {
        if (field2039) {
            return;
        }
        field2039 = true;
        try {
            Statics.field2676.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method183();
        } catch (Exception var7) {
        }
        if (Statics.field101 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1881 != null) {
            try {
                Statics.field1881.method2480();
            } catch (Exception var5) {
            }
        }
        this.method211();
    }

    @ObfuscatedName("ae.oi(I)V")
    public static final void method827() {
        Statics.field1065.method2457();
        for (int var0 = 0; var0 < 32; var0++) {
            field2048[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2045[var1] = 0L;
        }
        Statics.field1249 = 0;
    }

    public void start() {
        if (field2041 == this && !field2039) {
            field2038 = 0L;
        }
    }

    public void stop() {
        if (field2041 == this && !field2039) {
            field2038 = class103.method26() + 4000L;
        }
    }

    public void destroy() {
        if (field2041 == this && !field2039) {
            field2038 = class103.method26();
            class114.method1960(5000L);
            this.method2646();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2041 != this || field2039) {
            return;
        }
        field2046 = true;
        if (Statics.field1924 != null && Statics.field1924.startsWith("1.5") && class103.method26() - field2049 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2075 && var2.height >= Statics.field1429) {
                field2050 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2036 = true;
        field2046 = true;
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

    @ObfuscatedName("do.ow(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2414(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field2676.getGraphics();
            if (Statics.field600 == null) {
                Statics.field600 = new Font("Helvetica", 1, 13);
                Statics.field194 = Statics.field2676.getFontMetrics(Statics.field600);
            }
            if (field2046) {
                field2046 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field2075, Statics.field1429);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field223 == null) {
                    Statics.field223 = Statics.field2676.createImage(304, 34);
                }
                Graphics var4 = Statics.field223.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field600);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field194.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field223, Statics.field2075 / 2 - 152, Statics.field1429 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field2075 / 2 - 152;
                int var7 = Statics.field1429 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field600);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field194.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field2676.repaint();
        }
    }

    @ObfuscatedName("ev.ox(Ljava/lang/String;I)V")
    public void method2614(String arg0) {
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

    @ObfuscatedName("ev.q(B)V")
    public abstract void method183();

    @ObfuscatedName("ev.s(I)V")
    public abstract void method308();

    @ObfuscatedName("ev.i(B)V")
    public abstract void method394();

    public abstract void init();

    @ObfuscatedName("ev.b(I)V")
    public abstract void method176();

    @ObfuscatedName("ev.a(I)V")
    public abstract void method211();
}
