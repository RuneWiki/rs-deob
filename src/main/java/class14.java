import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 extends class55 {

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "[B")
    public byte[] field257;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lo;")
    public static class84 field247 = class15.method124("sideicons", 255);

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
    public static boolean field248 = true;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "Lo;")
    public static class84 field249 = class15.method124("Enter name of friend to add to list", 255);

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "Lo;")
    public static class84 field254 = class15.method124("scape main", 255);

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lo;")
    public static class84 field255 = class15.method124("Examine @lre@", 255);

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "J")
    public static long field258;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lp;")
    public static class89 field259;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 16)
    public static void method117(byte arg0) {
        field259 = null;
        if (arg0 != 106) {
            method119(-22);
        }
        field247 = null;
        field254 = null;
        field255 = null;
        field249 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I", line = 30)
    public static final int method118(int arg0, int arg1, int arg2, int arg3) {
        field250++;
        if (arg0 > 179) {
            arg2 /= 2;
        }
        if (arg0 > 192) {
            arg2 /= 2;
        }
        if (arg0 > 217) {
            arg2 /= 2;
        }
        if (arg0 > 243) {
            arg2 /= 2;
        }
        int var4 = (arg3 / 4 << 10) + (arg2 / 32 << 7) + arg0 / 2;
        return arg1 == 16557 ? var4 : -32;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V", line = 76)
    public static final void method119(int arg0) {
        field256++;
        if (!class86.field1955) {
            return;
        }
        class5.field98 = null;
        class82.field1768 = null;
        class111.field2416 = null;
        class3.field42 = null;
        class116.field2534 = null;
        class44.field925 = null;
        if (arg0 != 10) {
            method120(-106);
        }
        class58.field1199 = null;
        class128.field2836 = null;
        class79.field1676 = null;
        class73.field1527 = null;
        class38.field751 = null;
        class41.field839 = null;
        class1.field1 = null;
        class115.field2496 = null;
        class17.field299 = null;
        class26.field450 = null;
        class117.field2567 = null;
        class73.field1545 = null;
        class84.field1895 = null;
        class123.field2761 = null;
        class97.field2068 = null;
        class12.field243 = null;
        class113.method869(10, 115);
        class51.method441(true, -23689);
        class86.field1955 = false;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 132)
    public class14(byte[] arg0) {
        this.field257 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V", line = 140)
    public static final void method120(int arg0) {
        class103.field2171 = 0;
        field253++;
        for (int var1 = -1; var1 < class85.field1933 + class107.field2257; var1++) {
            class65 var18;
            if (var1 == -1) {
                var18 = class107.field2271;
            } else if (var1 >= class107.field2257) {
                var18 = class3.field30[class75.field1571[var1 - class107.field2257]];
            } else {
                var18 = class119.field2643[class85.field1949[var1]];
            }
            if (var18 != null && var18.method496(arg0 - 36797)) {
                if (var18 instanceof class115) {
                    class39 var19 = ((class115) var18).field2501;
                    if (var19.field763 != null) {
                        var19 = var19.method347((byte) 72);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (var1 >= class107.field2257) {
                    class39 var22 = ((class115) var18).field2501;
                    if (var22.field774 >= 0 && var22.field774 < class67.field1465.length) {
                        class123.method963(var18.field1426 + 15, 50, var18);
                        if (class19.field370 > -1) {
                            class67.field1465[var22.field774].method947(class19.field370 - 12, class25.field437 - 30);
                        }
                    }
                    if (class110.field2378 == 1 && class75.field1571[var1 - class107.field2257] == class104.field2193 && class128.field2837 % 20 < 10) {
                        class123.method963(var18.field1426 + 15, 102, var18);
                        if (class19.field370 > -1) {
                            class120.field2661[0].method947(class19.field370 - 12, class25.field437 + -28);
                        }
                    }
                } else {
                    class63 var20 = (class63) var18;
                    int var21 = 30;
                    if (var20.field1308 != -1 || var20.field1296 != -1) {
                        class123.method963(var18.field1426 + 15, 36, var18);
                        if (class19.field370 > -1) {
                            if (var20.field1308 != -1) {
                                class51.field1102[var20.field1308].method947(class19.field370 - 12, -var21 + class25.field437);
                                var21 += 25;
                            }
                            if (var20.field1296 != -1) {
                                class67.field1465[var20.field1296].method947(class19.field370 - 12, class25.field437 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class110.field2378 == 10 && class85.field1949[var1] == class116.field2518) {
                        class123.method963(var18.field1426 + 15, arg0 ^ 0xFFDB, var18);
                        if (class19.field370 > -1) {
                            class120.field2661[1].method947(class19.field370 - 12, -var21 + class25.field437);
                        }
                    }
                }
                if (var18.field1416 != null && (class107.field2257 <= var1 || class28.field550 == 0 || class28.field550 == 3 || class28.field550 == 1 && class45.method394(((class63) var18).field1312, -20281))) {
                    class123.method963(var18.field1426, arg0 ^ 0xFF87, var18);
                    if (class19.field370 > -1 && class103.field2171 < class55.field1145) {
                        class55.field1141[class103.field2171] = class16.field291.method313(var18.field1416) / 2;
                        class55.field1147[class103.field2171] = class16.field291.field684;
                        class55.field1150[class103.field2171] = class19.field370;
                        class55.field1137[class103.field2171] = class25.field437;
                        class55.field1142[class103.field2171] = var18.field1415;
                        class55.field1152[class103.field2171] = var18.field1376;
                        class55.field1148[class103.field2171] = var18.field1408;
                        class55.field1136[class103.field2171] = var18.field1416;
                        class103.field2171++;
                    }
                }
                if (var18.field1431 > class128.field2837) {
                    class123.method963(var18.field1426 + 15, arg0 + -65440, var18);
                    if (class19.field370 > -1) {
                        int var23 = var18.field1412 * 30 / var18.field1386;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class32.method290(class19.field370 - 15, class25.field437 + -3, var23, 5, 65280);
                        class32.method290(var23 + class19.field370 - 15, class25.field437 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class128.field2837 < var18.field1404[var24]) {
                        class123.method963(var18.field1426 / 2, 42, var18);
                        if (class19.field370 > -1) {
                            if (var24 == 1) {
                                class25.field437 -= 20;
                            }
                            if (var24 == 2) {
                                class25.field437 -= 10;
                                class19.field370 -= 15;
                            }
                            if (var24 == 3) {
                                class25.field437 -= 10;
                                class19.field370 += 15;
                            }
                            class35.field702[var18.field1418[var24]].method947(class19.field370 - 12, class25.field437 + -12);
                            class89.field2022.method311(class62.method489(var18.field1385[var24], (byte) -127), class19.field370, class25.field437 + 4, 0);
                            class89.field2022.method311(class62.method489(var18.field1385[var24], (byte) -127), class19.field370 - 1, class25.field437 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class103.field2171; var2++) {
            int var3 = class55.field1150[var2];
            int var4 = class55.field1137[var2];
            int var5 = class55.field1141[var2];
            int var6 = class55.field1147[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class55.field1137[var17] - class55.field1147[var17] < var4 - -2 && var4 - var6 < class55.field1137[var17] + 2 && var3 - var5 < class55.field1150[var17] - -class55.field1141[var17] && class55.field1150[var17] - class55.field1141[var17] < var3 + var5 && class55.field1137[var17] - class55.field1147[var17] < var4) {
                        var4 = class55.field1137[var17] - class55.field1147[var17];
                        var7 = true;
                    }
                }
            }
            class19.field370 = class55.field1150[var2];
            class25.field437 = class55.field1137[var2] = var4;
            class84 var8 = class55.field1136[var2];
            if (class62.field1283 == 0) {
                int var9 = 16776960;
                if (class55.field1142[var2] < 6) {
                    var9 = class120.field2662[class55.field1142[var2]];
                }
                if (class55.field1142[var2] == 6) {
                    var9 = class27.field530 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class55.field1142[var2] == 7) {
                    var9 = class27.field530 % 20 >= 10 ? 65535 : 255;
                }
                if (class55.field1142[var2] == 8) {
                    var9 = class27.field530 % 20 < 10 ? 45056 : 8454016;
                }
                if (class55.field1142[var2] == 9) {
                    int var10 = 150 - class55.field1148[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class55.field1142[var2] == 10) {
                    int var11 = 150 - class55.field1148[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16384000 + 16711935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 255 + 500 - var11 * 5 - 32768000;
                    }
                }
                if (class55.field1142[var2] == 11) {
                    int var12 = 150 - class55.field1148[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 - 16318970;
                    } else if (var12 < 150) {
                        var9 = 32768000 + 16777215 - var12 * 327680;
                    }
                }
                if (class55.field1152[var2] == 0) {
                    class16.field291.method311(var8, class19.field370, class25.field437 + 1, 0);
                    class16.field291.method311(var8, class19.field370, class25.field437, var9);
                }
                if (class55.field1152[var2] == 1) {
                    class16.field291.method309(var8, class19.field370, class25.field437 + 1, 0, class27.field530);
                    class16.field291.method309(var8, class19.field370, class25.field437, var9, class27.field530);
                }
                if (class55.field1152[var2] == 2) {
                    class16.field291.method315(var8, class19.field370, class25.field437 + 1, 0, class27.field530);
                    class16.field291.method315(var8, class19.field370, class25.field437, var9, class27.field530);
                }
                if (class55.field1152[var2] == 3) {
                    class16.field291.method322(var8, class19.field370, class25.field437 + 1, 0, class27.field530, 150 - class55.field1148[var2]);
                    class16.field291.method322(var8, class19.field370, class25.field437, var9, class27.field530, 150 - class55.field1148[var2]);
                }
                if (class55.field1152[var2] == 4) {
                    int var13 = class16.field291.method313(var8);
                    int var14 = (150 - class55.field1148[var2]) * (var13 + 100) / 150;
                    class32.method291(class19.field370 - 50, 0, class19.field370 + 50, 334);
                    class16.field291.method320(var8, class19.field370 + 50 - var14, class25.field437 - -1, 0);
                    class16.field291.method320(var8, class19.field370 + 50 - var14, class25.field437, var9);
                    class32.method292();
                }
                if (class55.field1152[var2] == 5) {
                    int var15 = 150 - class55.field1148[var2];
                    class32.method291(0, class25.field437 - class16.field291.field684 - 1, 512, class25.field437 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class16.field291.method311(var8, class19.field370, class25.field437 + var16 + 1, 0);
                    class16.field291.method311(var8, class19.field370, class25.field437 + var16, var9);
                    class32.method292();
                }
            } else {
                class16.field291.method311(var8, class19.field370, class25.field437 + 1, 0);
                class16.field291.method311(var8, class19.field370, class25.field437, 16776960);
            }
        }
        if (arg0 != 65535) {
            method119(-117);
        }
    }
}
