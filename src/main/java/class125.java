import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class125 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Z")
    private boolean field2050 = false;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[[I")
    public static int[][] field2058 = new int[104][104];

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[Lqe;")
    public static class168[] field2052 = new class168[500];

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Z")
    public static boolean field2051 = false;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lqe;")
    public static class168 field2061 = class66.method448("welle:", 24);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lqe;")
    private static class168 field2055 = class66.method448("Select a world", -115);

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Lqe;")
    public static class168 field2070 = class66.method448("p11_full", -115);

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lqe;")
    public static class168 field2056 = field2055;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Luf;")
    public static class198 field2085;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Z")
    public static boolean field2094;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
    private final void method845(int arg0, boolean arg1) {
        field2080++;
        synchronized (this) {
            if (arg0 < 32) {
                return;
            }
            if (class242.field4144) {
                return;
            }
            class242.field4144 = true;
        }
        if (class205.field3559.field4088 != null) {
            class205.field3559.field4088.destroy();
        }
        try {
            this.method275(-42);
        } catch (Exception var11) {
        }
        if (class51.field686 != null) {
            try {
                class51.field686.removeFocusListener(this);
                class51.field686.getParent().remove(class51.field686);
            } catch (Exception var10) {
            }
        }
        if (class205.field3559 != null) {
            try {
                class205.field3559.method1555(27890);
            } catch (Exception var9) {
            }
        }
        this.method265(24);
        if (class58.field803 != null) {
            try {
                System.exit(0);
            } catch (Throwable var8) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ek", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2083++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ek", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2072++;
    }

    @OriginalMember(owner = "client!ek", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2064++;
        class99.field1570 = true;
        class198.field3420 = true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public abstract void method275(int arg0);

    @OriginalMember(owner = "client!ek", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2078++;
        if (class58.field803 == null) {
            return class205.field3559 == null || class205.field3559.field4088 == this ? super.getAppletContext() : class205.field3559.field4088.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILmj;)Lmj;")
    public static final class129 method846(int arg0, class129 arg1) {
        field2076++;
        class129 var2 = client.method271(arg1);
        if (arg0 == -58) {
            if (var2 == null) {
                var2 = arg1.field2273;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "run", descriptor = "()V")
    public final void run() {
        field2067++;
        try {
            if (class239.field4099 != null) {
                String var1 = class239.field4099.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class239.field4083;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method852(121, "wrongjava");
                        return;
                    }
                    class35.field435 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class239.field4083 == null || class239.field4083.equals("1.4.2"))) {
                    this.method852(-94, "wrongjava");
                    return;
                }
            }
            if (class205.field3559.field4088 != null) {
                Method var3 = class239.field4087;
                if (var3 != null) {
                    try {
                        var3.invoke(class205.field3559.field4088, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method849((byte) -85);
            class204.field3544 = class229.method1479(class42.field551, class51.field686, class223.field3837, (byte) 30);
            this.method274(-1);
            class90.field1399 = class99.method653(false);
            while (class119.field1953 == 0L || class59.method407(-54) < class119.field1953) {
                class129.field2135 = class90.field1399.method695(class182.field3241, 3867493, class35.field435);
                for (int var4 = 0; var4 < class129.field2135; var4++) {
                    this.method858((byte) 90);
                }
                this.method854((byte) -113);
                class229.method1477((byte) -54, class51.field686, class205.field3559);
            }
        } catch (Exception var7) {
            class112.method763(var7, null, 94);
            this.method852(-116, "crash");
        }
        this.method845(78, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V")
    public final void method847(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = -5 / ((59 - arg6) / 61);
        try {
            class46.field592 = this;
            class223.field3837 = arg3;
            class51.field703 = arg4;
            class42.field551 = arg5;
            class58.field803 = new Frame();
            class58.field803.setTitle("Jagex");
            class58.field803.setResizable(false);
            class58.field803.addWindowListener(this);
            class58.field803.setVisible(true);
            class58.field803.toFront();
            Insets var9 = class58.field803.getInsets();
            class58.field803.setSize(arg3 + var9.left + var9.right, var9.bottom + arg5 - -var9.top);
            class52.field711 = class205.field3559 = new class239(true, null, arg2, arg1, arg0);
            class205.field3559.method1553((byte) 77, 1, this);
        } catch (Exception var11) {
            class112.method763(var11, null, 122);
        }
        field2075++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLnh;Lqe;)I")
    public static final int method848(byte arg0, class112 arg1, class168 arg2) {
        field2068++;
        if (arg0 < 58) {
            method851(-35, 115, -53, (byte) 123, -127, -78, 10, -94, -107, -66);
        }
        int var3 = arg1.field1821;
        arg1.method776(arg2.field2870, 0);
        arg1.field1821 += class254.field4398.method1646(0, arg1.field1780, arg2.field2870, arg1.field1821, true, arg2.field2904);
        return arg1.field1821 - var3;
    }

    @OriginalMember(owner = "client!ek", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2079++;
    }

    @OriginalMember(owner = "client!ek", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2092++;
    }

    @OriginalMember(owner = "client!ek", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2087++;
        if (class58.field803 == null) {
            return class205.field3559 == null || class205.field3559.field4088 == this ? super.getCodeBase() : class205.field3559.field4088.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2090++;
    }

    @OriginalMember(owner = "client!ek", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2065++;
        if (class58.field803 == null) {
            return class205.field3559 == null || class205.field3559.field4088 == this ? super.getDocumentBase() : class205.field3559.field4088.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2088++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public final synchronized void method849(byte arg0) {
        if (class51.field686 != null) {
            class51.field686.removeFocusListener(this);
            class51.field686.getParent().remove(class51.field686);
        }
        if (class86.field1337 != null) {
            class86.field1337.getParent().remove(class86.field1337);
            class86.field1337 = null;
        }
        field2086++;
        Container var2;
        if (class240.field4110 != null) {
            var2 = class240.field4110;
        } else if (class58.field803 == null) {
            var2 = class205.field3559.field4088;
        } else {
            var2 = class58.field803;
        }
        var2.setLayout(null);
        if (class204.field3542 != 0) {
            class86.field1337 = new class96(this);
            var2.add(class86.field1337);
            class86.field1337.setSize(class223.field3837, class204.field3542);
            class86.field1337.setVisible(true);
            if (class58.field803 == var2) {
                Insets var3 = class58.field803.getInsets();
                class86.field1337.setLocation(var3.left, var3.top);
            } else {
                class86.field1337.setLocation(0, 0);
            }
        }
        class51.field686 = new class96(this);
        var2.add(class51.field686);
        class51.field686.setSize(class223.field3837, class42.field551);
        class51.field686.setVisible(true);
        if (class58.field803 == var2) {
            Insets var4 = class58.field803.getInsets();
            class51.field686.setLocation(var4.left, class204.field3542 + var4.top);
        } else {
            class51.field686.setLocation(0, class204.field3542);
        }
        int var5 = -4 / ((arg0 + 1) / 62);
        class51.field686.addFocusListener(this);
        class51.field686.requestFocus();
        class25.field294 = true;
        class99.field1570 = true;
        class198.field3420 = true;
        class61.field838 = false;
        class256.field4483 = class59.method407(-57);
    }

    @OriginalMember(owner = "client!ek", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
    public final boolean method850(int arg0) {
        field2063++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 <= 54) {
            return false;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method852(-68, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public abstract void method273(byte arg0);

    @OriginalMember(owner = "client!ek", name = "start", descriptor = "()V")
    public final void start() {
        field2059++;
        if (class46.field592 == this && !class242.field4144) {
            class119.field1953 = 0L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2091++;
        if (class58.field803 == null) {
            return class205.field3559 == null || class205.field3559.field4088 == this ? super.getParameter(arg0) : class205.field3559.field4088.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method851(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2074++;
        if (arg3 > -53) {
            field2058 = null;
        }
        if (arg5 == arg7 && arg2 == arg8 && arg4 == arg9 && arg0 == arg6) {
            class78.method525(arg0, arg1, 0, arg7, arg8, arg4);
            return;
        }
        int var10 = arg7;
        int var11 = arg8;
        int var12 = arg8 * 3;
        int var13 = arg2 * 3;
        int var14 = arg5 * 3;
        int var15 = arg7 * 3;
        int var16 = arg9 * 3;
        int var17 = arg6 * 3;
        int var18 = arg4 + var14 - arg7 - var16;
        int var19 = arg0 + var13 - var17 - arg8;
        int var20 = var15 + var16 - var14 - var14;
        int var21 = var12 + var17 - var13 - var13;
        int var22 = var14 - var15;
        int var23 = var13 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var20 * var25;
            int var27 = var21 * var25;
            int var28 = var24 * var25 >> 12;
            int var29 = var18 * var28;
            int var30 = var19 * var28;
            int var31 = var22 * var24;
            int var32 = arg7 + (var29 + var26 + var31 >> 12);
            int var33 = var23 * var24;
            int var34 = arg8 + (var27 + var30 + var33 >> 12);
            class78.method525(var34, arg1, 0, var10, var11, var32);
            var10 = var32;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ek", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2089++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method852(int arg0, String arg1) {
        int var3 = -64 / ((26 - arg0) / 57);
        field2082++;
        if (this.field2050) {
            return;
        }
        this.field2050 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ek", name = "stop", descriptor = "()V")
    public final void stop() {
        field2084++;
        if (class46.field592 == this && !class242.field4144) {
            class119.field1953 = class59.method407(-127) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
    public abstract void method267(byte arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public static final void method853(int arg0, int arg1, int arg2) {
        class92.field1441[arg0] = arg1;
        field2081++;
        if (arg2 != 31) {
            field2058 = null;
        }
        class245 var3 = (class245) class104.field1673.method1527((long) arg0, (byte) -96);
        if (var3 == null) {
            class245 var4 = new class245(class59.method407(arg2 ^ 0xFFFFFFD5) + 500L);
            class104.field1673.method1533((long) arg0, 112, var4);
        } else {
            var3.field4249 = class59.method407(-86) + 500L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    private final void method854(byte arg0) {
        field2073++;
        if (arg0 != -113) {
            this.windowClosed(null);
        }
        long var2 = class59.method407(arg0 ^ 0xE);
        long var4 = class84.field1281[class63.field857];
        class84.field1281[class63.field857] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class132.field2319 = ((var6 >> 1) + 32000) / var6;
        }
        class63.field857 = class63.field857 + 1 & 0x1F;
        if (class57.field793++ > 50) {
            class57.field793 -= 50;
            class198.field3420 = true;
            class51.field686.setSize(class223.field3837, class42.field551);
            class51.field686.setVisible(true);
            if (class58.field803 != null && class240.field4110 == null) {
                Insets var7 = class58.field803.getInsets();
                class51.field686.setLocation(var7.left, class204.field3542 + var7.top);
            } else {
                class51.field686.setLocation(0, class204.field3542);
            }
        }
        this.method273((byte) -38);
    }

    @OriginalMember(owner = "client!ek", name = "providesignlink", descriptor = "(Lgj;)V")
    public static final void providesignlink(class239 arg0) {
        class205.field3559 = arg0;
        class52.field711 = arg0;
        field2062++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public abstract void method274(int arg0);

    @OriginalMember(owner = "client!ek", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2069++;
        if (class46.field592 != this || class242.field4144) {
            return;
        }
        class198.field3420 = true;
        if (class239.field4083 != null && class239.field4083.startsWith("1.5") && class59.method407(-46) - class256.field4483 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class223.field3837 && var2.height >= class42.field551) {
                class61.field838 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method855(int arg0) {
        field2085 = null;
        field2070 = null;
        field2058 = null;
        field2056 = null;
        field2055 = null;
        field2052 = null;
        field2061 = null;
        if (arg0 <= 114) {
            field2070 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method856(int arg0, KeyEvent arg1) {
        field2071++;
        if (arg0 != 9546) {
            method856(26, null);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class99.field1570 = false;
        field2066++;
    }

    @OriginalMember(owner = "client!ek", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2077++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBI)V")
    public final void method857(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2054++;
        try {
            if (class46.field592 == null) {
                class51.field703 = arg1;
                class223.field3837 = arg4;
                class42.field551 = arg2;
                class46.field592 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class205.field3559 == null) {
                    class52.field711 = class205.field3559 = new class239(false, this, arg0, null, 0);
                }
                class205.field3559.method1553((byte) 124, 1, this);
                if (arg3 != 92) {
                    this.method850(-94);
                }
            } else {
                class170.field2959++;
                if (class170.field2959 >= 3) {
                    this.method852(arg3 + 15, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class112.method763(var8, null, arg3 + 31);
            this.method852(113, "crash");
        }
    }

    @OriginalMember(owner = "client!ek", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2093++;
        if (class46.field592 == this && !class242.field4144) {
            class119.field1953 = class59.method407(-103);
            class38.method259(5000L, 31644);
            class52.field711 = null;
            this.method845(107, false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    private final void method858(byte arg0) {
        field2053++;
        long var2 = class165.field2815[class171.field2977];
        long var4 = class59.method407(arg0 - 128);
        class165.field2815[class171.field2977] = var4;
        if (arg0 != 90) {
            this.windowDeactivated(null);
        }
        class171.field2977 = class171.field2977 + 1 & 0x1F;
        synchronized (this) {
            class25.field294 = class99.field1570;
        }
        this.method267((byte) -127);
        boolean var10000;
        if (var2 == 0L || var2 >= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
    }
}
