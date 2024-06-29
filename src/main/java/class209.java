import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class209 extends class114 {

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "[I")
    private int[] field3105 = new int[257];

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field3110 = 127;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "[[I")
    private int[][] field3114;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field3103;
        if (this.field3114 == null) {
            this.method1301(1, 123);
        }
        this.method1298(-104);
        if (arg0 < 101) {
            this.method12((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field3109;
        if (arg2 != 12953) {
            this.method73((byte) 119, -69);
        }
        if (~arg1 == -1) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 != 0) {
                this.method1301(var4, arg2 ^ 13025);
            } else {
                this.field3114 = new int[arg0.method1374((byte) -60)][4];
                for (int var5 = 0; ~var5 > ~this.field3114.length; ++var5) {
                    this.field3114[var5][0] = arg0.method1379(arg2 + -13050);
                    this.field3114[var5][1] = arg0.method1374((byte) -60) << 4;
                    this.field3114[var5][2] = arg0.method1374((byte) -60) << 4;
                    this.field3114[var5][3] = arg0.method1374((byte) -60) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    private final void method1298(int arg0) {
        ++field3108;
        int var2 = this.field3114.length;
        if (arg0 > -60) {
            field3110 = 104;
        }
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field3114[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 > ~var2) {
                    int[] var7 = this.field3114[var4];
                    if (~var4 >= -1) {
                        var8 = var7[1];
                        var9 = var7[3];
                        var10 = var7[2];
                    } else {
                        int[] var11 = this.field3114[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var9 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var10 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field3114[var2 - 1];
                    var8 = var14[1];
                    var9 = var14[3];
                    var10 = var14[2];
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var17 = var10 >> 4;
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field3105[var3] = class161.method1003(class161.method1003(var17 << 8, var16 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1299(String arg0, byte arg1) {
        class258.field4165 = arg0;
        ++field3104;
        if (class45.field667.field744 != null) {
            try {
                if (arg1 <= 94) {
                    field3112 = -92;
                }
                String var2 = class45.field667.field744.getParameter("cookieprefix");
                String var3 = class45.field667.field744.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg0.length() != -1) {
                    var5 = var4 + "; Expires=" + class127.method816((byte) 96, 94608000000L + class299.method2006(9594)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class172.method1096("document.cookie=\"" + var5 + "\"", class45.field667.field744, -32189);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)V")
    public static final void method1300(int arg0, int arg1) {
        class47.field683.method943(arg1, true);
        ++field3113;
        if (arg0 != 4096) {
            field3110 = -44;
        }
        class246.field3859.method943(arg1, true);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V")
    private final void method1301(int arg0, int arg1) {
        ++field3111;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3114 = new int[4][4];
                                this.field3114[0][3] = 0;
                                this.field3114[0][2] = 4096;
                                this.field3114[1][3] = 0;
                                this.field3114[0][0] = 2048;
                                this.field3114[1][0] = 2867;
                                this.field3114[1][2] = 4096;
                                this.field3114[0][1] = 0;
                                this.field3114[2][2] = 4096;
                                this.field3114[1][1] = 4096;
                                this.field3114[2][3] = 0;
                                this.field3114[2][1] = 4096;
                                this.field3114[3][3] = 0;
                                this.field3114[3][1] = 4096;
                                this.field3114[3][2] = 0;
                                this.field3114[2][0] = 3276;
                                this.field3114[3][0] = 4096;
                            } else {
                                this.field3114 = new int[16][4];
                                this.field3114[0][3] = 321;
                                this.field3114[1][3] = 562;
                                this.field3114[2][3] = 803;
                                this.field3114[0][1] = 80;
                                this.field3114[0][0] = 0;
                                this.field3114[1][0] = 155;
                                this.field3114[0][2] = 192;
                                this.field3114[1][1] = 321;
                                this.field3114[1][2] = 449;
                                this.field3114[2][2] = 690;
                                this.field3114[3][2] = 995;
                                this.field3114[3][3] = 1140;
                                this.field3114[2][0] = 389;
                                this.field3114[4][3] = 1509;
                                this.field3114[5][3] = 1413;
                                this.field3114[3][0] = 671;
                                this.field3114[2][1] = 578;
                                this.field3114[3][1] = 947;
                                this.field3114[4][0] = 897;
                                this.field3114[5][0] = 1175;
                                this.field3114[6][0] = 1368;
                                this.field3114[7][0] = 1507;
                                this.field3114[6][3] = 1333;
                                this.field3114[8][0] = 1736;
                                this.field3114[4][1] = 1285;
                                this.field3114[4][2] = 1397;
                                this.field3114[5][1] = 1525;
                                this.field3114[9][0] = 2088;
                                this.field3114[5][2] = 1429;
                                this.field3114[6][2] = 1461;
                                this.field3114[7][2] = 1525;
                                this.field3114[10][0] = 2355;
                                this.field3114[7][3] = 1702;
                                this.field3114[8][3] = 2056;
                                this.field3114[11][0] = 2691;
                                this.field3114[8][2] = 1590;
                                this.field3114[6][1] = 1734;
                                this.field3114[9][3] = 2666;
                                this.field3114[12][0] = 3031;
                                this.field3114[7][1] = 1413;
                                this.field3114[13][0] = 3522;
                                this.field3114[8][1] = 1108;
                                this.field3114[9][1] = 1766;
                                this.field3114[10][3] = 3276;
                                this.field3114[14][0] = 3727;
                                this.field3114[11][3] = 3228;
                                this.field3114[9][2] = 2056;
                                this.field3114[10][1] = 2409;
                                this.field3114[12][3] = 3196;
                                this.field3114[13][3] = 3019;
                                this.field3114[15][0] = 4096;
                                this.field3114[10][2] = 2586;
                                this.field3114[11][1] = 3116;
                                this.field3114[12][1] = 3806;
                                this.field3114[14][3] = 3228;
                                this.field3114[11][2] = 3148;
                                this.field3114[12][2] = 3710;
                                this.field3114[13][2] = 3421;
                                this.field3114[14][2] = 3148;
                                this.field3114[15][2] = 2505;
                                this.field3114[13][1] = 3437;
                                this.field3114[14][1] = 3116;
                                this.field3114[15][1] = 2377;
                                this.field3114[15][3] = 2746;
                            }
                        } else {
                            this.field3114 = new int[6][4];
                            this.field3114[0][1] = 0;
                            this.field3114[0][2] = 0;
                            this.field3114[0][3] = 0;
                            this.field3114[1][2] = 0;
                            this.field3114[1][3] = 1493;
                            this.field3114[1][1] = 0;
                            this.field3114[2][2] = 0;
                            this.field3114[0][0] = 0;
                            this.field3114[2][3] = 2939;
                            this.field3114[3][2] = 1124;
                            this.field3114[2][1] = 0;
                            this.field3114[3][1] = 0;
                            this.field3114[4][2] = 3084;
                            this.field3114[1][0] = 1843;
                            this.field3114[5][2] = 4096;
                            this.field3114[3][3] = 3565;
                            this.field3114[4][1] = 546;
                            this.field3114[2][0] = 2457;
                            this.field3114[4][3] = 4031;
                            this.field3114[3][0] = 2781;
                            this.field3114[4][0] = 3481;
                            this.field3114[5][0] = 4096;
                            this.field3114[5][1] = 4096;
                            this.field3114[5][3] = 4096;
                        }
                    } else {
                        this.field3114 = new int[7][4];
                        this.field3114[0][3] = 4096;
                        this.field3114[1][3] = 4096;
                        this.field3114[2][3] = 0;
                        this.field3114[0][0] = 0;
                        this.field3114[1][0] = 663;
                        this.field3114[0][2] = 0;
                        this.field3114[1][2] = 4096;
                        this.field3114[0][1] = 0;
                        this.field3114[2][0] = 1363;
                        this.field3114[3][3] = 0;
                        this.field3114[1][1] = 0;
                        this.field3114[2][1] = 0;
                        this.field3114[3][0] = 2048;
                        this.field3114[3][1] = 4096;
                        this.field3114[4][3] = 0;
                        this.field3114[4][0] = 2727;
                        this.field3114[5][3] = 4096;
                        this.field3114[5][0] = 3411;
                        this.field3114[4][1] = 4096;
                        this.field3114[6][3] = 4096;
                        this.field3114[6][0] = 4096;
                        this.field3114[2][2] = 4096;
                        this.field3114[5][1] = 4096;
                        this.field3114[6][1] = 0;
                        this.field3114[3][2] = 4096;
                        this.field3114[4][2] = 0;
                        this.field3114[5][2] = 0;
                        this.field3114[6][2] = 0;
                    }
                } else {
                    this.field3114 = new int[8][4];
                    this.field3114[0][1] = 2650;
                    this.field3114[1][1] = 2313;
                    this.field3114[0][2] = 2602;
                    this.field3114[0][3] = 2361;
                    this.field3114[0][0] = 0;
                    this.field3114[1][0] = 2867;
                    this.field3114[1][3] = 1558;
                    this.field3114[1][2] = 1799;
                    this.field3114[2][2] = 1734;
                    this.field3114[2][0] = 3072;
                    this.field3114[3][2] = 1220;
                    this.field3114[3][0] = 3276;
                    this.field3114[2][1] = 2618;
                    this.field3114[2][3] = 1413;
                    this.field3114[4][0] = 3481;
                    this.field3114[3][1] = 2296;
                    this.field3114[4][1] = 2072;
                    this.field3114[5][1] = 2730;
                    this.field3114[6][1] = 2232;
                    this.field3114[4][2] = 963;
                    this.field3114[7][1] = 1686;
                    this.field3114[3][3] = 947;
                    this.field3114[4][3] = 722;
                    this.field3114[5][0] = 3686;
                    this.field3114[6][0] = 3891;
                    this.field3114[5][2] = 2152;
                    this.field3114[5][3] = 1766;
                    this.field3114[6][3] = 915;
                    this.field3114[6][2] = 1060;
                    this.field3114[7][3] = 1140;
                    this.field3114[7][2] = 1413;
                    this.field3114[7][0] = 4096;
                }
            } else {
                this.field3114 = new int[2][4];
                this.field3114[0][2] = 0;
                this.field3114[0][0] = 0;
                this.field3114[1][0] = 4096;
                this.field3114[0][3] = 0;
                this.field3114[1][2] = 4096;
                this.field3114[0][1] = 0;
                this.field3114[1][3] = 4096;
                this.field3114[1][1] = 4096;
            }
        }
        if (arg1 <= 115) {
            this.method1301(-85, 92);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V")
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class75.field1044[0].method487(arg1, arg0);
        ++field3106;
        int var6 = (arg5 + -32) * arg5 / arg3;
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (-var6 + arg5 + -32) * arg2 / (-arg5 + arg3);
        class75.field1044[1].method487(arg1, arg0 + -16 + arg5);
        class266.method1730(arg1, arg0 + 16, 16, arg5 + -32, class110.field1578);
        class266.method1730(arg1, var7 + 16 + arg0, 16, var6, class218.field3364);
        class266.method1729(arg1, arg0 + 16 + var7, var6, class233.field3650);
        class266.method1729(arg1 + 1, 16 - -var7 + arg0, var6, class233.field3650);
        class266.method1742(arg1, arg0 - -16 + var7, 16, class233.field3650);
        class266.method1742(arg1, var7 + 17 + arg0, 16, class233.field3650);
        class266.method1729(arg1 + 15, arg0 + var7 + 16, var6, class250.field3914);
        class266.method1729(arg1 + 14, arg0 + arg4 + var7, var6 - 1, class250.field3914);
        class266.method1742(arg1, var7 + 15 + var6 + arg0, 16, class250.field3914);
        class266.method1742(arg1 + 1, arg0 + 14 + var7 + var6, 15, class250.field3914);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field3101;
        int[][] var3 = super.field1627.method104(arg1, (byte) 106);
        if (arg0 != -112) {
            field3112 = -24;
        }
        if (super.field1627.field280) {
            int[] var4 = this.method729(arg1, arg0 + 112, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; class145.field2009 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3105[var9];
                var7[var8] = class32.method199(16711680, var10) >> 12;
                var5[var8] = class32.method199(var10 >> 4, 4080);
                var6[var8] = class32.method199(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lrg;I)V")
    public static final void method1303(class273 arg0, int arg1) {
        if (arg1 != 0) {
            method1299((String) null, (byte) -108);
        }
        ++field3102;
        if (arg0.field4351 != null) {
            arg0.field4351.field673 = 0;
        }
        arg0.field4348 = false;
        for (class273 var2 = arg0.method912(); var2 != null; var2 = arg0.method917()) {
            method1303(var2, 0);
        }
    }
}
