import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class165 {

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    private int field2733;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[[I")
    public int[][] field2738;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    private int field2744;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Leg;")
    public static class37 field2727 = class174.method1167("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 92);

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Leg;")
    public static class37 field2745 = class174.method1167("::clientdrop", 122);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
    public static int[] field2747;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "[Lmd;")
    public static class208[] field2748;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method1098(int arg0) {
        if (class96.field1501 > 1) {
            class280.field4950 = class221.field3804;
            class96.field1501--;
        }
        field2729++;
        if (class9.field156 > 0) {
            class9.field156--;
        }
        if (class2.field50) {
            class2.field50 = false;
            class137.method971(arg0 + 20895);
            return;
        }
        for (int var1 = 0; var1 < 100 && class133.method948(0); var1++) {
        }
        if (class232.field4011 != 30) {
            return;
        }
        class235.method1611(25, (byte) 101, class273.field4778);
        Object var2 = class7.field108.field3802;
        synchronized (class7.field108.field3802) {
            if (!class80.field1247) {
                class7.field108.field3811 = 0;
            } else if (class32.field465 != 0 || class7.field108.field3811 >= 40) {
                class198.field3360++;
                class273.field4778.method1697(208, 125);
                class273.field4778.method1292(0, (byte) -64);
                int var3 = 0;
                int var4 = class273.field4778.field3169;
                for (int var5 = 0; var5 < class7.field108.field3811 && (class273.field4778.field3169 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class7.field108.field3806[var5];
                    int var7 = class7.field108.field3808[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (class7.field108.field3808[var5] == -1 && class7.field108.field3806[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class59.field978 != var6 || class234.field4037 != var7) {
                        int var9 = var6 - class59.field978;
                        class59.field978 = var6;
                        int var10 = var7 - class234.field4037;
                        class234.field4037 = var7;
                        if (class186.field3123 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class273.field4778.method1294((class186.field3123 << 12) + (var9 << 6) + var10, -26655);
                            class186.field3123 = 0;
                        } else if (class186.field3123 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class273.field4778.method1292(class186.field3123 + 128, (byte) -64);
                            class273.field4778.method1294((var9 << 8) + var10, -26655);
                            class186.field3123 = 0;
                        } else if (class186.field3123 < 32) {
                            class273.field4778.method1292(class186.field3123 + 192, (byte) -64);
                            if (var8) {
                                class273.field4778.method1272(27862, Integer.MIN_VALUE);
                            } else {
                                class273.field4778.method1272(27862, var6 | var7 << 16);
                            }
                            class186.field3123 = 0;
                        } else {
                            class273.field4778.method1294(class186.field3123 + 57344, arg0 + -5760);
                            if (var8) {
                                class273.field4778.method1272(27862, Integer.MIN_VALUE);
                            } else {
                                class273.field4778.method1272(27862, var7 << 16 | var6);
                            }
                            class186.field3123 = 0;
                        }
                    } else if (class186.field3123 < 2047) {
                        class186.field3123++;
                    }
                }
                class273.field4778.method1296(252, class273.field4778.field3169 - var4);
                if (class7.field108.field3811 <= var3) {
                    class7.field108.field3811 = 0;
                } else {
                    class7.field108.field3811 -= var3;
                    for (int var11 = 0; var11 < class7.field108.field3811; var11++) {
                        class7.field108.field3806[var11] = class7.field108.field3806[var3 + var11];
                        class7.field108.field3808[var11] = class7.field108.field3808[var3 + var11];
                    }
                }
            }
        }
        if (class32.field465 != 0) {
            class277.field4912++;
            long var12 = (class182.field3040 - class8.field140) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class8.field140 = class182.field3040;
            int var14 = class110.field1837;
            int var15 = class163.field2685;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var16 = 0;
            if (class32.field465 == 2) {
                var16 = 1;
            }
            class273.field4778.method1697(53, arg0 ^ 0xFFFFAE02);
            int var17 = (int) var12;
            class273.field4778.method1262(41, var16 << 15 | var17);
            class273.field4778.method1299(var14 << 16 | var15, -112);
        }
        if (class221.field3805 > 0) {
            class221.field3805--;
        }
        if (class202.field3458) {
            for (int var18 = 0; var18 < class230.field3934; var18++) {
                int var19 = class215.field3717[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class190.field3260 = true;
                    break;
                }
            }
        } else if (class158.field2625[96] || class158.field2625[97] || class158.field2625[98] || class158.field2625[99]) {
            class190.field3260 = true;
        }
        if (class190.field3260 && class221.field3805 <= 0) {
            class190.field3260 = false;
            class221.field3805 = 20;
            class273.field4778.method1697(254, 123);
            class273.field4778.method1265(class25.field355, arg0 - 2237);
            class167.field2773++;
            class273.field4778.method1265(class10.field166, -23132);
        }
        if (class112.field1914 && !class46.field720) {
            class46.field720 = true;
            class273.field4778.method1697(97, 115);
            class108.field1731++;
            class273.field4778.method1292(1, (byte) -64);
        }
        if (!class112.field1914 && class46.field720) {
            class108.field1731++;
            class46.field720 = false;
            class273.field4778.method1697(97, 114);
            class273.field4778.method1292(0, (byte) -64);
        }
        if (!class234.field4042) {
            class273.field4778.method1697(142, arg0 ^ 0xFFFFAE1B);
            class24.field313++;
            class273.field4778.method1299(class75.method502((byte) -22), 114);
            class234.field4042 = true;
        }
        class213.method1517(arg0 ^ 0x51EF);
        if (class232.field4011 != 30) {
            return;
        }
        class37.method248((byte) 126);
        class263.method1781(-25157);
        class109.field1772++;
        if (class109.field1772 > 750) {
            class137.method971(0);
            return;
        }
        class66.method458((byte) -83);
        class158.method1080(127);
        class208.method1438((byte) 36);
        if (class27.field379 != null) {
            class71.method482(-125);
        }
        for (int var20 = class226.method1576(true, arg0 ^ 0x26CB); var20 != -1; var20 = class226.method1576(false, -30550)) {
            class86.method568(13695, var20);
            class215.field3715[class96.method626(31, class117.field1995++)] = var20;
        }
        for (class274 var21 = class202.method1406(arg0 - 4451); var21 != null; var21 = class202.method1406(-25346)) {
            int var22 = var21.method1833(-1904584224);
            int var23 = var21.method1843(0);
            if (var22 == 1) {
                class166.field2753[var23] = var21.field4802;
                class60.field985[class96.method626(31, class239.field4262++)] = var23;
            } else if (var22 == 2) {
                class230.field3935[var23] = var21.field4812;
                class73.field1148[class96.method626(class178.field2968++, 31)] = var23;
            } else if (var22 == 3) {
                class237 var24 = class156.method1066(arg0 ^ 0x51C8, var23);
                if (!var21.field4812.method223(var24.field4098, (byte) 63)) {
                    var24.field4098 = var21.field4812;
                    class121.method856(24665, var24);
                }
            } else if (var22 == 4) {
                class237 var25 = class156.method1066(-85, var23);
                int var26 = var21.field4802;
                int var27 = var21.field4824;
                if (var25.field4119 != var26 || var25.field4085 != var27) {
                    var25.field4085 = var27;
                    var25.field4119 = var26;
                    class121.method856(24665, var25);
                }
            } else if (var22 == 5) {
                class237 var28 = class156.method1066(arg0 + 20809, var23);
                if (var21.field4802 != var28.field4181 || var21.field4802 == -1) {
                    var28.field4181 = var21.field4802;
                    var28.field4165 = 0;
                    var28.field4110 = 0;
                    class121.method856(24665, var28);
                }
            } else if (var22 == 6) {
                int var38 = var21.field4802;
                int var39 = var38 >> 10 & 0x1F;
                int var40 = var38 >> 5 & 0x1F;
                class237 var41 = class156.method1066(arg0 + 20800, var23);
                int var42 = var38 & 0x1F;
                int var43 = (var39 << 19) + (var42 << 3) + (var40 << 11);
                if (var41.field4124 != var43) {
                    var41.field4124 = var43;
                    class121.method856(24665, var41);
                }
            } else if (var22 == 7) {
                class237 var36 = class156.method1066(-109, var23);
                boolean var37 = var21.field4802 == 1;
                if (var36.field4133 != var37) {
                    var36.field4133 = var37;
                    class121.method856(arg0 ^ 0xFFFFCE38, var36);
                }
            } else if (var22 == 8) {
                class237 var35 = class156.method1066(-109, var23);
                if (var21.field4802 != var35.field4107 || var21.field4824 != var35.field4145 || var21.field4813 != var35.field4192) {
                    var35.field4192 = var21.field4813;
                    var35.field4107 = var21.field4802;
                    if (var35.field4080 != -1) {
                        if (var35.field4073 > 0) {
                            var35.field4192 = var35.field4192 * 32 / var35.field4073;
                        } else if (var35.field4141 > 0) {
                            var35.field4192 = var35.field4192 * 32 / var35.field4141;
                        }
                    }
                    var35.field4145 = var21.field4824;
                    class121.method856(24665, var35);
                }
            } else if (var22 == 9) {
                class237 var34 = class156.method1066(arg0 ^ 0x51ED, var23);
                if (var21.field4802 != var34.field4080 || var21.field4824 != var34.field4200) {
                    var34.field4080 = var21.field4802;
                    var34.field4200 = var21.field4824;
                    class121.method856(24665, var34);
                }
            } else if (var22 == 10) {
                class237 var29 = class156.method1066(-75, var23);
                if (var21.field4802 != var29.field4199 || var21.field4824 != var29.field4130 || var21.field4813 != var29.field4162) {
                    var29.field4130 = var21.field4824;
                    var29.field4199 = var21.field4802;
                    var29.field4162 = var21.field4813;
                    class121.method856(arg0 ^ 0xFFFFCE38, var29);
                }
            } else if (var22 == 11) {
                class237 var30 = class156.method1066(arg0 + 20787, var23);
                var30.field4183 = var30.field4185 = var21.field4802;
                var30.field4222 = 0;
                var30.field4086 = 0;
                var30.field4074 = var30.field4072 = var21.field4824;
                class121.method856(24665, var30);
            } else if (var22 == 12) {
                class237 var32 = class156.method1066(-86, var23);
                int var33 = var21.field4802;
                if (var32 != null && var32.field4228 == 0) {
                    if (var33 > (var32.field4090 - var32.field4206)) {
                        var33 = var32.field4090 - var32.field4206;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field4122 != var33) {
                        var32.field4122 = var33;
                        class121.method856(24665, var32);
                    }
                }
            } else if (var22 == 13) {
                class237 var31 = class156.method1066(-107, var23);
                var31.field4167 = var21.field4802;
            }
        }
        if (class217.field3734 != 0) {
            class201.field3423 += 20;
            if (class201.field3423 >= 400) {
                class217.field3734 = 0;
            }
        }
        class259.field4588++;
        if (class60.field986 != null) {
            class189.field3255++;
            if (class189.field3255 >= 15) {
                class121.method856(24665, class60.field986);
                class60.field986 = null;
            }
        }
        if (class198.field3376 != null) {
            class121.method856(arg0 ^ 0xFFFFCE38, class198.field3376);
            class200.field3402++;
            if ((class139.field2393 + 5) < class26.field363 || (class139.field2393 - 5) > class26.field363 || class268.field4689 > (class262.field4616 + 5) || class268.field4689 < (class262.field4616 - 5)) {
                class188.field3234 = true;
            }
            if (class104.field1620 == 0) {
                if (class188.field3234 && class200.field3402 >= 5) {
                    if (class198.field3376 == class181.field3030 && class290.field5111 != class143.field2437) {
                        class224.field3843++;
                        byte var44 = 0;
                        class237 var45 = class198.field3376;
                        if (class208.field3533 == 1 && var45.field4175 == 206) {
                            var44 = 1;
                        }
                        if (var45.field4094[class143.field2437] <= 0) {
                            var44 = 0;
                        }
                        if (class50.method325(client.method787(var45), arg0 ^ 0xFFFFAE60)) {
                            int var46 = class143.field2437;
                            int var47 = class290.field5111;
                            var45.field4094[var46] = var45.field4094[var47];
                            var45.field4123[var46] = var45.field4123[var47];
                            var45.field4094[var47] = -1;
                            var45.field4123[var47] = 0;
                        } else if (var44 == 1) {
                            int var48 = class143.field2437;
                            int var49 = class290.field5111;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var45.method1625(var49 - 1, arg0 ^ 0x51E1, var49);
                                    var49--;
                                } else if (var49 < var48) {
                                    var45.method1625(var49 + 1, arg0 + 20768, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method1625(class143.field2437, -127, class290.field5111);
                        }
                        class273.field4778.method1697(255, 105);
                        class273.field4778.method1265(class290.field5111, arg0 - 2237);
                        class273.field4778.method1262(111, class143.field2437);
                        class273.field4778.method1288(7846, var44);
                        class273.field4778.method1272(27862, class198.field3376.field4211);
                    }
                } else if ((class234.field4040 == 1 || class102.method688(arg0 + 18894, class159.field2661 + -1)) && class159.field2661 > 2) {
                    class10.method59(-56);
                } else if (class159.field2661 > 0) {
                    class96.method624((byte) -52);
                }
                class198.field3376 = null;
                class189.field3255 = 10;
                class32.field465 = 0;
            }
        }
        class13.field207 = null;
        class95.field1494 = false;
        class53.field826 = false;
        class237 var50 = class232.field3995;
        class230.field3934 = 0;
        class232.field3995 = null;
        class237 var51 = class184.field3097;
        class184.field3097 = null;
        while (class80.method541(120) && class230.field3934 < 128) {
            class215.field3717[class230.field3934] = class48.field758;
            class140.field2414[class230.field3934] = class241.field4287;
            class230.field3934++;
        }
        class27.field379 = null;
        if (class234.field4044 != -1) {
            class118.method843(class249.field4479, 0, 0, class234.field4044, (byte) -116, 0, 0, class199.field3390);
        }
        class221.field3804++;
        while (true) {
            class85 var52;
            class237 var53;
            class237 var54;
            do {
                var52 = (class85) class89.field1419.method1569((byte) -9);
                if (var52 == null) {
                    while (true) {
                        class85 var55;
                        class237 var56;
                        class237 var57;
                        do {
                            var55 = (class85) class9.field154.method1569((byte) -9);
                            if (var55 == null) {
                                while (true) {
                                    class85 var58;
                                    class237 var59;
                                    class237 var60;
                                    do {
                                        var58 = (class85) class21.field271.method1569((byte) -9);
                                        if (var58 == null) {
                                            if (class160.field2673 && class27.field379 == null) {
                                                class160.field2673 = false;
                                            }
                                            if (class276.field4891 != null) {
                                                class172.method1158((byte) 49);
                                            }
                                            if (class127.field2129 > 0 && class158.field2625[82] && class158.field2625[81] && class271.field4761 != 0) {
                                                int var61 = class237.field4140 - class271.field4761;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class177.method1181(class82.field1285.field1812[0] + class40.field642, var61, class144.field2456 + class82.field1285.field1780[0], 906);
                                            }
                                            if (class172.field2886 != -1) {
                                                int var62 = class172.field2886;
                                                int var63 = class83.field1313;
                                                if (class127.field2129 > 0 && class158.field2625[82] && class158.field2625[81]) {
                                                    class177.method1181(class40.field642 + var62, class237.field4140, class144.field2456 + var63, 906);
                                                } else if (class99.field1538) {
                                                    class273.field4778.method1697(29, 111);
                                                    class86.field1350++;
                                                    class273.field4778.method1261(class129.field2150, arg0 ^ 0xFFFFAE03);
                                                    class273.field4778.method1291(true, class45.field709);
                                                    class273.field4778.method1265(class144.field2456 + var63, arg0 ^ 0xBC5);
                                                    class273.field4778.method1294(class40.field642 + var62, -26655);
                                                    class201.field3423 = 0;
                                                    class200.field3396 = class110.field1837;
                                                    class51.field798 = class163.field2685;
                                                    class217.field3734 = 1;
                                                } else if (class63.field1037) {
                                                    class273.field4778.method1697(204, arg0 + 21008);
                                                    class273.field4778.method1262(arg0 + 20974, class40.field642 + var62);
                                                    class82.field1288++;
                                                    class273.field4778.method1262(arg0 ^ 0xFFFFAE20, class144.field2456 + var63);
                                                    class217.field3734 = 1;
                                                    class51.field798 = class163.field2685;
                                                    class201.field3423 = 0;
                                                    class200.field3396 = class110.field1837;
                                                } else {
                                                    boolean var64 = class139.method980(0, true, var63, 0, class82.field1285.field1780[0], 0, 0, 0, 0, true, class82.field1285.field1812[0], var62);
                                                    if (var64) {
                                                        class217.field3734 = 1;
                                                        class51.field798 = class163.field2685;
                                                        class201.field3423 = 0;
                                                        class200.field3396 = class110.field1837;
                                                    }
                                                }
                                                class172.field2886 = -1;
                                                class63.field1037 = false;
                                                class99.field1538 = false;
                                            }
                                            class160.method1086(arg0 ^ 0xFFFFE74F);
                                            if (class232.field3995 != var50) {
                                                if (var50 != null) {
                                                    class121.method856(24665, var50);
                                                }
                                                if (class232.field3995 != null) {
                                                    class121.method856(24665, class232.field3995);
                                                }
                                            }
                                            if (class184.field3097 != var51 && class69.field1104 == class279.field4936) {
                                                if (var51 != null) {
                                                    class121.method856(24665, var51);
                                                }
                                                if (class184.field3097 != null) {
                                                    class121.method856(24665, class184.field3097);
                                                }
                                            }
                                            if (arg0 != -20895) {
                                                field2741 = 95;
                                            }
                                            if (class184.field3097 == null) {
                                                if (class69.field1104 > 0) {
                                                    class69.field1104--;
                                                }
                                            } else if (class279.field4936 > class69.field1104) {
                                                class69.field1104++;
                                                if (class69.field1104 == class279.field4936) {
                                                    class121.method856(arg0 + 45560, class184.field3097);
                                                }
                                            }
                                            if (class273.field4794 == 1) {
                                                class60.method433((byte) 49);
                                            } else if (class273.field4794 == 2) {
                                                class48.method317(128);
                                            } else {
                                                class264.method1783(5948);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class115.field1964[var65]++;
                                            }
                                            int var66 = class61.method436((byte) 63);
                                            int var67 = class160.method1087(-125);
                                            if (var66 > 4500 && var67 > 4500) {
                                                class9.field156 = 250;
                                                class32.field468++;
                                                class124.method895(4000, (byte) -116);
                                                class273.field4778.method1697(211, 100);
                                            }
                                            if (class123.field2070 != null && class123.field2070.field4488 == 1) {
                                                if (class123.field2070.field4483 != null) {
                                                    class234.method1608(class144.field2462, arg0 + 20899, class179.field2988);
                                                }
                                                class144.field2462 = null;
                                                class123.field2070 = null;
                                                class179.field2988 = false;
                                            }
                                            class256.field4533++;
                                            class168.field2805++;
                                            class134.field2321++;
                                            if (class134.field2321 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    field2741 += class27.field396;
                                                }
                                                class134.field2321 = 0;
                                                if ((var68 & 0x4) == 4) {
                                                    class166.field2760 += class290.field5108;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class249.field4478 += class134.field2325;
                                                }
                                            }
                                            if (class249.field4478 < -50) {
                                                class134.field2325 = 2;
                                            }
                                            if (class256.field4533 > 500) {
                                                class256.field4533 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class279.field4933 += class173.field2896;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class172.field2884 += class92.field1433;
                                                }
                                            }
                                            if (class249.field4478 > 50) {
                                                class134.field2325 = -2;
                                            }
                                            if (field2741 < -55) {
                                                class27.field396 = 2;
                                            }
                                            if (field2741 > 55) {
                                                class27.field396 = -2;
                                            }
                                            if (class166.field2760 < -40) {
                                                class290.field5108 = 1;
                                            }
                                            if (class166.field2760 > 40) {
                                                class290.field5108 = -1;
                                            }
                                            if (class279.field4933 < -60) {
                                                class173.field2896 = 2;
                                            }
                                            if (class279.field4933 > 60) {
                                                class173.field2896 = -2;
                                            }
                                            if (class172.field2884 < -20) {
                                                class92.field1433 = 1;
                                            }
                                            if (class172.field2884 > 10) {
                                                class92.field1433 = -1;
                                            }
                                            if (class168.field2805 > 50) {
                                                class273.field4778.method1697(164, 102);
                                                class25.field356++;
                                            }
                                            if (class218.field3746) {
                                                class231.method1595(true);
                                                class218.field3746 = false;
                                            }
                                            try {
                                                if (class187.field3190 != null && class273.field4778.field3169 > 0) {
                                                    class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                                                    class273.field4778.field3169 = 0;
                                                    class168.field2805 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var70) {
                                                class137.method971(0);
                                                return;
                                            }
                                        }
                                        var59 = var58.field1346;
                                        if (var59.field4120 < 0) {
                                            break;
                                        }
                                        var60 = class156.method1066(-121, var59.field4171);
                                    } while (var60 == null || var60.field4194 == null || var60.field4194.length <= var59.field4120 || var60.field4194[var59.field4120] != var59);
                                    class274.method1841(var58, 54);
                                }
                            }
                            var56 = var55.field1346;
                            if (var56.field4120 < 0) {
                                break;
                            }
                            var57 = class156.method1066(arg0 ^ 0x51C3, var56.field4171);
                        } while (var57 == null || var57.field4194 == null || var56.field4120 >= var57.field4194.length || var57.field4194[var56.field4120] != var56);
                        class274.method1841(var55, arg0 + 21007);
                    }
                }
                var53 = var52.field1346;
                if (var53.field4120 < 0) {
                    break;
                }
                var54 = class156.method1066(-112, var53.field4171);
            } while (var54 == null || var54.field4194 == null || var53.field4120 >= var54.field4194.length || var54.field4194[var53.field4120] != var53);
            class274.method1841(var52, 56);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIBI)Z")
    private final boolean method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field2743++;
        int var11 = arg1 + arg5;
        int var12 = arg2 + arg7;
        int var13 = arg6 + arg9;
        if (arg8 != 74) {
            this.method1099(117, -3, -64, 114, -34, 62, -2, 11, (byte) -104, 103);
        }
        int var14 = arg3 + arg4;
        if (arg1 >= arg9 && arg1 < var13) {
            if (arg4 == var12 && (arg0 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var11 <= var13 ? var11 : var13;
                while (var15 < var16) {
                    if ((this.field2738[var15 - this.field2744][var12 - this.field2724 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg2 == var14 && (arg0 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var11 <= var13 ? var11 : var13;
                while (var17 < var18) {
                    if ((this.field2738[var17 - this.field2744][arg2 - this.field2724] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg9 && var11 <= var13) {
            if (arg4 == var12 && (arg0 & 0x4) == 0) {
                for (int var19 = arg9; var19 < var11; var19++) {
                    if ((this.field2738[var19 - this.field2744][var12 - this.field2724 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var14 && (arg0 & 0x1) == 0) {
                for (int var20 = arg9; var20 < var11; var20++) {
                    if ((this.field2738[var20 - this.field2744][arg2 - this.field2724] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 <= arg2 && arg2 < var14) {
            if (arg9 == var11 && (arg0 & 0x8) == 0) {
                int var21 = var12 > var14 ? var14 : var12;
                for (int var22 = arg2; var22 < var21; var22++) {
                    if ((this.field2738[var11 - this.field2744 - 1][var22 - this.field2724] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg0 & 0x2) == 0) {
                int var23 = arg2;
                int var24 = var12 <= var14 ? var12 : var14;
                while (var23 < var24) {
                    if ((this.field2738[arg1 - this.field2744][var23 - this.field2724] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var12 && var14 >= var12) {
            if (arg9 == var11 && (arg0 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var12; var25++) {
                    if ((this.field2738[var11 - this.field2744 - 1][var25 - this.field2724] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var13 && (arg0 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var12; var26++) {
                    if ((this.field2738[arg1 - this.field2744][var26 - this.field2724] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public final void method1100(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2744;
        int var5 = arg1 - this.field2724;
        field2739++;
        if (arg0 > -119) {
            this.method1108(29, true, -122, (byte) 60, 118, 7);
        }
        this.field2738[var4][var5] = class94.method617(this.field2738[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public final void method1101(boolean arg0) {
        field2730++;
        if (arg0) {
            this.method1111(-117, -2, -127, -30, -82, -116, (byte) -50, 19, -30);
        }
        for (int var2 = 0; var2 < this.field2733; var2++) {
            for (int var3 = 0; var3 < this.field2732; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field2733 - 5) || var3 >= this.field2732 - 5) {
                    this.field2738[var2][var3] = 16777215;
                } else {
                    this.field2738[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZIIIII)V")
    public final void method1102(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -1) {
            this.field2738 = null;
        }
        int var8 = arg6 - this.field2744;
        field2725++;
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg2;
            arg2 = arg5;
            arg5 = var9;
        }
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        int var11 = arg3 - this.field2724;
        for (int var12 = var8; var12 < (arg2 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field2733) {
                for (int var13 = var11; var13 < (arg5 + var11); var13++) {
                    if (var13 >= 0 && var13 < this.field2732) {
                        this.method1112(1, var10, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public final void method1103(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2744;
        field2723++;
        int var5 = -9 / ((-arg2 - 57) / 47);
        int var6 = arg1 - this.field2724;
        this.field2738[var4][var6] = class94.method617(this.field2738[var4][var6], 262144);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIZII)Z")
    public final boolean method1104(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2746++;
        if (arg0 == 1) {
            if (arg3 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg7 >= arg3 && (arg3 + arg0 - 1) >= arg7 && arg1 >= arg1 && (arg1 + arg0 - 1) >= arg1) {
            return true;
        }
        int var9 = arg6 - this.field2724;
        if (!arg5) {
            return true;
        }
        int var10 = arg3 - this.field2744;
        int var11 = arg7 - this.field2744;
        int var12 = arg1 - this.field2724;
        if (arg0 == 1) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2738[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2738[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2738[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2738[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2738[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2738[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2738[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2738[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field2738[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field2738[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field2738[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if (var11 - arg0 == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field2738[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 - arg0 == var9 && (this.field2738[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 - arg0 == var10 && var12 >= var9 && var12 <= var14 && (this.field2738[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12 && (this.field2738[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9 && (this.field2738[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg0) == var9 && (this.field2738[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 >= var10 && var13 >= var11 && var12 - arg0 == var9) {
                        return true;
                    }
                    if (var11 - arg0 == var10 && var12 >= var9 && var12 <= var14 && (this.field2738[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14 && (this.field2738[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if ((var11 - arg0) == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field2738[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 - arg0) == var9 && (this.field2738[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - arg0) == var10 && var12 >= var9 && var14 >= var12 && (this.field2738[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg0) == var9 && (this.field2738[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - arg0 == var10 && var9 <= var12 && var12 <= var14 && (this.field2738[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field2738[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg0) == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 - arg0) == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field2738[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field2738[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 - arg0 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field2738[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var13 && var12 - arg0 == var9 && (this.field2738[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg0 == var10 && var9 <= var12 && var12 <= var14 && (this.field2738[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12 && (this.field2738[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method1105(int arg0) {
        if (arg0 >= 105) {
            field2745 = null;
            field2748 = null;
            field2747 = null;
            field2727 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZIIII)V")
    public final void method1106(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2724;
        int var8 = arg3 - this.field2744;
        field2731++;
        int var9 = 256;
        if (arg1) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg5 + var8; var10++) {
            if (var10 >= 0 && this.field2733 > var10) {
                for (int var11 = var7; var11 < arg4 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field2732) {
                        this.method1113(var11, var10, var9, -91);
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.method1110(120, -35, -51, -74, 121, 53, -126, -66, 31);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
    public final void method1107(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field2732 = 32;
        }
        field2726++;
        int var4 = arg1 - this.field2744;
        int var5 = arg0 - this.field2724;
        this.field2738[var4][var5] = class96.method626(this.field2738[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZIBII)V")
    public final void method1108(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2744;
        int var8 = arg5 - this.field2724;
        field2734++;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1113(var8, var7, 128, 85);
                this.method1113(var8, var7 - 1, 8, 110);
            }
            if (arg0 == 1) {
                this.method1113(var8, var7, 2, -44);
                this.method1113(var8 + 1, var7, 32, 101);
            }
            if (arg0 == 2) {
                this.method1113(var8, var7, 8, 123);
                this.method1113(var8, var7 + 1, 128, -105);
            }
            if (arg0 == 3) {
                this.method1113(var8, var7, 32, -81);
                this.method1113(var8 - 1, var7, 2, 106);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1113(var8, var7, 1, 117);
                this.method1113(var8 + 1, var7 - 1, 16, -57);
            }
            if (arg0 == 1) {
                this.method1113(var8, var7, 4, 125);
                this.method1113(var8 + 1, var7 - -1, 64, 88);
            }
            if (arg0 == 2) {
                this.method1113(var8, var7, 16, 96);
                this.method1113(var8 - 1, var7 + 1, 1, 95);
            }
            if (arg0 == 3) {
                this.method1113(var8, var7, 64, 117);
                this.method1113(var8 - 1, var7 + -1, 4, 90);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1113(var8, var7, 130, -57);
                this.method1113(var8, var7 - 1, 8, 105);
                this.method1113(var8 + 1, var7, 32, 102);
            }
            if (arg0 == 1) {
                this.method1113(var8, var7, 10, 119);
                this.method1113(var8 + 1, var7, 32, 97);
                this.method1113(var8, var7 + 1, 128, -78);
            }
            if (arg0 == 2) {
                this.method1113(var8, var7, 40, 69);
                this.method1113(var8, var7 + 1, 128, -87);
                this.method1113(var8 - 1, var7, 2, 70);
            }
            if (arg0 == 3) {
                this.method1113(var8, var7, 160, 103);
                this.method1113(var8 - 1, var7, 2, 86);
                this.method1113(var8, var7 - 1, 8, -46);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1113(var8, var7, 65536, 92);
                    this.method1113(var8, var7 - 1, 4096, 89);
                }
                if (arg0 == 1) {
                    this.method1113(var8, var7, 1024, -61);
                    this.method1113(var8 + 1, var7, 16384, -98);
                }
                if (arg0 == 2) {
                    this.method1113(var8, var7, 4096, 89);
                    this.method1113(var8, var7 + 1, 65536, -112);
                }
                if (arg0 == 3) {
                    this.method1113(var8, var7, 16384, -122);
                    this.method1113(var8 - 1, var7, 1024, -82);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1113(var8, var7, 512, 93);
                    this.method1113(var8 + 1, var7 - 1, 8192, 110);
                }
                if (arg0 == 1) {
                    this.method1113(var8, var7, 2048, -126);
                    this.method1113(var8 + 1, var7 + 1, 32768, 95);
                }
                if (arg0 == 2) {
                    this.method1113(var8, var7, 8192, -79);
                    this.method1113(var8 - 1, var7 + 1, 512, 81);
                }
                if (arg0 == 3) {
                    this.method1113(var8, var7, 32768, 100);
                    this.method1113(var8 - 1, var7 + -1, 2048, -46);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1113(var8, var7, 66560, -128);
                    this.method1113(var8, var7 - 1, 4096, -118);
                    this.method1113(var8 + 1, var7, 16384, 114);
                }
                if (arg0 == 1) {
                    this.method1113(var8, var7, 5120, -90);
                    this.method1113(var8 + 1, var7, 16384, 105);
                    this.method1113(var8, var7 + 1, 65536, -108);
                }
                if (arg0 == 2) {
                    this.method1113(var8, var7, 20480, 69);
                    this.method1113(var8, var7 + 1, 65536, -66);
                    this.method1113(var8 - 1, var7, 1024, -36);
                }
                if (arg0 == 3) {
                    this.method1113(var8, var7, 81920, -94);
                    this.method1113(var8 - 1, var7, 1024, 70);
                    this.method1113(var8, var7 - 1, 4096, 112);
                }
            }
        }
        int var9 = -19 % ((arg3 - 60) / 47);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2742++;
        if (arg1 == 1) {
            if (arg0 == arg5 && arg2 == arg4) {
                return true;
            }
        } else if (arg0 <= arg5 && arg0 + arg1 - 1 >= arg5 && arg4 <= arg4 && arg4 <= (arg4 + arg1 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field2744;
        if (arg7 != 0) {
            return true;
        }
        int var10 = arg2 - this.field2724;
        int var11 = arg4 - this.field2724;
        int var12 = arg0 - this.field2744;
        if (arg1 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field2738[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field2738[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field2738[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field2738[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field2738[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field2738[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field2738[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = var12 + arg1 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var9 + 1) == var12 && var11 >= var10 && var13 >= var11 && (this.field2738[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var14 >= var9 && (var11 - arg1) == var10 && (this.field2738[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg1 == var12 && var11 >= var10 && var11 <= var13 && (this.field2738[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var14 && (var11 - arg1) == var10 && (this.field2738[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - arg1 == var12 && var11 >= var10 && var11 <= var13 && (this.field2738[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var14 && var11 + 1 == var10 && (this.field2738[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 + 1 == var12 && var11 >= var10 && var13 >= var11 && (this.field2738[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var14 && (var11 + 1) == var10 && (this.field2738[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 <= var9 && var14 >= var9 && var11 + 1 == var10 && (this.field2738[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var14 >= var9 && var11 - arg1 == var10 && (this.field2738[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg1) == var12 && var10 <= var11 && var13 >= var11 && (this.field2738[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 <= var11 && var13 >= var11 && (this.field2738[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2721++;
        if (arg6 >= arg1 + arg2 || arg6 + arg8 <= arg2) {
            return false;
        } else if (arg4 < arg5 + arg3 && arg5 < arg4 + arg7) {
            if (arg0 != -1) {
                this.method1114(35, -18, 2, -8, false, -76);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIBII)Z")
    public final boolean method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2728++;
        if (arg5 > 1) {
            return this.method1110(-1, arg7, arg4, arg0, arg8, arg3, arg1, arg5, arg5) ? true : this.method1099(arg2, arg1, arg8, arg0, arg3, arg5, arg7, arg5, (byte) 74, arg4);
        }
        if (arg6 >= -85) {
            this.field2724 = 109;
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg3 + arg0 - 1;
        if (arg4 <= arg1 && arg1 <= var10 && arg8 >= arg3 && var11 >= arg8) {
            return true;
        } else if ((arg4 - 1) == arg1 && arg8 >= arg3 && var11 >= arg8 && (this.field2738[arg1 - this.field2744][arg8 - this.field2724] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg3 <= arg8 && arg8 <= var11 && (this.field2738[arg1 - this.field2744][arg8 - this.field2724] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if ((arg3 - 1) == arg8 && arg1 >= arg4 && arg1 <= var10 && (this.field2738[arg1 - this.field2744][arg8 - this.field2724] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg8 && arg4 <= arg1 && arg1 <= var10 && (this.field2738[arg1 - this.field2744][arg8 - this.field2724] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
    private final void method1112(int arg0, int arg1, int arg2, int arg3) {
        this.field2738[arg3][arg2] = class96.method626(this.field2738[arg3][arg2], ~arg1);
        field2722++;
        if (arg0 != 1) {
            this.method1114(-122, 107, 96, -108, false, -1);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIII)V")
    private final void method1113(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 59 / ((arg3 - 16) / 52);
        field2735++;
        this.field2738[arg1][arg0] = class94.method617(this.field2738[arg1][arg0], arg2);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V")
    public class165(int arg0, int arg1) {
        this.field2733 = arg0;
        this.field2724 = 0;
        this.field2732 = arg1;
        this.field2738 = new int[this.field2733][this.field2732];
        this.field2744 = 0;
        this.method1101(false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIZI)V")
    public final void method1114(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field2724;
        field2740++;
        int var8 = arg2 - this.field2744;
        if (~arg1 == arg5) {
            if (arg0 == 0) {
                this.method1112(1, 128, var7, var8);
                this.method1112(1, 8, var7, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1112(arg5 + 2, 2, var7, var8);
                this.method1112(1, 32, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1112(1, 8, var7, var8);
                this.method1112(1, 128, var7, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1112(arg5 + 2, 32, var7, var8);
                this.method1112(1, 2, var7 - 1, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method1112(arg5 ^ 0xFFFFFFFE, 1, var7, var8);
                this.method1112(1, 16, var7 + 1, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1112(arg5 + 2, 4, var7, var8);
                this.method1112(1, 64, var7 + 1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1112(1, 16, var7, var8);
                this.method1112(1, 1, var7 - 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1112(1, 64, var7, var8);
                this.method1112(arg5 ^ 0xFFFFFFFE, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method1112(1, 130, var7, var8);
                this.method1112(1, 8, var7, var8 - 1);
                this.method1112(1, 32, var7 + 1, var8);
            }
            if (arg0 == 1) {
                this.method1112(arg5 + 2, 10, var7, var8);
                this.method1112(arg5 ^ 0xFFFFFFFE, 32, var7 + 1, var8);
                this.method1112(1, 128, var7, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1112(arg5 + 2, 40, var7, var8);
                this.method1112(1, 128, var7, var8 + 1);
                this.method1112(arg5 ^ 0xFFFFFFFE, 2, var7 - 1, var8);
            }
            if (arg0 == 3) {
                this.method1112(1, 160, var7, var8);
                this.method1112(1, 2, var7 - 1, var8);
                this.method1112(1, 8, var7, var8 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method1112(1, 65536, var7, var8);
                this.method1112(1, 4096, var7, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1112(1, 1024, var7, var8);
                this.method1112(1, 16384, var7 + 1, var8);
            }
            if (arg0 == 2) {
                this.method1112(1, 4096, var7, var8);
                this.method1112(1, 65536, var7, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1112(1, 16384, var7, var8);
                this.method1112(1, 1024, var7 - 1, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method1112(1, 512, var7, var8);
                this.method1112(1, 8192, var7 + 1, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1112(1, 2048, var7, var8);
                this.method1112(1, 32768, var7 + 1, var8 - -1);
            }
            if (arg0 == 2) {
                this.method1112(1, 8192, var7, var8);
                this.method1112(arg5 + 2, 512, var7 - 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1112(1, 32768, var7, var8);
                this.method1112(1, 2048, var7 - 1, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1112(1, 66560, var7, var8);
            this.method1112(1, 4096, var7, var8 - 1);
            this.method1112(arg5 + 2, 16384, var7 + 1, var8);
        }
        if (arg0 == 1) {
            this.method1112(arg5 ^ 0xFFFFFFFE, 5120, var7, var8);
            this.method1112(1, 16384, var7 + 1, var8);
            this.method1112(1, 65536, var7, var8 + 1);
        }
        if (arg0 == 2) {
            this.method1112(1, 20480, var7, var8);
            this.method1112(arg5 ^ 0xFFFFFFFE, 65536, var7, var8 + 1);
            this.method1112(1, 1024, var7 - 1, var8);
        }
        if (arg0 == 3) {
            this.method1112(arg5 ^ 0xFFFFFFFE, 81920, var7, var8);
            this.method1112(arg5 + 2, 1024, var7 - 1, var8);
            this.method1112(1, 4096, var7, var8 - 1);
            return;
        }
    }
}
