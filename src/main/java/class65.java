import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class65 extends class117 {

    @OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
    private int[] field1100 = new int[257];

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1097 = -1;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Lmi;")
    public static class128 field1101 = new class128();

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "[B")
    public static byte[] field1103 = new byte[32896];

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "[I")
    public static int[] field1107;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "[[I")
    private int[][] field1095;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 == -1) {
            int var4 = arg2.method622(true);
            if (var4 != 0) {
                this.method453(var4, (byte) -67);
            } else {
                this.field1095 = new int[arg2.method622(true)][4];
                for (int var5 = 0; var5 < this.field1095.length; ++var5) {
                    this.field1095[var5][0] = arg2.method658(124);
                    this.field1095[var5][1] = arg2.method622(true) << 4;
                    this.field1095[var5][2] = arg2.method622(true) << 4;
                    this.field1095[var5][3] = arg2.method622(true) << 4;
                }
            }
        }
        ++field1102;
        if (arg0 != 0) {
            field1101 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    private final void method453(int arg0, byte arg1) {
        ++field1096;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1095 = new int[4][4];
                                this.field1095[0][3] = 0;
                                this.field1095[0][1] = 0;
                                this.field1095[1][1] = 4096;
                                this.field1095[2][1] = 4096;
                                this.field1095[1][3] = 0;
                                this.field1095[3][1] = 4096;
                                this.field1095[2][3] = 0;
                                this.field1095[0][2] = 4096;
                                this.field1095[1][2] = 4096;
                                this.field1095[3][3] = 0;
                                this.field1095[0][0] = 2048;
                                this.field1095[2][2] = 4096;
                                this.field1095[1][0] = 2867;
                                this.field1095[3][2] = 0;
                                this.field1095[2][0] = 3276;
                                this.field1095[3][0] = 4096;
                            } else {
                                this.field1095 = new int[16][4];
                                this.field1095[0][3] = 321;
                                this.field1095[0][1] = 80;
                                this.field1095[0][0] = 0;
                                this.field1095[0][2] = 192;
                                this.field1095[1][0] = 155;
                                this.field1095[1][3] = 562;
                                this.field1095[2][3] = 803;
                                this.field1095[1][1] = 321;
                                this.field1095[1][2] = 449;
                                this.field1095[2][2] = 690;
                                this.field1095[3][3] = 1140;
                                this.field1095[2][0] = 389;
                                this.field1095[2][1] = 578;
                                this.field1095[4][3] = 1509;
                                this.field1095[3][2] = 995;
                                this.field1095[4][2] = 1397;
                                this.field1095[3][1] = 947;
                                this.field1095[5][2] = 1429;
                                this.field1095[4][1] = 1285;
                                this.field1095[3][0] = 671;
                                this.field1095[6][2] = 1461;
                                this.field1095[5][1] = 1525;
                                this.field1095[5][3] = 1413;
                                this.field1095[6][3] = 1333;
                                this.field1095[7][2] = 1525;
                                this.field1095[8][2] = 1590;
                                this.field1095[9][2] = 2056;
                                this.field1095[10][2] = 2586;
                                this.field1095[7][3] = 1702;
                                this.field1095[4][0] = 897;
                                this.field1095[11][2] = 3148;
                                this.field1095[12][2] = 3710;
                                this.field1095[13][2] = 3421;
                                this.field1095[14][2] = 3148;
                                this.field1095[8][3] = 2056;
                                this.field1095[9][3] = 2666;
                                this.field1095[10][3] = 3276;
                                this.field1095[11][3] = 3228;
                                this.field1095[6][1] = 1734;
                                this.field1095[12][3] = 3196;
                                this.field1095[7][1] = 1413;
                                this.field1095[5][0] = 1175;
                                this.field1095[6][0] = 1368;
                                this.field1095[15][2] = 2505;
                                this.field1095[13][3] = 3019;
                                this.field1095[7][0] = 1507;
                                this.field1095[8][1] = 1108;
                                this.field1095[8][0] = 1736;
                                this.field1095[14][3] = 3228;
                                this.field1095[9][0] = 2088;
                                this.field1095[9][1] = 1766;
                                this.field1095[10][1] = 2409;
                                this.field1095[15][3] = 2746;
                                this.field1095[10][0] = 2355;
                                this.field1095[11][1] = 3116;
                                this.field1095[12][1] = 3806;
                                this.field1095[13][1] = 3437;
                                this.field1095[11][0] = 2691;
                                this.field1095[12][0] = 3031;
                                this.field1095[14][1] = 3116;
                                this.field1095[15][1] = 2377;
                                this.field1095[13][0] = 3522;
                                this.field1095[14][0] = 3727;
                                this.field1095[15][0] = 4096;
                            }
                        } else {
                            this.field1095 = new int[6][4];
                            this.field1095[0][0] = 0;
                            this.field1095[1][0] = 1843;
                            this.field1095[0][1] = 0;
                            this.field1095[2][0] = 2457;
                            this.field1095[0][3] = 0;
                            this.field1095[0][2] = 0;
                            this.field1095[3][0] = 2781;
                            this.field1095[1][1] = 0;
                            this.field1095[1][2] = 0;
                            this.field1095[4][0] = 3481;
                            this.field1095[5][0] = 4096;
                            this.field1095[2][2] = 0;
                            this.field1095[1][3] = 1493;
                            this.field1095[3][2] = 1124;
                            this.field1095[2][1] = 0;
                            this.field1095[3][1] = 0;
                            this.field1095[4][1] = 546;
                            this.field1095[2][3] = 2939;
                            this.field1095[4][2] = 3084;
                            this.field1095[3][3] = 3565;
                            this.field1095[5][2] = 4096;
                            this.field1095[4][3] = 4031;
                            this.field1095[5][1] = 4096;
                            this.field1095[5][3] = 4096;
                        }
                    } else {
                        this.field1095 = new int[7][4];
                        this.field1095[0][3] = 4096;
                        this.field1095[0][1] = 0;
                        this.field1095[1][3] = 4096;
                        this.field1095[1][1] = 0;
                        this.field1095[0][0] = 0;
                        this.field1095[2][3] = 0;
                        this.field1095[1][0] = 663;
                        this.field1095[2][0] = 1363;
                        this.field1095[3][0] = 2048;
                        this.field1095[4][0] = 2727;
                        this.field1095[3][3] = 0;
                        this.field1095[2][1] = 0;
                        this.field1095[4][3] = 0;
                        this.field1095[5][3] = 4096;
                        this.field1095[0][2] = 0;
                        this.field1095[6][3] = 4096;
                        this.field1095[3][1] = 4096;
                        this.field1095[5][0] = 3411;
                        this.field1095[1][2] = 4096;
                        this.field1095[2][2] = 4096;
                        this.field1095[4][1] = 4096;
                        this.field1095[6][0] = 4096;
                        this.field1095[5][1] = 4096;
                        this.field1095[6][1] = 0;
                        this.field1095[3][2] = 4096;
                        this.field1095[4][2] = 0;
                        this.field1095[5][2] = 0;
                        this.field1095[6][2] = 0;
                    }
                } else {
                    this.field1095 = new int[8][4];
                    this.field1095[0][1] = 2650;
                    this.field1095[1][1] = 2313;
                    this.field1095[0][3] = 2361;
                    this.field1095[0][2] = 2602;
                    this.field1095[2][1] = 2618;
                    this.field1095[0][0] = 0;
                    this.field1095[3][1] = 2296;
                    this.field1095[1][2] = 1799;
                    this.field1095[1][0] = 2867;
                    this.field1095[2][2] = 1734;
                    this.field1095[3][2] = 1220;
                    this.field1095[4][2] = 963;
                    this.field1095[2][0] = 3072;
                    this.field1095[4][1] = 2072;
                    this.field1095[1][3] = 1558;
                    this.field1095[5][2] = 2152;
                    this.field1095[6][2] = 1060;
                    this.field1095[5][1] = 2730;
                    this.field1095[2][3] = 1413;
                    this.field1095[7][2] = 1413;
                    this.field1095[3][0] = 3276;
                    this.field1095[3][3] = 947;
                    this.field1095[6][1] = 2232;
                    this.field1095[4][0] = 3481;
                    this.field1095[5][0] = 3686;
                    this.field1095[4][3] = 722;
                    this.field1095[5][3] = 1766;
                    this.field1095[7][1] = 1686;
                    this.field1095[6][3] = 915;
                    this.field1095[6][0] = 3891;
                    this.field1095[7][3] = 1140;
                    this.field1095[7][0] = 4096;
                }
            } else {
                this.field1095 = new int[2][4];
                this.field1095[0][1] = 0;
                this.field1095[1][1] = 4096;
                this.field1095[0][0] = 0;
                this.field1095[0][2] = 0;
                this.field1095[1][0] = 4096;
                this.field1095[0][3] = 0;
                this.field1095[1][2] = 4096;
                this.field1095[1][3] = 4096;
            }
        }
        if (arg1 <= -6) {
            ;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 > -92) {
            method454(-19, -105);
        }
        ++field1098;
        if (this.field1095 == null) {
            this.method453(1, (byte) -120);
        }
        this.method455(727);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field1106;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -73);
        if (!arg1) {
            this.field1100 = null;
        }
        if (super.field2228.field3221) {
            int[] var4 = this.method932(arg0, !arg1, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class143.field2702; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1100[var9];
                var7[var8] = class7.method50(4080, var10 >> 12);
                var5[var8] = class7.method50(4080, var10 >> 4);
                var6[var8] = class7.method50(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)V")
    public static final void method454(int arg0, int arg1) {
        if (~arg1 == -38) {
            class219.field3985 = 3.0F;
        } else if (arg1 != 50) {
            if (arg1 == 75) {
                class219.field3985 = 6.0F;
            } else {
                class219.field3985 = 8.0F;
            }
        } else {
            class219.field3985 = 4.0F;
        }
        class175.field3192 = -1;
        class175.field3192 = -1;
        ++field1105;
        if (arg0 != 0) {
            field1097 = -86;
        }
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
    private final void method455(int arg0) {
        ++field1099;
        if (arg0 != 727) {
            field1104 = 19;
        }
        int var2 = this.field1095.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var2 > var6 && ~var4 <= ~this.field1095[var6][0]; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var5 <= ~var2) {
                    int[] var7 = this.field1095[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1095[var5];
                    if (~var5 >= -1) {
                        var8 = var11[2];
                        var9 = var11[1];
                        var10 = var11[3];
                    } else {
                        int[] var12 = this.field1095[var5 + -1];
                        int var13 = (-var12[0] + var4 << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var16 = var8 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field1100[var3] = class3.method27(class3.method27(var16 << 8, var17 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class65() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1101 = null;
        if (arg0 < 83) {
            field1097 = -112;
        }
        field1103 = null;
        field1107 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field1103[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
