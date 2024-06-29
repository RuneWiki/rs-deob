import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class79 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public static int[] field987 = new int[500];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field989 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
    public static boolean field990 = true;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Ljn;")
    public static class409 field988 = new class409("M", "M", "M", "M");

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[Z")
    public static boolean[] field996 = new boolean[100];

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lct;")
    public static class104 field994;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    public static int[] field992;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIILth;IZII)Z", line = 3)
    public static final boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class175 arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field991++;
        int var12 = arg8;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        class157.field2117[var14][var15] = 99;
        int var17 = arg5 - var15;
        class443.field6448[var14][var15] = 0;
        byte var18 = 0;
        class464.field6840[var18] = arg8;
        int var19 = 0;
        int var35 = var18 + 1;
        class147.field1990[var18] = arg5;
        int[][] var20 = arg7.field2408;
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
                                    class106.field1431 = var12;
                                    class369.field5349 = var13;
                                    if (!arg9) {
                                        method544((byte) -35);
                                    }
                                    return false;
                                }
                                var12 = class464.field6840[var19];
                                var13 = class147.field1990[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg7.field2419;
                                var24 = var13 - arg7.field2400;
                                if (arg10 == -4) {
                                    if (arg2 == var12 && arg6 == var13) {
                                        class106.field1431 = var12;
                                        class369.field5349 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class100.method659(var13, (byte) 122, arg6, var12, arg3, arg0, arg1, arg1, arg2)) {
                                        class106.field1431 = var12;
                                        class369.field5349 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg7.method1214(arg0, var12, arg3, var13, -120, arg1, arg6, arg2, arg1, arg11)) {
                                        class106.field1431 = var12;
                                        class369.field5349 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg7.method1203(var12, arg11, arg0, arg6, var13, arg1, (byte) -128, arg3, arg2)) {
                                        class369.field5349 = var13;
                                        class106.field1431 = var12;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg7.method1207(arg10, arg4, var12, arg1, arg6, -1, var13, arg2)) {
                                        class369.field5349 = var13;
                                        class106.field1431 = var12;
                                        return true;
                                    }
                                } else if (arg7.method1204((byte) -30, arg4, arg1, var13, arg2, var12, arg10, arg6)) {
                                    class369.field5349 = var13;
                                    class106.field1431 = var12;
                                    return true;
                                }
                                var26 = class443.field6448[var21][var22] + 1;
                                if (var21 > 0 && class157.field2117[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg1 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var27) {
                                            class464.field6840[var35] = var12 - 1;
                                            class147.field1990[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class157.field2117[var21 - 1][var22] = 2;
                                            class443.field6448[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg1) && class157.field2117[var21 + 1][var22] == 0 && (var20[arg1 + var23][var24] & 0x60E40000) == 0 && (var20[arg1 + var23][var24 + arg1 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var28) {
                                            class464.field6840[var35] = var12 + 1;
                                            class147.field1990[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class157.field2117[var21 + 1][var22] = 8;
                                            class443.field6448[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class157.field2117[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg1 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var29) {
                                            class464.field6840[var35] = var12;
                                            class147.field1990[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class157.field2117[var21][var22 - 1] = 1;
                                            class443.field6448[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg1 > var22 && class157.field2117[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[var23 + arg1 - 1][arg1 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var30) {
                                            class464.field6840[var35] = var12;
                                            class147.field1990[var35] = var13 + 1;
                                            class157.field2117[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class443.field6448[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class157.field2117[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class464.field6840[var35] = var12 - 1;
                                            class147.field1990[var35] = var13 - 1;
                                            class157.field2117[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class443.field6448[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg1) && var22 > 0 && class157.field2117[var21 + 1][var22 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg1 <= var32) {
                                            class464.field6840[var35] = var12 + 1;
                                            class147.field1990[var35] = var13 - 1;
                                            class157.field2117[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class443.field6448[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg1 && class157.field2117[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg1 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class464.field6840[var35] = var12 - 1;
                                    class147.field1990[var35] = var13 + 1;
                                    class157.field2117[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class443.field6448[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg1);
                        } while (var22 >= 128 - arg1);
                    } while (class157.field2117[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][arg1 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][var24 + arg1] & 0x7E240000) != 0 || (var20[var23 + arg1][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class464.field6840[var35] = var12 + 1;
                class147.field1990[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class157.field2117[var21 + 1][var22 + 1] = 12;
                class443.field6448[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 445)
    public static void method544(byte arg0) {
        field994 = null;
        int var1 = 127 % ((arg0 + 47) / 50);
        field992 = null;
        field996 = null;
        field987 = null;
        field989 = null;
        field988 = null;
    }
}
