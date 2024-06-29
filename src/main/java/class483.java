import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class483 extends class456 {

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[I")
    private int[] field6771 = new int[257];

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "Lct;")
    public static class285 field6778 = new class285(49, 3);

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field6780 = -2;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "[Lgi;")
    public static class453[] field6782;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "B")
    public static byte field6779;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[Lcl;")
    public static class48[] field6781;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "[[I")
    private int[][] field6776;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public static final void method2824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= -91) {
            class119.field1643 = arg1;
            class176.field2503 = arg2;
            ++field6770;
            class296.field4443 = arg4;
            class293.field4420 = arg3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field6773;
        if (~arg0 == -1) {
            int var4 = arg2.method2628(49152);
            if (var4 != 0) {
                this.method2825(var4, (byte) -89);
            } else {
                this.field6776 = new int[arg2.method2628(49152)][4];
                for (int var5 = 0; var5 < this.field6776.length; ++var5) {
                    this.field6776[var5][0] = arg2.method2631(2530);
                    this.field6776[var5][1] = arg2.method2628(49152) << 4;
                    this.field6776[var5][2] = arg2.method2628(49152) << 4;
                    this.field6776[var5][3] = arg2.method2628(class76.method648(arg1, 49207)) << 4;
                }
            }
        }
        if (arg1 != 55) {
            this.method212(81, -101);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    private final void method2825(int arg0, byte arg1) {
        ++field6777;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6776 = new int[4][4];
                                this.field6776[0][0] = 2048;
                                this.field6776[0][3] = 0;
                                this.field6776[0][1] = 0;
                                this.field6776[0][2] = 4096;
                                this.field6776[1][1] = 4096;
                                this.field6776[1][3] = 0;
                                this.field6776[1][0] = 2867;
                                this.field6776[1][2] = 4096;
                                this.field6776[2][0] = 3276;
                                this.field6776[2][3] = 0;
                                this.field6776[2][2] = 4096;
                                this.field6776[2][1] = 4096;
                                this.field6776[3][2] = 0;
                                this.field6776[3][3] = 0;
                                this.field6776[3][1] = 4096;
                                this.field6776[3][0] = 4096;
                            } else {
                                this.field6776 = new int[16][4];
                                this.field6776[0][1] = 80;
                                this.field6776[0][0] = 0;
                                this.field6776[0][3] = 321;
                                this.field6776[0][2] = 192;
                                this.field6776[1][1] = 321;
                                this.field6776[1][2] = 449;
                                this.field6776[1][3] = 562;
                                this.field6776[1][0] = 155;
                                this.field6776[2][2] = 690;
                                this.field6776[2][3] = 803;
                                this.field6776[2][0] = 389;
                                this.field6776[2][1] = 578;
                                this.field6776[3][3] = 1140;
                                this.field6776[3][1] = 947;
                                this.field6776[3][0] = 671;
                                this.field6776[3][2] = 995;
                                this.field6776[4][1] = 1285;
                                this.field6776[4][2] = 1397;
                                this.field6776[4][0] = 897;
                                this.field6776[4][3] = 1509;
                                this.field6776[5][2] = 1429;
                                this.field6776[5][3] = 1413;
                                this.field6776[5][1] = 1525;
                                this.field6776[5][0] = 1175;
                                this.field6776[6][2] = 1461;
                                this.field6776[6][3] = 1333;
                                this.field6776[6][1] = 1734;
                                this.field6776[6][0] = 1368;
                                this.field6776[7][0] = 1507;
                                this.field6776[7][3] = 1702;
                                this.field6776[7][2] = 1525;
                                this.field6776[7][1] = 1413;
                                this.field6776[8][1] = 1108;
                                this.field6776[8][0] = 1736;
                                this.field6776[8][3] = 2056;
                                this.field6776[8][2] = 1590;
                                this.field6776[9][2] = 2056;
                                this.field6776[9][3] = 2666;
                                this.field6776[9][0] = 2088;
                                this.field6776[9][1] = 1766;
                                this.field6776[10][3] = 3276;
                                this.field6776[10][2] = 2586;
                                this.field6776[10][0] = 2355;
                                this.field6776[10][1] = 2409;
                                this.field6776[11][0] = 2691;
                                this.field6776[11][3] = 3228;
                                this.field6776[11][2] = 3148;
                                this.field6776[11][1] = 3116;
                                this.field6776[12][2] = 3710;
                                this.field6776[12][1] = 3806;
                                this.field6776[12][3] = 3196;
                                this.field6776[12][0] = 3031;
                                this.field6776[13][2] = 3421;
                                this.field6776[13][1] = 3437;
                                this.field6776[13][3] = 3019;
                                this.field6776[13][0] = 3522;
                                this.field6776[14][3] = 3228;
                                this.field6776[14][0] = 3727;
                                this.field6776[14][1] = 3116;
                                this.field6776[14][2] = 3148;
                                this.field6776[15][2] = 2505;
                                this.field6776[15][1] = 2377;
                                this.field6776[15][3] = 2746;
                                this.field6776[15][0] = 4096;
                            }
                        } else {
                            this.field6776 = new int[6][4];
                            this.field6776[0][0] = 0;
                            this.field6776[0][3] = 0;
                            this.field6776[0][1] = 0;
                            this.field6776[0][2] = 0;
                            this.field6776[1][2] = 0;
                            this.field6776[1][1] = 0;
                            this.field6776[1][3] = 1493;
                            this.field6776[1][0] = 1843;
                            this.field6776[2][3] = 2939;
                            this.field6776[2][2] = 0;
                            this.field6776[2][0] = 2457;
                            this.field6776[2][1] = 0;
                            this.field6776[3][3] = 3565;
                            this.field6776[3][2] = 1124;
                            this.field6776[3][1] = 0;
                            this.field6776[3][0] = 2781;
                            this.field6776[4][2] = 3084;
                            this.field6776[4][3] = 4031;
                            this.field6776[4][1] = 546;
                            this.field6776[4][0] = 3481;
                            this.field6776[5][0] = 4096;
                            this.field6776[5][1] = 4096;
                            this.field6776[5][2] = 4096;
                            this.field6776[5][3] = 4096;
                        }
                    } else {
                        this.field6776 = new int[7][4];
                        this.field6776[0][3] = 4096;
                        this.field6776[0][1] = 0;
                        this.field6776[0][0] = 0;
                        this.field6776[0][2] = 0;
                        this.field6776[1][3] = 4096;
                        this.field6776[1][1] = 0;
                        this.field6776[1][0] = 663;
                        this.field6776[1][2] = 4096;
                        this.field6776[2][2] = 4096;
                        this.field6776[2][0] = 1363;
                        this.field6776[2][1] = 0;
                        this.field6776[2][3] = 0;
                        this.field6776[3][1] = 4096;
                        this.field6776[3][0] = 2048;
                        this.field6776[3][2] = 4096;
                        this.field6776[3][3] = 0;
                        this.field6776[4][1] = 4096;
                        this.field6776[4][2] = 0;
                        this.field6776[4][3] = 0;
                        this.field6776[4][0] = 2727;
                        this.field6776[5][0] = 3411;
                        this.field6776[5][2] = 0;
                        this.field6776[5][1] = 4096;
                        this.field6776[5][3] = 4096;
                        this.field6776[6][3] = 4096;
                        this.field6776[6][2] = 0;
                        this.field6776[6][0] = 4096;
                        this.field6776[6][1] = 0;
                    }
                } else {
                    this.field6776 = new int[8][4];
                    this.field6776[0][0] = 0;
                    this.field6776[0][2] = 2602;
                    this.field6776[0][3] = 2361;
                    this.field6776[0][1] = 2650;
                    this.field6776[1][3] = 1558;
                    this.field6776[1][0] = 2867;
                    this.field6776[1][2] = 1799;
                    this.field6776[1][1] = 2313;
                    this.field6776[2][0] = 3072;
                    this.field6776[2][1] = 2618;
                    this.field6776[2][3] = 1413;
                    this.field6776[2][2] = 1734;
                    this.field6776[3][2] = 1220;
                    this.field6776[3][1] = 2296;
                    this.field6776[3][0] = 3276;
                    this.field6776[3][3] = 947;
                    this.field6776[4][0] = 3481;
                    this.field6776[4][3] = 722;
                    this.field6776[4][1] = 2072;
                    this.field6776[4][2] = 963;
                    this.field6776[5][0] = 3686;
                    this.field6776[5][3] = 1766;
                    this.field6776[5][2] = 2152;
                    this.field6776[5][1] = 2730;
                    this.field6776[6][2] = 1060;
                    this.field6776[6][1] = 2232;
                    this.field6776[6][3] = 915;
                    this.field6776[6][0] = 3891;
                    this.field6776[7][1] = 1686;
                    this.field6776[7][3] = 1140;
                    this.field6776[7][0] = 4096;
                    this.field6776[7][2] = 1413;
                }
            } else {
                this.field6776 = new int[2][4];
                this.field6776[0][0] = 0;
                this.field6776[0][1] = 0;
                this.field6776[0][2] = 0;
                this.field6776[0][3] = 0;
                this.field6776[1][0] = 4096;
                this.field6776[1][1] = 4096;
                this.field6776[1][3] = 4096;
                this.field6776[1][2] = 4096;
            }
        }
        int var4 = -30 % ((arg1 - -12) / 52);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class483() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    private final void method2826(byte arg0) {
        ++field6774;
        int var2 = this.field6776.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~this.field6776[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field6776[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field6776[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field6776[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var8 = var11[2];
                        var9 = var11[1];
                        var10 = var11[3];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field6771[var3] = class347.method2139(var16, class347.method2139(var17 << 16, var15 << 8));
            }
        }
        if (arg0 != 25) {
            this.method2826((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field6772;
        if (arg0 != 0) {
            return null;
        } else {
            int[][] var3 = super.field6468.method1090(-2, arg1);
            if (super.field6468.field2227) {
                int[] var4 = this.method2707(arg1, arg0 + -31797, 0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~class156.field2169 < ~var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field6771[var9];
                    var5[var8] = class412.method2463(var10 >> 12, 4080);
                    var6[var8] = class412.method2463(var10 >> 4, 4080);
                    var7[var8] = class412.method2463(255, var10) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
    public static void method2827(int arg0) {
        if (arg0 != 1736) {
            field6779 = -121;
        }
        field6781 = null;
        field6782 = null;
        field6778 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        ++field6775;
        if (this.field6776 == null) {
            this.method2825(1, (byte) 69);
        }
        this.method2826((byte) 25);
        if (!arg0) {
            field6779 = -80;
        }
    }

    static {
        new class332("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field6782 = new class453[16];
    }
}
