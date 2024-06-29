import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class75 extends class23 {

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "[I")
    private int[] field1319 = new int[257];

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "Ldc;")
    private static class37 field1320 = class185.method1233((byte) 86, "white:");

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "Ldc;")
    public static class37 field1322 = field1320;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Ldc;")
    public static class37 field1325 = class185.method1233((byte) 86, " )2> ");

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field1324 = -1;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "Ldc;")
    public static class37 field1332 = field1320;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Ldc;")
    public static class37 field1323 = class185.method1233((byte) 86, "(Y");

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field1330 = 1;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "Lqb;")
    public static class176 field1331 = new class176(500);

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
    public static int field1335 = -1;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "[I")
    public static int[] field1337 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "[[I")
    private int[][] field1326;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field1327;
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        if (super.field398.field4303) {
            int[] var4 = this.method162(arg0, 0, (byte) 18);
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            for (int var8 = 0; class199.field3705 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1319[var9];
                var6[var8] = class58.method449(16711680, var10) >> 12;
                var7[var8] = class58.method449(var10 >> 4, 4080);
                var5[var8] = class58.method449(4080, var10 << 4);
            }
        }
        if (arg1 != 9) {
            field1337 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        ++field1333;
        if (arg0 != -21746) {
            field1324 = -120;
        }
        if (this.field1326 == null) {
            this.method523(arg0 ^ -25759, 1);
        }
        this.method525((byte) -119);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
    private final void method523(int arg0, int arg1) {
        ++field1317;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1326 = new int[4][4];
                                this.field1326[0][3] = 0;
                                this.field1326[0][1] = 0;
                                this.field1326[0][2] = 4096;
                                this.field1326[1][3] = 0;
                                this.field1326[1][2] = 4096;
                                this.field1326[1][1] = 4096;
                                this.field1326[0][0] = 2048;
                                this.field1326[1][0] = 2867;
                                this.field1326[2][3] = 0;
                                this.field1326[2][2] = 4096;
                                this.field1326[3][3] = 0;
                                this.field1326[3][2] = 0;
                                this.field1326[2][1] = 4096;
                                this.field1326[3][1] = 4096;
                                this.field1326[2][0] = 3276;
                                this.field1326[3][0] = 4096;
                            } else {
                                this.field1326 = new int[16][4];
                                this.field1326[0][2] = 192;
                                this.field1326[0][0] = 0;
                                this.field1326[1][0] = 155;
                                this.field1326[0][1] = 80;
                                this.field1326[1][2] = 449;
                                this.field1326[0][3] = 321;
                                this.field1326[2][0] = 389;
                                this.field1326[2][2] = 690;
                                this.field1326[1][3] = 562;
                                this.field1326[3][2] = 995;
                                this.field1326[3][0] = 671;
                                this.field1326[2][3] = 803;
                                this.field1326[4][2] = 1397;
                                this.field1326[1][1] = 321;
                                this.field1326[2][1] = 578;
                                this.field1326[5][2] = 1429;
                                this.field1326[4][0] = 897;
                                this.field1326[3][3] = 1140;
                                this.field1326[6][2] = 1461;
                                this.field1326[3][1] = 947;
                                this.field1326[5][0] = 1175;
                                this.field1326[7][2] = 1525;
                                this.field1326[4][3] = 1509;
                                this.field1326[6][0] = 1368;
                                this.field1326[5][3] = 1413;
                                this.field1326[4][1] = 1285;
                                this.field1326[7][0] = 1507;
                                this.field1326[6][3] = 1333;
                                this.field1326[5][1] = 1525;
                                this.field1326[8][0] = 1736;
                                this.field1326[9][0] = 2088;
                                this.field1326[6][1] = 1734;
                                this.field1326[7][1] = 1413;
                                this.field1326[10][0] = 2355;
                                this.field1326[8][2] = 1590;
                                this.field1326[8][1] = 1108;
                                this.field1326[11][0] = 2691;
                                this.field1326[7][3] = 1702;
                                this.field1326[9][1] = 1766;
                                this.field1326[8][3] = 2056;
                                this.field1326[9][2] = 2056;
                                this.field1326[10][2] = 2586;
                                this.field1326[10][1] = 2409;
                                this.field1326[9][3] = 2666;
                                this.field1326[12][0] = 3031;
                                this.field1326[11][1] = 3116;
                                this.field1326[13][0] = 3522;
                                this.field1326[14][0] = 3727;
                                this.field1326[15][0] = 4096;
                                this.field1326[11][2] = 3148;
                                this.field1326[10][3] = 3276;
                                this.field1326[12][1] = 3806;
                                this.field1326[13][1] = 3437;
                                this.field1326[12][2] = 3710;
                                this.field1326[13][2] = 3421;
                                this.field1326[14][1] = 3116;
                                this.field1326[15][1] = 2377;
                                this.field1326[14][2] = 3148;
                                this.field1326[11][3] = 3228;
                                this.field1326[12][3] = 3196;
                                this.field1326[13][3] = 3019;
                                this.field1326[14][3] = 3228;
                                this.field1326[15][2] = 2505;
                                this.field1326[15][3] = 2746;
                            }
                        } else {
                            this.field1326 = new int[6][4];
                            this.field1326[0][0] = 0;
                            this.field1326[1][0] = 1843;
                            this.field1326[0][3] = 0;
                            this.field1326[1][3] = 1493;
                            this.field1326[0][2] = 0;
                            this.field1326[2][0] = 2457;
                            this.field1326[0][1] = 0;
                            this.field1326[1][2] = 0;
                            this.field1326[1][1] = 0;
                            this.field1326[2][2] = 0;
                            this.field1326[3][0] = 2781;
                            this.field1326[3][2] = 1124;
                            this.field1326[4][0] = 3481;
                            this.field1326[2][3] = 2939;
                            this.field1326[2][1] = 0;
                            this.field1326[3][1] = 0;
                            this.field1326[5][0] = 4096;
                            this.field1326[4][2] = 3084;
                            this.field1326[5][2] = 4096;
                            this.field1326[3][3] = 3565;
                            this.field1326[4][3] = 4031;
                            this.field1326[5][3] = 4096;
                            this.field1326[4][1] = 546;
                            this.field1326[5][1] = 4096;
                        }
                    } else {
                        this.field1326 = new int[7][4];
                        this.field1326[0][1] = 0;
                        this.field1326[0][3] = 4096;
                        this.field1326[1][3] = 4096;
                        this.field1326[1][1] = 0;
                        this.field1326[2][3] = 0;
                        this.field1326[0][0] = 0;
                        this.field1326[1][0] = 663;
                        this.field1326[3][3] = 0;
                        this.field1326[0][2] = 0;
                        this.field1326[4][3] = 0;
                        this.field1326[2][1] = 0;
                        this.field1326[3][1] = 4096;
                        this.field1326[5][3] = 4096;
                        this.field1326[1][2] = 4096;
                        this.field1326[2][0] = 1363;
                        this.field1326[4][1] = 4096;
                        this.field1326[2][2] = 4096;
                        this.field1326[3][2] = 4096;
                        this.field1326[5][1] = 4096;
                        this.field1326[6][1] = 0;
                        this.field1326[3][0] = 2048;
                        this.field1326[4][0] = 2727;
                        this.field1326[5][0] = 3411;
                        this.field1326[6][3] = 4096;
                        this.field1326[4][2] = 0;
                        this.field1326[6][0] = 4096;
                        this.field1326[5][2] = 0;
                        this.field1326[6][2] = 0;
                    }
                } else {
                    this.field1326 = new int[8][4];
                    this.field1326[0][3] = 2361;
                    this.field1326[0][1] = 2650;
                    this.field1326[0][2] = 2602;
                    this.field1326[1][3] = 1558;
                    this.field1326[2][3] = 1413;
                    this.field1326[1][1] = 2313;
                    this.field1326[3][3] = 947;
                    this.field1326[1][2] = 1799;
                    this.field1326[0][0] = 0;
                    this.field1326[4][3] = 722;
                    this.field1326[2][2] = 1734;
                    this.field1326[3][2] = 1220;
                    this.field1326[5][3] = 1766;
                    this.field1326[6][3] = 915;
                    this.field1326[4][2] = 963;
                    this.field1326[1][0] = 2867;
                    this.field1326[2][1] = 2618;
                    this.field1326[5][2] = 2152;
                    this.field1326[3][1] = 2296;
                    this.field1326[6][2] = 1060;
                    this.field1326[7][3] = 1140;
                    this.field1326[2][0] = 3072;
                    this.field1326[3][0] = 3276;
                    this.field1326[7][2] = 1413;
                    this.field1326[4][1] = 2072;
                    this.field1326[5][1] = 2730;
                    this.field1326[4][0] = 3481;
                    this.field1326[5][0] = 3686;
                    this.field1326[6][0] = 3891;
                    this.field1326[6][1] = 2232;
                    this.field1326[7][0] = 4096;
                    this.field1326[7][1] = 1686;
                }
            } else {
                this.field1326 = new int[2][4];
                this.field1326[0][0] = 0;
                this.field1326[0][3] = 0;
                this.field1326[0][1] = 0;
                this.field1326[1][1] = 4096;
                this.field1326[0][2] = 0;
                this.field1326[1][0] = 4096;
                this.field1326[1][3] = 4096;
                this.field1326[1][2] = 4096;
            }
        }
        if (arg0 != 12399) {
            this.method525((byte) 111);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILdj;)V")
    public static final void method524(int arg0, int arg1, class44 arg2) {
        ++field1328;
        if (arg1 != 5) {
            field1321 = 93;
        }
        if (class203.field3761 != null) {
            class203.field3761.field526 = arg0 * 8 + 5;
            int var3 = class203.field3761.method226(arg1 + -4);
            int var4 = class203.field3761.method226(arg1 + -43);
            arg2.method382(var4, 39, var3);
        } else {
            class65.method480(0, 6024, true, 255, (byte) 0, (class44) null, 255);
            class119.field2127[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
    private final void method525(byte arg0) {
        ++field1329;
        if (arg0 > -62) {
            this.method523(-86, -45);
        }
        int var2 = this.field1326.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && var5 >= this.field1326[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field1326[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field1326[var4];
                    if (~var4 < -1) {
                        int[] var12 = this.field1326[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var9 = var11[1];
                        var10 = var11[2];
                        var8 = var11[3];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field1319[var3] = class138.method960(class138.method960(var15 << 16, var17 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1000) {
            if (arg1 == 0) {
                int var4 = arg0.method215(-1797813752);
                if (~var4 != -1) {
                    this.method523(12399, var4);
                } else {
                    this.field1326 = new int[arg0.method215(arg2 + -1797814752)][4];
                    for (int var5 = 0; var5 < this.field1326.length; ++var5) {
                        this.field1326[var5][0] = arg0.method230((byte) -125);
                        this.field1326[var5][1] = arg0.method215(-1797813752) << 4;
                        this.field1326[var5][2] = arg0.method215(-1797813752) << 4;
                        this.field1326[var5][3] = arg0.method215(-1797813752) << 4;
                    }
                }
            }
            ++field1318;
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1332 = null;
        field1323 = null;
        if (arg0 != 4096) {
            field1337 = null;
        }
        field1337 = null;
        field1325 = null;
        field1331 = null;
        field1320 = null;
        field1322 = null;
    }
}
