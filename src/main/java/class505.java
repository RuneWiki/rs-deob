import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class505 extends class149 {

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "[I")
    private int[] field7534 = new int[257];

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field7541 = 1;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Lob;")
    public static class266 field7533 = new class266("WIP", 2);

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "[[I")
    private int[][] field7540;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        ++field7535;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 >= -45) {
            this.method3018((byte) 56, -110);
        }
        if (super.field2147.field6664) {
            int[] var4 = this.method983(0, 24824, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class316.field4838; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field7534[var9];
                var5[var8] = class494.method2942(var10, 16711680) >> 12;
                var6[var8] = class494.method2942(4080, var10 >> 4);
                var7[var8] = class494.method2942(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        ++field7538;
        if (this.field7540 == null) {
            this.method3018((byte) -77, 1);
        }
        if (arg0 > -86) {
            this.method3019((byte) 110);
        }
        this.method3019((byte) 110);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public static void method3017(byte arg0) {
        field7533 = null;
        if (arg0 != 41) {
            field7541 = -70;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)V")
    private final void method3018(byte arg0, int arg1) {
        ++field7539;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7540 = new int[4][4];
                                this.field7540[0][1] = 0;
                                this.field7540[0][3] = 0;
                                this.field7540[0][0] = 2048;
                                this.field7540[0][2] = 4096;
                                this.field7540[1][1] = 4096;
                                this.field7540[1][0] = 2867;
                                this.field7540[1][2] = 4096;
                                this.field7540[1][3] = 0;
                                this.field7540[2][2] = 4096;
                                this.field7540[2][0] = 3276;
                                this.field7540[2][3] = 0;
                                this.field7540[2][1] = 4096;
                                this.field7540[3][1] = 4096;
                                this.field7540[3][0] = 4096;
                                this.field7540[3][3] = 0;
                                this.field7540[3][2] = 0;
                            } else {
                                this.field7540 = new int[16][4];
                                this.field7540[0][1] = 80;
                                this.field7540[0][2] = 192;
                                this.field7540[0][0] = 0;
                                this.field7540[0][3] = 321;
                                this.field7540[1][3] = 562;
                                this.field7540[1][0] = 155;
                                this.field7540[1][1] = 321;
                                this.field7540[1][2] = 449;
                                this.field7540[2][0] = 389;
                                this.field7540[2][1] = 578;
                                this.field7540[2][2] = 690;
                                this.field7540[2][3] = 803;
                                this.field7540[3][1] = 947;
                                this.field7540[3][0] = 671;
                                this.field7540[3][3] = 1140;
                                this.field7540[3][2] = 995;
                                this.field7540[4][3] = 1509;
                                this.field7540[4][1] = 1285;
                                this.field7540[4][0] = 897;
                                this.field7540[4][2] = 1397;
                                this.field7540[5][0] = 1175;
                                this.field7540[5][2] = 1429;
                                this.field7540[5][1] = 1525;
                                this.field7540[5][3] = 1413;
                                this.field7540[6][2] = 1461;
                                this.field7540[6][0] = 1368;
                                this.field7540[6][3] = 1333;
                                this.field7540[6][1] = 1734;
                                this.field7540[7][3] = 1702;
                                this.field7540[7][1] = 1413;
                                this.field7540[7][0] = 1507;
                                this.field7540[7][2] = 1525;
                                this.field7540[8][0] = 1736;
                                this.field7540[8][2] = 1590;
                                this.field7540[8][1] = 1108;
                                this.field7540[8][3] = 2056;
                                this.field7540[9][3] = 2666;
                                this.field7540[9][0] = 2088;
                                this.field7540[9][1] = 1766;
                                this.field7540[9][2] = 2056;
                                this.field7540[10][3] = 3276;
                                this.field7540[10][0] = 2355;
                                this.field7540[10][1] = 2409;
                                this.field7540[10][2] = 2586;
                                this.field7540[11][0] = 2691;
                                this.field7540[11][1] = 3116;
                                this.field7540[11][3] = 3228;
                                this.field7540[11][2] = 3148;
                                this.field7540[12][1] = 3806;
                                this.field7540[12][0] = 3031;
                                this.field7540[12][3] = 3196;
                                this.field7540[12][2] = 3710;
                                this.field7540[13][0] = 3522;
                                this.field7540[13][1] = 3437;
                                this.field7540[13][3] = 3019;
                                this.field7540[13][2] = 3421;
                                this.field7540[14][1] = 3116;
                                this.field7540[14][2] = 3148;
                                this.field7540[14][0] = 3727;
                                this.field7540[14][3] = 3228;
                                this.field7540[15][1] = 2377;
                                this.field7540[15][2] = 2505;
                                this.field7540[15][3] = 2746;
                                this.field7540[15][0] = 4096;
                            }
                        } else {
                            this.field7540 = new int[6][4];
                            this.field7540[0][3] = 0;
                            this.field7540[0][2] = 0;
                            this.field7540[0][0] = 0;
                            this.field7540[0][1] = 0;
                            this.field7540[1][3] = 1493;
                            this.field7540[1][2] = 0;
                            this.field7540[1][0] = 1843;
                            this.field7540[1][1] = 0;
                            this.field7540[2][3] = 2939;
                            this.field7540[2][0] = 2457;
                            this.field7540[2][1] = 0;
                            this.field7540[2][2] = 0;
                            this.field7540[3][1] = 0;
                            this.field7540[3][3] = 3565;
                            this.field7540[3][2] = 1124;
                            this.field7540[3][0] = 2781;
                            this.field7540[4][3] = 4031;
                            this.field7540[4][2] = 3084;
                            this.field7540[4][0] = 3481;
                            this.field7540[4][1] = 546;
                            this.field7540[5][0] = 4096;
                            this.field7540[5][1] = 4096;
                            this.field7540[5][3] = 4096;
                            this.field7540[5][2] = 4096;
                        }
                    } else {
                        this.field7540 = new int[7][4];
                        this.field7540[0][3] = 4096;
                        this.field7540[0][0] = 0;
                        this.field7540[0][2] = 0;
                        this.field7540[0][1] = 0;
                        this.field7540[1][0] = 663;
                        this.field7540[1][2] = 4096;
                        this.field7540[1][1] = 0;
                        this.field7540[1][3] = 4096;
                        this.field7540[2][0] = 1363;
                        this.field7540[2][2] = 4096;
                        this.field7540[2][3] = 0;
                        this.field7540[2][1] = 0;
                        this.field7540[3][2] = 4096;
                        this.field7540[3][1] = 4096;
                        this.field7540[3][0] = 2048;
                        this.field7540[3][3] = 0;
                        this.field7540[4][1] = 4096;
                        this.field7540[4][2] = 0;
                        this.field7540[4][0] = 2727;
                        this.field7540[4][3] = 0;
                        this.field7540[5][0] = 3411;
                        this.field7540[5][3] = 4096;
                        this.field7540[5][2] = 0;
                        this.field7540[5][1] = 4096;
                        this.field7540[6][2] = 0;
                        this.field7540[6][0] = 4096;
                        this.field7540[6][3] = 4096;
                        this.field7540[6][1] = 0;
                    }
                } else {
                    this.field7540 = new int[8][4];
                    this.field7540[0][2] = 2602;
                    this.field7540[0][1] = 2650;
                    this.field7540[0][3] = 2361;
                    this.field7540[0][0] = 0;
                    this.field7540[1][2] = 1799;
                    this.field7540[1][3] = 1558;
                    this.field7540[1][1] = 2313;
                    this.field7540[1][0] = 2867;
                    this.field7540[2][1] = 2618;
                    this.field7540[2][3] = 1413;
                    this.field7540[2][0] = 3072;
                    this.field7540[2][2] = 1734;
                    this.field7540[3][2] = 1220;
                    this.field7540[3][0] = 3276;
                    this.field7540[3][1] = 2296;
                    this.field7540[3][3] = 947;
                    this.field7540[4][3] = 722;
                    this.field7540[4][1] = 2072;
                    this.field7540[4][0] = 3481;
                    this.field7540[4][2] = 963;
                    this.field7540[5][1] = 2730;
                    this.field7540[5][0] = 3686;
                    this.field7540[5][2] = 2152;
                    this.field7540[5][3] = 1766;
                    this.field7540[6][3] = 915;
                    this.field7540[6][0] = 3891;
                    this.field7540[6][2] = 1060;
                    this.field7540[6][1] = 2232;
                    this.field7540[7][0] = 4096;
                    this.field7540[7][3] = 1140;
                    this.field7540[7][1] = 1686;
                    this.field7540[7][2] = 1413;
                }
            } else {
                this.field7540 = new int[2][4];
                this.field7540[0][1] = 0;
                this.field7540[0][0] = 0;
                this.field7540[0][2] = 0;
                this.field7540[0][3] = 0;
                this.field7540[1][0] = 4096;
                this.field7540[1][3] = 4096;
                this.field7540[1][2] = 4096;
                this.field7540[1][1] = 4096;
            }
        }
        if (arg0 > -19) {
            method3017((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class505() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    private final void method3019(byte arg0) {
        ++field7537;
        int var2 = this.field7540.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~var5 <= ~this.field7540[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field7540[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field7540[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] - var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                    } else {
                        var12 = var7[1];
                        var13 = var7[3];
                        var11 = var7[2];
                    }
                } else {
                    int[] var14 = this.field7540[var2 + -1];
                    var12 = var14[1];
                    var13 = var14[3];
                    var11 = var14[2];
                }
                int var15 = var12 >> 4;
                int var16 = var11 >> 4;
                int var17 = var13 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field7534[var3] = class286.method1860(class286.method1860(var16 << 8, var15 << 16), var17);
            }
        }
        if (arg0 < 104) {
            method3017((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 == 35) {
            if (arg0 == 0) {
                int var4 = arg2.method618((byte) 100);
                if (~var4 == -1) {
                    this.field7540 = new int[arg2.method618((byte) 100)][4];
                    for (int var5 = 0; ~this.field7540.length < ~var5; ++var5) {
                        this.field7540[var5][0] = arg2.method631(10494);
                        this.field7540[var5][1] = arg2.method618((byte) 100) << 4;
                        this.field7540[var5][2] = arg2.method618((byte) 100) << 4;
                        this.field7540[var5][3] = arg2.method618((byte) 100) << 4;
                    }
                } else {
                    this.method3018((byte) -35, var4);
                }
            }
            ++field7536;
        }
    }
}
