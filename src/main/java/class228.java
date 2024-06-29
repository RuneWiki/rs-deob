import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class228 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Le;")
    public static class191 field4105 = class54.method368("Lade Benutzeroberfl-=che )2 ", 2047);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Le;")
    public static class191 field4107 = class54.method368("; Max)2Age=", 2047);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Le;")
    public static class191 field4108 = class54.method368("Sprites geladen)3", 2047);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lwd;")
    public static class97 field4110 = new class97(16);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Le;")
    public static class191 field4112 = class54.method368("blinken2:", 2047);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
    public static int[] field4103;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method1626(int arg0) {
        field4111++;
        if (class172.field2889 > 1) {
            class250.field4450 = class110.field1841;
            class172.field2889--;
        }
        if (class197.field3517 > 0) {
            class197.field3517--;
        }
        if (class105.field1749) {
            class105.field1749 = false;
            class219.method1488(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class161.method1090(-4072); var1++) {
        }
        if (class47.field836 != 30) {
            return;
        }
        class29.method208(83, 110, class53.field963);
        Object var2 = class248.field4420.field2769;
        synchronized (class248.field4420.field2769) {
            if (!class236.field4201) {
                class248.field4420.field2772 = 0;
            } else if (class33.field520 != 0 || class248.field4420.field2772 >= 40) {
                int var3 = 0;
                class260.field4592++;
                class53.field963.method1096(39, 0);
                class53.field963.method1613(0, 21);
                int var4 = class53.field963.field3996;
                for (int var5 = 0; class248.field4420.field2772 > var5 && (class53.field963.field3996 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class248.field4420.field2776[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class248.field4420.field2773[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class248.field4420.field2776[var5] == -1 && class248.field4420.field2773[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class154.field2637 != var7 || class215.field3790 != var6) {
                        int var9 = var7 - class154.field2637;
                        class154.field2637 = var7;
                        int var10 = var6 - class215.field3790;
                        class215.field3790 = var6;
                        if (class68.field1179 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class53.field963.method1608((var9 << 6) + (class68.field1179 << 12) + var10, false);
                            class68.field1179 = 0;
                        } else if (class68.field1179 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class53.field963.method1613(class68.field1179 + 128, 21);
                            class53.field963.method1608((var9 << 8) + var10, false);
                            class68.field1179 = 0;
                        } else if (class68.field1179 < 32) {
                            class53.field963.method1613(class68.field1179 + 192, 21);
                            if (var8) {
                                class53.field963.method1576(30289, Integer.MIN_VALUE);
                            } else {
                                class53.field963.method1576(30289, var7 | var6 << 16);
                            }
                            class68.field1179 = 0;
                        } else {
                            class53.field963.method1608(class68.field1179 + 57344, false);
                            if (var8) {
                                class53.field963.method1576(30289, Integer.MIN_VALUE);
                            } else {
                                class53.field963.method1576(30289, var6 << 16 | var7);
                            }
                            class68.field1179 = 0;
                        }
                    } else if (class68.field1179 < 2047) {
                        class68.field1179++;
                    }
                }
                class53.field963.method1567(28916, class53.field963.field3996 - var4);
                if (var3 >= class248.field4420.field2772) {
                    class248.field4420.field2772 = 0;
                } else {
                    class248.field4420.field2772 -= var3;
                    for (int var11 = 0; var11 < class248.field4420.field2772; var11++) {
                        class248.field4420.field2773[var11] = class248.field4420.field2773[var3 + var11];
                        class248.field4420.field2776[var11] = class248.field4420.field2776[var3 + var11];
                    }
                }
            }
        }
        if (class33.field520 != 0) {
            long var12 = (class87.field1430 - class83.field1395) / 50L;
            class83.field1395 = class87.field1430;
            class242.field4305++;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class50.field897;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class33.field520 == 2) {
                var15 = 1;
            }
            int var16 = (int) var12;
            int var17 = class104.field1709;
            class53.field963.method1096(223, 0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class53.field963.method1602(var15 << 15 | var16, false);
            class53.field963.method1616(0, var17 | var14 << 16);
        }
        if (class88.field1438[96] || class88.field1438[97] || class88.field1438[98] || class88.field1438[99]) {
            class111.field1868 = true;
        }
        if (class270.field4756 > 0) {
            class270.field4756--;
        }
        if (class111.field1868 && class270.field4756 <= 0) {
            class119.field1957++;
            class111.field1868 = false;
            class270.field4756 = 20;
            class53.field963.method1096(163, 0);
            class53.field963.method1558(-120, class269.field4751);
            class53.field963.method1600(90, class65.field1138);
        }
        if (class81.field1367 && !class105.field1757) {
            class105.field1757 = true;
            class53.field963.method1096(141, 0);
            class53.field963.method1613(1, 21);
            class43.field752++;
        }
        if (!class81.field1367 && class105.field1757) {
            class105.field1757 = false;
            class53.field963.method1096(141, 0);
            class43.field752++;
            class53.field963.method1613(0, 21);
        }
        if (!class30.field427) {
            class100.field1596++;
            class53.field963.method1096(103, 0);
            class53.field963.method1557(class142.method935((byte) -106), 79);
            class30.field427 = true;
        }
        class25.method181(-125);
        if (class47.field836 != 30) {
            return;
        }
        class23.method169(0);
        class90.method550((byte) -128);
        class211.field3753++;
        if (class211.field3753 > 750) {
            class219.method1488(0);
            return;
        }
        class209.method1436(3);
        class59.method395((byte) -74);
        class75.method483(false);
        if (class3.field23 != null) {
            class262.method1799((byte) -74);
        }
        for (int var18 = class134.method902(true, true); var18 != -1; var18 = class134.method902(false, true)) {
            class179.method1204(false, var18);
            class150.field2581[class167.method1128(31, class35.field640++)] = var18;
        }
        for (class241 var19 = class49.method332(124); var19 != null; var19 = class49.method332(73)) {
            int var20 = var19.method1692((byte) -3);
            int var21 = var19.method1695((byte) -94);
            if (var20 == 1) {
                class161.field2729[var21] = var19.field4301;
                class145.field2446[class167.method1128(31, class249.field4424++)] = var21;
            } else if (var20 == 2) {
                class258.field4584[var21] = var19.field4298;
                class207.field3692[class167.method1128(31, class107.field1784++)] = var21;
            } else if (var20 == 3) {
                class33 var22 = class233.method1646(5877, var21);
                if (!var19.field4298.method1317(-27518, var22.field609)) {
                    var22.field609 = var19.field4298;
                    class184.method1238(var22, (byte) -116);
                }
            } else if (var20 == 4) {
                class33 var39 = class233.method1646(5877, var21);
                int var40 = var19.field4279;
                int var41 = var19.field4301;
                if (var39.field505 != var41 || var39.field518 != var40) {
                    var39.field505 = var41;
                    var39.field518 = var40;
                    class184.method1238(var39, (byte) -93);
                }
            } else if (var20 == 5) {
                class33 var38 = class233.method1646(5877, var21);
                if (var19.field4301 != var38.field514 || var19.field4301 == -1) {
                    var38.field514 = var19.field4301;
                    var38.field479 = 0;
                    var38.field557 = 0;
                    class184.method1238(var38, (byte) -87);
                }
            } else if (var20 == 6) {
                int var32 = var19.field4301;
                int var33 = (var32 & 0x3FD) >> 5;
                int var34 = var32 & 0x1F;
                int var35 = (var32 & 0x7C8E) >> 10;
                int var36 = (var34 << 3) + (var33 << 11) + (var35 << 19);
                class33 var37 = class233.method1646(5877, var21);
                if (var37.field562 != var36) {
                    var37.field562 = var36;
                    class184.method1238(var37, (byte) -67);
                }
            } else if (var20 == 7) {
                class33 var23 = class233.method1646(5877, var21);
                boolean var24 = var19.field4301 == 1;
                if (var23.field607 != var24) {
                    var23.field607 = var24;
                    class184.method1238(var23, (byte) -124);
                }
            } else if (var20 == 8) {
                class33 var25 = class233.method1646(5877, var21);
                if (var19.field4301 != var25.field603 || var19.field4279 != var25.field510 || var19.field4290 != var25.field508) {
                    var25.field510 = var19.field4279;
                    var25.field508 = var19.field4290;
                    var25.field603 = var19.field4301;
                    if (var25.field546 != -1) {
                        if (var25.field527 > 0) {
                            var25.field508 = var25.field508 * 32 / var25.field527;
                        } else if (var25.field488 > 0) {
                            var25.field508 = var25.field508 * 32 / var25.field488;
                        }
                    }
                    class184.method1238(var25, (byte) -36);
                }
            } else if (var20 == 9) {
                class33 var31 = class233.method1646(5877, var21);
                if (var19.field4301 != var31.field546 || var19.field4279 != var31.field466) {
                    var31.field466 = var19.field4279;
                    var31.field546 = var19.field4301;
                    class184.method1238(var31, (byte) -29);
                }
            } else if (var20 == 10) {
                class33 var30 = class233.method1646(5877, var21);
                if (var19.field4301 != var30.field619 || var19.field4279 != var30.field495 || var19.field4290 != var30.field470) {
                    var30.field495 = var19.field4279;
                    var30.field619 = var19.field4301;
                    var30.field470 = var19.field4290;
                    class184.method1238(var30, (byte) -104);
                }
            } else if (var20 == 11) {
                class33 var29 = class233.method1646(5877, var21);
                var29.field624 = var29.field558 = var19.field4279;
                var29.field526 = var29.field529 = var19.field4301;
                var29.field480 = 0;
                var29.field497 = 0;
                class184.method1238(var29, (byte) -91);
            } else if (var20 == 12) {
                class33 var27 = class233.method1646(5877, var21);
                int var28 = var19.field4301;
                if (var27 != null && var27.field493 == 0) {
                    if ((var27.field482 - var27.field561) < var28) {
                        var28 = var27.field482 - var27.field561;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field534 != var28) {
                        var27.field534 = var28;
                        class184.method1238(var27, (byte) -81);
                    }
                }
            } else if (var20 == 13) {
                class33 var26 = class233.method1646(5877, var21);
                var26.field517 = var19.field4301;
            }
        }
        if (class242.field4327 != 0) {
            class162.field2749 += 20;
            if (class162.field2749 >= 400) {
                class242.field4327 = 0;
            }
        }
        class182.field3138++;
        if (class193.field3475 != null) {
            class138.field2318++;
            if (class138.field2318 >= 15) {
                class184.method1238(class193.field3475, (byte) -74);
                class193.field3475 = null;
            }
        }
        if (class57.field1059 != null) {
            class184.method1238(class57.field1059, (byte) -87);
            class205.field3642++;
            if ((class256.field4536 + 5) < class189.field3325 || class189.field3325 < (class256.field4536 - 5) || (class182.field3128 + 5) < class133.field2229 || class182.field3128 - 5 > class133.field2229) {
                class261.field4623 = true;
            }
            if (class51.field929 == 0) {
                if (class261.field4623 && class205.field3642 >= 5) {
                    if (class67.field1163 == class57.field1059 && class119.field1963 != class102.field1684) {
                        class5.field43++;
                        class33 var42 = class57.field1059;
                        byte var43 = 0;
                        if (class11.field121 == 1 && var42.field483 == 206) {
                            var43 = 1;
                        }
                        if (var42.field515[class102.field1684] <= 0) {
                            var43 = 0;
                        }
                        if (class254.method1759(178246909, client.method668(var42))) {
                            int var44 = class119.field1963;
                            int var45 = class102.field1684;
                            var42.field515[var45] = var42.field515[var44];
                            var42.field631[var45] = var42.field631[var44];
                            var42.field515[var44] = -1;
                            var42.field631[var44] = 0;
                        } else if (var43 == 1) {
                            int var46 = class102.field1684;
                            int var47 = class119.field1963;
                            while (var46 != var47) {
                                if (var47 > var46) {
                                    var42.method226(var47, (byte) 43, var47 - 1);
                                    var47--;
                                } else if (var47 < var46) {
                                    var42.method226(var47, (byte) 43, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var42.method226(class119.field1963, (byte) 43, class102.field1684);
                        }
                        class53.field963.method1096(28, 0);
                        class53.field963.method1600(94, class119.field1963);
                        class53.field963.method1579(-108, var43);
                        class53.field963.method1602(class102.field1684, false);
                        class53.field963.method1616(0, class57.field1059.field491);
                    }
                } else if ((class190.field3342 == 1 || class164.method1107(false, class167.field2824 - 1)) && class167.field2824 > 2) {
                    class225.method1609(613072615);
                } else if (class167.field2824 > 0) {
                    class172.method1157((byte) 121);
                }
                class138.field2318 = 10;
                class57.field1059 = null;
                class33.field520 = 0;
            }
        }
        class32.field445 = 0;
        class56.field1034 = false;
        class163.field2758 = false;
        class168.field2838 = null;
        class33 var48 = class182.field3139;
        class33 var49 = class30.field422;
        class30.field422 = null;
        class182.field3139 = null;
        while (class172.method1159((byte) -52) && class32.field445 < 128) {
            class127.field2095[class32.field445] = class180.field3091;
            class21.field303[class32.field445] = class201.field3600;
            class32.field445++;
        }
        class3.field23 = null;
        if (class130.field2166 != -1) {
            class211.method1449(0, class130.field2166, class200.field3584, 0, 0, class190.field3337, 126, 0);
        }
        class110.field1841++;
        while (true) {
            class61 var50;
            class33 var51;
            class33 var52;
            do {
                var50 = (class61) class209.field3723.method1171(-256);
                if (var50 == null) {
                    while (true) {
                        class61 var53;
                        class33 var54;
                        class33 var55;
                        do {
                            var53 = (class61) class55.field1020.method1171(-256);
                            if (var53 == null) {
                                if (arg0 < 125) {
                                    method1630(-63, -95, 93, -66, false, 57, 98, (class220) null, true, -31, -65);
                                }
                                while (true) {
                                    class61 var56;
                                    class33 var57;
                                    class33 var58;
                                    do {
                                        var56 = (class61) class31.field431.method1171(-256);
                                        if (var56 == null) {
                                            if (class143.field2371 && class3.field23 == null) {
                                                class143.field2371 = false;
                                            }
                                            if (class158.field2686 != null) {
                                                class73.method474(-16729);
                                            }
                                            if (class227.field4084 > 0 && class88.field1438[82] && class88.field1438[81] && class31.field434 != 0) {
                                                int var59 = class261.field4598 - class31.field434;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class104.method651(class175.field2946.field2953[0] + class225.field4061, -103, class175.field2946.field3014[0] + class193.field3474, var59);
                                            }
                                            if (class75.field1280 != -1) {
                                                int var60 = class75.field1280;
                                                int var61 = class122.field2011;
                                                if (class227.field4084 > 0 && class88.field1438[82] && class88.field1438[81]) {
                                                    class104.method651(class225.field4061 + var60, -98, class193.field3474 + var61, class261.field4598);
                                                } else if (class49.field867) {
                                                    class156.field2658++;
                                                    class53.field963.method1096(168, 0);
                                                    class53.field963.method1608(class193.field3474 + var61, false);
                                                    class53.field963.method1557(class3.field21, 119);
                                                    class53.field963.method1608(class225.field4061 + var60, false);
                                                    class53.field963.method1602(class36.field659, false);
                                                    class126.field2091 = class104.field1709;
                                                    class162.field2749 = 0;
                                                    class199.field3546 = class50.field897;
                                                    class242.field4327 = 1;
                                                } else {
                                                    boolean var62 = class97.method604(0, var61, class175.field2946.field2953[0], var60, 0, 0, 0, 0, class175.field2946.field3014[0], 0, true, 120);
                                                    if (var62) {
                                                        class162.field2749 = 0;
                                                        class242.field4327 = 1;
                                                        class199.field3546 = class50.field897;
                                                        class126.field2091 = class104.field1709;
                                                    }
                                                }
                                                class49.field867 = false;
                                                class75.field1280 = -1;
                                            }
                                            class215.method1467((byte) -125);
                                            if (class30.field422 != var49) {
                                                if (var49 != null) {
                                                    class184.method1238(var49, (byte) -70);
                                                }
                                                if (class30.field422 != null) {
                                                    class184.method1238(class30.field422, (byte) -34);
                                                }
                                            }
                                            if (class182.field3139 != var48 && class33.field503 == class226.field4077) {
                                                if (var48 != null) {
                                                    class184.method1238(var48, (byte) -95);
                                                }
                                                if (class182.field3139 != null) {
                                                    class184.method1238(class182.field3139, (byte) -78);
                                                }
                                            }
                                            if (class182.field3139 == null) {
                                                if (class226.field4077 > 0) {
                                                    class226.field4077--;
                                                }
                                            } else if (class33.field503 > class226.field4077) {
                                                class226.field4077++;
                                                if (class33.field503 == class226.field4077) {
                                                    class184.method1238(class182.field3139, (byte) -43);
                                                }
                                            }
                                            if (class243.field4345 == 1) {
                                                class173.method1167((byte) 114);
                                            } else if (class243.field4345 == 2) {
                                                class9.method68((byte) -104);
                                            } else {
                                                class146.method984(-1);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = client.field1736[var63]++;
                                            }
                                            int var64 = class91.method555((byte) -91);
                                            int var65 = class35.method246(-125);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class197.field3517 = 250;
                                                class85.method526(4000, (byte) -111);
                                                class53.field963.method1096(212, 0);
                                                class127.field2104++;
                                            }
                                            if (class126.field2084 != null && class126.field2084.field1356 == 1) {
                                                if (class126.field2084.field1360 != null) {
                                                    class219.method1487(-27286, class235.field4187, class233.field4167);
                                                }
                                                class126.field2084 = null;
                                                class233.field4167 = null;
                                                class235.field4187 = false;
                                            }
                                            class19.field259++;
                                            if (class19.field259 > 500) {
                                                class19.field259 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x4) == 4) {
                                                    class249.field4421 += class188.field3305;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class107.field1771 += class153.field2631;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class118.field1953 += class143.field2384;
                                                }
                                            }
                                            if (class118.field1953 < -50) {
                                                class143.field2384 = 2;
                                            }
                                            class55.field1018++;
                                            if (class55.field1018 > 500) {
                                                class55.field1018 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class137.field2302 += class122.field2014;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class114.field1886 += class100.field1599;
                                                }
                                            }
                                            if (class249.field4421 < -40) {
                                                class188.field3305 = 1;
                                            }
                                            if (class107.field1771 < -55) {
                                                class153.field2631 = 2;
                                            }
                                            if (class249.field4421 > 40) {
                                                class188.field3305 = -1;
                                            }
                                            if (class107.field1771 > 55) {
                                                class153.field2631 = -2;
                                            }
                                            if (class118.field1953 > 50) {
                                                class143.field2384 = -2;
                                            }
                                            if (class137.field2302 < -60) {
                                                class122.field2014 = 2;
                                            }
                                            if (class137.field2302 > 60) {
                                                class122.field2014 = -2;
                                            }
                                            if (class114.field1886 < -20) {
                                                class100.field1599 = 1;
                                            }
                                            if (class114.field1886 > 10) {
                                                class100.field1599 = -1;
                                            }
                                            class70.field1225++;
                                            if (class70.field1225 > 50) {
                                                class143.field2378++;
                                                class53.field963.method1096(131, 0);
                                            }
                                            if (class163.field2764) {
                                                class36.method251(36);
                                                class163.field2764 = false;
                                            }
                                            try {
                                                if (class263.field4670 != null && class53.field963.field3996 > 0) {
                                                    class263.field4670.method173((byte) 124, class53.field963.field3996, class53.field963.field3995, 0);
                                                    class53.field963.field3996 = 0;
                                                    class70.field1225 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class219.method1488(0);
                                                return;
                                            }
                                        }
                                        var57 = var56.field1089;
                                        if (var57.field589 < 0) {
                                            break;
                                        }
                                        var58 = class233.method1646(5877, var57.field478);
                                    } while (var58 == null || var58.field548 == null || var57.field589 >= var58.field548.length || var58.field548[var57.field589] != var57);
                                    class12.method87(var56, -12934);
                                }
                            }
                            var54 = var53.field1089;
                            if (var54.field589 < 0) {
                                break;
                            }
                            var55 = class233.method1646(5877, var54.field478);
                        } while (var55 == null || var55.field548 == null || var54.field589 >= var55.field548.length || var55.field548[var54.field589] != var54);
                        class12.method87(var53, -12934);
                    }
                }
                var51 = var50.field1089;
                if (var51.field589 < 0) {
                    break;
                }
                var52 = class233.method1646(5877, var51.field478);
            } while (var52 == null || var52.field548 == null || var52.field548.length <= var51.field589 || var52.field548[var51.field589] != var51);
            class12.method87(var50, -12934);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
    public static final void method1627(boolean arg0, int arg1) {
        method1632((byte) 97);
        field4101++;
        if (class47.field836 != 30 && class47.field836 != 25) {
            return;
        }
        class70.field1225++;
        if (class70.field1225 < 50 && !arg0) {
            return;
        }
        class70.field1225 = 0;
        if (!class105.field1749 && class263.field4670 != null) {
            class143.field2378++;
            class53.field963.method1096(131, 0);
            try {
                class263.field4670.method173((byte) -102, class53.field963.field3996, class53.field963.field3995, 0);
                class53.field963.field3996 = 0;
            } catch (IOException var2) {
                class105.field1749 = true;
            }
        }
        method1632((byte) 94);
        if (arg1 != 1) {
            field4108 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method1628(byte arg0) {
        class245.field4360 = null;
        field4102++;
        class19.field261 = null;
        class47.field842 = null;
        class253.field4489 = null;
        class161.field2731 = null;
        class68.field1183 = null;
        if (arg0 != 0) {
            method1629((class191[]) null, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Le;B)Le;")
    public static final class191 method1629(class191[] arg0, byte arg1) {
        field4109++;
        if (arg1 > -2) {
            field4105 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class134.method900(0, arg0, 0, arg0.length);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZIILai;ZII)V")
    public static final void method1630(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class220 arg7, boolean arg8, int arg9, int arg10) {
        field4100++;
        if (arg8 && !class188.method1298(10) && (class270.field4755[0][arg5][arg1] & 0x2) == 0) {
            if ((class270.field4755[arg2][arg5][arg1] & 0x10) != 0) {
                return;
            }
            if (class163.method1105(true, arg1, arg5, arg2) != class252.field4461) {
                return;
            }
        }
        if (class65.field1141 > arg2) {
            class65.field1141 = arg2;
        }
        class102 var11 = class31.method216(arg9, (byte) 124);
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var11.field1652;
            var13 = var11.field1686;
        } else {
            var12 = var11.field1686;
            var13 = var11.field1652;
        }
        int var14;
        int var15;
        if ((arg5 + var13) > 104) {
            var14 = arg5 + 1;
            var15 = arg5;
        } else {
            var15 = arg5 + (var13 >> 1);
            var14 = (var13 + 1 >> 1) + arg5;
        }
        int[][] var16 = class12.field143[arg0];
        int var17;
        int var18;
        if (arg1 + var12 <= 104) {
            var17 = (var12 + 1 >> 1) + arg1;
            var18 = (var12 >> 1) + arg1;
        } else {
            var18 = arg1;
            var17 = arg1 + 1;
        }
        int var19 = var16[var15][var18] + var16[var15][var17] + var16[var14][var18] + var16[var14][var17] >> 2;
        int var20 = (arg1 << 7) + (var12 << 6);
        int var21 = (arg5 << 7) + (var13 << 6);
        if (arg3 <= 24) {
            method1628((byte) 116);
        }
        int[][] var22 = null;
        if (arg4) {
            var22 = class65.field1136[0];
        } else if (arg0 < 3) {
            var22 = class12.field143[arg0 + 1];
        }
        long var23 = (long) (arg1 << 7 | arg5 | arg10 << 14 | arg6 << 20 | 0x40000000);
        if (var11.field1654 == 0 || arg4) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field1689 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field1634) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg9 << 32;
        if (var11.method634((byte) 52)) {
            class87.method531(var11, arg1, arg6, (class76) null, arg5, (class156) null, (byte) -60, arg2);
        }
        boolean var27 = var11.field1637 & !arg4;
        if (arg10 == 22) {
            if (class225.field4029 || var11.field1654 != 0 || var11.field1679 == 1 || var11.field1682) {
                class16 var29;
                if (var11.field1636 == -1 && var11.field1649 == null) {
                    class270 var28 = var11.method635(var19, var20, var21, var16, var22, (byte) -68, (class60) null, var27, 22, arg8, arg6);
                    var29 = var28.field4760;
                } else {
                    var29 = new class261(arg9, 22, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
                }
                class196.method1385(arg2, arg5, arg1, var19, var29, var25, var11.field1693);
                if (var11.field1679 == 1 && arg7 != null) {
                    arg7.method1493(arg5, 262144, arg1);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class16 var69;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var68 = var11.method635(var19, var20, var21, var16, var22, (byte) -60, (class60) null, var27, 10, arg8, arg10 == 11 ? arg6 + 4 : arg6);
                var69 = var68.field4760;
            } else {
                var69 = new class261(arg9, 10, arg10 == 11 ? arg6 + 4 : arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            if (var69 != null) {
                boolean var70 = class36.method249(arg2, arg5, arg1, var19, var13, var12, var69, 0, var25);
                if (var11.field1639 && var70 && arg8) {
                    int var71 = 15;
                    if (var69 instanceof class251) {
                        var71 = ((class251) var69).method955() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class59.field1075[arg2][arg5 + var72][arg1 + var73]) {
                                class59.field1075[arg2][arg5 + var72][arg1 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1489(arg1, var12, var11.field1641, -6116, arg5, var13);
            }
        } else if (arg10 >= 12) {
            class16 var31;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var30 = var11.method635(var19, var20, var21, var16, var22, (byte) -82, (class60) null, var27, arg10, arg8, arg6);
                var31 = var30.field4760;
            } else {
                var31 = new class261(arg9, arg10, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class36.method249(arg2, arg5, arg1, var19, 1, 1, var31, 0, var25);
            if (arg8 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg2 > 0) {
                class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 4);
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1489(arg1, var12, var11.field1641, -6116, arg5, var13);
            }
        } else if (arg10 == 0) {
            class16 var33;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var32 = var11.method635(var19, var20, var21, var16, var22, (byte) -106, (class60) null, var27, 0, arg8, arg6);
                var33 = var32.field4760;
            } else {
                var33 = new class261(arg9, 0, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class68.method448(arg2, arg5, arg1, var19, var33, (class16) null, class68.field1180[arg6], 0, var25);
            if (arg8) {
                if (arg6 == 0) {
                    if (var11.field1639) {
                        class59.field1075[arg2][arg5][arg1] = 50;
                        class59.field1075[arg2][arg5][arg1 + 1] = 50;
                    }
                    if (var11.field1638) {
                        class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 1);
                    }
                } else if (arg6 == 1) {
                    if (var11.field1639) {
                        class59.field1075[arg2][arg5][arg1 + 1] = 50;
                        class59.field1075[arg2][arg5 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field1638) {
                        class129.field2140[arg2][arg5][arg1 + 1] = class217.method1476(class129.field2140[arg2][arg5][arg1 + 1], 2);
                    }
                } else if (arg6 == 2) {
                    if (var11.field1639) {
                        class59.field1075[arg2][arg5 + 1][arg1] = 50;
                        class59.field1075[arg2][arg5 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field1638) {
                        class129.field2140[arg2][arg5 + 1][arg1] = class217.method1476(class129.field2140[arg2][arg5 + 1][arg1], 1);
                    }
                } else if (arg6 == 3) {
                    if (var11.field1639) {
                        class59.field1075[arg2][arg5][arg1] = 50;
                        class59.field1075[arg2][arg5 + 1][arg1] = 50;
                    }
                    if (var11.field1638) {
                        class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 2);
                    }
                }
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1491(arg6, arg1, arg10, arg5, var11.field1641, -10);
            }
            if (var11.field1650 != 16) {
                class71.method470(arg2, arg5, arg1, var11.field1650);
            }
        } else if (arg10 == 1) {
            class16 var35;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var34 = var11.method635(var19, var20, var21, var16, var22, (byte) -43, (class60) null, var27, 1, arg8, arg6);
                var35 = var34.field4760;
            } else {
                var35 = new class261(arg9, 1, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class68.method448(arg2, arg5, arg1, var19, var35, (class16) null, class176.field2963[arg6], 0, var25);
            if (var11.field1639 && arg8) {
                if (arg6 == 0) {
                    class59.field1075[arg2][arg5][arg1 + 1] = 50;
                } else if (arg6 == 1) {
                    class59.field1075[arg2][arg5 + 1][arg1 + 1] = 50;
                } else if (arg6 == 2) {
                    class59.field1075[arg2][arg5 + 1][arg1] = 50;
                } else if (arg6 == 3) {
                    class59.field1075[arg2][arg5][arg1] = 50;
                }
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1491(arg6, arg1, arg10, arg5, var11.field1641, -66);
            }
        } else if (arg10 == 2) {
            int var36 = arg6 + 1 & 0x3;
            class16 var38;
            class16 var40;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var37 = var11.method635(var19, var20, var21, var16, var22, (byte) -34, (class60) null, var27, 2, arg8, arg6 + 4);
                var38 = var37.field4760;
                class270 var39 = var11.method635(var19, var20, var21, var16, var22, (byte) -100, (class60) null, var27, 2, arg8, var36);
                var40 = var39.field4760;
            } else {
                var38 = new class261(arg9, 2, arg6 + 4, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
                var40 = new class261(arg9, 2, var36, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class68.method448(arg2, arg5, arg1, var19, var38, var40, class68.field1180[arg6], class68.field1180[var36], var25);
            if (var11.field1638 && arg8) {
                if (arg6 == 0) {
                    class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 1);
                    class129.field2140[arg2][arg5][arg1 + 1] = class217.method1476(class129.field2140[arg2][arg5][arg1 + 1], 2);
                } else if (arg6 == 1) {
                    class129.field2140[arg2][arg5][arg1 + 1] = class217.method1476(class129.field2140[arg2][arg5][arg1 + 1], 2);
                    class129.field2140[arg2][arg5 + 1][arg1] = class217.method1476(class129.field2140[arg2][arg5 + 1][arg1], 1);
                } else if (arg6 == 2) {
                    class129.field2140[arg2][arg5 + 1][arg1] = class217.method1476(class129.field2140[arg2][arg5 + 1][arg1], 1);
                    class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 2);
                } else if (arg6 == 3) {
                    class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 2);
                    class129.field2140[arg2][arg5][arg1] = class217.method1476(class129.field2140[arg2][arg5][arg1], 1);
                }
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1491(arg6, arg1, arg10, arg5, var11.field1641, -15);
            }
            if (var11.field1650 != 16) {
                class71.method470(arg2, arg5, arg1, var11.field1650);
            }
        } else if (arg10 == 3) {
            class16 var42;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var41 = var11.method635(var19, var20, var21, var16, var22, (byte) -101, (class60) null, var27, 3, arg8, arg6);
                var42 = var41.field4760;
            } else {
                var42 = new class261(arg9, 3, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class68.method448(arg2, arg5, arg1, var19, var42, (class16) null, class176.field2963[arg6], 0, var25);
            if (var11.field1639 && arg8) {
                if (arg6 == 0) {
                    class59.field1075[arg2][arg5][arg1 + 1] = 50;
                } else if (arg6 == 1) {
                    class59.field1075[arg2][arg5 + 1][arg1 + 1] = 50;
                } else if (arg6 == 2) {
                    class59.field1075[arg2][arg5 + 1][arg1] = 50;
                } else if (arg6 == 3) {
                    class59.field1075[arg2][arg5][arg1] = 50;
                }
            }
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1491(arg6, arg1, arg10, arg5, var11.field1641, -105);
            }
        } else if (arg10 == 9) {
            class16 var44;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var43 = var11.method635(var19, var20, var21, var16, var22, (byte) -41, (class60) null, var27, arg10, arg8, arg6);
                var44 = var43.field4760;
            } else {
                var44 = new class261(arg9, arg10, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class36.method249(arg2, arg5, arg1, var19, 1, 1, var44, 0, var25);
            if (var11.field1679 != 0 && arg7 != null) {
                arg7.method1489(arg1, var12, var11.field1641, -6116, arg5, var13);
            }
            if (var11.field1650 != 16) {
                class71.method470(arg2, arg5, arg1, var11.field1650);
            }
        } else if (arg10 == 4) {
            class16 var46;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var45 = var11.method635(var19, var20, var21, var16, var22, (byte) -97, (class60) null, var27, 4, arg8, arg6);
                var46 = var45.field4760;
            } else {
                var46 = new class261(arg9, 4, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class233.method1648(arg2, arg5, arg1, var19, var46, (class16) null, class68.field1180[arg6], 0, 0, 0, var25);
        } else if (arg10 == 5) {
            int var47 = 16;
            long var48 = class241.method1687(arg2, arg5, arg1);
            if (var48 != 0L) {
                var47 = class31.method216((int) (var48 >>> 32) & Integer.MAX_VALUE, (byte) 126).field1650;
            }
            class16 var51;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var50 = var11.method635(var19, var20, var21, var16, var22, (byte) -83, (class60) null, var27, 4, arg8, arg6);
                var51 = var50.field4760;
            } else {
                var51 = new class261(arg9, 4, arg6, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class233.method1648(arg2, arg5, arg1, var19, var51, (class16) null, class68.field1180[arg6], 0, class222.field3967[arg6] * var47, class43.field751[arg6] * var47, var25);
        } else if (arg10 == 6) {
            int var52 = 8;
            long var53 = class241.method1687(arg2, arg5, arg1);
            if (var53 != 0L) {
                var52 = class31.method216(Integer.MAX_VALUE & (int) (var53 >>> 32), (byte) 125).field1650 / 2;
            }
            class16 var56;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var55 = var11.method635(var19, var20, var21, var16, var22, (byte) -43, (class60) null, var27, 4, arg8, arg6 + 4);
                var56 = var55.field4760;
            } else {
                var56 = new class261(arg9, 4, arg6 + 4, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class233.method1648(arg2, arg5, arg1, var19, var56, (class16) null, 256, arg6, class42.field734[arg6] * var52, class61.field1093[arg6] * var52, var25);
        } else if (arg10 == 7) {
            int var57 = arg6 + 2 & 0x3;
            class16 var59;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var58 = var11.method635(var19, var20, var21, var16, var22, (byte) -62, (class60) null, var27, 4, arg8, var57 + 4);
                var59 = var58.field4760;
            } else {
                var59 = new class261(arg9, 4, var57 + 4, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class233.method1648(arg2, arg5, arg1, var19, var59, (class16) null, 256, var57, 0, 0, var25);
        } else if (arg10 == 8) {
            int var60 = 8;
            long var61 = class241.method1687(arg2, arg5, arg1);
            if (var61 != 0L) {
                var60 = class31.method216((int) (var61 >>> 32) & Integer.MAX_VALUE, (byte) 117).field1650 / 2;
            }
            int var63 = arg6 + 2 & 0x3;
            class16 var65;
            class16 var67;
            if (var11.field1636 == -1 && var11.field1649 == null) {
                class270 var64 = var11.method635(var19, var20, var21, var16, var22, (byte) -26, (class60) null, var27, 4, arg8, arg6 + 4);
                var65 = var64.field4760;
                class270 var66 = var11.method635(var19, var20, var21, var16, var22, (byte) -43, (class60) null, var27, 4, arg8, var63 + 4);
                var67 = var66.field4760;
            } else {
                var65 = new class261(arg9, 4, arg6 + 4, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
                var67 = new class261(arg9, 4, var63 + 4, arg0, arg5, arg1, var11.field1636, var11.field1691, (class16) null);
            }
            class233.method1648(arg2, arg5, arg1, var19, var65, var67, 256, arg6, class42.field734[arg6] * var60, class61.field1093[arg6] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method1631(boolean arg0) {
        field4108 = null;
        field4105 = null;
        field4107 = null;
        field4110 = null;
        field4103 = null;
        field4112 = null;
        if (arg0) {
            method1628((byte) -98);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method1632(byte arg0) {
        field4104++;
        if (class93.field1527 != null) {
            class93.field1527.method351(false);
        }
        if (class199.field3539 != null) {
            class199.field3539.method351(false);
        }
        if (arg0 < 86) {
            field4103 = null;
        }
    }
}
