import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class136 {

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field2281 = -1;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lth;")
    public static class55 field2276 = new class55();

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
    public static int[] field2283 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2287 = "Created gameworld";

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Z")
    public static boolean field2289 = false;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lri;")
    public class203 field2286;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lbm;")
    public static class307 field2278;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Ldl;")
    public static class32 field2284;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
    public int[] field2277;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field2273;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[[[I")
    public static int[][][] field2290;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZIILjc;I)Loj;", line = 4)
    public static final class283 method888(int arg0, int arg1, boolean arg2, int arg3, int arg4, class230 arg5, int arg6) {
        field2275++;
        int var8 = (arg0 << 19) + (arg3 << 17) + (arg2 ? 65536 : 0) + arg1;
        long var9 = (long) arg6 * 3147483667L + ((long) var8 * 3849834839L);
        if (arg4 != -31868) {
            return (class283) null;
        }
        class283 var11 = (class283) class85.field1611.method1881(true, var9);
        if (var11 != null) {
            return var11;
        }
        class284.field4389 = false;
        class283 var12 = class4.method53(false, arg3, 124, arg2, false, arg0, arg1, arg6, arg5);
        if (var12 != null && !class284.field4389) {
            class85.field1611.method1880(var12, var9, 126);
        }
        return var12;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 36)
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2274++;
        if (arg6 != -27801) {
            return;
        }
        class177.method1111(arg5, true);
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg3 >= class59.field1162 && arg3 <= class186.field3028) {
            int[] var14 = class155.field2522[arg3];
            int var15 = class8.method73(arg6 ^ 0xFFFF936F, class259.field4024, class147.field2416, arg0 - arg5);
            int var16 = class8.method73(8, class259.field4024, class147.field2416, arg0 + arg5);
            int var17 = class8.method73(8, class259.field4024, class147.field2416, arg0 - var8);
            int var18 = class8.method73(8, class259.field4024, class147.field2416, arg0 + var8);
            class241.method1598(arg4, -7, var14, var17, var15);
            class241.method1598(arg1, -7, var14, var18, var17);
            class241.method1598(arg4, -7, var14, var16, var18);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class322.field4897[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                int var20 = arg3 - var9;
                var10 -= var9 << 1;
                int var21 = arg3 + var9;
                if (class59.field1162 <= var21 && var20 <= class186.field3028) {
                    if (var9 < var8) {
                        int var22 = class322.field4897[var9];
                        int var23 = class8.method73(8, class259.field4024, class147.field2416, arg0 + var7);
                        int var24 = class8.method73(arg6 ^ 0xFFFF936F, class259.field4024, class147.field2416, arg0 - var7);
                        int var25 = class8.method73(8, class259.field4024, class147.field2416, arg0 + var22);
                        int var26 = class8.method73(arg6 + 27809, class259.field4024, class147.field2416, arg0 - var22);
                        if (var21 <= class186.field3028) {
                            int[] var27 = class155.field2522[var21];
                            class241.method1598(arg4, -7, var27, var26, var24);
                            class241.method1598(arg1, -7, var27, var25, var26);
                            class241.method1598(arg4, -7, var27, var23, var25);
                        }
                        if (class59.field1162 <= var20) {
                            int[] var28 = class155.field2522[var20];
                            class241.method1598(arg4, -7, var28, var26, var24);
                            class241.method1598(arg1, -7, var28, var25, var26);
                            class241.method1598(arg4, -7, var28, var23, var25);
                        }
                    } else {
                        int var29 = class8.method73(arg6 ^ 0xFFFF936F, class259.field4024, class147.field2416, arg0 + var7);
                        int var30 = class8.method73(8, class259.field4024, class147.field2416, arg0 - var7);
                        if (var21 <= class186.field3028) {
                            class241.method1598(arg4, -7, class155.field2522[var21], var29, var30);
                        }
                        if (class59.field1162 <= var20) {
                            class241.method1598(arg4, arg6 + 27794, class155.field2522[var20], var29, var30);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class59.field1162 && class186.field3028 >= var31) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class147.field2416 <= var33 && var34 <= class259.field4024) {
                    int var35 = class8.method73(8, class259.field4024, class147.field2416, var33);
                    int var36 = class8.method73(8, class259.field4024, class147.field2416, var34);
                    if (var7 < var8) {
                        int var37 = var11 < var7 ? class322.field4897[var7] : var11;
                        int var38 = class8.method73(8, class259.field4024, class147.field2416, arg0 + var37);
                        int var39 = class8.method73(arg6 ^ 0xFFFF936F, class259.field4024, class147.field2416, arg0 - var37);
                        if (class186.field3028 >= var32) {
                            int[] var40 = class155.field2522[var32];
                            class241.method1598(arg4, -7, var40, var39, var36);
                            class241.method1598(arg1, -7, var40, var38, var39);
                            class241.method1598(arg4, -7, var40, var35, var38);
                        }
                        if (var31 >= class59.field1162) {
                            int[] var41 = class155.field2522[var31];
                            class241.method1598(arg4, -7, var41, var39, var36);
                            class241.method1598(arg1, -7, var41, var38, var39);
                            class241.method1598(arg4, -7, var41, var35, var38);
                        }
                    } else {
                        if (class186.field3028 >= var32) {
                            class241.method1598(arg4, -7, class155.field2522[var32], var35, var36);
                        }
                        if (var31 >= class59.field1162) {
                            class241.method1598(arg4, arg6 ^ 0x6C9E, class155.field2522[var31], var35, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 226)
    public static void method890(byte arg0) {
        field2290 = (int[][][]) null;
        field2287 = null;
        if (arg0 > 103) {
            field2278 = null;
            field2276 = null;
            field2284 = null;
            field2283 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIII)V", line = 256)
    public static final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2279++;
        int var7 = arg0 + arg6;
        int var8 = arg5 - arg6;
        int var9 = arg4 + arg6;
        int var10 = arg0;
        if (arg1 != 0) {
            method889(78, -107, -19, 67, -2, 90, -78);
        }
        while (var10 < var7) {
            class241.method1598(arg2, -7, class155.field2522[var10], arg3, arg4);
            var10++;
        }
        int var11 = arg3 - arg6;
        for (int var12 = arg5; var12 > var8; var12--) {
            class241.method1598(arg2, -7, class155.field2522[var12], arg3, arg4);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class155.field2522[var13];
            class241.method1598(arg2, -7, var14, var9, arg4);
            class241.method1598(arg2, -7, var14, arg3, var11);
        }
    }
}
