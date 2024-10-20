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

@ObfuscatedName("ew")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ew.op")
    public static class131 field2063 = null;

    @ObfuscatedName("ew.og")
    public static int field2050 = 0;

    @ObfuscatedName("ew.oe")
    public static long field2051 = 0L;

    @ObfuscatedName("ew.on")
    public static boolean field2052 = false;

    @ObfuscatedName("ew.or")
    public static int field2054 = 20;

    @ObfuscatedName("ew.os")
    public static int field2055 = 1;

    @ObfuscatedName("ew.oc")
    public static int field2056 = 0;

    @ObfuscatedName("ew.oi")
    public static long[] field2061 = new long[32];

    @ObfuscatedName("ew.pf")
    public static long[] field2058 = new long[32];

    @ObfuscatedName("ew.pp")
    public static volatile boolean field2049 = true;

    @ObfuscatedName("ew.pm")
    public static int field2060 = 500;

    @ObfuscatedName("ew.pi")
    public static volatile boolean field2057 = false;

    @ObfuscatedName("ew.pk")
    public static volatile long field2062 = 0L;

    @ObfuscatedName("ew.pz")
    public static volatile boolean field2059 = true;

    @ObfuscatedName("ew.oy")
    public boolean field2053 = false;

    @ObfuscatedName("ew.pi(IIII)V")
    public final void method2596(int arg0, int arg1, int arg2) {
        try {
            if (field2063 != null) {
                field2050++;
                if (field2050 >= 3) {
                    this.method2606("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2063 = this;
            Statics.field1565 = arg0;
            Statics.field1056 = arg1;
            Statics.field2079 = arg2;
            Statics.field2083 = this;
            if (Statics.field1920 == null) {
                Statics.field1920 = new class123();
            }
            Statics.field1920.method2480(this, 1);
        } catch (Exception var5) {
            class135.method95((String) null, var5);
            this.method2606("crash");
        }
    }

    @ObfuscatedName("ew.pk(I)V")
    public final synchronized void method2597() {
        Container var1;
        if (Statics.field611 == null) {
            var1 = this;
        } else {
            var1 = Statics.field611;
        }
        if (Statics.field1007 != null) {
            Statics.field1007.removeFocusListener(this);
            var1.remove(Statics.field1007);
        }
        Statics.field1007 = new class126(this);
        var1.add(Statics.field1007);
        Statics.field1007.setSize(Statics.field1565, Statics.field1056);
        Statics.field1007.setVisible(true);
        if (Statics.field611 == null) {
            Statics.field1007.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field611.getInsets();
            Statics.field1007.setLocation(var2.left, var2.top);
        }
        Statics.field1007.addFocusListener(this);
        Statics.field1007.requestFocus();
        field2049 = true;
        field2057 = false;
        field2062 = class103.method527();
    }

    @ObfuscatedName("ew.pr(I)Z")
    public final boolean method2622() {
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
            if (Statics.field1940 != null) {
                String var1 = Statics.field1940.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1939;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2606("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class196.method936(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class196.method2696(var4)) {
                            int var5 = class196.method2963(var4, 10, true);
                            if (var5 < 10) {
                                this.method2606("wrongjava");
                                return;
                            }
                        }
                    }
                    field2055 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2597();
            Statics.field857 = class71.method507(Statics.field1565, Statics.field1056, Statics.field1007);
            this.method461();
            Statics.field78 = class120.method1887();
            while (field2051 == 0L || class103.method527() < field2051) {
                Statics.field102 = Statics.field78.method2453(field2054, field2055);
                for (int var6 = 0; var6 < Statics.field102; var6++) {
                    this.method2643();
                }
                this.method2598();
                class129.method745(Statics.field1920, Statics.field1007);
            }
        } catch (Exception var8) {
            class135.method95((String) null, var8);
            this.method2606("crash");
        }
        this.method2599();
    }

    @ObfuscatedName("ew.pz(B)V")
    public void method2643() {
        long var1 = class103.method527();
        long var3 = field2058[Statics.field1865];
        field2058[Statics.field1865] = var1;
        Statics.field1865 = Statics.field1865 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field815 = field2059;
        }
        this.method166();
    }

    @ObfuscatedName("ew.px(I)V")
    public void method2598() {
        long var1 = class103.method527();
        long var3 = field2061[Statics.field1679];
        field2061[Statics.field1679] = var1;
        Statics.field1679 = Statics.field1679 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2056 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2060 - 1 > 50) {
            field2060 -= 50;
            field2049 = true;
            Statics.field1007.setSize(Statics.field1565, Statics.field1056);
            Statics.field1007.setVisible(true);
            if (Statics.field611 == null) {
                Statics.field1007.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field611.getInsets();
                Statics.field1007.setLocation(var6.left, var6.top);
            }
        }
        this.method257();
    }

    @ObfuscatedName("ew.pb(I)V")
    public final synchronized void method2599() {
        if (field2052) {
            return;
        }
        field2052 = true;
        try {
            Statics.field1007.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method168();
        } catch (Exception var7) {
        }
        if (Statics.field611 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1920 != null) {
            try {
                Statics.field1920.method2494();
            } catch (Exception var5) {
            }
        }
        this.method163();
    }

    public void start() {
        if (field2063 == this && !field2052) {
            field2051 = 0L;
        }
    }

    public void stop() {
        if (field2063 == this && !field2052) {
            field2051 = class103.method527() + 4000L;
        }
    }

    public void destroy() {
        if (field2063 == this && !field2052) {
            field2051 = class103.method527();
            class114.method658(5000L);
            this.method2599();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2063 != this || field2052) {
            return;
        }
        field2049 = true;
        if (Statics.field1939 != null && Statics.field1939.startsWith("1.5") && class103.method527() - field2062 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1565 && var2.height >= Statics.field1056) {
                field2057 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2059 = true;
        field2049 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2059 = false;
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

    @ObfuscatedName("at.ps(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method848(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1007.getGraphics();
            if (Statics.field1280 == null) {
                Statics.field1280 = new Font("Helvetica", 1, 13);
                Statics.field948 = Statics.field1007.getFontMetrics(Statics.field1280);
            }
            if (field2049) {
                field2049 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1565, Statics.field1056);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2534 == null) {
                    Statics.field2534 = Statics.field1007.createImage(304, 34);
                }
                Graphics var4 = Statics.field2534.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1280);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field948.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2534, Statics.field1565 / 2 - 152, Statics.field1056 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1565 / 2 - 152;
                int var7 = Statics.field1056 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1280);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field948.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1007.repaint();
        }
    }

    @ObfuscatedName("ew.pw(Ljava/lang/String;I)V")
    public void method2606(String arg0) {
        if (this.field2053) {
            return;
        }
        this.field2053 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ew.m(I)V")
    public abstract void method166();

    public abstract void init();

    @ObfuscatedName("ew.t(B)V")
    public abstract void method257();

    @ObfuscatedName("ew.l(I)V")
    public abstract void method168();

    @ObfuscatedName("ew.a(I)V")
    public abstract void method163();

    @ObfuscatedName("ew.k(I)V")
    public abstract void method461();
}
