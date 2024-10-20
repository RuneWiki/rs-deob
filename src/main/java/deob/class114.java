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

@ObfuscatedName("dr")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dr.po")
    public static class114 field1767 = null;

    @ObfuscatedName("dr.pr")
    public static int field1766 = 0;

    @ObfuscatedName("dr.pn")
    public static long field1769 = 0L;

    @ObfuscatedName("dr.pt")
    public static boolean field1768 = false;

    @ObfuscatedName("dr.ps")
    public static int field1770 = 20;

    @ObfuscatedName("dr.qd")
    public static int field1771 = 1;

    @ObfuscatedName("dr.qv")
    public static int field1772 = 0;

    @ObfuscatedName("dr.qt")
    public static long[] field1781 = new long[32];

    @ObfuscatedName("dr.qu")
    public static long[] field1774 = new long[32];

    @ObfuscatedName("dr.qx")
    public static int field1775 = 0;

    @ObfuscatedName("dr.qh")
    public static int field1776 = 0;

    @ObfuscatedName("dr.qo")
    public static volatile boolean field1777 = true;

    @ObfuscatedName("dr.qp")
    public static int field1778 = 500;

    @ObfuscatedName("dr.ql")
    public static boolean field1779 = false;

    @ObfuscatedName("dr.qi")
    public static volatile boolean field1783 = false;

    @ObfuscatedName("dr.qy")
    public static volatile long field1780 = 0L;

    @ObfuscatedName("dr.rz")
    public static volatile boolean field1782 = true;

    @ObfuscatedName("dr.pg")
    public boolean field1784 = false;

    @ObfuscatedName("dr.rf(IIII)V")
    public final void method1959(int arg0, int arg1, int arg2) {
        try {
            if (field1767 != null) {
                field1766++;
                if (field1766 >= 3) {
                    this.method1969("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1767 = this;
            Statics.field124 = arg0;
            Statics.field2000 = arg1;
            Statics.field1660 = arg2;
            Statics.field1658 = this;
            if (Statics.field1094 == null) {
                Statics.field1094 = new class104();
            }
            Statics.field1094.method1831(this, 1);
        } catch (Exception var5) {
            class102.method706((String) null, var5);
            this.method1969("crash");
        }
    }

    @ObfuscatedName("dr.sk(B)V")
    public final synchronized void method1960() {
        Container var1 = this.method2018();
        if (Statics.field729 != null) {
            Statics.field729.removeFocusListener(this);
            var1.remove(Statics.field729);
        }
        Statics.field124 = Math.max(var1.getWidth(), Statics.field1756);
        Statics.field2000 = Math.max(var1.getHeight(), Statics.field1760);
        if (Statics.field1352 != null) {
            Insets var2 = Statics.field1352.getInsets();
            Statics.field124 -= var2.right + var2.left;
            Statics.field2000 -= var2.top + var2.bottom;
        }
        Statics.field729 = new class112(this);
        var1.add(Statics.field729);
        Statics.field729.setSize(Statics.field124, Statics.field2000);
        Statics.field729.setVisible(true);
        if (Statics.field1352 == var1) {
            Insets var3 = Statics.field1352.getInsets();
            Statics.field729.setLocation(field1775 + var3.left, field1776 + var3.top);
        } else {
            Statics.field729.setLocation(field1775, field1776);
        }
        Statics.field729.addFocusListener(this);
        Statics.field729.requestFocus();
        field1777 = true;
        int var4 = Statics.field124;
        int var5 = Statics.field2000;
        Canvas var6 = Statics.field729;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3738(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3738(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field144 != null) {
            Statics.field144.method3739(var8.field3177.getGraphics(), 0, 0);
        }
        Statics.field144 = var8;
        field1783 = false;
        field1780 = class163.method225();
    }

    @ObfuscatedName("dr.su(B)Z")
    public final boolean method2017() {
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
                this.method1969("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1688 != null) {
                String var1 = Statics.field1688.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field905;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1969("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method1956(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class208.method2953(var4) && class208.method3825(var4) < 10) {
                            this.method1969("wrongjava");
                            return;
                        }
                    }
                    field1771 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1960();
            this.method267();
            Statics.field1590 = class110.method1301();
            label77: while (true) {
                class104 var6;
                Canvas var7;
                do {
                    if (field1769 != 0L && class163.method225() >= field1769) {
                        break label77;
                    }
                    Statics.field959 = Statics.field1590.method1807(field1770, field1771);
                    for (int var5 = 0; var5 < Statics.field959; var5++) {
                        this.method1978();
                    }
                    this.method1963();
                    var6 = Statics.field1094;
                    var7 = Statics.field729;
                } while (var6.field1682 == null);
                for (int var8 = 0; var8 < 50 && var6.field1682.peekEvent() != null; var8++) {
                    class169.method3344(1L);
                }
                if (var7 != null) {
                    var6.field1682.postEvent(new ActionEvent(var7, 1001, "dummy"));
                }
            }
        } catch (Exception var10) {
            class102.method706((String) null, var10);
            this.method1969("crash");
        }
        this.method1976();
    }

    @ObfuscatedName("dr.sh(I)V")
    public void method1978() {
        long var1 = class163.method225();
        long var3 = field1774[Statics.field214];
        field1774[Statics.field214] = var1;
        Statics.field214 = Statics.field214 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1631 = field1782;
        }
        this.method327();
    }

    @ObfuscatedName("dr.sn(I)V")
    public void method1963() {
        Container var1 = this.method2018();
        long var2 = class163.method225();
        long var4 = field1781[Statics.field3006];
        field1781[Statics.field3006] = var2;
        Statics.field3006 = Statics.field3006 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1772 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1778 - 1 > 50) {
            field1778 -= 50;
            field1777 = true;
            Statics.field729.setSize(Statics.field124, Statics.field2000);
            Statics.field729.setVisible(true);
            if (Statics.field1352 == var1) {
                Insets var7 = Statics.field1352.getInsets();
                Statics.field729.setLocation(field1775 + var7.left, field1776 + var7.top);
            } else {
                Statics.field729.setLocation(field1775, field1776);
            }
        }
        this.method269();
    }

    @ObfuscatedName("dr.sg(S)V")
    public final synchronized void method1976() {
        if (field1768) {
            return;
        }
        field1768 = true;
        try {
            Statics.field729.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method546();
        } catch (Exception var7) {
        }
        if (Statics.field1352 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1094 != null) {
            try {
                Statics.field1094.method1838();
            } catch (Exception var5) {
            }
        }
        this.method265();
    }

    @ObfuscatedName("gx.so(I)V")
    public static final void method3241() {
        Statics.field1590.method1808();
        for (int var0 = 0; var0 < 32; var0++) {
            field1781[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1774[var1] = 0L;
        }
        Statics.field959 = 0;
    }

    public void start() {
        if (field1767 == this && !field1768) {
            field1769 = 0L;
        }
    }

    public void stop() {
        if (field1767 == this && !field1768) {
            field1769 = class163.method225() + 4000L;
        }
    }

    public void destroy() {
        if (field1767 == this && !field1768) {
            field1769 = class163.method225();
            class169.method3344(5000L);
            this.method1976();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1767 != this || field1768) {
            return;
        }
        field1777 = true;
        if (Statics.field905 != null && Statics.field905.startsWith("1.5") && class163.method225() - field1780 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field124 && var2.height >= Statics.field2000) {
                field1783 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1782 = true;
        field1777 = true;
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

    @ObfuscatedName("by.sf(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method1379(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field729.getGraphics();
            if (Statics.field971 == null) {
                Statics.field971 = new Font("Helvetica", 1, 13);
                Statics.field61 = Statics.field729.getFontMetrics(Statics.field971);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field124, Statics.field2000);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1754 == null) {
                    Statics.field1754 = Statics.field729.createImage(304, 34);
                }
                Graphics var5 = Statics.field1754.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field971);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field61.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1754, Statics.field124 / 2 - 152, Statics.field2000 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field124 / 2 - 152;
                int var8 = Statics.field2000 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field971);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field61.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field729.repaint();
        }
    }

    @ObfuscatedName("bf.sj(B)V")
    public static final void method1097() {
        Statics.field1754 = null;
        Statics.field971 = null;
        Statics.field61 = null;
    }

    @ObfuscatedName("dr.sa(Ljava/lang/String;I)V")
    public void method1969(String arg0) {
        if (this.field1784) {
            return;
        }
        this.field1784 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dr.sc(I)Ljava/awt/Container;")
    public Container method2018() {
        return Statics.field1352 == null ? this : Statics.field1352;
    }

    @ObfuscatedName("dr.si(B)Ljava/awt/Dimension;")
    public Dimension method1970() {
        Container var1 = this.method2018();
        int var2 = Math.max(var1.getWidth(), Statics.field1756);
        int var3 = Math.max(var1.getHeight(), Statics.field1760);
        if (Statics.field1352 != null) {
            Insets var4 = Statics.field1352.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("dr.i(I)V")
    public abstract void method327();

    @ObfuscatedName("dr.v(B)V")
    public abstract void method269();

    @ObfuscatedName("dr.a(I)V")
    public abstract void method546();

    @ObfuscatedName("dr.w(I)V")
    public abstract void method265();

    @ObfuscatedName("dr.g(I)V")
    public abstract void method267();
}
