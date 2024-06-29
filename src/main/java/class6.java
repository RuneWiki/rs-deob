import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field51 = 128;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field49 = 128;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lie;", line = 3)
    public final class6 method16(byte arg0) {
        if (arg0 < 121) {
            return null;
        } else {
            field53++;
            return new class6(this.field45, this.field51, this.field49, this.field47, this.field50, this.field52);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class437.field6073 != null) {
            class437.field6073[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class24.field305 != null) {
            class24.field305[arg0][arg1] = (short) arg3;
        }
        if (class523.field7099 != null) {
            class523.field7099[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 36)
    public static final void method18(byte arg0) {
        field46++;
        if (arg0 > 36) {
            class137.field1948 = 0;
            class588.field8265.method1444(-27547);
            class588.field8265.method1441(class306.field4232, 0);
            class137.field1948++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([ILqh;II)V", line = 50)
    public static final void method19(int[] arg0, class61 arg1, int arg2, int arg3) {
        field48++;
        if (arg1.field1735 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field1735.length; var5++) {
                if (arg1.field1735[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field1779 != -1) {
                class403 var6 = class192.field2727.method3090(-95, arg1.field1779);
                int var7 = var6.field5660;
                if (var7 == 1) {
                    arg1.field1722 = 0;
                    arg1.field1766 = 0;
                    arg1.field1706 = arg2;
                    arg1.field1739 = 0;
                    arg1.field1784 = 1;
                    if (!arg1.field1764) {
                        class234.method1476(arg1, var6, arg1.field1739, (byte) 4);
                    }
                }
                if (var7 == 2) {
                    arg1.field1722 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg3 != 3814) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg1.field1735 == null || arg1.field1735[var9] == -1 || class192.field2727.method3090(103, arg0[var9]).field5668 >= class192.field2727.method3090(43, arg1.field1735[var9]).field5668) {
                arg1.field1706 = arg2;
                arg1.field1802 = arg1.field1797;
                arg1.field1735 = arg0;
            }
        }
        if (var8) {
            arg1.field1735 = arg0;
            arg1.field1706 = arg2;
            arg1.field1802 = arg1.field1797;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 594)
    public class6(int arg0) {
        this.field45 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V", line = 601)
    private class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field50 = arg4;
        this.field52 = arg5;
        this.field51 = arg1;
        this.field49 = arg2;
        this.field47 = arg3;
        this.field45 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIILnn;IIII)Z", line = 143)
    public static final boolean method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class380 arg7, int arg8, int arg9, int arg10, int arg11) {
        field54++;
        int var12 = arg9;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class675.field9527[var14][var15] = 99;
        int var17 = arg3 - var15;
        class182.field2634[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class341.field4577[var18] = arg9;
        int var35 = var18 + 1;
        class72.field957[var18] = arg3;
        int[][] var20 = arg7.field5064;
        if (arg8 != 24157) {
            return false;
        }
        while (true) {
            label284: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label261: do {
                                if (var35 == var19) {
                                    class16.field166 = var13;
                                    class185.field2683 = var12;
                                    return false;
                                }
                                var12 = class341.field4577[var19];
                                var13 = class72.field957[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg7.field5069;
                                var24 = var13 - arg7.field5070;
                                if (arg4 == -4) {
                                    if (arg2 == var12 && arg6 == var13) {
                                        class16.field166 = var13;
                                        class185.field2683 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class576.method3291(117, var12, arg11, arg2, arg11, arg5, arg1, var13, arg6)) {
                                        class16.field166 = var13;
                                        class185.field2683 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg7.method2174(arg2, arg1, var12, var13, arg5, arg10, arg11, 67, arg11, arg6)) {
                                        class16.field166 = var13;
                                        class185.field2683 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg7.method2186(arg10, var13, arg6, arg1, arg5, false, var12, arg11, arg2)) {
                                        class185.field2683 = var12;
                                        class16.field166 = var13;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg7.method2172(var12, arg0, arg4, arg2, arg6, var13, -77, arg11)) {
                                        class16.field166 = var13;
                                        class185.field2683 = var12;
                                        return true;
                                    }
                                } else if (arg7.method2185(arg8 - 24282, arg11, var13, arg0, arg2, arg4, arg6, var12)) {
                                    class185.field2683 = var12;
                                    class16.field166 = var13;
                                    return true;
                                }
                                var26 = class182.field2634[var21][var22] + 1;
                                if (var21 > 0 && class675.field9527[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg11 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg11 - 1) {
                                            class341.field4577[var35] = var12 - 1;
                                            class72.field957[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class675.field9527[var21 - 1][var22] = 2;
                                            class182.field2634[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg11 && class675.field9527[var21 + 1][var22] == 0 && (var20[arg11 + var23][var24] & 0x60E40000) == 0 && (var20[arg11 + var23][arg11 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var28) {
                                            class341.field4577[var35] = var12 + 1;
                                            class72.field957[var35] = var13;
                                            class675.field9527[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class182.field2634[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class675.field9527[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg11 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg11 - 1) {
                                            class341.field4577[var35] = var12;
                                            class72.field957[var35] = var13 - 1;
                                            class675.field9527[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class182.field2634[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg11 && class675.field9527[var21][var22 + 1] == 0 && (var20[var23][var24 + arg11] & 0x4E240000) == 0 && (var20[arg11 + var23 - 1][arg11 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var30) {
                                            class341.field4577[var35] = var12;
                                            class72.field957[var35] = var13 + 1;
                                            class675.field9527[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class182.field2634[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg11 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class675.field9527[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg11) {
                                            class341.field4577[var35] = var12 - 1;
                                            class72.field957[var35] = var13 - 1;
                                            class675.field9527[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class182.field2634[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < (128 - arg11) && var22 > 0 && class675.field9527[var21 + 1][var22 - 1] == 0 && (var20[arg11 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg11 <= var32) {
                                            class341.field4577[var35] = var12 + 1;
                                            class72.field957[var35] = var13 - 1;
                                            class675.field9527[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class182.field2634[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg11) && class675.field9527[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg11 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg11; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg11 + var24] & 0x7E240000) != 0) {
                                            continue label261;
                                        }
                                    }
                                    class341.field4577[var35] = var12 - 1;
                                    class72.field957[var35] = var13 + 1;
                                    class675.field9527[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class182.field2634[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg11 <= var21);
                        } while (128 - arg11 <= var22);
                    } while (class675.field9527[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg11 + var23][arg11 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg11; var34++) {
                    if ((var20[var23 + var34][arg11 + var24] & 0x7E240000) != 0 || (var20[arg11 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label284;
                    }
                }
                class341.field4577[var35] = var12 + 1;
                class72.field957[var35] = var13 + 1;
                class675.field9527[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class182.field2634[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lie;B)V", line = 576)
    public final void method21(class6 arg0, byte arg1) {
        this.field50 = arg0.field50;
        this.field45 = arg0.field45;
        this.field52 = arg0.field52;
        if (arg1 < 38) {
            this.field45 = -105;
        }
        this.field51 = arg0.field51;
        this.field47 = arg0.field47;
        field44++;
        this.field49 = arg0.field49;
    }
}
