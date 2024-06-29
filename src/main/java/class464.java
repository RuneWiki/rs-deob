import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class464 extends class4 {

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    private int field6603 = 6;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "Lba;")
    public static class607 field6599 = new class607(8);

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class464() {
        super(2, false);
    }

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "(I)V")
    public static void method2675(int arg0) {
        field6599 = null;
        if (arg0 != -22295) {
            method2675(-80);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field44 = ~arg1.method3045(-127) == -2;
            }
        } else {
            this.field6603 = arg1.method3045(-125);
        }
        if (arg0 < -89) {
            ++field6602;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field6600;
        if (arg1 > -83) {
            return null;
        } else {
            int[][] var3 = super.field38.method3021((byte) 89, arg0);
            if (super.field38.field7618) {
                int[][] var4 = this.method22(arg0, (byte) -76, 0);
                int[][] var5 = this.method22(arg0, (byte) -93, 1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field6603;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (~var15 != -7) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; class132.field1627 > var16; ++var16) {
                                                                    int var17 = var14[var16];
                                                                    int var18 = var11[var16];
                                                                    int var19 = var12[var16];
                                                                    int var20 = var10[var16];
                                                                    int var21 = var13[var16];
                                                                    int var22 = var9[var16];
                                                                    var6[var16] = var22 - -var19 + -(var19 * var22 >> 11);
                                                                    var7[var16] = var20 - -var21 + -(var20 * var21 >> 11);
                                                                    var8[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class132.field1627 > var23; ++var23) {
                                                                int var24 = var9[var23];
                                                                int var25 = var10[var23];
                                                                int var26 = var13[var23];
                                                                int var27 = var14[var23];
                                                                int var28 = var12[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = var24 > var28 ? -var28 + var24 : -var24 + var28;
                                                                var7[var23] = ~var25 < ~var26 ? -var26 + var25 : -var25 + var26;
                                                                var8[var23] = var27 < var29 ? var29 - var27 : -var29 + var27;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class132.field1627; ++var30) {
                                                            int var31 = var13[var30];
                                                            int var32 = var14[var30];
                                                            int var33 = var12[var30];
                                                            int var34 = var9[var30];
                                                            int var35 = var10[var30];
                                                            int var36 = var11[var30];
                                                            var6[var30] = ~var33 <= ~var34 ? var33 : var34;
                                                            var7[var30] = var35 > var31 ? var35 : var31;
                                                            var8[var30] = ~var32 <= ~var36 ? var32 : var36;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class132.field1627; ++var37) {
                                                        int var38 = var10[var37];
                                                        int var39 = var13[var37];
                                                        int var40 = var11[var37];
                                                        int var41 = var14[var37];
                                                        int var42 = var9[var37];
                                                        int var43 = var12[var37];
                                                        var6[var37] = var43 > var42 ? var42 : var43;
                                                        var7[var37] = ~var39 < ~var38 ? var38 : var39;
                                                        var8[var37] = ~var41 < ~var40 ? var40 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~class132.field1627 < ~var44; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = ~var46 != -1 ? -((4096 - var12[var44] << 12) / var46) + 4096 : 0;
                                                    var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                    var8[var44] = ~var45 == -1 ? 0 : -((4096 - var14[var44] << 12) / var45) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class132.field1627 > var48; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var11[var48];
                                                int var51 = var10[var48];
                                                var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                                var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                                var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class132.field1627 < ~var52; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var13[var52];
                                            int var55 = var14[var52];
                                            var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((4096 - var9[var52]) * (-var53 + 4096) >> 11) + 4096;
                                            var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class132.field1627; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class132.field1627; ++var57) {
                                    int var58 = var12[var57];
                                    int var59 = var14[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                    var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                    var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class132.field1627; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class132.field1627 < ~var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class132.field1627 < ~var63; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILtm;Ltm;)V")
    public static final void method2676(int arg0, int arg1, int arg2, class486 arg3, class486 arg4) {
        class563 var5 = class423.method2492(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7885 = arg3;
            var5.field7889 = arg4;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lkr;B)V")
    public static final void method2677(class329 arg0, byte arg1) {
        int var2 = -5 % ((26 - arg1) / 39);
        ++field6604;
        class523.field7290 = 0;
        class404.field5542 = 0;
        class2.field18 = new class311();
        class109.field1414 = new class533[1024];
        class453.field6429 = new class309[class375.field5224[class21.field306] + 1];
        class436.field5930 = 0;
        class68.field896 = 0;
        class380.method2316(arg0, 14282);
        class111.method603(9639, arg0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field6601;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (arg0 != 10) {
            return null;
        } else {
            if (super.field31.field5127) {
                int[] var4 = this.method20(0, -21986, arg1);
                int[] var5 = this.method20(1, -21986, arg1);
                int var6 = this.field6603;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; var7 < class132.field1627; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; var10 < class132.field1627; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var11 < ~var12 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class132.field1627; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var15 < var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class132.field1627 > var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class132.field1627 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class132.field1627 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class132.field1627 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class132.field1627 < ~var25; ++var25) {
                                        var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class132.field1627; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class132.field1627; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class132.field1627; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class132.field1627; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }
}
