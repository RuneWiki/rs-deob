import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class290 extends class84 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
    private int[] field4592 = new int[257];

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Z")
    public static boolean field4594 = false;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field4596 = new String[200];

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static volatile int field4601 = -1;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4602 = "purple:";

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field4604 = 1;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "[[I")
    private int[][] field4591;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "[[Z")
    public static boolean[][] field4603;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field4600;
        if (arg1 < 87) {
            this.method1965(127);
        }
        if (~arg2 == -1) {
            int var4 = arg0.method1111(255);
            if (var4 != 0) {
                this.method1968(var4, -116);
            } else {
                this.field4591 = new int[arg0.method1111(255)][4];
                for (int var5 = 0; ~this.field4591.length < ~var5; ++var5) {
                    this.field4591[var5][0] = arg0.method1126(false);
                    this.field4591[var5][1] = arg0.method1111(255) << 4;
                    this.field4591[var5][2] = arg0.method1111(255) << 4;
                    this.field4591[var5][3] = arg0.method1111(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    private final void method1965(int arg0) {
        ++field4593;
        if (arg0 != -256) {
            method1966(88);
        }
        int var2 = this.field4591.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && this.field4591[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field4591[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field4591[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field4591[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                    } else {
                        var10 = var11[3];
                        var8 = var11[1];
                        var9 = var11[2];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                if (~var15 > -1) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                int var17 = var9 >> 4;
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field4592[var3] = class244.method1747(class244.method1747(var17 << 8, var15 << 16), var16);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "(I)V")
    public static void method1966(int arg0) {
        if (arg0 > -106) {
            method1969(70, 62, -45, -35, -109, -70);
        }
        field4596 = null;
        field4602 = null;
        field4603 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Llc;ZI)[Lvd;")
    public static final class4[] method1967(class86 arg0, boolean arg1, int arg2) {
        ++field4590;
        if (!class149.method1060(arg2, -110, arg0)) {
            return null;
        } else {
            if (arg1) {
                field4601 = 74;
            }
            return class64.method466((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            int[][] var3 = super.field1211.method193((byte) 33, arg0);
            if (super.field1211.field321) {
                int[] var4 = this.method612(0, arg0, false);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; ~var8 > ~class20.field221; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field4592[var9];
                    var5[var8] = class179.method1337(4080, var10 >> 12);
                    var6[var8] = class179.method1337(65280, var10) >> 4;
                    var7[var8] = class179.method1337(var10 << 4, 4080);
                }
            }
            ++field4589;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    private final void method1968(int arg0, int arg1) {
        ++field4597;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4591 = new int[4][4];
                                this.field4591[0][0] = 2048;
                                this.field4591[0][1] = 0;
                                this.field4591[0][3] = 0;
                                this.field4591[0][2] = 4096;
                                this.field4591[1][2] = 4096;
                                this.field4591[2][2] = 4096;
                                this.field4591[1][3] = 0;
                                this.field4591[2][3] = 0;
                                this.field4591[1][1] = 4096;
                                this.field4591[3][3] = 0;
                                this.field4591[1][0] = 2867;
                                this.field4591[2][1] = 4096;
                                this.field4591[3][2] = 0;
                                this.field4591[2][0] = 3276;
                                this.field4591[3][1] = 4096;
                                this.field4591[3][0] = 4096;
                            } else {
                                this.field4591 = new int[16][4];
                                this.field4591[0][3] = 321;
                                this.field4591[0][2] = 192;
                                this.field4591[1][2] = 449;
                                this.field4591[1][3] = 562;
                                this.field4591[0][0] = 0;
                                this.field4591[1][0] = 155;
                                this.field4591[0][1] = 80;
                                this.field4591[2][0] = 389;
                                this.field4591[2][3] = 803;
                                this.field4591[3][3] = 1140;
                                this.field4591[2][2] = 690;
                                this.field4591[4][3] = 1509;
                                this.field4591[3][0] = 671;
                                this.field4591[4][0] = 897;
                                this.field4591[5][0] = 1175;
                                this.field4591[1][1] = 321;
                                this.field4591[2][1] = 578;
                                this.field4591[5][3] = 1413;
                                this.field4591[6][3] = 1333;
                                this.field4591[3][2] = 995;
                                this.field4591[4][2] = 1397;
                                this.field4591[3][1] = 947;
                                this.field4591[5][2] = 1429;
                                this.field4591[6][0] = 1368;
                                this.field4591[6][2] = 1461;
                                this.field4591[4][1] = 1285;
                                this.field4591[7][3] = 1702;
                                this.field4591[7][2] = 1525;
                                this.field4591[7][0] = 1507;
                                this.field4591[8][2] = 1590;
                                this.field4591[8][0] = 1736;
                                this.field4591[9][2] = 2056;
                                this.field4591[8][3] = 2056;
                                this.field4591[10][2] = 2586;
                                this.field4591[9][0] = 2088;
                                this.field4591[11][2] = 3148;
                                this.field4591[12][2] = 3710;
                                this.field4591[10][0] = 2355;
                                this.field4591[9][3] = 2666;
                                this.field4591[11][0] = 2691;
                                this.field4591[10][3] = 3276;
                                this.field4591[5][1] = 1525;
                                this.field4591[13][2] = 3421;
                                this.field4591[6][1] = 1734;
                                this.field4591[11][3] = 3228;
                                this.field4591[12][3] = 3196;
                                this.field4591[12][0] = 3031;
                                this.field4591[13][3] = 3019;
                                this.field4591[14][3] = 3228;
                                this.field4591[14][2] = 3148;
                                this.field4591[15][3] = 2746;
                                this.field4591[13][0] = 3522;
                                this.field4591[15][2] = 2505;
                                this.field4591[7][1] = 1413;
                                this.field4591[14][0] = 3727;
                                this.field4591[8][1] = 1108;
                                this.field4591[9][1] = 1766;
                                this.field4591[15][0] = 4096;
                                this.field4591[10][1] = 2409;
                                this.field4591[11][1] = 3116;
                                this.field4591[12][1] = 3806;
                                this.field4591[13][1] = 3437;
                                this.field4591[14][1] = 3116;
                                this.field4591[15][1] = 2377;
                            }
                        } else {
                            this.field4591 = new int[6][4];
                            this.field4591[0][1] = 0;
                            this.field4591[0][0] = 0;
                            this.field4591[1][1] = 0;
                            this.field4591[0][2] = 0;
                            this.field4591[2][1] = 0;
                            this.field4591[3][1] = 0;
                            this.field4591[1][2] = 0;
                            this.field4591[1][0] = 1843;
                            this.field4591[2][2] = 0;
                            this.field4591[3][2] = 1124;
                            this.field4591[4][2] = 3084;
                            this.field4591[0][3] = 0;
                            this.field4591[4][1] = 546;
                            this.field4591[2][0] = 2457;
                            this.field4591[3][0] = 2781;
                            this.field4591[1][3] = 1493;
                            this.field4591[2][3] = 2939;
                            this.field4591[4][0] = 3481;
                            this.field4591[5][2] = 4096;
                            this.field4591[5][0] = 4096;
                            this.field4591[3][3] = 3565;
                            this.field4591[5][1] = 4096;
                            this.field4591[4][3] = 4031;
                            this.field4591[5][3] = 4096;
                        }
                    } else {
                        this.field4591 = new int[7][4];
                        this.field4591[0][2] = 0;
                        this.field4591[0][0] = 0;
                        this.field4591[0][1] = 0;
                        this.field4591[1][2] = 4096;
                        this.field4591[1][0] = 663;
                        this.field4591[2][2] = 4096;
                        this.field4591[1][1] = 0;
                        this.field4591[2][0] = 1363;
                        this.field4591[3][2] = 4096;
                        this.field4591[0][3] = 4096;
                        this.field4591[2][1] = 0;
                        this.field4591[4][2] = 0;
                        this.field4591[1][3] = 4096;
                        this.field4591[5][2] = 0;
                        this.field4591[2][3] = 0;
                        this.field4591[6][2] = 0;
                        this.field4591[3][1] = 4096;
                        this.field4591[3][0] = 2048;
                        this.field4591[3][3] = 0;
                        this.field4591[4][3] = 0;
                        this.field4591[4][1] = 4096;
                        this.field4591[5][1] = 4096;
                        this.field4591[4][0] = 2727;
                        this.field4591[6][1] = 0;
                        this.field4591[5][3] = 4096;
                        this.field4591[5][0] = 3411;
                        this.field4591[6][0] = 4096;
                        this.field4591[6][3] = 4096;
                    }
                } else {
                    this.field4591 = new int[8][4];
                    this.field4591[0][0] = 0;
                    this.field4591[0][2] = 2602;
                    this.field4591[0][1] = 2650;
                    this.field4591[1][2] = 1799;
                    this.field4591[0][3] = 2361;
                    this.field4591[1][0] = 2867;
                    this.field4591[1][1] = 2313;
                    this.field4591[2][2] = 1734;
                    this.field4591[2][0] = 3072;
                    this.field4591[2][1] = 2618;
                    this.field4591[3][2] = 1220;
                    this.field4591[3][1] = 2296;
                    this.field4591[4][2] = 963;
                    this.field4591[4][1] = 2072;
                    this.field4591[3][0] = 3276;
                    this.field4591[4][0] = 3481;
                    this.field4591[5][2] = 2152;
                    this.field4591[5][1] = 2730;
                    this.field4591[6][1] = 2232;
                    this.field4591[7][1] = 1686;
                    this.field4591[6][2] = 1060;
                    this.field4591[1][3] = 1558;
                    this.field4591[2][3] = 1413;
                    this.field4591[3][3] = 947;
                    this.field4591[4][3] = 722;
                    this.field4591[5][0] = 3686;
                    this.field4591[6][0] = 3891;
                    this.field4591[7][2] = 1413;
                    this.field4591[7][0] = 4096;
                    this.field4591[5][3] = 1766;
                    this.field4591[6][3] = 915;
                    this.field4591[7][3] = 1140;
                }
            } else {
                this.field4591 = new int[2][4];
                this.field4591[0][2] = 0;
                this.field4591[0][0] = 0;
                this.field4591[1][2] = 4096;
                this.field4591[0][1] = 0;
                this.field4591[1][1] = 4096;
                this.field4591[0][3] = 0;
                this.field4591[1][3] = 4096;
                this.field4591[1][0] = 4096;
            }
        }
        int var4 = 114 % ((-36 - arg1) / 32);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public static final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class272.field4374 >= ~arg4 && ~arg0 >= ~class211.field3386 && ~class207.field3328 >= ~arg5 && arg2 <= class228.field3657) {
            class193.method1432(arg4, arg2, arg5, (byte) 99, arg0, arg1);
        } else {
            class252.method1792(arg5, arg1, arg2, arg0, arg4, arg3 ^ -5);
        }
        ++field4598;
        if (arg3 != 4) {
            method1969(-113, 24, -56, -42, 86, -10);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field4595;
        if (this.field4591 == null) {
            this.method1968(1, 89);
        }
        if (arg0) {
            method1966(-30);
        }
        this.method1965(-256);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class290() {
        super(1, false);
    }
}
