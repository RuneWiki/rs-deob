import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class244 extends class179 {

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    private int field4163 = 6;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field4161 = 0;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lph;")
    public static class277 field4157;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)Z", line = 6)
    public static final boolean method1639(boolean arg0, int arg1) {
        field4153++;
        if (arg0) {
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILra;I)V", line = 32)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field4154++;
        if (arg2 == 0) {
            this.field4163 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field3153 = arg1.method357(false) == 1;
        }
        if (arg0 <= 108) {
            field4161 = -89;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[[I)V", line = 84)
    public static final void method1640(int arg0, int[][] arg1) {
        field4159++;
        int var2 = 8 / ((20 - arg0) / 49);
        class308.field5329 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Lke;", line = 94)
    public static final class256 method1641(int arg0, byte arg1) {
        field4162++;
        if (arg0 >= 999999999) {
            if (arg1 != 89) {
                field4156 = 86;
            }
            return class155.field2768;
        } else {
            return class305.method2125((byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[[I", line = 114)
    public final int[][] method55(int arg0, int arg1) {
        if (arg0 != 75) {
            method1643((byte) -37);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        field4158++;
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, 158, 0);
            int[][] var5 = this.method1314(arg1, 158, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var4[0];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4163;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class161.field2858; var16++) {
                    var6[var16] = var11[var16] + var12[var16];
                    var7[var16] = var10[var16] + var13[var16];
                    var8[var16] = var9[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var63 = 0; var63 < class161.field2858; var63++) {
                    var6[var63] = var11[var63] - var12[var63];
                    var7[var63] = var10[var63] - var13[var63];
                    var8[var63] = var9[var63] - var14[var63];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class161.field2858; var17++) {
                    var6[var17] = var11[var17] * var12[var17] >> 12;
                    var7[var17] = var10[var17] * var13[var17] >> 12;
                    var8[var17] = var9[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class161.field2858; var59++) {
                    int var60 = var14[var59];
                    int var61 = var13[var59];
                    int var62 = var12[var59];
                    var6[var59] = var62 == 0 ? 4096 : (var11[var59] << 12) / var62;
                    var7[var59] = var61 == 0 ? 4096 : (var10[var59] << 12) / var61;
                    var8[var59] = var60 == 0 ? 4096 : (var9[var59] << 12) / var60;
                }
            } else if (var15 == 5) {
                for (int var58 = 0; var58 < class161.field2858; var58++) {
                    var6[var58] = 4096 - ((4096 - var11[var58]) * (4096 - var12[var58]) >> 12);
                    var7[var58] = 4096 - ((4096 - var10[var58]) * (4096 - var13[var58]) >> 12);
                    var8[var58] = 4096 - ((4096 - var9[var58]) * (4096 - var14[var58]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var18 = 0; var18 < class161.field2858; var18++) {
                    int var19 = var12[var18];
                    int var20 = var13[var18];
                    int var21 = var14[var18];
                    var6[var18] = var19 < 2048 ? var11[var18] * var19 >> 11 : 4096 - ((4096 - var11[var18]) * (4096 - var19) >> 11);
                    var7[var18] = var20 < 2048 ? var10[var18] * var20 >> 11 : 4096 - ((4096 - var10[var18]) * (4096 - var20) >> 11);
                    var8[var18] = var21 < 2048 ? var9[var18] * var21 >> 11 : 4096 - ((4096 - var9[var18]) * (4096 - var21) >> 11);
                }
            } else if (var15 == 7) {
                for (int var54 = 0; var54 < class161.field2858; var54++) {
                    int var55 = var11[var54];
                    int var56 = var9[var54];
                    int var57 = var10[var54];
                    var6[var54] = var55 == 4096 ? 4096 : (var12[var54] << 12) / (4096 - var55);
                    var7[var54] = var57 == 4096 ? 4096 : (var13[var54] << 12) / (4096 - var57);
                    var8[var54] = var56 == 4096 ? 4096 : (var14[var54] << 12) / (4096 - var56);
                }
            } else if (var15 == 8) {
                for (int var50 = 0; var50 < class161.field2858; var50++) {
                    int var51 = var11[var50];
                    int var52 = var9[var50];
                    int var53 = var10[var50];
                    var6[var50] = var51 == 0 ? 0 : 4096 - (4096 - var12[var50] << 12) / var51;
                    var7[var50] = var53 == 0 ? 0 : 4096 - ((4096 - var13[var50] << 12) / var53);
                    var8[var50] = var52 == 0 ? 0 : 4096 - ((4096 - var14[var50] << 12) / var52);
                }
            } else if (var15 == 9) {
                for (int var43 = 0; var43 < class161.field2858; var43++) {
                    int var44 = var10[var43];
                    int var45 = var14[var43];
                    int var46 = var11[var43];
                    int var47 = var13[var43];
                    int var48 = var9[var43];
                    int var49 = var12[var43];
                    var6[var43] = var49 <= var46 ? var49 : var46;
                    var7[var43] = var44 < var47 ? var44 : var47;
                    var8[var43] = var45 > var48 ? var48 : var45;
                }
            } else if (var15 == 10) {
                for (int var22 = 0; var22 < class161.field2858; var22++) {
                    int var23 = var14[var22];
                    int var24 = var11[var22];
                    int var25 = var13[var22];
                    int var26 = var9[var22];
                    int var27 = var12[var22];
                    int var28 = var10[var22];
                    var6[var22] = var27 >= var24 ? var27 : var24;
                    var7[var22] = var28 > var25 ? var28 : var25;
                    var8[var22] = var26 <= var23 ? var23 : var26;
                }
            } else if (var15 == 11) {
                for (int var29 = 0; var29 < class161.field2858; var29++) {
                    int var30 = var13[var29];
                    int var31 = var11[var29];
                    int var32 = var9[var29];
                    int var33 = var10[var29];
                    int var34 = var12[var29];
                    int var35 = var14[var29];
                    var6[var29] = var34 < var31 ? var31 - var34 : var34 - var31;
                    var7[var29] = var30 >= var33 ? var30 - var33 : -var30 + var33;
                    var8[var29] = var32 > var35 ? var32 - var35 : -var32 + var35;
                }
            } else if (var15 == 12) {
                for (int var36 = 0; var36 < class161.field2858; var36++) {
                    int var37 = var12[var36];
                    int var38 = var9[var36];
                    int var39 = var11[var36];
                    int var40 = var13[var36];
                    int var41 = var10[var36];
                    int var42 = var14[var36];
                    var6[var36] = var39 + var37 - (var37 * var39 >> 11);
                    var7[var36] = var41 + var40 - (var40 * var41 >> 11);
                    var8[var36] = var38 + var42 - (var38 * var42 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII[Lsd;I[BZII)V", line = 434)
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, class37[] arg5, int arg6, byte[] arg7, boolean arg8, int arg9, int arg10) {
        if (arg10 != -26947) {
            return;
        }
        field4152++;
        byte var11;
        if (arg8) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg8) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && (arg3 + var13) > 0 && arg3 + var13 < 103) {
                        arg5[arg4].field653[arg1 + var12][arg3 + var13] = class150.method1123(arg5[arg4].field653[arg1 + var12][arg3 + var13], -16777217);
                    }
                }
            }
        }
        class41 var14 = new class41(arg7);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && var16 >= arg9 && (arg9 + 8) > var16 && arg6 <= var17 && var17 < (arg6 + 8)) {
                        class305.method2126(arg8, arg1 + class269.method1863(var16 & 0x7, 0, var17 & 0x7, arg0), var14, 0, arg4, arg0, 556238, class250.method1680(arg0, var16 & 0x7, var17 & 0x7, (byte) 121) + arg3, 0);
                    } else {
                        class305.method2126(arg8, -1, var14, 0, 0, 0, 556238, -1, 0);
                    }
                }
            }
        }
        boolean var18 = false;
        while (var14.field738 < var14.field772.length) {
            int var19 = var14.method357(false);
            if (var19 != 129) {
                var14.field738--;
                break;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = var14.method323(arg10 ^ 0xFFFFB539);
                if (var21 == 0) {
                    if (arg2 >= var20) {
                        int var29 = arg3;
                        int var30 = arg1 + 7;
                        int var31 = arg1;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        if (arg1 < 0) {
                            var31 = 0;
                        } else if (arg1 >= 104) {
                            var31 = 104;
                        }
                        if (arg3 < 0) {
                            var29 = 0;
                        } else if (arg3 >= 104) {
                            var29 = 104;
                        }
                        int var32 = arg3 + 7;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        while (var31 < var30) {
                            while (var29 < var32) {
                                class189.field3488[arg4][var31][var29] = 0;
                                var29++;
                            }
                            var31++;
                        }
                    }
                } else if (var21 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var14.method323(9092);
                            if (arg2 >= var20) {
                                int var25 = var22;
                                while (var22 + 4 > var25) {
                                    int var26 = var23;
                                    while ((var23 + 4) > var26) {
                                        if (arg9 <= var25 && var25 < arg9 + 8 && var26 >= arg6 && arg6 + 8 > arg6) {
                                            int var27 = arg1 + class269.method1863(var25 & 0x7, 0, var26 & 0x7, arg0);
                                            int var28 = class250.method1680(arg0, var25 & 0x7, var26 & 0x7, (byte) 121) + arg3;
                                            if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                                class189.field3488[arg4][var27][var28] = var24;
                                            }
                                        }
                                        var23++;
                                    }
                                    var22++;
                                }
                            }
                        }
                    }
                } else if (var21 != 2) {
                }
            }
        }
        if (class253.field4323 && !arg8) {
            class62 var33 = null;
            while (true) {
                while (var14.field772.length > var14.field738) {
                    int var34 = var14.method357(false);
                    if (var34 == 0) {
                        var33 = new class62(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method357(false);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class118 var37 = new class118(var14);
                                int var38 = var37.field2092 >> 7;
                                int var39 = var37.field2096 >> 7;
                                if (var37.field2099 == arg2 && arg9 <= var39 && var39 < arg9 + 8 && arg6 <= var38 && var38 < (arg6 + 8)) {
                                    int var40 = (arg1 << 7) + class222.method1528(var37.field2096 & 0x3FF, arg0, false, var37.field2092 & 0x3FF);
                                    int var41 = class37.method288(var37.field2096 & 0x3FF, var37.field2092 & 0x3FF, -1, arg0) + (arg3 << 7);
                                    var37.field2096 = var40;
                                    var37.field2092 = var41;
                                    int var42 = var37.field2096 >> 7;
                                    int var43 = var37.field2092 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var37.field2071 = (class308.field5296[1][var42][var43] & 0x2) != 0;
                                        var37.field2079 = class118.field2090[var37.field2099][var42][var43] - var37.field2079;
                                        class245.method1647(var37);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class62();
                }
                class163.field2889[arg1 >> 3][arg3 >> 3] = var33;
                break;
            }
        }
        if (var18) {
            return;
        }
        int var44 = arg1 + 7;
        int var45 = arg3 + 7;
        for (int var46 = arg1; var46 < var44; var46++) {
            for (int var47 = arg3; var47 < var45; var47++) {
                class189.field3488[arg4][var46][var47] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 754)
    public class244() {
        super(2, false);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V", line = 759)
    public static void method1643(byte arg0) {
        if (arg0 != -26) {
            method1640(-40, (int[][]) ((int[][]) null));
        }
        field4157 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V", line = 772)
    public static final void method1644(int arg0, boolean arg1) {
        class278.field4846 = 1000 / arg0;
        field4160++;
        if (!arg1) {
            method1641(47, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I", line = 788)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            return (int[]) null;
        }
        field4155++;
        int[] var3 = this.field3157.method1258(-110, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) 113);
            int[] var5 = this.method1312(1, arg0, (byte) -26);
            int var6 = this.field4163;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class161.field2858; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class161.field2858; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class161.field2858; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var26 = 0; var26 < class161.field2858; var26++) {
                    int var27 = var5[var26];
                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                }
            } else if (var6 == 5) {
                for (int var7 = 0; var7 < class161.field2858; var7++) {
                    var3[var7] = 4096 - ((4096 - var4[var7]) * (4096 - var5[var7]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class161.field2858; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 >= 2048 ? 4096 - ((4096 - var4[var8]) * (4096 - var9) >> 11) : var4[var8] * var9 >> 11;
                }
            } else if (var6 == 7) {
                for (int var24 = 0; var24 < class161.field2858; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 4096 ? 4096 : (var5[var24] << 12) / (4096 - var25);
                }
            } else if (var6 == 8) {
                for (int var22 = 0; var22 < class161.field2858; var22++) {
                    int var23 = var4[var22];
                    var3[var22] = var23 == 0 ? 0 : 4096 - ((4096 - var5[var22] << 12) / var23);
                }
            } else if (var6 == 9) {
                for (int var19 = 0; var19 < class161.field2858; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var20 >= var21 ? var21 : var20;
                }
            } else if (var6 == 10) {
                for (int var16 = 0; var16 < class161.field2858; var16++) {
                    int var17 = var5[var16];
                    int var18 = var4[var16];
                    var3[var16] = var18 <= var17 ? var17 : var18;
                }
            } else if (var6 == 11) {
                for (int var10 = 0; var10 < class161.field2858; var10++) {
                    int var11 = var4[var10];
                    int var12 = var5[var10];
                    var3[var10] = var12 >= var11 ? var12 - var11 : -var12 + var11;
                }
            } else if (var6 == 12) {
                for (int var13 = 0; var13 < class161.field2858; var13++) {
                    int var14 = var5[var13];
                    int var15 = var4[var13];
                    var3[var13] = var14 + var15 - (var14 * var15 >> 11);
                }
            }
        }
        return var3;
    }
}
