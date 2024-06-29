import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class206 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    private int field3703 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public boolean field3698 = false;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    private int field3706 = 0;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field3711 = 128;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    private int field3705 = 128;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    private int field3708 = 0;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field3720 = -1;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "[I")
    public static int[] field3714 = new int[500];

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lvf;")
    private static class265 field3715 = class87.method582(-46, "Ok");

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lvf;")
    public static class265 field3710 = field3715;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3700 = -1;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "[Lvf;")
    public static class265[] field3717 = new class265[500];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[S")
    private short[] field3701;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[S")
    private short[] field3702;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[S")
    private short[] field3704;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "[S")
    private short[] field3712;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLng;)V")
    private final void method1409(int arg0, byte arg1, class135 arg2) {
        if (arg0 == 1) {
            this.field3709 = arg2.method927(126);
        } else if (arg0 == 2) {
            this.field3720 = arg2.method927(125);
        } else if (arg0 == 4) {
            this.field3705 = arg2.method927(125);
        } else if (arg0 == 5) {
            this.field3711 = arg2.method927(126);
        } else if (arg0 == 6) {
            this.field3703 = arg2.method927(127);
        } else if (arg0 == 7) {
            this.field3708 = arg2.method920((byte) 69);
        } else if (arg0 == 8) {
            this.field3706 = arg2.method920((byte) 102);
        } else if (arg0 == 9) {
            this.field3698 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method920((byte) 74);
            this.field3704 = new short[var4];
            this.field3701 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3704[var5] = (short) arg2.method927(125);
                this.field3701[var5] = (short) arg2.method927(127);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method920((byte) 79);
            this.field3702 = new short[var6];
            this.field3712 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3702[var7] = (short) arg2.method927(127);
                this.field3712[var7] = (short) arg2.method927(125);
            }
        }
        field3718++;
        int var8 = -7 % ((arg1 - 45) / 43);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lng;B)V")
    public final void method1410(class135 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method920((byte) 99);
            if (var3 == 0) {
                if (arg1 != -17) {
                    return;
                }
                field3699++;
                return;
            }
            this.method1409(var3, (byte) 122, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[Ljg;Z)V")
    public static final void method1411(byte arg0, class257[] arg1, boolean arg2) {
        field3719++;
        byte var3;
        if (arg2) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class230.field4064[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class230.field4064[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg1[var7].method1699(2097152, var5, var6);
                            }
                        }
                    }
                }
            }
            class187.field3375 += (int) (Math.random() * 5.0D) - 2;
            class32.field811 += (int) (Math.random() * 5.0D) - 2;
            if (class187.field3375 < -16) {
                class187.field3375 = -16;
            }
            if (class187.field3375 > 16) {
                class187.field3375 = 16;
            }
            if (class32.field811 < -8) {
                class32.field811 = -8;
            }
            if (class32.field811 > 8) {
                class32.field811 = 8;
            }
        }
        int var8 = class32.field811 >> 2 << 10;
        int var9 = class187.field3375 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class11.field385[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class279.field4936[var12][var100 + 1][var54] - class279.field4936[var12][var100 - 1][var54];
                    int var103 = class279.field4936[var12][var100][var54 + 1] - class279.field4936[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var51[var100][var54 + 1] >> 3) + ((var51[var100][var54 - 1] >> 2) + (var51[var100 - 1][var54] >> 2) - (-(var51[var100 + 1][var54] >> 3) - (var51[var100][var54] >> 1)));
                    int var109 = (var105 * -50 + var106 * -50 + var107 * -10) / var53 + var101;
                    var10[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class16.field461[var55] = 0;
                class43.field963[var55] = 0;
                class75.field1442[var55] = 0;
                class276.field4879[var55] = 0;
                class177.field3160[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class14.field423[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class65 var96 = class17.method120(-8, var95 - 1);
                            class16.field461[var85] += var96.field1250;
                            class43.field963[var85] += var96.field1252;
                            class75.field1442[var85] += var96.field1249;
                            class276.field4879[var85] += var96.field1255;
                            var10002 = class177.field3160[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class14.field423[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class65 var99 = class17.method120(-8, var98 - 1);
                            class16.field461[var85] -= var99.field1250;
                            class43.field963[var85] -= var99.field1252;
                            class75.field1442[var85] -= var99.field1249;
                            class276.field4879[var85] -= var99.field1255;
                            var10002 = class177.field3160[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var89 += class177.field3160[var92];
                            var87 += class43.field963[var92];
                            var90 += class75.field1442[var92];
                            var88 += class276.field4879[var92];
                            var86 += class16.field461[var92];
                        }
                        if (var93 >= 0) {
                            var90 -= class75.field1442[var93];
                            var89 -= class177.field3160[var93];
                            var88 -= class276.field4879[var93];
                            var87 -= class43.field963[var93];
                            var86 -= class16.field461[var93];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var11[var56][var91] = class79.method547(var87 / var89, var86 * 256 / var88, var90 / var89, 0);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg2 || class231.method1561(25088) || (class230.field4064[0][var57][var58] & 0x2) != 0 || (class230.field4064[var12][var57][var58] & 0x10) == 0 && class166.method1090(var57, true, var12, var58) == class58.field1181) {
                        if (class268.field4721 > var12) {
                            class268.field4721 = var12;
                        }
                        int var59 = class14.field423[var12][var57][var58] & 0xFF;
                        int var60 = class282.field4966[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class279.field4936[var12][var57 + 1][var58];
                            int var62 = class279.field4936[var12][var57][var58];
                            int var63 = class279.field4936[var12][var57 + 1][var58 + 1];
                            int var64 = class279.field4936[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class283.field4984[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class95.method642(false, var60 - 1).field1919) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var62 == var63 && var62 == var64) {
                                    class70.field1345[var12][var57][var58] = class144.method992(class70.field1345[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var11[var57][var58];
                                int var67 = (var66 & 0x7F) + var9;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var66 & 0x380) + (var8 + var66 & 0xFC00) + var67;
                                var69 = class247.field4286[class137.method952(var68, (byte) 53, 96)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var10[var57][var58];
                            int var71 = var10[var57 + 1][var58];
                            int var72 = var10[var57 + 1][var58 + 1];
                            int var73 = var10[var57][var58 + 1];
                            if (var60 == 0) {
                                class233.method1569(var12, var57, var58, 0, 0, -1, var62, var61, var63, var64, class137.method952(var66, (byte) 55, var70), class137.method952(var66, (byte) 71, var71), class137.method952(var66, (byte) 115, var72), class137.method952(var66, (byte) 104, var73), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class283.field4984[var12][var57][var58] + 1;
                                byte var75 = class81.field1528[var12][var57][var58];
                                class110 var76 = class95.method642(false, var60 - 1);
                                int var77 = var76.field1931;
                                if (var77 >= 0 && !class247.field4292.method63(255, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var81 = class247.field4286[class4.method27(23024, 96, class247.field4292.method64(-83, var77))];
                                } else if (var76.field1921 == -1) {
                                    var81 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field1921;
                                    int var79 = (var78 & 0x7F) + var9;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var8 + var78 & 0xFC00) + (var78 & 0x380) + var79;
                                    var81 = class247.field4286[class4.method27(23024, 96, var80)];
                                }
                                if (var76.field1915 >= 0) {
                                    int var82 = var76.field1915;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 & 0x380) + (var8 + var82 & 0xFC00) + var83;
                                    var81 = class247.field4286[class4.method27(23024, 96, var84)];
                                }
                                class233.method1569(var12, var57, var58, var74, var75, var77, var62, var61, var63, var64, class137.method952(var66, (byte) 84, var70), class137.method952(var66, (byte) 12, var71), class137.method952(var66, (byte) 24, var72), class137.method952(var66, (byte) 87, var73), class4.method27(23024, var70, var78), class4.method27(23024, var71, var78), class4.method27(23024, var72, var78), class4.method27(23024, var73, var78), var69, var81);
                            }
                        }
                    }
                }
            }
            class14.field423[var12] = null;
            class282.field4966[var12] = null;
            class283.field4984[var12] = null;
            class81.field1528[var12] = null;
            class11.field385[var12] = null;
        }
        if (arg0 <= 46) {
            field3700 = -60;
        }
        class45.method373(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class230.field4064[1][var13][var50] & 0x2) == 2) {
                    class214.method1458(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class70.field1345[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18;
                        for (var18 = var15; var18 < 104 && (class70.field1345[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19 = var14;
                        while (var17 > 0 && (class70.field1345[var14][var16][var17 - 1] & 0x1) != 0) {
                            var17--;
                        }
                        int var20 = var14;
                        label352: while (var19 > 0) {
                            for (int var21 = var17; var21 <= var18; var21++) {
                                if ((class70.field1345[var19 - 1][var16][var21] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var19--;
                        }
                        label341: while (var20 < 3) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class70.field1345[var20 + 1][var16][var22] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var20++;
                        }
                        int var23 = (var18 - (var17 - 1)) * (var20 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class279.field4936[var20][var16][var17] - var24;
                            int var26 = class279.field4936[var19][var16][var17];
                            class10.method76(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var20; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class70.field1345[var27][var16][var28] = class203.method1395(class70.field1345[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class70.field1345[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30;
                        for (var30 = var16; var30 < 104 && (class70.field1345[var14][var30 + 1][var15] & 0x2) != 0; var30++) {
                        }
                        int var31 = var14;
                        int var32 = var14;
                        while (var29 > 0 && (class70.field1345[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        label407: while (var32 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class70.field1345[var32 - 1][var33][var15] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var32--;
                        }
                        label396: while (var31 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class70.field1345[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var30 + 1 - var29) * (var31 + 1 - var32);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class279.field4936[var32][var29][var15];
                            int var38 = class279.field4936[var31][var29][var15] - var36;
                            class10.method76(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var32; var39 <= var31; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class70.field1345[var39][var40][var15] = class203.method1395(class70.field1345[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class70.field1345[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 < 104 && (class70.field1345[var14][var16][var43 + 1] & 0x4) != 0; var43++) {
                        }
                        int var44;
                        for (var44 = var15; var44 > 0 && (class70.field1345[var14][var16][var44 - 1] & 0x4) != 0; var44--) {
                        }
                        label461: while (var42 > 0) {
                            for (int var45 = var44; var45 <= var43; var45++) {
                                if ((class70.field1345[var14][var42 - 1][var45] & 0x4) == 0) {
                                    break label461;
                                }
                            }
                            var42--;
                        }
                        label450: while (var41 < 104) {
                            for (int var46 = var44; var46 <= var43; var46++) {
                                if ((class70.field1345[var14][var41 + 1][var46] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                            var41++;
                        }
                        if ((var41 + 1 - var42) * (var43 + 1 - var44) >= 4) {
                            int var47 = class279.field4936[var14][var42][var44];
                            class10.method76(4, var42 * 128, var41 * 128 + 128, var44 * 128, var43 * 128 + 128, var47, var47);
                            for (int var48 = var42; var48 <= var41; var48++) {
                                for (int var49 = var44; var49 <= var43; var49++) {
                                    class70.field1345[var14][var48][var49] = class203.method1395(class70.field1345[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    public static final int method1412(int arg0, int arg1) {
        field3707++;
        if (arg1 != 23190) {
            field3715 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Luh;")
    public final class235 method1413(byte arg0, int arg1) {
        field3713++;
        class235 var3 = (class235) class91.field1612.method1887(124, (long) this.field3697);
        if (var3 == null) {
            class20 var4 = class20.method157(class233.field4104, this.field3709, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3704 != null) {
                for (int var5 = 0; var5 < this.field3704.length; var5++) {
                    var4.method142(this.field3704[var5], this.field3701[var5]);
                }
            }
            if (this.field3702 != null) {
                for (int var6 = 0; var6 < this.field3702.length; var6++) {
                    var4.method161(this.field3702[var6], this.field3712[var6]);
                }
            }
            var3 = var4.method172(this.field3708 + 64, this.field3706 + 850, -30, -50, -30);
            class91.field1612.method1892(var3, (long) this.field3697, (byte) -128);
        }
        class235 var7;
        if (this.field3720 == -1 || arg1 == -1) {
            var7 = var3.method1272(true, true);
        } else {
            var7 = class174.method1142(this.field3720, false).method1486(var3, arg1, 54);
        }
        int var8 = 73 / ((arg0 + 90) / 34);
        if (this.field3705 != 128 || this.field3711 != 128) {
            var7.method1257(this.field3705, this.field3711, this.field3705);
        }
        if (this.field3703 != 0) {
            if (this.field3703 == 90) {
                var7.method1271();
            }
            if (this.field3703 == 180) {
                var7.method1268();
            }
            if (this.field3703 == 270) {
                var7.method1256();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lba;Z)V")
    public static final void method1414(class140 arg0, boolean arg1) {
        field3716++;
        int var2 = arg0.field2549 - class93.field1655;
        int var3 = arg0.field2539 * 128 + (arg0.method822(2) * 64);
        int var4 = arg0.field2593 * 128 + (arg0.method822(2) * 64);
        if (arg1) {
            method1415((byte) 91);
        }
        arg0.field2564 += (var4 - arg0.field2564) / var2;
        if (arg0.field2567 == 0) {
            arg0.field2580 = 1024;
        }
        arg0.field2599 = 0;
        if (arg0.field2567 == 1) {
            arg0.field2580 = 1536;
        }
        if (arg0.field2567 == 2) {
            arg0.field2580 = 0;
        }
        if (arg0.field2567 == 3) {
            arg0.field2580 = 512;
        }
        arg0.field2600 += (var3 - arg0.field2600) / var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field3715 = null;
        if (arg0 <= -14) {
            field3717 = null;
            field3714 = null;
            field3710 = null;
        }
    }
}
