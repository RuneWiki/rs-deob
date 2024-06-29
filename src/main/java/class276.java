import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class276 extends class313 {

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4388 = "";

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Lno;")
    public static class5 field4398 = new class5(5000);

    @OriginalMember(owner = "client!t", name = "V", descriptor = "[S")
    public static short[] field4401 = new short[500];

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "Lcg;")
    public static class49 field4392;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "Lcg;")
    public static class49 field4397;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "[I")
    public static int[] field4400;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "[Lbe;")
    private class324[] field4390;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method111(int arg0, int arg1) {
        field4396++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            field4388 = (String) null;
        }
        if (this.field4961.field3451) {
            this.method1898((byte) -124, this.field4961.method1522(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B[[I)V", line = 26)
    private final void method1898(byte arg0, int[][] arg1) {
        if (arg0 >= -119) {
            field4401 = (short[]) null;
        }
        field4394++;
        int var3 = class133.field2269;
        int var4 = class77.field1247;
        class130.method1080(arg1, 111);
        class226.method1646(-103, 0, class297.field4731, 0, class132.field2262);
        if (this.field4390 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4390.length; var5++) {
            class324 var6 = this.field4390[var5];
            int var7 = var6.field5149;
            int var8 = var6.field5164;
            if (var8 < 0) {
                if (var7 >= 0) {
                    var6.method346(var3, var4, (byte) 49);
                }
            } else if (var7 >= 0) {
                var6.method347(var4, 125, var3);
            } else {
                var6.method344(var4, var3, -126);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([[[IZI[Lao;)V", line = 78)
    public static final void method1899(int[][][] arg0, boolean arg1, int arg2, class200[] arg3) {
        if (arg2 <= 80) {
            field4392 = (class49) null;
        }
        field4391++;
        byte var4;
        if (arg1) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg1) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class152.field2683[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class152.field2683[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method1505(var6, var7, 85);
                            }
                        }
                    }
                }
            }
            class329.field5245 += (int) (Math.random() * 5.0D) - 2;
            class102.field1638 += (int) (Math.random() * 5.0D) - 2;
            if (class329.field5245 < -8) {
                class329.field5245 = -8;
            }
            if (class329.field5245 > 8) {
                class329.field5245 = 8;
            }
            if (class102.field1638 < -16) {
                class102.field1638 = -16;
            }
            if (class102.field1638 > 16) {
                class102.field1638 = 16;
            }
        }
        int var9 = class329.field5245 >> 2 << 10;
        int var10 = class102.field1638 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class224.field3745[var13];
            if (!class43.field680) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class137.field2487[var13][var38 + 1][var37] - class137.field2487[var13][var38 - 1][var37];
                        int var41 = class137.field2487[var13][var38][var37 + 1] - class137.field2487[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var40 * var40 + var41 * var41 + 65536));
                        int var43 = (var41 << 8) / var42;
                        int var44 = (var14[var38][var37 - 1] >> 2) + (var14[var38][var37] >> 1) + (var14[var38][var37 + 1] >> 3) + (var14[var38 + -1][var37] >> 2) + (var14[var38 + 1][var37] >> 3);
                        int var45 = -65536 / var42;
                        int var46 = (var40 << 8) / var42;
                        int var47 = (var43 * -50 + var45 * -10 + var46 * -50) / var36 + var39;
                        var12[var38][var37] = var47 - var44;
                    }
                }
            } else if (class64.field1001) {
                for (int var15 = 1; var15 < 103; var15++) {
                    for (int var16 = 1; var16 < 103; var16++) {
                        int var17 = (var14[var16][var15] >> 1) + ((var14[var16 + 1][var15] >> 3) + (var14[var16][var15 + 1] >> 3) + (var14[var16 + -1][var15] >> 2) + (var14[var16][var15 + -1] >> 2));
                        byte var18 = 74;
                        var12[var16][var15] = var18 - var17;
                    }
                }
            } else {
                int var19 = (int) class9.field115[1];
                int var20 = (int) class9.field115[0];
                int var21 = (int) class9.field115[2];
                int var22 = (int) Math.sqrt((double) (var21 * var21 + var19 * var19 + var20 * var20));
                int var23 = var22 * 1024 >> 8;
                for (int var24 = 1; var24 < 103; var24++) {
                    for (int var25 = 1; var25 < 103; var25++) {
                        byte var26 = 96;
                        int var27 = class137.field2487[var13][var25 + 1][var24] - class137.field2487[var13][var25 - 1][var24];
                        int var28 = class137.field2487[var13][var25][var24 + 1] - class137.field2487[var13][var25][var24 - 1];
                        int var29 = (int) Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536));
                        int var30 = (var27 << 8) / var29;
                        int var31 = -65536 / var29;
                        int var32 = (var14[var25][var24] >> 1) + (var14[var25][var24 + 1] >> 3) + (var14[var25 + -1][var24] >> 2) + (var14[var25][var24 + -1] >> 2) + (var14[var25 - -1][var24] >> 3);
                        int var33 = (var28 << 8) / var29;
                        int var34 = (var21 * var33 + var19 * var31 + var20 * var30) / var23 + var26;
                        var12[var25][var24] = var34 - ((int) ((float) var32 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class148.field2663[var48] = 0;
                class269.field4306[var48] = 0;
                class78.field1265[var48] = 0;
                class15.field233[var48] = 0;
                class51.field806[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class310.field4912[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class35 var53 = class322.method2219(var52 - 1, 1);
                            class148.field2663[var50] += var53.field500;
                            class269.field4306[var50] += var53.field510;
                            class78.field1265[var50] += var53.field493;
                            class15.field233[var50] += var53.field501;
                            var10002 = class51.field806[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class310.field4912[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class35 var56 = class322.method2219(var55 - 1, 1);
                            class148.field2663[var50] -= var56.field500;
                            class269.field4306[var50] -= var56.field510;
                            class78.field1265[var50] -= var56.field493;
                            class15.field233[var50] -= var56.field501;
                            var10002 = class51.field806[var50]--;
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
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var60 += class15.field233[var63];
                            var57 += class269.field4306[var63];
                            var58 += class148.field2663[var63];
                            var59 += class78.field1265[var63];
                            var61 += class51.field806[var63];
                        }
                        if (var64 >= 0) {
                            var60 -= class15.field233[var64];
                            var58 -= class148.field2663[var64];
                            var61 -= class51.field806[var64];
                            var57 -= class269.field4306[var64];
                            var59 -= class78.field1265[var64];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var11[var49][var62] = class95.method814(var59 / var61, var58 * 256 / var60, 14, var57 / var61);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label781: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class56.method499(0) || (class152.field2683[0][var65][var66] & 0x2) != 0 || (class152.field2683[var13][var65][var66] & 0x10) == 0 && class64.method605(var66, true, var13, var65) == class321.field5086) {
                        if (class44.field690 > var13) {
                            class44.field690 = var13;
                        }
                        int var67 = class310.field4912[var13][var65][var66] & 0xFF;
                        int var68 = class193.field3230[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class137.field2487[var13][var65][var66];
                            int var70 = class137.field2487[var13][var65 + 1][var66 + 1];
                            int var71 = class137.field2487[var13][var65 + 1][var66];
                            int var72 = class137.field2487[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class271.field4319[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !class300.method2076(var68 - 1, -46).field5599) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var71 && var69 == var70 && var69 == var72) {
                                    class226.field3798[var13][var65][var66] = class144.method1159(class226.field3798[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var11[var65][var66];
                                int var76 = (var75 & 0x7F) + var10;
                                if (var76 < 0) {
                                    var76 = 0;
                                } else if (var76 > 127) {
                                    var76 = 127;
                                }
                                int var77 = (var75 + var9 & 0xFC00) + (var75 & 0x380) + var76;
                                var74 = class62.field955[class346.method2423((byte) -120, var77, 96)];
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65 + 1][var66];
                            int var80 = var12[var65][var66 + 1];
                            int var81 = var12[var65 + 1][var66 + 1];
                            if (var68 == 0) {
                                class190.method1442(var13, var65, var66, 0, 0, -1, var69, var71, var70, var72, class346.method2423((byte) -124, var75, var78), class346.method2423((byte) -128, var75, var79), class346.method2423((byte) -127, var75, var81), class346.method2423((byte) -128, var75, var80), 0, 0, 0, 0, var74, 0);
                                if (class43.field680 && var13 > 0 && var75 != -1 && class322.method2219(var67 - 1, 1).field502) {
                                    class14.method139(0, 0, true, false, var65, var66, var69 - class137.field2487[0][var65][var66], -class137.field2487[0][var65 + 1][var66] + var71, var70 - class137.field2487[0][var65 + 1][var66 + 1], -class137.field2487[0][var65][var66 + 1] + var72);
                                }
                                if (class43.field680 && !arg1 && class352.field5574 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= (var66 + 1); var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class193.field3230[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class354 var85 = class300.method2076(var84 - 1, -97);
                                                    if (var85.field5593 != -1 && class68.method653(-94, class62.field953.method1206((byte) -118, var85.field5593))) {
                                                        class352.field5574[var65][var66] = (var85.field5595 << 24) + var85.field5592;
                                                        continue label781;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var86 = class175.field2993[var13][var65][var66];
                                int var87 = class271.field4319[var13][var65][var66] + 1;
                                class354 var88 = class300.method2076(var68 - 1, -42);
                                if (class43.field680 && !arg1 && class352.field5574 != null && var13 == 0) {
                                    if (var88.field5593 != -1 && class68.method653(90, class62.field953.method1206((byte) 79, var88.field5593))) {
                                        class352.field5574[var65][var66] = (var88.field5595 << 24) + var88.field5592;
                                    } else {
                                        label762: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class193.field3230[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class354 var92 = class300.method2076(var91 - 1, -90);
                                                        if (var92.field5593 != -1 && class68.method653(-112, class62.field953.method1206((byte) -127, var92.field5593))) {
                                                            class352.field5574[var65][var66] = (var92.field5595 << 24) + var92.field5592;
                                                            break label762;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field5593;
                                if (var93 >= 0 && !class62.field953.method1226(var93, true)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = class62.field955[class24.method231(96, -3, class62.field953.method1220(var93, -97))];
                                    var95 = -1;
                                } else if (var88.field5588 == -1) {
                                    var95 = -2;
                                    var94 = 0;
                                } else {
                                    var95 = var88.field5588;
                                    int var96 = (var95 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var95 & 0xFC00) + (var95 & 0x380) + var96;
                                    var94 = class62.field955[class24.method231(96, -3, var97)];
                                }
                                if (var88.field5597 >= 0) {
                                    int var98 = var88.field5597;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var98 + var9 & 0xFC00) - (-(var98 & 0x380) - var99);
                                    var94 = class62.field955[class24.method231(96, -3, var100)];
                                }
                                class190.method1442(var13, var65, var66, var87, var86, var93, var69, var71, var70, var72, class346.method2423((byte) -123, var75, var78), class346.method2423((byte) -121, var75, var79), class346.method2423((byte) -124, var75, var81), class346.method2423((byte) -121, var75, var80), class24.method231(var78, -3, var95), class24.method231(var79, -3, var95), class24.method231(var81, -3, var95), class24.method231(var80, -3, var95), var74, var94);
                                if (class43.field680 && var13 > 0) {
                                    class14.method139(var87, var86, var95 == -2 || !var88.field5589, var75 == -1 || !class322.method2219(var67 - 1, 1).field502, var65, var66, var69 - class137.field2487[0][var65][var66], -class137.field2487[0][var65 + 1][var66] + var71, var70 - class137.field2487[0][var65 + 1][var66 + 1], -class137.field2487[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class43.field680) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class137.field2487[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class337[] var115 = class327.method2274(arg0, class271.field4319[var13], class193.field3230[var13], 66, var13, class175.field2993[var13], class255.field4110[0], var102, class152.field2683, var12, var11, var101, class352.field5574, var103, class137.field2487[var13], class310.field4912[var13]);
                            class69.method663(var13, var115);
                            break;
                        }
                        class337[] var110 = class327.method2274(arg0, class271.field4319[var13], class193.field3230[var13], 76, var13, class175.field2993[var13], (int[][]) null, var102, class152.field2683, var12, var11, var101, (int[][]) null, var103, class137.field2487[var13], class310.field4912[var13]);
                        class337[] var111 = class228.method1655(class271.field4319[var13], var12, var13, var101, class137.field2487[var13], class175.field2993[var13], class310.field4912[var13], var103, class152.field2683, var102, class193.field3230[var13], -31775);
                        class337[] var112 = new class337[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class69.method663(var13, var112);
                        class29.method272(class245.field3979, var103, class193.field3230[var13], (byte) -109, var101, var102, class271.field4319[var13], class245.field3975, class175.field2993[var13], class310.field4912[var13], var13, class137.field2487[var13]);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + (var108 * var108) + 65536));
                        var101[var106][var105] = (float) var107 / var109;
                        var103[var106][var105] = -256.0F / var109;
                        var102[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class310.field4912[var13] = (byte[][]) null;
            class193.field3230[var13] = (byte[][]) null;
            class271.field4319[var13] = (byte[][]) null;
            class175.field2993[var13] = (byte[][]) null;
            class224.field3745[var13] = (byte[][]) null;
        }
        class205.method1532(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class152.field2683[1][var116][var117] & 0x2) == 2) {
                    class190.method1443(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class226.field3798[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class226.field3798[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122;
                        for (var122 = var119; var122 < 104 && (class226.field3798[var118][var120][var122 + 1] & 0x1) != 0; var122++) {
                        }
                        int var123 = var118;
                        int var124;
                        label463: for (var124 = var118; var124 > 0; var124--) {
                            for (int var125 = var121; var125 <= var122; var125++) {
                                if ((class226.field3798[var124 - 1][var120][var125] & 0x1) == 0) {
                                    break label463;
                                }
                            }
                        }
                        label452: while (var123 < 3) {
                            for (int var126 = var121; var126 <= var122; var126++) {
                                if ((class226.field3798[var123 + 1][var120][var126] & 0x1) == 0) {
                                    break label452;
                                }
                            }
                            var123++;
                        }
                        int var127 = (var122 - (var121 - 1)) * (var123 + 1 - var124);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class137.field2487[var123][var120][var121] - var128;
                            int var130 = class137.field2487[var124][var120][var121];
                            class264.method1822(1, var120 * 128, var120 * 128, var121 * 128, var122 * 128 + 128, var129, var130);
                            for (int var131 = var124; var131 <= var123; var131++) {
                                for (int var132 = var121; var132 <= var122; var132++) {
                                    class226.field3798[var131][var120][var132] = class36.method319(class226.field3798[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class226.field3798[var118][var120][var119] & 0x2) != 0) {
                        int var133;
                        for (var133 = var120; var133 > 0 && (class226.field3798[var118][var133 - 1][var119] & 0x2) != 0; var133--) {
                        }
                        int var134;
                        for (var134 = var120; var134 < 104 && (class226.field3798[var118][var134 + 1][var119] & 0x2) != 0; var134++) {
                        }
                        int var135 = var118;
                        int var136 = var118;
                        label518: while (var135 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class226.field3798[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label518;
                                }
                            }
                            var135--;
                        }
                        label507: while (var136 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class226.field3798[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label507;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var136 - (var135 - 1)) * (var134 + 1 - var133);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class137.field2487[var135][var133][var119];
                            int var142 = class137.field2487[var136][var133][var119] - var140;
                            class264.method1822(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var142, var141);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class226.field3798[var143][var144][var119] = class36.method319(class226.field3798[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class226.field3798[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148 = var119;
                        while (var147 > 0 && (class226.field3798[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        while (var148 < 104 && (class226.field3798[var118][var120][var148 + 1] & 0x4) != 0) {
                            var148++;
                        }
                        label573: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class226.field3798[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label573;
                                }
                            }
                            var145--;
                        }
                        label562: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class226.field3798[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label562;
                                }
                            }
                            var146++;
                        }
                        if ((var148 + 1 - var147) * (var146 + 1 - var145) >= 4) {
                            int var151 = class137.field2487[var118][var145][var147];
                            class264.method1822(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class226.field3798[var118][var152][var153] = class36.method319(class226.field3798[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 1059)
    public class276() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[[I", line = 1073)
    public final int[][] method299(int arg0, int arg1) {
        field4395++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 117);
        if (this.field4958.field5463) {
            int var4 = class133.field2269;
            int var5 = class77.field1247;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4958.method2402((byte) -22);
            this.method1898((byte) -122, var6);
            for (int var8 = 0; var8 < class77.field1247; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class133.field2269; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class36.method319(4080, var15 << 4);
                    var11[var14] = class36.method319(65280, var15) >> 4;
                    var12[var14] = class36.method319(16711680, var15) >> 12;
                }
            }
        }
        if (arg1 != 2) {
            field4388 = (String) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lcg;I)V", line = 1138)
    public static final void method1900(class49 arg0, int arg1) {
        if (arg1 >= -116) {
            field4401 = (short[]) null;
        }
        class209.field3545 = arg0;
        field4389++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpi;)V", line = 1151)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field4393++;
        if (arg0 == 0) {
            this.field4390 = new class324[arg2.method2364(-9069)];
            for (int var4 = 0; var4 < this.field4390.length; var4++) {
                int var5 = arg2.method2364(-9069);
                if (var5 == 0) {
                    this.field4390[var4] = class331.method2299(arg2, (byte) 115);
                } else if (var5 == 1) {
                    this.field4390[var4] = class12.method114(-76, arg2);
                } else if (var5 == 2) {
                    this.field4390[var4] = class287.method1961(arg2, -122);
                } else if (var5 == 3) {
                    this.field4390[var4] = class89.method782(-120, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            field4397 = (class49) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V", line = 1229)
    public static void method1901(boolean arg0) {
        field4397 = null;
        field4400 = null;
        field4388 = null;
        if (arg0) {
            field4399 = 12;
        }
        field4392 = null;
        field4398 = null;
        field4401 = null;
    }
}
