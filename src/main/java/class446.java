import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class446 extends class45 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "[I")
    private int[] field6653 = new int[257];

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "Lrn;")
    public static class174 field6651 = new class174(55, 6);

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field6658 = 0;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "Lop;")
    public static class124 field6661 = new class124("LIVE", 0);

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "Len;")
    public static class208 field6663;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "[[I")
    private int[][] field6652;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        ++field6656;
        if (this.field6652 == null) {
            this.method2665(-8646, 1);
        }
        this.method2666((byte) -103);
        if (arg0 != 4095) {
            field6651 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field6662;
        int var7 = class9.method50(class70.field1213, arg2, class389.field5859, true);
        int var8 = class9.method50(class70.field1213, arg3, class389.field5859, true);
        int var9 = class9.method50(class315.field4754, arg0, class156.field2455, true);
        int var10 = class9.method50(class315.field4754, arg4, class156.field2455, true);
        int var11 = class9.method50(class70.field1213, arg2 + arg6, class389.field5859, true);
        int var12 = class9.method50(class70.field1213, -arg6 + arg3, class389.field5859, true);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class179.method1269(class21.field430[var13], arg1, var9, var10, 26985);
        }
        int var14 = var8;
        if (arg5 <= 17) {
            method2662(-7, -65, 118, 123, -28, (byte) -53, -35);
        }
        while (~var12 > ~var14) {
            class179.method1269(class21.field430[var14], arg1, var9, var10, 26985);
            --var14;
        }
        int var15 = class9.method50(class315.field4754, arg0 + arg6, class156.field2455, true);
        int var16 = class9.method50(class315.field4754, -arg6 + arg4, class156.field2455, true);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class21.field430[var17];
            class179.method1269(var18, arg1, var9, var15, 26985);
            class179.method1269(var18, arg1, var16, var10, 26985);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field6655;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            return null;
        } else {
            if (super.field833.field1888) {
                int[] var4 = this.method434(0, arg1, 127);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class259.field3768 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field6653[var9];
                    var5[var8] = class207.method1405(var10 >> 12, 4080);
                    var6[var8] = class207.method1405(var10, 65280) >> 4;
                    var7[var8] = class207.method1405(255, var10) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBI)I")
    public static final int method2663(int arg0, int arg1, byte arg2, int arg3) {
        ++field6657;
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = arg1 / arg3;
        int var7 = arg3 + -1 & arg1;
        int var8 = class331.method2126(var6, var4, -66);
        int var9 = class331.method2126(var6, var4 + 1, -101);
        if (arg2 != 45) {
            return -10;
        } else {
            int var10 = class331.method2126(var6 + 1, var4, -91);
            int var11 = class331.method2126(var6 + 1, var4 - -1, -78);
            int var12 = class148.method1142(var8, (byte) -127, var5, arg3, var9);
            int var13 = class148.method1142(var10, (byte) -127, var5, arg3, var11);
            return class148.method1142(var12, (byte) -128, var7, arg3, var13);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class446() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static void method2664(boolean arg0) {
        field6663 = null;
        field6661 = null;
        if (!arg0) {
            field6651 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)V")
    private final void method2665(int arg0, int arg1) {
        ++field6659;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field6652 = new int[4][4];
                                this.field6652[0][2] = 4096;
                                this.field6652[0][3] = 0;
                                this.field6652[0][1] = 0;
                                this.field6652[0][0] = 2048;
                                this.field6652[1][1] = 4096;
                                this.field6652[1][2] = 4096;
                                this.field6652[1][3] = 0;
                                this.field6652[1][0] = 2867;
                                this.field6652[2][1] = 4096;
                                this.field6652[2][0] = 3276;
                                this.field6652[2][2] = 4096;
                                this.field6652[2][3] = 0;
                                this.field6652[3][0] = 4096;
                                this.field6652[3][3] = 0;
                                this.field6652[3][1] = 4096;
                                this.field6652[3][2] = 0;
                            } else {
                                this.field6652 = new int[16][4];
                                this.field6652[0][3] = 321;
                                this.field6652[0][0] = 0;
                                this.field6652[0][2] = 192;
                                this.field6652[0][1] = 80;
                                this.field6652[1][2] = 449;
                                this.field6652[1][1] = 321;
                                this.field6652[1][3] = 562;
                                this.field6652[1][0] = 155;
                                this.field6652[2][3] = 803;
                                this.field6652[2][1] = 578;
                                this.field6652[2][0] = 389;
                                this.field6652[2][2] = 690;
                                this.field6652[3][1] = 947;
                                this.field6652[3][2] = 995;
                                this.field6652[3][0] = 671;
                                this.field6652[3][3] = 1140;
                                this.field6652[4][3] = 1509;
                                this.field6652[4][0] = 897;
                                this.field6652[4][1] = 1285;
                                this.field6652[4][2] = 1397;
                                this.field6652[5][3] = 1413;
                                this.field6652[5][1] = 1525;
                                this.field6652[5][2] = 1429;
                                this.field6652[5][0] = 1175;
                                this.field6652[6][1] = 1734;
                                this.field6652[6][2] = 1461;
                                this.field6652[6][3] = 1333;
                                this.field6652[6][0] = 1368;
                                this.field6652[7][1] = 1413;
                                this.field6652[7][3] = 1702;
                                this.field6652[7][0] = 1507;
                                this.field6652[7][2] = 1525;
                                this.field6652[8][2] = 1590;
                                this.field6652[8][1] = 1108;
                                this.field6652[8][3] = 2056;
                                this.field6652[8][0] = 1736;
                                this.field6652[9][1] = 1766;
                                this.field6652[9][0] = 2088;
                                this.field6652[9][3] = 2666;
                                this.field6652[9][2] = 2056;
                                this.field6652[10][3] = 3276;
                                this.field6652[10][0] = 2355;
                                this.field6652[10][1] = 2409;
                                this.field6652[10][2] = 2586;
                                this.field6652[11][1] = 3116;
                                this.field6652[11][3] = 3228;
                                this.field6652[11][0] = 2691;
                                this.field6652[11][2] = 3148;
                                this.field6652[12][1] = 3806;
                                this.field6652[12][2] = 3710;
                                this.field6652[12][0] = 3031;
                                this.field6652[12][3] = 3196;
                                this.field6652[13][3] = 3019;
                                this.field6652[13][1] = 3437;
                                this.field6652[13][2] = 3421;
                                this.field6652[13][0] = 3522;
                                this.field6652[14][3] = 3228;
                                this.field6652[14][2] = 3148;
                                this.field6652[14][1] = 3116;
                                this.field6652[14][0] = 3727;
                                this.field6652[15][0] = 4096;
                                this.field6652[15][1] = 2377;
                                this.field6652[15][3] = 2746;
                                this.field6652[15][2] = 2505;
                            }
                        } else {
                            this.field6652 = new int[6][4];
                            this.field6652[0][1] = 0;
                            this.field6652[0][0] = 0;
                            this.field6652[0][2] = 0;
                            this.field6652[0][3] = 0;
                            this.field6652[1][3] = 1493;
                            this.field6652[1][0] = 1843;
                            this.field6652[1][2] = 0;
                            this.field6652[1][1] = 0;
                            this.field6652[2][2] = 0;
                            this.field6652[2][3] = 2939;
                            this.field6652[2][1] = 0;
                            this.field6652[2][0] = 2457;
                            this.field6652[3][2] = 1124;
                            this.field6652[3][3] = 3565;
                            this.field6652[3][1] = 0;
                            this.field6652[3][0] = 2781;
                            this.field6652[4][1] = 546;
                            this.field6652[4][2] = 3084;
                            this.field6652[4][3] = 4031;
                            this.field6652[4][0] = 3481;
                            this.field6652[5][1] = 4096;
                            this.field6652[5][2] = 4096;
                            this.field6652[5][3] = 4096;
                            this.field6652[5][0] = 4096;
                        }
                    } else {
                        this.field6652 = new int[7][4];
                        this.field6652[0][3] = 4096;
                        this.field6652[0][1] = 0;
                        this.field6652[0][0] = 0;
                        this.field6652[0][2] = 0;
                        this.field6652[1][2] = 4096;
                        this.field6652[1][3] = 4096;
                        this.field6652[1][1] = 0;
                        this.field6652[1][0] = 663;
                        this.field6652[2][3] = 0;
                        this.field6652[2][2] = 4096;
                        this.field6652[2][1] = 0;
                        this.field6652[2][0] = 1363;
                        this.field6652[3][0] = 2048;
                        this.field6652[3][3] = 0;
                        this.field6652[3][1] = 4096;
                        this.field6652[3][2] = 4096;
                        this.field6652[4][2] = 0;
                        this.field6652[4][0] = 2727;
                        this.field6652[4][3] = 0;
                        this.field6652[4][1] = 4096;
                        this.field6652[5][3] = 4096;
                        this.field6652[5][1] = 4096;
                        this.field6652[5][0] = 3411;
                        this.field6652[5][2] = 0;
                        this.field6652[6][0] = 4096;
                        this.field6652[6][2] = 0;
                        this.field6652[6][3] = 4096;
                        this.field6652[6][1] = 0;
                    }
                } else {
                    this.field6652 = new int[8][4];
                    this.field6652[0][3] = 2361;
                    this.field6652[0][2] = 2602;
                    this.field6652[0][1] = 2650;
                    this.field6652[0][0] = 0;
                    this.field6652[1][2] = 1799;
                    this.field6652[1][0] = 2867;
                    this.field6652[1][3] = 1558;
                    this.field6652[1][1] = 2313;
                    this.field6652[2][1] = 2618;
                    this.field6652[2][0] = 3072;
                    this.field6652[2][3] = 1413;
                    this.field6652[2][2] = 1734;
                    this.field6652[3][0] = 3276;
                    this.field6652[3][3] = 947;
                    this.field6652[3][1] = 2296;
                    this.field6652[3][2] = 1220;
                    this.field6652[4][1] = 2072;
                    this.field6652[4][3] = 722;
                    this.field6652[4][0] = 3481;
                    this.field6652[4][2] = 963;
                    this.field6652[5][2] = 2152;
                    this.field6652[5][1] = 2730;
                    this.field6652[5][3] = 1766;
                    this.field6652[5][0] = 3686;
                    this.field6652[6][2] = 1060;
                    this.field6652[6][1] = 2232;
                    this.field6652[6][3] = 915;
                    this.field6652[6][0] = 3891;
                    this.field6652[7][1] = 1686;
                    this.field6652[7][0] = 4096;
                    this.field6652[7][2] = 1413;
                    this.field6652[7][3] = 1140;
                }
            } else {
                this.field6652 = new int[2][4];
                this.field6652[0][0] = 0;
                this.field6652[0][3] = 0;
                this.field6652[0][2] = 0;
                this.field6652[0][1] = 0;
                this.field6652[1][1] = 4096;
                this.field6652[1][2] = 4096;
                this.field6652[1][3] = 4096;
                this.field6652[1][0] = 4096;
            }
        }
        if (arg0 != -8646) {
            this.method2666((byte) 126);
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V")
    private final void method2666(byte arg0) {
        ++field6654;
        int var2 = -41 % ((arg0 - 32) / 38);
        int var3 = this.field6652.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var3 && ~var6 <= ~this.field6652[var7][0]; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (var3 <= var5) {
                    int[] var8 = this.field6652[var3 + -1];
                    var9 = var8[2];
                    var10 = var8[1];
                    var11 = var8[3];
                } else {
                    int[] var12 = this.field6652[var5];
                    if (var5 > 0) {
                        int[] var13 = this.field6652[var5 - 1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                        int var15 = -var14 + 4096;
                        var9 = var12[2] * var14 - -(var13[2] * var15) >> 12;
                        var10 = var12[1] * var14 + var13[1] * var15 >> 12;
                        var11 = var12[3] * var14 + var13[3] * var15 >> 12;
                    } else {
                        var9 = var12[2];
                        var10 = var12[1];
                        var11 = var12[3];
                    }
                }
                int var16 = var11 >> 4;
                int var17 = var10 >> 4;
                int var18 = var9 >> 4;
                if (~var16 > -1) {
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
                if (var18 < 0) {
                    var18 = 0;
                } else if (~var18 < -256) {
                    var18 = 255;
                }
                this.field6653[var4] = class121.method909(var16, class121.method909(var18 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method1063((byte) -14);
            if (var4 == 0) {
                this.field6652 = new int[arg0.method1063((byte) 114)][4];
                for (int var5 = 0; var5 < this.field6652.length; ++var5) {
                    this.field6652[var5][0] = arg0.method1069((byte) -96);
                    this.field6652[var5][1] = arg0.method1063((byte) 126) << 4;
                    this.field6652[var5][2] = arg0.method1063((byte) -22) << 4;
                    this.field6652[var5][3] = arg0.method1063((byte) 126) << 4;
                }
            } else {
                this.method2665(arg1 ^ 18083, var4);
            }
        }
        if (arg1 != -26471) {
            method2662(-109, 81, -21, -2, 43, (byte) -6, 110);
        }
        ++field6660;
    }
}
