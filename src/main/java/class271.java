import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class271 extends class8 {

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public int field4368 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "[I")
    public static int[] field4371 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "Lhh;")
    public static class169 field4375 = new class169();

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)[Ldf;", line = 4)
    public static final class167[] method1922(int arg0) {
        if (class165.field2745 == null) {
            class167[] var1 = class91.method614((byte) -117, class14.field159);
            class167[] var2 = new class167[var1.length];
            int var3 = 0;
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class167 var5 = var1[var4];
                if ((var5.field2765 <= 0 || var5.field2765 >= 24) && var5.field2764 >= 800 && var5.field2767 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class167 var7 = var2[var6];
                        if (var5.field2764 == var7.field2764 && var5.field2767 == var7.field2767) {
                            if (var5.field2765 > var7.field2765) {
                                var2[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class165.field2745 = new class167[var3];
            class9.method48(var2, 0, class165.field2745, 0, var3);
            int[] var8 = new int[class165.field2745.length];
            for (int var9 = 0; var9 < class165.field2745.length; var9++) {
                class167 var10 = class165.field2745[var9];
                var8[var9] = var10.field2767 * var10.field2764;
            }
            class227.method1608(var8, (byte) 127, class165.field2745);
        }
        field4374++;
        if (arg0 != 800) {
            field4376 = 11;
        }
        return class165.field2745;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILjj;)V", line = 80)
    public final void method1923(int arg0, class44 arg1) {
        if (arg0 > 0) {
            this.method1923(-120, (class44) null);
        }
        field4370++;
        while (true) {
            int var3 = arg1.method286((byte) -120);
            if (var3 == 0) {
                return;
            }
            this.method1926(arg1, (byte) 123, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V", line = 103)
    public static void method1924(byte arg0) {
        if (arg0 != -119) {
            method1922(-49);
        }
        field4375 = null;
        field4371 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Lwn;", line = 114)
    public static final class278 method1925(byte arg0, int arg1) {
        field4377++;
        if (arg0 != 15) {
            field4376 = 62;
        }
        class278 var2 = (class278) class176.field2942.method704((byte) 47, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class291.field4649.method1287(arg1, 4, -1);
        class278 var4 = new class278();
        if (var3 != null) {
            var4.method2013(arg1, (byte) 107, new class44(var3));
        }
        class176.field2942.method703(var4, (long) arg1, (byte) 39);
        return var4;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljj;BI)V", line = 156)
    private final void method1926(class44 arg0, byte arg1, int arg2) {
        field4372++;
        if (arg2 == 2) {
            this.field4368 = arg0.method271(21081);
        }
        int var4 = -20 / ((arg1 + 35) / 62);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljh;Ljava/awt/Frame;I)V", line = 171)
    public static final void method1927(class124 arg0, Frame arg1, int arg2) {
        field4369++;
        while (true) {
            class161 var3 = arg0.method903(arg1, (byte) -36);
            while (var3.field2661 == 0) {
                class121.method867((byte) 125, 10L);
            }
            if (var3.field2661 == 1) {
                if (arg2 != 4) {
                    return;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class121.method867((byte) 103, 100L);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([Lac;Z[[[II)V", line = 200)
    public static final void method1928(class108[] arg0, boolean arg1, int[][][] arg2, int arg3) {
        field4367++;
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
                        if ((class129.field2025[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class129.field2025[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method741((byte) 101, var7, var6);
                            }
                        }
                    }
                }
            }
            class322.field4985 += (int) (Math.random() * 5.0D) - 2;
            if (class322.field4985 < -8) {
                class322.field4985 = -8;
            }
            if (class322.field4985 > 8) {
                class322.field4985 = 8;
            }
            class289.field4633 += (int) (Math.random() * 5.0D) - 2;
            if (class289.field4633 < -16) {
                class289.field4633 = -16;
            }
            if (class289.field4633 > 16) {
                class289.field4633 = 16;
            }
        }
        int var9 = class322.field4985 >> 2 << 10;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        if (arg3 != -15783) {
            field4375 = (class169) null;
        }
        int var12 = class289.field4633 >> 1;
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class323.field5021[var13];
            if (!class232.field3690) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class110.field1642[var13][var38 + 1][var37] - class110.field1642[var13][var38 - 1][var37];
                        int var41 = class110.field1642[var13][var38][var37 + 1] - class110.field1642[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var40 * var40 + (var41 * var41) + 65536));
                        int var43 = -65536 / var42;
                        int var44 = (var40 << 8) / var42;
                        int var45 = (var14[var38 - 1][var37] >> 2) + (var14[var38 + 1][var37] >> 3) + (var14[var38][var37] >> 1) + (var14[var38][var37 - 1] >> 2) + (var14[var38][var37 + 1] >> 3);
                        int var46 = (var41 << 8) / var42;
                        int var47 = (var44 * -50 - (-(var43 * -10) - var46 * -50)) / var36 + var39;
                        var11[var38][var37] = var47 - var45;
                    }
                }
            } else if (class322.field4994) {
                for (int var31 = 1; var31 < 103; var31++) {
                    for (int var32 = 1; var32 < 103; var32++) {
                        byte var33 = 74;
                        int var34 = (var14[var32][var31] >> 1) + (var14[var32][var31 - 1] >> 2) + (var14[var32 - 1][var31] >> 2) + (var14[var32][var31 + 1] >> 3) + (var14[var32 + 1][var31] >> 3);
                        var11[var32][var31] = var33 - var34;
                    }
                }
            } else {
                int var15 = (int) class87.field1206[0];
                int var16 = (int) class87.field1206[1];
                int var17 = (int) class87.field1206[2];
                int var18 = (int) Math.sqrt((double) (var15 * var15 + var16 * var16 + var17 * var17));
                int var19 = var18 * 1024 >> 8;
                for (int var20 = 1; var20 < 103; var20++) {
                    for (int var21 = 1; var21 < 103; var21++) {
                        int var22 = class110.field1642[var13][var21 + 1][var20] - class110.field1642[var13][var21 - 1][var20];
                        byte var23 = 96;
                        int var24 = class110.field1642[var13][var21][var20 + 1] - class110.field1642[var13][var21][var20 - 1];
                        int var25 = (int) Math.sqrt((double) (var24 * var24 + var22 * var22 + 65536));
                        int var26 = (var22 << 8) / var25;
                        int var27 = -65536 / var25;
                        int var28 = (var24 << 8) / var25;
                        int var29 = (var14[var21][var20] >> 1) + ((var14[var21][var20 + 1] >> 3) + (var14[var21 - 1][var20] >> 2) + (var14[var21 + 1][var20] >> 3) + (var14[var21][var20 - 1] >> 2));
                        int var30 = (var17 * var28 + var15 * var26 + var16 * var27) / var19 + var23;
                        var11[var21][var20] = var30 - (int) ((float) var29 * 1.7F);
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class164.field2733[var48] = 0;
                class142.field2212[var48] = 0;
                class70.field988[var48] = 0;
                class160.field2646[var48] = 0;
                class103.field1501[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class180.field2987[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class229 var53 = class91.method616(var52 - 1, arg3 + 15700);
                            class164.field2733[var50] += var53.field3640;
                            class142.field2212[var50] += var53.field3646;
                            class70.field988[var50] += var53.field3655;
                            class160.field2646[var50] += var53.field3643;
                            var10002 = class103.field1501[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class180.field2987[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class229 var56 = class91.method616(var55 - 1, 88);
                            class164.field2733[var50] -= var56.field3640;
                            class142.field2212[var50] -= var56.field3646;
                            class70.field988[var50] -= var56.field3655;
                            class160.field2646[var50] -= var56.field3643;
                            var10002 = class103.field1501[var50]--;
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
                        int var63 = var62 - 5;
                        int var64 = var62 + 5;
                        if (var64 < 104) {
                            var59 += class164.field2733[var64];
                            var57 += class142.field2212[var64];
                            var58 += class70.field988[var64];
                            var60 += class160.field2646[var64];
                            var61 += class103.field1501[var64];
                        }
                        if (var63 >= 0) {
                            var60 -= class160.field2646[var63];
                            var58 -= class70.field988[var63];
                            var57 -= class142.field2212[var63];
                            var61 -= class103.field1501[var63];
                            var59 -= class164.field2733[var63];
                        }
                        if (var62 >= 0 && var61 > 0) {
                            var10[var49][var62] = class261.method1862(var58 / var61, var57 / var61, var59 * 256 / var60, (byte) 113);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label763: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg1 || class76.method518(-19076) || (class129.field2025[0][var65][var66] & 0x2) != 0 || (class129.field2025[var13][var65][var66] & 0x10) == 0 && class208.method1510(var13, 0, var65, var66) == class236.field3781) {
                        if (class101.field1478 > var13) {
                            class101.field1478 = var13;
                        }
                        int var67 = class180.field2987[var13][var65][var66] & 0xFF;
                        int var68 = class145.field2259[var13][var65][var66] & 0xFF;
                        if (var67 > 0 || var68 > 0) {
                            int var69 = class110.field1642[var13][var65][var66];
                            int var70 = class110.field1642[var13][var65 + 1][var66];
                            int var71 = class110.field1642[var13][var65 + 1][var66 + 1];
                            int var72 = class110.field1642[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var67 == 0 && class296.field4685[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var68 > 0 && !method1925((byte) 15, var68 - 1).field4487) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class309.field4799[var13][var65][var66] = class122.method882(class309.field4799[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var67 > 0) {
                                var74 = var10[var65][var66];
                                int var75 = (var74 & 0x7F) + var12;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var74 + var9 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class170.field2812[class21.method114(var76, (byte) -46, 96)];
                            } else {
                                var74 = -1;
                                var77 = 0;
                            }
                            int var78 = var11[var65][var66 + 1];
                            int var79 = var11[var65 + 1][var66 + 1];
                            int var80 = var11[var65][var66];
                            int var81 = var11[var65 + 1][var66];
                            if (var68 == 0) {
                                class54.method346(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class21.method114(var74, (byte) -100, var80), class21.method114(var74, (byte) -49, var81), class21.method114(var74, (byte) -19, var79), class21.method114(var74, (byte) -104, var78), 0, 0, 0, 0, var77, 0);
                                if (class232.field3690 && var13 > 0 && var74 != -1 && class91.method616(var67 - 1, -57).field3631) {
                                    class241.method1725(0, 0, true, false, var65, var66, var69 - class110.field1642[0][var65][var66], -class110.field1642[0][var65 + 1][var66] + var70, var71 - class110.field1642[0][var65 + 1][var66 + 1], -class110.field1642[0][var65][var66 - -1] + var72);
                                }
                                if (class232.field3690 && !arg1 && class280.field4519 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                        for (int var83 = var66 - 1; var83 <= (var66 + 1); var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class145.field2259[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class278 var85 = method1925((byte) 15, var84 - 1);
                                                    if (var85.field4490 != -1 && class189.method1402(class170.field2814.method944(var85.field4490, true), 4)) {
                                                        class280.field4519[var65][var66] = (var85.field4479 << 24) + var85.field4486;
                                                        continue label763;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class296.field4685[var13][var65][var66] + 1;
                                byte var87 = class199.field3240[var13][var65][var66];
                                class278 var88 = method1925((byte) 15, var68 - 1);
                                if (class232.field3690 && !arg1 && class280.field4519 != null && var13 == 0) {
                                    if (var88.field4490 != -1 && class189.method1402(class170.field2814.method944(var88.field4490, true), 4)) {
                                        class280.field4519[var65][var66] = (var88.field4479 << 24) + var88.field4486;
                                    } else {
                                        label744: for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class145.field2259[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class278 var92 = method1925((byte) 15, var91 - 1);
                                                        if (var92.field4490 != -1 && class189.method1402(class170.field2814.method944(var92.field4490, true), 4)) {
                                                            class280.field4519[var65][var66] = (var92.field4479 << 24) + var92.field4486;
                                                            break label744;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field4490;
                                if (var93 >= 0 && !class170.field2814.method963(false, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var97;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var97 = class170.field2812[class94.method629(96, class170.field2814.method945(var93, arg3 + 16038), (byte) -8)];
                                } else if (var88.field4471 == -1) {
                                    var94 = -2;
                                    var97 = 0;
                                } else {
                                    var94 = var88.field4471;
                                    int var95 = (var94 & 0x7F) + var12;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var9 + var94 & 0xFC00) - (-(var94 & 0x380) - var95);
                                    var97 = class170.field2812[class94.method629(96, var96, (byte) -124)];
                                }
                                if (var88.field4484 >= 0) {
                                    int var98 = var88.field4484;
                                    int var99 = (var98 & 0x7F) + var12;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var97 = class170.field2812[class94.method629(96, var100, (byte) 53)];
                                }
                                class54.method346(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class21.method114(var74, (byte) -21, var80), class21.method114(var74, (byte) -87, var81), class21.method114(var74, (byte) -113, var79), class21.method114(var74, (byte) -68, var78), class94.method629(var80, var94, (byte) 64), class94.method629(var81, var94, (byte) -123), class94.method629(var79, var94, (byte) -121), class94.method629(var78, var94, (byte) 28), var77, var97);
                                if (class232.field3690 && var13 > 0) {
                                    class241.method1725(var86, var87, var94 == -2 || !var88.field4475, var74 == -1 || !class91.method616(var67 - 1, -127).field3631, var65, var66, var69 - class110.field1642[0][var65][var66], -class110.field1642[0][var65 - -1][var66] + var70, var71 - class110.field1642[0][var65 + 1][var66 + 1], -class110.field1642[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class232.field3690) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class110.field1642[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg1) {
                            class206[] var110 = class159.method1140(var101, class280.field4519, class296.field4685[var13], var103, class145.field2259[var13], class97.field1380[0], class110.field1642[var13], var11, class199.field3240[var13], arg3 ^ 0xFFFFC21C, arg2, class180.field2987[var13], var10, var13, class129.field2025, var102);
                            class64.method430(var13, var110);
                            break;
                        }
                        class206[] var111 = class159.method1140(var101, (int[][]) null, class296.field4685[var13], var103, class145.field2259[var13], (int[][]) null, class110.field1642[var13], var11, class199.field3240[var13], 94, arg2, class180.field2987[var13], var10, var13, class129.field2025, var102);
                        class206[] var112 = class174.method1313(var13, var101, -24935, class129.field2025, class180.field2987[var13], var11, class199.field3240[var13], class296.field4685[var13], class110.field1642[var13], var102, var103, class145.field2259[var13]);
                        class206[] var113 = new class206[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class64.method430(var13, var113);
                        class195.method1439(var13, var102, class118.field1793, class110.field1642[var13], class180.field2987[var13], var103, class145.field2259[var13], class296.field4685[var13], class199.field3240[var13], arg3 ^ 0x3DA6, class118.field1784, var101);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var101[var106][var105] = (float) var107 / var109;
                        var103[var106][var105] = -256.0F / var109;
                        var102[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class180.field2987[var13] = (byte[][]) null;
            class145.field2259[var13] = (byte[][]) null;
            class296.field4685[var13] = (byte[][]) null;
            class199.field3240[var13] = (byte[][]) null;
            class323.field5021[var13] = (byte[][]) null;
        }
        class137.method1017(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class129.field2025[1][var116][var117] & 0x2) == 2) {
                    class84.method570(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class309.field4799[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class309.field4799[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var118;
                        int var123 = var118;
                        int var124;
                        for (var124 = var119; var124 < 104 && (class309.field4799[var118][var120][var124 + 1] & 0x1) != 0; var124++) {
                        }
                        label447: while (var123 > 0) {
                            for (int var125 = var121; var125 <= var124; var125++) {
                                if ((class309.field4799[var123 - 1][var120][var125] & 0x1) == 0) {
                                    break label447;
                                }
                            }
                            var123--;
                        }
                        label436: while (var122 < 3) {
                            for (int var126 = var121; var126 <= var124; var126++) {
                                if ((class309.field4799[var122 + 1][var120][var126] & 0x1) == 0) {
                                    break label436;
                                }
                            }
                            var122++;
                        }
                        int var127 = (var124 - (var121 - 1)) * (var122 + 1 - var123);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class110.field1642[var122][var120][var121] - var128;
                            int var130 = class110.field1642[var123][var120][var121];
                            class338.method2353(1, var120 * 128, var120 * 128, var121 * 128, var124 * 128 + 128, var129, var130);
                            for (int var131 = var123; var131 <= var122; var131++) {
                                for (int var132 = var121; var132 <= var124; var132++) {
                                    class309.field4799[var131][var120][var132] = client.method767(class309.field4799[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class309.field4799[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 > 0 && (class309.field4799[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        int var135 = var118;
                        int var136 = var118;
                        while (var134 < 104 && (class309.field4799[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        label501: while (var135 > 0) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class309.field4799[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label501;
                                }
                            }
                            var135--;
                        }
                        label490: while (var136 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class309.field4799[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label490;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var134 + 1 - var133) * (var136 + 1 - var135);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class110.field1642[var135][var133][var119];
                            int var142 = class110.field1642[var136][var133][var119] - var140;
                            class338.method2353(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var142, var141);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class309.field4799[var143][var144][var119] = client.method767(class309.field4799[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class309.field4799[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148 = var119;
                        while (var147 > 0 && (class309.field4799[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        while (var148 < 104 && (class309.field4799[var118][var120][var148 + 1] & 0x4) != 0) {
                            var148++;
                        }
                        label555: while (var145 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class309.field4799[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label555;
                                }
                            }
                            var145--;
                        }
                        label544: while (var146 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class309.field4799[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label544;
                                }
                            }
                            var146++;
                        }
                        if ((var148 + 1 - var147) * (var146 + 1 - var145) >= 4) {
                            int var151 = class110.field1642[var118][var145][var147];
                            class338.method2353(4, var145 * 128, var146 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class309.field4799[var118][var152][var153] = client.method767(class309.field4799[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
