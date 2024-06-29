import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class105 extends class99 {

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Lr;")
    private static class66 field2020 = class93.method641(43, "wave:");

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Lr;")
    public static class66 field2021 = field2020;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "Lr;")
    public static class66 field2025 = class93.method641(43, "(U4");

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Lr;")
    public static class66 field2024 = field2020;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field2030 = 0;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "[[Z")
    public static boolean[][] field2031;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIII)V")
    public static final void method722(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -arg3;
        ++field2022;
        int var6 = -1;
        int var7 = arg3;
        int var8 = class54.method368(arg2 - -arg3, class215.field3706, (byte) 114, class165.field2972);
        int var9 = class54.method368(-arg3 + arg2, class215.field3706, (byte) 114, class165.field2972);
        if (arg0 != 83) {
            field2021 = null;
        }
        int var10 = 0;
        class194.method1266(var9, (byte) -17, arg1, class15.field183[arg4], var8);
        while (~var10 > ~var7) {
            var6 += 2;
            var5 += var6;
            if (~var5 < -1) {
                --var7;
                int var11 = arg4 + var7;
                var5 -= var7 << 1;
                int var12 = -var7 + arg4;
                if (var11 >= class241.field4186 && ~var12 >= ~class222.field3788) {
                    int var13 = class54.method368(arg2 + var10, class215.field3706, (byte) 114, class165.field2972);
                    int var14 = class54.method368(-var10 + arg2, class215.field3706, (byte) 114, class165.field2972);
                    if (var11 <= class222.field3788) {
                        class194.method1266(var14, (byte) -17, arg1, class15.field183[var11], var13);
                    }
                    if (~var12 <= ~class241.field4186) {
                        class194.method1266(var14, (byte) -17, arg1, class15.field183[var12], var13);
                    }
                }
            }
            ++var10;
            int var15 = arg4 - var10;
            int var16 = arg4 + var10;
            if (class241.field4186 <= var16 && class222.field3788 >= var15) {
                int var17 = class54.method368(arg2 + var7, class215.field3706, (byte) 114, class165.field2972);
                int var18 = class54.method368(-var7 + arg2, class215.field3706, (byte) 114, class165.field2972);
                if (class222.field3788 >= var16) {
                    class194.method1266(var18, (byte) -17, arg1, class15.field183[var16], var17);
                }
                if (class241.field4186 <= var15) {
                    class194.method1266(var18, (byte) -17, arg1, class15.field183[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public static final void method723(byte arg0) {
        int var1 = class59.field1016.method232(class135.field2500);
        for (int var2 = 0; var2 < class176.field3105; ++var2) {
            int var7 = class59.field1016.method232(class183.method1218((byte) -59, var2));
            if (~var7 < ~var1) {
                var1 = var7;
            }
        }
        var1 += 8;
        int var3 = -(var1 / 2) + class147.field2683;
        if (class19.field257 < var1 + var3) {
            var3 = class19.field257 - var1;
        }
        int var4 = class176.field3105 * 15 + 21;
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class29.field429;
        ++field2019;
        if (~class12.field143 > ~(var4 + var5)) {
            var5 = -var4 + class12.field143;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        int var6 = -52 % ((arg0 - 39) / 41);
        if (~class90.field1743 != -2) {
            if (class188.field3274 == class147.field2683 && ~class29.field429 == ~class174.field3068) {
                class129.field2407 = var3;
                class9.field102 = class176.field3105 * 15 + 22;
                class115.field2177 = true;
                class187.field3240 = var1;
                class70.field1405 = var5;
                class90.field1743 = 0;
            } else {
                class92.field1769 = class188.field3274;
                class90.field1743 = 1;
                class8.field83 = class174.field3068;
            }
        } else if (~class92.field1769 == ~class147.field2683 && ~class8.field83 == ~class29.field429) {
            class70.field1405 = var5;
            class129.field2407 = var3;
            class115.field2177 = true;
            class187.field3240 = var1;
            class9.field102 = class176.field3105 * 15 + 22;
            class90.field1743 = 0;
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
    public static void method724(int arg0) {
        if (arg0 != 208) {
            method723((byte) -16);
        }
        field2020 = null;
        field2031 = null;
        field2025 = null;
        field2024 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            method724(-89);
        }
        ++field2026;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int[][] var4 = this.method683(-114, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; class199.field3432 > var8; ++var8) {
                var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
    public static final void method725(int arg0) {
        ++field2029;
        if (~class129.field2400 == -249) {
            int var1 = class84.field1627.method1677(-6677);
            int var2 = (7 & var1 >> 4) + class200.field3454;
            int var3 = (var1 & 7) + class43.field730;
            int var4 = class84.field1627.method1674(1355769544);
            int var5 = class84.field1627.method1677(-6677);
            int var6 = class84.field1627.method1674(1355769544);
            if (var2 >= 0 && ~var3 <= -1 && var2 < 104 && var3 < 104) {
                int var7 = var2 * 128 - -64;
                int var8 = var3 * 128 + 64;
                class52 var9 = new class52(var4, class196.field3401, var7, var8, -var5 + class45.method327(var7, class196.field3401, var8, false), var6, class75.field1501);
                class246.field4288.method866(new class26(var9), true);
            }
        } else if (~class129.field2400 == -30) {
            int var10 = class84.field1627.method1677(-6677);
            int var11 = (var10 & 15) + class43.field730 * 2;
            int var12 = ((246 & var10) >> 4) + class200.field3454 * 2;
            int var13 = var12 + class84.field1627.method1682(arg0 + 3391);
            int var14 = var11 + class84.field1627.method1682(3390);
            int var15 = class84.field1627.method1684(-22489);
            int var16 = class84.field1627.method1674(1355769544);
            int var17 = 4 * class84.field1627.method1677(-6677);
            int var18 = class84.field1627.method1677(arg0 + -6676) * 4;
            int var19 = class84.field1627.method1674(arg0 ^ -1355769545);
            int var20 = class84.field1627.method1674(1355769544);
            int var21 = class84.field1627.method1677(arg0 ^ 6676);
            int var22 = class84.field1627.method1677(arg0 + -6676);
            if (var12 >= 0 && var11 >= 0 && ~var12 > -209 && ~var11 > -209 && ~var13 <= -1 && ~var14 <= -1 && ~var13 > -209 && var14 < 208 && ~var16 != -65536) {
                int var23 = var12 * 64;
                int var24 = var11 * 64;
                int var25 = var13 * 64;
                class97 var26 = new class97(var16, class196.field3401, var23, var24, -var17 + class45.method327(var23, class196.field3401, var24, false), class75.field1501 + var19, var20 - -class75.field1501, var21, var22, var15, var18);
                int var27 = var14 * 64;
                var26.method667(var25, (byte) -105, var27, class45.method327(var25, class196.field3401, var27, false) + -var18, class75.field1501 + var19);
                class63.field1209.method866(new class159(var26), true);
            }
        } else if (class129.field2400 == 30) {
            int var28 = class84.field1627.method1636(arg0 ^ 71);
            int var29 = class84.field1627.method1672((byte) -112);
            int var30 = (7 & var29) + class43.field730;
            int var31 = (7 & var29 >> 4) + class200.field3454;
            int var32 = class84.field1627.method1688(arg0 ^ 27);
            int var33 = var32 >> 2;
            int var34 = class209.field3616[var33];
            int var35 = 3 & var32;
            if (~var31 <= -1 && ~var30 <= -1 && ~var31 > -105 && ~var30 > -105) {
                class86.method606(var31, ~arg0, -1, var34, var30, var33, var35, class196.field3401, 0, var28);
            }
        } else if (class129.field2400 == 110) {
            int var36 = class84.field1627.method1676(50);
            int var37 = var36 >> 2;
            int var38 = var36 & 3;
            int var39 = class209.field3616[var37];
            int var40 = class84.field1627.method1690((byte) -47);
            int var41 = class84.field1627.method1676(52);
            int var42 = class43.field730 - -(7 & var41);
            if (var40 == 65535) {
                var40 = -1;
            }
            int var43 = ((var41 & 117) >> 4) + class200.field3454;
            class155.method1056(var42, var37, class196.field3401, var38, var43, (byte) 117, var40, var39);
        } else if (~class129.field2400 == -233) {
            int var44 = class84.field1627.method1677(-6677);
            int var45 = ((125 & var44) >> 4) + class200.field3454;
            int var46 = (7 & var44) + class43.field730;
            int var47 = class84.field1627.method1674(1355769544);
            if (~var47 == -65536) {
                var47 = -1;
            }
            int var48 = class84.field1627.method1677(-6677);
            int var49 = class84.field1627.method1677(arg0 + -6676);
            int var50 = var48 >> 4 & 15;
            int var51 = var48 & 7;
            if (var45 >= 0 && ~var46 <= -1 && ~var45 > -105 && ~var46 > -105) {
                int var52 = var50 + 1;
                if (class207.field3595.field2039[0] >= var45 - var52 && ~(var45 + var52) <= ~class207.field3595.field2039[0] && ~(-var52 + var46) >= ~class207.field3595.field2086[0] && ~(var46 + var52) <= ~class207.field3595.field2086[0] && ~class54.field944 != -1 && var51 > 0 && ~class7.field64 > -51 && ~var47 != 0) {
                    class230.field3984[class7.field64] = var47;
                    class257.field4521[class7.field64] = var51;
                    class194.field3356[class7.field64] = var49;
                    class214.field3679[class7.field64] = null;
                    class178.field3123[class7.field64] = (var45 << 16) - -(var46 << 8) - -var50;
                    ++class7.field64;
                }
            }
        } else if (class129.field2400 == 201) {
            int var53 = class84.field1627.method1677(-6677);
            int var54 = ((var53 & 115) >> 4) + class200.field3454;
            int var55 = (var53 & 7) + class43.field730;
            int var56 = class84.field1627.method1674(1355769544);
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && ~var55 > -105) {
                class125 var57 = class63.field1249[class196.field3401][var54][var55];
                if (var57 != null) {
                    for (class216 var58 = (class216) var57.method873((byte) 76); var58 != null; var58 = (class216) var57.method870((byte) 16)) {
                        if (~(32767 & var56) == ~var58.field3713.field60) {
                            var58.method560(arg0 + -17553);
                            break;
                        }
                    }
                    if (var57.method873((byte) 76) == null) {
                        class63.field1249[class196.field3401][var54][var55] = null;
                    }
                    class197.method1287(var54, (byte) -52, var55);
                }
            }
        } else {
            if (~class129.field2400 == -22) {
                int var59 = class84.field1627.method1672((byte) -76);
                int var60 = var59 & 3;
                int var61 = var59 >> 2;
                int var62 = class209.field3616[var61];
                byte var63 = class84.field1627.method1682(3390);
                byte var64 = class84.field1627.method1646((byte) 88);
                int var65 = class84.field1627.method1642(arg0 ^ 15045);
                int var66 = class84.field1627.method1690((byte) -47);
                int var67 = class84.field1627.method1674(1355769544);
                int var68 = class84.field1627.method1677(-6677);
                int var69 = class200.field3454 - -(7 & var68 >> 4);
                int var70 = class43.field730 - -(7 & var68);
                byte var71 = class84.field1627.method1646((byte) 59);
                int var72 = class84.field1627.method1636(-41);
                byte var73 = class84.field1627.method1644(false);
                class45 var74;
                if (class49.field882 != var65) {
                    var74 = class59.field988[var65];
                } else {
                    var74 = class207.field3595;
                }
                if (var74 != null) {
                    class231 var75 = class52.method359(84, var67);
                    int var76;
                    int var77;
                    if (~var60 != -2 && ~var60 != -4) {
                        var76 = var75.field4021;
                        var77 = var75.field4020;
                    } else {
                        var77 = var75.field4021;
                        var76 = var75.field4020;
                    }
                    int var78 = var70 - -(var77 >> 1);
                    int var79 = (var77 + 1 >> 1) + var70;
                    int var80 = (var76 >> 1) + var69;
                    int[][] var81 = class30.field453[class196.field3401];
                    int var82 = (var76 - -1 >> 1) + var69;
                    int[][] var83 = null;
                    if (class196.field3401 < 3) {
                        var83 = class30.field453[class196.field3401 + 1];
                    }
                    int var84 = var81[var82][var78] - -var81[var80][var79] + var81[var82][var79] + var81[var80][var78] >> 2;
                    int var85 = (var69 << 7) + (var76 << 6);
                    int var86 = (var70 << 7) - -(var77 << 6);
                    class103 var87 = var75.method1507(var61, (class265) null, var75.field4051, (byte) 123, false, var84, var60, var81, var86, var83, var85);
                    if (var87 != null) {
                        if (var73 < var64) {
                            byte var88 = var64;
                            var64 = var73;
                            var73 = var88;
                        }
                        class86.method606(var69, 0, var66 + 1, var62, var70, 0, 0, class196.field3401, var72 - -1, -1);
                        var74.field812 = (class262) var87.field2007;
                        var74.field808 = var70 * 128 + var77 * 64;
                        var74.field834 = var64 + var69;
                        var74.field840 = class75.field1501 + var66;
                        var74.field813 = class75.field1501 + var72;
                        var74.field835 = var84;
                        var74.field817 = var69 * 128 + var76 * 64;
                        var74.field809 = var69 + var73;
                        if (~var71 < ~var63) {
                            byte var89 = var71;
                            var71 = var63;
                            var63 = var89;
                        }
                        var74.field839 = var70 - -var71;
                        var74.field820 = var63 + var70;
                    }
                }
            }
            if (~class129.field2400 == -197) {
                int var90 = class84.field1627.method1688(arg0 + 127);
                int var91 = (7 & var90) + class43.field730;
                int var92 = ((var90 & 118) >> 4) + class200.field3454;
                int var93 = class84.field1627.method1688(-68);
                int var94 = var93 & 3;
                int var95 = var93 >> 2;
                int var96 = class209.field3616[var95];
                if (var92 >= 0 && ~var91 <= -1 && var92 < 104 && var91 < 104) {
                    class86.method606(var92, ~arg0, -1, var96, var91, var95, var94, class196.field3401, 0, -1);
                }
            } else {
                if (arg0 != -1) {
                    method725(81);
                }
                if (~class129.field2400 == -113) {
                    int var97 = class84.field1627.method1677(-6677);
                    int var98 = class200.field3454 - -(var97 >> 4 & 7);
                    int var99 = (var97 & 7) + class43.field730;
                    int var100 = var98 + class84.field1627.method1682(3390);
                    int var101 = class84.field1627.method1682(3390) + var99;
                    int var102 = class84.field1627.method1684(-22489);
                    int var103 = class84.field1627.method1674(1355769544);
                    int var104 = 4 * class84.field1627.method1677(-6677);
                    int var105 = 4 * class84.field1627.method1677(-6677);
                    int var106 = class84.field1627.method1674(1355769544);
                    int var107 = class84.field1627.method1674(1355769544);
                    int var108 = class84.field1627.method1677(arg0 + -6676);
                    int var109 = class84.field1627.method1677(-6677);
                    if (var98 >= 0 && ~var99 <= -1 && ~var98 > -105 && ~var99 > -105 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 - -64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var101 * 128 - -64;
                        class97 var113 = new class97(var103, class196.field3401, var110, var111, class45.method327(var110, class196.field3401, var111, false) + -var104, class75.field1501 + var106, class75.field1501 + var107, var108, var109, var102, var105);
                        int var114 = var100 * 128 - -64;
                        var113.method667(var114, (byte) -45, var112, -var105 + class45.method327(var114, class196.field3401, var112, false), var106 - -class75.field1501);
                        class63.field1209.method866(new class159(var113), true);
                    }
                } else if (class129.field2400 == 75) {
                    int var115 = class84.field1627.method1642(arg0 + -15045);
                    int var116 = class84.field1627.method1674(arg0 ^ -1355769545);
                    int var117 = class84.field1627.method1674(1355769544);
                    int var118 = class84.field1627.method1688(127);
                    int var119 = (var118 & 7) + class43.field730;
                    int var120 = (7 & var118 >> 4) + class200.field3454;
                    if (var120 >= 0 && var119 >= 0 && ~var120 > -105 && ~var119 > -105 && ~class49.field882 != ~var115) {
                        class7 var121 = new class7();
                        var121.field60 = var116;
                        var121.field65 = var117;
                        if (class63.field1249[class196.field3401][var120][var119] == null) {
                            class63.field1249[class196.field3401][var120][var119] = new class125();
                        }
                        class63.field1249[class196.field3401][var120][var119].method866(new class216(var121), true);
                        class197.method1287(var120, (byte) -52, var119);
                    }
                } else if (class129.field2400 == 25) {
                    int var122 = class84.field1627.method1690((byte) -47);
                    int var123 = class84.field1627.method1677(-6677);
                    int var124 = (7 & var123 >> 4) + class200.field3454;
                    int var125 = (var123 & 7) + class43.field730;
                    int var126 = class84.field1627.method1690((byte) -47);
                    if (~var124 <= -1 && ~var125 <= -1 && var124 < 104 && ~var125 > -105) {
                        class7 var127 = new class7();
                        var127.field60 = var126;
                        var127.field65 = var122;
                        if (class63.field1249[class196.field3401][var124][var125] == null) {
                            class63.field1249[class196.field3401][var124][var125] = new class125();
                        }
                        class63.field1249[class196.field3401][var124][var125].method866(new class216(var127), true);
                        class197.method1287(var124, (byte) -52, var125);
                    }
                } else if (~class129.field2400 == -51) {
                    int var128 = class84.field1627.method1677(-6677);
                    int var129 = (var128 & 7) + class43.field730;
                    int var130 = (var128 >> 4 & 7) + class200.field3454;
                    int var131 = class84.field1627.method1674(arg0 ^ -1355769545);
                    int var132 = class84.field1627.method1674(1355769544);
                    int var133 = class84.field1627.method1674(1355769544);
                    if (~var130 <= -1 && ~var129 <= -1 && ~var130 > -105 && var129 < 104) {
                        class125 var134 = class63.field1249[class196.field3401][var130][var129];
                        if (var134 != null) {
                            for (class216 var135 = (class216) var134.method873((byte) 76); var135 != null; var135 = (class216) var134.method870((byte) 34)) {
                                class7 var136 = var135.field3713;
                                if (~(32767 & var131) == ~var136.field60 && var136.field65 == var132) {
                                    var136.field65 = var133;
                                    break;
                                }
                            }
                            class197.method1287(var130, (byte) -52, var129);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(I)I")
    public static final int method726(int arg0) {
        ++field2023;
        if (arg0 != 7) {
            field2027 = -13;
        }
        return class9.field104;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lcj;BII)Ldh;")
    public static final class265 method727(class28 arg0, byte arg1, int arg2, int arg3) {
        ++field2028;
        if (arg1 != 66) {
            return null;
        } else {
            return !class31.method174(-29381, arg2, arg0, arg3) ? null : class165.method1126(arg1 ^ 9724);
        }
    }
}
