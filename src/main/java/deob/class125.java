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

@ObfuscatedName("bf")
public abstract class class125 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.oi")
    public static class125 field2000 = null;

    @ObfuscatedName("bf.ow")
    public static int field1998 = 0;

    @ObfuscatedName("bf.ou")
    public static long field2002 = 0L;

    @ObfuscatedName("bf.ol")
    public static boolean field2014 = false;

    @ObfuscatedName("bf.og")
    public static int field2004 = 20;

    @ObfuscatedName("bf.oz")
    public static int field2003 = 1;

    @ObfuscatedName("bf.oa")
    public static int field2011 = 0;

    @ObfuscatedName("bf.pu")
    public static long[] field2005 = new long[32];

    @ObfuscatedName("bf.pe")
    public static long[] field2006 = new long[32];

    @ObfuscatedName("bf.pa")
    public static volatile boolean field1997 = true;

    @ObfuscatedName("bf.pl")
    public static int field2008 = 500;

    @ObfuscatedName("bf.pk")
    public static volatile boolean field2009 = false;

    @ObfuscatedName("bf.pt")
    public static volatile long field2010 = 0L;

    @ObfuscatedName("bf.px")
    public static volatile boolean field2007 = true;

    @ObfuscatedName("bf.oe")
    public boolean field2001 = false;

    public void stop() {
        if (field2000 == this && !field2014) {
            field2002 = class38.method2385() + 4000L;
        }
    }

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @ObfuscatedName("bf.ov(I)V")
    public final synchronized void method2209() {
        Container var1;
        if (Statics.field1929 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1929;
        }
        if (Statics.field1812 != null) {
            Statics.field1812.removeFocusListener(this);
            var1.remove(Statics.field1812);
        }
        Statics.field1812 = new class110(this);
        var1.add(Statics.field1812);
        Statics.field1812.setSize(Statics.field2459, Statics.field534);
        Statics.field1812.setVisible(true);
        if (Statics.field1929 == null) {
            Statics.field1812.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1929.getInsets();
            Statics.field1812.setLocation(var2.left, var2.top);
        }
        Statics.field1812.addFocusListener(this);
        Statics.field1812.requestFocus();
        field1997 = true;
        field2009 = false;
        field2010 = class38.method2385();
    }

    @ObfuscatedName("bf.oh(I)Z")
    public final boolean method2210() {
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
                this.method2214("invalidhost");
                return false;
            }
        }
    }

    @ObfuscatedName("bf.on(I)V")
    public void method2212() {
        long var1 = class38.method2385();
        long var3 = field2006[Statics.field627];
        field2006[Statics.field627] = var1;
        Statics.field627 = Statics.field627 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field666 = field2007;
        }
        this.method1766();
    }

    @ObfuscatedName("bf.oq(I)V")
    public void method2213() {
        long var1 = class38.method2385();
        long var3 = field2005[Statics.field849];
        field2005[Statics.field849] = var1;
        Statics.field849 = Statics.field849 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2011 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2008 - 1 > 50) {
            field2008 -= 50;
            field1997 = true;
            Statics.field1812.setSize(Statics.field2459, Statics.field534);
            Statics.field1812.setVisible(true);
            if (Statics.field1929 == null) {
                Statics.field1812.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1929.getInsets();
                Statics.field1812.setLocation(var6.left, var6.top);
            }
        }
        this.method1825();
    }

    @ObfuscatedName("bf.d(B)V")
    public abstract void method1766();

    public void start() {
        if (field2000 == this && !field2014) {
            field2002 = 0L;
        }
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    @ObfuscatedName("bf.oo(Ljava/lang/String;I)V")
    public void method2214(String arg0) {
        if (this.field2001) {
            return;
        }
        this.field2001 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2000 != this || field2014) {
            return;
        }
        field1997 = true;
        if (Statics.field1924 != null && Statics.field1924.startsWith("1.5") && class38.method2385() - field2010 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2459 && var2.height >= Statics.field534) {
                field2009 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2007 = true;
        field1997 = true;
    }

    @ObfuscatedName("bf.od(I)V")
    public final synchronized void method2218() {
        if (field2014) {
            return;
        }
        field2014 = true;
        try {
            Statics.field1812.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method1670();
        } catch (Exception var7) {
        }
        if (Statics.field1929 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1999 != null) {
            try {
                Statics.field1999.method2071();
            } catch (Exception var5) {
            }
        }
        this.method1716();
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void focusLost(FocusEvent arg0) {
        field2007 = false;
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    public abstract void init();

    @ObfuscatedName("bf.l(I)V")
    public abstract void method1825();

    @ObfuscatedName("bf.k(B)V")
    public abstract void method1716();

    public final void windowActivated(WindowEvent arg0) {
    }

    public void destroy() {
        if (field2000 == this && !field2014) {
            field2002 = class38.method2385();
            class134.method600(5000L);
            this.method2218();
        }
    }

    public void run() {
        try {
            if (Statics.field1923 != null) {
                String var1 = Statics.field1923.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1924;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2214("wrongjava");
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
                        if (class91.method2381(var6) && class91.method2282(var6) < 10) {
                            this.method2214("wrongjava");
                            return;
                        }
                    }
                    field2003 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2209();
            Statics.field617 = class140.method550(Statics.field2459, Statics.field534, Statics.field1812);
            this.method1667();
            class123 var7;
            try {
                var7 = new class149();
            } catch (Throwable var14) {
                var7 = new class127();
            }
            Statics.field2031 = var7;
            label91: while (true) {
                class116 var10;
                Canvas var11;
                do {
                    if (field2002 != 0L && class38.method2385() >= field2002) {
                        break label91;
                    }
                    Statics.field557 = Statics.field2031.method2188(field2004, field2003);
                    for (int var9 = 0; var9 < Statics.field557; var9++) {
                        this.method2212();
                    }
                    this.method2213();
                    var10 = Statics.field1999;
                    var11 = Statics.field1812;
                } while (var10.field1921 == null);
                for (int var12 = 0; var12 < 50 && var10.field1921.peekEvent() != null; var12++) {
                    class134.method600(1L);
                }
                if (var11 != null) {
                    var10.field1921.postEvent(new ActionEvent(var11, 1001, "dummy"));
                }
            }
        } catch (Exception var15) {
            class136.method1127((String) null, var15);
            this.method2214("crash");
        }
        this.method2218();
    }

    @ObfuscatedName("bf.t(B)V")
    public abstract void method1667();

    public final void windowIconified(WindowEvent arg0) {
    }

    @ObfuscatedName("bf.os(IIII)V")
    public final void method2258(int arg0, int arg1, int arg2) {
        try {
            if (field2000 != null) {
                field1998++;
                if (field1998 >= 3) {
                    this.method2214("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2000 = this;
            Statics.field2459 = arg0;
            Statics.field534 = arg1;
            Statics.field2103 = arg2;
            Statics.field2108 = this;
            if (Statics.field1999 == null) {
                Statics.field1999 = new class116();
            }
            Statics.field1999.method2077(this, 1);
        } catch (Exception var5) {
            class136.method1127((String) null, var5);
            this.method2214("crash");
        }
    }

    @ObfuscatedName("bf.f(I)V")
    public abstract void method1670();

    @ObfuscatedName("f.of(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method894(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1812.getGraphics();
            if (Statics.field2488 == null) {
                Statics.field2488 = new Font("Helvetica", 1, 13);
                Statics.field2648 = Statics.field1812.getFontMetrics(Statics.field2488);
            }
            if (field1997) {
                field1997 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field2459, Statics.field534);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2622 == null) {
                    Statics.field2622 = Statics.field1812.createImage(304, 34);
                }
                Graphics var4 = Statics.field2622.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2488);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field2648.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field2622, Statics.field2459 / 2 - 152, Statics.field534 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field2459 / 2 - 152;
                int var7 = Statics.field534 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field2488);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field2648.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("f.ox(I)V")
    public static final void method896() {
        Statics.field2622 = null;
        Statics.field2488 = null;
        Statics.field2648 = null;
    }
}
