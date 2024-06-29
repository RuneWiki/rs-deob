import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class120 extends class110 {

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field2880 = -1;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Lsa;")
    public static class119 field2871 = new class119(64);

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lmb;")
    private static class84 field2883 = class79.method672(true, "yellow:");

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lmb;")
    public static class84 field2884 = field2883;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lsa;")
    public static class119 field2887 = new class119(260);

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field2891 = 0;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    public static int field2893 = 0;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "Lmb;")
    public static class84 field2895 = class79.method672(true, "(X");

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lmb;")
    public static class84 field2894 = class79.method672(true, "backleft1");

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lsc;")
    public static class121 field2872;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Lge;")
    public static class47 field2870;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Ljd;")
    public static class66 field2889;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "[I")
    public int[] field2875;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "[I")
    public int[] field2888;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "[Lmb;")
    public class84[] field2881;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public static final void method972(int arg0) {
        field2879++;
        for (class59 var1 = (class59) class62.field1536.method104((byte) 101); var1 != null; var1 = (class59) class62.field1536.method107(-2)) {
            if (var1.field1478 != null) {
                class60.field1490.method1080(var1.field1478);
                var1.field1478 = null;
            }
            if (var1.field1454 != null) {
                class60.field1490.method1080(var1.field1454);
                var1.field1454 = null;
            }
        }
        class62.field1536.method96(-115);
        if (arg0 != 1) {
            field2894 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2889 = null;
        field2887 = null;
        if (arg0 != 4) {
            return;
        }
        field2870 = null;
        field2884 = null;
        field2872 = null;
        field2883 = null;
        field2871 = null;
        field2894 = null;
        field2895 = null;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
    public static final boolean method974(int arg0) {
        field2878++;
        if (class125.field3030 == null) {
            return false;
        }
        try {
            int var1 = class125.field3030.method37(arg0 ^ 0x5C);
            if (~var1 == arg0) {
                return false;
            }
            if (class103.field2508 == -1) {
                var1--;
                class125.field3030.method40(0, 1, -19746, class87.field2148.field1084);
                class87.field2148.field1128 = 0;
                class103.field2508 = class87.field2148.method761(7595);
                class86.field2128 = class80.field1987[class103.field2508];
            }
            if (class86.field2128 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class125.field3030.method40(0, 1, -19746, class87.field2148.field1084);
                class86.field2128 = class87.field2148.field1084[0] & 0xFF;
            }
            if (class86.field2128 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class125.field3030.method40(0, 2, -19746, class87.field2148.field1084);
                class87.field2148.field1128 = 0;
                class86.field2128 = class87.field2148.method383(arg0 - 2056200759);
                var1 -= 2;
            }
            if (var1 < class86.field2128) {
                return false;
            }
            class87.field2148.field1128 = 0;
            class125.field3030.method40(0, class86.field2128, -19746, class87.field2148.field1084);
            class30.field703 = class91.field2268;
            class91.field2268 = class75.field1862;
            class74.field1829 = 0;
            class75.field1862 = class103.field2508;
            if (class103.field2508 == 185) {
                class141.field3382 = class87.field2148.method383(-2056200760);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 201) {
                int var2 = class87.field2148.method399(-539722392);
                class84 var3 = class87.field2148.method413(0);
                class57 var4 = class97.method805(-894550512, var2);
                var4.field1377 = var3;
                if (var2 >> 16 == class72.field1777[class68.field1654]) {
                    class89.field2220 = true;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 172) {
                int var5 = class87.field2148.method375((byte) -33);
                if (var5 >= 0) {
                    class16.method98(var5, (byte) -127);
                }
                if (client.field493 != var5) {
                    class8.method44(client.field493, true);
                    client.field493 = var5;
                }
                class95.method796(arg0 + 104, client.field493);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 91) {
                class1.field2 = class87.field2148.method373(arg0 ^ 0xFFFF9DF9);
                class138.field3332 = class87.field2148.method373(arg0 ^ 0xFFFF9DF9);
                for (int var6 = class1.field2; var6 < class1.field2 + 8; var6++) {
                    for (int var7 = class138.field3332; var7 < class138.field3332 + 8; var7++) {
                        if (class39.field875[class13.field251][var6][var7] != null) {
                            class39.field875[class13.field251][var6][var7] = null;
                            class98.method816(var7, (byte) -128, var6);
                        }
                    }
                }
                for (class144 var8 = (class144) class91.field2281.method104((byte) 101); var8 != null; var8 = (class144) class91.field2281.method107(-2)) {
                    if (var8.field3461 >= class1.field2 && class1.field2 + 8 > var8.field3461 && var8.field3470 >= class138.field3332 && var8.field3470 < class138.field3332 + 8 && class13.field251 == var8.field3457) {
                        var8.field3458 = 0;
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 2) {
                int var9 = class87.field2148.method399(-539722392);
                class69.field1692 = class115.field2770.method1196((byte) -123, var9);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 255) {
                int var10 = class87.field2148.method383(-2056200760);
                int var11 = class87.field2148.method369(false);
                class57 var12 = class97.method805(-894550512, var11);
                class103.field2508 = -1;
                var12.field1355 = var10;
                var12.field1430 = 2;
                return true;
            }
            if (class103.field2508 == 156) {
                int var13 = class87.field2148.method400((byte) 112);
                int var14 = class87.field2148.method392(arg0 - 25303);
                class57 var15 = class97.method805(-894550512, var14);
                if (var15 != null && var15.field1385 == 0) {
                    if (var13 > var15.field1314 - var15.field1332) {
                        var13 = var15.field1314 - var15.field1332;
                    }
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    var15.field1334 = var13;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 223) {
                int var16 = class87.field2148.method399(-539722392);
                class57 var17 = class97.method805(arg0 ^ 0x3551C1EF, var16);
                for (int var18 = 0; var18 < var17.field1349.length; var18++) {
                    var17.field1349[var18] = -1;
                    var17.field1349[var18] = 0;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 58) {
                int var19 = class87.field2148.method392(-25304);
                class57 var20 = class97.method805(-894550512, var19);
                var20.field1430 = 3;
                var20.field1355 = class40.field925.field1528.method423((byte) -115);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 135) {
                class86.field2133 = class86.field2128 / 8;
                for (int var21 = 0; var21 < class86.field2133; var21++) {
                    class71.field1747[var21] = class87.field2148.method401(true);
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 148) {
                class1.field2 = class87.field2148.method365(arg0 - 87);
                class138.field3332 = class87.field2148.method365(arg0 ^ 0x79);
                while (class87.field2148.field1128 < class86.field2128) {
                    class103.field2508 = class87.field2148.method373(25094);
                    class22.method150(arg0 ^ 0xFFFFFF99);
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 142) {
                int var22 = class87.field2148.method383(arg0 - 2056200759);
                int var23 = class87.field2148.method417(65280);
                class16.method98(var22, (byte) -127);
                if (var23 != -1) {
                    class16.method98(var23, (byte) -128);
                }
                if (class79.field1958 != -1) {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = -1;
                }
                if (class89.field2233 != -1) {
                    class8.method44(class89.field2233, true);
                    class89.field2233 = -1;
                }
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                }
                if (class122.field2948 == var22) {
                    class43.method319(-8808784, class122.field2948);
                } else {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = var22;
                    class51.method387(100, 35);
                }
                if (class50.field1070 == var22) {
                    class43.method319(-8808784, class50.field1070);
                } else {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = var23;
                }
                class143.field3432 = -1;
                class92.field2289 = 0;
                class95.method796(118, class122.field2948);
                class95.method796(112, class50.field1070);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 177) {
                class68.method606(true);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 157) {
                int var24 = class87.field2148.method369(false);
                int var25 = class87.field2148.method375((byte) -33);
                int var26 = class87.field2148.method372(arg0 + 256);
                class57 var27 = class97.method805(-894550512, var24);
                var27.field1348 = var27.field1406 + var26;
                var27.field1433 = var27.field1336 + var25;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 206) {
                int var28 = class87.field2148.method399(-539722392);
                int var29 = class87.field2148.method415(255);
                class57 var30 = class97.method805(-894550512, var28);
                if (var30.field1408 != var29 || var29 == -1) {
                    var30.field1320 = 0;
                    var30.field1361 = 0;
                    var30.field1408 = var29;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 38) {
                class77.field1933 = class87.field2148.method373(arg0 + 25095);
                class129.field3102 = class5.field100;
                class89.field2220 = true;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 37) {
                class68.field1654 = class87.field2148.method366((byte) -31);
                class103.field2508 = -1;
                class89.field2220 = true;
                class95.field2365 = true;
                return true;
            }
            if (class103.field2508 == 242) {
                int var31 = class87.field2148.method383(-2056200760);
                int var32 = class87.field2148.method373(25094);
                int var33 = class87.field2148.method383(arg0 - 2056200759);
                class89.method764(var33, var31, var32, -7642);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 203) {
                class128.field3085 = class87.field2148.method373(25094);
                class103.field2508 = -1;
                if (class68.field1654 == class128.field3085) {
                    if (class128.field3085 == 3) {
                        class68.field1654 = 1;
                    } else {
                        class68.field1654 = 3;
                    }
                    class89.field2220 = true;
                }
                return true;
            }
            if (class103.field2508 == 118) {
                int var34 = class87.field2148.method399(-539722392);
                boolean var35 = class87.field2148.method373(arg0 ^ 0xFFFF9DF9) == 1;
                class57 var36 = class97.method805(-894550512, var34);
                class103.field2508 = -1;
                var36.field1415 = var35;
                return true;
            }
            if (class103.field2508 == 152) {
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                }
                class111.field2683 = false;
                class103.field2508 = -1;
                class95.field2346 = class95.field2361;
                class92.field2289 = 2;
                class65.field1615 = true;
                return true;
            }
            if (class103.field2508 == 55) {
                class138.field3330 = true;
                class6.field116 = class87.field2148.method373(25094);
                class40.field924 = class87.field2148.method373(25094);
                class46.field996 = class87.field2148.method383(-2056200760);
                class54.field1244 = class87.field2148.method373(25094);
                class77.field1946 = class87.field2148.method373(25094);
                if (class77.field1946 >= 100) {
                    class59.field1463 = class40.field924 * 128 + 64;
                    class33.field733 = class6.field116 * 128 + 64;
                    class64.field1575 = class41.method309((byte) 64, class33.field733, class59.field1463, class13.field251) - class46.field996;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 64) {
                for (int var37 = 0; var37 < class141.field3416.length; var37++) {
                    if (class141.field3416[var37] != class138.field3337[var37]) {
                        class141.field3416[var37] = class138.field3337[var37];
                        class86.method741((byte) 85, var37);
                        class89.field2220 = true;
                    }
                }
                class103.field2508 = -1;
                class129.field3102 = class5.field100;
                return true;
            }
            if (class103.field2508 == 95) {
                int var38 = class87.field2148.method407(-75);
                int var39 = class87.field2148.method400((byte) 101);
                class138.field3337[var39] = var38;
                if (class141.field3416[var39] != var38) {
                    class141.field3416[var39] = var38;
                    class86.method741((byte) 85, var39);
                    if (field2880 != -1) {
                        class65.field1615 = true;
                    }
                    class89.field2220 = true;
                }
                class103.field2508 = -1;
                class129.field3102 = class5.field100;
                return true;
            }
            if (class103.field2508 == 71) {
                for (int var40 = 0; var40 < class119.field2840; var40++) {
                    class10 var41 = class44.method321(var40, -51);
                    if (var41 != null && var41.field170 == 0) {
                        class138.field3337[var40] = 0;
                        class141.field3416[var40] = 0;
                    }
                }
                class129.field3102 = class5.field100;
                if (field2880 != -1) {
                    class65.field1615 = true;
                }
                class89.field2220 = true;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 4) {
                class89.field2220 = true;
                int var42 = class87.field2148.method366((byte) -31);
                int var43 = class87.field2148.method411((byte) -127);
                int var44 = class87.field2148.method407(arg0 ^ 0x7D);
                class66.field1625[var43] = var44;
                class30.field709[var43] = var42;
                class72.field1769[var43] = 1;
                for (int var45 = 0; var45 < 98; var45++) {
                    if (class107.field2594[var45] <= var44) {
                        class72.field1769[var43] = var45 + 2;
                    }
                }
                class74.field1815 = class5.field100;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 126) {
                int var46 = class87.field2148.method400((byte) -73);
                class16.method98(var46, (byte) -127);
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class65.field1615 = true;
                    class83.field2038 = -1;
                }
                if (class122.field2948 != -1) {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = -1;
                    class51.method387(18, 30);
                }
                if (class50.field1070 != -1) {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = -1;
                }
                if (class79.field1958 != -1) {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = -1;
                }
                if (class89.field2233 == var46) {
                    class43.method319(-8808784, class89.field2233);
                } else {
                    class8.method44(class89.field2233, true);
                    class89.field2233 = var46;
                }
                class95.field2365 = true;
                class89.field2220 = true;
                class143.field3432 = -1;
                if (class92.field2289 != 0) {
                    class92.field2289 = 0;
                    class65.field1615 = true;
                }
                class95.method796(117, class89.field2233);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 239) {
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                }
                class92.field2289 = 1;
                class111.field2683 = false;
                class65.field1615 = true;
                class95.field2346 = class95.field2361;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 249) {
                int var47 = class87.field2148.method400((byte) -44);
                int var48 = class87.field2148.method399(-539722392);
                class57 var49 = class97.method805(-894550512, var48);
                var49.field1430 = 1;
                class103.field2508 = -1;
                var49.field1355 = var47;
                return true;
            }
            if (class103.field2508 == 161) {
                int var50 = class87.field2148.method417(arg0 ^ 0xFFFF00FF);
                int var51 = class87.field2148.method399(-539722392);
                int var52 = class87.field2148.method417(65280);
                class57 var53 = class97.method805(-894550512, var51);
                class103.field2508 = -1;
                var53.field1328 = (var50 << 16) + var52;
                return true;
            }
            if (class103.field2508 == 43) {
                long var54 = class87.field2148.method401(true);
                int var56 = class87.field2148.method383(arg0 ^ 0x7A8F2237);
                int var57 = class87.field2148.method373(arg0 + 25095);
                class84 var58 = class15.method91(-20821, var54).method704(91);
                for (int var59 = 0; var59 < class125.field3024; var59++) {
                    if (class30.field710[var59] == var54) {
                        if (class71.field1741[var59] != var56) {
                            class71.field1741[var59] = var56;
                            class89.field2220 = true;
                            if (var56 > 0) {
                                class11.method64(class51.method408(new class84[] { var58, class129.field3118 }, 120), class95.field2361, arg0 - 95, 5);
                            }
                            if (var56 == 0) {
                                class11.method64(class51.method408(new class84[] { var58, class16.field331 }, 5), class95.field2361, arg0 ^ 0x51, 5);
                            }
                        }
                        class14.field270[var59] = var57;
                        var58 = null;
                        break;
                    }
                }
                if (var58 != null && class125.field3024 < 200) {
                    class30.field710[class125.field3024] = var54;
                    class27.field646[class125.field3024] = var58;
                    class71.field1741[class125.field3024] = var56;
                    class14.field270[class125.field3024] = var57;
                    class129.field3102 = class5.field100;
                    class89.field2220 = true;
                    class125.field3024++;
                }
                boolean var60 = false;
                while (!var60) {
                    var60 = true;
                    for (int var61 = 0; var61 < class125.field3024 - 1; var61++) {
                        if (class71.field1741[var61] != class77.field1944 && class71.field1741[var61 + 1] == class77.field1944 || class71.field1741[var61] == 0 && class71.field1741[var61 + 1] != 0) {
                            var60 = false;
                            int var62 = class71.field1741[var61];
                            class71.field1741[var61] = class71.field1741[var61 + 1];
                            class71.field1741[var61 + 1] = var62;
                            class84 var63 = class27.field646[var61];
                            class27.field646[var61] = class27.field646[var61 + 1];
                            class27.field646[var61 + 1] = var63;
                            long var64 = class30.field710[var61];
                            class30.field710[var61] = class30.field710[var61 + 1];
                            class30.field710[var61 + 1] = var64;
                            int var66 = class14.field270[var61];
                            class14.field270[var61] = class14.field270[var61 + 1];
                            class14.field270[var61 + 1] = var66;
                            class89.field2220 = true;
                        }
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 202) {
                long var67 = class87.field2148.method401(true);
                byte var69 = class87.field2148.method412((byte) -84);
                long var70 = class87.field2148.method401(true);
                long var72 = (long) class87.field2148.method383(-2056200760);
                long var74 = (long) class87.field2148.method374((byte) -26);
                long var76 = (var72 << 32) + var74;
                boolean var78 = false;
                int var79 = class87.field2148.method373(25094);
                for (int var80 = 0; var80 < 100; var80++) {
                    if (class75.field1863[var80] == var76) {
                        var78 = true;
                        break;
                    }
                }
                if (var79 <= 1) {
                    for (int var81 = 0; var81 < class86.field2133; var81++) {
                        if (class71.field1747[var81] == var67) {
                            var78 = true;
                            break;
                        }
                    }
                }
                if (!var78 && class70.field1700 == 0) {
                    class75.field1863[class14.field271] = var76;
                    class14.field271 = (class14.field271 + 1) % 100;
                    class84 var82 = class115.method947(arg0 ^ 0xFFFF8000, class87.field2148).method711(48);
                    class84 var83 = class51.method408(new class84[] { class43.field950, class15.method91(arg0 - 20820, var70), class106.field2563, class93.method787(22245, var69), class13.field246 }, 115);
                    if (var79 == 2 || var79 == 3) {
                        class11.method64(var82, class51.method408(new class84[] { var83, class24.field566, class15.method91(-20821, var67).method704(arg0 ^ 0x51) }, -43), arg0 ^ 0x39, 7);
                    } else if (var79 == 1) {
                        class11.method64(var82, class51.method408(new class84[] { var83, class75.field1857, class15.method91(arg0 - 20820, var67).method704(77) }, -124), -110, 7);
                    } else {
                        class11.method64(var82, class51.method408(new class84[] { var83, class15.method91(-20821, var67).method704(95) }, arg0 - 73), -109, 3);
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 207) {
                int var84 = class87.field2148.method409((byte) 27);
                class2.method19(29782, var84);
                class94.field2330 = class5.field100;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 200) {
                int var85 = class87.field2148.method373(25094);
                int var86 = class87.field2148.method373(arg0 + 25095);
                int var87 = class87.field2148.method373(25094);
                int var88 = class87.field2148.method373(arg0 + 25095);
                class133.field3194[var85] = true;
                class19.field408[var85] = var86;
                class76.field1892[var85] = var87;
                class118.field2826[var85] = var88;
                class119.field2846[var85] = 0;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 3) {
                int var89 = class87.field2148.method400((byte) -68);
                int var90 = class87.field2148.method407(-88);
                int var91 = class87.field2148.method417(65280);
                int var92 = class87.field2148.method417(65280);
                class57 var93 = class97.method805(-894550512, var90);
                var93.field1411 = var92;
                var93.field1319 = var91;
                class103.field2508 = -1;
                var93.field1381 = var89;
                return true;
            }
            if (class103.field2508 == 115) {
                int var94 = class87.field2148.method399(arg0 ^ 0x202B8297);
                int var95 = class87.field2148.method399(-539722392);
                int var96 = class87.field2148.method383(-2056200760);
                if (var96 == 65535) {
                    var96 = -1;
                }
                class57 var97 = class97.method805(-894550512, var95);
                if (var97.field1392) {
                    var97.field1427 = var96;
                    var97.field1420 = var94;
                    class13 var98 = class98.method813(-1, var96);
                    var97.field1411 = var98.field218;
                    if (var97.field1365 > 0) {
                        var97.field1411 = var97.field1411 * 32 / var97.field1365;
                    }
                    var97.field1386 = var98.field236;
                    var97.field1319 = var98.field258;
                    var97.field1421 = var98.field230;
                    var97.field1437 = var98.field259;
                    var97.field1381 = var98.field227;
                    class139.method1133(var97, arg0 ^ 0xFFFFFFA3);
                } else if (var96 == -1) {
                    class103.field2508 = -1;
                    var97.field1430 = 0;
                    return true;
                } else {
                    class13 var99 = class98.method813(-1, var96);
                    var97.field1381 = var99.field227;
                    var97.field1430 = 4;
                    var97.field1355 = var96;
                    var97.field1411 = var99.field218 * 100 / var94;
                    var97.field1319 = var99.field258;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 141) {
                class89.field2220 = true;
                int var100 = class87.field2148.method399(arg0 - 539722391);
                int var101 = class87.field2148.method383(-2056200760);
                if (var100 < -70000) {
                    var101 += 32768;
                }
                class57 var102;
                if (var100 >= 0) {
                    var102 = class97.method805(arg0 ^ 0x3551C1EF, var100);
                } else {
                    var102 = null;
                }
                while (class86.field2128 > class87.field2148.field1128) {
                    int var103 = class87.field2148.method382(arg0 + 256);
                    int var104 = class87.field2148.method383(-2056200760);
                    int var105 = 0;
                    if (var104 != 0) {
                        var105 = class87.field2148.method373(25094);
                        if (var105 == 255) {
                            var105 = class87.field2148.method399(-539722392);
                        }
                    }
                    if (var102 != null && var103 >= 0 && var103 < var102.field1349.length) {
                        var102.field1349[var103] = var104;
                        var102.field1394[var103] = var105;
                    }
                    class65.method582(var104 - 1, var101, var105, 0, var103);
                }
                class103.field2508 = -1;
                class94.field2330 = class5.field100;
                return true;
            }
            if (class103.field2508 == 133) {
                class65.field1609 = class87.field2148.method373(25094);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 69) {
                class117.method952(13773, true);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 138) {
                class36.method273((byte) -92);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 189) {
                class89.field2220 = true;
                int var106 = class87.field2148.method399(-539722392);
                int var107 = class87.field2148.method383(-2056200760);
                if (var106 < -70000) {
                    var107 += 32768;
                }
                class57 var108;
                if (var106 >= 0) {
                    var108 = class97.method805(-894550512, var106);
                } else {
                    var108 = null;
                }
                if (var108 != null) {
                    for (int var109 = 0; var109 < var108.field1349.length; var109++) {
                        var108.field1349[var109] = 0;
                        var108.field1394[var109] = 0;
                    }
                }
                class128.method1041((byte) 73, var107);
                int var110 = class87.field2148.method383(-2056200760);
                for (int var111 = 0; var111 < var110; var111++) {
                    int var112 = class87.field2148.method411((byte) 100);
                    if (var112 == 255) {
                        var112 = class87.field2148.method392(-25304);
                    }
                    int var113 = class87.field2148.method383(-2056200760);
                    if (var108 != null && var111 < var108.field1349.length) {
                        var108.field1349[var111] = var113;
                        var108.field1394[var111] = var112;
                    }
                    class65.method582(var113 - 1, var107, var112, 0, var111);
                }
                class103.field2508 = -1;
                class94.field2330 = class5.field100;
                return true;
            }
            if (class103.field2508 == 153) {
                class16.field339 = class87.field2148.method373(25094);
                if (class16.field339 == 1) {
                    class38.field849 = class87.field2148.method383(-2056200760);
                }
                if (class16.field339 >= 2 && class16.field339 <= 6) {
                    if (class16.field339 == 2) {
                        class117.field2805 = 64;
                        class62.field1552 = 64;
                    }
                    if (class16.field339 == 3) {
                        class62.field1552 = 64;
                        class117.field2805 = 0;
                    }
                    if (class16.field339 == 4) {
                        class62.field1552 = 64;
                        class117.field2805 = 128;
                    }
                    if (class16.field339 == 5) {
                        class117.field2805 = 64;
                        class62.field1552 = 0;
                    }
                    if (class16.field339 == 6) {
                        class62.field1552 = 128;
                        class117.field2805 = 64;
                    }
                    class16.field339 = 2;
                    class71.field1753 = class87.field2148.method383(-2056200760);
                    class133.field3170 = class87.field2148.method383(arg0 - 2056200759);
                    class76.field1918 = class87.field2148.method373(25094);
                }
                if (class16.field339 == 10) {
                    class94.field2339 = class87.field2148.method383(arg0 - 2056200759);
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 29) {
                int var114 = class87.field2148.method407(-100);
                int var115 = class87.field2148.method392(-25304);
                int var116 = class87.field2148.method409((byte) 27);
                if (var116 == 65535) {
                    var116 = -1;
                }
                long var117 = ((long) var114 << 32) + ((long) var116);
                class17 var119 = class50.field1071.method959(true, var117);
                if (var119 != null) {
                    var119.method121(false);
                }
                class50.field1071.method958(var117, new class19(var115), arg0 + 123);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 162) {
                class138.field3330 = true;
                class36.field788 = class87.field2148.method373(25094);
                class126.field3055 = class87.field2148.method373(25094);
                class63.field1570 = class87.field2148.method383(-2056200760);
                class84.field2111 = class87.field2148.method373(arg0 + 25095);
                class109.field2637 = class87.field2148.method373(arg0 + 25095);
                if (class109.field2637 >= 100) {
                    int var120 = class36.field788 * 128 + 64;
                    int var121 = class126.field3055 * 128 + 64;
                    int var122 = class41.method309((byte) 64, var120, var121, class13.field251) - class63.field1570;
                    int var123 = var122 - class64.field1575;
                    int var124 = var120 - class33.field733;
                    int var125 = var121 - class59.field1463;
                    int var126 = (int) Math.sqrt((double) (var124 * var124 + var125 * var125));
                    class50.field1072 = (int) (Math.atan2((double) var123, (double) var126) * 325.949D) & 0x7FF;
                    class71.field1733 = (int) (Math.atan2((double) var124, (double) var125) * -325.949D) & 0x7FF;
                    if (class50.field1072 < 128) {
                        class50.field1072 = 128;
                    }
                    if (class50.field1072 > 383) {
                        class50.field1072 = 383;
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 89) {
                int var127 = class87.field2148.method365(-68);
                class84 var128 = class87.field2148.method413(0);
                int var129 = class87.field2148.method411((byte) 114);
                if (var127 >= 1 && var127 <= 5) {
                    if (var128.method731((byte) 97, class92.field2290)) {
                        var128 = null;
                    }
                    class16.field332[var127 - 1] = var128;
                    class49.field1040[var127 - 1] = var129 == 0;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 144) {
                long var130 = class87.field2148.method401(true);
                long var132 = (long) class87.field2148.method383(-2056200760);
                boolean var134 = false;
                long var135 = (long) class87.field2148.method374((byte) -104);
                long var137 = (var132 << 32) + var135;
                int var139 = class87.field2148.method373(25094);
                for (int var140 = 0; var140 < 100; var140++) {
                    if (class75.field1863[var140] == var137) {
                        var134 = true;
                        break;
                    }
                }
                if (var139 <= 1) {
                    for (int var141 = 0; var141 < class86.field2133; var141++) {
                        if (class71.field1747[var141] == var130) {
                            var134 = true;
                            break;
                        }
                    }
                }
                if (!var134 && class70.field1700 == 0) {
                    class75.field1863[class14.field271] = var137;
                    class14.field271 = (class14.field271 + 1) % 100;
                    class84 var142 = class115.method947(32767, class87.field2148).method711(48);
                    if (var139 == 2 || var139 == 3) {
                        class11.method64(var142, class51.method408(new class84[] { class24.field566, class15.method91(-20821, var130).method704(-5) }, 103), arg0 - 79, 7);
                    } else if (var139 == 1) {
                        class11.method64(var142, class51.method408(new class84[] { class75.field1857, class15.method91(-20821, var130).method704(-22) }, -66), arg0 ^ 0x34, 7);
                    } else {
                        class11.method64(var142, class15.method91(arg0 ^ 0x5154, var130).method704(95), arg0 ^ 0x71, 3);
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 63) {
                class143.field3430 = class87.field2148.method373(25094);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 7) {
                if (class68.field1654 == 12) {
                    class89.field2220 = true;
                }
                class62.field1550 = class87.field2148.method373(25094);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 132) {
                int var143 = class87.field2148.method366((byte) -31);
                int var144 = class87.field2148.method417(65280);
                if (var144 == 65535) {
                    var144 = -1;
                }
                if (class72.field1777[var143] == var144) {
                    class43.method319(-8808784, class72.field1777[var143]);
                } else {
                    class8.method44(class72.field1777[var143], true);
                    class72.field1777[var143] = var144;
                }
                class95.field2365 = true;
                class89.field2220 = true;
                class95.method796(109, class72.field1777[var143]);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 178) {
                long var145 = class87.field2148.method401(true);
                class84 var147 = class115.method947(32767, class87.field2148).method711(48);
                class11.method64(var147, class15.method91(-20821, var145).method704(-16), arg0 ^ 0x46, 6);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 190) {
                class68.field1644 = class87.field2148.method409((byte) 27) * 30;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 240) {
                class84 var148 = class87.field2148.method413(0);
                if (var148.method722(class77.field1929, (byte) -124)) {
                    class84 var160 = var148.method723(false, var148.method729(65, class72.field1774), 0);
                    boolean var161 = false;
                    long var162 = var160.method700((byte) 25);
                    for (int var164 = 0; var164 < class86.field2133; var164++) {
                        if (class71.field1747[var164] == var162) {
                            var161 = true;
                            break;
                        }
                    }
                    if (!var161 && class70.field1700 == 0) {
                        class11.method64(class36.field797, var160, arg0 - 95, 4);
                    }
                } else if (var148.method722(class69.field1693, (byte) -126)) {
                    class84 var155 = var148.method723(false, var148.method729(65, class72.field1774), 0);
                    long var156 = var155.method700((byte) 25);
                    boolean var158 = false;
                    for (int var159 = 0; var159 < class86.field2133; var159++) {
                        if (class71.field1747[var159] == var156) {
                            var158 = true;
                            break;
                        }
                    }
                    if (!var158 && class70.field1700 == 0) {
                        class11.method64(class71.field1735, var155, -63, 8);
                    }
                } else if (var148.method722(class2.field59, (byte) -123)) {
                    class84 var149 = var148.method723(false, var148.method729(65, class72.field1774), 0);
                    long var150 = var149.method700((byte) 25);
                    boolean var152 = false;
                    for (int var153 = 0; var153 < class86.field2133; var153++) {
                        if (class71.field1747[var153] == var150) {
                            var152 = true;
                            break;
                        }
                    }
                    if (!var152 && class70.field1700 == 0) {
                        class84 var154 = var148.method723(false, var148.method718(85) - 9, var148.method729(arg0 ^ 0xFFFFFFBE, class72.field1774) + 1);
                        class11.method64(var154, var149, -114, 8);
                    }
                } else {
                    class11.method64(var148, class95.field2361, -76, 0);
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 92) {
                int var165 = class87.field2148.method400((byte) 120);
                byte var166 = class87.field2148.method418(0);
                class138.field3337[var165] = var166;
                if (class141.field3416[var165] != var166) {
                    class141.field3416[var165] = var166;
                    class86.method741((byte) 85, var165);
                    class89.field2220 = true;
                    if (field2880 != -1) {
                        class65.field1615 = true;
                    }
                }
                class103.field2508 = -1;
                class129.field3102 = class5.field100;
                return true;
            }
            if (class103.field2508 == 22) {
                int var167 = class87.field2148.method383(-2056200760);
                class16.method98(var167, (byte) -128);
                if (class89.field2233 != -1) {
                    class8.method44(class89.field2233, true);
                    class95.field2365 = true;
                    class89.field2233 = -1;
                    class89.field2220 = true;
                }
                if (class122.field2948 != -1) {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = -1;
                    class51.method387(113, 30);
                }
                if (class50.field1070 != -1) {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = -1;
                }
                if (class79.field1958 != -1) {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = -1;
                }
                if (class83.field2038 == var167) {
                    class43.method319(-8808784, class83.field2038);
                } else {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = var167;
                }
                class143.field3432 = -1;
                class95.method796(119, class83.field2038);
                class65.field1615 = true;
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 59) {
                class103.field2508 = -1;
                class1.field15 = 0;
                return true;
            }
            if (class103.field2508 == 35) {
                class138.field3332 = class87.field2148.method373(arg0 + 25095);
                class1.field2 = class87.field2148.method366((byte) -31);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 167) {
                if (class68.field1654 == 12) {
                    class89.field2220 = true;
                }
                class74.field1802 = class87.field2148.method375((byte) -33);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 222) {
                int var168 = class87.field2148.method409((byte) 27);
                class16.method98(var168, (byte) -127);
                if (class89.field2233 != -1) {
                    class8.method44(class89.field2233, true);
                    class89.field2233 = -1;
                    class89.field2220 = true;
                    class95.field2365 = true;
                }
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class65.field1615 = true;
                    class83.field2038 = -1;
                }
                if (class122.field2948 != -1) {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = -1;
                    class51.method387(18, 30);
                }
                if (class50.field1070 != -1) {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = -1;
                }
                if (class79.field1958 == var168) {
                    class43.method319(-8808784, class79.field1958);
                } else {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = var168;
                }
                class143.field3432 = -1;
                if (class92.field2289 != 0) {
                    class65.field1615 = true;
                    class92.field2289 = 0;
                }
                class95.method796(102, class79.field1958);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 171) {
                if (class89.field2233 != -1) {
                    class8.method44(class89.field2233, true);
                    class95.field2365 = true;
                    class89.field2220 = true;
                    class89.field2233 = -1;
                }
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                    class65.field1615 = true;
                }
                if (class122.field2948 != -1) {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = -1;
                    class51.method387(98, 30);
                }
                if (class50.field1070 != -1) {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = -1;
                }
                if (class79.field1958 != -1) {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = -1;
                }
                class143.field3432 = -1;
                class103.field2508 = -1;
                if (class92.field2289 != 0) {
                    class65.field1615 = true;
                    class92.field2289 = 0;
                }
                return true;
            }
            if (class103.field2508 == 209) {
                int var169 = class87.field2148.method365(-116);
                int var170 = class87.field2148.method411((byte) -128);
                int var171 = class87.field2148.method373(25094);
                class13.field251 = var169 >> 1;
                class40.field925.method1184(var171, var170, (var169 & 0x1) == 1, -25859);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 194) {
                class117.method952(13773, false);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 158) {
                int var172 = class87.field2148.method417(65280);
                if (var172 == 65535) {
                    var172 = -1;
                }
                class49.method355(29726, var172);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 76) {
                int var173 = class87.field2148.method400((byte) -37);
                int var174 = class87.field2148.method370((byte) -61);
                if (var173 == 65535) {
                    var173 = -1;
                }
                class33.method239(var173, false, var174);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 220) {
                for (int var175 = 0; var175 < class44.field978.length; var175++) {
                    if (class44.field978[var175] != null) {
                        class44.field978[var175].field3558 = -1;
                    }
                }
                for (int var176 = 0; var176 < class69.field1673.length; var176++) {
                    if (class69.field1673[var176] != null) {
                        class69.field1673[var176].field3558 = -1;
                    }
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 66) {
                class115.method943(false);
                class103.field2508 = -1;
                return false;
            }
            if (class103.field2508 == 183) {
                int var177 = class87.field2148.method383(-2056200760);
                int var178 = class87.field2148.method400((byte) 117);
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                    class65.field1615 = true;
                }
                if (class122.field2948 != -1) {
                    class8.method44(class122.field2948, true);
                    class122.field2948 = -1;
                    class51.method387(35, 30);
                }
                if (class50.field1070 != -1) {
                    class8.method44(class50.field1070, true);
                    class50.field1070 = -1;
                }
                if (class79.field1958 == var178) {
                    class43.method319(-8808784, class79.field1958);
                } else {
                    class8.method44(class79.field1958, true);
                    class79.field1958 = var178;
                }
                if (class89.field2233 == var177) {
                    class43.method319(-8808784, class89.field2233);
                } else {
                    class8.method44(class89.field2233, true);
                    class89.field2233 = var177;
                }
                class95.field2365 = true;
                class143.field3432 = -1;
                if (class92.field2289 != 0) {
                    class65.field1615 = true;
                    class92.field2289 = 0;
                }
                class89.field2220 = true;
                class95.method796(124, class79.field1958);
                class95.method796(arg0 + 104, class89.field2233);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 46 || class103.field2508 == 214 || class103.field2508 == 130 || class103.field2508 == 77 || class103.field2508 == 23 || class103.field2508 == 51 || class103.field2508 == 6 || class103.field2508 == 253 || class103.field2508 == 44 || class103.field2508 == 216 || class103.field2508 == 197) {
                class22.method150(102);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 227) {
                class84 var179 = class87.field2148.method413(0);
                Object[] var180 = new Object[var179.method718(arg0 ^ 0x76) + 1];
                for (int var181 = var179.method718(79) - 1; var181 >= 0; var181--) {
                    if (var179.method725(var181, -99) == 115) {
                        var180[var181 + 1] = class87.field2148.method413(0);
                    } else {
                        var180[var181 + 1] = Integer.valueOf(class87.field2148.method399(-539722392));
                    }
                }
                var180[0] = Integer.valueOf(class87.field2148.method399(-539722392));
                class43.method320(0, null, 0, var180, true, 0, null);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 70) {
                class136.method1093(class115.field2770, class86.field2128, class87.field2148, (byte) 126);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 137) {
                int var182 = class87.field2148.method372(arg0 + 256);
                if (field2880 != var182) {
                    class8.method44(field2880, true);
                    field2880 = var182;
                }
                class65.field1615 = true;
                class95.method796(arg0 ^ 0xFFFFFF93, field2880);
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 82) {
                class138.field3330 = false;
                for (int var183 = 0; var183 < 5; var183++) {
                    class133.field3194[var183] = false;
                }
                class103.field2508 = -1;
                return true;
            }
            if (class103.field2508 == 62) {
                class95.field2360 = class87.field2148.method413(arg0 + 1);
                if (class83.field2038 != -1) {
                    class8.method44(class83.field2038, true);
                    class83.field2038 = -1;
                }
                class65.field1615 = true;
                class103.field2508 = -1;
                class111.field2683 = false;
                class95.field2346 = class95.field2361;
                class92.field2289 = 4;
                return true;
            }
            if (class103.field2508 == 88) {
                int var184 = class87.field2148.method392(-25304);
                int var185 = class87.field2148.method409((byte) 27);
                int var186 = var185 >> 10 & 0x1F;
                int var187 = var185 & 0x1F;
                int var188 = var185 >> 5 & 0x1F;
                class57 var189 = class97.method805(-894550512, var184);
                class103.field2508 = -1;
                var189.field1316 = (var187 << 3) + ((var186 << 19) + (var188 << 11));
                return true;
            }
            if (class103.field2508 == 85) {
                class88.field2214 = class87.field2148.method373(25094);
                class47.field1028 = class87.field2148.method373(25094);
                class87.field2176 = class87.field2148.method373(25094);
                class115.field2762 = true;
                class103.field2508 = -1;
                class65.field1615 = true;
                return true;
            }
            class68.method604(arg0 ^ 0xFFFFB0F6, "T1 - " + class103.field2508 + "," + class91.field2268 + "," + class30.field703 + " - " + class86.field2128, null);
            class115.method943(false);
        } catch (IOException var193) {
            class10.method53(true);
        } catch (Exception var194) {
            String var191 = "T2 - " + class103.field2508 + "," + class91.field2268 + "," + class30.field703 + " - " + class86.field2128 + "," + (class40.field925.field3490[0] + class95.field2359) + "," + (class40.field925.field3489[0] + class10.field159) + " - ";
            for (int var192 = 0; class86.field2128 > var192 && var192 < 50; var192++) {
                var191 = var191 + class87.field2148.field1084[var192] + ",";
            }
            class68.method604(20233, var191, var194);
            class115.method943(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public static final void method975(byte arg0) {
        class145.field3523.method27((byte) -31);
        if (arg0 > -85) {
            field2871 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class126.field3040[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class69.field1672[var2] = 0L;
        }
        field2876++;
        class106.field2576 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
    public static final void method976(int arg0) {
        field2882++;
        if (class118.field2827 == 0) {
            return;
        }
        int var1 = 0;
        if (class68.field1644 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class74.field1792[var2] != null) {
                int var3 = class17.field377[var2];
                class84 var4 = class49.field1048[var2];
                if (var4 != null && var4.method703(class75.field1857, 0)) {
                    var4 = var4.method697(46, 5);
                }
                if (var4 != null && var4.method703(class24.field566, 0)) {
                    var4 = var4.method697(99, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class47.field1028 == 0 || class47.field1028 == 1 && class88.method752(0, var4))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class20.field427 > 4 && var5 - 10 < class60.field1498 - 4 && var5 + 3 >= class60.field1498 + -4) {
                        int var6 = class95.field2364.method219(class51.method408(new class84[] { class90.field2260, class92.field2287, var4, class74.field1792[var2] }, 105)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class20.field427) {
                            if (class102.field2478 >= 1) {
                                class129.method1051(0, 2010, class51.method408(new class84[] { class51.field1093, var4 }, -121), 16711680, 0, 0, class49.field1053);
                                class93.field2318++;
                            }
                            class129.method1051(0, 2046, class51.method408(new class84[] { class51.field1093, var4 }, -63), 16711680, 0, 0, class40.field916);
                            class24.field550++;
                            client.field484++;
                            class129.method1051(0, 2013, class51.method408(new class84[] { class51.field1093, var4 }, -118), 16711680, 0, 0, client.field464);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class47.field1028 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 > -9) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
    public static final void method977(long arg0, int arg1) {
        field2877++;
        if (arg0 == 0L) {
            return;
        }
        if (class86.field2133 >= 100) {
            class11.method64(class144.field3483, class95.field2361, arg1 ^ 0xFFFFEEF6, 0);
            return;
        }
        class84 var3 = class15.method91(arg1 - 25240, arg0).method704(98);
        for (int var4 = 0; var4 < class86.field2133; var4++) {
            if (class71.field1747[var4] == arg0) {
                class11.method64(class51.method408(new class84[] { var3, class96.field2376 }, 119), class95.field2361, -54, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class125.field3024; var5++) {
            if (class30.field710[var5] == arg0) {
                class11.method64(class51.method408(new class84[] { class143.field3435, var3, class64.field1584 }, -48), class95.field2361, -97, 0);
                return;
            }
        }
        if (var3.method720(arg1 ^ 0xFFFFEEBC, class40.field925.field1535)) {
            return;
        }
        class71.field1747[class86.field2133++] = arg0;
        if (arg1 != 4419) {
            field2892 = -1;
        }
        class89.field2220 = true;
        class19.field407++;
        class80.field1978.method769((byte) 41, 242);
        class80.field1978.method419(false, arg0);
    }
}
