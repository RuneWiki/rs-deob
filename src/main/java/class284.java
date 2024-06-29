import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class284 extends class615 {

    @OriginalMember(owner = "client!le", name = "G", descriptor = "[I")
    private int[] field4015 = new int[257];

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "[Lxa;")
    public static class468[] field4022;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[[I")
    private int[][] field4018;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILeh;)V", line = 3)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 == -1) {
            int var4 = arg2.method2034(255);
            if (var4 != 0) {
                this.method1760(var4, 7429);
            } else {
                this.field4018 = new int[arg2.method2034(255)][4];
                for (int var5 = 0; ~this.field4018.length < ~var5; ++var5) {
                    this.field4018[var5][0] = arg2.method2001((byte) -83);
                    this.field4018[var5][1] = arg2.method2034(255) << 4;
                    this.field4018[var5][2] = arg2.method2034(255) << 4;
                    this.field4018[var5][3] = arg2.method2034(255) << 4;
                }
            }
        }
        if (arg0 < 44) {
            this.method1760(97, 55);
        }
        ++field4020;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 41)
    private final void method1758(boolean arg0) {
        ++field4017;
        int var2 = this.field4018.length;
        if (arg0) {
            this.method10(-76);
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field4018[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var4 > ~var2) {
                    int[] var7 = this.field4018[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field4018[var4 - 1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var11 = var7[1];
                        var13 = var7[2];
                        var12 = var7[3];
                    }
                } else {
                    int[] var14 = this.field4018[var2 - 1];
                    var13 = var14[2];
                    var11 = var14[1];
                    var12 = var14[3];
                }
                int var15 = var12 >> 4;
                int var16 = var13 >> 4;
                int var17 = var11 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4015[var3] = class220.method1393(var15, class220.method1393(var17 << 16, var16 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 145)
    public class284() {
        super(1, false);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V", line = 151)
    public static void method1759(byte arg0) {
        field4022 = null;
        int var1 = -96 / ((arg0 - -54) / 61);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V", line = 164)
    private final void method1760(int arg0, int arg1) {
        ++field4021;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4018 = new int[4][4];
                                this.field4018[0][1] = 0;
                                this.field4018[0][0] = 2048;
                                this.field4018[0][3] = 0;
                                this.field4018[0][2] = 4096;
                                this.field4018[1][2] = 4096;
                                this.field4018[1][0] = 2867;
                                this.field4018[1][1] = 4096;
                                this.field4018[1][3] = 0;
                                this.field4018[2][3] = 0;
                                this.field4018[2][1] = 4096;
                                this.field4018[2][2] = 4096;
                                this.field4018[2][0] = 3276;
                                this.field4018[3][1] = 4096;
                                this.field4018[3][3] = 0;
                                this.field4018[3][0] = 4096;
                                this.field4018[3][2] = 0;
                            } else {
                                this.field4018 = new int[16][4];
                                this.field4018[0][1] = 80;
                                this.field4018[0][0] = 0;
                                this.field4018[0][2] = 192;
                                this.field4018[0][3] = 321;
                                this.field4018[1][1] = 321;
                                this.field4018[1][2] = 449;
                                this.field4018[1][0] = 155;
                                this.field4018[1][3] = 562;
                                this.field4018[2][3] = 803;
                                this.field4018[2][2] = 690;
                                this.field4018[2][1] = 578;
                                this.field4018[2][0] = 389;
                                this.field4018[3][1] = 947;
                                this.field4018[3][0] = 671;
                                this.field4018[3][2] = 995;
                                this.field4018[3][3] = 1140;
                                this.field4018[4][0] = 897;
                                this.field4018[4][1] = 1285;
                                this.field4018[4][2] = 1397;
                                this.field4018[4][3] = 1509;
                                this.field4018[5][3] = 1413;
                                this.field4018[5][2] = 1429;
                                this.field4018[5][1] = 1525;
                                this.field4018[5][0] = 1175;
                                this.field4018[6][3] = 1333;
                                this.field4018[6][2] = 1461;
                                this.field4018[6][0] = 1368;
                                this.field4018[6][1] = 1734;
                                this.field4018[7][0] = 1507;
                                this.field4018[7][2] = 1525;
                                this.field4018[7][3] = 1702;
                                this.field4018[7][1] = 1413;
                                this.field4018[8][0] = 1736;
                                this.field4018[8][1] = 1108;
                                this.field4018[8][3] = 2056;
                                this.field4018[8][2] = 1590;
                                this.field4018[9][1] = 1766;
                                this.field4018[9][3] = 2666;
                                this.field4018[9][0] = 2088;
                                this.field4018[9][2] = 2056;
                                this.field4018[10][2] = 2586;
                                this.field4018[10][1] = 2409;
                                this.field4018[10][0] = 2355;
                                this.field4018[10][3] = 3276;
                                this.field4018[11][3] = 3228;
                                this.field4018[11][0] = 2691;
                                this.field4018[11][1] = 3116;
                                this.field4018[11][2] = 3148;
                                this.field4018[12][3] = 3196;
                                this.field4018[12][0] = 3031;
                                this.field4018[12][1] = 3806;
                                this.field4018[12][2] = 3710;
                                this.field4018[13][2] = 3421;
                                this.field4018[13][0] = 3522;
                                this.field4018[13][1] = 3437;
                                this.field4018[13][3] = 3019;
                                this.field4018[14][1] = 3116;
                                this.field4018[14][0] = 3727;
                                this.field4018[14][3] = 3228;
                                this.field4018[14][2] = 3148;
                                this.field4018[15][0] = 4096;
                                this.field4018[15][1] = 2377;
                                this.field4018[15][2] = 2505;
                                this.field4018[15][3] = 2746;
                            }
                        } else {
                            this.field4018 = new int[6][4];
                            this.field4018[0][0] = 0;
                            this.field4018[0][1] = 0;
                            this.field4018[0][2] = 0;
                            this.field4018[0][3] = 0;
                            this.field4018[1][1] = 0;
                            this.field4018[1][0] = 1843;
                            this.field4018[1][3] = 1493;
                            this.field4018[1][2] = 0;
                            this.field4018[2][3] = 2939;
                            this.field4018[2][2] = 0;
                            this.field4018[2][1] = 0;
                            this.field4018[2][0] = 2457;
                            this.field4018[3][0] = 2781;
                            this.field4018[3][3] = 3565;
                            this.field4018[3][1] = 0;
                            this.field4018[3][2] = 1124;
                            this.field4018[4][1] = 546;
                            this.field4018[4][0] = 3481;
                            this.field4018[4][2] = 3084;
                            this.field4018[4][3] = 4031;
                            this.field4018[5][0] = 4096;
                            this.field4018[5][1] = 4096;
                            this.field4018[5][2] = 4096;
                            this.field4018[5][3] = 4096;
                        }
                    } else {
                        this.field4018 = new int[7][4];
                        this.field4018[0][3] = 4096;
                        this.field4018[0][1] = 0;
                        this.field4018[0][2] = 0;
                        this.field4018[0][0] = 0;
                        this.field4018[1][0] = 663;
                        this.field4018[1][3] = 4096;
                        this.field4018[1][2] = 4096;
                        this.field4018[1][1] = 0;
                        this.field4018[2][1] = 0;
                        this.field4018[2][0] = 1363;
                        this.field4018[2][2] = 4096;
                        this.field4018[2][3] = 0;
                        this.field4018[3][2] = 4096;
                        this.field4018[3][0] = 2048;
                        this.field4018[3][1] = 4096;
                        this.field4018[3][3] = 0;
                        this.field4018[4][2] = 0;
                        this.field4018[4][1] = 4096;
                        this.field4018[4][3] = 0;
                        this.field4018[4][0] = 2727;
                        this.field4018[5][1] = 4096;
                        this.field4018[5][0] = 3411;
                        this.field4018[5][2] = 0;
                        this.field4018[5][3] = 4096;
                        this.field4018[6][2] = 0;
                        this.field4018[6][1] = 0;
                        this.field4018[6][3] = 4096;
                        this.field4018[6][0] = 4096;
                    }
                } else {
                    this.field4018 = new int[8][4];
                    this.field4018[0][0] = 0;
                    this.field4018[0][3] = 2361;
                    this.field4018[0][1] = 2650;
                    this.field4018[0][2] = 2602;
                    this.field4018[1][2] = 1799;
                    this.field4018[1][1] = 2313;
                    this.field4018[1][0] = 2867;
                    this.field4018[1][3] = 1558;
                    this.field4018[2][1] = 2618;
                    this.field4018[2][2] = 1734;
                    this.field4018[2][3] = 1413;
                    this.field4018[2][0] = 3072;
                    this.field4018[3][0] = 3276;
                    this.field4018[3][3] = 947;
                    this.field4018[3][1] = 2296;
                    this.field4018[3][2] = 1220;
                    this.field4018[4][2] = 963;
                    this.field4018[4][1] = 2072;
                    this.field4018[4][0] = 3481;
                    this.field4018[4][3] = 722;
                    this.field4018[5][2] = 2152;
                    this.field4018[5][3] = 1766;
                    this.field4018[5][0] = 3686;
                    this.field4018[5][1] = 2730;
                    this.field4018[6][1] = 2232;
                    this.field4018[6][3] = 915;
                    this.field4018[6][2] = 1060;
                    this.field4018[6][0] = 3891;
                    this.field4018[7][2] = 1413;
                    this.field4018[7][3] = 1140;
                    this.field4018[7][0] = 4096;
                    this.field4018[7][1] = 1686;
                }
            } else {
                this.field4018 = new int[2][4];
                this.field4018[0][3] = 0;
                this.field4018[0][0] = 0;
                this.field4018[0][2] = 0;
                this.field4018[0][1] = 0;
                this.field4018[1][3] = 4096;
                this.field4018[1][1] = 4096;
                this.field4018[1][2] = 4096;
                this.field4018[1][0] = 4096;
            }
        }
        if (arg1 != 7429) {
            this.field4015 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Leh;I)Lpg;", line = 415)
    public static final class687 method1761(class335 arg0, int arg1) {
        if (arg1 != 4096) {
            field4016 = -119;
        }
        ++field4014;
        return new class687(arg0.method2022(arg1 + -33185), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2022(-29089), arg0.method2042((byte) 53), arg0.method2042((byte) 53), arg0.method2034(255));
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 426)
    public final void method10(int arg0) {
        ++field4023;
        if (this.field4018 == null) {
            this.method1760(1, 7429);
        }
        this.method1758(false);
        if (arg0 != 12404) {
            this.field4018 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(B)V", line = 444)
    public static final void method1762(byte arg0) {
        ++field4024;
        int[] var1 = new int[class193.field2826.field2303];
        int var2 = 0;
        for (int var3 = 0; var3 < class193.field2826.field2303; ++var3) {
            class577 var5 = class193.field2826.method1047(var3, -1);
            if (~var5.field7676 <= -1 || ~var5.field7614 <= -1) {
                var1[var2++] = var3;
            }
        }
        class531.field7071 = new int[var2];
        if (arg0 < 97) {
            field4022 = null;
        }
        for (int var4 = 0; var2 > var4; ++var4) {
            class531.field7071[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I", line = 492)
    public final int[][] method223(int arg0, int arg1) {
        ++field4019;
        if (arg0 != 2) {
            return null;
        } else {
            int[][] var3 = super.field8129.method2654(false, arg1);
            if (super.field8129.field6315) {
                int[] var4 = this.method3366(0, 997, arg1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class505.field6740 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field4015[var9];
                    var5[var8] = class571.method3139(4080, var10 >> 12);
                    var6[var8] = class571.method3139(var10, 65280) >> 4;
                    var7[var8] = class571.method3139(4080, var10 << 4);
                }
            }
            return var3;
        }
    }
}
