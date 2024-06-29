import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class97 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field1467 = new int[50];

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1468 = 1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[Leb;II)V")
    public static final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class103[] arg7, int arg8, int arg9) {
        if (arg5 != 10) {
            return;
        }
        class63.method494(arg8, arg6, arg1, arg4);
        class145.method997();
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class103 var11 = arg7[var10];
            if (var11 != null && (var11.field1602 == arg0 || arg0 == -1412584499 && class238.field3815 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class186.field2989[class154.field2482] = var11.field1679 + arg3;
                    class236.field3767[class154.field2482] = var11.field1707 + arg9;
                    class85.field1153[class154.field2482] = var11.field1691;
                    class233.field3710[class154.field2482] = var11.field1693;
                    var12 = class154.field2482++;
                } else {
                    var12 = arg2;
                }
                var11.field1667 = class9.field141;
                var11.field1564 = var12;
                if (!var11.field1603 || !client.method1506(var11)) {
                    if (var11.field1716 > 0) {
                        class6.method39(var11, 5);
                    }
                    int var13 = var11.field1658;
                    int var14 = var11.field1707 + arg9;
                    int var15 = var11.field1679 + arg3;
                    if (class178.field2891 && (client.method1511(var11).field350 != 0 || var11.field1655 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class238.field3815 == var11) {
                        if (arg0 != -1412584499 && !var11.field1571) {
                            class113.field1955 = arg7;
                            class151.field2453 = arg3;
                            class82.field1137 = arg9;
                            continue;
                        }
                        if (class78.field1069 && class44.field524) {
                            int var16 = class109.field1893;
                            int var17 = var16 - class278.field4454;
                            if (class206.field3305 > var17) {
                                var17 = class206.field3305;
                            }
                            if ((class206.field3305 + class264.field4212.field1691) < (var11.field1691 + var17)) {
                                var17 = class206.field3305 + class264.field4212.field1691 - var11.field1691;
                            }
                            var15 = var17;
                            int var18 = class250.field4000;
                            int var19 = var18 - class230.field3662;
                            if (class44.field528 > var19) {
                                var19 = class44.field528;
                            }
                            if (class44.field528 + class264.field4212.field1693 < var19 - -var11.field1693) {
                                var19 = class44.field528 + class264.field4212.field1693 - var11.field1693;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1571) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1655 == 2) {
                        var20 = arg1;
                        var21 = arg6;
                        var22 = arg4;
                        var23 = arg8;
                    } else {
                        int var24 = var11.field1691 + var15;
                        var23 = arg8 >= var15 ? arg8 : var15;
                        var21 = var14 > arg6 ? var14 : arg6;
                        int var25 = var11.field1693 + var14;
                        if (var11.field1655 == 9) {
                            var24++;
                            var25++;
                        }
                        var22 = var25 >= arg4 ? arg4 : var25;
                        var20 = var24 < arg1 ? var24 : arg1;
                    }
                    if (!var11.field1603 || var23 < var20 && var22 > var21) {
                        if (var11.field1716 != 0) {
                            if (var11.field1716 == 1337 || var11.field1716 == 1403) {
                                class25.field306 = var14;
                                class207.field3338 = var15;
                                class191.field3056 = var11;
                                class254.method1662(var14, 127, var11.field1693, var11.field1716 == 1403, var11.field1691, var15);
                                class272.field4396[var12] = true;
                                class63.method494(arg8, arg6, arg1, arg4);
                                continue;
                            }
                            if (var11.field1716 == 1338) {
                                if (!var11.method731(arg5 + 30824)) {
                                    continue;
                                }
                                class124.method862(var11, var14, (byte) 118, var12, var15);
                                class63.method494(arg8, arg6, arg1, arg4);
                                if (class52.field742 != 0 && class52.field742 != 3 || class240.field3852 || class120.field2031 < var23 || var21 > class104.field1752 || var20 <= class120.field2031 || var22 <= class104.field1752) {
                                    continue;
                                }
                                int var26 = class120.field2031 - var15;
                                int var27 = class104.field1752 - var14;
                                int var28 = var11.field1711[var27];
                                if (var28 > var26 || var26 > (var28 + var11.field1617[var27])) {
                                    continue;
                                }
                                int var29 = var27 - var11.field1693 / 2;
                                int var30 = var26 - var11.field1691 / 2;
                                int var31 = (int) class121.field2039 + class93.field1330 & 0x7FF;
                                int var32 = class145.field2338[var31];
                                int var33 = (class77.field1050 + 256) * var32 >> 8;
                                int var34 = class145.field2348[var31];
                                int var35 = (class77.field1050 + 256) * var34 >> 8;
                                int var36 = var29 * var35 - (var30 * var33) >> 11;
                                int var37 = var29 * var33 + (var30 * var35) >> 11;
                                int var38 = var37 + class197.field3179.field614 - ((class197.field3179.method385((byte) -74) + -1) * 64) >> 7;
                                int var39 = class197.field3179.field613 + 64 - var36 - (class197.field3179.method385((byte) 83) * 64) >> 7;
                                if (class290.field4632 && (class125.field2098 & 0x40) != 0) {
                                    class103 var40 = class122.method859(class221.field3526, (byte) -108, class254.field4063);
                                    if (var40 == null) {
                                        class238.method1566(-101);
                                    } else {
                                        class38.method301(var38, class117.field1995, " ->", (short) 12, class17.field201, arg5 ^ 0x4D, 1L, var39);
                                    }
                                    continue;
                                }
                                if (class189.field3026 == 1) {
                                    class38.method301(var38, class193.field3104, "", (short) 22, -1, 124, 1L, var39);
                                }
                                class38.method301(var38, class186.field2981, "", (short) 7, -1, arg5 + 60, 1L, var39);
                                continue;
                            }
                            if (var11.field1716 == 1339) {
                                if (var11.method731(30834)) {
                                    class81.method599(var15, 2, var14, var12, var11);
                                    class63.method494(arg8, arg6, arg1, arg4);
                                }
                                continue;
                            }
                            if (var11.field1716 == 1400) {
                                class275.method1853(var11.field1691, var11.field1693, var15, 29677, var14);
                                class272.field4396[var12] = true;
                                class217.field3482[var12] = true;
                                class63.method494(arg8, arg6, arg1, arg4);
                                continue;
                            }
                            if (var11.field1716 == 1401) {
                                class152.method1030(var14, var15, var11.field1691, var11.field1693, -43);
                                class272.field4396[var12] = true;
                                class217.field3482[var12] = true;
                                class63.method494(arg8, arg6, arg1, arg4);
                                continue;
                            }
                            if (var11.field1716 == 1402) {
                                class41.method315((byte) 109, var14, var15);
                                class272.field4396[var12] = true;
                                class217.field3482[var12] = true;
                                continue;
                            }
                            if (var11.field1716 == 1405) {
                                if (!class279.field4470) {
                                    continue;
                                }
                                int var41 = var11.field1691 + var15;
                                int var42 = var14 + 15;
                                int var43 = 16776960;
                                class58.field809.method1118("Fps:" + class130.field2179, var41, var42, 16776960, -1);
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = 0;
                                int var46 = 0;
                                int var47 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                int var131 = var42 + 15;
                                if (var47 > 65536) {
                                    var43 = 16711680;
                                }
                                class58.field809.method1118("Mem:" + var47 + "k", var41, var131, var43, -1);
                                var42 = var131 + 15;
                                int var48 = 0;
                                for (int var49 = 0; var49 < 29; var49++) {
                                    var45 += class290.field4629[var49].method1313(255);
                                    var48 += class290.field4629[var49].method1312(51);
                                    var46 += class290.field4629[var49].method1315(false);
                                }
                                int var50 = 16776960;
                                int var51 = var48 * 10000 / var45;
                                int var52 = var46 * 100 / var45;
                                String var53 = "Cache:" + class215.method1438(2, (long) var51, true, 10, 0) + "% (" + var52 + "%)";
                                class122.field2050.method1118(var53, var41, var42, var50, -1);
                                class272.field4396[var12] = true;
                                var42 += 12;
                                class217.field3482[var12] = true;
                                continue;
                            }
                            if (var11.field1716 == 1406) {
                                class30.field371 = var15;
                                class184.field2939 = var11;
                                class119.field2010 = var14;
                                continue;
                            }
                        }
                        if (!class240.field3852) {
                            if (var11.field1655 == 0 && var11.field1651 && var23 <= class120.field2031 && class104.field1752 >= var21 && var20 > class120.field2031 && class104.field1752 < var22 && !class178.field2891) {
                                class202.field3248 = 1;
                                class23.field291[0] = 1001;
                                class3.field36[0] = class238.field3797;
                                class152.field2464[0] = class184.field2935;
                                class162.field2633[0] = "";
                            }
                            if (var23 <= class120.field2031 && var21 <= class104.field1752 && var20 > class120.field2031 && var22 > class104.field1752) {
                                class199.method1342(class120.field2031 - var15, -var14 + class104.field1752, 3, var11);
                            }
                        }
                        if (var11.field1655 == 0) {
                            if (!var11.field1603 && client.method1506(var11) && class268.field4348 != var11) {
                                continue;
                            }
                            if (!var11.field1603) {
                                if (var11.field1639 > (var11.field1561 - var11.field1693)) {
                                    var11.field1639 = var11.field1561 - var11.field1693;
                                }
                                if (var11.field1639 < 0) {
                                    var11.field1639 = 0;
                                }
                            }
                            method695(var11.field1659, var20, var12, var15 - var11.field1590, var22, 10, var21, arg7, var23, var14 - var11.field1639);
                            if (var11.field1624 != null) {
                                method695(var11.field1659, var20, var12, var15 - var11.field1590, var22, arg5, var21, var11.field1624, var23, var14 - var11.field1639);
                            }
                            class128 var54 = (class128) class294.field4656.method457((long) var11.field1659, (byte) -115);
                            if (var54 != null) {
                                if (var54.field2137 == 0 && !class240.field3852 && class120.field2031 >= var23 && var21 <= class104.field1752 && class120.field2031 < var20 && class104.field1752 < var22 && !class178.field2891) {
                                    class3.field36[0] = class238.field3797;
                                    class202.field3248 = 1;
                                    class152.field2464[0] = class184.field2935;
                                    class162.field2633[0] = "";
                                    class23.field291[0] = 1001;
                                }
                                class237.method1558(var15, var54.field2135, (byte) 86, var20, var21, var12, var22, var23, var14);
                            }
                            class63.method494(arg8, arg6, arg1, arg4);
                            class145.method997();
                        }
                        if (class203.field3265[var12] || class87.field1186 > 1) {
                            if (var11.field1655 == 0 && !var11.field1603 && var11.field1561 > var11.field1693) {
                                class195.method1322(var11.field1561, arg5 ^ 0xA, var11.field1691 + var15, var14, var11.field1693, var11.field1639);
                            }
                            if (var11.field1655 != 1) {
                                if (var11.field1655 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field1626; var56++) {
                                        for (int var57 = 0; var57 < var11.field1597; var57++) {
                                            int var58 = (var11.field1555 + 32) * var56 + var14;
                                            int var59 = (var11.field1569 + 32) * var57 + var15;
                                            if (var55 < 20) {
                                                var59 += var11.field1566[var55];
                                                var58 += var11.field1662[var55];
                                            }
                                            if (var11.field1547[var55] > 0) {
                                                boolean var61 = false;
                                                int var62 = var11.field1547[var55] - 1;
                                                boolean var63 = false;
                                                if (var59 + 32 > arg8 && var59 < arg1 && (var58 + 32) > arg6 && arg4 > var58 || class258.field4114 == var11 && class205.field3291 == var55) {
                                                    class271 var64;
                                                    if (class262.field4151 == 1 && class85.field1157 == var55 && class42.field496 == var11.field1659) {
                                                        var64 = class203.method1362(var62, (class95) null, var11.field1557, var11.field1592[var55], 0, 2, 925569457);
                                                    } else {
                                                        var64 = class203.method1362(var62, (class95) null, var11.field1557, var11.field1592[var55], 3153952, 1, arg5 ^ 0x372B11BB);
                                                    }
                                                    if (class145.field2341) {
                                                        class272.field4396[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class45.method346((byte) 122, var11);
                                                    } else if (class258.field4114 == var11 && class205.field3291 == var55) {
                                                        int var65 = class250.field4000 - class160.field2602;
                                                        int var66 = class109.field1893 - class92.field1308;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class147.field2382 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method167(var59 + var66, var58 + var65, 128);
                                                        if (arg0 != -1) {
                                                            int var67 = class63.field893;
                                                            int var68 = class63.field891;
                                                            class103 var69 = arg7[arg0 & 0xFFFF];
                                                            if (var67 > (var58 + var65) && var69.field1639 > 0) {
                                                                int var70 = (var67 - var58 - var65) * class221.field3524 / 3;
                                                                if (var70 > class221.field3524 * 10) {
                                                                    var70 = class221.field3524 * 10;
                                                                }
                                                                if (var70 > var69.field1639) {
                                                                    var70 = var69.field1639;
                                                                }
                                                                class160.field2602 += var70;
                                                                var69.field1639 -= var70;
                                                                class45.method346((byte) 21, var69);
                                                            }
                                                            if (var68 < (var58 + var65 + 32) && var69.field1639 < (var69.field1561 - var69.field1693)) {
                                                                int var71 = (var58 + var65 + 32 - var68) * class221.field3524 / 3;
                                                                if (class221.field3524 * 10 < var71) {
                                                                    var71 = class221.field3524 * 10;
                                                                }
                                                                if ((var69.field1561 - var69.field1693 - var69.field1639) < var71) {
                                                                    var71 = var69.field1561 - var69.field1693 - var69.field1639;
                                                                }
                                                                var69.field1639 += var71;
                                                                class160.field2602 -= var71;
                                                                class45.method346((byte) 113, var69);
                                                            }
                                                        }
                                                    } else if (class109.field1882 == var11 && class228.field3628 == var55) {
                                                        var64.method167(var59, var58, 128);
                                                    } else {
                                                        var64.method174(var59, var58);
                                                    }
                                                }
                                            } else if (var11.field1596 != null && var55 < 20) {
                                                class271 var60 = var11.method723(var55, (byte) -83);
                                                if (var60 != null) {
                                                    var60.method174(var59, var58);
                                                } else if (class260.field4138) {
                                                    class45.method346((byte) 77, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field1655 == 3) {
                                    int var72;
                                    if (class268.method1819(var11, arg5 - 13)) {
                                        var72 = var11.field1610;
                                        if (class268.field4348 == var11 && var11.field1559 != 0) {
                                            var72 = var11.field1559;
                                        }
                                    } else {
                                        var72 = var11.field1713;
                                        if (class268.field4348 == var11 && var11.field1588 != 0) {
                                            var72 = var11.field1588;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1663) {
                                            class63.method507(var15, var14, var11.field1691, var11.field1693, var72);
                                        } else {
                                            class63.method510(var15, var14, var11.field1691, var11.field1693, var72);
                                        }
                                    } else if (var11.field1663) {
                                        class63.method504(var15, var14, var11.field1691, var11.field1693, var72, 256 - (var13 & 0xFF));
                                    } else {
                                        class63.method500(var15, var14, var11.field1691, var11.field1693, var72, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1655 == 4) {
                                    class163 var73 = var11.method727(-123, class235.field3756);
                                    if (var73 != null) {
                                        String var74 = var11.field1585;
                                        int var75;
                                        if (class268.method1819(var11, -3)) {
                                            var75 = var11.field1610;
                                            if (class268.field4348 == var11 && var11.field1559 != 0) {
                                                var75 = var11.field1559;
                                            }
                                            if (var11.field1665.length() > 0) {
                                                var74 = var11.field1665;
                                            }
                                        } else {
                                            var75 = var11.field1713;
                                            if (class268.field4348 == var11 && var11.field1588 != 0) {
                                                var75 = var11.field1588;
                                            }
                                        }
                                        if (var11.field1603 && var11.field1576 != -1) {
                                            class208 var76 = class64.method514(var11.field1576, arg5 ^ 0xA);
                                            var74 = var76.field3358;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field3360 == 1 || var11.field1657 != 1) && var11.field1657 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class95.method685(var11.field1657, true);
                                            }
                                        }
                                        if (class247.field3969 == var11) {
                                            var75 = var11.field1713;
                                            var74 = class262.field4150;
                                        }
                                        if (!var11.field1603) {
                                            var74 = class246.method1625(var11, var74, arg5 - 9265);
                                        }
                                        var73.method1123(var74, var15, var14, var11.field1691, var11.field1693, var75, var11.field1722 ? 0 : -1, var11.field1641, var11.field1676, var11.field1551);
                                    } else if (class260.field4138) {
                                        class45.method346((byte) 80, var11);
                                    }
                                } else if (var11.field1655 == 5) {
                                    if (!var11.field1603) {
                                        class271 var77 = var11.method728(66, class268.method1819(var11, arg5 ^ 0xFFFFFFF7));
                                        if (var77 != null) {
                                            var77.method174(var15, var14);
                                        } else if (class260.field4138) {
                                            class45.method346((byte) 63, var11);
                                        }
                                    } else if (var11.field1643 >= 0) {
                                        class190 var78 = var11.method724((byte) 123);
                                        var78.method1293(0, var15, var14, var11.field1691, var11.field1693, var11.field1705, var11.field1649, 0);
                                    } else {
                                        class271 var79;
                                        if (var11.field1576 == -1) {
                                            var79 = var11.method728(108, false);
                                        } else if (var11.field1606 && class197.field3179.field3746 != null) {
                                            var79 = class203.method1362(var11.field1576, class197.field3179.field3746, var11.field1557, var11.field1657, var11.field1714, var11.field1671, 925569457);
                                        } else {
                                            var79 = class203.method1362(var11.field1576, (class95) null, var11.field1557, var11.field1657, var11.field1714, var11.field1671, 925569457);
                                        }
                                        if (var79 != null) {
                                            int var80 = var79.field4371;
                                            int var81 = var79.field4384;
                                            if (var11.field1583) {
                                                int var83 = (var80 + var11.field1691 - 1) / var80;
                                                int var84 = (var81 + var11.field1693 - 1) / var81;
                                                class63.method505(var15, var14, var15 + var11.field1691, var11.field1693 + var14);
                                                for (int var85 = 0; var85 < var83; var85++) {
                                                    for (int var86 = 0; var86 < var84; var86++) {
                                                        if (var11.field1623 != 0) {
                                                            var79.method1827(arg5 + 116, var80 * var85 + (var15 - -(var80 / 2)), var81 / 2 + var81 * var86 + var14, 4096, var11.field1623);
                                                        } else if (var13 == 0) {
                                                            var79.method174(var80 * var85 + var15, var81 * var86 + var14);
                                                        } else {
                                                            var79.method167(var80 * var85 + var15, var81 * var86 + var14, 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class63.method494(arg8, arg6, arg1, arg4);
                                            } else {
                                                int var82 = var11.field1691 * 4096 / var80;
                                                if (var11.field1623 != 0) {
                                                    var79.method1827(126, var11.field1691 / 2 + var15, var11.field1693 / 2 + var14, var82, var11.field1623);
                                                } else if (var13 != 0) {
                                                    var79.method160(var15, var14, var11.field1691, var11.field1693, 256 - (var13 & 0xFF));
                                                } else if (var11.field1691 == var80 && var11.field1693 == var81) {
                                                    var79.method174(var15, var14);
                                                } else {
                                                    var79.method163(var15, var14, var11.field1691, var11.field1693);
                                                }
                                            }
                                        } else if (class260.field4138) {
                                            class45.method346((byte) 107, var11);
                                        }
                                    }
                                } else if (var11.field1655 == 6) {
                                    boolean var87 = class268.method1819(var11, -3);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field1700;
                                    } else {
                                        var88 = var11.field1632;
                                    }
                                    class13 var89 = null;
                                    int var90 = 0;
                                    if (var11.field1576 != -1) {
                                        class208 var95 = class64.method514(var11.field1576, 0);
                                        if (var95 != null) {
                                            class208 var96 = var95.method1419((byte) -97, var11.field1657);
                                            class21 var97 = var88 == -1 ? null : class267.method1812((byte) 89, var88);
                                            if (var11.field1606 && class197.field3179.field3746 != null) {
                                                var89 = var96.method1400(var11.field1712, var11.field1633, var11.field1594, 1, class197.field3179.field3746, var97, (byte) 67);
                                            } else {
                                                var89 = var96.method1400(var11.field1712, var11.field1633, var11.field1594, 1, (class95) null, var97, (byte) 81);
                                            }
                                            if (var89 == null) {
                                                class45.method346((byte) 44, var11);
                                            } else {
                                                var90 = -var89.method88() / 2;
                                            }
                                        }
                                    } else if (var11.field1631 == 5) {
                                        if (var11.field1724 == -1) {
                                            var89 = class203.field3255.method675((class21) null, -1, -1, (class21) null, -1, (byte) 14, true, 0, -1, (class171[]) null, 0);
                                        } else {
                                            int var92 = var11.field1724 & 0x7FF;
                                            if (class80.field1121 == var92) {
                                                var92 = 2047;
                                            }
                                            class235 var93 = class260.field4141[var92];
                                            class21 var94 = var88 == -1 ? null : class267.method1812((byte) 89, var88);
                                            if (var93 != null && (int) class238.method1570(var93.field3735, (byte) 79) << 11 == (var11.field1724 & 0xFFFFF800)) {
                                                var89 = var93.field3746.method675((class21) null, var11.field1594, 0, var94, -1, (byte) 122, true, 0, -1, (class171[]) null, 0);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var89 = var11.method720(-1, (class21) null, -1, 0, (byte) -83, class197.field3179.field3746, var87);
                                        if (var89 == null && class260.field4138) {
                                            class45.method346((byte) 35, var11);
                                        }
                                    } else {
                                        class21 var91 = class267.method1812((byte) 89, var88);
                                        var89 = var11.method720(var11.field1712, var91, var11.field1594, var11.field1633, (byte) -83, class197.field3179.field3746, var87);
                                        if (var89 == null && class260.field4138) {
                                            class45.method346((byte) 35, var11);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var98;
                                        if (var11.field1690 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field1691 << 8) / var11.field1690;
                                        }
                                        int var99;
                                        if (var11.field1615 > 0) {
                                            var99 = (var11.field1693 << 8) / var11.field1615;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var11.field1601 * var98 >> 8) + var15 + (var11.field1691 / 2);
                                        int var101 = (var11.field1613 * var99 >> 8) + var11.field1693 / 2 + var14;
                                        class145.method991(var100, var101);
                                        int var102 = class145.field2338[var11.field1683] * var11.field1598 >> 16;
                                        int var103 = class145.field2348[var11.field1683] * var11.field1598 >> 16;
                                        if (!var11.field1603) {
                                            var89.method84(0, var11.field1605, 0, var11.field1683, 0, var102, var103, -1L);
                                        } else if (var11.field1661) {
                                            ((class90) var89).method645(0, var11.field1605, var11.field1579, var11.field1683, var11.field1699, var90 + var102 + var11.field1563, var11.field1563 + var103, var11.field1598);
                                        } else {
                                            var89.method84(0, var11.field1605, var11.field1579, var11.field1683, var11.field1699, var102 + var90 + var11.field1563, var11.field1563 + var103, -1L);
                                        }
                                        class145.method980();
                                    }
                                } else {
                                    if (var11.field1655 == 7) {
                                        class163 var104 = var11.method727(-124, class235.field3756);
                                        if (var104 == null) {
                                            if (class260.field4138) {
                                                class45.method346((byte) 67, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field1626; var106++) {
                                            for (int var107 = 0; var107 < var11.field1597; var107++) {
                                                if (var11.field1547[var105] > 0) {
                                                    class208 var108 = class64.method514(var11.field1547[var105] - 1, arg5 + -10);
                                                    String var109;
                                                    if (var108.field3360 != 1 && var11.field1592[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field3358 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field3358 + "</col> x" + class95.method685(var11.field1592[var105], true);
                                                    }
                                                    int var110 = (var11.field1555 + 12) * var106 + var14;
                                                    int var111 = var15 + ((var11.field1569 + 115) * var107);
                                                    if (var11.field1641 == 0) {
                                                        var104.method1121(var109, var111, var110, var11.field1713, var11.field1722 ? 0 : -1);
                                                    } else if (var11.field1641 == 1) {
                                                        var104.method1137(var109, var111 + 57, var110, var11.field1713, var11.field1722 ? 0 : -1);
                                                    } else {
                                                        var104.method1118(var109, var111 + 115 - 1, var110, var11.field1713, var11.field1722 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field1655 == 8 && class228.field3634 == var11 && class260.field4133 == class179.field2898) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class163 var114 = class58.field809;
                                        String var115 = var11.field1585;
                                        String var116 = class246.method1625(var11, var115, -9255);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method1119(var125);
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field2650 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var117 = var11.field1693 + var14 + 5;
                                        int var118 = var11.field1691 + var15 - var112 - 5;
                                        if (var15 + 5 > var118) {
                                            var118 = var15 + 5;
                                        }
                                        if (arg4 < (var113 + var117)) {
                                            var117 = arg4 - var113;
                                        }
                                        if (var112 + var118 > arg1) {
                                            var118 = arg1 - var112;
                                        }
                                        class63.method507(var118, var117, var112, var113, 16777120);
                                        class63.method510(var118, var117, var112, var113, 0);
                                        int var119 = var117 + var114.field2650 + 2;
                                        String var120 = var11.field1585;
                                        String var121 = class246.method1625(var11, var120, -9255);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method1121(var123, var118 + 3, var119, 0, -1);
                                            var119 += var114.field2650 + 1;
                                        }
                                    }
                                    if (var11.field1655 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field1678) {
                                            var130 = var11.field1693 + var14;
                                            var127 = var15 + var11.field1691;
                                            var128 = var14;
                                            var129 = var15;
                                        } else {
                                            var127 = var11.field1691 + var15;
                                            var128 = var11.field1693 + var14;
                                            var129 = var15;
                                            var130 = var14;
                                        }
                                        if (var11.field1637 == 1) {
                                            class63.method495(var129, var130, var127, var128, var11.field1713);
                                        } else {
                                            class63.method498(var129, var130, var127, var128, var11.field1713, var11.field1637);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field1466++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method696(byte arg0) {
        field1467 = null;
        if (arg0 >= -98) {
            method695(53, 5, -117, 48, -113, 100, 109, (class103[]) null, -44, -128);
        }
    }
}
