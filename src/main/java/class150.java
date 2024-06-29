import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class150 extends class300 {

    @OriginalMember(owner = "client!g", name = "X", descriptor = "[I")
    private int[] field2223 = new int[257];

    @OriginalMember(owner = "client!g", name = "N", descriptor = "J")
    public static long field2213 = 0L;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2212 = "glow1:";

    @OriginalMember(owner = "client!g", name = "P", descriptor = "[I")
    public static int[] field2215 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!g", name = "F", descriptor = "[J")
    public static long[] field2205 = new long[500];

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lv;")
    public static class67 field2218 = new class67(5000);

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "[[I")
    private int[][] field2207;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "[[[B")
    public static byte[][][] field2211;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V")
    public static final void method1012(byte arg0, int arg1, int arg2) {
        ++field2206;
        class181 var3 = class95.method652(13, (byte) 34, arg2);
        if (arg0 == -52) {
            var3.method1285((byte) 64);
            var3.field2847 = arg1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLvl;)V")
    public static final void method1013(byte arg0, class73 arg1) {
        int var2 = -98 / ((-54 - arg0) / 62);
        class255.field4158 = arg1;
        ++field2221;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method1014(boolean arg0) {
        ++field2216;
        if (!class147.field2187) {
            class89.field1345 = true;
            class147.field2187 = arg0;
            if (class180.field2832) {
                class215.field3356 = (float) ((int) class215.field3356 + -17 & -16);
            } else {
                class233.field3768 += (-12.0F - class233.field3768) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    private final void method1015(boolean arg0, int arg1) {
        ++field2209;
        if (!arg0) {
            field2215 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2207 = new int[4][4];
                                    this.field2207[0][2] = 4096;
                                    this.field2207[1][2] = 4096;
                                    this.field2207[0][1] = 0;
                                    this.field2207[2][2] = 4096;
                                    this.field2207[0][0] = 2048;
                                    this.field2207[1][1] = 4096;
                                    this.field2207[3][2] = 0;
                                    this.field2207[1][0] = 2867;
                                    this.field2207[2][0] = 3276;
                                    this.field2207[3][0] = 4096;
                                    this.field2207[2][1] = 4096;
                                    this.field2207[3][1] = 4096;
                                    this.field2207[0][3] = 0;
                                    this.field2207[1][3] = 0;
                                    this.field2207[2][3] = 0;
                                    this.field2207[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2207 = new int[16][4];
                                this.field2207[0][3] = 321;
                                this.field2207[0][2] = 192;
                                this.field2207[1][3] = 562;
                                this.field2207[1][2] = 449;
                                this.field2207[0][1] = 80;
                                this.field2207[1][1] = 321;
                                this.field2207[2][3] = 803;
                                this.field2207[3][3] = 1140;
                                this.field2207[4][3] = 1509;
                                this.field2207[2][2] = 690;
                                this.field2207[2][1] = 578;
                                this.field2207[3][1] = 947;
                                this.field2207[3][2] = 995;
                                this.field2207[0][0] = 0;
                                this.field2207[1][0] = 155;
                                this.field2207[2][0] = 389;
                                this.field2207[4][1] = 1285;
                                this.field2207[5][1] = 1525;
                                this.field2207[3][0] = 671;
                                this.field2207[4][0] = 897;
                                this.field2207[6][1] = 1734;
                                this.field2207[7][1] = 1413;
                                this.field2207[8][1] = 1108;
                                this.field2207[4][2] = 1397;
                                this.field2207[5][3] = 1413;
                                this.field2207[5][2] = 1429;
                                this.field2207[5][0] = 1175;
                                this.field2207[9][1] = 1766;
                                this.field2207[6][2] = 1461;
                                this.field2207[10][1] = 2409;
                                this.field2207[7][2] = 1525;
                                this.field2207[6][3] = 1333;
                                this.field2207[11][1] = 3116;
                                this.field2207[7][3] = 1702;
                                this.field2207[8][3] = 2056;
                                this.field2207[9][3] = 2666;
                                this.field2207[8][2] = 1590;
                                this.field2207[9][2] = 2056;
                                this.field2207[10][2] = 2586;
                                this.field2207[11][2] = 3148;
                                this.field2207[12][1] = 3806;
                                this.field2207[10][3] = 3276;
                                this.field2207[11][3] = 3228;
                                this.field2207[12][3] = 3196;
                                this.field2207[6][0] = 1368;
                                this.field2207[7][0] = 1507;
                                this.field2207[8][0] = 1736;
                                this.field2207[13][3] = 3019;
                                this.field2207[13][1] = 3437;
                                this.field2207[12][2] = 3710;
                                this.field2207[14][1] = 3116;
                                this.field2207[9][0] = 2088;
                                this.field2207[13][2] = 3421;
                                this.field2207[10][0] = 2355;
                                this.field2207[14][2] = 3148;
                                this.field2207[15][1] = 2377;
                                this.field2207[14][3] = 3228;
                                this.field2207[11][0] = 2691;
                                this.field2207[15][2] = 2505;
                                this.field2207[15][3] = 2746;
                                this.field2207[12][0] = 3031;
                                this.field2207[13][0] = 3522;
                                this.field2207[14][0] = 3727;
                                this.field2207[15][0] = 4096;
                            }
                        } else {
                            this.field2207 = new int[6][4];
                            this.field2207[0][0] = 0;
                            this.field2207[1][0] = 1843;
                            this.field2207[0][3] = 0;
                            this.field2207[2][0] = 2457;
                            this.field2207[3][0] = 2781;
                            this.field2207[4][0] = 3481;
                            this.field2207[0][1] = 0;
                            this.field2207[5][0] = 4096;
                            this.field2207[1][3] = 1493;
                            this.field2207[0][2] = 0;
                            this.field2207[1][1] = 0;
                            this.field2207[2][1] = 0;
                            this.field2207[3][1] = 0;
                            this.field2207[4][1] = 546;
                            this.field2207[5][1] = 4096;
                            this.field2207[1][2] = 0;
                            this.field2207[2][2] = 0;
                            this.field2207[3][2] = 1124;
                            this.field2207[4][2] = 3084;
                            this.field2207[5][2] = 4096;
                            this.field2207[2][3] = 2939;
                            this.field2207[3][3] = 3565;
                            this.field2207[4][3] = 4031;
                            this.field2207[5][3] = 4096;
                        }
                    } else {
                        this.field2207 = new int[7][4];
                        this.field2207[0][1] = 0;
                        this.field2207[0][3] = 4096;
                        this.field2207[0][2] = 0;
                        this.field2207[1][2] = 4096;
                        this.field2207[1][1] = 0;
                        this.field2207[0][0] = 0;
                        this.field2207[2][2] = 4096;
                        this.field2207[1][3] = 4096;
                        this.field2207[3][2] = 4096;
                        this.field2207[1][0] = 663;
                        this.field2207[2][0] = 1363;
                        this.field2207[2][3] = 0;
                        this.field2207[2][1] = 0;
                        this.field2207[3][3] = 0;
                        this.field2207[4][3] = 0;
                        this.field2207[3][0] = 2048;
                        this.field2207[5][3] = 4096;
                        this.field2207[6][3] = 4096;
                        this.field2207[3][1] = 4096;
                        this.field2207[4][1] = 4096;
                        this.field2207[4][0] = 2727;
                        this.field2207[5][1] = 4096;
                        this.field2207[4][2] = 0;
                        this.field2207[5][0] = 3411;
                        this.field2207[6][0] = 4096;
                        this.field2207[5][2] = 0;
                        this.field2207[6][2] = 0;
                        this.field2207[6][1] = 0;
                    }
                } else {
                    this.field2207 = new int[8][4];
                    this.field2207[0][2] = 2602;
                    this.field2207[0][0] = 0;
                    this.field2207[1][2] = 1799;
                    this.field2207[0][3] = 2361;
                    this.field2207[0][1] = 2650;
                    this.field2207[1][3] = 1558;
                    this.field2207[1][1] = 2313;
                    this.field2207[2][2] = 1734;
                    this.field2207[3][2] = 1220;
                    this.field2207[1][0] = 2867;
                    this.field2207[2][1] = 2618;
                    this.field2207[2][0] = 3072;
                    this.field2207[3][0] = 3276;
                    this.field2207[4][2] = 963;
                    this.field2207[4][0] = 3481;
                    this.field2207[5][0] = 3686;
                    this.field2207[5][2] = 2152;
                    this.field2207[2][3] = 1413;
                    this.field2207[3][3] = 947;
                    this.field2207[3][1] = 2296;
                    this.field2207[4][3] = 722;
                    this.field2207[6][0] = 3891;
                    this.field2207[7][0] = 4096;
                    this.field2207[6][2] = 1060;
                    this.field2207[5][3] = 1766;
                    this.field2207[6][3] = 915;
                    this.field2207[7][3] = 1140;
                    this.field2207[7][2] = 1413;
                    this.field2207[4][1] = 2072;
                    this.field2207[5][1] = 2730;
                    this.field2207[6][1] = 2232;
                    this.field2207[7][1] = 1686;
                }
            } else {
                this.field2207 = new int[2][4];
                this.field2207[0][1] = 0;
                this.field2207[0][3] = 0;
                this.field2207[1][3] = 4096;
                this.field2207[1][1] = 4096;
                this.field2207[0][0] = 0;
                this.field2207[1][0] = 4096;
                this.field2207[0][2] = 0;
                this.field2207[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = 8 / (-arg0 / 47);
        ++field2220;
        int[][] var4 = super.field4786.method538(arg1, (byte) -86);
        if (super.field4786.field1200) {
            int[] var5 = this.method2018(0, -1, arg1);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; ~var9 > ~class180.field2826; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field2223[var10];
                var6[var9] = class205.method1411(var11 >> 12, 4080);
                var7[var9] = class205.method1411(4080, var11 >> 4);
                var8[var9] = class205.method1411(255, var11) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        field2215 = null;
        field2218 = null;
        field2211 = null;
        field2205 = null;
        if (arg0 < 21) {
            method1018(false);
        }
        field2212 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
    private final void method1017(boolean arg0) {
        ++field2219;
        if (!arg0) {
            int var2 = this.field2207.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && ~this.field2207[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 <= ~var2) {
                        int[] var7 = this.field2207[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field2207[var4];
                        if (var4 <= 0) {
                            var10 = var11[1];
                            var8 = var11[2];
                            var9 = var11[3];
                        } else {
                            int[] var12 = this.field2207[var4 + -1];
                            int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        }
                    }
                    int var15 = var10 >> 4;
                    int var16 = var9 >> 4;
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    int var17 = var8 >> 4;
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field2223[var3] = class243.method1723(var16, class243.method1723(var17 << 8, var15 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (this.field2207 == null) {
            this.method1015(true, 1);
        }
        this.method1017(false);
        if (arg0 <= 126) {
            this.method36(111, -38);
        }
        ++field2208;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method1218(-96);
            if (var4 != 0) {
                this.method1015(true, var4);
            } else {
                this.field2207 = new int[arg0.method1218(-85)][4];
                for (int var5 = 0; ~this.field2207.length < ~var5; ++var5) {
                    this.field2207[var5][0] = arg0.method1186((byte) -118);
                    this.field2207[var5][1] = arg0.method1218(96) << 4;
                    this.field2207[var5][2] = arg0.method1218(91) << 4;
                    this.field2207[var5][3] = arg0.method1218(-98) << 4;
                }
            }
        }
        ++field2217;
        if (arg1 >= -43) {
            field2212 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)V")
    public static final void method1018(boolean arg0) {
        if (arg0) {
            field2215 = null;
        }
        ++field2222;
        class209.field3270 = new class220();
    }
}
