import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class124 {

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lac;")
    private class4 field2768 = new class4();

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
    public static long field2765 = 0L;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field2761 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[[B")
    public static byte[][] field2767 = new byte[1000][];

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Loa;")
    public static class98 field2760 = class38.method349(255, "Stufe)2");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Loa;")
    public static class98 field2773 = class38.method349(255, "null");

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[J")
    public static long[] field2778 = new long[32];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Loa;")
    public static class98 field2775 = class38.method349(255, "");

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Loa;")
    public static class98 field2764 = class38.method349(255, "Menge eingeben:");

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILac;)V")
    public final void method977(int arg0, class4 arg1) {
        if (arg1.field65 != null) {
            arg1.method22(0);
        }
        field2779++;
        arg1.field56 = this.field2768;
        arg1.field65 = this.field2768.field65;
        arg1.field65.field56 = arg1;
        int var3 = 64 / ((arg0 + 12) / 38);
        arg1.field56.field65 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    private static final void method978(int arg0) {
        field2758++;
        for (int var1 = 0; var1 < class127.field2830; var1++) {
            int var10002 = class15.field318[var1]--;
            if (class15.field318[var1] >= -10) {
                class136 var3 = class26.field634[var1];
                if (var3 == null) {
                    var3 = class136.method1105(class15.field310, class64.field1370[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class15.field318[var1] += var3.method1104();
                    class26.field634[var1] = var3;
                }
                if (class15.field318[var1] < 0) {
                    int var4;
                    if (class134.field3267[var1] == 0) {
                        var4 = class32.field784;
                    } else {
                        int var5 = class134.field3267[var1] >> 16 & 0xFF;
                        int var6 = (class134.field3267[var1] & 0xFF) * 128;
                        int var7 = class134.field3267[var1] >> 8 & 0xFF;
                        int var8 = var5 * 128 + 64 - class73.field1536.field3657;
                        int var9 = var7 * 128 + 64 - class73.field1536.field3667;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var10 > var6) {
                            class15.field318[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class149.field3671 / var6;
                    }
                    if (var4 > 0) {
                        class116 var11 = var3.method1102().method929(class49.field1096);
                        class104 var12 = class104.method870(var11, 100, var4);
                        var12.method851(class46.field1046[var1] - 1);
                        class82.field1872.method1217(var12);
                    }
                    class15.field318[var1] = -100;
                }
            } else {
                class127.field2830--;
                for (int var2 = var1; var2 < class127.field2830; var2++) {
                    class64.field1370[var2] = class64.field1370[var2 + 1];
                    class26.field634[var2] = class26.field634[var2 + 1];
                    class46.field1046[var2] = class46.field1046[var2 + 1];
                    class15.field318[var2] = class15.field318[var2 + 1];
                    class134.field3267[var2] = class134.field3267[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 > -44) {
            method986(-90, false, 104, 95);
        }
        if (class8.field193 && !method980((byte) 26)) {
            if (class27.field660 != 0 && class83.field1917 != -1) {
                class98.method794(10000, class83.field1917, 0, false, class27.field660, class121.field2714);
            }
            class8.field193 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method979(int arg0) {
        if (class75.field1650 > 0) {
            class75.field1650--;
        }
        if (class127.field2844 > 1) {
            class127.field2844--;
        }
        field2774++;
        if (class20.field443) {
            class20.field443 = false;
            class118.method939(arg0);
            return;
        }
        for (int var1 = arg0; var1 < 100 && class67.method552(-68); var1++) {
        }
        if (class52.field1148 != 30 && class52.field1148 != 35) {
            return;
        }
        if (class46.field1065 && class52.field1148 == 30) {
            class36.field899 = 0;
            class42.field976 = 0;
            while (class56.method457(arg0 - 67)) {
            }
            for (int var2 = 0; var2 < class86.field1978.length; var2++) {
                class86.field1978[var2] = false;
            }
        }
        class99.method825(0, class132.field3116, 73);
        Object var3 = class20.field444.field1319;
        synchronized (class20.field444.field1319) {
            if (!class31.field732) {
                class20.field444.field1334 = 0;
            } else if (class42.field976 != 0 || class20.field444.field1334 >= 40) {
                class132.field3116.method177(6624, 64);
                class32.field753++;
                class132.field3116.method95(0, true);
                int var4 = class132.field3116.field182;
                int var5 = 0;
                for (int var6 = 0; var6 < class20.field444.field1334 && class132.field3116.field182 - var4 < 240; var6++) {
                    int var7 = class20.field444.field1333[var6];
                    var5++;
                    int var8 = class20.field444.field1335[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class20.field444.field1333[var6] == -1 && class20.field444.field1335[var6] == -1) {
                        var7 = -1;
                        var9 = 524287;
                        var8 = -1;
                    }
                    if (class37.field918 != var8 || class10.field204 != var7) {
                        int var10 = var8 - class37.field918;
                        class37.field918 = var8;
                        int var11 = var7 - class10.field204;
                        class10.field204 = var7;
                        if (class125.field2789 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class132.field3116.method81((byte) 70, (class125.field2789 << 12) + (var10 << 6) + var11);
                            class125.field2789 = 0;
                        } else if (class125.field2789 < 8) {
                            class132.field3116.method74((class125.field2789 << 19) + var9 + 8388608, (byte) -35);
                            class125.field2789 = 0;
                        } else {
                            class132.field3116.method72((byte) 92, (class125.field2789 << 19) + var9 - 1073741824);
                            class125.field2789 = 0;
                        }
                    } else if (class125.field2789 < 2047) {
                        class125.field2789++;
                    }
                }
                class132.field3116.method67((byte) -126, class132.field3116.field182 - var4);
                if (var5 >= class20.field444.field1334) {
                    class20.field444.field1334 = 0;
                } else {
                    class20.field444.field1334 -= var5;
                    for (int var12 = 0; var12 < class20.field444.field1334; var12++) {
                        class20.field444.field1335[var12] = class20.field444.field1335[var5 + var12];
                        class20.field444.field1333[var12] = class20.field444.field1333[var12 + var5];
                    }
                }
            }
        }
        if (class42.field976 != 0) {
            class140.field3418++;
            long var13 = (class52.field1160 - class90.field2053) / 50L;
            int var15 = class86.field1980;
            class90.field2053 = class52.field1160;
            int var16 = class150.field3717;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = var15 * 765 + var16;
            int var18 = (int) var13;
            byte var19 = 0;
            if (class42.field976 == 2) {
                var19 = 1;
            }
            class132.field3116.method177(6624, 163);
            class132.field3116.method101((var18 << 20) + var17 + (var19 << 19), arg0 ^ 0x6D);
        }
        if (class86.field1978[96] || class86.field1978[97] || class86.field1978[98] || class86.field1978[99]) {
            class20.field447 = true;
        }
        if (class101.field2330 > 0) {
            class101.field2330--;
        }
        if (class20.field447 && class101.field2330 <= 0) {
            class101.field2330 = 20;
            class75.field1611++;
            class20.field447 = false;
            class132.field3116.method177(6624, 147);
            class132.field3116.method77(-104, class25.field611);
            class132.field3116.method82((byte) -116, class127.field2843);
        }
        if (class99.field2318 && !class119.field2676) {
            class141.field3443++;
            class119.field2676 = true;
            class132.field3116.method177(6624, 224);
            class132.field3116.method95(1, true);
        }
        if (!class99.field2318 && class119.field2676) {
            class141.field3443++;
            class119.field2676 = false;
            class132.field3116.method177(6624, 224);
            class132.field3116.method95(0, true);
        }
        class150.method1212(-31732);
        if (class52.field1148 != 30 && class52.field1148 != 35) {
            return;
        }
        class101.method838((byte) 37);
        method978(-45);
        class10.field211++;
        if (class10.field211 > 750) {
            class118.method939(arg0);
            return;
        }
        class101.method836(1);
        class51.method424((byte) -127);
        class63.method517(true);
        if (class83.field1936 != 0) {
            class27.field663 += 20;
            if (class27.field663 >= 400) {
                class83.field1936 = 0;
            }
        }
        if (class1.field18 != 0) {
            class5.field86++;
            if (class5.field86 >= 15) {
                if (class1.field18 == 3) {
                    class15.field306 = true;
                }
                if (class1.field18 == 2) {
                    class137.field3332 = true;
                }
                class1.field18 = 0;
            }
        }
        class52.field1161++;
        if (class36.field879 != 0) {
            if (class118.field2640 + 5 < class42.field990 || class42.field990 < class118.field2640 - 5 || class123.field2749 > class114.field2576 + 5 || class114.field2576 - 5 > class123.field2749) {
                class3.field51 = true;
            }
            class20.field433++;
            if (class36.field899 == 0) {
                if (class36.field879 == 3) {
                    class15.field306 = true;
                }
                if (class36.field879 == 2) {
                    class137.field3332 = true;
                }
                class36.field879 = 0;
                if (class3.field51 && class20.field433 >= 5) {
                    class105.field2414 = -1;
                    class54.method443(68);
                    if (class121.field2711 == class105.field2414 && class54.field1188 != class131.field3061) {
                        class25.field604++;
                        class132 var20 = class117.method932(class121.field2711, (byte) -116);
                        byte var21 = 0;
                        if (class126.field2804 == 1 && var20.field3126 == 206) {
                            var21 = 1;
                        }
                        if (var20.field3149[class54.field1188] <= 0) {
                            var21 = 0;
                        }
                        if (class118.method938(class39.method351(42, var20), (byte) -90)) {
                            int var24 = class131.field3061;
                            int var25 = class54.field1188;
                            var20.field3149[var25] = var20.field3149[var24];
                            var20.field3128[var25] = var20.field3128[var24];
                            var20.field3149[var24] = -1;
                            var20.field3128[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class131.field3061;
                            int var23 = class54.field1188;
                            while (var22 != var23) {
                                if (var22 > var23) {
                                    var20.method1078(-126, var22, var22 - 1);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method1078(arg0 ^ 0xFFFFFF83, var22, var22 + 1);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method1078(arg0 ^ 0xFFFFFF83, class131.field3061, class54.field1188);
                        }
                        class132.field3116.method177(6624, 82);
                        class132.field3116.method81((byte) 21, class54.field1188);
                        class132.field3116.method84(var21, -196338008);
                        class132.field3116.method54((byte) 36, class131.field3061);
                        class132.field3116.method72((byte) 116, class121.field2711);
                    }
                } else if ((class112.field2506 == 1 || class98.method816(125, class80.field1780 - 1)) && class80.field1780 > 2) {
                    class29.method296(4);
                } else if (class80.field1780 > 0) {
                    class21.method195(class80.field1780 - 1, 0);
                }
                class42.field976 = 0;
                class5.field86 = 10;
            }
        }
        byte var26 = 34;
        if (class77.field1694 == -1) {
            if (class71.field1460 != -1) {
                class114.method924(class71.field1460, 4, -20556, 338, 516, 0, 4, var26);
            } else if (class130.field3058 != -1) {
                class114.method924(class130.field3058, 4, -20556, 338, 516, 0, 4, var26);
            }
            if (class132.field3111 != -1) {
                class114.method924(class132.field3111, 205, arg0 ^ 0xFFFFAFB4, 466, 743, 1, 553, var26);
            } else if (class52.field1163[class31.field709] != -1) {
                class114.method924(class52.field1163[class31.field709], 205, arg0 - 20556, 466, 743, 1, 553, var26);
            }
            if (class71.field1462 != -1) {
                class114.method924(class71.field1462, 357, -20556, 453, 496, 2, 17, var26);
            } else if (class83.field1923 != -1) {
                class114.method924(class83.field1923, 357, -20556, 453, 496, 2, 17, var26);
            }
        } else {
            class114.method924(class77.field1694, 0, arg0 ^ 0xFFFFAFB4, 503, 765, 3, 0, var26);
            if (class108.field2451 != -1) {
                class114.method924(class108.field2451, 0, arg0 ^ 0xFFFFAFB4, 503, 765, 3, 0, var26);
            }
        }
        if (class77.field1694 == -1) {
            if (class71.field1460 != -1) {
                class114.method924(class71.field1460, 4, -20556, 338, 516, 0, 4, ~var26);
            } else if (class130.field3058 != -1) {
                class114.method924(class130.field3058, 4, arg0 ^ 0xFFFFAFB4, 338, 516, 0, 4, ~var26);
            }
            if (class132.field3111 != -1) {
                class114.method924(class132.field3111, 205, arg0 ^ 0xFFFFAFB4, 466, 743, 1, 553, ~var26);
            } else if (class52.field1163[class31.field709] != -1) {
                class114.method924(class52.field1163[class31.field709], 205, arg0 - 20556, 466, 743, 1, 553, ~var26);
            }
            if (class71.field1462 != -1) {
                class114.method924(class71.field1462, 357, arg0 - 20556, 453, 496, 2, 17, ~var26);
            } else if (class83.field1923 != -1) {
                class114.method924(class83.field1923, 357, -20556, 453, 496, 2, 17, ~var26);
            }
        } else {
            class114.method924(class77.field1694, 0, -20556, 503, 765, 3, 0, ~var26);
            if (class108.field2451 != -1) {
                class114.method924(class108.field2451, 0, -20556, 503, 765, 3, 0, ~var26);
            }
        }
        class127.method1003((byte) 75);
        if (class22.field525 != -1) {
            int var27 = class22.field525;
            int var28 = class22.field517;
            boolean var29 = class30.method300(0, 0, class73.field1536.field3603[0], 0, 0, true, var28, -119, var27, 0, class73.field1536.field3648[0], 0);
            if (var29) {
                class11.field243 = class86.field1980;
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class83.field1936 = 1;
            }
            class22.field525 = -1;
        }
        if (class42.field976 == 1 && class39.field945 != null) {
            class15.field306 = true;
            class42.field976 = 0;
            class39.field945 = null;
        }
        class134.method1091(arg0);
        if (class77.field1694 == -1) {
            class17.method163(false);
            class84.method700(-1);
            class130.method1069((byte) 67);
        }
        if (class36.field899 == 1 || class42.field976 == 1) {
            class57.field1269++;
        }
        if (class64.field1366 == -1 && class123.field2739 == -1 && class94.field2152 == -1) {
            if (class77.field1692 > 0) {
                class77.field1692--;
            }
        } else if (class74.field1552 > class77.field1692) {
            class77.field1692++;
            if (class77.field1692 == class74.field1552) {
                if (class64.field1366 != -1) {
                    class15.field306 = true;
                }
                if (class123.field2739 != -1) {
                    class137.field3332 = true;
                }
            }
        }
        class39.method352(41);
        if (class31.field733) {
            class46.method405(123);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class102.field2348[var30]++;
        }
        class14.method150(18053);
        int var31 = class75.method619(-125);
        int var32 = class55.method452(20971);
        if (var31 > 4500 && var32 > 4500) {
            class75.field1650 = 250;
            class115.field2598++;
            class21.method191(4000, (byte) -53);
            class132.field3116.method177(6624, 52);
        }
        class98.field2258++;
        if (class98.field2258 > 500) {
            class98.field2258 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class18.field395 += class123.field2726;
            }
            if ((var33 & 0x4) == 4) {
                class112.field2505 += class6.field90;
            }
            if ((var33 & 0x1) == 1) {
                field2771 += class31.field734;
            }
        }
        if (class18.field395 < -55) {
            class123.field2726 = 2;
        }
        if (class112.field2505 < -40) {
            class6.field90 = 1;
        }
        if (class18.field395 > 55) {
            class123.field2726 = -2;
        }
        class51.field1128++;
        if (class51.field1128 > 500) {
            class51.field1128 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class76.field1662 += class123.field2743;
            }
            if ((var34 & 0x1) == 1) {
                class21.field462 += class71.field1457;
            }
        }
        class1.field9++;
        if (class76.field1662 < -20) {
            class123.field2743 = 1;
        }
        if (class112.field2505 > 40) {
            class6.field90 = -1;
        }
        if (class21.field462 < -60) {
            class71.field1457 = 2;
        }
        if (field2771 < -50) {
            class31.field734 = 2;
        }
        if (field2771 > 50) {
            class31.field734 = -2;
        }
        if (class76.field1662 > 10) {
            class123.field2743 = -1;
        }
        if (class21.field462 > 60) {
            class71.field1457 = -2;
        }
        if (class1.field9 > 50) {
            class105.field2388++;
            class132.field3116.method177(6624, 74);
        }
        try {
            if (class139.field3394 != null && class132.field3116.field182 > 0) {
                class139.field3394.method278(class132.field3116.field132, (byte) -100, class132.field3116.field182, 0);
                class132.field3116.field182 = 0;
                class1.field9 = 0;
            }
        } catch (IOException var35) {
            class118.method939(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Z")
    private static final boolean method980(byte arg0) {
        field2759++;
        if (class71.field1483 == 0) {
            if (arg0 != 26) {
                method979(-102);
            }
            return class56.field1252.method657(-57);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lac;B)V")
    public final void method981(class4 arg0, byte arg1) {
        if (arg0.field65 != null) {
            arg0.method22(0);
        }
        arg0.field56 = this.field2768.field56;
        field2762++;
        arg0.field65 = this.field2768;
        if (arg1 < 55) {
            method978(69);
        }
        arg0.field65.field56 = arg0;
        arg0.field56.field65 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Lac;")
    public final class4 method982(int arg0) {
        class4 var2 = this.field2768.field56;
        field2776++;
        if (this.field2768 == var2) {
            return null;
        } else if (arg0 > -33) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method983(byte arg0) {
        field2778 = null;
        field2764 = null;
        field2760 = null;
        field2775 = null;
        int var1 = -19 / ((arg0 + 40) / 41);
        field2767 = null;
        field2773 = null;
        field2761 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILtb;)V")
    public static final void method984(int arg0, class130 arg1) {
        field2780++;
        class96.field2202 = arg1;
        if (arg0 != -8542) {
            method984(14, null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class124() {
        this.field2768.field56 = this.field2768;
        this.field2768.field65 = this.field2768;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Lac;")
    public final class4 method985(byte arg0) {
        if (arg0 != -120) {
            return null;
        }
        field2763++;
        class4 var2 = this.field2768.field56;
        if (this.field2768 == var2) {
            return null;
        } else {
            var2.method22(arg0 + 120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZII)V")
    public static final void method986(int arg0, boolean arg1, int arg2, int arg3) {
        field2766++;
        if (arg1) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class25.field616[arg2][arg0 + var4][arg3 + var7] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class25.field616[arg2][arg0][arg3 + var5] = class25.field616[arg2][arg0 - 1][arg3 + var5];
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class25.field616[arg2][arg0 + var6][arg3] = class25.field616[arg2][arg0 + var6][arg3 - 1];
            }
        }
        if (arg0 > 0 && class25.field616[arg2][arg0 - 1][arg3] != 0) {
            class25.field616[arg2][arg0][arg3] = class25.field616[arg2][arg0 - 1][arg3];
        } else if (arg3 > 0 && class25.field616[arg2][arg0][arg3 - 1] != 0) {
            class25.field616[arg2][arg0][arg3] = class25.field616[arg2][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && class25.field616[arg2][arg0 - 1][arg3 - 1] != 0) {
            class25.field616[arg2][arg0][arg3] = class25.field616[arg2][arg0 - 1][arg3 - 1];
        }
    }
}
