import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class72 extends class288 {

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "[I")
    private int[] field987 = new int[257];

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field982 = 0;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "Ljj;")
    public static class134 field989;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[[I")
    private int[][] field983;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILjj;)Z")
    public static final boolean method555(byte arg0, int arg1, class134 arg2) {
        ++field986;
        byte[] var3 = arg2.method939(true, arg1);
        if (var3 == null) {
            return false;
        } else {
            int var4 = -84 % ((arg0 - -32) / 49);
            class122.method855((byte) -105, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
    public static final void method556(byte arg0) {
        if (arg0 >= -112) {
            field982 = 68;
        }
        ++field984;
        class219.field3510.method1834(0);
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public static void method557(int arg0) {
        int var1 = -105 % ((71 - arg0) / 43);
        field989 = null;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
    private final void method558(int arg0, int arg1) {
        ++field985;
        if (arg1 >= 121) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field983 = new int[4][4];
                                        this.field983[0][2] = 4096;
                                        this.field983[0][1] = 0;
                                        this.field983[0][3] = 0;
                                        this.field983[1][2] = 4096;
                                        this.field983[0][0] = 2048;
                                        this.field983[2][2] = 4096;
                                        this.field983[3][2] = 0;
                                        this.field983[1][0] = 2867;
                                        this.field983[1][1] = 4096;
                                        this.field983[1][3] = 0;
                                        this.field983[2][0] = 3276;
                                        this.field983[2][1] = 4096;
                                        this.field983[3][0] = 4096;
                                        this.field983[2][3] = 0;
                                        this.field983[3][1] = 4096;
                                        this.field983[3][3] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field983 = new int[16][4];
                                    this.field983[0][3] = 321;
                                    this.field983[0][2] = 192;
                                    this.field983[1][2] = 449;
                                    this.field983[0][1] = 80;
                                    this.field983[0][0] = 0;
                                    this.field983[1][3] = 562;
                                    this.field983[2][2] = 690;
                                    this.field983[2][3] = 803;
                                    this.field983[1][1] = 321;
                                    this.field983[2][1] = 578;
                                    this.field983[1][0] = 155;
                                    this.field983[2][0] = 389;
                                    this.field983[3][2] = 995;
                                    this.field983[3][0] = 671;
                                    this.field983[4][2] = 1397;
                                    this.field983[3][3] = 1140;
                                    this.field983[4][3] = 1509;
                                    this.field983[3][1] = 947;
                                    this.field983[5][2] = 1429;
                                    this.field983[4][1] = 1285;
                                    this.field983[4][0] = 897;
                                    this.field983[5][0] = 1175;
                                    this.field983[5][3] = 1413;
                                    this.field983[6][3] = 1333;
                                    this.field983[6][2] = 1461;
                                    this.field983[7][2] = 1525;
                                    this.field983[7][3] = 1702;
                                    this.field983[8][2] = 1590;
                                    this.field983[9][2] = 2056;
                                    this.field983[10][2] = 2586;
                                    this.field983[6][0] = 1368;
                                    this.field983[5][1] = 1525;
                                    this.field983[6][1] = 1734;
                                    this.field983[8][3] = 2056;
                                    this.field983[7][1] = 1413;
                                    this.field983[8][1] = 1108;
                                    this.field983[7][0] = 1507;
                                    this.field983[9][1] = 1766;
                                    this.field983[8][0] = 1736;
                                    this.field983[9][3] = 2666;
                                    this.field983[10][3] = 3276;
                                    this.field983[10][1] = 2409;
                                    this.field983[11][3] = 3228;
                                    this.field983[12][3] = 3196;
                                    this.field983[13][3] = 3019;
                                    this.field983[14][3] = 3228;
                                    this.field983[15][3] = 2746;
                                    this.field983[11][1] = 3116;
                                    this.field983[12][1] = 3806;
                                    this.field983[9][0] = 2088;
                                    this.field983[13][1] = 3437;
                                    this.field983[14][1] = 3116;
                                    this.field983[15][1] = 2377;
                                    this.field983[11][2] = 3148;
                                    this.field983[12][2] = 3710;
                                    this.field983[10][0] = 2355;
                                    this.field983[13][2] = 3421;
                                    this.field983[11][0] = 2691;
                                    this.field983[12][0] = 3031;
                                    this.field983[13][0] = 3522;
                                    this.field983[14][2] = 3148;
                                    this.field983[14][0] = 3727;
                                    this.field983[15][0] = 4096;
                                    this.field983[15][2] = 2505;
                                }
                            } else {
                                this.field983 = new int[6][4];
                                this.field983[0][2] = 0;
                                this.field983[0][0] = 0;
                                this.field983[0][3] = 0;
                                this.field983[1][2] = 0;
                                this.field983[1][0] = 1843;
                                this.field983[2][0] = 2457;
                                this.field983[1][3] = 1493;
                                this.field983[2][2] = 0;
                                this.field983[3][0] = 2781;
                                this.field983[4][0] = 3481;
                                this.field983[5][0] = 4096;
                                this.field983[2][3] = 2939;
                                this.field983[0][1] = 0;
                                this.field983[1][1] = 0;
                                this.field983[3][3] = 3565;
                                this.field983[4][3] = 4031;
                                this.field983[2][1] = 0;
                                this.field983[5][3] = 4096;
                                this.field983[3][1] = 0;
                                this.field983[3][2] = 1124;
                                this.field983[4][2] = 3084;
                                this.field983[4][1] = 546;
                                this.field983[5][1] = 4096;
                                this.field983[5][2] = 4096;
                            }
                        } else {
                            this.field983 = new int[7][4];
                            this.field983[0][1] = 0;
                            this.field983[0][3] = 4096;
                            this.field983[1][3] = 4096;
                            this.field983[0][0] = 0;
                            this.field983[2][3] = 0;
                            this.field983[0][2] = 0;
                            this.field983[1][0] = 663;
                            this.field983[1][2] = 4096;
                            this.field983[2][2] = 4096;
                            this.field983[1][1] = 0;
                            this.field983[3][2] = 4096;
                            this.field983[2][0] = 1363;
                            this.field983[4][2] = 0;
                            this.field983[5][2] = 0;
                            this.field983[6][2] = 0;
                            this.field983[3][0] = 2048;
                            this.field983[4][0] = 2727;
                            this.field983[3][3] = 0;
                            this.field983[2][1] = 0;
                            this.field983[5][0] = 3411;
                            this.field983[4][3] = 0;
                            this.field983[6][0] = 4096;
                            this.field983[5][3] = 4096;
                            this.field983[6][3] = 4096;
                            this.field983[3][1] = 4096;
                            this.field983[4][1] = 4096;
                            this.field983[5][1] = 4096;
                            this.field983[6][1] = 0;
                        }
                    } else {
                        this.field983 = new int[8][4];
                        this.field983[0][0] = 0;
                        this.field983[0][2] = 2602;
                        this.field983[1][0] = 2867;
                        this.field983[1][2] = 1799;
                        this.field983[0][1] = 2650;
                        this.field983[2][0] = 3072;
                        this.field983[3][0] = 3276;
                        this.field983[0][3] = 2361;
                        this.field983[1][1] = 2313;
                        this.field983[1][3] = 1558;
                        this.field983[2][3] = 1413;
                        this.field983[2][2] = 1734;
                        this.field983[4][0] = 3481;
                        this.field983[5][0] = 3686;
                        this.field983[3][2] = 1220;
                        this.field983[6][0] = 3891;
                        this.field983[4][2] = 963;
                        this.field983[7][0] = 4096;
                        this.field983[3][3] = 947;
                        this.field983[4][3] = 722;
                        this.field983[5][2] = 2152;
                        this.field983[5][3] = 1766;
                        this.field983[6][3] = 915;
                        this.field983[2][1] = 2618;
                        this.field983[3][1] = 2296;
                        this.field983[7][3] = 1140;
                        this.field983[4][1] = 2072;
                        this.field983[6][2] = 1060;
                        this.field983[7][2] = 1413;
                        this.field983[5][1] = 2730;
                        this.field983[6][1] = 2232;
                        this.field983[7][1] = 1686;
                    }
                } else {
                    this.field983 = new int[2][4];
                    this.field983[0][1] = 0;
                    this.field983[0][3] = 0;
                    this.field983[1][3] = 4096;
                    this.field983[0][2] = 0;
                    this.field983[0][0] = 0;
                    this.field983[1][0] = 4096;
                    this.field983[1][2] = 4096;
                    this.field983[1][1] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)V")
    private final void method559(byte arg0) {
        ++field991;
        int var2 = this.field983.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field983[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field983[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field983[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] - var8[0]);
                        int var10 = 4096 - var9;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                    } else {
                        var13 = var7[1];
                        var12 = var7[3];
                        var11 = var7[2];
                    }
                } else {
                    int[] var14 = this.field983[var2 + -1];
                    var12 = var14[3];
                    var11 = var14[2];
                    var13 = var14[1];
                }
                int var15 = var13 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var16 = var12 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var11 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field987[var3] = class45.method348(var16, class45.method348(var15 << 16, var17 << 8));
            }
        }
        if (arg0 != -59) {
            this.method558(-5, 103);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            int[][] var3 = super.field4598.method812(arg1, 65535);
            ++field988;
            if (super.field4598.field1954) {
                int[] var4 = this.method1931((byte) -113, 0, arg1);
                int[] var5 = var3[1];
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                for (int var8 = 0; class186.field2986 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field987[var9];
                    var6[var8] = class204.method1369(var10 >> 12, 4080);
                    var5[var8] = class204.method1369(4080, var10 >> 4);
                    var7[var8] = class204.method1369(var10 << 4, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 == -19) {
            if (~arg2 == -1) {
                int var4 = arg0.method1779(arg1 + -71);
                if (var4 != 0) {
                    this.method558(var4, 127);
                } else {
                    this.field983 = new int[arg0.method1779(-51)][4];
                    for (int var5 = 0; ~this.field983.length < ~var5; ++var5) {
                        this.field983[var5][0] = arg0.method1777(-84);
                        this.field983[var5][1] = arg0.method1779(-93) << 4;
                        this.field983[var5][2] = arg0.method1779(arg1 + -68) << 4;
                        this.field983[var5][3] = arg0.method1779(-59) << 4;
                    }
                }
            }
            ++field992;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        ++field990;
        if (this.field983 == null) {
            this.method558(1, 122);
        }
        if (arg0 == -125) {
            this.method559((byte) -59);
        }
    }
}
