import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class296 extends class252 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Llc;")
    public static class270 field4754;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Z")
    public static boolean field4757;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILhc;)Lem;")
    public static final class87 method2013(int arg0, class53 arg1) {
        field4755++;
        arg1.method366(arg0 - 16509);
        if (arg0 != 4) {
            return null;
        }
        int var2 = arg1.method366(-16505);
        class87 var3 = class45.method270((byte) -12, var2);
        var3.field1392 = arg1.method366(arg0 - 16509);
        int var4 = arg1.method366(-16505);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method366(-16505);
            var3.method40(arg1, var6, 25645);
        }
        var3.method136(0);
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public static void method2014(byte arg0) {
        field4754 = null;
        if (arg0 < 86) {
            field4757 = true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
    public static final int method2015(boolean arg0, int arg1) {
        field4756++;
        return arg0 ? arg1 >>> 8 : 23;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lii;ZI[[[I)V")
    public static final void method2016(class228[] arg0, boolean arg1, int arg2, int[][][] arg3) {
        field4759++;
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class253.field3806[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class253.field3806[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method1577(var5, var6, (byte) 89);
                            }
                        }
                    }
                }
            }
            class240.field3516 += (int) (Math.random() * 5.0D) - 2;
            class23.field249 += (int) (Math.random() * 5.0D) - 2;
            if (class23.field249 < -8) {
                class23.field249 = -8;
            }
            if (class23.field249 > 8) {
                class23.field249 = 8;
            }
            if (class240.field3516 < -16) {
                class240.field3516 = -16;
            }
            if (class240.field3516 > 16) {
                class240.field3516 = 16;
            }
        }
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class240.field3516 >> 1;
        int[][] var10 = new int[104][104];
        int var11 = class23.field249 >> 2 << 10;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class192.field2847[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class103.field1792[var13][var101 + 1][var55] - class103.field1792[var13][var101 - 1][var55];
                    byte var103 = 74;
                    int var104 = class103.field1792[var13][var101][var55 + 1] - class103.field1792[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var102 * var102 + (var104 * var104) + 65536));
                    int var106 = -65536 / var105;
                    int var107 = (var104 << 8) / var105;
                    int var108 = (var102 << 8) / var105;
                    int var109 = (var107 * -50 + var106 * -10 + var108 * -50) / var54 + var103;
                    int var110 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55] >> 1) + (var52[var101][var55 + -1] >> 2) + (var52[var101 + -1][var55] >> 2) + (var52[var101 + 1][var55] >> 3);
                    var12[var101][var55] = var109 - var110;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class126.field2128[var56] = 0;
                class261.field4034[var56] = 0;
                class297.field4770[var56] = 0;
                class36.field459[var56] = 0;
                class210.field3108[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class227.field3335[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class269 var97 = class14.method98(-32, var96 - 1);
                            class126.field2128[var86] += var97.field4322;
                            class261.field4034[var86] += var97.field4317;
                            class297.field4770[var86] += var97.field4316;
                            class36.field459[var86] += var97.field4320;
                            var10002 = class210.field3108[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class227.field3335[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class269 var100 = class14.method98(-32, var99 - 1);
                            class126.field2128[var86] -= var100.field4322;
                            class261.field4034[var86] -= var100.field4317;
                            class297.field4770[var86] -= var100.field4316;
                            class36.field459[var86] -= var100.field4320;
                            var10002 = class210.field3108[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var89 += class297.field4770[var93];
                            var88 += class261.field4034[var93];
                            var90 += class36.field459[var93];
                            var91 += class210.field3108[var93];
                            var87 += class126.field2128[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var91 -= class210.field3108[var94];
                            var89 -= class297.field4770[var94];
                            var87 -= class126.field2128[var94];
                            var90 -= class36.field459[var94];
                            var88 -= class261.field4034[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var10[var57][var92] = class246.method1695(var88 / var91, var89 / var91, -123, var87 * 256 / var90);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg1 || class273.method1903(arg2 + 99) || (class253.field3806[0][var58][var59] & 0x2) != 0 || (class253.field3806[var13][var58][var59] & 0x10) == 0 && class170.method1209(arg2 + 19, var59, var58, var13) == class280.field4510) {
                        if (class259.field4005 > var13) {
                            class259.field4005 = var13;
                        }
                        int var60 = class227.field3335[var13][var58][var59] & 0xFF;
                        int var61 = class243.field3584[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class103.field1792[var13][var58][var59];
                            int var63 = class103.field1792[var13][var58 + 1][var59 + 1];
                            int var64 = class103.field1792[var13][var58 + 1][var59];
                            int var65 = class103.field1792[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class219.field3202[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class155.method1138((byte) -92, var61 - 1).field4961) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var64 && var62 == var63 && var62 == var65) {
                                    class252.field3802[var13][var58][var59] = class200.method1408(class252.field3802[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (var60 > 0) {
                                var67 = var10[var58][var59];
                                int var68 = (var67 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var67 + var11 & 0xFC00) - (-(var67 & 0x380) - var68);
                                var70 = class244.field3595[class292.method1988(var69, 96, arg2 ^ 0xFFFFFF80)];
                            } else {
                                var70 = 0;
                                var67 = -1;
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59];
                            int var73 = var12[var58 + 1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 == 0) {
                                class255.method1755(var13, var58, var59, 0, 0, -1, var62, var64, var63, var65, class292.method1988(var67, var71, arg2 - 128), class292.method1988(var67, var72, arg2 - 128), class292.method1988(var67, var73, arg2 ^ 0xFFFFFF80), class292.method1988(var67, var74, -127), 0, 0, 0, 0, var70, 0);
                            } else {
                                byte var75 = class263.field4208[var13][var58][var59];
                                int var76 = class219.field3202[var13][var58][var59] + 1;
                                class308 var77 = class155.method1138((byte) -78, var61 - 1);
                                int var78 = var77.field4955;
                                if (var78 >= 0 && !class244.field3600.method532(var78, 97)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var80 = -1;
                                    var79 = class244.field3595[class236.method1625(96, arg2 + 326386214, class244.field3600.method531(var78, -8362))];
                                } else if (var77.field4962 == -1) {
                                    var79 = 0;
                                    var80 = -2;
                                } else {
                                    var80 = var77.field4962;
                                    int var81 = (var80 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var11 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class244.field3595[class236.method1625(96, 326386215, var82)];
                                }
                                if (var77.field4965 >= 0) {
                                    int var83 = var77.field4965;
                                    int var84 = (var83 & 0x7F) + var9;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var11 + var83 & 0xFC00) - (-(var83 & 0x380) - var84);
                                    var79 = class244.field3595[class236.method1625(96, 326386215, var85)];
                                }
                                class255.method1755(var13, var58, var59, var76, var75, var78, var62, var64, var63, var65, class292.method1988(var67, var71, -127), class292.method1988(var67, var72, -127), class292.method1988(var67, var73, -127), class292.method1988(var67, var74, -127), class236.method1625(var71, 326386215, var80), class236.method1625(var72, 326386215, var80), class236.method1625(var73, arg2 + 326386214, var80), class236.method1625(var74, 326386215, var80), var70, var79);
                            }
                        }
                    }
                }
            }
            class227.field3335[var13] = null;
            class243.field3584[var13] = null;
            class219.field3202[var13] = null;
            class263.field4208[var13] = null;
            class192.field2847[var13] = null;
        }
        if (arg2 != 1) {
            method2017(-15);
        }
        class120.method891(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((class253.field3806[1][var14][var51] & 0x2) == 2) {
                    class305.method2073(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class252.field3802[var15][var17][var16] & 0x1) != 0) {
                        int var18 = var16;
                        int var19 = var15;
                        while (var18 < 104 && (class252.field3802[var15][var17][var18 + 1] & 0x1) != 0) {
                            var18++;
                        }
                        int var20 = var15;
                        int var21;
                        for (var21 = var16; var21 > 0 && (class252.field3802[var15][var17][var21 - 1] & 0x1) != 0; var21--) {
                        }
                        label353: while (var19 > 0) {
                            for (int var22 = var21; var22 <= var18; var22++) {
                                if ((class252.field3802[var19 - 1][var17][var22] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var19--;
                        }
                        label342: while (var20 < 3) {
                            for (int var23 = var21; var23 <= var18; var23++) {
                                if ((class252.field3802[var20 + 1][var17][var23] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var20++;
                        }
                        int var24 = (var20 + 1 - var19) * (var18 + 1 - var21);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class103.field1792[var19][var17][var21];
                            int var27 = class103.field1792[var20][var17][var21] - var25;
                            class218.method1524(1, var17 * 128, var17 * 128, var21 * 128, var18 * 128 + 128, var27, var26);
                            for (int var28 = var19; var28 <= var20; var28++) {
                                for (int var29 = var21; var29 <= var18; var29++) {
                                    class252.field3802[var28][var17][var29] = class301.method2056(class252.field3802[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class252.field3802[var15][var17][var16] & 0x2) != 0) {
                        int var30 = var17;
                        int var31;
                        for (var31 = var17; var31 < 104 && (class252.field3802[var15][var31 + 1][var16] & 0x2) != 0; var31++) {
                        }
                        while (var30 > 0 && (class252.field3802[var15][var30 - 1][var16] & 0x2) != 0) {
                            var30--;
                        }
                        int var32;
                        label408: for (var32 = var15; var32 > 0; var32--) {
                            for (int var33 = var30; var33 <= var31; var33++) {
                                if ((class252.field3802[var32 - 1][var33][var16] & 0x2) == 0) {
                                    break label408;
                                }
                            }
                        }
                        int var34;
                        label396: for (var34 = var15; var34 < 3; var34++) {
                            for (int var35 = var30; var35 <= var31; var35++) {
                                if ((class252.field3802[var34 + 1][var35][var16] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                        }
                        int var36 = (var34 + 1 - var32) * (var31 + 1 - var30);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class103.field1792[var34][var30][var16] - var37;
                            int var39 = class103.field1792[var32][var30][var16];
                            class218.method1524(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var32; var40 <= var34; var40++) {
                                for (int var41 = var30; var41 <= var31; var41++) {
                                    class252.field3802[var40][var41][var16] = class301.method2056(class252.field3802[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class252.field3802[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44;
                        for (var44 = var16; var44 > 0 && (class252.field3802[var15][var17][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        int var45;
                        for (var45 = var16; var45 < 104 && (class252.field3802[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        label462: while (var43 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class252.field3802[var15][var43 - 1][var46] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var43--;
                        }
                        label451: while (var42 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class252.field3802[var15][var42 + 1][var47] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var42++;
                        }
                        if (((var42 + 1 - var43) * (var45 + 1 - var44)) >= 4) {
                            int var48 = class103.field1792[var15][var43][var44];
                            class218.method1524(4, var43 * 128, var42 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var43; var49 <= var42; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class252.field3802[var15][var49][var50] = class301.method2056(class252.field3802[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method2017(int arg0) {
        field4758++;
        if (arg0 != -32092) {
            field4757 = false;
        }
        int[] var1 = new int[class32.field402];
        int var2 = 0;
        for (int var3 = 0; var3 < class32.field402; var3++) {
            class31 var5 = class12.method88(var3, 27838);
            if (var5.field327 >= 0 || var5.field396 >= 0) {
                var1[var2++] = var3;
            }
        }
        class133.field2189 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class133.field2189[var4] = var1[var4];
        }
    }
}
