import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class334 extends class667 {

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
    private int[] field4729 = new int[257];

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field4722 = -1;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "Lqaa;")
    public static class27 field4725 = new class27(75, 8);

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4727;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "[[I")
    private int[][] field4733;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    private final void method2134(int arg0) {
        ++field4728;
        int var2 = this.field4733.length;
        if (arg0 > ~var2) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field4733[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field4733[var4];
                    if (var4 <= 0) {
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field4733[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field4733[var2 + -1];
                    var10 = var14[3];
                    var8 = var14[1];
                    var9 = var14[2];
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
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field4729[var3] = class164.method1221(class164.method1221(var17 << 8, var16 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(Z)V")
    public static void method2135(boolean arg0) {
        if (!arg0) {
            field4727 = null;
        }
        field4727 = null;
        field4725 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field4731;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[] var4 = this.method3744(arg1, (byte) 9, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class77.field1455; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4729[var9];
                var5[var8] = class555.method3246(16711680, var10) >> 12;
                var6[var8] = class555.method3246(65280, var10) >> 4;
                var7[var8] = class555.method3246(var10, 255) << 4;
            }
        }
        if (arg0) {
            this.method116((class35) null, 42, -49);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2136(boolean arg0, String arg1) {
        System.exit(1);
        ++field4726;
        if (arg0) {
            method2138(false, true);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    private final void method2137(int arg0, int arg1) {
        ++field4732;
        if (arg1 == 4) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field4733 = new int[4][4];
                                        this.field4733[0][2] = 4096;
                                        this.field4733[0][0] = 2048;
                                        this.field4733[0][1] = 0;
                                        this.field4733[0][3] = 0;
                                        this.field4733[1][2] = 4096;
                                        this.field4733[1][0] = 2867;
                                        this.field4733[1][1] = 4096;
                                        this.field4733[1][3] = 0;
                                        this.field4733[2][3] = 0;
                                        this.field4733[2][0] = 3276;
                                        this.field4733[2][2] = 4096;
                                        this.field4733[2][1] = 4096;
                                        this.field4733[3][1] = 4096;
                                        this.field4733[3][0] = 4096;
                                        this.field4733[3][3] = 0;
                                        this.field4733[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field4733 = new int[16][4];
                                    this.field4733[0][2] = 192;
                                    this.field4733[0][1] = 80;
                                    this.field4733[0][0] = 0;
                                    this.field4733[0][3] = 321;
                                    this.field4733[1][3] = 562;
                                    this.field4733[1][2] = 449;
                                    this.field4733[1][1] = 321;
                                    this.field4733[1][0] = 155;
                                    this.field4733[2][0] = 389;
                                    this.field4733[2][3] = 803;
                                    this.field4733[2][1] = 578;
                                    this.field4733[2][2] = 690;
                                    this.field4733[3][0] = 671;
                                    this.field4733[3][3] = 1140;
                                    this.field4733[3][2] = 995;
                                    this.field4733[3][1] = 947;
                                    this.field4733[4][3] = 1509;
                                    this.field4733[4][2] = 1397;
                                    this.field4733[4][0] = 897;
                                    this.field4733[4][1] = 1285;
                                    this.field4733[5][3] = 1413;
                                    this.field4733[5][1] = 1525;
                                    this.field4733[5][2] = 1429;
                                    this.field4733[5][0] = 1175;
                                    this.field4733[6][0] = 1368;
                                    this.field4733[6][2] = 1461;
                                    this.field4733[6][3] = 1333;
                                    this.field4733[6][1] = 1734;
                                    this.field4733[7][1] = 1413;
                                    this.field4733[7][3] = 1702;
                                    this.field4733[7][0] = 1507;
                                    this.field4733[7][2] = 1525;
                                    this.field4733[8][0] = 1736;
                                    this.field4733[8][3] = 2056;
                                    this.field4733[8][2] = 1590;
                                    this.field4733[8][1] = 1108;
                                    this.field4733[9][0] = 2088;
                                    this.field4733[9][2] = 2056;
                                    this.field4733[9][1] = 1766;
                                    this.field4733[9][3] = 2666;
                                    this.field4733[10][1] = 2409;
                                    this.field4733[10][2] = 2586;
                                    this.field4733[10][3] = 3276;
                                    this.field4733[10][0] = 2355;
                                    this.field4733[11][0] = 2691;
                                    this.field4733[11][3] = 3228;
                                    this.field4733[11][2] = 3148;
                                    this.field4733[11][1] = 3116;
                                    this.field4733[12][3] = 3196;
                                    this.field4733[12][1] = 3806;
                                    this.field4733[12][0] = 3031;
                                    this.field4733[12][2] = 3710;
                                    this.field4733[13][1] = 3437;
                                    this.field4733[13][2] = 3421;
                                    this.field4733[13][0] = 3522;
                                    this.field4733[13][3] = 3019;
                                    this.field4733[14][0] = 3727;
                                    this.field4733[14][1] = 3116;
                                    this.field4733[14][3] = 3228;
                                    this.field4733[14][2] = 3148;
                                    this.field4733[15][2] = 2505;
                                    this.field4733[15][1] = 2377;
                                    this.field4733[15][3] = 2746;
                                    this.field4733[15][0] = 4096;
                                }
                            } else {
                                this.field4733 = new int[6][4];
                                this.field4733[0][2] = 0;
                                this.field4733[0][1] = 0;
                                this.field4733[0][0] = 0;
                                this.field4733[0][3] = 0;
                                this.field4733[1][0] = 1843;
                                this.field4733[1][2] = 0;
                                this.field4733[1][1] = 0;
                                this.field4733[1][3] = 1493;
                                this.field4733[2][2] = 0;
                                this.field4733[2][3] = 2939;
                                this.field4733[2][0] = 2457;
                                this.field4733[2][1] = 0;
                                this.field4733[3][0] = 2781;
                                this.field4733[3][2] = 1124;
                                this.field4733[3][3] = 3565;
                                this.field4733[3][1] = 0;
                                this.field4733[4][3] = 4031;
                                this.field4733[4][0] = 3481;
                                this.field4733[4][2] = 3084;
                                this.field4733[4][1] = 546;
                                this.field4733[5][2] = 4096;
                                this.field4733[5][0] = 4096;
                                this.field4733[5][1] = 4096;
                                this.field4733[5][3] = 4096;
                            }
                        } else {
                            this.field4733 = new int[7][4];
                            this.field4733[0][2] = 0;
                            this.field4733[0][1] = 0;
                            this.field4733[0][0] = 0;
                            this.field4733[0][3] = 4096;
                            this.field4733[1][0] = 663;
                            this.field4733[1][3] = 4096;
                            this.field4733[1][1] = 0;
                            this.field4733[1][2] = 4096;
                            this.field4733[2][3] = 0;
                            this.field4733[2][0] = 1363;
                            this.field4733[2][1] = 0;
                            this.field4733[2][2] = 4096;
                            this.field4733[3][3] = 0;
                            this.field4733[3][0] = 2048;
                            this.field4733[3][2] = 4096;
                            this.field4733[3][1] = 4096;
                            this.field4733[4][1] = 4096;
                            this.field4733[4][3] = 0;
                            this.field4733[4][0] = 2727;
                            this.field4733[4][2] = 0;
                            this.field4733[5][0] = 3411;
                            this.field4733[5][1] = 4096;
                            this.field4733[5][2] = 0;
                            this.field4733[5][3] = 4096;
                            this.field4733[6][2] = 0;
                            this.field4733[6][1] = 0;
                            this.field4733[6][0] = 4096;
                            this.field4733[6][3] = 4096;
                        }
                    } else {
                        this.field4733 = new int[8][4];
                        this.field4733[0][1] = 2650;
                        this.field4733[0][2] = 2602;
                        this.field4733[0][0] = 0;
                        this.field4733[0][3] = 2361;
                        this.field4733[1][3] = 1558;
                        this.field4733[1][0] = 2867;
                        this.field4733[1][1] = 2313;
                        this.field4733[1][2] = 1799;
                        this.field4733[2][3] = 1413;
                        this.field4733[2][0] = 3072;
                        this.field4733[2][1] = 2618;
                        this.field4733[2][2] = 1734;
                        this.field4733[3][3] = 947;
                        this.field4733[3][2] = 1220;
                        this.field4733[3][0] = 3276;
                        this.field4733[3][1] = 2296;
                        this.field4733[4][3] = 722;
                        this.field4733[4][1] = 2072;
                        this.field4733[4][0] = 3481;
                        this.field4733[4][2] = 963;
                        this.field4733[5][2] = 2152;
                        this.field4733[5][1] = 2730;
                        this.field4733[5][3] = 1766;
                        this.field4733[5][0] = 3686;
                        this.field4733[6][1] = 2232;
                        this.field4733[6][0] = 3891;
                        this.field4733[6][2] = 1060;
                        this.field4733[6][3] = 915;
                        this.field4733[7][1] = 1686;
                        this.field4733[7][0] = 4096;
                        this.field4733[7][2] = 1413;
                        this.field4733[7][3] = 1140;
                    }
                } else {
                    this.field4733 = new int[2][4];
                    this.field4733[0][2] = 0;
                    this.field4733[0][0] = 0;
                    this.field4733[0][1] = 0;
                    this.field4733[0][3] = 0;
                    this.field4733[1][3] = 4096;
                    this.field4733[1][2] = 4096;
                    this.field4733[1][1] = 4096;
                    this.field4733[1][0] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        if (this.field4733 == null) {
            this.method2137(1, 4);
        }
        ++field4724;
        this.method2134(-1);
        if (arg0) {
            this.field4733 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field4727 = null;
        }
        if (arg2 == 0) {
            int var4 = arg0.method273(255);
            if (var4 == 0) {
                this.field4733 = new int[arg0.method273(255)][4];
                for (int var5 = 0; this.field4733.length > var5; ++var5) {
                    this.field4733[var5][0] = arg0.method253(class349.method2193(arg1, -13897));
                    this.field4733[var5][1] = arg0.method273(255) << 4;
                    this.field4733[var5][2] = arg0.method273(255) << 4;
                    this.field4733[var5][3] = arg0.method273(255) << 4;
                }
            } else {
                this.method2137(var4, arg1 + 1);
            }
        }
        ++field4730;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZZ)V")
    public static final void method2138(boolean arg0, boolean arg1) {
        ++field4723;
        int var2 = class603.field8761;
        if (!arg0) {
            int var3 = class573.field8122;
            if (arg1 && class339.field4781) {
                var2 <<= 1;
                var3 = -var2;
            }
            class359.field5046.method556(var3, var2);
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
    public class334() {
        super(1, false);
    }
}
