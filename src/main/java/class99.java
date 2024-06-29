import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class99 extends class59 {

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    private int field1883 = 1;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    private int field1894 = 1;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Lsd;")
    public static class166 field1884 = class135.method935("Lade Eingabe)2Steuerungsprogramm)3)3)3", 0);

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "Lsd;")
    public static class166 field1887 = class135.method935(" )2> <col=00ffff>", 0);

    @OriginalMember(owner = "client!l", name = "db", descriptor = "Lsd;")
    public static class166 field1892 = class135.method935("Nehmen", 0);

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "Lsd;")
    public static class166 field1895 = class135.method935("l", 0);

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "J")
    public static long field1896;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lmf;")
    public static class114 field1888;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lhc;")
    public static class67 field1885;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1216 = ~arg0.method400(255) == -2;
                }
            } else {
                this.field1894 = arg0.method400(255);
            }
        } else {
            this.field1883 = arg0.method400(255);
        }
        if (arg1 < 18) {
            this.field1894 = -22;
        }
        ++field1893;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    public static final void method740(int arg0, boolean arg1) {
        if (~(class41.field728.field3526 >> 7) == ~class16.field276 && class41.field728.field3513 >> 7 == class32.field595) {
            class16.field276 = 0;
        }
        if (arg0 == 7) {
            ++field1886;
            int var2 = class6.field131;
            if (arg1) {
                var2 = 1;
            }
            for (int var3 = 0; ~var2 < ~var3; ++var3) {
                class123 var4;
                int var5;
                if (!arg1) {
                    var4 = class182.field3451[class53.field967[var3]];
                    var5 = class53.field967[var3] << 14;
                } else {
                    var4 = class41.field728;
                    var5 = 33538048;
                }
                if (var4 != null && var4.method885(5)) {
                    var4.field2416 = false;
                    if ((class97.field1858 && class6.field131 > 50 || class6.field131 > 200) && !arg1 && ~var4.field3507 == ~var4.field3491) {
                        var4.field2416 = true;
                    }
                    int var6 = var4.field3526 >> 7;
                    int var7 = var4.field3513 >> 7;
                    if (~var6 <= -1 && ~var6 > -105 && var7 >= 0 && var7 < 104) {
                        if (var4.field2405 != null && ~class49.field910 <= ~var4.field2404 && class49.field910 < var4.field2423) {
                            var4.field2416 = false;
                            var4.field2411 = class119.method864(var4.field3526, var4.field3513, class165.field3130, true);
                            class131.field2556.method584(class165.field3130, var4.field3526, var4.field3513, var4.field2411, 60, var4, var4.field3488, var5, var4.field2400, var4.field2407, var4.field2415, var4.field2398);
                        } else {
                            if ((var4.field3526 & 127) == 64 && (127 & var4.field3513) == 64) {
                                if (class160.field3070[var6][var7] == class112.field2194) {
                                    continue;
                                }
                                class160.field3070[var6][var7] = class112.field2194;
                            }
                            var4.field2411 = class119.method864(var4.field3526, var4.field3513, class165.field3130, true);
                            class131.field2556.method590(class165.field3130, var4.field3526, var4.field3513, var4.field2411, 60, var4, var4.field3488, var5, var4.field3534);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IB)V")
    public static final void method741(int arg0, byte arg1) {
        ++field1881;
        if (arg1 == -25) {
            if (class169.method1169(arg0, 0)) {
                class37.method259((byte) 116, class63.field1309[arg0], -1);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public static void method742(boolean arg0) {
        field1895 = null;
        field1884 = null;
        field1892 = null;
        if (!arg0) {
            field1884 = null;
        }
        field1885 = null;
        field1887 = null;
        field1888 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        int[][] var3 = super.field1207.method528(106, arg1);
        if (super.field1207.field1320) {
            int var4 = this.field1894 + this.field1894 + 1;
            int var5 = this.field1883 - (-this.field1883 + -1);
            int[][][] var6 = new int[var4][][];
            for (int var7 = arg1 - this.field1894; ~(this.field1894 + arg1) <= ~var7; ++var7) {
                int[][] var17 = this.method498(class137.field2679 & var7, 0, 0);
                int var18 = 0;
                int[][] var19 = new int[3][class98.field1879];
                int var20 = 0;
                int[] var21 = var17[0];
                int var22 = 0;
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field1883; var25 <= this.field1883; ++var25) {
                    int var35 = class187.field3571 & var25;
                    var18 += var21[var35];
                    var20 += var23[var35];
                    var22 += var24[var35];
                }
                int[] var26 = var19[0];
                int[] var27 = var19[1];
                int[] var28 = var19[2];
                int var29 = 0;
                while (var29 < class98.field1879) {
                    var26[var29] = var18 / var5;
                    var27[var29] = var20 / var5;
                    var28[var29] = var22 / var5;
                    int var30 = class187.field3571 & -this.field1883 + var29;
                    int var31 = var22 - var24[var30];
                    int var32 = var18 - var21[var30];
                    int var33 = var20 - var23[var30];
                    ++var29;
                    int var34 = this.field1883 + var29 & class187.field3571;
                    var22 = var24[var34] + var31;
                    var18 = var21[var34] + var32;
                    var20 = var23[var34] + var33;
                }
                var6[var7 - (-this.field1894 + arg1)] = var19;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class98.field1879; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var4 < ~var15; ++var15) {
                    int[][] var16 = var6[var15];
                    var14 += var16[2][var11];
                    var12 += var16[1][var11];
                    var13 += var16[0][var11];
                }
                var8[var11] = var13 / var4;
                var9[var11] = var12 / var4;
                var10[var11] = var14 / var4;
            }
        }
        ++field1882;
        if (!arg0) {
            this.method37(false, 49);
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static final void method743(int arg0) {
        ++field1889;
        if (class145.field2841 == 22) {
            int var1 = class179.field3377.method400(255);
            int var2 = (var1 & 7) + class23.field392;
            int var3 = ((var1 & 112) >> 4) + class77.field1601;
            int var4 = class179.field3377.method405(2);
            int var5 = class179.field3377.method405(arg0 + 6);
            int var6 = class179.field3377.method405(2);
            if (var3 >= 0 && ~var2 <= -1 && var3 < 104 && var2 < 104) {
                class165 var7 = class111.field2144[class165.field3130][var3][var2];
                if (var7 != null) {
                    for (class34 var8 = (class34) var7.method1109((byte) -113); var8 != null; var8 = (class34) var7.method1115((byte) 96)) {
                        if (~(32767 & var4) == ~var8.field642 && var8.field652 == var5) {
                            var8.field652 = var6;
                            break;
                        }
                    }
                    class121.method870(var2, -99999999, var3);
                }
            }
        } else if (class145.field2841 == 157) {
            int var9 = class179.field3377.method433((byte) -28);
            int var10 = class77.field1601 - -(7 & var9 >> 4);
            int var11 = (var9 & 7) + class23.field392;
            int var12 = class179.field3377.method423((byte) -90);
            int var13 = class179.field3377.method405(2);
            if (~var10 <= -1 && ~var11 <= -1 && ~var10 > -105 && var11 < 104) {
                class34 var14 = new class34();
                var14.field642 = var12;
                var14.field652 = var13;
                if (class111.field2144[class165.field3130][var10][var11] == null) {
                    class111.field2144[class165.field3130][var10][var11] = new class165();
                }
                class111.field2144[class165.field3130][var10][var11].method1112(-1250931468, var14);
                class121.method870(var11, -99999999, var10);
            }
        } else if (~class145.field2841 == -40) {
            int var15 = class179.field3377.method400(255);
            int var16 = var15 >> 2;
            int var17 = class18.field288[var16];
            int var18 = var15 & 3;
            int var19 = class179.field3377.method405(arg0 ^ -2);
            int var20 = class179.field3377.method424((byte) -102);
            int var21 = (var20 & 7) + class23.field392;
            int var22 = ((114 & var20) >> 4) + class77.field1601;
            if (~var22 <= -1 && ~var21 <= -1 && ~var22 > -104 && var21 < 103) {
                if (~var17 == -1) {
                    class72 var23 = class131.field2556.method578(class165.field3130, var22, var21);
                    if (var23 != null) {
                        int var24 = (536866803 & var23.field1424) >> 14;
                        if (var16 == 2) {
                            var23.field1435 = new class119(var24, 2, var18 + 4, class165.field3130, var22, var21, var19, false, var23.field1435);
                            var23.field1438 = new class119(var24, 2, 3 & var18 + 1, class165.field3130, var22, var21, var19, false, var23.field1438);
                        } else {
                            var23.field1435 = new class119(var24, var16, var18, class165.field3130, var22, var21, var19, false, var23.field1435);
                        }
                    }
                }
                if (~var17 == -2) {
                    class106 var25 = class131.field2556.method581(class165.field3130, var22, var21);
                    if (var25 != null) {
                        int var26 = (var25.field2078 & 536861103) >> 14;
                        if (var16 != 4 && var16 != 5) {
                            if (var16 != 6) {
                                if (var16 == 7) {
                                    var25.field2068 = new class119(var26, 4, (var18 + 2 & 3) + 4, class165.field3130, var22, var21, var19, false, var25.field2068);
                                } else if (~var16 == -9) {
                                    var25.field2068 = new class119(var26, 4, var18 + 4, class165.field3130, var22, var21, var19, false, var25.field2068);
                                    var25.field2076 = new class119(var26, 4, (var18 + 2 & 3) + 4, class165.field3130, var22, var21, var19, false, var25.field2076);
                                }
                            } else {
                                var25.field2068 = new class119(var26, 4, var18 - -4, class165.field3130, var22, var21, var19, false, var25.field2068);
                            }
                        } else {
                            var25.field2068 = new class119(var26, 4, var18, class165.field3130, var22, var21, var19, false, var25.field2068);
                        }
                    }
                }
                if (var17 == 2) {
                    if (~var16 == -12) {
                        var16 = 10;
                    }
                    class4 var27 = class131.field2556.method587(class165.field3130, var22, var21);
                    if (var27 != null) {
                        var27.field63 = new class119(var27.field68 >> 14 & 32767, var16, var18, class165.field3130, var22, var21, var19, false, var27.field63);
                    }
                }
                if (var17 == 3) {
                    class122 var28 = class131.field2556.method597(class165.field3130, var22, var21);
                    if (var28 != null) {
                        var28.field2386 = new class119((536856846 & var28.field2397) >> 14, 22, var18, class165.field3130, var22, var21, var19, false, var28.field2386);
                    }
                }
            }
        } else if (class145.field2841 == 175) {
            int var29 = class179.field3377.method400(arg0 + 259);
            int var30 = (7 & var29 >> 4) + class77.field1601;
            int var31 = (7 & var29) + class23.field392;
            int var32 = class179.field3377.method405(arg0 ^ -2);
            int var33 = class179.field3377.method400(255);
            int var34 = class179.field3377.method405(2);
            if (var30 >= 0 && var31 >= 0 && ~var30 > -105 && var31 < 104) {
                int var35 = var30 * 128 + 64;
                int var36 = var31 * 128 + 64;
                class58 var37 = new class58(var32, class165.field3130, var35, var36, -var33 + class119.method864(var35, var36, class165.field3130, true), var34, class49.field910);
                class134.field2596.method1112(-1250931468, var37);
            }
        } else if (~class145.field2841 == -115) {
            int var38 = class179.field3377.method400(255);
            int var39 = (7 & var38) + class23.field392;
            int var40 = class77.field1601 - -((118 & var38) >> 4);
            int var41 = var40 - -class179.field3377.method388(-29381);
            int var42 = var39 + class179.field3377.method388(-29381);
            int var43 = class179.field3377.method421((byte) 57);
            int var44 = class179.field3377.method405(2);
            int var45 = 4 * class179.field3377.method400(255);
            int var46 = 4 * class179.field3377.method400(255);
            int var47 = class179.field3377.method405(2);
            int var48 = class179.field3377.method405(2);
            int var49 = class179.field3377.method400(255);
            int var50 = class179.field3377.method400(arg0 + 259);
            if (var40 >= 0 && ~var39 <= -1 && var40 < 104 && ~var39 > -105 && var41 >= 0 && ~var42 <= -1 && ~var41 > -105 && ~var42 > -105 && ~var44 != -65536) {
                int var51 = var39 * 128 + 64;
                int var52 = var41 * 128 + 64;
                int var53 = var40 * 128 + 64;
                class18 var54 = new class18(var44, class165.field3130, var53, var51, class119.method864(var53, var51, class165.field3130, true) - var45, class49.field910 + var47, class49.field910 + var48, var49, var50, var43, var46);
                int var55 = var42 * 128 + 64;
                var54.method115(var55, var52, (byte) 22, class119.method864(var52, var55, class165.field3130, true) - var46, var47 - -class49.field910);
                class106.field2075.method1112(-1250931468, var54);
            }
        } else {
            if (arg0 != -4) {
                field1888 = null;
            }
            if (~class145.field2841 == -84) {
                int var56 = class179.field3377.method398((byte) 19);
                int var57 = class179.field3377.method393((byte) 25);
                int var58 = class77.field1601 - -((127 & var57) >> 4);
                int var59 = class23.field392 - -(var57 & 7);
                int var60 = class179.field3377.method424((byte) 55);
                int var61 = var60 >> 2;
                int var62 = 3 & var60;
                int var63 = class18.field288[var61];
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && ~var59 > -105) {
                    class166.method1134(var59, -1, var62, var56, 0, var58, class165.field3130, var61, var63, true);
                }
            } else if (~class145.field2841 == -149) {
                int var64 = class179.field3377.method405(2);
                int var65 = class179.field3377.method423((byte) -90);
                int var66 = class179.field3377.method405(2);
                int var67 = class179.field3377.method433((byte) -8);
                int var68 = class23.field392 - -(7 & var67);
                int var69 = (var67 >> 4 & 7) + class77.field1601;
                if (~var69 <= -1 && ~var68 <= -1 && ~var69 > -105 && ~var68 > -105 && class69.field1397 != var64) {
                    class34 var70 = new class34();
                    var70.field642 = var65;
                    var70.field652 = var66;
                    if (class111.field2144[class165.field3130][var69][var68] == null) {
                        class111.field2144[class165.field3130][var69][var68] = new class165();
                    }
                    class111.field2144[class165.field3130][var69][var68].method1112(-1250931468, var70);
                    class121.method870(var68, -99999999, var69);
                }
            } else if (~class145.field2841 == -205) {
                int var71 = class179.field3377.method393((byte) 25);
                int var72 = ((var71 & 121) >> 4) + class77.field1601;
                int var73 = (7 & var71) + class23.field392;
                int var74 = class179.field3377.method405(2);
                if (~var72 <= -1 && ~var73 <= -1 && ~var72 > -105 && ~var73 > -105) {
                    class165 var75 = class111.field2144[class165.field3130][var72][var73];
                    if (var75 != null) {
                        for (class34 var76 = (class34) var75.method1109((byte) -92); var76 != null; var76 = (class34) var75.method1115((byte) -72)) {
                            if (~(var74 & 32767) == ~var76.field642) {
                                var76.method915(arg0 ^ -4);
                                break;
                            }
                        }
                        if (var75.method1109((byte) -92) == null) {
                            class111.field2144[class165.field3130][var72][var73] = null;
                        }
                        class121.method870(var73, arg0 + -99999995, var72);
                    }
                }
            } else {
                if (~class145.field2841 == -173) {
                    byte var77 = class179.field3377.method416((byte) -77);
                    int var78 = class179.field3377.method398((byte) 21);
                    int var79 = class179.field3377.method393((byte) 25);
                    int var80 = var79 >> 2;
                    int var81 = class18.field288[var80];
                    int var82 = var79 & 3;
                    int var83 = class179.field3377.method423((byte) -90);
                    int var84 = class179.field3377.method423((byte) -90);
                    int var85 = class179.field3377.method424((byte) -44);
                    int var86 = class77.field1601 - -((var85 & 126) >> 4);
                    int var87 = (7 & var85) + class23.field392;
                    byte var88 = class179.field3377.method401((byte) -105);
                    int var89 = class179.field3377.method398((byte) 45);
                    byte var90 = class179.field3377.method401((byte) -98);
                    byte var91 = class179.field3377.method441((byte) -114);
                    class123 var92;
                    if (class69.field1397 != var84) {
                        var92 = class182.field3451[var84];
                    } else {
                        var92 = class41.field728;
                    }
                    if (var92 != null) {
                        class145 var93 = class170.method1185((byte) 63, var83);
                        int var94;
                        int var95;
                        if (var82 != 1 && var82 != 3) {
                            var94 = var93.field2825;
                            var95 = var93.field2832;
                        } else {
                            var94 = var93.field2832;
                            var95 = var93.field2825;
                        }
                        int var96 = (var94 + 1 >> 1) + var86;
                        int var97 = (var94 >> 1) + var86;
                        int[][] var98 = class74.field1511[class165.field3130];
                        int var99 = (var95 >> 1) + var87;
                        int var100 = (var95 + 1 >> 1) + var87;
                        int var101 = var98[var96][var99] + var98[var97][var99] + var98[var96][var100] + var98[var97][var100] >> 2;
                        int var102 = (var86 << 7) - -(var94 << 6);
                        int var103 = (var87 << 7) + (var95 << 6);
                        class126 var104 = var93.method996(var98, var102, var101, arg0 ^ 3, var82, var80, var103);
                        if (var104 != null) {
                            if (var77 < var88) {
                                byte var105 = var88;
                                var88 = var77;
                                var77 = var105;
                            }
                            if (var91 < var90) {
                                byte var106 = var90;
                                var90 = var91;
                                var91 = var106;
                            }
                            class166.method1134(var87, var89 + 1, 0, -1, var78 + 1, var86, class165.field3130, 0, var81, true);
                            var92.field2419 = var101;
                            var92.field2398 = var87 + var91;
                            var92.field2404 = class49.field910 + var78;
                            var92.field2407 = var87 + var90;
                            var92.field2400 = var86 + var88;
                            var92.field2399 = var86 * 128 + var94 * 64;
                            var92.field2415 = var77 + var86;
                            var92.field2425 = var87 * 128 + var95 * 64;
                            var92.field2423 = var89 - -class49.field910;
                            var92.field2405 = var104;
                        }
                    }
                }
                if (~class145.field2841 == -70) {
                    int var107 = class179.field3377.method400(255);
                    int var108 = (var107 >> 4 & 7) + class77.field1601;
                    int var109 = class23.field392 - -(var107 & 7);
                    int var110 = class179.field3377.method405(2);
                    int var111 = class179.field3377.method400(arg0 + 259);
                    int var112 = var111 >> 4 & 15;
                    int var113 = var111 & 7;
                    int var114 = class179.field3377.method400(255);
                    if (var108 >= 0 && ~var109 <= -1 && var108 < 104 && var109 < 104) {
                        int var115 = var112 + 1;
                        if (class41.field728.field3554[0] >= -var115 + var108 && class41.field728.field3554[0] <= var108 - -var115 && ~(-var115 + var109) >= ~class41.field728.field3521[0] && class41.field728.field3521[0] <= var109 + var115 && class57.field1115 != 0 && var113 > 0 && ~class38.field691 > -51) {
                            class200.field3974[class38.field691] = var110;
                            class154.field2970[class38.field691] = var113;
                            class46.field833[class38.field691] = var114;
                            class129.field2536[class38.field691] = null;
                            class189.field3584[class38.field691] = (var108 << 16) + (var109 << 8) + var112;
                            ++class38.field691;
                        }
                    }
                }
                if (class145.field2841 == 64) {
                    int var116 = class179.field3377.method393((byte) 25);
                    int var117 = (7 & var116 >> 4) + class77.field1601;
                    int var118 = class23.field392 - -(var116 & 7);
                    int var119 = class179.field3377.method393((byte) 25);
                    int var120 = var119 & 3;
                    int var121 = var119 >> 2;
                    int var122 = class18.field288[var121];
                    if (var117 >= 0 && ~var118 <= -1 && var117 < 104 && ~var118 > -105) {
                        class166.method1134(var118, -1, var120, -1, 0, var117, class165.field3130, var121, var122, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBI)V")
    public static final void method744(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 60) {
            field1895 = null;
        }
        ++field1891;
        class121.method872(false);
        class17.method90(arg3, arg0, arg3 - -class95.field1832.field1852, class95.field1832.field1849 + arg0);
        if (~class67.field1366 != -3 && ~class67.field1366 != -6) {
            int var4 = class41.field728.field3526 / 32 + 48;
            int var5 = client.field515 + class132.field2590 & 2047;
            int var6 = -(class41.field728.field3513 / 32) + 464;
            class8.field152.method1066(arg3 + 25, arg0 + 5, 146, 151, var4, var6, var5, class193.field3731 + 256, class100.field1908, class32.field594);
            for (int var7 = 0; ~var7 > ~class82.field1668; ++var7) {
                int var37 = class41.field724[var7] * 4 - -2 - class41.field728.field3526 / 32;
                int var38 = class102.field1982[var7] * 4 + (2 - class41.field728.field3513 / 32);
                class4.method24(var37, class62.field1280[var7], (byte) 14, arg0, var38, arg3);
            }
            for (int var8 = 0; ~var8 > -105; ++var8) {
                for (int var33 = 0; var33 < 104; ++var33) {
                    class165 var34 = class111.field2144[class165.field3130][var8][var33];
                    if (var34 != null) {
                        int var35 = var33 * 4 + -(class41.field728.field3513 / 32) - -2;
                        int var36 = var8 * 4 + -(class41.field728.field3526 / 32) + 2;
                        class4.method24(var36, class5.field93[0], (byte) 14, arg0, var35, arg3);
                    }
                }
            }
            for (int var9 = 0; ~var9 > ~class98.field1880; ++var9) {
                class154 var29 = class124.field2434[class58.field1186[var9]];
                if (var29 != null && var29.method885(5)) {
                    class77 var30 = var29.field2958;
                    if (var30 != null && var30.field1598 != null) {
                        var30 = var30.method637(-41);
                    }
                    if (var30 != null && var30.field1570 && var30.field1565) {
                        int var31 = var29.field3513 / 32 + -(class41.field728.field3513 / 32);
                        int var32 = var29.field3526 / 32 + -(class41.field728.field3526 / 32);
                        class4.method24(var32, class5.field93[1], (byte) 14, arg0, var31, arg3);
                    }
                }
            }
            for (int var10 = 0; var10 < class6.field131; ++var10) {
                class123 var21 = class182.field3451[class53.field967[var10]];
                if (var21 != null && var21.method885(5)) {
                    int var22 = var21.field3526 / 32 + -(class41.field728.field3526 / 32);
                    int var23 = var21.field3513 / 32 + -(class41.field728.field3513 / 32);
                    boolean var24 = false;
                    long var25 = var21.field2412.method1133((byte) 30);
                    for (int var27 = 0; ~var27 > ~class189.field3609; ++var27) {
                        if (class154.field2964[var27] == var25 && class121.field2374[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (~class41.field728.field2417 != -1 && ~var21.field2417 != -1 && class41.field728.field2417 == var21.field2417) {
                        var28 = true;
                    }
                    if (!var24) {
                        if (!var28) {
                            class4.method24(var22, class5.field93[2], (byte) 14, arg0, var23, arg3);
                        } else {
                            class4.method24(var22, class5.field93[4], (byte) 14, arg0, var23, arg3);
                        }
                    } else {
                        class4.method24(var22, class5.field93[3], (byte) 14, arg0, var23, arg3);
                    }
                }
            }
            if (class180.field3411 != 0 && ~(class49.field910 % 20) > -11) {
                if (~class180.field3411 == -2 && ~class103.field2023 <= -1 && ~class103.field2023 > ~class124.field2434.length) {
                    class154 var11 = class124.field2434[class103.field2023];
                    if (var11 != null) {
                        int var12 = var11.field3526 / 32 + -(class41.field728.field3526 / 32);
                        int var13 = var11.field3513 / 32 + -(class41.field728.field3513 / 32);
                        class64.method536(class12.field234[1], var12, 119, var13, arg0, arg3);
                    }
                }
                if (~class180.field3411 == -3) {
                    int var14 = (-class170.field3279 + class88.field1742) * 4 + -(class41.field728.field3526 / 32) + 2;
                    int var15 = (-class147.field2901 + class43.field776) * 4 + -(class41.field728.field3513 / 32) - -2;
                    class64.method536(class12.field234[1], var14, 119, var15, arg0, arg3);
                }
                if (~class180.field3411 == -11 && ~class81.field1656 <= -1 && ~class182.field3451.length < ~class81.field1656) {
                    class123 var16 = class182.field3451[class81.field1656];
                    if (var16 != null) {
                        int var17 = var16.field3526 / 32 + -(class41.field728.field3526 / 32);
                        int var18 = var16.field3513 / 32 - class41.field728.field3513 / 32;
                        class64.method536(class12.field234[1], var17, -107, var18, arg0, arg3);
                    }
                }
            }
            if (~class16.field276 != -1) {
                int var19 = class16.field276 * 4 + 2 - class41.field728.field3526 / 32;
                int var20 = class32.field595 * 4 + 2 - class41.field728.field3513 / 32;
                class4.method24(var19, class12.field234[0], (byte) 14, arg0, var20, arg3);
            }
            class17.method91(arg3 + 4 - -93, arg0 - -82 + -4, 3, 3, 16777215);
        } else {
            class17.method100(arg3 + 25, arg0 + 5, 0, class100.field1908, class32.field594);
        }
        if (class67.field1366 < 3) {
            class106.field2072.method1066(arg3, arg0, 33, 33, 25, 25, client.field515, 256, class196.field3898, class172.field3297);
        } else {
            class17.method100(arg3, arg0, 0, class196.field3898, class172.field3297);
        }
        if (class156.field2993[arg1]) {
            class95.field1832.method731(arg3, arg0);
        }
        class95.field1834[arg1] = true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            this.method41((class53) null, (byte) 114, -111);
        }
        int[] var3 = super.field1219.method721(arg0, -126);
        if (super.field1219.field1816) {
            int var4 = this.field1883 + 1 - -this.field1883;
            int var5 = this.field1894 + this.field1894 + 1;
            int[][] var6 = new int[var5][];
            for (int var7 = -this.field1894 + arg0; var7 <= this.field1894 + arg0; ++var7) {
                int[] var11 = this.method499(0, var7 & class137.field2679, 0);
                int[] var12 = new int[class98.field1879];
                int var13 = 0;
                for (int var14 = -this.field1883; ~this.field1883 <= ~var14; ++var14) {
                    var13 += var11[var14 & class187.field3571];
                }
                int var15 = 0;
                while (class98.field1879 > var15) {
                    var12[var15] = var13 / var4;
                    int var16 = var13 - var11[class187.field3571 & -this.field1883 + var15];
                    ++var15;
                    var13 = var11[class187.field3571 & this.field1883 + var15] + var16;
                }
                var6[this.field1894 + var7 + -arg0] = var12;
            }
            for (int var8 = 0; var8 < class98.field1879; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~var5; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var5;
            }
        }
        ++field1890;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }
}
