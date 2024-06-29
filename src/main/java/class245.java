import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class245 {

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3651 = "glow3:";

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lmd;")
    public class233 field3649;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lf;")
    public static class329 field3657;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lpj;")
    public class59 field3655;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lmd;III)V", line = 4)
    public static final void method1653(class233 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class311.field4734) {
            class221 var4 = class158.field2367[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3364 != null && var4.field3364.field2781.method564()) {
                arg0.method558(var4.field3364.field2781, 128, 0, 0, true);
            }
        }
        if (arg3 < class311.field4734) {
            class221 var5 = class158.field2367[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3364 != null && var5.field3364.field2781.method564()) {
                arg0.method558(var5.field3364.field2781, 0, 0, 128, true);
            }
        }
        if (arg2 < class311.field4734 && arg3 < class191.field2844) {
            class221 var6 = class158.field2367[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3364 != null && var6.field3364.field2781.method564()) {
                arg0.method558(var6.field3364.field2781, 128, 0, 128, true);
            }
        }
        if (arg2 < class311.field4734 && arg3 > 0) {
            class221 var7 = class158.field2367[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3364 != null && var7.field3364.field2781.method564()) {
                arg0.method558(var7.field3364.field2781, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)V", line = 54)
    public static final void method1654(byte arg0, int arg1, int arg2) {
        field3652++;
        class169 var3 = class101.method712(arg1, 7, 2089666400);
        var3.method1183(false);
        if (arg0 >= 54) {
            var3.field2542 = arg2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V", line = 70)
    public static final void method1655(int arg0, int arg1, byte arg2) {
        field3656++;
        class156 var3 = class149.field2246[class180.field2697][arg0][arg1];
        if (var3 == null) {
            class310.method2145(class180.field2697, arg0, arg1);
            return;
        }
        if (arg2 != -19) {
            method1653((class233) null, 9, 53, 80);
        }
        int var4 = -99999999;
        class287 var5 = (class287) var3.method1109(50);
        class287 var6 = null;
        while (var5 != null) {
            class253 var7 = class325.method2219(var5.field4334.field2501, arg2 ^ 0x24B0);
            int var8 = var7.field3787;
            if (var7.field3847 == 1) {
                var8 = (var5.field4334.field2502 + 1) * var8;
            }
            if (var4 < var8) {
                var6 = var5;
                var4 = var8;
            }
            var5 = (class287) var3.method1115((byte) 95);
        }
        if (var6 == null) {
            class310.method2145(class180.field2697, arg0, arg1);
            return;
        }
        var3.method1111(var6, -8);
        class287 var9 = (class287) var3.method1109(arg2 + 143);
        class166 var10 = null;
        class166 var11 = null;
        while (var9 != null) {
            class166 var12 = var9.field4334;
            if (var6.field4334.field2501 != var12.field2501) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field2501 != var12.field2501 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class287) var3.method1115((byte) 107);
        }
        long var13 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class58.method381(class180.field2697, arg0, arg1, class74.method473(arg1 * 128 + 64, arg0 * 128 + 64, arg2 ^ 0xFFFFFFAD, class180.field2697), var6.field4334, var13, var10, var11);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lf;IIBI)V", line = 159)
    public static final void method1656(class329 arg0, int arg1, int arg2, byte arg3, int arg4) {
        class237.method1621(108);
        if (class117.field1817) {
            class308.method2123(arg1, arg4, arg0.field5018 + arg1, arg0.field4994 + arg4);
        } else {
            class46.method301(arg1, arg4, arg1 + arg0.field5018, arg0.field4994 + arg4);
        }
        if (class166.field2498 != 2 && class166.field2498 != 5 && class271.field4157 != null) {
            int var5 = class284.field4297 + class160.field2401 & 0x7FF;
            int var6 = (class114.field1750.field1566 / 32) + 48;
            int var7 = 464 - (class114.field1750.field1505 / 32);
            if (class117.field1817) {
                ((class303) class271.field4157).method2097(arg1, arg4, arg0.field5018, arg0.field4994, var6, var7, var5, class178.field2641 + 256, (class303) arg0.method2237(false, 103));
            } else {
                ((class127) class271.field4157).method928(arg1, arg4, arg0.field5018, arg0.field4994, var6, var7, var5, class178.field2641 + 256, arg0.field4940, arg0.field5012);
            }
            if (class179.field2649 != null) {
                for (int var8 = 0; var8 < class179.field2649.field1996; var8++) {
                    if (class179.field2649.method960(966106632, var8)) {
                        int var9 = (class179.field2649.field2006[var8] - class189.field2807) * 4 + 2 - (class114.field1750.field1505 / 32);
                        int var10 = (class179.field2649.field2004[var8] - class217.field3309) * 4 + 2 - (class114.field1750.field1566 / 32);
                        int var11 = class148.field2239[var5];
                        int var12 = var11 * 256 / (class178.field2641 + 256);
                        int var13 = class148.field2229[var5];
                        class89 var14 = class61.field817;
                        int var15 = var13 * 256 / (class178.field2641 + 256);
                        int var16 = var9 * var15 - (var10 * var12) >> 16;
                        if (class179.field2649.method963(var8, true) == 1) {
                            var14 = class84.field1247;
                        }
                        if (class179.field2649.method963(var8, true) == 2) {
                            var14 = class217.field3299;
                        }
                        int var17 = var14.method625(class179.field2649.field2007[var8], 100);
                        int var18 = var9 * var12 + (var10 * var15) >> 16;
                        int var19 = var18 - var17 / 2;
                        if (var19 >= (-arg0.field5018) && arg0.field5018 >= var19 && (-arg0.field4994) <= var16 && var16 <= arg0.field4994) {
                            int var20 = 16777215;
                            if (class179.field2649.field2000[var8] != -1) {
                                var20 = class179.field2649.field2000[var8];
                            }
                            if (class117.field1817) {
                                class308.method2124((class303) arg0.method2237(false, -39));
                            } else {
                                class46.method311(arg0.field4940, arg0.field5012);
                            }
                            var14.method634(class179.field2649.field2007[var8], arg0.field5018 / 2 + var19 + arg1, arg0.field4994 / 2 + -var16 + arg4, var17, 50, var20, 0, 256, 1, 0, 0);
                            if (class117.field1817) {
                                class308.method2134();
                            } else {
                                class46.method320();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class74.field963; var21++) {
                int var22 = class3.field22[var21] * 4 + 2 - (class114.field1750.field1566 / 32);
                int var23 = class258.field3903[var21] * 4 + (-(class114.field1750.field1505 / 32)) + 2;
                class22 var24 = class284.method1980(class191.field2846[var21], (byte) 104);
                if (var24.field336 != null) {
                    var24 = var24.method142(0);
                    if (var24 == null || var24.field318 == -1) {
                        continue;
                    }
                }
                class321.method2201(arg0, 24483, arg4, class267.field4107[var24.field318], var23, arg1, var22);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class156 var27 = class149.field2246[class180.field2697][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class114.field1750.field1566 / 32);
                        int var29 = var26 * 4 + 2 - (class114.field1750.field1505 / 32);
                        class321.method2201(arg0, 24483, arg4, class26.field371[0], var29, arg1, var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class172.field2577; var30++) {
                class69 var31 = class187.field2788[class56.field711[var30]];
                if (var31 != null && var31.method455(120)) {
                    class58 var32 = var31.field914;
                    if (var32 != null && var32.field756 != null) {
                        var32 = var32.method390(88);
                    }
                    if (var32 != null && var32.field752 && var32.field768) {
                        int var33 = var31.field1566 / 32 - (class114.field1750.field1566 / 32);
                        int var34 = var31.field1505 / 32 - (class114.field1750.field1505 / 32);
                        if (var32.field722 == -1) {
                            class321.method2201(arg0, 24483, arg4, class26.field371[1], var34, arg1, var33);
                        } else {
                            class321.method2201(arg0, 24483, arg4, class267.field4107[var32.field722], var34, arg1, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class56.field706; var35++) {
                class195 var36 = class241.field3592[class20.field239[var35]];
                if (var36 != null && var36.method455(123)) {
                    boolean var37 = false;
                    int var38 = var36.field1566 / 32 - (class114.field1750.field1566 / 32);
                    int var39 = var36.field1505 / 32 - (class114.field1750.field1505 / 32);
                    long var40 = class242.method1638(var36.field2934, -14393);
                    for (int var42 = 0; var42 < class193.field2892; var42++) {
                        if (class7.field50[var42] == var40 && class255.field3872[var42] != 0) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class281.field4264; var44++) {
                        if (class125.field1964[var44].field1603 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class114.field1750.field2926 != 0 && var36.field2926 != 0 && class114.field1750.field2926 == var36.field2926) {
                        var45 = true;
                    }
                    if (var37) {
                        class321.method2201(arg0, 24483, arg4, class26.field371[3], var39, arg1, var38);
                    } else if (var43) {
                        class321.method2201(arg0, 24483, arg4, class26.field371[5], var39, arg1, var38);
                    } else if (var45) {
                        class321.method2201(arg0, 24483, arg4, class26.field371[4], var39, arg1, var38);
                    } else {
                        class321.method2201(arg0, 24483, arg4, class26.field371[2], var39, arg1, var38);
                    }
                }
            }
            class323[] var46 = class294.field4497;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class323 var48 = var46[var47];
                if (var48 != null && var48.field4869 != 0 && (class304.field4641 % 20) < 10) {
                    if (var48.field4869 == 1 && var48.field4871 >= 0 && class187.field2788.length > var48.field4871) {
                        class69 var49 = class187.field2788[var48.field4871];
                        if (var49 != null) {
                            int var50 = var49.field1566 / 32 - class114.field1750.field1566 / 32;
                            int var51 = var49.field1505 / 32 - (class114.field1750.field1505 / 32);
                            class126.method923(var51, 8408, arg0, var48.field4873, var50, arg4, arg1);
                        }
                    }
                    if (var48.field4869 == 2) {
                        int var52 = (var48.field4872 - class217.field3309) * 4 + 2 - (class114.field1750.field1566 / 32);
                        int var53 = (var48.field4881 - class189.field2807) * 4 + 2 - (class114.field1750.field1505 / 32);
                        class126.method923(var53, 8408, arg0, var48.field4873, var52, arg4, arg1);
                    }
                    if (var48.field4869 == 10 && var48.field4871 >= 0 && class241.field3592.length > var48.field4871) {
                        class195 var54 = class241.field3592[var48.field4871];
                        if (var54 != null) {
                            int var55 = var54.field1505 / 32 - (class114.field1750.field1505 / 32);
                            int var56 = var54.field1566 / 32 - (class114.field1750.field1566 / 32);
                            class126.method923(var55, 8408, arg0, var48.field4873, var56, arg4, arg1);
                        }
                    }
                }
            }
            if (class253.field3844 != 0) {
                int var57 = class253.field3844 * 4 + 2 - (class114.field1750.field1566 / 32);
                int var58 = class283.field4288 * 4 + 2 - (class114.field1750.field1505 / 32);
                class321.method2201(arg0, 24483, arg4, class288.field4351, var58, arg1, var57);
            }
            if (class117.field1817) {
                class308.method2126(arg0.field5018 / 2 + arg1 - 1, arg0.field4994 / 2 + arg4 + -1, 3, 3, 16777215);
            } else {
                class46.method312(arg0.field5018 / 2 + (arg1 - 1), arg0.field4994 / 2 + arg4 + -1, 3, 3, 16777215);
            }
        } else if (class117.field1817) {
            class235 var59 = arg0.method2237(false, -106);
            if (var59 != null) {
                var59.method935(arg1, arg4);
            }
        } else {
            class46.method306(arg1, arg4, 0, arg0.field4940, arg0.field5012);
        }
        field3650++;
        if (arg3 >= -2) {
            field3653 = -35;
        }
        class131.field2021[arg2] = true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 506)
    public static void method1657(byte arg0) {
        field3651 = null;
        if (arg0 <= 24) {
            method1655(46, 16, (byte) 80);
        }
        field3657 = null;
    }
}
