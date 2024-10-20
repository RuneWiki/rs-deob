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

@ObfuscatedName("dn")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dn.pu")
    public static class114 field1758 = null;

    @ObfuscatedName("dn.pf")
    public static int field1757 = 0;

    @ObfuscatedName("dn.px")
    public static long field1768 = 0L;

    @ObfuscatedName("dn.pp")
    public static boolean field1765 = false;

    @ObfuscatedName("dn.ps")
    public static int field1761 = 20;

    @ObfuscatedName("dn.qj")
    public static int field1762 = 1;

    @ObfuscatedName("dn.qf")
    public static int field1764 = 0;

    @ObfuscatedName("dn.qh")
    public static long[] field1773 = new long[32];

    @ObfuscatedName("dn.qs")
    public static long[] field1756 = new long[32];

    @ObfuscatedName("dn.qc")
    public static int field1766 = 0;

    @ObfuscatedName("dn.qp")
    public static int field1767 = 0;

    @ObfuscatedName("dn.qq")
    public static volatile boolean field1769 = true;

    @ObfuscatedName("dn.qg")
    public static int field1770 = 500;

    @ObfuscatedName("dn.qn")
    public static boolean field1771 = false;

    @ObfuscatedName("dn.qd")
    public static volatile boolean field1772 = false;

    @ObfuscatedName("dn.qk")
    public static volatile long field1763 = 0L;

    @ObfuscatedName("dn.rq")
    public static volatile boolean field1774 = true;

    @ObfuscatedName("dn.pq")
    public boolean field1760 = false;

    @ObfuscatedName("dn.ru(IIIB)V")
    public final void method1956(int arg0, int arg1, int arg2) {
        try {
            if (field1758 != null) {
                field1757++;
                if (field1757 >= 3) {
                    this.method1948("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1758 = this;
            Statics.field2 = arg0;
            Statics.field1100 = arg1;
            Statics.field1531 = arg2;
            Statics.field1640 = this;
            if (Statics.field882 == null) {
                Statics.field882 = new class104();
            }
            Statics.field882.method1815(this, 1);
        } catch (Exception var5) {
            class102.method3043((String) null, var5);
            this.method1948("crash");
        }
    }

    @ObfuscatedName("dn.rj(B)V")
    public final synchronized void method1938() {
        Container var1 = this.method1949();
        if (Statics.field2146 != null) {
            Statics.field2146.removeFocusListener(this);
            var1.remove(Statics.field2146);
        }
        Statics.field2 = Math.max(var1.getWidth(), Statics.field1906);
        Statics.field1100 = Math.max(var1.getHeight(), Statics.field1741);
        if (Statics.field1616 != null) {
            Insets var2 = Statics.field1616.getInsets();
            Statics.field2 -= var2.right + var2.left;
            Statics.field1100 -= var2.top + var2.bottom;
        }
        Statics.field2146 = new class112(this);
        var1.add(Statics.field2146);
        Statics.field2146.setSize(Statics.field2, Statics.field1100);
        Statics.field2146.setVisible(true);
        if (Statics.field1616 == var1) {
            Insets var3 = Statics.field1616.getInsets();
            Statics.field2146.setLocation(field1766 + var3.left, field1767 + var3.top);
        } else {
            Statics.field2146.setLocation(field1766, field1767);
        }
        Statics.field2146.addFocusListener(this);
        Statics.field2146.requestFocus();
        field1769 = true;
        int var4 = Statics.field2;
        int var5 = Statics.field1100;
        Canvas var6 = Statics.field2146;
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
        if (Statics.field1759 != null) {
            Statics.field1759.method3745(var8.field3180.getGraphics(), 0, 0);
        }
        Statics.field1759 = var8;
        field1772 = false;
        field1763 = class156.method118();
    }

    @ObfuscatedName("dn.se(B)Z")
    public final boolean method1958() {
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
                this.method1948("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1662 != null) {
                String var1 = Statics.field1662.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1656;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1948("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method3205(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class208.method203(var4, 10, true);
                        if (var5 && class208.method184(var4) < 10) {
                            this.method1948("wrongjava");
                            return;
                        }
                    }
                    field1762 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1938();
            this.method246();
            class110 var6;
            try {
                var6 = new class99();
            } catch (Throwable var13) {
                var6 = new class100();
            }
            Statics.field80 = var6;
            label85: while (true) {
                class104 var9;
                Canvas var10;
                do {
                    if (field1768 != 0L && class156.method118() >= field1768) {
                        break label85;
                    }
                    Statics.field754 = Statics.field80.method1789(field1761, field1762);
                    for (int var8 = 0; var8 < Statics.field754; var8++) {
                        this.method1939();
                    }
                    this.method1940();
                    var9 = Statics.field882;
                    var10 = Statics.field2146;
                } while (var9.field1660 == null);
                for (int var11 = 0; var11 < 50 && var9.field1660.peekEvent() != null; var11++) {
                    class162.method1528(1L);
                }
                if (var10 != null) {
                    var9.field1660.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class102.method3043((String) null, var14);
            this.method1948("crash");
        }
        this.method1941();
    }

    @ObfuscatedName("dn.sz(S)V")
    public void method1939() {
        long var1 = class156.method118();
        long var3 = field1756[Statics.field144];
        field1756[Statics.field144] = var1;
        Statics.field144 = Statics.field144 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field220 = field1774;
        }
        this.method484();
    }

    @ObfuscatedName("dn.sc(B)V")
    public void method1940() {
        Container var1 = this.method1949();
        long var2 = class156.method118();
        long var4 = field1773[Statics.field2168];
        field1773[Statics.field2168] = var2;
        Statics.field2168 = Statics.field2168 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1764 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1770 - 1 > 50) {
            field1770 -= 50;
            field1769 = true;
            Statics.field2146.setSize(Statics.field2, Statics.field1100);
            Statics.field2146.setVisible(true);
            if (Statics.field1616 == var1) {
                Insets var7 = Statics.field1616.getInsets();
                Statics.field2146.setLocation(field1766 + var7.left, field1767 + var7.top);
            } else {
                Statics.field2146.setLocation(field1766, field1767);
            }
        }
        this.method248();
    }

    @ObfuscatedName("dn.sr(B)V")
    public final synchronized void method1941() {
        if (field1765) {
            return;
        }
        field1765 = true;
        try {
            Statics.field2146.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method271();
        } catch (Exception var7) {
        }
        if (Statics.field1616 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field882 != null) {
            try {
                Statics.field882.method1812();
            } catch (Exception var5) {
            }
        }
        this.method244();
    }

    public void start() {
        if (field1758 == this && !field1765) {
            field1768 = 0L;
        }
    }

    public void stop() {
        if (field1758 == this && !field1765) {
            field1768 = class156.method118() + 4000L;
        }
    }

    public void destroy() {
        if (field1758 == this && !field1765) {
            field1768 = class156.method118();
            class162.method1528(5000L);
            this.method1941();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1758 != this || field1765) {
            return;
        }
        field1769 = true;
        if (Statics.field1656 != null && Statics.field1656.startsWith("1.5") && class156.method118() - field1763 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2 && var2.height >= Statics.field1100) {
                field1772 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1774 = true;
        field1769 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1774 = false;
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

    @ObfuscatedName("cj.sj(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method1598(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field2146.getGraphics();
            if (Statics.field753 == null) {
                Statics.field753 = new Font("Helvetica", 1, 13);
                Statics.field1746 = Statics.field2146.getFontMetrics(Statics.field753);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2, Statics.field1100);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field2659 == null) {
                    Statics.field2659 = Statics.field2146.createImage(304, 34);
                }
                Graphics var5 = Statics.field2659.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field753);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field1746.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2659, Statics.field2 / 2 - 152, Statics.field1100 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field2 / 2 - 152;
                int var8 = Statics.field1100 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field753);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field1746.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field2146.repaint();
        }
    }

    @ObfuscatedName("dn.sg(Ljava/lang/String;I)V")
    public void method1948(String arg0) {
        if (this.field1760) {
            return;
        }
        this.field1760 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dn.sm(I)Ljava/awt/Container;")
    public Container method1949() {
        return Statics.field1616 == null ? this : Statics.field1616;
    }

    @ObfuscatedName("dn.sp(I)Ljava/awt/Dimension;")
    public Dimension method1950() {
        Container var1 = this.method1949();
        int var2 = Math.max(var1.getWidth(), Statics.field1906);
        int var3 = Math.max(var1.getHeight(), Statics.field1741);
        if (Statics.field1616 != null) {
            Insets var4 = Statics.field1616.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("dn.z(I)V")
    public abstract void method248();

    public abstract void init();

    @ObfuscatedName("dn.i(I)V")
    public abstract void method244();

    @ObfuscatedName("dn.c(B)V")
    public abstract void method246();

    @ObfuscatedName("dn.g(B)V")
    public abstract void method484();

    @ObfuscatedName("dn.t(B)V")
    public abstract void method271();
}
