package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("w")
public class class12 {

    @ObfuscatedName("w.h")
    public static int[] field190 = new int[5];

    @ObfuscatedName("w.k")
    public static int[][] field191 = new int[5][5000];

    @ObfuscatedName("w.r")
    public static int[] field192 = new int[1000];

    @ObfuscatedName("w.l")
    public static String[] field187 = new String[1000];

    @ObfuscatedName("w.i")
    public static int field193 = 0;

    @ObfuscatedName("w.e")
    public static class8[] field195 = new class8[50];

    @ObfuscatedName("w.w")
    public static Calendar field196 = Calendar.getInstance();

    @ObfuscatedName("w.v")
    public static final String[] field197 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.t(Lda;I)V")
    public static void method870(class122 arg0) {
        Object[] var1 = arg0.field1591;
        int var2 = (Integer) var1[0];
        class151 var3 = class151.method1009(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field2257;
        int[] var8 = var3.field2264;
        byte var9 = -1;
        field193 = 0;
        try {
            Statics.field188 = new int[var3.field2261];
            int var10 = 0;
            Statics.field189 = new String[var3.field2262];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field1586;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field1587;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field1585 == null ? -1 : arg0.field1585.field1778;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field1584;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field1585 == null ? -1 : arg0.field1585.field1779;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field1589 == null ? -1 : arg0.field1589.field1778;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field1589 == null ? -1 : arg0.field1589.field1779;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field1590;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field1588;
                    }
                    Statics.field188[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field1592;
                    }
                    Statics.field189[var11++] = var14;
                }
            }
            int var15 = 0;
            label2345: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var368 = var7[var6];
                if (var368 < 100) {
                    if (var368 == 0) {
                        field192[var4++] = var8[var6];
                        continue;
                    }
                    if (var368 == 1) {
                        int var16 = var8[var6];
                        field192[var4++] = class89.field1205[var16];
                        continue;
                    }
                    if (var368 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class89.field1205[var17] = field192[var4];
                        continue;
                    }
                    if (var368 == 3) {
                        field187[var5++] = var3.field2260[var6];
                        continue;
                    }
                    if (var368 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var368 == 7) {
                        var4 -= 2;
                        if (field192[var4 + 1] != field192[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 8) {
                        var4 -= 2;
                        if (field192[var4 + 1] == field192[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 9) {
                        var4 -= 2;
                        if (field192[var4] < field192[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 10) {
                        var4 -= 2;
                        if (field192[var4] > field192[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 21) {
                        if (field193 == 0) {
                            return;
                        }
                        class8 var18 = field195[--field193];
                        var3 = var18.field120;
                        var7 = var3.field2257;
                        var8 = var3.field2264;
                        var6 = var18.field121;
                        Statics.field188 = var18.field122;
                        Statics.field189 = var18.field123;
                        continue;
                    }
                    if (var368 == 25) {
                        int var19 = var8[var6];
                        field192[var4++] = Statics.method11(var19);
                        continue;
                    }
                    if (var368 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class89.method1316(var20, field192[var4]);
                        continue;
                    }
                    if (var368 == 31) {
                        var4 -= 2;
                        if (field192[var4] <= field192[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 32) {
                        var4 -= 2;
                        if (field192[var4] >= field192[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 33) {
                        field192[var4++] = Statics.field188[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var368 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field188[var10001] = field192[var4];
                        continue;
                    }
                    if (var368 == 35) {
                        field187[var5++] = Statics.field189[var8[var6]];
                        continue;
                    }
                    if (var368 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field189[var10001] = field187[var5];
                        continue;
                    }
                    if (var368 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = Statics.method691(field187, var5, var21);
                        field187[var5++] = var22;
                        continue;
                    }
                    if (var368 == 38) {
                        var4--;
                        continue;
                    }
                    if (var368 == 39) {
                        var5--;
                        continue;
                    }
                    if (var368 == 40) {
                        int var23 = var8[var6];
                        class151 var24 = class151.method1009(var23);
                        int[] var25 = new int[var24.field2261];
                        String[] var26 = new String[var24.field2262];
                        for (int var27 = 0; var27 < var24.field2263; var27++) {
                            var25[var27] = field192[var4 - var24.field2263 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field2258; var28++) {
                            var26[var28] = field187[var5 - var24.field2258 + var28];
                        }
                        var4 -= var24.field2263;
                        var5 -= var24.field2258;
                        class8 var29 = new class8();
                        var29.field120 = var3;
                        var29.field121 = var6;
                        var29.field122 = Statics.field188;
                        var29.field123 = Statics.field189;
                        field195[++field193 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field2257;
                        var8 = var24.field2264;
                        var6 = -1;
                        Statics.field188 = var25;
                        Statics.field189 = var26;
                        continue;
                    }
                    if (var368 == 42) {
                        field192[var4++] = client.field1976[var8[var6]];
                        continue;
                    }
                    if (var368 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field1976[var10001] = field192[var4];
                        continue;
                    }
                    if (var368 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field192[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field190[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2345;
                                }
                                field191[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field192[var4];
                        if (var36 >= 0 && var36 < field190[var35]) {
                            field192[var4++] = field191[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field192[var4];
                        if (var38 >= 0 && var38 < field190[var37]) {
                            field191[var37][var38] = field192[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 47) {
                        String var39 = client.field2116[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field187[var5++] = var39;
                        continue;
                    }
                    if (var368 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field2116[var10001] = field187[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var368 < 1000) {
                    if (var368 == 100) {
                        var4 -= 3;
                        int var41 = field192[var4];
                        int var42 = field192[var4 + 1];
                        int var43 = field192[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class140 var44 = class140.method53(var41);
                        if (var44.field1877 == null) {
                            var44.field1877 = new class140[var43 + 1];
                        }
                        if (var44.field1877.length <= var43) {
                            class140[] var45 = new class140[var43 + 1];
                            for (int var46 = 0; var46 < var44.field1877.length; var46++) {
                                var45[var46] = var44.field1877[var46];
                            }
                            var44.field1877 = var45;
                        }
                        if (var43 > 0 && var44.field1877[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class140 var47 = new class140();
                        var47.field1780 = var42;
                        var47.field1789 = var47.field1778 = var44.field1778;
                        var47.field1779 = var43;
                        var47.field1777 = true;
                        var44.field1877[var43] = var47;
                        if (var40) {
                            Statics.field14 = var47;
                        } else {
                            Statics.field1501 = var47;
                        }
                        client.method968(var44);
                        continue;
                    }
                    if (var368 == 101) {
                        class140 var48 = var40 ? Statics.field14 : Statics.field1501;
                        class140 var49 = class140.method53(var48.field1778);
                        var49.field1877[var48.field1779] = null;
                        client.method968(var49);
                        continue;
                    }
                    if (var368 == 102) {
                        var4--;
                        class140 var50 = class140.method53(field192[var4]);
                        var50.field1877 = null;
                        client.method968(var50);
                        continue;
                    }
                    if (var368 == 200) {
                        var4 -= 2;
                        int var51 = field192[var4];
                        int var52 = field192[var4 + 1];
                        class140 var53 = class140.method858(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field192[var4++] = 1;
                            if (var40) {
                                Statics.field14 = var53;
                            } else {
                                Statics.field1501 = var53;
                            }
                            continue;
                        }
                        field192[var4++] = 0;
                        continue;
                    }
                } else if (!(var368 < 1000 || var368 >= 1100) || !(var368 < 2000 || var368 >= 2100)) {
                    class140 var54;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var54 = class140.method53(field192[var4]);
                    } else {
                        var54 = var40 ? Statics.field14 : Statics.field1501;
                    }
                    if (var368 == 1000) {
                        var4 -= 2;
                        var54.field1769 = field192[var4];
                        var54.field1784 = field192[var4 + 1];
                        client.method968(var54);
                        continue;
                    }
                    if (var368 == 1001) {
                        var4 -= 2;
                        var54.field1791 = field192[var4];
                        var54.field1788 = field192[var4 + 1];
                        client.method968(var54);
                        continue;
                    }
                    if (var368 == 1003) {
                        var4--;
                        boolean var55 = field192[var4] == 1;
                        if (var54.field1790 != var55) {
                            var54.field1790 = var55;
                            client.method968(var54);
                        }
                        continue;
                    }
                } else if (!(var368 < 1100 || var368 >= 1200) || !(var368 < 2100 || var368 >= 2200)) {
                    class140 var56;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var56 = class140.method53(field192[var4]);
                    } else {
                        var56 = var40 ? Statics.field14 : Statics.field1501;
                    }
                    if (var368 == 1100) {
                        var4 -= 2;
                        var56.field1820 = field192[var4];
                        if (var56.field1820 > var56.field1793 - var56.field1791) {
                            var56.field1820 = var56.field1793 - var56.field1791;
                        }
                        if (var56.field1820 < 0) {
                            var56.field1820 = 0;
                        }
                        var56.field1774 = field192[var4 + 1];
                        if (var56.field1774 > var56.field1794 - var56.field1788) {
                            var56.field1774 = var56.field1794 - var56.field1788;
                        }
                        if (var56.field1774 < 0) {
                            var56.field1774 = 0;
                        }
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1101) {
                        var4--;
                        var56.field1795 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1102) {
                        var4--;
                        var56.field1799 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1103) {
                        var4--;
                        var56.field1892 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1104) {
                        var4--;
                        var56.field1801 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1105) {
                        var4--;
                        var56.field1806 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1106) {
                        var4--;
                        var56.field1804 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1107) {
                        var4--;
                        var56.field1805 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1108) {
                        var56.field1810 = 1;
                        var4--;
                        var56.field1811 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1109) {
                        var4 -= 6;
                        var56.field1858 = field192[var4];
                        var56.field1817 = field192[var4 + 1];
                        var56.field1802 = field192[var4 + 2];
                        var56.field1798 = field192[var4 + 3];
                        var56.field1792 = field192[var4 + 4];
                        var56.field1841 = field192[var4 + 5];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1110) {
                        var4--;
                        int var57 = field192[var4];
                        if (var56.field1816 != var57) {
                            var56.field1816 = var57;
                            var56.field1876 = 0;
                            var56.field1885 = 0;
                            client.method968(var56);
                        }
                        continue;
                    }
                    if (var368 == 1111) {
                        var4--;
                        var56.field1823 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1112) {
                        var5--;
                        String var58 = field187[var5];
                        if (!var58.equals(var56.field1825)) {
                            var56.field1825 = var58;
                            client.method968(var56);
                        }
                        continue;
                    }
                    if (var368 == 1113) {
                        var4--;
                        var56.field1824 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1114) {
                        var4 -= 3;
                        var56.field1871 = field192[var4];
                        var56.field1854 = field192[var4 + 1];
                        var56.field1827 = field192[var4 + 2];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1115) {
                        var4--;
                        var56.field1830 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1116) {
                        var4--;
                        var56.field1846 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1117) {
                        var4--;
                        var56.field1868 = field192[var4];
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1118) {
                        var4--;
                        var56.field1870 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1119) {
                        var4--;
                        var56.field1809 = field192[var4] == 1;
                        client.method968(var56);
                        continue;
                    }
                    if (var368 == 1120) {
                        var4 -= 2;
                        var56.field1793 = field192[var4];
                        var56.field1794 = field192[var4 + 1];
                        client.method968(var56);
                        continue;
                    }
                } else if (var368 >= 1200 && var368 < 1300 || var368 >= 2200 && var368 < 2300) {
                    class140 var59;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var59 = class140.method53(field192[var4]);
                    } else {
                        var59 = var40 ? Statics.field14 : Statics.field1501;
                    }
                    client.method968(var59);
                    if (var368 == 1200) {
                        var4 -= 2;
                        int var60 = field192[var4];
                        int var61 = field192[var4 + 1];
                        var59.field1783 = var60;
                        var59.field1886 = var61;
                        class161 var62 = class161.method2496(var60);
                        var59.field1802 = var62.field2463;
                        var59.field1798 = var62.field2439;
                        var59.field1792 = var62.field2440;
                        var59.field1858 = var62.field2441;
                        var59.field1817 = var62.field2442;
                        var59.field1841 = var62.field2450;
                        if (var59.field1791 > 0) {
                            var59.field1841 = var59.field1841 * 32 / var59.field1791;
                        }
                        continue;
                    }
                    if (var368 == 1201) {
                        var59.field1810 = 2;
                        var4--;
                        var59.field1811 = field192[var4];
                        continue;
                    }
                    if (var368 == 1202) {
                        var59.field1810 = 3;
                        var59.field1811 = Statics.field1127.field2792.method1133();
                        continue;
                    }
                } else if ((var368 < 1300 || var368 >= 1400) && (var368 < 2300 || var368 >= 2400)) {
                    if (var368 >= 1400 && var368 < 1500 || var368 >= 2400 && var368 < 2500) {
                        class140 var67;
                        if (var368 >= 2000) {
                            var368 -= 1000;
                            var4--;
                            var67 = class140.method53(field192[var4]);
                        } else {
                            var67 = var40 ? Statics.field14 : Statics.field1501;
                        }
                        var5--;
                        String var68 = field187[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field192[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field192[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field187[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field192[var4]);
                            }
                        }
                        var4--;
                        int var73 = field192[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var368 == 1400) {
                            var67.field1847 = var71;
                        }
                        if (var368 == 1401) {
                            var67.field1850 = var71;
                        }
                        if (var368 == 1402) {
                            var67.field1843 = var71;
                        }
                        if (var368 == 1403) {
                            var67.field1851 = var71;
                        }
                        if (var368 == 1404) {
                            var67.field1853 = var71;
                        }
                        if (var368 == 1405) {
                            var67.field1872 = var71;
                        }
                        if (var368 == 1406) {
                            var67.field1775 = var71;
                        }
                        if (var368 == 1407) {
                            var67.field1808 = var71;
                            var67.field1859 = var69;
                        }
                        if (var368 == 1408) {
                            var67.field1864 = var71;
                        }
                        if (var368 == 1409) {
                            var67.field1865 = var71;
                        }
                        if (var368 == 1410) {
                            var67.field1818 = var71;
                        }
                        if (var368 == 1411) {
                            var67.field1848 = var71;
                        }
                        if (var368 == 1412) {
                            var67.field1852 = var71;
                        }
                        if (var368 == 1414) {
                            var67.field1860 = var71;
                            var67.field1861 = var69;
                        }
                        if (var368 == 1415) {
                            var67.field1862 = var71;
                            var67.field1863 = var69;
                        }
                        if (var368 == 1416) {
                            var67.field1856 = var71;
                        }
                        if (var368 == 1417) {
                            var67.field1866 = var71;
                        }
                        if (var368 == 1418) {
                            var67.field1867 = var71;
                        }
                        if (var368 == 1419) {
                            var67.field1890 = var71;
                        }
                        if (var368 == 1420) {
                            var67.field1869 = var71;
                        }
                        if (var368 == 1421) {
                            var67.field1875 = var71;
                        }
                        if (var368 == 1422) {
                            var67.field1849 = var71;
                        }
                        if (var368 == 1423) {
                            var67.field1781 = var71;
                        }
                        if (var368 == 1424) {
                            var67.field1873 = var71;
                        }
                        var67.field1845 = true;
                        continue;
                    }
                    if (var368 < 1600) {
                        class140 var74 = var40 ? Statics.field14 : Statics.field1501;
                        if (var368 == 1500) {
                            field192[var4++] = var74.field1769;
                            continue;
                        }
                        if (var368 == 1501) {
                            field192[var4++] = var74.field1784;
                            continue;
                        }
                        if (var368 == 1502) {
                            field192[var4++] = var74.field1791;
                            continue;
                        }
                        if (var368 == 1503) {
                            field192[var4++] = var74.field1788;
                            continue;
                        }
                        if (var368 == 1504) {
                            field192[var4++] = var74.field1790 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 1505) {
                            field192[var4++] = var74.field1789;
                            continue;
                        }
                    } else if (var368 < 1700) {
                        class140 var75 = var40 ? Statics.field14 : Statics.field1501;
                        if (var368 == 1600) {
                            field192[var4++] = var75.field1820;
                            continue;
                        }
                        if (var368 == 1601) {
                            field192[var4++] = var75.field1774;
                            continue;
                        }
                        if (var368 == 1602) {
                            field187[var5++] = var75.field1825;
                            continue;
                        }
                        if (var368 == 1603) {
                            field192[var4++] = var75.field1793;
                            continue;
                        }
                        if (var368 == 1604) {
                            field192[var4++] = var75.field1794;
                            continue;
                        }
                        if (var368 == 1605) {
                            field192[var4++] = var75.field1841;
                            continue;
                        }
                        if (var368 == 1606) {
                            field192[var4++] = var75.field1802;
                            continue;
                        }
                        if (var368 == 1607) {
                            field192[var4++] = var75.field1792;
                            continue;
                        }
                        if (var368 == 1608) {
                            field192[var4++] = var75.field1798;
                            continue;
                        }
                    } else if (var368 < 1800) {
                        class140 var76 = var40 ? Statics.field14 : Statics.field1501;
                        if (var368 == 1700) {
                            field192[var4++] = var76.field1783;
                            continue;
                        }
                        if (var368 == 1701) {
                            if (var76.field1783 == -1) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = var76.field1886;
                            }
                            continue;
                        }
                        if (var368 == 1702) {
                            field192[var4++] = var76.field1779;
                            continue;
                        }
                    } else if (var368 < 1900) {
                        class140 var77 = var40 ? Statics.field14 : Statics.field1501;
                        if (var368 == 1800) {
                            int[] var78 = field192;
                            int var79 = var4++;
                            int var80 = client.method357(var77);
                            int var81 = var80 >> 11 & 0x3F;
                            var78[var79] = var81;
                            continue;
                        }
                        if (var368 == 1801) {
                            var4--;
                            int var82 = field192[var4];
                            int var369 = var82 - 1;
                            if (var77.field1839 != null && var369 < var77.field1839.length && var77.field1839[var369] != null) {
                                field187[var5++] = var77.field1839[var369];
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 1802) {
                            if (var77.field1838 == null) {
                                field187[var5++] = "";
                            } else {
                                field187[var5++] = var77.field1838;
                            }
                            continue;
                        }
                    } else if (var368 < 2600) {
                        var4--;
                        class140 var83 = class140.method53(field192[var4]);
                        if (var368 == 2500) {
                            field192[var4++] = var83.field1769;
                            continue;
                        }
                        if (var368 == 2501) {
                            field192[var4++] = var83.field1784;
                            continue;
                        }
                        if (var368 == 2502) {
                            field192[var4++] = var83.field1791;
                            continue;
                        }
                        if (var368 == 2503) {
                            field192[var4++] = var83.field1788;
                            continue;
                        }
                        if (var368 == 2504) {
                            field192[var4++] = var83.field1790 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 2505) {
                            field192[var4++] = var83.field1789;
                            continue;
                        }
                    } else if (var368 < 2700) {
                        var4--;
                        class140 var84 = class140.method53(field192[var4]);
                        if (var368 == 2600) {
                            field192[var4++] = var84.field1820;
                            continue;
                        }
                        if (var368 == 2601) {
                            field192[var4++] = var84.field1774;
                            continue;
                        }
                        if (var368 == 2602) {
                            field187[var5++] = var84.field1825;
                            continue;
                        }
                        if (var368 == 2603) {
                            field192[var4++] = var84.field1793;
                            continue;
                        }
                        if (var368 == 2604) {
                            field192[var4++] = var84.field1794;
                            continue;
                        }
                        if (var368 == 2605) {
                            field192[var4++] = var84.field1841;
                            continue;
                        }
                        if (var368 == 2606) {
                            field192[var4++] = var84.field1802;
                            continue;
                        }
                        if (var368 == 2607) {
                            field192[var4++] = var84.field1792;
                            continue;
                        }
                        if (var368 == 2608) {
                            field192[var4++] = var84.field1798;
                            continue;
                        }
                    } else if (var368 < 2800) {
                        if (var368 == 2700) {
                            var4--;
                            class140 var85 = class140.method53(field192[var4]);
                            field192[var4++] = var85.field1783;
                            continue;
                        }
                        if (var368 == 2701) {
                            var4--;
                            class140 var86 = class140.method53(field192[var4]);
                            if (var86.field1783 == -1) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = var86.field1886;
                            }
                            continue;
                        }
                        if (var368 == 2702) {
                            var4--;
                            int var87 = field192[var4];
                            class123 var88 = (class123) client.field2080.method1259((long) var87);
                            if (var88 == null) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var368 < 2900) {
                        var4--;
                        class140 var89 = class140.method53(field192[var4]);
                        if (var368 == 2800) {
                            int[] var90 = field192;
                            int var91 = var4++;
                            int var92 = client.method357(var89);
                            int var93 = var92 >> 11 & 0x3F;
                            var90[var91] = var93;
                            continue;
                        }
                        if (var368 == 2801) {
                            var4--;
                            int var94 = field192[var4];
                            int var370 = var94 - 1;
                            if (var89.field1839 != null && var370 < var89.field1839.length && var89.field1839[var370] != null) {
                                field187[var5++] = var89.field1839[var370];
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 2802) {
                            if (var89.field1838 == null) {
                                field187[var5++] = "";
                            } else {
                                field187[var5++] = var89.field1838;
                            }
                            continue;
                        }
                    } else if (var368 < 3200) {
                        if (var368 == 3100) {
                            var5--;
                            String var95 = field187[var5];
                            client.method701(0, "", var95);
                            continue;
                        }
                        if (var368 == 3101) {
                            var4 -= 2;
                            client.method1102(Statics.field1127, field192[var4], field192[var4 + 1]);
                            continue;
                        }
                        if (var368 == 3103) {
                            client.field2176.method2288(59);
                            for (class123 var96 = (class123) client.field2080.method1262(); var96 != null; var96 = (class123) client.field2080.method1266()) {
                                if (var96.field1596 == 0 || var96.field1596 == 3) {
                                    client.method1114(var96, true);
                                }
                            }
                            if (client.field2083 != null) {
                                client.method968(client.field2083);
                                client.field2083 = null;
                            }
                            continue;
                        }
                        if (var368 == 3104) {
                            var5--;
                            String var97 = field187[var5];
                            int var98 = 0;
                            boolean var99 = false;
                            boolean var100 = false;
                            int var101 = 0;
                            int var102 = var97.length();
                            int var103 = 0;
                            boolean var105;
                            while (true) {
                                if (var103 >= var102) {
                                    var105 = var100;
                                    break;
                                }
                                label2522: {
                                    char var104 = var97.charAt(var103);
                                    if (var103 == 0) {
                                        if (var104 == '-') {
                                            var99 = true;
                                            break label2522;
                                        }
                                        if (var104 == '+') {
                                            break label2522;
                                        }
                                    }
                                    int var371;
                                    if (var104 >= '0' && var104 <= '9') {
                                        var371 = var104 - '0';
                                    } else if (var104 >= 'A' && var104 <= 'Z') {
                                        var371 = var104 - '7';
                                    } else {
                                        if (var104 < 'a' || var104 > 'z') {
                                            var105 = false;
                                            break;
                                        }
                                        var371 = var104 - 'W';
                                    }
                                    if (var371 >= 10) {
                                        var105 = false;
                                        break;
                                    }
                                    if (var99) {
                                        var371 = -var371;
                                    }
                                    int var106 = var101 * 10 + var371;
                                    if (var106 / 10 != var101) {
                                        var105 = false;
                                        break;
                                    }
                                    var101 = var106;
                                    var100 = true;
                                }
                                var103++;
                            }
                            if (var105) {
                                int var108 = class82.method740(var97, 10, true);
                                var98 = var108;
                            }
                            client.field2176.method2288(145);
                            client.field2176.method1561(var98);
                            continue;
                        }
                        if (var368 == 3105) {
                            var5--;
                            String var109 = field187[var5];
                            client.field2176.method2288(56);
                            client.field2176.method1558(var109.length() + 1);
                            client.field2176.method1563(var109);
                            continue;
                        }
                        if (var368 == 3106) {
                            var5--;
                            String var110 = field187[var5];
                            client.field2176.method2288(104);
                            client.field2176.method1558(var110.length() + 1);
                            client.field2176.method1563(var110);
                            continue;
                        }
                        if (var368 == 3107) {
                            var4--;
                            int var111 = field192[var4];
                            var5--;
                            String var112 = field187[var5];
                            client.method967(var111, var112);
                            continue;
                        }
                        if (var368 == 3108) {
                            var4 -= 3;
                            int var113 = field192[var4];
                            int var114 = field192[var4 + 1];
                            int var115 = field192[var4 + 2];
                            class140 var116 = class140.method53(var115);
                            client.method860(var116, var113, var114);
                            continue;
                        }
                        if (var368 == 3109) {
                            var4 -= 2;
                            int var117 = field192[var4];
                            int var118 = field192[var4 + 1];
                            class140 var119 = var40 ? Statics.field14 : Statics.field1501;
                            client.method860(var119, var117, var118);
                            continue;
                        }
                    } else if (var368 < 3300) {
                        if (var368 == 3200) {
                            var4 -= 3;
                            int var120 = field192[var4];
                            int var121 = field192[var4 + 1];
                            int var122 = field192[var4 + 2];
                            if (client.field2168 != 0 && var121 != 0 && client.field1992 < 50) {
                                client.field2172[client.field1992] = var120;
                                client.field2095[client.field1992] = var121;
                                client.field1989[client.field1992] = var122;
                                client.field1931[client.field1992] = null;
                                client.field2017[client.field1992] = 0;
                                client.field1992++;
                            }
                            continue;
                        }
                        if (var368 == 3201) {
                            var4--;
                            int var123 = field192[var4];
                            if (var123 == -1 && !client.field2166) {
                                Statics.field1110.method2263();
                                class78.field1109 = 1;
                                Statics.field1106 = null;
                            } else if (var123 != -1 && client.field2165 != var123 && client.field2164 != 0 && !client.field2166) {
                                class78.method2641(2, Statics.field1095, var123, 0, client.field2164, false);
                            }
                            client.field2165 = var123;
                            continue;
                        }
                        if (var368 == 3202) {
                            var4 -= 2;
                            client.method112(field192[var4], field192[var4 + 1]);
                            continue;
                        }
                    } else if (var368 < 3400) {
                        if (var368 == 3300) {
                            field192[var4++] = client.field1917;
                            continue;
                        }
                        if (var368 == 3301) {
                            var4 -= 2;
                            int var124 = field192[var4];
                            int var125 = field192[var4 + 1];
                            field192[var4++] = class126.method1128(var124, var125);
                            continue;
                        }
                        if (var368 == 3302) {
                            var4 -= 2;
                            int var126 = field192[var4];
                            int var127 = field192[var4 + 1];
                            field192[var4++] = Statics.method787(var126, var127);
                            continue;
                        }
                        if (var368 == 3303) {
                            var4 -= 2;
                            int var128 = field192[var4];
                            int var129 = field192[var4 + 1];
                            int[] var130 = field192;
                            int var131 = var4++;
                            class126 var132 = (class126) class126.field1624.method1259((long) var128);
                            int var133;
                            if (var132 == null) {
                                var133 = 0;
                            } else if (var129 == -1) {
                                var133 = 0;
                            } else {
                                int var134 = 0;
                                for (int var135 = 0; var135 < var132.field1625.length; var135++) {
                                    if (var132.field1623[var135] == var129) {
                                        var134 += var132.field1625[var135];
                                    }
                                }
                                var133 = var134;
                            }
                            var130[var131] = var133;
                            continue;
                        }
                        if (var368 == 3304) {
                            var4--;
                            int var136 = field192[var4];
                            field192[var4++] = class162.method2543(var136).field2470;
                            continue;
                        }
                        if (var368 == 3305) {
                            var4--;
                            int var137 = field192[var4];
                            field192[var4++] = client.field2056[var137];
                            continue;
                        }
                        if (var368 == 3306) {
                            var4--;
                            int var138 = field192[var4];
                            field192[var4++] = client.field2057[var138];
                            continue;
                        }
                        if (var368 == 3307) {
                            var4--;
                            int var139 = field192[var4];
                            field192[var4++] = client.field2035[var139];
                            continue;
                        }
                        if (var368 == 3308) {
                            int var140 = Statics.field1622;
                            int var141 = (Statics.field1127.field2642 >> 7) + Statics.field1739;
                            int var142 = (Statics.field1127.field2614 >> 7) + Statics.field1766;
                            field192[var4++] = (var140 << 28) + (var141 << 14) + var142;
                            continue;
                        }
                        if (var368 == 3309) {
                            var4--;
                            int var143 = field192[var4];
                            field192[var4++] = var143 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3310) {
                            var4--;
                            int var144 = field192[var4];
                            field192[var4++] = var144 >> 28;
                            continue;
                        }
                        if (var368 == 3311) {
                            var4--;
                            int var145 = field192[var4];
                            field192[var4++] = var145 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3312) {
                            field192[var4++] = client.field1911 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3313) {
                            var4 -= 2;
                            int var146 = field192[var4] + 32768;
                            int var147 = field192[var4 + 1];
                            field192[var4++] = class126.method1128(var146, var147);
                            continue;
                        }
                        if (var368 == 3314) {
                            var4 -= 2;
                            int var148 = field192[var4] + 32768;
                            int var149 = field192[var4 + 1];
                            field192[var4++] = Statics.method787(var148, var149);
                            continue;
                        }
                        if (var368 == 3315) {
                            var4 -= 2;
                            int var150 = field192[var4] + 32768;
                            int var151 = field192[var4 + 1];
                            int[] var152 = field192;
                            int var153 = var4++;
                            class126 var154 = (class126) class126.field1624.method1259((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = 0;
                            } else if (var151 == -1) {
                                var155 = 0;
                            } else {
                                int var156 = 0;
                                for (int var157 = 0; var157 < var154.field1625.length; var157++) {
                                    if (var154.field1623[var157] == var151) {
                                        var156 += var154.field1625[var157];
                                    }
                                }
                                var155 = var156;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var368 == 3316) {
                            if (client.field2169 >= 2) {
                                field192[var4++] = client.field2169;
                            } else {
                                field192[var4++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 3317) {
                            field192[var4++] = client.field2186;
                            continue;
                        }
                        if (var368 == 3318) {
                            field192[var4++] = client.field2010;
                            continue;
                        }
                        if (var368 == 3321) {
                            field192[var4++] = client.field2084;
                            continue;
                        }
                        if (var368 == 3322) {
                            field192[var4++] = client.field2085;
                            continue;
                        }
                        if (var368 == 3323) {
                            if (client.field1969) {
                                field192[var4++] = 1;
                            } else {
                                field192[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3500) {
                        if (var368 == 3400) {
                            var4 -= 2;
                            int var158 = field192[var4];
                            int var159 = field192[var4 + 1];
                            class160 var160 = (class160) class160.field2418.method1231((long) var158);
                            class160 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field2421.method1015(8, var158);
                                class160 var163 = new class160();
                                if (var162 != null) {
                                    var163.method2491(new class135(var162));
                                }
                                class160.field2418.method1232(var163, (long) var158);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            class160 var164 = var161;
                            if (var161.field2419 != 's') {
                            }
                            for (int var165 = 0; var165 < var164.field2422; var165++) {
                                if (var164.field2423[var165] == var159) {
                                    field187[var5++] = var164.field2416[var165];
                                    var164 = null;
                                    break;
                                }
                            }
                            if (var164 != null) {
                                field187[var5++] = var164.field2420;
                            }
                            continue;
                        }
                        if (var368 == 3408) {
                            var4 -= 4;
                            int var166 = field192[var4];
                            int var167 = field192[var4 + 1];
                            int var168 = field192[var4 + 2];
                            int var169 = field192[var4 + 3];
                            class160 var170 = (class160) class160.field2418.method1231((long) var168);
                            class160 var171;
                            if (var170 == null) {
                                byte[] var172 = Statics.field2421.method1015(8, var168);
                                class160 var173 = new class160();
                                if (var172 != null) {
                                    var173.method2491(new class135(var172));
                                }
                                class160.field2418.method1232(var173, (long) var168);
                                var171 = var173;
                            } else {
                                var171 = var170;
                            }
                            class160 var174 = var171;
                            if (var171.field2425 == var166 && var171.field2419 == var167) {
                                for (int var175 = 0; var175 < var174.field2422; var175++) {
                                    if (var174.field2423[var175] == var169) {
                                        if (var167 == 115) {
                                            field187[var5++] = var174.field2416[var175];
                                        } else {
                                            field192[var4++] = var174.field2417[var175];
                                        }
                                        var174 = null;
                                        break;
                                    }
                                }
                                if (var174 != null) {
                                    if (var167 == 115) {
                                        field187[var5++] = var174.field2420;
                                    } else {
                                        field192[var4++] = var174.field2424;
                                    }
                                }
                                continue;
                            }
                            if (var167 == 115) {
                                field187[var5++] = "null";
                            } else {
                                field192[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3700) {
                        if (var368 == 3600) {
                            if (client.field2043 == 0) {
                                field192[var4++] = -2;
                            } else if (client.field2043 == 1) {
                                field192[var4++] = -1;
                            } else {
                                field192[var4++] = client.field2031;
                            }
                            continue;
                        }
                        if (var368 == 3601) {
                            var4--;
                            int var176 = field192[var4];
                            if (client.field2043 == 2 && var176 < client.field2031) {
                                field187[var5++] = client.field2188[var176].field172;
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 3602) {
                            var4--;
                            int var177 = field192[var4];
                            if (client.field2043 == 2 && var177 < client.field2031) {
                                field192[var4++] = client.field2188[var177].field171;
                                continue;
                            }
                            field192[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3603) {
                            var4--;
                            int var178 = field192[var4];
                            if (client.field2043 == 2 && var178 < client.field2031) {
                                field192[var4++] = client.field2188[var178].field170;
                                continue;
                            }
                            field192[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3604) {
                            var5--;
                            String var179 = field187[var5];
                            var4--;
                            int var180 = field192[var4];
                            client.field2176.method2288(34);
                            client.field2176.method1558(class135.method878(var179) + 1);
                            client.field2176.method1594(var180);
                            client.field2176.method1563(var179);
                            continue;
                        }
                        if (var368 == 3605) {
                            var5--;
                            String var181 = field187[var5];
                            client.method1809(var181);
                            continue;
                        }
                        if (var368 == 3606) {
                            var5--;
                            String var182 = field187[var5];
                            if (var182 == null) {
                                continue;
                            }
                            String var183 = class83.method1463(var182, Statics.field359);
                            if (var183 == null) {
                                continue;
                            }
                            int var184 = 0;
                            while (true) {
                                if (var184 >= client.field2031) {
                                    continue label2345;
                                }
                                class10 var185 = client.field2188[var184];
                                String var186 = var185.field172;
                                String var187 = class83.method1463(var186, Statics.field359);
                                boolean var188;
                                if (var182 == null || var186 == null) {
                                    var188 = false;
                                } else if (var182.startsWith("#") || var186.startsWith("#")) {
                                    var188 = var182.equals(var186);
                                } else {
                                    var188 = var183.equals(var187);
                                }
                                if (var188) {
                                    client.field2031--;
                                    for (int var189 = var184; var189 < client.field2031; var189++) {
                                        client.field2188[var189] = client.field2188[var189 + 1];
                                    }
                                    client.field2112 = client.field2102;
                                    client.field2176.method2288(94);
                                    client.field2176.method1558(class135.method878(var182));
                                    client.field2176.method1563(var182);
                                    continue label2345;
                                }
                                var184++;
                            }
                        }
                        if (var368 == 3607) {
                            var5--;
                            String var190 = field187[var5];
                            if (var190 == null) {
                                continue;
                            }
                            if (client.field2190 >= 100) {
                                client.method701(0, "", class74.field1022);
                                continue;
                            }
                            String var191 = class83.method1463(var190, Statics.field359);
                            if (var191 == null) {
                                continue;
                            }
                            for (int var192 = 0; var192 < client.field2190; var192++) {
                                class4 var193 = client.field1986[var192];
                                String var194 = class83.method1463(var193.field43, Statics.field359);
                                if (var194 != null && var194.equals(var191)) {
                                    client.method701(0, "", var190 + class74.field1018);
                                    continue label2345;
                                }
                                if (var193.field42 != null) {
                                    String var195 = class83.method1463(var193.field42, Statics.field359);
                                    if (var195 != null && var195.equals(var191)) {
                                        client.method701(0, "", var190 + class74.field1018);
                                        continue label2345;
                                    }
                                }
                            }
                            for (int var196 = 0; var196 < client.field2031; var196++) {
                                class10 var197 = client.field2188[var196];
                                String var198 = class83.method1463(var197.field172, Statics.field359);
                                if (var198 != null && var198.equals(var191)) {
                                    client.method701(0, "", class74.field1023 + var190 + class74.field1024);
                                    continue label2345;
                                }
                                if (var197.field169 != null) {
                                    String var199 = class83.method1463(var197.field169, Statics.field359);
                                    if (var199 != null && var199.equals(var191)) {
                                        client.method701(0, "", class74.field1023 + var190 + class74.field1024);
                                        continue label2345;
                                    }
                                }
                            }
                            if (class83.method1463(Statics.field1127.field2797, Statics.field359).equals(var191)) {
                                client.method701(0, "", class74.field962);
                            } else {
                                client.field2176.method2288(251);
                                client.field2176.method1558(class135.method878(var190));
                                client.field2176.method1563(var190);
                            }
                            continue;
                        }
                        if (var368 == 3608) {
                            var5--;
                            String var200 = field187[var5];
                            client.method135(var200);
                            continue;
                        }
                        if (var368 == 3609) {
                            var5--;
                            String var201 = field187[var5];
                            if (var201.startsWith(Statics.method1420(0)) || var201.startsWith(Statics.method1420(1))) {
                                var201 = var201.substring(7);
                            }
                            int[] var202 = field192;
                            int var203 = var4++;
                            boolean var204;
                            if (var201 == null) {
                                var204 = false;
                            } else {
                                int var205 = 0;
                                while (true) {
                                    if (var205 >= client.field2031) {
                                        if (var201.equalsIgnoreCase(Statics.field1127.field2797)) {
                                            var204 = true;
                                        } else {
                                            var204 = false;
                                        }
                                        break;
                                    }
                                    if (var201.equalsIgnoreCase(client.field2188[var205].field172)) {
                                        var204 = true;
                                        break;
                                    }
                                    var205++;
                                }
                            }
                            var202[var203] = var204 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3611) {
                            if (client.field2149 == null) {
                                field187[var5++] = "";
                            } else {
                                field187[var5++] = class81.method544(client.field2149);
                            }
                            continue;
                        }
                        if (var368 == 3612) {
                            if (client.field2149 == null) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = Statics.field735;
                            }
                            continue;
                        }
                        if (var368 == 3613) {
                            var4--;
                            int var206 = field192[var4];
                            if (client.field2149 != null && var206 < Statics.field735) {
                                field187[var5++] = Statics.field828[var206].field1620;
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 3614) {
                            var4--;
                            int var207 = field192[var4];
                            if (client.field2149 != null && var207 < Statics.field735) {
                                field192[var4++] = Statics.field828[var207].field1618;
                                continue;
                            }
                            field192[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3615) {
                            var4--;
                            int var208 = field192[var4];
                            if (client.field2149 != null && var208 < Statics.field735) {
                                field192[var4++] = Statics.field828[var208].field1619;
                                continue;
                            }
                            field192[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3616) {
                            field192[var4++] = Statics.field176;
                            continue;
                        }
                        if (var368 == 3617) {
                            var5--;
                            String var209 = field187[var5];
                            client.method1554(var209);
                            continue;
                        }
                        if (var368 == 3618) {
                            field192[var4++] = Statics.field531;
                            continue;
                        }
                        if (var368 == 3619) {
                            var5--;
                            String var210 = field187[var5];
                            if (!var210.equals("")) {
                                client.field2176.method2288(247);
                                client.field2176.method1558(class135.method878(var210));
                                client.field2176.method1563(var210);
                            }
                            continue;
                        }
                        if (var368 == 3620) {
                            client.method1002();
                            continue;
                        }
                        if (var368 == 3621) {
                            if (client.field2043 == 0) {
                                field192[var4++] = -1;
                            } else {
                                field192[var4++] = client.field2190;
                            }
                            continue;
                        }
                        if (var368 == 3622) {
                            var4--;
                            int var211 = field192[var4];
                            if (client.field2043 != 0 && var211 < client.field2190) {
                                field187[var5++] = client.field1986[var211].field43;
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 3623) {
                            var5--;
                            String var212 = field187[var5];
                            if (var212.startsWith(Statics.method1420(0)) || var212.startsWith(Statics.method1420(1))) {
                                var212 = var212.substring(7);
                            }
                            field192[var4++] = client.method511(var212) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3624) {
                            var4--;
                            int var213 = field192[var4];
                            if (Statics.field828 != null && var213 < Statics.field735 && Statics.field828[var213].field1620.equalsIgnoreCase(Statics.field1127.field2797)) {
                                field192[var4++] = 1;
                                continue;
                            }
                            field192[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3625) {
                            if (client.field1909 == null) {
                                field187[var5++] = "";
                            } else {
                                field187[var5++] = class81.method544(client.field1909);
                            }
                            continue;
                        }
                    } else if (var368 < 4100) {
                        if (var368 == 4000) {
                            var4 -= 2;
                            int var214 = field192[var4];
                            int var215 = field192[var4 + 1];
                            field192[var4++] = var214 + var215;
                            continue;
                        }
                        if (var368 == 4001) {
                            var4 -= 2;
                            int var216 = field192[var4];
                            int var217 = field192[var4 + 1];
                            field192[var4++] = var216 - var217;
                            continue;
                        }
                        if (var368 == 4002) {
                            var4 -= 2;
                            int var218 = field192[var4];
                            int var219 = field192[var4 + 1];
                            field192[var4++] = var218 * var219;
                            continue;
                        }
                        if (var368 == 4003) {
                            var4 -= 2;
                            int var220 = field192[var4];
                            int var221 = field192[var4 + 1];
                            field192[var4++] = var220 / var221;
                            continue;
                        }
                        if (var368 == 4004) {
                            var4--;
                            int var222 = field192[var4];
                            field192[var4++] = (int) (Math.random() * (double) var222);
                            continue;
                        }
                        if (var368 == 4005) {
                            var4--;
                            int var223 = field192[var4];
                            field192[var4++] = (int) (Math.random() * (double) (var223 + 1));
                            continue;
                        }
                        if (var368 == 4006) {
                            var4 -= 5;
                            int var224 = field192[var4];
                            int var225 = field192[var4 + 1];
                            int var226 = field192[var4 + 2];
                            int var227 = field192[var4 + 3];
                            int var228 = field192[var4 + 4];
                            field192[var4++] = (var225 - var224) * (var228 - var226) / (var227 - var226) + var224;
                            continue;
                        }
                        if (var368 == 4007) {
                            var4 -= 2;
                            int var229 = field192[var4];
                            int var230 = field192[var4 + 1];
                            field192[var4++] = var229 * var230 / 100 + var229;
                            continue;
                        }
                        if (var368 == 4008) {
                            var4 -= 2;
                            int var231 = field192[var4];
                            int var232 = field192[var4 + 1];
                            field192[var4++] = var231 | 0x1 << var232;
                            continue;
                        }
                        if (var368 == 4009) {
                            var4 -= 2;
                            int var233 = field192[var4];
                            int var234 = field192[var4 + 1];
                            field192[var4++] = var233 & -1 - (0x1 << var234);
                            continue;
                        }
                        if (var368 == 4010) {
                            var4 -= 2;
                            int var235 = field192[var4];
                            int var236 = field192[var4 + 1];
                            field192[var4++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var368 == 4011) {
                            var4 -= 2;
                            int var237 = field192[var4];
                            int var238 = field192[var4 + 1];
                            field192[var4++] = var237 % var238;
                            continue;
                        }
                        if (var368 == 4012) {
                            var4 -= 2;
                            int var239 = field192[var4];
                            int var240 = field192[var4 + 1];
                            if (var239 == 0) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = (int) Math.pow((double) var239, (double) var240);
                            }
                            continue;
                        }
                        if (var368 == 4013) {
                            var4 -= 2;
                            int var241 = field192[var4];
                            int var242 = field192[var4 + 1];
                            if (var241 == 0) {
                                field192[var4++] = 0;
                            } else if (var242 == 0) {
                                field192[var4++] = Integer.MAX_VALUE;
                            } else {
                                field192[var4++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                            }
                            continue;
                        }
                        if (var368 == 4014) {
                            var4 -= 2;
                            int var243 = field192[var4];
                            int var244 = field192[var4 + 1];
                            field192[var4++] = var243 & var244;
                            continue;
                        }
                        if (var368 == 4015) {
                            var4 -= 2;
                            int var245 = field192[var4];
                            int var246 = field192[var4 + 1];
                            field192[var4++] = var245 | var246;
                            continue;
                        }
                    } else if (var368 < 4200) {
                        if (var368 == 4100) {
                            var5--;
                            String var247 = field187[var5];
                            var4--;
                            int var248 = field192[var4];
                            field187[var5++] = var247 + var248;
                            continue;
                        }
                        if (var368 == 4101) {
                            var5 -= 2;
                            String var249 = field187[var5];
                            String var250 = field187[var5 + 1];
                            field187[var5++] = var249 + var250;
                            continue;
                        }
                        if (var368 == 4102) {
                            var5--;
                            String var251 = field187[var5];
                            var4--;
                            int var252 = field192[var4];
                            field187[var5++] = var251 + Statics.method545(var252, true);
                            continue;
                        }
                        if (var368 == 4103) {
                            var5--;
                            String var253 = field187[var5];
                            field187[var5++] = var253.toLowerCase();
                            continue;
                        }
                        if (var368 == 4104) {
                            var4--;
                            int var254 = field192[var4];
                            long var255 = ((long) var254 + 11745L) * 86400000L;
                            field196.setTime(new Date(var255));
                            int var257 = field196.get(5);
                            int var258 = field196.get(2);
                            int var259 = field196.get(1);
                            field187[var5++] = var257 + "-" + field197[var258] + "-" + var259;
                            continue;
                        }
                        if (var368 == 4105) {
                            var5 -= 2;
                            String var260 = field187[var5];
                            String var261 = field187[var5 + 1];
                            if (Statics.field1127.field2792 != null && Statics.field1127.field2792.field1221) {
                                field187[var5++] = var261;
                                continue;
                            }
                            field187[var5++] = var260;
                            continue;
                        }
                        if (var368 == 4106) {
                            var4--;
                            int var262 = field192[var4];
                            field187[var5++] = Integer.toString(var262);
                            continue;
                        }
                        if (var368 == 4107) {
                            var5 -= 2;
                            int[] var263 = field192;
                            int var264 = var4++;
                            String var265 = field187[var5];
                            String var266 = field187[var5 + 1];
                            int var267 = client.field1913;
                            int var268 = var265.length();
                            int var269 = var266.length();
                            int var270 = 0;
                            int var271 = 0;
                            char var272 = 0;
                            char var273 = 0;
                            int var274;
                            label2198: while (true) {
                                if (var270 - var272 >= var268 && var271 - var273 >= var269) {
                                    int var283 = Math.min(var268, var269);
                                    for (int var284 = 0; var284 < var283; var284++) {
                                        char var287 = var265.charAt(var284);
                                        char var288 = var266.charAt(var284);
                                        if (var287 != var288 && Character.toUpperCase(var287) != Character.toUpperCase(var288)) {
                                            char var289 = Character.toLowerCase(var287);
                                            char var290 = Character.toLowerCase(var288);
                                            if (var289 != var290) {
                                                var274 = class85.method786(var289, var267) - class85.method786(var290, var267);
                                                break label2198;
                                            }
                                        }
                                    }
                                    int var291 = var268 - var269;
                                    if (var291 == 0) {
                                        for (int var292 = 0; var292 < var283; var292++) {
                                            char var293 = var265.charAt(var292);
                                            char var294 = var266.charAt(var292);
                                            if (var293 != var294) {
                                                var274 = class85.method786(var293, var267) - class85.method786(var294, var267);
                                                break label2198;
                                            }
                                        }
                                        var274 = 0;
                                    } else {
                                        var274 = var291;
                                    }
                                    break;
                                }
                                if (var270 - var272 >= var268) {
                                    var274 = -1;
                                    break;
                                }
                                if (var271 - var273 >= var269) {
                                    var274 = 1;
                                    break;
                                }
                                char var275;
                                if (var272 == 0) {
                                    var275 = var265.charAt(var270++);
                                } else {
                                    var275 = var272;
                                    boolean var276 = false;
                                }
                                char var277;
                                if (var273 == 0) {
                                    var277 = var266.charAt(var271++);
                                } else {
                                    var277 = var273;
                                    boolean var278 = false;
                                }
                                var272 = class85.method1204(var275);
                                var273 = class85.method1204(var277);
                                char var279 = class85.method466(var275, var267);
                                char var280 = class85.method466(var277, var267);
                                if (var279 != var280 && Character.toUpperCase(var279) != Character.toUpperCase(var280)) {
                                    char var281 = Character.toLowerCase(var279);
                                    char var282 = Character.toLowerCase(var280);
                                    if (var281 != var282) {
                                        var274 = class85.method786(var281, var267) - class85.method786(var282, var267);
                                        break;
                                    }
                                }
                            }
                            var263[var264] = Statics.method746(var274);
                            continue;
                        }
                        if (var368 == 4108) {
                            var5--;
                            String var295 = field187[var5];
                            var4 -= 2;
                            int var296 = field192[var4];
                            int var297 = field192[var4 + 1];
                            byte[] var298 = Statics.field538.method1015(var297, 0);
                            class181 var299 = new class181(var298);
                            field192[var4++] = var299.method2805(var295, var296);
                            continue;
                        }
                        if (var368 == 4109) {
                            var5--;
                            String var300 = field187[var5];
                            var4 -= 2;
                            int var301 = field192[var4];
                            int var302 = field192[var4 + 1];
                            byte[] var303 = Statics.field538.method1015(var302, 0);
                            class181 var304 = new class181(var303);
                            field192[var4++] = var304.method2826(var300, var301);
                            continue;
                        }
                        if (var368 == 4110) {
                            var5 -= 2;
                            String var305 = field187[var5];
                            String var306 = field187[var5 + 1];
                            var4--;
                            if (field192[var4] == 1) {
                                field187[var5++] = var305;
                            } else {
                                field187[var5++] = var306;
                            }
                            continue;
                        }
                        if (var368 == 4111) {
                            var5--;
                            String var307 = field187[var5];
                            field187[var5++] = class173.method2806(var307);
                            continue;
                        }
                        if (var368 == 4112) {
                            var5--;
                            String var308 = field187[var5];
                            var4--;
                            int var309 = field192[var4];
                            field187[var5++] = var308 + (char) var309;
                            continue;
                        }
                        if (var368 == 4113) {
                            var4--;
                            int var310 = field192[var4];
                            field192[var4++] = class82.method874((char) var310) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4114) {
                            var4--;
                            int var311 = field192[var4];
                            int[] var312 = field192;
                            int var313 = var4++;
                            char var314 = (char) var311;
                            boolean var315 = var314 >= '0' && var314 <= '9' || var314 >= 'A' && var314 <= 'Z' || var314 >= 'a' && var314 <= 'z';
                            var312[var313] = var315 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4115) {
                            var4--;
                            int var316 = field192[var4];
                            field192[var4++] = class82.method692((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4116) {
                            var4--;
                            int var317 = field192[var4];
                            field192[var4++] = class82.method857((char) var317) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4117) {
                            var5--;
                            String var318 = field187[var5];
                            if (var318 == null) {
                                field192[var4++] = 0;
                            } else {
                                field192[var4++] = var318.length();
                            }
                            continue;
                        }
                        if (var368 == 4118) {
                            var5--;
                            String var319 = field187[var5];
                            var4 -= 2;
                            int var320 = field192[var4];
                            int var321 = field192[var4 + 1];
                            field187[var5++] = var319.substring(var320, var321);
                            continue;
                        }
                        if (var368 == 4119) {
                            var5--;
                            String var322 = field187[var5];
                            StringBuilder var323 = new StringBuilder(var322.length());
                            boolean var324 = false;
                            for (int var325 = 0; var325 < var322.length(); var325++) {
                                char var326 = var322.charAt(var325);
                                if (var326 == '<') {
                                    var324 = true;
                                } else if (var326 == '>') {
                                    var324 = false;
                                } else if (!var324) {
                                    var323.append(var326);
                                }
                            }
                            field187[var5++] = var323.toString();
                            continue;
                        }
                        if (var368 == 4120) {
                            var5--;
                            String var327 = field187[var5];
                            var4--;
                            int var328 = field192[var4];
                            field192[var4++] = var327.indexOf(var328);
                            continue;
                        }
                    } else if (var368 < 4300) {
                        if (var368 == 4200) {
                            var4--;
                            int var329 = field192[var4];
                            field187[var5++] = class161.method2496(var329).field2432;
                            continue;
                        }
                        if (var368 == 4201) {
                            var4 -= 2;
                            int var330 = field192[var4];
                            int var331 = field192[var4 + 1];
                            class161 var332 = class161.method2496(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field2446[var331 - 1] != null) {
                                field187[var5++] = var332.field2446[var331 - 1];
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 4202) {
                            var4 -= 2;
                            int var333 = field192[var4];
                            int var334 = field192[var4 + 1];
                            class161 var335 = class161.method2496(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field2445[var334 - 1] != null) {
                                field187[var5++] = var335.field2445[var334 - 1];
                                continue;
                            }
                            field187[var5++] = "";
                            continue;
                        }
                        if (var368 == 4203) {
                            var4--;
                            int var336 = field192[var4];
                            field192[var4++] = class161.method2496(var336).field2444;
                            continue;
                        }
                        if (var368 == 4204) {
                            var4--;
                            int var337 = field192[var4];
                            field192[var4++] = class161.method2496(var337).field2453 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4205) {
                            var4--;
                            int var338 = field192[var4];
                            class161 var339 = class161.method2496(var338);
                            if (var339.field2437 == -1 && var339.field2462 >= 0) {
                                field192[var4++] = var339.field2462;
                                continue;
                            }
                            field192[var4++] = var338;
                            continue;
                        }
                        if (var368 == 4206) {
                            var4--;
                            int var340 = field192[var4];
                            class161 var341 = class161.method2496(var340);
                            if (var341.field2437 >= 0 && var341.field2462 >= 0) {
                                field192[var4++] = var341.field2462;
                                continue;
                            }
                            field192[var4++] = var340;
                            continue;
                        }
                        if (var368 == 4207) {
                            var4--;
                            int var342 = field192[var4];
                            field192[var4++] = class161.method2496(var342).field2438 ? 1 : 0;
                            continue;
                        }
                    } else if (var368 < 5100) {
                        if (var368 == 5000) {
                            field192[var4++] = client.field2093;
                            continue;
                        }
                        if (var368 == 5001) {
                            var4 -= 3;
                            client.field2093 = field192[var4];
                            Statics.field1598 = Statics.method855(field192[var4 + 1]);
                            if (Statics.field1598 == null) {
                                Statics.field1598 = class77.field1101;
                            }
                            client.field2141 = field192[var4 + 2];
                            client.field2176.method2288(38);
                            client.field2176.method1558(client.field2093);
                            client.field2176.method1558(Statics.field1598.field1102);
                            client.field2176.method1558(client.field2141);
                            continue;
                        }
                        if (var368 == 5002) {
                            var5--;
                            String var343 = field187[var5];
                            var4 -= 2;
                            int var344 = field192[var4];
                            int var345 = field192[var4 + 1];
                            client.field2176.method2288(201);
                            client.field2176.method1558(class135.method878(var343) + 2);
                            client.field2176.method1563(var343);
                            client.field2176.method1558(var344 - 1);
                            client.field2176.method1558(var345);
                            continue;
                        }
                        if (var368 == 5003) {
                            var4--;
                            int var346 = field192[var4];
                            String var347 = null;
                            if (var346 < 100) {
                                var347 = client.field2137[var346];
                            }
                            if (var347 == null) {
                                var347 = "";
                            }
                            field187[var5++] = var347;
                            continue;
                        }
                        if (var368 == 5004) {
                            var4--;
                            int var348 = field192[var4];
                            int var349 = -1;
                            if (var348 < 100 && client.field2137[var348] != null) {
                                var349 = client.field2134[var348];
                            }
                            field192[var4++] = var349;
                            continue;
                        }
                        if (var368 == 5005) {
                            if (Statics.field1598 == null) {
                                field192[var4++] = -1;
                            } else {
                                field192[var4++] = Statics.field1598.field1102;
                            }
                            continue;
                        }
                        if (var368 == 5008) {
                            var5--;
                            String var350 = field187[var5];
                            if (var350.startsWith("::")) {
                                client.method1468(var350);
                            } else {
                                String var351 = var350.toLowerCase();
                                byte var352 = 0;
                                if (var351.startsWith(class74.field900)) {
                                    var352 = 0;
                                    var350 = var350.substring(class74.field900.length());
                                } else if (var351.startsWith(class74.field1027)) {
                                    var352 = 1;
                                    var350 = var350.substring(class74.field1027.length());
                                } else if (var351.startsWith(class74.field1029)) {
                                    var352 = 2;
                                    var350 = var350.substring(class74.field1029.length());
                                } else if (var351.startsWith(class74.field1031)) {
                                    var352 = 3;
                                    var350 = var350.substring(class74.field1031.length());
                                } else if (var351.startsWith(class74.field1033)) {
                                    var352 = 4;
                                    var350 = var350.substring(class74.field1033.length());
                                } else if (var351.startsWith(class74.field979)) {
                                    var352 = 5;
                                    var350 = var350.substring(class74.field979.length());
                                } else if (var351.startsWith(class74.field1037)) {
                                    var352 = 6;
                                    var350 = var350.substring(class74.field1037.length());
                                } else if (var351.startsWith(class74.field1039)) {
                                    var352 = 7;
                                    var350 = var350.substring(class74.field1039.length());
                                } else if (var351.startsWith(class74.field1041)) {
                                    var352 = 8;
                                    var350 = var350.substring(class74.field1041.length());
                                } else if (var351.startsWith(class74.field1043)) {
                                    var352 = 9;
                                    var350 = var350.substring(class74.field1043.length());
                                } else if (var351.startsWith(class74.field1045)) {
                                    var352 = 10;
                                    var350 = var350.substring(class74.field1045.length());
                                } else if (var351.startsWith(class74.field1047)) {
                                    var352 = 11;
                                    var350 = var350.substring(class74.field1047.length());
                                } else if (client.field1913 != 0) {
                                    if (var351.startsWith(class74.field1083)) {
                                        var352 = 0;
                                        var350 = var350.substring(class74.field1083.length());
                                    } else if (var351.startsWith(class74.field952)) {
                                        var352 = 1;
                                        var350 = var350.substring(class74.field952.length());
                                    } else if (var351.startsWith(class74.field976)) {
                                        var352 = 2;
                                        var350 = var350.substring(class74.field976.length());
                                    } else if (var351.startsWith(class74.field1036)) {
                                        var352 = 3;
                                        var350 = var350.substring(class74.field1036.length());
                                    } else if (var351.startsWith(class74.field1002)) {
                                        var352 = 4;
                                        var350 = var350.substring(class74.field1002.length());
                                    } else if (var351.startsWith(class74.field1020)) {
                                        var352 = 5;
                                        var350 = var350.substring(class74.field1020.length());
                                    } else if (var351.startsWith(class74.field1013)) {
                                        var352 = 6;
                                        var350 = var350.substring(class74.field1013.length());
                                    } else if (var351.startsWith(class74.field1040)) {
                                        var352 = 7;
                                        var350 = var350.substring(class74.field1040.length());
                                    } else if (var351.startsWith(class74.field1042)) {
                                        var352 = 8;
                                        var350 = var350.substring(class74.field1042.length());
                                    } else if (var351.startsWith(class74.field901)) {
                                        var352 = 9;
                                        var350 = var350.substring(class74.field901.length());
                                    } else if (var351.startsWith(class74.field1046)) {
                                        var352 = 10;
                                        var350 = var350.substring(class74.field1046.length());
                                    } else if (var351.startsWith(class74.field1048)) {
                                        var352 = 11;
                                        var350 = var350.substring(class74.field1048.length());
                                    }
                                }
                                String var353 = var350.toLowerCase();
                                byte var354 = 0;
                                if (var353.startsWith(class74.field1049)) {
                                    var354 = 1;
                                    var350 = var350.substring(class74.field1049.length());
                                } else if (var353.startsWith(class74.field1051)) {
                                    var354 = 2;
                                    var350 = var350.substring(class74.field1051.length());
                                } else if (var353.startsWith(class74.field1053)) {
                                    var354 = 3;
                                    var350 = var350.substring(class74.field1053.length());
                                } else if (var353.startsWith(class74.field1055)) {
                                    var354 = 4;
                                    var350 = var350.substring(class74.field1055.length());
                                } else if (var353.startsWith(class74.field1057)) {
                                    var354 = 5;
                                    var350 = var350.substring(class74.field1057.length());
                                } else if (client.field1913 != 0) {
                                    if (var353.startsWith(class74.field1050)) {
                                        var354 = 1;
                                        var350 = var350.substring(class74.field1050.length());
                                    } else if (var353.startsWith(class74.field972)) {
                                        var354 = 2;
                                        var350 = var350.substring(class74.field972.length());
                                    } else if (var353.startsWith(class74.field1012)) {
                                        var354 = 3;
                                        var350 = var350.substring(class74.field1012.length());
                                    } else if (var353.startsWith(class74.field1056)) {
                                        var354 = 4;
                                        var350 = var350.substring(class74.field1056.length());
                                    } else if (var353.startsWith(class74.field1058)) {
                                        var354 = 5;
                                        var350 = var350.substring(class74.field1058.length());
                                    }
                                }
                                client.field2176.method2288(210);
                                client.field2176.method1558(0);
                                int var355 = client.field2176.field1722;
                                client.field2176.method1558(var352);
                                client.field2176.method1558(var354);
                                class109.method1202(client.field2176, var350);
                                client.field2176.method1568(client.field2176.field1722 - var355);
                            }
                            continue;
                        }
                        if (var368 == 5009) {
                            var5 -= 2;
                            String var356 = field187[var5];
                            String var357 = field187[var5 + 1];
                            client.field2176.method2288(108);
                            client.field2176.method1559(0);
                            int var358 = client.field2176.field1722;
                            client.field2176.method1563(var356);
                            class109.method1202(client.field2176, var357);
                            client.field2176.method1567(client.field2176.field1722 - var358);
                            continue;
                        }
                        if (var368 == 5010) {
                            var4--;
                            int var359 = field192[var4];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = client.field1936[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field187[var5++] = var360;
                            continue;
                        }
                        if (var368 == 5011) {
                            var4--;
                            int var361 = field192[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field2136[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field187[var5++] = var362;
                            continue;
                        }
                        if (var368 == 5015) {
                            String var363;
                            if (Statics.field1127 == null || Statics.field1127.field2797 == null) {
                                var363 = "";
                            } else {
                                var363 = Statics.field1127.field2797;
                            }
                            field187[var5++] = var363;
                            continue;
                        }
                        if (var368 == 5016) {
                            field192[var4++] = client.field2141;
                            continue;
                        }
                        if (var368 == 5017) {
                            field192[var4++] = client.field1999;
                            continue;
                        }
                    }
                } else {
                    class140 var63;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var63 = class140.method53(field192[var4]);
                    } else {
                        var63 = var40 ? Statics.field14 : Statics.field1501;
                    }
                    if (var368 == 1300) {
                        var4--;
                        int var64 = field192[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method1783(var64, field187[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var368 == 1301) {
                        var4 -= 2;
                        int var65 = field192[var4];
                        int var66 = field192[var4 + 1];
                        var63.field1840 = class140.method858(var65, var66);
                        continue;
                    }
                    if (var368 == 1302) {
                        var4--;
                        var63.field1814 = field192[var4] == 1;
                        continue;
                    }
                    if (var368 == 1303) {
                        var4--;
                        var63.field1833 = field192[var4];
                        continue;
                    }
                    if (var368 == 1304) {
                        var4--;
                        var63.field1842 = field192[var4];
                        continue;
                    }
                    if (var368 == 1305) {
                        var5--;
                        var63.field1838 = field187[var5];
                        continue;
                    }
                    if (var368 == 1306) {
                        var5--;
                        var63.field1844 = field187[var5];
                        continue;
                    }
                    if (var368 == 1307) {
                        var63.field1839 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var367) {
            StringBuilder var365 = new StringBuilder(30);
            var365.append("").append(var3.field1500).append(" ");
            for (int var366 = field193 - 1; var366 >= 0; var366--) {
                var365.append("").append(field195[var366].field120.field1500).append(" ");
            }
            var365.append("").append(var9);
            class169.method255(var365.toString(), var367);
        }
    }

    @ObfuscatedName("bc.n(II)V")
    public static void method884(int arg0) {
        if (arg0 == -1 || !class140.method1094(arg0)) {
            return;
        }
        class140[] var1 = Statics.field806[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class140 var3 = var1[var2];
            if (var3.field1829 != null) {
                class122 var4 = new class122();
                var4.field1585 = var3;
                var4.field1591 = var3.field1829;
                method870(var4);
            }
        }
    }
}
