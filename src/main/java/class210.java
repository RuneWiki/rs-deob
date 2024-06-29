import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class210 extends class11 {

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
    private int[] field2923 = new int[257];

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Lwj;")
    public static class270 field2928 = new class270(62, -1);

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2932 = 1338;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
    public static int[] field2937;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[[I")
    private int[][] field2925;

    static {
        new class466((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field2935 = 1;
        field2937 = new int[] { 28, 35, 40, 44 };
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V", line = 4)
    public static void method1296(byte arg0) {
        if (arg0 != 99) {
            method1300(-72, (int[]) null, (byte) -22, 6, 69);
        }
        field2937 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 15)
    public static final void method1297(byte arg0, String arg1, boolean arg2) {
        if (arg0 > -124) {
            method1300(111, (int[]) null, (byte) 50, -65, -49);
        }
        ++field2926;
        if (arg1 != null) {
            if (class18.field235 >= 100) {
                class49.method438(class357.field5214.method2731(62, class372.field5455), (byte) -76);
            } else {
                String var3 = class525.method3124(false, arg1);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class18.field235; ++var4) {
                        String var8 = class525.method3124(false, class165.field2479[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class49.method438(arg1 + class412.field6017.method2731(62, class372.field5455), (byte) -80);
                            return;
                        }
                        if (class413.field6031[var4] != null) {
                            String var9 = class525.method3124(false, class413.field6031[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class49.method438(arg1 + class412.field6017.method2731(62, class372.field5455), (byte) -90);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~var5 > ~class174.field2588; ++var5) {
                        String var6 = class525.method3124(false, class258.field3597[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class49.method438(class288.field3996.method2731(62, class372.field5455) + arg1 + class315.field4322.method2731(62, class372.field5455), (byte) -74);
                            return;
                        }
                        if (class473.field6913[var5] != null) {
                            String var7 = class525.method3124(false, class473.field6913[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class49.method438(class288.field3996.method2731(62, class372.field5455) + arg1 + class315.field4322.method2731(62, class372.field5455), (byte) -99);
                                return;
                            }
                        }
                    }
                    if (class525.method3124(false, class316.field4324.field6421).equals(var3)) {
                        class49.method438(class444.field6550.method2731(62, class372.field5455), (byte) -102);
                    } else {
                        ++class514.field7609;
                        class491.method2878((byte) 92, class90.field1310);
                        class481.field7027.method2302(-4, 1 + class252.method1507(arg1, true));
                        class481.field7027.method2349(arg1, true);
                        class481.field7027.method2302(-4, !arg2 ? 0 : 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V", line = 112)
    public static final void method1298(int arg0, boolean arg1) {
        ++field2929;
        if (arg0 > -19) {
            field2932 = 116;
        }
        class436.method2569(class188.field2723, 31708, class117.field1754, class27.field359, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 123)
    private final void method1299(int arg0) {
        ++field2924;
        int var2 = this.field2925.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field2925[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var4) {
                    int[] var7 = this.field2925[var2 + -1];
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field2925[var4];
                    if (var4 <= 0) {
                        var9 = var11[1];
                        var8 = var11[2];
                        var10 = var11[3];
                    } else {
                        int[] var12 = this.field2925[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = 4096 - var13;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
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
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field2923[var3] = class255.method1532(class255.method1532(var17 << 16, var16 << 8), var15);
            }
        }
        if (arg0 != 0) {
            method1300(-58, (int[]) null, (byte) -98, 26, 113);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[IBII)V", line = 232)
    public static final void method1300(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        --arg0;
        ++field2922;
        if (arg2 > 70) {
            int var13 = arg3 - 1;
            int var5 = var13 - 7;
            while (arg0 < var5) {
                int var6 = arg0 + 1;
                arg1[var6] = arg4;
                int var7 = var6 + 1;
                arg1[var7] = arg4;
                int var8 = var7 + 1;
                arg1[var8] = arg4;
                int var9 = var8 + 1;
                arg1[var9] = arg4;
                int var10 = var9 + 1;
                arg1[var10] = arg4;
                int var11 = var10 + 1;
                arg1[var11] = arg4;
                int var12 = var11 + 1;
                arg1[var12] = arg4;
                arg0 = var12 + 1;
                arg1[arg0] = arg4;
            }
            while (~var13 < ~arg0) {
                ++arg0;
                arg1[arg0] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[[I", line = 260)
    public final int[][] method41(int arg0, int arg1) {
        ++field2930;
        int[][] var3 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var4 = this.method48(arg1, 0, (byte) -67);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class90.field1316; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2923[var9];
                var5[var8] = class251.method1501(16711680, var10) >> 12;
                var6[var8] = class251.method1501(65280, var10) >> 4;
                var7[var8] = class251.method1501(4080, var10 << 4);
            }
        }
        int var11 = 117 % ((-75 - arg0) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 311)
    public class210() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIIIIIIZ)V", line = 328)
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2933;
        if (class211.field2950 != null) {
            class77 var15;
            if (arg6 >= 0) {
                int var14 = arg6 + -1;
                var15 = class378.field5533[var14];
            } else {
                int var16 = -arg6 + -1;
                if (class152.field2335 != var16) {
                    var15 = class12.field182[var16];
                } else {
                    var15 = class316.field4324;
                }
            }
            if (var15 != null) {
                class220 var17 = class78.field1141.method2103(arg3, arg13);
                int var18;
                int var19;
                if (arg7 != 1 && arg7 != 3) {
                    var18 = var17.field3118;
                    var19 = var17.field3143;
                } else {
                    var19 = var17.field3118;
                    var18 = var17.field3143;
                }
                int var20 = (var19 >> 1) + arg12;
                int var21 = (var19 + 1 >> 1) + arg12;
                int var22 = (var18 >> 1) + arg2;
                int var23 = arg2 - -(var18 - -1 >> 1);
                class142 var24 = class211.field2950[arg11];
                int var25 = var24.method351(var20, var22) + (var24.method351(var21, var22) - -var24.method351(var20, var23)) + var24.method351(var21, var23) >> 2;
                class420 var26 = new class420();
                if (arg10 > arg8) {
                    int var27 = arg10;
                    arg10 = arg8;
                    arg8 = var27;
                }
                var26.field6142 = arg12;
                var26.field6143 = class441.field6516 + arg9;
                var26.field6133 = arg7;
                var26.field6140 = class441.field6516 - -arg0;
                var26.field6146 = arg2;
                var26.field6150 = arg1;
                var26.field6152 = var15.field1738;
                var26.field6144 = arg3;
                var26.field6149 = arg12 - -arg10;
                if (arg13) {
                    if (arg4 > arg5) {
                        int var28 = arg4;
                        arg4 = arg5;
                        arg5 = var28;
                    }
                    var26.field6151 = arg8 + arg12;
                    var26.field6135 = var25;
                    var26.field6141 = (var26.field6142 << 7) + (var19 << 6);
                    var26.field6139 = (var26.field6146 << 7) + (var18 << 6);
                    var26.field6153 = arg2 + arg4;
                    var26.field6138 = arg2 + arg5;
                    class441.field6525.method2809(var26, 2);
                    var15.field1125 = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V", line = 428)
    private final void method1302(int arg0, byte arg1) {
        ++field2921;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2925 = new int[4][4];
                                this.field2925[0][1] = 0;
                                this.field2925[0][0] = 2048;
                                this.field2925[0][2] = 4096;
                                this.field2925[0][3] = 0;
                                this.field2925[1][3] = 0;
                                this.field2925[1][1] = 4096;
                                this.field2925[1][2] = 4096;
                                this.field2925[1][0] = 2867;
                                this.field2925[2][1] = 4096;
                                this.field2925[2][0] = 3276;
                                this.field2925[2][2] = 4096;
                                this.field2925[2][3] = 0;
                                this.field2925[3][2] = 0;
                                this.field2925[3][0] = 4096;
                                this.field2925[3][1] = 4096;
                                this.field2925[3][3] = 0;
                            } else {
                                this.field2925 = new int[16][4];
                                this.field2925[0][2] = 192;
                                this.field2925[0][3] = 321;
                                this.field2925[0][0] = 0;
                                this.field2925[0][1] = 80;
                                this.field2925[1][0] = 155;
                                this.field2925[1][1] = 321;
                                this.field2925[1][2] = 449;
                                this.field2925[1][3] = 562;
                                this.field2925[2][0] = 389;
                                this.field2925[2][1] = 578;
                                this.field2925[2][2] = 690;
                                this.field2925[2][3] = 803;
                                this.field2925[3][1] = 947;
                                this.field2925[3][2] = 995;
                                this.field2925[3][0] = 671;
                                this.field2925[3][3] = 1140;
                                this.field2925[4][3] = 1509;
                                this.field2925[4][1] = 1285;
                                this.field2925[4][0] = 897;
                                this.field2925[4][2] = 1397;
                                this.field2925[5][3] = 1413;
                                this.field2925[5][0] = 1175;
                                this.field2925[5][2] = 1429;
                                this.field2925[5][1] = 1525;
                                this.field2925[6][1] = 1734;
                                this.field2925[6][2] = 1461;
                                this.field2925[6][3] = 1333;
                                this.field2925[6][0] = 1368;
                                this.field2925[7][0] = 1507;
                                this.field2925[7][1] = 1413;
                                this.field2925[7][2] = 1525;
                                this.field2925[7][3] = 1702;
                                this.field2925[8][0] = 1736;
                                this.field2925[8][3] = 2056;
                                this.field2925[8][2] = 1590;
                                this.field2925[8][1] = 1108;
                                this.field2925[9][2] = 2056;
                                this.field2925[9][0] = 2088;
                                this.field2925[9][1] = 1766;
                                this.field2925[9][3] = 2666;
                                this.field2925[10][1] = 2409;
                                this.field2925[10][2] = 2586;
                                this.field2925[10][3] = 3276;
                                this.field2925[10][0] = 2355;
                                this.field2925[11][0] = 2691;
                                this.field2925[11][1] = 3116;
                                this.field2925[11][2] = 3148;
                                this.field2925[11][3] = 3228;
                                this.field2925[12][3] = 3196;
                                this.field2925[12][1] = 3806;
                                this.field2925[12][2] = 3710;
                                this.field2925[12][0] = 3031;
                                this.field2925[13][2] = 3421;
                                this.field2925[13][3] = 3019;
                                this.field2925[13][0] = 3522;
                                this.field2925[13][1] = 3437;
                                this.field2925[14][1] = 3116;
                                this.field2925[14][0] = 3727;
                                this.field2925[14][3] = 3228;
                                this.field2925[14][2] = 3148;
                                this.field2925[15][0] = 4096;
                                this.field2925[15][1] = 2377;
                                this.field2925[15][2] = 2505;
                                this.field2925[15][3] = 2746;
                            }
                        } else {
                            this.field2925 = new int[6][4];
                            this.field2925[0][2] = 0;
                            this.field2925[0][0] = 0;
                            this.field2925[0][1] = 0;
                            this.field2925[0][3] = 0;
                            this.field2925[1][0] = 1843;
                            this.field2925[1][3] = 1493;
                            this.field2925[1][2] = 0;
                            this.field2925[1][1] = 0;
                            this.field2925[2][2] = 0;
                            this.field2925[2][3] = 2939;
                            this.field2925[2][0] = 2457;
                            this.field2925[2][1] = 0;
                            this.field2925[3][3] = 3565;
                            this.field2925[3][2] = 1124;
                            this.field2925[3][0] = 2781;
                            this.field2925[3][1] = 0;
                            this.field2925[4][2] = 3084;
                            this.field2925[4][1] = 546;
                            this.field2925[4][3] = 4031;
                            this.field2925[4][0] = 3481;
                            this.field2925[5][1] = 4096;
                            this.field2925[5][3] = 4096;
                            this.field2925[5][0] = 4096;
                            this.field2925[5][2] = 4096;
                        }
                    } else {
                        this.field2925 = new int[7][4];
                        this.field2925[0][2] = 0;
                        this.field2925[0][3] = 4096;
                        this.field2925[0][1] = 0;
                        this.field2925[0][0] = 0;
                        this.field2925[1][1] = 0;
                        this.field2925[1][3] = 4096;
                        this.field2925[1][0] = 663;
                        this.field2925[1][2] = 4096;
                        this.field2925[2][2] = 4096;
                        this.field2925[2][0] = 1363;
                        this.field2925[2][3] = 0;
                        this.field2925[2][1] = 0;
                        this.field2925[3][1] = 4096;
                        this.field2925[3][0] = 2048;
                        this.field2925[3][2] = 4096;
                        this.field2925[3][3] = 0;
                        this.field2925[4][2] = 0;
                        this.field2925[4][0] = 2727;
                        this.field2925[4][3] = 0;
                        this.field2925[4][1] = 4096;
                        this.field2925[5][3] = 4096;
                        this.field2925[5][1] = 4096;
                        this.field2925[5][2] = 0;
                        this.field2925[5][0] = 3411;
                        this.field2925[6][0] = 4096;
                        this.field2925[6][3] = 4096;
                        this.field2925[6][1] = 0;
                        this.field2925[6][2] = 0;
                    }
                } else {
                    this.field2925 = new int[8][4];
                    this.field2925[0][0] = 0;
                    this.field2925[0][3] = 2361;
                    this.field2925[0][2] = 2602;
                    this.field2925[0][1] = 2650;
                    this.field2925[1][1] = 2313;
                    this.field2925[1][3] = 1558;
                    this.field2925[1][0] = 2867;
                    this.field2925[1][2] = 1799;
                    this.field2925[2][0] = 3072;
                    this.field2925[2][1] = 2618;
                    this.field2925[2][3] = 1413;
                    this.field2925[2][2] = 1734;
                    this.field2925[3][0] = 3276;
                    this.field2925[3][2] = 1220;
                    this.field2925[3][1] = 2296;
                    this.field2925[3][3] = 947;
                    this.field2925[4][2] = 963;
                    this.field2925[4][3] = 722;
                    this.field2925[4][1] = 2072;
                    this.field2925[4][0] = 3481;
                    this.field2925[5][1] = 2730;
                    this.field2925[5][0] = 3686;
                    this.field2925[5][3] = 1766;
                    this.field2925[5][2] = 2152;
                    this.field2925[6][2] = 1060;
                    this.field2925[6][1] = 2232;
                    this.field2925[6][0] = 3891;
                    this.field2925[6][3] = 915;
                    this.field2925[7][0] = 4096;
                    this.field2925[7][1] = 1686;
                    this.field2925[7][2] = 1413;
                    this.field2925[7][3] = 1140;
                }
            } else {
                this.field2925 = new int[2][4];
                this.field2925[0][3] = 0;
                this.field2925[0][2] = 0;
                this.field2925[0][0] = 0;
                this.field2925[0][1] = 0;
                this.field2925[1][1] = 4096;
                this.field2925[1][3] = 4096;
                this.field2925[1][0] = 4096;
                this.field2925[1][2] = 4096;
            }
        }
        int var4 = -98 / ((arg1 - -9) / 36);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V", line = 684)
    public final void method42(boolean arg0) {
        ++field2934;
        if (!arg0) {
            field2931 = -31;
        }
        if (this.field2925 == null) {
            this.method1302(1, (byte) 82);
        }
        this.method1299(0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lsi;II)V", line = 698)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field2927;
        if (arg1 > -40) {
            method1298(-3, false);
        }
        if (arg2 == 0) {
            int var4 = arg0.method2348(-2);
            if (var4 != 0) {
                this.method1302(var4, (byte) -65);
            } else {
                this.field2925 = new int[arg0.method2348(-2)][4];
                for (int var5 = 0; this.field2925.length > var5; ++var5) {
                    this.field2925[var5][0] = arg0.method2353((byte) 111);
                    this.field2925[var5][1] = arg0.method2348(-2) << 4;
                    this.field2925[var5][2] = arg0.method2348(-2) << 4;
                    this.field2925[var5][3] = arg0.method2348(-2) << 4;
                }
            }
        }
    }
}
