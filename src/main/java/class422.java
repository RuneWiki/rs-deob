import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class422 extends class96 {

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    private int field5661 = 6;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "Ljava/lang/String;")
    public static String field5655 = "";

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "Lpi;")
    public static class340 field5659 = new class340(8, 7);

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "Z")
    public static boolean field5662 = false;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V", line = 3)
    public class422() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILbt;)V", line = 8)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field5658;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field1329 = arg2.method617(2) == 1;
            }
        } else {
            this.field5661 = arg2.method617(arg1 + 3);
        }
        if (arg1 != -1) {
            this.method36(-122, -113);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(FI[FIIFBIIII)V", line = 43)
    public static final void method2490(float arg0, int arg1, float[] arg2, int arg3, int arg4, float arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg4 - arg7;
        int var12 = arg10 - arg9;
        ++field5657;
        int var13 = arg3 - arg8;
        float var14 = arg2[2] * (float) var13 + arg2[0] * (float) var12 + arg2[1] * (float) var11;
        float var15 = arg2[5] * (float) var13 + arg2[4] * (float) var11 + arg2[3] * (float) var12;
        float var16 = arg2[8] * (float) var13 + arg2[6] * (float) var12 + arg2[7] * (float) var11;
        int var17 = 68 % ((arg6 - 9) / 59);
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var18 = arg0 * var18;
        }
        float var19 = var15 + 0.5F + arg5;
        if (arg1 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (~arg1 != -3) {
            if (arg1 == 3) {
                float var21 = var18;
                var18 = var19;
                var19 = -var21;
            }
        } else {
            var19 = -var19;
            var18 = -var18;
        }
        class334.field4285 = var19;
        class512.field7540 = var18;
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V", line = 96)
    public static void method2491(int arg0) {
        field5655 = null;
        field5659 = null;
        if (arg0 != 5) {
            field5659 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)[I", line = 108)
    public final int[] method37(int arg0, int arg1) {
        ++field5660;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, arg0, -1);
            int[] var5 = this.method657(1, arg0, -1);
            int var6 = this.field5661;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class269.field3403 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class269.field3403 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class269.field3403; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class269.field3403 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class269.field3403 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class269.field3403 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class269.field3403 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class269.field3403; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class269.field3403 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class269.field3403 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class269.field3403; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class269.field3403; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg1 != 255) {
            this.method31(114, 21, (class88) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I", line = 359)
    public final int[][] method36(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method37(-102, -11);
        }
        ++field5656;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -55, arg1);
            int[][] var5 = this.method659(1, -96, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5661;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class269.field3403; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var18 * var19 >> 11) + var18 + var19;
                                                                var7[var16] = -(var17 * var21 >> 11) + var17 - -var21;
                                                                var8[var16] = -(var20 * var22 >> 11) + var20 + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class269.field3403; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var26 > ~var24 ? var24 - var26 : var26 - var24;
                                                            var7[var23] = ~var27 >= ~var29 ? -var27 + var29 : var27 - var29;
                                                            var8[var23] = var28 < var25 ? -var28 + var25 : -var25 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class269.field3403 < ~var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var35 < ~var34 ? var35 : var34;
                                                        var7[var30] = ~var32 < ~var36 ? var32 : var36;
                                                        var8[var30] = ~var31 < ~var33 ? var31 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class269.field3403 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var40 < var42 ? var40 : var42;
                                                    var7[var37] = ~var41 <= ~var39 ? var39 : var41;
                                                    var8[var37] = ~var38 > ~var43 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class269.field3403 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 != 0 ? -((4096 - var12[var44] << 12) / var46) + 4096 : 0;
                                                var7[var44] = var45 != 0 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class269.field3403; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var50);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class269.field3403; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var55 >= 2048 ? 4096 - ((4096 - var10[var52]) * (-var55 + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : 4096 - ((4096 - var11[var52]) * (-var54 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class269.field3403; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class269.field3403; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class269.field3403 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class269.field3403 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class269.field3403; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
