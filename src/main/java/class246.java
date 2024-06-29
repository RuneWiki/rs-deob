import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class246 extends class175 {

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    private int field4289 = 6;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Lij;")
    public static class50 field4286 = class78.method578(125, "lila:");

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        int var1 = -2 / ((77 - arg0) / 49);
        ++field4288;
        class45.field822.method762((byte) 117);
        class209.field3473.method762((byte) 117);
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V")
    public static final void method1678(int arg0) {
        if (arg0 < 49) {
            field4286 = null;
        }
        ++field4287;
        if (class20.field425 != null) {
            class20.field425.method630(2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -67);
        ++field4290;
        if (arg1 != -20740) {
            this.field4289 = 99;
        }
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) -115);
            int[][] var5 = this.method1206(1, arg0, (byte) 100);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var4[1];
            int[] var14 = var5[1];
            int var15 = this.field4289;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class211.field3514; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var8[var16] = -(var19 * var21 >> 11) + var21 + var19;
                                                                var6[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                var7[var16] = var22 - (var17 * var22 >> 11) + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class211.field3514; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var11[var23];
                                                            var8[var23] = ~var27 < ~var29 ? -var29 + var27 : var29 - var27;
                                                            var6[var23] = var25 < var26 ? var26 - var25 : var25 - var26;
                                                            var7[var23] = var24 >= var28 ? -var28 + var24 : -var24 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class211.field3514 < ~var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var14[var30];
                                                        var8[var30] = var34 <= var35 ? var35 : var34;
                                                        var6[var30] = ~var32 < ~var36 ? var32 : var36;
                                                        var7[var30] = var31 < var33 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class211.field3514 > var37; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var11[var37];
                                                    var8[var37] = var42 >= var43 ? var43 : var42;
                                                    var6[var37] = ~var38 < ~var41 ? var41 : var38;
                                                    var7[var37] = ~var40 < ~var39 ? var39 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class211.field3514; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var13[var44];
                                                int var47 = var10[var44];
                                                var8[var44] = var45 == 0 ? 0 : -((-var11[var44] + 4096 << 12) / var45) + 4096;
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class211.field3514 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var13[var48];
                                            var8[var48] = ~var50 != -4097 ? (var11[var48] << 12) / (-var50 + 4096) : 4096;
                                            var6[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class211.field3514 < ~var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var11[var52];
                                        var8[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var6[var52] = var54 >= 2048 ? -((4096 - var13[var52]) * (-var54 + 4096) >> 11) + 4096 : var13[var52] * var54 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class211.field3514; ++var56) {
                                    var8[var56] = -((4096 - var9[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = 4096 - ((-var13[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                    var7[var56] = -((4096 - var10[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class211.field3514 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var11[var57];
                                int var60 = var14[var57];
                                var8[var57] = var59 != 0 ? (var9[var57] << 12) / var59 : 4096;
                                var6[var57] = var60 == 0 ? 4096 : (var13[var57] << 12) / var60;
                                var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class211.field3514; ++var61) {
                            var8[var61] = var9[var61] * var11[var61] >> 12;
                            var6[var61] = var13[var61] * var14[var61] >> 12;
                            var7[var61] = var10[var61] * var12[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class211.field3514 < ~var62; ++var62) {
                        var8[var62] = var9[var62] + -var11[var62];
                        var6[var62] = var13[var62] + -var14[var62];
                        var7[var62] = var10[var62] - var12[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class211.field3514 < ~var63; ++var63) {
                    var8[var63] = var9[var63] + var11[var63];
                    var6[var63] = var13[var63] + var14[var63];
                    var7[var63] = var10[var63] - -var12[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        int var1 = 109 / ((18 - arg0) / 46);
        field4286 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            return null;
        } else {
            int[] var3 = super.field2941.method1427(-21281, arg0);
            ++field4284;
            if (super.field2941.field3565) {
                int[] var4 = this.method1210(0, arg0, arg1 + 44491);
                int[] var5 = this.method1210(1, arg0, 16745);
                int var6 = this.field4289;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; ~var7 > ~class211.field3514; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var9 - (-var8 - -(var8 * var9 >> 11));
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class211.field3514 > var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var11 > ~var12 ? var12 - var11 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class211.field3514; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var14 >= var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class211.field3514 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 > var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class211.field3514 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class211.field3514 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class211.field3514 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; var25 < class211.field3514; ++var25) {
                                        var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class211.field3514; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class211.field3514; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class211.field3514; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class211.field3514; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field4292;
        if (arg0) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    super.field2925 = ~arg2.method1487(255) == -2;
                }
            } else {
                this.field4289 = arg2.method1487(255);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class246() {
        super(2, false);
    }
}
