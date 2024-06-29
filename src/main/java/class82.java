import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class82 extends class156 {

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1377 = 1;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lmb;")
    public static class132 field1382 = class166.method1092("<)4col> x", 118);

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lmb;")
    public static class132 field1381 = class166.method1092("overlay2)3dat", 121);

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static volatile int field1384 = 0;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Lnb;")
    public static class143 field1383;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Lpb;")
    public static class165 field1385;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lii;")
    private static class96 field1380;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "[Lhh;")
    public static class85[] field1378;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method500(int arg0) {
        field1379++;
        if (class69.field1147 != null) {
            class17 var1 = class69.field1147;
            synchronized (class69.field1147) {
                class69.field1147 = null;
            }
        }
        int var2 = 38 / ((arg0 + 46) / 34);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static void method501(int arg0) {
        field1378 = null;
        field1382 = null;
        field1383 = null;
        field1385 = null;
        field1381 = null;
        field1380 = null;
        if (arg0 != 2) {
            field1381 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILld;I)V")
    public static final void method502(int arg0, class123 arg1, int arg2) {
        field1386++;
        Object[] var3 = arg1.field2310;
        int var4 = (Integer) var3[0];
        class134 var5 = class95.method587(-2, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class19.field284 = arg2;
        int[] var7 = var5.field2517;
        int[] var8 = var5.field2521;
        int var9 = 0;
        byte var10 = -1;
        int var11 = -1;
        try {
            class151.field2762 = new class132[var5.field2522];
            class15.field230 = new int[var5.field2523];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field2305;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field2308;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field2299 == null ? -1 : arg1.field2299.field1794;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field2307;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field2299 == null ? -1 : arg1.field2299.field1743;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field2298 == null ? -1 : arg1.field2298.field1794;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field2298 == null ? -1 : arg1.field2298.field1743;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field2304;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field2302;
                    }
                    class15.field230[var12++] = var16;
                } else if (var3[var14] instanceof class132) {
                    class132 var15 = (class132) var3[var14];
                    if (var15.method894((byte) -115, class171.field3193)) {
                        var15 = arg1.field2311;
                    }
                    class151.field2762[var13++] = var15;
                }
            }
            int var17 = 0;
            label2418: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var365 = var7[var11];
                if (var365 < 100) {
                    if (var365 == 0) {
                        class195.field3623[var6++] = var8[var11];
                        continue;
                    }
                    if (var365 == 1) {
                        int var18 = var8[var11];
                        class195.field3623[var6++] = class77.field1315[var18];
                        continue;
                    }
                    if (var365 == 2) {
                        int var19 = var8[var11];
                        var6--;
                        class77.field1315[var19] = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 3) {
                        class57.field973[var9++] = var5.field2520[var11];
                        continue;
                    }
                    if (var365 == 6) {
                        var11 += var8[var11];
                        continue;
                    }
                    if (var365 == 7) {
                        var6 -= 2;
                        if (class195.field3623[var6 + 1] != class195.field3623[var6]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 8) {
                        var6 -= 2;
                        if (class195.field3623[var6 + 1] == class195.field3623[var6]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 9) {
                        var6 -= 2;
                        if (class195.field3623[var6] < class195.field3623[var6 + 1]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 10) {
                        var6 -= 2;
                        if (class195.field3623[var6 + 1] < class195.field3623[var6]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 21) {
                        if (class19.field284 == 0) {
                            return;
                        }
                        class101 var20 = class34.field550[--class19.field284];
                        class15.field230 = var20.field1891;
                        var5 = var20.field1892;
                        class151.field2762 = var20.field1890;
                        var7 = var5.field2517;
                        var8 = var5.field2521;
                        var11 = var20.field1894;
                        continue;
                    }
                    if (var365 == 25) {
                        int var21 = var8[var11];
                        class195.field3623[var6++] = class96.method592((byte) -107, var21);
                        continue;
                    }
                    if (var365 == 27) {
                        int var22 = var8[var11];
                        var6--;
                        class30.method217((byte) -99, class195.field3623[var6], var22);
                        continue;
                    }
                    if (var365 == 31) {
                        var6 -= 2;
                        if (class195.field3623[var6 + 1] >= class195.field3623[var6]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 32) {
                        var6 -= 2;
                        if (class195.field3623[var6 + 1] <= class195.field3623[var6]) {
                            var11 += var8[var11];
                        }
                        continue;
                    }
                    if (var365 == 33) {
                        class195.field3623[var6++] = class15.field230[var8[var11]];
                        continue;
                    }
                    int var10001;
                    if (var365 == 34) {
                        var10001 = var8[var11];
                        var6--;
                        class15.field230[var10001] = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 35) {
                        class57.field973[var9++] = class151.field2762[var8[var11]];
                        continue;
                    }
                    if (var365 == 36) {
                        var10001 = var8[var11];
                        var9--;
                        class151.field2762[var10001] = class57.field973[var9];
                        continue;
                    }
                    if (var365 == 37) {
                        int var23 = var8[var11];
                        var9 -= var23;
                        class132 var24 = class70.method430(var23, (byte) -14, var9, class57.field973);
                        class57.field973[var9++] = var24;
                        continue;
                    }
                    if (var365 == 38) {
                        var6--;
                        continue;
                    }
                    if (var365 == 39) {
                        var9--;
                        continue;
                    }
                    if (var365 == 40) {
                        int var25 = var8[var11];
                        class134 var26 = class95.method587(-2, var25);
                        class132[] var27 = new class132[var26.field2522];
                        int[] var28 = new int[var26.field2523];
                        for (int var29 = 0; var29 < var26.field2530; var29++) {
                            var28[var29] = class195.field3623[var29 + var6 - var26.field2530];
                        }
                        for (int var30 = 0; var30 < var26.field2527; var30++) {
                            var27[var30] = class57.field973[var9 + var30 - var26.field2527];
                        }
                        var6 -= var26.field2530;
                        var9 -= var26.field2527;
                        class101 var31 = new class101();
                        var31.field1892 = var5;
                        var31.field1890 = class151.field2762;
                        var31.field1894 = var11;
                        var31.field1891 = class15.field230;
                        if (class34.field550.length <= class19.field284) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class34.field550[class19.field284++] = var31;
                        var7 = var26.field2517;
                        var11 = -1;
                        class15.field230 = var28;
                        class151.field2762 = var27;
                        var8 = var26.field2521;
                        continue;
                    }
                    if (var365 == 42) {
                        class195.field3623[var6++] = class135.field2543[var8[var11]];
                        continue;
                    }
                    if (var365 == 43) {
                        var10001 = var8[var11];
                        var6--;
                        class135.field2543[var10001] = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 44) {
                        int var32 = var8[var11] >> 16;
                        int var33 = var8[var11] & 0xFFFF;
                        var6--;
                        int var34 = class195.field3623[var6];
                        if (var34 >= 0 && var34 <= 5000) {
                            class234.field4211[var32] = var34;
                            byte var35 = -1;
                            if (var33 == 105) {
                                var35 = 0;
                            }
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var34) {
                                    continue label2418;
                                }
                                class16.field241[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 45) {
                        int var37 = var8[var11];
                        var6--;
                        int var38 = class195.field3623[var6];
                        if (var38 >= 0 && class234.field4211[var37] > var38) {
                            class195.field3623[var6++] = class16.field241[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 46) {
                        int var39 = var8[var11];
                        var6 -= 2;
                        int var40 = class195.field3623[var6];
                        if (var40 >= 0 && class234.field4211[var39] > var40) {
                            class16.field241[var39][var40] = class195.field3623[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 47) {
                        class132 var41 = class101.field1901[var8[var11]];
                        if (var41 == null) {
                            var41 = class189.field3496;
                        }
                        class57.field973[var9++] = var41;
                        continue;
                    }
                    if (var365 == 48) {
                        var10001 = var8[var11];
                        var9--;
                        class101.field1901[var10001] = class57.field973[var9];
                        continue;
                    }
                    if (var365 == 51) {
                        class122 var42 = var5.field2532[var8[var11]];
                        var6--;
                        class171 var43 = (class171) var42.method806(-1, (long) class195.field3623[var6]);
                        if (var43 != null) {
                            var11 += var43.field3189;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var8[var11] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var365 < 300) {
                    if (var365 == 100) {
                        var6 -= 3;
                        int var345 = class195.field3623[var6 + 1];
                        int var346 = class195.field3623[var6];
                        int var347 = class195.field3623[var6 + 2];
                        if (var345 == 0) {
                            throw new RuntimeException();
                        }
                        class96 var348 = class158.method1029((byte) -117, var346);
                        if (var348.field1770 == null) {
                            var348.field1770 = new class96[var347 + 1];
                        }
                        if (var347 >= var348.field1770.length) {
                            class96[] var349 = new class96[var347 + 1];
                            for (int var350 = 0; var350 < var348.field1770.length; var350++) {
                                var349[var350] = var348.field1770[var350];
                            }
                            var348.field1770 = var349;
                        }
                        if (var347 > 0 && var348.field1770[var347 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var347 - 1));
                        }
                        class96 var351 = new class96();
                        var351.field1760 = var345;
                        var351.field1743 = var347;
                        var351.field1776 = var351.field1794 = var348.field1794;
                        var351.field1766 = true;
                        var348.field1770[var347] = var351;
                        if (var44) {
                            class101.field1898 = var351;
                        } else {
                            field1380 = var351;
                        }
                        class183.method1174(var348, 16235);
                        continue;
                    }
                    if (var365 == 101) {
                        class96 var352 = var44 ? class101.field1898 : field1380;
                        if (var352.field1743 == -1) {
                            if (var44) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class96 var353 = class158.method1029((byte) -99, var352.field1794);
                        var353.field1770[var352.field1743] = null;
                        class183.method1174(var353, 16235);
                        continue;
                    }
                    if (var365 == 102) {
                        var6--;
                        class96 var354 = class158.method1029((byte) -121, class195.field3623[var6]);
                        var354.field1770 = null;
                        class183.method1174(var354, arg2 ^ 0x3F6B);
                        continue;
                    }
                    if (var365 == 200) {
                        var6 -= 2;
                        int var355 = class195.field3623[var6];
                        int var356 = class195.field3623[var6 + 1];
                        class96 var357 = class102.method631((byte) 72, var356, var355);
                        if (var357 != null && var356 != -1) {
                            class195.field3623[var6++] = 1;
                            if (var44) {
                                class101.field1898 = var357;
                            } else {
                                field1380 = var357;
                            }
                            continue;
                        }
                        class195.field3623[var6++] = 0;
                        continue;
                    }
                    if (var365 == 201) {
                        var6--;
                        int var358 = class195.field3623[var6];
                        class96 var359 = class158.method1029((byte) -101, var358);
                        if (var359 == null) {
                            class195.field3623[var6++] = 0;
                        } else {
                            class195.field3623[var6++] = 1;
                            if (var44) {
                                class101.field1898 = var359;
                            } else {
                                field1380 = var359;
                            }
                        }
                        continue;
                    }
                } else if (var365 < 500) {
                    if (var365 == 403) {
                        var6 -= 2;
                        int var340 = class195.field3623[var6];
                        int var341 = class195.field3623[var6 + 1];
                        if (var340 >= 7) {
                            var340 -= 7;
                        }
                        class210.field3854.field2880.method352(var340, var341, -1);
                        continue;
                    }
                    if (var365 == 404) {
                        var6 -= 2;
                        int var342 = class195.field3623[var6];
                        int var343 = class195.field3623[var6 + 1];
                        class210.field3854.field2880.method360(var342, -125, var343);
                        continue;
                    }
                    if (var365 == 410) {
                        var6--;
                        boolean var344 = class195.field3623[var6] != 0;
                        class210.field3854.field2880.method361(45, var344);
                        continue;
                    }
                } else if (var365 >= 1000 && var365 < 1100 || !(var365 < 2000 || var365 >= 2100)) {
                    class96 var338;
                    if (var365 < 2000) {
                        var338 = var44 ? class101.field1898 : field1380;
                    } else {
                        var6--;
                        var338 = class158.method1029((byte) -125, class195.field3623[var6]);
                        var365 -= 1000;
                    }
                    if (var365 == 1000) {
                        var6 -= 2;
                        var338.field1746 = 0;
                        var338.field1752 = var338.field1751 = class195.field3623[var6];
                        var338.field1840 = 0;
                        var338.field1834 = var338.field1709 = class195.field3623[var6 + 1];
                        class183.method1174(var338, 16235);
                        continue;
                    }
                    if (var365 == 1001) {
                        var338.field1742 = 0;
                        var6 -= 2;
                        var338.field1830 = var338.field1715 = class195.field3623[var6];
                        var338.field1788 = 0;
                        var338.field1827 = 0;
                        var338.field1740 = var338.field1697 = class195.field3623[var6 + 1];
                        var338.field1717 = 0;
                        class183.method1174(var338, arg2 + 16235);
                        if (var338.field1760 == 0) {
                            class235.method1486(var338, -28715);
                        }
                        continue;
                    }
                    if (var365 == 1003) {
                        var6--;
                        boolean var339 = class195.field3623[var6] == 1;
                        if (var338.field1806 != var339) {
                            var338.field1806 = var339;
                            class183.method1174(var338, arg2 + 16235);
                        }
                        continue;
                    }
                } else if (var365 >= 1100 && var365 < 1200 || !(var365 < 2100 || var365 >= 2200)) {
                    class96 var45;
                    if (var365 < 2000) {
                        var45 = var44 ? class101.field1898 : field1380;
                    } else {
                        var365 -= 1000;
                        var6--;
                        var45 = class158.method1029((byte) -124, class195.field3623[var6]);
                    }
                    if (var365 == 1100) {
                        var6 -= 2;
                        var45.field1800 = class195.field3623[var6];
                        if (var45.field1800 > var45.field1744 - var45.field1830) {
                            var45.field1800 = var45.field1744 - var45.field1830;
                        }
                        if (var45.field1800 < 0) {
                            var45.field1800 = 0;
                        }
                        var45.field1695 = class195.field3623[var6 + 1];
                        if (var45.field1833 - var45.field1740 < var45.field1695) {
                            var45.field1695 = var45.field1833 - var45.field1740;
                        }
                        if (var45.field1695 < 0) {
                            var45.field1695 = 0;
                        }
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1101) {
                        var6--;
                        var45.field1739 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1102) {
                        var6--;
                        var45.field1772 = class195.field3623[var6] == 1;
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1103) {
                        var6--;
                        var45.field1842 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1104) {
                        var6--;
                        var45.field1755 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1105) {
                        var6--;
                        var45.field1799 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1106) {
                        var6--;
                        var45.field1835 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1107) {
                        var6--;
                        var45.field1785 = class195.field3623[var6] == 1;
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1108) {
                        var45.field1734 = 1;
                        var6--;
                        var45.field1780 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1109) {
                        var6 -= 6;
                        var45.field1765 = class195.field3623[var6];
                        var45.field1819 = class195.field3623[var6 + 1];
                        var45.field1750 = class195.field3623[var6 + 2];
                        var45.field1741 = class195.field3623[var6 + 3];
                        var45.field1730 = class195.field3623[var6 + 4];
                        var45.field1771 = class195.field3623[var6 + 5];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1110) {
                        var6--;
                        int var46 = class195.field3623[var6];
                        if (var45.field1710 != var46) {
                            var45.field1710 = var46;
                            var45.field1758 = 0;
                            var45.field1813 = 0;
                            class183.method1174(var45, 16235);
                        }
                        continue;
                    }
                    if (var365 == 1111) {
                        var6--;
                        var45.field1690 = class195.field3623[var6] == 1;
                        class183.method1174(var45, arg2 + 16235);
                        continue;
                    }
                    if (var365 == 1112) {
                        var9--;
                        class132 var47 = class57.field973[var9];
                        if (!var47.method894((byte) -126, var45.field1773)) {
                            var45.field1773 = var47;
                            class183.method1174(var45, arg2 + 16235);
                        }
                        continue;
                    }
                    if (var365 == 1113) {
                        var6--;
                        var45.field1802 = class195.field3623[var6];
                        class183.method1174(var45, arg2 ^ 0x3F6B);
                        continue;
                    }
                    if (var365 == 1114) {
                        var6 -= 3;
                        var45.field1798 = class195.field3623[var6];
                        var45.field1817 = class195.field3623[var6 + 1];
                        var45.field1706 = class195.field3623[var6 + 2];
                        class183.method1174(var45, arg2 + 16235);
                        continue;
                    }
                    if (var365 == 1115) {
                        var6--;
                        var45.field1793 = class195.field3623[var6] == 1;
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1116) {
                        var6--;
                        var45.field1809 = class195.field3623[var6];
                        class183.method1174(var45, arg2 ^ 0x3F6B);
                        continue;
                    }
                    if (var365 == 1117) {
                        var6--;
                        var45.field1688 = class195.field3623[var6];
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1118) {
                        var6--;
                        var45.field1786 = class195.field3623[var6] == 1;
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1119) {
                        var6--;
                        var45.field1748 = class195.field3623[var6] == 1;
                        class183.method1174(var45, 16235);
                        continue;
                    }
                    if (var365 == 1120) {
                        var6 -= 2;
                        var45.field1744 = class195.field3623[var6];
                        var45.field1833 = class195.field3623[var6 + 1];
                        class183.method1174(var45, 16235);
                        if (var45.field1760 == 0) {
                            class235.method1486(var45, arg2 - 28715);
                        }
                        continue;
                    }
                } else if (var365 >= 1200 && var365 < 1300 || !(var365 < 2200 || var365 >= 2300)) {
                    class96 var334;
                    if (var365 >= 2000) {
                        var365 -= 1000;
                        var6--;
                        var334 = class158.method1029((byte) -126, class195.field3623[var6]);
                    } else {
                        var334 = var44 ? class101.field1898 : field1380;
                    }
                    class183.method1174(var334, 16235);
                    if (var365 == 1200 || var365 == 1205) {
                        var6 -= 2;
                        int var335 = class195.field3623[var6];
                        int var336 = class195.field3623[var6 + 1];
                        if (var335 == -1) {
                            var334.field1780 = -1;
                            var334.field1734 = 1;
                            var334.field1821 = -1;
                        } else {
                            var334.field1774 = var336;
                            var334.field1821 = var335;
                            class243 var337 = class58.method389(arg2, var335);
                            var334.field1819 = var337.field4424;
                            var334.field1730 = var337.field4392;
                            if (var365 == 1205) {
                                var334.field1724 = false;
                            } else {
                                var334.field1724 = true;
                            }
                            var334.field1765 = var337.field4393;
                            var334.field1771 = var337.field4435;
                            var334.field1741 = var337.field4413;
                            if (var334.field1827 > 0) {
                                var334.field1771 = var334.field1771 * 32 / var334.field1827;
                            } else if (var334.field1715 > 0) {
                                var334.field1771 = var334.field1771 * 32 / var334.field1715;
                            }
                            var334.field1750 = var337.field4431;
                        }
                        continue;
                    }
                    if (var365 == 1201) {
                        var334.field1734 = 2;
                        var6--;
                        var334.field1780 = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 1202) {
                        var334.field1734 = 3;
                        var334.field1780 = class210.field3854.field2880.method355(-19243);
                        continue;
                    }
                    if (var365 == 1203) {
                        var334.field1734 = 6;
                        var6--;
                        var334.field1780 = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 1204) {
                        var334.field1734 = 5;
                        var6--;
                        var334.field1780 = class195.field3623[var6];
                        continue;
                    }
                } else if (var365 >= 1300 && var365 < 1400 || var365 >= 2300 && var365 < 2400) {
                    class96 var48;
                    if (var365 < 2000) {
                        var48 = var44 ? class101.field1898 : field1380;
                    } else {
                        var6--;
                        var48 = class158.method1029((byte) -116, class195.field3623[var6]);
                        var365 -= 1000;
                    }
                    if (var365 == 1300) {
                        var6--;
                        int var49 = class195.field3623[var6] - 1;
                        if (var49 >= 0 && var49 <= 9) {
                            var9--;
                            var48.method593(var49, false, class57.field973[var9]);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var365 == 1301) {
                        var6 -= 2;
                        int var50 = class195.field3623[var6 + 1];
                        int var51 = class195.field3623[var6];
                        var48.field1816 = class102.method631((byte) 72, var50, var51);
                        continue;
                    }
                    if (var365 == 1302) {
                        var6--;
                        var48.field1759 = class195.field3623[var6] == 1;
                        continue;
                    }
                    if (var365 == 1303) {
                        var6--;
                        var48.field1783 = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 1304) {
                        var6--;
                        var48.field1761 = class195.field3623[var6];
                        continue;
                    }
                    if (var365 == 1305) {
                        var9--;
                        var48.field1738 = class57.field973[var9];
                        continue;
                    }
                    if (var365 == 1306) {
                        var9--;
                        var48.field1720 = class57.field973[var9];
                        continue;
                    }
                    if (var365 == 1307) {
                        var48.field1723 = null;
                        continue;
                    }
                } else {
                    if (var365 >= 1400 && var365 < 1500 || var365 >= 2400 && var365 < 2500) {
                        class96 var52;
                        if (var365 < 2000) {
                            var52 = var44 ? class101.field1898 : field1380;
                        } else {
                            var6--;
                            var52 = class158.method1029((byte) -99, class195.field3623[var6]);
                            var365 -= 1000;
                        }
                        int[] var53 = null;
                        var9--;
                        class132 var54 = class57.field973[var9];
                        if (var54.method902((byte) -4) > 0 && var54.method881(var54.method902((byte) -4) - 1, arg2 + 70) == 89) {
                            var6--;
                            int var55 = class195.field3623[var6];
                            if (var55 > 0) {
                                var53 = new int[var55];
                                while (var55-- > 0) {
                                    var6--;
                                    var53[var55] = class195.field3623[var6];
                                }
                            }
                            var54 = var54.method886(-1, 0, var54.method902((byte) -4) - 1);
                        }
                        Object[] var56 = new Object[var54.method902((byte) -4) + 1];
                        for (int var57 = var56.length - 1; var57 >= 1; var57--) {
                            if (var54.method881(var57 - 1, 70) == 115) {
                                var9--;
                                var56[var57] = class57.field973[var9];
                            } else {
                                var6--;
                                var56[var57] = Integer.valueOf(class195.field3623[var6]);
                            }
                        }
                        var6--;
                        int var58 = class195.field3623[var6];
                        if (var58 == -1) {
                            var56 = null;
                        } else {
                            var56[0] = Integer.valueOf(var58);
                        }
                        if (var365 == 1424) {
                            var52.field1756 = var56;
                        }
                        if (var365 == 1411) {
                            var52.field1832 = var56;
                        }
                        if (var365 == 1414) {
                            var52.field1732 = var53;
                            var52.field1767 = var56;
                        }
                        if (var365 == 1412) {
                            var52.field1763 = var56;
                        }
                        if (var365 == 1416) {
                            var52.field1841 = var56;
                        }
                        if (var365 == 1401) {
                            var52.field1822 = var56;
                        }
                        if (var365 == 1419) {
                            var52.field1801 = var56;
                        }
                        if (var365 == 1409) {
                            var52.field1790 = var56;
                        }
                        var52.field1775 = true;
                        if (var365 == 1415) {
                            var52.field1803 = var53;
                            var52.field1831 = var56;
                        }
                        if (var365 == 1403) {
                            var52.field1705 = var56;
                        }
                        if (var365 == 1417) {
                            var52.field1707 = var56;
                        }
                        if (var365 == 1423) {
                            var52.field1762 = var56;
                        }
                        if (var365 == 1410) {
                            var52.field1812 = var56;
                        }
                        if (var365 == 1404) {
                            var52.field1769 = var56;
                        }
                        if (var365 == 1405) {
                            var52.field1704 = var56;
                        }
                        if (var365 == 1418) {
                            var52.field1782 = var56;
                        }
                        if (var365 == 1422) {
                            var52.field1711 = var56;
                        }
                        if (var365 == 1420) {
                            var52.field1836 = var56;
                        }
                        if (var365 == 1402) {
                            var52.field1714 = var56;
                        }
                        if (var365 == 1407) {
                            var52.field1699 = var56;
                            var52.field1791 = var53;
                        }
                        if (var365 == 1425) {
                            var52.field1700 = var56;
                        }
                        if (var365 == 1400) {
                            var52.field1694 = var56;
                        }
                        if (var365 == 1408) {
                            var52.field1731 = var56;
                        }
                        if (var365 == 1406) {
                            var52.field1718 = var56;
                        }
                        if (var365 == 1421) {
                            var52.field1818 = var56;
                        }
                        continue;
                    }
                    if (var365 < 1600) {
                        class96 var59 = var44 ? class101.field1898 : field1380;
                        if (var365 == 1500) {
                            class195.field3623[var6++] = var59.field1752;
                            continue;
                        }
                        if (var365 == 1501) {
                            class195.field3623[var6++] = var59.field1834;
                            continue;
                        }
                        if (var365 == 1502) {
                            class195.field3623[var6++] = var59.field1830;
                            continue;
                        }
                        if (var365 == 1503) {
                            class195.field3623[var6++] = var59.field1740;
                            continue;
                        }
                        if (var365 == 1504) {
                            class195.field3623[var6++] = var59.field1806 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 1505) {
                            class195.field3623[var6++] = var59.field1776;
                            continue;
                        }
                    } else if (var365 < 1700) {
                        class96 var60 = var44 ? class101.field1898 : field1380;
                        if (var365 == 1600) {
                            class195.field3623[var6++] = var60.field1800;
                            continue;
                        }
                        if (var365 == 1601) {
                            class195.field3623[var6++] = var60.field1695;
                            continue;
                        }
                        if (var365 == 1602) {
                            class57.field973[var9++] = var60.field1773;
                            continue;
                        }
                        if (var365 == 1603) {
                            class195.field3623[var6++] = var60.field1744;
                            continue;
                        }
                        if (var365 == 1604) {
                            class195.field3623[var6++] = var60.field1833;
                            continue;
                        }
                        if (var365 == 1605) {
                            class195.field3623[var6++] = var60.field1771;
                            continue;
                        }
                        if (var365 == 1606) {
                            class195.field3623[var6++] = var60.field1750;
                            continue;
                        }
                        if (var365 == 1607) {
                            class195.field3623[var6++] = var60.field1730;
                            continue;
                        }
                        if (var365 == 1608) {
                            class195.field3623[var6++] = var60.field1741;
                            continue;
                        }
                        if (var365 == 1609) {
                            class195.field3623[var6++] = var60.field1842;
                            continue;
                        }
                    } else if (var365 < 1800) {
                        class96 var333 = var44 ? class101.field1898 : field1380;
                        if (var365 == 1700) {
                            class195.field3623[var6++] = var333.field1821;
                            continue;
                        }
                        if (var365 == 1701) {
                            if (var333.field1821 == -1) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var333.field1774;
                            }
                            continue;
                        }
                        if (var365 == 1702) {
                            class195.field3623[var6++] = var333.field1743;
                            continue;
                        }
                    } else if (var365 < 1900) {
                        class96 var61 = var44 ? class101.field1898 : field1380;
                        if (var365 == 1800) {
                            class195.field3623[var6++] = class8.method38(-126, class170.method1113(var61, (byte) -50));
                            continue;
                        }
                        if (var365 == 1801) {
                            var6--;
                            int var62 = class195.field3623[var6];
                            int var366 = var62 - 1;
                            if (var61.field1723 != null && var366 < var61.field1723.length && var61.field1723[var366] != null) {
                                class57.field973[var9++] = var61.field1723[var366];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 1802) {
                            if (var61.field1738 == null) {
                                class57.field973[var9++] = class64.field1061;
                            } else {
                                class57.field973[var9++] = var61.field1738;
                            }
                            continue;
                        }
                    } else if (var365 < 2600) {
                        var6--;
                        class96 var332 = class158.method1029((byte) -123, class195.field3623[var6]);
                        if (var365 == 2500) {
                            class195.field3623[var6++] = var332.field1752;
                            continue;
                        }
                        if (var365 == 2501) {
                            class195.field3623[var6++] = var332.field1834;
                            continue;
                        }
                        if (var365 == 2502) {
                            class195.field3623[var6++] = var332.field1830;
                            continue;
                        }
                        if (var365 == 2503) {
                            class195.field3623[var6++] = var332.field1740;
                            continue;
                        }
                        if (var365 == 2504) {
                            class195.field3623[var6++] = var332.field1806 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 2505) {
                            class195.field3623[var6++] = var332.field1776;
                            continue;
                        }
                    } else if (var365 < 2700) {
                        var6--;
                        class96 var63 = class158.method1029((byte) -93, class195.field3623[var6]);
                        if (var365 == 2600) {
                            class195.field3623[var6++] = var63.field1800;
                            continue;
                        }
                        if (var365 == 2601) {
                            class195.field3623[var6++] = var63.field1695;
                            continue;
                        }
                        if (var365 == 2602) {
                            class57.field973[var9++] = var63.field1773;
                            continue;
                        }
                        if (var365 == 2603) {
                            class195.field3623[var6++] = var63.field1744;
                            continue;
                        }
                        if (var365 == 2604) {
                            class195.field3623[var6++] = var63.field1833;
                            continue;
                        }
                        if (var365 == 2605) {
                            class195.field3623[var6++] = var63.field1771;
                            continue;
                        }
                        if (var365 == 2606) {
                            class195.field3623[var6++] = var63.field1750;
                            continue;
                        }
                        if (var365 == 2607) {
                            class195.field3623[var6++] = var63.field1730;
                            continue;
                        }
                        if (var365 == 2608) {
                            class195.field3623[var6++] = var63.field1741;
                            continue;
                        }
                        if (var365 == 2609) {
                            class195.field3623[var6++] = var63.field1842;
                            continue;
                        }
                    } else if (var365 < 2800) {
                        if (var365 == 2700) {
                            var6--;
                            class96 var64 = class158.method1029((byte) -99, class195.field3623[var6]);
                            class195.field3623[var6++] = var64.field1821;
                            continue;
                        }
                        if (var365 == 2701) {
                            var6--;
                            class96 var65 = class158.method1029((byte) -124, class195.field3623[var6]);
                            if (var65.field1821 == -1) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var65.field1774;
                            }
                            continue;
                        }
                        if (var365 == 2702) {
                            var6--;
                            int var66 = class195.field3623[var6];
                            class73 var67 = (class73) class55.field927.method806(-1, (long) var66);
                            if (var67 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 2703) {
                            var6--;
                            class96 var68 = class158.method1029((byte) -107, class195.field3623[var6]);
                            if (var68.field1770 == null) {
                                class195.field3623[var6++] = 0;
                                continue;
                            }
                            int var69 = var68.field1770.length;
                            for (int var70 = 0; var70 < var68.field1770.length; var70++) {
                                if (var68.field1770[var70] == null) {
                                    var69 = var70;
                                    break;
                                }
                            }
                            class195.field3623[var6++] = var69;
                            continue;
                        }
                        if (var365 == 2704 || var365 == 2705) {
                            var6 -= 2;
                            int var71 = class195.field3623[var6];
                            int var72 = class195.field3623[var6 + 1];
                            class73 var73 = (class73) class55.field927.method806(-1, (long) var71);
                            if (var73 != null && var73.field1216 == var72) {
                                class195.field3623[var6++] = 1;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                    } else if (var365 < 2900) {
                        var6--;
                        class96 var330 = class158.method1029((byte) -105, class195.field3623[var6]);
                        if (var365 == 2800) {
                            class195.field3623[var6++] = class8.method38(class122.method804(arg2, -115), class170.method1113(var330, (byte) -50));
                            continue;
                        }
                        if (var365 == 2801) {
                            var6--;
                            int var331 = class195.field3623[var6];
                            int var367 = var331 - 1;
                            if (var330.field1723 != null && var330.field1723.length > var367 && var330.field1723[var367] != null) {
                                class57.field973[var9++] = var330.field1723[var367];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 2802) {
                            if (var330.field1738 == null) {
                                class57.field973[var9++] = class64.field1061;
                            } else {
                                class57.field973[var9++] = var330.field1738;
                            }
                            continue;
                        }
                    } else if (var365 < 3200) {
                        if (var365 == 3100) {
                            var9--;
                            class132 var315 = class57.field973[var9];
                            class169.method1108(-85, var315, 0, class64.field1061);
                            continue;
                        }
                        if (var365 == 3101) {
                            var6 -= 2;
                            class35.method250(true, class195.field3623[var6 + 1], class195.field3623[var6], class210.field3854);
                            continue;
                        }
                        if (var365 == 3103) {
                            class200.method1262(-3727);
                            continue;
                        }
                        if (var365 == 3104) {
                            class229.field4128++;
                            var9--;
                            class132 var316 = class57.field973[var9];
                            int var317 = 0;
                            if (var316.method880(-30737)) {
                                var317 = var316.method877(-32026);
                            }
                            class64.field1054.method660(197, 3);
                            class64.field1054.method726((byte) 113, var317);
                            continue;
                        }
                        if (var365 == 3105) {
                            var9--;
                            class132 var318 = class57.field973[var9];
                            class64.field1054.method660(246, 3);
                            class64.field1054.method709(arg2 - 27341, var318.method867(arg2 ^ 0xFFFF94EE));
                            class160.field2907++;
                            continue;
                        }
                        if (var365 == 3106) {
                            class167.field3054++;
                            var9--;
                            class132 var319 = class57.field973[var9];
                            class64.field1054.method660(208, 3);
                            class64.field1054.method747(var319.method902((byte) -4) + 1, (byte) -62);
                            class64.field1054.method722(var319, -1607065512);
                            continue;
                        }
                        if (var365 == 3107) {
                            var6--;
                            int var320 = class195.field3623[var6];
                            var9--;
                            class132 var321 = class57.field973[var9];
                            class222.method1391(57, var321, var320);
                            continue;
                        }
                        if (var365 == 3108) {
                            var6 -= 3;
                            int var322 = class195.field3623[var6];
                            int var323 = class195.field3623[var6 + 2];
                            int var324 = class195.field3623[var6 + 1];
                            class96 var325 = class158.method1029((byte) -126, var323);
                            class90.method561(var322, (byte) 81, var324, var325);
                            continue;
                        }
                        if (var365 == 3109) {
                            var6 -= 2;
                            int var326 = class195.field3623[var6];
                            int var327 = class195.field3623[var6 + 1];
                            class96 var328 = var44 ? class101.field1898 : field1380;
                            class90.method561(var326, (byte) 100, var327, var328);
                            continue;
                        }
                        if (var365 == 3110) {
                            class181.field3322++;
                            var6--;
                            int var329 = class195.field3623[var6];
                            class64.field1054.method660(46, 3);
                            class64.field1054.method715(arg2 + 61, var329);
                            continue;
                        }
                    } else if (var365 < 3300) {
                        if (var365 == 3200) {
                            var6 -= 3;
                            class216.method1347(class195.field3623[var6], class195.field3623[var6 + 1], class195.field3623[var6 + 2], 0);
                            continue;
                        }
                        if (var365 == 3201) {
                            var6--;
                            class127.method836(class195.field3623[var6], 2);
                            continue;
                        }
                        if (var365 == 3202) {
                            var6 -= 2;
                            class234.method1485(class195.field3623[var6 + 1], class195.field3623[var6], 0);
                            continue;
                        }
                    } else if (var365 < 3400) {
                        if (var365 == 3300) {
                            class195.field3623[var6++] = class30.field460;
                            continue;
                        }
                        if (var365 == 3301) {
                            var6 -= 2;
                            int var293 = class195.field3623[var6];
                            int var294 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class227.method1445(var294, (byte) -34, var293);
                            continue;
                        }
                        if (var365 == 3302) {
                            var6 -= 2;
                            int var295 = class195.field3623[var6];
                            int var296 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class111.method703(var295, (byte) -108, var296);
                            continue;
                        }
                        if (var365 == 3303) {
                            var6 -= 2;
                            int var297 = class195.field3623[var6];
                            int var298 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class64.method403(var297, var298, 5298);
                            continue;
                        }
                        if (var365 == 3304) {
                            var6--;
                            int var299 = class195.field3623[var6];
                            class195.field3623[var6++] = class231.method1468(var299, arg2 - 23172).field452;
                            continue;
                        }
                        if (var365 == 3305) {
                            var6--;
                            int var300 = class195.field3623[var6];
                            class195.field3623[var6++] = class60.field1020[var300];
                            continue;
                        }
                        if (var365 == 3306) {
                            var6--;
                            int var301 = class195.field3623[var6];
                            class195.field3623[var6++] = class208.field3794[var301];
                            continue;
                        }
                        if (var365 == 3307) {
                            var6--;
                            int var302 = class195.field3623[var6];
                            class195.field3623[var6++] = class196.field3637[var302];
                            continue;
                        }
                        if (var365 == 3308) {
                            int var303 = class139.field2615;
                            int var304 = (class210.field3854.field673 >> 7) + class129.field2389;
                            int var305 = (class210.field3854.field723 >> 7) + class168.field3082;
                            class195.field3623[var6++] = (var303 << 28) + (var304 << 14) + var305;
                            continue;
                        }
                        if (var365 == 3309) {
                            var6--;
                            int var306 = class195.field3623[var6];
                            class195.field3623[var6++] = class75.method450(16383, var306 >> 14);
                            continue;
                        }
                        if (var365 == 3310) {
                            var6--;
                            int var307 = class195.field3623[var6];
                            class195.field3623[var6++] = var307 >> 28;
                            continue;
                        }
                        if (var365 == 3311) {
                            var6--;
                            int var308 = class195.field3623[var6];
                            class195.field3623[var6++] = class75.method450(16383, var308);
                            continue;
                        }
                        if (var365 == 3312) {
                            class195.field3623[var6++] = class40.field648 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3313) {
                            var6 -= 2;
                            int var309 = class195.field3623[var6] + 32768;
                            int var310 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class227.method1445(var310, (byte) -33, var309);
                            continue;
                        }
                        if (var365 == 3314) {
                            var6 -= 2;
                            int var311 = class195.field3623[var6] + 32768;
                            int var312 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class111.method703(var311, (byte) -114, var312);
                            continue;
                        }
                        if (var365 == 3315) {
                            var6 -= 2;
                            int var313 = class195.field3623[var6 + 1];
                            int var314 = class195.field3623[var6] + 32768;
                            class195.field3623[var6++] = class64.method403(var314, var313, class122.method804(arg2, 5298));
                            continue;
                        }
                        if (var365 == 3316) {
                            if (class169.field3148 >= 2) {
                                class195.field3623[var6++] = class169.field3148;
                            } else {
                                class195.field3623[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 3317) {
                            class195.field3623[var6++] = class137.field2571;
                            continue;
                        }
                        if (var365 == 3318) {
                            class195.field3623[var6++] = field1377;
                            continue;
                        }
                        if (var365 == 3321) {
                            class195.field3623[var6++] = class57.field959;
                            continue;
                        }
                        if (var365 == 3322) {
                            class195.field3623[var6++] = class217.field3983;
                            continue;
                        }
                        if (var365 == 3323) {
                            if (class237.field4290 >= 5 && class237.field4290 <= 9) {
                                class195.field3623[var6++] = 1;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3324) {
                            if (class237.field4290 >= 5 && class237.field4290 <= 9) {
                                class195.field3623[var6++] = class237.field4290;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3325) {
                            if (class154.field2806 <= 0) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 3326) {
                            class195.field3623[var6++] = class210.field3854.field2894;
                            continue;
                        }
                        if (var365 == 3327) {
                            class195.field3623[var6++] = class210.field3854.field2880.field869 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 3500) {
                        if (var365 == 3400) {
                            var6 -= 2;
                            int var285 = class195.field3623[var6];
                            int var286 = class195.field3623[var6 + 1];
                            class55 var287 = class210.method1309(true, var285);
                            class57.field973[var9++] = var287.method374((byte) 113, var286);
                            continue;
                        }
                        if (var365 == 3408) {
                            var6 -= 4;
                            int var288 = class195.field3623[var6];
                            int var289 = class195.field3623[var6 + 1];
                            int var290 = class195.field3623[var6 + 2];
                            int var291 = class195.field3623[var6 + 3];
                            class55 var292 = class210.method1309(true, var290);
                            if (var292.field929 == var288 && var292.field939 == var289) {
                                if (var289 == 115) {
                                    class57.field973[var9++] = var292.method374((byte) 109, var291);
                                } else {
                                    class195.field3623[var6++] = var292.method378(var291, 18738);
                                }
                                continue;
                            }
                            if (var289 == 115) {
                                class57.field973[var9++] = class189.field3496;
                            } else {
                                class195.field3623[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 3700) {
                        if (var365 == 3600) {
                            if (class102.field1910 == 0) {
                                class195.field3623[var6++] = -2;
                            } else if (class102.field1910 == 1) {
                                class195.field3623[var6++] = -1;
                            } else {
                                class195.field3623[var6++] = client.field537;
                            }
                            continue;
                        }
                        if (var365 == 3601) {
                            var6--;
                            int var265 = class195.field3623[var6];
                            if (class102.field1910 == 2 && client.field537 > var265) {
                                class57.field973[var9++] = class68.field1136[var265];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 3602) {
                            var6--;
                            int var266 = class195.field3623[var6];
                            if (class102.field1910 == 2 && var266 < client.field537) {
                                class195.field3623[var6++] = class39.field637[var266];
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3603) {
                            var6--;
                            int var267 = class195.field3623[var6];
                            if (class102.field1910 == 2 && client.field537 > var267) {
                                class195.field3623[var6++] = class60.field1019[var267];
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3604) {
                            var9--;
                            class132 var268 = class57.field973[var9];
                            var6--;
                            int var269 = class195.field3623[var6];
                            class173.method1131(var269, (byte) 111, var268);
                            continue;
                        }
                        if (var365 == 3605) {
                            var9--;
                            class132 var270 = class57.field973[var9];
                            class58.method388(129, var270.method867(-27410));
                            continue;
                        }
                        if (var365 == 3606) {
                            var9--;
                            class132 var271 = class57.field973[var9];
                            class111.method707(var271.method867(arg2 - 27410), (byte) -61);
                            continue;
                        }
                        if (var365 == 3607) {
                            var9--;
                            class132 var272 = class57.field973[var9];
                            class67.method415(var272.method867(-27410), (byte) 111);
                            continue;
                        }
                        if (var365 == 3608) {
                            var9--;
                            class132 var273 = class57.field973[var9];
                            class184.method1176(var273.method867(-27410), 73);
                            continue;
                        }
                        if (var365 == 3609) {
                            var9--;
                            class132 var274 = class57.field973[var9];
                            if (var274.method904(class66.field1091, true) || var274.method904(class187.field3464, true)) {
                                var274 = var274.method873((byte) 58, 7);
                            }
                            class195.field3623[var6++] = class8.method34(var274, (byte) 25) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3610) {
                            var6--;
                            int var275 = class195.field3623[var6];
                            if (class102.field1910 == 2 && client.field537 > var275) {
                                class57.field973[var9++] = class88.field1542[var275];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 3611) {
                            if (class133.field2502 == null) {
                                class57.field973[var9++] = class64.field1061;
                            } else {
                                class57.field973[var9++] = class133.field2502.method900(class122.method804(arg2, 0));
                            }
                            continue;
                        }
                        if (var365 == 3612) {
                            if (class133.field2502 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = class116.field2225;
                            }
                            continue;
                        }
                        if (var365 == 3613) {
                            var6--;
                            int var276 = class195.field3623[var6];
                            if (class133.field2502 != null && class116.field2225 > var276) {
                                class57.field973[var9++] = class136.field2558[var276].field3699.method900(0);
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 3614) {
                            var6--;
                            int var277 = class195.field3623[var6];
                            if (class133.field2502 != null && var277 < class116.field2225) {
                                class195.field3623[var6++] = class136.field2558[var277].field3696;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3615) {
                            var6--;
                            int var278 = class195.field3623[var6];
                            if (class133.field2502 != null && class116.field2225 > var278) {
                                class195.field3623[var6++] = class136.field2558[var278].field3694;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3616) {
                            class195.field3623[var6++] = class210.field3837;
                            continue;
                        }
                        if (var365 == 3617) {
                            var9--;
                            class132 var279 = class57.field973[var9];
                            class103.method640(var279, (byte) -87);
                            continue;
                        }
                        if (var365 == 3618) {
                            class195.field3623[var6++] = class182.field3338;
                            continue;
                        }
                        if (var365 == 3619) {
                            var9--;
                            class132 var280 = class57.field973[var9];
                            class234.method1483(var280.method867(-27410), 162);
                            continue;
                        }
                        if (var365 == 3620) {
                            class218.method1365(-14355);
                            continue;
                        }
                        if (var365 == 3621) {
                            if (class102.field1910 == 0) {
                                class195.field3623[var6++] = -1;
                            } else {
                                class195.field3623[var6++] = class138.field2596;
                            }
                            continue;
                        }
                        if (var365 == 3622) {
                            var6--;
                            int var281 = class195.field3623[var6];
                            if (class102.field1910 != 0 && var281 < class138.field2596) {
                                class57.field973[var9++] = class164.method1057((byte) 11, class178.field3282[var281]).method900(0);
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 3623) {
                            var9--;
                            class132 var282 = class57.field973[var9];
                            if (var282.method904(class66.field1091, true) || var282.method904(class187.field3464, true)) {
                                var282 = var282.method873((byte) 58, 7);
                            }
                            class195.field3623[var6++] = class161.method1045(var282, 0) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3624) {
                            var6--;
                            int var283 = class195.field3623[var6];
                            if (class136.field2558 != null && class116.field2225 > var283 && class136.field2558[var283].field3699.method882(24493, class210.field3854.field2877)) {
                                class195.field3623[var6++] = 1;
                                continue;
                            }
                            class195.field3623[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3625) {
                            if (class117.field2234 == null) {
                                class57.field973[var9++] = class64.field1061;
                            } else {
                                class57.field973[var9++] = class117.field2234.method900(0);
                            }
                            continue;
                        }
                        if (var365 == 3626) {
                            var6--;
                            int var284 = class195.field3623[var6];
                            if (class133.field2502 != null && class116.field2225 > var284) {
                                class57.field973[var9++] = class136.field2558[var284].field3693;
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                    } else if (var365 < 4000) {
                        if (var365 == 3903) {
                            var6--;
                            int var251 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var251].method839((byte) 17);
                            continue;
                        }
                        if (var365 == 3904) {
                            var6--;
                            int var252 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var252].field2374;
                            continue;
                        }
                        if (var365 == 3905) {
                            var6--;
                            int var253 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var253].field2363;
                            continue;
                        }
                        if (var365 == 3906) {
                            var6--;
                            int var254 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var254].field2372;
                            continue;
                        }
                        if (var365 == 3907) {
                            var6--;
                            int var255 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var255].field2375;
                            continue;
                        }
                        if (var365 == 3908) {
                            var6--;
                            int var256 = class195.field3623[var6];
                            class195.field3623[var6++] = class56.field956[var256].field2371;
                            continue;
                        }
                        if (var365 == 3910) {
                            var6--;
                            int var257 = class195.field3623[var6];
                            int var258 = class56.field956[var257].method837(-101);
                            class195.field3623[var6++] = var258 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3911) {
                            var6--;
                            int var259 = class195.field3623[var6];
                            int var260 = class56.field956[var259].method837(-105);
                            class195.field3623[var6++] = var260 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3912) {
                            var6--;
                            int var261 = class195.field3623[var6];
                            int var262 = class56.field956[var261].method837(-101);
                            class195.field3623[var6++] = var262 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3913) {
                            var6--;
                            int var263 = class195.field3623[var6];
                            int var264 = class56.field956[var263].method837(arg2 ^ 0xFFFFFF86);
                            class195.field3623[var6++] = var264 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 4100) {
                        if (var365 == 4000) {
                            var6 -= 2;
                            int var74 = class195.field3623[var6];
                            int var75 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var74 + var75;
                            continue;
                        }
                        if (var365 == 4001) {
                            var6 -= 2;
                            int var76 = class195.field3623[var6];
                            int var77 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var76 - var77;
                            continue;
                        }
                        if (var365 == 4002) {
                            var6 -= 2;
                            int var78 = class195.field3623[var6];
                            int var79 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var78 * var79;
                            continue;
                        }
                        if (var365 == 4003) {
                            var6 -= 2;
                            int var80 = class195.field3623[var6 + 1];
                            int var81 = class195.field3623[var6];
                            class195.field3623[var6++] = var81 / var80;
                            continue;
                        }
                        if (var365 == 4004) {
                            var6--;
                            int var82 = class195.field3623[var6];
                            class195.field3623[var6++] = (int) ((double) var82 * Math.random());
                            continue;
                        }
                        if (var365 == 4005) {
                            var6--;
                            int var83 = class195.field3623[var6];
                            class195.field3623[var6++] = (int) ((double) (var83 + 1) * Math.random());
                            continue;
                        }
                        if (var365 == 4006) {
                            var6 -= 5;
                            int var84 = class195.field3623[var6];
                            int var85 = class195.field3623[var6 + 2];
                            int var86 = class195.field3623[var6 + 3];
                            int var87 = class195.field3623[var6 + 1];
                            int var88 = class195.field3623[var6 + 4];
                            class195.field3623[var6++] = (var87 - var84) * (-var85 + var88) / (var86 - var85) + var84;
                            continue;
                        }
                        if (var365 == 4007) {
                            var6 -= 2;
                            long var89 = (long) class195.field3623[var6];
                            long var91 = (long) class195.field3623[var6 + 1];
                            class195.field3623[var6++] = (int) (var89 * var91 / 100L + var89);
                            continue;
                        }
                        if (var365 == 4008) {
                            var6 -= 2;
                            int var93 = class195.field3623[var6 + 1];
                            int var94 = class195.field3623[var6];
                            class195.field3623[var6++] = class219.method1368(0x1 << var93, var94);
                            continue;
                        }
                        if (var365 == 4009) {
                            var6 -= 2;
                            int var95 = class195.field3623[var6];
                            int var96 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class75.method450(var95, -(0x1 << var96) - 1);
                            continue;
                        }
                        if (var365 == 4010) {
                            var6 -= 2;
                            int var97 = class195.field3623[var6];
                            int var98 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class75.method450(var97, 0x1 << var98) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var365 == 4011) {
                            var6 -= 2;
                            int var99 = class195.field3623[var6 + 1];
                            int var100 = class195.field3623[var6];
                            class195.field3623[var6++] = var100 % var99;
                            continue;
                        }
                        if (var365 == 4012) {
                            var6 -= 2;
                            int var101 = class195.field3623[var6];
                            int var102 = class195.field3623[var6 + 1];
                            if (var101 == 0) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = (int) Math.pow((double) var101, (double) var102);
                            }
                            continue;
                        }
                        if (var365 == 4013) {
                            var6 -= 2;
                            int var103 = class195.field3623[var6 + 1];
                            int var104 = class195.field3623[var6];
                            if (var104 == 0) {
                                class195.field3623[var6++] = 0;
                            } else if (var103 == 0) {
                                class195.field3623[var6++] = Integer.MAX_VALUE;
                            } else {
                                class195.field3623[var6++] = (int) Math.pow((double) var104, 1.0D / (double) var103);
                            }
                            continue;
                        }
                        if (var365 == 4014) {
                            var6 -= 2;
                            int var105 = class195.field3623[var6];
                            int var106 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class75.method450(var106, var105);
                            continue;
                        }
                        if (var365 == 4015) {
                            var6 -= 2;
                            int var107 = class195.field3623[var6 + 1];
                            int var108 = class195.field3623[var6];
                            class195.field3623[var6++] = class219.method1368(var108, var107);
                            continue;
                        }
                        if (var365 == 4016) {
                            var6 -= 2;
                            int var109 = class195.field3623[var6];
                            int var110 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var110 <= var109 ? var110 : var109;
                            continue;
                        }
                        if (var365 == 4017) {
                            var6 -= 2;
                            int var111 = class195.field3623[var6];
                            int var112 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var111 > var112 ? var111 : var112;
                            continue;
                        }
                        if (var365 == 4018) {
                            var6 -= 3;
                            long var113 = (long) class195.field3623[var6 + 1];
                            long var115 = (long) class195.field3623[var6];
                            long var117 = (long) class195.field3623[var6 + 2];
                            class195.field3623[var6++] = (int) (var115 * var117 / var113);
                            continue;
                        }
                    } else if (var365 < 4200) {
                        if (var365 == 4100) {
                            var9--;
                            class132 var199 = class57.field973[var9];
                            var6--;
                            int var200 = class195.field3623[var6];
                            class57.field973[var9++] = class187.method1197(new class132[] { var199, class132.method889(var200, (byte) 109) }, -90);
                            continue;
                        }
                        if (var365 == 4101) {
                            var9 -= 2;
                            class132 var201 = class57.field973[var9];
                            class132 var202 = class57.field973[var9 + 1];
                            class57.field973[var9++] = class187.method1197(new class132[] { var201, var202 }, -125);
                            continue;
                        }
                        if (var365 == 4102) {
                            var6--;
                            int var203 = class195.field3623[var6];
                            var9--;
                            class132 var204 = class57.field973[var9];
                            class57.field973[var9++] = class187.method1197(new class132[] { var204, class91.method566((byte) 11, var203, true) }, -85);
                            continue;
                        }
                        if (var365 == 4103) {
                            var9--;
                            class132 var205 = class57.field973[var9];
                            class57.field973[var9++] = var205.method896((byte) 122);
                            continue;
                        }
                        if (var365 == 4104) {
                            var6--;
                            int var206 = class195.field3623[var6];
                            long var207 = ((long) var206 + 11745L) * 86400000L;
                            class147.field2715.setTime(new Date(var207));
                            int var209 = class147.field2715.get(5);
                            int var210 = class147.field2715.get(2);
                            int var211 = class147.field2715.get(1);
                            class57.field973[var9++] = class187.method1197(new class132[] { class132.method889(var209, (byte) 102), class22.field317, class133.field2505[var210], class22.field317, class132.method889(var211, (byte) 108) }, arg2 - 89);
                            continue;
                        }
                        if (var365 == 4105) {
                            var9 -= 2;
                            class132 var212 = class57.field973[var9];
                            class132 var213 = class57.field973[var9 + 1];
                            if (class210.field3854.field2880 != null && class210.field3854.field2880.field869) {
                                class57.field973[var9++] = var213;
                                continue;
                            }
                            class57.field973[var9++] = var212;
                            continue;
                        }
                        if (var365 == 4106) {
                            var6--;
                            int var214 = class195.field3623[var6];
                            class57.field973[var9++] = class132.method889(var214, (byte) 109);
                            continue;
                        }
                        if (var365 == 4107) {
                            var9 -= 2;
                            class195.field3623[var6++] = class57.field973[var9].method865(class122.method804(arg2, -34), class57.field973[var9 + 1]);
                            continue;
                        }
                        if (var365 == 4108) {
                            var6 -= 2;
                            var9--;
                            class132 var215 = class57.field973[var9];
                            int var216 = class195.field3623[var6 + 1];
                            int var217 = class195.field3623[var6];
                            byte[] var218 = class94.field1654.method1079(var216, -4, 0);
                            class98 var219 = new class98(var218);
                            var219.method686(class86.field1503, null);
                            class195.field3623[var6++] = var219.method669(var215, var217);
                            continue;
                        }
                        if (var365 == 4109) {
                            var6 -= 2;
                            var9--;
                            class132 var220 = class57.field973[var9];
                            int var221 = class195.field3623[var6];
                            int var222 = class195.field3623[var6 + 1];
                            byte[] var223 = class94.field1654.method1079(var222, -6, 0);
                            class98 var224 = new class98(var223);
                            var224.method686(class86.field1503, null);
                            class195.field3623[var6++] = var224.method665(var220, var221);
                            continue;
                        }
                        if (var365 == 4110) {
                            var9 -= 2;
                            class132 var225 = class57.field973[var9 + 1];
                            class132 var226 = class57.field973[var9];
                            var6--;
                            if (class195.field3623[var6] == 1) {
                                class57.field973[var9++] = var226;
                            } else {
                                class57.field973[var9++] = var225;
                            }
                            continue;
                        }
                        if (var365 == 4111) {
                            var9--;
                            class132 var227 = class57.field973[var9];
                            class57.field973[var9++] = class107.method682(var227);
                            continue;
                        }
                        if (var365 == 4112) {
                            var9--;
                            class132 var228 = class57.field973[var9];
                            var6--;
                            int var229 = class195.field3623[var6];
                            if (var229 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class57.field973[var9++] = var228.method875(arg2 + 118, var229);
                            continue;
                        }
                        if (var365 == 4113) {
                            var6--;
                            int var230 = class195.field3623[var6];
                            class195.field3623[var6++] = class21.method139(var230, arg2 + 108) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4114) {
                            var6--;
                            int var231 = class195.field3623[var6];
                            class195.field3623[var6++] = class92.method574((byte) 51, var231) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4115) {
                            var6--;
                            int var232 = class195.field3623[var6];
                            class195.field3623[var6++] = class57.method384(97, var232) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4116) {
                            var6--;
                            int var233 = class195.field3623[var6];
                            class195.field3623[var6++] = class61.method395((byte) -100, var233) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4117) {
                            var9--;
                            class132 var234 = class57.field973[var9];
                            if (var234 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var234.method902((byte) -4);
                            }
                            continue;
                        }
                        if (var365 == 4118) {
                            var6 -= 2;
                            var9--;
                            class132 var235 = class57.field973[var9];
                            int var236 = class195.field3623[var6 + 1];
                            int var237 = class195.field3623[var6];
                            class57.field973[var9++] = var235.method886(-1, var237, var236);
                            continue;
                        }
                        if (var365 == 4119) {
                            var9--;
                            class132 var238 = class57.field973[var9];
                            class132 var239 = class233.method1477(var238.method902((byte) -4), -226189949);
                            boolean var240 = false;
                            for (int var241 = 0; var238.method902((byte) -4) > var241; var241++) {
                                int var242 = var238.method881(var241, 70);
                                if (var242 == 60) {
                                    var240 = true;
                                } else if (var242 == 62) {
                                    var240 = false;
                                } else if (!var240) {
                                    var239.method883(119, var242);
                                }
                            }
                            var239.method876(102);
                            class57.field973[var9++] = var239;
                            continue;
                        }
                        if (var365 == 4120) {
                            var6 -= 2;
                            var9--;
                            class132 var243 = class57.field973[var9];
                            int var244 = class195.field3623[var6];
                            int var245 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = var243.method898(var245, var244, (byte) -22);
                            continue;
                        }
                        if (var365 == 4121) {
                            var9 -= 2;
                            class132 var246 = class57.field973[var9 + 1];
                            class132 var247 = class57.field973[var9];
                            var6--;
                            int var248 = class195.field3623[var6];
                            class195.field3623[var6++] = var247.method890(var248, 52, var246);
                            continue;
                        }
                        if (var365 == 4122) {
                            var6--;
                            int var249 = class195.field3623[var6];
                            class195.field3623[var6++] = class147.method983(true, var249);
                            continue;
                        }
                        if (var365 == 4123) {
                            var6--;
                            int var250 = class195.field3623[var6];
                            class195.field3623[var6++] = class34.method246(var250, true);
                            continue;
                        }
                    } else if (var365 < 4300) {
                        if (var365 == 4200) {
                            var6--;
                            int var183 = class195.field3623[var6];
                            class57.field973[var9++] = class58.method389(0, var183).field4399;
                            continue;
                        }
                        if (var365 == 4201) {
                            var6 -= 2;
                            int var184 = class195.field3623[var6 + 1];
                            int var185 = class195.field3623[var6];
                            class243 var186 = class58.method389(0, var185);
                            if (var184 >= 1 && var184 <= 5 && var186.field4394[var184 - 1] != null) {
                                class57.field973[var9++] = var186.field4394[var184 - 1];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 4202) {
                            var6 -= 2;
                            int var187 = class195.field3623[var6];
                            int var188 = class195.field3623[var6 + 1];
                            class243 var189 = class58.method389(0, var187);
                            if (var188 >= 1 && var188 <= 5 && var189.field4448[var188 - 1] != null) {
                                class57.field973[var9++] = var189.field4448[var188 - 1];
                                continue;
                            }
                            class57.field973[var9++] = class64.field1061;
                            continue;
                        }
                        if (var365 == 4203) {
                            var6--;
                            int var190 = class195.field3623[var6];
                            class195.field3623[var6++] = class58.method389(arg2, var190).field4422;
                            continue;
                        }
                        if (var365 == 4204) {
                            var6--;
                            int var191 = class195.field3623[var6];
                            class195.field3623[var6++] = class58.method389(arg2, var191).field4427 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4205) {
                            var6--;
                            int var192 = class195.field3623[var6];
                            class243 var193 = class58.method389(arg2, var192);
                            if (var193.field4423 == -1 && var193.field4406 >= 0) {
                                class195.field3623[var6++] = var193.field4406;
                                continue;
                            }
                            class195.field3623[var6++] = var192;
                            continue;
                        }
                        if (var365 == 4206) {
                            var6--;
                            int var194 = class195.field3623[var6];
                            class243 var195 = class58.method389(arg2, var194);
                            if (var195.field4423 >= 0 && var195.field4406 >= 0) {
                                class195.field3623[var6++] = var195.field4406;
                                continue;
                            }
                            class195.field3623[var6++] = var194;
                            continue;
                        }
                        if (var365 == 4207) {
                            var6--;
                            int var196 = class195.field3623[var6];
                            class195.field3623[var6++] = class58.method389(0, var196).field4440 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4210) {
                            var9--;
                            class132 var197 = class57.field973[var9];
                            var6--;
                            int var198 = class195.field3623[var6];
                            class36.method260(var198 == 1, var197, true);
                            class195.field3623[var6++] = class77.field1333;
                            continue;
                        }
                        if (var365 == 4211) {
                            if (class211.field3876 != null && class77.field1333 > class173.field3229) {
                                class195.field3623[var6++] = class75.method450(class211.field3876[class173.field3229++], 65535);
                                continue;
                            }
                            class195.field3623[var6++] = -1;
                            continue;
                        }
                        if (var365 == 4212) {
                            class173.field3229 = 0;
                            continue;
                        }
                    } else if (var365 < 5100) {
                        if (var365 == 5000) {
                            class195.field3623[var6++] = class241.field4328;
                            continue;
                        }
                        if (var365 == 5001) {
                            class13.field175++;
                            var6 -= 3;
                            class241.field4328 = class195.field3623[var6];
                            class15.field221 = class195.field3623[var6 + 1];
                            class161.field2923 = class195.field3623[var6 + 2];
                            class64.field1054.method660(210, 3);
                            class64.field1054.method747(class241.field4328, (byte) -116);
                            class64.field1054.method747(class15.field221, (byte) -69);
                            class64.field1054.method747(class161.field2923, (byte) -128);
                            continue;
                        }
                        if (var365 == 5002) {
                            class62.field1042++;
                            var9--;
                            class132 var119 = class57.field973[var9];
                            var6 -= 2;
                            int var120 = class195.field3623[var6];
                            int var121 = class195.field3623[var6 + 1];
                            class64.field1054.method660(187, arg2 ^ 0x3);
                            class64.field1054.method709(arg2 - 27341, var119.method867(-27410));
                            class64.field1054.method747(var120 - 1, (byte) -49);
                            class64.field1054.method747(var121, (byte) -89);
                            continue;
                        }
                        if (var365 == 5003) {
                            class132 var122 = null;
                            var6--;
                            int var123 = class195.field3623[var6];
                            if (var123 < 100) {
                                var122 = class89.field1568[var123];
                            }
                            if (var122 == null) {
                                var122 = class64.field1061;
                            }
                            class57.field973[var9++] = var122;
                            continue;
                        }
                        if (var365 == 5004) {
                            var6--;
                            int var124 = class195.field3623[var6];
                            int var125 = -1;
                            if (var124 < 100 && class89.field1568[var124] != null) {
                                var125 = class2.field32[var124];
                            }
                            class195.field3623[var6++] = var125;
                            continue;
                        }
                        if (var365 == 5005) {
                            class195.field3623[var6++] = class15.field221;
                            continue;
                        }
                        if (var365 == 5008) {
                            var9--;
                            class132 var126 = class57.field973[var9];
                            if (var126.method904(class194.field3610, true)) {
                                class85.method533(var126, 64);
                            } else {
                                class191.field3569++;
                                class132 var127 = var126.method896((byte) 123);
                                byte var128 = 0;
                                byte var129 = 0;
                                if (var127.method904(class222.field4033, true)) {
                                    var128 = 0;
                                    var126 = var126.method873((byte) 58, class222.field4033.method902((byte) -4));
                                } else if (var127.method904(class186.field3441, true)) {
                                    var126 = var126.method873((byte) 58, class186.field3441.method902((byte) -4));
                                    var128 = 1;
                                } else if (var127.method904(class189.field3484, true)) {
                                    var128 = 2;
                                    var126 = var126.method873((byte) 58, class189.field3484.method902((byte) -4));
                                } else if (var127.method904(class77.field1313, true)) {
                                    var128 = 3;
                                    var126 = var126.method873((byte) 58, class77.field1313.method902((byte) -4));
                                } else if (var127.method904(class30.field476, true)) {
                                    var126 = var126.method873((byte) 58, class30.field476.method902((byte) -4));
                                    var128 = 4;
                                } else if (var127.method904(class158.field2869, true)) {
                                    var126 = var126.method873((byte) 58, class158.field2869.method902((byte) -4));
                                    var128 = 5;
                                } else if (var127.method904(class191.field3571, true)) {
                                    var126 = var126.method873((byte) 58, class191.field3571.method902((byte) -4));
                                    var128 = 6;
                                } else if (var127.method904(class168.field3076, true)) {
                                    var128 = 7;
                                    var126 = var126.method873((byte) 58, class168.field3076.method902((byte) -4));
                                } else if (var127.method904(class222.field4027, true)) {
                                    var128 = 8;
                                    var126 = var126.method873((byte) 58, class222.field4027.method902((byte) -4));
                                } else if (var127.method904(class135.field2538, true)) {
                                    var126 = var126.method873((byte) 58, class135.field2538.method902((byte) -4));
                                    var128 = 9;
                                } else if (var127.method904(class108.field2042, true)) {
                                    var128 = 10;
                                    var126 = var126.method873((byte) 58, class108.field2042.method902((byte) -4));
                                } else if (var127.method904(class30.field461, true)) {
                                    var126 = var126.method873((byte) 58, class30.field461.method902((byte) -4));
                                    var128 = 11;
                                } else if (class149.field2736 != 0) {
                                    if (var127.method904(class222.field4045, true)) {
                                        var126 = var126.method873((byte) 58, class222.field4045.method902((byte) -4));
                                        var128 = 0;
                                    } else if (var127.method904(class186.field3445, true)) {
                                        var126 = var126.method873((byte) 58, class186.field3445.method902((byte) -4));
                                        var128 = 1;
                                    } else if (var127.method904(class189.field3494, true)) {
                                        var128 = 2;
                                        var126 = var126.method873((byte) 58, class189.field3494.method902((byte) -4));
                                    } else if (var127.method904(class77.field1316, true)) {
                                        var128 = 3;
                                        var126 = var126.method873((byte) 58, class77.field1316.method902((byte) -4));
                                    } else if (var127.method904(class30.field475, true)) {
                                        var128 = 4;
                                        var126 = var126.method873((byte) 58, class30.field475.method902((byte) -4));
                                    } else if (var127.method904(class158.field2866, true)) {
                                        var128 = 5;
                                        var126 = var126.method873((byte) 58, class158.field2866.method902((byte) -4));
                                    } else if (var127.method904(class191.field3545, true)) {
                                        var126 = var126.method873((byte) 58, class191.field3545.method902((byte) -4));
                                        var128 = 6;
                                    } else if (var127.method904(class168.field3063, true)) {
                                        var126 = var126.method873((byte) 58, class168.field3063.method902((byte) -4));
                                        var128 = 7;
                                    } else if (var127.method904(class222.field4049, true)) {
                                        var126 = var126.method873((byte) 58, class222.field4049.method902((byte) -4));
                                        var128 = 8;
                                    } else if (var127.method904(class135.field2546, true)) {
                                        var128 = 9;
                                        var126 = var126.method873((byte) 58, class135.field2546.method902((byte) -4));
                                    } else if (var127.method904(class108.field2044, true)) {
                                        var126 = var126.method873((byte) 58, class108.field2044.method902((byte) -4));
                                        var128 = 10;
                                    } else if (var127.method904(class30.field468, true)) {
                                        var126 = var126.method873((byte) 58, class30.field468.method902((byte) -4));
                                        var128 = 11;
                                    }
                                }
                                class132 var130 = var126.method896((byte) 122);
                                if (var130.method904(class131.field2413, true)) {
                                    var126 = var126.method873((byte) 58, class131.field2413.method902((byte) -4));
                                    var129 = 1;
                                } else if (var130.method904(class174.field3246, true)) {
                                    var126 = var126.method873((byte) 58, class174.field3246.method902((byte) -4));
                                    var129 = 2;
                                } else if (var130.method904(class105.field1971, true)) {
                                    var129 = 3;
                                    var126 = var126.method873((byte) 58, class105.field1971.method902((byte) -4));
                                } else if (var130.method904(class36.field588, true)) {
                                    var126 = var126.method873((byte) 58, class36.field588.method902((byte) -4));
                                    var129 = 4;
                                } else if (var130.method904(class182.field3346, true)) {
                                    var126 = var126.method873((byte) 58, class182.field3346.method902((byte) -4));
                                    var129 = 5;
                                } else if (class149.field2736 != 0) {
                                    if (var130.method904(class131.field2419, true)) {
                                        var129 = 1;
                                        var126 = var126.method873((byte) 58, class131.field2419.method902((byte) -4));
                                    } else if (var130.method904(class174.field3251, true)) {
                                        var129 = 2;
                                        var126 = var126.method873((byte) 58, class174.field3251.method902((byte) -4));
                                    } else if (var130.method904(class105.field1964, true)) {
                                        var126 = var126.method873((byte) 58, class105.field1964.method902((byte) -4));
                                        var129 = 3;
                                    } else if (var130.method904(class36.field602, true)) {
                                        var126 = var126.method873((byte) 58, class36.field602.method902((byte) -4));
                                        var129 = 4;
                                    } else if (var130.method904(class182.field3344, true)) {
                                        var129 = 5;
                                        var126 = var126.method873((byte) 58, class182.field3344.method902((byte) -4));
                                    }
                                }
                                class64.field1054.method660(69, 3);
                                class64.field1054.method747(0, (byte) -54);
                                int var131 = class64.field1054.field2133;
                                class64.field1054.method747(var128, (byte) -99);
                                class64.field1054.method747(var129, (byte) -89);
                                class195.method1243((byte) 69, var126, class64.field1054);
                                class64.field1054.method731(arg2 - 15826, -var131 + class64.field1054.field2133);
                            }
                            continue;
                        }
                        if (var365 == 5009) {
                            var9 -= 2;
                            class169.field3102++;
                            class132 var132 = class57.field973[var9 + 1];
                            class132 var133 = class57.field973[var9];
                            class64.field1054.method660(219, 3);
                            class64.field1054.method747(0, (byte) -91);
                            int var134 = class64.field1054.field2133;
                            class64.field1054.method709(-27341, var133.method867(-27410));
                            class195.method1243((byte) 91, var132, class64.field1054);
                            class64.field1054.method731(-15826, class64.field1054.field2133 - var134);
                            continue;
                        }
                        if (var365 == 5010) {
                            var6--;
                            int var135 = class195.field3623[var6];
                            class132 var136 = null;
                            if (var135 < 100) {
                                var136 = class233.field4202[var135];
                            }
                            if (var136 == null) {
                                var136 = class64.field1061;
                            }
                            class57.field973[var9++] = var136;
                            continue;
                        }
                        if (var365 == 5011) {
                            var6--;
                            int var137 = class195.field3623[var6];
                            class132 var138 = null;
                            if (var137 < 100) {
                                var138 = class113.field2186[var137];
                            }
                            if (var138 == null) {
                                var138 = class64.field1061;
                            }
                            class57.field973[var9++] = var138;
                            continue;
                        }
                        if (var365 == 5012) {
                            var6--;
                            int var139 = class195.field3623[var6];
                            int var140 = -1;
                            if (var139 < 100) {
                                var140 = class43.field757[var139];
                            }
                            class195.field3623[var6++] = var140;
                            continue;
                        }
                        if (var365 == 5015) {
                            class132 var141;
                            if (class210.field3854 == null || class210.field3854.field2877 == null) {
                                var141 = class152.field2780;
                            } else {
                                var141 = class210.field3854.field2877;
                            }
                            class57.field973[var9++] = var141;
                            continue;
                        }
                        if (var365 == 5016) {
                            class195.field3623[var6++] = class161.field2923;
                            continue;
                        }
                        if (var365 == 5017) {
                            class195.field3623[var6++] = class222.field4046;
                            continue;
                        }
                        if (var365 == 5050) {
                            var6--;
                            int var142 = class195.field3623[var6];
                            class57.field973[var9++] = class99.method618(118, var142).field2323;
                            continue;
                        }
                        if (var365 == 5051) {
                            var6--;
                            int var143 = class195.field3623[var6];
                            class125 var144 = class99.method618(arg2 + 95, var143);
                            if (var144.field2335 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var144.field2335.length;
                            }
                            continue;
                        }
                        if (var365 == 5052) {
                            var6 -= 2;
                            int var145 = class195.field3623[var6];
                            int var146 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class99.method618(89, var145).field2335[var146];
                            continue;
                        }
                        if (var365 == 5053) {
                            var6--;
                            int var147 = class195.field3623[var6];
                            class125 var148 = class99.method618(110, var147);
                            if (var148.field2332 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var148.field2332.length;
                            }
                            continue;
                        }
                        if (var365 == 5054) {
                            var6 -= 2;
                            int var149 = class195.field3623[var6];
                            int var150 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class99.method618(class122.method804(arg2, 101), var149).field2332[var150];
                            continue;
                        }
                        if (var365 == 5055) {
                            var6--;
                            int var151 = class195.field3623[var6];
                            class57.field973[var9++] = class116.method780(var151, (byte) 100).method138((byte) 105);
                            continue;
                        }
                        if (var365 == 5056) {
                            var6--;
                            int var152 = class195.field3623[var6];
                            class21 var153 = class116.method780(var152, (byte) 100);
                            if (var153.field303 == null) {
                                class195.field3623[var6++] = 0;
                            } else {
                                class195.field3623[var6++] = var153.field303.length;
                            }
                            continue;
                        }
                        if (var365 == 5057) {
                            var6 -= 2;
                            int var154 = class195.field3623[var6];
                            int var155 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class116.method780(var154, (byte) 100).field303[var155];
                            continue;
                        }
                        if (var365 == 5058) {
                            class136.field2550 = new class227();
                            var6--;
                            class136.field2550.field4112 = class195.field3623[var6];
                            class136.field2550.field4107 = class116.method780(class136.field2550.field4112, (byte) 100);
                            class136.field2550.field4106 = new int[class136.field2550.field4107.method135((byte) -95)];
                            continue;
                        }
                        if (var365 == 5059) {
                            class209.field3820++;
                            class64.field1054.method660(248, arg2 ^ 0x3);
                            class64.field1054.method747(0, (byte) -60);
                            int var156 = class64.field1054.field2133;
                            class64.field1054.method747(0, (byte) -96);
                            class64.field1054.method715(57, class136.field2550.field4112);
                            class136.field2550.field4107.method146((byte) -100, class136.field2550.field4106, class64.field1054);
                            class64.field1054.method731(-15826, class64.field1054.field2133 - var156);
                            continue;
                        }
                        if (var365 == 5060) {
                            class35.field567++;
                            var9--;
                            class132 var157 = class57.field973[var9];
                            class64.field1054.method660(80, 3);
                            class64.field1054.method747(0, (byte) -86);
                            int var158 = class64.field1054.field2133;
                            class64.field1054.method709(arg2 ^ 0xFFFF9533, var157.method867(-27410));
                            class64.field1054.method715(119, class136.field2550.field4112);
                            class136.field2550.field4107.method146((byte) 82, class136.field2550.field4106, class64.field1054);
                            class64.field1054.method731(-15826, class64.field1054.field2133 - var158);
                            continue;
                        }
                        if (var365 == 5061) {
                            class64.field1054.method660(248, 3);
                            class64.field1054.method747(0, (byte) -36);
                            int var159 = class64.field1054.field2133;
                            class209.field3820++;
                            class64.field1054.method747(1, (byte) -65);
                            class64.field1054.method715(40, class136.field2550.field4112);
                            class136.field2550.field4107.method146((byte) -105, class136.field2550.field4106, class64.field1054);
                            class64.field1054.method731(arg2 ^ 0xFFFFC22E, class64.field1054.field2133 - var159);
                            continue;
                        }
                        if (var365 == 5062) {
                            var6 -= 2;
                            int var160 = class195.field3623[var6];
                            int var161 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class99.method618(arg2 + 108, var160).field2324[var161];
                            continue;
                        }
                        if (var365 == 5063) {
                            var6 -= 2;
                            int var162 = class195.field3623[var6];
                            int var163 = class195.field3623[var6 + 1];
                            class195.field3623[var6++] = class99.method618(101, var162).field2317[var163];
                            continue;
                        }
                        if (var365 == 5064) {
                            var6 -= 2;
                            int var164 = class195.field3623[var6 + 1];
                            int var165 = class195.field3623[var6];
                            if (var164 == -1) {
                                class195.field3623[var6++] = -1;
                            } else {
                                class195.field3623[var6++] = class99.method618(113, var165).method825((byte) -51, var164);
                            }
                            continue;
                        }
                        if (var365 == 5065) {
                            var6 -= 2;
                            int var166 = class195.field3623[var6];
                            int var167 = class195.field3623[var6 + 1];
                            if (var167 == -1) {
                                class195.field3623[var6++] = -1;
                            } else {
                                class195.field3623[var6++] = class99.method618(class122.method804(arg2, 109), var166).method821(true, var167);
                            }
                            continue;
                        }
                        if (var365 == 5066) {
                            var6--;
                            int var168 = class195.field3623[var6];
                            class195.field3623[var6++] = class116.method780(var168, (byte) 100).method135((byte) -88);
                            continue;
                        }
                        if (var365 == 5067) {
                            var6 -= 2;
                            int var169 = class195.field3623[var6 + 1];
                            int var170 = class195.field3623[var6];
                            int var171 = class116.method780(var170, (byte) 100).method147(var169, (byte) -65);
                            System.out.println("chatphrase_getdynamiccommand=" + var171);
                            class195.field3623[var6++] = var171;
                            continue;
                        }
                        if (var365 == 5068) {
                            var6 -= 2;
                            int var172 = class195.field3623[var6];
                            int var173 = class195.field3623[var6 + 1];
                            class136.field2550.field4106[var172] = var173;
                            continue;
                        }
                        if (var365 == 5069) {
                            var6 -= 2;
                            int var174 = class195.field3623[var6];
                            int var175 = class195.field3623[var6 + 1];
                            class136.field2550.field4106[var174] = var175;
                            continue;
                        }
                        if (var365 == 5070) {
                            var6 -= 3;
                            int var176 = class195.field3623[var6 + 1];
                            int var177 = class195.field3623[var6];
                            int var178 = class195.field3623[var6 + 2];
                            class21 var179 = class116.method780(var177, (byte) 100);
                            if (var179.method147(var176, (byte) -65) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class195.field3623[var6++] = var179.method144(var176, var178, class122.method804(arg2, 5010));
                            continue;
                        }
                    } else if (var365 < 5200) {
                        if (var365 == 5100) {
                            if (class9.field85[86]) {
                                class195.field3623[var6++] = 1;
                            } else {
                                class195.field3623[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5101) {
                            if (class9.field85[82]) {
                                class195.field3623[var6++] = 1;
                            } else {
                                class195.field3623[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5102) {
                            if (class9.field85[81]) {
                                class195.field3623[var6++] = 1;
                            } else {
                                class195.field3623[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 5300) {
                        if (var365 == 5200) {
                            var6--;
                            class238.method1511(-11474, class195.field3623[var6]);
                            continue;
                        }
                        if (var365 == 5201) {
                            class195.field3623[var6++] = class118.method788((byte) -7);
                            continue;
                        }
                        if (var365 == 5202) {
                            var6--;
                            class113.method768(class195.field3623[var6], 125);
                            continue;
                        }
                        if (var365 == 5203) {
                            var9--;
                            class227.method1450(class57.field973[var9], true);
                            continue;
                        }
                        if (var365 == 5204) {
                            class57.field973[var9 - 1] = class88.method550(class57.field973[var9 - 1], (byte) -54);
                            continue;
                        }
                        if (var365 == 5205) {
                            var9--;
                            class194.method1235(0, class57.field973[var9]);
                            continue;
                        }
                    } else if (var365 >= 5400) {
                        if (var365 < 5500) {
                            if (var365 == 5400) {
                                var9 -= 2;
                                class52.field868++;
                                class132 var180 = class57.field973[var9];
                                class132 var181 = class57.field973[var9 + 1];
                                var6--;
                                int var182 = class195.field3623[var6];
                                class64.field1054.method660(127, arg2 ^ 0x3);
                                class64.field1054.method747(class172.method1124(var180, (byte) 15) + class172.method1124(var181, (byte) 15) + 1, (byte) -35);
                                class64.field1054.method722(var180, -1607065512);
                                class64.field1054.method722(var181, arg2 - 1607065512);
                                class64.field1054.method747(var182, (byte) -78);
                                continue;
                            }
                            if (var365 == 5401) {
                                var6 -= 2;
                                class2.field19[class195.field3623[var6]] = (short) class110.method696(10, class195.field3623[var6 + 1]);
                                continue;
                            }
                        }
                    } else if (var365 == 5304) {
                        class195.field3623[var6++] = 0;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var364) {
            if (var5.field2526 == null) {
                if (class211.field3871 != 0) {
                    class169.method1108(-57, class74.field1239, 0, class64.field1061);
                }
                class92.method571("CS2 - scr:" + var5.field2760 + " op:" + var10, var364, 107);
            } else {
                class132 var361 = class233.method1477(30, -226189949);
                var361.method895(class191.field3549, false).method895(var5.field2526, false);
                for (int var362 = class19.field284 - 1; var362 >= 0; var362--) {
                    var361.method895(class104.field1953, false).method895(class34.field550[var362].field1892.field2526, false);
                }
                if (var10 == 40) {
                    int var363 = var8[var11];
                    var361.method895(class9.field90, false).method895(class132.method889(var363, (byte) 112), false);
                }
                if (class211.field3871 != 0) {
                    class169.method1108(-72, class187.method1197(new class132[] { class35.field574, var5.field2526 }, -82), 0, class64.field1061);
                }
                class92.method571("CS2 - scr:" + var5.field2760 + " op:" + var10 + new String(var361.method869(-22828)), var364, 118);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ltb;IIIIII)V")
    public static final void method503(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field3767.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field3767[var8] - class213.field3897;
            int var22 = arg0.field3780[var8] - class58.field975;
            int var23 = arg0.field3768[var8] - class191.field3537;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field3760 != null) {
                class206.field3763[var8] = var24;
                class206.field3776[var8] = var27;
                class206.field3762[var8] = var28;
            }
            class206.field3774[var8] = (var24 << 9) / var28 + class50.field856;
            class206.field3761[var8] = (var27 << 9) / var28 + class50.field849;
        }
        class50.field848 = 0;
        int var9 = arg0.field3773.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field3773[var10];
            int var12 = arg0.field3764[var10];
            int var13 = arg0.field3779[var10];
            int var14 = class206.field3774[var11];
            int var15 = class206.field3774[var12];
            int var16 = class206.field3774[var13];
            int var17 = class206.field3761[var11];
            int var18 = class206.field3761[var12];
            int var19 = class206.field3761[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class154.field2818 && class217.method1355(class50.field856 + class171.field3192, class50.field849 + class17.field259, var17, var18, var19, var14, var15, var16)) {
                    class140.field2618 = arg5;
                    class6.field60 = arg6;
                }
                class50.field852 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class50.field861 || var15 > class50.field861 || var16 > class50.field861) {
                    class50.field852 = true;
                }
                if (arg0.field3760 == null || arg0.field3760[var10] == -1) {
                    if (arg0.field3766[var10] != 12345678) {
                        class50.method335(var17, var18, var19, var14, var15, var16, arg0.field3766[var10], arg0.field3775[var10], arg0.field3771[var10]);
                    }
                } else if (class182.field3352) {
                    int var20 = class50.field859.method489(arg0.field3760[var10], (byte) -107);
                    class50.method335(var17, var18, var19, var14, var15, var16, class144.method968(var20, arg0.field3766[var10]), class144.method968(var20, arg0.field3775[var10]), class144.method968(var20, arg0.field3771[var10]));
                } else if (arg0.field3770) {
                    class50.method337(var17, var18, var19, var14, var15, var16, arg0.field3766[var10], arg0.field3775[var10], arg0.field3771[var10], class206.field3763[0], class206.field3763[1], class206.field3763[3], class206.field3776[0], class206.field3776[1], class206.field3776[3], class206.field3762[0], class206.field3762[1], class206.field3762[3], arg0.field3760[var10]);
                } else {
                    class50.method337(var17, var18, var19, var14, var15, var16, arg0.field3766[var10], arg0.field3775[var10], arg0.field3771[var10], class206.field3763[var11], class206.field3763[var12], class206.field3763[var13], class206.field3776[var11], class206.field3776[var12], class206.field3776[var13], class206.field3762[var11], class206.field3762[var12], class206.field3762[var13], arg0.field3760[var10]);
                }
            }
        }
    }
}
