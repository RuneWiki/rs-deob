import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class76 extends class297 {

    @OriginalMember(owner = "client!aw", name = "S", descriptor = "[I")
    private int[] field1370 = new int[257];

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Lej;")
    public static class124 field1360 = new class124(28, 2);

    @OriginalMember(owner = "client!aw", name = "Q", descriptor = "Lmu;")
    public static class303 field1368 = new class303(61, -1);

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!aw", name = "T", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "Luha;")
    public static class245 field1366;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "[[I")
    private int[][] field1365;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method1535(255);
            if (~var4 != -1) {
                this.method712(var4, arg2 + -31111);
            } else {
                this.field1365 = new int[arg0.method1535(255)][4];
                for (int var5 = 0; this.field1365.length > var5; ++var5) {
                    this.field1365[var5][0] = arg0.method1478(842397944);
                    this.field1365[var5][1] = arg0.method1535(255) << 4;
                    this.field1365[var5][2] = arg0.method1535(255) << 4;
                    this.field1365[var5][3] = arg0.method1535(class710.method3948(arg2, 31192)) << 4;
                }
            }
        }
        ++field1361;
        if (arg2 != 31015) {
            method710((byte) 100);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZ)V")
    public static final void method709(int arg0, boolean arg1) {
        ++field1369;
        class693.field9368.method2065((byte) 74, class693.field9368.field4452, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4458, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4447, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4461, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4417, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4444, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4453, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4433, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4443, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4467, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4435, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4432, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4427, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4456, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4413, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4445, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4421, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4423, arg0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4440, 0);
        class254.method1731(arg0 ^ 110);
        class693.field9368.method2065((byte) 74, class693.field9368.field4428, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4426, 1);
        class297.method1947(-1);
        class440.method2652(true);
        class274.field3858 = true;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        ++field1363;
        int[][] var3 = super.field4166.method2180(arg1 ^ 1564598919, arg0);
        if (super.field4166.field4849) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class525.field7275; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1370[var9];
                var5[var8] = class263.method1762(var10, 16711680) >> 12;
                var6[var8] = class263.method1762(65280, var10) >> 4;
                var7[var8] = class263.method1762(4080, var10 << 4);
            }
        }
        return arg1 != -1564599039 ? null : var3;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V")
    public static void method710(byte arg0) {
        field1360 = null;
        field1368 = null;
        if (arg0 != -98) {
            method710((byte) 27);
        }
        field1366 = null;
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        if (arg0 >= 108) {
            ++field1367;
            if (this.field1365 == null) {
                this.method712(1, -97);
            }
            this.method713(-29547);
        }
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(II)V")
    private final void method712(int arg0, int arg1) {
        ++field1364;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1365 = new int[4][4];
                                this.field1365[0][1] = 0;
                                this.field1365[0][2] = 4096;
                                this.field1365[0][3] = 0;
                                this.field1365[0][0] = 2048;
                                this.field1365[1][0] = 2867;
                                this.field1365[1][3] = 0;
                                this.field1365[1][1] = 4096;
                                this.field1365[1][2] = 4096;
                                this.field1365[2][0] = 3276;
                                this.field1365[2][1] = 4096;
                                this.field1365[2][3] = 0;
                                this.field1365[2][2] = 4096;
                                this.field1365[3][0] = 4096;
                                this.field1365[3][2] = 0;
                                this.field1365[3][1] = 4096;
                                this.field1365[3][3] = 0;
                            } else {
                                this.field1365 = new int[16][4];
                                this.field1365[0][0] = 0;
                                this.field1365[0][3] = 321;
                                this.field1365[0][2] = 192;
                                this.field1365[0][1] = 80;
                                this.field1365[1][0] = 155;
                                this.field1365[1][2] = 449;
                                this.field1365[1][3] = 562;
                                this.field1365[1][1] = 321;
                                this.field1365[2][0] = 389;
                                this.field1365[2][3] = 803;
                                this.field1365[2][1] = 578;
                                this.field1365[2][2] = 690;
                                this.field1365[3][1] = 947;
                                this.field1365[3][3] = 1140;
                                this.field1365[3][0] = 671;
                                this.field1365[3][2] = 995;
                                this.field1365[4][1] = 1285;
                                this.field1365[4][3] = 1509;
                                this.field1365[4][2] = 1397;
                                this.field1365[4][0] = 897;
                                this.field1365[5][2] = 1429;
                                this.field1365[5][3] = 1413;
                                this.field1365[5][0] = 1175;
                                this.field1365[5][1] = 1525;
                                this.field1365[6][0] = 1368;
                                this.field1365[6][2] = 1461;
                                this.field1365[6][1] = 1734;
                                this.field1365[6][3] = 1333;
                                this.field1365[7][2] = 1525;
                                this.field1365[7][1] = 1413;
                                this.field1365[7][0] = 1507;
                                this.field1365[7][3] = 1702;
                                this.field1365[8][3] = 2056;
                                this.field1365[8][1] = 1108;
                                this.field1365[8][2] = 1590;
                                this.field1365[8][0] = 1736;
                                this.field1365[9][2] = 2056;
                                this.field1365[9][3] = 2666;
                                this.field1365[9][0] = 2088;
                                this.field1365[9][1] = 1766;
                                this.field1365[10][0] = 2355;
                                this.field1365[10][2] = 2586;
                                this.field1365[10][1] = 2409;
                                this.field1365[10][3] = 3276;
                                this.field1365[11][2] = 3148;
                                this.field1365[11][3] = 3228;
                                this.field1365[11][1] = 3116;
                                this.field1365[11][0] = 2691;
                                this.field1365[12][3] = 3196;
                                this.field1365[12][0] = 3031;
                                this.field1365[12][1] = 3806;
                                this.field1365[12][2] = 3710;
                                this.field1365[13][3] = 3019;
                                this.field1365[13][1] = 3437;
                                this.field1365[13][2] = 3421;
                                this.field1365[13][0] = 3522;
                                this.field1365[14][1] = 3116;
                                this.field1365[14][2] = 3148;
                                this.field1365[14][3] = 3228;
                                this.field1365[14][0] = 3727;
                                this.field1365[15][2] = 2505;
                                this.field1365[15][3] = 2746;
                                this.field1365[15][1] = 2377;
                                this.field1365[15][0] = 4096;
                            }
                        } else {
                            this.field1365 = new int[6][4];
                            this.field1365[0][2] = 0;
                            this.field1365[0][1] = 0;
                            this.field1365[0][3] = 0;
                            this.field1365[0][0] = 0;
                            this.field1365[1][3] = 1493;
                            this.field1365[1][1] = 0;
                            this.field1365[1][2] = 0;
                            this.field1365[1][0] = 1843;
                            this.field1365[2][3] = 2939;
                            this.field1365[2][2] = 0;
                            this.field1365[2][1] = 0;
                            this.field1365[2][0] = 2457;
                            this.field1365[3][3] = 3565;
                            this.field1365[3][1] = 0;
                            this.field1365[3][2] = 1124;
                            this.field1365[3][0] = 2781;
                            this.field1365[4][2] = 3084;
                            this.field1365[4][0] = 3481;
                            this.field1365[4][1] = 546;
                            this.field1365[4][3] = 4031;
                            this.field1365[5][0] = 4096;
                            this.field1365[5][3] = 4096;
                            this.field1365[5][2] = 4096;
                            this.field1365[5][1] = 4096;
                        }
                    } else {
                        this.field1365 = new int[7][4];
                        this.field1365[0][0] = 0;
                        this.field1365[0][1] = 0;
                        this.field1365[0][2] = 0;
                        this.field1365[0][3] = 4096;
                        this.field1365[1][3] = 4096;
                        this.field1365[1][1] = 0;
                        this.field1365[1][0] = 663;
                        this.field1365[1][2] = 4096;
                        this.field1365[2][0] = 1363;
                        this.field1365[2][2] = 4096;
                        this.field1365[2][1] = 0;
                        this.field1365[2][3] = 0;
                        this.field1365[3][0] = 2048;
                        this.field1365[3][2] = 4096;
                        this.field1365[3][3] = 0;
                        this.field1365[3][1] = 4096;
                        this.field1365[4][0] = 2727;
                        this.field1365[4][1] = 4096;
                        this.field1365[4][2] = 0;
                        this.field1365[4][3] = 0;
                        this.field1365[5][0] = 3411;
                        this.field1365[5][3] = 4096;
                        this.field1365[5][2] = 0;
                        this.field1365[5][1] = 4096;
                        this.field1365[6][2] = 0;
                        this.field1365[6][3] = 4096;
                        this.field1365[6][0] = 4096;
                        this.field1365[6][1] = 0;
                    }
                } else {
                    this.field1365 = new int[8][4];
                    this.field1365[0][3] = 2361;
                    this.field1365[0][1] = 2650;
                    this.field1365[0][0] = 0;
                    this.field1365[0][2] = 2602;
                    this.field1365[1][2] = 1799;
                    this.field1365[1][1] = 2313;
                    this.field1365[1][3] = 1558;
                    this.field1365[1][0] = 2867;
                    this.field1365[2][2] = 1734;
                    this.field1365[2][1] = 2618;
                    this.field1365[2][3] = 1413;
                    this.field1365[2][0] = 3072;
                    this.field1365[3][2] = 1220;
                    this.field1365[3][0] = 3276;
                    this.field1365[3][3] = 947;
                    this.field1365[3][1] = 2296;
                    this.field1365[4][2] = 963;
                    this.field1365[4][3] = 722;
                    this.field1365[4][0] = 3481;
                    this.field1365[4][1] = 2072;
                    this.field1365[5][3] = 1766;
                    this.field1365[5][2] = 2152;
                    this.field1365[5][0] = 3686;
                    this.field1365[5][1] = 2730;
                    this.field1365[6][2] = 1060;
                    this.field1365[6][0] = 3891;
                    this.field1365[6][1] = 2232;
                    this.field1365[6][3] = 915;
                    this.field1365[7][2] = 1413;
                    this.field1365[7][3] = 1140;
                    this.field1365[7][1] = 1686;
                    this.field1365[7][0] = 4096;
                }
            } else {
                this.field1365 = new int[2][4];
                this.field1365[0][1] = 0;
                this.field1365[0][2] = 0;
                this.field1365[0][0] = 0;
                this.field1365[0][3] = 0;
                this.field1365[1][3] = 4096;
                this.field1365[1][2] = 4096;
                this.field1365[1][1] = 4096;
                this.field1365[1][0] = 4096;
            }
        }
        if (arg1 > -95) {
            field1371 = -61;
        }
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V")
    private final void method713(int arg0) {
        ++field1362;
        if (arg0 != -29547) {
            method709(-28, false);
        }
        int var2 = this.field1365.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field1365[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field1365[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1365[var4];
                    if (~var4 >= -1) {
                        var8 = var11[1];
                        var10 = var11[3];
                        var9 = var11[2];
                    } else {
                        int[] var12 = this.field1365[var4 + -1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                int var17 = var10 >> 4;
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
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field1370[var3] = class418.method2577(var17, class418.method2577(var16 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }
}
