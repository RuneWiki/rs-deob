import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class128 extends class200 {

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "[I")
    private int[] field2263 = new int[257];

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "Laj;")
    public static class47 field2257 = null;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Lid;")
    public static class149 field2251 = class60.method382("<col=00ff00>", (byte) 37);

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "Lid;")
    public static class149 field2267 = class60.method382("Lade Titelbild )2 ", (byte) 40);

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lal;")
    public static class230 field2254;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "[I")
    public static int[] field2250;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "[I")
    public static int[] field2259;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "[[I")
    private int[][] field2266;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (this.field2266 == null) {
            this.method895(2072, 1);
        }
        this.method893(25090);
        ++field2264;
        int var2 = -13 % ((-60 - arg0) / 62);
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field2251 = null;
        field2257 = null;
        field2254 = null;
        field2267 = null;
        field2250 = null;
        int var1 = 41 / ((57 - arg0) / 61);
        field2259 = null;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    private final void method893(int arg0) {
        ++field2255;
        if (arg0 == 25090) {
            int var2 = this.field2266.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5 = 0;
                    for (int var6 = 0; var6 < var2 && var4 >= this.field2266[var6][0]; ++var6) {
                        ++var5;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var5 > ~var2) {
                        int[] var7 = this.field2266[var5];
                        if (~var5 < -1) {
                            int[] var8 = this.field2266[var5 + -1];
                            int var9 = (var4 - var8[0] << 12) / (var7[0] - var8[0]);
                            int var10 = 4096 - var9;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                        } else {
                            var11 = var7[1];
                            var12 = var7[3];
                            var13 = var7[2];
                        }
                    } else {
                        int[] var14 = this.field2266[var2 + -1];
                        var13 = var14[2];
                        var11 = var14[1];
                        var12 = var14[3];
                    }
                    int var15 = var13 >> 4;
                    int var16 = var11 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    int var17 = var12 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    if (var17 >= 0) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field2263[var3] = class40.method238(class40.method238(var16 << 16, var15 << 8), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZIII[BI[Lke;)V")
    public static final void method894(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class108[] arg7) {
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg1) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; ~var10 > -65; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        if (~(arg4 - -var10) < -1 && arg4 - -var10 < 103 && ~(arg0 + var11) < -1 && ~(arg0 + var11) > -104) {
                            arg7[var9].field1856[arg4 + var10][arg0 - -var11] = class136.method953(arg7[var9].field1856[arg4 + var10][arg0 - -var11], -16777217);
                        }
                    }
                }
            }
        }
        ++field2262;
        class74 var12 = new class74(arg5);
        int var13 = 0;
        if (arg3 == 31375) {
            while (var8 > var13) {
                for (int var36 = 0; var36 < 64; ++var36) {
                    for (int var37 = 0; var37 < 64; ++var37) {
                        class110.method773(false, var12, arg0 + var37, 0, var13, var36 - -arg4, arg2, arg1, arg6);
                    }
                }
                ++var13;
            }
            boolean var14 = false;
            while (~var12.field1321.length < ~var12.field1340) {
                int var15 = var12.method489((byte) -82);
                if (~var15 != -130) {
                    --var12.field1340;
                    break;
                }
                var14 = true;
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    byte var22 = var12.method514((byte) 1);
                    if (~var22 != -1) {
                        if (~var22 == -2) {
                            for (int var23 = 0; ~var23 > -65; var23 += 4) {
                                for (int var24 = 0; ~var24 > -65; var24 += 4) {
                                    byte var25 = var12.method514((byte) 1);
                                    for (int var26 = arg4 + var23; ~var26 > ~(var23 + 4 + arg4); ++var26) {
                                        for (int var27 = arg0 + var24; ~var27 > ~(arg0 + 4 + var24); ++var27) {
                                            if (var26 >= 0 && ~var26 > -105 && var27 >= 0 && ~var27 > -105) {
                                                class60.field1080[var21][var26][var27] = var25;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (~var22 == -3 && ~var21 < -1) {
                            int var28 = arg4 - -64;
                            if (~var28 <= -1) {
                                if (~var28 <= -105) {
                                    var28 = 104;
                                }
                            } else {
                                var28 = 0;
                            }
                            int var29 = arg0;
                            int var30 = arg0 + 64;
                            if (var30 >= 0) {
                                if (~var30 <= -105) {
                                    var30 = 104;
                                }
                            } else {
                                var30 = 0;
                            }
                            int var31 = arg4;
                            if (~arg0 > -1) {
                                var29 = 0;
                            } else if (arg0 >= 104) {
                                var29 = 104;
                            }
                            if (arg4 < 0) {
                                var31 = 0;
                            } else if (arg4 >= 104) {
                                var31 = 104;
                            }
                            while (~var28 < ~var31) {
                                while (var29 < var30) {
                                    class60.field1080[var21][var31][var29] = class60.field1080[var21 - 1][var31][var29];
                                    ++var29;
                                }
                                ++var31;
                            }
                        }
                    } else {
                        int var32 = arg4 + 64;
                        int var33 = arg4;
                        if (~arg4 > -1) {
                            var33 = 0;
                        } else if (arg4 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg0 + 64;
                        if (~var34 <= -1) {
                            if (~var34 <= -105) {
                                var34 = 104;
                            }
                        } else {
                            var34 = 0;
                        }
                        if (~var32 <= -1) {
                            if (~var32 <= -105) {
                                var32 = 104;
                            }
                        } else {
                            var32 = 0;
                        }
                        int var35 = arg0;
                        if (~arg0 > -1) {
                            var35 = 0;
                        } else if (~arg0 <= -105) {
                            var35 = 104;
                        }
                        while (var33 < var32) {
                            while (var34 > var35) {
                                class60.field1080[var21][var33][var35] = 0;
                                ++var35;
                            }
                            ++var33;
                        }
                    }
                }
            }
            if (!var14) {
                for (int var16 = 0; ~var16 > -5; ++var16) {
                    for (int var17 = 0; var17 < 16; ++var17) {
                        for (int var18 = 0; ~var18 > -17; ++var18) {
                            int var19 = (arg0 >> 2) + var18;
                            int var20 = (arg4 >> 2) + var17;
                            if (~var20 <= -1 && ~var20 > -27 && var19 >= 0 && var19 < 26) {
                                class60.field1080[var16][var20][var19] = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field2253;
        if (~arg2 == -1) {
            int var4 = arg0.method489((byte) -26);
            if (~var4 != -1) {
                this.method895(2072, var4);
            } else {
                this.field2266 = new int[arg0.method489((byte) 110)][4];
                for (int var5 = 0; ~this.field2266.length < ~var5; ++var5) {
                    this.field2266[var5][0] = arg0.method485(-2386);
                    this.field2266[var5][1] = arg0.method489((byte) -84) << 4;
                    this.field2266[var5][2] = arg0.method489((byte) -49) << 4;
                    this.field2266[var5][3] = arg0.method489((byte) -119) << 4;
                }
            }
        }
        if (!arg1) {
            field2259 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)V")
    private final void method895(int arg0, int arg1) {
        ++field2260;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2266 = new int[4][4];
                                this.field2266[0][1] = 0;
                                this.field2266[0][2] = 4096;
                                this.field2266[1][1] = 4096;
                                this.field2266[2][1] = 4096;
                                this.field2266[0][0] = 2048;
                                this.field2266[1][2] = 4096;
                                this.field2266[3][1] = 4096;
                                this.field2266[0][3] = 0;
                                this.field2266[2][2] = 4096;
                                this.field2266[3][2] = 0;
                                this.field2266[1][0] = 2867;
                                this.field2266[1][3] = 0;
                                this.field2266[2][3] = 0;
                                this.field2266[3][3] = 0;
                                this.field2266[2][0] = 3276;
                                this.field2266[3][0] = 4096;
                            } else {
                                this.field2266 = new int[16][4];
                                this.field2266[0][3] = 321;
                                this.field2266[0][1] = 80;
                                this.field2266[0][2] = 192;
                                this.field2266[1][2] = 449;
                                this.field2266[0][0] = 0;
                                this.field2266[2][2] = 690;
                                this.field2266[1][0] = 155;
                                this.field2266[1][1] = 321;
                                this.field2266[2][1] = 578;
                                this.field2266[3][2] = 995;
                                this.field2266[1][3] = 562;
                                this.field2266[4][2] = 1397;
                                this.field2266[3][1] = 947;
                                this.field2266[2][3] = 803;
                                this.field2266[5][2] = 1429;
                                this.field2266[2][0] = 389;
                                this.field2266[3][0] = 671;
                                this.field2266[4][1] = 1285;
                                this.field2266[5][1] = 1525;
                                this.field2266[4][0] = 897;
                                this.field2266[5][0] = 1175;
                                this.field2266[3][3] = 1140;
                                this.field2266[6][1] = 1734;
                                this.field2266[6][0] = 1368;
                                this.field2266[7][1] = 1413;
                                this.field2266[4][3] = 1509;
                                this.field2266[6][2] = 1461;
                                this.field2266[8][1] = 1108;
                                this.field2266[9][1] = 1766;
                                this.field2266[10][1] = 2409;
                                this.field2266[5][3] = 1413;
                                this.field2266[7][0] = 1507;
                                this.field2266[8][0] = 1736;
                                this.field2266[9][0] = 2088;
                                this.field2266[11][1] = 3116;
                                this.field2266[10][0] = 2355;
                                this.field2266[11][0] = 2691;
                                this.field2266[6][3] = 1333;
                                this.field2266[12][1] = 3806;
                                this.field2266[12][0] = 3031;
                                this.field2266[7][2] = 1525;
                                this.field2266[7][3] = 1702;
                                this.field2266[8][3] = 2056;
                                this.field2266[13][1] = 3437;
                                this.field2266[14][1] = 3116;
                                this.field2266[9][3] = 2666;
                                this.field2266[8][2] = 1590;
                                this.field2266[15][1] = 2377;
                                this.field2266[10][3] = 3276;
                                this.field2266[13][0] = 3522;
                                this.field2266[11][3] = 3228;
                                this.field2266[9][2] = 2056;
                                this.field2266[10][2] = 2586;
                                this.field2266[14][0] = 3727;
                                this.field2266[11][2] = 3148;
                                this.field2266[15][0] = 4096;
                                this.field2266[12][3] = 3196;
                                this.field2266[12][2] = 3710;
                                this.field2266[13][2] = 3421;
                                this.field2266[14][2] = 3148;
                                this.field2266[13][3] = 3019;
                                this.field2266[14][3] = 3228;
                                this.field2266[15][3] = 2746;
                                this.field2266[15][2] = 2505;
                            }
                        } else {
                            this.field2266 = new int[6][4];
                            this.field2266[0][1] = 0;
                            this.field2266[0][2] = 0;
                            this.field2266[1][1] = 0;
                            this.field2266[0][0] = 0;
                            this.field2266[2][1] = 0;
                            this.field2266[0][3] = 0;
                            this.field2266[3][1] = 0;
                            this.field2266[4][1] = 546;
                            this.field2266[1][3] = 1493;
                            this.field2266[1][2] = 0;
                            this.field2266[1][0] = 1843;
                            this.field2266[2][0] = 2457;
                            this.field2266[2][2] = 0;
                            this.field2266[3][0] = 2781;
                            this.field2266[5][1] = 4096;
                            this.field2266[3][2] = 1124;
                            this.field2266[4][0] = 3481;
                            this.field2266[2][3] = 2939;
                            this.field2266[3][3] = 3565;
                            this.field2266[4][2] = 3084;
                            this.field2266[5][2] = 4096;
                            this.field2266[4][3] = 4031;
                            this.field2266[5][0] = 4096;
                            this.field2266[5][3] = 4096;
                        }
                    } else {
                        this.field2266 = new int[7][4];
                        this.field2266[0][2] = 0;
                        this.field2266[0][3] = 4096;
                        this.field2266[0][1] = 0;
                        this.field2266[1][2] = 4096;
                        this.field2266[0][0] = 0;
                        this.field2266[1][1] = 0;
                        this.field2266[2][2] = 4096;
                        this.field2266[2][1] = 0;
                        this.field2266[3][2] = 4096;
                        this.field2266[1][3] = 4096;
                        this.field2266[3][1] = 4096;
                        this.field2266[1][0] = 663;
                        this.field2266[2][3] = 0;
                        this.field2266[4][2] = 0;
                        this.field2266[2][0] = 1363;
                        this.field2266[4][1] = 4096;
                        this.field2266[5][1] = 4096;
                        this.field2266[3][3] = 0;
                        this.field2266[6][1] = 0;
                        this.field2266[5][2] = 0;
                        this.field2266[4][3] = 0;
                        this.field2266[5][3] = 4096;
                        this.field2266[6][3] = 4096;
                        this.field2266[3][0] = 2048;
                        this.field2266[4][0] = 2727;
                        this.field2266[5][0] = 3411;
                        this.field2266[6][0] = 4096;
                        this.field2266[6][2] = 0;
                    }
                } else {
                    this.field2266 = new int[8][4];
                    this.field2266[0][0] = 0;
                    this.field2266[0][2] = 2602;
                    this.field2266[0][3] = 2361;
                    this.field2266[1][3] = 1558;
                    this.field2266[0][1] = 2650;
                    this.field2266[2][3] = 1413;
                    this.field2266[3][3] = 947;
                    this.field2266[1][1] = 2313;
                    this.field2266[1][0] = 2867;
                    this.field2266[1][2] = 1799;
                    this.field2266[4][3] = 722;
                    this.field2266[2][2] = 1734;
                    this.field2266[2][0] = 3072;
                    this.field2266[3][2] = 1220;
                    this.field2266[5][3] = 1766;
                    this.field2266[2][1] = 2618;
                    this.field2266[6][3] = 915;
                    this.field2266[3][0] = 3276;
                    this.field2266[3][1] = 2296;
                    this.field2266[7][3] = 1140;
                    this.field2266[4][2] = 963;
                    this.field2266[5][2] = 2152;
                    this.field2266[4][1] = 2072;
                    this.field2266[5][1] = 2730;
                    this.field2266[4][0] = 3481;
                    this.field2266[6][1] = 2232;
                    this.field2266[7][1] = 1686;
                    this.field2266[6][2] = 1060;
                    this.field2266[5][0] = 3686;
                    this.field2266[6][0] = 3891;
                    this.field2266[7][0] = 4096;
                    this.field2266[7][2] = 1413;
                }
            } else {
                this.field2266 = new int[2][4];
                this.field2266[0][2] = 0;
                this.field2266[0][1] = 0;
                this.field2266[1][1] = 4096;
                this.field2266[0][3] = 0;
                this.field2266[1][2] = 4096;
                this.field2266[0][0] = 0;
                this.field2266[1][0] = 4096;
                this.field2266[1][3] = 4096;
            }
        }
        if (arg0 != 2072) {
            field2250 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILgd;)V")
    public static final void method896(int arg0, class74 arg1) {
        ++field2258;
        if (class172.field3169 != null) {
            try {
                class172.field3169.method1792(0L, -115);
                class172.field3169.method1794((byte) 50, arg1.field1340, arg1.field1321, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field1340 += arg0;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field3632.method965(arg1, 107);
            ++field2261;
            if (super.field3632.field2550) {
                int[] var4 = this.method1368(0, arg1, !arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class137.field2515; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field2263[var9];
                    var5[var8] = class136.method953(var10 >> 12, 4080);
                    var6[var8] = class136.method953(65280, var10) >> 4;
                    var7[var8] = class136.method953(var10, 255) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)V")
    public static final void method897(int arg0, int arg1) {
        ++field2252;
        if (arg1 != 7931) {
            method897(-105, -63);
        }
        class216 var2 = class139.method972(arg0, false, 1);
        var2.method1457(0);
    }
}
