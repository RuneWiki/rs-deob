import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class459 extends class445 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class459(int arg0, int arg1) {
        this.field6224 = arg1;
        this.field6222 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
    public static final boolean method2698(int arg0) throws IOException {
        field6221++;
        if (class280.field3743 == null) {
            return false;
        }
        int var1 = class280.field3743.method2306(arg0 ^ 0x5DB9);
        if (var1 == 0) {
            return false;
        }
        if (class374.field5163 == null) {
            if (class218.field2924) {
                var1--;
                class280.field3743.method2304(class314.field4171.field472, 1, arg0 ^ 0x5DB9, 0);
                class65.field862++;
                class218.field2924 = false;
            }
            class314.field4171.field456 = 0;
            if (class314.field4171.method1666((byte) -94)) {
                if (var1 == 0) {
                    return false;
                }
                class280.field3743.method2304(class314.field4171.field472, 1, 1, 1);
                var1--;
                class65.field862++;
            }
            class218.field2924 = true;
            class434[] var2 = class202.method1153(false);
            int var3 = class314.field4171.method1660(17529);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3);
            }
            class374.field5163 = var2[var3];
            class136.field1983 = class374.field5163.field5905;
        }
        if (class136.field1983 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class280.field3743.method2304(class314.field4171.field472, 1, 1, 0);
            class65.field862++;
            class136.field1983 = class314.field4171.field472[0] & 0xFF;
            var1--;
        }
        if (class136.field1983 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class280.field3743.method2304(class314.field4171.field472, 2, 1, 0);
            class314.field4171.field456 = 0;
            var1 -= 2;
            class136.field1983 = class314.field4171.method215((byte) 122);
            class65.field862 += 2;
        }
        if (class136.field1983 > var1) {
            return false;
        }
        class314.field4171.field456 = 0;
        class280.field3743.method2304(class314.field4171.field472, class136.field1983, 1, 0);
        class475.field6535 = 0;
        class395.field5473 = class466.field6453;
        class65.field862 += class136.field1983;
        class466.field6453 = class389.field5387;
        class389.field5387 = class374.field5163;
        if (class52.field698 == class374.field5163) {
            class148.method878(class251.field3359, class136.field1983, arg0 - 44352, class314.field4171);
            class374.field5163 = null;
            return true;
        } else if (class385.field5337 == class374.field5163) {
            class38.field562.method1944((byte) 9);
            class374.field5163 = null;
            class413.field5651 += 32;
            return true;
        } else if (class374.field5163 == class171.field2352) {
            int var4 = class314.field4171.method201((byte) -107);
            int var5 = class314.field4171.method189(true);
            int var6 = class314.field4171.method189(true);
            if (class400.method2426((byte) 119, var6)) {
                if (var4 == 2) {
                    class308.method1701(true);
                }
                class196.field2674 = var5;
                class130.method799(0, var5);
                class73.method479(false, false);
                class382.method2347(class196.field2674);
                for (int var7 = 0; var7 < 100; var7++) {
                    class102.field1468[var7] = true;
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class341.field4567) {
            byte var8 = class314.field4171.method240((byte) 98);
            int var9 = class314.field4171.method192((byte) 59);
            int var10 = class314.field4171.method239((byte) 107);
            if (class400.method2426((byte) 110, var9)) {
                class302.method1688(var10, -12370, var8);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class181.field2493) {
            int var11 = class314.field4171.method215((byte) 90);
            if (class400.method2426((byte) 127, var11)) {
                class35.method264((byte) 107);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class215.field2899) {
            int var12 = class314.field4171.method221(false);
            int var13 = class314.field4171.method221(false);
            int var14 = class314.field4171.method189(true);
            if (class400.method2426((byte) 123, var14)) {
                class132 var15 = (class132) class214.field2883.method1528((long) var12, 114);
                class132 var16 = (class132) class214.field2883.method1528((long) var13, arg0 ^ 0x5D80);
                if (var16 != null) {
                    class284.method1603(false, true, var16, var15 == null || var15.field1939 != var16.field1939);
                }
                if (var15 != null) {
                    var15.method2614((byte) -78);
                    class214.field2883.method1525((byte) 19, var15, (long) var13);
                }
                class464 var17 = class150.method888((byte) -115, var12);
                if (var17 != null) {
                    class490.method2854(var17, (byte) 100);
                }
                class464 var18 = class150.method888((byte) -115, var13);
                if (var18 != null) {
                    class490.method2854(var18, (byte) 114);
                    class265.method1499(true, var18, (byte) 19);
                }
                if (class196.field2674 != -1) {
                    class291.method1636(class196.field2674, 1, (byte) 78);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class261.field3457) {
            if (class196.field2674 != -1) {
                class291.method1636(class196.field2674, 0, (byte) 78);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class298.field3993) {
            int var19 = class314.field4171.method215((byte) 94);
            if (class400.method2426((byte) 105, var19)) {
                class363.method2214(-118);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class239.field3184) {
            String var20 = class314.field4171.method195(-18);
            String var21 = class460.method2702(arg0 ^ 0x5DD9, class223.method1264(class314.field4171, -16086));
            class447.method2624(70, var20, 0, var21, 6, var20);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class120.field1767) {
            int var22 = class314.field4171.method192((byte) 59);
            int var23 = class314.field4171.method192((byte) 59);
            int var24 = class314.field4171.method222(arg0 - 22968);
            int var25 = class314.field4171.method189(true);
            if ((var24 >> 30) != 0) {
                int var26 = (var24 & 0x334C4905) >> 28;
                int var27 = ((var24 & 0xFFFFA52) >> 14) - class162.field2260;
                int var28 = (var24 & 0x3FFF) - class266.field3511;
                if (var27 >= 0 && var28 >= 0 && class295.field3947 > var27 && class39.field567 > var28) {
                    int var29 = var27 * 128 + 64;
                    int var30 = var28 * 128 + 64;
                    class103 var31 = new class103(var22, 0, class70.field968, var26, var29, class247.method1385(-120, var29, var30, var26) - var25, var30, var27, var27, var28, var28);
                    class450.field6124.method641(new class437(var31), (byte) -93);
                }
            } else if (var24 >> 29 != 0) {
                int var44 = var24 & 0xFFFF;
                class121 var45 = class221.field2941[var44];
                if (var45 != null) {
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    boolean var46 = true;
                    if (var22 != -1 && var45.field1134 != -1) {
                        if (var45.field1134 == var22) {
                            class248 var51 = class302.field4030.method1394(var22, -7290);
                            if (var51.field3305 && var51.field3310 != -1) {
                                class181 var52 = class395.field5477.method266(16107, var51.field3310);
                                int var53 = var52.field2470;
                                if (var53 == 0 || var53 == 2) {
                                    var46 = false;
                                } else if (var53 == 1) {
                                    var46 = true;
                                }
                            }
                        } else {
                            class248 var47 = class302.field4030.method1394(var22, -7290);
                            class248 var48 = class302.field4030.method1394(var45.field1134, -7290);
                            if (var47.field3310 != -1 && var48.field3310 != -1) {
                                class181 var49 = class395.field5477.method266(16107, var47.field3310);
                                class181 var50 = class395.field5477.method266(16107, var48.field3310);
                                if (var50.field2471 > var49.field2471) {
                                    var46 = false;
                                }
                            }
                        }
                    }
                    if (var46) {
                        var45.field1134 = var22;
                        var45.field1165 = 0;
                        var45.field1118 = 0;
                        var45.field1135 = class70.field968 + var23;
                        var45.field1190 = var25;
                        var45.field1155 = 1;
                        if (class70.field968 < var45.field1135) {
                            var45.field1118 = -1;
                        }
                        if (var45.field1134 != -1 && class70.field968 == var45.field1135) {
                            int var54 = class302.field4030.method1394(var45.field1134, arg0 - 31282).field3310;
                            if (var54 != -1) {
                                class181 var55 = class395.field5477.method266(arg0 - 7885, var54);
                                if (var55 != null && var55.field2468 != null) {
                                    class402.method2437(var55, false, var45.field6502, arg0 ^ 0xFFFFA233, var45.field6501, var45.field6507, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var24 >> 28 != 0) {
                int var32 = var24 & 0xFFFF;
                class487 var33;
                if (class332.field4494 == var32) {
                    var33 = class233.field3103;
                } else {
                    var33 = class413.field5644[var32];
                }
                if (var33 != null) {
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    boolean var34 = true;
                    if (var22 != -1 && var33.field1134 != -1) {
                        if (var33.field1134 == var22) {
                            class248 var35 = class302.field4030.method1394(var22, -7290);
                            if (var35.field3305 && var35.field3310 != -1) {
                                class181 var36 = class395.field5477.method266(16107, var35.field3310);
                                int var37 = var36.field2470;
                                if (var37 == 0 || var37 == 2) {
                                    var34 = false;
                                } else if (var37 == 1) {
                                    var34 = true;
                                }
                            }
                        } else {
                            class248 var38 = class302.field4030.method1394(var22, arg0 - 31282);
                            class248 var39 = class302.field4030.method1394(var33.field1134, -7290);
                            if (var38.field3310 != -1 && var39.field3310 != -1) {
                                class181 var40 = class395.field5477.method266(arg0 - 7885, var38.field3310);
                                class181 var41 = class395.field5477.method266(arg0 - 7885, var39.field3310);
                                if (var41.field2471 > var40.field2471) {
                                    var34 = false;
                                }
                            }
                        }
                    }
                    if (var34) {
                        var33.field1165 = 0;
                        var33.field1118 = 0;
                        var33.field1155 = 1;
                        var33.field1190 = var25;
                        var33.field1134 = var22;
                        var33.field1135 = class70.field968 + var23;
                        if (var33.field1134 == 65535) {
                            var33.field1134 = -1;
                        }
                        if (class70.field968 < var33.field1135) {
                            var33.field1118 = -1;
                        }
                        if (var33.field1134 != -1 && class70.field968 == var33.field1135) {
                            int var42 = class302.field4030.method1394(var33.field1134, -7290).field3310;
                            if (var42 != -1) {
                                class181 var43 = class395.field5477.method266(16107, var42);
                                if (var43 != null && var43.field2468 != null) {
                                    class402.method2437(var43, class233.field3103 == var33, var33.field6502, -108, var33.field6501, var33.field6507, 0);
                                }
                            }
                        }
                    }
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class2.field30) {
            int var56 = class314.field4171.method239((byte) 107);
            int var57 = class314.field4171.method238(-2);
            int var58 = class314.field4171.method192((byte) 59);
            if (class400.method2426((byte) 107, var58)) {
                class445.method2615(var56, arg0 ^ 0xFFFFA23D, var57);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class33.field504) {
            int var59 = class314.field4171.method192((byte) 59);
            int var60 = class314.field4171.method190(arg0 ^ 0x5DC3);
            if (class400.method2426((byte) 116, var59)) {
                class70.field963 = var60;
            }
            class374.field5163 = null;
            return true;
        } else if (class460.field6233 == class374.field5163) {
            class190.method1088(class314.field4171, (byte) 73, class136.field1983);
            class374.field5163 = null;
            return true;
        } else if (class90.field1314 == class374.field5163) {
            int var61 = class314.field4171.method215((byte) 99);
            if (var61 == 65535) {
                var61 = -1;
            }
            int var62 = class314.field4171.method189(true);
            int var63 = class314.field4171.method192((byte) 59);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class314.field4171.method215((byte) 120);
            int var65 = class314.field4171.method238(-2);
            if (class400.method2426((byte) 122, var64)) {
                for (int var66 = var61; var66 <= var63; var66++) {
                    long var67 = ((long) var65 << 32) + (long) var66;
                    class222 var69 = (class222) class128.field1876.method1528(var67, arg0 ^ 0x5DF1);
                    class222 var70;
                    if (var69 != null) {
                        var70 = new class222(var69.field2954, var62);
                        var69.method2614((byte) -69);
                    } else if (var66 == -1) {
                        var70 = new class222(class150.method888((byte) -115, var65).field6317.field2954, var62);
                    } else {
                        var70 = new class222(0, var62);
                    }
                    class128.field1876.method1525((byte) 19, var70, var67);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class31.field410) {
            int var71 = class314.field4171.method230((byte) 27);
            int var72 = class314.field4171.method239((byte) 107);
            if (class400.method2426((byte) 111, var72)) {
                class98.method603(-1, -1, 3, 94, var71);
            }
            class374.field5163 = null;
            return true;
        } else if (class480.field6640 == class374.field5163) {
            int var73 = class314.field4171.method192((byte) 59);
            int var74 = class314.field4171.method197(-989178832);
            int var75 = class314.field4171.method230((byte) 27);
            int var76 = class314.field4171.method215((byte) 113);
            if (class400.method2426((byte) 117, var73)) {
                class132 var77 = (class132) class214.field2883.method1528((long) var75, 97);
                if (var77 != null) {
                    class284.method1603(false, true, var77, var77.field1939 != var76);
                }
                class257.method1451(var75, var74, arg0 - 24065, false, var76);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class364.field5003) {
            int var78 = class314.field4171.method222(1024);
            int var79 = class314.field4171.method190(124);
            int var80 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            class322.field4293[var79] = var78;
            class475.field6542[var79] = var80;
            class151.field2136[var79] = 1;
            int var81 = class477.field6593[var79] - 1;
            for (int var82 = 0; var82 < var81; var82++) {
                if (var78 >= class233.field3101[var82]) {
                    class151.field2136[var79] = var82 + 2;
                }
            }
            class351.field4866[class99.method612(31, class164.field2273++)] = var79;
            class374.field5163 = null;
            return true;
        } else if (class460.field6231 == class374.field5163) {
            int var83 = class314.field4171.method215((byte) 96);
            int var84 = class314.field4171.method201((byte) -125);
            int var85 = class314.field4171.method201((byte) -113);
            int var86 = class314.field4171.method215((byte) 107);
            int var87 = class314.field4171.method201((byte) -118);
            int var88 = class314.field4171.method201((byte) -113);
            if (class400.method2426((byte) 123, var83)) {
                class132.method805(102, var85, var87, var88, true, var86, var84);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class192.field2606) {
            while (class314.field4171.field456 < class136.field1983) {
                boolean var99 = class314.field4171.method201((byte) -122) == 1;
                String var100 = class314.field4171.method195(arg0 ^ 0x5DD3);
                String var101 = class314.field4171.method195(-50);
                int var102 = class314.field4171.method215((byte) 100);
                int var103 = class314.field4171.method201((byte) -119);
                String var104 = "";
                boolean var105 = false;
                if (var102 > 0) {
                    var104 = class314.field4171.method195(-100);
                    var105 = class314.field4171.method201((byte) -122) == 1;
                }
                for (int var106 = 0; var106 < class90.field1317; var106++) {
                    if (var99) {
                        if (var101.equals(class233.field3106[var106])) {
                            class233.field3106[var106] = var100;
                            class405.field5554[var106] = var101;
                            var100 = null;
                            break;
                        }
                    } else if (var100.equals(class233.field3106[var106])) {
                        if (class155.field2163[var106] != var102) {
                            class155.field2163[var106] = var102;
                            if (var102 > 0) {
                                class447.method2624(38, "", 0, var100 + class296.field3948.method1176(class110.field1676, (byte) -98), 5, "");
                            }
                            if (var102 == 0) {
                                class447.method2624(arg0 ^ 0x5DD1, "", 0, var100 + class1.field3.method1176(class110.field1676, (byte) -90), 5, "");
                            }
                        }
                        class405.field5554[var106] = var101;
                        class117.field1732[var106] = var104;
                        class70.field964[var106] = var103;
                        var100 = null;
                        class25.field317[var106] = var105;
                        break;
                    }
                }
                if (var100 != null && class90.field1317 < 200) {
                    class233.field3106[class90.field1317] = var100;
                    class405.field5554[class90.field1317] = var101;
                    class155.field2163[class90.field1317] = var102;
                    class117.field1732[class90.field1317] = var104;
                    class70.field964[class90.field1317] = var103;
                    class25.field317[class90.field1317] = var105;
                    class90.field1317++;
                }
            }
            class148.field2104 = 2;
            class41.field587 = class236.field3123;
            boolean var89 = false;
            int var90 = class90.field1317;
            while (var90 > 0) {
                boolean var91 = true;
                var90--;
                for (int var92 = 0; var92 < var90; var92++) {
                    if (class155.field2163[var92] != class33.field506 && class155.field2163[var92 + 1] == class33.field506 || class155.field2163[var92] == 0 && class155.field2163[var92 + 1] != 0) {
                        int var93 = class155.field2163[var92];
                        class155.field2163[var92] = class155.field2163[var92 + 1];
                        class155.field2163[var92 + 1] = var93;
                        String var94 = class117.field1732[var92];
                        class117.field1732[var92] = class117.field1732[var92 + 1];
                        class117.field1732[var92 + 1] = var94;
                        String var95 = class233.field3106[var92];
                        class233.field3106[var92] = class233.field3106[var92 + 1];
                        class233.field3106[var92 + 1] = var95;
                        String var96 = class405.field5554[var92];
                        class405.field5554[var92] = class405.field5554[var92 + 1];
                        class405.field5554[var92 + 1] = var96;
                        int var97 = class70.field964[var92];
                        class70.field964[var92] = class70.field964[var92 + 1];
                        class70.field964[var92 + 1] = var97;
                        boolean var98 = class25.field317[var92];
                        class25.field317[var92] = class25.field317[var92 + 1];
                        var91 = false;
                        class25.field317[var92 + 1] = var98;
                    }
                }
                if (var91) {
                    break;
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class91.field1345 == class374.field5163) {
            class297.field3978 = class314.field4171.method209((byte) 35);
            class369.field5062 = class236.field3123;
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class323.field4309) {
            boolean var107 = class314.field4171.method201((byte) -107) == 1;
            String var108 = class314.field4171.method195(100);
            String var109 = var108;
            if (var107) {
                var109 = class314.field4171.method195(arg0 - 24007);
            }
            long var110 = (long) class314.field4171.method215((byte) 115);
            long var112 = (long) class314.field4171.method219(-116);
            int var114 = class314.field4171.method201((byte) -109);
            long var115 = (var110 << 32) + var112;
            boolean var117 = false;
            int var118 = 0;
            while (true) {
                if (var118 >= 100) {
                    if (var114 <= 1) {
                        if (!(!class458.field6212 || class330.field4384) || class129.field1900) {
                            var117 = true;
                        } else if (class4.method31(0, var109)) {
                            var117 = true;
                        }
                    }
                    break;
                }
                if (class345.field4745[var118] == var115) {
                    var117 = true;
                    break;
                }
                var118++;
            }
            if (!var117 && class314.field4163 == 0) {
                class345.field4745[class288.field3884] = var115;
                class288.field3884 = (class288.field3884 + 1) % 100;
                String var119 = class460.method2702(-89, class223.method1264(class314.field4171, arg0 ^ -25454));
                if (var114 == 2) {
                    class323.method1795(0, (String) null, 66, var119, -1, 7, "<img=1>" + var109, "<img=1>" + var108);
                } else if (var114 == 1) {
                    class323.method1795(0, (String) null, 89, var119, -1, 7, "<img=0>" + var109, "<img=0>" + var108);
                } else {
                    class323.method1795(0, (String) null, arg0 - 23954, var119, -1, 3, var109, var108);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class69.field944 == class374.field5163) {
            String var120 = class314.field4171.method195(arg0 - 23870);
            int var121 = class314.field4171.method215((byte) 105);
            String var122 = class455.method2674((byte) 79, var121).method1409(class314.field4171, (byte) -24);
            class323.method1795(0, (String) null, 85, var122, var121, 19, var120, var120);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class188.field2574) {
            class476.method2779(0);
            class374.field5163 = null;
            return false;
        } else if (class374.field5163 == class199.field2690) {
            int var123 = class314.field4171.method239((byte) 107);
            int var124 = class314.field4171.method230((byte) 27);
            class38.field562.method1948(var124, (byte) -108, var123);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class112.field1703) {
            int var125 = class314.field4171.method215((byte) 100);
            int var126 = class314.field4171.method201((byte) -119);
            int var127 = class314.field4171.method201((byte) -114);
            int var128 = class314.field4171.method215((byte) 113);
            int var129 = class314.field4171.method201((byte) -107);
            int var130 = class314.field4171.method201((byte) -111);
            if (class400.method2426((byte) 114, var125)) {
                class447.method2627(var129, var128, var127, arg0 ^ 0x5DDD, var130, var126);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class243.field3241) {
            int var131 = class314.field4171.method190(arg0 ^ 0x5DC7);
            int var132 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            if (var131 == 255) {
                var132 = -1;
                var131 = -1;
            }
            class47.method338(var131, var132, (byte) 108);
            class374.field5163 = null;
            return true;
        } else if (class51.field667 == class374.field5163) {
            class289.method1633(class140.field2045, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class150.field2117) {
            int var133 = class314.field4171.method239((byte) 107);
            int var134 = class314.field4171.method230((byte) 27);
            int var135 = class314.field4171.method197(arg0 - 989202824);
            if (class400.method2426((byte) 107, var133)) {
                class233.method1298((byte) -59, var134, var135);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class327.field4363) {
            for (int var136 = 0; var136 < class413.field5644.length; var136++) {
                if (class413.field5644[var136] != null) {
                    class413.field5644[var136].field1137 = -1;
                }
            }
            for (int var137 = 0; var137 < class221.field2941.length; var137++) {
                if (class221.field2941[var137] != null) {
                    class221.field2941[var137].field1137 = -1;
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class383.field5276 == class374.field5163) {
            class370.field5068 = class314.field4171.method215((byte) 101) * 30;
            class374.field5163 = null;
            class369.field5062 = class236.field3123;
            return true;
        } else if (class475.field6541 == class374.field5163) {
            int var138 = class314.field4171.method215((byte) 97);
            if (var138 == 65535) {
                var138 = -1;
            }
            int var139 = class314.field4171.method201((byte) -117);
            int var140 = class314.field4171.method215((byte) 103);
            int var141 = class314.field4171.method201((byte) -111);
            class66.method439(var139, false, var141, var140, var138);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class107.field1609) {
            int var142 = class314.field4171.method222(1024);
            int var143 = class314.field4171.method189(true);
            int var144 = class314.field4171.method192((byte) 59);
            if (class400.method2426((byte) 115, var143)) {
                class33.method254(var144, (byte) 93, var142);
            }
            class374.field5163 = null;
            return true;
        } else if (class88.field1229 == class374.field5163) {
            class289.method1633(class80.field1073, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class342.field4583) {
            class289.method1633(class1.field22, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class107.field1602) {
            int var145 = class314.field4171.method239((byte) 107);
            int var146 = class314.field4171.method238(-2);
            int var147 = class314.field4171.method215((byte) 104);
            int var148 = class314.field4171.method239((byte) 107);
            if (class400.method2426((byte) 126, var147)) {
                class385.method2361((byte) 103, (var148 << 16) + var145, var146);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class300.field4011) {
            int var149 = class314.field4171.method222(1024);
            int var150 = class314.field4171.method238(-2);
            int var151 = class314.field4171.method192((byte) 59);
            int var152 = class314.field4171.method189(true);
            if (class400.method2426((byte) 115, var151)) {
                class98.method603(var152, var150, 5, 87, var149);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class136.field1980) {
            class324.field4320 = class236.field3123;
            if (class136.field1983 == 0) {
                class484.field6700 = null;
                class312.field4109 = 0;
                class64.field849 = null;
                class374.field5163 = null;
                class68.field928 = null;
                return true;
            }
            class64.field849 = class314.field4171.method195(arg0 ^ 0xFFFFA239);
            boolean var153 = class314.field4171.method201((byte) -109) == 1;
            if (var153) {
                class314.field4171.method195(-38);
            }
            long var154 = class314.field4171.method184(arg0 - 24891864);
            class484.field6700 = class357.method2188(var154, -525737785);
            class155.field2169 = class314.field4171.method211(arg0 ^ 0x291D);
            int var156 = class314.field4171.method201((byte) -113);
            if (var156 == 255) {
                class374.field5163 = null;
                return true;
            }
            class312.field4109 = var156;
            class405[] var157 = new class405[100];
            for (int var158 = 0; var158 < class312.field4109; var158++) {
                var157[var158] = new class405();
                var157[var158].field5555 = class314.field4171.method195(arg0 - 24108);
                boolean var164 = class314.field4171.method201((byte) -118) == 1;
                if (var164) {
                    var157[var158].field5560 = class314.field4171.method195(-66);
                } else {
                    var157[var158].field5560 = var157[var158].field5555;
                }
                var157[var158].field5558 = class92.method589(69, var157[var158].field5560);
                var157[var158].field5561 = class314.field4171.method215((byte) 92);
                var157[var158].field5562 = class314.field4171.method211(29861);
                var157[var158].field5565 = class314.field4171.method195(111);
                if (var157[var158].field5560.equals(class233.field3103.field6742)) {
                    class274.field3628 = var157[var158].field5562;
                }
            }
            boolean var159 = false;
            int var160 = class312.field4109;
            while (var160 > 0) {
                var160--;
                boolean var161 = true;
                for (int var162 = 0; var162 < var160; var162++) {
                    if (var157[var162].field5558.compareTo(var157[var162 + 1].field5558) > 0) {
                        class405 var163 = var157[var162];
                        var157[var162] = var157[var162 + 1];
                        var157[var162 + 1] = var163;
                        var161 = false;
                    }
                }
                if (var161) {
                    break;
                }
            }
            class68.field928 = var157;
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class186.field2555) {
            class314.field4171.field456 += 28;
            if (class314.field4171.method194(false)) {
                class417.method2487(class314.field4171, class314.field4171.field456 - 28, -20206);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class299.field4002) {
            int var165 = class314.field4171.method201((byte) -123);
            if (class314.field4171.method201((byte) -109) == 0) {
                class433.field5893[var165] = new class270();
            } else {
                class314.field4171.field456--;
                class433.field5893[var165] = new class270(class314.field4171);
            }
            class374.field5163 = null;
            class390.field5417 = class236.field3123;
            return true;
        } else if (class374.field5163 == class205.field2771) {
            int var166 = class314.field4171.method215((byte) 100);
            int var167 = class314.field4171.method215((byte) 89);
            int var168 = class314.field4171.method215((byte) 127);
            int var169 = class314.field4171.method215((byte) 89);
            if (class400.method2426((byte) 110, var166) && class146.field2099[var167] != null) {
                for (int var170 = var168; var170 < var169; var170++) {
                    int var171 = class314.field4171.method219(-119);
                    if (var170 < class146.field2099[var167].length && class146.field2099[var167][var170] != null) {
                        class146.field2099[var167][var170].field6305 = var171;
                    }
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class138.field2005) {
            class289.method1633(class96.field1415, 7);
            class374.field5163 = null;
            return true;
        } else if (class490.field6828 == class374.field5163) {
            class289.method1633(class324.field4324, 7);
            class374.field5163 = null;
            return true;
        } else if (class387.field5356 == class374.field5163) {
            class455.field6170 = class314.field4171.method201((byte) -106);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class202.field2737) {
            int var172 = class314.field4171.method215((byte) 101);
            int var173 = class314.field4171.method201((byte) -107);
            int var174 = class314.field4171.method201((byte) -115);
            int var175 = class314.field4171.method201((byte) -125);
            int var176 = class314.field4171.method201((byte) -123);
            int var177 = class314.field4171.method215((byte) 103);
            if (class400.method2426((byte) 112, var172)) {
                class278.field3687[var173] = true;
                class467.field6463[var173] = var174;
                class4.field61[var173] = var175;
                class419.field5687[var173] = var176;
                class409.field5604[var173] = var177;
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class136.field1975) {
            if (class94.field1398 != null) {
                class96.method597(-1, class488.field6789.field6695, (byte) 102, false, -1);
            }
            byte[] var178 = new byte[class136.field1983];
            class314.field4171.method1662(var178, class136.field1983, -4658, 0);
            String var179 = class68.method450(0, var178, class136.field1983, 103);
            class301.method1685(var179, class251.field3359, (byte) -127, class222.field2958 == 1, true);
            class374.field5163 = null;
            return true;
        } else if (class46.field632 == class374.field5163) {
            class289.method1633(class143.field2072, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class148.field2109) {
            class12.field168 = class314.field4171.method201((byte) -112);
            class445.field6060 = class314.field4171.method190(121);
            class134.field1961 = class314.field4171.method249((byte) -113);
            for (class223 var180 = (class223) class33.field505.method1518((byte) -83); var180 != null; var180 = (class223) class33.field505.method1517(-30942)) {
                int var182 = (int) (var180.field6047 & 0x3FFFL);
                int var183 = (int) (var180.field6047 >> 14 & 0x3FFFL);
                int var184 = (int) (var180.field6047 >> 28 & 0x3L);
                if (class134.field1961 == var184 && class12.field168 <= var182 && class12.field168 + 8 > var182 && var183 >= class445.field6060 && var183 < (class445.field6060 + 8)) {
                    var180.method2614((byte) -90);
                    class448.method2637(var182, -751, class134.field1961, var183);
                }
            }
            for (class363 var181 = (class363) class78.field1054.method652((byte) 37); var181 != null; var181 = (class363) class78.field1054.method653(114)) {
                if (var181.field4976 >= class12.field168 && var181.field4976 < (class12.field168 + 8) && var181.field4978 >= class445.field6060 && var181.field4978 < (class445.field6060 + 8) && class134.field1961 == var181.field4972) {
                    var181.field4977 = 0;
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class395.field5471 == class374.field5163) {
            boolean var185 = class314.field4171.method201((byte) -120) == 1;
            String var186 = class314.field4171.method195(104);
            String var187 = var186;
            if (var185) {
                var187 = class314.field4171.method195(-92);
            }
            long var188 = (long) class314.field4171.method215((byte) 102);
            long var190 = (long) class314.field4171.method219(-114);
            int var192 = class314.field4171.method201((byte) -128);
            int var193 = class314.field4171.method215((byte) 109);
            long var194 = (var188 << 32) + var190;
            boolean var196 = false;
            int var197 = 0;
            while (true) {
                if (var197 >= 100) {
                    if (var192 <= 1 && class4.method31(0, var187)) {
                        var196 = true;
                    }
                    break;
                }
                if (class345.field4745[var197] == var194) {
                    var196 = true;
                    break;
                }
                var197++;
            }
            if (!var196 && class314.field4163 == 0) {
                class345.field4745[class288.field3884] = var194;
                class288.field3884 = (class288.field3884 + 1) % 100;
                String var198 = class455.method2674((byte) 113, var193).method1409(class314.field4171, (byte) -24);
                if (var192 == 2) {
                    class323.method1795(0, (String) null, 54, var198, var193, 18, "<img=1>" + var187, "<img=1>" + var186);
                } else if (var192 == 1) {
                    class323.method1795(0, (String) null, 37, var198, var193, 18, "<img=0>" + var187, "<img=0>" + var186);
                } else {
                    class323.method1795(0, (String) null, arg0 - 23940, var198, var193, 18, var187, var186);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class106.field1594) {
            class134.field1961 = class314.field4171.method249((byte) -81);
            class445.field6060 = class314.field4171.method190(125);
            class12.field168 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class294.field3932) {
            class148.field2104 = 1;
            class41.field587 = class236.field3123;
            class374.field5163 = null;
            return true;
        } else if (class6.field78 == class374.field5163) {
            int var199 = class314.field4171.method238(-2);
            int var200 = class314.field4171.method189(true);
            if (var200 == 65535) {
                var200 = -1;
            }
            int var201 = class314.field4171.method221(false);
            int var202 = class314.field4171.method192((byte) 59);
            if (var202 == 65535) {
                var202 = -1;
            }
            int var203 = class314.field4171.method189(true);
            if (class400.method2426((byte) 103, var203)) {
                for (int var204 = var200; var204 <= var202; var204++) {
                    long var205 = ((long) var199 << 32) + ((long) var204);
                    class222 var207 = (class222) class128.field1876.method1528(var205, arg0 - 23922);
                    class222 var208;
                    if (var207 != null) {
                        var208 = new class222(var201, var207.field2955);
                        var207.method2614((byte) -86);
                    } else if (var204 == -1) {
                        var208 = new class222(var201, class150.method888((byte) -115, var199).field6317.field2955);
                    } else {
                        var208 = new class222(var201, -1);
                    }
                    class128.field1876.method1525((byte) 19, var208, var205);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class186.field2559) {
            class65.field865 = class314.field4171.method201((byte) -115);
            for (int var209 = 0; var209 < class65.field865; var209++) {
                class34.field524[var209] = class314.field4171.method195(class71.method462(arg0, -24055));
                class332.field4505[var209] = class314.field4171.method195(class71.method462(arg0, -23974));
                if (class332.field4505[var209].equals("")) {
                    class332.field4505[var209] = class34.field524[var209];
                }
                class31.field424[var209] = class314.field4171.method195(class71.method462(arg0, 24000));
                class98.field1437[var209] = class314.field4171.method195(arg0 - 24028);
                if (class98.field1437[var209].equals("")) {
                    class98.field1437[var209] = class31.field424[var209];
                }
                class336.field4539[var209] = false;
            }
            class374.field5163 = null;
            class41.field587 = class236.field3123;
            return true;
        } else if (class91.field1342 == class374.field5163) {
            String var210 = class314.field4171.method195(arg0 - 24107);
            int var211 = class314.field4171.method192((byte) 59);
            if (var211 == 65535) {
                var211 = -1;
            }
            int var212 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            int var213 = class314.field4171.method197(-989178832);
            if (var212 >= 1 && var212 <= 8) {
                if (var210.equalsIgnoreCase("null")) {
                    var210 = null;
                }
                class134.field1950[var212 - 1] = var210;
                class78.field1056[var212 - 1] = var211;
                class160.field2221[var212 - 1] = var213 == 0;
            }
            class374.field5163 = null;
            return true;
        } else if (class99.field1444 == class374.field5163) {
            int var214 = class314.field4171.method215((byte) 105);
            int var215 = class314.field4171.method192((byte) 59);
            int var216 = class314.field4171.method192((byte) 59);
            if (class400.method2426((byte) 127, var215)) {
                class374.method2297(0, var214, (byte) 6, var216);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class236.field3122) {
            int var217 = class314.field4171.method239((byte) 107);
            int var218 = class314.field4171.method189(true);
            if (var218 == 65535) {
                var218 = -1;
            }
            int var219 = class314.field4171.method221(false);
            int var220 = class314.field4171.method238(-2);
            if (class400.method2426((byte) 122, var217)) {
                class168.method990(var218, var220, var219, -123);
                class443 var221 = class175.field2385.method1557(var218, 21992);
                class270.method1533(var221.field5976, var221.field6014, var220, var221.field6009, (byte) -79);
                class182.method1069(var220, var221.field6018, var221.field6022, 10, var221.field6000);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class127.field1857) {
            class218.method1246(arg0 ^ 0x5DB8, true);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class247.field3297) {
            String var222 = class314.field4171.method195(arg0 - 24061);
            boolean var223 = class314.field4171.method201((byte) -111) == 1;
            String var224;
            if (var223) {
                var224 = class314.field4171.method195(119);
            } else {
                var224 = var222;
            }
            int var225 = class314.field4171.method215((byte) 89);
            byte var226 = class314.field4171.method211(29861);
            boolean var227 = false;
            if (var226 == -128) {
                var227 = true;
            }
            if (var227) {
                if (class312.field4109 == 0) {
                    class374.field5163 = null;
                    return true;
                }
                boolean var233 = false;
                int var234;
                for (var234 = 0; var234 < class312.field4109 && (!class68.field928[var234].field5560.equals(var224) || class68.field928[var234].field5561 != var225); var234++) {
                }
                if (var234 < class312.field4109) {
                    while (var234 < (class312.field4109 - 1)) {
                        class68.field928[var234] = class68.field928[var234 + 1];
                        var234++;
                    }
                    class312.field4109--;
                    class68.field928[class312.field4109] = null;
                }
            } else {
                String var228 = class314.field4171.method195(-81);
                class405 var229 = new class405();
                var229.field5555 = var222;
                var229.field5560 = var224;
                var229.field5558 = class92.method589(64, var229.field5560);
                var229.field5562 = var226;
                var229.field5565 = var228;
                var229.field5561 = var225;
                int var230;
                for (var230 = class312.field4109 - 1; var230 >= 0; var230--) {
                    int var231 = class68.field928[var230].field5558.compareTo(var229.field5558);
                    if (var231 == 0) {
                        class68.field928[var230].field5561 = var225;
                        class68.field928[var230].field5562 = var226;
                        class68.field928[var230].field5565 = var228;
                        if (var224.equals(class233.field3103.field6742)) {
                            class274.field3628 = var226;
                        }
                        class324.field4320 = class236.field3123;
                        class374.field5163 = null;
                        return true;
                    }
                    if (var231 < 0) {
                        break;
                    }
                }
                if (class312.field4109 >= class68.field928.length) {
                    class374.field5163 = null;
                    return true;
                }
                for (int var232 = class312.field4109 - 1; var232 > var230; var232--) {
                    class68.field928[var232 + 1] = class68.field928[var232];
                }
                if (class312.field4109 == 0) {
                    class68.field928 = new class405[100];
                }
                class68.field928[var230 + 1] = var229;
                class312.field4109++;
                if (var224.equals(class233.field3103.field6742)) {
                    class274.field3628 = var226;
                }
            }
            class374.field5163 = null;
            class324.field4320 = class236.field3123;
            return true;
        } else if (class460.field6227 == class374.field5163) {
            int var235 = class314.field4171.method203((byte) -75);
            int var236 = class314.field4171.method222(arg0 - 22968);
            int var237 = class314.field4171.method201((byte) -128);
            String var238 = "";
            String var239 = var238;
            if ((var237 & 0x1) != 0) {
                var238 = class314.field4171.method195(arg0 ^ 0x5DCB);
                if ((var237 & 0x2) == 0) {
                    var239 = var238;
                } else {
                    var239 = class314.field4171.method195(arg0 ^ 0x5DCC);
                }
            }
            String var240 = class314.field4171.method195(-9);
            if (var235 == 99) {
                class279.method1574(var240, -44);
            } else if (var239.equals("") || !class4.method31(arg0 - 23992, var239)) {
                class447.method2624(44, var238, var236, var240, var235, var239);
            } else {
                class374.field5163 = null;
                return true;
            }
            class374.field5163 = null;
            return true;
        } else if (class419.field5681 == class374.field5163) {
            class289.method1633(class120.field1769, 7);
            class374.field5163 = null;
            return true;
        } else if (arg0 != 23992) {
            return false;
        } else if (class390.field5411 == class374.field5163) {
            int var241 = class314.field4171.method222(arg0 ^ 0x59B8);
            class267.field3553 = class251.field3359.method1339((byte) 90, var241);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class120.field1748) {
            class42.field597 = class314.field4171.method249((byte) -76);
            class401.field5517 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            class374.field5163 = null;
            return true;
        } else if (class86.field1187 == class374.field5163) {
            int var242 = class314.field4171.method201((byte) -122);
            int var243 = class314.field4171.method189(true);
            class38.field562.method1949(var243, 25963, var242);
            class374.field5163 = null;
            return true;
        } else if (class432.field5883 == class374.field5163) {
            int var244 = class314.field4171.method189(true);
            int var245 = class314.field4171.method221(false);
            int var246 = class314.field4171.method189(true);
            if (var246 == 65535) {
                var246 = -1;
            }
            if (class400.method2426((byte) 106, var244)) {
                class196.method1130((byte) -43, var245, var246);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class354.field4906) {
            class289.method1633(class39.field566, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class304.field4044) {
            class432.field5888 = class314.field4171.method201((byte) -123);
            class369.field5062 = class236.field3123;
            class374.field5163 = null;
            return true;
        } else if (class448.field6090 == class374.field5163) {
            int var247 = class314.field4171.method222(1024);
            int var248 = class314.field4171.method239((byte) 107);
            int var249 = class314.field4171.method215((byte) 99);
            if (class400.method2426((byte) 113, var249)) {
                class7.method44(var247, var248, (byte) -55);
            }
            class374.field5163 = null;
            return true;
        } else if (class384.field5312 == class374.field5163) {
            int var250 = class314.field4171.method230((byte) 27);
            int var251 = class314.field4171.method189(true);
            class38.field562.method1949(var251, 25963, var250);
            class374.field5163 = null;
            return true;
        } else if (class89.field1308 == class374.field5163) {
            int var252 = class314.field4171.method201((byte) -115);
            boolean var253 = (var252 & 0x1) == 1;
            String var254 = class314.field4171.method195(106);
            String var255 = class314.field4171.method195(122);
            if (var255.equals("")) {
                var255 = var254;
            }
            String var256 = class314.field4171.method195(117);
            String var257 = class314.field4171.method195(100);
            if (var257.equals("")) {
                var257 = var256;
            }
            if (var253) {
                for (int var258 = 0; var258 < class65.field865; var258++) {
                    if (class332.field4505[var258].equals(var257)) {
                        class34.field524[var258] = var254;
                        class332.field4505[var258] = var255;
                        class31.field424[var258] = var256;
                        class98.field1437[var258] = var257;
                        break;
                    }
                }
            } else {
                class34.field524[class65.field865] = var254;
                class332.field4505[class65.field865] = var255;
                class31.field424[class65.field865] = var256;
                class98.field1437[class65.field865] = var257;
                class336.field4539[class65.field865] = class99.method612(2, var252) == 2;
                class65.field865++;
            }
            class374.field5163 = null;
            class41.field587 = class236.field3123;
            return true;
        } else if (class455.field6171 == class374.field5163) {
            String var259 = class314.field4171.method195(101);
            int var260 = class314.field4171.method239((byte) 107);
            int var261 = class314.field4171.method189(true);
            if (class400.method2426((byte) 118, var261)) {
                class188.method1086(1, var260, var259);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class338.field4548) {
            int var262 = class314.field4171.method197(-989178832);
            int var263 = class314.field4171.method189(true);
            if (var263 == 65535) {
                var263 = -1;
            }
            int var264 = class314.field4171.method197(arg0 - 989202824);
            class335.method1910((byte) -101, var262, var264, var263);
            class374.field5163 = null;
            return true;
        } else if (class451.field6134 == class374.field5163) {
            int var265 = class314.field4171.method249((byte) -78);
            int var266 = class314.field4171.method219(-122);
            int var267 = class314.field4171.method215((byte) 107);
            if (var267 == 65535) {
                var267 = -1;
            }
            class77.method511(var267, 1, var266, var265);
            class374.field5163 = null;
            return true;
        } else if (class84.field1105 == class374.field5163) {
            boolean var268 = class314.field4171.method201((byte) -127) == 1;
            String var269 = class314.field4171.method195(99);
            String var270 = var269;
            if (var268) {
                var270 = class314.field4171.method195(-46);
            }
            long var271 = class314.field4171.method184(-24867872);
            long var273 = (long) class314.field4171.method215((byte) 123);
            long var275 = (long) class314.field4171.method219(-112);
            int var277 = class314.field4171.method201((byte) -128);
            long var278 = (var273 << 32) + var275;
            boolean var280 = false;
            int var281 = 0;
            while (true) {
                if (var281 >= 100) {
                    if (var277 <= 1) {
                        if (!(!class458.field6212 || class330.field4384) || class129.field1900) {
                            var280 = true;
                        } else if (class4.method31(0, var270)) {
                            var280 = true;
                        }
                    }
                    break;
                }
                if (class345.field4745[var281] == var278) {
                    var280 = true;
                    break;
                }
                var281++;
            }
            if (!var280 && class314.field4163 == 0) {
                class345.field4745[class288.field3884] = var278;
                class288.field3884 = (class288.field3884 + 1) % 100;
                String var282 = class460.method2702(-49, class223.method1264(class314.field4171, -16086));
                if (var277 == 2 || var277 == 3) {
                    class323.method1795(0, class199.method1137(var271, (byte) -124), arg0 - 23900, var282, -1, 9, "<img=1>" + var270, "<img=1>" + var269);
                } else if (var277 == 1) {
                    class323.method1795(0, class199.method1137(var271, (byte) 31), arg0 - 23946, var282, -1, 9, "<img=0>" + var270, "<img=0>" + var269);
                } else {
                    class323.method1795(0, class199.method1137(var271, (byte) 48), 117, var282, -1, 9, var270, var269);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class411.field5633 == class374.field5163) {
            int var283 = class314.field4171.method215((byte) 98);
            int var284 = class314.field4171.method201((byte) -113);
            boolean var285 = (var284 & 0x1) == 1;
            while (class136.field1983 > class314.field4171.field456) {
                int var286 = class314.field4171.method203((byte) -89);
                int var287 = class314.field4171.method215((byte) 119);
                int var288 = 0;
                if (var287 != 0) {
                    var288 = class314.field4171.method201((byte) -109);
                    if (var288 == 255) {
                        var288 = class314.field4171.method222(1024);
                    }
                }
                class36.method272(var286, (byte) -41, var288, var283, var287 - 1, var285);
            }
            class243.field3240[class99.method612(31, class194.field2620++)] = var283;
            class374.field5163 = null;
            return true;
        } else if (class78.field1052 == class374.field5163) {
            int var289 = class314.field4171.method238(arg0 - 23994);
            int var290 = class314.field4171.method239((byte) 107);
            int var291 = class314.field4171.method215((byte) 90);
            if (var291 == 65535) {
                var291 = -1;
            }
            if (class400.method2426((byte) 115, var290)) {
                class98.method603(var291, -1, 1, 76, var289);
            }
            class374.field5163 = null;
            return true;
        } else if (class447.field6085 == class374.field5163) {
            class289.method1633(class490.field6831, arg0 - 23985);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class302.field4022) {
            String var292 = class314.field4171.method195(122);
            int var293 = class314.field4171.method189(true);
            int var294 = class314.field4171.method238(-2);
            if (class400.method2426((byte) 126, var293)) {
                class405.method2447(var294, var292, arg0 - 23993);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class288.field3883) {
            class289.method1633(class206.field2790, arg0 ^ 0x5DBF);
            class374.field5163 = null;
            return true;
        } else if (class405.field5567 == class374.field5163) {
            class218.method1246(0, false);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class162.field2263) {
            int var295 = class314.field4171.method230((byte) 27);
            int var296 = class314.field4171.method189(true);
            int var297 = class314.field4171.method236((byte) 66);
            int var298 = class314.field4171.method186(arg0 ^ 0xFF5DB8);
            if (class400.method2426((byte) 121, var296)) {
                class450.method2649(var298, var297, (byte) -115, var295);
            }
            class374.field5163 = null;
            return true;
        } else if (class63.field834 == class374.field5163) {
            class461.method2706(false, arg0 ^ 0x5DEB);
            class374.field5163 = null;
            return false;
        } else if (class374.field5163 == class119.field1739) {
            class318.field4196 = class280.method1584(92, class314.field4171.method201((byte) -126));
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class178.field2415) {
            int var299 = class314.field4171.method190(123);
            int var300 = class314.field4171.method239((byte) 107);
            boolean var301 = (var299 & 0x1) == 1;
            class202.method1151(var301, (byte) 85, var300);
            class243.field3240[class99.method612(class194.field2620++, 31)] = var300;
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class212.field2852) {
            int var302 = class314.field4171.method238(-2);
            int var303 = class314.field4171.method192((byte) 59);
            if (var303 == 65535) {
                var303 = -1;
            }
            int var304 = class314.field4171.method239((byte) 107);
            if (class400.method2426((byte) 125, var304)) {
                class98.method603(var303, -1, 2, 94, var302);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class369.field5061) {
            byte var305 = class314.field4171.method187((byte) -43);
            int var306 = class314.field4171.method215((byte) 111);
            class38.field562.method1948(var305, (byte) -109, var306);
            class374.field5163 = null;
            return true;
        } else if (class480.field6639 == class374.field5163) {
            class79.method520(class314.field4171.method195(99), 120);
            class374.field5163 = null;
            return true;
        } else if (class445.field6049 == class374.field5163) {
            int var307 = class314.field4171.method215((byte) 117);
            int var308 = class314.field4171.method215((byte) 114);
            int var309 = class314.field4171.method215((byte) 127);
            int var310 = class314.field4171.method239((byte) 107);
            int var311 = class314.field4171.method230((byte) 27);
            if (class400.method2426((byte) 124, var308)) {
                class98.method603(var309 | var310 << 16, var307, 7, 97, var311);
            }
            class374.field5163 = null;
            return true;
        } else if (class392.field5434 == class374.field5163) {
            boolean var312 = class314.field4171.method201((byte) -127) == 1;
            String var313 = class314.field4171.method195(arg0 ^ 0xFFFFA264);
            String var314 = var313;
            if (var312) {
                var314 = class314.field4171.method195(125);
            }
            long var315 = class314.field4171.method184(arg0 ^ 0xFE84D658);
            long var317 = (long) class314.field4171.method215((byte) 127);
            long var319 = (long) class314.field4171.method219(-107);
            int var321 = class314.field4171.method201((byte) -125);
            int var322 = class314.field4171.method215((byte) 113);
            long var323 = (var317 << 32) + var319;
            boolean var325 = false;
            int var326 = 0;
            while (true) {
                if (var326 >= 100) {
                    if (var321 <= 1 && class4.method31(0, var314)) {
                        var325 = true;
                    }
                    break;
                }
                if (class345.field4745[var326] == var323) {
                    var325 = true;
                    break;
                }
                var326++;
            }
            if (!var325 && class314.field4163 == 0) {
                class345.field4745[class288.field3884] = var323;
                class288.field3884 = (class288.field3884 + 1) % 100;
                String var327 = class455.method2674((byte) 59, var322).method1409(class314.field4171, (byte) -24);
                if (var321 == 2) {
                    class323.method1795(0, class199.method1137(var315, (byte) -124), arg0 - 23892, var327, var322, 20, "<img=1>" + var314, "<img=1>" + var313);
                } else if (var321 == 1) {
                    class323.method1795(0, class199.method1137(var315, (byte) 98), arg0 - 23956, var327, var322, 20, "<img=0>" + var314, "<img=0>" + var313);
                } else {
                    class323.method1795(0, class199.method1137(var315, (byte) 119), 78, var327, var322, 20, var314, var313);
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class111.field1687) {
            class289.method1633(class231.field3067, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class120.field1765) {
            int var328 = class314.field4171.method192((byte) 59);
            int var329 = class314.field4171.method238(-2);
            if (class400.method2426((byte) 123, var328)) {
                class98.method603(class332.field4494, 0, 5, 95, var329);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class104.field1516) {
            int var330 = class314.field4171.method215((byte) 118);
            int var331 = class314.field4171.method201((byte) -106);
            boolean var332 = (var331 & 0x1) == 1;
            class14.method92(arg0 ^ 0x5DB8, var332, var330);
            int var333 = class314.field4171.method215((byte) 100);
            for (int var334 = 0; var334 < var333; var334++) {
                int var335 = class314.field4171.method189(true);
                int var336 = class314.field4171.method201((byte) -107);
                if (var336 == 255) {
                    var336 = class314.field4171.method221(false);
                }
                class36.method272(var334, (byte) -41, var336, var330, var335 - 1, var332);
            }
            class243.field3240[class99.method612(class194.field2620++, 31)] = var330;
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class322.field4290) {
            int var337 = class314.field4171.method189(true);
            int var338 = class314.field4171.method201((byte) -119);
            int var339 = class314.field4171.method192((byte) 59);
            class121 var340 = class221.field2941[var337];
            if (var340 != null) {
                class213.method1205(var339, var340, (byte) -120, var338);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class192.field2605) {
            int var341 = class314.field4171.method215((byte) 100);
            int var342 = class314.field4171.method222(1024);
            int var343 = class314.field4171.method189(true);
            if (class400.method2426((byte) 118, var341)) {
                class302.method1688(var343, -12370, var342);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class163.field2266) {
            if (class136.field1983 == 0) {
                class289.field3900 = class466.field6452.method1176(class110.field1676, (byte) -106);
            } else {
                class289.field3900 = class314.field4171.method195(-42);
            }
            class374.field5163 = null;
            return true;
        } else if (class473.field6521 == class374.field5163) {
            class461.method2706(true, 83);
            class374.field5163 = null;
            return false;
        } else if (class374.field5163 == class31.field420) {
            class289.method1633(class225.field2976, arg0 - 23985);
            class374.field5163 = null;
            return true;
        } else if (class9.field123 == class374.field5163) {
            int var344 = class314.field4171.method215((byte) 92);
            String var345 = class314.field4171.method195(-28);
            int var346 = class314.field4171.method189(true);
            if (class400.method2426((byte) 107, var346)) {
                class188.method1086(1, var344, var345);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class267.field3534) {
            int var347 = class314.field4171.method221(false);
            int var348 = class314.field4171.method239((byte) 107);
            int var349 = class314.field4171.method192((byte) 59);
            int var350 = class314.field4171.method192((byte) 59);
            int var351 = class314.field4171.method192((byte) 59);
            if (class400.method2426((byte) 111, var348)) {
                class270.method1533(var351, var350, var347, var349, (byte) -103);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class244.field3243) {
            class289.method1633(class129.field1901, 7);
            class374.field5163 = null;
            return true;
        } else if (class473.field6527 == class374.field5163) {
            int var352 = class314.field4171.method249((byte) -123);
            int var353 = var352 >> 2;
            int var354 = var352 & 0x3;
            int var355 = class7.field92[var353];
            int var356 = class314.field4171.method221(false);
            int var357 = (var356 & 0x3769451C) >> 28;
            int var358 = (var356 & 0xFFFE29F) >> 14;
            int var359 = var356 & 0x3FFF;
            int var360 = class314.field4171.method239((byte) 107);
            int var361 = var359 - class266.field3511;
            if (var360 == 65535) {
                var360 = -1;
            }
            int var362 = var358 - class162.field2260;
            class104.method632(var353, var360, (byte) 67, var361, var355, var354, var362, var357);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class196.field2666) {
            class12.field168 = class314.field4171.method197(arg0 ^ 0xC50A0988);
            class134.field1961 = class314.field4171.method201((byte) -120);
            class445.field6060 = class314.field4171.method190(124);
            while (class314.field4171.field456 < class136.field1983) {
                class169 var363 = class108.method671(arg0 ^ 0x5DDC)[class314.field4171.method201((byte) -127)];
                class289.method1633(var363, 7);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class191.field2603) {
            int var364 = class314.field4171.method201((byte) -125);
            int var365 = var364 >> 5;
            int var366 = var364 & 0x1F;
            if (var366 == 0) {
                class88.field1295[var365] = null;
                class374.field5163 = null;
                return true;
            }
            class409 var367 = new class409();
            var367.field5598 = var366;
            var367.field5611 = class314.field4171.method201((byte) -124);
            if (var367.field5611 >= 0 && var367.field5611 < class191.field2597.length) {
                if (var367.field5598 == 1 || var367.field5598 == 10) {
                    var367.field5597 = class314.field4171.method215((byte) 111);
                    class314.field4171.field456 += 6;
                } else if (var367.field5598 >= 2 && var367.field5598 <= 6) {
                    if (var367.field5598 == 2) {
                        var367.field5593 = 64;
                        var367.field5599 = 64;
                    }
                    if (var367.field5598 == 3) {
                        var367.field5599 = 64;
                        var367.field5593 = 0;
                    }
                    if (var367.field5598 == 4) {
                        var367.field5599 = 64;
                        var367.field5593 = 128;
                    }
                    if (var367.field5598 == 5) {
                        var367.field5599 = 0;
                        var367.field5593 = 64;
                    }
                    if (var367.field5598 == 6) {
                        var367.field5593 = 64;
                        var367.field5599 = 128;
                    }
                    var367.field5598 = 2;
                    var367.field5602 = class314.field4171.method201((byte) -107);
                    var367.field5595 = class314.field4171.method215((byte) 105);
                    var367.field5612 = class314.field4171.method215((byte) 99);
                    var367.field5609 = class314.field4171.method201((byte) -121);
                    var367.field5592 = class314.field4171.method215((byte) 127);
                }
                var367.field5606 = class314.field4171.method215((byte) 98);
                if (var367.field5606 == 65535) {
                    var367.field5606 = -1;
                }
                class88.field1295[var365] = var367;
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class162.field2255) {
            class289.method1633(class76.field1017, 7);
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class277.field3671) {
            int var368 = class314.field4171.method215((byte) 116);
            String var369 = class314.field4171.method195(arg0 - 24027);
            Object[] var370 = new Object[var369.length() + 1];
            for (int var371 = var369.length() - 1; var371 >= 0; var371--) {
                if (var369.charAt(var371) == 's') {
                    var370[var371 + 1] = class314.field4171.method195(111);
                } else {
                    var370[var371 + 1] = Integer.valueOf(class314.field4171.method222(1024));
                }
            }
            var370[0] = Integer.valueOf(class314.field4171.method222(1024));
            if (class400.method2426((byte) 104, var368)) {
                class82 var372 = new class82();
                var372.field1085 = var370;
                class382.method2340(var372);
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class357.field4925) {
            int var373 = class314.field4171.method215((byte) 122);
            int var374 = class314.field4171.method222(1024);
            if (class400.method2426((byte) 103, var373)) {
                class132 var375 = (class132) class214.field2883.method1528((long) var374, 79);
                if (var375 != null) {
                    class284.method1603(false, true, var375, true);
                }
                if (class16.field231 != null) {
                    class490.method2854(class16.field231, (byte) 92);
                    class16.field231 = null;
                }
            }
            class374.field5163 = null;
            return true;
        } else if (class374.field5163 == class321.field4262) {
            class289.method1633(class162.field2262, 7);
            class374.field5163 = null;
            return true;
        } else if (class429.field5834 == class374.field5163) {
            int var376 = class314.field4171.method222(arg0 - 22968);
            int var377 = class314.field4171.method189(true);
            int var378 = class314.field4171.method202((byte) -116);
            if (class400.method2426((byte) 109, var377)) {
                class41.method283(-97, var378, var376);
            }
            class374.field5163 = null;
            return true;
        } else {
            class228.method1278((Throwable) null, "T1 - " + (class374.field5163 == null ? -1 : class374.field5163.method2560((byte) -66)) + "," + (class466.field6453 == null ? -1 : class466.field6453.method2560((byte) -66)) + "," + (class395.field5473 == null ? -1 : class395.field5473.method2560((byte) -66)) + " - " + class136.field1983, -30116);
            class476.method2779(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lnf;B)V")
    public static final void method2699(class374 arg0, byte arg1) {
        arg0.field5159 = null;
        field6225++;
        int var2 = arg0.field5156.length;
        int var3 = 0;
        if (arg1 != 38) {
            return;
        }
        while (var3 < var2) {
            arg0.field5156[var3].field6617 = false;
            var3++;
        }
        class472[] var4 = class90.field1319;
        synchronized (class90.field1319) {
            if (var2 < class90.field1319.length && class158.field2176[var2] < 200) {
                class90.field1319[var2].method2767(-1830, arg0);
                int var10002 = class158.field2176[var2]++;
            }
        }
    }
}
