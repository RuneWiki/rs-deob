import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class37 extends class114 {

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    private int field559 = 1;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    private int field566 = 1;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "Z")
    public static boolean field570 = true;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "[J")
    public static long[] field563 = new long[100];

    @OriginalMember(owner = "client!k", name = "S", descriptor = "[I")
    public static int[] field565 = new int[14];

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Llm;")
    public static class150 field562 = new class150(50);

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field574 = 1;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
    public static final void method253(byte arg0) {
        if (arg0 != -125) {
            field562 = null;
        }
        ++field568;
        if (~class276.field4386 != -3) {
            if (~class59.field826 == ~class302.field4804 && class25.field393 == class179.field2717) {
                class276.field4386 = 0;
                if (class192.field2940 && class233.field3651[81] && ~class179.field2721 < -3) {
                    class53.method335(class179.field2721 + -2, arg0 + 125);
                } else {
                    class53.method335(class179.field2721 + -1, 0);
                }
            } else {
                class242.field3799 = class25.field393;
                class276.field4386 = 2;
                class247.field3871 = class59.field826;
            }
        } else if (~class302.field4804 == ~class247.field3871 && class242.field3799 == class179.field2717) {
            class276.field4386 = 0;
            if (class192.field2940 && class233.field3651[81] && ~class179.field2721 < -3) {
                class53.method335(class179.field2721 + -2, arg0 + 125);
            } else {
                class53.method335(class179.field2721 + -1, arg0 + 125);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1648 = ~arg0.method1374((byte) -60) == -2;
                }
            } else {
                this.field566 = arg0.method1374((byte) -60);
            }
        } else {
            this.field559 = arg0.method1374((byte) -60);
        }
        if (arg2 == 12953) {
            ++field560;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIII)V")
    public static final void method254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field567;
        if (class265.field4266 == 0) {
            int var7 = class272.field4346;
            int var8 = class226.field3539;
            int var9 = class160.field2241;
            int var10 = class128.field1783;
            int var11 = (arg5 - arg1) * (-var7 + var8) / arg4 + var7;
            int var12 = (var10 - var9) * (-arg0 + arg3) / arg6 - -var9;
            if (class193.field2950 && ~(64 & class202.field3052) != -1) {
                class178 var13 = class14.method96(-1, class142.field1952, class195.field2994);
                if (var13 == null) {
                    class21.method140(arg2 + 1635002302);
                } else {
                    class82.method518(class121.field1729, (short) 46, class225.field3526, " ->", var12, var11, 0L, (byte) 85);
                }
            } else {
                if (~class188.field2856 == -2) {
                    class82.method518(-1, (short) 31, class288.field4601, "", var12, var11, 0L, (byte) 98);
                }
                ++class149.field2071;
                class82.method518(-1, (short) 48, class199.field3034, "", var12, var11, 0L, (byte) 65);
            }
        }
        if (arg2 != -1635010554) {
            method256(false);
        }
        long var14 = -1L;
        for (int var16 = 0; ~var16 > ~field573; ++var16) {
            long var17 = class171.field2429[var16];
            int var19 = (int) var17 & 127;
            int var20 = ((int) var17 & 16374) >> 7;
            int var21 = (1732217383 & (int) var17) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (~var14 != ~var17) {
                var14 = var17;
                if (var21 == 2 && class190.method1199(class166.field2364, var19, var20, var17)) {
                    class240 var23 = class265.method1717(-75, var22);
                    if (var23.field3766 != null) {
                        var23 = var23.method1567(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (~class265.field4266 != -2) {
                        if (!class193.field2950) {
                            ++class122.field1733;
                            String[] var24 = var23.field3769;
                            if (class26.field420) {
                                var24 = class56.method352(arg2 ^ -1635010461, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24[var25] != null) {
                                        ++class240.field3712;
                                        short var26 = 0;
                                        if (var25 == 0) {
                                            var26 = 4;
                                        }
                                        if (~var25 == -2) {
                                            var26 = 21;
                                        }
                                        if (~var25 == -3) {
                                            var26 = 36;
                                        }
                                        if (~var25 == -4) {
                                            var26 = 5;
                                        }
                                        int var27 = -1;
                                        if (var23.field3704 == var25) {
                                            var27 = var23.field3765;
                                        }
                                        if (~var23.field3775 == ~var25) {
                                            var27 = var23.field3740;
                                        }
                                        if (~var25 == -5) {
                                            var26 = 1005;
                                        }
                                        class82.method518(var27, var26, var24[var25], "<col=00ffff>" + var23.field3699, var20, var19, var17, (byte) 100);
                                    }
                                }
                            }
                            class82.method518(class228.field3569, (short) 1011, class45.field668, "<col=00ffff>" + var23.field3699, var20, var19, (long) var23.field3710, (byte) 77);
                        } else {
                            class267 var28 = class8.field94 != -1 ? class218.method1422((byte) 68, class8.field94) : null;
                            if (~(class202.field3052 & 4) != -1 && (var28 == null || var23.method1569(var28.field4294, class8.field94, 7016) != var28.field4294)) {
                                class82.method518(class121.field1729, (short) 1, class225.field3526, class166.field2353 + " -> <col=00ffff>" + var23.field3699, var20, var19, var17, (byte) 122);
                                ++class228.field3562;
                            }
                        }
                    } else {
                        class82.method518(class256.field4085, (short) 25, class95.field1367, class34.field521 + " -> <col=00ffff>" + var23.field3699, var20, var19, var17, (byte) 102);
                        ++class71.field1030;
                    }
                }
                if (var21 == 1) {
                    class310 var29 = class88.field1274[var22];
                    if (~(var29.field4993.field3122 & 1) == -1 && (127 & var29.field4081) == 0 && (var29.field4140 & 127) == 0 || (1 & var29.field4993.field3122) == 1 && ~(var29.field4081 & 127) == -65 && (127 & var29.field4140) == 64) {
                        int var30 = var29.field4140 - (var29.field4993.field3122 << 6);
                        int var31 = var29.field4081 - (var29.field4993.field3122 << 6);
                        int var32 = var29.field4993.field3122 << 7;
                        if (class229.field3599) {
                            for (int var33 = 0; ~class306.field4921 < ~var33; ++var33) {
                                class310 var39 = class88.field1274[class131.field1834[var33]];
                                if (var39 != null && !var39.field4069 && var29 != var39 && var39.field4136) {
                                    int var40 = -(var39.field4993.field3122 << 6) + var39.field4081;
                                    int var41 = var39.field4140 - (var39.field4993.field3122 << 6);
                                    int var42 = var39.field4993.field3122 << 7;
                                    if (class218.method1426(var42, var31, var32, var40, var41, false, var32, var30, var42)) {
                                        class164.method1050(class131.field1834[var33], var39.field4993, var20, -10763, var19);
                                        var39.field4069 = true;
                                    }
                                }
                            }
                            for (int var34 = 0; class171.field2437 > var34; ++var34) {
                                class314 var35 = class48.field689[class160.field2235[var34]];
                                if (var35 != null && !var35.field4069 && var35.field4136) {
                                    int var36 = var35.field4081 - (var35.method1683(-69) << 6);
                                    int var37 = var35.field4140 + -(var35.method1683(-88) << 6);
                                    int var38 = var35.method1683(-114) << 7;
                                    if (class218.method1426(var38, var31, var32, var36, var37, false, var32, var30, var38)) {
                                        class236.method1547(var35, (byte) -119, var19, class160.field2235[var34], var20);
                                        var35.field4069 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field4069) {
                        continue;
                    }
                    class164.method1050(var22, var29.field4993, var20, -10763, var19);
                    var29.field4069 = true;
                }
                if (~var21 == -1) {
                    class314 var43 = class48.field689[var22];
                    if (~(127 & var43.field4081) == -65 && ~(var43.field4140 & 127) == -65) {
                        int var44 = var43.field4081 + -(var43.method1683(-76) << 6);
                        int var45 = var43.field4140 - (var43.method1683(arg2 ^ 1635010461) << 6);
                        int var46 = var43.method1683(-102) << 7;
                        if (class229.field3599) {
                            for (int var47 = 0; class306.field4921 > var47; ++var47) {
                                class310 var53 = class88.field1274[class131.field1834[var47]];
                                if (var53 != null && !var53.field4069 && var53.field4136) {
                                    int var54 = -(var53.field4993.field3122 << 6) + var53.field4081;
                                    int var55 = -(var53.field4993.field3122 << 6) + var53.field4140;
                                    int var56 = var53.field4993.field3122 << 7;
                                    if (class218.method1426(var56, var44, var46, var54, var55, false, var46, var45, var56)) {
                                        class164.method1050(class131.field1834[var47], var53.field4993, var20, -10763, var19);
                                        var53.field4069 = true;
                                    }
                                }
                            }
                            for (int var48 = 0; class171.field2437 > var48; ++var48) {
                                class314 var49 = class48.field689[class160.field2235[var48]];
                                if (var49 != null && !var49.field4069 && var43 != var49 && var49.field4136) {
                                    int var50 = var49.field4081 - (var49.method1683(arg2 + 1635010476) << 6);
                                    int var51 = var49.field4140 + -(var49.method1683(-114) << 6);
                                    int var52 = var49.method1683(arg2 ^ 1635010471) << 7;
                                    if (class218.method1426(var52, var44, var46, var50, var51, false, var46, var45, var52)) {
                                        class236.method1547(var49, (byte) -126, var19, class160.field2235[var48], var20);
                                        var49.field4069 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field4069) {
                        continue;
                    }
                    class236.method1547(var43, (byte) -107, var19, var22, var20);
                    var43.field4069 = true;
                }
                if (~var21 == -4) {
                    class58 var57 = class78.field1088[class166.field2364][var19][var20];
                    if (var57 != null) {
                        for (class199 var58 = (class199) var57.method363(128); var58 != null; var58 = (class199) var57.method367((byte) 119)) {
                            int var59 = var58.field3036.field12;
                            class10 var60 = class281.method1822((byte) -113, var59);
                            if (class265.field4266 == 1) {
                                class82.method518(class256.field4085, (short) 18, class95.field1367, class34.field521 + " -> <col=ff9040>" + var60.field147, var20, var19, (long) var59, (byte) 110);
                                ++class257.field4150;
                            } else if (class193.field2950) {
                                class267 var65 = ~class8.field94 != 0 ? class218.method1422((byte) 93, class8.field94) : null;
                                if (~(class202.field3052 & 1) != -1 && (var65 == null || ~var60.method53(var65.field4294, class8.field94, (byte) -124) != ~var65.field4294)) {
                                    ++class48.field693;
                                    class82.method518(class121.field1729, (short) 7, class225.field3526, class166.field2353 + " -> <col=ff9040>" + var60.field147, var20, var19, (long) var59, (byte) 92);
                                }
                            } else {
                                ++class121.field1721;
                                String[] var61 = var60.field179;
                                if (class26.field420) {
                                    var61 = class56.method352(-121, var61);
                                }
                                for (int var62 = 4; ~var62 <= -1; --var62) {
                                    if (var61 != null && var61[var62] != null) {
                                        ++class9.field102;
                                        byte var63 = 0;
                                        if (var62 == 0) {
                                            var63 = 17;
                                        }
                                        if (var62 == 1) {
                                            var63 = 29;
                                        }
                                        int var64 = -1;
                                        if (var60.field144 == var62) {
                                            var64 = var60.field132;
                                        }
                                        if (var60.field180 == var62) {
                                            var64 = var60.field118;
                                        }
                                        if (var62 == 2) {
                                            var63 = 19;
                                        }
                                        if (~var62 == -4) {
                                            var63 = 8;
                                        }
                                        if (~var62 == -5) {
                                            var63 = 16;
                                        }
                                        class82.method518(var64, var63, var61[var62], "<col=ff9040>" + var60.field147, var20, var19, (long) var59, (byte) 90);
                                    }
                                }
                                class82.method518(class228.field3569, (short) 1001, class45.field668, "<col=ff9040>" + var60.field147, var20, var19, (long) var59, (byte) 96);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field564;
        if (arg0 != -112) {
            return null;
        } else {
            int[][] var3 = super.field1627.method104(arg1, (byte) 108);
            if (super.field1627.field280) {
                int var4 = this.field566 + this.field566 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field559 - -this.field559 - -1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field566 + arg1; arg1 - -this.field566 >= var9; ++var9) {
                    int[][] var19 = this.method727(0, var9 & class134.field1840, 842);
                    int var20 = 0;
                    int[][] var21 = new int[3][class145.field2009];
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field559; ~var27 >= ~this.field559; ++var27) {
                        int var37 = var27 & class309.field4977;
                        var22 += var25[var37];
                        var20 += var24[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var21[0];
                    int[] var29 = var21[1];
                    int[] var30 = var21[2];
                    int var31 = 0;
                    while (~var31 > ~class145.field2009) {
                        var28[var31] = var7 * var20 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class309.field4977 & -this.field559 + var31;
                        int var33 = var23 - var26[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var20 - var24[var32];
                        int var36 = class309.field4977 & this.field559 + var31;
                        var20 = var24[var36] + var35;
                        var22 = var25[var36] + var34;
                        var23 = var26[var36] + var33;
                    }
                    var8[-arg1 + var9 + this.field566] = var21;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class145.field2009 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            field574 = -78;
        }
        ++field569;
        int[] var3 = super.field1630.method302(arg0, -127);
        if (super.field1630.field710) {
            int var4 = this.field566 + 1 - -this.field566;
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field559 + 1 - -this.field559;
            int var8 = 65536 / var7;
            for (int var9 = -this.field566 + arg0; ~var9 >= ~(this.field566 + arg0); ++var9) {
                int[] var13 = this.method729(class134.field1840 & var9, 0, 0);
                int[] var14 = new int[class145.field2009];
                int var15 = 0;
                for (int var16 = -this.field559; ~this.field559 <= ~var16; ++var16) {
                    var15 += var13[var16 & class309.field4977];
                }
                int var17 = 0;
                while (~var17 > ~class145.field2009) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[-this.field559 + var17 & class309.field4977];
                    ++var17;
                    var15 = var13[this.field559 + var17 & class309.field4977] + var18;
                }
                var6[-arg0 + var9 + this.field566] = var14;
            }
            for (int var10 = 0; ~class145.field2009 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var6[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class37() {
        super(1, false);
    }

    @OriginalMember(owner = "client!k", name = "h", descriptor = "(I)V")
    public static void method255(int arg0) {
        field571 = null;
        field562 = null;
        field563 = null;
        field565 = null;
        if (arg0 != -14171) {
            field562 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V")
    public static final void method256(boolean arg0) {
        if (class149.field2066 != -1) {
            class144.method902(class149.field2066, -1, false, false, -1);
            class149.field2066 = -1;
        }
        if (arg0) {
            method257((class305) null, 11, (class305) null);
        }
        ++field572;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lnh;ILnh;)V")
    public static final void method257(class305 arg0, int arg1, class305 arg2) {
        if (arg1 == 1090536519) {
            class275.field4373 = arg2;
            ++field561;
            class295.field4720 = arg0;
            class13.field205 = class275.field4373.method2067(3, (byte) 51);
        }
    }
}
