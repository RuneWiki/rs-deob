import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class191 extends class199 {

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    private int field2636 = 10;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    private int field2639 = 2048;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "I")
    private int field2640 = 0;

    @OriginalMember(owner = "client!rm", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field2647 = "Ok";

    @OriginalMember(owner = "client!rm", name = "hb", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!rm", name = "cb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!rm", name = "db", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!rm", name = "fb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "[I")
    private int[] field2642;

    @OriginalMember(owner = "client!rm", name = "eb", descriptor = "[I")
    private int[] field2645;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([Lch;B[[[IZ)V", line = 4)
    public static final void method1384(class8[] arg0, byte arg1, int[][][] arg2, boolean arg3) {
        field2644++;
        byte var4;
        if (arg3) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg3) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class9.field101[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class9.field101[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method57(var6, var7, (byte) -90);
                            }
                        }
                    }
                }
            }
            class30.field354 += (int) (Math.random() * 5.0D) - 2;
            class227.field3268 += (int) (Math.random() * 5.0D) - 2;
            if (class30.field354 < -8) {
                class30.field354 = -8;
            }
            if (class30.field354 > 8) {
                class30.field354 = 8;
            }
            if (class227.field3268 < -16) {
                class227.field3268 = -16;
            }
            if (class227.field3268 > 16) {
                class227.field3268 = 16;
            }
        }
        if (arg1 != 71) {
            return;
        }
        int var9 = class30.field354 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int var11 = class227.field3268 >> 1;
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class169.field2356[var13];
            if (!class47.field623) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class74.field978[var13][var38][var37 + 1] - class74.field978[var13][var38][var37 - 1];
                        int var41 = class74.field978[var13][var38 + 1][var37] - class74.field978[var13][var38 - 1][var37];
                        int var42 = (int) Math.sqrt((double) (var41 * var41 + (var40 * var40) + 65536));
                        int var43 = (var41 << 8) / var42;
                        int var44 = -65536 / var42;
                        int var45 = (var40 << 8) / var42;
                        int var46 = (var44 * -10 + var43 * -50 + var45 * -50) / var36 + var39;
                        int var47 = (var14[var38][var37 - 1] >> 2) + (var14[var38 - 1][var37] >> 2) + ((var14[var38 + 1][var37] >> 3) - (-(var14[var38][var37 + 1] >> 3) - (var14[var38][var37] >> 1)));
                        var12[var38][var37] = var46 - var47;
                    }
                }
            } else if (class67.field856) {
                for (int var15 = 1; var15 < 103; var15++) {
                    for (int var16 = 1; var16 < 103; var16++) {
                        byte var17 = 74;
                        int var18 = (var14[var16][var15 - 1] >> 2) + (var14[var16 + 1][var15] >> 3) + (var14[var16][var15] >> 1) + (var14[var16][var15 + 1] >> 3) + (var14[var16 + -1][var15] >> 2);
                        var12[var16][var15] = var17 - var18;
                    }
                }
            } else {
                int var19 = (int) class41.field515[0];
                int var20 = (int) class41.field515[2];
                int var21 = (int) class41.field515[1];
                int var22 = (int) Math.sqrt((double) (var20 * var20 + var19 * var19 + var21 * var21));
                int var23 = var22 * 1024 >> 8;
                for (int var24 = 1; var24 < 103; var24++) {
                    for (int var25 = 1; var25 < 103; var25++) {
                        byte var26 = 96;
                        int var27 = class74.field978[var13][var25][var24 + 1] - class74.field978[var13][var25][var24 - 1];
                        int var28 = class74.field978[var13][var25 + 1][var24] - class74.field978[var13][var25 - 1][var24];
                        int var29 = (int) Math.sqrt((double) (var28 * var28 + (var27 * var27) + 65536));
                        int var30 = -65536 / var29;
                        int var31 = (var27 << 8) / var29;
                        int var32 = (var28 << 8) / var29;
                        int var33 = (var19 * var32 + var20 * var31 + (var21 * var30)) / var23 + var26;
                        int var34 = (var14[var25][var24 + 1] >> 3) + (var14[var25][var24] >> 1) + (var14[var25 + 1][var24] >> 3) + (var14[var25][var24 - 1] >> 2) + (var14[var25 + -1][var24] >> 2);
                        var12[var25][var24] = var33 - ((int) ((float) var34 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class29.field329[var48] = 0;
                class177.field2428[var48] = 0;
                class270.field3880[var48] = 0;
                class299.field4396[var48] = 0;
                class218.field3076[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class263.field3827[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class94 var53 = class307.method2145(var52 - 1, true);
                            class29.field329[var50] += var53.field1211;
                            class177.field2428[var50] += var53.field1220;
                            class270.field3880[var50] += var53.field1232;
                            class299.field4396[var50] += var53.field1227;
                            var10002 = class218.field3076[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class263.field3827[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class94 var56 = class307.method2145(var55 - 1, true);
                            class29.field329[var50] -= var56.field1211;
                            class177.field2428[var50] -= var56.field1220;
                            class270.field3880[var50] -= var56.field1232;
                            class299.field4396[var50] -= var56.field1227;
                            var10002 = class218.field3076[var50]--;
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
                            var59 += class299.field4396[var63];
                            var60 += class218.field3076[var63];
                            var61 += class177.field2428[var63];
                            var57 += class29.field329[var63];
                            var58 += class270.field3880[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var59 -= class299.field4396[var64];
                            var58 -= class270.field3880[var64];
                            var57 -= class29.field329[var64];
                            var60 -= class218.field3076[var64];
                            var61 -= class177.field2428[var64];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var10[var49][var62] = class352.method2452((byte) -123, var57 * 256 / var59, var61 / var60, var58 / var60);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label776: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg3 || class138.method1038(true) || (class9.field101[0][var65][var66] & 0x2) != 0 || (class9.field101[var13][var65][var66] & 0x10) == 0 && class61.method448(var66, var13, (byte) 122, var65) == class226.field3256) {
                        if (class247.field3602 > var13) {
                            class247.field3602 = var13;
                        }
                        int var67 = class263.field3827[var13][var65][var66] & 0xFF;
                        int var68 = class55.field710[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class74.field978[var13][var65][var66];
                            int var70 = class74.field978[var13][var65 + 1][var66];
                            int var71 = class74.field978[var13][var65 + 1][var66 + 1];
                            int var72 = class74.field978[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class352.field5500[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class311.method2165((byte) -128, var68 - 1).field3048) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class195.field2692[var13][var65][var66] = class80.method568(class195.field2692[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = -1;
                                var75 = 0;
                            } else {
                                var74 = var10[var65][var66];
                                int var76 = (var74 & 0x7F) + var11;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var74 + var9 & 0xFC00) + ((var74 & 0x380) + var76);
                                var75 = class350.field5463[class85.method620(true, var77, 96)];
                            }
                            int var78 = var12[var65 + 1][var66];
                            int var79 = var12[var65 + 1][var66 + 1];
                            int var80 = var12[var65][var66 + 1];
                            int var81 = var12[var65][var66];
                            if (var68 == 0) {
                                class199.method1466(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class85.method620(true, var74, var81), class85.method620(true, var74, var78), class85.method620(true, var74, var79), class85.method620(true, var74, var80), 0, 0, 0, 0, var75, 0);
                                if (class47.field623 && var13 > 0 && var74 != -1 && class307.method2145(var67 - 1, true).field1217) {
                                    class151.method1157(0, 0, true, false, var65, var66, var69 - class74.field978[0][var65][var66], -class74.field978[0][var65 + 1][var66] + var70, var71 - class74.field978[0][var65 + 1][var66 + 1], -class74.field978[0][var65][var66 + 1] + var72);
                                }
                                if (class47.field623 && !arg3 && class143.field1992 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class55.field710[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class216 var85 = class311.method2165((byte) -128, var84 - 1);
                                                    if (var85.field3059 != -1 && class328.method2271(class350.field5467.method905(var85.field3059, 255), (byte) -90)) {
                                                        class143.field1992[var65][var66] = (var85.field3052 << 24) + var85.field3055;
                                                        continue label776;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class352.field5500[var13][var65][var66] + 1;
                                byte var87 = class178.field2439[var13][var65][var66];
                                class216 var88 = class311.method2165((byte) -127, var68 - 1);
                                if (class47.field623 && !arg3 && class143.field1992 != null && var13 == 0) {
                                    if (var88.field3059 != -1 && class328.method2271(class350.field5467.method905(var88.field3059, 255), (byte) -59)) {
                                        class143.field1992[var65][var66] = (var88.field3052 << 24) + var88.field3055;
                                    } else {
                                        label757: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= (var66 + 1); var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class55.field710[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class216 var92 = class311.method2165((byte) -126, var91 - 1);
                                                        if (var92.field3059 != -1 && class328.method2271(class350.field5467.method905(var92.field3059, 255), (byte) -100)) {
                                                            class143.field1992[var65][var66] = (var92.field3052 << 24) + var92.field3055;
                                                            break label757;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field3059;
                                if (var93 >= 0 && !class350.field5467.method902(var93, arg1 ^ 0x47)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var95 = class350.field5463[class308.method2151((byte) -77, class350.field5467.method907(var93, arg1 ^ 0xFFB8), 96)];
                                } else if (var88.field3050 == -1) {
                                    var95 = 0;
                                    var94 = -2;
                                } else {
                                    var94 = var88.field3050;
                                    int var96 = (var94 & 0x7F) + var11;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var94 & 0x380) + (var9 + var94 & 0xFC00) + var96;
                                    var95 = class350.field5463[class308.method2151((byte) -77, var97, 96)];
                                }
                                if (var88.field3051 >= 0) {
                                    int var98 = var88.field3051;
                                    int var99 = (var98 & 0x7F) + var11;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + ((var98 & 0x380) + var99);
                                    var95 = class350.field5463[class308.method2151((byte) -77, var100, 96)];
                                }
                                class199.method1466(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class85.method620(true, var74, var81), class85.method620(true, var74, var78), class85.method620(true, var74, var79), class85.method620(true, var74, var80), class308.method2151((byte) -77, var94, var81), class308.method2151((byte) -77, var94, var78), class308.method2151((byte) -77, var94, var79), class308.method2151((byte) -77, var94, var80), var75, var95);
                                if (class47.field623 && var13 > 0) {
                                    class151.method1157(var86, var87, var94 == -2 || !var88.field3046, var74 == -1 || !class307.method2145(var67 - 1, true).field1217, var65, var66, var69 - class74.field978[0][var65][var66], var70 - class74.field978[0][var65 - -1][var66], var71 - class74.field978[0][var65 + 1][var66 + 1], var72 - class74.field978[0][var65][var66 - -1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class47.field623) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class74.field978[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg3) {
                            class70[] var110 = class268.method1832(arg2, class55.field710[var13], var101, class143.field1992, var10, var102, class352.field5500[var13], var12, class178.field2439[var13], var13, var103, class185.field2517[0], class9.field101, class263.field3827[var13], false, class74.field978[var13]);
                            class5.method36(var13, var110);
                            break;
                        }
                        class70[] var111 = class268.method1832(arg2, class55.field710[var13], var101, (int[][]) null, var10, var102, class352.field5500[var13], var12, class178.field2439[var13], var13, var103, (int[][]) null, class9.field101, class263.field3827[var13], false, class74.field978[var13]);
                        class70[] var112 = class72.method539(class9.field101, (byte) -115, class55.field710[var13], var12, var101, var13, class352.field5500[var13], class178.field2439[var13], class74.field978[var13], class263.field3827[var13], var102, var103);
                        class70[] var113 = new class70[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class5.method36(var13, var113);
                        class3.method23((byte) -99, class178.field2439[var13], class22.field243, class22.field238, class74.field978[var13], class263.field3827[var13], var101, class55.field710[var13], var103, var102, var13, class352.field5500[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var101[var106][var105] = (float) var108 / var109;
                        var102[var106][var105] = -256.0F / var109;
                        var103[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class263.field3827[var13] = (byte[][]) null;
            class55.field710[var13] = (byte[][]) null;
            class352.field5500[var13] = (byte[][]) null;
            class178.field2439[var13] = (byte[][]) null;
            class169.field2356[var13] = (byte[][]) null;
        }
        class139.method1053(-50, -10, -50);
        if (arg3) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class9.field101[1][var116][var117] & 0x2) == 2) {
                    class144.method1126(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class195.field2692[var118][var120][var119] & 0x1) != 0) {
                        int var121 = var119;
                        int var122 = var118;
                        int var123 = var119;
                        while (var121 < 104 && (class195.field2692[var118][var120][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        while (var123 > 0 && (class195.field2692[var118][var120][var123 - 1] & 0x1) != 0) {
                            var123--;
                        }
                        label459: while (var122 > 0) {
                            for (int var124 = var123; var124 <= var121; var124++) {
                                if ((class195.field2692[var122 - 1][var120][var124] & 0x1) == 0) {
                                    break label459;
                                }
                            }
                            var122--;
                        }
                        int var125;
                        label447: for (var125 = var118; var125 < 3; var125++) {
                            for (int var126 = var123; var126 <= var121; var126++) {
                                if ((class195.field2692[var125 + 1][var120][var126] & 0x1) == 0) {
                                    break label447;
                                }
                            }
                        }
                        int var127 = (var125 + 1 - var122) * (var121 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class74.field978[var125][var120][var123] - var128;
                            int var130 = class74.field978[var122][var120][var123];
                            class265.method1821(1, var120 * 128, var120 * 128, var123 * 128, var121 * 128 + 128, var129, var130);
                            for (int var131 = var122; var131 <= var125; var131++) {
                                for (int var132 = var123; var132 <= var121; var132++) {
                                    class195.field2692[var131][var120][var132] = class335.method2339(class195.field2692[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class195.field2692[var118][var120][var119] & 0x2) != 0) {
                        int var133;
                        for (var133 = var120; var133 > 0 && (class195.field2692[var118][var133 - 1][var119] & 0x2) != 0; var133--) {
                        }
                        int var134;
                        for (var134 = var120; var134 < 104 && (class195.field2692[var118][var134 + 1][var119] & 0x2) != 0; var134++) {
                        }
                        int var135 = var118;
                        int var136 = var118;
                        label512: while (var135 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class195.field2692[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label512;
                                }
                            }
                            var135--;
                        }
                        label501: while (var136 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class195.field2692[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label501;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var136 + 1 - var135) * (var134 + 1 - var133);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class74.field978[var136][var133][var119] - var140;
                            int var142 = class74.field978[var135][var133][var119];
                            class265.method1821(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class195.field2692[var143][var144][var119] = class335.method2339(class195.field2692[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class195.field2692[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class195.field2692[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class195.field2692[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label567: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class195.field2692[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label567;
                                }
                            }
                            var145--;
                        }
                        label556: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class195.field2692[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label556;
                                }
                            }
                            var146++;
                        }
                        if (((var146 + 1 - var145) * (var148 + 1 - var147)) >= 4) {
                            int var151 = class74.field978[var118][var145][var147];
                            class265.method1821(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class195.field2692[var118][var152][var153] = class335.method2339(class195.field2692[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 977)
    public static final void method1385(String arg0, int arg1, byte arg2) {
        field2633++;
        class42 var3 = class166.method1242(2, arg1, -1249071392);
        var3.method307((byte) -93);
        var3.field539 = arg0;
        if (arg2 != 108) {
            method1387(29, -18, -113, -61, (byte) -52, -14, -88);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lma;ILwf;BIII)V", line = 994)
    public static final void method1386(class145 arg0, int arg1, class333 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2637++;
        if (arg0 == null) {
            return;
        }
        int var7 = (int) class247.field3601 + class354.field5534 & 0x7FF;
        int var8 = Math.max(arg2.field5056 / 2, arg2.field5172 / 2) + 10;
        if (arg3 > -46) {
            method1388(-32);
        }
        int var9 = arg4 * arg4 + arg5 * arg5;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class350.field5476[var7];
        int var11 = var10 * 256 / (class318.field4690 + 256);
        int var12 = class350.field5474[var7];
        int var13 = var12 * 256 / (class318.field4690 + 256);
        int var14 = arg4 * var13 + arg5 * var11 >> 16;
        int var15 = arg5 * var13 - (arg4 * var11) >> 16;
        if (class47.field623) {
            ((class127) arg0).method942(arg2.field5056 / 2 + arg1 + var14 - (arg0.field2028 / 2), arg2.field5172 / 2 + arg6 + -var15 - arg0.field2026 / 2, (class361) arg2.method2325(false, (byte) -18));
        } else {
            ((class153) arg0).method1186(arg2.field5056 / 2 + arg1 + var14 - arg0.field2028 / 2, -var15 + arg6 - (-(arg2.field5172 / 2) - -(arg0.field2026 / 2)), arg2.field5195, arg2.field5057);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIBII)V", line = 1034)
    public static final void method1387(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2641++;
        if (arg4 != -9) {
            return;
        }
        int var7 = class289.method1984(class207.field2937, arg5, arg4 + 10, class25.field292);
        int var8 = class289.method1984(class207.field2937, arg6, 1, class25.field292);
        int var9 = class289.method1984(class245.field3574, arg3, 1, class321.field4722);
        int var10 = class289.method1984(class245.field3574, arg0, 1, class321.field4722);
        int var11 = class289.method1984(class207.field2937, arg2 + arg5, 1, class25.field292);
        int var12 = class289.method1984(class207.field2937, arg6 - arg2, 1, class25.field292);
        for (int var13 = var7; var13 < var11; var13++) {
            class96.method697((byte) 115, class331.field4902[var13], arg1, var9, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class96.method697((byte) 115, class331.field4902[var14], arg1, var9, var10);
        }
        int var15 = class289.method1984(class245.field3574, arg3 + arg2, 1, class321.field4722);
        int var16 = class289.method1984(class245.field3574, arg0 - arg2, 1, class321.field4722);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class331.field4902[var17];
            class96.method697((byte) 115, var18, arg1, var9, var15);
            class96.method697((byte) 115, var18, arg1, var16, var10);
        }
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)V", line = 1085)
    public static void method1388(int arg0) {
        if (arg0 != -4000) {
            field2647 = (String) null;
        }
        field2647 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLfd;I)V", line = 1105)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2636 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field2639 = arg1.method2083((byte) -43);
        } else if (arg2 == 2) {
            this.field2640 = arg1.method2096((byte) -122);
        }
        field2635++;
        if (arg0 != -43) {
            field2648 = -7;
        }
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(B)V", line = 1139)
    public static final void method1389(byte arg0) {
        field2634++;
        int var1 = class186.field2554.method1894(class75.field986);
        for (int var2 = 0; var2 < class66.field853; var2++) {
            int var3 = class186.field2554.method1894(class28.method184((byte) 98, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        if (arg0 < 57) {
            return;
        }
        int var4 = class66.field853 * 15 + 21;
        int var5 = class302.field4434;
        var1 += 8;
        if (var4 + var5 > class192.field2660) {
            var5 = class192.field2660 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class73.field971 - (var1 / 2);
        if ((var1 + var6) > class163.field2314) {
            var6 = class163.field2314 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class179.field2446 == 1) {
            if (class73.field971 == class20.field231 && class302.field4434 == class16.field204) {
                class179.field2446 = 0;
                class65.field815 = var5;
                class117.field1534 = (class66.field846 ? 26 : 22) + class66.field853 * 15;
                class159.field2263 = true;
                class146.field2038 = var1;
                class209.field2967 = var6;
            }
        } else if (class73.field971 == class140.field1950 && class305.field4465 == class302.field4434) {
            class117.field1534 = (class66.field846 ? 26 : 22) + class66.field853 * 15;
            class209.field2967 = var6;
            class146.field2038 = var1;
            class179.field2446 = 0;
            class159.field2263 = true;
            class65.field815 = var5;
        } else {
            class20.field231 = class140.field1950;
            class16.field204 = class305.field4465;
            class179.field2446 = 1;
        }
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V", line = 1227)
    public final void method189(byte arg0) {
        this.method1390((byte) 78);
        int var2 = -79 / ((36 - arg0) / 44);
        field2646++;
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(B)V", line = 1242)
    private final void method1390(byte arg0) {
        this.field2642 = new int[this.field2636 + 1];
        field2643++;
        int var2 = 4096 / this.field2636;
        this.field2645 = new int[this.field2636 + 1];
        int var3 = this.field2639 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2636; var5++) {
            this.field2642[var5] = var4;
            this.field2645[var5] = var3 + var4;
            var4 += var2;
        }
        int var6 = 114 % ((-arg0 - 5) / 34);
        this.field2642[this.field2636] = 4096;
        this.field2645[this.field2636] = this.field2645[0] + 4096;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 1280)
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I", line = 1300)
    public final int[] method190(int arg0, int arg1) {
        field2638++;
        int[] var3 = this.field2802.method2502(arg1, -76);
        if (arg0 != -1735) {
            this.method1390((byte) 85);
        }
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1];
            if (this.field2640 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field2636; var12++) {
                    if (var4 >= this.field2642[var12] && var4 < this.field2642[var12 + 1]) {
                        if (var4 < this.field2645[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class87.method630(var3, 0, class95.field1235, var11);
            } else {
                for (int var5 = 0; var5 < class95.field1235; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class82.field1062[var5];
                    int var9 = this.field2640;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field2636; var10++) {
                        if (this.field2642[var10] <= var6 && var6 < this.field2642[var10 + 1]) {
                            if (var6 < this.field2645[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }
}
