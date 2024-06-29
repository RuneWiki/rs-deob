import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class282 extends class80 {

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "Z")
    public volatile boolean field3807 = true;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field3806 = 0;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Lkj;")
    public static class397 field3804;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "Z")
    public boolean field3809;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "Z")
    public boolean field3811;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLss;)Lss;", line = 8)
    public static final class295 method1617(boolean arg0, class295 arg1) {
        field3802++;
        if (arg1.field3988 != -1) {
            return class339.method1882((byte) 75, arg1.field3988);
        } else if (arg0) {
            return null;
        } else {
            int var2 = arg1.field4073 >>> 16;
            class458 var3 = new class458(class269.field3690);
            for (class14 var4 = (class14) var3.method2692((byte) -95); var4 != null; var4 = (class14) var3.method2693(0)) {
                if (var4.field167 == var2) {
                    return class339.method1882((byte) 101, (int) var4.field7342);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIZ[IILid;IIIII[I)I", line = 46)
    public static final int method1618(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, class413 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class205.field2906[var15][var35] = 0;
                class472.field6894[var15][var35] = 99999999;
            }
        }
        field3803++;
        boolean var16;
        if (arg2 == 1) {
            var16 = class405.method2339(arg11, arg13, arg10, arg12, arg1, arg4, arg0, false, arg8, arg3, arg9);
        } else if (arg2 == 2) {
            var16 = class101.method669(arg9, arg3, false, arg1, arg8, arg11, arg10, arg12, arg4, arg0, arg13);
        } else {
            var16 = class411.method2446(1, arg8, arg13, arg9, arg0, arg10, arg11, arg4, arg1, arg2, arg12, arg3);
        }
        int var17 = arg9 - 64;
        int var18 = arg0 - 64;
        int var19 = class100.field1372;
        int var20 = class210.field2982;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= (arg11 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class472.field6894[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg11) {
                            var28 = arg11 - var24;
                        } else if (var24 > (arg10 + arg11 - 1)) {
                            var28 = var24 + 1 - arg11 - arg10;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if (var25 > arg1 + arg12 - 1) {
                            var29 = var25 + 1 - (arg1 + arg12);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class472.field6894[var26][var27] < var22) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class472.field6894[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg0 == var20) {
            return 0;
        } else if (arg7 == 1822767280) {
            byte var31 = 0;
            class175.field2502[var31] = var19;
            int var37 = var31 + 1;
            class300.field4118[var31] = var20;
            int var32;
            int var33 = var32 = class205.field2906[var19 - var17][var20 - var18];
            while (arg9 != var19 || arg0 != var20) {
                if (var32 != var33) {
                    var32 = var33;
                    class175.field2502[var37] = var19;
                    class300.field4118[var37++] = var20;
                }
                if ((var33 & 0x2) != 0) {
                    var19++;
                } else if ((var33 & 0x8) != 0) {
                    var19--;
                }
                if ((var33 & 0x1) != 0) {
                    var20++;
                } else if ((var33 & 0x4) != 0) {
                    var20--;
                }
                var33 = class205.field2906[var19 - var17][var20 - var18];
            }
            int var34 = 0;
            while ((var37--) > 0) {
                arg14[var34] = class175.field2502[var37];
                arg6[var34++] = class300.field4118[var37];
                if (arg14.length <= var34) {
                    break;
                }
            }
            return var34;
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 237)
    public static void method1619(boolean arg0) {
        field3804 = null;
        if (!arg0) {
            field3804 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)[B")
    public abstract byte[] method614(int arg0);

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)I")
    public abstract int method613(int arg0);
}
