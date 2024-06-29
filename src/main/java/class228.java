import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class228 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lsj;")
    public static class48 field3626 = new class48();

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3627 = "red:";

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3632 = "Started 3d Library";

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Leb;")
    public static class103 field3634;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ljj;")
    public static class134 field3633;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static void method1513(boolean arg0) {
        field3626 = null;
        field3627 = null;
        field3632 = null;
        if (arg0) {
            field3628 = 118;
        }
        field3633 = null;
        field3634 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lpk;Z)V")
    public static final void method1514(class99 arg0, boolean arg1) {
        class173.field2784.method363(49, arg0);
        while (true) {
            class99 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class99[][] var7;
            class99 var66;
            do {
                class99 var65;
                do {
                    class99 var64;
                    do {
                        class99 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class99) class173.field2784.method367(5);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1490);
                                            var3 = var2.field1488;
                                            var4 = var2.field1495;
                                            var5 = var2.field1505;
                                            var6 = var2.field1487;
                                            var7 = class273.field4415[var5];
                                            if (!var2.field1509) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class99 var8 = class273.field4415[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1490) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class177.field2861 && var3 > class136.field2265) {
                                                    class99 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1490 && (var9.field1509 || (var2.field1492 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class177.field2861 && var3 < class100.field1523 - 1) {
                                                    class99 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1490 && (var10.field1509 || (var2.field1492 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class21.field265 && var4 > class222.field3532) {
                                                    class99 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1490 && (var11.field1509 || (var2.field1492 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class21.field265 && var4 < class258.field4119 - 1) {
                                                    class99 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1490 && (var12.field1509 || (var2.field1492 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1509 = false;
                                            if (var2.field1506 != null) {
                                                class99 var13 = var2.field1506;
                                                if (var13.field1510 == null) {
                                                    if (var13.field1498 != null) {
                                                        if (class54.method418(0, var3, var4)) {
                                                            class256.method1681(var13.field1498, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, true);
                                                        } else {
                                                            class256.method1681(var13.field1498, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class54.method418(0, var3, var4)) {
                                                    class274.method1848(var13.field1510, 0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, true);
                                                } else {
                                                    class274.method1848(var13.field1510, 0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, false);
                                                }
                                                class233 var14 = var13.field1502;
                                                if (var14 != null) {
                                                    var14.field3709.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var14.field3712 - class209.field3435, var14.field3698 - class243.field3896, var14.field3715 - class30.field365, var14.field3719, var5, (class4) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1503; var15++) {
                                                    class138 var16 = var13.field1496[var15];
                                                    if (var16 != null) {
                                                        var16.field2291.method85(var16.field2283, class296.field4680, class250.field4008, class236.field3777, class8.field117, var16.field2274 - class209.field3435, var16.field2288 - class243.field3896, var16.field2277 - class30.field365, var16.field2275, var5, (class4) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1510 == null) {
                                                if (var2.field1498 != null) {
                                                    if (class54.method418(var6, var3, var4)) {
                                                        class256.method1681(var2.field1498, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class256.method1681(var2.field1498, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, false);
                                                    }
                                                }
                                            } else if (class54.method418(var6, var3, var4)) {
                                                class274.method1848(var2.field1510, var6, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1510.field460 != 12345678 || class267.field4341 && var5 <= class285.field4547) {
                                                    class274.method1848(var2.field1510, var6, class296.field4680, class250.field4008, class236.field3777, class8.field117, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class16 var18 = var2.field1491;
                                                if (var18 != null && (var18.field187 & 0x80000000L) != 0L) {
                                                    var18.field185.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var18.field190 - class209.field3435, var18.field195 - class243.field3896, var18.field192 - class30.field365, var18.field187, var5, (class4) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class233 var21 = var2.field1502;
                                            class195 var22 = var2.field1494;
                                            if (var21 != null || var22 != null) {
                                                if (class177.field2861 == var3) {
                                                    var19++;
                                                } else if (class177.field2861 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class21.field265 == var4) {
                                                    var19 += 3;
                                                } else if (class21.field265 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class127.field2130[var19];
                                                var2.field1501 = class223.field3549[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3717 & class241.field3870[var19]) == 0) {
                                                    var2.field1508 = 0;
                                                } else if (var21.field3717 == 16) {
                                                    var2.field1508 = 3;
                                                    var2.field1489 = class92.field1315[var19];
                                                    var2.field1493 = 3 - var2.field1489;
                                                } else if (var21.field3717 == 32) {
                                                    var2.field1508 = 6;
                                                    var2.field1489 = class198.field3195[var19];
                                                    var2.field1493 = 6 - var2.field1489;
                                                } else if (var21.field3717 == 64) {
                                                    var2.field1508 = 12;
                                                    var2.field1489 = class41.field481[var19];
                                                    var2.field1493 = 12 - var2.field1489;
                                                } else {
                                                    var2.field1508 = 9;
                                                    var2.field1489 = class119.field2012[var19];
                                                    var2.field1493 = 9 - var2.field1489;
                                                }
                                                if ((var21.field3717 & var20) != 0 && !class168.method1183(var6, var3, var4, var21.field3717)) {
                                                    var21.field3709.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var21.field3712 - class209.field3435, var21.field3698 - class243.field3896, var21.field3715 - class30.field365, var21.field3719, var5, (class4) null);
                                                }
                                                if ((var21.field3703 & var20) != 0 && !class168.method1183(var6, var3, var4, var21.field3703)) {
                                                    var21.field3716.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var21.field3712 - class209.field3435, var21.field3698 - class243.field3896, var21.field3715 - class30.field365, var21.field3719, var5, (class4) null);
                                                }
                                            }
                                            if (var22 != null && !class1.method6(var6, var3, var4, var22.field3149.method88())) {
                                                if ((var22.field3153 & var20) != 0) {
                                                    var22.field3149.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var22.field3152 + var22.field3147 - class209.field3435, var22.field3154 - class243.field3896, var22.field3148 + var22.field3151 - class30.field365, var22.field3157, var5, (class4) null);
                                                } else if (var22.field3153 == 256) {
                                                    int var23 = var22.field3152 - class209.field3435;
                                                    int var24 = var22.field3154 - class243.field3896;
                                                    int var25 = var22.field3148 - class30.field365;
                                                    int var26 = var22.field3156;
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
                                                        var22.field3149.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var22.field3147 + var23, var24, var22.field3151 + var25, var22.field3157, var5, (class4) null);
                                                    } else if (var22.field3159 != null) {
                                                        var22.field3159.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var23, var24, var25, var22.field3157, var5, (class4) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class16 var29 = var2.field1491;
                                                if (var29 != null && (var29.field187 & 0x80000000L) == 0L) {
                                                    var29.field185.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var29.field190 - class209.field3435, var29.field195 - class243.field3896, var29.field192 - class30.field365, var29.field187, var5, (class4) null);
                                                }
                                                class82 var30 = var2.field1500;
                                                if (var30 != null && var30.field1133 == 0) {
                                                    if (var30.field1145 != null) {
                                                        var30.field1145.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var30.field1138 - class209.field3435, var30.field1132 - class243.field3896, var30.field1131 - class30.field365, var30.field1142, var5, (class4) null);
                                                    }
                                                    if (var30.field1136 != null) {
                                                        var30.field1136.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var30.field1138 - class209.field3435, var30.field1132 - class243.field3896, var30.field1131 - class30.field365, var30.field1142, var5, (class4) null);
                                                    }
                                                    if (var30.field1135 != null) {
                                                        var30.field1135.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var30.field1138 - class209.field3435, var30.field1132 - class243.field3896, var30.field1131 - class30.field365, var30.field1142, var5, (class4) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1492;
                                            if (var31 != 0) {
                                                if (var3 < class177.field2861 && (var31 & 0x4) != 0) {
                                                    class99 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1490) {
                                                        class173.field2784.method363(-109, var32);
                                                    }
                                                }
                                                if (var4 < class21.field265 && (var31 & 0x2) != 0) {
                                                    class99 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1490) {
                                                        class173.field2784.method363(-118, var33);
                                                    }
                                                }
                                                if (var3 > class177.field2861 && (var31 & 0x1) != 0) {
                                                    class99 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1490) {
                                                        class173.field2784.method363(80, var34);
                                                    }
                                                }
                                                if (var4 > class21.field265 && (var31 & 0x8) != 0) {
                                                    class99 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1490) {
                                                        class173.field2784.method363(45, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1508 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1503; var37++) {
                                                if (class136.field2263 != var2.field1496[var37].field2292 && (var2.field1507[var37] & var2.field1508) == var2.field1489) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class233 var38 = var2.field1502;
                                                if (!class168.method1183(var6, var3, var4, var38.field3717)) {
                                                    var38.field3709.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var38.field3712 - class209.field3435, var38.field3698 - class243.field3896, var38.field3715 - class30.field365, var38.field3719, var5, (class4) null);
                                                }
                                                var2.field1508 = 0;
                                            }
                                        }
                                        if (!var2.field1504) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1503;
                                            var2.field1504 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class138 var42 = var2.field1496[var41];
                                                if (class136.field2263 != var42.field2292) {
                                                    for (int var43 = var42.field2272; var43 <= var42.field2289; var43++) {
                                                        for (int var44 = var42.field2284; var44 <= var42.field2285; var44++) {
                                                            class99 var45 = var7[var43][var44];
                                                            if (var45.field1509) {
                                                                var2.field1504 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1508 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2272) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2289) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2284) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2285) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1508) == var2.field1493) {
                                                                    var2.field1504 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class100.field1520[var40++] = var42;
                                                    int var47 = class177.field2861 - var42.field2272;
                                                    int var48 = var42.field2289 - class177.field2861;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class21.field265 - var42.field2284;
                                                    int var50 = var42.field2285 - class21.field265;
                                                    if (var50 > var49) {
                                                        var42.field2294 = var47 + var50;
                                                    } else {
                                                        var42.field2294 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class138 var54 = class100.field1520[var53];
                                                    if (class136.field2263 != var54.field2292) {
                                                        if (var54.field2294 > var51) {
                                                            var51 = var54.field2294;
                                                            var52 = var53;
                                                        } else if (var54.field2294 == var51) {
                                                            int var55 = var54.field2274 - class209.field3435;
                                                            int var56 = var54.field2277 - class30.field365;
                                                            int var57 = class100.field1520[var52].field2274 - class209.field3435;
                                                            int var58 = class100.field1520[var52].field2277 - class30.field365;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class138 var59 = class100.field1520[var52];
                                                var59.field2292 = class136.field2263;
                                                if (!class222.method1472(var6, var59.field2272, var59.field2289, var59.field2284, var59.field2285, var59.field2291.method88())) {
                                                    var59.field2291.method85(var59.field2283, class296.field4680, class250.field4008, class236.field3777, class8.field117, var59.field2274 - class209.field3435, var59.field2288 - class243.field3896, var59.field2277 - class30.field365, var59.field2275, var5, (class4) null);
                                                }
                                                for (int var60 = var59.field2272; var60 <= var59.field2289; var60++) {
                                                    for (int var61 = var59.field2284; var61 <= var59.field2285; var61++) {
                                                        class99 var62 = var7[var60][var61];
                                                        if (var62.field1508 != 0) {
                                                            class173.field2784.method363(-127, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1490) {
                                                            class173.field2784.method363(17, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1504) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1504 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1490);
                            } while (var2.field1508 != 0);
                            if (var3 > class177.field2861 || var3 <= class136.field2265) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1490);
                        if (var3 < class177.field2861 || var3 >= class100.field1523 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1490);
                    if (var4 > class21.field265 || var4 <= class222.field3532) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1490);
                if (var4 < class21.field265 || var4 >= class258.field4119 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1490);
            var2.field1490 = false;
            class200.field3225--;
            class82 var67 = var2.field1500;
            if (var67 != null && var67.field1133 != 0) {
                if (var67.field1145 != null) {
                    var67.field1145.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var67.field1138 - class209.field3435, var67.field1132 - class243.field3896 - var67.field1133, var67.field1131 - class30.field365, var67.field1142, var5, (class4) null);
                }
                if (var67.field1136 != null) {
                    var67.field1136.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var67.field1138 - class209.field3435, var67.field1132 - class243.field3896 - var67.field1133, var67.field1131 - class30.field365, var67.field1142, var5, (class4) null);
                }
                if (var67.field1135 != null) {
                    var67.field1135.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var67.field1138 - class209.field3435, var67.field1132 - class243.field3896 - var67.field1133, var67.field1131 - class30.field365, var67.field1142, var5, (class4) null);
                }
            }
            if (var2.field1501 != 0) {
                class195 var68 = var2.field1494;
                if (var68 != null && !class1.method6(var6, var3, var4, var68.field3149.method88())) {
                    if ((var68.field3153 & var2.field1501) != 0) {
                        var68.field3149.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var68.field3152 + var68.field3147 - class209.field3435, var68.field3154 - class243.field3896, var68.field3148 + var68.field3151 - class30.field365, var68.field3157, var5, (class4) null);
                    } else if (var68.field3153 == 256) {
                        int var69 = var68.field3152 - class209.field3435;
                        int var70 = var68.field3154 - class243.field3896;
                        int var71 = var68.field3148 - class30.field365;
                        int var72 = var68.field3156;
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
                            var68.field3149.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var68.field3147 + var69, var70, var68.field3151 + var71, var68.field3157, var5, (class4) null);
                        } else if (var68.field3159 != null) {
                            var68.field3159.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var69, var70, var71, var68.field3157, var5, (class4) null);
                        }
                    }
                }
                class233 var75 = var2.field1502;
                if (var75 != null) {
                    if ((var75.field3703 & var2.field1501) != 0 && !class168.method1183(var6, var3, var4, var75.field3703)) {
                        var75.field3716.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var75.field3712 - class209.field3435, var75.field3698 - class243.field3896, var75.field3715 - class30.field365, var75.field3719, var5, (class4) null);
                    }
                    if ((var75.field3717 & var2.field1501) != 0 && !class168.method1183(var6, var3, var4, var75.field3717)) {
                        var75.field3709.method85(0, class296.field4680, class250.field4008, class236.field3777, class8.field117, var75.field3712 - class209.field3435, var75.field3698 - class243.field3896, var75.field3715 - class30.field365, var75.field3719, var5, (class4) null);
                    }
                }
            }
            if (var5 < class269.field4361 - 1) {
                class99 var76 = class273.field4415[var5 + 1][var3][var4];
                if (var76 != null && var76.field1490) {
                    class173.field2784.method363(89, var76);
                }
            }
            if (var3 < class177.field2861) {
                class99 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1490) {
                    class173.field2784.method363(-128, var77);
                }
            }
            if (var4 < class21.field265) {
                class99 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1490) {
                    class173.field2784.method363(116, var78);
                }
            }
            if (var3 > class177.field2861) {
                class99 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1490) {
                    class173.field2784.method363(-114, var79);
                }
            }
            if (var4 > class21.field265) {
                class99 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1490) {
                    class173.field2784.method363(95, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static final void method1515(int arg0) {
        class267.method1807(false, -4);
        if (arg0 != 8156) {
            method1515(-103);
        }
        field3629++;
        System.gc();
        class233.method1539(25, (byte) 32);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)J")
    public abstract long method14(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
    public static final void method1516(byte arg0, boolean arg1) {
        field3625++;
        byte[][] var2 = class81.field1122;
        byte var3 = 4;
        int var4 = 0;
        if (arg0 > -42) {
            method1514((class99) null, false);
        }
        while (var3 > var4) {
            class280.method1873((byte) -54);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class140.field2298[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3E73D15) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class69.field958.length; var13++) {
                                if (class69.field958[var13] == var12 && var2[var13] != null) {
                                    class260.method1706(class61.field839, var2[var13], arg1, (var11 & 0x7) * 8, var9, -104, (var10 & 0x7) * 8, var5 * 8, var8, var4, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)[Ljg;")
    public static final class271[] method1517(byte arg0) {
        field3624++;
        class271[] var1 = new class271[class154.field2484];
        int var2 = 0;
        if (arg0 < 87) {
            return null;
        }
        while (class154.field2484 > var2) {
            int var3 = class263.field4168[var2] * class207.field3348[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class168.field2726[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class131.field2187[class204.method1369(var5[var6], 255)];
            }
            var1[var2] = new class43(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], var4);
            var2++;
        }
        class111.method804(0);
        return var1;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZ)I")
    public abstract int method13(int arg0, int arg1, boolean arg2);
}
