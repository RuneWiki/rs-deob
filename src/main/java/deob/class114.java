package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("dc")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dc.pe")
    public static class114 field1772 = null;

    @ObfuscatedName("dc.pm")
    public static int field1777 = 0;

    @ObfuscatedName("dc.py")
    public static long field1766 = 0L;

    @ObfuscatedName("dc.pi")
    public static boolean field1767 = false;

    @ObfuscatedName("dc.pr")
    public static int field1771 = 20;

    @ObfuscatedName("dc.qd")
    public static int field1769 = 1;

    @ObfuscatedName("dc.qa")
    public static int field1765 = 0;

    @ObfuscatedName("dc.qe")
    public static long[] field1768 = new long[32];

    @ObfuscatedName("dc.qp")
    public static long[] field1773 = new long[32];

    @ObfuscatedName("dc.qk")
    public static int field1774 = 0;

    @ObfuscatedName("dc.qo")
    public static int field1775 = 0;

    @ObfuscatedName("dc.qf")
    public static volatile boolean field1776 = true;

    @ObfuscatedName("dc.qt")
    public static int field1770 = 500;

    @ObfuscatedName("dc.qv")
    public static boolean field1778 = false;

    @ObfuscatedName("dc.qx")
    public static volatile boolean field1779 = false;

    @ObfuscatedName("dc.qi")
    public static volatile long field1780 = 0L;

    @ObfuscatedName("dc.rn")
    public static volatile boolean field1781 = true;

    @ObfuscatedName("dc.ps")
    public boolean field1764 = false;

    @ObfuscatedName("dc.pi(IIII)V")
    public final void method1997(int arg0, int arg1, int arg2) {
        try {
            if (field1772 != null) {
                field1777++;
                if (field1777 >= 3) {
                    this.method1950("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1772 = this;
            Statics.field1224 = arg0;
            Statics.field1756 = arg1;
            Statics.field805 = arg2;
            Statics.field1720 = this;
            if (Statics.field856 == null) {
                Statics.field856 = new class104();
            }
            Statics.field856.method1820(this, 1);
        } catch (Exception var5) {
            class102.method1780((String) null, var5);
            this.method1950("crash");
        }
    }

    @ObfuscatedName("dc.ps(B)V")
    public final synchronized void method1953() {
        Container var1 = this.method1951();
        if (Statics.field1748 != null) {
            Statics.field1748.removeFocusListener(this);
            var1.remove(Statics.field1748);
        }
        Statics.field1224 = Math.max(var1.getWidth(), Statics.field1727);
        Statics.field1756 = Math.max(var1.getHeight(), Statics.field897);
        if (Statics.field2163 != null) {
            Insets var2 = Statics.field2163.getInsets();
            Statics.field1224 -= var2.right + var2.left;
            Statics.field1756 -= var2.top + var2.bottom;
        }
        Statics.field1748 = new class112(this);
        var1.add(Statics.field1748);
        Statics.field1748.setSize(Statics.field1224, Statics.field1756);
        Statics.field1748.setVisible(true);
        if (Statics.field2163 == var1) {
            Insets var3 = Statics.field2163.getInsets();
            Statics.field1748.setLocation(field1774 + var3.left, field1775 + var3.top);
        } else {
            Statics.field1748.setLocation(field1774, field1775);
        }
        Statics.field1748.addFocusListener(this);
        Statics.field1748.requestFocus();
        field1776 = true;
        int var4 = Statics.field1224;
        int var5 = Statics.field1756;
        Canvas var6 = Statics.field1748;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3664(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3664(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field935 != null) {
            Statics.field935.method3669(var8.field3179.getGraphics(), 0, 0);
        }
        Statics.field935 = var8;
        field1779 = false;
        field1780 = class156.method1307();
    }

    @ObfuscatedName("dc.pq(I)Z")
    public final boolean method1943() {
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
                this.method1950("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1666 != null) {
                String var1 = Statics.field1666.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1664;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1950("wrongjava");
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
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var19;
                                if (var12 >= '0' && var12 <= '9') {
                                    var19 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var19 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var19 = var12 - 'W';
                                }
                                if (var19 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var19 = -var19;
                                }
                                int var14 = var9 * 10 + var19;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class208.method2997(var6) < 10) {
                            this.method1950("wrongjava");
                            return;
                        }
                    }
                    field1769 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1953();
            this.method242();
            Statics.field52 = class110.method193();
            while (field1766 == 0L || class156.method1307() < field1766) {
                Statics.field858 = Statics.field52.method1797(field1771, field1769);
                for (int var16 = 0; var16 < Statics.field858; var16++) {
                    this.method1944();
                }
                this.method1945();
                class109.method1902(Statics.field856, Statics.field1748);
            }
        } catch (Exception var18) {
            class102.method1780((String) null, var18);
            this.method1950("crash");
        }
        this.method1946();
    }

    @ObfuscatedName("dc.pr(B)V")
    public void method1944() {
        long var1 = class156.method1307();
        long var3 = field1773[Statics.field1113];
        field1773[Statics.field1113] = var1;
        Statics.field1113 = Statics.field1113 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field84 = field1781;
        }
        this.method424();
    }

    @ObfuscatedName("dc.qd(I)V")
    public void method1945() {
        Container var1 = this.method1951();
        long var2 = class156.method1307();
        long var4 = field1768[Statics.field1730];
        field1768[Statics.field1730] = var2;
        Statics.field1730 = Statics.field1730 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1765 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1770 - 1 > 50) {
            field1770 -= 50;
            field1776 = true;
            Statics.field1748.setSize(Statics.field1224, Statics.field1756);
            Statics.field1748.setVisible(true);
            if (Statics.field2163 == var1) {
                Insets var7 = Statics.field2163.getInsets();
                Statics.field1748.setLocation(field1774 + var7.left, field1775 + var7.top);
            } else {
                Statics.field1748.setLocation(field1774, field1775);
            }
        }
        this.method244();
    }

    @ObfuscatedName("dc.qa(B)V")
    public final synchronized void method1946() {
        if (field1767) {
            return;
        }
        field1767 = true;
        try {
            Statics.field1748.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method245();
        } catch (Exception var7) {
        }
        if (Statics.field2163 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field856 != null) {
            try {
                Statics.field856.method1818();
            } catch (Exception var5) {
            }
        }
        this.method331();
    }

    @ObfuscatedName("ce.qu(S)V")
    public static final void method1815() {
        Statics.field52.method1796();
        for (int var0 = 0; var0 < 32; var0++) {
            field1768[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1773[var1] = 0L;
        }
        Statics.field858 = 0;
    }

    public void start() {
        if (field1772 == this && !field1767) {
            field1766 = 0L;
        }
    }

    public void stop() {
        if (field1772 == this && !field1767) {
            field1766 = class156.method1307() + 4000L;
        }
    }

    public void destroy() {
        if (field1772 == this && !field1767) {
            field1766 = class156.method1307();
            class162.method150(5000L);
            this.method1946();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1772 != this || field1767) {
            return;
        }
        field1776 = true;
        if (Statics.field1664 != null && Statics.field1664.startsWith("1.5") && class156.method1307() - field1780 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1224 && var2.height >= Statics.field1756) {
                field1779 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1781 = true;
        field1776 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1781 = false;
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

    @ObfuscatedName("dc.qb(Ljava/lang/String;I)V")
    public void method1950(String arg0) {
        if (this.field1764) {
            return;
        }
        this.field1764 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dc.qe(B)Ljava/awt/Container;")
    public Container method1951() {
        return Statics.field2163 == null ? this : Statics.field2163;
    }

    @ObfuscatedName("dc.qc(I)Ljava/awt/Dimension;")
    public Dimension method1952() {
        Container var1 = this.method1951();
        int var2 = Math.max(var1.getWidth(), Statics.field1727);
        int var3 = Math.max(var1.getHeight(), Statics.field897);
        if (Statics.field2163 != null) {
            Insets var4 = Statics.field2163.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("dc.q(B)V")
    public abstract void method242();

    @ObfuscatedName("dc.w(I)V")
    public abstract void method424();

    @ObfuscatedName("dc.h(I)V")
    public abstract void method245();

    @ObfuscatedName("dc.f(I)V")
    public abstract void method331();

    @ObfuscatedName("dc.v(B)V")
    public abstract void method244();
}
