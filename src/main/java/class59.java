import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class59 extends class80 {

    @OriginalMember(owner = "client!km", name = "y", descriptor = "Z")
    public boolean field841;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[Lkm;")
    public class59[] field833;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "Lph;")
    public static class229 field843 = class266.method1858("<img=1>", 0);

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
    public static int[] field836 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lja;")
    public static class143 field829 = new class143(64);

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "Lof;")
    public class259 field838;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "Lfk;")
    public class57 field846;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)I", line = 4)
    public int method390(int arg0) {
        field840++;
        if (arg0 >= -62) {
            this.field841 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 19)
    public final void method391(int arg0, int arg1, int arg2) {
        field849++;
        int var4 = ~this.field839 == arg2 ? arg0 : this.field839;
        if (this.field841) {
            this.field846 = new class57(var4, arg0, arg1);
        } else {
            this.field838 = new class259(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)[I", line = 42)
    public int[] method63(boolean arg0, int arg1) {
        field832++;
        if (!arg0) {
            this.method65(13);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Lph;Z[S)V", line = 55)
    public static final void method392(class229[] arg0, boolean arg1, short[] arg2) {
        field850++;
        class142.method1019(0, arg0, arg2, (byte) -48, arg0.length - 1);
        if (!arg1) {
            field843 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([Loi;BZ)V", line = 68)
    public static final void method393(class108[] arg0, byte arg1, boolean arg2) {
        if (!arg2) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class245.field4050[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class245.field4050[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method820(0, var4, var5);
                            }
                        }
                    }
                }
            }
            class251.field4181 += (int) (Math.random() * 5.0D) - 2;
            if (class251.field4181 < -16) {
                class251.field4181 = -16;
            }
            if (class251.field4181 > 16) {
                class251.field4181 = 16;
            }
            class311.field5223 += (int) (Math.random() * 5.0D) - 2;
            if (class311.field5223 < -8) {
                class311.field5223 = -8;
            }
            if (class311.field5223 > 8) {
                class311.field5223 = 8;
            }
        }
        int var7 = class311.field5223 >> 2 << 10;
        if (arg1 > -101) {
            return;
        }
        int var8 = class251.field4181 >> 1;
        byte var9;
        if (arg2) {
            var9 = 1;
        } else {
            var9 = 4;
        }
        int[][] var10 = new int[104][104];
        field835++;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var9; var12++) {
            byte[][] var13 = class16.field190[var12];
            if (!class99.field1675) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        byte var18 = 74;
                        int var19 = class192.field3174[var12][var17 + 1][var16] - class192.field3174[var12][var17 - 1][var16];
                        int var20 = class192.field3174[var12][var17][var16 + 1] - class192.field3174[var12][var17][var16 - 1];
                        int var21 = (int) Math.sqrt((double) (var19 * var19 + ((var20 * var20) + 65536)));
                        int var22 = (var19 << 8) / var21;
                        int var23 = (var20 << 8) / var21;
                        int var24 = -65536 / var21;
                        int var25 = (var22 * -50 + var23 * -50 + (var24 * -10)) / var15 + var18;
                        int var26 = (var13[var17 - 1][var16] >> 2) + (var13[var17 + 1][var16] >> 3) + (var13[var17][var16 + -1] >> 2) + (var13[var17][var16 + 1] >> 3) + (var13[var17][var16] >> 1);
                        var11[var17][var16] = var25 - var26;
                    }
                }
            } else if (class88.field1483) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44 + 1][var43] >> 3) + (var13[var44][var43 + 1] >> 3) + (var13[var44][var43] >> 1) + ((var13[var44 + -1][var43] >> 2) - -(var13[var44][var43 - 1] >> 2));
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class117.field1976[0];
                int var28 = (int) class117.field1976[1];
                int var29 = (int) class117.field1976[2];
                int var30 = (int) Math.sqrt((double) (var27 * var27 + (var28 * var28) + (var29 * var29)));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        int var34 = class192.field3174[var12][var33 + 1][var32] - class192.field3174[var12][var33 - 1][var32];
                        byte var35 = 96;
                        int var36 = class192.field3174[var12][var33][var32 + 1] - class192.field3174[var12][var33][var32 - 1];
                        int var37 = (int) Math.sqrt((double) (var34 * var34 + var36 * var36 + 65536));
                        int var38 = (var36 << 8) / var37;
                        int var39 = -65536 / var37;
                        int var40 = (var34 << 8) / var37;
                        int var41 = (var27 * var40 + (var28 * var39 + (var29 * var38))) / var31 + var35;
                        int var42 = (var13[var33 - 1][var32] >> 2) + (var13[var33 + 1][var32] >> 3) - (-(var13[var33][var32 - 1] >> 2) - (var13[var33][var32 - -1] >> 3) - (var13[var33][var32] >> 1));
                        var11[var33][var32] = var41 - ((int) ((float) var42 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class235.field3871[var47] = 0;
                class326.field5570[var47] = 0;
                class205.field3377[var47] = 0;
                class321.field5442[var47] = 0;
                class114.field1938[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class126.field2104[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class324 var52 = class78.method584((byte) 18, var51 - 1);
                            class235.field3871[var49] += var52.field5526;
                            class326.field5570[var49] += var52.field5541;
                            class205.field3377[var49] += var52.field5532;
                            class321.field5442[var49] += var52.field5536;
                            var10002 = class114.field1938[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class126.field2104[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class324 var55 = class78.method584((byte) 18, var54 - 1);
                            class235.field3871[var49] -= var55.field5526;
                            class326.field5570[var49] -= var55.field5541;
                            class205.field3377[var49] -= var55.field5532;
                            class321.field5442[var49] -= var55.field5536;
                            var10002 = class114.field1938[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        int var63 = var61 - 5;
                        if (var62 < 104) {
                            var59 += class326.field5570[var62];
                            var57 += class321.field5442[var62];
                            var58 += class235.field3871[var62];
                            var56 += class205.field3377[var62];
                            var60 += class114.field1938[var62];
                        }
                        if (var63 >= 0) {
                            var57 -= class321.field5442[var63];
                            var58 -= class235.field3871[var63];
                            var59 -= class326.field5570[var63];
                            var60 -= class114.field1938[var63];
                            var56 -= class205.field3377[var63];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var10[var48][var61] = class287.method1972(15540, var56 / var60, var58 * 256 / var57, var59 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label766: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg2 || class61.method415((byte) 68) || (class245.field4050[0][var64][var65] & 0x2) != 0 || (class245.field4050[var12][var64][var65] & 0x10) == 0 && class276.method1907(-25107, var65, var12, var64) == class102.field1742) {
                        if (var12 < class229.field3796) {
                            class229.field3796 = var12;
                        }
                        int var66 = class126.field2104[var12][var64][var65] & 0xFF;
                        int var67 = class12.field166[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class192.field3174[var12][var64][var65];
                            int var69 = class192.field3174[var12][var64 + 1][var65];
                            int var70 = class192.field3174[var12][var64 + 1][var65 + 1];
                            int var71 = class192.field3174[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class304.field5084[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class110.method838(var67 - 1, false).field4671) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var68 == var70 && var68 == var71) {
                                    class1.field10[var12][var64][var65] = class201.method1410(class1.field10[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = 0;
                                var74 = -1;
                            } else {
                                var74 = var10[var64][var65];
                                int var75 = (var74 & 0x7F) + var8;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var7 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var73 = class310.field5203[class19.method117(false, 96, var76)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class136.method969(var12, var64, var65, 0, 0, -1, var68, var69, var70, var71, class19.method117(false, var77, var74), class19.method117(false, var78, var74), class19.method117(false, var79, var74), class19.method117(false, var80, var74), 0, 0, 0, 0, var73, 0);
                                if (class99.field1675 && var12 > 0 && var74 != -1 && class78.method584((byte) 18, var66 - 1).field5531) {
                                    class137.method985(0, 0, true, false, var64, var65, var68 - class192.field3174[0][var64][var65], -class192.field3174[0][var64 + 1][var65] + var69, var70 - class192.field3174[0][var64 + 1][var65 + 1], -class192.field3174[0][var64][var65 - -1] + var71);
                                }
                                if (class99.field1675 && !arg2 && class39.field622 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= (var64 + 1); var81++) {
                                        for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class12.field166[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class282 var84 = class110.method838(var83 - 1, false);
                                                    if (var84.field4681 != -1 && class310.field5207.method90(-74, var84.field4681) == 4) {
                                                        class39.field622[var64][var65] = (var84.field4685 << 24) + var84.field4669;
                                                        continue label766;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var85 = class304.field5084[var12][var64][var65] + 1;
                                byte var86 = class177.field2925[var12][var64][var65];
                                class282 var87 = class110.method838(var67 - 1, false);
                                if (class99.field1675 && !arg2 && class39.field622 != null && var12 == 0) {
                                    if (var87.field4681 != -1 && class310.field5207.method90(-86, var87.field4681) == 4) {
                                        class39.field622[var64][var65] = (var87.field4685 << 24) + var87.field4669;
                                    } else {
                                        label747: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class12.field166[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class282 var91 = class110.method838(var90 - 1, false);
                                                        if (var91.field4681 != -1 && class310.field5207.method90(-125, var91.field4681) == 4) {
                                                            class39.field622[var64][var65] = (var91.field4685 << 24) + var91.field4669;
                                                            break label747;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field4681;
                                if (var92 >= 0 && !class310.field5207.method106(0, var92)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var94 = class310.field5203[class60.method407((byte) 107, 96, class310.field5207.method109(107, var92))];
                                } else if (var87.field4676 == -1) {
                                    var94 = 0;
                                    var93 = -2;
                                } else {
                                    var93 = var87.field4676;
                                    int var95 = (var93 & 0x7F) + var8;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var93 & 0x380) + ((var93 + var7 & 0xFC00) + var95);
                                    var94 = class310.field5203[class60.method407((byte) 107, 96, var96)];
                                }
                                if (var87.field4683 >= 0) {
                                    int var97 = var87.field4683;
                                    int var98 = (var97 & 0x7F) + var8;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var7 + var97 & 0xFC00) + (var97 & 0x380) + var98;
                                    var94 = class310.field5203[class60.method407((byte) 119, 96, var99)];
                                }
                                class136.method969(var12, var64, var65, var85, var86, var92, var68, var69, var70, var71, class19.method117(false, var77, var74), class19.method117(false, var78, var74), class19.method117(false, var79, var74), class19.method117(false, var80, var74), class60.method407((byte) 56, var77, var93), class60.method407((byte) 90, var78, var93), class60.method407((byte) 71, var79, var93), class60.method407((byte) 98, var80, var93), var73, var94);
                                if (class99.field1675 && var12 > 0) {
                                    class137.method985(var85, var86, var93 == -2 || !var87.field4680, var74 == -1 || !class78.method584((byte) 18, var66 - 1).field5531, var64, var65, var68 - class192.field3174[0][var64][var65], -class192.field3174[0][var64 + 1][var65] + var69, var70 - class192.field3174[0][var64 + 1][var65 + 1], -class192.field3174[0][var64][var65 - -1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class99.field1675) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class192.field3174[var12];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg2) {
                            class264[] var109 = class294.method1995(class126.field2104[var12], var102, var101, class12.field166[var12], class39.field622, class245.field4050, class103.field1753[0], class192.field3174[var12], var10, class304.field5084[var12], (byte) -119, var12, class177.field2925[var12], var11, var100);
                            class306.method2064(var12, var109);
                            break;
                        }
                        class264[] var110 = class294.method1995(class126.field2104[var12], var102, var101, class12.field166[var12], (int[][]) null, class245.field4050, (int[][]) null, class192.field3174[var12], var10, class304.field5084[var12], (byte) 90, var12, class177.field2925[var12], var11, var100);
                        class264[] var111 = class36.method290(var11, class304.field5084[var12], class12.field166[var12], var102, class177.field2925[var12], class245.field4050, class126.field2104[var12], class192.field3174[var12], var12, var101, var100, -123);
                        class264[] var112 = new class264[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class306.method2064(var12, var112);
                        class240.method1690(var102, class62.field891, class12.field166[var12], 1, var12, var101, class192.field3174[var12], var100, class126.field2104[var12], class62.field889, class177.field2925[var12], class304.field5084[var12]);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var103[var105 + 1][var104] - var103[var105 - 1][var104];
                        int var107 = var103[var105][var104 + 1] - var103[var105][var104 - 1];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                        var100[var105][var104] = (float) var106 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var102[var105][var104] = (float) var107 / var108;
                    }
                    var104++;
                }
            }
            class126.field2104[var12] = (byte[][]) null;
            class12.field166[var12] = (byte[][]) null;
            class304.field5084[var12] = (byte[][]) null;
            class177.field2925[var12] = (byte[][]) null;
            class16.field190[var12] = (byte[][]) null;
        }
        class118.method890(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class245.field4050[1][var115][var116] & 0x2) == 2) {
                    class119.method893(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class1.field10[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var118;
                        int var121;
                        for (var121 = var118; var121 < 104 && (class1.field10[var117][var119][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        while (var120 > 0 && (class1.field10[var117][var119][var120 - 1] & 0x1) != 0) {
                            var120--;
                        }
                        int var122 = var117;
                        int var123 = var117;
                        label450: while (var122 > 0) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class1.field10[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label450;
                                }
                            }
                            var122--;
                        }
                        label439: while (var123 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class1.field10[var123 + 1][var119][var125] & 0x1) == 0) {
                                    break label439;
                                }
                            }
                            var123++;
                        }
                        int var126 = (var121 + 1 - var120) * (var123 + 1 - var122);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class192.field3174[var123][var119][var120] - var127;
                            int var129 = class192.field3174[var122][var119][var120];
                            class98.method723(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var128, var129);
                            for (int var130 = var122; var130 <= var123; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class1.field10[var130][var119][var131] = class243.method1696(class1.field10[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class1.field10[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133;
                        for (var133 = var119; var133 < 104 && (class1.field10[var117][var133 + 1][var118] & 0x2) != 0; var133++) {
                        }
                        while (var132 > 0 && (class1.field10[var117][var132 - 1][var118] & 0x2) != 0) {
                            var132--;
                        }
                        int var134 = var117;
                        int var135 = var117;
                        label504: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class1.field10[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label504;
                                }
                            }
                            var134--;
                        }
                        label493: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class1.field10[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label493;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var133 + 1 - var132) * (var135 + 1 - var134);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class192.field3174[var134][var132][var118];
                            int var141 = class192.field3174[var135][var132][var118] - var139;
                            class98.method723(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var141, var140);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class1.field10[var142][var143][var118] = class243.method1696(class1.field10[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class1.field10[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147;
                        for (var147 = var118; var147 < 104 && (class1.field10[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        while (var146 > 0 && (class1.field10[var117][var119][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        label558: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class1.field10[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label558;
                                }
                            }
                            var144--;
                        }
                        label547: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class1.field10[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label547;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var144) * (var147 + 1 - var146)) >= 4) {
                            int var150 = class192.field3174[var117][var144][var146];
                            class98.method723(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class1.field10[var117][var151][var152] = class243.method1696(class1.field10[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)[I", line = 1041)
    public final int[] method394(int arg0, int arg1, byte arg2) {
        int var4 = 70 / ((arg2 - 43) / 59);
        field845++;
        return this.field833[arg1].field841 ? this.field833[arg1].method63(true, arg0) : this.field833[arg1].method116(arg0, 4588)[0];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILl;Ll;)V", line = 1061)
    public static final void method395(int arg0, class80 arg1, class80 arg2) {
        field844++;
        if (arg2.field1318 != null) {
            arg2.method598(104);
        }
        arg2.field1318 = arg1.field1318;
        arg2.field1317 = arg1;
        arg2.field1318.field1317 = arg2;
        if (arg0 == -12564) {
            arg2.field1317.field1318 = arg2;
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V", line = 1085)
    public static void method396(int arg0) {
        field843 = null;
        field829 = null;
        field836 = null;
        if (arg0 != -15585) {
            method392((class229[]) null, false, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(I)V", line = 1098)
    public void method65(int arg0) {
        field830++;
        if (arg0 <= 110) {
            this.method390(-67);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)[[I", line = 1108)
    public final int[][] method397(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            return (int[][]) ((int[][]) null);
        }
        field828++;
        if (this.field833[arg1].field841) {
            int[] var4 = this.field833[arg1].method63(true, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field833[arg1].method116(arg2, 4588);
        }
    }

    @OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V", line = 1140)
    public void method398(int arg0) {
        if (arg0 != 105) {
            field829 = (class143) null;
        }
        field847++;
        if (this.field841) {
            this.field846.method382(0);
            this.field846 = null;
        } else {
            this.field838.method1798(-128);
            this.field838 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[[I", line = 1170)
    public int[][] method116(int arg0, int arg1) {
        field834++;
        if (arg1 == 4588) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I", line = 1181)
    public int method399(byte arg0) {
        field848++;
        int var2 = -42 % ((arg0) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IZ)V", line = 1189)
    public class59(int arg0, boolean arg1) {
        this.field841 = arg1;
        this.field833 = new class59[arg0];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfm;IIIIIIIZ)V", line = 1223)
    public static final void method400(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class244.field4035;
        int var11;
        int var12 = var11 = (arg7 << 7) - class255.field4266;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class192.field3174[arg1][arg6][arg7] - class129.field2111;
        int var18 = class192.field3174[arg1][arg6 + 1][arg7] - class129.field2111;
        int var19 = class192.field3174[arg1][arg6 + 1][arg7 + 1] - class129.field2111;
        int var20 = class192.field3174[arg1][arg6][arg7 + 1] - class129.field2111;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class310.field5212;
        int var46 = (var24 << 9) / var25 + class310.field5211;
        int var47 = (var27 << 9) / var31 + class310.field5212;
        int var48 = (var30 << 9) / var31 + class310.field5211;
        int var49 = (var33 << 9) / var37 + class310.field5212;
        int var50 = (var36 << 9) / var37 + class310.field5211;
        int var51 = (var39 << 9) / var43 + class310.field5212;
        int var52 = (var42 << 9) / var43 + class310.field5211;
        class310.field5200 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class198.field3304 && class211.method1490(class310.field5212 + class111.field1874, class7.field98 + class310.field5211, var50, var52, var48, var49, var51, var47)) {
                class110.field1869 = arg6;
                class24.field310 = arg7;
            }
            if (!class99.field1675 && !arg8) {
                class310.field5198 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class310.field5204 || var51 > class310.field5204 || var47 > class310.field5204) {
                    class310.field5198 = true;
                }
                if (arg0.field1655 == -1) {
                    if (arg0.field1650 != 12345678) {
                        class310.method2092(var50, var52, var48, var49, var51, var47, arg0.field1650, arg0.field1652, arg0.field1651);
                    }
                } else if (!class215.field3547) {
                    int var53 = class310.field5207.method109(120, arg0.field1655);
                    class310.method2092(var50, var52, var48, var49, var51, var47, class298.method2007(var53, arg0.field1650), class298.method2007(var53, arg0.field1652), class298.method2007(var53, arg0.field1651));
                } else if (arg0.field1653) {
                    class310.method2096(var50, var52, var48, var49, var51, var47, arg0.field1650, arg0.field1652, arg0.field1651, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1655);
                } else {
                    class310.method2096(var50, var52, var48, var49, var51, var47, arg0.field1650, arg0.field1652, arg0.field1651, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1655);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class198.field3304 && class211.method1490(class310.field5212 + class111.field1874, class7.field98 + class310.field5211, var46, var48, var52, var45, var47, var51)) {
            class110.field1869 = arg6;
            class24.field310 = arg7;
        }
        if (class99.field1675 || arg8) {
            return;
        }
        class310.field5198 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class310.field5204 || var47 > class310.field5204 || var51 > class310.field5204) {
            class310.field5198 = true;
        }
        if (arg0.field1655 == -1) {
            if (arg0.field1654 != 12345678) {
                class310.method2092(var46, var48, var52, var45, var47, var51, arg0.field1654, arg0.field1651, arg0.field1652);
            }
        } else if (class215.field3547) {
            class310.method2096(var46, var48, var52, var45, var47, var51, arg0.field1654, arg0.field1651, arg0.field1652, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1655);
        } else {
            int var54 = class310.field5207.method109(106, arg0.field1655);
            class310.method2092(var46, var48, var52, var45, var47, var51, class298.method2007(var54, arg0.field1654), class298.method2007(var54, arg0.field1651), class298.method2007(var54, arg0.field1652));
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BILhb;)V", line = 1380)
    public void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            this.field846 = (class57) null;
        }
        field842++;
    }
}
