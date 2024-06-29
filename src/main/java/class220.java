import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class220 extends class23 {

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
    private int[] field4164 = new int[257];

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "[I")
    public static int[] field4152 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Li;")
    private static class88 field4156 = class208.method1425(105, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "[[B")
    public static byte[][] field4157 = new byte[1000][];

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field4166 = -1;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Li;")
    public static class88 field4167 = field4156;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[[I")
    private int[][] field4155;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "[[[B")
    public static byte[][][] field4168;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class220() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            field4152 = null;
        }
        ++field4154;
        if (arg2 == 0) {
            int var4 = arg0.method347(26119);
            if (~var4 != -1) {
                this.method1489((byte) -79, var4);
            } else {
                this.field4155 = new int[arg0.method347(26119)][4];
                for (int var5 = 0; ~var5 > ~this.field4155.length; ++var5) {
                    this.field4155[var5][0] = arg0.method301(63);
                    this.field4155[var5][1] = arg0.method347(class180.method1287(arg1, -26118)) << 4;
                    this.field4155[var5][2] = arg0.method347(26119) << 4;
                    this.field4155[var5][3] = arg0.method347(arg1 + 26122) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Component;Lqg;BI)Lej;")
    public static final class55 method1485(int arg0, Component arg1, class181 arg2, byte arg3, int arg4) {
        ++field4161;
        if (class11.field161 == 0) {
            throw new IllegalStateException();
        } else if (~arg0 <= -1 && arg0 < 2) {
            int var5 = 17 % ((arg3 - 22) / 43);
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class55 var6 = (class55) Class.forName("ii").newInstance();
                var6.field1043 = arg4;
                var6.field1025 = new int[(class7.field99 ? 2 : 1) * 256];
                var6.method412(arg1);
                var6.field1038 = (arg4 & -1024) + 1024;
                if (~var6.field1038 < -16385) {
                    var6.field1038 = 16384;
                }
                var6.method409(var6.field1038);
                if (class221.field4169 > 0 && class146.field2740 == null) {
                    class146.field2740 = new class161();
                    class146.field2740.field3111 = arg2;
                    arg2.method1289(2, class146.field2740, class221.field4169);
                }
                if (class146.field2740 != null) {
                    if (class146.field2740.field3104[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class146.field2740.field3104[arg0] = var6;
                }
                return var6;
            } catch (Throwable var9) {
                try {
                    class84 var7 = new class84(arg2, arg0);
                    var7.field1025 = new int[256 * (class7.field99 ? 2 : 1)];
                    var7.field1043 = arg4;
                    var7.method412(arg1);
                    var7.field1038 = 16384;
                    var7.method409(var7.field1038);
                    if (~class221.field4169 < -1 && class146.field2740 == null) {
                        class146.field2740 = new class161();
                        class146.field2740.field3111 = arg2;
                        arg2.method1289(2, class146.field2740, class221.field4169);
                    }
                    if (class146.field2740 != null) {
                        if (class146.field2740.field3104[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class146.field2740.field3104[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class55();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method1486(byte arg0) {
        field4157 = null;
        field4167 = null;
        field4168 = null;
        field4156 = null;
        field4152 = null;
        int var1 = -125 / ((-4 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    private final void method1487(byte arg0) {
        if (arg0 == -123) {
            ++field4163;
            int var2 = this.field4155.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && this.field4155[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field4155[var4];
                        if (~var4 < -1) {
                            int[] var8 = this.field4155[var4 + -1];
                            int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                            var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                        } else {
                            var13 = var7[2];
                            var12 = var7[1];
                            var11 = var7[3];
                        }
                    } else {
                        int[] var14 = this.field4155[var2 - 1];
                        var13 = var14[2];
                        var12 = var14[1];
                        var11 = var14[3];
                    }
                    int var15 = var12 >> 4;
                    int var16 = var11 >> 4;
                    int var17 = var13 >> 4;
                    if (var15 >= 0) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var17 >= 0) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    this.field4164[var3] = class204.method1405(var16, class204.method1405(var17 << 8, var15 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class159 var10 = null;
        ++field4162;
        for (class159 var11 = (class159) class62.field1140.method1612(false); var11 != null; var11 = (class159) class62.field1140.method1621(82)) {
            if (var11.field3057 == arg6 && var11.field3061 == arg7 && ~var11.field3054 == ~arg1 && var11.field3065 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class159();
            var10.field3054 = arg1;
            var10.field3065 = arg2;
            var10.field3061 = arg7;
            var10.field3057 = arg6;
            class172.method1221(arg8 + -2, var10);
            class62.field1140.method1624(var10, 127);
        }
        var10.field3064 = arg5;
        var10.field3070 = arg3;
        var10.field3063 = arg4;
        var10.field3053 = arg9;
        if (arg8 != 0) {
            method1488(86, -33, 53, 91, -123, 6, 23, -123, 108, 62);
        }
        var10.field3056 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
    private final void method1489(byte arg0, int arg1) {
        ++field4165;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4155 = new int[4][4];
                                this.field4155[0][1] = 0;
                                this.field4155[1][1] = 4096;
                                this.field4155[2][1] = 4096;
                                this.field4155[0][0] = 2048;
                                this.field4155[3][1] = 4096;
                                this.field4155[0][3] = 0;
                                this.field4155[1][3] = 0;
                                this.field4155[0][2] = 4096;
                                this.field4155[1][2] = 4096;
                                this.field4155[2][3] = 0;
                                this.field4155[3][3] = 0;
                                this.field4155[2][2] = 4096;
                                this.field4155[3][2] = 0;
                                this.field4155[1][0] = 2867;
                                this.field4155[2][0] = 3276;
                                this.field4155[3][0] = 4096;
                            } else {
                                this.field4155 = new int[16][4];
                                this.field4155[0][3] = 321;
                                this.field4155[1][3] = 562;
                                this.field4155[2][3] = 803;
                                this.field4155[3][3] = 1140;
                                this.field4155[0][1] = 80;
                                this.field4155[4][3] = 1509;
                                this.field4155[1][1] = 321;
                                this.field4155[0][0] = 0;
                                this.field4155[5][3] = 1413;
                                this.field4155[0][2] = 192;
                                this.field4155[6][3] = 1333;
                                this.field4155[1][2] = 449;
                                this.field4155[2][2] = 690;
                                this.field4155[2][1] = 578;
                                this.field4155[7][3] = 1702;
                                this.field4155[8][3] = 2056;
                                this.field4155[1][0] = 155;
                                this.field4155[9][3] = 2666;
                                this.field4155[3][2] = 995;
                                this.field4155[10][3] = 3276;
                                this.field4155[2][0] = 389;
                                this.field4155[3][1] = 947;
                                this.field4155[4][1] = 1285;
                                this.field4155[11][3] = 3228;
                                this.field4155[3][0] = 671;
                                this.field4155[12][3] = 3196;
                                this.field4155[5][1] = 1525;
                                this.field4155[4][0] = 897;
                                this.field4155[13][3] = 3019;
                                this.field4155[6][1] = 1734;
                                this.field4155[7][1] = 1413;
                                this.field4155[14][3] = 3228;
                                this.field4155[4][2] = 1397;
                                this.field4155[5][0] = 1175;
                                this.field4155[8][1] = 1108;
                                this.field4155[5][2] = 1429;
                                this.field4155[15][3] = 2746;
                                this.field4155[6][2] = 1461;
                                this.field4155[6][0] = 1368;
                                this.field4155[7][0] = 1507;
                                this.field4155[7][2] = 1525;
                                this.field4155[8][2] = 1590;
                                this.field4155[9][1] = 1766;
                                this.field4155[8][0] = 1736;
                                this.field4155[9][0] = 2088;
                                this.field4155[10][0] = 2355;
                                this.field4155[11][0] = 2691;
                                this.field4155[12][0] = 3031;
                                this.field4155[10][1] = 2409;
                                this.field4155[9][2] = 2056;
                                this.field4155[11][1] = 3116;
                                this.field4155[13][0] = 3522;
                                this.field4155[12][1] = 3806;
                                this.field4155[13][1] = 3437;
                                this.field4155[14][1] = 3116;
                                this.field4155[14][0] = 3727;
                                this.field4155[15][1] = 2377;
                                this.field4155[10][2] = 2586;
                                this.field4155[15][0] = 4096;
                                this.field4155[11][2] = 3148;
                                this.field4155[12][2] = 3710;
                                this.field4155[13][2] = 3421;
                                this.field4155[14][2] = 3148;
                                this.field4155[15][2] = 2505;
                            }
                        } else {
                            this.field4155 = new int[6][4];
                            this.field4155[0][0] = 0;
                            this.field4155[1][0] = 1843;
                            this.field4155[0][3] = 0;
                            this.field4155[1][3] = 1493;
                            this.field4155[0][2] = 0;
                            this.field4155[2][0] = 2457;
                            this.field4155[0][1] = 0;
                            this.field4155[3][0] = 2781;
                            this.field4155[1][2] = 0;
                            this.field4155[2][3] = 2939;
                            this.field4155[3][3] = 3565;
                            this.field4155[2][2] = 0;
                            this.field4155[4][3] = 4031;
                            this.field4155[4][0] = 3481;
                            this.field4155[1][1] = 0;
                            this.field4155[5][0] = 4096;
                            this.field4155[2][1] = 0;
                            this.field4155[3][2] = 1124;
                            this.field4155[3][1] = 0;
                            this.field4155[4][2] = 3084;
                            this.field4155[4][1] = 546;
                            this.field4155[5][3] = 4096;
                            this.field4155[5][1] = 4096;
                            this.field4155[5][2] = 4096;
                        }
                    } else {
                        this.field4155 = new int[7][4];
                        this.field4155[0][3] = 4096;
                        this.field4155[0][0] = 0;
                        this.field4155[0][2] = 0;
                        this.field4155[0][1] = 0;
                        this.field4155[1][2] = 4096;
                        this.field4155[1][0] = 663;
                        this.field4155[1][1] = 0;
                        this.field4155[2][2] = 4096;
                        this.field4155[1][3] = 4096;
                        this.field4155[2][1] = 0;
                        this.field4155[3][2] = 4096;
                        this.field4155[2][3] = 0;
                        this.field4155[4][2] = 0;
                        this.field4155[3][1] = 4096;
                        this.field4155[4][1] = 4096;
                        this.field4155[2][0] = 1363;
                        this.field4155[5][1] = 4096;
                        this.field4155[6][1] = 0;
                        this.field4155[3][0] = 2048;
                        this.field4155[3][3] = 0;
                        this.field4155[5][2] = 0;
                        this.field4155[6][2] = 0;
                        this.field4155[4][0] = 2727;
                        this.field4155[4][3] = 0;
                        this.field4155[5][3] = 4096;
                        this.field4155[5][0] = 3411;
                        this.field4155[6][0] = 4096;
                        this.field4155[6][3] = 4096;
                    }
                } else {
                    this.field4155 = new int[8][4];
                    this.field4155[0][3] = 2361;
                    this.field4155[0][0] = 0;
                    this.field4155[0][1] = 2650;
                    this.field4155[1][0] = 2867;
                    this.field4155[1][3] = 1558;
                    this.field4155[1][1] = 2313;
                    this.field4155[2][1] = 2618;
                    this.field4155[3][1] = 2296;
                    this.field4155[4][1] = 2072;
                    this.field4155[0][2] = 2602;
                    this.field4155[2][3] = 1413;
                    this.field4155[2][0] = 3072;
                    this.field4155[3][0] = 3276;
                    this.field4155[5][1] = 2730;
                    this.field4155[6][1] = 2232;
                    this.field4155[7][1] = 1686;
                    this.field4155[3][3] = 947;
                    this.field4155[1][2] = 1799;
                    this.field4155[4][3] = 722;
                    this.field4155[2][2] = 1734;
                    this.field4155[5][3] = 1766;
                    this.field4155[4][0] = 3481;
                    this.field4155[3][2] = 1220;
                    this.field4155[6][3] = 915;
                    this.field4155[4][2] = 963;
                    this.field4155[5][2] = 2152;
                    this.field4155[7][3] = 1140;
                    this.field4155[6][2] = 1060;
                    this.field4155[7][2] = 1413;
                    this.field4155[5][0] = 3686;
                    this.field4155[6][0] = 3891;
                    this.field4155[7][0] = 4096;
                }
            } else {
                this.field4155 = new int[2][4];
                this.field4155[0][2] = 0;
                this.field4155[0][0] = 0;
                this.field4155[0][3] = 0;
                this.field4155[1][3] = 4096;
                this.field4155[0][1] = 0;
                this.field4155[1][0] = 4096;
                this.field4155[1][1] = 4096;
                this.field4155[1][2] = 4096;
            }
        }
        int var4 = 81 / ((38 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (this.field4155 == null) {
            this.method1489((byte) -91, 1);
        }
        if (arg0 != -69) {
            this.field4164 = null;
        }
        ++field4153;
        this.method1487((byte) -123);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        if (arg1 != 13) {
            field4152 = null;
        }
        ++field4151;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[] var4 = this.method120(arg0, false, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class70.field1276 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4164[var9];
                var5[var8] = class70.method470(var10 >> 12, 4080);
                var6[var8] = class70.method470(65280, var10) >> 4;
                var7[var8] = class70.method470(4080, var10 << 4);
            }
        }
        return var3;
    }
}
