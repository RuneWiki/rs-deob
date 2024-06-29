import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class91 extends class144 {

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "[I")
    private int[] field1233 = new int[257];

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1234 = "Starting 3d Library";

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field1237 = 0;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Z")
    public static boolean field1241 = true;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "[I")
    public static int[] field1246 = new int[] { 2, 9, 0, -2, 0, 8, 0, 6, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, -2, 0, 0, 3, 0, 0, 0, 11, 0, 0, 0, -1, 6, 4, 8, -2, 0, 0, 15, 0, 0, 0, 0, 17, 1, 0, 5, 0, 10, 0, 0, 0, 0, -1, 0, 0, 0, -1, -1, 0, 12, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 6, 0, 0, 0, 12, 1, 0, 6, 5, 0, 0, 0, 0, 0, -1, 0, 3, -1, 0, 2, 0, -2, 0, -2, -2, 0, 3, 0, 10, 0, 0, 0, 12, 0, 0, 0, 7, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 14, 28, 0, -2, -1, 3, 0, -2, -1, 0, 14, 0, 0, 3, 8, 7, 0, 15, 6, 0, -1, 8, 0, 0, 0, 2, 0, 0, 10, 7, 1, 2, 0, 2, 0, 0, 5, 0, 0, 0, 0, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 8, 0, -1, 0, 3, 0, 0, 0, 6, 0, 0, 0, 0, -2, 4, 0, 0, 0, 2, 3, 0, 8, -2, 0, 0, 6, 0, 0, 0, 0, 4, 0, 12, 0, -2, 0, 4, 8, -1, 0, 1, 0, 0, 0, 6, 0, 0, -1, 0, 3, -1, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 7, 0, 0, 0, 8, 0, 5, 0, -2 };

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Z")
    public static boolean field1247;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "[I")
    public static int[] field1236;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "[[I")
    private int[][] field1235;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "[[I")
    public static int[][] field1244;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field1245;
        if (arg0 != 5) {
            method549(24);
        }
        int[][] var3 = super.field2053.method1542(116, arg1);
        if (super.field2053.field3408) {
            int[] var4 = this.method934(-18877, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; class104.field1411 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1233[var9];
                var5[var8] = class5.method26(4080, var10 >> 12);
                var7[var8] = class5.method26(var10, 65280) >> 4;
                var6[var8] = class5.method26(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public static final void method549(int arg0) {
        if (arg0 != 0) {
            field1247 = true;
        }
        ++field1239;
        for (class206 var1 = (class206) class51.field578.method1532(arg0 ^ -104); var1 != null; var1 = (class206) class51.field578.method1523(-105)) {
            if (~var1.field2933 != 0) {
                var1.method1935(100);
            } else {
                var1.field2923 = 0;
                class48.method293((byte) 108, var1);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field1238;
        if (this.field1235 == null) {
            this.method551(1, (byte) 26);
        }
        if (arg0 > -109) {
            this.method553(-69);
        }
        this.method553(3);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field1240;
        if (~arg0 == -1) {
            int var4 = arg1.method1407(109);
            if (var4 == 0) {
                this.field1235 = new int[arg1.method1407(105)][4];
                for (int var5 = 0; var5 < this.field1235.length; ++var5) {
                    this.field1235[var5][0] = arg1.method1380(true);
                    this.field1235[var5][1] = arg1.method1407(106) << 4;
                    this.field1235[var5][2] = arg1.method1407(120) << 4;
                    this.field1235[var5][3] = arg1.method1407(121) << 4;
                }
            } else {
                this.method551(var4, (byte) 60);
            }
        }
        if (arg2 != 20630) {
            this.method8((byte) -95, 107);
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(B)V")
    public static void method550(byte arg0) {
        field1236 = null;
        field1246 = null;
        field1244 = null;
        field1234 = null;
        if (arg0 >= -20) {
            field1237 = -24;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    private final void method551(int arg0, byte arg1) {
        ++field1242;
        if (arg1 <= 25) {
            field1244 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field1235 = new int[4][4];
                                    this.field1235[0][2] = 4096;
                                    this.field1235[0][1] = 0;
                                    this.field1235[1][1] = 4096;
                                    this.field1235[1][2] = 4096;
                                    this.field1235[0][3] = 0;
                                    this.field1235[1][3] = 0;
                                    this.field1235[2][2] = 4096;
                                    this.field1235[0][0] = 2048;
                                    this.field1235[2][1] = 4096;
                                    this.field1235[2][3] = 0;
                                    this.field1235[3][1] = 4096;
                                    this.field1235[3][2] = 0;
                                    this.field1235[3][3] = 0;
                                    this.field1235[1][0] = 2867;
                                    this.field1235[2][0] = 3276;
                                    this.field1235[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field1235 = new int[16][4];
                                this.field1235[0][2] = 192;
                                this.field1235[1][2] = 449;
                                this.field1235[0][3] = 321;
                                this.field1235[1][3] = 562;
                                this.field1235[0][0] = 0;
                                this.field1235[2][3] = 803;
                                this.field1235[1][0] = 155;
                                this.field1235[2][0] = 389;
                                this.field1235[3][3] = 1140;
                                this.field1235[3][0] = 671;
                                this.field1235[4][0] = 897;
                                this.field1235[0][1] = 80;
                                this.field1235[1][1] = 321;
                                this.field1235[5][0] = 1175;
                                this.field1235[2][2] = 690;
                                this.field1235[6][0] = 1368;
                                this.field1235[7][0] = 1507;
                                this.field1235[3][2] = 995;
                                this.field1235[2][1] = 578;
                                this.field1235[4][3] = 1509;
                                this.field1235[4][2] = 1397;
                                this.field1235[5][3] = 1413;
                                this.field1235[6][3] = 1333;
                                this.field1235[8][0] = 1736;
                                this.field1235[7][3] = 1702;
                                this.field1235[9][0] = 2088;
                                this.field1235[5][2] = 1429;
                                this.field1235[10][0] = 2355;
                                this.field1235[8][3] = 2056;
                                this.field1235[11][0] = 2691;
                                this.field1235[12][0] = 3031;
                                this.field1235[13][0] = 3522;
                                this.field1235[14][0] = 3727;
                                this.field1235[9][3] = 2666;
                                this.field1235[3][1] = 947;
                                this.field1235[10][3] = 3276;
                                this.field1235[4][1] = 1285;
                                this.field1235[15][0] = 4096;
                                this.field1235[11][3] = 3228;
                                this.field1235[12][3] = 3196;
                                this.field1235[13][3] = 3019;
                                this.field1235[5][1] = 1525;
                                this.field1235[6][2] = 1461;
                                this.field1235[14][3] = 3228;
                                this.field1235[7][2] = 1525;
                                this.field1235[6][1] = 1734;
                                this.field1235[15][3] = 2746;
                                this.field1235[7][1] = 1413;
                                this.field1235[8][1] = 1108;
                                this.field1235[8][2] = 1590;
                                this.field1235[9][1] = 1766;
                                this.field1235[10][1] = 2409;
                                this.field1235[9][2] = 2056;
                                this.field1235[11][1] = 3116;
                                this.field1235[10][2] = 2586;
                                this.field1235[12][1] = 3806;
                                this.field1235[11][2] = 3148;
                                this.field1235[13][1] = 3437;
                                this.field1235[12][2] = 3710;
                                this.field1235[13][2] = 3421;
                                this.field1235[14][1] = 3116;
                                this.field1235[14][2] = 3148;
                                this.field1235[15][1] = 2377;
                                this.field1235[15][2] = 2505;
                            }
                        } else {
                            this.field1235 = new int[6][4];
                            this.field1235[0][2] = 0;
                            this.field1235[0][1] = 0;
                            this.field1235[1][2] = 0;
                            this.field1235[1][1] = 0;
                            this.field1235[0][3] = 0;
                            this.field1235[2][2] = 0;
                            this.field1235[2][1] = 0;
                            this.field1235[3][2] = 1124;
                            this.field1235[0][0] = 0;
                            this.field1235[3][1] = 0;
                            this.field1235[1][3] = 1493;
                            this.field1235[4][1] = 546;
                            this.field1235[1][0] = 1843;
                            this.field1235[4][2] = 3084;
                            this.field1235[5][1] = 4096;
                            this.field1235[2][3] = 2939;
                            this.field1235[5][2] = 4096;
                            this.field1235[2][0] = 2457;
                            this.field1235[3][0] = 2781;
                            this.field1235[4][0] = 3481;
                            this.field1235[3][3] = 3565;
                            this.field1235[5][0] = 4096;
                            this.field1235[4][3] = 4031;
                            this.field1235[5][3] = 4096;
                        }
                    } else {
                        this.field1235 = new int[7][4];
                        this.field1235[0][2] = 0;
                        this.field1235[0][1] = 0;
                        this.field1235[0][3] = 4096;
                        this.field1235[0][0] = 0;
                        this.field1235[1][3] = 4096;
                        this.field1235[2][3] = 0;
                        this.field1235[3][3] = 0;
                        this.field1235[1][2] = 4096;
                        this.field1235[1][0] = 663;
                        this.field1235[2][2] = 4096;
                        this.field1235[3][2] = 4096;
                        this.field1235[4][3] = 0;
                        this.field1235[2][0] = 1363;
                        this.field1235[3][0] = 2048;
                        this.field1235[4][0] = 2727;
                        this.field1235[4][2] = 0;
                        this.field1235[5][2] = 0;
                        this.field1235[6][2] = 0;
                        this.field1235[5][0] = 3411;
                        this.field1235[5][3] = 4096;
                        this.field1235[1][1] = 0;
                        this.field1235[2][1] = 0;
                        this.field1235[3][1] = 4096;
                        this.field1235[4][1] = 4096;
                        this.field1235[5][1] = 4096;
                        this.field1235[6][3] = 4096;
                        this.field1235[6][1] = 0;
                        this.field1235[6][0] = 4096;
                    }
                } else {
                    this.field1235 = new int[8][4];
                    this.field1235[0][0] = 0;
                    this.field1235[0][2] = 2602;
                    this.field1235[0][1] = 2650;
                    this.field1235[1][2] = 1799;
                    this.field1235[0][3] = 2361;
                    this.field1235[1][1] = 2313;
                    this.field1235[2][1] = 2618;
                    this.field1235[1][0] = 2867;
                    this.field1235[3][1] = 2296;
                    this.field1235[1][3] = 1558;
                    this.field1235[4][1] = 2072;
                    this.field1235[2][2] = 1734;
                    this.field1235[5][1] = 2730;
                    this.field1235[3][2] = 1220;
                    this.field1235[6][1] = 2232;
                    this.field1235[7][1] = 1686;
                    this.field1235[2][3] = 1413;
                    this.field1235[3][3] = 947;
                    this.field1235[2][0] = 3072;
                    this.field1235[4][3] = 722;
                    this.field1235[3][0] = 3276;
                    this.field1235[4][0] = 3481;
                    this.field1235[4][2] = 963;
                    this.field1235[5][2] = 2152;
                    this.field1235[5][0] = 3686;
                    this.field1235[6][0] = 3891;
                    this.field1235[5][3] = 1766;
                    this.field1235[6][2] = 1060;
                    this.field1235[6][3] = 915;
                    this.field1235[7][0] = 4096;
                    this.field1235[7][2] = 1413;
                    this.field1235[7][3] = 1140;
                }
            } else {
                this.field1235 = new int[2][4];
                this.field1235[0][0] = 0;
                this.field1235[1][0] = 4096;
                this.field1235[0][1] = 0;
                this.field1235[0][3] = 0;
                this.field1235[1][3] = 4096;
                this.field1235[0][2] = 0;
                this.field1235[1][2] = 4096;
                this.field1235[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)I")
    public static final int method552(int arg0) {
        ++field1232;
        if ((double) class273.field4042 == 3.0D) {
            return 37;
        } else if ((double) class273.field4042 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 1060) {
                field1236 = null;
            }
            if ((double) class273.field4042 == 6.0D) {
                return 75;
            } else {
                return (double) class273.field4042 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    private final void method553(int arg0) {
        ++field1243;
        if (arg0 != 3) {
            this.field1235 = null;
        }
        int var2 = this.field1235.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~this.field1235[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field1235[var4];
                    if (~var4 >= -1) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field1235[var4 - 1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var10 = var7[1] * var12 - -(var11[1] * var13) >> 12;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field1235[var2 + -1];
                    var10 = var14[1];
                    var9 = var14[2];
                    var8 = var14[3];
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var17 = var8 >> 4;
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field1233[var3] = class220.method1432(class220.method1432(var16 << 16, var15 << 8), var17);
            }
        }
    }
}
