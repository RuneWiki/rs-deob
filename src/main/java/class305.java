import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class305 extends class748 {

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
    private int field3962 = 6;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field10414 = ~arg2.method194((byte) 119) == -2;
            }
        } else {
            this.field3962 = arg2.method194((byte) 119);
        }
        if (arg1) {
            this.method20(105, false, (class26) null);
        }
        ++field3964;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field3960;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            field3963 = 113;
        }
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(0, (byte) -122, arg0);
            int[] var5 = this.method4157(1, (byte) 112, arg0);
            int var6 = this.field3962;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class424.field5889 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class424.field5889 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class424.field5889; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class424.field5889 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class424.field5889; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class424.field5889; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class424.field5889; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class424.field5889; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class424.field5889; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class424.field5889 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class424.field5889; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class424.field5889; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    public class305() {
        super(2, false);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Lcj;")
    public static final class443 method1786(int arg0, byte arg1) {
        if (arg1 >= -62) {
            method1786(56, (byte) -108);
        }
        ++field3965;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    if ((double) class531.field7430 == 3.0D) {
                        return class480.field6526;
                    }
                    if ((double) class531.field7430 == 4.0D) {
                        return class164.field2259;
                    }
                    if ((double) class531.field7430 == 6.0D) {
                        return class192.field2795;
                    }
                    if ((double) class531.field7430 >= 8.0D) {
                        return class151.field2090;
                    }
                }
            } else {
                if ((double) class531.field7430 == 3.0D) {
                    return class501.field7005;
                }
                if ((double) class531.field7430 == 4.0D) {
                    return class433.field5944;
                }
                if ((double) class531.field7430 == 6.0D) {
                    return class480.field6526;
                }
                if ((double) class531.field7430 >= 8.0D) {
                    return class164.field2259;
                }
            }
        } else {
            if ((double) class531.field7430 == 3.0D) {
                return class701.field9761;
            }
            if ((double) class531.field7430 == 4.0D) {
                return class108.field1545;
            }
            if ((double) class531.field7430 == 6.0D) {
                return class501.field7005;
            }
            if ((double) class531.field7430 >= 8.0D) {
                return class433.field5944;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field3961;
            int[][] var3 = super.field10420.method930(arg1 ^ 29784, arg0);
            if (super.field10420.field1979) {
                int[][] var4 = this.method4159(0, 0, arg0);
                int[][] var5 = this.method4159(1, arg1, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field3962;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (var15 != 8) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~class424.field5889 < ~var16; ++var16) {
                                                                    int var17 = var11[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var14[var16];
                                                                    int var20 = var13[var16];
                                                                    int var21 = var9[var16];
                                                                    int var22 = var10[var16];
                                                                    var6[var16] = var21 - -var18 - (var18 * var21 >> 11);
                                                                    var7[var16] = var20 + var22 - (var20 * var22 >> 11);
                                                                    var8[var16] = -(var17 * var19 >> 11) + var19 + var17;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class424.field5889 > var23; ++var23) {
                                                                int var24 = var9[var23];
                                                                int var25 = var12[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = var25 < var24 ? var24 - var25 : -var24 + var25;
                                                                var7[var23] = var27 >= var28 ? -var28 + var27 : -var27 + var28;
                                                                var8[var23] = ~var29 < ~var26 ? var29 - var26 : -var29 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; class424.field5889 > var30; ++var30) {
                                                            int var31 = var12[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var14[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var9[var30];
                                                            int var36 = var13[var30];
                                                            var6[var30] = ~var31 > ~var35 ? var35 : var31;
                                                            var7[var30] = var34 > var36 ? var34 : var36;
                                                            var8[var30] = var33 >= var32 ? var33 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; class424.field5889 > var37; ++var37) {
                                                        int var38 = var11[var37];
                                                        int var39 = var10[var37];
                                                        int var40 = var13[var37];
                                                        int var41 = var12[var37];
                                                        int var42 = var14[var37];
                                                        int var43 = var9[var37];
                                                        var6[var37] = ~var43 <= ~var41 ? var41 : var43;
                                                        var7[var37] = var40 <= var39 ? var40 : var39;
                                                        var8[var37] = ~var38 > ~var42 ? var38 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~var44 > ~class424.field5889; ++var44) {
                                                    int var45 = var10[var44];
                                                    int var46 = var11[var44];
                                                    int var47 = var9[var44];
                                                    var6[var44] = ~var47 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                    var7[var44] = ~var45 != -1 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                    var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class424.field5889; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var11[var48];
                                                int var51 = var10[var48];
                                                var6[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                                var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                                var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class424.field5889; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var12[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((4096 - var9[var52]) * (4096 - var54) >> 11) + 4096;
                                            var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var8[var52] = var53 >= 2048 ? -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; ~var56 > ~class424.field5889; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class424.field5889; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var13[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                    var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                    var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~class424.field5889 < ~var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class424.field5889 < ~var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class424.field5889 < ~var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }
}
