import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class302 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[Z")
    public static boolean[] field4808 = new boolean[100];

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4807 = "M";

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    public static int[] field4810;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)V")
    public static final void method2029(byte arg0, int arg1, int arg2) {
        class144.field2145 = (float) arg1;
        field4809++;
        class215.field3356 = (float) arg2;
        if (arg0 != -9) {
            return;
        }
        if (class158.field2370 == 2) {
            class147.field2189 = arg2;
            class56.field817 = arg1;
        }
        class186.method1312(false);
        class89.field1345 = true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method2030(int arg0) {
        field4808 = null;
        field4807 = null;
        if (arg0 == -8681) {
            field4810 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method2031(int arg0, int arg1) {
        field4806++;
        if (class294.field4712 == 0) {
            class179.field2810.method2052(1, arg1);
        } else {
            class93.field1400 = arg1;
        }
        if (arg0 != -27001) {
            method2032((class113) null, false);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lda;Z)V")
    public static final void method2032(class113 arg0, boolean arg1) {
        class174.field2737.method1540(arg0, (byte) -80);
        while (true) {
            class113 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class113[][] var7;
            class113 var83;
            do {
                class113 var82;
                do {
                    class113 var81;
                    do {
                        class113 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class113) class174.field2737.method1547(121);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1629);
                                            var3 = var2.field1633;
                                            var4 = var2.field1642;
                                            var5 = var2.field1636;
                                            var6 = var2.field1630;
                                            var7 = class184.field2892[var5];
                                            if (!var2.field1632) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class113 var8 = class184.field2892[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1629) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class32.field386 && var3 > class264.field4286) {
                                                    class113 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1629 && (var9.field1632 || (var2.field1637 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class32.field386 && var3 < class232.field3755 - 1) {
                                                    class113 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1629 && (var10.field1632 || (var2.field1637 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class286.field4622 && var4 > class212.field3301) {
                                                    class113 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1629 && (var11.field1632 || (var2.field1637 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class286.field4622 && var4 < class304.field4834 - 1) {
                                                    class113 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1629 && (var12.field1632 || (var2.field1637 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1632 = false;
                                            if (var2.field1635 != null) {
                                                class113 var13 = var2.field1635;
                                                if (var13.field1645 == null) {
                                                    if (var13.field1657 != null) {
                                                        if (class277.method1911(0, var3, var4)) {
                                                            class41.method236(var13.field1657, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, true);
                                                        } else {
                                                            class41.method236(var13.field1657, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class277.method1911(0, var3, var4)) {
                                                    class195.method1363(var13.field1645, 0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, true);
                                                } else {
                                                    class195.method1363(var13.field1645, 0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, false);
                                                }
                                                class263 var14 = var13.field1640;
                                                if (var14 != null) {
                                                    var14.field4281.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var14.field4283 - class220.field3458, var14.field4274 - class148.field2203, var14.field4280 - class140.field2008, var14.field4270, var5, (class65) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1646; var15++) {
                                                    class158 var16 = var13.field1634[var15];
                                                    if (var16 != null) {
                                                        var16.field2365.method10(var16.field2362, class89.field1350, class248.field4025, class254.field4149, class27.field313, var16.field2361 - class220.field3458, var16.field2355 - class148.field2203, var16.field2353 - class140.field2008, var16.field2354, var5, (class65) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1645 == null) {
                                                if (var2.field1657 != null) {
                                                    if (class277.method1911(var6, var3, var4)) {
                                                        class41.method236(var2.field1657, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class41.method236(var2.field1657, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, false);
                                                    }
                                                }
                                            } else if (class277.method1911(var6, var3, var4)) {
                                                class195.method1363(var2.field1645, var6, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1645.field4440 != 12345678 || class198.field3142 && var5 <= class10.field158) {
                                                    class195.method1363(var2.field1645, var6, class89.field1350, class248.field4025, class254.field4149, class27.field313, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class58 var18 = var2.field1650;
                                                if (var18 != null && (var18.field859 & 0x80000000L) != 0L) {
                                                    var18.field856.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var18.field854 - class220.field3458, var18.field860 - class148.field2203, var18.field851 - class140.field2008, var18.field859, var5, (class65) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class263 var21 = var2.field1640;
                                            class165 var22 = var2.field1649;
                                            if (var21 != null || var22 != null) {
                                                if (class32.field386 == var3) {
                                                    var19++;
                                                } else if (class32.field386 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class286.field4622 == var4) {
                                                    var19 += 3;
                                                } else if (class286.field4622 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class178.field2793[var19];
                                                var2.field1659 = class285.field4614[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4276 & class69.field1028[var19]) == 0) {
                                                    var2.field1651 = 0;
                                                } else if (var21.field4276 == 16) {
                                                    var2.field1651 = 3;
                                                    var2.field1639 = class210.field3280[var19];
                                                    var2.field1641 = 3 - var2.field1639;
                                                } else if (var21.field4276 == 32) {
                                                    var2.field1651 = 6;
                                                    var2.field1639 = class144.field2155[var19];
                                                    var2.field1641 = 6 - var2.field1639;
                                                } else if (var21.field4276 == 64) {
                                                    var2.field1651 = 12;
                                                    var2.field1639 = class277.field4509[var19];
                                                    var2.field1641 = 12 - var2.field1639;
                                                } else {
                                                    var2.field1651 = 9;
                                                    var2.field1639 = class20.field266[var19];
                                                    var2.field1641 = 9 - var2.field1639;
                                                }
                                                if ((var21.field4276 & var20) != 0 && !class209.method1455(var6, var3, var4, var21.field4276)) {
                                                    var21.field4281.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var21.field4283 - class220.field3458, var21.field4274 - class148.field2203, var21.field4280 - class140.field2008, var21.field4270, var5, (class65) null);
                                                }
                                                if ((var21.field4278 & var20) != 0 && !class209.method1455(var6, var3, var4, var21.field4278)) {
                                                    var21.field4275.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var21.field4283 - class220.field3458, var21.field4274 - class148.field2203, var21.field4280 - class140.field2008, var21.field4270, var5, (class65) null);
                                                }
                                            }
                                            if (var22 != null && !class153.method1061(var6, var3, var4, var22.field2552.method4())) {
                                                if ((var22.field2547 & var20) != 0) {
                                                    var22.field2552.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var22.field2545 + var22.field2553 - class220.field3458, var22.field2549 - class148.field2203, var22.field2546 + var22.field2548 - class140.field2008, var22.field2551, var5, (class65) null);
                                                } else if (var22.field2547 == 256) {
                                                    int var23 = var22.field2545 - class220.field3458;
                                                    int var24 = var22.field2549 - class148.field2203;
                                                    int var25 = var22.field2546 - class140.field2008;
                                                    int var26 = var22.field2554;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2552.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var22.field2553 + var23, var24, var22.field2548 + var25, var22.field2551, var5, (class65) null);
                                                    } else if (var22.field2555 != null) {
                                                        var22.field2555.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var23, var24, var25, var22.field2551, var5, (class65) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class58 var29 = var2.field1650;
                                                if (var29 != null && (var29.field859 & 0x80000000L) == 0L) {
                                                    var29.field856.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var29.field854 - class220.field3458, var29.field860 - class148.field2203, var29.field851 - class140.field2008, var29.field859, var5, (class65) null);
                                                }
                                                class123 var30 = var2.field1631;
                                                if (var30 != null && var30.field1779 == 0) {
                                                    if (var30.field1777 != null) {
                                                        var30.field1777.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var30.field1764 - class220.field3458, var30.field1768 - class148.field2203, var30.field1770 - class140.field2008, var30.field1774, var5, (class65) null);
                                                    }
                                                    if (var30.field1767 != null) {
                                                        var30.field1767.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var30.field1764 - class220.field3458, var30.field1768 - class148.field2203, var30.field1770 - class140.field2008, var30.field1774, var5, (class65) null);
                                                    }
                                                    if (var30.field1765 != null) {
                                                        var30.field1765.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var30.field1764 - class220.field3458, var30.field1768 - class148.field2203, var30.field1770 - class140.field2008, var30.field1774, var5, (class65) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1637;
                                            if (var31 != 0) {
                                                if (var3 < class32.field386 && (var31 & 0x4) != 0) {
                                                    class113 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1629) {
                                                        class174.field2737.method1540(var32, (byte) -105);
                                                    }
                                                }
                                                if (var4 < class286.field4622 && (var31 & 0x2) != 0) {
                                                    class113 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1629) {
                                                        class174.field2737.method1540(var33, (byte) -109);
                                                    }
                                                }
                                                if (var3 > class32.field386 && (var31 & 0x1) != 0) {
                                                    class113 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1629) {
                                                        class174.field2737.method1540(var34, (byte) -107);
                                                    }
                                                }
                                                if (var4 > class286.field4622 && (var31 & 0x8) != 0) {
                                                    class113 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1629) {
                                                        class174.field2737.method1540(var35, (byte) -116);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1651 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1646; var37++) {
                                                if (class68.field1016 != var2.field1634[var37].field2360 && (var2.field1638[var37] & var2.field1651) == var2.field1639) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class263 var38 = var2.field1640;
                                                if (!class209.method1455(var6, var3, var4, var38.field4276)) {
                                                    var38.field4281.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var38.field4283 - class220.field3458, var38.field4274 - class148.field2203, var38.field4280 - class140.field2008, var38.field4270, var5, (class65) null);
                                                }
                                                var2.field1651 = 0;
                                            }
                                        }
                                        if (!var2.field1644) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1646;
                                            var2.field1644 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class158 var42 = var2.field1634[var41];
                                                if (class68.field1016 != var42.field2360) {
                                                    for (int var43 = var42.field2352; var43 <= var42.field2368; var43++) {
                                                        for (int var44 = var42.field2359; var44 <= var42.field2363; var44++) {
                                                            class113 var45 = var7[var43][var44];
                                                            if (var45.field1632) {
                                                                var2.field1644 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field1651 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2352) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2368) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2359) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2363) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1651) == var2.field1641) {
                                                                    var2.field1644 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class27.field320[var40++] = var42;
                                                    int var47 = class32.field386 - var42.field2352;
                                                    int var48 = var42.field2368 - class32.field386;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class286.field4622 - var42.field2359;
                                                    int var50 = var42.field2363 - class286.field4622;
                                                    if (var50 > var49) {
                                                        var42.field2351 = var47 + var50;
                                                    } else {
                                                        var42.field2351 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class158 var54 = class27.field320[var53];
                                                    if (class68.field1016 != var54.field2360) {
                                                        if (var54.field2351 > var51) {
                                                            var51 = var54.field2351;
                                                            var52 = var53;
                                                        } else if (var54.field2351 == var51) {
                                                            int var55 = var54.field2361 - class220.field3458;
                                                            int var56 = var54.field2353 - class140.field2008;
                                                            int var57 = class27.field320[var52].field2361 - class220.field3458;
                                                            int var58 = class27.field320[var52].field2353 - class140.field2008;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class158 var59 = class27.field320[var52];
                                                var59.field2360 = class68.field1016;
                                                if (!class226.method1601(var6, var59.field2352, var59.field2368, var59.field2359, var59.field2363, var59.field2365.method4())) {
                                                    var59.field2365.method10(var59.field2362, class89.field1350, class248.field4025, class254.field4149, class27.field313, var59.field2361 - class220.field3458, var59.field2355 - class148.field2203, var59.field2353 - class140.field2008, var59.field2354, var5, (class65) null);
                                                }
                                                for (int var60 = var59.field2352; var60 <= var59.field2368; var60++) {
                                                    for (int var61 = var59.field2359; var61 <= var59.field2363; var61++) {
                                                        class113 var62 = var7[var60][var61];
                                                        if (var62.field1651 != 0) {
                                                            class174.field2737.method1540(var62, (byte) -55);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1629) {
                                                            class174.field2737.method1540(var62, (byte) -52);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1644) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field1644 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1647 != null) {
                                        int var63 = class65.field943 + class221.field3459;
                                        int var64 = class65.field938 + class221.field3463;
                                        class136 var65 = var2.field1647.field2015;
                                        for (class136 var66 = var65.field1963; var66 != var65; var66 = var66.field1963) {
                                            class154 var67 = (class154) var66;
                                            if (var67.field2306 != null && !var67.field2306.field1150.field933) {
                                                if ((byte) ((int) (var67.field2306.field1150.field942 & 0xFFL)) != var2.field1654) {
                                                    var2.field1647 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field2302 >> 12) - class220.field3458;
                                                int var69 = (var67.field2307 >> 12) - class148.field2203;
                                                int var70 = (var67.field2310 >> 12) - class140.field2008;
                                                int var71 = class27.field313 * var68 + class254.field4149 * var70 >> 16;
                                                int var72 = class27.field313 * var70 - class254.field4149 * var68 >> 16;
                                                int var74 = class248.field4025 * var69 - class89.field1350 * var72 >> 16;
                                                int var75 = class89.field1350 * var69 + class248.field4025 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class151.method1022(var77, var78, (var67.field2306.field1168.field4535 << 16) / var79, var67.field2298, var67.field2298 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1629);
                            } while (var2.field1651 != 0);
                            if (var3 > class32.field386 || var3 <= class264.field4286) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field1629);
                        if (var3 < class32.field386 || var3 >= class232.field3755 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field1629);
                    if (var4 > class286.field4622 || var4 <= class212.field3301) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field1629);
                if (var4 < class286.field4622 || var4 >= class304.field4834 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field1629);
            var2.field1629 = false;
            class59.field867--;
            class123 var84 = var2.field1631;
            if (var84 != null && var84.field1779 != 0) {
                if (var84.field1777 != null) {
                    var84.field1777.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var84.field1764 - class220.field3458, var84.field1768 - class148.field2203 - var84.field1779, var84.field1770 - class140.field2008, var84.field1774, var5, (class65) null);
                }
                if (var84.field1767 != null) {
                    var84.field1767.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var84.field1764 - class220.field3458, var84.field1768 - class148.field2203 - var84.field1779, var84.field1770 - class140.field2008, var84.field1774, var5, (class65) null);
                }
                if (var84.field1765 != null) {
                    var84.field1765.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var84.field1764 - class220.field3458, var84.field1768 - class148.field2203 - var84.field1779, var84.field1770 - class140.field2008, var84.field1774, var5, (class65) null);
                }
            }
            if (var2.field1659 != 0) {
                class165 var85 = var2.field1649;
                if (var85 != null && !class153.method1061(var6, var3, var4, var85.field2552.method4())) {
                    if ((var85.field2547 & var2.field1659) != 0) {
                        var85.field2552.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var85.field2545 + var85.field2553 - class220.field3458, var85.field2549 - class148.field2203, var85.field2546 + var85.field2548 - class140.field2008, var85.field2551, var5, (class65) null);
                    } else if (var85.field2547 == 256) {
                        int var86 = var85.field2545 - class220.field3458;
                        int var87 = var85.field2549 - class148.field2203;
                        int var88 = var85.field2546 - class140.field2008;
                        int var89 = var85.field2554;
                        int var90;
                        if (var89 == 1 || var89 == 2) {
                            var90 = -var86;
                        } else {
                            var90 = var86;
                        }
                        int var91;
                        if (var89 == 2 || var89 == 3) {
                            var91 = -var88;
                        } else {
                            var91 = var88;
                        }
                        if (var91 >= var90) {
                            var85.field2552.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var85.field2553 + var86, var87, var85.field2548 + var88, var85.field2551, var5, (class65) null);
                        } else if (var85.field2555 != null) {
                            var85.field2555.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var86, var87, var88, var85.field2551, var5, (class65) null);
                        }
                    }
                }
                class263 var92 = var2.field1640;
                if (var92 != null) {
                    if ((var92.field4278 & var2.field1659) != 0 && !class209.method1455(var6, var3, var4, var92.field4278)) {
                        var92.field4275.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var92.field4283 - class220.field3458, var92.field4274 - class148.field2203, var92.field4280 - class140.field2008, var92.field4270, var5, (class65) null);
                    }
                    if ((var92.field4276 & var2.field1659) != 0 && !class209.method1455(var6, var3, var4, var92.field4276)) {
                        var92.field4281.method10(0, class89.field1350, class248.field4025, class254.field4149, class27.field313, var92.field4283 - class220.field3458, var92.field4274 - class148.field2203, var92.field4280 - class140.field2008, var92.field4270, var5, (class65) null);
                    }
                }
            }
            if (var5 < class312.field5002 - 1) {
                class113 var93 = class184.field2892[var5 + 1][var3][var4];
                if (var93 != null && var93.field1629) {
                    class174.field2737.method1540(var93, (byte) -82);
                }
            }
            if (var3 < class32.field386) {
                class113 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field1629) {
                    class174.field2737.method1540(var94, (byte) -116);
                }
            }
            if (var4 < class286.field4622) {
                class113 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field1629) {
                    class174.field2737.method1540(var95, (byte) -110);
                }
            }
            if (var3 > class32.field386) {
                class113 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field1629) {
                    class174.field2737.method1540(var96, (byte) -61);
                }
            }
            if (var4 > class286.field4622) {
                class113 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field1629) {
                    class174.field2737.method1540(var97, (byte) -118);
                }
            }
        }
    }
}
