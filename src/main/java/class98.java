import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class98 extends class326 {

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "[I")
    private int[] field1424 = new int[257];

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "Lmc;")
    public static class78 field1423 = new class78(58, 2);

    @OriginalMember(owner = "client!kt", name = "Y", descriptor = "I")
    public static int field1433 = 1;

    @OriginalMember(owner = "client!kt", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field1437 = new String[100];

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!kt", name = "U", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!kt", name = "W", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!kt", name = "bb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!kt", name = "Z", descriptor = "Ltg;")
    public static class140 field1434;

    @OriginalMember(owner = "client!kt", name = "db", descriptor = "Lbu;")
    public static class17 field1438;

    @OriginalMember(owner = "client!kt", name = "X", descriptor = "Lwm;")
    public static class364 field1432;

    @OriginalMember(owner = "client!kt", name = "V", descriptor = "[I")
    public static int[] field1430;

    @OriginalMember(owner = "client!kt", name = "ab", descriptor = "[[I")
    private int[][] field1435;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILwm;)V", line = 3)
    public static final void method602(int arg0, int arg1, int arg2, class364 arg3) {
        class453.field6147 = arg3;
        class177.field2408 = new class27[arg2][arg0];
        ++field1429;
        if (class117.field1731 != null) {
            class36.field546 = class215.method1214(class117.field1731[2], class117.field1731[4], 64, class117.field1731[5], class117.field1731[1], class117.field1731[0], class117.field1731[3]);
        }
        class274.field3630 = new class27();
        if (arg1 >= -6) {
            method604(-20);
        }
        class42.method284(25981);
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V", line = 22)
    public final void method65(int arg0) {
        ++field1425;
        if (this.field1435 == null) {
            this.method605(1, (byte) -60);
        }
        this.method606(true);
        if (arg0 >= -100) {
            this.method606(false);
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(IB)[[I", line = 36)
    public final int[][] method48(int arg0, byte arg1) {
        ++field1436;
        if (arg1 >= -52) {
            method602(61, -95, 96, (class364) null);
        }
        int[][] var3 = super.field4343.method2356(arg0, 97);
        if (super.field4343.field5336) {
            int[] var4 = this.method1824(0, false, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class181.field2495; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1424[var9];
                var5[var8] = class99.method612(4080, var10 >> 12);
                var6[var8] = class99.method612(65280, var10) >> 4;
                var7[var8] = class99.method612(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 87)
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILbt;I)V", line = 90)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 == -1) {
            int var4 = arg1.method201((byte) -116);
            if (var4 == 0) {
                this.field1435 = new int[arg1.method201((byte) -127)][4];
                for (int var5 = 0; ~var5 > ~this.field1435.length; ++var5) {
                    this.field1435[var5][0] = arg1.method215((byte) 125);
                    this.field1435[var5][1] = arg1.method201((byte) -128) << 4;
                    this.field1435[var5][2] = arg1.method201((byte) -111) << 4;
                    this.field1435[var5][3] = arg1.method201((byte) -110) << 4;
                }
            } else {
                this.method605(var4, (byte) -27);
            }
        }
        ++field1431;
        if (arg2 >= -3) {
            field1423 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)V", line = 128)
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= 74) {
            ++field1427;
            class106 var5 = class250.method1400(4, -106, arg4);
            var5.method658(0);
            var5.field1590 = arg0;
            var5.field1584 = arg1;
            var5.field1589 = arg2;
        }
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V", line = 146)
    public static final void method604(int arg0) {
        ++field1428;
        class412.field5639 = null;
        class8.field112 = null;
        class311.field4105 = null;
        class210.field2839 = null;
        class17.field238 = null;
        class271.field3614 = null;
        class206.field2788 = null;
        if (arg0 != 1413) {
            field1433 = 88;
        }
        class335.field4525 = null;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(IB)V", line = 165)
    private final void method605(int arg0, byte arg1) {
        ++field1422;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1435 = new int[4][4];
                                this.field1435[0][3] = 0;
                                this.field1435[0][2] = 4096;
                                this.field1435[0][0] = 2048;
                                this.field1435[0][1] = 0;
                                this.field1435[1][1] = 4096;
                                this.field1435[1][3] = 0;
                                this.field1435[1][2] = 4096;
                                this.field1435[1][0] = 2867;
                                this.field1435[2][3] = 0;
                                this.field1435[2][2] = 4096;
                                this.field1435[2][0] = 3276;
                                this.field1435[2][1] = 4096;
                                this.field1435[3][3] = 0;
                                this.field1435[3][2] = 0;
                                this.field1435[3][0] = 4096;
                                this.field1435[3][1] = 4096;
                            } else {
                                this.field1435 = new int[16][4];
                                this.field1435[0][0] = 0;
                                this.field1435[0][1] = 80;
                                this.field1435[0][2] = 192;
                                this.field1435[0][3] = 321;
                                this.field1435[1][2] = 449;
                                this.field1435[1][1] = 321;
                                this.field1435[1][3] = 562;
                                this.field1435[1][0] = 155;
                                this.field1435[2][1] = 578;
                                this.field1435[2][2] = 690;
                                this.field1435[2][3] = 803;
                                this.field1435[2][0] = 389;
                                this.field1435[3][2] = 995;
                                this.field1435[3][3] = 1140;
                                this.field1435[3][0] = 671;
                                this.field1435[3][1] = 947;
                                this.field1435[4][1] = 1285;
                                this.field1435[4][2] = 1397;
                                this.field1435[4][0] = 897;
                                this.field1435[4][3] = 1509;
                                this.field1435[5][0] = 1175;
                                this.field1435[5][3] = 1413;
                                this.field1435[5][2] = 1429;
                                this.field1435[5][1] = 1525;
                                this.field1435[6][2] = 1461;
                                this.field1435[6][0] = 1368;
                                this.field1435[6][3] = 1333;
                                this.field1435[6][1] = 1734;
                                this.field1435[7][1] = 1413;
                                this.field1435[7][0] = 1507;
                                this.field1435[7][2] = 1525;
                                this.field1435[7][3] = 1702;
                                this.field1435[8][3] = 2056;
                                this.field1435[8][1] = 1108;
                                this.field1435[8][2] = 1590;
                                this.field1435[8][0] = 1736;
                                this.field1435[9][2] = 2056;
                                this.field1435[9][3] = 2666;
                                this.field1435[9][0] = 2088;
                                this.field1435[9][1] = 1766;
                                this.field1435[10][3] = 3276;
                                this.field1435[10][2] = 2586;
                                this.field1435[10][0] = 2355;
                                this.field1435[10][1] = 2409;
                                this.field1435[11][3] = 3228;
                                this.field1435[11][2] = 3148;
                                this.field1435[11][0] = 2691;
                                this.field1435[11][1] = 3116;
                                this.field1435[12][2] = 3710;
                                this.field1435[12][3] = 3196;
                                this.field1435[12][1] = 3806;
                                this.field1435[12][0] = 3031;
                                this.field1435[13][3] = 3019;
                                this.field1435[13][0] = 3522;
                                this.field1435[13][1] = 3437;
                                this.field1435[13][2] = 3421;
                                this.field1435[14][3] = 3228;
                                this.field1435[14][2] = 3148;
                                this.field1435[14][0] = 3727;
                                this.field1435[14][1] = 3116;
                                this.field1435[15][2] = 2505;
                                this.field1435[15][3] = 2746;
                                this.field1435[15][1] = 2377;
                                this.field1435[15][0] = 4096;
                            }
                        } else {
                            this.field1435 = new int[6][4];
                            this.field1435[0][2] = 0;
                            this.field1435[0][3] = 0;
                            this.field1435[0][1] = 0;
                            this.field1435[0][0] = 0;
                            this.field1435[1][3] = 1493;
                            this.field1435[1][0] = 1843;
                            this.field1435[1][2] = 0;
                            this.field1435[1][1] = 0;
                            this.field1435[2][3] = 2939;
                            this.field1435[2][2] = 0;
                            this.field1435[2][0] = 2457;
                            this.field1435[2][1] = 0;
                            this.field1435[3][1] = 0;
                            this.field1435[3][3] = 3565;
                            this.field1435[3][2] = 1124;
                            this.field1435[3][0] = 2781;
                            this.field1435[4][0] = 3481;
                            this.field1435[4][1] = 546;
                            this.field1435[4][3] = 4031;
                            this.field1435[4][2] = 3084;
                            this.field1435[5][2] = 4096;
                            this.field1435[5][1] = 4096;
                            this.field1435[5][0] = 4096;
                            this.field1435[5][3] = 4096;
                        }
                    } else {
                        this.field1435 = new int[7][4];
                        this.field1435[0][3] = 4096;
                        this.field1435[0][0] = 0;
                        this.field1435[0][1] = 0;
                        this.field1435[0][2] = 0;
                        this.field1435[1][0] = 663;
                        this.field1435[1][3] = 4096;
                        this.field1435[1][1] = 0;
                        this.field1435[1][2] = 4096;
                        this.field1435[2][3] = 0;
                        this.field1435[2][2] = 4096;
                        this.field1435[2][1] = 0;
                        this.field1435[2][0] = 1363;
                        this.field1435[3][1] = 4096;
                        this.field1435[3][2] = 4096;
                        this.field1435[3][3] = 0;
                        this.field1435[3][0] = 2048;
                        this.field1435[4][0] = 2727;
                        this.field1435[4][2] = 0;
                        this.field1435[4][3] = 0;
                        this.field1435[4][1] = 4096;
                        this.field1435[5][0] = 3411;
                        this.field1435[5][3] = 4096;
                        this.field1435[5][2] = 0;
                        this.field1435[5][1] = 4096;
                        this.field1435[6][2] = 0;
                        this.field1435[6][3] = 4096;
                        this.field1435[6][0] = 4096;
                        this.field1435[6][1] = 0;
                    }
                } else {
                    this.field1435 = new int[8][4];
                    this.field1435[0][2] = 2602;
                    this.field1435[0][1] = 2650;
                    this.field1435[0][3] = 2361;
                    this.field1435[0][0] = 0;
                    this.field1435[1][0] = 2867;
                    this.field1435[1][1] = 2313;
                    this.field1435[1][3] = 1558;
                    this.field1435[1][2] = 1799;
                    this.field1435[2][3] = 1413;
                    this.field1435[2][0] = 3072;
                    this.field1435[2][1] = 2618;
                    this.field1435[2][2] = 1734;
                    this.field1435[3][3] = 947;
                    this.field1435[3][2] = 1220;
                    this.field1435[3][1] = 2296;
                    this.field1435[3][0] = 3276;
                    this.field1435[4][2] = 963;
                    this.field1435[4][1] = 2072;
                    this.field1435[4][0] = 3481;
                    this.field1435[4][3] = 722;
                    this.field1435[5][1] = 2730;
                    this.field1435[5][2] = 2152;
                    this.field1435[5][0] = 3686;
                    this.field1435[5][3] = 1766;
                    this.field1435[6][0] = 3891;
                    this.field1435[6][2] = 1060;
                    this.field1435[6][1] = 2232;
                    this.field1435[6][3] = 915;
                    this.field1435[7][0] = 4096;
                    this.field1435[7][2] = 1413;
                    this.field1435[7][3] = 1140;
                    this.field1435[7][1] = 1686;
                }
            } else {
                this.field1435 = new int[2][4];
                this.field1435[0][3] = 0;
                this.field1435[0][0] = 0;
                this.field1435[0][2] = 0;
                this.field1435[0][1] = 0;
                this.field1435[1][3] = 4096;
                this.field1435[1][2] = 4096;
                this.field1435[1][1] = 4096;
                this.field1435[1][0] = 4096;
            }
        }
        if (arg1 > -17) {
            field1423 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(Z)V", line = 417)
    private final void method606(boolean arg0) {
        ++field1426;
        if (arg0) {
            int var2 = this.field1435.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field1435[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 < var2) {
                        int[] var7 = this.field1435[var4];
                        if (~var4 >= -1) {
                            var8 = var7[3];
                            var9 = var7[1];
                            var10 = var7[2];
                        } else {
                            int[] var11 = this.field1435[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var10 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                            var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field1435[var2 + -1];
                        var9 = var14[1];
                        var8 = var14[3];
                        var10 = var14[2];
                    }
                    int var15 = var8 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var10 >> 4;
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    if (var16 >= 0) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field1424[var3] = class21.method133(class21.method133(var17 << 8, var16 << 16), var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V", line = 542)
    public static void method607(int arg0) {
        int var1 = -30 % ((arg0 - 52) / 45);
        field1434 = null;
        field1437 = null;
        field1423 = null;
        field1430 = null;
        field1438 = null;
        field1432 = null;
    }
}
