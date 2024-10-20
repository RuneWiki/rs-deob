package deob;

import java.applet.Applet;
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

@ObfuscatedName("de")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("de.px")
    public static class114 field1776 = null;

    @ObfuscatedName("de.pm")
    public static int field1781 = 0;

    @ObfuscatedName("de.pp")
    public static long field1770 = 0L;

    @ObfuscatedName("de.qk")
    public static boolean field1771 = false;

    @ObfuscatedName("de.qf")
    public static int field1773 = 20;

    @ObfuscatedName("de.qi")
    public static int field1774 = 1;

    @ObfuscatedName("de.qe")
    public static int field1775 = 0;

    @ObfuscatedName("de.qv")
    public static long[] field1777 = new long[32];

    @ObfuscatedName("de.qy")
    public static long[] field1772 = new long[32];

    @ObfuscatedName("de.qw")
    public static int field1778 = 0;

    @ObfuscatedName("de.qc")
    public static int field1785 = 0;

    @ObfuscatedName("de.qm")
    public static volatile boolean field1784 = true;

    @ObfuscatedName("de.rc")
    public static int field1779 = 500;

    @ObfuscatedName("de.rb")
    public static boolean field1782 = false;

    @ObfuscatedName("de.rs")
    public static volatile boolean field1783 = false;

    @ObfuscatedName("de.ro")
    public static volatile long field1769 = 0L;

    @ObfuscatedName("de.rh")
    public static volatile boolean field1768 = true;

    @ObfuscatedName("de.qt")
    public boolean field1780 = false;

    @ObfuscatedName("de.rr(IIII)V")
    public final void method2049(int arg0, int arg1, int arg2) {
        try {
            if (field1776 != null) {
                field1781++;
                if (field1781 >= 3) {
                    this.method2048("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1776 = this;
            Statics.field759 = arg0;
            Statics.field951 = arg1;
            Statics.field1656 = arg2;
            Statics.field1658 = this;
            if (Statics.field776 == null) {
                Statics.field776 = new class104();
            }
            Statics.field776.method1930(this, 1);
        } catch (Exception var5) {
            class102.method811((String) null, var5);
            this.method2048("crash");
        }
    }

    @ObfuscatedName("de.rn(I)V")
    public final synchronized void method2050() {
        Container var1 = this.method2059();
        if (Statics.field1631 != null) {
            Statics.field1631.removeFocusListener(this);
            var1.remove(Statics.field1631);
        }
        Statics.field759 = Math.max(var1.getWidth(), Statics.field684);
        Statics.field951 = Math.max(var1.getHeight(), Statics.field1684);
        if (Statics.field40 != null) {
            Insets var2 = Statics.field40.getInsets();
            Statics.field759 -= var2.right + var2.left;
            Statics.field951 -= var2.top + var2.bottom;
        }
        Statics.field1631 = new class112(this);
        var1.add(Statics.field1631);
        Statics.field1631.setSize(Statics.field759, Statics.field951);
        Statics.field1631.setVisible(true);
        if (Statics.field40 == var1) {
            Insets var3 = Statics.field40.getInsets();
            Statics.field1631.setLocation(field1778 + var3.left, field1785 + var3.top);
        } else {
            Statics.field1631.setLocation(field1778, field1785);
        }
        Statics.field1631.addFocusListener(this);
        Statics.field1631.requestFocus();
        field1784 = true;
        class221 var4 = class221.method3365(Statics.field759, Statics.field951, Statics.field1631);
        if (Statics.field691 != null) {
            Statics.field691.method3802(var4.field3200.getGraphics(), 0, 0);
        }
        Statics.field691 = var4;
        field1783 = false;
        field1769 = class156.method12();
    }

    @ObfuscatedName("de.re(I)Z")
    public final boolean method2051() {
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
                this.method2048("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1686 != null) {
                String var1 = Statics.field1686.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1675;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2048("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method219(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class208.method1987(var4) && class208.method2592(var4) < 10) {
                            this.method2048("wrongjava");
                            return;
                        }
                    }
                    field1774 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2050();
            this.method395();
            class110 var5;
            try {
                var5 = new class99();
            } catch (Throwable var9) {
                var5 = new class100();
            }
            Statics.field2136 = var5;
            while (field1770 == 0L || class156.method12() < field1770) {
                Statics.field945 = Statics.field2136.method1900(field1773, field1774);
                for (int var7 = 0; var7 < Statics.field945; var7++) {
                    this.method2088();
                }
                this.method2053();
                class109.method930(Statics.field776, Statics.field1631);
            }
        } catch (Exception var10) {
            class102.method811((String) null, var10);
            this.method2048("crash");
        }
        this.method2117();
    }

    @ObfuscatedName("de.rx(B)V")
    public void method2088() {
        long var1 = class156.method12();
        long var3 = field1772[Statics.field6];
        field1772[Statics.field6] = var1;
        Statics.field6 = Statics.field6 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1109 = field1768;
        }
        this.method262();
    }

    @ObfuscatedName("de.rw(I)V")
    public void method2053() {
        Container var1 = this.method2059();
        long var2 = class156.method12();
        long var4 = field1777[Statics.field1110];
        field1777[Statics.field1110] = var2;
        Statics.field1110 = Statics.field1110 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1775 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1779 - 1 > 50) {
            field1779 -= 50;
            field1784 = true;
            Statics.field1631.setSize(Statics.field759, Statics.field951);
            Statics.field1631.setVisible(true);
            if (Statics.field40 == var1) {
                Insets var7 = Statics.field40.getInsets();
                Statics.field1631.setLocation(field1778 + var7.left, field1785 + var7.top);
            } else {
                Statics.field1631.setLocation(field1778, field1785);
            }
        }
        this.method263();
    }

    @ObfuscatedName("de.rj(I)V")
    public final synchronized void method2117() {
        if (field1771) {
            return;
        }
        field1771 = true;
        try {
            Statics.field1631.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method264();
        } catch (Exception var7) {
        }
        if (Statics.field40 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field776 != null) {
            try {
                Statics.field776.method1927();
            } catch (Exception var5) {
            }
        }
        this.method598();
    }

    public void start() {
        if (field1776 == this && !field1771) {
            field1770 = 0L;
        }
    }

    public void stop() {
        if (field1776 == this && !field1771) {
            field1770 = class156.method12() + 4000L;
        }
    }

    public void destroy() {
        if (field1776 == this && !field1771) {
            field1770 = class156.method12();
            class162.method2156(5000L);
            this.method2117();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1776 != this || field1771) {
            return;
        }
        field1784 = true;
        if (Statics.field1675 != null && Statics.field1675.startsWith("1.5") && class156.method12() - field1769 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field759 && var2.height >= Statics.field951) {
                field1783 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1768 = true;
        field1784 = true;
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

    @ObfuscatedName("an.rk(ILjava/lang/String;Ljava/awt/Color;ZB)V")
    public static final void method875(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field1631.getGraphics();
            if (Statics.field2850 == null) {
                Statics.field2850 = new Font("Helvetica", 1, 13);
                Statics.field157 = Statics.field1631.getFontMetrics(Statics.field2850);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field759, Statics.field951);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field66 == null) {
                    Statics.field66 = Statics.field1631.createImage(304, 34);
                }
                Graphics var5 = Statics.field66.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field2850);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field157.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field66, Statics.field759 / 2 - 152, Statics.field951 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field759 / 2 - 152;
                int var8 = Statics.field951 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2850);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field157.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field1631.repaint();
        }
    }

    @ObfuscatedName("de.rg(Ljava/lang/String;I)V")
    public void method2048(String arg0) {
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

    @ObfuscatedName("de.rq(B)Ljava/awt/Container;")
    public Container method2059() {
        return Statics.field40 == null ? this : Statics.field40;
    }

    @ObfuscatedName("de.ry(I)Ljava/awt/Dimension;")
    public Dimension method2057() {
        Container var1 = this.method2059();
        int var2 = Math.max(var1.getWidth(), Statics.field684);
        int var3 = Math.max(var1.getHeight(), Statics.field1684);
        if (Statics.field40 != null) {
            Insets var4 = Statics.field40.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("de.n(I)V")
    public abstract void method395();

    @ObfuscatedName("de.c(I)V")
    public abstract void method262();

    @ObfuscatedName("de.o(I)V")
    public abstract void method263();

    @ObfuscatedName("de.s(I)V")
    public abstract void method264();

    @ObfuscatedName("de.h(I)V")
    public abstract void method598();

    public abstract void init();
}
