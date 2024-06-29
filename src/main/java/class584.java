import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class584 extends class751 {

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "[I")
    private int[] field8263 = new int[257];

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "Lke;")
    public static class622 field8260 = new class622(91, 4);

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "Lmia;")
    public static class69 field8265;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "[[I")
    private int[][] field8259;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(IB)I", line = 7)
    public static final int method3386(int arg0, byte arg1) {
        ++field8261;
        if (arg1 > -86) {
            method3390((class176) null, -51, -66, -43);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)V", line = 23)
    private final void method3387(int arg0, int arg1) {
        ++field8264;
        if (arg1 >= -31) {
            this.field8259 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field8259 = new int[4][4];
                                    this.field8259[0][2] = 4096;
                                    this.field8259[0][1] = 0;
                                    this.field8259[0][3] = 0;
                                    this.field8259[0][0] = 2048;
                                    this.field8259[1][2] = 4096;
                                    this.field8259[1][1] = 4096;
                                    this.field8259[1][3] = 0;
                                    this.field8259[1][0] = 2867;
                                    this.field8259[2][3] = 0;
                                    this.field8259[2][1] = 4096;
                                    this.field8259[2][2] = 4096;
                                    this.field8259[2][0] = 3276;
                                    this.field8259[3][0] = 4096;
                                    this.field8259[3][2] = 0;
                                    this.field8259[3][3] = 0;
                                    this.field8259[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field8259 = new int[16][4];
                                this.field8259[0][2] = 192;
                                this.field8259[0][0] = 0;
                                this.field8259[0][3] = 321;
                                this.field8259[0][1] = 80;
                                this.field8259[1][3] = 562;
                                this.field8259[1][1] = 321;
                                this.field8259[1][2] = 449;
                                this.field8259[1][0] = 155;
                                this.field8259[2][3] = 803;
                                this.field8259[2][2] = 690;
                                this.field8259[2][1] = 578;
                                this.field8259[2][0] = 389;
                                this.field8259[3][2] = 995;
                                this.field8259[3][3] = 1140;
                                this.field8259[3][1] = 947;
                                this.field8259[3][0] = 671;
                                this.field8259[4][1] = 1285;
                                this.field8259[4][2] = 1397;
                                this.field8259[4][0] = 897;
                                this.field8259[4][3] = 1509;
                                this.field8259[5][1] = 1525;
                                this.field8259[5][3] = 1413;
                                this.field8259[5][0] = 1175;
                                this.field8259[5][2] = 1429;
                                this.field8259[6][3] = 1333;
                                this.field8259[6][0] = 1368;
                                this.field8259[6][1] = 1734;
                                this.field8259[6][2] = 1461;
                                this.field8259[7][3] = 1702;
                                this.field8259[7][1] = 1413;
                                this.field8259[7][2] = 1525;
                                this.field8259[7][0] = 1507;
                                this.field8259[8][1] = 1108;
                                this.field8259[8][3] = 2056;
                                this.field8259[8][0] = 1736;
                                this.field8259[8][2] = 1590;
                                this.field8259[9][3] = 2666;
                                this.field8259[9][0] = 2088;
                                this.field8259[9][1] = 1766;
                                this.field8259[9][2] = 2056;
                                this.field8259[10][3] = 3276;
                                this.field8259[10][0] = 2355;
                                this.field8259[10][1] = 2409;
                                this.field8259[10][2] = 2586;
                                this.field8259[11][2] = 3148;
                                this.field8259[11][3] = 3228;
                                this.field8259[11][1] = 3116;
                                this.field8259[11][0] = 2691;
                                this.field8259[12][1] = 3806;
                                this.field8259[12][3] = 3196;
                                this.field8259[12][0] = 3031;
                                this.field8259[12][2] = 3710;
                                this.field8259[13][3] = 3019;
                                this.field8259[13][2] = 3421;
                                this.field8259[13][0] = 3522;
                                this.field8259[13][1] = 3437;
                                this.field8259[14][1] = 3116;
                                this.field8259[14][2] = 3148;
                                this.field8259[14][0] = 3727;
                                this.field8259[14][3] = 3228;
                                this.field8259[15][2] = 2505;
                                this.field8259[15][1] = 2377;
                                this.field8259[15][0] = 4096;
                                this.field8259[15][3] = 2746;
                            }
                        } else {
                            this.field8259 = new int[6][4];
                            this.field8259[0][3] = 0;
                            this.field8259[0][1] = 0;
                            this.field8259[0][2] = 0;
                            this.field8259[0][0] = 0;
                            this.field8259[1][1] = 0;
                            this.field8259[1][0] = 1843;
                            this.field8259[1][2] = 0;
                            this.field8259[1][3] = 1493;
                            this.field8259[2][2] = 0;
                            this.field8259[2][0] = 2457;
                            this.field8259[2][3] = 2939;
                            this.field8259[2][1] = 0;
                            this.field8259[3][0] = 2781;
                            this.field8259[3][1] = 0;
                            this.field8259[3][2] = 1124;
                            this.field8259[3][3] = 3565;
                            this.field8259[4][1] = 546;
                            this.field8259[4][3] = 4031;
                            this.field8259[4][2] = 3084;
                            this.field8259[4][0] = 3481;
                            this.field8259[5][2] = 4096;
                            this.field8259[5][0] = 4096;
                            this.field8259[5][3] = 4096;
                            this.field8259[5][1] = 4096;
                        }
                    } else {
                        this.field8259 = new int[7][4];
                        this.field8259[0][3] = 4096;
                        this.field8259[0][1] = 0;
                        this.field8259[0][0] = 0;
                        this.field8259[0][2] = 0;
                        this.field8259[1][2] = 4096;
                        this.field8259[1][1] = 0;
                        this.field8259[1][0] = 663;
                        this.field8259[1][3] = 4096;
                        this.field8259[2][3] = 0;
                        this.field8259[2][1] = 0;
                        this.field8259[2][0] = 1363;
                        this.field8259[2][2] = 4096;
                        this.field8259[3][1] = 4096;
                        this.field8259[3][2] = 4096;
                        this.field8259[3][3] = 0;
                        this.field8259[3][0] = 2048;
                        this.field8259[4][3] = 0;
                        this.field8259[4][0] = 2727;
                        this.field8259[4][2] = 0;
                        this.field8259[4][1] = 4096;
                        this.field8259[5][1] = 4096;
                        this.field8259[5][0] = 3411;
                        this.field8259[5][3] = 4096;
                        this.field8259[5][2] = 0;
                        this.field8259[6][2] = 0;
                        this.field8259[6][0] = 4096;
                        this.field8259[6][3] = 4096;
                        this.field8259[6][1] = 0;
                    }
                } else {
                    this.field8259 = new int[8][4];
                    this.field8259[0][1] = 2650;
                    this.field8259[0][3] = 2361;
                    this.field8259[0][0] = 0;
                    this.field8259[0][2] = 2602;
                    this.field8259[1][1] = 2313;
                    this.field8259[1][2] = 1799;
                    this.field8259[1][3] = 1558;
                    this.field8259[1][0] = 2867;
                    this.field8259[2][3] = 1413;
                    this.field8259[2][1] = 2618;
                    this.field8259[2][0] = 3072;
                    this.field8259[2][2] = 1734;
                    this.field8259[3][2] = 1220;
                    this.field8259[3][0] = 3276;
                    this.field8259[3][1] = 2296;
                    this.field8259[3][3] = 947;
                    this.field8259[4][0] = 3481;
                    this.field8259[4][3] = 722;
                    this.field8259[4][1] = 2072;
                    this.field8259[4][2] = 963;
                    this.field8259[5][0] = 3686;
                    this.field8259[5][2] = 2152;
                    this.field8259[5][1] = 2730;
                    this.field8259[5][3] = 1766;
                    this.field8259[6][0] = 3891;
                    this.field8259[6][1] = 2232;
                    this.field8259[6][2] = 1060;
                    this.field8259[6][3] = 915;
                    this.field8259[7][3] = 1140;
                    this.field8259[7][0] = 4096;
                    this.field8259[7][2] = 1413;
                    this.field8259[7][1] = 1686;
                }
            } else {
                this.field8259 = new int[2][4];
                this.field8259[0][2] = 0;
                this.field8259[0][0] = 0;
                this.field8259[0][3] = 0;
                this.field8259[0][1] = 0;
                this.field8259[1][0] = 4096;
                this.field8259[1][1] = 4096;
                this.field8259[1][2] = 4096;
                this.field8259[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 273)
    public final void method1454(byte arg0) {
        if (this.field8259 == null) {
            this.method3387(1, -60);
        }
        ++field8256;
        this.method3389(-117);
        if (arg0 <= 123) {
            method3386(36, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILrv;I)V", line = 288)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field8257;
        int var4 = 126 % ((25 - arg0) / 63);
        if (~arg2 == -1) {
            int var5 = arg1.method842(2384);
            if (~var5 != -1) {
                this.method3387(var5, -102);
            } else {
                this.field8259 = new int[arg1.method842(2384)][4];
                for (int var6 = 0; ~var6 > ~this.field8259.length; ++var6) {
                    this.field8259[var6][0] = arg1.method898((byte) -94);
                    this.field8259[var6][1] = arg1.method842(2384) << 4;
                    this.field8259[var6][2] = arg1.method842(2384) << 4;
                    this.field8259[var6][3] = arg1.method842(2384) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V", line = 327)
    public static void method3388(int arg0) {
        field8265 = null;
        if (arg0 >= -115) {
            method3390((class176) null, -54, -36, 94);
        }
        field8260 = null;
    }

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)V", line = 339)
    private final void method3389(int arg0) {
        ++field8266;
        if (arg0 < -104) {
            int var2 = this.field8259.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && ~this.field8259[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var2 >= ~var4) {
                        int[] var7 = this.field8259[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field8259[var4];
                        if (~var4 < -1) {
                            int[] var12 = this.field8259[var4 - 1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                            int var14 = 4096 - var13;
                            var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                            var9 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                            var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        } else {
                            var9 = var11[3];
                            var8 = var11[2];
                            var10 = var11[1];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var8 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field8263[var3] = class281.method1904(var15, class281.method1904(var16 << 16, var17 << 8));
                }
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lwq;III)V", line = 446)
    public static final void method3390(class176 arg0, int arg1, int arg2, int arg3) {
        ++field8258;
        if (arg0.field2634 != 0) {
            if (arg0.field2634 == 1) {
                arg0.field2578 = (-arg0.field2664 + arg2) / 2 + arg0.field2589;
            } else if (arg0.field2634 == 2) {
                arg0.field2578 = arg2 - arg0.field2664 + -arg0.field2589;
            } else if (~arg0.field2634 == -4) {
                arg0.field2578 = arg0.field2589 * arg2 >> 14;
            } else if (~arg0.field2634 != -5) {
                arg0.field2578 = -(arg0.field2589 * arg2 >> 14) + arg2 + -arg0.field2664;
            } else {
                arg0.field2578 = (arg0.field2589 * arg2 >> 14) + (-arg0.field2664 + arg2) / 2;
            }
        } else {
            arg0.field2578 = arg0.field2589;
        }
        if (~arg0.field2581 != -1) {
            if (arg0.field2581 != 1) {
                if (~arg0.field2581 != -3) {
                    if (arg0.field2581 == 3) {
                        arg0.field2599 = arg0.field2602 * arg1 >> 14;
                    } else if (arg0.field2581 == 4) {
                        arg0.field2599 = (-arg0.field2673 + arg1) / 2 - -(arg0.field2602 * arg1 >> 14);
                    } else {
                        arg0.field2599 = -(arg0.field2602 * arg1 >> 14) + arg1 - arg0.field2673;
                    }
                } else {
                    arg0.field2599 = -arg0.field2673 - arg0.field2602 + arg1;
                }
            } else {
                arg0.field2599 = (arg1 - arg0.field2673) / 2 + arg0.field2602;
            }
        } else {
            arg0.field2599 = arg0.field2602;
        }
        if (class52.field744 && (~client.method2049(arg0).field9229 != -1 || ~arg0.field2560 == -1)) {
            if (~arg0.field2599 > -1) {
                arg0.field2599 = 0;
            } else if (arg1 < arg0.field2673 + arg0.field2599) {
                arg0.field2599 = -arg0.field2673 + arg1;
            }
            if (arg0.field2578 < 0) {
                arg0.field2578 = 0;
            } else if (~(arg0.field2664 + arg0.field2578) < ~arg2) {
                arg0.field2578 = -arg0.field2664 + arg2;
            }
        }
        if (arg3 != 3) {
            method3386(86, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V", line = 523)
    public class584() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)[[I", line = 528)
    public final int[][] method147(int arg0, byte arg1) {
        ++field8262;
        if (arg1 != 57) {
            this.method309(-57, (class120) null, 6);
        }
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int[] var4 = this.method4173(arg0, (byte) -119, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class673.field9452; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field8263[var9];
                var5[var8] = class111.method773(4080, var10 >> 12);
                var6[var8] = class111.method773(4080, var10 >> 4);
                var7[var8] = class111.method773(4080, var10 << 4);
            }
        }
        return var3;
    }
}
