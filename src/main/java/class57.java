import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class57 extends class166 {

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "[I")
    private int[] field1036 = new int[257];

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Lhj;")
    public static class69 field1027 = class181.method1318("Lade Wordpack )2 ", (byte) -109);

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Lhj;")
    private static class69 field1032 = class181.method1318("Prepared sound engine", (byte) -115);

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "Lhj;")
    public static class69 field1028 = field1032;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Z")
    public static volatile boolean field1031 = true;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Z")
    public static boolean field1030 = true;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "[[I")
    private int[][] field1033;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        int var2 = -120 / ((58 - arg0) / 50);
        if (this.field1033 == null) {
            this.method347(4337, 1);
        }
        ++field1035;
        this.method350((byte) -62);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(II)V")
    private final void method347(int arg0, int arg1) {
        ++field1037;
        if (arg0 != 4337) {
            field1030 = false;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field1033 = new int[4][4];
                                    this.field1033[0][2] = 4096;
                                    this.field1033[0][1] = 0;
                                    this.field1033[0][0] = 2048;
                                    this.field1033[1][2] = 4096;
                                    this.field1033[0][3] = 0;
                                    this.field1033[1][3] = 0;
                                    this.field1033[2][3] = 0;
                                    this.field1033[1][0] = 2867;
                                    this.field1033[1][1] = 4096;
                                    this.field1033[2][2] = 4096;
                                    this.field1033[3][2] = 0;
                                    this.field1033[3][3] = 0;
                                    this.field1033[2][1] = 4096;
                                    this.field1033[2][0] = 3276;
                                    this.field1033[3][0] = 4096;
                                    this.field1033[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field1033 = new int[16][4];
                                this.field1033[0][0] = 0;
                                this.field1033[0][3] = 321;
                                this.field1033[1][3] = 562;
                                this.field1033[1][0] = 155;
                                this.field1033[0][1] = 80;
                                this.field1033[1][1] = 321;
                                this.field1033[2][3] = 803;
                                this.field1033[3][3] = 1140;
                                this.field1033[0][2] = 192;
                                this.field1033[2][1] = 578;
                                this.field1033[2][0] = 389;
                                this.field1033[3][0] = 671;
                                this.field1033[4][0] = 897;
                                this.field1033[4][3] = 1509;
                                this.field1033[3][1] = 947;
                                this.field1033[5][3] = 1413;
                                this.field1033[4][1] = 1285;
                                this.field1033[1][2] = 449;
                                this.field1033[5][1] = 1525;
                                this.field1033[5][0] = 1175;
                                this.field1033[6][1] = 1734;
                                this.field1033[2][2] = 690;
                                this.field1033[3][2] = 995;
                                this.field1033[4][2] = 1397;
                                this.field1033[5][2] = 1429;
                                this.field1033[6][2] = 1461;
                                this.field1033[7][1] = 1413;
                                this.field1033[6][3] = 1333;
                                this.field1033[8][1] = 1108;
                                this.field1033[6][0] = 1368;
                                this.field1033[7][3] = 1702;
                                this.field1033[7][0] = 1507;
                                this.field1033[8][3] = 2056;
                                this.field1033[7][2] = 1525;
                                this.field1033[8][0] = 1736;
                                this.field1033[9][3] = 2666;
                                this.field1033[9][0] = 2088;
                                this.field1033[10][0] = 2355;
                                this.field1033[9][1] = 1766;
                                this.field1033[10][1] = 2409;
                                this.field1033[11][0] = 2691;
                                this.field1033[11][1] = 3116;
                                this.field1033[10][3] = 3276;
                                this.field1033[11][3] = 3228;
                                this.field1033[12][0] = 3031;
                                this.field1033[12][1] = 3806;
                                this.field1033[8][2] = 1590;
                                this.field1033[13][0] = 3522;
                                this.field1033[9][2] = 2056;
                                this.field1033[13][1] = 3437;
                                this.field1033[10][2] = 2586;
                                this.field1033[14][0] = 3727;
                                this.field1033[12][3] = 3196;
                                this.field1033[11][2] = 3148;
                                this.field1033[12][2] = 3710;
                                this.field1033[13][2] = 3421;
                                this.field1033[14][2] = 3148;
                                this.field1033[15][2] = 2505;
                                this.field1033[13][3] = 3019;
                                this.field1033[15][0] = 4096;
                                this.field1033[14][1] = 3116;
                                this.field1033[15][1] = 2377;
                                this.field1033[14][3] = 3228;
                                this.field1033[15][3] = 2746;
                            }
                        } else {
                            this.field1033 = new int[6][4];
                            this.field1033[0][1] = 0;
                            this.field1033[0][0] = 0;
                            this.field1033[0][3] = 0;
                            this.field1033[0][2] = 0;
                            this.field1033[1][2] = 0;
                            this.field1033[1][0] = 1843;
                            this.field1033[2][0] = 2457;
                            this.field1033[2][2] = 0;
                            this.field1033[3][0] = 2781;
                            this.field1033[4][0] = 3481;
                            this.field1033[3][2] = 1124;
                            this.field1033[1][3] = 1493;
                            this.field1033[4][2] = 3084;
                            this.field1033[1][1] = 0;
                            this.field1033[2][3] = 2939;
                            this.field1033[5][0] = 4096;
                            this.field1033[5][2] = 4096;
                            this.field1033[3][3] = 3565;
                            this.field1033[2][1] = 0;
                            this.field1033[3][1] = 0;
                            this.field1033[4][3] = 4031;
                            this.field1033[4][1] = 546;
                            this.field1033[5][3] = 4096;
                            this.field1033[5][1] = 4096;
                        }
                    } else {
                        this.field1033 = new int[7][4];
                        this.field1033[0][1] = 0;
                        this.field1033[0][2] = 0;
                        this.field1033[1][2] = 4096;
                        this.field1033[0][0] = 0;
                        this.field1033[2][2] = 4096;
                        this.field1033[1][0] = 663;
                        this.field1033[0][3] = 4096;
                        this.field1033[1][1] = 0;
                        this.field1033[3][2] = 4096;
                        this.field1033[2][0] = 1363;
                        this.field1033[4][2] = 0;
                        this.field1033[2][1] = 0;
                        this.field1033[3][0] = 2048;
                        this.field1033[1][3] = 4096;
                        this.field1033[3][1] = 4096;
                        this.field1033[2][3] = 0;
                        this.field1033[4][1] = 4096;
                        this.field1033[3][3] = 0;
                        this.field1033[4][3] = 0;
                        this.field1033[5][3] = 4096;
                        this.field1033[5][1] = 4096;
                        this.field1033[4][0] = 2727;
                        this.field1033[5][0] = 3411;
                        this.field1033[5][2] = 0;
                        this.field1033[6][0] = 4096;
                        this.field1033[6][3] = 4096;
                        this.field1033[6][2] = 0;
                        this.field1033[6][1] = 0;
                    }
                } else {
                    this.field1033 = new int[8][4];
                    this.field1033[0][3] = 2361;
                    this.field1033[1][3] = 1558;
                    this.field1033[0][1] = 2650;
                    this.field1033[2][3] = 1413;
                    this.field1033[3][3] = 947;
                    this.field1033[4][3] = 722;
                    this.field1033[0][2] = 2602;
                    this.field1033[5][3] = 1766;
                    this.field1033[0][0] = 0;
                    this.field1033[1][2] = 1799;
                    this.field1033[2][2] = 1734;
                    this.field1033[1][1] = 2313;
                    this.field1033[3][2] = 1220;
                    this.field1033[6][3] = 915;
                    this.field1033[4][2] = 963;
                    this.field1033[2][1] = 2618;
                    this.field1033[3][1] = 2296;
                    this.field1033[5][2] = 2152;
                    this.field1033[1][0] = 2867;
                    this.field1033[4][1] = 2072;
                    this.field1033[5][1] = 2730;
                    this.field1033[6][2] = 1060;
                    this.field1033[6][1] = 2232;
                    this.field1033[7][3] = 1140;
                    this.field1033[2][0] = 3072;
                    this.field1033[3][0] = 3276;
                    this.field1033[4][0] = 3481;
                    this.field1033[7][2] = 1413;
                    this.field1033[5][0] = 3686;
                    this.field1033[6][0] = 3891;
                    this.field1033[7][0] = 4096;
                    this.field1033[7][1] = 1686;
                }
            } else {
                this.field1033 = new int[2][4];
                this.field1033[0][1] = 0;
                this.field1033[0][2] = 0;
                this.field1033[1][2] = 4096;
                this.field1033[0][3] = 0;
                this.field1033[1][1] = 4096;
                this.field1033[0][0] = 0;
                this.field1033[1][0] = 4096;
                this.field1033[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILfh;)V")
    public static final void method348(int arg0, class128 arg1) {
        if (arg0 != 3) {
            method351(71, (byte) 61, -84);
        }
        ++field1038;
        while (true) {
            while (~arg1.field2385.length < ~arg1.field2379) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (~arg1.method937(false) == -2) {
                    var3 = arg1.method937(false);
                    var2 = arg1.method937(false);
                    var4 = true;
                }
                int var5 = arg1.method937(false);
                int var6 = arg1.method937(false);
                int var7 = var5 * 64 - class250.field4539;
                int var8 = class209.field3806 - var6 * 64 + (class22.field306 - 1);
                if (~var7 <= -1 && ~(var8 + -63) <= -1 && ~class84.field1626 < ~(var7 + 63) && ~class22.field306 < ~var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var4 || var3 * 8 <= var11 && var3 * 8 - -8 > var11 && ~(var2 * 8) >= ~var12 && ~(var2 * 8 + 8) < ~var12) {
                                byte var13 = arg1.method950(1495791448);
                                if (~var13 != -1) {
                                    if (class114.field2182[var9][var10] == null) {
                                        class114.field2182[var9][var10] = new byte[4096];
                                    }
                                    class114.field2182[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                    byte var14 = arg1.method950(1495791448);
                                    if (class65.field1260[var9][var10] == null) {
                                        class65.field1260[var9][var10] = new byte[4096];
                                    }
                                    class65.field1260[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; (!var4 ? 4096 : 64) > var15; ++var15) {
                        byte var16 = arg1.method950(1495791448);
                        if (~var16 != -1) {
                            ++arg1.field2379;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static void method349(int arg0) {
        if (arg0 != 449) {
            method348(-87, (class128) null);
        }
        field1027 = null;
        field1028 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg1.method937(false);
            if (~var4 == -1) {
                this.field1033 = new int[arg1.method937(false)][4];
                for (int var5 = 0; ~this.field1033.length < ~var5; ++var5) {
                    this.field1033[var5][0] = arg1.method912(60);
                    this.field1033[var5][1] = arg1.method937(false) << 4;
                    this.field1033[var5][2] = arg1.method937(false) << 4;
                    this.field1033[var5][3] = arg1.method937(false) << 4;
                }
            } else {
                this.method347(4337, var4);
            }
        }
        ++field1039;
        if (arg0 != 96) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    private final void method350(byte arg0) {
        ++field1029;
        if (arg0 == -62) {
            int var2 = this.field1033.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && ~var5 <= ~this.field1033[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 > var4) {
                        int[] var7 = this.field1033[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[3];
                            var10 = var7[1];
                        } else {
                            int[] var11 = this.field1033[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                            var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field1033[var2 + -1];
                        var10 = var14[1];
                        var9 = var14[3];
                        var8 = var14[2];
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    if (~var16 <= -1) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = var8 >> 4;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field1036[var3] = class230.method1644(class230.method1644(var16 << 16, var17 << 8), var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            field1030 = true;
        }
        ++field1026;
        int[][] var3 = super.field3064.method320(arg1, (byte) -75);
        if (super.field3064.field979) {
            int[] var4 = this.method1231(124, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class253.field4565 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1036[var9];
                var5[var8] = class69.method443(4080, var10 >> 12);
                var6[var8] = class69.method443(var10, 65280) >> 4;
                var7[var8] = class69.method443(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)I")
    public static final int method351(int arg0, byte arg1, int arg2) {
        int var3 = -10 % ((67 - arg1) / 43);
        class65 var4 = (class65) class4.field25.method769(true, (long) arg0);
        ++field1034;
        if (var4 == null) {
            return -1;
        } else {
            return arg2 >= 0 && ~arg2 > ~var4.field1261.length ? var4.field1261[arg2] : -1;
        }
    }
}
