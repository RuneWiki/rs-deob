import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class106 extends class224 {

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
    private int[] field1635 = new int[257];

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1632 = "scroll:";

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field1638 = 0;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "[[I")
    public static int[][] field1637;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[[I")
    private int[][] field1640;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method201(255);
            if (var4 == 0) {
                this.field1640 = new int[arg0.method201(255)][4];
                for (int var5 = 0; var5 < this.field1640.length; ++var5) {
                    this.field1640[var5][0] = arg0.method190(-3);
                    this.field1640[var5][1] = arg0.method201(255) << 4;
                    this.field1640[var5][2] = arg0.method201(255) << 4;
                    this.field1640[var5][3] = arg0.method201(255) << 4;
                }
            } else {
                this.method697(26321, var4);
            }
        }
        if (arg2 <= -46) {
            ++field1633;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method692(byte arg0) {
        if (arg0 == -5) {
            field1632 = null;
            field1637 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 >= -4) {
            field1637 = null;
        }
        if (this.field1640 == null) {
            this.method697(26321, 1);
        }
        ++field1631;
        this.method694(false);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
    public static final void method693(String arg0, int arg1, String arg2, byte arg3) {
        class107.method700(-1, arg1, arg0, true, (String) null, arg2);
        ++field1628;
        int var4 = -18 / ((2 - arg3) / 55);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(Z)V")
    private final void method694(boolean arg0) {
        if (!arg0) {
            ++field1636;
            int var2 = this.field1640.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && var5 >= this.field1640[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field1640[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[3];
                            var10 = var7[1];
                        } else {
                            int[] var11 = this.field1640[var4 - 1];
                            int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                            var9 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                            var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field1640[var2 + -1];
                        var10 = var14[1];
                        var9 = var14[3];
                        var8 = var14[2];
                    }
                    int var15 = var10 >> 4;
                    int var16 = var9 >> 4;
                    int var17 = var8 >> 4;
                    if (~var15 <= -1) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    this.field1635[var3] = class120.method787(class120.method787(var15 << 16, var17 << 8), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
    public static final void method695(int arg0, int arg1, int arg2) {
        ++field1639;
        class46 var3 = class243.field3891[class276.field4398][arg1][arg2];
        if (var3 == null) {
            class83.method577(class276.field4398, arg1, arg2);
        } else {
            int var4 = -99999999;
            class26 var5 = null;
            for (class26 var6 = (class26) var3.method350(8240); var6 != null; var6 = (class26) var3.method353((byte) -113)) {
                class253 var13 = class162.method1112(var6.field365.field2761, (byte) 99);
                int var14 = var13.field4068;
                if (~var13.field4072 == -2) {
                    var14 = (var6.field365.field2765 + 1) * var14;
                }
                if (var14 > var4) {
                    var5 = var6;
                    var4 = var14;
                }
            }
            if (var5 == null) {
                class83.method577(class276.field4398, arg1, arg2);
            } else {
                var3.method351(var5, -83);
                class26 var7 = (class26) var3.method350(8240);
                class177 var8 = null;
                class177 var9 = null;
                if (arg0 == 1) {
                    while (var7 != null) {
                        class177 var12 = var7.field365;
                        if (~var5.field365.field2761 != ~var12.field2761) {
                            if (var8 == null) {
                                var8 = var12;
                            }
                            if (var8.field2761 != var12.field2761 && var9 == null) {
                                var9 = var12;
                            }
                        }
                        var7 = (class26) var3.method353((byte) -113);
                    }
                    long var10 = (long) (arg1 - -(arg2 << 7) + 1610612736);
                    class45.method342(class276.field4398, arg1, arg2, class99.method658(arg2 * 128 + 64, class276.field4398, arg1 * 128 + 64, -7185), var5.field365, var10, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(ZI)I")
    public static final int method696(boolean arg0, int arg1) {
        if (class240.field3833 != null) {
            class240.field3833.method1842(false);
            class240.field3833 = null;
        }
        if (arg0) {
            method696(false, -97);
        }
        ++field1630;
        ++class284.field4496;
        if (~class284.field4496 < -5) {
            class284.field4496 = 0;
            class131.field1917 = 0;
            return arg1;
        } else {
            if (class202.field3170 == class155.field2304) {
                class155.field2304 = class209.field3263;
            } else {
                class155.field2304 = class202.field3170;
            }
            class131.field1917 = 0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II)V")
    private final void method697(int arg0, int arg1) {
        ++field1627;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1640 = new int[4][4];
                                this.field1640[0][1] = 0;
                                this.field1640[0][3] = 0;
                                this.field1640[0][2] = 4096;
                                this.field1640[1][1] = 4096;
                                this.field1640[0][0] = 2048;
                                this.field1640[2][1] = 4096;
                                this.field1640[1][2] = 4096;
                                this.field1640[1][0] = 2867;
                                this.field1640[1][3] = 0;
                                this.field1640[2][0] = 3276;
                                this.field1640[2][3] = 0;
                                this.field1640[3][1] = 4096;
                                this.field1640[3][3] = 0;
                                this.field1640[3][0] = 4096;
                                this.field1640[2][2] = 4096;
                                this.field1640[3][2] = 0;
                            } else {
                                this.field1640 = new int[16][4];
                                this.field1640[0][1] = 80;
                                this.field1640[1][1] = 321;
                                this.field1640[0][3] = 321;
                                this.field1640[1][3] = 562;
                                this.field1640[2][3] = 803;
                                this.field1640[0][0] = 0;
                                this.field1640[3][3] = 1140;
                                this.field1640[1][0] = 155;
                                this.field1640[2][1] = 578;
                                this.field1640[3][1] = 947;
                                this.field1640[2][0] = 389;
                                this.field1640[4][3] = 1509;
                                this.field1640[4][1] = 1285;
                                this.field1640[5][1] = 1525;
                                this.field1640[0][2] = 192;
                                this.field1640[1][2] = 449;
                                this.field1640[3][0] = 671;
                                this.field1640[2][2] = 690;
                                this.field1640[5][3] = 1413;
                                this.field1640[6][3] = 1333;
                                this.field1640[7][3] = 1702;
                                this.field1640[8][3] = 2056;
                                this.field1640[3][2] = 995;
                                this.field1640[4][2] = 1397;
                                this.field1640[5][2] = 1429;
                                this.field1640[9][3] = 2666;
                                this.field1640[10][3] = 3276;
                                this.field1640[6][1] = 1734;
                                this.field1640[7][1] = 1413;
                                this.field1640[6][2] = 1461;
                                this.field1640[11][3] = 3228;
                                this.field1640[7][2] = 1525;
                                this.field1640[4][0] = 897;
                                this.field1640[8][1] = 1108;
                                this.field1640[8][2] = 1590;
                                this.field1640[9][2] = 2056;
                                this.field1640[12][3] = 3196;
                                this.field1640[5][0] = 1175;
                                this.field1640[9][1] = 1766;
                                this.field1640[10][1] = 2409;
                                this.field1640[11][1] = 3116;
                                this.field1640[12][1] = 3806;
                                this.field1640[13][1] = 3437;
                                this.field1640[10][2] = 2586;
                                this.field1640[11][2] = 3148;
                                this.field1640[12][2] = 3710;
                                this.field1640[13][2] = 3421;
                                this.field1640[14][2] = 3148;
                                this.field1640[13][3] = 3019;
                                this.field1640[6][0] = 1368;
                                this.field1640[15][2] = 2505;
                                this.field1640[7][0] = 1507;
                                this.field1640[14][3] = 3228;
                                this.field1640[15][3] = 2746;
                                this.field1640[14][1] = 3116;
                                this.field1640[15][1] = 2377;
                                this.field1640[8][0] = 1736;
                                this.field1640[9][0] = 2088;
                                this.field1640[10][0] = 2355;
                                this.field1640[11][0] = 2691;
                                this.field1640[12][0] = 3031;
                                this.field1640[13][0] = 3522;
                                this.field1640[14][0] = 3727;
                                this.field1640[15][0] = 4096;
                            }
                        } else {
                            this.field1640 = new int[6][4];
                            this.field1640[0][1] = 0;
                            this.field1640[0][2] = 0;
                            this.field1640[0][0] = 0;
                            this.field1640[0][3] = 0;
                            this.field1640[1][1] = 0;
                            this.field1640[2][1] = 0;
                            this.field1640[1][3] = 1493;
                            this.field1640[1][0] = 1843;
                            this.field1640[2][0] = 2457;
                            this.field1640[3][0] = 2781;
                            this.field1640[4][0] = 3481;
                            this.field1640[2][3] = 2939;
                            this.field1640[5][0] = 4096;
                            this.field1640[3][3] = 3565;
                            this.field1640[1][2] = 0;
                            this.field1640[3][1] = 0;
                            this.field1640[4][1] = 546;
                            this.field1640[5][1] = 4096;
                            this.field1640[4][3] = 4031;
                            this.field1640[5][3] = 4096;
                            this.field1640[2][2] = 0;
                            this.field1640[3][2] = 1124;
                            this.field1640[4][2] = 3084;
                            this.field1640[5][2] = 4096;
                        }
                    } else {
                        this.field1640 = new int[7][4];
                        this.field1640[0][1] = 0;
                        this.field1640[1][1] = 0;
                        this.field1640[0][0] = 0;
                        this.field1640[1][0] = 663;
                        this.field1640[0][3] = 4096;
                        this.field1640[2][1] = 0;
                        this.field1640[0][2] = 0;
                        this.field1640[1][2] = 4096;
                        this.field1640[2][0] = 1363;
                        this.field1640[1][3] = 4096;
                        this.field1640[2][3] = 0;
                        this.field1640[2][2] = 4096;
                        this.field1640[3][2] = 4096;
                        this.field1640[3][0] = 2048;
                        this.field1640[3][1] = 4096;
                        this.field1640[4][2] = 0;
                        this.field1640[4][0] = 2727;
                        this.field1640[5][2] = 0;
                        this.field1640[4][1] = 4096;
                        this.field1640[5][1] = 4096;
                        this.field1640[3][3] = 0;
                        this.field1640[6][2] = 0;
                        this.field1640[6][1] = 0;
                        this.field1640[5][0] = 3411;
                        this.field1640[4][3] = 0;
                        this.field1640[5][3] = 4096;
                        this.field1640[6][3] = 4096;
                        this.field1640[6][0] = 4096;
                    }
                } else {
                    this.field1640 = new int[8][4];
                    this.field1640[0][0] = 0;
                    this.field1640[0][3] = 2361;
                    this.field1640[1][0] = 2867;
                    this.field1640[2][0] = 3072;
                    this.field1640[1][3] = 1558;
                    this.field1640[0][1] = 2650;
                    this.field1640[0][2] = 2602;
                    this.field1640[2][3] = 1413;
                    this.field1640[1][2] = 1799;
                    this.field1640[3][3] = 947;
                    this.field1640[4][3] = 722;
                    this.field1640[1][1] = 2313;
                    this.field1640[2][1] = 2618;
                    this.field1640[5][3] = 1766;
                    this.field1640[3][0] = 3276;
                    this.field1640[4][0] = 3481;
                    this.field1640[3][1] = 2296;
                    this.field1640[5][0] = 3686;
                    this.field1640[4][1] = 2072;
                    this.field1640[2][2] = 1734;
                    this.field1640[6][3] = 915;
                    this.field1640[5][1] = 2730;
                    this.field1640[7][3] = 1140;
                    this.field1640[3][2] = 1220;
                    this.field1640[6][1] = 2232;
                    this.field1640[4][2] = 963;
                    this.field1640[5][2] = 2152;
                    this.field1640[7][1] = 1686;
                    this.field1640[6][0] = 3891;
                    this.field1640[6][2] = 1060;
                    this.field1640[7][0] = 4096;
                    this.field1640[7][2] = 1413;
                }
            } else {
                this.field1640 = new int[2][4];
                this.field1640[0][2] = 0;
                this.field1640[0][1] = 0;
                this.field1640[0][0] = 0;
                this.field1640[1][2] = 4096;
                this.field1640[1][1] = 4096;
                this.field1640[1][0] = 4096;
                this.field1640[0][3] = 0;
                this.field1640[1][3] = 4096;
            }
        }
        if (arg0 != 26321) {
            field1634 = -115;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field1629;
        if (arg1 != 1) {
            method695(-42, 46, -18);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class78.field1108; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1635[var9];
                var5[var8] = class224.method1526(16711680, var10) >> 12;
                var6[var8] = class224.method1526(var10, 65280) >> 4;
                var7[var8] = class224.method1526(255, var10) << 4;
            }
        }
        return var3;
    }
}
