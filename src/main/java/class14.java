import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class14 extends class77 {

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[B")
    public byte[] field208;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field213 = 1;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "B")
    public static byte field210;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lph;III)Lln;", line = 4)
    public static final class118 method80(class361 arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -25) {
            method80((class361) null, -80, -108, -66);
        }
        field207++;
        return class62.method508(0, arg1, arg2, arg0) ? class92.method722(0) : null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILph;Lph;)V", line = 19)
    public static final void method81(int arg0, class361 arg1, class361 arg2) {
        class355.field5448 = arg1;
        int var3 = -125 % ((arg0 - 12) / 45);
        field209++;
        class312.field4641 = arg2;
        class355.field5448.method2539(true, 36);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lqf;IIIIIIIII)V", line = 41)
    public static final void method82(class359[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class141.field2031) {
            class205.method1503(arg4, arg6, arg2, arg5);
        } else {
            class44.method326(arg4, arg6, arg2, arg5);
            class345.method2423();
        }
        field206++;
        int var10 = -82 / ((arg1 + 59) / 52);
        for (int var11 = 0; var11 < arg0.length; var11++) {
            class359 var12 = arg0[var11];
            if (var12 != null && (var12.field5638 == arg7 || arg7 == -1412584499 && class331.field5041 == var12)) {
                int var13;
                if (arg8 == -1) {
                    class27.field383[class178.field2558] = var12.field5495 + arg9;
                    class324.field4883[class178.field2558] = var12.field5585 + arg3;
                    class338.field5251[class178.field2558] = var12.field5506;
                    class96.field1358[class178.field2558] = var12.field5560;
                    var13 = class178.field2558++;
                } else {
                    var13 = arg8;
                }
                var12.field5491 = var13;
                var12.field5520 = class304.field4560;
                if (!var12.field5500 || !client.method359(var12)) {
                    if (var12.field5515 > 0) {
                        class352.method2459(91, var12);
                    }
                    int var14 = var12.field5495 + arg9;
                    int var15 = var12.field5585 + arg3;
                    int var16 = var12.field5561;
                    if (class190.field2769 && (client.method347(var12).field2901 != 0 || var12.field5554 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class331.field5041 == var12) {
                        if (arg7 != -1412584499 && !var12.field5589) {
                            class284.field4292 = arg9;
                            class147.field2111 = arg0;
                            class17.field287 = arg3;
                            continue;
                        }
                        if (!var12.field5589) {
                            var16 = 128;
                        }
                        if (class175.field2515 && class142.field2064) {
                            int var17 = class56.field815;
                            int var18 = class165.field2353;
                            int var19 = var17 - class117.field1663;
                            if (var19 < class275.field4163) {
                                var19 = class275.field4163;
                            }
                            if ((var12.field5506 + var19) > (class275.field4163 + class51.field764.field5506)) {
                                var19 = class275.field4163 + class51.field764.field5506 - var12.field5506;
                            }
                            int var20 = var18 - class355.field5447;
                            var14 = var19;
                            if (class275.field4172 > var20) {
                                var20 = class275.field4172;
                            }
                            if (class275.field4172 + class51.field764.field5560 < var12.field5560 + var20) {
                                var20 = class275.field4172 + class51.field764.field5560 - var12.field5560;
                            }
                            var15 = var20;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field5554 == 2) {
                        var21 = arg5;
                        var22 = arg4;
                        var23 = arg6;
                        var24 = arg2;
                    } else {
                        var23 = var15 > arg6 ? var15 : arg6;
                        int var25 = var12.field5506 + var14;
                        var22 = arg4 >= var14 ? arg4 : var14;
                        int var26 = var15 + var12.field5560;
                        if (var12.field5554 == 9) {
                            var25++;
                            var26++;
                        }
                        var21 = var26 < arg5 ? var26 : arg5;
                        var24 = var25 < arg2 ? var25 : arg2;
                    }
                    if (!var12.field5500 || var24 > var22 && var21 > var23) {
                        if (var12.field5515 != 0) {
                            if (var12.field5515 == 1337 || var12.field5515 == 1403) {
                                class134.field1955 = var14;
                                class189.field2702 = var12;
                                class22.field332 = var15;
                                class191.method1380(var15, var14, var12.field5515 == 1403, var12.field5560, true, var12.field5506);
                                class332.field5051[var13] = true;
                                if (class141.field2031) {
                                    class205.method1503(arg4, arg6, arg2, arg5);
                                } else {
                                    class44.method326(arg4, arg6, arg2, arg5);
                                }
                                continue;
                            }
                            if (var12.field5515 == 1338) {
                                if (!var12.method2489((byte) 78)) {
                                    continue;
                                }
                                class215.method1556(var15, var13, var12, var14, -39);
                                if (class141.field2031) {
                                    class205.method1503(arg4, arg6, arg2, arg5);
                                } else {
                                    class44.method326(arg4, arg6, arg2, arg5);
                                }
                                if (class352.field5426 != 0 && class352.field5426 != 3 || class15.field246 || class193.field2807 < var22 || class255.field3814 < var23 || class193.field2807 >= var24 || var21 <= class255.field3814) {
                                    continue;
                                }
                                int var128 = class193.field2807 - var14;
                                int var129 = class255.field3814 - var15;
                                int var130 = var12.field5570[var129];
                                if (var128 < var130 || var128 > (var12.field5591[var129] + var130)) {
                                    continue;
                                }
                                int var131 = var129 - var12.field5560 / 2;
                                int var132 = var128 - var12.field5506 / 2;
                                int var133;
                                if (class86.field1208 == 4) {
                                    var133 = (int) class36.field535 & 0x7FF;
                                } else {
                                    var133 = (int) class36.field535 + class298.field4460 & 0x7FF;
                                }
                                int var134 = class345.field5343[var133];
                                int var135 = class345.field5339[var133];
                                if (class86.field1208 != 4) {
                                    var135 = (class281.field4271 + 256) * var135 >> 8;
                                    var134 = (class281.field4271 + 256) * var134 >> 8;
                                }
                                int var136 = var131 * var135 + var132 * var134 >> 11;
                                int var137 = var131 * var134 - (var132 * var135) >> 11;
                                int var138;
                                int var139;
                                if (class86.field1208 == 4) {
                                    var139 = class194.field2823 - var137 >> 7;
                                    var138 = class259.field3864 + var136 >> 7;
                                } else {
                                    var138 = class1.field55.field5137 + var136 + 64 - class1.field55.method1700(-117) * 64 >> 7;
                                    var139 = class1.field55.field5165 - var137 - (class1.field55.method1700(-99) + -1) * 64 >> 7;
                                }
                                if (class273.field4150 && (class49.field728 & 0x40) != 0) {
                                    class359 var140 = class165.method1172(class67.field976, -1, class88.field1234);
                                    if (var140 == null) {
                                        class51.method429((byte) -94);
                                    } else {
                                        class261.method1920((short) 12, class247.field3655, class33.field475, var138, " ->", -2, var139, 1L);
                                    }
                                    continue;
                                }
                                if (class164.field2335 == 1) {
                                    class261.method1920((short) 13, class352.field5425, -1, var138, "", -2, var139, 1L);
                                }
                                class261.method1920((short) 14, class9.field154, -1, var138, "", -2, var139, 1L);
                                continue;
                            }
                            if (var12.field5515 == 1339) {
                                if (var12.method2489((byte) 78)) {
                                    class343.method2399((byte) -99, var14, var12, var13, var15);
                                    if (class141.field2031) {
                                        class205.method1503(arg4, arg6, arg2, arg5);
                                    } else {
                                        class44.method326(arg4, arg6, arg2, arg5);
                                    }
                                }
                                continue;
                            }
                            if (var12.field5515 == 1400) {
                                class256.method1876(var12.field5560, var15, var14, (byte) 109, var12.field5506);
                                class332.field5051[var13] = true;
                                class186.field2674[var13] = true;
                                if (class141.field2031) {
                                    class205.method1503(arg4, arg6, arg2, arg5);
                                } else {
                                    class44.method326(arg4, arg6, arg2, arg5);
                                }
                                continue;
                            }
                            if (var12.field5515 == 1401) {
                                class196.method1412(var14, var15, (byte) -123, var12.field5560, var12.field5506);
                                class332.field5051[var13] = true;
                                class186.field2674[var13] = true;
                                if (class141.field2031) {
                                    class205.method1503(arg4, arg6, arg2, arg5);
                                } else {
                                    class44.method326(arg4, arg6, arg2, arg5);
                                }
                                continue;
                            }
                            if (var12.field5515 == 1402) {
                                if (!class141.field2031) {
                                    class139.method980((byte) 105, var14, var15);
                                    class332.field5051[var13] = true;
                                    class186.field2674[var13] = true;
                                }
                                continue;
                            }
                            if (var12.field5515 == 1405) {
                                if (!class91.field1265) {
                                    continue;
                                }
                                int var27 = var12.field5506 + var14;
                                int var28 = var15 + 15;
                                class99.field1425.method201("Fps:" + class19.field306, var27, var28, 16776960, -1);
                                int var141 = var28 + 15;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                int var31 = 16776960;
                                if (var30 > 65536) {
                                    var31 = 16711680;
                                }
                                class99.field1425.method201("Mem:" + var30 + "k", var27, var141, var31, -1);
                                var28 = var141 + 15;
                                if (class141.field2031) {
                                    int var32 = (class305.field4569 + class305.field4568 + class305.field4570) / 1024;
                                    int var33 = 16776960;
                                    if (var32 > 65536) {
                                        var33 = 16711680;
                                    }
                                    class99.field1425.method201("Card:" + var32 + "k", var27, var28, var33, -1);
                                    var28 += 15;
                                }
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 29; var37++) {
                                    var34 += class169.field2441[var37].method1616(0);
                                    var35 += class169.field2441[var37].method1612(true);
                                    var36 += class169.field2441[var37].method1615(6008);
                                }
                                int var38 = var35 * 10000 / var34;
                                int var39 = var36 * 100 / var34;
                                int var40 = 16776960;
                                String var41 = "Cache:" + class33.method246(true, -3194, 2, (long) var38, 0) + "% (" + var39 + "%)";
                                class229.field3473.method201(var41, var27, var28, var40, -1);
                                var28 += 12;
                                if (class155.field2221 > 0) {
                                    class229.field3473.method201("Particles: " + class155.field2213 + " / " + class155.field2221, var27, var28, var40, -1);
                                }
                                var28 += 12;
                                class332.field5051[var13] = true;
                                class186.field2674[var13] = true;
                                continue;
                            }
                            if (var12.field5515 == 1406) {
                                class67.field981 = var15;
                                class274.field4157 = var12;
                                client.field647 = var14;
                                continue;
                            }
                        }
                        if (!class15.field246) {
                            if (var12.field5554 == 0 && var12.field5550 && var22 <= class193.field2807 && class255.field3814 >= var23 && var24 > class193.field2807 && var21 > class255.field3814 && !class190.field2769) {
                                class264.field4043 = 1;
                                class324.field4886[0] = class133.field1949;
                                class216.field3186[0] = 1002;
                                class158.field2274[0] = class128.field1867;
                                class281.field4267[0] = "";
                            }
                            if (class193.field2807 >= var22 && class255.field3814 >= var23 && class193.field2807 < var24 && class255.field3814 < var21) {
                                class83.method679(-1, class255.field3814 - var15, -var14 + class193.field2807, var12);
                            }
                        }
                        if (var12.field5554 == 0) {
                            if (!var12.field5500 && client.method359(var12) && class92.field1271 != var12) {
                                continue;
                            }
                            if (!var12.field5500) {
                                if ((var12.field5580 - var12.field5560) < var12.field5641) {
                                    var12.field5641 = var12.field5580 - var12.field5560;
                                }
                                if (var12.field5641 < 0) {
                                    var12.field5641 = 0;
                                }
                            }
                            if (class141.field2031 && var12.field5515 == 1407) {
                                class233.method1726(var14, var15, var12.field5506, var12.field5560);
                            }
                            method82(arg0, -123, var24, var15 - var12.field5641, var22, var21, var23, var12.field5521, var13, var14 - var12.field5496);
                            if (var12.field5579 != null) {
                                method82(var12.field5579, -116, var24, var15 - var12.field5641, var22, var21, var23, var12.field5521, var13, var14 - var12.field5496);
                            }
                            class98 var42 = (class98) class288.field4360.method1405((long) var12.field5521, false);
                            if (var42 != null) {
                                if (var42.field1380 == 0 && !class15.field246 && class193.field2807 >= var22 && class255.field3814 >= var23 && var24 > class193.field2807 && var21 > class255.field3814 && !class190.field2769) {
                                    class324.field4886[0] = class133.field1949;
                                    class216.field3186[0] = 1002;
                                    class264.field4043 = 1;
                                    class158.field2274[0] = class128.field1867;
                                    class281.field4267[0] = "";
                                }
                                class349.method2448(var15, var24, var14, var23, (byte) 127, var21, var22, var42.field1393, var13);
                            }
                            if (class141.field2031 && var12.field5515 == 1407) {
                                class233.method1727();
                                class174.field2513 = true;
                            }
                            if (class141.field2031) {
                                class205.method1503(arg4, arg6, arg2, arg5);
                            } else {
                                class44.method326(arg4, arg6, arg2, arg5);
                                class345.method2423();
                            }
                        }
                        if (class158.field2276[var13] || class7.field139 > 1) {
                            if (var12.field5554 == 0 && !var12.field5500 && var12.field5560 < var12.field5580) {
                                class148.method1045((byte) -87, var12.field5560, var12.field5580, var12.field5641, var15, var12.field5506 + var14);
                            }
                            if (var12.field5554 != 1) {
                                if (var12.field5554 == 2) {
                                    int var111 = 0;
                                    for (int var112 = 0; var112 < var12.field5599; var112++) {
                                        for (int var113 = 0; var113 < var12.field5524; var113++) {
                                            int var114 = (var12.field5632 + 32) * var112 + var15;
                                            int var115 = (var12.field5565 + 32) * var113 + var14;
                                            if (var111 < 20) {
                                                var115 += var12.field5598[var111];
                                                var114 += var12.field5516[var111];
                                            }
                                            if (var12.field5545[var111] > 0) {
                                                boolean var117 = false;
                                                boolean var118 = false;
                                                int var119 = var12.field5545[var111] - 1;
                                                if ((var115 + 32) > arg4 && arg2 > var115 && arg6 < var114 + 32 && arg5 > var114 || class219.field3271 == var12 && class240.field3570 == var111) {
                                                    class177 var120;
                                                    if (class239.field3562 == 1 && class52.field776 == var111 && class302.field4518 == var12.field5521) {
                                                        var120 = class207.method1512(var12.field5498, 0, (class256) null, var12.field5513[var111], (byte) 110, 2, var119);
                                                    } else {
                                                        var120 = class207.method1512(var12.field5498, 3153952, (class256) null, var12.field5513[var111], (byte) 110, 1, var119);
                                                    }
                                                    if (class345.field5342) {
                                                        class332.field5051[var13] = true;
                                                    }
                                                    if (var120 == null) {
                                                        class83.method676(var12, (byte) -66);
                                                    } else if (class219.field3271 == var12 && class240.field3570 == var111) {
                                                        int var121 = class56.field815 - class315.field4678;
                                                        int var122 = class165.field2353 - class107.field1547;
                                                        if (var121 < 5 && var121 > -5) {
                                                            var121 = 0;
                                                        }
                                                        if (var122 < 5 && var122 > -5) {
                                                            var122 = 0;
                                                        }
                                                        if (class132.field1934 < 5) {
                                                            var122 = 0;
                                                            var121 = 0;
                                                        }
                                                        var120.method647(var115 + var121, var114 + var122, 128);
                                                        if (arg7 != -1) {
                                                            class359 var123 = arg0[arg7 & 0xFFFF];
                                                            int var124;
                                                            int var125;
                                                            if (class141.field2031) {
                                                                var124 = class205.field3006;
                                                                var125 = class205.field3003;
                                                            } else {
                                                                var124 = class44.field616;
                                                                var125 = class44.field621;
                                                            }
                                                            if (var114 + var122 < var124 && var123.field5641 > 0) {
                                                                int var126 = (var124 - (var114 + var122)) * class94.field1310 / 3;
                                                                if (var126 > class94.field1310 * 10) {
                                                                    var126 = class94.field1310 * 10;
                                                                }
                                                                if (var126 > var123.field5641) {
                                                                    var126 = var123.field5641;
                                                                }
                                                                class107.field1547 += var126;
                                                                var123.field5641 -= var126;
                                                                class83.method676(var123, (byte) 98);
                                                            }
                                                            if (var122 + var114 + 32 > var125 && var123.field5641 < var123.field5580 - var123.field5560) {
                                                                int var127 = (var114 + var122 + 32 - var125) * class94.field1310 / 3;
                                                                if ((class94.field1310 * 10) < var127) {
                                                                    var127 = class94.field1310 * 10;
                                                                }
                                                                if (var123.field5580 - var123.field5560 - var123.field5641 < var127) {
                                                                    var127 = var123.field5580 - var123.field5560 - var123.field5641;
                                                                }
                                                                class107.field1547 -= var127;
                                                                var123.field5641 += var127;
                                                                class83.method676(var123, (byte) 86);
                                                            }
                                                        }
                                                    } else if (class259.field3861 == var12 && class232.field3499 == var111) {
                                                        var120.method647(var115, var114, 128);
                                                    } else {
                                                        var120.method642(var115, var114);
                                                    }
                                                }
                                            } else if (var12.field5527 != null && var111 < 20) {
                                                class177 var116 = var12.method2491(var111, 0);
                                                if (var116 != null) {
                                                    var116.method642(var115, var114);
                                                } else if (class33.field488) {
                                                    class83.method676(var12, (byte) -97);
                                                }
                                            }
                                            var111++;
                                        }
                                    }
                                } else if (var12.field5554 == 3) {
                                    int var110;
                                    if (class315.method2201(var12, 22366)) {
                                        var110 = var12.field5535;
                                        if (class92.field1271 == var12 && var12.field5567 != 0) {
                                            var110 = var12.field5567;
                                        }
                                    } else {
                                        var110 = var12.field5646;
                                        if (class92.field1271 == var12 && var12.field5631 != 0) {
                                            var110 = var12.field5631;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (var12.field5543) {
                                            if (class141.field2031) {
                                                class205.method1499(var14, var15, var12.field5506, var12.field5560, var110);
                                            } else {
                                                class44.method317(var14, var15, var12.field5506, var12.field5560, var110);
                                            }
                                        } else if (class141.field2031) {
                                            class205.method1487(var14, var15, var12.field5506, var12.field5560, var110);
                                        } else {
                                            class44.method316(var14, var15, var12.field5506, var12.field5560, var110);
                                        }
                                    } else if (var12.field5543) {
                                        if (class141.field2031) {
                                            class205.method1500(var14, var15, var12.field5506, var12.field5560, var110, 256 - (var16 & 0xFF));
                                        } else {
                                            class44.method315(var14, var15, var12.field5506, var12.field5560, var110, 256 - (var16 & 0xFF));
                                        }
                                    } else if (class141.field2031) {
                                        class205.method1493(var14, var15, var12.field5506, var12.field5560, var110, 256 - (var16 & 0xFF));
                                    } else {
                                        class44.method314(var14, var15, var12.field5506, var12.field5560, var110, 256 - (var16 & 0xFF));
                                    }
                                } else if (var12.field5554 == 4) {
                                    class29 var106 = var12.method2492(class239.field3563, false);
                                    if (var106 != null) {
                                        String var107 = var12.field5635;
                                        int var108;
                                        if (class315.method2201(var12, 22366)) {
                                            var108 = var12.field5535;
                                            if (class92.field1271 == var12 && var12.field5567 != 0) {
                                                var108 = var12.field5567;
                                            }
                                            if (var12.field5508.length() > 0) {
                                                var107 = var12.field5508;
                                            }
                                        } else {
                                            var108 = var12.field5646;
                                            if (class92.field1271 == var12 && var12.field5631 != 0) {
                                                var108 = var12.field5631;
                                            }
                                        }
                                        if (var12.field5500 && var12.field5615 != -1) {
                                            class122 var109 = class175.method1228((byte) 54, var12.field5615);
                                            var107 = var109.field1742;
                                            if (var107 == null) {
                                                var107 = "null";
                                            }
                                            if ((var109.field1745 == 1 || var12.field5503 != 1) && var12.field5503 != -1) {
                                                var107 = "<col=ff9040>" + var107 + "</col> x" + class169.method1193(1, var12.field5503);
                                            }
                                        }
                                        if (class289.field4380 == var12) {
                                            var107 = class201.field2949;
                                            var108 = var12.field5646;
                                        }
                                        if (!var12.field5500) {
                                            var107 = class55.method449(4, var12, var107);
                                        }
                                        var106.method192(var107, var14, var15, var12.field5506, var12.field5560, var108, var12.field5584 ? 0 : -1, var12.field5655, var12.field5657, var12.field5612);
                                    } else if (class33.field488) {
                                        class83.method676(var12, (byte) -93);
                                    }
                                } else if (var12.field5554 == 5) {
                                    if (!var12.field5500) {
                                        class177 var105 = var12.method2493(118, class315.method2201(var12, 22366));
                                        if (var105 != null) {
                                            var105.method642(var14, var15);
                                        } else if (class33.field488) {
                                            class83.method676(var12, (byte) -45);
                                        }
                                    } else if (var12.field5542 >= 0) {
                                        class82 var89 = var12.method2485(-1);
                                        if (class141.field2031) {
                                            var89.method675(0, var14, var15, var12.field5506, var12.field5560, var12.field5571, var12.field5569, 0);
                                        } else {
                                            var89.method672(0, var14, var15, var12.field5506, var12.field5560, var12.field5571, var12.field5569, 0);
                                        }
                                    } else {
                                        class177 var90;
                                        if (var12.field5615 == -1) {
                                            var90 = var12.method2493(114, false);
                                        } else if (var12.field5558 && class1.field55.field3445 != null) {
                                            var90 = class207.method1512(var12.field5498, var12.field5576, class1.field55.field3445, var12.field5503, (byte) 114, var12.field5531, var12.field5615);
                                        } else {
                                            var90 = class207.method1512(var12.field5498, var12.field5576, (class256) null, var12.field5503, (byte) 126, var12.field5531, var12.field5615);
                                        }
                                        if (var90 != null) {
                                            int var91 = var90.field2555;
                                            int var92 = var90.field2549;
                                            if (var12.field5673) {
                                                int var94 = (var92 + var12.field5560 - 1) / var92;
                                                int var95 = (var12.field5506 + var91 - 1) / var91;
                                                if (class141.field2031) {
                                                    class205.method1486(var14, var15, var12.field5506 + var14, var12.field5560 + var15);
                                                    boolean var96 = class338.method2377(var90.field2536, 120);
                                                    class325 var97 = (class325) var90;
                                                    boolean var98 = class338.method2377(var90.field2553, 125);
                                                    if (var96 && var98) {
                                                        if (var16 == 0) {
                                                            var97.method2248(var14, var15, var95, var94);
                                                        } else {
                                                            var97.method2250(var14, var15, 256 - (var16 & 0xFF), var95, var94);
                                                        }
                                                    } else if (var96) {
                                                        for (int var102 = 0; var102 < var94; var102++) {
                                                            if (var16 == 0) {
                                                                var97.method2248(var14, var92 * var102 + var15, var95, 1);
                                                            } else {
                                                                var97.method2250(var14, var15 + (var92 * var102), -(var16 & 0xFF) + 256, var95, 1);
                                                            }
                                                        }
                                                    } else if (var98) {
                                                        for (int var99 = 0; var99 < var95; var99++) {
                                                            if (var16 == 0) {
                                                                var97.method2248(var91 * var99 + var14, var15, 1, var94);
                                                            } else {
                                                                var97.method2250(var91 * var99 + var14, var15, 256 - (var16 & 0xFF), 1, var94);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var100 = 0; var100 < var95; var100++) {
                                                            for (int var101 = 0; var101 < var94; var101++) {
                                                                if (var16 == 0) {
                                                                    var90.method642(var14 + (var91 * var100), var92 * var101 + var15);
                                                                } else {
                                                                    var90.method647(var91 * var100 + var14, var15 - -(var92 * var101), 256 - (var16 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class205.method1503(arg4, arg6, arg2, arg5);
                                                } else {
                                                    class44.method319(var14, var15, var12.field5506 + var14, var12.field5560 + var15);
                                                    for (int var103 = 0; var103 < var95; var103++) {
                                                        for (int var104 = 0; var104 < var94; var104++) {
                                                            if (var12.field5538 != 0) {
                                                                var90.method1240(4096, var14 - (-(var91 * var103) - var91 / 2), var92 / 2 + var92 * var104 + var15, var12.field5538, 111);
                                                            } else if (var16 == 0) {
                                                                var90.method642(var91 * var103 + var14, var92 * var104 + var15);
                                                            } else {
                                                                var90.method647(var91 * var103 + var14, var92 * var104 + var15, 256 - (var16 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class44.method326(arg4, arg6, arg2, arg5);
                                                }
                                            } else {
                                                int var93 = var12.field5506 * 4096 / var91;
                                                if (var12.field5538 != 0) {
                                                    var90.method1240(var93, var12.field5506 / 2 + var14, var12.field5560 / 2 + var15, var12.field5538, 111);
                                                } else if (var16 != 0) {
                                                    var90.method643(var14, var15, var12.field5506, var12.field5560, 256 - (var16 & 0xFF));
                                                } else if (var12.field5506 == var91 && var12.field5560 == var92) {
                                                    var90.method642(var14, var15);
                                                } else {
                                                    var90.method651(var14, var15, var12.field5506, var12.field5560);
                                                }
                                            }
                                        } else if (class33.field488) {
                                            class83.method676(var12, (byte) 121);
                                        }
                                    }
                                } else if (var12.field5554 == 6) {
                                    boolean var70 = class315.method2201(var12, 22366);
                                    int var71;
                                    if (var70) {
                                        var71 = var12.field5668;
                                    } else {
                                        var71 = var12.field5547;
                                    }
                                    class151 var72 = null;
                                    int var73 = 0;
                                    if (var12.field5615 != -1) {
                                        class122 var74 = class175.method1228((byte) 54, var12.field5615);
                                        if (var74 != null) {
                                            class122 var75 = var74.method907(-116, var12.field5503);
                                            class248 var76 = var71 == -1 ? null : class119.method893(var71, (byte) -41);
                                            if (var12.field5558 && class1.field55.field3445 != null) {
                                                var72 = var75.method910(var12.field5621, class1.field55.field3445, var12.field5519, (byte) -97, var12.field5593, 1, var76);
                                            } else {
                                                var72 = var75.method910(var12.field5621, (class256) null, var12.field5519, (byte) -96, var12.field5593, 1, var76);
                                            }
                                            if (var72 == null) {
                                                class83.method676(var12, (byte) 67);
                                            } else {
                                                var73 = -var72.method371() / 2;
                                            }
                                        }
                                    } else if (var12.field5623 == 5) {
                                        if (var12.field5595 == -1) {
                                            var72 = class274.field4159.method1886((class248) null, -1, 0, -1, 0, 11, -1, (class124[]) null, -1, false, (class248) null, true);
                                        } else {
                                            int var77 = var12.field5595;
                                            class228 var78;
                                            if (class54.field790 == var77) {
                                                var78 = class1.field55;
                                            } else {
                                                var78 = class343.field5312[var77];
                                            }
                                            class248 var79 = var71 == -1 ? null : class119.method893(var71, (byte) -41);
                                            if (var78 != null && (var77 == 2047 || class36.method268(var78.field3453, (byte) 21) == var12.field5606)) {
                                                var72 = var78.field3445.method1886(var79, -1, 0, var12.field5593, 0, 11, 0, (class124[]) null, -1, false, (class248) null, true);
                                            }
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var12.method2484(-1, 0, -1, 113, var70, (class248) null, class1.field55.field3445);
                                        if (var72 == null && class33.field488) {
                                            class83.method676(var12, (byte) 50);
                                        }
                                    } else {
                                        class248 var80 = class119.method893(var71, (byte) -41);
                                        var72 = var12.method2484(var12.field5621, var12.field5519, var12.field5593, 95, var70, var80, class1.field55.field3445);
                                        if (var72 == null && class33.field488) {
                                            class83.method676(var12, (byte) 67);
                                        }
                                    }
                                    if (var72 != null) {
                                        int var81;
                                        if (var12.field5611 <= 0) {
                                            var81 = 256;
                                        } else {
                                            var81 = (var12.field5506 << 8) / var12.field5611;
                                        }
                                        int var82;
                                        if (var12.field5509 > 0) {
                                            var82 = (var12.field5560 << 8) / var12.field5509;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83 = var12.field5506 / 2 + (var12.field5522 * var81 >> 8) + var14;
                                        int var84 = (var12.field5518 * var82 >> 8) + var12.field5560 / 2 + var15;
                                        if (class141.field2031) {
                                            if (var12.field5633) {
                                                class141.method1007(var83, var84, var12.field5544, var12.field5529, var81, var82);
                                            } else {
                                                class141.method998(var83, var84, var81, var82);
                                                class141.method981((float) var12.field5586, (float) var12.field5529 * 1.5F);
                                            }
                                            class141.method983();
                                            class141.method982(true);
                                            class141.method1011(false);
                                            class96.method762(0, class257.field3849);
                                            if (class174.field2513) {
                                                class205.method1489();
                                                class141.method1005();
                                                class205.method1503(arg4, arg6, arg2, arg5);
                                                class174.field2513 = false;
                                            }
                                            if (var12.field5510) {
                                                class141.method1020();
                                            }
                                            int var87 = class345.field5339[var12.field5517] * var12.field5544 >> 16;
                                            int var88 = class345.field5343[var12.field5517] * var12.field5544 >> 16;
                                            if (var12.field5500) {
                                                var72.method1085(0, var12.field5609, var12.field5653, var12.field5517, var12.field5502, var73 + var12.field5667 + var87, var88 - -var12.field5667, -1L);
                                            } else {
                                                var72.method1085(0, var12.field5609, 0, var12.field5517, 0, var87, var88, -1L);
                                            }
                                            if (var12.field5510) {
                                                class141.method1023();
                                            }
                                        } else {
                                            class345.method2417(var83, var84);
                                            int var85 = class345.field5339[var12.field5517] * var12.field5544 >> 16;
                                            int var86 = class345.field5343[var12.field5517] * var12.field5544 >> 16;
                                            if (!var12.field5500) {
                                                var72.method1085(0, var12.field5609, 0, var12.field5517, 0, var85, var86, -1L);
                                            } else if (var12.field5633) {
                                                ((class317) var72).method2219(0, var12.field5609, var12.field5653, var12.field5517, var12.field5502, var12.field5667 + var73 + var85, var12.field5667 + var86, var12.field5544);
                                            } else {
                                                var72.method1085(0, var12.field5609, var12.field5653, var12.field5517, var12.field5502, var73 + var85 + var12.field5667, var86 - -var12.field5667, -1L);
                                            }
                                            class345.method2428();
                                        }
                                    }
                                } else {
                                    if (var12.field5554 == 7) {
                                        class29 var43 = var12.method2492(class239.field3563, false);
                                        if (var43 == null) {
                                            if (class33.field488) {
                                                class83.method676(var12, (byte) 45);
                                            }
                                            continue;
                                        }
                                        int var44 = 0;
                                        for (int var45 = 0; var45 < var12.field5599; var45++) {
                                            for (int var46 = 0; var46 < var12.field5524; var46++) {
                                                if (var12.field5545[var44] > 0) {
                                                    class122 var47 = class175.method1228((byte) 54, var12.field5545[var44] - 1);
                                                    String var48;
                                                    if (var47.field1745 != 1 && var12.field5513[var44] == 1) {
                                                        var48 = "<col=ff9040>" + var47.field1742 + "</col>";
                                                    } else {
                                                        var48 = "<col=ff9040>" + var47.field1742 + "</col> x" + class169.method1193(1, var12.field5513[var44]);
                                                    }
                                                    int var49 = (var12.field5632 + 12) * var45 + var15;
                                                    int var50 = (var12.field5565 + 115) * var46 + var14;
                                                    if (var12.field5655 == 0) {
                                                        var43.method186(var48, var50, var49, var12.field5646, var12.field5584 ? 0 : -1);
                                                    } else if (var12.field5655 == 1) {
                                                        var43.method197(var48, var50 + 57, var49, var12.field5646, var12.field5584 ? 0 : -1);
                                                    } else {
                                                        var43.method201(var48, var50 + 115 - 1, var49, var12.field5646, var12.field5584 ? 0 : -1);
                                                    }
                                                }
                                                var44++;
                                            }
                                        }
                                    }
                                    if (var12.field5554 == 8 && class316.field4697 == var12 && class157.field2265 == class132.field1928) {
                                        int var51 = 0;
                                        int var52 = 0;
                                        class29 var53 = class99.field1425;
                                        String var54 = var12.field5635;
                                        String var55 = class55.method449(4, var12, var54);
                                        while (var55.length() > 0) {
                                            int var56 = var55.indexOf("<br>");
                                            String var57;
                                            if (var56 == -1) {
                                                var57 = var55;
                                                var55 = "";
                                            } else {
                                                var57 = var55.substring(0, var56);
                                                var55 = var55.substring(var56 + 4);
                                            }
                                            int var58 = var53.method203(var57);
                                            var52 += var53.field398 + 1;
                                            if (var51 < var58) {
                                                var51 = var58;
                                            }
                                        }
                                        var52 += 7;
                                        var51 += 6;
                                        int var59 = var12.field5560 + var15 + 5;
                                        int var60 = var14 - (5 - var12.field5506) - var51;
                                        if (var14 + 5 > var60) {
                                            var60 = var14 + 5;
                                        }
                                        if (arg2 < (var60 + var51)) {
                                            var60 = arg2 - var51;
                                        }
                                        if (var52 + var59 > arg5) {
                                            var59 = arg5 - var52;
                                        }
                                        if (class141.field2031) {
                                            class205.method1499(var60, var59, var51, var52, 16777120);
                                            class205.method1487(var60, var59, var51, var52, 0);
                                        } else {
                                            class44.method317(var60, var59, var51, var52, 16777120);
                                            class44.method316(var60, var59, var51, var52, 0);
                                        }
                                        String var61 = var12.field5635;
                                        int var62 = var53.field398 + var59 + 2;
                                        String var63 = class55.method449(4, var12, var61);
                                        while (var63.length() > 0) {
                                            int var64 = var63.indexOf("<br>");
                                            String var65;
                                            if (var64 == -1) {
                                                var65 = var63;
                                                var63 = "";
                                            } else {
                                                var65 = var63.substring(0, var64);
                                                var63 = var63.substring(var64 + 4);
                                            }
                                            var53.method186(var65, var60 + 3, var62, 0, -1);
                                            var62 += var53.field398 + 1;
                                        }
                                    }
                                    if (var12.field5554 == 9) {
                                        int var66;
                                        int var67;
                                        int var68;
                                        int var69;
                                        if (var12.field5634) {
                                            var68 = var12.field5506 + var14;
                                            var69 = var12.field5560 + var15;
                                            var67 = var14;
                                            var66 = var15;
                                        } else {
                                            var66 = var12.field5560 + var15;
                                            var67 = var14;
                                            var68 = var12.field5506 + var14;
                                            var69 = var15;
                                        }
                                        if (var12.field5674 == 1) {
                                            if (class141.field2031) {
                                                class205.method1488(var67, var69, var68, var66, var12.field5646);
                                            } else {
                                                class44.method320(var67, var69, var68, var66, var12.field5646);
                                            }
                                        } else if (class141.field2031) {
                                            class205.method1491(var67, var69, var68, var66, var12.field5646, var12.field5674);
                                        } else {
                                            class44.method332(var67, var69, var68, var66, var12.field5646, var12.field5674);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V", line = 1384)
    public class14(byte[] arg0) {
        this.field208 = arg0;
    }
}
