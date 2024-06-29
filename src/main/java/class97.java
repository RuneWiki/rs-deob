import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class97 extends class17 {

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lke;")
    private static class65 field2517 = class1.method17("flash2:", -120);

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lke;")
    public static class65 field2513 = field2517;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lke;")
    public static class65 field2512 = class1.method17("mapedge", -127);

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Lke;")
    public static class65 field2505 = class1.method17("Verbindung konnte nicht hergestellt werden)3", -128);

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lke;")
    private static class65 field2509 = class1.method17("Please subscribe)1 or use a different world)3", -123);

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lke;")
    public static class65 field2508 = class1.method17("backtop1", -121);

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lke;")
    public static class65 field2506 = field2509;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lpa;")
    public static class90 field2519;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lqb;")
    public class97 field2510;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Lqb;")
    public class97 field2515;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjd;I)Z", line = 7)
    public static final boolean method811(int arg0, int arg1, class58 arg2, int arg3) {
        if (arg0 != 4) {
            return false;
        }
        field2514++;
        byte[] var4 = arg2.method477(arg3, (byte) 127, arg1);
        if (var4 == null) {
            return false;
        } else {
            class114.method937(var4, -20);
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILke;ILke;III)V", line = 24)
    public static final void method812(int arg0, class65 arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6) {
        field2504++;
        if (arg2 >= -117) {
            field2512 = null;
        }
        if (class125.field3040 >= 500) {
            return;
        }
        if (arg3.method528(78) > 0) {
            class29.field783[class125.field3040] = class21.method172(-88, new class65[] { arg1, class128.field3092, arg3 });
        } else {
            class29.field783[class125.field3040] = arg1;
        }
        class23.field557[class125.field3040] = arg4;
        class7.field135[class125.field3040] = arg5;
        class113.field2812[class125.field3040] = arg0;
        class75.field2017[class125.field3040] = arg6;
        class125.field3040++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBLta;IIBZ)V", line = 54)
    public static final void method813(int arg0, byte arg1, class112 arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field2518++;
        long var7 = (long) ((arg4 << 16) + arg0);
        class110 var9 = (class110) class88.field2344.method861(var7, 56);
        if (var9 != null) {
            return;
        }
        class110 var10 = (class110) class91.field2420.method861(var7, 86);
        if (var10 != null) {
            return;
        }
        class110 var11 = (class110) class65.field1725.method861(var7, 61);
        if (var11 == null) {
            if (!arg6) {
                class110 var12 = (class110) class116.field2917.method861(var7, 41);
                if (var12 != null) {
                    return;
                }
            }
            int var13 = -92 % ((arg1 + 5) / 61);
            class110 var14 = new class110();
            var14.field2715 = arg2;
            var14.field2718 = arg3;
            var14.field2714 = arg5;
            if (arg6) {
                class88.field2344.method854(var7, false, var14);
                class125.field3053++;
            } else {
                class123.field2990.method396((byte) -70, var14);
                class65.field1725.method854(var7, false, var14);
                class91.field2408++;
            }
        } else if (arg6) {
            var11.method817((byte) -103);
            class88.field2344.method854(var7, false, var11);
            class125.field3053++;
            class91.field2408--;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 123)
    public static void method814(byte arg0) {
        field2508 = null;
        field2506 = null;
        field2513 = null;
        if (arg0 <= 99) {
            field2519 = null;
        }
        field2519 = null;
        field2509 = null;
        field2505 = null;
        field2517 = null;
        field2512 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 140)
    public static final void method815(int arg0) {
        field2507++;
        if (class44.field1165 == 0) {
            return;
        }
        int var1 = 0;
        class16 var2 = class55.field1422;
        if (class126.field3057 != 0) {
            var1 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class78.field2084[var3] != null) {
                byte var4 = 0;
                class65 var5 = class48.field1256[var3];
                int var6 = class47.field1229[var3];
                if (var5 != null && var5.method533(class53.field1371, false)) {
                    var5 = var5.method539(arg0 - 93228, 5);
                    var4 = 1;
                }
                if (var5 != null && var5.method533(class19.field445, false)) {
                    var4 = 2;
                    var5 = var5.method539(-27693, 5);
                }
                if ((var6 == 3 || var6 == 7) && (var6 == 7 || class114.field2865 == 0 || class114.field2865 == 1 && class41.method365(114, var5))) {
                    int var7 = 329 - var1 * 13;
                    var1++;
                    byte var8 = 4;
                    var2.method109(class131.field3166, var8, var7, 0);
                    var2.method109(class131.field3166, var8, var7 - 1, 65535);
                    int var9 = var8 + var2.method116(class131.field3166);
                    int var10 = var9 + var2.method125(32);
                    if (var4 == 1) {
                        class52.field1336[0].method963(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var4 == 2) {
                        class52.field1336[1].method963(var10, var7 - 12);
                        var10 += 14;
                    }
                    var2.method109(class21.method172(-102, new class65[] { var5, class33.field850, class78.field2084[var3] }), var10, var7, 0);
                    var2.method109(class21.method172(-46, new class65[] { var5, class33.field850, class78.field2084[var3] }), var10, var7 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var6 == 5 && class114.field2865 < 2) {
                    int var11 = 329 - var1 * 13;
                    var2.method109(class78.field2084[var3], 4, var11, 0);
                    var2.method109(class78.field2084[var3], 4, var11 - 1, 65535);
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var6 == 6 && class114.field2865 < 2) {
                    int var12 = 329 - var1 * 13;
                    var1++;
                    var2.method109(class21.method172(-112, new class65[] { class53.field1344, class111.field2756, var5, class33.field850, class78.field2084[var3] }), 4, var12, 0);
                    var2.method109(class21.method172(-62, new class65[] { class53.field1344, class111.field2756, var5, class33.field850, class78.field2084[var3] }), 4, var12 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 != 65535) {
            field2512 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 271)
    public static final void method816(int arg0, int arg1, int arg2) {
        field2516++;
        class53 var3 = class64.field1691[class19.field462][arg1][arg0];
        if (var3 == null) {
            class89.field2377.method605(class19.field462, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        if (arg2 != -12) {
            field2505 = null;
        }
        class93 var5 = null;
        for (class93 var6 = (class93) var3.method421(arg2 + 13); var6 != null; var6 = (class93) var3.method428(arg2 + 22755)) {
            class57 var11 = class81.method715(false, var6.field2451);
            int var12 = var11.field1536;
            if (var11.field1473) {
                var12 = (var6.field2443 + 1) * var12;
            }
            if (var4 < var12) {
                var5 = var6;
                var4 = var12;
            }
        }
        var3.method427(var5, -121);
        class93 var7 = null;
        class93 var8 = (class93) var3.method421(1);
        class93 var9 = null;
        int var10 = (arg0 << 7) + arg1 + 1610612736;
        while (var8 != null) {
            if (var5.field2451 != var8.field2451 && var7 == null) {
                var7 = var8;
            }
            if (var5.field2451 != var8.field2451 && var7.field2451 != var8.field2451 && var9 == null) {
                var9 = var8;
            }
            var8 = (class93) var3.method428(22743);
        }
        class89.field2377.method606(class19.field462, arg1, arg0, class58.method495(arg0 * 128 + 64, arg1 * 128 + 64, true, class19.field462), var5, var10, var7, var9);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V", line = 357)
    public final void method817(byte arg0) {
        int var2 = -109 / ((-arg0 - 25) / 54);
        field2523++;
        if (this.field2515 != null) {
            this.field2515.field2510 = this.field2510;
            this.field2510.field2515 = this.field2515;
            this.field2510 = null;
            this.field2515 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 374)
    public static final void method818(int arg0) {
        if (arg0 != -3786) {
            field2513 = null;
        }
        class24.field596 = true;
        class28.method236((byte) -3);
        field2521++;
        if (class10.field218) {
            class27.field660.method119(class100.field2603, 239, 40, 0);
            class27.field660.method119(class21.method172(-63, new class65[] { class100.field2615, class110.field2719 }), 239, 60, 128);
        } else if (class116.field2916 == 1) {
            class27.field660.method119(class128.field3095, 239, 40, 0);
            class27.field660.method119(class21.method172(-110, new class65[] { class100.field2593, class110.field2719 }), 239, 60, 128);
        } else if (class116.field2916 == 2) {
            class27.field660.method119(class75.field2021, 239, 40, 0);
            class27.field660.method119(class21.method172(arg0 + 3702, new class65[] { class100.field2593, class110.field2719 }), 239, 60, 128);
        } else if (class116.field2916 == 3) {
            if (class100.field2609 != class100.field2593) {
                class23.method180(arg0 ^ 0xFFFFF136, class100.field2593);
                class100.field2609 = class100.field2593;
            }
            class16 var1 = class55.field1422;
            class108.method887(0, 0, 463, 77);
            for (int var2 = 0; var2 < class87.field2336; var2++) {
                int var3 = var2 * 14 + 18 - class78.field2074;
                if (var3 > 0 && var3 < 110) {
                    var1.method119(class5.field101[var2], 239, var3, 0);
                }
            }
            class108.method882();
            if (class87.field2336 > 5) {
                class53.method423(class78.field2074, arg0 + 23328, class87.field2336 * 14 + 7, 0, 463, 77);
            }
            if (class100.field2593.method528(113) == 0) {
                class27.field660.method119(class70.field1788, 239, 40, 255);
            } else if (class87.field2336 == 0) {
                class27.field660.method119(class22.field537, 239, 40, 0);
            }
            var1.method119(class21.method172(arg0 + 3743, new class65[] { class100.field2593, class110.field2719 }), 239, 90, 0);
            class108.method892(0, 77, 479, 0);
        } else if (class73.field1933 != null) {
            class27.field660.method119(class73.field1933, 239, 40, 0);
            class27.field660.method119(class102.field2657, 239, 60, 128);
        } else if (class117.field2939 != -1) {
            boolean var19 = class6.method44(479, 0, 0, class117.field2939, -1, 0, 0, 2, 96);
            if (!var19) {
                class39.field996 = true;
            }
        } else if (class51.field1312 == -1) {
            class16 var5 = class55.field1422;
            class108.method887(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class78.field2084[var7] != null) {
                    int var9 = class47.field1229[var7];
                    int var10 = class93.field2469 + 70 - var6 * 14;
                    class65 var11 = class48.field1256[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.method533(class53.field1371, false)) {
                        var12 = 1;
                        var11 = var11.method539(arg0 - 23907, 5);
                    }
                    if (var11 != null && var11.method533(class19.field445, false)) {
                        var12 = 2;
                        var11 = var11.method539(arg0 ^ 0x62E5, 5);
                    }
                    if (var9 == 0) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            var5.method109(class78.field2084[var7], 4, var10, 0);
                        }
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class6.field108 == 0 || class6.field108 == 1 && class41.method365(-97, var11))) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class52.field1336[0].method963(var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class52.field1336[1].method963(var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method109(class21.method172(arg0 + 3703, new class65[] { var11, class12.field249 }), var13, var10, 0);
                            int var14 = var13 + var5.method116(var11) + 8;
                            var5.method109(class78.field2084[var7], var14, var10, 255);
                        }
                    }
                    if ((var9 == 3 || var9 == 7) && class44.field1165 == 0 && (var9 == 7 || class114.field2865 == 0 || class114.field2865 == 1 && class41.method365(116, var11))) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method109(class131.field3166, var15, var10, 0);
                            int var16 = var15 + var5.method116(class131.field3166);
                            int var17 = var16 + var5.method125(32);
                            if (var12 == 1) {
                                class52.field1336[0].method963(var17, var10 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class52.field1336[1].method963(var17, var10 - 12);
                                var17 += 14;
                            }
                            var5.method109(class21.method172(-78, new class65[] { var11, class12.field249 }), var17, var10, 0);
                            int var18 = var17 + var5.method116(var11) + 8;
                            var5.method109(class78.field2084[var7], var18, var10, 8388608);
                        }
                    }
                    if (var9 == 4 && (class93.field2442 == 0 || class93.field2442 == 1 && class41.method365(123, var11))) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            var5.method109(class21.method172(arg0 ^ 0xEE3, new class65[] { var11, class111.field2756, class78.field2084[var7] }), 4, var10, 8388736);
                        }
                    }
                    if (var9 == 5 && class44.field1165 == 0 && class114.field2865 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method109(class78.field2084[var7], 4, var10, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 6 && class44.field1165 == 0 && class114.field2865 < 2) {
                        var6++;
                        if (var10 > 0 && var10 < 110) {
                            var5.method109(class21.method172(-121, new class65[] { class53.field1344, class111.field2756, var11, class12.field249 }), 4, var10, 0);
                            var5.method109(class78.field2084[var7], var5.method116(class21.method172(arg0 + 3730, new class65[] { class53.field1344, class111.field2756, var11 })) + 12, var10, 8388608);
                        }
                    }
                    if (var9 == 8 && (class93.field2442 == 0 || class93.field2442 == 1 && class41.method365(-77, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method109(class21.method172(-79, new class65[] { var11, class111.field2756, class78.field2084[var7] }), 4, var10, 8270336);
                        }
                        var6++;
                    }
                }
            }
            class108.method882();
            class44.field1151 = var6 * 14 + 7;
            if (class44.field1151 < 78) {
                class44.field1151 = 78;
            }
            class53.method423(class44.field1151 - class93.field2469 - 77, 19542, class44.field1151, 0, 463, 77);
            class65 var8;
            if (class32.field833 == null || class32.field833.field2866 == null) {
                var8 = class24.field591;
            } else {
                var8 = class32.field833.field2866;
            }
            var5.method109(class21.method172(-113, new class65[] { var8, class12.field249 }), 4, 90, 0);
            var5.method109(class21.method172(-57, new class65[] { class100.field2606, class110.field2719 }), var5.method116(class21.method172(-119, new class65[] { var8, class33.field850 })) + 6, 90, 255);
            class108.method892(0, 77, 479, 0);
        } else {
            boolean var4 = class6.method44(479, 0, 0, class51.field1312, -1, 0, 0, 3, 96);
            if (!var4) {
                class39.field996 = true;
            }
        }
        if (class24.field614 && class10.field215 == 2) {
            class28.method234(18);
        }
        class29.method242((byte) 64);
    }
}
