import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class126 extends RuntimeException {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Ljava/lang/String;")
    public String field1774;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1772;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lgp;")
    public static class31[] field1775 = new class31[0];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 3)
    public static final void method841(int arg0, String arg1, boolean arg2) {
        field1776++;
        class109.field1612.field4113 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class113.field1661; var6++) {
            class389 var9 = class347.method2222(var6, 18682);
            if ((!arg2 || var9.field5698) && var9.field5711 == -1 && var9.field5654 == -1 && var9.field5651 == 0 && var9.field5722.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class222.field2981 = -1;
                    class434.field6239 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class434.field6239 = var4;
        class298.field4125 = 0;
        class222.field2981 = var5;
        String[] var7 = new String[class222.field2981];
        for (int var8 = 0; var8 < class222.field2981; var8++) {
            var7[var8] = class347.method2222(var4[var8], 18682).field5722;
        }
        if (arg0 != -1) {
            field1775 = null;
        }
        class69.method470(89, var7, class434.field6239);
        class109.field1612.method1907(-72);
        class109.field1612.field4113 = 2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[ILaa;II[[BLsm;Lsm;ZII[[B[[B[[B)V", line = 79)
    public static final void method842(int[][] arg0, class281 arg1, int arg2, int arg3, byte[][] arg4, class156 arg5, class156 arg6, boolean arg7, int arg8, int arg9, byte[][] arg10, byte[][] arg11, byte[][] arg12) {
        field1771++;
        if (arg9 != -2509) {
            field1775 = null;
        }
        if (class16.field205 == 0 && !class10.field147) {
            class118.method802((byte) 86, arg2, arg12, arg7, arg0, arg6, arg4, arg11, arg3, arg10, arg8, arg1, arg5);
        } else {
            class31.method236(arg8, arg1, arg11, -31584, arg0, arg3, arg2, arg6, arg4, arg12, arg5, arg10, arg7);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 95)
    public static void method843(int arg0) {
        field1775 = null;
        if (arg0 != -22435) {
            method842((int[][]) null, (class281) null, 0, 126, (byte[][]) null, (class156) null, (class156) null, true, 100, -62, (byte[][]) null, (byte[][]) null, (byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Laa;III)V", line = 111)
    public static final void method844(class281 arg0, int arg1, int arg2, int arg3) {
        field1778++;
        if (arg1 < 0 || arg2 < 0 || class368.field5164 == 0 || class23.field310 == 0) {
            return;
        }
        arg0.method1763(class31.field485, class450.field6530, class368.field5164, class23.field310);
        arg0.method1735(class94.field1405, class359.field5048, class368.field5164, class23.field310);
        class261 var4 = arg0.method1783();
        var4.method887(class235.field3191, class323.field4427, class69.field1067, class23.field314, class286.field3943, class310.field4248);
        arg0.method1724(var4);
        if (class222.field2980 == 0 && class156.field2213 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method1825();
            int var8 = (arg1 - class31.field485) * var7 / class368.field5164;
            int var9 = (arg2 - class450.field6530) * var7 / class23.field310;
            int var10 = arg0.method1792();
            int var11 = (arg1 - class31.field485) * var10 / class368.field5164;
            int var12 = (arg2 - class450.field6530) * var10 / class23.field310;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method889(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method889(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class432.field6220 && class267.field3646 > var22) {
                    int var23 = class265.field3617;
                    if (var23 < 3 && (class221.field2910[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class156.field2213[var23].method278(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = -(-(class307.field4211.method410((byte) 88) * 64) - var19) - 64 >> 7;
                        var6 = var21 + ((class307.field4211.method410((byte) 123) - 1) * 64) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class309.field4235 && (class439.field6373 & 0x40) != 0) {
                    class383 var24 = class315.method2010(class339.field4745, class236.field3214, -27590);
                    if (var24 == null) {
                        class378.method2471(34);
                    } else {
                        class336.method2092(class289.field3993, var6, " ->", 0L, (byte) 66, 3, var5, class25.field359);
                    }
                } else {
                    if (class180.field2521 == 1) {
                        class336.method2092(-1, var6, "", 0L, (byte) 46, 12, var5, class149.field2148);
                    }
                    class46.field726++;
                    class336.method2092(-1, var6, "", 0L, (byte) 91, 11, var5, class207.field2796);
                }
            }
        }
        if (arg3 < 57) {
            field1775 = null;
        }
        class357 var25 = class145.field2112;
        for (class300 var26 = (class300) var25.method2307(false); var26 != null; var26 = (class300) var25.method2311(-5116)) {
            if (var26.method1935(arg1, (byte) -103, arg0, arg2) && class265.field3617 == var26.field4153) {
                if (var26.field4157 instanceof class354) {
                    class354 var27 = (class354) var26.field4157;
                    int var28 = var27.method410((byte) 71);
                    if ((var28 & 0x1) == 0 && (var27.field6197 & 0x7F) == 0 && (var27.field6192 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6197 & 0x7F) == 64 && (var27.field6192 & 0x7F) == 64) {
                        int var29 = var27.field6197 + 64 - (var27.method410((byte) 82) * 64);
                        int var30 = var27.field6192 + 64 - var27.method410((byte) 54) * 64;
                        for (int var31 = 0; var31 < class71.field1096; var31++) {
                            class437 var36 = class445.field6422[class280.field3837[var31]];
                            if (var36 != null && class35.field541 != var36.field898 && var36.field903) {
                                int var37 = var36.field6197 - (var36.field6290.field2958 * 64 - 64);
                                int var38 = var36.field6192 - ((var36.field6290.field2958 - 1) * 64);
                                if (var29 <= var37 && var36.field6290.field2958 <= (var27.method410((byte) 124) - (var37 - var29 >> 7)) && var38 >= var30 && var36.field6290.field2958 <= (var27.method410((byte) 77) - (var38 - var30 >> 7))) {
                                    class61.method406((byte) -127, var36);
                                    var36.field898 = class35.field541;
                                }
                            }
                        }
                        for (int var32 = 0; var32 < class169.field2407; var32++) {
                            class354 var33 = class12.field153[class67.field1055[var32]];
                            if (var33 != null && class35.field541 != var33.field898 && var27 != var33 && var33.field903) {
                                int var34 = var33.field6197 + 64 - (var33.method410((byte) 76) * 64);
                                int var35 = var33.field6192 - ((var33.method410((byte) 111) - 1) * 64);
                                if (var29 <= var34 && var33.method410((byte) 74) <= var27.method410((byte) 37) - (var34 - var29 >> 7) && var30 <= var35 && var33.method410((byte) 55) <= (var27.method410((byte) 111) - (var35 - var30 >> 7))) {
                                    class266.method1649(-18536, var33);
                                    var33.field898 = class35.field541;
                                }
                            }
                        }
                    }
                    if (class35.field541 == var27.field898) {
                        continue;
                    }
                    class266.method1649(-18536, var27);
                    var27.field898 = class35.field541;
                }
                if (var26.field4157 instanceof class437) {
                    class437 var39 = (class437) var26.field4157;
                    if (var39.field6290 != null) {
                        if ((var39.field6290.field2958 & 0x1) == 0 && (var39.field6197 & 0x7F) == 0 && (var39.field6192 & 0x7F) == 0 || (var39.field6290.field2958 & 0x1) == 1 && (var39.field6197 & 0x7F) == 64 && (var39.field6192 & 0x7F) == 64) {
                            int var40 = var39.field6197 + 64 - (var39.field6290.field2958 * 64);
                            int var41 = var39.field6192 - ((var39.field6290.field2958 - 1) * 64);
                            for (int var42 = 0; var42 < class71.field1096; var42++) {
                                class437 var47 = class445.field6422[class280.field3837[var42]];
                                if (var47 != null && class35.field541 != var47.field898 && var39 != var47 && var47.field903) {
                                    int var48 = var47.field6197 - ((var47.field6290.field2958 - 1) * 64);
                                    int var49 = var47.field6192 + 64 - (var47.field6290.field2958 * 64);
                                    if (var48 >= var40 && var39.field6290.field2958 - (var48 - var40 >> 7) >= var47.field6290.field2958 && var41 <= var49 && var47.field6290.field2958 <= var39.field6290.field2958 - (var49 - var41 >> 7)) {
                                        class61.method406((byte) -127, var47);
                                        var47.field898 = class35.field541;
                                    }
                                }
                            }
                            for (int var43 = 0; var43 < class169.field2407; var43++) {
                                class354 var44 = class12.field153[class67.field1055[var43]];
                                if (var44 != null && class35.field541 != var44.field898 && var44.field903) {
                                    int var45 = var44.field6197 - (var44.method410((byte) 114) - 1) * 64;
                                    int var46 = var44.field6192 - ((var44.method410((byte) 70) - 1) * 64);
                                    if (var40 <= var45 && var44.method410((byte) 51) <= var39.field6290.field2958 - (var45 - var40 >> 7) && var46 >= var41 && var44.method410((byte) 104) <= var39.field6290.field2958 - (var46 - var41 >> 7)) {
                                        class266.method1649(-18536, var44);
                                        var44.field898 = class35.field541;
                                    }
                                }
                            }
                        }
                        if (class35.field541 == var39.field898) {
                            continue;
                        }
                        class61.method406((byte) -123, var39);
                        var39.field898 = class35.field541;
                    }
                }
                if (var26.field4157 instanceof class166) {
                    class26 var50 = (class26) class272.field3718.method1412((byte) -54, (long) (var26.field4155 << 14 | var26.field4153 << 28 | var26.field4149));
                    if (var50 != null) {
                        for (class210 var51 = (class210) var50.field423.method1313(-14122); var51 != null; var51 = (class210) var50.field423.method1306(737947202)) {
                            class389 var52 = class347.method2222(var51.field2829, 18682);
                            if (class222.field2980 == 1) {
                                class26.field425++;
                                class336.method2092(class243.field3355, var26.field4155, class265.field3624 + " -> <col=ff9040>" + var52.field5722, (long) var51.field2829, (byte) 59, 35, var26.field4149, class259.field3547);
                            } else if (class309.field4235) {
                                class305 var53 = class25.field400 == -1 ? null : class313.method1983(-119, class25.field400);
                                if ((class439.field6373 & 0x1) != 0 && (var53 == null || var52.method2544(28633, class25.field400, var53.field4191) != var53.field4191)) {
                                    class336.method2092(class289.field3993, var26.field4155, class125.field1770 + " -> <col=ff9040>" + var52.field5722, (long) var51.field2829, (byte) 59, 44, var26.field4149, class25.field359);
                                    class432.field6224++;
                                }
                            } else {
                                String[] var54 = var52.field5720;
                                for (int var55 = 4; var55 >= 0; var55--) {
                                    if (var54 != null && var54[var55] != null) {
                                        byte var56 = 0;
                                        if (var55 == 0) {
                                            var56 = 34;
                                        }
                                        int var57 = class3.field36;
                                        if (var55 == 1) {
                                            var56 = 10;
                                        }
                                        if (var55 == 2) {
                                            var56 = 4;
                                        }
                                        if (var55 == 3) {
                                            var56 = 47;
                                        }
                                        if (var52.field5657 == var55) {
                                            var57 = var52.field5695;
                                        }
                                        if (var55 == 4) {
                                            var56 = 42;
                                        }
                                        if (var52.field5693 == var55) {
                                            var57 = var52.field5719;
                                        }
                                        class389.field5664++;
                                        class336.method2092(var57, var26.field4155, "<col=ff9040>" + var52.field5722, (long) var51.field2829, (byte) 125, var56, var26.field4149, var54[var55]);
                                    }
                                }
                                class215.field2863++;
                                class336.method2092(class71.field1097, var26.field4155, "<col=ff9040>" + var52.field5722, (long) var51.field2829, (byte) 63, 1002, var26.field4149, class190.field2646);
                            }
                        }
                    }
                }
                if (var26.field4157 instanceof class161) {
                    class161 var58 = (class161) var26.field4157;
                    class369 var59 = class310.method1961(var58.method126(-13482), (byte) 35);
                    if (var59.field5202 != null) {
                        var59 = var59.method2373((byte) 0);
                    }
                    if (var59 != null) {
                        if (class222.field2980 == 1) {
                            class16.field203++;
                            class336.method2092(class243.field3355, var26.field4155, class265.field3624 + " -> <col=00ffff>" + var59.field5180, class430.method2705(119, var26.field4149, var26.field4155, var58), (byte) 80, 23, var26.field4149, class259.field3547);
                        } else if (class309.field4235) {
                            class305 var64 = class25.field400 == -1 ? null : class313.method1983(-117, class25.field400);
                            if ((class439.field6373 & 0x4) != 0 && (var64 == null || var59.method2364(class25.field400, var64.field4191, true) != var64.field4191)) {
                                class336.method2092(class289.field3993, var26.field4155, class125.field1770 + " -> <col=00ffff>" + var59.field5180, class430.method2705(119, var26.field4149, var26.field4155, var58), (byte) 85, 29, var26.field4149, class25.field359);
                                class181.field2536++;
                            }
                        } else {
                            String[] var60 = var59.field5210;
                            if (var60 != null) {
                                for (int var61 = 4; var61 >= 0; var61--) {
                                    if (var60[var61] != null) {
                                        short var62 = 0;
                                        if (var61 == 0) {
                                            var62 = 51;
                                        }
                                        int var63 = class3.field36;
                                        if (var61 == 1) {
                                            var62 = 6;
                                        }
                                        if (var61 == 2) {
                                            var62 = 60;
                                        }
                                        if (var61 == 3) {
                                            var62 = 48;
                                        }
                                        if (var59.field5247 == var61) {
                                            var63 = var59.field5237;
                                        }
                                        if (var61 == 4) {
                                            var62 = 1006;
                                        }
                                        if (var59.field5241 == var61) {
                                            var63 = var59.field5244;
                                        }
                                        class336.method2092(var63, var26.field4155, "<col=00ffff>" + var59.field5180, class430.method2705(123, var26.field4149, var26.field4155, var58), (byte) 115, var62, var26.field4149, var60[var61]);
                                        class244.field3370++;
                                    }
                                }
                            }
                            class324.field4434++;
                            class336.method2092(class71.field1097, var26.field4155, "<col=00ffff>" + var59.field5180, (long) var59.field5204, (byte) 104, 1008, var26.field4149, class190.field2646);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 572)
    public class126(Throwable arg0, String arg1) {
        this.field1774 = arg1;
        this.field1772 = arg0;
    }
}
