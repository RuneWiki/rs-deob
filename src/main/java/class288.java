import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class288 extends class694 {

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "[I")
    private int[] field4004 = new int[257];

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Llaa;")
    public static class106 field4005 = new class106(13, 0, 1, 0);

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Llaa;")
    public static class106 field4011 = new class106(11, 0, 1, 2);

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Z")
    public static boolean field4013 = false;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lql;")
    public static class674 field4014 = new class674(5000);

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[[I")
    private int[][] field4006;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V", line = 17)
    public static final void method1731(int arg0) {
        ++field4002;
        int var1 = class64.field851;
        int[] var2 = class53.field759;
        for (int var3 = 0; ~var1 < ~var3; ++var3) {
            class286 var9 = class495.field6821[var2[var3]];
            if (var9 != null && ~var9.field6473 < -1) {
                --var9.field6473;
                if (var9.field6473 == 0) {
                    var9.field6405 = null;
                }
            }
        }
        for (int var4 = 0; ~var4 > ~class602.field8365; ++var4) {
            long var5 = (long) class594.field8262[var4];
            class178 var7 = (class178) class323.field4762.method2061(-17305, var5);
            if (var7 != null) {
                class225 var8 = var7.field2634;
                if (~var8.field6473 < -1) {
                    --var8.field6473;
                    if (~var8.field6473 == -1) {
                        var8.field6405 = null;
                    }
                }
            }
        }
        if (arg0 != -27271) {
            field4011 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V", line = 77)
    public final void method40(int arg0) {
        ++field4010;
        if (this.field4006 == null) {
            this.method1732(1, -118);
        }
        if (arg0 >= 5) {
            this.method1735((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)V", line = 91)
    private final void method1732(int arg0, int arg1) {
        ++field4009;
        if (arg1 <= -99) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field4006 = new int[4][4];
                                        this.field4006[0][3] = 0;
                                        this.field4006[0][1] = 0;
                                        this.field4006[0][0] = 2048;
                                        this.field4006[0][2] = 4096;
                                        this.field4006[1][2] = 4096;
                                        this.field4006[1][0] = 2867;
                                        this.field4006[1][3] = 0;
                                        this.field4006[1][1] = 4096;
                                        this.field4006[2][0] = 3276;
                                        this.field4006[2][1] = 4096;
                                        this.field4006[2][3] = 0;
                                        this.field4006[2][2] = 4096;
                                        this.field4006[3][3] = 0;
                                        this.field4006[3][2] = 0;
                                        this.field4006[3][1] = 4096;
                                        this.field4006[3][0] = 4096;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field4006 = new int[16][4];
                                    this.field4006[0][2] = 192;
                                    this.field4006[0][0] = 0;
                                    this.field4006[0][1] = 80;
                                    this.field4006[0][3] = 321;
                                    this.field4006[1][2] = 449;
                                    this.field4006[1][3] = 562;
                                    this.field4006[1][1] = 321;
                                    this.field4006[1][0] = 155;
                                    this.field4006[2][3] = 803;
                                    this.field4006[2][1] = 578;
                                    this.field4006[2][2] = 690;
                                    this.field4006[2][0] = 389;
                                    this.field4006[3][0] = 671;
                                    this.field4006[3][3] = 1140;
                                    this.field4006[3][1] = 947;
                                    this.field4006[3][2] = 995;
                                    this.field4006[4][2] = 1397;
                                    this.field4006[4][1] = 1285;
                                    this.field4006[4][0] = 897;
                                    this.field4006[4][3] = 1509;
                                    this.field4006[5][2] = 1429;
                                    this.field4006[5][3] = 1413;
                                    this.field4006[5][0] = 1175;
                                    this.field4006[5][1] = 1525;
                                    this.field4006[6][2] = 1461;
                                    this.field4006[6][3] = 1333;
                                    this.field4006[6][1] = 1734;
                                    this.field4006[6][0] = 1368;
                                    this.field4006[7][2] = 1525;
                                    this.field4006[7][3] = 1702;
                                    this.field4006[7][1] = 1413;
                                    this.field4006[7][0] = 1507;
                                    this.field4006[8][1] = 1108;
                                    this.field4006[8][3] = 2056;
                                    this.field4006[8][0] = 1736;
                                    this.field4006[8][2] = 1590;
                                    this.field4006[9][2] = 2056;
                                    this.field4006[9][0] = 2088;
                                    this.field4006[9][1] = 1766;
                                    this.field4006[9][3] = 2666;
                                    this.field4006[10][3] = 3276;
                                    this.field4006[10][1] = 2409;
                                    this.field4006[10][0] = 2355;
                                    this.field4006[10][2] = 2586;
                                    this.field4006[11][1] = 3116;
                                    this.field4006[11][3] = 3228;
                                    this.field4006[11][0] = 2691;
                                    this.field4006[11][2] = 3148;
                                    this.field4006[12][2] = 3710;
                                    this.field4006[12][1] = 3806;
                                    this.field4006[12][0] = 3031;
                                    this.field4006[12][3] = 3196;
                                    this.field4006[13][2] = 3421;
                                    this.field4006[13][0] = 3522;
                                    this.field4006[13][3] = 3019;
                                    this.field4006[13][1] = 3437;
                                    this.field4006[14][3] = 3228;
                                    this.field4006[14][1] = 3116;
                                    this.field4006[14][2] = 3148;
                                    this.field4006[14][0] = 3727;
                                    this.field4006[15][3] = 2746;
                                    this.field4006[15][1] = 2377;
                                    this.field4006[15][0] = 4096;
                                    this.field4006[15][2] = 2505;
                                }
                            } else {
                                this.field4006 = new int[6][4];
                                this.field4006[0][2] = 0;
                                this.field4006[0][0] = 0;
                                this.field4006[0][3] = 0;
                                this.field4006[0][1] = 0;
                                this.field4006[1][3] = 1493;
                                this.field4006[1][1] = 0;
                                this.field4006[1][2] = 0;
                                this.field4006[1][0] = 1843;
                                this.field4006[2][2] = 0;
                                this.field4006[2][0] = 2457;
                                this.field4006[2][3] = 2939;
                                this.field4006[2][1] = 0;
                                this.field4006[3][3] = 3565;
                                this.field4006[3][1] = 0;
                                this.field4006[3][0] = 2781;
                                this.field4006[3][2] = 1124;
                                this.field4006[4][0] = 3481;
                                this.field4006[4][3] = 4031;
                                this.field4006[4][2] = 3084;
                                this.field4006[4][1] = 546;
                                this.field4006[5][2] = 4096;
                                this.field4006[5][3] = 4096;
                                this.field4006[5][1] = 4096;
                                this.field4006[5][0] = 4096;
                            }
                        } else {
                            this.field4006 = new int[7][4];
                            this.field4006[0][3] = 4096;
                            this.field4006[0][1] = 0;
                            this.field4006[0][2] = 0;
                            this.field4006[0][0] = 0;
                            this.field4006[1][3] = 4096;
                            this.field4006[1][0] = 663;
                            this.field4006[1][2] = 4096;
                            this.field4006[1][1] = 0;
                            this.field4006[2][3] = 0;
                            this.field4006[2][1] = 0;
                            this.field4006[2][0] = 1363;
                            this.field4006[2][2] = 4096;
                            this.field4006[3][1] = 4096;
                            this.field4006[3][3] = 0;
                            this.field4006[3][0] = 2048;
                            this.field4006[3][2] = 4096;
                            this.field4006[4][3] = 0;
                            this.field4006[4][0] = 2727;
                            this.field4006[4][1] = 4096;
                            this.field4006[4][2] = 0;
                            this.field4006[5][2] = 0;
                            this.field4006[5][1] = 4096;
                            this.field4006[5][0] = 3411;
                            this.field4006[5][3] = 4096;
                            this.field4006[6][0] = 4096;
                            this.field4006[6][1] = 0;
                            this.field4006[6][2] = 0;
                            this.field4006[6][3] = 4096;
                        }
                    } else {
                        this.field4006 = new int[8][4];
                        this.field4006[0][2] = 2602;
                        this.field4006[0][0] = 0;
                        this.field4006[0][3] = 2361;
                        this.field4006[0][1] = 2650;
                        this.field4006[1][2] = 1799;
                        this.field4006[1][0] = 2867;
                        this.field4006[1][1] = 2313;
                        this.field4006[1][3] = 1558;
                        this.field4006[2][1] = 2618;
                        this.field4006[2][3] = 1413;
                        this.field4006[2][0] = 3072;
                        this.field4006[2][2] = 1734;
                        this.field4006[3][3] = 947;
                        this.field4006[3][1] = 2296;
                        this.field4006[3][2] = 1220;
                        this.field4006[3][0] = 3276;
                        this.field4006[4][1] = 2072;
                        this.field4006[4][2] = 963;
                        this.field4006[4][3] = 722;
                        this.field4006[4][0] = 3481;
                        this.field4006[5][2] = 2152;
                        this.field4006[5][0] = 3686;
                        this.field4006[5][3] = 1766;
                        this.field4006[5][1] = 2730;
                        this.field4006[6][3] = 915;
                        this.field4006[6][0] = 3891;
                        this.field4006[6][1] = 2232;
                        this.field4006[6][2] = 1060;
                        this.field4006[7][3] = 1140;
                        this.field4006[7][2] = 1413;
                        this.field4006[7][1] = 1686;
                        this.field4006[7][0] = 4096;
                    }
                } else {
                    this.field4006 = new int[2][4];
                    this.field4006[0][3] = 0;
                    this.field4006[0][1] = 0;
                    this.field4006[0][0] = 0;
                    this.field4006[0][2] = 0;
                    this.field4006[1][2] = 4096;
                    this.field4006[1][0] = 4096;
                    this.field4006[1][1] = 4096;
                    this.field4006[1][3] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjr;B)V", line = 344)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method718(101);
            if (~var4 != -1) {
                this.method1732(var4, -108);
            } else {
                this.field4006 = new int[arg1.method718(-59)][4];
                for (int var5 = 0; var5 < this.field4006.length; ++var5) {
                    this.field4006[var5][0] = arg1.method743((byte) -120);
                    this.field4006[var5][1] = arg1.method718(-94) << 4;
                    this.field4006[var5][2] = arg1.method718(-110) << 4;
                    this.field4006[var5][3] = arg1.method718(-121) << 4;
                }
            }
        }
        int var6 = -60 / ((58 - arg2) / 63);
        ++field4007;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIFI[FIIZFIIFI)V", line = 381)
    public static final void method1733(int arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, boolean arg7, float arg8, int arg9, int arg10, float arg11, int arg12) {
        int var13 = arg6 - arg0;
        int var14 = arg9 - arg10;
        int var15 = arg12 - arg3;
        ++field4012;
        float var16 = arg4[2] * (float) var15 + arg4[0] * (float) var13 + arg4[1] * (float) var14;
        float var17 = arg4[5] * (float) var15 + arg4[3] * (float) var13 + arg4[4] * (float) var14;
        if (arg7) {
            method1733(67, 108, -0.9595864F, -71, (float[]) null, 10, 12, true, 1.6309379F, 73, 9, 1.023058F, -1);
        }
        float var18 = arg4[8] * (float) var15 + arg4[7] * (float) var14 + arg4[6] * (float) var13;
        float var19;
        float var20;
        if (~arg1 == -1) {
            var19 = -var18 + arg8 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (~arg1 == -2) {
            var20 = arg2 + var16 + 0.5F;
            var19 = arg8 + var18 + 0.5F;
        } else if (arg1 != 2) {
            if (arg1 != 3) {
                if (arg1 == 4) {
                    var19 = -var17 + arg11 + 0.5F;
                    var20 = arg8 + var18 + 0.5F;
                } else {
                    var19 = -var17 + arg11 + 0.5F;
                    var20 = -var18 + arg8 + 0.5F;
                }
            } else {
                var19 = -var17 + arg11 + 0.5F;
                var20 = arg2 + var16 + 0.5F;
            }
        } else {
            var20 = -var16 + arg2 + 0.5F;
            var19 = -var17 + arg11 + 0.5F;
        }
        if (arg5 != 1) {
            if (~arg5 != -3) {
                if (arg5 == 3) {
                    float var21 = var20;
                    var20 = var19;
                    var19 = -var21;
                }
            } else {
                var20 = -var20;
                var19 = -var19;
            }
        } else {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        }
        class387.field5438 = var20;
        class60.field819 = var19;
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V", line = 469)
    public static void method1734(int arg0) {
        field4005 = null;
        field4011 = null;
        if (arg0 == 1363) {
            field4014 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 481)
    public class288() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[[I", line = 485)
    public final int[][] method15(int arg0, int arg1) {
        ++field4008;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            this.field4004 = null;
        }
        if (super.field9740.field8738) {
            int[] var4 = this.method3809(0, arg1, (byte) 35);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class465.field6544; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4004[var9];
                var5[var8] = class249.method1537(16711680, var10) >> 12;
                var6[var8] = class249.method1537(var10, 65280) >> 4;
                var7[var8] = class249.method1537(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 542)
    private final void method1735(byte arg0) {
        ++field4003;
        int var2 = this.field4006.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && var5 >= this.field4006[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field4006[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field4006[var4 - 1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] - var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                    } else {
                        var13 = var7[3];
                        var12 = var7[1];
                        var11 = var7[2];
                    }
                } else {
                    int[] var14 = this.field4006[var2 + -1];
                    var11 = var14[2];
                    var13 = var14[3];
                    var12 = var14[1];
                }
                int var15 = var13 >> 4;
                int var16 = var11 >> 4;
                int var17 = var12 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field4004[var3] = class266.method1624(var15, class266.method1624(var17 << 16, var16 << 8));
            }
        }
        if (arg0 > -73) {
            method1733(10, 89, -2.0468745F, -95, (float[]) null, -114, -79, false, -0.8856515F, 7, 106, -0.6115831F, -98);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(III)Z", line = 644)
    public static final boolean method1736(int arg0, int arg1, int arg2) {
        ++field4001;
        if (arg0 != 29996) {
            method1731(-103);
        }
        return ~(1024 & arg2) != -1;
    }
}
