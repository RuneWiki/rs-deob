import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class99 extends class93 {

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    private int field2002 = 0;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    private int field2005 = 1024;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    private int field2007 = 0;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    private int field2009 = 409;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    private int field2001 = 819;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    private int field2010 = 1024;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    private int field2004 = 2048;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    private int field2006 = 1024;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    private int field2015 = 1024;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "Ljd;")
    public static class92 field2013 = class202.method1325((byte) 90, ":clanreq:");

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lgh;")
    public static class68 field2000 = new class68(5000);

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "Ljd;")
    public static class92 field2017 = class202.method1325((byte) 90, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "Ljd;")
    public static class92 field2019 = class202.method1325((byte) 90, "VOLL");

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lnh;")
    public static class133 field2018;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int[] var3 = super.field1887.method916(arg0, -111);
        ++field1998;
        if (super.field1887.field2757) {
            int var4 = 0;
            int[][] var5 = super.field1887.method913(0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class150.field2985 * this.field2006 >> 12;
            int var15 = class150.field2985 * this.field2004 >> 12;
            int var16 = class68.field1385 * this.field2009 >> 12;
            int var17 = class68.field1385 * this.field2001 >> 12;
            if (~var17 >= -2) {
                return var5[arg0];
            }
            this.field2011 = class150.field2985 / 8 * this.field2015 >> 12;
            int var18 = class150.field2985 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2007);
            label124: while (true) {
                while (true) {
                    int var22 = var14 + class42.method265(-1, -var14 + var15, var21);
                    int var23 = class42.method265(-1, var17 - var16, var21) + var16;
                    int var24 = var8 - -var22;
                    if (var24 > class150.field2985) {
                        var22 = -var8 + class150.field2985;
                        var24 = class150.field2985;
                    }
                    int var27;
                    if (var10) {
                        var27 = 0;
                    } else {
                        int var25 = var12;
                        int[] var26 = var20[var12];
                        var27 = var26[2];
                        int var28 = var6 + var24;
                        if (var28 < 0) {
                            var28 += class150.field2985;
                        }
                        if (~var28 < ~class150.field2985) {
                            var28 -= class150.field2985;
                        }
                        int var29 = 0;
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var28 >= var30[0] && var30[1] >= var28) {
                                if (~var12 != ~var25) {
                                    int var31 = var6 + var8;
                                    if (var31 < 0) {
                                        var31 += class150.field2985;
                                    }
                                    if (~var31 < ~class150.field2985) {
                                        var31 -= class150.field2985;
                                    }
                                    for (int var32 = 1; var29 >= var32; ++var32) {
                                        int[] var40 = var20[(var12 + var32) % var13];
                                        var27 = Math.max(var27, var40[2]);
                                    }
                                    for (int var33 = 0; ~var29 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var12 + var33) % var13];
                                        int var35 = var34[2];
                                        if (var27 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var28 <= var31) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class150.field2985;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method690(var7 + var38, -var35 + var27, var5, var35, var21, (byte) -6, -var38 + var39);
                                        }
                                    }
                                }
                                var12 = var25;
                                break;
                            }
                            int var10000 = ~var13;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                            ++var29;
                        }
                    }
                    if (var23 + var27 > class68.field1385) {
                        var23 = class68.field1385 - var27;
                    } else {
                        var9 = false;
                    }
                    if (class150.field2985 != var24) {
                        int[] var41 = var19[var11++];
                        var41[1] = var24;
                        var41[2] = var27 - -var23;
                        var41[0] = var8;
                        this.method690(var4 + var8, var23, var5, var27, var21, (byte) -6, var22);
                        var8 = var24;
                    } else {
                        this.method690(var4 + var8, var23, var5, var27, var21, (byte) -6, var22);
                        if (var9) {
                            break label124;
                        }
                        var12 = 0;
                        int[] var42 = var19[var11++];
                        var13 = var11;
                        int[][] var43 = var20;
                        var11 = 0;
                        var20 = var19;
                        var42[2] = var23 + var27;
                        var9 = true;
                        var10 = false;
                        var42[0] = var8;
                        var19 = var43;
                        var8 = 0;
                        var7 = var4;
                        var42[1] = var24;
                        var4 = class42.method265(-1, class150.field2985, var21);
                        var6 = -var7 + var4;
                        int var44 = var6;
                        if (~var6 > -1) {
                            var44 = class150.field2985 + var6;
                        }
                        if (class150.field2985 < var44) {
                            var44 -= class150.field2985;
                        }
                        while (true) {
                            int[] var45 = var20[var12];
                            if (var44 >= var45[0] && ~var45[1] <= ~var44) {
                                break;
                            }
                            ++var12;
                            if (var12 >= var13) {
                                var12 = 0;
                            }
                        }
                    }
                }
            }
        }
        int var46 = -6 % ((arg1 - 67) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(La;II)I")
    public static final int method688(class1 arg0, int arg1, int arg2) {
        ++field2008;
        if (arg0.field43 != null && ~arg0.field43.length < ~arg1) {
            try {
                int[] var3 = arg0.field43[arg1];
                if (arg2 != -1501238288) {
                    return 71;
                } else {
                    int var4 = 0;
                    int var5 = 0;
                    byte var6 = 0;
                    while (true) {
                        int var7 = var3[var4++];
                        int var8 = 0;
                        byte var9 = 0;
                        if (~var7 == -1) {
                            return var5;
                        }
                        if (var7 == 15) {
                            var9 = 1;
                        }
                        if (var7 == 16) {
                            var9 = 2;
                        }
                        if (~var7 == -18) {
                            var9 = 3;
                        }
                        if (~var7 == -2) {
                            var8 = class15.field428[var3[var4++]];
                        }
                        if (var7 == 2) {
                            var8 = class100.field2069[var3[var4++]];
                        }
                        if (~var7 == -4) {
                            var8 = class135.field2700[var3[var4++]];
                        }
                        if (var7 == 4) {
                            int var10 = var3[var4++] << 16;
                            int var11 = var10 + var3[var4++];
                            class1 var12 = class175.method1155(var11, (byte) 67);
                            int var13 = var3[var4++];
                            if (~var13 != 0 && (!class92.method626((byte) 59, var13).field2202 || class103.field2127)) {
                                for (int var14 = 0; var14 < var12.field133.length; ++var14) {
                                    if (~(var13 + 1) == ~var12.field133[var14]) {
                                        var8 += var12.field60[var14];
                                    }
                                }
                            }
                        }
                        if (~var7 == -6) {
                            var8 = class165.field3242[var3[var4++]];
                        }
                        if (~var7 == -7) {
                            var8 = class68.field1368[-1 + class100.field2069[var3[var4++]]];
                        }
                        if (var7 == 7) {
                            var8 = 100 * class165.field3242[var3[var4++]] / 46875;
                        }
                        if (var7 == 8) {
                            var8 = class15.field423.field1796;
                        }
                        if (~var7 == -10) {
                            for (int var15 = 0; ~var15 > -26; ++var15) {
                                if (class200.field3890[var15]) {
                                    var8 += class100.field2069[var15];
                                }
                            }
                        }
                        if (~var7 == -11) {
                            int var16 = var3[var4++] << 16;
                            int var17 = var16 + var3[var4++];
                            class1 var18 = class175.method1155(var17, (byte) 33);
                            int var19 = var3[var4++];
                            if (~var19 != 0 && (!class92.method626((byte) 59, var19).field2202 || class103.field2127)) {
                                for (int var20 = 0; var18.field133.length > var20; ++var20) {
                                    if (var19 - -1 == var18.field133[var20]) {
                                        var8 = 999999999;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var7 == -12) {
                            var8 = class174.field3367;
                        }
                        if (~var7 == -13) {
                            var8 = class49.field1074;
                        }
                        if (var7 == 13) {
                            int var21 = class165.field3242[var3[var4++]];
                            int var22 = var3[var4++];
                            var8 = ~(var21 & 1 << var22) == -1 ? 0 : 1;
                        }
                        if (var7 == 14) {
                            int var23 = var3[var4++];
                            var8 = class30.method186(var23, (byte) -79);
                        }
                        if (var7 == 18) {
                            var8 = (class15.field423.field246 >> 7) + class115.field2343;
                        }
                        if (var7 == 19) {
                            var8 = (class15.field423.field208 >> 7) - -class210.field4077;
                        }
                        if (~var7 == -21) {
                            var8 = var3[var4++];
                        }
                        if (var9 == 0) {
                            if (~var6 == -1) {
                                var5 += var8;
                            }
                            if (~var6 == -2) {
                                var5 -= var8;
                            }
                            if (~var6 == -3 && ~var8 != -1) {
                                var5 /= var8;
                            }
                            if (~var6 == -4) {
                                var5 *= var8;
                            }
                            var6 = 0;
                        } else {
                            var6 = var9;
                        }
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static void method689(int arg0) {
        field2017 = null;
        int var1 = -75 % ((5 - arg0) / 59);
        field2019 = null;
        field2000 = null;
        field2013 = null;
        field2018 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[[IILjava/util/Random;BI)V")
    private final void method690(int arg0, int arg1, int[][] arg2, int arg3, Random arg4, byte arg5, int arg6) {
        ++field2014;
        int var8 = ~this.field2005 < -1 ? -class42.method265(-1, this.field2005, arg4) + 4096 : 4096;
        int var9 = this.field2011 * this.field2010 >> 12;
        int var10 = this.field2011 - (~var9 >= -1 ? 0 : class42.method265(-1, var9, arg4));
        if (arg0 >= class150.field2985) {
            arg0 -= class150.field2985;
        }
        if (var10 > 0) {
            if (~arg1 >= -1 || arg6 <= 0) {
                return;
            }
            int var11 = arg1 / 2;
            int var12 = arg6 / 2;
            int var13 = ~var10 < ~var12 ? var12 : var10;
            int var14 = -(var13 * 2) + arg6;
            int var15 = arg0 - -var13;
            int var16 = ~var11 > ~var10 ? var11 : var10;
            for (int var17 = 0; ~arg1 < ~var17; ++var17) {
                int[] var18 = arg2[arg3 + var17];
                if (~var17 > ~var16) {
                    int var19 = var8 * var17 / var16;
                    if (this.field2002 != 0) {
                        for (int var20 = 0; var20 < var13; ++var20) {
                            int var21 = var8 * var20 / var13;
                            var18[class196.method1301(class2.field163, arg0 - -var20)] = var18[class196.method1301(class2.field163, -var20 + arg0 + arg6 + -1)] = var19 <= var21 ? var19 : var21;
                        }
                    } else {
                        for (int var22 = 0; var22 < var13; ++var22) {
                            int var24 = var8 * var22 / var13;
                            var18[class196.method1301(arg0 + var22, class2.field163)] = var18[class196.method1301(class2.field163, arg0 + arg6 - var22 + -1)] = var19 * var24 >> 12;
                        }
                    }
                    if (~class150.field2985 > ~(var14 + var15)) {
                        int var23 = -var15 + class150.field2985;
                        class11.method77(var18, var15, var23, var19);
                        class11.method77(var18, 0, -var23 + var14, var19);
                    } else {
                        class11.method77(var18, var15, var14, var19);
                    }
                } else {
                    int var25 = -var17 + arg1 + -1;
                    if (var25 < var16) {
                        int var26 = var8 * var25 / var16;
                        if (~this.field2002 == -1) {
                            for (int var27 = 0; var13 > var27; ++var27) {
                                int var28 = var8 * var27 / var13;
                                var18[class196.method1301(class2.field163, arg0 + var27)] = var18[class196.method1301(class2.field163, arg0 + arg6 - var27 + -1)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                int var31 = var8 * var29 / var13;
                                var18[class196.method1301(arg0 - -var29, class2.field163)] = var18[class196.method1301(arg0 + arg6 - var29 + -1, class2.field163)] = ~var31 > ~var26 ? var31 : var26;
                            }
                        }
                        if (~(var14 + var15) < ~class150.field2985) {
                            int var30 = -var15 + class150.field2985;
                            class11.method77(var18, var15, var30, var26);
                            class11.method77(var18, 0, -var30 + var14, var26);
                        } else {
                            class11.method77(var18, var15, var14, var26);
                        }
                    } else {
                        for (int var32 = 0; ~var32 > ~var13; ++var32) {
                            var18[class196.method1301(arg0 - -var32, class2.field163)] = var18[class196.method1301(class2.field163, arg0 + arg6 + -1 + -var32)] = var8 * var32 / var13;
                        }
                        if (~class150.field2985 > ~(var14 + var15)) {
                            int var33 = class150.field2985 - var15;
                            class11.method77(var18, var15, var33, var8);
                            class11.method77(var18, 0, -var33 + var14, var8);
                        } else {
                            class11.method77(var18, var15, var14, var8);
                        }
                    }
                }
            }
        } else if (arg0 - -arg6 > class150.field2985) {
            int var34 = -arg0 + class150.field2985;
            for (int var35 = 0; ~var35 > ~arg1; ++var35) {
                int[] var36 = arg2[arg3 - -var35];
                class11.method77(var36, arg0, var34, var8);
                class11.method77(var36, 0, -var34 + arg6, var8);
            }
        } else {
            for (int var37 = 0; ~arg1 < ~var37; ++var37) {
                class11.method77(arg2[arg3 - -var37], arg0, arg6, var8);
            }
        }
        if (arg5 != -6) {
            method689(-81);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field1997;
        if (arg0 != -85) {
            this.method690(-31, 103, (int[][]) null, -3, (Random) null, (byte) 113, 80);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field2005 = arg1.method442(arg2 ^ -21351);
                                        }
                                    } else {
                                        this.field2010 = arg1.method442(-21351);
                                    }
                                } else {
                                    this.field2002 = arg1.method443(255);
                                }
                            } else {
                                this.field2015 = arg1.method442(-21351);
                            }
                        } else {
                            this.field2001 = arg1.method442(-21351);
                        }
                    } else {
                        this.field2009 = arg1.method442(-21351);
                    }
                } else {
                    this.field2004 = arg1.method442(-21351);
                }
            } else {
                this.field2006 = arg1.method442(arg2 + -21351);
            }
        } else {
            this.field2007 = arg1.method443(arg2 ^ 255);
        }
        if (arg2 != 0) {
            field2000 = null;
        }
        ++field2016;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
    public static final void method691(long arg0, int arg1) {
        ++field1999;
        if (~arg0 != -1L) {
            for (int var3 = 0; ~var3 > ~class64.field1302; ++var3) {
                if (class144.field2880[var3] == arg0) {
                    ++class208.field3996;
                    --class64.field1302;
                    for (int var4 = var3; class64.field1302 > var4; ++var4) {
                        class144.field2880[var4] = class144.field2880[var4 + 1];
                        class174.field3366[var4] = class174.field3366[var4 + 1];
                    }
                    class136.field2732 = class186.field3516;
                    field2000.method405(205, 7);
                    field2000.method459(false, arg0);
                    break;
                }
            }
            if (arg1 != 205) {
                method691(-46L, -75);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIILnh;III)V")
    public static final void method692(boolean arg0, int arg1, int arg2, class133 arg3, int arg4, int arg5, int arg6) {
        class33.field738 = arg2;
        if (arg4 == 27927) {
            ++field2012;
            class151.field3002 = arg5;
            class156.field3100 = arg3;
            class150.field2980 = arg1;
            class79.field1619 = 1;
            class151.field2989 = arg0;
            class110.field2245 = arg6;
        }
    }
}
