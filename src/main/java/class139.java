import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class139 extends class5 {

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Z")
    public boolean field2598 = false;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Lnj;")
    private class138 field2602;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Z")
    private boolean field2595;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Z")
    private boolean field2601;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Z")
    public static boolean field2591 = false;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lhj;")
    public static class69 field2597 = class181.method1318("Suche nach Updates )2 ", (byte) -110);

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
    public static int[] field2607 = new int[25];

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "[I")
    public static int[] field2610 = new int[128];

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "F")
    private float field2611;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "Lha;")
    public static class30 field2600;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[I")
    private int[] field2608;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[[[I")
    public static int[][][] field2593;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZB[Lah;)V")
    public static final void method1067(boolean arg0, byte arg1, class263[] arg2) {
        field2596++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class19.field246[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class19.field246[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method1815(var4, var5, arg1 ^ 0x28);
                            }
                        }
                    }
                }
            }
            class55.field992 += (int) (Math.random() * 5.0D) - 2;
            class55.field994 += (int) (Math.random() * 5.0D) - 2;
            if (class55.field994 < -16) {
                class55.field994 = -16;
            }
            if (class55.field994 > 16) {
                class55.field994 = 16;
            }
            if (class55.field992 < -8) {
                class55.field992 = -8;
            }
            if (class55.field992 > 8) {
                class55.field992 = 8;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class55.field994 >> 1;
        int[][] var9 = new int[104][104];
        int var10 = class55.field992 >> 2 << 10;
        if (arg1 != 86) {
            method1073(-106, -30, -87);
        }
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class33.field454[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class271.field4793[var12][var100 + 1][var54] - class271.field4793[var12][var100 - 1][var54];
                    byte var102 = 74;
                    int var103 = class271.field4793[var12][var100][var54 + 1] - class271.field4793[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var101 * var101 + (var103 * var103) + 65536));
                    int var105 = (var101 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var105 * -50 + var106 * -10 + var107 * -50) / var53 + var102;
                    int var109 = (var51[var100 + 1][var54] >> 3) + ((var51[var100][var54 - 1] >> 2) + (var51[var100 - 1][var54] >> 2) - (-(var51[var100][var54 + 1] >> 3) - (var51[var100][var54] >> 1)));
                    var9[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class258.field4632[var55] = 0;
                class131.field2435[var55] = 0;
                class221.field3975[var55] = 0;
                class40.field571[var55] = 0;
                class171.field3141[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class253.field4560[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class141 var96 = class233.method1655(var95 - 1, (byte) -62);
                            class258.field4632[var85] += var96.field2629;
                            class131.field2435[var85] += var96.field2628;
                            class221.field3975[var85] += var96.field2625;
                            class40.field571[var85] += var96.field2627;
                            var10002 = class171.field3141[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class253.field4560[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class141 var99 = class233.method1655(var98 - 1, (byte) -106);
                            class258.field4632[var85] -= var99.field2629;
                            class131.field2435[var85] -= var99.field2628;
                            class221.field3975[var85] -= var99.field2625;
                            class40.field571[var85] -= var99.field2627;
                            var10002 = class171.field3141[var85]--;
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
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var89 += class171.field3141[var93];
                            var86 += class258.field4632[var93];
                            var87 += class131.field2435[var93];
                            var90 += class221.field3975[var93];
                            var88 += class40.field571[var93];
                        }
                        if (var92 >= 0) {
                            var88 -= class40.field571[var92];
                            var89 -= class171.field3141[var92];
                            var87 -= class131.field2435[var92];
                            var86 -= class258.field4632[var92];
                            var90 -= class221.field3975[var92];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var11[var56][var91] = class33.method180(var87 / var89, 1, var86 * 256 / var88, var90 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class163.method1215(arg1 ^ 0x2D) || (class19.field246[0][var57][var58] & 0x2) != 0 || (class19.field246[var12][var57][var58] & 0x10) == 0 && class193.method1396(var12, false, var57, var58) == class97.field1811) {
                        if (class88.field1670 > var12) {
                            class88.field1670 = var12;
                        }
                        int var59 = class253.field4560[var12][var57][var58] & 0xFF;
                        int var60 = class181.field3285[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class271.field4793[var12][var57][var58];
                            int var62 = class271.field4793[var12][var57 + 1][var58];
                            int var63 = class271.field4793[var12][var57 + 1][var58 + 1];
                            int var64 = class271.field4793[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class212.field3858[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class229.method1637(var60 - 1, 383).field2771) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class145.field2685[var12][var57][var58] = class230.method1644(class145.field2685[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var11[var57][var58];
                                int var67 = (var66 & 0x7F) + var8;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var10 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class178.field3243[class35.method186(96, 0, var68)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var9[var57][var58];
                            int var71 = var9[var57 + 1][var58];
                            int var72 = var9[var57][var58 + 1];
                            int var73 = var9[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class89.method636(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class35.method186(var70, 0, var66), class35.method186(var71, 0, var66), class35.method186(var73, 0, var66), class35.method186(var72, 0, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                byte var74 = class41.field581[var12][var57][var58];
                                int var75 = class212.field3858[var12][var57][var58] + 1;
                                class149 var76 = class229.method1637(var60 - 1, 383);
                                int var77 = var76.field2777;
                                if (var77 >= 0 && !class178.field3236.method786(var77, (byte) -84)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var81 = class178.field3243[class45.method254(96, class178.field3236.method772((byte) 2, var77), (byte) 108)];
                                } else if (var76.field2784 == -1) {
                                    var81 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field2784;
                                    int var79 = (var78 & 0x7F) + var8;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var10 + var78 & 0xFC00) + (var78 & 0x380) + var79;
                                    var81 = class178.field3243[class45.method254(96, var80, (byte) 108)];
                                }
                                if (var76.field2782 >= 0) {
                                    int var82 = var76.field2782;
                                    int var83 = (var82 & 0x7F) + var8;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 + var10 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class178.field3243[class45.method254(96, var84, (byte) 108)];
                                }
                                class89.method636(var12, var57, var58, var75, var74, var77, var61, var62, var63, var64, class35.method186(var70, arg1 - 86, var66), class35.method186(var71, 0, var66), class35.method186(var73, arg1 ^ 0x56, var66), class35.method186(var72, 0, var66), class45.method254(var70, var78, (byte) 108), class45.method254(var71, var78, (byte) 108), class45.method254(var73, var78, (byte) 108), class45.method254(var72, var78, (byte) 108), var69, var81);
                            }
                        }
                    }
                }
            }
            class253.field4560[var12] = null;
            class181.field3285[var12] = null;
            class212.field3858[var12] = null;
            class41.field581[var12] = null;
            class33.field454[var12] = null;
        }
        class54.method321(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class19.field246[1][var13][var50] & 0x2) == 2) {
                    class100.method743(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class145.field2685[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 > 0 && (class145.field2685[var14][var16][var17 - 1] & 0x1) != 0; var17--) {
                        }
                        int var18;
                        for (var18 = var15; var18 < 104 && (class145.field2685[var14][var16][var18 + 1] & 0x1) != 0; var18++) {
                        }
                        int var19;
                        label354: for (var19 = var14; var19 > 0; var19--) {
                            for (int var20 = var17; var20 <= var18; var20++) {
                                if ((class145.field2685[var19 - 1][var16][var20] & 0x1) == 0) {
                                    break label354;
                                }
                            }
                        }
                        int var21;
                        label342: for (var21 = var14; var21 < 3; var21++) {
                            for (int var22 = var17; var22 <= var18; var22++) {
                                if ((class145.field2685[var21 + 1][var16][var22] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                        }
                        int var23 = (var18 + 1 - var17) * (var21 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class271.field4793[var21][var16][var17] - var24;
                            int var26 = class271.field4793[var19][var16][var17];
                            class123.method884(1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                            for (int var27 = var19; var27 <= var21; var27++) {
                                for (int var28 = var17; var28 <= var18; var28++) {
                                    class145.field2685[var27][var16][var28] = class69.method443(class145.field2685[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class145.field2685[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var14;
                        int var30 = var16;
                        int var31 = var14;
                        int var32 = var16;
                        while (var30 < 104 && (class145.field2685[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        while (var32 > 0 && (class145.field2685[var14][var32 - 1][var15] & 0x2) != 0) {
                            var32--;
                        }
                        label409: while (var29 > 0) {
                            for (int var33 = var32; var33 <= var30; var33++) {
                                if ((class145.field2685[var29 - 1][var33][var15] & 0x2) == 0) {
                                    break label409;
                                }
                            }
                            var29--;
                        }
                        label398: while (var31 < 3) {
                            for (int var34 = var32; var34 <= var30; var34++) {
                                if ((class145.field2685[var31 + 1][var34][var15] & 0x2) == 0) {
                                    break label398;
                                }
                            }
                            var31++;
                        }
                        int var35 = (var30 + 1 - var32) * (var31 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class271.field4793[var29][var32][var15];
                            int var38 = class271.field4793[var31][var32][var15] - var36;
                            class123.method884(2, var32 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                            for (int var39 = var29; var39 <= var31; var39++) {
                                for (int var40 = var32; var40 <= var30; var40++) {
                                    class145.field2685[var39][var40][var15] = class69.method443(class145.field2685[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class145.field2685[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43;
                        for (var43 = var15; var43 > 0 && (class145.field2685[var14][var16][var43 - 1] & 0x4) != 0; var43--) {
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class145.field2685[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label462: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class145.field2685[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var41--;
                        }
                        label451: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class145.field2685[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var42++;
                        }
                        if ((var42 + 1 - var41) * (var44 + 1 - var43) >= 4) {
                            int var47 = class271.field4793[var14][var41][var43];
                            class123.method884(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class145.field2685[var14][var48][var49] = class69.method443(class145.field2685[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public final void method1068(int arg0, int arg1) {
        field2606++;
        if (this.field2608 == null) {
            return;
        }
        if (this.field2594 != 0 || this.field2609 != 0) {
            if (class258.field4637 == null || class258.field4637.length < this.field2608.length) {
                class258.field4637 = new int[this.field2608.length];
            }
            int var3 = this.field2608.length == 4096 ? 64 : 128;
            int var4 = this.field2608.length;
            int var5 = this.field2609 * arg0;
            int var6 = var4 - 1;
            int var7 = var3 - 1;
            int var8 = arg0 * var3 * this.field2594;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var11 = var8 + var9 & var6;
                for (int var12 = 0; var12 < var3; var12++) {
                    int var13 = var9 + var12;
                    int var14 = (var5 + var12 & var7) + var11;
                    class258.field4637[var13] = this.field2608[var14];
                }
            }
            int[] var10 = this.field2608;
            this.field2608 = class258.field4637;
            class258.field4637 = var10;
        }
        if (arg1 != -15037) {
            field2604 = -53;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(FLnc;Lse;ZZ)[I")
    public final int[] method1069(float arg0, class83 arg1, class198 arg2, boolean arg3, boolean arg4) {
        field2603++;
        if (!arg3) {
            this.field2609 = -55;
        }
        if (this.field2608 == null || this.field2611 != arg0) {
            if (!this.field2602.method1066((byte) 104, arg2, arg1)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field2608 = this.field2602.method1063(var6, (double) arg0, this.field2601, false, arg2, arg1, true, var6);
            this.field2611 = arg0;
            if (this.field2595) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var16; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field2608[var13];
                        var10[var34] += class69.method443(var35 >> 16, 255);
                        var7[var34] += class69.method443(65322, var35) >> 8;
                        var8[var34] += class69.method443(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var15; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var24 += var10[var25];
                        var22 += var7[var25];
                        var23 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var16; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        var21--;
                        var25--;
                        int var32 = var24 / 9;
                        int var33 = var23 / 9;
                        var19--;
                        var9[var19] = class230.method1644(var33, class230.method1644(var32 << 16, var31 << 8));
                        var24 += var10[var25] - var10[var21];
                        var22 += var7[var25] - var7[var21];
                        var23 += var8[var25] - var8[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var16; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field2608[var13];
                        var14--;
                        int var30 = this.field2608[var14];
                        var10[var28] += (class69.method443(16741568, var29) >> 16) - (class69.method443(var30, 16751909) >> 16);
                        var7[var28] += (class69.method443(var29, 65293) >> 8) - (class69.method443(var30, 65333) >> 8);
                        var8[var28] += -class69.method443(var30, 255) + class69.method443(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field2608 = var9;
            }
        }
        return this.field2608;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method1070(int arg0) {
        field2600 = null;
        field2593 = null;
        field2597 = null;
        field2610 = null;
        field2607 = null;
        if (arg0 != -17772) {
            method1067(false, (byte) -119, (class263[]) null);
        }
    }

    @OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2612++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lse;ILnc;)Z")
    public final boolean method1071(class198 arg0, int arg1, class83 arg2) {
        if (arg1 == 4) {
            field2605++;
            return this.field2602.method1066((byte) 47, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)I")
    public static final int method1072(byte arg0) {
        field2599++;
        int var1 = 29 % ((arg0 - 25) / 47);
        return 16;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lge;")
    public static final class68 method1073(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null || var3.field3949 == null ? null : var3.field3949;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILse;ZLnc;)[I")
    public final int[] method1074(int arg0, class198 arg1, boolean arg2, class83 arg3) {
        field2592++;
        if (arg0 != 128) {
            method1070(-82);
        }
        if (this.field2602.method1066((byte) 72, arg1, arg3)) {
            int var5 = arg2 ? 64 : 128;
            return this.field2602.method1063(var5, 1.0D, this.field2601, false, arg1, arg3, false, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lfh;)V")
    public class139(class128 arg0) {
        this.field2602 = new class138(arg0);
        this.field2595 = arg0.method937(false) == 1;
        this.field2601 = arg0.method937(false) == 1;
        arg0.method937(false);
        arg0.method937(false);
        int var2 = arg0.method937(false) & 0x3;
        this.field2609 = arg0.method950(1495791448);
        this.field2594 = arg0.method950(1495791448);
        arg0.method937(false);
        arg0.method937(false);
    }
}
