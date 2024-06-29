import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class231 extends class105 {

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    private int field4070 = 0;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field4085 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    private int field4078 = 1;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lvf;")
    public static class265 field4071 = class87.method582(-46, ")4p=");

    @OriginalMember(owner = "client!s", name = "X", descriptor = "Lvf;")
    public static class265 field4081 = class87.method582(-46, "::errortest");

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[B")
    public static byte[] field4072;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "Ldg;")
    public static class276 field4086;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Lvf;")
    public static class265 field4088;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Lmh;")
    public static class114 field4083;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method1558(byte arg0) {
        ++field4080;
        int var1 = 52 / ((64 - arg0) / 49);
        class13.field417.method1893(-86);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[Lgk;IIIIII)V")
    public static final void method1559(int arg0, int arg1, int arg2, class6[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class35.method287(arg1, arg4, arg9, arg2);
        class247.method1639();
        int var10 = 85 % ((arg0 - -53) / 42);
        for (int var11 = 0; ~arg3.length < ~var11; ++var11) {
            class6 var12 = arg3[var11];
            if (var12 != null && (var12.field142 == arg8 || ~arg8 == 1412584498 && class207.field3722 == var12)) {
                int var13;
                if (arg6 != -1) {
                    var13 = arg6;
                } else {
                    client.field3858[class119.field2104] = var12.field153 - -arg7;
                    class72.field1390[class119.field2104] = var12.field204 + arg5;
                    class124.field2229[class119.field2104] = var12.field89;
                    class102.field1811[class119.field2104] = var12.field84;
                    var13 = class119.field2104++;
                }
                var12.field97 = var13;
                var12.field83 = class93.field1655;
                if (!var12.field226 || !client.method1472(var12)) {
                    if (var12.field146 > 0) {
                        class81.method558(var12, (byte) 55);
                    }
                    int var14 = var12.field153 + arg7;
                    int var15 = var12.field138;
                    int var16 = var12.field204 + arg5;
                    if (class267.field4710 && (client.method1474(var12) != 0 || ~var12.field187 == -1) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class207.field3722 == var12) {
                        if (arg8 != -1412584499 && !var12.field96) {
                            class281.field4952 = arg7;
                            class63.field1242 = arg5;
                            class80.field1517 = arg3;
                            continue;
                        }
                        if (!var12.field96) {
                            var15 = 128;
                        }
                        if (class155.field2861 && class252.field4341) {
                            int var17 = class268.field4722;
                            int var18 = class79.field1497;
                            int var19 = var18 - class161.field2941;
                            int var20 = var17 - class22.field662;
                            if (class45.field1000 > var19) {
                                var19 = class45.field1000;
                            }
                            if (~(class45.field1000 + class273.field4846.field89) > ~(var19 - -var12.field89)) {
                                var19 = -var12.field89 + class273.field4846.field89 + class45.field1000;
                            }
                            var14 = var19;
                            if (~class253.field4352 < ~var20) {
                                var20 = class253.field4352;
                            }
                            if (var12.field84 + var20 > class253.field4352 - -class273.field4846.field84) {
                                var20 = class253.field4352 + class273.field4846.field84 + -var12.field84;
                            }
                            var16 = var20;
                        }
                    }
                    int var21;
                    int var23;
                    int var25;
                    int var26;
                    if (var12.field187 != 2) {
                        var21 = arg4 < var16 ? var16 : arg4;
                        int var22 = var12.field84 + var16;
                        var23 = ~arg1 <= ~var14 ? arg1 : var14;
                        int var24 = var12.field89 + var14;
                        if (var12.field187 == 9) {
                            ++var22;
                            ++var24;
                        }
                        var25 = arg2 > var22 ? var22 : arg2;
                        var26 = ~arg9 < ~var24 ? var24 : arg9;
                    } else {
                        var23 = arg1;
                        var26 = arg9;
                        var21 = arg4;
                        var25 = arg2;
                    }
                    if (!var12.field226 || var23 < var26 && ~var25 < ~var21) {
                        if (~var12.field146 != -1) {
                            if (~var12.field146 == -1338) {
                                class193.field3480 = var14;
                                class267.field4699 = var16;
                                class278.field4912 = var12;
                                class65.method470(var14, var12.field84, var16, var12.field89, -128, ~var12.field146 == -1404);
                                class35.method287(arg1, arg4, arg9, arg2);
                                continue;
                            }
                            if (~var12.field146 == -1339) {
                                if (!var12.method37((byte) -56)) {
                                    continue;
                                }
                                class241.method1611(false, var13, var12, var16, var14);
                                class35.method287(arg1, arg4, arg9, arg2);
                                if (class112.field1957 != 0 && class112.field1957 != 3 || class50.field1049 || class77.field1475 < var23 || var21 > class38.field862 || class77.field1475 >= var26 || ~var25 >= ~class38.field862) {
                                    continue;
                                }
                                int var27 = -var16 + class38.field862;
                                int var28 = -var14 + class77.field1475;
                                int var29 = var12.field202[var27];
                                if (~var29 < ~var28 || ~var28 < ~(var12.field173[var27] + var29)) {
                                    continue;
                                }
                                int var30 = var27 - var12.field84 / 2;
                                int var31 = var28 - var12.field89 / 2;
                                int var32 = 2047 & class79.field1500 + class122.field2180;
                                int var33 = class247.field4289[var32];
                                int var34 = (class39.field908 - -256) * var33 >> 8;
                                int var35 = class247.field4298[var32];
                                int var36 = (class39.field908 + 256) * var35 >> 8;
                                int var37 = var30 * var36 + -(var31 * var34) >> 11;
                                int var38 = var30 * var34 + var31 * var36 >> 11;
                                int var39 = class214.field3827.field2600 + var38 >> 7;
                                int var40 = -var37 + class214.field3827.field2564 >> 7;
                                if (class25.field695 && (class38.field874 & 64) != 0) {
                                    class6 var41 = class12.method98(class192.field3457, class26.field703, (byte) -124);
                                    if (var41 != null) {
                                        class182.method1213(false, class239.field4170, (short) 7, class64.field1247, -1, var40, 1L, var39);
                                    } else {
                                        class118.method796(-25946);
                                    }
                                    continue;
                                }
                                if (~class229.field4051 == -2) {
                                    class182.method1213(false, class265.field4611, (short) 46, class4.field66, -1, var40, 1L, var39);
                                }
                                class182.method1213(false, class193.field3479, (short) 6, class4.field66, -1, var40, 1L, var39);
                                continue;
                            }
                            if (var12.field146 == 1339) {
                                if (var12.method37((byte) -56)) {
                                    class112.method737(var14, var13, -88, var12, var16);
                                    class35.method287(arg1, arg4, arg9, arg2);
                                }
                                continue;
                            }
                            if (~var12.field146 == -1401) {
                                class122.method815(true, var16, var14, var12.field84, var12.field89);
                                class135.field2481[var13] = true;
                                class80.field1516[var13] = true;
                                class35.method287(arg1, arg4, arg9, arg2);
                                continue;
                            }
                            if (var12.field146 == 1401) {
                                class166.method1093(var16, var12.field84, 78, var14, var12.field89);
                                class135.field2481[var13] = true;
                                class80.field1516[var13] = true;
                                class35.method287(arg1, arg4, arg9, arg2);
                                continue;
                            }
                            if (var12.field146 == 1402) {
                                class219.method1505(var16, var14, -256);
                                class135.field2481[var13] = true;
                                class80.field1516[var13] = true;
                                continue;
                            }
                            if (var12.field146 == 1405) {
                                if (!class202.field3626) {
                                    continue;
                                }
                                int var42 = var12.field89 + var14;
                                int var43 = var16 + 15;
                                class22.field668.method765(class148.method1022(10, new class265[] { class163.field2968, class241.method1609(true, class13.field403) }), var42, var43, 16776960, -1);
                                int var131 = var43 + 15;
                                int var44 = 0;
                                int var45 = 16776960;
                                Runtime var46 = Runtime.getRuntime();
                                int var47 = (int) ((var46.totalMemory() + -var46.freeMemory()) / 1024L);
                                if (var47 > 65536) {
                                    var45 = 16711680;
                                }
                                class22.field668.method765(class148.method1022(10, new class265[] { class199.field3550, class241.method1609(true, var47), class8.field275 }), var42, var131, var45, -1);
                                int var48 = 0;
                                var43 = var131 + 15;
                                int var49 = 0;
                                int var50 = 16776960;
                                for (int var51 = 0; var51 < 28; ++var51) {
                                    var44 += class10.field356[var51].method81(0);
                                    var48 += class10.field356[var51].method77(-1);
                                    var49 += class10.field356[var51].method74((byte) 1);
                                }
                                int var52 = var49 * 100 / var44;
                                int var53 = var48 * 10000 / var44;
                                class265 var54 = class148.method1022(10, new class265[] { class39.field880, class77.method539(0, 10, true, 2, (long) var53), class71.field1364, class241.method1609(true, var52), class28.field728 });
                                class263.field4592.method765(var54, var42, var43, var50, -1);
                                class135.field2481[var13] = true;
                                var43 += 12;
                                class80.field1516[var13] = true;
                                continue;
                            }
                            if (var12.field146 == 1406) {
                                class54.field1121 = var16;
                                class176.field3140 = var12;
                                class100.field1768 = var14;
                                continue;
                            }
                        }
                        if (!class50.field1049) {
                            if (~var12.field187 == -1 && var12.field130 && ~class77.field1475 <= ~var23 && var21 <= class38.field862 && var26 > class77.field1475 && class38.field862 < var25 && !class267.field4710) {
                                class206.field3714[0] = class227.field4033;
                                class120.field2129 = 1;
                                class118.field2079[0] = 1006;
                                class206.field3717[0] = class21.field598;
                                class40.field924[0] = class4.field66;
                            }
                            if (var23 <= class77.field1475 && var21 <= class38.field862 && var26 > class77.field1475 && ~class38.field862 > ~var25) {
                                class189.method1292(29, -var16 + class38.field862, var12, -var14 + class77.field1475);
                            }
                        }
                        if (~var12.field187 == -1) {
                            if (!var12.field226 && client.method1472(var12) && class44.field967 != var12) {
                                continue;
                            }
                            if (!var12.field226) {
                                if (~var12.field193 < ~(var12.field195 - var12.field84)) {
                                    var12.field193 = var12.field195 - var12.field84;
                                }
                                if (~var12.field193 > -1) {
                                    var12.field193 = 0;
                                }
                            }
                            method1559(-98, var23, var25, arg3, var21, -var12.field193 + var16, var13, -var12.field109 + var14, var12.field219, var26);
                            if (var12.field160 != null) {
                                method1559(-2, var23, var25, var12.field160, var21, -var12.field193 + var16, var13, -var12.field109 + var14, var12.field219, var26);
                            }
                            class181 var55 = (class181) class49.field1042.method1842(-1, (long) var12.field219);
                            if (var55 != null) {
                                if (var55.field3219 == 0 && !class50.field1049 && ~var23 >= ~class77.field1475 && ~var21 >= ~class38.field862 && ~var26 < ~class77.field1475 && ~var25 < ~class38.field862 && !class267.field4710) {
                                    class120.field2129 = 1;
                                    class206.field3717[0] = class21.field598;
                                    class40.field924[0] = class4.field66;
                                    class206.field3714[0] = class227.field4033;
                                    class118.field2079[0] = 1006;
                                }
                                class281.method1912(var23, var26, var14, var55.field3217, (byte) -105, var21, var25, var16, var13);
                            }
                            class35.method287(arg1, arg4, arg9, arg2);
                            class247.method1639();
                        }
                        if (class4.field50[var13] || class111.field1952 > 1) {
                            if (var12.field187 == 0 && !var12.field226 && var12.field195 > var12.field84) {
                                class171.method1129(var12.field84, var16, var12.field89 + var14, var12.field195, 16, var12.field193);
                            }
                            if (var12.field187 != 1) {
                                if (var12.field187 == 2) {
                                    int var56 = 0;
                                    for (int var57 = 0; ~var12.field105 < ~var57; ++var57) {
                                        for (int var58 = 0; var12.field161 > var58; ++var58) {
                                            int var59 = var16 - -((var12.field139 + 32) * var57);
                                            int var60 = (32 - -var12.field176) * var58 + var14;
                                            if (var56 < 20) {
                                                var60 += var12.field199[var56];
                                                var59 += var12.field203[var56];
                                            }
                                            if (var12.field92[var56] <= 0) {
                                                if (var12.field141 != null && var56 < 20) {
                                                    class108 var72 = var12.method43(-75, var56);
                                                    if (var72 != null) {
                                                        var72.method585(var60, var59);
                                                    } else if (class252.field4343) {
                                                        class176.method1145((byte) 72, var12);
                                                    }
                                                }
                                            } else {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var12.field92[var56] + -1;
                                                if (~(var60 + 32) < ~arg1 && ~var60 > ~arg9 && arg4 < var59 + 32 && ~var59 > ~arg2 || class218.field3927 == var12 && class208.field3747 == var56) {
                                                    class108 var64;
                                                    if (class282.field4969 == 1 && class72.field1375 == var56 && class223.field3984 == var12.field219) {
                                                        var64 = class258.method1701(false, 2, 0, var12.field205, var12.field218[var56], var63);
                                                    } else {
                                                        var64 = class258.method1701(false, 1, 3153952, var12.field205, var12.field218[var56], var63);
                                                    }
                                                    if (class247.field4290) {
                                                        class135.field2481[var13] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class176.method1145((byte) -65, var12);
                                                    } else if (class218.field3927 == var12 && ~class208.field3747 == ~var56) {
                                                        int var65 = -class272.field4832 + class268.field4722;
                                                        int var66 = -class25.field692 + class79.field1497;
                                                        if (var66 < 5 && ~var66 < 4) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && ~var65 < 4) {
                                                            var65 = 0;
                                                        }
                                                        if (~class137.field2494 > -6) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method601(var60 + var66, var59 + var65, 128);
                                                        if (arg8 != -1) {
                                                            class6 var67 = arg3[65535 & arg8];
                                                            int var68 = class35.field825;
                                                            int var69 = class35.field827;
                                                            if (var59 + var65 < var68 && var67.field193 > 0) {
                                                                int var70 = (-var65 + var68 + -var59) * class84.field1572 / 3;
                                                                if (var70 > class84.field1572 * 10) {
                                                                    var70 = class84.field1572 * 10;
                                                                }
                                                                if (var67.field193 < var70) {
                                                                    var70 = var67.field193;
                                                                }
                                                                class272.field4832 += var70;
                                                                var67.field193 -= var70;
                                                                class176.method1145((byte) 76, var67);
                                                            }
                                                            if (var69 < var59 + 32 + var65 && var67.field193 < -var67.field84 + var67.field195) {
                                                                int var71 = (-var69 + var65 + var59 - -32) * class84.field1572 / 3;
                                                                if (class84.field1572 * 10 < var71) {
                                                                    var71 = class84.field1572 * 10;
                                                                }
                                                                if (~var71 < ~(-var67.field84 + -var67.field193 + var67.field195)) {
                                                                    var71 = -var67.field84 + var67.field195 + -var67.field193;
                                                                }
                                                                var67.field193 += var71;
                                                                class272.field4832 -= var71;
                                                                class176.method1145((byte) -100, var67);
                                                            }
                                                        }
                                                    } else if (class163.field2970 == var12 && ~class140.field2597 == ~var56) {
                                                        var64.method601(var60, var59, 128);
                                                    } else {
                                                        var64.method585(var60, var59);
                                                    }
                                                }
                                            }
                                            ++var56;
                                        }
                                    }
                                } else if (~var12.field187 == -4) {
                                    int var73;
                                    if (!class79.method548(var12, (byte) 82)) {
                                        var73 = var12.field168;
                                        if (class44.field967 == var12 && ~var12.field246 != -1) {
                                            var73 = var12.field246;
                                        }
                                    } else {
                                        var73 = var12.field156;
                                        if (class44.field967 == var12 && ~var12.field100 != -1) {
                                            var73 = var12.field100;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (var12.field94) {
                                            class35.method295(var14, var16, var12.field89, var12.field84, var73);
                                        } else {
                                            class35.method292(var14, var16, var12.field89, var12.field84, var73);
                                        }
                                    } else if (!var12.field94) {
                                        class35.method294(var14, var16, var12.field89, var12.field84, var73, -(255 & var15) + 256);
                                    } else {
                                        class35.method301(var14, var16, var12.field89, var12.field84, var73, -(var15 & 255) + 256);
                                    }
                                } else if (~var12.field187 == -5) {
                                    class115 var74 = var12.method41((byte) 79, class97.field1714);
                                    if (var74 == null) {
                                        if (class252.field4343) {
                                            class176.method1145((byte) -119, var12);
                                        }
                                    } else {
                                        class265 var75 = var12.field103;
                                        int var76;
                                        if (!class79.method548(var12, (byte) 82)) {
                                            var76 = var12.field168;
                                            if (class44.field967 == var12 && var12.field246 != 0) {
                                                var76 = var12.field246;
                                            }
                                        } else {
                                            var76 = var12.field156;
                                            if (class44.field967 == var12 && ~var12.field100 != -1) {
                                                var76 = var12.field100;
                                            }
                                            if (var12.field93.method1808((byte) -15) > 0) {
                                                var75 = var12.field93;
                                            }
                                        }
                                        if (var12.field226 && ~var12.field167 != 0) {
                                            class261 var77 = class54.method418(var12.field167, 0);
                                            var75 = var77.field4548;
                                            if (var75 == null) {
                                                var75 = class276.field4867;
                                            }
                                            if ((~var77.field4565 == -2 || var12.field148 != 1) && var12.field148 != -1) {
                                                var75 = class148.method1022(10, new class265[] { class111.field1933, var75, class279.field4937, class17.method123(var12.field148, 9) });
                                            }
                                        }
                                        if (class209.field3760 == var12) {
                                            var76 = var12.field168;
                                            var75 = class81.field1527;
                                        }
                                        if (!var12.field226) {
                                            var75 = class19.method132(var12, var75, (byte) -17);
                                        }
                                        var74.method760(var75, var14, var16, var12.field89, var12.field84, var76, !var12.field126 ? -1 : 0, var12.field242, var12.field118, var12.field117);
                                    }
                                } else if (var12.field187 == 5) {
                                    if (!var12.field226) {
                                        class108 var86 = var12.method35(class79.method548(var12, (byte) 107), 2);
                                        if (var86 == null) {
                                            if (class252.field4343) {
                                                class176.method1145((byte) 85, var12);
                                            }
                                        } else {
                                            var86.method585(var14, var16);
                                        }
                                    } else {
                                        class108 var78;
                                        if (~var12.field167 != 0) {
                                            var78 = class258.method1701(false, var12.field122, var12.field129, var12.field205, var12.field148, var12.field167);
                                        } else {
                                            var78 = var12.method35(false, 2);
                                        }
                                        if (var78 == null) {
                                            if (class252.field4343) {
                                                class176.method1145((byte) 97, var12);
                                            }
                                        } else {
                                            int var79 = var78.field1900;
                                            int var80 = var78.field1907;
                                            if (!var12.field185) {
                                                int var85 = var12.field89 * 4096 / var79;
                                                if (var12.field207 == 0) {
                                                    if (var15 != 0) {
                                                        var78.method586(var14, var16, var12.field89, var12.field84, -(var15 & 255) + 256);
                                                    } else if (var12.field89 == var79 && ~var12.field84 == ~var80) {
                                                        var78.method585(var14, var16);
                                                    } else {
                                                        var78.method600(var14, var16, var12.field89, var12.field84);
                                                    }
                                                } else {
                                                    var78.method717(var12.field207, var85, var14 - -(var12.field89 / 2), -114, var12.field84 / 2 + var16);
                                                }
                                            } else {
                                                int var81 = (var80 + -1 + var12.field84) / var80;
                                                int var82 = (var12.field89 - (-var79 + 1)) / var79;
                                                class35.method289(var14, var16, var12.field89 + var14, var12.field84 + var16);
                                                for (int var83 = 0; ~var83 > ~var82; ++var83) {
                                                    for (int var84 = 0; ~var84 > ~var81; ++var84) {
                                                        if (~var12.field207 == -1) {
                                                            if (var15 != 0) {
                                                                var78.method601(var79 * var83 + var14, var16 - -(var80 * var84), -(var15 & 255) + 256);
                                                            } else {
                                                                var78.method585(var79 * var83 + var14, var16 - -(var80 * var84));
                                                            }
                                                        } else {
                                                            var78.method717(var12.field207, 4096, var79 / 2 + var79 * var83 + var14, -114, var80 / 2 + var80 * var84 + var16);
                                                        }
                                                    }
                                                }
                                                class35.method287(arg1, arg4, arg9, arg2);
                                            }
                                        }
                                    }
                                } else if (var12.field187 == 6) {
                                    boolean var87 = class79.method548(var12, (byte) 76);
                                    int var88;
                                    if (!var87) {
                                        var88 = var12.field150;
                                    } else {
                                        var88 = var12.field217;
                                    }
                                    class235 var89 = null;
                                    int var90 = 0;
                                    if (var12.field167 != -1) {
                                        class261 var91 = class54.method418(var12.field167, 0);
                                        if (var91 != null) {
                                            class261 var92 = var91.method1745(var12.field148, (byte) -119);
                                            class216 var93 = var88 != -1 ? class174.method1142(var88, false) : null;
                                            var89 = var92.method1750(var12.field152, var93, 1, -120);
                                            if (var89 != null) {
                                                var90 = -var89.method141() / 2;
                                            } else {
                                                class176.method1145((byte) -39, var12);
                                            }
                                        }
                                    } else if (~var12.field102 == -6) {
                                        if (var12.field222 != -1) {
                                            int var94 = 2047 & var12.field222;
                                            if (class45.field1012 == var94) {
                                                var94 = 2047;
                                            }
                                            class122 var95 = class209.field3766[var94];
                                            class216 var96 = ~var88 == 0 ? null : class174.method1142(var88, false);
                                            if (var95 != null && ~((int) var95.field2163.method1793(43) << 11) == ~(var12.field222 & -2048)) {
                                                var89 = var95.field2194.method513(var12.field152, (class216) null, 0, (byte) 44, var96, true);
                                            }
                                        } else {
                                            var89 = class217.field3911.method513(-1, (class216) null, -1, (byte) 122, (class216) null, true);
                                        }
                                    } else if (var88 != -1) {
                                        class216 var97 = class174.method1142(var88, false);
                                        var89 = var12.method47(class214.field3827.field2194, var87, var12.field152, var97, -15496);
                                        if (var89 == null && class252.field4343) {
                                            class176.method1145((byte) -80, var12);
                                        }
                                    } else {
                                        var89 = var12.method47(class214.field3827.field2194, var87, -1, (class216) null, -15496);
                                        if (var89 == null && class252.field4343) {
                                            class176.method1145((byte) -31, var12);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var98;
                                        if (var12.field232 > 0) {
                                            var98 = (var12.field89 << 8) / var12.field232;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99;
                                        if (var12.field163 > 0) {
                                            var99 = (var12.field84 << 8) / var12.field163;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = var14 - (-(var12.field158 * var98 >> 8) + -(var12.field89 / 2));
                                        int var101 = (var12.field182 * var99 >> 8) + var12.field84 / 2 + var16;
                                        class247.method1638(var100, var101);
                                        int var102 = class247.field4298[var12.field124] * var12.field235 >> 16;
                                        int var103 = class247.field4289[var12.field124] * var12.field235 >> 16;
                                        if (!var12.field226) {
                                            var89.method1269(0, var12.field123, 0, var12.field124, 0, var103, var102, -1L);
                                        } else if (var12.field225) {
                                            ((class185) var89).method1273(0, var12.field123, var12.field77, var12.field124, var12.field132, var12.field178 + var90 + var103, var102 - -var12.field178, var12.field235);
                                        } else {
                                            var89.method1269(0, var12.field123, var12.field77, var12.field124, var12.field132, var90 + var103 + var12.field178, var102 - -var12.field178, -1L);
                                        }
                                        class247.method1641();
                                    }
                                } else {
                                    if (var12.field187 == 7) {
                                        class115 var104 = var12.method41((byte) 62, class97.field1714);
                                        if (var104 == null) {
                                            if (class252.field4343) {
                                                class176.method1145((byte) -64, var12);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; ~var106 > ~var12.field105; ++var106) {
                                            for (int var107 = 0; var12.field161 > var107; ++var107) {
                                                if (var12.field92[var105] > 0) {
                                                    class261 var108 = class54.method418(var12.field92[var105] + -1, 0);
                                                    class265 var109;
                                                    if (var108.field4565 != 1 && var12.field218[var105] == 1) {
                                                        var109 = class148.method1022(10, new class265[] { class111.field1933, var108.field4548, class197.field3514 });
                                                    } else {
                                                        var109 = class148.method1022(10, new class265[] { class111.field1933, var108.field4548, class279.field4937, class17.method123(var12.field218[var105], 9) });
                                                    }
                                                    int var110 = (var12.field176 + 115) * var107 + var14;
                                                    int var111 = (12 - -var12.field139) * var106 + var16;
                                                    if (~var12.field242 == -1) {
                                                        var104.method763(var109, var110, var111, var12.field168, !var12.field126 ? -1 : 0);
                                                    } else if (~var12.field242 != -2) {
                                                        var104.method765(var109, var110 - -115 + -1, var111, var12.field168, !var12.field126 ? -1 : 0);
                                                    } else {
                                                        var104.method767(var109, var110 + 57, var111, var12.field168, var12.field126 ? 0 : -1);
                                                    }
                                                }
                                                ++var105;
                                            }
                                        }
                                    }
                                    if (var12.field187 == 8 && class232.field4094 == var12 && class84.field1569 == class238.field4166) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class115 var114 = class22.field668;
                                        class265 var115 = var12.field103;
                                        class265 var116 = class19.method132(var12, var115, (byte) 126);
                                        while (var116.method1808((byte) -15) > 0) {
                                            int var124 = var116.method1792(0, class198.field3546);
                                            class265 var125;
                                            if (~var124 == 0) {
                                                var125 = var116;
                                                var116 = class4.field66;
                                            } else {
                                                var125 = var116.method1772(var124, 0, (byte) 108);
                                                var116 = var116.method1810(-1, var124 - -4);
                                            }
                                            int var126 = var114.method754(var125);
                                            if (~var126 < ~var112) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field2027 + 1;
                                        }
                                        var112 += 6;
                                        int var117 = var14 - (-var12.field89 + 5 + var112);
                                        int var118 = var16 - -5 + var12.field84;
                                        var113 += 7;
                                        if (var113 + var118 > arg2) {
                                            var118 = arg2 - var113;
                                        }
                                        if (var14 - -5 > var117) {
                                            var117 = var14 + 5;
                                        }
                                        if (arg9 < var112 + var117) {
                                            var117 = -var112 + arg9;
                                        }
                                        class35.method295(var117, var118, var112, var113, 16777120);
                                        class35.method292(var117, var118, var112, var113, 0);
                                        class265 var119 = var12.field103;
                                        int var120 = var114.field2027 + 2 + var118;
                                        class265 var121 = class19.method132(var12, var119, (byte) 125);
                                        while (~var121.method1808((byte) -15) < -1) {
                                            int var122 = var121.method1792(0, class198.field3546);
                                            class265 var123;
                                            if (var122 != -1) {
                                                var123 = var121.method1772(var122, 0, (byte) 70);
                                                var121 = var121.method1810(-1, var122 + 4);
                                            } else {
                                                var123 = var121;
                                                var121 = class4.field66;
                                            }
                                            var114.method763(var123, var117 + 3, var120, 0, -1);
                                            var120 += var114.field2027 - -1;
                                        }
                                    }
                                    if (~var12.field187 == -10) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var12.field149) {
                                            var127 = var12.field89 + var14;
                                            var128 = var16;
                                            var129 = var14;
                                            var130 = var16 - -var12.field84;
                                        } else {
                                            var129 = var14;
                                            var128 = var16 - -var12.field84;
                                            var130 = var16;
                                            var127 = var12.field89 + var14;
                                        }
                                        if (var12.field151 != 1) {
                                            class35.method284(var129, var130, var127, var128, var12.field168, var12.field151);
                                        } else {
                                            class35.method291(var129, var130, var127, var128, var12.field168);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field4077;
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public static void method1560(int arg0) {
        field4086 = null;
        field4071 = null;
        if (arg0 != -1) {
            method1563(true, 8, 112);
        }
        field4081 = null;
        field4083 = null;
        field4088 = null;
        field4072 = null;
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Z")
    public static final boolean method1561(int arg0) {
        if (arg0 != 25088) {
            method1560(-88);
        }
        ++field4079;
        return class68.field1304;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field4075;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field4078 = arg2.method920((byte) 25);
                }
            } else {
                this.field4070 = arg2.method920((byte) 79);
            }
        } else {
            this.field4085 = arg2.method920((byte) 76);
        }
        if (arg1 != 255) {
            method1559(-60, -101, -25, (class6[]) null, -109, 55, -62, 107, 43, 6);
        }
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
    public static final void method1562(int arg0) {
        ++field4084;
        int var1 = class207.field3730.method1867(8, 8);
        if (class19.field520 > var1) {
            for (int var2 = var1; ~var2 > ~class19.field520; ++var2) {
                class279.field4944[class267.field4700++] = class93.field1652[var2];
            }
        }
        if (~class19.field520 > ~var1) {
            throw new RuntimeException("gppov1");
        } else {
            if (arg0 != 30148) {
                method1560(-88);
            }
            class19.field520 = 0;
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class93.field1652[var3];
                class122 var5 = class209.field3766[var4];
                int var6 = class207.field3730.method1867(1, 8);
                if (var6 == 0) {
                    class93.field1652[class19.field520++] = var4;
                    var5.field2542 = class93.field1655;
                } else {
                    int var7 = class207.field3730.method1867(2, 8);
                    if (var7 == 0) {
                        class93.field1652[class19.field520++] = var4;
                        var5.field2542 = class93.field1655;
                        class279.field4928[class131.field2376++] = var4;
                    } else if (var7 == 1) {
                        class93.field1652[class19.field520++] = var4;
                        var5.field2542 = class93.field1655;
                        int var8 = class207.field3730.method1867(3, 8);
                        var5.method966((byte) -28, var8, false);
                        int var9 = class207.field3730.method1867(1, 8);
                        if (var9 == 1) {
                            class279.field4928[class131.field2376++] = var4;
                        }
                    } else if (var7 == 2) {
                        class93.field1652[class19.field520++] = var4;
                        var5.field2542 = class93.field1655;
                        int var10 = class207.field3730.method1867(3, 8);
                        var5.method966((byte) -28, var10, true);
                        int var11 = class207.field3730.method1867(3, 8);
                        var5.method966((byte) -28, var11, true);
                        int var12 = class207.field3730.method1867(1, 8);
                        if (var12 == 1) {
                            class279.field4928[class131.field2376++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class279.field4944[class267.field4700++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII)V")
    public static final void method1563(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            class178 var3 = class188.method1282(arg2, 6, 261360480);
            ++field4082;
            var3.method1162(true);
            var3.field3172 = arg1;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        ++field4074;
        class123.method831(117);
        if (arg0) {
            method1563(false, 48, -62);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field4076;
        if (arg0 != 8055) {
            this.method16(89, -103);
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class94.field1668 > var6; ++var6) {
                int var7 = class277.field4894[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field4085 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4078 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field4078;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field4070 == -1) {
                    var12 = class264.field4604[(var12 & 4095) >> 4] + 4096 >> 1;
                } else if (~this.field4070 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        field4072 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field4072[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4086 = new class276(2);
        field4087 = 0;
        field4088 = class87.method582(-46, "Fps:");
    }
}
