import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class166 extends class115 {

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "[I")
    private int[] field2411 = new int[257];

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static volatile int field2416 = 0;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lqd;")
    public static class37 field2407 = new class37(64);

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lqd;")
    public static class37 field2421 = new class37(5);

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2423 = new String[100];

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2424 = "Loaded interfaces";

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lve;")
    public static class233 field2420;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Ljava/awt/Frame;")
    public static Frame field2415;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "[[I")
    private int[][] field2410;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(II)V")
    public static final void method1105(int arg0, int arg1) {
        ++field2406;
        if (arg1 >= 0 && ~class19.field270.length < ~arg1) {
            if (arg0 != 24459) {
                method1108((byte) -114);
            }
            class19.field270[arg1] = !class19.field270[arg1];
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        ++field2412;
        if (this.field2410 == null) {
            this.method1109(0, 1);
        }
        int var2 = 56 / ((arg0 - 78) / 42);
        this.method1110(-31859);
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Llk;")
    public static final class244 method1106(int arg0) {
        ++field2417;
        if (arg0 <= 76) {
            method1107(-71, -70, -116, -7, 90, 4, -100, -54);
        }
        byte[] var1 = class263.field3965[0];
        int var2 = class282.field4500[0] * class246.field3682[0];
        class244 var6;
        if (class141.field2039[0]) {
            byte[] var3 = class152.field2199[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var2 > var5; ++var5) {
                var4[var5] = class163.method1093(class184.method1188(var3[var5], 255) << 24, class128.field1883[class184.method1188(var1[var5], 255)]);
            }
            var6 = new class201(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; ~var8 > ~var2; ++var8) {
                var7[var8] = class128.field1883[class184.method1188(var1[var8], 255)];
            }
            var6 = new class244(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], var7);
        }
        class290.method1935(0);
        return var6;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2408;
        int var8 = class177.method1152(class93.field1418, class254.field3857, arg1, 112);
        int var9 = class177.method1152(class93.field1418, class254.field3857, arg2, arg3 + 32211);
        int var10 = class177.method1152(class93.field1412, class142.field2061, arg4, 126);
        int var11 = class177.method1152(class93.field1412, class142.field2061, arg7, -89);
        int var12 = class177.method1152(class93.field1418, class254.field3857, arg0 + arg1, 4);
        int var13 = class177.method1152(class93.field1418, class254.field3857, arg2 - arg0, -99);
        for (int var14 = var8; ~var12 < ~var14; ++var14) {
            class183.method1181(arg5, (byte) -69, var11, class163.field2370[var14], var10);
        }
        for (int var15 = var9; var15 > var13; --var15) {
            class183.method1181(arg5, (byte) -69, var11, class163.field2370[var15], var10);
        }
        int var16 = class177.method1152(class93.field1412, class142.field2061, arg0 + arg4, 116);
        int var17 = class177.method1152(class93.field1412, class142.field2061, -arg0 + arg7, arg3 ^ -32327);
        if (arg3 == -32301) {
            for (int var18 = var12; var13 >= var18; ++var18) {
                int[] var19 = class163.field2370[var18];
                class183.method1181(arg5, (byte) -69, var16, var19, var10);
                class183.method1181(arg6, (byte) -69, var17, var19, var16);
                class183.method1181(arg5, (byte) -69, var11, var19, var17);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
    public static void method1108(byte arg0) {
        int var1 = 74 % ((arg0 - -55) / 37);
        field2424 = null;
        field2421 = null;
        field2407 = null;
        field2415 = null;
        field2423 = null;
        field2420 = null;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(II)V")
    private final void method1109(int arg0, int arg1) {
        ++field2409;
        if (arg0 == 0) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field2410 = new int[4][4];
                                        this.field2410[0][1] = 0;
                                        this.field2410[0][0] = 2048;
                                        this.field2410[1][0] = 2867;
                                        this.field2410[2][0] = 3276;
                                        this.field2410[1][1] = 4096;
                                        this.field2410[3][0] = 4096;
                                        this.field2410[0][3] = 0;
                                        this.field2410[2][1] = 4096;
                                        this.field2410[1][3] = 0;
                                        this.field2410[3][1] = 4096;
                                        this.field2410[0][2] = 4096;
                                        this.field2410[2][3] = 0;
                                        this.field2410[1][2] = 4096;
                                        this.field2410[2][2] = 4096;
                                        this.field2410[3][3] = 0;
                                        this.field2410[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field2410 = new int[16][4];
                                    this.field2410[0][0] = 0;
                                    this.field2410[1][0] = 155;
                                    this.field2410[0][1] = 80;
                                    this.field2410[0][3] = 321;
                                    this.field2410[1][3] = 562;
                                    this.field2410[2][0] = 389;
                                    this.field2410[0][2] = 192;
                                    this.field2410[3][0] = 671;
                                    this.field2410[1][2] = 449;
                                    this.field2410[4][0] = 897;
                                    this.field2410[2][3] = 803;
                                    this.field2410[5][0] = 1175;
                                    this.field2410[6][0] = 1368;
                                    this.field2410[2][2] = 690;
                                    this.field2410[3][3] = 1140;
                                    this.field2410[4][3] = 1509;
                                    this.field2410[1][1] = 321;
                                    this.field2410[3][2] = 995;
                                    this.field2410[5][3] = 1413;
                                    this.field2410[2][1] = 578;
                                    this.field2410[6][3] = 1333;
                                    this.field2410[7][3] = 1702;
                                    this.field2410[7][0] = 1507;
                                    this.field2410[8][3] = 2056;
                                    this.field2410[3][1] = 947;
                                    this.field2410[4][1] = 1285;
                                    this.field2410[9][3] = 2666;
                                    this.field2410[8][0] = 1736;
                                    this.field2410[9][0] = 2088;
                                    this.field2410[10][3] = 3276;
                                    this.field2410[11][3] = 3228;
                                    this.field2410[12][3] = 3196;
                                    this.field2410[13][3] = 3019;
                                    this.field2410[4][2] = 1397;
                                    this.field2410[5][2] = 1429;
                                    this.field2410[10][0] = 2355;
                                    this.field2410[14][3] = 3228;
                                    this.field2410[15][3] = 2746;
                                    this.field2410[5][1] = 1525;
                                    this.field2410[11][0] = 2691;
                                    this.field2410[12][0] = 3031;
                                    this.field2410[6][2] = 1461;
                                    this.field2410[6][1] = 1734;
                                    this.field2410[7][2] = 1525;
                                    this.field2410[13][0] = 3522;
                                    this.field2410[7][1] = 1413;
                                    this.field2410[14][0] = 3727;
                                    this.field2410[8][1] = 1108;
                                    this.field2410[9][1] = 1766;
                                    this.field2410[8][2] = 1590;
                                    this.field2410[15][0] = 4096;
                                    this.field2410[10][1] = 2409;
                                    this.field2410[11][1] = 3116;
                                    this.field2410[9][2] = 2056;
                                    this.field2410[10][2] = 2586;
                                    this.field2410[11][2] = 3148;
                                    this.field2410[12][1] = 3806;
                                    this.field2410[12][2] = 3710;
                                    this.field2410[13][2] = 3421;
                                    this.field2410[13][1] = 3437;
                                    this.field2410[14][1] = 3116;
                                    this.field2410[15][1] = 2377;
                                    this.field2410[14][2] = 3148;
                                    this.field2410[15][2] = 2505;
                                }
                            } else {
                                this.field2410 = new int[6][4];
                                this.field2410[0][3] = 0;
                                this.field2410[1][3] = 1493;
                                this.field2410[0][0] = 0;
                                this.field2410[0][1] = 0;
                                this.field2410[0][2] = 0;
                                this.field2410[1][2] = 0;
                                this.field2410[1][1] = 0;
                                this.field2410[2][1] = 0;
                                this.field2410[3][1] = 0;
                                this.field2410[4][1] = 546;
                                this.field2410[2][2] = 0;
                                this.field2410[5][1] = 4096;
                                this.field2410[2][3] = 2939;
                                this.field2410[1][0] = 1843;
                                this.field2410[2][0] = 2457;
                                this.field2410[3][0] = 2781;
                                this.field2410[4][0] = 3481;
                                this.field2410[5][0] = 4096;
                                this.field2410[3][2] = 1124;
                                this.field2410[4][2] = 3084;
                                this.field2410[3][3] = 3565;
                                this.field2410[5][2] = 4096;
                                this.field2410[4][3] = 4031;
                                this.field2410[5][3] = 4096;
                            }
                        } else {
                            this.field2410 = new int[7][4];
                            this.field2410[0][1] = 0;
                            this.field2410[0][0] = 0;
                            this.field2410[1][1] = 0;
                            this.field2410[2][1] = 0;
                            this.field2410[3][1] = 4096;
                            this.field2410[0][2] = 0;
                            this.field2410[1][0] = 663;
                            this.field2410[0][3] = 4096;
                            this.field2410[2][0] = 1363;
                            this.field2410[4][1] = 4096;
                            this.field2410[3][0] = 2048;
                            this.field2410[1][3] = 4096;
                            this.field2410[5][1] = 4096;
                            this.field2410[6][1] = 0;
                            this.field2410[2][3] = 0;
                            this.field2410[3][3] = 0;
                            this.field2410[4][3] = 0;
                            this.field2410[4][0] = 2727;
                            this.field2410[5][0] = 3411;
                            this.field2410[1][2] = 4096;
                            this.field2410[5][3] = 4096;
                            this.field2410[2][2] = 4096;
                            this.field2410[3][2] = 4096;
                            this.field2410[6][0] = 4096;
                            this.field2410[4][2] = 0;
                            this.field2410[6][3] = 4096;
                            this.field2410[5][2] = 0;
                            this.field2410[6][2] = 0;
                        }
                    } else {
                        this.field2410 = new int[8][4];
                        this.field2410[0][0] = 0;
                        this.field2410[1][0] = 2867;
                        this.field2410[0][1] = 2650;
                        this.field2410[0][2] = 2602;
                        this.field2410[1][1] = 2313;
                        this.field2410[2][1] = 2618;
                        this.field2410[0][3] = 2361;
                        this.field2410[2][0] = 3072;
                        this.field2410[3][0] = 3276;
                        this.field2410[4][0] = 3481;
                        this.field2410[5][0] = 3686;
                        this.field2410[1][3] = 1558;
                        this.field2410[6][0] = 3891;
                        this.field2410[2][3] = 1413;
                        this.field2410[3][1] = 2296;
                        this.field2410[7][0] = 4096;
                        this.field2410[4][1] = 2072;
                        this.field2410[5][1] = 2730;
                        this.field2410[1][2] = 1799;
                        this.field2410[3][3] = 947;
                        this.field2410[4][3] = 722;
                        this.field2410[6][1] = 2232;
                        this.field2410[5][3] = 1766;
                        this.field2410[6][3] = 915;
                        this.field2410[7][3] = 1140;
                        this.field2410[7][1] = 1686;
                        this.field2410[2][2] = 1734;
                        this.field2410[3][2] = 1220;
                        this.field2410[4][2] = 963;
                        this.field2410[5][2] = 2152;
                        this.field2410[6][2] = 1060;
                        this.field2410[7][2] = 1413;
                    }
                } else {
                    this.field2410 = new int[2][4];
                    this.field2410[0][2] = 0;
                    this.field2410[0][0] = 0;
                    this.field2410[1][2] = 4096;
                    this.field2410[0][1] = 0;
                    this.field2410[0][3] = 0;
                    this.field2410[1][1] = 4096;
                    this.field2410[1][0] = 4096;
                    this.field2410[1][3] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg1.method760(false);
            if (var4 != 0) {
                this.method1109(arg0 + 1, var4);
            } else {
                this.field2410 = new int[arg1.method760(false)][4];
                for (int var5 = 0; ~var5 > ~this.field2410.length; ++var5) {
                    this.field2410[var5][0] = arg1.method756(-29901);
                    this.field2410[var5][1] = arg1.method760(false) << 4;
                    this.field2410[var5][2] = arg1.method760(false) << 4;
                    this.field2410[var5][3] = arg1.method760(false) << 4;
                }
            }
        }
        if (arg0 != -1) {
            field2421 = null;
        }
        ++field2413;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    private final void method1110(int arg0) {
        ++field2414;
        if (arg0 != -31859) {
            field2416 = 60;
        }
        int var2 = this.field2410.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field2410[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 > ~var2) {
                    int[] var7 = this.field2410[var4];
                    if (~var4 >= -1) {
                        var8 = var7[3];
                        var9 = var7[1];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field2410[var4 - 1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = 4096 - var12;
                        var10 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        var9 = var7[1] * var12 - -(var11[1] * var13) >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field2410[var2 + -1];
                    var8 = var14[3];
                    var9 = var14[1];
                    var10 = var14[2];
                }
                int var15 = var10 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field2411[var3] = class163.method1093(class163.method1093(var17 << 16, var15 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 > -33) {
            this.method1109(98, 59);
        }
        ++field2419;
        int[][] var3 = super.field1716.method6(arg1, (byte) 55);
        if (super.field1716.field23) {
            int[] var4 = this.method797(0, arg1, 113);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class77.field1178 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2411[var9];
                var6[var8] = class184.method1188(4080, var10 >> 12);
                var5[var8] = class184.method1188(65280, var10) >> 4;
                var7[var8] = class184.method1188(255, var10) << 4;
            }
        }
        return var3;
    }
}
