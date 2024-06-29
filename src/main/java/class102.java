import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[Lcc;")
    public volatile class18[] field2241 = new class18[2];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public volatile boolean field2236 = false;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Z")
    public volatile boolean field2245 = false;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    public static int[] field2243 = new int[2000];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
    public static int[] field2238 = new int[5];

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lod;")
    private static class101 field2242 = class46.method335(-57, "Please remove ");

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
    public static volatile boolean field2247 = false;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lod;")
    public static class101 field2251 = field2242;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lod;")
    public static class101 field2253 = field2242;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2240 = Calendar.getInstance();

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lve;")
    public class151 field2237;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
    public static int[] field2250;

    @OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
    public final void run() {
        this.field2245 = true;
        field2246++;
        try {
            while (!this.field2236) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class18 var2 = this.field2241[var1];
                    if (var2 != null) {
                        var2.method148((byte) 29);
                    }
                }
                class127.method981((byte) -86, 10L);
                class65.method450(null, 79, this.field2237);
            }
        } catch (Exception var9) {
            class142.method1130(null, var9, 7565);
        } finally {
            Object var6 = null;
            this.field2245 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLme;Lme;)V")
    public static final void method742(byte arg0, class88 arg1, class88 arg2) {
        field2244++;
        if (class53.field1210) {
            class146.method1152(arg1, arg2, false);
            return;
        }
        if (class145.field3335 == 0 || class145.field3335 == 5) {
            byte var3 = 20;
            arg2.method850(class23.field538, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class38.method276(230, var4, 304, 34, 9179409);
            class38.method276(231, var4 + 1, 302, 32, 0);
            class38.method275(232, var4 + 2, class119.field2625 * 3, 30, 9179409);
            class38.method275(class119.field2625 * 3 + 232, var4 + 2, 300 - class119.field2625 * 3, 30, 0);
            arg2.method850(class85.field1877, 382, 276 - var3, 16777215, -1);
        }
        if (class145.field3335 == 20) {
            class5.field64.method884(382 - class5.field64.field2572 / 2, -(class5.field64.field2574 / 2) + 271);
            short var5 = 211;
            arg2.method850(class85.field1868, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method850(class85.field1865, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method850(class85.field1881, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method852(class15.method101(-37, new class101[] { class137.field3131, class114.method848(class85.field1856) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method852(class15.method101(-57, new class101[] { class2.field23, class85.field1846.method699((byte) -121) }), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class145.field3335 == 10) {
            class5.field64.method884(202, 171);
            if (class140.field3229 == 0) {
                short var13 = 302;
                short var14 = 291;
                short var15 = 251;
                arg2.method850(class96.field2088, 382, var15, 16776960, 0);
                class106.field2280.method884(var13 - 73, var14 - 20);
                arg2.method858(class79.field1662, var13 - 73, var14 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var16 = 462;
                int var39 = var15 + 30;
                class106.field2280.method884(var16 - 73, var14 + -20);
                arg2.method858(class157.field3606, var16 - 73, var14 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class140.field3229 == 2) {
                short var9 = 211;
                arg2.method850(class85.field1868, 382, var9, 16776960, 0);
                short var10 = 302;
                int var33 = var9 + 15;
                short var11 = 321;
                arg2.method850(class85.field1865, 382, var33, 16776960, 0);
                int var34 = var33 + 15;
                arg2.method850(class85.field1881, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                int var36 = var35 + 10;
                arg2.method852(class15.method101(-87, new class101[] { class137.field3131, class114.method848(class85.field1856), class32.field817 == 0 & ~(class143.field3305 % 40) > -21 ? class132.field3035 : class85.field1863 }), 272, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg2.method852(class15.method101(-98, new class101[] { class2.field23, class85.field1846.method699((byte) -111), ~class32.field817 == -2 & class143.field3305 % 40 < 20 ? class132.field3035 : class85.field1863 }), 274, var37, 16777215, 0);
                int var38 = var37 + 15;
                class106.field2280.method884(var10 - 73, var11 + -20);
                arg2.method850(class2.field20, var10, var11 + 5, 16777215, 0);
                short var12 = 462;
                class106.field2280.method884(var12 - 73, var11 + -20);
                arg2.method850(class144.field3327, var12, var11 + 5, 16777215, 0);
            } else if (class140.field3229 == 3) {
                short var6 = 236;
                arg2.method850(class54.field1254, 382, 211, 16776960, 0);
                arg2.method850(class152.field3476, 382, var6, 16777215, 0);
                short var7 = 382;
                int var27 = var6 + 15;
                arg2.method850(class111.field2386, 382, var27, 16777215, 0);
                short var8 = 321;
                int var29 = var27 + 15;
                arg2.method850(class147.field3357, 382, var29, 16777215, 0);
                int var31 = var29 + 15;
                arg2.method850(class42.field1016, 382, var31, 16777215, 0);
                class106.field2280.method884(var7 - 73, var8 + -20);
                int var32 = var31 + 15;
                arg2.method850(class144.field3327, var7, var8 + 5, 16777215, 0);
            }
        }
        if (arg0 >= -115) {
            field2238 = null;
        }
        if (class22.field521 != 1) {
            if (class119.field2619 > 0) {
                class48.method363(93, class119.field2619);
                class119.field2619 = 0;
            }
            class62.method427(0);
        }
        class89.field1926[class46.field1087 ? 1 : 0].method884(725, 463);
        if (class145.field3335 > 5 && class56.field1259 != 2 && class13.field287 == 0) {
            if (class119.field2634 == null) {
                class119.field2634 = class147.method1158(class20.field442, class73.field1587, class85.field1863, (byte) -114);
            } else {
                short var17 = 463;
                byte var18 = 5;
                class119.field2634.method884(var18, var17);
                byte var19 = 100;
                byte var20 = 35;
                arg2.method850(class15.method101(126, new class101[] { class27.field723, class138.field3199, class82.method592(false, class47.field1130) }), var19 / 2 + var18, var17 - -(var20 / 2) + -2, 16777215, 0);
                if (class129.field2939 == null) {
                    arg1.method850(class95.field2050, var19 / 2 + var18, var20 / 2 + (var17 - -12), 16777215, 0);
                } else {
                    arg1.method850(class127.field2891, var19 / 2 + var18, var20 / 2 + var17 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var21 = class134.field3062.getGraphics();
            class106.field2294.method156(var21, 0, 0, 0);
        } catch (Exception var22) {
            class134.field3062.repaint();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method743(boolean arg0) {
        field2253 = null;
        if (!arg0) {
            method744(42);
        }
        field2240 = null;
        field2243 = null;
        field2251 = null;
        field2250 = null;
        field2238 = null;
        field2242 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method744(int arg0) {
        field2249++;
        int var1 = class34.field867.method866(class36.field905);
        for (int var2 = 0; var2 < class54.field1244; var2++) {
            int var6 = class34.field867.method866(class54.method394(false, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class15.field330 = true;
        var1 += 8;
        class28.field751 = class54.field1244 * 15 + 22;
        class25.field655 = var1;
        int var3 = class54.field1244 * 15 + 21;
        int var4 = class147.field3369 - var1 / 2;
        int var5 = class80.field1684;
        if (arg0 < var1 + var4) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class75.field1612 = var4;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class54.field1241 = var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lc;ILc;)V")
    public static final void method745(class15 arg0, int arg1, class15 arg2) {
        class67.field1506 = arg0;
        field2239++;
        class27.field727 = arg2;
        class79.field1655 = class67.field1506.method112(3, 1);
        if (arg1 != 2) {
            method745(null, 28, null);
        }
    }
}
