import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class237 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public static boolean field3811 = false;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BZ)V")
    public static final void method1658(byte arg0, boolean arg1) {
        field3821++;
        if (arg1 != class124.field1788 && arg0 == -124) {
            class124.field1788 = arg1;
            class121.method789(127);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method1659(byte arg0) {
        if (arg0 > -5) {
            method1661(89, 28, (class231[]) null, 68, 56, -22, 60, 105, 43, -80);
        }
        while (true) {
            class265 var1;
            class243 var3;
            do {
                var1 = (class265) class311.field4994.method1547(119);
                if (var1 == null) {
                    field3814++;
                    return;
                }
                if (var1.field4301 < 0) {
                    int var2 = -var1.field4301 - 1;
                    if (class22.field289 == var2) {
                        var3 = class214.field3347;
                    } else {
                        var3 = class35.field409[var2];
                    }
                } else {
                    int var4 = var1.field4301 - 1;
                    var3 = class191.field3045[var4];
                }
            } while (var3 == null);
            class191 var5 = class128.method822(var1.field4299, (byte) -104);
            int var6;
            int var7;
            if (var1.field4303 == 1 || var1.field4303 == 3) {
                var7 = var5.field3039;
                var6 = var5.field2993;
            } else {
                var6 = var5.field3039;
                var7 = var5.field2993;
            }
            int var8 = (var7 >> 1) + var1.field4308;
            int var9 = (var7 + 1 >> 1) + var1.field4308;
            int var10 = var1.field4300 + (var6 + 1 >> 1);
            int var11 = (var6 >> 1) + var1.field4300;
            int[][] var12 = class8.field114[class148.field2204];
            int var13 = var12[var8][var10] + var12[var8][var11] + var12[var9][var11] + var12[var9][var10] >> 2;
            class248 var14 = null;
            int var15 = class293.field4706[var1.field4312];
            if (var15 == 0) {
                class263 var16 = class32.method167(class148.field2204, var1.field4308, var1.field4300);
                if (var16 != null) {
                    var14 = var16.field4281;
                }
            } else if (var15 == 1) {
                class165 var19 = class192.method1349(class148.field2204, var1.field4308, var1.field4300);
                if (var19 != null) {
                    var14 = var19.field2552;
                }
            } else if (var15 == 2) {
                class158 var18 = class162.method1110(class148.field2204, var1.field4308, var1.field4300);
                if (var18 != null) {
                    var14 = var18.field2365;
                }
            } else if (var15 == 3) {
                class58 var17 = class176.method1254(class148.field2204, var1.field4308, var1.field4300);
                if (var17 != null) {
                    var14 = var17.field856;
                }
            }
            if (var14 != null) {
                class130.method832(var1.field4298 + 1, 0, 0, var1.field4296 + 1, var1.field4300, -1, var15, class148.field2204, false, var1.field4308);
                var3.field3968 = class311.field4996 + var1.field4298;
                var3.field3942 = var1.field4308 * 128 + (var7 * 64);
                var3.field3922 = var13;
                var3.field3912 = var1.field4296 + class311.field4996;
                int var20 = var1.field4309;
                int var21 = var1.field4302;
                int var22 = var1.field4295;
                if (var21 < var20) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                int var24 = var1.field4310;
                var3.field3955 = var14;
                var3.field3921 = var1.field4308 + var20;
                var3.field3965 = var1.field4300 * 128 + var6 * 64;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field3917 = var1.field4300 + var22;
                var3.field3940 = var1.field4300 + var24;
                var3.field3919 = var1.field4308 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Z")
    public final boolean method1660(int arg0) {
        field3812++;
        if (arg0 < 8) {
            method1661(22, -62, (class231[]) null, 0, 15, -43, -125, 41, -110, -61);
        }
        return (this.field3816 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[Lfe;IIIIIII)V")
    public static final void method1661(int arg0, int arg1, class231[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class151.method1042(arg5, arg3, arg1, arg0);
        class221.method1569();
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class231 var11 = arg2[var10];
            if (var11 != null && (var11.field3633 == arg9 || arg9 == -1412584499 && class142.field2079 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class28.field342[class254.field4142] = var11.field3734 + arg8;
                    class52.field735[class254.field4142] = var11.field3608 + arg4;
                    class113.field1652[class254.field4142] = var11.field3730;
                    class16.field227[class254.field4142] = var11.field3686;
                    var12 = class254.field4142++;
                } else {
                    var12 = arg7;
                }
                var11.field3707 = class311.field4996;
                var11.field3718 = var12;
                if (!var11.field3585 || !client.method1714(var11)) {
                    if (var11.field3563 > 0) {
                        class52.method348(false, var11);
                    }
                    int var13 = var11.field3608 + arg4;
                    int var14 = var11.field3574;
                    int var15 = var11.field3734 + arg8;
                    if (class107.field1563 && (client.method1698(var11).field367 != 0 || var11.field3620 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class142.field2079 == var11) {
                        if (arg9 != -1412584499 && !var11.field3577) {
                            class293.field4701 = arg2;
                            class10.field148 = arg8;
                            class56.field815 = arg4;
                            continue;
                        }
                        if (class40.field479 && class45.field547) {
                            int var16 = class50.field633;
                            int var17 = var16 - class71.field1052;
                            if (var17 < class258.field4199) {
                                var17 = class258.field4199;
                            }
                            int var18 = class71.field1042;
                            int var19 = var18 - class68.field1014;
                            if (class134.field1939 > var19) {
                                var19 = class134.field1939;
                            }
                            if ((class258.field4199 + class82.field1247.field3730) < (var11.field3730 + var17)) {
                                var17 = class258.field4199 + class82.field1247.field3730 - var11.field3730;
                            }
                            if (class134.field1939 + class82.field1247.field3686 < var19 - -var11.field3686) {
                                var19 = class82.field1247.field3686 + class134.field1939 - var11.field3686;
                            }
                            var13 = var19;
                            var15 = var17;
                        }
                        if (!var11.field3577) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field3620 == 2) {
                        var24 = arg0;
                        var22 = arg5;
                        var20 = arg3;
                        var25 = arg1;
                    } else {
                        var20 = arg3 < var13 ? var13 : arg3;
                        int var21 = var11.field3730 + var15;
                        var22 = var15 <= arg5 ? arg5 : var15;
                        int var23 = var11.field3686 + var13;
                        if (var11.field3620 == 9) {
                            var23++;
                            var21++;
                        }
                        var24 = arg0 > var23 ? var23 : arg0;
                        var25 = var21 < arg1 ? var21 : arg1;
                    }
                    if (!var11.field3585 || var22 < var25 && var20 < var24) {
                        if (var11.field3563 != 0) {
                            if (var11.field3563 == 1337 || var11.field3563 == 1403) {
                                class167.field2576 = var13;
                                class63.field918 = var15;
                                class41.field500 = var11;
                                class27.method139(arg6 + 2685, var11.field3563 == 1403, var11.field3730, var11.field3686, var13, var15);
                                class302.field4808[var12] = true;
                                class151.method1042(arg5, arg3, arg1, arg0);
                                continue;
                            }
                            if (var11.field3563 == 1338) {
                                if (!var11.method1636(true)) {
                                    continue;
                                }
                                class211.method1464(var13, arg6 + 46, var12, var15, var11);
                                class151.method1042(arg5, arg3, arg1, arg0);
                                if (class3.field43 != 0 && class3.field43 != 3 || class311.field4995 || var22 > class24.field305 || var20 > class46.field566 || class24.field305 >= var25 || class46.field566 >= var24) {
                                    continue;
                                }
                                int var26 = class24.field305 - var15;
                                int var27 = class46.field566 - var13;
                                int var28 = var11.field3637[var27];
                                if (var26 < var28 || var26 > (var11.field3687[var27] + var28)) {
                                    continue;
                                }
                                int var29 = var27 - var11.field3686 / 2;
                                int var30 = var26 - var11.field3730 / 2;
                                int var31 = (int) class144.field2145 + class146.field2173 & 0x7FF;
                                int var32 = class221.field3465[var31];
                                int var33 = class221.field3468[var31];
                                int var34 = (class60.field876 + 256) * var33 >> 8;
                                int var35 = (class60.field876 + 256) * var32 >> 8;
                                int var36 = var29 * var35 - var30 * var34 >> 11;
                                int var37 = var29 * var34 + (var30 * var35) >> 11;
                                int var38 = class214.field3347.field3915 + var37 - ((class214.field3347.method8((byte) -119) + -1) * 64) >> 7;
                                int var39 = class214.field3347.field3920 - var36 - ((class214.field3347.method8((byte) -102) - 1) * 64) >> 7;
                                if (class63.field911 && (class111.field1613 & 0x40) != 0) {
                                    class231 var40 = class282.method1942(class71.field1034, class304.field4829, (byte) -65);
                                    if (var40 == null) {
                                        class223.method1582(true);
                                    } else {
                                        class28.method142(" ->", arg6 - 109, class59.field865, var39, (short) 22, 1L, var38, class122.field1757);
                                    }
                                    continue;
                                }
                                if (class257.field4188 == 1) {
                                    class28.method142("", arg6 - 91, class161.field2413, var39, (short) 28, 1L, var38, -1);
                                }
                                class28.method142("", 46, class248.field4034, var39, (short) 15, 1L, var38, -1);
                                continue;
                            }
                            if (var11.field3563 == 1339) {
                                if (var11.method1636(true)) {
                                    class250.method1786((byte) -72, var12, var15, var11, var13);
                                    class151.method1042(arg5, arg3, arg1, arg0);
                                }
                                continue;
                            }
                            if (var11.field3563 == 1400) {
                                class228.method1604(var15, (byte) 94, var11.field3686, var11.field3730, var13);
                                class302.field4808[var12] = true;
                                class195.field3092[var12] = true;
                                class151.method1042(arg5, arg3, arg1, arg0);
                                continue;
                            }
                            if (var11.field3563 == 1401) {
                                class212.method1465(var11.field3686, var15, var13, arg6 ^ 0xFFFFFFFE, var11.field3730);
                                class302.field4808[var12] = true;
                                class195.field3092[var12] = true;
                                class151.method1042(arg5, arg3, arg1, arg0);
                                continue;
                            }
                            if (var11.field3563 == 1402) {
                                class123.method798(var15, var13, arg6 ^ 0x75);
                                class302.field4808[var12] = true;
                                class195.field3092[var12] = true;
                                continue;
                            }
                            if (var11.field3563 == 1405) {
                                if (!class159.field2388) {
                                    continue;
                                }
                                int var41 = var15 + var11.field3730;
                                int var42 = var13 + 15;
                                class183.field2880.method1481("Fps:" + class266.field4326, var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 16776960;
                                if (var44 > 65536) {
                                    var45 = 16711680;
                                }
                                int var46 = 0;
                                var42 += 15;
                                class183.field2880.method1481("Mem:" + var44 + "k", var41, var42, var45, -1);
                                int var47 = 16776960;
                                int var48 = 0;
                                var42 += 15;
                                int var49 = 0;
                                for (int var50 = 0; var50 < 29; var50++) {
                                    var46 += class122.field1758[var50].method260(2097151);
                                    var48 += class122.field1758[var50].method258(44);
                                    var49 += class122.field1758[var50].method262((byte) 126);
                                }
                                int var51 = var49 * 100 / var46;
                                int var52 = var48 * 10000 / var46;
                                String var53 = "Cache:" + class171.method1224(true, (long) var52, 0, 2, 2732) + "% (" + var51 + "%)";
                                class178.field2788.method1481(var53, var41, var42, var47, -1);
                                var42 += 12;
                                if (class65.field935 > 0) {
                                    class178.field2788.method1481("Particles: " + class65.field936 + " / " + class65.field935, var41, var42, var47, -1);
                                }
                                var42 += 12;
                                class302.field4808[var12] = true;
                                class195.field3092[var12] = true;
                                continue;
                            }
                            if (var11.field3563 == 1406) {
                                class205.field3216 = var15;
                                class66.field976 = var11;
                                class293.field4708 = var13;
                                continue;
                            }
                        }
                        if (!class311.field4995) {
                            if (var11.field3620 == 0 && var11.field3717 && var22 <= class24.field305 && var20 <= class46.field566 && class24.field305 < var25 && class46.field566 < var24 && !class107.field1563) {
                                class186.field2925[0] = class58.field855;
                                class43.field521[0] = "";
                                class163.field2495[0] = class288.field4653;
                                class173.field2721 = 1;
                                class192.field3056[0] = 1001;
                            }
                            if (class24.field305 >= var22 && var20 <= class46.field566 && var25 > class24.field305 && class46.field566 < var24) {
                                class14.method83(arg6 ^ 0xFFFFFFFE, var11, class24.field305 - var15, class46.field566 - var13);
                            }
                        }
                        if (var11.field3620 == 0) {
                            if (!var11.field3585 && client.method1714(var11) && class93.field1399 != var11) {
                                continue;
                            }
                            if (!var11.field3585) {
                                if (var11.field3648 - var11.field3686 < var11.field3661) {
                                    var11.field3661 = var11.field3648 - var11.field3686;
                                }
                                if (var11.field3661 < 0) {
                                    var11.field3661 = 0;
                                }
                            }
                            method1661(var24, var25, arg2, var20, var13 - var11.field3661, var22, 1, var12, var15 - var11.field3616, var11.field3595);
                            if (var11.field3578 != null) {
                                method1661(var24, var25, var11.field3578, var20, var13 - var11.field3661, var22, 1, var12, var15 - var11.field3616, var11.field3595);
                            }
                            class104 var54 = (class104) class115.field1674.method1064(arg6 - 2, (long) var11.field3595);
                            if (var54 != null) {
                                if (var54.field1517 == 0 && !class311.field4995 && class24.field305 >= var22 && var20 <= class46.field566 && var25 > class24.field305 && var24 > class46.field566 && !class107.field1563) {
                                    class163.field2495[0] = class288.field4653;
                                    class186.field2925[0] = class58.field855;
                                    class192.field3056[0] = 1001;
                                    class173.field2721 = 1;
                                    class43.field521[0] = "";
                                }
                                class5.method32(var12, var15, var54.field1511, var22, var13, var20, var24, var25, 0);
                            }
                            class151.method1042(arg5, arg3, arg1, arg0);
                            class221.method1569();
                        }
                        if (class278.field4553[var12] || class164.field2544 > 1) {
                            if (var11.field3620 == 0 && !var11.field3585 && var11.field3648 > var11.field3686) {
                                class63.method404(14, var13, var11.field3686, var11.field3730 + var15, var11.field3661, var11.field3648);
                            }
                            if (var11.field3620 != 1) {
                                if (var11.field3620 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field3592; var56++) {
                                        for (int var57 = 0; var57 < var11.field3603; var57++) {
                                            int var58 = var15 + ((var11.field3699 + 32) * var57);
                                            int var59 = (var11.field3714 + 32) * var56 + var13;
                                            if (var55 < 20) {
                                                var58 += var11.field3604[var55];
                                                var59 += var11.field3671[var55];
                                            }
                                            if (var11.field3708[var55] > 0) {
                                                boolean var60 = false;
                                                int var61 = var11.field3708[var55] - 1;
                                                boolean var62 = false;
                                                if (arg5 < var58 + 32 && arg1 > var58 && (var59 + 32) > arg3 && var59 < arg0 || class169.field2608 == var11 && class191.field3031 == var55) {
                                                    class215 var63;
                                                    if (class197.field3123 == 1 && class99.field1488 == var55 && class175.field2760 == var11.field3595) {
                                                        var63 = class158.method1092((class172) null, 2, var11.field3634, var61, var11.field3582[var55], -16523, 0);
                                                    } else {
                                                        var63 = class158.method1092((class172) null, 1, var11.field3634, var61, var11.field3582[var55], -16523, 3153952);
                                                    }
                                                    if (class221.field3471) {
                                                        class302.field4808[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class247.method1761(var11, (byte) -123);
                                                    } else if (class169.field2608 == var11 && class191.field3031 == var55) {
                                                        int var64 = class71.field1042 - class276.field4473;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = class50.field633 - class148.field2194;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class205.field3213 < 5) {
                                                            var65 = 0;
                                                            var64 = 0;
                                                        }
                                                        var63.method293(var58 + var65, var59 + var64, 128);
                                                        if (arg9 != -1) {
                                                            class231 var66 = arg2[arg9 & 0xFFFF];
                                                            int var67 = class151.field2230;
                                                            int var68 = class151.field2229;
                                                            if (var67 > var59 + var64 && var66.field3661 > 0) {
                                                                int var69 = (var67 - var64 - var59) * class135.field1949 / 3;
                                                                if (var69 > (class135.field1949 * 10)) {
                                                                    var69 = class135.field1949 * 10;
                                                                }
                                                                if (var69 > var66.field3661) {
                                                                    var69 = var66.field3661;
                                                                }
                                                                class276.field4473 += var69;
                                                                var66.field3661 -= var69;
                                                                class247.method1761(var66, (byte) -121);
                                                            }
                                                            if ((var64 + var59 + 32) > var68 && var66.field3661 < (var66.field3648 - var66.field3686)) {
                                                                int var70 = (var64 + var59 + 32 - var68) * class135.field1949 / 3;
                                                                if ((class135.field1949 * 10) < var70) {
                                                                    var70 = class135.field1949 * 10;
                                                                }
                                                                if ((var66.field3648 - (var66.field3686 + var66.field3661)) < var70) {
                                                                    var70 = var66.field3648 - var66.field3661 - var66.field3686;
                                                                }
                                                                class276.field4473 -= var70;
                                                                var66.field3661 += var70;
                                                                class247.method1761(var66, (byte) -105);
                                                            }
                                                        }
                                                    } else if (class297.field4739 == var11 && class32.field387 == var55) {
                                                        var63.method293(var58, var59, 128);
                                                    } else {
                                                        var63.method285(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field3696 != null && var55 < 20) {
                                                class215 var71 = var11.method1624(65535, var55);
                                                if (var71 != null) {
                                                    var71.method285(var58, var59);
                                                } else if (class172.field2706) {
                                                    class247.method1761(var11, (byte) -95);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field3620 == 3) {
                                    int var72;
                                    if (class215.method1507(var11, (byte) 84)) {
                                        var72 = var11.field3667;
                                        if (class93.field1399 == var11 && var11.field3711 != 0) {
                                            var72 = var11.field3711;
                                        }
                                    } else {
                                        var72 = var11.field3583;
                                        if (class93.field1399 == var11 && var11.field3623 != 0) {
                                            var72 = var11.field3623;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field3662) {
                                            class151.method1026(var15, var13, var11.field3730, var11.field3686, var72);
                                        } else {
                                            class151.method1040(var15, var13, var11.field3730, var11.field3686, var72);
                                        }
                                    } else if (var11.field3662) {
                                        class151.method1033(var15, var13, var11.field3730, var11.field3686, var72, 256 - (var14 & 0xFF));
                                    } else {
                                        class151.method1035(var15, var13, var11.field3730, var11.field3686, var72, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field3620 == 4) {
                                    class213 var73 = var11.method1626(class76.field1146, 2);
                                    if (var73 != null) {
                                        String var74 = var11.field3571;
                                        int var75;
                                        if (class215.method1507(var11, (byte) 102)) {
                                            var75 = var11.field3667;
                                            if (class93.field1399 == var11 && var11.field3711 != 0) {
                                                var75 = var11.field3711;
                                            }
                                            if (var11.field3567.length() > 0) {
                                                var74 = var11.field3567;
                                            }
                                        } else {
                                            var75 = var11.field3583;
                                            if (class93.field1399 == var11 && var11.field3623 != 0) {
                                                var75 = var11.field3623;
                                            }
                                        }
                                        if (var11.field3585 && var11.field3657 != -1) {
                                            class162 var76 = class104.method696((byte) -26, var11.field3657);
                                            var74 = var76.field2425;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field2422 == 1 || var11.field3645 != 1) && var11.field3645 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class231.method1620(var11.field3645, (byte) -120);
                                            }
                                        }
                                        if (class137.field1969 == var11) {
                                            var74 = class10.field150;
                                            var75 = var11.field3583;
                                        }
                                        if (!var11.field3585) {
                                            var74 = class63.method408(16, var11, var74);
                                        }
                                        var73.method1483(var74, var15, var13, var11.field3730, var11.field3686, var75, var11.field3725 ? 0 : -1, var11.field3572, var11.field3625, var11.field3615);
                                    } else if (class172.field2706) {
                                        class247.method1761(var11, (byte) -94);
                                    }
                                } else if (var11.field3620 == 5) {
                                    if (!var11.field3585) {
                                        class215 var86 = var11.method1625(class215.method1507(var11, (byte) -108), (byte) -112);
                                        if (var86 != null) {
                                            var86.method285(var15, var13);
                                        } else if (class172.field2706) {
                                            class247.method1761(var11, (byte) -120);
                                        }
                                    } else if (var11.field3593 >= 0) {
                                        class157 var77 = var11.method1635(false);
                                        var77.method1088(0, var15, var13, var11.field3730, var11.field3686, var11.field3566, var11.field3684, 0);
                                    } else {
                                        class215 var78;
                                        if (var11.field3657 == -1) {
                                            var78 = var11.method1625(false, (byte) -122);
                                        } else if (var11.field3596 && class214.field3347.field33 != null) {
                                            var78 = class158.method1092(class214.field3347.field33, var11.field3573, var11.field3634, var11.field3657, var11.field3645, -16523, var11.field3745);
                                        } else {
                                            var78 = class158.method1092((class172) null, var11.field3573, var11.field3634, var11.field3657, var11.field3645, arg6 ^ 0xFFFFBF74, var11.field3745);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field3352;
                                            int var80 = var78.field3355;
                                            if (var11.field3723) {
                                                int var81 = (var11.field3686 + var80 - 1) / var80;
                                                int var82 = (var11.field3730 + var79 - 1) / var79;
                                                class151.method1037(var15, var13, var15 + var11.field3730, var11.field3686 + var13);
                                                for (int var83 = 0; var83 < var82; var83++) {
                                                    for (int var84 = 0; var84 < var81; var84++) {
                                                        if (var11.field3642 != 0) {
                                                            var78.method1508(4096, arg6 ^ 0xFFFFB875, var11.field3642, var15 + (var79 * var83) + (var79 / 2), var13 - (-(var80 * var84) - var80 / 2));
                                                        } else if (var14 == 0) {
                                                            var78.method285(var15 + (var79 * var83), var80 * var84 + var13);
                                                        } else {
                                                            var78.method293(var79 * var83 + var15, var80 * var84 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class151.method1042(arg5, arg3, arg1, arg0);
                                            } else {
                                                int var85 = var11.field3730 * 4096 / var79;
                                                if (var11.field3642 != 0) {
                                                    var78.method1508(var85, -18316, var11.field3642, var11.field3730 / 2 + var15, var13 - -(var11.field3686 / 2));
                                                } else if (var14 != 0) {
                                                    var78.method274(var15, var13, var11.field3730, var11.field3686, 256 - (var14 & 0xFF));
                                                } else if (var11.field3730 == var79 && var11.field3686 == var80) {
                                                    var78.method285(var15, var13);
                                                } else {
                                                    var78.method292(var15, var13, var11.field3730, var11.field3686);
                                                }
                                            }
                                        } else if (class172.field2706) {
                                            class247.method1761(var11, (byte) -125);
                                        }
                                    }
                                } else if (var11.field3620 == 6) {
                                    boolean var87 = class215.method1507(var11, (byte) -111);
                                    class208 var88 = null;
                                    int var89 = 0;
                                    int var90;
                                    if (var87) {
                                        var90 = var11.field3689;
                                    } else {
                                        var90 = var11.field3631;
                                    }
                                    if (var11.field3657 != -1) {
                                        class162 var91 = class104.method696((byte) -26, var11.field3657);
                                        if (var91 != null) {
                                            class162 var92 = var91.method1120(var11.field3645, 65);
                                            class57 var93 = var90 == -1 ? null : class174.method1241(-124, var90);
                                            if (var11.field3596 && class214.field3347.field33 != null) {
                                                var88 = var92.method1117(var93, class214.field3347.field33, var11.field3659, 128, var11.field3669, var11.field3647, 1);
                                            } else {
                                                var88 = var92.method1117(var93, (class172) null, var11.field3659, 128, var11.field3669, var11.field3647, 1);
                                            }
                                            if (var88 == null) {
                                                class247.method1761(var11, (byte) -127);
                                            } else {
                                                var89 = -var88.method4() / 2;
                                            }
                                        }
                                    } else if (var11.field3675 == 5) {
                                        if (var11.field3609 == -1) {
                                            var88 = class309.field4972.method1238((class57) null, false, 0, -1, (byte) 64, 0, -1, true, (class282[]) null, -1, (class57) null, -1);
                                        } else {
                                            int var95 = var11.field3609 & 0x7FF;
                                            if (class22.field289 == var95) {
                                                var95 = 2047;
                                            }
                                            class1 var96 = class35.field409[var95];
                                            class57 var97 = var90 == -1 ? null : class174.method1241(arg6 + 4, var90);
                                            if (var96 != null && (int) class176.method1256((byte) 127, var96.field31) << 11 == (var11.field3609 & 0xFFFFF800)) {
                                                var88 = var96.field33.method1238((class57) null, false, 0, -1, (byte) 64, 0, -1, true, (class282[]) null, var11.field3659, var97, 0);
                                            }
                                        }
                                    } else if (var90 == -1) {
                                        var88 = var11.method1622(var87, class214.field3347.field33, -1, (byte) 127, 0, -1, (class57) null);
                                        if (var88 == null && class172.field2706) {
                                            class247.method1761(var11, (byte) -97);
                                        }
                                    } else {
                                        class57 var94 = class174.method1241(-122, var90);
                                        var88 = var11.method1622(var87, class214.field3347.field33, var11.field3647, (byte) 102, var11.field3669, var11.field3659, var94);
                                        if (var88 == null && class172.field2706) {
                                            class247.method1761(var11, (byte) -107);
                                        }
                                    }
                                    if (var88 != null) {
                                        int var98;
                                        if (var11.field3597 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field3730 << 8) / var11.field3597;
                                        }
                                        int var99;
                                        if (var11.field3744 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var11.field3686 << 8) / var11.field3744;
                                        }
                                        int var100 = var15 - (-(var11.field3730 / 2) - (var11.field3564 * var98 >> 8));
                                        int var101 = (var11.field3584 * var99 >> 8) + var11.field3686 / 2 + var13;
                                        class221.method1570(var100, var101);
                                        int var102 = class221.field3465[var11.field3651] * var11.field3727 >> 16;
                                        int var103 = class221.field3468[var11.field3651] * var11.field3727 >> 16;
                                        if (!var11.field3585) {
                                            var88.method312(0, var11.field3695, 0, var11.field3651, 0, var103, var102, -1L);
                                        } else if (var11.field3568) {
                                            ((class51) var88).method335(0, var11.field3695, var11.field3738, var11.field3651, var11.field3617, var89 + var103 + var11.field3710, var11.field3710 + var102, var11.field3727);
                                        } else {
                                            var88.method312(0, var11.field3695, var11.field3738, var11.field3651, var11.field3617, var89 + var103 + var11.field3710, var11.field3710 + var102, -1L);
                                        }
                                        class221.method1564();
                                    }
                                } else {
                                    if (var11.field3620 == 7) {
                                        class213 var104 = var11.method1626(class76.field1146, 2);
                                        if (var104 == null) {
                                            if (class172.field2706) {
                                                class247.method1761(var11, (byte) -93);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field3592; var106++) {
                                            for (int var107 = 0; var107 < var11.field3603; var107++) {
                                                if (var11.field3708[var105] > 0) {
                                                    class162 var108 = class104.method696((byte) -26, var11.field3708[var105] - 1);
                                                    String var109;
                                                    if (var108.field2422 != 1 && var11.field3582[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field2425 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field2425 + "</col> x" + class231.method1620(var11.field3582[var105], (byte) -120);
                                                    }
                                                    int var110 = var15 + ((var11.field3699 + 115) * var107);
                                                    int var111 = (var11.field3714 + 12) * var106 + var13;
                                                    if (var11.field3572 == 0) {
                                                        var104.method1486(var109, var110, var111, var11.field3583, var11.field3725 ? 0 : -1);
                                                    } else if (var11.field3572 == 1) {
                                                        var104.method1473(var109, var110 + 57, var111, var11.field3583, var11.field3725 ? 0 : -1);
                                                    } else {
                                                        var104.method1481(var109, var110 + 114, var111, var11.field3583, var11.field3725 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field3620 == 8 && class236.field3804 == var11 && class218.field3416 == class102.field1504) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class213 var114 = class183.field2880;
                                        String var115 = var11.field3571;
                                        String var116 = class63.method408(16, var11, var115);
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
                                            int var126 = var114.method1491(var125);
                                            var113 += var114.field3313 + 1;
                                            if (var126 > var112) {
                                                var112 = var126;
                                            }
                                        }
                                        var113 += 7;
                                        var112 += 6;
                                        int var117 = var15 - (var112 + 5 - var11.field3730);
                                        if (var15 + 5 > var117) {
                                            var117 = var15 + 5;
                                        }
                                        if (arg1 < (var117 + var112)) {
                                            var117 = arg1 - var112;
                                        }
                                        int var118 = var13 - (-var11.field3686 - 5);
                                        if (var113 + var118 > arg0) {
                                            var118 = arg0 - var113;
                                        }
                                        class151.method1026(var117, var118, var112, var113, 16777120);
                                        class151.method1040(var117, var118, var112, var113, 0);
                                        int var119 = var118 + var114.field3313 + 2;
                                        String var120 = var11.field3571;
                                        String var121 = class63.method408(16, var11, var120);
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
                                            var114.method1486(var123, var117 + 3, var119, 0, -1);
                                            var119 += var114.field3313 + 1;
                                        }
                                    }
                                    if (var11.field3620 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field3576) {
                                            var127 = var11.field3686 + var13;
                                            var130 = var11.field3730 + var15;
                                            var129 = var13;
                                            var128 = var15;
                                        } else {
                                            var127 = var13;
                                            var128 = var15;
                                            var129 = var13 + var11.field3686;
                                            var130 = var15 + var11.field3730;
                                        }
                                        if (var11.field3570 == 1) {
                                            class151.method1028(var128, var127, var130, var129, var11.field3583);
                                        } else {
                                            class151.method1041(var128, var127, var130, var129, var11.field3583, var11.field3570);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field3810++;
        if (arg6 != 1) {
            method1661(69, -5, (class231[]) null, 119, -91, -95, 45, 11, 12, 76);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
    public static final boolean method1662(int arg0, int arg1) {
        field3813++;
        if (class152.field2268 == arg0) {
            return false;
        }
        class276.field4478 = new int[4][13][13];
        class114.field1671 = new int[arg1][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class312.field4997[var2] = new class99(104, 104);
        }
        class74.field1128 = new class220[4][104][104];
        class19.field259 = new byte[4][104][104];
        class152.field2268 = arg0;
        class74.field1121 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    public static final void method1663(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            method1662(-34, 58);
        }
        field3815++;
        class181 var4 = class95.method652(11, (byte) 34, arg2);
        var4.method1285((byte) 64);
        var4.field2847 = arg1;
        var4.field2845 = arg3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z")
    public final boolean method1664(int arg0) {
        int var2 = -13 % ((-arg0 - 23) / 49);
        field3817++;
        return (this.field3816 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Z")
    public final boolean method1665(int arg0) {
        if (arg0 != -1) {
            field3811 = true;
        }
        field3818++;
        return (this.field3816 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Z")
    public final boolean method1666(int arg0) {
        int var2 = -106 % ((arg0 - 4) / 34);
        field3808++;
        return (this.field3816 & 0x8) != 0;
    }
}
