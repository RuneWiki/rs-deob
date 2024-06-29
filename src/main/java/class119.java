import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class119 extends class739 {

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "[I")
    private int[] field1632 = new int[257];

    @OriginalMember(owner = "client!rea", name = "I", descriptor = "Lmr;")
    public static class611 field1634 = new class611();

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!rea", name = "B", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!rea", name = "K", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!rea", name = "N", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!rea", name = "M", descriptor = "J")
    public static long field1637;

    @OriginalMember(owner = "client!rea", name = "J", descriptor = "Lqt;")
    public static class502 field1635;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "[[I")
    private int[][] field1629;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(III)Z")
    public static final boolean method834(int arg0, int arg1, int arg2) {
        if (arg2 != 28175) {
            return false;
        } else {
            ++field1625;
            return (arg0 & 458752) != 0 | class150.method1089(0, arg1, arg0) || class670.method3822(arg2 + -28176, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)V")
    public static void method835(byte arg0) {
        if (arg0 <= -61) {
            field1635 = null;
            field1634 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method836(byte arg0, String arg1) {
        ++field1626;
        if (arg0 != -80) {
            field1634 = null;
        }
        if (class563.field8155.startsWith("win")) {
            return arg1 + ".dll";
        } else if (!class563.field8155.startsWith("linux")) {
            return class563.field8155.startsWith("mac") ? "lib" + arg1 + ".dylib" : null;
        } else {
            return "lib" + arg1 + ".so";
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V")
    private final void method837(byte arg0, int arg1) {
        ++field1627;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1629 = new int[4][4];
                                this.field1629[0][3] = 0;
                                this.field1629[0][1] = 0;
                                this.field1629[0][0] = 2048;
                                this.field1629[0][2] = 4096;
                                this.field1629[1][3] = 0;
                                this.field1629[1][0] = 2867;
                                this.field1629[1][2] = 4096;
                                this.field1629[1][1] = 4096;
                                this.field1629[2][2] = 4096;
                                this.field1629[2][1] = 4096;
                                this.field1629[2][3] = 0;
                                this.field1629[2][0] = 3276;
                                this.field1629[3][3] = 0;
                                this.field1629[3][2] = 0;
                                this.field1629[3][1] = 4096;
                                this.field1629[3][0] = 4096;
                            } else {
                                this.field1629 = new int[16][4];
                                this.field1629[0][1] = 80;
                                this.field1629[0][2] = 192;
                                this.field1629[0][0] = 0;
                                this.field1629[0][3] = 321;
                                this.field1629[1][1] = 321;
                                this.field1629[1][3] = 562;
                                this.field1629[1][2] = 449;
                                this.field1629[1][0] = 155;
                                this.field1629[2][1] = 578;
                                this.field1629[2][3] = 803;
                                this.field1629[2][2] = 690;
                                this.field1629[2][0] = 389;
                                this.field1629[3][1] = 947;
                                this.field1629[3][2] = 995;
                                this.field1629[3][3] = 1140;
                                this.field1629[3][0] = 671;
                                this.field1629[4][3] = 1509;
                                this.field1629[4][1] = 1285;
                                this.field1629[4][2] = 1397;
                                this.field1629[4][0] = 897;
                                this.field1629[5][3] = 1413;
                                this.field1629[5][2] = 1429;
                                this.field1629[5][1] = 1525;
                                this.field1629[5][0] = 1175;
                                this.field1629[6][1] = 1734;
                                this.field1629[6][3] = 1333;
                                this.field1629[6][2] = 1461;
                                this.field1629[6][0] = 1368;
                                this.field1629[7][3] = 1702;
                                this.field1629[7][1] = 1413;
                                this.field1629[7][2] = 1525;
                                this.field1629[7][0] = 1507;
                                this.field1629[8][2] = 1590;
                                this.field1629[8][1] = 1108;
                                this.field1629[8][3] = 2056;
                                this.field1629[8][0] = 1736;
                                this.field1629[9][0] = 2088;
                                this.field1629[9][3] = 2666;
                                this.field1629[9][1] = 1766;
                                this.field1629[9][2] = 2056;
                                this.field1629[10][1] = 2409;
                                this.field1629[10][3] = 3276;
                                this.field1629[10][2] = 2586;
                                this.field1629[10][0] = 2355;
                                this.field1629[11][2] = 3148;
                                this.field1629[11][0] = 2691;
                                this.field1629[11][3] = 3228;
                                this.field1629[11][1] = 3116;
                                this.field1629[12][1] = 3806;
                                this.field1629[12][2] = 3710;
                                this.field1629[12][3] = 3196;
                                this.field1629[12][0] = 3031;
                                this.field1629[13][0] = 3522;
                                this.field1629[13][1] = 3437;
                                this.field1629[13][2] = 3421;
                                this.field1629[13][3] = 3019;
                                this.field1629[14][1] = 3116;
                                this.field1629[14][2] = 3148;
                                this.field1629[14][3] = 3228;
                                this.field1629[14][0] = 3727;
                                this.field1629[15][0] = 4096;
                                this.field1629[15][3] = 2746;
                                this.field1629[15][1] = 2377;
                                this.field1629[15][2] = 2505;
                            }
                        } else {
                            this.field1629 = new int[6][4];
                            this.field1629[0][0] = 0;
                            this.field1629[0][3] = 0;
                            this.field1629[0][1] = 0;
                            this.field1629[0][2] = 0;
                            this.field1629[1][1] = 0;
                            this.field1629[1][2] = 0;
                            this.field1629[1][0] = 1843;
                            this.field1629[1][3] = 1493;
                            this.field1629[2][2] = 0;
                            this.field1629[2][0] = 2457;
                            this.field1629[2][3] = 2939;
                            this.field1629[2][1] = 0;
                            this.field1629[3][2] = 1124;
                            this.field1629[3][1] = 0;
                            this.field1629[3][3] = 3565;
                            this.field1629[3][0] = 2781;
                            this.field1629[4][3] = 4031;
                            this.field1629[4][1] = 546;
                            this.field1629[4][2] = 3084;
                            this.field1629[4][0] = 3481;
                            this.field1629[5][3] = 4096;
                            this.field1629[5][2] = 4096;
                            this.field1629[5][1] = 4096;
                            this.field1629[5][0] = 4096;
                        }
                    } else {
                        this.field1629 = new int[7][4];
                        this.field1629[0][3] = 4096;
                        this.field1629[0][0] = 0;
                        this.field1629[0][2] = 0;
                        this.field1629[0][1] = 0;
                        this.field1629[1][3] = 4096;
                        this.field1629[1][0] = 663;
                        this.field1629[1][1] = 0;
                        this.field1629[1][2] = 4096;
                        this.field1629[2][3] = 0;
                        this.field1629[2][1] = 0;
                        this.field1629[2][0] = 1363;
                        this.field1629[2][2] = 4096;
                        this.field1629[3][2] = 4096;
                        this.field1629[3][3] = 0;
                        this.field1629[3][0] = 2048;
                        this.field1629[3][1] = 4096;
                        this.field1629[4][1] = 4096;
                        this.field1629[4][0] = 2727;
                        this.field1629[4][3] = 0;
                        this.field1629[4][2] = 0;
                        this.field1629[5][1] = 4096;
                        this.field1629[5][2] = 0;
                        this.field1629[5][3] = 4096;
                        this.field1629[5][0] = 3411;
                        this.field1629[6][0] = 4096;
                        this.field1629[6][1] = 0;
                        this.field1629[6][2] = 0;
                        this.field1629[6][3] = 4096;
                    }
                } else {
                    this.field1629 = new int[8][4];
                    this.field1629[0][2] = 2602;
                    this.field1629[0][1] = 2650;
                    this.field1629[0][0] = 0;
                    this.field1629[0][3] = 2361;
                    this.field1629[1][3] = 1558;
                    this.field1629[1][2] = 1799;
                    this.field1629[1][0] = 2867;
                    this.field1629[1][1] = 2313;
                    this.field1629[2][2] = 1734;
                    this.field1629[2][0] = 3072;
                    this.field1629[2][1] = 2618;
                    this.field1629[2][3] = 1413;
                    this.field1629[3][2] = 1220;
                    this.field1629[3][0] = 3276;
                    this.field1629[3][3] = 947;
                    this.field1629[3][1] = 2296;
                    this.field1629[4][3] = 722;
                    this.field1629[4][1] = 2072;
                    this.field1629[4][0] = 3481;
                    this.field1629[4][2] = 963;
                    this.field1629[5][1] = 2730;
                    this.field1629[5][3] = 1766;
                    this.field1629[5][0] = 3686;
                    this.field1629[5][2] = 2152;
                    this.field1629[6][0] = 3891;
                    this.field1629[6][1] = 2232;
                    this.field1629[6][3] = 915;
                    this.field1629[6][2] = 1060;
                    this.field1629[7][1] = 1686;
                    this.field1629[7][2] = 1413;
                    this.field1629[7][0] = 4096;
                    this.field1629[7][3] = 1140;
                }
            } else {
                this.field1629 = new int[2][4];
                this.field1629[0][0] = 0;
                this.field1629[0][1] = 0;
                this.field1629[0][3] = 0;
                this.field1629[0][2] = 0;
                this.field1629[1][3] = 4096;
                this.field1629[1][2] = 4096;
                this.field1629[1][1] = 4096;
                this.field1629[1][0] = 4096;
            }
        }
        int var4 = -68 % ((9 - arg0) / 63);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field1628;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[] var4 = this.method4127(arg0, 83, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class399.field5703 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1632[var9];
                var5[var8] = class368.method2314(16711680, var10) >> 12;
                var6[var8] = class368.method2314(65280, var10) >> 4;
                var7[var8] = class368.method2314(var10, 255) << 4;
            }
        }
        return arg1 != 8213 ? null : var3;
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)V")
    private final void method838(int arg0) {
        int var2 = 25 / ((arg0 - 32) / 57);
        ++field1633;
        int var3 = this.field1629.length;
        if (var3 > 0) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var3 < ~var7 && ~var6 <= ~this.field1629[var7][0]; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (~var3 < ~var5) {
                    int[] var8 = this.field1629[var5];
                    if (~var5 >= -1) {
                        var9 = var8[1];
                        var10 = var8[3];
                        var11 = var8[2];
                    } else {
                        int[] var12 = this.field1629[var5 + -1];
                        int var13 = (-var12[0] + var6 << 12) / (var8[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var8[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var8[1] * var13 + var12[1] * var14 >> 12;
                        var11 = var8[2] * var13 + var12[2] * var14 >> 12;
                    }
                } else {
                    int[] var15 = this.field1629[var3 - 1];
                    var10 = var15[3];
                    var11 = var15[2];
                    var9 = var15[1];
                }
                int var16 = var10 >> 4;
                int var17 = var11 >> 4;
                int var18 = var9 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var18 < 0) {
                    var18 = 0;
                } else if (~var18 < -256) {
                    var18 = 255;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field1632[var4] = class430.method2658(var16, class430.method2658(var17 << 8, var18 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        ++field1630;
        if (arg0 <= 53) {
            field1634 = null;
        }
        if (this.field1629 == null) {
            this.method837((byte) -57, 1);
        }
        this.method838(99);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method2886(true);
            if (~var4 == -1) {
                this.field1629 = new int[arg0.method2886(true)][4];
                for (int var5 = 0; ~var5 > ~this.field1629.length; ++var5) {
                    this.field1629[var5][0] = arg0.method2882(-1);
                    this.field1629[var5][1] = arg0.method2886(true) << 4;
                    this.field1629[var5][2] = arg0.method2886(true) << 4;
                    this.field1629[var5][3] = arg0.method2886(true) << 4;
                }
            } else {
                this.method837((byte) 84, var4);
            }
        }
        ++field1631;
        if (arg2 != 1) {
            this.method838(121);
        }
    }
}
