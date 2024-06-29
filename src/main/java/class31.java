import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class31 extends class398 {

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "[I")
    private int[] field446 = new int[257];

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "Ljava/lang/String;")
    public static String field440 = "flash1:";

    @OriginalMember(owner = "client!mq", name = "U", descriptor = "I")
    public static int field449 = 0;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "[I")
    public static int[] field442 = new int[50];

    @OriginalMember(owner = "client!mq", name = "V", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!mq", name = "T", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!mq", name = "W", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "[[I")
    private int[][] field444;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
    private final void method206(boolean arg0, int arg1) {
        ++field438;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field444 = new int[4][4];
                                this.field444[0][0] = 2048;
                                this.field444[0][1] = 0;
                                this.field444[0][2] = 4096;
                                this.field444[0][3] = 0;
                                this.field444[1][2] = 4096;
                                this.field444[1][1] = 4096;
                                this.field444[1][0] = 2867;
                                this.field444[1][3] = 0;
                                this.field444[2][2] = 4096;
                                this.field444[2][1] = 4096;
                                this.field444[2][3] = 0;
                                this.field444[2][0] = 3276;
                                this.field444[3][0] = 4096;
                                this.field444[3][3] = 0;
                                this.field444[3][1] = 4096;
                                this.field444[3][2] = 0;
                            } else {
                                this.field444 = new int[16][4];
                                this.field444[0][0] = 0;
                                this.field444[0][1] = 80;
                                this.field444[0][3] = 321;
                                this.field444[0][2] = 192;
                                this.field444[1][1] = 321;
                                this.field444[1][0] = 155;
                                this.field444[1][2] = 449;
                                this.field444[1][3] = 562;
                                this.field444[2][0] = 389;
                                this.field444[2][3] = 803;
                                this.field444[2][1] = 578;
                                this.field444[2][2] = 690;
                                this.field444[3][3] = 1140;
                                this.field444[3][0] = 671;
                                this.field444[3][2] = 995;
                                this.field444[3][1] = 947;
                                this.field444[4][3] = 1509;
                                this.field444[4][2] = 1397;
                                this.field444[4][1] = 1285;
                                this.field444[4][0] = 897;
                                this.field444[5][0] = 1175;
                                this.field444[5][2] = 1429;
                                this.field444[5][3] = 1413;
                                this.field444[5][1] = 1525;
                                this.field444[6][2] = 1461;
                                this.field444[6][3] = 1333;
                                this.field444[6][1] = 1734;
                                this.field444[6][0] = 1368;
                                this.field444[7][1] = 1413;
                                this.field444[7][3] = 1702;
                                this.field444[7][2] = 1525;
                                this.field444[7][0] = 1507;
                                this.field444[8][1] = 1108;
                                this.field444[8][3] = 2056;
                                this.field444[8][2] = 1590;
                                this.field444[8][0] = 1736;
                                this.field444[9][3] = 2666;
                                this.field444[9][0] = 2088;
                                this.field444[9][2] = 2056;
                                this.field444[9][1] = 1766;
                                this.field444[10][1] = 2409;
                                this.field444[10][3] = 3276;
                                this.field444[10][0] = 2355;
                                this.field444[10][2] = 2586;
                                this.field444[11][2] = 3148;
                                this.field444[11][3] = 3228;
                                this.field444[11][0] = 2691;
                                this.field444[11][1] = 3116;
                                this.field444[12][2] = 3710;
                                this.field444[12][1] = 3806;
                                this.field444[12][0] = 3031;
                                this.field444[12][3] = 3196;
                                this.field444[13][1] = 3437;
                                this.field444[13][2] = 3421;
                                this.field444[13][0] = 3522;
                                this.field444[13][3] = 3019;
                                this.field444[14][3] = 3228;
                                this.field444[14][0] = 3727;
                                this.field444[14][2] = 3148;
                                this.field444[14][1] = 3116;
                                this.field444[15][2] = 2505;
                                this.field444[15][1] = 2377;
                                this.field444[15][0] = 4096;
                                this.field444[15][3] = 2746;
                            }
                        } else {
                            this.field444 = new int[6][4];
                            this.field444[0][0] = 0;
                            this.field444[0][3] = 0;
                            this.field444[0][2] = 0;
                            this.field444[0][1] = 0;
                            this.field444[1][2] = 0;
                            this.field444[1][1] = 0;
                            this.field444[1][0] = 1843;
                            this.field444[1][3] = 1493;
                            this.field444[2][2] = 0;
                            this.field444[2][0] = 2457;
                            this.field444[2][1] = 0;
                            this.field444[2][3] = 2939;
                            this.field444[3][2] = 1124;
                            this.field444[3][0] = 2781;
                            this.field444[3][3] = 3565;
                            this.field444[3][1] = 0;
                            this.field444[4][2] = 3084;
                            this.field444[4][1] = 546;
                            this.field444[4][0] = 3481;
                            this.field444[4][3] = 4031;
                            this.field444[5][2] = 4096;
                            this.field444[5][1] = 4096;
                            this.field444[5][0] = 4096;
                            this.field444[5][3] = 4096;
                        }
                    } else {
                        this.field444 = new int[7][4];
                        this.field444[0][3] = 4096;
                        this.field444[0][1] = 0;
                        this.field444[0][0] = 0;
                        this.field444[0][2] = 0;
                        this.field444[1][3] = 4096;
                        this.field444[1][2] = 4096;
                        this.field444[1][0] = 663;
                        this.field444[1][1] = 0;
                        this.field444[2][1] = 0;
                        this.field444[2][3] = 0;
                        this.field444[2][0] = 1363;
                        this.field444[2][2] = 4096;
                        this.field444[3][2] = 4096;
                        this.field444[3][0] = 2048;
                        this.field444[3][1] = 4096;
                        this.field444[3][3] = 0;
                        this.field444[4][1] = 4096;
                        this.field444[4][0] = 2727;
                        this.field444[4][2] = 0;
                        this.field444[4][3] = 0;
                        this.field444[5][3] = 4096;
                        this.field444[5][2] = 0;
                        this.field444[5][0] = 3411;
                        this.field444[5][1] = 4096;
                        this.field444[6][3] = 4096;
                        this.field444[6][0] = 4096;
                        this.field444[6][1] = 0;
                        this.field444[6][2] = 0;
                    }
                } else {
                    this.field444 = new int[8][4];
                    this.field444[0][2] = 2602;
                    this.field444[0][0] = 0;
                    this.field444[0][3] = 2361;
                    this.field444[0][1] = 2650;
                    this.field444[1][3] = 1558;
                    this.field444[1][1] = 2313;
                    this.field444[1][0] = 2867;
                    this.field444[1][2] = 1799;
                    this.field444[2][1] = 2618;
                    this.field444[2][3] = 1413;
                    this.field444[2][2] = 1734;
                    this.field444[2][0] = 3072;
                    this.field444[3][3] = 947;
                    this.field444[3][0] = 3276;
                    this.field444[3][1] = 2296;
                    this.field444[3][2] = 1220;
                    this.field444[4][2] = 963;
                    this.field444[4][1] = 2072;
                    this.field444[4][0] = 3481;
                    this.field444[4][3] = 722;
                    this.field444[5][2] = 2152;
                    this.field444[5][1] = 2730;
                    this.field444[5][3] = 1766;
                    this.field444[5][0] = 3686;
                    this.field444[6][0] = 3891;
                    this.field444[6][1] = 2232;
                    this.field444[6][2] = 1060;
                    this.field444[6][3] = 915;
                    this.field444[7][3] = 1140;
                    this.field444[7][2] = 1413;
                    this.field444[7][0] = 4096;
                    this.field444[7][1] = 1686;
                }
            } else {
                this.field444 = new int[2][4];
                this.field444[0][1] = 0;
                this.field444[0][0] = 0;
                this.field444[0][3] = 0;
                this.field444[0][2] = 0;
                this.field444[1][1] = 4096;
                this.field444[1][3] = 4096;
                this.field444[1][2] = 4096;
                this.field444[1][0] = 4096;
            }
        }
        if (arg0) {
            field440 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([[B[[I[[B[[BLii;Lck;Z[[BIIIILck;)V")
    public static final void method207(byte[][] arg0, int[][] arg1, byte[][] arg2, byte[][] arg3, class405 arg4, class351 arg5, boolean arg6, byte[][] arg7, int arg8, int arg9, int arg10, int arg11, class351 arg12) {
        if (arg8 != 7) {
            method210(113, 54, true);
        }
        for (int var13 = 0; var13 < arg9; ++var13) {
            int var14 = arg9 + -1 <= var13 ? var13 : var13 + 1;
            for (int var15 = 0; ~var15 > ~arg11; ++var15) {
                int var16 = ~(arg11 - 1) >= ~var15 ? var15 : var15 + 1;
                if (class11.method79((byte) -104) || class61.method424(arg10, var15, var13, (byte) 124, class200.field2661)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg2[var13][var15];
                    int var21 = arg0[var13][var15];
                    int var22 = arg3[var13][var15] & 255;
                    int var23 = arg7[var13][var15] & 255;
                    int var24 = arg7[var13][var16] & 255;
                    int var25 = arg7[var14][var16] & 255;
                    int var26 = arg7[var14][var15] & 255;
                    if (var22 != 0 || var23 != 0) {
                        class100 var27 = ~var22 != -1 ? class415.method2642(var22 + -1, 11619) : null;
                        if (~var20 == -1 && var27 == null) {
                            var20 = 12;
                        }
                        class264 var28 = ~var23 == -1 ? null : class72.method530(var23 + -1, 101);
                        class100 var29 = var27;
                        if (var27 != null) {
                            if (var27.field1393 == -1 && ~var27.field1407 == 0) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && ~var20 != -1) {
                                var18 = var27.field1409;
                            }
                        }
                        if ((~var20 == -1 || var20 == 12) && ~var13 < -1 && ~var15 < -1 && arg9 > var13 && var15 < arg11) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            int var34 = var32 + (arg7[var14][var16] == var23 ? 1 : -1);
                            int var35 = var30 + (arg7[var13 + -1][var15 + -1] == var23 ? 1 : -1);
                            int var36 = var31 + (arg7[var14][var15 + -1] != var23 ? -1 : 1);
                            if (arg7[var13][var15 - 1] == var23) {
                                ++var36;
                                ++var35;
                            } else {
                                --var36;
                                --var35;
                            }
                            int var37 = var33 + (arg7[var13 + -1][var16] != var23 ? -1 : 1);
                            if (~arg7[var14][var15] == ~var23) {
                                ++var34;
                                ++var36;
                            } else {
                                --var36;
                                --var34;
                            }
                            if (arg7[var13][var16] != var23) {
                                --var37;
                                --var34;
                            } else {
                                ++var37;
                                ++var34;
                            }
                            if (arg7[var13 + -1][var15] == var23) {
                                ++var35;
                                ++var37;
                            } else {
                                --var37;
                                --var35;
                            }
                            int var38 = var35 - var34;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = -var37 + var36;
                            if (~var39 > -1) {
                                var39 = -var39;
                            }
                            if (~var38 == ~var39) {
                                var38 = arg12.method742(var13, var15) + -arg12.method742(var14, var16);
                                var39 = arg12.method742(var14, var15) - arg12.method742(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; ++var40) {
                            class181.field2393[var40] = -1;
                            class105.field1520[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field1409 ? class211.field2828[var20] : class349.field5043[var20];
                        class241.method1448(var28, arg2, var13, 2724, arg0, arg4, var19, var15, var20, arg11, arg9, var21, arg3, var27);
                        boolean var42 = var27 != null && var27.field1407 != var27.field1393;
                        if (!var42) {
                            for (int var43 = 0; ~var43 > -9; ++var43) {
                                if (~class181.field2393[var43] <= -1 && class406.field6032[var43] != class268.field3865[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 3]) {
                            var19[1] = class410.method2629(var19[1], ~class183.method1117(class105.field1520[4], class105.field1520[2]) == -1);
                        }
                        if (!var41[3 & var21 + 3]) {
                            var19[3] = class410.method2629(var19[3], class183.method1117(class105.field1520[0], class105.field1520[6]) == 0);
                        }
                        if (!var41[3 & -(-var21)]) {
                            var19[0] = class410.method2629(var19[0], ~class183.method1117(class105.field1520[2], class105.field1520[0]) == -1);
                        }
                        if (!var41[3 & var21 + 2]) {
                            var19[2] = class410.method2629(var19[2], class183.method1117(class105.field1520[6], class105.field1520[4]) == 0);
                        }
                        if (!var18 && (~var20 == -1 || ~var20 == -13)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var21 = 0;
                                var19[0] = var19[3] = false;
                                var20 = ~var20 == -1 ? 13 : 14;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var21 = 3;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var21 = 2;
                                var20 = ~var20 == -1 ? 13 : 14;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var20 = var20 != 0 ? 14 : 13;
                                var21 = 1;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int var50;
                        if (!var44) {
                            if (var18) {
                                var46 = class236.field3144[var20];
                                var47 = class365.field5280[var20];
                                var45 = class376.field5482[var20];
                                var48 = class346.field4986[var20];
                                var49 = var27 == null ? 0 : class235.field3135[var20];
                                var50 = var28 == null ? 0 : class324.field4754[var20];
                            } else {
                                var46 = class84.field1205[var20];
                                var48 = class7.field124[var20];
                                var47 = class200.field2662[var20];
                                var50 = var28 != null ? class353.field5111[var20] : 0;
                                var49 = var27 == null ? 0 : class307.field4518[var20];
                                var45 = class44.field629[var20];
                            }
                        } else {
                            var49 = var27 == null ? 0 : class309.field4545[var20];
                            var47 = class279.field4055[var20];
                            var46 = class161.field2159[var20];
                            var50 = var28 != null ? class44.field630[var20] : 0;
                            var48 = class88.field1240[var20];
                        }
                        int var51 = var49 + var50;
                        if (~var51 >= -1) {
                            class365.method2386(arg10, var13, var15);
                        } else {
                            if (var19[0]) {
                                ++var51;
                            }
                            if (var19[2]) {
                                ++var51;
                            }
                            if (var19[1]) {
                                ++var51;
                            }
                            if (var19[3]) {
                                ++var51;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = !arg6 ? null : new int[var54];
                            int[] var56 = !var42 ? null : new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field1393;
                                var63 = arg4.method1720() ? var27.field1410 : var27.field1395;
                                var64 = var27.field1400;
                                int var65 = class1.method9(arg4, (byte) 120, var27);
                                for (int var66 = 0; ~var49 < ~var66; ++var66) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[3 & -var21] && ~var45[0] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 1;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 1;
                                        class134.field1873[4] = var48[var52];
                                        class134.field1873[5] = var47[var52];
                                        var68 = 6;
                                    } else if (var19[3 & -var21 + 2] && ~var45[2] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 5;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 5;
                                        class134.field1873[4] = var48[var52];
                                        var68 = 6;
                                        class134.field1873[5] = var47[var52];
                                    } else if (var19[-var21 + 1 & 3] && ~var45[1] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 3;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 3;
                                        class134.field1873[4] = var48[var52];
                                        var68 = 6;
                                        class134.field1873[5] = var47[var52];
                                    } else if (var19[3 & 3 - var21] && ~var45[3] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 7;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 7;
                                        class134.field1873[4] = var48[var52];
                                        var68 = 6;
                                        class134.field1873[5] = var47[var52];
                                    } else {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = var48[var52];
                                        class134.field1873[2] = var47[var52];
                                        var68 = 3;
                                    }
                                    ++var52;
                                    for (int var69 = 0; ~var69 > ~var68; ++var69) {
                                        int var70 = class134.field1873[var69];
                                        int var71 = 7 & -(var21 * 2) + var70;
                                        int var72 = class11.field165[var70];
                                        int var73 = class309.field4546[var70];
                                        if (var21 == 1) {
                                            var57[var53] = var73;
                                            var58[var53] = -var72 + 128;
                                        } else if (~var21 != -3) {
                                            if (var21 != 3) {
                                                var57[var53] = var72;
                                                var58[var53] = var73;
                                            } else {
                                                var57[var53] = -var73 + 128;
                                                var58[var53] = var72;
                                            }
                                        } else {
                                            var57[var53] = -var72 + 128;
                                            var58[var53] = -var73 + 128;
                                        }
                                        if (arg6 && class420.field6209[var20][var70]) {
                                            int var74 = (var13 << 7) + var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg5.method745(var74, var75) + -arg12.method745(var74, var75);
                                        }
                                        if (~var70 > -9 && ~var27.field1398 > ~class181.field2393[var71]) {
                                            if (var56 != null) {
                                                var56[var53] = class406.field6032[var71];
                                            }
                                            var61[var53] = class164.field2213[var71];
                                            var60[var53] = class228.field3000[var71];
                                            var59[var53] = class268.field3865[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = !arg4.method1720() ? var27.field1395 : var27.field1410;
                                            var61[var53] = var27.field1400;
                                            var59[var53] = var62;
                                        }
                                        ++var53;
                                    }
                                }
                                if (!arg6 && arg10 == 0) {
                                    class291.method1981(var13, var15, var27.field1408, var27.field1403 * 8);
                                }
                                if (var20 != 12 && var27.field1393 != -1 && var27.field1399) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class309.field4545[var20];
                            } else if (var18) {
                                var52 += class235.field3135[var20];
                            } else {
                                var52 += class307.field4518[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (~var25 == -1) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class264 var76 = class72.method530(var23 + -1, 89);
                                class264 var77 = class72.method530(var24 - 1, arg8 + 114);
                                class264 var78 = class72.method530(var25 + -1, 100);
                                class264 var79 = class72.method530(var26 + -1, 88);
                                for (int var80 = 0; var50 > var80; ++var80) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[3 & -var21] && ~var45[0] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 1;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 1;
                                        class134.field1873[4] = var48[var52];
                                        class134.field1873[5] = var47[var52];
                                        var82 = 6;
                                    } else if (var19[3 & 2 - var21] && var45[2] == var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 5;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 5;
                                        class134.field1873[4] = var48[var52];
                                        class134.field1873[5] = var47[var52];
                                        var82 = 6;
                                    } else if (var19[-var21 + 1 & 3] && ~var45[1] == ~var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 3;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 3;
                                        class134.field1873[4] = var48[var52];
                                        var82 = 6;
                                        class134.field1873[5] = var47[var52];
                                    } else if (var19[3 & -var21 + 3] && var45[3] == var52) {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = 7;
                                        class134.field1873[2] = var47[var52];
                                        class134.field1873[3] = 7;
                                        class134.field1873[4] = var48[var52];
                                        var82 = 6;
                                        class134.field1873[5] = var47[var52];
                                    } else {
                                        class134.field1873[0] = var46[var52];
                                        class134.field1873[1] = var48[var52];
                                        var82 = 3;
                                        class134.field1873[2] = var47[var52];
                                    }
                                    ++var52;
                                    for (int var83 = 0; ~var82 < ~var83; ++var83) {
                                        int var84 = class134.field1873[var83];
                                        int var85 = -(var21 * 2) + var84 & 7;
                                        int var86 = class11.field165[var84];
                                        int var87 = class309.field4546[var84];
                                        int var88;
                                        int var89;
                                        if (~var21 == -2) {
                                            var88 = var87;
                                            var89 = -var86 + 128;
                                        } else if (var21 == 2) {
                                            var88 = -var86 + 128;
                                            var89 = -var87 + 128;
                                        } else if (~var21 == -4) {
                                            var88 = 128 - var87;
                                            var89 = var86;
                                        } else {
                                            var88 = var86;
                                            var89 = var87;
                                        }
                                        var57[var53] = var88;
                                        var58[var53] = var89;
                                        if (arg6 && class420.field6209[var20][var84]) {
                                            int var90 = (var13 << 7) + var88;
                                            int var91 = (var15 << 7) + var89;
                                            var55[var53] = arg5.method745(var90, var91) - arg12.method745(var90, var91);
                                        }
                                        if (~var84 > -9 && class181.field2393[var85] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class406.field6032[var85];
                                            }
                                            var61[var53] = class164.field2213[var85];
                                            var60[var53] = class228.field3000[var85];
                                            var59[var53] = class268.field3865[var85];
                                        } else {
                                            if (var18 && class420.field6209[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var88 == 0 && var89 == 0) {
                                                var59[var53] = arg1[var13][var15];
                                                var60[var53] = var76.field3836;
                                                var61[var53] = var76.field3824;
                                            } else if (~var88 == -1 && var89 == 128) {
                                                var59[var53] = arg1[var13][var16];
                                                var60[var53] = var77.field3836;
                                                var61[var53] = var77.field3824;
                                            } else if (~var88 == -129 && var89 == 128) {
                                                var59[var53] = arg1[var14][var16];
                                                var60[var53] = var78.field3836;
                                                var61[var53] = var78.field3824;
                                            } else if (var88 == 128 && var89 == 0) {
                                                var59[var53] = arg1[var14][var15];
                                                var60[var53] = var79.field3836;
                                                var61[var53] = var79.field3824;
                                            } else {
                                                if (~var88 <= -65) {
                                                    if (~var89 > -65) {
                                                        var60[var53] = var79.field3836;
                                                        var61[var53] = var79.field3824;
                                                    } else {
                                                        var60[var53] = var78.field3836;
                                                        var61[var53] = var78.field3824;
                                                    }
                                                } else if (~var89 > -65) {
                                                    var60[var53] = var76.field3836;
                                                    var61[var53] = var76.field3824;
                                                } else {
                                                    var60[var53] = var77.field3836;
                                                    var61[var53] = var77.field3824;
                                                }
                                                int var92 = class321.method2165(arg1[var13][var15], 5000, var88 << 7 >> 7, arg1[var14][var15]);
                                                int var93 = class321.method2165(arg1[var13][var16], arg8 ^ 5007, var88 << 7 >> 7, arg1[var14][var16]);
                                                var59[var53] = class321.method2165(var92, 5000, var89 << 7 >> 7, var93);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        ++var53;
                                    }
                                }
                                if (var20 != 0 && var28.field3826) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg12.method742(var13, var15);
                            int var95 = arg12.method742(var14, var15);
                            int var96 = arg12.method742(var14, var16);
                            int var97 = arg12.method742(var13, var16);
                            if (arg10 > 0) {
                                boolean var98 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var98 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field1402) {
                                    var98 = false;
                                }
                                if (var98 && ~var94 == ~var95 && ~var94 == ~var96 && ~var94 == ~var97) {
                                    class248.field3341[arg10][var13][var15] = (byte) class351.method2313(class248.field3341[arg10][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg6) {
                                var99 = class236.method1416(var13, var15);
                                var100 = class172.method1065(var13, var15);
                            }
                            arg12.method750(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class365.method2386(arg10, var13, var15);
                        }
                    }
                }
            }
        }
        ++field447;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field451;
        if (~arg1 == -1) {
            int var4 = arg0.method1348(-113);
            if (var4 != 0) {
                this.method206(false, var4);
            } else {
                this.field444 = new int[arg0.method1348(-103)][4];
                for (int var5 = 0; ~this.field444.length < ~var5; ++var5) {
                    this.field444[var5][0] = arg0.method1343(255);
                    this.field444[var5][1] = arg0.method1348(-125) << 4;
                    this.field444[var5][2] = arg0.method1348(-105) << 4;
                    this.field444[var5][3] = arg0.method1348(class399.method2571(arg2, 13091)) << 4;
                }
            }
        }
        if (arg2 != -13132) {
            method207((byte[][]) null, (int[][]) null, (byte[][]) null, (byte[][]) null, (class405) null, (class351) null, true, (byte[][]) null, -48, 13, -47, 89, (class351) null);
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        ++field448;
        if (arg0 != 16) {
            method210(96, 94, true);
        }
        if (this.field444 == null) {
            this.method206(false, 1);
        }
        this.method212((byte) 68);
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZ)I")
    public static final int method210(int arg0, int arg1, boolean arg2) {
        ++field443;
        class72 var3 = (class72) class8.field145.method384((long) arg1, arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; ~var3.field1040.length < ~var5; ++var5) {
                if (var3.field1038[var5] == arg0) {
                    var4 += var3.field1040[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        ++field445;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            return null;
        } else {
            if (super.field5933.field4847) {
                int[] var4 = this.method2558(0, 29295, arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~class140.field1922 < ~var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field446[var9];
                    var5[var8] = class183.method1117(var10, 16711680) >> 12;
                    var6[var8] = class183.method1117(4080, var10 >> 4);
                    var7[var8] = class183.method1117(255, var10) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)V")
    public static void method211(boolean arg0) {
        field442 = null;
        field440 = null;
        if (arg0) {
            field449 = -126;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    private final void method212(byte arg0) {
        ++field441;
        if (arg0 >= 14) {
            int var2 = this.field444.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; ~var2 < ~var6 && this.field444[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 <= ~var2) {
                        int[] var7 = this.field444[var2 + -1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field444[var4];
                        if (var4 > 0) {
                            int[] var12 = this.field444[var4 + -1];
                            int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                            int var14 = -var13 + 4096;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                            var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                        } else {
                            var9 = var11[3];
                            var8 = var11[2];
                            var10 = var11[1];
                        }
                    }
                    int var15 = var9 >> 4;
                    int var16 = var10 >> 4;
                    int var17 = var8 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (~var15 < -256) {
                        var15 = 255;
                    }
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    this.field446[var3] = class351.method2313(class351.method2313(var17 << 8, var16 << 16), var15);
                }
            }
        }
    }
}
