import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class125 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lec;")
    public static class28 field2710 = class28.method210(-46, "*6nin your message centre)3");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[Lec;")
    public static class28[] field2705 = new class28[100];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lec;")
    public static class28 field2704 = class28.method210(-46, "From ");

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lec;")
    public static class28 field2721 = class28.method210(-46, "");

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lec;")
    public static class28 field2713 = field2721;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lec;")
    public static class28 field2708 = field2721;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lec;")
    public static class28 field2711 = field2721;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lec;")
    public static class28 field2719 = field2721;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lec;")
    public static class28 field2718 = field2721;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lec;")
    public static class28 field2714 = field2721;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Ldc;")
    public static class22 field2716 = new class22(5000);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lcc;")
    public static class16 field2707;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lcc;")
    public static class16 field2715;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public static int[] field2720;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method962(int arg0) {
        field2706++;
        class55.method450((byte) 84);
        if (class119.field2584 == 1) {
            class118.field2511[field2722 / 100].method188(class76.field1695 - 4 - 8, class105.field2227 - 8 + -4);
        }
        if (class119.field2584 == 2) {
            class118.field2511[field2722 / 100 + 4].method188(class76.field1695 - 8 - 4, class105.field2227 - 8 - 4);
        }
        if (class61.field1354 != -1) {
            class129.method985(true, class61.field1354);
            class18.method111(0, -1, class61.field1354, 0, 0, 334, 512, 4, -1);
        }
        if (class40.field860 != -1) {
            class129.method985(true, class40.field860);
            class18.method111(0, -1, class40.field860, 0, 0, 334, 512, 0, -1);
        }
        class45.method356((byte) 29);
        if (!class13.field243) {
            class21.method149(-1);
            class9.method54(15);
        } else if (class75.field1671 == 0) {
            class105.method729(false);
        }
        int var1 = -40 % ((49 - arg0) / 43);
        if (class55.field1274 == 1) {
            class118.field2508.method188(472, 296);
        }
        if (class15.field296) {
            byte var2 = 20;
            short var3 = 507;
            int var4 = 16776960;
            if (class94.field2073 < 30 && class72.field1591) {
                var4 = 16711680;
            }
            if (class94.field2073 < 20 && !class72.field1591) {
                var4 = 16711680;
            }
            class124.field2697.method444(class68.method537(1, new class28[] { class25.field550, class5.method25(6366, class94.field2073) }), var3, var2, var4);
            Runtime var5 = Runtime.getRuntime();
            int var11 = var2 + 15;
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 32768 && class72.field1591) {
                var7 = 16711680;
            }
            if (var6 > 65536 && !class72.field1591) {
                var7 = 16711680;
            }
            class124.field2697.method444(class68.method537(1, new class28[] { class1.field7, class5.method25(6366, var6), class87.field1941 }), var3, var11, var7);
            var11 += 15;
            if (class74.field1647) {
                class124.field2697.method444(class112.field2408, var3, var11, 16711680);
                class74.field1647 = false;
                var11 += 15;
            }
            if (class36.field820) {
                class124.field2697.method444(class75.field1654, var3, var11, 16711680);
                class36.field820 = false;
                var11 += 15;
            }
            if (class78.field1817) {
                class124.field2697.method444(class43.field926, var3, var11, 16711680);
                var11 += 15;
                class78.field1817 = false;
            }
        }
        if (class21.field482 == 0) {
            return;
        }
        int var8 = class21.field482 / 50;
        int var9 = var8 / 60;
        int var10 = var8 % 60;
        if (var10 < 10) {
            class124.field2697.method449(class68.method537(1, new class28[] { class96.field2152, class5.method25(6366, var9), class126.field2732, class5.method25(6366, var10) }), 4, 329, 16776960);
        } else {
            class124.field2697.method449(class68.method537(1, new class28[] { class96.field2152, class5.method25(6366, var9), class98.field2163, class5.method25(6366, var10) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z")
    public static final boolean method963(boolean arg0) {
        field2712++;
        if (class106.field2239 == null) {
            return false;
        }
        try {
            int var1 = class106.field2239.method106(-1);
            if (var1 == 0) {
                return false;
            }
            if (class25.field545 == -1) {
                class106.field2239.method112(-1527, 0, 1, class56.field1282.field2531);
                var1--;
                class56.field1282.field2554 = 0;
                class25.field545 = class56.field1282.method154(-21946);
                class76.field1692 = class22.field504[class25.field545];
            }
            if (class76.field1692 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class106.field2239.method112(-1527, 0, 1, class56.field1282.field2531);
                class76.field1692 = class56.field1282.field2531[0] & 0xFF;
            }
            if (class76.field1692 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class106.field2239.method112(-1527, 0, 2, class56.field1282.field2531);
                class56.field1282.field2554 = 0;
                class76.field1692 = class56.field1282.method903(2);
            }
            if (class76.field1692 > var1) {
                return false;
            }
            class56.field1282.field2554 = 0;
            class106.field2239.method112(-1527, 0, class76.field1692, class56.field1282.field2531);
            class48.field1118 = 0;
            class12.field203 = class122.field2660;
            class122.field2660 = class34.field778;
            class34.field778 = class25.field545;
            if (class25.field545 == 162) {
                class61.field1360 = true;
                class28.field625 = class56.field1282.method879((byte) 45);
                class90.field1990 = class56.field1282.method879((byte) 45);
                class79.field1838 = class56.field1282.method903(2);
                class56.field1300 = class56.field1282.method879((byte) 45);
                class103.field2203 = class56.field1282.method879((byte) 45);
                if (class103.field2203 >= 100) {
                    class88.field1966 = class28.field625 * 128 + 64;
                    class94.field2079 = class90.field1990 * 128 + 64;
                    class64.field1423 = class18.method107(class94.field2079, class88.field1966, -2049, class122.field2657) - class79.field1838;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 53) {
                class28 var2 = class56.field1282.method885((byte) -81);
                int var3 = class56.field1282.method856((byte) -89);
                class78 var4 = class5.method27(0, var3);
                var4.field1803 = var2;
                if (var3 >> 16 == class127.field2743[class7.field120]) {
                    class30.field646 = true;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 110) {
                class61.method496(0);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 153) {
                class68.field1540 = class56.field1282.method874(!arg0);
                class56.field1282.method903(2);
                class16.field316 = class56.field1282.method859(7482);
                class88.field1959 = class56.field1282.method859(7482);
                class79.field1837 = class56.field1282.method893((byte) 77);
                class118.field2520 = class56.field1282.method874(!arg0);
                class61.field1343 = class56.field1282.method879((byte) 45);
                field2709 = class56.field1282.method893((byte) 121);
                class56.field1282.method874(true);
                class18.field371 = class56.field1282.method859(7482);
                class72.field1610 = class56.field1282.method877(true);
                class68.field1539 = class30.field652.method618(class72.field1610, (byte) 127);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 194) {
                int var5 = class56.field1282.method893((byte) 103);
                byte var6 = class56.field1282.method872((byte) -35);
                class63.field1412[var5] = var6;
                if (class36.field818[var5] != var6) {
                    class36.field818[var5] = var6;
                    class3.method10(24166, var5);
                    if (class1.field13 != -1) {
                        class95.field2092 = true;
                    }
                    class30.field646 = true;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 3) {
                class28 var7 = class56.field1282.method885((byte) -125);
                if (var7.method232(class47.field1087, (byte) -114)) {
                    class28 var8 = var7.method228(var7.method203(class98.field2163, (byte) -71), true, 0);
                    long var9 = var8.method237(240);
                    boolean var11 = false;
                    for (int var12 = 0; var12 < class69.field1546; var12++) {
                        if (class5.field92[var12] == var9) {
                            var11 = true;
                            break;
                        }
                    }
                    if (!var11 && class103.field2193 == 0) {
                        class87.method645(-22, class77.field1739, var8, 4);
                    }
                } else if (var7.method232(class105.field2220, (byte) 125)) {
                    class28 var19 = var7.method228(var7.method203(class98.field2163, (byte) -71), true, 0);
                    boolean var20 = false;
                    long var21 = var19.method237(240);
                    for (int var23 = 0; var23 < class69.field1546; var23++) {
                        if (class5.field92[var23] == var21) {
                            var20 = true;
                            break;
                        }
                    }
                    if (!var20 && class103.field2193 == 0) {
                        class87.method645(11, class127.field2744, var19, 8);
                    }
                } else if (var7.method232(class3.field33, (byte) 99)) {
                    class28 var13 = var7.method228(var7.method203(class98.field2163, (byte) -71), true, 0);
                    long var14 = var13.method237(240);
                    boolean var16 = false;
                    for (int var17 = 0; var17 < class69.field1546; var17++) {
                        if (class5.field92[var17] == var14) {
                            var16 = true;
                            break;
                        }
                    }
                    if (!var16 && class103.field2193 == 0) {
                        class28 var18 = var7.method228(var7.method214(-83) - 9, !arg0, var7.method203(class98.field2163, (byte) -71) + 1);
                        class87.method645(-35, var18, var13, 8);
                    }
                } else {
                    class87.method645(127, var7, field2721, 0);
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 28) {
                class51.field1181 = class56.field1282.method900((byte) 127);
                if (class7.field120 == class51.field1181) {
                    if (class51.field1181 == 3) {
                        class7.field120 = 1;
                    } else {
                        class7.field120 = 3;
                    }
                    class30.field646 = true;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 170) {
                class98.method704(0);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 133) {
                int var24 = class56.field1282.method889((byte) -127);
                int var25 = class56.field1282.method874(true);
                class78 var26 = class5.method27(0, var24);
                var26.field1746 = 1;
                var26.field1774 = var25;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 223) {
                class45.field1010 = class56.field1282.method878((byte) -121);
                class37.field841 = class56.field1282.method879((byte) 45);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 250) {
                boolean var27 = class56.field1282.method879((byte) 45) == 1;
                int var28 = class56.field1282.method882(-89);
                class78 var29 = class5.method27(0, var28);
                class25.field545 = -1;
                var29.field1802 = var27;
                return true;
            }
            if (class25.field545 == 32) {
                field2714 = field2721;
                class95.field2092 = true;
                class23.field515 = 1;
                class25.field545 = -1;
                class114.field2439 = false;
                return true;
            }
            if (class25.field545 == 80) {
                int var30 = class56.field1282.method882(-106);
                int var31 = class56.field1282.method903(2);
                class63.field1412[var31] = var30;
                if (class36.field818[var31] != var30) {
                    class36.field818[var31] = var30;
                    class3.method10(24166, var31);
                    if (class1.field13 != -1) {
                        class95.field2092 = true;
                    }
                    class30.field646 = true;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 249) {
                class63.field1393 = class56.field1282.method893((byte) 117);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 144) {
                class45.field1010 = class56.field1282.method862(-31050);
                class37.field841 = class56.field1282.method878((byte) -121);
                for (int var32 = class37.field841; var32 < class37.field841 + 8; var32++) {
                    for (int var33 = class45.field1010; var33 < class45.field1010 + 8; var33++) {
                        if (class127.field2746[class122.field2657][var32][var33] != null) {
                            class127.field2746[class122.field2657][var32][var33] = null;
                            class20.method137((byte) -124, var32, var33);
                        }
                    }
                }
                for (class109 var34 = (class109) class37.field842.method326(0); var34 != null; var34 = (class109) class37.field842.method325((byte) 123)) {
                    if (var34.field2286 >= class37.field841 && class37.field841 + 8 > var34.field2286 && var34.field2296 >= class45.field1010 && class45.field1010 + 8 > var34.field2296 && class122.field2657 == var34.field2301) {
                        var34.field2285 = 0;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 74) {
                if (class7.field120 == 12) {
                    class30.field646 = true;
                }
                class17.field333 = class56.field1282.method879((byte) 45);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 71) {
                long var35 = class56.field1282.method890((byte) 105);
                class28 var37 = class48.method390(class56.field1282, false).method221(40);
                class87.method645(-100, var37, class46.method365(-72, var35).method212((byte) 124), 6);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 38) {
                class21.field482 = class56.field1282.method874(true) * 30;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 126) {
                class1.method2(true, true);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 255) {
                int var38 = class56.field1282.method879((byte) 45);
                int var39 = class56.field1282.method879((byte) 45);
                int var40 = class56.field1282.method879((byte) 45);
                int var41 = class56.field1282.method879((byte) 45);
                class23.field526[var38] = true;
                class109.field2291[var38] = var39;
                class42.field909[var38] = var40;
                class14.field264[var38] = var41;
                class40.field859[var38] = 0;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 243) {
                for (int var42 = 0; var42 < class78.field1808; var42++) {
                    class30 var43 = class110.method753((byte) 121, var42);
                    if (var43 != null && var43.field644 == 0) {
                        class63.field1412[var42] = 0;
                        class36.field818[var42] = 0;
                    }
                }
                class30.field646 = true;
                if (class1.field13 != -1) {
                    class95.field2092 = true;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 181) {
                class55.field1274 = class56.field1282.method879((byte) 45);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 85) {
                int var44 = class56.field1282.method900((byte) 127);
                class28 var45 = class56.field1282.method885((byte) -78);
                int var46 = class56.field1282.method862(-31050);
                if (var46 >= 1 && var46 <= 5) {
                    if (var45.method206(class122.field2641, true)) {
                        var45 = null;
                    }
                    class31.field665[var46 - 1] = var45;
                    class83.field1896[var46 - 1] = var44 == 0;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 54) {
                class69.field1546 = class76.field1692 / 8;
                for (int var47 = 0; var47 < class69.field1546; var47++) {
                    class5.field92[var47] = class56.field1282.method890((byte) 100);
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 202) {
                int var48 = class56.field1282.method856((byte) -89);
                int var49 = class56.field1282.method874(true);
                int var50 = var49 >> 10 & 0x1F;
                class78 var51 = class5.method27(0, var48);
                int var52 = var49 & 0x1F;
                class25.field545 = -1;
                int var53 = var49 >> 5 & 0x1F;
                var51.field1761 = (var50 << 19) - (-(var52 << 3) - (var53 << 11));
                return true;
            }
            if (class25.field545 == 102) {
                int var54 = class56.field1282.method893((byte) 122);
                class64.method517(-84, var54);
                if (class110.field2325 != -1) {
                    class14.method79(156, class110.field2325);
                    class110.field2325 = -1;
                    class95.field2092 = true;
                }
                if (class37.field854 != -1) {
                    class14.method79(156, class37.field854);
                    class37.field854 = -1;
                    class74.method574(0, 30);
                }
                if (class2.field19 != -1) {
                    class14.method79(156, class2.field19);
                    class2.field19 = -1;
                }
                if (class40.field860 != -1) {
                    class14.method79(156, class40.field860);
                    class40.field860 = -1;
                }
                if (class57.field1307 != var54) {
                    class14.method79(156, class57.field1307);
                    class57.field1307 = var54;
                }
                class25.field545 = -1;
                class30.field646 = true;
                if (class23.field515 != 0) {
                    class95.field2092 = true;
                    class23.field515 = 0;
                }
                class112.field2422 = true;
                class36.field794 = false;
                return true;
            }
            if (class25.field545 == 215) {
                class61.field1360 = true;
                class20.field436 = class56.field1282.method879((byte) 45);
                class93.field2049 = class56.field1282.method879((byte) 45);
                class103.field2200 = class56.field1282.method903(2);
                class127.field2749 = class56.field1282.method879((byte) 45);
                class126.field2733 = class56.field1282.method879((byte) 45);
                if (class126.field2733 >= 100) {
                    int var55 = class20.field436 * 128 + 64;
                    int var56 = class93.field2049 * 128 + 64;
                    int var57 = class18.method107(var56, var55, -2049, class122.field2657) - class103.field2200;
                    int var58 = var57 - class64.field1423;
                    int var59 = var56 - class94.field2079;
                    int var60 = var55 - class88.field1966;
                    int var61 = (int) Math.sqrt((double) (var59 * var59 + var60 * var60));
                    class4.field72 = (int) (Math.atan2((double) var58, (double) var61) * 325.949D) & 0x7FF;
                    class12.field196 = (int) (-325.949D * Math.atan2((double) var60, (double) var59)) & 0x7FF;
                    if (class4.field72 < 128) {
                        class4.field72 = 128;
                    }
                    if (class4.field72 > 383) {
                        class4.field72 = 383;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 224) {
                int var62 = class56.field1282.method893((byte) 67);
                class64.method517(-42, var62);
                if (class57.field1307 != -1) {
                    class14.method79(156, class57.field1307);
                    class30.field646 = true;
                    class112.field2422 = true;
                    class57.field1307 = -1;
                }
                if (class37.field854 != -1) {
                    class14.method79(156, class37.field854);
                    class37.field854 = -1;
                    class74.method574(0, 30);
                }
                if (class2.field19 != -1) {
                    class14.method79(156, class2.field19);
                    class2.field19 = -1;
                }
                if (class40.field860 != -1) {
                    class14.method79(156, class40.field860);
                    class40.field860 = -1;
                }
                if (class110.field2325 != var62) {
                    class14.method79(156, class110.field2325);
                    class110.field2325 = var62;
                }
                class25.field545 = -1;
                class36.field794 = false;
                class95.field2092 = true;
                return true;
            }
            if (class25.field545 == 26) {
                class114.field2439 = false;
                class95.field2092 = true;
                class25.field545 = -1;
                field2714 = field2721;
                class23.field515 = 2;
                return true;
            }
            if (class25.field545 == 252) {
                int var63 = class56.field1282.method900((byte) 127);
                int var64 = class56.field1282.method874(true);
                if (var64 == 65535) {
                    var64 = -1;
                }
                if (class127.field2743[var63] != var64) {
                    class14.method79(156, class127.field2743[var63]);
                    class127.field2743[var63] = var64;
                }
                class112.field2422 = true;
                class30.field646 = true;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 118 || class25.field545 == 63 || class25.field545 == 21 || class25.field545 == 46 || class25.field545 == 135 || class25.field545 == 69 || class25.field545 == 221 || class25.field545 == 56 || class25.field545 == 129 || class25.field545 == 35 || class25.field545 == 244) {
                class72.method564(true);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 11) {
                int var65 = class56.field1282.method903(2);
                int var66 = class56.field1282.method879((byte) 45);
                int var67 = class56.field1282.method903(2);
                if (class50.field1176 != 0 && var66 != 0 && class76.field1701 < 50) {
                    class42.field907[class76.field1701] = var65;
                    class91.field1998[class76.field1701] = var66;
                    class2.field25[class76.field1701] = var67;
                    class122.field2621[class76.field1701] = null;
                    class76.field1701++;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 45) {
                class30.field646 = true;
                int var68 = class56.field1282.method882(-54);
                class78 var69 = class5.method27(0, var68);
                while (class56.field1282.field2554 < class76.field1692) {
                    int var70 = class56.field1282.method899(-4);
                    int var71 = class56.field1282.method903(2);
                    int var72 = class56.field1282.method879((byte) 45);
                    if (var72 == 255) {
                        var72 = class56.field1282.method882(-87);
                    }
                    if (var70 >= 0 && var69.field1795.length > var70) {
                        var69.field1795[var70] = var71;
                        var69.field1792[var70] = var72;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 155) {
                long var73 = class56.field1282.method890((byte) 93);
                int var75 = class56.field1282.method903(2);
                class28 var76 = class46.method365(-66, var73).method212((byte) 124);
                for (int var77 = 0; var77 < class36.field829; var77++) {
                    if (class1.field5[var77] == var73) {
                        if (class61.field1348[var77] != var75) {
                            class61.field1348[var77] = var75;
                            class30.field646 = true;
                            if (var75 > 0) {
                                class87.method645(105, class68.method537(1, new class28[] { var76, class3.field50 }), field2721, 5);
                            }
                            if (var75 == 0) {
                                class87.method645(124, class68.method537(1, new class28[] { var76, class25.field562 }), field2721, 5);
                            }
                        }
                        var76 = null;
                        break;
                    }
                }
                if (var76 != null && class36.field829 < 200) {
                    class1.field5[class36.field829] = var73;
                    class93.field2048[class36.field829] = var76;
                    class61.field1348[class36.field829] = var75;
                    class36.field829++;
                    class30.field646 = true;
                }
                boolean var78 = false;
                while (!var78) {
                    var78 = true;
                    for (int var79 = 0; var79 < class36.field829 - 1; var79++) {
                        if (class61.field1348[var79] != class129.field2790 && class61.field1348[var79 + 1] == class129.field2790 || class61.field1348[var79] == 0 && class61.field1348[var79 + 1] != 0) {
                            var78 = false;
                            int var80 = class61.field1348[var79];
                            class61.field1348[var79] = class61.field1348[var79 + 1];
                            class61.field1348[var79 + 1] = var80;
                            class28 var81 = class93.field2048[var79];
                            class93.field2048[var79] = class93.field2048[var79 + 1];
                            class93.field2048[var79 + 1] = var81;
                            long var82 = class1.field5[var79];
                            class1.field5[var79] = class1.field5[var79 + 1];
                            class1.field5[var79 + 1] = var82;
                            class30.field646 = true;
                        }
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 94) {
                int var84 = class56.field1282.method853(-2558);
                if (class1.field13 != var84) {
                    class14.method79(156, class1.field13);
                    class1.field13 = var84;
                }
                class95.field2092 = true;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 15) {
                int var85 = class56.field1282.method889((byte) -102);
                int var86 = class56.field1282.method853(-2558);
                int var87 = class56.field1282.method895(113);
                class78 var88 = class5.method27(0, var85);
                class25.field545 = -1;
                var88.field1783 = var88.field1764 + var87;
                var88.field1788 = var88.field1804 + var86;
                return true;
            }
            if (class25.field545 == 197) {
                class87.method646(0);
                class25.field545 = -1;
                return false;
            }
            if (class25.field545 == 180) {
                class16.field317 = class56.field1282.method879((byte) 45);
                class126.field2735 = class56.field1282.method879((byte) 45);
                class112.field2418 = class56.field1282.method879((byte) 45);
                class51.field1196 = true;
                class95.field2092 = true;
                class25.field545 = -1;
                return true;
            }
            if (arg0) {
                field2705 = null;
            }
            if (class25.field545 == 24) {
                int var89 = class56.field1282.method874(!arg0);
                int var90 = class56.field1282.method859(7482);
                int var91 = class56.field1282.method877(true);
                class78 var92 = class5.method27(0, var91);
                class25.field545 = -1;
                var92.field1747 = (var89 << 16) + var90;
                return true;
            }
            if (class25.field545 == 203) {
                class25.field560 = class56.field1282.method879((byte) 45);
                class30.field646 = true;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 25) {
                if (class57.field1307 != -1) {
                    class14.method79(156, class57.field1307);
                    class57.field1307 = -1;
                    class112.field2422 = true;
                    class30.field646 = true;
                }
                if (class110.field2325 != -1) {
                    class14.method79(156, class110.field2325);
                    class95.field2092 = true;
                    class110.field2325 = -1;
                }
                if (class37.field854 != -1) {
                    class14.method79(156, class37.field854);
                    class37.field854 = -1;
                    class74.method574(0, 30);
                }
                if (class2.field19 != -1) {
                    class14.method79(156, class2.field19);
                    class2.field19 = -1;
                }
                if (class40.field860 != -1) {
                    class14.method79(156, class40.field860);
                    class40.field860 = -1;
                }
                class25.field545 = -1;
                class36.field794 = false;
                if (class23.field515 != 0) {
                    class23.field515 = 0;
                    class95.field2092 = true;
                }
                return true;
            }
            if (class25.field545 == 241) {
                int var93 = class56.field1282.method877(true);
                int var94 = class56.field1282.method874(!arg0);
                class78 var95 = class5.method27(0, var93);
                var95.field1774 = var94;
                class25.field545 = -1;
                var95.field1746 = 2;
                return true;
            }
            if (class25.field545 == 97) {
                int var96 = class56.field1282.method903(2);
                int var97 = class56.field1282.method859(7482);
                if (class110.field2325 != -1) {
                    class14.method79(156, class110.field2325);
                    class110.field2325 = -1;
                    class95.field2092 = true;
                }
                if (class37.field854 != -1) {
                    class14.method79(156, class37.field854);
                    class37.field854 = -1;
                    class74.method574(0, 30);
                }
                if (class2.field19 != -1) {
                    class14.method79(156, class2.field19);
                    class2.field19 = -1;
                }
                if (class40.field860 != var97) {
                    class14.method79(156, class40.field860);
                    class40.field860 = var97;
                }
                if (class57.field1307 != var96) {
                    class14.method79(156, class57.field1307);
                    class57.field1307 = var96;
                }
                if (class23.field515 != 0) {
                    class23.field515 = 0;
                    class95.field2092 = true;
                }
                class112.field2422 = true;
                class25.field545 = -1;
                class36.field794 = false;
                class30.field646 = true;
                return true;
            }
            if (class25.field545 == 84) {
                int var98 = class56.field1282.method889((byte) -125);
                class78 var99 = class5.method27(0, var98);
                var99.field1746 = 3;
                var99.field1774 = class37.field848.field936.method810((byte) 44);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 232) {
                for (int var100 = 0; var100 < class36.field818.length; var100++) {
                    if (class63.field1412[var100] != class36.field818[var100]) {
                        class36.field818[var100] = class63.field1412[var100];
                        class3.method10(24166, var100);
                        class30.field646 = true;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 142) {
                class37.field841 = class56.field1282.method879((byte) 45);
                class45.field1010 = class56.field1282.method900((byte) 127);
                while (class76.field1692 > class56.field1282.field2554) {
                    class25.field545 = class56.field1282.method879((byte) 45);
                    class72.method564(true);
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 108) {
                for (int var101 = 0; var101 < class129.field2779.length; var101++) {
                    if (class129.field2779[var101] != null) {
                        class129.field2779[var101].field1505 = -1;
                    }
                }
                for (int var102 = 0; var102 < class88.field1956.length; var102++) {
                    if (class88.field1956[var102] != null) {
                        class88.field1956[var102].field1505 = -1;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 66) {
                class11.field185 = class56.field1282.method879((byte) 45);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 70) {
                int var103 = class56.field1282.method859(7482);
                if (var103 == 65535) {
                    var103 = -1;
                }
                if (var103 == -1 && class7.field121 == 0) {
                    class66.method528(false);
                } else if (var103 != -1 && class47.field1074 != var103 && class77.field1735 != 0 && class7.field121 == 0) {
                    class66.method535(0, var103, (byte) -51, 0, class77.field1735, 10, false, class61.field1344);
                }
                class25.field545 = -1;
                class47.field1074 = var103;
                return true;
            }
            if (class25.field545 == 62) {
                int var104 = class56.field1282.method869(114);
                int var105 = class56.field1282.method859(7482);
                if (var105 == 65535) {
                    var105 = -1;
                }
                if (class77.field1735 != 0 && var105 != -1) {
                    class66.method533(var105, 0, class77.field1735, 1, 82, client.field380, false);
                    class7.field121 = var104;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 103) {
                long var106 = class56.field1282.method890((byte) 56);
                long var108 = (long) class56.field1282.method903(2);
                long var110 = (long) class56.field1282.method869(-113);
                int var112 = class56.field1282.method879((byte) 45);
                long var113 = (var108 << 32) + var110;
                boolean var115 = false;
                for (int var116 = 0; var116 < 100; var116++) {
                    if (class90.field1980[var116] == var113) {
                        var115 = true;
                        break;
                    }
                }
                if (var112 <= 1) {
                    for (int var117 = 0; var117 < class69.field1546; var117++) {
                        if (class5.field92[var117] == var106) {
                            var115 = true;
                            break;
                        }
                    }
                }
                if (!var115 && class103.field2193 == 0) {
                    class90.field1980[class93.field2059] = var113;
                    class93.field2059 = (class93.field2059 + 1) % 100;
                    class28 var118 = class48.method390(class56.field1282, false).method221(40);
                    if (var112 == 2 || var112 == 3) {
                        class87.method645(115, var118, class68.method537(1, new class28[] { class63.field1394, class46.method365(-88, var106).method212((byte) 124) }), 7);
                    } else if (var112 == 1) {
                        class87.method645(-72, var118, class68.method537(1, new class28[] { class88.field1961, class46.method365(-127, var106).method212((byte) 124) }), 7);
                    } else {
                        class87.method645(123, var118, class46.method365(-107, var106).method212((byte) 124), 3);
                    }
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 17) {
                class61.field1360 = false;
                for (int var119 = 0; var119 < 5; var119++) {
                    class23.field526[var119] = false;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 90) {
                class110.field2314 = class56.field1282.method879((byte) 45);
                if (class110.field2314 == 1) {
                    class31.field659 = class56.field1282.method903(2);
                }
                if (class110.field2314 >= 2 && class110.field2314 <= 6) {
                    if (class110.field2314 == 2) {
                        client.field399 = 64;
                        class72.field1615 = 64;
                    }
                    if (class110.field2314 == 3) {
                        client.field399 = 64;
                        class72.field1615 = 0;
                    }
                    if (class110.field2314 == 4) {
                        class72.field1615 = 128;
                        client.field399 = 64;
                    }
                    if (class110.field2314 == 5) {
                        client.field399 = 0;
                        class72.field1615 = 64;
                    }
                    if (class110.field2314 == 6) {
                        class72.field1615 = 64;
                        client.field399 = 128;
                    }
                    class110.field2314 = 2;
                    class88.field1946 = class56.field1282.method903(2);
                    class34.field767 = class56.field1282.method903(2);
                    class112.field2420 = class56.field1282.method879((byte) 45);
                }
                if (class110.field2314 == 10) {
                    class90.field1986 = class56.field1282.method903(2);
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 121) {
                class25.field545 = -1;
                class127.field2750 = 0;
                return true;
            }
            if (class25.field545 == 216) {
                class7.field120 = class56.field1282.method878((byte) -121);
                class30.field646 = true;
                class25.field545 = -1;
                class112.field2422 = true;
                return true;
            }
            if (class25.field545 == 195) {
                int var120 = class56.field1282.method893((byte) 103);
                class64.method517(-43, var120);
                if (class57.field1307 != -1) {
                    class14.method79(156, class57.field1307);
                    class112.field2422 = true;
                    class57.field1307 = -1;
                    class30.field646 = true;
                }
                if (class110.field2325 != -1) {
                    class14.method79(156, class110.field2325);
                    class95.field2092 = true;
                    class110.field2325 = -1;
                }
                if (class37.field854 != -1) {
                    class14.method79(156, class37.field854);
                    class37.field854 = -1;
                    class74.method574(0, 30);
                }
                if (class2.field19 != -1) {
                    class14.method79(156, class2.field19);
                    class2.field19 = -1;
                }
                if (class40.field860 != var120) {
                    class14.method79(156, class40.field860);
                    class40.field860 = var120;
                }
                if (class23.field515 != 0) {
                    class23.field515 = 0;
                    class95.field2092 = true;
                }
                class25.field545 = -1;
                class36.field794 = false;
                return true;
            }
            if (class25.field545 == 163) {
                int var121 = class56.field1282.method893((byte) 118);
                int var122 = class56.field1282.method874(true);
                class64.method517(-95, var122);
                if (var121 != -1) {
                    class64.method517(-116, var121);
                }
                if (class40.field860 != -1) {
                    class14.method79(156, class40.field860);
                    class40.field860 = -1;
                }
                if (class57.field1307 != -1) {
                    class14.method79(156, class57.field1307);
                    class57.field1307 = -1;
                }
                if (class110.field2325 != -1) {
                    class14.method79(156, class110.field2325);
                    class110.field2325 = -1;
                }
                if (class37.field854 != var122) {
                    class14.method79(156, class37.field854);
                    class37.field854 = var122;
                    class74.method574(0, 35);
                }
                if (class2.field19 != var122) {
                    class14.method79(156, class2.field19);
                    class2.field19 = var121;
                }
                class36.field794 = false;
                class23.field515 = 0;
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 213) {
                int var123 = class56.field1282.method889((byte) -119);
                int var124 = class56.field1282.method895(97);
                class78 var125 = class5.method27(0, var123);
                class25.field545 = -1;
                if (var125.field1797 != var124 || var124 == -1) {
                    var125.field1797 = var124;
                    var125.field1762 = 0;
                    var125.field1786 = 0;
                }
                return true;
            }
            if (class25.field545 == 128) {
                class30.field646 = true;
                int var126 = class56.field1282.method882(-35);
                class78 var127 = class5.method27(0, var126);
                int var128 = class56.field1282.method903(2);
                for (int var129 = 0; var129 < var128; var129++) {
                    int var130 = class56.field1282.method900((byte) 127);
                    if (var130 == 255) {
                        var130 = class56.field1282.method882(-9);
                    }
                    var127.field1795[var129] = class56.field1282.method874(true);
                    var127.field1792[var129] = var130;
                }
                for (int var131 = var128; var131 < var127.field1795.length; var131++) {
                    var127.field1795[var131] = 0;
                    var127.field1792[var131] = 0;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 58) {
                int var132 = class56.field1282.method893((byte) 124);
                int var133 = class56.field1282.method859(7482);
                int var134 = class56.field1282.method889((byte) -107);
                int var135 = class56.field1282.method859(7482);
                class78 var136 = class5.method27(0, var134);
                var136.field1773 = var135;
                var136.field1771 = var132;
                class25.field545 = -1;
                var136.field1750 = var133;
                return true;
            }
            if (class25.field545 == 7) {
                int var137 = class56.field1282.method856((byte) -89);
                int var138 = class56.field1282.method859(7482);
                int var139 = class56.field1282.method859(7482);
                class78 var140 = class5.method27(0, var137);
                if (var139 == 65535) {
                    class25.field545 = -1;
                    var140.field1746 = 0;
                    return true;
                }
                class129 var141 = class129.method992(var139, -109);
                class25.field545 = -1;
                var140.field1746 = 4;
                var140.field1774 = var139;
                var140.field1771 = var141.field2781;
                var140.field1773 = var141.field2786;
                var140.field1750 = var141.field2774 * 100 / var138;
                return true;
            }
            if (class25.field545 == 122) {
                class1.method2(!arg0, false);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 239) {
                int var142 = class56.field1282.method905(-29211);
                if (var142 >= 0) {
                    class64.method517(-67, var142);
                }
                if (class61.field1354 != var142) {
                    class14.method79(156, class61.field1354);
                    class61.field1354 = var142;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 136) {
                int var143 = class56.field1282.method882(125);
                class78 var144 = class5.method27(0, var143);
                for (int var145 = 0; var145 < var144.field1795.length; var145++) {
                    var144.field1795[var145] = -1;
                    var144.field1795[var145] = 0;
                }
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 157) {
                class66.method526(-128, class30.field652, class76.field1692, class56.field1282);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 36) {
                int var146 = class56.field1282.method859(7482);
                int var147 = class56.field1282.method877(true);
                class78 var148 = class5.method27(0, var147);
                class25.field545 = -1;
                if (var148 != null && var148.field1757 == 0) {
                    if (var146 < 0) {
                        var146 = 0;
                    }
                    if (var146 > var148.field1756 - var148.field1765) {
                        var146 = var148.field1756 - var148.field1765;
                    }
                    var148.field1742 = var146;
                }
                return true;
            }
            if (class25.field545 == 120) {
                if (class7.field120 == 12) {
                    class30.field646 = true;
                }
                class92.field2026 = class56.field1282.method880((byte) 102);
                class25.field545 = -1;
                return true;
            }
            if (class25.field545 == 116) {
                class30.field646 = true;
                int var149 = class56.field1282.method878((byte) -121);
                int var150 = class56.field1282.method889((byte) -111);
                int var151 = class56.field1282.method862(-31050);
                class5.field95[var151] = var150;
                class30.field650[var151] = var149;
                class76.field1693[var151] = 1;
                for (int var152 = 0; var152 < 98; var152++) {
                    if (class48.field1104[var152] <= var150) {
                        class76.field1693[var151] = var152 + 2;
                    }
                }
                class25.field545 = -1;
                return true;
            }
            class51.method417("T1 - " + class25.field545 + "," + class122.field2660 + "," + class12.field203 + " - " + class76.field1692, 50);
            class87.method646(0);
        } catch (IOException var156) {
            class64.method514(-23296);
        } catch (Exception var157) {
            String var154 = "T2 - " + class25.field545 + "," + class122.field2660 + "," + class12.field203 + " - " + class76.field1692 + "," + (class37.field848.field1487[0] + class18.field366) + "," + (class87.field1934 + class37.field848.field1466[0]) + " - ";
            for (int var155 = 0; var155 < class76.field1692 && var155 < 50; var155++) {
                var154 = var154 + class56.field1282.field2531[var155] + ",";
            }
            class119.method884(32, var157, var154);
            class87.method646(0);
        }
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method964(byte arg0) {
        field2719 = null;
        field2718 = null;
        field2707 = null;
        field2708 = null;
        field2714 = null;
        field2711 = null;
        if (arg0 >= -47) {
            return;
        }
        field2705 = null;
        field2720 = null;
        field2716 = null;
        field2704 = null;
        field2713 = null;
        field2721 = null;
        field2710 = null;
        field2715 = null;
    }
}
