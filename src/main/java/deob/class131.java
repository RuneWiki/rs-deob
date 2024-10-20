package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
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

@ObfuscatedName("eg")
public abstract class class131 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eg.om")
    public static class131 field2035 = null;

    @ObfuscatedName("eg.ox")
    public static int field2025 = 0;

    @ObfuscatedName("eg.oz")
    public static long field2026 = 0L;

    @ObfuscatedName("eg.oo")
    public static boolean field2032 = false;

    @ObfuscatedName("eg.op")
    public static int field2029 = 20;

    @ObfuscatedName("eg.ok")
    public static int field2039 = 1;

    @ObfuscatedName("eg.of")
    public static int field2031 = 0;

    @ObfuscatedName("eg.pu")
    public static long[] field2024 = new long[32];

    @ObfuscatedName("eg.pb")
    public static long[] field2033 = new long[32];

    @ObfuscatedName("eg.ph")
    public static volatile boolean field2037 = true;

    @ObfuscatedName("eg.pc")
    public static int field2027 = 500;

    @ObfuscatedName("eg.ps")
    public static volatile boolean field2036 = false;

    @ObfuscatedName("eg.pe")
    public static volatile long field2034 = 0L;

    @ObfuscatedName("eg.py")
    public static volatile boolean field2038 = true;

    @ObfuscatedName("eg.oe")
    public boolean field2028 = false;

    @ObfuscatedName("eg.pf(IIII)V")
    public final void method2607(int arg0, int arg1, int arg2) {
        try {
            if (field2035 != null) {
                field2025++;
                if (field2025 >= 3) {
                    this.method2601("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2035 = this;
            Statics.field1984 = arg0;
            Statics.field1886 = arg1;
            Statics.field2052 = arg2;
            Statics.field1747 = this;
            if (Statics.field1932 == null) {
                Statics.field1932 = new class123();
            }
            Statics.field1932.method2458(this, 1);
        } catch (Exception var5) {
            Statics.method3084((String) null, var5);
            this.method2601("crash");
        }
    }

    @ObfuscatedName("eg.pl(I)V")
    public final synchronized void method2623() {
        Container var1;
        if (Statics.field648 == null) {
            var1 = this;
        } else {
            var1 = Statics.field648;
        }
        if (Statics.field131 != null) {
            Statics.field131.removeFocusListener(this);
            var1.remove(Statics.field131);
        }
        Statics.field131 = new class126(this);
        var1.add(Statics.field131);
        Statics.field131.setSize(Statics.field1984, Statics.field1886);
        Statics.field131.setVisible(true);
        if (Statics.field648 == null) {
            Statics.field131.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field648.getInsets();
            Statics.field131.setLocation(var2.left, var2.top);
        }
        Statics.field131.addFocusListener(this);
        Statics.field131.requestFocus();
        field2037 = true;
        field2036 = false;
        field2034 = class103.method1066();
    }

    @ObfuscatedName("eg.qt(I)Z")
    public final boolean method2573() {
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
                this.method2601("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1936 != null) {
                String var1 = Statics.field1936.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1923;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2601("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class200.method1856(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class200.method2356(var4)) {
                            int var5 = class200.method584(var4, 10, true);
                            if (var5 < 10) {
                                this.method2601("wrongjava");
                                return;
                            }
                        }
                    }
                    field2039 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2623();
            Statics.field1668 = class71.method1977(Statics.field1984, Statics.field1886, Statics.field131);
            this.method204();
            class120 var6;
            try {
                var6 = new class134();
            } catch (Throwable var13) {
                var6 = new class128();
            }
            Statics.field608 = var6;
            label85: while (true) {
                class123 var9;
                Canvas var10;
                do {
                    if (field2026 != 0L && class103.method1066() >= field2026) {
                        break label85;
                    }
                    Statics.field1971 = Statics.field608.method2426(field2029, field2039);
                    for (int var8 = 0; var8 < Statics.field1971; var8++) {
                        this.method2574();
                    }
                    this.method2575();
                    var9 = Statics.field1932;
                    var10 = Statics.field131;
                } while (var9.field1929 == null);
                for (int var11 = 0; var11 < 50 && var9.field1929.peekEvent() != null; var11++) {
                    class114.method25(1L);
                }
                if (var10 != null) {
                    var9.field1929.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            Statics.method3084((String) null, var14);
            this.method2601("crash");
        }
        this.method2602();
    }

    @ObfuscatedName("eg.qq(I)V")
    public void method2574() {
        long var1 = class103.method1066();
        long var3 = field2033[Statics.field2462];
        field2033[Statics.field2462] = var1;
        Statics.field2462 = Statics.field2462 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field16 = field2038;
        }
        this.method174();
    }

    @ObfuscatedName("eg.qc(B)V")
    public void method2575() {
        long var1 = class103.method1066();
        long var3 = field2024[Statics.field938];
        field2024[Statics.field938] = var1;
        Statics.field938 = Statics.field938 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2031 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2027 - 1 > 50) {
            field2027 -= 50;
            field2037 = true;
            Statics.field131.setSize(Statics.field1984, Statics.field1886);
            Statics.field131.setVisible(true);
            if (Statics.field648 == null) {
                Statics.field131.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field648.getInsets();
                Statics.field131.setLocation(var6.left, var6.top);
            }
        }
        this.method371();
    }

    @ObfuscatedName("eg.qj(I)V")
    public final synchronized void method2602() {
        if (field2032) {
            return;
        }
        field2032 = true;
        try {
            Statics.field131.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method396();
        } catch (Exception var7) {
        }
        if (Statics.field648 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1932 != null) {
            try {
                Statics.field1932.method2476();
            } catch (Exception var5) {
            }
        }
        this.method170();
    }

    @ObfuscatedName("s.qk(I)V")
    public static final void method511() {
        Statics.field608.method2425();
        for (int var0 = 0; var0 < 32; var0++) {
            field2024[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2033[var1] = 0L;
        }
        Statics.field1971 = 0;
    }

    public void start() {
        if (field2035 == this && !field2032) {
            field2026 = 0L;
        }
    }

    public void stop() {
        if (field2035 == this && !field2032) {
            field2026 = class103.method1066() + 4000L;
        }
    }

    public void destroy() {
        if (field2035 == this && !field2032) {
            field2026 = class103.method1066();
            class114.method25(5000L);
            this.method2602();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2035 != this || field2032) {
            return;
        }
        field2037 = true;
        if (Statics.field1923 != null && Statics.field1923.startsWith("1.5") && class103.method1066() - field2034 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1984 && var2.height >= Statics.field1886) {
                field2036 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2038 = true;
        field2037 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2038 = false;
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

    @ObfuscatedName("bw.qo(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1401(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field131.getGraphics();
            if (Statics.field1510 == null) {
                Statics.field1510 = new Font("Helvetica", 1, 13);
                Statics.field1798 = Statics.field131.getFontMetrics(Statics.field1510);
            }
            if (field2037) {
                field2037 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field1984, Statics.field1886);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1891 == null) {
                    Statics.field1891 = Statics.field131.createImage(304, 34);
                }
                Graphics var4 = Statics.field1891.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1510);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field1798.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1891, Statics.field1984 / 2 - 152, Statics.field1886 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field1984 / 2 - 152;
                int var7 = Statics.field1886 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field1510);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field1798.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field131.repaint();
        }
    }

    @ObfuscatedName("eg.qa(Ljava/lang/String;B)V")
    public void method2601(String arg0) {
        if (this.field2028) {
            return;
        }
        this.field2028 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eg.m(I)V")
    public abstract void method174();

    @ObfuscatedName("eg.a(B)V")
    public abstract void method371();

    public abstract void init();

    @ObfuscatedName("eg.q(S)V")
    public abstract void method204();

    @ObfuscatedName("eg.i(B)V")
    public abstract void method170();

    @ObfuscatedName("eg.w(B)V")
    public abstract void method396();
}
