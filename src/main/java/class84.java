import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class84 extends class80 {

    @OriginalMember(owner = "client!di", name = "M", descriptor = "[I")
    private int[] field1740 = new int[257];

    @OriginalMember(owner = "client!di", name = "R", descriptor = "Z")
    public static boolean field1745 = false;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "[[I")
    private int[][] field1738;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V", line = 8)
    private final void method785(int arg0, byte arg1) {
        ++field1737;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1738 = new int[4][4];
                                this.field1738[0][2] = 4096;
                                this.field1738[0][3] = 0;
                                this.field1738[0][0] = 2048;
                                this.field1738[0][1] = 0;
                                this.field1738[1][1] = 4096;
                                this.field1738[1][3] = 0;
                                this.field1738[1][0] = 2867;
                                this.field1738[1][2] = 4096;
                                this.field1738[2][1] = 4096;
                                this.field1738[2][0] = 3276;
                                this.field1738[2][2] = 4096;
                                this.field1738[2][3] = 0;
                                this.field1738[3][2] = 0;
                                this.field1738[3][0] = 4096;
                                this.field1738[3][1] = 4096;
                                this.field1738[3][3] = 0;
                            } else {
                                this.field1738 = new int[16][4];
                                this.field1738[0][1] = 80;
                                this.field1738[0][0] = 0;
                                this.field1738[0][3] = 321;
                                this.field1738[0][2] = 192;
                                this.field1738[1][3] = 562;
                                this.field1738[1][1] = 321;
                                this.field1738[1][0] = 155;
                                this.field1738[1][2] = 449;
                                this.field1738[2][0] = 389;
                                this.field1738[2][2] = 690;
                                this.field1738[2][3] = 803;
                                this.field1738[2][1] = 578;
                                this.field1738[3][3] = 1140;
                                this.field1738[3][1] = 947;
                                this.field1738[3][2] = 995;
                                this.field1738[3][0] = 671;
                                this.field1738[4][1] = 1285;
                                this.field1738[4][2] = 1397;
                                this.field1738[4][3] = 1509;
                                this.field1738[4][0] = 897;
                                this.field1738[5][3] = 1413;
                                this.field1738[5][2] = 1429;
                                this.field1738[5][1] = 1525;
                                this.field1738[5][0] = 1175;
                                this.field1738[6][2] = 1461;
                                this.field1738[6][3] = 1333;
                                this.field1738[6][1] = 1734;
                                this.field1738[6][0] = 1368;
                                this.field1738[7][1] = 1413;
                                this.field1738[7][0] = 1507;
                                this.field1738[7][3] = 1702;
                                this.field1738[7][2] = 1525;
                                this.field1738[8][1] = 1108;
                                this.field1738[8][3] = 2056;
                                this.field1738[8][0] = 1736;
                                this.field1738[8][2] = 1590;
                                this.field1738[9][1] = 1766;
                                this.field1738[9][3] = 2666;
                                this.field1738[9][0] = 2088;
                                this.field1738[9][2] = 2056;
                                this.field1738[10][0] = 2355;
                                this.field1738[10][3] = 3276;
                                this.field1738[10][2] = 2586;
                                this.field1738[10][1] = 2409;
                                this.field1738[11][3] = 3228;
                                this.field1738[11][1] = 3116;
                                this.field1738[11][2] = 3148;
                                this.field1738[11][0] = 2691;
                                this.field1738[12][0] = 3031;
                                this.field1738[12][3] = 3196;
                                this.field1738[12][2] = 3710;
                                this.field1738[12][1] = 3806;
                                this.field1738[13][2] = 3421;
                                this.field1738[13][1] = 3437;
                                this.field1738[13][3] = 3019;
                                this.field1738[13][0] = 3522;
                                this.field1738[14][2] = 3148;
                                this.field1738[14][1] = 3116;
                                this.field1738[14][0] = 3727;
                                this.field1738[14][3] = 3228;
                                this.field1738[15][1] = 2377;
                                this.field1738[15][0] = 4096;
                                this.field1738[15][3] = 2746;
                                this.field1738[15][2] = 2505;
                            }
                        } else {
                            this.field1738 = new int[6][4];
                            this.field1738[0][0] = 0;
                            this.field1738[0][2] = 0;
                            this.field1738[0][3] = 0;
                            this.field1738[0][1] = 0;
                            this.field1738[1][2] = 0;
                            this.field1738[1][1] = 0;
                            this.field1738[1][0] = 1843;
                            this.field1738[1][3] = 1493;
                            this.field1738[2][3] = 2939;
                            this.field1738[2][1] = 0;
                            this.field1738[2][0] = 2457;
                            this.field1738[2][2] = 0;
                            this.field1738[3][2] = 1124;
                            this.field1738[3][0] = 2781;
                            this.field1738[3][1] = 0;
                            this.field1738[3][3] = 3565;
                            this.field1738[4][2] = 3084;
                            this.field1738[4][0] = 3481;
                            this.field1738[4][3] = 4031;
                            this.field1738[4][1] = 546;
                            this.field1738[5][2] = 4096;
                            this.field1738[5][1] = 4096;
                            this.field1738[5][3] = 4096;
                            this.field1738[5][0] = 4096;
                        }
                    } else {
                        this.field1738 = new int[7][4];
                        this.field1738[0][3] = 4096;
                        this.field1738[0][2] = 0;
                        this.field1738[0][1] = 0;
                        this.field1738[0][0] = 0;
                        this.field1738[1][2] = 4096;
                        this.field1738[1][3] = 4096;
                        this.field1738[1][0] = 663;
                        this.field1738[1][1] = 0;
                        this.field1738[2][1] = 0;
                        this.field1738[2][3] = 0;
                        this.field1738[2][2] = 4096;
                        this.field1738[2][0] = 1363;
                        this.field1738[3][3] = 0;
                        this.field1738[3][1] = 4096;
                        this.field1738[3][2] = 4096;
                        this.field1738[3][0] = 2048;
                        this.field1738[4][3] = 0;
                        this.field1738[4][1] = 4096;
                        this.field1738[4][0] = 2727;
                        this.field1738[4][2] = 0;
                        this.field1738[5][3] = 4096;
                        this.field1738[5][0] = 3411;
                        this.field1738[5][1] = 4096;
                        this.field1738[5][2] = 0;
                        this.field1738[6][2] = 0;
                        this.field1738[6][3] = 4096;
                        this.field1738[6][1] = 0;
                        this.field1738[6][0] = 4096;
                    }
                } else {
                    this.field1738 = new int[8][4];
                    this.field1738[0][2] = 2602;
                    this.field1738[0][3] = 2361;
                    this.field1738[0][1] = 2650;
                    this.field1738[0][0] = 0;
                    this.field1738[1][2] = 1799;
                    this.field1738[1][3] = 1558;
                    this.field1738[1][1] = 2313;
                    this.field1738[1][0] = 2867;
                    this.field1738[2][2] = 1734;
                    this.field1738[2][0] = 3072;
                    this.field1738[2][3] = 1413;
                    this.field1738[2][1] = 2618;
                    this.field1738[3][1] = 2296;
                    this.field1738[3][0] = 3276;
                    this.field1738[3][2] = 1220;
                    this.field1738[3][3] = 947;
                    this.field1738[4][3] = 722;
                    this.field1738[4][2] = 963;
                    this.field1738[4][0] = 3481;
                    this.field1738[4][1] = 2072;
                    this.field1738[5][3] = 1766;
                    this.field1738[5][0] = 3686;
                    this.field1738[5][1] = 2730;
                    this.field1738[5][2] = 2152;
                    this.field1738[6][2] = 1060;
                    this.field1738[6][0] = 3891;
                    this.field1738[6][1] = 2232;
                    this.field1738[6][3] = 915;
                    this.field1738[7][1] = 1686;
                    this.field1738[7][0] = 4096;
                    this.field1738[7][3] = 1140;
                    this.field1738[7][2] = 1413;
                }
            } else {
                this.field1738 = new int[2][4];
                this.field1738[0][3] = 0;
                this.field1738[0][0] = 0;
                this.field1738[0][1] = 0;
                this.field1738[0][2] = 0;
                this.field1738[1][3] = 4096;
                this.field1738[1][0] = 4096;
                this.field1738[1][1] = 4096;
                this.field1738[1][2] = 4096;
            }
        }
        if (arg1 < 87) {
            this.method23(true);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V", line = 257)
    public final void method23(boolean arg0) {
        ++field1743;
        if (!arg0) {
            field1745 = true;
        }
        if (this.field1738 == null) {
            this.method785(1, (byte) 117);
        }
        this.method787(126);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V", line = 272)
    public static final void method786(byte arg0) {
        class316.field4801 = null;
        class502.field7348 = null;
        class286.field4312 = null;
        ++field1736;
        int var1 = 104 % ((56 - arg0) / 58);
        class34.field525 = false;
        class224.field3505 = null;
        class322.field4923 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILnn;)V", line = 288)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 125 / ((28 - arg1) / 53);
        if (arg0 == 0) {
            int var5 = arg2.method1858(-3256);
            if (~var5 == -1) {
                this.field1738 = new int[arg2.method1858(-3256)][4];
                for (int var6 = 0; var6 < this.field1738.length; ++var6) {
                    this.field1738[var6][0] = arg2.method1841((byte) 1);
                    this.field1738[var6][1] = arg2.method1858(-3256) << 4;
                    this.field1738[var6][2] = arg2.method1858(-3256) << 4;
                    this.field1738[var6][3] = arg2.method1858(-3256) << 4;
                }
            } else {
                this.method785(var5, (byte) 127);
            }
        }
        ++field1739;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 325)
    private final void method787(int arg0) {
        ++field1741;
        int var2 = this.field1738.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && var5 >= this.field1738[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field1738[var4];
                    if (var4 <= 0) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field1738[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] - var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field1738[var2 + -1];
                    var10 = var14[1];
                    var9 = var14[2];
                    var8 = var14[3];
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                int var17 = var10 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field1740[var3] = class418.method2558(class418.method2558(var17 << 16, var15 << 8), var16);
            }
        }
        if (arg0 < 77) {
            this.method29(-93, 68);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)[[I", line = 430)
    public final int[][] method29(int arg0, int arg1) {
        if (arg0 != 255) {
            method786((byte) 96);
        }
        ++field1742;
        int[][] var3 = super.field1589.method859(arg1, arg0 + -129);
        if (super.field1589.field1884) {
            int[] var4 = this.method710(arg1, 0, (byte) 100);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class137.field2308; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1740[var9];
                var5[var8] = class490.method2960(var10, 16711680) >> 12;
                var6[var8] = class490.method2960(var10 >> 4, 4080);
                var7[var8] = class490.method2960(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 492)
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)Z", line = 495)
    public static final boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class478.method2855(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class353.field5216;
                int var7 = arg3 << class353.field5216;
                return class356.method2195(var6 + 1, class520.field7560[arg0].method177(arg1, arg3) + arg5, var7 + 1) && class356.method2195(class19.field312 + var6 - 1, class520.field7560[arg0].method177(arg1 + 1, arg3) + arg5, var7 + 1) && class356.method2195(class19.field312 + var6 - 1, class520.field7560[arg0].method177(arg1 + 1, arg3 + 1) + arg5, class19.field312 + var7 - 1) && class356.method2195(var6 + 1, class520.field7560[arg0].method177(arg1, arg3 + 1) + arg5, class19.field312 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class486.field7165[arg0][var8][var14] == -class374.field5485) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class353.field5216) + 1;
            int var10 = (arg3 << class353.field5216) + 2;
            int var11 = class520.field7560[arg0].method177(arg1, arg3) + arg5;
            if (!class356.method2195(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class353.field5216) - 1;
                if (!class356.method2195(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class353.field5216) - 1;
                    if (!class356.method2195(var9, var11, var13)) {
                        return false;
                    } else if (!class356.method2195(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}
