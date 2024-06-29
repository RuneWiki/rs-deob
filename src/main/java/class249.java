import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class249 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Llb;")
    public static class127 field4351 = new class127(64);

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[S")
    public static short[] field4352 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field4354 = new int[2048];

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Loh;")
    public static class263 field4353 = class253.method1681(-119, "Fallen lassen");

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lue;")
    public static class86 field4356;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1668(int arg0) {
        field4353 = null;
        field4354 = null;
        field4351 = null;
        field4356 = null;
        field4352 = null;
        if (arg0 != -18681) {
            field4354 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lud;Z)V")
    public static final void method1669(class2 arg0, boolean arg1) {
        class107.field2023.method1883(arg0, (byte) -3);
        while (true) {
            class2 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class2[][] var7;
            class2 var66;
            do {
                class2 var65;
                do {
                    class2 var64;
                    do {
                        class2 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class2) class107.field2023.method1879(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field34);
                                            var3 = var2.field28;
                                            var4 = var2.field29;
                                            var5 = var2.field33;
                                            var6 = var2.field47;
                                            var7 = class18.field417[var5];
                                            if (!var2.field39) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class2 var8 = class18.field417[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field34) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class121.field2239 && var3 > class87.field1754) {
                                                    class2 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field34 && (var9.field39 || (var2.field41 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class121.field2239 && var3 < class30.field753 - 1) {
                                                    class2 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field34 && (var10.field39 || (var2.field41 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class186.field3359 && var4 > class83.field1649) {
                                                    class2 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field34 && (var11.field39 || (var2.field41 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class186.field3359 && var4 < class121.field2244 - 1) {
                                                    class2 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field34 && (var12.field39 || (var2.field41 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field39 = false;
                                            if (var2.field48 != null) {
                                                class2 var13 = var2.field48;
                                                if (var13.field32 == null) {
                                                    if (var13.field40 != null) {
                                                        if (class162.method1065(0, var3, var4)) {
                                                            class205.method1419(var13.field40, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, true);
                                                        } else {
                                                            class205.method1419(var13.field40, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class162.method1065(0, var3, var4)) {
                                                    class30.method193(var13.field32, 0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, true);
                                                } else {
                                                    class30.method193(var13.field32, 0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, false);
                                                }
                                                class22 var14 = var13.field43;
                                                if (var14 != null) {
                                                    var14.field633.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var14.field632 - class43.field940, var14.field634 - class220.field3907, var14.field648 - class1.field5, var14.field646);
                                                }
                                                for (int var15 = 0; var15 < var13.field27; var15++) {
                                                    class70 var16 = var13.field37[var15];
                                                    if (var16 != null) {
                                                        var16.field1398.method105(var16.field1407, class36.field850, class259.field4494, class275.field4820, class91.field1810, var16.field1402 - class43.field940, var16.field1416 - class220.field3907, var16.field1400 - class1.field5, var16.field1408);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field32 == null) {
                                                if (var2.field40 != null) {
                                                    if (class162.method1065(var6, var3, var4)) {
                                                        class205.method1419(var2.field40, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class205.method1419(var2.field40, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, false);
                                                    }
                                                }
                                            } else if (class162.method1065(var6, var3, var4)) {
                                                class30.method193(var2.field32, var6, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field32.field3609 != 12345678 || class207.field3745 && var5 <= class115.field2160) {
                                                    class30.method193(var2.field32, var6, class36.field850, class259.field4494, class275.field4820, class91.field1810, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class165 var18 = var2.field52;
                                                if (var18 != null && (var18.field3013 & 0x80000000L) != 0L) {
                                                    var18.field3002.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var18.field3014 - class43.field940, var18.field3000 - class220.field3907, var18.field3008 - class1.field5, var18.field3013);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class22 var21 = var2.field43;
                                            class138 var22 = var2.field45;
                                            if (var21 != null || var22 != null) {
                                                if (class121.field2239 == var3) {
                                                    var19++;
                                                } else if (class121.field2239 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class186.field3359 == var4) {
                                                    var19 += 3;
                                                } else if (class186.field3359 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class271.field4775[var19];
                                                var2.field31 = class82.field1630[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field645 & class245.field4316[var19]) == 0) {
                                                    var2.field35 = 0;
                                                } else if (var21.field645 == 16) {
                                                    var2.field35 = 3;
                                                    var2.field38 = class87.field1755[var19];
                                                    var2.field42 = 3 - var2.field38;
                                                } else if (var21.field645 == 32) {
                                                    var2.field35 = 6;
                                                    var2.field38 = class106.field2014[var19];
                                                    var2.field42 = 6 - var2.field38;
                                                } else if (var21.field645 == 64) {
                                                    var2.field35 = 12;
                                                    var2.field38 = class37.field851[var19];
                                                    var2.field42 = 12 - var2.field38;
                                                } else {
                                                    var2.field35 = 9;
                                                    var2.field38 = class255.field4438[var19];
                                                    var2.field42 = 9 - var2.field38;
                                                }
                                                if ((var21.field645 & var20) != 0 && !class11.method85(var6, var3, var4, var21.field645)) {
                                                    var21.field633.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var21.field632 - class43.field940, var21.field634 - class220.field3907, var21.field648 - class1.field5, var21.field646);
                                                }
                                                if ((var21.field636 & var20) != 0 && !class11.method85(var6, var3, var4, var21.field636)) {
                                                    var21.field641.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var21.field632 - class43.field940, var21.field634 - class220.field3907, var21.field648 - class1.field5, var21.field646);
                                                }
                                            }
                                            if (var22 != null && !class48.method314(var6, var3, var4, var22.field2546.method106())) {
                                                if ((var22.field2553 & var20) != 0) {
                                                    var22.field2546.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var22.field2555 + var22.field2545 - class43.field940, var22.field2547 - class220.field3907, var22.field2543 + var22.field2552 - class1.field5, var22.field2550);
                                                } else if (var22.field2553 == 256) {
                                                    int var23 = var22.field2555 - class43.field940;
                                                    int var24 = var22.field2547 - class220.field3907;
                                                    int var25 = var22.field2543 - class1.field5;
                                                    int var26 = var22.field2549;
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
                                                        var22.field2546.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var22.field2545 + var23, var24, var22.field2552 + var25, var22.field2550);
                                                    } else if (var22.field2559 != null) {
                                                        var22.field2559.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var23, var24, var25, var22.field2550);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class165 var29 = var2.field52;
                                                if (var29 != null && (var29.field3013 & 0x80000000L) == 0L) {
                                                    var29.field3002.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var29.field3014 - class43.field940, var29.field3000 - class220.field3907, var29.field3008 - class1.field5, var29.field3013);
                                                }
                                                class164 var30 = var2.field50;
                                                if (var30 != null && var30.field2995 == 0) {
                                                    if (var30.field2991 != null) {
                                                        var30.field2991.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var30.field2987 - class43.field940, var30.field2985 - class220.field3907, var30.field2988 - class1.field5, var30.field2971);
                                                    }
                                                    if (var30.field2984 != null) {
                                                        var30.field2984.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var30.field2987 - class43.field940, var30.field2985 - class220.field3907, var30.field2988 - class1.field5, var30.field2971);
                                                    }
                                                    if (var30.field2996 != null) {
                                                        var30.field2996.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var30.field2987 - class43.field940, var30.field2985 - class220.field3907, var30.field2988 - class1.field5, var30.field2971);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field41;
                                            if (var31 != 0) {
                                                if (var3 < class121.field2239 && (var31 & 0x4) != 0) {
                                                    class2 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field34) {
                                                        class107.field2023.method1883(var32, (byte) -3);
                                                    }
                                                }
                                                if (var4 < class186.field3359 && (var31 & 0x2) != 0) {
                                                    class2 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field34) {
                                                        class107.field2023.method1883(var33, (byte) -3);
                                                    }
                                                }
                                                if (var3 > class121.field2239 && (var31 & 0x1) != 0) {
                                                    class2 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field34) {
                                                        class107.field2023.method1883(var34, (byte) -3);
                                                    }
                                                }
                                                if (var4 > class186.field3359 && (var31 & 0x8) != 0) {
                                                    class2 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field34) {
                                                        class107.field2023.method1883(var35, (byte) -3);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field35 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field27; var37++) {
                                                if (class71.field1434 != var2.field37[var37].field1412 && (var2.field36[var37] & var2.field35) == var2.field38) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class22 var38 = var2.field43;
                                                if (!class11.method85(var6, var3, var4, var38.field645)) {
                                                    var38.field633.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var38.field632 - class43.field940, var38.field634 - class220.field3907, var38.field648 - class1.field5, var38.field646);
                                                }
                                                var2.field35 = 0;
                                            }
                                        }
                                        if (!var2.field44) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field27;
                                            var2.field44 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class70 var42 = var2.field37[var41];
                                                if (class71.field1434 != var42.field1412) {
                                                    for (int var43 = var42.field1405; var43 <= var42.field1418; var43++) {
                                                        for (int var44 = var42.field1403; var44 <= var42.field1413; var44++) {
                                                            class2 var45 = var7[var43][var44];
                                                            if (var45.field39) {
                                                                var2.field44 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field35 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1405) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1418) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1403) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1413) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field35) == var2.field42) {
                                                                    var2.field44 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class165.field3001[var40++] = var42;
                                                    int var47 = class121.field2239 - var42.field1405;
                                                    int var48 = var42.field1418 - class121.field2239;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class186.field3359 - var42.field1403;
                                                    int var50 = var42.field1413 - class186.field3359;
                                                    if (var50 > var49) {
                                                        var42.field1414 = var47 + var50;
                                                    } else {
                                                        var42.field1414 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class70 var54 = class165.field3001[var53];
                                                    if (class71.field1434 != var54.field1412) {
                                                        if (var54.field1414 > var51) {
                                                            var51 = var54.field1414;
                                                            var52 = var53;
                                                        } else if (var54.field1414 == var51) {
                                                            int var55 = var54.field1402 - class43.field940;
                                                            int var56 = var54.field1400 - class1.field5;
                                                            int var57 = class165.field3001[var52].field1402 - class43.field940;
                                                            int var58 = class165.field3001[var52].field1400 - class1.field5;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class70 var59 = class165.field3001[var52];
                                                var59.field1412 = class71.field1434;
                                                if (!class126.method820(var6, var59.field1405, var59.field1418, var59.field1403, var59.field1413, var59.field1398.method106())) {
                                                    var59.field1398.method105(var59.field1407, class36.field850, class259.field4494, class275.field4820, class91.field1810, var59.field1402 - class43.field940, var59.field1416 - class220.field3907, var59.field1400 - class1.field5, var59.field1408);
                                                }
                                                for (int var60 = var59.field1405; var60 <= var59.field1418; var60++) {
                                                    for (int var61 = var59.field1403; var61 <= var59.field1413; var61++) {
                                                        class2 var62 = var7[var60][var61];
                                                        if (var62.field35 != 0) {
                                                            class107.field2023.method1883(var62, (byte) -3);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field34) {
                                                            class107.field2023.method1883(var62, (byte) -3);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field44) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field44 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field34);
                            } while (var2.field35 != 0);
                            if (var3 > class121.field2239 || var3 <= class87.field1754) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field34);
                        if (var3 < class121.field2239 || var3 >= class30.field753 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field34);
                    if (var4 > class186.field3359 || var4 <= class83.field1649) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field34);
                if (var4 < class186.field3359 || var4 >= class121.field2244 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field34);
            var2.field34 = false;
            class9.field192--;
            class164 var67 = var2.field50;
            if (var67 != null && var67.field2995 != 0) {
                if (var67.field2991 != null) {
                    var67.field2991.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var67.field2987 - class43.field940, var67.field2985 - class220.field3907 - var67.field2995, var67.field2988 - class1.field5, var67.field2971);
                }
                if (var67.field2984 != null) {
                    var67.field2984.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var67.field2987 - class43.field940, var67.field2985 - class220.field3907 - var67.field2995, var67.field2988 - class1.field5, var67.field2971);
                }
                if (var67.field2996 != null) {
                    var67.field2996.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var67.field2987 - class43.field940, var67.field2985 - class220.field3907 - var67.field2995, var67.field2988 - class1.field5, var67.field2971);
                }
            }
            if (var2.field31 != 0) {
                class138 var68 = var2.field45;
                if (var68 != null && !class48.method314(var6, var3, var4, var68.field2546.method106())) {
                    if ((var68.field2553 & var2.field31) != 0) {
                        var68.field2546.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var68.field2555 + var68.field2545 - class43.field940, var68.field2547 - class220.field3907, var68.field2543 + var68.field2552 - class1.field5, var68.field2550);
                    } else if (var68.field2553 == 256) {
                        int var69 = var68.field2555 - class43.field940;
                        int var70 = var68.field2547 - class220.field3907;
                        int var71 = var68.field2543 - class1.field5;
                        int var72 = var68.field2549;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2546.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var68.field2545 + var69, var70, var68.field2552 + var71, var68.field2550);
                        } else if (var68.field2559 != null) {
                            var68.field2559.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var69, var70, var71, var68.field2550);
                        }
                    }
                }
                class22 var75 = var2.field43;
                if (var75 != null) {
                    if ((var75.field636 & var2.field31) != 0 && !class11.method85(var6, var3, var4, var75.field636)) {
                        var75.field641.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var75.field632 - class43.field940, var75.field634 - class220.field3907, var75.field648 - class1.field5, var75.field646);
                    }
                    if ((var75.field645 & var2.field31) != 0 && !class11.method85(var6, var3, var4, var75.field645)) {
                        var75.field633.method105(0, class36.field850, class259.field4494, class275.field4820, class91.field1810, var75.field632 - class43.field940, var75.field634 - class220.field3907, var75.field648 - class1.field5, var75.field646);
                    }
                }
            }
            if (var5 < class7.field120 - 1) {
                class2 var76 = class18.field417[var5 + 1][var3][var4];
                if (var76 != null && var76.field34) {
                    class107.field2023.method1883(var76, (byte) -3);
                }
            }
            if (var3 < class121.field2239) {
                class2 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field34) {
                    class107.field2023.method1883(var77, (byte) -3);
                }
            }
            if (var4 < class186.field3359) {
                class2 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field34) {
                    class107.field2023.method1883(var78, (byte) -3);
                }
            }
            if (var3 > class121.field2239) {
                class2 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field34) {
                    class107.field2023.method1883(var79, (byte) -3);
                }
            }
            if (var4 > class186.field3359) {
                class2 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field34) {
                    class107.field2023.method1883(var80, (byte) -3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lah;I)V")
    public static final void method1670(class267 arg0, int arg1) {
        field4350++;
        arg0.field4666 = false;
        if (arg0.field4652 != -1) {
            class240 var2 = class186.method1226(12828, arg0.field4652);
            if (var2 == null || var2.field4211 == null) {
                arg0.field4652 = -1;
            } else {
                arg0.field4654++;
                if (var2.field4211.length > arg0.field4686 && var2.field4219[arg0.field4686] < arg0.field4654) {
                    arg0.field4654 = 1;
                    arg0.field4686++;
                    class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4686, -64, var2, arg0.field4688);
                }
                if (arg0.field4686 >= var2.field4211.length) {
                    arg0.field4654 = 0;
                    arg0.field4686 = 0;
                    class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4686, -64, var2, arg0.field4688);
                }
            }
        }
        if (arg0.field4689 != -1 && class228.field4012 >= arg0.field4653) {
            int var3 = class46.method296(-70, arg0.field4689).field987;
            if (var3 == -1) {
                arg0.field4689 = -1;
            } else {
                class240 var4 = class186.method1226(12828, var3);
                if (var4 == null || var4.field4211 == null) {
                    arg0.field4689 = -1;
                } else {
                    if (arg0.field4685 < 0) {
                        arg0.field4685 = 0;
                        class219.method1490(class229.field4018 == arg0, arg0.field4705, 0, -64, var4, arg0.field4688);
                    }
                    arg0.field4709++;
                    if (var4.field4211.length > arg0.field4685 && var4.field4219[arg0.field4685] < arg0.field4709) {
                        arg0.field4685++;
                        arg0.field4709 = 1;
                        class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4685, -64, var4, arg0.field4688);
                    }
                    if (arg0.field4685 >= var4.field4211.length) {
                        arg0.field4689 = -1;
                    }
                }
            }
        }
        int var5 = 19 % ((-arg1 - 62) / 41);
        if (arg0.field4694 != -1 && arg0.field4662 <= 1) {
            class240 var6 = class186.method1226(12828, arg0.field4694);
            if (var6.field4210 == 1 && arg0.field4658 > 0 && class228.field4012 >= arg0.field4663 && class228.field4012 > arg0.field4659) {
                arg0.field4662 = 1;
                return;
            }
        }
        if (arg0.field4694 != -1 && arg0.field4662 == 0) {
            class240 var7 = class186.method1226(12828, arg0.field4694);
            if (var7 == null || var7.field4211 == null) {
                arg0.field4694 = -1;
            } else {
                arg0.field4717++;
                if (var7.field4211.length > arg0.field4718 && arg0.field4717 > var7.field4219[arg0.field4718]) {
                    arg0.field4717 = 1;
                    arg0.field4718++;
                    class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4718, -64, var7, arg0.field4688);
                }
                if (var7.field4211.length <= arg0.field4718) {
                    arg0.field4718 -= var7.field4223;
                    arg0.field4668++;
                    if (arg0.field4668 >= var7.field4224) {
                        arg0.field4694 = -1;
                    } else if (arg0.field4718 >= 0 && var7.field4211.length > arg0.field4718) {
                        class219.method1490(class229.field4018 == arg0, arg0.field4705, arg0.field4718, -64, var7, arg0.field4688);
                    } else {
                        arg0.field4694 = -1;
                    }
                }
                arg0.field4666 = var7.field4214;
            }
        }
        if (arg0.field4662 > 0) {
            arg0.field4662--;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Ldd;")
    public static final class130 method1671(int arg0, int arg1) {
        field4349++;
        if (arg0 == 1824) {
            return class260.field4498 && arg1 >= class208.field3772 && arg1 <= class3.field64 ? class126.field2336[arg1 - class208.field3772] : null;
        } else {
            return null;
        }
    }
}
