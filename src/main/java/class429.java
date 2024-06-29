import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class429 extends class270 {

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[I")
    private int[] field6214 = new int[257];

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field6210 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "[[I")
    private int[][] field6209;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLec;I)V", line = 8)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.field6209 = null;
        }
        if (arg2 == 0) {
            int var4 = arg1.method271((byte) 113);
            if (~var4 != -1) {
                this.method2676(var4, 7);
            } else {
                this.field6209 = new int[arg1.method271((byte) 123)][4];
                for (int var5 = 0; ~this.field6209.length < ~var5; ++var5) {
                    this.field6209[var5][0] = arg1.method320((byte) -87);
                    this.field6209[var5][1] = arg1.method271((byte) 113) << 4;
                    this.field6209[var5][2] = arg1.method271((byte) 121) << 4;
                    this.field6209[var5][3] = arg1.method271((byte) 109) << 4;
                }
            }
        }
        ++field6211;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method2675(int arg0, byte arg1) {
        ++field6212;
        if (arg1 != -5) {
            method2677((String) null, -25);
        }
        class377.field5358 = arg0;
        class44.field654.method106((byte) -114);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 64)
    public final void method83(boolean arg0) {
        ++field6208;
        if (this.field6209 == null) {
            this.method2676(1, 7);
        }
        this.method2679(arg0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)[[I", line = 77)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field6206;
        int[][] var3 = super.field4046.method244(arg1, 125);
        if (!arg0) {
            this.field6214 = null;
        }
        if (super.field4046.field488) {
            int[] var4 = this.method1927(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class161.field2445; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field6214[var9];
                var5[var8] = class35.method254(var10, 16711680) >> 12;
                var6[var8] = class35.method254(var10 >> 4, 4080);
                var7[var8] = class35.method254(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 133)
    private final void method2676(int arg0, int arg1) {
        if (arg1 != 7) {
            method2675(70, (byte) -115);
        }
        ++field6207;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field6209 = new int[4][4];
                                    this.field6209[0][0] = 2048;
                                    this.field6209[0][1] = 0;
                                    this.field6209[0][3] = 0;
                                    this.field6209[0][2] = 4096;
                                    this.field6209[1][3] = 0;
                                    this.field6209[1][2] = 4096;
                                    this.field6209[1][1] = 4096;
                                    this.field6209[1][0] = 2867;
                                    this.field6209[2][3] = 0;
                                    this.field6209[2][0] = 3276;
                                    this.field6209[2][1] = 4096;
                                    this.field6209[2][2] = 4096;
                                    this.field6209[3][1] = 4096;
                                    this.field6209[3][2] = 0;
                                    this.field6209[3][3] = 0;
                                    this.field6209[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field6209 = new int[16][4];
                                this.field6209[0][3] = 321;
                                this.field6209[0][2] = 192;
                                this.field6209[0][0] = 0;
                                this.field6209[0][1] = 80;
                                this.field6209[1][2] = 449;
                                this.field6209[1][1] = 321;
                                this.field6209[1][3] = 562;
                                this.field6209[1][0] = 155;
                                this.field6209[2][0] = 389;
                                this.field6209[2][2] = 690;
                                this.field6209[2][3] = 803;
                                this.field6209[2][1] = 578;
                                this.field6209[3][0] = 671;
                                this.field6209[3][1] = 947;
                                this.field6209[3][2] = 995;
                                this.field6209[3][3] = 1140;
                                this.field6209[4][0] = 897;
                                this.field6209[4][3] = 1509;
                                this.field6209[4][2] = 1397;
                                this.field6209[4][1] = 1285;
                                this.field6209[5][2] = 1429;
                                this.field6209[5][0] = 1175;
                                this.field6209[5][3] = 1413;
                                this.field6209[5][1] = 1525;
                                this.field6209[6][3] = 1333;
                                this.field6209[6][2] = 1461;
                                this.field6209[6][0] = 1368;
                                this.field6209[6][1] = 1734;
                                this.field6209[7][1] = 1413;
                                this.field6209[7][3] = 1702;
                                this.field6209[7][2] = 1525;
                                this.field6209[7][0] = 1507;
                                this.field6209[8][2] = 1590;
                                this.field6209[8][0] = 1736;
                                this.field6209[8][1] = 1108;
                                this.field6209[8][3] = 2056;
                                this.field6209[9][2] = 2056;
                                this.field6209[9][1] = 1766;
                                this.field6209[9][3] = 2666;
                                this.field6209[9][0] = 2088;
                                this.field6209[10][0] = 2355;
                                this.field6209[10][3] = 3276;
                                this.field6209[10][2] = 2586;
                                this.field6209[10][1] = 2409;
                                this.field6209[11][2] = 3148;
                                this.field6209[11][0] = 2691;
                                this.field6209[11][3] = 3228;
                                this.field6209[11][1] = 3116;
                                this.field6209[12][3] = 3196;
                                this.field6209[12][1] = 3806;
                                this.field6209[12][2] = 3710;
                                this.field6209[12][0] = 3031;
                                this.field6209[13][1] = 3437;
                                this.field6209[13][0] = 3522;
                                this.field6209[13][3] = 3019;
                                this.field6209[13][2] = 3421;
                                this.field6209[14][3] = 3228;
                                this.field6209[14][1] = 3116;
                                this.field6209[14][2] = 3148;
                                this.field6209[14][0] = 3727;
                                this.field6209[15][2] = 2505;
                                this.field6209[15][3] = 2746;
                                this.field6209[15][0] = 4096;
                                this.field6209[15][1] = 2377;
                            }
                        } else {
                            this.field6209 = new int[6][4];
                            this.field6209[0][3] = 0;
                            this.field6209[0][0] = 0;
                            this.field6209[0][2] = 0;
                            this.field6209[0][1] = 0;
                            this.field6209[1][0] = 1843;
                            this.field6209[1][3] = 1493;
                            this.field6209[1][2] = 0;
                            this.field6209[1][1] = 0;
                            this.field6209[2][2] = 0;
                            this.field6209[2][1] = 0;
                            this.field6209[2][0] = 2457;
                            this.field6209[2][3] = 2939;
                            this.field6209[3][1] = 0;
                            this.field6209[3][2] = 1124;
                            this.field6209[3][3] = 3565;
                            this.field6209[3][0] = 2781;
                            this.field6209[4][3] = 4031;
                            this.field6209[4][1] = 546;
                            this.field6209[4][0] = 3481;
                            this.field6209[4][2] = 3084;
                            this.field6209[5][2] = 4096;
                            this.field6209[5][3] = 4096;
                            this.field6209[5][1] = 4096;
                            this.field6209[5][0] = 4096;
                        }
                    } else {
                        this.field6209 = new int[7][4];
                        this.field6209[0][3] = 4096;
                        this.field6209[0][1] = 0;
                        this.field6209[0][2] = 0;
                        this.field6209[0][0] = 0;
                        this.field6209[1][0] = 663;
                        this.field6209[1][2] = 4096;
                        this.field6209[1][1] = 0;
                        this.field6209[1][3] = 4096;
                        this.field6209[2][0] = 1363;
                        this.field6209[2][1] = 0;
                        this.field6209[2][3] = 0;
                        this.field6209[2][2] = 4096;
                        this.field6209[3][2] = 4096;
                        this.field6209[3][1] = 4096;
                        this.field6209[3][0] = 2048;
                        this.field6209[3][3] = 0;
                        this.field6209[4][0] = 2727;
                        this.field6209[4][3] = 0;
                        this.field6209[4][2] = 0;
                        this.field6209[4][1] = 4096;
                        this.field6209[5][3] = 4096;
                        this.field6209[5][2] = 0;
                        this.field6209[5][0] = 3411;
                        this.field6209[5][1] = 4096;
                        this.field6209[6][2] = 0;
                        this.field6209[6][1] = 0;
                        this.field6209[6][0] = 4096;
                        this.field6209[6][3] = 4096;
                    }
                } else {
                    this.field6209 = new int[8][4];
                    this.field6209[0][3] = 2361;
                    this.field6209[0][0] = 0;
                    this.field6209[0][1] = 2650;
                    this.field6209[0][2] = 2602;
                    this.field6209[1][3] = 1558;
                    this.field6209[1][0] = 2867;
                    this.field6209[1][2] = 1799;
                    this.field6209[1][1] = 2313;
                    this.field6209[2][0] = 3072;
                    this.field6209[2][3] = 1413;
                    this.field6209[2][1] = 2618;
                    this.field6209[2][2] = 1734;
                    this.field6209[3][1] = 2296;
                    this.field6209[3][0] = 3276;
                    this.field6209[3][3] = 947;
                    this.field6209[3][2] = 1220;
                    this.field6209[4][3] = 722;
                    this.field6209[4][1] = 2072;
                    this.field6209[4][0] = 3481;
                    this.field6209[4][2] = 963;
                    this.field6209[5][3] = 1766;
                    this.field6209[5][0] = 3686;
                    this.field6209[5][1] = 2730;
                    this.field6209[5][2] = 2152;
                    this.field6209[6][3] = 915;
                    this.field6209[6][2] = 1060;
                    this.field6209[6][0] = 3891;
                    this.field6209[6][1] = 2232;
                    this.field6209[7][2] = 1413;
                    this.field6209[7][3] = 1140;
                    this.field6209[7][0] = 4096;
                    this.field6209[7][1] = 1686;
                }
            } else {
                this.field6209 = new int[2][4];
                this.field6209[0][0] = 0;
                this.field6209[0][1] = 0;
                this.field6209[0][2] = 0;
                this.field6209[0][3] = 0;
                this.field6209[1][1] = 4096;
                this.field6209[1][3] = 4096;
                this.field6209[1][2] = 4096;
                this.field6209[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 521)
    public class429() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 389)
    public static final int method2677(String arg0, int arg1) {
        if (arg1 != 1) {
            return 36;
        } else {
            ++field6215;
            return 1 + arg0.length();
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V", line = 405)
    public static void method2678(boolean arg0) {
        if (!arg0) {
            method2677((String) null, -11);
        }
        field6210 = null;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)V", line = 416)
    private final void method2679(boolean arg0) {
        if (!arg0) {
            this.field6209 = null;
        }
        ++field6213;
        int var2 = this.field6209.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field6209[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field6209[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field6209[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field6209[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    } else {
                        var8 = var11[3];
                        var9 = var11[2];
                        var10 = var11[1];
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field6214[var3] = class439.method2744(var17, class439.method2744(var15 << 16, var16 << 8));
            }
        }
    }
}
