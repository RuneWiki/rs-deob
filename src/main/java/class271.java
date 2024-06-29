import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class271 extends class162 {

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Lik;")
    public class283 field4440;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field4443 = 0;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4446 = "Loading world list data";

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4448 = "Checking for updates - ";

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
    public static int[] field4439;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "[I")
    public static int[] field4442;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZ)V")
    public final void method1859(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field4438 = -75;
        }
        this.field4433 = arg0;
        this.field4444 = arg2;
        field4435++;
        this.field4438 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4439 = null;
        field4446 = null;
        field4448 = null;
        int var1 = -98 / ((-arg0 - 52) / 48);
        field4442 = null;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)Lve;")
    public static final class203 method1861(int arg0) {
        field4432++;
        if (arg0 != -16307) {
            field4439 = null;
        }
        return class180.field2796 < class276.field4576.length ? class276.field4576[class180.field2796++] : null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1862(class154 arg0, boolean arg1) {
        class260.field4260.method1952(arg0, 76);
        while (true) {
            class154 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class154[][] var7;
            class154 var83;
            do {
                class154 var82;
                do {
                    class154 var81;
                    do {
                        class154 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class154) class260.field4260.method1960((byte) -108);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2421);
                                            var3 = var2.field2432;
                                            var4 = var2.field2426;
                                            var5 = var2.field2416;
                                            var6 = var2.field2429;
                                            var7 = class27.field346[var5];
                                            if (!var2.field2412) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class154 var8 = class27.field346[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2421) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class111.field1690 && var3 > class152.field2376) {
                                                    class154 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2421 && (var9.field2412 || (var2.field2434 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class111.field1690 && var3 < class287.field4788 - 1) {
                                                    class154 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2421 && (var10.field2412 || (var2.field2434 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class100.field1512 && var4 > class151.field2348) {
                                                    class154 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2421 && (var11.field2412 || (var2.field2434 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class100.field1512 && var4 < class79.field1249 - 1) {
                                                    class154 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2421 && (var12.field2412 || (var2.field2434 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2412 = false;
                                            if (var2.field2435 != null) {
                                                class154 var13 = var2.field2435;
                                                if (var13.field2423 == null) {
                                                    if (var13.field2428 != null) {
                                                        if (class147.method978(0, var3, var4)) {
                                                            class276.method1919(var13.field2428, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, true);
                                                        } else {
                                                            class276.method1919(var13.field2428, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class147.method978(0, var3, var4)) {
                                                    class1.method2(var13.field2423, 0, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, true);
                                                } else {
                                                    class1.method2(var13.field2423, 0, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, false);
                                                }
                                                class169 var14 = var13.field2411;
                                                if (var14 != null) {
                                                    var14.field2639.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var14.field2645 - class160.field2527, var14.field2641 - class60.field925, var14.field2642 - class60.field927, var14.field2635, var5, (class77) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2431; var15++) {
                                                    class114 var16 = var13.field2418[var15];
                                                    if (var16 != null) {
                                                        var16.field1726.method205(var16.field1720, class48.field663, class55.field746, class57.field781, class71.field1034, var16.field1713 - class160.field2527, var16.field1723 - class60.field925, var16.field1721 - class60.field927, var16.field1712, var5, (class77) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2423 == null) {
                                                if (var2.field2428 != null) {
                                                    if (class147.method978(var6, var3, var4)) {
                                                        class276.method1919(var2.field2428, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class276.method1919(var2.field2428, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, false);
                                                    }
                                                }
                                            } else if (class147.method978(var6, var3, var4)) {
                                                class1.method2(var2.field2423, var6, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2423.field2626 != 12345678 || class34.field418 && var5 <= class193.field3047) {
                                                    class1.method2(var2.field2423, var6, class48.field663, class55.field746, class57.field781, class71.field1034, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class286 var18 = var2.field2419;
                                                if (var18 != null && (var18.field4766 & 0x80000000L) != 0L) {
                                                    var18.field4769.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var18.field4771 - class160.field2527, var18.field4764 - class60.field925, var18.field4774 - class60.field927, var18.field4766, var5, (class77) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class169 var21 = var2.field2411;
                                            class98 var22 = var2.field2414;
                                            if (var21 != null || var22 != null) {
                                                if (class111.field1690 == var3) {
                                                    var19++;
                                                } else if (class111.field1690 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class100.field1512 == var4) {
                                                    var19 += 3;
                                                } else if (class100.field1512 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class281.field4648[var19];
                                                var2.field2422 = class49.field669[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2632 & class261.field4292[var19]) == 0) {
                                                    var2.field2425 = 0;
                                                } else if (var21.field2632 == 16) {
                                                    var2.field2425 = 3;
                                                    var2.field2427 = class18.field244[var19];
                                                    var2.field2433 = 3 - var2.field2427;
                                                } else if (var21.field2632 == 32) {
                                                    var2.field2425 = 6;
                                                    var2.field2427 = class245.field3911[var19];
                                                    var2.field2433 = 6 - var2.field2427;
                                                } else if (var21.field2632 == 64) {
                                                    var2.field2425 = 12;
                                                    var2.field2427 = class275.field4556[var19];
                                                    var2.field2433 = 12 - var2.field2427;
                                                } else {
                                                    var2.field2425 = 9;
                                                    var2.field2427 = class89.field1372[var19];
                                                    var2.field2433 = 9 - var2.field2427;
                                                }
                                                if ((var21.field2632 & var20) != 0 && !class198.method1370(var6, var3, var4, var21.field2632)) {
                                                    var21.field2639.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var21.field2645 - class160.field2527, var21.field2641 - class60.field925, var21.field2642 - class60.field927, var21.field2635, var5, (class77) null);
                                                }
                                                if ((var21.field2633 & var20) != 0 && !class198.method1370(var6, var3, var4, var21.field2633)) {
                                                    var21.field2634.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var21.field2645 - class160.field2527, var21.field2641 - class60.field925, var21.field2642 - class60.field927, var21.field2635, var5, (class77) null);
                                                }
                                            }
                                            if (var22 != null && !class217.method1515(var6, var3, var4, var22.field1480.method206())) {
                                                if ((var22.field1478 & var20) != 0) {
                                                    var22.field1480.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var22.field1475 + var22.field1466 - class160.field2527, var22.field1468 - class60.field925, var22.field1472 + var22.field1469 - class60.field927, var22.field1465, var5, (class77) null);
                                                } else if (var22.field1478 == 256) {
                                                    int var23 = var22.field1475 - class160.field2527;
                                                    int var24 = var22.field1468 - class60.field925;
                                                    int var25 = var22.field1472 - class60.field927;
                                                    int var26 = var22.field1464;
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
                                                        var22.field1480.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var22.field1466 + var23, var24, var22.field1469 + var25, var22.field1465, var5, (class77) null);
                                                    } else if (var22.field1479 != null) {
                                                        var22.field1479.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var23, var24, var25, var22.field1465, var5, (class77) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class286 var29 = var2.field2419;
                                                if (var29 != null && (var29.field4766 & 0x80000000L) == 0L) {
                                                    var29.field4769.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var29.field4771 - class160.field2527, var29.field4764 - class60.field925, var29.field4774 - class60.field927, var29.field4766, var5, (class77) null);
                                                }
                                                class166 var30 = var2.field2430;
                                                if (var30 != null && var30.field2614 == 0) {
                                                    if (var30.field2610 != null) {
                                                        var30.field2610.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var30.field2605 - class160.field2527, var30.field2604 - class60.field925, var30.field2606 - class60.field927, var30.field2611, var5, (class77) null);
                                                    }
                                                    if (var30.field2613 != null) {
                                                        var30.field2613.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var30.field2605 - class160.field2527, var30.field2604 - class60.field925, var30.field2606 - class60.field927, var30.field2611, var5, (class77) null);
                                                    }
                                                    if (var30.field2612 != null) {
                                                        var30.field2612.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var30.field2605 - class160.field2527, var30.field2604 - class60.field925, var30.field2606 - class60.field927, var30.field2611, var5, (class77) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2434;
                                            if (var31 != 0) {
                                                if (var3 < class111.field1690 && (var31 & 0x4) != 0) {
                                                    class154 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2421) {
                                                        class260.field4260.method1952(var32, 76);
                                                    }
                                                }
                                                if (var4 < class100.field1512 && (var31 & 0x2) != 0) {
                                                    class154 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2421) {
                                                        class260.field4260.method1952(var33, 76);
                                                    }
                                                }
                                                if (var3 > class111.field1690 && (var31 & 0x1) != 0) {
                                                    class154 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2421) {
                                                        class260.field4260.method1952(var34, 76);
                                                    }
                                                }
                                                if (var4 > class100.field1512 && (var31 & 0x8) != 0) {
                                                    class154 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2421) {
                                                        class260.field4260.method1952(var35, 76);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2425 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2431; var37++) {
                                                if (class92.field1399 != var2.field2418[var37].field1722 && (var2.field2417[var37] & var2.field2425) == var2.field2427) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class169 var38 = var2.field2411;
                                                if (!class198.method1370(var6, var3, var4, var38.field2632)) {
                                                    var38.field2639.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var38.field2645 - class160.field2527, var38.field2641 - class60.field925, var38.field2642 - class60.field927, var38.field2635, var5, (class77) null);
                                                }
                                                var2.field2425 = 0;
                                            }
                                        }
                                        if (!var2.field2420) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2431;
                                            var2.field2420 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class114 var42 = var2.field2418[var41];
                                                if (class92.field1399 != var42.field1722) {
                                                    for (int var43 = var42.field1724; var43 <= var42.field1715; var43++) {
                                                        for (int var44 = var42.field1719; var44 <= var42.field1714; var44++) {
                                                            class154 var45 = var7[var43][var44];
                                                            if (var45.field2412) {
                                                                var2.field2420 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field2425 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1724) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1715) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1719) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1714) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2425) == var2.field2433) {
                                                                    var2.field2420 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class24.field317[var40++] = var42;
                                                    int var47 = class111.field1690 - var42.field1724;
                                                    int var48 = var42.field1715 - class111.field1690;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class100.field1512 - var42.field1719;
                                                    int var50 = var42.field1714 - class100.field1512;
                                                    if (var50 > var49) {
                                                        var42.field1717 = var47 + var50;
                                                    } else {
                                                        var42.field1717 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class114 var54 = class24.field317[var53];
                                                    if (class92.field1399 != var54.field1722) {
                                                        if (var54.field1717 > var51) {
                                                            var51 = var54.field1717;
                                                            var52 = var53;
                                                        } else if (var54.field1717 == var51) {
                                                            int var55 = var54.field1713 - class160.field2527;
                                                            int var56 = var54.field1721 - class60.field927;
                                                            int var57 = class24.field317[var52].field1713 - class160.field2527;
                                                            int var58 = class24.field317[var52].field1721 - class60.field927;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class114 var59 = class24.field317[var52];
                                                var59.field1722 = class92.field1399;
                                                if (!class42.method271(var6, var59.field1724, var59.field1715, var59.field1719, var59.field1714, var59.field1726.method206())) {
                                                    var59.field1726.method205(var59.field1720, class48.field663, class55.field746, class57.field781, class71.field1034, var59.field1713 - class160.field2527, var59.field1723 - class60.field925, var59.field1721 - class60.field927, var59.field1712, var5, (class77) null);
                                                }
                                                for (int var60 = var59.field1724; var60 <= var59.field1715; var60++) {
                                                    for (int var61 = var59.field1719; var61 <= var59.field1714; var61++) {
                                                        class154 var62 = var7[var60][var61];
                                                        if (var62.field2425 != 0) {
                                                            class260.field4260.method1952(var62, 76);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2421) {
                                                            class260.field4260.method1952(var62, 76);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2420) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field2420 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2424 != null) {
                                        int var63 = class77.field1199 + class172.field2663;
                                        int var64 = class77.field1209 + class172.field2657;
                                        class68 var65 = var2.field2424.field1499;
                                        for (class68 var66 = var65.field994; var66 != var65; var66 = var66.field994) {
                                            class269 var67 = (class269) var66;
                                            if (var67.field4417 != null && !var67.field4417.field2240.field1207) {
                                                if ((byte) ((int) (var67.field4417.field2240.field1203 & 0xFFL)) != var2.field2413) {
                                                    var2.field2424 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field4420 >> 12) - class160.field2527;
                                                int var69 = (var67.field4415 >> 12) - class60.field925;
                                                int var70 = (var67.field4418 >> 12) - class60.field927;
                                                int var71 = class71.field1034 * var68 + class57.field781 * var70 >> 16;
                                                int var72 = class71.field1034 * var70 - class57.field781 * var68 >> 16;
                                                int var74 = class55.field746 * var69 - class48.field663 * var72 >> 16;
                                                int var75 = class55.field746 * var72 + class48.field663 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class62.method407(var77, var78, (var67.field4417.field2254.field556 << 16) / var79, var67.field4407, var67.field4407 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2421);
                            } while (var2.field2425 != 0);
                            if (var3 > class111.field1690 || var3 <= class152.field2376) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field2421);
                        if (var3 < class111.field1690 || var3 >= class287.field4788 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field2421);
                    if (var4 > class100.field1512 || var4 <= class151.field2348) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field2421);
                if (var4 < class100.field1512 || var4 >= class79.field1249 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field2421);
            var2.field2421 = false;
            class282.field4666--;
            class166 var84 = var2.field2430;
            if (var84 != null && var84.field2614 != 0) {
                if (var84.field2610 != null) {
                    var84.field2610.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var84.field2605 - class160.field2527, var84.field2604 - class60.field925 - var84.field2614, var84.field2606 - class60.field927, var84.field2611, var5, (class77) null);
                }
                if (var84.field2613 != null) {
                    var84.field2613.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var84.field2605 - class160.field2527, var84.field2604 - class60.field925 - var84.field2614, var84.field2606 - class60.field927, var84.field2611, var5, (class77) null);
                }
                if (var84.field2612 != null) {
                    var84.field2612.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var84.field2605 - class160.field2527, var84.field2604 - class60.field925 - var84.field2614, var84.field2606 - class60.field927, var84.field2611, var5, (class77) null);
                }
            }
            if (var2.field2422 != 0) {
                class98 var85 = var2.field2414;
                if (var85 != null && !class217.method1515(var6, var3, var4, var85.field1480.method206())) {
                    if ((var85.field1478 & var2.field2422) != 0) {
                        var85.field1480.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var85.field1475 + var85.field1466 - class160.field2527, var85.field1468 - class60.field925, var85.field1472 + var85.field1469 - class60.field927, var85.field1465, var5, (class77) null);
                    } else if (var85.field1478 == 256) {
                        int var86 = var85.field1475 - class160.field2527;
                        int var87 = var85.field1468 - class60.field925;
                        int var88 = var85.field1472 - class60.field927;
                        int var89 = var85.field1464;
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
                            var85.field1480.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var85.field1466 + var86, var87, var85.field1469 + var88, var85.field1465, var5, (class77) null);
                        } else if (var85.field1479 != null) {
                            var85.field1479.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var86, var87, var88, var85.field1465, var5, (class77) null);
                        }
                    }
                }
                class169 var92 = var2.field2411;
                if (var92 != null) {
                    if ((var92.field2633 & var2.field2422) != 0 && !class198.method1370(var6, var3, var4, var92.field2633)) {
                        var92.field2634.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var92.field2645 - class160.field2527, var92.field2641 - class60.field925, var92.field2642 - class60.field927, var92.field2635, var5, (class77) null);
                    }
                    if ((var92.field2632 & var2.field2422) != 0 && !class198.method1370(var6, var3, var4, var92.field2632)) {
                        var92.field2639.method205(0, class48.field663, class55.field746, class57.field781, class71.field1034, var92.field2645 - class160.field2527, var92.field2641 - class60.field925, var92.field2642 - class60.field927, var92.field2635, var5, (class77) null);
                    }
                }
            }
            if (var5 < class277.field4590 - 1) {
                class154 var93 = class27.field346[var5 + 1][var3][var4];
                if (var93 != null && var93.field2421) {
                    class260.field4260.method1952(var93, 76);
                }
            }
            if (var3 < class111.field1690) {
                class154 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field2421) {
                    class260.field4260.method1952(var94, 76);
                }
            }
            if (var4 < class100.field1512) {
                class154 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field2421) {
                    class260.field4260.method1952(var95, 76);
                }
            }
            if (var3 > class111.field1690) {
                class154 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field2421) {
                    class260.field4260.method1952(var96, 76);
                }
            }
            if (var4 > class100.field1512) {
                class154 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field2421) {
                    class260.field4260.method1952(var97, 76);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIBZ)I")
    public static final int method1863(int arg0, int arg1, byte arg2, boolean arg3) {
        field4441++;
        class120 var4 = (class120) class42.field550.method872((byte) -103, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1842.length; var6++) {
            if (var4.field1842[var6] >= 0 && var4.field1842[var6] < class120.field1845) {
                class132 var7 = class14.method92(var4.field1842[var6], false);
                if (var7.field2054 != null) {
                    class221 var8 = (class221) var7.field2054.method872((byte) -92, (long) arg0);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field1840[var6] * var8.field3542;
                        } else {
                            var5 += var8.field3542;
                        }
                    }
                }
            }
        }
        if (arg2 != 109) {
            field4446 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1864(int arg0, int arg1) {
        class273.field4482 = 100;
        int var2 = 88 / ((37 - arg0) / 61);
        field4437++;
        class237.field3752 = 3;
        class208.field3326 = arg1;
        class203.field3279 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lik;Lgd;)V")
    public class271(class283 arg0, class77 arg1) {
        this.field4440 = arg0;
    }
}
