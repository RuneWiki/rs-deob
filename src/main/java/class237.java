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

@OriginalClass("client!qj")
public abstract class class237 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Z")
    private boolean field3147 = false;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    private boolean field3148 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lcr;")
    public static class189 field3160 = new class189(4);

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3184 = "Please remove ";

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Z")
    public static boolean field3185 = false;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "Luq;")
    public static class233 field3186;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "Z")
    public static boolean field3189;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "Z")
    public static boolean field3190;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Z")
    public static boolean field3191;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Z")
    public static boolean field3192;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
    public static boolean field3193;

    @OriginalMember(owner = "client!qj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 7)
    public final void windowOpened(WindowEvent arg0) {
        field3162++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3177++;
        try {
            if (class178.field2367 == null) {
                class138.field1907 = arg3;
                class273.field3956 = arg3;
                class178.field2367 = this;
                class308.field4535 = 0;
                if (arg1 != -127) {
                    field3185 = false;
                }
                class359.field5185 = arg2;
                class159.field2145 = 0;
                class92.field1294 = arg0;
                class180.field2384 = arg0;
                if (class76.field1085 == null) {
                    class420.field6210 = class76.field1085 = new class36(this, arg4, (String) null, 0);
                }
                class429 var6 = class76.field1085.method242(this, (byte) -102, 1);
                while (var6.field6308 == 0) {
                    class144.method918(10L, true);
                }
            } else {
                class55.field745++;
                if (class55.field745 >= 3) {
                    this.method1432("alreadyloaded", 14231);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class248.method1494((String) null, 109, var8);
            this.method1432("crash", 14231);
        }
    }

    @OriginalMember(owner = "client!qj", name = "providesignlink", descriptor = "(Lwd;)V", line = 62)
    public static final void providesignlink(class36 arg0) {
        class76.field1085 = arg0;
        class420.field6210 = arg0;
        field3171++;
    }

    @OriginalMember(owner = "client!qj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 76)
    public final void windowDeiconified(WindowEvent arg0) {
        field3166++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;", line = 83)
    public static final String method1418(int arg0, boolean arg1, boolean arg2, int arg3, long arg4) {
        field3154++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (!arg1) {
            field3184 = null;
        }
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I", line = 162)
    public static final int method1419(int arg0, int arg1, int arg2) {
        int var3 = -111 % ((arg0 - 3) / 50);
        field3167++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var4 = (arg1 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg1 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIII)V", line = 186)
    public static final void method1420(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3188++;
        class263 var5 = class47.method337(8, 0, arg4);
        var5.method1807((byte) -124);
        var5.field3809 = arg1;
        var5.field3820 = arg3;
        var5.field3813 = arg2;
        if (arg0 <= 93) {
            method1420((byte) -25, 46, 49, -8, 116);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z", line = 202)
    public final boolean method1421(byte arg0) {
        field3169++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != -45) {
                this.method1434(122);
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1432("invalidhost", arg0 ^ 0xFFFFC844);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "stop", descriptor = "()V", line = 240)
    public final void stop() {
        field3161++;
        if (class178.field2367 == this && !class129.field1790) {
            class380.field5534 = class114.method735(96) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 252)
    private final void method1422(int arg0) {
        field3151++;
        long var2 = class114.method735(110);
        long var4 = class163.field2187[class242.field3234];
        class163.field2187[class242.field3234] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class242.field3234 = class242.field3234 + 1 & 0x1F;
        synchronized (this) {
            class65.field865 = class426.field6280;
        }
        if (arg0 > -69) {
            this.windowDeactivated((WindowEvent) null);
        }
        this.method1424(false);
    }

    @OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 286)
    public final synchronized void paint(Graphics arg0) {
        field3159++;
        if (class178.field2367 != this || class129.field1790) {
            return;
        }
        class171.field2296 = true;
        if (class194.field2589 && class114.method735(117) - class363.field5241 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class273.field3956 <= var2.width && class180.field2384 <= var2.height) {
                class22.field286 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 310)
    public final URL getCodeBase() {
        field3155++;
        if (class374.field5447 == null) {
            return class76.field1085 == null || class76.field1085.field519 == this ? super.getCodeBase() : class76.field1085.field519.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I", line = 326)
    public static final int method1423(int arg0) {
        if (arg0 == -10231) {
            field3156++;
            return ((class400.field5969 == 0 ? 0 : 1) << 21) + ((class299.field4384 ? 1 : 0) << 19) + (class365.field5288 << 17) + ((class431.field6338 ? 1 : 0) << 9) + ((class42.field584 ? 1 : 0) << 5) + ((class265.field3845 ? 1 : 0) << 3) + (class416.field6106 & 0x7) + ((class423.field6238 & 0x3 << 11) - -((class211.field2801 ? 1 : 0) << 13)) + (((class213.field2853 ? 1 : 0) << 15) - (-((class339.field4891 ? 1 : 0) << 16) - ((class359.field5186 == 0 ? 0 : 1) << 20))) - (-((class93.field1342 ? 1 : 0) << 4) - ((class411.field6069 ? 1 : 0) << 6)) - (-((class166.field2240 ? 1 : 0) << 8) + -((class120.field1678 ? 1 : 0) << 10)) - (-((class156.field2123 == 0 ? 0 : 1) << 22) + -(class248.method1498((byte) 120) << 23) - (class416.field6114 << 25) + -((class275.field3984 ? 1 : 0) << 27) + -(class196.field2622 << 28));
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZIIIILjava/lang/String;)V", line = 339)
    public final void method1425(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        try {
            class308.field4535 = arg4;
            class359.field5185 = arg6;
            class92.field1294 = arg5;
            class180.field2384 = arg5;
            class178.field2367 = this;
            class138.field1907 = arg0;
            class273.field3956 = arg0;
            class159.field2145 = 0;
            class374.field5447 = new Frame();
            class374.field5447.setTitle("Jagex");
            class374.field5447.setResizable(true);
            class374.field5447.addWindowListener(this);
            class374.field5447.setVisible(true);
            class374.field5447.toFront();
            Insets var9 = class374.field5447.getInsets();
            class374.field5447.setSize(class273.field3956 - (-var9.right - var9.left), class180.field2384 + var9.top + var9.bottom);
            class420.field6210 = class76.field1085 = new class36((Applet) null, arg1, arg7, arg3);
            class429 var10 = class76.field1085.method242(this, (byte) -102, 1);
            while (var10.field6308 == 0) {
                class144.method918(10L, true);
            }
        } catch (Exception var12) {
            class248.method1494((String) null, arg4 + 108, var12);
        }
        field3153++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZZ)V", line = 378)
    private final void method1426(boolean arg0, boolean arg1) {
        field3150++;
        synchronized (this) {
            if (class129.field1790) {
                return;
            }
            class129.field1790 = true;
        }
        if (class76.field1085.field519 != null) {
            class76.field1085.field519.destroy();
        }
        try {
            this.method1430((byte) 124);
        } catch (Exception var11) {
        }
        if (arg0) {
            this.getParameter((String) null);
        }
        if (this.field3147) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3147 = false;
        }
        class429 var4 = class76.field1085.method253(class178.field2367.getClass(), 10000);
        while (var4.field6308 == 0) {
            class144.method918(100L, true);
        }
        if (class202.field2708 != null) {
            try {
                class202.field2708.removeFocusListener(this);
                class202.field2708.getParent().remove(class202.field2708);
            } catch (Exception var9) {
            }
        }
        if (class76.field1085 != null) {
            try {
                class76.field1085.method252(-32636);
            } catch (Exception var8) {
            }
        }
        this.method1437(true);
        if (class374.field5447 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 459)
    public final synchronized void method1427(int arg0) {
        if (class202.field2708 != null) {
            class202.field2708.removeFocusListener(this);
            class202.field2708.getParent().remove(class202.field2708);
        }
        field3176++;
        Container var2;
        if (class103.field1428 != null) {
            var2 = class103.field1428;
        } else if (class374.field5447 == null) {
            var2 = class76.field1085.field519;
        } else {
            var2 = class374.field5447;
        }
        var2.setLayout((LayoutManager) null);
        class202.field2708 = new class414(this);
        var2.add(class202.field2708);
        class202.field2708.setSize(class138.field1907, class92.field1294);
        class202.field2708.setVisible(true);
        if (class374.field5447 == var2) {
            Insets var3 = class374.field5447.getInsets();
            class202.field2708.setLocation(class159.field2145 + var3.left, class308.field4535 + var3.top);
        } else {
            class202.field2708.setLocation(class159.field2145, class308.field4535);
        }
        class202.field2708.addFocusListener(this);
        class202.field2708.requestFocus();
        class426.field6280 = true;
        class65.field865 = true;
        class171.field2296 = true;
        class22.field286 = false;
        if (arg0 != 0) {
            this.method1417(-16, -20, 113, 39, 45);
        }
        class363.field5241 = class114.method735(107);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Z", line = 507)
    public static final boolean method1428(int arg0, boolean arg1) {
        field3174++;
        class92 var2 = class282.method1943(arg0, -3490);
        if (var2 == null) {
            return false;
        } else if (class36.field511 == 3) {
            if (!arg1) {
                field3170 = -52;
            }
            String var3 = "";
            if (class61.field803 != 0) {
                var3 = ":" + (var2.field1300 + 7000);
            }
            String var4 = "";
            if (class174.field2328 != null) {
                var4 = "/p=" + class174.field2328;
            }
            String var5 = "http://" + var2.field1297 + var3 + "/l=" + class177.field2337 + "/a=" + class223.field2944 + var4 + "/j" + (class329.field4789 ? "1" : "0") + ",o" + (class416.field6113 ? "1" : "0") + ",a2";
            try {
                class328.field4784.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class43.field616 = var2.field1300;
            class298.field4302 = var2.field1297;
            if (class61.field803 != 0) {
                class162.field2171 = class43.field616 + 50000;
                class430.field6322 = class43.field616 + 40000;
                class153.field2070 = class430.field6322;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 557)
    public final void windowClosed(WindowEvent arg0) {
        field3187++;
    }

    @OriginalMember(owner = "client!qj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 567)
    public final URL getDocumentBase() {
        field3163++;
        if (class374.field5447 == null) {
            return class76.field1085 == null || class76.field1085.field519 == this ? super.getDocumentBase() : class76.field1085.field519.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 587)
    public final void focusLost(FocusEvent arg0) {
        field3178++;
        class426.field6280 = false;
    }

    @OriginalMember(owner = "client!qj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 600)
    public final String getParameter(String arg0) {
        field3164++;
        if (class374.field5447 == null) {
            return class76.field1085 == null || class76.field1085.field519 == this ? super.getParameter(arg0) : class76.field1085.field519.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 617)
    public static void method1431(byte arg0) {
        field3160 = null;
        field3186 = null;
        field3184 = null;
        if (arg0 != -3) {
            field3184 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 629)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field3183++;
    }

    @OriginalMember(owner = "client!qj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 638)
    public final void windowActivated(WindowEvent arg0) {
        field3165++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 645)
    public final void method1432(String arg0, int arg1) {
        field3175++;
        if (this.field3148 || arg1 != 14231) {
            return;
        }
        this.field3148 = true;
        System.out.println("error_game_" + arg0);
        try {
            class421.method2690(class76.field1085.field519, "loggedout", -27444);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 671)
    public final AppletContext getAppletContext() {
        field3168++;
        if (class374.field5447 == null) {
            return class76.field1085 == null || class76.field1085.field519 == this ? super.getAppletContext() : class76.field1085.field519.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 692)
    public final void focusGained(FocusEvent arg0) {
        field3181++;
        class426.field6280 = true;
        class171.field2296 = true;
    }

    @OriginalMember(owner = "client!qj", name = "destroy", descriptor = "()V", line = 701)
    public final void destroy() {
        field3152++;
        if (class178.field2367 == this && !class129.field1790) {
            class380.field5534 = class114.method735(120);
            class144.method918(5000L, true);
            class420.field6210 = null;
            this.method1426(false, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 715)
    public final void windowDeactivated(WindowEvent arg0) {
        field3172++;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 722)
    public final void method1433(int arg0) {
        field3180++;
        if (arg0 != 10 || this.field3147) {
            return;
        }
        try {
            class429 var2 = class76.field1085.method244(class178.field2367.getClass(), 0);
            while (var2.field6308 == 0) {
                class144.method918(100L, true);
            }
            if (var2.field6309 != null) {
                throw (Throwable) var2.field6309;
            }
            jagmisc.init();
            this.field3147 = true;
            class11.field172 = class432.method2737((byte) 122);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 757)
    public final void windowIconified(WindowEvent arg0) {
        field3173++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 768)
    public static final void method1435() {
        for (int var0 = 0; var0 < class397.field5914; var0++) {
            class55 var1 = class163.field2183[var0];
            class244.method1469(var1);
            class163.field2183[var0] = null;
        }
        class397.field5914 = 0;
    }

    @OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 787)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3158++;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V", line = 801)
    private final void method1436(int arg0) {
        field3157++;
        long var2 = class114.method735(97);
        long var4 = class279.field4057[class286.field4140];
        class279.field4057[class286.field4140] = var2;
        class286.field4140 = class286.field4140 + 1 & 0x1F;
        if (arg0 >= -59) {
            field3185 = false;
        }
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class398.field5939 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class94.field1345++) > 50) {
            class94.field1345 -= 50;
            class171.field2296 = true;
            class202.field2708.setSize(class138.field1907, class92.field1294);
            class202.field2708.setVisible(true);
            if (class374.field5447 != null && class103.field1428 == null) {
                Insets var7 = class374.field5447.getInsets();
                class202.field2708.setLocation(var7.left + class159.field2145, class308.field4535 + var7.top);
            } else {
                class202.field2708.setLocation(class159.field2145, class308.field4535);
            }
        }
        this.method1429(1);
    }

    @OriginalMember(owner = "client!qj", name = "start", descriptor = "()V", line = 846)
    public final void start() {
        field3179++;
        if (class178.field2367 == this && !class129.field1790) {
            class380.field5534 = 0L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V", line = 863)
    public final void run() {
        field3149++;
        try {
            label113: {
                if (class36.field507 != null) {
                    String var1 = class36.field507.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class36.field518;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1432("wrongjava", 14231);
                            break label113;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class36.field518 == null || class36.field518.equals("1.4.2"))) {
                        this.method1432("wrongjava", 14231);
                        break label113;
                    }
                }
                if (class36.field518 != null && class36.field518.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class36.field518.length()) {
                        char var5 = class36.field518.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class194.field2589 = true;
                    }
                }
                if (class76.field1085.field519 != null) {
                    Method var6 = class36.field521;
                    if (var6 != null) {
                        try {
                            var6.invoke(class76.field1085.field519, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class363.method2371((byte) 118);
                class71.method514((byte) 125);
                this.method1427(0);
                this.method1434(114);
                class11.field172 = class432.method2737((byte) 125);
                this.method1433(10);
                while (class380.field5534 == 0L || class380.field5534 > class114.method735(95)) {
                    class397.field5904 = class11.field172.method369(class264.field3827, 24168);
                    for (int var7 = 0; var7 < class397.field5904; var7++) {
                        this.method1422(-76);
                    }
                    this.method1436(-121);
                    if (class247.field3333 == 1) {
                        class144.method918(5L, true);
                    }
                    class8.method61((byte) 87, class202.field2708, class76.field1085);
                }
            }
        } catch (Exception var10) {
            class248.method1494((String) null, -20, var10);
            this.method1432("crash", 14231);
        }
        this.method1426(false, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public abstract void method1424(boolean arg0);

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public abstract void method1429(int arg0);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public abstract void method1430(byte arg0);

    @OriginalMember(owner = "client!qj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public abstract void method1434(int arg0);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
    public abstract void method1437(boolean arg0);
}
