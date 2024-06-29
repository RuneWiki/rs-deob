import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class201 extends class37 {

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "Ldd;")
    public static class35 field4018 = class180.method1196((byte) 127, "cross");

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "Z")
    public static boolean field4022 = false;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "Ldd;")
    private static class35 field4032 = class180.method1196((byte) 126, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Ldd;")
    public static class35 field4017 = field4032;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "[[I")
    private int[][] field4028;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class201() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static final void method1333(int arg0) {
        class24 var1 = (class24) class4.field76.method1232(arg0 + 25832);
        ++field4019;
        while (var1 != null) {
            if (class175.field3585 == var1.field489 && class89.field1988 <= var1.field471) {
                if (class89.field1988 >= var1.field476) {
                    if (var1.field477 > 0) {
                        class19 var2 = class204.field4058[var1.field477 - 1];
                        if (var2 != null && var2.field1664 >= 0 && ~var2.field1664 > -13313 && ~var2.field1676 <= -1 && ~var2.field1676 > -13313) {
                            var1.method207(class89.field1988, arg0, var2.field1664, var2.field1676, class73.method583(var1.field489, var2.field1676, var2.field1664, (byte) 1) - var1.field499);
                        }
                    }
                    if (var1.field477 < 0) {
                        int var3 = -var1.field477 + -1;
                        class102 var4;
                        if (client.field614 == var3) {
                            var4 = class71.field1704;
                        } else {
                            var4 = class51.field1154[var3];
                        }
                        if (var4 != null && var4.field1664 >= 0 && ~var4.field1664 > -13313 && ~var4.field1676 <= -1 && ~var4.field1676 > -13313) {
                            var1.method207(class89.field1988, -1, var4.field1664, var4.field1676, class73.method583(var1.field489, var4.field1676, var4.field1664, (byte) 1) - var1.field499);
                        }
                    }
                    var1.method204(arg0 ^ 127, class129.field2782);
                    class48.method430(class175.field3585, (int) var1.field467, (int) var1.field465, (int) var1.field488, 60, var1, var1.field497, -1L, false);
                }
            } else {
                var1.method799(-24265);
            }
            var1 = (class24) class4.field76.method1238(22622);
        }
        if (arg0 != -1) {
            field4024 = 11;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public static final void method1334(byte arg0) {
        if (class41.field899.toLowerCase().indexOf("microsoft") == -1) {
            class200.field4014[44] = 71;
            class200.field4014[92] = 74;
            class200.field4014[47] = 73;
            class200.field4014[46] = 72;
            class200.field4014[91] = 42;
            class200.field4014[93] = 43;
            class200.field4014[59] = 57;
            class200.field4014[45] = 26;
            if (class41.field904 != null) {
                class200.field4014[222] = 58;
                class200.field4014[192] = 28;
                class200.field4014[520] = 59;
            } else {
                class200.field4014[222] = 59;
                class200.field4014[192] = 58;
            }
            class200.field4014[61] = 27;
        } else {
            class200.field4014[192] = 58;
            class200.field4014[221] = 43;
            class200.field4014[220] = 74;
            class200.field4014[223] = 28;
            class200.field4014[189] = 26;
            class200.field4014[186] = 57;
            class200.field4014[191] = 73;
            class200.field4014[222] = 59;
            class200.field4014[190] = 72;
            class200.field4014[187] = 27;
            class200.field4014[219] = 42;
            class200.field4014[188] = 71;
        }
        ++field4026;
        if (arg0 != -102) {
            method1335(-31, (class69) null, 68);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field4021;
        if (this.field4028 == null) {
            this.method1337((byte) -111, 1);
        }
        if (arg0) {
            method1338((byte) 43, (Component) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4025;
        if (arg1 < 5) {
            this.method1337((byte) 42, 22);
        }
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int var4 = this.field4028.length;
            int[] var5 = this.method369(0, arg0, (byte) 124);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~var4 >= -1) {
                for (int var9 = 0; ~var9 > ~class72.field1719; ++var9) {
                    var6[var9] = 0;
                    var7[var9] = 0;
                    var8[var9] = 0;
                }
            } else {
                for (int var10 = 0; class72.field1719 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var5[var10];
                    for (int var13 = 0; var13 < var4 && var12 >= this.field4028[var13][0]; ++var13) {
                        ++var11;
                    }
                    if (var4 > var11) {
                        int[] var14 = this.field4028[var11];
                        if (~var11 >= -1) {
                            var6[var10] = var14[1];
                            var7[var10] = var14[2];
                            var8[var10] = var14[3];
                        } else {
                            int[] var15 = this.field4028[var11 + -1];
                            int var16 = (-var15[0] + var12 << 12) / (var14[0] + -var15[0]);
                            int var17 = -var16 + 4096;
                            var6[var10] = var14[1] * var16 - -(var15[1] * var17) >> 12;
                            var7[var10] = var14[2] * var16 + var15[2] * var17 >> 12;
                            var8[var10] = var14[3] * var16 + var15[3] * var17 >> 12;
                        }
                    } else {
                        int[] var18 = this.field4028[var4 + -1];
                        var6[var10] = var18[1];
                        var7[var10] = var18[2];
                        var8[var10] = var18[3];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILgi;I)V")
    public static final void method1335(int arg0, class69 arg1, int arg2) {
        if (class89.field1988 < arg1.field1650) {
            class42.method394((byte) -93, arg1);
        } else if (~arg1.field1634 <= ~class89.field1988) {
            class205.method1358(arg1, (byte) 111);
        } else {
            class73.method585((byte) -13, arg1);
        }
        ++field4020;
        if (~arg1.field1664 > -129 || arg1.field1676 < 128 || arg1.field1664 >= 13184 || arg1.field1676 >= 13184) {
            arg1.field1610 = -1;
            arg1.field1634 = 0;
            arg1.field1650 = 0;
            arg1.field1676 = arg1.field1605[0] * 128 + arg1.field1644 * 64;
            arg1.field1664 = arg1.field1603[0] * 128 - -(arg1.field1644 * 64);
            arg1.field1671 = -1;
            arg1.method559(112);
        }
        if (class71.field1704 == arg1 && (~arg1.field1664 > -1537 || arg1.field1676 < 1536 || arg1.field1664 >= 11776 || arg1.field1676 >= 11776)) {
            arg1.field1634 = 0;
            arg1.field1650 = 0;
            arg1.field1610 = -1;
            arg1.field1664 = arg1.field1603[0] * 128 + arg1.field1644 * 64;
            arg1.field1676 = arg1.field1605[0] * 128 - -(arg1.field1644 * 64);
            arg1.field1671 = -1;
            arg1.method559(-104);
        }
        class166.method1093((byte) 124, arg1);
        class96.method733(arg1, 48);
        if (arg2 < 119) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field4029;
        if (arg0 == 0) {
            int var4 = arg2.method221(-101);
            if (~var4 != -1) {
                this.method1337((byte) -113, var4);
            } else {
                this.field4028 = new int[arg2.method221(-120)][4];
                for (int var5 = 0; ~this.field4028.length < ~var5; ++var5) {
                    this.field4028[var5][0] = arg2.method256((byte) -78);
                    this.field4028[var5][1] = arg2.method221(-83) << 4;
                    this.field4028[var5][2] = arg2.method221(-93) << 4;
                    this.field4028[var5][3] = arg2.method221(-125) << 4;
                }
            }
        }
        if (arg1 != 1) {
            field4018 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        int var1 = -118 / ((arg0 - -21) / 37);
        field4017 = null;
        field4032 = null;
        field4018 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)V")
    private final void method1337(byte arg0, int arg1) {
        ++field4023;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4028 = new int[4][4];
                                this.field4028[0][0] = 2048;
                                this.field4028[0][1] = 0;
                                this.field4028[0][3] = 0;
                                this.field4028[1][0] = 2867;
                                this.field4028[1][1] = 4096;
                                this.field4028[0][2] = 4096;
                                this.field4028[2][1] = 4096;
                                this.field4028[3][1] = 4096;
                                this.field4028[1][3] = 0;
                                this.field4028[2][3] = 0;
                                this.field4028[2][0] = 3276;
                                this.field4028[3][0] = 4096;
                                this.field4028[1][2] = 4096;
                                this.field4028[3][3] = 0;
                                this.field4028[2][2] = 4096;
                                this.field4028[3][2] = 0;
                            } else {
                                this.field4028 = new int[16][4];
                                this.field4028[0][3] = 321;
                                this.field4028[0][1] = 80;
                                this.field4028[0][0] = 0;
                                this.field4028[0][2] = 192;
                                this.field4028[1][1] = 321;
                                this.field4028[1][0] = 155;
                                this.field4028[2][0] = 389;
                                this.field4028[3][0] = 671;
                                this.field4028[4][0] = 897;
                                this.field4028[1][2] = 449;
                                this.field4028[2][1] = 578;
                                this.field4028[3][1] = 947;
                                this.field4028[5][0] = 1175;
                                this.field4028[4][1] = 1285;
                                this.field4028[6][0] = 1368;
                                this.field4028[2][2] = 690;
                                this.field4028[3][2] = 995;
                                this.field4028[7][0] = 1507;
                                this.field4028[8][0] = 1736;
                                this.field4028[4][2] = 1397;
                                this.field4028[5][2] = 1429;
                                this.field4028[5][1] = 1525;
                                this.field4028[6][1] = 1734;
                                this.field4028[1][3] = 562;
                                this.field4028[2][3] = 803;
                                this.field4028[9][0] = 2088;
                                this.field4028[3][3] = 1140;
                                this.field4028[7][1] = 1413;
                                this.field4028[8][1] = 1108;
                                this.field4028[10][0] = 2355;
                                this.field4028[6][2] = 1461;
                                this.field4028[7][2] = 1525;
                                this.field4028[8][2] = 1590;
                                this.field4028[11][0] = 2691;
                                this.field4028[9][1] = 1766;
                                this.field4028[12][0] = 3031;
                                this.field4028[13][0] = 3522;
                                this.field4028[4][3] = 1509;
                                this.field4028[10][1] = 2409;
                                this.field4028[11][1] = 3116;
                                this.field4028[5][3] = 1413;
                                this.field4028[6][3] = 1333;
                                this.field4028[7][3] = 1702;
                                this.field4028[14][0] = 3727;
                                this.field4028[12][1] = 3806;
                                this.field4028[9][2] = 2056;
                                this.field4028[10][2] = 2586;
                                this.field4028[8][3] = 2056;
                                this.field4028[11][2] = 3148;
                                this.field4028[13][1] = 3437;
                                this.field4028[12][2] = 3710;
                                this.field4028[14][1] = 3116;
                                this.field4028[15][0] = 4096;
                                this.field4028[9][3] = 2666;
                                this.field4028[10][3] = 3276;
                                this.field4028[15][1] = 2377;
                                this.field4028[13][2] = 3421;
                                this.field4028[11][3] = 3228;
                                this.field4028[12][3] = 3196;
                                this.field4028[14][2] = 3148;
                                this.field4028[13][3] = 3019;
                                this.field4028[15][2] = 2505;
                                this.field4028[14][3] = 3228;
                                this.field4028[15][3] = 2746;
                            }
                        } else {
                            this.field4028 = new int[6][4];
                            this.field4028[0][2] = 0;
                            this.field4028[1][2] = 0;
                            this.field4028[0][0] = 0;
                            this.field4028[0][1] = 0;
                            this.field4028[0][3] = 0;
                            this.field4028[1][3] = 1493;
                            this.field4028[1][1] = 0;
                            this.field4028[1][0] = 1843;
                            this.field4028[2][1] = 0;
                            this.field4028[2][0] = 2457;
                            this.field4028[3][1] = 0;
                            this.field4028[4][1] = 546;
                            this.field4028[5][1] = 4096;
                            this.field4028[2][2] = 0;
                            this.field4028[3][0] = 2781;
                            this.field4028[2][3] = 2939;
                            this.field4028[3][3] = 3565;
                            this.field4028[3][2] = 1124;
                            this.field4028[4][0] = 3481;
                            this.field4028[5][0] = 4096;
                            this.field4028[4][2] = 3084;
                            this.field4028[5][2] = 4096;
                            this.field4028[4][3] = 4031;
                            this.field4028[5][3] = 4096;
                        }
                    } else {
                        this.field4028 = new int[7][4];
                        this.field4028[0][1] = 0;
                        this.field4028[0][2] = 0;
                        this.field4028[1][1] = 0;
                        this.field4028[0][3] = 4096;
                        this.field4028[1][2] = 4096;
                        this.field4028[2][1] = 0;
                        this.field4028[0][0] = 0;
                        this.field4028[2][2] = 4096;
                        this.field4028[1][0] = 663;
                        this.field4028[1][3] = 4096;
                        this.field4028[2][0] = 1363;
                        this.field4028[3][0] = 2048;
                        this.field4028[4][0] = 2727;
                        this.field4028[3][1] = 4096;
                        this.field4028[4][1] = 4096;
                        this.field4028[5][0] = 3411;
                        this.field4028[3][2] = 4096;
                        this.field4028[4][2] = 0;
                        this.field4028[2][3] = 0;
                        this.field4028[3][3] = 0;
                        this.field4028[5][1] = 4096;
                        this.field4028[6][1] = 0;
                        this.field4028[4][3] = 0;
                        this.field4028[5][3] = 4096;
                        this.field4028[6][3] = 4096;
                        this.field4028[5][2] = 0;
                        this.field4028[6][2] = 0;
                        this.field4028[6][0] = 4096;
                    }
                } else {
                    this.field4028 = new int[8][4];
                    this.field4028[0][0] = 0;
                    this.field4028[0][3] = 2361;
                    this.field4028[1][0] = 2867;
                    this.field4028[0][1] = 2650;
                    this.field4028[0][2] = 2602;
                    this.field4028[1][3] = 1558;
                    this.field4028[2][3] = 1413;
                    this.field4028[1][2] = 1799;
                    this.field4028[1][1] = 2313;
                    this.field4028[2][2] = 1734;
                    this.field4028[3][2] = 1220;
                    this.field4028[2][0] = 3072;
                    this.field4028[3][3] = 947;
                    this.field4028[2][1] = 2618;
                    this.field4028[3][0] = 3276;
                    this.field4028[3][1] = 2296;
                    this.field4028[4][0] = 3481;
                    this.field4028[5][0] = 3686;
                    this.field4028[4][3] = 722;
                    this.field4028[6][0] = 3891;
                    this.field4028[4][1] = 2072;
                    this.field4028[5][3] = 1766;
                    this.field4028[6][3] = 915;
                    this.field4028[7][0] = 4096;
                    this.field4028[4][2] = 963;
                    this.field4028[5][1] = 2730;
                    this.field4028[6][1] = 2232;
                    this.field4028[5][2] = 2152;
                    this.field4028[6][2] = 1060;
                    this.field4028[7][3] = 1140;
                    this.field4028[7][1] = 1686;
                    this.field4028[7][2] = 1413;
                }
            } else {
                this.field4028 = new int[2][4];
                this.field4028[0][2] = 0;
                this.field4028[0][1] = 0;
                this.field4028[0][3] = 0;
                this.field4028[1][2] = 4096;
                this.field4028[1][1] = 4096;
                this.field4028[0][0] = 0;
                this.field4028[1][0] = 4096;
                this.field4028[1][3] = 4096;
            }
        }
        if (arg0 > -72) {
            this.method11(true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1338(byte arg0, Component arg1) {
        arg1.removeMouseListener(class158.field3210);
        ++field4031;
        arg1.removeMouseMotionListener(class158.field3210);
        arg1.removeFocusListener(class158.field3210);
        class207.field4124 = 0;
        if (arg0 < 78) {
            field4022 = false;
        }
    }
}
