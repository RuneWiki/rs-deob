import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rh")
public class class165 extends class85 {

    @OriginalMember(owner = "rh", name = "T", descriptor = "Llf;")
    public static class109 field3099 = class35.method275("::clientdrop", 2);

    @OriginalMember(owner = "rh", name = "V", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "rh", name = "Y", descriptor = "Llf;")
    public static class109 field3104 = class35.method275("Clientscript error in: ", 2);

    @OriginalMember(owner = "rh", name = "Q", descriptor = "I")
    public static int field3096 = 1;

    @OriginalMember(owner = "rh", name = "S", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "rh", name = "U", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "rh", name = "W", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "rh", name = "X", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "rh", name = "Z", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "rh", name = "R", descriptor = "[[I")
    private int[][] field3097;

    @OriginalMember(owner = "rh", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        ++field3102;
        if (arg0 != 25614) {
            this.method199(96);
        }
        if (this.field3097 == null) {
            this.method1115((byte) 18, 1);
        }
    }

    @OriginalMember(owner = "rh", name = "a", descriptor = "(BI)V")
    private final void method1115(byte arg0, int arg1) {
        ++field3100;
        int var3 = -95 / ((arg0 - 70) / 41);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3097 = new int[4][4];
                                    this.field3097[0][1] = 0;
                                    this.field3097[0][2] = 4096;
                                    this.field3097[0][3] = 0;
                                    this.field3097[1][2] = 4096;
                                    this.field3097[0][0] = 2048;
                                    this.field3097[1][0] = 2867;
                                    this.field3097[2][2] = 4096;
                                    this.field3097[1][1] = 4096;
                                    this.field3097[2][1] = 4096;
                                    this.field3097[3][1] = 4096;
                                    this.field3097[1][3] = 0;
                                    this.field3097[2][0] = 3276;
                                    this.field3097[3][2] = 0;
                                    this.field3097[3][0] = 4096;
                                    this.field3097[2][3] = 0;
                                    this.field3097[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3097 = new int[16][4];
                                this.field3097[0][1] = 80;
                                this.field3097[0][3] = 321;
                                this.field3097[1][1] = 321;
                                this.field3097[1][3] = 562;
                                this.field3097[2][1] = 578;
                                this.field3097[3][1] = 947;
                                this.field3097[0][0] = 0;
                                this.field3097[1][0] = 155;
                                this.field3097[2][0] = 389;
                                this.field3097[4][1] = 1285;
                                this.field3097[0][2] = 192;
                                this.field3097[5][1] = 1525;
                                this.field3097[1][2] = 449;
                                this.field3097[2][3] = 803;
                                this.field3097[2][2] = 690;
                                this.field3097[3][0] = 671;
                                this.field3097[3][2] = 995;
                                this.field3097[4][0] = 897;
                                this.field3097[4][2] = 1397;
                                this.field3097[6][1] = 1734;
                                this.field3097[5][0] = 1175;
                                this.field3097[7][1] = 1413;
                                this.field3097[3][3] = 1140;
                                this.field3097[4][3] = 1509;
                                this.field3097[8][1] = 1108;
                                this.field3097[5][3] = 1413;
                                this.field3097[6][0] = 1368;
                                this.field3097[6][3] = 1333;
                                this.field3097[9][1] = 1766;
                                this.field3097[5][2] = 1429;
                                this.field3097[10][1] = 2409;
                                this.field3097[7][0] = 1507;
                                this.field3097[11][1] = 3116;
                                this.field3097[12][1] = 3806;
                                this.field3097[13][1] = 3437;
                                this.field3097[6][2] = 1461;
                                this.field3097[7][2] = 1525;
                                this.field3097[8][0] = 1736;
                                this.field3097[9][0] = 2088;
                                this.field3097[7][3] = 1702;
                                this.field3097[8][3] = 2056;
                                this.field3097[8][2] = 1590;
                                this.field3097[10][0] = 2355;
                                this.field3097[14][1] = 3116;
                                this.field3097[9][3] = 2666;
                                this.field3097[15][1] = 2377;
                                this.field3097[9][2] = 2056;
                                this.field3097[11][0] = 2691;
                                this.field3097[12][0] = 3031;
                                this.field3097[10][2] = 2586;
                                this.field3097[11][2] = 3148;
                                this.field3097[12][2] = 3710;
                                this.field3097[10][3] = 3276;
                                this.field3097[13][0] = 3522;
                                this.field3097[13][2] = 3421;
                                this.field3097[14][2] = 3148;
                                this.field3097[15][2] = 2505;
                                this.field3097[11][3] = 3228;
                                this.field3097[14][0] = 3727;
                                this.field3097[12][3] = 3196;
                                this.field3097[15][0] = 4096;
                                this.field3097[13][3] = 3019;
                                this.field3097[14][3] = 3228;
                                this.field3097[15][3] = 2746;
                            }
                        } else {
                            this.field3097 = new int[6][4];
                            this.field3097[0][2] = 0;
                            this.field3097[0][3] = 0;
                            this.field3097[0][0] = 0;
                            this.field3097[1][0] = 1843;
                            this.field3097[2][0] = 2457;
                            this.field3097[0][1] = 0;
                            this.field3097[1][2] = 0;
                            this.field3097[1][1] = 0;
                            this.field3097[2][1] = 0;
                            this.field3097[3][0] = 2781;
                            this.field3097[4][0] = 3481;
                            this.field3097[2][2] = 0;
                            this.field3097[3][2] = 1124;
                            this.field3097[5][0] = 4096;
                            this.field3097[1][3] = 1493;
                            this.field3097[2][3] = 2939;
                            this.field3097[4][2] = 3084;
                            this.field3097[5][2] = 4096;
                            this.field3097[3][1] = 0;
                            this.field3097[4][1] = 546;
                            this.field3097[3][3] = 3565;
                            this.field3097[5][1] = 4096;
                            this.field3097[4][3] = 4031;
                            this.field3097[5][3] = 4096;
                        }
                    } else {
                        this.field3097 = new int[7][4];
                        this.field3097[0][3] = 4096;
                        this.field3097[0][1] = 0;
                        this.field3097[0][0] = 0;
                        this.field3097[1][1] = 0;
                        this.field3097[2][1] = 0;
                        this.field3097[1][3] = 4096;
                        this.field3097[2][3] = 0;
                        this.field3097[0][2] = 0;
                        this.field3097[3][3] = 0;
                        this.field3097[3][1] = 4096;
                        this.field3097[4][3] = 0;
                        this.field3097[4][1] = 4096;
                        this.field3097[1][0] = 663;
                        this.field3097[5][3] = 4096;
                        this.field3097[5][1] = 4096;
                        this.field3097[1][2] = 4096;
                        this.field3097[6][3] = 4096;
                        this.field3097[2][2] = 4096;
                        this.field3097[6][1] = 0;
                        this.field3097[3][2] = 4096;
                        this.field3097[4][2] = 0;
                        this.field3097[2][0] = 1363;
                        this.field3097[5][2] = 0;
                        this.field3097[6][2] = 0;
                        this.field3097[3][0] = 2048;
                        this.field3097[4][0] = 2727;
                        this.field3097[5][0] = 3411;
                        this.field3097[6][0] = 4096;
                    }
                } else {
                    this.field3097 = new int[8][4];
                    this.field3097[0][1] = 2650;
                    this.field3097[0][3] = 2361;
                    this.field3097[1][3] = 1558;
                    this.field3097[2][3] = 1413;
                    this.field3097[1][1] = 2313;
                    this.field3097[0][0] = 0;
                    this.field3097[1][0] = 2867;
                    this.field3097[2][1] = 2618;
                    this.field3097[2][0] = 3072;
                    this.field3097[3][3] = 947;
                    this.field3097[3][1] = 2296;
                    this.field3097[4][3] = 722;
                    this.field3097[3][0] = 3276;
                    this.field3097[4][0] = 3481;
                    this.field3097[4][1] = 2072;
                    this.field3097[5][0] = 3686;
                    this.field3097[5][3] = 1766;
                    this.field3097[6][3] = 915;
                    this.field3097[0][2] = 2602;
                    this.field3097[1][2] = 1799;
                    this.field3097[6][0] = 3891;
                    this.field3097[7][3] = 1140;
                    this.field3097[2][2] = 1734;
                    this.field3097[3][2] = 1220;
                    this.field3097[5][1] = 2730;
                    this.field3097[7][0] = 4096;
                    this.field3097[6][1] = 2232;
                    this.field3097[7][1] = 1686;
                    this.field3097[4][2] = 963;
                    this.field3097[5][2] = 2152;
                    this.field3097[6][2] = 1060;
                    this.field3097[7][2] = 1413;
                }
            } else {
                this.field3097 = new int[2][4];
                this.field3097[0][0] = 0;
                this.field3097[0][1] = 0;
                this.field3097[0][2] = 0;
                this.field3097[0][3] = 0;
                this.field3097[1][3] = 4096;
                this.field3097[1][1] = 4096;
                this.field3097[1][0] = 4096;
                this.field3097[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "rh", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field3105;
        if (arg1 != 2177) {
            this.method29(-24, -107);
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int var4 = this.field3097.length;
            int[] var5 = this.method540(arg0, -127, 0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            if (var4 <= 0) {
                for (int var9 = 0; var9 < class57.field1152; ++var9) {
                    var7[var9] = 0;
                    var6[var9] = 0;
                    var8[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < class57.field1152; ++var10) {
                    int var11 = 0;
                    int var12 = var5[var10];
                    for (int var13 = 0; var4 > var13 && var12 >= this.field3097[var13][0]; ++var13) {
                        ++var11;
                    }
                    if (~var4 < ~var11) {
                        int[] var14 = this.field3097[var11];
                        if (var11 <= 0) {
                            var7[var10] = var14[1];
                            var6[var10] = var14[2];
                            var8[var10] = var14[3];
                        } else {
                            int[] var15 = this.field3097[var11 + -1];
                            int var16 = (-var15[0] + var12 << 12) / (var14[0] - var15[0]);
                            int var17 = -var16 + 4096;
                            var7[var10] = var14[1] * var16 + var15[1] * var17 >> 12;
                            var6[var10] = var14[2] * var16 + var15[2] * var17 >> 12;
                            var8[var10] = var14[3] * var16 - -(var15[3] * var17) >> 12;
                        }
                    } else {
                        int[] var18 = this.field3097[var4 + -1];
                        var7[var10] = var18[1];
                        var6[var10] = var18[2];
                        var8[var10] = var18[3];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "rh", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, false);
    }

    @OriginalMember(owner = "rh", name = "e", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field3104 = null;
        if (arg0 < 113) {
            field3101 = -117;
        }
        field3099 = null;
    }

    @OriginalMember(owner = "rh", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field3098;
        if (arg1 == 0) {
            int var4 = arg2.method598((byte) 116);
            if (~var4 == -1) {
                this.field3097 = new int[arg2.method598((byte) 98)][4];
                for (int var5 = 0; ~var5 > ~this.field3097.length; ++var5) {
                    this.field3097[var5][0] = arg2.method569(true);
                    this.field3097[var5][1] = arg2.method598((byte) 100) << 4;
                    this.field3097[var5][2] = arg2.method598((byte) 79) << 4;
                    this.field3097[var5][3] = arg2.method598((byte) 96) << 4;
                }
            } else {
                this.method1115((byte) -36, var4);
            }
        }
        if (arg0 >= -120) {
            field3099 = null;
        }
    }
}
