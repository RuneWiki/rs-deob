import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class155 extends class105 {

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    private int field3032 = 1024;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    private int field3034 = 2048;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    private int field3038 = 3072;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "[I")
    public static int[] field3028 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "Z")
    public static boolean field3044 = false;

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "[[I")
    public static int[][] field3042 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Leh;")
    public static class47 field3031 = class195.method1282((byte) -4, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lpa;")
    public static class136 field3040 = new class136(20);

    @OriginalMember(owner = "client!rb", name = "rb", descriptor = "Lea;")
    public static class40 field3046 = new class40();

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "[I")
    public static int[] field3037;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)Z")
    public static final boolean method1073(int arg0, int arg1, int arg2) {
        if (~arg0 == -12) {
            arg0 = 10;
        }
        ++field3039;
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg1 <= 45) {
            method1077((byte) 48);
        }
        class202 var3 = class99.method806(0, arg2);
        return var3.method1318(arg0, 894715623);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLah;Lah;)V")
    public static final void method1074(byte arg0, class9 arg1, class9 arg2) {
        ++field3033;
        int var3 = 115 % ((arg0 - 56) / 36);
        class60.field1160 = arg2;
        class191.field3704 = arg1;
        class146.field2860 = class191.field3704.method68(72, 3);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (arg0 != -1) {
            this.method17(-20, (class68) null, -91);
        }
        this.field3034 = -this.field3032 + this.field3038;
        ++field3030;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            field3037 = null;
        }
        ++field3036;
        int[] var3 = super.field2192.method336(-68, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            for (int var5 = 0; class149.field2928 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field3034 >> 12) + this.field3032;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)V")
    public static final void method1075(boolean arg0) {
        if (!arg0) {
            method1073(27, -36, 98);
        }
        ++field3041;
        for (int var1 = 0; ~var1 > ~class94.field1942; ++var1) {
            int var2 = class196.field3810[var1];
            class32 var3 = class40.field795[var2];
            int var4 = class22.field418.method604((byte) -127);
            if ((2 & var4) != 0) {
                var4 += class22.field418.method604((byte) -124) << 8;
            }
            class190.method1252(var3, var2, var4, 34);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field3043;
        if (arg2 != -256) {
            method1077((byte) -50);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2179 = arg1.method604((byte) 32) == 1;
                }
            } else {
                this.field3038 = arg1.method569(26496);
            }
        } else {
            this.field3032 = arg1.method569(26496);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Ldg;)V")
    public static final void method1076(int arg0, class37[] arg1) {
        ++field3045;
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var111 = 0; var111 < 104; ++var111) {
                for (int var112 = 0; ~var112 > -105; ++var112) {
                    if (~(class182.field3490[var2][var111][var112] & 1) == -2) {
                        int var113 = var2;
                        if ((2 & class182.field3490[1][var111][var112]) == 2) {
                            var113 = var2 - 1;
                        }
                        if (var113 >= 0) {
                            arg1[var113].method320(2097152, var112, var111);
                        }
                    }
                }
            }
        }
        class120.field2434 += -2 + (int) (Math.random() * 5.0D);
        class95.field1973 += -2 + (int) (Math.random() * 5.0D);
        if (class120.field2434 < -8) {
            class120.field2434 = -8;
        }
        if (class120.field2434 > 8) {
            class120.field2434 = 8;
        }
        int[][] var3 = new int[104][104];
        if (class95.field1973 < -16) {
            class95.field1973 = -16;
        }
        int var4 = class120.field2434 >> 2 << 10;
        int[][] var5 = new int[104][104];
        if (arg0 > -47) {
            method1075(true);
        }
        if (class95.field1973 > 16) {
            class95.field1973 = 16;
        }
        int var6 = class95.field1973 >> 1;
        for (int var7 = 0; var7 < 4; ++var7) {
            byte[][] var50 = class197.field3846[var7];
            int var51 = (int) Math.sqrt(5100.0D);
            int var52 = var51 * 768 >> 8;
            for (int var53 = 1; ~var53 > -104; ++var53) {
                for (int var101 = 1; ~var101 > -104; ++var101) {
                    byte var102 = 96;
                    int var103 = class103.field2171[var7][var101][var53 - -1] + -class103.field2171[var7][var101][var53 + -1];
                    int var104 = class103.field2171[var7][var101 + 1][var53] + -class103.field2171[var7][var101 - 1][var53];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var106 * -50 + (var107 * -10 - -(var108 * -50))) / var52 + var102;
                    int var110 = (var50[var101][var53 + -1] >> 2) + (var50[var101][var53 + 1] >> 3) + (var50[var101][var53] >> 1) + (var50[var101 - 1][var53] >> 2) + (var50[var101 + 1][var53] >> 3);
                    var3[var101][var53] = -var110 + var109;
                }
            }
            for (int var54 = 0; ~var54 > -105; ++var54) {
                class2.field27[var54] = 0;
                class131.field2600[var54] = 0;
                class33.field645[var54] = 0;
                class133.field2629[var54] = 0;
                class67.field1432[var54] = 0;
            }
            for (int var55 = -5; ~var55 > -105; ++var55) {
                for (int var86 = 0; var86 < 104; ++var86) {
                    int var95 = var55 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class67.field1440[var7][var95][var86] & 255;
                        if (~var96 < -1) {
                            class159 var97 = class76.method663(var96 - 1, (byte) -27);
                            class2.field27[var86] += var97.field3085;
                            class131.field2600[var86] += var97.field3093;
                            class33.field645[var86] += var97.field3101;
                            class133.field2629[var86] += var97.field3089;
                            var10002 = class67.field1432[var86]++;
                        }
                    }
                    int var98 = var55 + -5;
                    if (~var98 <= -1) {
                        int var99 = 255 & class67.field1440[var7][var98][var86];
                        if (~var99 < -1) {
                            class159 var100 = class76.method663(var99 - 1, (byte) -27);
                            class2.field27[var86] -= var100.field3085;
                            class131.field2600[var86] -= var100.field3093;
                            class33.field645[var86] -= var100.field3101;
                            class133.field2629[var86] -= var100.field3089;
                            var10002 = class67.field1432[var86]--;
                        }
                    }
                }
                if (~var55 <= -1) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; ++var92) {
                        int var93 = var92 + 5;
                        if (~var93 > -105) {
                            var87 += class2.field27[var93];
                            var90 += class133.field2629[var93];
                            var88 += class131.field2600[var93];
                            var91 += class33.field645[var93];
                            var89 += class67.field1432[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var88 -= class131.field2600[var94];
                            var90 -= class133.field2629[var94];
                            var91 -= class33.field645[var94];
                            var87 -= class2.field27[var94];
                            var89 -= class67.field1432[var94];
                        }
                        if (var92 >= 0 && var89 > 0) {
                            var5[var55][var92] = class53.method469(var88 / var89, var87 * 256 / var90, (byte) -64, var91 / var89);
                        }
                    }
                }
            }
            for (int var56 = 1; ~var56 > -104; ++var56) {
                for (int var59 = 1; var59 < 103; ++var59) {
                    if (!class204.field4029 || ~(2 & class182.field3490[0][var56][var59]) != -1 || (class182.field3490[var7][var56][var59] & 16) == 0 && class25.method235(var59, var7, var56, (byte) 101) == class107.field2226) {
                        if (~class195.field3803 < ~var7) {
                            class195.field3803 = var7;
                        }
                        int var60 = class67.field1440[var7][var56][var59] & 255;
                        int var61 = 255 & class57.field1129[var7][var56][var59];
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class103.field2171[var7][var56 + 1][var59 + 1];
                            int var63 = class103.field2171[var7][var56][var59];
                            int var64 = class103.field2171[var7][var56 - -1][var59];
                            int var65 = class103.field2171[var7][var56][var59 + 1];
                            if (var7 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class123.field2488[var7][var56][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class165.method1122(4, var61 + -1).field1518) {
                                    var66 = false;
                                }
                                if (var66 && var63 == var64 && var62 == var63 && ~var63 == ~var65) {
                                    class148.field2911[var7][var56][var59] = class57.method495(class148.field2911[var7][var56][var59], 2340);
                                }
                            }
                            int var67;
                            int var68;
                            if (~var60 >= -1) {
                                var67 = -1;
                                var68 = 0;
                            } else {
                                var67 = var5[var56][var59];
                                int var69 = (127 & var67) - -var6;
                                if (~var69 <= -1) {
                                    if (var69 > 127) {
                                        var69 = 127;
                                    }
                                } else {
                                    var69 = 0;
                                }
                                int var70 = (64512 & var4 + var67) + (896 & var67) + var69;
                                var68 = class17.field344[class160.method1101(126, var70, 96)];
                            }
                            int var71 = var3[var56][var59];
                            int var72 = var3[var56 - -1][var59];
                            int var73 = var3[var56 + 1][var59 + 1];
                            int var74 = var3[var56][var59 + 1];
                            if (var61 != 0) {
                                int var75 = class123.field2488[var7][var56][var59] + 1;
                                byte var76 = class105.field2191[var7][var56][var59];
                                class69 var77 = class165.method1122(4, var61 - 1);
                                int var78 = var77.field1528;
                                if (var78 >= 0 && !class17.field354.method739(var78, -1193)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 < 0) {
                                    if (var77.field1519 == -1) {
                                        var79 = 0;
                                        var80 = -2;
                                    } else {
                                        var80 = var77.field1519;
                                        int var81 = (var80 & 127) + var6;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 127) {
                                            var81 = 127;
                                        }
                                        int var82 = (var4 + var80 & 64512) + var81 - -(896 & var80);
                                        var79 = class17.field344[class105.method857(96, var82, true)];
                                    }
                                } else {
                                    var79 = class17.field344[class105.method857(96, class17.field354.method731(var78, (byte) 60), true)];
                                    var80 = -1;
                                }
                                if (~var77.field1531 <= -1) {
                                    int var83 = var77.field1531;
                                    int var84 = (127 & var83) + var6;
                                    if (var84 >= 0) {
                                        if (~var84 < -128) {
                                            var84 = 127;
                                        }
                                    } else {
                                        var84 = 0;
                                    }
                                    int var85 = (var4 + var83 & 64512) - -(var83 & 896) - -var84;
                                    var79 = class17.field344[class105.method857(96, var85, true)];
                                }
                                class9.method65(var7, var56, var59, var75, var76, var78, var63, var64, var62, var65, class160.method1101(126, var67, var71), class160.method1101(126, var67, var72), class160.method1101(126, var67, var73), class160.method1101(126, var67, var74), class105.method857(var71, var80, true), class105.method857(var72, var80, true), class105.method857(var73, var80, true), class105.method857(var74, var80, true), var68, var79);
                            } else {
                                class9.method65(var7, var56, var59, 0, 0, -1, var63, var64, var62, var65, class160.method1101(126, var67, var71), class160.method1101(126, var67, var72), class160.method1101(126, var67, var73), class160.method1101(126, var67, var74), 0, 0, 0, 0, var68, 0);
                            }
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; ++var57) {
                for (int var58 = 1; ~var58 > -104; ++var58) {
                    class189.method1246(var7, var58, var57, class25.method235(var57, var7, var58, (byte) 101));
                }
            }
            class67.field1440[var7] = null;
            class57.field1129[var7] = null;
            class123.field2488[var7] = null;
            class105.field2191[var7] = null;
            class197.field3846[var7] = null;
        }
        class119.method924(-50, -10, -50);
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var49 = 0; var49 < 104; ++var49) {
                if ((2 & class182.field3490[1][var8][var49]) == 2) {
                    class16.method176(var8, var49);
                }
            }
        }
        int var9 = 2;
        int var10 = 4;
        int var11 = 1;
        for (int var12 = 0; var12 < 4; ++var12) {
            if (var12 > 0) {
                var11 <<= 3;
                var9 <<= 3;
                var10 <<= 3;
            }
            for (int var13 = 0; var13 <= var12; ++var13) {
                for (int var14 = 0; var14 <= 104; ++var14) {
                    for (int var15 = 0; ~var15 >= -105; ++var15) {
                        if (~(class148.field2911[var13][var15][var14] & var11) != -1) {
                            int var16;
                            for (var16 = var14; var16 < 104 && ~(class148.field2911[var13][var15][var16 - -1] & var11) != -1; ++var16) {
                            }
                            int var17;
                            for (var17 = var14; var17 > 0 && ~(class148.field2911[var13][var15][var17 + -1] & var11) != -1; --var17) {
                            }
                            int var18 = var13;
                            int var19;
                            label359: for (var19 = var13; ~var19 < -1; --var19) {
                                for (int var20 = var17; ~var16 <= ~var20; ++var20) {
                                    if (~(var11 & class148.field2911[var19 + -1][var15][var20]) == -1) {
                                        break label359;
                                    }
                                }
                            }
                            label348: while (var12 > var18) {
                                for (int var21 = var17; var21 <= var16; ++var21) {
                                    if ((var11 & class148.field2911[var18 + 1][var15][var21]) == 0) {
                                        break label348;
                                    }
                                }
                                ++var18;
                            }
                            int var22 = (var16 - -1 + -var17) * (-var19 + 1 + var18);
                            if (var22 >= 8) {
                                int var23 = class103.field2171[var19][var15][var17];
                                short var24 = 240;
                                int var25 = class103.field2171[var18][var15][var17] + -var24;
                                class124.method946(var12, 1, var15 * 128, var15 * 128, var17 * 128, var16 * 128 - -128, var25, var23);
                                for (int var26 = var19; var26 <= var18; ++var26) {
                                    for (int var27 = var17; var16 >= var27; ++var27) {
                                        class148.field2911[var26][var15][var27] = class142.method1018(class148.field2911[var26][var15][var27], ~var11);
                                    }
                                }
                            }
                        }
                        if ((class148.field2911[var13][var15][var14] & var9) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            int var30 = var13;
                            while (~var28 < -1 && (class148.field2911[var13][var28 + -1][var14] & var9) != 0) {
                                --var28;
                            }
                            while (var29 < 104 && (class148.field2911[var13][var29 - -1][var14] & var9) != 0) {
                                ++var29;
                            }
                            int var31 = var13;
                            label414: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; ++var32) {
                                    if ((var9 & class148.field2911[var30 + -1][var32][var14]) == 0) {
                                        break label414;
                                    }
                                }
                                --var30;
                            }
                            label403: while (~var12 < ~var31) {
                                for (int var33 = var28; var33 <= var29; ++var33) {
                                    if (~(var9 & class148.field2911[var31 + 1][var33][var14]) == -1) {
                                        break label403;
                                    }
                                }
                                ++var31;
                            }
                            int var34 = (var31 - -1 + -var30) * (-var28 + 1 + var29);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class103.field2171[var30][var28][var14];
                                int var37 = class103.field2171[var31][var28][var14] + -var35;
                                class124.method946(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var37, var36);
                                for (int var38 = var30; var31 >= var38; ++var38) {
                                    for (int var39 = var28; var29 >= var39; ++var39) {
                                        class148.field2911[var38][var39][var14] = class142.method1018(class148.field2911[var38][var39][var14], ~var9);
                                    }
                                }
                            }
                        }
                        if ((class148.field2911[var13][var15][var14] & var10) != 0) {
                            int var40 = var15;
                            int var41 = var15;
                            int var42;
                            for (var42 = var14; var42 < 104 && (var10 & class148.field2911[var13][var15][var42 + 1]) != 0; ++var42) {
                            }
                            int var43;
                            for (var43 = var14; ~var43 < -1 && ~(class148.field2911[var13][var15][var43 + -1] & var10) != -1; --var43) {
                            }
                            label468: while (~var41 < -1) {
                                for (int var44 = var43; ~var44 >= ~var42; ++var44) {
                                    if (~(var10 & class148.field2911[var13][var41 + -1][var44]) == -1) {
                                        break label468;
                                    }
                                }
                                --var41;
                            }
                            label457: while (~var40 > -105) {
                                for (int var45 = var43; ~var45 >= ~var42; ++var45) {
                                    if ((class148.field2911[var13][var40 + 1][var45] & var10) == 0) {
                                        break label457;
                                    }
                                }
                                ++var40;
                            }
                            if (~((-var41 + var40 + 1) * (-var43 + var42 + 1)) <= -5) {
                                int var46 = class103.field2171[var13][var41][var43];
                                class124.method946(var12, 4, var41 * 128, var40 * 128 + 128, var43 * 128, var42 * 128 + 128, var46, var46);
                                for (int var47 = var41; ~var40 <= ~var47; ++var47) {
                                    for (int var48 = var43; ~var48 >= ~var42; ++var48) {
                                        class148.field2911[var13][var47][var48] = class142.method1018(class148.field2911[var13][var47][var48], ~var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        field3037 = null;
        field3031 = null;
        field3046 = null;
        field3028 = null;
        if (arg0 == 50) {
            field3040 = null;
            field3042 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field3035;
        if (!arg1) {
            this.method15(-40, true);
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) 111, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class149.field2928; ++var11) {
                var8[var11] = this.field3032 - -(var5[var11] * this.field3034 >> 12);
                var10[var11] = (var7[var11] * this.field3034 >> 12) + this.field3032;
                var9[var11] = (var6[var11] * this.field3034 >> 12) + this.field3032;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, false);
    }
}
