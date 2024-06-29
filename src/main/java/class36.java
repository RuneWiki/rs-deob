import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class36 extends class23 {

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "[I")
    private int[] field631 = new int[257];

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "[I")
    public static int[] field618;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
    public static int[] field619;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "[[I")
    private int[][] field617;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "[[I")
    public static int[][] field622;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[[[B")
    public static byte[][][] field620;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[[[B")
    public static byte[][][] field623;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public static final void method237(int arg0, int arg1) {
        class166 var2 = class262.method1746(arg1 + -1911, arg0, 4);
        var2.method1098((byte) -96);
        ++field629;
        if (arg1 != 2020) {
            field623 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            field621 = 7;
        }
        ++field632;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[] var4 = this.method155(arg0, (byte) 108, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class72.field1359; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field631[var9];
                var5[var8] = class129.method777(16711680, var10) >> 12;
                var7[var8] = class129.method777(4080, var10 >> 4);
                var6[var8] = class129.method777(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(II)V")
    private final void method238(int arg0, int arg1) {
        ++field633;
        if (arg1 == 3) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field617 = new int[4][4];
                                        this.field617[0][3] = 0;
                                        this.field617[0][2] = 4096;
                                        this.field617[0][1] = 0;
                                        this.field617[1][3] = 0;
                                        this.field617[1][2] = 4096;
                                        this.field617[1][1] = 4096;
                                        this.field617[2][3] = 0;
                                        this.field617[0][0] = 2048;
                                        this.field617[2][2] = 4096;
                                        this.field617[3][2] = 0;
                                        this.field617[3][3] = 0;
                                        this.field617[2][1] = 4096;
                                        this.field617[3][1] = 4096;
                                        this.field617[1][0] = 2867;
                                        this.field617[2][0] = 3276;
                                        this.field617[3][0] = 4096;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field617 = new int[16][4];
                                    this.field617[0][1] = 80;
                                    this.field617[0][3] = 321;
                                    this.field617[0][2] = 192;
                                    this.field617[1][2] = 449;
                                    this.field617[0][0] = 0;
                                    this.field617[2][2] = 690;
                                    this.field617[1][3] = 562;
                                    this.field617[1][0] = 155;
                                    this.field617[2][3] = 803;
                                    this.field617[3][2] = 995;
                                    this.field617[4][2] = 1397;
                                    this.field617[3][3] = 1140;
                                    this.field617[5][2] = 1429;
                                    this.field617[2][0] = 389;
                                    this.field617[1][1] = 321;
                                    this.field617[4][3] = 1509;
                                    this.field617[3][0] = 671;
                                    this.field617[4][0] = 897;
                                    this.field617[5][3] = 1413;
                                    this.field617[5][0] = 1175;
                                    this.field617[6][0] = 1368;
                                    this.field617[2][1] = 578;
                                    this.field617[6][3] = 1333;
                                    this.field617[6][2] = 1461;
                                    this.field617[7][2] = 1525;
                                    this.field617[8][2] = 1590;
                                    this.field617[7][0] = 1507;
                                    this.field617[9][2] = 2056;
                                    this.field617[8][0] = 1736;
                                    this.field617[9][0] = 2088;
                                    this.field617[10][2] = 2586;
                                    this.field617[7][3] = 1702;
                                    this.field617[11][2] = 3148;
                                    this.field617[8][3] = 2056;
                                    this.field617[12][2] = 3710;
                                    this.field617[10][0] = 2355;
                                    this.field617[3][1] = 947;
                                    this.field617[13][2] = 3421;
                                    this.field617[9][3] = 2666;
                                    this.field617[10][3] = 3276;
                                    this.field617[4][1] = 1285;
                                    this.field617[5][1] = 1525;
                                    this.field617[14][2] = 3148;
                                    this.field617[15][2] = 2505;
                                    this.field617[11][0] = 2691;
                                    this.field617[12][0] = 3031;
                                    this.field617[6][1] = 1734;
                                    this.field617[11][3] = 3228;
                                    this.field617[7][1] = 1413;
                                    this.field617[12][3] = 3196;
                                    this.field617[13][0] = 3522;
                                    this.field617[13][3] = 3019;
                                    this.field617[14][3] = 3228;
                                    this.field617[8][1] = 1108;
                                    this.field617[14][0] = 3727;
                                    this.field617[15][3] = 2746;
                                    this.field617[15][0] = 4096;
                                    this.field617[9][1] = 1766;
                                    this.field617[10][1] = 2409;
                                    this.field617[11][1] = 3116;
                                    this.field617[12][1] = 3806;
                                    this.field617[13][1] = 3437;
                                    this.field617[14][1] = 3116;
                                    this.field617[15][1] = 2377;
                                }
                            } else {
                                this.field617 = new int[6][4];
                                this.field617[0][3] = 0;
                                this.field617[0][2] = 0;
                                this.field617[0][0] = 0;
                                this.field617[1][3] = 1493;
                                this.field617[2][3] = 2939;
                                this.field617[3][3] = 3565;
                                this.field617[0][1] = 0;
                                this.field617[4][3] = 4031;
                                this.field617[1][1] = 0;
                                this.field617[2][1] = 0;
                                this.field617[3][1] = 0;
                                this.field617[1][2] = 0;
                                this.field617[5][3] = 4096;
                                this.field617[4][1] = 546;
                                this.field617[1][0] = 1843;
                                this.field617[5][1] = 4096;
                                this.field617[2][0] = 2457;
                                this.field617[3][0] = 2781;
                                this.field617[2][2] = 0;
                                this.field617[4][0] = 3481;
                                this.field617[5][0] = 4096;
                                this.field617[3][2] = 1124;
                                this.field617[4][2] = 3084;
                                this.field617[5][2] = 4096;
                            }
                        } else {
                            this.field617 = new int[7][4];
                            this.field617[0][0] = 0;
                            this.field617[1][0] = 663;
                            this.field617[0][2] = 0;
                            this.field617[0][1] = 0;
                            this.field617[0][3] = 4096;
                            this.field617[1][1] = 0;
                            this.field617[1][3] = 4096;
                            this.field617[2][1] = 0;
                            this.field617[3][1] = 4096;
                            this.field617[2][3] = 0;
                            this.field617[3][3] = 0;
                            this.field617[4][1] = 4096;
                            this.field617[4][3] = 0;
                            this.field617[5][3] = 4096;
                            this.field617[6][3] = 4096;
                            this.field617[1][2] = 4096;
                            this.field617[5][1] = 4096;
                            this.field617[2][0] = 1363;
                            this.field617[6][1] = 0;
                            this.field617[3][0] = 2048;
                            this.field617[4][0] = 2727;
                            this.field617[2][2] = 4096;
                            this.field617[3][2] = 4096;
                            this.field617[5][0] = 3411;
                            this.field617[6][0] = 4096;
                            this.field617[4][2] = 0;
                            this.field617[5][2] = 0;
                            this.field617[6][2] = 0;
                        }
                    } else {
                        this.field617 = new int[8][4];
                        this.field617[0][2] = 2602;
                        this.field617[0][0] = 0;
                        this.field617[1][0] = 2867;
                        this.field617[0][1] = 2650;
                        this.field617[0][3] = 2361;
                        this.field617[1][1] = 2313;
                        this.field617[2][1] = 2618;
                        this.field617[3][1] = 2296;
                        this.field617[1][3] = 1558;
                        this.field617[2][3] = 1413;
                        this.field617[2][0] = 3072;
                        this.field617[1][2] = 1799;
                        this.field617[3][0] = 3276;
                        this.field617[3][3] = 947;
                        this.field617[4][3] = 722;
                        this.field617[4][1] = 2072;
                        this.field617[5][3] = 1766;
                        this.field617[4][0] = 3481;
                        this.field617[2][2] = 1734;
                        this.field617[3][2] = 1220;
                        this.field617[5][0] = 3686;
                        this.field617[6][0] = 3891;
                        this.field617[4][2] = 963;
                        this.field617[5][1] = 2730;
                        this.field617[5][2] = 2152;
                        this.field617[6][3] = 915;
                        this.field617[6][1] = 2232;
                        this.field617[7][3] = 1140;
                        this.field617[7][1] = 1686;
                        this.field617[7][0] = 4096;
                        this.field617[6][2] = 1060;
                        this.field617[7][2] = 1413;
                    }
                } else {
                    this.field617 = new int[2][4];
                    this.field617[0][0] = 0;
                    this.field617[0][2] = 0;
                    this.field617[1][2] = 4096;
                    this.field617[0][3] = 0;
                    this.field617[1][3] = 4096;
                    this.field617[1][0] = 4096;
                    this.field617[0][1] = 0;
                    this.field617[1][1] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    private final void method239(int arg0) {
        if (arg0 != -18291) {
            field619 = null;
        }
        ++field625;
        int var2 = this.field617.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field617[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 <= var4) {
                    int[] var7 = this.field617[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field617[var4];
                    if (var4 <= 0) {
                        var10 = var11[1];
                        var9 = var11[2];
                        var8 = var11[3];
                    } else {
                        int[] var12 = this.field617[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field631[var3] = class119.method729(var15, class119.method729(var17 << 16, var16 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[Llf;IZIIII)V")
    public static final void method240(byte[] arg0, class106[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg3) {
            for (int var9 = 0; ~var9 > -5; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        if (~(arg5 + var10) < -1 && ~(arg5 + var10) > -104 && arg7 - -var11 > 0 && ~(arg7 + var11) > -104) {
                            arg1[var9].field1868[arg5 - -var10][arg7 + var11] = class129.method777(arg1[var9].field1868[arg5 - -var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class190 var12 = new class190(arg0);
        ++field627;
        for (int var13 = 0; var13 < var8; ++var13) {
            for (int var36 = 0; var36 < 64; ++var36) {
                for (int var37 = 0; ~var37 > -65; ++var37) {
                    class263.method1750(arg5 + var36, var13, arg2, var37 - -arg7, 0, arg4, arg3, var12, true);
                }
            }
        }
        boolean var14 = false;
        while (var12.field3465.length > var12.field3487) {
            int var15 = var12.method1265(115);
            if (~var15 != -130) {
                --var12.field3487;
                break;
            }
            for (int var16 = 0; ~var16 > -5; ++var16) {
                byte var17 = var12.method1234(false);
                if (~var17 == -1) {
                    int var18 = arg5 + 64;
                    int var19 = arg7;
                    int var20 = arg5;
                    if (var18 >= 0) {
                        if (var18 >= 104) {
                            var18 = 104;
                        }
                    } else {
                        var18 = 0;
                    }
                    if (arg7 >= 0) {
                        if (arg7 >= 104) {
                            var19 = 104;
                        }
                    } else {
                        var19 = 0;
                    }
                    if (~arg5 > -1) {
                        var20 = 0;
                    } else if (arg5 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg7 + 64;
                    if (~var21 > -1) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    while (~var20 > ~var18) {
                        while (~var21 < ~var19) {
                            class76.field1406[var16][var20][var19] = 0;
                            ++var19;
                        }
                        ++var20;
                    }
                } else if (~var17 == -2) {
                    for (int var22 = 0; ~var22 > -65; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method1234(false);
                            for (int var25 = arg5 + var22; ~(var22 - -arg5 + 4) < ~var25; ++var25) {
                                for (int var26 = arg7 + var23; arg7 + 4 + var23 > var26; ++var26) {
                                    if (~var25 <= -1 && var25 < 104 && ~var26 <= -1 && ~var26 > -105) {
                                        class76.field1406[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && ~var16 < -1) {
                    int var27 = arg5 - -64;
                    if (~var27 <= -1) {
                        if (~var27 <= -105) {
                            var27 = 104;
                        }
                    } else {
                        var27 = 0;
                    }
                    int var28 = arg7;
                    int var29 = arg5;
                    if (~arg5 > -1) {
                        var29 = 0;
                    } else if (arg5 >= 104) {
                        var29 = 104;
                    }
                    if (~arg7 <= -1) {
                        if (arg7 >= 104) {
                            var28 = 104;
                        }
                    } else {
                        var28 = 0;
                    }
                    int var30 = arg7 - -64;
                    if (var30 >= 0) {
                        if (~var30 <= -105) {
                            var30 = 104;
                        }
                    } else {
                        var30 = 0;
                    }
                    while (var29 < var27) {
                        while (~var28 > ~var30) {
                            class76.field1406[var16][var29][var28] = class76.field1406[var16 + -1][var29][var28];
                            ++var28;
                        }
                        ++var29;
                    }
                }
            }
            var14 = true;
        }
        if (arg6 != 64) {
            method241(44);
        }
        if (!var14) {
            for (int var31 = 0; var31 < 4; ++var31) {
                for (int var32 = 0; var32 < 16; ++var32) {
                    for (int var33 = 0; var33 < 16; ++var33) {
                        int var34 = (arg5 >> 2) - -var32;
                        int var35 = (arg7 >> 2) + var33;
                        if (var34 >= 0 && var34 < 26 && ~var35 <= -1 && var35 < 26) {
                            class76.field1406[var31][var34][var35] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static void method241(int arg0) {
        field618 = null;
        field619 = null;
        if (arg0 >= -65) {
            field623 = null;
        }
        field623 = null;
        field620 = null;
        field622 = null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(II)V")
    public static final void method242(int arg0, int arg1) {
        ++field630;
        class166 var2 = class262.method1746(-89, arg0, 6);
        var2.method1098((byte) -122);
        if (arg1 != 3084) {
            field618 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field626;
        int var2 = -38 / ((22 - arg0) / 60);
        if (this.field617 == null) {
            this.method238(1, 3);
        }
        this.method239(-18291);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method1265(121);
            if (~var4 == -1) {
                this.field617 = new int[arg0.method1265(125)][4];
                for (int var5 = 0; ~this.field617.length < ~var5; ++var5) {
                    this.field617[var5][0] = arg0.method1275(128);
                    this.field617[var5][1] = arg0.method1265(124) << 4;
                    this.field617[var5][2] = arg0.method1265(119) << 4;
                    this.field617[var5][3] = arg0.method1265(126) << 4;
                }
            } else {
                this.method238(var4, 3);
            }
        }
        if (!arg2) {
            this.method238(6, -105);
        }
        ++field624;
    }
}
