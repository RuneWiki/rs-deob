import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class112 extends class103 {

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lda;")
    private static class275 field1982 = class255.method1672(97, "Continue");

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lda;")
    public static class275 field1981 = field1982;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lda;")
    public static class275 field1976 = class255.method1672(126, "::serverjs5drop");

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lik;")
    public static class108 field1974;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lpd;")
    public static class149 field1979;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method819(byte arg0) {
        class149.field2597.method526((byte) -40, 13);
        class116.field2059++;
        for (class112 var1 = (class112) class267.field4633.method1864((byte) -99); var1 != null; var1 = (class112) class267.field4633.method1869(-1)) {
            if (var1.field1978 == 0) {
                class39.method227(var1, true, 0);
            }
        }
        int var2 = 21 % ((arg0 + 32) / 37);
        field1975++;
        if (class45.field754 != null) {
            class40.method231(class45.field754, 0);
            class45.field754 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZILma;)V")
    public static final void method820(int arg0, int arg1, int arg2, boolean arg3, int arg4, class105 arg5) {
        class238.field4185 = arg4;
        class224.field3787 = arg2;
        class116.field2070 = arg1;
        class100.field1688 = arg0;
        class83.field1347 = 1;
        field1983++;
        class192.field3309 = arg3;
        class96.field1636 = arg5;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Lda;")
    public static final class275 method821(int arg0, int arg1) {
        field1984++;
        int var2 = 124 % ((8 - arg1) / 37);
        return arg0 < 999999999 ? class250.method1644(arg0, (byte) -115) : class66.field1089;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1982 = null;
        if (arg0 < -94) {
            field1979 = null;
            field1974 = null;
            field1981 = null;
            field1976 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method823(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class74.field1215[var12][var31] = 0;
                class19.field278[var12][var31] = 99999999;
            }
        }
        field1980++;
        int var13 = arg6;
        int var14 = arg7;
        class74.field1215[arg6][arg7] = 99;
        byte var15 = 0;
        class19.field278[arg6][arg7] = 0;
        class150.field2617[var15] = arg6;
        boolean var16 = false;
        int var32 = var15 + 1;
        class8.field123[var15] = arg7;
        int[][] var17 = class173.field3003[class159.field2790].field2094;
        int var18 = 0;
        while (var32 != var18) {
            var14 = class8.field123[var18];
            var13 = class150.field2617[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg3 == var13 && arg9 == var14) {
                var16 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class173.field3003[class159.field2790].method856((byte) 121, arg8, arg3, arg9, arg1 - 1, 2, var13, var14)) {
                    var16 = true;
                    break;
                }
                if (arg1 < 10 && class173.field3003[class159.field2790].method866(var14, arg9, arg1 - 1, arg3, arg8, (byte) -46, var13, 2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg11 != 0 && class173.field3003[class159.field2790].method863(arg4, arg11, 2, var14, arg10, var13, arg3, arg9, -1)) {
                var16 = true;
                break;
            }
            int var30 = class19.field278[var13][var14] + 1;
            if (var13 > 0 && class74.field1215[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 - 1][var14] = 2;
                class19.field278[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class74.field1215[var13 + 1][var14] == 0 && (var17[var13 + 2][var14] & 0x12C0183) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 + 1][var14] = 8;
                class19.field278[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class74.field1215[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class150.field2617[var32] = var13;
                class8.field123[var32] = var14 - 1;
                class74.field1215[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class74.field1215[var13][var14 + 1] == 0 && (var17[var13][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class150.field2617[var32] = var13;
                class8.field123[var32] = var14 + 1;
                class74.field1215[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class74.field1215[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14] & 0x12C0138) == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13][var14 - 1] & 0x12C0183) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 - 1][var14 - 1] = 3;
                class19.field278[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class74.field1215[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 2][var14] & 0x12C01E0) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14 - 1;
                class74.field1215[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class74.field1215[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13][var14 + 2] & 0x12C01E0) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14 + 1;
                class74.field1215[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class74.field1215[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 + 1][var14 + 1] = 12;
                class19.field278[var13 + 1][var14 + 1] = var30;
            }
        }
        class129.field2273 = arg0;
        if (!var16) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg3 - var20; var22 <= (arg3 + var20); var22++) {
                for (int var23 = arg9 - var20; var23 <= (arg9 + var20); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class19.field278[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg3) {
                            var24 = arg3 - var22;
                        } else if (var22 > (arg3 + arg10 - 1)) {
                            var24 = var22 + 1 - arg10 - arg3;
                        }
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (var23 > arg9 + arg11 - 1) {
                            var25 = var23 + 1 - arg9 - arg11;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var21 > class19.field278[var22][var23]) {
                            var14 = var23;
                            var19 = var26;
                            var21 = class19.field278[var22][var23];
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg7 == var14) {
                return false;
            }
            class129.field2273 = 1;
        }
        byte var27 = 0;
        class150.field2617[var27] = var13;
        int var33 = var27 + 1;
        class8.field123[var27] = var14;
        int var28;
        int var29 = var28 = class74.field1215[var13][var14];
        while (arg6 != var13 || arg7 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class150.field2617[var33] = var13;
                class8.field123[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class74.field1215[var13][var14];
        }
        if (var33 > 0) {
            class167.method1147(var33, (byte) -128, arg5);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
