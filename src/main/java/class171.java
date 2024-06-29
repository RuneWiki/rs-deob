import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class171 extends class182 {

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    private int field2818 = 1;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    private int field2828 = 1;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "[S")
    public static short[] field2822 = new short[256];

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "Z")
    public static boolean field2832 = false;

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "J")
    public static long field2833 = 0L;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "Lg;")
    public static class181 field2831;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILek;IB)Lsc;", line = 4)
    public static final class288 method1213(int arg0, class206 arg1, int arg2, byte arg3) {
        field2826++;
        if (class76.method581(arg1, 66, arg0, arg2)) {
            int var4 = -49 % ((arg3 + 18) / 35);
            return class133.method941(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 18)
    public class171() {
        super(1, false);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Loe;IB)V", line = 38)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field2818 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field2828 = arg0.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        if (arg2 != 60) {
            method1214(48, -10, -101);
        }
        field2830++;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(III)V", line = 76)
    public static final void method1214(int arg0, int arg1, int arg2) {
        field2827++;
        if (arg2 <= 93) {
            field2833 = 15L;
        }
        class199 var3 = class173.method1231(false, 7, arg1);
        var3.method1367((byte) -11);
        var3.field3338 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B[[[IZ[Lrm;)V", line = 90)
    public static final void method1215(byte arg0, int[][][] arg1, boolean arg2, class273[] arg3) {
        field2825++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class282.field4615[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class282.field4615[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg3[var7].method1933(var6, arg0 ^ 0x3BFB, var5);
                            }
                        }
                    }
                }
            }
            class7.field263 += (int) (Math.random() * 5.0D) - 2;
            class344.field5434 += (int) (Math.random() * 5.0D) - 2;
            if (class7.field263 < -8) {
                class7.field263 = -8;
            }
            if (class344.field5434 < -16) {
                class344.field5434 = -16;
            }
            if (class7.field263 > 8) {
                class7.field263 = 8;
            }
            if (class344.field5434 > 16) {
                class344.field5434 = 16;
            }
        }
        if (arg0 != -93) {
            field2831 = (class181) null;
        }
        int var8 = class344.field5434 >> 1;
        int[][] var9 = new int[104][104];
        byte var10;
        if (arg2) {
            var10 = 1;
        } else {
            var10 = 4;
        }
        int[][] var11 = new int[104][104];
        int var12 = class7.field263 >> 2 << 10;
        for (int var13 = 0; var13 < var10; var13++) {
            byte[][] var14 = class79.field1409[var13];
            if (!class241.field4016) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class144.field2427[var13][var18 + 1][var17] - class144.field2427[var13][var18 - 1][var17];
                        int var21 = class144.field2427[var13][var18][var17 + 1] - class144.field2427[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + 65536));
                        int var23 = (var20 << 8) / var22;
                        int var24 = -65536 / var22;
                        int var25 = (var14[var18][var17 - 1] >> 2) + (var14[var18][var17 + 1] >> 3) + (var14[var18][var17] >> 1) + (var14[var18 + -1][var17] >> 2) + (var14[var18 + 1][var17] >> 3);
                        int var26 = (var21 << 8) / var22;
                        int var27 = (var24 * -10 + var23 * -50 + var26 * -50) / var16 + var19;
                        var11[var18][var17] = var27 - var25;
                    }
                }
            } else if (class281.field4606) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        byte var46 = 74;
                        int var47 = (var14[var45][var44 + 1] >> 3) + (var14[var45][var44 - 1] >> 2) + (var14[var45 + -1][var44] >> 2) - (-(var14[var45 + 1][var44] >> 3) + -(var14[var45][var44] >> 1));
                        var11[var45][var44] = var46 - var47;
                    }
                }
            } else {
                int var28 = (int) class259.field4233[0];
                int var29 = (int) class259.field4233[1];
                int var30 = (int) class259.field4233[2];
                int var31 = (int) Math.sqrt((double) (var29 * var29 + var28 * var28 + var30 * var30));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        int var35 = class144.field2427[var13][var34 + 1][var33] - class144.field2427[var13][var34 - 1][var33];
                        byte var36 = 96;
                        int var37 = class144.field2427[var13][var34][var33 + 1] - class144.field2427[var13][var34][var33 - 1];
                        int var38 = (int) Math.sqrt((double) (var37 * var37 + var35 * var35 + 65536));
                        int var39 = -65536 / var38;
                        int var40 = (var35 << 8) / var38;
                        int var41 = (var14[var34][var33] >> 1) + (var14[var34][var33 - 1] >> 2) + (var14[var34 + -1][var33] >> 2) + (var14[var34][var33 + 1] >> 3) + (var14[var34 + 1][var33] >> 3);
                        int var42 = (var37 << 8) / var38;
                        int var43 = (var28 * var40 + var29 * var39 + var30 * var42) / var32 + var36;
                        var11[var34][var33] = var43 - ((int) ((float) var41 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class144.field2417[var48] = 0;
                class11.field367[var48] = 0;
                class198.field3307[var48] = 0;
                class58.field1145[var48] = 0;
                class298.field4848[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class1.field23[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class129 var53 = class56.method478((byte) -11, var52 - 1);
                            class144.field2417[var50] += var53.field2249;
                            class11.field367[var50] += var53.field2246;
                            class198.field3307[var50] += var53.field2241;
                            class58.field1145[var50] += var53.field2245;
                            var10002 = class298.field4848[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class1.field23[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class129 var56 = class56.method478((byte) -11, var55 - 1);
                            class144.field2417[var50] -= var56.field2249;
                            class11.field367[var50] -= var56.field2246;
                            class198.field3307[var50] -= var56.field2241;
                            class58.field1145[var50] -= var56.field2245;
                            var10002 = class298.field4848[var50]--;
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
                            var58 += class11.field367[var63];
                            var57 += class144.field2417[var63];
                            var60 += class198.field3307[var63];
                            var59 += class58.field1145[var63];
                            var61 += class298.field4848[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0) {
                            var57 -= class144.field2417[var64];
                            var61 -= class298.field4848[var64];
                            var60 -= class198.field3307[var64];
                            var58 -= class11.field367[var64];
                            var59 -= class58.field1145[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var9[var49][var62] = class136.method954(var57 * 256 / var59, -125, var58 / var61, var60 / var61);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label778: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg2 || class14.method137(256) || (class282.field4615[0][var65][var66] & 0x2) != 0 || (class282.field4615[var13][var65][var66] & 0x10) == 0 && class170.method1206(var13, var66, var65, -107) == class208.field3479) {
                        if (class311.field5064 > var13) {
                            class311.field5064 = var13;
                        }
                        int var67 = class54.field1081[var13][var65][var66] & 0xFF;
                        int var68 = class1.field23[var13][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class144.field2427[var13][var65][var66];
                            int var70 = class144.field2427[var13][var65 + 1][var66];
                            int var71 = class144.field2427[var13][var65][var66 + 1];
                            int var72 = class144.field2427[var13][var65 + 1][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class355.field5656[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class131.method929(var67 - 1, 8).field5632) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var72 && var69 == var71) {
                                    class167.field2793[var13][var65][var66] = class287.method2034(class167.field2793[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var68 > 0) {
                                var74 = var9[var65][var66];
                                int var75 = (var74 & 0x7F) + var8;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var12 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class305.field4956[class68.method529(3, 96, var76)];
                            } else {
                                var74 = -1;
                                var77 = 0;
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66];
                            int var80 = var11[var65 + 1][var66 + 1];
                            int var81 = var11[var65][var66 + 1];
                            if (var67 == 0) {
                                class267.method1871(var13, var65, var66, 0, 0, -1, var69, var70, var72, var71, class68.method529(3, var78, var74), class68.method529(arg0 ^ 0xFFFFFFA0, var79, var74), class68.method529(3, var80, var74), class68.method529(3, var81, var74), 0, 0, 0, 0, var77, 0);
                                if (class241.field4016 && var13 > 0 && var74 != -1 && class56.method478((byte) -11, var68 - 1).field2248) {
                                    class221.method1551(0, 0, true, false, var65, var66, var69 - class144.field2427[0][var65][var66], var70 - class144.field2427[0][var65 + 1][var66], var72 - class144.field2427[0][var65 + 1][var66 + 1], -class144.field2427[0][var65][var66 + 1] + var71);
                                }
                                if (class241.field4016 && !arg2 && class318.field5180 != null && var13 == 0) {
                                    for (int var97 = var65 - 1; var97 <= var65 + 1; var97++) {
                                        for (int var98 = var66 - 1; var98 <= (var66 + 1); var98++) {
                                            if ((var65 != var97 || var66 != var98) && var97 >= 0 && var97 < 104 && var98 >= 0 && var98 < 104) {
                                                int var99 = class54.field1081[var13][var97][var98] & 0xFF;
                                                if (var99 != 0) {
                                                    class352 var100 = class131.method929(var99 - 1, 8);
                                                    if (var100.field5633 != -1 && class125.method899((byte) -118, class305.field4968.method63(var100.field5633, -1))) {
                                                        class318.field5180[var65][var66] = (var100.field5625 << 24) + var100.field5636;
                                                        continue label778;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var82 = class355.field5656[var13][var65][var66] + 1;
                                byte var83 = class99.field1811[var13][var65][var66];
                                class352 var84 = class131.method929(var67 - 1, 8);
                                if (class241.field4016 && !arg2 && class318.field5180 != null && var13 == 0) {
                                    if (var84.field5633 != -1 && class125.method899((byte) 96, class305.field4968.method63(var84.field5633, -1))) {
                                        class318.field5180[var65][var66] = (var84.field5625 << 24) + var84.field5636;
                                    } else {
                                        label744: for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                            for (int var86 = var66 - 1; var86 <= (var66 + 1); var86++) {
                                                if ((var65 != var85 || var66 != var86) && var85 >= 0 && var85 < 104 && var86 >= 0 && var86 < 104) {
                                                    int var87 = class54.field1081[var13][var85][var86] & 0xFF;
                                                    if (var87 != 0) {
                                                        class352 var88 = class131.method929(var87 - 1, arg0 ^ 0xFFFFFFAB);
                                                        if (var88.field5633 != -1 && class125.method899((byte) -117, class305.field4968.method63(var88.field5633, -1))) {
                                                            class318.field5180[var65][var66] = (var88.field5625 << 24) + var88.field5636;
                                                            break label744;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var89 = var84.field5633;
                                if (var89 >= 0 && !class305.field4968.method74(var89, (byte) -105)) {
                                    var89 = -1;
                                }
                                int var90;
                                int var91;
                                if (var89 >= 0) {
                                    var90 = class305.field4956[class215.method1496(class305.field4968.method85(var89, (byte) -82), arg0 - 11332, 96)];
                                    var91 = -1;
                                } else if (var84.field5634 == -1) {
                                    var91 = -2;
                                    var90 = 0;
                                } else {
                                    var91 = var84.field5634;
                                    int var92 = (var91 & 0x7F) + var8;
                                    if (var92 < 0) {
                                        var92 = 0;
                                    } else if (var92 > 127) {
                                        var92 = 127;
                                    }
                                    int var93 = (var91 & 0x380) + (var12 + var91 & 0xFC00) + var92;
                                    var90 = class305.field4956[class215.method1496(var93, arg0 - 11332, 96)];
                                }
                                if (var84.field5626 >= 0) {
                                    int var94 = var84.field5626;
                                    int var95 = (var94 & 0x7F) + var8;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var12 + var94 & 0xFC00) + (var94 & 0x380) + var95;
                                    var90 = class305.field4956[class215.method1496(var96, -11425, 96)];
                                }
                                class267.method1871(var13, var65, var66, var82, var83, var89, var69, var70, var72, var71, class68.method529(3, var78, var74), class68.method529(3, var79, var74), class68.method529(3, var80, var74), class68.method529(arg0 ^ 0xFFFFFFA0, var81, var74), class215.method1496(var91, -11425, var78), class215.method1496(var91, arg0 ^ 0x2CFC, var79), class215.method1496(var91, -11425, var80), class215.method1496(var91, -11425, var81), var77, var90);
                                if (class241.field4016 && var13 > 0) {
                                    class221.method1551(var82, var83, var91 == -2 || !var84.field5629, var74 == -1 || !class56.method478((byte) -11, var68 - 1).field2248, var65, var66, var69 - class144.field2427[0][var65][var66], var70 - class144.field2427[0][var65 + 1][var66], var72 - class144.field2427[0][var65 + 1][var66 + 1], -class144.field2427[0][var65][var66 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class241.field4016) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class144.field2427[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg2) {
                            class102[] var110 = class225.method1572(var13, var102, class355.field5656[var13], var103, class144.field2427[var13], class99.field1811[var13], 68, class1.field23[var13], class282.field4615, class318.field5180, var11, var9, var101, class54.field1081[var13], class123.field2166[0], arg1);
                            class158.method1134(var13, var110);
                            break;
                        }
                        class102[] var111 = class225.method1572(var13, var102, class355.field5656[var13], var103, class144.field2427[var13], class99.field1811[var13], 112, class1.field23[var13], class282.field4615, (int[][]) null, var11, var9, var101, class54.field1081[var13], (int[][]) null, arg1);
                        class102[] var112 = class351.method2500(var11, class54.field1081[var13], var102, var103, -1, class99.field1811[var13], class144.field2427[var13], class355.field5656[var13], class1.field23[var13], class282.field4615, var13, var101);
                        class102[] var113 = new class102[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class158.method1134(var13, var113);
                        class191.method1325(class54.field1081[var13], class99.field1811[var13], -2, class355.field5656[var13], var103, class2.field63, class2.field50, var13, class1.field23[var13], var102, var101, class144.field2427[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        int var108 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var103[var106][var105] = (float) var108 / var109;
                        var102[var106][var105] = -256.0F / var109;
                        var101[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class1.field23[var13] = (byte[][]) null;
            class54.field1081[var13] = (byte[][]) null;
            class355.field5656[var13] = (byte[][]) null;
            class99.field1811[var13] = (byte[][]) null;
            class79.field1409[var13] = (byte[][]) null;
        }
        class26.method216(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class282.field4615[1][var116][var117] & 0x2) == 2) {
                    class173.method1228(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class167.field2793[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class167.field2793[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var118;
                        int var123;
                        for (var123 = var119; var123 < 104 && (class167.field2793[var118][var120][var123 + 1] & 0x1) != 0; var123++) {
                        }
                        int var124 = var118;
                        label459: while (var122 > 0) {
                            for (int var125 = var121; var125 <= var123; var125++) {
                                if ((class167.field2793[var122 - 1][var120][var125] & 0x1) == 0) {
                                    break label459;
                                }
                            }
                            var122--;
                        }
                        label448: while (var124 < 3) {
                            for (int var126 = var121; var126 <= var123; var126++) {
                                if ((class167.field2793[var124 + 1][var120][var126] & 0x1) == 0) {
                                    break label448;
                                }
                            }
                            var124++;
                        }
                        int var127 = (var123 + 1 - var121) * (var124 + 1 - var122);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class144.field2427[var124][var120][var121] - var128;
                            int var130 = class144.field2427[var122][var120][var121];
                            class94.method717(1, var120 * 128, var120 * 128, var121 * 128, var123 * 128 + 128, var129, var130);
                            for (int var131 = var122; var131 <= var124; var131++) {
                                for (int var132 = var121; var132 <= var123; var132++) {
                                    class167.field2793[var131][var120][var132] = class83.method613(class167.field2793[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class167.field2793[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 > 0 && (class167.field2793[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        int var135 = var118;
                        while (var134 < 104 && (class167.field2793[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var136;
                        label514: for (var136 = var118; var136 > 0; var136--) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class167.field2793[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label514;
                                }
                            }
                        }
                        label503: while (var135 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class167.field2793[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label503;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var134 + 1 - var133) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class144.field2427[var135][var133][var119] - var140;
                            int var142 = class144.field2427[var136][var133][var119];
                            class94.method717(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var141, var142);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class167.field2793[var143][var144][var119] = class83.method613(class167.field2793[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class167.field2793[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 > 0 && (class167.field2793[var118][var120][var147 - 1] & 0x4) != 0; var147--) {
                        }
                        int var148;
                        for (var148 = var119; var148 < 104 && (class167.field2793[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        label569: while (var146 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class167.field2793[var118][var146 - 1][var149] & 0x4) == 0) {
                                    break label569;
                                }
                            }
                            var146--;
                        }
                        label558: while (var145 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class167.field2793[var118][var145 + 1][var150] & 0x4) == 0) {
                                    break label558;
                                }
                            }
                            var145++;
                        }
                        if ((var145 + 1 - var146) * (var148 + 1 - var147) >= 4) {
                            int var151 = class144.field2427[var118][var146][var147];
                            class94.method717(4, var146 * 128, var145 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var146; var152 <= var145; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class167.field2793[var118][var152][var153] = class83.method613(class167.field2793[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)[I", line = 1067)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            return (int[]) null;
        }
        field2820++;
        int[] var3 = this.field3166.method775(arg1, 126);
        if (this.field3166.field1903) {
            int var4 = this.field2828 + this.field2828 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2818 + this.field2818 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field2828; var9 <= (this.field2828 + arg1); var9++) {
                int[] var10 = this.method1292(var9 & class194.field3266, 0, -124);
                int var11 = 0;
                int[] var12 = new int[class26.field672];
                for (int var13 = -this.field2818; var13 <= this.field2818; var13++) {
                    var11 += var10[var13 & class53.field1056];
                }
                int var14 = 0;
                while (var14 < class26.field672) {
                    var12[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[class53.field1056 & var14 - this.field2818];
                    var14++;
                    var11 = var10[var14 + this.field2818 & class53.field1056] + var15;
                }
                var7[this.field2828 + var9 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class26.field672; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIB[[II)I", line = 1152)
    public static final int method1216(int arg0, int arg1, int arg2, byte arg3, int[][] arg4, int arg5) {
        field2823++;
        if (arg3 >= -102) {
            return -2;
        } else {
            int var6 = (128 - arg1) * arg4[arg0][arg2] + arg4[arg0 + 1][arg2] * arg1 >> 7;
            int var7 = (128 - arg1) * arg4[arg0][arg2 + 1] + arg4[arg0 + 1][arg2 + 1] * arg1 >> 7;
            return (128 - arg5) * var6 + arg5 * var7 >> 7;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V", line = 1167)
    public static final void method1217(String arg0, int arg1, String arg2, boolean arg3) {
        field2819++;
        class306.field4983 = arg2;
        class88.field1532 = arg1;
        class206.field3456 = arg0;
        if (class306.field4983.equals("") || class206.field3456.equals("")) {
            class11.field363 = 3;
        } else if (class68.field1262 == -1) {
            class363.field5741 = 0;
            class213.field3526 = 0;
            if (!arg3) {
                method1213(62, (class206) null, -63, (byte) -118);
            }
            class299.field4856 = 1;
            class11.field363 = -3;
            class146 var4 = new class146(128);
            var4.method1027(10, -20374);
            var4.method1045((byte) 123, (int) (Math.random() * 9.9999999E7D));
            var4.method1003((byte) -15, class167.method1189(0, class306.field4983));
            var4.method1045((byte) 122, (int) (Math.random() * 9.9999999E7D));
            var4.method1012(class206.field3456, (byte) 90);
            var4.method1045((byte) 119, (int) (Math.random() * 9.9999999E7D));
            var4.method995(-1, class135.field2317, class81.field1413);
            class51.field1038.field2435 = 0;
            class51.field1038.method1027(24, -20374);
            class51.field1038.method1027(var4.field2435 + 2, -20374);
            class51.field1038.method1002((byte) -127, 553);
            class51.field1038.method1037(var4.field2496, 0, -119, var4.field2435);
        } else {
            class323.method2324((byte) -96);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[[I", line = 1221)
    public final int[][] method122(int arg0, int arg1) {
        field2829++;
        int[][] var3 = this.field3152.method1953(arg0, 89);
        if (this.field3152.field4493) {
            int var4 = this.field2828 + this.field2828 + 1;
            int var5 = this.field2818 + this.field2818 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2828; var9 <= (this.field2828 + arg0); var9++) {
                int[][] var10 = this.method1291(var9 & class194.field3266, (byte) 127, 0);
                int[][] var11 = new int[3][class26.field672];
                int var12 = 0;
                int var13 = 0;
                int[] var14 = var10[0];
                int[] var15 = var10[2];
                int var16 = 0;
                int[] var17 = var10[1];
                for (int var18 = -this.field2818; var18 <= this.field2818; var18++) {
                    int var19 = var18 & class53.field1056;
                    var16 += var14[var19];
                    var13 += var15[var19];
                    var12 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (var23 < class26.field672) {
                    var20[var23] = var7 * var16 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = var23 - this.field2818 & class53.field1056;
                    int var25 = var12 - var17[var24];
                    int var26 = var13 - var15[var24];
                    var23++;
                    int var27 = var16 - var14[var24];
                    int var28 = var23 + this.field2818 & class53.field1056;
                    var13 = var15[var28] + var26;
                    var16 = var14[var28] + var27;
                    var12 = var17[var28] + var25;
                }
                var8[var9 - (arg0 - this.field2828)] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class26.field672; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var6 * var33 >> 16;
                var30[var32] = var6 * var34 >> 16;
                var31[var32] = var6 * var35 >> 16;
            }
        }
        if (arg1 != 4944) {
            method1213(-47, (class206) null, 106, (byte) -81);
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 1355)
    public static void method1218(int arg0) {
        if (arg0 != -11587) {
            method1214(-114, 75, -46);
        }
        field2822 = null;
        field2831 = null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 1372)
    public static final void method1219(byte arg0) {
        class164.field2755 = new class49();
        field2824++;
        int var1 = -102 % ((arg0 - 24) / 62);
    }
}
