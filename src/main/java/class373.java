import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class373 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public int field5446 = 0;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field5444 = 0;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public int field5449 = 2048;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public int field5452 = 2048;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field5445 = 0;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5451 = "red:";

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field5455 = 500;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILbk;I)V", line = 4)
    public final void method2340(int arg0, class211 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1342((byte) -128);
            if (var4 == 0) {
                field5448++;
                int var5 = -65 % ((arg0 + 64) / 46);
                return;
            }
            this.method2345(arg1, arg2, 12585, var4);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)I", line = 27)
    public static final int method2341(int arg0, int arg1) {
        if (arg1 < 71) {
            field5451 = null;
        }
        field5454++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 38)
    public static final void method2342(byte arg0) {
        if (class217.field2971 > 0) {
            class217.field2971--;
        }
        if (class99.field1117 > 1) {
            class256.field3434 = class418.field6013;
            class99.field1117--;
        }
        field5453++;
        if (class369.field5415) {
            class369.field5415 = false;
            class450.method2801(true);
            return;
        }
        if (!class81.field903) {
            class448.method2780(true);
        }
        for (int var1 = 0; var1 < 100 && class311.method1952(false); var1++) {
        }
        if (class105.field1191 != 30) {
            return;
        }
        class287.method1828(48, (byte) -65, class169.field2360);
        Object var2 = class71.field806.field231;
        synchronized (class71.field806.field231) {
            if (!class278.field3917) {
                class71.field806.field236 = 0;
            } else if (class353.field5154 != 0 || class71.field806.field236 >= 40) {
                class169.field2360.method809(216, -28022);
                class173.field2408++;
                class169.field2360.method1396(21375, 0);
                int var3 = class169.field2360.field2888;
                int var4 = 0;
                for (int var5 = 0; class71.field806.field236 > var5 && class169.field2360.field2888 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class71.field806.field237[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class71.field806.field235[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class71.field806.field237[var5] == -1 && class71.field806.field235[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class55.field626 != var7 || class144.field2037 != var6) {
                        int var9 = var7 - class55.field626;
                        class55.field626 = var7;
                        int var10 = var6 - class144.field2037;
                        class144.field2037 = var6;
                        if (class335.field4957 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class169.field2360.method1380((class335.field4957 << 12) + (var9 << 6) + var10, (byte) -8);
                            class335.field4957 = 0;
                        } else if (class335.field4957 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class169.field2360.method1396(21375, class335.field4957 + 128);
                            class169.field2360.method1380((var9 << 8) + var10, (byte) -8);
                            class335.field4957 = 0;
                        } else if (class335.field4957 < 32) {
                            class169.field2360.method1396(21375, class335.field4957 + 192);
                            if (var8) {
                                class169.field2360.method1361((byte) -123, Integer.MIN_VALUE);
                            } else {
                                class169.field2360.method1361((byte) -128, var6 << 16 | var7);
                            }
                            class335.field4957 = 0;
                        } else {
                            class169.field2360.method1380(class335.field4957 + 57344, (byte) -8);
                            if (var8) {
                                class169.field2360.method1361((byte) -128, Integer.MIN_VALUE);
                            } else {
                                class169.field2360.method1361((byte) -126, var7 | var6 << 16);
                            }
                            class335.field4957 = 0;
                        }
                    } else if (class335.field4957 < 2047) {
                        class335.field4957++;
                    }
                }
                class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var3);
                if (class71.field806.field236 > var4) {
                    class71.field806.field236 -= var4;
                    for (int var11 = 0; var11 < class71.field806.field236; var11++) {
                        class71.field806.field235[var11] = class71.field806.field235[var4 + var11];
                        class71.field806.field237[var11] = class71.field806.field237[var4 + var11];
                    }
                } else {
                    class71.field806.field236 = 0;
                }
            }
        }
        if (class353.field5154 != 0) {
            long var12 = (class350.field5117 - class24.field244) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class24.field244 = class350.field5117;
            int var14 = class124.field1643;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class302.field4326;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class353.field5154 == 2) {
                var16 = 1;
            }
            class169.field2360.method809(59, -28022);
            int var17 = (int) var12;
            class207.field2817++;
            class169.field2360.method1354(var16 << 15 | var17, 124);
            class169.field2360.method1361((byte) -120, var14 << 16 | var15);
        }
        if (class135.field1902 > 0) {
            class135.field1902--;
        }
        if (class404.field5889 && class135.field1902 <= 0) {
            class146.field2049++;
            class404.field5889 = false;
            class135.field1902 = 20;
            class169.field2360.method809(197, -28022);
            class169.field2360.method1354((int) class135.field1886 >> 3, 114);
            class169.field2360.method1354((int) class276.field3893 >> 3, 112);
        }
        if (class442.field6467 && !class262.field3623) {
            class392.field5739++;
            class262.field3623 = true;
            class169.field2360.method809(86, -28022);
            class169.field2360.method1396(21375, 1);
        }
        if (!class442.field6467 && class262.field3623) {
            class262.field3623 = false;
            class392.field5739++;
            class169.field2360.method809(86, -28022);
            class169.field2360.method1396(21375, 0);
        }
        if (!class174.field2418) {
            class169.field2360.method809(91, -28022);
            class377.field5526++;
            class169.field2360.method1361((byte) -127, class338.method2177(-94));
            class174.field2418 = true;
        }
        if (class442.field6457) {
            class442.field6457 = false;
        } else {
            class102.field1155 /= 2.0F;
        }
        if (class206.field2803) {
            class206.field2803 = false;
        } else {
            class8.field107 /= 2.0F;
        }
        class115.method638((byte) 102);
        if (class105.field1191 != 30) {
            return;
        }
        class149.method888(8382);
        class218.method1429(1);
        class244.method1541(-26064);
        class158.field2236++;
        if (class158.field2236 > 750) {
            class450.method2801(true);
            return;
        }
        class57.method353(0);
        class168.method1111(-1);
        class159.method1047((byte) -66);
        for (int var18 = class233.method1487(-125, true); var18 != -1; var18 = class233.method1487(32, false)) {
            class388.method2477(var18, 3504);
            class274.field3875[class40.method253(31, class25.field247++)] = var18;
        }
        for (class348 var19 = class420.method2606(0); var19 != null; var19 = class420.method2606(0)) {
            int var20 = var19.method2219(-53);
            int var21 = var19.method2218((byte) 92);
            if (var20 == 1) {
                class160.field2272[var21] = var19.field5093;
                class400.field5811 |= class148.field2087[var21];
                class114.field1325[class40.method253(class179.field2468++, 31)] = var21;
            } else if (var20 == 2) {
                class226.field3082[var21] = var19.field5087;
                class95.field1066[class40.method253(class307.field4398++, 31)] = var21;
            } else if (var20 == 3) {
                class119 var22 = class179.method1170(var21, 818041328);
                if (!var19.field5087.equals(var22.field1536)) {
                    var22.field1536 = var19.field5087;
                    class101.method543((byte) 94, var22);
                }
            } else if (var20 == 4) {
                class119 var40 = class179.method1170(var21, 818041328);
                int var41 = var19.field5093;
                int var42 = var19.field5091;
                int var43 = var19.field5094;
                if (var40.field1571 != var41 || var40.field1520 != var42 || var40.field1569 != var43) {
                    var40.field1569 = var43;
                    var40.field1520 = var42;
                    var40.field1571 = var41;
                    class101.method543((byte) 64, var40);
                }
            } else if (var20 == 5) {
                class119 var23 = class179.method1170(var21, 818041328);
                if (var19.field5093 != var23.field1441 || var19.field5093 == -1) {
                    var23.field1561 = 0;
                    var23.field1447 = 0;
                    var23.field1441 = var19.field5093;
                    var23.field1470 = 1;
                    class101.method543((byte) -122, var23);
                }
            } else if (var20 == 6) {
                int var34 = var19.field5093;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = (var34 & 0x3F7) >> 5;
                int var37 = var34 & 0x1F;
                int var38 = (var37 << 3) + (var35 << 19) + (var36 << 11);
                class119 var39 = class179.method1170(var21, 818041328);
                if (var39.field1489 != var38) {
                    var39.field1489 = var38;
                    class101.method543((byte) -108, var39);
                }
            } else if (var20 == 7) {
                class119 var32 = class179.method1170(var21, 818041328);
                boolean var33 = var19.field5093 == 1;
                if (var32.field1503 != var33) {
                    var32.field1503 = var33;
                    class101.method543((byte) -85, var32);
                }
            } else if (var20 == 8) {
                class119 var24 = class179.method1170(var21, 818041328);
                if (var19.field5093 != var24.field1439 || var19.field5091 != var24.field1522 || var19.field5094 != var24.field1510) {
                    var24.field1510 = var19.field5094;
                    var24.field1522 = var19.field5091;
                    var24.field1439 = var19.field5093;
                    if (var24.field1597 != -1) {
                        if (var24.field1532 > 0) {
                            var24.field1510 = var24.field1510 * 32 / var24.field1532;
                        } else if (var24.field1461 > 0) {
                            var24.field1510 = var24.field1510 * 32 / var24.field1461;
                        }
                    }
                    class101.method543((byte) 68, var24);
                }
            } else if (var20 == 9) {
                class119 var31 = class179.method1170(var21, 818041328);
                if (var19.field5093 != var31.field1597 || var19.field5091 != var31.field1429) {
                    var31.field1597 = var19.field5093;
                    var31.field1429 = var19.field5091;
                    class101.method543((byte) 28, var31);
                }
            } else if (var20 == 10) {
                class119 var25 = class179.method1170(var21, 818041328);
                if (var19.field5093 != var25.field1481 || var19.field5091 != var25.field1534 || var19.field5094 != var25.field1446) {
                    var25.field1446 = var19.field5094;
                    var25.field1481 = var19.field5093;
                    var25.field1534 = var19.field5091;
                    class101.method543((byte) 99, var25);
                }
            } else if (var20 == 11) {
                class119 var30 = class179.method1170(var21, 818041328);
                var30.field1487 = 0;
                var30.field1562 = var30.field1499 = var19.field5091;
                var30.field1448 = var30.field1414 = var19.field5093;
                var30.field1547 = 0;
                class101.method543((byte) -123, var30);
            } else if (var20 == 12) {
                class119 var28 = class179.method1170(var21, 818041328);
                int var29 = var19.field5093;
                if (var28 != null && var28.field1535 == 0) {
                    if ((var28.field1593 - var28.field1498) < var29) {
                        var29 = var28.field1593 - var28.field1498;
                    }
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    if (var28.field1467 != var29) {
                        var28.field1467 = var29;
                        class101.method543((byte) -77, var28);
                    }
                }
            } else if (var20 == 13) {
                class119 var27 = class179.method1170(var21, 818041328);
                var27.field1576 = var19.field5093;
            } else if (var20 == 14) {
                class119 var26 = class179.method1170(var21, 818041328);
                var26.field1530 = var19.field5093;
            } else if (var20 == 15) {
                class450.field6576 = var19.field5093;
                class196.field2658 = true;
                class435.field6384 = var19.field5091;
            }
        }
        class245.field3329++;
        if (class94.field1038 != 0) {
            class105.field1194 += 20;
            if (class105.field1194 >= 400) {
                class94.field1038 = 0;
            }
        }
        if (class96.field1071 != null) {
            class256.field3439++;
            if (class256.field3439 >= 15) {
                class101.method543((byte) 52, class96.field1071);
                class96.field1071 = null;
            }
        }
        class119 var44 = class193.field2639;
        class193.field2639 = null;
        class119 var45 = class272.field3849;
        class19.field203 = false;
        class170.field2378 = false;
        class12.field127 = 0;
        class272.field3849 = null;
        class376.field5507 = null;
        while (class115.method641((byte) -113) && class12.field127 < 128) {
            if (!class189.method1205((byte) -112) || class295.field4219 != '`' && class295.field4219 != '§') {
                class191.field2599[class12.field127] = class343.field5052;
                class392.field5737[class12.field127] = class295.field4219;
                class12.field127++;
            } else if (class349.method2225(128)) {
                class372.method2338(80);
            } else {
                class402.method2546(-70);
            }
        }
        if (class349.method2225(128)) {
            class437.method2716(5411);
        }
        class38.field390 = null;
        class311.method1951(-1, (class119) null, -1, (byte) -71);
        class248.method1559((class119) null, 0, -1, -1);
        if (class424.field6086 != -1) {
            class166.method1100(0, class424.field6086, 0, class38.field389, false, 0, class222.field3039, 0);
        }
        class418.field6013++;
        if (class38.field390 != null) {
            class211.method1348((byte) 18);
        }
        if (class56.field635) {
            class169.field2360.method809(226, -28022);
            class421.field6050++;
            class169.field2360.method1361((byte) -124, class249.field3395 | class98.field1097 << 14 | class164.field2291 << 28);
            class56.field635 = false;
        }
        while (true) {
            class191 var46;
            class119 var47;
            class119 var48;
            do {
                var46 = (class191) class383.field5617.method1112(-1);
                if (var46 == null) {
                    while (true) {
                        class191 var49;
                        class119 var50;
                        class119 var51;
                        do {
                            var49 = (class191) class140.field1986.method1112(-1);
                            if (var49 == null) {
                                while (true) {
                                    class191 var52;
                                    class119 var53;
                                    class119 var54;
                                    do {
                                        var52 = (class191) class364.field5293.method1112(-1);
                                        if (var52 == null) {
                                            if (arg0 < 17) {
                                                field5443 = 7;
                                            }
                                            if (class38.field390 == null) {
                                                class366.field5338 = 0;
                                            }
                                            if (class193.field2632 != null) {
                                                class266.method1699(false);
                                            }
                                            if (class56.field642 > 0 && class256.field3447[82] && class256.field3447[81] && class247.field3357 != 0) {
                                                int var55 = class410.field5931 - class247.field3357;
                                                if (var55 < 0) {
                                                    var55 = 0;
                                                } else if (var55 > 3) {
                                                    var55 = 3;
                                                }
                                                class153.method920((byte) -84, class390.field5715.field6350[0] + class217.field2975, var55, class390.field5715.field6351[0] + class40.field427);
                                            }
                                            class356.method2272((byte) 119);
                                            if (class189.field2571 != null) {
                                                class101.method543((byte) -89, class189.field2571);
                                                class444.field6482++;
                                                if (class57.field654 > class98.field1098 + 5 || class57.field654 < class98.field1098 - 5 || (class222.field3037 + 5) < class48.field562 || class222.field3037 - 5 > class48.field562) {
                                                    class186.field2525 = true;
                                                }
                                                if (class137.field1922 == 0) {
                                                    if (class186.field2525 && class444.field6482 >= 5) {
                                                        if (class66.field753 == class189.field2571 && class385.field5637 != class217.field2977) {
                                                            class119 var56 = class189.field2571;
                                                            byte var57 = 0;
                                                            if (class147.field2060 == 1 && var56.field1538 == 206) {
                                                                var57 = 1;
                                                            }
                                                            if (var56.field1580[class385.field5637] <= 0) {
                                                                var57 = 0;
                                                            }
                                                            if (var57 == 1) {
                                                                int var58 = class217.field2977;
                                                                int var59 = class385.field5637;
                                                                while (var58 != var59) {
                                                                    if (var59 < var58) {
                                                                        var56.method673((byte) -114, var58 - 1, var58);
                                                                        var58--;
                                                                    } else if (var58 < var59) {
                                                                        var56.method673((byte) -117, var58 + 1, var58);
                                                                        var58++;
                                                                    }
                                                                }
                                                            } else {
                                                                var56.method673((byte) -127, class385.field5637, class217.field2977);
                                                            }
                                                            class262.field3610++;
                                                            class169.field2360.method809(223, -28022);
                                                            class169.field2360.method1361((byte) -127, class189.field2571.field1424);
                                                            class169.field2360.method1345(0, var57);
                                                            class169.field2360.method1371(class385.field5637, 29594);
                                                            class169.field2360.method1371(class217.field2977, 29594);
                                                        }
                                                    } else if ((class354.field5175 == 1 || class247.method1555(0)) && class433.field6324 > 2) {
                                                        class135.method805(true);
                                                    } else if (class231.method1474(-1)) {
                                                        class246.method1554((byte) -125);
                                                    }
                                                    class353.field5154 = 0;
                                                    class256.field3439 = 10;
                                                    class189.field2571 = null;
                                                }
                                            }
                                            if (class193.field2639 != var44) {
                                                if (var44 != null) {
                                                    class101.method543((byte) 13, var44);
                                                }
                                                if (class193.field2639 != null) {
                                                    class101.method543((byte) 50, class193.field2639);
                                                }
                                            }
                                            if (class272.field3849 != var45 && class143.field2027 == class100.field1119) {
                                                if (var45 != null) {
                                                    class101.method543((byte) 22, var45);
                                                }
                                                if (class272.field3849 != null) {
                                                    class101.method543((byte) 125, class272.field3849);
                                                }
                                            }
                                            if (class272.field3849 == null) {
                                                if (class143.field2027 > 0) {
                                                    class143.field2027--;
                                                }
                                            } else if (class143.field2027 < class100.field1119) {
                                                class143.field2027++;
                                                if (class143.field2027 == class100.field1119) {
                                                    class101.method543((byte) -96, class272.field3849);
                                                }
                                            }
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class435.field6377[var60]++;
                                            }
                                            int var61 = class303.method1908(22838);
                                            int var62 = class384.method2458(0);
                                            if (var61 > 15000 && var62 > 15000) {
                                                class217.field2971 = 250;
                                                class354.field5187++;
                                                class448.method2781(14500, 1);
                                                class169.field2360.method809(9, -28022);
                                            }
                                            if (class400.field5811 && class203.method1299((byte) 5) - 60000L > class193.field2642) {
                                                class308.method1927((byte) 125);
                                            }
                                            class367.field5360++;
                                            if (class367.field5360 > 500) {
                                                class367.field5360 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class51.field591 += class97.field1092;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class266.field3721 += class423.field6077;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class393.field5742 += class137.field1951;
                                                }
                                            }
                                            if (class51.field591 < -50) {
                                                class97.field1092 = 2;
                                            }
                                            if (class393.field5742 < -55) {
                                                class137.field1951 = 2;
                                            }
                                            if (class51.field591 > 50) {
                                                class97.field1092 = -2;
                                            }
                                            if (class266.field3721 < -40) {
                                                class423.field6077 = 1;
                                            }
                                            if (class393.field5742 > 55) {
                                                class137.field1951 = -2;
                                            }
                                            if (class266.field3721 > 40) {
                                                class423.field6077 = -1;
                                            }
                                            class249.field3393++;
                                            if (class249.field3393 > 500) {
                                                class249.field3393 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class260.field3585 += class218.field2989;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class164.field2288 += class6.field74;
                                                }
                                            }
                                            if (class260.field3585 < -60) {
                                                class218.field2989 = 2;
                                            }
                                            if (class164.field2288 < -20) {
                                                class6.field74 = 1;
                                            }
                                            if (class260.field3585 > 60) {
                                                class218.field2989 = -2;
                                            }
                                            class269.field3790++;
                                            if (class164.field2288 > 10) {
                                                class6.field74 = -1;
                                            }
                                            if (class269.field3790 > 50) {
                                                class108.field1245++;
                                                class169.field2360.method809(111, -28022);
                                            }
                                            if (class252.field3407) {
                                                class260.method1633(false);
                                                class252.field3407 = false;
                                            }
                                            try {
                                                if (class330.field4719 != null && class169.field2360.field2888 > 0) {
                                                    class330.field4719.method1511(class169.field2360.field2888, 28067, 0, class169.field2360.field2867);
                                                    class169.field2360.field2888 = 0;
                                                    class269.field3790 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class450.method2801(true);
                                                return;
                                            }
                                        }
                                        var53 = var52.field2605;
                                        if (var53.field1495 < 0) {
                                            break;
                                        }
                                        var54 = class179.method1170(var53.field1529, 818041328);
                                    } while (var54 == null || var54.field1460 == null || var53.field1495 >= var54.field1460.length || var54.field1460[var53.field1495] != var53);
                                    class387.method2471(var52);
                                }
                            }
                            var50 = var49.field2605;
                            if (var50.field1495 < 0) {
                                break;
                            }
                            var51 = class179.method1170(var50.field1529, 818041328);
                        } while (var51 == null || var51.field1460 == null || var51.field1460.length <= var50.field1495 || var51.field1460[var50.field1495] != var50);
                        class387.method2471(var49);
                    }
                }
                var47 = var46.field2605;
                if (var47.field1495 < 0) {
                    break;
                }
                var48 = class179.method1170(var47.field1529, 818041328);
            } while (var48 == null || var48.field1460 == null || var47.field1495 >= var48.field1460.length || var48.field1460[var47.field1495] != var47);
            class387.method2471(var46);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I", line = 999)
    public static final int method2343(int arg0, int arg1, int arg2) {
        if (arg1 != 30426) {
            method2343(94, 64, 5);
        }
        field5442++;
        int var3 = arg0 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 1015)
    public static void method2344(int arg0) {
        if (arg0 != 1) {
            method2342((byte) 82);
        }
        field5451 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lbk;III)V", line = 1046)
    private final void method2345(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field5446 = arg0.method1342((byte) -128);
        } else if (arg3 == 2) {
            this.field5452 = arg0.method1355(arg2 ^ 0x4CA1);
        } else if (arg3 == 3) {
            this.field5449 = arg0.method1355(32136);
        } else if (arg3 == 4) {
            this.field5444 = arg0.method1344((byte) -4);
        }
        if (arg2 != 12585) {
            field5445 = -100;
        }
        field5447++;
    }
}
