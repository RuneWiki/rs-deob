import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class176 extends class160 {

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "[I")
    private int[] field2752 = new int[257];

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "[I")
    public static int[] field2763 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "[Lrh;")
    public static class47[] field2765 = new class47[4];

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "[I")
    public static int[] field2759;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "[[I")
    private int[][] field2751;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method633(48);
            if (var4 == 0) {
                this.field2751 = new int[arg0.method633(73)][4];
                for (int var5 = 0; ~this.field2751.length < ~var5; ++var5) {
                    this.field2751[var5][0] = arg0.method645(11596);
                    this.field2751[var5][1] = arg0.method633(78) << 4;
                    this.field2751[var5][2] = arg0.method633(125) << 4;
                    this.field2751[var5][3] = arg0.method633(63) << 4;
                }
            } else {
                this.method1196(var4, (byte) 113);
            }
        }
        ++field2761;
        if (arg1 <= 11) {
            field2753 = 34;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
    public static final void method1192(byte arg0, boolean arg1) {
        ++field2764;
        if (class111.field1818 != arg1) {
            class111.field1818 = arg1;
            int var2 = -78 % ((arg0 - -59) / 59);
            class142.method958(false);
        }
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        field2765 = null;
        if (arg0 != 123) {
            method1192((byte) 24, true);
        }
        field2759 = null;
        field2763 = null;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (this.field2751 == null) {
            this.method1196(1, (byte) 73);
        }
        this.method1195((byte) 102);
        if (arg0 >= -124) {
            this.method3(-10, true);
        }
        ++field2762;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field2760;
        if (!arg1) {
            method1194(-103);
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[] var4 = this.method1085(0, arg0, (byte) 65);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class240.field3896 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2752[var9];
                var5[var8] = class55.method420(4080, var10 >> 12);
                var6[var8] = class55.method420(65280, var10) >> 4;
                var7[var8] = class55.method420(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Z")
    public static final boolean method1194(int arg0) {
        ++field2757;
        if (class174.field2741) {
            try {
                class215.method1453(class179.field2788.field479, 116, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 0) {
            field2753 = 18;
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "(B)V")
    private final void method1195(byte arg0) {
        ++field2758;
        if (arg0 >= 34) {
            int var2 = this.field2751.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5 = 0;
                    for (int var6 = 0; ~var6 > ~var2 && var4 >= this.field2751[var6][0]; ++var6) {
                        ++var5;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var5 <= ~var2) {
                        int[] var7 = this.field2751[var2 + -1];
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field2751[var5];
                        if (var5 <= 0) {
                            var10 = var11[2];
                            var9 = var11[3];
                            var8 = var11[1];
                        } else {
                            int[] var12 = this.field2751[var5 - 1];
                            int var13 = (-var12[0] + var4 << 12) / (var11[0] - var12[0]);
                            int var14 = 4096 - var13;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var10 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        }
                    }
                    int var15 = var8 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var9 >> 4;
                    if (var17 >= 0) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    this.field2752[var3] = class45.method330(var17, class45.method330(var15 << 16, var16 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V")
    private final void method1196(int arg0, byte arg1) {
        int var3 = -52 % ((arg1 - 24) / 38);
        ++field2755;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field2751 = new int[4][4];
                                    this.field2751[0][2] = 4096;
                                    this.field2751[1][2] = 4096;
                                    this.field2751[0][0] = 2048;
                                    this.field2751[1][0] = 2867;
                                    this.field2751[2][0] = 3276;
                                    this.field2751[3][0] = 4096;
                                    this.field2751[2][2] = 4096;
                                    this.field2751[3][2] = 0;
                                    this.field2751[0][3] = 0;
                                    this.field2751[0][1] = 0;
                                    this.field2751[1][1] = 4096;
                                    this.field2751[1][3] = 0;
                                    this.field2751[2][3] = 0;
                                    this.field2751[2][1] = 4096;
                                    this.field2751[3][1] = 4096;
                                    this.field2751[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2751 = new int[16][4];
                                this.field2751[0][1] = 80;
                                this.field2751[0][2] = 192;
                                this.field2751[1][2] = 449;
                                this.field2751[0][0] = 0;
                                this.field2751[2][2] = 690;
                                this.field2751[0][3] = 321;
                                this.field2751[1][1] = 321;
                                this.field2751[1][3] = 562;
                                this.field2751[1][0] = 155;
                                this.field2751[3][2] = 995;
                                this.field2751[2][0] = 389;
                                this.field2751[2][1] = 578;
                                this.field2751[3][1] = 947;
                                this.field2751[4][1] = 1285;
                                this.field2751[5][1] = 1525;
                                this.field2751[6][1] = 1734;
                                this.field2751[2][3] = 803;
                                this.field2751[7][1] = 1413;
                                this.field2751[3][0] = 671;
                                this.field2751[8][1] = 1108;
                                this.field2751[4][2] = 1397;
                                this.field2751[5][2] = 1429;
                                this.field2751[9][1] = 1766;
                                this.field2751[6][2] = 1461;
                                this.field2751[4][0] = 897;
                                this.field2751[3][3] = 1140;
                                this.field2751[10][1] = 2409;
                                this.field2751[4][3] = 1509;
                                this.field2751[11][1] = 3116;
                                this.field2751[7][2] = 1525;
                                this.field2751[8][2] = 1590;
                                this.field2751[9][2] = 2056;
                                this.field2751[12][1] = 3806;
                                this.field2751[10][2] = 2586;
                                this.field2751[5][0] = 1175;
                                this.field2751[5][3] = 1413;
                                this.field2751[6][3] = 1333;
                                this.field2751[11][2] = 3148;
                                this.field2751[12][2] = 3710;
                                this.field2751[13][2] = 3421;
                                this.field2751[14][2] = 3148;
                                this.field2751[13][1] = 3437;
                                this.field2751[14][1] = 3116;
                                this.field2751[7][3] = 1702;
                                this.field2751[8][3] = 2056;
                                this.field2751[9][3] = 2666;
                                this.field2751[6][0] = 1368;
                                this.field2751[7][0] = 1507;
                                this.field2751[15][2] = 2505;
                                this.field2751[15][1] = 2377;
                                this.field2751[8][0] = 1736;
                                this.field2751[9][0] = 2088;
                                this.field2751[10][3] = 3276;
                                this.field2751[11][3] = 3228;
                                this.field2751[12][3] = 3196;
                                this.field2751[10][0] = 2355;
                                this.field2751[13][3] = 3019;
                                this.field2751[14][3] = 3228;
                                this.field2751[11][0] = 2691;
                                this.field2751[12][0] = 3031;
                                this.field2751[13][0] = 3522;
                                this.field2751[15][3] = 2746;
                                this.field2751[14][0] = 3727;
                                this.field2751[15][0] = 4096;
                            }
                        } else {
                            this.field2751 = new int[6][4];
                            this.field2751[0][0] = 0;
                            this.field2751[0][1] = 0;
                            this.field2751[1][0] = 1843;
                            this.field2751[2][0] = 2457;
                            this.field2751[3][0] = 2781;
                            this.field2751[1][1] = 0;
                            this.field2751[2][1] = 0;
                            this.field2751[0][2] = 0;
                            this.field2751[0][3] = 0;
                            this.field2751[3][1] = 0;
                            this.field2751[1][2] = 0;
                            this.field2751[1][3] = 1493;
                            this.field2751[4][1] = 546;
                            this.field2751[5][1] = 4096;
                            this.field2751[2][3] = 2939;
                            this.field2751[4][0] = 3481;
                            this.field2751[3][3] = 3565;
                            this.field2751[5][0] = 4096;
                            this.field2751[4][3] = 4031;
                            this.field2751[2][2] = 0;
                            this.field2751[5][3] = 4096;
                            this.field2751[3][2] = 1124;
                            this.field2751[4][2] = 3084;
                            this.field2751[5][2] = 4096;
                        }
                    } else {
                        this.field2751 = new int[7][4];
                        this.field2751[0][3] = 4096;
                        this.field2751[0][1] = 0;
                        this.field2751[1][1] = 0;
                        this.field2751[2][1] = 0;
                        this.field2751[0][2] = 0;
                        this.field2751[3][1] = 4096;
                        this.field2751[1][2] = 4096;
                        this.field2751[4][1] = 4096;
                        this.field2751[0][0] = 0;
                        this.field2751[5][1] = 4096;
                        this.field2751[1][0] = 663;
                        this.field2751[1][3] = 4096;
                        this.field2751[2][0] = 1363;
                        this.field2751[3][0] = 2048;
                        this.field2751[2][2] = 4096;
                        this.field2751[2][3] = 0;
                        this.field2751[6][1] = 0;
                        this.field2751[3][3] = 0;
                        this.field2751[4][3] = 0;
                        this.field2751[3][2] = 4096;
                        this.field2751[5][3] = 4096;
                        this.field2751[4][2] = 0;
                        this.field2751[4][0] = 2727;
                        this.field2751[5][2] = 0;
                        this.field2751[6][3] = 4096;
                        this.field2751[5][0] = 3411;
                        this.field2751[6][0] = 4096;
                        this.field2751[6][2] = 0;
                    }
                } else {
                    this.field2751 = new int[8][4];
                    this.field2751[0][3] = 2361;
                    this.field2751[0][0] = 0;
                    this.field2751[1][3] = 1558;
                    this.field2751[2][3] = 1413;
                    this.field2751[0][1] = 2650;
                    this.field2751[0][2] = 2602;
                    this.field2751[3][3] = 947;
                    this.field2751[4][3] = 722;
                    this.field2751[1][1] = 2313;
                    this.field2751[1][2] = 1799;
                    this.field2751[1][0] = 2867;
                    this.field2751[2][1] = 2618;
                    this.field2751[3][1] = 2296;
                    this.field2751[5][3] = 1766;
                    this.field2751[4][1] = 2072;
                    this.field2751[2][2] = 1734;
                    this.field2751[5][1] = 2730;
                    this.field2751[3][2] = 1220;
                    this.field2751[4][2] = 963;
                    this.field2751[6][1] = 2232;
                    this.field2751[6][3] = 915;
                    this.field2751[5][2] = 2152;
                    this.field2751[7][3] = 1140;
                    this.field2751[6][2] = 1060;
                    this.field2751[7][2] = 1413;
                    this.field2751[7][1] = 1686;
                    this.field2751[2][0] = 3072;
                    this.field2751[3][0] = 3276;
                    this.field2751[4][0] = 3481;
                    this.field2751[5][0] = 3686;
                    this.field2751[6][0] = 3891;
                    this.field2751[7][0] = 4096;
                }
            } else {
                this.field2751 = new int[2][4];
                this.field2751[0][2] = 0;
                this.field2751[1][2] = 4096;
                this.field2751[0][3] = 0;
                this.field2751[0][1] = 0;
                this.field2751[0][0] = 0;
                this.field2751[1][3] = 4096;
                this.field2751[1][1] = 4096;
                this.field2751[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
    public static final boolean method1197(int arg0) {
        ++field2754;
        try {
            if (~class253.field4061 == -3) {
                if (class263.field4174 == null) {
                    class263.field4174 = class91.method694(class205.field3198, class179.field2792, class111.field1817);
                    if (class263.field4174 == null) {
                        return false;
                    }
                }
                if (class213.field3315 == null) {
                    class213.field3315 = new class115(class71.field1129, class103.field1730);
                }
                if (class6.field122.method47(class8.field168, 22050, class213.field3315, arg0 ^ -11361, class263.field4174)) {
                    class6.field122.method23(-2);
                    class6.field122.method53(class179.field2783, (byte) 76);
                    class6.field122.method43(class263.field4174, -13411, class84.field1422);
                    class213.field3315 = null;
                    class205.field3198 = null;
                    class263.field4174 = null;
                    class253.field4061 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class6.field122.method37((byte) -96);
            class263.field4174 = null;
            class205.field3198 = null;
            class213.field3315 = null;
            class253.field4061 = 0;
        }
        return arg0 != -11361;
    }
}
