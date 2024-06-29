import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class227 extends class89 {

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "[I")
    private int[] field3985 = new int[257];

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[I")
    public static int[] field3975 = new int[5];

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "Lha;")
    public static class46 field3978 = class271.method1828("3D)2Softwarebibliothek gestartet)3", -46);

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!ek", name = "ib", descriptor = "Lha;")
    public static class46 field3989 = class271.method1828("name_icons", -46);

    @OriginalMember(owner = "client!ek", name = "jb", descriptor = "[I")
    public static int[] field3990 = new int[5];

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ek", name = "hb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "Ljh;")
    public static class238 field3974;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3983;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "[[I")
    private int[][] field3972;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "[[[S")
    public static short[][][] field3976;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method1551(int arg0) {
        field3989 = null;
        field3978 = null;
        field3976 = null;
        field3974 = null;
        field3990 = null;
        if (arg0 == 1) {
            field3983 = null;
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        if (this.field3972 == null) {
            this.method1554(1, arg0);
        }
        if (!arg0) {
            this.method8(true);
        }
        ++field3977;
        this.method1555((byte) -47);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field3979;
        if (arg1 != 25) {
            this.method1554(-113, true);
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[] var4 = this.method685(82, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class241.field4284 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field3985[var9];
                var5[var8] = class50.method369(var10 >> 12, 4080);
                var6[var8] = class50.method369(65280, var10) >> 4;
                var7[var8] = class50.method369(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static final void method1552(byte arg0) {
        int var1 = -16 / ((-30 - arg0) / 57);
        for (class65 var2 = (class65) class174.field3143.method264(-60); var2 != null; var2 = (class65) class174.field3143.method269((byte) 7)) {
            if (~var2.field1100 == 0) {
                var2.field1105 = 0;
                class161.method1176(-86, var2);
            } else {
                var2.method501(0);
            }
        }
        ++field3984;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZIIII)V")
    public static final void method1553(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3980;
        for (int var6 = arg5; ~(arg4 + arg5) <= ~var6; ++var6) {
            for (int var11 = arg3; arg3 - -arg0 >= var11; ++var11) {
                if (~var11 <= -1 && var11 < 104 && ~var6 <= -1 && ~var6 > -105) {
                    class10.field171[arg2][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg5; arg5 - -arg4 > var7; ++var7) {
            for (int var10 = arg3; ~var10 > ~(arg0 + arg3); ++var10) {
                if (var10 >= 0 && var10 < 104 && ~var7 <= -1 && var7 < 104) {
                    class119.field2228[arg2][var10][var7] = arg2 > 0 ? class119.field2228[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (~arg3 < -1 && ~arg3 > -105) {
            for (int var8 = arg5 - -1; ~var8 > ~(arg5 - -arg4); ++var8) {
                if (var8 >= 0 && var8 < 104) {
                    class119.field2228[arg2][arg3][var8] = class119.field2228[arg2][arg3 + -1][var8];
                }
            }
        }
        if (~arg5 < -1 && ~arg5 > -105) {
            for (int var9 = arg3 + 1; var9 < arg0 + arg3; ++var9) {
                if (var9 >= 0 && ~var9 > -105) {
                    class119.field2228[arg2][var9][arg5] = class119.field2228[arg2][var9][arg5 + -1];
                }
            }
        }
        if (~arg3 <= -1 && arg5 >= 0 && arg3 < 104 && ~arg5 > -105) {
            if (arg2 != 0) {
                if (~arg3 < -1 && class119.field2228[arg2][arg3 - 1][arg5] != class119.field2228[arg2 - 1][arg3 + -1][arg5]) {
                    class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3 + -1][arg5];
                } else if (~arg5 < -1 && ~class119.field2228[arg2][arg3][arg5 + -1] != ~class119.field2228[arg2 - 1][arg3][arg5 + -1]) {
                    class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3][arg5 - 1];
                } else if (~arg3 < -1 && ~arg5 < -1 && class119.field2228[arg2 - 1][arg3 - 1][arg5 + -1] != class119.field2228[arg2][arg3 - 1][arg5 + -1]) {
                    class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3 - 1][arg5 + -1];
                }
            } else if (arg3 > 0 && ~class119.field2228[arg2][arg3 - 1][arg5] != -1) {
                class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3 + -1][arg5];
            } else if (~arg5 < -1 && class119.field2228[arg2][arg3][arg5 - 1] != 0) {
                class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3][arg5 + -1];
            } else if (arg3 > 0 && arg5 > 0 && ~class119.field2228[arg2][arg3 + -1][arg5 + -1] != -1) {
                class119.field2228[arg2][arg3][arg5] = class119.field2228[arg2][arg3 + -1][arg5 + -1];
            }
        }
        if (arg1) {
            field3983 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field3986;
        if (arg1 == -641641492) {
            if (~arg2 == -1) {
                int var4 = arg0.method558(1);
                if (~var4 != -1) {
                    this.method1554(var4, true);
                } else {
                    this.field3972 = new int[arg0.method558(1)][4];
                    for (int var5 = 0; this.field3972.length > var5; ++var5) {
                        this.field3972[var5][0] = arg0.method545((byte) -91);
                        this.field3972[var5][1] = arg0.method558(1) << 4;
                        this.field3972[var5][2] = arg0.method558(class51.method376(arg1, -641641491)) << 4;
                        this.field3972[var5][3] = arg0.method558(class51.method376(arg1, -641641491)) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
    private final void method1554(int arg0, boolean arg1) {
        ++field3982;
        if (!arg1) {
            field3990 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field3972 = new int[4][4];
                                    this.field3972[0][1] = 0;
                                    this.field3972[0][2] = 4096;
                                    this.field3972[1][1] = 4096;
                                    this.field3972[0][0] = 2048;
                                    this.field3972[0][3] = 0;
                                    this.field3972[2][1] = 4096;
                                    this.field3972[3][1] = 4096;
                                    this.field3972[1][2] = 4096;
                                    this.field3972[2][2] = 4096;
                                    this.field3972[3][2] = 0;
                                    this.field3972[1][0] = 2867;
                                    this.field3972[2][0] = 3276;
                                    this.field3972[3][0] = 4096;
                                    this.field3972[1][3] = 0;
                                    this.field3972[2][3] = 0;
                                    this.field3972[3][3] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field3972 = new int[16][4];
                                this.field3972[0][3] = 321;
                                this.field3972[0][2] = 192;
                                this.field3972[0][0] = 0;
                                this.field3972[1][3] = 562;
                                this.field3972[0][1] = 80;
                                this.field3972[1][0] = 155;
                                this.field3972[2][0] = 389;
                                this.field3972[1][2] = 449;
                                this.field3972[1][1] = 321;
                                this.field3972[2][3] = 803;
                                this.field3972[3][0] = 671;
                                this.field3972[2][1] = 578;
                                this.field3972[3][1] = 947;
                                this.field3972[3][3] = 1140;
                                this.field3972[4][0] = 897;
                                this.field3972[4][1] = 1285;
                                this.field3972[4][3] = 1509;
                                this.field3972[5][1] = 1525;
                                this.field3972[6][1] = 1734;
                                this.field3972[7][1] = 1413;
                                this.field3972[5][3] = 1413;
                                this.field3972[2][2] = 690;
                                this.field3972[8][1] = 1108;
                                this.field3972[5][0] = 1175;
                                this.field3972[9][1] = 1766;
                                this.field3972[6][0] = 1368;
                                this.field3972[3][2] = 995;
                                this.field3972[4][2] = 1397;
                                this.field3972[6][3] = 1333;
                                this.field3972[10][1] = 2409;
                                this.field3972[5][2] = 1429;
                                this.field3972[11][1] = 3116;
                                this.field3972[6][2] = 1461;
                                this.field3972[7][2] = 1525;
                                this.field3972[7][3] = 1702;
                                this.field3972[7][0] = 1507;
                                this.field3972[12][1] = 3806;
                                this.field3972[13][1] = 3437;
                                this.field3972[8][0] = 1736;
                                this.field3972[9][0] = 2088;
                                this.field3972[8][3] = 2056;
                                this.field3972[14][1] = 3116;
                                this.field3972[9][3] = 2666;
                                this.field3972[15][1] = 2377;
                                this.field3972[10][3] = 3276;
                                this.field3972[8][2] = 1590;
                                this.field3972[10][0] = 2355;
                                this.field3972[11][0] = 2691;
                                this.field3972[11][3] = 3228;
                                this.field3972[12][0] = 3031;
                                this.field3972[13][0] = 3522;
                                this.field3972[14][0] = 3727;
                                this.field3972[12][3] = 3196;
                                this.field3972[13][3] = 3019;
                                this.field3972[15][0] = 4096;
                                this.field3972[9][2] = 2056;
                                this.field3972[14][3] = 3228;
                                this.field3972[10][2] = 2586;
                                this.field3972[11][2] = 3148;
                                this.field3972[12][2] = 3710;
                                this.field3972[13][2] = 3421;
                                this.field3972[14][2] = 3148;
                                this.field3972[15][2] = 2505;
                                this.field3972[15][3] = 2746;
                            }
                        } else {
                            this.field3972 = new int[6][4];
                            this.field3972[0][1] = 0;
                            this.field3972[0][0] = 0;
                            this.field3972[0][3] = 0;
                            this.field3972[1][0] = 1843;
                            this.field3972[1][1] = 0;
                            this.field3972[2][1] = 0;
                            this.field3972[3][1] = 0;
                            this.field3972[2][0] = 2457;
                            this.field3972[3][0] = 2781;
                            this.field3972[4][0] = 3481;
                            this.field3972[1][3] = 1493;
                            this.field3972[0][2] = 0;
                            this.field3972[5][0] = 4096;
                            this.field3972[2][3] = 2939;
                            this.field3972[3][3] = 3565;
                            this.field3972[4][1] = 546;
                            this.field3972[1][2] = 0;
                            this.field3972[5][1] = 4096;
                            this.field3972[4][3] = 4031;
                            this.field3972[2][2] = 0;
                            this.field3972[3][2] = 1124;
                            this.field3972[5][3] = 4096;
                            this.field3972[4][2] = 3084;
                            this.field3972[5][2] = 4096;
                        }
                    } else {
                        this.field3972 = new int[7][4];
                        this.field3972[0][2] = 0;
                        this.field3972[0][1] = 0;
                        this.field3972[1][1] = 0;
                        this.field3972[0][3] = 4096;
                        this.field3972[1][3] = 4096;
                        this.field3972[0][0] = 0;
                        this.field3972[2][1] = 0;
                        this.field3972[3][1] = 4096;
                        this.field3972[1][0] = 663;
                        this.field3972[2][3] = 0;
                        this.field3972[2][0] = 1363;
                        this.field3972[3][0] = 2048;
                        this.field3972[4][1] = 4096;
                        this.field3972[5][1] = 4096;
                        this.field3972[1][2] = 4096;
                        this.field3972[3][3] = 0;
                        this.field3972[4][3] = 0;
                        this.field3972[5][3] = 4096;
                        this.field3972[6][3] = 4096;
                        this.field3972[2][2] = 4096;
                        this.field3972[6][1] = 0;
                        this.field3972[3][2] = 4096;
                        this.field3972[4][2] = 0;
                        this.field3972[5][2] = 0;
                        this.field3972[4][0] = 2727;
                        this.field3972[5][0] = 3411;
                        this.field3972[6][0] = 4096;
                        this.field3972[6][2] = 0;
                    }
                } else {
                    this.field3972 = new int[8][4];
                    this.field3972[0][3] = 2361;
                    this.field3972[0][0] = 0;
                    this.field3972[0][2] = 2602;
                    this.field3972[1][3] = 1558;
                    this.field3972[1][2] = 1799;
                    this.field3972[0][1] = 2650;
                    this.field3972[2][3] = 1413;
                    this.field3972[3][3] = 947;
                    this.field3972[1][1] = 2313;
                    this.field3972[1][0] = 2867;
                    this.field3972[2][0] = 3072;
                    this.field3972[2][2] = 1734;
                    this.field3972[2][1] = 2618;
                    this.field3972[3][1] = 2296;
                    this.field3972[3][0] = 3276;
                    this.field3972[4][0] = 3481;
                    this.field3972[4][1] = 2072;
                    this.field3972[5][0] = 3686;
                    this.field3972[6][0] = 3891;
                    this.field3972[5][1] = 2730;
                    this.field3972[6][1] = 2232;
                    this.field3972[7][0] = 4096;
                    this.field3972[4][3] = 722;
                    this.field3972[7][1] = 1686;
                    this.field3972[5][3] = 1766;
                    this.field3972[3][2] = 1220;
                    this.field3972[6][3] = 915;
                    this.field3972[7][3] = 1140;
                    this.field3972[4][2] = 963;
                    this.field3972[5][2] = 2152;
                    this.field3972[6][2] = 1060;
                    this.field3972[7][2] = 1413;
                }
            } else {
                this.field3972 = new int[2][4];
                this.field3972[0][3] = 0;
                this.field3972[0][1] = 0;
                this.field3972[0][0] = 0;
                this.field3972[1][1] = 4096;
                this.field3972[1][3] = 4096;
                this.field3972[1][0] = 4096;
                this.field3972[0][2] = 0;
                this.field3972[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(B)V")
    private final void method1555(byte arg0) {
        ++field3981;
        if (arg0 != -47) {
            field3974 = null;
        }
        int var2 = this.field3972.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var6 > ~var2 && ~this.field3972[var6][0] >= ~var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field3972[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field3972[var4];
                    if (var4 <= 0) {
                        var8 = var11[1];
                        var10 = var11[2];
                        var9 = var11[3];
                    } else {
                        int[] var12 = this.field3972[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    }
                }
                int var15 = var10 >> 4;
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var16 = var8 >> 4;
                int var17 = var9 >> 4;
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field3985[var3] = class235.method1595(var17, class235.method1595(var15 << 8, var16 << 16));
            }
        }
    }
}
