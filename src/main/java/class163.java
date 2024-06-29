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

@OriginalClass("client!ba")
public abstract class class163 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Z")
    private boolean field2854 = false;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lhi;")
    public static class82 field2845 = class95.method664((byte) -80, ")2");

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lhi;")
    public static class82 field2823 = class95.method664((byte) -97, "<)4col> x");

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "Lhi;")
    public static class82 field2855 = class95.method664((byte) -90, "null");

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[I")
    public static int[] field2834 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "[[I")
    public static int[][] field2852 = new int[104][104];

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Z")
    public static boolean field2860;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
    public static int[] field2817;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIB)V", line = 6)
    public static final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field2840++;
        if (class113.method777((byte) 100, arg1)) {
            if (arg8 > -105) {
                field2852 = (int[][]) ((int[][]) null);
            }
            class198.field3385 = null;
            class68.method429(arg7, arg2, arg0, -1, (byte) -106, arg3, arg4, arg5, arg6, class277.field4660[arg1]);
            if (class198.field3385 != null) {
                class68.method429(class215.field3752, class193.field3267, arg0, -1412584499, (byte) -106, arg3, arg4, arg5, arg6, class198.field3385);
                class198.field3385 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class276.field4639[var9] = true;
            }
        } else {
            class276.field4639[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 44)
    public final void windowClosing(WindowEvent arg0) {
        field2849++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ba", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 52)
    public final AppletContext getAppletContext() {
        field2825++;
        if (class261.field4468 == null) {
            return class55.field881 == null || class55.field881.field2109 == this ? super.getAppletContext() : class55.field881.field2109.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 68)
    public final void focusLost(FocusEvent arg0) {
        field2847++;
        class296.field4998 = false;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 76)
    public final synchronized void method1173(byte arg0) {
        field2828++;
        if (class122.field2134 != null) {
            class122.field2134.removeFocusListener(this);
            class122.field2134.getParent().remove(class122.field2134);
        }
        Container var2;
        if (class48.field795 != null) {
            var2 = class48.field795;
        } else if (class261.field4468 == null) {
            var2 = class55.field881.field2109;
        } else {
            var2 = class261.field4468;
        }
        var2.setLayout((LayoutManager) null);
        class122.field2134 = new class229(this);
        var2.add(class122.field2134);
        class122.field2134.setSize(class260.field4462, class180.field3078);
        class122.field2134.setVisible(true);
        if (class261.field4468 == var2) {
            Insets var3 = class261.field4468.getInsets();
            class122.field2134.setLocation(class179.field3066 + var3.left, class48.field798 + var3.top);
        } else {
            class122.field2134.setLocation(class179.field3066, class48.field798);
        }
        class122.field2134.addFocusListener(this);
        class122.field2134.requestFocus();
        class296.field4998 = true;
        class214.field3738 = true;
        class211.field3698 = true;
        if (arg0 != -107) {
            method1179(12, 1, 96, (byte) 60);
        }
        class144.field2454 = false;
        class272.field4586 = class57.method391(19211);
    }

    @OriginalMember(owner = "client!ba", name = "destroy", descriptor = "()V", line = 133)
    public final void destroy() {
        field2818++;
        if (class261.field4471 == this && !class141.field2424) {
            class196.field3351 = class57.method391(19211);
            class290.method2001(5000L, false);
            class25.field334 = null;
            this.method1181(false, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V", line = 148)
    public final void run() {
        field2824++;
        try {
            if (class120.field2120 != null) {
                String var1 = class120.field2120.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class120.field2110;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1178(-108, "wrongjava");
                        return;
                    }
                    class209.field3681 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class120.field2110 == null || class120.field2110.equals("1.4.2"))) {
                    this.method1178(-121, "wrongjava");
                    return;
                }
            }
            if (class120.field2110 != null && class120.field2110.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class120.field2110.length()) {
                    char var5 = class120.field2110.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class123.field2154 = true;
                }
            }
            if (class55.field881.field2109 != null) {
                Method var6 = class120.field2127;
                if (var6 != null) {
                    try {
                        var6.invoke(class55.field881.field2109, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method1173((byte) -107);
            class321.field5534 = class157.method1129(class260.field4462, class122.field2134, (byte) -118, class180.field3078);
            this.method856(-14084);
            class5.field43 = class296.method2050((byte) 86);
            while (class196.field3351 == 0L || class57.method391(19211) < class196.field3351) {
                class191.field3205 = class5.field43.method449(1504371521, class328.field5605, class209.field3681);
                for (int var8 = 0; var8 < class191.field3205; var8++) {
                    this.method1175(46);
                }
                this.method1177((byte) -121);
                class302.method2086(false, class122.field2134, class55.field881);
            }
        } catch (Exception var11) {
            class48.method348(-2, (String) null, var11);
            this.method1178(-103, "crash");
        }
        this.method1181(true, (byte) -85);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 255)
    public static final void method1174(int arg0, int arg1) {
        class227 var2 = class215.method1531(-1, 11, arg1);
        var2.method1624((byte) -101);
        if (arg0 == -13965) {
            field2857++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 268)
    private final void method1175(int arg0) {
        field2843++;
        long var2 = class57.method391(19211);
        long var4 = class327.field5590[class68.field1062];
        if (var4 != 0L && var4 < var2) {
        }
        class327.field5590[class68.field1062] = var2;
        class68.field1062 = class68.field1062 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 <= 32) {
                this.field2854 = true;
            }
            class214.field3738 = class296.field4998;
        }
        this.method861(-103);
    }

    @OriginalMember(owner = "client!ba", name = "providesignlink", descriptor = "(Lsm;)V", line = 298)
    public static final void providesignlink(class120 arg0) {
        class55.field881 = arg0;
        class25.field334 = arg0;
        field2844++;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Z", line = 307)
    public final boolean method1176(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field2822++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        }
        if (arg0 != -12) {
            field2855 = (class82) null;
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
                this.method1178(arg0 ^ 0x7B, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 343)
    public final String getParameter(String arg0) {
        field2820++;
        if (class261.field4468 == null) {
            return class55.field881 == null || class55.field881.field2109 == this ? super.getParameter(arg0) : class55.field881.field2109.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "stop", descriptor = "()V", line = 358)
    public final void stop() {
        field2851++;
        if (class261.field4471 == this && !class141.field2424) {
            class196.field3351 = class57.method391(19211) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 380)
    private final void method1177(byte arg0) {
        field2846++;
        long var2 = class57.method391(19211);
        if (arg0 >= -100) {
            this.method853(-7);
        }
        long var4 = class149.field2532[class238.field4137];
        class149.field2532[class238.field4137] = var2;
        class238.field4137 = class238.field4137 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class219.field3796 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class95.field1751++) > 50) {
            class95.field1751 -= 50;
            class211.field3698 = true;
            class122.field2134.setSize(class260.field4462, class180.field3078);
            class122.field2134.setVisible(true);
            if (class261.field4468 != null && class48.field795 == null) {
                Insets var7 = class261.field4468.getInsets();
                class122.field2134.setLocation(class179.field3066 + var7.left, var7.top - -class48.field798);
            } else {
                class122.field2134.setLocation(class179.field3066, class48.field798);
            }
        }
        this.method869(true);
    }

    @OriginalMember(owner = "client!ba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 421)
    public final synchronized void paint(Graphics arg0) {
        field2838++;
        if (class261.field4471 != this || class141.field2424) {
            return;
        }
        class211.field3698 = true;
        if (class123.field2154 && !class147.field2485 && class57.method391(19211) - class272.field4586 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class196.field3337 && class166.field2902 <= var2.height) {
                class144.field2454 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 442)
    public final void windowActivated(WindowEvent arg0) {
        field2829++;
    }

    @OriginalMember(owner = "client!ba", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 450)
    public final void windowOpened(WindowEvent arg0) {
        field2836++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;)V", line = 461)
    public final void method1178(int arg0, String arg1) {
        if (arg0 > -99) {
            return;
        }
        field2839++;
        if (this.field2854) {
            return;
        }
        this.field2854 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)I", line = 484)
    public static final int method1179(int arg0, int arg1, int arg2, byte arg3) {
        field2835++;
        if (arg3 >= -58) {
            field2821 = -72;
        }
        return arg2 <= arg0 ? (arg1 >= arg0 ? arg0 : arg1) : arg2;
    }

    @OriginalMember(owner = "client!ba", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 502)
    public final URL getCodeBase() {
        field2832++;
        if (class261.field4468 == null) {
            return class55.field881 == null || class55.field881.field2109 == this ? super.getCodeBase() : class55.field881.field2109.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 516)
    public final void windowIconified(WindowEvent arg0) {
        field2841++;
    }

    @OriginalMember(owner = "client!ba", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 525)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2827++;
    }

    @OriginalMember(owner = "client!ba", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 545)
    public final URL getDocumentBase() {
        field2858++;
        if (class261.field4468 == null) {
            return class55.field881 == null || class55.field881.field2109 == this ? super.getDocumentBase() : class55.field881.field2109.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V", line = 564)
    public static void method1180(byte arg0) {
        field2823 = null;
        field2852 = (int[][]) null;
        field2855 = null;
        field2817 = null;
        field2834 = null;
        int var1 = 106 % ((65 - arg0) / 58);
        field2845 = null;
    }

    @OriginalMember(owner = "client!ba", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 593)
    public final void windowClosed(WindowEvent arg0) {
        field2850++;
    }

    @OriginalMember(owner = "client!ba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 600)
    public final void focusGained(FocusEvent arg0) {
        class296.field4998 = true;
        class211.field3698 = true;
        field2831++;
    }

    @OriginalMember(owner = "client!ba", name = "start", descriptor = "()V", line = 609)
    public final void start() {
        field2842++;
        if (class261.field4471 == this && !class141.field2424) {
            class196.field3351 = 0L;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZB)V", line = 626)
    private final void method1181(boolean arg0, byte arg1) {
        field2853++;
        synchronized (this) {
            if (class141.field2424) {
                return;
            }
            class141.field2424 = true;
        }
        if (class55.field881.field2109 != null) {
            class55.field881.field2109.destroy();
        }
        try {
            if (arg1 > -62) {
                this.method1183(-110, (String) null, -98, -3, 102, 24, 36);
            }
            this.method853(-15069);
        } catch (Exception var12) {
        }
        if (class122.field2134 != null) {
            try {
                class122.field2134.removeFocusListener(this);
                class122.field2134.getParent().remove(class122.field2134);
            } catch (Exception var11) {
            }
        }
        if (class55.field881 != null) {
            try {
                class55.field881.method813((byte) -40);
            } catch (Exception var10) {
            }
        }
        this.method870((byte) 127);
        if (class261.field4468 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ba", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 698)
    public final void windowDeactivated(WindowEvent arg0) {
        field2830++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 713)
    public final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2819++;
        try {
            if (class261.field4471 != null) {
                class40.field708++;
                if (class40.field708 >= 3) {
                    this.method1178(arg1 + 18683, "alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class260.field4462 = arg2;
            class196.field3337 = arg2;
            class261.field4471 = this;
            class165.field2887 = arg4;
            class180.field3078 = arg3;
            class166.field2902 = arg3;
            class48.field798 = 0;
            class179.field3066 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class127.field2231 = true;
            } else {
                class127.field2231 = false;
            }
            if (class55.field881 == null) {
                class25.field334 = class55.field881 = new class120(this, arg0, (String) null, 0);
            }
            if (arg1 != -18804) {
                this.windowClosing((WindowEvent) null);
            }
            class301 var7 = class55.field881.method821(this, 1, (byte) -34);
            while (var7.field5121 == 0) {
                class290.method2001(10L, false);
            }
            class269.field4550 = (Thread) var7.field5122;
        } catch (Exception var9) {
            class48.method348(-2, (String) null, var9);
            this.method1178(-103, "crash");
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 768)
    public final void method1183(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2826++;
        try {
            class48.field798 = 0;
            class260.field4462 = arg3;
            class196.field3337 = arg3;
            class165.field2887 = arg4;
            class180.field3078 = arg6;
            class166.field2902 = arg6;
            class261.field4471 = this;
            class179.field3066 = 0;
            class261.field4468 = new Frame();
            class261.field4468.setTitle("Jagex");
            class261.field4468.setResizable(true);
            class261.field4468.addWindowListener(this);
            class261.field4468.setVisible(true);
            class261.field4468.toFront();
            Insets var8 = class261.field4468.getInsets();
            class261.field4468.setSize(class196.field3337 + var8.left + var8.right, class166.field2902 - (-var8.top - var8.bottom));
            class25.field334 = class55.field881 = new class120((Applet) null, arg5, arg1, arg0);
            class301 var9 = class55.field881.method821(this, 1, (byte) -34);
            while (var9.field5121 == 0) {
                class290.method2001(10L, false);
            }
            class269.field4550 = (Thread) var9.field5122;
            if (arg2 != 10) {
                field2834 = (int[]) null;
            }
        } catch (Exception var11) {
            class48.method348(arg2 ^ 0xFFFFFFF4, (String) null, var11);
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 814)
    public final void windowDeiconified(WindowEvent arg0) {
        field2833++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public abstract void method869(boolean arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public abstract void method853(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public abstract void method870(byte arg0);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public abstract void method856(int arg0);

    @OriginalMember(owner = "client!ba", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public abstract void method861(int arg0);
}
