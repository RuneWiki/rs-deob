import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class574 extends class203 {

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field8142 = 0;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Lha;")
    public static class58 field8144;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILcaa;IIIIIIII)Z")
    public static final boolean method3326(int arg0, int arg1, int arg2, class302 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field8141++;
        int var12 = arg0;
        int var13 = arg8;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg0 - var14;
        int var17 = arg8 - var15;
        class652.field9308[var14][var15] = 99;
        class180.field2121[var14][var15] = 0;
        if (arg11 != 1) {
            field8144 = null;
        }
        byte var18 = 0;
        int var19 = 0;
        class98.field1030[var18] = arg0;
        int var35 = var18 + 1;
        class523.field7459[var18] = arg8;
        int[][] var20 = arg3.field3770;
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
                                    class237.field2826 = var13;
                                    class215.field2500 = var12;
                                    return false;
                                }
                                var13 = class523.field7459[var19];
                                var12 = class98.field1030[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg3.field3759;
                                var24 = var13 - arg3.field3761;
                                if (arg7 == -4) {
                                    if (arg5 == var12 && arg9 == var13) {
                                        class237.field2826 = var13;
                                        class215.field2500 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class377.method2303(var13, arg6, arg6, arg4, arg5, 4, arg9, var12, arg1)) {
                                        class237.field2826 = var13;
                                        class215.field2500 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg3.method1807((byte) 88, arg9, var12, arg4, var13, arg5, arg1, arg2, arg6, arg6)) {
                                        class237.field2826 = var13;
                                        class215.field2500 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg3.method1805(arg9, var12, (byte) 55, arg1, arg5, var13, arg6, arg4, arg2)) {
                                        class215.field2500 = var12;
                                        class237.field2826 = var13;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg3.method1819(var13, arg5, arg11 ^ 0x2C0109, arg9, var12, arg10, arg7, arg6)) {
                                        class215.field2500 = var12;
                                        class237.field2826 = var13;
                                        return true;
                                    }
                                } else if (arg3.method1817(arg7, var13, arg6, 128, arg10, var12, arg9, arg5)) {
                                    class237.field2826 = var13;
                                    class215.field2500 = var12;
                                    return true;
                                }
                                var26 = class180.field2121[var21][var22] + 1;
                                if (var21 > 0 && class652.field9308[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg6 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var27) {
                                            class98.field1030[var35] = var12 - 1;
                                            class523.field7459[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class652.field9308[var21 - 1][var22] = 2;
                                            class180.field2121[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg6) && class652.field9308[var21 + 1][var22] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][arg6 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var28) {
                                            class98.field1030[var35] = var12 + 1;
                                            class523.field7459[var35] = var13;
                                            class652.field9308[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2121[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class652.field9308[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg6 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg6 - 1) {
                                            class98.field1030[var35] = var12;
                                            class523.field7459[var35] = var13 - 1;
                                            class652.field9308[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2121[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg6) && class652.field9308[var21][var22 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 + arg6 - 1][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var30) {
                                            class98.field1030[var35] = var12;
                                            class523.field7459[var35] = var13 + 1;
                                            class652.field9308[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2121[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class652.field9308[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class98.field1030[var35] = var12 - 1;
                                            class523.field7459[var35] = var13 - 1;
                                            class652.field9308[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class180.field2121[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg6) > var21 && var22 > 0 && class652.field9308[var21 + 1][var22 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg6) {
                                            class98.field1030[var35] = var12 + 1;
                                            class523.field7459[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class652.field9308[var21 + 1][var22 - 1] = 9;
                                            class180.field2121[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg6 > var22 && class652.field9308[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg6 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class98.field1030[var35] = var12 - 1;
                                    class523.field7459[var35] = var13 + 1;
                                    class652.field9308[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class180.field2121[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg6);
                        } while (var22 >= 128 - arg6);
                    } while (class652.field9308[var21 + 1][var22 + 1] != 0);
                } while ((var20[var23 + arg6][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class98.field1030[var35] = var12 + 1;
                class523.field7459[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class652.field9308[var21 + 1][var22 + 1] = 12;
                class180.field2121[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public static final void method3327(int arg0) {
        class702.field9897 = 0;
        class122.field1267 = 0;
        class698.field9818++;
        field8143++;
        class207.method1234((byte) 98);
        class727.method4044(5);
        class70.method517(28384);
        boolean var1 = false;
        int var2 = 0;
        if (arg0 != -7711) {
            method3328(-83);
        }
        while (var2 < class122.field1267) {
            int var5 = class524.field7481[var2];
            class151 var6 = (class151) class253.field3052.method1754(false, (long) var5);
            class197 var7 = var6.field1661;
            if (class149.field1652 && class161.method1001(var5, arg0 + 10235)) {
                class14.method70((byte) 107);
            }
            if (class698.field9818 != var7.field7127) {
                if (var7.field2293.method1947(arg0 ^ 0xFFFFE19E)) {
                    class153.method938(arg0 + 7719, var7);
                }
                var7.method1176(67, null);
                var1 = true;
                var6.method864(12983);
            }
            var2++;
        }
        if (var1) {
            class529.field7533 = class253.field3052.method1752(0);
            class253.field3052.method1750(class452.field6509, 0);
        }
        if (class741.field10364 != class248.field3008.field2903) {
            throw new RuntimeException("gnp1 pos:" + class248.field3008.field2903 + " psize:" + class741.field10364);
        }
        for (int var3 = 0; var3 < class302.field3784; var3++) {
            if (class253.field3052.method1754(false, (long) class272.field3359[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class302.field3784);
            }
        }
        if (class529.field7533 - class302.field3784 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class529.field7533 - class302.field3784));
        }
        for (int var4 = 0; var4 < class529.field7533; var4++) {
            if (class698.field9818 != class452.field6509[var4].field1661.field7127) {
                throw new RuntimeException("gnp4 uk:" + class452.field6509[var4].field1661.field7107);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public static void method3328(int arg0) {
        if (arg0 > -7) {
            method3328(28);
        }
        field8144 = null;
    }
}
