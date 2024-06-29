import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class179 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field2973 = -1;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public static int[] field2970 = new int[14];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public static volatile boolean field2975 = false;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field2990 = 0;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Z")
    public static boolean field2991 = true;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[C")
    public static char[] field2979 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field2974;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Lkd;")
    public static class228[] field2971;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILel;IIIIIIIZILpb;II)Lpb;")
    public static final class168 method1265(int arg0, class77 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, class168 arg11, int arg12, int arg13) {
        field2992++;
        long var14 = ((long) arg6 << 32) + (long) ((arg5 << 24) + arg0 + (arg7 << 16)) + ((long) arg12 << 48);
        class168 var16 = (class168) class37.field630.method1155(var14, true);
        if (var16 == null) {
            byte var17;
            if (arg0 == 1) {
                var17 = 9;
            } else if (arg0 == 2) {
                var17 = 12;
            } else if (arg0 == 3) {
                var17 = 15;
            } else if (arg0 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class264 var19 = new class264(var17 * var18 + 1, var17 * 2 * var18 - var17, 0);
            int var20 = var19.method1776(0, 0, 0);
            int[] var21 = new int[] { 64, 96, 128 };
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var21[var23];
                int var31 = var21[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg13 + (class95.field1482[var33] * var30) >> 16;
                    int var35 = class95.field1475[var33] * var31 + arg3 >> 16;
                    var22[var23][var32] = var19.method1776(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg5 * var25 + arg7 * var26 >> 8);
                short var28 = (short) (((arg6 & 0x7F) * var26 + (arg12 & 0x7F) * var25 & 0x7F00) + ((arg6 & 0xFC00) * var26 + (arg12 & 0xFC00) * var25 & 0xFC0000) + ((arg6 & 0x380) * var26 + (arg12 & 0x380) * var25 & 0x38000) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var19.method1801(var20, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var19.method1801(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var19.method1801(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var19.method1786(64, 768, -50, -10, -50);
            class37.field630.method1161(var16, (byte) -128, var14);
        }
        int var36 = arg0 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        if (arg8 != 32720) {
            return null;
        }
        int var40 = var36;
        if (arg9) {
            if (arg2 > 128 && arg2 < 896) {
                var37 -= 128;
            }
            if (arg2 > 1152 && arg2 < 1920) {
                var40 = var36 + 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var38 -= 128;
            }
            if (arg2 > 640 && arg2 < 1408) {
                var39 = var36 + 128;
            }
        }
        int var41 = arg11.method337();
        class169 var42 = null;
        int var43 = arg11.method359();
        int var44 = arg11.method360();
        if (var37 > var41) {
            var41 = var37;
        }
        if (var40 < var43) {
            var43 = var40;
        }
        if (var38 > var44) {
            var44 = var38;
        }
        int var45 = arg11.method342();
        if (arg1 != null) {
            int var46 = arg1.field1256[arg10];
            var42 = class257.method1716((byte) -50, var46 >> 16);
            arg10 = var46 & 0xFFFF;
        }
        if (var39 < var45) {
            var45 = var39;
        }
        class168 var47;
        if (var42 == null) {
            var47 = var16.method336(true, true, true);
            var47.method338((var43 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method339((var41 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method336(!var42.method1213(arg10, (byte) 14), !var42.method1214(arg10, 126), true);
            var47.method338((var43 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method339((var41 + var43) / 2, 0, (var44 + var45) / 2);
            var47.method1206(var42, arg10);
        }
        if (arg2 != 0) {
            var47.method347(arg2);
        }
        class41 var48 = (class41) var47;
        if (class218.method1450(arg3 + var44, arg13 - -var41, true, class92.field1448) != arg4 || class218.method1450(arg3 + var45, arg13 + var43, true, class92.field1448) != arg4) {
            for (int var49 = 0; var49 < var48.field702; var49++) {
                var48.field694[var49] += class218.method1450(var48.field714[var49] + arg3, var48.field700[var49] + arg13, true, class92.field1448) - arg4;
            }
            var48.field715 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILsb;Lsb;)V")
    public static final void method1266(int arg0, class124 arg1, class124 arg2) {
        class186.field3052 = arg2;
        field2977++;
        if (arg0 != -12871) {
            field2975 = false;
        }
        class192.field3142 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        field2979 = null;
        if (arg0 < 64) {
            field2980 = 93;
        }
        field2971 = null;
        field2974 = null;
        field2970 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
    public static final boolean method1268(int arg0) {
        field2978++;
        if (class137.field2309) {
            try {
                class120.method877(class205.field3294.field1291, arg0 ^ 0xFFFFEAE1, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -29033) {
            field2975 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static final void method1269(byte arg0) {
        class52.field938.method1157(760);
        field2989++;
        if (arg0 != -7) {
            method1266(-4, (class124) null, (class124) null);
        }
        class276.field4397.method1157(arg0 + 767);
        class293.field4651.method1157(arg0 ^ 0xFFFFFD01);
    }
}
