import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class399 extends class98 {

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Lts;")
    public static class315 field5703 = null;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field5696 = 0;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "[J")
    public static long[] field5711;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "J")
    public static long field5712;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Lhi;")
    public static class113 field5692;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Laj;")
    public static class169 field5694;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Lon;")
    public static class184 field5700;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field5713;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[Lgh;")
    public static class327[] field5693;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[[[B")
    public static byte[][][] field5699;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V")
    public static void method2539(byte arg0) {
        if (arg0 != -33) {
            field5699 = null;
        }
        field5692 = null;
        field5711 = null;
        field5694 = null;
        field5699 = null;
        field5693 = null;
        field5703 = null;
        field5700 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZII)V")
    public static final void method2540(boolean arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            class151.field1873 = class134.method825(63, class1.field6, class14.field185, class408.field5877 * 2, class402.field5767, arg2);
        } else {
            if (arg0) {
                class151.field1873 = class134.method825(arg1 + 27453, class1.field6, class14.field185, 0, class402.field5767, 0);
                class151.field1873.method601(0);
                class355 var3 = class365.method2335(class278.field3941, class335.field4752, 0, 0);
                class266 var4 = class151.field1873.method613(var3, class375.method2401(class298.field4178, class278.field3941, 0), true);
                class440.method2749((byte) -123, true, class248.field3544.method2331(25, class271.field3836), var4);
                class151.field1873.method664();
                class237.method1632((byte) 95);
                class151.field1873.method824(-54);
            }
            try {
                class151.field1873 = class134.method825(40, class1.field6, class14.field185, class408.field5877 * 2, class402.field5767, arg2);
            } catch (Throwable var7) {
                arg2 = 0;
                class151.field1873 = class134.method825(60, class1.field6, class14.field185, 0, class402.field5767, 0);
            }
        }
        ++field5695;
        if (class151.field1873.method589()) {
            class122 var5 = class151.field1873.method656(134217728);
            class151.field1873.method668(var5);
        }
        class26.field329 = arg2;
        class218.method1464(57);
        if (!class151.field1873.method598()) {
            class216.field3052 = 1;
        }
        if (arg1 != -27343) {
            field5700 = null;
        }
        class151.field1873.method607(class216.field3052);
        class151.field1873.method618(0);
        class65.field743 = class151.field1873.method639();
        class295.field4115 = class151.field1873.method639();
        int var6 = (int) ((double) class176.field2403 * 34.46D);
        if (class151.field1873.method650()) {
            var6 += 128;
        }
        class151.field1873.method633(50, var6);
        class151.field1873.method654(!class271.field3838);
        if (class151.field1873.method672()) {
            class288.method1881(class212.field3020, arg1 + 13362);
        }
        class212.field3012 = !class12.method93(1);
        class40.method239(class176.field2403 >> 3, class383.field5395 >> 3, arg1 ^ -27322, class151.field1873);
        class223.method1495((byte) -73);
        class101.field1218 = false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLae;I)Z")
    public static final boolean method2541(boolean arg0, class134 arg1, int arg2) {
        ++field5708;
        int var3 = (class176.field2403 + -104) / 2;
        int var4 = (class383.field5395 + -104) / 2;
        boolean var5 = arg0;
        for (int var6 = var3; ~(var3 + 104) < ~var6; ++var6) {
            for (int var51 = var4; var4 + 104 > var51; ++var51) {
                for (int var52 = arg2; var52 <= 3; ++var52) {
                    if (class310.method2050(var52, (byte) -77, var51, arg2, var6)) {
                        int var53 = var52;
                        if (class21.method157(var51, 2, var6)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class210.method1393(var53, var51, var6, 228);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class295.field4112 = arg1.method610(var7, 0, 512, 512, 512);
            class97.method534(-50);
            int var9 = -16777216 | (int) (Math.random() * 20.0D) + 238 - (10 - (-10 + (int) (Math.random() * 20.0D) + 238 << 8)) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16);
            int var10 = -16777216 | -10 + (int) (Math.random() * 20.0D) + 238 << 16;
            int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class210.field2981][class210.field2981];
            for (int var13 = var3; ~(var3 + 104) < ~var13; var13 += class210.field2981) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class210.field2981) {
                    arg1.method660(0, 0, class210.field2981 * 4, class210.field2981 * 4);
                    arg1.method601(-16777216);
                    for (int var37 = arg2; ~var37 >= -4; ++var37) {
                        for (int var44 = 0; var44 < class210.field2981; ++var44) {
                            for (int var50 = 0; ~var50 > ~class210.field2981; ++var50) {
                                var12[var44][var50] = class310.method2050(var37, (byte) -77, var36 - -var50, arg2, var13 - -var44);
                            }
                        }
                        class98.field1191[var37].method343(0, 0, 1024, var13, var36, class210.field2981 + var13, var36 - -class210.field2981, var12);
                        if (!class237.field3388) {
                            for (int var45 = -4; class210.field2981 > var45; ++var45) {
                                for (int var46 = -4; class210.field2981 > var46; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    if (~var47 <= ~var3 && var48 >= var4 && class310.method2050(var37, (byte) -77, var48, arg2, var47)) {
                                        int var49 = var37;
                                        if (class21.method157(var48, 2, var47)) {
                                            var49 = var37 - 1;
                                        }
                                        if (~var49 <= -1) {
                                            class323.method2105(var10, var45 * 4, var49, var9, var47, -4, arg1, var48, (-var46 + class210.field2981) * 4 - 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class237.field3388) {
                        class119 var38 = class102.field1247[arg2];
                        for (int var39 = 0; ~var39 > ~class210.field2981; ++var39) {
                            for (int var40 = 0; class210.field2981 > var40; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field1468[-var38.field1455 + var41][var42 - var38.field1466];
                                if (~(var43 & 1076101120) == -1) {
                                    if (~(var43 & 8388608) == -1) {
                                        if ((33554432 & var43) == 0) {
                                            if (~(var43 & 134217728) == -1) {
                                                if ((536870912 & var43) != 0) {
                                                    arg1.method821(-68, (-var40 + class210.field2981) * 4 + -4, var39 * 4, 4, -1713569622);
                                                }
                                            } else {
                                                arg1.method826((byte) -82, 4, var39 * 4, (-var40 + class210.field2981) * 4 + 3 - 4, -1713569622);
                                            }
                                        } else {
                                            arg1.method821(-111, (-var40 + class210.field2981) * 4 - 4, var39 * 4 - -3, 4, -1713569622);
                                        }
                                    } else {
                                        arg1.method826((byte) -82, 4, var39 * 4, (-var40 + class210.field2981) * 4 + -4, -1713569622);
                                    }
                                } else {
                                    arg1.method827((class210.field2981 - var40) * 4 - 4, var39 * 4, 4, -98, 4, -1713569622);
                                }
                            }
                        }
                    }
                    arg1.method653(0, 0, class210.field2981 * 4, class210.field2981 * 4, var11, 2);
                    class295.field4112.method758((-var3 + var13) * 4 + 48, -(class210.field2981 * 4) + 464 - (-var4 + var36) * 4, class210.field2981 * 4, class210.field2981 * 4, 0, 0);
                }
            }
            arg1.method624();
            arg1.method601(-16777215);
            class406.method2593(false);
            class160.field2113 = 0;
            class178.field2440.method505((byte) 44);
            if (!class237.field3388) {
                for (int var14 = var3; var3 - -104 > var14; ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg2; ~(arg2 + 1) <= ~var21 && var21 <= 3; ++var21) {
                            if (class310.method2050(var21, (byte) -77, var20, arg2, var14)) {
                                class9 var22 = (class9) class327.method2118(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class9) class159.method1013(var21, var14, var20, field5713 != null ? field5713 : (field5713 = method2547("vl")));
                                }
                                if (var22 == null) {
                                    var22 = (class9) class137.method847(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class9) class109.method696(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class88 var23 = class374.method2382(var22.method71((byte) -95), false);
                                    if (!var23.field1000 || class190.field2742) {
                                        int var24 = var23.field1018;
                                        if (var23.field1068 != null) {
                                            for (int var25 = 0; ~var23.field1068.length < ~var25; ++var25) {
                                                if (var23.field1068[var25] != -1) {
                                                    class88 var26 = class374.method2382(var23.field1068[var25], false);
                                                    if (~var26.field1018 <= -1) {
                                                        var24 = var26.field1018;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class246 var28 = class153.method927(0, var24);
                                                if (var28 != null && var28.field3493) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class102.field1247[var21].field1468;
                                                int var32 = class102.field1247[var21].field1455;
                                                int var33 = class102.field1247[var21].field1466;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (~var35 == -1 && var29 > var3 && var14 + -3 < var29 && ~(var31[var29 + -1 - var32][var30 - var33] & 2883848) == -1) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && ~var29 > ~(var3 + -1 - -104) && var14 + 3 > var29 && ~(2883968 & var31[var29 + 1 + -var32][-var33 + var30]) == -1) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var30 > var4 && ~(var20 - 3) > ~var30 && (2883842 & var31[-var32 + var29][-1 - var33 + var30]) == 0) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && var4 - 1 + 104 > var30 && ~var30 > ~(var20 - -3) && ~(2883872 & var31[-var32 + var29][-var33 + var30 + 1]) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class49.field588[class160.field2113] = var23.field1026;
                                            class43.field526[class160.field2113] = var29;
                                            class267.field3806[class160.field2113] = var30;
                                            ++class160.field2113;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class330.field4667 != null) {
                    class158.field2060.field5303 = 1;
                    class35.method216(64, 1024, (byte) -22);
                    for (int var15 = 0; ~class330.field4667.field3253 < ~var15; ++var15) {
                        int var16 = class330.field4667.field3248[var15];
                        if (~(var16 >> 28) == ~class129.field1570) {
                            int var17 = ((var16 & 268433817) >> 14) + -class114.field1403;
                            int var18 = (var16 & 16383) + -class41.field496;
                            if (var17 >= 0 && ~var17 > ~class176.field2403 && ~var18 <= -1 && ~class383.field5395 < ~var18) {
                                class178.field2440.method509((byte) 117, new class25(var15));
                            } else {
                                class246 var19 = class153.method927(0, class330.field4667.field3250[var15]);
                                if (var19.field3503 != null && var19.field3501 + var17 >= 0 && ~class176.field2403 < ~(var19.field3485 + var17) && var19.field3491 + var18 >= 0 && ~(var19.field3517 + var18) > ~class383.field5395) {
                                    class178.field2440.method509((byte) 112, new class25(var15));
                                }
                            }
                        }
                    }
                    class35.method216(64, 128, (byte) -22);
                    class158.field2060.field5303 = 2;
                    class158.field2060.method2404((byte) -98);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class399() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
    public static final void method2542(int arg0, int arg1) {
        ++field5709;
        class72.field867.method1629(arg1, 92);
        class392.field5521.method1629(arg1, arg0 + -423);
        if (arg0 != 512) {
            field5699 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZII[ILp;IIIIIII[I)I")
    public static final int method2543(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, class119 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; var35 < 128; ++var35) {
                class75.field887[var15][var35] = 0;
                class352.field4970[var15][var35] = 99999999;
            }
        }
        ++field5697;
        if (arg3 != -129) {
            return 109;
        } else {
            boolean var16;
            if (~arg8 == -2) {
                var16 = class331.method2137(arg1, arg12, arg13, arg6, arg0, arg10, arg4, arg7, (byte) -109, arg9, arg11);
            } else if (~arg8 == -3) {
                var16 = class276.method1827(arg7, arg11, arg10, arg1, arg12, arg6, arg9, arg4, arg0, arg13, (byte) 85);
            } else {
                var16 = class49.method282(arg0, arg8, arg10, arg12, arg4, arg11, arg7, false, arg9, arg13, arg6, arg1);
            }
            int var17 = arg4 + -64;
            int var18 = arg12 + -64;
            int var19 = class452.field6462;
            int var20 = class260.field3712;
            if (!var16) {
                if (!arg2) {
                    return -1;
                }
                int var21 = Integer.MAX_VALUE;
                int var22 = Integer.MAX_VALUE;
                byte var23 = 10;
                for (int var24 = -var23 + arg1; ~var24 >= ~(arg1 + var23); ++var24) {
                    for (int var25 = arg10 - var23; ~(arg10 + var23) <= ~var25; ++var25) {
                        int var26 = -var17 + var24;
                        int var27 = -var18 + var25;
                        if (var26 >= 0 && var27 >= 0 && ~var26 > -129 && ~var27 > -129 && ~class352.field4970[var26][var27] > -101) {
                            int var28 = 0;
                            if (var24 >= arg1) {
                                if (arg0 + arg1 - 1 < var24) {
                                    var28 = -arg1 + 1 - (arg0 - var24);
                                }
                            } else {
                                var28 = -var24 + arg1;
                            }
                            int var29 = 0;
                            if (~var25 <= ~arg10) {
                                if (~var25 < ~(arg10 - -arg7 + -1)) {
                                    var29 = var25 - (arg10 - -arg7 + -1);
                                }
                            } else {
                                var29 = -var25 + arg10;
                            }
                            int var30 = var28 * var28 + var29 * var29;
                            if (var21 > var30 || var21 == var30 && ~var22 < ~class352.field4970[var26][var27]) {
                                var20 = var25;
                                var21 = var30;
                                var19 = var24;
                                var22 = class352.field4970[var26][var27];
                            }
                        }
                    }
                }
                if (~var21 == Integer.MIN_VALUE) {
                    return -1;
                }
            }
            if (~arg4 == ~var19 && arg12 == var20) {
                return 0;
            } else {
                byte var31 = 0;
                class297.field4155[var31] = var19;
                int var37 = var31 + 1;
                class327.field4648[var31] = var20;
                int var32;
                int var33 = var32 = class75.field887[var19 - var17][var20 - var18];
                while (~arg4 != ~var19 || ~arg12 != ~var20) {
                    if (var32 != var33) {
                        var32 = var33;
                        class297.field4155[var37] = var19;
                        class327.field4648[var37++] = var20;
                    }
                    if ((1 & var33) == 0) {
                        if (~(var33 & 4) != -1) {
                            --var20;
                        }
                    } else {
                        ++var20;
                    }
                    if (~(var33 & 2) != -1) {
                        ++var19;
                    } else if ((8 & var33) != 0) {
                        --var19;
                    }
                    var33 = class75.field887[-var17 + var19][-var18 + var20];
                }
                int var34 = 0;
                while (~(var37--) < -1) {
                    arg5[var34] = class297.field4155[var37];
                    arg14[var34++] = class327.field4648[var37];
                    if (var34 >= arg5.length) {
                        break;
                    }
                }
                return var34;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field5704;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        int var4 = 39 % ((60 - arg1) / 43);
        if (super.field1184.field332) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class268.field3811; ++var8) {
                this.method2546((byte) 125, var8, arg0);
                int[][] var9 = this.method546(class232.field3264, (byte) 33, 0);
                var5[var8] = var9[0][class408.field5885];
                var6[var8] = var9[1][class408.field5885];
                var7[var8] = var9[2][class408.field5885];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ltq;I)I")
    public static final int method2544(class376 arg0, int arg1) {
        ++field5702;
        int var2 = 0;
        if (arg0.method2412(class235.field3296, arg1 ^ -16777092)) {
            ++var2;
        }
        if (arg0.method2412(class383.field5413, 126)) {
            ++var2;
        }
        if (arg0.method2412(class261.field3739, 122)) {
            ++var2;
        }
        if (arg1 != -16777216) {
            method2542(24, 115);
        }
        if (arg0.method2412(class75.field889, 121)) {
            ++var2;
        }
        if (arg0.method2412(class413.field5942, 123)) {
            ++var2;
        }
        if (arg0.method2412(class296.field4122, 124)) {
            ++var2;
        }
        if (arg0.method2412(class450.field6452, 126)) {
            ++var2;
        }
        if (arg0.method2412(class182.field2486, 127)) {
            ++var2;
        }
        if (arg0.method2412(class217.field3064, arg1 ^ -16777089)) {
            ++var2;
        }
        if (arg0.method2412(class236.field3301, 124)) {
            ++var2;
        }
        if (arg0.method2412(class261.field3736, 126)) {
            ++var2;
        }
        if (arg0.method2412(class167.field2340, 122)) {
            ++var2;
        }
        if (arg0.method2412(class40.field483, 123)) {
            ++var2;
        }
        if (arg0.method2412(class313.field4483, 124)) {
            ++var2;
        }
        if (arg0.method2412(class284.field3995, 126)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field5705;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            for (int var4 = 0; class268.field3811 > var4; ++var4) {
                this.method2546((byte) 123, var4, arg1);
                int[] var5 = this.method539(0, (byte) -66, class232.field3264);
                var3[var4] = var5[class408.field5885];
            }
        }
        if (arg0 != 0) {
            field5700 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static final void method2545(boolean arg0) {
        if (arg0) {
            field5696 = 82;
        }
        class89.method493((long) class189.field2726, (byte) -96, class151.field1873);
        ++field5707;
        if (~class248.field3548 != 0) {
            class99.method552(class248.field3548, (byte) 88);
        }
        for (int var1 = 0; ~var1 > ~class421.field6017; ++var1) {
            if (class394.field5556[var1]) {
                class418.field5974[var1] = true;
            }
            class181.field2475[var1] = class394.field5556[var1];
            class394.field5556[var1] = false;
        }
        class244.field3460 = class189.field2726;
        if (class151.field1873.method609()) {
            class285.field4003 = true;
        }
        if (~class248.field3548 != 0) {
            class421.field6017 = 0;
            class450.method2788((byte) 125);
        }
        class151.field1873.method624();
        class404.method2579(-1, class360.field5145);
        class34.field392 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field5710;
        if (~arg0 == -1) {
            super.field1176 = arg1.method1574(-32) == 1;
        }
        if (arg2 != 0) {
            field5700 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BII)V")
    private final void method2546(byte arg0, int arg1, int arg2) {
        ++field5706;
        if (arg0 > 108) {
            int var4 = class189.field2722[arg1];
            int var5 = class163.field2285[arg2];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class232.field3264 = arg2;
                class408.field5885 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class232.field3264 = arg1;
                class408.field5885 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class408.field5885 = class268.field3811 - arg2;
                class232.field3264 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class408.field5885 = arg1;
                class232.field3264 = -arg2 + class140.field1737;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class408.field5885 = -arg1 + class268.field3811;
                class232.field3264 = class140.field1737 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class232.field3264 = -arg1 + class140.field1737;
                class408.field5885 = -arg2 + class268.field3811;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class232.field3264 = -arg1 + class140.field1737;
                class408.field5885 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class232.field3264 = arg2;
                class408.field5885 = class268.field3811 - arg1;
            }
            class408.field5885 &= class210.field2995;
            class232.field3264 &= class225.field3153;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2547(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        Math.sqrt(8192.0D);
        field5711 = new long[256];
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field5711[var0] = var1;
        }
    }
}
