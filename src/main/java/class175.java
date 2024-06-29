import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class175 extends class298 {

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    private int field2106 = 6;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Lec;")
    public static class40 field2102 = new class40("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ldd;")
    public static class229 field2103;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I", line = 3)
    public final int[] method13(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field2097;
            int[] var3 = super.field4443.method2877(arg0, 1);
            if (super.field4443.field6915) {
                int[] var4 = this.method1882(0, -2594, arg0);
                int[] var5 = this.method1882(1, -2594, arg0);
                int var6 = this.field2106;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~var7 > ~class158.field1877; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class158.field1877; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class158.field1877 < ~var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var15 <= var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class158.field1877 < ~var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 > var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class158.field1877; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~var21 > ~class158.field1877; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class158.field1877; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class158.field1877 > var25; ++var25) {
                                        var3[var25] = 4096 - ((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; class158.field1877 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class158.field1877; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class158.field1877; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; class158.field1877 > var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I", line = 250)
    public final int[][] method157(int arg0, int arg1) {
        if (arg0 != -24032) {
            return null;
        } else {
            ++field2100;
            int[][] var3 = super.field4454.method1638((byte) -103, arg1);
            if (super.field4454.field3886) {
                int[][] var4 = this.method1878(0, arg1, 61);
                int[][] var5 = this.method1878(1, arg1, 87);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field2106;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (~var15 != -7) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; class158.field1877 > var16; ++var16) {
                                                                    int var17 = var9[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var14[var16];
                                                                    int var20 = var10[var16];
                                                                    int var21 = var11[var16];
                                                                    int var22 = var13[var16];
                                                                    var6[var16] = var17 - -var18 + -(var17 * var18 >> 11);
                                                                    var7[var16] = -(var20 * var22 >> 11) + var20 - -var22;
                                                                    var8[var16] = var21 - ((var19 * var21 >> 11) + -var19);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class158.field1877; ++var23) {
                                                                int var24 = var11[var23];
                                                                int var25 = var12[var23];
                                                                int var26 = var9[var23];
                                                                int var27 = var14[var23];
                                                                int var28 = var13[var23];
                                                                int var29 = var10[var23];
                                                                var6[var23] = var26 <= var25 ? -var26 + var25 : -var25 + var26;
                                                                var7[var23] = ~var28 <= ~var29 ? -var29 + var28 : var29 - var28;
                                                                var8[var23] = var24 > var27 ? -var27 + var24 : -var24 + var27;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class158.field1877; ++var30) {
                                                            int var31 = var12[var30];
                                                            int var32 = var9[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var13[var30];
                                                            int var36 = var14[var30];
                                                            var6[var30] = var32 > var31 ? var32 : var31;
                                                            var7[var30] = var34 > var35 ? var34 : var35;
                                                            var8[var30] = var36 < var33 ? var33 : var36;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~class158.field1877 < ~var37; ++var37) {
                                                        int var38 = var11[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var9[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var10[var37];
                                                        int var43 = var12[var37];
                                                        var6[var37] = ~var40 > ~var43 ? var40 : var43;
                                                        var7[var37] = ~var42 > ~var41 ? var42 : var41;
                                                        var8[var37] = ~var38 > ~var39 ? var38 : var39;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~class158.field1877 < ~var44; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var11[var44];
                                                    var6[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                    var7[var44] = var46 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var46 : 0;
                                                    var8[var44] = var47 == 0 ? 0 : 4096 - (4096 - var14[var44] << 12) / var47;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class158.field1877 > var48; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (4096 - var50);
                                                var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                                var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~var52 > ~class158.field1877; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                            var7[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                            var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class158.field1877; ++var56) {
                                        var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                        var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~class158.field1877 < ~var57; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var14[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = ~var58 == -1 ? 4096 : (var9[var57] << 12) / var58;
                                    var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                    var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~var61 > ~class158.field1877; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class158.field1877; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; class158.field1877 > var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V", line = 569)
    public static void method859(byte arg0) {
        if (arg0 >= -68) {
            field2103 = null;
        }
        field2102 = null;
        field2103 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([[BLkt;B)V", line = 580)
    public static final void method860(byte[][] arg0, class51 arg1, byte arg2) {
        int var3 = 0;
        if (arg2 >= 4) {
            while (arg1.field2691 > var3) {
                class199.method1094((byte) -47);
                for (int var4 = 0; var4 < class159.field1895 >> 3; ++var4) {
                    for (int var5 = 0; ~var5 > ~(class289.field4316 >> 3); ++var5) {
                        int var6 = class79.field952[var3][var4][var5];
                        if (~var6 != 0) {
                            int var7 = (55661873 & var6) >> 24;
                            if (!arg1.field2692 || var7 == 0) {
                                int var8 = (7 & var6) >> 1;
                                int var9 = (var6 & 16761815) >> 14;
                                int var10 = (var6 & 16383) >> 3;
                                int var11 = (var9 / 8 << 8) - -(var10 / 8);
                                for (int var12 = 0; class217.field3034.length > var12; ++var12) {
                                    if (~class217.field3034[var12] == ~var11 && arg0[var12] != null) {
                                        arg1.method278(var5 * 8, var7, class174.field2093, var8, arg0[var12], var3, class231.field3205, var4 * 8, (byte) 54, (7 & var10) * 8, (var9 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ++var3;
            }
            ++field2101;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I", line = 654)
    public static final int method861(int arg0) {
        int var1 = -24 % ((-3 - arg0) / 35);
        ++field2098;
        return class432.field6257;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 665)
    public class175() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILvt;)V", line = 668)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 <= -44) {
            ++field2105;
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field4449 = ~arg2.method895((byte) -98) == -2;
                }
            } else {
                this.field2106 = arg2.method895((byte) -124);
            }
        }
    }
}
