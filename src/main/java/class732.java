import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class732 {

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "[I")
    private int[] field10735 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[I")
    private int[] field10719 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Lhg;")
    private class722 field10744;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public int field10717;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
    public boolean field10721;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public int field10725;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Lgv;")
    private class87 field10734;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public int field10727;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[[[B")
    public byte[][][] field10745;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "[[[I")
    public int[][][] field10741;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "[[[B")
    private byte[][][] field10730;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[[[B")
    private byte[][][] field10737;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "[[[B")
    private byte[][][] field10743;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "[[[B")
    private byte[][][] field10722;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field10748 = new String[] { method5319(method5318("J&\u001ci")), method5319(method5318("C=^9\u0003J:\u0004;B")), method5319(method5318("_}^+\u0017")), method5319(method5318("C=^OB")), method5319(method5318("C=^LB")), method5319(method5318("C=^DB")), method5319(method5318("C=^AB")), method5319(method5318("C=^GB")), method5319(method5318("C=^KB")), method5319(method5318("C=^CB")), method5319(method5318("C=^NB")), method5319(method5318("C=^@B")), method5319(method5318("C=^MB")), method5319(method5318("C=^BB")), method5319(method5318("C=^FB")), method5319(method5318("C=^IB")), method5319(method5318("C=^HB")) };

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "[I")
    public static int[] field10723 = new int[2048];

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field10718;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field10732;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field10733;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field10742;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field10746;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public static int field10747;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
    public static int[] field10726;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "[[[B")
    public byte[][][] field10739;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIILwq;IIZI)V")
    private final void method5304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6, int arg7, int arg8, boolean arg9, int arg10) {
        try {
            field10733++;
            if (arg4 == 1) {
                arg8 = 1;
            } else if (arg4 == 2) {
                arg3 = 1;
                arg8 = 1;
            } else if (arg4 == 3) {
                arg3 = 1;
            }
            if (arg0 >= 0 && arg0 < this.field10725 && arg7 >= 0 && this.field10727 > arg7) {
                if (!this.field10721 && !arg9) {
                    class224.field3519[arg5][arg0][arg7] = 0;
                }
                while (true) {
                    int var13 = arg6.method1645((byte) -115);
                    if (var13 == 0) {
                        if (this.field10721) {
                            this.field10741[0][arg0 + arg3][arg7 + arg8] = 0;
                        } else if (arg5 == 0) {
                            this.field10741[0][arg0 + arg3][arg7 + arg8] = -class95.method919(arg1 + 932731, 128, arg10 + 556238) * 8 << 2;
                        } else {
                            this.field10741[arg5][arg0 + arg3][arg7 + arg8] = this.field10741[arg5 - 1][arg0 + arg3][arg7 + arg8] - 960;
                        }
                        break;
                    }
                    if (var13 == 1) {
                        int var14 = arg6.method1645((byte) -110);
                        if (this.field10721) {
                            this.field10741[0][arg0 + arg3][arg7 + arg8] = var14 * 8 << 2;
                        } else {
                            if (var14 == 1) {
                                var14 = 0;
                            }
                            if (arg5 == 0) {
                                this.field10741[0][arg0 + arg3][arg7 + arg8] = -var14 * 8 << 2;
                            } else {
                                this.field10741[arg5][arg0 + arg3][arg7 + arg8] = this.field10741[arg5 - 1][arg0 + arg3][arg7 + arg8] - (var14 * 8 << 2);
                            }
                        }
                        break;
                    }
                    if (var13 <= 49) {
                        if (arg9) {
                            arg6.method1645((byte) -125);
                        } else {
                            this.field10722[arg5][arg0][arg7] = arg6.method1672(7);
                            this.field10730[arg5][arg0][arg7] = (byte) ((var13 - 2) / 4);
                            this.field10737[arg5][arg0][arg7] = (byte) class292.method2485(arg4 + var13 - 2, 3);
                        }
                    } else if (var13 <= 81) {
                        if (!this.field10721 && !arg9) {
                            class224.field3519[arg5][arg0][arg7] = (byte) (var13 - 49);
                        }
                    } else if (!arg9) {
                        this.field10743[arg5][arg0][arg7] = (byte) (var13 - 81);
                    }
                }
            } else {
                while (true) {
                    int var12 = arg6.method1645((byte) -75);
                    if (var12 == 0) {
                        break;
                    }
                    if (var12 == 1) {
                        arg6.method1645((byte) -104);
                        break;
                    }
                    if (var12 <= 49) {
                        arg6.method1645((byte) -102);
                    }
                }
            }
            if (arg2 != -2011856446) {
                field10726 = null;
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field10748[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field10748[0] : field10748[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method5305(int arg0) {
        try {
            int var1 = 78 % ((arg0 + 63) / 34);
            field10726 = null;
            field10723 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10748[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lii;ILwq;BIII)V")
    public final void method5306(class580[] arg0, int arg1, class176 arg2, byte arg3, int arg4, int arg5, int arg6) {
        try {
            field10718++;
            if (!this.field10721) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class580 var9 = arg0[var8];
                    for (int var10 = 0; var10 < 64; var10++) {
                        for (int var11 = 0; var11 < 64; var11++) {
                            int var12 = arg6 + var10;
                            int var13 = arg1 + var11;
                            if (var12 >= 0 && this.field10725 > var12 && var13 >= 0 && var13 < this.field10727) {
                                var9.method4261(var13, var12, 13575);
                            }
                        }
                    }
                }
            }
            if (arg3 == -79) {
                int var14 = arg5 + arg6;
                int var15 = arg1 + arg4;
                for (int var16 = 0; var16 < this.field10717; var16++) {
                    for (int var17 = 0; var17 < 64; var17++) {
                        for (int var18 = 0; var18 < 64; var18++) {
                            this.method5304(arg6 + var17, var14 + var17, arg3 ^ 0x77EA7E73, 0, 0, var16, arg2, arg1 + var18, 0, false, var15 + var18);
                        }
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field10748[11] + (arg0 == null ? field10748[0] : field10748[2]) + ',' + arg1 + ',' + (arg2 == null ? field10748[0] : field10748[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V")
    public static final void method5307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10742++;
            int var5 = 0;
            int var6 = arg4;
            int var7 = -arg4;
            int var8 = -1;
            if (arg1 == -20478) {
                int var9 = class694.method5039(class779.field11374, class546.field8030, 0, arg3 + arg4);
                int var10 = class694.method5039(class779.field11374, class546.field8030, 0, arg3 - arg4);
                class545.method4051(var10, arg2, var9, class193.field3047[arg0], -126);
                while (var6 > var5) {
                    var8 += 2;
                    var7 += var8;
                    if (var7 > 0) {
                        var6--;
                        var7 -= var6 << 1;
                        int var11 = arg0 - var6;
                        int var12 = arg0 + var6;
                        if (class310.field5088 <= var12 && var11 <= class478.field7264) {
                            int var13 = class694.method5039(class779.field11374, class546.field8030, arg1 ^ 0xFFFFB002, arg3 + var5);
                            int var14 = class694.method5039(class779.field11374, class546.field8030, arg1 + 20478, arg3 - var5);
                            if (var12 <= class478.field7264) {
                                class545.method4051(var14, arg2, var13, class193.field3047[var12], arg1 + 20370);
                            }
                            if (var11 >= class310.field5088) {
                                class545.method4051(var14, arg2, var13, class193.field3047[var11], -110);
                            }
                        }
                    }
                    var5++;
                    int var15 = arg0 - var5;
                    int var16 = arg0 + var5;
                    if (class310.field5088 <= var16 && var15 <= class478.field7264) {
                        int var17 = class694.method5039(class779.field11374, class546.field8030, 0, arg3 + var6);
                        int var18 = class694.method5039(class779.field11374, class546.field8030, 0, arg3 - var6);
                        if (class478.field7264 >= var16) {
                            class545.method4051(var18, arg2, var17, class193.field3047[var16], -115);
                        }
                        if (class310.field5088 <= var15) {
                            class545.method4051(var18, arg2, var17, class193.field3047[var15], -122);
                        }
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field10748[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lii;Lha;Z[[[I)V")
    public final void method5308(class580[] arg0, class63 arg1, boolean arg2, int[][][] arg3) {
        try {
            if (!this.field10721) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 0; var6 < this.field10725; var6++) {
                        for (int var7 = 0; var7 < this.field10727; var7++) {
                            if ((class224.field3519[var5][var6][var7] & 0x1) != 0) {
                                int var8 = var5;
                                if ((class224.field3519[1][var6][var7] & 0x2) != 0) {
                                    var8 = var5 - 1;
                                }
                                if (var8 >= 0) {
                                    arg0[var8].method4256(var7, (byte) -114, var6);
                                }
                            }
                        }
                    }
                }
            }
            field10736++;
            if (!arg2) {
                field10723 = null;
            }
            for (int var9 = 0; var9 < this.field10717; var9++) {
                int var10 = 0;
                int var11 = 0;
                if (!this.field10721) {
                    if (class700.field10072) {
                        var10 |= 0x2;
                    }
                    if (class492.field7414) {
                        var11 |= 0x8;
                    }
                    if (class460.field7083 != 0) {
                        if (var9 == 0 | class758.field11148) {
                            var11 |= 0x10;
                        }
                        var10 |= 0x1;
                    }
                }
                if (class700.field10072) {
                    var11 |= 0x7;
                }
                if (!class439.field6859) {
                    var11 |= 0x20;
                }
                int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field10741[var9] : arg3[var9];
                class505.method3808(var9, arg1.method204(this.field10725, this.field10727, this.field10741[var9], var12, 512, var10, var11));
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field10748[5] + (arg0 == null ? field10748[0] : field10748[2]) + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + arg2 + ',' + (arg3 == null ? field10748[0] : field10748[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIBI)V")
    public final void method5309(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        try {
            int var7 = arg1;
            if (arg4 != 59) {
                this.field10717 = -79;
            }
            while (var7 < arg1 + arg5) {
                for (int var8 = arg0; var8 < (arg0 + arg3); var8++) {
                    if (var8 >= 0 && var8 < this.field10725 && var7 >= 0 && var7 < this.field10727) {
                        this.field10741[arg2][var8][var7] = arg2 <= 0 ? 0 : this.field10741[arg2 - 1][var8][var7] - 960;
                    }
                }
                var7++;
            }
            field10720++;
            if (arg0 > 0 && arg0 < this.field10725) {
                for (int var9 = arg1 + 1; var9 < (arg1 + arg5); var9++) {
                    if (var9 >= 0 && var9 < this.field10727) {
                        this.field10741[arg2][arg0][var9] = this.field10741[arg2][arg0 - 1][var9];
                    }
                }
            }
            if (arg1 > 0 && arg1 < this.field10727) {
                for (int var10 = arg0 + 1; var10 < (arg0 + arg3); var10++) {
                    if (var10 >= 0 && this.field10725 > var10) {
                        this.field10741[arg2][var10][arg1] = this.field10741[arg2][var10][arg1 - 1];
                    }
                }
            }
            if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field10725 && this.field10727 > arg1) {
                if (arg2 != 0) {
                    if (arg0 > 0 && this.field10741[arg2 - 1][arg0 - 1][arg1] != this.field10741[arg2][arg0 - 1][arg1]) {
                        this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0 - 1][arg1];
                        return;
                    }
                    if (arg1 > 0 && this.field10741[arg2 - 1][arg0][arg1 - 1] != this.field10741[arg2][arg0][arg1 - 1]) {
                        this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0][arg1 - 1];
                        return;
                    }
                    if (arg0 > 0 && arg1 > 0 && this.field10741[arg2][arg0 - 1][arg1 - 1] != this.field10741[arg2 - 1][arg0 - 1][arg1 - 1]) {
                        this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0 - 1][arg1 - 1];
                        return;
                    }
                    return;
                }
                if (arg0 > 0 && this.field10741[arg2][arg0 - 1][arg1] != 0) {
                    this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0 - 1][arg1];
                    return;
                }
                if (arg1 > 0 && this.field10741[arg2][arg0][arg1 - 1] != 0) {
                    this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0][arg1 - 1];
                    return;
                }
                if (arg0 > 0 && arg1 > 0 && this.field10741[arg2][arg0 - 1][arg1 - 1] != 0) {
                    this.field10741[arg2][arg0][arg1] = this.field10741[arg2][arg0 - 1][arg1 - 1];
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field10748[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ls;Ls;Ls;Lha;I[[IB)V")
    private final void method5310(class293 arg0, class293 arg1, class293 arg2, class63 arg3, int arg4, int[][] arg5, byte arg6) {
        try {
            field10731++;
            byte[][] var8 = this.field10730[arg4];
            byte[][] var9 = this.field10737[arg4];
            byte[][] var10 = this.field10743[arg4];
            byte[][] var11 = this.field10722[arg4];
            if (arg6 == 63) {
                for (int var12 = 0; var12 < this.field10725; var12++) {
                    int var13 = this.field10725 - 1 <= var12 ? var12 : var12 + 1;
                    for (int var14 = 0; var14 < this.field10727; var14++) {
                        int var15 = var14 < (this.field10727 - 1) ? var14 + 1 : var14;
                        if (class40.field463 == -1 || class223.method1962(arg4, -94, class40.field463, var14, var12)) {
                            boolean var16 = false;
                            boolean var17 = false;
                            boolean[] var18 = new boolean[4];
                            int var19 = var8[var12][var14];
                            int var20 = var9[var12][var14];
                            int var21 = var11[var12][var14] & 0xFF;
                            int var22 = var10[var12][var14] & 0xFF;
                            int var23 = var10[var12][var15] & 0xFF;
                            int var24 = var10[var13][var15] & 0xFF;
                            int var25 = var10[var13][var14] & 0xFF;
                            if (var21 != 0 || var22 != 0) {
                                class466 var26 = var21 == 0 ? null : this.field10734.method865(var21 - 1, true);
                                if (var19 == 0 && var26 == null) {
                                    var19 = 12;
                                }
                                class447 var27 = var22 == 0 ? null : this.field10744.method5246((byte) 126, var22 - 1);
                                class466 var28 = var26;
                                if (var26 != null) {
                                    if (var26.field7143 == -1 && var26.field7161 == -1) {
                                        var28 = var26;
                                        var26 = null;
                                    } else if (var27 != null && var19 != 0) {
                                        var17 = var26.field7151;
                                    }
                                }
                                if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field10725 > var12 && var14 < this.field10727) {
                                    byte var29 = 0;
                                    byte var30 = 0;
                                    byte var31 = 0;
                                    int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                                    int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                                    byte var34 = 0;
                                    int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                                    int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                                    if (var10[var12][var14 - 1] == var22) {
                                        var35++;
                                        var32++;
                                    } else {
                                        var32--;
                                        var35--;
                                    }
                                    if (var10[var13][var14] == var22) {
                                        var35++;
                                        var33++;
                                    } else {
                                        var35--;
                                        var33--;
                                    }
                                    if (var10[var12][var15] == var22) {
                                        var33++;
                                        var36++;
                                    } else {
                                        var36--;
                                        var33--;
                                    }
                                    if (var10[var12 - 1][var14] == var22) {
                                        var36++;
                                        var32++;
                                    } else {
                                        var32--;
                                        var36--;
                                    }
                                    int var37 = var32 - var33;
                                    if (var37 < 0) {
                                        var37 = -var37;
                                    }
                                    int var38 = var35 - var36;
                                    if (var38 < 0) {
                                        var38 = -var38;
                                    }
                                    if (var37 == var38) {
                                        var37 = arg0.method2495(var14, 1, var12) - arg0.method2495(var15, arg6 - 62, var13);
                                        if (var37 < 0) {
                                            var37 = -var37;
                                        }
                                        var38 = arg0.method2495(var14, 1, var13) - arg0.method2495(var15, 1, var12);
                                        if (var38 < 0) {
                                            var38 = -var38;
                                        }
                                    }
                                    var20 = var38 <= var37 ? 0 : 1;
                                }
                                for (int var39 = 0; var39 < 13; var39++) {
                                    class407.field6441[var39] = -1;
                                    class788.field11521[var39] = 1;
                                }
                                boolean[] var40 = var26 != null && var26.field7151 ? class484.field7345[var19] : class29.field311[var19];
                                this.method5317(3, var11, var18, this.field10725, var27, var14, this.field10727, arg3, var26, var19, var20, var8, var12, var9);
                                boolean var41 = var26 != null && var26.field7161 != var26.field7143;
                                if (!var41) {
                                    for (int var42 = 0; var42 < 8; var42++) {
                                        if (class407.field6441[var42] >= 0 && class776.field11333[var42] != class201.field3180[var42]) {
                                            var41 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var40[var20 + 1 & 0x3]) {
                                    var18[1] = class475.method3637(var18[1], class292.method2485(class788.field11521[4], class788.field11521[2]) == 0);
                                }
                                if (!var40[var20 + 3 & 0x3]) {
                                    var18[3] = class475.method3637(var18[3], class292.method2485(class788.field11521[0], class788.field11521[6]) == 0);
                                }
                                if (!var40[var20 & 0x3]) {
                                    var18[0] = class475.method3637(var18[0], class292.method2485(class788.field11521[0], class788.field11521[2]) == 0);
                                }
                                if (!var40[var20 + 2 & 0x3]) {
                                    var18[2] = class475.method3637(var18[2], class292.method2485(class788.field11521[4], class788.field11521[6]) == 0);
                                }
                                if (!var17 && (var19 == 0 || var19 == 12)) {
                                    if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                        var20 = 0;
                                        var19 = var19 == 0 ? 13 : 14;
                                        var18[0] = var18[3] = false;
                                    } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                        var20 = 3;
                                        var18[0] = var18[1] = false;
                                        var19 = var19 == 0 ? 13 : 14;
                                    } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                        var19 = var19 == 0 ? 13 : 14;
                                        var20 = 2;
                                        var18[1] = var18[2] = false;
                                    } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                        var20 = 1;
                                        var19 = var19 == 0 ? 13 : 14;
                                        var18[2] = var18[3] = false;
                                    }
                                }
                                boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                                int[] var44 = null;
                                int[] var45;
                                int[] var46;
                                int var47;
                                int[] var48;
                                int var49;
                                if (var43) {
                                    var47 = var27 == null ? 0 : class119.field1727[var19];
                                    var45 = class396.field6284[var19];
                                    var48 = class91.field1346[var19];
                                    var49 = var26 == null ? 0 : class108.field1548[var19];
                                    var46 = class25.field276[var19];
                                } else if (var17) {
                                    var45 = class478.field7296[var19];
                                    var46 = class172.field2758[var19];
                                    var44 = class375.field6083[var19];
                                    var47 = var27 == null ? 0 : class254.field3879[var19];
                                    var48 = class674.field9568[var19];
                                    var49 = var26 == null ? 0 : class620.field8956[var19];
                                } else {
                                    var45 = class439.field6860[var19];
                                    var48 = class106.field1529[var19];
                                    var44 = class149.field2089[var19];
                                    var47 = var27 == null ? 0 : class89.field1327[var19];
                                    var49 = var26 == null ? 0 : class766.field11218[var19];
                                    var46 = class98.field1452[var19];
                                }
                                int var50 = var49 + var47;
                                if (var50 <= 0) {
                                    class483.method3683(arg4, var12, var14);
                                } else {
                                    if (var18[0]) {
                                        var50++;
                                    }
                                    if (var18[2]) {
                                        var50++;
                                    }
                                    if (var18[1]) {
                                        var50++;
                                    }
                                    if (var18[3]) {
                                        var50++;
                                    }
                                    int var51 = 0;
                                    int var52 = 0;
                                    int var53 = var50 * 3;
                                    int[] var54 = var41 ? new int[var53] : null;
                                    int[] var55 = new int[var53];
                                    int[] var56 = new int[var53];
                                    int[] var57 = new int[var53];
                                    int[] var58 = new int[var53];
                                    int[] var59 = new int[var53];
                                    int[] var60 = arg1 == null ? null : new int[var53];
                                    int[] var61 = arg1 == null && arg2 == null ? null : new int[var53];
                                    int var62 = -1;
                                    int var63 = -1;
                                    int var64 = 256;
                                    if (var26 != null) {
                                        var63 = var26.field7160;
                                        var64 = var26.field7163;
                                        var62 = var26.field7143;
                                        int var65 = class365.method3020(arg3, var26, -18754);
                                        for (int var66 = 0; var66 < var49; var66++) {
                                            boolean var67 = false;
                                            byte var68;
                                            if (var18[-var20 & 0x3] && var44[0] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 1;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 1;
                                                class711.field10297[4] = var45[var51];
                                                var68 = 6;
                                                class711.field10297[5] = var46[var51];
                                            } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 5;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 5;
                                                class711.field10297[4] = var45[var51];
                                                class711.field10297[5] = var46[var51];
                                                var68 = 6;
                                            } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 3;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 3;
                                                class711.field10297[4] = var45[var51];
                                                class711.field10297[5] = var46[var51];
                                                var68 = 6;
                                            } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 7;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 7;
                                                class711.field10297[4] = var45[var51];
                                                var68 = 6;
                                                class711.field10297[5] = var46[var51];
                                            } else {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = var45[var51];
                                                class711.field10297[2] = var46[var51];
                                                var68 = 3;
                                            }
                                            var51++;
                                            for (int var69 = 0; var69 < var68; var69++) {
                                                int var70 = class711.field10297[var69];
                                                int var71 = var70 - var20 * 2 & 0x7;
                                                int var72 = this.field10719[var70];
                                                int var73 = this.field10735[var70];
                                                int var74;
                                                int var75;
                                                if (var20 == 1) {
                                                    var75 = var73;
                                                    var74 = 512 - var72;
                                                } else if (var20 == 2) {
                                                    var74 = 512 - var73;
                                                    var75 = 512 - var72;
                                                } else if (var20 == 3) {
                                                    var74 = var72;
                                                    var75 = 512 - var73;
                                                } else {
                                                    var74 = var73;
                                                    var75 = var72;
                                                }
                                                var55[var52] = var75;
                                                var56[var52] = var74;
                                                if (var60 != null && class513.field7590[var19][var70]) {
                                                    int var76 = (var12 << 9) + var75;
                                                    int var77 = (var14 << 9) + var74;
                                                    var60[var52] = arg1.method2497((byte) -79, var76, var77) - arg0.method2497((byte) -117, var76, var77);
                                                }
                                                if (var61 != null) {
                                                    if (arg1 != null && !class513.field7590[var19][var70]) {
                                                        int var78 = (var12 << 9) + var75;
                                                        int var79 = (var14 << 9) + var74;
                                                        var61[var52] = arg0.method2497((byte) -127, var78, var79) - arg1.method2497((byte) -125, var78, var79);
                                                    } else if (arg2 != null && !class339.field5531[var19][var70]) {
                                                        int var80 = (var12 << 9) + var75;
                                                        int var81 = (var14 << 9) + var74;
                                                        var61[var52] = arg2.method2497((byte) -85, var80, var81) - arg0.method2497((byte) -92, var80, var81);
                                                    }
                                                }
                                                if (var70 < 8 && class407.field6441[var71] > var26.field7145) {
                                                    if (var54 != null) {
                                                        var54[var52] = class201.field3180[var71];
                                                    }
                                                    var59[var52] = class173.field2764[var71];
                                                    var58[var52] = class620.field8961[var71];
                                                    var57[var52] = class776.field11333[var71];
                                                } else {
                                                    if (var54 != null) {
                                                        var54[var52] = var65;
                                                    }
                                                    var58[var52] = var26.field7160;
                                                    var59[var52] = var26.field7163;
                                                    var57[var52] = var62;
                                                }
                                                var52++;
                                            }
                                        }
                                        if (!this.field10721 && arg4 == 0) {
                                            class764.method5512(var12, var14, var26.field7162, var26.field7149 * 8, var26.field7157);
                                        }
                                        if (var19 != 12 && var26.field7143 != -1 && var26.field7155) {
                                            var16 = true;
                                        }
                                    } else if (var43) {
                                        var51 += class108.field1548[var19];
                                    } else if (var17) {
                                        var51 += class620.field8956[var19];
                                    } else {
                                        var51 += class766.field11218[var19];
                                    }
                                    if (var27 != null) {
                                        if (var25 == 0) {
                                            var25 = var22;
                                        }
                                        if (var23 == 0) {
                                            var23 = var22;
                                        }
                                        if (var24 == 0) {
                                            var24 = var22;
                                        }
                                        class447 var82 = this.field10744.method5246((byte) 100, var22 - 1);
                                        class447 var83 = this.field10744.method5246((byte) 106, var23 - 1);
                                        class447 var84 = this.field10744.method5246((byte) 127, var24 - 1);
                                        class447 var85 = this.field10744.method5246((byte) 127, var25 - 1);
                                        for (int var86 = 0; var86 < var47; var86++) {
                                            boolean var87 = false;
                                            byte var88;
                                            if (var18[-var20 & 0x3] && var44[0] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 1;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 1;
                                                class711.field10297[4] = var45[var51];
                                                class711.field10297[5] = var46[var51];
                                                var88 = 6;
                                            } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 5;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 5;
                                                class711.field10297[4] = var45[var51];
                                                class711.field10297[5] = var46[var51];
                                                var88 = 6;
                                            } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 3;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 3;
                                                class711.field10297[4] = var45[var51];
                                                var88 = 6;
                                                class711.field10297[5] = var46[var51];
                                            } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = 7;
                                                class711.field10297[2] = var46[var51];
                                                class711.field10297[3] = 7;
                                                class711.field10297[4] = var45[var51];
                                                class711.field10297[5] = var46[var51];
                                                var88 = 6;
                                            } else {
                                                class711.field10297[0] = var48[var51];
                                                class711.field10297[1] = var45[var51];
                                                var88 = 3;
                                                class711.field10297[2] = var46[var51];
                                            }
                                            var51++;
                                            for (int var89 = 0; var89 < var88; var89++) {
                                                int var90 = class711.field10297[var89];
                                                int var91 = var90 - (var20 * 2) & 0x7;
                                                int var92 = this.field10719[var90];
                                                int var93 = this.field10735[var90];
                                                int var94;
                                                int var95;
                                                if (var20 == 1) {
                                                    var94 = 512 - var92;
                                                    var95 = var93;
                                                } else if (var20 == 2) {
                                                    var95 = 512 - var92;
                                                    var94 = 512 - var93;
                                                } else if (var20 == 3) {
                                                    var95 = 512 - var93;
                                                    var94 = var92;
                                                } else {
                                                    var94 = var93;
                                                    var95 = var92;
                                                }
                                                var55[var52] = var95;
                                                var56[var52] = var94;
                                                if (var60 != null && class513.field7590[var19][var90]) {
                                                    int var96 = (var12 << 9) + var95;
                                                    int var97 = (var14 << 9) + var94;
                                                    var60[var52] = arg1.method2497((byte) -100, var96, var97) - arg0.method2497((byte) -83, var96, var97);
                                                }
                                                if (var61 != null) {
                                                    if (arg1 != null && !class513.field7590[var19][var90]) {
                                                        int var100 = (var12 << 9) + var95;
                                                        int var101 = (var14 << 9) + var94;
                                                        var61[var52] = arg0.method2497((byte) -97, var100, var101) - arg1.method2497((byte) -110, var100, var101);
                                                    } else if (arg2 != null && !class339.field5531[var19][var90]) {
                                                        int var98 = (var12 << 9) + var95;
                                                        int var99 = (var14 << 9) + var94;
                                                        var61[var52] = arg2.method2497((byte) -120, var98, var99) - arg0.method2497((byte) -117, var98, var99);
                                                    }
                                                }
                                                if (var90 < 8 && class407.field6441[var91] >= 0) {
                                                    if (var54 != null) {
                                                        var54[var52] = class201.field3180[var91];
                                                    }
                                                    var59[var52] = class173.field2764[var91];
                                                    var58[var52] = class620.field8961[var91];
                                                    var57[var52] = class776.field11333[var91];
                                                } else {
                                                    if (var17 && class513.field7590[var19][var90]) {
                                                        var58[var52] = var63;
                                                        var59[var52] = var64;
                                                        var57[var52] = var62;
                                                    } else if (var95 == 0 && var94 == 0) {
                                                        var57[var52] = arg5[var12][var14];
                                                        var58[var52] = var82.field6941;
                                                        var59[var52] = var82.field6943;
                                                    } else if (var95 == 0 && var94 == 512) {
                                                        var57[var52] = arg5[var12][var15];
                                                        var58[var52] = var83.field6941;
                                                        var59[var52] = var83.field6943;
                                                    } else if (var95 == 512 && var94 == 512) {
                                                        var57[var52] = arg5[var13][var15];
                                                        var58[var52] = var84.field6941;
                                                        var59[var52] = var84.field6943;
                                                    } else if (var95 == 512 && var94 == 0) {
                                                        var57[var52] = arg5[var13][var14];
                                                        var58[var52] = var85.field6941;
                                                        var59[var52] = var85.field6943;
                                                    } else {
                                                        if (var95 < 256) {
                                                            if (var94 >= 256) {
                                                                var58[var52] = var83.field6941;
                                                                var59[var52] = var83.field6943;
                                                            } else {
                                                                var58[var52] = var82.field6941;
                                                                var59[var52] = var82.field6943;
                                                            }
                                                        } else if (var94 < 256) {
                                                            var58[var52] = var85.field6941;
                                                            var59[var52] = var85.field6943;
                                                        } else {
                                                            var58[var52] = var84.field6941;
                                                            var59[var52] = var84.field6943;
                                                        }
                                                        int var102 = class143.method1328(arg5[var12][var14], arg5[var13][var14], (byte) 24, var95 << 7 >> 9);
                                                        int var103 = class143.method1328(arg5[var12][var15], arg5[var13][var15], (byte) 24, var95 << 7 >> 9);
                                                        var57[var52] = class143.method1328(var102, var103, (byte) 24, var94 << 7 >> 9);
                                                    }
                                                    if (var54 != null) {
                                                        var54[var52] = var57[var52];
                                                    }
                                                }
                                                var52++;
                                            }
                                        }
                                        if (var19 != 0 && var27.field6946) {
                                            var16 = true;
                                        }
                                    }
                                    int var104 = arg0.method2495(var14, arg6 ^ 0x3E, var12);
                                    int var105 = arg0.method2495(var14, 1, var13);
                                    int var106 = arg0.method2495(var15, 1, var13);
                                    int var107 = arg0.method2495(var15, 1, var12);
                                    boolean var108 = class541.method4028(var14, var12, (byte) 113);
                                    if (var108 && arg4 > 1 || !var108 && arg4 > 0) {
                                        boolean var109 = true;
                                        if (var27 != null && !var27.field6945) {
                                            var109 = false;
                                        } else if (var22 == 0 && var19 != 0) {
                                            var109 = false;
                                        } else if (var21 > 0 && var28 != null && !var28.field7147) {
                                            var109 = false;
                                        }
                                        if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                            this.field10745[arg4][var12][var14] = (byte) class553.method4099(this.field10745[arg4][var12][var14], 4);
                                        }
                                    }
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    if (this.field10721) {
                                        var110 = class647.method4707(var12, var14);
                                        var111 = class260.method2189(var12, var14);
                                        var112 = class243.method2098(var12, var14);
                                    }
                                    arg0.method705(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                                    class483.method3683(arg4, var12, var14);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var114) {
            throw class590.method4333(var114, field10748[15] + (arg0 == null ? field10748[0] : field10748[2]) + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + (arg2 == null ? field10748[0] : field10748[2]) + ',' + (arg3 == null ? field10748[0] : field10748[2]) + ',' + arg4 + ',' + (arg5 == null ? field10748[0] : field10748[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ls;Ls;Lha;I)V")
    public final void method5311(class293 arg0, class293 arg1, class63 arg2, int arg3) {
        try {
            field10728++;
            int[][] var5 = new int[this.field10725][this.field10727];
            if (class664.field9455 == null || class664.field9455.length != this.field10727) {
                class664.field9455 = new int[this.field10727];
                class606.field8728 = new int[this.field10727];
                class717.field10445 = new int[this.field10727];
                class536.field7878 = new int[this.field10727];
                class132.field1880 = new int[this.field10727];
            }
            for (int var6 = arg3; var6 < this.field10717; var6++) {
                for (int var7 = 0; var7 < this.field10727; var7++) {
                    class664.field9455[var7] = 0;
                    class536.field7878[var7] = 0;
                    class606.field8728[var7] = 0;
                    class717.field10445[var7] = 0;
                    class132.field1880[var7] = 0;
                }
                for (int var8 = -5; var8 < this.field10725; var8++) {
                    for (int var9 = 0; var9 < this.field10727; var9++) {
                        int var10 = var8 + 5;
                        int var10002;
                        if (var10 < this.field10725) {
                            int var11 = this.field10743[var6][var10][var9] & 0xFF;
                            if (var11 > 0) {
                                class447 var12 = this.field10744.method5246((byte) 104, var11 - 1);
                                class664.field9455[var9] += var12.field6947;
                                class536.field7878[var9] += var12.field6939;
                                class606.field8728[var9] += var12.field6949;
                                class717.field10445[var9] += var12.field6936;
                                var10002 = class132.field1880[var9]++;
                            }
                        }
                        int var13 = var8 - 5;
                        if (var13 >= 0) {
                            int var14 = this.field10743[var6][var13][var9] & 0xFF;
                            if (var14 > 0) {
                                class447 var15 = this.field10744.method5246((byte) 124, var14 - 1);
                                class664.field9455[var9] -= var15.field6947;
                                class536.field7878[var9] -= var15.field6939;
                                class606.field8728[var9] -= var15.field6949;
                                class717.field10445[var9] -= var15.field6936;
                                var10002 = class132.field1880[var9]--;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        int var16 = 0;
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        int var20 = 0;
                        for (int var21 = -5; var21 < this.field10727; var21++) {
                            int var22 = var21 + 5;
                            if (this.field10727 > var22) {
                                var18 += class606.field8728[var22];
                                var20 += class132.field1880[var22];
                                var19 += class717.field10445[var22];
                                var16 += class664.field9455[var22];
                                var17 += class536.field7878[var22];
                            }
                            int var23 = var21 - 5;
                            if (var23 >= 0) {
                                var16 -= class664.field9455[var23];
                                var18 -= class606.field8728[var23];
                                var19 -= class717.field10445[var23];
                                var20 -= class132.field1880[var23];
                                var17 -= class536.field7878[var23];
                            }
                            if (var21 >= 0 && var19 > 0 && var20 > 0) {
                                var5[var8][var21] = class559.method4119(var16 * 256 / var19, var17 / var20, 1, var18 / var20);
                            }
                        }
                    }
                }
                if (class265.field4288) {
                    this.method5310(class740.field10902[var6], var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null, arg2, var6, var5, (byte) 63);
                } else {
                    this.method5314(var6, arg2, 262, var6 == 0 ? arg0 : null, var6 == 0 ? arg1 : null, class740.field10902[var6], var5);
                }
                this.field10743[var6] = null;
                this.field10722[var6] = null;
                this.field10730[var6] = null;
                this.field10737[var6] = null;
            }
            if (!this.field10721) {
                if (class460.field7083 != 0) {
                    class164.method1549();
                }
                if (class700.field10072) {
                    class29.method288();
                }
            }
            for (int var24 = 0; var24 < this.field10717; var24++) {
                class740.field10902[var24].method702();
            }
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field10748[12] + (arg0 == null ? field10748[0] : field10748[2]) + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + (arg2 == null ? field10748[0] : field10748[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIII)V")
    public final void method5312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10746++;
            int var6 = 0;
            if (arg4 != 3) {
                this.method5316(-106, null, (byte) -83);
            }
            while (this.field10717 > var6) {
                this.method5309(arg1, arg3, var6, arg2, (byte) 59, arg0);
                var6++;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10748[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[BBII)Z")
    public static final boolean method5313(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5, int arg6) {
        try {
            field10740++;
            int var7 = arg2 % arg6;
            int var8;
            if (var7 == 0) {
                var8 = 0;
            } else {
                var8 = arg6 - var7;
            }
            int var9 = -((arg5 + arg6 - 1) / arg6);
            int var10 = -((arg2 + arg6 - 1) / arg6);
            int var11 = var9;
            if (arg4 <= 38) {
                method5313(96, 4, -41, null, (byte) -73, -20, -66);
            }
            while (var11 < 0) {
                for (int var12 = var10; var12 < 0; var12++) {
                    if (arg3[arg1] == 0) {
                        return true;
                    }
                    arg1 += arg6;
                }
                arg1 -= var8;
                if (arg3[arg1 - 1] == 0) {
                    return true;
                }
                arg1 += arg0;
                var11++;
            }
            return false;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field10748[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10748[0] : field10748[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILha;ILs;Ls;Ls;[[I)V")
    private final void method5314(int arg0, class63 arg1, int arg2, class293 arg3, class293 arg4, class293 arg5, int[][] arg6) {
        try {
            field10732++;
            if (arg2 != 262) {
                this.field10735 = null;
            }
            for (int var8 = 0; var8 < this.field10725; var8++) {
                for (int var9 = 0; var9 < this.field10727; var9++) {
                    if (class40.field463 == -1 || class223.method1962(arg0, 18, class40.field463, var9, var8)) {
                        byte var10 = this.field10730[arg0][var8][var9];
                        byte var11 = this.field10737[arg0][var8][var9];
                        int var12 = this.field10722[arg0][var8][var9] & 0xFF;
                        int var13 = this.field10743[arg0][var8][var9] & 0xFF;
                        class466 var14 = var12 == 0 ? null : this.field10734.method865(var12 - 1, true);
                        if (var10 == 0 && var14 == null) {
                            var10 = 12;
                        }
                        class447 var15 = var13 == 0 ? null : this.field10744.method5246((byte) 101, var13 - 1);
                        class466 var16 = var14;
                        if (var14 != null && var14.field7143 == -1 && var14.field7161 == -1) {
                            var16 = var14;
                            var14 = null;
                        }
                        if (var14 != null || var15 != null) {
                            int var17 = class119.field1727[var10];
                            int var18 = class108.field1548[var10];
                            int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                            int var20 = 0;
                            int var21 = 0;
                            int var22 = var14 == null ? -1 : var14.field7160;
                            int var23 = var15 == null ? -1 : var15.field6941;
                            int[] var24 = new int[var19];
                            int[] var25 = new int[var19];
                            int[] var26 = new int[var19];
                            int[] var27 = new int[var19];
                            int[] var28 = new int[var19];
                            int[] var29 = new int[var19];
                            int[] var30 = var14 == null || var14.field7161 == -1 ? null : new int[var19];
                            if (var14 == null) {
                                var21 += var18;
                            } else {
                                for (int var31 = 0; var31 < var18; var31++) {
                                    var24[var20] = class91.field1346[var10][var21];
                                    var25[var20] = class396.field6284[var10][var21];
                                    var26[var20] = class25.field276[var10][var21];
                                    var28[var20] = var22;
                                    var29[var20] = var14.field7163;
                                    var27[var20] = var14.field7143;
                                    if (var30 != null) {
                                        var30[var20] = var14.field7161;
                                    }
                                    var20++;
                                    var21++;
                                }
                                if (!this.field10721 && arg0 == 0) {
                                    class764.method5512(var8, var9, var14.field7162, var14.field7149 * 8, var14.field7157);
                                }
                            }
                            if (var15 != null) {
                                for (int var32 = 0; var32 < var17; var32++) {
                                    var24[var20] = class91.field1346[var10][var21];
                                    var25[var20] = class396.field6284[var10][var21];
                                    var26[var20] = class25.field276[var10][var21];
                                    var28[var20] = var23;
                                    var29[var20] = var15.field6943;
                                    var27[var20] = arg6[var8][var9];
                                    if (var30 != null) {
                                        var30[var20] = var27[var20];
                                    }
                                    var21++;
                                    var20++;
                                }
                            }
                            int var33 = this.field10719.length;
                            int[] var34 = new int[var33];
                            int[] var35 = new int[var33];
                            int[] var36 = arg3 == null ? null : new int[var33];
                            int[] var37 = arg3 == null && arg4 == null ? null : new int[var33];
                            for (int var38 = 0; var38 < var33; var38++) {
                                int var39 = this.field10719[var38];
                                int var40 = this.field10735[var38];
                                if (var11 == 0) {
                                    var34[var38] = var39;
                                    var35[var38] = var40;
                                } else if (var11 == 1) {
                                    var34[var38] = var40;
                                    var35[var38] = 512 - var39;
                                } else if (var11 == 2) {
                                    var34[var38] = 512 - var39;
                                    var35[var38] = 512 - var40;
                                } else if (var11 == 3) {
                                    var34[var38] = 512 - var40;
                                    var35[var38] = var39;
                                }
                                if (var36 != null && class513.field7590[var10][var38]) {
                                    int var43 = (var8 << 9) + var34[var38];
                                    int var44 = (var9 << 9) + var35[var38];
                                    var36[var38] = arg3.method2497((byte) -88, var43, var44) - arg5.method2497((byte) -84, var43, var44);
                                }
                                if (var37 != null) {
                                    if (arg3 != null && !class513.field7590[var10][var38]) {
                                        int var45 = (var8 << 9) + var34[var38];
                                        int var46 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg5.method2497((byte) -124, var45, var46) - arg3.method2497((byte) -87, var45, var46);
                                    } else if (arg4 != null && !class339.field5531[var10][var38]) {
                                        int var47 = (var8 << 9) + var34[var38];
                                        int var48 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg4.method2497((byte) -89, var47, var48) - arg5.method2497((byte) -100, var47, var48);
                                    }
                                }
                            }
                            int var49 = arg5.method2495(var9, 1, var8);
                            int var50 = arg5.method2495(var9, 1, var8 + 1);
                            int var51 = arg5.method2495(var9 + 1, arg2 ^ 0x107, var8 + 1);
                            int var52 = arg5.method2495(var9 + 1, 1, var8);
                            boolean var53 = class541.method4028(var9, var8, (byte) 113);
                            if (var53 && arg0 > 1 || !var53 && arg0 > 0) {
                                boolean var54 = true;
                                if (var15 != null && !var15.field6945) {
                                    var54 = false;
                                } else if (var13 == 0 && var10 != 0) {
                                    var54 = false;
                                } else if (var12 > 0 && var16 != null && !var16.field7147) {
                                    var54 = false;
                                }
                                if (var54 && var49 == var50 && var49 == var51 && var49 == var52) {
                                    this.field10745[arg0][var8][var9] = (byte) class553.method4099(this.field10745[arg0][var8][var9], 4);
                                }
                            }
                            int var55 = 0;
                            int var56 = 0;
                            int var57 = 0;
                            if (this.field10721) {
                                var55 = class647.method4707(var8, var9);
                                var56 = class260.method2189(var8, var9);
                                var57 = class243.method2098(var8, var9);
                            }
                            arg5.method715(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var55, var56, var57, false);
                            class483.method3683(arg0, var8, var9);
                        }
                    }
                }
            }
        } catch (RuntimeException var59) {
            throw class590.method4333(var59, field10748[14] + arg0 + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + arg2 + ',' + (arg3 == null ? field10748[0] : field10748[2]) + ',' + (arg4 == null ? field10748[0] : field10748[2]) + ',' + (arg5 == null ? field10748[0] : field10748[2]) + ',' + (arg6 == null ? field10748[0] : field10748[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILwq;IIIZI[Lii;)V")
    public final void method5315(int arg0, int arg1, int arg2, class176 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class580[] arg9) {
        try {
            field10724++;
            int var11 = (arg6 & 0x7) * 8;
            if (!this.field10721) {
                class580 var12 = arg9[arg8];
                for (int var13 = 0; var13 < 8; var13++) {
                    for (int var14 = 0; var14 < 8; var14++) {
                        int var15 = arg4 + class595.method4356(var13 & 0x7, arg1, var14 & 0x7, 1);
                        int var16 = arg0 + class767.method5530(arg1, var13 & 0x7, var14 & 0x7, 68);
                        if (var15 > 0 && var15 < this.field10725 - 1 && var16 > 0 && var16 < this.field10727 - 1) {
                            var12.method4261(var16, var15, 13575);
                        }
                    }
                }
            }
            int var17 = (arg2 & 0x7) * 8;
            int var18 = (arg6 & 0xFFFFFFF8) << 3;
            int var19 = arg2 & 0x1FFFFFF8 << 3;
            byte var20 = 0;
            byte var21 = 0;
            if (arg1 == 1) {
                var21 = 1;
            } else if (arg1 == 2) {
                var21 = 1;
                var20 = 1;
            } else if (arg1 == 3) {
                var20 = 1;
            }
            for (int var22 = 0; var22 < this.field10717; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    for (int var24 = 0; var24 < 64; var24++) {
                        if (arg5 == var22 && var11 <= var23 && var23 <= var11 + 8 && var24 >= var17 && var24 <= (var17 + 8)) {
                            int var25;
                            int var26;
                            if (var11 + 8 == var23 || var17 + 8 == var24) {
                                if (arg1 == 0) {
                                    var25 = arg0 + var24 - var17;
                                    var26 = arg4 + var23 - var11;
                                } else if (arg1 == 1) {
                                    var26 = arg4 - (var17 - var24);
                                    var25 = arg0 + 8 - (-var11 + var23);
                                } else if (arg1 == 2) {
                                    var26 = var11 + arg4 + 8 - var23;
                                    var25 = arg0 + var17 + 8 - var24;
                                } else {
                                    var25 = arg0 + var23 - var11;
                                    var26 = var17 + arg4 + 8 - var24;
                                }
                                this.method5304(var26, var18 + var23, -2011856446, 0, 0, arg8, arg3, var25, 0, true, var19 + var24);
                            } else {
                                var26 = class595.method4356(var23 & 0x7, arg1, var24 & 0x7, 1) + arg4;
                                var25 = arg0 + class767.method5530(arg1, var23 & 0x7, var24 & 0x7, 119);
                                this.method5304(var26, var18 + var23, -2011856446, var20, arg1, arg8, arg3, var25, var21, false, var19 + var24);
                            }
                            if (var23 == 63 || var24 == 63) {
                                byte var27 = 1;
                                if (var23 == 63 && var24 == 63) {
                                    var27 = 3;
                                }
                                for (int var28 = 0; var28 < var27; var28++) {
                                    int var29 = var23;
                                    int var30 = var24;
                                    if (var28 == 0) {
                                        var30 = var24 == 63 ? 64 : var24;
                                        var29 = var23 == 63 ? 64 : var23;
                                    } else if (var28 == 1) {
                                        var29 = 64;
                                    } else if (var28 == 2) {
                                        var30 = 64;
                                    }
                                    int var31;
                                    int var32;
                                    if (arg1 == 0) {
                                        var31 = arg4 + var29 - var11;
                                        var32 = arg0 + var30 - var17;
                                    } else if (arg1 == 1) {
                                        var31 = var30 + arg4 - var17;
                                        var32 = arg0 - (var29 - var11 - 8);
                                    } else if (arg1 == 2) {
                                        var32 = arg0 + 8 - (var30 - var17);
                                        var31 = arg4 + var11 + 8 - var29;
                                    } else {
                                        var32 = var29 - (var11 - arg0);
                                        var31 = arg4 + var17 + 8 - var30;
                                    }
                                    if (var31 >= 0 && var31 < this.field10725 && var32 >= 0 && var32 < this.field10727) {
                                        this.field10741[arg8][var31][var32] = this.field10741[arg8][var20 + var26][var25 + var21];
                                    }
                                }
                            }
                        } else {
                            this.method5304(-1, 0, -2011856446, 0, 0, 0, arg3, -1, 0, false, 0);
                        }
                    }
                }
            }
            if (!arg7) {
                this.method5311(null, null, null, 81);
            }
        } catch (RuntimeException var34) {
            throw class590.method4333(var34, field10748[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10748[0] : field10748[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field10748[0] : field10748[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[[IB)V")
    public final void method5316(int arg0, int[][] arg1, byte arg2) {
        try {
            field10738++;
            int[][] var4 = this.field10741[arg0];
            int var5 = 0;
            if (arg2 == -21) {
                while ((this.field10725 + 1) > var5) {
                    for (int var6 = 0; var6 < (this.field10727 + 1); var6++) {
                        var4[var5][var6] += arg1[var5][var6];
                    }
                    var5++;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10748[7] + arg0 + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIZLgv;Lhg;)V")
    public class732(int arg0, int arg1, int arg2, boolean arg3, class87 arg4, class722 arg5) {
        try {
            this.field10744 = arg5;
            this.field10717 = arg0;
            this.field10721 = arg3;
            this.field10725 = arg1;
            this.field10734 = arg4;
            this.field10727 = arg2;
            this.field10745 = new byte[this.field10717][this.field10725 + 1][this.field10727 + 1];
            this.field10741 = new int[this.field10717][this.field10725 + 1][this.field10727 + 1];
            this.field10730 = new byte[this.field10717][this.field10725][this.field10727];
            this.field10737 = new byte[this.field10717][this.field10725][this.field10727];
            this.field10743 = new byte[this.field10717][this.field10725][this.field10727];
            this.field10722 = new byte[this.field10717][this.field10725][this.field10727];
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10748[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field10748[0] : field10748[2]) + ',' + (arg5 == null ? field10748[0] : field10748[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[[B[ZILun;IILha;Ljc;II[[BI[[B)V")
    private final void method5317(int arg0, byte[][] arg1, boolean[] arg2, int arg3, class447 arg4, int arg5, int arg6, class63 arg7, class466 arg8, int arg9, int arg10, byte[][] arg11, int arg12, byte[][] arg13) {
        try {
            field10747++;
            boolean[] var15 = arg8 != null && arg8.field7151 ? class484.field7345[arg9] : class29.field311[arg9];
            if (arg0 != 3) {
                method5313(-6, 101, -122, null, (byte) 2, 76, -108);
            }
            if (arg5 > 0) {
                if (arg12 > 0) {
                    int var16 = arg1[arg12 - 1][arg5 - 1] & 0xFF;
                    if (var16 > 0) {
                        class466 var17 = this.field10734.method865(var16 - 1, true);
                        if (var17.field7143 != -1 && var17.field7151) {
                            byte var18 = arg11[arg12 - 1][arg5 - 1];
                            int var19 = (arg13[arg12 - 1][arg5 - 1] * 2) + 4 & 0x7;
                            int var20 = class365.method3020(arg7, var17, -18754);
                            if (class513.field7590[var18][var19]) {
                                class776.field11333[0] = var17.field7143;
                                class201.field3180[0] = var20;
                                class620.field8961[0] = var17.field7160;
                                class173.field2764[0] = var17.field7163;
                                class407.field6441[0] = var17.field7145;
                                class788.field11521[0] = 256;
                            }
                        }
                    }
                }
                if (arg12 < arg3 - 1) {
                    int var21 = arg1[arg12 + 1][arg5 - 1] & 0xFF;
                    if (var21 > 0) {
                        class466 var22 = this.field10734.method865(var21 - 1, true);
                        if (var22.field7143 != -1 && var22.field7151) {
                            byte var23 = arg11[arg12 + 1][arg5 - 1];
                            int var24 = arg13[arg12 + 1][arg5 - 1] * 2 + 6 & 0x7;
                            int var25 = class365.method3020(arg7, var22, -18754);
                            if (class513.field7590[var23][var24]) {
                                class776.field11333[2] = var22.field7143;
                                class201.field3180[2] = var25;
                                class620.field8961[2] = var22.field7160;
                                class173.field2764[2] = var22.field7163;
                                class407.field6441[2] = var22.field7145;
                                class788.field11521[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg6 - 1 > arg5) {
                if (arg12 > 0) {
                    int var26 = arg1[arg12 - 1][arg5 + 1] & 0xFF;
                    if (var26 > 0) {
                        class466 var27 = this.field10734.method865(var26 - 1, true);
                        if (var27.field7143 != -1 && var27.field7151) {
                            byte var28 = arg11[arg12 - 1][arg5 + 1];
                            int var29 = arg13[arg12 - 1][arg5 + 1] * 2 + 2 & 0x7;
                            int var30 = class365.method3020(arg7, var27, -18754);
                            if (class513.field7590[var28][var29]) {
                                class776.field11333[6] = var27.field7143;
                                class201.field3180[6] = var30;
                                class620.field8961[6] = var27.field7160;
                                class173.field2764[6] = var27.field7163;
                                class407.field6441[6] = var27.field7145;
                                class788.field11521[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 < arg3 - 1) {
                    int var31 = arg1[arg12 + 1][arg5 + 1] & 0xFF;
                    if (var31 > 0) {
                        class466 var32 = this.field10734.method865(var31 - 1, true);
                        if (var32.field7143 != -1 && var32.field7151) {
                            byte var33 = arg11[arg12 + 1][arg5 + 1];
                            int var34 = arg13[arg12 + 1][arg5 + 1] * 2 & 0x7;
                            int var35 = class365.method3020(arg7, var32, -18754);
                            if (class513.field7590[var33][var34]) {
                                class776.field11333[4] = var32.field7143;
                                class201.field3180[4] = var35;
                                class620.field8961[4] = var32.field7160;
                                class173.field2764[4] = var32.field7163;
                                class407.field6441[4] = var32.field7145;
                                class788.field11521[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg5 > 0) {
                int var36 = arg1[arg12][arg5 - 1] & 0xFF;
                if (var36 > 0) {
                    class466 var37 = this.field10734.method865(var36 - 1, true);
                    if (var37.field7143 != -1) {
                        byte var38 = arg11[arg12][arg5 - 1];
                        byte var39 = arg13[arg12][arg5 - 1];
                        if (var37.field7151) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class365.method3020(arg7, var37, -18754);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class513.field7590[var38][var41] && var37.field7145 >= class407.field6441[var40]) {
                                    class776.field11333[var40] = var37.field7143;
                                    class201.field3180[var40] = var42;
                                    class620.field8961[var40] = var37.field7160;
                                    class173.field2764[var40] = var37.field7163;
                                    if (class407.field6441[var40] == var37.field7145) {
                                        class788.field11521[var40] = class553.method4099(class788.field11521[var40], 32);
                                    } else {
                                        class788.field11521[var40] = 32;
                                    }
                                    class407.field6441[var40] = var37.field7145;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg10 & 0x3]) {
                                arg2[0] = class484.field7345[var38][class292.method2485(3, var39 + 2)];
                            }
                        } else if (!var15[arg10 & 0x3]) {
                            arg2[0] = class29.field311[var38][class292.method2485(var39 + 2, 3)];
                        }
                    }
                }
            }
            if (arg5 < (arg6 - 1)) {
                int var44 = arg1[arg12][arg5 + 1] & 0xFF;
                if (var44 > 0) {
                    class466 var45 = this.field10734.method865(var44 - 1, true);
                    if (var45.field7143 != -1) {
                        byte var46 = arg11[arg12][arg5 + 1];
                        byte var47 = arg13[arg12][arg5 + 1];
                        if (var45.field7151) {
                            int var48 = 4;
                            int var49 = (var47 * 2) + 2;
                            int var50 = class365.method3020(arg7, var45, -18754);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class513.field7590[var46][var49] && var45.field7145 >= class407.field6441[var48]) {
                                    class776.field11333[var48] = var45.field7143;
                                    class201.field3180[var48] = var50;
                                    class620.field8961[var48] = var45.field7160;
                                    class173.field2764[var48] = var45.field7163;
                                    if (class407.field6441[var48] == var45.field7145) {
                                        class788.field11521[var48] = class553.method4099(class788.field11521[var48], 16);
                                    } else {
                                        class788.field11521[var48] = 16;
                                    }
                                    class407.field6441[var48] = var45.field7145;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg10 + 2 & 0x3]) {
                                arg2[2] = class484.field7345[var46][class292.method2485(3, var47)];
                            }
                        } else if (!var15[arg10 + 2 & 0x3]) {
                            arg2[2] = class29.field311[var46][class292.method2485(3, var47)];
                        }
                    }
                }
            }
            if (arg12 > 0) {
                int var52 = arg1[arg12 - 1][arg5] & 0xFF;
                if (var52 > 0) {
                    class466 var53 = this.field10734.method865(var52 - 1, true);
                    if (var53.field7143 != -1) {
                        byte var54 = arg11[arg12 - 1][arg5];
                        byte var55 = arg13[arg12 - 1][arg5];
                        if (var53.field7151) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class365.method3020(arg7, var53, -18754);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class513.field7590[var54][var57] && var53.field7145 >= class407.field6441[var56]) {
                                    class776.field11333[var56] = var53.field7143;
                                    class201.field3180[var56] = var58;
                                    class620.field8961[var56] = var53.field7160;
                                    class173.field2764[var56] = var53.field7163;
                                    if (class407.field6441[var56] == var53.field7145) {
                                        class788.field11521[var56] = class553.method4099(class788.field11521[var56], 8);
                                    } else {
                                        class788.field11521[var56] = 8;
                                    }
                                    class407.field6441[var56] = var53.field7145;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg10 + 3 & 0x3]) {
                                arg2[3] = class484.field7345[var54][class292.method2485(3, var55 + 1)];
                            }
                        } else if (!var15[arg10 + 3 & 0x3]) {
                            arg2[3] = class29.field311[var54][class292.method2485(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg12 < (arg3 - 1)) {
                int var60 = arg1[arg12 + 1][arg5] & 0xFF;
                if (var60 > 0) {
                    class466 var61 = this.field10734.method865(var60 - 1, true);
                    if (var61.field7143 != -1) {
                        byte var62 = arg11[arg12 + 1][arg5];
                        byte var63 = arg13[arg12 + 1][arg5];
                        if (var61.field7151) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class365.method3020(arg7, var61, -18754);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class513.field7590[var62][var65] && class407.field6441[var64] <= var61.field7145) {
                                    class776.field11333[var64] = var61.field7143;
                                    class201.field3180[var64] = var66;
                                    class620.field8961[var64] = var61.field7160;
                                    class173.field2764[var64] = var61.field7163;
                                    if (class407.field6441[var64] == var61.field7145) {
                                        class788.field11521[var64] = class553.method4099(class788.field11521[var64], 4);
                                    } else {
                                        class788.field11521[var64] = 4;
                                    }
                                    class407.field6441[var64] = var61.field7145;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg10 + 1 & 0x3]) {
                                arg2[1] = class484.field7345[var62][class292.method2485(var63 + 3, 3)];
                            }
                        } else if (!var15[arg10 + 1 & 0x3]) {
                            arg2[1] = class29.field311[var62][class292.method2485(3, var63 + 3)];
                        }
                    }
                }
            }
            if (arg8 != null) {
                int var68 = class365.method3020(arg7, arg8, -18754);
                if (arg8.field7151) {
                    for (int var69 = 0; var69 < 8; var69++) {
                        int var70 = var69 - (arg10 * 2) & 0x7;
                        if (class513.field7590[arg9][var69] && arg8.field7145 >= class407.field6441[var70]) {
                            class776.field11333[var70] = arg8.field7143;
                            class201.field3180[var70] = var68;
                            class620.field8961[var70] = arg8.field7160;
                            class173.field2764[var70] = arg8.field7163;
                            if (class407.field6441[var70] == arg8.field7145) {
                                class788.field11521[var70] = class553.method4099(class788.field11521[var70], 2);
                            } else {
                                class788.field11521[var70] = 2;
                            }
                            class407.field6441[var70] = arg8.field7145;
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var72) {
            throw class590.method4333(var72, field10748[8] + arg0 + ',' + (arg1 == null ? field10748[0] : field10748[2]) + ',' + (arg2 == null ? field10748[0] : field10748[2]) + ',' + arg3 + ',' + (arg4 == null ? field10748[0] : field10748[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10748[0] : field10748[2]) + ',' + (arg8 == null ? field10748[0] : field10748[2]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 == null ? field10748[0] : field10748[2]) + ',' + arg12 + ',' + (arg13 == null ? field10748[0] : field10748[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5318(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5319(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
