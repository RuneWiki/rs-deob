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

@ObfuscatedName("dz")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dz.pb")
    public static class114 field1790 = null;

    @ObfuscatedName("dz.pc")
    public static int field1775 = 0;

    @ObfuscatedName("dz.pt")
    public static long field1772 = 0L;

    @ObfuscatedName("dz.pr")
    public static boolean field1773 = false;

    @ObfuscatedName("dz.pd")
    public static int field1791 = 20;

    @ObfuscatedName("dz.qx")
    public static int field1785 = 1;

    @ObfuscatedName("dz.qc")
    public static int field1789 = 0;

    @ObfuscatedName("dz.qu")
    public static long[] field1774 = new long[32];

    @ObfuscatedName("dz.qi")
    public static long[] field1779 = new long[32];

    @ObfuscatedName("dz.ql")
    public static int field1780 = 0;

    @ObfuscatedName("dz.qm")
    public static int field1781 = 0;

    @ObfuscatedName("dz.qp")
    public static volatile boolean field1782 = true;

    @ObfuscatedName("dz.qn")
    public static int field1783 = 500;

    @ObfuscatedName("dz.qz")
    public static boolean field1784 = false;

    @ObfuscatedName("dz.qy")
    public static volatile boolean field1788 = false;

    @ObfuscatedName("dz.qb")
    public static volatile long field1786 = 0L;

    @ObfuscatedName("dz.rx")
    public static volatile boolean field1787 = true;

    @ObfuscatedName("dz.py")
    public boolean field1778 = false;

    @ObfuscatedName("dz.qi(IIII)V")
    public final void method1952(int arg0, int arg1, int arg2) {
        try {
            if (field1790 != null) {
                field1775++;
                if (field1775 >= 3) {
                    this.method1961("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1790 = this;
            Statics.field578 = arg0;
            Statics.field2777 = arg1;
            Statics.field1655 = arg2;
            Statics.field1659 = this;
            if (Statics.field900 == null) {
                Statics.field900 = new class104();
            }
            Statics.field900.method1838(this, 1);
        } catch (Exception var5) {
            class102.method1103((String) null, var5);
            this.method1961("crash");
        }
    }

    @ObfuscatedName("dz.qv(B)V")
    public final synchronized void method1971() {
        Container var1 = this.method1960();
        if (Statics.field2118 != null) {
            Statics.field2118.removeFocusListener(this);
            var1.remove(Statics.field2118);
        }
        Statics.field578 = Math.max(var1.getWidth(), Statics.field1771);
        Statics.field2777 = Math.max(var1.getHeight(), Statics.field1638);
        if (Statics.field164 != null) {
            Insets var2 = Statics.field164.getInsets();
            Statics.field578 -= var2.right + var2.left;
            Statics.field2777 -= var2.top + var2.bottom;
        }
        Statics.field2118 = new class112(this);
        var1.add(Statics.field2118);
        Statics.field2118.setSize(Statics.field578, Statics.field2777);
        Statics.field2118.setVisible(true);
        if (Statics.field164 == var1) {
            Insets var3 = Statics.field164.getInsets();
            Statics.field2118.setLocation(field1780 + var3.left, field1781 + var3.top);
        } else {
            Statics.field2118.setLocation(field1780, field1781);
        }
        Statics.field2118.addFocusListener(this);
        Statics.field2118.requestFocus();
        field1782 = true;
        int var4 = Statics.field578;
        int var5 = Statics.field2777;
        Canvas var6 = Statics.field2118;
        class221 var8;
        try {
            class219 var7 = new class219();
            var7.method3718(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class224 var10 = new class224();
            var10.method3718(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1063 != null) {
            Statics.field1063.method3719(var8.field3180.getGraphics(), 0, 0);
        }
        Statics.field1063 = var8;
        field1788 = false;
        field1786 = class156.method1597();
    }

    @ObfuscatedName("dz.qk(I)Z")
    public final boolean method1954() {
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
                this.method1961("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1672 != null) {
                String var1 = Statics.field1672.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1679;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1961("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class208.method1453(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class208.method780(var4) && class208.method3559(var4) < 10) {
                            this.method1961("wrongjava");
                            return;
                        }
                    }
                    field1785 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1971();
            this.method410();
            Statics.field2128 = class110.method1872();
            label77: while (true) {
                class104 var6;
                Canvas var7;
                do {
                    if (field1772 != 0L && class156.method1597() >= field1772) {
                        break label77;
                    }
                    Statics.field741 = Statics.field2128.method1803(field1791, field1785);
                    for (int var5 = 0; var5 < Statics.field741; var5++) {
                        this.method1956();
                    }
                    this.method1957();
                    var6 = Statics.field900;
                    var7 = Statics.field2118;
                } while (var6.field1675 == null);
                for (int var8 = 0; var8 < 50 && var6.field1675.peekEvent() != null; var8++) {
                    class162.method1858(1L);
                }
                if (var7 != null) {
                    var6.field1675.postEvent(new ActionEvent(var7, 1001, "dummy"));
                }
            }
        } catch (Exception var10) {
            class102.method1103((String) null, var10);
            this.method1961("crash");
        }
        this.method1958();
    }

    @ObfuscatedName("dz.qj(B)V")
    public void method1956() {
        long var1 = class156.method1597();
        long var3 = field1779[Statics.field62];
        field1779[Statics.field62] = var1;
        Statics.field62 = Statics.field62 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2669 = field1787;
        }
        this.method257();
    }

    @ObfuscatedName("dz.ql(B)V")
    public void method1957() {
        Container var1 = this.method1960();
        long var2 = class156.method1597();
        long var4 = field1774[Statics.field713];
        field1774[Statics.field713] = var2;
        Statics.field713 = Statics.field713 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field1789 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field1783 - 1 > 50) {
            field1783 -= 50;
            field1782 = true;
            Statics.field2118.setSize(Statics.field578, Statics.field2777);
            Statics.field2118.setVisible(true);
            if (Statics.field164 == var1) {
                Insets var7 = Statics.field164.getInsets();
                Statics.field2118.setLocation(field1780 + var7.left, field1781 + var7.top);
            } else {
                Statics.field2118.setLocation(field1780, field1781);
            }
        }
        this.method258();
    }

    @ObfuscatedName("dz.qm(B)V")
    public final synchronized void method1958() {
        if (field1773) {
            return;
        }
        field1773 = true;
        try {
            Statics.field2118.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method259();
        } catch (Exception var7) {
        }
        if (Statics.field164 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field900 != null) {
            try {
                Statics.field900.method1818();
            } catch (Exception var5) {
            }
        }
        this.method254();
    }

    public void start() {
        if (field1790 == this && !field1773) {
            field1772 = 0L;
        }
    }

    public void stop() {
        if (field1790 == this && !field1773) {
            field1772 = class156.method1597() + 4000L;
        }
    }

    public void destroy() {
        if (field1790 == this && !field1773) {
            field1772 = class156.method1597();
            class162.method1858(5000L);
            this.method1958();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1790 != this || field1773) {
            return;
        }
        field1782 = true;
        if (Statics.field1679 != null && Statics.field1679.startsWith("1.5") && class156.method1597() - field1786 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field578 && var2.height >= Statics.field2777) {
                field1788 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1787 = true;
        field1782 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1787 = false;
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

    @ObfuscatedName("dz.qo(Ljava/lang/String;B)V")
    public void method1961(String arg0) {
        if (this.field1778) {
            return;
        }
        this.field1778 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dz.qe(B)Ljava/awt/Container;")
    public Container method1960() {
        return Statics.field164 == null ? this : Statics.field164;
    }

    @ObfuscatedName("dz.qt(I)Ljava/awt/Dimension;")
    public Dimension method1963() {
        Container var1 = this.method1960();
        int var2 = Math.max(var1.getWidth(), Statics.field1771);
        int var3 = Math.max(var1.getHeight(), Statics.field1638);
        if (Statics.field164 != null) {
            Insets var4 = Statics.field164.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("dz.s(I)V")
    public abstract void method258();

    public abstract void init();

    @ObfuscatedName("dz.k(I)V")
    public abstract void method410();

    @ObfuscatedName("dz.j(B)V")
    public abstract void method257();

    @ObfuscatedName("dz.o(B)V")
    public abstract void method259();

    @ObfuscatedName("dz.q(I)V")
    public abstract void method254();
}
