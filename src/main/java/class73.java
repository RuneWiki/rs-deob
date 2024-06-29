import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class73 extends class175 {

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    private int field1250 = 6;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Lmb;")
    private static class96 field1248 = class243.method1708("Take", (byte) 93);

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lmb;")
    public static class96 field1251 = field1248;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "[I")
    public static int[] field1253 = new int[32];

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lha;")
    public static class22 field1252 = new class22(64);

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field1255 = 0;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field1256 = 0;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1251 = null;
        if (arg0 <= -69) {
            field1252 = null;
            field1253 = null;
            field1248 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field1245;
        int[] var3 = super.field3044.method904((byte) -73, arg1);
        if (super.field3044.field2150) {
            int[] var4 = this.method1255(0, arg1, 128);
            int[] var5 = this.method1255(1, arg1, 128);
            int var6 = this.field1250;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class1.field11; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class1.field11; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 > ~var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class1.field11; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class1.field11; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class1.field11; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class1.field11 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class1.field11; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class1.field11; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (4096 - var5[var25]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class1.field11 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class1.field11; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class1.field11; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class1.field11 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        int var31 = -39 / ((arg0 - 62) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            field1251 = null;
        }
        ++field1247;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, -2880, 0);
            int[][] var5 = this.method1253(arg0, -2880, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1250;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class1.field11; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var19 * var20 >> 11) + var19 + var20;
                                                                var7[var16] = -(var21 * var22 >> 11) + var22 + var21;
                                                                var8[var16] = var17 - (var17 * var18 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class1.field11 > var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var26 <= var25 ? var25 - var26 : -var25 + var26;
                                                            var7[var23] = var27 >= var28 ? var27 - var28 : var28 - var27;
                                                            var8[var23] = ~var24 > ~var29 ? var29 - var24 : -var29 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class1.field11; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = var36 < var34 ? var34 : var36;
                                                        var7[var30] = ~var31 <= ~var32 ? var31 : var32;
                                                        var8[var30] = ~var33 <= ~var35 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class1.field11; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var41 >= ~var40 ? var41 : var40;
                                                    var7[var37] = var38 <= var43 ? var38 : var43;
                                                    var8[var37] = ~var39 <= ~var42 ? var42 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class1.field11 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var46 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var45 != -1 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class1.field11 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class1.field11; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var54 >= 2048 ? -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : 4096 - ((4096 - var55) * (-var11[var52] + 4096) >> 11);
                                        var8[var52] = ~var53 <= -2049 ? -((4096 - var10[var52]) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class1.field11 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = -((-var11[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var10[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class1.field11; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class1.field11 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var11[var61] * var13[var61] >> 12;
                            var8[var61] = var10[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class1.field11 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var11[var62] + -var13[var62];
                        var8[var62] = var10[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class1.field11; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var11[var63] + var13[var63];
                    var8[var63] = var10[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        ++field1243;
        int var1 = class71.field1216.method125(class206.field3538);
        for (int var2 = 0; field1254 > var2; ++var2) {
            int var7 = class71.field1216.method125(class93.method656((byte) 66, var2));
            if (~var1 > ~var7) {
                var1 = var7;
            }
        }
        int var3 = class122.field2267;
        var1 += 8;
        int var4 = field1254 * 15 + 21;
        int var5 = class146.field2601 - var1 / 2;
        if (var5 - -var1 > class232.field3979) {
            var5 = -var1 + class232.field3979;
        }
        int var6 = 28 / ((arg0 - -30) / 54);
        if (var5 < 0) {
            var5 = 0;
        }
        if (class168.field2954 < var3 - -var4) {
            var3 = class168.field2954 - var4;
        }
        if (~var3 > -1) {
            var3 = 0;
        }
        if (class71.field1223 != 1) {
            if (class167.field2950 == class146.field2601 && class272.field4722 == class122.field2267) {
                class64.field1095 = var1;
                class232.field3980 = field1254 * 15 + 22;
                class145.field2574 = var5;
                class170.field2981 = true;
                class71.field1223 = 0;
                class55.field950 = var3;
            } else {
                class140.field2504 = class272.field4722;
                class71.field1223 = 1;
                class17.field253 = class167.field2950;
            }
        } else if (class17.field253 == class146.field2601 && class140.field2504 == class122.field2267) {
            class55.field950 = var3;
            class145.field2574 = var5;
            class71.field1223 = 0;
            class170.field2981 = true;
            class232.field3980 = field1254 * 15 - -22;
            class64.field1095 = var1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class73() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -118 / ((-22 - arg0) / 58);
        ++field1246;
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field3034 = ~arg2.method1651(4139) == -2;
            }
        } else {
            this.field1250 = arg2.method1651(4139);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILff;)[Lmj;")
    public static final class246[] method530(int arg0, int arg1, int arg2, class3 arg3) {
        if (arg2 >= -33) {
            field1256 = -1;
        }
        ++field1244;
        return !class224.method1530(arg1, arg0, (byte) 125, arg3) ? null : class48.method372(14933);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(JI)V")
    public static final void method531(long arg0, int arg1) {
        ++field1249;
        if (arg0 != 0L) {
            ++class118.field2196;
            class140.field2505.method1012((byte) 98, 136);
            class140.field2505.method1668(arg0, -50);
            if (arg1 != 1168643819) {
                field1253 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V")
    public static final void method532(int arg0, int arg1, int arg2) {
        ++field1242;
        class43 var3 = class270.method1847(arg0, arg1 + -10290, 13);
        var3.method333(arg1 ^ arg1);
        var3.field740 = arg2;
    }
}
