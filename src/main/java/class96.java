import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class96 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2163 = -1;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public static boolean field2165 = false;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lkc;")
    public static class67 field2166 = class19.method144(" Sekunde(Xn(Y -Ubertragen)3", 81);

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lkc;")
    public static class67 field2173 = class19.method144("@or2@", 92);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2169 = 255;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lkc;")
    public static class67 field2168 = null;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lkc;")
    public static class67 field2170 = class19.method144("Okay", 115);

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lkc;")
    private static class67 field2172 = class19.method144("Your ignore list is full)3 Max of 100 hit", 115);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lkc;")
    public static class67 field2171 = field2172;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lab;")
    public static class3 field2175;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    public static int[] field2167;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B", line = 24)
    public static final synchronized byte[] method745(int arg0, int arg1) {
        field2176++;
        if (arg1 < 38) {
            return null;
        } else if (arg0 == 100 && class109.field2475 > 0) {
            byte[] var2 = class61.field1443[--class109.field2475];
            class61.field1443[class109.field2475] = null;
            return var2;
        } else if (arg0 == 5000 && class77.field1832 > 0) {
            byte[] var3 = class19.field386[--class77.field1832];
            class19.field386[class77.field1832] = null;
            return var3;
        } else if (arg0 == 30000 && class66.field1552 > 0) {
            byte[] var4 = class70.field1673[--class66.field1552];
            class70.field1673[class66.field1552] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 93)
    public static void method746(int arg0) {
        field2167 = null;
        field2173 = null;
        field2170 = null;
        field2168 = null;
        if (arg0 >= -94) {
            method748(-42);
        }
        field2171 = null;
        field2172 = null;
        field2175 = null;
        field2166 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V", line = 120)
    private static final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2177++;
        for (class55 var5 = (class55) class25.field527.method83(arg0 + 64); var5 != null; var5 = (class55) class25.field527.method81(-57)) {
            if (var5.field1340 != -1 || var5.field1328 != null) {
                int var6 = 0;
                if (arg3 > var5.field1315) {
                    var6 += arg3 - var5.field1315;
                } else if (arg3 < var5.field1329) {
                    var6 += var5.field1329 - arg3;
                }
                if (arg1 > var5.field1347) {
                    var6 += arg1 - var5.field1347;
                } else if (var5.field1317 > arg1) {
                    var6 += var5.field1317 - arg1;
                }
                if (var6 - 64 > var5.field1338 || class54.field1298 == 0 || var5.field1320 != arg4) {
                    if (var5.field1352 != null) {
                        class121.field2836.method1055(var5.field1352);
                        var5.field1352 = null;
                    }
                    if (var5.field1324 != null) {
                        class121.field2836.method1055(var5.field1324);
                        var5.field1324 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1338 - var6) * class54.field1298 / var5.field1338;
                    if (var5.field1352 != null) {
                        var5.field1352.method218(var7);
                    } else if (var5.field1340 >= 0) {
                        class8 var8 = class8.method73(class71.field1684, var5.field1340, 0);
                        if (var8 != null) {
                            class16 var9 = var8.method75().method136(client.field480);
                            class27 var10 = class27.method211(var9, 100, var7);
                            var10.method209(-1);
                            class121.field2836.method1059(var10);
                            var5.field1352 = var10;
                        }
                    }
                    if (var5.field1324 != null) {
                        var5.field1324.method218(var7);
                        if (!var5.field1324.method222()) {
                            var5.field1324 = null;
                        }
                    } else if (var5.field1328 != null && (var5.field1319 -= arg2) <= 0) {
                        int var11 = (int) ((double) var5.field1328.length * Math.random());
                        class8 var12 = class8.method73(class71.field1684, var5.field1328[var11], 0);
                        if (var12 != null) {
                            class16 var13 = var12.method75().method136(client.field480);
                            class27 var14 = class27.method211(var13, 100, var7);
                            var14.method209(0);
                            class121.field2836.method1059(var14);
                            var5.field1319 = (int) ((double) (var5.field1350 - var5.field1325) * Math.random()) + var5.field1325;
                            var5.field1324 = var14;
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            method747(-1, 77, 108, 119, -50);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 264)
    public static final void method748(int arg0) {
        field2164++;
        if (class130.field3045) {
            class130.field3045 = false;
            class129.method994((byte) 98);
            field2165 = true;
            class59.field1386 = true;
            class121.field2849 = true;
            class138.field3304 = true;
        }
        class83.method648(arg0 ^ 0xFFFFFF97);
        if (class90.field2066 && class31.field663 == 1) {
            class121.field2849 = true;
        }
        if (class114.field2671 != -1) {
            boolean var1 = class81.method637(0, class114.field2671);
            if (var1) {
                class121.field2849 = true;
            }
        }
        if (~class25.field533 == arg0) {
            class121.field2849 = true;
        }
        if (class75.field1796 == 2) {
            class121.field2849 = true;
        }
        if (class121.field2849) {
            class121.field2849 = false;
            class133.method1025((byte) 9);
        }
        if (class63.field1487 == -1) {
            class101.field2281.field806 = class104.field2342 - class112.field2581 - 77;
            if (class138.field3298 > 17 && class138.field3298 < 560 && class80.field1889 > 332) {
                class133.method1027(class80.field1889 - 357, class138.field3298 - 17, (byte) 58, 463, -1, class101.field2281, 77, class104.field2342, 0);
            }
            int var2 = class104.field2342 - class101.field2281.field806 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class104.field2342 - 77 < var2) {
                var2 = class104.field2342 - 77;
            }
            if (class112.field2581 != var2) {
                class112.field2581 = var2;
                class138.field3304 = true;
            }
        }
        if (class63.field1487 == -1 && class41.field1008 == 3) {
            class101.field2281.field806 = class127.field2953;
            int var3 = class141.field3388 * 14 + 7;
            if (class138.field3298 > 17 && class138.field3298 < 560 && class80.field1889 > 332) {
                class133.method1027(class80.field1889 - 357, class138.field3298 + -17, (byte) 100, 463, -1, class101.field2281, 77, var3, 0);
            }
            int var4 = class101.field2281.field806;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class127.field2953 != var4) {
                class138.field3304 = true;
                class127.field2953 = var4;
            }
        }
        if (class63.field1487 != -1) {
            boolean var5 = class81.method637(0, class63.field1487);
            if (var5) {
                class138.field3304 = true;
            }
        }
        if (class25.field533 == 3) {
            class138.field3304 = true;
        }
        if (class75.field1796 == 3) {
            class138.field3304 = true;
        }
        if (class109.field2480 != null) {
            class138.field3304 = true;
        }
        if (class90.field2066 && class31.field663 == 2) {
            class138.field3304 = true;
        }
        if (class138.field3304) {
            class138.field3304 = false;
            class137.method1063((byte) 84);
        }
        class18.method143(false);
        if (class48.field1158 != -1) {
            field2165 = true;
        }
        if (field2165) {
            if (class48.field1158 != -1 && class48.field1158 == class131.field3089) {
                class69.field1631++;
                class48.field1158 = -1;
                class54.field1295.method713(503, 34);
                class54.field1295.method1115((byte) 49, class131.field3089);
            }
            field2165 = false;
            class111.field2542 = true;
            class102.method780(class135.field3243 % 20 >= 10 ? class48.field1158 : -1, class114.field2671 == -1, 5381, class122.field2894, class131.field3089);
        }
        if (class59.field1386) {
            class111.field2542 = true;
            class59.field1386 = false;
            class65.method501(-1, class58.field1375, class14.field301, class20.field410, class4.field93);
        }
        method747(0, class69.field1640.field1190, class121.field2830, class69.field1640.field1260, class112.field2593);
        class121.field2830 = 0;
    }
}
