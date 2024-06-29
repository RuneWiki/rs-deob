import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class170 extends class173 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "[I")
    public static int[] field3244 = new int[5];

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3238;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3236;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "[Lji;")
    public static class106[] field3241;

    @OriginalMember(owner = "client!pg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3236 = arg0;
        arg0.setDimensions(super.field3299, super.field3297);
        arg0.setProperties((Hashtable) null);
        ++field3230;
        arg0.setColorModel(this.field3238);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3239;
        return this.field3236 == arg0;
    }

    @OriginalMember(owner = "client!pg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3236 == arg0) {
            this.field3236 = null;
        }
        ++field3243;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg8 && arg2 == arg3 && ~arg7 == ~arg9 && ~arg0 == ~arg6) {
            class120.method824(arg6, arg7, arg3, arg8, arg5, (byte) 121);
        } else {
            int var10 = arg8;
            int var11 = arg3;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg1 * 3;
            int var15 = arg3 * 3;
            int var16 = arg9 * 3;
            int var17 = -var16 + var14 + -arg8 + arg7;
            int var18 = arg0 * 3;
            int var19 = -var18 - arg3 + arg6 + var13;
            int var20 = -var14 + var16 - var14 + var12;
            int var21 = var15 + var18 - (var13 + var13);
            int var22 = var14 - var12;
            int var23 = -var15 + var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var29 - -var31 + var28 >> 12) + arg3;
                int var34 = (var27 + var32 - -var30 >> 12) + arg8;
                class120.method824(var33, var34, var11, var10, arg5, (byte) 126);
                var10 = var34;
                var11 = var33;
            }
        }
        ++field3245;
        if (arg4 < 37) {
            field3241 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3227;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lp;IZ)V")
    public static final void method1149(class163[] arg0, int arg1, boolean arg2) {
        if (arg1 == -7396) {
            byte var3;
            if (arg2) {
                var3 = 1;
            } else {
                var3 = 4;
            }
            ++field3226;
            if (!arg2) {
                for (int var4 = 0; var4 < 4; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        for (int var6 = 0; ~var6 > -105; ++var6) {
                            if (~(class193.field3602[var4][var5][var6] & 1) == -2) {
                                int var7 = var4;
                                if (~(2 & class193.field3602[1][var5][var6]) == -3) {
                                    var7 = var4 - 1;
                                }
                                if (~var7 <= -1) {
                                    arg0[var7].method1090((byte) 111, var6, var5);
                                }
                            }
                        }
                    }
                }
                class140.field2716 += (int) (Math.random() * 5.0D) + -2;
                class78.field1379 += -2 + (int) (5.0D * Math.random());
                if (~class78.field1379 > 7) {
                    class78.field1379 = -8;
                }
                if (class140.field2716 < -16) {
                    class140.field2716 = -16;
                }
                if (~class140.field2716 < -17) {
                    class140.field2716 = 16;
                }
                if (class78.field1379 > 8) {
                    class78.field1379 = 8;
                }
            }
            int var8 = class78.field1379 >> 2 << 10;
            int var9 = class140.field2716 >> 1;
            int[][] var10 = new int[104][104];
            int[][] var11 = new int[104][104];
            for (int var12 = 0; ~var3 < ~var12; ++var12) {
                byte[][] var55 = class190.field3521[var12];
                byte var56 = 74;
                short var57 = 768;
                int var58 = (int) Math.sqrt(5100.0D);
                int var59 = var57 * var58 >> 8;
                for (int var60 = 1; var60 < 103; ++var60) {
                    for (int var108 = 1; var108 < 103; ++var108) {
                        int var110 = class39.field808[var12][var108 + 1][var60] - class39.field808[var12][var108 + -1][var60];
                        int var111 = class39.field808[var12][var108][var60 + 1] + -class39.field808[var12][var108][var60 + -1];
                        int var112 = (int) Math.sqrt((double) (var110 * var110 + var111 * var111 + 65536));
                        int var113 = -65536 / var112;
                        int var114 = (var110 << 8) / var112;
                        int var115 = (var111 << 8) / var112;
                        int var116 = (var114 * -50 - (-(var113 * -10) + -(var115 * -50))) / var59 + var56;
                        int var117 = (var55[var108][var60 - 1] >> 2) + (var55[var108 - 1][var60] >> 2) + (var55[var108 + 1][var60] >> 3) + (var55[var108][var60 + 1] >> 3) + (var55[var108][var60] >> 1);
                        var11[var108][var60] = -var117 + var116;
                    }
                }
                for (int var61 = 0; var61 < 104; ++var61) {
                    class152.field2886[var61] = 0;
                    class86.field1519[var61] = 0;
                    class124.field2219[var61] = 0;
                    class67.field1208[var61] = 0;
                    class10.field138[var61] = 0;
                }
                for (int var62 = -5; ~var62 > -105; ++var62) {
                    for (int var93 = 0; var93 < 104; ++var93) {
                        int var102 = var62 - -5;
                        int var10002;
                        if (var102 < 104) {
                            int var103 = 255 & class106.field1836[var12][var102][var93];
                            if (var103 > 0) {
                                class223 var104 = class61.method460(1, var103 + -1);
                                class152.field2886[var93] += var104.field4124;
                                class86.field1519[var93] += var104.field4131;
                                class124.field2219[var93] += var104.field4125;
                                class67.field1208[var93] += var104.field4129;
                                var10002 = class10.field138[var93]++;
                            }
                        }
                        int var105 = var62 - 5;
                        if (~var105 <= -1) {
                            int var106 = class106.field1836[var12][var105][var93] & 255;
                            if (var106 > 0) {
                                class223 var107 = class61.method460(1, var106 + -1);
                                class152.field2886[var93] -= var107.field4124;
                                class86.field1519[var93] -= var107.field4131;
                                class124.field2219[var93] -= var107.field4125;
                                class67.field1208[var93] -= var107.field4129;
                                var10002 = class10.field138[var93]--;
                            }
                        }
                    }
                    if (~var62 <= -1) {
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        for (int var99 = -5; ~var99 > -105; ++var99) {
                            int var100 = var99 + 5;
                            if (~var100 > -105) {
                                var95 += class86.field1519[var100];
                                var94 += class124.field2219[var100];
                                var96 += class67.field1208[var100];
                                var97 += class152.field2886[var100];
                                var98 += class10.field138[var100];
                            }
                            int var101 = var99 + -5;
                            if (~var101 <= -1) {
                                var96 -= class67.field1208[var101];
                                var97 -= class152.field2886[var101];
                                var98 -= class10.field138[var101];
                                var95 -= class86.field1519[var101];
                                var94 -= class124.field2219[var101];
                            }
                            if (var99 >= 0 && ~var98 < -1) {
                                var10[var62][var99] = class142.method992((byte) 69, var94 / var98, var97 * 256 / var96, var95 / var98);
                            }
                        }
                    }
                }
                for (int var63 = 1; ~var63 > -104; ++var63) {
                    for (int var66 = 1; ~var66 > -104; ++var66) {
                        if (!arg2) {
                            if (class16.field259 && (class193.field3602[0][var63][var66] & 2) == 0 && ((16 & class193.field3602[var12][var63][var66]) != 0 || class37.method307(var66, 20, var63, var12) != class41.field859)) {
                                continue;
                            }
                            if (var12 < class65.field1172) {
                                class65.field1172 = var12;
                            }
                        }
                        int var67 = 255 & class106.field1836[var12][var63][var66];
                        int var68 = class95.field1676[var12][var63][var66] & 255;
                        if (~var67 < -1 || var68 > 0) {
                            int var69 = class39.field808[var12][var63][var66];
                            int var70 = class39.field808[var12][var63 + 1][var66];
                            int var71 = class39.field808[var12][var63][var66 + 1];
                            int var72 = class39.field808[var12][var63 + 1][var66 - -1];
                            if (~var12 < -1) {
                                boolean var73 = true;
                                if (var67 == 0 && ~class193.field3608[var12][var63][var66] != -1) {
                                    var73 = false;
                                }
                                if (~var68 < -1 && !class128.method898(var68 + -1, true).field162) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && ~var69 == ~var72 && var69 == var71) {
                                    class119.field2135[var12][var63][var66] = class138.method960(class119.field2135[var12][var63][var66], 2340);
                                }
                            }
                            int var74;
                            int var75;
                            if (var67 <= 0) {
                                var74 = 0;
                                var75 = -1;
                            } else {
                                var75 = var10[var63][var66];
                                int var76 = (127 & var75) + var9;
                                if (var76 >= 0) {
                                    if (var76 > 127) {
                                        var76 = 127;
                                    }
                                } else {
                                    var76 = 0;
                                }
                                int var77 = (64512 & var75 - -var8) + (var75 & 896) - -var76;
                                var74 = class169.field3222[class35.method298(arg1 ^ 7360, 96, var77)];
                            }
                            int var78 = var11[var63 + 1][var66];
                            int var79 = var11[var63][var66];
                            int var80 = var11[var63 + 1][var66 + 1];
                            int var81 = var11[var63][var66 - -1];
                            if (~var68 != -1) {
                                int var82 = class193.field3608[var12][var63][var66] + 1;
                                byte var83 = class145.field2774[var12][var63][var66];
                                class12 var84 = class128.method898(var68 + -1, true);
                                int var85 = var84.field165;
                                if (var85 >= 0 && !class169.field3224.method268(-69, var85)) {
                                    var85 = -1;
                                }
                                int var86;
                                int var87;
                                if (~var85 <= -1) {
                                    var86 = class169.field3222[class74.method520((byte) 48, 96, class169.field3224.method270(var85, (byte) 50))];
                                    var87 = -1;
                                } else if (var84.field161 == -1) {
                                    var87 = -2;
                                    var86 = 0;
                                } else {
                                    var87 = var84.field161;
                                    int var88 = (var87 & 127) + var9;
                                    if (var88 >= 0) {
                                        if (~var88 < -128) {
                                            var88 = 127;
                                        }
                                    } else {
                                        var88 = 0;
                                    }
                                    int var89 = (64512 & var8 + var87) - -(var87 & 896) + var88;
                                    var86 = class169.field3222[class74.method520((byte) 50, 96, var89)];
                                }
                                if (var84.field166 >= 0) {
                                    int var90 = var84.field166;
                                    int var91 = (var90 & 127) + var9;
                                    if (~var91 <= -1) {
                                        if (~var91 < -128) {
                                            var91 = 127;
                                        }
                                    } else {
                                        var91 = 0;
                                    }
                                    int var92 = (64512 & var90 - -var8) + (896 & var90) - -var91;
                                    var86 = class169.field3222[class74.method520((byte) 55, 96, var92)];
                                }
                                class35.method295(var12, var63, var66, var82, var83, var85, var69, var70, var72, var71, class35.method298(-96, var79, var75), class35.method298(-19, var78, var75), class35.method298(-121, var80, var75), class35.method298(arg1 ^ 7321, var81, var75), class74.method520((byte) 56, var79, var87), class74.method520((byte) 114, var78, var87), class74.method520((byte) 46, var80, var87), class74.method520((byte) 58, var81, var87), var74, var86);
                            } else {
                                class35.method295(var12, var63, var66, 0, 0, -1, var69, var70, var72, var71, class35.method298(arg1 ^ 7377, var79, var75), class35.method298(-98, var78, var75), class35.method298(-50, var80, var75), class35.method298(arg1 ^ 7336, var81, var75), 0, 0, 0, 0, var74, 0);
                            }
                        }
                    }
                }
                if (!arg2) {
                    for (int var64 = 1; var64 < 103; ++var64) {
                        for (int var65 = 1; var65 < 103; ++var65) {
                            class176.method1181(var12, var65, var64, class37.method307(var64, 97, var65, var12));
                        }
                    }
                }
                class106.field1836[var12] = null;
                class95.field1676[var12] = null;
                class193.field3608[var12] = null;
                class145.field2774[var12] = null;
                class190.field3521[var12] = null;
            }
            class157.method1064(-50, -10, -50);
            if (!arg2) {
                for (int var13 = 0; var13 < 104; ++var13) {
                    for (int var54 = 0; var54 < 104; ++var54) {
                        if (~(class193.field3602[1][var13][var54] & 2) == -3) {
                            class206.method1361(var13, var54);
                        }
                    }
                }
                int var14 = 1;
                int var15 = 2;
                int var16 = 4;
                for (int var17 = 0; ~var17 > -5; ++var17) {
                    if (~var17 < -1) {
                        var15 <<= 3;
                        var14 <<= 3;
                        var16 <<= 3;
                    }
                    for (int var18 = 0; ~var17 <= ~var18; ++var18) {
                        for (int var19 = 0; var19 <= 104; ++var19) {
                            for (int var20 = 0; var20 <= 104; ++var20) {
                                if (~(var14 & class119.field2135[var18][var20][var19]) != -1) {
                                    int var21;
                                    for (var21 = var19; ~var21 > -105 && ~(var14 & class119.field2135[var18][var20][var21 + 1]) != -1; ++var21) {
                                    }
                                    int var22;
                                    for (var22 = var19; ~var22 < -1 && (class119.field2135[var18][var20][var22 + -1] & var14) != 0; --var22) {
                                    }
                                    int var23;
                                    label370: for (var23 = var18; ~var23 < -1; --var23) {
                                        for (int var24 = var22; ~var21 <= ~var24; ++var24) {
                                            if (~(var14 & class119.field2135[var23 + -1][var20][var24]) == -1) {
                                                break label370;
                                            }
                                        }
                                    }
                                    int var25;
                                    label358: for (var25 = var18; ~var17 < ~var25; ++var25) {
                                        for (int var26 = var22; ~var21 <= ~var26; ++var26) {
                                            if (~(class119.field2135[var25 - -1][var20][var26] & var14) == -1) {
                                                break label358;
                                            }
                                        }
                                    }
                                    int var27 = (-var22 + var21 - -1) * (-var23 + var25 - -1);
                                    if (~var27 <= -9) {
                                        short var28 = 240;
                                        int var29 = class39.field808[var23][var20][var22];
                                        int var30 = class39.field808[var25][var20][var22] + -var28;
                                        class232.method1497(var17, 1, var20 * 128, var20 * 128, var22 * 128, var21 * 128 - -128, var30, var29);
                                        for (int var31 = var23; var25 >= var31; ++var31) {
                                            for (int var32 = var22; ~var21 <= ~var32; ++var32) {
                                                class119.field2135[var31][var20][var32] = class58.method449(class119.field2135[var31][var20][var32], ~var14);
                                            }
                                        }
                                    }
                                }
                                if (~(var15 & class119.field2135[var18][var20][var19]) != -1) {
                                    int var33;
                                    for (var33 = var20; ~var33 < -1 && ~(var15 & class119.field2135[var18][var33 + -1][var19]) != -1; --var33) {
                                    }
                                    int var34 = var18;
                                    int var35;
                                    for (var35 = var20; ~var35 > -105 && ~(class119.field2135[var18][var35 + 1][var19] & var15) != -1; ++var35) {
                                    }
                                    int var36 = var18;
                                    label425: while (var34 > 0) {
                                        for (int var37 = var33; var37 <= var35; ++var37) {
                                            if (~(class119.field2135[var34 + -1][var37][var19] & var15) == -1) {
                                                break label425;
                                            }
                                        }
                                        --var34;
                                    }
                                    label414: while (var17 > var36) {
                                        for (int var38 = var33; var35 >= var38; ++var38) {
                                            if (~(var15 & class119.field2135[var36 + 1][var38][var19]) == -1) {
                                                break label414;
                                            }
                                        }
                                        ++var36;
                                    }
                                    int var39 = (var35 + 1 - var33) * (-var34 + 1 + var36);
                                    if (~var39 <= -9) {
                                        short var40 = 240;
                                        int var41 = class39.field808[var36][var33][var19] + -var40;
                                        int var42 = class39.field808[var34][var33][var19];
                                        class232.method1497(var17, 2, var33 * 128, var35 * 128 + 128, var19 * 128, var19 * 128, var41, var42);
                                        for (int var43 = var34; var36 >= var43; ++var43) {
                                            for (int var44 = var33; var44 <= var35; ++var44) {
                                                class119.field2135[var43][var44][var19] = class58.method449(class119.field2135[var43][var44][var19], ~var15);
                                            }
                                        }
                                    }
                                }
                                if ((var16 & class119.field2135[var18][var20][var19]) != 0) {
                                    int var45 = var20;
                                    int var46 = var20;
                                    int var47 = var19;
                                    int var48;
                                    for (var48 = var19; var48 < 104 && ~(var16 & class119.field2135[var18][var20][var48 + 1]) != -1; ++var48) {
                                    }
                                    while (var47 > 0 && ~(class119.field2135[var18][var20][var47 - 1] & var16) != -1) {
                                        --var47;
                                    }
                                    label480: while (~var45 < -1) {
                                        for (int var49 = var47; ~var48 <= ~var49; ++var49) {
                                            if ((class119.field2135[var18][var45 - 1][var49] & var16) == 0) {
                                                break label480;
                                            }
                                        }
                                        --var45;
                                    }
                                    label469: while (~var46 > -105) {
                                        for (int var50 = var47; var50 <= var48; ++var50) {
                                            if ((class119.field2135[var18][var46 + 1][var50] & var16) == 0) {
                                                break label469;
                                            }
                                        }
                                        ++var46;
                                    }
                                    if ((-var45 + var46 + 1) * (-var47 + 1 + var48) >= 4) {
                                        int var51 = class39.field808[var18][var45][var47];
                                        class232.method1497(var17, 4, var45 * 128, var46 * 128 - -128, var47 * 128, var48 * 128 + 128, var51, var51);
                                        for (int var52 = var45; ~var46 <= ~var52; ++var52) {
                                            for (int var53 = var47; var53 <= var48; ++var53) {
                                                class119.field2135[var18][var52][var53] = class58.method449(class119.field2135[var18][var52][var53], ~var16);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method394(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method1150(27297);
        if (arg0 != 3) {
            this.method393(-51, 2, (byte) -55, -93, (Graphics) null, 30);
        }
        arg1.drawImage(super.field3298, arg3, arg2, this);
        ++field3229;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    private final synchronized void method1150(int arg0) {
        ++field3235;
        if (arg0 != 27297) {
            this.isConsumer((ImageConsumer) null);
        }
        if (this.field3236 != null) {
            this.field3236.setPixels(0, 0, super.field3299, super.field3297, this.field3238, super.field3300, 0, super.field3299);
            this.field3236.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Ldc;")
    public static final class37 method1151(int arg0, int arg1) {
        ++field3237;
        if (arg0 != 255) {
            method1149((class163[]) null, 107, true);
        }
        return class80.method548(new class37[] { class151.method1034((byte) -9, 255 & arg1 >> 24), class241.field4420, class151.method1034((byte) -9, arg1 >> 16 & 255), class241.field4420, class151.method1034((byte) -9, (65421 & arg1) >> 8), class241.field4420, class151.method1034((byte) -9, arg1 & 255) }, arg0 ^ -216);
    }

    @OriginalMember(owner = "client!pg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3231;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method393(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        ++field3228;
        this.method1153(arg5, arg3, arg0, 0, arg1);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg3, arg0, arg5);
        arg4.drawImage(super.field3298, 0, 0, this);
        if (arg2 <= 89) {
            field3241 = null;
        }
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method1152(int arg0) {
        ++field3232;
        try {
            if (arg0 != 2874) {
                method1154(102);
            }
            if (class54.field1055 == null) {
                class54.field1055 = new class118(class10.field130, class80.method548(new class37[] { class81.field1443, class151.method1034((byte) -9, class160.field3033), class174.field3320 }, -85).method316((byte) -117));
            } else {
                byte[] var1 = class54.field1055.method815(arg0 ^ 2830);
                if (var1 != null) {
                    class28 var2 = new class28(var1);
                    class115.field2055 = var2.method230((byte) -105);
                    class6.field67 = new class183[class115.field2055];
                    for (int var3 = 0; class115.field2055 > var3; ++var3) {
                        class183 var4 = class6.field67[var3] = new class183();
                        int var5 = var2.method230((byte) -126);
                        var4.field3386 = (32768 & var5) != 0;
                        var4.field3387 = var5 & 32767;
                        var4.field3385 = var2.method180(arg0 + -2872);
                        var4.field3383 = var2.method228(true);
                        var4.field3384 = var3;
                        var4.field3379 = class206.method1357(var2.method230((byte) -120), true);
                    }
                    class185.method1237(0, arg0 ^ 2874, class6.field67, class6.field67.length - 1);
                    class54.field1055 = null;
                    class181.field3371 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class54.field1055 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3240;
        if (arg3 != 0) {
            this.method393(-27, 76, (byte) 35, -23, (Graphics) null, 113);
        }
        if (this.field3236 != null) {
            this.field3236.setPixels(arg4, arg1, arg2, arg0, this.field3238, super.field3300, super.field3299 * arg1 - -arg4, super.field3299);
            this.field3236.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field3241 = null;
        if (arg0 != 74) {
            method1155(47, 66, -51, (byte) -69, -88, -13);
        }
        field3244 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method392(Component arg0, int arg1, int arg2, int arg3) {
        super.field3300 = new int[arg1 * arg2 + 1];
        ++field3233;
        super.field3297 = arg1;
        super.field3299 = arg2;
        this.field3238 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 != 0) {
            this.removeConsumer((ImageConsumer) null);
        }
        super.field3298 = arg0.createImage(this);
        this.method1150(27297);
        arg0.prepareImage(super.field3298, this);
        this.method1150(27297);
        arg0.prepareImage(super.field3298, this);
        this.method1150(27297);
        arg0.prepareImage(super.field3298, this);
        this.method1169((byte) -70);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIBII)V")
    public static final void method1155(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field3242;
        if (arg3 <= 94) {
            method1152(99);
        }
        if (arg2 >= class29.field536 && class82.field1458 >= arg4 && ~class198.field3697 >= ~arg0 && arg1 <= class199.field3712) {
            class242.method1583(arg2, arg5, arg4, 0, arg1, arg0);
        } else {
            class232.method1498(arg0, arg2, arg5, arg1, true, arg4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3234;
    }
}
