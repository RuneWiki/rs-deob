import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class436 extends class354 {

    @OriginalMember(owner = "client!of", name = "H", descriptor = "[I")
    private int[] field6325 = new int[257];

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field6327 = -1;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "Z")
    public static boolean field6326 = false;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lvp;")
    public static class123 field6335 = new class123(64, -1);

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Lgf;")
    public static class180 field6339 = new class180("K", "T", "K", "K");

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "[Lf;")
    public static class528[] field6341;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[[I")
    public static int[][] field6332;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "[[I")
    private int[][] field6336;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "[[I")
    public static int[][] field6338;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V", line = 7)
    private final void method2636(int arg0, boolean arg1) {
        ++field6337;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6336 = new int[4][4];
                                this.field6336[0][0] = 2048;
                                this.field6336[0][3] = 0;
                                this.field6336[0][1] = 0;
                                this.field6336[0][2] = 4096;
                                this.field6336[1][1] = 4096;
                                this.field6336[1][2] = 4096;
                                this.field6336[1][3] = 0;
                                this.field6336[1][0] = 2867;
                                this.field6336[2][1] = 4096;
                                this.field6336[2][2] = 4096;
                                this.field6336[2][0] = 3276;
                                this.field6336[2][3] = 0;
                                this.field6336[3][0] = 4096;
                                this.field6336[3][1] = 4096;
                                this.field6336[3][2] = 0;
                                this.field6336[3][3] = 0;
                            } else {
                                this.field6336 = new int[16][4];
                                this.field6336[0][1] = 80;
                                this.field6336[0][2] = 192;
                                this.field6336[0][0] = 0;
                                this.field6336[0][3] = 321;
                                this.field6336[1][2] = 449;
                                this.field6336[1][1] = 321;
                                this.field6336[1][3] = 562;
                                this.field6336[1][0] = 155;
                                this.field6336[2][0] = 389;
                                this.field6336[2][3] = 803;
                                this.field6336[2][2] = 690;
                                this.field6336[2][1] = 578;
                                this.field6336[3][1] = 947;
                                this.field6336[3][0] = 671;
                                this.field6336[3][3] = 1140;
                                this.field6336[3][2] = 995;
                                this.field6336[4][3] = 1509;
                                this.field6336[4][0] = 897;
                                this.field6336[4][2] = 1397;
                                this.field6336[4][1] = 1285;
                                this.field6336[5][3] = 1413;
                                this.field6336[5][2] = 1429;
                                this.field6336[5][0] = 1175;
                                this.field6336[5][1] = 1525;
                                this.field6336[6][1] = 1734;
                                this.field6336[6][3] = 1333;
                                this.field6336[6][0] = 1368;
                                this.field6336[6][2] = 1461;
                                this.field6336[7][0] = 1507;
                                this.field6336[7][1] = 1413;
                                this.field6336[7][3] = 1702;
                                this.field6336[7][2] = 1525;
                                this.field6336[8][1] = 1108;
                                this.field6336[8][3] = 2056;
                                this.field6336[8][2] = 1590;
                                this.field6336[8][0] = 1736;
                                this.field6336[9][2] = 2056;
                                this.field6336[9][3] = 2666;
                                this.field6336[9][0] = 2088;
                                this.field6336[9][1] = 1766;
                                this.field6336[10][1] = 2409;
                                this.field6336[10][2] = 2586;
                                this.field6336[10][0] = 2355;
                                this.field6336[10][3] = 3276;
                                this.field6336[11][3] = 3228;
                                this.field6336[11][0] = 2691;
                                this.field6336[11][1] = 3116;
                                this.field6336[11][2] = 3148;
                                this.field6336[12][0] = 3031;
                                this.field6336[12][1] = 3806;
                                this.field6336[12][2] = 3710;
                                this.field6336[12][3] = 3196;
                                this.field6336[13][2] = 3421;
                                this.field6336[13][3] = 3019;
                                this.field6336[13][1] = 3437;
                                this.field6336[13][0] = 3522;
                                this.field6336[14][3] = 3228;
                                this.field6336[14][2] = 3148;
                                this.field6336[14][0] = 3727;
                                this.field6336[14][1] = 3116;
                                this.field6336[15][2] = 2505;
                                this.field6336[15][3] = 2746;
                                this.field6336[15][1] = 2377;
                                this.field6336[15][0] = 4096;
                            }
                        } else {
                            this.field6336 = new int[6][4];
                            this.field6336[0][1] = 0;
                            this.field6336[0][3] = 0;
                            this.field6336[0][0] = 0;
                            this.field6336[0][2] = 0;
                            this.field6336[1][2] = 0;
                            this.field6336[1][3] = 1493;
                            this.field6336[1][1] = 0;
                            this.field6336[1][0] = 1843;
                            this.field6336[2][1] = 0;
                            this.field6336[2][3] = 2939;
                            this.field6336[2][0] = 2457;
                            this.field6336[2][2] = 0;
                            this.field6336[3][0] = 2781;
                            this.field6336[3][3] = 3565;
                            this.field6336[3][1] = 0;
                            this.field6336[3][2] = 1124;
                            this.field6336[4][2] = 3084;
                            this.field6336[4][1] = 546;
                            this.field6336[4][3] = 4031;
                            this.field6336[4][0] = 3481;
                            this.field6336[5][3] = 4096;
                            this.field6336[5][0] = 4096;
                            this.field6336[5][2] = 4096;
                            this.field6336[5][1] = 4096;
                        }
                    } else {
                        this.field6336 = new int[7][4];
                        this.field6336[0][1] = 0;
                        this.field6336[0][3] = 4096;
                        this.field6336[0][0] = 0;
                        this.field6336[0][2] = 0;
                        this.field6336[1][1] = 0;
                        this.field6336[1][0] = 663;
                        this.field6336[1][2] = 4096;
                        this.field6336[1][3] = 4096;
                        this.field6336[2][0] = 1363;
                        this.field6336[2][2] = 4096;
                        this.field6336[2][1] = 0;
                        this.field6336[2][3] = 0;
                        this.field6336[3][0] = 2048;
                        this.field6336[3][1] = 4096;
                        this.field6336[3][2] = 4096;
                        this.field6336[3][3] = 0;
                        this.field6336[4][0] = 2727;
                        this.field6336[4][1] = 4096;
                        this.field6336[4][2] = 0;
                        this.field6336[4][3] = 0;
                        this.field6336[5][2] = 0;
                        this.field6336[5][3] = 4096;
                        this.field6336[5][1] = 4096;
                        this.field6336[5][0] = 3411;
                        this.field6336[6][0] = 4096;
                        this.field6336[6][3] = 4096;
                        this.field6336[6][1] = 0;
                        this.field6336[6][2] = 0;
                    }
                } else {
                    this.field6336 = new int[8][4];
                    this.field6336[0][1] = 2650;
                    this.field6336[0][2] = 2602;
                    this.field6336[0][0] = 0;
                    this.field6336[0][3] = 2361;
                    this.field6336[1][0] = 2867;
                    this.field6336[1][3] = 1558;
                    this.field6336[1][2] = 1799;
                    this.field6336[1][1] = 2313;
                    this.field6336[2][3] = 1413;
                    this.field6336[2][2] = 1734;
                    this.field6336[2][1] = 2618;
                    this.field6336[2][0] = 3072;
                    this.field6336[3][0] = 3276;
                    this.field6336[3][3] = 947;
                    this.field6336[3][1] = 2296;
                    this.field6336[3][2] = 1220;
                    this.field6336[4][3] = 722;
                    this.field6336[4][1] = 2072;
                    this.field6336[4][0] = 3481;
                    this.field6336[4][2] = 963;
                    this.field6336[5][1] = 2730;
                    this.field6336[5][0] = 3686;
                    this.field6336[5][2] = 2152;
                    this.field6336[5][3] = 1766;
                    this.field6336[6][1] = 2232;
                    this.field6336[6][2] = 1060;
                    this.field6336[6][0] = 3891;
                    this.field6336[6][3] = 915;
                    this.field6336[7][0] = 4096;
                    this.field6336[7][2] = 1413;
                    this.field6336[7][3] = 1140;
                    this.field6336[7][1] = 1686;
                }
            } else {
                this.field6336 = new int[2][4];
                this.field6336[0][0] = 0;
                this.field6336[0][2] = 0;
                this.field6336[0][3] = 0;
                this.field6336[0][1] = 0;
                this.field6336[1][1] = 4096;
                this.field6336[1][3] = 4096;
                this.field6336[1][0] = 4096;
                this.field6336[1][2] = 4096;
            }
        }
        if (arg1) {
            field6338 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[[I", line = 264)
    public final int[][] method207(byte arg0, int arg1) {
        ++field6333;
        int[][] var3 = super.field5351.method2819((byte) -92, arg1);
        if (arg0 >= -40) {
            field6339 = null;
        }
        if (super.field5351.field6959) {
            int[] var4 = this.method2293(0, arg1, (byte) 69);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class404.field5952; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field6325[var9];
                var5[var8] = class388.method2441(16711680, var10) >> 12;
                var6[var8] = class388.method2441(65280, var10) >> 4;
                var7[var8] = class388.method2441(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 317)
    public class436() {
        super(1, false);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(Z)V", line = 321)
    private final void method2637(boolean arg0) {
        ++field6331;
        if (!arg0) {
            field6327 = 109;
        }
        int var2 = this.field6336.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field6336[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var4 > ~var2) {
                    int[] var7 = this.field6336[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field6336[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                        var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                    } else {
                        var12 = var7[2];
                        var11 = var7[3];
                        var13 = var7[1];
                    }
                } else {
                    int[] var14 = this.field6336[var2 + -1];
                    var11 = var14[3];
                    var13 = var14[1];
                    var12 = var14[2];
                }
                int var15 = var13 >> 4;
                int var16 = var12 >> 4;
                int var17 = var11 >> 4;
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field6325[var3] = class29.method239(class29.method239(var15 << 16, var16 << 8), var17);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V", line = 425)
    public static void method2638(byte arg0) {
        field6338 = null;
        field6341 = null;
        field6339 = null;
        field6335 = null;
        field6332 = null;
        int var1 = -5 % ((arg0 - -22) / 41);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 438)
    public final void method771(boolean arg0) {
        ++field6329;
        if (this.field6336 == null) {
            this.method2636(1, false);
        }
        this.method2637(!arg0);
        if (arg0) {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILqa;)V", line = 466)
    public static final void method2639(int arg0, int arg1, int arg2, class162 arg3) {
        ++field6328;
        if (arg1 == 0) {
            class14.field242 = arg3;
            class526.field7726 = new class151[arg2][arg0];
            if (class96.field1566 != null) {
                class389.field5757 = class494.method2945(class96.field1566[0], class96.field1566[2], class96.field1566[3], class96.field1566[4], class96.field1566[5], class96.field1566[1], 63);
            }
            class340.field5201 = new class151();
            class519.method3067((byte) -113);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILti;I)V", line = 484)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg1.method1918((byte) 76);
            if (~var4 != -1) {
                this.method2636(var4, false);
            } else {
                this.field6336 = new int[arg1.method1918((byte) 83)][4];
                for (int var5 = 0; ~this.field6336.length < ~var5; ++var5) {
                    this.field6336[var5][0] = arg1.method1868(arg0 + -15180);
                    this.field6336[var5][1] = arg1.method1918((byte) -71) << 4;
                    this.field6336[var5][2] = arg1.method1918((byte) 96) << 4;
                    this.field6336[var5][3] = arg1.method1918((byte) -67) << 4;
                }
            }
        }
        ++field6330;
        if (arg0 != 15180) {
            field6327 = -51;
        }
    }
}
