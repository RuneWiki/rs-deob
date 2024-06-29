import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class527 extends class214 {

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "[I")
    private int[] field7576 = new int[257];

    @OriginalMember(owner = "client!efa", name = "L", descriptor = "Lqg;")
    public static class266 field7583 = new class266();

    @OriginalMember(owner = "client!efa", name = "P", descriptor = "Z")
    public static boolean field7587 = false;

    @OriginalMember(owner = "client!efa", name = "O", descriptor = "Leda;")
    public static class14 field7586 = new class14(8);

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!efa", name = "M", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!efa", name = "N", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "[[I")
    private int[][] field7582;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(II)I")
    public static final int method3129(int arg0, int arg1) {
        ++field7575;
        if (arg0 != -4) {
            field7586 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)V")
    public static void method3130(int arg0) {
        if (arg0 != 1) {
            method3130(32);
        }
        field7586 = null;
        field7583 = null;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(ZII)Z")
    public static final boolean method3131(boolean arg0, int arg1, int arg2) {
        ++field7579;
        if (arg0) {
            field7587 = false;
        }
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
    public class527() {
        super(1, false);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            field7583 = null;
        }
        ++field7584;
        if (~arg2 == -1) {
            int var4 = arg1.method1987(-38);
            if (~var4 != -1) {
                this.method3133(4, var4);
            } else {
                this.field7582 = new int[arg1.method1987(-66)][4];
                for (int var5 = 0; ~this.field7582.length < ~var5; ++var5) {
                    this.field7582[var5][0] = arg1.method1989((byte) -76);
                    this.field7582[var5][1] = arg1.method1987(-29) << 4;
                    this.field7582[var5][2] = arg1.method1987(-69) << 4;
                    this.field7582[var5][3] = arg1.method1987(-6) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)V")
    private final void method3132(boolean arg0) {
        if (arg0) {
            ++field7578;
            int var2 = this.field7582.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~this.field7582[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (var2 > var4) {
                        int[] var7 = this.field7582[var4];
                        if (~var4 < -1) {
                            int[] var8 = this.field7582[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[2] * var9 - -(var8[2] * var10) >> 12;
                            var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                        } else {
                            var12 = var7[2];
                            var13 = var7[3];
                            var11 = var7[1];
                        }
                    } else {
                        int[] var14 = this.field7582[var2 + -1];
                        var12 = var14[2];
                        var11 = var14[1];
                        var13 = var14[3];
                    }
                    int var15 = var11 >> 4;
                    int var16 = var13 >> 4;
                    int var17 = var12 >> 4;
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (~var16 <= -1) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (var17 >= 0) {
                        if (~var17 < -256) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    this.field7576[var3] = class112.method903(var16, class112.method903(var17 << 8, var15 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field7585;
        if (arg0 < 48) {
            field7587 = true;
        }
        if (this.field7582 == null) {
            this.method3133(4, 1);
        }
        this.method3132(true);
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != -256) {
            return null;
        } else {
            ++field7581;
            int[][] var3 = super.field3545.method2996((byte) 127, arg0);
            if (super.field3545.field7147) {
                int[] var4 = this.method1545(arg0, 0, -1);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class626.field8787 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (~var9 < -257) {
                        var9 = 256;
                    }
                    int var10 = this.field7576[var9];
                    var5[var8] = class636.method3603(var10 >> 12, 4080);
                    var6[var8] = class636.method3603(var10, 65280) >> 4;
                    var7[var8] = class636.method3603(var10, 255) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(II)V")
    private final void method3133(int arg0, int arg1) {
        ++field7577;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field7582 = new int[4][4];
                                this.field7582[0][2] = 4096;
                                this.field7582[0][3] = 0;
                                this.field7582[0][0] = 2048;
                                this.field7582[0][1] = 0;
                                this.field7582[1][2] = 4096;
                                this.field7582[1][3] = 0;
                                this.field7582[1][0] = 2867;
                                this.field7582[1][1] = 4096;
                                this.field7582[2][0] = 3276;
                                this.field7582[2][2] = 4096;
                                this.field7582[2][1] = 4096;
                                this.field7582[2][3] = 0;
                                this.field7582[3][3] = 0;
                                this.field7582[3][0] = 4096;
                                this.field7582[3][1] = 4096;
                                this.field7582[3][2] = 0;
                            } else {
                                this.field7582 = new int[16][4];
                                this.field7582[0][3] = 321;
                                this.field7582[0][1] = 80;
                                this.field7582[0][2] = 192;
                                this.field7582[0][0] = 0;
                                this.field7582[1][3] = 562;
                                this.field7582[1][2] = 449;
                                this.field7582[1][1] = 321;
                                this.field7582[1][0] = 155;
                                this.field7582[2][0] = 389;
                                this.field7582[2][2] = 690;
                                this.field7582[2][3] = 803;
                                this.field7582[2][1] = 578;
                                this.field7582[3][3] = 1140;
                                this.field7582[3][1] = 947;
                                this.field7582[3][0] = 671;
                                this.field7582[3][2] = 995;
                                this.field7582[4][1] = 1285;
                                this.field7582[4][0] = 897;
                                this.field7582[4][3] = 1509;
                                this.field7582[4][2] = 1397;
                                this.field7582[5][0] = 1175;
                                this.field7582[5][1] = 1525;
                                this.field7582[5][3] = 1413;
                                this.field7582[5][2] = 1429;
                                this.field7582[6][3] = 1333;
                                this.field7582[6][1] = 1734;
                                this.field7582[6][2] = 1461;
                                this.field7582[6][0] = 1368;
                                this.field7582[7][1] = 1413;
                                this.field7582[7][2] = 1525;
                                this.field7582[7][3] = 1702;
                                this.field7582[7][0] = 1507;
                                this.field7582[8][2] = 1590;
                                this.field7582[8][3] = 2056;
                                this.field7582[8][0] = 1736;
                                this.field7582[8][1] = 1108;
                                this.field7582[9][2] = 2056;
                                this.field7582[9][1] = 1766;
                                this.field7582[9][3] = 2666;
                                this.field7582[9][0] = 2088;
                                this.field7582[10][0] = 2355;
                                this.field7582[10][1] = 2409;
                                this.field7582[10][2] = 2586;
                                this.field7582[10][3] = 3276;
                                this.field7582[11][1] = 3116;
                                this.field7582[11][0] = 2691;
                                this.field7582[11][2] = 3148;
                                this.field7582[11][3] = 3228;
                                this.field7582[12][0] = 3031;
                                this.field7582[12][2] = 3710;
                                this.field7582[12][1] = 3806;
                                this.field7582[12][3] = 3196;
                                this.field7582[13][2] = 3421;
                                this.field7582[13][0] = 3522;
                                this.field7582[13][3] = 3019;
                                this.field7582[13][1] = 3437;
                                this.field7582[14][2] = 3148;
                                this.field7582[14][1] = 3116;
                                this.field7582[14][3] = 3228;
                                this.field7582[14][0] = 3727;
                                this.field7582[15][3] = 2746;
                                this.field7582[15][1] = 2377;
                                this.field7582[15][2] = 2505;
                                this.field7582[15][0] = 4096;
                            }
                        } else {
                            this.field7582 = new int[6][4];
                            this.field7582[0][3] = 0;
                            this.field7582[0][1] = 0;
                            this.field7582[0][2] = 0;
                            this.field7582[0][0] = 0;
                            this.field7582[1][0] = 1843;
                            this.field7582[1][2] = 0;
                            this.field7582[1][3] = 1493;
                            this.field7582[1][1] = 0;
                            this.field7582[2][1] = 0;
                            this.field7582[2][3] = 2939;
                            this.field7582[2][2] = 0;
                            this.field7582[2][0] = 2457;
                            this.field7582[3][3] = 3565;
                            this.field7582[3][1] = 0;
                            this.field7582[3][2] = 1124;
                            this.field7582[3][0] = 2781;
                            this.field7582[4][1] = 546;
                            this.field7582[4][0] = 3481;
                            this.field7582[4][2] = 3084;
                            this.field7582[4][3] = 4031;
                            this.field7582[5][3] = 4096;
                            this.field7582[5][1] = 4096;
                            this.field7582[5][2] = 4096;
                            this.field7582[5][0] = 4096;
                        }
                    } else {
                        this.field7582 = new int[7][4];
                        this.field7582[0][0] = 0;
                        this.field7582[0][3] = 4096;
                        this.field7582[0][1] = 0;
                        this.field7582[0][2] = 0;
                        this.field7582[1][2] = 4096;
                        this.field7582[1][1] = 0;
                        this.field7582[1][0] = 663;
                        this.field7582[1][3] = 4096;
                        this.field7582[2][3] = 0;
                        this.field7582[2][2] = 4096;
                        this.field7582[2][1] = 0;
                        this.field7582[2][0] = 1363;
                        this.field7582[3][0] = 2048;
                        this.field7582[3][2] = 4096;
                        this.field7582[3][3] = 0;
                        this.field7582[3][1] = 4096;
                        this.field7582[4][3] = 0;
                        this.field7582[4][1] = 4096;
                        this.field7582[4][0] = 2727;
                        this.field7582[4][2] = 0;
                        this.field7582[5][3] = 4096;
                        this.field7582[5][0] = 3411;
                        this.field7582[5][2] = 0;
                        this.field7582[5][1] = 4096;
                        this.field7582[6][2] = 0;
                        this.field7582[6][1] = 0;
                        this.field7582[6][3] = 4096;
                        this.field7582[6][0] = 4096;
                    }
                } else {
                    this.field7582 = new int[8][4];
                    this.field7582[0][1] = 2650;
                    this.field7582[0][0] = 0;
                    this.field7582[0][3] = 2361;
                    this.field7582[0][2] = 2602;
                    this.field7582[1][1] = 2313;
                    this.field7582[1][2] = 1799;
                    this.field7582[1][0] = 2867;
                    this.field7582[1][3] = 1558;
                    this.field7582[2][1] = 2618;
                    this.field7582[2][2] = 1734;
                    this.field7582[2][0] = 3072;
                    this.field7582[2][3] = 1413;
                    this.field7582[3][0] = 3276;
                    this.field7582[3][1] = 2296;
                    this.field7582[3][2] = 1220;
                    this.field7582[3][3] = 947;
                    this.field7582[4][3] = 722;
                    this.field7582[4][0] = 3481;
                    this.field7582[4][2] = 963;
                    this.field7582[4][1] = 2072;
                    this.field7582[5][1] = 2730;
                    this.field7582[5][2] = 2152;
                    this.field7582[5][0] = 3686;
                    this.field7582[5][3] = 1766;
                    this.field7582[6][1] = 2232;
                    this.field7582[6][2] = 1060;
                    this.field7582[6][0] = 3891;
                    this.field7582[6][3] = 915;
                    this.field7582[7][0] = 4096;
                    this.field7582[7][3] = 1140;
                    this.field7582[7][2] = 1413;
                    this.field7582[7][1] = 1686;
                }
            } else {
                this.field7582 = new int[2][4];
                this.field7582[0][3] = 0;
                this.field7582[0][2] = 0;
                this.field7582[0][0] = 0;
                this.field7582[0][1] = 0;
                this.field7582[1][1] = 4096;
                this.field7582[1][2] = 4096;
                this.field7582[1][0] = 4096;
                this.field7582[1][3] = 4096;
            }
        }
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lraa;I)V")
    public static final void method3134(class353 arg0, int arg1) {
        ++field7580;
        if (class552.field7867) {
            if (arg0.field5228 != null) {
                class353 var2 = class745.method4165(-97, class711.field10004, class436.field6364);
                if (var2 != null) {
                    class700 var3 = new class700();
                    var3.field9902 = arg0;
                    var3.field9894 = var2;
                    var3.field9891 = arg0.field5228;
                    class464.method2838(var3);
                }
            }
            ++class96.field1417;
            class540 var4 = class257.method1732(true, class541.field7722, class655.field9332);
            var4.field7707.method1970((byte) 29, arg0.field5349);
            var4.field7707.method1939(arg0.field5352, 1134947720);
            var4.field7707.method1980(class711.field10004, (byte) 105);
            var4.field7707.method1925(class289.field4444, (byte) 81);
            var4.field7707.method1982((byte) 26, arg0.field5328);
            if (arg1 > 19) {
                var4.field7707.method1939(class436.field6364, 1134947720);
                class756.method4211(var4, 122);
            }
        }
    }
}
