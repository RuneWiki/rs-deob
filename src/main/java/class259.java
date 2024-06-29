import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class259 extends class227 {

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "[I")
    private int[] field3453 = new int[257];

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "Ljc;")
    public static class305 field3459 = new class305("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "Z")
    public static boolean field3463 = false;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "[[I")
    private int[][] field3461;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        ++field3458;
        if (this.field3461 == null) {
            this.method1596(1, arg0 ^ -23458);
        }
        this.method1593(arg0 ^ 17);
        if (arg0 != 1) {
            this.field3453 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "(I)V")
    private final void method1593(int arg0) {
        ++field3452;
        if (arg0 == 16) {
            int var2 = this.field3461.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field3461[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 >= var2) {
                        int[] var7 = this.field3461[var2 + -1];
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field3461[var4];
                        if (var4 > 0) {
                            int[] var12 = this.field3461[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                            int var14 = -var13 + 4096;
                            var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        } else {
                            var9 = var11[2];
                            var8 = var11[1];
                            var10 = var11[3];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var8 >> 4;
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field3453[var3] = class219.method1381(class219.method1381(var15 << 8, var17 << 16), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(I)Z")
    public static final boolean method1594(int arg0) {
        ++field3457;
        if (arg0 != 1) {
            return false;
        } else {
            return ~class391.field5656 < -1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "(I)V")
    public static void method1595(int arg0) {
        if (arg0 != 0) {
            method1595(71);
        }
        field3459 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field3451;
        int[][] var3 = super.field3059.method28((byte) 52, arg0);
        if (super.field3059.field57) {
            int[] var4 = this.method1459(arg0, 117, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class446.field6486; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3453[var9];
                var5[var8] = class95.method534(4080, var10 >> 12);
                var6[var8] = class95.method534(4080, var10 >> 4);
                var7[var8] = class95.method534(var10, 255) << 4;
            }
        }
        if (!arg1) {
            this.method112(15, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method2388((byte) -119);
            if (var4 != 0) {
                this.method1596(var4, -23457);
            } else {
                this.field3461 = new int[arg0.method2388((byte) -114)][4];
                for (int var5 = 0; this.field3461.length > var5; ++var5) {
                    this.field3461[var5][0] = arg0.method2386(-23648);
                    this.field3461[var5][1] = arg0.method2388((byte) -119) << 4;
                    this.field3461[var5][2] = arg0.method2388((byte) -125) << 4;
                    this.field3461[var5][3] = arg0.method2388((byte) -117) << 4;
                }
            }
        }
        ++field3455;
        if (arg1 != 487215116) {
            this.field3461 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(II)V")
    private final void method1596(int arg0, int arg1) {
        ++field3460;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3461 = new int[4][4];
                                this.field3461[0][0] = 2048;
                                this.field3461[0][2] = 4096;
                                this.field3461[0][1] = 0;
                                this.field3461[0][3] = 0;
                                this.field3461[1][0] = 2867;
                                this.field3461[1][2] = 4096;
                                this.field3461[1][1] = 4096;
                                this.field3461[1][3] = 0;
                                this.field3461[2][2] = 4096;
                                this.field3461[2][0] = 3276;
                                this.field3461[2][3] = 0;
                                this.field3461[2][1] = 4096;
                                this.field3461[3][0] = 4096;
                                this.field3461[3][1] = 4096;
                                this.field3461[3][2] = 0;
                                this.field3461[3][3] = 0;
                            } else {
                                this.field3461 = new int[16][4];
                                this.field3461[0][3] = 321;
                                this.field3461[0][1] = 80;
                                this.field3461[0][0] = 0;
                                this.field3461[0][2] = 192;
                                this.field3461[1][3] = 562;
                                this.field3461[1][0] = 155;
                                this.field3461[1][1] = 321;
                                this.field3461[1][2] = 449;
                                this.field3461[2][3] = 803;
                                this.field3461[2][1] = 578;
                                this.field3461[2][0] = 389;
                                this.field3461[2][2] = 690;
                                this.field3461[3][1] = 947;
                                this.field3461[3][3] = 1140;
                                this.field3461[3][0] = 671;
                                this.field3461[3][2] = 995;
                                this.field3461[4][1] = 1285;
                                this.field3461[4][0] = 897;
                                this.field3461[4][2] = 1397;
                                this.field3461[4][3] = 1509;
                                this.field3461[5][0] = 1175;
                                this.field3461[5][1] = 1525;
                                this.field3461[5][3] = 1413;
                                this.field3461[5][2] = 1429;
                                this.field3461[6][3] = 1333;
                                this.field3461[6][2] = 1461;
                                this.field3461[6][0] = 1368;
                                this.field3461[6][1] = 1734;
                                this.field3461[7][0] = 1507;
                                this.field3461[7][3] = 1702;
                                this.field3461[7][2] = 1525;
                                this.field3461[7][1] = 1413;
                                this.field3461[8][1] = 1108;
                                this.field3461[8][3] = 2056;
                                this.field3461[8][0] = 1736;
                                this.field3461[8][2] = 1590;
                                this.field3461[9][3] = 2666;
                                this.field3461[9][0] = 2088;
                                this.field3461[9][1] = 1766;
                                this.field3461[9][2] = 2056;
                                this.field3461[10][2] = 2586;
                                this.field3461[10][0] = 2355;
                                this.field3461[10][3] = 3276;
                                this.field3461[10][1] = 2409;
                                this.field3461[11][1] = 3116;
                                this.field3461[11][2] = 3148;
                                this.field3461[11][3] = 3228;
                                this.field3461[11][0] = 2691;
                                this.field3461[12][2] = 3710;
                                this.field3461[12][1] = 3806;
                                this.field3461[12][3] = 3196;
                                this.field3461[12][0] = 3031;
                                this.field3461[13][0] = 3522;
                                this.field3461[13][2] = 3421;
                                this.field3461[13][3] = 3019;
                                this.field3461[13][1] = 3437;
                                this.field3461[14][3] = 3228;
                                this.field3461[14][2] = 3148;
                                this.field3461[14][0] = 3727;
                                this.field3461[14][1] = 3116;
                                this.field3461[15][3] = 2746;
                                this.field3461[15][2] = 2505;
                                this.field3461[15][0] = 4096;
                                this.field3461[15][1] = 2377;
                            }
                        } else {
                            this.field3461 = new int[6][4];
                            this.field3461[0][0] = 0;
                            this.field3461[0][2] = 0;
                            this.field3461[0][1] = 0;
                            this.field3461[0][3] = 0;
                            this.field3461[1][2] = 0;
                            this.field3461[1][1] = 0;
                            this.field3461[1][0] = 1843;
                            this.field3461[1][3] = 1493;
                            this.field3461[2][0] = 2457;
                            this.field3461[2][1] = 0;
                            this.field3461[2][3] = 2939;
                            this.field3461[2][2] = 0;
                            this.field3461[3][1] = 0;
                            this.field3461[3][3] = 3565;
                            this.field3461[3][0] = 2781;
                            this.field3461[3][2] = 1124;
                            this.field3461[4][3] = 4031;
                            this.field3461[4][0] = 3481;
                            this.field3461[4][2] = 3084;
                            this.field3461[4][1] = 546;
                            this.field3461[5][0] = 4096;
                            this.field3461[5][1] = 4096;
                            this.field3461[5][2] = 4096;
                            this.field3461[5][3] = 4096;
                        }
                    } else {
                        this.field3461 = new int[7][4];
                        this.field3461[0][0] = 0;
                        this.field3461[0][2] = 0;
                        this.field3461[0][3] = 4096;
                        this.field3461[0][1] = 0;
                        this.field3461[1][3] = 4096;
                        this.field3461[1][1] = 0;
                        this.field3461[1][2] = 4096;
                        this.field3461[1][0] = 663;
                        this.field3461[2][3] = 0;
                        this.field3461[2][1] = 0;
                        this.field3461[2][2] = 4096;
                        this.field3461[2][0] = 1363;
                        this.field3461[3][0] = 2048;
                        this.field3461[3][3] = 0;
                        this.field3461[3][1] = 4096;
                        this.field3461[3][2] = 4096;
                        this.field3461[4][0] = 2727;
                        this.field3461[4][2] = 0;
                        this.field3461[4][3] = 0;
                        this.field3461[4][1] = 4096;
                        this.field3461[5][0] = 3411;
                        this.field3461[5][1] = 4096;
                        this.field3461[5][3] = 4096;
                        this.field3461[5][2] = 0;
                        this.field3461[6][3] = 4096;
                        this.field3461[6][0] = 4096;
                        this.field3461[6][1] = 0;
                        this.field3461[6][2] = 0;
                    }
                } else {
                    this.field3461 = new int[8][4];
                    this.field3461[0][0] = 0;
                    this.field3461[0][1] = 2650;
                    this.field3461[0][2] = 2602;
                    this.field3461[0][3] = 2361;
                    this.field3461[1][2] = 1799;
                    this.field3461[1][1] = 2313;
                    this.field3461[1][0] = 2867;
                    this.field3461[1][3] = 1558;
                    this.field3461[2][3] = 1413;
                    this.field3461[2][2] = 1734;
                    this.field3461[2][0] = 3072;
                    this.field3461[2][1] = 2618;
                    this.field3461[3][2] = 1220;
                    this.field3461[3][3] = 947;
                    this.field3461[3][1] = 2296;
                    this.field3461[3][0] = 3276;
                    this.field3461[4][3] = 722;
                    this.field3461[4][2] = 963;
                    this.field3461[4][1] = 2072;
                    this.field3461[4][0] = 3481;
                    this.field3461[5][2] = 2152;
                    this.field3461[5][1] = 2730;
                    this.field3461[5][3] = 1766;
                    this.field3461[5][0] = 3686;
                    this.field3461[6][2] = 1060;
                    this.field3461[6][1] = 2232;
                    this.field3461[6][3] = 915;
                    this.field3461[6][0] = 3891;
                    this.field3461[7][3] = 1140;
                    this.field3461[7][0] = 4096;
                    this.field3461[7][2] = 1413;
                    this.field3461[7][1] = 1686;
                }
            } else {
                this.field3461 = new int[2][4];
                this.field3461[0][1] = 0;
                this.field3461[0][3] = 0;
                this.field3461[0][2] = 0;
                this.field3461[0][0] = 0;
                this.field3461[1][0] = 4096;
                this.field3461[1][2] = 4096;
                this.field3461[1][1] = 4096;
                this.field3461[1][3] = 4096;
            }
        }
        if (arg1 != -23457) {
            field3463 = true;
        }
    }
}
