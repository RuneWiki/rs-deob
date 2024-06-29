import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 extends class157 {

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "[I")
    private int[] field1215 = new int[257];

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "S")
    public static short field1199 = 1;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "[Lek;")
    public static class163[] field1207 = new class163[32768];

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "Lcc;")
    public static class209 field1206 = class95.method669(125, "(U0a )2 in: ");

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "Z")
    public static boolean field1201 = false;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "Lcc;")
    public static class209 field1212 = class95.method669(118, "tremblement:");

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field1202 = 0;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lcc;")
    public static class209 field1211 = class95.method669(119, "::clientdrop");

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "S")
    public static short field1200 = 32767;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "[[I")
    private int[][] field1208;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field1214;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int[] var4 = this.method1097((byte) 75, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class226.field4124; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1215[var9];
                var5[var8] = class27.method220(16711680, var10) >> 12;
                var6[var8] = class27.method220(var10, 65280) >> 4;
                var7[var8] = class27.method220(var10, 255) << 4;
            }
        }
        return arg0 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method774((byte) 81);
            if (var4 == 0) {
                this.field1208 = new int[arg2.method774((byte) 127)][4];
                for (int var5 = 0; this.field1208.length > var5; ++var5) {
                    this.field1208[var5][0] = arg2.method736(127);
                    this.field1208[var5][1] = arg2.method774((byte) 115) << 4;
                    this.field1208[var5][2] = arg2.method774((byte) 127) << 4;
                    this.field1208[var5][3] = arg2.method774((byte) 126) << 4;
                }
            } else {
                this.method457(var4, -26504);
            }
        }
        ++field1209;
        if (arg1 >= -29) {
            field1212 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= -50) {
            method455(33, -55, 20, 62, -110, -4, 56);
        }
        for (class92 var5 = (class92) class273.field4846.method1119(20896); var5 != null; var5 = (class92) class273.field4846.method1120(106)) {
            class82.method584(arg4, 0, arg0, arg3, var5, arg1);
        }
        for (class92 var6 = (class92) class87.field1722.method1119(20896); var6 != null; var6 = (class92) class87.field1722.method1120(32)) {
            byte var10 = 1;
            if (var6.field1829.field1551 != var6.field1829.field1549) {
                if (var6.field1829.field1551 == var6.field1829.field1513) {
                    var10 = 2;
                }
            } else {
                var10 = 0;
            }
            if (~var6.field1822 != ~var10) {
                int var11 = class210.method1494(-120, var6.field1829);
                if (~var6.field1812 != ~var11) {
                    if (var6.field1830 != null) {
                        class47.field906.method1519(var6.field1830);
                        var6.field1830 = null;
                    }
                    var6.field1812 = var11;
                }
                var6.field1822 = var10;
            }
            var6.field1828 = var6.field1829.field1571;
            var6.field1813 = var6.field1829.field1571 + 64 * var6.field1829.method577((byte) 80);
            var6.field1820 = var6.field1829.field1534;
            var6.field1827 = var6.field1829.field1534 + 64 * var6.field1829.method577((byte) 116);
            class82.method584(arg4, 0, arg0, arg3, var6, arg1);
        }
        ++field1197;
        for (class92 var7 = (class92) class210.field3823.method1759((byte) 43); var7 != null; var7 = (class92) class210.field3823.method1767((byte) 41)) {
            byte var8 = 1;
            if (~var7.field1818.field1551 == ~var7.field1818.field1549) {
                var8 = 0;
            } else if (var7.field1818.field1551 == var7.field1818.field1513) {
                var8 = 2;
            }
            if (~var7.field1822 != ~var8) {
                int var9 = class200.method1369(var7.field1818, -52);
                if (var7.field1812 != var9) {
                    if (var7.field1830 != null) {
                        class47.field906.method1519(var7.field1830);
                        var7.field1830 = null;
                    }
                    var7.field1812 = var9;
                }
                var7.field1822 = var8;
            }
            var7.field1828 = var7.field1818.field1571;
            var7.field1813 = var7.field1818.field1571 + var7.field1818.method577((byte) 61) * 64;
            var7.field1820 = var7.field1818.field1534;
            var7.field1827 = var7.field1818.field1534 + 64 * var7.field1818.method577((byte) -41);
            class82.method584(arg4, 0, arg0, arg3, var7, arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = -84 % ((-51 - arg0) / 52);
        if (this.field1208 == null) {
            this.method457(1, -26504);
        }
        this.method454(-65);
        ++field1205;
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
    private final void method454(int arg0) {
        ++field1204;
        if (arg0 > -13) {
            this.method454(-48);
        }
        int var2 = this.field1208.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && ~this.field1208[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field1208[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field1208[var4];
                    if (~var4 >= -1) {
                        var8 = var11[3];
                        var9 = var11[2];
                        var10 = var11[1];
                    } else {
                        int[] var12 = this.field1208[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field1215[var3] = class6.method63(var15, class6.method63(var17 << 16, var16 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(-arg2 + arg1) <= ~class262.field4723 && ~class230.field4184 <= ~(arg1 + arg2) && -arg2 + arg4 >= class102.field1957 && class155.field2847 >= arg4 - -arg2) {
            class14.method104(arg6, arg2, arg4, arg0, false, arg1, arg5);
        } else {
            class51.method387(arg0, arg5, 121, arg1, arg4, arg2, arg6);
        }
        if (arg3 >= 88) {
            ++field1198;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1206 = null;
        field1211 = null;
        field1212 = null;
        if (arg0 != 3) {
            method453(54, -100, -8, 115, 63);
        }
        field1207 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
    private final void method457(int arg0, int arg1) {
        if (arg1 != -26504) {
            method455(-119, 44, -30, 60, 29, -81, 6);
        }
        ++field1203;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1208 = new int[4][4];
                                    this.field1208[0][0] = 2048;
                                    this.field1208[0][3] = 0;
                                    this.field1208[0][2] = 4096;
                                    this.field1208[0][1] = 0;
                                    this.field1208[1][2] = 4096;
                                    this.field1208[1][0] = 2867;
                                    this.field1208[1][3] = 0;
                                    this.field1208[2][2] = 4096;
                                    this.field1208[3][2] = 0;
                                    this.field1208[2][3] = 0;
                                    this.field1208[1][1] = 4096;
                                    this.field1208[2][0] = 3276;
                                    this.field1208[2][1] = 4096;
                                    this.field1208[3][1] = 4096;
                                    this.field1208[3][3] = 0;
                                    this.field1208[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field1208 = new int[16][4];
                                this.field1208[0][0] = 0;
                                this.field1208[0][2] = 192;
                                this.field1208[0][1] = 80;
                                this.field1208[1][0] = 155;
                                this.field1208[2][0] = 389;
                                this.field1208[3][0] = 671;
                                this.field1208[1][2] = 449;
                                this.field1208[4][0] = 897;
                                this.field1208[0][3] = 321;
                                this.field1208[2][2] = 690;
                                this.field1208[1][1] = 321;
                                this.field1208[2][1] = 578;
                                this.field1208[5][0] = 1175;
                                this.field1208[6][0] = 1368;
                                this.field1208[3][2] = 995;
                                this.field1208[7][0] = 1507;
                                this.field1208[1][3] = 562;
                                this.field1208[3][1] = 947;
                                this.field1208[4][2] = 1397;
                                this.field1208[2][3] = 803;
                                this.field1208[4][1] = 1285;
                                this.field1208[5][1] = 1525;
                                this.field1208[8][0] = 1736;
                                this.field1208[9][0] = 2088;
                                this.field1208[6][1] = 1734;
                                this.field1208[5][2] = 1429;
                                this.field1208[6][2] = 1461;
                                this.field1208[7][1] = 1413;
                                this.field1208[3][3] = 1140;
                                this.field1208[8][1] = 1108;
                                this.field1208[9][1] = 1766;
                                this.field1208[7][2] = 1525;
                                this.field1208[10][0] = 2355;
                                this.field1208[8][2] = 1590;
                                this.field1208[10][1] = 2409;
                                this.field1208[4][3] = 1509;
                                this.field1208[11][0] = 2691;
                                this.field1208[12][0] = 3031;
                                this.field1208[11][1] = 3116;
                                this.field1208[13][0] = 3522;
                                this.field1208[5][3] = 1413;
                                this.field1208[14][0] = 3727;
                                this.field1208[6][3] = 1333;
                                this.field1208[15][0] = 4096;
                                this.field1208[9][2] = 2056;
                                this.field1208[12][1] = 3806;
                                this.field1208[13][1] = 3437;
                                this.field1208[14][1] = 3116;
                                this.field1208[15][1] = 2377;
                                this.field1208[10][2] = 2586;
                                this.field1208[7][3] = 1702;
                                this.field1208[11][2] = 3148;
                                this.field1208[8][3] = 2056;
                                this.field1208[12][2] = 3710;
                                this.field1208[9][3] = 2666;
                                this.field1208[13][2] = 3421;
                                this.field1208[14][2] = 3148;
                                this.field1208[15][2] = 2505;
                                this.field1208[10][3] = 3276;
                                this.field1208[11][3] = 3228;
                                this.field1208[12][3] = 3196;
                                this.field1208[13][3] = 3019;
                                this.field1208[14][3] = 3228;
                                this.field1208[15][3] = 2746;
                            }
                        } else {
                            this.field1208 = new int[6][4];
                            this.field1208[0][2] = 0;
                            this.field1208[0][0] = 0;
                            this.field1208[1][2] = 0;
                            this.field1208[1][0] = 1843;
                            this.field1208[2][0] = 2457;
                            this.field1208[2][2] = 0;
                            this.field1208[0][1] = 0;
                            this.field1208[0][3] = 0;
                            this.field1208[1][3] = 1493;
                            this.field1208[2][3] = 2939;
                            this.field1208[3][3] = 3565;
                            this.field1208[4][3] = 4031;
                            this.field1208[5][3] = 4096;
                            this.field1208[1][1] = 0;
                            this.field1208[3][2] = 1124;
                            this.field1208[2][1] = 0;
                            this.field1208[3][0] = 2781;
                            this.field1208[4][0] = 3481;
                            this.field1208[4][2] = 3084;
                            this.field1208[5][0] = 4096;
                            this.field1208[3][1] = 0;
                            this.field1208[5][2] = 4096;
                            this.field1208[4][1] = 546;
                            this.field1208[5][1] = 4096;
                        }
                    } else {
                        this.field1208 = new int[7][4];
                        this.field1208[0][1] = 0;
                        this.field1208[0][2] = 0;
                        this.field1208[0][0] = 0;
                        this.field1208[0][3] = 4096;
                        this.field1208[1][0] = 663;
                        this.field1208[1][2] = 4096;
                        this.field1208[2][2] = 4096;
                        this.field1208[1][3] = 4096;
                        this.field1208[1][1] = 0;
                        this.field1208[3][2] = 4096;
                        this.field1208[2][0] = 1363;
                        this.field1208[2][1] = 0;
                        this.field1208[3][1] = 4096;
                        this.field1208[3][0] = 2048;
                        this.field1208[2][3] = 0;
                        this.field1208[4][0] = 2727;
                        this.field1208[3][3] = 0;
                        this.field1208[4][3] = 0;
                        this.field1208[5][0] = 3411;
                        this.field1208[4][2] = 0;
                        this.field1208[5][3] = 4096;
                        this.field1208[4][1] = 4096;
                        this.field1208[5][2] = 0;
                        this.field1208[6][3] = 4096;
                        this.field1208[5][1] = 4096;
                        this.field1208[6][0] = 4096;
                        this.field1208[6][1] = 0;
                        this.field1208[6][2] = 0;
                    }
                } else {
                    this.field1208 = new int[8][4];
                    this.field1208[0][2] = 2602;
                    this.field1208[0][0] = 0;
                    this.field1208[0][3] = 2361;
                    this.field1208[1][2] = 1799;
                    this.field1208[1][0] = 2867;
                    this.field1208[0][1] = 2650;
                    this.field1208[1][1] = 2313;
                    this.field1208[1][3] = 1558;
                    this.field1208[2][0] = 3072;
                    this.field1208[2][1] = 2618;
                    this.field1208[2][3] = 1413;
                    this.field1208[3][1] = 2296;
                    this.field1208[3][3] = 947;
                    this.field1208[4][1] = 2072;
                    this.field1208[2][2] = 1734;
                    this.field1208[4][3] = 722;
                    this.field1208[3][0] = 3276;
                    this.field1208[5][1] = 2730;
                    this.field1208[6][1] = 2232;
                    this.field1208[3][2] = 1220;
                    this.field1208[7][1] = 1686;
                    this.field1208[5][3] = 1766;
                    this.field1208[4][2] = 963;
                    this.field1208[5][2] = 2152;
                    this.field1208[4][0] = 3481;
                    this.field1208[5][0] = 3686;
                    this.field1208[6][2] = 1060;
                    this.field1208[6][3] = 915;
                    this.field1208[7][3] = 1140;
                    this.field1208[7][2] = 1413;
                    this.field1208[6][0] = 3891;
                    this.field1208[7][0] = 4096;
                }
            } else {
                this.field1208 = new int[2][4];
                this.field1208[0][1] = 0;
                this.field1208[1][1] = 4096;
                this.field1208[0][3] = 0;
                this.field1208[0][2] = 0;
                this.field1208[1][2] = 4096;
                this.field1208[0][0] = 0;
                this.field1208[1][3] = 4096;
                this.field1208[1][0] = 4096;
            }
        }
    }
}
