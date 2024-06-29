import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class190 {

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "[I")
    public static int[] field2322 = new int[50];

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2323 = null;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Z")
    public static boolean field2324 = true;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "[Lmp;")
    public static class705[] field2325 = new class705[16];

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Z")
    public static boolean field2312;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "Z")
    public static boolean field2319;

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIII)V", line = 8)
    public class190(int arg0, int arg1, int arg2, int arg3) {
        this.field2317 = arg2;
        this.field2315 = arg3;
        this.field2314 = arg0;
        this.field2316 = arg1;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method1172(boolean arg0) {
        field2321++;
        if (!arg0) {
            method1172(true);
        }
        class447.method2640(78);
        class317.method1849(-1);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 35)
    public static void method1173(int arg0) {
        field2325 = null;
        if (arg0 != -1) {
            field2323 = null;
        }
        field2323 = null;
        field2322 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)Lrea;", line = 52)
    public final class190 method1174(int arg0, byte arg1) {
        if (arg1 != 51) {
            field2319 = true;
        }
        field2313++;
        return new class190(this.field2314, arg0, this.field2317, this.field2315);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIIIILga;III)Z", line = 68)
    public static final boolean method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class370 arg8, int arg9, int arg10, int arg11) {
        field2318++;
        int var12 = arg7;
        int var13 = arg1;
        if (arg0 != 1310982144) {
            method1172(true);
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg7 - var14;
        class674.field9680[var14][var15] = 99;
        int var17 = arg1 - var15;
        class180.field2218[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class665.field9413[var18] = arg7;
        int var35 = var18 + 1;
        class62.field997[var18] = arg1;
        int[][] var20 = arg8.field4979;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class195.field2365 = var13;
                                    class295.field3984 = var12;
                                    return false;
                                }
                                var13 = class62.field997[var19];
                                var12 = class665.field9413[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg8.field4978;
                                var24 = var13 - arg8.field4975;
                                if (arg11 == -4) {
                                    if (arg4 == var12 && arg2 == var13) {
                                        class195.field2365 = var13;
                                        class295.field3984 = var12;
                                        return true;
                                    }
                                } else if (arg11 == -3) {
                                    if (class204.method1235(arg9, arg0 - 1311012647, arg6, arg5, arg6, var13, arg4, var12, arg2)) {
                                        class295.field3984 = var12;
                                        class195.field2365 = var13;
                                        return true;
                                    }
                                } else if (arg11 == -2) {
                                    if (arg8.method2142(arg6, (byte) 14, arg2, arg9, arg4, arg6, var13, var12, arg10, arg5)) {
                                        class295.field3984 = var12;
                                        class195.field2365 = var13;
                                        return true;
                                    }
                                } else if (arg11 == -1) {
                                    if (arg8.method2135(0, var13, arg10, arg6, arg4, arg2, var12, arg5, arg9)) {
                                        class195.field2365 = var13;
                                        class295.field3984 = var12;
                                        return true;
                                    }
                                } else if (arg11 == 0 || arg11 == 1 || arg11 == 2 || arg11 == 3 || arg11 == 9) {
                                    if (arg8.method2132(arg6, arg2, var12, arg4, arg3, arg11, var13, (byte) 63)) {
                                        class195.field2365 = var13;
                                        class295.field3984 = var12;
                                        return true;
                                    }
                                } else if (arg8.method2139(arg11, -1, arg4, arg2, arg3, var12, arg6, var13)) {
                                    class195.field2365 = var13;
                                    class295.field3984 = var12;
                                    return true;
                                }
                                var26 = class180.field2218[var22][var21] + 1;
                                if (var22 > 0 && class674.field9680[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg6 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var27) {
                                            class665.field9413[var35] = var12 - 1;
                                            class62.field997[var35] = var13;
                                            class674.field9680[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2218[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg6) && class674.field9680[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][arg6 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg6 - 1) {
                                            class665.field9413[var35] = var12 + 1;
                                            class62.field997[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class674.field9680[var22 + 1][var21] = 8;
                                            class180.field2218[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class674.field9680[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg6 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg6 - 1)) {
                                            class665.field9413[var35] = var12;
                                            class62.field997[var35] = var13 - 1;
                                            class674.field9680[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2218[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg6 && class674.field9680[var22][var21 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 - (1 - arg6)][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg6 - 1)) {
                                            class665.field9413[var35] = var12;
                                            class62.field997[var35] = var13 + 1;
                                            class674.field9680[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2218[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class674.field9680[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class665.field9413[var35] = var12 - 1;
                                            class62.field997[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class674.field9680[var22 - 1][var21 - 1] = 3;
                                            class180.field2218[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg6) > var22 && var21 > 0 && class674.field9680[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class665.field9413[var35] = var12 + 1;
                                            class62.field997[var35] = var13 - 1;
                                            class674.field9680[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2218[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg6) && class674.field9680[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg6 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg6] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class665.field9413[var35] = var12 - 1;
                                    class62.field997[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class674.field9680[var22 - 1][var21 + 1] = 6;
                                    class180.field2218[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg6 <= var22);
                        } while (var21 >= 128 - arg6);
                    } while (class674.field9680[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][var24 + arg6] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class665.field9413[var35] = var12 + 1;
                class62.field997[var35] = var13 + 1;
                class674.field9680[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class180.field2218[var22 + 1][var21 + 1] = var26;
            }
        }
    }
}
