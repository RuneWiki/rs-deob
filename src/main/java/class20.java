import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class20 extends class138 {

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lck;")
    private static class119 field266 = class298.method1987((byte) 25, "M");

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "[Lck;")
    public static class119[] field271 = new class119[100];

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lck;")
    public static class119 field265 = field266;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lck;")
    public static class119 field278 = field266;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lpi;")
    public static class73 field269 = new class73(64);

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lck;")
    public static class119 field287 = class298.method1987((byte) 68, "Chrome");

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field286 = 0;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "[I")
    public static int[] field288 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Lck;")
    public static class119 field291 = class298.method1987((byte) 14, "unzap");

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "[[B")
    public static byte[][] field290 = new byte[250][];

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "[I")
    private int[] field282;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "[I")
    private int[] field283;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "[Lck;")
    private class119[] field263;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "[[I")
    private int[][] field267;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lml;", line = 7)
    public static final class134 method153(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        field264++;
        if (arg0 != 1) {
            return (class134) null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class135.field2189[var2] == null || class135.field2189[var2][var3] == null) {
            boolean var4 = class247.method1609(30881, var2);
            if (!var4) {
                return null;
            }
        }
        return class135.field2189[var2][var3];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLbb;)V", line = 36)
    public static final void method154(int arg0, boolean arg1, class1 arg2) {
        Object[] var3 = arg2.field14;
        field279++;
        int var4 = (Integer) var3[0];
        class19 var5 = class120.method803(var4, (byte) -101);
        if (var5 == null) {
            return;
        }
        class296.field4934 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field260;
        int[] var10 = var5.field245;
        byte var11 = -1;
        try {
            if (!arg1) {
                int var12 = 0;
                class293.field4880 = new int[var5.field256];
                class110.field1677 = new class119[var5.field258];
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg2.field11;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg2.field10;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg2.field8 == null ? -1 : arg2.field8.field2120;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg2.field20;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg2.field8 == null ? -1 : arg2.field8.field2138;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg2.field6 == null ? -1 : arg2.field6.field2120;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg2.field6 == null ? -1 : arg2.field6.field2138;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg2.field3;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg2.field12;
                        }
                        class293.field4880[var12++] = var15;
                    } else if (var3[var14] instanceof class119) {
                        class119 var16 = (class119) var3[var14];
                        if (var16.method784(class108.field1656, 68)) {
                            var16 = arg2.field1;
                        }
                        class110.field1677[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3659: while (true) {
                    var17++;
                    if (arg0 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var8++;
                    int var446 = var9[var8];
                    if (var446 < 100) {
                        if (var446 == 0) {
                            class206.field3279[var7++] = var10[var8];
                            continue;
                        }
                        if (var446 == 1) {
                            int var18 = var10[var8];
                            class206.field3279[var7++] = class106.field1641[var18];
                            continue;
                        }
                        if (var446 == 2) {
                            int var19 = var10[var8];
                            var7--;
                            class292.method1944(class206.field3279[var7], (byte) -99, var19);
                            continue;
                        }
                        if (var446 == 3) {
                            class184.field2913[var6++] = var5.field252[var8];
                            continue;
                        }
                        if (var446 == 6) {
                            var8 += var10[var8];
                            continue;
                        }
                        if (var446 == 7) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] != class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 8) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] == class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 9) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] > class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 10) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] < class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 21) {
                            if (class296.field4934 == 0) {
                                return;
                            }
                            class31 var20 = class102.field1555[--class296.field4934];
                            class293.field4880 = var20.field439;
                            var8 = var20.field437;
                            var5 = var20.field442;
                            var9 = var5.field260;
                            class110.field1677 = var20.field441;
                            var10 = var5.field245;
                            continue;
                        }
                        if (var446 == 25) {
                            int var21 = var10[var8];
                            class206.field3279[var7++] = class272.method1801((byte) -120, var21);
                            continue;
                        }
                        if (var446 == 27) {
                            int var22 = var10[var8];
                            var7--;
                            class288.method1923(class206.field3279[var7], true, var22);
                            continue;
                        }
                        if (var446 == 31) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] >= class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 32) {
                            var7 -= 2;
                            if (class206.field3279[var7 + 1] <= class206.field3279[var7]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var446 == 33) {
                            class206.field3279[var7++] = class293.field4880[var10[var8]];
                            continue;
                        }
                        int var10001;
                        if (var446 == 34) {
                            var10001 = var10[var8];
                            var7--;
                            class293.field4880[var10001] = class206.field3279[var7];
                            continue;
                        }
                        if (var446 == 35) {
                            class184.field2913[var6++] = class110.field1677[var10[var8]];
                            continue;
                        }
                        if (var446 == 36) {
                            var10001 = var10[var8];
                            var6--;
                            class110.field1677[var10001] = class184.field2913[var6];
                            continue;
                        }
                        if (var446 == 37) {
                            int var23 = var10[var8];
                            var6 -= var23;
                            class119 var24 = class226.method1439(var23, var6, class184.field2913, (byte) 106);
                            class184.field2913[var6++] = var24;
                            continue;
                        }
                        if (var446 == 38) {
                            var7--;
                            continue;
                        }
                        if (var446 == 39) {
                            var6--;
                            continue;
                        }
                        if (var446 == 40) {
                            int var25 = var10[var8];
                            class19 var26 = class120.method803(var25, (byte) -109);
                            class119[] var27 = new class119[var26.field258];
                            int[] var28 = new int[var26.field256];
                            for (int var29 = 0; var29 < var26.field243; var29++) {
                                var28[var29] = class206.field3279[var7 + var29 - var26.field243];
                            }
                            for (int var30 = 0; var30 < var26.field240; var30++) {
                                var27[var30] = class184.field2913[var6 + var30 - var26.field240];
                            }
                            var6 -= var26.field240;
                            var7 -= var26.field243;
                            class31 var31 = new class31();
                            var31.field437 = var8;
                            var31.field442 = var5;
                            var31.field441 = class110.field1677;
                            var31.field439 = class293.field4880;
                            if (class296.field4934 >= class102.field1555.length) {
                                throw new RuntimeException();
                            }
                            var8 = -1;
                            class102.field1555[class296.field4934++] = var31;
                            var5 = var26;
                            class110.field1677 = var27;
                            var10 = var26.field245;
                            var9 = var26.field260;
                            class293.field4880 = var28;
                            continue;
                        }
                        if (var446 == 42) {
                            class206.field3279[var7++] = class179.field2856[var10[var8]];
                            continue;
                        }
                        if (var446 == 43) {
                            int var32 = var10[var8];
                            var7--;
                            class179.field2856[var32] = class206.field3279[var7];
                            class273.method1808(1, var32);
                            continue;
                        }
                        if (var446 == 44) {
                            int var33 = var10[var8] >> 16;
                            var7--;
                            int var34 = class206.field3279[var7];
                            int var35 = var10[var8] & 0xFFFF;
                            if (var34 >= 0 && var34 <= 5000) {
                                class289.field4750[var33] = var34;
                                byte var36 = -1;
                                if (var35 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var34) {
                                        continue label3659;
                                    }
                                    class247.field4005[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var446 == 45) {
                            var7--;
                            int var38 = class206.field3279[var7];
                            int var39 = var10[var8];
                            if (var38 >= 0 && var38 < class289.field4750[var39]) {
                                class206.field3279[var7++] = class247.field4005[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var446 == 46) {
                            var7 -= 2;
                            int var40 = var10[var8];
                            int var41 = class206.field3279[var7];
                            if (var41 >= 0 && var41 < class289.field4750[var40]) {
                                class247.field4005[var40][var41] = class206.field3279[var7 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var446 == 47) {
                            class119 var42 = class221.field3553[var10[var8]];
                            if (var42 == null) {
                                var42 = class232.field3750;
                            }
                            class184.field2913[var6++] = var42;
                            continue;
                        }
                        if (var446 == 48) {
                            int var43 = var10[var8];
                            var6--;
                            class221.field3553[var43] = class184.field2913[var6];
                            class103.method683(2, var43);
                            continue;
                        }
                        if (var446 == 51) {
                            class212 var44 = var5.field261[var10[var8]];
                            var7--;
                            class204 var45 = (class204) var44.method1329((byte) 90, (long) class206.field3279[var7]);
                            if (var45 != null) {
                                var8 += var45.field3230;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var8] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var446 < 300) {
                        if (var446 == 100) {
                            var7 -= 3;
                            int var47 = class206.field3279[var7 + 2];
                            int var48 = class206.field3279[var7];
                            int var49 = class206.field3279[var7 + 1];
                            if (var49 == 0) {
                                throw new RuntimeException();
                            }
                            class134 var50 = method153(1, var48);
                            if (var50.field2061 == null) {
                                var50.field2061 = new class134[var47 + 1];
                            }
                            if (var47 >= var50.field2061.length) {
                                class134[] var51 = new class134[var47 + 1];
                                for (int var52 = 0; var52 < var50.field2061.length; var52++) {
                                    var51[var52] = var50.field2061[var52];
                                }
                                var50.field2061 = var51;
                            }
                            if (var47 > 0 && var50.field2061[var47 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var47 - 1));
                            }
                            class134 var53 = new class134();
                            var53.field2138 = var47;
                            var53.field2135 = var49;
                            var53.field2097 = true;
                            var53.field2024 = var53.field2120 = var50.field2120;
                            var50.field2061[var47] = var53;
                            if (var46) {
                                class252.field4049 = var53;
                            } else {
                                class111.field1699 = var53;
                            }
                            class26.method194(var50, -79);
                            continue;
                        }
                        if (var446 == 101) {
                            class134 var54 = var46 ? class252.field4049 : class111.field1699;
                            if (var54.field2138 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class134 var55 = method153(1, var54.field2120);
                            var55.field2061[var54.field2138] = null;
                            class26.method194(var55, -120);
                            continue;
                        }
                        if (var446 == 102) {
                            var7--;
                            class134 var56 = method153(1, class206.field3279[var7]);
                            var56.field2061 = null;
                            class26.method194(var56, -93);
                            continue;
                        }
                        if (var446 == 200) {
                            var7 -= 2;
                            int var57 = class206.field3279[var7];
                            int var58 = class206.field3279[var7 + 1];
                            class134 var59 = class171.method1083(var57, var58, 127);
                            if (var59 != null && var58 != -1) {
                                class206.field3279[var7++] = 1;
                                if (var46) {
                                    class252.field4049 = var59;
                                } else {
                                    class111.field1699 = var59;
                                }
                                continue;
                            }
                            class206.field3279[var7++] = 0;
                            continue;
                        }
                        if (var446 == 201) {
                            var7--;
                            int var60 = class206.field3279[var7];
                            class134 var61 = method153(1, var60);
                            if (var61 == null) {
                                class206.field3279[var7++] = 0;
                            } else {
                                class206.field3279[var7++] = 1;
                                if (var46) {
                                    class252.field4049 = var61;
                                } else {
                                    class111.field1699 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var446 < 500) {
                        if (var446 == 403) {
                            var7 -= 2;
                            int var435 = class206.field3279[var7 + 1];
                            int var436 = class206.field3279[var7];
                            if (var436 >= 7) {
                                var436 -= 7;
                            }
                            class124.field1917.field4848.method1673(var436, var435, false);
                            continue;
                        }
                        if (var446 == 404) {
                            var7 -= 2;
                            int var437 = class206.field3279[var7];
                            int var438 = class206.field3279[var7 + 1];
                            class124.field1917.field4848.method1669(var438, -754654335, var437);
                            continue;
                        }
                        if (var446 == 410) {
                            var7--;
                            boolean var439 = class206.field3279[var7] != 0;
                            class124.field1917.field4848.method1661(-114, var439);
                            continue;
                        }
                    } else if (var446 >= 1000 && var446 < 1100 || var446 >= 2000 && var446 < 2100) {
                        class134 var429;
                        if (var446 < 2000) {
                            var429 = var46 ? class252.field4049 : class111.field1699;
                        } else {
                            var7--;
                            var429 = method153(1, class206.field3279[var7]);
                            var446 -= 1000;
                        }
                        if (var446 == 1000) {
                            var7 -= 4;
                            var429.field2069 = class206.field3279[var7];
                            var429.field2065 = class206.field3279[var7 + 1];
                            int var430 = class206.field3279[var7 + 3];
                            int var431 = class206.field3279[var7 + 2];
                            if (var430 < 0) {
                                var430 = 0;
                            } else if (var430 > 5) {
                                var430 = 5;
                            }
                            if (var431 < 0) {
                                var431 = 0;
                            } else if (var431 > 5) {
                                var431 = 5;
                            }
                            var429.field2127 = (byte) var430;
                            var429.field2067 = (byte) var431;
                            class26.method194(var429, -118);
                            class238.method1520(var429, true);
                            continue;
                        }
                        if (var446 == 1001) {
                            var7 -= 4;
                            var429.field2141 = class206.field3279[var7];
                            var429.field2089 = class206.field3279[var7 + 1];
                            var429.field2158 = 0;
                            var429.field2070 = 0;
                            int var432 = class206.field3279[var7 + 3];
                            int var433 = class206.field3279[var7 + 2];
                            if (var432 < 0) {
                                var432 = 0;
                            } else if (var432 > 4) {
                                var432 = 4;
                            }
                            if (var433 < 0) {
                                var433 = 0;
                            } else if (var433 > 4) {
                                var433 = 4;
                            }
                            var429.field2079 = (byte) var432;
                            var429.field2163 = (byte) var433;
                            class26.method194(var429, -96);
                            if (var429.field2135 == 0) {
                                class139.method915(var429, 125, false);
                            }
                            class238.method1520(var429, !arg1);
                            continue;
                        }
                        if (var446 == 1003) {
                            var7--;
                            boolean var434 = class206.field3279[var7] == 1;
                            if (var429.field2160 != var434) {
                                var429.field2160 = var434;
                                class26.method194(var429, -119);
                            }
                            continue;
                        }
                        if (var446 == 1004) {
                            var7 -= 2;
                            var429.field2154 = class206.field3279[var7];
                            var429.field2056 = class206.field3279[var7 + 1];
                            class26.method194(var429, -104);
                            if (var429.field2135 == 0) {
                                class139.method915(var429, 124, false);
                            }
                            class238.method1520(var429, true);
                            continue;
                        }
                    } else if (!(var446 < 1100 || var446 >= 1200) || !(var446 < 2100 || var446 >= 2200)) {
                        class134 var426;
                        if (var446 < 2000) {
                            var426 = var46 ? class252.field4049 : class111.field1699;
                        } else {
                            var7--;
                            var426 = method153(1, class206.field3279[var7]);
                            var446 -= 1000;
                        }
                        if (var446 == 1100) {
                            var7 -= 2;
                            var426.field2173 = class206.field3279[var7];
                            if (var426.field2173 > var426.field2175 - var426.field2180) {
                                var426.field2173 = var426.field2175 - var426.field2180;
                            }
                            if (var426.field2173 < 0) {
                                var426.field2173 = 0;
                            }
                            var426.field2169 = class206.field3279[var7 + 1];
                            if ((var426.field2095 - var426.field2057) < var426.field2169) {
                                var426.field2169 = var426.field2095 - var426.field2057;
                            }
                            if (var426.field2169 < 0) {
                                var426.field2169 = 0;
                            }
                            class26.method194(var426, -62);
                            continue;
                        }
                        if (var446 == 1101) {
                            var7--;
                            var426.field2044 = class206.field3279[var7];
                            class26.method194(var426, -95);
                            continue;
                        }
                        if (var446 == 1102) {
                            var7--;
                            var426.field2182 = class206.field3279[var7] == 1;
                            class26.method194(var426, -105);
                            continue;
                        }
                        if (var446 == 1103) {
                            var7--;
                            var426.field2139 = class206.field3279[var7];
                            class26.method194(var426, -67);
                            continue;
                        }
                        if (var446 == 1104) {
                            var7--;
                            var426.field2081 = class206.field3279[var7];
                            class26.method194(var426, -100);
                            continue;
                        }
                        if (var446 == 1105) {
                            var7--;
                            var426.field2073 = class206.field3279[var7];
                            class26.method194(var426, -62);
                            continue;
                        }
                        if (var446 == 1106) {
                            var7--;
                            var426.field2172 = class206.field3279[var7];
                            class26.method194(var426, -83);
                            continue;
                        }
                        if (var446 == 1107) {
                            var7--;
                            var426.field2112 = class206.field3279[var7] == 1;
                            class26.method194(var426, -80);
                            continue;
                        }
                        if (var446 == 1108) {
                            var426.field2126 = 1;
                            var7--;
                            var426.field2171 = class206.field3279[var7];
                            class26.method194(var426, -66);
                            continue;
                        }
                        if (var446 == 1109) {
                            var7 -= 6;
                            var426.field2090 = class206.field3279[var7];
                            var426.field2084 = class206.field3279[var7 + 1];
                            var426.field2170 = class206.field3279[var7 + 2];
                            var426.field2123 = class206.field3279[var7 + 3];
                            var426.field2026 = class206.field3279[var7 + 4];
                            var426.field2096 = class206.field3279[var7 + 5];
                            class26.method194(var426, -114);
                            continue;
                        }
                        if (var446 == 1110) {
                            var7--;
                            int var427 = class206.field3279[var7];
                            if (var426.field2113 != var427) {
                                var426.field2131 = 0;
                                var426.field2113 = var427;
                                var426.field2178 = 0;
                                class26.method194(var426, -73);
                            }
                            continue;
                        }
                        if (var446 == 1111) {
                            var7--;
                            var426.field2087 = class206.field3279[var7] == 1;
                            class26.method194(var426, -85);
                            continue;
                        }
                        if (var446 == 1112) {
                            var6--;
                            class119 var428 = class184.field2913[var6];
                            if (!var428.method784(var426.field2019, 43)) {
                                var426.field2019 = var428;
                                class26.method194(var426, -62);
                            }
                            continue;
                        }
                        if (var446 == 1113) {
                            var7--;
                            var426.field2071 = class206.field3279[var7];
                            class26.method194(var426, -93);
                            continue;
                        }
                        if (var446 == 1114) {
                            var7 -= 3;
                            var426.field2050 = class206.field3279[var7];
                            var426.field2078 = class206.field3279[var7 + 1];
                            var426.field2133 = class206.field3279[var7 + 2];
                            class26.method194(var426, -97);
                            continue;
                        }
                        if (var446 == 1115) {
                            var7--;
                            var426.field2181 = class206.field3279[var7] == 1;
                            class26.method194(var426, -96);
                            continue;
                        }
                        if (var446 == 1116) {
                            var7--;
                            var426.field2110 = class206.field3279[var7];
                            class26.method194(var426, -65);
                            continue;
                        }
                        if (var446 == 1117) {
                            var7--;
                            var426.field2146 = class206.field3279[var7];
                            class26.method194(var426, -69);
                            continue;
                        }
                        if (var446 == 1118) {
                            var7--;
                            var426.field2037 = class206.field3279[var7] == 1;
                            class26.method194(var426, -76);
                            continue;
                        }
                        if (var446 == 1119) {
                            var7--;
                            var426.field2051 = class206.field3279[var7] == 1;
                            class26.method194(var426, -100);
                            continue;
                        }
                        if (var446 == 1120) {
                            var7 -= 2;
                            var426.field2175 = class206.field3279[var7];
                            var426.field2095 = class206.field3279[var7 + 1];
                            class26.method194(var426, -97);
                            if (var426.field2135 == 0) {
                                class139.method915(var426, 122, false);
                            }
                            continue;
                        }
                        if (var446 == 1121) {
                            var7 -= 2;
                            var426.field2165 = (short) class206.field3279[var7];
                            var426.field2136 = (short) class206.field3279[var7 + 1];
                            class26.method194(var426, -123);
                            continue;
                        }
                        if (var446 == 1122) {
                            var7--;
                            var426.field2159 = class206.field3279[var7] == 1;
                            class26.method194(var426, -75);
                            continue;
                        }
                    } else if (!(var446 < 1200 || var446 >= 1300) || !(var446 < 2200 || var446 >= 2300)) {
                        class134 var62;
                        if (var446 >= 2000) {
                            var7--;
                            var62 = method153(1, class206.field3279[var7]);
                            var446 -= 1000;
                        } else {
                            var62 = var46 ? class252.field4049 : class111.field1699;
                        }
                        class26.method194(var62, -127);
                        if (var446 == 1200 || var446 == 1205) {
                            var7 -= 2;
                            int var63 = class206.field3279[var7];
                            int var64 = class206.field3279[var7 + 1];
                            if (var63 == -1) {
                                var62.field2171 = -1;
                                var62.field2126 = 1;
                                var62.field2049 = -1;
                            } else {
                                var62.field2049 = var63;
                                var62.field2072 = var64;
                                class262 var65 = class205.method1296((byte) -127, var63);
                                var62.field2090 = var65.field4235;
                                var62.field2096 = var65.field4240;
                                var62.field2084 = var65.field4254;
                                var62.field2026 = var65.field4208;
                                if (var62.field2070 > 0) {
                                    var62.field2096 = var62.field2096 * 32 / var62.field2070;
                                } else if (var62.field2141 > 0) {
                                    var62.field2096 = var62.field2096 * 32 / var62.field2141;
                                }
                                var62.field2170 = var65.field4268;
                                if (var446 == 1205) {
                                    var62.field2157 = false;
                                } else {
                                    var62.field2157 = true;
                                }
                                var62.field2123 = var65.field4218;
                            }
                            continue;
                        }
                        if (var446 == 1201) {
                            var62.field2126 = 2;
                            var7--;
                            var62.field2171 = class206.field3279[var7];
                            continue;
                        }
                        if (var446 == 1202) {
                            var62.field2126 = 3;
                            var62.field2171 = class124.field1917.field4848.method1664(109);
                            continue;
                        }
                        if (var446 == 1203) {
                            var62.field2126 = 6;
                            var7--;
                            var62.field2171 = class206.field3279[var7];
                            continue;
                        }
                        if (var446 == 1204) {
                            var62.field2126 = 5;
                            var7--;
                            var62.field2171 = class206.field3279[var7];
                            continue;
                        }
                    } else if ((var446 < 1300 || var446 >= 1400) && (var446 < 2300 || var446 >= 2400)) {
                        if (var446 >= 1400 && var446 < 1500 || var446 >= 2400 && var446 < 2500) {
                            class134 var66;
                            if (var446 < 2000) {
                                var66 = var46 ? class252.field4049 : class111.field1699;
                            } else {
                                var446 -= 1000;
                                var7--;
                                var66 = method153(1, class206.field3279[var7]);
                            }
                            int[] var67 = null;
                            var6--;
                            class119 var68 = class184.field2913[var6];
                            if (var68.method776((byte) -70) > 0 && var68.method755((byte) -62, var68.method776((byte) -63) - 1) == 89) {
                                var7--;
                                int var69 = class206.field3279[var7];
                                if (var69 > 0) {
                                    var67 = new int[var69];
                                    while (var69-- > 0) {
                                        var7--;
                                        var67[var69] = class206.field3279[var7];
                                    }
                                }
                                var68 = var68.method762(var68.method776((byte) -92) - 1, 0, 0);
                            }
                            Object[] var70 = new Object[var68.method776((byte) -85) + 1];
                            for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                                if (var68.method755((byte) -83, var71 - 1) == 115) {
                                    var6--;
                                    var70[var71] = class184.field2913[var6];
                                } else {
                                    var7--;
                                    var70[var71] = Integer.valueOf(class206.field3279[var7]);
                                }
                            }
                            var7--;
                            int var72 = class206.field3279[var7];
                            if (var72 == -1) {
                                var70 = null;
                            } else {
                                var70[0] = Integer.valueOf(var72);
                            }
                            if (var446 == 1400) {
                                var66.field2116 = var70;
                            } else if (var446 == 1401) {
                                var66.field2167 = var70;
                            } else if (var446 == 1402) {
                                var66.field2060 = var70;
                            } else if (var446 == 1403) {
                                var66.field2101 = var70;
                            } else if (var446 == 1404) {
                                var66.field2062 = var70;
                            } else if (var446 == 1405) {
                                var66.field2140 = var70;
                            } else if (var446 == 1406) {
                                var66.field2144 = var70;
                            } else if (var446 == 1407) {
                                var66.field2174 = var67;
                                var66.field2058 = var70;
                            } else if (var446 == 1408) {
                                var66.field2108 = var70;
                            } else if (var446 == 1409) {
                                var66.field2048 = var70;
                            } else if (var446 == 1410) {
                                var66.field2111 = var70;
                            } else if (var446 == 1411) {
                                var66.field2124 = var70;
                            } else if (var446 == 1412) {
                                var66.field2142 = var70;
                            } else if (var446 == 1414) {
                                var66.field2115 = var67;
                                var66.field2077 = var70;
                            } else if (var446 == 1415) {
                                var66.field2082 = var70;
                                var66.field2094 = var67;
                            } else if (var446 == 1416) {
                                var66.field2025 = var70;
                            } else if (var446 == 1417) {
                                var66.field2121 = var70;
                            } else if (var446 == 1418) {
                                var66.field2080 = var70;
                            } else if (var446 == 1419) {
                                var66.field2088 = var70;
                            } else if (var446 == 1420) {
                                var66.field2129 = var70;
                            } else if (var446 == 1421) {
                                var66.field2098 = var70;
                            } else if (var446 == 1422) {
                                var66.field2076 = var70;
                            } else if (var446 == 1423) {
                                var66.field2055 = var70;
                            } else if (var446 == 1424) {
                                var66.field2184 = var70;
                            } else if (var446 == 1425) {
                                var66.field2092 = var70;
                            } else if (var446 == 1426) {
                                var66.field2183 = var70;
                            } else if (var446 == 1427) {
                                var66.field2130 = var70;
                            } else if (var446 == 1428) {
                                var66.field2045 = var67;
                                var66.field2118 = var70;
                            } else if (var446 == 1429) {
                                var66.field2148 = var70;
                                var66.field2150 = var67;
                            }
                            var66.field2030 = true;
                            continue;
                        }
                        if (var446 < 1600) {
                            class134 var73 = var46 ? class252.field4049 : class111.field1699;
                            if (var446 == 1500) {
                                class206.field3279[var7++] = var73.field2021;
                                continue;
                            }
                            if (var446 == 1501) {
                                class206.field3279[var7++] = var73.field2100;
                                continue;
                            }
                            if (var446 == 1502) {
                                class206.field3279[var7++] = var73.field2180;
                                continue;
                            }
                            if (var446 == 1503) {
                                class206.field3279[var7++] = var73.field2057;
                                continue;
                            }
                            if (var446 == 1504) {
                                class206.field3279[var7++] = var73.field2160 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 1505) {
                                class206.field3279[var7++] = var73.field2024;
                                continue;
                            }
                        } else if (var446 < 1700) {
                            class134 var74 = var46 ? class252.field4049 : class111.field1699;
                            if (var446 == 1600) {
                                class206.field3279[var7++] = var74.field2173;
                                continue;
                            }
                            if (var446 == 1601) {
                                class206.field3279[var7++] = var74.field2169;
                                continue;
                            }
                            if (var446 == 1602) {
                                class184.field2913[var6++] = var74.field2019;
                                continue;
                            }
                            if (var446 == 1603) {
                                class206.field3279[var7++] = var74.field2175;
                                continue;
                            }
                            if (var446 == 1604) {
                                class206.field3279[var7++] = var74.field2095;
                                continue;
                            }
                            if (var446 == 1605) {
                                class206.field3279[var7++] = var74.field2096;
                                continue;
                            }
                            if (var446 == 1606) {
                                class206.field3279[var7++] = var74.field2170;
                                continue;
                            }
                            if (var446 == 1607) {
                                class206.field3279[var7++] = var74.field2026;
                                continue;
                            }
                            if (var446 == 1608) {
                                class206.field3279[var7++] = var74.field2123;
                                continue;
                            }
                            if (var446 == 1609) {
                                class206.field3279[var7++] = var74.field2139;
                                continue;
                            }
                        } else if (var446 < 1800) {
                            class134 var421 = var46 ? class252.field4049 : class111.field1699;
                            if (var446 == 1700) {
                                class206.field3279[var7++] = var421.field2049;
                                continue;
                            }
                            if (var446 == 1701) {
                                if (var421.field2049 == -1) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = var421.field2072;
                                }
                                continue;
                            }
                            if (var446 == 1702) {
                                class206.field3279[var7++] = var421.field2138;
                                continue;
                            }
                        } else if (var446 < 1900) {
                            class134 var75 = var46 ? class252.field4049 : class111.field1699;
                            if (var446 == 1800) {
                                class206.field3279[var7++] = class98.method661(0, client.method620(var75));
                                continue;
                            }
                            if (var446 == 1801) {
                                var7--;
                                int var76 = class206.field3279[var7];
                                int var447 = var76 - 1;
                                if (var75.field2103 != null && var75.field2103.length > var447 && var75.field2103[var447] != null) {
                                    class184.field2913[var6++] = var75.field2103[var447];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 1802) {
                                if (var75.field2137 == null) {
                                    class184.field2913[var6++] = class208.field3310;
                                } else {
                                    class184.field2913[var6++] = var75.field2137;
                                }
                                continue;
                            }
                        } else if (var446 < 2600) {
                            var7--;
                            class134 var77 = method153(1, class206.field3279[var7]);
                            if (var446 == 2500) {
                                class206.field3279[var7++] = var77.field2021;
                                continue;
                            }
                            if (var446 == 2501) {
                                class206.field3279[var7++] = var77.field2100;
                                continue;
                            }
                            if (var446 == 2502) {
                                class206.field3279[var7++] = var77.field2180;
                                continue;
                            }
                            if (var446 == 2503) {
                                class206.field3279[var7++] = var77.field2057;
                                continue;
                            }
                            if (var446 == 2504) {
                                class206.field3279[var7++] = var77.field2160 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 2505) {
                                class206.field3279[var7++] = var77.field2024;
                                continue;
                            }
                        } else if (var446 < 2700) {
                            var7--;
                            class134 var78 = method153(1, class206.field3279[var7]);
                            if (var446 == 2600) {
                                class206.field3279[var7++] = var78.field2173;
                                continue;
                            }
                            if (var446 == 2601) {
                                class206.field3279[var7++] = var78.field2169;
                                continue;
                            }
                            if (var446 == 2602) {
                                class184.field2913[var6++] = var78.field2019;
                                continue;
                            }
                            if (var446 == 2603) {
                                class206.field3279[var7++] = var78.field2175;
                                continue;
                            }
                            if (var446 == 2604) {
                                class206.field3279[var7++] = var78.field2095;
                                continue;
                            }
                            if (var446 == 2605) {
                                class206.field3279[var7++] = var78.field2096;
                                continue;
                            }
                            if (var446 == 2606) {
                                class206.field3279[var7++] = var78.field2170;
                                continue;
                            }
                            if (var446 == 2607) {
                                class206.field3279[var7++] = var78.field2026;
                                continue;
                            }
                            if (var446 == 2608) {
                                class206.field3279[var7++] = var78.field2123;
                                continue;
                            }
                            if (var446 == 2609) {
                                class206.field3279[var7++] = var78.field2139;
                                continue;
                            }
                        } else if (var446 < 2800) {
                            if (var446 == 2700) {
                                var7--;
                                class134 var79 = method153(1, class206.field3279[var7]);
                                class206.field3279[var7++] = var79.field2049;
                                continue;
                            }
                            if (var446 == 2701) {
                                var7--;
                                class134 var80 = method153(1, class206.field3279[var7]);
                                if (var80.field2049 == -1) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = var80.field2072;
                                }
                                continue;
                            }
                            if (var446 == 2702) {
                                var7--;
                                int var81 = class206.field3279[var7];
                                class288 var82 = (class288) class206.field3268.method1329((byte) 90, (long) var81);
                                if (var82 == null) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = 1;
                                }
                                continue;
                            }
                            if (var446 == 2703) {
                                var7--;
                                class134 var83 = method153(1, class206.field3279[var7]);
                                if (var83.field2061 == null) {
                                    class206.field3279[var7++] = 0;
                                    continue;
                                }
                                int var84 = var83.field2061.length;
                                for (int var85 = 0; var85 < var83.field2061.length; var85++) {
                                    if (var83.field2061[var85] == null) {
                                        var84 = var85;
                                        break;
                                    }
                                }
                                class206.field3279[var7++] = var84;
                                continue;
                            }
                            if (var446 == 2704 || var446 == 2705) {
                                var7 -= 2;
                                int var86 = class206.field3279[var7];
                                int var87 = class206.field3279[var7 + 1];
                                class288 var88 = (class288) class206.field3268.method1329((byte) 90, (long) var86);
                                if (var88 != null && var88.field4739 == var87) {
                                    class206.field3279[var7++] = 1;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                        } else if (var446 < 2900) {
                            var7--;
                            class134 var419 = method153(1, class206.field3279[var7]);
                            if (var446 == 2800) {
                                class206.field3279[var7++] = class98.method661(0, client.method620(var419));
                                continue;
                            }
                            if (var446 == 2801) {
                                var7--;
                                int var420 = class206.field3279[var7];
                                int var448 = var420 - 1;
                                if (var419.field2103 != null && var419.field2103.length > var448 && var419.field2103[var448] != null) {
                                    class184.field2913[var6++] = var419.field2103[var448];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 2802) {
                                if (var419.field2137 == null) {
                                    class184.field2913[var6++] = class208.field3310;
                                } else {
                                    class184.field2913[var6++] = var419.field2137;
                                }
                                continue;
                            }
                        } else if (var446 < 3200) {
                            if (var446 == 3100) {
                                var6--;
                                class119 var89 = class184.field2913[var6];
                                class54.method401((byte) -121, var89, 0, class208.field3310);
                                continue;
                            }
                            if (var446 == 3101) {
                                var7 -= 2;
                                class163.method1037(class124.field1917, 0, class206.field3279[var7 + 1], class206.field3279[var7]);
                                continue;
                            }
                            if (var446 == 3103) {
                                class71.method508(59);
                                continue;
                            }
                            if (var446 == 3104) {
                                class103.field1566++;
                                var6--;
                                class119 var90 = class184.field2913[var6];
                                int var91 = 0;
                                if (var90.method796((byte) 95)) {
                                    var91 = var90.method783((byte) 65);
                                }
                                class6.field149.method966(0, 162);
                                class6.field149.method26(var91, 124);
                                continue;
                            }
                            if (var446 == 3105) {
                                class92.field1420++;
                                var6--;
                                class119 var92 = class184.field2913[var6];
                                class6.field149.method966(0, 229);
                                class6.field149.method29(2069, var92.method786((byte) 112));
                                continue;
                            }
                            if (var446 == 3106) {
                                class6.field145++;
                                var6--;
                                class119 var93 = class184.field2913[var6];
                                class6.field149.method966(0, 86);
                                class6.field149.method32(var93.method776((byte) -29) + 1, (byte) -99);
                                class6.field149.method61(arg1, var93);
                                continue;
                            }
                            if (var446 == 3107) {
                                var7--;
                                int var94 = class206.field3279[var7];
                                var6--;
                                class119 var95 = class184.field2913[var6];
                                class206.method1298(var94, (byte) 56, var95);
                                continue;
                            }
                            if (var446 == 3108) {
                                var7 -= 3;
                                int var96 = class206.field3279[var7];
                                int var97 = class206.field3279[var7 + 1];
                                int var98 = class206.field3279[var7 + 2];
                                class134 var99 = method153(1, var98);
                                class82.method560(var97, var96, var99, 2);
                                continue;
                            }
                            if (var446 == 3109) {
                                var7 -= 2;
                                int var100 = class206.field3279[var7 + 1];
                                class134 var101 = var46 ? class252.field4049 : class111.field1699;
                                int var102 = class206.field3279[var7];
                                class82.method560(var100, var102, var101, 2);
                                continue;
                            }
                            if (var446 == 3110) {
                                class142.field2268++;
                                var7--;
                                int var103 = class206.field3279[var7];
                                class6.field149.method966(0, 123);
                                class6.field149.method40(var103, -101);
                                continue;
                            }
                        } else if (var446 < 3300) {
                            if (var446 == 3200) {
                                var7 -= 3;
                                class158.method1008(class206.field3279[var7], class206.field3279[var7 + 2], -51, class206.field3279[var7 + 1]);
                                continue;
                            }
                            if (var446 == 3201) {
                                var7--;
                                class181.method1154(class206.field3279[var7], 0);
                                continue;
                            }
                            if (var446 == 3202) {
                                var7 -= 2;
                                class35.method255(class206.field3279[var7 + 1], class206.field3279[var7], 2);
                                continue;
                            }
                        } else if (var446 < 3400) {
                            if (var446 == 3300) {
                                class206.field3279[var7++] = class1.field15;
                                continue;
                            }
                            if (var446 == 3301) {
                                var7 -= 2;
                                int var397 = class206.field3279[var7];
                                int var398 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class273.method1804(-27237, var397, var398);
                                continue;
                            }
                            if (var446 == 3302) {
                                var7 -= 2;
                                int var399 = class206.field3279[var7];
                                int var400 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class168.method1065((byte) -78, var400, var399);
                                continue;
                            }
                            if (var446 == 3303) {
                                var7 -= 2;
                                int var401 = class206.field3279[var7 + 1];
                                int var402 = class206.field3279[var7];
                                class206.field3279[var7++] = class166.method1052(var401, var402, 0);
                                continue;
                            }
                            if (var446 == 3304) {
                                var7--;
                                int var403 = class206.field3279[var7];
                                class206.field3279[var7++] = class50.method379(5, var403).field653;
                                continue;
                            }
                            if (var446 == 3305) {
                                var7--;
                                int var404 = class206.field3279[var7];
                                class206.field3279[var7++] = class119.field1818[var404];
                                continue;
                            }
                            if (var446 == 3306) {
                                var7--;
                                int var405 = class206.field3279[var7];
                                class206.field3279[var7++] = class220.field3526[var405];
                                continue;
                            }
                            if (var446 == 3307) {
                                var7--;
                                int var406 = class206.field3279[var7];
                                class206.field3279[var7++] = class212.field3384[var406];
                                continue;
                            }
                            if (var446 == 3308) {
                                int var407 = class10.field189;
                                int var408 = (class124.field1917.field4949 >> 7) + class30.field421;
                                int var409 = (class124.field1917.field4991 >> 7) + class189.field2995;
                                class206.field3279[var7++] = (var407 << 28) + (var408 << 14) + var409;
                                continue;
                            }
                            if (var446 == 3309) {
                                var7--;
                                int var410 = class206.field3279[var7];
                                class206.field3279[var7++] = class19.method151(16383, var410 >> 14);
                                continue;
                            }
                            if (var446 == 3310) {
                                var7--;
                                int var411 = class206.field3279[var7];
                                class206.field3279[var7++] = var411 >> 28;
                                continue;
                            }
                            if (var446 == 3311) {
                                var7--;
                                int var412 = class206.field3279[var7];
                                class206.field3279[var7++] = class19.method151(var412, 16383);
                                continue;
                            }
                            if (var446 == 3312) {
                                class206.field3279[var7++] = class232.field3744 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3313) {
                                var7 -= 2;
                                int var413 = class206.field3279[var7] + 32768;
                                int var414 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class273.method1804(-27237, var413, var414);
                                continue;
                            }
                            if (var446 == 3314) {
                                var7 -= 2;
                                int var415 = class206.field3279[var7] + 32768;
                                int var416 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class168.method1065((byte) -78, var416, var415);
                                continue;
                            }
                            if (var446 == 3315) {
                                var7 -= 2;
                                int var417 = class206.field3279[var7 + 1];
                                int var418 = class206.field3279[var7] + 32768;
                                class206.field3279[var7++] = class166.method1052(var417, var418, 0);
                                continue;
                            }
                            if (var446 == 3316) {
                                if (class19.field248 >= 2) {
                                    class206.field3279[var7++] = class19.field248;
                                } else {
                                    class206.field3279[var7++] = 0;
                                }
                                continue;
                            }
                            if (var446 == 3317) {
                                class206.field3279[var7++] = class54.field865;
                                continue;
                            }
                            if (var446 == 3318) {
                                class206.field3279[var7++] = class243.field3919;
                                continue;
                            }
                            if (var446 == 3321) {
                                class206.field3279[var7++] = class287.field4731;
                                continue;
                            }
                            if (var446 == 3322) {
                                class206.field3279[var7++] = class88.field1343;
                                continue;
                            }
                            if (var446 == 3323) {
                                if (class11.field194 >= 5 && class11.field194 <= 9) {
                                    class206.field3279[var7++] = 1;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3324) {
                                if (class11.field194 >= 5 && class11.field194 <= 9) {
                                    class206.field3279[var7++] = class11.field194;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3325) {
                                if (class140.field2254 <= 0) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = 1;
                                }
                                continue;
                            }
                            if (var446 == 3326) {
                                class206.field3279[var7++] = class124.field1917.field4858;
                                continue;
                            }
                            if (var446 == 3327) {
                                class206.field3279[var7++] = class124.field1917.field4848.field4156 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3328) {
                                class206.field3279[var7++] = class261.field4180;
                                continue;
                            }
                            if (var446 == 3329) {
                                class206.field3279[var7++] = class245.field3972;
                                continue;
                            }
                        } else if (var446 < 3500) {
                            if (var446 == 3400) {
                                var7 -= 2;
                                int var389 = class206.field3279[var7];
                                int var390 = class206.field3279[var7 + 1];
                                class295 var391 = class124.method826((byte) -101, var389);
                                if (var391.field4908 != 115) {
                                }
                                class184.field2913[var6++] = var391.method1964(-116, var390);
                                continue;
                            }
                            if (var446 == 3408) {
                                var7 -= 4;
                                int var392 = class206.field3279[var7];
                                int var393 = class206.field3279[var7 + 2];
                                int var394 = class206.field3279[var7 + 3];
                                int var395 = class206.field3279[var7 + 1];
                                class295 var396 = class124.method826((byte) -46, var393);
                                if (var396.field4898 == var392 && var396.field4908 == var395) {
                                    if (var395 == 115) {
                                        class184.field2913[var6++] = var396.method1964(-93, var394);
                                    } else {
                                        class206.field3279[var7++] = var396.method1971(0, var394);
                                    }
                                    continue;
                                }
                                if (var395 == 115) {
                                    class184.field2913[var6++] = class232.field3750;
                                } else {
                                    class206.field3279[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var446 < 3700) {
                            if (var446 == 3600) {
                                if (class152.field2427 == 0) {
                                    class206.field3279[var7++] = -2;
                                } else if (class152.field2427 == 1) {
                                    class206.field3279[var7++] = -1;
                                } else {
                                    class206.field3279[var7++] = class97.field1482;
                                }
                                continue;
                            }
                            if (var446 == 3601) {
                                var7--;
                                int var104 = class206.field3279[var7];
                                if (class152.field2427 == 2 && class97.field1482 > var104) {
                                    class184.field2913[var6++] = class126.field1941[var104];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 3602) {
                                var7--;
                                int var105 = class206.field3279[var7];
                                if (class152.field2427 == 2 && var105 < class97.field1482) {
                                    class206.field3279[var7++] = class283.field4680[var105];
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3603) {
                                var7--;
                                int var106 = class206.field3279[var7];
                                if (class152.field2427 == 2 && class97.field1482 > var106) {
                                    class206.field3279[var7++] = class168.field2647[var106];
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3604) {
                                var6--;
                                class119 var107 = class184.field2913[var6];
                                var7--;
                                int var108 = class206.field3279[var7];
                                class210.method1318(234, var108, var107);
                                continue;
                            }
                            if (var446 == 3605) {
                                var6--;
                                class119 var109 = class184.field2913[var6];
                                class227.method1441((byte) -122, var109.method786((byte) 112));
                                continue;
                            }
                            if (var446 == 3606) {
                                var6--;
                                class119 var110 = class184.field2913[var6];
                                class9.method98(var110.method786((byte) 112), false);
                                continue;
                            }
                            if (var446 == 3607) {
                                var6--;
                                class119 var111 = class184.field2913[var6];
                                class129.method859(1, var111.method786((byte) 112));
                                continue;
                            }
                            if (var446 == 3608) {
                                var6--;
                                class119 var112 = class184.field2913[var6];
                                class179.method1145((byte) 74, var112.method786((byte) 112));
                                continue;
                            }
                            if (var446 == 3609) {
                                var6--;
                                class119 var113 = class184.field2913[var6];
                                if (var113.method761(0, class90.field1375) || var113.method761(0, class208.field3313)) {
                                    var113 = var113.method769(-106, 7);
                                }
                                class206.field3279[var7++] = class61.method451(var113, false) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3610) {
                                var7--;
                                int var114 = class206.field3279[var7];
                                if (class152.field2427 == 2 && class97.field1482 > var114) {
                                    class184.field2913[var6++] = class64.field1016[var114];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 3611) {
                                if (class204.field3234 == null) {
                                    class184.field2913[var6++] = class208.field3310;
                                } else {
                                    class184.field2913[var6++] = class204.field3234.method785(117);
                                }
                                continue;
                            }
                            if (var446 == 3612) {
                                if (class204.field3234 == null) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = class151.field2398;
                                }
                                continue;
                            }
                            if (var446 == 3613) {
                                var7--;
                                int var115 = class206.field3279[var7];
                                if (class204.field3234 != null && var115 < class151.field2398) {
                                    class184.field2913[var6++] = class13.field211[var115].field3761.method785(98);
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 3614) {
                                var7--;
                                int var116 = class206.field3279[var7];
                                if (class204.field3234 != null && class151.field2398 > var116) {
                                    class206.field3279[var7++] = class13.field211[var116].field3758;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3615) {
                                var7--;
                                int var117 = class206.field3279[var7];
                                if (class204.field3234 != null && class151.field2398 > var117) {
                                    class206.field3279[var7++] = class13.field211[var117].field3766;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3616) {
                                class206.field3279[var7++] = class298.field5028;
                                continue;
                            }
                            if (var446 == 3617) {
                                var6--;
                                class119 var118 = class184.field2913[var6];
                                class259.method1654(var118, 11746);
                                continue;
                            }
                            if (var446 == 3618) {
                                class206.field3279[var7++] = class224.field3603;
                                continue;
                            }
                            if (var446 == 3619) {
                                var6--;
                                class119 var119 = class184.field2913[var6];
                                class261.method1680(var119.method786((byte) 112), (byte) 82);
                                continue;
                            }
                            if (var446 == 3620) {
                                class184.method1172(-1);
                                continue;
                            }
                            if (var446 == 3621) {
                                if (class152.field2427 == 0) {
                                    class206.field3279[var7++] = -1;
                                } else {
                                    class206.field3279[var7++] = class151.field2399;
                                }
                                continue;
                            }
                            if (var446 == 3622) {
                                var7--;
                                int var120 = class206.field3279[var7];
                                if (class152.field2427 != 0 && class151.field2399 > var120) {
                                    class184.field2913[var6++] = class147.method963((byte) 0, class96.field1476[var120]).method785(127);
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 3623) {
                                var6--;
                                class119 var121 = class184.field2913[var6];
                                if (var121.method761(0, class90.field1375) || var121.method761(0, class208.field3313)) {
                                    var121 = var121.method769(-63, 7);
                                }
                                class206.field3279[var7++] = class230.method1489(var121, (byte) -67) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3624) {
                                var7--;
                                int var122 = class206.field3279[var7];
                                if (class13.field211 != null && var122 < class151.field2398 && class13.field211[var122].field3761.method793(class124.field1917.field4861, 40)) {
                                    class206.field3279[var7++] = 1;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3625) {
                                if (class221.field3544 == null) {
                                    class184.field2913[var6++] = class208.field3310;
                                } else {
                                    class184.field2913[var6++] = class221.field3544.method785(78);
                                }
                                continue;
                            }
                            if (var446 == 3626) {
                                var7--;
                                int var123 = class206.field3279[var7];
                                if (class204.field3234 != null && class151.field2398 > var123) {
                                    class184.field2913[var6++] = class13.field211[var123].field3759;
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 3627) {
                                var7--;
                                int var124 = class206.field3279[var7];
                                if (class152.field2427 == 2 && var124 >= 0 && class97.field1482 > var124) {
                                    class206.field3279[var7++] = class266.field4365[var124] ? 1 : 0;
                                    continue;
                                }
                                class206.field3279[var7++] = 0;
                                continue;
                            }
                            if (var446 == 3628) {
                                var6--;
                                class119 var125 = class184.field2913[var6];
                                if (var125.method761(0, class90.field1375) || var125.method761(0, class208.field3313)) {
                                    var125 = var125.method769(-107, 7);
                                }
                                class206.field3279[var7++] = class298.method1988(9612, var125);
                                continue;
                            }
                        } else if (var446 < 4000) {
                            if (var446 == 3903) {
                                var7--;
                                int var375 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var375].method372(18750);
                                continue;
                            }
                            if (var446 == 3904) {
                                var7--;
                                int var376 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var376].field763;
                                continue;
                            }
                            if (var446 == 3905) {
                                var7--;
                                int var377 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var377].field745;
                                continue;
                            }
                            if (var446 == 3906) {
                                var7--;
                                int var378 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var378].field746;
                                continue;
                            }
                            if (var446 == 3907) {
                                var7--;
                                int var379 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var379].field758;
                                continue;
                            }
                            if (var446 == 3908) {
                                var7--;
                                int var380 = class206.field3279[var7];
                                class206.field3279[var7++] = class258.field4136[var380].field750;
                                continue;
                            }
                            if (var446 == 3910) {
                                var7--;
                                int var381 = class206.field3279[var7];
                                int var382 = class258.field4136[var381].method368(-8149);
                                class206.field3279[var7++] = var382 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3911) {
                                var7--;
                                int var383 = class206.field3279[var7];
                                int var384 = class258.field4136[var383].method368(-8149);
                                class206.field3279[var7++] = var384 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3912) {
                                var7--;
                                int var385 = class206.field3279[var7];
                                int var386 = class258.field4136[var385].method368(-8149);
                                class206.field3279[var7++] = var386 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 3913) {
                                var7--;
                                int var387 = class206.field3279[var7];
                                int var388 = class258.field4136[var387].method368(-8149);
                                class206.field3279[var7++] = var388 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var446 < 4100) {
                            if (var446 == 4000) {
                                var7 -= 2;
                                int var330 = class206.field3279[var7];
                                int var331 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = var330 + var331;
                                continue;
                            }
                            if (var446 == 4001) {
                                var7 -= 2;
                                int var332 = class206.field3279[var7 + 1];
                                int var333 = class206.field3279[var7];
                                class206.field3279[var7++] = var333 - var332;
                                continue;
                            }
                            if (var446 == 4002) {
                                var7 -= 2;
                                int var334 = class206.field3279[var7 + 1];
                                int var335 = class206.field3279[var7];
                                class206.field3279[var7++] = var334 * var335;
                                continue;
                            }
                            if (var446 == 4003) {
                                var7 -= 2;
                                int var336 = class206.field3279[var7];
                                int var337 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = var336 / var337;
                                continue;
                            }
                            if (var446 == 4004) {
                                var7--;
                                int var338 = class206.field3279[var7];
                                class206.field3279[var7++] = (int) ((double) var338 * Math.random());
                                continue;
                            }
                            if (var446 == 4005) {
                                var7--;
                                int var339 = class206.field3279[var7];
                                class206.field3279[var7++] = (int) ((double) (var339 + 1) * Math.random());
                                continue;
                            }
                            if (var446 == 4006) {
                                var7 -= 5;
                                int var340 = class206.field3279[var7];
                                int var341 = class206.field3279[var7 + 1];
                                int var342 = class206.field3279[var7 + 2];
                                int var343 = class206.field3279[var7 + 3];
                                int var344 = class206.field3279[var7 + 4];
                                class206.field3279[var7++] = (var341 - var340) * (var344 - var342) / (var343 - var342) + var340;
                                continue;
                            }
                            if (var446 == 4007) {
                                var7 -= 2;
                                long var345 = (long) class206.field3279[var7];
                                long var347 = (long) class206.field3279[var7 + 1];
                                class206.field3279[var7++] = (int) (var345 * var347 / 100L + var345);
                                continue;
                            }
                            if (var446 == 4008) {
                                var7 -= 2;
                                int var349 = class206.field3279[var7 + 1];
                                int var350 = class206.field3279[var7];
                                class206.field3279[var7++] = class156.method998(var350, 0x1 << var349);
                                continue;
                            }
                            if (var446 == 4009) {
                                var7 -= 2;
                                int var351 = class206.field3279[var7];
                                int var352 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class19.method151(var351, -(0x1 << var352) - 1);
                                continue;
                            }
                            if (var446 == 4010) {
                                var7 -= 2;
                                int var353 = class206.field3279[var7];
                                int var354 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class19.method151(var353, 0x1 << var354) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var446 == 4011) {
                                var7 -= 2;
                                int var355 = class206.field3279[var7 + 1];
                                int var356 = class206.field3279[var7];
                                class206.field3279[var7++] = var356 % var355;
                                continue;
                            }
                            if (var446 == 4012) {
                                var7 -= 2;
                                int var357 = class206.field3279[var7 + 1];
                                int var358 = class206.field3279[var7];
                                if (var358 == 0) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = (int) Math.pow((double) var358, (double) var357);
                                }
                                continue;
                            }
                            if (var446 == 4013) {
                                var7 -= 2;
                                int var359 = class206.field3279[var7];
                                int var360 = class206.field3279[var7 + 1];
                                if (var359 == 0) {
                                    class206.field3279[var7++] = 0;
                                } else if (var360 == 0) {
                                    class206.field3279[var7++] = Integer.MAX_VALUE;
                                } else {
                                    class206.field3279[var7++] = (int) Math.pow((double) var359, 1.0D / (double) var360);
                                }
                                continue;
                            }
                            if (var446 == 4014) {
                                var7 -= 2;
                                int var361 = class206.field3279[var7];
                                int var362 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class19.method151(var362, var361);
                                continue;
                            }
                            if (var446 == 4015) {
                                var7 -= 2;
                                int var363 = class206.field3279[var7];
                                int var364 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = class156.method998(var364, var363);
                                continue;
                            }
                            if (var446 == 4016) {
                                var7 -= 2;
                                int var365 = class206.field3279[var7];
                                int var366 = class206.field3279[var7 + 1];
                                class206.field3279[var7++] = var365 >= var366 ? var366 : var365;
                                continue;
                            }
                            if (var446 == 4017) {
                                var7 -= 2;
                                int var367 = class206.field3279[var7 + 1];
                                int var368 = class206.field3279[var7];
                                class206.field3279[var7++] = var368 > var367 ? var368 : var367;
                                continue;
                            }
                            if (var446 == 4018) {
                                var7 -= 3;
                                long var369 = (long) class206.field3279[var7 + 1];
                                long var371 = (long) class206.field3279[var7];
                                long var373 = (long) class206.field3279[var7 + 2];
                                class206.field3279[var7++] = (int) (var371 * var373 / var369);
                                continue;
                            }
                        } else if (var446 < 4200) {
                            if (var446 == 4100) {
                                var6--;
                                class119 var126 = class184.field2913[var6];
                                var7--;
                                int var127 = class206.field3279[var7];
                                class184.field2913[var6++] = class170.method1074(new class119[] { var126, class234.method1506(var127, (byte) -79) }, -126);
                                continue;
                            }
                            if (var446 == 4101) {
                                var6 -= 2;
                                class119 var128 = class184.field2913[var6 + 1];
                                class119 var129 = class184.field2913[var6];
                                class184.field2913[var6++] = class170.method1074(new class119[] { var129, var128 }, -114);
                                continue;
                            }
                            if (var446 == 4102) {
                                var6--;
                                class119 var130 = class184.field2913[var6];
                                var7--;
                                int var131 = class206.field3279[var7];
                                class184.field2913[var6++] = class170.method1074(new class119[] { var130, class243.method1582(120, true, var131) }, -94);
                                continue;
                            }
                            if (var446 == 4103) {
                                var6--;
                                class119 var132 = class184.field2913[var6];
                                class184.field2913[var6++] = var132.method779(false);
                                continue;
                            }
                            if (var446 == 4104) {
                                var7--;
                                int var133 = class206.field3279[var7];
                                long var134 = ((long) var133 + 11745L) * 86400000L;
                                class154.field2462.setTime(new Date(var134));
                                int var136 = class154.field2462.get(5);
                                int var137 = class154.field2462.get(2);
                                int var138 = class154.field2462.get(1);
                                class184.field2913[var6++] = class170.method1074(new class119[] { class234.method1506(var136, (byte) -79), class135.field2188, class205.field3243[var137], class135.field2188, class234.method1506(var138, (byte) -79) }, -127);
                                continue;
                            }
                            if (var446 == 4105) {
                                var6 -= 2;
                                class119 var139 = class184.field2913[var6];
                                class119 var140 = class184.field2913[var6 + 1];
                                if (class124.field1917.field4848 != null && class124.field1917.field4848.field4156) {
                                    class184.field2913[var6++] = var140;
                                    continue;
                                }
                                class184.field2913[var6++] = var139;
                                continue;
                            }
                            if (var446 == 4106) {
                                var7--;
                                int var141 = class206.field3279[var7];
                                class184.field2913[var6++] = class234.method1506(var141, (byte) -79);
                                continue;
                            }
                            if (var446 == 4107) {
                                var6 -= 2;
                                class206.field3279[var7++] = class184.field2913[var6].method778(-47, class184.field2913[var6 + 1]);
                                continue;
                            }
                            if (var446 == 4108) {
                                var7 -= 2;
                                var6--;
                                class119 var142 = class184.field2913[var6];
                                int var143 = class206.field3279[var7];
                                int var144 = class206.field3279[var7 + 1];
                                byte[] var145 = class81.field1246.method261(-1, var144, 0);
                                class290 var146 = new class290(var145);
                                var146.method1848(class254.field4086, (int[]) null);
                                class206.field3279[var7++] = var146.method1834(var142, var143);
                                continue;
                            }
                            if (var446 == 4109) {
                                var7 -= 2;
                                var6--;
                                class119 var147 = class184.field2913[var6];
                                int var148 = class206.field3279[var7];
                                int var149 = class206.field3279[var7 + 1];
                                byte[] var150 = class81.field1246.method261(-1, var149, 0);
                                class290 var151 = new class290(var150);
                                var151.method1848(class254.field4086, (int[]) null);
                                class206.field3279[var7++] = var151.method1830(var147, var148);
                                continue;
                            }
                            if (var446 == 4110) {
                                var6 -= 2;
                                class119 var152 = class184.field2913[var6];
                                class119 var153 = class184.field2913[var6 + 1];
                                var7--;
                                if (class206.field3279[var7] == 1) {
                                    class184.field2913[var6++] = var152;
                                } else {
                                    class184.field2913[var6++] = var153;
                                }
                                continue;
                            }
                            if (var446 == 4111) {
                                var6--;
                                class119 var154 = class184.field2913[var6];
                                class184.field2913[var6++] = class278.method1849(var154);
                                continue;
                            }
                            if (var446 == 4112) {
                                var7--;
                                int var155 = class206.field3279[var7];
                                var6--;
                                class119 var156 = class184.field2913[var6];
                                if (var155 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class184.field2913[var6++] = var156.method767(var155, 12);
                                continue;
                            }
                            if (var446 == 4113) {
                                var7--;
                                int var157 = class206.field3279[var7];
                                class206.field3279[var7++] = class166.method1050(-126, var157) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4114) {
                                var7--;
                                int var158 = class206.field3279[var7];
                                class206.field3279[var7++] = class170.method1071(true, var158) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4115) {
                                var7--;
                                int var159 = class206.field3279[var7];
                                class206.field3279[var7++] = class25.method187((byte) 65, var159) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4116) {
                                var7--;
                                int var160 = class206.field3279[var7];
                                class206.field3279[var7++] = class156.method993(var160, (byte) -46) ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4117) {
                                var6--;
                                class119 var161 = class184.field2913[var6];
                                if (var161 == null) {
                                    class206.field3279[var7++] = 0;
                                } else {
                                    class206.field3279[var7++] = var161.method776((byte) -66);
                                }
                                continue;
                            }
                            if (var446 == 4118) {
                                var7 -= 2;
                                int var162 = class206.field3279[var7];
                                int var163 = class206.field3279[var7 + 1];
                                var6--;
                                class119 var164 = class184.field2913[var6];
                                class184.field2913[var6++] = var164.method762(var163, 0, var162);
                                continue;
                            }
                            if (var446 == 4119) {
                                boolean var165 = false;
                                var6--;
                                class119 var166 = class184.field2913[var6];
                                class119 var167 = class78.method546((byte) -121, var166.method776((byte) -125));
                                for (int var168 = 0; var166.method776((byte) -57) > var168; var168++) {
                                    int var169 = var166.method755((byte) -120, var168);
                                    if (var169 == 60) {
                                        var165 = true;
                                    } else if (var169 == 62) {
                                        var165 = false;
                                    } else if (!var165) {
                                        var167.method775((byte) 59, var169);
                                    }
                                }
                                var167.method753(0);
                                class184.field2913[var6++] = var167;
                                continue;
                            }
                            if (var446 == 4120) {
                                var7 -= 2;
                                var6--;
                                class119 var170 = class184.field2913[var6];
                                int var171 = class206.field3279[var7 + 1];
                                int var172 = class206.field3279[var7];
                                class206.field3279[var7++] = var170.method763(var171, (byte) -78, var172);
                                continue;
                            }
                            if (var446 == 4121) {
                                var6 -= 2;
                                var7--;
                                int var173 = class206.field3279[var7];
                                class119 var174 = class184.field2913[var6];
                                class119 var175 = class184.field2913[var6 + 1];
                                class206.field3279[var7++] = var174.method759(var175, var173, (byte) -55);
                                continue;
                            }
                            if (var446 == 4122) {
                                var7--;
                                int var176 = class206.field3279[var7];
                                class206.field3279[var7++] = class199.method1270(-193, var176);
                                continue;
                            }
                            if (var446 == 4123) {
                                var7--;
                                int var177 = class206.field3279[var7];
                                class206.field3279[var7++] = class19.method150(var177, (byte) 5);
                                continue;
                            }
                        } else if (var446 < 4300) {
                            if (var446 == 4200) {
                                var7--;
                                int var178 = class206.field3279[var7];
                                class184.field2913[var6++] = class205.method1296((byte) -126, var178).field4212;
                                continue;
                            }
                            if (var446 == 4201) {
                                var7 -= 2;
                                int var179 = class206.field3279[var7 + 1];
                                int var180 = class206.field3279[var7];
                                class262 var181 = class205.method1296((byte) -83, var180);
                                if (var179 >= 1 && var179 <= 5 && var181.field4198[var179 - 1] != null) {
                                    class184.field2913[var6++] = var181.field4198[var179 - 1];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 4202) {
                                var7 -= 2;
                                int var182 = class206.field3279[var7 + 1];
                                int var183 = class206.field3279[var7];
                                class262 var184 = class205.method1296((byte) -89, var183);
                                if (var182 >= 1 && var182 <= 5 && var184.field4260[var182 - 1] != null) {
                                    class184.field2913[var6++] = var184.field4260[var182 - 1];
                                    continue;
                                }
                                class184.field2913[var6++] = class208.field3310;
                                continue;
                            }
                            if (var446 == 4203) {
                                var7--;
                                int var185 = class206.field3279[var7];
                                class206.field3279[var7++] = class205.method1296((byte) -82, var185).field4270;
                                continue;
                            }
                            if (var446 == 4204) {
                                var7--;
                                int var186 = class206.field3279[var7];
                                class206.field3279[var7++] = class205.method1296((byte) -103, var186).field4201 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4205) {
                                var7--;
                                int var187 = class206.field3279[var7];
                                class262 var188 = class205.method1296((byte) -119, var187);
                                if (var188.field4199 == -1 && var188.field4238 >= 0) {
                                    class206.field3279[var7++] = var188.field4238;
                                    continue;
                                }
                                class206.field3279[var7++] = var187;
                                continue;
                            }
                            if (var446 == 4206) {
                                var7--;
                                int var189 = class206.field3279[var7];
                                class262 var190 = class205.method1296((byte) -92, var189);
                                if (var190.field4199 >= 0 && var190.field4238 >= 0) {
                                    class206.field3279[var7++] = var190.field4238;
                                    continue;
                                }
                                class206.field3279[var7++] = var189;
                                continue;
                            }
                            if (var446 == 4207) {
                                var7--;
                                int var191 = class206.field3279[var7];
                                class206.field3279[var7++] = class205.method1296((byte) -112, var191).field4248 ? 1 : 0;
                                continue;
                            }
                            if (var446 == 4208) {
                                var7 -= 2;
                                int var192 = class206.field3279[var7];
                                int var193 = class206.field3279[var7 + 1];
                                class86 var194 = class197.method1265(var193, 100);
                                if (var194.method580(54)) {
                                    class184.field2913[var6++] = class205.method1296((byte) -104, var192).method1685(97, var193, var194.field1296);
                                } else {
                                    class206.field3279[var7++] = class205.method1296((byte) -109, var192).method1697(40, var194.field1299, var193);
                                }
                                continue;
                            }
                            if (var446 == 4210) {
                                var7--;
                                int var195 = class206.field3279[var7];
                                var6--;
                                class119 var196 = class184.field2913[var6];
                                class146.method954(var195 == 1, var196, (byte) 95);
                                class206.field3279[var7++] = class179.field2854;
                                continue;
                            }
                            if (var446 == 4211) {
                                if (class171.field2709 != null && class179.field2854 > class292.field4838) {
                                    class206.field3279[var7++] = class19.method151(class171.field2709[class292.field4838++], 65535);
                                    continue;
                                }
                                class206.field3279[var7++] = -1;
                                continue;
                            }
                            if (var446 == 4212) {
                                class292.field4838 = 0;
                                continue;
                            }
                        } else if (var446 < 4400) {
                            if (var446 == 4300) {
                                var7 -= 2;
                                int var197 = class206.field3279[var7 + 1];
                                int var198 = class206.field3279[var7];
                                class86 var199 = class197.method1265(var197, 79);
                                if (var199.method580(31)) {
                                    class184.field2913[var6++] = class134.method896(-1, var198).method384(-1, var199.field1296, var197);
                                } else {
                                    class206.field3279[var7++] = class134.method896(-1, var198).method376(var199.field1299, -102, var197);
                                }
                                continue;
                            }
                        } else if (var446 < 4500) {
                            if (var446 == 4400) {
                                var7 -= 2;
                                int var200 = class206.field3279[var7];
                                int var201 = class206.field3279[var7 + 1];
                                class86 var202 = class197.method1265(var201, 81);
                                if (var202.method580(13)) {
                                    class184.field2913[var6++] = class291.method1939(0, var200).method1928(112, var201, var202.field1296);
                                } else {
                                    class206.field3279[var7++] = class291.method1939(0, var200).method1930(var202.field1299, false, var201);
                                }
                                continue;
                            }
                        } else if (var446 >= 4600) {
                            if (var446 < 5100) {
                                if (var446 == 5000) {
                                    class206.field3279[var7++] = class144.field2302;
                                    continue;
                                }
                                if (var446 == 5001) {
                                    var7 -= 3;
                                    class144.field2302 = class206.field3279[var7];
                                    class164.field2591++;
                                    class90.field1374 = class206.field3279[var7 + 1];
                                    class253.field4077 = class206.field3279[var7 + 2];
                                    class6.field149.method966(0, 172);
                                    class6.field149.method32(class144.field2302, (byte) -99);
                                    class6.field149.method32(class90.field1374, (byte) -99);
                                    class6.field149.method32(class253.field4077, (byte) -99);
                                    continue;
                                }
                                if (var446 == 5002) {
                                    var7 -= 2;
                                    var6--;
                                    class119 var203 = class184.field2913[var6];
                                    class70.field1094++;
                                    int var204 = class206.field3279[var7 + 1];
                                    int var205 = class206.field3279[var7];
                                    class6.field149.method966(0, 191);
                                    class6.field149.method29(2069, var203.method786((byte) 112));
                                    class6.field149.method32(var205 - 1, (byte) -99);
                                    class6.field149.method32(var204, (byte) -99);
                                    continue;
                                }
                                if (var446 == 5003) {
                                    class119 var206 = null;
                                    var7--;
                                    int var207 = class206.field3279[var7];
                                    if (var207 < 100) {
                                        var206 = class162.field2567[var207];
                                    }
                                    if (var206 == null) {
                                        var206 = class208.field3310;
                                    }
                                    class184.field2913[var6++] = var206;
                                    continue;
                                }
                                if (var446 == 5004) {
                                    var7--;
                                    int var208 = class206.field3279[var7];
                                    int var209 = -1;
                                    if (var208 < 100 && class162.field2567[var208] != null) {
                                        var209 = class230.field3725[var208];
                                    }
                                    class206.field3279[var7++] = var209;
                                    continue;
                                }
                                if (var446 == 5005) {
                                    class206.field3279[var7++] = class90.field1374;
                                    continue;
                                }
                                if (var446 == 5008) {
                                    var6--;
                                    class119 var210 = class184.field2913[var6];
                                    if (var210.method761(0, class280.field4636)) {
                                        class206.method1300(var210, 13777);
                                        continue;
                                    }
                                    if (class19.field248 == 0 && (class261.field4180 == 1 || class245.field3972 == 1)) {
                                        continue;
                                    }
                                    class119 var211 = var210.method779(arg1);
                                    byte var212 = 0;
                                    if (var211.method761(0, class195.field3122)) {
                                        var212 = 0;
                                        var210 = var210.method769(-96, class195.field3122.method776((byte) -98));
                                    } else if (var211.method761(0, class78.field1204)) {
                                        var210 = var210.method769(-117, class78.field1204.method776((byte) -87));
                                        var212 = 1;
                                    } else if (var211.method761(0, class298.field5015)) {
                                        var212 = 2;
                                        var210 = var210.method769(-64, class298.field5015.method776((byte) -116));
                                    } else if (var211.method761(0, class14.field223)) {
                                        var212 = 3;
                                        var210 = var210.method769(-96, class14.field223.method776((byte) -61));
                                    } else if (var211.method761(0, class224.field3595)) {
                                        var210 = var210.method769(-94, class224.field3595.method776((byte) -36));
                                        var212 = 4;
                                    } else if (var211.method761(0, class129.field1986)) {
                                        var210 = var210.method769(-115, class129.field1986.method776((byte) -106));
                                        var212 = 5;
                                    } else if (var211.method761(0, class245.field3965)) {
                                        var210 = var210.method769(-63, class245.field3965.method776((byte) -75));
                                        var212 = 6;
                                    } else if (var211.method761(0, class4.field122)) {
                                        var210 = var210.method769(-107, class4.field122.method776((byte) -77));
                                        var212 = 7;
                                    } else if (var211.method761(0, class273.field4481)) {
                                        var212 = 8;
                                        var210 = var210.method769(-124, class273.field4481.method776((byte) -100));
                                    } else if (var211.method761(0, class189.field2990)) {
                                        var212 = 9;
                                        var210 = var210.method769(-121, class189.field2990.method776((byte) -16));
                                    } else if (var211.method761(0, class234.field3773)) {
                                        var210 = var210.method769(-86, class234.field3773.method776((byte) -58));
                                        var212 = 10;
                                    } else if (var211.method761(0, class146.field2350)) {
                                        var212 = 11;
                                        var210 = var210.method769(-83, class146.field2350.method776((byte) -48));
                                    } else if (class65.field1022 != 0) {
                                        if (var211.method761(0, class195.field3124)) {
                                            var210 = var210.method769(-94, class195.field3124.method776((byte) -20));
                                            var212 = 0;
                                        } else if (var211.method761(0, class78.field1201)) {
                                            var210 = var210.method769(-56, class78.field1201.method776((byte) -102));
                                            var212 = 1;
                                        } else if (var211.method761(0, class298.field5021)) {
                                            var210 = var210.method769(-126, class298.field5021.method776((byte) -96));
                                            var212 = 2;
                                        } else if (var211.method761(0, class14.field218)) {
                                            var210 = var210.method769(-103, class14.field218.method776((byte) -30));
                                            var212 = 3;
                                        } else if (var211.method761(0, class224.field3597)) {
                                            var212 = 4;
                                            var210 = var210.method769(-86, class224.field3597.method776((byte) -62));
                                        } else if (var211.method761(0, class129.field1972)) {
                                            var212 = 5;
                                            var210 = var210.method769(-83, class129.field1972.method776((byte) -21));
                                        } else if (var211.method761(0, class245.field3968)) {
                                            var212 = 6;
                                            var210 = var210.method769(-52, class245.field3968.method776((byte) -83));
                                        } else if (var211.method761(0, class4.field112)) {
                                            var210 = var210.method769(-118, class4.field112.method776((byte) -46));
                                            var212 = 7;
                                        } else if (var211.method761(0, class273.field4484)) {
                                            var212 = 8;
                                            var210 = var210.method769(-91, class273.field4484.method776((byte) -109));
                                        } else if (var211.method761(0, class189.field2989)) {
                                            var210 = var210.method769(-104, class189.field2989.method776((byte) -70));
                                            var212 = 9;
                                        } else if (var211.method761(0, class234.field3776)) {
                                            var212 = 10;
                                            var210 = var210.method769(-108, class234.field3776.method776((byte) -32));
                                        } else if (var211.method761(0, class146.field2337)) {
                                            var210 = var210.method769(-115, class146.field2337.method776((byte) -69));
                                            var212 = 11;
                                        }
                                    }
                                    class285.field4717++;
                                    class119 var213 = var210.method779(false);
                                    byte var214 = 0;
                                    if (var213.method761(0, class287.field4726)) {
                                        var210 = var210.method769(-100, class287.field4726.method776((byte) -127));
                                        var214 = 1;
                                    } else if (var213.method761(0, class164.field2593)) {
                                        var210 = var210.method769(-103, class164.field2593.method776((byte) -122));
                                        var214 = 2;
                                    } else if (var213.method761(0, class53.field855)) {
                                        var210 = var210.method769(-87, class53.field855.method776((byte) -125));
                                        var214 = 3;
                                    } else if (var213.method761(0, class211.field3371)) {
                                        var210 = var210.method769(-81, class211.field3371.method776((byte) -15));
                                        var214 = 4;
                                    } else if (var213.method761(0, class79.field1220)) {
                                        var210 = var210.method769(-51, class79.field1220.method776((byte) -101));
                                        var214 = 5;
                                    } else if (class65.field1022 != 0) {
                                        if (var213.method761(0, class287.field4730)) {
                                            var210 = var210.method769(-98, class287.field4730.method776((byte) -18));
                                            var214 = 1;
                                        } else if (var213.method761(0, class164.field2594)) {
                                            var210 = var210.method769(-54, class164.field2594.method776((byte) -112));
                                            var214 = 2;
                                        } else if (var213.method761(0, class53.field849)) {
                                            var214 = 3;
                                            var210 = var210.method769(-82, class53.field849.method776((byte) -40));
                                        } else if (var213.method761(0, class211.field3365)) {
                                            var210 = var210.method769(-71, class211.field3365.method776((byte) -90));
                                            var214 = 4;
                                        } else if (var213.method761(0, class79.field1228)) {
                                            var210 = var210.method769(-75, class79.field1228.method776((byte) -85));
                                            var214 = 5;
                                        }
                                    }
                                    class6.field149.method966(0, 169);
                                    class6.field149.method32(0, (byte) -99);
                                    int var215 = class6.field149.field44;
                                    class6.field149.method32(var212, (byte) -99);
                                    class6.field149.method32(var214, (byte) -99);
                                    class252.method1621(class6.field149, (byte) 127, var210);
                                    class6.field149.method39(class6.field149.field44 - var215, (byte) -109);
                                    continue;
                                }
                                if (var446 == 5009) {
                                    var6 -= 2;
                                    class119 var216 = class184.field2913[var6];
                                    class119 var217 = class184.field2913[var6 + 1];
                                    if (class19.field248 != 0 || class261.field4180 != 1 && class245.field3972 != 1) {
                                        class298.field5024++;
                                        class6.field149.method966(0, 121);
                                        class6.field149.method32(0, (byte) -99);
                                        int var218 = class6.field149.field44;
                                        class6.field149.method29(2069, var216.method786((byte) 112));
                                        class252.method1621(class6.field149, (byte) 91, var217);
                                        class6.field149.method39(class6.field149.field44 - var218, (byte) -116);
                                    }
                                    continue;
                                }
                                if (var446 == 5010) {
                                    var7--;
                                    int var219 = class206.field3279[var7];
                                    class119 var220 = null;
                                    if (var219 < 100) {
                                        var220 = class109.field1673[var219];
                                    }
                                    if (var220 == null) {
                                        var220 = class208.field3310;
                                    }
                                    class184.field2913[var6++] = var220;
                                    continue;
                                }
                                if (var446 == 5011) {
                                    var7--;
                                    int var221 = class206.field3279[var7];
                                    class119 var222 = null;
                                    if (var221 < 100) {
                                        var222 = field271[var221];
                                    }
                                    if (var222 == null) {
                                        var222 = class208.field3310;
                                    }
                                    class184.field2913[var6++] = var222;
                                    continue;
                                }
                                if (var446 == 5012) {
                                    var7--;
                                    int var223 = class206.field3279[var7];
                                    int var224 = -1;
                                    if (var223 < 100) {
                                        var224 = class118.field1776[var223];
                                    }
                                    class206.field3279[var7++] = var224;
                                    continue;
                                }
                                if (var446 == 5015) {
                                    class119 var225;
                                    if (class124.field1917 == null || class124.field1917.field4861 == null) {
                                        var225 = class203.field3216;
                                    } else {
                                        var225 = class124.field1917.field4861;
                                    }
                                    class184.field2913[var6++] = var225;
                                    continue;
                                }
                                if (var446 == 5016) {
                                    class206.field3279[var7++] = class253.field4077;
                                    continue;
                                }
                                if (var446 == 5017) {
                                    class206.field3279[var7++] = class177.field2837;
                                    continue;
                                }
                                if (var446 == 5050) {
                                    var7--;
                                    int var226 = class206.field3279[var7];
                                    class184.field2913[var6++] = class227.method1445(-32769, var226).field2684;
                                    continue;
                                }
                                if (var446 == 5051) {
                                    var7--;
                                    int var227 = class206.field3279[var7];
                                    class170 var228 = class227.method1445(-32769, var227);
                                    if (var228.field2693 == null) {
                                        class206.field3279[var7++] = 0;
                                    } else {
                                        class206.field3279[var7++] = var228.field2693.length;
                                    }
                                    continue;
                                }
                                if (var446 == 5052) {
                                    var7 -= 2;
                                    int var229 = class206.field3279[var7 + 1];
                                    int var230 = class206.field3279[var7];
                                    class170 var231 = class227.method1445(-32769, var230);
                                    int var232 = var231.field2693[var229];
                                    class206.field3279[var7++] = var232;
                                    continue;
                                }
                                if (var446 == 5053) {
                                    var7--;
                                    int var233 = class206.field3279[var7];
                                    class170 var234 = class227.method1445(-32769, var233);
                                    if (var234.field2689 == null) {
                                        class206.field3279[var7++] = 0;
                                    } else {
                                        class206.field3279[var7++] = var234.field2689.length;
                                    }
                                    continue;
                                }
                                if (var446 == 5054) {
                                    var7 -= 2;
                                    int var235 = class206.field3279[var7];
                                    int var236 = class206.field3279[var7 + 1];
                                    class206.field3279[var7++] = class227.method1445(-32769, var235).field2689[var236];
                                    continue;
                                }
                                if (var446 == 5055) {
                                    var7--;
                                    int var237 = class206.field3279[var7];
                                    class184.field2913[var6++] = class13.method112(127, var237).method165(1);
                                    continue;
                                }
                                if (var446 == 5056) {
                                    var7--;
                                    int var238 = class206.field3279[var7];
                                    class20 var239 = class13.method112(-10, var238);
                                    if (var239.field282 == null) {
                                        class206.field3279[var7++] = 0;
                                    } else {
                                        class206.field3279[var7++] = var239.field282.length;
                                    }
                                    continue;
                                }
                                if (var446 == 5057) {
                                    var7 -= 2;
                                    int var240 = class206.field3279[var7 + 1];
                                    int var241 = class206.field3279[var7];
                                    class206.field3279[var7++] = class13.method112(-34, var241).field282[var240];
                                    continue;
                                }
                                if (var446 == 5058) {
                                    class261.field4183 = new class268();
                                    var7--;
                                    class261.field4183.field4418 = class206.field3279[var7];
                                    class261.field4183.field4428 = class13.method112(-88, class261.field4183.field4418);
                                    class261.field4183.field4422 = new int[class261.field4183.field4428.method159(!arg1)];
                                    continue;
                                }
                                if (var446 == 5059) {
                                    class142.field2262++;
                                    class6.field149.method966(0, 242);
                                    class6.field149.method32(0, (byte) -99);
                                    int var242 = class6.field149.field44;
                                    class6.field149.method32(0, (byte) -99);
                                    class6.field149.method40(class261.field4183.field4418, -34);
                                    class261.field4183.field4428.method161(1608, class6.field149, class261.field4183.field4422);
                                    class6.field149.method39(class6.field149.field44 - var242, (byte) -124);
                                    continue;
                                }
                                if (var446 == 5060) {
                                    class243.field3912++;
                                    var6--;
                                    class119 var243 = class184.field2913[var6];
                                    class6.field149.method966(0, 134);
                                    class6.field149.method32(0, (byte) -99);
                                    int var244 = class6.field149.field44;
                                    class6.field149.method29(2069, var243.method786((byte) 112));
                                    class6.field149.method40(class261.field4183.field4418, 125);
                                    class261.field4183.field4428.method161(1608, class6.field149, class261.field4183.field4422);
                                    class6.field149.method39(class6.field149.field44 - var244, (byte) -110);
                                    continue;
                                }
                                if (var446 == 5061) {
                                    class6.field149.method966(0, 242);
                                    class142.field2262++;
                                    class6.field149.method32(0, (byte) -99);
                                    int var245 = class6.field149.field44;
                                    class6.field149.method32(1, (byte) -99);
                                    class6.field149.method40(class261.field4183.field4418, -45);
                                    class261.field4183.field4428.method161(1608, class6.field149, class261.field4183.field4422);
                                    class6.field149.method39(class6.field149.field44 - var245, (byte) -105);
                                    continue;
                                }
                                if (var446 == 5062) {
                                    var7 -= 2;
                                    int var246 = class206.field3279[var7];
                                    int var247 = class206.field3279[var7 + 1];
                                    class206.field3279[var7++] = class227.method1445(-32769, var246).field2682[var247];
                                    continue;
                                }
                                if (var446 == 5063) {
                                    var7 -= 2;
                                    int var248 = class206.field3279[var7];
                                    int var249 = class206.field3279[var7 + 1];
                                    class206.field3279[var7++] = class227.method1445(-32769, var248).field2690[var249];
                                    continue;
                                }
                                if (var446 == 5064) {
                                    var7 -= 2;
                                    int var250 = class206.field3279[var7];
                                    int var251 = class206.field3279[var7 + 1];
                                    if (var251 == -1) {
                                        class206.field3279[var7++] = -1;
                                    } else {
                                        class206.field3279[var7++] = class227.method1445(-32769, var250).method1079(var251, -16865);
                                    }
                                    continue;
                                }
                                if (var446 == 5065) {
                                    var7 -= 2;
                                    int var252 = class206.field3279[var7];
                                    int var253 = class206.field3279[var7 + 1];
                                    if (var253 == -1) {
                                        class206.field3279[var7++] = -1;
                                    } else {
                                        class206.field3279[var7++] = class227.method1445(-32769, var252).method1075(var253, 76);
                                    }
                                    continue;
                                }
                                if (var446 == 5066) {
                                    var7--;
                                    int var254 = class206.field3279[var7];
                                    class206.field3279[var7++] = class13.method112(-60, var254).method159(!arg1);
                                    continue;
                                }
                                if (var446 == 5067) {
                                    var7 -= 2;
                                    int var255 = class206.field3279[var7];
                                    int var256 = class206.field3279[var7 + 1];
                                    int var257 = class13.method112(120, var255).method164(var256, -2);
                                    class206.field3279[var7++] = var257;
                                    continue;
                                }
                                if (var446 == 5068) {
                                    var7 -= 2;
                                    int var258 = class206.field3279[var7];
                                    int var259 = class206.field3279[var7 + 1];
                                    class261.field4183.field4422[var258] = var259;
                                    continue;
                                }
                                if (var446 == 5069) {
                                    var7 -= 2;
                                    int var260 = class206.field3279[var7];
                                    int var261 = class206.field3279[var7 + 1];
                                    class261.field4183.field4422[var260] = var261;
                                    continue;
                                }
                                if (var446 == 5070) {
                                    var7 -= 3;
                                    int var262 = class206.field3279[var7];
                                    int var263 = class206.field3279[var7 + 2];
                                    int var264 = class206.field3279[var7 + 1];
                                    class20 var265 = class13.method112(-23, var262);
                                    if (var265.method164(var264, -2) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class206.field3279[var7++] = var265.method158(104, var264, var263);
                                    continue;
                                }
                            } else if (var446 < 5200) {
                                if (var446 == 5100) {
                                    if (class289.field4760[86]) {
                                        class206.field3279[var7++] = 1;
                                    } else {
                                        class206.field3279[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var446 == 5101) {
                                    if (class289.field4760[82]) {
                                        class206.field3279[var7++] = 1;
                                    } else {
                                        class206.field3279[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var446 == 5102) {
                                    if (class289.field4760[81]) {
                                        class206.field3279[var7++] = 1;
                                    } else {
                                        class206.field3279[var7++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var446 < 5300) {
                                if (var446 == 5200) {
                                    var7--;
                                    class226.method1438(class206.field3279[var7], -76);
                                    continue;
                                }
                                if (var446 == 5201) {
                                    class206.field3279[var7++] = class96.method652(-1);
                                    continue;
                                }
                                if (var446 == 5202) {
                                    var7--;
                                    class202.method1282((byte) -99, class206.field3279[var7]);
                                    continue;
                                }
                                if (var446 == 5203) {
                                    var6--;
                                    class29.method224((byte) -75, class184.field2913[var6]);
                                    continue;
                                }
                                if (var446 == 5204) {
                                    class184.field2913[var6 - 1] = class259.method1657(49, class184.field2913[var6 - 1]);
                                    continue;
                                }
                                if (var446 == 5205) {
                                    var6--;
                                    class118.method740(11103, class184.field2913[var6]);
                                    continue;
                                }
                            } else if (var446 < 5400) {
                                if (var446 == 5300) {
                                    var7 -= 2;
                                    int var316 = class206.field3279[var7 + 1];
                                    int var317 = class206.field3279[var7];
                                    if (class182.field2880 != null) {
                                        class135.method900(255);
                                    }
                                    class210.method1316(var317, var316, 0);
                                    class206.field3279[var7++] = class182.field2880 == null ? 0 : 1;
                                    continue;
                                }
                                if (var446 == 5301) {
                                    if (class182.field2880 != null) {
                                        class135.method900(255);
                                    }
                                    continue;
                                }
                                if (var446 == 5302) {
                                    class72[] var318 = class261.method1683(-77);
                                    class206.field3279[var7++] = var318.length;
                                    continue;
                                }
                                if (var446 == 5303) {
                                    var7--;
                                    int var319 = class206.field3279[var7];
                                    class72[] var320 = class261.method1683(-90);
                                    class206.field3279[var7++] = var320[var319].field1119;
                                    class206.field3279[var7++] = var320[var319].field1117;
                                    continue;
                                }
                                if (var446 == 5304) {
                                    class206.field3279[var7++] = class182.field2880 == null ? 0 : 1;
                                    continue;
                                }
                                if (var446 == 5305) {
                                    int var321 = class27.field407;
                                    int var322 = class146.field2349;
                                    int var323 = -1;
                                    class72[] var324 = class261.method1683(-100);
                                    for (int var325 = 0; var325 < var324.length; var325++) {
                                        class72 var326 = var324[var325];
                                        if (var326.field1119 == var321 && var326.field1117 == var322) {
                                            var323 = var325;
                                            break;
                                        }
                                    }
                                    class206.field3279[var7++] = var323;
                                    continue;
                                }
                            } else if (var446 < 5500) {
                                if (var446 == 5400) {
                                    var6 -= 2;
                                    class212.field3375++;
                                    class119 var266 = class184.field2913[var6];
                                    class119 var267 = class184.field2913[var6 + 1];
                                    var7--;
                                    int var268 = class206.field3279[var7];
                                    class6.field149.method966(0, 206);
                                    class6.field149.method32(class280.method1860(-125, var266) + (class280.method1860(-107, var267) + 1), (byte) -99);
                                    class6.field149.method61(false, var266);
                                    class6.field149.method61(false, var267);
                                    class6.field149.method32(var268, (byte) -99);
                                    continue;
                                }
                                if (var446 == 5401) {
                                    var7 -= 2;
                                    class234.field3782[class206.field3279[var7]] = (short) class158.method1011(class206.field3279[var7 + 1], -996128155);
                                    class81.method559((byte) 124);
                                    class212.method1336(128);
                                    class32.method237(false);
                                    class224.method1427(23263);
                                    class227.method1444(1);
                                    continue;
                                }
                                if (var446 == 5402) {
                                    var6 -= 2;
                                    class203.field3216 = class184.field2913[var6];
                                    class203.field3226 = class184.field2913[var6 + 1];
                                    if (class214.field3407 != 10) {
                                        continue;
                                    }
                                    if (!class203.field3216.method784(class208.field3310, 86) && !class203.field3226.method784(class208.field3310, 84)) {
                                        class204.method1289(73, 20);
                                        continue;
                                    }
                                    class242.field3891 = 3;
                                    continue;
                                }
                                if (var446 == 5403) {
                                    class206.field3279[var7++] = class242.field3891;
                                    continue;
                                }
                                if (var446 == 5404) {
                                    class206.field3279[var7++] = client.field1401 / 60;
                                    continue;
                                }
                                if (var446 == 5405) {
                                    var7 -= 2;
                                    int var269 = class206.field3279[var7];
                                    int var270 = class206.field3279[var7 + 1];
                                    if (var269 >= 0 && var269 < 2) {
                                        class59.field962[var269] = new int[var270 << 1][4];
                                    }
                                    continue;
                                }
                                if (var446 == 5406) {
                                    var7 -= 7;
                                    int var271 = class206.field3279[var7 + 1] << 1;
                                    int var272 = class206.field3279[var7 + 2];
                                    int var273 = class206.field3279[var7 + 3];
                                    int var274 = class206.field3279[var7 + 6];
                                    int var275 = class206.field3279[var7];
                                    int var276 = class206.field3279[var7 + 4];
                                    int var277 = class206.field3279[var7 + 5];
                                    if (var275 >= 0 && var275 < 2 && class59.field962[var275] != null && var271 >= 0 && class59.field962[var275].length > var271) {
                                        class59.field962[var275][var271] = new int[] { class19.method151(16383, var272 >> 14) * 128, var273, class19.method151(var272, 16383) * 128, var274 };
                                        class59.field962[var275][var271 + 1] = new int[] { class19.method151(var276 >> 14, 16383) * 128, var277, class19.method151(16383, var276) * 128 };
                                    }
                                    continue;
                                }
                                if (var446 == 5407) {
                                    var7--;
                                    int var278 = class59.field962[class206.field3279[var7]].length >> 1;
                                    class206.field3279[var7++] = var278;
                                    continue;
                                }
                                if (var446 == 5408) {
                                    class206.field3279[var7++] = 1;
                                    continue;
                                }
                                if (var446 == 5409) {
                                    class272.method1797(-94);
                                    continue;
                                }
                                if (var446 == 5411) {
                                    if (class182.field2880 != null) {
                                        class135.method900(255);
                                    }
                                    if (class118.field1808 == null) {
                                        class270.method1790(false, class246.method1599((byte) -40), 88);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var446 == 5412) {
                                    var7 -= 4;
                                    if (class154.field2448 == 0) {
                                        class276.method1811(class206.field3279[var7], class206.field3279[var7 + 3], (byte) -69, class206.field3279[var7 + 2], class206.field3279[var7 + 1]);
                                    }
                                    continue;
                                }
                                if (var446 == 5413) {
                                    class206.field3279[var7++] = class281.field4642;
                                    continue;
                                }
                                if (var446 == 5414) {
                                    var6--;
                                    if (class154.field2448 == 0) {
                                        class91.method629(class184.field2913[var6].method786((byte) 112), -75);
                                    }
                                    continue;
                                }
                                if (var446 == 5415) {
                                    class206.field3279[var7++] = class42.field644;
                                    continue;
                                }
                                if (var446 == 5416) {
                                    var6 -= 2;
                                    var7 -= 4;
                                    if (class154.field2448 == 0) {
                                        class298.method1992(class184.field2913[var6 + 1], class206.field3279[var7 + 1], class206.field3279[var7], class206.field3279[var7 + 3], -811, class206.field3279[var7 + 2], class184.field2913[var6].method786((byte) 112));
                                    }
                                    continue;
                                }
                                if (var446 == 5417) {
                                    class206.field3279[var7++] = class202.field3199;
                                    continue;
                                }
                                if (var446 == 5418) {
                                    for (int var279 = 0; var279 < 5; var279++) {
                                        class184.field2913[var6++] = var279 >= class35.field480.length ? class208.field3310 : class35.field480[var279];
                                    }
                                    class35.field480 = null;
                                    continue;
                                }
                                if (var446 == 5419) {
                                    class119 var280 = class208.field3310;
                                    if (class247.field4001 != null) {
                                        var280 = class88.method597(class247.field4001.field4500, 1361938307);
                                        try {
                                            if (class247.field4001.field4499 != null) {
                                                byte[] var281 = ((String) class247.field4001.field4499).getBytes("ISO-8859-1");
                                                var280 = class250.method1615(var281, var281.length, 0, -81);
                                            }
                                        } catch (UnsupportedEncodingException var444) {
                                        }
                                    }
                                    class184.field2913[var6++] = var280;
                                    continue;
                                }
                                if (var446 == 5420) {
                                    class206.field3279[var7++] = class220.field3523 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 5421) {
                                    if (class182.field2880 != null) {
                                        class135.method900(255);
                                    }
                                    var6--;
                                    class119 var283 = class184.field2913[var6];
                                    var7--;
                                    boolean var284 = class206.field3279[var7] == 1;
                                    class270.method1790(var284, class170.method1074(new class119[] { class246.method1599((byte) 69), var283 }, -128), 63);
                                    continue;
                                }
                            } else if (var446 < 5600) {
                                if (var446 == 5500) {
                                    var7 -= 4;
                                    int var304 = class206.field3279[var7];
                                    int var305 = class206.field3279[var7 + 2];
                                    int var306 = class206.field3279[var7 + 1];
                                    int var307 = class206.field3279[var7 + 3];
                                    class168.method1063(7463, ((var304 & 0xFFFFF47) >> 14) - class30.field421, (var304 & 0x3FFF) - class189.field2995, var307, false, var305, var306);
                                    continue;
                                }
                                if (var446 == 5501) {
                                    var7 -= 4;
                                    int var308 = class206.field3279[var7];
                                    int var309 = class206.field3279[var7 + 1];
                                    int var310 = class206.field3279[var7 + 2];
                                    int var311 = class206.field3279[var7 + 3];
                                    class64.method473(var311, (var308 >> 14 & 0x3FFF) - class30.field421, var309, (var308 & 0x3FFF) - class189.field2995, (byte) -45, var310);
                                    continue;
                                }
                                if (var446 == 5502) {
                                    var7 -= 6;
                                    int var312 = class206.field3279[var7];
                                    if (var312 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class150.field2381 = var312;
                                    int var313 = class206.field3279[var7 + 1];
                                    if ((var313 + 1) >= (class59.field962[class150.field2381].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class152.field2428 = 0;
                                    class94.field1460 = var313;
                                    class280.field4631 = class206.field3279[var7 + 2];
                                    class297.field4978 = class206.field3279[var7 + 3];
                                    int var314 = class206.field3279[var7 + 4];
                                    if (var314 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class72.field1124 = var314;
                                    int var315 = class206.field3279[var7 + 5];
                                    if (class59.field962[class72.field1124].length >> 1 <= var315 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class58.field934 = var315;
                                    class68.field1063 = 3;
                                    continue;
                                }
                                if (var446 == 5503) {
                                    class2.method6((byte) -125);
                                    continue;
                                }
                            } else if (var446 < 6100) {
                                if (var446 == 6001) {
                                    var7--;
                                    int var285 = class206.field3279[var7];
                                    if (var285 < 1) {
                                        var285 = 1;
                                    }
                                    if (var285 > 4) {
                                        var285 = 4;
                                    }
                                    class99.field1503 = var285;
                                    if (!class6.field146) {
                                        if (class99.field1503 == 1) {
                                            class284.method1898(0.9F);
                                        }
                                        if (class99.field1503 == 2) {
                                            class284.method1898(0.8F);
                                        }
                                        if (class99.field1503 == 3) {
                                            class284.method1898(0.7F);
                                        }
                                        if (class99.field1503 == 4) {
                                            class284.method1898(0.6F);
                                        }
                                    }
                                    class59.method439(1);
                                    if (!class6.field146) {
                                        class232.method1494(-85);
                                    }
                                    class212.method1336(128);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6002) {
                                    var7--;
                                    class118.method747(-30439, ~class206.field3279[var7] == -2);
                                    class222.method1404((byte) 79);
                                    class232.method1494(-71);
                                    if (class64.method479(301989888) && class29.field417) {
                                        if (class124.field1909 == null) {
                                            class124.field1909 = new byte[4][104][104];
                                        }
                                        byte var286 = (byte) (class132.field2012 - 4 & 0xFF);
                                        for (int var287 = 0; var287 < 4; var287++) {
                                            for (int var288 = 0; var288 < 104; var288++) {
                                                for (int var289 = 0; var289 < 104; var289++) {
                                                    class124.field1909[var287][var288][var289] = var286;
                                                }
                                            }
                                        }
                                    }
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6003) {
                                    var7--;
                                    class29.field417 = class206.field3279[var7] == 1;
                                    if (class64.method479(301989888) && class29.field417) {
                                        if (class124.field1909 == null) {
                                            class124.field1909 = new byte[4][104][104];
                                        }
                                        byte var290 = (byte) (class132.field2012 - 4 & 0xFF);
                                        for (int var291 = 0; var291 < 4; var291++) {
                                            for (int var292 = 0; var292 < 104; var292++) {
                                                for (int var293 = 0; var293 < 104; var293++) {
                                                    class124.field1909[var291][var292][var293] = var290;
                                                }
                                            }
                                        }
                                    }
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6005) {
                                    var7--;
                                    class198.field3168 = class206.field3279[var7] == 1;
                                    class232.method1494(-128);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6006) {
                                    var7--;
                                    class78.field1199 = class206.field3279[var7] == 1;
                                    ((class216) class284.field4692).method1364((byte) 109, !class78.field1199);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6007) {
                                    var7--;
                                    class281.field4640 = class206.field3279[var7] == 1;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6008) {
                                    var7--;
                                    class129.field1979 = class206.field3279[var7] == 1;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6009) {
                                    var7--;
                                    class185.field2934 = class206.field3279[var7] == 1;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6010) {
                                    var7--;
                                    class224.field3598 = class206.field3279[var7] == 1;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6011) {
                                    var7--;
                                    int var294 = class206.field3279[var7];
                                    if (var294 < 0 || var294 > 2) {
                                        var294 = 0;
                                    }
                                    class153.field2434 = var294;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6012) {
                                    class103.method677(0, 30359, 0);
                                    var7--;
                                    class6.field146 = class206.field3279[var7] == 1;
                                    if (class6.field146) {
                                        class284.method1898(0.7F);
                                    } else {
                                        if (class99.field1503 == 1) {
                                            class284.method1898(0.9F);
                                        }
                                        if (class99.field1503 == 2) {
                                            class284.method1898(0.8F);
                                        }
                                        if (class99.field1503 == 3) {
                                            class284.method1898(0.7F);
                                        }
                                        if (class99.field1503 == 4) {
                                            class284.method1898(0.6F);
                                        }
                                    }
                                    class232.method1494(-97);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6014) {
                                    var7--;
                                    class10.field184 = class206.field3279[var7] == 1;
                                    class232.method1494(-54);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6015) {
                                    var7--;
                                    class14.field226 = class206.field3279[var7] == 1;
                                    class59.method439(1);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6016) {
                                    var7--;
                                    int var295 = class206.field3279[var7];
                                    if (var295 < 0 || var295 > 2) {
                                        var295 = 0;
                                    }
                                    class10.field183 = var295;
                                    class75.field1176 = true;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6017) {
                                    var7--;
                                    class244.field3943 = class206.field3279[var7] == 1;
                                    class63.method470((byte) 4);
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6018) {
                                    var7--;
                                    int var296 = class206.field3279[var7];
                                    if (var296 < 0) {
                                        var296 = 0;
                                    }
                                    if (var296 > 127) {
                                        var296 = 127;
                                    }
                                    class4.field120 = var296;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6019) {
                                    var7--;
                                    int var297 = class206.field3279[var7];
                                    if (var297 < 0) {
                                        var297 = 0;
                                    }
                                    if (var297 > 255) {
                                        var297 = 255;
                                    }
                                    if (class78.field1205 != var297) {
                                        if (class78.field1205 == 0 && class250.field4042 != -1) {
                                            class55.method407(class250.field4042, false, var297, (byte) 127, 0, class11.field193);
                                            class196.field3151 = false;
                                        } else if (var297 == 0) {
                                            class103.method678(arg1);
                                            class196.field3151 = false;
                                        } else {
                                            class231.method1492(var297, 117);
                                        }
                                        class78.field1205 = var297;
                                    }
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6020) {
                                    var7--;
                                    int var298 = class206.field3279[var7];
                                    if (var298 < 0) {
                                        var298 = 0;
                                    }
                                    if (var298 > 127) {
                                        var298 = 127;
                                    }
                                    class184.field2916 = var298;
                                    class270.method1794(class220.field3533, 1);
                                    class295.field4914 = false;
                                    continue;
                                }
                                if (var446 == 6021) {
                                    var7--;
                                    class260.field4166 = class206.field3279[var7] == 1;
                                    continue;
                                }
                            } else if (var446 < 6200) {
                                if (var446 == 6101) {
                                    class206.field3279[var7++] = class99.field1503;
                                    continue;
                                }
                                if (var446 == 6102) {
                                    class206.field3279[var7++] = class64.method479(301989888) ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6103) {
                                    class206.field3279[var7++] = class29.field417 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6105) {
                                    class206.field3279[var7++] = class198.field3168 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6106) {
                                    class206.field3279[var7++] = class78.field1199 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6107) {
                                    class206.field3279[var7++] = class281.field4640 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6108) {
                                    class206.field3279[var7++] = class129.field1979 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6109) {
                                    class206.field3279[var7++] = class185.field2934 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6110) {
                                    class206.field3279[var7++] = class224.field3598 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6111) {
                                    class206.field3279[var7++] = class153.field2434;
                                    continue;
                                }
                                if (var446 == 6112) {
                                    class206.field3279[var7++] = class6.field146 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6114) {
                                    class206.field3279[var7++] = class10.field184 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6115) {
                                    class206.field3279[var7++] = class14.field226 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6116) {
                                    class206.field3279[var7++] = class10.field183;
                                    continue;
                                }
                                if (var446 == 6117) {
                                    class206.field3279[var7++] = class244.field3943 ? 1 : 0;
                                    continue;
                                }
                                if (var446 == 6118) {
                                    class206.field3279[var7++] = class4.field120;
                                    continue;
                                }
                                if (var446 == 6119) {
                                    class206.field3279[var7++] = class78.field1205;
                                    continue;
                                }
                                if (var446 == 6120) {
                                    class206.field3279[var7++] = class184.field2916;
                                    continue;
                                }
                                if (var446 == 6121) {
                                    class206.field3279[var7++] = class264.field4310 ? 1 : 0;
                                    continue;
                                }
                            } else if (var446 < 6300) {
                                if (var446 == 6200) {
                                    var7 -= 2;
                                    class295.field4913 = (short) class206.field3279[var7];
                                    if (class295.field4913 <= 0) {
                                        class295.field4913 = 256;
                                    }
                                    class217.field3505 = (short) class206.field3279[var7 + 1];
                                    if (class217.field3505 <= 0) {
                                        class217.field3505 = 205;
                                    }
                                    continue;
                                }
                                if (var446 == 6201) {
                                    var7 -= 2;
                                    class167.field2641 = (short) class206.field3279[var7];
                                    if (class167.field2641 <= 0) {
                                        class167.field2641 = 256;
                                    }
                                    class255.field4102 = (short) class206.field3279[var7 + 1];
                                    if (class255.field4102 <= 0) {
                                        class255.field4102 = 320;
                                    }
                                    continue;
                                }
                                if (var446 == 6202) {
                                    var7 -= 4;
                                    class214.field3408 = (short) class206.field3279[var7];
                                    if (class214.field3408 <= 0) {
                                        class214.field3408 = 1;
                                    }
                                    class102.field1553 = (short) class206.field3279[var7 + 1];
                                    if (class102.field1553 <= 0) {
                                        class102.field1553 = 32767;
                                    } else if (class102.field1553 < class214.field3408) {
                                        class102.field1553 = class214.field3408;
                                    }
                                    class240.field3853 = (short) class206.field3279[var7 + 2];
                                    if (class240.field3853 <= 0) {
                                        class240.field3853 = 1;
                                    }
                                    class156.field2487 = (short) class206.field3279[var7 + 3];
                                    if (class156.field2487 <= 0) {
                                        class156.field2487 = 32767;
                                    } else if (class240.field3853 > class156.field2487) {
                                        class156.field2487 = class240.field3853;
                                    }
                                    continue;
                                }
                                if (var446 == 6203) {
                                    class42.method323(false, class202.field3208.field2180, 0, class202.field3208.field2057, 0, 81);
                                    class206.field3279[var7++] = class90.field1382;
                                    class206.field3279[var7++] = class249.field4028;
                                    continue;
                                }
                                if (var446 == 6204) {
                                    class206.field3279[var7++] = class167.field2641;
                                    class206.field3279[var7++] = class255.field4102;
                                    continue;
                                }
                                if (var446 == 6205) {
                                    class206.field3279[var7++] = class295.field4913;
                                    class206.field3279[var7++] = class217.field3505;
                                    continue;
                                }
                            } else if (var446 < 6400) {
                                if (var446 == 6300) {
                                    class206.field3279[var7++] = (int) (class110.method707((byte) 109) / 60000L);
                                    continue;
                                }
                                if (var446 == 6301) {
                                    class206.field3279[var7++] = (int) (class110.method707((byte) 98) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var446 == 6302) {
                                    var7 -= 3;
                                    int var299 = class206.field3279[var7];
                                    int var300 = class206.field3279[var7 + 1];
                                    int var301 = class206.field3279[var7 + 2];
                                    class154.field2462.clear();
                                    class154.field2462.set(11, 12);
                                    class154.field2462.set(var301, var300, var299);
                                    class206.field3279[var7++] = (int) (class154.field2462.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var446 == 6303) {
                                    class154.field2462.clear();
                                    class154.field2462.setTime(new Date(class110.method707((byte) 105)));
                                    class206.field3279[var7++] = class154.field2462.get(1);
                                    continue;
                                }
                                if (var446 == 6304) {
                                    boolean var302 = true;
                                    var7--;
                                    int var303 = class206.field3279[var7];
                                    if (var303 < 0) {
                                        var302 = ((var303 + 1) % 4) == 0;
                                    } else if (var303 < 1582) {
                                        var302 = var303 % 4 == 0;
                                    } else if (var303 % 4 != 0) {
                                        var302 = false;
                                    } else if ((var303 % 100) != 0) {
                                        var302 = true;
                                    } else if ((var303 % 400) != 0) {
                                        var302 = false;
                                    }
                                    class206.field3279[var7++] = var302 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var446 == 4500) {
                            var7 -= 2;
                            int var327 = class206.field3279[var7];
                            int var328 = class206.field3279[var7 + 1];
                            class86 var329 = class197.method1265(var328, 84);
                            if (var329.method580(8)) {
                                class184.field2913[var6++] = class82.method561(var327, (byte) -127).method1162(var329.field1296, var328, 100);
                            } else {
                                class206.field3279[var7++] = class82.method561(var327, (byte) -113).method1164(100, var328, var329.field1299);
                            }
                            continue;
                        }
                    } else {
                        class134 var422;
                        if (var446 < 2000) {
                            var422 = var46 ? class252.field4049 : class111.field1699;
                        } else {
                            var7--;
                            var422 = method153(1, class206.field3279[var7]);
                            var446 -= 1000;
                        }
                        if (var446 == 1300) {
                            var7--;
                            int var423 = class206.field3279[var7] - 1;
                            if (var423 >= 0 && var423 <= 9) {
                                var6--;
                                var422.method897(var423, 10, class184.field2913[var6]);
                                continue;
                            }
                            var6--;
                            continue;
                        }
                        if (var446 == 1301) {
                            var7 -= 2;
                            int var424 = class206.field3279[var7 + 1];
                            int var425 = class206.field3279[var7];
                            var422.field2106 = class171.method1083(var425, var424, 127);
                            continue;
                        }
                        if (var446 == 1302) {
                            var7--;
                            var422.field2176 = class206.field3279[var7] == 1;
                            continue;
                        }
                        if (var446 == 1303) {
                            var7--;
                            var422.field2185 = class206.field3279[var7];
                            continue;
                        }
                        if (var446 == 1304) {
                            var7--;
                            var422.field2177 = class206.field3279[var7];
                            continue;
                        }
                        if (var446 == 1305) {
                            var6--;
                            var422.field2137 = class184.field2913[var6];
                            continue;
                        }
                        if (var446 == 1306) {
                            var6--;
                            var422.field2117 = class184.field2913[var6];
                            continue;
                        }
                        if (var446 == 1307) {
                            var422.field2103 = null;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var445) {
            if (var5.field249 == null) {
                if (class289.field4744 != 0) {
                    class54.method401((byte) -109, class168.field2649, 0, class208.field3310);
                }
                class87.method591("CS2 - scr:" + var5.field1218 + " op:" + var11, var445, 58);
            } else {
                class119 var441 = class78.method546((byte) -81, 30);
                var441.method777(class146.field2339, -106).method777(var5.field249, 66);
                for (int var442 = class296.field4934 - 1; var442 >= 0; var442--) {
                    var441.method777(class287.field4725, 82).method777(class102.field1555[var442].field442.field249, 104);
                }
                if (var11 == 40) {
                    int var443 = var10[var8];
                    var441.method777(class24.field368, 126).method777(class234.method1506(var443, (byte) -79), 110);
                }
                if (class289.field4744 != 0) {
                    class54.method401((byte) -101, class170.method1074(new class119[] { class23.field341, var5.field249 }, -72), 0, class208.field3310);
                }
                class87.method591("CS2 - scr:" + var5.field1218 + " op:" + var11 + new String(var441.method756(false)), var445, 58);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 5417)
    public static void method155(int arg0) {
        field291 = null;
        if (arg0 >= -88) {
            field291 = (class119) null;
        }
        field271 = null;
        field288 = null;
        field287 = null;
        field269 = null;
        field278 = null;
        field266 = null;
        field290 = (byte[][]) null;
        field265 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)I", line = 5435)
    public static final int method156(int arg0, byte arg1, int arg2) {
        field277++;
        if (arg1 == 123) {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 5462)
    public final void method157(byte arg0) {
        int var2 = 86 / ((arg0 + 62) / 60);
        if (this.field282 != null) {
            for (int var3 = 0; var3 < this.field282.length; var3++) {
                this.field282[var3] = class156.method998(this.field282[var3], 32768);
            }
        }
        field262++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)I", line = 5480)
    private final int method158(int arg0, int arg1, int arg2) {
        field275++;
        if (this.field283 == null || arg1 < 0 || this.field283.length < arg1) {
            return -1;
        } else {
            int var4 = -74 / ((29 - arg0) / 59);
            return this.field267[arg1] == null || arg2 < 0 || arg2 > this.field267[arg1].length ? -1 : this.field267[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)I", line = 5504)
    private final int method159(boolean arg0) {
        if (!arg0) {
            field286 = 57;
        }
        field285++;
        return this.field283 == null ? 0 : this.field283.length;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfj;)Lck;", line = 5523)
    public final class119 method160(int arg0, class3 arg1) {
        field274++;
        class119 var3 = class78.method546((byte) -58, 80);
        if (arg0 != -5418) {
            return (class119) null;
        }
        if (this.field283 != null) {
            for (int var4 = 0; var4 < this.field283.length; var4++) {
                var3.method777(this.field263[var4], 59);
                var3.method777(class237.method1517(this.field267[var4], arg1.method49(87, class288.field4741[this.field283[var4]]), this.field283[var4], -1), -5);
            }
        }
        var3.method777(this.field263[this.field263.length - 1], 12);
        return var3.method753(arg0 + 5418);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfj;[I)V", line = 5551)
    private final void method161(int arg0, class3 arg1, int[] arg2) {
        field281++;
        if (this.field283 == null || arg0 != 1608) {
            return;
        }
        for (int var4 = 0; this.field283.length > var4 && arg2.length > var4; var4++) {
            int var5 = class201.field3198[this.method164(var4, arg0 ^ 0xFFFFF9B6)];
            if (var5 > 0) {
                arg1.method30(var5, (long) arg2[var4], 30114);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLeb;)V", line = 5579)
    public static final void method162(byte arg0, class297 arg1) {
        field284++;
        if (arg1.field4979 == 0) {
            return;
        }
        if (arg1.field4952 != -1 && arg1.field4952 < 32768) {
            class163 var2 = class70.field1103[arg1.field4952];
            if (var2 != null) {
                int var3 = arg1.field4949 - var2.field4949;
                int var4 = arg1.field4991 - var2.field4991;
                if (var3 != 0 || var4 != 0) {
                    arg1.field4946 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4952 >= 32768) {
            int var5 = arg1.field4952 - 32768;
            if (class262.field4259 == var5) {
                var5 = 2047;
            }
            class292 var6 = class23.field346[var5];
            if (var6 != null) {
                int var7 = arg1.field4949 - var6.field4949;
                int var8 = arg1.field4991 - var6.field4991;
                if (var7 != 0 || var8 != 0) {
                    arg1.field4946 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field5009 != 0 || arg1.field4969 != 0) && (arg1.field4990 == 0 || arg1.field4947 > 0)) {
            int var9 = arg1.field4956 * 64 + arg1.field4949 - ((arg1.field5009 - class30.field421 - class30.field421) * 64) - 64;
            int var10 = arg1.field4956 * 64 + arg1.field4991 - ((arg1.field4969 - class189.field2995 - class189.field2995) * 64) - 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field4946 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field5009 = 0;
            arg1.field4969 = 0;
        }
        int var11 = arg1.field4946 - arg1.field5007 & 0x7FF;
        if (arg0 > -32) {
            return;
        }
        if (var11 == 0) {
            arg1.field5012 = 0;
            return;
        }
        arg1.field5012++;
        if (var11 > 1024) {
            arg1.field5007 -= arg1.field4979;
            boolean var12 = true;
            if (arg1.field4979 > var11 || var11 > 2048 - arg1.field4979) {
                var12 = false;
                arg1.field5007 = arg1.field4946;
            }
            if (arg1.field4976 == arg1.field4948 && (arg1.field5012 > 25 || var12)) {
                if (arg1.field4999 == -1) {
                    arg1.field4948 = arg1.field4982;
                } else {
                    arg1.field4948 = arg1.field4999;
                }
            }
        } else {
            arg1.field5007 += arg1.field4979;
            boolean var13 = true;
            if (arg1.field4979 > var11 || var11 > 2048 - arg1.field4979) {
                var13 = false;
                arg1.field5007 = arg1.field4946;
            }
            if (arg1.field4976 == arg1.field4948 && (arg1.field5012 > 25 || var13)) {
                if (arg1.field4943 == -1) {
                    arg1.field4948 = arg1.field4982;
                } else {
                    arg1.field4948 = arg1.field4943;
                }
            }
        }
        arg1.field5007 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 5720)
    public static final void method163(int arg0) {
        field270++;
        class241.field3870 = class246.method1598(8, 35, 4, -50, 2048, true, 0.4F, 8);
        if (arg0 != 3) {
            field272 = -82;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I", line = 5738)
    private final int method164(int arg0, int arg1) {
        if (arg1 != -2) {
            method156(58, (byte) 4, -42);
        }
        field273++;
        return this.field283 == null || arg0 < 0 || arg0 > this.field283.length ? -1 : this.field283[arg0];
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Lck;", line = 5759)
    private final class119 method165(int arg0) {
        field276++;
        class119 var2 = class78.method546((byte) -95, 80);
        if (this.field263 == null) {
            return class138.field2217;
        }
        var2.method777(this.field263[0], 91);
        for (int var3 = arg0; var3 < this.field263.length; var3++) {
            var2.method777(class106.field1638, -115);
            var2.method777(this.field263[var3], 111);
        }
        return var2.method753(0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lfj;Z)V", line = 5788)
    public final void method166(class3 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method64((byte) 12);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field280++;
                return;
            }
            this.method167(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfj;I)V", line = 5827)
    private final void method167(int arg0, class3 arg1, int arg2) {
        if (arg0 == 1) {
            this.field263 = arg1.method41((byte) -127).method771(arg2 - 256, 60);
        } else if (arg0 == 2) {
            int var4 = arg1.method64((byte) -81);
            this.field282 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field282[var5] = arg1.method63((byte) 1);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method64((byte) 71);
            this.field283 = new int[var6];
            this.field267 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method63((byte) 1);
                this.field283[var7] = var8;
                this.field267[var7] = new int[class129.field1985[var8]];
                for (int var9 = 0; var9 < class129.field1985[var8]; var9++) {
                    this.field267[var7][var9] = arg1.method63((byte) 1);
                }
            }
        }
        field268++;
        if (arg2 != 0) {
            field265 = (class119) null;
        }
    }
}
