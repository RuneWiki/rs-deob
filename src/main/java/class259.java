import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class259 extends class105 {

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Ljava/lang/String;")
    public static String field4104 = "Checking for updates - ";

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field4106 = 0;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field4110 = "Attack";

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public static int field4112 = 0;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lub;")
    public static class92 field4108;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "Z")
    public static boolean field4107;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4108 = null;
        field4104 = null;
        if (arg0 == 0) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field4111;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257 && this.method802((byte) 35)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1635 * super.field1635;
            for (int var8 = 0; var8 < class250.field4008; ++var8) {
                int var9 = super.field1650[var8 % super.field1643 + var7];
                var6[var8] = class118.method863(255, var9) << 4;
                var4[var8] = class118.method863(65280, var9) >> 4;
                var5[var8] = class118.method863(var9 >> 12, 4080);
            }
        }
        if (arg0 < 0) {
            method1740(-42);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)Z")
    public static final boolean method1741(byte arg0, int arg1) {
        ++field4105;
        if (arg0 > -84) {
            method1742((class22) null, true);
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lpc;Z)V")
    public static final void method1742(class22 arg0, boolean arg1) {
        class170.field2575.method12(arg0, 12);
        while (true) {
            class22 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class22[][] var7;
            class22 var83;
            do {
                class22 var82;
                do {
                    class22 var81;
                    do {
                        class22 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class22) class170.field2575.method8(7);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field360);
                                            var3 = var2.field357;
                                            var4 = var2.field353;
                                            var5 = var2.field362;
                                            var6 = var2.field359;
                                            var7 = class149.field2210[var5];
                                            if (!var2.field374) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class22 var8 = class149.field2210[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field360) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class239.field3781 && var3 > class180.field2820) {
                                                    class22 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field360 && (var9.field374 || (var2.field378 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class239.field3781 && var3 < class22.field369 - 1) {
                                                    class22 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field360 && (var10.field374 || (var2.field378 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class150.field2230 && var4 > class135.field2022) {
                                                    class22 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field360 && (var11.field374 || (var2.field378 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class150.field2230 && var4 < class56.field888 - 1) {
                                                    class22 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field360 && (var12.field374 || (var2.field378 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field374 = false;
                                            if (var2.field379 != null) {
                                                class22 var13 = var2.field379;
                                                if (var13.field368 != null) {
                                                    if (!class150.method1088(0, var3, var4)) {
                                                        class307.method2058(var13.field368, 0, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, false);
                                                    } else {
                                                        class307.method2058(var13.field368, 0, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, true);
                                                    }
                                                } else if (var13.field373 != null) {
                                                    if (!class150.method1088(0, var3, var4)) {
                                                        class60.method490(var13.field373, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, false);
                                                    } else {
                                                        class60.method490(var13.field373, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, true);
                                                    }
                                                }
                                                class163 var14 = var13.field375;
                                                if (var14 != null) {
                                                    var14.field2456.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var14.field2462 - class42.field713, var14.field2466 - class178.field2736, var14.field2458 - class14.field178, var14.field2448, var5, (class249) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field371; ++var15) {
                                                    class19 var16 = var13.field355[var15];
                                                    if (var16 != null) {
                                                        var16.field266.method75(var16.field257, class39.field662, class257.field4092, class31.field573, class239.field3770, var16.field256 - class42.field713, var16.field253 - class178.field2736, var16.field264 - class14.field178, var16.field267, var5, (class249) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field368 != null) {
                                                if (!class150.method1088(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field368.field1845 != 12345678 || class118.field1789 && var5 <= class94.field1482) {
                                                        class307.method2058(var2.field368, var6, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, false);
                                                    }
                                                } else {
                                                    class307.method2058(var2.field368, var6, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, true);
                                                }
                                            } else if (var2.field373 != null) {
                                                if (!class150.method1088(var6, var3, var4)) {
                                                    var17 = true;
                                                    class60.method490(var2.field373, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, false);
                                                } else {
                                                    class60.method490(var2.field373, class39.field662, class257.field4092, class31.field573, class239.field3770, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class106 var18 = var2.field377;
                                                if (var18 != null && (var18.field1668 & 2147483648L) != 0L) {
                                                    var18.field1664.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var18.field1656 - class42.field713, var18.field1660 - class178.field2736, var18.field1657 - class14.field178, var18.field1668, var5, (class249) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class163 var21 = var2.field375;
                                            class56 var22 = var2.field364;
                                            if (var21 != null || var22 != null) {
                                                if (class239.field3781 == var3) {
                                                    ++var19;
                                                } else if (class239.field3781 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class150.field2230 == var4) {
                                                    var19 += 3;
                                                } else if (class150.field2230 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class107.field1670[var19];
                                                var2.field363 = class24.field418[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2460 & class192.field3011[var19]) != 0) {
                                                    if (var21.field2460 == 16) {
                                                        var2.field366 = 3;
                                                        var2.field376 = class248.field3940[var19];
                                                        var2.field370 = 3 - var2.field376;
                                                    } else if (var21.field2460 == 32) {
                                                        var2.field366 = 6;
                                                        var2.field376 = class235.field3721[var19];
                                                        var2.field370 = 6 - var2.field376;
                                                    } else if (var21.field2460 == 64) {
                                                        var2.field366 = 12;
                                                        var2.field376 = class257.field4099[var19];
                                                        var2.field370 = 12 - var2.field376;
                                                    } else {
                                                        var2.field366 = 9;
                                                        var2.field376 = class15.field184[var19];
                                                        var2.field370 = 9 - var2.field376;
                                                    }
                                                } else {
                                                    var2.field366 = 0;
                                                }
                                                if ((var21.field2460 & var20) != 0 && !class215.method1488(var6, var3, var4, var21.field2460)) {
                                                    var21.field2456.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var21.field2462 - class42.field713, var21.field2466 - class178.field2736, var21.field2458 - class14.field178, var21.field2448, var5, (class249) null);
                                                }
                                                if ((var21.field2447 & var20) != 0 && !class215.method1488(var6, var3, var4, var21.field2447)) {
                                                    var21.field2459.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var21.field2462 - class42.field713, var21.field2466 - class178.field2736, var21.field2458 - class14.field178, var21.field2448, var5, (class249) null);
                                                }
                                            }
                                            if (var22 != null && !class73.method576(var6, var3, var4, var22.field886.method82())) {
                                                if ((var22.field879 & var20) != 0) {
                                                    var22.field886.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var22.field893 - class42.field713 + var22.field892, var22.field891 - class178.field2736, var22.field881 - class14.field178 + var22.field882, var22.field880, var5, (class249) null);
                                                } else if (var22.field879 == 256) {
                                                    int var23 = var22.field893 - class42.field713;
                                                    int var24 = var22.field891 - class178.field2736;
                                                    int var25 = var22.field881 - class14.field178;
                                                    int var26 = var22.field884;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field886.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var22.field892 + var23, var24, var22.field882 + var25, var22.field880, var5, (class249) null);
                                                    } else if (var22.field890 != null) {
                                                        var22.field890.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var23, var24, var25, var22.field880, var5, (class249) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class106 var29 = var2.field377;
                                                if (var29 != null && (var29.field1668 & 2147483648L) == 0L) {
                                                    var29.field1664.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var29.field1656 - class42.field713, var29.field1660 - class178.field2736, var29.field1657 - class14.field178, var29.field1668, var5, (class249) null);
                                                }
                                                class153 var30 = var2.field361;
                                                if (var30 != null && var30.field2268 == 0) {
                                                    if (var30.field2255 != null) {
                                                        var30.field2255.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var30.field2264 - class42.field713, var30.field2265 - class178.field2736, var30.field2260 - class14.field178, var30.field2267, var5, (class249) null);
                                                    }
                                                    if (var30.field2269 != null) {
                                                        var30.field2269.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var30.field2264 - class42.field713, var30.field2265 - class178.field2736, var30.field2260 - class14.field178, var30.field2267, var5, (class249) null);
                                                    }
                                                    if (var30.field2263 != null) {
                                                        var30.field2263.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var30.field2264 - class42.field713, var30.field2265 - class178.field2736, var30.field2260 - class14.field178, var30.field2267, var5, (class249) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field378;
                                            if (var31 != 0) {
                                                if (var3 < class239.field3781 && (var31 & 4) != 0) {
                                                    class22 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field360) {
                                                        class170.field2575.method12(var32, 12);
                                                    }
                                                }
                                                if (var4 < class150.field2230 && (var31 & 2) != 0) {
                                                    class22 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field360) {
                                                        class170.field2575.method12(var33, 12);
                                                    }
                                                }
                                                if (var3 > class239.field3781 && (var31 & 1) != 0) {
                                                    class22 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field360) {
                                                        class170.field2575.method12(var34, 12);
                                                    }
                                                }
                                                if (var4 > class150.field2230 && (var31 & 8) != 0) {
                                                    class22 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field360) {
                                                        class170.field2575.method12(var35, 12);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field366 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field371; ++var37) {
                                                if (class244.field3891 != var2.field355[var37].field259 && (var2.field367[var37] & var2.field366) == var2.field376) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class163 var38 = var2.field375;
                                                if (!class215.method1488(var6, var3, var4, var38.field2460)) {
                                                    var38.field2456.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var38.field2462 - class42.field713, var38.field2466 - class178.field2736, var38.field2458 - class14.field178, var38.field2448, var5, (class249) null);
                                                }
                                                var2.field366 = 0;
                                            }
                                        }
                                        if (!var2.field354) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field371;
                                            var2.field354 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; ++var41) {
                                                class19 var42 = var2.field355[var41];
                                                if (class244.field3891 != var42.field259) {
                                                    for (int var43 = var42.field255; var43 <= var42.field261; ++var43) {
                                                        for (int var44 = var42.field258; var44 <= var42.field260; ++var44) {
                                                            class22 var45 = var7[var43][var44];
                                                            if (var45.field374) {
                                                                var2.field354 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field366 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field255) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field261) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field258) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field260) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field366) == var2.field370) {
                                                                    var2.field354 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class269.field4264[var40++] = var42;
                                                    int var47 = class239.field3781 - var42.field255;
                                                    int var48 = var42.field261 - class239.field3781;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class150.field2230 - var42.field258;
                                                    int var50 = var42.field260 - class150.field2230;
                                                    if (var50 > var49) {
                                                        var42.field263 = var47 + var50;
                                                    } else {
                                                        var42.field263 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class19 var54 = class269.field4264[var53];
                                                    if (class244.field3891 != var54.field259) {
                                                        if (var54.field263 > var51) {
                                                            var51 = var54.field263;
                                                            var52 = var53;
                                                        } else if (var54.field263 == var51) {
                                                            int var55 = var54.field256 - class42.field713;
                                                            int var56 = var54.field264 - class14.field178;
                                                            int var57 = class269.field4264[var52].field256 - class42.field713;
                                                            int var58 = class269.field4264[var52].field264 - class14.field178;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class19 var59 = class269.field4264[var52];
                                                var59.field259 = class244.field3891;
                                                if (!class113.method839(var6, var59.field255, var59.field261, var59.field258, var59.field260, var59.field266.method82())) {
                                                    var59.field266.method75(var59.field257, class39.field662, class257.field4092, class31.field573, class239.field3770, var59.field256 - class42.field713, var59.field253 - class178.field2736, var59.field264 - class14.field178, var59.field267, var5, (class249) null);
                                                }
                                                for (int var60 = var59.field255; var60 <= var59.field261; ++var60) {
                                                    for (int var61 = var59.field258; var61 <= var59.field260; ++var61) {
                                                        class22 var62 = var7[var60][var61];
                                                        if (var62.field366 != 0) {
                                                            class170.field2575.method12(var62, 12);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field360) {
                                                            class170.field2575.method12(var62, 12);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field354) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field354 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field356 != null) {
                                        int var63 = class249.field3970 + class224.field3599;
                                        int var64 = class249.field3964 + class224.field3598;
                                        class190 var65 = var2.field356.field3725;
                                        for (class190 var66 = var65.field2981; var65 != var66; var66 = var66.field2981) {
                                            class243 var67 = (class243) var66;
                                            if (var67.field3886 != null && !var67.field3886.field910.field3969) {
                                                if ((byte) ((int) (var67.field3886.field910.field3961 & 255L)) != var2.field358) {
                                                    var2.field356 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field3887 >> 12) - class42.field713;
                                                int var69 = (var67.field3884 >> 12) - class178.field2736;
                                                int var70 = (var67.field3890 >> 12) - class14.field178;
                                                int var71 = class31.field573 * var70 + class239.field3770 * var68 >> 16;
                                                int var72 = class239.field3770 * var70 - class31.field573 * var68 >> 16;
                                                int var74 = class257.field4092 * var69 - class39.field662 * var72 >> 16;
                                                int var75 = class39.field662 * var69 + class257.field4092 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class66.method515(var77, var78, (var67.field3886.field901.field2603 << 16) / var79, var67.field3877, var67.field3877 >> 24 & 255);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field360);
                            } while (var2.field366 != 0);
                            if (var3 > class239.field3781 || var3 <= class180.field2820) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field360);
                        if (var3 < class239.field3781 || var3 >= class22.field369 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field360);
                    if (var4 > class150.field2230 || var4 <= class135.field2022) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field360);
                if (var4 < class150.field2230 || var4 >= class56.field888 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field360);
            var2.field360 = false;
            --class166.field2514;
            class153 var84 = var2.field361;
            if (var84 != null && var84.field2268 != 0) {
                if (var84.field2255 != null) {
                    var84.field2255.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var84.field2264 - class42.field713, var84.field2265 - class178.field2736 - var84.field2268, var84.field2260 - class14.field178, var84.field2267, var5, (class249) null);
                }
                if (var84.field2269 != null) {
                    var84.field2269.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var84.field2264 - class42.field713, var84.field2265 - class178.field2736 - var84.field2268, var84.field2260 - class14.field178, var84.field2267, var5, (class249) null);
                }
                if (var84.field2263 != null) {
                    var84.field2263.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var84.field2264 - class42.field713, var84.field2265 - class178.field2736 - var84.field2268, var84.field2260 - class14.field178, var84.field2267, var5, (class249) null);
                }
            }
            if (var2.field363 != 0) {
                class56 var85 = var2.field364;
                if (var85 != null && !class73.method576(var6, var3, var4, var85.field886.method82())) {
                    if ((var85.field879 & var2.field363) != 0) {
                        var85.field886.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var85.field893 - class42.field713 + var85.field892, var85.field891 - class178.field2736, var85.field881 - class14.field178 + var85.field882, var85.field880, var5, (class249) null);
                    } else if (var85.field879 == 256) {
                        int var86 = var85.field893 - class42.field713;
                        int var87 = var85.field891 - class178.field2736;
                        int var88 = var85.field881 - class14.field178;
                        int var89 = var85.field884;
                        int var90;
                        if (var89 != 1 && var89 != 2) {
                            var90 = var86;
                        } else {
                            var90 = -var86;
                        }
                        int var91;
                        if (var89 != 2 && var89 != 3) {
                            var91 = var88;
                        } else {
                            var91 = -var88;
                        }
                        if (var91 >= var90) {
                            var85.field886.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var85.field892 + var86, var87, var85.field882 + var88, var85.field880, var5, (class249) null);
                        } else if (var85.field890 != null) {
                            var85.field890.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var86, var87, var88, var85.field880, var5, (class249) null);
                        }
                    }
                }
                class163 var92 = var2.field375;
                if (var92 != null) {
                    if ((var92.field2447 & var2.field363) != 0 && !class215.method1488(var6, var3, var4, var92.field2447)) {
                        var92.field2459.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var92.field2462 - class42.field713, var92.field2466 - class178.field2736, var92.field2458 - class14.field178, var92.field2448, var5, (class249) null);
                    }
                    if ((var92.field2460 & var2.field363) != 0 && !class215.method1488(var6, var3, var4, var92.field2460)) {
                        var92.field2456.method75(0, class39.field662, class257.field4092, class31.field573, class239.field3770, var92.field2462 - class42.field713, var92.field2466 - class178.field2736, var92.field2458 - class14.field178, var92.field2448, var5, (class249) null);
                    }
                }
            }
            if (var5 < class57.field900 - 1) {
                class22 var93 = class149.field2210[var5 + 1][var3][var4];
                if (var93 != null && var93.field360) {
                    class170.field2575.method12(var93, 12);
                }
            }
            if (var3 < class239.field3781) {
                class22 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field360) {
                    class170.field2575.method12(var94, 12);
                }
            }
            if (var4 < class150.field2230) {
                class22 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field360) {
                    class170.field2575.method12(var95, 12);
                }
            }
            if (var3 > class239.field3781) {
                class22 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field360) {
                    class170.field2575.method12(var96, 12);
                }
            }
            if (var4 > class150.field2230) {
                class22 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field360) {
                    class170.field2575.method12(var97, 12);
                }
            }
        }
    }
}
