import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class85 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    private boolean field1798 = false;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    public static int[] field1801 = new int[32];

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lcd;")
    public static class23 field1830;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lcd;")
    private static class23 field1833;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lcd;")
    public static class23 field1834;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "Lcd;")
    private static class23 field1836;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lcd;")
    public static class23 field1832;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lkh;")
    public static class97 field1835;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "Z")
    public static boolean field1837;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final synchronized void method560(int arg0) {
        Container var2;
        if (class12.field286 == null) {
            var2 = class60.field1398.field2839;
        } else {
            var2 = class12.field286;
        }
        if (class27.field558 != null) {
            class27.field558.removeFocusListener(this);
            var2.remove(class27.field558);
        }
        class27.field558 = new class202(this);
        var2.add(class27.field558);
        class27.field558.setSize(class47.field1018, class68.field1595);
        class27.field558.setVisible(true);
        field1826++;
        if (class12.field286 == null) {
            class27.field558.setLocation(0, 0);
        } else {
            Insets var3 = class12.field286.getInsets();
            class27.field558.setLocation(var3.left, var3.top);
        }
        class27.field558.addFocusListener(this);
        class27.field558.requestFocus();
        if (arg0 == 32370) {
            class21.field433 = true;
            class132.field2734 = false;
            class4.field52 = class30.method224((byte) 95);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V")
    public final void method561(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1828++;
        try {
            if (class96.field2021 == null) {
                class47.field1018 = arg1;
                if (arg3 != 102) {
                    this.method567((byte) 114);
                }
                class68.field1595 = arg0;
                class49.field1181 = arg4;
                class96.field2021 = this;
                if (class60.field1398 == null) {
                    class12.field272 = class60.field1398 = new class137(false, this, arg2, null, 0);
                }
                class60.field1398.method870(this, 1, true);
            } else {
                class68.field1588++;
                if (class68.field1588 >= 3) {
                    this.method563("alreadyloaded", 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class186.method1145(null, var7, 46);
            this.method563("crash", 0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    private final void method562(byte arg0) {
        field1812++;
        long var2 = class30.method224((byte) 95);
        long var4 = class35.field716[class23.field517];
        if (arg0 > -65) {
            this.run();
        }
        class35.field716[class23.field517] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class102.field2176 = ((var6 >> 1) + 32000) / var6;
        }
        class23.field517 = class23.field517 + 1 & 0x1F;
        if (class100.field2115++ > 50) {
            class21.field433 = true;
            class100.field2115 -= 50;
            class27.field558.setSize(class47.field1018, class68.field1595);
            class27.field558.setVisible(true);
            if (class12.field286 == null) {
                class27.field558.setLocation(0, 0);
            } else {
                Insets var7 = class12.field286.getInsets();
                class27.field558.setLocation(var7.left, var7.top);
            }
        }
        this.method210(-23140);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method563(String arg0, int arg1) {
        field1821++;
        if (this.field1798) {
            return;
        }
        this.field1798 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
        if (arg1 != 0) {
            field1834 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Ljf;")
    public static final class86 method564(int arg0, int arg1) {
        class86 var2 = (class86) class91.field1943.method995(121, (long) arg1);
        field1811++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field2548.method651(4, arg1, 1);
        if (arg0 <= 6) {
            method570(true);
        }
        class86 var4 = new class86();
        if (var3 != null) {
            var4.method577((byte) -46, new class189(var3), arg1);
        }
        var4.method575(false);
        class91.field1943.method990(var4, (long) arg1, -116);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class47.field1077 = false;
        field1820++;
    }

    @OriginalMember(owner = "client!je", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1802++;
        if (class12.field286 == null) {
            return class60.field1398 == null || class60.field1398.field2839 == this ? super.getDocumentBase() : class60.field1398.field2839.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1813++;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class47.field1077 = true;
        field1810++;
        class21.field433 = true;
    }

    @OriginalMember(owner = "client!je", name = "providesignlink", descriptor = "(Lpc;)V")
    public static final void providesignlink(class137 arg0) {
        class60.field1398 = arg0;
        class12.field272 = arg0;
        field1815++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public abstract void method210(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Lh;")
    public static final class63 method565(int arg0, byte arg1) {
        field1817++;
        class63 var2 = (class63) class36.field741.method995(-29, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1719.method651(4, arg0, 10);
        class63 var4 = new class63();
        var4.field1450 = arg0;
        if (var3 != null) {
            var4.method471(new class189(var3), (byte) 116);
        }
        var4.method470((byte) -13);
        if (var4.field1470 != -1) {
            var4.method472(0, method565(var4.field1470, (byte) 81), method565(var4.field1478, (byte) 71));
        }
        int var5 = 80 / ((16 - arg1) / 42);
        if (!class59.field1384 && var4.field1468) {
            var4.field1474 = false;
            var4.field1498 = null;
            var4.field1454 = 0;
            var4.field1483 = class122.field2522;
            var4.field1497 = null;
        }
        class36.field741.method990(var4, (long) arg0, -112);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public abstract void method208(boolean arg0);

    @OriginalMember(owner = "client!je", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1823++;
        if (class96.field2021 == this && !class69.field1616) {
            class49.field1176 = class30.method224((byte) 95);
            class53.method409(5000L, -25391);
            class12.field272 = null;
            this.method568((byte) 62);
        }
    }

    @OriginalMember(owner = "client!je", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1827++;
    }

    @OriginalMember(owner = "client!je", name = "stop", descriptor = "()V")
    public final void stop() {
        field1822++;
        if (class96.field2021 == this && !class69.field1616) {
            class49.field1176 = class30.method224((byte) 95) + 4000L;
        }
    }

    @OriginalMember(owner = "client!je", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1803++;
        if (class96.field2021 != this || class69.field1616) {
            return;
        }
        class21.field433 = true;
        if (class137.field2833 != null && class137.field2833.startsWith("1.5") && class30.method224((byte) 95) - class4.field52 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class47.field1018 <= var2.width && class68.field1595 <= var2.height) {
                class132.field2734 = true;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public abstract void method200(int arg0);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    private final void method566(boolean arg0) {
        field1806++;
        long var2 = class89.field1909[class16.field347];
        if (arg0) {
            return;
        }
        long var4 = class30.method224((byte) 95);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class89.field1909[class16.field347] = var4;
        class16.field347 = class16.field347 + 1 & 0x1F;
        synchronized (this) {
            class65.field1540 = class47.field1077;
        }
        this.method206((byte) 38);
    }

    @OriginalMember(owner = "client!je", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!je", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1800++;
    }

    @OriginalMember(owner = "client!je", name = "start", descriptor = "()V")
    public final void start() {
        field1824++;
        if (class96.field2021 == this && !class69.field1616) {
            class49.field1176 = 0L;
        }
    }

    @OriginalMember(owner = "client!je", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1814++;
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        field1816++;
        try {
            if (class137.field2827 != null) {
                String var1 = class137.field2827.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class137.field2833;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method563("wrongjava", 0);
                        return;
                    }
                    class156.field3115 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class137.field2833 == null || class137.field2833.equals("1.4.2"))) {
                    this.method563("wrongjava", 0);
                    return;
                }
            }
            if (class60.field1398.field2839 != null) {
                Method var3 = class137.field2838;
                if (var3 != null) {
                    try {
                        var3.invoke(class60.field1398.field2839, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method560(32370);
            class151.field3012 = class190.method1235(21, class27.field558, class47.field1018, class68.field1595);
            this.method207((byte) -119);
            class129.field2693 = class108.method705(-110);
            while (class49.field1176 == 0L || class49.field1176 > class30.method224((byte) 95)) {
                class48.field1152 = class129.field2693.method535(class194.field3837, 1000, class156.field3115);
                for (int var4 = 0; var4 < class48.field1152; var4++) {
                    this.method566(false);
                }
                this.method562((byte) -115);
                class63.method468(class27.field558, 124, class60.field1398);
            }
        } catch (Exception var7) {
            class186.method1145(null, var7, 46);
            this.method563("crash", 0);
        }
        this.method568((byte) 18);
    }

    @OriginalMember(owner = "client!je", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1804++;
    }

    @OriginalMember(owner = "client!je", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1818++;
        this.destroy();
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Z")
    public final boolean method567(byte arg0) {
        if (arg0 != -88) {
            return false;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1799++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method563("invalidhost", arg0 ^ 0xFFFFFFA8);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    private final synchronized void method568(byte arg0) {
        field1809++;
        int var2 = -51 % ((arg0 + 32) / 38);
        if (class69.field1616) {
            return;
        }
        class69.field1616 = true;
        try {
            class27.field558.removeFocusListener(this);
        } catch (Exception var6) {
        }
        try {
            this.method208(false);
        } catch (Exception var5) {
        }
        if (class12.field286 != null) {
            try {
                System.exit(0);
            } catch (Throwable var4) {
            }
        }
        if (class60.field1398 != null) {
            try {
                class60.field1398.method868((byte) -52);
            } catch (Exception var3) {
            }
        }
        this.method200(-17);
    }

    @OriginalMember(owner = "client!je", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1805++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
    public final void method569(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class49.field1181 = arg3;
            class96.field2021 = this;
            class68.field1595 = arg4;
            class47.field1018 = arg2;
            class12.field286 = new Frame();
            class12.field286.setTitle("Jagex");
            class12.field286.setResizable(false);
            class12.field286.addWindowListener(this);
            class12.field286.setVisible(true);
            class12.field286.toFront();
            Insets var8 = class12.field286.getInsets();
            class12.field286.setSize(arg2 + var8.left + var8.right, arg4 - -var8.bottom + var8.top);
            class12.field272 = class60.field1398 = new class137(arg0, null, arg6, arg1, arg5);
            class60.field1398.method870(this, 1, arg0);
        } catch (Exception var10) {
            class186.method1145(null, var10, 46);
        }
        field1825++;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
    public abstract void method207(byte arg0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V")
    public static void method570(boolean arg0) {
        field1801 = null;
        field1833 = null;
        field1832 = null;
        field1830 = null;
        if (!arg0) {
            field1830 = null;
        }
        field1834 = null;
        field1835 = null;
        field1836 = null;
    }

    @OriginalMember(owner = "client!je", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1797++;
    }

    @OriginalMember(owner = "client!je", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1819++;
        if (class12.field286 == null) {
            return class60.field1398 == null || class60.field1398.field2839 == this ? super.getCodeBase() : class60.field1398.field2839.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1829++;
        if (class12.field286 == null) {
            return class60.field1398 == null || class60.field1398.field2839 == this ? super.getParameter(arg0) : class60.field1398.field2839.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1807++;
        if (class12.field286 == null) {
            return class60.field1398 == null || class60.field1398.field2839 == this ? super.getAppletContext() : class60.field1398.field2839.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public abstract void method206(byte arg0);

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1801[var1] = var0 - 1;
            var0 += var0;
        }
        field1830 = class54.method414("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", -1);
        field1833 = class54.method414("Choose Option", -1);
        field1831 = 0;
        field1834 = field1833;
        field1836 = class54.method414("Too many connections from your address)3", -1);
        field1832 = field1836;
    }
}
