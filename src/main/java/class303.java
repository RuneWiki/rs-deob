import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class303 extends class263 {

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
    private int[] field4515 = new int[257];

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Laa;")
    public static class76 field4511 = new class76(40, 3);

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "[I")
    public static int[] field4520 = new int[5];

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "Lqs;")
    public static class50 field4521;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Lok;")
    public static class74 field4519;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tk", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field4522;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "[[I")
    private int[][] field4509;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4520 = null;
        field4519 = null;
        field4521 = null;
        field4511 = null;
        if (arg0 != -6205) {
            method1886((class74) null, (byte) -83, (class74) null);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        if (arg0 != 110) {
            this.method32(-49, true, (class468) null);
        }
        if (this.field4509 == null) {
            this.method1888(-30549, 1);
        }
        ++field4517;
        this.method1890(arg0 ^ -38);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field4512;
        if (arg1 > -45) {
            field4521 = null;
        }
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[] var4 = this.method1644(0, 0, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class367.field5597 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4515[var9];
                var5[var8] = class140.method1023(var10, 16711680) >> 12;
                var6[var8] = class140.method1023(65280, var10) >> 4;
                var7[var8] = class140.method1023(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class303() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lok;BLok;)I")
    public static final int method1886(class74 arg0, byte arg1, class74 arg2) {
        ++field4513;
        int var3 = 0;
        if (arg1 != -19) {
            field4511 = null;
        }
        if (arg0.method551(-83, class172.field2523)) {
            ++var3;
        }
        if (arg0.method551(arg1 + -22, class89.field1391)) {
            ++var3;
        }
        if (arg0.method551(-40, class261.field3902)) {
            ++var3;
        }
        if (arg2.method551(104, class172.field2523)) {
            ++var3;
        }
        if (arg2.method551(arg1 ^ -102, class89.field1391)) {
            ++var3;
        }
        if (arg2.method551(103, class261.field3902)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLrc;)V")
    public static final void method1887(byte arg0, class22 arg1) {
        ++field4510;
        if (class236.field3305 != null) {
            class401 var2 = null;
            if (~arg1.field317 == -1) {
                var2 = (class401) class222.method1406(arg1.field327, arg1.field326, arg1.field321);
            }
            if (arg0 < 29) {
                field4519 = null;
            }
            if (arg1.field317 == 1) {
                var2 = (class401) class118.method886(arg1.field327, arg1.field326, arg1.field321);
            }
            if (~arg1.field317 == -3) {
                var2 = (class401) class534.method3160(arg1.field327, arg1.field326, arg1.field321, field4522 != null ? field4522 : (field4522 = method1891("gf")));
            }
            if (arg1.field317 == 3) {
                var2 = (class401) class341.method2081(arg1.field327, arg1.field326, arg1.field321);
            }
            if (var2 != null) {
                arg1.field330 = var2.method240(-15578);
                arg1.field328 = var2.method222((byte) -113);
                arg1.field324 = var2.method223(-19634);
            } else {
                arg1.field328 = 0;
                arg1.field324 = 0;
                arg1.field330 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field4514;
        if (arg1) {
            if (~arg0 == -1) {
                int var4 = arg2.method2765(102);
                if (~var4 != -1) {
                    this.method1888(-30549, var4);
                } else {
                    this.field4509 = new int[arg2.method2765(61)][4];
                    for (int var5 = 0; this.field4509.length > var5; ++var5) {
                        this.field4509[var5][0] = arg2.method2727((byte) 43);
                        this.field4509[var5][1] = arg2.method2765(76) << 4;
                        this.field4509[var5][2] = arg2.method2765(57) << 4;
                        this.field4509[var5][3] = arg2.method2765(79) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
    private final void method1888(int arg0, int arg1) {
        ++field4518;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4509 = new int[4][4];
                                this.field4509[0][1] = 0;
                                this.field4509[0][3] = 0;
                                this.field4509[0][2] = 4096;
                                this.field4509[0][0] = 2048;
                                this.field4509[1][1] = 4096;
                                this.field4509[1][2] = 4096;
                                this.field4509[1][0] = 2867;
                                this.field4509[1][3] = 0;
                                this.field4509[2][1] = 4096;
                                this.field4509[2][2] = 4096;
                                this.field4509[2][3] = 0;
                                this.field4509[2][0] = 3276;
                                this.field4509[3][0] = 4096;
                                this.field4509[3][3] = 0;
                                this.field4509[3][1] = 4096;
                                this.field4509[3][2] = 0;
                            } else {
                                this.field4509 = new int[16][4];
                                this.field4509[0][2] = 192;
                                this.field4509[0][3] = 321;
                                this.field4509[0][1] = 80;
                                this.field4509[0][0] = 0;
                                this.field4509[1][1] = 321;
                                this.field4509[1][3] = 562;
                                this.field4509[1][0] = 155;
                                this.field4509[1][2] = 449;
                                this.field4509[2][2] = 690;
                                this.field4509[2][1] = 578;
                                this.field4509[2][3] = 803;
                                this.field4509[2][0] = 389;
                                this.field4509[3][1] = 947;
                                this.field4509[3][0] = 671;
                                this.field4509[3][3] = 1140;
                                this.field4509[3][2] = 995;
                                this.field4509[4][3] = 1509;
                                this.field4509[4][2] = 1397;
                                this.field4509[4][0] = 897;
                                this.field4509[4][1] = 1285;
                                this.field4509[5][2] = 1429;
                                this.field4509[5][0] = 1175;
                                this.field4509[5][1] = 1525;
                                this.field4509[5][3] = 1413;
                                this.field4509[6][2] = 1461;
                                this.field4509[6][0] = 1368;
                                this.field4509[6][3] = 1333;
                                this.field4509[6][1] = 1734;
                                this.field4509[7][2] = 1525;
                                this.field4509[7][3] = 1702;
                                this.field4509[7][0] = 1507;
                                this.field4509[7][1] = 1413;
                                this.field4509[8][0] = 1736;
                                this.field4509[8][1] = 1108;
                                this.field4509[8][3] = 2056;
                                this.field4509[8][2] = 1590;
                                this.field4509[9][3] = 2666;
                                this.field4509[9][1] = 1766;
                                this.field4509[9][2] = 2056;
                                this.field4509[9][0] = 2088;
                                this.field4509[10][2] = 2586;
                                this.field4509[10][0] = 2355;
                                this.field4509[10][3] = 3276;
                                this.field4509[10][1] = 2409;
                                this.field4509[11][3] = 3228;
                                this.field4509[11][1] = 3116;
                                this.field4509[11][2] = 3148;
                                this.field4509[11][0] = 2691;
                                this.field4509[12][1] = 3806;
                                this.field4509[12][2] = 3710;
                                this.field4509[12][3] = 3196;
                                this.field4509[12][0] = 3031;
                                this.field4509[13][2] = 3421;
                                this.field4509[13][0] = 3522;
                                this.field4509[13][3] = 3019;
                                this.field4509[13][1] = 3437;
                                this.field4509[14][2] = 3148;
                                this.field4509[14][3] = 3228;
                                this.field4509[14][0] = 3727;
                                this.field4509[14][1] = 3116;
                                this.field4509[15][3] = 2746;
                                this.field4509[15][2] = 2505;
                                this.field4509[15][1] = 2377;
                                this.field4509[15][0] = 4096;
                            }
                        } else {
                            this.field4509 = new int[6][4];
                            this.field4509[0][2] = 0;
                            this.field4509[0][0] = 0;
                            this.field4509[0][1] = 0;
                            this.field4509[0][3] = 0;
                            this.field4509[1][2] = 0;
                            this.field4509[1][1] = 0;
                            this.field4509[1][3] = 1493;
                            this.field4509[1][0] = 1843;
                            this.field4509[2][1] = 0;
                            this.field4509[2][3] = 2939;
                            this.field4509[2][2] = 0;
                            this.field4509[2][0] = 2457;
                            this.field4509[3][1] = 0;
                            this.field4509[3][3] = 3565;
                            this.field4509[3][0] = 2781;
                            this.field4509[3][2] = 1124;
                            this.field4509[4][2] = 3084;
                            this.field4509[4][1] = 546;
                            this.field4509[4][0] = 3481;
                            this.field4509[4][3] = 4031;
                            this.field4509[5][1] = 4096;
                            this.field4509[5][0] = 4096;
                            this.field4509[5][3] = 4096;
                            this.field4509[5][2] = 4096;
                        }
                    } else {
                        this.field4509 = new int[7][4];
                        this.field4509[0][1] = 0;
                        this.field4509[0][3] = 4096;
                        this.field4509[0][0] = 0;
                        this.field4509[0][2] = 0;
                        this.field4509[1][2] = 4096;
                        this.field4509[1][0] = 663;
                        this.field4509[1][1] = 0;
                        this.field4509[1][3] = 4096;
                        this.field4509[2][1] = 0;
                        this.field4509[2][2] = 4096;
                        this.field4509[2][3] = 0;
                        this.field4509[2][0] = 1363;
                        this.field4509[3][1] = 4096;
                        this.field4509[3][2] = 4096;
                        this.field4509[3][0] = 2048;
                        this.field4509[3][3] = 0;
                        this.field4509[4][1] = 4096;
                        this.field4509[4][3] = 0;
                        this.field4509[4][2] = 0;
                        this.field4509[4][0] = 2727;
                        this.field4509[5][0] = 3411;
                        this.field4509[5][2] = 0;
                        this.field4509[5][1] = 4096;
                        this.field4509[5][3] = 4096;
                        this.field4509[6][2] = 0;
                        this.field4509[6][1] = 0;
                        this.field4509[6][3] = 4096;
                        this.field4509[6][0] = 4096;
                    }
                } else {
                    this.field4509 = new int[8][4];
                    this.field4509[0][1] = 2650;
                    this.field4509[0][3] = 2361;
                    this.field4509[0][2] = 2602;
                    this.field4509[0][0] = 0;
                    this.field4509[1][0] = 2867;
                    this.field4509[1][3] = 1558;
                    this.field4509[1][2] = 1799;
                    this.field4509[1][1] = 2313;
                    this.field4509[2][3] = 1413;
                    this.field4509[2][1] = 2618;
                    this.field4509[2][0] = 3072;
                    this.field4509[2][2] = 1734;
                    this.field4509[3][2] = 1220;
                    this.field4509[3][3] = 947;
                    this.field4509[3][1] = 2296;
                    this.field4509[3][0] = 3276;
                    this.field4509[4][1] = 2072;
                    this.field4509[4][3] = 722;
                    this.field4509[4][2] = 963;
                    this.field4509[4][0] = 3481;
                    this.field4509[5][0] = 3686;
                    this.field4509[5][2] = 2152;
                    this.field4509[5][1] = 2730;
                    this.field4509[5][3] = 1766;
                    this.field4509[6][1] = 2232;
                    this.field4509[6][2] = 1060;
                    this.field4509[6][3] = 915;
                    this.field4509[6][0] = 3891;
                    this.field4509[7][0] = 4096;
                    this.field4509[7][3] = 1140;
                    this.field4509[7][2] = 1413;
                    this.field4509[7][1] = 1686;
                }
            } else {
                this.field4509 = new int[2][4];
                this.field4509[0][0] = 0;
                this.field4509[0][2] = 0;
                this.field4509[0][1] = 0;
                this.field4509[0][3] = 0;
                this.field4509[1][0] = 4096;
                this.field4509[1][3] = 4096;
                this.field4509[1][2] = 4096;
                this.field4509[1][1] = 4096;
            }
        }
        if (arg0 != -30549) {
            this.field4515 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZB)V")
    public static final void method1889(boolean arg0, boolean arg1, byte arg2) {
        if (arg1) {
            --class181.field2684;
            if (class181.field2684 == 0) {
                class461.field6721 = null;
            }
        }
        if (arg2 <= 11) {
            field4521 = null;
        }
        if (arg0) {
            --class5.field44;
            if (~class5.field44 == -1) {
                class85.field1347 = null;
            }
        }
        ++field4516;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    private final void method1890(int arg0) {
        ++field4508;
        if (arg0 >= -40) {
            this.method1888(12, 101);
        }
        int var2 = this.field4509.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && this.field4509[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var2 > var4) {
                    int[] var7 = this.field4509[var4];
                    if (var4 <= 0) {
                        var8 = var7[2];
                        var9 = var7[1];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field4509[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field4509[var2 + -1];
                    var8 = var14[2];
                    var10 = var14[3];
                    var9 = var14[1];
                }
                int var15 = var10 >> 4;
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (~var15 > -1) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                this.field4515[var3] = class390.method2340(class390.method2340(var17 << 16, var16 << 8), var15);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1891(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
