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

@OriginalClass("client!on")
public abstract class class203 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
    private boolean field3003 = false;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Z")
    private boolean field2994 = false;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "Lvk;")
    public static class227 field3015;

    // $FF: synthetic field
    @OriginalMember(owner = "client!on", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field3019;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "Z")
    public static boolean field3021;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
    public static boolean field3022;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "Z")
    public static boolean field3024;

    @OriginalMember(owner = "client!on", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class218.field3258 = false;
        field2981++;
    }

    @OriginalMember(owner = "client!on", name = "run", descriptor = "()V")
    public final void run() {
        field3016++;
        try {
            label114: {
                if (class430.field6025 != null) {
                    String var1 = class430.field6025.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class430.field6009;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1262(-2, "wrongjava");
                            break label114;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class430.field6009 == null || class430.field6009.equals("1.4.2"))) {
                        this.method1262(-2, "wrongjava");
                        break label114;
                    }
                }
                if (class430.field6009 != null && class430.field6009.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class430.field6009.length()) {
                        char var5 = class430.field6009.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class431.field6033 = true;
                    }
                }
                if (class252.field3718.field6021 != null) {
                    Method var6 = class430.field6030;
                    if (var6 != null) {
                        try {
                            var6.invoke(class252.field3718.field6021, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class37.method244((byte) -110);
                class347.method2168((byte) 102);
                this.method1269(107);
                this.method1115(107);
                class100.field1282 = class145.method903(414326756);
                this.method1272(114);
                while (class216.field3249 == 0L || class216.field3249 > class433.method2562(-2039)) {
                    class201.field2963 = class100.field1282.method954(class210.field3193, true);
                    for (int var7 = 0; var7 < class201.field2963; var7++) {
                        this.method1267((byte) 120);
                    }
                    this.method1271(5164);
                    class170.method1054(class252.field3718, class465.field6503, 115);
                }
            }
        } catch (Exception var10) {
            class267.method1641((String) null, var10, (byte) -87);
            this.method1262(-2, "crash");
        }
        this.method1266(true, 0);
    }

    @OriginalMember(owner = "client!on", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3002++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1262(int arg0, String arg1) {
        field3008++;
        if (this.field2994) {
            return;
        }
        this.field2994 = true;
        System.out.println("error_game_" + arg1);
        try {
            class429.method2520(class252.field3718.field6021, (byte) 94, "loggedout");
            if (arg0 != -2) {
                field3017 = 57;
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!on", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3014++;
        if (class239.field3589 == null) {
            return class252.field3718 == null || class252.field3718.field6021 == this ? super.getDocumentBase() : class252.field3718.field6021.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[J[I)V")
    public static final void method1263(int arg0, long[] arg1, int[] arg2) {
        field2993++;
        class449.method2622(arg1, arg0, arg1.length - 1, arg0 ^ 0x3B61, arg2);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
    public static final void method1264(boolean arg0, int arg1) {
        field3018++;
        class489 var2 = class116.method731(-625541408, 5, arg1);
        if (arg0) {
            method1268(87, 111, (class313) null);
        }
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!on", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2990++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public abstract void method1130(int arg0);

    @OriginalMember(owner = "client!on", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3000++;
    }

    @OriginalMember(owner = "client!on", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2984++;
        if (class65.field838 != this || class385.field5474) {
            return;
        }
        class328.field4746 = true;
        if (class431.field6033 && class433.method2562(-2039) - class61.field811 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class284.field4156 <= var2.width && var2.height >= class199.field2901) {
                class327.field4738 = true;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "stop", descriptor = "()V")
    public final void stop() {
        field2986++;
        if (class65.field838 == this && !class385.field5474) {
            class216.field3249 = class433.method2562(-2039) + 4000L;
        }
    }

    @OriginalMember(owner = "client!on", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2995++;
        this.destroy();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILjava/lang/String;IZIII)V")
    public final void method1265(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3009++;
        try {
            class377.field5436 = 0;
            class144.field1900 = arg0;
            class284.field4156 = arg0;
            class244.field3634 = arg3;
            class199.field2901 = arg3;
            class475.field6666 = arg7;
            class65.field838 = this;
            class236.field3552 = arg5;
            class239.field3589 = new Frame();
            class239.field3589.setTitle("Jagex");
            class239.field3589.setResizable(true);
            class239.field3589.addWindowListener(this);
            class239.field3589.setVisible(true);
            class239.field3589.toFront();
            Insets var9 = class239.field3589.getInsets();
            class239.field3589.setSize(class284.field4156 + var9.left + var9.right, class199.field2901 - -var9.bottom + var9.top);
            class116.field1480 = class252.field3718 = new class430((Applet) null, arg1, arg2, arg6);
            class366 var10 = class252.field3718.method2543(this, 1, (byte) -125);
            while (var10.field5253 == 0) {
                class111.method713(-110, 10L);
            }
        } catch (Exception var12) {
            class267.method1641((String) null, var12, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V")
    private final void method1266(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.windowClosing((WindowEvent) null);
        }
        field2996++;
        synchronized (this) {
            if (class385.field5474) {
                return;
            }
            class385.field5474 = true;
        }
        if (class252.field3718.field6021 != null) {
            class252.field3718.field6021.destroy();
        }
        try {
            this.method1131(127);
        } catch (Exception var11) {
        }
        if (this.field3003) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3003 = false;
        }
        class366 var4 = class252.field3718.method2540(class65.field838.getClass(), 11);
        while (var4.field5253 == 0) {
            class111.method713(59, 100L);
        }
        if (class465.field6503 != null) {
            try {
                class465.field6503.removeFocusListener(this);
                class465.field6503.getParent().remove(class465.field6503);
            } catch (Exception var9) {
            }
        }
        if (class252.field3718 != null) {
            try {
                class252.field3718.method2532((byte) 127);
            } catch (Exception var8) {
            }
        }
        this.method1130(-99);
        if (class239.field3589 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public abstract void method1115(int arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    private final void method1267(byte arg0) {
        field3001++;
        long var2 = class433.method2562(-2039);
        long var4 = class141.field1882[class251.field3704];
        class141.field1882[class251.field3704] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class251.field3704 = class251.field3704 + 1 & 0x1F;
        if (arg0 >= 77) {
            synchronized (this) {
                class452.field6301 = class218.field3258;
            }
            this.method1113((byte) -2);
        }
    }

    @OriginalMember(owner = "client!on", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2982++;
        if (class65.field838 == this && !class385.field5474) {
            class216.field3249 = class433.method2562(-2039);
            class111.method713(-95, 5000L);
            class116.field1480 = null;
            this.method1266(false, 0);
        }
    }

    @OriginalMember(owner = "client!on", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2985++;
    }

    @OriginalMember(owner = "client!on", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!on", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2987++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILnp;)Z")
    public static final boolean method1268(int arg0, int arg1, class313 arg2) {
        field2989++;
        int var3 = (class58.field758 - 104) / 2;
        int var4 = (class287.field4181 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class212.method1376(arg1, var51, true, var52, var6)) {
                        int var53 = var52;
                        if (class28.method207(var6, -25548, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class451.method2630(var51, var53, arg0 + 16777306, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class26.field346 = arg2.method651(var7, 0, 512, 512, 512);
        class459.method2684(false);
        int var9 = arg0 | -(-((int) (Math.random() * 20.0D)) - (((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16)) - 238) - 10;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class327.field4736][class327.field4736];
        for (int var13 = var3; var13 < var3 + 104; var13 += class327.field4736) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class327.field4736) {
                arg2.method617(0, 0, class327.field4736 * 4, class327.field4736 * 4);
                arg2.method678(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class327.field4736; var44++) {
                        for (int var50 = 0; var50 < class327.field4736; var50++) {
                            var12[var44][var50] = class212.method1376(arg1, var36 + var50, true, var37, var13 + var44);
                        }
                    }
                    class178.field2556[var37].method1213(0, 0, 1024, var13, var36, class327.field4736 + var13, class327.field4736 + var36, var12);
                    if (!class449.field6207) {
                        for (int var45 = -4; var45 < class327.field4736; var45++) {
                            for (int var46 = -4; var46 < class327.field4736; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class212.method1376(arg1, var48, true, var37, var47)) {
                                    int var49 = var37;
                                    if (class28.method207(var47, arg0 ^ 0xFF9C34, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class187.method1162(var45 * 4, var9, var48, var49, var10, var47, (class327.field4736 - var46) * 4 - 4, arg2, (byte) 59);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class449.field6207) {
                    class441 var38 = class422.field5918[arg1];
                    for (int var39 = 0; var39 < class327.field4736; var39++) {
                        for (int var40 = 0; var40 < class327.field4736; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6121[var41 - var38.field6099][var42 - var38.field6101];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method1941(4, (class327.field4736 - var40) * 4 - 4, 1, 4, var39 * 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method1931(-1713569622, 4, (class327.field4736 - var40) * 4 - 4, var39 * 4, 96);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method1934(1, 4, (class327.field4736 - var40) * 4 - 4, var39 * 4 + 3, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method1931(-1713569622, 4, (class327.field4736 - var40) * 4 - 1, var39 * 4, arg0 ^ 0xFF000064);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method1934(1, 4, (class327.field4736 - var40) * 4 - 4, var39 * 4, -1713569622);
                            }
                        }
                    }
                }
                arg2.method650(0, 0, class327.field4736 * 4, class327.field4736 * 4, var11, 2);
                class26.field346.method138((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 - class327.field4736 * 4, class327.field4736 * 4, class327.field4736 * 4, 0, 0);
            }
        }
        arg2.method691();
        arg2.method678(-16777215);
        class453.method2661((byte) 127);
        class318.field4616 = 0;
        class44.field636.method2838((byte) 26);
        if (!class449.field6207) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class212.method1376(arg1, var20, true, var21, var14)) {
                            class106 var22 = (class106) class149.method941(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class106) class231.method1470(var21, var14, var20, field3019 == null ? (field3019 = method1275("gg")) : field3019);
                            }
                            if (var22 == null) {
                                var22 = (class106) class50.method320(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class106) class271.method1658(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class453 var23 = class156.field2325.method808(var22.method106(arg0 + 16789397), 0);
                                if (!var23.field6363 || class39.field514) {
                                    int var24 = var23.field6384;
                                    if (var23.field6306 != null) {
                                        for (int var25 = 0; var25 < var23.field6306.length; var25++) {
                                            if (var23.field6306[var25] != -1) {
                                                class453 var26 = class156.field2325.method808(var23.field6306[var25], arg0 + 16777216);
                                                if (var26.field6384 >= 0) {
                                                    var24 = var26.field6384;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class19 var28 = class251.field3705.method490(36, var24);
                                            if (var28 != null && var28.field232) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class422.field5918[var21].field6121;
                                            int var32 = class422.field5918[var21].field6099;
                                            int var33 = class422.field5918[var21].field6101;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 103) && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 103) && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class140.field1857[class318.field4616] = var23.field6343;
                                        class273.field3977[class318.field4616] = var29;
                                        class325.field4680[class318.field4616] = var30;
                                        class318.field4616++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class269.field3929 != null) {
                class66.field842.field2925 = 1;
                class251.field3705.method487(27843, 1024, 64);
                for (int var15 = 0; var15 < class269.field3929.field517; var15++) {
                    int var16 = class269.field3929.field513[var15];
                    if ((var16 >> 28) == class492.field6935.field4319) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class240.field3602;
                        int var18 = (var16 & 0x3FFF) - class360.field5180;
                        if (var17 >= 0 && var17 < class58.field758 && var18 >= 0 && var18 < class287.field4181) {
                            class44.field636.method2845(new class324(var15), (byte) 37);
                        } else {
                            class19 var19 = class251.field3705.method490(arg0 ^ 0xFF000024, class269.field3929.field515[var15]);
                            if (var19.field235 != null && (var19.field264 + var17) >= 0 && class58.field758 > var19.field242 + var17 && var19.field241 + var18 >= 0 && class287.field4181 > var18 + var19.field263) {
                                class44.field636.method2845(new class324(var15), (byte) 37);
                            }
                        }
                    }
                }
                class251.field3705.method487(27843, 128, 64);
                class66.field842.field2925 = 2;
                class66.field842.method1231(30);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
    public abstract void method1131(int arg0);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
    public final synchronized void method1269(int arg0) {
        field2983++;
        if (class465.field6503 != null) {
            class465.field6503.removeFocusListener(this);
            class465.field6503.getParent().remove(class465.field6503);
        }
        Container var2;
        if (class86.field1045 != null) {
            var2 = class86.field1045;
        } else if (class239.field3589 == null) {
            var2 = class252.field3718.field6021;
        } else {
            var2 = class239.field3589;
        }
        var2.setLayout((LayoutManager) null);
        class465.field6503 = new class431(this);
        var2.add(class465.field6503);
        class465.field6503.setSize(class144.field1900, class244.field3634);
        class465.field6503.setVisible(true);
        if (class239.field3589 == var2) {
            Insets var3 = class239.field3589.getInsets();
            class465.field6503.setLocation(class377.field5436 + var3.left, class236.field3552 + var3.top);
        } else {
            class465.field6503.setLocation(class377.field5436, class236.field3552);
        }
        class465.field6503.addFocusListener(this);
        class465.field6503.requestFocus();
        class452.field6301 = true;
        class218.field3258 = true;
        if (arg0 > 78) {
            class328.field4746 = true;
            class327.field4738 = false;
            class61.field811 = class433.method2562(-2039);
        }
    }

    @OriginalMember(owner = "client!on", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2999++;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)Z")
    public final boolean method1270(byte arg0) {
        field2991++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != 75) {
                this.field3003 = true;
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
                this.method1262(-2, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
    private final void method1271(int arg0) {
        field3005++;
        long var2 = class433.method2562(arg0 - 7203);
        long var4 = class377.field5433[class265.field3885];
        class377.field5433[class265.field3885] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class393.field5584 = ((var6 >> 1) + 32000) / var6;
        }
        class265.field3885 = class265.field3885 + 1 & 0x1F;
        if ((class70.field881++) > 50) {
            class70.field881 -= 50;
            class328.field4746 = true;
            class465.field6503.setSize(class144.field1900, class244.field3634);
            class465.field6503.setVisible(true);
            if (class239.field3589 != null && class86.field1045 == null) {
                Insets var7 = class239.field3589.getInsets();
                class465.field6503.setLocation(class377.field5436 + var7.left, class236.field3552 + var7.top);
            } else {
                class465.field6503.setLocation(class377.field5436, class236.field3552);
            }
        }
        if (arg0 != 5164) {
            field3015 = null;
        }
        this.method1116(arg0 - 26557);
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
    public final void method1272(int arg0) {
        field2997++;
        int var2 = 14 % ((69 - arg0) / 37);
        if (this.field3003) {
            return;
        }
        try {
            class366 var3 = class252.field3718.method2535((byte) -97, class65.field838.getClass());
            while (var3.field5253 == 0) {
                class111.method713(-90, 100L);
            }
            if (var3.field5255 != null) {
                throw (Throwable) var3.field5255;
            }
            jagmisc.init();
            this.field3003 = true;
            class100.field1282 = class145.method903(414326756);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!on", name = "start", descriptor = "()V")
    public final void start() {
        field3011++;
        if (class65.field838 == this && !class385.field5474) {
            class216.field3249 = 0L;
        }
    }

    @OriginalMember(owner = "client!on", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class218.field3258 = true;
        field3012++;
        class328.field4746 = true;
    }

    @OriginalMember(owner = "client!on", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2992++;
        if (class239.field3589 == null) {
            return class252.field3718 == null || class252.field3718.field6021 == this ? super.getParameter(arg0) : class252.field3718.field6021.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2988++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
    public final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3004++;
        try {
            if (class65.field838 == null) {
                class244.field3634 = arg1;
                class199.field2901 = arg1;
                class377.field5436 = 0;
                class236.field3552 = 0;
                int var6 = 114 / ((arg3 - 46) / 32);
                class65.field838 = this;
                class144.field1900 = arg4;
                class284.field4156 = arg4;
                class475.field6666 = arg0;
                if (class252.field3718 == null) {
                    class116.field1480 = class252.field3718 = new class430(this, arg2, (String) null, 0);
                }
                class366 var7 = class252.field3718.method2543(this, 1, (byte) 119);
                while (var7.field5253 == 0) {
                    class111.method713(-127, 10L);
                }
            } else {
                class320.field4642++;
                if (class320.field4642 >= 3) {
                    this.method1262(-2, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class267.method1641((String) null, var9, (byte) -87);
            this.method1262(-2, "crash");
        }
    }

    @OriginalMember(owner = "client!on", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2998++;
        if (class239.field3589 == null) {
            return class252.field3718 == null || class252.field3718.field6021 == this ? super.getCodeBase() : class252.field3718.field6021.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V")
    public abstract void method1113(byte arg0);

    @OriginalMember(owner = "client!on", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3010++;
        if (class239.field3589 == null) {
            return class252.field3718 == null || class252.field3718.field6021 == this ? super.getAppletContext() : class252.field3718.field6021.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "providesignlink", descriptor = "(Lmj;)V")
    public static final void providesignlink(class430 arg0) {
        field3007++;
        class252.field3718 = arg0;
        class116.field1480 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(B)V")
    public static void method1274(byte arg0) {
        if (arg0 <= 17) {
            method1264(true, 48);
        }
        field3015 = null;
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
    public abstract void method1116(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1275(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class326("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field3017 = -1;
    }
}
