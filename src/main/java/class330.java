import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class330 extends class466 {

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
    private int[] field4408 = new int[257];

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "F")
    public static float field4406;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "[[I")
    private int[][] field4409;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class330() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 == -806066388) {
            ++field4411;
            if (this.field4409 == null) {
                this.method2027(1, (byte) 125);
            }
            this.method2028((byte) -104);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field4413;
        if (arg1) {
            field4406 = 0.061493378F;
        }
        int[][] var3 = super.field6569.method828((byte) -31, arg0);
        if (super.field6569.field1934) {
            int[] var4 = this.method2721(0, arg0, 2);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class312.field4207; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4408[var9];
                var5[var8] = class589.method3454(var10, 16711680) >> 12;
                var6[var8] = class589.method3454(65280, var10) >> 4;
                var7[var8] = class589.method3454(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method110((byte) 83);
            if (var4 != 0) {
                this.method2027(var4, (byte) -113);
            } else {
                this.field4409 = new int[arg0.method110((byte) 25)][4];
                for (int var5 = 0; this.field4409.length > var5; ++var5) {
                    this.field4409[var5][0] = arg0.method93((byte) 98);
                    this.field4409[var5][1] = arg0.method110((byte) 107) << 4;
                    this.field4409[var5][2] = arg0.method110((byte) 110) << 4;
                    this.field4409[var5][3] = arg0.method110((byte) 31) << 4;
                }
            }
        }
        if (arg1 != -5062) {
            this.field4409 = null;
        }
        ++field4407;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
    private final void method2027(int arg0, byte arg1) {
        ++field4412;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4409 = new int[4][4];
                                this.field4409[0][1] = 0;
                                this.field4409[0][3] = 0;
                                this.field4409[0][0] = 2048;
                                this.field4409[0][2] = 4096;
                                this.field4409[1][3] = 0;
                                this.field4409[1][1] = 4096;
                                this.field4409[1][2] = 4096;
                                this.field4409[1][0] = 2867;
                                this.field4409[2][1] = 4096;
                                this.field4409[2][2] = 4096;
                                this.field4409[2][3] = 0;
                                this.field4409[2][0] = 3276;
                                this.field4409[3][3] = 0;
                                this.field4409[3][1] = 4096;
                                this.field4409[3][2] = 0;
                                this.field4409[3][0] = 4096;
                            } else {
                                this.field4409 = new int[16][4];
                                this.field4409[0][1] = 80;
                                this.field4409[0][3] = 321;
                                this.field4409[0][0] = 0;
                                this.field4409[0][2] = 192;
                                this.field4409[1][1] = 321;
                                this.field4409[1][2] = 449;
                                this.field4409[1][0] = 155;
                                this.field4409[1][3] = 562;
                                this.field4409[2][1] = 578;
                                this.field4409[2][2] = 690;
                                this.field4409[2][3] = 803;
                                this.field4409[2][0] = 389;
                                this.field4409[3][0] = 671;
                                this.field4409[3][3] = 1140;
                                this.field4409[3][1] = 947;
                                this.field4409[3][2] = 995;
                                this.field4409[4][2] = 1397;
                                this.field4409[4][3] = 1509;
                                this.field4409[4][0] = 897;
                                this.field4409[4][1] = 1285;
                                this.field4409[5][0] = 1175;
                                this.field4409[5][2] = 1429;
                                this.field4409[5][3] = 1413;
                                this.field4409[5][1] = 1525;
                                this.field4409[6][2] = 1461;
                                this.field4409[6][3] = 1333;
                                this.field4409[6][1] = 1734;
                                this.field4409[6][0] = 1368;
                                this.field4409[7][0] = 1507;
                                this.field4409[7][2] = 1525;
                                this.field4409[7][1] = 1413;
                                this.field4409[7][3] = 1702;
                                this.field4409[8][2] = 1590;
                                this.field4409[8][3] = 2056;
                                this.field4409[8][0] = 1736;
                                this.field4409[8][1] = 1108;
                                this.field4409[9][1] = 1766;
                                this.field4409[9][0] = 2088;
                                this.field4409[9][2] = 2056;
                                this.field4409[9][3] = 2666;
                                this.field4409[10][1] = 2409;
                                this.field4409[10][3] = 3276;
                                this.field4409[10][0] = 2355;
                                this.field4409[10][2] = 2586;
                                this.field4409[11][1] = 3116;
                                this.field4409[11][3] = 3228;
                                this.field4409[11][0] = 2691;
                                this.field4409[11][2] = 3148;
                                this.field4409[12][0] = 3031;
                                this.field4409[12][2] = 3710;
                                this.field4409[12][3] = 3196;
                                this.field4409[12][1] = 3806;
                                this.field4409[13][3] = 3019;
                                this.field4409[13][2] = 3421;
                                this.field4409[13][1] = 3437;
                                this.field4409[13][0] = 3522;
                                this.field4409[14][0] = 3727;
                                this.field4409[14][3] = 3228;
                                this.field4409[14][2] = 3148;
                                this.field4409[14][1] = 3116;
                                this.field4409[15][3] = 2746;
                                this.field4409[15][0] = 4096;
                                this.field4409[15][2] = 2505;
                                this.field4409[15][1] = 2377;
                            }
                        } else {
                            this.field4409 = new int[6][4];
                            this.field4409[0][1] = 0;
                            this.field4409[0][3] = 0;
                            this.field4409[0][2] = 0;
                            this.field4409[0][0] = 0;
                            this.field4409[1][0] = 1843;
                            this.field4409[1][2] = 0;
                            this.field4409[1][1] = 0;
                            this.field4409[1][3] = 1493;
                            this.field4409[2][1] = 0;
                            this.field4409[2][0] = 2457;
                            this.field4409[2][3] = 2939;
                            this.field4409[2][2] = 0;
                            this.field4409[3][2] = 1124;
                            this.field4409[3][3] = 3565;
                            this.field4409[3][0] = 2781;
                            this.field4409[3][1] = 0;
                            this.field4409[4][1] = 546;
                            this.field4409[4][0] = 3481;
                            this.field4409[4][3] = 4031;
                            this.field4409[4][2] = 3084;
                            this.field4409[5][2] = 4096;
                            this.field4409[5][1] = 4096;
                            this.field4409[5][0] = 4096;
                            this.field4409[5][3] = 4096;
                        }
                    } else {
                        this.field4409 = new int[7][4];
                        this.field4409[0][2] = 0;
                        this.field4409[0][3] = 4096;
                        this.field4409[0][0] = 0;
                        this.field4409[0][1] = 0;
                        this.field4409[1][3] = 4096;
                        this.field4409[1][2] = 4096;
                        this.field4409[1][1] = 0;
                        this.field4409[1][0] = 663;
                        this.field4409[2][3] = 0;
                        this.field4409[2][0] = 1363;
                        this.field4409[2][2] = 4096;
                        this.field4409[2][1] = 0;
                        this.field4409[3][0] = 2048;
                        this.field4409[3][3] = 0;
                        this.field4409[3][1] = 4096;
                        this.field4409[3][2] = 4096;
                        this.field4409[4][1] = 4096;
                        this.field4409[4][2] = 0;
                        this.field4409[4][0] = 2727;
                        this.field4409[4][3] = 0;
                        this.field4409[5][1] = 4096;
                        this.field4409[5][2] = 0;
                        this.field4409[5][0] = 3411;
                        this.field4409[5][3] = 4096;
                        this.field4409[6][0] = 4096;
                        this.field4409[6][3] = 4096;
                        this.field4409[6][2] = 0;
                        this.field4409[6][1] = 0;
                    }
                } else {
                    this.field4409 = new int[8][4];
                    this.field4409[0][3] = 2361;
                    this.field4409[0][1] = 2650;
                    this.field4409[0][0] = 0;
                    this.field4409[0][2] = 2602;
                    this.field4409[1][3] = 1558;
                    this.field4409[1][2] = 1799;
                    this.field4409[1][1] = 2313;
                    this.field4409[1][0] = 2867;
                    this.field4409[2][2] = 1734;
                    this.field4409[2][3] = 1413;
                    this.field4409[2][0] = 3072;
                    this.field4409[2][1] = 2618;
                    this.field4409[3][0] = 3276;
                    this.field4409[3][2] = 1220;
                    this.field4409[3][1] = 2296;
                    this.field4409[3][3] = 947;
                    this.field4409[4][3] = 722;
                    this.field4409[4][2] = 963;
                    this.field4409[4][1] = 2072;
                    this.field4409[4][0] = 3481;
                    this.field4409[5][1] = 2730;
                    this.field4409[5][0] = 3686;
                    this.field4409[5][2] = 2152;
                    this.field4409[5][3] = 1766;
                    this.field4409[6][1] = 2232;
                    this.field4409[6][2] = 1060;
                    this.field4409[6][0] = 3891;
                    this.field4409[6][3] = 915;
                    this.field4409[7][2] = 1413;
                    this.field4409[7][1] = 1686;
                    this.field4409[7][0] = 4096;
                    this.field4409[7][3] = 1140;
                }
            } else {
                this.field4409 = new int[2][4];
                this.field4409[0][1] = 0;
                this.field4409[0][3] = 0;
                this.field4409[0][0] = 0;
                this.field4409[0][2] = 0;
                this.field4409[1][3] = 4096;
                this.field4409[1][1] = 4096;
                this.field4409[1][2] = 4096;
                this.field4409[1][0] = 4096;
            }
        }
        int var4 = 62 % ((-41 - arg1) / 38);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
    private final void method2028(byte arg0) {
        ++field4414;
        if (arg0 <= -103) {
            int var2 = this.field4409.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && ~this.field4409[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 <= ~var2) {
                        int[] var7 = this.field4409[var2 + -1];
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field4409[var4];
                        if (~var4 >= -1) {
                            var8 = var11[1];
                            var10 = var11[2];
                            var9 = var11[3];
                        } else {
                            int[] var12 = this.field4409[var4 + -1];
                            int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                            int var14 = 4096 - var13;
                            var10 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                            var8 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        }
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (var17 >= 0) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    this.field4408[var3] = class73.method578(class73.method578(var17 << 8, var15 << 16), var16);
                }
            }
        }
    }
}
