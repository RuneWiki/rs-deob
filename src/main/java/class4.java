import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lqc;")
    public static class97 field53 = new class97(100);

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field60 = -1;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lo;")
    public static class84 field61 = class15.method124("titlebox", 255);

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lo;")
    public static class84 field64 = class15.method124("From:  ", 255);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lo;")
    public static class84 field63 = class15.method124("@yel@0 unread messages", 255);

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Ljd;")
    public class58 field54;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lqb;")
    public static class96 field67;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public static int[] field66;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 9)
    public static void method14(byte arg0) {
        field67 = null;
        field63 = null;
        field64 = null;
        field53 = null;
        field61 = null;
        field66 = null;
        int var1 = -35 % ((arg0 + 31) / 50);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLke;)V", line = 23)
    public static final void method15(byte arg0, class65 arg1) {
        if (arg1.field1430 == 0) {
            arg1.field1390 = 1024;
        }
        arg1.field1389 = 0;
        if (arg1.field1430 == 1) {
            arg1.field1390 = 1536;
        }
        int var2 = arg1.field1383 - class128.field2837;
        if (arg1.field1430 == 2) {
            arg1.field1390 = 0;
        }
        if (arg1.field1430 == 3) {
            arg1.field1390 = 512;
        }
        field50++;
        int var3 = arg1.field1433 * 128 + arg1.field1384 * 64;
        arg1.field1380 += (var3 - arg1.field1380) / var2;
        if (arg0 > -101) {
            field60 = -17;
        }
        int var4 = arg1.field1438 * 128 + arg1.field1384 * 64;
        arg1.field1391 += (var4 - arg1.field1391) / var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 65)
    public static final void method16(boolean arg0) {
        field48++;
        if (class107.field2278 == 35) {
            int var1 = class65.field1405.method231(255);
            int var2 = class110.field2376 + (var1 & 0x7);
            int var3 = (var1 >> 4 & 0x7) + class114.field2483;
            int var4 = class65.field1405.method231(255);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class93.field2047[var5];
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                class27.method250(0, class1.field11, var7, 386132008, var6, var5, -1, var2, -1, var3);
            }
        } else if (class107.field2278 == 46) {
            int var8 = class65.field1405.method204(66);
            int var9 = class65.field1405.method228(88);
            int var10 = class65.field1405.method237(59);
            int var11 = class65.field1405.method253(-17254);
            int var12 = (var11 & 0x7) + class110.field2376;
            int var13 = (var11 >> 4 & 0x7) + class114.field2483;
            if (var13 >= 0 && var12 >= 0 && var13 < 104 && var12 < 104 && class101.field2142 != var9) {
                class67 var14 = new class67();
                var14.field1469 = var8;
                var14.field1459 = var10;
                if (class110.field2379[class1.field11][var13][var12] == null) {
                    class110.field2379[class1.field11][var13][var12] = new class88();
                }
                class110.field2379[class1.field11][var13][var12].method692((byte) -98, var14);
                class101.method768(var12, var13, 127);
            }
        } else if (class107.field2278 == 63) {
            int var15 = class65.field1405.method231(255);
            int var16 = (var15 >> 4 & 0x7) + class114.field2483;
            int var17 = (var15 & 0x7) + class110.field2376;
            int var18 = class65.field1405.method227(127);
            int var19 = class65.field1405.method227(127);
            int var20 = class65.field1405.method227(127);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class88 var21 = class110.field2379[class1.field11][var16][var17];
                if (var21 != null) {
                    for (class67 var22 = (class67) var21.method695((byte) -119); var22 != null; var22 = (class67) var21.method702(0)) {
                        if ((var18 & 0x7FFF) == var22.field1459 && var22.field1469 == var19) {
                            var22.field1469 = var20;
                            break;
                        }
                    }
                    class101.method768(var17, var16, 117);
                }
            }
        } else {
            if (class107.field2278 == 118) {
                int var23 = class65.field1405.method231(255);
                int var24 = (var23 >> 4 & 0x7) + class114.field2483;
                int var25 = (var23 & 0x7) + class110.field2376;
                int var26 = class65.field1405.method227(127);
                int var27 = class65.field1405.method231(255);
                int var28 = var27 >> 4 & 0xF;
                int var29 = var27 & 0x7;
                if (var24 - var28 <= class107.field2271.field1374[0] && class107.field2271.field1374[0] <= var24 + var28 && class107.field2271.field1436[0] >= var25 - var28 && class107.field2271.field1436[0] <= var25 + var28 && class117.field2569 != 0 && var29 > 0 && class5.field80 < 50) {
                    class115.field2497[class5.field80] = var26;
                    class15.field261[class5.field80] = var29;
                    class6.field116[class5.field80] = 0;
                    class88.field1994[class5.field80] = null;
                    class5.field80++;
                }
            }
            if (class107.field2278 == 244) {
                int var30 = class65.field1405.method237(46);
                int var31 = class65.field1405.method238(-105);
                int var32 = (var31 & 0x7) + class110.field2376;
                int var33 = (var31 >> 4 & 0x7) + class114.field2483;
                int var34 = class65.field1405.method253(-17254);
                int var35 = var34 & 0x3;
                int var36 = var34 >> 2;
                int var37 = class93.field2047[var36];
                if (var33 >= 0 && var32 >= 0 && var33 < 104 && var32 < 104) {
                    class27.method250(0, class1.field11, var37, 386132008, var35, var36, var30, var32, -1, var33);
                }
            } else {
                if (class107.field2278 == 21) {
                    int var38 = class65.field1405.method228(98);
                    int var39 = class65.field1405.method229(false);
                    int var40 = (var39 >> 4 & 0x7) + class114.field2483;
                    int var41 = class110.field2376 + (var39 & 0x7);
                    int var42 = class65.field1405.method204(106);
                    int var43 = class65.field1405.method229(false);
                    int var44 = var43 >> 2;
                    int var45 = var43 & 0x3;
                    int var46 = class93.field2047[var44];
                    byte var47 = class65.field1405.method213(false);
                    byte var48 = class65.field1405.method214(-9216);
                    byte var49 = class65.field1405.method219(26669);
                    byte var50 = class65.field1405.method214(-9216);
                    int var51 = class65.field1405.method228(94);
                    int var52 = class65.field1405.method237(26);
                    class63 var53;
                    if (class101.field2142 == var38) {
                        var53 = class107.field2271;
                    } else {
                        var53 = class119.field2643[var38];
                    }
                    if (var53 != null) {
                        class49 var54 = class110.method856((byte) -113, var51);
                        int var55 = class110.field2377[class1.field11][var40 + 1][var41];
                        int var56 = class110.field2377[class1.field11][var40][var41];
                        int var57 = class110.field2377[class1.field11][var40 + 1][var41 + 1];
                        int var58 = class110.field2377[class1.field11][var40][var41 + 1];
                        class83 var59 = var54.method414(var45, var55, var58, var56, var44, -101, var57);
                        if (var59 != null) {
                            class27.method250(var42 + 1, class1.field11, var46, 386132008, 0, 0, -1, var41, var52 + 1, var40);
                            var53.field1300 = var59;
                            int var60 = var54.field1028;
                            int var61 = var54.field1035;
                            if (var48 < var50) {
                                byte var62 = var50;
                                var50 = var48;
                                var48 = var62;
                            }
                            var53.field1309 = class128.field2837 + var52;
                            if (var49 > var47) {
                                byte var63 = var49;
                                var49 = var47;
                                var47 = var63;
                            }
                            if (var45 == 1 || var45 == 3) {
                                var61 = var54.field1028;
                                var60 = var54.field1035;
                            }
                            var53.field1320 = var40 * 128 + var60 * 64;
                            var53.field1304 = class128.field2837 + var42;
                            var53.field1302 = var41 * 128 + var61 * 64;
                            var53.field1314 = class105.method778(class1.field11, var53.field1320, 3, var53.field1302);
                            var53.field1319 = var41 + var47;
                            var53.field1303 = var41 + var49;
                            var53.field1295 = var40 + var48;
                            var53.field1294 = var40 + var50;
                        }
                    }
                }
                if (class107.field2278 == 56) {
                    int var64 = class65.field1405.method228(127);
                    int var65 = class65.field1405.method253(-17254);
                    int var66 = (var65 >> 4 & 0x7) + class114.field2483;
                    int var67 = class110.field2376 + (var65 & 0x7);
                    int var68 = class65.field1405.method237(82);
                    if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                        class67 var69 = new class67();
                        var69.field1469 = var68;
                        var69.field1459 = var64;
                        if (class110.field2379[class1.field11][var66][var67] == null) {
                            class110.field2379[class1.field11][var66][var67] = new class88();
                        }
                        class110.field2379[class1.field11][var66][var67].method692((byte) -98, var69);
                        class101.method768(var67, var66, 111);
                    }
                } else if (class107.field2278 == 135) {
                    int var70 = class65.field1405.method231(255);
                    int var71 = class114.field2483 + (var70 >> 4 & 0x7);
                    int var72 = (var70 & 0x7) + class110.field2376;
                    int var73 = class65.field1405.method227(127);
                    int var74 = class65.field1405.method231(255);
                    int var75 = class65.field1405.method227(127);
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                        int var76 = var72 * 128 + 64;
                        int var77 = var71 * 128 + 64;
                        class114 var78 = new class114(var73, class1.field11, var77, var76, class105.method778(class1.field11, var77, 3, var76) - var74, var75, class128.field2837);
                        class115.field2491.method692((byte) -98, var78);
                    }
                } else if (class107.field2278 == 221) {
                    int var79 = class65.field1405.method229(!arg0);
                    int var80 = (var79 >> 4 & 0x7) + class114.field2483;
                    int var81 = (var79 & 0x7) + class110.field2376;
                    int var82 = class65.field1405.method227(127);
                    if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                        class88 var83 = class110.field2379[class1.field11][var80][var81];
                        if (var83 != null) {
                            for (class67 var84 = (class67) var83.method695((byte) -127); var84 != null; var84 = (class67) var83.method702(0)) {
                                if ((var82 & 0x7FFF) == var84.field1459) {
                                    var84.method333(0);
                                    break;
                                }
                            }
                            if (var83.method695((byte) -118) == null) {
                                class110.field2379[class1.field11][var80][var81] = null;
                            }
                            class101.method768(var81, var80, 126);
                        }
                    }
                } else if (class107.field2278 == 69) {
                    int var85 = class65.field1405.method231(255);
                    int var86 = class114.field2483 + (var85 >> 4 & 0x7);
                    int var87 = (var85 & 0x7) + class110.field2376;
                    int var88 = var86 + class65.field1405.method219(26669);
                    int var89 = var87 + class65.field1405.method219(26669);
                    int var90 = class65.field1405.method224((byte) -120);
                    int var91 = class65.field1405.method227(127);
                    int var92 = class65.field1405.method231(255) * 4;
                    int var93 = class65.field1405.method231(255) * 4;
                    int var94 = class65.field1405.method227(127);
                    int var95 = class65.field1405.method227(127);
                    int var96 = class65.field1405.method231(255);
                    int var97 = class65.field1405.method231(255);
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var91 != 65535) {
                        int var98 = var89 * 128 + 64;
                        int var99 = var86 * 128 + 64;
                        int var100 = var88 * 128 + 64;
                        int var101 = var87 * 128 + 64;
                        class64 var102 = new class64(var91, class1.field11, var99, var101, class105.method778(class1.field11, var99, 3, var101) - var92, class128.field2837 + var94, class128.field2837 + var95, var96, var97, var90, var93);
                        var102.method497(var100, class105.method778(class1.field11, var100, 3, var98) - var93, 1, class128.field2837 + var94, var98);
                        class30.field595.method692((byte) -98, var102);
                    }
                } else if (class107.field2278 == 129) {
                    int var103 = class65.field1405.method237(101);
                    int var104 = class65.field1405.method238(-120);
                    int var105 = var104 >> 2;
                    int var106 = var104 & 0x3;
                    int var107 = class93.field2047[var105];
                    int var108 = class65.field1405.method229(false);
                    int var109 = (var108 & 0x7) + class110.field2376;
                    int var110 = (var108 >> 4 & 0x7) + class114.field2483;
                    if (var110 >= 0 && var109 >= 0 && var110 < 103 && var109 < 103) {
                        int var111 = class110.field2377[class1.field11][var110][var109];
                        int var112 = class110.field2377[class1.field11][var110 + 1][var109];
                        int var113 = class110.field2377[class1.field11][var110 + 1][var109 + 1];
                        int var114 = class110.field2377[class1.field11][var110][var109 + 1];
                        if (var107 == 0) {
                            class117 var115 = class112.field2427.method798(class1.field11, var110, var109);
                            if (var115 != null) {
                                int var116 = var115.field2564 >> 14 & 0x7FFF;
                                if (var105 == 2) {
                                    var115.field2548 = new class105(var116, 2, var106 + 4, var111, var112, var113, var114, var103, false);
                                    var115.field2565 = new class105(var116, 2, var106 + 1 & 0x3, var111, var112, var113, var114, var103, false);
                                } else {
                                    var115.field2548 = new class105(var116, var105, var106, var111, var112, var113, var114, var103, false);
                                }
                            }
                        }
                        if (var107 == 1) {
                            class1 var117 = class112.field2427.method814(class1.field11, var110, var109);
                            if (var117 != null) {
                                var117.field9 = new class105(var117.field25 >> 14 & 0x7FFF, 4, 0, var111, var112, var113, var114, var103, false);
                            }
                        }
                        if (var107 == 2) {
                            class78 var118 = class112.field2427.method822(class1.field11, var110, var109);
                            if (var105 == 11) {
                                var105 = 10;
                            }
                            if (var118 != null) {
                                var118.field1673 = new class105(var118.field1645 >> 14 & 0x7FFF, var105, var106, var111, var112, var113, var114, var103, false);
                            }
                        }
                        if (var107 == 3) {
                            class4 var119 = class112.field2427.method827(class1.field11, var110, var109);
                            if (var119 != null) {
                                var119.field54 = new class105(var119.field57 >> 14 & 0x7FFF, 22, var106, var111, var112, var113, var114, var103, false);
                            }
                        }
                    }
                } else if (!arg0) {
                    field59 = -74;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILad;I)V", line = 591)
    public static final void method17(int arg0, class5 arg1, int arg2) {
        field55++;
        if (class49.field1066 != null) {
            class49.field1066.field482 = arg2 * 4 + 5;
            int var3 = class49.field1066.method251((byte) 105);
            arg1.method30(true, var3);
        }
        class58.method473(255, 83, null, 0, (byte) 0, true, 255);
        if (arg0 >= 126) {
            class101.field2162[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILud;)Lqb;", line = 654)
    public static final class96 method18(int arg0, int arg1, class118 arg2) {
        if (arg1 != 15090) {
            method14((byte) -126);
        }
        field52++;
        return class82.method600((byte) -34, arg2, arg0) ? class80.method592(52) : null;
    }
}
