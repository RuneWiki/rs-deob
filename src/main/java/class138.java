import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class138 extends class115 {

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "[I")
    private int[] field2440 = new int[257];

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "[I")
    public static int[] field2429 = new int[64];

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "[Z")
    public static boolean[] field2432 = new boolean[5];

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lqe;")
    public static class168 field2427 = class66.method448(")2", 90);

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "[I")
    public static int[] field2439 = new int[200];

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "Lqe;")
    public static class168 field2436 = class66.method448(")4a=", -111);

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "Lic;")
    public static class43 field2435;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "[[I")
    private int[][] field2430;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public static void method944(byte arg0) {
        field2436 = null;
        field2432 = null;
        field2439 = null;
        field2429 = null;
        field2435 = null;
        field2427 = null;
        if (arg0 != -25) {
            method944((byte) 99);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 < 11) {
            method948(84, -121, (class256) null);
        }
        int[][] var3 = super.field1882.method1242(arg0, 45);
        ++field2434;
        if (super.field1882.field3344) {
            int[] var4 = this.method792(0, 0, arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class130.field2297; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field2440[var9];
                var6[var8] = class86.method571(4080, var10 >> 12);
                var5[var8] = class86.method571(var10, 65280) >> 4;
                var7[var8] = class86.method571(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (this.field2430 == null) {
            this.method949(1, arg0 ^ 395462999);
        }
        this.method946((byte) -49);
        if (arg0 == 395462996) {
            ++field2431;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)I")
    public static final int method945(int arg0, int arg1, boolean arg2) {
        ++field2441;
        long var3 = (long) ((arg1 << 16) + arg0);
        if (class159.field2744 != null && class159.field2744.field3308 == var3) {
            if (arg2) {
                method948(-109, 17, (class256) null);
            }
            return 1 - -(class112.field1843.field1821 * 99 / (class112.field1843.field1780.length - class159.field2744.field3284));
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            method947((byte) -115, (class203) null);
        }
        ++field2428;
        if (arg2 == 0) {
            int var4 = arg1.method758(true);
            if (~var4 != -1) {
                this.method949(var4, 3);
            } else {
                this.field2430 = new int[arg1.method758(true)][4];
                for (int var5 = 0; var5 < this.field2430.length; ++var5) {
                    this.field2430[var5][0] = arg1.method731(false);
                    this.field2430[var5][1] = arg1.method758(true) << 4;
                    this.field2430[var5][2] = arg1.method758(true) << 4;
                    this.field2430[var5][3] = arg1.method758(true) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    private final void method946(byte arg0) {
        ++field2442;
        if (arg0 > -4) {
            field2432 = null;
        }
        int var2 = this.field2430.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && ~this.field2430[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field2430[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field2430[var4 + -1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                    } else {
                        var11 = var7[2];
                        var13 = var7[1];
                        var12 = var7[3];
                    }
                } else {
                    int[] var14 = this.field2430[var2 + -1];
                    var12 = var14[3];
                    var11 = var14[2];
                    var13 = var14[1];
                }
                int var15 = var12 >> 4;
                int var16 = var11 >> 4;
                int var17 = var13 >> 4;
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field2440[var3] = class102.method675(var15, class102.method675(var17 << 16, var16 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLlc;)V")
    public static final void method947(byte arg0, class203 arg1) {
        arg1.field3532 = false;
        ++field2438;
        if (arg1.field3535 != null) {
            arg1.field3535.field549 = 0;
        }
        if (arg0 != -112) {
            method945(-31, -111, true);
        }
        for (class203 var2 = arg1.method135(); var2 != null; var2 = arg1.method150()) {
            method947((byte) -112, var2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILoe;)Ldg;")
    public static final class244 method948(int arg0, int arg1, class256 arg2) {
        int var3 = 69 / ((23 - arg0) / 61);
        byte[] var4 = arg2.method1700(104, arg1);
        ++field2433;
        return var4 == null ? null : new class244(var4);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)V")
    private final void method949(int arg0, int arg1) {
        ++field2437;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2430 = new int[4][4];
                                this.field2430[0][1] = 0;
                                this.field2430[1][1] = 4096;
                                this.field2430[0][0] = 2048;
                                this.field2430[2][1] = 4096;
                                this.field2430[3][1] = 4096;
                                this.field2430[0][2] = 4096;
                                this.field2430[0][3] = 0;
                                this.field2430[1][0] = 2867;
                                this.field2430[2][0] = 3276;
                                this.field2430[3][0] = 4096;
                                this.field2430[1][2] = 4096;
                                this.field2430[1][3] = 0;
                                this.field2430[2][3] = 0;
                                this.field2430[3][3] = 0;
                                this.field2430[2][2] = 4096;
                                this.field2430[3][2] = 0;
                            } else {
                                this.field2430 = new int[16][4];
                                this.field2430[0][2] = 192;
                                this.field2430[1][2] = 449;
                                this.field2430[0][1] = 80;
                                this.field2430[0][3] = 321;
                                this.field2430[2][2] = 690;
                                this.field2430[1][1] = 321;
                                this.field2430[3][2] = 995;
                                this.field2430[0][0] = 0;
                                this.field2430[1][0] = 155;
                                this.field2430[2][1] = 578;
                                this.field2430[2][0] = 389;
                                this.field2430[3][1] = 947;
                                this.field2430[4][2] = 1397;
                                this.field2430[5][2] = 1429;
                                this.field2430[6][2] = 1461;
                                this.field2430[1][3] = 562;
                                this.field2430[4][1] = 1285;
                                this.field2430[5][1] = 1525;
                                this.field2430[2][3] = 803;
                                this.field2430[3][3] = 1140;
                                this.field2430[6][1] = 1734;
                                this.field2430[7][1] = 1413;
                                this.field2430[7][2] = 1525;
                                this.field2430[8][2] = 1590;
                                this.field2430[3][0] = 671;
                                this.field2430[4][3] = 1509;
                                this.field2430[8][1] = 1108;
                                this.field2430[4][0] = 897;
                                this.field2430[9][2] = 2056;
                                this.field2430[9][1] = 1766;
                                this.field2430[5][0] = 1175;
                                this.field2430[10][2] = 2586;
                                this.field2430[11][2] = 3148;
                                this.field2430[10][1] = 2409;
                                this.field2430[6][0] = 1368;
                                this.field2430[12][2] = 3710;
                                this.field2430[7][0] = 1507;
                                this.field2430[8][0] = 1736;
                                this.field2430[11][1] = 3116;
                                this.field2430[13][2] = 3421;
                                this.field2430[5][3] = 1413;
                                this.field2430[9][0] = 2088;
                                this.field2430[12][1] = 3806;
                                this.field2430[10][0] = 2355;
                                this.field2430[14][2] = 3148;
                                this.field2430[6][3] = 1333;
                                this.field2430[7][3] = 1702;
                                this.field2430[8][3] = 2056;
                                this.field2430[13][1] = 3437;
                                this.field2430[11][0] = 2691;
                                this.field2430[9][3] = 2666;
                                this.field2430[10][3] = 3276;
                                this.field2430[12][0] = 3031;
                                this.field2430[14][1] = 3116;
                                this.field2430[13][0] = 3522;
                                this.field2430[15][1] = 2377;
                                this.field2430[11][3] = 3228;
                                this.field2430[14][0] = 3727;
                                this.field2430[15][2] = 2505;
                                this.field2430[12][3] = 3196;
                                this.field2430[15][0] = 4096;
                                this.field2430[13][3] = 3019;
                                this.field2430[14][3] = 3228;
                                this.field2430[15][3] = 2746;
                            }
                        } else {
                            this.field2430 = new int[6][4];
                            this.field2430[0][0] = 0;
                            this.field2430[1][0] = 1843;
                            this.field2430[0][3] = 0;
                            this.field2430[2][0] = 2457;
                            this.field2430[0][2] = 0;
                            this.field2430[1][3] = 1493;
                            this.field2430[1][2] = 0;
                            this.field2430[2][3] = 2939;
                            this.field2430[0][1] = 0;
                            this.field2430[1][1] = 0;
                            this.field2430[3][0] = 2781;
                            this.field2430[4][0] = 3481;
                            this.field2430[5][0] = 4096;
                            this.field2430[2][1] = 0;
                            this.field2430[3][3] = 3565;
                            this.field2430[3][1] = 0;
                            this.field2430[2][2] = 0;
                            this.field2430[4][1] = 546;
                            this.field2430[4][3] = 4031;
                            this.field2430[5][1] = 4096;
                            this.field2430[3][2] = 1124;
                            this.field2430[5][3] = 4096;
                            this.field2430[4][2] = 3084;
                            this.field2430[5][2] = 4096;
                        }
                    } else {
                        this.field2430 = new int[7][4];
                        this.field2430[0][0] = 0;
                        this.field2430[1][0] = 663;
                        this.field2430[0][2] = 0;
                        this.field2430[0][3] = 4096;
                        this.field2430[1][2] = 4096;
                        this.field2430[0][1] = 0;
                        this.field2430[1][1] = 0;
                        this.field2430[2][0] = 1363;
                        this.field2430[2][1] = 0;
                        this.field2430[3][0] = 2048;
                        this.field2430[1][3] = 4096;
                        this.field2430[2][3] = 0;
                        this.field2430[3][3] = 0;
                        this.field2430[2][2] = 4096;
                        this.field2430[4][0] = 2727;
                        this.field2430[3][2] = 4096;
                        this.field2430[4][2] = 0;
                        this.field2430[5][0] = 3411;
                        this.field2430[5][2] = 0;
                        this.field2430[3][1] = 4096;
                        this.field2430[4][1] = 4096;
                        this.field2430[6][2] = 0;
                        this.field2430[5][1] = 4096;
                        this.field2430[6][1] = 0;
                        this.field2430[4][3] = 0;
                        this.field2430[5][3] = 4096;
                        this.field2430[6][3] = 4096;
                        this.field2430[6][0] = 4096;
                    }
                } else {
                    this.field2430 = new int[8][4];
                    this.field2430[0][1] = 2650;
                    this.field2430[0][2] = 2602;
                    this.field2430[1][1] = 2313;
                    this.field2430[2][1] = 2618;
                    this.field2430[0][0] = 0;
                    this.field2430[1][0] = 2867;
                    this.field2430[0][3] = 2361;
                    this.field2430[2][0] = 3072;
                    this.field2430[1][2] = 1799;
                    this.field2430[3][0] = 3276;
                    this.field2430[1][3] = 1558;
                    this.field2430[4][0] = 3481;
                    this.field2430[3][1] = 2296;
                    this.field2430[5][0] = 3686;
                    this.field2430[4][1] = 2072;
                    this.field2430[2][2] = 1734;
                    this.field2430[5][1] = 2730;
                    this.field2430[3][2] = 1220;
                    this.field2430[6][1] = 2232;
                    this.field2430[4][2] = 963;
                    this.field2430[2][3] = 1413;
                    this.field2430[3][3] = 947;
                    this.field2430[7][1] = 1686;
                    this.field2430[4][3] = 722;
                    this.field2430[5][2] = 2152;
                    this.field2430[5][3] = 1766;
                    this.field2430[6][0] = 3891;
                    this.field2430[7][0] = 4096;
                    this.field2430[6][3] = 915;
                    this.field2430[6][2] = 1060;
                    this.field2430[7][2] = 1413;
                    this.field2430[7][3] = 1140;
                }
            } else {
                this.field2430 = new int[2][4];
                this.field2430[0][3] = 0;
                this.field2430[0][0] = 0;
                this.field2430[1][3] = 4096;
                this.field2430[0][2] = 0;
                this.field2430[1][0] = 4096;
                this.field2430[1][2] = 4096;
                this.field2430[0][1] = 0;
                this.field2430[1][1] = 4096;
            }
        }
        if (arg1 != 3) {
            this.method3((byte) -50, (class112) null, 52);
        }
    }
}
