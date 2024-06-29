import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class300 extends class14 {

    @OriginalMember(owner = "client!io", name = "J", descriptor = "[I")
    private int[] field3966 = new int[257];

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!io", name = "T", descriptor = "[S")
    public static short[] field3976;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "[[I")
    private int[][] field3967;

    static {
        new class304(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3971 = 100;
        field3976 = new short[] { 960, 957, -21568, -21571, 22464 };
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BIIIIZLpc;)V", line = 3)
    public static final void method1748(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class473 arg6) {
        class433.field5910 = arg4;
        class528.field7808 = arg2;
        class342.field4520 = 1;
        if (arg0 > -21) {
            method1750((byte) 85);
        }
        ++field3977;
        class49.field759 = arg1;
        class177.field2570 = arg5;
        class60.field943 = arg6;
        class108.field1575 = class399.field5369.method1950(-46) / arg3;
        if (class108.field1575 < 1) {
            class108.field1575 = 1;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V", line = 26)
    private final void method1749(byte arg0, int arg1) {
        ++field3975;
        if (arg0 >= -116) {
            method1750((byte) 114);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3967 = new int[4][4];
                                    this.field3967[0][0] = 2048;
                                    this.field3967[0][2] = 4096;
                                    this.field3967[0][1] = 0;
                                    this.field3967[0][3] = 0;
                                    this.field3967[1][0] = 2867;
                                    this.field3967[1][3] = 0;
                                    this.field3967[1][2] = 4096;
                                    this.field3967[1][1] = 4096;
                                    this.field3967[2][2] = 4096;
                                    this.field3967[2][0] = 3276;
                                    this.field3967[2][3] = 0;
                                    this.field3967[2][1] = 4096;
                                    this.field3967[3][1] = 4096;
                                    this.field3967[3][3] = 0;
                                    this.field3967[3][2] = 0;
                                    this.field3967[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3967 = new int[16][4];
                                this.field3967[0][0] = 0;
                                this.field3967[0][2] = 192;
                                this.field3967[0][1] = 80;
                                this.field3967[0][3] = 321;
                                this.field3967[1][3] = 562;
                                this.field3967[1][2] = 449;
                                this.field3967[1][0] = 155;
                                this.field3967[1][1] = 321;
                                this.field3967[2][3] = 803;
                                this.field3967[2][0] = 389;
                                this.field3967[2][2] = 690;
                                this.field3967[2][1] = 578;
                                this.field3967[3][0] = 671;
                                this.field3967[3][2] = 995;
                                this.field3967[3][3] = 1140;
                                this.field3967[3][1] = 947;
                                this.field3967[4][0] = 897;
                                this.field3967[4][2] = 1397;
                                this.field3967[4][3] = 1509;
                                this.field3967[4][1] = 1285;
                                this.field3967[5][2] = 1429;
                                this.field3967[5][0] = 1175;
                                this.field3967[5][3] = 1413;
                                this.field3967[5][1] = 1525;
                                this.field3967[6][0] = 1368;
                                this.field3967[6][2] = 1461;
                                this.field3967[6][3] = 1333;
                                this.field3967[6][1] = 1734;
                                this.field3967[7][2] = 1525;
                                this.field3967[7][1] = 1413;
                                this.field3967[7][3] = 1702;
                                this.field3967[7][0] = 1507;
                                this.field3967[8][0] = 1736;
                                this.field3967[8][1] = 1108;
                                this.field3967[8][2] = 1590;
                                this.field3967[8][3] = 2056;
                                this.field3967[9][3] = 2666;
                                this.field3967[9][1] = 1766;
                                this.field3967[9][0] = 2088;
                                this.field3967[9][2] = 2056;
                                this.field3967[10][1] = 2409;
                                this.field3967[10][2] = 2586;
                                this.field3967[10][3] = 3276;
                                this.field3967[10][0] = 2355;
                                this.field3967[11][1] = 3116;
                                this.field3967[11][2] = 3148;
                                this.field3967[11][0] = 2691;
                                this.field3967[11][3] = 3228;
                                this.field3967[12][3] = 3196;
                                this.field3967[12][0] = 3031;
                                this.field3967[12][2] = 3710;
                                this.field3967[12][1] = 3806;
                                this.field3967[13][1] = 3437;
                                this.field3967[13][2] = 3421;
                                this.field3967[13][0] = 3522;
                                this.field3967[13][3] = 3019;
                                this.field3967[14][1] = 3116;
                                this.field3967[14][2] = 3148;
                                this.field3967[14][0] = 3727;
                                this.field3967[14][3] = 3228;
                                this.field3967[15][0] = 4096;
                                this.field3967[15][2] = 2505;
                                this.field3967[15][3] = 2746;
                                this.field3967[15][1] = 2377;
                            }
                        } else {
                            this.field3967 = new int[6][4];
                            this.field3967[0][0] = 0;
                            this.field3967[0][3] = 0;
                            this.field3967[0][1] = 0;
                            this.field3967[0][2] = 0;
                            this.field3967[1][0] = 1843;
                            this.field3967[1][2] = 0;
                            this.field3967[1][1] = 0;
                            this.field3967[1][3] = 1493;
                            this.field3967[2][3] = 2939;
                            this.field3967[2][0] = 2457;
                            this.field3967[2][2] = 0;
                            this.field3967[2][1] = 0;
                            this.field3967[3][2] = 1124;
                            this.field3967[3][0] = 2781;
                            this.field3967[3][3] = 3565;
                            this.field3967[3][1] = 0;
                            this.field3967[4][2] = 3084;
                            this.field3967[4][3] = 4031;
                            this.field3967[4][0] = 3481;
                            this.field3967[4][1] = 546;
                            this.field3967[5][0] = 4096;
                            this.field3967[5][3] = 4096;
                            this.field3967[5][2] = 4096;
                            this.field3967[5][1] = 4096;
                        }
                    } else {
                        this.field3967 = new int[7][4];
                        this.field3967[0][2] = 0;
                        this.field3967[0][0] = 0;
                        this.field3967[0][1] = 0;
                        this.field3967[0][3] = 4096;
                        this.field3967[1][1] = 0;
                        this.field3967[1][2] = 4096;
                        this.field3967[1][3] = 4096;
                        this.field3967[1][0] = 663;
                        this.field3967[2][3] = 0;
                        this.field3967[2][0] = 1363;
                        this.field3967[2][2] = 4096;
                        this.field3967[2][1] = 0;
                        this.field3967[3][2] = 4096;
                        this.field3967[3][0] = 2048;
                        this.field3967[3][1] = 4096;
                        this.field3967[3][3] = 0;
                        this.field3967[4][2] = 0;
                        this.field3967[4][0] = 2727;
                        this.field3967[4][3] = 0;
                        this.field3967[4][1] = 4096;
                        this.field3967[5][2] = 0;
                        this.field3967[5][1] = 4096;
                        this.field3967[5][0] = 3411;
                        this.field3967[5][3] = 4096;
                        this.field3967[6][3] = 4096;
                        this.field3967[6][1] = 0;
                        this.field3967[6][2] = 0;
                        this.field3967[6][0] = 4096;
                    }
                } else {
                    this.field3967 = new int[8][4];
                    this.field3967[0][0] = 0;
                    this.field3967[0][2] = 2602;
                    this.field3967[0][3] = 2361;
                    this.field3967[0][1] = 2650;
                    this.field3967[1][0] = 2867;
                    this.field3967[1][2] = 1799;
                    this.field3967[1][3] = 1558;
                    this.field3967[1][1] = 2313;
                    this.field3967[2][3] = 1413;
                    this.field3967[2][0] = 3072;
                    this.field3967[2][1] = 2618;
                    this.field3967[2][2] = 1734;
                    this.field3967[3][2] = 1220;
                    this.field3967[3][0] = 3276;
                    this.field3967[3][3] = 947;
                    this.field3967[3][1] = 2296;
                    this.field3967[4][3] = 722;
                    this.field3967[4][1] = 2072;
                    this.field3967[4][2] = 963;
                    this.field3967[4][0] = 3481;
                    this.field3967[5][2] = 2152;
                    this.field3967[5][0] = 3686;
                    this.field3967[5][3] = 1766;
                    this.field3967[5][1] = 2730;
                    this.field3967[6][0] = 3891;
                    this.field3967[6][3] = 915;
                    this.field3967[6][1] = 2232;
                    this.field3967[6][2] = 1060;
                    this.field3967[7][2] = 1413;
                    this.field3967[7][1] = 1686;
                    this.field3967[7][0] = 4096;
                    this.field3967[7][3] = 1140;
                }
            } else {
                this.field3967 = new int[2][4];
                this.field3967[0][2] = 0;
                this.field3967[0][0] = 0;
                this.field3967[0][1] = 0;
                this.field3967[0][3] = 0;
                this.field3967[1][0] = 4096;
                this.field3967[1][2] = 4096;
                this.field3967[1][3] = 4096;
                this.field3967[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 284)
    public static void method1750(byte arg0) {
        field3976 = null;
        if (arg0 < 124) {
            method1748((byte) 58, -2, 113, 97, -7, false, (class473) null);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 384)
    public class300() {
        super(1, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[[I", line = 305)
    public final int[][] method141(int arg0, int arg1) {
        ++field3969;
        int[][] var3 = super.field268.method2561(arg1, arg0 ^ arg0);
        if (super.field268.field6091) {
            int[] var4 = this.method145(arg1, 0, -18596);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class115.field1637; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3966[var9];
                var5[var8] = class494.method2839(var10 >> 12, 4080);
                var6[var8] = class494.method2839(var10, 65280) >> 4;
                var7[var8] = class494.method2839(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V", line = 353)
    public static final void method1751(int arg0, int arg1) {
        if (arg1 != 14271) {
            method1752(false, (String) null);
        }
        ++field3972;
        class253 var2 = class332.method1911(arg0, (byte) 79, 16);
        var2.method1523((byte) -111);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 368)
    public final void method142(byte arg0) {
        ++field3973;
        if (this.field3967 == null) {
            this.method1749((byte) -126, 1);
        }
        int var2 = -115 % ((39 - arg0) / 59);
        this.method1753(-18123);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 389)
    public static final int method1752(boolean arg0, String arg1) {
        ++field3974;
        if (!arg0) {
            method1750((byte) 65);
        }
        return class364.method2122(arg1, (byte) -34, 10, true);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IBLmd;)V", line = 410)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field3970;
        if (~arg0 == -1) {
            int var4 = arg2.method2238(255);
            if (~var4 == -1) {
                this.field3967 = new int[arg2.method2238(255)][4];
                for (int var5 = 0; var5 < this.field3967.length; ++var5) {
                    this.field3967[var5][0] = arg2.method2212((byte) 83);
                    this.field3967[var5][1] = arg2.method2238(255) << 4;
                    this.field3967[var5][2] = arg2.method2238(255) << 4;
                    this.field3967[var5][3] = arg2.method2238(255) << 4;
                }
            } else {
                this.method1749((byte) -120, var4);
            }
        }
        int var6 = 123 / ((-51 - arg1) / 37);
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(I)V", line = 448)
    private final void method1753(int arg0) {
        ++field3968;
        if (arg0 != -18123) {
            this.field3967 = null;
        }
        int var2 = this.field3967.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field3967[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 < ~var4) {
                    int[] var7 = this.field3967[var4];
                    if (~var4 >= -1) {
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field3967[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field3967[var2 - 1];
                    var9 = var14[3];
                    var8 = var14[2];
                    var10 = var14[1];
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field3966[var3] = class191.method1230(class191.method1230(var17 << 16, var15 << 8), var16);
            }
        }
    }
}
