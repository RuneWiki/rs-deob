import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class44 {

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lkb;")
    public static class93 field468 = class76.method390("<)4col> x", 0);

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lkb;")
    public static class93 field465 = class76.method390("Texturen geladen)3", 0);

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field482 = -2;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Lh;")
    public static class65 field472;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[I")
    public int[] field473;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "[I")
    public int[] field476;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    public int[] field478;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[Lca;")
    public class22[] field471;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[Lca;")
    public class22[] field481;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[[[B")
    public byte[][][] field480;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public static void method158(boolean arg0) {
        field472 = null;
        if (!arg0) {
            method158(false);
        }
        field468 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
    public static int method159(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
    public static final void method160(int arg0, byte arg1, int arg2) {
        class151.field2908.method47(231, 8);
        class47.field740++;
        class151.field2908.method1078(arg2, -592962360);
        class151.field2908.method1033(false, arg0);
        field479++;
        if (arg1 >= -100) {
            field472 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BIBI)I")
    public static final int method161(byte[] arg0, int arg1, byte arg2, int arg3) {
        field467++;
        int var4 = -1;
        int var5 = 19 / ((21 - arg2) / 56);
        for (int var6 = arg3; var6 < arg1; var6++) {
            var4 = var4 >>> 8 ^ class147.field2841[(arg0[var6] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
    public static final void method162(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field475++;
        class53.field892 = 0;
        for (int var5 = -1; var5 < class205.field3966 + class195.field3788; var5++) {
            class112 var21;
            if (var5 == -1) {
                var21 = class106.field1940;
            } else if (var5 < class205.field3966) {
                var21 = class206.field4035[class144.field2818[var5]];
            } else {
                var21 = class143.field2791[class49.field794[var5 - class205.field3966]];
            }
            if (var21 != null && var21.method190((byte) -115)) {
                if (var21 instanceof class76) {
                    class195 var22 = ((class76) var21).field1364;
                    if (var22.field3815 != null) {
                        var22 = var22.method1256(0);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class205.field3966) {
                    class195 var25 = ((class76) var21).field1364;
                    if (var25.field3815 != null) {
                        var25 = var25.method1256(0);
                    }
                    if (var25.field3800 >= 0 && class70.field1291.length > var25.field3800) {
                        class19.method112(var21, 0, var21.method608(-114) + 15);
                        if (class26.field415 > -1) {
                            class70.field1291[var25.field3800].method737(arg3 + class26.field415 - 12, class36.field586 + arg0 + -30);
                        }
                    }
                    if (class37.field629 == 1 && class49.field794[var5 - class205.field3966] == class151.field2932 && class21.field338 % 20 < 10) {
                        class19.method112(var21, 0, var21.method608(98) + 15);
                        if (class26.field415 > -1) {
                            class116.field2175[0].method737(arg3 + class26.field415 - 12, arg0 + -28 - -class36.field586);
                        }
                    }
                } else {
                    int var23 = 30;
                    class34 var24 = (class34) var21;
                    if (var24.field534 != -1 || var24.field554 != -1) {
                        class19.method112(var21, 0, var21.method608(-85) + 15);
                        if (class26.field415 > -1) {
                            if (var24.field534 != -1) {
                                class110.field1991[var24.field534].method737(class26.field415 + arg3 - 12, class36.field586 + arg0 + -var23);
                                var23 += 25;
                            }
                            if (var24.field554 != -1) {
                                class70.field1291[var24.field554].method737(arg3 + class26.field415 - 12, class36.field586 + arg0 + -var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class37.field629 == 10 && class144.field2818[var5] == class66.field1204) {
                        class19.method112(var21, 0, var21.method608(11) + 15);
                        if (class26.field415 > -1) {
                            class116.field2175[1].method737(class26.field415 + arg3 - 12, -var23 + class36.field586 + arg0);
                        }
                    }
                }
                if (var21.field2041 != null && (class205.field3966 <= var5 || class172.field3403 == 0 || class172.field3403 == 3 || class172.field3403 == 1 && class44.method234(true, ((class34) var21).field550))) {
                    class19.method112(var21, 0, var21.method608(-87));
                    if (class26.field415 > -1 && class53.field892 < class128.field2401) {
                        class128.field2428[class53.field892] = class68.field1250.method1005(var21.field2041) / 2;
                        class128.field2432[class53.field892] = class68.field1250.field3101;
                        class128.field2412[class53.field892] = class26.field415;
                        class128.field2410[class53.field892] = class36.field586;
                        class128.field2443[class53.field892] = var21.field2051;
                        class128.field2425[class53.field892] = var21.field2026;
                        class128.field2420[class53.field892] = var21.field2068;
                        class128.field2433[class53.field892] = var21.field2041;
                        class53.field892++;
                    }
                }
                if (var21.field2057 > class21.field338) {
                    class19.method112(var21, 0, var21.method608(-118) + 15);
                    if (class26.field415 > -1) {
                        class118.method651(arg3 + class26.field415 - 15, arg0 - 3 + class36.field586, var21.field2036, 5, 65280);
                        class118.method651(class26.field415 + arg3 + var21.field2036 - 15, class36.field586 + arg0 + -3, 30 - var21.field2036, 5, 16711680);
                    }
                }
                for (int var26 = 0; var26 < 4; var26++) {
                    if (class21.field338 < var21.field2063[var26]) {
                        class19.method112(var21, 0, var21.method608(71) / 2);
                        if (class26.field415 > -1) {
                            if (var26 == 1) {
                                class36.field586 -= 20;
                            }
                            if (var26 == 2) {
                                class26.field415 -= 15;
                                class36.field586 -= 10;
                            }
                            if (var26 == 3) {
                                class36.field586 -= 10;
                                class26.field415 += 15;
                            }
                            class115.field2167[var21.field2049[var26]].method737(class26.field415 + arg3 - 12, arg0 - 12 + class36.field586);
                            class203.field3923.method997(class67.method357((byte) -102, var21.field2013[var26]), arg3 + class26.field415 - 1, class36.field586 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var6 = 0;
        if (arg1) {
            field472 = null;
        }
        while (var6 < class53.field892) {
            int var7 = class128.field2412[var6];
            int var8 = class128.field2410[var6];
            int var9 = class128.field2428[var6];
            int var10 = class128.field2432[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class128.field2410[var20] + -class128.field2432[var20] && var8 - var10 < class128.field2410[var20] - -2 && class128.field2428[var20] + class128.field2412[var20] > -var9 + var7 && class128.field2412[var20] - class128.field2428[var20] < var7 + var9 && class128.field2410[var20] - class128.field2432[var20] < var8) {
                        var11 = true;
                        var8 = class128.field2410[var20] - class128.field2432[var20];
                    }
                }
            }
            class26.field415 = class128.field2412[var6];
            class36.field586 = class128.field2410[var6] = var8;
            class93 var12 = class128.field2433[var6];
            if (class179.field3552 == 0) {
                int var13 = 16776960;
                if (class128.field2443[var6] < 6) {
                    var13 = class37.field633[class128.field2443[var6]];
                }
                if (class128.field2443[var6] == 6) {
                    var13 = class49.field793 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class128.field2443[var6] == 7) {
                    var13 = class49.field793 % 20 >= 10 ? 65535 : 255;
                }
                if (class128.field2443[var6] == 8) {
                    var13 = class49.field793 % 20 < 10 ? 45056 : 8454016;
                }
                if (class128.field2443[var6] == 9) {
                    int var14 = 150 - class128.field2420[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class128.field2443[var6] == 10) {
                    int var15 = 150 - class128.field2420[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 255 + 500 - var15 * 5 - 32768000;
                    }
                }
                if (class128.field2443[var6] == 11) {
                    int var16 = 150 - class128.field2420[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 49545215 - var16 * 327680;
                    }
                }
                if (class128.field2425[var6] == 0) {
                    class68.field1250.method997(var12, class26.field415 + arg3, class36.field586 + arg0, var13, 0);
                }
                if (class128.field2425[var6] == 1) {
                    class68.field1250.method998(var12, class26.field415 + arg3, class36.field586 + arg0, var13, 0, class49.field793);
                }
                if (class128.field2425[var6] == 2) {
                    class68.field1250.method1002(var12, class26.field415 + arg3, arg0 - -class36.field586, var13, 0, class49.field793);
                }
                if (class128.field2425[var6] == 3) {
                    class68.field1250.method999(var12, class26.field415 + arg3, class36.field586 + arg0, var13, 0, class49.field793, 150 - class128.field2420[var6]);
                }
                if (class128.field2425[var6] == 4) {
                    int var17 = (150 - class128.field2420[var6]) * (class68.field1250.method1005(var12) + 100) / 150;
                    class118.method658(class26.field415 + arg3 - 50, arg0, arg3 + class26.field415 + 50, arg0 + arg4);
                    class68.field1250.method1013(var12, arg3 + class26.field415 + 50 - var17, arg0 - -class36.field586, var13, 0);
                    class118.method656(arg3, arg0, arg2 + arg3, arg0 + arg4);
                }
                if (class128.field2425[var6] == 5) {
                    int var18 = 150 - class128.field2420[var6];
                    int var19 = 0;
                    class118.method658(arg3, class36.field586 + arg0 - class68.field1250.field3101 - 1, arg2 + arg3, class36.field586 + arg0 + 5);
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class68.field1250.method997(var12, class26.field415 + arg3, class36.field586 + arg0 + var19, var13, 0);
                    class118.method656(arg3, arg0, arg2 + arg3, arg0 + arg4);
                }
            } else {
                class68.field1250.method997(var12, class26.field415 + arg3, arg0 - -class36.field586, 16776960, 0);
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)I")
    public static final int method163(byte arg0) {
        if (arg0 >= -108) {
            return 57;
        } else {
            field470++;
            return class181.field3585++;
        }
    }
}
