import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class431 {

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5904 = 0;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lmga;")
    public static class666 field5902 = new class666(8);

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "F")
    public static float field5905;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "[[[B")
    public static byte[][][] field5903;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILoa;II)V")
    public static final void method2451(int arg0, class651 arg1, int arg2, int arg3) {
        field5901++;
        if (arg2 < arg0 || arg3 < 0 || class168.field2598 == 0 || class525.field7000 == 0) {
            return;
        }
        arg1.method373(class695.field9757, class362.field4874, class168.field2598, class525.field7000);
        arg1.method421(class164.field2572, class484.field6548, class168.field2598, class525.field7000);
        class397 var4 = arg1.method466();
        var4.method557(class287.field4062, class524.field6992, class346.field4758, class213.field3046, class484.field6546, class87.field1322);
        arg1.method405(var4);
        if (class684.field9625 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method464();
            int var8 = (arg2 - class695.field9757) * var7 / class168.field2598;
            int var9 = (arg3 - class362.field4874) * var7 / class525.field7000;
            int var10 = arg1.method411();
            int var11 = (arg2 - class695.field9757) * var10 / class168.field2598;
            int var12 = (arg3 - class362.field4874) * var10 / class525.field7000;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method569(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method569(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class34.field530 > var20 && class34.field531 > var22) {
                    int var23 = class199.field2897.field8609;
                    if (var23 < 3 && (class477.field6362[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class684.field9625[var23].method200(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class199.field2897.method2317((byte) 40) - 1 << 8) + var19 >> 9;
                        var6 = (class199.field2897.method2317((byte) 40) - 1 << 8) + var21 >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class400.field5305 && (class658.field9093 & 0x40) != 0) {
                    class625 var24 = class457.method2609(class255.field3536, class522.field6979, (byte) -92);
                    if (var24 == null) {
                        class671.method3761(1);
                    } else {
                        class483.method2701(var6, false, true, " ->", 0L, 17, var5, -1, class425.field5847, class680.field9585, 6967);
                    }
                } else {
                    if (class488.field6599 == class392.field5166) {
                        class483.method2701(var6, false, true, "", 0L, 2, var5, -1, -1, class72.field1091.method546(class516.field6892, (byte) -35), 6967);
                    }
                    class153.field2407++;
                    class483.method2701(var6, false, true, "", 0L, 58, var5, -1, class216.field3083, class148.field2364, 6967);
                }
            }
        }
        class47 var25 = class670.field9502;
        for (class571 var26 = (class571) var25.method328(arg0); var26 != null; var26 = (class571) var25.method331((byte) -52)) {
            if ((class384.field5117 || class199.field2897.field8609 == var26.field7580) && var26.method3137(arg3, (byte) 125, arg1, arg2)) {
                if (var26.field7578 instanceof class403) {
                    class403 var27 = (class403) var26.field7578;
                    int var28 = var27.method2317((byte) 40);
                    if ((var28 & 0x1) == 0 && (var27.field8620 & 0x1FF) == 0 && (var27.field8612 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field8620 & 0x1FF) == 256 && (var27.field8612 & 0x1FF) == 256) {
                        int var29 = var27.field8620 - (var27.method2317((byte) 40) - 1 << 8);
                        int var30 = var27.field8612 - (var27.method2317((byte) 40) - 1 << 8);
                        for (int var31 = 0; var31 < class92.field1396; var31++) {
                            class280 var38 = (class280) class616.field8143.method2918((long) class415.field5681[var31], (byte) -8);
                            if (var38 != null) {
                                class287 var39 = var38.field3983;
                                if (class642.field8626 != var39.field5622 && var39.field5564) {
                                    int var40 = var39.field8620 - (var39.field4052.field5738 - 1 << 8);
                                    int var41 = var39.field8612 - (var39.field4052.field5738 - 1 << 8);
                                    if (var29 <= var40 && var39.field4052.field5738 <= var27.method2317((byte) 40) - (var40 - var29 >> 9) && var30 <= var41 && var39.field4052.field5738 <= (var27.method2317((byte) 40) - (var41 - var30 >> 9))) {
                                        class178.method1195(var39, 0, class199.field2897.field8609 != var26.field7580);
                                        var39.field5622 = class642.field8626;
                                    }
                                }
                            }
                        }
                        int var32 = class664.field9426;
                        int[] var33 = class55.field762;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class403 var35 = class572.field7601[var33[var34]];
                            if (var35 != null && class642.field8626 != var35.field5622 && var27 != var35 && var35.field5564) {
                                int var36 = var35.field8620 - (var35.method2317((byte) 40) - 1 << 8);
                                int var37 = var35.field8612 - (var35.method2317((byte) 40) - 1 << 8);
                                if (var29 <= var36 && var35.method2317((byte) 40) <= (var27.method2317((byte) 40) - (var36 - var29 >> 9)) && var30 <= var37 && var35.method2317((byte) 40) <= (var27.method2317((byte) 40) - (var37 - var30 >> 9))) {
                                    class634.method3501(class199.field2897.field8609 != var26.field7580, var35, true);
                                    var35.field5622 = class642.field8626;
                                }
                            }
                        }
                    }
                    if (class642.field8626 == var27.field5622) {
                        continue;
                    }
                    class634.method3501(class199.field2897.field8609 != var26.field7580, var27, true);
                    var27.field5622 = class642.field8626;
                }
                if (var26.field7578 instanceof class287) {
                    class287 var42 = (class287) var26.field7578;
                    if (var42.field4052 != null) {
                        if ((var42.field4052.field5738 & 0x1) == 0 && (var42.field8620 & 0x1FF) == 0 && (var42.field8612 & 0x1FF) == 0 || (var42.field4052.field5738 & 0x1) == 1 && (var42.field8620 & 0x1FF) == 256 && (var42.field8612 & 0x1FF) == 256) {
                            int var43 = var42.field8620 - (var42.field4052.field5738 - 1 << 8);
                            int var44 = var42.field8612 - (var42.field4052.field5738 - 1 << 8);
                            for (int var45 = 0; var45 < class92.field1396; var45++) {
                                class280 var52 = (class280) class616.field8143.method2918((long) class415.field5681[var45], (byte) -125);
                                if (var52 != null) {
                                    class287 var53 = var52.field3983;
                                    if (class642.field8626 != var53.field5622 && var42 != var53 && var53.field5564) {
                                        int var54 = var53.field8620 - (var53.field4052.field5738 - 1 << 8);
                                        int var55 = var53.field8612 - (var53.field4052.field5738 - 1 << 8);
                                        if (var54 >= var43 && var42.field4052.field5738 - (var54 - var43 >> 9) >= var53.field4052.field5738 && var55 >= var44 && var53.field4052.field5738 <= var42.field4052.field5738 - (var55 - var44 >> 9)) {
                                            class178.method1195(var53, 0, class199.field2897.field8609 != var26.field7580);
                                            var53.field5622 = class642.field8626;
                                        }
                                    }
                                }
                            }
                            int var46 = class664.field9426;
                            int[] var47 = class55.field762;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class403 var49 = class572.field7601[var47[var48]];
                                if (var49 != null && class642.field8626 != var49.field5622 && var49.field5564) {
                                    int var50 = var49.field8620 - (var49.method2317((byte) 40) - 1 << 8);
                                    int var51 = var49.field8612 - (var49.method2317((byte) 40) - 1 << 8);
                                    if (var50 >= var43 && var49.method2317((byte) 40) <= (var42.field4052.field5738 - (var50 - var43 >> 9)) && var44 <= var51 && var49.method2317((byte) 40) <= var42.field4052.field5738 - (var51 - var44 >> 9)) {
                                        class634.method3501(class199.field2897.field8609 != var26.field7580, var49, true);
                                        var49.field5622 = class642.field8626;
                                    }
                                }
                            }
                        }
                        if (class642.field8626 == var42.field5622) {
                            continue;
                        }
                        class178.method1195(var42, 0, class199.field2897.field8609 != var26.field7580);
                        var42.field5622 = class642.field8626;
                    }
                }
                if (var26.field7578 instanceof class153) {
                    int var56 = var26.field7583 + class473.field6334;
                    int var57 = class233.field3269 + var26.field7579;
                    class354 var58 = (class354) class262.field3643.method2918((long) (var57 << 14 | var26.field7580 << 28 | var56), (byte) 114);
                    if (var58 != null) {
                        for (class418 var59 = (class418) var58.field4816.method3264((byte) 68); var59 != null; var59 = (class418) var58.field4816.method3256(arg0 ^ 0xFFFFFFBB)) {
                            class577 var60 = class193.field2826.method1047(var59.field5719, -1);
                            if (class400.field5305 && class199.field2897.field8609 == var26.field7580) {
                                class538 var61 = class2.field26 == -1 ? null : class282.field4001.method3062((byte) -124, class2.field26);
                                if ((class658.field9093 & 0x1) != 0 && (var61 == null || var60.method3166(class2.field26, (byte) 14, var61.field7101) != var61.field7101)) {
                                    class483.method2701(var26.field7579, false, true, class214.field3060 + " -> <col=ff9040>" + var60.field7679, (long) var59.field5719, 25, var26.field7583, -1, class425.field5847, class680.field9585, 6967);
                                    class483.field6536++;
                                }
                            }
                            if (class199.field2897.field8609 == var26.field7580) {
                                String[] var62 = var60.field7616;
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        byte var64 = 0;
                                        if (var63 == 0) {
                                            var64 = 8;
                                        }
                                        int var65 = class294.field4165;
                                        if (var63 == 1) {
                                            var64 = 20;
                                        }
                                        if (var63 == 2) {
                                            var64 = 18;
                                        }
                                        if (var63 == 3) {
                                            var64 = 44;
                                        }
                                        if (var63 == 4) {
                                            var64 = 51;
                                        }
                                        if (var60.field7634 == var63) {
                                            var65 = var60.field7630;
                                        }
                                        if (var60.field7657 == var63) {
                                            var65 = var60.field7667;
                                        }
                                        class288.field4072++;
                                        class483.method2701(var26.field7579, false, true, "<col=ff9040>" + var60.field7679, (long) var59.field5719, var64, var26.field7583, -1, var65, var62[var63], arg0 + 6967);
                                    }
                                }
                            }
                            class625.field8304++;
                            class483.method2701(var26.field7579, class199.field2897.field8609 != var26.field7580, true, "<col=ff9040>" + var60.field7679, (long) var59.field5719, 1012, var26.field7583, -1, class383.field5116, class72.field1086.method546(class516.field6892, (byte) -35), arg0 + 6967);
                        }
                    }
                }
                if (var26.field7578 instanceof class532) {
                    class532 var66 = (class532) var26.field7578;
                    class58 var67 = class470.field6288.method1258(var66.method146(false), (byte) -30);
                    if (var67.field888 != null) {
                        var67 = var67.method486((byte) -113, class80.field1261);
                    }
                    if (var67 != null) {
                        if (class400.field5305 && class199.field2897.field8609 == var26.field7580) {
                            class538 var68 = class2.field26 == -1 ? null : class282.field4001.method3062((byte) -100, class2.field26);
                            if ((class658.field9093 & 0x4) != 0 && (var68 == null || var67.method468((byte) 107, var68.field7101, class2.field26) != var68.field7101)) {
                                class645.field8656++;
                                class483.method2701(var26.field7579, false, true, class214.field3060 + " -> <col=00ffff>" + var67.field830, class698.method3864(var66, 106, var26.field7583, var26.field7579), 16, var26.field7583, -1, class425.field5847, class680.field9585, 6967);
                            }
                        }
                        if (class199.field2897.field8609 == var26.field7580) {
                            String[] var69 = var67.field852;
                            if (var69 != null) {
                                for (int var70 = 4; var70 >= 0; var70--) {
                                    if (var69[var70] != null) {
                                        short var71 = 0;
                                        int var72 = class294.field4165;
                                        if (var70 == 0) {
                                            var71 = 3;
                                        }
                                        if (var70 == 1) {
                                            var71 = 13;
                                        }
                                        if (var70 == 2) {
                                            var71 = 49;
                                        }
                                        if (var70 == 3) {
                                            var71 = 11;
                                        }
                                        if (var70 == 4) {
                                            var71 = 1004;
                                        }
                                        if (var67.field829 == var70) {
                                            var72 = var67.field856;
                                        }
                                        if (var67.field864 == var70) {
                                            var72 = var67.field866;
                                        }
                                        class483.method2701(var26.field7579, false, true, "<col=00ffff>" + var67.field830, class698.method3864(var66, 112, var26.field7583, var26.field7579), var71, var26.field7583, -1, var72, var69[var70], arg0 ^ 0x1B37);
                                        class133.field2181++;
                                    }
                                }
                            }
                        }
                        class122.field2033++;
                        class483.method2701(var26.field7579, class199.field2897.field8609 != var26.field7580, true, "<col=00ffff>" + var67.field830, (long) var67.field824, 1010, var26.field7583, -1, class383.field5116, class72.field1086.method546(class516.field6892, (byte) -35), 6967);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2452(int arg0) {
        field5902 = null;
        if (arg0 > 5) {
            field5903 = null;
        }
    }
}
