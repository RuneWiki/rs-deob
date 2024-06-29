import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class226 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ldq;")
    public static class493 field2876 = new class493(108, 0);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lup;")
    public static class181 field2877 = new class181(8, -1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1375(int arg0) {
        field2877 = null;
        field2876 = null;
        if (arg0 != 0) {
            method1376(-83, 94, 12, (byte) -40, 56, null, -108, 22, 29, -98, 34, 109);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBILis;IIIIII)Z")
    public static final boolean method1376(int arg0, int arg1, int arg2, byte arg3, int arg4, class348 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2874++;
        if (arg3 != -6) {
            field2877 = null;
        }
        int var12 = arg7;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg7 - var14;
        int var17 = arg10 - var15;
        class203.field2644[var14][var15] = 99;
        class315.field4018[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class448.field6412[var18] = arg7;
        int var35 = var18 + 1;
        class85.field1069[var18] = arg10;
        int[][] var20 = arg5.field4465;
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
                                    class531.field7812 = var12;
                                    class391.field5262 = var13;
                                    return false;
                                }
                                var12 = class448.field6412[var19];
                                var13 = class85.field1069[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg5.field4478;
                                var24 = var13 - arg5.field4464;
                                if (arg9 == -4) {
                                    if (arg4 == var12 && arg8 == var13) {
                                        class531.field7812 = var12;
                                        class391.field5262 = var13;
                                        return true;
                                    }
                                } else if (arg9 == -3) {
                                    if (class265.method1573(arg6, var13, (byte) -111, var12, arg2, arg8, arg0, arg6, arg4)) {
                                        class391.field5262 = var13;
                                        class531.field7812 = var12;
                                        return true;
                                    }
                                } else if (arg9 == -2) {
                                    if (arg5.method1994(arg0, (byte) 109, var13, arg6, arg2, arg4, arg8, arg1, arg6, var12)) {
                                        class391.field5262 = var13;
                                        class531.field7812 = var12;
                                        return true;
                                    }
                                } else if (arg9 == -1) {
                                    if (arg5.method1997(var12, 1, arg6, arg1, arg2, arg0, var13, arg4, arg8)) {
                                        class531.field7812 = var12;
                                        class391.field5262 = var13;
                                        return true;
                                    }
                                } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                                    if (arg5.method2001(arg4, arg11, arg8, arg9, var13, arg3 + 5, arg6, var12)) {
                                        class391.field5262 = var13;
                                        class531.field7812 = var12;
                                        return true;
                                    }
                                } else if (arg5.method1987(arg6, var13, var12, arg4, arg11, arg9, -116, arg8)) {
                                    class391.field5262 = var13;
                                    class531.field7812 = var12;
                                    return true;
                                }
                                var26 = class315.field4018[var22][var21] + 1;
                                if (var22 > 0 && class203.field2644[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg6 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var27) {
                                            class448.field6412[var35] = var12 - 1;
                                            class85.field1069[var35] = var13;
                                            class203.field2644[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class315.field4018[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg6) > var22 && class203.field2644[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][arg6 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var28) {
                                            class448.field6412[var35] = var12 + 1;
                                            class85.field1069[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class203.field2644[var22 + 1][var21] = 8;
                                            class315.field4018[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class203.field2644[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg6 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg6 - 1) {
                                            class448.field6412[var35] = var12;
                                            class85.field1069[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class203.field2644[var22][var21 - 1] = 1;
                                            class315.field4018[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg6) && class203.field2644[var22][var21 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[arg6 + var23 - 1][var24 + arg6] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var30) {
                                            class448.field6412[var35] = var12;
                                            class85.field1069[var35] = var13 + 1;
                                            class203.field2644[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class315.field4018[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class203.field2644[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class448.field6412[var35] = var12 - 1;
                                            class85.field1069[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class203.field2644[var22 - 1][var21 - 1] = 3;
                                            class315.field4018[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg6 > var22 && var21 > 0 && class203.field2644[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class448.field6412[var35] = var12 + 1;
                                            class85.field1069[var35] = var13 - 1;
                                            class203.field2644[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class315.field4018[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg6) && class203.field2644[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg6] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class448.field6412[var35] = var12 - 1;
                                    class85.field1069[var35] = var13 + 1;
                                    class203.field2644[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class315.field4018[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg6) <= var22);
                        } while (128 - arg6 <= var21);
                    } while (class203.field2644[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class448.field6412[var35] = var12 + 1;
                class85.field1069[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class203.field2644[var22 + 1][var21 + 1] = 12;
                class315.field4018[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Ljb;")
    public static final class343 method1377(byte arg0, int arg1) {
        field2875++;
        if (arg0 != -82) {
            field2876 = null;
        }
        class343 var2 = (class343) class248.field3187.method2647(arg0 ^ 0x2A, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class65.field837.method481(0, arg1, -94);
        class343 var4 = new class343();
        if (var3 != null) {
            var4.method1971(false, new class463(var3));
        }
        var4.method1973(arg0 + 184);
        class248.field3187.method2635((long) arg1, -26591, var4);
        return var4;
    }
}
