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

    @ObfuscatedName("dn.pb")
    public static class114 field1775 = null;

    @ObfuscatedName("dn.qa")
    public static int field1763 = 0;

    @ObfuscatedName("dn.qg")
    public static long field1764 = 0L;

    @ObfuscatedName("dn.qx")
    public static boolean field1765 = false;

    @ObfuscatedName("dn.qz")
    public static int field1767 = 20;

    @ObfuscatedName("dn.qv")
    public static int field1768 = 1;

    @ObfuscatedName("dn.qe")
    public static int field1769 = 0;

    @ObfuscatedName("dn.qd")
    public static long[] field1770 = new long[32];

    @ObfuscatedName("dn.qr")
    public static long[] field1779 = new long[32];

    @ObfuscatedName("dn.qk")
    public static int field1762 = 0;

    @ObfuscatedName("dn.qb")
    public static int field1781 = 0;

    @ObfuscatedName("dn.rc")
    public static volatile boolean field1774 = true;

    @ObfuscatedName("dn.rt")
    public static int field1766 = 500;

    @ObfuscatedName("dn.ry")
    public static boolean field1776 = false;

    @ObfuscatedName("dn.rp")
    public static volatile boolean field1777 = false;

    @ObfuscatedName("dn.rg")
    public static volatile long field1778 = 0L;

    @ObfuscatedName("dn.rq")
    public static volatile boolean field1773 = true;

    @ObfuscatedName("dn.qt")
    public boolean field1771 = false;

    @ObfuscatedName("dn.sn(IIII)V")
    public final void method2041(int arg0, int arg1, int arg2) {
        try {
            if (field1775 != null) {
                field1763++;
                if (field1763 >= 3) {
                    this.method2048("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1775 = this;
            Statics.field22 = arg0;
            Statics.field217 = arg1;
            Statics.field1651 = arg2;
            Statics.field1646 = this;
            if (Statics.field580 == null) {
                Statics.field580 = new class104();
            }
            Statics.field580.method1923(this, 1);
        } catch (Exception var5) {
            class102.method1864((String) null, var5);
            this.method2048("crash");
        }
    }

    @ObfuscatedName("dn.si(B)V")
    public final synchronized void method2078() {
        Container var1 = this.method2077();
        if (Statics.field3 != null) {
            Statics.field3.removeFocusListener(this);
            var1.remove(Statics.field3);
        }
        Statics.field22 = Math.max(var1.getWidth(), Statics.field2667);
        Statics.field217 = Math.max(var1.getHeight(), Statics.field1584);
        if (Statics.field882 != null) {
            Insets var2 = Statics.field882.getInsets();
            Statics.field22 -= var2.right + var2.left;
            Statics.field217 -= var2.top + var2.bottom;
        }
        Statics.field3 = new class112(this);
        var1.add(Statics.field3);
        Statics.field3.setSize(Statics.field22, Statics.field217);
        Statics.field3.setVisible(true);
        if (Statics.field882 == var1) {
            Insets var3 = Statics.field882.getInsets();
            Statics.field3.setLocation(field1762 + var3.left, field1781 + var3.top);
        } else {
            Statics.field3.setLocation(field1762, field1781);
        }
        Statics.field3.addFocusListener(this);
        Statics.field3.requestFocus();
        field1774 = true;
        class221 var4 = class221.method224(Statics.field22, Statics.field217, Statics.field3);
        if (Statics.field232 != null) {
            Statics.field232.method3860(var4.field3192.getGraphics(), 0, 0);
        }
        Statics.field232 = var4;
        field1777 = false;
        field1778 = class156.method910();
    }

    @ObfuscatedName("dn.sm(I)Z")
    public final boolean method2042() {
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
            if (Statics.field1662 != null) {
                String var1 = Statics.field1662.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1661;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2048("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method1880(var2.charAt(var3)); var3++) {
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
                                int var20;
                                if (var10 >= '0' && var10 <= '9') {
                                    var20 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var20 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var20 = var10 - 'W';
                                }
                                if (var20 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var20 = -var20;
                                }
                                int var12 = var7 * 10 + var20;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class208.method3649(var4) < 10) {
                            this.method2048("wrongjava");
                            return;
                        }
                    }
                    field1768 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2078();
            this.method267();
            Statics.field771 = class110.method1857();
            label104: while (true) {
                class104 var15;
                Canvas var16;
                do {
                    if (field1764 != 0L && class156.method910() >= field1764) {
                        break label104;
                    }
                    Statics.field807 = Statics.field771.method1887(field1767, field1768);
                    for (int var14 = 0; var14 < Statics.field807; var14++) {
                        this.method2043();
                    }
                    this.method2084();
                    var15 = Statics.field580;
                    var16 = Statics.field3;
                } while (var15.field1667 == null);
                for (int var17 = 0; var17 < 50 && var15.field1667.peekEvent() != null; var17++) {
                    class162.method2157(1L);
                }
                if (var16 != null) {
                    var15.field1667.postEvent(new ActionEvent(var16, 1001, "dummy"));
                }
            }
        } catch (Exception var19) {
            class102.method1864((String) null, var19);
            this.method2048("crash");
        }
        this.method2047();
    }

    @ObfuscatedName("dn.sb(I)V")
    public void method2043() {
        long var1 = class156.method910();
        long var3 = field1779[Statics.field736];
        field1779[Statics.field736] = var1;
        Statics.field736 = Statics.field736 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1448 = field1773;
        }
        this.method268();
    }

    @ObfuscatedName("dn.sy(I)V")
    public void method2084() {
        Container var1 = this.method2077();
        long var2 = class156.method910();
        long var4 = field1770[Statics.field81];
        field1770[Statics.field81] = var2;
        Statics.field81 = Statics.field81 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1769 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1766 - 1 > 50) {
            field1766 -= 50;
            field1774 = true;
            Statics.field3.setSize(Statics.field22, Statics.field217);
            Statics.field3.setVisible(true);
            if (Statics.field882 == var1) {
                Insets var7 = Statics.field882.getInsets();
                Statics.field3.setLocation(field1762 + var7.left, field1781 + var7.top);
            } else {
                Statics.field3.setLocation(field1762, field1781);
            }
        }
        this.method389();
    }

    @ObfuscatedName("dn.sr(B)V")
    public final synchronized void method2047() {
        if (field1765) {
            return;
        }
        field1765 = true;
        try {
            Statics.field3.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method270();
        } catch (Exception var7) {
        }
        if (Statics.field882 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field580 != null) {
            try {
                Statics.field580.method1921();
            } catch (Exception var5) {
            }
        }
        this.method264();
    }

    @ObfuscatedName("az.sd(I)V")
    public static final void method942() {
        Statics.field771.method1886();
        for (int var0 = 0; var0 < 32; var0++) {
            field1770[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1779[var1] = 0L;
        }
        Statics.field807 = 0;
    }

    public void start() {
        if (field1775 == this && !field1765) {
            field1764 = 0L;
        }
    }

    public void stop() {
        if (field1775 == this && !field1765) {
            field1764 = class156.method910() + 4000L;
        }
    }

    public void destroy() {
        if (field1775 == this && !field1765) {
            field1764 = class156.method910();
            class162.method2157(5000L);
            this.method2047();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1775 != this || field1765) {
            return;
        }
        field1774 = true;
        if (Statics.field1661 != null && Statics.field1661.startsWith("1.5") && class156.method910() - field1778 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field22 && var2.height >= Statics.field217) {
                field1777 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1773 = true;
        field1774 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1773 = false;
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

    @ObfuscatedName("ao.st(ILjava/lang/String;Ljava/awt/Color;ZI)V")
    public static final void method957(int arg0, String arg1, Color arg2, boolean arg3) {
        try {
            Graphics var4 = Statics.field3.getGraphics();
            if (Statics.field1623 == null) {
                Statics.field1623 = new Font("Helvetica", 1, 13);
                Statics.field945 = Statics.field3.getFontMetrics(Statics.field1623);
            }
            if (arg3) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field22, Statics.field217);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field234 == null) {
                    Statics.field234 = Statics.field3.createImage(304, 34);
                }
                Graphics var5 = Statics.field234.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1623);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - Statics.field945.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field234, Statics.field22 / 2 - 152, Statics.field217 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = Statics.field22 / 2 - 152;
                int var8 = Statics.field217 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1623);
                var4.setColor(Color.white);
                var4.drawString(arg1, var7 + (304 - Statics.field945.stringWidth(arg1)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            Statics.field3.repaint();
        }
    }

    @ObfuscatedName("dn.sg(Ljava/lang/String;I)V")
    public void method2048(String arg0) {
        if (this.field1771) {
            return;
        }
        this.field1771 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dn.ss(B)Ljava/awt/Container;")
    public Container method2077() {
        return Statics.field882 == null ? this : Statics.field882;
    }

    @ObfuscatedName("dn.sj(I)Ljava/awt/Dimension;")
    public Dimension method2050() {
        Container var1 = this.method2077();
        int var2 = Math.max(var1.getWidth(), Statics.field2667);
        int var3 = Math.max(var1.getHeight(), Statics.field1584);
        if (Statics.field882 != null) {
            Insets var4 = Statics.field882.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("dn.x(I)V")
    public abstract void method267();

    @ObfuscatedName("dn.p(I)V")
    public abstract void method389();

    @ObfuscatedName("dn.s(I)V")
    public abstract void method270();

    @ObfuscatedName("dn.t(I)V")
    public abstract void method264();

    @ObfuscatedName("dn.z(I)V")
    public abstract void method268();
}
