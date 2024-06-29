import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class259 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3783 = "Connected to update server";

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "J")
    public static long field3784;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lel;")
    public static class328 field3786;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lps;")
    public static class394 field3785;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field3783 = null;
        field3785 = null;
        if (arg0 != -24262) {
            method1795(-27, 55, (byte) -95, -64, 22, 18, (class270) null, -48, -38, -75, 109, 3);
        }
        field3786 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBIIILba;IIIII)Z")
    public static final boolean method1795(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class270 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3787++;
        int var12 = -10 / ((-arg2 - 14) / 59);
        int var13 = arg8;
        int var14 = arg7;
        byte var15 = 64;
        byte var16 = 64;
        int var17 = arg8 - var15;
        class264.field3830[var15][var16] = 99;
        int var18 = arg7 - var16;
        class100.field1404[var15][var16] = 0;
        byte var19 = 0;
        int var20 = 0;
        class295.field4231[var19] = arg8;
        int var36 = var19 + 1;
        class173.field2306[var19] = arg7;
        int[][] var21 = arg6.field3914;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var20) {
                                    class253.field3499 = var14;
                                    class148.field2036 = var13;
                                    return false;
                                }
                                var13 = class295.field4231[var20];
                                var14 = class173.field2306[var20];
                                var22 = var14 - var18;
                                var20 = var20 + 1 & 0xFFF;
                                var23 = var13 - var17;
                                var24 = var13 - arg6.field3908;
                                var25 = var14 - arg6.field3915;
                                if (arg10 == -4) {
                                    if (arg3 == var13 && arg9 == var14) {
                                        class148.field2036 = var13;
                                        class253.field3499 = var14;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class369.method2396(arg3, arg9, arg1, var13, arg0, -10954, arg0, arg11, var14)) {
                                        class253.field3499 = var14;
                                        class148.field2036 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg6.method1842(arg0, arg1, arg4, arg9, 13406, arg3, arg0, var13, var14, arg11)) {
                                        class253.field3499 = var14;
                                        class148.field2036 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg6.method1856(arg4, arg0, var13, var14, (byte) 57, arg11, arg3, arg9, arg1)) {
                                        class148.field2036 = var13;
                                        class253.field3499 = var14;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg6.method1859(arg9, arg10, false, arg5, arg0, arg3, var13, var14)) {
                                        class148.field2036 = var13;
                                        class253.field3499 = var14;
                                        return true;
                                    }
                                } else if (arg6.method1848(var14, arg0, arg5, arg9, var13, arg3, -13282, arg10)) {
                                    class148.field2036 = var13;
                                    class253.field3499 = var14;
                                    return true;
                                }
                                var27 = class100.field1404[var23][var22] + 1;
                                if (var23 > 0 && class264.field3830[var23 - 1][var22] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][arg0 + var25 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg0 - 1 <= var28) {
                                            class295.field4231[var36] = var13 - 1;
                                            class173.field2306[var36] = var14;
                                            var36 = var36 + 1 & 0xFFF;
                                            class264.field3830[var23 - 1][var22] = 2;
                                            class100.field1404[var23 - 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if ((128 - arg0) > var23 && class264.field3830[var23 + 1][var22] == 0 && (var21[arg0 + var24][var25] & 0x60E40000) == 0 && (var21[var24 + arg0][arg0 + var25 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg0 - 1)) {
                                            class295.field4231[var36] = var13 + 1;
                                            class173.field2306[var36] = var14;
                                            var36 = var36 + 1 & 0xFFF;
                                            class264.field3830[var23 + 1][var22] = 8;
                                            class100.field1404[var23 + 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[arg0 + var24][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 > 0 && class264.field3830[var23][var22 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[var24 + arg0 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg0 - 1)) {
                                            class295.field4231[var36] = var13;
                                            class173.field2306[var36] = var14 - 1;
                                            class264.field3830[var23][var22 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class100.field1404[var23][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (128 - arg0 > var22 && class264.field3830[var23][var22 + 1] == 0 && (var21[var24][var25 + arg0] & 0x4E240000) == 0 && (var21[var24 + arg0 - 1][arg0 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg0 - 1 <= var31) {
                                            class295.field4231[var36] = var13;
                                            class173.field2306[var36] = var14 + 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class264.field3830[var23][var22 + 1] = 4;
                                            class100.field1404[var23][var22 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][var25 + arg0] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var23 > 0 && var22 > 0 && class264.field3830[var23 - 1][var22 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg0) {
                                            class295.field4231[var36] = var13 - 1;
                                            class173.field2306[var36] = var14 - 1;
                                            class264.field3830[var23 - 1][var22 - 1] = 3;
                                            var36 = var36 + 1 & 0xFFF;
                                            class100.field1404[var23 - 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var23 < (128 - arg0) && var22 > 0 && class264.field3830[var23 + 1][var22 - 1] == 0 && (var21[arg0 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (arg0 <= var33) {
                                            class295.field4231[var36] = var13 + 1;
                                            class173.field2306[var36] = var14 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class264.field3830[var23 + 1][var22 - 1] = 9;
                                            class100.field1404[var23 + 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg0 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var23 > 0 && 128 - arg0 > var22 && class264.field3830[var23 - 1][var22 + 1] == 0 && (var21[var24 - 1][arg0 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg0; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 - (1 - var34)][var25 + arg0] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class295.field4231[var36] = var13 - 1;
                                    class173.field2306[var36] = var14 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class264.field3830[var23 - 1][var22 + 1] = 6;
                                    class100.field1404[var23 - 1][var22 + 1] = var27;
                                }
                            } while (var23 >= 128 - arg0);
                        } while ((128 - arg0) <= var22);
                    } while (class264.field3830[var23 + 1][var22 + 1] != 0);
                } while ((var21[arg0 + var24][arg0 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg0; var35++) {
                    if ((var21[var24 + var35][arg0 + var25] & 0x7E240000) != 0 || (var21[arg0 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class295.field4231[var36] = var13 + 1;
                class173.field2306[var36] = var14 + 1;
                class264.field3830[var23 + 1][var22 + 1] = 12;
                var36 = var36 + 1 & 0xFFF;
                class100.field1404[var23 + 1][var22 + 1] = var27;
            }
        }
    }
}
