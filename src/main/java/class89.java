import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class89 {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private int field1472 = 0;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Loa;")
    private class262 field1486 = new class262();

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Z")
    public boolean field1493 = false;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[[[I")
    private int[][][] field1482;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[Lni;")
    private class189[] field1475;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lmb;")
    private static class96 field1469 = class243.method1708("Loaded interfaces", (byte) 93);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lmb;")
    public static class96 field1471 = field1469;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[J")
    public static long[] field1487 = new long[32];

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Z")
    public static boolean field1478 = true;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Lmb;")
    private static class96 field1491 = class243.method1708(" ", (byte) 111);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lmb;")
    public static class96 field1492 = class243.method1708("W-=hlen Sie eine Option", (byte) 98);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lmb;")
    public static class96 field1467 = field1491;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[Lmj;")
    public static class246[] field1488;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method629(int arg0) {
        field1487 = null;
        field1488 = null;
        field1471 = null;
        field1492 = null;
        field1491 = null;
        field1469 = null;
        if (arg0 != 1059) {
            field1471 = null;
        }
        field1467 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public static final void method630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 100) {
            method632(86, -9, (byte) -74);
        }
        field1481++;
        if (class170.field2980 == 1) {
            class140.field2502[class60.field1031 / 100].method1057(class186.field3255 - 8, class215.field3704 - 8);
        }
        if (class170.field2980 == 2) {
            class140.field2502[class60.field1031 / 100 + 4].method1057(class186.field3255 - 8, class215.field3704 - 8);
        }
        class186.method1321((byte) 81);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method631(int arg0, int arg1) {
        field1480++;
        class224.field3817.method82((byte) -109, arg1);
        if (arg0 > 102) {
            class74.field1279.method82((byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)I")
    public static final int method632(int arg0, int arg1, byte arg2) {
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        if (arg2 <= 110) {
            method631(-14, 92);
        }
        field1490++;
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method633(int arg0) {
        if (arg0 >= -36) {
            method629(36);
        }
        field1474++;
        if (this.field1477 != this.field1473) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1477; var2++) {
            this.field1475[var2] = class6.field117;
        }
        return this.field1482;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public final void method634(int arg0) {
        for (int var2 = 0; var2 < this.field1477; var2++) {
            this.field1482[var2][0] = null;
            this.field1482[var2][1] = null;
            this.field1482[var2][2] = null;
            this.field1482[var2] = null;
        }
        this.field1475 = null;
        this.field1482 = null;
        this.field1486.method1817(arg0);
        if (arg0 == 1) {
            this.field1486 = null;
            field1485++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILrg;)Lmb;")
    public static final class96 method635(int arg0, int arg1, class239 arg2) {
        field1489++;
        try {
            class96 var3 = new class96();
            var3.field1600 = arg2.method1666(24348);
            if (arg0 <= 112) {
                return null;
            }
            if (arg1 < var3.field1600) {
                var3.field1600 = arg1;
            }
            var3.field1580 = new byte[var3.field1600];
            arg2.field4124 += class77.field1311.method371(var3.field1600, 0, arg2.field4124, false, var3.field1580, arg2.field4144);
            return var3;
        } catch (Exception var4) {
            return class178.field3084;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII[Lw;BIII)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, class107[] arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= -114) {
            return;
        }
        field1468++;
        class84.method593(arg2, arg9, arg0, arg7);
        class240.method1679();
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class107 var11 = arg5[var10];
            if (var11 != null && (var11.field1827 == arg4 || arg4 == -1412584499 && class90.field1494 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class270.field4698[class47.field822] = var11.field1942 + arg8;
                    class266.field4643[class47.field822] = var11.field1945 + arg1;
                    class271.field4717[class47.field822] = var11.field1856;
                    class61.field1046[class47.field822] = var11.field1919;
                    var12 = class47.field822++;
                } else {
                    var12 = arg3;
                }
                var11.field1975 = var12;
                var11.field1923 = class236.field4053;
                if (!var11.field1867 || !client.method814(var11)) {
                    if (var11.field1869 > 0) {
                        class141.method1043(var11, 24258);
                    }
                    int var13 = var11.field1942 + arg8;
                    int var14 = var11.field1945 + arg1;
                    int var15 = var11.field1922;
                    if (class45.field784 && (client.method817(var11) != 0 || var11.field1833 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class90.field1494 == var11) {
                        if (arg4 != -1412584499 && !var11.field1841) {
                            class135.field2432 = arg5;
                            class187.field3263 = arg8;
                            class203.field3514 = arg1;
                            continue;
                        }
                        if (class46.field787 && class269.field4695) {
                            int var16 = class17.field244;
                            int var17 = var16 - class187.field3256;
                            int var18 = class214.field3684;
                            int var19 = var18 - class57.field1011;
                            if (var19 < class21.field355) {
                                var19 = class21.field355;
                            }
                            if (class21.field355 + class194.field3347.field1919 < var11.field1919 + var19) {
                                var19 = class21.field355 + class194.field3347.field1919 - var11.field1919;
                            }
                            var14 = var19;
                            if (class269.field4693 > var17) {
                                var17 = class269.field4693;
                            }
                            if (var11.field1856 + var17 > class269.field4693 - -class194.field3347.field1856) {
                                var17 = class269.field4693 + class194.field3347.field1856 - var11.field1856;
                            }
                            var13 = var17;
                        }
                        if (!var11.field1841) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field1833 == 2) {
                        var24 = arg0;
                        var20 = arg9;
                        var22 = arg2;
                        var25 = arg7;
                    } else {
                        var20 = var14 <= arg9 ? arg9 : var14;
                        int var21 = var11.field1919 + var14;
                        var22 = arg2 >= var13 ? arg2 : var13;
                        int var23 = var11.field1856 + var13;
                        if (var11.field1833 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = arg0 > var23 ? var23 : arg0;
                        var25 = arg7 > var21 ? var21 : arg7;
                    }
                    if (!var11.field1867 || var24 > var22 && var25 > var20) {
                        if (var11.field1869 != 0) {
                            if (var11.field1869 == 1337) {
                                class265.field4632 = var14;
                                class222.field3798 = var11;
                                class251.field4349 = var13;
                                class29.method190((byte) -57, var11.field1869 == 1403, var13, var11.field1856, var14, var11.field1919);
                                class84.method593(arg2, arg9, arg0, arg7);
                                continue;
                            }
                            if (var11.field1869 == 1338) {
                                if (var11.method803(126)) {
                                    class181.method1282(var11, var14, 18299, var13, var12);
                                    class84.method593(arg2, arg9, arg0, arg7);
                                }
                                continue;
                            }
                            if (var11.field1869 == 1339) {
                                if (var11.method803(122)) {
                                    class34.method261(var11, var14, var12, var13, -19078);
                                    class84.method593(arg2, arg9, arg0, arg7);
                                }
                                continue;
                            }
                            if (var11.field1869 == 1400) {
                                class51.method386(false, var11.field1856, var14, var13, var11.field1919);
                                class176.field3059[var12] = true;
                                class19.field317[var12] = true;
                                class84.method593(arg2, arg9, arg0, arg7);
                                continue;
                            }
                            if (var11.field1869 == 1401) {
                                class42.method327(var11.field1919, var14, -4, var13, var11.field1856);
                                class176.field3059[var12] = true;
                                class19.field317[var12] = true;
                                class84.method593(arg2, arg9, arg0, arg7);
                                continue;
                            }
                            if (var11.field1869 == 1402) {
                                class51.method385(var14, var13, 1879052287);
                                class176.field3059[var12] = true;
                                class19.field317[var12] = true;
                                continue;
                            }
                            if (var11.field1869 == 1405) {
                                if (!class56.field979) {
                                    continue;
                                }
                                int var26 = var13 + var11.field1856;
                                int var27 = var14 + 15;
                                int var28 = 16776960;
                                int var29 = 0;
                                class244.field4235.method132(class36.method289(-5615, new class96[] { class208.field3597, class31.method205(class53.field925, (byte) -78) }), var26, var27, 16776960, -1);
                                Runtime var30 = Runtime.getRuntime();
                                int var115 = var27 + 15;
                                int var31 = 0;
                                int var32 = 0;
                                int var33 = (int) ((var30.totalMemory() - var30.freeMemory()) / 1024L);
                                if (var33 > 65536) {
                                    var28 = 16711680;
                                }
                                class244.field4235.method132(class36.method289(-5615, new class96[] { class159.field2792, class31.method205(var33, (byte) -78), class162.field2875 }), var26, var115, var28, -1);
                                int var34 = 16776960;
                                for (int var35 = 0; var35 < 27; var35++) {
                                    var31 += class230.field3966[var35].method1173((byte) 58);
                                    var29 += class230.field3966[var35].method1171(-84);
                                    var32 += class230.field3966[var35].method1169(-61);
                                }
                                var27 = var115 + 15;
                                int var36 = var32 * 100 / var31;
                                int var37 = var29 * 10000 / var31;
                                class96 var38 = class36.method289(-5615, new class96[] { class145.field2575, class274.method1860(0, 1, 2, (long) var37, true), class208.field3584, class31.method205(var36, (byte) -78), class6.field112 });
                                class149.field2628.method132(var38, var26, var27, var34, -1);
                                class176.field3059[var12] = true;
                                var27 += 12;
                                class19.field317[var12] = true;
                                continue;
                            }
                        }
                        if (!class170.field2981) {
                            if (var11.field1833 == 0 && var11.field1970 && class146.field2601 >= var22 && var20 <= class122.field2267 && var24 > class146.field2601 && class122.field2267 < var25 && !class45.field784) {
                                class208.field3586[0] = class135.field2428;
                                class192.field3316[0] = class120.field2227;
                                class73.field1254 = 1;
                                class79.field1346[0] = 1002;
                            }
                            if (class146.field2601 >= var22 && class122.field2267 >= var20 && var24 > class146.field2601 && class122.field2267 < var25) {
                                class4.method48(var11, class122.field2267 - var14, (byte) 33, class146.field2601 - var13);
                            }
                        }
                        if (var11.field1833 == 0) {
                            if (!var11.field1867 && client.method814(var11) && class92.field1528 != var11) {
                                continue;
                            }
                            if (!var11.field1867) {
                                if ((var11.field1850 - var11.field1919) < var11.field1934) {
                                    var11.field1934 = var11.field1850 - var11.field1919;
                                }
                                if (var11.field1934 < 0) {
                                    var11.field1934 = 0;
                                }
                            }
                            method636(var24, var14 - var11.field1934, var22, var12, var11.field1896, arg5, (byte) -127, var25, var13 - var11.field1937, var20);
                            if (var11.field1842 != null) {
                                method636(var24, var14 - var11.field1934, var22, var12, var11.field1896, var11.field1842, (byte) -118, var25, var13 - var11.field1937, var20);
                            }
                            class168 var39 = (class168) class34.field606.method1081(0, (long) var11.field1896);
                            if (var39 != null) {
                                if (var39.field2952 == 0 && !class170.field2981 && var22 <= class146.field2601 && var20 <= class122.field2267 && class146.field2601 < var24 && var25 > class122.field2267 && !class45.field784) {
                                    class208.field3586[0] = class135.field2428;
                                    class192.field3316[0] = class120.field2227;
                                    class73.field1254 = 1;
                                    class79.field1346[0] = 1002;
                                }
                                class156.method1134(var24, var14, var39.field2961, var12, (byte) -17, var25, var22, var20, var13);
                            }
                            class84.method593(arg2, arg9, arg0, arg7);
                            class240.method1679();
                        }
                        if (class201.field3483[var12] || class211.field3639 > 1) {
                            if (var11.field1833 == 0 && !var11.field1867 && var11.field1919 < var11.field1850) {
                                class188.method1330(var11.field1850, var11.field1934, var11.field1919, var11.field1856 + var13, var14, false);
                            }
                            if (var11.field1833 != 1) {
                                if (var11.field1833 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field1866; var41++) {
                                        for (int var42 = 0; var42 < var11.field1899; var42++) {
                                            int var43 = (var11.field1966 + 32) * var42 + var13;
                                            int var44 = (var11.field1816 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var43 += var11.field1907[var40];
                                                var44 += var11.field1870[var40];
                                            }
                                            if (var11.field1873[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field1873[var40] - 1;
                                                if ((var43 + 32) > arg2 && arg0 > var43 && (var44 + 32) > arg9 && var44 < arg7 || class48.field847 == var11 && class139.field2482 == var40) {
                                                    class246 var49;
                                                    if (class148.field2616 == 1 && class195.field3350 == var40 && class93.field1545 == var11.field1896) {
                                                        var49 = class161.method1170(var11.field1949[var40], 0, 2, var11.field1932, -666384303, var48);
                                                    } else {
                                                        var49 = class161.method1170(var11.field1949[var40], 3153952, 1, var11.field1932, -666384303, var48);
                                                    }
                                                    if (class240.field4178) {
                                                        class176.field3059[var12] = true;
                                                    }
                                                    if (var49 == null) {
                                                        class53.method403(-72, var11);
                                                    } else if (class48.field847 == var11 && class139.field2482 == var40) {
                                                        int var50 = class17.field244 - class249.field4312;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        int var51 = class214.field3684 - class205.field3528;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class115.field2142 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method1058(var43 + var50, var44 + var51, 128);
                                                        if (arg4 != -1) {
                                                            class107 var52 = arg5[arg4 & 0xFFFF];
                                                            int var53 = class84.field1426;
                                                            int var54 = class84.field1423;
                                                            if ((var44 + var51) < var53 && var52.field1934 > 0) {
                                                                int var55 = (var53 - var51 - var44) * class62.field1063 / 3;
                                                                if (var55 > (class62.field1063 * 10)) {
                                                                    var55 = class62.field1063 * 10;
                                                                }
                                                                if (var55 > var52.field1934) {
                                                                    var55 = var52.field1934;
                                                                }
                                                                class205.field3528 += var55;
                                                                var52.field1934 -= var55;
                                                                class53.method403(-125, var52);
                                                            }
                                                            if (var44 + var51 + 32 > var54 && (var52.field1850 - var52.field1919) > var52.field1934) {
                                                                int var56 = (var44 + var51 + 32 - var54) * class62.field1063 / 3;
                                                                if (var56 > (class62.field1063 * 10)) {
                                                                    var56 = class62.field1063 * 10;
                                                                }
                                                                if ((var52.field1850 - var52.field1919 - var52.field1934) < var56) {
                                                                    var56 = var52.field1850 - var52.field1919 - var52.field1934;
                                                                }
                                                                var52.field1934 += var56;
                                                                class205.field3528 -= var56;
                                                                class53.method403(-79, var52);
                                                            }
                                                        }
                                                    } else if (class169.field2968 == var11 && class116.field2165 == var40) {
                                                        var49.method1058(var43, var44, 128);
                                                    } else {
                                                        var49.method1057(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field1855 != null && var40 < 20) {
                                                class246 var45 = var11.method807(0, var40);
                                                if (var45 != null) {
                                                    var45.method1057(var43, var44);
                                                } else if (class137.field2451) {
                                                    class53.method403(-113, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field1833 == 3) {
                                    int var57;
                                    if (class39.method305(var11, 47)) {
                                        var57 = var11.field1943;
                                        if (class92.field1528 == var11 && var11.field1837 != 0) {
                                            var57 = var11.field1837;
                                        }
                                    } else {
                                        var57 = var11.field1848;
                                        if (class92.field1528 == var11 && var11.field1846 != 0) {
                                            var57 = var11.field1846;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1823) {
                                            class84.method598(var13, var14, var11.field1856, var11.field1919, var57);
                                        } else {
                                            class84.method607(var13, var14, var11.field1856, var11.field1919, var57);
                                        }
                                    } else if (var11.field1823) {
                                        class84.method592(var13, var14, var11.field1856, var11.field1919, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class84.method600(var13, var14, var11.field1856, var11.field1919, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1833 == 4) {
                                    class18 var58 = var11.method798(class45.field773, (byte) -72);
                                    if (var58 != null) {
                                        class96 var59 = var11.field1918;
                                        int var60;
                                        if (class39.method305(var11, 77)) {
                                            var60 = var11.field1943;
                                            if (class92.field1528 == var11 && var11.field1837 != 0) {
                                                var60 = var11.field1837;
                                            }
                                            if (var11.field1832.method707(-33) > 0) {
                                                var59 = var11.field1832;
                                            }
                                        } else {
                                            var60 = var11.field1848;
                                            if (class92.field1528 == var11 && var11.field1846 != 0) {
                                                var60 = var11.field1846;
                                            }
                                        }
                                        if (var11.field1867 && var11.field1863 != -1) {
                                            class159 var61 = class269.method1845(var11.field1863, (byte) 61);
                                            var59 = var61.field2779;
                                            if (var59 == null) {
                                                var59 = class156.field2723;
                                            }
                                            if ((var61.field2796 == 1 || var11.field1924 != 1) && var11.field1924 != -1) {
                                                var59 = class36.method289(-5615, new class96[] { class91.field1513, var59, class32.field510, class225.method1535(true, var11.field1924) });
                                            }
                                        }
                                        if (class27.field459 == var11) {
                                            var60 = var11.field1848;
                                            var59 = class82.field1383;
                                        }
                                        if (!var11.field1867) {
                                            var59 = class229.method1563((byte) 89, var59, var11);
                                        }
                                        var58.method121(var59, var13, var14, var11.field1856, var11.field1919, var60, var11.field1935 ? 0 : -1, var11.field1818, var11.field1967, var11.field1876);
                                    } else if (class137.field2451) {
                                        class53.method403(-66, var11);
                                    }
                                } else if (var11.field1833 == 5) {
                                    if (var11.field1867) {
                                        class246 var63;
                                        if (var11.field1863 == -1) {
                                            var63 = var11.method811(-103, false);
                                        } else {
                                            var63 = class161.method1170(var11.field1924, var11.field1901, var11.field1839, var11.field1932, -666384303, var11.field1863);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field4269;
                                            int var65 = var63.field4268;
                                            if (var11.field1875) {
                                                int var67 = (var11.field1856 + var64 - 1) / var64;
                                                int var68 = (var11.field1919 + var65 - 1) / var65;
                                                class84.method603(var13, var14, var11.field1856 + var13, var14 - -var11.field1919);
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var11.field1926 != 0) {
                                                            var63.method1725(var11.field1926, (byte) -120, var64 / 2 + (var13 + (var64 * var69)), var65 / 2 + (var14 - -(var65 * var70)), 4096);
                                                        } else if (var15 == 0) {
                                                            var63.method1057(var13 + (var64 * var69), var65 * var70 + var14);
                                                        } else {
                                                            var63.method1058(var64 * var69 + var13, var14 - -(var65 * var70), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class84.method593(arg2, arg9, arg0, arg7);
                                            } else {
                                                int var66 = var11.field1856 * 4096 / var64;
                                                if (var11.field1926 != 0) {
                                                    var63.method1725(var11.field1926, (byte) -79, var11.field1856 / 2 + var13, var14 - -(var11.field1919 / 2), var66);
                                                } else if (var15 != 0) {
                                                    var63.method1049(var13, var14, var11.field1856, var11.field1919, 256 - (var15 & 0xFF));
                                                } else if (var11.field1856 == var64 && var11.field1919 == var65) {
                                                    var63.method1057(var13, var14);
                                                } else {
                                                    var63.method1246(var13, var14, var11.field1856, var11.field1919);
                                                }
                                            }
                                        } else if (class137.field2451) {
                                            class53.method403(-65, var11);
                                        }
                                    } else {
                                        class246 var62 = var11.method811(-82, class39.method305(var11, 36));
                                        if (var62 != null) {
                                            var62.method1057(var13, var14);
                                        } else if (class137.field2451) {
                                            class53.method403(-92, var11);
                                        }
                                    }
                                } else if (var11.field1833 == 6) {
                                    boolean var71 = class39.method305(var11, 35);
                                    class35 var72 = null;
                                    int var73;
                                    if (var71) {
                                        var73 = var11.field1868;
                                    } else {
                                        var73 = var11.field1888;
                                    }
                                    int var74 = 0;
                                    if (var11.field1863 != -1) {
                                        class159 var79 = class269.method1845(var11.field1863, (byte) 61);
                                        if (var79 != null) {
                                            class159 var80 = var79.method1146(var11.field1924, true);
                                            class67 var81 = var73 == -1 ? null : class189.method1332(var73, 2);
                                            var72 = var80.method1152(var81, (byte) -113, var11.field1952, 1);
                                            if (var72 == null) {
                                                class53.method403(-93, var11);
                                            } else {
                                                var74 = -var72.method50() / 2;
                                            }
                                        }
                                    } else if (var11.field1947 == 5) {
                                        if (var11.field1847 == -1) {
                                            var72 = class19.field316.method1315((class67) null, -1, -1215425567, (class67) null, -1);
                                        } else {
                                            int var76 = var11.field1847 & 0x7FF;
                                            if (class229.field3934 == var76) {
                                                var76 = 2047;
                                            }
                                            class47 var77 = class22.field371[var76];
                                            class67 var78 = var73 == -1 ? null : class189.method1332(var73, 2);
                                            if (var77 != null && (int) var77.field828.method685((byte) -105) << 11 == (var11.field1847 & 0xFFFFF800)) {
                                                var72 = var77.field812.method1315((class67) null, 0, -1215425567, var78, var11.field1952);
                                            }
                                        }
                                    } else if (var73 == -1) {
                                        var72 = var11.method800((byte) -98, (class67) null, var71, -1, class236.field4047.field812);
                                        if (var72 == null && class137.field2451) {
                                            class53.method403(-83, var11);
                                        }
                                    } else {
                                        class67 var75 = class189.method1332(var73, 2);
                                        var72 = var11.method800((byte) -126, var75, var71, var11.field1952, class236.field4047.field812);
                                        if (var72 == null && class137.field2451) {
                                            class53.method403(-84, var11);
                                        }
                                    }
                                    if (var72 != null) {
                                        int var82;
                                        if (var11.field1915 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field1919 << 8) / var11.field1915;
                                        }
                                        int var83;
                                        if (var11.field1830 > 0) {
                                            var83 = (var11.field1856 << 8) / var11.field1830;
                                        } else {
                                            var83 = 256;
                                        }
                                        int var84 = (var11.field1963 * var83 >> 8) + var11.field1856 / 2 + var13;
                                        int var85 = var14 - (-(var11.field1919 / 2) - (var11.field1862 * var82 >> 8));
                                        class240.method1684(var84, var85);
                                        int var86 = class240.field4162[var11.field1969] * var11.field1904 >> 16;
                                        int var87 = class240.field4176[var11.field1969] * var11.field1904 >> 16;
                                        if (!var11.field1867) {
                                            var72.method266(0, var11.field1840, 0, var11.field1969, 0, var86, var87);
                                        } else if (var11.field1961) {
                                            ((class255) var72).method1770(0, var11.field1840, var11.field1822, var11.field1969, var11.field1972, var74 + var86 + var11.field1886, var11.field1886 + var87, var11.field1904);
                                        } else {
                                            var72.method266(0, var11.field1840, var11.field1822, var11.field1969, var11.field1972, var11.field1886 + var74 + var86, var87 - -var11.field1886);
                                        }
                                        class240.method1689();
                                    }
                                } else {
                                    if (var11.field1833 == 7) {
                                        class18 var88 = var11.method798(class45.field773, (byte) -55);
                                        if (var88 == null) {
                                            if (class137.field2451) {
                                                class53.method403(-66, var11);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field1866; var90++) {
                                            for (int var91 = 0; var91 < var11.field1899; var91++) {
                                                if (var11.field1873[var89] > 0) {
                                                    class159 var92 = class269.method1845(var11.field1873[var89] - 1, (byte) 61);
                                                    class96 var93;
                                                    if (var92.field2796 != 1 && var11.field1949[var89] == 1) {
                                                        var93 = class36.method289(-5615, new class96[] { class91.field1513, var92.field2779, class198.field3455 });
                                                    } else {
                                                        var93 = class36.method289(-5615, new class96[] { class91.field1513, var92.field2779, class32.field510, class225.method1535(true, var11.field1949[var89]) });
                                                    }
                                                    int var94 = (var11.field1966 + 115) * var91 + var13;
                                                    int var95 = (var11.field1816 + 12) * var90 + var14;
                                                    if (var11.field1818 == 0) {
                                                        var88.method128(var93, var94, var95, var11.field1848, var11.field1935 ? 0 : -1);
                                                    } else if (var11.field1818 == 1) {
                                                        var88.method117(var93, var94 + 57, var95, var11.field1848, var11.field1935 ? 0 : -1);
                                                    } else {
                                                        var88.method132(var93, var94 + 115 - 1, var95, var11.field1848, var11.field1935 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field1833 == 8 && class143.field2538 == var11 && class270.field4699 == class236.field4057) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class96 var98 = var11.field1918;
                                        class18 var99 = class244.field4235;
                                        class96 var100 = class229.method1563((byte) 89, var98, var11);
                                        while (var100.method707(-116) > 0) {
                                            int var108 = var100.method720(class220.field3765, 20329);
                                            class96 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class120.field2227;
                                            } else {
                                                var109 = var100.method716(var108, (byte) -13, 0);
                                                var100 = var100.method710(109, var108 + 4);
                                            }
                                            int var110 = var99.method125(var109);
                                            var96 += var99.field284 + 1;
                                            if (var110 > var97) {
                                                var97 = var110;
                                            }
                                        }
                                        var96 += 7;
                                        var97 += 6;
                                        int var101 = var13 + var11.field1856 - var97 - 5;
                                        if (var13 + 5 > var101) {
                                            var101 = var13 + 5;
                                        }
                                        if (arg0 < var97 + var101) {
                                            var101 = arg0 - var97;
                                        }
                                        int var102 = var14 + var11.field1919 + 5;
                                        if (arg7 < var96 + var102) {
                                            var102 = arg7 - var96;
                                        }
                                        class84.method598(var101, var102, var97, var96, 16777120);
                                        class84.method607(var101, var102, var97, var96, 0);
                                        int var103 = var99.field284 + var102 + 2;
                                        class96 var104 = var11.field1918;
                                        class96 var105 = class229.method1563((byte) 89, var104, var11);
                                        while (var105.method707(-111) > 0) {
                                            int var106 = var105.method720(class220.field3765, 20329);
                                            class96 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class120.field2227;
                                            } else {
                                                var107 = var105.method716(var106, (byte) -13, 0);
                                                var105 = var105.method710(113, var106 + 4);
                                            }
                                            var99.method128(var107, var101 + 3, var103, 0, -1);
                                            var103 += var99.field284 + 1;
                                        }
                                    }
                                    if (var11.field1833 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field1835) {
                                            var111 = var14;
                                            var112 = var13;
                                            var113 = var11.field1919 + var14;
                                            var114 = var11.field1856 + var13;
                                        } else {
                                            var112 = var13;
                                            var114 = var11.field1856 + var13;
                                            var111 = var11.field1919 + var14;
                                            var113 = var14;
                                        }
                                        if (var11.field1971 == 1) {
                                            class84.method599(var112, var113, var114, var111, var11.field1848);
                                        } else {
                                            class84.method602(var112, var113, var114, var111, var11.field1848, var11.field1971);
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method637(int arg0, boolean arg1) {
        field1476++;
        if (arg1) {
            return null;
        } else if (this.field1477 == this.field1473) {
            this.field1493 = this.field1475[arg0] == null;
            this.field1475[arg0] = class6.field117;
            return this.field1482[arg0];
        } else if (this.field1477 == 1) {
            this.field1493 = this.field1484 != arg0;
            this.field1484 = arg0;
            return this.field1482[0];
        } else {
            class189 var3 = this.field1475[arg0];
            if (var3 == null) {
                this.field1493 = true;
                if (this.field1472 < this.field1477) {
                    var3 = new class189(arg0, this.field1472);
                    this.field1472++;
                } else {
                    class189 var4 = (class189) this.field1486.method1816((byte) 122);
                    var3 = new class189(arg0, var4.field3299);
                    this.field1475[var4.field3310] = null;
                    var4.method1743((byte) 123);
                }
                this.field1475[arg0] = var3;
            } else {
                this.field1493 = false;
            }
            this.field1486.method1819(-9166, var3);
            return this.field1482[var3.field3299];
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(III)V")
    public class89(int arg0, int arg1, int arg2) {
        this.field1473 = arg1;
        this.field1477 = arg0;
        this.field1482 = new int[this.field1477][3][arg2];
        this.field1475 = new class189[this.field1473];
    }
}
