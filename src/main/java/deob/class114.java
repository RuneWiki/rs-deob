package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("dx")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dx.pm")
    public static class114 field1792 = null;

    @ObfuscatedName("dx.qj")
    public static int field1777 = 0;

    @ObfuscatedName("dx.qi")
    public static long field1778 = 0L;

    @ObfuscatedName("dx.qb")
    public static boolean field1783 = false;

    @ObfuscatedName("dx.qs")
    public static int field1781 = 20;

    @ObfuscatedName("dx.qt")
    public static int field1782 = 1;

    @ObfuscatedName("dx.qq")
    public static int field1787 = 0;

    @ObfuscatedName("dx.qg")
    public static long[] field1784 = new long[32];

    @ObfuscatedName("dx.qk")
    public static long[] field1785 = new long[32];

    @ObfuscatedName("dx.ql")
    public static int field1786 = 0;

    @ObfuscatedName("dx.qd")
    public static int field1791 = 0;

    @ObfuscatedName("dx.rk")
    public static volatile boolean field1788 = true;

    @ObfuscatedName("dx.rc")
    public static int field1789 = 500;

    @ObfuscatedName("dx.rd")
    public static boolean field1790 = false;

    @ObfuscatedName("dx.ra")
    public static volatile boolean field1776 = false;

    @ObfuscatedName("dx.rp")
    public static volatile long field1794 = 0L;

    @ObfuscatedName("dx.rr")
    public static volatile boolean field1779 = true;

    @ObfuscatedName("dx.qa")
    public boolean field1780 = false;

    @ObfuscatedName("dx.qn(IIII)V")
    public final void method2019(int arg0, int arg1, int arg2) {
        try {
            if (field1792 != null) {
                field1777++;
                if (field1777 >= 3) {
                    this.method2027("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1792 = this;
            Statics.field1749 = arg0;
            Statics.field2019 = arg1;
            Statics.field1664 = arg2;
            Statics.field1667 = this;
            if (Statics.field1194 == null) {
                Statics.field1194 = new class104();
            }
            Statics.field1194.method1906(this, 1);
        } catch (Exception var5) {
            class102.method702((String) null, var5);
            this.method2027("crash");
        }
    }

    @ObfuscatedName("dx.qg(I)V")
    public final synchronized void method2020() {
        Container var1 = this.method2029();
        if (Statics.field1844 != null) {
            Statics.field1844.removeFocusListener(this);
            var1.remove(Statics.field1844);
        }
        Statics.field1749 = Math.max(var1.getWidth(), Statics.field2341);
        Statics.field2019 = Math.max(var1.getHeight(), Statics.field1732);
        if (Statics.field207 != null) {
            Insets var2 = Statics.field207.getInsets();
            Statics.field1749 -= var2.right + var2.left;
            Statics.field2019 -= var2.top + var2.bottom;
        }
        Statics.field1844 = new class112(this);
        var1.add(Statics.field1844);
        Statics.field1844.setSize(Statics.field1749, Statics.field2019);
        Statics.field1844.setVisible(true);
        if (Statics.field207 == var1) {
            Insets var3 = Statics.field207.getInsets();
            Statics.field1844.setLocation(field1786 + var3.left, field1791 + var3.top);
        } else {
            Statics.field1844.setLocation(field1786, field1791);
        }
        Statics.field1844.addFocusListener(this);
        Statics.field1844.requestFocus();
        field1788 = true;
        class221 var4 = Statics.method3334(Statics.field1749, Statics.field2019, Statics.field1844);
        if (Statics.field1580 != null) {
            Statics.field1580.method3765(var4.field3198.getGraphics(), 0, 0);
        }
        Statics.field1580 = var4;
        field1776 = false;
        field1794 = class156.method1888();
    }

    @ObfuscatedName("dx.qo(I)Z")
    public final boolean method2021() {
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
                this.method2027("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1679 != null) {
                String var1 = Statics.field1679.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1688;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2027("wrongjava");
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
                        if (class208.method2754(var6) && class208.method3386(var6) < 10) {
                            this.method2027("wrongjava");
                            return;
                        }
                    }
                    field1782 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2020();
            this.method284();
            Statics.field2130 = class110.method950();
            label83: while (true) {
                class104 var8;
                Canvas var9;
                do {
                    if (field1778 != 0L && class156.method1888() >= field1778) {
                        break label83;
                    }
                    Statics.field1227 = Statics.field2130.method1880(field1781, field1782);
                    for (int var7 = 0; var7 < Statics.field1227; var7++) {
                        this.method2047();
                    }
                    this.method2022();
                    var8 = Statics.field1194;
                    var9 = Statics.field1844;
                } while (var8.field1680 == null);
                for (int var10 = 0; var10 < 50 && var8.field1680.peekEvent() != null; var10++) {
                    class162.method2485(1L);
                }
                if (var9 != null) {
                    var8.field1680.postEvent(new ActionEvent(var9, 1001, "dummy"));
                }
            }
        } catch (Exception var12) {
            class102.method702((String) null, var12);
            this.method2027("crash");
        }
        this.method2036();
    }

    @ObfuscatedName("dx.qk(B)V")
    public void method2047() {
        long var1 = class156.method1888();
        long var3 = field1785[Statics.field59];
        field1785[Statics.field59] = var1;
        Statics.field59 = Statics.field59 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1662 = field1779;
        }
        this.method285();
    }

    @ObfuscatedName("dx.qh(I)V")
    public void method2022() {
        Container var1 = this.method2029();
        long var2 = class156.method1888();
        long var4 = field1784[Statics.field2115];
        field1784[Statics.field2115] = var2;
        Statics.field2115 = Statics.field2115 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1787 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1789 - 1 > 50) {
            field1789 -= 50;
            field1788 = true;
            Statics.field1844.setSize(Statics.field1749, Statics.field2019);
            Statics.field1844.setVisible(true);
            if (Statics.field207 == var1) {
                Insets var7 = Statics.field207.getInsets();
                Statics.field1844.setLocation(field1786 + var7.left, field1791 + var7.top);
            } else {
                Statics.field1844.setLocation(field1786, field1791);
            }
        }
        this.method475();
    }

    @ObfuscatedName("dx.qw(B)V")
    public final synchronized void method2036() {
        if (field1783) {
            return;
        }
        field1783 = true;
        try {
            Statics.field1844.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method287();
        } catch (Exception var7) {
        }
        if (Statics.field207 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1194 != null) {
            try {
                Statics.field1194.method1903();
            } catch (Exception var5) {
            }
        }
        this.method281();
    }

    @ObfuscatedName("ca.qu(B)V")
    public static final void method1929() {
        Statics.field2130.method1881();
        for (int var0 = 0; var0 < 32; var0++) {
            field1784[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1785[var1] = 0L;
        }
        Statics.field1227 = 0;
    }

    public void start() {
        if (field1792 == this && !field1783) {
            field1778 = 0L;
        }
    }

    public void stop() {
        if (field1792 == this && !field1783) {
            field1778 = class156.method1888() + 4000L;
        }
    }

    public void destroy() {
        if (field1792 == this && !field1783) {
            field1778 = class156.method1888();
            class162.method2485(5000L);
            this.method2036();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1792 != this || field1783) {
            return;
        }
        field1788 = true;
        if (Statics.field1688 != null && Statics.field1688.startsWith("1.5") && class156.method1888() - field1794 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1749 && var2.height >= Statics.field2019) {
                field1776 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1779 = true;
        field1788 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1779 = false;
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

    @ObfuscatedName("dx.ql(Ljava/lang/String;I)V")
    public void method2027(String arg0) {
        if (this.field1780) {
            return;
        }
        this.field1780 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dx.qd(I)Ljava/awt/Container;")
    public Container method2029() {
        return Statics.field207 == null ? this : Statics.field207;
    }

    @ObfuscatedName("dx.qy(I)Ljava/awt/Dimension;")
    public Dimension method2059() {
        Container var1 = this.method2029();
        int var2 = Math.max(var1.getWidth(), Statics.field2341);
        int var3 = Math.max(var1.getHeight(), Statics.field1732);
        if (Statics.field207 != null) {
            Insets var4 = Statics.field207.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("dx.y(B)V")
    public abstract void method285();

    @ObfuscatedName("dx.q(B)V")
    public abstract void method287();

    public abstract void init();

    @ObfuscatedName("dx.u(I)V")
    public abstract void method284();

    @ObfuscatedName("dx.e(B)V")
    public abstract void method475();

    @ObfuscatedName("dx.c(B)V")
    public abstract void method281();
}
