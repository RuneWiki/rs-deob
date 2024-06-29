import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lvc;")
    public static class137 field1341 = class45.method325("Wordpack geladen)3", -46);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lvc;")
    public static class137 field1339 = class45.method325("redstone1", -46);

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
    public static int[] field1344 = new int[32];

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lvc;")
    public static class137 field1346 = class45.method325("backright2", -46);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[Z")
    public static boolean[] field1342 = new boolean[112];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
    public static final int method459(boolean arg0) {
        if (arg0) {
            method464(null, null, -35, -37, null, 2);
        }
        field1337++;
        int var1 = class32.method241(class44.field947, (byte) -119, class28.field627, class1.field3);
        return var1 - class7.field142 >= 800 || (class70.field1490[class28.field627][class44.field947 >> 7][class1.field3 >> 7] & 0x4) == 0 ? 3 : class28.field627;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method460(int arg0) {
        field1340++;
        if (class7.field145 == 0) {
            return;
        }
        class145 var1 = class75.field1695;
        if (arg0 <= 101) {
            return;
        }
        int var2 = 0;
        if (class49.field1107 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class37.field810[var3] != null) {
                int var4 = class37.field830[var3];
                byte var5 = 0;
                class137 var6 = class12.field274[var3];
                if (var6 != null && var6.method1014(class59.field1266, (byte) 63)) {
                    var6 = var6.method1035(1, 5);
                    var5 = 1;
                }
                if (var6 != null && var6.method1014(class84.field1907, (byte) 67)) {
                    var5 = 2;
                    var6 = var6.method1035(1, 5);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class71.field1510 == 0 || class71.field1510 == 1 && class19.method169(-1, var6))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var2++;
                    var1.method1131(class104.field2413, var7, var8, 0);
                    var1.method1131(class104.field2413, var7, var8 - 1, 65535);
                    int var9 = var7 + var1.method1130(class104.field2413);
                    int var10 = var9 + var1.method1136(32);
                    if (var5 == 1) {
                        class86.field2047[0].method394(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class86.field2047[1].method394(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method1131(class88.method666(-27, new class137[] { var6, class78.field1745, class37.field810[var3] }), var10, var8, 0);
                    var1.method1131(class88.method666(-61, new class137[] { var6, class78.field1745, class37.field810[var3] }), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class71.field1510 < 2) {
                    int var11 = 329 - var2 * 13;
                    var1.method1131(class37.field810[var3], 4, var11, 0);
                    var2++;
                    var1.method1131(class37.field810[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class71.field1510 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method1131(class88.method666(127, new class137[] { class34.field732, class70.field1485, var6, class78.field1745, class37.field810[var3] }), 4, var12, 0);
                    var2++;
                    var1.method1131(class88.method666(117, new class137[] { class34.field732, class70.field1485, var6, class78.field1745, class37.field810[var3] }), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILme;[Ljava/lang/Object;IBILme;)V")
    public static final void method461(int arg0, class85 arg1, Object[] arg2, int arg3, byte arg4, int arg5, class85 arg6) {
        field1347++;
        int var7 = (Integer) arg2[0];
        class24 var8 = class56.method386(var7, 2673);
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int[] var12 = var8.field578;
        int[] var13 = var8.field570;
        byte var14 = -1;
        try {
            class82.field1841 = new int[var8.field565];
            int var15 = 0;
            class8.field187 = new class137[var8.field564];
            if (arg4 >= 47) {
                int var16 = 0;
                for (int var17 = 1; var17 < arg2.length; var17++) {
                    if (arg2[var17] instanceof Integer) {
                        int var18 = (Integer) arg2[var17];
                        if (var18 == -2147483647) {
                            var18 = arg5;
                        }
                        if (var18 == -2147483646) {
                            var18 = arg0;
                        }
                        if (var18 == -2147483645) {
                            var18 = arg6 == null ? -1 : arg6.field1910;
                        }
                        if (var18 == -2147483644) {
                            var18 = arg3;
                        }
                        if (var18 == -2147483643) {
                            var18 = arg6 == null ? -1 : arg6.field1920;
                        }
                        if (var18 == -2147483642) {
                            var18 = arg1 == null ? -1 : arg1.field1910;
                        }
                        if (var18 == -2147483641) {
                            var18 = arg1 == null ? -1 : arg1.field1920;
                        }
                        class82.field1841[var16++] = var18;
                    } else if (arg2[var17] instanceof class137) {
                        class8.field187[var15++] = (class137) arg2[var17];
                    }
                }
                int var19 = 0;
                label1219: while (true) {
                    var19++;
                    if (var19 > 200000) {
                        throw new RuntimeException("slow");
                    }
                    var10++;
                    int var177 = var12[var10];
                    if (var177 < 100) {
                        if (var177 == 0) {
                            class29.field644[var9++] = var13[var10];
                            continue;
                        }
                        if (var177 == 1) {
                            int var20 = var13[var10];
                            class29.field644[var9++] = class28.field631[var20];
                            continue;
                        }
                        if (var177 == 2) {
                            int var21 = var13[var10];
                            var9--;
                            class28.field631[var21] = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 3) {
                            class89.field2126[var11++] = var8.field571[var10];
                            continue;
                        }
                        if (var177 == 6) {
                            var10 += var13[var10];
                            continue;
                        }
                        if (var177 == 7) {
                            var9 -= 2;
                            if (class29.field644[var9 + 1] != class29.field644[var9]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 8) {
                            var9 -= 2;
                            if (class29.field644[var9 + 1] == class29.field644[var9]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 9) {
                            var9 -= 2;
                            if (class29.field644[var9] < class29.field644[var9 + 1]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 10) {
                            var9 -= 2;
                            if (class29.field644[var9] > class29.field644[var9 + 1]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 21) {
                            if (class58.field1241 == 0) {
                                return;
                            }
                            class129 var22 = class105.field2437[--class58.field1241];
                            var10 = var22.field3022;
                            class82.field1841 = var22.field3031;
                            class8.field187 = var22.field3034;
                            var8 = var22.field3021;
                            var12 = var8.field578;
                            var13 = var8.field570;
                            continue;
                        }
                        if (var177 == 25) {
                            int var23 = var13[var10];
                            class29.field644[var9++] = class123.method921(var23, 101);
                            continue;
                        }
                        if (var177 == 27) {
                            int var24 = var13[var10];
                            var9--;
                            class72.method502(var24, (byte) 87, class29.field644[var9]);
                            continue;
                        }
                        if (var177 == 31) {
                            var9 -= 2;
                            if (class29.field644[var9 + 1] >= class29.field644[var9]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 32) {
                            var9 -= 2;
                            if (class29.field644[var9] >= class29.field644[var9 + 1]) {
                                var10 += var13[var10];
                            }
                            continue;
                        }
                        if (var177 == 33) {
                            class29.field644[var9++] = class82.field1841[var13[var10]];
                            continue;
                        }
                        int var10001;
                        if (var177 == 34) {
                            var10001 = var13[var10];
                            var9--;
                            class82.field1841[var10001] = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 35) {
                            class89.field2126[var11++] = class8.field187[var13[var10]];
                            continue;
                        }
                        if (var177 == 36) {
                            var10001 = var13[var10];
                            var11--;
                            class8.field187[var10001] = class89.field2126[var11];
                            continue;
                        }
                        if (var177 == 37) {
                            int var25 = var13[var10];
                            var11 -= var25;
                            class137 var26 = class125.method933(-125, var25, class89.field2126, var11);
                            class89.field2126[var11++] = var26;
                            continue;
                        }
                        if (var177 == 38) {
                            var9--;
                            continue;
                        }
                        if (var177 == 39) {
                            var11--;
                            continue;
                        }
                        if (var177 == 40) {
                            int var27 = var13[var10];
                            class24 var28 = class56.method386(var27, 2673);
                            int[] var29 = new int[var28.field565];
                            class137[] var30 = new class137[var28.field564];
                            for (int var31 = 0; var31 < var28.field576; var31++) {
                                var29[var31] = class29.field644[var9 + var31 - var28.field576];
                            }
                            for (int var32 = 0; var32 < var28.field577; var32++) {
                                var30[var32] = class89.field2126[var11 + var32 - var28.field577];
                            }
                            var11 -= var28.field577;
                            var9 -= var28.field576;
                            class129 var33 = new class129();
                            var33.field3022 = var10;
                            var10 = -1;
                            var33.field3034 = class8.field187;
                            var33.field3031 = class82.field1841;
                            var33.field3021 = var8;
                            var8 = var28;
                            class105.field2437[class58.field1241++] = var33;
                            var13 = var28.field570;
                            var12 = var28.field578;
                            class82.field1841 = var29;
                            class8.field187 = var30;
                            continue;
                        }
                        if (var177 == 42) {
                            class29.field644[var9++] = class92.field2176[var13[var10]];
                            continue;
                        }
                        if (var177 == 43) {
                            var10001 = var13[var10];
                            var9--;
                            class92.field2176[var10001] = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 44) {
                            int var34 = var13[var10] >> 16;
                            int var35 = var13[var10] & 0xFFFF;
                            var9--;
                            int var36 = class29.field644[var9];
                            if (var36 >= 0 && var36 <= 5000) {
                                byte var37 = -1;
                                if (var35 == 105) {
                                    var37 = 0;
                                }
                                class45.field1015[var34] = var36;
                                int var38 = 0;
                                while (true) {
                                    if (var38 >= var36) {
                                        continue label1219;
                                    }
                                    class125.field2892[var34][var38] = var37;
                                    var38++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var177 == 45) {
                            int var39 = var13[var10];
                            var9--;
                            int var40 = class29.field644[var9];
                            if (var40 >= 0 && var40 < class45.field1015[var39]) {
                                class29.field644[var9++] = class125.field2892[var39][var40];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var177 == 46) {
                            var9 -= 2;
                            int var41 = var13[var10];
                            int var42 = class29.field644[var9];
                            if (var42 >= 0 && var42 < class45.field1015[var41]) {
                                class125.field2892[var41][var42] = class29.field644[var9 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                    }
                    boolean var43;
                    if (var13[var10] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    if (var177 < 1000) {
                        if (var177 == 100) {
                            var9 -= 3;
                            int var44 = class29.field644[var9 + 2];
                            int var45 = class29.field644[var9 + 1];
                            int var46 = class29.field644[var9];
                            if (var45 == 0) {
                                throw new RuntimeException();
                            }
                            class85 var47 = class142.method1093(256, var46);
                            if (var47.field1980 == null) {
                                var47.field1980 = new class85[var44 + 1];
                            }
                            if (var44 >= var47.field1980.length) {
                                class85[] var48 = new class85[var44 + 1];
                                for (int var49 = 0; var49 < var47.field1980.length; var49++) {
                                    var48[var49] = var47.field1980[var49];
                                }
                                var47.field1980 = var48;
                            }
                            if (var44 > 0 && var47.field1980[var44 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var44 - 1));
                            }
                            class85 var50 = new class85();
                            var50.field1967 = true;
                            var50.field1945 = var50.field1910 = var47.field1910;
                            var50.field1952 = var45;
                            var50.field1920 = var44;
                            var47.field1980[var44] = var50;
                            if (var43) {
                                class7.field154 = var50;
                            } else {
                                class111.field2645 = var50;
                            }
                            class19.method165((byte) 127, var47);
                            continue;
                        }
                        if (var177 == 101) {
                            class85 var51 = var43 ? class7.field154 : class111.field2645;
                            class85 var52 = class142.method1093(256, var51.field1910);
                            var52.field1980[var51.field1920] = null;
                            class19.method165((byte) 127, var52);
                            continue;
                        }
                        if (var177 == 102) {
                            var9--;
                            class85 var53 = class142.method1093(256, class29.field644[var9]);
                            var53.field1980 = null;
                            class19.method165((byte) 127, var53);
                            continue;
                        }
                        if (var177 == 200) {
                            var9 -= 2;
                            int var54 = class29.field644[var9];
                            int var55 = class29.field644[var9 + 1];
                            class85 var56 = class28.method223(var55, 31229, var54);
                            if (var56 != null && var55 != -1) {
                                class29.field644[var9++] = 1;
                                if (var43) {
                                    class7.field154 = var56;
                                } else {
                                    class111.field2645 = var56;
                                }
                                continue;
                            }
                            class29.field644[var9++] = 0;
                            continue;
                        }
                    } else if (var177 >= 1000 && var177 < 1100 || var177 >= 2000 && var177 < 2100) {
                        class85 var57;
                        if (var177 < 2000) {
                            var57 = var43 ? class7.field154 : class111.field2645;
                        } else {
                            var9--;
                            var57 = class142.method1093(256, class29.field644[var9]);
                            var177 -= 1000;
                        }
                        class19.method165((byte) 127, var57);
                        if (var177 == 1000) {
                            var9 -= 2;
                            var57.field1985 = class29.field644[var9];
                            var57.field2007 = class29.field644[var9 + 1];
                            continue;
                        }
                        if (var177 == 1001) {
                            var9 -= 2;
                            var57.field1929 = class29.field644[var9];
                            var57.field1975 = class29.field644[var9 + 1];
                            continue;
                        }
                        if (var177 == 1003) {
                            var9--;
                            var57.field1992 = class29.field644[var9] == 1;
                            continue;
                        }
                    } else if (var177 >= 1100 && var177 < 1200 || !(var177 < 2100 || var177 >= 2200)) {
                        class85 var174;
                        if (var177 >= 2000) {
                            var9--;
                            var174 = class142.method1093(256, class29.field644[var9]);
                            var177 -= 1000;
                        } else {
                            var174 = var43 ? class7.field154 : class111.field2645;
                        }
                        class19.method165((byte) 127, var174);
                        if (var177 == 1100) {
                            var9 -= 2;
                            var174.field1932 = class29.field644[var9];
                            if (var174.field1932 > var174.field1912 - var174.field1929) {
                                var174.field1932 = var174.field1912 - var174.field1929;
                            }
                            if (var174.field1932 < 0) {
                                var174.field1932 = 0;
                            }
                            var174.field1927 = class29.field644[var9 + 1];
                            if (var174.field1927 > var174.field1993 - var174.field1975) {
                                var174.field1927 = var174.field1993 - var174.field1975;
                            }
                            if (var174.field1927 < 0) {
                                var174.field1927 = 0;
                            }
                            continue;
                        }
                        if (var177 == 1101) {
                            var9--;
                            var174.field1931 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1102) {
                            var9--;
                            var174.field1974 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1103) {
                            var9--;
                            var174.field1926 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1104) {
                            var9--;
                            var174.field1964 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1105) {
                            var9--;
                            var174.field2001 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1106) {
                            var9--;
                            var174.field2033 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1107) {
                            var9--;
                            var174.field2006 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1108) {
                            var174.field1916 = 1;
                            var9--;
                            var174.field2010 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1109) {
                            var9 -= 6;
                            var174.field1942 = class29.field644[var9];
                            var174.field2000 = class29.field644[var9 + 1];
                            var174.field2035 = class29.field644[var9 + 2];
                            var174.field1991 = class29.field644[var9 + 3];
                            var174.field1979 = class29.field644[var9 + 4];
                            var174.field1994 = class29.field644[var9 + 5];
                            continue;
                        }
                        if (var177 == 1110) {
                            var9--;
                            var174.field1949 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1111) {
                            var9--;
                            var174.field2022 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1112) {
                            var11--;
                            var174.field1963 = class89.field2126[var11];
                            continue;
                        }
                        if (var177 == 1113) {
                            var9--;
                            var174.field1966 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1114) {
                            var9 -= 3;
                            var174.field1990 = class29.field644[var9];
                            var174.field1973 = class29.field644[var9 + 1];
                            var174.field1911 = class29.field644[var9 + 2];
                            continue;
                        }
                        if (var177 == 1115) {
                            var9--;
                            var174.field2004 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1116) {
                            var9--;
                            var174.field1958 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1117) {
                            var9--;
                            var174.field1989 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1118) {
                            var9--;
                            var174.field2032 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1119) {
                            var9--;
                            var174.field1978 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1120) {
                            var9 -= 2;
                            var174.field1912 = class29.field644[var9];
                            var174.field1993 = class29.field644[var9 + 1];
                            continue;
                        }
                    } else if (var177 >= 1200 && var177 < 1300 || !(var177 < 2200 || var177 >= 2300)) {
                        class85 var58;
                        if (var177 >= 2000) {
                            var177 -= 1000;
                            var9--;
                            var58 = class142.method1093(256, class29.field644[var9]);
                        } else {
                            var58 = var43 ? class7.field154 : class111.field2645;
                        }
                        class19.method165((byte) 127, var58);
                        if (var177 == 1200) {
                            var9 -= 2;
                            int var59 = class29.field644[var9];
                            int var60 = class29.field644[var9 + 1];
                            var58.field1960 = var60;
                            var58.field1982 = var59;
                            class141 var61 = class39.method286((byte) 122, var59);
                            var58.field2035 = var61.field3272;
                            var58.field1994 = var61.field3306;
                            var58.field1991 = var61.field3320;
                            var58.field1942 = var61.field3264;
                            var58.field2000 = var61.field3284;
                            if (var58.field1929 > 0) {
                                var58.field1994 = var58.field1994 * 32 / var58.field1929;
                            }
                            var58.field1979 = var61.field3275;
                            continue;
                        }
                        if (var177 == 1201) {
                            var58.field1916 = 2;
                            var9--;
                            var58.field2010 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1202) {
                            var58.field1916 = 3;
                            var58.field2010 = class104.field2412.field2891.method404((byte) -9);
                            continue;
                        }
                    } else if (var177 >= 1300 && var177 < 1400 || var177 >= 2300 && var177 < 2400) {
                        class85 var170;
                        if (var177 < 2000) {
                            var170 = var43 ? class7.field154 : class111.field2645;
                        } else {
                            var177 -= 1000;
                            var9--;
                            var170 = class142.method1093(256, class29.field644[var9]);
                        }
                        if (var177 == 1300) {
                            var9--;
                            int var171 = class29.field644[var9] - 1;
                            if (var171 >= 0 && var171 <= 9) {
                                var11--;
                                var170.method617(var171, class89.field2126[var11], 1);
                                continue;
                            }
                            var11--;
                            continue;
                        }
                        if (var177 == 1301) {
                            var9 -= 2;
                            int var172 = class29.field644[var9];
                            int var173 = class29.field644[var9 + 1];
                            var170.field1984 = class28.method223(var173, 31229, var172);
                            continue;
                        }
                        if (var177 == 1302) {
                            var9--;
                            var170.field1999 = class29.field644[var9] == 1;
                            continue;
                        }
                        if (var177 == 1303) {
                            var9--;
                            var170.field1935 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1304) {
                            var9--;
                            var170.field1941 = class29.field644[var9];
                            continue;
                        }
                        if (var177 == 1305) {
                            var11--;
                            var170.field1934 = class89.field2126[var11];
                            continue;
                        }
                        if (var177 == 1306) {
                            var11--;
                            var170.field2013 = class89.field2126[var11];
                            continue;
                        }
                    } else {
                        if (var177 >= 1400 && var177 < 1500 || var177 >= 2400 && var177 < 2500) {
                            class85 var166;
                            if (var177 < 2000) {
                                var166 = var43 ? class7.field154 : class111.field2645;
                            } else {
                                var9--;
                                var166 = class142.method1093(256, class29.field644[var9]);
                                var177 -= 1000;
                            }
                            var11--;
                            class137 var167 = class89.field2126[var11];
                            Object[] var168 = new Object[var167.method997(-48) + 1];
                            for (int var169 = var168.length - 1; var169 >= 1; var169--) {
                                if (var167.method1017(var169 - 1, 116) == 115) {
                                    var11--;
                                    var168[var169] = class89.field2126[var11];
                                } else {
                                    var9--;
                                    var168[var169] = Integer.valueOf(class29.field644[var9]);
                                }
                            }
                            var9--;
                            var168[0] = Integer.valueOf(class29.field644[var9]);
                            if (var177 == 1411) {
                                var166.field1919 = var168;
                            }
                            if (var177 == 1403) {
                                var166.field1977 = var168;
                            }
                            if (var177 == 1413) {
                                var166.field1968 = var168;
                            }
                            if (var177 == 1405) {
                                var166.field1946 = var168;
                            }
                            if (var177 == 1407) {
                                var166.field2015 = var168;
                            }
                            if (var177 == 1402) {
                                var166.field1987 = var168;
                            }
                            if (var177 == 1417) {
                                var166.field2003 = var168;
                            }
                            var166.field2028 = true;
                            if (var177 == 1401) {
                                var166.field2018 = var168;
                            }
                            if (var177 == 1409) {
                                var166.field1940 = var168;
                            }
                            if (var177 == 1406) {
                                var166.field1951 = var168;
                            }
                            if (var177 == 1416) {
                                var166.field1922 = var168;
                            }
                            if (var177 == 1412) {
                                var166.field1937 = var168;
                            }
                            if (var177 == 1415) {
                                var166.field1959 = var168;
                            }
                            if (var177 == 1400) {
                                var166.field1976 = var168;
                            }
                            if (var177 == 1404) {
                                var166.field1956 = var168;
                            }
                            if (var177 == 1410) {
                                var166.field1962 = var168;
                            }
                            if (var177 == 1414) {
                                var166.field1983 = var168;
                            }
                            if (var177 == 1408) {
                                var166.field1930 = var168;
                            }
                            continue;
                        }
                        if (var177 < 1600) {
                            class85 var165 = var43 ? class7.field154 : class111.field2645;
                            if (var177 == 1500) {
                                class29.field644[var9++] = var165.field1985;
                                continue;
                            }
                            if (var177 == 1501) {
                                class29.field644[var9++] = var165.field2007;
                                continue;
                            }
                            if (var177 == 1502) {
                                class29.field644[var9++] = var165.field1929;
                                continue;
                            }
                            if (var177 == 1503) {
                                class29.field644[var9++] = var165.field1975;
                                continue;
                            }
                            if (var177 == 1504) {
                                class29.field644[var9++] = var165.field1992 ? 1 : 0;
                                continue;
                            }
                            if (var177 == 1505) {
                                class29.field644[var9++] = var165.field1945;
                                continue;
                            }
                        } else if (var177 < 1700) {
                            class85 var62 = var43 ? class7.field154 : class111.field2645;
                            if (var177 == 1600) {
                                class29.field644[var9++] = var62.field1932;
                                continue;
                            }
                            if (var177 == 1601) {
                                class29.field644[var9++] = var62.field1927;
                                continue;
                            }
                            if (var177 == 1602) {
                                class89.field2126[var11++] = var62.field1963;
                                continue;
                            }
                            if (var177 == 1603) {
                                class29.field644[var9++] = var62.field1912;
                                continue;
                            }
                            if (var177 == 1604) {
                                class29.field644[var9++] = var62.field1993;
                                continue;
                            }
                            if (var177 == 1605) {
                                class29.field644[var9++] = var62.field1994;
                                continue;
                            }
                        } else if (var177 < 1800) {
                            class85 var164 = var43 ? class7.field154 : class111.field2645;
                            if (var177 == 1700) {
                                class29.field644[var9++] = var164.field1982;
                                continue;
                            }
                            if (var177 == 1701) {
                                if (var164.field1982 == -1) {
                                    class29.field644[var9++] = 0;
                                } else {
                                    class29.field644[var9++] = var164.field1960;
                                }
                                continue;
                            }
                            if (var177 == 1702) {
                                class29.field644[var9++] = var164.field1920;
                                continue;
                            }
                        } else if (var177 < 1900) {
                            class85 var63 = var43 ? class7.field154 : class111.field2645;
                            if (var177 == 1800) {
                                class29.field644[var9++] = class82.method601(class28.method218(14485, var63), 119);
                                continue;
                            }
                        } else if (var177 < 2600) {
                            var9--;
                            class85 var64 = class142.method1093(256, class29.field644[var9]);
                            if (var177 == 2500) {
                                class29.field644[var9++] = var64.field1985;
                                continue;
                            }
                            if (var177 == 2501) {
                                class29.field644[var9++] = var64.field2007;
                                continue;
                            }
                            if (var177 == 2502) {
                                class29.field644[var9++] = var64.field1929;
                                continue;
                            }
                            if (var177 == 2503) {
                                class29.field644[var9++] = var64.field1975;
                                continue;
                            }
                            if (var177 == 2504) {
                                class29.field644[var9++] = var64.field1992 ? 1 : 0;
                                continue;
                            }
                            if (var177 == 2505) {
                                class29.field644[var9++] = var64.field1945;
                                continue;
                            }
                        } else if (var177 < 2700) {
                            var9--;
                            class85 var65 = class142.method1093(256, class29.field644[var9]);
                            if (var177 == 2600) {
                                class29.field644[var9++] = var65.field1932;
                                continue;
                            }
                            if (var177 == 2601) {
                                class29.field644[var9++] = var65.field1927;
                                continue;
                            }
                            if (var177 == 2602) {
                                class89.field2126[var11++] = var65.field1963;
                                continue;
                            }
                            if (var177 == 2603) {
                                class29.field644[var9++] = var65.field1912;
                                continue;
                            }
                            if (var177 == 2604) {
                                class29.field644[var9++] = var65.field1993;
                                continue;
                            }
                            if (var177 == 2605) {
                                class29.field644[var9++] = var65.field1994;
                                continue;
                            }
                        } else if (var177 < 2800) {
                            var9--;
                            class85 var163 = class142.method1093(256, class29.field644[var9]);
                            if (var177 == 2700) {
                                class29.field644[var9++] = var163.field1982;
                                continue;
                            }
                            if (var177 == 2701) {
                                if (var163.field1982 == -1) {
                                    class29.field644[var9++] = 0;
                                } else {
                                    class29.field644[var9++] = var163.field1960;
                                }
                                continue;
                            }
                        } else if (var177 < 2900) {
                            var9--;
                            class85 var162 = class142.method1093(256, class29.field644[var9]);
                            if (var177 == 2800) {
                                class29.field644[var9++] = class82.method601(class28.method218(14485, var162), 97);
                                continue;
                            }
                        } else if (var177 < 3200) {
                            if (var177 == 3100) {
                                var11--;
                                class137 var66 = class89.field2126[var11];
                                class109.method792(0, var66, -4, class22.field513);
                                continue;
                            }
                            if (var177 == 3101) {
                                var9 -= 2;
                                class93.method678((byte) -47, class29.field644[var9], class29.field644[var9 + 1], class104.field2412);
                                continue;
                            }
                            if (var177 == 3102) {
                                var9--;
                                int var67 = class29.field644[var9];
                                if (var67 >= 0 && class32.field679.length > var67 && class32.field679[var67] != -1) {
                                    class21.field439 = true;
                                    class34.field737 = true;
                                    class75.field1691 = var67;
                                }
                                continue;
                            }
                            if (var177 == 3103) {
                                class2.method18(-1);
                                continue;
                            }
                        } else if (var177 < 3300) {
                            if (var177 == 3200) {
                                var9 -= 3;
                                class45.method327(class29.field644[var9], 124, class29.field644[var9 + 2], class29.field644[var9 + 1]);
                                continue;
                            }
                            if (var177 == 3201) {
                                var9--;
                                class86.method631(17537, class29.field644[var9]);
                                continue;
                            }
                            if (var177 == 3202) {
                                var9 -= 2;
                                class36.method256(false, class29.field644[var9 + 1], class29.field644[var9]);
                                continue;
                            }
                        } else if (var177 < 3400) {
                            if (var177 == 3300) {
                                class29.field644[var9++] = class112.field2667;
                                continue;
                            }
                            if (var177 == 3301) {
                                var9 -= 2;
                                int var68 = class29.field644[var9];
                                int var69 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class88.method652((byte) 119, var68, var69);
                                continue;
                            }
                            if (var177 == 3302) {
                                var9 -= 2;
                                int var70 = class29.field644[var9];
                                int var71 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class35.method253(var70, 0, var71);
                                continue;
                            }
                            if (var177 == 3303) {
                                var9 -= 2;
                                int var72 = class29.field644[var9];
                                int var73 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class95.method685(var72, (byte) 73, var73);
                                continue;
                            }
                            if (var177 == 3304) {
                                var9--;
                                int var74 = class29.field644[var9];
                                class29.field644[var9++] = class91.method674(var74, 1).field1007;
                                continue;
                            }
                            if (var177 == 3305) {
                                var9--;
                                int var75 = class29.field644[var9];
                                class29.field644[var9++] = class73.field1560[var75];
                                continue;
                            }
                            if (var177 == 3306) {
                                var9--;
                                int var76 = class29.field644[var9];
                                class29.field644[var9++] = class32.field696[var76];
                                continue;
                            }
                            if (var177 == 3307) {
                                var9--;
                                int var77 = class29.field644[var9];
                                class29.field644[var9++] = class7.field143[var77];
                                continue;
                            }
                            if (var177 == 3308) {
                                int var78 = class28.field627;
                                int var79 = (class104.field2412.field1646 >> 7) + class91.field2163;
                                int var80 = (class104.field2412.field1672 >> 7) + class58.field1227;
                                class29.field644[var9++] = (var80 << 14) + ((var78 << 28) + var79);
                                continue;
                            }
                            if (var177 == 3309) {
                                var9--;
                                int var81 = class29.field644[var9];
                                class29.field644[var9++] = class45.method323(16383, var81 >> 14);
                                continue;
                            }
                            if (var177 == 3310) {
                                var9--;
                                int var82 = class29.field644[var9];
                                class29.field644[var9++] = var82 >> 28;
                                continue;
                            }
                            if (var177 == 3311) {
                                var9--;
                                int var83 = class29.field644[var9];
                                class29.field644[var9++] = class45.method323(var83, 16383);
                                continue;
                            }
                        } else if (var177 < 3700) {
                            if (var177 == 3600) {
                                if (class46.field1035 == 0) {
                                    class29.field644[var9++] = -2;
                                } else if (class46.field1035 == 1) {
                                    class29.field644[var9++] = -1;
                                } else {
                                    class29.field644[var9++] = class80.field1832;
                                }
                                continue;
                            }
                            if (var177 == 3601) {
                                var9--;
                                int var84 = class29.field644[var9];
                                if (class46.field1035 == 2 && class80.field1832 > var84) {
                                    class89.field2126[var11++] = class98.field2270[var84];
                                    continue;
                                }
                                class89.field2126[var11++] = class22.field513;
                                continue;
                            }
                            if (var177 == 3602) {
                                var9--;
                                int var85 = class29.field644[var9];
                                if (class46.field1035 == 2 && class80.field1832 > var85) {
                                    class29.field644[var9++] = class83.field1872[var85];
                                    continue;
                                }
                                class29.field644[var9++] = 0;
                                continue;
                            }
                            if (var177 == 3603) {
                                var9--;
                                int var86 = class29.field644[var9];
                                if (class46.field1035 == 2 && class80.field1832 > var86) {
                                    class29.field644[var9++] = class99.field2320[var86];
                                    continue;
                                }
                                class29.field644[var9++] = 0;
                                continue;
                            }
                            if (var177 == 3604) {
                                var11--;
                                class137 var87 = class89.field2126[var11];
                                var9--;
                                int var88 = class29.field644[var9];
                                class93.method679(0, var87, var88);
                                continue;
                            }
                        } else if (var177 < 4100) {
                            if (var177 == 4000) {
                                var9 -= 2;
                                int var89 = class29.field644[var9];
                                int var90 = class29.field644[var9 + 1];
                                class29.field644[var9++] = var89 + var90;
                                continue;
                            }
                            if (var177 == 4001) {
                                var9 -= 2;
                                int var91 = class29.field644[var9];
                                int var92 = class29.field644[var9 + 1];
                                class29.field644[var9++] = var91 - var92;
                                continue;
                            }
                            if (var177 == 4002) {
                                var9 -= 2;
                                int var93 = class29.field644[var9];
                                int var94 = class29.field644[var9 + 1];
                                class29.field644[var9++] = var93 * var94;
                                continue;
                            }
                            if (var177 == 4003) {
                                var9 -= 2;
                                int var95 = class29.field644[var9];
                                int var96 = class29.field644[var9 + 1];
                                class29.field644[var9++] = var95 / var96;
                                continue;
                            }
                            if (var177 == 4004) {
                                var9--;
                                int var97 = class29.field644[var9];
                                class29.field644[var9++] = (int) (Math.random() * (double) var97);
                                continue;
                            }
                            if (var177 == 4005) {
                                var9--;
                                int var98 = class29.field644[var9];
                                class29.field644[var9++] = (int) ((double) (var98 + 1) * Math.random());
                                continue;
                            }
                            if (var177 == 4006) {
                                var9 -= 5;
                                int var99 = class29.field644[var9 + 1];
                                int var100 = class29.field644[var9 + 2];
                                int var101 = class29.field644[var9];
                                int var102 = class29.field644[var9 + 3];
                                int var103 = class29.field644[var9 + 4];
                                class29.field644[var9++] = (var103 - var100) * (-var101 + var99) / (var102 - var100) + var101;
                                continue;
                            }
                            if (var177 == 4007) {
                                var9 -= 2;
                                int var104 = class29.field644[var9];
                                int var105 = class29.field644[var9 + 1];
                                class29.field644[var9++] = var104 + var104 * var105 / 100;
                                continue;
                            }
                            if (var177 == 4008) {
                                var9 -= 2;
                                int var106 = class29.field644[var9];
                                int var107 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class49.method351(var106, 0x1 << var107);
                                continue;
                            }
                            if (var177 == 4009) {
                                var9 -= 2;
                                int var108 = class29.field644[var9];
                                int var109 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class45.method323(var108, -(0x1 << var109) - 1);
                                continue;
                            }
                            if (var177 == 4010) {
                                var9 -= 2;
                                int var110 = class29.field644[var9];
                                int var111 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class45.method323(0x1 << var111, var110) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var177 == 4011) {
                                var9 -= 2;
                                int var112 = class29.field644[var9 + 1];
                                int var113 = class29.field644[var9];
                                class29.field644[var9++] = var113 % var112;
                                continue;
                            }
                            if (var177 == 4012) {
                                var9 -= 2;
                                int var114 = class29.field644[var9 + 1];
                                int var115 = class29.field644[var9];
                                if (var115 == 0) {
                                    class29.field644[var9++] = 0;
                                } else {
                                    class29.field644[var9++] = (int) Math.pow((double) var115, (double) var114);
                                }
                                continue;
                            }
                            if (var177 == 4013) {
                                var9 -= 2;
                                int var116 = class29.field644[var9];
                                int var117 = class29.field644[var9 + 1];
                                if (var116 == 0) {
                                    class29.field644[var9++] = 0;
                                } else if (var117 == 0) {
                                    class29.field644[var9++] = Integer.MAX_VALUE;
                                } else {
                                    class29.field644[var9++] = (int) Math.pow((double) var116, 1.0D / (double) var117);
                                }
                                continue;
                            }
                            if (var177 == 4014) {
                                var9 -= 2;
                                int var118 = class29.field644[var9];
                                int var119 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class45.method323(var119, var118);
                                continue;
                            }
                            if (var177 == 4015) {
                                var9 -= 2;
                                int var120 = class29.field644[var9];
                                int var121 = class29.field644[var9 + 1];
                                class29.field644[var9++] = class49.method351(var121, var120);
                                continue;
                            }
                        } else if (var177 < 4200) {
                            if (var177 == 4100) {
                                var11--;
                                class137 var136 = class89.field2126[var11];
                                var9--;
                                int var137 = class29.field644[var9];
                                class89.field2126[var11++] = class88.method666(119, new class137[] { var136, class61.method435(var137, 118) });
                                continue;
                            }
                            if (var177 == 4101) {
                                var11 -= 2;
                                class137 var138 = class89.field2126[var11];
                                class137 var139 = class89.field2126[var11 + 1];
                                class89.field2126[var11++] = class88.method666(109, new class137[] { var138, var139 });
                                continue;
                            }
                            if (var177 == 4102) {
                                var11--;
                                class137 var140 = class89.field2126[var11];
                                var9--;
                                int var141 = class29.field644[var9];
                                class89.field2126[var11++] = class88.method666(122, new class137[] { var140, class132.method971(true, 10, var141) });
                                continue;
                            }
                            if (var177 == 4103) {
                                var11--;
                                class137 var142 = class89.field2126[var11];
                                class89.field2126[var11++] = var142.method1005((byte) 98);
                                continue;
                            }
                            if (var177 == 4104) {
                                var9--;
                                int var143 = class29.field644[var9];
                                long var144 = (long) var143 * 86400000L + 1014768000000L;
                                class24.field566.setTime(new Date(var144));
                                int var146 = class24.field566.get(5);
                                int var147 = class24.field566.get(2);
                                int var148 = class24.field566.get(1);
                                class89.field2126[var11++] = class88.method666(-60, new class137[] { class61.method435(var146, 90), class23.field552, class21.field434[var147], class23.field552, class61.method435(var148, 90) });
                                continue;
                            }
                            if (var177 == 4105) {
                                var11 -= 2;
                                class137 var149 = class89.field2126[var11];
                                class137 var150 = class89.field2126[var11 + 1];
                                if (class104.field2412.field2891 != null && class104.field2412.field2891.field1220) {
                                    class89.field2126[var11++] = var150;
                                    continue;
                                }
                                class89.field2126[var11++] = var149;
                                continue;
                            }
                            if (var177 == 4106) {
                                var9--;
                                int var151 = class29.field644[var9];
                                class89.field2126[var11++] = class61.method435(var151, 94);
                                continue;
                            }
                            if (var177 == 4107) {
                                var11 -= 2;
                                class29.field644[var9++] = class89.field2126[var11].method1032(class89.field2126[var11 + 1], (byte) -46);
                                continue;
                            }
                            if (var177 == 4108) {
                                var9 -= 2;
                                int var152 = class29.field644[var9 + 1];
                                int var153 = class29.field644[var9];
                                var11--;
                                class137 var154 = class89.field2126[var11];
                                byte[] var155 = class38.field838.method668(var152, -214, 0);
                                class145 var156 = new class145(var155);
                                class29.field644[var9++] = var156.method1150(var154, var153);
                                continue;
                            }
                            if (var177 == 4109) {
                                var9 -= 2;
                                var11--;
                                class137 var157 = class89.field2126[var11];
                                int var158 = class29.field644[var9];
                                int var159 = class29.field644[var9 + 1];
                                byte[] var160 = class38.field838.method668(var159, -214, 0);
                                class145 var161 = new class145(var160);
                                class29.field644[var9++] = var161.method1144(var157, var158);
                                continue;
                            }
                        } else if (var177 < 4300) {
                            if (var177 == 4200) {
                                var9--;
                                int var122 = class29.field644[var9];
                                class89.field2126[var11++] = class39.method286((byte) -45, var122).field3316;
                                continue;
                            }
                            if (var177 == 4201) {
                                var9 -= 2;
                                int var123 = class29.field644[var9];
                                int var124 = class29.field644[var9 + 1];
                                class141 var125 = class39.method286((byte) -3, var123);
                                if (var124 >= 1 && var124 <= 5 && var125.field3273[var124 - 1] != null) {
                                    class89.field2126[var11++] = var125.field3273[var124 - 1];
                                    continue;
                                }
                                class89.field2126[var11++] = class22.field513;
                                continue;
                            }
                            if (var177 == 4202) {
                                var9 -= 2;
                                int var126 = class29.field644[var9];
                                int var127 = class29.field644[var9 + 1];
                                class141 var128 = class39.method286((byte) -65, var126);
                                if (var127 >= 1 && var127 <= 5 && var128.field3289[var127 - 1] != null) {
                                    class89.field2126[var11++] = var128.field3289[var127 - 1];
                                    continue;
                                }
                                class89.field2126[var11++] = class22.field513;
                                continue;
                            }
                            if (var177 == 4203) {
                                var9--;
                                int var129 = class29.field644[var9];
                                class29.field644[var9++] = class39.method286((byte) -87, var129).field3282;
                                continue;
                            }
                            if (var177 == 4204) {
                                var9--;
                                int var130 = class29.field644[var9];
                                class29.field644[var9++] = class39.method286((byte) -100, var130).field3271 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var177 == 4205) {
                                var9--;
                                int var131 = class29.field644[var9];
                                class141 var132 = class39.method286((byte) -3, var131);
                                if (var132.field3313 == -1 && var132.field3302 >= 0) {
                                    class29.field644[var9++] = var132.field3302;
                                    continue;
                                }
                                class29.field644[var9++] = var131;
                                continue;
                            }
                            if (var177 == 4206) {
                                var9--;
                                int var133 = class29.field644[var9];
                                class141 var134 = class39.method286((byte) 117, var133);
                                if (var134.field3313 >= 0 && var134.field3302 >= 0) {
                                    class29.field644[var9++] = var134.field3302;
                                    continue;
                                }
                                class29.field644[var9++] = var133;
                                continue;
                            }
                            if (var177 == 4207) {
                                var9--;
                                int var135 = class29.field644[var9];
                                class29.field644[var9++] = class39.method286((byte) 125, var135).field3314 ? 1 : 0;
                                continue;
                            }
                        }
                    }
                    return;
                }
            }
        } catch (Exception var176) {
            class110.method850((byte) 125, "CS2 - scr:" + var8.field2490 + " op:" + var14, var176);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLla;)V")
    public static final void method462(byte arg0, class75 arg1) {
        if (arg0 > -36) {
            method462((byte) -28, null);
        }
        field1343++;
        if (class112.field2667 == arg1.field1656 || arg1.field1654 == -1 || arg1.field1669 != 0 || arg1.field1629 + 1 > class68.method481(0, arg1.field1654).field3382[arg1.field1680]) {
            int var2 = arg1.field1656 - arg1.field1638;
            int var3 = class112.field2667 - arg1.field1638;
            int var4 = arg1.field1673 * 64 + arg1.field1627 * 128;
            int var5 = arg1.field1670 * 128 + arg1.field1673 * 64;
            int var6 = arg1.field1681 * 128 + arg1.field1673 * 64;
            arg1.field1646 = ((var2 - var3) * var5 + var3 * var6) / var2;
            int var7 = arg1.field1673 * 64 + arg1.field1635 * 128;
            arg1.field1672 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        arg1.field1650 = 0;
        if (arg1.field1633 == 0) {
            arg1.field1632 = 1024;
        }
        if (arg1.field1633 == 1) {
            arg1.field1632 = 1536;
        }
        if (arg1.field1633 == 2) {
            arg1.field1632 = 0;
        }
        if (arg1.field1633 == 3) {
            arg1.field1632 = 512;
        }
        arg1.field1652 = arg1.field1632;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1342 = null;
        field1339 = null;
        if (arg0 != 1504) {
            method459(false);
        }
        field1344 = null;
        field1346 = null;
        field1341 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([B[Lic;IILl;I)V")
    public static final void method464(byte[] arg0, class59[] arg1, int arg2, int arg3, class74 arg4, int arg5) {
        if (arg5 < 91) {
            return;
        }
        class109 var6 = new class109(arg0);
        field1338++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method827(37);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method827(82);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method838(255);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var12 + arg2;
                int var18 = arg3 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    class59 var20 = null;
                    if ((class70.field1490[1][var17][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg1[var19];
                    }
                    class78.method577(var16, var15, var17, 11770, var20, var13, var7, var18, arg4);
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1344[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
