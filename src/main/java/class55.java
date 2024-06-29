import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class55 extends class12 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field975 = -8 + (int) (17.0D * Math.random());

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field979 = 0;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Ltg;")
    public static class184 field974 = class135.method812("m", 3);

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Ltg;")
    public static class184 field985 = class135.method812(")1p", 3);

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "[I")
    public static int[] field984 = new int[100];

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "Z")
    public static boolean field970 = false;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lnd;")
    public static class127 field981 = new class127(64);

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "J")
    public static volatile long field988 = 0L;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Ltg;")
    public static class184 field987 = class135.method812("sl_arrows", 3);

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "[I")
    public static int[] field986;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "[[I")
    private int[][] field978;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLde;)V")
    public static final void method294(int arg0, byte arg1, class35 arg2) {
        if (arg2.field620 > class161.field2903) {
            class8.method44(arg2, -23370);
        } else if (class161.field2903 <= arg2.field632) {
            class191.method1223(128, arg2);
        } else {
            class159.method968((byte) -112, arg2);
        }
        ++field969;
        int var3 = -42 % ((20 - arg1) / 63);
        if (~arg2.field635 > -129 || arg2.field614 < 128 || arg2.field635 >= 13184 || ~arg2.field614 <= -13185) {
            arg2.field620 = 0;
            arg2.field635 = arg2.field644[0] * 128 - -(arg2.field651 * 64);
            arg2.field619 = -1;
            arg2.field612 = -1;
            arg2.field632 = 0;
            arg2.field614 = arg2.field615[0] * 128 + arg2.field651 * 64;
            arg2.method216(0);
        }
        if (class46.field872 == arg2 && (arg2.field635 < 1536 || ~arg2.field614 > -1537 || arg2.field635 >= 11776 || arg2.field614 >= 11776)) {
            arg2.field635 = arg2.field644[0] * 128 + arg2.field651 * 64;
            arg2.field620 = 0;
            arg2.field632 = 0;
            arg2.field612 = -1;
            arg2.field619 = -1;
            arg2.field614 = arg2.field615[0] * 128 + arg2.field651 * 64;
            arg2.method216(0);
        }
        class20.method126(arg2, (byte) -76);
        class157.method949(-27578, arg2);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)V")
    private final void method295(int arg0, int arg1) {
        ++field972;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field978 = new int[4][4];
                                this.field978[0][0] = 2048;
                                this.field978[0][2] = 4096;
                                this.field978[1][2] = 4096;
                                this.field978[2][2] = 4096;
                                this.field978[0][3] = 0;
                                this.field978[1][0] = 2867;
                                this.field978[1][3] = 0;
                                this.field978[0][1] = 0;
                                this.field978[1][1] = 4096;
                                this.field978[3][2] = 0;
                                this.field978[2][0] = 3276;
                                this.field978[3][0] = 4096;
                                this.field978[2][3] = 0;
                                this.field978[2][1] = 4096;
                                this.field978[3][1] = 4096;
                                this.field978[3][3] = 0;
                            } else {
                                this.field978 = new int[16][4];
                                this.field978[0][1] = 80;
                                this.field978[0][3] = 321;
                                this.field978[0][2] = 192;
                                this.field978[0][0] = 0;
                                this.field978[1][3] = 562;
                                this.field978[1][1] = 321;
                                this.field978[1][0] = 155;
                                this.field978[1][2] = 449;
                                this.field978[2][3] = 803;
                                this.field978[2][1] = 578;
                                this.field978[3][1] = 947;
                                this.field978[2][0] = 389;
                                this.field978[3][3] = 1140;
                                this.field978[2][2] = 690;
                                this.field978[3][2] = 995;
                                this.field978[4][3] = 1509;
                                this.field978[3][0] = 671;
                                this.field978[4][2] = 1397;
                                this.field978[5][2] = 1429;
                                this.field978[6][2] = 1461;
                                this.field978[4][0] = 897;
                                this.field978[7][2] = 1525;
                                this.field978[8][2] = 1590;
                                this.field978[5][0] = 1175;
                                this.field978[9][2] = 2056;
                                this.field978[5][3] = 1413;
                                this.field978[4][1] = 1285;
                                this.field978[5][1] = 1525;
                                this.field978[6][3] = 1333;
                                this.field978[6][1] = 1734;
                                this.field978[6][0] = 1368;
                                this.field978[10][2] = 2586;
                                this.field978[11][2] = 3148;
                                this.field978[7][1] = 1413;
                                this.field978[7][3] = 1702;
                                this.field978[12][2] = 3710;
                                this.field978[8][3] = 2056;
                                this.field978[9][3] = 2666;
                                this.field978[7][0] = 1507;
                                this.field978[10][3] = 3276;
                                this.field978[11][3] = 3228;
                                this.field978[8][1] = 1108;
                                this.field978[8][0] = 1736;
                                this.field978[9][0] = 2088;
                                this.field978[9][1] = 1766;
                                this.field978[10][0] = 2355;
                                this.field978[10][1] = 2409;
                                this.field978[13][2] = 3421;
                                this.field978[11][1] = 3116;
                                this.field978[11][0] = 2691;
                                this.field978[12][0] = 3031;
                                this.field978[13][0] = 3522;
                                this.field978[14][0] = 3727;
                                this.field978[12][1] = 3806;
                                this.field978[14][2] = 3148;
                                this.field978[15][2] = 2505;
                                this.field978[13][1] = 3437;
                                this.field978[14][1] = 3116;
                                this.field978[15][0] = 4096;
                                this.field978[15][1] = 2377;
                                this.field978[12][3] = 3196;
                                this.field978[13][3] = 3019;
                                this.field978[14][3] = 3228;
                                this.field978[15][3] = 2746;
                            }
                        } else {
                            this.field978 = new int[6][4];
                            this.field978[0][0] = 0;
                            this.field978[0][1] = 0;
                            this.field978[0][2] = 0;
                            this.field978[1][1] = 0;
                            this.field978[2][1] = 0;
                            this.field978[1][2] = 0;
                            this.field978[0][3] = 0;
                            this.field978[1][3] = 1493;
                            this.field978[1][0] = 1843;
                            this.field978[2][2] = 0;
                            this.field978[2][3] = 2939;
                            this.field978[2][0] = 2457;
                            this.field978[3][2] = 1124;
                            this.field978[3][0] = 2781;
                            this.field978[3][1] = 0;
                            this.field978[4][0] = 3481;
                            this.field978[4][1] = 546;
                            this.field978[5][0] = 4096;
                            this.field978[5][1] = 4096;
                            this.field978[3][3] = 3565;
                            this.field978[4][2] = 3084;
                            this.field978[4][3] = 4031;
                            this.field978[5][3] = 4096;
                            this.field978[5][2] = 4096;
                        }
                    } else {
                        this.field978 = new int[7][4];
                        this.field978[0][0] = 0;
                        this.field978[0][1] = 0;
                        this.field978[0][3] = 4096;
                        this.field978[0][2] = 0;
                        this.field978[1][3] = 4096;
                        this.field978[2][3] = 0;
                        this.field978[1][2] = 4096;
                        this.field978[1][1] = 0;
                        this.field978[3][3] = 0;
                        this.field978[2][2] = 4096;
                        this.field978[4][3] = 0;
                        this.field978[3][2] = 4096;
                        this.field978[1][0] = 663;
                        this.field978[5][3] = 4096;
                        this.field978[4][2] = 0;
                        this.field978[5][2] = 0;
                        this.field978[6][2] = 0;
                        this.field978[2][1] = 0;
                        this.field978[2][0] = 1363;
                        this.field978[3][0] = 2048;
                        this.field978[4][0] = 2727;
                        this.field978[6][3] = 4096;
                        this.field978[3][1] = 4096;
                        this.field978[5][0] = 3411;
                        this.field978[4][1] = 4096;
                        this.field978[5][1] = 4096;
                        this.field978[6][1] = 0;
                        this.field978[6][0] = 4096;
                    }
                } else {
                    this.field978 = new int[8][4];
                    this.field978[0][0] = 0;
                    this.field978[0][2] = 2602;
                    this.field978[1][2] = 1799;
                    this.field978[0][3] = 2361;
                    this.field978[0][1] = 2650;
                    this.field978[1][0] = 2867;
                    this.field978[1][1] = 2313;
                    this.field978[2][1] = 2618;
                    this.field978[3][1] = 2296;
                    this.field978[2][2] = 1734;
                    this.field978[1][3] = 1558;
                    this.field978[4][1] = 2072;
                    this.field978[2][0] = 3072;
                    this.field978[5][1] = 2730;
                    this.field978[2][3] = 1413;
                    this.field978[3][0] = 3276;
                    this.field978[3][2] = 1220;
                    this.field978[4][0] = 3481;
                    this.field978[4][2] = 963;
                    this.field978[5][2] = 2152;
                    this.field978[6][2] = 1060;
                    this.field978[7][2] = 1413;
                    this.field978[3][3] = 947;
                    this.field978[4][3] = 722;
                    this.field978[5][3] = 1766;
                    this.field978[6][3] = 915;
                    this.field978[5][0] = 3686;
                    this.field978[6][1] = 2232;
                    this.field978[7][1] = 1686;
                    this.field978[6][0] = 3891;
                    this.field978[7][0] = 4096;
                    this.field978[7][3] = 1140;
                }
            } else {
                this.field978 = new int[2][4];
                this.field978[0][1] = 0;
                this.field978[0][3] = 0;
                this.field978[1][1] = 4096;
                this.field978[0][0] = 0;
                this.field978[1][3] = 4096;
                this.field978[1][0] = 4096;
                this.field978[0][2] = 0;
                this.field978[1][2] = 4096;
            }
        }
        if (arg0 != 1) {
            this.method78((byte) 26);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (this.field978 == null) {
            this.method295(1, 1);
        }
        ++field980;
        if (arg0 != 57) {
            method297((byte) -9);
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
    public static final void method296(int arg0) {
        if (arg0 > -54) {
            method294(-115, (byte) -54, (class35) null);
        }
        short var1 = 256;
        ++field983;
        if (class20.field386 > 0) {
            for (int var2 = 0; var2 < 256; ++var2) {
                if (class20.field386 <= 768) {
                    if (class20.field386 > 256) {
                        class172.field3259[var2] = class131.field2385[var2];
                    } else {
                        class172.field3259[var2] = class63.method357(-class20.field386 + 256, class131.field2385[var2], class40.field750[var2], -128);
                    }
                } else {
                    class172.field3259[var2] = class63.method357(-class20.field386 + 1024, class40.field750[var2], class131.field2385[var2], -128);
                }
            }
        } else if (~class209.field4007 >= -1) {
            for (int var3 = 0; var3 < 256; ++var3) {
                class172.field3259[var3] = class40.field750[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (~class209.field4007 >= -769) {
                    if (class209.field4007 <= 256) {
                        class172.field3259[var4] = class63.method357(-class209.field4007 + 256, class188.field3628[var4], class40.field750[var4], -128);
                    } else {
                        class172.field3259[var4] = class188.field3628[var4];
                    }
                } else {
                    class172.field3259[var4] = class63.method357(-class209.field4007 + 1024, class40.field750[var4], class188.field3628[var4], -128);
                }
            }
        }
        int var5 = 0;
        int var6 = class65.field1238.field2491 * 9;
        int var7 = 0;
        for (int var8 = 1; ~(var1 - 1) < ~var8; ++var8) {
            int var21 = (var1 - var8) * class51.field940[var8] / var1 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; ~var22 > -129; ++var22) {
                int var24 = class158.field2824[var5++];
                int var25 = class65.field1238.field2493[var6++];
                if (var24 == 0) {
                    class15.field287.field2493[var7++] = var25;
                } else {
                    int var26 = -var24 + 256;
                    int var28 = class172.field3259[var24];
                    class15.field287.field2493[var7++] = class10.method61(-16711936, class10.method61(16711935, var25) * var26 + var24 * class10.method61(16711935, var28)) + class10.method61(var26 * class10.method61(65280, var25) + var24 * class10.method61(var28, 65280), 16711680) >> 8;
                }
            }
            for (int var23 = 0; var21 > var23; ++var23) {
                class15.field287.field2493[var7++] = class65.field1238.field2493[var6++];
            }
            var6 += class65.field1238.field2491 + -128;
        }
        int var9 = 0;
        int var10 = 0;
        class15.field287.method824(0, 9);
        int var11 = class65.field1238.field2491 * 9 + 128;
        for (int var12 = 1; ~var12 > ~(var1 - 1); ++var12) {
            int var13 = (-var12 + var1) * class51.field940[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; ~var13 < ~var14; ++var14) {
                int var10001 = var9++;
                --var11;
                class209.field4010.field2493[var10001] = class65.field1238.field2493[var11];
            }
            for (int var15 = var13; var15 < 128; ++var15) {
                --var11;
                int var16 = class65.field1238.field2493[var11];
                int var17 = class158.field2824[var10++];
                if (~var17 != -1) {
                    int var19 = 256 - var17;
                    int var20 = class172.field3259[var17];
                    class209.field4010.field2493[var9++] = class10.method61(16711680, var17 * class10.method61(65280, var20) - -(var19 * class10.method61(var16, 65280))) + class10.method61(class10.method61(16711935, var20) * var17 - -(class10.method61(16711935, var16) * var19), -16711936) >> 8;
                } else {
                    class209.field4010.field2493[var9++] = var16;
                }
            }
            var11 += class65.field1238.field2491 + 128;
            var10 += var13;
        }
        class209.field4010.method824(637, 9);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
    public static void method297(byte arg0) {
        field984 = null;
        if (arg0 != -76) {
            method296(3);
        }
        field981 = null;
        field986 = null;
        field974 = null;
        field987 = null;
        field985 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field973;
        int[][] var3 = super.field232.method673(arg0, 90);
        if (super.field232.field1962) {
            int var4 = this.field978.length;
            int[] var5 = this.method77(0, arg0, -128);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            if (var4 > 0) {
                for (int var9 = 0; class201.field3889 > var9; ++var9) {
                    int var10 = 0;
                    int var11 = var5[var9];
                    for (int var12 = 0; var12 < var4 && var11 >= this.field978[var12][0]; ++var12) {
                        ++var10;
                    }
                    if (~var4 < ~var10) {
                        int[] var13 = this.field978[var10];
                        if (~var10 >= -1) {
                            var8[var9] = var13[1];
                            var6[var9] = var13[2];
                            var7[var9] = var13[3];
                        } else {
                            int[] var14 = this.field978[var10 + -1];
                            int var15 = (-var14[0] + var11 << 12) / (var13[0] + -var14[0]);
                            int var16 = -var15 + 4096;
                            var8[var9] = var13[1] * var15 + var14[1] * var16 >> 12;
                            var6[var9] = var13[2] * var15 + var14[2] * var16 >> 12;
                            var7[var9] = var13[3] * var15 + var14[3] * var16 >> 12;
                        }
                    } else {
                        int[] var17 = this.field978[var4 - 1];
                        var8[var9] = var17[1];
                        var6[var9] = var17[2];
                        var7[var9] = var17[3];
                    }
                }
            } else {
                for (int var18 = 0; var18 < class201.field3889; ++var18) {
                    var8[var18] = 0;
                    var6[var18] = 0;
                    var7[var18] = 0;
                }
            }
        }
        int var19 = -38 % ((arg1 - -58) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[Lgf;[BII)V")
    public static final void method298(int arg0, class65[] arg1, byte[] arg2, int arg3, int arg4) {
        if (arg4 == 2) {
            ++field982;
            class97 var5 = new class97(arg2);
            int var6 = -1;
            while (true) {
                int var7 = var5.method565(arg4 ^ -54);
                if (var7 == 0) {
                    return;
                }
                var6 += var7;
                int var8 = 0;
                while (true) {
                    int var9 = var5.method582(-14590);
                    if (var9 == 0) {
                        break;
                    }
                    var8 += var9 + -1;
                    int var10 = (var8 & 4068) >> 6;
                    int var11 = 63 & var8;
                    int var12 = var8 >> 12;
                    int var13 = var5.method588((byte) -82);
                    int var14 = var13 >> 2;
                    int var15 = var13 & 3;
                    int var16 = var10 - -arg0;
                    int var17 = arg3 + var11;
                    if (~var16 < -1 && var17 > 0 && ~var16 > -104 && var17 < 103) {
                        int var18 = var12;
                        class65 var19 = null;
                        if (~(2 & class46.field878[1][var16][var17]) == -3) {
                            var18 = var12 - 1;
                        }
                        if (var18 >= 0) {
                            var19 = arg1[var18];
                        }
                        class114.method704(-10182, var15, var19, var16, var14, var17, var12, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method588((byte) -53);
            if (~var4 != -1) {
                this.method295(1, var4);
            } else {
                this.field978 = new int[arg0.method588((byte) -68)][4];
                for (int var5 = 0; this.field978.length > var5; ++var5) {
                    this.field978[var5][0] = arg0.method611(false);
                    this.field978[var5][1] = arg0.method588((byte) -36) << 4;
                    this.field978[var5][2] = arg0.method588((byte) -41) << 4;
                    this.field978[var5][3] = arg0.method588((byte) -35) << 4;
                }
            }
        }
        if (arg2) {
            method296(-111);
        }
        ++field971;
    }
}
