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

@ObfuscatedName("du")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("du.pp")
    public static class114 field1765 = null;

    @ObfuscatedName("du.pk")
    public static int field1751 = 0;

    @ObfuscatedName("du.pb")
    public static long field1752 = 0L;

    @ObfuscatedName("du.qn")
    public static boolean field1753 = false;

    @ObfuscatedName("du.qa")
    public static int field1755 = 20;

    @ObfuscatedName("du.qc")
    public static int field1750 = 1;

    @ObfuscatedName("du.qi")
    public static int field1757 = 0;

    @ObfuscatedName("du.qq")
    public static long[] field1769 = new long[32];

    @ObfuscatedName("du.qy")
    public static long[] field1761 = new long[32];

    @ObfuscatedName("du.qf")
    public static int field1760 = 0;

    @ObfuscatedName("du.ql")
    public static int field1762 = 0;

    @ObfuscatedName("du.qm")
    public static volatile boolean field1763 = true;

    @ObfuscatedName("du.ry")
    public static int field1764 = 500;

    @ObfuscatedName("du.rd")
    public static boolean field1756 = false;

    @ObfuscatedName("du.rq")
    public static volatile boolean field1766 = false;

    @ObfuscatedName("du.rh")
    public static volatile long field1767 = 0L;

    @ObfuscatedName("du.rp")
    public static volatile boolean field1768 = true;

    @ObfuscatedName("du.qk")
    public boolean field1754 = false;

    @ObfuscatedName("du.pv(IIII)V")
    public final void method2025(int arg0, int arg1, int arg2) {
        try {
            if (field1765 != null) {
                field1751++;
                if (field1751 >= 3) {
                    this.method2035("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1765 = this;
            Statics.field1559 = arg0;
            Statics.field2788 = arg1;
            Statics.field2008 = arg2;
            Statics.field1642 = this;
            if (Statics.field2640 == null) {
                Statics.field2640 = new class104();
            }
            Statics.field2640.method1905(this, 1);
        } catch (Exception var5) {
            class102.method24((String) null, var5);
            this.method2035("crash");
        }
    }

    @ObfuscatedName("du.pe(B)V")
    public final synchronized void method2026() {
        Container var1 = this.method2036();
        if (Statics.field1995 != null) {
            Statics.field1995.removeFocusListener(this);
            var1.remove(Statics.field1995);
        }
        Statics.field1559 = Math.max(var1.getWidth(), Statics.field896);
        Statics.field2788 = Math.max(var1.getHeight(), Statics.field891);
        if (Statics.field597 != null) {
            Insets var2 = Statics.field597.getInsets();
            Statics.field1559 -= var2.right + var2.left;
            Statics.field2788 -= var2.top + var2.bottom;
        }
        Statics.field1995 = new class112(this);
        var1.add(Statics.field1995);
        Statics.field1995.setSize(Statics.field1559, Statics.field2788);
        Statics.field1995.setVisible(true);
        if (Statics.field597 == var1) {
            Insets var3 = Statics.field597.getInsets();
            Statics.field1995.setLocation(field1760 + var3.left, field1762 + var3.top);
        } else {
            Statics.field1995.setLocation(field1760, field1762);
        }
        Statics.field1995.addFocusListener(this);
        Statics.field1995.requestFocus();
        field1763 = true;
        int var4 = Statics.field1559;
        int var5 = Statics.field2788;
        Canvas var6 = Statics.field1995;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3799(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3799(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2010 != null) {
            Statics.field2010.method3798(var8.field3196.getGraphics(), 0, 0);
        }
        Statics.field2010 = var8;
        field1766 = false;
        field1767 = class156.method81();
    }

    @ObfuscatedName("du.pj(I)Z")
    public final boolean method2079() {
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
                this.method2035("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1660 != null) {
                String var1 = Statics.field1660.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1657;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2035("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method2605(var2.charAt(var3)); var3++) {
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
                            label186: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label186;
                                    }
                                    if (var10 == '+') {
                                        break label186;
                                    }
                                }
                                int var21;
                                if (var10 >= '0' && var10 <= '9') {
                                    var21 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var21 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var21 = var10 - 'W';
                                }
                                if (var21 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var21 = -var21;
                                }
                                int var12 = var7 * 10 + var21;
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
                            int var14 = class208.method3576(var4, 10, true);
                            if (var14 < 10) {
                                this.method2035("wrongjava");
                                return;
                            }
                        }
                    }
                    field1750 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2026();
            this.method407();
            Statics.field1759 = class110.method1864();
            label104: while (true) {
                class104 var16;
                Canvas var17;
                do {
                    if (field1752 != 0L && class156.method81() >= field1752) {
                        break label104;
                    }
                    Statics.field1357 = Statics.field1759.method1873(field1755, field1750);
                    for (int var15 = 0; var15 < Statics.field1357; var15++) {
                        this.method2097();
                    }
                    this.method2028();
                    var16 = Statics.field2640;
                    var17 = Statics.field1995;
                } while (var16.field1663 == null);
                for (int var18 = 0; var18 < 50 && var16.field1663.peekEvent() != null; var18++) {
                    class162.method2120(1L);
                }
                if (var17 != null) {
                    var16.field1663.postEvent(new ActionEvent(var17, 1001, "dummy"));
                }
            }
        } catch (Exception var20) {
            class102.method24((String) null, var20);
            this.method2035("crash");
        }
        this.method2034();
    }

    @ObfuscatedName("du.pp(B)V")
    public void method2097() {
        long var1 = class156.method81();
        long var3 = field1761[Statics.field1746];
        field1761[Statics.field1746] = var1;
        Statics.field1746 = Statics.field1746 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1469 = field1768;
        }
        this.method276();
    }

    @ObfuscatedName("du.pk(B)V")
    public void method2028() {
        Container var1 = this.method2036();
        long var2 = class156.method81();
        long var4 = field1769[Statics.field851];
        field1769[Statics.field851] = var2;
        Statics.field851 = Statics.field851 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1757 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1764 - 1 > 50) {
            field1764 -= 50;
            field1763 = true;
            Statics.field1995.setSize(Statics.field1559, Statics.field2788);
            Statics.field1995.setVisible(true);
            if (Statics.field597 == var1) {
                Insets var7 = Statics.field597.getInsets();
                Statics.field1995.setLocation(field1760 + var7.left, field1762 + var7.top);
            } else {
                Statics.field1995.setLocation(field1760, field1762);
            }
        }
        this.method277();
    }

    @ObfuscatedName("du.pb(I)V")
    public final synchronized void method2034() {
        if (field1753) {
            return;
        }
        field1753 = true;
        try {
            Statics.field1995.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method278();
        } catch (Exception var7) {
        }
        if (Statics.field597 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2640 != null) {
            try {
                Statics.field2640.method1900();
            } catch (Exception var5) {
            }
        }
        this.method513();
    }

    @ObfuscatedName("bj.qn(B)V")
    public static final void method1350() {
        Statics.field1759.method1871();
        for (int var0 = 0; var0 < 32; var0++) {
            field1769[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1761[var1] = 0L;
        }
        Statics.field1357 = 0;
    }

    public void start() {
        if (field1765 == this && !field1753) {
            field1752 = 0L;
        }
    }

    public void stop() {
        if (field1765 == this && !field1753) {
            field1752 = class156.method81() + 4000L;
        }
    }

    public void destroy() {
        if (field1765 == this && !field1753) {
            field1752 = class156.method81();
            class162.method2120(5000L);
            this.method2034();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1765 != this || field1753) {
            return;
        }
        field1763 = true;
        if (Statics.field1657 != null && Statics.field1657.startsWith("1.5") && class156.method81() - field1767 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1559 && var2.height >= Statics.field2788) {
                field1766 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1768 = true;
        field1763 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1768 = false;
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

    @ObfuscatedName("cx.qk(B)V")
    public static final void method1842() {
        Statics.field1840 = null;
        Statics.field80 = null;
        Statics.field2853 = null;
    }

    @ObfuscatedName("du.qd(Ljava/lang/String;B)V")
    public void method2035(String arg0) {
        if (this.field1754) {
            return;
        }
        this.field1754 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("du.qa(I)Ljava/awt/Container;")
    public Container method2036() {
        return Statics.field597 == null ? this : Statics.field597;
    }

    @ObfuscatedName("du.qc(I)Ljava/awt/Dimension;")
    public Dimension method2037() {
        Container var1 = this.method2036();
        int var2 = Math.max(var1.getWidth(), Statics.field896);
        int var3 = Math.max(var1.getHeight(), Statics.field891);
        if (Statics.field597 != null) {
            Insets var4 = Statics.field597.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("du.j(I)V")
    public abstract void method407();

    @ObfuscatedName("du.t(S)V")
    public abstract void method276();

    @ObfuscatedName("du.k(I)V")
    public abstract void method277();

    @ObfuscatedName("du.l(I)V")
    public abstract void method513();

    @ObfuscatedName("du.f(I)V")
    public abstract void method278();

    public abstract void init();
}
