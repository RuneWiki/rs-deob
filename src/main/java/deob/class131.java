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

@ObfuscatedName("eq")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eq.or")
    public static class131 field2071 = null;

    @ObfuscatedName("eq.os")
    public static int field2066 = 0;

    @ObfuscatedName("eq.on")
    public static long field2067 = 0L;

    @ObfuscatedName("eq.ou")
    public static boolean field2068 = false;

    @ObfuscatedName("eq.of")
    public static int field2077 = 20;

    @ObfuscatedName("eq.og")
    public static int field2079 = 1;

    @ObfuscatedName("eq.ow")
    public static int field2072 = 0;

    @ObfuscatedName("eq.po")
    public static long[] field2073 = new long[32];

    @ObfuscatedName("eq.pl")
    public static long[] field2065 = new long[32];

    @ObfuscatedName("eq.pc")
    public static volatile boolean field2075 = true;

    @ObfuscatedName("eq.pf")
    public static int field2076 = 500;

    @ObfuscatedName("eq.pt")
    public static volatile boolean field2070 = false;

    @ObfuscatedName("eq.pu")
    public static volatile long field2078 = 0L;

    @ObfuscatedName("eq.pm")
    public static volatile boolean field2074 = true;

    @ObfuscatedName("eq.oe")
    public boolean field2069 = false;

    @ObfuscatedName("eq.oh(IIIB)V")
    public final void method2567(int arg0, int arg1, int arg2) {
        try {
            if (field2071 != null) {
                field2066++;
                if (field2066 >= 3) {
                    this.method2546("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2071 = this;
            Statics.field1853 = arg0;
            Statics.field1597 = arg1;
            Statics.field2093 = arg2;
            Statics.field1902 = this;
            if (Statics.field1953 == null) {
                Statics.field1953 = new class123();
            }
            Statics.field1953.method2418(this, 1);
        } catch (Exception var5) {
            class135.method1813((String) null, var5);
            this.method2546("crash");
        }
    }

    @ObfuscatedName("eq.od(I)V")
    public final synchronized void method2535() {
        Container var1;
        if (Statics.field2126 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2126;
        }
        if (Statics.field61 != null) {
            Statics.field61.removeFocusListener(this);
            var1.remove(Statics.field61);
        }
        Statics.field61 = new class126(this);
        var1.add(Statics.field61);
        Statics.field61.setSize(Statics.field1853, Statics.field1597);
        Statics.field61.setVisible(true);
        if (Statics.field2126 == null) {
            Statics.field61.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2126.getInsets();
            Statics.field61.setLocation(var2.left, var2.top);
        }
        Statics.field61.addFocusListener(this);
        Statics.field61.requestFocus();
        field2075 = true;
        field2070 = false;
        field2078 = class103.method1837();
    }

    @ObfuscatedName("eq.oz(B)Z")
    public final boolean method2536() {
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
                this.method2546("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1970 != null) {
                String var1 = Statics.field1970.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1958;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2546("wrongjava");
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
                        boolean var7 = class200.method2037(var6, 10, true);
                        if (var7 && class200.method2630(var6) < 10) {
                            this.method2546("wrongjava");
                            return;
                        }
                    }
                    field2079 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2535();
            int var8 = Statics.field1853;
            int var9 = Statics.field1597;
            Canvas var10 = Statics.field61;
            class71 var12;
            try {
                class75 var11 = new class75();
                var11.method1317(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var23) {
                class69 var14 = new class69();
                var14.method1317(var8, var9, var10);
                var12 = var14;
            }
            Statics.field94 = var12;
            this.method242();
            class120 var15;
            try {
                var15 = new class134();
            } catch (Throwable var22) {
                var15 = new class128();
            }
            Statics.field143 = var15;
            label99: while (true) {
                class123 var18;
                Canvas var19;
                do {
                    if (field2067 != 0L && class103.method1837() >= field2067) {
                        break label99;
                    }
                    Statics.field1917 = Statics.field143.method2389(field2077, field2079);
                    for (int var17 = 0; var17 < Statics.field1917; var17++) {
                        this.method2574();
                    }
                    this.method2538();
                    var18 = Statics.field1953;
                    var19 = Statics.field61;
                } while (var18.field1964 == null);
                for (int var20 = 0; var20 < 50 && var18.field1964.peekEvent() != null; var20++) {
                    class114.method26(1L);
                }
                if (var19 != null) {
                    var18.field1964.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var24) {
            class135.method1813((String) null, var24);
            this.method2546("crash");
        }
        this.method2539();
    }

    @ObfuscatedName("eq.ok(B)V")
    public void method2574() {
        long var1 = class103.method1837();
        long var3 = field2065[Statics.field660];
        field2065[Statics.field660] = var1;
        Statics.field660 = Statics.field660 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2495 = field2074;
        }
        this.method168();
    }

    @ObfuscatedName("eq.oc(B)V")
    public void method2538() {
        long var1 = class103.method1837();
        long var3 = field2073[Statics.field2154];
        field2073[Statics.field2154] = var1;
        Statics.field2154 = Statics.field2154 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2072 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2076 - 1 > 50) {
            field2076 -= 50;
            field2075 = true;
            Statics.field61.setSize(Statics.field1853, Statics.field1597);
            Statics.field61.setVisible(true);
            if (Statics.field2126 == null) {
                Statics.field61.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2126.getInsets();
                Statics.field61.setLocation(var6.left, var6.top);
            }
        }
        this.method192();
    }

    @ObfuscatedName("eq.op(B)V")
    public final synchronized void method2539() {
        if (field2068) {
            return;
        }
        field2068 = true;
        try {
            Statics.field61.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method241();
        } catch (Exception var7) {
        }
        if (Statics.field2126 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1953 != null) {
            try {
                Statics.field1953.method2413();
            } catch (Exception var5) {
            }
        }
        this.method165();
    }

    public void start() {
        if (field2071 == this && !field2068) {
            field2067 = 0L;
        }
    }

    public void stop() {
        if (field2071 == this && !field2068) {
            field2067 = class103.method1837() + 4000L;
        }
    }

    public void destroy() {
        if (field2071 == this && !field2068) {
            field2067 = class103.method1837();
            class114.method26(5000L);
            this.method2539();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2071 != this || field2068) {
            return;
        }
        field2075 = true;
        if (Statics.field1958 != null && Statics.field1958.startsWith("1.5") && class103.method1837() - field2078 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1853 && var2.height >= Statics.field1597) {
                field2070 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2074 = true;
        field2075 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2074 = false;
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

    @ObfuscatedName("e.oa(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method487(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field61.getGraphics();
            if (Statics.field1540 == null) {
                Statics.field1540 = new Font("Helvetica", 1, 13);
                Statics.field784 = Statics.field61.getFontMetrics(Statics.field1540);
            }
            if (field2075) {
                field2075 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1853, Statics.field1597);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1922 == null) {
                    Statics.field1922 = Statics.field61.createImage(304, 34);
                }
                Graphics var4 = Statics.field1922.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1540);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field784.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1922, Statics.field1853 / 2 - 152, Statics.field1597 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1853 / 2 - 152;
                int var7 = Statics.field1597 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1540);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field784.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field61.repaint();
        }
    }

    @ObfuscatedName("eq.ov(Ljava/lang/String;I)V")
    public void method2546(String arg0) {
        if (this.field2069) {
            return;
        }
        this.field2069 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eq.l(I)V")
    public abstract void method241();

    @ObfuscatedName("eq.v(I)V")
    public abstract void method165();

    @ObfuscatedName("eq.i(I)V")
    public abstract void method168();

    @ObfuscatedName("eq.m(I)V")
    public abstract void method242();

    @ObfuscatedName("eq.t(I)V")
    public abstract void method192();
}
