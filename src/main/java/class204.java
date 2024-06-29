import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class204 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lnh;")
    private class115 field3625 = new class115();

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Ldd;")
    public static class247 field3627 = new class247(64);

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lud;")
    public static class279 field3635 = class130.method1024("compass", 255);

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Lud;")
    public static class279 field3636 = class130.method1024("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 255);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lud;")
    public static class279 field3631 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Z")
    public static boolean field3634 = false;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lnh;")
    private class115 field3637;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lok;")
    public static class149 field3633;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[[[I")
    public static int[][][] field3630;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lud;", line = 5)
    public static final class279 method1507(byte arg0) {
        if (arg0 != -16) {
            field3634 = true;
        }
        field3617++;
        class279 var1 = class124.field2256;
        class279 var2 = class60.field1265;
        if (class124.field2261 != 0) {
            var1 = class91.field1719;
        }
        if (class159.field2894 != null) {
            var2 = class115.method929(new class279[] { class304.field5398, class159.field2894 }, (byte) 60);
        }
        return class115.method929(new class279[] { class117.field2121, var1, class312.field5520, class191.method1447(5, class265.field4778), class282.field5042, class191.method1447(5, class52.field1077), var2, class283.field5046 }, (byte) 60);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIBIII[Lgf;I)V", line = 33)
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, class8[] arg8, int arg9) {
        if (class97.field1824) {
            class256.method1830(arg3, arg1, arg6, arg2);
        } else {
            class146.method1127(arg3, arg1, arg6, arg2);
            class27.method252();
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class8 var11 = arg8[var10];
            if (var11 != null && (var11.field324 == arg0 || arg0 == -1412584499 && class247.field4388 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class115.field2100[class14.field434] = var11.field167 + arg9;
                    class102.field1900[class14.field434] = var11.field264 + arg7;
                    class191.field3434[class14.field434] = var11.field220;
                    class249.field4436[class14.field434] = var11.field297;
                    var12 = class14.field434++;
                } else {
                    var12 = arg5;
                }
                var11.field269 = class8.field279;
                var11.field154 = var12;
                if (!var11.field223 || !client.method1800(var11)) {
                    if (var11.field326 > 0) {
                        class310.method2209((byte) -118, var11);
                    }
                    int var13 = var11.field264 + arg7;
                    int var14 = var11.field265;
                    int var15 = var11.field167 + arg9;
                    if (class205.field3641 && (client.method1798(var11).field4372 != 0 || var11.field201 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class247.field4388 == var11) {
                        if (arg0 != -1412584499 && !var11.field318) {
                            class117.field2136 = arg7;
                            class161.field2911 = arg8;
                            class60.field1260 = arg9;
                            continue;
                        }
                        if (!var11.field318) {
                            var14 = 128;
                        }
                        if (class194.field3490 && class251.field4486) {
                            int var16 = class130.field2363;
                            int var17 = class51.field1056;
                            int var18 = var16 - class28.field673;
                            if (class155.field2806 > var18) {
                                var18 = class155.field2806;
                            }
                            int var19 = var17 - class209.field3678;
                            if (var19 < class264.field4710) {
                                var19 = class264.field4710;
                            }
                            if ((class155.field2806 + class307.field5460.field220) < (var11.field220 + var18)) {
                                var18 = class155.field2806 + class307.field5460.field220 - var11.field220;
                            }
                            if ((class264.field4710 + class307.field5460.field297) < (var11.field297 + var19)) {
                                var19 = class264.field4710 - (var11.field297 - class307.field5460.field297);
                            }
                            var13 = var19;
                            var15 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field201 == 2) {
                        var20 = arg6;
                        var21 = arg1;
                        var22 = arg2;
                        var23 = arg3;
                    } else {
                        var23 = arg3 >= var15 ? arg3 : var15;
                        var21 = arg1 < var13 ? var13 : arg1;
                        int var24 = var11.field220 + var15;
                        int var25 = var11.field297 + var13;
                        if (var11.field201 == 9) {
                            var25++;
                            var24++;
                        }
                        var20 = var24 >= arg6 ? arg6 : var24;
                        var22 = arg2 <= var25 ? arg2 : var25;
                    }
                    if (!var11.field223 || var23 < var20 && var22 > var21) {
                        if (var11.field326 != 0) {
                            if (var11.field326 == 1337 || var11.field326 == 1403 && class97.field1824) {
                                class306.field5439 = var13;
                                class23.field597 = var11;
                                class126.field2341 = var15;
                                class304.method2150(-18314, var11.field297, var13, var11.field326 == 1403, var15, var11.field220);
                                if (class97.field1824) {
                                    class256.method1830(arg3, arg1, arg6, arg2);
                                } else {
                                    class146.method1127(arg3, arg1, arg6, arg2);
                                }
                                continue;
                            }
                            if (var11.field326 == 1338) {
                                if (!var11.method62(0)) {
                                    continue;
                                }
                                class260.method1860(var13, arg4 ^ 0xFFFFD3FE, var12, var15, var11);
                                if (class97.field1824) {
                                    class256.method1830(arg3, arg1, arg6, arg2);
                                } else {
                                    class146.method1127(arg3, arg1, arg6, arg2);
                                }
                                if (client.field4470 != 0 && client.field4470 != 3 || class238.field4184 || var23 > class100.field1876 || var21 > class200.field3573 || class100.field1876 >= var20 || class200.field3573 >= var22) {
                                    continue;
                                }
                                int var41 = class100.field1876 - var15;
                                int var42 = class200.field3573 - var13;
                                int var43 = var11.field251[var42];
                                if (var43 > var41 || (var11.field200[var42] + var43) < var41) {
                                    continue;
                                }
                                int var44 = var41 - var11.field220 / 2;
                                int var45 = class212.field3714 + class126.field2349 & 0x7FF;
                                int var46 = var42 - var11.field297 / 2;
                                int var47 = class27.field654[var45];
                                int var48 = class27.field642[var45];
                                int var49 = (class5.field122 + 256) * var48 >> 8;
                                int var50 = (class5.field122 + 256) * var47 >> 8;
                                int var51 = var46 * var50 + (var44 * var49) >> 11;
                                int var52 = class72.field1420.field86 + var51 >> 7;
                                int var53 = var46 * var49 - var44 * var50 >> 11;
                                int var54 = class72.field1420.field79 - var53 >> 7;
                                if (class38.field848 && (class271.field4839 & 0x40) != 0) {
                                    class8 var55 = class103.method868(arg4 + 130, class236.field4107, class315.field5545);
                                    if (var55 == null) {
                                        class17.method151(62);
                                    } else {
                                        class245.method1750(class230.field4016, (short) 9, 1L, (byte) -102, var52, class73.field1447, class244.field4332, var54);
                                    }
                                    continue;
                                }
                                if (class214.field3764 == 1) {
                                    class245.method1750(-1, (short) 43, 1L, (byte) 127, var52, class60.field1265, class192.field3468, var54);
                                }
                                class245.method1750(-1, (short) 11, 1L, (byte) -77, var52, class60.field1265, class13.field415, var54);
                                continue;
                            }
                            if (var11.field326 == 1339) {
                                if (var11.method62(0)) {
                                    class29.method267(var11, var12, (byte) -80, var15, var13);
                                    if (class97.field1824) {
                                        class256.method1830(arg3, arg1, arg6, arg2);
                                    } else {
                                        class146.method1127(arg3, arg1, arg6, arg2);
                                    }
                                }
                                continue;
                            }
                            if (var11.field326 == 1400) {
                                class222.method1632(var13, 127, var15, var11.field220, var11.field297);
                                class71.field1398[var12] = true;
                                class249.field4446[var12] = true;
                                if (class97.field1824) {
                                    class256.method1830(arg3, arg1, arg6, arg2);
                                } else {
                                    class146.method1127(arg3, arg1, arg6, arg2);
                                }
                                continue;
                            }
                            if (var11.field326 == 1401) {
                                class209.method1536(var11.field297, -111, var13, var11.field220, var15);
                                class71.field1398[var12] = true;
                                class249.field4446[var12] = true;
                                if (class97.field1824) {
                                    class256.method1830(arg3, arg1, arg6, arg2);
                                } else {
                                    class146.method1127(arg3, arg1, arg6, arg2);
                                }
                                continue;
                            }
                            if (var11.field326 == 1402) {
                                if (!class97.field1824) {
                                    class218.method1597(var15, var13, (byte) -10);
                                    class71.field1398[var12] = true;
                                    class249.field4446[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field326 == 1405) {
                                if (!class140.field2549) {
                                    continue;
                                }
                                int var26 = var11.field220 + var15;
                                int var27 = var13 + 15;
                                class133.field2428.method415(class115.method929(new class279[] { class117.field2132, class191.method1447(arg4 - 115, class318.field5584) }, (byte) 60), var26, var27, 16776960, -1);
                                int var141 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class133.field2428.method415(class115.method929(new class279[] { class7.field136, class191.method1447(5, var29), class209.field3691 }, (byte) 60), var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class97.field1824) {
                                    int var31 = 16776960;
                                    int var32 = (class308.field5473 + class308.field5468 + class308.field5471) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class133.field2428.method415(class115.method929(new class279[] { class75.field1477, class191.method1447(arg4 - 115, var32), class209.field3691 }, (byte) 60), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class252.field4501[var37].method1658(false);
                                    var35 += class252.field4501[var37].method1660(73);
                                    var36 += class252.field4501[var37].method1657(arg4 - 199);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class279 var40 = class115.method929(new class279[] { class223.field3944, class90.method778(true, (long) var39, 0, 2, (byte) -75), class255.field4546, class191.method1447(5, var38), class115.field2104 }, (byte) 60);
                                class109.field2015.method415(var40, var26, var27, var33, -1);
                                class71.field1398[var12] = true;
                                var27 += 12;
                                class249.field4446[var12] = true;
                                continue;
                            }
                            if (var11.field326 == 1406) {
                                class218.field3855 = var11;
                                class321.field5612 = var13;
                                class75.field1473 = var15;
                                continue;
                            }
                        }
                        if (!class238.field4184) {
                            if (var11.field201 == 0 && var11.field262 && var23 <= class100.field1876 && class200.field3573 >= var21 && class100.field1876 < var20 && class200.field3573 < var22 && !class205.field3641) {
                                class171.field3089[0] = class141.field2565;
                                class184.field3373[0] = class60.field1265;
                                class271.field4828[0] = 1004;
                                class75.field1469[0] = class222.field3935;
                                class194.field3488 = 1;
                            }
                            if (var23 <= class100.field1876 && class200.field3573 >= var21 && var20 > class100.field1876 && var22 > class200.field3573) {
                                class37.method332(var11, class200.field3573 - var13, -var15 + class100.field1876, -2);
                            }
                        }
                        if (var11.field201 == 0) {
                            if (!var11.field223 && client.method1800(var11) && class111.field2048 != var11) {
                                continue;
                            }
                            if (!var11.field223) {
                                if (var11.field243 > (var11.field267 - var11.field297)) {
                                    var11.field243 = var11.field267 - var11.field297;
                                }
                                if (var11.field243 < 0) {
                                    var11.field243 = 0;
                                }
                            }
                            method1508(var11.field299, var21, var22, var23, (byte) 120, var12, var20, var13 - var11.field243, arg8, var15 - var11.field212);
                            if (var11.field159 != null) {
                                method1508(var11.field299, var21, var22, var23, (byte) 120, var12, var20, var13 - var11.field243, var11.field159, var15 - var11.field212);
                            }
                            class176 var56 = (class176) class226.field3977.method610((long) var11.field299, -1);
                            if (var56 != null) {
                                if (var56.field3163 == 0 && !class238.field4184 && var23 <= class100.field1876 && class200.field3573 >= var21 && class100.field1876 < var20 && class200.field3573 < var22 && !class205.field3641) {
                                    class75.field1469[0] = class222.field3935;
                                    class194.field3488 = 1;
                                    class171.field3089[0] = class141.field2565;
                                    class184.field3373[0] = class60.field1265;
                                    class271.field4828[0] = 1004;
                                }
                                class272.method1938(var15, var23, var20, var12, (byte) -125, var21, var22, var13, var56.field3165);
                            }
                            if (class97.field1824) {
                                class256.method1830(arg3, arg1, arg6, arg2);
                            } else {
                                class146.method1127(arg3, arg1, arg6, arg2);
                                class27.method252();
                            }
                        }
                        if (class271.field4834[var12] || class157.field2885 > 1) {
                            if (var11.field201 == 0 && !var11.field223 && var11.field297 < var11.field267) {
                                class170.method1324(var13, var11.field267, 118, var11.field220 + var15, var11.field243, var11.field297);
                            }
                            if (var11.field201 != 1) {
                                if (var11.field201 == 2) {
                                    int var124 = 0;
                                    for (int var125 = 0; var125 < var11.field204; var125++) {
                                        for (int var126 = 0; var126 < var11.field218; var126++) {
                                            int var127 = (var11.field176 + 32) * var125 + var13;
                                            int var128 = (var11.field295 + 32) * var126 + var15;
                                            if (var124 < 20) {
                                                var128 += var11.field209[var124];
                                                var127 += var11.field214[var124];
                                            }
                                            if (var11.field319[var124] > 0) {
                                                boolean var130 = false;
                                                boolean var131 = false;
                                                int var132 = var11.field319[var124] - 1;
                                                if (arg3 < (var128 + 32) && var128 < arg6 && arg1 < (var127 + 32) && arg2 > var127 || class302.field5373 == var11 && class174.field3132 == var124) {
                                                    class70 var133;
                                                    if (class98.field1839 == 1 && class178.field3209 == var124 && class290.field5161 == var11.field299) {
                                                        var133 = class83.method722(var132, var11.field332[var124], arg4 ^ 0xFFFFD0E3, 2, var11.field301, 0);
                                                    } else {
                                                        var133 = class83.method722(var132, var11.field332[var124], -12133, 1, var11.field301, 3153952);
                                                    }
                                                    if (class27.field652) {
                                                        class71.field1398[var12] = true;
                                                    }
                                                    if (var133 == null) {
                                                        class50.method426(var11, false);
                                                    } else if (class302.field5373 == var11 && class174.field3132 == var124) {
                                                        int var134 = class130.field2363 - class96.field1793;
                                                        int var135 = class51.field1056 - class173.field3114;
                                                        if (var134 < 5 && var134 > -5) {
                                                            var134 = 0;
                                                        }
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        if (class207.field3664 < 5) {
                                                            var134 = 0;
                                                            var135 = 0;
                                                        }
                                                        var133.method582(var128 + var134, var127 + var135, 128);
                                                        if (arg0 != -1) {
                                                            class8 var136 = arg8[arg0 & 0xFFFF];
                                                            int var137;
                                                            int var138;
                                                            if (class97.field1824) {
                                                                var137 = class256.field4559;
                                                                var138 = class256.field4557;
                                                            } else {
                                                                var137 = class146.field2636;
                                                                var138 = class146.field2642;
                                                            }
                                                            if ((var127 + var135) < var138 && var136.field243 > 0) {
                                                                int var139 = (var138 - var127 - var135) * class121.field2187 / 3;
                                                                if ((class121.field2187 * 10) < var139) {
                                                                    var139 = class121.field2187 * 10;
                                                                }
                                                                if (var136.field243 < var139) {
                                                                    var139 = var136.field243;
                                                                }
                                                                var136.field243 -= var139;
                                                                class173.field3114 += var139;
                                                                class50.method426(var136, false);
                                                            }
                                                            if (var137 < var127 + var135 + 32 && (var136.field267 - var136.field297) > var136.field243) {
                                                                int var140 = (var127 + var135 + 32 - var137) * class121.field2187 / 3;
                                                                if (var140 > (class121.field2187 * 10)) {
                                                                    var140 = class121.field2187 * 10;
                                                                }
                                                                if ((var136.field267 - var136.field297 - var136.field243) < var140) {
                                                                    var140 = var136.field267 - var136.field243 - var136.field297;
                                                                }
                                                                var136.field243 += var140;
                                                                class173.field3114 -= var140;
                                                                class50.method426(var136, false);
                                                            }
                                                        }
                                                    } else if (class184.field3384 == var11 && class144.field2606 == var124) {
                                                        var133.method582(var128, var127, 128);
                                                    } else {
                                                        var133.method584(var128, var127);
                                                    }
                                                }
                                            } else if (var11.field322 != null && var124 < 20) {
                                                class70 var129 = var11.method59((byte) -106, var124);
                                                if (var129 != null) {
                                                    var129.method584(var128, var127);
                                                } else if (class13.field402) {
                                                    class50.method426(var11, false);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                } else if (var11.field201 == 3) {
                                    int var123;
                                    if (class254.method1820(var11, -4)) {
                                        var123 = var11.field304;
                                        if (class111.field2048 == var11 && var11.field236 != 0) {
                                            var123 = var11.field236;
                                        }
                                    } else {
                                        var123 = var11.field248;
                                        if (class111.field2048 == var11 && var11.field280 != 0) {
                                            var123 = var11.field280;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field169) {
                                            if (class97.field1824) {
                                                class256.method1827(var15, var13, var11.field220, var11.field297, var123);
                                            } else {
                                                class146.method1110(var15, var13, var11.field220, var11.field297, var123);
                                            }
                                        } else if (class97.field1824) {
                                            class256.method1839(var15, var13, var11.field220, var11.field297, var123);
                                        } else {
                                            class146.method1124(var15, var13, var11.field220, var11.field297, var123);
                                        }
                                    } else if (var11.field169) {
                                        if (class97.field1824) {
                                            class256.method1828(var15, var13, var11.field220, var11.field297, var123, 256 - (var14 & 0xFF));
                                        } else {
                                            class146.method1126(var15, var13, var11.field220, var11.field297, var123, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class97.field1824) {
                                        class256.method1836(var15, var13, var11.field220, var11.field297, var123, 256 - (var14 & 0xFF));
                                    } else {
                                        class146.method1106(var15, var13, var11.field220, var11.field297, var123, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field201 == 4) {
                                    class49 var57 = var11.method58(class198.field3540, arg4 ^ 0x52);
                                    if (var57 != null) {
                                        class279 var58 = var11.field181;
                                        int var59;
                                        if (class254.method1820(var11, -4)) {
                                            var59 = var11.field304;
                                            if (class111.field2048 == var11 && var11.field236 != 0) {
                                                var59 = var11.field236;
                                            }
                                            if (var11.field293.method1984(8) > 0) {
                                                var58 = var11.field293;
                                            }
                                        } else {
                                            var59 = var11.field248;
                                            if (class111.field2048 == var11 && var11.field280 != 0) {
                                                var59 = var11.field280;
                                            }
                                        }
                                        if (var11.field223 && var11.field173 != -1) {
                                            class157 var60 = class220.method1612(-2254, var11.field173);
                                            var58 = var60.field2861;
                                            if (var58 == null) {
                                                var58 = class113.field2071;
                                            }
                                            if ((var60.field2848 == 1 || var11.field234 != 1) && var11.field234 != -1) {
                                                var58 = class115.method929(new class279[] { class269.field4816, var58, class122.field2205, class182.method1406((byte) -109, var11.field234) }, (byte) 60);
                                            }
                                        }
                                        if (class320.field5597 == var11) {
                                            var58 = class163.field2937;
                                            var59 = var11.field248;
                                        }
                                        if (!var11.field223) {
                                            var58 = class273.method1942(var58, var11, 0);
                                        }
                                        var57.method410(var58, var15, var13, var11.field220, var11.field297, var59, var11.field221 ? 0 : -1, var11.field275, var11.field186, var11.field174);
                                    } else if (class13.field402) {
                                        class50.method426(var11, false);
                                    }
                                } else if (var11.field201 == 5) {
                                    if (var11.field223) {
                                        class70 var108;
                                        if (var11.field173 == -1) {
                                            var108 = var11.method61(-10823, false);
                                        } else {
                                            var108 = class83.method722(var11.field173, var11.field234, arg4 ^ 0xFFFFD0E3, var11.field310, var11.field301, var11.field235);
                                        }
                                        if (var108 != null) {
                                            int var109 = var108.field1386;
                                            int var110 = var108.field1381;
                                            if (var11.field157) {
                                                int var112 = (var11.field220 + var109 - 1) / var109;
                                                int var113 = (-(-var110 - var11.field297) - 1) / var110;
                                                if (class97.field1824) {
                                                    class256.method1835(var15, var13, var15 + var11.field220, var11.field297 + var13);
                                                    boolean var116 = class14.method100(111, var108.field1377);
                                                    boolean var117 = class14.method100(95, var108.field1375);
                                                    class203 var118 = (class203) var108;
                                                    if (var116 && var117) {
                                                        if (var14 == 0) {
                                                            var118.method1506(var15, var13, var112, var113);
                                                        } else {
                                                            var118.method1505(var15, var13, 256 - (var14 & 0xFF), var112, var113);
                                                        }
                                                    } else if (var116) {
                                                        for (int var122 = 0; var122 < var113; var122++) {
                                                            if (var14 == 0) {
                                                                var118.method1506(var15, var110 * var122 + var13, var112, 1);
                                                            } else {
                                                                var118.method1505(var15, var110 * var122 + var13, -(var14 & 0xFF) + 256, var112, 1);
                                                            }
                                                        }
                                                    } else if (var117) {
                                                        for (int var121 = 0; var121 < var112; var121++) {
                                                            if (var14 == 0) {
                                                                var118.method1506(var109 * var121 + var15, var13, 1, var113);
                                                            } else {
                                                                var118.method1505(var15 + (var109 * var121), var13, 256 - (var14 & 0xFF), 1, var113);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var119 = 0; var119 < var112; var119++) {
                                                            for (int var120 = 0; var120 < var113; var120++) {
                                                                if (var14 == 0) {
                                                                    var108.method584(var109 * var119 + var15, var13 - -(var110 * var120));
                                                                } else {
                                                                    var108.method582(var15 + (var109 * var119), var110 * var120 + var13, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class256.method1830(arg3, arg1, arg6, arg2);
                                                } else {
                                                    class146.method1107(var15, var13, var15 + var11.field220, var11.field297 + var13);
                                                    for (int var114 = 0; var114 < var112; var114++) {
                                                        for (int var115 = 0; var115 < var113; var115++) {
                                                            if (var11.field283 != 0) {
                                                                var108.method617(var109 / 2 + var109 * var114 + var15, arg4 ^ 0x68, 4096, var11.field283, var110 / 2 + var110 * var115 + var13);
                                                            } else if (var14 == 0) {
                                                                var108.method584(var109 * var114 + var15, var110 * var115 + var13);
                                                            } else {
                                                                var108.method582(var15 + (var109 * var114), var110 * var115 + var13, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class146.method1127(arg3, arg1, arg6, arg2);
                                                }
                                            } else {
                                                int var111 = var11.field220 * 4096 / var109;
                                                if (var11.field283 != 0) {
                                                    var108.method617(var11.field220 / 2 + var15, 16, var111, var11.field283, var11.field297 / 2 + var13);
                                                } else if (var14 != 0) {
                                                    var108.method574(var15, var13, var11.field220, var11.field297, 256 - (var14 & 0xFF));
                                                } else if (var11.field220 == var109 && var11.field297 == var110) {
                                                    var108.method584(var15, var13);
                                                } else {
                                                    var108.method581(var15, var13, var11.field220, var11.field297);
                                                }
                                            }
                                        } else if (class13.field402) {
                                            class50.method426(var11, false);
                                        }
                                    } else {
                                        class70 var107 = var11.method61(arg4 - 10943, class254.method1820(var11, -4));
                                        if (var107 != null) {
                                            var107.method584(var15, var13);
                                        } else if (class13.field402) {
                                            class50.method426(var11, false);
                                        }
                                    }
                                } else if (var11.field201 == 6) {
                                    boolean var61 = class254.method1820(var11, -4);
                                    int var62;
                                    if (var61) {
                                        var62 = var11.field258;
                                    } else {
                                        var62 = var11.field191;
                                    }
                                    class19 var63 = null;
                                    int var64 = 0;
                                    if (var11.field173 != -1) {
                                        class157 var65 = class220.method1612(arg4 - 2374, var11.field173);
                                        if (var65 != null) {
                                            class157 var66 = var65.method1230(5, var11.field234);
                                            class182 var67 = var62 == -1 ? null : class131.method1033((byte) -82, var62);
                                            var63 = var66.method1229(1, var67, var11.field222, -83, var11.field298, var11.field217);
                                            if (var63 == null) {
                                                class50.method426(var11, false);
                                            } else {
                                                var64 = -var63.method184() / 2;
                                            }
                                        }
                                    } else if (var11.field238 == 5) {
                                        if (var11.field274 == -1) {
                                            var63 = class251.field4480.method373(-1, 0, -1, -1, -1, true, 0, (class182) null, (class182) null, -1, (class266[]) null);
                                        } else {
                                            int var69 = var11.field274 & 0x7FF;
                                            if (class79.field1506 == var69) {
                                                var69 = 2047;
                                            }
                                            class239 var70 = class96.field1780[var69];
                                            class182 var71 = var62 == -1 ? null : class131.method1033((byte) -82, var62);
                                            if (var70 != null && ((int) var70.field4197.method2013(arg4 - 14) << 11) == (var11.field274 & 0xFFFFF800)) {
                                                var63 = var70.field4189.method373(-1, 0, var11.field217, -1, 0, true, 0, (class182) null, var71, -1, (class266[]) null);
                                            }
                                        }
                                    } else if (var62 == -1) {
                                        var63 = var11.method48(-1, var61, 0, (class182) null, true, -1, class72.field1420.field4189);
                                        if (var63 == null && class13.field402) {
                                            class50.method426(var11, false);
                                        }
                                    } else {
                                        class182 var68 = class131.method1033((byte) -82, var62);
                                        var63 = var11.method48(var11.field298, var61, var11.field222, var68, true, var11.field217, class72.field1420.field4189);
                                        if (var63 == null && class13.field402) {
                                            class50.method426(var11, false);
                                        }
                                    }
                                    if (var63 != null) {
                                        int var72;
                                        if (var11.field249 <= 0) {
                                            var72 = 256;
                                        } else {
                                            var72 = (var11.field220 << 8) / var11.field249;
                                        }
                                        int var73;
                                        if (var11.field229 > 0) {
                                            var73 = (var11.field297 << 8) / var11.field229;
                                        } else {
                                            var73 = 256;
                                        }
                                        int var74 = (var11.field190 * var73 >> 8) + (var13 + (var11.field297 / 2));
                                        int var75 = var11.field220 / 2 + var15 + (var11.field325 * var72 >> 8);
                                        if (class97.field1824) {
                                            if (var11.field282) {
                                                class97.method812(var75, var74, var11.field225, var11.field184, var72, var73);
                                            } else {
                                                class97.method805(var75, var74, var72, var73);
                                                class97.method827((float) var11.field194, (float) var11.field184 * 1.5F);
                                            }
                                            class97.method808();
                                            class97.method839(true);
                                            class97.method822(false);
                                            class209.method1540(class253.field4519, false);
                                            if (class280.field5006) {
                                                class256.method1838();
                                                class97.method832();
                                                class256.method1830(arg3, arg1, arg6, arg2);
                                                class280.field5006 = false;
                                            }
                                            if (var11.field320) {
                                                class97.method831();
                                            }
                                            int var78 = class27.field654[var11.field237] * var11.field225 >> 16;
                                            int var79 = class27.field642[var11.field237] * var11.field225 >> 16;
                                            if (var11.field223) {
                                                var63.method161(0, var11.field227, var11.field242, var11.field237, var11.field254, var64 + var78 + var11.field291, var11.field291 + var79, -1L);
                                            } else {
                                                var63.method161(0, var11.field227, 0, var11.field237, 0, var78, var79, -1L);
                                            }
                                            if (var11.field320) {
                                                class97.method824();
                                            }
                                        } else {
                                            class27.method237(var75, var74);
                                            int var76 = class27.field642[var11.field237] * var11.field225 >> 16;
                                            int var77 = class27.field654[var11.field237] * var11.field225 >> 16;
                                            if (!var11.field223) {
                                                var63.method161(0, var11.field227, 0, var11.field237, 0, var77, var76, -1L);
                                            } else if (var11.field282) {
                                                ((class242) var63).method1733(0, var11.field227, var11.field242, var11.field237, var11.field254, var11.field291 + var64 + var77, var11.field291 + var76, var11.field225);
                                            } else {
                                                var63.method161(0, var11.field227, var11.field242, var11.field237, var11.field254, var77 + var64 + var11.field291, var11.field291 + var76, -1L);
                                            }
                                            class27.method249();
                                        }
                                    }
                                } else {
                                    if (var11.field201 == 7) {
                                        class49 var80 = var11.method58(class198.field3540, 115);
                                        if (var80 == null) {
                                            if (class13.field402) {
                                                class50.method426(var11, false);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var11.field204; var82++) {
                                            for (int var83 = 0; var83 < var11.field218; var83++) {
                                                if (var11.field319[var81] > 0) {
                                                    class157 var84 = class220.method1612(-2254, var11.field319[var81] - 1);
                                                    class279 var85;
                                                    if (var84.field2848 != 1 && var11.field332[var81] == 1) {
                                                        var85 = class115.method929(new class279[] { class269.field4816, var84.field2861, class178.field3206 }, (byte) 60);
                                                    } else {
                                                        var85 = class115.method929(new class279[] { class269.field4816, var84.field2861, class122.field2205, class182.method1406((byte) -119, var11.field332[var81]) }, (byte) 60);
                                                    }
                                                    int var86 = (var11.field295 + 115) * var83 + var15;
                                                    int var87 = (var11.field176 + 12) * var82 + var13;
                                                    if (var11.field275 == 0) {
                                                        var80.method419(var85, var86, var87, var11.field248, var11.field221 ? 0 : -1);
                                                    } else if (var11.field275 == 1) {
                                                        var80.method409(var85, var86 + 57, var87, var11.field248, var11.field221 ? 0 : -1);
                                                    } else {
                                                        var80.method415(var85, var86 + 114, var87, var11.field248, var11.field221 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var11.field201 == 8 && class141.field2563 == var11 && class51.field1055 == class144.field2603) {
                                        int var88 = 0;
                                        class49 var89 = class133.field2428;
                                        int var90 = 0;
                                        class279 var91 = var11.field181;
                                        class279 var92 = class273.method1942(var91, var11, 0);
                                        while (var92.method1984(8) > 0) {
                                            int var93 = var92.method1989(class195.field3516, (byte) -72);
                                            class279 var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = class60.field1265;
                                            } else {
                                                var94 = var92.method2009((byte) -84, 0, var93);
                                                var92 = var92.method1988((byte) -47, var93 + 4);
                                            }
                                            int var95 = var89.method411(var94);
                                            var88 += var89.field995 + 1;
                                            if (var95 > var90) {
                                                var90 = var95;
                                            }
                                        }
                                        var88 += 7;
                                        var90 += 6;
                                        int var96 = var11.field297 + var13 + 5;
                                        int var97 = var15 - (-var11.field220 + var90) - 5;
                                        if (var88 + var96 > arg2) {
                                            var96 = arg2 - var88;
                                        }
                                        if (var97 < (var15 + 5)) {
                                            var97 = var15 + 5;
                                        }
                                        if (var90 + var97 > arg6) {
                                            var97 = arg6 - var90;
                                        }
                                        if (class97.field1824) {
                                            class256.method1827(var97, var96, var90, var88, 16777120);
                                            class256.method1839(var97, var96, var90, var88, 0);
                                        } else {
                                            class146.method1110(var97, var96, var90, var88, 16777120);
                                            class146.method1124(var97, var96, var90, var88, 0);
                                        }
                                        int var98 = var96 + var89.field995 + 2;
                                        class279 var99 = var11.field181;
                                        class279 var100 = class273.method1942(var99, var11, 0);
                                        while (var100.method1984(8) > 0) {
                                            int var101 = var100.method1989(class195.field3516, (byte) -72);
                                            class279 var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = class60.field1265;
                                            } else {
                                                var102 = var100.method2009((byte) -84, 0, var101);
                                                var100 = var100.method1988((byte) -113, var101 + 4);
                                            }
                                            var89.method419(var102, var97 + 3, var98, 0, -1);
                                            var98 += var89.field995 + 1;
                                        }
                                    }
                                    if (var11.field201 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var11.field244) {
                                            var103 = var11.field220 + var15;
                                            var104 = var11.field297 + var13;
                                            var105 = var13;
                                            var106 = var15;
                                        } else {
                                            var104 = var13;
                                            var105 = var11.field297 + var13;
                                            var103 = var11.field220 + var15;
                                            var106 = var15;
                                        }
                                        if (var11.field321 == 1) {
                                            if (class97.field1824) {
                                                class256.method1840(var106, var104, var103, var105, var11.field248);
                                            } else {
                                                class146.method1112(var106, var104, var103, var105, var11.field248);
                                            }
                                        } else if (class97.field1824) {
                                            class256.method1837(var106, var104, var103, var105, var11.field248, var11.field321);
                                        } else {
                                            class146.method1113(var106, var104, var103, var105, var11.field248, var11.field321);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != 120) {
            method1512(119);
        }
        field3622++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 1310)
    public static final void method1509(int arg0) {
        class246.field4376.method1334((byte) -25);
        field3618++;
        class132.field2409.method1334((byte) -25);
        if (arg0 > -92) {
            field3630 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)V", line = 1329)
    public static final void method1510(long arg0, int arg1) {
        field3626++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class238.method1714(-23227, arg0 - 1L);
            class238.method1714(-23227, 1L);
        } else {
            class238.method1714(-23227, arg0);
        }
        if (arg1 != 1) {
            field3633 = (class149) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Lnh;", line = 1351)
    public final class115 method1511(byte arg0) {
        field3623++;
        class115 var2 = this.field3625.field2105;
        if (this.field3625 == var2) {
            this.field3637 = null;
            return null;
        }
        if (arg0 < 58) {
            this.method1515(-107);
        }
        this.field3637 = var2.field2105;
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 1372)
    public static void method1512(int arg0) {
        field3627 = null;
        field3633 = null;
        field3631 = null;
        field3630 = (int[][][]) null;
        field3636 = null;
        if (arg0 != -1) {
            field3633 = (class149) null;
        }
        field3635 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnh;I)V", line = 1390)
    public final void method1513(class115 arg0, int arg1) {
        if (arg0.field2094 != null) {
            arg0.method926((byte) -8);
        }
        arg0.field2105 = this.field3625;
        field3616++;
        arg0.field2094 = this.field3625.field2094;
        arg0.field2094.field2105 = arg0;
        arg0.field2105.field2094 = arg0;
        if (arg1 != 256) {
            method1508(-13, -90, -108, -102, (byte) -26, -122, -111, 117, (class8[]) null, -52);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I", line = 1409)
    public final int method1514(int arg0) {
        int var2 = 0;
        class115 var3 = this.field3625.field2105;
        if (arg0 != 20822) {
            method1512(79);
        }
        field3621++;
        while (this.field3625 != var3) {
            var3 = var3.field2105;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)Lnh;", line = 1430)
    public final class115 method1515(int arg0) {
        field3619++;
        class115 var2 = this.field3637;
        if (arg0 > -104) {
            this.method1515(-93);
        }
        if (this.field3625 == var2) {
            this.field3637 = null;
            return null;
        } else {
            this.field3637 = var2.field2105;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 1453)
    public final void method1516(int arg0) {
        while (true) {
            class115 var2 = this.field3625.field2105;
            if (this.field3625 == var2) {
                field3624++;
                if (arg0 <= 123) {
                    return;
                }
                this.field3637 = null;
                return;
            }
            var2.method926((byte) -8);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lnh;", line = 1490)
    public final class115 method1517(boolean arg0) {
        field3620++;
        if (arg0) {
            this.method1514(-113);
        }
        class115 var2 = this.field3625.field2105;
        if (this.field3625 == var2) {
            return null;
        } else {
            var2.method926((byte) -8);
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 1530)
    public class204() {
        this.field3625.field2105 = this.field3625;
        this.field3625.field2094 = this.field3625;
    }
}
