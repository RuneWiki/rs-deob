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

@OriginalClass("client!we")
public abstract class class233 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
    private boolean field3157 = false;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Z")
    private boolean field3164 = false;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3144 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3176 = 99;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lbq;")
    public static class159 field3142;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lra;")
    public static class57 field3154;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Z")
    public static boolean field3184;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Z")
    public static boolean field3185;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Z")
    public static boolean field3186;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "Z")
    public static boolean field3187;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Z")
    public static boolean field3188;

    @OriginalMember(owner = "client!we", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 11)
    public final void windowClosing(WindowEvent arg0) {
        field3174++;
        this.destroy();
    }

    @OriginalMember(owner = "client!we", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 25)
    public final AppletContext getAppletContext() {
        field3178++;
        if (class252.field3406 == null) {
            return class323.field4554 == null || class323.field4554.field5559 == this ? super.getAppletContext() : class323.field4554.field5559.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 41)
    public final void focusLost(FocusEvent arg0) {
        class421.field6047 = false;
        field3173++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 50)
    public final void method1480(int arg0) {
        int var2 = -5 % ((31 - arg0) / 38);
        field3153++;
        if (this.field3164) {
            return;
        }
        try {
            class241 var3 = class323.field4554.method2387(19, class128.field1791.getClass());
            while (var3.field3268 == 0) {
                class278.method1757(100L, 0);
            }
            if (var3.field3270 != null) {
                throw (Throwable) var3.field3270;
            }
            jagmisc.init();
            this.field3164 = true;
            class40.field428 = class353.method2249(0);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!we", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 84)
    public final void windowClosed(WindowEvent arg0) {
        field3165++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 91)
    public final synchronized void method1481(int arg0) {
        if (class348.field5096 != null) {
            class348.field5096.removeFocusListener(this);
            class348.field5096.getParent().remove(class348.field5096);
        }
        field3143++;
        Container var2;
        if (class223.field3042 != null) {
            var2 = class223.field3042;
        } else if (class252.field3406 == null) {
            var2 = class323.field4554.field5559;
        } else {
            var2 = class252.field3406;
        }
        var2.setLayout((LayoutManager) null);
        class348.field5096 = new class178(this);
        var2.add(class348.field5096);
        class348.field5096.setSize(class38.field389, class222.field3039);
        class348.field5096.setVisible(true);
        if (class252.field3406 == var2) {
            Insets var3 = class252.field3406.getInsets();
            class348.field5096.setLocation(class99.field1111 + var3.left, var3.top - -class375.field5479);
        } else {
            class348.field5096.setLocation(class99.field1111, class375.field5479);
        }
        class348.field5096.addFocusListener(this);
        class348.field5096.requestFocus();
        class442.field6467 = true;
        class421.field6047 = true;
        if (arg0 == -30568) {
            class162.field2285 = true;
            class195.field2648 = false;
            class434.field6363 = class203.method1299((byte) 5);
        }
    }

    @OriginalMember(owner = "client!we", name = "destroy", descriptor = "()V", line = 141)
    public final void destroy() {
        field3166++;
        if (class128.field1791 == this && !class77.field870) {
            class58.field693 = class203.method1299((byte) 5);
            class278.method1757(5000L, 0);
            class267.field3757 = null;
            this.method1486(3215, false);
        }
    }

    @OriginalMember(owner = "client!we", name = "stop", descriptor = "()V", line = 155)
    public final void stop() {
        field3183++;
        if (class128.field1791 == this && !class77.field870) {
            class58.field693 = class203.method1299((byte) 5) + 4000L;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 167)
    public static final void method1482(boolean arg0, int arg1) {
        class169.field2360.method809(211, -28022);
        field3145++;
        class43.field522++;
        if (arg1 != 21571) {
            field3168 = 53;
        }
        for (class201 var2 = (class201) class396.field5783.method1212(-120); var2 != null; var2 = (class201) class396.field5783.method1207(false)) {
            if (!var2.method2289(124)) {
                var2 = (class201) class396.field5783.method1212(-82);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2771 == 0) {
                class164.method1057(true, var2, 0, arg0);
            }
        }
        if (class344.field5061 != null) {
            class101.method543((byte) 28, class344.field5061);
            class344.field5061 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 207)
    public final URL getCodeBase() {
        field3146++;
        if (class252.field3406 == null) {
            return class323.field4554 == null || class323.field4554.field5559 == this ? super.getCodeBase() : class323.field4554.field5559.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIII)V", line = 224)
    public final void method1483(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3159++;
        try {
            if (class128.field1791 == null) {
                class128.field1791 = this;
                class223.field3053 = arg4;
                class375.field5479 = 0;
                if (!arg0) {
                    class38.field389 = arg2;
                    class356.field5219 = arg2;
                    class222.field3039 = arg3;
                    class384.field5628 = arg3;
                    class99.field1111 = 0;
                    if (class323.field4554 == null) {
                        class267.field3757 = class323.field4554 = new class378(this, arg1, (String) null, 0);
                    }
                    class241 var6 = class323.field4554.method2386(1, this, (byte) -55);
                    while (var6.field3268 == 0) {
                        class278.method1757(10L, 0);
                    }
                }
            } else {
                class68.field768++;
                if (class68.field768 >= 3) {
                    this.method1493("alreadyloaded", -68);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class411.method2578(var8, (String) null, (byte) -68);
            this.method1493("crash", -122);
        }
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V", line = 271)
    public final void run() {
        field3149++;
        try {
            label116: {
                if (class378.field5556 != null) {
                    String var1 = class378.field5556.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class378.field5554;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1493("wrongjava", -100);
                            break label116;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class378.field5554 == null || class378.field5554.equals("1.4.2"))) {
                        this.method1493("wrongjava", -116);
                        break label116;
                    }
                }
                if (class378.field5554 != null && class378.field5554.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class378.field5554.length() > var3) {
                        char var5 = class378.field5554.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class356.field5221 = true;
                    }
                }
                if (class323.field4554.field5559 != null) {
                    Method var6 = class378.field5562;
                    if (var6 != null) {
                        try {
                            var6.invoke(class323.field4554.field5559, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class111.method612((byte) 87);
                this.method1481(-30568);
                this.method1071((byte) -21);
                class40.field428 = class353.method2249(0);
                this.method1480(-48);
                while (class58.field693 == 0L || class58.field693 > class203.method1299((byte) 5)) {
                    class430.field6236 = class40.field428.method300(class301.field4299, 6223);
                    for (int var7 = 0; var7 < class430.field6236; var7++) {
                        this.method1489((byte) 112);
                    }
                    this.method1490(-105);
                    class278.method1757(1L, 0);
                    class282.method1805(class323.field4554, class348.field5096, 1);
                }
            }
        } catch (Exception var10) {
            class411.method2578(var10, (String) null, (byte) -68);
            this.method1493("crash", -106);
        }
        this.method1486(3215, true);
    }

    @OriginalMember(owner = "client!we", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 390)
    public final void windowOpened(WindowEvent arg0) {
        field3171++;
    }

    @OriginalMember(owner = "client!we", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 397)
    public final void windowDeiconified(WindowEvent arg0) {
        field3152++;
    }

    @OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 407)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3160++;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Z", line = 418)
    public final boolean method1484(byte arg0) {
        field3177++;
        if (arg0 >= -98) {
            field3154 = null;
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method1493("invalidhost", -77);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V", line = 455)
    public static final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3148++;
        if (arg1 != -3141) {
            method1494((byte) 103);
        }
        if (class344.method2202((byte) 73, arg3)) {
            class171.method1137(arg8, arg4, arg7, arg2, arg0, arg1 + 3141, class224.field3054[arg3], -1, arg6, arg5);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class266.field3723[var9] = true;
            }
        } else {
            class266.field3723[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!we", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 485)
    public final void windowDeactivated(WindowEvent arg0) {
        field3150++;
    }

    @OriginalMember(owner = "client!we", name = "providesignlink", descriptor = "(Lam;)V", line = 493)
    public static final void providesignlink(class378 arg0) {
        field3163++;
        class323.field4554 = arg0;
        class267.field3757 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V", line = 501)
    private final void method1486(int arg0, boolean arg1) {
        field3161++;
        synchronized (this) {
            if (class77.field870) {
                return;
            }
            class77.field870 = true;
        }
        if (class323.field4554.field5559 != null) {
            class323.field4554.field5559.destroy();
        }
        try {
            this.method1075(11041);
        } catch (Exception var11) {
        }
        if (this.field3164) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3164 = false;
        }
        class241 var4 = class323.field4554.method2401(class128.field1791.getClass(), arg0 ^ 0xCB4);
        while (var4.field3268 == 0) {
            class278.method1757(100L, 0);
        }
        if (class348.field5096 != null) {
            try {
                class348.field5096.removeFocusListener(this);
                class348.field5096.getParent().remove(class348.field5096);
            } catch (Exception var9) {
            }
        }
        if (class323.field4554 != null) {
            try {
                class323.field4554.method2402(2);
            } catch (Exception var8) {
            }
        }
        this.method1080((byte) -64);
        if (arg0 != 3215) {
            return;
        }
        if (class252.field3406 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!we", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 579)
    public final String getParameter(String arg0) {
        field3155++;
        if (class252.field3406 == null) {
            return class323.field4554 == null || class323.field4554.field5559 == this ? super.getParameter(arg0) : class323.field4554.field5559.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IZ)I", line = 600)
    public static final int method1487(int arg0, boolean arg1) {
        field3156++;
        long var2 = class203.method1299((byte) 5);
        class338 var4 = arg1 ? (class338) class443.field6474.method1212(-123) : (class338) class443.field6474.method1207(false);
        int var5 = -115 % ((-arg0 - 35) / 57);
        while (var4 != null) {
            if (var2 > (var4.field5003 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field5003 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var4.field5248;
                    class283.field3972[var6] = class282.field3967[var6];
                    var4.method2290((byte) 98);
                    return var6;
                }
                var4.method2290((byte) 98);
            }
            var4 = (class338) class443.field6474.method1207(false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)I", line = 637)
    public static final int method1488(int arg0, String arg1) {
        field3181++;
        if (arg0 != -19285) {
            providesignlink((class378) null);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V", line = 653)
    private final void method1489(byte arg0) {
        field3182++;
        long var2 = class203.method1299((byte) 5);
        if (arg0 <= 6) {
            return;
        }
        long var4 = class260.field3526[class413.field5962];
        class260.field3526[class413.field5962] = var2;
        class413.field5962 = class413.field5962 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class442.field6467 = class421.field6047;
        }
        this.method1073((byte) 40);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 685)
    private final void method1490(int arg0) {
        if (arg0 > -16) {
            return;
        }
        field3151++;
        long var2 = class203.method1299((byte) 5);
        long var4 = class16.field162[class87.field978];
        class16.field162[class87.field978] = var2;
        class87.field978 = class87.field978 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class400.field5805 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class373.field5455++) > 50) {
            class162.field2285 = true;
            class373.field5455 -= 50;
            class348.field5096.setSize(class38.field389, class222.field3039);
            class348.field5096.setVisible(true);
            if (class252.field3406 != null && class223.field3042 == null) {
                Insets var7 = class252.field3406.getInsets();
                class348.field5096.setLocation(class99.field1111 + var7.left, var7.top - -class375.field5479);
            } else {
                class348.field5096.setLocation(class99.field1111, class375.field5479);
            }
        }
        this.method1085(1);
    }

    @OriginalMember(owner = "client!we", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 735)
    public final void focusGained(FocusEvent arg0) {
        field3169++;
        class421.field6047 = true;
        class162.field2285 = true;
    }

    @OriginalMember(owner = "client!we", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 745)
    public final void windowIconified(WindowEvent arg0) {
        field3147++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BILbo;)V", line = 752)
    public static final void method1491(byte arg0, int arg1, class433 arg2) {
        int var3 = 47 / ((-arg0 - 16) / 36);
        field3167++;
        int var4 = -1;
        int var5 = 0;
        if (arg2.field6331 > class221.field3033) {
            class150.method895(arg2, (byte) -21);
        } else if (class221.field3033 > arg2.field6285) {
            class261.method1642(arg2, -91, false);
            var5 = class231.field3135;
            var4 = class384.field5623;
        } else {
            class43.method266(arg2, -27548);
        }
        if (arg2.field1304 < 128 || arg2.field1311 < 128 || class279.field3935 * 128 - 128 <= arg2.field1304 || ((class164.field2287 - 1) * 128) <= arg2.field1311) {
            arg2.field6256 = -1;
            arg2.field6312 = -1;
            arg2.field6331 = 0;
            arg2.field6285 = 0;
            arg2.field1304 = arg2.field6351[0] * 128 + arg2.method786((byte) 70) * 64;
            arg2.field1311 = arg2.field6350[0] * 128 + (arg2.method786((byte) 70) * 64);
            arg2.method2692((byte) 101);
        }
        if (class390.field5715 == arg2 && (arg2.field1304 < 1536 || arg2.field1311 < 1536 || arg2.field1304 >= (class279.field3935 * 128 - 1536) || arg2.field1311 >= class164.field2287 * 128 - 1536)) {
            arg2.field6331 = 0;
            arg2.field6285 = 0;
            arg2.field6256 = -1;
            arg2.field6312 = -1;
            arg2.field1304 = arg2.field6351[0] * 128 + (arg2.method786((byte) 70) * 64);
            arg2.field1311 = arg2.field6350[0] * 128 + (arg2.method786((byte) 70) * 64);
            arg2.method2692((byte) 95);
        }
        int var6 = class301.method1901(6, arg2);
        class157.method1034(var6, -14337, var4, arg2, var5);
        class101.method545(arg2, -1);
    }

    @OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 814)
    public final synchronized void paint(Graphics arg0) {
        field3172++;
        if (class128.field1791 != this || class77.field870) {
            return;
        }
        class162.field2285 = true;
        if (class356.field5221 && (class203.method1299((byte) 5) - class434.field6363) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class356.field5219 && class384.field5628 <= var2.height) {
                class195.field2648 = true;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V", line = 837)
    public final void method1492(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, String arg7) {
        try {
            class128.field1791 = this;
            class223.field3053 = arg2;
            class375.field5479 = 0;
            class38.field389 = arg0;
            class356.field5219 = arg0;
            class222.field3039 = arg3;
            class384.field5628 = arg3;
            class99.field1111 = 0;
            class252.field3406 = new Frame();
            class252.field3406.setTitle("Jagex");
            class252.field3406.setResizable(true);
            class252.field3406.addWindowListener(this);
            class252.field3406.setVisible(true);
            class252.field3406.toFront();
            if (arg6 <= 60) {
                field3168 = 117;
            }
            Insets var9 = class252.field3406.getInsets();
            class252.field3406.setSize(class356.field5219 + var9.left + var9.right, class384.field5628 + var9.top - -var9.bottom);
            class267.field3757 = class323.field4554 = new class378((Applet) null, arg5, arg7, arg1);
            class241 var10 = class323.field4554.method2386(1, this, (byte) -55);
            while (var10.field3268 == 0) {
                class278.method1757(10L, 0);
            }
        } catch (Exception var12) {
            class411.method2578(var12, (String) null, (byte) -68);
        }
        field3180++;
    }

    @OriginalMember(owner = "client!we", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 880)
    public final void windowActivated(WindowEvent arg0) {
        field3175++;
    }

    @OriginalMember(owner = "client!we", name = "start", descriptor = "()V", line = 890)
    public final void start() {
        field3179++;
        if (class128.field1791 == this && !class77.field870) {
            class58.field693 = 0L;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 902)
    public final void method1493(String arg0, int arg1) {
        field3170++;
        if (this.field3157) {
            return;
        }
        if (arg1 >= -62) {
            this.field3164 = false;
        }
        this.field3157 = true;
        System.out.println("error_game_" + arg0);
        try {
            class250.method1569("loggedout", class323.field4554.field5559, 18050);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(B)V", line = 941)
    public static void method1494(byte arg0) {
        field3144 = null;
        if (arg0 > -113) {
            method1485(34, 18, 39, -30, -11, 89, 113, -83, 63);
        }
        field3154 = null;
        field3142 = null;
    }

    @OriginalMember(owner = "client!we", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 954)
    public final URL getDocumentBase() {
        field3162++;
        if (class252.field3406 == null) {
            return class323.field4554 == null || class323.field4554.field5559 == this ? super.getDocumentBase() : class323.field4554.field5559.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public abstract void method1073(byte arg0);

    @OriginalMember(owner = "client!we", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public abstract void method1071(byte arg0);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public abstract void method1080(byte arg0);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public abstract void method1085(int arg0);

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public abstract void method1075(int arg0);
}
