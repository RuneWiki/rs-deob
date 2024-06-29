import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class98 extends class216 {

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lmj;")
    public class8 field1774;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "Lbd;")
    private static class162 field1773 = class17.method142(0, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Lbd;")
    public static class162 field1779 = class17.method142(0, "weiss:");

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lbd;")
    public static class162 field1781 = field1773;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "Lbd;")
    public static class162 field1783 = class17.method142(0, "cookieprefix");

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field1782 = 2;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Lbd;")
    public static class162 field1787 = class17.method142(0, "lila:");

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[Llm;")
    public static class43[] field1785;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V", line = 8)
    public static final void method782(int arg0, int arg1) {
        if (arg0 != -14796) {
            method785(-122, (byte) -125, -79, -89);
        }
        class63 var2 = class46.method332(12, arg1, -12770);
        var2.method427(-22507);
        field1780++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILb;)Lol;", line = 21)
    public static final class111 method783(int arg0, class94 arg1) {
        field1786++;
        if (arg0 != 7) {
            field1779 = (class162) null;
        }
        return new class111(arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method750((byte) -24), arg1.method732(arg0 - 8), arg1.method756(915905888));
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lmj;)V", line = 33)
    public class98(class8 arg0) {
        this.field1774 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III[Lob;IIIBII)V", line = 60)
    public static final void method784(int arg0, int arg1, int arg2, class78[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field1778++;
        if (class117.field2159) {
            class16.method133(arg1, arg5, arg2, arg0);
        } else {
            class316.method2168(arg1, arg5, arg2, arg0);
            class312.method2117();
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class78 var11 = arg3[var10];
            if (var11 != null && (var11.field1371 == arg4 || arg4 == -1412584499 && class17.field284 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class111.field2015[class258.field4293] = var11.field1377 + arg9;
                    class230.field3834[class258.field4293] = var11.field1289 + arg6;
                    class214.field3593[class258.field4293] = var11.field1340;
                    class283.field4799[class258.field4293] = var11.field1367;
                    var12 = class258.field4293++;
                } else {
                    var12 = arg8;
                }
                var11.field1269 = var12;
                var11.field1275 = class90.field1598;
                if (!var11.field1229 || !client.method864(var11)) {
                    if (var11.field1313 > 0) {
                        class1.method5(var11, -20996);
                    }
                    int var13 = var11.field1377 + arg9;
                    int var14 = var11.field1289 + arg6;
                    int var15 = var11.field1342;
                    if (class255.field4223 && (client.method861(var11) != 0 || var11.field1231 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class17.field284 == var11) {
                        if (arg4 != -1412584499 && !var11.field1245) {
                            class262.field4374 = arg6;
                            class180.field3104 = arg9;
                            class104.field1880 = arg3;
                            continue;
                        }
                        if (class25.field405 && class58.field909) {
                            int var16 = class109.field1961;
                            int var17 = var16 - class250.field4171;
                            if (var17 < class84.field1513) {
                                var17 = class84.field1513;
                            }
                            if ((class84.field1513 + class205.field3464.field1340) < (var11.field1340 + var17)) {
                                var17 = class205.field3464.field1340 + class84.field1513 - var11.field1340;
                            }
                            var13 = var17;
                            int var18 = class274.field4554;
                            int var19 = var18 - class30.field506;
                            if (var19 < class46.field737) {
                                var19 = class46.field737;
                            }
                            if (class46.field737 + class205.field3464.field1367 < var11.field1367 + var19) {
                                var19 = class205.field3464.field1367 + class46.field737 - var11.field1367;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1245) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1231 == 2) {
                        var20 = arg1;
                        var21 = arg5;
                        var22 = arg0;
                        var23 = arg2;
                    } else {
                        var20 = arg1 >= var13 ? arg1 : var13;
                        var21 = var14 <= arg5 ? arg5 : var14;
                        int var24 = var11.field1340 + var13;
                        int var25 = var11.field1367 + var14;
                        if (var11.field1231 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = arg2 > var24 ? var24 : arg2;
                        var22 = arg0 > var25 ? var25 : arg0;
                    }
                    if (!var11.field1229 || var20 < var23 && var21 < var22) {
                        if (var11.field1313 != 0) {
                            if (var11.field1313 == 1337 || var11.field1313 == 1403 && class117.field2159) {
                                class171.field2970 = var11;
                                class223.field3724 = var14;
                                class19.field308 = var13;
                                class39.method287(var11.field1313 == 1403, var13, (byte) -116, var11.field1367, var11.field1340, var14);
                                if (class117.field2159) {
                                    class16.method133(arg1, arg5, arg2, arg0);
                                } else {
                                    class316.method2168(arg1, arg5, arg2, arg0);
                                }
                                continue;
                            }
                            if (var11.field1313 == 1338) {
                                if (var11.method591((byte) -38)) {
                                    class147.method1171(false, var13, var14, var12, var11);
                                    if (class117.field2159) {
                                        class16.method133(arg1, arg5, arg2, arg0);
                                    } else {
                                        class316.method2168(arg1, arg5, arg2, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1313 == 1339) {
                                if (var11.method591((byte) -38)) {
                                    class127.method1027(var12, var11, var14, var13, (byte) 124);
                                    if (class117.field2159) {
                                        class16.method133(arg1, arg5, arg2, arg0);
                                    } else {
                                        class316.method2168(arg1, arg5, arg2, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1313 == 1400) {
                                class19.method176(var11.field1340, true, var13, var14, var11.field1367);
                                class73.field1159[var12] = true;
                                class252.field4211[var12] = true;
                                if (class117.field2159) {
                                    class16.method133(arg1, arg5, arg2, arg0);
                                } else {
                                    class316.method2168(arg1, arg5, arg2, arg0);
                                }
                                continue;
                            }
                            if (var11.field1313 == 1401) {
                                class198.method1479(var11.field1340, var13, var11.field1367, var14, (byte) -123);
                                class73.field1159[var12] = true;
                                class252.field4211[var12] = true;
                                if (class117.field2159) {
                                    class16.method133(arg1, arg5, arg2, arg0);
                                } else {
                                    class316.method2168(arg1, arg5, arg2, arg0);
                                }
                                continue;
                            }
                            if (var11.field1313 == 1402) {
                                if (!class117.field2159) {
                                    class208.method1528(var14, var13, -109);
                                    class73.field1159[var12] = true;
                                    class252.field4211[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1313 == 1405) {
                                if (!class203.field3440) {
                                    continue;
                                }
                                int var111 = var13 + var11.field1340;
                                int var112 = var14 + 15;
                                int var113 = 16776960;
                                class286.field4831.method1873(class135.method1062(new class162[] { class94.field1678, class156.method1212(10, class29.field499) }, true), var111, var112, 16776960, -1);
                                int var126 = var112 + 15;
                                Runtime var114 = Runtime.getRuntime();
                                int var115 = (int) ((var114.totalMemory() - var114.freeMemory()) / 1024L);
                                if (var115 > 65536) {
                                    var113 = 16711680;
                                }
                                class286.field4831.method1873(class135.method1062(new class162[] { class139.field2487, class156.method1212(10, var115), class231.field3850 }, true), var111, var126, var113, -1);
                                var112 = var126 + 15;
                                if (class117.field2159) {
                                    int var116 = 16776960;
                                    int var117 = (class41.field661 + class41.field660 + class41.field658) / 1024;
                                    if (var117 > 65536) {
                                        var116 = 16711680;
                                    }
                                    class286.field4831.method1873(class135.method1062(new class162[] { class22.field339, class156.method1212(10, var117), class231.field3850 }, true), var111, var112, var116, -1);
                                    var112 += 15;
                                }
                                int var118 = 0;
                                int var119 = 16776960;
                                int var120 = 0;
                                int var121 = 0;
                                for (int var122 = 0; var122 < 27; var122++) {
                                    var120 += class68.field1091[var122].method198((byte) 1);
                                    var118 += class68.field1091[var122].method194((byte) 35);
                                    var121 += class68.field1091[var122].method195(false);
                                }
                                int var123 = var121 * 100 / var120;
                                int var124 = var118 * 10000 / var120;
                                class162 var125 = class135.method1062(new class162[] { class183.field3150, class77.method583(0, true, 2, true, (long) var124), class101.field1851, class156.method1212(10, var123), class114.field2036 }, true);
                                class268.field4487.method1873(var125, var111, var112, var119, -1);
                                class73.field1159[var12] = true;
                                var112 += 12;
                                class252.field4211[var12] = true;
                                continue;
                            }
                        }
                        if (!class32.field539) {
                            if (var11.field1231 == 0 && var11.field1263 && var20 <= class233.field3876 && var21 <= class43.field718 && class233.field3876 < var23 && var22 > class43.field718 && !class255.field4223) {
                                class105.field1911[0] = 1006;
                                class1.field9[0] = class35.field566;
                                class293.field4931 = 1;
                                class31.field516[0] = class244.field4053;
                            }
                            if (var20 <= class233.field3876 && class43.field718 >= var21 && var23 > class233.field3876 && class43.field718 < var22) {
                                class105.method866(class233.field3876 - var13, class43.field718 - var14, var11, 5438);
                            }
                        }
                        if (var11.field1231 == 0) {
                            if (!var11.field1229 && client.method864(var11) && class289.field4863 != var11) {
                                continue;
                            }
                            if (!var11.field1229) {
                                if ((var11.field1220 - var11.field1367) < var11.field1258) {
                                    var11.field1258 = var11.field1220 - var11.field1367;
                                }
                                if (var11.field1258 < 0) {
                                    var11.field1258 = 0;
                                }
                            }
                            method784(var22, var20, var23, arg3, var11.field1235, var21, var14 - var11.field1258, (byte) -117, var12, var13 - var11.field1326);
                            if (var11.field1363 != null) {
                                method784(var22, var20, var23, var11.field1363, var11.field1235, var21, var14 - var11.field1258, (byte) -107, var12, var13 - var11.field1326);
                            }
                            class172 var26 = (class172) class137.field2440.method1672((long) var11.field1235, 19760);
                            if (var26 != null) {
                                if (var26.field2987 == 0 && !class32.field539 && class233.field3876 >= var20 && var21 <= class43.field718 && class233.field3876 < var23 && var22 > class43.field718 && !class255.field4223) {
                                    class1.field9[0] = class35.field566;
                                    class105.field1911[0] = 1006;
                                    class293.field4931 = 1;
                                    class31.field516[0] = class244.field4053;
                                }
                                class54.method383(var22, var21, var23, -3419, var26.field2985, var12, var13, var20, var14);
                            }
                            if (class117.field2159) {
                                class16.method133(arg1, arg5, arg2, arg0);
                            } else {
                                class316.method2168(arg1, arg5, arg2, arg0);
                                class312.method2117();
                            }
                        }
                        if (class243.field4044[var12] || class240.field3982 > 1) {
                            if (var11.field1231 == 0 && !var11.field1229 && var11.field1220 > var11.field1367) {
                                class12.method106(var11.field1258, (byte) -67, var11.field1367, var11.field1220, var11.field1340 + var13, var14);
                            }
                            if (var11.field1231 != 1) {
                                if (var11.field1231 == 2) {
                                    int var94 = 0;
                                    for (int var95 = 0; var95 < var11.field1278; var95++) {
                                        for (int var96 = 0; var96 < var11.field1219; var96++) {
                                            int var97 = (var11.field1257 + 32) * var96 + var13;
                                            int var98 = var14 + ((var11.field1346 + 32) * var95);
                                            if (var94 < 20) {
                                                var97 += var11.field1349[var94];
                                                var98 += var11.field1353[var94];
                                            }
                                            if (var11.field1381[var94] > 0) {
                                                boolean var99 = false;
                                                boolean var100 = false;
                                                int var101 = var11.field1381[var94] - 1;
                                                if (arg1 < (var97 + 32) && arg2 > var97 && arg5 < var98 + 32 && var98 < arg0 || class115.field2041 == var11 && class57.field886 == var94) {
                                                    class71 var102;
                                                    if (class148.field2674 == 1 && class87.field1548 == var94 && class165.field2918 == var11.field1235) {
                                                        var102 = class125.method1012(var101, var11.field1241, 0, 25, var11.field1368[var94], 2);
                                                    } else {
                                                        var102 = class125.method1012(var101, var11.field1241, 3153952, 25, var11.field1368[var94], 1);
                                                    }
                                                    if (class312.field5258) {
                                                        class73.field1159[var12] = true;
                                                    }
                                                    if (var102 == null) {
                                                        class55.method386(0, var11);
                                                    } else if (class115.field2041 == var11 && class57.field886 == var94) {
                                                        int var103 = class109.field1961 - class203.field3430;
                                                        int var104 = class274.field4554 - class167.field2946;
                                                        if (var103 < 5 && var103 > -5) {
                                                            var103 = 0;
                                                        }
                                                        if (var104 < 5 && var104 > -5) {
                                                            var104 = 0;
                                                        }
                                                        if (class163.field2882 < 5) {
                                                            var104 = 0;
                                                            var103 = 0;
                                                        }
                                                        var102.method514(var97 + var103, var98 + var104, 128);
                                                        if (arg4 != -1) {
                                                            class78 var105 = arg3[arg4 & 0xFFFF];
                                                            int var106;
                                                            int var107;
                                                            if (class117.field2159) {
                                                                var107 = class16.field239;
                                                                var106 = class16.field241;
                                                            } else {
                                                                var106 = class316.field5334;
                                                                var107 = class316.field5330;
                                                            }
                                                            if (var107 > var98 + var104 && var105.field1258 > 0) {
                                                                int var108 = (var107 - var98 - var104) * class149.field2680 / 3;
                                                                if (var108 > (class149.field2680 * 10)) {
                                                                    var108 = class149.field2680 * 10;
                                                                }
                                                                if (var108 > var105.field1258) {
                                                                    var108 = var105.field1258;
                                                                }
                                                                class167.field2946 += var108;
                                                                var105.field1258 -= var108;
                                                                class55.method386(0, var105);
                                                            }
                                                            if (var106 < (var98 + var104 + 32) && var105.field1220 - var105.field1367 > var105.field1258) {
                                                                int var109 = (var98 + var104 + 32 - var106) * class149.field2680 / 3;
                                                                if (class149.field2680 * 10 < var109) {
                                                                    var109 = class149.field2680 * 10;
                                                                }
                                                                if (var109 > var105.field1220 - var105.field1367 - var105.field1258) {
                                                                    var109 = var105.field1220 - var105.field1367 - var105.field1258;
                                                                }
                                                                class167.field2946 -= var109;
                                                                var105.field1258 += var109;
                                                                class55.method386(0, var105);
                                                            }
                                                        }
                                                    } else if (class205.field3458 == var11 && class186.field3200 == var94) {
                                                        var102.method514(var97, var98, 128);
                                                    } else {
                                                        var102.method285(var97, var98);
                                                    }
                                                }
                                            } else if (var11.field1315 != null && var94 < 20) {
                                                class71 var110 = var11.method594(-20602, var94);
                                                if (var110 != null) {
                                                    var110.method285(var97, var98);
                                                } else if (class257.field4261) {
                                                    class55.method386(0, var11);
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                } else if (var11.field1231 == 3) {
                                    int var93;
                                    if (class122.method991(var11, 0)) {
                                        var93 = var11.field1287;
                                        if (class289.field4863 == var11 && var11.field1347 != 0) {
                                            var93 = var11.field1347;
                                        }
                                    } else {
                                        var93 = var11.field1339;
                                        if (class289.field4863 == var11 && var11.field1248 != 0) {
                                            var93 = var11.field1248;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1223) {
                                            if (class117.field2159) {
                                                class16.method124(var13, var14, var11.field1340, var11.field1367, var93);
                                            } else {
                                                class316.method2174(var13, var14, var11.field1340, var11.field1367, var93);
                                            }
                                        } else if (class117.field2159) {
                                            class16.method128(var13, var14, var11.field1340, var11.field1367, var93);
                                        } else {
                                            class316.method2160(var13, var14, var11.field1340, var11.field1367, var93);
                                        }
                                    } else if (var11.field1223) {
                                        if (class117.field2159) {
                                            class16.method135(var13, var14, var11.field1340, var11.field1367, var93, 256 - (var15 & 0xFF));
                                        } else {
                                            class316.method2157(var13, var14, var11.field1340, var11.field1367, var93, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class117.field2159) {
                                        class16.method129(var13, var14, var11.field1340, var11.field1367, var93, 256 - (var15 & 0xFF));
                                    } else {
                                        class316.method2165(var13, var14, var11.field1340, var11.field1367, var93, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1231 == 4) {
                                    class276 var27 = var11.method590(false, class131.field2360);
                                    if (var27 != null) {
                                        class162 var28 = var11.field1370;
                                        int var29;
                                        if (class122.method991(var11, 0)) {
                                            var29 = var11.field1287;
                                            if (class289.field4863 == var11 && var11.field1347 != 0) {
                                                var29 = var11.field1347;
                                            }
                                            if (var11.field1374.method1249((byte) -118) > 0) {
                                                var28 = var11.field1374;
                                            }
                                        } else {
                                            var29 = var11.field1339;
                                            if (class289.field4863 == var11 && var11.field1248 != 0) {
                                                var29 = var11.field1248;
                                            }
                                        }
                                        if (var11.field1229 && var11.field1344 != -1) {
                                            class116 var30 = class304.method2075(var11.field1344, 4);
                                            var28 = var30.field2091;
                                            if (var28 == null) {
                                                var28 = class9.field109;
                                            }
                                            if ((var30.field2082 == 1 || var11.field1271 != 1) && var11.field1271 != -1) {
                                                var28 = class135.method1062(new class162[] { class207.field3490, var28, class243.field4041, class273.method1850(9, var11.field1271) }, true);
                                            }
                                        }
                                        if (class243.field4040 == var11) {
                                            var28 = class126.field2297;
                                            var29 = var11.field1339;
                                        }
                                        if (!var11.field1229) {
                                            var28 = class73.method528(94, var11, var28);
                                        }
                                        var27.method1887(var28, var13, var14, var11.field1340, var11.field1367, var29, var11.field1277 ? 0 : -1, var11.field1365, var11.field1255, var11.field1227);
                                    } else if (class257.field4261) {
                                        class55.method386(0, var11);
                                    }
                                } else if (var11.field1231 == 5) {
                                    if (var11.field1229) {
                                        class71 var32;
                                        if (var11.field1344 == -1) {
                                            var32 = var11.method596(false, 0);
                                        } else {
                                            var32 = class125.method1012(var11.field1344, var11.field1241, var11.field1281, 25, var11.field1271, var11.field1366);
                                        }
                                        if (var32 != null) {
                                            int var33 = var32.field1134;
                                            int var34 = var32.field1141;
                                            if (var11.field1362) {
                                                int var36 = (var11.field1367 + var34 - 1) / var34;
                                                int var37 = (var11.field1340 + var33 - 1) / var33;
                                                if (class117.field2159) {
                                                    class16.method125(var13, var14, var11.field1340 + var13, var14 - -var11.field1367);
                                                    boolean var38 = class223.method1619(var32.field1131, -108);
                                                    boolean var39 = class223.method1619(var32.field1135, -97);
                                                    class140 var40 = (class140) var32;
                                                    if (var38 && var39) {
                                                        if (var15 == 0) {
                                                            var40.method1093(var13, var14, var37, var36);
                                                        } else {
                                                            var40.method1092(var13, var14, 256 - (var15 & 0xFF), var37, var36);
                                                        }
                                                    } else if (var38) {
                                                        for (int var44 = 0; var44 < var36; var44++) {
                                                            if (var15 == 0) {
                                                                var40.method1093(var13, var34 * var44 + var14, var37, 1);
                                                            } else {
                                                                var40.method1092(var13, var34 * var44 + var14, -(var15 & 0xFF) + 256, var37, 1);
                                                            }
                                                        }
                                                    } else if (var39) {
                                                        for (int var41 = 0; var41 < var37; var41++) {
                                                            if (var15 == 0) {
                                                                var40.method1093(var33 * var41 + var13, var14, 1, var36);
                                                            } else {
                                                                var40.method1092(var33 * var41 + var13, var14, 256 - (var15 & 0xFF), 1, var36);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var42 = 0; var42 < var37; var42++) {
                                                            for (int var43 = 0; var43 < var36; var43++) {
                                                                if (var15 == 0) {
                                                                    var32.method285(var33 * var42 + var13, var34 * var43 + var14);
                                                                } else {
                                                                    var32.method514(var33 * var42 + var13, var34 * var43 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class16.method133(arg1, arg5, arg2, arg0);
                                                } else {
                                                    class316.method2163(var13, var14, var11.field1340 + var13, var14 - -var11.field1367);
                                                    for (int var45 = 0; var45 < var37; var45++) {
                                                        for (int var46 = 0; var46 < var36; var46++) {
                                                            if (var11.field1357 != 0) {
                                                                var32.method517(314936878, var33 / 2 + var13 + (var33 * var45), var34 / 2 + var14 - -(var34 * var46), var11.field1357, 4096);
                                                            } else if (var15 == 0) {
                                                                var32.method285(var33 * var45 + var13, var34 * var46 + var14);
                                                            } else {
                                                                var32.method514(var33 * var45 + var13, var34 * var46 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class316.method2168(arg1, arg5, arg2, arg0);
                                                }
                                            } else {
                                                int var35 = var11.field1340 * 4096 / var33;
                                                if (var11.field1357 != 0) {
                                                    var32.method517(314936878, var11.field1340 / 2 + var13, var11.field1367 / 2 + var14, var11.field1357, var35);
                                                } else if (var15 != 0) {
                                                    var32.method513(var13, var14, var11.field1340, var11.field1367, 256 - (var15 & 0xFF));
                                                } else if (var11.field1340 == var33 && var11.field1367 == var34) {
                                                    var32.method285(var13, var14);
                                                } else {
                                                    var32.method518(var13, var14, var11.field1340, var11.field1367);
                                                }
                                            }
                                        } else if (class257.field4261) {
                                            class55.method386(0, var11);
                                        }
                                    } else {
                                        class71 var31 = var11.method596(class122.method991(var11, 0), 0);
                                        if (var31 != null) {
                                            var31.method285(var13, var14);
                                        } else if (class257.field4261) {
                                            class55.method386(0, var11);
                                        }
                                    }
                                } else if (var11.field1231 == 6) {
                                    boolean var74 = class122.method991(var11, 0);
                                    int var75;
                                    if (var74) {
                                        var75 = var11.field1274;
                                    } else {
                                        var75 = var11.field1317;
                                    }
                                    int var76 = 0;
                                    class176 var77 = null;
                                    if (var11.field1344 != -1) {
                                        class116 var78 = class304.method2075(var11.field1344, 4);
                                        if (var78 != null) {
                                            class116 var79 = var78.method929((byte) 57, var11.field1271);
                                            class142 var80 = var75 == -1 ? null : class139.method1084(-80, var75);
                                            var77 = var79.method916(1, (byte) 127, var11.field1288, var80);
                                            if (var77 == null) {
                                                class55.method386(0, var11);
                                            } else {
                                                var76 = -var77.method46() / 2;
                                            }
                                        }
                                    } else if (var11.field1361 == 5) {
                                        if (var11.field1322 == -1) {
                                            var77 = class165.field2920.method1495(19940, -1, (class142) null, (class142) null, -1);
                                        } else {
                                            int var81 = var11.field1322 & 0x7FF;
                                            if (class263.field4390 == var81) {
                                                var81 = 2047;
                                            }
                                            class39 var82 = class270.field4520[var81];
                                            class142 var83 = var75 == -1 ? null : class139.method1084(-90, var75);
                                            if (var82 != null && ((int) var82.field611.method1256(0) << 11) == (var11.field1322 & 0xFFFFF800)) {
                                                var77 = var82.field600.method1495(19940, 0, (class142) null, var83, var11.field1288);
                                            }
                                        }
                                    } else if (var75 == -1) {
                                        var77 = var11.method585(-8341, var74, class122.field2215.field600, -1, (class142) null);
                                        if (var77 == null && class257.field4261) {
                                            class55.method386(0, var11);
                                        }
                                    } else {
                                        class142 var84 = class139.method1084(-89, var75);
                                        var77 = var11.method585(-8341, var74, class122.field2215.field600, var11.field1288, var84);
                                        if (var77 == null && class257.field4261) {
                                            class55.method386(0, var11);
                                        }
                                    }
                                    if (var77 != null) {
                                        int var85;
                                        if (var11.field1372 > 0) {
                                            var85 = (var11.field1367 << 8) / var11.field1372;
                                        } else {
                                            var85 = 256;
                                        }
                                        int var86;
                                        if (var11.field1273 <= 0) {
                                            var86 = 256;
                                        } else {
                                            var86 = (var11.field1340 << 8) / var11.field1273;
                                        }
                                        int var87 = (var11.field1262 * var86 >> 8) + var11.field1340 / 2 + var13;
                                        int var88 = var11.field1367 / 2 + (var14 + (var11.field1246 * var85 >> 8));
                                        if (class117.field2159) {
                                            if (var11.field1280) {
                                                class117.method955(var87, var88, var11.field1272, var11.field1373, var86, var85);
                                            } else {
                                                class117.method951(var87, var88, var86, var85);
                                                class117.method960((float) var11.field1299, (float) var11.field1373 * 1.5F);
                                            }
                                            class117.method966();
                                            class117.method956(true);
                                            class117.method944(false);
                                            class141.method1097(23610);
                                            if (class253.field4216) {
                                                class16.method122();
                                                class117.method947();
                                                class16.method133(arg1, arg5, arg2, arg0);
                                                class253.field4216 = false;
                                            }
                                            if (var11.field1264) {
                                                class117.method963();
                                            }
                                            int var91 = class312.field5262[var11.field1237] * var11.field1272 >> 16;
                                            int var92 = class312.field5269[var11.field1237] * var11.field1272 >> 16;
                                            if (var11.field1229) {
                                                var77.method80(0, var11.field1323, var11.field1249, var11.field1237, var11.field1327, var76 + var91 + var11.field1253, var11.field1253 + var92);
                                            } else {
                                                var77.method80(0, var11.field1323, 0, var11.field1237, 0, var91, var92);
                                            }
                                            if (var11.field1264) {
                                                class117.method968();
                                            }
                                        } else {
                                            class312.method2119(var87, var88);
                                            int var89 = class312.field5262[var11.field1237] * var11.field1272 >> 16;
                                            int var90 = class312.field5269[var11.field1237] * var11.field1272 >> 16;
                                            if (!var11.field1229) {
                                                var77.method80(0, var11.field1323, 0, var11.field1237, 0, var89, var90);
                                            } else if (var11.field1280) {
                                                ((class11) var77).method76(0, var11.field1323, var11.field1249, var11.field1237, var11.field1327, var76 + var89 + var11.field1253, var11.field1253 + var90, var11.field1272);
                                            } else {
                                                var77.method80(0, var11.field1323, var11.field1249, var11.field1237, var11.field1327, var76 + var89 + var11.field1253, var11.field1253 + var90);
                                            }
                                            class312.method2114();
                                        }
                                    }
                                } else {
                                    if (var11.field1231 == 7) {
                                        class276 var47 = var11.method590(false, class131.field2360);
                                        if (var47 == null) {
                                            if (class257.field4261) {
                                                class55.method386(0, var11);
                                            }
                                            continue;
                                        }
                                        int var48 = 0;
                                        for (int var49 = 0; var49 < var11.field1278; var49++) {
                                            for (int var50 = 0; var50 < var11.field1219; var50++) {
                                                if (var11.field1381[var48] > 0) {
                                                    class116 var51 = class304.method2075(var11.field1381[var48] - 1, 4);
                                                    class162 var52;
                                                    if (var51.field2082 != 1 && var11.field1368[var48] == 1) {
                                                        var52 = class135.method1062(new class162[] { class207.field3490, var51.field2091, class167.field2943 }, true);
                                                    } else {
                                                        var52 = class135.method1062(new class162[] { class207.field3490, var51.field2091, class243.field4041, class273.method1850(9, var11.field1368[var48]) }, true);
                                                    }
                                                    int var53 = (var11.field1257 + 115) * var50 + var13;
                                                    int var54 = var14 + ((var11.field1346 + 12) * var49);
                                                    if (var11.field1365 == 0) {
                                                        var47.method1881(var52, var53, var54, var11.field1339, var11.field1277 ? 0 : -1);
                                                    } else if (var11.field1365 == 1) {
                                                        var47.method1884(var52, var53 + 57, var54, var11.field1339, var11.field1277 ? 0 : -1);
                                                    } else {
                                                        var47.method1873(var52, var53 + 114, var54, var11.field1339, var11.field1277 ? 0 : -1);
                                                    }
                                                }
                                                var48++;
                                            }
                                        }
                                    }
                                    if (var11.field1231 == 8 && class70.field1111 == var11 && class317.field5337 == class290.field4894) {
                                        int var55 = 0;
                                        int var56 = 0;
                                        class162 var57 = var11.field1370;
                                        class276 var58 = class286.field4831;
                                        class162 var59 = class73.method528(113, var11, var57);
                                        while (var59.method1249((byte) -118) > 0) {
                                            int var60 = var59.method1244((byte) 23, class273.field4540);
                                            class162 var61;
                                            if (var60 == -1) {
                                                var61 = var59;
                                                var59 = class244.field4053;
                                            } else {
                                                var61 = var59.method1283(0, var60, (byte) 109);
                                                var59 = var59.method1254((byte) 95, var60 + 4);
                                            }
                                            int var62 = var58.method1896(var61);
                                            if (var56 < var62) {
                                                var56 = var62;
                                            }
                                            var55 += var58.field4606 + 1;
                                        }
                                        var56 += 6;
                                        var55 += 7;
                                        int var63 = var14 + var11.field1367 + 5;
                                        if ((var63 + var55) > arg0) {
                                            var63 = arg0 - var55;
                                        }
                                        int var64 = var11.field1340 + var13 - var56 - 5;
                                        if ((var13 + 5) > var64) {
                                            var64 = var13 + 5;
                                        }
                                        if ((var64 + var56) > arg2) {
                                            var64 = arg2 - var56;
                                        }
                                        if (class117.field2159) {
                                            class16.method124(var64, var63, var56, var55, 16777120);
                                            class16.method128(var64, var63, var56, var55, 0);
                                        } else {
                                            class316.method2174(var64, var63, var56, var55, 16777120);
                                            class316.method2160(var64, var63, var56, var55, 0);
                                        }
                                        int var65 = var58.field4606 + var63 + 2;
                                        class162 var66 = var11.field1370;
                                        class162 var67 = class73.method528(112, var11, var66);
                                        while (var67.method1249((byte) -118) > 0) {
                                            int var68 = var67.method1244((byte) 23, class273.field4540);
                                            class162 var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = class244.field4053;
                                            } else {
                                                var69 = var67.method1283(0, var68, (byte) 89);
                                                var67 = var67.method1254((byte) 95, var68 + 4);
                                            }
                                            var58.method1881(var69, var64 + 3, var65, 0, -1);
                                            var65 += var58.field4606 + 1;
                                        }
                                    }
                                    if (var11.field1231 == 9) {
                                        int var70;
                                        int var71;
                                        int var72;
                                        int var73;
                                        if (var11.field1345) {
                                            var70 = var14;
                                            var73 = var13;
                                            var72 = var11.field1367 + var14;
                                            var71 = var11.field1340 + var13;
                                        } else {
                                            var70 = var11.field1367 + var14;
                                            var71 = var11.field1340 + var13;
                                            var72 = var14;
                                            var73 = var13;
                                        }
                                        if (var11.field1343 == 1) {
                                            if (class117.field2159) {
                                                class16.method132(var73, var72, var71, var70, var11.field1339);
                                            } else {
                                                class316.method2158(var73, var72, var71, var70, var11.field1339);
                                            }
                                        } else if (class117.field2159) {
                                            class16.method130(var73, var72, var71, var70, var11.field1339, var11.field1343);
                                        } else {
                                            class316.method2169(var73, var72, var71, var70, var11.field1339, var11.field1343);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg7 >= -105) {
            method786(-53);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBII)I", line = 1262)
    public static final int method785(int arg0, byte arg1, int arg2, int arg3) {
        field1775++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        }
        if (arg1 != 30) {
            field1783 = (class162) null;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 1299)
    public static void method786(int arg0) {
        field1783 = null;
        field1781 = null;
        field1787 = null;
        field1773 = null;
        field1779 = null;
        if (arg0 <= -76) {
            field1785 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 1327)
    public static final void method787(int arg0) {
        if (arg0 != -1) {
            field1773 = (class162) null;
        }
        class216.field3612.method1529(false);
        field1776++;
    }
}
