import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class356 extends class499 {

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
    private int[] field4805;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "[I")
    private int[] field4807;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "Lqk;")
    private class14 field4812;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "Lqk;")
    private class14 field4814;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "Lqk;")
    private class14 field4811;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[Lqk;")
    private class14[] field4803;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4806;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lpc;Lm;I)Z")
    public final boolean method2081(class473 arg0, class126 arg1, int arg2) {
        if (arg2 >= -100) {
            return false;
        }
        field4802++;
        if (class148.field2100 >= 0) {
            for (int var4 = 0; var4 < this.field4807.length; var4++) {
                if (!arg0.method2723(this.field4807[var4], class148.field2100, 0)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4807.length; var5++) {
                if (!arg0.method2721(this.field4807[var5], (byte) 116)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4805.length; var6++) {
            if (!arg1.method680(-16576, this.field4805[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method2082(int arg0) {
        field4806 = null;
        if (arg0 >= -1) {
            field4806 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
    public static final void method2083(int arg0) {
        field4813++;
        for (class376 var1 = (class376) class373.field5031.method1672((byte) -119); var1 != null; var1 = (class376) class373.field5031.method1668(-1)) {
            class139 var2 = var1.field5099;
            if (class411.field5656 != var2.field573 || class31.field516 > var2.field2018) {
                var1.method300(false);
                var2.method987((byte) -56);
            } else if (class31.field516 >= var2.field2031) {
                if (var2.field1997 > 0) {
                    class117 var3 = class291.field3822[var2.field1997 - 1];
                    if (var3 != null && var3.field584 >= 0 && var3.field584 < class12.field251 * 128 && var3.field574 >= 0 && var3.field574 < class289.field3782 * 128) {
                        var2.method988(class31.field516, class210.method1330(var2.field573, (byte) -40, var3.field584, var3.field574) - var2.field2030, 0, var3.field574, var3.field584);
                    }
                }
                if (var2.field1997 < 0) {
                    int var4 = -var2.field1997 - 1;
                    class515 var5;
                    if (class391.field5305 == var4) {
                        var5 = class385.field5232;
                    } else {
                        var5 = class499.field6901[var4];
                    }
                    if (var5 != null && var5.field584 >= 0 && var5.field584 < class12.field251 * 128 && var5.field574 >= 0 && var5.field574 < (class289.field3782 * 128)) {
                        var2.method988(class31.field516, class210.method1330(var2.field573, (byte) -123, var5.field584, var5.field574) - var2.field2030, 0, var5.field574, var5.field584);
                    }
                }
                var2.method990(class128.field1871, (byte) 0);
                class48.method357(var2, true);
            }
        }
        if (arg0 != 0) {
            field4806 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2084(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4810++;
        if (arg1 != -8) {
            field4806 = null;
        }
        int var7 = class461.field6368;
        int[] var8 = class461.field6370;
        class120.field1746 = 0;
        for (int var9 = 0; var9 < class60.field942 + var7; var9++) {
            class506 var32 = null;
            class455 var33;
            if (var9 >= var7) {
                var33 = class291.field3822[class162.field2369[var9 - var7]];
                var32 = ((class117) var33).field1661;
                if (var32.field6971 != null) {
                    var32 = var32.method2885(arg1 ^ 0xFFFFFFF9, class301.field3980);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class499.field6901[var8[var9]];
            }
            if (var33.field6187 >= 0 && (class33.field531 == var33.field6190 || class385.field5232.field573 == var33.field573)) {
                class504.method2877(arg2 >> 1, var33, arg6 >> 1, arg3, arg4, var33.method799(-1), false);
                if (class80.field1181[0] >= 0) {
                    if (var33.field6195 != null && (var7 <= var9 || class58.field913 == 0 || class58.field913 == 3 || class58.field913 == 1 && class363.method2120(-18228, ((class515) var33).field7638)) && class31.field519 > class120.field1746) {
                        class31.field510[class120.field1746] = class173.field2525.method2455((byte) 117, var33.field6195) / 2;
                        class31.field512[class120.field1746] = class80.field1181[0];
                        class31.field520[class120.field1746] = class80.field1181[1];
                        class31.field514[class120.field1746] = var33.field6176;
                        class31.field509[class120.field1746] = var33.field6206;
                        class31.field517[class120.field1746] = var33.field6245;
                        class31.field515[class120.field1746] = var33.field6195;
                        class120.field1746++;
                    }
                    int var34 = arg0 + class80.field1181[1];
                    int var45;
                    if (var33.field6200 || class31.field516 >= var33.field6165) {
                        var45 = var34 - Math.max(class173.field2525.field5803, class503.field6935[0].method161());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field7027;
                            if (var37 == -1) {
                                var37 = var33.method2600(arg1 ^ 0xFFFFFFD7).field332;
                            }
                        } else {
                            class515 var38 = class499.field6901[var8[var9]];
                            var37 = var33.method2600(90).field332;
                            if (var38.field7639) {
                                var36 = 2;
                            }
                        }
                        class529[] var39 = class503.field6935;
                        if (var37 != -1) {
                            class529[] var40 = (class529[]) class167.field2417.method1456((long) var37, arg1 + 121);
                            if (var40 == null) {
                                class134[] var41 = class134.method937(class71.field1082, var37, 0);
                                if (var41 != null) {
                                    var40 = new class529[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class370.field4984.method596(var41[var42], true);
                                    }
                                    class167.field2417.method1462(var40, (long) var37, arg1 - 114);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class529 var43 = var39[0];
                        class529 var44 = var39[var36];
                        var45 = var34 - Math.max(class173.field2525.field5803, var43.method161());
                        int var46 = class80.field1181[0] + (arg5 - (var43.method154() >> 1));
                        int var47 = var43.method154() * var33.field6241 / 255;
                        if (var33.field6241 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3109(var46, var45);
                        class370.field4984.method590(var46, var45, var46 + var47, var45 + var43.method161());
                        var44.method3109(var46, var45);
                        class370.field4984.method572(arg5, arg0, arg2 + arg5, arg0 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field6200) {
                        if (var33.field6191 > class31.field516) {
                            class529 var48 = class314.field4115[var33.field6243 ? 2 : 0];
                            class529 var49 = class314.field4115[var33.field6243 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class117)) {
                                var51 = var32.field6995;
                                if (var51 == -1) {
                                    var51 = var33.method2600(arg1 + 105).field345;
                                }
                            } else {
                                var51 = var33.method2600(79).field345;
                            }
                            if (var51 != -1) {
                                class529[] var52 = (class529[]) class506.field6965.method1456((long) var51, arg1 ^ 0xFFFFFF8C);
                                if (var52 == null) {
                                    class134[] var53 = class134.method937(class71.field1082, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class529[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class370.field4984.method596(var53[var54], true);
                                        }
                                        class506.field6965.method1462(var52, (long) var51, arg1 - 54);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field6243 ? 2 : 0];
                                    var49 = var52[var33.field6243 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field6191 - class31.field516;
                            int var58;
                            if (var33.field6227 < var55) {
                                int var56 = var55 - var33.field6227;
                                int var57 = var33.field6247 == 0 ? 0 : (var33.field6210 - var56) / var33.field6247 * var33.field6247;
                                var58 = var57 * var48.method154() / var33.field6210;
                            } else {
                                var58 = var48.method154();
                            }
                            int var59 = var48.method161();
                            var45 -= var59;
                            int var60 = arg5 - ((var48.method154() >> 1) - class80.field1181[0]);
                            var48.method3109(var60, var45);
                            class370.field4984.method590(var60, var45, var60 + var58, var45 + var59);
                            var49.method3109(var60, var45);
                            class370.field4984.method572(arg5, arg0, arg2 + arg5, arg0 + arg6);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class515 var62 = (class515) var33;
                            if (var62.field7596 != -1) {
                                var45 -= 25;
                                class141.field2046[var62.field7596].method3109(arg5 + class80.field1181[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field7620 != -1) {
                                var45 -= 25;
                                class494.field6861[var62.field7620].method3109(class80.field1181[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field6994 >= 0 && class494.field6861.length > var32.field6994) {
                            class529 var61 = class494.field6861[var32.field6994];
                            var45 -= 25;
                            var61.method3109(arg5 - ((var61.method154() >> 1) - class80.field1181[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class515) {
                        int var69 = 0;
                        class370[] var70 = class335.field4395;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class370 var75 = var70[var71];
                            if (var75 != null && var75.field4980 == 1 && class162.field2369[var9 - var7] == var75.field4973) {
                                class529 var76 = class44.field662[var75.field4977];
                                if (var69 < var76.method161()) {
                                    var69 = var76.method161();
                                }
                                if (class31.field516 % 20 < 10) {
                                    var76.method3109(class80.field1181[0] + arg5 - 12, var45 + -var76.method161());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class370[] var64 = class335.field4395;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class370 var67 = var64[var65];
                            if (var67 != null && var67.field4980 == 10 && var8[var9] == var67.field4973) {
                                class529 var68 = class44.field662[var67.field4977];
                                if (var63 < var68.method161()) {
                                    var63 = var68.method161();
                                }
                                var68.method3109(arg5 + class80.field1181[0] - 12, var45 - var68.method161());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class31.field516 < var33.field6228[var73]) {
                            int var74 = var33.method799(-1) / 2;
                            class504.method2877(arg2 >> 1, var33, arg6 >> 1, arg3, arg4, var74, false);
                            if (class80.field1181[0] > -1) {
                                if (var73 == 1) {
                                    class80.field1181[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class80.field1181[0] -= 15;
                                    class80.field1181[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class80.field1181[0] += 15;
                                    class80.field1181[1] -= 10;
                                }
                                class378.field5111[var33.field6236[var73]].method3109(arg5 + class80.field1181[0] - 12, arg0 - 12 + class80.field1181[1]);
                                class30.field508.method2812(0, class80.field1181[1] + arg0 + 3, (byte) 83, -1, arg5 - (1 - class80.field1181[0]), Integer.toString(var33.field6174[var73]));
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class391.field5301; var10++) {
            int var28 = client.field2735[var10];
            class455 var29;
            if (var28 < 2048) {
                var29 = class499.field6901[var28];
            } else {
                var29 = class291.field3822[var28 - 2048];
            }
            int var30 = class518.field7664[var10];
            class455 var31;
            if (var30 < 2048) {
                var31 = class499.field6901[var30];
            } else {
                var31 = class291.field3822[var30 - 2048];
            }
            class425.method2449(arg0, arg5, arg3, -14, --var29.field6169, arg4, arg6, arg2, var31, var29);
        }
        int var11 = class173.field2525.field5803 + class173.field2525.field5800 + 2;
        for (int var12 = 0; var12 < class120.field1746; var12++) {
            int var13 = class31.field512[var12];
            int var14 = class31.field520[var12];
            int var15 = class31.field510[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class31.field520[var27] - var11) && class31.field520[var27] + 2 > -var11 + var14 && (var13 - var15) < (class31.field512[var27] + class31.field510[var27]) && var13 + var15 > class31.field512[var27] - class31.field510[var27] && class31.field520[var27] - var11 < var14) {
                        var14 = class31.field520[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class31.field520[var12] = var14;
            String var17 = class31.field515[var12];
            if (class329.field4343 == 0) {
                int var18 = 16776960;
                if (class31.field514[var12] < 6) {
                    var18 = class340.field4448[class31.field514[var12]];
                }
                if (class31.field514[var12] == 6) {
                    var18 = class33.field531 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class31.field514[var12] == 7) {
                    var18 = (class33.field531 % 20) < 10 ? 255 : 65535;
                }
                if (class31.field514[var12] == 8) {
                    var18 = class33.field531 % 20 < 10 ? 45056 : 8454016;
                }
                if (class31.field514[var12] == 9) {
                    int var19 = 150 - class31.field517[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 + 16384000 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class31.field514[var12] == 10) {
                    int var20 = 150 - class31.field517[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 * 327680 - 16384000);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 - ((var20 - 100) * 5) - 32767745;
                    }
                }
                if (class31.field514[var12] == 11) {
                    int var21 = 150 - class31.field517[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class31.field509[var12] == 0) {
                    class219.field2961.method2812(-16777216, arg0 + var14, (byte) 41, var22, arg5 + var13, var17);
                }
                if (class31.field509[var12] == 1) {
                    class219.field2961.method2808(arg0 + var14, -16777216, arg5 + var13, var22, var17, 2, class33.field531);
                }
                if (class31.field509[var12] == 2) {
                    class219.field2961.method2805(arg0 + var14, -16777216, arg1 ^ -3, var22, var17, arg5 + var13, class33.field531);
                }
                if (class31.field509[var12] == 3) {
                    class219.field2961.method2819(var22, var17, 150 - class31.field517[var12], (byte) 109, -16777216, arg0 + var14, arg5 + var13, class33.field531);
                }
                if (class31.field509[var12] == 4) {
                    int var23 = (150 - class31.field517[var12]) * (class173.field2525.method2455((byte) 123, var17) + 100) / 150;
                    class370.field4984.method590(var13 + arg5 - 50, arg0, arg5 + var13 + 50, arg0 + arg6);
                    class219.field2961.method2816(var17, true, arg0 + var14, var22, arg5 + var13 + 50 - var23, -16777216);
                    class370.field4984.method572(arg5, arg0, arg2 + arg5, arg0 + arg6);
                }
                if (class31.field509[var12] == 5) {
                    int var24 = 150 - class31.field517[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class173.field2525.field5803 + class173.field2525.field5800;
                    class370.field4984.method590(arg5, arg0 + var14 - var26 - 1, arg2 + arg5, arg0 + var14 + 5);
                    class219.field2961.method2812(-16777216, arg0 + var14 + var25, (byte) 118, var22, arg5 + var13, var17);
                    class370.field4984.method572(arg5, arg0, arg2 + arg5, arg0 - -arg6);
                }
            } else {
                class219.field2961.method2812(-16777216, arg0 + var14, (byte) 72, -256, arg5 + var13, var17);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lpc;IZLm;IZBD)[I")
    public final int[] method2085(class473 arg0, int arg1, boolean arg2, class126 arg3, int arg4, boolean arg5, byte arg6, double arg7) {
        class101.field1499 = arg0;
        class422.field5779 = arg3;
        field4808++;
        for (int var10 = 0; var10 < this.field4803.length; var10++) {
            this.field4803[var10].method138(arg1, arg4, (byte) -30);
        }
        class522.method3079(arg7, true);
        class522.method3078(arg4, -127, arg1);
        int[] var11 = new int[arg1 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg4 - 1;
        } else {
            var14 = 0;
            var12 = 1;
            var13 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4814.field263) {
                int[] var22 = this.field4814.method140(var16, (byte) -127);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field4814.method141(-30909, var16);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class421.field5767[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class421.field5767[var24];
                int var29 = class421.field5767[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg4 - 1;
                }
            }
        }
        if (arg6 >= -99) {
            field4806 = null;
        }
        for (int var17 = 0; var17 < this.field4803.length; var17++) {
            this.field4803[var17].method146((byte) -45);
        }
        return var11;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class356() {
        this.field4805 = new int[0];
        this.field4807 = new int[0];
        this.field4812 = new class115(0);
        this.field4812.field267 = 1;
        this.field4814 = new class115();
        this.field4814.field267 = 1;
        this.field4811 = new class115();
        this.field4803 = new class14[] { this.field4814, this.field4811, this.field4812 };
        this.field4811.field267 = 1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(DBLpc;IZLm;I)[I")
    public final int[] method2086(double arg0, byte arg1, class473 arg2, int arg3, boolean arg4, class126 arg5, int arg6) {
        class422.field5779 = arg5;
        field4809++;
        class101.field1499 = arg2;
        for (int var9 = 0; var9 < this.field4803.length; var9++) {
            this.field4803[var9].method138(arg3, arg6, (byte) -30);
        }
        class522.method3079(arg0, true);
        class522.method3078(arg6, -121, arg3);
        int[] var10 = new int[arg6 * 4 * arg3];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4814.field263) {
                int[] var18 = this.field4814.method140(var12, (byte) -107);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field4814.method141(-30909, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4811.field263) {
                var19 = this.field4811.method140(var12, (byte) -12);
            } else {
                var19 = this.field4811.method141(-30909, var12)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class421.field5767[var22];
                int var25 = class421.field5767[var21];
                int var26 = class421.field5767[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + ((var27 << 24) - (-(var24 << 8) - var26));
                if (arg4) {
                    var11 += arg6 - 1;
                }
            }
        }
        if (arg1 == 79) {
            for (int var13 = 0; var13 < this.field4803.length; var13++) {
                this.field4803[var13].method146((byte) -115);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZILpc;ILm;I)[F")
    public final float[] method2087(boolean arg0, int arg1, class473 arg2, int arg3, class126 arg4, int arg5) {
        class101.field1499 = arg2;
        class422.field5779 = arg4;
        field4804++;
        for (int var7 = 0; var7 < this.field4803.length; var7++) {
            this.field4803[var7].method138(arg3, arg1, (byte) -30);
        }
        class522.method3078(arg1, arg5 - 110, arg3);
        float[] var8 = new float[arg1 * arg3 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4814.field263) {
                int[] var12 = this.field4814.method140(var10, (byte) -45);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4814.method141(-30909, var10);
                var15 = var16[1];
                var14 = var16[2];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field4811.field263) {
                var17 = this.field4811.method140(var10, (byte) -103);
            } else {
                var17 = this.field4811.method141(-30909, var10)[0];
            }
            int[] var18;
            if (this.field4812.field263) {
                var18 = this.field4812.method140(var10, (byte) -35);
            } else {
                var18 = this.field4812.method141(arg5 - 30908, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4803.length; var11++) {
            this.field4803[var11].method146((byte) -102);
        }
        if (arg5 != -1) {
            this.method2081(null, null, -5);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lmd;)V")
    public class356(class379 arg0) {
        int var2 = arg0.method2238(255);
        int var3 = 0;
        int var4 = 0;
        this.field4803 = new class14[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class14 var16 = class519.method3061(0, arg0);
            if (var16.method136(-128) >= 0) {
                var3++;
            }
            if (var16.method137(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field272.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2238(255);
            }
            this.field4803[var6] = var16;
        }
        this.field4807 = new int[var3];
        int var7 = 0;
        this.field4805 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class14 var11 = this.field4803[var9];
            int var12 = var11.field272.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field272[var13] = this.field4803[var5[var9][var13]];
            }
            int var14 = var11.method136(-123);
            int var15 = var11.method137(-1);
            if (var14 > 0) {
                this.field4807[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4805[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4814 = this.field4803[arg0.method2238(255)];
        this.field4811 = this.field4803[arg0.method2238(255)];
        Object var10 = null;
        this.field4812 = this.field4803[arg0.method2238(255)];
    }
}
