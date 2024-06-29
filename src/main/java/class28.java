import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class28 extends class98 {

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "[I")
    private int[] field347 = new int[257];

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "Lse;")
    public static class138 field344 = new class138(64);

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "[I")
    public static int[] field345 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "Llg;")
    public static class237 field349 = new class237(4);

    @OriginalMember(owner = "client!gs", name = "ab", descriptor = "[I")
    public static int[] field352 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "[[I")
    private int[][] field348;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field344 = null;
        field345 = null;
        if (arg0 != -124) {
            field349 = null;
        }
        field349 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        ++field343;
        if (this.field348 == null) {
            this.method190(false, 1);
        }
        if (arg0 == 1) {
            this.method189(-63);
        }
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
    private final void method189(int arg0) {
        ++field340;
        int var2 = this.field348.length;
        if (arg0 >= -55) {
            method192(-121);
        }
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field348[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field348[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field348[var4];
                    if (var4 <= 0) {
                        var9 = var11[3];
                        var10 = var11[1];
                        var8 = var11[2];
                    } else {
                        int[] var12 = this.field348[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field347[var3] = class429.method2704(var17, class429.method2704(var16 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)V")
    private final void method190(boolean arg0, int arg1) {
        ++field350;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field348 = new int[4][4];
                                this.field348[0][3] = 0;
                                this.field348[0][1] = 0;
                                this.field348[0][0] = 2048;
                                this.field348[0][2] = 4096;
                                this.field348[1][1] = 4096;
                                this.field348[1][2] = 4096;
                                this.field348[1][0] = 2867;
                                this.field348[1][3] = 0;
                                this.field348[2][0] = 3276;
                                this.field348[2][1] = 4096;
                                this.field348[2][2] = 4096;
                                this.field348[2][3] = 0;
                                this.field348[3][3] = 0;
                                this.field348[3][1] = 4096;
                                this.field348[3][0] = 4096;
                                this.field348[3][2] = 0;
                            } else {
                                this.field348 = new int[16][4];
                                this.field348[0][3] = 321;
                                this.field348[0][1] = 80;
                                this.field348[0][2] = 192;
                                this.field348[0][0] = 0;
                                this.field348[1][1] = 321;
                                this.field348[1][3] = 562;
                                this.field348[1][0] = 155;
                                this.field348[1][2] = 449;
                                this.field348[2][1] = 578;
                                this.field348[2][2] = 690;
                                this.field348[2][3] = 803;
                                this.field348[2][0] = 389;
                                this.field348[3][2] = 995;
                                this.field348[3][3] = 1140;
                                this.field348[3][0] = 671;
                                this.field348[3][1] = 947;
                                this.field348[4][0] = 897;
                                this.field348[4][2] = 1397;
                                this.field348[4][1] = 1285;
                                this.field348[4][3] = 1509;
                                this.field348[5][3] = 1413;
                                this.field348[5][2] = 1429;
                                this.field348[5][1] = 1525;
                                this.field348[5][0] = 1175;
                                this.field348[6][3] = 1333;
                                this.field348[6][1] = 1734;
                                this.field348[6][2] = 1461;
                                this.field348[6][0] = 1368;
                                this.field348[7][3] = 1702;
                                this.field348[7][1] = 1413;
                                this.field348[7][2] = 1525;
                                this.field348[7][0] = 1507;
                                this.field348[8][1] = 1108;
                                this.field348[8][0] = 1736;
                                this.field348[8][3] = 2056;
                                this.field348[8][2] = 1590;
                                this.field348[9][0] = 2088;
                                this.field348[9][1] = 1766;
                                this.field348[9][3] = 2666;
                                this.field348[9][2] = 2056;
                                this.field348[10][2] = 2586;
                                this.field348[10][1] = 2409;
                                this.field348[10][0] = 2355;
                                this.field348[10][3] = 3276;
                                this.field348[11][2] = 3148;
                                this.field348[11][0] = 2691;
                                this.field348[11][1] = 3116;
                                this.field348[11][3] = 3228;
                                this.field348[12][3] = 3196;
                                this.field348[12][2] = 3710;
                                this.field348[12][1] = 3806;
                                this.field348[12][0] = 3031;
                                this.field348[13][3] = 3019;
                                this.field348[13][2] = 3421;
                                this.field348[13][0] = 3522;
                                this.field348[13][1] = 3437;
                                this.field348[14][3] = 3228;
                                this.field348[14][2] = 3148;
                                this.field348[14][1] = 3116;
                                this.field348[14][0] = 3727;
                                this.field348[15][2] = 2505;
                                this.field348[15][0] = 4096;
                                this.field348[15][1] = 2377;
                                this.field348[15][3] = 2746;
                            }
                        } else {
                            this.field348 = new int[6][4];
                            this.field348[0][1] = 0;
                            this.field348[0][2] = 0;
                            this.field348[0][0] = 0;
                            this.field348[0][3] = 0;
                            this.field348[1][2] = 0;
                            this.field348[1][1] = 0;
                            this.field348[1][3] = 1493;
                            this.field348[1][0] = 1843;
                            this.field348[2][1] = 0;
                            this.field348[2][0] = 2457;
                            this.field348[2][3] = 2939;
                            this.field348[2][2] = 0;
                            this.field348[3][3] = 3565;
                            this.field348[3][0] = 2781;
                            this.field348[3][1] = 0;
                            this.field348[3][2] = 1124;
                            this.field348[4][1] = 546;
                            this.field348[4][0] = 3481;
                            this.field348[4][2] = 3084;
                            this.field348[4][3] = 4031;
                            this.field348[5][0] = 4096;
                            this.field348[5][1] = 4096;
                            this.field348[5][2] = 4096;
                            this.field348[5][3] = 4096;
                        }
                    } else {
                        this.field348 = new int[7][4];
                        this.field348[0][1] = 0;
                        this.field348[0][3] = 4096;
                        this.field348[0][2] = 0;
                        this.field348[0][0] = 0;
                        this.field348[1][2] = 4096;
                        this.field348[1][0] = 663;
                        this.field348[1][1] = 0;
                        this.field348[1][3] = 4096;
                        this.field348[2][0] = 1363;
                        this.field348[2][3] = 0;
                        this.field348[2][2] = 4096;
                        this.field348[2][1] = 0;
                        this.field348[3][0] = 2048;
                        this.field348[3][3] = 0;
                        this.field348[3][2] = 4096;
                        this.field348[3][1] = 4096;
                        this.field348[4][3] = 0;
                        this.field348[4][0] = 2727;
                        this.field348[4][2] = 0;
                        this.field348[4][1] = 4096;
                        this.field348[5][0] = 3411;
                        this.field348[5][1] = 4096;
                        this.field348[5][2] = 0;
                        this.field348[5][3] = 4096;
                        this.field348[6][1] = 0;
                        this.field348[6][0] = 4096;
                        this.field348[6][2] = 0;
                        this.field348[6][3] = 4096;
                    }
                } else {
                    this.field348 = new int[8][4];
                    this.field348[0][1] = 2650;
                    this.field348[0][2] = 2602;
                    this.field348[0][3] = 2361;
                    this.field348[0][0] = 0;
                    this.field348[1][1] = 2313;
                    this.field348[1][2] = 1799;
                    this.field348[1][3] = 1558;
                    this.field348[1][0] = 2867;
                    this.field348[2][2] = 1734;
                    this.field348[2][0] = 3072;
                    this.field348[2][1] = 2618;
                    this.field348[2][3] = 1413;
                    this.field348[3][2] = 1220;
                    this.field348[3][1] = 2296;
                    this.field348[3][0] = 3276;
                    this.field348[3][3] = 947;
                    this.field348[4][2] = 963;
                    this.field348[4][0] = 3481;
                    this.field348[4][1] = 2072;
                    this.field348[4][3] = 722;
                    this.field348[5][0] = 3686;
                    this.field348[5][1] = 2730;
                    this.field348[5][2] = 2152;
                    this.field348[5][3] = 1766;
                    this.field348[6][3] = 915;
                    this.field348[6][1] = 2232;
                    this.field348[6][2] = 1060;
                    this.field348[6][0] = 3891;
                    this.field348[7][1] = 1686;
                    this.field348[7][2] = 1413;
                    this.field348[7][3] = 1140;
                    this.field348[7][0] = 4096;
                }
            } else {
                this.field348 = new int[2][4];
                this.field348[0][2] = 0;
                this.field348[0][0] = 0;
                this.field348[0][1] = 0;
                this.field348[0][3] = 0;
                this.field348[1][1] = 4096;
                this.field348[1][2] = 4096;
                this.field348[1][0] = 4096;
                this.field348[1][3] = 4096;
            }
        }
        if (arg0) {
            this.method188(73);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public static final void method191(int arg0) {
        if (arg0 >= -17) {
            field351 = 7;
        }
        ++field338;
        for (class248 var1 = (class248) class151.field1872.method506((byte) -128); var1 != null; var1 = (class248) class151.field1872.method514(true)) {
            if (~var1.field3543 == 0) {
                var1.field3541 = 0;
                class225.method1502(var1, false);
            } else {
                var1.method2594((byte) -22);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
    public static final void method192(int arg0) {
        ++field341;
        if (!class222.field3120) {
            if (class374.field5254) {
                class441.field6333 = (float) (-128 & (int) class441.field6333 - -191);
            } else {
                class286.field4016 += (24.0F - class286.field4016) / 2.0F;
            }
            class222.field3120 = true;
            int var1 = 25 / ((arg0 - -5) / 51);
            class225.field3160 = true;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            method191(2);
        }
        if (~arg0 == -1) {
            int var4 = arg1.method1574(-106);
            if (var4 != 0) {
                this.method190(false, var4);
            } else {
                this.field348 = new int[arg1.method1574(-110)][4];
                for (int var5 = 0; this.field348.length > var5; ++var5) {
                    this.field348[var5][0] = arg1.method1617((byte) 48);
                    this.field348[var5][1] = arg1.method1574(-53) << 4;
                    this.field348[var5][2] = arg1.method1574(-70) << 4;
                    this.field348[var5][3] = arg1.method1574(-88) << 4;
                }
            }
        }
        ++field342;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILtn;Ltn;)V")
    public static final void method193(int arg0, int arg1, int arg2, class48 arg3, class48 arg4) {
        if (class250.field3570[arg0][arg1][arg2] == null) {
            class313.method2069(arg0, arg1, arg2);
        }
        class250.field3570[arg0][arg1][arg2].field2788 = arg3;
        class250.field3570[arg0][arg1][arg2].field2786 = arg4;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field346;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[] var4 = this.method539(0, (byte) -97, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class268.field3811; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field347[var9];
                var5[var8] = class33.method210(var10, 16711680) >> 12;
                var6[var8] = class33.method210(var10, 65280) >> 4;
                var7[var8] = class33.method210(var10, 255) << 4;
            }
        }
        int var11 = -37 / ((arg1 - 60) / 43);
        return var3;
    }
}
