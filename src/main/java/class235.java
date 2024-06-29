import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class235 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "Ldj;")
    public static class703 field3510 = new class703(10, 2, 2, 0);

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3516 = -1;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
    public static boolean field3514 = false;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
    public static boolean field3518 = true;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZLfe;IIIIIIIII[I[II)I")
    public static final int method1638(int arg0, boolean arg1, class635 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int[] arg13, int arg14) {
        field3511++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class489.field7046[var15][var35] = 0;
                class616.field8775[var15][var35] = 99999999;
            }
        }
        if (arg7 != 17105) {
            field3514 = false;
        }
        boolean var16;
        if (arg0 == 1) {
            var16 = class346.method2186(arg6, arg5, arg2, arg3, 1612972032, arg10, arg9, arg4, arg14, arg8, arg11);
        } else if (arg0 == 2) {
            var16 = class583.method3430(arg3, arg2, arg5, arg4, 60, arg6, arg9, arg8, arg11, arg10, arg14);
        } else {
            var16 = class449.method2747(arg14, arg6, arg10, arg4, arg11, arg8, arg2, arg9, arg0, arg5, arg3, -1);
        }
        int var17 = arg14 - 64;
        int var18 = arg9 - 64;
        int var19 = class265.field3795;
        int var20 = class501.field7283;
        if (!var16) {
            if (!arg1) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= (arg5 + var23); var24++) {
                for (int var25 = arg11 - var23; var25 <= arg11 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class616.field8775[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg5) {
                            var28 = arg5 - var24;
                        } else if (var24 > arg5 + arg8 - 1) {
                            var28 = var24 - (arg5 + arg8 - 1);
                        }
                        int var29 = 0;
                        if (var25 < arg11) {
                            var29 = arg11 - var25;
                        } else if (var25 > arg3 + arg11 - 1) {
                            var29 = var25 + 1 - arg3 - arg11;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class616.field8775[var26][var27]) {
                            var22 = class616.field8775[var26][var27];
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg14 == var19 && arg9 == var20) {
            return 0;
        }
        byte var31 = 0;
        class216.field3240[var31] = var19;
        int var37 = var31 + 1;
        class563.field8152[var31] = var20;
        int var32;
        int var33 = var32 = class489.field7046[var19 - var17][var20 - var18];
        while (arg14 != var19 || arg9 != var20) {
            if (var32 != var33) {
                class216.field3240[var37] = var19;
                var32 = var33;
                class563.field8152[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class489.field7046[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class216.field3240[var37];
            arg13[var34++] = class563.field8152[var37];
            if (arg12.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V")
    public static void method1639(boolean arg0) {
        if (arg0) {
            field3510 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILas;II)J")
    public static final long method1640(int arg0, class324 arg1, int arg2, int arg3) {
        field3513++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class482 var8 = class375.field5421.method2680(arg1.method601((byte) 93), (byte) 86);
        long var9 = (long) (arg1.method604((byte) 94) << 14 | arg2 << 7 | arg0 | arg1.method606(-63) << 20 | 0x40000000);
        if (arg3 != 2026763566) {
            method1640(113, null, -33, -74);
        }
        if (var8.field6903 == 0) {
            var9 |= var6;
        }
        if (var8.field6926 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method601((byte) 98) << 32;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;ZII)V")
    public static final void method1641(String arg0, boolean arg1, int arg2, int arg3) {
        field3512++;
        class176.method1265(false);
        class589.method3462((byte) 112);
        class415.method2505(true);
        class358.method2271(arg1, arg2, 0, arg0);
        class30.method151(-24851);
        class191.method1349(class211.field3164, true);
        class386.method2375((byte) 49, class211.field3164);
        if (arg3 <= 92) {
            field3514 = false;
        }
        class330.method2033(true, class211.field3164, class603.field8548);
        class544.method3273(false);
        class77.method641((byte) 86, class139.field1899);
        class328.method2021(-8586);
        class181.method1284(-101);
        if (class369.field5392 == 3) {
            class79.method649(-19704, 4);
        } else if (class369.field5392 == 7) {
            class79.method649(-19704, 8);
        } else if (class369.field5392 == 10) {
            class79.method649(-19704, 11);
        } else if (class369.field5392 == 1 || class369.field5392 == 2) {
            class301.method1889(true);
        }
    }
}
