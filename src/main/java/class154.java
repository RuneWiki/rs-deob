import jagex3.jagmisc.jagmisc;
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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class154 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Z")
    private boolean field2282 = false;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Z")
    private boolean field2304 = false;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lag;")
    public static class192 field2286 = new class192(64);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lud;")
    public static class2 field2306 = new class2();

    @OriginalMember(owner = "client!v", name = "L", descriptor = "J")
    public static long field2307 = 0L;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lig;")
    public static class9 field2294;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Z")
    public static boolean field2308;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Z")
    public static boolean field2310;

    @OriginalMember(owner = "client!v", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2272++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public abstract void method1107(int arg0);

    @OriginalMember(owner = "client!v", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2302++;
    }

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class53.field845 = false;
        field2293++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
    public final boolean method1108(int arg0) {
        field2285++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 <= 68) {
            method1116(94, -82, -54, 9);
        }
        if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method1115("invalidhost", true);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1109(byte arg0) {
        field2294 = null;
        field2306 = null;
        if (arg0 < -127) {
            field2286 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method1110(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1111(int arg0, String arg1) {
        if (arg0 != 10) {
            method1109((byte) 115);
        }
        field2292++;
        System.out.println("Error: " + class153.method1103("%0a", arg1, "\n", -127));
    }

    @OriginalMember(owner = "client!v", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2299++;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public final synchronized void method1112(int arg0) {
        if (class105.field1651 != null) {
            class105.field1651.removeFocusListener(this);
            class105.field1651.getParent().remove(class105.field1651);
        }
        Container var2;
        if (class103.field1599 != null) {
            var2 = class103.field1599;
        } else if (class170.field2582 == null) {
            var2 = class123.field1863.field63;
        } else {
            var2 = class170.field2582;
        }
        field2298++;
        var2.setLayout((LayoutManager) null);
        class105.field1651 = new class191(this);
        var2.add(class105.field1651);
        class105.field1651.setSize(class179.field2816, class163.field2449);
        class105.field1651.setVisible(true);
        if (class170.field2582 == var2) {
            Insets var3 = class170.field2582.getInsets();
            class105.field1651.setLocation(class294.field4574 + var3.left, class26.field439 + var3.top);
        } else {
            class105.field1651.setLocation(class294.field4574, class26.field439);
        }
        class105.field1651.addFocusListener(this);
        class105.field1651.requestFocus();
        class53.field845 = true;
        int var4 = 88 % ((-arg0 - 18) / 32);
        class216.field3308 = true;
        class268.field4252 = true;
        class128.field1917 = false;
        class189.field2965 = class242.method1650(126);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public abstract void method1113(int arg0);

    @OriginalMember(owner = "client!v", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2277++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    private final void method1114(boolean arg0) {
        field2271++;
        long var2 = class242.method1650(95);
        long var4 = class254.field4060[class92.field1440];
        if (!arg0) {
            this.method1107(-39);
        }
        class254.field4060[class92.field1440] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class92.field1440 = class92.field1440 + 1 & 0x1F;
        synchronized (this) {
            class216.field3308 = class53.field845;
        }
        this.method1107(-26);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method1115(String arg0, boolean arg1) {
        field2274++;
        if (this.field2282) {
            return;
        }
        this.field2282 = true;
        System.out.println("error_game_" + arg0);
        try {
            class289.method1926(arg1, "loggedout", class123.field1863.field63);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3) {
        class22 var4 = class149.field2210[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class56 var5 = var4.field364;
        if (var5 != null) {
            var5.field892 = var5.field892 * arg3 / 16;
            var5.field882 = var5.field882 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!v", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2278++;
        this.destroy();
    }

    @OriginalMember(owner = "client!v", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2289++;
        if (class135.field2021 == this && !class95.field1523) {
            class89.field1394 = class242.method1650(49);
            class122.method922(5000L, (byte) -124);
            class39.field665 = null;
            this.method1120(false, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public abstract void method1117(int arg0);

    @OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
    public final void run() {
        field2303++;
        try {
            if (class4.field67 != null) {
                String var1 = class4.field67.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class4.field70;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1115("wrongjava", true);
                        return;
                    }
                    class297.field4785 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class4.field70 == null || class4.field70.equals("1.4.2"))) {
                    this.method1115("wrongjava", true);
                    return;
                }
            }
            if (class4.field70 != null && class4.field70.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class4.field70.length() > var4; var4++) {
                    char var5 = class4.field70.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class55.field874 = true;
                }
            }
            if (class123.field1863.field63 != null) {
                Method var6 = class4.field75;
                if (var6 != null) {
                    try {
                        var6.invoke(class123.field1863.field63, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class170.method1222(1);
            this.method1112(26);
            class143.field2140 = class70.method559(class179.field2816, class163.field2449, class105.field1651, -1);
            this.method1113(-25519);
            class110.field1705 = class85.method651((byte) 96);
            this.method1118(0);
            while (class89.field1394 == 0L || class242.method1650(53) < class89.field1394) {
                class191.field2993 = class110.field1705.method63(class149.field2207, class297.field4785, (byte) 88);
                for (int var7 = 0; var7 < class191.field2993; var7++) {
                    this.method1114(true);
                }
                this.method1122(0);
                class107.method811(class123.field1863, class105.field1651, -15021);
            }
        } catch (Exception var10) {
            class79.method624((String) null, var10, 0);
            this.method1115("crash", true);
        }
        this.method1120(false, true);
    }

    @OriginalMember(owner = "client!v", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2297++;
        if (class170.field2582 == null) {
            return class123.field1863 == null || class123.field1863.field63 == this ? super.getParameter(arg0) : class123.field1863.field63.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "stop", descriptor = "()V")
    public final void stop() {
        field2290++;
        if (class135.field2021 == this && !class95.field1523) {
            class89.field1394 = class242.method1650(60) + 4000L;
        }
    }

    @OriginalMember(owner = "client!v", name = "providesignlink", descriptor = "(Lvd;)V")
    public static final void providesignlink(class4 arg0) {
        field2276++;
        class123.field1863 = arg0;
        class39.field665 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2270++;
        class53.field845 = true;
        class268.field4252 = true;
    }

    @OriginalMember(owner = "client!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2281++;
        if (class135.field2021 != this || class95.field1523) {
            return;
        }
        class268.field4252 = true;
        if (class55.field874 && class242.method1650(25) - class189.field2965 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class305.field4898 && class15.field196 <= var2.height) {
                class128.field1917 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "start", descriptor = "()V")
    public final void start() {
        field2273++;
        if (class135.field2021 == this && !class95.field1523) {
            class89.field1394 = 0L;
        }
    }

    @OriginalMember(owner = "client!v", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2291++;
        if (class170.field2582 == null) {
            return class123.field1863 == null || class123.field1863.field63 == this ? super.getCodeBase() : class123.field1863.field63.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public final void method1118(int arg0) {
        field2280++;
        if (arg0 != 0 || this.field2304) {
            return;
        }
        try {
            class139 var2 = class123.field1863.method18(false, class135.field2021.getClass());
            while (var2.field2082 == 0) {
                class122.method922(100L, (byte) -126);
            }
            if (var2.field2080 != null) {
                throw (Throwable) var2.field2080;
            }
            jagmisc.init();
            this.field2304 = true;
            class110.field1705 = class85.method651((byte) -69);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public final void method1119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2279++;
        try {
            if (class135.field2021 == null) {
                class26.field439 = arg0;
                class163.field2449 = arg2;
                class15.field196 = arg2;
                class294.field4574 = 0;
                class135.field2021 = this;
                class179.field2816 = arg3;
                class305.field4898 = arg3;
                class49.field809 = arg1;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class123.field1863 == null) {
                    class39.field665 = class123.field1863 = new class4(this, arg4, (String) null, 0);
                }
                class139 var7 = class123.field1863.method25(false, this, 1);
                while (var7.field2082 == 0) {
                    class122.method922(10L, (byte) -107);
                }
            } else {
                class203.field3134++;
                if (class203.field3134 >= 3) {
                    this.method1115("alreadyloaded", true);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class79.method624((String) null, var9, arg0);
            this.method1115("crash", true);
        }
    }

    @OriginalMember(owner = "client!v", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2296++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZ)V")
    private final void method1120(boolean arg0, boolean arg1) {
        field2275++;
        synchronized (this) {
            if (class95.field1523) {
                return;
            }
            class95.field1523 = true;
        }
        if (arg0) {
            this.method1115((String) null, false);
        }
        if (class123.field1863.field63 != null) {
            class123.field1863.field63.destroy();
        }
        try {
            this.method1110(-121);
        } catch (Exception var10) {
        }
        if (this.field2304) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field2304 = false;
        }
        class123.field1863.method21((byte) 44, class135.field2021.getClass());
        if (class105.field1651 != null) {
            try {
                class105.field1651.removeFocusListener(this);
                class105.field1651.getParent().remove(class105.field1651);
            } catch (Exception var8) {
            }
        }
        if (class123.field1863 != null) {
            try {
                class123.field1863.method23(17);
            } catch (Exception var7) {
            }
        }
        this.method1123((byte) 95);
        if (class170.field2582 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2283++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;IIIZIII)V")
    public final void method1121(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        try {
            class49.field809 = arg6;
            class179.field2816 = arg2;
            class305.field4898 = arg2;
            class26.field439 = 0;
            class135.field2021 = this;
            class163.field2449 = arg1;
            class15.field196 = arg1;
            class294.field4574 = 0;
            class170.field2582 = new Frame();
            class170.field2582.setTitle("Jagex");
            class170.field2582.setResizable(true);
            class170.field2582.addWindowListener(this);
            class170.field2582.setVisible(true);
            class170.field2582.toFront();
            Insets var9 = class170.field2582.getInsets();
            class170.field2582.setSize(class305.field4898 + var9.right + var9.left, class15.field196 + var9.top + var9.bottom);
            class39.field665 = class123.field1863 = new class4((Applet) null, arg5, arg0, arg7);
            class139 var10 = class123.field1863.method25(false, this, arg3);
            while (var10.field2082 == 0) {
                class122.method922(10L, (byte) -122);
            }
        } catch (Exception var12) {
            class79.method624((String) null, var12, 0);
        }
        field2301++;
    }

    @OriginalMember(owner = "client!v", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2284++;
        if (class170.field2582 == null) {
            return class123.field1863 == null || class123.field1863.field63 == this ? super.getAppletContext() : class123.field1863.field63.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
    private final void method1122(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2287++;
        long var2 = class270.field4285[class253.field4039];
        long var4 = class242.method1650(34);
        class270.field4285[class253.field4039] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class202.field3124 = ((var6 >> 1) + 32000) / var6;
        }
        class253.field4039 = class253.field4039 + 1 & 0x1F;
        if ((class59.field941++) > 50) {
            class268.field4252 = true;
            class59.field941 -= 50;
            class105.field1651.setSize(class179.field2816, class163.field2449);
            class105.field1651.setVisible(true);
            if (class170.field2582 != null && class103.field1599 == null) {
                Insets var7 = class170.field2582.getInsets();
                class105.field1651.setLocation(class294.field4574 + var7.left, class26.field439 + var7.top);
            } else {
                class105.field1651.setLocation(class294.field4574, class26.field439);
            }
        }
        this.method1117(arg0 ^ 0x2CA8);
    }

    @OriginalMember(owner = "client!v", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!v", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2295++;
    }

    @OriginalMember(owner = "client!v", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2288++;
        if (class170.field2582 == null) {
            return class123.field1863 == null || class123.field1863.field63 == this ? super.getDocumentBase() : class123.field1863.field63.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public abstract void method1123(byte arg0);
}
