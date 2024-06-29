import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class710 extends class739 {

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "[I")
    private int[] field9852 = new int[257];

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field9861 = 1;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "[[I")
    private int[][] field9857;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method2600((byte) -127);
            if (var4 == 0) {
                this.field9857 = new int[arg0.method2600((byte) -124)][4];
                for (int var5 = 0; ~var5 > ~this.field9857.length; ++var5) {
                    this.field9857[var5][0] = arg0.method2566(class386.method2198(arg2, 3));
                    this.field9857[var5][1] = arg0.method2600((byte) -127) << 4;
                    this.field9857[var5][2] = arg0.method2600((byte) -126) << 4;
                    this.field9857[var5][3] = arg0.method2600((byte) -126) << 4;
                }
            } else {
                this.method3970(var4, (byte) 67);
            }
        }
        ++field9860;
        if (arg2 != -3) {
            this.field9852 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
    private final void method3970(int arg0, byte arg1) {
        if (arg1 != 67) {
            this.field9852 = null;
        }
        ++field9858;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field9857 = new int[4][4];
                                    this.field9857[0][0] = 2048;
                                    this.field9857[0][1] = 0;
                                    this.field9857[0][2] = 4096;
                                    this.field9857[0][3] = 0;
                                    this.field9857[1][3] = 0;
                                    this.field9857[1][0] = 2867;
                                    this.field9857[1][1] = 4096;
                                    this.field9857[1][2] = 4096;
                                    this.field9857[2][0] = 3276;
                                    this.field9857[2][1] = 4096;
                                    this.field9857[2][2] = 4096;
                                    this.field9857[2][3] = 0;
                                    this.field9857[3][2] = 0;
                                    this.field9857[3][0] = 4096;
                                    this.field9857[3][1] = 4096;
                                    this.field9857[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field9857 = new int[16][4];
                                this.field9857[0][3] = 321;
                                this.field9857[0][2] = 192;
                                this.field9857[0][1] = 80;
                                this.field9857[0][0] = 0;
                                this.field9857[1][1] = 321;
                                this.field9857[1][0] = 155;
                                this.field9857[1][2] = 449;
                                this.field9857[1][3] = 562;
                                this.field9857[2][1] = 578;
                                this.field9857[2][3] = 803;
                                this.field9857[2][0] = 389;
                                this.field9857[2][2] = 690;
                                this.field9857[3][0] = 671;
                                this.field9857[3][1] = 947;
                                this.field9857[3][3] = 1140;
                                this.field9857[3][2] = 995;
                                this.field9857[4][0] = 897;
                                this.field9857[4][2] = 1397;
                                this.field9857[4][3] = 1509;
                                this.field9857[4][1] = 1285;
                                this.field9857[5][3] = 1413;
                                this.field9857[5][0] = 1175;
                                this.field9857[5][2] = 1429;
                                this.field9857[5][1] = 1525;
                                this.field9857[6][2] = 1461;
                                this.field9857[6][3] = 1333;
                                this.field9857[6][0] = 1368;
                                this.field9857[6][1] = 1734;
                                this.field9857[7][2] = 1525;
                                this.field9857[7][1] = 1413;
                                this.field9857[7][0] = 1507;
                                this.field9857[7][3] = 1702;
                                this.field9857[8][2] = 1590;
                                this.field9857[8][3] = 2056;
                                this.field9857[8][0] = 1736;
                                this.field9857[8][1] = 1108;
                                this.field9857[9][0] = 2088;
                                this.field9857[9][1] = 1766;
                                this.field9857[9][3] = 2666;
                                this.field9857[9][2] = 2056;
                                this.field9857[10][0] = 2355;
                                this.field9857[10][2] = 2586;
                                this.field9857[10][3] = 3276;
                                this.field9857[10][1] = 2409;
                                this.field9857[11][3] = 3228;
                                this.field9857[11][1] = 3116;
                                this.field9857[11][0] = 2691;
                                this.field9857[11][2] = 3148;
                                this.field9857[12][0] = 3031;
                                this.field9857[12][1] = 3806;
                                this.field9857[12][3] = 3196;
                                this.field9857[12][2] = 3710;
                                this.field9857[13][2] = 3421;
                                this.field9857[13][3] = 3019;
                                this.field9857[13][0] = 3522;
                                this.field9857[13][1] = 3437;
                                this.field9857[14][0] = 3727;
                                this.field9857[14][1] = 3116;
                                this.field9857[14][3] = 3228;
                                this.field9857[14][2] = 3148;
                                this.field9857[15][1] = 2377;
                                this.field9857[15][3] = 2746;
                                this.field9857[15][2] = 2505;
                                this.field9857[15][0] = 4096;
                            }
                        } else {
                            this.field9857 = new int[6][4];
                            this.field9857[0][1] = 0;
                            this.field9857[0][0] = 0;
                            this.field9857[0][2] = 0;
                            this.field9857[0][3] = 0;
                            this.field9857[1][2] = 0;
                            this.field9857[1][1] = 0;
                            this.field9857[1][3] = 1493;
                            this.field9857[1][0] = 1843;
                            this.field9857[2][0] = 2457;
                            this.field9857[2][1] = 0;
                            this.field9857[2][3] = 2939;
                            this.field9857[2][2] = 0;
                            this.field9857[3][3] = 3565;
                            this.field9857[3][0] = 2781;
                            this.field9857[3][1] = 0;
                            this.field9857[3][2] = 1124;
                            this.field9857[4][1] = 546;
                            this.field9857[4][3] = 4031;
                            this.field9857[4][0] = 3481;
                            this.field9857[4][2] = 3084;
                            this.field9857[5][0] = 4096;
                            this.field9857[5][3] = 4096;
                            this.field9857[5][1] = 4096;
                            this.field9857[5][2] = 4096;
                        }
                    } else {
                        this.field9857 = new int[7][4];
                        this.field9857[0][3] = 4096;
                        this.field9857[0][1] = 0;
                        this.field9857[0][2] = 0;
                        this.field9857[0][0] = 0;
                        this.field9857[1][1] = 0;
                        this.field9857[1][0] = 663;
                        this.field9857[1][3] = 4096;
                        this.field9857[1][2] = 4096;
                        this.field9857[2][2] = 4096;
                        this.field9857[2][1] = 0;
                        this.field9857[2][3] = 0;
                        this.field9857[2][0] = 1363;
                        this.field9857[3][1] = 4096;
                        this.field9857[3][2] = 4096;
                        this.field9857[3][3] = 0;
                        this.field9857[3][0] = 2048;
                        this.field9857[4][1] = 4096;
                        this.field9857[4][2] = 0;
                        this.field9857[4][3] = 0;
                        this.field9857[4][0] = 2727;
                        this.field9857[5][0] = 3411;
                        this.field9857[5][1] = 4096;
                        this.field9857[5][2] = 0;
                        this.field9857[5][3] = 4096;
                        this.field9857[6][1] = 0;
                        this.field9857[6][3] = 4096;
                        this.field9857[6][0] = 4096;
                        this.field9857[6][2] = 0;
                    }
                } else {
                    this.field9857 = new int[8][4];
                    this.field9857[0][2] = 2602;
                    this.field9857[0][1] = 2650;
                    this.field9857[0][0] = 0;
                    this.field9857[0][3] = 2361;
                    this.field9857[1][0] = 2867;
                    this.field9857[1][3] = 1558;
                    this.field9857[1][2] = 1799;
                    this.field9857[1][1] = 2313;
                    this.field9857[2][1] = 2618;
                    this.field9857[2][2] = 1734;
                    this.field9857[2][0] = 3072;
                    this.field9857[2][3] = 1413;
                    this.field9857[3][2] = 1220;
                    this.field9857[3][3] = 947;
                    this.field9857[3][1] = 2296;
                    this.field9857[3][0] = 3276;
                    this.field9857[4][0] = 3481;
                    this.field9857[4][2] = 963;
                    this.field9857[4][3] = 722;
                    this.field9857[4][1] = 2072;
                    this.field9857[5][2] = 2152;
                    this.field9857[5][3] = 1766;
                    this.field9857[5][1] = 2730;
                    this.field9857[5][0] = 3686;
                    this.field9857[6][1] = 2232;
                    this.field9857[6][3] = 915;
                    this.field9857[6][0] = 3891;
                    this.field9857[6][2] = 1060;
                    this.field9857[7][1] = 1686;
                    this.field9857[7][3] = 1140;
                    this.field9857[7][0] = 4096;
                    this.field9857[7][2] = 1413;
                }
            } else {
                this.field9857 = new int[2][4];
                this.field9857[0][3] = 0;
                this.field9857[0][2] = 0;
                this.field9857[0][1] = 0;
                this.field9857[0][0] = 0;
                this.field9857[1][2] = 4096;
                this.field9857[1][0] = 4096;
                this.field9857[1][3] = 4096;
                this.field9857[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field9853;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 <= 26) {
            return null;
        } else {
            if (super.field10312.field4922) {
                int[] var4 = this.method4115(-124, arg1, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; var8 < class29.field523; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field9852[var9];
                    var5[var8] = class702.method3949(var10 >> 12, 4080);
                    var6[var8] = class702.method3949(var10 >> 4, 4080);
                    var7[var8] = class702.method3949(4080, var10 << 4);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ldfa;Ldfa;I)V")
    public static final void method3971(class168 arg0, class168 arg1, int arg2) {
        if (arg1.field2332 != null) {
            arg1.method1175(arg2 ^ -2);
        }
        if (arg2 != 0) {
            method3971((class168) null, (class168) null, -75);
        }
        ++field9854;
        arg1.field2332 = arg0.field2332;
        arg1.field2336 = arg0;
        arg1.field2332.field2336 = arg1;
        arg1.field2336.field2332 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class710() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        ++field9859;
        if (this.field9857 == null) {
            this.method3970(1, (byte) 67);
        }
        if (arg0 != -21773) {
            this.method3970(-126, (byte) 114);
        }
        this.method3973((byte) 119);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3972(int arg0, String arg1) {
        ++field9856;
        if (arg0 != 18665) {
            method3971((class168) null, (class168) null, -27);
        }
        String var2 = class178.method1215((byte) -35, class633.method3550(arg1, 0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    private final void method3973(byte arg0) {
        ++field9862;
        int var2 = this.field9857.length;
        if (arg0 <= 113) {
            this.field9852 = null;
        }
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field9857[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field9857[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field9857[var4];
                    if (var4 <= 0) {
                        var9 = var11[3];
                        var10 = var11[1];
                        var8 = var11[2];
                    } else {
                        int[] var12 = this.field9857[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                int var17 = var8 >> 4;
                if (var15 < 0) {
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
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field9852[var3] = class683.method3840(var15, class683.method3840(var16 << 16, var17 << 8));
            }
        }
    }
}
