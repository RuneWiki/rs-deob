import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class591 extends class4 {

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
    private int[] field8544 = new int[257];

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[[B")
    public static byte[][] field8536 = new byte[50][];

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field8533 = 1;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[I")
    public static int[] field8539 = new int[3];

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "Z")
    public static boolean field8543 = false;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[[I")
    private int[][] field8535;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class591() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "(I)V")
    public static final void method3410(int arg0) {
        if (arg0 > -21) {
            field8533 = 53;
        }
        ++field8532;
        for (int var1 = 0; var1 < 5; ++var1) {
            class126.field1570[var1] = false;
        }
        class356.field4984 = class186.field2364;
        class126.field1567 = class196.field2555;
        class189.field2447 = class7.field61;
        class621.field8952 = 5;
        class520.field7247 = 0;
        class427.field5826 = -1;
        class358.field5002 = class627.field9131;
        class89.field1182 = class60.field838;
        field8542 = class434.field5901;
        class30.field482 = -1;
        class345.field4781 = 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field8534;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 > -83) {
            field8539 = null;
        }
        if (super.field38.field7618) {
            int[] var4 = this.method20(0, -21986, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class132.field1627 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field8544[var9];
                var5[var8] = class143.method783(var10, 16711680) >> 12;
                var6[var8] = class143.method783(var10 >> 4, 4080);
                var7[var8] = class143.method783(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)V")
    private final void method3411(int arg0, byte arg1) {
        ++field8537;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field8535 = new int[4][4];
                                this.field8535[0][0] = 2048;
                                this.field8535[0][2] = 4096;
                                this.field8535[0][3] = 0;
                                this.field8535[0][1] = 0;
                                this.field8535[1][3] = 0;
                                this.field8535[1][1] = 4096;
                                this.field8535[1][2] = 4096;
                                this.field8535[1][0] = 2867;
                                this.field8535[2][1] = 4096;
                                this.field8535[2][3] = 0;
                                this.field8535[2][2] = 4096;
                                this.field8535[2][0] = 3276;
                                this.field8535[3][3] = 0;
                                this.field8535[3][1] = 4096;
                                this.field8535[3][0] = 4096;
                                this.field8535[3][2] = 0;
                            } else {
                                this.field8535 = new int[16][4];
                                this.field8535[0][0] = 0;
                                this.field8535[0][3] = 321;
                                this.field8535[0][2] = 192;
                                this.field8535[0][1] = 80;
                                this.field8535[1][0] = 155;
                                this.field8535[1][2] = 449;
                                this.field8535[1][1] = 321;
                                this.field8535[1][3] = 562;
                                this.field8535[2][1] = 578;
                                this.field8535[2][0] = 389;
                                this.field8535[2][2] = 690;
                                this.field8535[2][3] = 803;
                                this.field8535[3][3] = 1140;
                                this.field8535[3][2] = 995;
                                this.field8535[3][1] = 947;
                                this.field8535[3][0] = 671;
                                this.field8535[4][3] = 1509;
                                this.field8535[4][2] = 1397;
                                this.field8535[4][0] = 897;
                                this.field8535[4][1] = 1285;
                                this.field8535[5][3] = 1413;
                                this.field8535[5][0] = 1175;
                                this.field8535[5][1] = 1525;
                                this.field8535[5][2] = 1429;
                                this.field8535[6][3] = 1333;
                                this.field8535[6][1] = 1734;
                                this.field8535[6][2] = 1461;
                                this.field8535[6][0] = 1368;
                                this.field8535[7][2] = 1525;
                                this.field8535[7][3] = 1702;
                                this.field8535[7][0] = 1507;
                                this.field8535[7][1] = 1413;
                                this.field8535[8][3] = 2056;
                                this.field8535[8][0] = 1736;
                                this.field8535[8][2] = 1590;
                                this.field8535[8][1] = 1108;
                                this.field8535[9][3] = 2666;
                                this.field8535[9][1] = 1766;
                                this.field8535[9][0] = 2088;
                                this.field8535[9][2] = 2056;
                                this.field8535[10][1] = 2409;
                                this.field8535[10][0] = 2355;
                                this.field8535[10][2] = 2586;
                                this.field8535[10][3] = 3276;
                                this.field8535[11][3] = 3228;
                                this.field8535[11][1] = 3116;
                                this.field8535[11][2] = 3148;
                                this.field8535[11][0] = 2691;
                                this.field8535[12][1] = 3806;
                                this.field8535[12][2] = 3710;
                                this.field8535[12][3] = 3196;
                                this.field8535[12][0] = 3031;
                                this.field8535[13][0] = 3522;
                                this.field8535[13][1] = 3437;
                                this.field8535[13][3] = 3019;
                                this.field8535[13][2] = 3421;
                                this.field8535[14][3] = 3228;
                                this.field8535[14][2] = 3148;
                                this.field8535[14][1] = 3116;
                                this.field8535[14][0] = 3727;
                                this.field8535[15][1] = 2377;
                                this.field8535[15][2] = 2505;
                                this.field8535[15][0] = 4096;
                                this.field8535[15][3] = 2746;
                            }
                        } else {
                            this.field8535 = new int[6][4];
                            this.field8535[0][1] = 0;
                            this.field8535[0][0] = 0;
                            this.field8535[0][3] = 0;
                            this.field8535[0][2] = 0;
                            this.field8535[1][1] = 0;
                            this.field8535[1][0] = 1843;
                            this.field8535[1][3] = 1493;
                            this.field8535[1][2] = 0;
                            this.field8535[2][1] = 0;
                            this.field8535[2][0] = 2457;
                            this.field8535[2][2] = 0;
                            this.field8535[2][3] = 2939;
                            this.field8535[3][1] = 0;
                            this.field8535[3][0] = 2781;
                            this.field8535[3][2] = 1124;
                            this.field8535[3][3] = 3565;
                            this.field8535[4][1] = 546;
                            this.field8535[4][0] = 3481;
                            this.field8535[4][3] = 4031;
                            this.field8535[4][2] = 3084;
                            this.field8535[5][2] = 4096;
                            this.field8535[5][3] = 4096;
                            this.field8535[5][0] = 4096;
                            this.field8535[5][1] = 4096;
                        }
                    } else {
                        this.field8535 = new int[7][4];
                        this.field8535[0][3] = 4096;
                        this.field8535[0][0] = 0;
                        this.field8535[0][2] = 0;
                        this.field8535[0][1] = 0;
                        this.field8535[1][1] = 0;
                        this.field8535[1][2] = 4096;
                        this.field8535[1][0] = 663;
                        this.field8535[1][3] = 4096;
                        this.field8535[2][0] = 1363;
                        this.field8535[2][1] = 0;
                        this.field8535[2][2] = 4096;
                        this.field8535[2][3] = 0;
                        this.field8535[3][2] = 4096;
                        this.field8535[3][1] = 4096;
                        this.field8535[3][3] = 0;
                        this.field8535[3][0] = 2048;
                        this.field8535[4][2] = 0;
                        this.field8535[4][3] = 0;
                        this.field8535[4][1] = 4096;
                        this.field8535[4][0] = 2727;
                        this.field8535[5][3] = 4096;
                        this.field8535[5][1] = 4096;
                        this.field8535[5][0] = 3411;
                        this.field8535[5][2] = 0;
                        this.field8535[6][1] = 0;
                        this.field8535[6][0] = 4096;
                        this.field8535[6][3] = 4096;
                        this.field8535[6][2] = 0;
                    }
                } else {
                    this.field8535 = new int[8][4];
                    this.field8535[0][2] = 2602;
                    this.field8535[0][1] = 2650;
                    this.field8535[0][0] = 0;
                    this.field8535[0][3] = 2361;
                    this.field8535[1][2] = 1799;
                    this.field8535[1][3] = 1558;
                    this.field8535[1][1] = 2313;
                    this.field8535[1][0] = 2867;
                    this.field8535[2][1] = 2618;
                    this.field8535[2][3] = 1413;
                    this.field8535[2][0] = 3072;
                    this.field8535[2][2] = 1734;
                    this.field8535[3][0] = 3276;
                    this.field8535[3][2] = 1220;
                    this.field8535[3][1] = 2296;
                    this.field8535[3][3] = 947;
                    this.field8535[4][0] = 3481;
                    this.field8535[4][1] = 2072;
                    this.field8535[4][3] = 722;
                    this.field8535[4][2] = 963;
                    this.field8535[5][1] = 2730;
                    this.field8535[5][3] = 1766;
                    this.field8535[5][2] = 2152;
                    this.field8535[5][0] = 3686;
                    this.field8535[6][1] = 2232;
                    this.field8535[6][2] = 1060;
                    this.field8535[6][3] = 915;
                    this.field8535[6][0] = 3891;
                    this.field8535[7][2] = 1413;
                    this.field8535[7][3] = 1140;
                    this.field8535[7][1] = 1686;
                    this.field8535[7][0] = 4096;
                }
            } else {
                this.field8535 = new int[2][4];
                this.field8535[0][3] = 0;
                this.field8535[0][1] = 0;
                this.field8535[0][2] = 0;
                this.field8535[0][0] = 0;
                this.field8535[1][1] = 4096;
                this.field8535[1][3] = 4096;
                this.field8535[1][2] = 4096;
                this.field8535[1][0] = 4096;
            }
        }
        if (arg1 > -103) {
            field8543 = false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 <= -89) {
            if (~arg2 == -1) {
                int var4 = arg1.method3045(-125);
                if (var4 != 0) {
                    this.method3411(var4, (byte) -113);
                } else {
                    this.field8535 = new int[arg1.method3045(-126)][4];
                    for (int var5 = 0; ~this.field8535.length < ~var5; ++var5) {
                        this.field8535[var5][0] = arg1.method3090(-83);
                        this.field8535[var5][1] = arg1.method3045(-128) << 4;
                        this.field8535[var5][2] = arg1.method3045(-125) << 4;
                        this.field8535[var5][3] = arg1.method3045(-127) << 4;
                    }
                }
            }
            ++field8538;
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (this.field8535 == null) {
            this.method3411(1, (byte) -120);
        }
        if (arg0 != -9) {
            this.field8544 = null;
        }
        ++field8540;
        this.method3412((byte) -67);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    private final void method3412(byte arg0) {
        ++field8541;
        if (arg0 > -59) {
            method3410(-54);
        }
        int var2 = this.field8535.length;
        if (var2 > 0) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field8535[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field8535[var2 + -1];
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field8535[var4];
                    if (var4 <= 0) {
                        var8 = var11[3];
                        var9 = var11[1];
                        var10 = var11[2];
                    } else {
                        int[] var12 = this.field8535[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var15 <= -1) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field8544[var3] = class292.method1790(class292.method1790(var17 << 8, var16 << 16), var15);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method3413(boolean arg0) {
        field8536 = null;
        if (!arg0) {
            field8533 = -70;
        }
        field8539 = null;
    }
}
