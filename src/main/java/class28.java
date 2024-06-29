import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 extends class601 {

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    private int field442 = 6;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[I")
    public static int[] field441 = new int[500];

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lhda;")
    public static class752 field436 = new class752(115, 2);

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lkaa;")
    public static class47 field445 = new class47(27, 8);

    @OriginalMember(owner = "client!o", name = "L", descriptor = "F")
    public static float field444;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
    public static boolean field446;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(Z)Lk;")
    public static final class566 method254(boolean arg0) {
        ++field440;
        try {
            if (arg0) {
                method256(2);
            }
            return (class566) Class.forName("si").newInstance();
        } catch (Throwable var1) {
            return new class106();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field437;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            field444 = -0.18052602F;
        }
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 0);
            int[] var5 = this.method3266((byte) 64, arg1, 1);
            int var6 = this.field442;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class171.field2624; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class171.field2624; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 >= var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class171.field2624; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class171.field2624 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class171.field2624 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class171.field2624 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class171.field2624; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class171.field2624; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class171.field2624 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class171.field2624 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class171.field2624; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class171.field2624; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class28() {
        super(2, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        ++field438;
        if (!class718.field9926) {
            class394.field5492 += (-12.0F - class394.field5492) / 2.0F;
            class718.field9926 = true;
            int var1 = -76 / ((arg0 - 73) / 35);
            class616.field8238 = true;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 == 4096) {
            field445 = null;
            field441 = null;
            field436 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field439;
        if (!arg1) {
            field445 = null;
        }
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[][] var4 = this.method3268(arg0, 0, 65535);
            int[][] var5 = this.method3268(arg0, 1, 65535);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field442;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class171.field2624 > var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var17 + var21 - (var17 * var21 >> 11);
                                                                var7[var16] = var18 - -var20 - (var18 * var20 >> 11);
                                                                var8[var16] = var19 - (-var22 - -(var19 * var22 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class171.field2624 < ~var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var27 > ~var28 ? -var27 + var28 : -var28 + var27;
                                                            var7[var23] = ~var29 > ~var25 ? var25 - var29 : -var25 + var29;
                                                            var8[var23] = var26 >= var24 ? -var24 + var26 : var24 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class171.field2624; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var35 >= ~var33 ? var33 : var35;
                                                        var7[var30] = var32 >= var34 ? var32 : var34;
                                                        var8[var30] = var31 < var36 ? var36 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class171.field2624; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var43 > ~var42 ? var43 : var42;
                                                    var7[var37] = var38 >= var40 ? var40 : var38;
                                                    var8[var37] = var41 >= var39 ? var39 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class171.field2624; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : -((4096 - var12[var44] << 12) / var47) + 4096;
                                                var7[var44] = ~var45 != -1 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                                var8[var44] = var46 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class171.field2624; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class171.field2624 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((4096 - var53) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((4096 - var10[var52]) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class171.field2624 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class171.field2624 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class171.field2624; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class171.field2624; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class171.field2624 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            field444 = 0.19108169F;
        }
        ++field443;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field7897 = ~arg0.method3821((byte) -107) == -2;
            }
        } else {
            this.field442 = arg0.method3821((byte) 105);
        }
    }
}
