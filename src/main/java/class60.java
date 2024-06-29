import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class60 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lae;")
    public static class6 field1315 = class64.method474(113, "Okay");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1307 = 0;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lae;")
    public static class6 field1312 = class64.method474(112, "mapback");

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lae;")
    public static class6 field1321 = class64.method474(104, ":duelreq:");

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lae;")
    private static class6 field1318 = class64.method474(127, "slide:");

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lae;")
    private static class6 field1317 = class64.method474(118, "Report abuse");

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lae;")
    public static class6 field1323 = field1318;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lae;")
    public static class6 field1311 = field1317;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lsd;")
    public static class114 field1313;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lva;")
    public static class128 field1308;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V", line = 11)
    public static final void method442(int arg0, int arg1, int arg2, int arg3) {
        field1316++;
        if (arg2 == arg3) {
            class111.field2660.method938((byte) 63, 13);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
            class52.field1179++;
        }
        if (arg2 == 2) {
            class111.field2660.method938((byte) 63, 217);
            class70.field1560++;
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 3) {
            class30.field727++;
            class111.field2660.method938((byte) 63, 161);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 4) {
            class118.field2791++;
            class111.field2660.method938((byte) 63, 3);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 5) {
            class111.field2660.method938((byte) 63, 40);
            class111.field2660.method644(arg0, (byte) 38);
            class122.field3007++;
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 6) {
            class8.field164++;
            class111.field2660.method938((byte) 63, 73);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 7) {
            class111.field2660.method938((byte) 63, 57);
            class111.field2660.method644(arg0, (byte) 38);
            class80.field1952++;
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 8) {
            class102.field2401++;
            class111.field2660.method938((byte) 63, 167);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 9) {
            class111.field2660.method938((byte) 63, 28);
            class24.field606++;
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        if (arg2 == 10) {
            class73.field1677++;
            class111.field2660.method938((byte) 63, 8);
            class111.field2660.method644(arg0, (byte) 38);
            class111.field2660.method667((byte) 97, arg1);
        }
        class121 var4 = class75.method602(arg0, arg1, 0);
        if (var4 != null && var4.field2909 != null) {
            class76.method612(arg2, var4.field2909, null, -105, 0, var4, 0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 116)
    public static void method443(int arg0) {
        field1308 = null;
        field1317 = null;
        field1318 = null;
        field1315 = null;
        field1323 = null;
        field1311 = null;
        field1313 = null;
        field1321 = null;
        if (arg0 == 1) {
            field1312 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V", line = 136)
    public static final void method444(int arg0, boolean arg1) {
        if (class12.field229.field1783 >> 7 == class54.field1201 && class12.field229.field1752 >> 7 == class87.field2091) {
            class54.field1201 = 0;
        }
        int var2 = class47.field1065;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 != -18587) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class66 var4;
            int var5;
            if (arg1) {
                var4 = class12.field229;
                var5 = 33538048;
            } else {
                var4 = class20.field387[class4.field47[var3]];
                var5 = class4.field47[var3] << 14;
            }
            if (var4 != null && var4.method9((byte) -77)) {
                var4.field1435 = false;
                int var6 = var4.field1752 >> 7;
                if ((class82.field2017 && class47.field1065 > 50 || class47.field1065 > 200) && !arg1 && var4.field1800 == var4.field1785) {
                    var4.field1435 = true;
                }
                int var7 = var4.field1783 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1455 == null || class5.field61 < var4.field1445 || var4.field1458 <= class5.field61) {
                        if ((var4.field1783 & 0x7F) == 64 && (var4.field1752 & 0x7F) == 64) {
                            if (class38.field877[var7][var6] == class80.field1946) {
                                continue;
                            }
                            class38.field877[var7][var6] = class80.field1946;
                        }
                        var4.field1459 = class20.method193(var4.field1752, 9990, class15.field305, var4.field1783);
                        class81.field1967.method540(class15.field305, var4.field1783, var4.field1752, var4.field1459, 60, var4, var4.field1722, var5, var4.field1778);
                    } else {
                        var4.field1435 = false;
                        var4.field1459 = class20.method193(var4.field1752, 9990, class15.field305, var4.field1783);
                        class81.field1967.method571(class15.field305, var4.field1783, var4.field1752, var4.field1459, 60, var4, var4.field1722, var5, var4.field1442, var4.field1440, var4.field1446, var4.field1457);
                    }
                }
            }
        }
        field1309++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 225)
    public static final void method445(int arg0) {
        field1320++;
        if (class78.field1888 > 1) {
            class78.field1888--;
        }
        if (class32.field775 > 0) {
            class32.field775--;
        }
        if (class121.field2997) {
            class121.field2997 = false;
            class67.method491((byte) 102);
            return;
        }
        for (int var1 = 0; var1 < 100 && class116.method957((byte) -117); var1++) {
        }
        if (class59.field1295 != 30 && class59.field1295 != 35) {
            return;
        }
        if (class114.field2694 && class59.field1295 == 30) {
            class89.field2140 = 0;
            class54.field1198 = 0;
            while (class65.method481(-4)) {
            }
            for (int var2 = 0; var2 < class19.field370.length; var2++) {
                class19.field370[var2] = false;
            }
        }
        class26.method241(-14, 194, class111.field2660);
        Object var3 = class12.field250.field1291;
        synchronized (class12.field250.field1291) {
            if (!class69.field1544) {
                class12.field250.field1293 = 0;
            } else if (class89.field2140 != 0 || class12.field250.field1293 >= 40) {
                class111.field2660.method938((byte) 63, 133);
                class138.field3344++;
                int var4 = 0;
                class111.field2660.method641((byte) -28, 0);
                int var5 = class111.field2660.field1821;
                for (int var6 = 0; class12.field250.field1293 > var6 && class111.field2660.field1821 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class12.field250.field1303[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = class12.field250.field1294[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class12.field250.field1294[var6] == -1 && class12.field250.field1303[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class64.field1400 != var7 || class111.field2682 != var8) {
                        int var10 = var7 - class64.field1400;
                        class64.field1400 = var7;
                        int var11 = var8 - class111.field2682;
                        class111.field2682 = var8;
                        if (class89.field2131 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class111.field2660.method667((byte) 97, (class89.field2131 << 12) - (-(var10 << 6) - var11));
                            class89.field2131 = 0;
                        } else if (class89.field2131 < 8) {
                            class111.field2660.method642(-99, (class89.field2131 << 19) + var9 + 8388608);
                            class89.field2131 = 0;
                        } else {
                            class111.field2660.method644((class89.field2131 << 19) + var9 - 1073741824, (byte) 38);
                            class89.field2131 = 0;
                        }
                    } else if (class89.field2131 < 2047) {
                        class89.field2131++;
                    }
                }
                class111.field2660.method652(class111.field2660.field1821 - var5, -12139);
                if (class12.field250.field1293 > var4) {
                    class12.field250.field1293 -= var4;
                    for (int var12 = 0; var12 < class12.field250.field1293; var12++) {
                        class12.field250.field1303[var12] = class12.field250.field1303[var4 + var12];
                        class12.field250.field1294[var12] = class12.field250.field1294[var4 + var12];
                    }
                } else {
                    class12.field250.field1293 = 0;
                }
            }
        }
        if (class89.field2140 != 0) {
            class54.field1195++;
            long var13 = (class126.field3078 - class54.field1190) / 50L;
            class54.field1190 = class126.field3078;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class116.field2728;
            int var16 = class52.field1170;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = var15 * 765 + var16;
            byte var18 = 0;
            if (class89.field2140 == 2) {
                var18 = 1;
            }
            int var19 = (int) var13;
            class111.field2660.method938((byte) 63, 162);
            class111.field2660.method663((var19 << 20) + (var18 << 19) + var17, -334352184);
        }
        if (class19.field370[96] || class19.field370[97] || class19.field370[98] || class19.field370[99]) {
            class95.field2238 = true;
        }
        if (class52.field1180 > 0) {
            class52.field1180--;
        }
        if (class95.field2238 && class52.field1180 <= 0) {
            class52.field1180 = 20;
            class37.field841++;
            class95.field2238 = false;
            class111.field2660.method938((byte) 63, 66);
            class111.field2660.method668(class21.field506, (byte) -30);
            class111.field2660.method667((byte) 97, field1307);
        }
        if (class79.field1907 && !class6.field112) {
            class6.field112 = true;
            class111.field2660.method938((byte) 63, 207);
            class87.field2092++;
            class111.field2660.method641((byte) -28, 1);
        }
        if (!class79.field1907 && class6.field112) {
            class6.field112 = false;
            class111.field2660.method938((byte) 63, 207);
            class87.field2092++;
            class111.field2660.method641((byte) -28, 0);
        }
        class37.method325((byte) -30);
        if (class59.field1295 != 30 && class59.field1295 != 35) {
            return;
        }
        class63.method459((byte) 92);
        class32.method290((byte) -103);
        class85.field2037++;
        if (class85.field2037 > 750) {
            class67.method491((byte) 48);
            return;
        }
        class54.method420(0);
        class6.method62((byte) -126);
        class122.method1004((byte) 108);
        class82.field2005++;
        if (class7.field161 != 0) {
            class43.field1003 += 20;
            if (class43.field1003 >= 400) {
                class7.field161 = 0;
            }
        }
        if (class40.field886 != 0) {
            class49.field1098++;
            if (class49.field1098 >= 15) {
                if (class40.field886 == 2) {
                    class139.field3380 = true;
                }
                if (class40.field886 == 3) {
                    class20.field427 = true;
                }
                class40.field886 = 0;
            }
        }
        if (class54.field1188 != 0) {
            class121.field2891++;
            if (class117.field2771 > class32.field789 + 5 || class117.field2771 < class32.field789 - 5 || class34.field810 + 5 < class57.field1244 || class57.field1244 < class34.field810 - 5) {
                class12.field248 = true;
            }
            if (class54.field1198 == 0) {
                if (class54.field1188 == 3) {
                    class20.field427 = true;
                }
                if (class54.field1188 == 2) {
                    class139.field3380 = true;
                }
                class54.field1188 = 0;
                if (class12.field248 && class121.field2891 >= 5) {
                    class70.field1550 = -1;
                    class6.method66(33);
                    if (class70.field1550 == class138.field3358 && class87.field2085 != class20.field413) {
                        class35.field818++;
                        class121 var20 = class67.method490((byte) 121, class138.field3358);
                        byte var21 = 0;
                        if (client.field474 == 1 && var20.field2953 == 206) {
                            var21 = 1;
                        }
                        if (var20.field2963[class20.field413] <= 0) {
                            var21 = 0;
                        }
                        if (var20.method999(0)) {
                            int var24 = class87.field2085;
                            int var25 = class20.field413;
                            var20.field2963[var25] = var20.field2963[var24];
                            var20.field2946[var25] = var20.field2946[var24];
                            var20.field2963[var24] = -1;
                            var20.field2946[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class87.field2085;
                            int var23 = class20.field413;
                            while (var22 != var23) {
                                if (var23 < var22) {
                                    var20.method986(var22 - 1, var22, 7211);
                                    var22--;
                                } else if (var22 < var23) {
                                    var20.method986(var22 + 1, var22, 7211);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method986(class20.field413, class87.field2085, 7211);
                        }
                        class111.field2660.method938((byte) 63, 190);
                        class111.field2660.method667((byte) 97, class87.field2085);
                        class111.field2660.method644(class138.field3358, (byte) 38);
                        class111.field2660.method641((byte) -28, var21);
                        class111.field2660.method667((byte) 97, class20.field413);
                    }
                } else if ((class82.field2018 == 1 || class57.method427(class85.field2058 - 1, (byte) -128)) && class85.field2058 > 2) {
                    class64.method475(701);
                } else if (class85.field2058 > 0) {
                    class38.method332(class85.field2058 - 1, 1);
                }
                class89.field2140 = 0;
                class49.field1098 = 10;
            }
        }
        byte var26 = 34;
        if (class72.field1649 == -1) {
            if (class103.field2449 != -1) {
                class122.method1005(338, class103.field2449, 4, 4, -108, var26, 516);
            } else if (class43.field982 != -1) {
                class122.method1005(338, class43.field982, 4, 4, -109, var26, 516);
            }
            if (class126.field3086 != -1) {
                class122.method1005(466, class126.field3086, 553, 205, 89, var26, 743);
            } else if (class102.field2412[class68.field1493] != -1) {
                class122.method1005(466, class102.field2412[class68.field1493], 553, 205, -121, var26, 743);
            }
            if (class102.field2410 != -1) {
                class122.method1005(453, class102.field2410, 17, 357, -115, var26, 496);
            } else if (class117.field2776 != -1) {
                class122.method1005(453, class117.field2776, 17, 357, 79, var26, 496);
            }
        } else {
            class122.method1005(503, class72.field1649, 0, 0, -72, var26, 765);
            if (class32.field801 != -1) {
                class122.method1005(503, class32.field801, 0, 0, 95, var26, 765);
            }
        }
        if (class72.field1649 == -1) {
            if (class103.field2449 != -1) {
                class122.method1005(338, class103.field2449, 4, 4, 68, ~var26, 516);
            } else if (class43.field982 != -1) {
                class122.method1005(338, class43.field982, 4, 4, 122, ~var26, 516);
            }
            if (class126.field3086 != -1) {
                class122.method1005(466, class126.field3086, 553, 205, 100, ~var26, 743);
            } else if (class102.field2412[class68.field1493] != -1) {
                class122.method1005(466, class102.field2412[class68.field1493], 553, 205, 105, ~var26, 743);
            }
            if (class102.field2410 != -1) {
                class122.method1005(453, class102.field2410, 17, 357, -115, ~var26, 496);
            } else if (class117.field2776 != -1) {
                class122.method1005(453, class117.field2776, 17, 357, 125, ~var26, 496);
            }
        } else {
            class122.method1005(503, class72.field1649, 0, 0, -81, ~var26, 765);
            if (class32.field801 != -1) {
                class122.method1005(503, class32.field801, 0, 0, 72, ~var26, 765);
            }
        }
        class122.method1003((byte) 22);
        if (class71.field1594 != -1) {
            int var27 = class71.field1589;
            int var28 = class71.field1594;
            boolean var29 = class43.method358(24134, 0, var27, 0, 0, 0, 0, true, 0, class12.field229.field1796[0], class12.field229.field1726[0], var28);
            if (var29) {
                class7.field161 = 1;
                class43.field1003 = 0;
                class75.field1687 = class116.field2728;
                class35.field827 = class52.field1170;
            }
            class71.field1594 = -1;
        }
        if (class89.field2140 == 1 && class34.field803 != null) {
            class89.field2140 = 0;
            class34.field803 = null;
            class20.field427 = true;
        }
        class68.method496(113);
        if (class72.field1649 == -1) {
            class125.method1023(50);
            class88.method747(-124);
            class50.method397((byte) -123);
        }
        if (class54.field1198 == 1 || class89.field2140 == 1) {
            class58.field1250++;
        }
        if (class118.field2807 == -1 && class96.field2294 == -1 && class51.field1144 == -1) {
            if (class111.field2679 > 0) {
                class111.field2679--;
            }
        } else if (class54.field1206 > class111.field2679) {
            class111.field2679++;
            if (class54.field1206 == class111.field2679) {
                if (class96.field2294 != -1) {
                    class139.field3380 = true;
                }
                if (class118.field2807 != -1) {
                    class20.field427 = true;
                }
            }
        }
        class6.method33(126);
        if (class47.field1042) {
            class41.method347(2048);
        }
        if (arg0 >= -20) {
            return;
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class7.field156[var30]++;
        }
        class77.method650(103);
        int var31 = class56.method426(-2);
        int var32 = class85.method722((byte) 49);
        if (var31 > 4500 && var32 > 4500) {
            class75.field1708++;
            class32.field775 = 250;
            class126.method1029((byte) 106, 4000);
            class111.field2660.method938((byte) 63, 192);
        }
        class70.field1570++;
        class52.field1176++;
        class129.field3123++;
        if (class129.field3123 > 500) {
            class129.field3123 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x1) == 1) {
                class25.field627 += class62.field1361;
            }
            if ((var33 & 0x4) == 4) {
                class72.field1643 += class138.field3366;
            }
            if ((var33 & 0x2) == 2) {
                class77.field1841 += class85.field2039;
            }
        }
        if (class52.field1176 > 500) {
            class52.field1176 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class78.field1898 += class67.field1489;
            }
            if ((var34 & 0x1) == 1) {
                class87.field2083 += class58.field1254;
            }
        }
        if (class78.field1898 < -20) {
            class67.field1489 = 1;
        }
        if (class87.field2083 < -60) {
            class58.field1254 = 2;
        }
        if (class25.field627 < -50) {
            class62.field1361 = 2;
        }
        if (class77.field1841 < -55) {
            class85.field2039 = 2;
        }
        if (class77.field1841 > 55) {
            class85.field2039 = -2;
        }
        if (class87.field2083 > 60) {
            class58.field1254 = -2;
        }
        if (class72.field1643 < -40) {
            class138.field3366 = 1;
        }
        if (class78.field1898 > 10) {
            class67.field1489 = -1;
        }
        if (class72.field1643 > 40) {
            class138.field3366 = -1;
        }
        if (class25.field627 > 50) {
            class62.field1361 = -2;
        }
        if (class70.field1570 > 50) {
            field1306++;
            class111.field2660.method938((byte) 63, 86);
        }
        try {
            if (class67.field1491 != null && class111.field2660.field1821 > 0) {
                class67.field1491.method211(-1, class111.field2660.field1858, class111.field2660.field1821, 0);
                class70.field1570 = 0;
                class111.field2660.field1821 = 0;
            }
        } catch (IOException var35) {
            class67.method491((byte) 89);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lbf;BLbf;)V", line = 897)
    public static final void method448(class14 arg0, byte arg1, class14 arg2) {
        if (arg1 != 9) {
            method444(-27, false);
        }
        class96.field2278 = arg0;
        class77.field1844 = arg2;
        field1314++;
        class92.field2203 = class77.field1844.method153(3, (byte) -4);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Color;ILae;I)V", line = 923)
    public static final void method449(Color arg0, int arg1, class6 arg2, int arg3) {
        if (arg1 != 28366) {
            return;
        }
        field1322++;
        try {
            Graphics var4 = class70.field1564.getGraphics();
            if (class26.field664 == null) {
                class26.field664 = new Font("Helvetica", 1, 13);
                class43.field988 = class70.field1564.getFontMetrics(class26.field664);
            }
            if (class32.field772) {
                class32.field772 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class117.field2766, class95.field2253);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class103.field2433 == null) {
                    class103.field2433 = class70.field1564.createImage(304, 34);
                }
                Graphics var5 = class103.field2433.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class26.field664);
                var5.setColor(Color.white);
                arg2.method50(22, (304 - arg2.method37(class43.field988, -11)) / 2, (byte) 13, var5);
                var4.drawImage(class103.field2433, class117.field2766 / 2 - 152, class95.field2253 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class117.field2766 / 2 - 152;
                int var7 = class95.field2253 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class26.field664);
                var4.setColor(Color.white);
                arg2.method50(var7 + 22, var6 + (-arg2.method37(class43.field988, -11) + 304) / 2, (byte) 13, var4);
            }
        } catch (Exception var9) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 998)
    public static final void method450(boolean arg0) {
        class7.field151.method129(27392);
        class118.field2794.method129(27392);
        field1319++;
        if (arg0) {
            method443(53);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 1019)
    public static int method451(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method441(int arg0, Component arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method446(Component arg0, byte arg1);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public abstract int method447(int arg0);
}
