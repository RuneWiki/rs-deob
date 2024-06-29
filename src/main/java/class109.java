import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class109 extends class64 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lcd;")
    public static class23 field2316 = class54.method414("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -1);

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lcd;")
    private static class23 field2314 = class54.method414(" more options", -1);

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lcd;")
    public static class23 field2318 = class54.method414(" )2>", -1);

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[Lcd;")
    public static class23[] field2320 = new class23[8];

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "Lcd;")
    public static class23 field2323 = field2314;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lcd;")
    public static class23 field2322 = class54.method414("huffman", -1);

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "Lhe;")
    public static class68 field2310;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "[I")
    public static int[] field2311;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[[I")
    private int[][] field2319;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    private final void method706(boolean arg0, int arg1) {
        ++field2315;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2319 = new int[4][4];
                                this.field2319[0][2] = 4096;
                                this.field2319[0][3] = 0;
                                this.field2319[0][0] = 2048;
                                this.field2319[1][2] = 4096;
                                this.field2319[1][3] = 0;
                                this.field2319[0][1] = 0;
                                this.field2319[1][0] = 2867;
                                this.field2319[1][1] = 4096;
                                this.field2319[2][2] = 4096;
                                this.field2319[2][0] = 3276;
                                this.field2319[2][3] = 0;
                                this.field2319[3][2] = 0;
                                this.field2319[3][3] = 0;
                                this.field2319[2][1] = 4096;
                                this.field2319[3][0] = 4096;
                                this.field2319[3][1] = 4096;
                            } else {
                                this.field2319 = new int[16][4];
                                this.field2319[0][0] = 0;
                                this.field2319[0][1] = 80;
                                this.field2319[0][3] = 321;
                                this.field2319[1][1] = 321;
                                this.field2319[2][1] = 578;
                                this.field2319[1][3] = 562;
                                this.field2319[3][1] = 947;
                                this.field2319[1][0] = 155;
                                this.field2319[2][3] = 803;
                                this.field2319[2][0] = 389;
                                this.field2319[4][1] = 1285;
                                this.field2319[0][2] = 192;
                                this.field2319[3][3] = 1140;
                                this.field2319[1][2] = 449;
                                this.field2319[4][3] = 1509;
                                this.field2319[2][2] = 690;
                                this.field2319[3][2] = 995;
                                this.field2319[4][2] = 1397;
                                this.field2319[3][0] = 671;
                                this.field2319[5][2] = 1429;
                                this.field2319[4][0] = 897;
                                this.field2319[5][1] = 1525;
                                this.field2319[6][1] = 1734;
                                this.field2319[5][3] = 1413;
                                this.field2319[7][1] = 1413;
                                this.field2319[8][1] = 1108;
                                this.field2319[6][3] = 1333;
                                this.field2319[7][3] = 1702;
                                this.field2319[5][0] = 1175;
                                this.field2319[9][1] = 1766;
                                this.field2319[6][2] = 1461;
                                this.field2319[10][1] = 2409;
                                this.field2319[7][2] = 1525;
                                this.field2319[6][0] = 1368;
                                this.field2319[8][2] = 1590;
                                this.field2319[8][3] = 2056;
                                this.field2319[11][1] = 3116;
                                this.field2319[9][2] = 2056;
                                this.field2319[9][3] = 2666;
                                this.field2319[12][1] = 3806;
                                this.field2319[13][1] = 3437;
                                this.field2319[14][1] = 3116;
                                this.field2319[10][3] = 3276;
                                this.field2319[15][1] = 2377;
                                this.field2319[10][2] = 2586;
                                this.field2319[7][0] = 1507;
                                this.field2319[11][2] = 3148;
                                this.field2319[8][0] = 1736;
                                this.field2319[12][2] = 3710;
                                this.field2319[11][3] = 3228;
                                this.field2319[12][3] = 3196;
                                this.field2319[13][2] = 3421;
                                this.field2319[13][3] = 3019;
                                this.field2319[14][3] = 3228;
                                this.field2319[9][0] = 2088;
                                this.field2319[15][3] = 2746;
                                this.field2319[14][2] = 3148;
                                this.field2319[15][2] = 2505;
                                this.field2319[10][0] = 2355;
                                this.field2319[11][0] = 2691;
                                this.field2319[12][0] = 3031;
                                this.field2319[13][0] = 3522;
                                this.field2319[14][0] = 3727;
                                this.field2319[15][0] = 4096;
                            }
                        } else {
                            this.field2319 = new int[6][4];
                            this.field2319[0][3] = 0;
                            this.field2319[0][0] = 0;
                            this.field2319[1][3] = 1493;
                            this.field2319[0][1] = 0;
                            this.field2319[1][1] = 0;
                            this.field2319[2][3] = 2939;
                            this.field2319[3][3] = 3565;
                            this.field2319[1][0] = 1843;
                            this.field2319[2][0] = 2457;
                            this.field2319[0][2] = 0;
                            this.field2319[2][1] = 0;
                            this.field2319[4][3] = 4031;
                            this.field2319[3][0] = 2781;
                            this.field2319[4][0] = 3481;
                            this.field2319[3][1] = 0;
                            this.field2319[4][1] = 546;
                            this.field2319[5][1] = 4096;
                            this.field2319[1][2] = 0;
                            this.field2319[2][2] = 0;
                            this.field2319[5][0] = 4096;
                            this.field2319[5][3] = 4096;
                            this.field2319[3][2] = 1124;
                            this.field2319[4][2] = 3084;
                            this.field2319[5][2] = 4096;
                        }
                    } else {
                        this.field2319 = new int[7][4];
                        this.field2319[0][3] = 4096;
                        this.field2319[0][2] = 0;
                        this.field2319[0][0] = 0;
                        this.field2319[1][2] = 4096;
                        this.field2319[2][2] = 4096;
                        this.field2319[1][0] = 663;
                        this.field2319[0][1] = 0;
                        this.field2319[2][0] = 1363;
                        this.field2319[3][2] = 4096;
                        this.field2319[4][2] = 0;
                        this.field2319[1][3] = 4096;
                        this.field2319[1][1] = 0;
                        this.field2319[2][1] = 0;
                        this.field2319[2][3] = 0;
                        this.field2319[3][1] = 4096;
                        this.field2319[5][2] = 0;
                        this.field2319[4][1] = 4096;
                        this.field2319[6][2] = 0;
                        this.field2319[3][0] = 2048;
                        this.field2319[3][3] = 0;
                        this.field2319[5][1] = 4096;
                        this.field2319[4][3] = 0;
                        this.field2319[5][3] = 4096;
                        this.field2319[4][0] = 2727;
                        this.field2319[6][3] = 4096;
                        this.field2319[6][1] = 0;
                        this.field2319[5][0] = 3411;
                        this.field2319[6][0] = 4096;
                    }
                } else {
                    this.field2319 = new int[8][4];
                    this.field2319[0][3] = 2361;
                    this.field2319[0][0] = 0;
                    this.field2319[0][1] = 2650;
                    this.field2319[1][3] = 1558;
                    this.field2319[2][3] = 1413;
                    this.field2319[1][0] = 2867;
                    this.field2319[0][2] = 2602;
                    this.field2319[1][1] = 2313;
                    this.field2319[1][2] = 1799;
                    this.field2319[2][1] = 2618;
                    this.field2319[3][3] = 947;
                    this.field2319[2][2] = 1734;
                    this.field2319[3][1] = 2296;
                    this.field2319[3][2] = 1220;
                    this.field2319[4][2] = 963;
                    this.field2319[4][3] = 722;
                    this.field2319[4][1] = 2072;
                    this.field2319[5][1] = 2730;
                    this.field2319[5][2] = 2152;
                    this.field2319[2][0] = 3072;
                    this.field2319[6][1] = 2232;
                    this.field2319[7][1] = 1686;
                    this.field2319[3][0] = 3276;
                    this.field2319[6][2] = 1060;
                    this.field2319[7][2] = 1413;
                    this.field2319[5][3] = 1766;
                    this.field2319[6][3] = 915;
                    this.field2319[4][0] = 3481;
                    this.field2319[7][3] = 1140;
                    this.field2319[5][0] = 3686;
                    this.field2319[6][0] = 3891;
                    this.field2319[7][0] = 4096;
                }
            } else {
                this.field2319 = new int[2][4];
                this.field2319[0][0] = 0;
                this.field2319[0][1] = 0;
                this.field2319[1][1] = 4096;
                this.field2319[0][2] = 0;
                this.field2319[0][3] = 0;
                this.field2319[1][0] = 4096;
                this.field2319[1][2] = 4096;
                this.field2319[1][3] = 4096;
            }
        }
        if (arg0) {
            method709((byte) 67, -93, -18, -39, 33);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2312;
        int var4 = -5 % ((arg0 - 7) / 43);
        if (~arg1 == -1) {
            int var5 = arg2.method1202(124);
            if (~var5 != -1) {
                this.method706(false, var5);
            } else {
                this.field2319 = new int[arg2.method1202(-55)][4];
                for (int var6 = 0; ~this.field2319.length < ~var6; ++var6) {
                    this.field2319[var6][0] = arg2.method1197(-1);
                    this.field2319[var6][1] = arg2.method1202(-48) << 4;
                    this.field2319[var6][2] = arg2.method1202(111) << 4;
                    this.field2319[var6][3] = arg2.method1202(-76) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lkh;BIILkh;)Lcg;")
    public static final class26 method707(class97 arg0, byte arg1, int arg2, int arg3, class97 arg4) {
        ++field2321;
        if (!class124.method765(arg3, arg2, (byte) 82, arg0)) {
            return null;
        } else {
            if (arg1 != 5) {
                method707((class97) null, (byte) -66, -4, -44, (class97) null);
            }
            return class79.method539((byte) -103, arg4.method651(arg1 + -1, arg2, arg3));
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        if (arg0 == -22) {
            ++field2313;
            if (this.field2319 == null) {
                this.method706(false, 1);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            method707((class97) null, (byte) 40, 87, 93, (class97) null);
        }
        ++field2317;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757) {
            int var4 = this.field2319.length;
            int[] var5 = this.method479(-1, arg0, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~var4 >= -1) {
                for (int var9 = 0; ~var9 > ~class168.field3367; ++var9) {
                    var6[var9] = 0;
                    var7[var9] = 0;
                    var8[var9] = 0;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class168.field3367; ++var10) {
                    int var11 = var5[var10];
                    int var12 = 0;
                    for (int var13 = 0; ~var13 > ~var4 && this.field2319[var13][0] <= var11; ++var13) {
                        ++var12;
                    }
                    if (var4 <= var12) {
                        int[] var14 = this.field2319[var4 + -1];
                        var6[var10] = var14[1];
                        var7[var10] = var14[2];
                        var8[var10] = var14[3];
                    } else {
                        int[] var15 = this.field2319[var12];
                        if (var12 > 0) {
                            int[] var16 = this.field2319[var12 - 1];
                            int var17 = (-var16[0] + var11 << 12) / (var15[0] - var16[0]);
                            int var18 = -var17 + 4096;
                            var6[var10] = var15[1] * var17 - -(var16[1] * var18) >> 12;
                            var7[var10] = var15[2] * var17 - -(var16[2] * var18) >> 12;
                            var8[var10] = var15[3] * var17 + var16[3] * var18 >> 12;
                        } else {
                            var6[var10] = var15[1];
                            var7[var10] = var15[2];
                            var8[var10] = var15[3];
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static void method708(int arg0) {
        field2311 = null;
        field2316 = null;
        field2322 = null;
        field2320 = null;
        field2310 = null;
        field2314 = null;
        field2323 = null;
        field2318 = null;
        if (arg0 != 18760) {
            field2323 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIIII)V")
    public static final void method709(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -30) {
            for (int var5 = 0; ~class5.field92 < ~var5; ++var5) {
                if (class78.field1718[var5] + class112.field2372[var5] > arg1 && ~class78.field1718[var5] > ~(arg1 - -arg3) && ~(class179.field3558[var5] + class121.field2504[var5]) < ~arg2 && arg2 + arg4 > class121.field2504[var5]) {
                    class172.field3412[var5] = true;
                }
            }
            ++field2309;
        }
    }
}
