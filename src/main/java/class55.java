import java.io.EOFException;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class55 {

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    private int field1409 = 0;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "J")
    private long field1411 = -1L;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "J")
    private long field1412 = -1L;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lrc;")
    private class104 field1407;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "J")
    private long field1415;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "J")
    private long field1406;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "J")
    private long field1395;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[B")
    private byte[] field1386;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[B")
    private byte[] field1391;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1384 = -1;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lpd;")
    public static class94 field1401 = class28.method249(-92, "runes");

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lpd;")
    public static class94 field1405 = class28.method249(62, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "[Lpd;")
    public static class94[] field1410 = new class94[100];

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[Ljb;")
    public static class55[] field1399 = new class55[13];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "J")
    private long field1388;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ls;")
    public static class111 field1390;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ltc;")
    public static class116 field1393;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lla;")
    public static class66 field1402;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Ljava/lang/Object;IIIILme;)V", line = 3)
    public static final void method433(Object[] arg0, int arg1, int arg2, int arg3, int arg4, class77 arg5) {
        field1392++;
        int var6 = (Integer) arg0[0];
        class20 var7 = class23.method168(var6, 14187);
        if (var7 == null) {
            return;
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = -1;
        int[] var11 = var7.field558;
        int[] var12 = var7.field540;
        boolean var13 = true;
        try {
            class1.field11 = new class94[var7.field530];
            class85.field2130 = new int[var7.field538];
            int var14 = 0;
            int var15 = 0;
            for (int var16 = 1; var16 < arg0.length; var16++) {
                if (arg0[var16] instanceof Integer) {
                    int var17 = (Integer) arg0[var16];
                    if (var17 == -2147483647) {
                        var17 = arg2;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg1;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg5.field1928;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg3;
                    }
                    class85.field2130[var14++] = var17;
                } else if (arg0[var16] instanceof class94) {
                    class1.field11[var15++] = (class94) arg0[var16];
                }
            }
            if (arg4 != 100) {
                method441(-128);
            }
            while (true) {
                int var18;
                while (true) {
                    var10++;
                    var18 = var11[var10];
                    if (var18 >= 100) {
                        break;
                    }
                    if (var18 == 0) {
                        class4.field77[var8++] = var12[var10];
                    } else if (var18 == 1) {
                        int var19 = var12[var10];
                        class4.field77[var8++] = class37.field953[var19];
                    } else if (var18 == 2) {
                        int var20 = var12[var10];
                        var8--;
                        class37.field953[var20] = class4.field77[var8];
                    } else if (var18 == 3) {
                        class47.field1143[var9++] = var7.field545[var10];
                    } else if (var18 == 6) {
                        var10 += var12[var10];
                    } else if (var18 == 7) {
                        var8 -= 2;
                        if (class4.field77[var8 + 1] != class4.field77[var8]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 8) {
                        var8 -= 2;
                        if (class4.field77[var8 + 1] == class4.field77[var8]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 9) {
                        var8 -= 2;
                        if (class4.field77[var8] < class4.field77[var8 + 1]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 10) {
                        var8 -= 2;
                        if (class4.field77[var8] > class4.field77[var8 + 1]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 21) {
                        if (class88.field2241 == 0) {
                            return;
                        }
                        class38 var21 = class13.field328[--class88.field2241];
                        var7 = var21.field987;
                        class1.field11 = var21.field993;
                        var11 = var7.field558;
                        var10 = var21.field984;
                        class85.field2130 = var21.field990;
                        var12 = var7.field540;
                    } else if (var18 == 25) {
                        int var22 = var12[var10];
                        class4.field77[var8++] = class20.method152(-2, var22);
                    } else if (var18 == 27) {
                        int var23 = var12[var10];
                        var8--;
                        class89.method666(var23, class4.field77[var8], false);
                    } else if (var18 == 31) {
                        var8 -= 2;
                        if (class4.field77[var8 + 1] >= class4.field77[var8]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 32) {
                        var8 -= 2;
                        if (class4.field77[var8] >= class4.field77[var8 + 1]) {
                            var10 += var12[var10];
                        }
                    } else if (var18 == 33) {
                        class4.field77[var8++] = class85.field2130[var12[var10]];
                    } else {
                        int var10001;
                        if (var18 == 34) {
                            var10001 = var12[var10];
                            var8--;
                            class85.field2130[var10001] = class4.field77[var8];
                        } else if (var18 == 35) {
                            class47.field1143[var9++] = class1.field11[var12[var10]];
                        } else if (var18 == 36) {
                            var10001 = var12[var10];
                            var9--;
                            class1.field11[var10001] = class47.field1143[var9];
                        } else if (var18 == 37) {
                            int var24 = var12[var10];
                            var9 -= var24;
                            class94 var25 = class67.method503(var24, var9, 0, class47.field1143);
                            class47.field1143[var9++] = var25;
                        } else if (var18 == 38) {
                            var8--;
                        } else if (var18 == 39) {
                            var9--;
                        } else if (var18 == 40) {
                            int var26 = var12[var10];
                            class20 var27 = class23.method168(var26, 14187);
                            int[] var28 = new int[var27.field538];
                            class94[] var29 = new class94[var27.field530];
                            for (int var30 = 0; var30 < var27.field542; var30++) {
                                var28[var30] = class4.field77[var8 + var30 - var27.field542];
                            }
                            for (int var31 = 0; var31 < var27.field552; var31++) {
                                var29[var31] = class47.field1143[var9 + var31 - var27.field552];
                            }
                            var9 -= var27.field552;
                            var8 -= var27.field542;
                            class38 var32 = new class38();
                            var32.field987 = var7;
                            var7 = var27;
                            var32.field990 = class85.field2130;
                            var32.field984 = var10;
                            var10 = -1;
                            var32.field993 = class1.field11;
                            class13.field328[class88.field2241++] = var32;
                            var12 = var27.field540;
                            class85.field2130 = var28;
                            class1.field11 = var29;
                            var11 = var27.field558;
                        } else if (var18 == 42) {
                            class4.field77[var8++] = class127.field3200[var12[var10]];
                        } else {
                            if (var18 != 43) {
                                break;
                            }
                            var10001 = var12[var10];
                            var8--;
                            class127.field3200[var10001] = class4.field77[var8];
                        }
                    }
                }
                boolean var33;
                if (var12[var10] == 1) {
                    var33 = true;
                } else {
                    var33 = false;
                }
                if (var18 >= 1000) {
                    if (var18 >= 1000 && var18 < 1100 || !(var18 < 2000 || var18 >= 2100)) {
                        class77 var34;
                        if (var18 >= 2000) {
                            var18 -= 1000;
                            var8--;
                            var34 = class63.method466((byte) -38, class4.field77[var8]);
                        } else {
                            var34 = var33 ? class38.field983 : class90.field2326;
                        }
                        class9.method58(var34, -1);
                        if (var18 == 1000) {
                            var8 -= 2;
                            var34.field1878 = class4.field77[var8];
                            var34.field1961 = class4.field77[var8 + 1];
                        } else if (var18 == 1001) {
                            var8 -= 2;
                            var34.field1964 = class4.field77[var8];
                            var34.field1967 = class4.field77[var8 + 1];
                        } else if (var18 == 1003) {
                            var8--;
                            var34.field1897 = class4.field77[var8] == 1;
                        } else {
                            if (var18 != 1004) {
                                break;
                            }
                            var8--;
                            var34.field1885 = class4.field77[var8] == 1;
                        }
                    } else if (var18 >= 1100 && var18 < 1200 || !(var18 < 2100 || var18 >= 2200)) {
                        class77 var147;
                        if (var18 < 2000) {
                            var147 = var33 ? class38.field983 : class90.field2326;
                        } else {
                            var18 -= 1000;
                            var8--;
                            var147 = class63.method466((byte) -38, class4.field77[var8]);
                        }
                        class9.method58(var147, arg4 ^ 0xFFFFFF9B);
                        if (var18 == 1100) {
                            var8 -= 2;
                            var147.field1873 = class4.field77[var8];
                            var147.field1915 = class4.field77[var8 + 1];
                        } else if (var18 == 1101) {
                            var8--;
                            var147.field1876 = class4.field77[var8];
                        } else if (var18 == 1102) {
                            var8--;
                            var147.field1944 = class4.field77[var8] == 1;
                        } else if (var18 == 1103) {
                            var8--;
                            var147.field1970 = class4.field77[var8];
                        } else if (var18 == 1104) {
                            var8--;
                            var147.field1910 = class4.field77[var8];
                        } else if (var18 == 1105) {
                            var8--;
                            var147.field1976 = class4.field77[var8];
                        } else if (var18 == 1106) {
                            var8--;
                            var147.field1927 = class4.field77[var8];
                        } else if (var18 == 1107) {
                            var8--;
                            var147.field1911 = class4.field77[var8] == 1;
                        } else if (var18 == 1108) {
                            var147.field1969 = 1;
                            var8--;
                            var147.field1893 = class4.field77[var8];
                        } else if (var18 == 1109) {
                            var8 -= 6;
                            var147.field1960 = class4.field77[var8];
                            var147.field1955 = class4.field77[var8 + 1];
                            var147.field1892 = class4.field77[var8 + 2];
                            var147.field1875 = class4.field77[var8 + 3];
                            var147.field1886 = class4.field77[var8 + 4];
                            var147.field1948 = class4.field77[var8 + 5];
                        } else if (var18 == 1110) {
                            var8--;
                            var147.field1931 = class4.field77[var8];
                        } else if (var18 == 1111) {
                            var8--;
                            var147.field1972 = class4.field77[var8] == 1;
                        } else if (var18 == 1112) {
                            var9--;
                            var147.field1905 = class47.field1143[var9];
                        } else if (var18 == 1113) {
                            var8--;
                            var147.field1884 = class4.field77[var8];
                        } else if (var18 == 1114) {
                            var8 -= 3;
                            var147.field1899 = class4.field77[var8];
                            var147.field1922 = class4.field77[var8 + 1];
                            var147.field1888 = class4.field77[var8 + 2];
                        } else if (var18 == 1115) {
                            var8--;
                            var147.field1913 = class4.field77[var8] == 1;
                        } else if (var18 == 1116) {
                            var8--;
                            var147.field1982 = class4.field77[var8];
                        } else if (var18 == 1117) {
                            var8--;
                            var147.field1925 = class4.field77[var8];
                        } else if (var18 == 1118) {
                            var8--;
                            var147.field1930 = class4.field77[var8] == 1;
                        } else {
                            if (var18 != 1119) {
                                break;
                            }
                            var8--;
                            var147.field1946 = class4.field77[var8] == 1;
                        }
                    } else if (var18 >= 1200 && var18 < 1300 || !(var18 < 2200 || var18 >= 2300)) {
                        class77 var35;
                        if (var18 >= 2000) {
                            var8--;
                            var35 = class63.method466((byte) -38, class4.field77[var8]);
                            var18 -= 1000;
                        } else {
                            var35 = var33 ? class38.field983 : class90.field2326;
                        }
                        class9.method58(var35, -1);
                        if (var18 == 1200) {
                            var8 -= 2;
                            int var36 = class4.field77[var8 + 1];
                            int var37 = class4.field77[var8];
                            var35.field1956 = var37;
                            var35.field1883 = var36;
                        } else if (var18 == 1201) {
                            var35.field1969 = 2;
                            var8--;
                            var35.field1893 = class4.field77[var8];
                        } else if (var18 == 1202) {
                            var35.field1969 = 3;
                            var35.field1893 = class80.field2044.field2299.method526(27721);
                        } else {
                            if (var18 != 1203) {
                                break;
                            }
                            class77 var38 = var33 ? class90.field2326 : class38.field983;
                            var35.field1980 = var38.field1928;
                        }
                    } else if (var18 >= 1300 && var18 < 1400 || !(var18 < 2300 || var18 >= 2400)) {
                        class77 var39;
                        if (var18 >= 2000) {
                            var8--;
                            var39 = class63.method466((byte) -38, class4.field77[var8]);
                            var18 -= 1000;
                        } else {
                            var39 = var33 ? class38.field983 : class90.field2326;
                        }
                        if (var18 >= 1300 && var18 <= 1309 || !(var18 < 1314 || var18 > 1318) || var18 == 1320) {
                            var9--;
                            class94 var40 = class47.field1143[var9];
                            Object[] var41 = new Object[var40.method710(arg4 - 223) + 1];
                            for (int var42 = var41.length - 1; var42 >= 1; var42--) {
                                if (var40.method695(false, var42 - 1) == 115) {
                                    var9--;
                                    var41[var42] = class47.field1143[var9];
                                } else {
                                    var8--;
                                    var41[var42] = Integer.valueOf(class4.field77[var8]);
                                }
                            }
                            var8--;
                            var41[0] = Integer.valueOf(class4.field77[var8]);
                            if (var18 == 1302) {
                                var39.field1921 = var41;
                            }
                            if (var18 == 1303) {
                                var39.field1949 = var41;
                            }
                            if (var18 == 1315) {
                                var39.field1912 = var41;
                            }
                            if (var18 == 1316) {
                                var39.field1984 = var41;
                            }
                            if (var18 == 1305) {
                                var39.field1870 = var41;
                            }
                            if (var18 == 1320) {
                                var39.field1934 = var41;
                            }
                            if (var18 == 1309) {
                                var39.field1945 = var41;
                            }
                            if (var18 == 1304) {
                                var39.field1977 = var41;
                            }
                            if (var18 == 1317) {
                                var39.field1938 = var41;
                            }
                            if (var18 == 1308) {
                                var39.field1900 = var41;
                            }
                            if (var18 == 1314) {
                                var39.field1877 = var41;
                            }
                            if (var18 == 1301) {
                                var39.field1926 = var41;
                            }
                            if (var18 == 1318) {
                                var39.field1936 = var41;
                            }
                            if (var18 == 1306) {
                                var39.field1981 = var41;
                            }
                            if (var18 == 1307) {
                                var39.field1975 = var41;
                            }
                        } else if (var18 == 1310) {
                            var8--;
                            int var43 = class4.field77[var8] - 1;
                            if (var43 >= 0 && var43 <= 9) {
                                if (var39.field1867 == null || var43 >= var39.field1867.length) {
                                    class94[] var44 = new class94[var43 + 1];
                                    if (var39.field1867 != null) {
                                        for (int var45 = 0; var45 < var39.field1867.length; var45++) {
                                            var44[var45] = var39.field1867[var45];
                                        }
                                    }
                                    var39.field1867 = var44;
                                }
                                var9--;
                                class94 var46 = class47.field1143[var9];
                                if (var46.method710(-123) == 0) {
                                    var46 = null;
                                }
                                var39.field1867[var43] = var46;
                            } else {
                                var9--;
                            }
                        } else if (var18 == 1311) {
                            var8--;
                            var39.field1980 = class4.field77[var8];
                        } else if (var18 == 1312) {
                            var8--;
                            var39.field1971 = class4.field77[var8] == 1;
                        } else if (var18 == 1313) {
                            var8--;
                            var39.field1907 = class4.field77[var8];
                        } else if (var18 == 1319) {
                            var8--;
                            var39.field1935 = class4.field77[var8];
                        } else if (var18 == 1321) {
                            class113.method840((byte) -90);
                            var8--;
                            class67.field1647 = class4.field77[var8];
                            var9--;
                            class19.field526 = class47.field1143[var9];
                            class66.field1632 = class4.method20(new class94[] { var39.field1872, class54.field1355 }, true);
                            if (var39.field1928 < 0) {
                                class99.field2514 = var39.field1920;
                                class97.field2481 = var39.field1928 & 0x7FFF;
                            } else {
                                class97.field2481 = -1;
                                class99.field2514 = var39.field1928;
                            }
                            class135.field3323 = true;
                            class126.field3178 = 0;
                            class31.field882 = 1;
                        } else if (var18 == 1322) {
                            var9--;
                            var39.field1872 = class47.field1143[var9];
                        } else {
                            if (var18 != 1323) {
                                break;
                            }
                            var8--;
                            var39.field1974 = class4.field77[var8] == 1;
                        }
                    } else if (var18 >= 1500) {
                        if (var18 < 1600) {
                            class77 var133 = var33 ? class38.field983 : class90.field2326;
                            if (var18 == 1500) {
                                class4.field77[var8++] = var133.field1878;
                            } else if (var18 == 1501) {
                                class4.field77[var8++] = var133.field1961;
                            } else if (var18 == 1502) {
                                class4.field77[var8++] = var133.field1964;
                            } else if (var18 == 1503) {
                                class4.field77[var8++] = var133.field1967;
                            } else if (var18 == 1504) {
                                class4.field77[var8++] = var133.field1897 ? 1 : 0;
                            } else {
                                if (var18 != 1505) {
                                    break;
                                }
                                class4.field77[var8++] = var133.field1920;
                            }
                        } else if (var18 < 1700) {
                            class77 var132 = var33 ? class38.field983 : class90.field2326;
                            if (var18 == 1600) {
                                class4.field77[var8++] = var132.field1873;
                            } else if (var18 == 1601) {
                                class4.field77[var8++] = var132.field1915;
                            } else {
                                if (var18 != 1602) {
                                    break;
                                }
                                class47.field1143[var9++] = var132.field1905;
                            }
                        } else if (var18 < 1800) {
                            class77 var47 = var33 ? class38.field983 : class90.field2326;
                            if (var18 == 1700) {
                                class4.field77[var8++] = var47.field1956;
                            } else if (var18 != 1701) {
                                if (var18 != 1702) {
                                    break;
                                }
                                class4.field77[var8++] = class81.method605(32767, var47.field1928);
                            } else if (var47.field1956 == -1) {
                                class4.field77[var8++] = 0;
                            } else {
                                class4.field77[var8++] = var47.field1883;
                            }
                        } else if (var18 >= 2500) {
                            if (var18 < 2600) {
                                var8--;
                                class77 var121 = class63.method466((byte) -38, class4.field77[var8]);
                                if (var18 == 2500) {
                                    class4.field77[var8++] = var121.field1878;
                                } else if (var18 == 2501) {
                                    class4.field77[var8++] = var121.field1961;
                                } else if (var18 == 2502) {
                                    class4.field77[var8++] = var121.field1964;
                                } else if (var18 == 2503) {
                                    class4.field77[var8++] = var121.field1967;
                                } else if (var18 == 2504) {
                                    class4.field77[var8++] = var121.field1897 ? 1 : 0;
                                } else {
                                    if (var18 != 2505) {
                                        break;
                                    }
                                    class4.field77[var8++] = var121.field1920;
                                }
                            } else if (var18 < 2700) {
                                var8--;
                                class77 var120 = class63.method466((byte) -38, class4.field77[var8]);
                                if (var18 == 2600) {
                                    class4.field77[var8++] = var120.field1873;
                                } else if (var18 == 2601) {
                                    class4.field77[var8++] = var120.field1915;
                                } else {
                                    if (var18 != 2602) {
                                        break;
                                    }
                                    class47.field1143[var9++] = var120.field1905;
                                }
                            } else if (var18 < 2800) {
                                var8--;
                                class77 var119 = class63.method466((byte) -38, class4.field77[var8]);
                                if (var18 == 2700) {
                                    class4.field77[var8++] = var119.field1956;
                                } else {
                                    if (var18 != 2701) {
                                        break;
                                    }
                                    if (var119.field1956 == -1) {
                                        class4.field77[var8++] = 0;
                                    } else {
                                        class4.field77[var8++] = var119.field1883;
                                    }
                                }
                            } else if (var18 < 3100) {
                                if (var18 == 3000) {
                                    var8--;
                                    int var48 = class4.field77[var8];
                                    if (class111.field2809 == -1) {
                                        class85.method621(7, -1, var48);
                                        class111.field2809 = var48;
                                    }
                                } else if (var18 == 3001) {
                                    var8 -= 2;
                                    int var49 = class4.field77[var8 + 1];
                                    int var50 = class4.field77[var8];
                                    class79.method590(arg4 ^ 0xFFFFF82E, var50, var49, -1);
                                } else if (var18 == 3002) {
                                    class77 var51 = var33 ? class38.field983 : class90.field2326;
                                    if (class111.field2809 == -1) {
                                        class85.method621(7, var51.field1928 & 0x7FFF, var51.field1920);
                                        class111.field2809 = var51.field1928;
                                    }
                                } else {
                                    if (var18 != 3003) {
                                        break;
                                    }
                                    class77 var52 = var33 ? class38.field983 : class90.field2326;
                                    var8--;
                                    int var53 = class4.field77[var8];
                                    class79.method590(-1974, var52.field1920, var53, var52.field1928 & 0x7FFF);
                                }
                            } else if (var18 >= 3200) {
                                if (var18 >= 3300) {
                                    if (var18 < 3400) {
                                        if (var18 == 3300) {
                                            class4.field77[var8++] = class26.field699;
                                        } else if (var18 == 3301) {
                                            var8 -= 2;
                                            int var54 = class4.field77[var8 + 1];
                                            int var55 = class4.field77[var8];
                                            class4.field77[var8++] = class120.method903(var54, var55, -1);
                                        } else {
                                            if (var18 != 3302) {
                                                break;
                                            }
                                            var8 -= 2;
                                            int var56 = class4.field77[var8];
                                            int var57 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = class85.method624(-127, var57, var56);
                                        }
                                    } else if (var18 < 4100) {
                                        if (var18 == 4000) {
                                            var8 -= 2;
                                            int var58 = class4.field77[var8 + 1];
                                            int var59 = class4.field77[var8];
                                            class4.field77[var8++] = var59 + var58;
                                        } else if (var18 == 4001) {
                                            var8 -= 2;
                                            int var60 = class4.field77[var8];
                                            int var61 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = var60 - var61;
                                        } else if (var18 == 4002) {
                                            var8 -= 2;
                                            int var62 = class4.field77[var8];
                                            int var63 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = var62 * var63;
                                        } else if (var18 == 4003) {
                                            var8 -= 2;
                                            int var64 = class4.field77[var8];
                                            int var65 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = var64 / var65;
                                        } else if (var18 == 4004) {
                                            var8--;
                                            int var66 = class4.field77[var8];
                                            class4.field77[var8++] = (int) (Math.random() * (double) var66);
                                        } else if (var18 == 4005) {
                                            var8--;
                                            int var67 = class4.field77[var8];
                                            class4.field77[var8++] = (int) (Math.random() * (double) (var67 + 1));
                                        } else if (var18 == 4006) {
                                            var8 -= 5;
                                            int var68 = class4.field77[var8 + 1];
                                            int var69 = class4.field77[var8];
                                            int var70 = class4.field77[var8 + 2];
                                            int var71 = class4.field77[var8 + 3];
                                            int var72 = class4.field77[var8 + 4];
                                            class4.field77[var8++] = (var68 - var69) * (-var70 + var72) / (var71 - var70) + var69;
                                        } else if (var18 == 4007) {
                                            var8 -= 2;
                                            int var73 = class4.field77[var8];
                                            int var74 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = var73 + var73 * var74 / 100;
                                        } else if (var18 == 4008) {
                                            var8 -= 2;
                                            int var75 = class4.field77[var8];
                                            int var76 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = class100.method756(var75, 0x1 << var76);
                                        } else if (var18 == 4009) {
                                            var8 -= 2;
                                            int var77 = class4.field77[var8];
                                            int var78 = class4.field77[var8 + 1];
                                            class4.field77[var8++] = class81.method605(var77, -(0x1 << var78) - 1);
                                        } else if (var18 == 4010) {
                                            var8 -= 2;
                                            int var79 = class4.field77[var8 + 1];
                                            int var80 = class4.field77[var8];
                                            class4.field77[var8++] = class81.method605(var80, 0x1 << var79) == 0 ? 0 : 1;
                                        } else if (var18 == 4011) {
                                            var8 -= 2;
                                            int var81 = class4.field77[var8 + 1];
                                            int var82 = class4.field77[var8];
                                            class4.field77[var8++] = var82 % var81;
                                        } else if (var18 == 4012) {
                                            var8 -= 2;
                                            int var83 = class4.field77[var8];
                                            int var84 = class4.field77[var8 + 1];
                                            if (var83 == 0) {
                                                class4.field77[var8++] = 0;
                                            } else {
                                                class4.field77[var8++] = (int) Math.pow((double) var83, (double) var84);
                                            }
                                        } else {
                                            if (var18 != 4013) {
                                                break;
                                            }
                                            var8 -= 2;
                                            int var85 = class4.field77[var8 + 1];
                                            int var86 = class4.field77[var8];
                                            if (var86 == 0) {
                                                class4.field77[var8++] = 0;
                                            } else if (var85 == 0) {
                                                class4.field77[var8++] = Integer.MAX_VALUE;
                                            } else {
                                                class4.field77[var8++] = (int) Math.pow((double) var86, 1.0D / (double) var85);
                                            }
                                        }
                                    } else if (var18 >= 4200) {
                                        if (var18 >= 4300) {
                                            break;
                                        }
                                        if (var18 == 4200) {
                                            var8--;
                                            int var87 = class4.field77[var8];
                                            class47.field1143[var9++] = class39.method295(var87, class21.method156(arg4, 101)).field2713;
                                        } else if (var18 == 4201) {
                                            var8 -= 2;
                                            int var88 = class4.field77[var8 + 1];
                                            int var89 = class4.field77[var8];
                                            class110 var90 = class39.method295(var89, 1);
                                            if (var88 < 1 || var88 > 5 || var90.field2698[var88 - 1] == null) {
                                                class47.field1143[var9++] = class69.field1661;
                                            } else {
                                                class47.field1143[var9++] = var90.field2698[var88 - 1];
                                            }
                                        } else if (var18 == 4202) {
                                            var8 -= 2;
                                            int var91 = class4.field77[var8];
                                            int var92 = class4.field77[var8 + 1];
                                            class110 var93 = class39.method295(var91, arg4 ^ 0x65);
                                            if (var92 < 1 || var92 > 5 || var93.field2745[var92 - 1] == null) {
                                                class47.field1143[var9++] = class69.field1661;
                                            } else {
                                                class47.field1143[var9++] = var93.field2745[var92 - 1];
                                            }
                                        } else if (var18 == 4203) {
                                            var8--;
                                            int var94 = class4.field77[var8];
                                            class4.field77[var8++] = class39.method295(var94, 1).field2725;
                                        } else if (var18 == 4204) {
                                            var8--;
                                            int var95 = class4.field77[var8];
                                            class4.field77[var8++] = class39.method295(var95, 1).field2727 == 1 ? 1 : 0;
                                        } else if (var18 == 4205) {
                                            var8--;
                                            int var96 = class4.field77[var8];
                                            class110 var97 = class39.method295(var96, 1);
                                            if (var97.field2710 == -1 && var97.field2706 >= 0) {
                                                class4.field77[var8++] = var97.field2706;
                                            } else {
                                                class4.field77[var8++] = var96;
                                            }
                                        } else if (var18 == 4206) {
                                            var8--;
                                            int var98 = class4.field77[var8];
                                            class110 var99 = class39.method295(var98, 1);
                                            if (var99.field2710 >= 0 && var99.field2706 >= 0) {
                                                class4.field77[var8++] = var99.field2706;
                                            } else {
                                                class4.field77[var8++] = var98;
                                            }
                                        } else {
                                            if (var18 != 4207) {
                                                break;
                                            }
                                            var8--;
                                            int var100 = class4.field77[var8];
                                            class4.field77[var8++] = class39.method295(var100, 1).field2737 ? 1 : 0;
                                        }
                                    } else if (var18 == 4100) {
                                        var9--;
                                        class94 var101 = class47.field1143[var9];
                                        var8--;
                                        int var102 = class4.field77[var8];
                                        class47.field1143[var9++] = class4.method20(new class94[] { var101, class51.method403(var102, true) }, true);
                                    } else if (var18 == 4101) {
                                        var9 -= 2;
                                        class94 var103 = class47.field1143[var9];
                                        class94 var104 = class47.field1143[var9 + 1];
                                        class47.field1143[var9++] = class4.method20(new class94[] { var103, var104 }, true);
                                    } else if (var18 == 4102) {
                                        var8--;
                                        int var105 = class4.field77[var8];
                                        var9--;
                                        class94 var106 = class47.field1143[var9];
                                        class47.field1143[var9++] = class4.method20(new class94[] { var106, class74.method555((byte) 117, true, var105) }, true);
                                    } else if (var18 == 4103) {
                                        var9--;
                                        class94 var107 = class47.field1143[var9];
                                        class47.field1143[var9++] = var107.method723((byte) 46);
                                    } else if (var18 == 4104) {
                                        var8--;
                                        int var108 = class4.field77[var8];
                                        long var109 = ((long) var108 + 11745L) * 86400000L;
                                        class57.field1437.setTime(new Date(var109));
                                        int var111 = class57.field1437.get(5);
                                        int var112 = class57.field1437.get(2);
                                        int var113 = class57.field1437.get(1);
                                        class47.field1143[var9++] = class4.method20(new class94[] { class51.method403(var111, true), class67.field1648, class62.field1514[var112], class67.field1648, class51.method403(var113, true) }, true);
                                    } else if (var18 == 4105) {
                                        var9 -= 2;
                                        class94 var114 = class47.field1143[var9 + 1];
                                        class94 var115 = class47.field1143[var9];
                                        if (class80.field2044.field2299 != null && class80.field2044.field2299.field1681) {
                                            class47.field1143[var9++] = var114;
                                        } else {
                                            class47.field1143[var9++] = var115;
                                        }
                                    } else if (var18 == 4106) {
                                        var8--;
                                        int var116 = class4.field77[var8];
                                        class47.field1143[var9++] = class51.method403(var116, true);
                                    } else {
                                        if (var18 != 4107) {
                                            break;
                                        }
                                        var9 -= 2;
                                        class4.field77[var8++] = class47.field1143[var9].method700((byte) -107, class47.field1143[var9 + 1]);
                                    }
                                } else if (var18 == 3200) {
                                    var8 -= 3;
                                    class40.method305(class4.field77[var8], 0, class4.field77[var8 + 1], class4.field77[var8 + 2]);
                                } else if (var18 == 3201) {
                                    var8--;
                                    class97.method736(class4.field77[var8], (byte) -115);
                                } else {
                                    if (var18 != 3202) {
                                        break;
                                    }
                                    var8 -= 2;
                                    class120.method907(class4.field77[var8 + 1], class4.field77[var8], (byte) 119);
                                }
                            } else if (var18 == 3100) {
                                var9--;
                                class94 var117 = class47.field1143[var9];
                                class41.method311(0, class69.field1661, (byte) 63, var117);
                            } else if (var18 == 3101) {
                                var8 -= 2;
                                class126.method1001(class4.field77[var8 + 1], class4.field77[var8], (byte) 55, class80.field2044);
                            } else {
                                if (var18 != 3102) {
                                    break;
                                }
                                var8--;
                                int var118 = class4.field77[var8];
                                if (var118 >= 0 && var118 < class42.field1065.length && class42.field1065[var118] != -1) {
                                    class135.field3323 = true;
                                    class92.field2361 = var118;
                                    class121.field3033 = true;
                                }
                            }
                        } else if (var18 == 2401) {
                            var8 -= 4;
                            int var122 = class4.field77[var8];
                            int var123 = class4.field77[var8 + 1];
                            int var124 = class4.field77[var8 + 2];
                            boolean var125 = class4.field77[var8 + 3] == 1;
                            class77 var126 = class123.method978(-22030, 0, -1, var123, 0, var125, var124, class108.field2673[var122], false);
                            if (var126 == null) {
                                class4.field77[var8++] = -1;
                            } else {
                                class4.field77[var8++] = var126.field1928;
                            }
                        } else {
                            if (var18 != 2402) {
                                break;
                            }
                            var8 -= 4;
                            class77 var127 = class63.method466((byte) -38, class4.field77[var8]);
                            int var128 = class4.field77[var8 + 1];
                            int var129 = class4.field77[var8 + 2];
                            boolean var130 = class4.field77[var8 + 3] == 1;
                            class77 var131 = class123.method978(-22030, var127.field1915, var127.field1928, var128, var127.field1873, var130, var129, class108.field2673[var127.field1928 >> 16], false);
                            if (var131 == null) {
                                class4.field77[var8++] = -1;
                            } else {
                                class4.field77[var8++] = var131.field1928;
                            }
                        }
                    } else if (var18 == 1400) {
                        var8 -= 2;
                        int var134 = class4.field77[var8 + 1];
                        int var135 = class4.field77[var8];
                        class77 var136 = class63.method466((byte) -38, var135);
                        if (var136.field1918 == null || var134 >= var136.field1918.length || var136.field1918[var134] == null) {
                            class4.field77[var8++] = 0;
                        } else {
                            class4.field77[var8++] = 1;
                            if (var33) {
                                class38.field983 = var136.field1918[var134];
                            } else {
                                class90.field2326 = var136.field1918[var134];
                            }
                        }
                    } else if (var18 == 1401) {
                        var8 -= 4;
                        int var137 = class4.field77[var8];
                        int var138 = class4.field77[var8 + 1];
                        int var139 = class4.field77[var8 + 2];
                        boolean var140 = class4.field77[var8 + 3] == 1;
                        class77 var141 = class123.method978(-22030, 0, -1, var138, 0, var140, var139, class108.field2673[var137], true);
                        if (var141 == null) {
                            class4.field77[var8++] = 0;
                        } else {
                            class4.field77[var8++] = 1;
                            if (var33) {
                                class38.field983 = var141;
                            } else {
                                class90.field2326 = var141;
                            }
                        }
                    } else {
                        if (var18 != 1402) {
                            break;
                        }
                        var8 -= 4;
                        class77 var142 = class63.method466((byte) -38, class4.field77[var8]);
                        int var143 = class4.field77[var8 + 1];
                        int var144 = class4.field77[var8 + 2];
                        boolean var145 = class4.field77[var8 + 3] == 1;
                        class77 var146 = class123.method978(-22030, var142.field1915, var142.field1928, var143, var142.field1873, var145, var144, var142.field1918, true);
                        if (var146 == null) {
                            class4.field77[var8++] = 0;
                        } else {
                            class4.field77[var8++] = 1;
                            if (var33) {
                                class38.field983 = var146;
                            } else {
                                class90.field2326 = var146;
                            }
                        }
                    }
                } else if (var18 == 100) {
                    var8 -= 3;
                    int var148 = class4.field77[var8];
                    int var149 = class4.field77[var8 + 1];
                    int var150 = class4.field77[var8 + 2];
                    class77 var151 = class63.method466((byte) -38, var148);
                    if (var151.field1918 == null) {
                        var151.field1918 = new class77[var150 + 1];
                    }
                    if (var150 >= var151.field1918.length) {
                        class77[] var152 = new class77[var150 + 1];
                        for (int var153 = 0; var153 < var151.field1918.length; var153++) {
                            var152[var153] = var151.field1918[var153];
                        }
                        var151.field1918 = var152;
                    }
                    class77 var154 = new class77();
                    var154.field1920 = var151.field1928;
                    var154.field1917 = var149;
                    var154.field1928 = ((var151.field1928 & 0xFFFF) << 15) + var150 + Integer.MIN_VALUE;
                    var154.field1895 = true;
                    var151.field1918[var150] = var154;
                    if (var33) {
                        class38.field983 = var154;
                    } else {
                        class90.field2326 = var154;
                    }
                    class9.method58(var151, -1);
                } else if (var18 == 101) {
                    class77 var155 = var33 ? class38.field983 : class90.field2326;
                    class77 var156 = class63.method466((byte) -38, var155.field1920);
                    var156.field1918[class81.method605(32767, var155.field1928)] = null;
                    class9.method58(var156, -1);
                } else {
                    if (var18 != 102) {
                        break;
                    }
                    var8--;
                    class77 var157 = class63.method466((byte) -38, class4.field77[var8]);
                    var157.field1918 = null;
                    class9.method58(var157, -1);
                }
            }
        } catch (Exception var158) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V", line = 1731)
    public static final void method434(byte arg0, int arg1) {
        field1408++;
        for (class94.field2384 += arg1; class94.field2384 >= class43.field1083; class94.field2384 -= class43.field1083) {
            class57.field1453 -= class57.field1453 >> 2;
        }
        class57.field1453 -= arg1 * 1000;
        if (class57.field1453 < 0) {
            class57.field1453 = 0;
        }
        if (arg0 <= 11) {
            field1399 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI[BI)V", line = 1758)
    public final void method435(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1400++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field1411 != -1L && this.field1395 >= this.field1411 && (long) arg1 + this.field1395 <= (long) this.field1409 + this.field1411) {
                class32.method267(this.field1386, (int) (this.field1395 - this.field1411), arg2, arg3, arg1);
                this.field1395 += arg1;
                return;
            }
            long var5 = this.field1395;
            int var7 = arg3;
            int var8 = arg1;
            if (arg0 > -13) {
                this.field1386 = null;
            }
            if (this.field1412 <= this.field1395 && this.field1395 < (long) this.field1389 + this.field1412) {
                int var9 = (int) ((long) this.field1389 + this.field1412 - this.field1395);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class32.method267(this.field1391, (int) (this.field1395 - this.field1412), arg2, arg3, var9);
                arg1 -= var9;
                arg3 += var9;
                this.field1395 += var9;
            }
            if (arg1 > this.field1391.length) {
                this.field1407.method772(this.field1395, 0);
                this.field1388 = this.field1395;
                while (arg1 > 0) {
                    int var11 = this.field1407.method770(arg1, 1, arg2, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field1388 += var11;
                    arg1 -= var11;
                    this.field1395 += var11;
                    arg3 += var11;
                }
            } else if (arg1 > 0) {
                int var10 = arg1;
                this.method439(-60);
                if (this.field1389 < arg1) {
                    var10 = this.field1389;
                }
                arg1 -= var10;
                class32.method267(this.field1391, 0, arg2, arg3, var10);
                this.field1395 += var10;
                arg3 += var10;
            }
            if (this.field1411 != -1L) {
                if (this.field1395 < this.field1411 && arg1 > 0) {
                    int var12 = (int) (this.field1411 - this.field1395) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg1--;
                        this.field1395++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field1411 && var5 + (long) var8 > this.field1411) {
                    var13 = this.field1411;
                } else if (this.field1411 <= var5 && this.field1411 + (long) this.field1409 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field1411 + (long) this.field1409 > var5 && (long) this.field1409 + this.field1411 <= (long) var8 + var5) {
                    var15 = (long) this.field1409 + this.field1411;
                } else if (this.field1411 < (long) var8 + var5 && (long) var8 + var5 <= this.field1411 - -((long) this.field1409)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class32.method267(this.field1386, (int) (var13 - this.field1411), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1395) {
                        arg1 = (int) ((long) arg1 + this.field1395 - var15);
                        this.field1395 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1388 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 1945)
    public static final void method436(boolean arg0) {
        if (!arg0) {
            field1384 = -109;
        }
        field1396++;
        class54.field1327 = 0;
        int var1 = (class80.field2044.field222 >> 7) + class45.field1117;
        int var2 = (class80.field2044.field177 >> 7) + class31.field891;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class54.field1327 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class54.field1327 = 1;
        }
        if (class54.field1327 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class54.field1327 = 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 1976)
    public final void method437(int arg0) throws IOException {
        this.method438(0);
        field1403++;
        if (arg0 != -27669) {
            field1393 = null;
        }
        this.field1407.method771(119);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 1994)
    private final void method438(int arg0) throws IOException {
        if (arg0 != 0) {
            method436(true);
        }
        field1404++;
        if (this.field1411 == -1L) {
            return;
        }
        if (this.field1411 != this.field1388) {
            this.field1407.method772(this.field1411, 0);
            this.field1388 = this.field1411;
        }
        this.field1407.method768(this.field1409, 32, 0, this.field1386);
        this.field1388 += this.field1409;
        long var2 = -1L;
        if (this.field1415 < this.field1388) {
            this.field1415 = this.field1388;
        }
        long var4 = -1L;
        if (this.field1412 < (long) this.field1409 + this.field1411 && (long) this.field1389 + this.field1412 >= (long) this.field1409 + this.field1411) {
            var4 = (long) this.field1409 + this.field1411;
        } else if (this.field1412 + (long) this.field1389 > this.field1411 && (long) this.field1389 + this.field1412 <= (long) this.field1409 + this.field1411) {
            var4 = (long) this.field1389 + this.field1412;
        }
        if (this.field1412 <= this.field1411 && this.field1411 < this.field1412 + (long) this.field1389) {
            var2 = this.field1411;
        } else if (this.field1412 >= this.field1411 && (long) this.field1409 + this.field1411 > this.field1412) {
            var2 = this.field1412;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class32.method267(this.field1386, (int) (var2 - this.field1411), this.field1391, (int) (var2 - this.field1412), var6);
        }
        this.field1411 = -1L;
        this.field1409 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 2072)
    private final void method439(int arg0) throws IOException {
        field1414++;
        this.field1389 = 0;
        if (this.field1395 != this.field1388) {
            this.field1407.method772(this.field1395, 0);
            this.field1388 = this.field1395;
        }
        this.field1412 = this.field1395;
        while (this.field1391.length > this.field1389) {
            int var2 = this.field1407.method770(this.field1391.length - this.field1389, 1, this.field1391, this.field1389);
            if (var2 == -1) {
                break;
            }
            this.field1388 += var2;
            this.field1389 += var2;
        }
        int var3 = -1 % ((arg0 - 30) / 49);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lec;", line = 2110)
    public static final class27 method440(int arg0, byte arg1) {
        field1385++;
        class27 var2 = (class27) class33.field917.method1007((long) arg0, (byte) -122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field2902.method808((byte) 68, 6, arg0);
        class27 var4 = new class27();
        var4.field770 = arg0;
        if (var3 != null) {
            var4.method237(new class122(var3), arg1 ^ 0x16);
        }
        if (arg1 != 76) {
            return null;
        }
        var4.method242(arg1 ^ 0xFFFFD527);
        if (var4.field728) {
            var4.field725 = false;
            var4.field727 = false;
        }
        class33.field917.method1012(50, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V", line = 2142)
    public static void method441(int arg0) {
        field1410 = null;
        field1393 = null;
        field1405 = null;
        field1399 = null;
        field1401 = null;
        field1390 = null;
        field1402 = null;
        if (arg0 < 37) {
            method440(59, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[B)V", line = 2175)
    public final void method442(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1416++;
        try {
            if ((long) arg0 + this.field1395 > this.field1406) {
                this.field1406 = (long) arg0 + this.field1395;
            }
            if (this.field1411 != -1L && (this.field1411 > this.field1395 || (long) this.field1409 + this.field1411 < this.field1395)) {
                this.method438(0);
            }
            if (arg1 != -1) {
                method441(101);
            }
            if (this.field1411 != -1L && this.field1411 + (long) this.field1386.length < (long) arg0 + this.field1395) {
                int var5 = (int) ((long) this.field1386.length + this.field1411 - this.field1395);
                class32.method267(arg3, arg2, this.field1386, (int) (this.field1395 - this.field1411), var5);
                arg2 += var5;
                arg0 -= var5;
                this.field1395 += var5;
                this.field1409 = this.field1386.length;
                this.method438(arg1 + 1);
            }
            if (this.field1386.length < arg0) {
                if (this.field1395 != this.field1388) {
                    this.field1407.method772(this.field1395, 0);
                    this.field1388 = this.field1395;
                }
                this.field1407.method768(arg0, 122, arg2, arg3);
                this.field1388 += arg0;
                long var6 = -1L;
                if (this.field1415 < this.field1388) {
                    this.field1415 = this.field1388;
                }
                long var8 = -1L;
                if (this.field1412 < (long) arg0 + this.field1395 && (long) this.field1389 + this.field1412 >= (long) arg0 + this.field1395) {
                    var6 = (long) arg0 + this.field1395;
                } else if (this.field1395 < this.field1412 + (long) this.field1389 && (long) this.field1389 + this.field1412 <= this.field1395 - -((long) arg0)) {
                    var6 = (long) this.field1389 + this.field1412;
                }
                if (this.field1412 <= this.field1395 && (long) this.field1389 + this.field1412 > this.field1395) {
                    var8 = this.field1395;
                } else if (this.field1412 >= this.field1395 && this.field1395 + (long) arg0 > this.field1412) {
                    var8 = this.field1412;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class32.method267(arg3, (int) ((long) arg2 + var8 - this.field1395), this.field1391, (int) (var8 - this.field1412), var10);
                }
                this.field1395 += arg0;
            } else if (arg0 > 0) {
                if (this.field1411 == -1L) {
                    this.field1411 = this.field1395;
                }
                class32.method267(arg3, arg2, this.field1386, (int) (this.field1395 - this.field1411), arg0);
                this.field1395 += arg0;
                if ((long) this.field1409 < this.field1395 - this.field1411) {
                    this.field1409 = (int) (this.field1395 - this.field1411);
                }
            }
        } catch (IOException var12) {
            this.field1388 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 2307)
    public static final void method443(byte arg0) {
        field1397++;
        for (int var1 = -1; var1 < class113.field2886; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class38.field985[var1];
            }
            class89 var3 = class85.field2138[var2];
            if (var3 != null) {
                class111.method826(1, var3, 128);
            }
        }
        if (arg0 != 4) {
            method433(null, 30, 85, 110, -37, null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)J", line = 2346)
    public final long method444(byte arg0) {
        if (arg0 < 51) {
            method436(false);
        }
        field1398++;
        return this.field1406;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lrc;II)V", line = 2403)
    public class55(class104 arg0, int arg1, int arg2) throws IOException {
        this.field1407 = arg0;
        this.field1406 = this.field1415 = arg0.method769(32014);
        this.field1395 = 0L;
        this.field1386 = new byte[arg2];
        this.field1391 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)V", line = 2390)
    public final void method445(byte arg0, long arg1) {
        field1394++;
        if (arg1 >= 0L) {
            if (arg0 >= -87) {
                method434((byte) 91, -108);
            }
            this.field1395 = arg1;
        }
    }
}
