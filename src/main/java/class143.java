import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class143 extends class751 {

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    private int field1835 = 6;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)Ljd;", line = 5)
    public static final class239 method987(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5432;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I", line = 18)
    public final int[] method365(int arg0, int arg1) {
        ++field1832;
        if (arg1 != 4095) {
            return null;
        } else {
            int[] var3 = super.field10405.method3601(true, arg0);
            if (super.field10405.field8923) {
                int[] var4 = this.method4173(arg0, (byte) -128, 0);
                int[] var5 = this.method4173(arg0, (byte) -117, 1);
                int var6 = this.field1835;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (var6 != 9) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; class673.field9452 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class673.field9452 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 <= ~var11 ? var12 - var11 : var11 - var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class673.field9452; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; var16 < class673.field9452; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class673.field9452 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class673.field9452 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class673.field9452; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class673.field9452 > var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class673.field9452; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class673.field9452 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class673.field9452; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; class673.field9452 > var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)[[I", line = 263)
    public final int[][] method147(int arg0, byte arg1) {
        ++field1831;
        if (arg1 != 57) {
            this.method147(83, (byte) 32);
        }
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, 1);
            int[][] var5 = this.method4172(1, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1835;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class673.field9452 < ~var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var17 - -var20 - (var17 * var20 >> 11);
                                                                var7[var16] = var18 - -var19 + -(var18 * var19 >> 11);
                                                                var8[var16] = var22 - -var21 + -(var21 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class673.field9452 < ~var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var25 < var27 ? -var25 + var27 : -var27 + var25;
                                                            var7[var23] = ~var26 <= ~var24 ? -var24 + var26 : -var26 + var24;
                                                            var8[var23] = var28 >= var29 ? -var29 + var28 : -var28 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class673.field9452; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = ~var33 <= ~var36 ? var33 : var36;
                                                        var7[var30] = var34 >= var35 ? var34 : var35;
                                                        var8[var30] = ~var32 <= ~var31 ? var32 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class673.field9452; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var38 <= var43 ? var38 : var43;
                                                    var7[var37] = ~var39 <= ~var41 ? var41 : var39;
                                                    var8[var37] = ~var40 >= ~var42 ? var40 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class673.field9452 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var45) + 4096;
                                                var8[var44] = var47 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class673.field9452 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class673.field9452; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 <= -2049 ? -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class673.field9452; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class673.field9452; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class673.field9452 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class673.field9452 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class673.field9452 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBZ)V", line = 582)
    public static final void method988(int arg0, byte arg1, boolean arg2) {
        ++field1830;
        class692 var3 = arg2 ? class777.field10725 : class48.field689;
        if (var3 != null && ~arg0 <= -1 && var3.field9770 > arg0) {
            class88 var4 = var3.field9778[arg0];
            if (~var4.field1147 == 0) {
                String var5 = var4.field1148;
                class731 var6 = class155.method1222(260, class283.field4347, class237.field3417);
                var6.field10211.method851((byte) -2, 3 - -class233.method1612(1, var5));
                var6.field10211.method851((byte) -2, !arg2 ? 0 : 1);
                if (arg1 == -83) {
                    var6.field10211.method860(arg0, (byte) 114);
                    var6.field10211.method880(true, var5);
                    class533.method3088(var6, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 615)
    public class143() {
        super(2, false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILrv;I)V", line = 618)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field1834;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field10415 = ~arg1.method842(2384) == -2;
            }
        } else {
            this.field1835 = arg1.method842(2384);
        }
        int var5 = 127 % ((25 - arg0) / 63);
    }
}
