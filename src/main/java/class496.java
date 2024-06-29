import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class496 extends class305 {

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "[I")
    private int[] field7241 = new int[257];

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "[[I")
    private int[][] field7249;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    private final void method2971(boolean arg0) {
        ++field7248;
        if (!arg0) {
            this.field7249 = null;
        }
        int var2 = this.field7249.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field7249[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 > ~var2) {
                    int[] var7 = this.field7249[var4];
                    if (~var4 >= -1) {
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field7249[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field7249[var2 + -1];
                    var10 = var14[3];
                    var8 = var14[1];
                    var9 = var14[2];
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field7241[var3] = class19.method118(var15, class19.method118(var16 << 16, var17 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZII)V")
    public static final void method2972(boolean arg0, int arg1, int arg2) {
        class240.field3593 = arg1 - class362.field5345;
        class357.field5290 = -class362.field5350 + arg2;
        if (arg0) {
            ++field7246;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    private final void method2973(int arg0, int arg1) {
        ++field7244;
        if (arg0 != 21493) {
            this.field7241 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field7249 = new int[4][4];
                                    this.field7249[0][0] = 2048;
                                    this.field7249[0][2] = 4096;
                                    this.field7249[0][1] = 0;
                                    this.field7249[0][3] = 0;
                                    this.field7249[1][2] = 4096;
                                    this.field7249[1][1] = 4096;
                                    this.field7249[1][0] = 2867;
                                    this.field7249[1][3] = 0;
                                    this.field7249[2][3] = 0;
                                    this.field7249[2][2] = 4096;
                                    this.field7249[2][0] = 3276;
                                    this.field7249[2][1] = 4096;
                                    this.field7249[3][2] = 0;
                                    this.field7249[3][3] = 0;
                                    this.field7249[3][0] = 4096;
                                    this.field7249[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field7249 = new int[16][4];
                                this.field7249[0][0] = 0;
                                this.field7249[0][1] = 80;
                                this.field7249[0][3] = 321;
                                this.field7249[0][2] = 192;
                                this.field7249[1][2] = 449;
                                this.field7249[1][0] = 155;
                                this.field7249[1][1] = 321;
                                this.field7249[1][3] = 562;
                                this.field7249[2][3] = 803;
                                this.field7249[2][2] = 690;
                                this.field7249[2][0] = 389;
                                this.field7249[2][1] = 578;
                                this.field7249[3][3] = 1140;
                                this.field7249[3][1] = 947;
                                this.field7249[3][2] = 995;
                                this.field7249[3][0] = 671;
                                this.field7249[4][3] = 1509;
                                this.field7249[4][1] = 1285;
                                this.field7249[4][2] = 1397;
                                this.field7249[4][0] = 897;
                                this.field7249[5][3] = 1413;
                                this.field7249[5][0] = 1175;
                                this.field7249[5][1] = 1525;
                                this.field7249[5][2] = 1429;
                                this.field7249[6][0] = 1368;
                                this.field7249[6][1] = 1734;
                                this.field7249[6][2] = 1461;
                                this.field7249[6][3] = 1333;
                                this.field7249[7][0] = 1507;
                                this.field7249[7][1] = 1413;
                                this.field7249[7][3] = 1702;
                                this.field7249[7][2] = 1525;
                                this.field7249[8][3] = 2056;
                                this.field7249[8][2] = 1590;
                                this.field7249[8][1] = 1108;
                                this.field7249[8][0] = 1736;
                                this.field7249[9][3] = 2666;
                                this.field7249[9][0] = 2088;
                                this.field7249[9][1] = 1766;
                                this.field7249[9][2] = 2056;
                                this.field7249[10][1] = 2409;
                                this.field7249[10][2] = 2586;
                                this.field7249[10][3] = 3276;
                                this.field7249[10][0] = 2355;
                                this.field7249[11][1] = 3116;
                                this.field7249[11][0] = 2691;
                                this.field7249[11][3] = 3228;
                                this.field7249[11][2] = 3148;
                                this.field7249[12][0] = 3031;
                                this.field7249[12][3] = 3196;
                                this.field7249[12][1] = 3806;
                                this.field7249[12][2] = 3710;
                                this.field7249[13][1] = 3437;
                                this.field7249[13][3] = 3019;
                                this.field7249[13][2] = 3421;
                                this.field7249[13][0] = 3522;
                                this.field7249[14][1] = 3116;
                                this.field7249[14][3] = 3228;
                                this.field7249[14][0] = 3727;
                                this.field7249[14][2] = 3148;
                                this.field7249[15][3] = 2746;
                                this.field7249[15][2] = 2505;
                                this.field7249[15][0] = 4096;
                                this.field7249[15][1] = 2377;
                            }
                        } else {
                            this.field7249 = new int[6][4];
                            this.field7249[0][2] = 0;
                            this.field7249[0][3] = 0;
                            this.field7249[0][0] = 0;
                            this.field7249[0][1] = 0;
                            this.field7249[1][0] = 1843;
                            this.field7249[1][1] = 0;
                            this.field7249[1][2] = 0;
                            this.field7249[1][3] = 1493;
                            this.field7249[2][3] = 2939;
                            this.field7249[2][0] = 2457;
                            this.field7249[2][2] = 0;
                            this.field7249[2][1] = 0;
                            this.field7249[3][0] = 2781;
                            this.field7249[3][1] = 0;
                            this.field7249[3][3] = 3565;
                            this.field7249[3][2] = 1124;
                            this.field7249[4][0] = 3481;
                            this.field7249[4][1] = 546;
                            this.field7249[4][3] = 4031;
                            this.field7249[4][2] = 3084;
                            this.field7249[5][2] = 4096;
                            this.field7249[5][0] = 4096;
                            this.field7249[5][3] = 4096;
                            this.field7249[5][1] = 4096;
                        }
                    } else {
                        this.field7249 = new int[7][4];
                        this.field7249[0][0] = 0;
                        this.field7249[0][1] = 0;
                        this.field7249[0][2] = 0;
                        this.field7249[0][3] = 4096;
                        this.field7249[1][0] = 663;
                        this.field7249[1][2] = 4096;
                        this.field7249[1][3] = 4096;
                        this.field7249[1][1] = 0;
                        this.field7249[2][0] = 1363;
                        this.field7249[2][1] = 0;
                        this.field7249[2][2] = 4096;
                        this.field7249[2][3] = 0;
                        this.field7249[3][1] = 4096;
                        this.field7249[3][0] = 2048;
                        this.field7249[3][3] = 0;
                        this.field7249[3][2] = 4096;
                        this.field7249[4][0] = 2727;
                        this.field7249[4][1] = 4096;
                        this.field7249[4][2] = 0;
                        this.field7249[4][3] = 0;
                        this.field7249[5][0] = 3411;
                        this.field7249[5][2] = 0;
                        this.field7249[5][3] = 4096;
                        this.field7249[5][1] = 4096;
                        this.field7249[6][2] = 0;
                        this.field7249[6][0] = 4096;
                        this.field7249[6][1] = 0;
                        this.field7249[6][3] = 4096;
                    }
                } else {
                    this.field7249 = new int[8][4];
                    this.field7249[0][3] = 2361;
                    this.field7249[0][1] = 2650;
                    this.field7249[0][0] = 0;
                    this.field7249[0][2] = 2602;
                    this.field7249[1][1] = 2313;
                    this.field7249[1][0] = 2867;
                    this.field7249[1][2] = 1799;
                    this.field7249[1][3] = 1558;
                    this.field7249[2][2] = 1734;
                    this.field7249[2][0] = 3072;
                    this.field7249[2][3] = 1413;
                    this.field7249[2][1] = 2618;
                    this.field7249[3][2] = 1220;
                    this.field7249[3][3] = 947;
                    this.field7249[3][1] = 2296;
                    this.field7249[3][0] = 3276;
                    this.field7249[4][3] = 722;
                    this.field7249[4][1] = 2072;
                    this.field7249[4][2] = 963;
                    this.field7249[4][0] = 3481;
                    this.field7249[5][3] = 1766;
                    this.field7249[5][2] = 2152;
                    this.field7249[5][1] = 2730;
                    this.field7249[5][0] = 3686;
                    this.field7249[6][3] = 915;
                    this.field7249[6][2] = 1060;
                    this.field7249[6][0] = 3891;
                    this.field7249[6][1] = 2232;
                    this.field7249[7][3] = 1140;
                    this.field7249[7][0] = 4096;
                    this.field7249[7][1] = 1686;
                    this.field7249[7][2] = 1413;
                }
            } else {
                this.field7249 = new int[2][4];
                this.field7249[0][0] = 0;
                this.field7249[0][3] = 0;
                this.field7249[0][2] = 0;
                this.field7249[0][1] = 0;
                this.field7249[1][3] = 4096;
                this.field7249[1][2] = 4096;
                this.field7249[1][1] = 4096;
                this.field7249[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        ++field7242;
        if (this.field7249 == null) {
            this.method2973(21493, 1);
        }
        if (arg0 != -62) {
            this.field7241 = null;
        }
        this.method2971(true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field7245;
        if (arg2 < 76) {
            method2975((byte) 14);
        }
        if (arg0 == 0) {
            int var4 = arg1.method1337((byte) 73);
            if (~var4 != -1) {
                this.method2973(21493, var4);
            } else {
                this.field7249 = new int[arg1.method1337((byte) 91)][4];
                for (int var5 = 0; var5 < this.field7249.length; ++var5) {
                    this.field7249[var5][0] = arg1.method1396(-117);
                    this.field7249[var5][1] = arg1.method1337((byte) 5) << 4;
                    this.field7249[var5][2] = arg1.method1337((byte) -2) << 4;
                    this.field7249[var5][3] = arg1.method1337((byte) 51) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class496() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2974(int arg0, String arg1, boolean arg2) {
        ++field7243;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg0;
        int var6 = !arg2 ? 0 : 32768;
        int var7 = var6 - -(arg2 ? class376.field5554.field2259 : class376.field5554.field2267);
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class133 var11 = class376.field5554.method1083(1, var8);
            if (var11.field1962 && var11.method976(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class6.field75 = null;
                    class132.field1947 = -1;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var5 < ~var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class6.field75 = var4;
        class132.field1947 = var5;
        class186.field2860 = 0;
        String[] var9 = new String[class132.field1947];
        for (int var10 = 0; ~class132.field1947 < ~var10; ++var10) {
            var9[var10] = class376.field5554.method1083(1, var4[var10]).method976(class232.method1566(arg0, 0));
        }
        class252.method1794(var9, class6.field75, 1);
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V")
    public static final void method2975(byte arg0) {
        class195.field3060 = false;
        ++field7247;
        if (arg0 != -43) {
            method2975((byte) 40);
        }
        class480.field7051 = null;
        class80.method713(-14703);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field7240;
        if (arg1 > -59) {
            method2972(false, -4, -44);
        }
        int[][] var3 = super.field4674.method2206(-97, arg0);
        if (super.field4674.field5110) {
            int[] var4 = this.method2021(0, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class91.field1471; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7241[var9];
                var5[var8] = class307.method2028(var10, 16711680) >> 12;
                var6[var8] = class307.method2028(65280, var10) >> 4;
                var7[var8] = class307.method2028(var10, 255) << 4;
            }
        }
        return var3;
    }
}
