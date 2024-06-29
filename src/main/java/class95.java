import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class95 extends class300 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    private int field1432 = 6;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Lmd;")
    public static class239 field1425;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIILvl;)Lnj;")
    public static final class215 method647(boolean arg0, int arg1, int arg2, class73 arg3) {
        ++field1433;
        if (!arg0) {
            field1424 = 82;
        }
        return !class135.method862(arg1, arg2, (byte) 99, arg3) ? null : class111.method736(31271);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)V")
    public static final void method648(int arg0, int arg1) {
        ++field1428;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (~arg1 < -11) {
            arg1 = 10;
        }
        class261.field4242 += arg1 * 128;
        if (class302.field4810.length < class261.field4242) {
            int var3 = (int) (12.0D * Math.random());
            class261.field4242 -= class302.field4810.length;
            class275.method1904(class16.field225[var3], (byte) -9);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (-arg1 + var2) * 128;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            int var26 = class90.field1363[var4 - -var5] - class302.field4810[class261.field4242 + var4 & class302.field4810.length - 1] * arg1 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class90.field1363[var4++] = var26;
        }
        for (int var8 = -arg1 + var2; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class90.field1363[var23 + var24] = 255;
                } else {
                    class90.field1363[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; ~var9 > ~(-arg1 + var2); ++var9) {
            class189.field2947[var9] = class189.field2947[arg1 + var9];
        }
        for (int var10 = -arg1 + var2; var2 > var10; ++var10) {
            class189.field2947[var10] = (int) (Math.sin((double) class14.field209 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class14.field209 / 15.0D) + 12.0D * Math.sin((double) class14.field209 / 16.0D));
            ++class14.field209;
        }
        class11.field168 += arg1;
        if (arg0 == 4096) {
            int var11 = (arg1 - -(1 & class311.field4996)) / 2;
            if (~var11 < -1) {
                for (int var12 = 0; ~var12 > ~class11.field168; ++var12) {
                    int var21 = 2 + (int) (Math.random() * 124.0D);
                    int var22 = (int) (Math.random() * 128.0D) + 128;
                    class90.field1363[(var22 << 7) + var21] = 192;
                }
                class11.field168 = 0;
                for (int var13 = 0; var2 > var13; ++var13) {
                    int var18 = 0;
                    int var19 = var13 * 128;
                    for (int var20 = -var11; ~var20 > -129; ++var20) {
                        if (~(var11 + var20) > -129) {
                            var18 += class90.field1363[var20 - (-var11 + -var19)];
                        }
                        if (-var11 - 1 + var20 >= 0) {
                            var18 -= class90.field1363[var19 - var11 - 1 + var20];
                        }
                        if (var20 >= 0) {
                            class310.field4988[var19 + var20] = var18 / (var11 * 2 + 1);
                        }
                    }
                }
                for (int var14 = 0; var14 < 128; ++var14) {
                    int var15 = 0;
                    for (int var16 = -var11; var16 < var2; ++var16) {
                        int var17 = var16 * 128;
                        if (~(var11 + var16) > ~var2) {
                            var15 += class310.field4988[var14 - (-(var11 * 128) + -var17)];
                        }
                        if (-var11 + var16 + -1 >= 0) {
                            var15 -= class310.field4988[-((var11 + 1) * 128) + var14 + var17];
                        }
                        if (var16 >= 0) {
                            class90.field1363[var14 - -var17] = var15 / (var11 * 2 - -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIILpj;ZIIZ)Lnj;")
    public static final class215 method649(int arg0, boolean arg1, int arg2, int arg3, class172 arg4, boolean arg5, int arg6, int arg7, boolean arg8) {
        ++field1431;
        class162 var9 = class104.method696((byte) -26, arg0);
        if (~arg7 < -2 && var9.field2466 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; ++var11) {
                if (var9.field2476[var11] <= arg7 && ~var9.field2476[var11] != -1) {
                    var10 = var9.field2466[var11];
                }
            }
            if (var10 != -1) {
                var9 = class104.method696((byte) -26, var10);
            }
        }
        class51 var12 = var9.method1121(arg4, -6);
        if (var12 == null) {
            return null;
        } else {
            class48 var13 = null;
            if (var9.field2490 != -1) {
                var13 = (class48) method649(var9.field2454, true, 1, -85, arg4, false, 0, 10, true);
                if (var13 == null) {
                    return null;
                }
            } else if (var9.field2472 != -1) {
                var13 = (class48) method649(var9.field2459, false, arg2, 96, arg4, false, arg6, arg7, true);
                if (var13 == null) {
                    return null;
                }
            }
            int var14 = class151.field2225;
            int[] var15 = class151.field2226;
            int var16 = class151.field2231;
            int[] var17 = new int[4];
            class151.method1043(var17);
            class48 var18 = new class48(36, 32);
            class151.method1045(var18.field602, 36, 32);
            class221.method1569();
            int var19 = -51 / ((-3 - arg3) / 43);
            class221.method1570(16, 16);
            int var20 = var9.field2442;
            if (!arg1) {
                if (arg2 == 2) {
                    var20 = (int) ((double) var20 * 1.04D);
                }
            } else {
                var20 = (int) ((double) var20 * 1.5D);
            }
            class221.field3474 = false;
            int var21 = class221.field3465[var9.field2468] * var20 >> 16;
            int var22 = class221.field3468[var9.field2468] * var20 >> 16;
            var12.method312(0, var9.field2481, var9.field2426, var9.field2468, var9.field2428, var22 + -(var12.method4() / 2) + var9.field2461, var21 - -var9.field2461, -1L);
            if (arg2 >= 1) {
                var18.method289(1);
                if (~arg2 <= -3) {
                    var18.method289(16777215);
                }
                class151.method1045(var18.field602, 36, 32);
            }
            if (arg6 != 0) {
                var18.method280(arg6);
            }
            if (var9.field2490 != -1) {
                var13.method285(0, 0);
            } else if (var9.field2472 != -1) {
                class151.method1045(var13.field602, 36, 32);
                var18.method285(0, 0);
                var18 = var13;
            }
            if (arg5 && (~var9.field2422 == -2 || arg7 != 1) && arg7 != -1) {
                class21.field280.method1486(class33.method170((byte) -7, arg7), 0, 9, 16776960, 1);
            }
            class151.method1045(var15, var14, var16);
            class151.method1039(var17);
            class221.method1569();
            class221.field3474 = true;
            return var18;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static void method650(byte arg0) {
        if (arg0 != 41) {
            field1424 = -34;
        }
        field1425 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
    public static final void method651(int arg0, byte arg1) {
        ++field1426;
        if (~class40.field480 != ~arg0) {
            if (class40.field480 == 0) {
                class44.method247(134154262);
            }
            boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
            if (arg0 == 40) {
                class183.method1299(1);
            }
            if (~arg0 != -41 && class167.field2572 != null) {
                class167.field2572.method567(0);
                class167.field2572 = null;
            }
            if (arg0 == 25 || ~arg0 == -29) {
                class55.field806 = 0;
                class63.field916 = 1;
                class272.field4430 = 0;
                class96.field1454 = 0;
                class178.field2787 = 1;
                class68.method453(true, -29397);
            }
            if (arg1 < 5) {
                method651(9, (byte) 69);
            }
            if (arg0 == 25 || arg0 == 10) {
                class49.method299(false);
            }
            if (~arg0 == -6) {
                class192.method1355(class295.field4726, (byte) 90);
            } else {
                class14.method81((byte) 112);
            }
            boolean var3 = class40.field480 == 5 || ~class40.field480 == -11 || class40.field480 == 28;
            if (var2 == !var3) {
                if (var2) {
                    class127.field1826 = class176.field2779;
                    if (~class136.field1960 == -1) {
                        class257.method1823(2, false);
                    } else {
                        class176.method1259(1, class176.field2779, 2, 0, class77.field1177, 255, false);
                    }
                    class93.field1397.method193(false, 98);
                } else {
                    class257.method1823(2, false);
                    class93.field1397.method193(true, 62);
                }
            }
            class40.field480 = arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class95() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field1429;
        if (arg1 != -957953300) {
            field1424 = 61;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int[] var4 = this.method2018(0, arg1 + 957953299, arg0);
            int[] var5 = this.method2018(1, -1, arg0);
            int var6 = this.field1432;
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
                                                            for (int var7 = 0; ~var7 > ~class180.field2826; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class180.field2826; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 <= var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class180.field2826; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class180.field2826; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class180.field2826 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class180.field2826; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class180.field2826 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class180.field2826; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class180.field2826 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class180.field2826; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class180.field2826 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class180.field2826 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(IBI)Lgl;")
    public static final class181 method652(int arg0, byte arg1, int arg2) {
        ++field1427;
        class181 var3 = (class181) class119.field1720.method1064(arg1 + -35, (long) arg0 << 32 | (long) arg2);
        if (arg1 != 34) {
            return null;
        } else {
            if (var3 == null) {
                var3 = new class181(arg0, arg2);
                class119.field1720.method1054(-3510, var3, var3.field4018);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4784 = ~arg0.method1218(74) == -2;
            }
        } else {
            this.field1432 = arg0.method1218(86);
        }
        ++field1430;
        if (arg1 > -43) {
            field1424 = 110;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = -48 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) -94);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[][] var6 = this.method2021(arg1, false, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var6[2];
            int[] var13 = var4[2];
            int[] var14 = var6[0];
            int[] var15 = var6[1];
            int var16 = this.field1432;
            if (~var16 != -2) {
                if (var16 != 2) {
                    if (var16 != 3) {
                        if (~var16 != -5) {
                            if (~var16 != -6) {
                                if (~var16 != -7) {
                                    if (var16 != 7) {
                                        if (~var16 != -9) {
                                            if (var16 != 9) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class180.field2826 > var17; ++var17) {
                                                                int var18 = var11[var17];
                                                                int var19 = var15[var17];
                                                                int var20 = var12[var17];
                                                                int var21 = var14[var17];
                                                                int var22 = var9[var17];
                                                                int var23 = var10[var17];
                                                                var7[var17] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var8[var17] = var19 + var23 + -(var19 * var23 >> 11);
                                                                var13[var17] = -(var18 * var20 >> 11) + var18 + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class180.field2826 > var24; ++var24) {
                                                            int var25 = var10[var24];
                                                            int var26 = var9[var24];
                                                            int var27 = var14[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var12[var24];
                                                            int var30 = var11[var24];
                                                            var7[var24] = ~var27 <= ~var26 ? var27 - var26 : -var27 + var26;
                                                            var8[var24] = ~var25 >= ~var28 ? -var25 + var28 : -var28 + var25;
                                                            var13[var24] = var29 >= var30 ? -var30 + var29 : -var29 + var30;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class180.field2826; ++var31) {
                                                        int var32 = var9[var31];
                                                        int var33 = var12[var31];
                                                        int var34 = var14[var31];
                                                        int var35 = var10[var31];
                                                        int var36 = var15[var31];
                                                        int var37 = var11[var31];
                                                        var7[var31] = var34 >= var32 ? var34 : var32;
                                                        var8[var31] = ~var36 <= ~var35 ? var36 : var35;
                                                        var13[var31] = ~var33 <= ~var37 ? var33 : var37;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; var38 < class180.field2826; ++var38) {
                                                    int var39 = var14[var38];
                                                    int var40 = var12[var38];
                                                    int var41 = var11[var38];
                                                    int var42 = var15[var38];
                                                    int var43 = var9[var38];
                                                    int var44 = var10[var38];
                                                    var7[var38] = ~var39 >= ~var43 ? var39 : var43;
                                                    var8[var38] = var44 < var42 ? var44 : var42;
                                                    var13[var38] = var41 < var40 ? var41 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class180.field2826 > var45; ++var45) {
                                                int var46 = var9[var45];
                                                int var47 = var10[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = ~var46 == -1 ? 0 : -((-var14[var45] + 4096 << 12) / var46) + 4096;
                                                var8[var45] = var47 == 0 ? 0 : 4096 - (4096 - var15[var45] << 12) / var47;
                                                var13[var45] = var48 == 0 ? 0 : 4096 - (-var12[var45] + 4096 << 12) / var48;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class180.field2826 > var49; ++var49) {
                                            int var50 = var9[var49];
                                            int var51 = var11[var49];
                                            int var52 = var10[var49];
                                            var7[var49] = var50 != 4096 ? (var14[var49] << 12) / (-var50 + 4096) : 4096;
                                            var8[var49] = ~var52 != -4097 ? (var15[var49] << 12) / (-var52 + 4096) : 4096;
                                            var13[var49] = var51 == 4096 ? 4096 : (var12[var49] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~var53 > ~class180.field2826; ++var53) {
                                        int var54 = var14[var53];
                                        int var55 = var15[var53];
                                        int var56 = var12[var53];
                                        var7[var53] = ~var54 > -2049 ? var9[var53] * var54 >> 11 : -((-var9[var53] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var53] = var55 >= 2048 ? -((-var10[var53] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var53] * var55 >> 11;
                                        var13[var53] = var56 < 2048 ? var11[var53] * var56 >> 11 : -((-var11[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class180.field2826; ++var57) {
                                    var7[var57] = -((4096 - var9[var57]) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((-var10[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                    var13[var57] = -((4096 - var12[var57]) * (-var11[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~var58 > ~class180.field2826; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var15[var58];
                                int var61 = var12[var58];
                                var7[var58] = ~var59 != -1 ? (var9[var58] << 12) / var59 : 4096;
                                var8[var58] = var60 == 0 ? 4096 : (var10[var58] << 12) / var60;
                                var13[var58] = var61 == 0 ? 4096 : (var11[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class180.field2826 < ~var62; ++var62) {
                            var7[var62] = var9[var62] * var14[var62] >> 12;
                            var8[var62] = var10[var62] * var15[var62] >> 12;
                            var13[var62] = var11[var62] * var12[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~class180.field2826 < ~var63; ++var63) {
                        var7[var63] = var9[var63] - var14[var63];
                        var8[var63] = var10[var63] - var15[var63];
                        var13[var63] = var11[var63] + -var12[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class180.field2826 < ~var64; ++var64) {
                    var7[var64] = var9[var64] + var14[var64];
                    var8[var64] = var10[var64] - -var15[var64];
                    var13[var64] = var11[var64] + var12[var64];
                }
            }
        }
        ++field1435;
        return var4;
    }
}
