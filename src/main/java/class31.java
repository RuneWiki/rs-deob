import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class31 extends class298 {

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "[I")
    private int[] field385 = new int[257];

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "[I")
    public static int[] field384 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "F")
    public static float field389 = 1024.0F;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "[S")
    public static short[] field386;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "[[I")
    private int[][] field393;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 4)
    public static void method154(int arg0) {
        if (arg0 != 2) {
            method154(-20);
        }
        field386 = null;
        field384 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V", line = 15)
    private final void method155(byte arg0, int arg1) {
        ++field392;
        int var3 = 9 % ((arg0 - 35) / 43);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field393 = new int[4][4];
                                    this.field393[0][3] = 0;
                                    this.field393[0][2] = 4096;
                                    this.field393[0][0] = 2048;
                                    this.field393[0][1] = 0;
                                    this.field393[1][2] = 4096;
                                    this.field393[1][3] = 0;
                                    this.field393[1][0] = 2867;
                                    this.field393[1][1] = 4096;
                                    this.field393[2][1] = 4096;
                                    this.field393[2][3] = 0;
                                    this.field393[2][2] = 4096;
                                    this.field393[2][0] = 3276;
                                    this.field393[3][1] = 4096;
                                    this.field393[3][3] = 0;
                                    this.field393[3][0] = 4096;
                                    this.field393[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field393 = new int[16][4];
                                this.field393[0][0] = 0;
                                this.field393[0][3] = 321;
                                this.field393[0][2] = 192;
                                this.field393[0][1] = 80;
                                this.field393[1][1] = 321;
                                this.field393[1][3] = 562;
                                this.field393[1][0] = 155;
                                this.field393[1][2] = 449;
                                this.field393[2][0] = 389;
                                this.field393[2][3] = 803;
                                this.field393[2][1] = 578;
                                this.field393[2][2] = 690;
                                this.field393[3][2] = 995;
                                this.field393[3][3] = 1140;
                                this.field393[3][0] = 671;
                                this.field393[3][1] = 947;
                                this.field393[4][3] = 1509;
                                this.field393[4][2] = 1397;
                                this.field393[4][1] = 1285;
                                this.field393[4][0] = 897;
                                this.field393[5][2] = 1429;
                                this.field393[5][0] = 1175;
                                this.field393[5][1] = 1525;
                                this.field393[5][3] = 1413;
                                this.field393[6][3] = 1333;
                                this.field393[6][1] = 1734;
                                this.field393[6][2] = 1461;
                                this.field393[6][0] = 1368;
                                this.field393[7][0] = 1507;
                                this.field393[7][2] = 1525;
                                this.field393[7][3] = 1702;
                                this.field393[7][1] = 1413;
                                this.field393[8][1] = 1108;
                                this.field393[8][2] = 1590;
                                this.field393[8][3] = 2056;
                                this.field393[8][0] = 1736;
                                this.field393[9][2] = 2056;
                                this.field393[9][3] = 2666;
                                this.field393[9][1] = 1766;
                                this.field393[9][0] = 2088;
                                this.field393[10][3] = 3276;
                                this.field393[10][0] = 2355;
                                this.field393[10][2] = 2586;
                                this.field393[10][1] = 2409;
                                this.field393[11][1] = 3116;
                                this.field393[11][2] = 3148;
                                this.field393[11][0] = 2691;
                                this.field393[11][3] = 3228;
                                this.field393[12][1] = 3806;
                                this.field393[12][2] = 3710;
                                this.field393[12][0] = 3031;
                                this.field393[12][3] = 3196;
                                this.field393[13][3] = 3019;
                                this.field393[13][0] = 3522;
                                this.field393[13][1] = 3437;
                                this.field393[13][2] = 3421;
                                this.field393[14][3] = 3228;
                                this.field393[14][1] = 3116;
                                this.field393[14][0] = 3727;
                                this.field393[14][2] = 3148;
                                this.field393[15][2] = 2505;
                                this.field393[15][1] = 2377;
                                this.field393[15][0] = 4096;
                                this.field393[15][3] = 2746;
                            }
                        } else {
                            this.field393 = new int[6][4];
                            this.field393[0][3] = 0;
                            this.field393[0][2] = 0;
                            this.field393[0][0] = 0;
                            this.field393[0][1] = 0;
                            this.field393[1][1] = 0;
                            this.field393[1][0] = 1843;
                            this.field393[1][3] = 1493;
                            this.field393[1][2] = 0;
                            this.field393[2][2] = 0;
                            this.field393[2][3] = 2939;
                            this.field393[2][1] = 0;
                            this.field393[2][0] = 2457;
                            this.field393[3][3] = 3565;
                            this.field393[3][1] = 0;
                            this.field393[3][2] = 1124;
                            this.field393[3][0] = 2781;
                            this.field393[4][0] = 3481;
                            this.field393[4][3] = 4031;
                            this.field393[4][2] = 3084;
                            this.field393[4][1] = 546;
                            this.field393[5][3] = 4096;
                            this.field393[5][0] = 4096;
                            this.field393[5][1] = 4096;
                            this.field393[5][2] = 4096;
                        }
                    } else {
                        this.field393 = new int[7][4];
                        this.field393[0][1] = 0;
                        this.field393[0][0] = 0;
                        this.field393[0][3] = 4096;
                        this.field393[0][2] = 0;
                        this.field393[1][1] = 0;
                        this.field393[1][0] = 663;
                        this.field393[1][2] = 4096;
                        this.field393[1][3] = 4096;
                        this.field393[2][0] = 1363;
                        this.field393[2][3] = 0;
                        this.field393[2][2] = 4096;
                        this.field393[2][1] = 0;
                        this.field393[3][0] = 2048;
                        this.field393[3][2] = 4096;
                        this.field393[3][3] = 0;
                        this.field393[3][1] = 4096;
                        this.field393[4][3] = 0;
                        this.field393[4][0] = 2727;
                        this.field393[4][1] = 4096;
                        this.field393[4][2] = 0;
                        this.field393[5][0] = 3411;
                        this.field393[5][2] = 0;
                        this.field393[5][3] = 4096;
                        this.field393[5][1] = 4096;
                        this.field393[6][1] = 0;
                        this.field393[6][0] = 4096;
                        this.field393[6][2] = 0;
                        this.field393[6][3] = 4096;
                    }
                } else {
                    this.field393 = new int[8][4];
                    this.field393[0][1] = 2650;
                    this.field393[0][3] = 2361;
                    this.field393[0][2] = 2602;
                    this.field393[0][0] = 0;
                    this.field393[1][1] = 2313;
                    this.field393[1][0] = 2867;
                    this.field393[1][2] = 1799;
                    this.field393[1][3] = 1558;
                    this.field393[2][0] = 3072;
                    this.field393[2][3] = 1413;
                    this.field393[2][2] = 1734;
                    this.field393[2][1] = 2618;
                    this.field393[3][3] = 947;
                    this.field393[3][1] = 2296;
                    this.field393[3][2] = 1220;
                    this.field393[3][0] = 3276;
                    this.field393[4][0] = 3481;
                    this.field393[4][2] = 963;
                    this.field393[4][3] = 722;
                    this.field393[4][1] = 2072;
                    this.field393[5][0] = 3686;
                    this.field393[5][2] = 2152;
                    this.field393[5][1] = 2730;
                    this.field393[5][3] = 1766;
                    this.field393[6][3] = 915;
                    this.field393[6][1] = 2232;
                    this.field393[6][2] = 1060;
                    this.field393[6][0] = 3891;
                    this.field393[7][3] = 1140;
                    this.field393[7][0] = 4096;
                    this.field393[7][1] = 1686;
                    this.field393[7][2] = 1413;
                }
            } else {
                this.field393 = new int[2][4];
                this.field393[0][2] = 0;
                this.field393[0][3] = 0;
                this.field393[0][0] = 0;
                this.field393[0][1] = 0;
                this.field393[1][3] = 4096;
                this.field393[1][1] = 4096;
                this.field393[1][2] = 4096;
                this.field393[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 410)
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLrj;Lrj;)V", line = 277)
    public static final void method156(byte arg0, class15 arg1, class15 arg2) {
        if (arg2.field200 != null) {
            arg2.method104((byte) -59);
        }
        if (arg0 > -125) {
            method159(50, -98, -119);
        }
        ++field390;
        arg2.field200 = arg1;
        arg2.field197 = arg1.field197;
        arg2.field200.field197 = arg2;
        arg2.field197.field200 = arg2;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 297)
    public final void method15(int arg0) {
        if (this.field393 == null) {
            this.method155((byte) 116, 1);
        }
        ++field388;
        this.method158(1);
        if (arg0 > -41) {
            field389 = -0.40783155F;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILvt;)V", line = 319)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 > -44) {
            field386 = null;
        }
        ++field391;
        if (arg1 == 0) {
            int var4 = arg2.method895((byte) -128);
            if (~var4 != -1) {
                this.method155((byte) 94, var4);
            } else {
                this.field393 = new int[arg2.method895((byte) -118)][4];
                for (int var5 = 0; var5 < this.field393.length; ++var5) {
                    this.field393[var5][0] = arg2.method916(21933);
                    this.field393[var5][1] = arg2.method895((byte) -102) << 4;
                    this.field393[var5][2] = arg2.method895((byte) -112) << 4;
                    this.field393[var5][3] = arg2.method895((byte) -101) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[[I", line = 358)
    public final int[][] method157(int arg0, int arg1) {
        ++field394;
        if (arg0 != -24032) {
            field389 = -1.3476948F;
        }
        int[][] var3 = super.field4454.method1638((byte) 17, arg1);
        if (super.field4454.field3886) {
            int[] var4 = this.method1882(0, -2594, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class158.field1877; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field385[var9];
                var5[var8] = class444.method2618(var10 >> 12, 4080);
                var6[var8] = class444.method2618(var10, 65280) >> 4;
                var7[var8] = class444.method2618(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 415)
    private final void method158(int arg0) {
        ++field387;
        if (arg0 == 1) {
            int var2 = this.field393.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field393[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var2 > var4) {
                        int[] var7 = this.field393[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[3];
                            var10 = var7[1];
                        } else {
                            int[] var11 = this.field393[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] - var11[0]);
                            int var13 = -var12 + 4096;
                            var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var9 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                            var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field393[var2 + -1];
                        var8 = var14[2];
                        var9 = var14[3];
                        var10 = var14[1];
                    }
                    int var15 = var10 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var9 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (~var17 <= -1) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field385[var3] = class292.method1841(class292.method1841(var15 << 16, var16 << 8), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(III)V", line = 519)
    public static final void method159(int arg0, int arg1, int arg2) {
        boolean var3 = class293.field4356[0][arg1][arg2] != null && class293.field4356[0][arg1][arg2].field3788 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class293.field4356[var4][arg1][arg2] == null) {
                class263 var5 = class293.field4356[var4][arg1][arg2] = new class263(var4, arg1, arg2);
                if (var3) {
                    ++var5.field3792;
                }
            }
        }
    }
}
