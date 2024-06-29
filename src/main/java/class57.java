import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class57 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field998 = 0;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Z")
    public static boolean field1000 = false;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Ljd;")
    private static class85 field1001 = class221.method1499("white:", (byte) 108);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljd;")
    public static class85 field997 = field1001;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Ljd;")
    public static class85 field995 = field1001;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[Lfg;")
    public static class12[] field999;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method382(int arg0) {
        field996++;
        if (class181.field3100 == 248) {
            int var1 = class189.field3249.method1711((byte) -67);
            int var2 = var1 >> 2;
            int var3 = class202.field3529[var2];
            int var4 = class189.field3249.method1678(false);
            int var5 = var1 & 0x3;
            int var6 = class201.field3504 + (var4 >> 4 & 0x7);
            int var7 = class50.field878 + (var4 & 0x7);
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class32.method219(-1, var3, var2, var7, var5, var6, -14, -1, 0, class116.field2066);
            }
        } else if (class181.field3100 == 30) {
            int var8 = class189.field3249.method1683(-2);
            int var9 = class189.field3249.method1694((byte) -100);
            int var10 = class189.field3249.method1670(2000376200);
            int var11 = class189.field3249.method1687(90);
            int var12 = ((var11 & 0x75) >> 4) + class201.field3504;
            int var13 = class50.field878 + (var11 & 0x7);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && class213.field3748 != var10) {
                class1 var14 = new class1();
                var14.field11 = var9;
                var14.field9 = var8;
                if (class191.field3278[class116.field2066][var12][var13] == null) {
                    class191.field3278[class116.field2066][var12][var13] = new class15();
                }
                class191.field3278[class116.field2066][var12][var13].method116((byte) -121, new class226(var14));
                class212.method1457((byte) 109, var13, var12);
            }
        } else if (class181.field3100 == 160) {
            int var15 = class189.field3249.method1711((byte) -67);
            int var16 = class201.field3504 * 2 + ((var15 & 0xFE) >> 4);
            int var17 = (var15 & 0xF) + class50.field878 * 2;
            int var18 = class189.field3249.method1690(true) + var16;
            int var19 = class189.field3249.method1690(true) + var17;
            int var20 = class189.field3249.method1677(true);
            int var21 = class189.field3249.method1694((byte) -100);
            int var22 = class189.field3249.method1711((byte) -67) * 4;
            int var23 = class189.field3249.method1711((byte) -67) * 4;
            int var24 = class189.field3249.method1694((byte) -100);
            int var25 = class189.field3249.method1694((byte) -100);
            int var26 = class189.field3249.method1711((byte) -67);
            int var27 = class189.field3249.method1711((byte) -67);
            if (var16 >= 0 && var17 >= 0 && var16 < 208 && var17 < 208 && var18 >= 0 && var19 >= 0 && var18 < 208 && var19 < 208 && var21 != 65535) {
                int var28 = var19 * 64;
                int var29 = var17 * 64;
                int var30 = var16 * 64;
                int var31 = var18 * 64;
                class25 var32 = new class25(var21, class116.field2066, var30, var29, class246.method1660(604124551, var30, class116.field2066, var29) - var22, class151.field2555 + var24, class151.field2555 + var25, var26, var27, var20, var23);
                var32.method166(class246.method1660(604124551, var31, class116.field2066, var28) - var23, class151.field2555 + var24, 104, var31, var28);
                class195.field3327.method116((byte) -121, new class33(var32));
            }
        } else if (class181.field3100 == 106) {
            int var33 = class189.field3249.method1711((byte) -67);
            int var34 = ((var33 & 0x7F) >> 4) + class201.field3504;
            int var35 = (var33 & 0x7) + class50.field878;
            int var36 = var34 + class189.field3249.method1690(true);
            int var37 = class189.field3249.method1690(true) + var35;
            int var38 = class189.field3249.method1677(true);
            int var39 = class189.field3249.method1694((byte) -100);
            int var40 = class189.field3249.method1711((byte) -67) * 4;
            int var41 = class189.field3249.method1711((byte) -67) * 4;
            int var42 = class189.field3249.method1694((byte) -100);
            int var43 = class189.field3249.method1694((byte) -100);
            int var44 = class189.field3249.method1711((byte) -67);
            int var45 = class189.field3249.method1711((byte) -67);
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var39 != 65535) {
                int var46 = var37 * 128 + 64;
                int var47 = var36 * 128 + 64;
                int var48 = var34 * 128 + 64;
                int var49 = var35 * 128 + 64;
                class25 var50 = new class25(var39, class116.field2066, var48, var49, class246.method1660(604124551, var48, class116.field2066, var49) - var40, class151.field2555 + var42, class151.field2555 + var43, var44, var45, var38, var41);
                var50.method166(class246.method1660(604124551, var47, class116.field2066, var46) - var41, class151.field2555 + var42, 64, var47, var46);
                class195.field3327.method116((byte) -121, new class33(var50));
            }
        } else if (class181.field3100 == 99) {
            int var51 = class189.field3249.method1687(110);
            int var52 = ((var51 & 0x72) >> 4) + class201.field3504;
            int var53 = (var51 & 0x7) + class50.field878;
            int var54 = class189.field3249.method1697(65280);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                class15 var55 = class191.field3278[class116.field2066][var52][var53];
                if (var55 != null) {
                    for (class226 var56 = (class226) var55.method110(64); var56 != null; var56 = (class226) var55.method117((byte) 56)) {
                        if ((var54 & 0x7FFF) == var56.field3929.field9) {
                            var56.method1753(137);
                            break;
                        }
                    }
                    if (var55.method110(64) == null) {
                        class191.field3278[class116.field2066][var52][var53] = null;
                    }
                    class212.method1457((byte) -112, var53, var52);
                }
            }
        } else if (class181.field3100 == 175) {
            int var57 = class189.field3249.method1711((byte) -67);
            int var58 = (var57 & 0x7) + class50.field878;
            int var59 = ((var57 & 0x72) >> 4) + class201.field3504;
            int var60 = class189.field3249.method1694((byte) -100);
            if (var60 == 65535) {
                var60 = -1;
            }
            int var61 = class189.field3249.method1711((byte) -67);
            int var62 = (var61 & 0xFD) >> 4;
            int var63 = var61 & 0x7;
            int var64 = class189.field3249.method1711((byte) -67);
            if (var59 >= 0 && var58 >= 0 && var59 < 104 && var58 < 104) {
                int var65 = var62 + 1;
                if ((var59 - var65) <= class22.field308.field1043[0] && class22.field308.field1043[0] <= (var59 + var65) && class22.field308.field1066[0] >= var58 - var65 && var58 + var65 >= class22.field308.field1066[0] && class182.field3109 != 0 && var63 > 0 && class127.field2229 < 50 && var60 != -1) {
                    class108.field1917[class127.field2229] = var60;
                    class59.field1071[class127.field2229] = var63;
                    class193.field3304[class127.field2229] = var64;
                    class40.field638[class127.field2229] = null;
                    class167.field2871[class127.field2229] = (var58 << 8) + (var59 << 16) + var62;
                    class127.field2229++;
                }
            }
        } else if (class181.field3100 == 252) {
            int var66 = class189.field3249.method1711((byte) -67);
            int var67 = ((var66 & 0x77) >> 4) + class201.field3504;
            int var68 = (var66 & 0x7) + class50.field878;
            int var69 = class189.field3249.method1694((byte) -100);
            int var70 = class189.field3249.method1694((byte) -100);
            int var71 = class189.field3249.method1694((byte) -100);
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                class15 var72 = class191.field3278[class116.field2066][var67][var68];
                if (var72 != null) {
                    for (class226 var73 = (class226) var72.method110(64); var73 != null; var73 = (class226) var72.method117((byte) 48)) {
                        class1 var74 = var73.field3929;
                        if ((var69 & 0x7FFF) == var74.field9 && var74.field11 == var70) {
                            var74.field11 = var71;
                            break;
                        }
                    }
                    class212.method1457((byte) 64, var68, var67);
                }
            }
        } else {
            if (class181.field3100 == 118) {
                byte var75 = class189.field3249.method1690(true);
                byte var76 = class189.field3249.method1671(87);
                int var77 = class189.field3249.method1678(false);
                int var78 = (var77 >> 4 & 0x7) + class201.field3504;
                int var79 = class50.field878 + (var77 & 0x7);
                int var80 = class189.field3249.method1697(65280);
                int var81 = class189.field3249.method1694((byte) -100);
                int var82 = class189.field3249.method1687(91);
                int var83 = var82 >> 2;
                int var84 = class202.field3529[var83];
                int var85 = var82 & 0x3;
                int var86 = class189.field3249.method1697(65280);
                byte var87 = class189.field3249.method1696(true);
                int var88 = class189.field3249.method1670(2000376200);
                byte var89 = class189.field3249.method1717(false);
                class44 var90;
                if (class213.field3748 == var86) {
                    var90 = class22.field308;
                } else {
                    var90 = class249.field4291[var86];
                }
                if (var90 != null) {
                    class199 var91 = class110.method753(var81, (byte) -84);
                    int[][] var92 = class245.field4193[class116.field2066];
                    int[][] var93 = null;
                    int var94;
                    int var95;
                    if (var85 == 1 || var85 == 3) {
                        var94 = var91.field3464;
                        var95 = var91.field3473;
                    } else {
                        var94 = var91.field3473;
                        var95 = var91.field3464;
                    }
                    if (class116.field2066 < 3) {
                        var93 = class245.field4193[class116.field2066 + 1];
                    }
                    int var96 = (var95 + 1 >> 1) + var79;
                    int var97 = (var94 >> 1) + var78;
                    int var98 = (var94 + 1 >> 1) + var78;
                    int var99 = (var79 << 7) + (var95 << 6);
                    int var100 = (var95 >> 1) + var79;
                    int var101 = (var78 << 7) + (var94 << 6);
                    int var102 = var92[var97][var100] + var92[var98][var100] - (-var92[var97][var96] + -var92[var98][var96]) >> 2;
                    class235 var103 = var91.method1361(var83, var85, var99, var91.field3461, (byte) -92, (class103) null, var102, false, var92, var101, var93);
                    if (var103 != null) {
                        class32.method219(-1, var84, 0, var79, 0, var78, -14, var80 + 1, var88 + 1, class116.field2066);
                        var90.field778 = var78 * 128 + var94 * 64;
                        var90.field791 = var79 * 128 + var95 * 64;
                        if (var75 < var87) {
                            byte var104 = var87;
                            var87 = var75;
                            var75 = var104;
                        }
                        var90.field792 = var80 + class151.field2555;
                        var90.field772 = var75 + var78;
                        var90.field794 = var102;
                        var90.field776 = (class26) var103.field4062;
                        var90.field757 = var78 + var87;
                        if (var89 < var76) {
                            byte var105 = var76;
                            var76 = var89;
                            var89 = var105;
                        }
                        var90.field773 = class151.field2555 + var88;
                        var90.field788 = var79 + var89;
                        var90.field767 = var76 + var79;
                    }
                }
            }
            if (class181.field3100 == 89) {
                int var106 = class189.field3249.method1711((byte) -67);
                int var107 = var106 & 0x3;
                int var108 = var106 >> 2;
                int var109 = class202.field3529[var108];
                int var110 = class189.field3249.method1678(false);
                int var111 = ((var110 & 0x7A) >> 4) + class201.field3504;
                int var112 = (var110 & 0x7) + class50.field878;
                int var113 = class189.field3249.method1670(2000376200);
                if (var113 == 65535) {
                    var113 = -1;
                }
                class17.method127(var112, var107, var113, var109, var108, var111, class116.field2066, 3);
            } else if (class181.field3100 == 60) {
                int var114 = class189.field3249.method1711((byte) -67);
                int var115 = (var114 & 0x7) + class50.field878;
                int var116 = class201.field3504 + (var114 >> 4 & 0x7);
                int var117 = class189.field3249.method1694((byte) -100);
                int var118 = class189.field3249.method1711((byte) -67);
                int var119 = class189.field3249.method1694((byte) -100);
                if (var116 >= 0 && var115 >= 0 && var116 < 104 && var115 < 104) {
                    int var120 = var116 * 128 + 64;
                    int var121 = var115 * 128 + 64;
                    class48 var122 = new class48(var117, class116.field2066, var120, var121, class246.method1660(604124551, var120, class116.field2066, var121) - var118, var119, class151.field2555);
                    class213.field3738.method116((byte) -121, new class4(var122));
                }
            } else if (class181.field3100 == 85) {
                int var123 = class189.field3249.method1694((byte) -100);
                int var124 = class189.field3249.method1687(113);
                int var125 = (var124 >> 4 & 0x7) + class201.field3504;
                int var126 = (var124 & 0x7) + class50.field878;
                int var127 = class189.field3249.method1694((byte) -100);
                if (var125 >= 0 && var126 >= 0 && var125 < 104 && var126 < 104) {
                    class1 var128 = new class1();
                    var128.field11 = var127;
                    var128.field9 = var123;
                    if (class191.field3278[class116.field2066][var125][var126] == null) {
                        class191.field3278[class116.field2066][var125][var126] = new class15();
                    }
                    class191.field3278[class116.field2066][var125][var126].method116((byte) -121, new class226(var128));
                    class212.method1457((byte) -106, var126, var125);
                }
            } else if (class181.field3100 == 196) {
                int var129 = class189.field3249.method1687(100);
                int var130 = var129 >> 2;
                int var131 = var129 & 0x3;
                int var132 = class202.field3529[var130];
                int var133 = class189.field3249.method1687(113);
                int var134 = (var133 & 0x7) + class50.field878;
                int var135 = class201.field3504 + ((var133 & 0x72) >> 4);
                int var136 = class189.field3249.method1683(-2);
                if (var135 >= 0 && var134 >= 0 && var135 < 104 && var134 < 104) {
                    class32.method219(var136, var132, var130, var134, var131, var135, -14, -1, 0, class116.field2066);
                }
            } else if (arg0 > -25) {
                field1001 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZII)V")
    public static final void method383(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field994++;
        int var5 = 0;
        if (!arg2) {
            field1001 = null;
        }
        int var6 = arg1;
        class183.method1260(arg3, arg4 - arg1, -109, class146.field2488[arg0], arg1 + arg4);
        int var7 = -arg1;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class146.field2488[arg0 - var6];
                int[] var10 = class146.field2488[arg0 + var6];
                var7 -= var6 << 1;
                int var11 = arg4 - var5;
                int var12 = arg4 + var5;
                class183.method1260(arg3, var11, -22, var10, var12);
                class183.method1260(arg3, var11, 17, var9, var12);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class146.field2488[arg0 - var5];
            int[] var16 = class146.field2488[arg0 + var5];
            class183.method1260(arg3, var14, 82, var16, var13);
            class183.method1260(arg3, var14, -116, var15, var13);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method384(byte arg0) {
        field997 = null;
        field999 = null;
        if (arg0 >= -24) {
            field1000 = true;
        }
        field995 = null;
        field1001 = null;
    }
}
