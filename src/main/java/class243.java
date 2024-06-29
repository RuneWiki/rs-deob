import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class243 extends class67 {

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private final int field4332;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    private final int field4341;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    private final int field4335;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private final int field4333;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Le;")
    public static class191 field4336 = class54.method368("Versteckt", 2047);

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Le;")
    public static class191 field4339 = class54.method368("document)3cookie=(R", 2047);

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Le;")
    public static class191 field4342 = class54.method368("cross", 2047);

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    public static int[] field4340 = new int[256];

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Le;")
    public static class191 field4337 = class54.method368(": ", 2047);

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Le;")
    private static class191 field4346 = class54.method368("Members only world", 2047);

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Le;")
    public static class191 field4328 = field4346;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method1701(int arg0) {
        field4328 = null;
        field4340 = null;
        field4339 = null;
        if (arg0 == -12) {
            field4346 = null;
            field4342 = null;
            field4336 = null;
            field4337 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
    public class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4332 = arg0;
        this.field4341 = arg2;
        this.field4335 = arg3;
        this.field4333 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIBII)V")
    public static final void method1702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field4331;
        int var11 = -arg9 + arg4;
        int var12 = -arg5 + arg3;
        boolean var13;
        if (class199.field3561 > 0 && ~(class199.field3561 % 10) > -6) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg10;
        int var15 = 983040 / arg7;
        for (int var16 = -var14; ~var16 > ~(var11 + var14); ++var16) {
            int var18 = arg10 * var16 + arg1 >> 16;
            int var19 = (var16 - -1) * arg10 + arg1 >> 16;
            int var20 = -var18 + var19;
            if (var20 > 0) {
                int var21 = arg2 + var18;
                int var10000 = arg2 + var19;
                int var23 = arg9 + var16 >> 6;
                if (~var23 <= -1 && ~var23 >= ~(class68.field1190.length - 1)) {
                    int[][] var24 = class68.field1190[var23];
                    for (int var25 = -var15; var25 < var12 - -var15; ++var25) {
                        int var26 = arg7 * var25 + arg6 >> 16;
                        int var27 = (var25 + 1) * arg7 + arg6 >> 16;
                        int var28 = -var26 + var27;
                        if (~var28 < -1) {
                            int var29 = arg0 + var26;
                            var10000 = arg0 + var27;
                            int var31 = arg5 + var25 >> 6;
                            if (~var31 <= -1 && ~(var24.length + -1) <= ~var31 && var24[var31] != null) {
                                int var32 = ((var25 - -arg5 & 63) << 6) + (63 & arg9 + var16);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class102 var34 = class31.method216(var33 + -1, (byte) 121);
                                    if (var13 && class263.field4655 == var34.field1681) {
                                        class36 var35 = new class36();
                                        var35.field665 = var21;
                                        var35.field666 = var34.field1681;
                                        var35.field664 = var29;
                                        class46.field813.method1176(var35, (byte) 38);
                                    }
                                    class227.field4090[var34.field1681].method598(var21 + -7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class36 var17 = (class36) class46.field813.method1173(94); var17 != null; var17 = (class36) class46.field813.method1175(-1)) {
            class227.field4090[var17.field666].method598(var17.field665 + -7, var17.field664 + -7);
            class7.method45(var17.field665, var17.field664, 15, 16776960, 128);
            class7.method45(var17.field665, var17.field664, 7, 16777215, 256);
        }
        if (arg8 >= -18) {
            field4339 = null;
        }
        class46.field813.method1178(true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILt;)V")
    public static final void method1703(int arg0, class247 arg1) {
        ++field4344;
        class171 var2 = null;
        try {
            class80 var3 = arg1.method1725("runescape", -120);
            while (~var3.field1356 == -1) {
                class18.method142(true, 1L);
            }
            if (var3.field1356 == 1) {
                var2 = (class171) var3.field1360;
                class225 var4 = class216.method1472(true);
                var2.method1150(var4.field3995, 14389, 0, var4.field3996);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1149(arg0 ^ -3249);
            }
        } catch (Exception var5) {
        }
        if (arg0 != 10367) {
            field4337 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        ++field4343;
        int var4 = this.field4332 * arg2 >> 12;
        int var5 = this.field4341 * arg2 >> 12;
        int var6 = this.field4333 * arg1 >> 12;
        if (arg0 != 32) {
            this.method443(-84, (byte) 63, 49);
        }
        int var7 = this.field4335 * arg1 >> 12;
        class271.method1849(var6, (byte) 19, var5, var4, super.field1172, var7);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method1704(int arg0) {
        class227.field4091 = arg0;
        for (int var1 = 0; var1 < class217.field3821; ++var1) {
            for (int var2 = 0; var2 < class85.field1406; ++var2) {
                if (class201.field3608[arg0][var1][var2] == null) {
                    class201.field3608[arg0][var1][var2] = new class199(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
    public final void method443(int arg0, byte arg1, int arg2) {
        ++field4329;
        if (arg1 >= -51) {
            field4340 = null;
        }
        int var4 = this.field4332 * arg2 >> 12;
        int var5 = this.field4341 * arg2 >> 12;
        int var6 = this.field4333 * arg0 >> 12;
        int var7 = this.field4335 * arg0 >> 12;
        class41.method271(20323, super.field1161, var4, var7, var5, super.field1172, super.field1165, var6);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4334;
        class126.field2080 = 0;
        if (arg4 != 1611254640) {
            field4340 = null;
        }
        for (int var7 = -1; ~var7 > ~(class260.field4586 + class197.field3514); ++var7) {
            class176 var23;
            if (~var7 == 0) {
                var23 = class175.field2946;
            } else if (class260.field4586 <= var7) {
                var23 = class115.field1901[class256.field4542[-class260.field4586 + var7]];
            } else {
                var23 = class245.field4357[class73.field1271[var7]];
            }
            if (var23 != null && var23.method489(50)) {
                if (var23 instanceof class156) {
                    class184 var24 = ((class156) var23).field2663;
                    if (var24.field3225 != null) {
                        var24 = var24.method1245((byte) -50);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class260.field4586) {
                    class184 var30 = ((class156) var23).field2663;
                    if (var30.field3225 != null) {
                        var30 = var30.method1245((byte) -95);
                    }
                    if (~var30.field3224 <= -1 && ~class256.field4543.length < ~var30.field3224) {
                        int var31;
                        if (~var30.field3206 != 0) {
                            var31 = var30.field3206 - -15;
                        } else {
                            var31 = var23.method1183(-16254) + 15;
                        }
                        class102.method633(arg6 >> 1, var31, arg3 >> 1, arg1, 2596, var23, arg5);
                        if (class5.field52 > -1) {
                            class256.field4543[var30.field3224].method598(class5.field52 + arg0 + -12, arg2 - -class114.field1885 - 30);
                        }
                    }
                    int var32 = 0;
                    class79[] var33 = class152.field2608;
                    while (var33.length > var32) {
                        class79 var48 = var33[var32];
                        if (var48 != null && ~var48.field1344 == -2 && ~class256.field4542[-class260.field4586 + var7] == ~var48.field1352 && class135.field2267 % 20 < 10) {
                            int var49;
                            if (var30.field3206 == -1) {
                                var49 = var23.method1183(-16254) + 15;
                            } else {
                                var49 = var30.field3206 + 15;
                            }
                            class102.method633(arg6 >> 1, var49, arg3 >> 1, arg1, 2596, var23, arg5);
                            if (class5.field52 > -1) {
                                class110.field1856[var48.field1341].method598(class5.field52 + arg0 + -12, class114.field1885 + arg2 + -28);
                            }
                        }
                        ++var32;
                    }
                } else {
                    int var25 = 30;
                    class76 var26 = (class76) var23;
                    if (var26.field1318 != -1 || ~var26.field1309 != 0) {
                        class102.method633(arg6 >> 1, 15 + var23.method1183(-16254), arg3 >> 1, arg1, 2596, var23, arg5);
                        if (class5.field52 > -1) {
                            if (var26.field1318 != -1) {
                                class158.field2687[var26.field1318].method598(class5.field52 + arg0 + -12, -var25 + arg2 + class114.field1885);
                                var25 += 25;
                            }
                            if (var26.field1309 != -1) {
                                class256.field4543[var26.field1309].method598(class5.field52 + arg0 + -12, arg2 - -class114.field1885 + -var25);
                                var25 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        class79[] var27 = class152.field2608;
                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                            class79 var29 = var27[var28];
                            if (var29 != null && var29.field1344 == 10 && ~class73.field1271[var7] == ~var29.field1352) {
                                class102.method633(arg6 >> 1, var23.method1183(arg4 ^ -1611265038) - -15, arg3 >> 1, arg1, arg4 ^ 1611252052, var23, arg5);
                                if (~class5.field52 < 0) {
                                    class110.field1856[var29.field1341].method598(arg0 - -class5.field52 + -12, arg2 - -class114.field1885 + -var25);
                                }
                            }
                        }
                    }
                }
                if (var23.field2993 != null && (~var7 <= ~class260.field4586 || ~class35.field650 == -1 || ~class35.field650 == -4 || class35.field650 == 1 && class273.method1863(((class76) var23).field1315, 0))) {
                    class102.method633(arg6 >> 1, var23.method1183(-16254), arg3 >> 1, arg1, 2596, var23, arg5);
                    if (class5.field52 > -1 && class126.field2080 < class190.field3343) {
                        class190.field3339[class126.field2080] = class230.field4128.method302(var23.field2993) / 2;
                        class190.field3333[class126.field2080] = class230.field4128.field786;
                        class190.field3331[class126.field2080] = class5.field52;
                        class190.field3336[class126.field2080] = class114.field1885;
                        class190.field3341[class126.field2080] = var23.field2973;
                        class190.field3330[class126.field2080] = var23.field2985;
                        class190.field3334[class126.field2080] = var23.field2981;
                        class190.field3329[class126.field2080] = var23.field2993;
                        ++class126.field2080;
                    }
                }
                if (class135.field2267 < var23.field2950) {
                    class226 var34 = class25.field364[0];
                    class226 var35 = class25.field364[1];
                    int var39;
                    if (var23 instanceof class156) {
                        class156 var36 = (class156) var23;
                        class226[] var37 = (class226[]) class201.field3609.method991((long) var36.field2663.field3189, arg4 ^ -1611247218);
                        if (var37 == null) {
                            var37 = class263.method1805(class215.field3792, 0, arg4 + -1611254640, var36.field2663.field3189);
                            if (var37 != null) {
                                class201.field3609.method987(var37, (long) var36.field2663.field3189, arg4 ^ -1611252470);
                            }
                        }
                        if (var37 != null && ~var37.length == -3) {
                            var35 = var37[1];
                            var34 = var37[0];
                        }
                        class184 var38 = var36.field2663;
                        if (var38.field3206 != -1) {
                            var39 = var38.field3206;
                        } else {
                            var39 = var23.method1183(-16254);
                        }
                    } else {
                        var39 = var23.method1183(-16254);
                    }
                    class102.method633(arg6 >> 1, var39 + 10 + var34.field4073, arg3 >> 1, arg1, 2596, var23, arg5);
                    if (class5.field52 > -1) {
                        int var40 = arg0 - -class5.field52 - (var34.field4075 >> 1);
                        int var41 = class114.field1885 + arg2 + -3;
                        var34.method598(var40, var41);
                        int var42 = var34.field4073;
                        int var43 = var23.field2989 * var34.field4075 / 255;
                        class7.method53(var40, var41, var40 - -var43, var41 + var42);
                        var35.method598(var40, var41);
                        class7.method54(arg0, arg2, arg0 + arg3, arg2 + arg6);
                    }
                }
                for (int var44 = 0; ~var44 > -5; ++var44) {
                    if (class135.field2267 < var23.field3004[var44]) {
                        int var47;
                        if (var23 instanceof class156) {
                            class156 var45 = (class156) var23;
                            class184 var46 = var45.field2663;
                            if (~var46.field3206 == 0) {
                                var47 = var23.method1183(arg4 + -1611270894) / 2;
                            } else {
                                var47 = var46.field3206 / 2;
                            }
                        } else {
                            var47 = var23.method1183(-16254) / 2;
                        }
                        class102.method633(arg6 >> 1, var47, arg3 >> 1, arg1, 2596, var23, arg5);
                        if (class5.field52 > -1) {
                            if (var44 == 1) {
                                class114.field1885 -= 20;
                            }
                            if (var44 == 2) {
                                class114.field1885 -= 10;
                                class5.field52 -= 15;
                            }
                            if (var44 == 3) {
                                class5.field52 += 15;
                                class114.field1885 -= 10;
                            }
                            class148.field2533[var23.field3006[var44]].method598(arg0 - (-class5.field52 - -12), class114.field1885 + arg2 + -12);
                            class83.field1393.method288(class92.method563(arg4 + -1611254724, var23.field2948[var44]), class5.field52 + -1 + arg0, class114.field1885 + arg2 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; ~var8 > ~class126.field2080; ++var8) {
            int var9 = class190.field3331[var8];
            int var10 = class190.field3339[var8];
            boolean var11 = true;
            int var12 = class190.field3336[var8];
            int var13 = class190.field3333[var8];
            while (var11) {
                var11 = false;
                for (int var22 = 0; ~var8 < ~var22; ++var22) {
                    if (~(class190.field3336[var22] + -class190.field3333[var22]) > ~(var12 + 2) && class190.field3336[var22] + 2 > var12 - var13 && ~(class190.field3339[var22] + class190.field3331[var22]) < ~(-var10 + var9) && ~(class190.field3331[var22] + -class190.field3339[var22]) > ~(var9 - -var10) && ~(class190.field3336[var22] + -class190.field3333[var22]) > ~var12) {
                        var11 = true;
                        var12 = class190.field3336[var22] + -class190.field3333[var22];
                    }
                }
            }
            class5.field52 = class190.field3331[var8];
            class114.field1885 = class190.field3336[var8] = var12;
            class191 var14 = class190.field3329[var8];
            if (class225.field4037 == 0) {
                int var15 = 16776960;
                if (class190.field3341[var8] < 6) {
                    var15 = class88.field1443[class190.field3341[var8]];
                }
                if (class190.field3341[var8] == 6) {
                    var15 = class182.field3131 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class190.field3341[var8] == -8) {
                    var15 = ~(class182.field3131 % 20) > -11 ? 255 : 65535;
                }
                if (class190.field3341[var8] == 8) {
                    var15 = class182.field3131 % 20 < 10 ? 45056 : 8454016;
                }
                if (class190.field3341[var8] == 9) {
                    int var16 = -class190.field3334[var8] + 150;
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (~var16 <= -101) {
                        if (~var16 > -151) {
                            var15 = 65280 - -((var16 + -100) * 5);
                        }
                    } else {
                        var15 = -((var16 + -50) * 327680) + 16776960;
                    }
                }
                if (class190.field3341[var8] == 10) {
                    int var17 = -class190.field3334[var8] + 150;
                    if (~var17 > -51) {
                        var15 = var17 * 5 + 16711680;
                    } else if (~var17 > -101) {
                        var15 = -(var17 * 327680) + 16384000 + 16711935;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + -32767745 + 500 + -(var17 * 5);
                    }
                }
                if (class190.field3341[var8] == 11) {
                    int var18 = -class190.field3334[var8] + 150;
                    if (~var18 <= -51) {
                        if (var18 >= 100) {
                            if (~var18 > -151) {
                                var15 = -(var18 * 327680) + 32768000 + 16777215;
                            }
                        } else {
                            var15 = var18 * 327685 + 65280 + -16384250;
                        }
                    } else {
                        var15 = 16777215 - var18 * 327685;
                    }
                }
                if (~class190.field3330[var8] == -1) {
                    class230.field4128.method288(var14, class5.field52 + arg0, class114.field1885 + arg2, var15, 0);
                }
                if (~class190.field3330[var8] == -2) {
                    class230.field4128.method294(var14, class5.field52 + arg0, class114.field1885 + arg2, var15, 0, class182.field3131);
                }
                if (~class190.field3330[var8] == -3) {
                    class230.field4128.method300(var14, class5.field52 + arg0, class114.field1885 + arg2, var15, 0, class182.field3131);
                }
                if (class190.field3330[var8] == 3) {
                    class230.field4128.method290(var14, class5.field52 + arg0, class114.field1885 + arg2, var15, 0, class182.field3131, -class190.field3334[var8] + 150);
                }
                if (class190.field3330[var8] == 4) {
                    int var19 = (-class190.field3334[var8] + 150) * (class230.field4128.method302(var14) + 100) / 150;
                    class7.method53(class5.field52 + arg0 + -50, arg2, class5.field52 + arg0 + 50, arg2 + arg6);
                    class230.field4128.method296(var14, class5.field52 + 50 + -var19 + arg0, class114.field1885 + arg2, var15, 0);
                    class7.method54(arg0, arg2, arg0 + arg3, arg2 - -arg6);
                }
                if (class190.field3330[var8] == 5) {
                    int var20 = -class190.field3334[var8] + 150;
                    class7.method53(arg0, arg2 - -class114.field1885 + -class230.field4128.field786 + -1, arg0 + arg3, arg2 - -5 + class114.field1885);
                    int var21 = 0;
                    if (~var20 > -26) {
                        var21 = var20 + -25;
                    } else if (~var20 < -126) {
                        var21 = var20 + -125;
                    }
                    class230.field4128.method288(var14, class5.field52 + arg0, class114.field1885 + var21 + arg2, var15, 0);
                    class7.method54(arg0, arg2, arg0 + arg3, arg2 + arg6);
                }
            } else {
                class230.field4128.method288(var14, class5.field52 + arg0, class114.field1885 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
    public final void method446(int arg0, int arg1, byte arg2) {
        ++field4330;
        int var4 = this.field4332 * arg0 >> 12;
        int var5 = this.field4333 * arg1 >> 12;
        int var6 = this.field4341 * arg0 >> 12;
        if (arg2 >= -40) {
            method1702(-2, 27, 105, -9, 7, 39, 42, -108, (byte) 125, 30, 3);
        }
        int var7 = this.field4335 * arg1 >> 12;
        class206.method1420(super.field1161, super.field1165, var4, -118, var6, var7, var5);
    }
}
