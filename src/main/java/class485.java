import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class485 extends class314 {

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    private int field7105 = 6;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "[J")
    public static long[] field7106 = new long[32];

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "Lqe;")
    public static class433 field7108 = new class433();

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLie;I)V", line = 5)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field7103;
        if (arg0 > -1) {
            this.method5((byte) -49, (class6) null, -12);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field4936 = arg1.method70(-9059) == 1;
            }
        } else {
            this.field7105 = arg1.method70(-9059);
        }
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V", line = 42)
    public static void method2976(int arg0) {
        if (arg0 != 1) {
            method2976(44);
        }
        field7108 = null;
        field7106 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 626)
    public class485() {
        super(2, false);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[[I", line = 58)
    public final int[][] method4(int arg0, byte arg1) {
        ++field7104;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 < 68) {
            this.method6(-103, -70);
        }
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[][] var5 = this.method2143(1, arg0, (byte) -4);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field7105;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class81.field1009; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var9[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var18 - -var17 - (var17 * var18 >> 11);
                                                                var7[var16] = var19 + var20 - (var19 * var20 >> 11);
                                                                var8[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class81.field1009 < ~var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var26 >= var27 ? var26 - var27 : var27 - var26;
                                                            var7[var23] = var24 > var25 ? -var25 + var24 : -var24 + var25;
                                                            var8[var23] = ~var29 <= ~var28 ? -var28 + var29 : var28 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class81.field1009 < ~var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var32 <= ~var33 ? var32 : var33;
                                                        var7[var30] = ~var36 <= ~var34 ? var36 : var34;
                                                        var8[var30] = ~var35 > ~var31 ? var31 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class81.field1009 > var37; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var42 < var41 ? var42 : var41;
                                                    var7[var37] = ~var39 > ~var43 ? var39 : var43;
                                                    var8[var37] = var38 <= var40 ? var38 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class81.field1009 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var7[var44] = var47 == 0 ? 0 : -((4096 - var13[var44] << 12) / var47) + 4096;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class81.field1009; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class81.field1009 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var53 <= -2049 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var55 <= -2049 ? -((4096 - var11[var52]) * (4096 - var55) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class81.field1009 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class81.field1009 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; class81.field1009 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class81.field1009; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class81.field1009 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I", line = 378)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            return null;
        } else {
            ++field7107;
            int[] var3 = super.field4928.method534((byte) -87, arg0);
            if (super.field4928.field618) {
                int[] var4 = this.method2140(0, arg0, -126);
                int[] var5 = this.method2140(1, arg0, -122);
                int var6 = this.field7105;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; var7 < class81.field1009; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var9 - ((var8 * var9 >> 11) + -var8);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class81.field1009 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; class81.field1009 > var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var15 >= var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class81.field1009 > var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class81.field1009; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class81.field1009 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class81.field1009 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class81.field1009 < ~var25; ++var25) {
                                        var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class81.field1009 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class81.field1009 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class81.field1009; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class81.field1009 < ~var30; ++var30) {
                        var3[var30] = var4[var30] - -var5[var30];
                    }
                }
            }
            return var3;
        }
    }
}
