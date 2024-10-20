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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("du")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("du.pr")
    public static class114 field1782 = null;

    @ObfuscatedName("du.px")
    public static int field1780 = 0;

    @ObfuscatedName("du.pa")
    public static long field1781 = 0L;

    @ObfuscatedName("du.pd")
    public static boolean field1791 = false;

    @ObfuscatedName("du.pg")
    public static int field1779 = 20;

    @ObfuscatedName("du.ql")
    public static int field1785 = 1;

    @ObfuscatedName("du.qv")
    public static int field1783 = 0;

    @ObfuscatedName("du.qa")
    public static long[] field1792 = new long[32];

    @ObfuscatedName("du.qr")
    public static long[] field1787 = new long[32];

    @ObfuscatedName("du.qq")
    public static int field1789 = 0;

    @ObfuscatedName("du.qe")
    public static int field1794 = 0;

    @ObfuscatedName("du.qd")
    public static volatile boolean field1798 = true;

    @ObfuscatedName("du.qy")
    public static int field1784 = 500;

    @ObfuscatedName("du.qs")
    public static boolean field1793 = false;

    @ObfuscatedName("du.qg")
    public static volatile boolean field1786 = false;

    @ObfuscatedName("du.qn")
    public static volatile long field1795 = 0L;

    @ObfuscatedName("du.rg")
    public static volatile boolean field1796 = true;

    @ObfuscatedName("du.pt")
    public boolean field1788 = false;

    @ObfuscatedName("du.qr(IIII)V")
    public final void method1928(int arg0, int arg1, int arg2) {
        try {
            if (field1782 != null) {
                field1780++;
                if (field1780 >= 3) {
                    this.method1940("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1782 = this;
            Statics.field1201 = arg0;
            Statics.field1585 = arg1;
            Statics.field1647 = arg2;
            Statics.field1654 = this;
            if (Statics.field1347 == null) {
                Statics.field1347 = new class104();
            }
            Statics.field1347.method1833(this, 1);
        } catch (Exception var5) {
            class102.method1762((String) null, var5);
            this.method1940("crash");
        }
    }

    @ObfuscatedName("du.qc(I)V")
    public final synchronized void method1929() {
        Container var1 = this.method1941();
        if (Statics.field782 != null) {
            Statics.field782.removeFocusListener(this);
            var1.remove(Statics.field782);
        }
        Statics.field1201 = Math.max(var1.getWidth(), Statics.field810);
        Statics.field1585 = Math.max(var1.getHeight(), Statics.field186);
        if (Statics.field1778 != null) {
            Insets var2 = Statics.field1778.getInsets();
            Statics.field1201 -= var2.right + var2.left;
            Statics.field1585 -= var2.top + var2.bottom;
        }
        Statics.field782 = new class112(this);
        var1.add(Statics.field782);
        Statics.field782.setSize(Statics.field1201, Statics.field1585);
        Statics.field782.setVisible(true);
        if (Statics.field1778 == var1) {
            Insets var3 = Statics.field1778.getInsets();
            Statics.field782.setLocation(field1789 + var3.left, field1794 + var3.top);
        } else {
            Statics.field782.setLocation(field1789, field1794);
        }
        Statics.field782.addFocusListener(this);
        Statics.field782.requestFocus();
        field1798 = true;
        int var4 = Statics.field1201;
        int var5 = Statics.field1585;
        Canvas var6 = Statics.field782;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3674(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3674(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1210 != null) {
            Statics.field1210.method3675(var8.field3181.getGraphics(), 0, 0);
        }
        Statics.field1210 = var8;
        field1786 = false;
        field1795 = class156.method2009();
    }

    @ObfuscatedName("du.qz(I)Z")
    public final boolean method1930() {
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
                this.method1940("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1679 != null) {
                String var1 = Statics.field1679.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1667;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1940("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method180(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class208.method1444(var4) && class208.method1327(var4) < 10) {
                            this.method1940("wrongjava");
                            return;
                        }
                    }
                    field1785 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1929();
            this.method342();
            Statics.field78 = class110.method871();
            while (field1781 == 0L || class156.method2009() < field1781) {
                Statics.field185 = Statics.field78.method1789(field1779, field1785);
                for (int var5 = 0; var5 < Statics.field185; var5++) {
                    this.method1935();
                }
                this.method1931();
                class109.method593(Statics.field1347, Statics.field782);
            }
        } catch (Exception var7) {
            class102.method1762((String) null, var7);
            this.method1940("crash");
        }
        this.method1954();
    }

    @ObfuscatedName("du.qk(I)V")
    public void method1935() {
        long var1 = class156.method2009();
        long var3 = field1787[Statics.field796];
        field1787[Statics.field796] = var1;
        Statics.field796 = Statics.field796 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field271 = field1796;
        }
        this.method244();
    }

    @ObfuscatedName("du.qq(S)V")
    public void method1931() {
        Container var1 = this.method1941();
        long var2 = class156.method2009();
        long var4 = field1792[Statics.field2109];
        field1792[Statics.field2109] = var2;
        Statics.field2109 = Statics.field2109 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1783 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1784 - 1 > 50) {
            field1784 -= 50;
            field1798 = true;
            Statics.field782.setSize(Statics.field1201, Statics.field1585);
            Statics.field782.setVisible(true);
            if (Statics.field1778 == var1) {
                Insets var7 = Statics.field1778.getInsets();
                Statics.field782.setLocation(field1789 + var7.left, field1794 + var7.top);
            } else {
                Statics.field782.setLocation(field1789, field1794);
            }
        }
        this.method245();
    }

    @ObfuscatedName("du.qe(B)V")
    public final synchronized void method1954() {
        if (field1791) {
            return;
        }
        field1791 = true;
        try {
            Statics.field782.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method243();
        } catch (Exception var7) {
        }
        if (Statics.field1778 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1347 != null) {
            try {
                Statics.field1347.method1810();
            } catch (Exception var5) {
            }
        }
        this.method306();
    }

    public void start() {
        if (field1782 == this && !field1791) {
            field1781 = 0L;
        }
    }

    public void stop() {
        if (field1782 == this && !field1791) {
            field1781 = class156.method2009() + 4000L;
        }
    }

    public void destroy() {
        if (field1782 == this && !field1791) {
            field1781 = class156.method2009();
            class162.method238(5000L);
            this.method1954();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1782 != this || field1791) {
            return;
        }
        field1798 = true;
        if (Statics.field1667 != null && Statics.field1667.startsWith("1.5") && class156.method2009() - field1795 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1201 && var2.height >= Statics.field1585) {
                field1786 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1796 = true;
        field1798 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1796 = false;
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

    @ObfuscatedName("cw.qx(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method1782(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field782.getGraphics();
            if (Statics.field104 == null) {
                Statics.field104 = new Font("Helvetica", 1, 13);
                Statics.field1556 = Statics.field782.getFontMetrics(Statics.field104);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1201, Statics.field1585);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1598 == null) {
                    Statics.field1598 = Statics.field782.createImage(304, 34);
                }
                Graphics var5 = Statics.field1598.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field104);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1556.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1598, Statics.field1201 / 2 - 152, Statics.field1585 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field1201 / 2 - 152;
                int var8 = Statics.field1585 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field104);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1556.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field782.repaint();
        }
    }

    @ObfuscatedName("u.qt(B)V")
    public static final void method92() {
        Statics.field1598 = null;
        Statics.field104 = null;
        Statics.field1556 = null;
    }

    @ObfuscatedName("du.qi(Ljava/lang/String;I)V")
    public void method1940(String arg0) {
        if (this.field1788) {
            return;
        }
        this.field1788 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("du.qf(I)Ljava/awt/Container;")
    public Container method1941() {
        return Statics.field1778 == null ? this : Statics.field1778;
    }

    @ObfuscatedName("du.qo(B)Ljava/awt/Dimension;")
    public Dimension method1942() {
        Container var1 = this.method1941();
        int var2 = Math.max(var1.getWidth(), Statics.field810);
        int var3 = Math.max(var1.getHeight(), Statics.field186);
        if (Statics.field1778 != null) {
            Insets var4 = Statics.field1778.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("du.c(I)V")
    public abstract void method342();

    @ObfuscatedName("du.u(I)V")
    public abstract void method244();

    @ObfuscatedName("du.z(I)V")
    public abstract void method243();

    @ObfuscatedName("du.b(I)V")
    public abstract void method306();

    @ObfuscatedName("du.k(I)V")
    public abstract void method245();
}
