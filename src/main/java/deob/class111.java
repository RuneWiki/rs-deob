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

@ObfuscatedName("dk")
public abstract class class111 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dk.n")
    public static class111 field1537 = null;

    @ObfuscatedName("dk.q")
    public static int field1521 = 0;

    @ObfuscatedName("dk.h")
    public static long field1522 = 0L;

    @ObfuscatedName("dk.k")
    public static boolean field1523 = false;

    @ObfuscatedName("dk.r")
    public boolean field1527 = false;

    @ObfuscatedName("dk.i")
    public static int field1525 = 20;

    @ObfuscatedName("dk.e")
    public static int field1526 = 1;

    @ObfuscatedName("dk.a")
    public static int field1536 = 0;

    @ObfuscatedName("dk.v")
    public static long[] field1532 = new long[32];

    @ObfuscatedName("dk.m")
    public static long[] field1531 = new long[32];

    @ObfuscatedName("dk.p")
    public static volatile boolean field1535 = true;

    @ObfuscatedName("dk.ap")
    public static int field1530 = 500;

    @ObfuscatedName("dk.ai")
    public static volatile boolean field1538 = false;

    @ObfuscatedName("dk.ae")
    public static volatile long field1539 = 0L;

    @ObfuscatedName("dk.ad")
    public static volatile boolean field1540 = true;

    @ObfuscatedName("dk.h(IIII)V")
    public final void method1345(int arg0, int arg1, int arg2) {
        try {
            if (field1537 != null) {
                field1521++;
                if (field1521 >= 3) {
                    this.method1351("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1537 = this;
            Statics.field1581 = arg0;
            Statics.field1529 = arg1;
            Statics.field2498 = arg2;
            Statics.field2496 = this;
            if (Statics.field1519 == null) {
                Statics.field1519 = new class34();
            }
            Statics.field1519.method420(this, 1);
        } catch (Exception var5) {
            class169.method255((String) null, var5);
            this.method1351("crash");
        }
    }

    @ObfuscatedName("dk.k(B)V")
    public final synchronized void method1384() {
        Container var1;
        if (Statics.field368 == null) {
            var1 = this;
        } else {
            var1 = Statics.field368;
        }
        if (Statics.field1094 != null) {
            Statics.field1094.removeFocusListener(this);
            var1.remove(Statics.field1094);
        }
        Statics.field1094 = new class168(this);
        var1.add(Statics.field1094);
        Statics.field1094.setSize(Statics.field1581, Statics.field1529);
        Statics.field1094.setVisible(true);
        if (Statics.field368 == null) {
            Statics.field1094.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field368.getInsets();
            Statics.field1094.setLocation(var2.left, var2.top);
        }
        Statics.field1094.addFocusListener(this);
        Statics.field1094.requestFocus();
        field1535 = true;
        field1538 = false;
        field1539 = class63.method697();
    }

    @ObfuscatedName("dk.e(I)Z")
    public final boolean method1339() {
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
                this.method1351("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2494 != null) {
                String var1 = Statics.field2494.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1453;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1351("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class82.method857(var2.charAt(var3)); var3++) {
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
                            label193: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label193;
                                    }
                                    if (var10 == '+') {
                                        break label193;
                                    }
                                }
                                int var24;
                                if (var10 >= '0' && var10 <= '9') {
                                    var24 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var24 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var24 = var10 - 'W';
                                }
                                if (var24 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var24 = -var24;
                                }
                                int var12 = var7 * 10 + var24;
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
                            int var14 = class82.method740(var4, 10, true);
                            if (var14 < 10) {
                                this.method1351("wrongjava");
                                return;
                            }
                        }
                    }
                    field1526 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1384();
            Statics.field1475 = class40.method2336(Statics.field1581, Statics.field1529, Statics.field1094);
            this.method1392();
            class29 var15;
            try {
                var15 = new class116();
            } catch (Throwable var22) {
                var15 = new class115();
            }
            Statics.field1528 = var15;
            label112: while (true) {
                class34 var18;
                Canvas var19;
                do {
                    if (field1522 != 0L && class63.method697() >= field1522) {
                        break label112;
                    }
                    Statics.field2486 = Statics.field1528.method361(field1525, field1526);
                    for (int var17 = 0; var17 < Statics.field2486; var17++) {
                        this.method1383();
                    }
                    this.method1342();
                    var18 = Statics.field1519;
                    var19 = Statics.field1094;
                } while (var18.field377 == null);
                for (int var20 = 0; var20 < 50 && var18.field377.peekEvent() != null; var20++) {
                    Statics.method101(1L);
                }
                if (var19 != null) {
                    var18.field377.postEvent(new ActionEvent(var19, 1001, "dummy"));
                }
            }
        } catch (Exception var23) {
            class169.method255((String) null, var23);
            this.method1351("crash");
        }
        this.method1366();
    }

    @ObfuscatedName("dk.a(B)V")
    public void method1383() {
        long var1 = class63.method697();
        long var3 = field1531[Statics.field1524];
        field1531[Statics.field1524] = var1;
        Statics.field1524 = Statics.field1524 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1476 = field1540;
        }
        this.method1348();
    }

    @ObfuscatedName("dk.g(S)V")
    public void method1342() {
        long var1 = class63.method697();
        long var3 = field1532[Statics.field798];
        field1532[Statics.field798] = var1;
        Statics.field798 = Statics.field798 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1536 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1530 - 1 > 50) {
            field1530 -= 50;
            field1535 = true;
            Statics.field1094.setSize(Statics.field1581, Statics.field1529);
            Statics.field1094.setVisible(true);
            if (Statics.field368 == null) {
                Statics.field1094.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field368.getInsets();
                Statics.field1094.setLocation(var6.left, var6.top);
            }
        }
        this.method1349();
    }

    @ObfuscatedName("dk.w(I)V")
    public final synchronized void method1366() {
        if (field1523) {
            return;
        }
        field1523 = true;
        try {
            Statics.field1094.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method1350();
        } catch (Exception var7) {
        }
        if (Statics.field368 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1519 != null) {
            try {
                Statics.field1519.method430();
            } catch (Exception var5) {
            }
        }
        this.method1352();
    }

    @ObfuscatedName("aa.v(I)V")
    public static final void method524() {
        Statics.field1528.method360();
        for (int var0 = 0; var0 < 32; var0++) {
            field1532[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1531[var1] = 0L;
        }
        Statics.field2486 = 0;
    }

    public void start() {
        if (field1537 == this && !field1523) {
            field1522 = 0L;
        }
    }

    public void stop() {
        if (field1537 == this && !field1523) {
            field1522 = class63.method697() + 4000L;
        }
    }

    public void destroy() {
        if (field1537 == this && !field1523) {
            field1522 = class63.method697();
            Statics.method101(5000L);
            this.method1366();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1537 != this || field1523) {
            return;
        }
        field1535 = true;
        if (Statics.field1453 != null && Statics.field1453.startsWith("1.5") && class63.method697() - field1539 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1581 && var2.height >= Statics.field1529) {
                field1538 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1540 = true;
        field1535 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1540 = false;
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

    @ObfuscatedName("ck.d(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1089(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1094.getGraphics();
            if (Statics.field857 == null) {
                Statics.field857 = new Font("Helvetica", 1, 13);
                Statics.field1534 = Statics.field1094.getFontMetrics(Statics.field857);
            }
            if (field1535) {
                field1535 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1581, Statics.field1529);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1533 == null) {
                    Statics.field1533 = Statics.field1094.createImage(304, 34);
                }
                Graphics var4 = Statics.field1533.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field857);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1534.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1533, Statics.field1581 / 2 - 152, Statics.field1529 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1581 / 2 - 152;
                int var7 = Statics.field1529 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field857);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1534.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1094.repaint();
        }
    }

    @ObfuscatedName("dk.x(Ljava/lang/String;I)V")
    public void method1351(String arg0) {
        if (this.field1527) {
            return;
        }
        this.field1527 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("dk.m(I)V")
    public abstract void method1348();

    @ObfuscatedName("dk.b(I)V")
    public abstract void method1349();

    @ObfuscatedName("dk.f(I)V")
    public abstract void method1350();

    @ObfuscatedName("dk.z(I)V")
    public abstract void method1352();

    @ObfuscatedName("dk.u(I)V")
    public abstract void method1392();
}
