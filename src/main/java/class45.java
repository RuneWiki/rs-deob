import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class45 extends class231 {

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    private int field554 = -32768;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Luf;")
    public static class168 field553 = null;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZIIZ)V", line = 5)
    public static final void method243(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        class134.field2091++;
        if (!arg5) {
            class278.method1918(true, 122);
            class9.method35(43, true);
            class278.method1918(false, 108);
        }
        field549++;
        class9.method35(86, false);
        if (!arg5) {
            class140.method969((byte) 67);
        }
        class203.method1419(true);
        class105.method788(arg3, arg0, true, arg4, arg1, (byte) -101);
        int var6 = class271.field4556;
        int var7 = class141.field2178;
        int var8 = class253.field4334;
        int var9 = class259.field4398;
        if (class289.field4867 == 1) {
            int var10 = class171.field2787;
            int var11 = class71.field959 + class110.field1723 & 0x7FF;
            if ((class272.field4571 / 256) > var10) {
                var10 = class272.field4571 / 256;
            }
            if (class247.field4236[4] && var10 < (class78.field1069[4] + 128)) {
                var10 = class78.field1069[4] + 128;
            }
            class56.method314(var10, class296.field5009, class62.method349(128, class79.field1127, class266.field4489.field3021, class266.field4489.field3027) - 50, var11, var10 * 3 + 600, class215.field3503, 2048, var6);
        }
        int var12 = class143.field2208;
        int var13 = class248.field4249;
        int var14 = class157.field2483;
        int var15 = class105.field1624;
        int var16 = class288.field4847;
        for (int var17 = 0; var17 < 5; var17++) {
            if (class247.field4236[var17]) {
                int var18 = (int) (Math.random() * (double) (class80.field1155[var17] * 2 + 1) + Math.sin((double) class130.field2019[var17] / 100.0D * (double) class159.field2516[var17]) * (double) class78.field1069[var17] - (double) class80.field1155[var17]);
                if (var17 == 3) {
                    class288.field4847 = class288.field4847 + var18 & 0x7FF;
                }
                if (var17 == 4) {
                    class105.field1624 += var18;
                    if (class105.field1624 < 128) {
                        class105.field1624 = 128;
                    }
                    if (class105.field1624 > 383) {
                        class105.field1624 = 383;
                    }
                }
                if (var17 == 2) {
                    class157.field2483 += var18;
                }
                if (var17 == 0) {
                    class248.field4249 += var18;
                }
                if (var17 == 1) {
                    class143.field2208 += var18;
                }
            }
        }
        class86.method595(0);
        class228.method1563(var9, var7, var9 + var8, var6 + var7);
        float var19 = (float) class288.field4847 * 0.17578125F;
        float var20 = (float) class105.field1624 * 0.17578125F;
        if (class289.field4867 == 3) {
            var20 = class297.field5016 * 360.0F / 6.2831855F;
            var19 = class142.field2187 * 360.0F / 6.2831855F;
        }
        class90.method639(var9, var7, var8, var6, var9 + (var8 / 2), var6 / 2 + var7, var20, var19, class46.field561, class46.field561);
        if (class121.field1888 || class301.field5093 < var9 || (var8 + var9) <= class301.field5093 || class166.field2661 < var7 || class166.field2661 >= var6 + var7) {
            class25.field306 = false;
            class122.field1890 = 0;
        } else {
            class122.field1890 = 0;
            int var21 = class2.field11;
            class25.field306 = true;
            int var22 = class281.field4720;
            int var23 = class287.field4838;
            class276.field4648 = (class166.field2661 - var7) * (var23 - var22) / var6 + var22;
            int var24 = class133.field2086;
            class183.field2938 = (class301.field5093 - var9) * (var24 - var21) / var8 + var21;
        }
        class254.method1750((byte) 85);
        byte var25 = class85.method580(0) == 2 ? (byte) class134.field2091 : 1;
        boolean var26 = false;
        class90.method637();
        class90.method629(true);
        class90.method638(true);
        int var27;
        if (class193.field3143 == 10) {
            var27 = class283.method1949(1000000, class248.field4249 >> 10, class274.field4619, class157.field2483 >> 10, class69.field913);
        } else {
            var27 = class283.method1949(1000000, class266.field4489.field3020[0] >> 3, class274.field4619, class266.field4489.field3033[0] >> 3, class69.field913);
        }
        class257.method1759(class203.field3335, !class61.field796);
        class90.method633(var27);
        class237.method1598(class288.field4847, class105.field1624, false, class143.field2208, class157.field2483, class248.field4249);
        class90.field1388 = class203.field3335;
        class82.method533(class248.field4249, class143.field2208, class157.field2483, class105.field1624, class288.field4847, class291.field4914, class284.field4814, class50.field613, class126.field1938, class200.field3302, class114.field1781, class79.field1127 + 1, var25, class266.field4489.field3027 >> 7, class266.field4489.field3021 >> 7);
        class226.field3677 = true;
        class257.method1768();
        class237.method1598(0, 0, arg2, 0, 0, 0);
        class254.method1750((byte) 94);
        class44.method240();
        class21.method110(class46.field561, 114, class46.field561, var9, var6, var8, var7);
        class126.method894(class46.field561, var9, var8, var6, class46.field561, var7, -28443);
        ((class85) class173.field2815).method581(class274.field4619, true);
        class190.method1338(var7, var8, var9, 9143, var6);
        class157.field2483 = var14;
        class288.field4847 = var16;
        class248.field4249 = var13;
        class105.field1624 = var15;
        class143.field2208 = var12;
        if (class51.field627 && class252.method1727(false, true, false) == 0) {
            class51.field627 = false;
        }
        if (class51.field627) {
            class228.method1560(var9, var7, var8, var6, 0);
            class113.method830(false, 13, class70.field920);
        }
        if (!arg5 && !class51.field627 && !class121.field1888 && var9 <= class301.field5093 && (var8 + var9) > class301.field5093 && class166.field2661 >= var7 && var6 + var7 > class166.field2661) {
            class46.method251(class301.field5093, var7, var8, (byte) -97, var6, class166.field2661, var9);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z", line = 202)
    public static final boolean method244(int arg0, int arg1) {
        field552++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg0 >= -13) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llj;Llj;B)V", line = 225)
    public static final void method245(class24 arg0, class24 arg1, byte arg2) {
        field556++;
        if (arg2 != -59) {
            field553 = (class168) null;
        }
        if (arg1.field293 != null) {
            arg1.method124((byte) 31);
        }
        arg1.field295 = arg0;
        arg1.field293 = arg0.field293;
        arg1.field293.field295 = arg1;
        arg1.field295.field293 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I", line = 246)
    public final int method116() {
        field548++;
        return this.field554;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 254)
    public static void method246(int arg0) {
        field553 = null;
        if (arg0 != 26292) {
            method244(-86, 94);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILuf;Luf;SBJI)V", line = 265)
    public static final void method247(int arg0, class168 arg1, class168 arg2, short arg3, byte arg4, long arg5, int arg6) {
        field558++;
        if (arg4 != 66 || class121.field1888 || class22.field275 >= 500) {
            return;
        }
        class224.field3625[class22.field275] = arg2;
        class274.field4606[class22.field275] = arg1;
        class61.field804[class22.field275] = arg3;
        class187.field2960[class22.field275] = arg5;
        class77.field1046[class22.field275] = arg6;
        class241.field3946[class22.field275] = arg0;
        class22.field275++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 291)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field559++;
        class152 var11 = class284.method1963((byte) -90, this.field555).method1603(this.field557, -73, 0, (class190) null);
        if (var11 != null) {
            var11.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field554 = var11.method116();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBII)V", line = 319)
    public static final void method248(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -13) {
            return;
        }
        field547++;
        if (arg5 > class44.field538 || class9.field112 > arg4) {
            return;
        }
        boolean var6;
        if (class150.field2331 > arg2) {
            arg2 = class150.field2331;
            var6 = false;
        } else if (arg2 > class65.field874) {
            arg2 = class65.field874;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class150.field2331 > arg0) {
            arg0 = class150.field2331;
            var7 = false;
        } else if (class65.field874 >= arg0) {
            var7 = true;
        } else {
            var7 = false;
            arg0 = class65.field874;
        }
        if (class9.field112 > arg5) {
            arg5 = class9.field112;
        } else {
            class133.method925(14678, arg2, arg1, arg0, class284.field4810[arg5++]);
        }
        if (arg4 > class44.field538) {
            arg4 = class44.field538;
        } else {
            class133.method925(14678, arg2, arg1, arg0, class284.field4810[arg4--]);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg4; var8++) {
                int[] var9 = class284.field4810[var8];
                var9[arg2] = var9[arg0] = arg1;
            }
        } else if (var6) {
            for (int var11 = arg5; var11 <= arg4; var11++) {
                class284.field4810[var11][arg2] = arg1;
            }
        } else if (var7) {
            for (int var10 = arg5; var10 <= arg4; var10++) {
                class284.field4810[var10][arg0] = arg1;
            }
        }
    }
}
