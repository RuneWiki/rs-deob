import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class279 extends class62 {

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    private int field3909 = 6;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Z")
    public static boolean field3910 = false;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field3913;

    static {
        new class572("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)[I", line = 3)
    public final int[] method13(int arg0, int arg1) {
        ++field3908;
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            int[] var5 = this.method408(arg0, 1, (byte) -69);
            int var6 = this.field3909;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class438.field5847; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class438.field5847; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class438.field5847 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class438.field5847; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class438.field5847 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class438.field5847 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class438.field5847; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class438.field5847 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class438.field5847; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class438.field5847; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class438.field5847 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class438.field5847; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg1 != 656024161) {
            field3910 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lgw;II)V", line = 252)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field3912;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field788 = ~arg0.method1032((byte) -33) == -2;
            }
        } else {
            this.field3909 = arg0.method1032((byte) -33);
        }
        if (arg1 != -1) {
            field3910 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lgw;Z)Lvb;", line = 287)
    public static final class169 method1747(class148 arg0, boolean arg1) {
        ++field3907;
        if (arg1) {
            field3913 = 92;
        }
        class169 var2 = new class169();
        var2.field2638 = arg0.method1045(true);
        var2.field2641 = class192.field2857.method275(var2.field2638, -6);
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)[[I", line = 314)
    public final int[][] method409(int arg0, byte arg1) {
        ++field3911;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[][] var5 = this.method407(1, (byte) 41, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3909;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class438.field5847 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var7[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                                var8[var16] = var18 - -var20 + -(var18 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class438.field5847; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = ~var27 < ~var29 ? -var29 + var27 : var29 - var27;
                                                            var7[var23] = ~var24 >= ~var28 ? -var24 + var28 : -var28 + var24;
                                                            var8[var23] = ~var25 < ~var26 ? -var26 + var25 : -var25 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class438.field5847 > var30; ++var30) {
                                                        int var31 = var12[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var34 < ~var31 ? var34 : var31;
                                                        var7[var30] = var32 >= var36 ? var32 : var36;
                                                        var8[var30] = ~var35 >= ~var33 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class438.field5847 > var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var42 >= var40 ? var40 : var42;
                                                    var7[var37] = ~var43 < ~var41 ? var41 : var43;
                                                    var8[var37] = ~var38 <= ~var39 ? var39 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class438.field5847; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : -((4096 - var13[var44] << 12) / var46) + 4096;
                                                var8[var44] = ~var47 == -1 ? 0 : 4096 - (4096 - var14[var44] << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class438.field5847 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class438.field5847; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = var53 >= 2048 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class438.field5847 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class438.field5847; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class438.field5847; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class438.field5847; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class438.field5847 > var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return arg1 >= -20 ? null : var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 628)
    public class279() {
        super(2, false);
    }
}
