import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class261 extends class194 {

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "[I")
    private int[] field3364 = new int[257];

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
    public static int[] field3355 = new int[4096];

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "Lug;")
    public static class287 field3359;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "[[I")
    private int[][] field3358;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    private final void method1648(byte arg0) {
        ++field3361;
        if (arg0 > -62) {
            this.field3358 = null;
        }
        int var2 = this.field3358.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~this.field3358[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 < var2) {
                    int[] var7 = this.field3358[var4];
                    if (var4 <= 0) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field3358[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] - var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field3358[var2 - 1];
                    var9 = var14[2];
                    var8 = var14[3];
                    var10 = var14[1];
                }
                int var15 = var10 >> 4;
                int var16 = var9 >> 4;
                int var17 = var8 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field3364[var3] = class213.method1307(var17, class213.method1307(var16 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)V")
    private final void method1649(int arg0, int arg1) {
        ++field3363;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3358 = new int[4][4];
                                this.field3358[0][2] = 4096;
                                this.field3358[0][1] = 0;
                                this.field3358[0][0] = 2048;
                                this.field3358[0][3] = 0;
                                this.field3358[1][1] = 4096;
                                this.field3358[1][0] = 2867;
                                this.field3358[1][2] = 4096;
                                this.field3358[1][3] = 0;
                                this.field3358[2][3] = 0;
                                this.field3358[2][2] = 4096;
                                this.field3358[2][1] = 4096;
                                this.field3358[2][0] = 3276;
                                this.field3358[3][0] = 4096;
                                this.field3358[3][2] = 0;
                                this.field3358[3][3] = 0;
                                this.field3358[3][1] = 4096;
                            } else {
                                this.field3358 = new int[16][4];
                                this.field3358[0][1] = 80;
                                this.field3358[0][2] = 192;
                                this.field3358[0][3] = 321;
                                this.field3358[0][0] = 0;
                                this.field3358[1][0] = 155;
                                this.field3358[1][3] = 562;
                                this.field3358[1][2] = 449;
                                this.field3358[1][1] = 321;
                                this.field3358[2][0] = 389;
                                this.field3358[2][2] = 690;
                                this.field3358[2][3] = 803;
                                this.field3358[2][1] = 578;
                                this.field3358[3][1] = 947;
                                this.field3358[3][2] = 995;
                                this.field3358[3][0] = 671;
                                this.field3358[3][3] = 1140;
                                this.field3358[4][0] = 897;
                                this.field3358[4][3] = 1509;
                                this.field3358[4][1] = 1285;
                                this.field3358[4][2] = 1397;
                                this.field3358[5][1] = 1525;
                                this.field3358[5][3] = 1413;
                                this.field3358[5][2] = 1429;
                                this.field3358[5][0] = 1175;
                                this.field3358[6][2] = 1461;
                                this.field3358[6][3] = 1333;
                                this.field3358[6][1] = 1734;
                                this.field3358[6][0] = 1368;
                                this.field3358[7][0] = 1507;
                                this.field3358[7][3] = 1702;
                                this.field3358[7][2] = 1525;
                                this.field3358[7][1] = 1413;
                                this.field3358[8][2] = 1590;
                                this.field3358[8][0] = 1736;
                                this.field3358[8][3] = 2056;
                                this.field3358[8][1] = 1108;
                                this.field3358[9][2] = 2056;
                                this.field3358[9][0] = 2088;
                                this.field3358[9][1] = 1766;
                                this.field3358[9][3] = 2666;
                                this.field3358[10][2] = 2586;
                                this.field3358[10][3] = 3276;
                                this.field3358[10][0] = 2355;
                                this.field3358[10][1] = 2409;
                                this.field3358[11][3] = 3228;
                                this.field3358[11][0] = 2691;
                                this.field3358[11][1] = 3116;
                                this.field3358[11][2] = 3148;
                                this.field3358[12][2] = 3710;
                                this.field3358[12][0] = 3031;
                                this.field3358[12][3] = 3196;
                                this.field3358[12][1] = 3806;
                                this.field3358[13][3] = 3019;
                                this.field3358[13][1] = 3437;
                                this.field3358[13][0] = 3522;
                                this.field3358[13][2] = 3421;
                                this.field3358[14][1] = 3116;
                                this.field3358[14][3] = 3228;
                                this.field3358[14][0] = 3727;
                                this.field3358[14][2] = 3148;
                                this.field3358[15][2] = 2505;
                                this.field3358[15][1] = 2377;
                                this.field3358[15][0] = 4096;
                                this.field3358[15][3] = 2746;
                            }
                        } else {
                            this.field3358 = new int[6][4];
                            this.field3358[0][2] = 0;
                            this.field3358[0][3] = 0;
                            this.field3358[0][0] = 0;
                            this.field3358[0][1] = 0;
                            this.field3358[1][2] = 0;
                            this.field3358[1][0] = 1843;
                            this.field3358[1][3] = 1493;
                            this.field3358[1][1] = 0;
                            this.field3358[2][2] = 0;
                            this.field3358[2][3] = 2939;
                            this.field3358[2][1] = 0;
                            this.field3358[2][0] = 2457;
                            this.field3358[3][1] = 0;
                            this.field3358[3][0] = 2781;
                            this.field3358[3][3] = 3565;
                            this.field3358[3][2] = 1124;
                            this.field3358[4][1] = 546;
                            this.field3358[4][2] = 3084;
                            this.field3358[4][3] = 4031;
                            this.field3358[4][0] = 3481;
                            this.field3358[5][0] = 4096;
                            this.field3358[5][3] = 4096;
                            this.field3358[5][2] = 4096;
                            this.field3358[5][1] = 4096;
                        }
                    } else {
                        this.field3358 = new int[7][4];
                        this.field3358[0][0] = 0;
                        this.field3358[0][1] = 0;
                        this.field3358[0][2] = 0;
                        this.field3358[0][3] = 4096;
                        this.field3358[1][1] = 0;
                        this.field3358[1][2] = 4096;
                        this.field3358[1][0] = 663;
                        this.field3358[1][3] = 4096;
                        this.field3358[2][2] = 4096;
                        this.field3358[2][3] = 0;
                        this.field3358[2][0] = 1363;
                        this.field3358[2][1] = 0;
                        this.field3358[3][2] = 4096;
                        this.field3358[3][0] = 2048;
                        this.field3358[3][1] = 4096;
                        this.field3358[3][3] = 0;
                        this.field3358[4][0] = 2727;
                        this.field3358[4][1] = 4096;
                        this.field3358[4][2] = 0;
                        this.field3358[4][3] = 0;
                        this.field3358[5][3] = 4096;
                        this.field3358[5][2] = 0;
                        this.field3358[5][0] = 3411;
                        this.field3358[5][1] = 4096;
                        this.field3358[6][0] = 4096;
                        this.field3358[6][1] = 0;
                        this.field3358[6][2] = 0;
                        this.field3358[6][3] = 4096;
                    }
                } else {
                    this.field3358 = new int[8][4];
                    this.field3358[0][3] = 2361;
                    this.field3358[0][2] = 2602;
                    this.field3358[0][1] = 2650;
                    this.field3358[0][0] = 0;
                    this.field3358[1][0] = 2867;
                    this.field3358[1][2] = 1799;
                    this.field3358[1][1] = 2313;
                    this.field3358[1][3] = 1558;
                    this.field3358[2][1] = 2618;
                    this.field3358[2][0] = 3072;
                    this.field3358[2][2] = 1734;
                    this.field3358[2][3] = 1413;
                    this.field3358[3][0] = 3276;
                    this.field3358[3][2] = 1220;
                    this.field3358[3][1] = 2296;
                    this.field3358[3][3] = 947;
                    this.field3358[4][3] = 722;
                    this.field3358[4][1] = 2072;
                    this.field3358[4][2] = 963;
                    this.field3358[4][0] = 3481;
                    this.field3358[5][0] = 3686;
                    this.field3358[5][3] = 1766;
                    this.field3358[5][2] = 2152;
                    this.field3358[5][1] = 2730;
                    this.field3358[6][3] = 915;
                    this.field3358[6][1] = 2232;
                    this.field3358[6][2] = 1060;
                    this.field3358[6][0] = 3891;
                    this.field3358[7][0] = 4096;
                    this.field3358[7][1] = 1686;
                    this.field3358[7][3] = 1140;
                    this.field3358[7][2] = 1413;
                }
            } else {
                this.field3358 = new int[2][4];
                this.field3358[0][0] = 0;
                this.field3358[0][3] = 0;
                this.field3358[0][2] = 0;
                this.field3358[0][1] = 0;
                this.field3358[1][1] = 4096;
                this.field3358[1][3] = 4096;
                this.field3358[1][0] = 4096;
                this.field3358[1][2] = 4096;
            }
        }
        if (arg0 != 1) {
            field3355 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field3357;
        if (~arg0 == -1) {
            int var4 = arg2.method1563(-128);
            if (var4 != 0) {
                this.method1649(1, var4);
            } else {
                this.field3358 = new int[arg2.method1563(-128)][4];
                for (int var5 = 0; this.field3358.length > var5; ++var5) {
                    this.field3358[var5][0] = arg2.method1587((byte) -102);
                    this.field3358[var5][1] = arg2.method1563(-128) << 4;
                    this.field3358[var5][2] = arg2.method1563(-128) << 4;
                    this.field3358[var5][3] = arg2.method1563(-128) << 4;
                }
            }
        }
        int var6 = -113 % ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(JIBI)V")
    public static final void method1650(long arg0, int arg1, byte arg2, int arg3) {
        ++field3360;
        int var5 = (int) arg0 >> 14 & 31;
        int var6 = (3174255 & (int) arg0) >> 20;
        int var7 = -37 % ((arg2 - 51) / 51);
        int var8 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && ~var5 != -12 && ~var5 != -23) {
            class94.method586(arg1, 1, arg3, var5, class143.field1684.field2480[0], 0, 0, var6, true, class143.field1684.field2482[0], 0);
        } else {
            class446 var9 = class380.method2361(var8, -29012);
            int var10;
            int var11;
            if (var6 != 0 && ~var6 != -3) {
                var10 = var9.field6170;
                var11 = var9.field6244;
            } else {
                var11 = var9.field6170;
                var10 = var9.field6244;
            }
            int var12 = var9.field6197;
            if (var6 != 0) {
                var12 = (15 & var12 << var6) - -(var12 >> -var6 + 4);
            }
            class94.method586(arg1, 1, arg3, 0, class143.field1684.field2480[0], var10, var11, 0, true, class143.field1684.field2482[0], var12);
        }
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V")
    public static final void method1651(int arg0) {
        for (int var1 = 0; ~class341.field4651 < ~var1; ++var1) {
            int var2 = class332.field4530[var1];
            class131 var3 = class212.field2584[var2];
            int var4 = class215.field2658.method1563(-128);
            if ((16 & var4) != 0) {
                var4 += class215.field2658.method1563(-128) << 8;
            }
            class50.method277(-1, var4, var3, var2);
        }
        ++field3365;
        if (arg0 >= -12) {
            method1654((byte) 66);
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(II)I")
    public static final int method1652(int arg0, int arg1) {
        return class134.field1536 != null ? class134.field1536[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field3356;
        if (arg0 != -730) {
            field3359 = null;
        }
        int[][] var3 = super.field2283.method1667(arg1, -127);
        if (super.field2283.field3451) {
            int[] var4 = this.method1203(0, 91, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class138.field1579 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3364[var9];
                var5[var8] = class191.method1183(var10 >> 12, 4080);
                var6[var8] = class191.method1183(var10, 65280) >> 4;
                var7[var8] = class191.method1183(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(III)I")
    public static final int method1653(int arg0, int arg1, int arg2) {
        ++field3362;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg1) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return arg0 <= 94 ? -63 : (65408 & arg1) - -var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        ++field3366;
        int var2 = -86 % ((28 - arg0) / 63);
        if (this.field3358 == null) {
            this.method1649(1, 1);
        }
        this.method1648((byte) -75);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
    public static void method1654(byte arg0) {
        if (arg0 != 44) {
            method1654((byte) -31);
        }
        field3359 = null;
        field3355 = null;
    }
}
