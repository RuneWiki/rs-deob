import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class99 extends class64 {

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Lsg;")
    private static class169 field1847 = class165.method1060("Too many connections from your address)3", 1536);

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "Lsg;")
    public static class169 field1854 = field1847;

    @OriginalMember(owner = "client!l", name = "pb", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!l", name = "qb", descriptor = "Lsg;")
    public static class169 field1862 = class165.method1060("<)4col>", 1536);

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!l", name = "nb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!l", name = "ob", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!l", name = "rb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "J")
    public static long field1858;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "Lsh;")
    public static class170 field1848;

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "[Lqf;")
    public static class150[] field1857;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "[[I")
    private int[][] field1852;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)I")
    public static final int method587(int arg0, int arg1, int arg2) {
        class87 var3 = (class87) class3.field59.method1045((long) arg0, (byte) -77);
        ++field1850;
        if (var3 == null) {
            return -1;
        } else if (arg1 != -20321) {
            return 90;
        } else {
            return ~arg2 <= -1 && arg2 < var3.field1597.length ? var3.field1597[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public static final void method588(int arg0) {
        class81.field1497 = null;
        class112.field2058 = null;
        client.field587 = null;
        client.field577 = null;
        class202.field3938 = null;
        class169.field3251 = null;
        class116.field2149 = null;
        if (arg0 <= 65) {
            field1854 = null;
        }
        class116.field2147 = null;
        class147.field2704 = null;
        class1.field22 = null;
        class159.field3034 = null;
        ++field1856;
        class167.field3185 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg1.method819((byte) 22);
            if (var4 != 0) {
                this.method589(var4, -25);
            } else {
                this.field1852 = new int[arg1.method819((byte) 22)][4];
                for (int var5 = 0; ~var5 > ~this.field1852.length; ++var5) {
                    this.field1852[var5][0] = arg1.method785(true);
                    this.field1852[var5][1] = arg1.method819((byte) 22) << 4;
                    this.field1852[var5][2] = arg1.method819((byte) 22) << 4;
                    this.field1852[var5][3] = arg1.method819((byte) 22) << 4;
                }
            }
        }
        ++field1860;
        int var6 = -18 % ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        if (arg0 != -40) {
            return null;
        } else {
            ++field1855;
            int[][] var3 = super.field1195.method177(arg0 ^ -1167, arg1);
            if (super.field1195.field532) {
                int var4 = this.field1852.length;
                int[] var5 = this.method394(arg0 ^ -20301, 0, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                if (~var4 >= -1) {
                    for (int var9 = 0; class147.field2715 > var9; ++var9) {
                        var6[var9] = 0;
                        var7[var9] = 0;
                        var8[var9] = 0;
                    }
                } else {
                    for (int var10 = 0; class147.field2715 > var10; ++var10) {
                        int var11 = 0;
                        int var12 = var5[var10];
                        for (int var13 = 0; var13 < var4 && var12 >= this.field1852[var13][0]; ++var13) {
                            ++var11;
                        }
                        if (var4 > var11) {
                            int[] var14 = this.field1852[var11];
                            if (~var11 >= -1) {
                                var6[var10] = var14[1];
                                var7[var10] = var14[2];
                                var8[var10] = var14[3];
                            } else {
                                int[] var15 = this.field1852[var11 + -1];
                                int var16 = (-var15[0] + var12 << 12) / (var14[0] - var15[0]);
                                int var17 = -var16 + 4096;
                                var6[var10] = var14[1] * var16 + var15[1] * var17 >> 12;
                                var7[var10] = var14[2] * var16 + var15[2] * var17 >> 12;
                                var8[var10] = var14[3] * var16 + var15[3] * var17 >> 12;
                            }
                        } else {
                            int[] var18 = this.field1852[var4 + -1];
                            var6[var10] = var18[1];
                            var7[var10] = var18[2];
                            var8[var10] = var18[3];
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    private final void method589(int arg0, int arg1) {
        ++field1863;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1852 = new int[4][4];
                                this.field1852[0][3] = 0;
                                this.field1852[0][0] = 2048;
                                this.field1852[1][0] = 2867;
                                this.field1852[0][1] = 0;
                                this.field1852[0][2] = 4096;
                                this.field1852[1][1] = 4096;
                                this.field1852[2][0] = 3276;
                                this.field1852[1][3] = 0;
                                this.field1852[2][1] = 4096;
                                this.field1852[1][2] = 4096;
                                this.field1852[3][1] = 4096;
                                this.field1852[3][0] = 4096;
                                this.field1852[2][3] = 0;
                                this.field1852[3][3] = 0;
                                this.field1852[2][2] = 4096;
                                this.field1852[3][2] = 0;
                            } else {
                                this.field1852 = new int[16][4];
                                this.field1852[0][0] = 0;
                                this.field1852[0][2] = 192;
                                this.field1852[1][0] = 155;
                                this.field1852[0][3] = 321;
                                this.field1852[0][1] = 80;
                                this.field1852[1][3] = 562;
                                this.field1852[1][2] = 449;
                                this.field1852[2][0] = 389;
                                this.field1852[2][2] = 690;
                                this.field1852[3][2] = 995;
                                this.field1852[3][0] = 671;
                                this.field1852[4][0] = 897;
                                this.field1852[5][0] = 1175;
                                this.field1852[2][3] = 803;
                                this.field1852[6][0] = 1368;
                                this.field1852[3][3] = 1140;
                                this.field1852[1][1] = 321;
                                this.field1852[7][0] = 1507;
                                this.field1852[2][1] = 578;
                                this.field1852[4][3] = 1509;
                                this.field1852[3][1] = 947;
                                this.field1852[5][3] = 1413;
                                this.field1852[4][2] = 1397;
                                this.field1852[8][0] = 1736;
                                this.field1852[6][3] = 1333;
                                this.field1852[5][2] = 1429;
                                this.field1852[9][0] = 2088;
                                this.field1852[4][1] = 1285;
                                this.field1852[5][1] = 1525;
                                this.field1852[6][2] = 1461;
                                this.field1852[6][1] = 1734;
                                this.field1852[10][0] = 2355;
                                this.field1852[7][3] = 1702;
                                this.field1852[7][1] = 1413;
                                this.field1852[11][0] = 2691;
                                this.field1852[7][2] = 1525;
                                this.field1852[12][0] = 3031;
                                this.field1852[13][0] = 3522;
                                this.field1852[8][2] = 1590;
                                this.field1852[14][0] = 3727;
                                this.field1852[15][0] = 4096;
                                this.field1852[8][3] = 2056;
                                this.field1852[8][1] = 1108;
                                this.field1852[9][3] = 2666;
                                this.field1852[9][1] = 1766;
                                this.field1852[10][1] = 2409;
                                this.field1852[11][1] = 3116;
                                this.field1852[12][1] = 3806;
                                this.field1852[10][3] = 3276;
                                this.field1852[9][2] = 2056;
                                this.field1852[13][1] = 3437;
                                this.field1852[10][2] = 2586;
                                this.field1852[14][1] = 3116;
                                this.field1852[11][3] = 3228;
                                this.field1852[15][1] = 2377;
                                this.field1852[11][2] = 3148;
                                this.field1852[12][2] = 3710;
                                this.field1852[12][3] = 3196;
                                this.field1852[13][3] = 3019;
                                this.field1852[14][3] = 3228;
                                this.field1852[13][2] = 3421;
                                this.field1852[15][3] = 2746;
                                this.field1852[14][2] = 3148;
                                this.field1852[15][2] = 2505;
                            }
                        } else {
                            this.field1852 = new int[6][4];
                            this.field1852[0][2] = 0;
                            this.field1852[0][3] = 0;
                            this.field1852[1][3] = 1493;
                            this.field1852[0][1] = 0;
                            this.field1852[1][1] = 0;
                            this.field1852[2][1] = 0;
                            this.field1852[2][3] = 2939;
                            this.field1852[3][3] = 3565;
                            this.field1852[0][0] = 0;
                            this.field1852[1][2] = 0;
                            this.field1852[1][0] = 1843;
                            this.field1852[4][3] = 4031;
                            this.field1852[2][2] = 0;
                            this.field1852[3][2] = 1124;
                            this.field1852[5][3] = 4096;
                            this.field1852[2][0] = 2457;
                            this.field1852[4][2] = 3084;
                            this.field1852[5][2] = 4096;
                            this.field1852[3][0] = 2781;
                            this.field1852[3][1] = 0;
                            this.field1852[4][0] = 3481;
                            this.field1852[4][1] = 546;
                            this.field1852[5][0] = 4096;
                            this.field1852[5][1] = 4096;
                        }
                    } else {
                        this.field1852 = new int[7][4];
                        this.field1852[0][2] = 0;
                        this.field1852[0][0] = 0;
                        this.field1852[1][2] = 4096;
                        this.field1852[2][2] = 4096;
                        this.field1852[0][1] = 0;
                        this.field1852[0][3] = 4096;
                        this.field1852[3][2] = 4096;
                        this.field1852[1][3] = 4096;
                        this.field1852[1][1] = 0;
                        this.field1852[4][2] = 0;
                        this.field1852[5][2] = 0;
                        this.field1852[1][0] = 663;
                        this.field1852[6][2] = 0;
                        this.field1852[2][0] = 1363;
                        this.field1852[2][3] = 0;
                        this.field1852[3][3] = 0;
                        this.field1852[3][0] = 2048;
                        this.field1852[4][0] = 2727;
                        this.field1852[5][0] = 3411;
                        this.field1852[6][0] = 4096;
                        this.field1852[4][3] = 0;
                        this.field1852[5][3] = 4096;
                        this.field1852[2][1] = 0;
                        this.field1852[3][1] = 4096;
                        this.field1852[4][1] = 4096;
                        this.field1852[5][1] = 4096;
                        this.field1852[6][3] = 4096;
                        this.field1852[6][1] = 0;
                    }
                } else {
                    this.field1852 = new int[8][4];
                    this.field1852[0][0] = 0;
                    this.field1852[0][3] = 2361;
                    this.field1852[1][3] = 1558;
                    this.field1852[0][2] = 2602;
                    this.field1852[0][1] = 2650;
                    this.field1852[1][2] = 1799;
                    this.field1852[1][0] = 2867;
                    this.field1852[1][1] = 2313;
                    this.field1852[2][0] = 3072;
                    this.field1852[2][3] = 1413;
                    this.field1852[3][0] = 3276;
                    this.field1852[4][0] = 3481;
                    this.field1852[5][0] = 3686;
                    this.field1852[2][2] = 1734;
                    this.field1852[3][2] = 1220;
                    this.field1852[4][2] = 963;
                    this.field1852[3][3] = 947;
                    this.field1852[6][0] = 3891;
                    this.field1852[7][0] = 4096;
                    this.field1852[5][2] = 2152;
                    this.field1852[2][1] = 2618;
                    this.field1852[4][3] = 722;
                    this.field1852[3][1] = 2296;
                    this.field1852[5][3] = 1766;
                    this.field1852[4][1] = 2072;
                    this.field1852[5][1] = 2730;
                    this.field1852[6][2] = 1060;
                    this.field1852[6][3] = 915;
                    this.field1852[7][3] = 1140;
                    this.field1852[6][1] = 2232;
                    this.field1852[7][2] = 1413;
                    this.field1852[7][1] = 1686;
                }
            } else {
                this.field1852 = new int[2][4];
                this.field1852[0][1] = 0;
                this.field1852[0][2] = 0;
                this.field1852[1][1] = 4096;
                this.field1852[0][0] = 0;
                this.field1852[1][2] = 4096;
                this.field1852[0][3] = 0;
                this.field1852[1][0] = 4096;
                this.field1852[1][3] = 4096;
            }
        }
        int var4 = -43 / ((arg1 - 46) / 50);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        ++field1851;
        if (!arg0) {
            if (this.field1852 == null) {
                this.method589(1, -38);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1857 = null;
        field1862 = null;
        int var1 = -47 / ((arg0 - 6) / 49);
        field1847 = null;
        field1854 = null;
        field1848 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method591(byte arg0) {
        ++field1853;
        if (arg0 < -99) {
            for (class205 var1 = (class205) class70.field1311.method145(0); var1 != null; var1 = (class205) class70.field1311.method152((byte) -126)) {
                if (var1.field4015 != null) {
                    var1.method1330(-111);
                }
            }
        }
    }
}
