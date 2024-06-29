import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class47 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
    public static boolean field882 = false;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Ltg;")
    private static class184 field886 = class135.method812("You have only just left another world)3", 3);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Ltg;")
    private static class184 field889 = class135.method812("Loading fonts )2 ", 3);

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Ltg;")
    public static class184 field887 = field886;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field895 = 10;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Ltg;")
    public static class184 field894 = class135.method812(" )2> <col=ffff00>", 3);

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Z")
    public static boolean field884 = false;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ltg;")
    public static class184 field888 = field889;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Ltg;")
    public static class184 field896 = class135.method812("Spieler kann nicht gefunden werden: ", 3);

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lka;")
    public static class97 field885;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method268(byte arg0) {
        field887 = null;
        field889 = null;
        field886 = null;
        field896 = null;
        if (arg0 != 115) {
            method269(null, true);
        }
        field888 = null;
        field885 = null;
        field894 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljc;Z)V")
    public static final void method269(class90 arg0, boolean arg1) {
        class204.field3935.method402(16777215, arg0);
        while (true) {
            class90 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class90[][] var7;
            class90 var65;
            do {
                class90 var64;
                do {
                    class90 var63;
                    do {
                        class90 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class90) class204.field3935.method411((byte) -48);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1688);
                                            var3 = var2.field1683;
                                            var4 = var2.field1674;
                                            var5 = var2.field1672;
                                            var6 = var2.field1685;
                                            var7 = class190.field3704[var5];
                                            if (!var2.field1671) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class90 var8 = class190.field3704[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1688) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class21.field405 && var3 > class156.field2790) {
                                                    class90 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1688 && (var9.field1671 || (var2.field1682 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class21.field405 && var3 < class14.field278 - 1) {
                                                    class90 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1688 && (var10.field1671 || (var2.field1682 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class208.field3999 && var4 > class179.field3416) {
                                                    class90 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1688 && (var11.field1671 || (var2.field1682 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class208.field3999 && var4 < class167.field3002 - 1) {
                                                    class90 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1688 && (var12.field1671 || (var2.field1682 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1671 = false;
                                            if (var2.field1675 != null) {
                                                class90 var13 = var2.field1675;
                                                if (var13.field1679 == null) {
                                                    if (var13.field1691 != null && !class127.method777(0, var3, var4)) {
                                                        class179.method1096(var13.field1691, class134.field2445, class135.field2448, class62.field1178, class36.field682, var3, var4);
                                                    }
                                                } else if (!class127.method777(0, var3, var4)) {
                                                    class179.method1094(var13.field1679, 0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var3, var4);
                                                }
                                                class50 var14 = var13.field1693;
                                                if (var14 != null) {
                                                    var14.field918.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var14.field926 - class138.field2506, var14.field914 - class101.field1864, var14.field921 - class209.field4011, var14.field923);
                                                }
                                                for (int var15 = 0; var15 < var13.field1680; var15++) {
                                                    class164 var16 = var13.field1686[var15];
                                                    if (var16 != null) {
                                                        var16.field2951.method289(var16.field2959, class134.field2445, class135.field2448, class62.field1178, class36.field682, var16.field2935 - class138.field2506, var16.field2942 - class101.field1864, var16.field2946 - class209.field4011, var16.field2934);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1679 == null) {
                                                if (var2.field1691 != null && !class127.method777(var6, var3, var4)) {
                                                    var17 = true;
                                                    class179.method1096(var2.field1691, class134.field2445, class135.field2448, class62.field1178, class36.field682, var3, var4);
                                                }
                                            } else if (!class127.method777(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field1679.field2034 != 12345678 || class169.field3193 && var5 <= class154.field2774) {
                                                    class179.method1094(var2.field1679, var6, class134.field2445, class135.field2448, class62.field1178, class36.field682, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class50 var20 = var2.field1693;
                                            class134 var21 = var2.field1684;
                                            if (var20 != null || var21 != null) {
                                                if (class21.field405 == var3) {
                                                    var18++;
                                                } else if (class21.field405 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class208.field3999 == var4) {
                                                    var18 += 3;
                                                } else if (class208.field3999 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class82.field1462[var18];
                                                var2.field1673 = class20.field381[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field915 & class116.field2105[var18]) == 0) {
                                                    var2.field1678 = 0;
                                                } else if (var20.field915 == 16) {
                                                    var2.field1678 = 3;
                                                    var2.field1689 = class68.field1306[var18];
                                                    var2.field1687 = 3 - var2.field1689;
                                                } else if (var20.field915 == 32) {
                                                    var2.field1678 = 6;
                                                    var2.field1689 = class2.field40[var18];
                                                    var2.field1687 = 6 - var2.field1689;
                                                } else if (var20.field915 == 64) {
                                                    var2.field1678 = 12;
                                                    var2.field1689 = class157.field2819[var18];
                                                    var2.field1687 = 12 - var2.field1689;
                                                } else {
                                                    var2.field1678 = 9;
                                                    var2.field1689 = class185.field3571[var18];
                                                    var2.field1687 = 9 - var2.field1689;
                                                }
                                                if ((var20.field915 & var19) != 0 && !class119.method721(var6, var3, var4, var20.field915)) {
                                                    var20.field918.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var20.field926 - class138.field2506, var20.field914 - class101.field1864, var20.field921 - class209.field4011, var20.field923);
                                                }
                                                if ((var20.field933 & var19) != 0 && !class119.method721(var6, var3, var4, var20.field933)) {
                                                    var20.field930.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var20.field926 - class138.field2506, var20.field914 - class101.field1864, var20.field921 - class209.field4011, var20.field923);
                                                }
                                            }
                                            if (var21 != null && !class18.method119(var6, var3, var4, var21.field2426.field949)) {
                                                if ((var21.field2442 & var19) != 0) {
                                                    var21.field2426.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var21.field2441 + var21.field2444 - class138.field2506, var21.field2430 - class101.field1864, var21.field2432 + var21.field2443 - class209.field4011, var21.field2435);
                                                } else if (var21.field2442 == 256) {
                                                    int var22 = var21.field2441 - class138.field2506;
                                                    int var23 = var21.field2430 - class101.field1864;
                                                    int var24 = var21.field2432 - class209.field4011;
                                                    int var25 = var21.field2434;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2426.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var21.field2444 + var22, var23, var21.field2443 + var24, var21.field2435);
                                                    } else if (var21.field2438 != null) {
                                                        var21.field2438.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var22, var23, var24, var21.field2435);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class88 var28 = var2.field1690;
                                                if (var28 != null) {
                                                    var28.field1658.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var28.field1657 - class138.field2506, var28.field1660 - class101.field1864, var28.field1651 - class209.field4011, var28.field1652);
                                                }
                                                class191 var29 = var2.field1681;
                                                if (var29 != null && var29.field3726 == 0) {
                                                    if (var29.field3716 != null) {
                                                        var29.field3716.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var29.field3711 - class138.field2506, var29.field3732 - class101.field1864, var29.field3731 - class209.field4011, var29.field3721);
                                                    }
                                                    if (var29.field3722 != null) {
                                                        var29.field3722.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var29.field3711 - class138.field2506, var29.field3732 - class101.field1864, var29.field3731 - class209.field4011, var29.field3721);
                                                    }
                                                    if (var29.field3728 != null) {
                                                        var29.field3728.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var29.field3711 - class138.field2506, var29.field3732 - class101.field1864, var29.field3731 - class209.field4011, var29.field3721);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field1682;
                                            if (var30 != 0) {
                                                if (var3 < class21.field405 && (var30 & 0x4) != 0) {
                                                    class90 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field1688) {
                                                        class204.field3935.method402(16777215, var31);
                                                    }
                                                }
                                                if (var4 < class208.field3999 && (var30 & 0x2) != 0) {
                                                    class90 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field1688) {
                                                        class204.field3935.method402(16777215, var32);
                                                    }
                                                }
                                                if (var3 > class21.field405 && (var30 & 0x1) != 0) {
                                                    class90 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field1688) {
                                                        class204.field3935.method402(16777215, var33);
                                                    }
                                                }
                                                if (var4 > class208.field3999 && (var30 & 0x8) != 0) {
                                                    class90 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field1688) {
                                                        class204.field3935.method402(16777215, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1678 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field1680; var36++) {
                                                if (class103.field1884 != var2.field1686[var36].field2943 && (var2.field1692[var36] & var2.field1678) == var2.field1689) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class50 var37 = var2.field1693;
                                                if (!class119.method721(var6, var3, var4, var37.field915)) {
                                                    var37.field918.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var37.field926 - class138.field2506, var37.field914 - class101.field1864, var37.field921 - class209.field4011, var37.field923);
                                                }
                                                var2.field1678 = 0;
                                            }
                                        }
                                        if (!var2.field1677) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field1680;
                                            var2.field1677 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class164 var41 = var2.field1686[var40];
                                                if (class103.field1884 != var41.field2943) {
                                                    for (int var42 = var41.field2954; var42 <= var41.field2949; var42++) {
                                                        for (int var43 = var41.field2945; var43 <= var41.field2957; var43++) {
                                                            class90 var44 = var7[var42][var43];
                                                            if (var44.field1671) {
                                                                var2.field1677 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field1678 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field2954) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field2949) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field2945) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field2957) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field1678) == var2.field1687) {
                                                                    var2.field1677 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class65.field1248[var39++] = var41;
                                                    int var46 = class21.field405 - var41.field2954;
                                                    int var47 = var41.field2949 - class21.field405;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class208.field3999 - var41.field2945;
                                                    int var49 = var41.field2957 - class208.field3999;
                                                    if (var49 > var48) {
                                                        var41.field2948 = var46 + var49;
                                                    } else {
                                                        var41.field2948 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class164 var53 = class65.field1248[var52];
                                                    if (class103.field1884 != var53.field2943) {
                                                        if (var53.field2948 > var50) {
                                                            var50 = var53.field2948;
                                                            var51 = var52;
                                                        } else if (var53.field2948 == var50) {
                                                            int var54 = var53.field2935 - class138.field2506;
                                                            int var55 = var53.field2946 - class209.field4011;
                                                            int var56 = class65.field1248[var51].field2935 - class138.field2506;
                                                            int var57 = class65.field1248[var51].field2946 - class209.field4011;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class164 var58 = class65.field1248[var51];
                                                var58.field2943 = class103.field1884;
                                                if (!class141.method872(var6, var58.field2954, var58.field2949, var58.field2945, var58.field2957, var58.field2951.field949)) {
                                                    var58.field2951.method289(var58.field2959, class134.field2445, class135.field2448, class62.field1178, class36.field682, var58.field2935 - class138.field2506, var58.field2942 - class101.field1864, var58.field2946 - class209.field4011, var58.field2934);
                                                }
                                                for (int var59 = var58.field2954; var59 <= var58.field2949; var59++) {
                                                    for (int var60 = var58.field2945; var60 <= var58.field2957; var60++) {
                                                        class90 var61 = var7[var59][var60];
                                                        if (var61.field1678 != 0) {
                                                            class204.field3935.method402(16777215, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field1688) {
                                                            class204.field3935.method402(16777215, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1677) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field1677 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1688);
                            } while (var2.field1678 != 0);
                            if (var3 > class21.field405 || var3 <= class156.field2790) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field1688);
                        if (var3 < class21.field405 || var3 >= class14.field278 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field1688);
                    if (var4 > class208.field3999 || var4 <= class179.field3416) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field1688);
                if (var4 < class208.field3999 || var4 >= class167.field3002 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field1688);
            var2.field1688 = false;
            class175.field3316--;
            class191 var66 = var2.field1681;
            if (var66 != null && var66.field3726 != 0) {
                if (var66.field3716 != null) {
                    var66.field3716.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var66.field3711 - class138.field2506, var66.field3732 - class101.field1864 - var66.field3726, var66.field3731 - class209.field4011, var66.field3721);
                }
                if (var66.field3722 != null) {
                    var66.field3722.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var66.field3711 - class138.field2506, var66.field3732 - class101.field1864 - var66.field3726, var66.field3731 - class209.field4011, var66.field3721);
                }
                if (var66.field3728 != null) {
                    var66.field3728.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var66.field3711 - class138.field2506, var66.field3732 - class101.field1864 - var66.field3726, var66.field3731 - class209.field4011, var66.field3721);
                }
            }
            if (var2.field1673 != 0) {
                class134 var67 = var2.field1684;
                if (var67 != null && !class18.method119(var6, var3, var4, var67.field2426.field949)) {
                    if ((var67.field2442 & var2.field1673) != 0) {
                        var67.field2426.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var67.field2441 + var67.field2444 - class138.field2506, var67.field2430 - class101.field1864, var67.field2432 + var67.field2443 - class209.field4011, var67.field2435);
                    } else if (var67.field2442 == 256) {
                        int var68 = var67.field2441 - class138.field2506;
                        int var69 = var67.field2430 - class101.field1864;
                        int var70 = var67.field2432 - class209.field4011;
                        int var71 = var67.field2434;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field2426.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var67.field2444 + var68, var69, var67.field2443 + var70, var67.field2435);
                        } else if (var67.field2438 != null) {
                            var67.field2438.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var68, var69, var70, var67.field2435);
                        }
                    }
                }
                class50 var74 = var2.field1693;
                if (var74 != null) {
                    if ((var74.field933 & var2.field1673) != 0 && !class119.method721(var6, var3, var4, var74.field933)) {
                        var74.field930.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var74.field926 - class138.field2506, var74.field914 - class101.field1864, var74.field921 - class209.field4011, var74.field923);
                    }
                    if ((var74.field915 & var2.field1673) != 0 && !class119.method721(var6, var3, var4, var74.field915)) {
                        var74.field918.method289(0, class134.field2445, class135.field2448, class62.field1178, class36.field682, var74.field926 - class138.field2506, var74.field914 - class101.field1864, var74.field921 - class209.field4011, var74.field923);
                    }
                }
            }
            if (var5 < class87.field1608 - 1) {
                class90 var75 = class190.field3704[var5 + 1][var3][var4];
                if (var75 != null && var75.field1688) {
                    class204.field3935.method402(16777215, var75);
                }
            }
            if (var3 < class21.field405) {
                class90 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field1688) {
                    class204.field3935.method402(16777215, var76);
                }
            }
            if (var4 < class208.field3999) {
                class90 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field1688) {
                    class204.field3935.method402(16777215, var77);
                }
            }
            if (var3 > class21.field405) {
                class90 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field1688) {
                    class204.field3935.method402(16777215, var78);
                }
            }
            if (var4 > class208.field3999) {
                class90 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field1688) {
                    class204.field3935.method402(16777215, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lta;")
    public static final class178 method270(int arg0, int arg1) {
        int var2 = 46 / ((-arg0 - 86) / 34);
        class178 var3 = (class178) class123.field2240.method773((long) arg1, 1);
        field897++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class206.field3959.method1249((byte) 85, arg1, 4);
        class178 var5 = new class178();
        if (var4 != null) {
            var5.method1090(-1, new class97(var4), arg1);
        }
        class123.field2240.method776(var5, (long) arg1, (byte) -27);
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Lvg;")
    public static final class202 method271(int arg0, byte arg1) {
        field898++;
        class202 var2 = (class202) class43.field818.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field173.method1249((byte) 105, arg0, 8);
        class202 var4 = new class202();
        if (var3 != null) {
            var4.method1293(new class97(var3), (byte) 111);
        }
        class43.field818.method776(var4, (long) arg0, (byte) 87);
        if (arg1 >= -47) {
            method269(null, false);
        }
        return var4;
    }
}
