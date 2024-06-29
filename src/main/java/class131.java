import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class131 extends class115 {

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    private int field2308 = 585;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Lqe;")
    public static class168 field2305 = class66.method448("Zugewiesener Speicher)3", 72);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Lqe;")
    public static class168 field2306 = class66.method448("(Y<)4col>", -128);

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Lwc;")
    public static class232 field2310 = new class232(64);

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Lnf;")
    public static class164 field2312 = new class164();

    @OriginalMember(owner = "client!r", name = "db", descriptor = "Lqe;")
    public static class168 field2314 = null;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lwc;")
    public static class232 field2313 = new class232(128);

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[I")
    public static int[] field2315 = new int[2000];

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "[I")
    public static int[] field2316;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
    public static final void method887(int arg0) {
        int var1 = class150.field2620;
        ++field2301;
        int var2 = class139.field2462;
        int var3 = class36.field443;
        if (arg0 <= 49) {
            field2310 = null;
        }
        int var4 = class16.field144;
        int var5 = 6116423;
        class216.method1405(var1, var3, var2, var4, var5);
        class216.method1405(var1 + 1, var3 + 1, var2 + -2, 16, 0);
        class216.method1395(var1 + 1, var3 + 18, var2 - 2, var4 + -19, 0);
        class123.field2028.method941(class97.field1526, var1 + 3, var3 + 14, var5, -1);
        int var6 = class146.field2550;
        int var7 = class161.field2765;
        for (int var8 = 0; ~var8 > ~class109.field1748; ++var8) {
            int var9 = (class109.field1748 + -1 + -var8) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var1 + var2 > var6 && ~var7 < ~(var9 + -13) && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class123.field2028.method941(class14.method53(-7303, var8), var1 + 3, var9, var10, 0);
        }
        class26.method173(class16.field144, class36.field443, 0, class139.field2462, class150.field2620);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            method889(51, 36, 92, -82, 125, -43, 120, 124, 57);
        }
        int[] var3 = super.field1872.method182((byte) -113, arg0);
        if (super.field1872.field341) {
            int var4 = class170.field2963[arg0];
            for (int var5 = 0; ~var5 > ~class130.field2297; ++var5) {
                int var6 = class193.field3367[var5];
                if (~this.field2308 > ~var6 && ~(-this.field2308 + 4096) < ~var6 && ~(-this.field2308 + 2048) > ~var4 && var4 < 2048 - -this.field2308) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2308 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field2308 + 2048) > ~var6 && ~var6 > ~(this.field2308 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field2308;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2308 + 2048);
                } else if (this.field2308 <= var4 && ~var4 >= ~(-this.field2308 + 4096)) {
                    if (var6 >= this.field2308 && var6 <= -this.field2308 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2308 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2308;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2308 + 2048);
                }
            }
        }
        ++field2304;
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "j", descriptor = "(I)V")
    public static final void method888(int arg0) {
        if (class62.field845 != null) {
            class204 var1 = class62.field845;
            synchronized (class62.field845) {
                class62.field845 = null;
            }
        }
        ++field2307;
        if (arg0 != 63) {
            method889(-58, 8, 74, 126, 12, -67, 79, 85, 28);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg4 + arg5;
        int var10 = arg1 - arg2;
        int var11 = (arg3 - arg0 << 16) / var9;
        ++field2303;
        if (arg5 < class79.field1189) {
            ++var9;
        }
        int var12 = (-arg7 + arg8 << 16) / var10;
        if (class42.field552 > arg1) {
            ++var10;
        }
        for (int var13 = 0; ~var13 > ~var9; ++var13) {
            int var31 = (var13 + 1) * var11 >> 16;
            int var32 = var11 * var13 >> 16;
            int var33 = var31 - var32;
            if (~var33 < -1) {
                int var34 = arg4 + var13 >> 6;
                int var35 = arg0 + var31;
                int var36 = arg0 + var32;
                byte[][] var37 = class1.field6[var34];
                int[][] var38 = class32.field389[var34];
                byte[][] var39 = class243.field4226[var34];
                byte[][] var40 = class252.field4362[var34];
                byte[][] var41 = class89.field1394[var34];
                byte[][] var42 = class94.field1482[var34];
                for (int var43 = 0; ~var10 < ~var43; ++var43) {
                    int var44 = (var43 + 1) * var12 >> 16;
                    int var45 = var12 * var43 >> 16;
                    int var46 = -var45 + var44;
                    if (var46 > 0) {
                        int var47 = arg7 + var44;
                        int var48 = arg7 + var45;
                        int var49 = arg2 + var43 & 63;
                        int var50 = 63 & arg4 + var13;
                        int var51 = (var49 << 6) + var50;
                        int var52 = arg2 + var43 >> 6;
                        int var53;
                        if (var38[var52] != null) {
                            var53 = var38[var52][var51];
                        } else {
                            int var54 = var43 - -arg2 & 4;
                            int var55 = 4 & arg4 + var13;
                            if ((var55 >= 2 || ~var54 >= -3) && (var55 <= 2 || var54 >= 2)) {
                                var53 = class166.field2838[class6.field74 - -1];
                            } else {
                                var53 = 4936552;
                            }
                        }
                        int var56 = var37[var52] != null ? class166.field2838[var37[var52][var51] & 255] : 0;
                        if (~var53 == -1) {
                            var53 = 1;
                        }
                        int var57 = var40[var52] != null ? class166.field2838[255 & var40[var52][var51]] : 0;
                        if (var56 == 0 && ~var57 == -1) {
                            class216.method1405(var36, var48, var33, var46, var53);
                        } else {
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = 1;
                                }
                                byte var58 = var39[var52] != null ? var39[var52][var51] : 0;
                                int var59 = 252 & var58;
                                if (~var59 != -1 && ~var33 < -2 && var46 > 1) {
                                    class181.method1201((byte) -118, var46, var48, var56, var53, class216.field3731, var59 >> 2, true, var58 & 3, var36, var33);
                                } else {
                                    class216.method1405(var36, var48, var33, var46, var56);
                                }
                            }
                            if (~var57 != -1) {
                                if (~var57 == 0) {
                                    var57 = var53;
                                }
                                byte var60 = var41[var52][var51];
                                int var61 = var60 & 252;
                                if (var61 == 0 || ~var33 >= -2 || ~var46 >= -2) {
                                    class216.method1405(var36, var48, var33, var46, var57);
                                }
                                class181.method1201((byte) -82, var46, var48, var57, 0, class216.field3731, var61 >> 2, var56 == 0, var60 & 3, var36, var33);
                            }
                        }
                        if (var42[var52] != null) {
                            int var62 = 255 & var42[var52][var51];
                            if (var62 != 0) {
                                int var63;
                                if (var46 == 1) {
                                    var63 = var48;
                                } else {
                                    var63 = var47 - 1;
                                }
                                int var64;
                                if (~var33 != -2) {
                                    var64 = var35 + -1;
                                } else {
                                    var64 = var36;
                                }
                                int var65 = 13421772;
                                if (var62 >= 5 && ~var62 >= -9 || ~var62 <= -14 && var62 <= 16 || ~var62 <= -22 && var62 <= 24 || var62 == 27 || var62 == 28) {
                                    var65 = 13369344;
                                    var62 -= 4;
                                }
                                if (~var62 != -2) {
                                    if (var62 == 2) {
                                        class216.method1406(var36, var48, var33, var65);
                                    } else if (var62 != 3) {
                                        if (var62 != 4) {
                                            if (var62 != 9) {
                                                if (~var62 == -11) {
                                                    class216.method1402(var64, var48, var46, 16777215);
                                                    class216.method1406(var36, var48, var33, var65);
                                                } else if (~var62 == -12) {
                                                    class216.method1402(var64, var48, var46, 16777215);
                                                    class216.method1406(var36, var63, var33, var65);
                                                } else if (var62 != 12) {
                                                    if (~var62 != -18) {
                                                        if (~var62 == -19) {
                                                            class216.method1406(var64, var48, 1, var65);
                                                        } else if (~var62 != -20) {
                                                            if (~var62 != -21) {
                                                                if (var62 != 25) {
                                                                    if (~var62 == -27) {
                                                                        for (int var66 = 0; var66 < var46; ++var66) {
                                                                            class216.method1406(var36 + var66, var48 + var66, 1, var65);
                                                                        }
                                                                    }
                                                                } else {
                                                                    for (int var67 = 0; var46 > var67; ++var67) {
                                                                        class216.method1406(var36 + var67, -var67 + var63, 1, var65);
                                                                    }
                                                                }
                                                            } else {
                                                                class216.method1406(var36, var63, 1, var65);
                                                            }
                                                        } else {
                                                            class216.method1406(var64, var63, 1, var65);
                                                        }
                                                    } else {
                                                        class216.method1406(var36, var48, 1, var65);
                                                    }
                                                } else {
                                                    class216.method1402(var36, var48, var46, 16777215);
                                                    class216.method1406(var36, var63, var33, var65);
                                                }
                                            } else {
                                                class216.method1402(var36, var48, var46, 16777215);
                                                class216.method1406(var36, var48, var33, var65);
                                            }
                                        } else {
                                            class216.method1406(var36, var63, var33, var65);
                                        }
                                    } else {
                                        class216.method1402(var64, var48, var46, var65);
                                    }
                                } else {
                                    class216.method1402(var36, var48, var46, var65);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var14 = -104 % ((arg6 - 22) / 56);
        for (int var15 = 0; var15 < var9; ++var15) {
            int var16 = var11 * var15 >> 16;
            int var17 = (var15 + 1) * var11 >> 16;
            int var18 = -var16 + var17;
            if (~var18 < -1) {
                int var19 = arg0 + var16;
                int var10000 = arg0 + var17;
                byte[][] var21 = class233.field3964[var15 - -arg4 >> 6];
                for (int var22 = 0; ~var22 > ~var10; ++var22) {
                    int var23 = (var22 + 1) * var12 >> 16;
                    int var24 = var12 * var22 >> 16;
                    int var25 = -var24 + var23;
                    if (~var25 < -1) {
                        int var26 = arg7 + var24;
                        var10000 = arg7 + var23;
                        int var28 = arg2 + var22 >> 6;
                        int var29 = ((arg2 + var22 & 63) << 6) + (63 & var15 - -arg4);
                        if (var21[var28] != null) {
                            int var30 = 255 & var21[var28][var29];
                            if (var30 != 0) {
                                if (~var30 != -48 && ~var30 != -54) {
                                    class111.field1769[var30 + -1].method1418(-(var18 / 2) + var19, -(var25 / 2) + var26, var18 * 2, var25 * 2);
                                } else {
                                    class111.field1769[var30 + -1].method1418(var19, var26, var18 * 2 + 1, var25 * 2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "k", descriptor = "(I)V")
    public static final void method890(int arg0) {
        ++field2311;
        class26.field316.method1497((byte) 84);
        class55.field755.method14(false);
        class3.field28.method14(false);
        if (arg0 >= -123) {
            field2315 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2308 = arg1.method731(false);
        }
        ++field2309;
        if (arg0 != 107) {
            this.method3((byte) -9, (class112) null, -45);
        }
    }

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(I)V")
    public static void method891(int arg0) {
        field2312 = null;
        field2314 = null;
        field2305 = null;
        field2313 = null;
        field2315 = null;
        if (arg0 != -18182) {
            method890(109);
        }
        field2306 = null;
        field2316 = null;
        field2310 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class131() {
        super(0, true);
    }
}
