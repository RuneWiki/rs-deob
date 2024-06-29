import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class331 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[Lm;")
    private class179[] field4752;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field4757 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field4762 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4765 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "J")
    private long field4750;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lm;")
    private class179 field4764;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lmb;")
    public static class258 field4759;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZILc;IIIIIIII)Z", line = 9)
    public static final boolean method2166(int arg0, boolean arg1, int arg2, class158 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4751++;
        int var12 = arg4;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        class323.field4657[var14][var15] = 99;
        int var17 = arg2 - var15;
        class415.field6012[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class26.field390[var18] = arg4;
        int var35 = var18 + 1;
        class253.field3656[var18] = arg2;
        int[][] var20 = arg3.field2405;
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
                                    class218.field3224 = var12;
                                    if (arg1) {
                                        field4765 = null;
                                    }
                                    class223.field3312 = var13;
                                    return false;
                                }
                                var12 = class26.field390[var19];
                                var13 = class253.field3656[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg3.field2424;
                                var24 = var13 - arg3.field2411;
                                if (arg7 == -4) {
                                    if (arg5 == var12 && arg0 == var13) {
                                        class218.field3224 = var12;
                                        class223.field3312 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class372.method2372(arg5, arg0, arg8, arg6, -7247, var13, arg10, arg6, var12)) {
                                        class223.field3312 = var13;
                                        class218.field3224 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg3.method1244(121, var12, arg10, var13, arg6, arg8, arg9, arg6, arg0, arg5)) {
                                        class218.field3224 = var12;
                                        class223.field3312 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg3.method1238(var12, (byte) -19, arg5, arg9, arg10, arg6, arg8, var13, arg0)) {
                                        class223.field3312 = var13;
                                        class218.field3224 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg3.method1242(var12, arg0, var13, arg6, (byte) 113, arg11, arg5, arg7)) {
                                        class218.field3224 = var12;
                                        class223.field3312 = var13;
                                        return true;
                                    }
                                } else if (arg3.method1251(arg0, var13, 2, arg5, arg6, arg7, var12, arg11)) {
                                    class218.field3224 = var12;
                                    class223.field3312 = var13;
                                    return true;
                                }
                                var26 = class415.field6012[var22][var21] + 1;
                                if (var22 > 0 && class323.field4657[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg6 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg6 - 1) {
                                            class26.field390[var35] = var12 - 1;
                                            class253.field3656[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class323.field4657[var22 - 1][var21] = 2;
                                            class415.field6012[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg6) > var22 && class323.field4657[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg6][var24 + arg6 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var28) {
                                            class26.field390[var35] = var12 + 1;
                                            class253.field3656[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class323.field4657[var22 + 1][var21] = 8;
                                            class415.field6012[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg6][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class323.field4657[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg6 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg6 - 1)) {
                                            class26.field390[var35] = var12;
                                            class253.field3656[var35] = var13 - 1;
                                            class323.field4657[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class415.field6012[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg6) > var21 && class323.field4657[var22][var21 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 + arg6 - 1][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg6 - 1)) {
                                            class26.field390[var35] = var12;
                                            class253.field3656[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class323.field4657[var22][var21 + 1] = 4;
                                            class415.field6012[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg6] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class323.field4657[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg6) {
                                            class26.field390[var35] = var12 - 1;
                                            class253.field3656[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class323.field4657[var22 - 1][var21 - 1] = 3;
                                            class415.field6012[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg6 && var21 > 0 && class323.field4657[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg6) {
                                            class26.field390[var35] = var12 + 1;
                                            class253.field3656[var35] = var13 - 1;
                                            class323.field4657[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class415.field6012[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg6 && class323.field4657[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg6] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class26.field390[var35] = var12 - 1;
                                    class253.field3656[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class323.field4657[var22 - 1][var21 + 1] = 6;
                                    class415.field6012[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg6) <= var22);
                        } while (128 - arg6 <= var21);
                    } while (class323.field4657[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][var24 + arg6] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class26.field390[var35] = var12 + 1;
                class253.field3656[var35] = var13 + 1;
                class323.field4657[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class415.field6012[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(JI)Lm;", line = 453)
    public final class179 method2167(long arg0, int arg1) {
        field4753++;
        this.field4750 = arg0;
        class179 var4 = this.field4752[(int) ((long) (this.field4755 + arg1) & arg0)];
        for (this.field4764 = var4.field2664; this.field4764 != var4; this.field4764 = this.field4764.field2664) {
            if (this.field4764.field2671 == arg0) {
                class179 var5 = this.field4764;
                this.field4764 = this.field4764.field2664;
                return var5;
            }
        }
        this.field4764 = null;
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 482)
    public static void method2168(byte arg0) {
        field4765 = null;
        field4759 = null;
        int var1 = 10 / ((arg0 - 67) / 48);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V", line = 493)
    public static final void method2169(int arg0, byte arg1) {
        if (arg1 >= -76) {
            method2170((class127) null, (byte) -103);
        }
        for (class35 var2 = class83.field1359.method1222(5656); var2 != null; var2 = class83.field1359.method1224((byte) -101)) {
            if (((long) arg0) == (var2.field499 >> 48 & 0xFFFFL)) {
                var2.method251(13);
            }
        }
        field4763++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqo;B)V", line = 518)
    public static final void method2170(class127 arg0, byte arg1) {
        field4756++;
        class324 var2 = (class324) class356.field5056.method1219((long) arg0.field5657, -99);
        if (arg1 >= -32) {
            field4759 = null;
        }
        if (var2 == null) {
            return;
        }
        if (var2.field4690 != null) {
            class220.field3275.method511(var2.field4690);
            var2.field4690 = null;
        }
        var2.method251(97);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lm;JI)V", line = 549)
    public final void method2171(class179 arg0, long arg1, int arg2) {
        if (arg0.field2665 != null) {
            arg0.method1398(110);
        }
        field4754++;
        class179 var5 = this.field4752[(int) ((long) (this.field4755 - 1) & arg1)];
        arg0.field2664 = var5;
        arg0.field2665 = var5.field2665;
        if (arg2 == 0) {
            arg0.field2665.field2664 = arg0;
            arg0.field2664.field2665 = arg0;
            arg0.field2671 = arg1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lm;", line = 573)
    public final class179 method2172(int arg0) {
        field4758++;
        if (this.field4764 == null) {
            return null;
        }
        class179 var2 = this.field4752[(int) ((long) (this.field4755 + arg0) & this.field4750)];
        while (this.field4764 != var2) {
            if (this.field4764.field2671 == this.field4750) {
                class179 var3 = this.field4764;
                this.field4764 = this.field4764.field2664;
                return var3;
            }
            this.field4764 = this.field4764.field2664;
        }
        this.field4764 = null;
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)I", line = 601)
    public static final int method2173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4761++;
        int var5 = arg1 & 0xF;
        if (arg3 == 128) {
            int var6 = var5 < 8 ? arg4 : arg0;
            int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg4 : arg2);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V", line = 627)
    public class331(int arg0) {
        this.field4752 = new class179[arg0];
        this.field4755 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field4752[var2] = new class179();
            var3.field2664 = var3;
            var3.field2665 = var3;
        }
    }
}
