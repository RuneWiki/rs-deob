import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class70 extends class167 {

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "[I")
    private int[] field1352 = new int[257];

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Z")
    public static boolean field1342 = false;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
    public static int[] field1350;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "[Lch;")
    public static class31[] field1343;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "[[I")
    private int[][] field1346;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIIII)I")
    public static final int method490(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 3;
        if ((arg5 & 1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        ++field1348;
        if (~var7 == -1) {
            return arg2;
        } else if (var7 == 1) {
            return -arg6 + 1 + 7 + -arg4;
        } else {
            if (arg1 < 2) {
                method490(110, (byte) 52, -13, 118, -62, 87, 41);
            }
            return ~var7 == -3 ? 1 - (arg3 - 7 + arg2) : arg6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLnc;)Lph;")
    public static final class172 method491(byte arg0, class145 arg1) {
        if (arg0 >= -73) {
            method493((byte) 123);
        }
        ++field1354;
        return new class172(arg1.method1035(-127), arg1.method1035(-127), arg1.method1035(-114), arg1.method1035(-111), arg1.method1023(-1002744), arg1.method1023(-1002744), arg1.method998(108));
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1341;
        if (~arg2 == -1) {
            int var4 = arg0.method998(116);
            if (var4 != 0) {
                this.method496(var4, 2);
            } else {
                this.field1346 = new int[arg0.method998(127)][4];
                for (int var5 = 0; ~this.field1346.length < ~var5; ++var5) {
                    this.field1346[var5][0] = arg0.method1049((byte) 115);
                    this.field1346[var5][1] = arg0.method998(75) << 4;
                    this.field1346[var5][2] = arg0.method998(106) << 4;
                    this.field1346[var5][3] = arg0.method998(65) << 4;
                }
            }
        }
        if (arg1) {
            method492(-32, -74, -127, 61, -108, 96, -3, 58);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class200 var8 = new class200();
        var8.field3627 = arg2 / 128;
        var8.field3611 = arg3 / 128;
        var8.field3630 = arg4 / 128;
        var8.field3632 = arg5 / 128;
        var8.field3619 = arg1;
        var8.field3623 = arg2;
        var8.field3625 = arg3;
        var8.field3621 = arg4;
        var8.field3612 = arg5;
        var8.field3633 = arg6;
        var8.field3640 = arg7;
        class84.field1596[arg0][class84.field1581[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
    public static final void method493(byte arg0) {
        ++field1353;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; class100.field1825 - 1 > var2; ++var2) {
                if (class194.field3462[var2] < 1000 && ~class194.field3462[var2 + 1] < -1001) {
                    var1 = false;
                    class117 var3 = class56.field1160[var2];
                    class56.field1160[var2] = class56.field1160[var2 - -1];
                    class56.field1160[var2 + 1] = var3;
                    class117 var4 = class25.field612[var2];
                    class25.field612[var2] = class25.field612[var2 + 1];
                    class25.field612[var2 + 1] = var4;
                    int var5 = class227.field4094[var2];
                    class227.field4094[var2] = class227.field4094[var2 - -1];
                    class227.field4094[var2 + 1] = var5;
                    int var6 = class40.field907[var2];
                    class40.field907[var2] = class40.field907[var2 - -1];
                    class40.field907[var2 + 1] = var6;
                    short var7 = class194.field3462[var2];
                    class194.field3462[var2] = class194.field3462[var2 - -1];
                    class194.field3462[var2 + 1] = var7;
                    long var8 = class84.field1568[var2];
                    class84.field1568[var2] = class84.field1568[var2 + 1];
                    class84.field1568[var2 + 1] = var8;
                }
            }
        }
        if (arg0 < 10) {
            field1350 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)V")
    public static void method494(byte arg0) {
        field1343 = null;
        if (arg0 <= 25) {
            field1343 = null;
        }
        field1350 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)V")
    private final void method495(byte arg0) {
        ++field1344;
        int var2 = 106 / ((arg0 - -12) / 50);
        int var3 = this.field1346.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var3 < ~var7 && ~this.field1346[var7][0] >= ~var6; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (var5 >= var3) {
                    int[] var8 = this.field1346[var3 + -1];
                    var9 = var8[2];
                    var10 = var8[3];
                    var11 = var8[1];
                } else {
                    int[] var12 = this.field1346[var5];
                    if (var5 <= 0) {
                        var9 = var12[2];
                        var11 = var12[1];
                        var10 = var12[3];
                    } else {
                        int[] var13 = this.field1346[var5 + -1];
                        int var14 = (var6 - var13[0] << 12) / (var12[0] + -var13[0]);
                        int var15 = 4096 - var14;
                        var11 = var12[1] * var14 + var13[1] * var15 >> 12;
                        var10 = var12[3] * var14 - -(var13[3] * var15) >> 12;
                        var9 = var12[2] * var14 + var13[2] * var15 >> 12;
                    }
                }
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                int var18 = var11 >> 4;
                if (~var18 > -1) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 >= 0) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field1352[var4] = class40.method352(var16, class40.method352(var17 << 8, var18 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
    private final void method496(int arg0, int arg1) {
        ++field1351;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1346 = new int[4][4];
                                this.field1346[0][0] = 2048;
                                this.field1346[0][2] = 4096;
                                this.field1346[1][0] = 2867;
                                this.field1346[0][1] = 0;
                                this.field1346[1][1] = 4096;
                                this.field1346[0][3] = 0;
                                this.field1346[2][0] = 3276;
                                this.field1346[3][0] = 4096;
                                this.field1346[1][3] = 0;
                                this.field1346[2][1] = 4096;
                                this.field1346[3][1] = 4096;
                                this.field1346[2][3] = 0;
                                this.field1346[1][2] = 4096;
                                this.field1346[2][2] = 4096;
                                this.field1346[3][3] = 0;
                                this.field1346[3][2] = 0;
                            } else {
                                this.field1346 = new int[16][4];
                                this.field1346[0][2] = 192;
                                this.field1346[0][3] = 321;
                                this.field1346[0][0] = 0;
                                this.field1346[1][3] = 562;
                                this.field1346[2][3] = 803;
                                this.field1346[1][0] = 155;
                                this.field1346[0][1] = 80;
                                this.field1346[3][3] = 1140;
                                this.field1346[1][1] = 321;
                                this.field1346[2][0] = 389;
                                this.field1346[3][0] = 671;
                                this.field1346[4][0] = 897;
                                this.field1346[2][1] = 578;
                                this.field1346[3][1] = 947;
                                this.field1346[4][1] = 1285;
                                this.field1346[5][0] = 1175;
                                this.field1346[4][3] = 1509;
                                this.field1346[5][3] = 1413;
                                this.field1346[6][3] = 1333;
                                this.field1346[5][1] = 1525;
                                this.field1346[6][0] = 1368;
                                this.field1346[7][3] = 1702;
                                this.field1346[6][1] = 1734;
                                this.field1346[7][1] = 1413;
                                this.field1346[1][2] = 449;
                                this.field1346[2][2] = 690;
                                this.field1346[8][1] = 1108;
                                this.field1346[7][0] = 1507;
                                this.field1346[8][0] = 1736;
                                this.field1346[8][3] = 2056;
                                this.field1346[9][0] = 2088;
                                this.field1346[9][1] = 1766;
                                this.field1346[10][1] = 2409;
                                this.field1346[11][1] = 3116;
                                this.field1346[9][3] = 2666;
                                this.field1346[3][2] = 995;
                                this.field1346[10][0] = 2355;
                                this.field1346[4][2] = 1397;
                                this.field1346[12][1] = 3806;
                                this.field1346[13][1] = 3437;
                                this.field1346[11][0] = 2691;
                                this.field1346[5][2] = 1429;
                                this.field1346[12][0] = 3031;
                                this.field1346[10][3] = 3276;
                                this.field1346[13][0] = 3522;
                                this.field1346[14][1] = 3116;
                                this.field1346[11][3] = 3228;
                                this.field1346[14][0] = 3727;
                                this.field1346[6][2] = 1461;
                                this.field1346[15][1] = 2377;
                                this.field1346[12][3] = 3196;
                                this.field1346[7][2] = 1525;
                                this.field1346[15][0] = 4096;
                                this.field1346[8][2] = 1590;
                                this.field1346[9][2] = 2056;
                                this.field1346[13][3] = 3019;
                                this.field1346[10][2] = 2586;
                                this.field1346[11][2] = 3148;
                                this.field1346[12][2] = 3710;
                                this.field1346[13][2] = 3421;
                                this.field1346[14][2] = 3148;
                                this.field1346[15][2] = 2505;
                                this.field1346[14][3] = 3228;
                                this.field1346[15][3] = 2746;
                            }
                        } else {
                            this.field1346 = new int[6][4];
                            this.field1346[0][3] = 0;
                            this.field1346[0][0] = 0;
                            this.field1346[0][2] = 0;
                            this.field1346[0][1] = 0;
                            this.field1346[1][0] = 1843;
                            this.field1346[1][2] = 0;
                            this.field1346[1][3] = 1493;
                            this.field1346[2][3] = 2939;
                            this.field1346[2][2] = 0;
                            this.field1346[3][2] = 1124;
                            this.field1346[4][2] = 3084;
                            this.field1346[3][3] = 3565;
                            this.field1346[5][2] = 4096;
                            this.field1346[1][1] = 0;
                            this.field1346[4][3] = 4031;
                            this.field1346[2][0] = 2457;
                            this.field1346[5][3] = 4096;
                            this.field1346[3][0] = 2781;
                            this.field1346[4][0] = 3481;
                            this.field1346[5][0] = 4096;
                            this.field1346[2][1] = 0;
                            this.field1346[3][1] = 0;
                            this.field1346[4][1] = 546;
                            this.field1346[5][1] = 4096;
                        }
                    } else {
                        this.field1346 = new int[7][4];
                        this.field1346[0][2] = 0;
                        this.field1346[1][2] = 4096;
                        this.field1346[2][2] = 4096;
                        this.field1346[0][3] = 4096;
                        this.field1346[3][2] = 4096;
                        this.field1346[0][1] = 0;
                        this.field1346[4][2] = 0;
                        this.field1346[5][2] = 0;
                        this.field1346[1][1] = 0;
                        this.field1346[2][1] = 0;
                        this.field1346[6][2] = 0;
                        this.field1346[0][0] = 0;
                        this.field1346[3][1] = 4096;
                        this.field1346[1][3] = 4096;
                        this.field1346[4][1] = 4096;
                        this.field1346[5][1] = 4096;
                        this.field1346[2][3] = 0;
                        this.field1346[6][1] = 0;
                        this.field1346[1][0] = 663;
                        this.field1346[2][0] = 1363;
                        this.field1346[3][0] = 2048;
                        this.field1346[4][0] = 2727;
                        this.field1346[3][3] = 0;
                        this.field1346[4][3] = 0;
                        this.field1346[5][0] = 3411;
                        this.field1346[6][0] = 4096;
                        this.field1346[5][3] = 4096;
                        this.field1346[6][3] = 4096;
                    }
                } else {
                    this.field1346 = new int[8][4];
                    this.field1346[0][2] = 2602;
                    this.field1346[0][0] = 0;
                    this.field1346[1][2] = 1799;
                    this.field1346[2][2] = 1734;
                    this.field1346[0][3] = 2361;
                    this.field1346[3][2] = 1220;
                    this.field1346[4][2] = 963;
                    this.field1346[0][1] = 2650;
                    this.field1346[1][0] = 2867;
                    this.field1346[5][2] = 2152;
                    this.field1346[1][1] = 2313;
                    this.field1346[1][3] = 1558;
                    this.field1346[2][0] = 3072;
                    this.field1346[6][2] = 1060;
                    this.field1346[2][1] = 2618;
                    this.field1346[3][0] = 3276;
                    this.field1346[3][1] = 2296;
                    this.field1346[7][2] = 1413;
                    this.field1346[4][0] = 3481;
                    this.field1346[4][1] = 2072;
                    this.field1346[5][0] = 3686;
                    this.field1346[6][0] = 3891;
                    this.field1346[5][1] = 2730;
                    this.field1346[2][3] = 1413;
                    this.field1346[6][1] = 2232;
                    this.field1346[3][3] = 947;
                    this.field1346[7][0] = 4096;
                    this.field1346[7][1] = 1686;
                    this.field1346[4][3] = 722;
                    this.field1346[5][3] = 1766;
                    this.field1346[6][3] = 915;
                    this.field1346[7][3] = 1140;
                }
            } else {
                this.field1346 = new int[2][4];
                this.field1346[0][1] = 0;
                this.field1346[0][3] = 0;
                this.field1346[1][1] = 4096;
                this.field1346[0][0] = 0;
                this.field1346[1][0] = 4096;
                this.field1346[1][3] = 4096;
                this.field1346[0][2] = 0;
                this.field1346[1][2] = 4096;
            }
        }
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = 66 / ((-18 - arg0) / 59);
        ++field1347;
        if (this.field1346 == null) {
            this.method496(1, 2);
        }
        this.method495((byte) 38);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field1349;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[] var4 = this.method1186(arg0, 0, 0);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; ~var8 > ~class115.field2146; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1352[var9];
                var7[var8] = class209.method1370(var10 >> 12, 4080);
                var6[var8] = class209.method1370(4080, var10 >> 4);
                var5[var8] = class209.method1370(var10 << 4, 4080);
            }
        }
        return arg1 != -9179 ? null : var3;
    }
}
