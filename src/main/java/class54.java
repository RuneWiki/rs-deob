import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class54 extends class184 {

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    private int field711 = 6;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Ldq;")
    public static class493 field715 = new class493(12, -1);

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field714;

    static {
        new class335((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BILfh;)V", line = 5)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field2406 = arg2.method2737(false) == 1;
            }
        } else {
            this.field711 = arg2.method2737(false);
        }
        int var5 = 60 % ((arg0 - -13) / 51);
        ++field713;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)[[I", line = 38)
    public final int[][] method13(int arg0, int arg1) {
        ++field712;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            this.method6(5, 92);
        }
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[][] var5 = this.method1163(1, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field711;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class245.field3167 < ~var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var22 - (-var20 - -(var20 * var22 >> 11));
                                                                var7[var16] = var21 - -var19 - (var19 * var21 >> 11);
                                                                var8[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class245.field3167 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = var27 < var24 ? var24 - var27 : -var24 + var27;
                                                            var7[var23] = ~var25 > ~var26 ? -var25 + var26 : var25 - var26;
                                                            var8[var23] = ~var29 < ~var28 ? -var28 + var29 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class245.field3167; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = var35 < var31 ? var31 : var35;
                                                        var7[var30] = ~var34 >= ~var33 ? var33 : var34;
                                                        var8[var30] = ~var32 < ~var36 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class245.field3167 < ~var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var43 >= var40 ? var40 : var43;
                                                    var7[var37] = var39 >= var38 ? var38 : var39;
                                                    var8[var37] = ~var42 < ~var41 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class245.field3167; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 != -1 ? -((-var12[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var7[var44] = var46 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class245.field3167; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class245.field3167 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var54 >= 2048 ? -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((4096 - var10[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class245.field3167 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class245.field3167; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class245.field3167; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class245.field3167 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class245.field3167 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V", line = 357)
    public static void method527(int arg0) {
        field715 = null;
        int var1 = 36 / ((-68 - arg0) / 38);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I", line = 367)
    public final int[] method6(int arg0, int arg1) {
        ++field714;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            method527(98);
        }
        if (super.field2409.field436) {
            int[] var4 = this.method1159(114, arg0, 0);
            int[] var5 = this.method1159(arg1 + -483, arg0, 1);
            int var6 = this.field711;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class245.field3167; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class245.field3167; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class245.field3167; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class245.field3167; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class245.field3167; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class245.field3167 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class245.field3167 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class245.field3167; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class245.field3167 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class245.field3167; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class245.field3167 < ~var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class245.field3167; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 615)
    public class54() {
        super(2, false);
    }
}
