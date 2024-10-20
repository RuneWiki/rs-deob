package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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

@ObfuscatedName("dp")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dp.pf")
    public static class114 field1779 = null;

    @ObfuscatedName("dp.po")
    public static int field1778 = 0;

    @ObfuscatedName("dp.pb")
    public static long field1785 = 0L;

    @ObfuscatedName("dp.pr")
    public static boolean field1772 = false;

    @ObfuscatedName("dp.pv")
    public static int field1774 = 20;

    @ObfuscatedName("dp.qg")
    public static int field1775 = 1;

    @ObfuscatedName("dp.qo")
    public static int field1776 = 0;

    @ObfuscatedName("dp.qu")
    public static long[] field1771 = new long[32];

    @ObfuscatedName("dp.qs")
    public static long[] field1780 = new long[32];

    @ObfuscatedName("dp.qr")
    public static int field1777 = 0;

    @ObfuscatedName("dp.qm")
    public static int field1784 = 0;

    @ObfuscatedName("dp.qk")
    public static volatile boolean field1781 = true;

    @ObfuscatedName("dp.qz")
    public static int field1782 = 500;

    @ObfuscatedName("dp.qf")
    public static boolean field1783 = false;

    @ObfuscatedName("dp.qv")
    public static volatile boolean field1769 = false;

    @ObfuscatedName("dp.qj")
    public static volatile long field1770 = 0L;

    @ObfuscatedName("dp.ri")
    public static volatile boolean field1786 = true;

    @ObfuscatedName("dp.pw")
    public boolean field1773 = false;

    @ObfuscatedName("dp.re(IIII)V")
    public final void method2043(int arg0, int arg1, int arg2) {
        try {
            if (field1779 != null) {
                field1778++;
                if (field1778 >= 3) {
                    this.method2042("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1779 = this;
            Statics.field170 = arg0;
            Statics.field1104 = arg1;
            Statics.field1651 = arg2;
            Statics.field1644 = this;
            if (Statics.field160 == null) {
                Statics.field160 = new class104();
            }
            Statics.field160.method1871(this, 1);
        } catch (Exception var5) {
            class102.method755((String) null, var5);
            this.method2042("crash");
        }
    }

    @ObfuscatedName("dp.rm(I)V")
    public final synchronized void method2000() {
        Container var1 = this.method2007();
        if (Statics.field1726 != null) {
            Statics.field1726.removeFocusListener(this);
            var1.remove(Statics.field1726);
        }
        Statics.field170 = Math.max(var1.getWidth(), Statics.field64);
        Statics.field1104 = Math.max(var1.getHeight(), Statics.field3198);
        if (Statics.field231 != null) {
            Insets var2 = Statics.field231.getInsets();
            Statics.field170 -= var2.right + var2.left;
            Statics.field1104 -= var2.top + var2.bottom;
        }
        Statics.field1726 = new class112(this);
        var1.add(Statics.field1726);
        Statics.field1726.setSize(Statics.field170, Statics.field1104);
        Statics.field1726.setVisible(true);
        if (Statics.field231 == var1) {
            Insets var3 = Statics.field231.getInsets();
            Statics.field1726.setLocation(field1777 + var3.left, field1784 + var3.top);
        } else {
            Statics.field1726.setLocation(field1777, field1784);
        }
        Statics.field1726.addFocusListener(this);
        Statics.field1726.requestFocus();
        field1781 = true;
        class221 var4 = class221.method2128(Statics.field170, Statics.field1104, Statics.field1726);
        if (Statics.field744 != null) {
            Statics.field744.method3777(var4.field3173.getGraphics(), 0, 0);
        }
        Statics.field744 = var4;
        field1769 = false;
        field1770 = class163.method3594();
    }

    @ObfuscatedName("dp.rp(I)Z")
    public final boolean method2001() {
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
                this.method2042("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1673 != null) {
                String var1 = Statics.field1673.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1668;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2042("wrongjava");
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
                            label211: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label211;
                                    }
                                    if (var12 == '+') {
                                        break label211;
                                    }
                                }
                                int var22;
                                if (var12 >= '0' && var12 <= '9') {
                                    var22 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var22 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var22 = var12 - 'W';
                                }
                                if (var22 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var22 = -var22;
                                }
                                int var14 = var9 * 10 + var22;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class208.method632(var6) < 10) {
                            this.method2042("wrongjava");
                            return;
                        }
                    }
                    field1775 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2000();
            this.method269();
            Statics.field1415 = class110.method3325();
            label110: while (true) {
                class104 var17;
                Canvas var18;
                do {
                    if (field1785 != 0L && class163.method3594() >= field1785) {
                        break label110;
                    }
                    Statics.field61 = Statics.field1415.method1841(field1774, field1775);
                    for (int var16 = 0; var16 < Statics.field61; var16++) {
                        this.method2003();
                    }
                    this.method1998();
                    var17 = Statics.field160;
                    var18 = Statics.field1726;
                } while (var17.field1671 == null);
                for (int var19 = 0; var19 < 50 && var17.field1671.peekEvent() != null; var19++) {
                    Statics.method13(1L);
                }
                if (var18 != null) {
                    var17.field1671.postEvent(new ActionEvent(var18, 1001, "dummy"));
                }
            }
        } catch (Exception var21) {
            class102.method755((String) null, var21);
            this.method2042("crash");
        }
        this.method2069();
    }

    @ObfuscatedName("dp.rr(B)V")
    public void method2003() {
        long var1 = class163.method3594();
        long var3 = field1780[Statics.field1649];
        field1780[Statics.field1649] = var1;
        Statics.field1649 = Statics.field1649 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1084 = field1786;
        }
        this.method294();
    }

    @ObfuscatedName("dp.rl(S)V")
    public void method1998() {
        Container var1 = this.method2007();
        long var2 = class163.method3594();
        long var4 = field1771[Statics.field883];
        field1771[Statics.field883] = var2;
        Statics.field883 = Statics.field883 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1776 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1782 - 1 > 50) {
            field1782 -= 50;
            field1781 = true;
            Statics.field1726.setSize(Statics.field170, Statics.field1104);
            Statics.field1726.setVisible(true);
            if (Statics.field231 == var1) {
                Insets var7 = Statics.field231.getInsets();
                Statics.field1726.setLocation(field1777 + var7.left, field1784 + var7.top);
            } else {
                Statics.field1726.setLocation(field1777, field1784);
            }
        }
        this.method355();
    }

    @ObfuscatedName("dp.rf(B)V")
    public final synchronized void method2069() {
        if (field1772) {
            return;
        }
        field1772 = true;
        try {
            Statics.field1726.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method272();
        } catch (Exception var7) {
        }
        if (Statics.field231 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field160 != null) {
            try {
                Statics.field160.method1888();
            } catch (Exception var5) {
            }
        }
        this.method542();
    }

    @ObfuscatedName("client.rs(I)V")
    public static final void method605() {
        Statics.field1415.method1840();
        for (int var0 = 0; var0 < 32; var0++) {
            field1771[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1780[var1] = 0L;
        }
        Statics.field61 = 0;
    }

    public void start() {
        if (field1779 == this && !field1772) {
            field1785 = 0L;
        }
    }

    public void stop() {
        if (field1779 == this && !field1772) {
            field1785 = class163.method3594() + 4000L;
        }
    }

    public void destroy() {
        if (field1779 == this && !field1772) {
            field1785 = class163.method3594();
            Statics.method13(5000L);
            this.method2069();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1779 != this || field1772) {
            return;
        }
        field1781 = true;
        if (Statics.field1668 != null && Statics.field1668.startsWith("1.5") && class163.method3594() - field1770 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field170 && var2.height >= Statics.field1104) {
                field1769 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1786 = true;
        field1781 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1786 = false;
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

    @ObfuscatedName("fu.rw(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method2745(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1726.getGraphics();
            if (Statics.field1548 == null) {
                Statics.field1548 = new Font("Helvetica", 1, 13);
                Statics.field1618 = Statics.field1726.getFontMetrics(Statics.field1548);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field170, Statics.field1104);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field72 == null) {
                    Statics.field72 = Statics.field1726.createImage(304, 34);
                }
                Graphics var5 = Statics.field72.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1548);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1618.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field72, Statics.field170 / 2 - 152, Statics.field1104 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field170 / 2 - 152;
                int var8 = Statics.field1104 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1548);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1618.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1726.repaint();
        }
    }

    @ObfuscatedName("dp.rx(Ljava/lang/String;B)V")
    public void method2042(String arg0) {
        if (this.field1773) {
            return;
        }
        this.field1773 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dp.rk(B)Ljava/awt/Container;")
    public Container method2007() {
        return Statics.field231 == null ? this : Statics.field231;
    }

    @ObfuscatedName("dp.ry(B)Ljava/awt/Dimension;")
    public Dimension method2011() {
        Container var1 = this.method2007();
        int var2 = Math.max(var1.getWidth(), Statics.field64);
        int var3 = Math.max(var1.getHeight(), Statics.field3198);
        if (Statics.field231 != null) {
            Insets var4 = Statics.field231.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("dp.c(S)V")
    public abstract void method269();

    @ObfuscatedName("dp.z(I)V")
    public abstract void method294();

    @ObfuscatedName("dp.l(I)V")
    public abstract void method272();

    @ObfuscatedName("dp.w(I)V")
    public abstract void method542();

    @ObfuscatedName("dp.q(B)V")
    public abstract void method355();
}
