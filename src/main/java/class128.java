import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class128 extends class148 {

    @OriginalMember(owner = "client!t", name = "Ib", descriptor = "Lwd;")
    public static class150 field3022 = class2.method9(true, "leuchten1:");

    @OriginalMember(owner = "client!t", name = "Kb", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!t", name = "Sb", descriptor = "Lwd;")
    private static class150 field3032 = class2.method9(true, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!t", name = "Ub", descriptor = "Lwd;")
    public static class150 field3034 = class2.method9(true, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

    @OriginalMember(owner = "client!t", name = "bc", descriptor = "Lwd;")
    public static class150 field3041 = class2.method9(true, ":chalreq:");

    @OriginalMember(owner = "client!t", name = "Ob", descriptor = "I")
    public static int field3028 = 1;

    @OriginalMember(owner = "client!t", name = "Qb", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "client!t", name = "Vb", descriptor = "Lwd;")
    public static class150 field3035 = field3032;

    @OriginalMember(owner = "client!t", name = "kc", descriptor = "Lwd;")
    private static class150 field3050 = class2.method9(true, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!t", name = "Tb", descriptor = "[[B")
    public static byte[][] field3033 = new byte[250][];

    @OriginalMember(owner = "client!t", name = "Wb", descriptor = "Lwd;")
    public static class150 field3036 = class2.method9(true, "overlay_multiway");

    @OriginalMember(owner = "client!t", name = "Rb", descriptor = "Lwd;")
    public static class150 field3031 = field3050;

    @OriginalMember(owner = "client!t", name = "Hb", descriptor = "Lwd;")
    private static class150 field3021 = class2.method9(true, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!t", name = "Mb", descriptor = "Lwd;")
    public static class150 field3026 = field3021;

    @OriginalMember(owner = "client!t", name = "Eb", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!t", name = "Fb", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!t", name = "Gb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!t", name = "Jb", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!t", name = "Lb", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!t", name = "Nb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!t", name = "Xb", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!t", name = "Yb", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!t", name = "Zb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!t", name = "cc", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!t", name = "dc", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!t", name = "ec", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!t", name = "fc", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!t", name = "gc", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!t", name = "ic", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!t", name = "jc", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!t", name = "lc", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!t", name = "mc", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!t", name = "Pb", descriptor = "Llf;")
    private class82 field3029;

    @OriginalMember(owner = "client!t", name = "ac", descriptor = "[I")
    public static int[] field3040;

    @OriginalMember(owner = "client!t", name = "hc", descriptor = "[Ln;")
    public static class90[] field3047;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(ZI)V")
    public final void method965(boolean arg0, int arg1) {
        super.field3592[super.field3601++] = (byte) (arg1 + this.field3029.method592((byte) 79));
        if (arg0) {
            ++field3037;
        }
    }

    @OriginalMember(owner = "client!t", name = "s", descriptor = "(I)V")
    public static final void method966(int arg0) {
        ++field3043;
        if (~class11.field277 == -11) {
            int var1 = class121.field2783.method1137(255);
            int var2 = (var1 >> 4 & 7) + class24.field707;
            int var3 = (var1 & 7) + class12.field291;
            int var4 = class121.field2783.method1147(-1);
            int var5 = class121.field2783.method1137(255);
            int var6 = var5 >> 2;
            int var7 = var5 & 3;
            int var8 = class40.field1059[var6];
            if (~var2 <= -1 && ~var3 <= -1 && ~var2 > -104 && var3 < 103) {
                int var9 = class121.field2789[class17.field466][var2][var3];
                int var10 = class121.field2789[class17.field466][var2 + 1][var3];
                int var11 = class121.field2789[class17.field466][var2][var3 + 1];
                int var12 = class121.field2789[class17.field466][var2 + 1][var3 - -1];
                if (var8 == 0) {
                    class94 var13 = class111.field2548.method889(class17.field466, var2, var3);
                    if (var13 != null) {
                        int var14 = 32767 & var13.field2196 >> 14;
                        if (var6 != 2) {
                            var13.field2177 = new class65(var14, var6, var7, var9, var10, var12, var11, var4, false, var13.field2177);
                        } else {
                            var13.field2177 = new class65(var14, 2, var7 + 4, var9, var10, var12, var11, var4, false, var13.field2177);
                            var13.field2194 = new class65(var14, 2, var7 + 1 & 3, var9, var10, var12, var11, var4, false, var13.field2194);
                        }
                    }
                }
                if (var8 == 1) {
                    class12 var15 = class111.field2548.method916(class17.field466, var2, var3);
                    if (var15 != null) {
                        var15.field296 = new class65(32767 & var15.field285 >> 14, 4, 0, var9, var10, var12, var11, var4, false, var15.field296);
                    }
                }
                if (~var8 == -3) {
                    if (~var6 == -12) {
                        var6 = 10;
                    }
                    class30 var16 = class111.field2548.method896(class17.field466, var2, var3);
                    if (var16 != null) {
                        var16.field889 = new class65((var16.field892 & 536856598) >> 14, var6, var7, var9, var10, var12, var11, var4, false, var16.field889);
                    }
                }
                if (var8 == 3) {
                    class58 var17 = class111.field2548.method937(class17.field466, var2, var3);
                    if (var17 != null) {
                        var17.field1499 = new class65((536854534 & var17.field1504) >> 14, 22, var7, var9, var10, var12, var11, var4, false, var17.field1499);
                    }
                }
            }
        } else {
            if (arg0 != -31521) {
                field3028 = -89;
            }
            if (class11.field277 == 142) {
                int var18 = class121.field2783.method1137(255);
                int var19 = (var18 & 7) + class12.field291;
                int var20 = ((var18 & 120) >> 4) + class24.field707;
                int var21 = class121.field2783.method1124(8) + var20;
                int var22 = var19 - -class121.field2783.method1124(8);
                int var23 = class121.field2783.method1141((byte) -6);
                int var24 = class121.field2783.method1140(-1);
                int var25 = class121.field2783.method1137(255) * 4;
                int var26 = class121.field2783.method1137(255) * 4;
                int var27 = class121.field2783.method1140(-1);
                int var28 = class121.field2783.method1140(-1);
                int var29 = class121.field2783.method1137(255);
                int var30 = class121.field2783.method1137(255);
                if (var20 >= 0 && ~var19 <= -1 && var20 < 104 && var19 < 104 && var21 >= 0 && ~var22 <= -1 && var21 < 104 && var22 < 104 && ~var24 != -65536) {
                    int var31 = var20 * 128 - -64;
                    int var32 = var22 * 128 + 64;
                    int var33 = var19 * 128 + 64;
                    int var34 = var21 * 128 - -64;
                    class15 var35 = new class15(var24, class17.field466, var31, var33, -var25 + class25.method205(var31, class17.field466, -23287, var33), class11.field280 + var27, class11.field280 + var28, var29, var30, var23, var26);
                    var35.method111(var34, var32, class25.method205(var34, class17.field466, -23287, var32) - var26, (byte) -118, class11.field280 + var27);
                    class111.field2570.method711(var35, arg0 + 31521);
                }
            } else if (class11.field277 == 236) {
                int var36 = class121.field2783.method1137(255);
                int var37 = (var36 >> 4 & 7) + class24.field707;
                int var38 = class12.field291 - -(7 & var36);
                int var39 = class121.field2783.method1127(113);
                int var40 = var39 & 3;
                int var41 = var39 >> 2;
                int var42 = class40.field1059[var41];
                int var43 = class121.field2783.method1140(-1);
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    class91.method650(-1, var38, (byte) -72, var37, class17.field466, var42, var43, 0, var40, var41);
                }
            } else if (~class11.field277 == -128) {
                int var44 = class121.field2783.method1127(109);
                int var45 = var44 >> 2;
                int var46 = var44 & 3;
                int var47 = class40.field1059[var45];
                int var48 = class121.field2783.method1127(117);
                int var49 = (7 & var48) + class12.field291;
                int var50 = class24.field707 - -(var48 >> 4 & 7);
                if (var50 >= 0 && ~var49 <= -1 && ~var50 > -105 && ~var49 > -105) {
                    class91.method650(-1, var49, (byte) -108, var50, class17.field466, var47, -1, 0, var46, var45);
                }
            } else if (~class11.field277 == -61) {
                int var51 = class121.field2783.method1140(-1);
                int var52 = class121.field2783.method1137(255);
                int var53 = class24.field707 - -((114 & var52) >> 4);
                int var54 = class12.field291 - -(7 & var52);
                int var55 = class121.field2783.method1147(-1);
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    class23 var56 = new class23();
                    var56.field661 = var55;
                    var56.field659 = var51;
                    if (class50.field1339[class17.field466][var53][var54] == null) {
                        class50.field1339[class17.field466][var53][var54] = new class103();
                    }
                    class50.field1339[class17.field466][var53][var54].method711(var56, 0);
                    class103.method701(var53, var54, -64);
                }
            } else {
                if (~class11.field277 == -44) {
                    byte var57 = class121.field2783.method1134(114);
                    byte var58 = class121.field2783.method1116(-128);
                    int var59 = class121.field2783.method1137(255);
                    int var60 = var59 >> 2;
                    int var61 = var59 & 3;
                    int var62 = class40.field1059[var60];
                    int var63 = class121.field2783.method1113(26939);
                    int var64 = class121.field2783.method1108(false);
                    int var65 = ((var64 & 126) >> 4) + class24.field707;
                    int var66 = (var64 & 7) + class12.field291;
                    int var67 = class121.field2783.method1113(26939);
                    byte var68 = class121.field2783.method1134(117);
                    byte var69 = class121.field2783.method1115((byte) -94);
                    int var70 = class121.field2783.method1113(26939);
                    int var71 = class121.field2783.method1136(44);
                    class111 var72;
                    if (~class29.field876 != ~var63) {
                        var72 = class137.field3217[var63];
                    } else {
                        var72 = class46.field1244;
                    }
                    if (var72 != null) {
                        class61 var73 = class20.method145(var71, (byte) -63);
                        int var74 = class121.field2789[class17.field466][var65 + 1][var66];
                        int var75 = class121.field2789[class17.field466][var65 - -1][var66 - -1];
                        int var76 = class121.field2789[class17.field466][var65][var66];
                        int var77 = class121.field2789[class17.field466][var65][var66 - -1];
                        class13 var78 = var73.method473(var61, arg0 ^ 31529, var76, var77, var60, var74, var75);
                        if (var78 != null) {
                            class91.method650(var70 - -1, var66, (byte) -63, var65, class17.field466, var62, -1, var67 + 1, 0, 0);
                            var72.field2553 = var78;
                            if (~var69 > ~var58) {
                                byte var79 = var58;
                                var58 = var69;
                                var69 = var79;
                            }
                            var72.field2545 = var67 - -class11.field280;
                            var72.field2547 = class11.field280 + var70;
                            int var80 = var73.field1571;
                            if (~var68 < ~var57) {
                                byte var81 = var68;
                                var68 = var57;
                                var57 = var81;
                            }
                            int var82 = var73.field1563;
                            if (~var61 == -2 || ~var61 == -4) {
                                var80 = var73.field1563;
                                var82 = var73.field1571;
                            }
                            var72.field2538 = var66 * 128 + var82 * 64;
                            var72.field2567 = var65 * 128 + var80 * 64;
                            var72.field2571 = class25.method205(var72.field2567, class17.field466, -23287, var72.field2538);
                            var72.field2560 = var65 + var69;
                            var72.field2541 = var58 + var65;
                            var72.field2569 = var66 + var68;
                            var72.field2543 = var66 - -var57;
                        }
                    }
                }
                if (~class11.field277 == -117) {
                    int var83 = class121.field2783.method1137(arg0 + 31776);
                    int var84 = class24.field707 - -(var83 >> 4 & 7);
                    int var85 = (var83 & 7) + class12.field291;
                    int var86 = class121.field2783.method1147(-1);
                    if (~var84 <= -1 && var85 >= 0 && var84 < 104 && var85 < 104) {
                        class103 var87 = class50.field1339[class17.field466][var84][var85];
                        if (var87 != null) {
                            for (class23 var88 = (class23) var87.method702((byte) -118); var88 != null; var88 = (class23) var87.method698(-1610612736)) {
                                if ((32767 & var86) == var88.field659) {
                                    var88.method678((byte) -26);
                                    break;
                                }
                            }
                            if (var87.method702((byte) -125) == null) {
                                class50.field1339[class17.field466][var84][var85] = null;
                            }
                            class103.method701(var84, var85, -51);
                        }
                    }
                } else if (~class11.field277 != -149) {
                    if (~class11.field277 == -197) {
                        int var97 = class121.field2783.method1137(arg0 ^ -31712);
                        int var98 = ((120 & var97) >> 4) + class24.field707;
                        int var99 = (7 & var97) + class12.field291;
                        int var100 = class121.field2783.method1140(-1);
                        int var101 = class121.field2783.method1137(255);
                        int var102 = class121.field2783.method1140(arg0 ^ 31520);
                        if (~var98 <= -1 && ~var99 <= -1 && var98 < 104 && ~var99 > -105) {
                            int var103 = var99 * 128 + 64;
                            int var104 = var98 * 128 + 64;
                            class2 var105 = new class2(var100, class17.field466, var104, var103, class25.method205(var104, class17.field466, -23287, var103) - var101, var102, class11.field280);
                            class35.field961.method711(var105, 0);
                        }
                    } else if (~class11.field277 == -101) {
                        int var106 = class121.field2783.method1127(127);
                        int var107 = (var106 & 7) + class12.field291;
                        int var108 = class24.field707 - -((var106 & 113) >> 4);
                        int var109 = class121.field2783.method1147(-1);
                        int var110 = class121.field2783.method1113(arg0 ^ -4636);
                        int var111 = class121.field2783.method1136(93);
                        if (var108 >= 0 && ~var107 <= -1 && var108 < 104 && ~var107 > -105 && ~class29.field876 != ~var109) {
                            class23 var112 = new class23();
                            var112.field661 = var110;
                            var112.field659 = var111;
                            if (class50.field1339[class17.field466][var108][var107] == null) {
                                class50.field1339[class17.field466][var108][var107] = new class103();
                            }
                            class50.field1339[class17.field466][var108][var107].method711(var112, arg0 ^ -31521);
                            class103.method701(var108, var107, 112);
                        }
                    } else {
                        if (class11.field277 == 126) {
                            int var113 = class121.field2783.method1137(255);
                            int var114 = (var113 >> 4 & 7) + class24.field707;
                            int var115 = (var113 & 7) + class12.field291;
                            int var116 = class121.field2783.method1140(-1);
                            int var117 = class121.field2783.method1137(255);
                            int var118 = 7 & var117;
                            int var119 = (250 & var117) >> 4;
                            int var120 = class121.field2783.method1137(255);
                            if (~var114 <= -1 && ~var115 <= -1 && ~var114 > -105 && var115 < 104) {
                                int var121 = var119 + 1;
                                if (-var121 + var114 <= class46.field1244.field2963[0] && ~class46.field1244.field2963[0] >= ~(var114 + var121) && ~class46.field1244.field2934[0] <= ~(-var121 + var115) && ~class46.field1244.field2934[0] >= ~(var115 + var121) && class23.field663 != 0 && var118 > 0 && class17.field464 < 50) {
                                    class133.field3133[class17.field464] = var116;
                                    class5.field102[class17.field464] = var118;
                                    class55.field1437[class17.field464] = var120;
                                    class97.field2232[class17.field464] = null;
                                    class24.field686[class17.field464] = (var114 << 16) + (var115 << 8) - -var119;
                                    ++class17.field464;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int var89 = class121.field2783.method1137(255);
                    int var90 = (7 & var89 >> 4) + class24.field707;
                    int var91 = (7 & var89) + class12.field291;
                    int var92 = class121.field2783.method1140(arg0 ^ 31520);
                    int var93 = class121.field2783.method1140(-1);
                    int var94 = class121.field2783.method1140(-1);
                    if (var90 >= 0 && var91 >= 0 && ~var90 > -105 && ~var91 > -105) {
                        class103 var95 = class50.field1339[class17.field466][var90][var91];
                        if (var95 != null) {
                            for (class23 var96 = (class23) var95.method702((byte) -125); var96 != null; var96 = (class23) var95.method698(-1610612736)) {
                                if ((var92 & 32767) == var96.field659 && var96.field661 == var93) {
                                    var96.field661 = var94;
                                    break;
                                }
                            }
                            class103.method701(var90, var91, -79);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IZ)I")
    public final int method967(int arg0, boolean arg1) {
        ++field3025;
        if (arg1) {
            field3041 = null;
        }
        int var3 = this.field3023 >> 3;
        int var4 = 0;
        int var5 = -(7 & this.field3023) + 8;
        this.field3023 += arg0;
        while (~arg0 < ~var5) {
            var4 += (class77.field1909[var5] & super.field3592[var3++]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 != var5) {
            var6 = (super.field3592[var3] >> -arg0 + var5 & class77.field1909[arg0]) + var4;
        } else {
            var6 = (super.field3592[var3] & class77.field1909[var5]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(ZI)V")
    public static final void method968(boolean arg0, int arg1) {
        class2.field20 = arg0;
        ++field3048;
        int var2 = -40 % ((arg1 - 49) / 63);
        if (!class2.field20) {
            int var3 = class121.field2783.method1113(26939);
            int var4 = class121.field2783.method1136(72);
            int var5 = class121.field2783.method1147(-1);
            int var6 = (-class121.field2783.field3601 + class76.field1870) / 16;
            class24.field685 = new int[var6][4];
            for (int var7 = 0; ~var7 > ~var6; ++var7) {
                for (int var15 = 0; var15 < 4; ++var15) {
                    class24.field685[var7][var15] = class121.field2783.method1123((byte) -110);
                }
            }
            int var8 = class121.field2783.method1136(62);
            int var9 = class121.field2783.method1108(false);
            class125.field2889 = new int[var6];
            class9.field222 = new byte[var6][];
            class80.field1948 = new int[var6];
            class137.field3216 = new int[var6];
            class108.field2488 = new byte[var6][];
            int var10 = 0;
            boolean var11 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var5 / 8 == 48) {
                var11 = true;
            }
            if (var3 / 8 == 48 && ~(var5 / 8) == -149) {
                var11 = true;
            }
            for (int var12 = (var3 + -6) / 8; ~((var3 - -6) / 8) <= ~var12; ++var12) {
                for (int var13 = (var5 + -6) / 8; (var5 - -6) / 8 >= var13; ++var13) {
                    int var14 = (var12 << 8) + var13;
                    if (!var11 || var13 != 49 && var13 != 149 && ~var13 != -148 && var12 != 50 && (~var12 != -50 || var13 != 47)) {
                        class125.field2889[var10] = var14;
                        class137.field3216[var10] = class9.field201.method310((byte) 14, class111.method786((byte) -126, new class150[] { class37.field1005, class29.method239(1000, var12), class126.field2903, class29.method239(1000, var13) }));
                        class80.field1948[var10] = class9.field201.method310((byte) 14, class111.method786((byte) 107, new class150[] { class105.field2373, class29.method239(1000, var12), class126.field2903, class29.method239(1000, var13) }));
                        ++var10;
                    }
                }
            }
            class109.method781(var9, (byte) -8, var8, var3, var4, var5);
        } else {
            int var16 = class121.field2783.method1108(false);
            int var17 = class121.field2783.method1147(-1);
            int var18 = class121.field2783.method1113(26939);
            class121.field2783.method976((byte) 51);
            for (int var19 = 0; ~var19 > -5; ++var19) {
                for (int var36 = 0; var36 < 13; ++var36) {
                    for (int var37 = 0; var37 < 13; ++var37) {
                        int var38 = class121.field2783.method967(1, false);
                        if (~var38 == -2) {
                            class40.field1052[var19][var36][var37] = class121.field2783.method967(26, false);
                        } else {
                            class40.field1052[var19][var36][var37] = -1;
                        }
                    }
                }
            }
            class121.field2783.method972(-4);
            int var20 = (-class121.field2783.field3601 + class76.field1870) / 16;
            class24.field685 = new int[var20][4];
            for (int var21 = 0; var21 < var20; ++var21) {
                for (int var35 = 0; ~var35 > -5; ++var35) {
                    class24.field685[var21][var35] = class121.field2783.method1145((byte) 58);
                }
            }
            int var22 = class121.field2783.method1113(26939);
            int var23 = class121.field2783.method1140(-1);
            class137.field3216 = new int[var20];
            class108.field2488 = new byte[var20][];
            class125.field2889 = new int[var20];
            class80.field1948 = new int[var20];
            class9.field222 = new byte[var20][];
            int var24 = 0;
            for (int var25 = 0; var25 < 4; ++var25) {
                for (int var26 = 0; var26 < 13; ++var26) {
                    for (int var27 = 0; ~var27 > -14; ++var27) {
                        int var28 = class40.field1052[var25][var26][var27];
                        if (~var28 != 0) {
                            int var29 = var28 >> 3 & 2047;
                            int var30 = (16761567 & var28) >> 14;
                            int var31 = (var30 / 8 << 8) + var29 / 8;
                            for (int var32 = 0; var24 > var32; ++var32) {
                                if (~class125.field2889[var32] == ~var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                int var33 = (65359 & var31) >> 8;
                                class125.field2889[var24] = var31;
                                int var34 = var31 & 255;
                                class137.field3216[var24] = class9.field201.method310((byte) 14, class111.method786((byte) -125, new class150[] { class37.field1005, class29.method239(1000, var33), class126.field2903, class29.method239(1000, var34) }));
                                class80.field1948[var24] = class9.field201.method310((byte) 14, class111.method786((byte) 32, new class150[] { class105.field2373, class29.method239(1000, var33), class126.field2903, class29.method239(1000, var34) }));
                                ++var24;
                            }
                        }
                    }
                }
            }
            class109.method781(var16, (byte) -8, var23, var18, var22, var17);
        }
    }

    @OriginalMember(owner = "client!t", name = "t", descriptor = "(I)V")
    public static void method969(int arg0) {
        field3032 = null;
        if (arg0 != 8) {
            method968(false, -107);
        }
        field3036 = null;
        field3041 = null;
        field3034 = null;
        field3040 = null;
        field3047 = null;
        field3022 = null;
        field3033 = null;
        field3026 = null;
        field3035 = null;
        field3021 = null;
        field3031 = null;
        field3050 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)Lwd;")
    public static final class150 method970(int arg0, byte arg1) {
        ++field3019;
        class150 var2 = new class150();
        var2.field3678 = new byte[arg0];
        var2.field3718 = 0;
        if (arg1 != 56) {
            method974(1, (Component) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(ZI)Lpc;")
    public static final class107 method971(boolean arg0, int arg1) {
        ++field3018;
        class107 var2 = (class107) class11.field258.method440((long) arg1, 26976);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class72.field1809.method315(arg1, true, 13);
            class107 var4 = new class107();
            var4.field2425 = arg1;
            if (arg0) {
                method971(false, -18);
            }
            if (var3 != null) {
                var4.method737(-15349, new class148(var3));
            }
            class11.field258.method433(var4, (long) arg1, (byte) -122);
            return var4;
        }
    }

    @OriginalMember(owner = "client!t", name = "u", descriptor = "(I)V")
    public final void method972(int arg0) {
        super.field3601 = (this.field3023 + 7) / 8;
        ++field3042;
        if (arg0 != -4) {
            this.method965(true, -79);
        }
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "(II)I")
    public final int method973(int arg0, int arg1) {
        ++field3046;
        return arg0 != 5618 ? -41 : arg1 * 8 - this.field3023;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method974(int arg0, Component arg1) {
        ++field3045;
        if (arg0 != 0) {
            method971(false, 89);
        }
        arg1.addMouseListener(class83.field1986);
        arg1.addMouseMotionListener(class83.field1986);
        arg1.addFocusListener(class83.field1986);
    }

    @OriginalMember(owner = "client!t", name = "v", descriptor = "(I)I")
    public final int method975(int arg0) {
        ++field3027;
        if (arg0 <= 54) {
            field3040 = null;
        }
        return 255 & super.field3592[super.field3601++] + -this.field3029.method592((byte) -65);
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "(B)V")
    public final void method976(byte arg0) {
        if (arg0 == 51) {
            ++field3020;
            this.field3023 = super.field3601 * 8;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V")
    public class128(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[I)V")
    public final void method977(int arg0, int[] arg1) {
        if (arg0 != -21160) {
            field3024 = -61;
        }
        ++field3051;
        this.field3029 = new class82(arg1);
    }
}
