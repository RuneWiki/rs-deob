import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class167 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2397 = -1;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2403 = -1;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2408 = -1;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2407 = "K";

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2410 = "skill: ";

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
    public static int[] field2411 = new int[5];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[Lqi;")
    public static class216[] field2404 = new class216[2048];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lbc;")
    public static class282 field2405;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lbc;")
    public static class282 field2412;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lbc;I)V")
    public static final void method1093(class282 arg0, int arg1) {
        class140.field2029 = arg0.method1844("titlebg", -43);
        class265.field3827 = arg0.method1844("logo", 94);
        field2396++;
        if (arg1 <= 71) {
            method1098(-47, 92, (byte) -96, 75, 111, 32, 119);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZIIZI)V")
    public static final void method1094(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2399++;
        if (class238.method1549((byte) -98, arg2)) {
            class151.method994(arg1, class123.field1767[arg2], arg3, arg4, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)V")
    public static final void method1095(byte arg0, int arg1) {
        class66 var2 = class6.method34(9, true, arg1);
        var2.method410(122);
        field2413++;
        int var3 = -85 / ((62 - arg0) / 41);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I")
    public static final int method1096(byte arg0, int arg1, int arg2) {
        field2398++;
        int var3 = class130.method859(arg2 + 45365, arg1 - -91923, 4, (byte) -68) - (-(class130.method859(arg2 + 10294, arg1 + 37821, 2, (byte) -70) + -128 >> 1) + -(class130.method859(arg2, arg1, 1, (byte) -119) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != -108) {
            return 18;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2412 = null;
        field2407 = null;
        if (arg0 != 1716695009) {
            field2412 = null;
        }
        field2410 = null;
        field2411 = null;
        field2404 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1098(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2409++;
        int var7 = 0;
        int var8 = arg4 - arg1;
        class171.method1118(arg2 + 1842, arg4);
        int var9 = -arg4;
        int var10 = arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg2 != 26) {
            method1095((byte) -98, 5);
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg5 >= class286.field4431 && class230.field3302 >= arg5) {
            int[] var15 = class268.field3919[arg5];
            int var16 = class22.method134(class177.field2514, 14949, arg3 - arg4, class279.field4238);
            int var17 = class22.method134(class177.field2514, 14949, arg3 + arg4, class279.field4238);
            int var18 = class22.method134(class177.field2514, 14949, arg3 - var8, class279.field4238);
            int var19 = class22.method134(class177.field2514, 14949, arg3 + var8, class279.field4238);
            class76.method463(var16, 0, arg6, var18, var15);
            class76.method463(var18, 0, arg0, var19, var15);
            class76.method463(var19, 0, arg6, var17, var15);
        }
        while (var10 > var7) {
            var13 += 2;
            var9 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class225.field3169[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                int var20 = arg5 + var10;
                var9 -= var10 << 1;
                int var21 = arg5 - var10;
                if (class286.field4431 <= var20 && var21 <= class230.field3302) {
                    if (var8 > var10) {
                        int var22 = class225.field3169[var10];
                        int var23 = class22.method134(class177.field2514, 14949, arg3 + var7, class279.field4238);
                        int var24 = class22.method134(class177.field2514, 14949, arg3 - var7, class279.field4238);
                        int var25 = class22.method134(class177.field2514, arg2 ^ 0x3A7F, arg3 + var22, class279.field4238);
                        int var26 = class22.method134(class177.field2514, 14949, arg3 - var22, class279.field4238);
                        if (class230.field3302 >= var20) {
                            int[] var27 = class268.field3919[var20];
                            class76.method463(var24, 0, arg6, var26, var27);
                            class76.method463(var26, 0, arg0, var25, var27);
                            class76.method463(var25, arg2 - 26, arg6, var23, var27);
                        }
                        if (var21 >= class286.field4431) {
                            int[] var28 = class268.field3919[var21];
                            class76.method463(var24, 0, arg6, var26, var28);
                            class76.method463(var26, arg2 - 26, arg0, var25, var28);
                            class76.method463(var25, 0, arg6, var23, var28);
                        }
                    } else {
                        int var29 = class22.method134(class177.field2514, arg2 ^ 0x3A7F, arg3 + var7, class279.field4238);
                        int var30 = class22.method134(class177.field2514, arg2 + 14923, -var7 + arg3, class279.field4238);
                        if (class230.field3302 >= var20) {
                            class76.method463(var30, 0, arg6, var29, class268.field3919[var20]);
                        }
                        if (class286.field4431 <= var21) {
                            class76.method463(var30, 0, arg6, var29, class268.field3919[var21]);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class286.field4431 <= var32 && class230.field3302 >= var31) {
                int var33 = arg3 + var10;
                int var34 = arg3 - var10;
                if (var33 >= class177.field2514 && class279.field4238 >= var34) {
                    int var35 = class22.method134(class177.field2514, arg2 ^ 0x3A7F, var33, class279.field4238);
                    int var36 = class22.method134(class177.field2514, 14949, var34, class279.field4238);
                    if (var7 >= var8) {
                        if (class230.field3302 >= var32) {
                            class76.method463(var36, 0, arg6, var35, class268.field3919[var32]);
                        }
                        if (class286.field4431 <= var31) {
                            class76.method463(var36, 0, arg6, var35, class268.field3919[var31]);
                        }
                    } else {
                        int var37 = var7 > var11 ? class225.field3169[var7] : var11;
                        int var38 = class22.method134(class177.field2514, 14949, arg3 + var37, class279.field4238);
                        int var39 = class22.method134(class177.field2514, 14949, arg3 - var37, class279.field4238);
                        if (class230.field3302 >= var32) {
                            int[] var40 = class268.field3919[var32];
                            class76.method463(var36, 0, arg6, var39, var40);
                            class76.method463(var39, 0, arg0, var38, var40);
                            class76.method463(var38, arg2 ^ 0x1A, arg6, var35, var40);
                        }
                        if (var31 >= class286.field4431) {
                            int[] var41 = class268.field3919[var31];
                            class76.method463(var36, 0, arg6, var39, var41);
                            class76.method463(var39, 0, arg0, var38, var41);
                            class76.method463(var38, arg2 - 26, arg6, var35, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        field2401++;
        int var1 = class263.field3814;
        int var2 = class76.field911;
        int var3 = class221.field3134;
        int var4 = 6116423;
        int var5 = class267.field3901;
        class155.method1018(var1, var3, var5, var2, var4);
        class155.method1018(var1 + 1, var3 + 1, var5 - 2, 16, 0);
        class155.method1020(var1 + 1, var3 + 18, var5 - 2, var2 + -19, 0);
        class248.field3614.method537(class164.field2349, var1 + 3, var3 - -14, var4, -1);
        int var6 = class104.field1417;
        int var7 = class37.field431;
        for (int var8 = 0; var8 < class112.field1496; var8++) {
            int var10 = (class112.field1496 - var8 - 1) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var1 < var6 && var6 < (var1 + var5) && var7 > (var10 - 13) && var7 < (var10 + 3)) {
                var11 = 16776960;
            }
            class248.field3614.method537(class59.method368(var8, (byte) -128), var1 + 3, var10, var11, 0);
        }
        int var9 = 34 % ((arg0 - 27) / 61);
        class220.method1433(0, class76.field911, class267.field3901, class263.field3814, class221.field3134);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1100(boolean arg0) {
        if (class73.field878 != null) {
            class73.field878.method824(23610);
        }
        if (class282.field4282 != null) {
            class282.field4282.method824(23610);
        }
        field2406++;
        if (arg0) {
            return;
        }
        class71.method437(2, 22050, class287.field4461, true);
        class73.field878 = class122.method796(class115.field1592, class181.field2574, 22050, 0, (byte) 118);
        class73.field878.method837(class28.field341, (byte) -22);
        class282.field4282 = class122.method796(class115.field1592, class181.field2574, 2048, 1, (byte) 118);
        class282.field4282.method837(class14.field178, (byte) -22);
    }
}
