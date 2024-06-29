import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class404 extends class585 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
    private int[] field5529 = new int[257];

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
    public static boolean field5525 = false;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "Z")
    public static boolean field5531 = false;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "Lbu;")
    public static class21 field5523 = new class21(30, 6);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "[[I")
    private int[][] field5524;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 5)
    private final void method2482(int arg0) {
        if (arg0 != -1) {
            this.field5524 = null;
        }
        ++field5526;
        int var2 = this.field5524.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && this.field5524[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field5524[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field5524[var4];
                    if (var4 <= 0) {
                        var10 = var11[2];
                        var9 = var11[1];
                        var8 = var11[3];
                    } else {
                        int[] var12 = this.field5524[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field5529[var3] = class746.method4158(var15, class746.method4158(var17 << 16, var16 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)[[I", line = 111)
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            method2484(-106);
        }
        ++field5521;
        int[][] var3 = super.field8265.method1576((byte) 119, arg1);
        if (super.field8265.field3546) {
            int[] var4 = this.method3415(-127, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class293.field4278 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field5529[var9];
                var5[var8] = class702.method3977(var10, 16711680) >> 12;
                var6[var8] = class702.method3977(4080, var10 >> 4);
                var7[var8] = class702.method3977(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lwn;IIIILha;IIIIII)V", line = 170)
    public static final void method2483(class753 arg0, int arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (~arg3 > ~arg10 && ~arg10 > ~(arg3 + arg7) && arg4 > arg11 + -13 && ~arg4 > ~(arg11 + 3)) {
            arg9 = arg6;
        }
        if (arg2 == 1) {
            ++field5532;
            String var12 = class313.method2010(arg0, -120);
            class269.field3907.method570(arg9, class569.field8030, class132.field1980, arg11, -112, 0, var12, arg3 + 3);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 187)
    public static void method2484(int arg0) {
        if (arg0 == 11) {
            field5523 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 201)
    public class404() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)V", line = 204)
    private final void method2485(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method2485(81, -90);
        }
        ++field5533;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field5524 = new int[4][4];
                                    this.field5524[0][1] = 0;
                                    this.field5524[0][2] = 4096;
                                    this.field5524[0][3] = 0;
                                    this.field5524[0][0] = 2048;
                                    this.field5524[1][3] = 0;
                                    this.field5524[1][2] = 4096;
                                    this.field5524[1][1] = 4096;
                                    this.field5524[1][0] = 2867;
                                    this.field5524[2][1] = 4096;
                                    this.field5524[2][2] = 4096;
                                    this.field5524[2][0] = 3276;
                                    this.field5524[2][3] = 0;
                                    this.field5524[3][3] = 0;
                                    this.field5524[3][1] = 4096;
                                    this.field5524[3][2] = 0;
                                    this.field5524[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field5524 = new int[16][4];
                                this.field5524[0][0] = 0;
                                this.field5524[0][3] = 321;
                                this.field5524[0][2] = 192;
                                this.field5524[0][1] = 80;
                                this.field5524[1][3] = 562;
                                this.field5524[1][0] = 155;
                                this.field5524[1][2] = 449;
                                this.field5524[1][1] = 321;
                                this.field5524[2][2] = 690;
                                this.field5524[2][3] = 803;
                                this.field5524[2][1] = 578;
                                this.field5524[2][0] = 389;
                                this.field5524[3][0] = 671;
                                this.field5524[3][2] = 995;
                                this.field5524[3][3] = 1140;
                                this.field5524[3][1] = 947;
                                this.field5524[4][2] = 1397;
                                this.field5524[4][3] = 1509;
                                this.field5524[4][0] = 897;
                                this.field5524[4][1] = 1285;
                                this.field5524[5][0] = 1175;
                                this.field5524[5][2] = 1429;
                                this.field5524[5][3] = 1413;
                                this.field5524[5][1] = 1525;
                                this.field5524[6][0] = 1368;
                                this.field5524[6][3] = 1333;
                                this.field5524[6][2] = 1461;
                                this.field5524[6][1] = 1734;
                                this.field5524[7][3] = 1702;
                                this.field5524[7][0] = 1507;
                                this.field5524[7][2] = 1525;
                                this.field5524[7][1] = 1413;
                                this.field5524[8][1] = 1108;
                                this.field5524[8][2] = 1590;
                                this.field5524[8][0] = 1736;
                                this.field5524[8][3] = 2056;
                                this.field5524[9][3] = 2666;
                                this.field5524[9][2] = 2056;
                                this.field5524[9][1] = 1766;
                                this.field5524[9][0] = 2088;
                                this.field5524[10][2] = 2586;
                                this.field5524[10][1] = 2409;
                                this.field5524[10][3] = 3276;
                                this.field5524[10][0] = 2355;
                                this.field5524[11][2] = 3148;
                                this.field5524[11][3] = 3228;
                                this.field5524[11][0] = 2691;
                                this.field5524[11][1] = 3116;
                                this.field5524[12][1] = 3806;
                                this.field5524[12][2] = 3710;
                                this.field5524[12][3] = 3196;
                                this.field5524[12][0] = 3031;
                                this.field5524[13][2] = 3421;
                                this.field5524[13][1] = 3437;
                                this.field5524[13][3] = 3019;
                                this.field5524[13][0] = 3522;
                                this.field5524[14][1] = 3116;
                                this.field5524[14][0] = 3727;
                                this.field5524[14][3] = 3228;
                                this.field5524[14][2] = 3148;
                                this.field5524[15][1] = 2377;
                                this.field5524[15][2] = 2505;
                                this.field5524[15][3] = 2746;
                                this.field5524[15][0] = 4096;
                            }
                        } else {
                            this.field5524 = new int[6][4];
                            this.field5524[0][2] = 0;
                            this.field5524[0][1] = 0;
                            this.field5524[0][0] = 0;
                            this.field5524[0][3] = 0;
                            this.field5524[1][3] = 1493;
                            this.field5524[1][1] = 0;
                            this.field5524[1][2] = 0;
                            this.field5524[1][0] = 1843;
                            this.field5524[2][1] = 0;
                            this.field5524[2][2] = 0;
                            this.field5524[2][0] = 2457;
                            this.field5524[2][3] = 2939;
                            this.field5524[3][1] = 0;
                            this.field5524[3][0] = 2781;
                            this.field5524[3][2] = 1124;
                            this.field5524[3][3] = 3565;
                            this.field5524[4][0] = 3481;
                            this.field5524[4][1] = 546;
                            this.field5524[4][3] = 4031;
                            this.field5524[4][2] = 3084;
                            this.field5524[5][2] = 4096;
                            this.field5524[5][1] = 4096;
                            this.field5524[5][3] = 4096;
                            this.field5524[5][0] = 4096;
                        }
                    } else {
                        this.field5524 = new int[7][4];
                        this.field5524[0][0] = 0;
                        this.field5524[0][2] = 0;
                        this.field5524[0][1] = 0;
                        this.field5524[0][3] = 4096;
                        this.field5524[1][2] = 4096;
                        this.field5524[1][3] = 4096;
                        this.field5524[1][1] = 0;
                        this.field5524[1][0] = 663;
                        this.field5524[2][3] = 0;
                        this.field5524[2][1] = 0;
                        this.field5524[2][0] = 1363;
                        this.field5524[2][2] = 4096;
                        this.field5524[3][1] = 4096;
                        this.field5524[3][2] = 4096;
                        this.field5524[3][0] = 2048;
                        this.field5524[3][3] = 0;
                        this.field5524[4][0] = 2727;
                        this.field5524[4][2] = 0;
                        this.field5524[4][1] = 4096;
                        this.field5524[4][3] = 0;
                        this.field5524[5][3] = 4096;
                        this.field5524[5][1] = 4096;
                        this.field5524[5][0] = 3411;
                        this.field5524[5][2] = 0;
                        this.field5524[6][2] = 0;
                        this.field5524[6][0] = 4096;
                        this.field5524[6][1] = 0;
                        this.field5524[6][3] = 4096;
                    }
                } else {
                    this.field5524 = new int[8][4];
                    this.field5524[0][3] = 2361;
                    this.field5524[0][0] = 0;
                    this.field5524[0][2] = 2602;
                    this.field5524[0][1] = 2650;
                    this.field5524[1][0] = 2867;
                    this.field5524[1][3] = 1558;
                    this.field5524[1][2] = 1799;
                    this.field5524[1][1] = 2313;
                    this.field5524[2][3] = 1413;
                    this.field5524[2][0] = 3072;
                    this.field5524[2][2] = 1734;
                    this.field5524[2][1] = 2618;
                    this.field5524[3][1] = 2296;
                    this.field5524[3][2] = 1220;
                    this.field5524[3][3] = 947;
                    this.field5524[3][0] = 3276;
                    this.field5524[4][3] = 722;
                    this.field5524[4][1] = 2072;
                    this.field5524[4][0] = 3481;
                    this.field5524[4][2] = 963;
                    this.field5524[5][2] = 2152;
                    this.field5524[5][1] = 2730;
                    this.field5524[5][3] = 1766;
                    this.field5524[5][0] = 3686;
                    this.field5524[6][2] = 1060;
                    this.field5524[6][1] = 2232;
                    this.field5524[6][0] = 3891;
                    this.field5524[6][3] = 915;
                    this.field5524[7][2] = 1413;
                    this.field5524[7][0] = 4096;
                    this.field5524[7][1] = 1686;
                    this.field5524[7][3] = 1140;
                }
            } else {
                this.field5524 = new int[2][4];
                this.field5524[0][0] = 0;
                this.field5524[0][1] = 0;
                this.field5524[0][2] = 0;
                this.field5524[0][3] = 0;
                this.field5524[1][3] = 4096;
                this.field5524[1][1] = 4096;
                this.field5524[1][0] = 4096;
                this.field5524[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lso;II)V", line = 468)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field5528;
        if (arg2 == 0) {
            int var4 = arg0.method2964((byte) 83);
            if (~var4 != -1) {
                this.method2485(var4, 2);
            } else {
                this.field5524 = new int[arg0.method2964((byte) 106)][4];
                for (int var5 = 0; var5 < this.field5524.length; ++var5) {
                    this.field5524[var5][0] = arg0.method2998(true);
                    this.field5524[var5][1] = arg0.method2964((byte) 41) << 4;
                    this.field5524[var5][2] = arg0.method2964((byte) 80) << 4;
                    this.field5524[var5][3] = arg0.method2964((byte) 109) << 4;
                }
            }
        }
        if (arg1 != 1) {
            this.method52(90);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 506)
    public final void method52(int arg0) {
        if (this.field5524 == null) {
            this.method2485(1, arg0 ^ -4094);
        }
        ++field5530;
        this.method2482(-1);
        if (arg0 != -4096) {
            method2483((class753) null, -65, -56, -115, 55, (class65) null, -112, 94, 124, -106, -44, -37);
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 528)
    public static final void method2486(int arg0) {
        class343[] var1 = class418.field5724;
        synchronized (class418.field5724) {
            int var2 = 0;
            while (true) {
                if (~var2 <= ~class418.field5724.length) {
                    int var3 = -125 % ((arg0 - -12) / 50);
                    break;
                }
                class418.field5724[var2] = new class343();
                class40.field528[var2] = 0;
                ++var2;
            }
        }
        ++field5527;
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Ljava/lang/String;", line = 549)
    public static final String method2487(int arg0) {
        ++field5522;
        if (!class626.field8777 && class694.field9692 != null) {
            if ((class694.field9692.field10339 == null || ~class694.field9692.field10339.length() == -1) && class694.field9692.field10337 != null && ~class694.field9692.field10337.length() < -1) {
                return class694.field9692.field10337;
            } else {
                if (arg0 != -1) {
                    method2487(-120);
                }
                return class694.field9692.field10339;
            }
        } else {
            return "";
        }
    }
}
