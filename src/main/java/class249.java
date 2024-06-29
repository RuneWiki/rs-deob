import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class249 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3958 = "slide:";

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[Lkk;")
    public static class80[] field3961 = new class80[50];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[Z")
    public static boolean[][] field3963 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3956 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lcl;")
    public static class118 field3955 = new class118();

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lsc;")
    public static class158 field3966;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lnm;")
    public static class221 field3959;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class186 var7 = new class186();
        var7.field2890 = arg1 / 128;
        var7.field2898 = arg2 / 128;
        var7.field2886 = arg3 / 128;
        var7.field2887 = arg4 / 128;
        var7.field2900 = arg0;
        var7.field2881 = arg1;
        var7.field2902 = arg2;
        var7.field2894 = arg3;
        var7.field2889 = arg4;
        var7.field2901 = arg5;
        var7.field2878 = arg6;
        class325.field5327[class197.field3038++] = var7;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZI)V", line = 21)
    public static final void method1770(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3964++;
        if (arg0 == arg5) {
            class11.method72(arg3, -10259, arg1, arg2, arg0);
            return;
        }
        if (arg4) {
            field3958 = (String) null;
        }
        if (class341.field5494 <= arg2 - arg0 && class196.field3001 >= arg0 + arg2 && class33.field505 <= (arg1 - arg5) && arg1 + arg5 <= class278.field4586) {
            class198.method1356(arg2, (byte) -70, arg1, arg5, arg0, arg3);
        } else {
            class124.method805(arg3, arg5, arg2, arg0, (byte) -117, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)J", line = 48)
    public static final long method1771(boolean arg0) {
        if (arg0) {
            field3962++;
            return class186.field2895.method451(61);
        } else {
            return 124L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILsi;)V", line = 68)
    public static final void method1772(int arg0, int arg1, int arg2, int arg3, class264 arg4) {
        if (arg0 != 1680) {
            field3967 = 64;
        }
        field3960++;
        class190.method1316(-128);
        if (class245.field3886) {
            class335.method2375(arg3, arg2, arg4.field4223 + arg3, arg2 - -arg4.field4236);
        } else {
            class317.method2273(arg3, arg2, arg4.field4223 + arg3, arg4.field4236 + arg2);
        }
        if (class203.field3112 != 2 && class203.field3112 != 5 && class211.field3219 != null) {
            int var5 = 48 - (-(class329.field5388.field4796 / 32));
            int var6 = 464 - (class329.field5388.field4783 / 32);
            int var7 = (int) class355.field5628 + class322.field5284 & 0x7FF;
            if (class245.field3886) {
                ((class232) class211.field3219).method1601(arg3, arg2, arg4.field4223, arg4.field4236, var5, var6, var7, class196.field3008 + 256, (class232) arg4.method1859(-1, false));
            } else {
                ((class137) class211.field3219).method949(arg3, arg2, arg4.field4223, arg4.field4236, var5, var6, var7, class196.field3008 + 256, arg4.field4260, arg4.field4338);
            }
            if (class322.field5292 != null) {
                for (int var8 = 0; var8 < class322.field5292.field1060; var8++) {
                    if (class322.field5292.field1052[var8] != null && class322.field5292.field1055[var8] >> 28 == class120.field1779) {
                        int var9 = (class322.field5292.field1055[var8] >> 14 & 0x3FFF) - class215.field3313;
                        int var10 = (class322.field5292.field1055[var8] & 0x3FFF) - class150.field2420;
                        if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                            int var11 = var10 * 4 + 2 - (class329.field5388.field4783 / 32);
                            int var12 = var9 * 4 + 2 - (class329.field5388.field4796 / 32);
                            class279.method1984(arg4, arg3, var11, class322.field5292.field1052[var8].field2378, arg2, 2, var12);
                        }
                    }
                }
            }
            for (int var13 = 0; var13 < class143.field2294; var13++) {
                int var14 = class113.field1662[var13] * 4 + 2 - (class329.field5388.field4796 / 32);
                int var15 = class328.field5368[var13] * 4 + 2 - (class329.field5388.field4783 / 32);
                class126 var16 = class165.method1155((byte) -117, class39.field569[var13]);
                if (var16.field1949 != null) {
                    var16 = var16.method818(arg0 ^ 0xFFFFF915);
                    if (var16 == null || var16.field1903 == -1) {
                        continue;
                    }
                }
                class279.method1984(arg4, arg3, var15, var16.field1903, arg2, 2, var14);
            }
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class150 var19 = class171.field2668[class120.field1779][var17][var18];
                    if (var19 != null) {
                        int var20 = var17 * 4 + 2 - (class329.field5388.field4796 / 32);
                        int var21 = var18 * 4 - ((class329.field5388.field4783 / 32) - 2);
                        class206.method1401(class153.field2479[0], arg2, arg4, var21, arg3, var20, -109);
                    }
                }
            }
            for (int var22 = 0; var22 < class294.field4892; var22++) {
                class233 var23 = class329.field5377[class243.field3843[var22]];
                if (var23 != null && var23.method310((byte) -12)) {
                    class139 var24 = var23.field3702;
                    if (var24 != null && var24.field2229 != null) {
                        var24 = var24.method987(arg0 ^ 0xFFFFF96F);
                    }
                    if (var24 != null && var24.field2232 && var24.field2190) {
                        int var25 = var23.field4796 / 32 - (class329.field5388.field4796 / 32);
                        int var26 = var23.field4783 / 32 - (class329.field5388.field4783 / 32);
                        if (var24.field2240 == -1) {
                            class206.method1401(class153.field2479[1], arg2, arg4, var26, arg3, var25, arg0 ^ 0x6B6);
                        } else {
                            class279.method1984(arg4, arg3, var26, var24.field2240, arg2, 2, var25);
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < class38.field561; var27++) {
                class39 var28 = class130.field1984[class150.field2410[var27]];
                if (var28 != null && var28.method310((byte) -12)) {
                    int var29 = var28.field4796 / 32 - class329.field5388.field4796 / 32;
                    int var30 = var28.field4783 / 32 - (class329.field5388.field4783 / 32);
                    boolean var31 = false;
                    long var32 = class265.method1872(var28.field597, arg0 ^ 0x6FB);
                    for (int var34 = 0; var34 < class339.field5458; var34++) {
                        if (class328.field5374[var34] == var32 && class248.field3931[var34] != 0) {
                            var31 = true;
                            break;
                        }
                    }
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class201.field3086; var36++) {
                        if (class166.field2623[var36].field2549 == var32) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    if (class329.field5388.field571 != 0 && var28.field571 != 0 && class329.field5388.field571 == var28.field571) {
                        var37 = true;
                    }
                    if (var31) {
                        class206.method1401(class153.field2479[3], arg2, arg4, var30, arg3, var29, 54);
                    } else if (var35) {
                        class206.method1401(class153.field2479[5], arg2, arg4, var30, arg3, var29, -124);
                    } else if (var37) {
                        class206.method1401(class153.field2479[4], arg2, arg4, var30, arg3, var29, arg0 ^ 0xFFFFF91E);
                    } else {
                        class206.method1401(class153.field2479[2], arg2, arg4, var30, arg3, var29, -102);
                    }
                }
            }
            class281[] var38 = class165.field2602;
            for (int var39 = 0; var39 < var38.length; var39++) {
                class281 var40 = var38[var39];
                if (var40 != null && var40.field4622 != 0 && class58.field875 % 20 < 10) {
                    if (var40.field4622 == 1 && var40.field4628 >= 0 && class329.field5377.length > var40.field4628) {
                        class233 var41 = class329.field5377[var40.field4628];
                        if (var41 != null) {
                            int var42 = var41.field4783 / 32 - (class329.field5388.field4783 / 32);
                            int var43 = var41.field4796 / 32 - class329.field5388.field4796 / 32;
                            class189.method1307(arg4, var40.field4619, arg0 ^ 0x2019, arg3, 360000, var43, var42, arg2);
                        }
                    }
                    if (var40.field4622 == 2) {
                        int var44 = var40.field4623 * 4;
                        int var45 = (var40.field4618 - class215.field3313) * 4 - ((class329.field5388.field4796 / 32) - 2);
                        int var46 = var44 * var44;
                        int var47 = (var40.field4617 - class150.field2420) * 4 - ((class329.field5388.field4783 / 32) - 2);
                        class189.method1307(arg4, var40.field4619, 9865, arg3, var46, var45, var47, arg2);
                    }
                    if (var40.field4622 == 10 && var40.field4628 >= 0 && var40.field4628 < class130.field1984.length) {
                        class39 var48 = class130.field1984[var40.field4628];
                        if (var48 != null) {
                            int var49 = var48.field4796 / 32 - (class329.field5388.field4796 / 32);
                            int var50 = var48.field4783 / 32 - (class329.field5388.field4783 / 32);
                            class189.method1307(arg4, var40.field4619, 9865, arg3, 360000, var49, var50, arg2);
                        }
                    }
                }
            }
            if (class223.field3439 != 0) {
                int var51 = class223.field3439 * 4 + class329.field5388.method312(arg0 ^ 0x6E1) * 2 + 2 - (class329.field5388.field4796 / 32) - 2;
                int var52 = class183.field2854 * 4 + (2 - (class329.field5388.field4783 / 32 + 2 - (class329.field5388.method312(-85) * 2)));
                class206.method1401(class75.field1133, arg2, arg4, var52, arg3, var51, 11);
            }
            if (class245.field3886) {
                class335.method2380(arg3 + (arg4.field4223 / 2) - 1, arg4.field4236 / 2 + arg2 + -1, 3, 3, 16777215);
            } else {
                class317.method2282(arg4.field4223 / 2 + arg3 - 1, arg4.field4236 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        } else if (class245.field3886) {
            class289 var53 = arg4.method1859(-1, false);
            if (var53 != null) {
                var53.method945(arg3, arg2);
            }
        } else {
            class317.method2291(arg3, arg2, 0, arg4.field4260, arg4.field4338);
        }
        class324.field5309[arg1] = true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ICZ)I", line = 376)
    public static final int method1773(int arg0, char arg1, boolean arg2) {
        if (!arg2) {
            method1774((byte) 89);
        }
        field3965++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 404)
    public static void method1774(byte arg0) {
        field3958 = null;
        field3963 = (boolean[][]) null;
        field3961 = null;
        field3966 = null;
        field3959 = null;
        field3955 = null;
        if (arg0 != 16) {
            field3959 = (class221) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 431)
    public static final void method1775() {
        class143.field2299 = 0;
        label194: for (int var0 = 0; var0 < class197.field3038; var0++) {
            class186 var1 = class325.field5327[var0];
            if (class166.field2622 != null) {
                for (int var2 = 0; var2 < class166.field2622.length; var2++) {
                    if (class166.field2622[var2] != -1000000 && (var1.field2901 <= class166.field2622[var2] || var1.field2878 <= class166.field2622[var2]) && (var1.field2881 <= class233.field3708[var2] || var1.field2902 <= class233.field3708[var2]) && (var1.field2881 >= class131.field1996[var2] || var1.field2902 >= class131.field1996[var2]) && (var1.field2894 <= class258.field4091[var2] || var1.field2889 <= class258.field4091[var2]) && (var1.field2894 >= class267.field4388[var2] || var1.field2889 >= class267.field4388[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2900 == 1) {
                int var3 = var1.field2890 + class230.field3647 - class258.field4094;
                if (var3 >= 0 && var3 <= class230.field3647 + class230.field3647) {
                    int var4 = var1.field2886 + class230.field3647 - class296.field4906;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2887 + class230.field3647 - class296.field4906;
                    if (var5 > class230.field3647 + class230.field3647) {
                        var5 = class230.field3647 + class230.field3647;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class20.field243[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class244.field3847 - var1.field2881;
                        if (var7 > 32) {
                            var1.field2904 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2904 = 2;
                            var7 = -var7;
                        }
                        var1.field2879 = (var1.field2894 - class228.field3584 << 8) / var7;
                        var1.field2891 = (var1.field2889 - class228.field3584 << 8) / var7;
                        var1.field2883 = (var1.field2901 - class65.field959 << 8) / var7;
                        var1.field2888 = (var1.field2878 - class65.field959 << 8) / var7;
                        class28.field433[class143.field2299++] = var1;
                    }
                }
            } else if (var1.field2900 == 2) {
                int var8 = var1.field2886 + class230.field3647 - class296.field4906;
                if (var8 >= 0 && var8 <= class230.field3647 + class230.field3647) {
                    int var9 = var1.field2890 + class230.field3647 - class258.field4094;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2898 + class230.field3647 - class258.field4094;
                    if (var10 > class230.field3647 + class230.field3647) {
                        var10 = class230.field3647 + class230.field3647;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class20.field243[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class228.field3584 - var1.field2894;
                        if (var12 > 32) {
                            var1.field2904 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2904 = 4;
                            var12 = -var12;
                        }
                        var1.field2897 = (var1.field2881 - class244.field3847 << 8) / var12;
                        var1.field2885 = (var1.field2902 - class244.field3847 << 8) / var12;
                        var1.field2883 = (var1.field2901 - class65.field959 << 8) / var12;
                        var1.field2888 = (var1.field2878 - class65.field959 << 8) / var12;
                        class28.field433[class143.field2299++] = var1;
                    }
                }
            } else if (var1.field2900 == 4) {
                int var13 = var1.field2901 - class65.field959;
                if (var13 > 128) {
                    int var14 = var1.field2886 + class230.field3647 - class296.field4906;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2887 + class230.field3647 - class296.field4906;
                    if (var15 > class230.field3647 + class230.field3647) {
                        var15 = class230.field3647 + class230.field3647;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2890 + class230.field3647 - class258.field4094;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2898 + class230.field3647 - class258.field4094;
                        if (var17 > class230.field3647 + class230.field3647) {
                            var17 = class230.field3647 + class230.field3647;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class20.field243[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2904 = 5;
                            var1.field2897 = (var1.field2881 - class244.field3847 << 8) / var13;
                            var1.field2885 = (var1.field2902 - class244.field3847 << 8) / var13;
                            var1.field2879 = (var1.field2894 - class228.field3584 << 8) / var13;
                            var1.field2891 = (var1.field2889 - class228.field3584 << 8) / var13;
                            class28.field433[class143.field2299++] = var1;
                        }
                    }
                }
            }
        }
    }
}
