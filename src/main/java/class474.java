import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class474 extends class404 {

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
    private int[] field7238 = new int[257];

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Lbg;")
    public static class310 field7236 = new class310(69, 0);

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "Lhi;")
    public static class131 field7241;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "[[I")
    private int[][] field7239;

    static {
        new class423("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field7241 = new class131(10, 2, 2, 0);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V", line = 5)
    private final void method2850(boolean arg0) {
        ++field7244;
        int var2 = this.field7239.length;
        if (!arg0) {
            this.field7239 = null;
        }
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field7239[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field7239[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field7239[var4];
                    if (var4 <= 0) {
                        var9 = var11[1];
                        var10 = var11[3];
                        var8 = var11[2];
                    } else {
                        int[] var12 = this.field7239[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field7238[var3] = class318.method1973(class318.method1973(var17 << 16, var15 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 111)
    public final void method211(int arg0) {
        ++field7240;
        if (this.field7239 == null) {
            this.method2852((byte) -115, 1);
        }
        if (arg0 != -3) {
            this.method2850(true);
        }
        this.method2850(true);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I", line = 133)
    public final int[][] method89(int arg0, int arg1) {
        ++field7243;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[] var4 = this.method2394(0, (byte) 64, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class431.field6348 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7238[var9];
                var5[var8] = class330.method2050(16711680, var10) >> 12;
                var6[var8] = class330.method2050(var10, 65280) >> 4;
                var7[var8] = class330.method2050(4080, var10 << 4);
            }
        }
        if (arg0 != -1) {
            this.field7238 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 460)
    public class474() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[S)[S", line = 187)
    public static final short[] method2851(int arg0, int arg1, short[] arg2) {
        if (arg1 != 5754) {
            method2853(-72);
        }
        ++field7242;
        short[] var3 = new short[arg0];
        class356.method2181(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V", line = 201)
    private final void method2852(byte arg0, int arg1) {
        ++field7237;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7239 = new int[4][4];
                                this.field7239[0][3] = 0;
                                this.field7239[0][0] = 2048;
                                this.field7239[0][2] = 4096;
                                this.field7239[0][1] = 0;
                                this.field7239[1][0] = 2867;
                                this.field7239[1][2] = 4096;
                                this.field7239[1][3] = 0;
                                this.field7239[1][1] = 4096;
                                this.field7239[2][0] = 3276;
                                this.field7239[2][3] = 0;
                                this.field7239[2][1] = 4096;
                                this.field7239[2][2] = 4096;
                                this.field7239[3][2] = 0;
                                this.field7239[3][1] = 4096;
                                this.field7239[3][3] = 0;
                                this.field7239[3][0] = 4096;
                            } else {
                                this.field7239 = new int[16][4];
                                this.field7239[0][0] = 0;
                                this.field7239[0][3] = 321;
                                this.field7239[0][2] = 192;
                                this.field7239[0][1] = 80;
                                this.field7239[1][3] = 562;
                                this.field7239[1][0] = 155;
                                this.field7239[1][2] = 449;
                                this.field7239[1][1] = 321;
                                this.field7239[2][1] = 578;
                                this.field7239[2][2] = 690;
                                this.field7239[2][3] = 803;
                                this.field7239[2][0] = 389;
                                this.field7239[3][1] = 947;
                                this.field7239[3][3] = 1140;
                                this.field7239[3][2] = 995;
                                this.field7239[3][0] = 671;
                                this.field7239[4][3] = 1509;
                                this.field7239[4][0] = 897;
                                this.field7239[4][2] = 1397;
                                this.field7239[4][1] = 1285;
                                this.field7239[5][3] = 1413;
                                this.field7239[5][2] = 1429;
                                this.field7239[5][0] = 1175;
                                this.field7239[5][1] = 1525;
                                this.field7239[6][0] = 1368;
                                this.field7239[6][2] = 1461;
                                this.field7239[6][3] = 1333;
                                this.field7239[6][1] = 1734;
                                this.field7239[7][2] = 1525;
                                this.field7239[7][3] = 1702;
                                this.field7239[7][0] = 1507;
                                this.field7239[7][1] = 1413;
                                this.field7239[8][1] = 1108;
                                this.field7239[8][3] = 2056;
                                this.field7239[8][2] = 1590;
                                this.field7239[8][0] = 1736;
                                this.field7239[9][1] = 1766;
                                this.field7239[9][0] = 2088;
                                this.field7239[9][2] = 2056;
                                this.field7239[9][3] = 2666;
                                this.field7239[10][3] = 3276;
                                this.field7239[10][2] = 2586;
                                this.field7239[10][1] = 2409;
                                this.field7239[10][0] = 2355;
                                this.field7239[11][2] = 3148;
                                this.field7239[11][1] = 3116;
                                this.field7239[11][3] = 3228;
                                this.field7239[11][0] = 2691;
                                this.field7239[12][3] = 3196;
                                this.field7239[12][0] = 3031;
                                this.field7239[12][1] = 3806;
                                this.field7239[12][2] = 3710;
                                this.field7239[13][2] = 3421;
                                this.field7239[13][1] = 3437;
                                this.field7239[13][0] = 3522;
                                this.field7239[13][3] = 3019;
                                this.field7239[14][0] = 3727;
                                this.field7239[14][2] = 3148;
                                this.field7239[14][3] = 3228;
                                this.field7239[14][1] = 3116;
                                this.field7239[15][3] = 2746;
                                this.field7239[15][0] = 4096;
                                this.field7239[15][1] = 2377;
                                this.field7239[15][2] = 2505;
                            }
                        } else {
                            this.field7239 = new int[6][4];
                            this.field7239[0][3] = 0;
                            this.field7239[0][2] = 0;
                            this.field7239[0][1] = 0;
                            this.field7239[0][0] = 0;
                            this.field7239[1][1] = 0;
                            this.field7239[1][3] = 1493;
                            this.field7239[1][0] = 1843;
                            this.field7239[1][2] = 0;
                            this.field7239[2][2] = 0;
                            this.field7239[2][1] = 0;
                            this.field7239[2][0] = 2457;
                            this.field7239[2][3] = 2939;
                            this.field7239[3][2] = 1124;
                            this.field7239[3][3] = 3565;
                            this.field7239[3][1] = 0;
                            this.field7239[3][0] = 2781;
                            this.field7239[4][0] = 3481;
                            this.field7239[4][2] = 3084;
                            this.field7239[4][3] = 4031;
                            this.field7239[4][1] = 546;
                            this.field7239[5][0] = 4096;
                            this.field7239[5][2] = 4096;
                            this.field7239[5][1] = 4096;
                            this.field7239[5][3] = 4096;
                        }
                    } else {
                        this.field7239 = new int[7][4];
                        this.field7239[0][3] = 4096;
                        this.field7239[0][2] = 0;
                        this.field7239[0][0] = 0;
                        this.field7239[0][1] = 0;
                        this.field7239[1][0] = 663;
                        this.field7239[1][3] = 4096;
                        this.field7239[1][2] = 4096;
                        this.field7239[1][1] = 0;
                        this.field7239[2][3] = 0;
                        this.field7239[2][2] = 4096;
                        this.field7239[2][1] = 0;
                        this.field7239[2][0] = 1363;
                        this.field7239[3][0] = 2048;
                        this.field7239[3][3] = 0;
                        this.field7239[3][2] = 4096;
                        this.field7239[3][1] = 4096;
                        this.field7239[4][0] = 2727;
                        this.field7239[4][1] = 4096;
                        this.field7239[4][3] = 0;
                        this.field7239[4][2] = 0;
                        this.field7239[5][2] = 0;
                        this.field7239[5][1] = 4096;
                        this.field7239[5][3] = 4096;
                        this.field7239[5][0] = 3411;
                        this.field7239[6][1] = 0;
                        this.field7239[6][0] = 4096;
                        this.field7239[6][3] = 4096;
                        this.field7239[6][2] = 0;
                    }
                } else {
                    this.field7239 = new int[8][4];
                    this.field7239[0][3] = 2361;
                    this.field7239[0][2] = 2602;
                    this.field7239[0][1] = 2650;
                    this.field7239[0][0] = 0;
                    this.field7239[1][1] = 2313;
                    this.field7239[1][3] = 1558;
                    this.field7239[1][2] = 1799;
                    this.field7239[1][0] = 2867;
                    this.field7239[2][0] = 3072;
                    this.field7239[2][2] = 1734;
                    this.field7239[2][3] = 1413;
                    this.field7239[2][1] = 2618;
                    this.field7239[3][1] = 2296;
                    this.field7239[3][3] = 947;
                    this.field7239[3][2] = 1220;
                    this.field7239[3][0] = 3276;
                    this.field7239[4][1] = 2072;
                    this.field7239[4][2] = 963;
                    this.field7239[4][0] = 3481;
                    this.field7239[4][3] = 722;
                    this.field7239[5][0] = 3686;
                    this.field7239[5][2] = 2152;
                    this.field7239[5][1] = 2730;
                    this.field7239[5][3] = 1766;
                    this.field7239[6][1] = 2232;
                    this.field7239[6][3] = 915;
                    this.field7239[6][2] = 1060;
                    this.field7239[6][0] = 3891;
                    this.field7239[7][3] = 1140;
                    this.field7239[7][0] = 4096;
                    this.field7239[7][1] = 1686;
                    this.field7239[7][2] = 1413;
                }
            } else {
                this.field7239 = new int[2][4];
                this.field7239[0][2] = 0;
                this.field7239[0][1] = 0;
                this.field7239[0][0] = 0;
                this.field7239[0][3] = 0;
                this.field7239[1][2] = 4096;
                this.field7239[1][3] = 4096;
                this.field7239[1][1] = 4096;
                this.field7239[1][0] = 4096;
            }
        }
        if (arg0 >= -110) {
            this.method2852((byte) -58, 115);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V", line = 449)
    public static void method2853(int arg0) {
        field7236 = null;
        field7241 = null;
        if (arg0 != -27747) {
            method2853(115);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILha;I)V", line = 472)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            this.method89(74, 25);
        }
        if (~arg2 == -1) {
            int var4 = arg1.method257((byte) 103);
            if (~var4 != -1) {
                this.method2852((byte) -126, var4);
            } else {
                this.field7239 = new int[arg1.method257((byte) 29)][4];
                for (int var5 = 0; ~var5 > ~this.field7239.length; ++var5) {
                    this.field7239[var5][0] = arg1.method254((byte) -77);
                    this.field7239[var5][1] = arg1.method257((byte) 55) << 4;
                    this.field7239[var5][2] = arg1.method257((byte) 59) << 4;
                    this.field7239[var5][3] = arg1.method257((byte) 53) << 4;
                }
            }
        }
        ++field7235;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqq;Lps;III)V", line = 514)
    public static final void method2854(class318 arg0, class59 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class377.field5492) {
            class268 var5 = class321.field4830[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4042 != null && var5.field4042.method164(0)) {
                arg1.method165(0, arg0, var5.field4042, true, true, 0, class434.field6362);
            }
        }
        if (arg4 < class377.field5492) {
            class268 var6 = class321.field4830[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4042 != null && var6.field4042.method164(0)) {
                arg1.method165(0, arg0, var6.field4042, true, true, class434.field6362, 0);
            }
        }
        if (arg3 < class377.field5492 && arg4 < class347.field5132) {
            class268 var7 = class321.field4830[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4042 != null && var7.field4042.method164(0)) {
                arg1.method165(0, arg0, var7.field4042, true, true, class434.field6362, class434.field6362);
            }
        }
        if (arg3 < class377.field5492 && arg4 > 0) {
            class268 var8 = class321.field4830[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4042 != null && var8.field4042.method164(0)) {
                arg1.method165(0, arg0, var8.field4042, true, true, -class434.field6362, class434.field6362);
            }
        }
    }
}
