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

@ObfuscatedName("eh")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eh.oo")
    public static class131 field2046 = null;

    @ObfuscatedName("eh.oe")
    public static int field2042 = 0;

    @ObfuscatedName("eh.on")
    public static long field2043 = 0L;

    @ObfuscatedName("eh.ou")
    public static boolean field2044 = false;

    @ObfuscatedName("eh.od")
    public static int field2045 = 20;

    @ObfuscatedName("eh.ob")
    public static int field2047 = 1;

    @ObfuscatedName("eh.oi")
    public static int field2048 = 0;

    @ObfuscatedName("eh.pd")
    public static long[] field2055 = new long[32];

    @ObfuscatedName("eh.pz")
    public static long[] field2051 = new long[32];

    @ObfuscatedName("eh.pr")
    public static volatile boolean field2041 = true;

    @ObfuscatedName("eh.pe")
    public static int field2052 = 500;

    @ObfuscatedName("eh.pi")
    public static volatile boolean field2053 = false;

    @ObfuscatedName("eh.pw")
    public static volatile long field2054 = 0L;

    @ObfuscatedName("eh.pp")
    public static volatile boolean field2049 = true;

    @ObfuscatedName("eh.ot")
    public boolean field2050 = false;

    @ObfuscatedName("eh.nw(IIII)V")
    public final void method2606(int arg0, int arg1, int arg2) {
        try {
            if (field2046 != null) {
                field2042++;
                if (field2042 >= 3) {
                    this.method2631("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2046 = this;
            Statics.field927 = arg0;
            Statics.field630 = arg1;
            Statics.field2068 = arg2;
            Statics.field1754 = this;
            if (Statics.field2036 == null) {
                Statics.field2036 = new class123();
            }
            Statics.field2036.method2468(this, 1);
        } catch (Exception var5) {
            Statics.method96((String) null, var5);
            this.method2631("crash");
        }
    }

    @ObfuscatedName("eh.nv(I)V")
    public final synchronized void method2638() {
        Container var1;
        if (Statics.field994 == null) {
            var1 = this;
        } else {
            var1 = Statics.field994;
        }
        if (Statics.field510 != null) {
            Statics.field510.removeFocusListener(this);
            var1.remove(Statics.field510);
        }
        Statics.field510 = new class126(this);
        var1.add(Statics.field510);
        Statics.field510.setSize(Statics.field927, Statics.field630);
        Statics.field510.setVisible(true);
        if (Statics.field994 == null) {
            Statics.field510.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field994.getInsets();
            Statics.field510.setLocation(var2.left, var2.top);
        }
        Statics.field510.addFocusListener(this);
        Statics.field510.requestFocus();
        field2041 = true;
        field2053 = false;
        field2054 = class103.method2037();
    }

    @ObfuscatedName("eh.ns(S)Z")
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
                this.method2631("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1936 != null) {
                String var1 = Statics.field1936.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1930;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2631("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class199.method778(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class199.method3432(var4)) {
                            int var5 = class199.method2039(var4, 10, true);
                            if (var5 < 10) {
                                this.method2631("wrongjava");
                                return;
                            }
                        }
                    }
                    field2047 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2638();
            Statics.field1333 = class71.method3032(Statics.field927, Statics.field630, Statics.field510);
            this.method270();
            Statics.field1807 = class120.method160();
            label77: while (true) {
                class123 var7;
                Canvas var8;
                do {
                    if (field2043 != 0L && class103.method2037() >= field2043) {
                        break label77;
                    }
                    Statics.field136 = Statics.field1807.method2435(field2045, field2047);
                    for (int var6 = 0; var6 < Statics.field136; var6++) {
                        this.method2643();
                    }
                    this.method2609();
                    var7 = Statics.field2036;
                    var8 = Statics.field510;
                } while (var7.field1938 == null);
                for (int var9 = 0; var9 < 50 && var7.field1938.peekEvent() != null; var9++) {
                    class114.method2031(1L);
                }
                if (var8 != null) {
                    var7.field1938.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            Statics.method96((String) null, var11);
            this.method2631("crash");
        }
        this.method2610();
    }

    @ObfuscatedName("eh.nz(B)V")
    public void method2643() {
        long var1 = class103.method2037();
        long var3 = field2051[Statics.field973];
        field2051[Statics.field973] = var1;
        Statics.field973 = Statics.field973 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1267 = field2049;
        }
        this.method184();
    }

    @ObfuscatedName("eh.ny(B)V")
    public void method2609() {
        long var1 = class103.method2037();
        long var3 = field2055[Statics.field1875];
        field2055[Statics.field1875] = var1;
        Statics.field1875 = Statics.field1875 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2048 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2052 - 1 > 50) {
            field2052 -= 50;
            field2041 = true;
            Statics.field510.setSize(Statics.field927, Statics.field630);
            Statics.field510.setVisible(true);
            if (Statics.field994 == null) {
                Statics.field510.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field994.getInsets();
                Statics.field510.setLocation(var6.left, var6.top);
            }
        }
        this.method418();
    }

    @ObfuscatedName("eh.nt(I)V")
    public final synchronized void method2610() {
        if (field2044) {
            return;
        }
        field2044 = true;
        try {
            Statics.field510.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method186();
        } catch (Exception var7) {
        }
        if (Statics.field994 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2036 != null) {
            try {
                Statics.field2036.method2489();
            } catch (Exception var5) {
            }
        }
        this.method180();
    }

    public void start() {
        if (field2046 == this && !field2044) {
            field2043 = 0L;
        }
    }

    public void stop() {
        if (field2046 == this && !field2044) {
            field2043 = class103.method2037() + 4000L;
        }
    }

    public void destroy() {
        if (field2046 == this && !field2044) {
            field2043 = class103.method2037();
            class114.method2031(5000L);
            this.method2610();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2046 != this || field2044) {
            return;
        }
        field2041 = true;
        if (Statics.field1930 != null && Statics.field1930.startsWith("1.5") && class103.method2037() - field2054 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field927 && var2.height >= Statics.field630) {
                field2053 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2049 = true;
        field2041 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2049 = false;
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

    @ObfuscatedName("bf.no(B)V")
    public static final void method1037() {
        Statics.field1082 = null;
        Statics.field1787 = null;
        Statics.field1876 = null;
    }

    @ObfuscatedName("eh.nq(Ljava/lang/String;I)V")
    public void method2631(String arg0) {
        if (this.field2050) {
            return;
        }
        this.field2050 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("eh.d(I)V")
    public abstract void method270();

    @ObfuscatedName("eh.v(B)V")
    public abstract void method418();

    @ObfuscatedName("eh.n(B)V")
    public abstract void method184();

    @ObfuscatedName("eh.s(B)V")
    public abstract void method180();

    @ObfuscatedName("eh.z(I)V")
    public abstract void method186();
}
