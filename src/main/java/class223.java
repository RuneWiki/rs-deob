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

@OriginalClass("client!jg")
public abstract class class223 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Z")
    private boolean field3125 = false;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Z")
    private boolean field3126 = false;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "[Z")
    public static boolean[] field3131;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "[I")
    public static int[] field3135;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "Lwo;")
    public static class522 field3129;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "Lfg;")
    public static class83 field3136;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "[I")
    public static int[] field3138;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "Lff;")
    public static class9 field3137;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Z")
    public static boolean field3145;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "Z")
    public static boolean field3146;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public abstract void method1187(byte arg0);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1308(int arg0, String arg1) {
        field3127++;
        if (this.field3126) {
            return;
        }
        this.field3126 = true;
        System.out.println("error_game_" + arg1);
        try {
            class484.method2855(class282.field3804.field5516, "loggedout", -29222);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg0 != 0) {
            this.start();
        }
    }

    @OriginalMember(owner = "client!jg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3132++;
    }

    @OriginalMember(owner = "client!jg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3124++;
    }

    @OriginalMember(owner = "client!jg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3100++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZIIII)V")
    public final void method1309(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3130++;
        try {
            if (class189.field2622 == null) {
                class238.field3270 = arg1;
                class189.field2622 = this;
                class200.field2856 = 0;
                class351.field4795 = arg4;
                class282.field3808 = arg4;
                class177.field2513 = arg2;
                class166.field2345 = arg2;
                if (!arg0) {
                    this.windowDeactivated(null);
                }
                class426.field6240 = 0;
                if (class282.field3804 == null) {
                    class124.field1691 = class282.field3804 = new class397(this, arg3, null, 0);
                }
                class409 var6 = class282.field3804.method2296(1, this, (byte) 32);
                while (var6.field5652 == 0) {
                    class496.method2931((byte) 125, 10L);
                }
            } else {
                class189.field2621++;
                if (class189.field2621 >= 3) {
                    this.method1308(0, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class162.method1000((byte) -86, var8, null);
            this.method1308(0, "crash");
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method1310(int arg0) {
        field3111++;
        if (arg0 != -24489 || this.field3125) {
            return;
        }
        try {
            class409 var2 = class282.field3804.method2274(class189.field2622.getClass(), 0);
            while (var2.field5652 == 0) {
                class496.method2931((byte) 124, 100L);
            }
            if (var2.field5654 != null) {
                throw (Throwable) var2.field5654;
            }
            jagmisc.init();
            this.field3125 = true;
            class52.field700 = class368.method2133((byte) -121);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    private final void method1311(int arg0) {
        field3102++;
        long var2 = class333.method1850(arg0 - 3593);
        long var4 = class516.field7577[class140.field1989];
        class516.field7577[class140.field1989] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class140.field1989 = class140.field1989 + 1 & arg0;
        synchronized (this) {
            class483.field7099 = class479.field7004;
        }
        this.method1193(arg0 ^ 0xFFFFFF9A);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public abstract void method1206(int arg0);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public abstract void method1196(int arg0);

    @OriginalMember(owner = "client!jg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3121++;
        if (class189.field2622 != this || class109.field1487) {
            return;
        }
        class308.field4230 = true;
        if (class12.field143 && (class333.method1850(-3562) - class425.field6205) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class166.field2345 <= var2.width && var2.height >= class282.field3808) {
                class522.field7695 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3128++;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public abstract void method1193(int arg0);

    @OriginalMember(owner = "client!jg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3113++;
        if (class140.field1993 == null) {
            return class282.field3804 == null || class282.field3804.field5516 == this ? super.getAppletContext() : class282.field3804.field5516.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3115++;
        if (class189.field2622 == this && !class109.field1487) {
            class456.field6669 = class333.method1850(-3562);
            class496.method2931((byte) 126, 5000L);
            class124.field1691 = null;
            this.method1312(-112, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3122++;
        if (class140.field1993 == null) {
            return class282.field3804 == null || class282.field3804.field5516 == this ? super.getDocumentBase() : class282.field3804.field5516.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3114++;
        if (class140.field1993 == null) {
            return class282.field3804 == null || class282.field3804.field5516 == this ? super.getCodeBase() : class282.field3804.field5516.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "stop", descriptor = "()V")
    public final void stop() {
        field3103++;
        if (class189.field2622 == this && !class109.field1487) {
            class456.field6669 = class333.method1850(-3562) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public abstract void method1207(byte arg0);

    @OriginalMember(owner = "client!jg", name = "providesignlink", descriptor = "(Lkj;)V")
    public static final void providesignlink(class397 arg0) {
        field3134++;
        class282.field3804 = arg0;
        class124.field1691 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3109++;
        if (class140.field1993 == null) {
            return class282.field3804 == null || class282.field3804.field5516 == this ? super.getParameter(arg0) : class282.field3804.field5516.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
    private final void method1312(int arg0, boolean arg1) {
        field3119++;
        synchronized (this) {
            if (class109.field1487) {
                return;
            }
            class109.field1487 = true;
        }
        if (class282.field3804.field5516 != null) {
            class282.field3804.field5516.destroy();
        }
        try {
            this.method1196(97);
        } catch (Exception var11) {
        }
        if (this.field3125) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3125 = false;
        }
        if (arg0 > -105) {
            this.start();
        }
        class409 var4 = class282.field3804.method2278((byte) 28, class189.field2622.getClass());
        while (var4.field5652 == 0) {
            class496.method2931((byte) 122, 100L);
        }
        if (class474.field6924 != null) {
            try {
                class474.field6924.removeFocusListener(this);
                class474.field6924.getParent().remove(class474.field6924);
            } catch (Exception var9) {
            }
        }
        if (class282.field3804 != null) {
            try {
                class282.field3804.method2286((byte) -79);
            } catch (Exception var8) {
            }
        }
        this.method1207((byte) 100);
        if (class140.field1993 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!jg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3108++;
    }

    @OriginalMember(owner = "client!jg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3133++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZII)Lwq;")
    public static final class113 method1313(boolean arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            providesignlink(null);
        }
        field3120++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class113) class151.field2126.method979((byte) 28, var3);
    }

    @OriginalMember(owner = "client!jg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3107++;
    }

    @OriginalMember(owner = "client!jg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class479.field7004 = false;
        field3105++;
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label112: {
                if (class397.field5520 != null) {
                    String var1 = class397.field5520.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class397.field5525;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1308(0, "wrongjava");
                            break label112;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class397.field5525 == null || class397.field5525.equals("1.4.2"))) {
                        this.method1308(0, "wrongjava");
                        break label112;
                    }
                }
                if (class397.field5525 != null && class397.field5525.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class397.field5525.length() > var3) {
                        char var5 = class397.field5525.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var5 - (48 - var4 * 10);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class12.field143 = true;
                    }
                }
                if (class282.field3804.field5516 != null) {
                    Method var6 = class397.field5535;
                    if (var6 != null) {
                        try {
                            var6.invoke(class282.field3804.field5516, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class60.method382((byte) -104);
                class351.method1942(0);
                this.method1317(14);
                this.method1206(-9304);
                class52.field700 = class368.method2133((byte) -103);
                this.method1310(-24489);
                while (class456.field6669 == 0L || class456.field6669 > class333.method1850(-3562)) {
                    class190.field2626 = class52.field700.method715(69, class18.field188);
                    for (int var7 = 0; var7 < class190.field2626; var7++) {
                        this.method1311(31);
                    }
                    this.method1314((byte) 103);
                    class325.method1822(class474.field6924, class282.field3804, 50);
                }
            }
        } catch (Throwable var10) {
            class162.method1000((byte) 24, var10, null);
            this.method1308(0, "crash");
        }
        field3112++;
        this.method1312(-122, true);
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
    private final void method1314(byte arg0) {
        field3110++;
        long var2 = class333.method1850(-3562);
        long var4 = class366.field5138[class45.field640];
        class366.field5138[class45.field640] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class20.field214 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != 103) {
            return;
        }
        class45.field640 = class45.field640 + 1 & 0x1F;
        if (class188.field2604++ > 50) {
            class188.field2604 -= 50;
            class308.field4230 = true;
            class474.field6924.setSize(class177.field2513, class351.field4795);
            class474.field6924.setVisible(true);
            if (class140.field1993 != null && class38.field513 == null) {
                Insets var7 = class140.field1993.getInsets();
                class474.field6924.setLocation(class200.field2856 + var7.left, class426.field6240 + var7.top);
            } else {
                class474.field6924.setLocation(class200.field2856, class426.field6240);
            }
        }
        this.method1187((byte) 2);
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Z")
    public final boolean method1315(int arg0) {
        field3117++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            int var3 = -70 % ((-arg0 - 56) / 62);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1308(0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
    public static final void method1316(int arg0) {
        field3123++;
        if (!class380.field5370) {
            return;
        }
        class380.field5370 = false;
        if (arg0 <= 8) {
            field3137 = null;
        }
        class234.field3250 = null;
        class304.field4152 = null;
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V")
    public final synchronized void method1317(int arg0) {
        field3116++;
        if (class474.field6924 != null) {
            class474.field6924.removeFocusListener(this);
            class474.field6924.getParent().remove(class474.field6924);
        }
        Container var2;
        if (class38.field513 != null) {
            var2 = class38.field513;
        } else if (class140.field1993 == null) {
            var2 = class282.field3804.field5516;
        } else {
            var2 = class140.field1993;
        }
        var2.setLayout(null);
        class474.field6924 = new class389(this);
        var2.add(class474.field6924);
        class474.field6924.setSize(class177.field2513, class351.field4795);
        class474.field6924.setVisible(true);
        if (class140.field1993 == var2) {
            Insets var3 = class140.field1993.getInsets();
            class474.field6924.setLocation(class200.field2856 + var3.left, class426.field6240 + var3.top);
        } else {
            class474.field6924.setLocation(class200.field2856, class426.field6240);
        }
        class474.field6924.addFocusListener(this);
        class474.field6924.requestFocus();
        class479.field7004 = true;
        class483.field7099 = true;
        class308.field4230 = true;
        class522.field7695 = false;
        class425.field6205 = class333.method1850(-3562);
        int var4 = 105 / ((67 - arg0) / 53);
    }

    @OriginalMember(owner = "client!jg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3101++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILjava/lang/String;ZIIIZ)V")
    public final void method1318(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            class238.field3270 = arg6;
            class351.field4795 = arg1;
            class282.field3808 = arg1;
            class200.field2856 = 0;
            class189.field2622 = this;
            class177.field2513 = arg5;
            class166.field2345 = arg5;
            class426.field6240 = 0;
            if (arg3) {
                this.method1318(65, 69, null, true, 22, -115, 45, false);
            }
            class140.field1993 = new Frame();
            class140.field1993.setTitle("Jagex");
            class140.field1993.setResizable(true);
            class140.field1993.addWindowListener(this);
            class140.field1993.setVisible(true);
            class140.field1993.toFront();
            Insets var9 = class140.field1993.getInsets();
            class140.field1993.setSize(class166.field2345 + var9.right + var9.left, class282.field3808 + var9.top + var9.bottom);
            class124.field1691 = class282.field3804 = new class397(null, arg4, arg2, arg0);
            class409 var10 = class282.field3804.method2296(1, this, (byte) 32);
            while (var10.field5652 == 0) {
                class496.method2931((byte) 124, 10L);
            }
        } catch (Exception var12) {
            class162.method1000((byte) -92, var12, null);
        }
        field3118++;
    }

    @OriginalMember(owner = "client!jg", name = "start", descriptor = "()V")
    public final void start() {
        field3104++;
        if (class189.field2622 == this && !class109.field1487) {
            class456.field6669 = 0L;
        }
    }

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field3136 = null;
        field3129 = null;
        field3135 = null;
        field3138 = null;
        if (arg0 != 2) {
            field3136 = null;
        }
        field3131 = null;
        field3137 = null;
    }

    @OriginalMember(owner = "client!jg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!jg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3099++;
        class479.field7004 = true;
        class308.field4230 = true;
    }

    static {
        new class83("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field3131 = new boolean[5];
        field3135 = new int[14];
        field3129 = new class522();
        field3136 = new class83("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");
        field3138 = new int[16];
        field3139 = 0;
        field3140 = -1;
        field3141 = 2;
        field3137 = new class9(5);
    }
}
