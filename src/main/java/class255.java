import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class255 extends class212 {

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "[I")
    private int[] field4458 = new int[257];

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "Lsc;")
    public static class181 field4464 = class149.method967(255, "<img=0>");

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "J")
    public static long field4463 = 0L;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4457;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "[[I")
    private int[][] field4460;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field4461;
        if (~arg1 == -1) {
            int var4 = arg0.method1516((byte) 82);
            if (var4 != 0) {
                this.method1736(var4, -10984);
            } else {
                this.field4460 = new int[arg0.method1516((byte) 82)][4];
                for (int var5 = 0; ~var5 > ~this.field4460.length; ++var5) {
                    this.field4460[var5][0] = arg0.method1535(arg2 + 5);
                    this.field4460[var5][1] = arg0.method1516((byte) 82) << 4;
                    this.field4460[var5][2] = arg0.method1516((byte) 82) << 4;
                    this.field4460[var5][3] = arg0.method1516((byte) 82) << 4;
                }
            }
        }
        if (arg2 != -3) {
            field4457 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V")
    private final void method1736(int arg0, int arg1) {
        ++field4468;
        if (arg1 != -10984) {
            method1737(true, false, 41);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field4460 = new int[4][4];
                                    this.field4460[0][2] = 4096;
                                    this.field4460[0][1] = 0;
                                    this.field4460[1][2] = 4096;
                                    this.field4460[0][3] = 0;
                                    this.field4460[0][0] = 2048;
                                    this.field4460[1][1] = 4096;
                                    this.field4460[1][3] = 0;
                                    this.field4460[2][1] = 4096;
                                    this.field4460[1][0] = 2867;
                                    this.field4460[2][3] = 0;
                                    this.field4460[3][1] = 4096;
                                    this.field4460[2][0] = 3276;
                                    this.field4460[2][2] = 4096;
                                    this.field4460[3][2] = 0;
                                    this.field4460[3][3] = 0;
                                    this.field4460[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4460 = new int[16][4];
                                this.field4460[0][0] = 0;
                                this.field4460[1][0] = 155;
                                this.field4460[0][1] = 80;
                                this.field4460[0][3] = 321;
                                this.field4460[1][1] = 321;
                                this.field4460[2][1] = 578;
                                this.field4460[3][1] = 947;
                                this.field4460[0][2] = 192;
                                this.field4460[1][3] = 562;
                                this.field4460[2][3] = 803;
                                this.field4460[3][3] = 1140;
                                this.field4460[1][2] = 449;
                                this.field4460[2][2] = 690;
                                this.field4460[2][0] = 389;
                                this.field4460[3][2] = 995;
                                this.field4460[3][0] = 671;
                                this.field4460[4][0] = 897;
                                this.field4460[4][2] = 1397;
                                this.field4460[5][2] = 1429;
                                this.field4460[5][0] = 1175;
                                this.field4460[6][0] = 1368;
                                this.field4460[4][3] = 1509;
                                this.field4460[7][0] = 1507;
                                this.field4460[4][1] = 1285;
                                this.field4460[8][0] = 1736;
                                this.field4460[6][2] = 1461;
                                this.field4460[7][2] = 1525;
                                this.field4460[8][2] = 1590;
                                this.field4460[9][2] = 2056;
                                this.field4460[9][0] = 2088;
                                this.field4460[5][3] = 1413;
                                this.field4460[10][2] = 2586;
                                this.field4460[11][2] = 3148;
                                this.field4460[5][1] = 1525;
                                this.field4460[10][0] = 2355;
                                this.field4460[11][0] = 2691;
                                this.field4460[12][0] = 3031;
                                this.field4460[13][0] = 3522;
                                this.field4460[14][0] = 3727;
                                this.field4460[6][3] = 1333;
                                this.field4460[12][2] = 3710;
                                this.field4460[13][2] = 3421;
                                this.field4460[14][2] = 3148;
                                this.field4460[15][0] = 4096;
                                this.field4460[6][1] = 1734;
                                this.field4460[15][2] = 2505;
                                this.field4460[7][3] = 1702;
                                this.field4460[7][1] = 1413;
                                this.field4460[8][1] = 1108;
                                this.field4460[9][1] = 1766;
                                this.field4460[8][3] = 2056;
                                this.field4460[9][3] = 2666;
                                this.field4460[10][1] = 2409;
                                this.field4460[10][3] = 3276;
                                this.field4460[11][3] = 3228;
                                this.field4460[12][3] = 3196;
                                this.field4460[11][1] = 3116;
                                this.field4460[12][1] = 3806;
                                this.field4460[13][3] = 3019;
                                this.field4460[13][1] = 3437;
                                this.field4460[14][1] = 3116;
                                this.field4460[15][1] = 2377;
                                this.field4460[14][3] = 3228;
                                this.field4460[15][3] = 2746;
                            }
                        } else {
                            this.field4460 = new int[6][4];
                            this.field4460[0][3] = 0;
                            this.field4460[0][2] = 0;
                            this.field4460[1][2] = 0;
                            this.field4460[0][1] = 0;
                            this.field4460[2][2] = 0;
                            this.field4460[1][1] = 0;
                            this.field4460[0][0] = 0;
                            this.field4460[3][2] = 1124;
                            this.field4460[2][1] = 0;
                            this.field4460[1][0] = 1843;
                            this.field4460[3][1] = 0;
                            this.field4460[2][0] = 2457;
                            this.field4460[3][0] = 2781;
                            this.field4460[4][2] = 3084;
                            this.field4460[5][2] = 4096;
                            this.field4460[4][1] = 546;
                            this.field4460[1][3] = 1493;
                            this.field4460[5][1] = 4096;
                            this.field4460[2][3] = 2939;
                            this.field4460[3][3] = 3565;
                            this.field4460[4][0] = 3481;
                            this.field4460[5][0] = 4096;
                            this.field4460[4][3] = 4031;
                            this.field4460[5][3] = 4096;
                        }
                    } else {
                        this.field4460 = new int[7][4];
                        this.field4460[0][3] = 4096;
                        this.field4460[0][1] = 0;
                        this.field4460[1][3] = 4096;
                        this.field4460[1][1] = 0;
                        this.field4460[0][0] = 0;
                        this.field4460[2][3] = 0;
                        this.field4460[0][2] = 0;
                        this.field4460[1][0] = 663;
                        this.field4460[2][0] = 1363;
                        this.field4460[3][3] = 0;
                        this.field4460[4][3] = 0;
                        this.field4460[3][0] = 2048;
                        this.field4460[1][2] = 4096;
                        this.field4460[2][2] = 4096;
                        this.field4460[3][2] = 4096;
                        this.field4460[4][2] = 0;
                        this.field4460[5][3] = 4096;
                        this.field4460[5][2] = 0;
                        this.field4460[2][1] = 0;
                        this.field4460[3][1] = 4096;
                        this.field4460[6][3] = 4096;
                        this.field4460[6][2] = 0;
                        this.field4460[4][1] = 4096;
                        this.field4460[5][1] = 4096;
                        this.field4460[6][1] = 0;
                        this.field4460[4][0] = 2727;
                        this.field4460[5][0] = 3411;
                        this.field4460[6][0] = 4096;
                    }
                } else {
                    this.field4460 = new int[8][4];
                    this.field4460[0][2] = 2602;
                    this.field4460[1][2] = 1799;
                    this.field4460[0][1] = 2650;
                    this.field4460[0][0] = 0;
                    this.field4460[2][2] = 1734;
                    this.field4460[1][0] = 2867;
                    this.field4460[3][2] = 1220;
                    this.field4460[4][2] = 963;
                    this.field4460[2][0] = 3072;
                    this.field4460[1][1] = 2313;
                    this.field4460[5][2] = 2152;
                    this.field4460[6][2] = 1060;
                    this.field4460[3][0] = 3276;
                    this.field4460[2][1] = 2618;
                    this.field4460[3][1] = 2296;
                    this.field4460[0][3] = 2361;
                    this.field4460[4][0] = 3481;
                    this.field4460[5][0] = 3686;
                    this.field4460[7][2] = 1413;
                    this.field4460[6][0] = 3891;
                    this.field4460[1][3] = 1558;
                    this.field4460[4][1] = 2072;
                    this.field4460[2][3] = 1413;
                    this.field4460[3][3] = 947;
                    this.field4460[4][3] = 722;
                    this.field4460[5][3] = 1766;
                    this.field4460[7][0] = 4096;
                    this.field4460[5][1] = 2730;
                    this.field4460[6][3] = 915;
                    this.field4460[7][3] = 1140;
                    this.field4460[6][1] = 2232;
                    this.field4460[7][1] = 1686;
                }
            } else {
                this.field4460 = new int[2][4];
                this.field4460[0][1] = 0;
                this.field4460[1][1] = 4096;
                this.field4460[0][0] = 0;
                this.field4460[0][3] = 0;
                this.field4460[1][3] = 4096;
                this.field4460[0][2] = 0;
                this.field4460[1][0] = 4096;
                this.field4460[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZI)Lsc;")
    public static final class181 method1737(boolean arg0, boolean arg1, int arg2) {
        ++field4469;
        if (!arg1) {
            method1739(-92, 65, 93, (byte) -105, -69, 124, 119, 28);
        }
        return class198.method1346(arg0, 10, (byte) -2, arg2);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        int[][] var3 = super.field3645.method1352(arg0, -122);
        if (super.field3645.field3477) {
            int[] var4 = this.method1405(arg0, 0, 69);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class26.field452; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4458[var9];
                var5[var8] = class5.method43(var10, 16711680) >> 12;
                var7[var8] = class5.method43(4080, var10 >> 4);
                var6[var8] = class5.method43(var10 << 4, 4080);
            }
        }
        ++field4462;
        return arg1 != 16383 ? null : var3;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (this.field4460 == null) {
            this.method1736(1, -10984);
        }
        this.method1738(1598033196);
        if (!arg0) {
            field4464 = null;
        }
        ++field4470;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class255() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    private final void method1738(int arg0) {
        ++field4467;
        if (arg0 != 1598033196) {
            field4464 = null;
        }
        int var2 = this.field4460.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && this.field4460[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field4460[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field4460[var4];
                    if (var4 <= 0) {
                        var8 = var11[3];
                        var9 = var11[1];
                        var10 = var11[2];
                    } else {
                        int[] var12 = this.field4460[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var8 = var11[3] * var13 - -(var12[3] * var14) >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var16 = var8 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var9 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4458[var3] = class185.method1291(var16, class185.method1291(var15 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1739(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 < 45) {
            field4466 = 22;
        }
        ++field4465;
        if (class77.method537(-1, arg6)) {
            client.method1055(class208.field3563[arg6], -1, arg5, arg2, arg4, arg7, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V")
    public static void method1740(byte arg0) {
        field4457 = null;
        if (arg0 >= 0) {
            field4459 = -75;
        }
        field4464 = null;
    }
}
