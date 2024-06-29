import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class410 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "[I")
    public static int[] field5791 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field5796;

    // $FF: synthetic field
    @OriginalMember(owner = "client!im", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5799;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Z")
    public static boolean field5798;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5797;

    // $FF: synthetic method
    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2428(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V", line = 8)
    public static final void method2421(byte arg0, int arg1, int arg2) {
        field5796++;
        if (arg0 > -101) {
            field5791 = null;
        }
        class45 var3 = class354.method2094(arg1, (byte) -14, 16);
        var3.method260(9188);
        var3.field504 = arg2;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 24)
    public static void method2422(byte arg0) {
        field5791 = null;
        field5797 = null;
        if (arg0 >= -106) {
            field5798 = true;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IJ)V", line = 37)
    public static final void method2423(int arg0, long arg1) {
        try {
            if (arg0 != 32767) {
                field5797 = null;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field5790++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BIII)Z", line = 51)
    public static final boolean method2424(byte arg0, int arg1, int arg2, int arg3) {
        field5793++;
        class21 var4 = (class21) class38.method211(arg1, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class98.method695(true, var4);
        }
        class21 var6 = (class21) class248.method1622(arg1, arg3, arg2, field5799 == null ? (field5799 = method2428("nc")) : field5799);
        if (var6 != null) {
            var5 &= class98.method695(true, var6);
        }
        class21 var7 = (class21) class87.method628(arg1, arg3, arg2);
        if (var7 != null) {
            var5 &= class98.method695(true, var7);
        }
        return arg0 == 55 ? var5 : true;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 81)
    public static final void method2425(byte arg0) {
        class30.field357.method2354(class27.field328.method438((byte) -50), false);
        field5792++;
        class30.field357.method2354(class73.field896.method438((byte) -50), false);
        class30.field357.method2354(class390.field5478.method438((byte) -50), false);
        class30.field357.method2354(class403.field5661.method438((byte) -50), false);
        class30.field357.method2354(class477.field6643.method438((byte) -50), false);
        class30.field357.method2354(class189.field2710.method438((byte) -50), false);
        class30.field357.method2354(class75.field927.method438((byte) -50), false);
        class30.field357.method2354(class155.field2251.method438((byte) -50), false);
        class30.field357.method2354(class61.field761.method438((byte) -50), false);
        class30.field357.method2354(class535.field7846.method438((byte) -50), false);
        class30.field357.method2354(class492.field6958.method438((byte) -50), false);
        class30.field357.method2354(class497.field7040.method438((byte) -50), false);
        class30.field357.method2354(class324.field4734.method438((byte) -50), false);
        class30.field357.method2354(class478.field6666.method438((byte) -50), false);
        class30.field357.method2354(class39.field420.method438((byte) -50), false);
        class30.field357.method2354(class524.field7713.method438((byte) -50), false);
        class30.field357.method2354(class342.field4972.method438((byte) -50), false);
        class30.field357.method2354(class147.field1966.method438((byte) -50), false);
        class30.field357.method2354(class184.field2663.method438((byte) -50), false);
        class30.field357.method2354(class382.field5384.method438((byte) -50), false);
        class30.field357.method2354(class474.field6602.method438((byte) -50), false);
        class30.field357.method2354(class276.field4102.method438((byte) -50), false);
        class30.field357.method2354(class204.field2902.method438((byte) -50), false);
        class30.field357.method2354(class290.field4248.method438((byte) -50), false);
        class30.field357.method2354(class23.field307.method438((byte) -50), false);
        class30.field357.method2354(class334.field4837.method438((byte) -50), false);
        class30.field357.method2354(class486.field6776.method438((byte) -50), false);
        class30.field357.method2354(class73.field890.method438((byte) -50), false);
        class30.field357.method2354(class390.field5484.method438((byte) -50), false);
        if (arg0 < 14) {
            field5797 = null;
        }
        class30.field357.method2354(class278.field4122.method438((byte) -50), false);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 121)
    public static final void method2426(int arg0) {
        field5795++;
        if (class503.field7252 > 1) {
            class503.field7252--;
            class430.field6068 = class371.field5285;
        }
        if (class498.field7050) {
            class498.field7050 = false;
            class360.method2125(-123);
            return;
        }
        if (!class424.field5977) {
            class183.method1150(false);
        }
        for (int var1 = 0; var1 < 100 && class488.method2815(arg0); var1++) {
        }
        if (class488.field6832 != 9) {
            return;
        }
        class437.method2571(class30.field357, class271.field4022.method490(-107), true);
        if (class369.field5264 == null) {
            if (class465.method2699((byte) 14) >= class397.field5620) {
                class369.field5264 = class71.field884.method1393(class426.field5989.field5883, -22257);
            }
        } else if (class369.field5264.field495 != -1) {
            class61.method498(class372.field5301, arg0 ^ 0x1);
            class30.field357.method2372(class369.field5264.field495, arg0 - 128);
            class369.field5264 = null;
            class397.field5620 = class465.method2699((byte) 14) + 30000L;
        }
        class432 var2 = (class432) class323.field4718.method2655(arg0 ^ 0x3B30);
        if (var2 != null || class465.method2699((byte) 14) - 2000L > class260.field3847) {
            boolean var3 = false;
            int var4 = class30.field357.field5665;
            for (class432 var5 = (class432) class356.field5107.method2655(15152); var5 != null && (class30.field357.field5665 - var4) < 240; var5 = (class432) class356.field5107.method2660((byte) 67)) {
                var5.method2891(61);
                int var6 = var5.method1082(arg0 - 769);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1084((byte) -102);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1082(-769) == -1 && var5.method1084((byte) -102) == -1) {
                    var7 = -1;
                    var6 = -1;
                    var8 = true;
                }
                if (class30.field361 != var7 || class101.field1346 != var6) {
                    if (!var3) {
                        class184.field2656++;
                        class61.method498(class294.field4313, 1);
                        class30.field357.method2376((byte) 122, 0);
                        var4 = class30.field357.field5665;
                        var3 = true;
                    }
                    int var9 = var7 - class30.field361;
                    class30.field361 = var7;
                    int var10 = var6 - class101.field1346;
                    class101.field1346 = var6;
                    int var11 = (int) ((var5.method1081(arg0 ^ 0x7E) - class260.field3847) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class30.field357.method2372((var9 << 6) + (var11 << 12) + var10, 100);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        var9 += 128;
                        class30.field357.method2376((byte) 122, var11 + 128);
                        class30.field357.method2372((var9 << 8) + var10, -128);
                    } else if (var11 < 32) {
                        class30.field357.method2376((byte) 122, var11 + 192);
                        if (var8) {
                            class30.field357.method2354(Integer.MIN_VALUE, false);
                        } else {
                            class30.field357.method2354(var7 | var6 << 16, false);
                        }
                    } else {
                        class30.field357.method2372(var11 + 57344, 59);
                        if (var8) {
                            class30.field357.method2354(Integer.MIN_VALUE, false);
                        } else {
                            class30.field357.method2354(var6 << 16 | var7, false);
                        }
                    }
                    class260.field3847 = var5.method1081(127);
                }
            }
            if (var3) {
                class30.field357.method2349((byte) -77, class30.field357.field5665 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1081(127) - class176.field2532) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class176.field2532 = var2.method1081(126);
            int var14 = var2.method1082(-769);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1084((byte) -102);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1080((byte) 124) == 2) {
                var16 = 1;
            }
            class61.method498(class295.field4336, 1);
            class15.field193++;
            int var17 = (int) var12;
            class30.field357.method2372(var16 << 15 | var17, -17);
            class30.field357.method2329(var15 | var14 << 16, arg0 ^ 0x1DB7BF18);
        }
        if (class23.field302 > 0) {
            class391.field5489++;
            class61.method498(class359.field5143, 1);
            class30.field357.method2376((byte) 122, class23.field302 * 3);
            for (int var18 = 0; var18 < class23.field302; var18++) {
                class533 var19 = class217.field3150[var18];
                long var20 = (var19.method274((byte) 126) - class135.field1771) / 50L;
                class135.field1771 = var19.method274((byte) 66);
                if (var20 > 65535L) {
                    var20 = 65535L;
                }
                class30.field357.method2376((byte) 122, var19.method268((byte) -104));
                class30.field357.method2372((int) var20, arg0 ^ 0xFFFFFF81);
            }
        }
        if (class492.field6965 > 0) {
            class492.field6965--;
        }
        if (class264.field3877 && class492.field6965 <= 0) {
            class475.field6619++;
            class264.field3877 = false;
            class492.field6965 = 20;
            class61.method498(class170.field2469, arg0 ^ 0x1);
            class30.field357.method2372((int) class153.field2204 >> 3, arg0 ^ 0x22);
            class30.field357.method2336((int) class327.field4768 >> 3, -123);
        }
        if (class60.field745 && !class511.field7569) {
            class443.field6209++;
            class511.field7569 = true;
            class61.method498(class525.field7718, arg0 + 1);
            class30.field357.method2376((byte) 122, 1);
        }
        if (!class60.field745 && class511.field7569) {
            class443.field6209++;
            class511.field7569 = false;
            class61.method498(class525.field7718, 1);
            class30.field357.method2376((byte) 122, 0);
        }
        if (!class75.field946) {
            class61.method498(class527.field7745, arg0 + 1);
            class315.field4568++;
            class30.field357.method2376((byte) 122, 0);
            int var22 = class30.field357.field5665;
            class403 var23 = class4.field81.method1783(-119);
            class30.field357.method2363(0, var23.field5663, -1, var23.field5665);
            class30.field357.method2349((byte) -121, class30.field357.field5665 - var22);
            class75.field946 = true;
        }
        if (class268.field3910 != null) {
            if (class504.field7461 == 2) {
                class51.method405(-118);
            } else if (class504.field7461 == 3) {
                class197.method1248((byte) -124);
            }
        }
        if (class60.field746) {
            class60.field746 = false;
        } else {
            class431.field6092 /= 2.0F;
        }
        if (class110.field1501) {
            class110.field1501 = false;
        } else {
            class325.field4750 /= 2.0F;
        }
        class342.method2039((byte) -2);
        if (class488.field6832 != 9) {
            return;
        }
        class32.method194(true);
        class275.method1734(15911);
        class426.method2525(-94);
        class48.method279(-109);
        class184.field2664++;
        if (class184.field2664 > 750) {
            class360.method2125(-121);
            return;
        }
        class423.method2506((byte) -105);
        class107.method730(0);
        class119.method804((byte) -7);
        for (int var24 = class163.field2413.method2230(true, (byte) -126); var24 != -1; var24 = class163.field2413.method2230(false, (byte) -106)) {
            class343.method2045(arg0 ^ 0x5, var24);
            class290.field4249[class239.method1507(class125.field1689++, 31)] = var24;
        }
        for (class45 var25 = class248.method1624((byte) -50); var25 != null; var25 = class248.method1624((byte) -50)) {
            int var26 = var25.method263(-124);
            int var27 = var25.method258((byte) 66);
            if (var26 == 1) {
                class336.field4863[var27] = var25.field504;
                class363.field5189 |= class421.field5943[var27];
                class504.field7471[class239.method1507(31, class79.field1032++)] = var27;
            } else if (var26 == 2) {
                class538.field7867[var27] = var25.field503;
                class282.field4160[class239.method1507(31, class285.field4182++)] = var27;
            } else if (var26 == 3) {
                class150 var28 = client.method1276(83, var27);
                if (!var25.field503.equals(var28.field2150)) {
                    var28.field2150 = var25.field503;
                    class187.method1190(var28, arg0 ^ 0x60);
                }
            } else if (var26 == 4) {
                class150 var46 = client.method1276(79, var27);
                int var47 = var25.field504;
                int var48 = var25.field516;
                int var49 = var25.field510;
                if (var46.field2053 != var47 || var46.field2018 != var48 || var46.field2120 != var49) {
                    var46.field2120 = var49;
                    var46.field2053 = var47;
                    var46.field2018 = var48;
                    class187.method1190(var46, 103);
                }
            } else if (var26 == 5) {
                class150 var45 = client.method1276(91, var27);
                if (var25.field504 != var45.field2112 || var25.field504 == -1) {
                    var45.field2009 = 0;
                    var45.field2112 = var25.field504;
                    var45.field2140 = 1;
                    var45.field2060 = 0;
                    class187.method1190(var45, arg0 ^ 0x75);
                }
            } else if (var26 == 6) {
                int var39 = var25.field504;
                int var40 = (var39 & 0x7CBB) >> 10;
                int var41 = (var39 & 0x3F3) >> 5;
                int var42 = var39 & 0x1F;
                int var43 = (var42 << 3) + (var40 << 19) + (var41 << 11);
                class150 var44 = client.method1276(89, var27);
                if (var44.field1992 != var43) {
                    var44.field1992 = var43;
                    class187.method1190(var44, 108);
                }
            } else if (var26 == 7) {
                class150 var37 = client.method1276(arg0 ^ 0x77, var27);
                boolean var38 = var25.field504 == 1;
                if (var37.field2125 != var38) {
                    var37.field2125 = var38;
                    class187.method1190(var37, 118);
                }
            } else if (var26 == 8) {
                class150 var36 = client.method1276(110, var27);
                if (var25.field504 != var36.field2023 || var25.field516 != var36.field2133 || var25.field510 != var36.field2011) {
                    var36.field2011 = var25.field510;
                    var36.field2023 = var25.field504;
                    var36.field2133 = var25.field516;
                    if (var36.field2089 != -1) {
                        if (var36.field2027 > 0) {
                            var36.field2011 = var36.field2011 * 32 / var36.field2027;
                        } else if (var36.field2086 > 0) {
                            var36.field2011 = var36.field2011 * 32 / var36.field2086;
                        }
                    }
                    class187.method1190(var36, arg0 ^ 0x74);
                }
            } else if (var26 == 9) {
                class150 var35 = client.method1276(arg0 ^ 0x64, var27);
                if (var25.field504 != var35.field2089 || var25.field516 != var35.field1995) {
                    var35.field1995 = var25.field516;
                    var35.field2089 = var25.field504;
                    class187.method1190(var35, 96);
                }
            } else if (var26 == 10) {
                class150 var29 = client.method1276(93, var27);
                if (var25.field504 != var29.field2042 || var25.field516 != var29.field2082 || var25.field510 != var29.field2108) {
                    var29.field2108 = var25.field510;
                    var29.field2082 = var25.field516;
                    var29.field2042 = var25.field504;
                    class187.method1190(var29, 123);
                }
            } else if (var26 == 11) {
                class150 var30 = client.method1276(arg0 + 80, var27);
                var30.field1994 = 0;
                var30.field2058 = var30.field1989 = var25.field516;
                var30.field2073 = 0;
                var30.field2015 = var30.field2045 = var25.field504;
                class187.method1190(var30, 116);
            } else if (var26 == 12) {
                class150 var33 = client.method1276(86, var27);
                int var34 = var25.field504;
                if (var33 != null && var33.field2022 == 0) {
                    if (var33.field2019 - var33.field2033 < var34) {
                        var34 = var33.field2019 - var33.field2033;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field2111 != var34) {
                        var33.field2111 = var34;
                        class187.method1190(var33, arg0 ^ 0x60);
                    }
                }
            } else if (var26 == 14) {
                class150 var31 = client.method1276(arg0 ^ 0x4B, var27);
                var31.field2130 = var25.field504;
            } else if (var26 == 15) {
                class282.field4153 = var25.field516;
                class395.field5609 = true;
                class243.field3527 = var25.field504;
            } else if (var26 == 16) {
                class150 var32 = client.method1276(86, var27);
                var32.field2147 = var25.field504;
            }
        }
        if (class273.field4052 != arg0) {
            class476.field6633 += 20;
            if (class476.field6633 >= 400) {
                class273.field4052 = 0;
            }
        }
        class288.field4213++;
        if (class415.field5855 != null) {
            class242.field3522++;
            if (class242.field3522 >= 15) {
                class187.method1190(class415.field5855, 122);
                class415.field5855 = null;
            }
        }
        class378.field5357 = null;
        class532.field7810 = false;
        class508.field7531 = false;
        class76.field991 = null;
        class25.method163(null, false, -1, -1);
        class103.method709((byte) -121, -1, null, -1);
        if (!class427.field6024) {
            class432.field6097 = -1;
        }
        class304.method1853(39);
        class371.field5285++;
        if (class335.field4856) {
            class61.method498(class206.field2976, 1);
            class61.field759++;
            class30.field357.method2329(class169.field2465 << 14 | class176.field2528 << 28 | class519.field7647, 498581272);
            class335.field4856 = false;
        }
        while (true) {
            class389 var50;
            class150 var51;
            class150 var52;
            do {
                var50 = (class389) class469.field6558.method2654(-1);
                if (var50 == null) {
                    while (true) {
                        class389 var53;
                        class150 var54;
                        class150 var55;
                        do {
                            var53 = (class389) class91.field1133.method2654(-1);
                            if (var53 == null) {
                                while (true) {
                                    class389 var56;
                                    class150 var57;
                                    class150 var58;
                                    do {
                                        var56 = (class389) class64.field817.method2654(arg0 - 1);
                                        if (var56 == null) {
                                            if (class378.field5357 == null) {
                                                class171.field2480 = 0;
                                            }
                                            if (class471.field6573 != null) {
                                                class540.method3174(arg0 ^ 0x2);
                                            }
                                            if (class208.field3009 > 0 && class345.field5009.method870(82, -125) && class345.field5009.method870(81, arg0 - 120) && class30.field360 != 0) {
                                                int var59 = class246.field3587.field1904 - class30.field360;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class427.method2530(class246.field3587.field3378[0] + class367.field5241, class246.field3587.field3368[0] + class441.field6171, 63, var59);
                                            }
                                            class504.method3002((byte) 7);
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class129.field1722[var60]++;
                                            }
                                            if (class363.field5189 && class125.field1690 < (class465.method2699((byte) 14) - 60000L)) {
                                                class524.method3096((byte) 98);
                                            }
                                            for (class440 var61 = (class440) class466.field6510.method2748(2); var61 != null; var61 = (class440) class466.field6510.method2751(arg0 ^ 0xFFFFC0BD)) {
                                                if ((long) var61.field6146 < class465.method2699((byte) 14) / 1000L - 5L) {
                                                    if (var61.field6150 > 0) {
                                                        class92.method661(var61.field6151 + class383.field5389.method3116(class149.field1979, (byte) 118), -1, "", "", 5, 0);
                                                    }
                                                    if (var61.field6150 == 0) {
                                                        class92.method661(var61.field6151 + class244.field3544.method3116(class149.field1979, (byte) 100), -1, "", "", 5, 0);
                                                    }
                                                    var61.method1805((byte) 89);
                                                }
                                            }
                                            class310.field4518++;
                                            if (class310.field4518 > 500) {
                                                class310.field4518 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x4) == 4) {
                                                    class205.field2966 += class482.field6722;
                                                }
                                                if ((var62 & 0x2) == 2) {
                                                    class294.field4314 += class496.field7036;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class360.field5144 += class507.field7498;
                                                }
                                            }
                                            if (class360.field5144 < -50) {
                                                class507.field7498 = 2;
                                            }
                                            if (class360.field5144 > 50) {
                                                class507.field7498 = -2;
                                            }
                                            if (class294.field4314 < -55) {
                                                class496.field7036 = 2;
                                            }
                                            if (class294.field4314 > 55) {
                                                class496.field7036 = -2;
                                            }
                                            if (class205.field2966 < -40) {
                                                class482.field6722 = 1;
                                            }
                                            class538.field7866++;
                                            if (class205.field2966 > 40) {
                                                class482.field6722 = -1;
                                            }
                                            if (class538.field7866 > 500) {
                                                class538.field7866 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class460.field6441 += class181.field2599;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class98.field1304 += class524.field7706;
                                                }
                                            }
                                            if (class460.field6441 < -60) {
                                                class181.field2599 = 2;
                                            }
                                            if (class98.field1304 < -20) {
                                                class524.field7706 = 1;
                                            }
                                            if (class460.field6441 > 60) {
                                                class181.field2599 = -2;
                                            }
                                            class119.field1644++;
                                            if (class98.field1304 > 10) {
                                                class524.field7706 = -1;
                                            }
                                            if (class119.field1644 > 50) {
                                                class61.method498(class23.field301, 1);
                                                class29.field353++;
                                            }
                                            if (class198.field2816) {
                                                class153.method984(-119);
                                                class198.field2816 = false;
                                            }
                                            try {
                                                if (class50.field608 != null && class30.field357.field5665 > 0) {
                                                    class423.field5965 += class30.field357.field5665;
                                                    class50.field608.method1357(class30.field357.field5663, (byte) 40, class30.field357.field5665, 0);
                                                    class119.field1644 = 0;
                                                    class30.field357.field5665 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class360.method2125(-122);
                                                return;
                                            }
                                        }
                                        var57 = var56.field5457;
                                        if (var57.field2105 < 0) {
                                            break;
                                        }
                                        var58 = client.method1276(92, var57.field2071);
                                    } while (var58 == null || var58.field2110 == null || var57.field2105 >= var58.field2110.length || var58.field2110[var57.field2105] != var57);
                                    class495.method2866(var56);
                                }
                            }
                            var54 = var53.field5457;
                            if (var54.field2105 < 0) {
                                break;
                            }
                            var55 = client.method1276(120, var54.field2071);
                        } while (var55 == null || var55.field2110 == null || var54.field2105 >= var55.field2110.length || var55.field2110[var54.field2105] != var54);
                        class495.method2866(var53);
                    }
                }
                var51 = var50.field5457;
                if (var51.field2105 < 0) {
                    break;
                }
                var52 = client.method1276(arg0 + 74, var51.field2071);
            } while (var52 == null || var52.field2110 == null || var52.field2110.length <= var51.field2105 || var52.field2110[var51.field2105] != var51);
            class495.method2866(var50);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLoi;)V", line = 962)
    public static final void method2427(byte arg0, class53 arg1) {
        class536.field7850 = arg1;
        if (arg0 >= -8) {
            method2427((byte) 15, null);
        }
        field5794++;
    }
}
