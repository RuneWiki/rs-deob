import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class194 {

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Z")
    public static boolean field3765 = false;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Ltg;")
    public static class184 field3763 = class135.method812("RuneScape wird geladen )2 bitte warten)3)3)3", 3);

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Ltg;")
    public static class184 field3769 = class135.method812("Mem:", 3);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[[B")
    public static byte[][] field3757 = new byte[1000][];

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    public static int[] field3767 = new int[100];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lrh;")
    public static class167 field3764;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lvb;")
    public static class197 field3760;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1231(int arg0) {
        int var1 = -95 / ((33 - arg0) / 62);
        field3770++;
        Object var2 = class186.field3590;
        synchronized (class186.field3590) {
            if (class13.field242 != 0) {
                class13.field242 = 1;
                try {
                    class186.field3590.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method1232(byte arg0) {
        if (arg0 != 26) {
            field3764 = null;
        }
        for (class14 var1 = (class14) class2.field51.method404(false); var1 != null; var1 = (class14) class2.field51.method414(-121)) {
            if (var1.field262 != null) {
                var1.method90(false);
            }
        }
        field3754++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lea;")
    public static final class41 method1233(int arg0, int arg1) {
        field3776++;
        class41 var2 = (class41) class58.field1081.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1403.method1249((byte) 61, arg0, 9);
        class41 var4 = new class41();
        var4.field792 = arg0;
        if (var3 != null) {
            var4.method234(new class97(var3), (byte) -87);
        }
        var4.method239(-6824);
        if (arg1 != 32137) {
            field3763 = null;
        }
        class58.field1081.method776(var4, (long) arg0, (byte) -54);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method1234(int arg0) {
        field3767 = null;
        if (arg0 >= -40) {
            return;
        }
        field3760 = null;
        field3764 = null;
        field3769 = null;
        field3757 = null;
        field3763 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lna;Lna;B)V")
    public static final void method1235(class124 arg0, class124 arg1, byte arg2) {
        field3774++;
        if (class49.field903) {
            class16.method95(arg1, -16316, arg0);
            return;
        }
        if (class127.field2281 == 0 || class127.field2281 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method1365(class44.field848, 382, 245 - var3, 16777215, -1);
            class4.method18(230, var4, 304, 34, 9179409);
            class4.method18(231, var4 + 1, 302, 32, 0);
            class4.method27(232, var4 + 2, class47.field895 * 3, 30, 9179409);
            class4.method27(class47.field895 * 3 + 232, var4 + 2, 300 - class47.field895 * 3, 30, 0);
            arg0.method1365(class188.field3622, 382, 276 - var3, 16777215, -1);
        }
        if (class127.field2281 == 20) {
            class43.field820.method1062(382 - class43.field820.field3246 / 2, 271 - class43.field820.field3250 / 2);
            short var5 = 211;
            arg0.method1365(class188.field3632, 382, var5, 16776960, 0);
            int var24 = var5 + 15;
            arg0.method1365(class188.field3620, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            arg0.method1365(class188.field3625, 382, var25, 16776960, 0);
            int var26 = var25 + 15;
            int var27 = var26 + 10;
            arg0.method1366(class144.method884(0, new class184[] { class63.field1179, class211.method1358(class188.field3651) }), 272, var27, 16777215, 0);
            int var29 = var27 + 15;
            arg0.method1366(class144.method884(0, new class184[] { class117.field2123, class188.field3626.method1156((byte) 82) }), 274, var29, 16777215, 0);
            int var30 = var29 + 15;
        }
        if (class127.field2281 == 10) {
            class43.field820.method1062(202, 171);
            if (class2.field54 == 0) {
                short var6 = 251;
                short var7 = 302;
                arg0.method1365(class169.field3206, 382, var6, 16776960, 0);
                short var8 = 291;
                class133.field2418.method1062(var7 - 73, var8 + -20);
                int var28 = var6 + 30;
                arg0.method1355(class107.field1938, var7 - 73, var8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class133.field2418.method1062(var9 - 73, var8 + -20);
                arg0.method1355(class126.field2265, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class2.field54 == 2) {
                short var10 = 211;
                short var11 = 302;
                short var12 = 321;
                arg0.method1365(class188.field3632, 382, var10, 16776960, 0);
                int var31 = var10 + 15;
                arg0.method1365(class188.field3620, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                arg0.method1365(class188.field3625, 382, var32, 16776960, 0);
                boolean var13;
                if (class172.field3260 == 0 && class161.field2903 % 40 < 20 && class125.field2255) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                var31 = var32 + 15;
                var31 += 10;
                arg0.method1366(class144.method884(0, new class184[] { class63.field1179, class211.method1358(class188.field3651), var13 ? class8.field152 : class188.field3649 }), 272, var31, 16777215, 0);
                var31 += 15;
                boolean var14;
                if (class172.field3260 == 1 && class161.field2903 % 40 < 20 && class125.field2255) {
                    var14 = true;
                } else {
                    var14 = false;
                }
                arg0.method1366(class144.method884(0, new class184[] { class117.field2123, class188.field3626.method1156((byte) 20), var14 ? class8.field152 : class188.field3649 }), 274, var31, 16777215, 0);
                class133.field2418.method1062(var11 - 73, var12 - 20);
                arg0.method1365(class193.field3743, var11, var12 + 5, 16777215, 0);
                short var15 = 462;
                class133.field2418.method1062(var15 - 73, var12 + -20);
                var31 += 15;
                arg0.method1365(class16.field305, var15, var12 + 5, 16777215, 0);
            } else if (class2.field54 == 3) {
                arg0.method1365(class105.field1906, 382, 211, 16776960, 0);
                short var16 = 382;
                short var17 = 321;
                short var18 = 236;
                arg0.method1365(class34.field587, 382, var18, 16777215, 0);
                int var33 = var18 + 15;
                arg0.method1365(class125.field2248, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg0.method1365(class52.field957, 382, var34, 16777215, 0);
                int var35 = var34 + 15;
                arg0.method1365(class116.field2094, 382, var35, 16777215, 0);
                class133.field2418.method1062(var16 - 73, var17 + -20);
                arg0.method1365(class16.field305, var16, var17 + 5, 16777215, 0);
                int var36 = var35 + 15;
            }
        }
        if (class109.field1971 != 1) {
            if (class182.field3500 > 0) {
                client.method187(class182.field3500, -116);
                class182.field3500 = 0;
            }
            class55.method296(-69);
        }
        class185.field3576[class68.field1310 ? 1 : 0].method1062(725, 463);
        int var19 = 65 % ((-arg2 - 44) / 43);
        if (class127.field2281 <= 5 || class176.field3335 == 2 || class141.field2565 != 0) {
            return;
        }
        if (class141.field2564 == null) {
            class141.field2564 = class69.method410(class182.field3509, 0, class117.field2124, (byte) 117);
        }
        if (class141.field2564 == null) {
            return;
        }
        short var20 = 463;
        byte var21 = 5;
        byte var22 = 35;
        class141.field2564.method1062(var21, var20);
        byte var23 = 100;
        arg0.method1365(class144.method884(0, new class184[] { class97.field1803, class130.field2367, class170.method1060(class52.field954, -106) }), var23 / 2 + var21, var22 / 2 + -2 + var20, 16777215, 0);
        if (class43.field823 != null) {
            arg1.method1365(class98.field1840, var21 + var23 / 2, var20 - -(var22 / 2) + 12, 16777215, 0);
            return;
        }
        arg1.method1365(class164.field2955, var23 / 2 + var21, var22 / 2 + var20 + 12, 16777215, 0);
        return;
    }
}
