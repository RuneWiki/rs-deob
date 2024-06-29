import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class248 extends class202 {

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "[I")
    private int[] field4035 = new int[257];

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "B")
    public static byte field4033;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "[[I")
    private int[][] field4030;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method1445(-85);
            if (~var4 == -1) {
                this.field4030 = new int[arg0.method1445(-106)][4];
                for (int var5 = 0; ~this.field4030.length < ~var5; ++var5) {
                    this.field4030[var5][0] = arg0.method1455(-3387);
                    this.field4030[var5][1] = arg0.method1445(-112) << 4;
                    this.field4030[var5][2] = arg0.method1445(76) << 4;
                    this.field4030[var5][3] = arg0.method1445(60) << 4;
                }
            } else {
                this.method1715((byte) -67, var4);
            }
        }
        ++field4036;
        int var6 = -116 % ((-46 - arg1) / 50);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field4030 == null) {
            this.method1715((byte) -67, 1);
        }
        ++field4032;
        int var2 = -115 / ((arg0 - 80) / 46);
        this.method1716(false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
    private final void method1715(byte arg0, int arg1) {
        if (arg0 != -67) {
            field4033 = -65;
        }
        ++field4028;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4030 = new int[4][4];
                                    this.field4030[0][2] = 4096;
                                    this.field4030[0][0] = 2048;
                                    this.field4030[0][1] = 0;
                                    this.field4030[0][3] = 0;
                                    this.field4030[1][3] = 0;
                                    this.field4030[1][1] = 4096;
                                    this.field4030[1][0] = 2867;
                                    this.field4030[1][2] = 4096;
                                    this.field4030[2][1] = 4096;
                                    this.field4030[2][3] = 0;
                                    this.field4030[2][2] = 4096;
                                    this.field4030[2][0] = 3276;
                                    this.field4030[3][1] = 4096;
                                    this.field4030[3][0] = 4096;
                                    this.field4030[3][2] = 0;
                                    this.field4030[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4030 = new int[16][4];
                                this.field4030[0][0] = 0;
                                this.field4030[0][2] = 192;
                                this.field4030[0][1] = 80;
                                this.field4030[0][3] = 321;
                                this.field4030[1][3] = 562;
                                this.field4030[1][0] = 155;
                                this.field4030[1][1] = 321;
                                this.field4030[1][2] = 449;
                                this.field4030[2][1] = 578;
                                this.field4030[2][3] = 803;
                                this.field4030[2][0] = 389;
                                this.field4030[2][2] = 690;
                                this.field4030[3][0] = 671;
                                this.field4030[3][1] = 947;
                                this.field4030[3][3] = 1140;
                                this.field4030[3][2] = 995;
                                this.field4030[4][1] = 1285;
                                this.field4030[4][3] = 1509;
                                this.field4030[4][2] = 1397;
                                this.field4030[4][0] = 897;
                                this.field4030[5][3] = 1413;
                                this.field4030[5][2] = 1429;
                                this.field4030[5][0] = 1175;
                                this.field4030[5][1] = 1525;
                                this.field4030[6][2] = 1461;
                                this.field4030[6][0] = 1368;
                                this.field4030[6][1] = 1734;
                                this.field4030[6][3] = 1333;
                                this.field4030[7][3] = 1702;
                                this.field4030[7][0] = 1507;
                                this.field4030[7][1] = 1413;
                                this.field4030[7][2] = 1525;
                                this.field4030[8][1] = 1108;
                                this.field4030[8][2] = 1590;
                                this.field4030[8][3] = 2056;
                                this.field4030[8][0] = 1736;
                                this.field4030[9][3] = 2666;
                                this.field4030[9][2] = 2056;
                                this.field4030[9][0] = 2088;
                                this.field4030[9][1] = 1766;
                                this.field4030[10][3] = 3276;
                                this.field4030[10][0] = 2355;
                                this.field4030[10][2] = 2586;
                                this.field4030[10][1] = 2409;
                                this.field4030[11][2] = 3148;
                                this.field4030[11][0] = 2691;
                                this.field4030[11][1] = 3116;
                                this.field4030[11][3] = 3228;
                                this.field4030[12][1] = 3806;
                                this.field4030[12][3] = 3196;
                                this.field4030[12][0] = 3031;
                                this.field4030[12][2] = 3710;
                                this.field4030[13][3] = 3019;
                                this.field4030[13][2] = 3421;
                                this.field4030[13][1] = 3437;
                                this.field4030[13][0] = 3522;
                                this.field4030[14][2] = 3148;
                                this.field4030[14][1] = 3116;
                                this.field4030[14][3] = 3228;
                                this.field4030[14][0] = 3727;
                                this.field4030[15][1] = 2377;
                                this.field4030[15][3] = 2746;
                                this.field4030[15][2] = 2505;
                                this.field4030[15][0] = 4096;
                            }
                        } else {
                            this.field4030 = new int[6][4];
                            this.field4030[0][0] = 0;
                            this.field4030[0][2] = 0;
                            this.field4030[0][3] = 0;
                            this.field4030[0][1] = 0;
                            this.field4030[1][3] = 1493;
                            this.field4030[1][1] = 0;
                            this.field4030[1][0] = 1843;
                            this.field4030[1][2] = 0;
                            this.field4030[2][1] = 0;
                            this.field4030[2][0] = 2457;
                            this.field4030[2][3] = 2939;
                            this.field4030[2][2] = 0;
                            this.field4030[3][0] = 2781;
                            this.field4030[3][3] = 3565;
                            this.field4030[3][1] = 0;
                            this.field4030[3][2] = 1124;
                            this.field4030[4][2] = 3084;
                            this.field4030[4][3] = 4031;
                            this.field4030[4][0] = 3481;
                            this.field4030[4][1] = 546;
                            this.field4030[5][1] = 4096;
                            this.field4030[5][0] = 4096;
                            this.field4030[5][3] = 4096;
                            this.field4030[5][2] = 4096;
                        }
                    } else {
                        this.field4030 = new int[7][4];
                        this.field4030[0][2] = 0;
                        this.field4030[0][3] = 4096;
                        this.field4030[0][1] = 0;
                        this.field4030[0][0] = 0;
                        this.field4030[1][2] = 4096;
                        this.field4030[1][0] = 663;
                        this.field4030[1][1] = 0;
                        this.field4030[1][3] = 4096;
                        this.field4030[2][0] = 1363;
                        this.field4030[2][1] = 0;
                        this.field4030[2][3] = 0;
                        this.field4030[2][2] = 4096;
                        this.field4030[3][2] = 4096;
                        this.field4030[3][0] = 2048;
                        this.field4030[3][3] = 0;
                        this.field4030[3][1] = 4096;
                        this.field4030[4][3] = 0;
                        this.field4030[4][2] = 0;
                        this.field4030[4][0] = 2727;
                        this.field4030[4][1] = 4096;
                        this.field4030[5][2] = 0;
                        this.field4030[5][1] = 4096;
                        this.field4030[5][0] = 3411;
                        this.field4030[5][3] = 4096;
                        this.field4030[6][1] = 0;
                        this.field4030[6][3] = 4096;
                        this.field4030[6][0] = 4096;
                        this.field4030[6][2] = 0;
                    }
                } else {
                    this.field4030 = new int[8][4];
                    this.field4030[0][2] = 2602;
                    this.field4030[0][3] = 2361;
                    this.field4030[0][1] = 2650;
                    this.field4030[0][0] = 0;
                    this.field4030[1][1] = 2313;
                    this.field4030[1][3] = 1558;
                    this.field4030[1][0] = 2867;
                    this.field4030[1][2] = 1799;
                    this.field4030[2][2] = 1734;
                    this.field4030[2][0] = 3072;
                    this.field4030[2][3] = 1413;
                    this.field4030[2][1] = 2618;
                    this.field4030[3][1] = 2296;
                    this.field4030[3][3] = 947;
                    this.field4030[3][2] = 1220;
                    this.field4030[3][0] = 3276;
                    this.field4030[4][2] = 963;
                    this.field4030[4][0] = 3481;
                    this.field4030[4][1] = 2072;
                    this.field4030[4][3] = 722;
                    this.field4030[5][3] = 1766;
                    this.field4030[5][2] = 2152;
                    this.field4030[5][0] = 3686;
                    this.field4030[5][1] = 2730;
                    this.field4030[6][3] = 915;
                    this.field4030[6][0] = 3891;
                    this.field4030[6][2] = 1060;
                    this.field4030[6][1] = 2232;
                    this.field4030[7][2] = 1413;
                    this.field4030[7][0] = 4096;
                    this.field4030[7][3] = 1140;
                    this.field4030[7][1] = 1686;
                }
            } else {
                this.field4030 = new int[2][4];
                this.field4030[0][3] = 0;
                this.field4030[0][1] = 0;
                this.field4030[0][0] = 0;
                this.field4030[0][2] = 0;
                this.field4030[1][1] = 4096;
                this.field4030[1][2] = 4096;
                this.field4030[1][0] = 4096;
                this.field4030[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Z)V")
    private final void method1716(boolean arg0) {
        if (arg0) {
            this.method51(-59);
        }
        ++field4029;
        int var2 = this.field4030.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field4030[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field4030[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field4030[var4];
                    if (var4 <= 0) {
                        var9 = var11[3];
                        var8 = var11[2];
                        var10 = var11[1];
                    } else {
                        int[] var12 = this.field4030[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                int var17 = var8 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field4035[var3] = class410.method2621(class410.method2621(var17 << 8, var16 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field4027;
        int[][] var3 = super.field3081.method1050(arg1, -53);
        if (super.field3081.field2432) {
            int[] var4 = this.method1376(arg0 ^ -1046794077, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class276.field4375; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4035[var9];
                var5[var8] = class272.method1842(var10 >> 12, 4080);
                var6[var8] = class272.method1842(var10 >> 4, 4080);
                var7[var8] = class272.method1842(var10 << 4, 4080);
            }
        }
        return arg0 != -1 ? null : var3;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
    public static final void method1717(int arg0, int arg1) {
        class231.field3825.method2202(arg1 ^ arg1, arg0);
        ++field4034;
        class457.field7046.method2202(0, arg0);
        class34.field344.method2202(0, arg0);
        class81.field1196.method2202(0, arg0);
        class434.field6553.method2202(0, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public static final void method1718(byte arg0) {
        ++field4026;
        if (arg0 != 13) {
            field4033 = 14;
        }
        int var1 = (int) ((double) class135.field1839 * 34.46D);
        int var2 = var1 << 0;
        if (class19.field198.method1275()) {
            var2 += 128;
        }
        class19.field198.method1257(50, var2);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Lec;")
    public static final class68 method1719(int arg0) {
        ++field4031;
        class24.field268 = 0;
        return arg0 != 2 ? null : class295.method1980((byte) -40);
    }
}
