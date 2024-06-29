import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class104 extends class68 {

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    private int field1451 = 6;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "[Ljj;")
    public static class107[] field1450 = new class107[50];

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "[[[I")
    public static int[][][] field1454;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)[Lag;")
    public static final class189[] method677(int arg0) {
        ++field1444;
        class189[] var1 = new class189[class175.field2465];
        for (int var2 = arg0; ~class175.field2465 < ~var2; ++var2) {
            var1[var2] = new class72(class21.field296, class287.field4535, class273.field4208[var2], class198.field2749[var2], class50.field729[var2], class39.field576[var2], class140.field1956[var2], class9.field79);
        }
        class15.method88(arg0 + -15971);
        return var1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        int var3 = -82 % ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[][] var6 = this.method429(1, arg0, 2);
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var5[1];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var4[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field1451;
            if (var16 != 1) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (~var16 != -5) {
                            if (~var16 != -6) {
                                if (~var16 != -7) {
                                    if (var16 != 7) {
                                        if (var16 != 8) {
                                            if (~var16 != -10) {
                                                if (~var16 != -11) {
                                                    if (~var16 != -12) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class89.field1248 > var17; ++var17) {
                                                                int var18 = var15[var17];
                                                                int var19 = var12[var17];
                                                                int var20 = var14[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var9[var17];
                                                                var13[var17] = -(var19 * var22 >> 11) + var19 + var22;
                                                                var8[var17] = var23 - -var20 + -(var20 * var23 >> 11);
                                                                var7[var17] = -(var18 * var21 >> 11) + var18 + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class89.field1248 > var24; ++var24) {
                                                            int var25 = var14[var24];
                                                            int var26 = var9[var24];
                                                            int var27 = var10[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var11[var24];
                                                            int var30 = var12[var24];
                                                            var13[var24] = var30 < var27 ? -var30 + var27 : var30 - var27;
                                                            var8[var24] = ~var25 > ~var26 ? -var25 + var26 : -var26 + var25;
                                                            var7[var24] = ~var29 < ~var28 ? -var28 + var29 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class89.field1248; ++var31) {
                                                        int var32 = var15[var31];
                                                        int var33 = var10[var31];
                                                        int var34 = var9[var31];
                                                        int var35 = var14[var31];
                                                        int var36 = var11[var31];
                                                        int var37 = var12[var31];
                                                        var13[var31] = ~var33 < ~var37 ? var33 : var37;
                                                        var8[var31] = ~var35 > ~var34 ? var34 : var35;
                                                        var7[var31] = ~var32 <= ~var36 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; var38 < class89.field1248; ++var38) {
                                                    int var39 = var14[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var12[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var9[var38];
                                                    int var44 = var11[var38];
                                                    var13[var38] = var41 <= var42 ? var41 : var42;
                                                    var8[var38] = var39 > var43 ? var43 : var39;
                                                    var7[var38] = ~var40 < ~var44 ? var44 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class89.field1248 > var45; ++var45) {
                                                int var46 = var9[var45];
                                                int var47 = var10[var45];
                                                int var48 = var11[var45];
                                                var13[var45] = ~var47 != -1 ? -((-var12[var45] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var45] = ~var46 != -1 ? -((-var14[var45] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var45] = ~var48 != -1 ? -((-var15[var45] + 4096 << 12) / var48) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~class89.field1248 < ~var49; ++var49) {
                                            int var50 = var10[var49];
                                            int var51 = var11[var49];
                                            int var52 = var9[var49];
                                            var13[var49] = ~var50 == -4097 ? 4096 : (var12[var49] << 12) / (-var50 + 4096);
                                            var8[var49] = var52 != 4096 ? (var14[var49] << 12) / (-var52 + 4096) : 4096;
                                            var7[var49] = var51 == 4096 ? 4096 : (var15[var49] << 12) / (4096 - var51);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class89.field1248; ++var53) {
                                        int var54 = var12[var53];
                                        int var55 = var15[var53];
                                        int var56 = var14[var53];
                                        var13[var53] = var54 < 2048 ? var10[var53] * var54 >> 11 : -((4096 - var10[var53]) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var53] = var56 < 2048 ? var9[var53] * var56 >> 11 : -((-var9[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                        var7[var53] = var55 < 2048 ? var11[var53] * var55 >> 11 : -((4096 - var55) * (-var11[var53] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class89.field1248; ++var57) {
                                    var13[var57] = -((-var10[var57] + 4096) * (-var12[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((-var9[var57] + 4096) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var7[var57] = -((4096 - var11[var57]) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; class89.field1248 > var58; ++var58) {
                                int var59 = var15[var58];
                                int var60 = var12[var58];
                                int var61 = var14[var58];
                                var13[var58] = var60 != 0 ? (var10[var58] << 12) / var60 : 4096;
                                var8[var58] = var61 != 0 ? (var9[var58] << 12) / var61 : 4096;
                                var7[var58] = var59 != 0 ? (var11[var58] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class89.field1248; ++var62) {
                            var13[var62] = var10[var62] * var12[var62] >> 12;
                            var8[var62] = var9[var62] * var14[var62] >> 12;
                            var7[var62] = var11[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class89.field1248; ++var63) {
                        var13[var63] = var10[var63] + -var12[var63];
                        var8[var63] = var9[var63] + -var14[var63];
                        var7[var63] = var11[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class89.field1248 < ~var64; ++var64) {
                    var13[var64] = var10[var64] + var12[var64];
                    var8[var64] = var9[var64] + var14[var64];
                    var7[var64] = var11[var64] + var15[var64];
                }
            }
        }
        ++field1448;
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lqg;IIIIIIZ)V")
    public static final void method678(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1474.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field1474[var9] - class124.field1745;
            int var23 = arg0.field1478[var9] - class21.field309;
            int var24 = arg0.field1473[var9] - class65.field889;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1479 != null) {
                class106.field1477[var9] = var25;
                class106.field1482[var9] = var28;
                class106.field1466[var9] = var29;
            }
            class106.field1485[var9] = (var25 << 9) / var29 + class90.field1261;
            class106.field1480[var9] = (var28 << 9) / var29 + class90.field1256;
        }
        class90.field1268 = 0;
        int var10 = arg0.field1467.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field1467[var11];
            int var13 = arg0.field1483[var11];
            int var14 = arg0.field1481[var11];
            int var15 = class106.field1485[var12];
            int var16 = class106.field1485[var13];
            int var17 = class106.field1485[var14];
            int var18 = class106.field1480[var12];
            int var19 = class106.field1480[var13];
            int var20 = class106.field1480[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class65.field885 && class44.method296(class90.field1261 + class68.field914, class90.field1256 + class44.field660, var18, var19, var20, var15, var16, var17)) {
                    class233.field3520 = arg5;
                    class172.field2400 = arg6;
                }
                if (!arg7) {
                    class90.field1265 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class90.field1254 || var16 > class90.field1254 || var17 > class90.field1254) {
                        class90.field1265 = true;
                    }
                    if (arg0.field1479 != null && arg0.field1479[var11] != -1) {
                        if (class212.field3187) {
                            if (arg0.field1470) {
                                class90.method589(var18, var19, var20, var15, var16, var17, arg0.field1487[var11], arg0.field1475[var11], arg0.field1469[var11], class106.field1477[0], class106.field1477[1], class106.field1477[3], class106.field1482[0], class106.field1482[1], class106.field1482[3], class106.field1466[0], class106.field1466[1], class106.field1466[3], arg0.field1479[var11]);
                            } else {
                                class90.method589(var18, var19, var20, var15, var16, var17, arg0.field1487[var11], arg0.field1475[var11], arg0.field1469[var11], class106.field1477[var12], class106.field1477[var13], class106.field1477[var14], class106.field1482[var12], class106.field1482[var13], class106.field1482[var14], class106.field1466[var12], class106.field1466[var13], class106.field1466[var14], arg0.field1479[var11]);
                            }
                        } else {
                            int var21 = class90.field1260.method911(108, arg0.field1479[var11]);
                            class90.method574(var18, var19, var20, var15, var16, var17, class227.method1503(var21, arg0.field1487[var11]), class227.method1503(var21, arg0.field1475[var11]), class227.method1503(var21, arg0.field1469[var11]));
                        }
                    } else if (arg0.field1487[var11] != 12345678) {
                        class90.method574(var18, var19, var20, var15, var16, var17, arg0.field1487[var11], arg0.field1475[var11], arg0.field1469[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lhc;I)I")
    public static final int method679(class235 arg0, int arg1) {
        int var2 = arg1;
        ++field1446;
        if (arg0.method1570((byte) -39, class28.field358)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1570((byte) -39, class245.field3745)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1450 = null;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field926 = arg0.method1453((byte) -127) == 1;
            }
        } else {
            this.field1451 = arg0.method1453((byte) -127);
        }
        ++field1456;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class104() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field1449;
        if (arg1 >= -118) {
            this.method28((class224) null, -117, true);
        }
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            int[] var5 = this.method423(1, (byte) -54, arg0);
            int var6 = this.field1451;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class89.field1248; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class89.field1248 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class89.field1248 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class89.field1248 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 <= var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class89.field1248; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class89.field1248; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class89.field1248; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class89.field1248 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class89.field1248 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class89.field1248; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class89.field1248; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class89.field1248; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
    public static final void method680(int arg0) {
        ++field1447;
        if (arg0 == 0) {
            for (class215 var1 = (class215) class41.field607.method990(-128); var1 != null; var1 = (class215) class41.field607.method993(-49)) {
                if (var1.field3239 > 0) {
                    --var1.field3239;
                }
                if (~var1.field3239 != -1) {
                    if (~var1.field3244 < -1) {
                        --var1.field3244;
                    }
                    if (~var1.field3244 == -1 && ~var1.field3230 <= -2 && var1.field3232 >= 1 && var1.field3230 <= 102 && ~var1.field3232 >= -103 && (~var1.field3249 > -1 || class222.method1432(var1.field3237, -3122, var1.field3249))) {
                        class246.method1660(var1.field3243, var1.field3230, var1.field3232, var1.field3242, 3, var1.field3237, var1.field3249, var1.field3252);
                        var1.field3244 = -1;
                        if (~var1.field3249 == ~var1.field3235 && var1.field3235 == -1) {
                            var1.method1115(72);
                        } else if (var1.field3249 == var1.field3235 && ~var1.field3252 == ~var1.field3241 && ~var1.field3238 == ~var1.field3237) {
                            var1.method1115(-124);
                        }
                    }
                } else if (~var1.field3235 > -1 || class222.method1432(var1.field3238, -3122, var1.field3235)) {
                    class246.method1660(var1.field3243, var1.field3230, var1.field3232, var1.field3242, 3, var1.field3238, var1.field3235, var1.field3241);
                    var1.method1115(arg0 ^ -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3) {
        ++field1453;
        if (arg0 > 61) {
            int var4 = class168.field2312 * arg3 >> 8;
            if (var4 != 0 && arg1 != -1) {
                class199.method1272(false, class50.field726, 96, 0, arg1, var4);
                class49.field709 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        ++field1452;
        if (class78.field1091 < 128.0F) {
            class78.field1091 = 128.0F;
        }
        int var1 = class221.field3314 >> 7;
        if (class78.field1091 > 383.0F) {
            class78.field1091 = 383.0F;
        }
        int var2 = class240.field3679 >> 7;
        while (class68.field912 >= 2048.0F) {
            class68.field912 -= 2048.0F;
        }
        while (class68.field912 < 0.0F) {
            class68.field912 += 2048.0F;
        }
        if (arg0 != -92) {
            method678((class106) null, -49, 117, -123, 64, 117, 94, false);
        }
        int var3 = 0;
        int var4 = class275.method1836(class295.field4642, class240.field3679, class221.field3314, -124);
        if (var1 > 3 && var2 > 3 && var1 < 100 && ~var2 > -101) {
            for (int var5 = var1 - 4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; ~var6 >= ~(var2 + 4); ++var6) {
                    int var7 = class295.field4642;
                    if (~var7 > -4 && ~(2 & class230.field3489[1][var5][var6]) == -3) {
                        ++var7;
                    }
                    int var8 = var4 - class200.field2788[var7][var5][var6] - -((class228.field3447[var7][var5][var6] & 255) * 8);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (~var9 < -98049) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (~var9 >= ~class236.field3596) {
            if (class236.field3596 > var9) {
                class236.field3596 += (-class236.field3596 + var9) / 80;
                return;
            }
        } else {
            class236.field3596 += (-class236.field3596 + var9) / 24;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILta;)V")
    public static final void method683(int arg0, class262 arg1) {
        if (arg1.field3958 != null) {
            arg1.field3958.field3944 = 0;
        }
        ++field1457;
        int var2 = 77 / ((-56 - arg0) / 52);
        arg1.field3956 = false;
        for (class262 var3 = arg1.method355(); var3 != null; var3 = arg1.method358()) {
            method683(86, var3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method684(boolean arg0) {
        field1454 = null;
        field1450 = null;
        if (arg0) {
            method678((class106) null, -11, -51, -14, -21, 125, -14, false);
        }
    }
}
