import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class21 extends class642 {

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "[I")
    private int[] field389 = new int[257];

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uv", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field395;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "[[I")
    private int[][] field391;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method142(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZF)F", line = 3)
    public static final float method137(boolean arg0, float arg1) {
        ++field394;
        return !arg0 ? 0.6056324F : arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 14)
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[[I", line = 17)
    public final int[][] method138(int arg0, int arg1) {
        ++field390;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            this.field389 = null;
        }
        if (super.field9211.field2131) {
            int[] var4 = this.method3658((byte) 117, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class338.field4909 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field389[var9];
                var5[var8] = class425.method2563(var10 >> 12, 4080);
                var6[var8] = class425.method2563(65280, var10) >> 4;
                var7[var8] = class425.method2563(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBII)Z", line = 67)
    public static final boolean method139(int arg0, byte arg1, int arg2, int arg3) {
        ++field388;
        class83 var4 = (class83) class386.method2381(arg0, arg2, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class610.method3479(false, var4);
        }
        class83 var6 = (class83) class434.method2583(arg0, arg2, arg3, field395 != null ? field395 : (field395 = method142("je")));
        if (var6 != null) {
            var5 &= class610.method3479(false, var6);
        }
        if (arg1 != 15) {
            return true;
        } else {
            class83 var7 = (class83) class566.method3261(arg0, arg2, arg3);
            if (var7 != null) {
                var5 &= class610.method3479(false, var7);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILgk;B)V", line = 100)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field387;
        if (arg2 < 29) {
            this.field389 = null;
        }
        if (arg0 == 0) {
            int var4 = arg1.method3115(29871);
            if (var4 != 0) {
                this.method140(var4, 1766);
            } else {
                this.field391 = new int[arg1.method3115(29871)][4];
                for (int var5 = 0; this.field391.length > var5; ++var5) {
                    this.field391[var5][0] = arg1.method3169(26488);
                    this.field391[var5][1] = arg1.method3115(29871) << 4;
                    this.field391[var5][2] = arg1.method3115(29871) << 4;
                    this.field391[var5][3] = arg1.method3115(29871) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)V", line = 137)
    private final void method140(int arg0, int arg1) {
        ++field392;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field391 = new int[4][4];
                                this.field391[0][0] = 2048;
                                this.field391[0][1] = 0;
                                this.field391[0][3] = 0;
                                this.field391[0][2] = 4096;
                                this.field391[1][0] = 2867;
                                this.field391[1][1] = 4096;
                                this.field391[1][2] = 4096;
                                this.field391[1][3] = 0;
                                this.field391[2][3] = 0;
                                this.field391[2][2] = 4096;
                                this.field391[2][0] = 3276;
                                this.field391[2][1] = 4096;
                                this.field391[3][3] = 0;
                                this.field391[3][1] = 4096;
                                this.field391[3][2] = 0;
                                this.field391[3][0] = 4096;
                            } else {
                                this.field391 = new int[16][4];
                                this.field391[0][3] = 321;
                                this.field391[0][0] = 0;
                                this.field391[0][1] = 80;
                                this.field391[0][2] = 192;
                                this.field391[1][1] = 321;
                                this.field391[1][2] = 449;
                                this.field391[1][3] = 562;
                                this.field391[1][0] = 155;
                                this.field391[2][3] = 803;
                                this.field391[2][1] = 578;
                                this.field391[2][2] = 690;
                                this.field391[2][0] = 389;
                                this.field391[3][0] = 671;
                                this.field391[3][1] = 947;
                                this.field391[3][2] = 995;
                                this.field391[3][3] = 1140;
                                this.field391[4][1] = 1285;
                                this.field391[4][3] = 1509;
                                this.field391[4][0] = 897;
                                this.field391[4][2] = 1397;
                                this.field391[5][1] = 1525;
                                this.field391[5][2] = 1429;
                                this.field391[5][3] = 1413;
                                this.field391[5][0] = 1175;
                                this.field391[6][1] = 1734;
                                this.field391[6][2] = 1461;
                                this.field391[6][0] = 1368;
                                this.field391[6][3] = 1333;
                                this.field391[7][0] = 1507;
                                this.field391[7][1] = 1413;
                                this.field391[7][3] = 1702;
                                this.field391[7][2] = 1525;
                                this.field391[8][1] = 1108;
                                this.field391[8][3] = 2056;
                                this.field391[8][2] = 1590;
                                this.field391[8][0] = 1736;
                                this.field391[9][2] = 2056;
                                this.field391[9][0] = 2088;
                                this.field391[9][1] = 1766;
                                this.field391[9][3] = 2666;
                                this.field391[10][0] = 2355;
                                this.field391[10][3] = 3276;
                                this.field391[10][2] = 2586;
                                this.field391[10][1] = 2409;
                                this.field391[11][2] = 3148;
                                this.field391[11][3] = 3228;
                                this.field391[11][0] = 2691;
                                this.field391[11][1] = 3116;
                                this.field391[12][3] = 3196;
                                this.field391[12][0] = 3031;
                                this.field391[12][1] = 3806;
                                this.field391[12][2] = 3710;
                                this.field391[13][0] = 3522;
                                this.field391[13][1] = 3437;
                                this.field391[13][2] = 3421;
                                this.field391[13][3] = 3019;
                                this.field391[14][3] = 3228;
                                this.field391[14][1] = 3116;
                                this.field391[14][0] = 3727;
                                this.field391[14][2] = 3148;
                                this.field391[15][1] = 2377;
                                this.field391[15][0] = 4096;
                                this.field391[15][2] = 2505;
                                this.field391[15][3] = 2746;
                            }
                        } else {
                            this.field391 = new int[6][4];
                            this.field391[0][3] = 0;
                            this.field391[0][2] = 0;
                            this.field391[0][1] = 0;
                            this.field391[0][0] = 0;
                            this.field391[1][3] = 1493;
                            this.field391[1][1] = 0;
                            this.field391[1][0] = 1843;
                            this.field391[1][2] = 0;
                            this.field391[2][1] = 0;
                            this.field391[2][3] = 2939;
                            this.field391[2][0] = 2457;
                            this.field391[2][2] = 0;
                            this.field391[3][0] = 2781;
                            this.field391[3][3] = 3565;
                            this.field391[3][1] = 0;
                            this.field391[3][2] = 1124;
                            this.field391[4][1] = 546;
                            this.field391[4][3] = 4031;
                            this.field391[4][2] = 3084;
                            this.field391[4][0] = 3481;
                            this.field391[5][1] = 4096;
                            this.field391[5][0] = 4096;
                            this.field391[5][2] = 4096;
                            this.field391[5][3] = 4096;
                        }
                    } else {
                        this.field391 = new int[7][4];
                        this.field391[0][3] = 4096;
                        this.field391[0][1] = 0;
                        this.field391[0][2] = 0;
                        this.field391[0][0] = 0;
                        this.field391[1][0] = 663;
                        this.field391[1][1] = 0;
                        this.field391[1][3] = 4096;
                        this.field391[1][2] = 4096;
                        this.field391[2][2] = 4096;
                        this.field391[2][1] = 0;
                        this.field391[2][0] = 1363;
                        this.field391[2][3] = 0;
                        this.field391[3][3] = 0;
                        this.field391[3][1] = 4096;
                        this.field391[3][2] = 4096;
                        this.field391[3][0] = 2048;
                        this.field391[4][1] = 4096;
                        this.field391[4][0] = 2727;
                        this.field391[4][2] = 0;
                        this.field391[4][3] = 0;
                        this.field391[5][1] = 4096;
                        this.field391[5][3] = 4096;
                        this.field391[5][0] = 3411;
                        this.field391[5][2] = 0;
                        this.field391[6][2] = 0;
                        this.field391[6][0] = 4096;
                        this.field391[6][3] = 4096;
                        this.field391[6][1] = 0;
                    }
                } else {
                    this.field391 = new int[8][4];
                    this.field391[0][1] = 2650;
                    this.field391[0][3] = 2361;
                    this.field391[0][2] = 2602;
                    this.field391[0][0] = 0;
                    this.field391[1][0] = 2867;
                    this.field391[1][1] = 2313;
                    this.field391[1][3] = 1558;
                    this.field391[1][2] = 1799;
                    this.field391[2][1] = 2618;
                    this.field391[2][0] = 3072;
                    this.field391[2][2] = 1734;
                    this.field391[2][3] = 1413;
                    this.field391[3][0] = 3276;
                    this.field391[3][1] = 2296;
                    this.field391[3][2] = 1220;
                    this.field391[3][3] = 947;
                    this.field391[4][0] = 3481;
                    this.field391[4][2] = 963;
                    this.field391[4][1] = 2072;
                    this.field391[4][3] = 722;
                    this.field391[5][1] = 2730;
                    this.field391[5][3] = 1766;
                    this.field391[5][2] = 2152;
                    this.field391[5][0] = 3686;
                    this.field391[6][3] = 915;
                    this.field391[6][2] = 1060;
                    this.field391[6][0] = 3891;
                    this.field391[6][1] = 2232;
                    this.field391[7][3] = 1140;
                    this.field391[7][0] = 4096;
                    this.field391[7][1] = 1686;
                    this.field391[7][2] = 1413;
                }
            } else {
                this.field391 = new int[2][4];
                this.field391[0][3] = 0;
                this.field391[0][2] = 0;
                this.field391[0][1] = 0;
                this.field391[0][0] = 0;
                this.field391[1][0] = 4096;
                this.field391[1][3] = 4096;
                this.field391[1][1] = 4096;
                this.field391[1][2] = 4096;
            }
        }
        if (arg1 != 1766) {
            this.field389 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V", line = 402)
    private final void method141(byte arg0) {
        ++field386;
        int var2 = -63 % ((arg0 - -87) / 35);
        int var3 = this.field391.length;
        if (~var3 < -1) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var7 < var3 && ~this.field391[var7][0] >= ~var6; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (~var5 <= ~var3) {
                    int[] var8 = this.field391[var3 + -1];
                    var9 = var8[3];
                    var10 = var8[1];
                    var11 = var8[2];
                } else {
                    int[] var12 = this.field391[var5];
                    if (~var5 >= -1) {
                        var9 = var12[3];
                        var11 = var12[2];
                        var10 = var12[1];
                    } else {
                        int[] var13 = this.field391[var5 + -1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                        int var15 = -var14 + 4096;
                        var9 = var12[3] * var14 + var13[3] * var15 >> 12;
                        var11 = var12[2] * var14 - -(var13[2] * var15) >> 12;
                        var10 = var12[1] * var14 + var13[1] * var15 >> 12;
                    }
                }
                int var16 = var9 >> 4;
                int var17 = var11 >> 4;
                int var18 = var10 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                this.field389[var4] = class151.method1076(class151.method1076(var18 << 16, var17 << 8), var16);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V", line = 503)
    public final void method2(int arg0) {
        ++field393;
        if (this.field391 == null) {
            this.method140(1, 1766);
        }
        if (arg0 != 6276) {
            this.field391 = null;
        }
        this.method141((byte) -126);
    }
}
