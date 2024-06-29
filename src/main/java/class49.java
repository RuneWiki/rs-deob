import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class49 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Laf;")
    public class102 field834;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lrk;")
    public static class427 field829;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
    public int[] field835;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[Lkb;")
    public static class80[] field832;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field831++;
        class293.field3960 = 0;
        for (int var7 = -1; var7 < (class221.field3055 + class174.field2579); var7++) {
            class15 var30 = null;
            class362 var31;
            if (var7 < 0) {
                var31 = class95.field1379;
            } else if (var7 >= class174.field2579) {
                var31 = class298.field4012[class209.field2891[var7 - class174.field2579]];
                var30 = ((class127) var31).field1784;
                if (var30.field177 != null) {
                    var30 = var30.method78(0);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class220.field3044[class134.field1921[var7]];
            }
            if (var31.field4923 >= 0) {
                class397.method2440(arg4, (byte) 31, arg2 >> 1, var31, arg5 >> 1, var31.method1000((byte) -87), arg0);
                if (class220.field3043[0] >= 0) {
                    if (var31.field4975 != null && (var7 >= class174.field2579 || class442.field6357 == 0 || class442.field6357 == 3 || class442.field6357 == 1 && class101.method864(-13619, ((class338) var31).field4577)) && class374.field5255 > class293.field3960) {
                        class374.field5249[class293.field3960] = class19.field375.method2060(var31.field4975, (byte) 112) / 2;
                        class374.field5262[class293.field3960] = class220.field3043[0];
                        class374.field5257[class293.field3960] = class220.field3043[1];
                        class374.field5252[class293.field3960] = var31.field4915;
                        class374.field5251[class293.field3960] = var31.field4973;
                        class374.field5250[class293.field3960] = var31.field4969;
                        class374.field5260[class293.field3960] = var31.field4975;
                        class293.field3960++;
                    }
                    class80 var32 = class10.field80[0];
                    int var33 = class220.field3043[1] + arg1 - Math.max(class19.field375.field4389, var32.method733());
                    if (!var31.field4972 && var31.field4935 > class414.field5793) {
                        class80 var34 = class10.field80[1];
                        if (var31 instanceof class127) {
                            class127 var35 = (class127) var31;
                            class80[] var36 = (class80[]) class213.field2964.method2537(-62, (long) var35.field1784.field180);
                            if (var36 == null) {
                                class214[] var37 = class214.method1455(class187.field2705, var35.field1784.field180, 0);
                                if (var37 != null) {
                                    var36 = new class80[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class249.field3415.method213(var37[var38], true);
                                    }
                                    class213.field2964.method2542(var36, (byte) 88, (long) var35.field1784.field180);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var32 = var36[0];
                                var34 = var36[1];
                            }
                        }
                        int var39 = arg6 - ((var32.method723() >> 1) - class220.field3043[0]);
                        var32.method722(var39, var33);
                        int var40 = var32.method723() * var31.field4951 / 255;
                        class249.field3415.method218(var39, var33, var39 + var40, var33 - -var32.method733());
                        var34.method722(var39, var33);
                        class249.field3415.method111(arg6, arg1, arg2 + arg6, arg1 + arg5);
                    }
                    var33 -= 2;
                    if (!var31.field4972) {
                        if (class414.field5793 < var31.field4954) {
                            class80 var41 = class53.field859[var31.field4920 ? 2 : 0];
                            class80 var42 = class53.field859[var31.field4920 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if ((var31 instanceof class127)) {
                                var44 = var30.field167;
                                if (var44 == -1) {
                                    var44 = var31.method2280(arg3 + 16743).field6160;
                                }
                            } else {
                                var44 = var31.method2280(69).field6160;
                            }
                            if (var44 != -1) {
                                class80[] var45 = (class80[]) class127.field1798.method2537(arg3 ^ 0x417B, (long) var44);
                                if (var45 == null) {
                                    class214[] var46 = class214.method1455(class187.field2705, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class80[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class249.field3415.method213(var46[var47], true);
                                        }
                                        class127.field1798.method2542(var45, (byte) -109, (long) var44);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field4920 ? 3 : 1];
                                    var41 = var45[var31.field4920 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field4954 - class414.field5793;
                            int var51;
                            if (var48 > var31.field4943) {
                                int var49 = var48 - var31.field4943;
                                int var50 = var31.field4930 == 0 ? 0 : (var31.field4950 - var49) / var31.field4930 * var31.field4930;
                                var51 = var50 * var41.method723() / var31.field4950;
                            } else {
                                var51 = var41.method723();
                            }
                            int var52 = var41.method733();
                            var33 -= var52;
                            int var53 = class220.field3043[0] + (arg6 - (var41.method723() >> 1));
                            var41.method722(var53, var33);
                            class249.field3415.method218(var53, var33, var51 + var53, var33 - -var52);
                            var42.method722(var53, var33);
                            class249.field3415.method111(arg6, arg1, arg2 + arg6, arg1 + arg5);
                            var33 -= 2;
                        }
                        if (class174.field2579 > var7) {
                            class338 var54 = (class338) var31;
                            if (var54.field4598 != -1) {
                                var33 -= 25;
                                class400.field5589[var54.field4598].method722(class220.field3043[0] + arg6 - 12, var33);
                                var33 -= 2;
                            }
                            if (var54.field4574 != -1) {
                                var33 -= 25;
                                field832[var54.field4574].method722(class220.field3043[0] + arg6 - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field120 >= 0 && var30.field120 < field832.length) {
                            var33 -= 25;
                            class80 var55 = field832[var30.field120];
                            var55.method722(class220.field3043[0] + arg6 - (var55.method723() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class338) {
                        int var62 = 0;
                        class192[] var63 = class16.field186;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class192 var68 = var63[var64];
                            if (var68 != null && var68.field2763 == 1 && class209.field2891[var7 - class174.field2579] == var68.field2755) {
                                class80 var69 = class377.field5308[var68.field2769];
                                if (var62 < var69.method733()) {
                                    var62 = var69.method733();
                                }
                                if (class414.field5793 % 20 < 10) {
                                    var69.method722(class220.field3043[0] + arg6 - 12, var33 + -var69.method733());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class192[] var57 = class16.field186;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class192 var60 = var57[var58];
                            if (var60 != null && var60.field2763 == 10 && class134.field1921[var7] == var60.field2755) {
                                class80 var61 = class377.field5308[var60.field2769];
                                if (var56 < var61.method733()) {
                                    var56 = var61.method733();
                                }
                                var61.method722(class220.field3043[0] + arg6 - 12, -var61.method733() + var33);
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (class414.field5793 < var31.field4967[var66]) {
                            int var67 = var31.method1000((byte) -67) / 2;
                            class397.method2440(arg4, (byte) 31, arg2 >> 1, var31, arg5 >> 1, var67, arg0);
                            if (class220.field3043[0] > -1) {
                                if (var66 == 1) {
                                    class220.field3043[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class220.field3043[0] -= 15;
                                    class220.field3043[1] -= 10;
                                }
                                if (var66 == 3) {
                                    class220.field3043[1] -= 10;
                                    class220.field3043[0] += 15;
                                }
                                class269.field3617[var31.field4966[var66]].method722(arg6 + class220.field3043[0] - 12, class220.field3043[1] + arg1 + -12);
                                class43.field650.method1309(0, Integer.toString(var31.field4947[var66]), (byte) 106, -1, arg1 + class220.field3043[1] + 3, class220.field3043[0] + arg6 + -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class440.field6326; var8++) {
            int var26 = class358.field4857[var8];
            class362 var27;
            if (var26 < 2048) {
                var27 = class220.field3044[var26];
            } else {
                var27 = class298.field4012[var26 - 2048];
            }
            int var28 = class19.field370[var8];
            class362 var29;
            if (var28 >= 2048) {
                var29 = class298.field4012[var28 - 2048];
            } else {
                var29 = class220.field3044[var28];
            }
            class340.method2161((byte) -1, var27, arg2, var29, --var27.field4938, arg5, arg6, arg1, arg0, arg4);
        }
        int var9 = class19.field375.field4389 + class19.field375.field4376 + 2;
        if (arg3 != -16646) {
            field829 = null;
        }
        for (int var10 = 0; var10 < class293.field3960; var10++) {
            int var11 = class374.field5262[var10];
            int var12 = class374.field5257[var10];
            int var13 = class374.field5249[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if ((var12 + 2) > (class374.field5257[var25] - var9) && var12 - var9 < class374.field5257[var25] + 2 && var11 - var13 < class374.field5262[var25] + class374.field5249[var25] && class374.field5262[var25] - class374.field5249[var25] < var11 - -var13 && var12 > (class374.field5257[var25] - var9)) {
                        var14 = true;
                        var12 = class374.field5257[var25] - var9;
                    }
                }
            }
            class374.field5257[var10] = var12;
            String var15 = class374.field5260[var10];
            if (class128.field1826 == 0) {
                int var16 = 16776960;
                if (class374.field5252[var10] < 6) {
                    var16 = class307.field4166[class374.field5252[var10]];
                }
                if (class374.field5252[var10] == 6) {
                    var16 = class128.field1811 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class374.field5252[var10] == 7) {
                    var16 = class128.field1811 % 20 >= 10 ? 65535 : 255;
                }
                if (class374.field5252[var10] == 8) {
                    var16 = class128.field1811 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class374.field5252[var10] == 9) {
                    int var17 = 150 - class374.field5250[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = ((var17 - 100) * 5) + 65280;
                    }
                }
                if (class374.field5252[var10] == 10) {
                    int var18 = 150 - class374.field5250[var10];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 * 327680 - 16384000);
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - ((var18 - 100) * 5);
                    }
                }
                if (class374.field5252[var10] == 11) {
                    int var19 = 150 - class374.field5250[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - ((var19 - 100) * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class374.field5251[var10] == 0) {
                    class96.field1387.method1309(0, var15, (byte) 106, var20, arg1 + var12, arg6 - -var11);
                }
                if (class374.field5251[var10] == 1) {
                    class96.field1387.method1312(0, arg1 + var12, arg6 + var11, var15, var20, class128.field1811, 2);
                }
                if (class374.field5251[var10] == 2) {
                    class96.field1387.method1317(arg6 + var11, var15, arg1 + var12, (byte) -107, 0, class128.field1811, var20);
                }
                if (class374.field5251[var10] == 3) {
                    class96.field1387.method1304(arg1 + var12, arg3 + 16519, arg6 + var11, var20, class128.field1811, var15, 150 - class374.field5250[var10], 0);
                }
                if (class374.field5251[var10] == 4) {
                    int var21 = (150 - class374.field5250[var10]) * (class19.field375.method2060(var15, (byte) 48) + 100) / 150;
                    class249.field3415.method218(arg6 + var11 - 50, arg1, arg6 + var11 + 50, arg1 - -arg5);
                    class96.field1387.method1314(arg6 + var11 + 50 - var21, var20, var15, -25, arg1 + var12, 0);
                    class249.field3415.method111(arg6, arg1, arg2 + arg6, arg1 + arg5);
                }
                if (class374.field5251[var10] == 5) {
                    int var22 = 150 - class374.field5250[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class19.field375.field4389 + class19.field375.field4376;
                    class249.field3415.method218(arg6, arg1 + var12 - (var24 + 1), arg6 - -arg2, arg1 + var12 + 5);
                    class96.field1387.method1309(0, var15, (byte) 106, var20, arg1 + var23 + var12, arg6 + var11);
                    class249.field3415.method111(arg6, arg1, arg6 + arg2, arg1 + arg5);
                }
            } else {
                class96.field1387.method1309(0, var15, (byte) 106, -256, arg1 + var12, arg6 + var11);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static void method495(boolean arg0) {
        if (!arg0) {
            method495(true);
        }
        field829 = null;
        field832 = null;
    }
}
