import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class76 extends class89 {

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "[I")
    private int[] field1258 = new int[257];

    @OriginalMember(owner = "client!j", name = "W", descriptor = "Lda;")
    public static class275 field1247 = class255.method1672(92, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lda;")
    private static class275 field1241 = class255.method1672(126, "Loading textures )2 ");

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Lda;")
    public static class275 field1242 = field1241;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Lda;")
    public static class275 field1244 = null;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Lda;")
    public static class275 field1248 = class255.method1672(106, ")0");

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lda;")
    public static class275 field1252 = class255.method1672(109, ":duelstake:");

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Lda;")
    public static class275 field1256 = class255.method1672(108, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Z")
    public static boolean field1257 = true;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "[I")
    public static int[] field1245;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "[[I")
    private int[][] field1255;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            field1241 = null;
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        ++field1250;
        if (super.field1512.field2007) {
            int[] var4 = this.method645(-127, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; ~class65.field1070 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1258[var9];
                var5[var8] = class19.method98(16711680, var10) >> 12;
                var7[var8] = class19.method98(var10 >> 4, 4080);
                var6[var8] = class19.method98(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 == -20503) {
            if (arg2 == 0) {
                int var4 = arg1.method564((byte) 86);
                if (~var4 == -1) {
                    this.field1255 = new int[arg1.method564((byte) 109)][4];
                    for (int var5 = 0; ~var5 > ~this.field1255.length; ++var5) {
                        this.field1255[var5][0] = arg1.method608(111);
                        this.field1255[var5][1] = arg1.method564((byte) 71) << 4;
                        this.field1255[var5][2] = arg1.method564((byte) 82) << 4;
                        this.field1255[var5][3] = arg1.method564((byte) 85) << 4;
                    }
                } else {
                    this.method502(6, var4);
                }
            }
            ++field1249;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)I")
    public static final int method498(byte arg0) {
        ++field1246;
        if ((double) class199.field3397 == 3.0D) {
            return 37;
        } else {
            int var1 = 88 % ((arg0 - 31) / 33);
            if ((double) class199.field3397 == 4.0D) {
                return 50;
            } else {
                return (double) class199.field3397 == 6.0D ? 75 : 100;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
    public static void method499(byte arg0) {
        int var1 = -103 / ((arg0 - -50) / 38);
        field1245 = null;
        field1247 = null;
        field1244 = null;
        field1248 = null;
        field1241 = null;
        field1256 = null;
        field1252 = null;
        field1242 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIILak;JLak;Lak;)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3, class234 arg4, long arg5, class234 arg6, class234 arg7) {
        class71 var9 = new class71();
        var9.field1161 = arg4;
        var9.field1162 = arg1 * 128 + 64;
        var9.field1163 = arg2 * 128 + 64;
        var9.field1157 = arg3;
        var9.field1158 = arg5;
        var9.field1154 = arg6;
        var9.field1159 = arg7;
        int var10 = 0;
        class3 var11 = class235.field4101[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field29; ++var12) {
                class37 var13 = var11.field48[var12];
                if ((var13.field608 & 4194304L) == 4194304L) {
                    int var14 = var13.field612.method664();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1156 = -var10;
        if (class235.field4101[arg0][arg1][arg2] == null) {
            class235.field4101[arg0][arg1][arg2] = new class3(arg0, arg1, arg2);
        }
        class235.field4101[arg0][arg1][arg2].field37 = var9;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "(I)V")
    private final void method501(int arg0) {
        if (arg0 != 2) {
            this.method49(-108, (class85) null, 105);
        }
        ++field1254;
        int var2 = this.field1255.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~var5 <= ~this.field1255[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field1255[var2 - 1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1255[var4];
                    if (~var4 >= -1) {
                        var8 = var11[1];
                        var10 = var11[3];
                        var9 = var11[2];
                    } else {
                        int[] var12 = this.field1255[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var8 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field1258[var3] = class246.method1612(class246.method1612(var16 << 8, var17 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    private final void method502(int arg0, int arg1) {
        ++field1243;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1255 = new int[4][4];
                                this.field1255[0][0] = 2048;
                                this.field1255[0][3] = 0;
                                this.field1255[1][3] = 0;
                                this.field1255[0][2] = 4096;
                                this.field1255[2][3] = 0;
                                this.field1255[1][2] = 4096;
                                this.field1255[0][1] = 0;
                                this.field1255[2][2] = 4096;
                                this.field1255[3][2] = 0;
                                this.field1255[1][1] = 4096;
                                this.field1255[1][0] = 2867;
                                this.field1255[2][0] = 3276;
                                this.field1255[3][0] = 4096;
                                this.field1255[2][1] = 4096;
                                this.field1255[3][1] = 4096;
                                this.field1255[3][3] = 0;
                            } else {
                                this.field1255 = new int[16][4];
                                this.field1255[0][0] = 0;
                                this.field1255[0][1] = 80;
                                this.field1255[0][3] = 321;
                                this.field1255[1][1] = 321;
                                this.field1255[2][1] = 578;
                                this.field1255[0][2] = 192;
                                this.field1255[1][3] = 562;
                                this.field1255[3][1] = 947;
                                this.field1255[4][1] = 1285;
                                this.field1255[2][3] = 803;
                                this.field1255[1][0] = 155;
                                this.field1255[3][3] = 1140;
                                this.field1255[2][0] = 389;
                                this.field1255[5][1] = 1525;
                                this.field1255[1][2] = 449;
                                this.field1255[4][3] = 1509;
                                this.field1255[3][0] = 671;
                                this.field1255[4][0] = 897;
                                this.field1255[5][0] = 1175;
                                this.field1255[6][0] = 1368;
                                this.field1255[2][2] = 690;
                                this.field1255[3][2] = 995;
                                this.field1255[6][1] = 1734;
                                this.field1255[7][0] = 1507;
                                this.field1255[7][1] = 1413;
                                this.field1255[5][3] = 1413;
                                this.field1255[4][2] = 1397;
                                this.field1255[8][1] = 1108;
                                this.field1255[6][3] = 1333;
                                this.field1255[9][1] = 1766;
                                this.field1255[7][3] = 1702;
                                this.field1255[10][1] = 2409;
                                this.field1255[11][1] = 3116;
                                this.field1255[12][1] = 3806;
                                this.field1255[8][3] = 2056;
                                this.field1255[5][2] = 1429;
                                this.field1255[8][0] = 1736;
                                this.field1255[9][0] = 2088;
                                this.field1255[9][3] = 2666;
                                this.field1255[10][0] = 2355;
                                this.field1255[11][0] = 2691;
                                this.field1255[13][1] = 3437;
                                this.field1255[10][3] = 3276;
                                this.field1255[6][2] = 1461;
                                this.field1255[7][2] = 1525;
                                this.field1255[8][2] = 1590;
                                this.field1255[11][3] = 3228;
                                this.field1255[12][0] = 3031;
                                this.field1255[13][0] = 3522;
                                this.field1255[14][0] = 3727;
                                this.field1255[14][1] = 3116;
                                this.field1255[15][0] = 4096;
                                this.field1255[12][3] = 3196;
                                this.field1255[15][1] = 2377;
                                this.field1255[13][3] = 3019;
                                this.field1255[14][3] = 3228;
                                this.field1255[15][3] = 2746;
                                this.field1255[9][2] = 2056;
                                this.field1255[10][2] = 2586;
                                this.field1255[11][2] = 3148;
                                this.field1255[12][2] = 3710;
                                this.field1255[13][2] = 3421;
                                this.field1255[14][2] = 3148;
                                this.field1255[15][2] = 2505;
                            }
                        } else {
                            this.field1255 = new int[6][4];
                            this.field1255[0][1] = 0;
                            this.field1255[0][2] = 0;
                            this.field1255[0][3] = 0;
                            this.field1255[1][2] = 0;
                            this.field1255[1][1] = 0;
                            this.field1255[2][1] = 0;
                            this.field1255[3][1] = 0;
                            this.field1255[4][1] = 546;
                            this.field1255[5][1] = 4096;
                            this.field1255[2][2] = 0;
                            this.field1255[1][3] = 1493;
                            this.field1255[3][2] = 1124;
                            this.field1255[0][0] = 0;
                            this.field1255[2][3] = 2939;
                            this.field1255[4][2] = 3084;
                            this.field1255[1][0] = 1843;
                            this.field1255[5][2] = 4096;
                            this.field1255[2][0] = 2457;
                            this.field1255[3][0] = 2781;
                            this.field1255[4][0] = 3481;
                            this.field1255[3][3] = 3565;
                            this.field1255[4][3] = 4031;
                            this.field1255[5][0] = 4096;
                            this.field1255[5][3] = 4096;
                        }
                    } else {
                        this.field1255 = new int[7][4];
                        this.field1255[0][1] = 0;
                        this.field1255[0][0] = 0;
                        this.field1255[0][2] = 0;
                        this.field1255[1][1] = 0;
                        this.field1255[1][2] = 4096;
                        this.field1255[2][2] = 4096;
                        this.field1255[0][3] = 4096;
                        this.field1255[3][2] = 4096;
                        this.field1255[1][0] = 663;
                        this.field1255[2][0] = 1363;
                        this.field1255[4][2] = 0;
                        this.field1255[2][1] = 0;
                        this.field1255[3][0] = 2048;
                        this.field1255[1][3] = 4096;
                        this.field1255[2][3] = 0;
                        this.field1255[5][2] = 0;
                        this.field1255[6][2] = 0;
                        this.field1255[3][1] = 4096;
                        this.field1255[4][1] = 4096;
                        this.field1255[5][1] = 4096;
                        this.field1255[4][0] = 2727;
                        this.field1255[3][3] = 0;
                        this.field1255[6][1] = 0;
                        this.field1255[5][0] = 3411;
                        this.field1255[4][3] = 0;
                        this.field1255[5][3] = 4096;
                        this.field1255[6][0] = 4096;
                        this.field1255[6][3] = 4096;
                    }
                } else {
                    this.field1255 = new int[8][4];
                    this.field1255[0][3] = 2361;
                    this.field1255[0][0] = 0;
                    this.field1255[0][2] = 2602;
                    this.field1255[1][2] = 1799;
                    this.field1255[1][3] = 1558;
                    this.field1255[2][2] = 1734;
                    this.field1255[1][0] = 2867;
                    this.field1255[2][3] = 1413;
                    this.field1255[3][2] = 1220;
                    this.field1255[3][3] = 947;
                    this.field1255[4][3] = 722;
                    this.field1255[5][3] = 1766;
                    this.field1255[6][3] = 915;
                    this.field1255[7][3] = 1140;
                    this.field1255[0][1] = 2650;
                    this.field1255[2][0] = 3072;
                    this.field1255[3][0] = 3276;
                    this.field1255[1][1] = 2313;
                    this.field1255[4][2] = 963;
                    this.field1255[5][2] = 2152;
                    this.field1255[2][1] = 2618;
                    this.field1255[4][0] = 3481;
                    this.field1255[6][2] = 1060;
                    this.field1255[3][1] = 2296;
                    this.field1255[4][1] = 2072;
                    this.field1255[5][0] = 3686;
                    this.field1255[6][0] = 3891;
                    this.field1255[5][1] = 2730;
                    this.field1255[6][1] = 2232;
                    this.field1255[7][2] = 1413;
                    this.field1255[7][0] = 4096;
                    this.field1255[7][1] = 1686;
                }
            } else {
                this.field1255 = new int[2][4];
                this.field1255[0][3] = 0;
                this.field1255[0][1] = 0;
                this.field1255[1][3] = 4096;
                this.field1255[1][1] = 4096;
                this.field1255[0][0] = 0;
                this.field1255[0][2] = 0;
                this.field1255[1][2] = 4096;
                this.field1255[1][0] = 4096;
            }
        }
        if (arg0 != 6) {
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 != 1) {
            method499((byte) -2);
        }
        if (this.field1255 == null) {
            this.method502(6, 1);
        }
        this.method501(2);
        ++field1253;
    }
}
