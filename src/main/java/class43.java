import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 {

    @OriginalMember(owner = "client!pja", name = "l", descriptor = "Loaa;")
    private class305 field683;

    @OriginalMember(owner = "client!pja", name = "j", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!pja", name = "r", descriptor = "Lcja;")
    private class46 field689;

    @OriginalMember(owner = "client!pja", name = "k", descriptor = "F")
    public static float field682 = 1024.0F;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!pja", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!pja", name = "g", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!pja", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!pja", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!pja", name = "m", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!pja", name = "n", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!pja", name = "o", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!pja", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!pja", name = "q", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!pja", name = "s", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!pja", name = "t", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!pja", name = "u", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILha;II)V")
    public static final void method261(int arg0, class66 arg1, int arg2, int arg3) {
        field692++;
        if (arg0 < 0 || arg2 < 0 || class434.field5903 == 0 || class412.field5654 == 0 || arg3 <= 22) {
            return;
        }
        class650 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class618.field8597) {
            class479.method2742(-1, false);
            var4 = arg1.method539();
            int[] var5 = arg1.method496();
            var6 = var5[1];
            var7 = var5[2];
            var8 = var5[3];
            var9 = var5[0];
            var10 = class364.method2224(false, 10304) + arg0;
            var11 = class223.method1518(false, (byte) 16) + arg2;
        } else {
            arg1.method521(class398.field5482, class609.field8510, class434.field5903, class412.field5654);
            var8 = class412.field5654;
            var6 = class609.field8510;
            var9 = class398.field5482;
            var7 = class434.field5903;
            arg1.method512(class624.field8691, class651.field9024, class434.field5903, class412.field5654);
            var4 = arg1.method565();
            var4.method1882(class509.field6995, class551.field7559, class375.field5077, class518.field7042, class18.field431, class245.field3474);
            arg1.method503(var4);
            var10 = arg0;
            var11 = arg2;
        }
        if (var7 == 0) {
            var7 = 1;
        }
        class522.method2965(false, true);
        if (var8 == 0) {
            var8 = 1;
        }
        if (class142.field2418 != null && (!class675.field9384 || (class448.field6148 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg1.method552();
            int var15 = arg1.method563();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class507.field6967) {
                var17 = var16 = (var11 - var6) * class90.field1369 / var8;
                var19 = var18 = (var10 - var9) * class90.field1369 / var7;
            } else {
                var16 = (var11 - var6) * var15 / var8;
                var17 = (var11 - var6) * var14 / var8;
                var18 = (var10 - var9) * var15 / var7;
                var19 = (var10 - var9) * var14 / var7;
            }
            int[] var20 = new int[] { var19, var17, var14 };
            var4.method1885(var20);
            int[] var21 = new int[] { var18, var16, var15 };
            var4.method1885(var21);
            float var22 = class784.method4283(-1, (float) var21[0], 4, (float) var20[0], (float) var20[2], (float) var21[2], (float) var20[1], (float) var21[1]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class235.field3379.method2342((byte) 107) - 1 << 8) >> 9;
                var13 = (class235.field3379.method2342((byte) -68) - 1 << 8) + var26 >> 9;
                byte var27 = class235.field3379.field7391;
                if (var27 < 3 && (class554.field7832[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class675.field9384 && (class448.field6148 & 0x40) != 0) {
                    class17 var28 = class326.method2066(class657.field9100, class342.field4609, 107);
                    if (var28 == null) {
                        class200.method1443(false);
                    } else {
                        class596.method3396(true, true, -1, class340.field4584, var13, 0L, " ->", 20, class508.field6980, (long) (var13 | var12 << 0), (byte) 34, false, var12);
                    }
                } else {
                    if (class526.field7145) {
                        class596.method3396(true, true, -1, -1, var13, 0L, "", 50, class641.field8845.method3566((byte) -104, class464.field6309), (long) (var13 | var12 << 0), (byte) 34, false, var12);
                    }
                    class596.method3396(true, true, -1, class229.field3332, var13, 0L, "", 16, class709.field9751, (long) (var12 << 0 | var13), (byte) 34, false, var12);
                    class494.field6776++;
                }
            }
        }
        if (class618.field8597) {
            class187.method1382(49);
        }
        for (int var29 = 0; var29 < (class618.field8597 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class375 var31 = var30 ? class677.field9437 : class313.field4273;
            int var32 = arg0;
            int var33 = arg2;
            if (class618.field8597) {
                class479.method2742(-1, var30);
                var32 = arg0 + class364.method2224(var30, 10304);
                var33 = arg2 + class223.method1518(var30, (byte) 109);
            }
            class239 var34 = var31.field5078;
            for (class186 var35 = (class186) var34.method1597((byte) 125); var35 != null; var35 = (class186) var34.method1601(91)) {
                if ((class195.field2971 || class235.field3379.field7391 == var35.field2878.field7391) && var35.method1380(var33, arg1, 0, var32)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field2878 instanceof class597)) {
                        var38 = ((class597) var35.field2878).field8368;
                        var39 = ((class597) var35.field2878).field8369;
                    } else {
                        var38 = var35.field2878.field7396 >> 9;
                        var39 = var35.field2878.field7398 >> 9;
                    }
                    if (var35.field2878 instanceof class771) {
                        class771 var40 = (class771) var35.field2878;
                        int var41 = var40.method2342((byte) 113);
                        if ((var41 & 0x1) == 0 && (var40.field7396 & 0x1FF) == 0 && (var40.field7398 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field7396 & 0x1FF) == 256 && (var40.field7398 & 0x1FF) == 256) {
                            int var42 = var40.field7396 - (var40.method2342((byte) 118) - 1 << 8);
                            int var43 = var40.field7398 - (var40.method2342((byte) -55) - 1 << 8);
                            for (int var44 = 0; var44 < class610.field8520; var44++) {
                                class755 var51 = (class755) class664.field9216.method337((long) class744.field10273[var44], 1);
                                if (var51 != null) {
                                    class666 var52 = var51.field10414;
                                    if (class440.field5977 != var52.field5212 && var52.field5229) {
                                        int var53 = var52.field7396 - (var52.field9253.field8076 - 1 << 8);
                                        int var54 = var52.field7398 - (var52.field9253.field8076 - 1 << 8);
                                        if (var53 >= var42 && var52.field9253.field8076 <= (var40.method2342((byte) 105) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field9253.field8076 <= var40.method2342((byte) 6) - (var54 - var43 >> 9)) {
                                            class405.method2423(class235.field3379.field7391 != var35.field2878.field7391, false, var52);
                                            var52.field5212 = class440.field5977;
                                        }
                                    }
                                }
                            }
                            int var45 = class696.field9624;
                            int[] var46 = class417.field5700;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class771 var48 = class527.field7150[var46[var47]];
                                if (var48 != null && class440.field5977 != var48.field5212 && var40 != var48 && var48.field5229) {
                                    int var49 = var48.field7396 - (var48.method2342((byte) 121) - 1 << 8);
                                    int var50 = var48.field7398 - (var48.method2342((byte) 117) - 1 << 8);
                                    if (var42 <= var49 && var48.method2342((byte) 100) <= (var40.method2342((byte) 9) - (var49 - var42 >> 9)) && var50 >= var43 && var48.method2342((byte) -125) <= var40.method2342((byte) -1) - (var50 - var43 >> 9)) {
                                        class692.method3872((byte) -45, var48, class235.field3379.field7391 != var35.field2878.field7391);
                                        var48.field5212 = class440.field5977;
                                    }
                                }
                            }
                        }
                        if (class440.field5977 == var40.field5212) {
                            continue;
                        }
                        class692.method3872((byte) -45, var40, class235.field3379.field7391 != var35.field2878.field7391);
                        var40.field5212 = class440.field5977;
                    }
                    if (var35.field2878 instanceof class666) {
                        class666 var55 = (class666) var35.field2878;
                        if (var55.field9253 != null) {
                            if ((var55.field9253.field8076 & 0x1) == 0 && (var55.field7396 & 0x1FF) == 0 && (var55.field7398 & 0x1FF) == 0 || (var55.field9253.field8076 & 0x1) == 1 && (var55.field7396 & 0x1FF) == 256 && (var55.field7398 & 0x1FF) == 256) {
                                int var56 = var55.field7396 - (var55.field9253.field8076 - 1 << 8);
                                int var57 = var55.field7398 - (var55.field9253.field8076 - 1 << 8);
                                for (int var58 = 0; var58 < class610.field8520; var58++) {
                                    class755 var65 = (class755) class664.field9216.method337((long) class744.field10273[var58], 1);
                                    if (var65 != null) {
                                        class666 var66 = var65.field10414;
                                        if (class440.field5977 != var66.field5212 && var55 != var66 && var66.field5229) {
                                            int var67 = var66.field7396 - (var66.field9253.field8076 - 1 << 8);
                                            int var68 = var66.field7398 - (var66.field9253.field8076 - 1 << 8);
                                            if (var67 >= var56 && var55.field9253.field8076 - (var67 - var56 >> 9) >= var66.field9253.field8076 && var57 <= var68 && var66.field9253.field8076 <= var55.field9253.field8076 - (var68 - var57 >> 9)) {
                                                class405.method2423(class235.field3379.field7391 != var35.field2878.field7391, false, var66);
                                                var66.field5212 = class440.field5977;
                                            }
                                        }
                                    }
                                }
                                int var59 = class696.field9624;
                                int[] var60 = class417.field5700;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class771 var62 = class527.field7150[var60[var61]];
                                    if (var62 != null && class440.field5977 != var62.field5212 && var62.field5229) {
                                        int var63 = var62.field7396 - (var62.method2342((byte) -76) - 1 << 8);
                                        int var64 = var62.field7398 - (var62.method2342((byte) 87) - 1 << 8);
                                        if (var56 <= var63 && var62.method2342((byte) -38) <= (var55.field9253.field8076 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method2342((byte) 90) <= (var55.field9253.field8076 - (var64 - var57 >> 9))) {
                                            class692.method3872((byte) -45, var62, class235.field3379.field7391 != var35.field2878.field7391);
                                            var62.field5212 = class440.field5977;
                                        }
                                    }
                                }
                            }
                            if (class440.field5977 == var55.field5212) {
                                continue;
                            }
                            class405.method2423(class235.field3379.field7391 != var35.field2878.field7391, false, var55);
                            var55.field5212 = class440.field5977;
                        }
                    }
                    if (var35.field2878 instanceof class205) {
                        int var69 = class217.field3198 + var38;
                        int var70 = class400.field5510 + var39;
                        class234 var71 = (class234) class214.field3181.method337((long) (var70 << 14 | var35.field2878.field7391 << 28 | var69), 1);
                        if (var71 != null) {
                            int var72 = 0;
                            for (class348 var73 = (class348) var71.field3367.method3588((byte) -72); var73 != null; var73 = (class348) var71.field3367.method3592(0)) {
                                class730 var74 = class143.field2427.method1410((byte) 115, var73.field4694);
                                if (class675.field9384 && class235.field3379.field7391 == var35.field2878.field7391) {
                                    class485 var75 = class220.field3234 == -1 ? null : class117.field2153.method1159((byte) -36, class220.field3234);
                                    if ((class448.field6148 & 0x1) != 0 && (var75 == null || var74.method4061(var75.field6560, (byte) 92, class220.field3234) != var75.field6560)) {
                                        class346.field4663++;
                                        class596.method3396(true, false, -1, class340.field4584, var39, (long) var73.field4694, class420.field5726 + " -> <col=ff9040>" + var74.field10079, 13, class508.field6980, (long) var72, (byte) 34, false, var38);
                                    }
                                }
                                if (class235.field3379.field7391 == var35.field2878.field7391) {
                                    String[] var76 = var74.field10017;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class412.field5655;
                                            if (var77 == 0) {
                                                var78 = 11;
                                            }
                                            if (var77 == 1) {
                                                var78 = 19;
                                            }
                                            if (var77 == 2) {
                                                var78 = 47;
                                            }
                                            if (var77 == 3) {
                                                var78 = 30;
                                            }
                                            if (var77 == 4) {
                                                var78 = 48;
                                            }
                                            if (var74.field10048 == var77) {
                                                var79 = var74.field10033;
                                            }
                                            if (var74.field10043 == var77) {
                                                var79 = var74.field10072;
                                            }
                                            class271.field3793++;
                                            class596.method3396(true, false, -1, var79, var39, (long) var73.field4694, "<col=ff9040>" + var74.field10079, var78, var76[var77], (long) var72, (byte) 34, false, var38);
                                        }
                                    }
                                }
                                class383.field5199++;
                                class596.method3396(true, false, -1, class180.field2826, var39, (long) var73.field4694, "<col=ff9040>" + var74.field10079, 1002, class641.field8840.method3566((byte) -102, class464.field6309), (long) var72, (byte) 34, class235.field3379.field7391 != var35.field2878.field7391, var38);
                                var72++;
                            }
                        }
                    }
                    if (var35.field2878 instanceof class237) {
                        class237 var80 = (class237) var35.field2878;
                        class445 var81 = class414.field5670.method2319(var80.method1032(false), false);
                        if (var81.field6028 != null) {
                            var81 = var81.method2580(72, class694.field9613);
                        }
                        if (var81 != null) {
                            if (class675.field9384 && class235.field3379.field7391 == var35.field2878.field7391) {
                                class485 var82 = class220.field3234 == -1 ? null : class117.field2153.method1159((byte) -108, class220.field3234);
                                if ((class448.field6148 & 0x4) != 0 && (var82 == null || var81.method2583(var82.field6560, class220.field3234, -1) != var82.field6560)) {
                                    class789.field10823++;
                                    class596.method3396(true, false, -1, class340.field4584, var39, class734.method4073(var80, var39, false, var38), class420.field5726 + " -> <col=00ffff>" + var81.field6114, 49, class508.field6980, (long) var80.hashCode(), (byte) 34, false, var38);
                                }
                            }
                            if (class235.field3379.field7391 == var35.field2878.field7391) {
                                String[] var83 = var81.field6097;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 53;
                                            }
                                            int var86 = class412.field5655;
                                            if (var84 == 1) {
                                                var85 = 59;
                                            }
                                            if (var84 == 2) {
                                                var85 = 12;
                                            }
                                            if (var84 == 3) {
                                                var85 = 21;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1010;
                                            }
                                            if (var81.field6051 == var84) {
                                                var86 = var81.field6038;
                                            }
                                            if (var81.field6103 == var84) {
                                                var86 = var81.field6109;
                                            }
                                            class596.method3396(true, false, -1, var86, var39, class734.method4073(var80, var39, false, var38), "<col=00ffff>" + var81.field6114, var85, var83[var84], (long) var80.hashCode(), (byte) 34, false, var38);
                                            class497.field6796++;
                                        }
                                    }
                                }
                                class422.field5788++;
                                class596.method3396(true, false, -1, class180.field2826, var39, (long) var81.field6104, "<col=00ffff>" + var81.field6114, 1007, class641.field8840.method3566((byte) 119, class464.field6309), (long) var80.hashCode(), (byte) 34, class235.field3379.field7391 != var35.field2878.field7391, var38);
                            }
                        }
                    }
                }
            }
            if (class618.field8597) {
                class187.method1382(63);
            }
        }
        class522.method2965(false, false);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(B)V")
    public static final void method262(byte arg0) {
        field677++;
        while (class262.field3679.method2074(class11.field179, (byte) -111) >= 15) {
            int var1 = class262.field3679.method2078(15, 15455);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class755 var3 = (class755) class664.field9216.method337((long) var1, 1);
            if (var3 == null) {
                class666 var4 = new class666();
                var4.field5288 = var1;
                var3 = new class755(var4);
                class664.field9216.method341((long) var1, var3, (byte) 126);
                class491.field6712[class406.field5583++] = var3;
                var2 = true;
            }
            class666 var5 = var3.field10414;
            class744.field10273[class610.field8520++] = var1;
            var5.field5258 = class475.field6431;
            if (var5.field9253 != null && var5.field9253.method3288(-1)) {
                class33.method199(true, var5);
            }
            int var6 = class262.field3679.method2078(3, 15455) + 4 << 11 & 0x3FB0;
            int var7 = class262.field3679.method2078(1, 15455);
            int var8 = class262.field3679.method2078(5, 15455);
            var5.method3764(35, class495.field6783.method2005(6, class262.field3679.method2078(14, 15455)));
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class262.field3679.method2078(2, 15455);
            int var10 = class262.field3679.method2078(5, 15455);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class262.field3679.method2078(1, 15455);
            if (var11 == 1) {
                class449.field6154[class614.field8549++] = var1;
            }
            var5.method2338(-116, var5.field9253.field8076);
            var5.field5225 = var5.field9253.field8058 << 3;
            if (var2) {
                var5.method2340(45, var6, true);
            }
            var5.method3766(class235.field3379.field5308[0] + var10, var9, var5.method2342((byte) -46), class235.field3379.field5304[0] + var8, 108, var7 == 1);
            if (var5.field9253.method3288(-1)) {
                class129.method1095(var5.field5308[0], var5.field7391, null, 0, var5.field5304[0], null, var5, (byte) 59);
            }
        }
        int var12 = -66 / ((arg0 - 3) / 56);
        class262.field3679.method2081(false);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)I")
    public final int method263(boolean arg0) {
        field687++;
        int var2 = 0;
        for (class320 var3 = (class320) this.field683.method1951(-723780560); var3 != null; var3 = (class320) this.field683.method1946(-6974)) {
            if (!var3.method1511(32404)) {
                var2++;
            }
        }
        if (!arg0) {
            this.field674 = -31;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(I)V")
    public class43(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "(B)I")
    public final int method264(byte arg0) {
        field672++;
        if (arg0 < 103) {
            field688 = -61;
        }
        return this.field674;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
    public final void method265(int arg0, int arg1) {
        field680++;
        if (class762.field10490 != null) {
            for (class320 var3 = (class320) this.field683.method1951(-723780560); var3 != null; var3 = (class320) this.field683.method1946(-6974)) {
                if (var3.method1511(32404)) {
                    if (var3.method1512((byte) 64) == null) {
                        var3.method1207(113);
                        var3.method2942(false);
                        this.field681 += var3.field4367;
                    }
                } else if ((long) arg0 < ++var3.field7008) {
                    class320 var4 = class762.field10490.method2835(-124, var3);
                    this.field689.method341(var3.field2528, var4, (byte) 86);
                    class21.method139(var3, 128, var4);
                    var3.method1207(99);
                    var3.method2942(false);
                }
            }
        }
        if (arg1 > -11) {
            this.method268((byte) -63);
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method266(byte arg0, long arg1) {
        field676++;
        class320 var4 = (class320) this.field689.method337(arg1, 1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1512((byte) -122);
        if (var5 == null) {
            var4.method1207(86);
            var4.method2942(false);
            this.field681 += var4.field4367;
            return null;
        }
        if (arg0 >= -97) {
            this.method273(50);
        }
        if (var4.method1511(32404)) {
            class768 var6 = new class768(var5, var4.field4367);
            this.field689.method341(var4.field2528, var6, (byte) 40);
            this.field683.method1953((byte) 83, var6);
            var6.field7008 = 0L;
            var4.method1207(80);
            var4.method2942(false);
        } else {
            this.field683.method1953((byte) 83, var4);
            var4.field7008 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
    public final void method267(int arg0, Object arg1, long arg2, int arg3) {
        field673++;
        if (this.field674 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method271(arg2, arg3 + 26391);
        this.field681 -= arg0;
        while (this.field681 < 0) {
            class320 var7 = (class320) this.field683.method1948(true);
            this.method274(var7, 0);
        }
        class768 var6 = new class768(arg1, arg0);
        this.field689.method341(arg2, var6, (byte) 65);
        this.field683.method1953((byte) 83, var6);
        if (arg3 == -26519) {
            var6.field7008 = 0L;
        }
    }

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method268(byte arg0) {
        int var2 = -8 / ((arg0 - 89) / 33);
        field690++;
        class320 var3 = (class320) this.field689.method336(84);
        while (var3 != null) {
            Object var4 = var3.method1512((byte) -122);
            if (var4 != null) {
                return var4;
            }
            class320 var5 = var3;
            var3 = (class320) this.field689.method336(81);
            var5.method1207(89);
            var5.method2942(false);
            this.field681 += var5.field4367;
        }
        return null;
    }

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "(Z)I")
    public final int method269(boolean arg0) {
        if (arg0) {
            field682 = 0.4737389F;
        }
        field679++;
        return this.field681;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method270(Object arg0, long arg1, int arg2) {
        field684++;
        if (arg2 >= -121) {
            this.field683 = null;
        }
        this.method267(1, arg0, arg1, -26519);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(JI)V")
    private final void method271(long arg0, int arg1) {
        field678++;
        class320 var4 = (class320) this.field689.method337(arg0, 1);
        this.method274(var4, 0);
        int var5 = 53 / ((arg1 + 53) / 60);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
    public final void method272(int arg0) {
        for (class320 var2 = (class320) this.field683.method1951(-723780560); var2 != null; var2 = (class320) this.field683.method1946(-6974)) {
            if (var2.method1511(32404)) {
                var2.method1207(110);
                var2.method2942(false);
                this.field681 += var2.field4367;
            }
        }
        if (arg0 == 20) {
            field691++;
        }
    }

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
    public final void method273(int arg0) {
        field685++;
        int var2 = 88 / ((arg0 - 73) / 53);
        this.field683.method1950(0);
        this.field689.method338((byte) -93);
        this.field681 = this.field674;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lcaa;I)V")
    private final void method274(class320 arg0, int arg1) {
        if (arg1 != 0) {
            this.method263(true);
        }
        field686++;
        if (arg0 != null) {
            arg0.method1207(arg1 + 108);
            arg0.method2942(false);
            this.field681 += arg0.field4367;
        }
    }

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method275(byte arg0) {
        field675++;
        class320 var2 = (class320) this.field689.method335(-29067);
        while (var2 != null) {
            Object var3 = var2.method1512((byte) 119);
            if (var3 != null) {
                return var3;
            }
            class320 var4 = var2;
            var2 = (class320) this.field689.method336(97);
            var4.method1207(104);
            var4.method2942(false);
            this.field681 += var4.field4367;
        }
        if (arg0 > -83) {
            this.method274(null, 81);
        }
        return null;
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(II)V")
    public class43(int arg0, int arg1) {
        this.field683 = new class305();
        this.field681 = arg0;
        this.field674 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
        }
        this.field689 = new class46(var3);
    }
}
