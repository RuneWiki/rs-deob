import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class52 extends class278 {

    @OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
    private int[] field697 = new int[257];

    @OriginalMember(owner = "client!u", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field702 = new String[200];

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Luf;")
    public static class310 field705;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lmt;")
    public static class271 field700;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[[I")
    private int[][] field699;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(III)V")
    public static final void method319(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field824 != null) {
                var3.field824 = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    private final void method320(int arg0) {
        ++field701;
        int var2 = this.field699.length;
        if (arg0 == 23438) {
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && this.field699[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var2 >= ~var4) {
                        int[] var7 = this.field699[var2 + -1];
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field699[var4];
                        if (~var4 >= -1) {
                            var10 = var11[1];
                            var9 = var11[2];
                            var8 = var11[3];
                        } else {
                            int[] var12 = this.field699[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                            int var14 = 4096 - var13;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                            var9 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var8 >> 4;
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    this.field697[var3] = class25.method183(var17, class25.method183(var16 << 16, var15 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        if (this.field699 == null) {
            this.method321(1, 3);
        }
        ++field696;
        this.method320(23438);
        if (arg0 != 2) {
            this.field699 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)V")
    private final void method321(int arg0, int arg1) {
        ++field698;
        if (arg1 != 3) {
            field702 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field699 = new int[4][4];
                                    this.field699[0][1] = 0;
                                    this.field699[0][2] = 4096;
                                    this.field699[0][3] = 0;
                                    this.field699[0][0] = 2048;
                                    this.field699[1][1] = 4096;
                                    this.field699[1][2] = 4096;
                                    this.field699[1][0] = 2867;
                                    this.field699[1][3] = 0;
                                    this.field699[2][0] = 3276;
                                    this.field699[2][2] = 4096;
                                    this.field699[2][1] = 4096;
                                    this.field699[2][3] = 0;
                                    this.field699[3][0] = 4096;
                                    this.field699[3][2] = 0;
                                    this.field699[3][1] = 4096;
                                    this.field699[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field699 = new int[16][4];
                                this.field699[0][0] = 0;
                                this.field699[0][3] = 321;
                                this.field699[0][2] = 192;
                                this.field699[0][1] = 80;
                                this.field699[1][1] = 321;
                                this.field699[1][0] = 155;
                                this.field699[1][2] = 449;
                                this.field699[1][3] = 562;
                                this.field699[2][1] = 578;
                                this.field699[2][0] = 389;
                                this.field699[2][3] = 803;
                                this.field699[2][2] = 690;
                                this.field699[3][0] = 671;
                                this.field699[3][3] = 1140;
                                this.field699[3][2] = 995;
                                this.field699[3][1] = 947;
                                this.field699[4][3] = 1509;
                                this.field699[4][0] = 897;
                                this.field699[4][1] = 1285;
                                this.field699[4][2] = 1397;
                                this.field699[5][1] = 1525;
                                this.field699[5][2] = 1429;
                                this.field699[5][0] = 1175;
                                this.field699[5][3] = 1413;
                                this.field699[6][3] = 1333;
                                this.field699[6][1] = 1734;
                                this.field699[6][0] = 1368;
                                this.field699[6][2] = 1461;
                                this.field699[7][0] = 1507;
                                this.field699[7][3] = 1702;
                                this.field699[7][1] = 1413;
                                this.field699[7][2] = 1525;
                                this.field699[8][0] = 1736;
                                this.field699[8][3] = 2056;
                                this.field699[8][2] = 1590;
                                this.field699[8][1] = 1108;
                                this.field699[9][2] = 2056;
                                this.field699[9][3] = 2666;
                                this.field699[9][1] = 1766;
                                this.field699[9][0] = 2088;
                                this.field699[10][2] = 2586;
                                this.field699[10][0] = 2355;
                                this.field699[10][1] = 2409;
                                this.field699[10][3] = 3276;
                                this.field699[11][3] = 3228;
                                this.field699[11][1] = 3116;
                                this.field699[11][0] = 2691;
                                this.field699[11][2] = 3148;
                                this.field699[12][1] = 3806;
                                this.field699[12][0] = 3031;
                                this.field699[12][2] = 3710;
                                this.field699[12][3] = 3196;
                                this.field699[13][3] = 3019;
                                this.field699[13][1] = 3437;
                                this.field699[13][0] = 3522;
                                this.field699[13][2] = 3421;
                                this.field699[14][3] = 3228;
                                this.field699[14][1] = 3116;
                                this.field699[14][0] = 3727;
                                this.field699[14][2] = 3148;
                                this.field699[15][3] = 2746;
                                this.field699[15][2] = 2505;
                                this.field699[15][1] = 2377;
                                this.field699[15][0] = 4096;
                            }
                        } else {
                            this.field699 = new int[6][4];
                            this.field699[0][3] = 0;
                            this.field699[0][0] = 0;
                            this.field699[0][1] = 0;
                            this.field699[0][2] = 0;
                            this.field699[1][1] = 0;
                            this.field699[1][2] = 0;
                            this.field699[1][0] = 1843;
                            this.field699[1][3] = 1493;
                            this.field699[2][3] = 2939;
                            this.field699[2][0] = 2457;
                            this.field699[2][1] = 0;
                            this.field699[2][2] = 0;
                            this.field699[3][1] = 0;
                            this.field699[3][2] = 1124;
                            this.field699[3][3] = 3565;
                            this.field699[3][0] = 2781;
                            this.field699[4][2] = 3084;
                            this.field699[4][1] = 546;
                            this.field699[4][0] = 3481;
                            this.field699[4][3] = 4031;
                            this.field699[5][2] = 4096;
                            this.field699[5][1] = 4096;
                            this.field699[5][0] = 4096;
                            this.field699[5][3] = 4096;
                        }
                    } else {
                        this.field699 = new int[7][4];
                        this.field699[0][2] = 0;
                        this.field699[0][0] = 0;
                        this.field699[0][3] = 4096;
                        this.field699[0][1] = 0;
                        this.field699[1][0] = 663;
                        this.field699[1][3] = 4096;
                        this.field699[1][2] = 4096;
                        this.field699[1][1] = 0;
                        this.field699[2][0] = 1363;
                        this.field699[2][2] = 4096;
                        this.field699[2][3] = 0;
                        this.field699[2][1] = 0;
                        this.field699[3][3] = 0;
                        this.field699[3][0] = 2048;
                        this.field699[3][1] = 4096;
                        this.field699[3][2] = 4096;
                        this.field699[4][1] = 4096;
                        this.field699[4][3] = 0;
                        this.field699[4][2] = 0;
                        this.field699[4][0] = 2727;
                        this.field699[5][1] = 4096;
                        this.field699[5][3] = 4096;
                        this.field699[5][0] = 3411;
                        this.field699[5][2] = 0;
                        this.field699[6][3] = 4096;
                        this.field699[6][2] = 0;
                        this.field699[6][1] = 0;
                        this.field699[6][0] = 4096;
                    }
                } else {
                    this.field699 = new int[8][4];
                    this.field699[0][2] = 2602;
                    this.field699[0][0] = 0;
                    this.field699[0][3] = 2361;
                    this.field699[0][1] = 2650;
                    this.field699[1][3] = 1558;
                    this.field699[1][2] = 1799;
                    this.field699[1][0] = 2867;
                    this.field699[1][1] = 2313;
                    this.field699[2][2] = 1734;
                    this.field699[2][1] = 2618;
                    this.field699[2][3] = 1413;
                    this.field699[2][0] = 3072;
                    this.field699[3][0] = 3276;
                    this.field699[3][1] = 2296;
                    this.field699[3][2] = 1220;
                    this.field699[3][3] = 947;
                    this.field699[4][1] = 2072;
                    this.field699[4][0] = 3481;
                    this.field699[4][2] = 963;
                    this.field699[4][3] = 722;
                    this.field699[5][0] = 3686;
                    this.field699[5][1] = 2730;
                    this.field699[5][3] = 1766;
                    this.field699[5][2] = 2152;
                    this.field699[6][0] = 3891;
                    this.field699[6][1] = 2232;
                    this.field699[6][2] = 1060;
                    this.field699[6][3] = 915;
                    this.field699[7][1] = 1686;
                    this.field699[7][3] = 1140;
                    this.field699[7][0] = 4096;
                    this.field699[7][2] = 1413;
                }
            } else {
                this.field699 = new int[2][4];
                this.field699[0][3] = 0;
                this.field699[0][0] = 0;
                this.field699[0][2] = 0;
                this.field699[0][1] = 0;
                this.field699[1][2] = 4096;
                this.field699[1][1] = 4096;
                this.field699[1][3] = 4096;
                this.field699[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method2099(255);
            if (~var4 != -1) {
                this.method321(var4, 3);
            } else {
                this.field699 = new int[arg0.method2099(arg1 ^ -30227)][4];
                for (int var5 = 0; this.field699.length > var5; ++var5) {
                    this.field699[var5][0] = arg0.method2062((byte) 14);
                    this.field699[var5][1] = arg0.method2099(255) << 4;
                    this.field699[var5][2] = arg0.method2099(255) << 4;
                    this.field699[var5][3] = arg0.method2099(255) << 4;
                }
            }
        }
        ++field693;
        if (arg1 != -30446) {
            field705 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
    public static void method322(int arg0) {
        field705 = null;
        if (arg0 != 4096) {
            field705 = null;
        }
        field700 = null;
        field702 = null;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(III)Z")
    public static final boolean method323(int arg0, int arg1, int arg2) {
        ++field704;
        if (arg0 < 95) {
            method322(100);
        }
        return ~(arg1 & 32768) != -1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        ++field703;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (arg0 <= 75) {
            this.method324(2, 94);
        }
        if (super.field3757.field3420) {
            int[] var4 = this.method1570(0, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class507.field7456; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field697[var9];
                var5[var8] = class118.method750(16711680, var10) >> 12;
                var6[var8] = class118.method750(var10 >> 4, 4080);
                var7[var8] = class118.method750(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }

    static {
        new class83("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field705 = new class310(4, 12);
    }
}
