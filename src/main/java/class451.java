import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class451 extends class330 {

    @OriginalMember(owner = "client!cja", name = "I", descriptor = "[I")
    private int[] field6297 = new int[257];

    @OriginalMember(owner = "client!cja", name = "H", descriptor = "[[I")
    public static int[][] field6296 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cja", name = "C", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!cja", name = "D", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!cja", name = "E", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!cja", name = "F", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!cja", name = "J", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!cja", name = "L", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!cja", name = "K", descriptor = "[[I")
    private int[][] field6299;

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V", line = 4)
    public class451() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(II)V", line = 12)
    private final void method2723(int arg0, int arg1) {
        ++field6294;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6299 = new int[4][4];
                                this.field6299[0][3] = 0;
                                this.field6299[0][1] = 0;
                                this.field6299[0][2] = 4096;
                                this.field6299[0][0] = 2048;
                                this.field6299[1][0] = 2867;
                                this.field6299[1][2] = 4096;
                                this.field6299[1][3] = 0;
                                this.field6299[1][1] = 4096;
                                this.field6299[2][0] = 3276;
                                this.field6299[2][3] = 0;
                                this.field6299[2][2] = 4096;
                                this.field6299[2][1] = 4096;
                                this.field6299[3][2] = 0;
                                this.field6299[3][3] = 0;
                                this.field6299[3][0] = 4096;
                                this.field6299[3][1] = 4096;
                            } else {
                                this.field6299 = new int[16][4];
                                this.field6299[0][0] = 0;
                                this.field6299[0][1] = 80;
                                this.field6299[0][3] = 321;
                                this.field6299[0][2] = 192;
                                this.field6299[1][0] = 155;
                                this.field6299[1][3] = 562;
                                this.field6299[1][2] = 449;
                                this.field6299[1][1] = 321;
                                this.field6299[2][3] = 803;
                                this.field6299[2][1] = 578;
                                this.field6299[2][0] = 389;
                                this.field6299[2][2] = 690;
                                this.field6299[3][1] = 947;
                                this.field6299[3][3] = 1140;
                                this.field6299[3][0] = 671;
                                this.field6299[3][2] = 995;
                                this.field6299[4][0] = 897;
                                this.field6299[4][2] = 1397;
                                this.field6299[4][1] = 1285;
                                this.field6299[4][3] = 1509;
                                this.field6299[5][0] = 1175;
                                this.field6299[5][1] = 1525;
                                this.field6299[5][2] = 1429;
                                this.field6299[5][3] = 1413;
                                this.field6299[6][3] = 1333;
                                this.field6299[6][0] = 1368;
                                this.field6299[6][1] = 1734;
                                this.field6299[6][2] = 1461;
                                this.field6299[7][0] = 1507;
                                this.field6299[7][3] = 1702;
                                this.field6299[7][1] = 1413;
                                this.field6299[7][2] = 1525;
                                this.field6299[8][1] = 1108;
                                this.field6299[8][2] = 1590;
                                this.field6299[8][0] = 1736;
                                this.field6299[8][3] = 2056;
                                this.field6299[9][1] = 1766;
                                this.field6299[9][3] = 2666;
                                this.field6299[9][2] = 2056;
                                this.field6299[9][0] = 2088;
                                this.field6299[10][0] = 2355;
                                this.field6299[10][1] = 2409;
                                this.field6299[10][2] = 2586;
                                this.field6299[10][3] = 3276;
                                this.field6299[11][1] = 3116;
                                this.field6299[11][0] = 2691;
                                this.field6299[11][3] = 3228;
                                this.field6299[11][2] = 3148;
                                this.field6299[12][0] = 3031;
                                this.field6299[12][1] = 3806;
                                this.field6299[12][2] = 3710;
                                this.field6299[12][3] = 3196;
                                this.field6299[13][0] = 3522;
                                this.field6299[13][1] = 3437;
                                this.field6299[13][3] = 3019;
                                this.field6299[13][2] = 3421;
                                this.field6299[14][2] = 3148;
                                this.field6299[14][3] = 3228;
                                this.field6299[14][0] = 3727;
                                this.field6299[14][1] = 3116;
                                this.field6299[15][2] = 2505;
                                this.field6299[15][3] = 2746;
                                this.field6299[15][1] = 2377;
                                this.field6299[15][0] = 4096;
                            }
                        } else {
                            this.field6299 = new int[6][4];
                            this.field6299[0][2] = 0;
                            this.field6299[0][0] = 0;
                            this.field6299[0][3] = 0;
                            this.field6299[0][1] = 0;
                            this.field6299[1][3] = 1493;
                            this.field6299[1][2] = 0;
                            this.field6299[1][1] = 0;
                            this.field6299[1][0] = 1843;
                            this.field6299[2][2] = 0;
                            this.field6299[2][0] = 2457;
                            this.field6299[2][1] = 0;
                            this.field6299[2][3] = 2939;
                            this.field6299[3][1] = 0;
                            this.field6299[3][2] = 1124;
                            this.field6299[3][0] = 2781;
                            this.field6299[3][3] = 3565;
                            this.field6299[4][3] = 4031;
                            this.field6299[4][0] = 3481;
                            this.field6299[4][1] = 546;
                            this.field6299[4][2] = 3084;
                            this.field6299[5][0] = 4096;
                            this.field6299[5][1] = 4096;
                            this.field6299[5][3] = 4096;
                            this.field6299[5][2] = 4096;
                        }
                    } else {
                        this.field6299 = new int[7][4];
                        this.field6299[0][2] = 0;
                        this.field6299[0][1] = 0;
                        this.field6299[0][0] = 0;
                        this.field6299[0][3] = 4096;
                        this.field6299[1][3] = 4096;
                        this.field6299[1][1] = 0;
                        this.field6299[1][2] = 4096;
                        this.field6299[1][0] = 663;
                        this.field6299[2][2] = 4096;
                        this.field6299[2][3] = 0;
                        this.field6299[2][1] = 0;
                        this.field6299[2][0] = 1363;
                        this.field6299[3][1] = 4096;
                        this.field6299[3][3] = 0;
                        this.field6299[3][0] = 2048;
                        this.field6299[3][2] = 4096;
                        this.field6299[4][3] = 0;
                        this.field6299[4][0] = 2727;
                        this.field6299[4][1] = 4096;
                        this.field6299[4][2] = 0;
                        this.field6299[5][2] = 0;
                        this.field6299[5][0] = 3411;
                        this.field6299[5][1] = 4096;
                        this.field6299[5][3] = 4096;
                        this.field6299[6][0] = 4096;
                        this.field6299[6][1] = 0;
                        this.field6299[6][3] = 4096;
                        this.field6299[6][2] = 0;
                    }
                } else {
                    this.field6299 = new int[8][4];
                    this.field6299[0][1] = 2650;
                    this.field6299[0][3] = 2361;
                    this.field6299[0][2] = 2602;
                    this.field6299[0][0] = 0;
                    this.field6299[1][2] = 1799;
                    this.field6299[1][3] = 1558;
                    this.field6299[1][0] = 2867;
                    this.field6299[1][1] = 2313;
                    this.field6299[2][3] = 1413;
                    this.field6299[2][2] = 1734;
                    this.field6299[2][0] = 3072;
                    this.field6299[2][1] = 2618;
                    this.field6299[3][2] = 1220;
                    this.field6299[3][0] = 3276;
                    this.field6299[3][3] = 947;
                    this.field6299[3][1] = 2296;
                    this.field6299[4][2] = 963;
                    this.field6299[4][3] = 722;
                    this.field6299[4][1] = 2072;
                    this.field6299[4][0] = 3481;
                    this.field6299[5][0] = 3686;
                    this.field6299[5][3] = 1766;
                    this.field6299[5][2] = 2152;
                    this.field6299[5][1] = 2730;
                    this.field6299[6][3] = 915;
                    this.field6299[6][1] = 2232;
                    this.field6299[6][0] = 3891;
                    this.field6299[6][2] = 1060;
                    this.field6299[7][0] = 4096;
                    this.field6299[7][1] = 1686;
                    this.field6299[7][3] = 1140;
                    this.field6299[7][2] = 1413;
                }
            } else {
                this.field6299 = new int[2][4];
                this.field6299[0][0] = 0;
                this.field6299[0][2] = 0;
                this.field6299[0][3] = 0;
                this.field6299[0][1] = 0;
                this.field6299[1][3] = 4096;
                this.field6299[1][2] = 4096;
                this.field6299[1][0] = 4096;
                this.field6299[1][1] = 4096;
            }
        }
        if (arg0 <= 105) {
            field6296 = null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V", line = 263)
    public static void method2724(int arg0) {
        if (arg0 <= 94) {
            field6296 = null;
        }
        field6296 = null;
    }

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "(B)V", line = 274)
    public final void method653(byte arg0) {
        if (this.field6299 == null) {
            this.method2723(111, 1);
        }
        int var2 = 64 % ((arg0 - 50) / 41);
        ++field6295;
        this.method2725((byte) 90);
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(II)[[I", line = 288)
    public final int[][] method537(int arg0, int arg1) {
        ++field6298;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            this.field6299 = null;
        }
        if (super.field4621.field3510) {
            int[] var4 = this.method2084(0, arg1, (byte) 99);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class80.field901 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field6297[var9];
                var5[var8] = class407.method2490(var10, 16711680) >> 12;
                var6[var8] = class407.method2490(var10, 65280) >> 4;
                var7[var8] = class407.method2490(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "(B)V", line = 338)
    private final void method2725(byte arg0) {
        ++field6293;
        if (arg0 == 90) {
            int var2 = this.field6299.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field6299[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 <= var4) {
                        int[] var7 = this.field6299[var2 + -1];
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field6299[var4];
                        if (~var4 < -1) {
                            int[] var12 = this.field6299[var4 + -1];
                            int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var9 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                            var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        } else {
                            var10 = var11[3];
                            var9 = var11[2];
                            var8 = var11[1];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field6297[var3] = class613.method3544(var17, class613.method3544(var16 << 16, var15 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lgga;IB)V", line = 442)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method3013(41);
            if (~var4 == -1) {
                this.field6299 = new int[arg0.method3013(-104)][4];
                for (int var5 = 0; var5 < this.field6299.length; ++var5) {
                    this.field6299[var5][0] = arg0.method3002(-1);
                    this.field6299[var5][1] = arg0.method3013(16) << 4;
                    this.field6299[var5][2] = arg0.method3013(-95) << 4;
                    this.field6299[var5][3] = arg0.method3013(113) << 4;
                }
            } else {
                this.method2723(122, var4);
            }
        }
        int var6 = -25 / ((-41 - arg2) / 42);
        ++field6292;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(III[BIII[BI)V", line = 494)
    public static final void method2726(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field6300;
        int var9 = -(arg6 >> 2);
        int var10 = -(3 & arg6);
        int var11 = -128 % ((44 - arg4) / 54);
        for (int var12 = -arg0; var12 < 0; ++var12) {
            int var10001;
            for (int var13 = var9; ~var13 > -1; ++var13) {
                var10001 = arg5++;
                arg3[var10001] = (byte) (arg3[var10001] + -arg7[arg2++]);
                int var15 = arg5++;
                arg3[var15] = (byte) (arg3[var15] + -arg7[arg2++]);
                int var16 = arg5++;
                arg3[var16] = (byte) (arg3[var16] + -arg7[arg2++]);
                int var17 = arg5++;
                arg3[var17] = (byte) (arg3[var17] + -arg7[arg2++]);
            }
            for (int var14 = var10; ~var14 > -1; ++var14) {
                var10001 = arg5++;
                arg3[var10001] = (byte) (arg3[var10001] + -arg7[arg2++]);
            }
            arg2 += arg8;
            arg5 += arg1;
        }
    }
}
