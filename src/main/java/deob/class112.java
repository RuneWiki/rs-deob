package deob;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("dz")
public abstract class class112 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("dz.l")
    public static class112 field1535 = null;

    @ObfuscatedName("dz.a")
    public static int field1552 = 0;

    @ObfuscatedName("dz.o")
    public static long field1537 = 0L;

    @ObfuscatedName("dz.c")
    public static boolean field1538 = false;

    @ObfuscatedName("dz.h")
    public boolean field1539 = false;

    @ObfuscatedName("dz.d")
    public static int field1549 = 20;

    @ObfuscatedName("dz.k")
    public static int field1545 = 1;

    @ObfuscatedName("dz.u")
    public static int field1542 = 0;

    @ObfuscatedName("dz.s")
    public static long[] field1536 = new long[32];

    @ObfuscatedName("dz.e")
    public static long[] field1546 = new long[32];

    @ObfuscatedName("dz.m")
    public static volatile boolean field1550 = true;

    @ObfuscatedName("dz.aa")
    public static int field1540 = 500;

    @ObfuscatedName("dz.af")
    public static volatile boolean field1543 = false;

    @ObfuscatedName("dz.ae")
    public static volatile long field1541 = 0L;

    @ObfuscatedName("dz.at")
    public static volatile boolean field1554 = true;

    @ObfuscatedName("dz.u(IIIB)V")
    public final void method1356(int arg0, int arg1, int arg2) {
        try {
            if (field1535 != null) {
                field1552++;
                if (field1552 >= 3) {
                    this.method1369("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1535 = this;
            Statics.field128 = arg0;
            Statics.field1145 = arg1;
            Statics.field2498 = arg2;
            Statics.field2496 = this;
            if (Statics.field1551 == null) {
                Statics.field1551 = new class35();
            }
            Statics.field1551.method426(this, 1);
        } catch (Exception var5) {
            Statics.method244((String) null, var5);
            this.method1369("crash");
        }
    }

    @ObfuscatedName("dz.v(I)V")
    public final synchronized void method1357() {
        Container var1;
        if (Statics.field727 == null) {
            var1 = this;
        } else {
            var1 = Statics.field727;
        }
        if (Statics.field558 != null) {
            Statics.field558.removeFocusListener(this);
            var1.remove(Statics.field558);
        }
        Statics.field558 = new class169(this);
        var1.add(Statics.field558);
        Statics.field558.setSize(Statics.field128, Statics.field1145);
        Statics.field558.setVisible(true);
        if (Statics.field727 == null) {
            Statics.field558.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field727.getInsets();
            Statics.field558.setLocation(var2.left, var2.top);
        }
        Statics.field558.addFocusListener(this);
        Statics.field558.requestFocus();
        field1550 = true;
        field1543 = false;
        field1541 = class64.method535();
    }

    @ObfuscatedName("dz.f(I)Z")
    public final boolean method1364() {
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
                this.method1369("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field387 != null) {
                String var1 = Statics.field387.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field379;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1369("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var23;
                                if (var12 >= '0' && var12 <= '9') {
                                    var23 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var23 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var23 = var12 - 'W';
                                }
                                if (var23 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var23 = -var23;
                                }
                                int var14 = var9 * 10 + var23;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class83.method1830(var6, 10, true);
                            if (var16 < 10) {
                                this.method1369("wrongjava");
                                return;
                            }
                        }
                    }
                    field1545 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1357();
            Statics.field1534 = class41.method907(Statics.field128, Statics.field1145, Statics.field558);
            this.method1366();
            class30 var17;
            try {
                var17 = new class117();
            } catch (Throwable var21) {
                var17 = new class116();
            }
            Statics.field1553 = var17;
            while (field1537 == 0L || class64.method535() < field1537) {
                Statics.field1519 = Statics.field1553.method353(field1549, field1545);
                for (int var19 = 0; var19 < Statics.field1519; var19++) {
                    this.method1374();
                }
                this.method1359();
                class31.method1177(Statics.field1551, Statics.field558);
            }
        } catch (Exception var22) {
            Statics.method244((String) null, var22);
            this.method1369("crash");
        }
        this.method1407();
    }

    @ObfuscatedName("dz.s(B)V")
    public void method1374() {
        long var1 = class64.method535();
        long var3 = field1546[Statics.field1547];
        field1546[Statics.field1547] = var1;
        Statics.field1547 = Statics.field1547 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1555 = field1554;
        }
        this.method1413();
    }

    @ObfuscatedName("dz.j(B)V")
    public void method1359() {
        long var1 = class64.method535();
        long var3 = field1536[Statics.field123];
        field1536[Statics.field123] = var1;
        Statics.field123 = Statics.field123 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1542 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1540 - 1 > 50) {
            field1540 -= 50;
            field1550 = true;
            Statics.field558.setSize(Statics.field128, Statics.field1145);
            Statics.field558.setVisible(true);
            if (Statics.field727 == null) {
                Statics.field558.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field727.getInsets();
                Statics.field558.setLocation(var6.left, var6.top);
            }
        }
        this.method1367();
    }

    @ObfuscatedName("dz.e(I)V")
    public final synchronized void method1407() {
        if (field1538) {
            return;
        }
        field1538 = true;
        try {
            Statics.field558.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method1368();
        } catch (Exception var7) {
        }
        if (Statics.field727 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1551 != null) {
            try {
                Statics.field1551.method405();
            } catch (Exception var5) {
            }
        }
        this.method1377();
    }

    @ObfuscatedName("bs.t(I)V")
    public static final void method847() {
        Statics.field1553.method352();
        for (int var0 = 0; var0 < 32; var0++) {
            field1536[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1546[var1] = 0L;
        }
        Statics.field1519 = 0;
    }

    public void start() {
        if (field1535 == this && !field1538) {
            field1537 = 0L;
        }
    }

    public void stop() {
        if (field1535 == this && !field1538) {
            field1537 = class64.method535() + 4000L;
        }
    }

    public void destroy() {
        if (field1535 == this && !field1538) {
            field1537 = class64.method535();
            class68.method86(5000L);
            this.method1407();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1535 != this || field1538) {
            return;
        }
        field1550 = true;
        if (Statics.field379 != null && Statics.field379.startsWith("1.5") && class64.method535() - field1541 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field128 && var2.height >= Statics.field1145) {
                field1543 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1554 = true;
        field1550 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1554 = false;
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

    @ObfuscatedName("al.p(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method688(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field558.getGraphics();
            if (Statics.field1548 == null) {
                Statics.field1548 = new Font("Helvetica", 1, 13);
                Statics.field863 = Statics.field558.getFontMetrics(Statics.field1548);
            }
            if (field1550) {
                field1550 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field128, Statics.field1145);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field294 == null) {
                    Statics.field294 = Statics.field558.createImage(304, 34);
                }
                Graphics var4 = Statics.field294.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1548);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field863.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field294, Statics.field128 / 2 - 152, Statics.field1145 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field128 / 2 - 152;
                int var7 = Statics.field1145 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1548);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field863.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field558.repaint();
        }
    }

    @ObfuscatedName("dz.z(Ljava/lang/String;I)V")
    public void method1369(String arg0) {
        if (this.field1539) {
            return;
        }
        this.field1539 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("dz.y(S)V")
    public abstract void method1366();

    @ObfuscatedName("dz.w(I)V")
    public abstract void method1367();

    @ObfuscatedName("dz.g(I)V")
    public abstract void method1368();

    @ObfuscatedName("dz.n(I)V")
    public abstract void method1377();

    @ObfuscatedName("dz.b(I)V")
    public abstract void method1413();
}
