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

@OriginalClass("client!gi")
public abstract class class183 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Z")
    private boolean field3274 = false;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lvf;")
    public static class265 field3248 = class87.method582(-46, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lvf;")
    public static class265 field3265 = class87.method582(-46, "d-Broulement:");

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field3286 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Ldg;")
    public static class276 field3246 = new class276(5);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Z")
    public static boolean field3287;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Z")
    public static boolean field3288;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[[[Lac;")
    public static class137[][][] field3255;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    private final void method1221(boolean arg0) {
        if (arg0) {
            field3254 = 86;
        }
        long var2 = class136.method950(8954);
        field3273++;
        long var4 = class11.field370[class66.field1271];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class11.field370[class66.field1271] = var2;
        class66.field1271 = class66.field1271 + 1 & 0x1F;
        synchronized (this) {
            class87.field1589 = class19.field504;
        }
        this.method1227(128);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZIII)V")
    public final void method1222(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3277++;
        try {
            if (!arg1) {
                if (class19.field509 == null) {
                    class26.field706 = arg3;
                    class78.field1489 = arg3;
                    class277.field4889 = arg2;
                    class193.field3468 = 0;
                    class50.field1053 = arg0;
                    class145.field2700 = arg0;
                    class19.field509 = this;
                    class147.field2755 = 0;
                    String var6 = this.getParameter("openwinjs");
                    boolean var10000;
                    if (var6 != null && var6.equals("1")) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                    if (class281.field4957 == null) {
                        class187.field3374 = class281.field4957 = new class226(this, arg4, (String) null, 0);
                    }
                    class114 var7 = class281.field4957.method1531(1, -101, this);
                    while (var7.field1996 == 0) {
                        class19.method136(1, 10L);
                    }
                } else {
                    class72.field1377++;
                    if (class72.field1377 >= 3) {
                        this.method1236(127, "alreadyloaded");
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    }
                }
            }
        } catch (Exception var9) {
            class4.method28(75, var9, (String) null);
            this.method1236(101, "crash");
        }
    }

    @OriginalMember(owner = "client!gi", name = "start", descriptor = "()V")
    public final void start() {
        field3253++;
        if (class19.field509 == this && !class49.field1043) {
            class10.field337 = 0L;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 86 / ((arg1 + 15) / 47);
        if (arg4 == arg7 && arg0 == arg3 && arg5 == arg9 && arg2 == arg8) {
            class202.method1384(arg4, arg5, 45443148, arg6, arg0, arg2);
        } else {
            int var11 = arg4 * 3;
            int var12 = arg0 * 3;
            int var13 = arg4;
            int var14 = arg0;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg8 * 3;
            int var18 = arg9 * 3;
            int var19 = arg5 + var16 - var18 - arg4;
            int var20 = arg2 - (arg0 + var17 - var15);
            int var21 = var18 + var11 - var16 - var16;
            int var22 = var16 - var11;
            int var23 = var12 + var17 - var15 - var15;
            int var24 = var15 - var12;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var21 * var26;
                int var28 = var23 * var26;
                int var29 = var25 * var26 >> 12;
                int var30 = var22 * var25;
                int var31 = var20 * var29;
                int var32 = var24 * var25;
                int var33 = var19 * var29;
                int var34 = (var33 + var30 + var27 >> 12) + arg4;
                int var35 = (var31 + var28 + var32 >> 12) + arg0;
                class202.method1384(var13, var34, 45443148, arg6, var14, var35);
                var13 = var34;
                var14 = var35;
            }
        }
        field3263++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public abstract void method1224(boolean arg0);

    @OriginalMember(owner = "client!gi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3266++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V")
    public abstract void method1225(boolean arg0);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field3248 = null;
        if (arg0 != 2) {
            field3265 = null;
        }
        field3255 = null;
        field3265 = null;
        field3246 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public abstract void method1227(int arg0);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
    private final void method1228(int arg0, boolean arg1) {
        field3272++;
        synchronized (this) {
            if (class49.field1043) {
                return;
            }
            class49.field1043 = true;
        }
        if (class281.field4957.field4024 != null) {
            class281.field4957.field4024.destroy();
        }
        try {
            this.method1225(true);
        } catch (Exception var9) {
        }
        if (arg0 != 0) {
            return;
        }
        if (class125.field2241 != null) {
            try {
                class125.field2241.removeFocusListener(this);
                class125.field2241.getParent().remove(class125.field2241);
            } catch (Exception var8) {
            }
        }
        if (class281.field4957 != null) {
            try {
                class281.field4957.method1535(121);
            } catch (Exception var7) {
            }
        }
        this.method1231(-1);
        if (class49.field1044 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!gi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3282++;
    }

    @OriginalMember(owner = "client!gi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3283++;
        if (class49.field1044 == null) {
            return class281.field4957 == null || class281.field4957.field4024 == this ? super.getCodeBase() : class281.field4957.field4024.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3268++;
        if (class49.field1044 == null) {
            return class281.field4957 == null || class281.field4957.field4024 == this ? super.getDocumentBase() : class281.field4957.field4024.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3269++;
    }

    @OriginalMember(owner = "client!gi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class19.field504 = false;
        field3285++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZLjava/lang/String;III)V")
    public final void method1229(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6, int arg7) {
        field3256++;
        if (arg0 != 10) {
            return;
        }
        try {
            class19.field509 = this;
            class277.field4889 = arg2;
            class147.field2755 = 0;
            class193.field3468 = 0;
            class50.field1053 = arg1;
            class145.field2700 = arg1;
            class26.field706 = arg5;
            class78.field1489 = arg5;
            class49.field1044 = new Frame();
            class49.field1044.setTitle("Jagex");
            class49.field1044.setResizable(true);
            class49.field1044.addWindowListener(this);
            class49.field1044.setVisible(true);
            class49.field1044.toFront();
            Insets var9 = class49.field1044.getInsets();
            class49.field1044.setSize(var9.left + var9.right + class78.field1489, class145.field2700 + var9.top - -var9.bottom);
            class187.field3374 = class281.field4957 = new class226((Applet) null, arg7, arg4, arg6);
            class114 var10 = class281.field4957.method1531(1, -126, this);
            while (var10.field1996 == 0) {
                class19.method136(1, 10L);
            }
        } catch (Exception var12) {
            class4.method28(85, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Z")
    public final boolean method1230(int arg0) {
        field3271++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
                this.method1236(97, "invalidhost");
                return arg0 == -58 ? false : false;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3278++;
        if (class19.field509 == this && !class49.field1043) {
            class10.field337 = class136.method950(8954);
            class19.method136(1, 5000L);
            class187.field3374 = null;
            this.method1228(0, false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    public abstract void method1231(int arg0);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lba;I)V")
    public static final void method1232(class140 arg0, int arg1) {
        field3250++;
        if (arg0.field2553 == 0) {
            return;
        }
        if (arg0.field2584 != -1 && arg0.field2584 < 32768) {
            class23 var2 = class4.field67[arg0.field2584];
            if (var2 != null) {
                int var3 = arg0.field2564 - var2.field2564;
                int var4 = arg0.field2600 - var2.field2600;
                if (var4 != 0 || var3 != 0) {
                    arg0.field2580 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2584 >= 32768) {
            int var5 = arg0.field2584 - 32768;
            if (class45.field1012 == var5) {
                var5 = 2047;
            }
            class122 var6 = class209.field3766[var5];
            if (var6 != null) {
                int var7 = arg0.field2600 - var6.field2600;
                int var8 = arg0.field2564 - var6.field2564;
                if (var7 != 0 || var8 != 0) {
                    arg0.field2580 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        int var9 = 70 % ((71 - arg1) / 53);
        if ((arg0.field2604 != 0 || arg0.field2586 != 0) && (arg0.field2551 == 0 || arg0.field2599 > 0)) {
            int var10 = arg0.field2564 - ((arg0.field2586 - class231.field4073 - class231.field4073) * 64);
            int var11 = arg0.field2600 - ((arg0.field2604 - class64.field1248 - class64.field1248) * 64);
            if (var11 != 0 || var10 != 0) {
                arg0.field2580 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2586 = 0;
            arg0.field2604 = 0;
        }
        int var12 = arg0.field2580 - arg0.field2563 & 0x7FF;
        if (var12 == 0) {
            arg0.field2573 = 0;
            return;
        }
        arg0.field2573++;
        if (var12 <= 1024) {
            arg0.field2563 += arg0.field2553;
            boolean var13 = true;
            if (arg0.field2553 > var12 || (2048 - arg0.field2553) < var12) {
                var13 = false;
                arg0.field2563 = arg0.field2580;
            }
            if (arg0.field2601 == arg0.field2582 && (arg0.field2573 > 25 || var13)) {
                if (arg0.field2606 == -1) {
                    arg0.field2582 = arg0.field2562;
                } else {
                    arg0.field2582 = arg0.field2606;
                }
            }
        } else {
            boolean var14 = true;
            arg0.field2563 -= arg0.field2553;
            if (arg0.field2553 > var12 || 2048 - arg0.field2553 < var12) {
                arg0.field2563 = arg0.field2580;
                var14 = false;
            }
            if (arg0.field2601 == arg0.field2582 && (arg0.field2573 > 25 || var14)) {
                if (arg0.field2577 == -1) {
                    arg0.field2582 = arg0.field2562;
                } else {
                    arg0.field2582 = arg0.field2577;
                }
            }
        }
        arg0.field2563 &= 0x7FF;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILvf;Z)V")
    public static final void method1233(int arg0, class265 arg1, boolean arg2) {
        class265 var3 = arg1.method1804(arg0 ^ 0xFFFFFFBD);
        short[] var4 = new short[16];
        int var5 = 0;
        field3267++;
        for (int var6 = arg0; var6 < class97.field1718; var6++) {
            class261 var9 = class54.method418(var6, arg0);
            if ((!arg2 || var9.field4563) && var9.field4505 == -1 && var9.field4518 == -1 && var9.field4492 == 0 && var9.field4548.method1804(-49).method1792(0, var3) != -1) {
                if (var5 >= 250) {
                    class127.field2276 = null;
                    class120.field2110 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class242.field4219 = 0;
        class120.field2110 = var5;
        class265[] var7 = new class265[class120.field2110];
        class127.field2276 = var4;
        for (int var8 = 0; var8 < class120.field2110; var8++) {
            var7[var8] = class54.method418(var4[var8], 0).field4548;
        }
        class200.method1377(-118, class127.field2276, var7);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public final synchronized void method1234(int arg0) {
        if (class125.field2241 != null) {
            class125.field2241.removeFocusListener(this);
            class125.field2241.getParent().remove(class125.field2241);
        }
        Container var2;
        if (class141.field2621 != null) {
            var2 = class141.field2621;
        } else if (class49.field1044 == null) {
            var2 = class281.field4957.field4024;
        } else {
            var2 = class49.field1044;
        }
        field3262++;
        var2.setLayout((LayoutManager) null);
        class125.field2241 = new class227(this);
        var2.add(class125.field2241);
        class125.field2241.setSize(class26.field706, class50.field1053);
        class125.field2241.setVisible(true);
        if (class49.field1044 == var2) {
            Insets var3 = class49.field1044.getInsets();
            class125.field2241.setLocation(class147.field2755 + var3.left, class193.field3468 + var3.top);
        } else {
            class125.field2241.setLocation(class147.field2755, class193.field3468);
        }
        class125.field2241.addFocusListener(this);
        class125.field2241.requestFocus();
        class19.field504 = true;
        class63.field1239 = true;
        class44.field969 = false;
        class87.field1589 = true;
        if (arg0 != 10864) {
            this.getParameter((String) null);
        }
        class239.field4181 = class136.method950(8954);
    }

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
    public final void run() {
        field3280++;
        try {
            if (class226.field4020 != null) {
                String var1 = class226.field4020.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class226.field4015;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1236(110, "wrongjava");
                        return;
                    }
                    class135.field2442 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class226.field4015 == null || class226.field4015.equals("1.4.2"))) {
                    this.method1236(103, "wrongjava");
                    return;
                }
            }
            if (class226.field4015 != null && class226.field4015.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class226.field4015.length() > var3) {
                    char var5 = class226.field4015.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class11.field378 = true;
                }
            }
            if (class281.field4957.field4024 != null) {
                Method var6 = class226.field4026;
                if (var6 != null) {
                    try {
                        var6.invoke(class281.field4957.field4024, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class193.method1337(0);
            this.method1234(10864);
            class252.field4334 = class283.method1923(class26.field706, (byte) 110, class50.field1053, class125.field2241);
            this.method1224(true);
            class265.field4636 = class26.method234((byte) -35);
            while (class10.field337 == 0L || class136.method950(8954) < class10.field337) {
                class29.field740 = class265.field4636.method400(class135.field2442, class237.field4127, -83);
                for (int var7 = 0; var7 < class29.field740; var7++) {
                    this.method1221(false);
                }
                this.method1235(-118);
                class83.method568(-31909, class281.field4957, class125.field2241);
            }
        } catch (Exception var10) {
            class4.method28(56, var10, (String) null);
            this.method1236(115, "crash");
        }
        this.method1228(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3257++;
        this.destroy();
    }

    @OriginalMember(owner = "client!gi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3251++;
        if (class49.field1044 == null) {
            return class281.field4957 == null || class281.field4957.field4024 == this ? super.getAppletContext() : class281.field4957.field4024.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    private final void method1235(int arg0) {
        field3247++;
        long var2 = class136.method950(8954);
        long var4 = class257.field4390[class66.field1273];
        class257.field4390[class66.field1273] = var2;
        class66.field1273 = class66.field1273 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class13.field403 = ((var6 >> 1) + 32000) / var6;
        }
        if (class122.field2173++ > 50) {
            class122.field2173 -= 50;
            class63.field1239 = true;
            class125.field2241.setSize(class26.field706, class50.field1053);
            class125.field2241.setVisible(true);
            if (class49.field1044 != null && class141.field2621 == null) {
                Insets var7 = class49.field1044.getInsets();
                class125.field2241.setLocation(class147.field2755 + var7.left, class193.field3468 + var7.top);
            } else {
                class125.field2241.setLocation(class147.field2755, class193.field3468);
            }
        }
        if (arg0 > -65) {
            field3265 = null;
        }
        this.method1237((byte) 31);
    }

    @OriginalMember(owner = "client!gi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3270++;
        if (class19.field509 != this || class49.field1043) {
            return;
        }
        class63.field1239 = true;
        if (class11.field378 && (class136.method950(8954) - class239.field4181) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class78.field1489 <= var2.width && var2.height >= class145.field2700) {
                class44.field969 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3252++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1236(int arg0, String arg1) {
        field3284++;
        if (this.field3274) {
            return;
        }
        this.field3274 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            if (arg0 < 94) {
                this.destroy();
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3258++;
    }

    @OriginalMember(owner = "client!gi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class19.field504 = true;
        field3281++;
        class63.field1239 = true;
    }

    @OriginalMember(owner = "client!gi", name = "providesignlink", descriptor = "(Lve;)V")
    public static final void providesignlink(class226 arg0) {
        class281.field4957 = arg0;
        class187.field3374 = arg0;
        field3276++;
    }

    @OriginalMember(owner = "client!gi", name = "stop", descriptor = "()V")
    public final void stop() {
        field3261++;
        if (class19.field509 == this && !class49.field1043) {
            class10.field337 = class136.method950(8954) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3260++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public abstract void method1237(byte arg0);

    @OriginalMember(owner = "client!gi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3259++;
        if (class49.field1044 == null) {
            return class281.field4957 == null || class281.field4957.field4024 == this ? super.getParameter(arg0) : class281.field4957.field4024.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3264++;
    }
}
