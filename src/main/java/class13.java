import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public int field230 = 0;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lhb;")
    private static class44 field245 = class102.method810("Loaded title screen", -28606);

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lhb;")
    public static class44 field231 = field245;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lhb;")
    public static class44 field246 = class102.method810("und Ihr Passwort ein)3", -28606);

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lfc;")
    public static class34 field243 = new class34(500);

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lhb;")
    public static class44 field249 = class102.method810("Offline", -28606);

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lhb;")
    public static class44 field251 = null;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Lhb;")
    public static class44 field253 = class102.method810("Verbindung abgebrochen)3", -28606);

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Z")
    public static boolean field254 = false;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lhb;")
    public static class44 field260 = class102.method810("System)2Update in: ", -28606);

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lhb;")
    public static class44 field256 = class102.method810("Name eingeben:", -28606);

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[Z")
    public static boolean[] field257 = new boolean[112];

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lhb;")
    private static class44 field258 = class102.method810("Invalid username or password)3", -28606);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Lhb;")
    private static class44 field262 = class102.method810("Prepared sound engine", -28606);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Lhb;")
    public static class44 field247 = field258;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "[I")
    public static int[] field261 = new int[128];

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Lhb;")
    public static class44 field250 = field262;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lqa;")
    public class97 field229;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BILm;)I", line = 6)
    public static final int method86(byte arg0, int arg1, class72 arg2) {
        field237++;
        if (arg2.field1821 == null || arg1 >= arg2.field1821.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1821[arg1];
            int var4 = 0;
            int var5 = 0;
            if (arg0 != -108) {
                method90((byte) -4);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class19.field397[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class131.field3190[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class77.field1933[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class72 var12 = class90.method727(var11, -160);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class42.method358(0, var13).field2045 || class97.field2464)) {
                        for (int var14 = 0; var14 < var12.field1804.length; var14++) {
                            if (var13 + 1 == var12.field1804[var14]) {
                                var8 += var12.field1824[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 5) {
                    var8 = class21.field440[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class16.field326[class131.field3190[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class21.field440[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class72.field1820.field2618;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class104.field2655[var15]) {
                            var8 += class131.field3190[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class72 var18 = class90.method727(var17, -160);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class42.method358(0, var19).field2045 || class97.field2464)) {
                        for (int var20 = 0; var20 < var18.field1804.length; var20++) {
                            if (var19 + 1 == var18.field1804[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class113.field2783;
                }
                if (var7 == 12) {
                    var8 = class109.field2732;
                }
                if (var7 == 13) {
                    int var21 = class21.field440[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class110.method844(13, var23);
                }
                if (var7 == 18) {
                    var8 = (class72.field1820.field1384 >> 7) + class104.field2666;
                }
                if (var7 == 19) {
                    var8 = (class72.field1820.field1371 >> 7) + class120.field2936;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 215)
    public static final void method87(int arg0) {
        field224++;
        if (class104.field2665) {
            class104.field2665 = false;
            class14.method100((byte) 73);
            class16.field306 = true;
            class88.field2251 = true;
            class101.field2572 = true;
            class104.field2652 = true;
        }
        class28.method230(arg0 ^ 0xFFFFDC9D);
        if (arg0 != -17) {
            field231 = null;
        }
        if (class15.field289 && class25.field584 == 1) {
            class88.field2251 = true;
        }
        if (class47.field1152 != -1) {
            boolean var1 = class66.method582(2907, class47.field1152);
            if (var1) {
                class88.field2251 = true;
            }
        }
        if (class102.field2592 == 2) {
            class88.field2251 = true;
        }
        if (class34.field843 == 2) {
            class88.field2251 = true;
        }
        if (class88.field2251) {
            class88.field2251 = false;
            class11.method74(arg0 ^ 0xFFFFFFEE);
        }
        if (class98.field2496 == -1) {
            class41.field943.field1827 = class127.field3046 - class86.field2190 - 77;
            if (class100.field2519 > 448 && class100.field2519 < 560 && class110.field2749 > 332) {
                class116.method898(class100.field2519 - 17, class110.field2749 + -357, 463, 0, (byte) -1, 77, -1, class127.field3046, class41.field943);
            }
            int var2 = class127.field3046 - class41.field943.field1827 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class127.field3046 - 77) {
                var2 = class127.field3046 - 77;
            }
            if (class86.field2190 != var2) {
                class16.field306 = true;
                class86.field2190 = var2;
            }
        }
        if (class98.field2496 == -1 && class79.field1990 == 3) {
            class41.field943.field1827 = class100.field2518;
            int var3 = class102.field2602 * 14 + 7;
            if (class100.field2519 > 448 && class100.field2519 < 560 && class110.field2749 > 332) {
                class116.method898(class100.field2519 - 17, class110.field2749 + -357, 463, 0, (byte) -1, 77, -1, var3, class41.field943);
            }
            int var4 = class41.field943.field1827;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class100.field2518 != var4) {
                class16.field306 = true;
                class100.field2518 = var4;
            }
        }
        if (class98.field2496 != -1) {
            boolean var5 = class66.method582(arg0 ^ 0xFFFFF4B4, class98.field2496);
            if (var5) {
                class16.field306 = true;
            }
        }
        if (class102.field2592 == 3) {
            class16.field306 = true;
        }
        if (class34.field843 == 3) {
            class16.field306 = true;
        }
        if (class131.field3146 != null) {
            class16.field306 = true;
        }
        if (class15.field289 && class25.field584 == 2) {
            class16.field306 = true;
        }
        if (class16.field306) {
            class16.field306 = false;
            class21.method157(0);
        }
        class57.method543(2);
        if (class1.field11 != -1) {
            class101.field2572 = true;
        }
        if (class101.field2572) {
            if (class1.field11 != -1 && class39.field873 == class1.field11) {
                class92.field2341++;
                class1.field11 = -1;
                class92.field2333.method702(true, 64);
                class92.field2333.method993(19579, class39.field873);
            }
            class64.field1626 = true;
            class101.field2572 = false;
            class28.method232(class39.field873, class47.field1152 == -1, class2.field73 % 20 < 10 ? -1 : class1.field11, class107.field2728, 26691);
        }
        if (class104.field2652) {
            class64.field1626 = true;
            class104.field2652 = false;
            class27.method223(class71.field1745, arg0 + 18, class103.field2631, class89.field2263, class39.field881);
        }
        method91(class44.field1124, arg0 ^ 0xFFFFFFAC, class79.field1993, class72.field1820.field1384, class72.field1820.field1371);
        class44.field1124 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 378)
    public static final void method88(boolean arg0) {
        if (arg0) {
            method91(120, 101, 109, -102, -23);
        }
        field242++;
        if (class71.field1744 < 2 && class48.field1195 == 0 && class44.field1071 == 0) {
            return;
        }
        class44 var1;
        if (class48.field1195 == 1 && class71.field1744 < 2) {
            var1 = class117.method903(new class44[] { class11.field211, class16.field318, class95.field2421, class27.field637 }, false);
        } else if (class44.field1071 == 1 && class71.field1744 < 2) {
            var1 = class117.method903(new class44[] { field251, class16.field318, client.field376, class27.field637 }, false);
        } else {
            var1 = class64.field1625[class71.field1744 - 1];
        }
        if (class71.field1744 > 2) {
            var1 = class117.method903(new class44[] { var1, class84.field2132, class116.method893(10, class71.field1744 - 2), class55.field1403 }, arg0);
        }
        class34.field820.method286(var1, 4, 15, 16777215, true, class2.field73 / 1000);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 410)
    public static final void method89(int arg0) {
        field226++;
        class28.field665 = 0;
        for (int var1 = arg0; var1 < class125.field3036 + class125.field3020; var1++) {
            class55 var18;
            if (var1 == -1) {
                var18 = class72.field1820;
            } else if (var1 < class125.field3020) {
                var18 = class82.field2110[class118.field2913[var1]];
            } else {
                var18 = class116.field2845[class100.field2515[var1 - class125.field3020]];
            }
            if (var18 != null && var18.method432((byte) -122)) {
                if (var18 instanceof class46) {
                    class43 var19 = ((class46) var18).field1137;
                    if (var19.field1012 != null) {
                        var19 = var19.method369(-101);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class125.field3020 <= var1) {
                    class43 var22 = ((class46) var18).field1137;
                    if (var22.field1027 >= 0 && var22.field1027 < class113.field2786.length) {
                        class86.method705(var18.field1351 + 15, arg0 ^ 0x4C2684FC, var18);
                        if (class31.field763 > -1) {
                            class113.field2786[var22.field1027].method428(class31.field763 - 12, class90.field2300 + -30);
                        }
                    }
                    if (class86.field2202 == 1 && class100.field2515[var1 - class125.field3020] == class48.field1186 && class2.field73 % 20 < 10) {
                        class86.method705(var18.field1351 + 15, -1277592829, var18);
                        if (class31.field763 > -1) {
                            class22.field451[0].method428(class31.field763 - 12, class90.field2300 - 28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class103 var21 = (class103) var18;
                    if (var21.field2617 != -1 || var21.field2616 != -1) {
                        class86.method705(var18.field1351 + 15, -1277592829, var18);
                        if (class31.field763 > -1) {
                            if (var21.field2617 != -1) {
                                class103.field2615[var21.field2617].method428(class31.field763 - 12, -var20 + class90.field2300);
                                var20 += 25;
                            }
                            if (var21.field2616 != -1) {
                                class113.field2786[var21.field2616].method428(class31.field763 - 12, class90.field2300 - var20);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class86.field2202 == 10 && class118.field2913[var1] == class47.field1172) {
                        class86.method705(var18.field1351 + 15, arg0 ^ 0x4C2684FC, var18);
                        if (class31.field763 > -1) {
                            class22.field451[1].method428(class31.field763 - 12, -var20 + class90.field2300);
                        }
                    }
                }
                if (var18.field1387 != null && (var1 >= class125.field3020 || class89.field2263 == 0 || class89.field2263 == 3 || class89.field2263 == 1 && class57.method530(((class103) var18).field2651, false))) {
                    class86.method705(var18.field1351, arg0 ^ 0x4C2684FC, var18);
                    if (class31.field763 > -1 && class55.field1365 > class28.field665) {
                        class55.field1382[class28.field665] = class34.field820.method297(var18.field1387) / 2;
                        class55.field1418[class28.field665] = class34.field820.field754;
                        class55.field1343[class28.field665] = class31.field763;
                        class55.field1368[class28.field665] = class90.field2300;
                        class55.field1379[class28.field665] = var18.field1341;
                        class55.field1381[class28.field665] = var18.field1347;
                        class55.field1352[class28.field665] = var18.field1372;
                        class55.field1337[class28.field665] = var18.field1387;
                        class28.field665++;
                    }
                }
                if (var18.field1342 > class2.field73) {
                    class86.method705(var18.field1351 + 15, arg0 ^ 0x4C2684FC, var18);
                    if (class31.field763 > -1) {
                        int var23 = var18.field1392 * 30 / var18.field1367;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class112.method856(class31.field763 - 15, class90.field2300 - 3, var23, 5, 65280);
                        class112.method856(var23 + class31.field763 - 15, class90.field2300 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field1386[var24] > class2.field73) {
                        class86.method705(var18.field1351 / 2, -1277592829, var18);
                        if (class31.field763 > -1) {
                            if (var24 == 1) {
                                class90.field2300 -= 20;
                            }
                            if (var24 == 2) {
                                class90.field2300 -= 10;
                                class31.field763 -= 15;
                            }
                            if (var24 == 3) {
                                class90.field2300 -= 10;
                                class31.field763 += 15;
                            }
                            class84.field2144[var18.field1336[var24]].method428(class31.field763 - 12, class90.field2300 + -12);
                            class104.field2661.method294(class116.method893(10, var18.field1348[var24]), class31.field763, class90.field2300 + 4, 0);
                            class104.field2661.method294(class116.method893(10, var18.field1348[var24]), class31.field763 - 1, class90.field2300 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class28.field665; var2++) {
            int var3 = class55.field1343[var2];
            int var4 = class55.field1382[var2];
            int var5 = class55.field1418[var2];
            int var6 = class55.field1368[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class55.field1368[var17] - class55.field1418[var17] < var6 - -2 && var6 - var5 < class55.field1368[var17] - -2 && var3 - var4 < class55.field1382[var17] + class55.field1343[var17] && class55.field1343[var17] - class55.field1382[var17] < var3 + var4 && class55.field1368[var17] - class55.field1418[var17] < var6) {
                        var6 = class55.field1368[var17] - class55.field1418[var17];
                        var7 = true;
                    }
                }
            }
            class31.field763 = class55.field1343[var2];
            class90.field2300 = class55.field1368[var2] = var6;
            class44 var8 = class55.field1337[var2];
            if (class72.field1768 == 0) {
                int var9 = 16776960;
                if (class55.field1379[var2] < 6) {
                    var9 = class72.field1762[class55.field1379[var2]];
                }
                if (class55.field1379[var2] == 6) {
                    var9 = class34.field840 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class55.field1379[var2] == 7) {
                    var9 = class34.field840 % 20 >= 10 ? 65535 : 255;
                }
                if (class55.field1379[var2] == 8) {
                    var9 = class34.field840 % 20 < 10 ? 45056 : 8454016;
                }
                if (class55.field1379[var2] == 9) {
                    int var10 = 150 - class55.field1352[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16384000 + 16776960 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class55.field1379[var2] == 10) {
                    int var11 = 150 - class55.field1352[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class55.field1379[var2] == 11) {
                    int var12 = 150 - class55.field1352[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class55.field1381[var2] == 0) {
                    class34.field820.method294(var8, class31.field763, class90.field2300 + 1, 0);
                    class34.field820.method294(var8, class31.field763, class90.field2300, var9);
                }
                if (class55.field1381[var2] == 1) {
                    class34.field820.method302(var8, class31.field763, class90.field2300 + 1, 0, class34.field840);
                    class34.field820.method302(var8, class31.field763, class90.field2300, var9, class34.field840);
                }
                if (class55.field1381[var2] == 2) {
                    class34.field820.method300(var8, class31.field763, class90.field2300 + 1, 0, class34.field840);
                    class34.field820.method300(var8, class31.field763, class90.field2300, var9, class34.field840);
                }
                if (class55.field1381[var2] == 3) {
                    class34.field820.method305(var8, class31.field763, class90.field2300 + 1, 0, class34.field840, 150 - class55.field1352[var2]);
                    class34.field820.method305(var8, class31.field763, class90.field2300, var9, class34.field840, 150 - class55.field1352[var2]);
                }
                if (class55.field1381[var2] == 4) {
                    int var13 = class34.field820.method297(var8);
                    int var14 = (150 - class55.field1352[var2]) * (var13 + 100) / 150;
                    class112.method859(class31.field763 - 50, 0, class31.field763 + 50, 334);
                    class34.field820.method301(var8, class31.field763 + 50 - var14, class90.field2300 + 1, 0);
                    class34.field820.method301(var8, class31.field763 + 50 - var14, class90.field2300, var9);
                    class112.method861();
                }
                if (class55.field1381[var2] == 5) {
                    int var15 = 150 - class55.field1352[var2];
                    int var16 = 0;
                    class112.method859(0, class90.field2300 - class34.field820.field754 - 1, 512, class90.field2300 + 5);
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class34.field820.method294(var8, class31.field763, class90.field2300 + var16 + 1, 0);
                    class34.field820.method294(var8, class31.field763, class90.field2300 + var16, var9);
                    class112.method861();
                }
            } else {
                class34.field820.method294(var8, class31.field763, class90.field2300 + 1, 0);
                class34.field820.method294(var8, class31.field763, class90.field2300, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 791)
    public static final void method90(byte arg0) {
        field222++;
        if (arg0 >= -50) {
            method86((byte) 91, -67, null);
        }
        for (int var1 = 0; var1 < class42.field977; var1++) {
            int var10002 = class15.field304[var1]--;
            if (class15.field304[var1] >= -10) {
                class65 var3 = class109.field2742[var1];
                if (var3 == null) {
                    var3 = class65.method576(class105.field2699, class41.field917[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class15.field304[var1] += var3.method575();
                    class109.field2742[var1] = var3;
                }
                if (class15.field304[var1] < 0) {
                    int var4 = class47.field1177;
                    if (class11.field205[var1] != 0) {
                        int var5 = (class11.field205[var1] & 0xFF) * 128;
                        int var6 = class11.field205[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class72.field1820.field1384;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class11.field205[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class72.field1820.field1371;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class15.field304[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class47.field1177 / var5;
                    }
                    class124 var11 = var3.method573().method941(class90.field2306);
                    class8 var12 = class8.method52(var11, 100, var4);
                    var12.method66(class67.field1680[var1] - 1);
                    class41.field948.method22(var12);
                    class15.field304[var1] = -100;
                }
            } else {
                class42.field977--;
                for (int var2 = var1; var2 < class42.field977; var2++) {
                    class41.field917[var2] = class41.field917[var2 + 1];
                    class109.field2742[var2] = class109.field2742[var2 + 1];
                    class67.field1680[var2] = class67.field1680[var2 + 1];
                    class15.field304[var2] = class15.field304[var2 + 1];
                    class11.field205[var2] = class11.field205[var2 + 1];
                }
                var1--;
            }
        }
        if (class117.field2858 <= 0) {
            return;
        }
        class117.field2858 -= 20;
        if (class117.field2858 < 0) {
            class117.field2858 = 0;
        }
        if (class117.field2858 == 0 && class82.field2119 != 0 && class15.field286 != -1) {
            class1.method4(0, class82.field2119, 0, class94.field2398, (byte) -105, class15.field286, false);
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V", line = 913)
    private static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field223++;
        class61 var5 = (class61) class46.field1134.method443((byte) -111);
        int var6 = -52 / ((-arg1 - 10) / 61);
        while (var5 != null) {
            if (var5.field1556 != -1 || var5.field1554 != null) {
                int var7 = 0;
                if (arg3 > var5.field1534) {
                    var7 += arg3 - var5.field1534;
                } else if (var5.field1537 > arg3) {
                    var7 += var5.field1537 - arg3;
                }
                if (var5.field1547 < arg4) {
                    var7 += arg4 - var5.field1547;
                } else if (var5.field1544 > arg4) {
                    var7 += var5.field1544 - arg4;
                }
                if (var5.field1540 < var7 - 64 || class47.field1177 == 0 || var5.field1536 != arg2) {
                    if (var5.field1545 != null) {
                        class41.field948.method28(var5.field1545);
                        var5.field1545 = null;
                    }
                    if (var5.field1542 != null) {
                        class41.field948.method28(var5.field1542);
                        var5.field1542 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var5.field1540 - var7) * class47.field1177 / var5.field1540;
                    if (var5.field1545 != null) {
                        var5.field1545.method61(var8);
                    } else if (var5.field1556 >= 0) {
                        class65 var9 = class65.method576(class105.field2699, var5.field1556, 0);
                        if (var9 != null) {
                            class124 var10 = var9.method573().method941(class90.field2306);
                            class8 var11 = class8.method52(var10, 100, var8);
                            var11.method66(-1);
                            class41.field948.method22(var11);
                            var5.field1545 = var11;
                        }
                    }
                    if (var5.field1542 != null) {
                        var5.field1542.method61(var8);
                        if (!var5.field1542.method59()) {
                            var5.field1542 = null;
                        }
                    } else if (var5.field1554 != null && (var5.field1551 -= arg0) <= 0) {
                        int var12 = (int) (Math.random() * (double) var5.field1554.length);
                        class65 var13 = class65.method576(class105.field2699, var5.field1554[var12], 0);
                        if (var13 != null) {
                            class124 var14 = var13.method573().method941(class90.field2306);
                            class8 var15 = class8.method52(var14, 100, var8);
                            var15.method66(0);
                            class41.field948.method22(var15);
                            var5.field1551 = (int) ((double) (var5.field1563 - var5.field1555) * Math.random()) + var5.field1555;
                            var5.field1542 = var15;
                        }
                    }
                }
            }
            var5 = (class61) class46.field1134.method434(true);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 1054)
    public static void method92(int arg0) {
        field231 = null;
        field246 = null;
        field247 = null;
        field262 = null;
        field257 = null;
        field245 = null;
        field256 = null;
        field250 = null;
        field258 = null;
        field251 = null;
        field243 = null;
        field261 = null;
        field249 = null;
        field253 = null;
        int var1 = 34 % ((-arg0 - 34) / 56);
        field260 = null;
    }
}
