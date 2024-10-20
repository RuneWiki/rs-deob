package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("f")
public class class12 {

    @ObfuscatedName("f.o")
    public static int[] field192 = new int[5];

    @ObfuscatedName("f.c")
    public static int[][] field193 = new int[5][5000];

    @ObfuscatedName("f.h")
    public static int[] field191 = new int[1000];

    @ObfuscatedName("f.r")
    public static String[] field195 = new String[1000];

    @ObfuscatedName("f.d")
    public static int field196 = 0;

    @ObfuscatedName("f.k")
    public static class8[] field199 = new class8[50];

    @ObfuscatedName("f.f")
    public static Calendar field198 = Calendar.getInstance();

    @ObfuscatedName("f.s")
    public static final String[] field197 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class12() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.q(Lds;I)V")
    public static void method1103(class123 arg0) {
        Object[] var1 = arg0.field1590;
        int var2 = (Integer) var1[0];
        class152 var3 = class152.method1102(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field2263;
        int[] var8 = var3.field2261;
        byte var9 = -1;
        field196 = 0;
        try {
            Statics.field353 = new int[var3.field2266];
            int var10 = 0;
            Statics.field190 = new String[var3.field2264];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field1593;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field1594;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field1592 == null ? -1 : arg0.field1592.field1767;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field1589;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field1592 == null ? -1 : arg0.field1592.field1776;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field1591 == null ? -1 : arg0.field1591.field1767;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field1591 == null ? -1 : arg0.field1591.field1776;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field1595;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field1596;
                    }
                    Statics.field353[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field1597;
                    }
                    Statics.field190[var11++] = var14;
                }
            }
            int var15 = 0;
            label2451: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var382 = var7[var6];
                if (var382 < 100) {
                    if (var382 == 0) {
                        field191[var4++] = var8[var6];
                        continue;
                    }
                    if (var382 == 1) {
                        int var16 = var8[var6];
                        field191[var4++] = class90.field1219[var16];
                        continue;
                    }
                    if (var382 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class90.field1219[var17] = field191[var4];
                        continue;
                    }
                    if (var382 == 3) {
                        field195[var5++] = var3.field2262[var6];
                        continue;
                    }
                    if (var382 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var382 == 7) {
                        var4 -= 2;
                        if (field191[var4 + 1] != field191[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 8) {
                        var4 -= 2;
                        if (field191[var4 + 1] == field191[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 9) {
                        var4 -= 2;
                        if (field191[var4] < field191[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 10) {
                        var4 -= 2;
                        if (field191[var4] > field191[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 21) {
                        if (field196 == 0) {
                            return;
                        }
                        class8 var18 = field199[--field196];
                        var3 = var18.field122;
                        var7 = var3.field2263;
                        var8 = var3.field2261;
                        var6 = var18.field120;
                        Statics.field353 = var18.field119;
                        Statics.field190 = var18.field121;
                        continue;
                    }
                    if (var382 == 25) {
                        int var19 = var8[var6];
                        field191[var4++] = class90.method344(var19);
                        continue;
                    }
                    if (var382 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class90.method401(var20, field191[var4]);
                        continue;
                    }
                    if (var382 == 31) {
                        var4 -= 2;
                        if (field191[var4] <= field191[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 32) {
                        var4 -= 2;
                        if (field191[var4] >= field191[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var382 == 33) {
                        field191[var4++] = Statics.field353[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var382 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field353[var10001] = field191[var4];
                        continue;
                    }
                    if (var382 == 35) {
                        field195[var5++] = Statics.field190[var8[var6]];
                        continue;
                    }
                    if (var382 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field190[var10001] = field195[var5];
                        continue;
                    }
                    if (var382 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String[] var22 = field195;
                        String var23;
                        if (var21 == 0) {
                            var23 = "";
                        } else if (var21 == 1) {
                            String var24 = var22[var5];
                            if (var24 == null) {
                                var23 = "null";
                            } else {
                                var23 = var24.toString();
                            }
                        } else {
                            int var25 = var5 + var21;
                            int var26 = 0;
                            for (int var27 = var5; var27 < var25; var27++) {
                                String var28 = var22[var27];
                                if (var28 == null) {
                                    var26 += 4;
                                } else {
                                    var26 += var28.length();
                                }
                            }
                            StringBuilder var29 = new StringBuilder(var26);
                            for (int var30 = var5; var30 < var25; var30++) {
                                String var31 = var22[var30];
                                if (var31 == null) {
                                    var29.append("null");
                                } else {
                                    var29.append(var31);
                                }
                            }
                            var23 = var29.toString();
                        }
                        field195[var5++] = var23;
                        continue;
                    }
                    if (var382 == 38) {
                        var4--;
                        continue;
                    }
                    if (var382 == 39) {
                        var5--;
                        continue;
                    }
                    if (var382 == 40) {
                        int var33 = var8[var6];
                        class152 var34 = class152.method1102(var33);
                        int[] var35 = new int[var34.field2266];
                        String[] var36 = new String[var34.field2264];
                        for (int var37 = 0; var37 < var34.field2259; var37++) {
                            var35[var37] = field191[var4 - var34.field2259 + var37];
                        }
                        for (int var38 = 0; var38 < var34.field2265; var38++) {
                            var36[var38] = field195[var5 - var34.field2265 + var38];
                        }
                        var4 -= var34.field2259;
                        var5 -= var34.field2265;
                        class8 var39 = new class8();
                        var39.field122 = var3;
                        var39.field120 = var6;
                        var39.field119 = Statics.field353;
                        var39.field121 = Statics.field190;
                        field199[++field196 - 1] = var39;
                        var3 = var34;
                        var7 = var34.field2263;
                        var8 = var34.field2261;
                        var6 = -1;
                        Statics.field353 = var35;
                        Statics.field190 = var36;
                        continue;
                    }
                    if (var382 == 42) {
                        field191[var4++] = client.field2119[var8[var6]];
                        continue;
                    }
                    if (var382 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field2119[var10001] = field191[var4];
                        continue;
                    }
                    if (var382 == 44) {
                        int var40 = var8[var6] >> 16;
                        int var41 = var8[var6] & 0xFFFF;
                        var4--;
                        int var42 = field191[var4];
                        if (var42 >= 0 && var42 <= 5000) {
                            field192[var40] = var42;
                            byte var43 = -1;
                            if (var41 == 105) {
                                var43 = 0;
                            }
                            int var44 = 0;
                            while (true) {
                                if (var44 >= var42) {
                                    continue label2451;
                                }
                                field193[var40][var44] = var43;
                                var44++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var382 == 45) {
                        int var45 = var8[var6];
                        var4--;
                        int var46 = field191[var4];
                        if (var46 >= 0 && var46 < field192[var45]) {
                            field191[var4++] = field193[var45][var46];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var382 == 46) {
                        int var47 = var8[var6];
                        var4 -= 2;
                        int var48 = field191[var4];
                        if (var48 >= 0 && var48 < field192[var47]) {
                            field193[var47][var48] = field191[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var382 == 47) {
                        String var49 = client.field2120[var8[var6]];
                        if (var49 == null) {
                            var49 = "null";
                        }
                        field195[var5++] = var49;
                        continue;
                    }
                    if (var382 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field2120[var10001] = field195[var5];
                        continue;
                    }
                }
                boolean var50;
                if (var8[var6] == 1) {
                    var50 = true;
                } else {
                    var50 = false;
                }
                if (var382 < 1000) {
                    if (var382 == 100) {
                        var4 -= 3;
                        int var51 = field191[var4];
                        int var52 = field191[var4 + 1];
                        int var53 = field191[var4 + 2];
                        if (var52 == 0) {
                            throw new RuntimeException();
                        }
                        class141 var54 = class141.method451(var51);
                        if (var54.field1883 == null) {
                            var54.field1883 = new class141[var53 + 1];
                        }
                        if (var54.field1883.length <= var53) {
                            class141[] var55 = new class141[var53 + 1];
                            for (int var56 = 0; var56 < var54.field1883.length; var56++) {
                                var55[var56] = var54.field1883[var56];
                            }
                            var54.field1883 = var55;
                        }
                        if (var53 > 0 && var54.field1883[var53 - 1] == null) {
                            throw new RuntimeException("" + (var53 - 1));
                        }
                        class141 var57 = new class141();
                        var57.field1806 = var52;
                        var57.field1786 = var57.field1767 = var54.field1767;
                        var57.field1776 = var53;
                        var57.field1774 = true;
                        var54.field1883[var53] = var57;
                        if (var50) {
                            Statics.field201 = var57;
                        } else {
                            Statics.field205 = var57;
                        }
                        client.method542(var54);
                        continue;
                    }
                    if (var382 == 101) {
                        class141 var58 = var50 ? Statics.field201 : Statics.field205;
                        class141 var59 = class141.method451(var58.field1767);
                        var59.field1883[var58.field1776] = null;
                        client.method542(var59);
                        continue;
                    }
                    if (var382 == 102) {
                        var4--;
                        class141 var60 = class141.method451(field191[var4]);
                        var60.field1883 = null;
                        client.method542(var60);
                        continue;
                    }
                    if (var382 == 200) {
                        var4 -= 2;
                        int var61 = field191[var4];
                        int var62 = field191[var4 + 1];
                        class141 var63 = class141.method1768(var61, var62);
                        if (var63 != null && var62 != -1) {
                            field191[var4++] = 1;
                            if (var50) {
                                Statics.field201 = var63;
                            } else {
                                Statics.field205 = var63;
                            }
                            continue;
                        }
                        field191[var4++] = 0;
                        continue;
                    }
                } else if (var382 >= 1000 && var382 < 1100 || var382 >= 2000 && var382 < 2100) {
                    class141 var64;
                    if (var382 >= 2000) {
                        var382 -= 1000;
                        var4--;
                        var64 = class141.method451(field191[var4]);
                    } else {
                        var64 = var50 ? Statics.field201 : Statics.field205;
                    }
                    if (var382 == 1000) {
                        var4 -= 2;
                        var64.field1780 = field191[var4];
                        var64.field1781 = field191[var4 + 1];
                        client.method542(var64);
                        continue;
                    }
                    if (var382 == 1001) {
                        var4 -= 2;
                        var64.field1782 = field191[var4];
                        var64.field1785 = field191[var4 + 1];
                        client.method542(var64);
                        continue;
                    }
                    if (var382 == 1003) {
                        var4--;
                        boolean var65 = field191[var4] == 1;
                        if (var64.field1829 != var65) {
                            var64.field1829 = var65;
                            client.method542(var64);
                        }
                        continue;
                    }
                } else if (!(var382 < 1100 || var382 >= 1200) || !(var382 < 2100 || var382 >= 2200)) {
                    class141 var66;
                    if (var382 >= 2000) {
                        var382 -= 1000;
                        var4--;
                        var66 = class141.method451(field191[var4]);
                    } else {
                        var66 = var50 ? Statics.field201 : Statics.field205;
                    }
                    if (var382 == 1100) {
                        var4 -= 2;
                        var66.field1840 = field191[var4];
                        if (var66.field1840 > var66.field1790 - var66.field1782) {
                            var66.field1840 = var66.field1790 - var66.field1782;
                        }
                        if (var66.field1840 < 0) {
                            var66.field1840 = 0;
                        }
                        var66.field1789 = field191[var4 + 1];
                        if (var66.field1789 > var66.field1836 - var66.field1785) {
                            var66.field1789 = var66.field1836 - var66.field1785;
                        }
                        if (var66.field1789 < 0) {
                            var66.field1789 = 0;
                        }
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1101) {
                        var4--;
                        var66.field1792 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1102) {
                        var4--;
                        var66.field1879 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1103) {
                        var4--;
                        var66.field1797 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1104) {
                        var4--;
                        var66.field1798 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1105) {
                        var4--;
                        var66.field1796 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1106) {
                        var4--;
                        var66.field1801 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1107) {
                        var4--;
                        var66.field1802 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1108) {
                        var66.field1882 = 1;
                        var4--;
                        var66.field1808 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1109) {
                        var4 -= 6;
                        var66.field1813 = field191[var4];
                        var66.field1850 = field191[var4 + 1];
                        var66.field1777 = field191[var4 + 2];
                        var66.field1791 = field191[var4 + 3];
                        var66.field1817 = field191[var4 + 4];
                        var66.field1818 = field191[var4 + 5];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1110) {
                        var4--;
                        int var67 = field191[var4];
                        if (var66.field1811 != var67) {
                            var66.field1811 = var67;
                            var66.field1881 = 0;
                            var66.field1858 = 0;
                            client.method542(var66);
                        }
                        continue;
                    }
                    if (var382 == 1111) {
                        var4--;
                        var66.field1820 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1112) {
                        var5--;
                        String var68 = field195[var5];
                        if (!var68.equals(var66.field1822)) {
                            var66.field1822 = var68;
                            client.method542(var66);
                        }
                        continue;
                    }
                    if (var382 == 1113) {
                        var4--;
                        var66.field1821 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1114) {
                        var4 -= 3;
                        var66.field1825 = field191[var4];
                        var66.field1826 = field191[var4 + 1];
                        var66.field1880 = field191[var4 + 2];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1115) {
                        var4--;
                        var66.field1775 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1116) {
                        var4--;
                        var66.field1803 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1117) {
                        var4--;
                        var66.field1804 = field191[var4];
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1118) {
                        var4--;
                        var66.field1787 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1119) {
                        var4--;
                        var66.field1844 = field191[var4] == 1;
                        client.method542(var66);
                        continue;
                    }
                    if (var382 == 1120) {
                        var4 -= 2;
                        var66.field1790 = field191[var4];
                        var66.field1836 = field191[var4 + 1];
                        client.method542(var66);
                        continue;
                    }
                } else if (!(var382 < 1200 || var382 >= 1300) || !(var382 < 2200 || var382 >= 2300)) {
                    class141 var69;
                    if (var382 >= 2000) {
                        var382 -= 1000;
                        var4--;
                        var69 = class141.method451(field191[var4]);
                    } else {
                        var69 = var50 ? Statics.field201 : Statics.field205;
                    }
                    client.method542(var69);
                    if (var382 == 1200) {
                        var4 -= 2;
                        int var70 = field191[var4];
                        int var71 = field191[var4 + 1];
                        var69.field1888 = var70;
                        var69.field1814 = var71;
                        class162 var72 = class162.method768(var70);
                        var69.field1777 = var72.field2474;
                        var69.field1791 = var72.field2448;
                        var69.field1817 = var72.field2445;
                        var69.field1813 = var72.field2446;
                        var69.field1850 = var72.field2447;
                        var69.field1818 = var72.field2442;
                        if (var69.field1782 > 0) {
                            var69.field1818 = var69.field1818 * 32 / var69.field1782;
                        }
                        continue;
                    }
                    if (var382 == 1201) {
                        var69.field1882 = 2;
                        var4--;
                        var69.field1808 = field191[var4];
                        continue;
                    }
                    if (var382 == 1202) {
                        var69.field1882 = 3;
                        var69.field1808 = Statics.field1230.field2794.method1154();
                        continue;
                    }
                } else if (var382 >= 1300 && var382 < 1400 || var382 >= 2300 && var382 < 2400) {
                    class141 var73;
                    if (var382 >= 2000) {
                        var382 -= 1000;
                        var4--;
                        var73 = class141.method451(field191[var4]);
                    } else {
                        var73 = var50 ? Statics.field201 : Statics.field205;
                    }
                    if (var382 == 1300) {
                        var4--;
                        int var74 = field191[var4] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var5--;
                            var73.method1810(var74, field195[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var382 == 1301) {
                        var4 -= 2;
                        int var75 = field191[var4];
                        int var76 = field191[var4 + 1];
                        var73.field1837 = class141.method1768(var75, var76);
                        continue;
                    }
                    if (var382 == 1302) {
                        var4--;
                        var73.field1839 = field191[var4] == 1;
                        continue;
                    }
                    if (var382 == 1303) {
                        var4--;
                        var73.field1838 = field191[var4];
                        continue;
                    }
                    if (var382 == 1304) {
                        var4--;
                        var73.field1860 = field191[var4];
                        continue;
                    }
                    if (var382 == 1305) {
                        var5--;
                        var73.field1835 = field195[var5];
                        continue;
                    }
                    if (var382 == 1306) {
                        var5--;
                        var73.field1841 = field195[var5];
                        continue;
                    }
                    if (var382 == 1307) {
                        var73.field1846 = null;
                        continue;
                    }
                } else {
                    if (var382 >= 1400 && var382 < 1500 || var382 >= 2400 && var382 < 2500) {
                        class141 var77;
                        if (var382 >= 2000) {
                            var382 -= 1000;
                            var4--;
                            var77 = class141.method451(field191[var4]);
                        } else {
                            var77 = var50 ? Statics.field201 : Statics.field205;
                        }
                        var5--;
                        String var78 = field195[var5];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var4--;
                            int var80 = field191[var4];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var4--;
                                    var79[var80] = field191[var4];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var5--;
                                var81[var82] = field195[var5];
                            } else {
                                var4--;
                                var81[var82] = Integer.valueOf(field191[var4]);
                            }
                        }
                        var4--;
                        int var83 = field191[var4];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var382 == 1400) {
                            var77.field1875 = var81;
                        }
                        if (var382 == 1401) {
                            var77.field1847 = var81;
                        }
                        if (var382 == 1402) {
                            var77.field1795 = var81;
                        }
                        if (var382 == 1403) {
                            var77.field1848 = var81;
                        }
                        if (var382 == 1404) {
                            var77.field1876 = var81;
                        }
                        if (var382 == 1405) {
                            var77.field1851 = var81;
                        }
                        if (var382 == 1406) {
                            var77.field1854 = var81;
                        }
                        if (var382 == 1407) {
                            var77.field1855 = var81;
                            var77.field1845 = var79;
                        }
                        if (var382 == 1408) {
                            var77.field1861 = var81;
                        }
                        if (var382 == 1409) {
                            var77.field1887 = var81;
                        }
                        if (var382 == 1410) {
                            var77.field1857 = var81;
                        }
                        if (var382 == 1411) {
                            var77.field1867 = var81;
                        }
                        if (var382 == 1412) {
                            var77.field1849 = var81;
                        }
                        if (var382 == 1414) {
                            var77.field1805 = var81;
                            var77.field1856 = var79;
                        }
                        if (var382 == 1415) {
                            var77.field1778 = var81;
                            var77.field1823 = var79;
                        }
                        if (var382 == 1416) {
                            var77.field1853 = var81;
                        }
                        if (var382 == 1417) {
                            var77.field1863 = var81;
                        }
                        if (var382 == 1418) {
                            var77.field1864 = var81;
                        }
                        if (var382 == 1419) {
                            var77.field1865 = var81;
                        }
                        if (var382 == 1420) {
                            var77.field1866 = var81;
                        }
                        if (var382 == 1421) {
                            var77.field1788 = var81;
                        }
                        if (var382 == 1422) {
                            var77.field1868 = var81;
                        }
                        if (var382 == 1423) {
                            var77.field1869 = var81;
                        }
                        if (var382 == 1424) {
                            var77.field1870 = var81;
                        }
                        var77.field1842 = true;
                        continue;
                    }
                    if (var382 < 1600) {
                        class141 var84 = var50 ? Statics.field201 : Statics.field205;
                        if (var382 == 1500) {
                            field191[var4++] = var84.field1780;
                            continue;
                        }
                        if (var382 == 1501) {
                            field191[var4++] = var84.field1781;
                            continue;
                        }
                        if (var382 == 1502) {
                            field191[var4++] = var84.field1782;
                            continue;
                        }
                        if (var382 == 1503) {
                            field191[var4++] = var84.field1785;
                            continue;
                        }
                        if (var382 == 1504) {
                            field191[var4++] = var84.field1829 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 1505) {
                            field191[var4++] = var84.field1786;
                            continue;
                        }
                    } else if (var382 < 1700) {
                        class141 var85 = var50 ? Statics.field201 : Statics.field205;
                        if (var382 == 1600) {
                            field191[var4++] = var85.field1840;
                            continue;
                        }
                        if (var382 == 1601) {
                            field191[var4++] = var85.field1789;
                            continue;
                        }
                        if (var382 == 1602) {
                            field195[var5++] = var85.field1822;
                            continue;
                        }
                        if (var382 == 1603) {
                            field191[var4++] = var85.field1790;
                            continue;
                        }
                        if (var382 == 1604) {
                            field191[var4++] = var85.field1836;
                            continue;
                        }
                        if (var382 == 1605) {
                            field191[var4++] = var85.field1818;
                            continue;
                        }
                        if (var382 == 1606) {
                            field191[var4++] = var85.field1777;
                            continue;
                        }
                        if (var382 == 1607) {
                            field191[var4++] = var85.field1817;
                            continue;
                        }
                        if (var382 == 1608) {
                            field191[var4++] = var85.field1791;
                            continue;
                        }
                    } else if (var382 < 1800) {
                        class141 var86 = var50 ? Statics.field201 : Statics.field205;
                        if (var382 == 1700) {
                            field191[var4++] = var86.field1888;
                            continue;
                        }
                        if (var382 == 1701) {
                            if (var86.field1888 == -1) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = var86.field1814;
                            }
                            continue;
                        }
                        if (var382 == 1702) {
                            field191[var4++] = var86.field1776;
                            continue;
                        }
                    } else if (var382 < 1900) {
                        class141 var87 = var50 ? Statics.field201 : Statics.field205;
                        if (var382 == 1800) {
                            field191[var4++] = class93.method55(client.method101(var87));
                            continue;
                        }
                        if (var382 == 1801) {
                            var4--;
                            int var88 = field191[var4];
                            int var383 = var88 - 1;
                            if (var87.field1846 != null && var383 < var87.field1846.length && var87.field1846[var383] != null) {
                                field195[var5++] = var87.field1846[var383];
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 1802) {
                            if (var87.field1835 == null) {
                                field195[var5++] = "";
                            } else {
                                field195[var5++] = var87.field1835;
                            }
                            continue;
                        }
                    } else if (var382 < 2600) {
                        var4--;
                        class141 var89 = class141.method451(field191[var4]);
                        if (var382 == 2500) {
                            field191[var4++] = var89.field1780;
                            continue;
                        }
                        if (var382 == 2501) {
                            field191[var4++] = var89.field1781;
                            continue;
                        }
                        if (var382 == 2502) {
                            field191[var4++] = var89.field1782;
                            continue;
                        }
                        if (var382 == 2503) {
                            field191[var4++] = var89.field1785;
                            continue;
                        }
                        if (var382 == 2504) {
                            field191[var4++] = var89.field1829 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 2505) {
                            field191[var4++] = var89.field1786;
                            continue;
                        }
                    } else if (var382 < 2700) {
                        var4--;
                        class141 var90 = class141.method451(field191[var4]);
                        if (var382 == 2600) {
                            field191[var4++] = var90.field1840;
                            continue;
                        }
                        if (var382 == 2601) {
                            field191[var4++] = var90.field1789;
                            continue;
                        }
                        if (var382 == 2602) {
                            field195[var5++] = var90.field1822;
                            continue;
                        }
                        if (var382 == 2603) {
                            field191[var4++] = var90.field1790;
                            continue;
                        }
                        if (var382 == 2604) {
                            field191[var4++] = var90.field1836;
                            continue;
                        }
                        if (var382 == 2605) {
                            field191[var4++] = var90.field1818;
                            continue;
                        }
                        if (var382 == 2606) {
                            field191[var4++] = var90.field1777;
                            continue;
                        }
                        if (var382 == 2607) {
                            field191[var4++] = var90.field1817;
                            continue;
                        }
                        if (var382 == 2608) {
                            field191[var4++] = var90.field1791;
                            continue;
                        }
                    } else if (var382 < 2800) {
                        if (var382 == 2700) {
                            var4--;
                            class141 var91 = class141.method451(field191[var4]);
                            field191[var4++] = var91.field1888;
                            continue;
                        }
                        if (var382 == 2701) {
                            var4--;
                            class141 var92 = class141.method451(field191[var4]);
                            if (var92.field1888 == -1) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = var92.field1814;
                            }
                            continue;
                        }
                        if (var382 == 2702) {
                            var4--;
                            int var93 = field191[var4];
                            class124 var94 = (class124) client.field2160.method1290((long) var93);
                            if (var94 == null) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var382 < 2900) {
                        var4--;
                        class141 var95 = class141.method451(field191[var4]);
                        if (var382 == 2800) {
                            field191[var4++] = class93.method55(client.method101(var95));
                            continue;
                        }
                        if (var382 == 2801) {
                            var4--;
                            int var96 = field191[var4];
                            int var384 = var96 - 1;
                            if (var95.field1846 != null && var384 < var95.field1846.length && var95.field1846[var384] != null) {
                                field195[var5++] = var95.field1846[var384];
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 2802) {
                            if (var95.field1835 == null) {
                                field195[var5++] = "";
                            } else {
                                field195[var5++] = var95.field1835;
                            }
                            continue;
                        }
                    } else if (var382 < 3200) {
                        if (var382 == 3100) {
                            var5--;
                            String var97 = field195[var5];
                            client.method1101(0, "", var97);
                            continue;
                        }
                        if (var382 == 3101) {
                            var4 -= 2;
                            client.method54(Statics.field1230, field191[var4], field191[var4 + 1]);
                            continue;
                        }
                        if (var382 == 3103) {
                            client.field2162.method2308(245);
                            for (class124 var98 = (class124) client.field2160.method1280(); var98 != null; var98 = (class124) client.field2160.method1282()) {
                                if (var98.field1601 == 0 || var98.field1601 == 3) {
                                    client.method720(var98, true);
                                }
                            }
                            if (client.field2087 != null) {
                                client.method542(client.field2087);
                                client.field2087 = null;
                            }
                            continue;
                        }
                        if (var382 == 3104) {
                            var5--;
                            String var99 = field195[var5];
                            int var100 = 0;
                            boolean var101 = false;
                            boolean var102 = false;
                            int var103 = 0;
                            int var104 = var99.length();
                            int var105 = 0;
                            boolean var107;
                            while (true) {
                                if (var105 >= var104) {
                                    var107 = var102;
                                    break;
                                }
                                label2635: {
                                    char var106 = var99.charAt(var105);
                                    if (var105 == 0) {
                                        if (var106 == '-') {
                                            var101 = true;
                                            break label2635;
                                        }
                                        if (var106 == '+') {
                                            break label2635;
                                        }
                                    }
                                    int var385;
                                    if (var106 >= '0' && var106 <= '9') {
                                        var385 = var106 - '0';
                                    } else if (var106 >= 'A' && var106 <= 'Z') {
                                        var385 = var106 - '7';
                                    } else {
                                        if (var106 < 'a' || var106 > 'z') {
                                            var107 = false;
                                            break;
                                        }
                                        var385 = var106 - 'W';
                                    }
                                    if (var385 >= 10) {
                                        var107 = false;
                                        break;
                                    }
                                    if (var101) {
                                        var385 = -var385;
                                    }
                                    int var108 = var103 * 10 + var385;
                                    if (var108 / 10 != var103) {
                                        var107 = false;
                                        break;
                                    }
                                    var103 = var108;
                                    var102 = true;
                                }
                                var105++;
                            }
                            if (var107) {
                                int var110 = class83.method1830(var99, 10, true);
                                var100 = var110;
                            }
                            client.field2162.method2308(83);
                            client.field2162.method1592(var100);
                            continue;
                        }
                        if (var382 == 3105) {
                            var5--;
                            String var111 = field195[var5];
                            client.field2162.method2308(60);
                            client.field2162.method1612(var111.length() + 1);
                            client.field2162.method1702(var111);
                            continue;
                        }
                        if (var382 == 3106) {
                            var5--;
                            String var112 = field195[var5];
                            client.field2162.method2308(195);
                            client.field2162.method1612(var112.length() + 1);
                            client.field2162.method1702(var112);
                            continue;
                        }
                        if (var382 == 3107) {
                            var4--;
                            int var113 = field191[var4];
                            var5--;
                            String var114 = field195[var5];
                            client.method149(var113, var114);
                            continue;
                        }
                        if (var382 == 3108) {
                            var4 -= 3;
                            int var115 = field191[var4];
                            int var116 = field191[var4 + 1];
                            int var117 = field191[var4 + 2];
                            class141 var118 = class141.method451(var117);
                            client.method737(var118, var115, var116);
                            continue;
                        }
                        if (var382 == 3109) {
                            var4 -= 2;
                            int var119 = field191[var4];
                            int var120 = field191[var4 + 1];
                            class141 var121 = var50 ? Statics.field201 : Statics.field205;
                            client.method737(var121, var119, var120);
                            continue;
                        }
                    } else if (var382 < 3300) {
                        if (var382 == 3200) {
                            var4 -= 3;
                            int var122 = field191[var4];
                            int var123 = field191[var4 + 1];
                            int var124 = field191[var4 + 2];
                            if (client.field2172 != 0 && var123 != 0 && client.field2175 < 50) {
                                client.field2005[client.field2175] = var122;
                                client.field2177[client.field2175] = var123;
                                client.field2178[client.field2175] = var124;
                                client.field2180[client.field2175] = null;
                                client.field2179[client.field2175] = 0;
                                client.field2175++;
                            }
                            continue;
                        }
                        if (var382 == 3201) {
                            var4--;
                            int var125 = field191[var4];
                            if (var125 == -1 && !client.field2170) {
                                Statics.field1131.method2286();
                                class79.field1130 = 1;
                                Statics.field1125 = null;
                            } else if (var125 != -1 && client.field1932 != var125 && client.field2075 != 0 && !client.field2170) {
                                class79.method6(2, Statics.field702, var125, 0, client.field2075, false);
                            }
                            client.field1932 = var125;
                            continue;
                        }
                        if (var382 == 3202) {
                            var4 -= 2;
                            int var126 = field191[var4];
                            int var10000 = field191[var4 + 1];
                            if (client.field2075 != 0 && var126 != -1) {
                                class79.method278(Statics.field2103, var126, 0, client.field2075, false);
                                client.field2170 = true;
                            }
                            continue;
                        }
                    } else if (var382 < 3400) {
                        if (var382 == 3300) {
                            field191[var4++] = client.field1919;
                            continue;
                        }
                        if (var382 == 3301) {
                            var4 -= 2;
                            int var128 = field191[var4];
                            int var129 = field191[var4 + 1];
                            field191[var4++] = class127.method717(var128, var129);
                            continue;
                        }
                        if (var382 == 3302) {
                            var4 -= 2;
                            int var130 = field191[var4];
                            int var131 = field191[var4 + 1];
                            field191[var4++] = class127.method718(var130, var131);
                            continue;
                        }
                        if (var382 == 3303) {
                            var4 -= 2;
                            int var132 = field191[var4];
                            int var133 = field191[var4 + 1];
                            field191[var4++] = Statics.method887(var132, var133);
                            continue;
                        }
                        if (var382 == 3304) {
                            var4--;
                            int var134 = field191[var4];
                            field191[var4++] = class163.method230(var134).field2475;
                            continue;
                        }
                        if (var382 == 3305) {
                            var4--;
                            int var135 = field191[var4];
                            field191[var4++] = client.field2060[var135];
                            continue;
                        }
                        if (var382 == 3306) {
                            var4--;
                            int var136 = field191[var4];
                            field191[var4++] = client.field2061[var136];
                            continue;
                        }
                        if (var382 == 3307) {
                            var4--;
                            int var137 = field191[var4];
                            field191[var4++] = client.field2093[var137];
                            continue;
                        }
                        if (var382 == 3308) {
                            int var138 = Statics.field2046;
                            int var139 = (Statics.field1230.field2630 >> 7) + Statics.field125;
                            int var140 = (Statics.field1230.field2615 >> 7) + Statics.field542;
                            field191[var4++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var382 == 3309) {
                            var4--;
                            int var141 = field191[var4];
                            field191[var4++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var382 == 3310) {
                            var4--;
                            int var142 = field191[var4];
                            field191[var4++] = var142 >> 28;
                            continue;
                        }
                        if (var382 == 3311) {
                            var4--;
                            int var143 = field191[var4];
                            field191[var4++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var382 == 3312) {
                            field191[var4++] = client.field1913 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 3313) {
                            var4 -= 2;
                            int var144 = field191[var4] + 32768;
                            int var145 = field191[var4 + 1];
                            field191[var4++] = class127.method717(var144, var145);
                            continue;
                        }
                        if (var382 == 3314) {
                            var4 -= 2;
                            int var146 = field191[var4] + 32768;
                            int var147 = field191[var4 + 1];
                            int[] var148 = field191;
                            int var149 = var4++;
                            class127 var150 = (class127) class127.field1624.method1290((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 >= 0 && var147 < var150.field1625.length) {
                                var151 = var150.field1625[var147];
                            } else {
                                var151 = 0;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var382 == 3315) {
                            var4 -= 2;
                            int var152 = field191[var4] + 32768;
                            int var153 = field191[var4 + 1];
                            field191[var4++] = Statics.method887(var152, var153);
                            continue;
                        }
                        if (var382 == 3316) {
                            if (client.field2090 >= 2) {
                                field191[var4++] = client.field2090;
                            } else {
                                field191[var4++] = 0;
                            }
                            continue;
                        }
                        if (var382 == 3317) {
                            field191[var4++] = client.field1926;
                            continue;
                        }
                        if (var382 == 3318) {
                            field191[var4++] = client.field2083;
                            continue;
                        }
                        if (var382 == 3321) {
                            field191[var4++] = client.field1908;
                            continue;
                        }
                        if (var382 == 3322) {
                            field191[var4++] = client.field2140;
                            continue;
                        }
                        if (var382 == 3323) {
                            if (client.field2091) {
                                field191[var4++] = 1;
                            } else {
                                field191[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var382 < 3500) {
                        if (var382 == 3400) {
                            var4 -= 2;
                            int var154 = field191[var4];
                            int var155 = field191[var4 + 1];
                            class161 var156 = Statics.method49(var154);
                            if (var156.field2427 != 's') {
                            }
                            for (int var157 = 0; var157 < var156.field2425; var157++) {
                                if (var156.field2428[var157] == var155) {
                                    field195[var5++] = var156.field2421[var157];
                                    var156 = null;
                                    break;
                                }
                            }
                            if (var156 != null) {
                                field195[var5++] = var156.field2430;
                            }
                            continue;
                        }
                        if (var382 == 3408) {
                            var4 -= 4;
                            int var158 = field191[var4];
                            int var159 = field191[var4 + 1];
                            int var160 = field191[var4 + 2];
                            int var161 = field191[var4 + 3];
                            class161 var162 = Statics.method49(var160);
                            if (var162.field2423 == var158 && var162.field2427 == var159) {
                                for (int var163 = 0; var163 < var162.field2425; var163++) {
                                    if (var162.field2428[var163] == var161) {
                                        if (var159 == 115) {
                                            field195[var5++] = var162.field2421[var163];
                                        } else {
                                            field191[var4++] = var162.field2429[var163];
                                        }
                                        var162 = null;
                                        break;
                                    }
                                }
                                if (var162 != null) {
                                    if (var159 == 115) {
                                        field195[var5++] = var162.field2430;
                                    } else {
                                        field191[var4++] = var162.field2426;
                                    }
                                }
                                continue;
                            }
                            if (var159 == 115) {
                                field195[var5++] = "null";
                            } else {
                                field191[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var382 < 3700) {
                        if (var382 == 3600) {
                            if (client.field2001 == 0) {
                                field191[var4++] = -2;
                            } else if (client.field2001 == 1) {
                                field191[var4++] = -1;
                            } else {
                                field191[var4++] = client.field2188;
                            }
                            continue;
                        }
                        if (var382 == 3601) {
                            var4--;
                            int var164 = field191[var4];
                            if (client.field2001 == 2 && var164 < client.field2188) {
                                field195[var5++] = client.field2030[var164].field178;
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 3602) {
                            var4--;
                            int var165 = field191[var4];
                            if (client.field2001 == 2 && var165 < client.field2188) {
                                field191[var4++] = client.field2030[var165].field175;
                                continue;
                            }
                            field191[var4++] = 0;
                            continue;
                        }
                        if (var382 == 3603) {
                            var4--;
                            int var166 = field191[var4];
                            if (client.field2001 == 2 && var166 < client.field2188) {
                                field191[var4++] = client.field2030[var166].field176;
                                continue;
                            }
                            field191[var4++] = 0;
                            continue;
                        }
                        if (var382 == 3604) {
                            var5--;
                            String var167 = field195[var5];
                            var4--;
                            int var168 = field191[var4];
                            client.method53(var167, var168);
                            continue;
                        }
                        if (var382 == 3605) {
                            var5--;
                            String var169 = field195[var5];
                            if (var169 == null) {
                                continue;
                            }
                            if ((client.field2188 < 200 || client.field1929 == 1) && client.field2188 < 200) {
                                String var170 = class84.method1100(var169, Statics.field1912);
                                if (var170 == null) {
                                    continue;
                                }
                                for (int var171 = 0; var171 < client.field2188; var171++) {
                                    class10 var172 = client.field2030[var171];
                                    String var173 = class84.method1100(var172.field178, Statics.field1912);
                                    if (var173 != null && var173.equals(var170)) {
                                        client.method1101(0, "", var169 + class75.field1036);
                                        continue label2451;
                                    }
                                    if (var172.field174 != null) {
                                        String var174 = class84.method1100(var172.field174, Statics.field1912);
                                        if (var174 != null && var174.equals(var170)) {
                                            client.method1101(0, "", var169 + class75.field1036);
                                            continue label2451;
                                        }
                                    }
                                }
                                for (int var175 = 0; var175 < client.field2193; var175++) {
                                    class4 var176 = client.field1959[var175];
                                    String var177 = class84.method1100(var176.field38, Statics.field1912);
                                    if (var177 != null && var177.equals(var170)) {
                                        client.method1101(0, "", class75.field1041 + var169 + class75.field899);
                                        continue label2451;
                                    }
                                    if (var176.field37 != null) {
                                        String var178 = class84.method1100(var176.field37, Statics.field1912);
                                        if (var178 != null && var178.equals(var170)) {
                                            client.method1101(0, "", class75.field1041 + var169 + class75.field899);
                                            continue label2451;
                                        }
                                    }
                                }
                                if (class84.method1100(Statics.field1230.field2792, Statics.field1912).equals(var170)) {
                                    client.method1101(0, "", class75.field1008);
                                } else {
                                    client.field2162.method2308(49);
                                    client.field2162.method1612(class136.method1143(var169));
                                    client.field2162.method1702(var169);
                                }
                                continue;
                            }
                            client.method1101(0, "", class75.field1039);
                            continue;
                        }
                        if (var382 == 3606) {
                            var5--;
                            String var179 = field195[var5];
                            if (var179 == null) {
                                continue;
                            }
                            String var180 = class84.method1100(var179, Statics.field1912);
                            if (var180 == null) {
                                continue;
                            }
                            int var181 = 0;
                            while (true) {
                                if (var181 >= client.field2188) {
                                    continue label2451;
                                }
                                class10 var182 = client.field2030[var181];
                                String var183 = var182.field178;
                                String var184 = class84.method1100(var183, Statics.field1912);
                                boolean var185;
                                if (var179 == null || var183 == null) {
                                    var185 = false;
                                } else if (var179.startsWith("#") || var183.startsWith("#")) {
                                    var185 = var179.equals(var183);
                                } else {
                                    var185 = var180.equals(var184);
                                }
                                if (var185) {
                                    client.field2188--;
                                    for (int var186 = var181; var186 < client.field2188; var186++) {
                                        client.field2030[var186] = client.field2030[var186 + 1];
                                    }
                                    client.field2116 = client.field1954;
                                    client.field2162.method2308(101);
                                    client.field2162.method1612(class136.method1143(var179));
                                    client.field2162.method1702(var179);
                                    continue label2451;
                                }
                                var181++;
                            }
                        }
                        if (var382 == 3607) {
                            var5--;
                            String var187 = field195[var5];
                            client.method896(var187, false);
                            continue;
                        }
                        if (var382 == 3608) {
                            var5--;
                            String var188 = field195[var5];
                            if (var188 == null) {
                                continue;
                            }
                            String var189 = class84.method1100(var188, Statics.field1912);
                            if (var189 == null) {
                                continue;
                            }
                            int var190 = 0;
                            while (true) {
                                if (var190 >= client.field2193) {
                                    continue label2451;
                                }
                                class4 var191 = client.field1959[var190];
                                String var192 = var191.field38;
                                String var193 = class84.method1100(var192, Statics.field1912);
                                boolean var194;
                                if (var188 == null || var192 == null) {
                                    var194 = false;
                                } else if (var188.startsWith("#") || var192.startsWith("#")) {
                                    var194 = var188.equals(var192);
                                } else {
                                    var194 = var189.equals(var193);
                                }
                                if (var194) {
                                    client.field2193--;
                                    for (int var195 = var190; var195 < client.field2193; var195++) {
                                        client.field1959[var195] = client.field1959[var195 + 1];
                                    }
                                    client.field2116 = client.field1954;
                                    client.field2162.method2308(100);
                                    client.field2162.method1612(class136.method1143(var188));
                                    client.field2162.method1702(var188);
                                    continue label2451;
                                }
                                var190++;
                            }
                        }
                        if (var382 == 3609) {
                            var5--;
                            String var196 = field195[var5];
                            if (var196.startsWith(class1.method1118(0)) || var196.startsWith(class1.method1118(1))) {
                                var196 = var196.substring(7);
                            }
                            field191[var4++] = client.method766(var196) ? 1 : 0;
                            continue;
                        }
                        if (var382 == 3611) {
                            if (client.field1921 == null) {
                                field195[var5++] = "";
                            } else {
                                field195[var5++] = class82.method360(client.field1921);
                            }
                            continue;
                        }
                        if (var382 == 3612) {
                            if (client.field1921 == null) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = Statics.field1116;
                            }
                            continue;
                        }
                        if (var382 == 3613) {
                            var4--;
                            int var197 = field191[var4];
                            if (client.field1921 != null && var197 < Statics.field1116) {
                                field195[var5++] = Statics.field544[var197].field1621;
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 3614) {
                            var4--;
                            int var198 = field191[var4];
                            if (client.field1921 != null && var198 < Statics.field1116) {
                                field191[var4++] = Statics.field544[var198].field1619;
                                continue;
                            }
                            field191[var4++] = 0;
                            continue;
                        }
                        if (var382 == 3615) {
                            var4--;
                            int var199 = field191[var4];
                            if (client.field1921 != null && var199 < Statics.field1116) {
                                field191[var4++] = Statics.field544[var199].field1622;
                                continue;
                            }
                            field191[var4++] = 0;
                            continue;
                        }
                        if (var382 == 3616) {
                            field191[var4++] = Statics.field12;
                            continue;
                        }
                        if (var382 == 3617) {
                            var5--;
                            String var200 = field195[var5];
                            if (Statics.field544 != null) {
                                client.field2162.method2308(155);
                                client.field2162.method1612(class136.method1143(var200));
                                client.field2162.method1702(var200);
                            }
                            continue;
                        }
                        if (var382 == 3618) {
                            field191[var4++] = Statics.field693;
                            continue;
                        }
                        if (var382 == 3619) {
                            var5--;
                            String var201 = field195[var5];
                            if (!var201.equals("")) {
                                client.field2162.method2308(208);
                                client.field2162.method1612(class136.method1143(var201));
                                client.field2162.method1702(var201);
                            }
                            continue;
                        }
                        if (var382 == 3620) {
                            client.field2162.method2308(208);
                            client.field2162.method1612(0);
                            continue;
                        }
                        if (var382 == 3621) {
                            if (client.field2001 == 0) {
                                field191[var4++] = -1;
                            } else {
                                field191[var4++] = client.field2193;
                            }
                            continue;
                        }
                        if (var382 == 3622) {
                            var4--;
                            int var202 = field191[var4];
                            if (client.field2001 != 0 && var202 < client.field2193) {
                                field195[var5++] = client.field1959[var202].field38;
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 3623) {
                            var5--;
                            String var203 = field195[var5];
                            if (var203.startsWith(class1.method1118(0)) || var203.startsWith(class1.method1118(1))) {
                                var203 = var203.substring(7);
                            }
                            field191[var4++] = client.method1769(var203) ? 1 : 0;
                            continue;
                        }
                        if (var382 == 3624) {
                            var4--;
                            int var204 = field191[var4];
                            if (Statics.field544 != null && var204 < Statics.field1116 && Statics.field544[var204].field1621.equalsIgnoreCase(Statics.field1230.field2792)) {
                                field191[var4++] = 1;
                                continue;
                            }
                            field191[var4++] = 0;
                            continue;
                        }
                        if (var382 == 3625) {
                            if (client.field2154 == null) {
                                field195[var5++] = "";
                            } else {
                                String[] var205 = field195;
                                int var206 = var5++;
                                String var207 = client.field2154;
                                String var208 = Statics.method1117(class82.method897(var207));
                                if (var208 == null) {
                                    var208 = "";
                                }
                                var205[var206] = var208;
                            }
                            continue;
                        }
                    } else if (var382 < 4100) {
                        if (var382 == 4000) {
                            var4 -= 2;
                            int var210 = field191[var4];
                            int var211 = field191[var4 + 1];
                            field191[var4++] = var210 + var211;
                            continue;
                        }
                        if (var382 == 4001) {
                            var4 -= 2;
                            int var212 = field191[var4];
                            int var213 = field191[var4 + 1];
                            field191[var4++] = var212 - var213;
                            continue;
                        }
                        if (var382 == 4002) {
                            var4 -= 2;
                            int var214 = field191[var4];
                            int var215 = field191[var4 + 1];
                            field191[var4++] = var214 * var215;
                            continue;
                        }
                        if (var382 == 4003) {
                            var4 -= 2;
                            int var216 = field191[var4];
                            int var217 = field191[var4 + 1];
                            field191[var4++] = var216 / var217;
                            continue;
                        }
                        if (var382 == 4004) {
                            var4--;
                            int var218 = field191[var4];
                            field191[var4++] = (int) (Math.random() * (double) var218);
                            continue;
                        }
                        if (var382 == 4005) {
                            var4--;
                            int var219 = field191[var4];
                            field191[var4++] = (int) (Math.random() * (double) (var219 + 1));
                            continue;
                        }
                        if (var382 == 4006) {
                            var4 -= 5;
                            int var220 = field191[var4];
                            int var221 = field191[var4 + 1];
                            int var222 = field191[var4 + 2];
                            int var223 = field191[var4 + 3];
                            int var224 = field191[var4 + 4];
                            field191[var4++] = (var221 - var220) * (var224 - var222) / (var223 - var222) + var220;
                            continue;
                        }
                        if (var382 == 4007) {
                            var4 -= 2;
                            int var225 = field191[var4];
                            int var226 = field191[var4 + 1];
                            field191[var4++] = var225 * var226 / 100 + var225;
                            continue;
                        }
                        if (var382 == 4008) {
                            var4 -= 2;
                            int var227 = field191[var4];
                            int var228 = field191[var4 + 1];
                            field191[var4++] = var227 | 0x1 << var228;
                            continue;
                        }
                        if (var382 == 4009) {
                            var4 -= 2;
                            int var229 = field191[var4];
                            int var230 = field191[var4 + 1];
                            field191[var4++] = var229 & -1 - (0x1 << var230);
                            continue;
                        }
                        if (var382 == 4010) {
                            var4 -= 2;
                            int var231 = field191[var4];
                            int var232 = field191[var4 + 1];
                            field191[var4++] = (var231 & 0x1 << var232) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var382 == 4011) {
                            var4 -= 2;
                            int var233 = field191[var4];
                            int var234 = field191[var4 + 1];
                            field191[var4++] = var233 % var234;
                            continue;
                        }
                        if (var382 == 4012) {
                            var4 -= 2;
                            int var235 = field191[var4];
                            int var236 = field191[var4 + 1];
                            if (var235 == 0) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = (int) Math.pow((double) var235, (double) var236);
                            }
                            continue;
                        }
                        if (var382 == 4013) {
                            var4 -= 2;
                            int var237 = field191[var4];
                            int var238 = field191[var4 + 1];
                            if (var237 == 0) {
                                field191[var4++] = 0;
                            } else if (var238 == 0) {
                                field191[var4++] = Integer.MAX_VALUE;
                            } else {
                                field191[var4++] = (int) Math.pow((double) var237, 1.0D / (double) var238);
                            }
                            continue;
                        }
                        if (var382 == 4014) {
                            var4 -= 2;
                            int var239 = field191[var4];
                            int var240 = field191[var4 + 1];
                            field191[var4++] = var239 & var240;
                            continue;
                        }
                        if (var382 == 4015) {
                            var4 -= 2;
                            int var241 = field191[var4];
                            int var242 = field191[var4 + 1];
                            field191[var4++] = var241 | var242;
                            continue;
                        }
                    } else if (var382 < 4200) {
                        if (var382 == 4100) {
                            var5--;
                            String var243 = field195[var5];
                            var4--;
                            int var244 = field191[var4];
                            field195[var5++] = var243 + var244;
                            continue;
                        }
                        if (var382 == 4101) {
                            var5 -= 2;
                            String var245 = field195[var5];
                            String var246 = field195[var5 + 1];
                            field195[var5++] = var245 + var246;
                            continue;
                        }
                        if (var382 == 4102) {
                            var5--;
                            String var247 = field195[var5];
                            var4--;
                            int var248 = field191[var4];
                            String[] var249 = field195;
                            int var250 = var5++;
                            String var252;
                            if (var248 < 0) {
                                var252 = Integer.toString(var248);
                            } else {
                                int var253 = var248;
                                String var254;
                                if (var248 < 0) {
                                    var254 = Integer.toString(var248, 10);
                                } else {
                                    int var255 = 2;
                                    int var256 = var248 / 10;
                                    while (var256 != 0) {
                                        var256 /= 10;
                                        var255++;
                                    }
                                    char[] var257 = new char[var255];
                                    var257[0] = '+';
                                    for (int var258 = var255 - 1; var258 > 0; var258--) {
                                        int var259 = var253;
                                        var253 /= 10;
                                        int var260 = var259 - var253 * 10;
                                        if (var260 >= 10) {
                                            var257[var258] = (char) (var260 + 87);
                                        } else {
                                            var257[var258] = (char) (var260 + 48);
                                        }
                                    }
                                    var254 = new String(var257);
                                }
                                var252 = var254;
                            }
                            var249[var250] = var247 + var252;
                            continue;
                        }
                        if (var382 == 4103) {
                            var5--;
                            String var261 = field195[var5];
                            field195[var5++] = var261.toLowerCase();
                            continue;
                        }
                        if (var382 == 4104) {
                            var4--;
                            int var262 = field191[var4];
                            long var263 = ((long) var262 + 11745L) * 86400000L;
                            field198.setTime(new Date(var263));
                            int var265 = field198.get(5);
                            int var266 = field198.get(2);
                            int var267 = field198.get(1);
                            field195[var5++] = var265 + "-" + field197[var266] + "-" + var267;
                            continue;
                        }
                        if (var382 == 4105) {
                            var5 -= 2;
                            String var268 = field195[var5];
                            String var269 = field195[var5 + 1];
                            if (Statics.field1230.field2794 != null && Statics.field1230.field2794.field1238) {
                                field195[var5++] = var269;
                                continue;
                            }
                            field195[var5++] = var268;
                            continue;
                        }
                        if (var382 == 4106) {
                            var4--;
                            int var270 = field191[var4];
                            field195[var5++] = Integer.toString(var270);
                            continue;
                        }
                        if (var382 == 4107) {
                            var5 -= 2;
                            int[] var271 = field191;
                            int var272 = var4++;
                            String var273 = field195[var5];
                            String var274 = field195[var5 + 1];
                            int var275 = client.field2048;
                            int var276 = var273.length();
                            int var277 = var274.length();
                            int var278 = 0;
                            int var279 = 0;
                            byte var280 = 0;
                            byte var281 = 0;
                            int var282;
                            label2301: while (true) {
                                if (var278 - var280 >= var276 && var279 - var281 >= var277) {
                                    int var293 = Math.min(var276, var277);
                                    for (int var294 = 0; var294 < var293; var294++) {
                                        char var297 = var273.charAt(var294);
                                        char var298 = var274.charAt(var294);
                                        if (var297 != var298 && Character.toUpperCase(var297) != Character.toUpperCase(var298)) {
                                            char var299 = Character.toLowerCase(var297);
                                            char var300 = Character.toLowerCase(var298);
                                            if (var299 != var300) {
                                                var282 = Statics.method884(var299, var275) - Statics.method884(var300, var275);
                                                break label2301;
                                            }
                                        }
                                    }
                                    int var301 = var276 - var277;
                                    if (var301 == 0) {
                                        for (int var302 = 0; var302 < var293; var302++) {
                                            char var303 = var273.charAt(var302);
                                            char var304 = var274.charAt(var302);
                                            if (var303 != var304) {
                                                var282 = Statics.method884(var303, var275) - Statics.method884(var304, var275);
                                                break label2301;
                                            }
                                        }
                                        var282 = 0;
                                    } else {
                                        var282 = var301;
                                    }
                                    break;
                                }
                                if (var278 - var280 >= var276) {
                                    var282 = -1;
                                    break;
                                }
                                if (var279 - var281 >= var277) {
                                    var282 = 1;
                                    break;
                                }
                                char var283;
                                if (var280 == 0) {
                                    var283 = var273.charAt(var278++);
                                } else {
                                    var283 = (char) var280;
                                    boolean var284 = false;
                                }
                                char var285;
                                if (var281 == 0) {
                                    var285 = var274.charAt(var279++);
                                } else {
                                    var285 = (char) var281;
                                    boolean var286 = false;
                                }
                                byte var287;
                                if (var283 == 198) {
                                    var287 = 69;
                                } else if (var283 == 230) {
                                    var287 = 101;
                                } else if (var283 == 223) {
                                    var287 = 115;
                                } else if (var283 == 338) {
                                    var287 = 69;
                                } else if (var283 == 339) {
                                    var287 = 101;
                                } else {
                                    var287 = 0;
                                }
                                var280 = var287;
                                byte var288;
                                if (var285 == 198) {
                                    var288 = 69;
                                } else if (var285 == 230) {
                                    var288 = 101;
                                } else if (var285 == 223) {
                                    var288 = 115;
                                } else if (var285 == 338) {
                                    var288 = 69;
                                } else if (var285 == 339) {
                                    var288 = 101;
                                } else {
                                    var288 = 0;
                                }
                                var281 = var288;
                                char var289 = class86.method1015(var283, var275);
                                char var290 = class86.method1015(var285, var275);
                                if (var289 != var290 && Character.toUpperCase(var289) != Character.toUpperCase(var290)) {
                                    char var291 = Character.toLowerCase(var289);
                                    char var292 = Character.toLowerCase(var290);
                                    if (var291 != var292) {
                                        var282 = Statics.method884(var291, var275) - Statics.method884(var292, var275);
                                        break;
                                    }
                                }
                            }
                            var271[var272] = class83.method716(var282);
                            continue;
                        }
                        if (var382 == 4108) {
                            var5--;
                            String var305 = field195[var5];
                            var4 -= 2;
                            int var306 = field191[var4];
                            int var307 = field191[var4 + 1];
                            byte[] var308 = Statics.field737.method1024(var307, 0);
                            class182 var309 = new class182(var308);
                            field191[var4++] = var309.method2825(var305, var306);
                            continue;
                        }
                        if (var382 == 4109) {
                            var5--;
                            String var310 = field195[var5];
                            var4 -= 2;
                            int var311 = field191[var4];
                            int var312 = field191[var4 + 1];
                            byte[] var313 = Statics.field737.method1024(var312, 0);
                            class182 var314 = new class182(var313);
                            field191[var4++] = var314.method2824(var310, var311);
                            continue;
                        }
                        if (var382 == 4110) {
                            var5 -= 2;
                            String var315 = field195[var5];
                            String var316 = field195[var5 + 1];
                            var4--;
                            if (field191[var4] == 1) {
                                field195[var5++] = var315;
                            } else {
                                field195[var5++] = var316;
                            }
                            continue;
                        }
                        if (var382 == 4111) {
                            var5--;
                            String var317 = field195[var5];
                            field195[var5++] = class174.method2826(var317);
                            continue;
                        }
                        if (var382 == 4112) {
                            var5--;
                            String var318 = field195[var5];
                            var4--;
                            int var319 = field191[var4];
                            field195[var5++] = var318 + (char) var319;
                            continue;
                        }
                        if (var382 == 4113) {
                            var4--;
                            int var320 = field191[var4];
                            field191[var4++] = class83.method243((char) var320) ? 1 : 0;
                            continue;
                        }
                        if (var382 == 4114) {
                            var4--;
                            int var321 = field191[var4];
                            field191[var4++] = class83.method100((char) var321) ? 1 : 0;
                            continue;
                        }
                        if (var382 == 4115) {
                            var4--;
                            int var322 = field191[var4];
                            int[] var323 = field191;
                            int var324 = var4++;
                            char var325 = (char) var322;
                            boolean var326 = var325 >= 'A' && var325 <= 'Z' || var325 >= 'a' && var325 <= 'z';
                            var323[var324] = var326 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 4116) {
                            var4--;
                            int var327 = field191[var4];
                            int[] var328 = field191;
                            int var329 = var4++;
                            char var330 = (char) var327;
                            boolean var331 = var330 >= '0' && var330 <= '9';
                            var328[var329] = var331 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 4117) {
                            var5--;
                            String var332 = field195[var5];
                            if (var332 == null) {
                                field191[var4++] = 0;
                            } else {
                                field191[var4++] = var332.length();
                            }
                            continue;
                        }
                        if (var382 == 4118) {
                            var5--;
                            String var333 = field195[var5];
                            var4 -= 2;
                            int var334 = field191[var4];
                            int var335 = field191[var4 + 1];
                            field195[var5++] = var333.substring(var334, var335);
                            continue;
                        }
                        if (var382 == 4119) {
                            var5--;
                            String var336 = field195[var5];
                            StringBuilder var337 = new StringBuilder(var336.length());
                            boolean var338 = false;
                            for (int var339 = 0; var339 < var336.length(); var339++) {
                                char var340 = var336.charAt(var339);
                                if (var340 == '<') {
                                    var338 = true;
                                } else if (var340 == '>') {
                                    var338 = false;
                                } else if (!var338) {
                                    var337.append(var340);
                                }
                            }
                            field195[var5++] = var337.toString();
                            continue;
                        }
                        if (var382 == 4120) {
                            var5--;
                            String var341 = field195[var5];
                            var4--;
                            int var342 = field191[var4];
                            field191[var4++] = var341.indexOf(var342);
                            continue;
                        }
                    } else if (var382 < 4300) {
                        if (var382 == 4200) {
                            var4--;
                            int var343 = field191[var4];
                            field195[var5++] = class162.method768(var343).field2437;
                            continue;
                        }
                        if (var382 == 4201) {
                            var4 -= 2;
                            int var344 = field191[var4];
                            int var345 = field191[var4 + 1];
                            class162 var346 = class162.method768(var344);
                            if (var345 >= 1 && var345 <= 5 && var346.field2463[var345 - 1] != null) {
                                field195[var5++] = var346.field2463[var345 - 1];
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 4202) {
                            var4 -= 2;
                            int var347 = field191[var4];
                            int var348 = field191[var4 + 1];
                            class162 var349 = class162.method768(var347);
                            if (var348 >= 1 && var348 <= 5 && var349.field2461[var348 - 1] != null) {
                                field195[var5++] = var349.field2461[var348 - 1];
                                continue;
                            }
                            field195[var5++] = "";
                            continue;
                        }
                        if (var382 == 4203) {
                            var4--;
                            int var350 = field191[var4];
                            field191[var4++] = class162.method768(var350).field2451;
                            continue;
                        }
                        if (var382 == 4204) {
                            var4--;
                            int var351 = field191[var4];
                            field191[var4++] = class162.method768(var351).field2456 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var382 == 4205) {
                            var4--;
                            int var352 = field191[var4];
                            class162 var353 = class162.method768(var352);
                            if (var353.field2468 == -1 && var353.field2467 >= 0) {
                                field191[var4++] = var353.field2467;
                                continue;
                            }
                            field191[var4++] = var352;
                            continue;
                        }
                        if (var382 == 4206) {
                            var4--;
                            int var354 = field191[var4];
                            class162 var355 = class162.method768(var354);
                            if (var355.field2468 >= 0 && var355.field2467 >= 0) {
                                field191[var4++] = var355.field2467;
                                continue;
                            }
                            field191[var4++] = var354;
                            continue;
                        }
                        if (var382 == 4207) {
                            var4--;
                            int var356 = field191[var4];
                            field191[var4++] = class162.method768(var356).field2450 ? 1 : 0;
                            continue;
                        }
                    } else if (var382 < 5100) {
                        if (var382 == 5000) {
                            field191[var4++] = client.field2122;
                            continue;
                        }
                        if (var382 == 5001) {
                            var4 -= 3;
                            client.field2122 = field191[var4];
                            Statics.field36 = Statics.method798(field191[var4 + 1]);
                            if (Statics.field36 == null) {
                                Statics.field36 = class78.field1123;
                            }
                            client.field2145 = field191[var4 + 2];
                            client.field2162.method2308(73);
                            client.field2162.method1612(client.field2122);
                            client.field2162.method1612(Statics.field36.field1124);
                            client.field2162.method1612(client.field2145);
                            continue;
                        }
                        if (var382 == 5002) {
                            var5--;
                            String var357 = field195[var5];
                            var4 -= 2;
                            int var358 = field191[var4];
                            int var359 = field191[var4 + 1];
                            client.field2162.method2308(39);
                            client.field2162.method1612(class136.method1143(var357) + 2);
                            client.field2162.method1702(var357);
                            client.field2162.method1612(var358 - 1);
                            client.field2162.method1612(var359);
                            continue;
                        }
                        if (var382 == 5003) {
                            var4--;
                            int var360 = field191[var4];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = client.field2097[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field195[var5++] = var361;
                            continue;
                        }
                        if (var382 == 5004) {
                            var4--;
                            int var362 = field191[var4];
                            int var363 = -1;
                            if (var362 < 100 && client.field2097[var362] != null) {
                                var363 = client.field2138[var362];
                            }
                            field191[var4++] = var363;
                            continue;
                        }
                        if (var382 == 5005) {
                            if (Statics.field36 == null) {
                                field191[var4++] = -1;
                            } else {
                                field191[var4++] = Statics.field36.field1124;
                            }
                            continue;
                        }
                        if (var382 == 5008) {
                            var5--;
                            String var364 = field195[var5];
                            if (var364.startsWith("::")) {
                                client.method5(var364);
                            } else {
                                String var365 = var364.toLowerCase();
                                byte var366 = 0;
                                if (var365.startsWith(class75.field1045)) {
                                    var366 = 0;
                                    var364 = var364.substring(class75.field1045.length());
                                } else if (var365.startsWith(class75.field1047)) {
                                    var366 = 1;
                                    var364 = var364.substring(class75.field1047.length());
                                } else if (var365.startsWith(class75.field1049)) {
                                    var366 = 2;
                                    var364 = var364.substring(class75.field1049.length());
                                } else if (var365.startsWith(class75.field1051)) {
                                    var366 = 3;
                                    var364 = var364.substring(class75.field1051.length());
                                } else if (var365.startsWith(class75.field1053)) {
                                    var366 = 4;
                                    var364 = var364.substring(class75.field1053.length());
                                } else if (var365.startsWith(class75.field890)) {
                                    var366 = 5;
                                    var364 = var364.substring(class75.field890.length());
                                } else if (var365.startsWith(class75.field1105)) {
                                    var366 = 6;
                                    var364 = var364.substring(class75.field1105.length());
                                } else if (var365.startsWith(class75.field892)) {
                                    var366 = 7;
                                    var364 = var364.substring(class75.field892.length());
                                } else if (var365.startsWith(class75.field1061)) {
                                    var366 = 8;
                                    var364 = var364.substring(class75.field1061.length());
                                } else if (var365.startsWith(class75.field1063)) {
                                    var366 = 9;
                                    var364 = var364.substring(class75.field1063.length());
                                } else if (var365.startsWith(class75.field1065)) {
                                    var366 = 10;
                                    var364 = var364.substring(class75.field1065.length());
                                } else if (var365.startsWith(class75.field1067)) {
                                    var366 = 11;
                                    var364 = var364.substring(class75.field1067.length());
                                } else if (client.field2048 != 0) {
                                    if (var365.startsWith(class75.field1046)) {
                                        var366 = 0;
                                        var364 = var364.substring(class75.field1046.length());
                                    } else if (var365.startsWith(class75.field1048)) {
                                        var366 = 1;
                                        var364 = var364.substring(class75.field1048.length());
                                    } else if (var365.startsWith(class75.field1050)) {
                                        var366 = 2;
                                        var364 = var364.substring(class75.field1050.length());
                                    } else if (var365.startsWith(class75.field1052)) {
                                        var366 = 3;
                                        var364 = var364.substring(class75.field1052.length());
                                    } else if (var365.startsWith(class75.field913)) {
                                        var366 = 4;
                                        var364 = var364.substring(class75.field913.length());
                                    } else if (var365.startsWith(class75.field980)) {
                                        var366 = 5;
                                        var364 = var364.substring(class75.field980.length());
                                    } else if (var365.startsWith(class75.field1058)) {
                                        var366 = 6;
                                        var364 = var364.substring(class75.field1058.length());
                                    } else if (var365.startsWith(class75.field1060)) {
                                        var366 = 7;
                                        var364 = var364.substring(class75.field1060.length());
                                    } else if (var365.startsWith(class75.field882)) {
                                        var366 = 8;
                                        var364 = var364.substring(class75.field882.length());
                                    } else if (var365.startsWith(class75.field1064)) {
                                        var366 = 9;
                                        var364 = var364.substring(class75.field1064.length());
                                    } else if (var365.startsWith(class75.field883)) {
                                        var366 = 10;
                                        var364 = var364.substring(class75.field883.length());
                                    } else if (var365.startsWith(class75.field1080)) {
                                        var366 = 11;
                                        var364 = var364.substring(class75.field1080.length());
                                    }
                                }
                                String var367 = var364.toLowerCase();
                                byte var368 = 0;
                                if (var367.startsWith(class75.field1022)) {
                                    var368 = 1;
                                    var364 = var364.substring(class75.field1022.length());
                                } else if (var367.startsWith(class75.field1071)) {
                                    var368 = 2;
                                    var364 = var364.substring(class75.field1071.length());
                                } else if (var367.startsWith(class75.field1073)) {
                                    var368 = 3;
                                    var364 = var364.substring(class75.field1073.length());
                                } else if (var367.startsWith(class75.field1075)) {
                                    var368 = 4;
                                    var364 = var364.substring(class75.field1075.length());
                                } else if (var367.startsWith(class75.field1077)) {
                                    var368 = 5;
                                    var364 = var364.substring(class75.field1077.length());
                                } else if (client.field2048 != 0) {
                                    if (var367.startsWith(class75.field1070)) {
                                        var368 = 1;
                                        var364 = var364.substring(class75.field1070.length());
                                    } else if (var367.startsWith(class75.field1072)) {
                                        var368 = 2;
                                        var364 = var364.substring(class75.field1072.length());
                                    } else if (var367.startsWith(class75.field1074)) {
                                        var368 = 3;
                                        var364 = var364.substring(class75.field1074.length());
                                    } else if (var367.startsWith(class75.field1076)) {
                                        var368 = 4;
                                        var364 = var364.substring(class75.field1076.length());
                                    } else if (var367.startsWith(class75.field1078)) {
                                        var368 = 5;
                                        var364 = var364.substring(class75.field1078.length());
                                    }
                                }
                                client.field2162.method2308(214);
                                client.field2162.method1612(0);
                                int var369 = client.field2162.field1722;
                                client.field2162.method1612(var366);
                                client.field2162.method1612(var368);
                                class110.method2512(client.field2162, var364);
                                client.field2162.method1599(client.field2162.field1722 - var369);
                            }
                            continue;
                        }
                        if (var382 == 5009) {
                            var5 -= 2;
                            String var370 = field195[var5];
                            String var371 = field195[var5 + 1];
                            client.field2162.method2308(225);
                            client.field2162.method1680(0);
                            int var372 = client.field2162.field1722;
                            client.field2162.method1702(var370);
                            class110.method2512(client.field2162, var371);
                            client.field2162.method1729(client.field2162.field1722 - var372);
                            continue;
                        }
                        if (var382 == 5010) {
                            var4--;
                            int var373 = field191[var4];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = client.field2139[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field195[var5++] = var374;
                            continue;
                        }
                        if (var382 == 5011) {
                            var4--;
                            int var375 = field191[var4];
                            String var376 = null;
                            if (var375 < 100) {
                                var376 = client.field1910[var375];
                            }
                            if (var376 == null) {
                                var376 = "";
                            }
                            field195[var5++] = var376;
                            continue;
                        }
                        if (var382 == 5015) {
                            String var377;
                            if (Statics.field1230 == null || Statics.field1230.field2792 == null) {
                                var377 = "";
                            } else {
                                var377 = Statics.field1230.field2792;
                            }
                            field195[var5++] = var377;
                            continue;
                        }
                        if (var382 == 5016) {
                            field191[var4++] = client.field2145;
                            continue;
                        }
                        if (var382 == 5017) {
                            field191[var4++] = client.field2142;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var381) {
            StringBuilder var379 = new StringBuilder(30);
            var379.append("").append(var3.field1513).append(" ");
            for (int var380 = field196 - 1; var380 >= 0; var380--) {
                var379.append("").append(field199[var380].field122.field1513).append(" ");
            }
            var379.append("").append(var9);
            Statics.method244(var379.toString(), var381);
        }
    }

    @ObfuscatedName("ak.l(II)V")
    public static void method537(int arg0) {
        if (arg0 == -1 || !class141.method1494(arg0)) {
            return;
        }
        class141[] var1 = Statics.field1807[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class141 var3 = var1[var2];
            if (var3.field1843 != null) {
                class123 var4 = new class123();
                var4.field1592 = var3;
                var4.field1590 = var3.field1843;
                method1103(var4);
            }
        }
    }
}
