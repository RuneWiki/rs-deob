import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class770 extends class362 {

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    private int field10610 = 6;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Z")
    public static boolean field10614 = false;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Lpja;")
    public static class43 field10617 = new class43(32);

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Lhba;")
    public static class10 field10616;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method156(int arg0, int arg1) {
        ++field10612;
        int[] var3 = super.field4927.method808(-123, arg1);
        if (arg0 != -2026769311) {
            field10617 = null;
        }
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, arg0 ^ 2026769389);
            int[] var5 = this.method2221(1, arg1, 42);
            int var6 = this.field10610;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class769.field10597; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class769.field10597; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class769.field10597 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class769.field10597; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class769.field10597; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class769.field10597 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class769.field10597; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class769.field10597 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class769.field10597; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class769.field10597; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class769.field10597 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class769.field10597 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[[I", line = 253)
    public final int[][] method153(int arg0, byte arg1) {
        ++field10611;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            field10616 = null;
        }
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, arg0, 28008);
            int[][] var5 = this.method2222(1, arg0, 28008);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field10610;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class769.field10597; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var20 + var22 + -(var20 * var22 >> 11);
                                                                var7[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var8[var16] = -(var17 * var21 >> 11) + var17 + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class769.field10597; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var27 <= var29 ? -var27 + var29 : var27 - var29;
                                                            var7[var23] = ~var26 < ~var28 ? -var28 + var26 : -var26 + var28;
                                                            var8[var23] = var25 < var24 ? -var25 + var24 : -var24 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class769.field10597 < ~var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = var34 <= var33 ? var33 : var34;
                                                        var7[var30] = var32 > var35 ? var32 : var35;
                                                        var8[var30] = ~var31 > ~var36 ? var36 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class769.field10597; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var41 > var38 ? var38 : var41;
                                                    var7[var37] = var40 <= var43 ? var40 : var43;
                                                    var8[var37] = ~var42 < ~var39 ? var39 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class769.field10597 > var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 == -1 ? 0 : -((4096 - var12[var44] << 12) / var47) + 4096;
                                                var7[var44] = var46 != 0 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class769.field10597; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (4096 - var51) : 4096;
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class769.field10597; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11);
                                        var7[var52] = var54 >= 2048 ? -((4096 - var54) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : 4096 - ((4096 - var55) * (-var11[var52] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class769.field10597; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class769.field10597 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class769.field10597 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class769.field10597; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class769.field10597; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 568)
    public static void method4232(int arg0) {
        int var1 = 109 / ((arg0 - 41) / 63);
        field10616 = null;
        field10617 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V", line = 581)
    public static final void method4233(int arg0, int arg1) {
        ++field10615;
        if (arg0 != 4096) {
            field10617 = null;
        }
        class281 var2 = class54.method395((byte) -53, (long) arg1, 17);
        var2.method1818((byte) 86);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lfca;II)V", line = 599)
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method4232(-5);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4929 = arg0.method793((byte) 17) == 1;
            }
        } else {
            this.field10610 = arg0.method793((byte) 21);
        }
        ++field10613;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 640)
    public class770() {
        super(2, false);
    }
}
