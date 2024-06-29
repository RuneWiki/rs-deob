import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class216 extends class328 {

    @OriginalMember(owner = "client!or", name = "L", descriptor = "[I")
    private int[] field3273 = new int[257];

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "[[I")
    private int[][] field3263;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V", line = 5)
    private final void method1460(int arg0, int arg1) {
        ++field3268;
        if (arg0 >= -99) {
            field3271 = -76;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3263 = new int[4][4];
                                    this.field3263[0][3] = 0;
                                    this.field3263[0][1] = 0;
                                    this.field3263[0][2] = 4096;
                                    this.field3263[0][0] = 2048;
                                    this.field3263[1][1] = 4096;
                                    this.field3263[1][2] = 4096;
                                    this.field3263[1][3] = 0;
                                    this.field3263[1][0] = 2867;
                                    this.field3263[2][3] = 0;
                                    this.field3263[2][2] = 4096;
                                    this.field3263[2][0] = 3276;
                                    this.field3263[2][1] = 4096;
                                    this.field3263[3][3] = 0;
                                    this.field3263[3][2] = 0;
                                    this.field3263[3][1] = 4096;
                                    this.field3263[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3263 = new int[16][4];
                                this.field3263[0][0] = 0;
                                this.field3263[0][2] = 192;
                                this.field3263[0][1] = 80;
                                this.field3263[0][3] = 321;
                                this.field3263[1][2] = 449;
                                this.field3263[1][1] = 321;
                                this.field3263[1][0] = 155;
                                this.field3263[1][3] = 562;
                                this.field3263[2][0] = 389;
                                this.field3263[2][2] = 690;
                                this.field3263[2][1] = 578;
                                this.field3263[2][3] = 803;
                                this.field3263[3][0] = 671;
                                this.field3263[3][2] = 995;
                                this.field3263[3][1] = 947;
                                this.field3263[3][3] = 1140;
                                this.field3263[4][3] = 1509;
                                this.field3263[4][2] = 1397;
                                this.field3263[4][0] = 897;
                                this.field3263[4][1] = 1285;
                                this.field3263[5][3] = 1413;
                                this.field3263[5][1] = 1525;
                                this.field3263[5][2] = 1429;
                                this.field3263[5][0] = 1175;
                                this.field3263[6][1] = 1734;
                                this.field3263[6][3] = 1333;
                                this.field3263[6][0] = 1368;
                                this.field3263[6][2] = 1461;
                                this.field3263[7][0] = 1507;
                                this.field3263[7][2] = 1525;
                                this.field3263[7][1] = 1413;
                                this.field3263[7][3] = 1702;
                                this.field3263[8][0] = 1736;
                                this.field3263[8][1] = 1108;
                                this.field3263[8][2] = 1590;
                                this.field3263[8][3] = 2056;
                                this.field3263[9][2] = 2056;
                                this.field3263[9][0] = 2088;
                                this.field3263[9][3] = 2666;
                                this.field3263[9][1] = 1766;
                                this.field3263[10][1] = 2409;
                                this.field3263[10][0] = 2355;
                                this.field3263[10][3] = 3276;
                                this.field3263[10][2] = 2586;
                                this.field3263[11][3] = 3228;
                                this.field3263[11][0] = 2691;
                                this.field3263[11][2] = 3148;
                                this.field3263[11][1] = 3116;
                                this.field3263[12][3] = 3196;
                                this.field3263[12][0] = 3031;
                                this.field3263[12][2] = 3710;
                                this.field3263[12][1] = 3806;
                                this.field3263[13][1] = 3437;
                                this.field3263[13][2] = 3421;
                                this.field3263[13][0] = 3522;
                                this.field3263[13][3] = 3019;
                                this.field3263[14][3] = 3228;
                                this.field3263[14][0] = 3727;
                                this.field3263[14][1] = 3116;
                                this.field3263[14][2] = 3148;
                                this.field3263[15][3] = 2746;
                                this.field3263[15][2] = 2505;
                                this.field3263[15][0] = 4096;
                                this.field3263[15][1] = 2377;
                            }
                        } else {
                            this.field3263 = new int[6][4];
                            this.field3263[0][2] = 0;
                            this.field3263[0][1] = 0;
                            this.field3263[0][0] = 0;
                            this.field3263[0][3] = 0;
                            this.field3263[1][2] = 0;
                            this.field3263[1][0] = 1843;
                            this.field3263[1][1] = 0;
                            this.field3263[1][3] = 1493;
                            this.field3263[2][2] = 0;
                            this.field3263[2][3] = 2939;
                            this.field3263[2][1] = 0;
                            this.field3263[2][0] = 2457;
                            this.field3263[3][0] = 2781;
                            this.field3263[3][1] = 0;
                            this.field3263[3][2] = 1124;
                            this.field3263[3][3] = 3565;
                            this.field3263[4][3] = 4031;
                            this.field3263[4][1] = 546;
                            this.field3263[4][2] = 3084;
                            this.field3263[4][0] = 3481;
                            this.field3263[5][3] = 4096;
                            this.field3263[5][1] = 4096;
                            this.field3263[5][2] = 4096;
                            this.field3263[5][0] = 4096;
                        }
                    } else {
                        this.field3263 = new int[7][4];
                        this.field3263[0][1] = 0;
                        this.field3263[0][0] = 0;
                        this.field3263[0][2] = 0;
                        this.field3263[0][3] = 4096;
                        this.field3263[1][2] = 4096;
                        this.field3263[1][0] = 663;
                        this.field3263[1][1] = 0;
                        this.field3263[1][3] = 4096;
                        this.field3263[2][2] = 4096;
                        this.field3263[2][0] = 1363;
                        this.field3263[2][3] = 0;
                        this.field3263[2][1] = 0;
                        this.field3263[3][3] = 0;
                        this.field3263[3][1] = 4096;
                        this.field3263[3][0] = 2048;
                        this.field3263[3][2] = 4096;
                        this.field3263[4][0] = 2727;
                        this.field3263[4][3] = 0;
                        this.field3263[4][1] = 4096;
                        this.field3263[4][2] = 0;
                        this.field3263[5][3] = 4096;
                        this.field3263[5][2] = 0;
                        this.field3263[5][0] = 3411;
                        this.field3263[5][1] = 4096;
                        this.field3263[6][2] = 0;
                        this.field3263[6][3] = 4096;
                        this.field3263[6][0] = 4096;
                        this.field3263[6][1] = 0;
                    }
                } else {
                    this.field3263 = new int[8][4];
                    this.field3263[0][1] = 2650;
                    this.field3263[0][2] = 2602;
                    this.field3263[0][0] = 0;
                    this.field3263[0][3] = 2361;
                    this.field3263[1][1] = 2313;
                    this.field3263[1][3] = 1558;
                    this.field3263[1][2] = 1799;
                    this.field3263[1][0] = 2867;
                    this.field3263[2][1] = 2618;
                    this.field3263[2][2] = 1734;
                    this.field3263[2][3] = 1413;
                    this.field3263[2][0] = 3072;
                    this.field3263[3][2] = 1220;
                    this.field3263[3][3] = 947;
                    this.field3263[3][0] = 3276;
                    this.field3263[3][1] = 2296;
                    this.field3263[4][0] = 3481;
                    this.field3263[4][1] = 2072;
                    this.field3263[4][2] = 963;
                    this.field3263[4][3] = 722;
                    this.field3263[5][3] = 1766;
                    this.field3263[5][2] = 2152;
                    this.field3263[5][1] = 2730;
                    this.field3263[5][0] = 3686;
                    this.field3263[6][1] = 2232;
                    this.field3263[6][3] = 915;
                    this.field3263[6][2] = 1060;
                    this.field3263[6][0] = 3891;
                    this.field3263[7][3] = 1140;
                    this.field3263[7][1] = 1686;
                    this.field3263[7][2] = 1413;
                    this.field3263[7][0] = 4096;
                }
            } else {
                this.field3263 = new int[2][4];
                this.field3263[0][2] = 0;
                this.field3263[0][1] = 0;
                this.field3263[0][3] = 0;
                this.field3263[0][0] = 0;
                this.field3263[1][2] = 4096;
                this.field3263[1][3] = 4096;
                this.field3263[1][1] = 4096;
                this.field3263[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BILco;)V", line = 266)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field3267;
        if (arg0 <= 75) {
            this.method1461(false);
        }
        if (~arg1 == -1) {
            int var4 = arg2.method1738(255);
            if (~var4 != -1) {
                this.method1460(-120, var4);
            } else {
                this.field3263 = new int[arg2.method1738(255)][4];
                for (int var5 = 0; ~var5 > ~this.field3263.length; ++var5) {
                    this.field3263[var5][0] = arg2.method1745(32132);
                    this.field3263[var5][1] = arg2.method1738(255) << 4;
                    this.field3263[var5][2] = arg2.method1738(255) << 4;
                    this.field3263[var5][3] = arg2.method1738(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 305)
    private final void method1461(boolean arg0) {
        ++field3272;
        if (arg0) {
            this.method1460(-61, -100);
        }
        int var2 = this.field3263.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~this.field3263[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field3263[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field3263[var4];
                    if (~var4 >= -1) {
                        var9 = var11[2];
                        var8 = var11[3];
                        var10 = var11[1];
                    } else {
                        int[] var12 = this.field3263[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field3273[var3] = class188.method1258(class188.method1258(var16 << 8, var17 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V", line = 408)
    public class216() {
        super(1, false);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIII)V", line = 412)
    public static final void method1462(int arg0, int arg1, int arg2, int arg3) {
        class184 var4 = class277.field4051[arg0][arg1][arg2];
        if (var4 != null) {
            class367 var5 = var4.field2672;
            class367 var6 = var4.field2666;
            if (var5 != null) {
                var5.field5200 = var5.field5200 * arg3 / (16 << class162.field2401 - 7);
                var5.field5204 = var5.field5204 * arg3 / (16 << class162.field2401 - 7);
            }
            if (var6 != null) {
                var6.field5200 = var6.field5200 * arg3 / (16 << class162.field2401 - 7);
                var6.field5204 = var6.field5204 * arg3 / (16 << class162.field2401 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 434)
    public final void method2(int arg0) {
        ++field3270;
        if (this.field3263 == null) {
            this.method1460(-114, 1);
        }
        this.method1461(false);
        if (arg0 >= -97) {
            this.field3273 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)[[I", line = 454)
    public final int[][] method7(int arg0, int arg1) {
        ++field3269;
        int var3 = 89 % ((46 - arg1) / 54);
        int[][] var4 = super.field4725.method1886((byte) -92, arg0);
        if (super.field4725.field4371) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class449.field6539; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field3273[var10];
                var6[var9] = class424.method2540(var11 >> 12, 4080);
                var7[var9] = class424.method2540(var11, 65280) >> 4;
                var8[var9] = class424.method2540(4080, var11 << 4);
            }
        }
        return var4;
    }
}
