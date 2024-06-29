import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class1 {

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    private int field106 = 0;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
    private int field110 = 4096;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field104 = 127;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
    public static volatile int field112 = 0;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "Lwd;")
    public static class232 field113 = null;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "Loc;")
    public static class151 field115 = class137.method873(2, " x ");

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "Loc;")
    public static class151 field118 = class137.method873(2, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "Loc;")
    public static class151 field116 = class137.method873(2, "<)4col> x");

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            return null;
        } else {
            int[] var3 = super.field21.method1182(arg1, -31709);
            ++field114;
            if (super.field21.field3388) {
                int[] var4 = this.method4(arg1, -123, 0);
                for (int var5 = 0; ~var5 > ~class202.field3603; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field106 && ~this.field110 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILsd;ZLsd;)V")
    public static final void method42(int arg0, class192 arg1, boolean arg2, class192 arg3) {
        ++field117;
        class51.field1023 = arg3;
        class99.field1779 = arg1;
        class40.field825 = arg2;
        if (arg0 == -21297055) {
            class224.field3896 = new class156(30);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([Ln;B)V")
    public static final void method43(class138[] arg0, byte arg1) {
        ++field119;
        int var2 = 0;
        if (arg1 == -34) {
            while (var2 < 4) {
                for (int var113 = 0; var113 < 104; ++var113) {
                    for (int var114 = 0; ~var114 > -105; ++var114) {
                        if (~(1 & class122.field2191[var2][var113][var114]) == -2) {
                            int var115 = var2;
                            if ((class122.field2191[1][var113][var114] & 2) == 2) {
                                var115 = var2 - 1;
                            }
                            if (~var115 <= -1) {
                                arg0[var115].method881(var114, (byte) -1, var113);
                            }
                        }
                    }
                }
                ++var2;
            }
            class177.field3195 += (int) (Math.random() * 5.0D) + -2;
            if (~class177.field3195 > 15) {
                class177.field3195 = -16;
            }
            if (~class177.field3195 < -17) {
                class177.field3195 = 16;
            }
            class223.field3881 += -2 + (int) (Math.random() * 5.0D);
            if (~class223.field3881 > 7) {
                class223.field3881 = -8;
            }
            if (~class223.field3881 < -9) {
                class223.field3881 = 8;
            }
            int var3 = class177.field3195 >> 1;
            int var4 = class223.field3881 >> 2 << 10;
            int[][] var5 = new int[104][104];
            int[][] var6 = new int[104][104];
            for (int var7 = 0; var7 < 4; ++var7) {
                byte[][] var50 = class78.field1508[var7];
                byte var51 = 74;
                short var52 = 768;
                int var53 = (int) Math.sqrt(5100.0D);
                int var54 = var52 * var53 >> 8;
                for (int var55 = 1; ~var55 > -104; ++var55) {
                    for (int var103 = 1; var103 < 103; ++var103) {
                        int var105 = class104.field1872[var7][var103 + 1][var55] + -class104.field1872[var7][var103 - 1][var55];
                        int var106 = class104.field1872[var7][var103][var55 + 1] + -class104.field1872[var7][var103][var55 + -1];
                        int var107 = (int) Math.sqrt((double) (var105 * var105 + var106 * var106 + 65536));
                        int var108 = (var105 << 8) / var107;
                        int var109 = -65536 / var107;
                        int var110 = (var106 << 8) / var107;
                        int var111 = (var110 * -50 + var108 * -50 + var109 * -10) / var54 + var51;
                        int var112 = (var50[var103][var55 + -1] >> 2) + (var50[var103 - -1][var55] >> 3) + (var50[var103 + -1][var55] >> 2) - (-(var50[var103][var55 + 1] >> 3) + -(var50[var103][var55] >> 1));
                        var6[var103][var55] = var111 - var112;
                    }
                }
                for (int var56 = 0; ~var56 > -105; ++var56) {
                    class141.field2558[var56] = 0;
                    class103.field1850[var56] = 0;
                    class223.field3883[var56] = 0;
                    class109.field1941[var56] = 0;
                    class175.field3167[var56] = 0;
                }
                for (int var57 = -5; ~var57 > -105; ++var57) {
                    for (int var88 = 0; ~var88 > -105; ++var88) {
                        int var97 = var57 + 5;
                        int var10002;
                        if (~var97 > -105) {
                            int var98 = 255 & class79.field1521[var7][var97][var88];
                            if (~var98 < -1) {
                                class33 var99 = class57.method383(var98 + -1, 0);
                                class141.field2558[var88] += var99.field681;
                                class103.field1850[var88] += var99.field676;
                                class223.field3883[var88] += var99.field679;
                                class109.field1941[var88] += var99.field677;
                                var10002 = class175.field3167[var88]++;
                            }
                        }
                        int var100 = var57 - 5;
                        if (~var100 <= -1) {
                            int var101 = 255 & class79.field1521[var7][var100][var88];
                            if (var101 > 0) {
                                class33 var102 = class57.method383(var101 + -1, 0);
                                class141.field2558[var88] -= var102.field681;
                                class103.field1850[var88] -= var102.field676;
                                class223.field3883[var88] -= var102.field679;
                                class109.field1941[var88] -= var102.field677;
                                var10002 = class175.field3167[var88]--;
                            }
                        }
                    }
                    if (var57 >= 0) {
                        int var89 = 0;
                        int var90 = 0;
                        int var91 = 0;
                        int var92 = 0;
                        int var93 = 0;
                        for (int var94 = -5; ~var94 > -105; ++var94) {
                            int var95 = var94 - -5;
                            if (var95 < 104) {
                                var90 += class141.field2558[var95];
                                var91 += class109.field1941[var95];
                                var93 += class223.field3883[var95];
                                var92 += class175.field3167[var95];
                                var89 += class103.field1850[var95];
                            }
                            int var96 = var94 + -5;
                            if (var96 >= 0) {
                                var92 -= class175.field3167[var96];
                                var90 -= class141.field2558[var96];
                                var91 -= class109.field1941[var96];
                                var89 -= class103.field1850[var96];
                                var93 -= class223.field3883[var96];
                            }
                            if (var94 >= 0 && ~var92 < -1) {
                                var5[var57][var94] = class113.method684(var89 / var92, var90 * 256 / var91, var93 / var92, class112.method675(arg1, 268));
                            }
                        }
                    }
                }
                for (int var58 = 1; var58 < 103; ++var58) {
                    for (int var61 = 1; ~var61 > -104; ++var61) {
                        if (!class13.field300 || (class122.field2191[0][var58][var61] & 2) != 0 || (class122.field2191[var7][var58][var61] & 16) == 0 && class229.method1449(2, var7, var61, var58) == class40.field817) {
                            if (var7 < class53.field1067) {
                                class53.field1067 = var7;
                            }
                            int var62 = class79.field1521[var7][var58][var61] & 255;
                            int var63 = class197.field3506[var7][var58][var61] & 255;
                            if (~var62 < -1 || var63 > 0) {
                                int var64 = class104.field1872[var7][var58][var61];
                                int var65 = class104.field1872[var7][var58 + 1][var61];
                                int var66 = class104.field1872[var7][var58 + 1][var61 + 1];
                                int var67 = class104.field1872[var7][var58][var61 + 1];
                                if (~var7 < -1) {
                                    boolean var68 = true;
                                    if (~var62 == -1 && class185.field3319[var7][var58][var61] != 0) {
                                        var68 = false;
                                    }
                                    if (~var63 < -1 && !class48.method342(-1817, var63 + -1).field1433) {
                                        var68 = false;
                                    }
                                    if (var68 && ~var64 == ~var65 && var64 == var66 && ~var64 == ~var67) {
                                        class231.field4122[var7][var58][var61] = class73.method479(class231.field4122[var7][var58][var61], 2340);
                                    }
                                }
                                int var69;
                                int var70;
                                if (var62 <= 0) {
                                    var69 = 0;
                                    var70 = -1;
                                } else {
                                    var70 = var5[var58][var61];
                                    int var71 = (127 & var70) + var3;
                                    if (var71 >= 0) {
                                        if (var71 > 127) {
                                            var71 = 127;
                                        }
                                    } else {
                                        var71 = 0;
                                    }
                                    int var72 = (64512 & var4 + var70) + (896 & var70) + var71;
                                    var69 = class61.field1207[class174.method1111(96, 11794, var72)];
                                }
                                int var73 = var6[var58][var61];
                                int var74 = var6[var58][var61 + 1];
                                int var75 = var6[var58 - -1][var61];
                                int var76 = var6[var58 - -1][var61 + 1];
                                if (var63 != 0) {
                                    int var77 = class185.field3319[var7][var58][var61] - -1;
                                    byte var78 = class94.field1759[var7][var58][var61];
                                    class74 var79 = class48.method342(-1817, var63 + -1);
                                    int var80 = var79.field1436;
                                    if (~var80 <= -1 && !class61.field1198.method453(var80, (byte) -24)) {
                                        var80 = -1;
                                    }
                                    int var81;
                                    int var82;
                                    if (var80 < 0) {
                                        if (var79.field1438 == -1) {
                                            var81 = 0;
                                            var82 = -2;
                                        } else {
                                            var82 = var79.field1438;
                                            int var83 = (127 & var82) + var3;
                                            if (~var83 <= -1) {
                                                if (~var83 < -128) {
                                                    var83 = 127;
                                                }
                                            } else {
                                                var83 = 0;
                                            }
                                            int var84 = (var4 + var82 & 64512) + (var82 & 896) + var83;
                                            var81 = class61.field1207[class160.method1039(var84, 96, (byte) 121)];
                                        }
                                    } else {
                                        var81 = class61.field1207[class160.method1039(class61.field1198.method462(true, var80), 96, (byte) 127)];
                                        var82 = -1;
                                    }
                                    if (~var79.field1429 <= -1) {
                                        int var85 = var79.field1429;
                                        int var86 = (127 & var85) + var3;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (~var86 < -128) {
                                            var86 = 127;
                                        }
                                        int var87 = (var4 + var85 & 64512) + (896 & var85) + var86;
                                        var81 = class61.field1207[class160.method1039(var87, 96, (byte) 126)];
                                    }
                                    class117.method714(var7, var58, var61, var77, var78, var80, var64, var65, var66, var67, class174.method1111(var73, 11794, var70), class174.method1111(var75, arg1 ^ -11828, var70), class174.method1111(var76, arg1 + 11828, var70), class174.method1111(var74, 11794, var70), class160.method1039(var82, var73, (byte) 127), class160.method1039(var82, var75, (byte) 116), class160.method1039(var82, var76, (byte) 119), class160.method1039(var82, var74, (byte) 120), var69, var81);
                                } else {
                                    class117.method714(var7, var58, var61, 0, 0, -1, var64, var65, var66, var67, class174.method1111(var73, arg1 ^ -11828, var70), class174.method1111(var75, arg1 ^ -11828, var70), class174.method1111(var76, 11794, var70), class174.method1111(var74, 11794, var70), 0, 0, 0, 0, var69, 0);
                                }
                            }
                        }
                    }
                }
                for (int var59 = 1; ~var59 > -104; ++var59) {
                    for (int var60 = 1; var60 < 103; ++var60) {
                        class13.method112(var7, var60, var59, class229.method1449(2, var7, var59, var60));
                    }
                }
                class79.field1521[var7] = null;
                class197.field3506[var7] = null;
                class185.field3319[var7] = null;
                class94.field1759[var7] = null;
                class78.field1508[var7] = null;
            }
            class25.method198(-50, -10, -50);
            for (int var8 = 0; var8 < 104; ++var8) {
                for (int var49 = 0; ~var49 > -105; ++var49) {
                    if ((class122.field2191[1][var8][var49] & 2) == 2) {
                        class236.method1540(var8, var49);
                    }
                }
            }
            int var9 = 1;
            int var10 = 2;
            int var11 = 4;
            for (int var12 = 0; var12 < 4; ++var12) {
                if (var12 > 0) {
                    var9 <<= 3;
                    var10 <<= 3;
                    var11 <<= 3;
                }
                for (int var13 = 0; ~var12 <= ~var13; ++var13) {
                    for (int var14 = 0; var14 <= 104; ++var14) {
                        for (int var15 = 0; var15 <= 104; ++var15) {
                            if (~(var9 & class231.field4122[var13][var15][var14]) != -1) {
                                int var16;
                                for (var16 = var14; ~var16 < -1 && ~(var9 & class231.field4122[var13][var15][var16 + -1]) != -1; --var16) {
                                }
                                int var17 = var13;
                                int var18 = var13;
                                int var19;
                                for (var19 = var14; var19 < 104 && (class231.field4122[var13][var15][var19 + 1] & var9) != 0; ++var19) {
                                }
                                label356: while (~var17 < -1) {
                                    for (int var20 = var16; var20 <= var19; ++var20) {
                                        if ((class231.field4122[var17 - 1][var15][var20] & var9) == 0) {
                                            break label356;
                                        }
                                    }
                                    --var17;
                                }
                                label345: while (~var12 < ~var18) {
                                    for (int var21 = var16; ~var21 >= ~var19; ++var21) {
                                        if ((var9 & class231.field4122[var18 + 1][var15][var21]) == 0) {
                                            break label345;
                                        }
                                    }
                                    ++var18;
                                }
                                int var22 = (-var17 + var18 - -1) * (-var16 + var19 + 1);
                                if (var22 >= 8) {
                                    int var23 = class104.field1872[var17][var15][var16];
                                    short var24 = 240;
                                    int var25 = class104.field1872[var18][var15][var16] + -var24;
                                    class189.method1172(var12, 1, var15 * 128, var15 * 128, var16 * 128, var19 * 128 - -128, var25, var23);
                                    for (int var26 = var17; var18 >= var26; ++var26) {
                                        for (int var27 = var16; var19 >= var27; ++var27) {
                                            class231.field4122[var26][var15][var27] = class26.method206(class231.field4122[var26][var15][var27], ~var9);
                                        }
                                    }
                                }
                            }
                            if (~(class231.field4122[var13][var15][var14] & var10) != -1) {
                                int var28 = var15;
                                int var29;
                                for (var29 = var15; ~var29 > -105 && (class231.field4122[var13][var29 + 1][var14] & var10) != 0; ++var29) {
                                }
                                int var30 = var13;
                                int var31 = var13;
                                while (~var28 < -1 && (var10 & class231.field4122[var13][var28 - 1][var14]) != 0) {
                                    --var28;
                                }
                                label410: while (~var30 < -1) {
                                    for (int var32 = var28; ~var32 >= ~var29; ++var32) {
                                        if ((var10 & class231.field4122[var30 + -1][var32][var14]) == 0) {
                                            break label410;
                                        }
                                    }
                                    --var30;
                                }
                                label399: while (var12 > var31) {
                                    for (int var33 = var28; var33 <= var29; ++var33) {
                                        if (~(class231.field4122[var31 + 1][var33][var14] & var10) == -1) {
                                            break label399;
                                        }
                                    }
                                    ++var31;
                                }
                                int var34 = (-var28 + var29 + 1) * (-var30 + var31 + 1);
                                if (~var34 <= -9) {
                                    short var35 = 240;
                                    int var36 = class104.field1872[var31][var28][var14] - var35;
                                    int var37 = class104.field1872[var30][var28][var14];
                                    class189.method1172(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                    for (int var38 = var30; var38 <= var31; ++var38) {
                                        for (int var39 = var28; var29 >= var39; ++var39) {
                                            class231.field4122[var38][var39][var14] = class26.method206(class231.field4122[var38][var39][var14], ~var10);
                                        }
                                    }
                                }
                            }
                            if (~(var11 & class231.field4122[var13][var15][var14]) != -1) {
                                int var40 = var15;
                                int var41 = var15;
                                int var42;
                                for (var42 = var14; var42 > 0 && ~(class231.field4122[var13][var15][var42 + -1] & var11) != -1; --var42) {
                                }
                                int var43;
                                for (var43 = var14; ~var43 > -105 && ~(var11 & class231.field4122[var13][var15][var43 + 1]) != -1; ++var43) {
                                }
                                label464: while (var41 > 0) {
                                    for (int var44 = var42; var44 <= var43; ++var44) {
                                        if (~(class231.field4122[var13][var41 + -1][var44] & var11) == -1) {
                                            break label464;
                                        }
                                    }
                                    --var41;
                                }
                                label453: while (~var40 > -105) {
                                    for (int var45 = var42; ~var45 >= ~var43; ++var45) {
                                        if (~(var11 & class231.field4122[var13][var40 + 1][var45]) == -1) {
                                            break label453;
                                        }
                                    }
                                    ++var40;
                                }
                                if ((var43 - var42 - -1) * (-var41 + var40 - -1) >= 4) {
                                    int var46 = class104.field1872[var13][var41][var42];
                                    class189.method1172(var12, 4, var41 * 128, var40 * 128 + 128, var42 * 128, var43 * 128 + 128, var46, var46);
                                    for (int var47 = var41; var40 >= var47; ++var47) {
                                        for (int var48 = var42; ~var48 >= ~var43; ++var48) {
                                            class231.field4122[var13][var47][var48] = class26.method206(class231.field4122[var13][var47][var48], ~var11);
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

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZII)V")
    public static final void method44(boolean arg0, int arg1, int arg2) {
        ++field111;
        ++class90.field1643;
        class48.field984.method650(-13721, 194);
        class48.field984.method1461(arg1, (byte) 52);
        if (!arg0) {
            method43((class138[]) null, (byte) -114);
        }
        class48.field984.method1485(arg2, (byte) 125);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static final void method45(boolean arg0) {
        ++field109;
        if (arg0) {
            class166.field3032 = new class236(32);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field110 = arg2.method1490((byte) 73);
            }
        } else {
            this.field106 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            field112 = -66;
        }
        ++field108;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field118 = null;
        if (arg0 > -98) {
            field113 = null;
        }
        field115 = null;
        field116 = null;
        field113 = null;
    }
}
