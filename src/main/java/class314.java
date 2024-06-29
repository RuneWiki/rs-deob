import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class314 implements Runnable {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[Lwn;")
    public volatile class330[] field4867 = new class330[2];

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Z")
    public volatile boolean field4876 = false;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
    public volatile boolean field4868 = false;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Z")
    public static boolean field4871 = true;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
    public static boolean field4873 = false;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field4874 = -1;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4864 = -1;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4875 = new String[200];

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lvl;")
    public class6 field4866;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Ljd;")
    public static class95 field4872;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([Lf;ZI[[[I)V", line = 10)
    public static final void method2145(class345[] arg0, boolean arg1, int arg2, int[][][] arg3) {
        byte var4;
        if (arg1) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        field4869++;
        if (!arg1) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class324.field5005[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class324.field5005[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method2389((byte) -102, var7, var6);
                            }
                        }
                    }
                }
            }
            class245.field3716 += (int) (Math.random() * 5.0D) - 2;
            class219.field3353 += (int) (Math.random() * 5.0D) - 2;
            if (class245.field3716 < -16) {
                class245.field3716 = -16;
            }
            if (class245.field3716 > 16) {
                class245.field3716 = 16;
            }
            if (class219.field3353 < -8) {
                class219.field3353 = -8;
            }
            if (class219.field3353 > 8) {
                class219.field3353 = 8;
            }
        }
        if (arg2 <= 87) {
            field4864 = 104;
        }
        int var9 = class245.field3716 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        int var12 = class219.field3353 >> 2 << 10;
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class13.field179[var13];
            if (!class73.field1058) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        int var19 = class203.field3111[var13][var18 + 1][var17] - class203.field3111[var13][var18 - 1][var17];
                        int var20 = class203.field3111[var13][var18][var17 + 1] - class203.field3111[var13][var18][var17 - 1];
                        byte var21 = 74;
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + (var19 * var19 + 65536)));
                        int var23 = (var19 << 8) / var22;
                        int var24 = (var20 << 8) / var22;
                        int var25 = (var14[var18][var17] >> 1) + ((var14[var18 - 1][var17] >> 2) + (var14[var18][var17 - 1] >> 2) + (var14[var18 + 1][var17] >> 3) + (var14[var18][var17 - -1] >> 3));
                        int var26 = -65536 / var22;
                        int var27 = (var26 * -10 + var23 * -50 + var24 * -50) / var16 + var21;
                        var10[var18][var17] = var27 - var25;
                    }
                }
            } else if (class309.field4812) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        byte var46 = 74;
                        int var47 = (var14[var45 + 1][var44] >> 3) + (var14[var45][var44 + 1] >> 3) + (var14[var45][var44 + -1] >> 2) + (var14[var45 - 1][var44] >> 2) + (var14[var45][var44] >> 1);
                        var10[var45][var44] = var46 - var47;
                    }
                }
            } else {
                int var28 = (int) class179.field2848[0];
                int var29 = (int) class179.field2848[1];
                int var30 = (int) class179.field2848[2];
                int var31 = (int) Math.sqrt((double) (var28 * var28 - (-(var29 * var29) - var30 * var30)));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        byte var35 = 96;
                        int var36 = class203.field3111[var13][var34 + 1][var33] - class203.field3111[var13][var34 - 1][var33];
                        int var37 = class203.field3111[var13][var34][var33 + 1] - class203.field3111[var13][var34][var33 - 1];
                        int var38 = (int) Math.sqrt((double) (var36 * var36 + (var37 * var37) + 65536));
                        int var39 = (var36 << 8) / var38;
                        int var40 = -65536 / var38;
                        int var41 = (var37 << 8) / var38;
                        int var42 = (var28 * var39 + (var29 * var40 + (var30 * var41))) / var32 + var35;
                        int var43 = (var14[var34][var33 + 1] >> 3) + (var14[var34 - 1][var33] >> 2) + (var14[var34][var33] >> 1) + (var14[var34][var33 + -1] >> 2) + (var14[var34 - -1][var33] >> 3);
                        var10[var34][var33] = var42 - ((int) ((float) var43 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class43.field615[var48] = 0;
                class181.field2870[var48] = 0;
                class13.field165[var48] = 0;
                class291.field4474[var48] = 0;
                class231.field3516[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class217.field3325[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class47 var53 = class260.method1830(var52 - 1, 262144);
                            class43.field615[var50] += var53.field645;
                            class181.field2870[var50] += var53.field643;
                            class13.field165[var50] += var53.field653;
                            class291.field4474[var50] += var53.field648;
                            var10002 = class231.field3516[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class217.field3325[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class47 var56 = class260.method1830(var55 - 1, 262144);
                            class43.field615[var50] -= var56.field645;
                            class181.field2870[var50] -= var56.field643;
                            class13.field165[var50] -= var56.field653;
                            class291.field4474[var50] -= var56.field648;
                            var10002 = class231.field3516[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        if (var63 < 104) {
                            var59 += class231.field3516[var63];
                            var58 += class43.field615[var63];
                            var57 += class181.field2870[var63];
                            var61 += class13.field165[var63];
                            var60 += class291.field4474[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var58 -= class43.field615[var64];
                            var59 -= class231.field3516[var64];
                            var61 -= class13.field165[var64];
                            var60 -= class291.field4474[var64];
                            var57 -= class181.field2870[var64];
                        }
                        if (var62 >= 0 && var59 > 0) {
                            var11[var49][var62] = class298.method2054(var58 * 256 / var60, (byte) 78, var57 / var59, var61 / var59);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label766: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class110.method841((byte) 88) || (class324.field5005[0][var65][var66] & 0x2) != 0 || (class324.field5005[var13][var65][var66] & 0x10) == 0 && class99.method743(var13, var66, 92, var65) == class170.field2749) {
                        if (class174.field2811 > var13) {
                            class174.field2811 = var13;
                        }
                        int var67 = class217.field3325[var13][var65][var66] & 0xFF;
                        int var68 = class183.field2900[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class203.field3111[var13][var65][var66];
                            int var70 = class203.field3111[var13][var65 + 1][var66];
                            int var71 = class203.field3111[var13][var65 + 1][var66 + 1];
                            int var72 = class203.field3111[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class189.field2970[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class106.method792(var68 - 1, 0).field4613) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class283.field4396[var13][var65][var66] = class261.method1835(class283.field4396[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = -1;
                                var75 = 0;
                            } else {
                                var74 = var11[var65][var66];
                                int var76 = (var74 & 0x7F) + var9;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var12 + var74 & 0xFC00) + var76 + (var74 & 0x380);
                                var75 = class164.field2659[class56.method402(96, (byte) 108, var77)];
                            }
                            int var78 = var10[var65 + 1][var66 + 1];
                            int var79 = var10[var65][var66];
                            int var80 = var10[var65][var66 + 1];
                            int var81 = var10[var65 + 1][var66];
                            if (var68 == 0) {
                                class48.method366(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class56.method402(var79, (byte) 108, var74), class56.method402(var81, (byte) 108, var74), class56.method402(var78, (byte) 108, var74), class56.method402(var80, (byte) 108, var74), 0, 0, 0, 0, var75, 0);
                                if (class73.field1058 && var13 > 0 && var74 != -1 && class260.method1830(var67 - 1, 262144).field644) {
                                    class125.method939(0, 0, true, false, var65, var66, var69 - class203.field3111[0][var65][var66], var70 - class203.field3111[0][var65 + 1][var66], var71 - class203.field3111[0][var65 + 1][var66 + 1], -class203.field3111[0][var65][var66 + 1] + var72);
                                }
                                if (class73.field1058 && !arg1 && class78.field1137 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class183.field2900[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class299 var85 = class106.method792(var84 - 1, 0);
                                                    if (var85.field4593 != -1 && class7.method74(class164.field2662.method667(18, var85.field4593), true)) {
                                                        class78.field1137[var65][var66] = (var85.field4606 << 24) + var85.field4601;
                                                        continue label766;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class189.field2970[var13][var65][var66] + 1;
                                byte var87 = class333.field5199[var13][var65][var66];
                                class299 var88 = class106.method792(var68 - 1, 0);
                                if (class73.field1058 && !arg1 && class78.field1137 != null && var13 == 0) {
                                    if (var88.field4593 != -1 && class7.method74(class164.field2662.method667(-128, var88.field4593), true)) {
                                        class78.field1137[var65][var66] = (var88.field4606 << 24) + var88.field4601;
                                    } else {
                                        label747: for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class183.field2900[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class299 var92 = class106.method792(var91 - 1, 0);
                                                        if (var92.field4593 != -1 && class7.method74(class164.field2662.method667(-121, var92.field4593), true)) {
                                                            class78.field1137[var65][var66] = (var92.field4606 << 24) + var92.field4601;
                                                            break label747;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field4593;
                                if (var93 >= 0 && !class164.field2662.method675(255, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = class164.field2659[class273.method1903(96, -2, class164.field2662.method672(-28889, var93))];
                                    var95 = -1;
                                } else if (var88.field4611 == -1) {
                                    var95 = -2;
                                    var94 = 0;
                                } else {
                                    var95 = var88.field4611;
                                    int var96 = (var95 & 0x7F) + var9;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var12 + var95 & 0xFC00) + (var95 & 0x380) + var96;
                                    var94 = class164.field2659[class273.method1903(96, -2, var97)];
                                }
                                if (var88.field4595 >= 0) {
                                    int var98 = var88.field4595;
                                    int var99 = (var98 & 0x7F) + var9;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var98 & 0x380) + (var12 + var98 & 0xFC00) + var99;
                                    var94 = class164.field2659[class273.method1903(96, -2, var100)];
                                }
                                class48.method366(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class56.method402(var79, (byte) 108, var74), class56.method402(var81, (byte) 108, var74), class56.method402(var78, (byte) 108, var74), class56.method402(var80, (byte) 108, var74), class273.method1903(var79, -2, var95), class273.method1903(var81, -2, var95), class273.method1903(var78, -2, var95), class273.method1903(var80, -2, var95), var75, var94);
                                if (class73.field1058 && var13 > 0) {
                                    class125.method939(var86, var87, var95 == -2 || !var88.field4598, var74 == -1 || !class260.method1830(var67 - 1, 262144).field644, var65, var66, var69 - class203.field3111[0][var65][var66], -class203.field3111[0][var65 + 1][var66] + var70, var71 - class203.field3111[0][var65 + 1][var66 + 1], var72 - class203.field3111[0][var65][var66 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class73.field1058) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class203.field3111[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class58[] var110 = class144.method1100(class324.field5005, var102, class78.field1137, var101, class79.field1151[0], class183.field2900[var13], class189.field2970[var13], var11, var13, var10, (byte) 102, arg3, class333.field5199[var13], class203.field3111[var13], var103, class217.field3325[var13]);
                            class95.method708(var13, var110);
                            break;
                        }
                        class58[] var111 = class144.method1100(class324.field5005, var102, (int[][]) null, var101, (int[][]) null, class183.field2900[var13], class189.field2970[var13], var11, var13, var10, (byte) -107, arg3, class333.field5199[var13], class203.field3111[var13], var103, class217.field3325[var13]);
                        class58[] var112 = class188.method1388(class183.field2900[var13], class333.field5199[var13], var101, 57, class203.field3111[var13], class189.field2970[var13], var103, var102, var13, class324.field5005, var10, class217.field3325[var13]);
                        class58[] var113 = new class58[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var115 + var111.length] = var112[var115];
                        }
                        class95.method708(var13, var113);
                        class279.method1933(class333.field5199[var13], class189.field2970[var13], var13, var103, class217.field3325[var13], var102, class203.field3111[var13], class315.field4879, class315.field4885, 89, var101, class183.field2900[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + var107 * var107 + 65536));
                        var102[var106][var105] = (float) var108 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class217.field3325[var13] = (byte[][]) null;
            class183.field2900[var13] = (byte[][]) null;
            class189.field2970[var13] = (byte[][]) null;
            class333.field5199[var13] = (byte[][]) null;
            class13.field179[var13] = (byte[][]) null;
        }
        class216.method1546(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class324.field5005[1][var116][var117] & 0x2) == 2) {
                    class201.method1454(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class283.field4396[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 < 104 && (class283.field4396[var118][var120][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122 = var118;
                        int var123 = var118;
                        int var124;
                        for (var124 = var119; var124 > 0 && (class283.field4396[var118][var120][var124 - 1] & 0x1) != 0; var124--) {
                        }
                        label449: while (var123 > 0) {
                            for (int var125 = var124; var125 <= var121; var125++) {
                                if ((class283.field4396[var123 - 1][var120][var125] & 0x1) == 0) {
                                    break label449;
                                }
                            }
                            var123--;
                        }
                        label438: while (var122 < 3) {
                            for (int var126 = var124; var126 <= var121; var126++) {
                                if ((class283.field4396[var122 + 1][var120][var126] & 0x1) == 0) {
                                    break label438;
                                }
                            }
                            var122++;
                        }
                        int var127 = (var122 + 1 - var123) * (var121 + 1 - var124);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class203.field3111[var123][var120][var124];
                            int var130 = class203.field3111[var122][var120][var124] - var128;
                            class180.method1347(1, var120 * 128, var120 * 128, var124 * 128, var121 * 128 + 128, var130, var129);
                            for (int var131 = var123; var131 <= var122; var131++) {
                                for (int var132 = var124; var132 <= var121; var132++) {
                                    class283.field4396[var131][var120][var132] = class149.method1117(class283.field4396[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class283.field4396[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 > 0 && (class283.field4396[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        while (var134 < 104 && (class283.field4396[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var135 = var118;
                        int var136 = var118;
                        label503: while (var135 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class283.field4396[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label503;
                                }
                            }
                            var135--;
                        }
                        label492: while (var136 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class283.field4396[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label492;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var134 + 1 - var133) * (var136 + 1 - var135);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class203.field3111[var136][var133][var119] - var140;
                            int var142 = class203.field3111[var135][var133][var119];
                            class180.method1347(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class283.field4396[var143][var144][var119] = class149.method1117(class283.field4396[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class283.field4396[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class283.field4396[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class283.field4396[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label557: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class283.field4396[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label557;
                                }
                            }
                            var145--;
                        }
                        label546: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class283.field4396[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label546;
                                }
                            }
                            var146++;
                        }
                        if ((var146 + 1 - var145) * (var148 + 1 - var147) >= 4) {
                            int var151 = class203.field3111[var118][var145][var147];
                            class180.method1347(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class283.field4396[var118][var152][var153] = class149.method1117(class283.field4396[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "run", descriptor = "()V", line = 1003)
    public final void run() {
        this.field4868 = true;
        field4870++;
        try {
            while (!this.field4876) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class330 var2 = this.field4867[var1];
                    if (var2 != null) {
                        var2.method2306(true);
                    }
                }
                class324.method2252(-24861, 10L);
                class69.method491((Object) null, this.field4866, 0);
            }
        } catch (Exception var7) {
            class189.method1401(true, var7, (String) null);
        } finally {
            this.field4868 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IC)Z", line = 1037)
    public static final boolean method2146(int arg0, char arg1) {
        if (arg0 == -50) {
            field4865++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 1059)
    public static void method2147(byte arg0) {
        field4875 = null;
        field4872 = null;
        if (arg0 != -68) {
            method2145((class345[]) null, false, -86, (int[][][]) ((int[][][]) null));
        }
    }
}
