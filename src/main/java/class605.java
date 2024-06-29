import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class605 extends class328 {

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    private int field8610 = 6;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field8613 = 1;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "Lpp;")
    public static class464 field8612 = new class464(13, 8);

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field8617 = -1;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lbv;")
    public static class567 field8616 = new class567("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method3447(boolean arg0) {
        field8612 = null;
        field8616 = null;
        if (!arg0) {
            field8617 = 74;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field8607;
        int[][] var3 = super.field4725.method1886((byte) -76, arg0);
        int var4 = 10 % ((46 - arg1) / 54);
        if (super.field4725.field4371) {
            int[][] var5 = this.method2040(0, arg0, 0);
            int[][] var6 = this.method2040(1, arg0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field8610;
            if (var16 != 1) {
                if (~var16 != -3) {
                    if (~var16 != -4) {
                        if (~var16 != -5) {
                            if (var16 != 5) {
                                if (var16 != 6) {
                                    if (~var16 != -8) {
                                        if (var16 != 8) {
                                            if (var16 != 9) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class449.field6539 > var17; ++var17) {
                                                                int var18 = var14[var17];
                                                                int var19 = var10[var17];
                                                                int var20 = var12[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var13[var17];
                                                                int var23 = var15[var17];
                                                                var7[var17] = -(var19 * var22 >> 11) + var22 + var19;
                                                                var8[var17] = -(var18 * var21 >> 11) + var21 + var18;
                                                                var9[var17] = -(var20 * var23 >> 11) + var20 + var23;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~class449.field6539 < ~var24; ++var24) {
                                                            int var25 = var12[var24];
                                                            int var26 = var14[var24];
                                                            int var27 = var10[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var13[var24];
                                                            int var30 = var11[var24];
                                                            var7[var24] = var27 <= var29 ? var29 - var27 : -var29 + var27;
                                                            var8[var24] = ~var30 >= ~var26 ? var26 - var30 : var30 - var26;
                                                            var9[var24] = var28 < var25 ? -var28 + var25 : -var25 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~class449.field6539 < ~var31; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var13[var31];
                                                        int var34 = var10[var31];
                                                        int var35 = var12[var31];
                                                        int var36 = var14[var31];
                                                        int var37 = var15[var31];
                                                        var7[var31] = ~var33 <= ~var34 ? var33 : var34;
                                                        var8[var31] = var36 >= var32 ? var36 : var32;
                                                        var9[var31] = ~var35 < ~var37 ? var35 : var37;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; var38 < class449.field6539; ++var38) {
                                                    int var39 = var10[var38];
                                                    int var40 = var11[var38];
                                                    int var41 = var15[var38];
                                                    int var42 = var12[var38];
                                                    int var43 = var13[var38];
                                                    int var44 = var14[var38];
                                                    var7[var38] = var39 < var43 ? var39 : var43;
                                                    var8[var38] = var44 <= var40 ? var44 : var40;
                                                    var9[var38] = var41 <= var42 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class449.field6539 > var45; ++var45) {
                                                int var46 = var12[var45];
                                                int var47 = var10[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = var47 != 0 ? -((-var13[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var45] = ~var48 == -1 ? 0 : -((4096 - var14[var45] << 12) / var48) + 4096;
                                                var9[var45] = ~var46 == -1 ? 0 : -((-var15[var45] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class449.field6539 > var49; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var10[var49];
                                            int var52 = var12[var49];
                                            var7[var49] = ~var51 != -4097 ? (var13[var49] << 12) / (-var51 + 4096) : 4096;
                                            var8[var49] = ~var50 != -4097 ? (var14[var49] << 12) / (-var50 + 4096) : 4096;
                                            var9[var49] = var52 != 4096 ? (var15[var49] << 12) / (-var52 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class449.field6539; ++var53) {
                                        int var54 = var13[var53];
                                        int var55 = var15[var53];
                                        int var56 = var14[var53];
                                        var7[var53] = ~var54 > -2049 ? var10[var53] * var54 >> 11 : -((-var10[var53] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var53] = ~var56 <= -2049 ? 4096 - ((-var11[var53] + 4096) * (-var56 + 4096) >> 11) : var11[var53] * var56 >> 11;
                                        var9[var53] = ~var55 > -2049 ? var12[var53] * var55 >> 11 : -((4096 - var12[var53]) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~class449.field6539 < ~var57; ++var57) {
                                    var7[var57] = 4096 - ((4096 - var10[var57]) * (-var13[var57] + 4096) >> 12);
                                    var8[var57] = -((-var11[var57] + 4096) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((4096 - var15[var57]) * (-var12[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; var58 < class449.field6539; ++var58) {
                                int var59 = var15[var58];
                                int var60 = var14[var58];
                                int var61 = var13[var58];
                                var7[var58] = var61 != 0 ? (var10[var58] << 12) / var61 : 4096;
                                var8[var58] = var60 == 0 ? 4096 : (var11[var58] << 12) / var60;
                                var9[var58] = var59 != 0 ? (var12[var58] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class449.field6539; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class449.field6539; ++var63) {
                        var7[var63] = var10[var63] - var13[var63];
                        var8[var63] = var11[var63] + -var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class449.field6539 < ~var64; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] + var15[var64];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class605() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lra;Lqa;IIIIZ)V")
    public static final void method3448(class259 arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            class214.field3242.method953((class68.field1285 - class214.field3242.method955()) / 2, (class442.field6464 - class214.field3242.method960()) / 2);
            class477.field6821.method953((class68.field1285 + -class477.field6821.method955()) / 2, 18);
        }
        ++field8609;
        String var7 = "";
        if (class640.field9282 != class202.field2846) {
            if (class78.field1412 == class640.field9282) {
                var7 = class80.field1437.method3220(false, class538.field7500);
            }
        } else {
            var7 = class305.field4390.method3220(false, class538.field7500);
        }
        arg0.method1635(var7, class68.field1285 / 2, -1, arg4 ^ 16777213, class442.field6464 / 2 + -26, arg3);
        int var8 = class442.field6464 / 2 + -18;
        arg1.method638(class68.field1285 / 2 + -152, var8, 304, 34, arg2, 0);
        arg1.method638(class68.field1285 / 2 + -151, var8 - -1, 302, 32, 0, 0);
        arg1.method653(class68.field1285 / arg4 + -150, var8 + 2, class133.field2149 * 3, 30, arg5, 0);
        arg1.method653(class133.field2149 * 3 + class68.field1285 / 2 + -150, var8 + 2, -(class133.field2149 * 3) + 300, 30, 0, 0);
        arg0.method1635(class451.field6556, class68.field1285 / 2, -1, 16777215, class442.field6464 / 2 + 4, arg3);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
    public static final void method3449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class268.field3911 = arg0;
        class409.field6071 = arg2;
        if (arg3 == 3) {
            class183.field2638 = arg1;
            ++field8614;
            class222.field3350 = arg4;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 < 75) {
            method3448((class259) null, (class167) null, 70, -65, 74, -123, true);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field4728 = ~arg2.method1738(255) == -2;
            }
        } else {
            this.field8610 = arg2.method1738(255);
        }
        ++field8615;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field8608;
        int var3 = -26 / ((48 - arg1) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            int[] var6 = this.method2042(1, arg0, (byte) 119);
            int var7 = this.field8610;
            if (var7 != 1) {
                if (var7 != 2) {
                    if (~var7 != -4) {
                        if (~var7 != -5) {
                            if (var7 != 5) {
                                if (~var7 != -7) {
                                    if (var7 != 7) {
                                        if (var7 != 8) {
                                            if (~var7 != -10) {
                                                if (~var7 != -11) {
                                                    if (~var7 != -12) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; ~class449.field6539 < ~var8; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var4[var8] = var9 - -var10 - (var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; var11 < class449.field6539; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = var13 < var12 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; class449.field6539 > var14; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var4[var14] = var15 < var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; var17 < class449.field6539; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var4[var17] = var18 >= var19 ? var19 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class449.field6539; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = ~var21 == -1 ? 0 : -((4096 - var6[var20] << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; var22 < class449.field6539; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = ~var23 != -4097 ? (var6[var22] << 12) / (4096 - var23) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class449.field6539; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((4096 - var25) * (-var5[var24] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class449.field6539; ++var26) {
                                    var4[var26] = -((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~var27 > ~class449.field6539; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = ~var28 == -1 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class449.field6539; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class449.field6539; ++var30) {
                        var4[var30] = var5[var30] - var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class449.field6539; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIFFIZF)[F")
    public static final float[] method3450(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, boolean arg6, float arg7) {
        ++field8611;
        if (arg6) {
            method3447(false);
        }
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[7] = 0.0F;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg0) / var19;
                var16 = (float) arg5 / var19;
            }
            var13[4] = var15;
            var13[8] = var16 * var16 * var18 + var15;
            var13[2] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var13[5] = var14 * var17;
            var13[6] = var14 * var16 * var18;
            var13[1] = var16 * var17;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg3;
        var9[0] *= arg4;
        var9[3] *= arg7;
        var9[1] *= arg4;
        var9[4] *= arg7;
        var9[7] *= arg3;
        var9[8] *= arg3;
        var9[5] *= arg7;
        var9[2] *= arg4;
        return var9;
    }
}
