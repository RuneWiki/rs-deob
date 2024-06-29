import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class129 extends class74 {

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2009 = 1;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field2013 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.method448(51, 98);
        }
        ++field2003;
        if (~arg2 == -1) {
            super.field1245 = arg1.method333((byte) -59) == 1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        if (arg1 >= -112) {
            method914(-103, (byte[]) null);
        }
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[] var4 = this.method590(0, 2, arg0);
            int[][] var5 = this.method592(arg0, 0, 122);
            int[][] var6 = this.method592(arg0, 1, 79);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class178.field2662; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var12[var16] * var18) >> 12;
                        var9[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var8[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var12[var16];
                        var9[var16] = var14[var16];
                        var8[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var13[var16];
                }
            }
        }
        ++field2004;
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
    public static final void method910(long arg0, int arg1) {
        if (class6.field111 != 1 && ~class6.field111 != -6) {
            if (class6.field111 == 2) {
                class3.method43(1000);
            } else {
                class272.method1836((byte) 104);
            }
        } else {
            class21.method181((byte) -123, arg0);
        }
        ++field2007;
        if (!class64.field1025) {
            class220.field3450 = 1;
            if (class227.field3554 != 0) {
                class155.field2362 = class135.field2111;
                class287.field4525 = class112.field1765;
            } else if (~class71.field1137 == -1) {
                class155.field2362 = class188.field3012;
                class287.field4525 = class108.field1719;
            } else {
                class155.field2362 = class78.field1317;
                class287.field4525 = class126.field1985;
            }
            class42.field686[0] = class119.field1835;
            class231.field3597[0] = class180.field2691;
            class63.field1008[0] = "";
            class80.field1341[0] = 1002;
        }
        if (~class34.field544 != 0) {
            class9.method102(class34.field544, (byte) 105);
        }
        for (int var3 = 0; ~var3 > ~class145.field2254; ++var3) {
            if (class37.field632[var3]) {
                class222.field3476[var3] = true;
            }
            class9.field185[var3] = class37.field632[var3];
            class37.field632[var3] = false;
        }
        class153.field2348 = class267.field4256;
        class45.field722 = -1;
        class73.field1157 = null;
        class123.field1929 = -1;
        class157.field2417 = null;
        if (~class34.field544 != 0) {
            class145.field2254 = 0;
            class105.method803((byte) -118);
        }
        class201.method1344();
        class7.method89((byte) 111);
        if (!class64.field1025) {
            if (class73.field1157 != null) {
                class153.method1032(class73.field1157, class62.field998, class13.field227, (byte) -121);
            } else if (~class45.field722 != 0) {
                class153.method1032((class188) null, class123.field1929, class45.field722, (byte) -118);
            }
        } else if (!class23.field336) {
            class161.method1085(124);
        } else {
            class26.method209(arg1 ^ 123);
        }
        int var4 = !class64.field1025 ? class41.method349(-29284) : -1;
        if (~var4 == 0) {
            var4 = class102.field1627;
        }
        class81.method635(var4, (byte) -60);
        if (class159.field2440 == 1) {
            class159.field2440 = 2;
        }
        if (class212.field3289 == 1) {
            class212.field3289 = 2;
        }
        if (~class181.field2699 == -4) {
            for (int var5 = 0; ~class145.field2254 < ~var5; ++var5) {
                if (class9.field185[var5]) {
                    class201.method1352(class228.field3568[var5], class148.field2291[var5], class249.field3841[var5], class237.field3675[var5], 16711935, 128);
                } else if (class222.field3476[var5]) {
                    class201.method1352(class228.field3568[var5], class148.field2291[var5], class249.field3841[var5], class237.field3675[var5], 16711680, 128);
                }
            }
        }
        class21.method176((byte) 100, class261.field4058.field4176, class261.field4058.field4123, class127.field1996, class274.field4318);
        class127.field1996 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V")
    public static final void method911(int arg0, int arg1, int arg2) {
        int var3 = 13 % ((-16 - arg2) / 56);
        ++field2002;
        class116.field1808 = -class76.field1275 + arg1;
        class197.field3094 = -arg0 - -class197.field3093 + -1 + class221.field3453;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lwf;")
    public static final class1 method912(int arg0, int arg1) {
        class1 var2 = (class1) class245.field3802.method1780((long) arg1, (byte) -112);
        ++field2005;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class99.field1585.method1163(arg0, arg1, 48);
            class1 var4 = new class1();
            if (var3 != null) {
                var4.method3(0, arg1, new class37(var3));
            }
            class245.field3802.method1784(var4, false, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public static void method913(byte arg0) {
        field2013 = null;
        if (arg0 > -53) {
            method911(5, -110, 112);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field2006;
        if (arg0 != 4) {
            return null;
        } else {
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                int[] var4 = this.method590(arg0 ^ 4, 0, arg1);
                int[] var5 = this.method590(0, 1, arg1);
                int[] var6 = this.method590(arg0 ^ 4, 2, arg1);
                for (int var7 = 0; class178.field2662 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[B)V")
    public static final void method914(int arg0, byte[] arg1) {
        ++field2010;
        class37 var2 = new class37(arg1);
        var2.field588 = arg1.length + -2;
        class163.field2489 = var2.method293(arg0 ^ 53);
        class239.field3698 = new int[class163.field2489];
        class270.field4281 = new int[class163.field2489];
        class186.field2809 = new boolean[class163.field2489];
        class289.field4554 = new byte[class163.field2489][];
        class184.field2764 = new int[class163.field2489];
        class256.field3933 = new byte[class163.field2489][];
        class107.field1717 = new int[class163.field2489];
        var2.field588 = arg1.length + -7 - class163.field2489 * 8;
        class205.field3187 = var2.method293(arg0 + 11);
        class174.field2581 = var2.method293(arg0 + -6);
        int var3 = 1 + (var2.method333((byte) -59) & 255);
        for (int var4 = 0; ~class163.field2489 < ~var4; ++var4) {
            class184.field2764[var4] = var2.method293(124);
        }
        for (int var5 = 0; class163.field2489 > var5; ++var5) {
            class239.field3698[var5] = var2.method293(-120);
        }
        for (int var6 = 0; ~class163.field2489 < ~var6; ++var6) {
            class270.field4281[var6] = var2.method293(-104);
        }
        if (arg0 == 104) {
            for (int var7 = 0; ~var7 > ~class163.field2489; ++var7) {
                class107.field1717[var7] = var2.method293(105);
            }
            var2.field588 = arg1.length + -7 + -(class163.field2489 * 8) + -(var3 * 3) + 3;
            class35.field560 = new int[var3];
            for (int var8 = 1; ~var3 < ~var8; ++var8) {
                class35.field560[var8] = var2.method336(23362);
                if (~class35.field560[var8] == -1) {
                    class35.field560[var8] = 1;
                }
            }
            var2.field588 = 0;
            for (int var9 = 0; var9 < class163.field2489; ++var9) {
                int var10 = class270.field4281[var9];
                int var11 = class107.field1717[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                byte[] var14 = new byte[var12];
                class289.field4554[var9] = var14;
                class256.field3933[var9] = var13;
                boolean var15 = false;
                int var16 = var2.method333((byte) -59);
                if ((1 & var16) == 0) {
                    for (int var17 = 0; ~var17 > ~var12; ++var17) {
                        var14[var17] = var2.method322((byte) 47);
                    }
                    if (~(2 & var16) != -1) {
                        for (int var18 = 0; ~var18 > ~var12; ++var18) {
                            byte var19 = var13[var18] = var2.method322((byte) 78);
                            var15 |= var19 != -1;
                        }
                    }
                } else {
                    int var20 = 0;
                    label101: while (true) {
                        if (var20 >= var10) {
                            if ((2 & var16) == 0) {
                                break;
                            }
                            int var21 = 0;
                            while (true) {
                                if (~var21 <= ~var10) {
                                    break label101;
                                }
                                for (int var22 = 0; var11 > var22; ++var22) {
                                    byte var23 = var13[var10 * var22 + var21] = var2.method322((byte) 124);
                                    var15 |= var23 != -1;
                                }
                                ++var21;
                            }
                        }
                        for (int var24 = 0; var11 > var24; ++var24) {
                            var14[var20 - -(var10 * var24)] = var2.method322((byte) 71);
                        }
                        ++var20;
                    }
                }
                class186.field2809[var9] = var15;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class129() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[[I[Lng;ZI)V")
    public static final void method915(int[][][] arg0, class77[] arg1, boolean arg2, int arg3) {
        ++field2011;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; ~var5 > -105; ++var5) {
                    for (int var6 = 0; ~var6 > -105; ++var6) {
                        if ((1 & class191.field3041[var4][var5][var6]) == 1) {
                            int var7 = var4;
                            if ((class191.field3041[1][var5][var6] & 2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (~var7 <= -1) {
                                arg1[var7].method608(arg3 + -9, var5, var6);
                            }
                        }
                    }
                }
            }
            class164.field2494 += (int) (Math.random() * 5.0D) - 2;
            if (~class164.field2494 > 7) {
                class164.field2494 = -8;
            }
            if (class164.field2494 > 8) {
                class164.field2494 = 8;
            }
            class102.field1633 += (int) (Math.random() * 5.0D) + -2;
            if (~class102.field1633 > 15) {
                class102.field1633 = -16;
            }
            if (class102.field1633 > 16) {
                class102.field1633 = 16;
            }
        }
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class164.field2494 >> 2 << 10;
        int var10 = class102.field1633 >> 1;
        if (arg3 != 127) {
            field2012 = 85;
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; ~var13 > ~var8; ++var13) {
            byte[][] var52 = class113.field1782[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; ~var55 > -104; ++var55) {
                for (int var101 = 1; ~var101 > -104; ++var101) {
                    int var102 = class68.field1079[var13][var101 + 1][var55] - class68.field1079[var13][var101 + -1][var55];
                    byte var103 = 74;
                    int var104 = class68.field1079[var13][var101][var55 - -1] - class68.field1079[var13][var101][var55 + -1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var102 * var102 + 65536));
                    int var106 = (var102 << 8) / var105;
                    int var107 = (var52[var101][var55 + 1] >> 3) + (var52[var101][var55 - 1] >> 2) + (var52[var101 + 1][var55] >> 3) + (var52[var101 + -1][var55] >> 2) - -(var52[var101][var55] >> 1);
                    int var108 = (var104 << 8) / var105;
                    int var109 = -65536 / var105;
                    int var110 = (var109 * -10 + (var106 * -50 - -(var108 * -50))) / var54 + var103;
                    var11[var101][var55] = -var107 + var110;
                }
            }
            for (int var56 = 0; var56 < 104; ++var56) {
                class203.field3170[var56] = 0;
                class154.field2354[var56] = 0;
                class141.field2177[var56] = 0;
                class204.field3181[var56] = 0;
                class228.field3560[var56] = 0;
            }
            for (int var57 = -5; ~var57 > -105; ++var57) {
                for (int var86 = 0; ~var86 > -105; ++var86) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (~var95 > -105) {
                        int var96 = class154.field2356[var13][var95][var86] & 255;
                        if (~var96 < -1) {
                            class216 var97 = class286.method1922(255, var96 - 1);
                            class203.field3170[var86] += var97.field3336;
                            class154.field2354[var86] += var97.field3340;
                            class141.field2177[var86] += var97.field3338;
                            class204.field3181[var86] += var97.field3329;
                            var10002 = class228.field3560[var86]++;
                        }
                    }
                    int var98 = var57 + -5;
                    if (var98 >= 0) {
                        int var99 = class154.field2356[var13][var98][var86] & 255;
                        if (~var99 < -1) {
                            class216 var100 = class286.method1922(255, var99 + -1);
                            class203.field3170[var86] -= var100.field3336;
                            class154.field2354[var86] -= var100.field3340;
                            class141.field2177[var86] -= var100.field3338;
                            class204.field3181[var86] -= var100.field3329;
                            var10002 = class228.field3560[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; ++var92) {
                        int var93 = var92 - -5;
                        int var94 = var92 + -5;
                        if (var93 < 104) {
                            var90 += class204.field3181[var93];
                            var88 += class154.field2354[var93];
                            var91 += class228.field3560[var93];
                            var87 += class203.field3170[var93];
                            var89 += class141.field2177[var93];
                        }
                        if (var94 >= 0) {
                            var88 -= class154.field2354[var94];
                            var90 -= class204.field3181[var94];
                            var87 -= class203.field3170[var94];
                            var91 -= class228.field3560[var94];
                            var89 -= class141.field2177[var94];
                        }
                        if (var92 >= 0 && ~var91 < -1) {
                            var12[var57][var92] = class118.method851(var87 * 256 / var90, -23456, var89 / var91, var88 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; ++var58) {
                for (int var59 = 1; ~var59 > -104; ++var59) {
                    if (arg2 || class223.method1487(117) || ~(2 & class191.field3041[0][var58][var59]) != -1 || ~(16 & class191.field3041[var13][var58][var59]) == -1 && class224.method1499(var59, var13, var58, 12545) == class210.field3264) {
                        if (~var13 > ~class273.field4308) {
                            class273.field4308 = var13;
                        }
                        int var60 = 255 & class154.field2356[var13][var58][var59];
                        int var61 = 255 & class35.field575[var13][var58][var59];
                        if (~var60 < -1 || var61 > 0) {
                            int var62 = class68.field1079[var13][var58][var59];
                            int var63 = class68.field1079[var13][var58 - -1][var59 + 1];
                            int var64 = class68.field1079[var13][var58 + 1][var59];
                            int var65 = class68.field1079[var13][var58][var59 + 1];
                            if (~var13 < -1) {
                                boolean var66 = true;
                                if (~var60 == -1 && ~class72.field1139[var13][var58][var59] != -1) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class58.method461(var61 + -1, (byte) -119).field3160) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var64 && var62 == var63 && var62 == var65) {
                                    class245.field3799[var13][var58][var59] = class115.method840(class245.field3799[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (~var60 < -1) {
                                var67 = var12[var58][var59];
                                int var68 = (127 & var67) + var10;
                                if (~var68 > -1) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var9 + var67 & 64512) + (896 & var67) - -var68;
                                var70 = class97.field1561[class1.method4(1, var69, 96)];
                            } else {
                                var70 = 0;
                                var67 = -1;
                            }
                            int var71 = var11[var58 + 1][var59];
                            int var72 = var11[var58][var59];
                            int var73 = var11[var58][var59 + 1];
                            int var74 = var11[var58 + 1][var59 + 1];
                            if (var61 != 0) {
                                int var75 = class72.field1139[var13][var58][var59] - -1;
                                byte var76 = class105.field1684[var13][var58][var59];
                                class202 var77 = class58.method461(var61 + -1, (byte) -115);
                                int var78 = var77.field3159;
                                if (var78 >= 0 && !class97.field1547.method1894(var78, arg3 ^ -2)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class97.field1561[class116.method843(96, 0, class97.field1547.method1893(var78, -107))];
                                } else if (var77.field3151 != -1) {
                                    var79 = var77.field3151;
                                    int var81 = (127 & var79) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var79 & 896) + (64512 & var9 + var79) + var81;
                                    var80 = class97.field1561[class116.method843(96, 0, var82)];
                                } else {
                                    var80 = 0;
                                    var79 = -2;
                                }
                                if (var77.field3152 >= 0) {
                                    int var83 = var77.field3152;
                                    int var84 = (127 & var83) - -var10;
                                    if (var84 >= 0) {
                                        if (~var84 < -128) {
                                            var84 = 127;
                                        }
                                    } else {
                                        var84 = 0;
                                    }
                                    int var85 = (64512 & var9 + var83) + var84 - -(var83 & 896);
                                    var80 = class97.field1561[class116.method843(96, 0, var85)];
                                }
                                class154.method1035(var13, var58, var59, var75, var76, var78, var62, var64, var63, var65, class1.method4(arg3 + -126, var67, var72), class1.method4(arg3 + -126, var67, var71), class1.method4(1, var67, var74), class1.method4(arg3 ^ 126, var67, var73), class116.method843(var72, 0, var79), class116.method843(var71, 0, var79), class116.method843(var74, 0, var79), class116.method843(var73, 0, var79), var70, var80);
                            } else {
                                class154.method1035(var13, var58, var59, 0, 0, -1, var62, var64, var63, var65, class1.method4(1, var67, var72), class1.method4(arg3 + -126, var67, var71), class1.method4(1, var67, var74), class1.method4(1, var67, var73), 0, 0, 0, 0, var70, 0);
                            }
                        }
                    }
                }
            }
            class154.field2356[var13] = null;
            class35.field575[var13] = null;
            class72.field1139[var13] = null;
            class105.field1684[var13] = null;
            class113.field1782[var13] = null;
        }
        class261.method1753(-50, -10, -50);
        if (!arg2) {
            for (int var14 = 0; var14 < 104; ++var14) {
                for (int var51 = 0; var51 < 104; ++var51) {
                    if (~(class191.field3041[1][var14][var51] & 2) == -3) {
                        class242.method1643(var14, var51);
                    }
                }
            }
            for (int var15 = 0; ~var15 > -5; ++var15) {
                for (int var16 = 0; ~var16 >= -105; ++var16) {
                    for (int var17 = 0; var17 <= 104; ++var17) {
                        if ((class245.field3799[var15][var17][var16] & 1) != 0) {
                            int var18 = var16;
                            int var19 = var15;
                            int var20 = var15;
                            while (var18 < 104 && ~(1 & class245.field3799[var15][var17][var18 + 1]) != -1) {
                                ++var18;
                            }
                            int var21;
                            for (var21 = var16; ~var21 < -1 && ~(1 & class245.field3799[var15][var17][var21 - 1]) != -1; --var21) {
                            }
                            label353: while (~var19 < -1) {
                                for (int var22 = var21; ~var18 <= ~var22; ++var22) {
                                    if (~(class245.field3799[var19 + -1][var17][var22] & 1) == -1) {
                                        break label353;
                                    }
                                }
                                --var19;
                            }
                            label342: while (~var20 > -4) {
                                for (int var23 = var21; var18 >= var23; ++var23) {
                                    if (~(class245.field3799[var20 + 1][var17][var23] & 1) == -1) {
                                        break label342;
                                    }
                                }
                                ++var20;
                            }
                            int var24 = (-var19 + 1 + var20) * (var18 + 1 + -var21);
                            if (~var24 <= -9) {
                                short var25 = 240;
                                int var26 = class68.field1079[var20][var17][var21] - var25;
                                int var27 = class68.field1079[var19][var17][var21];
                                class177.method1182(1, var17 * 128, var17 * 128, var21 * 128, var18 * 128 + 128, var26, var27);
                                for (int var28 = var19; ~var20 <= ~var28; ++var28) {
                                    for (int var29 = var21; var29 <= var18; ++var29) {
                                        class245.field3799[var28][var17][var29] = class3.method48(class245.field3799[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if (~(2 & class245.field3799[var15][var17][var16]) != -1) {
                            int var30 = var17;
                            int var31 = var17;
                            while (var30 > 0 && (2 & class245.field3799[var15][var30 + -1][var16]) != 0) {
                                --var30;
                            }
                            while (~var31 > -105 && ~(2 & class245.field3799[var15][var31 + 1][var16]) != -1) {
                                ++var31;
                            }
                            int var32;
                            label408: for (var32 = var15; ~var32 < -1; --var32) {
                                for (int var33 = var30; var31 >= var33; ++var33) {
                                    if (~(2 & class245.field3799[var32 + -1][var33][var16]) == -1) {
                                        break label408;
                                    }
                                }
                            }
                            int var34;
                            label396: for (var34 = var15; var34 < 3; ++var34) {
                                for (int var35 = var30; ~var35 >= ~var31; ++var35) {
                                    if ((class245.field3799[var34 + 1][var35][var16] & 2) == 0) {
                                        break label396;
                                    }
                                }
                            }
                            int var36 = (var31 + 1 - var30) * (var34 - -1 + -var32);
                            if (~var36 <= -9) {
                                short var37 = 240;
                                int var38 = class68.field1079[var34][var30][var16] + -var37;
                                int var39 = class68.field1079[var32][var30][var16];
                                class177.method1182(2, var30 * 128, var31 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                                for (int var40 = var32; var34 >= var40; ++var40) {
                                    for (int var41 = var30; var41 <= var31; ++var41) {
                                        class245.field3799[var40][var41][var16] = class3.method48(class245.field3799[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & class245.field3799[var15][var17][var16]) != 0) {
                            int var42 = var17;
                            int var43 = var17;
                            int var44;
                            for (var44 = var16; var44 > 0 && ~(class245.field3799[var15][var17][var44 + -1] & 4) != -1; --var44) {
                            }
                            int var45;
                            for (var45 = var16; ~var45 > -105 && ~(4 & class245.field3799[var15][var17][var45 - -1]) != -1; ++var45) {
                            }
                            label462: while (var42 > 0) {
                                for (int var46 = var44; var45 >= var46; ++var46) {
                                    if ((4 & class245.field3799[var15][var42 + -1][var46]) == 0) {
                                        break label462;
                                    }
                                }
                                --var42;
                            }
                            label451: while (~var43 > -105) {
                                for (int var47 = var44; ~var45 <= ~var47; ++var47) {
                                    if (~(class245.field3799[var15][var43 + 1][var47] & 4) == -1) {
                                        break label451;
                                    }
                                }
                                ++var43;
                            }
                            if (~((-var44 + var45 - -1) * (var43 - -1 + -var42)) <= -5) {
                                int var48 = class68.field1079[var15][var42][var44];
                                class177.method1182(4, var42 * 128, var43 * 128 - -128, var44 * 128, var45 * 128 - -128, var48, var48);
                                for (int var49 = var42; var43 >= var49; ++var49) {
                                    for (int var50 = var44; ~var45 <= ~var50; ++var50) {
                                        class245.field3799[var15][var49][var50] = class3.method48(class245.field3799[var15][var49][var50], -5);
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
