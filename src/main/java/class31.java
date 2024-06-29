import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class31 extends class99 {

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "[I")
    private int[] field469 = new int[257];

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field463 = -1;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "Lr;")
    private static class66 field458 = class93.method641(43, "Starting 3d library");

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "[I")
    public static int[] field470 = new int[32];

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "Lr;")
    public static class66 field475 = field458;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "[I")
    public static int[] field465 = new int[4096];

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "Lff;")
    public static class241 field461;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "[[I")
    private int[][] field457;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "[[Lha;")
    public static class63[][] field466;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field464;
        if (arg0 >= -22) {
            method177(-65, 21, -105);
        }
        if (this.field457 == null) {
            this.method175(false, 1);
        }
        this.method178(3);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field471;
            int[][] var3 = super.field1946.method823(arg0, (byte) -122);
            if (super.field1946.field2297) {
                int[] var4 = this.method682(0, arg0, 29149);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class199.field3432; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field469[var9];
                    var5[var8] = class115.method767(16711680, var10) >> 12;
                    var6[var8] = class115.method767(4080, var10 >> 4);
                    var7[var8] = class115.method767(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILcj;I)Z")
    public static final boolean method174(int arg0, int arg1, class28 arg2, int arg3) {
        ++field456;
        byte[] var4 = arg2.method135(arg3, arg0 ^ arg0, arg1);
        if (var4 == null) {
            return false;
        } else {
            class144.method991(arg0 + 43813, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
    private final void method175(boolean arg0, int arg1) {
        if (arg0) {
            field461 = null;
        }
        ++field468;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field457 = new int[4][4];
                                    this.field457[0][2] = 4096;
                                    this.field457[0][0] = 2048;
                                    this.field457[1][0] = 2867;
                                    this.field457[2][0] = 3276;
                                    this.field457[0][1] = 0;
                                    this.field457[1][2] = 4096;
                                    this.field457[0][3] = 0;
                                    this.field457[2][2] = 4096;
                                    this.field457[3][2] = 0;
                                    this.field457[1][1] = 4096;
                                    this.field457[1][3] = 0;
                                    this.field457[3][0] = 4096;
                                    this.field457[2][3] = 0;
                                    this.field457[3][3] = 0;
                                    this.field457[2][1] = 4096;
                                    this.field457[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field457 = new int[16][4];
                                this.field457[0][3] = 321;
                                this.field457[0][2] = 192;
                                this.field457[0][0] = 0;
                                this.field457[1][3] = 562;
                                this.field457[2][3] = 803;
                                this.field457[1][0] = 155;
                                this.field457[1][2] = 449;
                                this.field457[2][2] = 690;
                                this.field457[0][1] = 80;
                                this.field457[3][3] = 1140;
                                this.field457[1][1] = 321;
                                this.field457[2][1] = 578;
                                this.field457[3][1] = 947;
                                this.field457[3][2] = 995;
                                this.field457[2][0] = 389;
                                this.field457[4][3] = 1509;
                                this.field457[4][2] = 1397;
                                this.field457[3][0] = 671;
                                this.field457[4][0] = 897;
                                this.field457[5][3] = 1413;
                                this.field457[4][1] = 1285;
                                this.field457[5][2] = 1429;
                                this.field457[5][1] = 1525;
                                this.field457[5][0] = 1175;
                                this.field457[6][0] = 1368;
                                this.field457[7][0] = 1507;
                                this.field457[6][3] = 1333;
                                this.field457[8][0] = 1736;
                                this.field457[7][3] = 1702;
                                this.field457[6][2] = 1461;
                                this.field457[9][0] = 2088;
                                this.field457[6][1] = 1734;
                                this.field457[10][0] = 2355;
                                this.field457[7][2] = 1525;
                                this.field457[8][3] = 2056;
                                this.field457[9][3] = 2666;
                                this.field457[10][3] = 3276;
                                this.field457[7][1] = 1413;
                                this.field457[8][1] = 1108;
                                this.field457[9][1] = 1766;
                                this.field457[8][2] = 1590;
                                this.field457[11][3] = 3228;
                                this.field457[11][0] = 2691;
                                this.field457[12][3] = 3196;
                                this.field457[13][3] = 3019;
                                this.field457[12][0] = 3031;
                                this.field457[13][0] = 3522;
                                this.field457[14][0] = 3727;
                                this.field457[9][2] = 2056;
                                this.field457[10][2] = 2586;
                                this.field457[15][0] = 4096;
                                this.field457[14][3] = 3228;
                                this.field457[11][2] = 3148;
                                this.field457[12][2] = 3710;
                                this.field457[10][1] = 2409;
                                this.field457[11][1] = 3116;
                                this.field457[15][3] = 2746;
                                this.field457[13][2] = 3421;
                                this.field457[12][1] = 3806;
                                this.field457[14][2] = 3148;
                                this.field457[13][1] = 3437;
                                this.field457[14][1] = 3116;
                                this.field457[15][1] = 2377;
                                this.field457[15][2] = 2505;
                            }
                        } else {
                            this.field457 = new int[6][4];
                            this.field457[0][3] = 0;
                            this.field457[1][3] = 1493;
                            this.field457[0][0] = 0;
                            this.field457[1][0] = 1843;
                            this.field457[2][3] = 2939;
                            this.field457[0][1] = 0;
                            this.field457[2][0] = 2457;
                            this.field457[3][0] = 2781;
                            this.field457[3][3] = 3565;
                            this.field457[4][3] = 4031;
                            this.field457[0][2] = 0;
                            this.field457[4][0] = 3481;
                            this.field457[5][3] = 4096;
                            this.field457[1][1] = 0;
                            this.field457[1][2] = 0;
                            this.field457[2][1] = 0;
                            this.field457[2][2] = 0;
                            this.field457[5][0] = 4096;
                            this.field457[3][2] = 1124;
                            this.field457[3][1] = 0;
                            this.field457[4][1] = 546;
                            this.field457[4][2] = 3084;
                            this.field457[5][1] = 4096;
                            this.field457[5][2] = 4096;
                        }
                    } else {
                        this.field457 = new int[7][4];
                        this.field457[0][2] = 0;
                        this.field457[1][2] = 4096;
                        this.field457[2][2] = 4096;
                        this.field457[0][1] = 0;
                        this.field457[0][0] = 0;
                        this.field457[1][1] = 0;
                        this.field457[0][3] = 4096;
                        this.field457[1][0] = 663;
                        this.field457[3][2] = 4096;
                        this.field457[4][2] = 0;
                        this.field457[5][2] = 0;
                        this.field457[2][1] = 0;
                        this.field457[2][0] = 1363;
                        this.field457[3][1] = 4096;
                        this.field457[3][0] = 2048;
                        this.field457[1][3] = 4096;
                        this.field457[6][2] = 0;
                        this.field457[4][0] = 2727;
                        this.field457[2][3] = 0;
                        this.field457[5][0] = 3411;
                        this.field457[4][1] = 4096;
                        this.field457[5][1] = 4096;
                        this.field457[3][3] = 0;
                        this.field457[6][0] = 4096;
                        this.field457[6][1] = 0;
                        this.field457[4][3] = 0;
                        this.field457[5][3] = 4096;
                        this.field457[6][3] = 4096;
                    }
                } else {
                    this.field457 = new int[8][4];
                    this.field457[0][3] = 2361;
                    this.field457[0][2] = 2602;
                    this.field457[0][0] = 0;
                    this.field457[0][1] = 2650;
                    this.field457[1][2] = 1799;
                    this.field457[1][0] = 2867;
                    this.field457[2][2] = 1734;
                    this.field457[3][2] = 1220;
                    this.field457[1][1] = 2313;
                    this.field457[1][3] = 1558;
                    this.field457[2][1] = 2618;
                    this.field457[4][2] = 963;
                    this.field457[3][1] = 2296;
                    this.field457[5][2] = 2152;
                    this.field457[6][2] = 1060;
                    this.field457[2][0] = 3072;
                    this.field457[2][3] = 1413;
                    this.field457[3][0] = 3276;
                    this.field457[7][2] = 1413;
                    this.field457[3][3] = 947;
                    this.field457[4][3] = 722;
                    this.field457[4][0] = 3481;
                    this.field457[4][1] = 2072;
                    this.field457[5][3] = 1766;
                    this.field457[6][3] = 915;
                    this.field457[5][0] = 3686;
                    this.field457[7][3] = 1140;
                    this.field457[5][1] = 2730;
                    this.field457[6][1] = 2232;
                    this.field457[6][0] = 3891;
                    this.field457[7][1] = 1686;
                    this.field457[7][0] = 4096;
                }
            } else {
                this.field457 = new int[2][4];
                this.field457[0][0] = 0;
                this.field457[0][2] = 0;
                this.field457[1][0] = 4096;
                this.field457[0][3] = 0;
                this.field457[1][3] = 4096;
                this.field457[1][2] = 4096;
                this.field457[0][1] = 0;
                this.field457[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lai;Z)V")
    public static final void method176(class14 arg0, boolean arg1) {
        ++field467;
        long var2 = 0L;
        int var4 = -1;
        if (~arg0.field170 == -1) {
            var2 = class225.method1434(arg0.field173, arg0.field175, arg0.field168);
        }
        if (~arg0.field170 == -2) {
            var2 = method177(arg0.field173, arg0.field175, arg0.field168);
        }
        if (arg1) {
            int var5 = 0;
            int var6 = 0;
            if (arg0.field170 == 2) {
                var2 = class12.method53(arg0.field173, arg0.field175, arg0.field168);
            }
            if (arg0.field170 == 3) {
                var2 = class86.method612(arg0.field173, arg0.field175, arg0.field168);
            }
            if (~var2 != -1L) {
                var6 = 3 & (int) var2 >> 20;
                var5 = (519242 & (int) var2) >> 14;
                var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            }
            arg0.field172 = var4;
            arg0.field167 = var5;
            arg0.field177 = var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(III)J")
    public static final long method177(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 != null && var3.field212 != null ? var3.field212.field2390 : 0L;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V")
    private final void method178(int arg0) {
        ++field462;
        if (arg0 != 3) {
            this.field469 = null;
        }
        int var2 = this.field457.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field457[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field457[var4];
                    if (~var4 >= -1) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field457[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field457[var2 + -1];
                    var9 = var14[2];
                    var10 = var14[1];
                    var8 = var14[3];
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var9 >> 4;
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field469[var3] = class73.method521(class73.method521(var17 << 8, var16 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLr;)V")
    public static final void method179(byte arg0, class66 arg1) {
        ++field460;
        if (arg0 == -62) {
            if (class212.field3648 != null) {
                int var2 = 0;
                long var3 = arg1.method479(10908);
                if (~var3 != -1L) {
                    while (~class212.field3648.length < ~var2 && ~class212.field3648[var2].field1560 != ~var3) {
                        ++var2;
                    }
                    if (var2 < class212.field3648.length && class212.field3648[var2] != null) {
                        class28.field412.method578(111, 200);
                        ++class72.field1427;
                        class28.field412.method1651(true, class212.field3648[var2].field1560);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V")
    public static void method180(int arg0) {
        if (arg0 != 0) {
            method177(-69, -77, -25);
        }
        field461 = null;
        field458 = null;
        field465 = null;
        field475 = null;
        field470 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZI)V")
    public static final void method181(int arg0, int arg1, boolean arg2, int arg3) {
        ++field473;
        int var4 = -66 % ((arg3 - -73) / 51);
        if (~arg0 <= -8001 && arg0 <= 48000) {
            class162.field2909 = arg2;
            class173.field3045 = arg1;
            class200.field3446 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            if (arg1 == 0) {
                int var4 = arg0.method1677(-6677);
                if (var4 == 0) {
                    this.field457 = new int[arg0.method1677(arg2 + -6676)][4];
                    for (int var5 = 0; ~this.field457.length < ~var5; ++var5) {
                        this.field457[var5][0] = arg0.method1674(1355769544);
                        this.field457[var5][1] = arg0.method1677(-6677) << 4;
                        this.field457[var5][2] = arg0.method1677(arg2 + -6676) << 4;
                        this.field457[var5][3] = arg0.method1677(-6677) << 4;
                    }
                } else {
                    this.method175(false, var4);
                }
            }
            ++field472;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field465[var0] = class182.method1209(26151, var0);
        }
    }
}
