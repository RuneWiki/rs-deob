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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class134 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    private boolean field3259 = false;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lpd;")
    private static class94 field3280 = class28.method249(-54, "Trade)4compete");

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lpd;")
    private static class94 field3275 = class28.method249(-114, "Loaded fonts");

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lpd;")
    public static class94 field3283 = field3280;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[I")
    public static int[] field3273 = new int[500];

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Lpd;")
    public static class94 field3292 = class28.method249(-72, "Menge eingeben:");

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lpd;")
    public static class94 field3268 = field3275;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lvc;")
    public static class128 field3269 = new class128(64);

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Lpd;")
    public static class94 field3299 = class28.method249(-119, " hat sich eingeloggt)3");

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public static int field3300 = 3353893;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Lpd;")
    public static class94 field3301 = class28.method249(103, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Lvc;")
    public static class128 field3302 = new class128(64);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Lla;")
    public static class66 field3304;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Z")
    public static boolean field3306;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lad;")
    public static class5[] field3264;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "[[B")
    public static byte[][] field3305;

    @OriginalMember(owner = "client!wc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 15)
    public final void windowDeiconified(WindowEvent arg0) {
        field3266++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 29)
    private final void method1054(byte arg0) {
        field3294++;
        long var2 = class115.method856(true);
        long var4 = class133.field3250[class89.field2286];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class133.field3250[class89.field2286] = var2;
        if (arg0 <= 3) {
            field3268 = null;
        }
        class89.field2286 = class89.field2286 + 1 & 0x1F;
        synchronized (this) {
            class28.field809 = class33.field912;
        }
        this.method134(0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Z", line = 63)
    public final boolean method1055(int arg0) {
        if (arg0 != 64) {
            return true;
        }
        field3288++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
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
                this.method1059((byte) 80, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 95)
    public final URL getDocumentBase() {
        field3284++;
        if (class9.field259 == null) {
            return class112.field2832 == null || class112.field2832.field277 == this ? super.getDocumentBase() : class112.field2832.field277.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 114)
    public final void windowClosed(WindowEvent arg0) {
        field3260++;
    }

    @OriginalMember(owner = "client!wc", name = "stop", descriptor = "()V", line = 123)
    public final void stop() {
        field3286++;
        if (class110.field2717 == this && !class51.field1264) {
            class62.field1517 = class115.method856(true) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/net/InetAddress;II)V", line = 140)
    public final void method1056(String arg0, int arg1, int arg2, int arg3, int arg4, InetAddress arg5, int arg6, int arg7) {
        try {
            class14.field367 = arg1;
            class110.field2717 = this;
            class36.field948 = arg6;
            if (arg3 < 31) {
                field3303 = -22;
            }
            class8.field202 = arg7;
            class9.field259 = new Frame();
            class9.field259.setTitle("Jagex");
            class9.field259.setResizable(false);
            class9.field259.addWindowListener(this);
            class9.field259.setVisible(true);
            class9.field259.toFront();
            Insets var9 = class9.field259.getInsets();
            class9.field259.setSize(var9.left + arg6 + var9.right, arg1 - (-var9.top + -var9.bottom));
            class94.field2435 = class112.field2832 = new class11(true, null, arg5, arg4, arg0, arg2);
            class112.field2832.method74(1, this, (byte) 2);
        } catch (Exception var11) {
            class81.method607(null, var11, (byte) 44);
        }
        field3267++;
    }

    @OriginalMember(owner = "client!wc", name = "providesignlink", descriptor = "(Lbd;)V", line = 179)
    public static final void providesignlink(class11 arg0) {
        field3293++;
        class112.field2832 = arg0;
        class94.field2435 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 187)
    public final void windowOpened(WindowEvent arg0) {
        field3285++;
    }

    @OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 195)
    public final void focusLost(FocusEvent arg0) {
        field3258++;
        class33.field912 = false;
    }

    @OriginalMember(owner = "client!wc", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 203)
    public final URL getCodeBase() {
        field3281++;
        if (class9.field259 == null) {
            return class112.field2832 == null || class112.field2832.field277 == this ? super.getCodeBase() : class112.field2832.field277.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)V", line = 218)
    public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3263++;
        try {
            if (class110.field2717 == null) {
                class36.field948 = arg0;
                class8.field202 = arg4;
                class110.field2717 = this;
                class14.field367 = arg2;
                if (arg1 != -14778) {
                    this.destroy();
                }
                if (class112.field2832 == null) {
                    class94.field2435 = class112.field2832 = new class11(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg3, null, 0);
                }
                class112.field2832.method74(1, this, (byte) 2);
            } else {
                this.method1059((byte) 41, "alreadyloaded");
            }
        } catch (Exception var7) {
            class81.method607(null, var7, (byte) 108);
            this.method1059((byte) 114, "crash");
        }
    }

    @OriginalMember(owner = "client!wc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 256)
    public final AppletContext getAppletContext() {
        field3298++;
        if (class9.field259 == null) {
            return class112.field2832 == null || class112.field2832.field277 == this ? super.getAppletContext() : class112.field2832.field277.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V", line = 271)
    public static final void method1058(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class41.field1049[arg3][arg2 + var4][arg1 + var7] = 0;
            }
        }
        if (arg0 != 12404) {
            field3269 = null;
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class41.field1049[arg3][arg2][arg1 + var5] = class41.field1049[arg3][arg2 - 1][arg1 + var5];
            }
        }
        field3276++;
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class41.field1049[arg3][arg2 + var6][arg1] = class41.field1049[arg3][arg2 + var6][arg1 - 1];
            }
        }
        if (arg2 > 0 && class41.field1049[arg3][arg2 - 1][arg1] != 0) {
            class41.field1049[arg3][arg2][arg1] = class41.field1049[arg3][arg2 - 1][arg1];
        } else if (arg1 > 0 && class41.field1049[arg3][arg2][arg1 - 1] != 0) {
            class41.field1049[arg3][arg2][arg1] = class41.field1049[arg3][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && class41.field1049[arg3][arg2 - 1][arg1 - 1] != 0) {
            class41.field1049[arg3][arg2][arg1] = class41.field1049[arg3][arg2 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!wc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 333)
    public final void update(Graphics arg0) {
        field3271++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "start", descriptor = "()V", line = 342)
    public final void start() {
        field3282++;
        if (class110.field2717 == this && !class51.field1264) {
            class62.field1517 = 0L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;)V", line = 354)
    public final void method1059(byte arg0, String arg1) {
        if (arg0 <= 26) {
            return;
        }
        field3291++;
        if (this.field3259) {
            return;
        }
        this.field3259 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 380)
    public final void windowClosing(WindowEvent arg0) {
        field3287++;
        this.destroy();
    }

    @OriginalMember(owner = "client!wc", name = "destroy", descriptor = "()V", line = 395)
    public final void destroy() {
        field3295++;
        if (class110.field2717 == this && !class51.field1264) {
            class62.field1517 = class115.method856(true);
            class127.method1004(5000L, 111);
            class94.field2435 = null;
            this.method1060(-117);
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 409)
    private final synchronized void method1060(int arg0) {
        field3261++;
        if (class51.field1264) {
            return;
        }
        class51.field1264 = true;
        try {
            class128.field3218.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            if (arg0 >= -115) {
                field3283 = null;
            }
            this.method141(-12197);
        } catch (Exception var4) {
        }
        if (class9.field259 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class112.field2832 != null) {
            try {
                class112.field2832.method72(true);
            } catch (Exception var2) {
            }
        }
        this.method136(123);
    }

    @OriginalMember(owner = "client!wc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 456)
    public final void windowIconified(WindowEvent arg0) {
        field3278++;
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 465)
    public final synchronized void method1061(int arg0) {
        field3289++;
        Container var2;
        if (class9.field259 == null) {
            var2 = class112.field2832.field277;
        } else {
            var2 = class9.field259;
        }
        if (class128.field3218 != null) {
            class128.field3218.removeFocusListener(this);
            var2.remove(class128.field3218);
        }
        class128.field3218 = new class21(this);
        var2.add(class128.field3218);
        class128.field3218.setSize(class36.field948, class14.field367);
        if (arg0 > -29) {
            field3283 = null;
        }
        class128.field3218.setVisible(true);
        if (class9.field259 == null) {
            class128.field3218.setLocation(0, 0);
        } else {
            Insets var3 = class9.field259.getInsets();
            class128.field3218.setLocation(var3.left, var3.top);
        }
        class128.field3218.addFocusListener(this);
        class128.field3218.requestFocus();
        class9.field249 = true;
        class88.field2253 = false;
        class126.field3172 = class115.method856(true);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V", line = 508)
    public static void method1062(byte arg0) {
        field3304 = null;
        field3302 = null;
        field3280 = null;
        field3264 = null;
        field3305 = null;
        field3292 = null;
        if (arg0 > -127) {
            field3275 = null;
        }
        field3275 = null;
        field3283 = null;
        field3268 = null;
        field3301 = null;
        field3299 = null;
        field3269 = null;
        field3273 = null;
    }

    @OriginalMember(owner = "client!wc", name = "run", descriptor = "()V", line = 531)
    public final void run() {
        field3290++;
        try {
            if (class11.field282 != null) {
                String var1 = class11.field282.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class11.field274;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1059((byte) 110, "wrongjava");
                        return;
                    }
                    class101.field2555 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class11.field274 == null || class11.field274.equals("1.4.2"))) {
                    this.method1059((byte) 39, "wrongjava");
                    return;
                }
            }
            if (class112.field2832.field277 != null) {
                Method var3 = class11.field287;
                if (var3 != null) {
                    try {
                        var3.invoke(class112.field2832.field277, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1061(-50);
            class123.field3117 = class2.method10(class128.field3218, (byte) 117, class14.field367, class36.field948);
            this.method143((byte) 113);
            class120.field2987 = class39.method297(true);
            class120.field2987.method225((byte) 119);
            while (class62.field1517 == 0L || class62.field1517 > class115.method856(true)) {
                class90.field2330 = class120.field2987.method228(class101.field2555, class88.field2256, 0);
                for (int var4 = 0; var4 < class90.field2330; var4++) {
                    this.method1054((byte) 69);
                }
                this.method1063((byte) 55);
            }
        } catch (Exception var7) {
            class81.method607(null, var7, (byte) 79);
            this.method1059((byte) 99, "crash");
        }
        this.method1060(-126);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V", line = 612)
    private final void method1063(byte arg0) {
        field3274++;
        long var2 = class115.method856(true);
        long var4 = class63.field1554[class66.field1633];
        class63.field1554[class66.field1633] = var2;
        class66.field1633 = class66.field1633 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class51.field1273 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != 55) {
            field3303 = 34;
        }
        if (class86.field2191++ > 50) {
            class86.field2191 -= 50;
            class9.field249 = true;
            class128.field3218.setSize(class36.field948, class14.field367);
            class128.field3218.setVisible(true);
            if (class9.field259 == null) {
                class128.field3218.setLocation(0, 0);
            } else {
                Insets var7 = class9.field259.getInsets();
                class128.field3218.setLocation(var7.left, var7.top);
            }
        }
        this.method142(-21419);
    }

    @OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 659)
    public final void focusGained(FocusEvent arg0) {
        field3296++;
        class33.field912 = true;
        class9.field249 = true;
    }

    @OriginalMember(owner = "client!wc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 679)
    public final String getParameter(String arg0) {
        field3279++;
        if (class9.field259 == null) {
            return class112.field2832 == null || class112.field2832.field277 == this ? super.getParameter(arg0) : class112.field2832.field277.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 694)
    public final void windowActivated(WindowEvent arg0) {
        field3272++;
    }

    @OriginalMember(owner = "client!wc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 712)
    public final synchronized void paint(Graphics arg0) {
        field3265++;
        if (class110.field2717 != this || class51.field1264) {
            return;
        }
        class9.field249 = true;
        if (class11.field274 != null && class11.field274.startsWith("1.5") && class115.method856(true) - class126.field3172 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class36.field948 <= var2.width && var2.height >= class14.field367) {
                class88.field2253 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 747)
    public final void windowDeactivated(WindowEvent arg0) {
        field3277++;
    }

    @OriginalMember(owner = "client!wc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public abstract void method142(int arg0);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public abstract void method143(byte arg0);

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public abstract void method141(int arg0);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public abstract void method134(int arg0);
}
