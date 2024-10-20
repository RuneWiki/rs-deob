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

@ObfuscatedName("dg")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dg.pe")
    public static class114 field1770 = null;

    @ObfuscatedName("dg.pb")
    public static int field1768 = 0;

    @ObfuscatedName("dg.qs")
    public static long field1767 = 0L;

    @ObfuscatedName("dg.qd")
    public static boolean field1775 = false;

    @ObfuscatedName("dg.qo")
    public static int field1772 = 20;

    @ObfuscatedName("dg.qi")
    public static int field1776 = 1;

    @ObfuscatedName("dg.qv")
    public static int field1774 = 0;

    @ObfuscatedName("dg.qu")
    public static long[] field1771 = new long[32];

    @ObfuscatedName("dg.qe")
    public static long[] field1784 = new long[32];

    @ObfuscatedName("dg.qz")
    public static int field1777 = 0;

    @ObfuscatedName("dg.qw")
    public static int field1778 = 0;

    @ObfuscatedName("dg.ql")
    public static volatile boolean field1779 = true;

    @ObfuscatedName("dg.rh")
    public static int field1780 = 500;

    @ObfuscatedName("dg.rn")
    public static boolean field1781 = false;

    @ObfuscatedName("dg.ri")
    public static volatile boolean field1769 = false;

    @ObfuscatedName("dg.re")
    public static volatile long field1783 = 0L;

    @ObfuscatedName("dg.rb")
    public static volatile boolean field1782 = true;

    @ObfuscatedName("dg.qp")
    public boolean field1773 = false;

    @ObfuscatedName("dg.ra(IIIB)V")
    public final void method2063(int arg0, int arg1, int arg2) {
        try {
            if (field1770 != null) {
                field1768++;
                if (field1768 >= 3) {
                    this.method2072("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1770 = this;
            Statics.field1757 = arg0;
            Statics.field1129 = arg1;
            Statics.field2139 = arg2;
            Statics.field1658 = this;
            if (Statics.field1794 == null) {
                Statics.field1794 = new class104();
            }
            Statics.field1794.method1954(this, 1);
        } catch (Exception var5) {
            class102.method1916((String) null, var5);
            this.method2072("crash");
        }
    }

    @ObfuscatedName("dg.rs(I)V")
    public final synchronized void method2064() {
        Container var1 = this.method2073();
        if (Statics.field1745 != null) {
            Statics.field1745.removeFocusListener(this);
            var1.remove(Statics.field1745);
        }
        Statics.field1757 = Math.max(var1.getWidth(), Statics.field1194);
        Statics.field1129 = Math.max(var1.getHeight(), Statics.field1699);
        if (Statics.field1836 != null) {
            Insets var2 = Statics.field1836.getInsets();
            Statics.field1757 -= var2.right + var2.left;
            Statics.field1129 -= var2.top + var2.bottom;
        }
        Statics.field1745 = new class112(this);
        var1.add(Statics.field1745);
        Statics.field1745.setSize(Statics.field1757, Statics.field1129);
        Statics.field1745.setVisible(true);
        if (Statics.field1836 == var1) {
            Insets var3 = Statics.field1836.getInsets();
            Statics.field1745.setLocation(field1777 + var3.left, field1778 + var3.top);
        } else {
            Statics.field1745.setLocation(field1777, field1778);
        }
        Statics.field1745.addFocusListener(this);
        Statics.field1745.requestFocus();
        field1779 = true;
        int var4 = Statics.field1757;
        int var5 = Statics.field1129;
        Canvas var6 = Statics.field1745;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3787(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3787(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1074 != null) {
            Statics.field1074.method3795(var8.field3198.getGraphics(), 0, 0);
        }
        Statics.field1074 = var8;
        field1769 = false;
        field1783 = class156.method1898();
    }

    @ObfuscatedName("dg.rv(B)Z")
    public final boolean method2070() {
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
                this.method2072("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1678 != null) {
                String var1 = Statics.field1678.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1689;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2072("wrongjava");
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
                        boolean var7 = class208.method3034(var6, 10, true);
                        if (var7 && class208.method1913(var6) < 10) {
                            this.method2072("wrongjava");
                            return;
                        }
                    }
                    field1776 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2064();
            this.method266();
            class110 var8;
            try {
                var8 = new class99();
            } catch (Throwable var15) {
                var8 = new class100();
            }
            Statics.field1577 = var8;
            label91: while (true) {
                class104 var11;
                Canvas var12;
                do {
                    if (field1767 != 0L && class156.method1898() >= field1767) {
                        break label91;
                    }
                    Statics.field149 = Statics.field1577.method1920(field1772, field1776);
                    for (int var10 = 0; var10 < Statics.field149; var10++) {
                        this.method2066();
                    }
                    this.method2078();
                    var11 = Statics.field1794;
                    var12 = Statics.field1745;
                } while (var11.field1680 == null);
                for (int var13 = 0; var13 < 50 && var11.field1680.peekEvent() != null; var13++) {
                    class162.method951(1L);
                }
                if (var12 != null) {
                    var11.field1680.postEvent(new ActionEvent(var12, 1001, "dummy"));
                }
            }
        } catch (Exception var16) {
            class102.method1916((String) null, var16);
            this.method2072("crash");
        }
        this.method2067();
    }

    @ObfuscatedName("dg.rw(B)V")
    public void method2066() {
        long var1 = class156.method1898();
        long var3 = field1784[Statics.field740];
        field1784[Statics.field740] = var1;
        Statics.field740 = Statics.field740 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field134 = field1782;
        }
        this.method335();
    }

    @ObfuscatedName("dg.rr(I)V")
    public void method2078() {
        Container var1 = this.method2073();
        long var2 = class156.method1898();
        long var4 = field1771[Statics.field1816];
        field1771[Statics.field1816] = var2;
        Statics.field1816 = Statics.field1816 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1774 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1780 - 1 > 50) {
            field1780 -= 50;
            field1779 = true;
            Statics.field1745.setSize(Statics.field1757, Statics.field1129);
            Statics.field1745.setVisible(true);
            if (Statics.field1836 == var1) {
                Insets var7 = Statics.field1836.getInsets();
                Statics.field1745.setLocation(field1777 + var7.left, field1778 + var7.top);
            } else {
                Statics.field1745.setLocation(field1777, field1778);
            }
        }
        this.method380();
    }

    @ObfuscatedName("dg.rl(I)V")
    public final synchronized void method2067() {
        if (field1775) {
            return;
        }
        field1775 = true;
        try {
            Statics.field1745.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method515();
        } catch (Exception var7) {
        }
        if (Statics.field1836 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1794 != null) {
            try {
                Statics.field1794.method1939();
            } catch (Exception var5) {
            }
        }
        this.method612();
    }

    @ObfuscatedName("dw.rd(B)V")
    public static final void method2237() {
        Statics.field1577.method1921();
        for (int var0 = 0; var0 < 32; var0++) {
            field1771[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1784[var1] = 0L;
        }
        Statics.field149 = 0;
    }

    public void start() {
        if (field1770 == this && !field1775) {
            field1767 = 0L;
        }
    }

    public void stop() {
        if (field1770 == this && !field1775) {
            field1767 = class156.method1898() + 4000L;
        }
    }

    public void destroy() {
        if (field1770 == this && !field1775) {
            field1767 = class156.method1898();
            class162.method951(5000L);
            this.method2067();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1770 != this || field1775) {
            return;
        }
        field1779 = true;
        if (Statics.field1689 != null && Statics.field1689.startsWith("1.5") && class156.method1898() - field1783 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1757 && var2.height >= Statics.field1129) {
                field1769 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1782 = true;
        field1779 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1782 = false;
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

    @ObfuscatedName("y.sz(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method48(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1745.getGraphics();
            if (Statics.field1215 == null) {
                Statics.field1215 = new Font("Helvetica", 1, 13);
                Statics.field664 = Statics.field1745.getFontMetrics(Statics.field1215);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1757, Statics.field1129);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1109 == null) {
                    Statics.field1109 = Statics.field1745.createImage(304, 34);
                }
                Graphics var5 = Statics.field1109.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1215);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field664.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1109, Statics.field1757 / 2 - 152, Statics.field1129 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1757 / 2 - 152;
                int var8 = Statics.field1129 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1215);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field664.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1745.repaint();
        }
    }

    @ObfuscatedName("av.sk(S)V")
    public static final void method861() {
        Statics.field1109 = null;
        Statics.field1215 = null;
        Statics.field664 = null;
    }

    @ObfuscatedName("dg.sm(Ljava/lang/String;I)V")
    public void method2072(String arg0) {
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

    @ObfuscatedName("dg.sj(I)Ljava/awt/Container;")
    public Container method2073() {
        return Statics.field1836 == null ? this : Statics.field1836;
    }

    @ObfuscatedName("dg.sl(B)Ljava/awt/Dimension;")
    public Dimension method2074() {
        Container var1 = this.method2073();
        int var2 = Math.max(var1.getWidth(), Statics.field1194);
        int var3 = Math.max(var1.getHeight(), Statics.field1699);
        if (Statics.field1836 != null) {
            Insets var4 = Statics.field1836.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("dg.f(I)V")
    public abstract void method515();

    public abstract void init();

    @ObfuscatedName("dg.j(I)V")
    public abstract void method266();

    @ObfuscatedName("dg.s(B)V")
    public abstract void method335();

    @ObfuscatedName("dg.k(I)V")
    public abstract void method380();

    @ObfuscatedName("dg.v(B)V")
    public abstract void method612();
}
