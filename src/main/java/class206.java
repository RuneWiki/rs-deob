import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class206 extends class155 {

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "Z")
    public boolean field3320 = false;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public int field3327 = -1;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "Z")
    public boolean field3322 = false;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "[I")
    public static int[] field3314 = new int[5];

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "Lpf;")
    public static class17 field3323 = new class17(32);

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3331 = "Loaded world list data";

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Laj;")
    public static class151 field3329;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(CB)B")
    public static final byte method1437(char arg0, byte arg1) {
        int var2 = -63 % ((71 - arg1) / 49);
        field3328++;
        byte var3;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var3 = (byte) arg0;
        } else if (arg0 == '€') {
            var3 = -128;
        } else if (arg0 == '‚') {
            var3 = -126;
        } else if (arg0 == 'ƒ') {
            var3 = -125;
        } else if (arg0 == '„') {
            var3 = -124;
        } else if (arg0 == '…') {
            var3 = -123;
        } else if (arg0 == '†') {
            var3 = -122;
        } else if (arg0 == '‡') {
            var3 = -121;
        } else if (arg0 == 'ˆ') {
            var3 = -120;
        } else if (arg0 == '‰') {
            var3 = -119;
        } else if (arg0 == 'Š') {
            var3 = -118;
        } else if (arg0 == '‹') {
            var3 = -117;
        } else if (arg0 == 'Œ') {
            var3 = -116;
        } else if (arg0 == 'Ž') {
            var3 = -114;
        } else if (arg0 == '‘') {
            var3 = -111;
        } else if (arg0 == '’') {
            var3 = -110;
        } else if (arg0 == '“') {
            var3 = -109;
        } else if (arg0 == '”') {
            var3 = -108;
        } else if (arg0 == '•') {
            var3 = -107;
        } else if (arg0 == '–') {
            var3 = -106;
        } else if (arg0 == '—') {
            var3 = -105;
        } else if (arg0 == '˜') {
            var3 = -104;
        } else if (arg0 == '™') {
            var3 = -103;
        } else if (arg0 == 'š') {
            var3 = -102;
        } else if (arg0 == '›') {
            var3 = -101;
        } else if (arg0 == 'œ') {
            var3 = -100;
        } else if (arg0 == 'ž') {
            var3 = -98;
        } else if (arg0 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 32767) {
            return;
        }
        field3319++;
        if (arg4 == arg7) {
            class245.method1751(arg0, arg3, arg6, arg7, arg2, arg1, 120);
        } else if (arg2 - arg7 >= class23.field423 && class272.field4552 >= arg2 + arg7 && class55.field972 <= arg6 - arg4 && (arg4 + arg6) <= class240.field4053) {
            class210.method1472(arg0, arg7, arg6, arg3, arg2, arg4, arg1, 995311490);
        } else {
            class227.method1609(arg0, arg2, (byte) 56, arg6, arg3, arg1, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        if (class298.field4864 > 0) {
            class298.field4864--;
        }
        field3312++;
        if (class155.field2572 > 1) {
            class155.field2572--;
            class228.field3856 = class196.field3162;
        }
        if (class273.field4575) {
            class273.field4575 = false;
            class238.method1704(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class243.method1743((byte) 3); var1++) {
        }
        if (class26.field458 != 30) {
            return;
        }
        class275.method1931(false, 57, class236.field3980);
        Object var2 = class101.field1599.field2781;
        synchronized (class101.field1599.field2781) {
            if (!class159.field2596) {
                class101.field1599.field2782 = 0;
            } else if (class29.field490 != 0 || class101.field1599.field2782 >= 40) {
                int var3 = 0;
                class236.field3980.method640((byte) 97, 163);
                class182.field2902++;
                class236.field3980.method1780(0, 102);
                int var4 = class236.field3980.field4160;
                for (int var5 = 0; class101.field1599.field2782 > var5 && (class236.field3980.field4160 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class101.field1599.field2786[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class101.field1599.field2790[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class101.field1599.field2790[var5] == -1 && class101.field1599.field2786[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class297.field4861 != var6 || class267.field4453 != var7) {
                        int var9 = var6 - class297.field4861;
                        int var10 = var7 - class267.field4453;
                        class267.field4453 = var7;
                        class297.field4861 = var6;
                        if (class214.field3599 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class236.field3980.method1771((class214.field3599 << 12) + (var9 << 6) + var10, (byte) 30);
                            class214.field3599 = 0;
                        } else if (class214.field3599 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            class236.field3980.method1780(class214.field3599 + 128, 121);
                            var10 += 128;
                            class236.field3980.method1771((var9 << 8) + var10, (byte) 30);
                            class214.field3599 = 0;
                        } else if (class214.field3599 < 32) {
                            class236.field3980.method1780(class214.field3599 + 192, 92);
                            if (var8) {
                                class236.field3980.method1811(Integer.MIN_VALUE, (byte) 51);
                            } else {
                                class236.field3980.method1811(var7 << 16 | var6, (byte) 51);
                            }
                            class214.field3599 = 0;
                        } else {
                            class236.field3980.method1771(class214.field3599 + 57344, (byte) 30);
                            if (var8) {
                                class236.field3980.method1811(Integer.MIN_VALUE, (byte) 51);
                            } else {
                                class236.field3980.method1811(var7 << 16 | var6, (byte) 51);
                            }
                            class214.field3599 = 0;
                        }
                    } else if (class214.field3599 < 2047) {
                        class214.field3599++;
                    }
                }
                class236.field3980.method1797(class236.field3980.field4160 - var4, (byte) -106);
                if (var3 < class101.field1599.field2782) {
                    class101.field1599.field2782 -= var3;
                    for (int var11 = 0; var11 < class101.field1599.field2782; var11++) {
                        class101.field1599.field2786[var11] = class101.field1599.field2786[var11 + var3];
                        class101.field1599.field2790[var11] = class101.field1599.field2790[var3 + var11];
                    }
                } else {
                    class101.field1599.field2782 = 0;
                }
            }
        }
        if (class29.field490 != 0) {
            class30.field505++;
            long var12 = (class170.field2750 - class135.field2221) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class298.field4870;
            class135.field2221 = class170.field2750;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class32.field526;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class29.field490 == 2) {
                var16 = 1;
            }
            class236.field3980.method640((byte) 97, 244);
            int var17 = (int) var12;
            class236.field3980.method1771(var17 | var16 << 15, (byte) 30);
            class236.field3980.method1811(var14 | var15 << 16, (byte) 51);
        }
        if (class119.field2001 > 0) {
            class119.field2001--;
        }
        if (class271.field4520 && class119.field2001 <= 0) {
            class271.field4520 = false;
            class119.field2001 = 20;
            class236.field3980.method640((byte) 97, 101);
            class236.field3980.method1822((int) class187.field2993, 554582280);
            class236.field3980.method1771((int) class265.field4432, (byte) 30);
            class24.field434++;
        }
        if (class195.field3153 && !class7.field148) {
            class7.field148 = true;
            class24.field435++;
            class236.field3980.method640((byte) 97, 51);
            class236.field3980.method1780(1, 122);
        }
        if (!class195.field3153 && class7.field148) {
            class24.field435++;
            class7.field148 = false;
            class236.field3980.method640((byte) 97, 51);
            class236.field3980.method1780(0, 112);
        }
        if (!class51.field864) {
            class236.field3980.method640((byte) 97, 12);
            class236.field3980.method1811(class293.method2024(-104), (byte) 51);
            class286.field4741++;
            class51.field864 = true;
        }
        if (class275.field4605) {
            class275.field4605 = false;
        } else {
            class43.field658 /= 2.0F;
        }
        if (class260.field4362) {
            class260.field4362 = false;
        } else {
            class250.field4237 /= 2.0F;
        }
        class286.method1997((byte) -81);
        if (class26.field458 != 30) {
            return;
        }
        class1.method21(true);
        class167.method1243(true);
        class104.method752(-7619);
        class243.field4073++;
        if (class243.field4073 > 750) {
            class238.method1704(0);
            return;
        }
        class312.method2109((byte) 40);
        class72.method508((byte) -109);
        client.method737((byte) 127);
        for (int var18 = class310.method2089(-1, true); var18 != -1; var18 = class310.method2089(-1, false)) {
            class279.method1950(var18, false);
            class255.field4317[class15.method84(class236.field3986++, 31)] = var18;
        }
        for (class36 var19 = class134.method994(-17661); var19 != null; var19 = class134.method994(-17661)) {
            int var20 = var19.method228((byte) -37);
            int var21 = var19.method226(114);
            if (var20 == 1) {
                class12.field234[var21] = var19.field577;
                class216.field3654[class15.method84(31, class20.field365++)] = var21;
            } else if (var20 == 2) {
                class93.field1525[var21] = var19.field583;
                class265.field4433[class15.method84(class190.field3045++, 31)] = var21;
            } else if (var20 == 3) {
                class207 var22 = class222.method1574(125, var21);
                if (!var19.field583.equals(var22.field3346)) {
                    var22.field3346 = var19.field583;
                    method1441(0, var22);
                }
            } else if (var20 == 4) {
                class207 var40 = class222.method1574(109, var21);
                int var41 = var19.field577;
                int var42 = var19.field562;
                int var43 = var19.field560;
                if (var40.field3393 != var41 || var40.field3381 != var43 || var40.field3453 != var42) {
                    var40.field3453 = var42;
                    var40.field3381 = var43;
                    var40.field3393 = var41;
                    method1441(0, var40);
                }
            } else if (var20 == 5) {
                class207 var39 = class222.method1574(118, var21);
                if (var19.field577 != var39.field3501 || var19.field577 == -1) {
                    var39.field3365 = 0;
                    var39.field3501 = var19.field577;
                    var39.field3445 = 1;
                    var39.field3512 = 0;
                    method1441(0, var39);
                }
            } else if (var20 == 6) {
                int var33 = var19.field577;
                int var34 = (var33 & 0x3F6) >> 5;
                int var35 = var33 & 0x1F;
                class207 var36 = class222.method1574(121, var21);
                int var37 = (var33 & 0x7E07) >> 10;
                int var38 = (var34 << 11) + ((var37 << 19) + (var35 << 3));
                if (var36.field3403 != var38) {
                    var36.field3403 = var38;
                    method1441(0, var36);
                }
            } else if (var20 == 7) {
                class207 var23 = class222.method1574(126, var21);
                boolean var24 = var19.field577 == 1;
                if (var24 != var23.field3487) {
                    var23.field3487 = var24;
                    method1441(0, var23);
                }
            } else if (var20 == 8) {
                class207 var32 = class222.method1574(122, var21);
                if (var19.field577 != var32.field3370 || var19.field560 != var32.field3366 || var19.field562 != var32.field3352) {
                    var32.field3366 = var19.field560;
                    var32.field3370 = var19.field577;
                    var32.field3352 = var19.field562;
                    if (var32.field3454 != -1) {
                        if (var32.field3332 > 0) {
                            var32.field3352 = var32.field3352 * 32 / var32.field3332;
                        } else if (var32.field3480 > 0) {
                            var32.field3352 = var32.field3352 * 32 / var32.field3480;
                        }
                    }
                    method1441(0, var32);
                }
            } else if (var20 == 9) {
                class207 var31 = class222.method1574(105, var21);
                if (var19.field577 != var31.field3454 || var19.field560 != var31.field3434) {
                    var31.field3454 = var19.field577;
                    var31.field3434 = var19.field560;
                    method1441(0, var31);
                }
            } else if (var20 == 10) {
                class207 var25 = class222.method1574(121, var21);
                if (var19.field577 != var25.field3429 || var19.field560 != var25.field3372 || var19.field562 != var25.field3387) {
                    var25.field3372 = var19.field560;
                    var25.field3429 = var19.field577;
                    var25.field3387 = var19.field562;
                    method1441(0, var25);
                }
            } else if (var20 == 11) {
                class207 var26 = class222.method1574(111, var21);
                var26.field3417 = 0;
                var26.field3368 = var26.field3338 = var19.field577;
                var26.field3510 = 0;
                var26.field3424 = var26.field3506 = var19.field560;
                method1441(0, var26);
            } else if (var20 == 12) {
                class207 var27 = class222.method1574(117, var21);
                int var28 = var19.field577;
                if (var27 != null && var27.field3376 == 0) {
                    if (var27.field3344 - var27.field3481 < var28) {
                        var28 = var27.field3344 - var27.field3481;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field3374 != var28) {
                        var27.field3374 = var28;
                        method1441(0, var27);
                    }
                }
            } else if (var20 == 13) {
                class207 var30 = class222.method1574(106, var21);
                var30.field3426 = var19.field577;
            } else if (var20 == 14) {
                class207 var29 = class222.method1574(126, var21);
                var29.field3432 = var19.field577;
            }
        }
        class19.field356++;
        if (class268.field4455 != 0) {
            class81.field1352 += 20;
            if (class81.field1352 >= 400) {
                class268.field4455 = 0;
            }
        }
        if (class104.field1692 != null) {
            class134.field2211++;
            if (class134.field2211 >= 15) {
                method1441(0, class104.field1692);
                class104.field1692 = null;
            }
        }
        if (class274.field4582 != null) {
            method1441(0, class274.field4582);
            class36.field572++;
            if (class96.field1558 > (class11.field192 + 5) || class96.field1558 < class11.field192 - 5 || class87.field1448 > (class61.field1053 + 5) || class61.field1053 - 5 > class87.field1448) {
                class183.field2928 = true;
            }
            if (class171.field2763 == 0) {
                if (class183.field2928 && class36.field572 >= 5) {
                    if (class274.field4582 == class268.field4454 && class78.field1320 != class259.field4359) {
                        class115.field1958++;
                        byte var44 = 0;
                        class207 var45 = class274.field4582;
                        if (class313.field5043 == 1 && var45.field3495 == 206) {
                            var44 = 1;
                        }
                        if (var45.field3421[class259.field4359] <= 0) {
                            var44 = 0;
                        }
                        if (client.method732(var45).method131(false)) {
                            int var46 = class78.field1320;
                            int var47 = class259.field4359;
                            var45.field3421[var47] = var45.field3421[var46];
                            var45.field3354[var47] = var45.field3354[var46];
                            var45.field3421[var46] = -1;
                            var45.field3354[var46] = 0;
                        } else if (var44 == 1) {
                            int var48 = class78.field1320;
                            int var49 = class259.field4359;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var45.method1448(var48, 24624, var48 - 1);
                                    var48--;
                                } else if (var49 > var48) {
                                    var45.method1448(var48, 24624, var48 + 1);
                                    var48++;
                                }
                            }
                        } else {
                            var45.method1448(class78.field1320, 24624, class259.field4359);
                        }
                        class236.field3980.method640((byte) 97, 44);
                        class236.field3980.method1778(class259.field4359, -13989);
                        class236.field3980.method1798(class274.field4582.field3405, -105);
                        class236.field3980.method1778(class78.field1320, -13989);
                        class236.field3980.method1782(var44, -1);
                    }
                } else if ((class20.field375 == 1 || class174.method1284(4001, class287.field4747 - 1)) && class287.field4747 > 2) {
                    class1.method7(-13055);
                } else if (class287.field4747 > 0) {
                    class6.method45(2);
                }
                class134.field2211 = 10;
                class29.field490 = 0;
                class274.field4582 = null;
            }
        }
        class3.field102 = false;
        class207 var50 = class70.field1169;
        class25.field444 = 0;
        class313.field5049 = false;
        class207 var51 = class163.field2655;
        class163.field2655 = null;
        class70.field1169 = null;
        class312.field5023 = null;
        while (class69.method476(-16689) && class25.field444 < 128) {
            class94.field1539[class25.field444] = class155.field2565;
            class4.field120[class25.field444] = class272.field4542;
            class25.field444++;
        }
        class27.field471 = null;
        if (class243.field4082 != -1) {
            class189.method1367(0, (byte) 9, 0, 0, class182.field2901, class243.field4082, 0, class155.field2567);
        }
        class196.field3162++;
        if (class27.field471 != null) {
            class267.method1882(-1);
        }
        while (true) {
            class303 var52;
            class207 var53;
            class207 var54;
            do {
                var52 = (class303) class190.field3085.method316(101);
                if (var52 == null) {
                    while (true) {
                        class303 var55;
                        class207 var56;
                        class207 var57;
                        do {
                            var55 = (class303) class215.field3619.method316(-65);
                            if (var55 == null) {
                                while (true) {
                                    class303 var58;
                                    class207 var59;
                                    class207 var60;
                                    do {
                                        var58 = (class303) class300.field4904.method316(85);
                                        if (var58 == null) {
                                            if (class27.field471 == null) {
                                                class209.field3539 = 0;
                                            }
                                            if (class162.field2635 != null) {
                                                class140.method1040(78);
                                            }
                                            if (class233.field3942 > 0 && class157.field2581[82] && class157.field2581[81] && class228.field3855 != 0) {
                                                int var61 = class182.field2898 - class228.field3855;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class306.method2073(var61, class16.field314.field711[0] + class26.field462, (byte) 9, class16.field314.field717[0] + class78.field1313);
                                            }
                                            if (class233.field3942 > 0 && class157.field2581[82] && class157.field2581[81]) {
                                                if (class97.field1571 != -1) {
                                                    class306.method2073(class182.field2898, class97.field1571 + class26.field462, (byte) 9, class78.field1313 + class100.field1587);
                                                }
                                                class121.field2028 = 0;
                                                class217.field3672 = 0;
                                            } else if (class217.field3672 == 2) {
                                                if (class97.field1571 != -1) {
                                                    class105.field1729++;
                                                    class236.field3980.method640((byte) 97, 7);
                                                    class236.field3980.method1771(class97.field1571 + class26.field462, (byte) 30);
                                                    class236.field3980.method1798(class173.field2785, -108);
                                                    class236.field3980.method1822(class78.field1313 + class100.field1587, 554582280);
                                                    class236.field3980.method1822(class42.field646, 554582280);
                                                    class268.field4455 = 1;
                                                    class216.field3650 = class32.field526;
                                                    class81.field1352 = 0;
                                                    class5.field132 = class298.field4870;
                                                }
                                                class217.field3672 = 0;
                                            } else if (class121.field2028 == 2) {
                                                if (class97.field1571 != -1) {
                                                    class231.field3915++;
                                                    class236.field3980.method640((byte) 97, 47);
                                                    class236.field3980.method1822(class97.field1571 + class26.field462, 554582280);
                                                    class236.field3980.method1790(class78.field1313 + class100.field1587, 76);
                                                    class5.field132 = class298.field4870;
                                                    class216.field3650 = class32.field526;
                                                    class268.field4455 = 1;
                                                    class81.field1352 = 0;
                                                }
                                                class121.field2028 = 0;
                                            } else if (class97.field1571 != -1 && class217.field3672 == 0 && class121.field2028 == 0) {
                                                int var62 = (class97.field1571 << 1) + 1 - class16.field314.method294((byte) -108) >> 1;
                                                int var63 = (class100.field1587 << 1) + 1 - class16.field314.method294((byte) -102) >> 1;
                                                class303.method2061(var63, var62, 0, -128);
                                                class268.field4455 = 1;
                                                class216.field3650 = class32.field526;
                                                class5.field132 = class298.field4870;
                                                class81.field1352 = 0;
                                                class190.method1373(0, 0, 0, true, 26204, var63, var62, class16.field314.field711[0], 0, 0, class16.field314.field717[0]);
                                            }
                                            class97.field1571 = -1;
                                            class221.method1570(-10);
                                            if (class70.field1169 != var50) {
                                                if (var50 != null) {
                                                    method1441(0, var50);
                                                }
                                                if (class70.field1169 != null) {
                                                    method1441(0, class70.field1169);
                                                }
                                            }
                                            if (class163.field2655 != var51 && class61.field1056 == class241.field4068) {
                                                if (var51 != null) {
                                                    method1441(0, var51);
                                                }
                                                if (class163.field2655 != null) {
                                                    method1441(0, class163.field2655);
                                                }
                                            }
                                            if (class163.field2655 == null) {
                                                if (class241.field4068 > 0) {
                                                    class241.field4068--;
                                                }
                                            } else if (class241.field4068 < class61.field1056) {
                                                class241.field4068++;
                                                if (class61.field1056 == class241.field4068) {
                                                    method1441(0, class163.field2655);
                                                }
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class203.field3254[var64]++;
                                            }
                                            if (arg0 <= 119) {
                                                method1441(-84, (class207) null);
                                            }
                                            int var65 = class84.method594(false);
                                            int var66 = class195.method1389(119);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class170.field2760++;
                                                class298.field4864 = 250;
                                                class270.method1906(-47, 14500);
                                                class236.field3980.method640((byte) 97, 160);
                                            }
                                            if (class220.field3703 != null && class220.field3703.field3091 == 1) {
                                                if (class220.field3703.field3089 != null) {
                                                    class107.method801(class47.field818, (byte) 119, class100.field1595);
                                                }
                                                class47.field818 = false;
                                                class100.field1595 = null;
                                                class220.field3703 = null;
                                            }
                                            class151.field2528++;
                                            class55.field975++;
                                            class121.field2024++;
                                            if (class55.field975 > 500) {
                                                class55.field975 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class234.field3950 += class193.field3104;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class127.field2124 += class23.field414;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class17.field338 += class224.field3785;
                                                }
                                            }
                                            if (class17.field338 < -40) {
                                                class224.field3785 = 1;
                                            }
                                            if (class127.field2124 < -55) {
                                                class23.field414 = 2;
                                            }
                                            if (class121.field2024 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                class121.field2024 = 0;
                                                if ((var68 & 0x2) == 2) {
                                                    class286.field4738 += class30.field503;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class314.field5060 += class232.field3933;
                                                }
                                            }
                                            if (class234.field3950 < -50) {
                                                class193.field3104 = 2;
                                            }
                                            if (class127.field2124 > 55) {
                                                class23.field414 = -2;
                                            }
                                            if (class314.field5060 < -60) {
                                                class232.field3933 = 2;
                                            }
                                            if (class286.field4738 < -20) {
                                                class30.field503 = 1;
                                            }
                                            if (class314.field5060 > 60) {
                                                class232.field3933 = -2;
                                            }
                                            if (class17.field338 > 40) {
                                                class224.field3785 = -1;
                                            }
                                            if (class286.field4738 > 10) {
                                                class30.field503 = -1;
                                            }
                                            if (class234.field3950 > 50) {
                                                class193.field3104 = -2;
                                            }
                                            if (class151.field2528 > 50) {
                                                class236.field3980.method640((byte) 97, 5);
                                                class310.field4988++;
                                            }
                                            if (class203.field3255) {
                                                class278.method1943(33);
                                                class203.field3255 = false;
                                            }
                                            try {
                                                if (class159.field2609 != null && class236.field3980.field4160 > 0) {
                                                    class159.field2609.method1066(class236.field3980.field4182, -38, class236.field3980.field4160, 0);
                                                    class236.field3980.field4160 = 0;
                                                    class151.field2528 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class238.method1704(0);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4931;
                                        if (var59.field3369 < 0) {
                                            break;
                                        }
                                        var60 = class222.method1574(106, var59.field3465);
                                    } while (var60 == null || var60.field3462 == null || var59.field3369 >= var60.field3462.length || var60.field3462[var59.field3369] != var59);
                                    class269.method1893(-3725, var58);
                                }
                            }
                            var56 = var55.field4931;
                            if (var56.field3369 < 0) {
                                break;
                            }
                            var57 = class222.method1574(124, var56.field3465);
                        } while (var57 == null || var57.field3462 == null || var57.field3462.length <= var56.field3369 || var57.field3462[var56.field3369] != var56);
                        class269.method1893(-3725, var55);
                    }
                }
                var53 = var52.field4931;
                if (var53.field3369 < 0) {
                    break;
                }
                var54 = class222.method1574(106, var53.field3465);
            } while (var54 == null || var54.field3462 == null || var54.field3462.length <= var53.field3369 || var54.field3462[var53.field3369] != var53);
            class269.method1893(-3725, var52);
        }
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V")
    public static void method1440(int arg0) {
        field3323 = null;
        field3331 = null;
        field3329 = null;
        int var1 = 113 % ((arg0 - 29) / 62);
        field3314 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILhg;)V")
    public static final void method1441(int arg0, class207 arg1) {
        if (arg0 == 0) {
            field3325++;
            if (class17.field344 == arg1.field3508) {
                class143.field2351[arg1.field3471] = true;
            }
        }
    }
}
