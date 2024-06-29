import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class32 extends class76 {

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "[I")
    private int[] field620 = new int[257];

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "[S")
    public static short[] field616 = new short[500];

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "[S")
    public static short[] field625 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    public static int field624 = 1;

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "D")
    public static double field628;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "Lmb;")
    public static class178 field622;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "[[I")
    private int[][] field631;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field632;
        if (this.field631 == null) {
            this.method275(1333, 1);
        }
        this.method269(-1034);
        if (arg0 != 111) {
            this.field631 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
    private final void method269(int arg0) {
        ++field623;
        if (arg0 != -1034) {
            method273((byte) 46);
        }
        int var2 = this.field631.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field631[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 > ~var2) {
                    int[] var7 = this.field631[var4];
                    if (var4 <= 0) {
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field631[var4 + -1];
                        int var12 = (var5 - var11[0] << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                        var10 = var7[2] * var12 + var11[2] * var13 >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field631[var2 + -1];
                    var8 = var14[1];
                    var10 = var14[2];
                    var9 = var14[3];
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                this.field620[var3] = class198.method1332(var16, class198.method1332(var17 << 8, var15 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIII)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field617;
        if (arg0 == 2) {
            if (class123.field2211 <= -arg2 + arg3 && ~class145.field2540 <= ~(arg2 + arg3) && class40.field834 <= -arg2 + arg4 && ~(arg2 + arg4) >= ~class255.field4371) {
                class246.method1616(126, arg4, arg3, arg1, arg2);
            } else {
                class241.method1585(arg2, 30029, arg1, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V")
    public static final void method271(int arg0, int arg1) {
        class177 var2 = class75.field1463[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class177 var4 = class75.field1463[var3][arg0][arg1] = class75.field1463[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field3025;
                for (int var5 = 0; var5 < var4.field3012; ++var5) {
                    class154 var6 = var4.field3017[var5];
                    if ((var6.field2702 >> 29 & 3L) == 2L && var6.field2693 == arg0 && var6.field2688 == arg1) {
                        --var6.field2699;
                    }
                }
            }
        }
        if (class75.field1463[0][arg0][arg1] == null) {
            class75.field1463[0][arg0][arg1] = new class177(0, arg0, arg1);
        }
        class75.field1463[0][arg0][arg1].field3031 = var2;
        class75.field1463[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method272(boolean arg0) {
        class187.field3245.method833(0);
        if (arg0) {
            ++field630;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public static final void method273(byte arg0) {
        class20.field419.method833(0);
        if (arg0 < 55) {
            method270(-10, -92, -18, 95, -25);
        }
        ++field629;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            this.field620 = null;
        }
        if (~arg2 == -1) {
            int var4 = arg0.method1051((byte) 123);
            if (var4 != 0) {
                this.method275(1333, var4);
            } else {
                this.field631 = new int[arg0.method1051((byte) 105)][4];
                for (int var5 = 0; this.field631.length > var5; ++var5) {
                    this.field631[var5][0] = arg0.method1063(-17162);
                    this.field631[var5][1] = arg0.method1051((byte) 115) << 4;
                    this.field631[var5][2] = arg0.method1051((byte) -117) << 4;
                    this.field631[var5][3] = arg0.method1051((byte) -103) << 4;
                }
            }
        }
        ++field618;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field627;
        if (arg1 < 2) {
            field622 = null;
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[] var4 = this.method562(arg0, 0, (byte) -104);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; class96.field1807 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field620[var9];
                var7[var8] = class30.method252(4080, var10 >> 12);
                var6[var8] = class30.method252(var10, 65280) >> 4;
                var5[var8] = class30.method252(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
    public static void method274(byte arg0) {
        field622 = null;
        field625 = null;
        if (arg0 < -60) {
            field616 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(II)V")
    private final void method275(int arg0, int arg1) {
        ++field626;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field631 = new int[4][4];
                                this.field631[0][1] = 0;
                                this.field631[1][1] = 4096;
                                this.field631[2][1] = 4096;
                                this.field631[3][1] = 4096;
                                this.field631[0][2] = 4096;
                                this.field631[1][2] = 4096;
                                this.field631[0][0] = 2048;
                                this.field631[1][0] = 2867;
                                this.field631[2][0] = 3276;
                                this.field631[2][2] = 4096;
                                this.field631[3][2] = 0;
                                this.field631[3][0] = 4096;
                                this.field631[0][3] = 0;
                                this.field631[1][3] = 0;
                                this.field631[2][3] = 0;
                                this.field631[3][3] = 0;
                            } else {
                                this.field631 = new int[16][4];
                                this.field631[0][2] = 192;
                                this.field631[0][1] = 80;
                                this.field631[1][1] = 321;
                                this.field631[2][1] = 578;
                                this.field631[1][2] = 449;
                                this.field631[3][1] = 947;
                                this.field631[2][2] = 690;
                                this.field631[0][0] = 0;
                                this.field631[0][3] = 321;
                                this.field631[4][1] = 1285;
                                this.field631[1][3] = 562;
                                this.field631[3][2] = 995;
                                this.field631[1][0] = 155;
                                this.field631[2][0] = 389;
                                this.field631[5][1] = 1525;
                                this.field631[3][0] = 671;
                                this.field631[4][0] = 897;
                                this.field631[2][3] = 803;
                                this.field631[3][3] = 1140;
                                this.field631[6][1] = 1734;
                                this.field631[5][0] = 1175;
                                this.field631[7][1] = 1413;
                                this.field631[4][3] = 1509;
                                this.field631[8][1] = 1108;
                                this.field631[5][3] = 1413;
                                this.field631[9][1] = 1766;
                                this.field631[10][1] = 2409;
                                this.field631[6][3] = 1333;
                                this.field631[6][0] = 1368;
                                this.field631[4][2] = 1397;
                                this.field631[5][2] = 1429;
                                this.field631[7][0] = 1507;
                                this.field631[7][3] = 1702;
                                this.field631[8][0] = 1736;
                                this.field631[9][0] = 2088;
                                this.field631[11][1] = 3116;
                                this.field631[12][1] = 3806;
                                this.field631[6][2] = 1461;
                                this.field631[7][2] = 1525;
                                this.field631[10][0] = 2355;
                                this.field631[11][0] = 2691;
                                this.field631[8][3] = 2056;
                                this.field631[12][0] = 3031;
                                this.field631[9][3] = 2666;
                                this.field631[13][1] = 3437;
                                this.field631[14][1] = 3116;
                                this.field631[8][2] = 1590;
                                this.field631[9][2] = 2056;
                                this.field631[15][1] = 2377;
                                this.field631[13][0] = 3522;
                                this.field631[10][3] = 3276;
                                this.field631[10][2] = 2586;
                                this.field631[11][2] = 3148;
                                this.field631[12][2] = 3710;
                                this.field631[14][0] = 3727;
                                this.field631[13][2] = 3421;
                                this.field631[15][0] = 4096;
                                this.field631[14][2] = 3148;
                                this.field631[11][3] = 3228;
                                this.field631[15][2] = 2505;
                                this.field631[12][3] = 3196;
                                this.field631[13][3] = 3019;
                                this.field631[14][3] = 3228;
                                this.field631[15][3] = 2746;
                            }
                        } else {
                            this.field631 = new int[6][4];
                            this.field631[0][0] = 0;
                            this.field631[0][2] = 0;
                            this.field631[0][3] = 0;
                            this.field631[0][1] = 0;
                            this.field631[1][2] = 0;
                            this.field631[1][3] = 1493;
                            this.field631[2][3] = 2939;
                            this.field631[1][0] = 1843;
                            this.field631[1][1] = 0;
                            this.field631[2][2] = 0;
                            this.field631[3][3] = 3565;
                            this.field631[2][0] = 2457;
                            this.field631[3][2] = 1124;
                            this.field631[2][1] = 0;
                            this.field631[3][1] = 0;
                            this.field631[4][1] = 546;
                            this.field631[3][0] = 2781;
                            this.field631[5][1] = 4096;
                            this.field631[4][0] = 3481;
                            this.field631[5][0] = 4096;
                            this.field631[4][2] = 3084;
                            this.field631[4][3] = 4031;
                            this.field631[5][3] = 4096;
                            this.field631[5][2] = 4096;
                        }
                    } else {
                        this.field631 = new int[7][4];
                        this.field631[0][1] = 0;
                        this.field631[0][3] = 4096;
                        this.field631[1][1] = 0;
                        this.field631[1][3] = 4096;
                        this.field631[0][0] = 0;
                        this.field631[0][2] = 0;
                        this.field631[2][1] = 0;
                        this.field631[3][1] = 4096;
                        this.field631[1][0] = 663;
                        this.field631[2][0] = 1363;
                        this.field631[1][2] = 4096;
                        this.field631[3][0] = 2048;
                        this.field631[2][2] = 4096;
                        this.field631[4][1] = 4096;
                        this.field631[4][0] = 2727;
                        this.field631[5][0] = 3411;
                        this.field631[3][2] = 4096;
                        this.field631[5][1] = 4096;
                        this.field631[2][3] = 0;
                        this.field631[4][2] = 0;
                        this.field631[6][0] = 4096;
                        this.field631[5][2] = 0;
                        this.field631[3][3] = 0;
                        this.field631[4][3] = 0;
                        this.field631[6][2] = 0;
                        this.field631[5][3] = 4096;
                        this.field631[6][1] = 0;
                        this.field631[6][3] = 4096;
                    }
                } else {
                    this.field631 = new int[8][4];
                    this.field631[0][3] = 2361;
                    this.field631[1][3] = 1558;
                    this.field631[0][0] = 0;
                    this.field631[0][1] = 2650;
                    this.field631[2][3] = 1413;
                    this.field631[0][2] = 2602;
                    this.field631[1][2] = 1799;
                    this.field631[1][1] = 2313;
                    this.field631[2][1] = 2618;
                    this.field631[3][1] = 2296;
                    this.field631[3][3] = 947;
                    this.field631[4][1] = 2072;
                    this.field631[1][0] = 2867;
                    this.field631[5][1] = 2730;
                    this.field631[6][1] = 2232;
                    this.field631[7][1] = 1686;
                    this.field631[4][3] = 722;
                    this.field631[2][0] = 3072;
                    this.field631[2][2] = 1734;
                    this.field631[3][2] = 1220;
                    this.field631[3][0] = 3276;
                    this.field631[5][3] = 1766;
                    this.field631[4][0] = 3481;
                    this.field631[5][0] = 3686;
                    this.field631[6][0] = 3891;
                    this.field631[4][2] = 963;
                    this.field631[6][3] = 915;
                    this.field631[5][2] = 2152;
                    this.field631[7][0] = 4096;
                    this.field631[7][3] = 1140;
                    this.field631[6][2] = 1060;
                    this.field631[7][2] = 1413;
                }
            } else {
                this.field631 = new int[2][4];
                this.field631[0][2] = 0;
                this.field631[1][2] = 4096;
                this.field631[0][1] = 0;
                this.field631[1][1] = 4096;
                this.field631[0][0] = 0;
                this.field631[1][0] = 4096;
                this.field631[0][3] = 0;
                this.field631[1][3] = 4096;
            }
        }
        if (arg0 != 1333) {
            field613 = 92;
        }
    }
}
