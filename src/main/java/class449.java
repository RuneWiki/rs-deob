import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class449 {

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Z")
    public boolean field6430;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field6425 = 0;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lgr;")
    public static class530 field6429 = new class530(62, 2);

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "[[F")
    public static float[][] field6434 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "[I")
    public static int[] field6435 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lrr;")
    public class33 field6426;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lrr;")
    public class33 field6432;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Z")
    public boolean field6431;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 5)
    public static void method2744(byte arg0) {
        field6435 = null;
        field6434 = null;
        if (arg0 <= -34) {
            field6429 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 18)
    public final void method2745(int arg0) {
        if (this.field6426 != null) {
            this.field6426.method175(44);
        }
        int var2 = 95 % ((arg0 + 36) / 50);
        field6433++;
        this.field6431 = false;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Lfe;", line = 36)
    public static final class635 method2746(int arg0, int arg1, int arg2) {
        field6436++;
        class635 var3 = new class635();
        var3.field8955 = arg0 + arg2;
        var3.field8950 = -1;
        var3.field8961 = arg1 + 5 + 1;
        var3.field8968 = -1;
        var3.field8956 = new int[var3.field8955][var3.field8961];
        var3.method3650((byte) -114);
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIILfe;IIIII)Z", line = 56)
    public static final boolean method2747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class635 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6427++;
        int var12 = arg0;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg0 - var14;
        class489.field7046[var14][var15] = 99;
        int var17 = arg7 - var15;
        class616.field8775[var14][var15] = 0;
        byte var18 = 0;
        class216.field3240[var18] = arg0;
        int var19 = 0;
        int var35 = var18 + 1;
        class563.field8152[var18] = arg7;
        int[][] var20 = arg6.field8956;
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
                                    class265.field3795 = var12;
                                    if (arg11 != -1) {
                                        field6435 = null;
                                    }
                                    class501.field7283 = var13;
                                    return false;
                                }
                                var13 = class563.field8152[var19];
                                var12 = class216.field3240[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg6.field8950;
                                var24 = var13 - arg6.field8968;
                                if (arg3 == -4) {
                                    if (arg9 == var12 && arg4 == var13) {
                                        class501.field7283 = var13;
                                        class265.field3795 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class176.method1270(arg9, ~arg11, arg8, arg5, arg8, arg4, arg10, var13, var12)) {
                                        class265.field3795 = var12;
                                        class501.field7283 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg6.method3640(arg8, arg2, arg8, 2, arg4, arg5, var12, var13, arg10, arg9)) {
                                        class501.field7283 = var13;
                                        class265.field3795 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg6.method3636(arg4, var12, arg9, var13, arg8, true, arg5, arg2, arg10)) {
                                        class265.field3795 = var12;
                                        class501.field7283 = var13;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg6.method3637(arg3, arg9, var12, arg4, var13, arg8, -109, arg1)) {
                                        class501.field7283 = var13;
                                        class265.field3795 = var12;
                                        return true;
                                    }
                                } else if (arg6.method3647(arg4, arg1, arg9, arg3, var13, var12, arg8, arg11 - 99)) {
                                    class501.field7283 = var13;
                                    class265.field3795 = var12;
                                    return true;
                                }
                                var26 = class616.field8775[var21][var22] + 1;
                                if (var21 > 0 && class489.field7046[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg8 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg8 - 1) <= var27) {
                                            class216.field3240[var35] = var12 - 1;
                                            class563.field8152[var35] = var13;
                                            class489.field7046[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class616.field8775[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg8 > var21 && class489.field7046[var21 + 1][var22] == 0 && (var20[arg8 + var23][var24] & 0x60E40000) == 0 && (var20[arg8 + var23][arg8 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg8 - 1) {
                                            class216.field3240[var35] = var12 + 1;
                                            class563.field8152[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class489.field7046[var21 + 1][var22] = 8;
                                            class616.field8775[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class489.field7046[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg8 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg8 - 1) <= var29) {
                                            class216.field3240[var35] = var12;
                                            class563.field8152[var35] = var13 - 1;
                                            class489.field7046[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class616.field8775[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg8) && class489.field7046[var21][var22 + 1] == 0 && (var20[var23][arg8 + var24] & 0x4E240000) == 0 && (var20[arg8 + var23 - 1][arg8 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg8 - 1)) {
                                            class216.field3240[var35] = var12;
                                            class563.field8152[var35] = var13 + 1;
                                            class489.field7046[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class616.field8775[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg8 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class489.field7046[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg8) {
                                            class216.field3240[var35] = var12 - 1;
                                            class563.field8152[var35] = var13 - 1;
                                            class489.field7046[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class616.field8775[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg8 > var21 && var22 > 0 && class489.field7046[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg8][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg8) {
                                            class216.field3240[var35] = var12 + 1;
                                            class563.field8152[var35] = var13 - 1;
                                            class489.field7046[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class616.field8775[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg8) && class489.field7046[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg8 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg8; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg8 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class216.field3240[var35] = var12 - 1;
                                    class563.field8152[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class489.field7046[var21 - 1][var22 + 1] = 6;
                                    class616.field8775[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg8));
                        } while ((128 - arg8) <= var22);
                    } while (class489.field7046[var21 + 1][var22 + 1] != 0);
                } while ((var20[var23 + arg8][arg8 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg8; var34++) {
                    if ((var20[var23 + var34][arg8 + var24] & 0x7E240000) != 0 || (var20[var23 + arg8][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class216.field3240[var35] = var12 + 1;
                class563.field8152[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class489.field7046[var21 + 1][var22 + 1] = 12;
                class616.field8775[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z", line = 494)
    public final boolean method2748(int arg0) {
        if (arg0 == 3) {
            field6428++;
            return this.field6431 && !this.field6430;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Z)V", line = 506)
    public class449(boolean arg0) {
        this.field6430 = arg0;
    }
}
