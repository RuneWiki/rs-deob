import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class190 extends class27 {

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lkb;")
    public static class93 field3708 = class76.method390("Sie haben gerade eine andere Welt verlassen)3", 0);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lkb;")
    private static class93 field3713 = class76.method390("as it was used to break our rules)3", 0);

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lkb;")
    public static class93 field3714 = field3713;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Ljg;")
    public static class89 field3712;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[[I")
    private int[][] field3717;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field3711;
        if (arg0 < 106) {
            method1229(107, -84, 26);
        }
        if (~arg1 == -1) {
            int var4 = arg2.method1054(128);
            if (var4 != 0) {
                this.method1227((byte) -113, var4);
            } else {
                this.field3717 = new int[arg2.method1054(128)][4];
                for (int var5 = 0; ~this.field3717.length < ~var5; ++var5) {
                    this.field3717[var5][0] = arg2.method1071(28101);
                    this.field3717[var5][1] = arg2.method1054(128) << 4;
                    this.field3717[var5][2] = arg2.method1054(128) << 4;
                    this.field3717[var5][3] = arg2.method1054(128) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
    private final void method1227(byte arg0, int arg1) {
        ++field3706;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3717 = new int[4][4];
                                this.field3717[0][2] = 4096;
                                this.field3717[0][0] = 2048;
                                this.field3717[0][3] = 0;
                                this.field3717[1][3] = 0;
                                this.field3717[2][3] = 0;
                                this.field3717[1][0] = 2867;
                                this.field3717[2][0] = 3276;
                                this.field3717[0][1] = 0;
                                this.field3717[3][3] = 0;
                                this.field3717[1][1] = 4096;
                                this.field3717[3][0] = 4096;
                                this.field3717[2][1] = 4096;
                                this.field3717[1][2] = 4096;
                                this.field3717[3][1] = 4096;
                                this.field3717[2][2] = 4096;
                                this.field3717[3][2] = 0;
                            } else {
                                this.field3717 = new int[16][4];
                                this.field3717[0][2] = 192;
                                this.field3717[0][1] = 80;
                                this.field3717[1][1] = 321;
                                this.field3717[2][1] = 578;
                                this.field3717[0][0] = 0;
                                this.field3717[1][2] = 449;
                                this.field3717[3][1] = 947;
                                this.field3717[0][3] = 321;
                                this.field3717[2][2] = 690;
                                this.field3717[3][2] = 995;
                                this.field3717[1][0] = 155;
                                this.field3717[4][2] = 1397;
                                this.field3717[5][2] = 1429;
                                this.field3717[2][0] = 389;
                                this.field3717[6][2] = 1461;
                                this.field3717[7][2] = 1525;
                                this.field3717[4][1] = 1285;
                                this.field3717[1][3] = 562;
                                this.field3717[8][2] = 1590;
                                this.field3717[2][3] = 803;
                                this.field3717[5][1] = 1525;
                                this.field3717[3][0] = 671;
                                this.field3717[9][2] = 2056;
                                this.field3717[6][1] = 1734;
                                this.field3717[10][2] = 2586;
                                this.field3717[7][1] = 1413;
                                this.field3717[4][0] = 897;
                                this.field3717[11][2] = 3148;
                                this.field3717[8][1] = 1108;
                                this.field3717[12][2] = 3710;
                                this.field3717[13][2] = 3421;
                                this.field3717[9][1] = 1766;
                                this.field3717[3][3] = 1140;
                                this.field3717[5][0] = 1175;
                                this.field3717[10][1] = 2409;
                                this.field3717[14][2] = 3148;
                                this.field3717[15][2] = 2505;
                                this.field3717[4][3] = 1509;
                                this.field3717[6][0] = 1368;
                                this.field3717[11][1] = 3116;
                                this.field3717[5][3] = 1413;
                                this.field3717[7][0] = 1507;
                                this.field3717[6][3] = 1333;
                                this.field3717[8][0] = 1736;
                                this.field3717[7][3] = 1702;
                                this.field3717[9][0] = 2088;
                                this.field3717[12][1] = 3806;
                                this.field3717[8][3] = 2056;
                                this.field3717[10][0] = 2355;
                                this.field3717[11][0] = 2691;
                                this.field3717[9][3] = 2666;
                                this.field3717[13][1] = 3437;
                                this.field3717[14][1] = 3116;
                                this.field3717[12][0] = 3031;
                                this.field3717[13][0] = 3522;
                                this.field3717[14][0] = 3727;
                                this.field3717[10][3] = 3276;
                                this.field3717[11][3] = 3228;
                                this.field3717[15][0] = 4096;
                                this.field3717[15][1] = 2377;
                                this.field3717[12][3] = 3196;
                                this.field3717[13][3] = 3019;
                                this.field3717[14][3] = 3228;
                                this.field3717[15][3] = 2746;
                            }
                        } else {
                            this.field3717 = new int[6][4];
                            this.field3717[0][3] = 0;
                            this.field3717[1][3] = 1493;
                            this.field3717[0][2] = 0;
                            this.field3717[0][0] = 0;
                            this.field3717[1][2] = 0;
                            this.field3717[2][2] = 0;
                            this.field3717[2][3] = 2939;
                            this.field3717[3][2] = 1124;
                            this.field3717[4][2] = 3084;
                            this.field3717[5][2] = 4096;
                            this.field3717[1][0] = 1843;
                            this.field3717[2][0] = 2457;
                            this.field3717[3][0] = 2781;
                            this.field3717[0][1] = 0;
                            this.field3717[3][3] = 3565;
                            this.field3717[1][1] = 0;
                            this.field3717[4][0] = 3481;
                            this.field3717[5][0] = 4096;
                            this.field3717[2][1] = 0;
                            this.field3717[4][3] = 4031;
                            this.field3717[3][1] = 0;
                            this.field3717[4][1] = 546;
                            this.field3717[5][1] = 4096;
                            this.field3717[5][3] = 4096;
                        }
                    } else {
                        this.field3717 = new int[7][4];
                        this.field3717[0][0] = 0;
                        this.field3717[0][3] = 4096;
                        this.field3717[1][0] = 663;
                        this.field3717[0][1] = 0;
                        this.field3717[1][3] = 4096;
                        this.field3717[2][3] = 0;
                        this.field3717[0][2] = 0;
                        this.field3717[1][2] = 4096;
                        this.field3717[2][2] = 4096;
                        this.field3717[1][1] = 0;
                        this.field3717[2][1] = 0;
                        this.field3717[2][0] = 1363;
                        this.field3717[3][0] = 2048;
                        this.field3717[4][0] = 2727;
                        this.field3717[3][3] = 0;
                        this.field3717[3][1] = 4096;
                        this.field3717[4][1] = 4096;
                        this.field3717[5][0] = 3411;
                        this.field3717[4][3] = 0;
                        this.field3717[3][2] = 4096;
                        this.field3717[5][1] = 4096;
                        this.field3717[4][2] = 0;
                        this.field3717[5][2] = 0;
                        this.field3717[6][2] = 0;
                        this.field3717[6][1] = 0;
                        this.field3717[5][3] = 4096;
                        this.field3717[6][3] = 4096;
                        this.field3717[6][0] = 4096;
                    }
                } else {
                    this.field3717 = new int[8][4];
                    this.field3717[0][2] = 2602;
                    this.field3717[0][0] = 0;
                    this.field3717[1][2] = 1799;
                    this.field3717[0][1] = 2650;
                    this.field3717[0][3] = 2361;
                    this.field3717[1][3] = 1558;
                    this.field3717[1][1] = 2313;
                    this.field3717[2][2] = 1734;
                    this.field3717[2][1] = 2618;
                    this.field3717[1][0] = 2867;
                    this.field3717[3][2] = 1220;
                    this.field3717[2][0] = 3072;
                    this.field3717[4][2] = 963;
                    this.field3717[3][1] = 2296;
                    this.field3717[5][2] = 2152;
                    this.field3717[3][0] = 3276;
                    this.field3717[4][0] = 3481;
                    this.field3717[2][3] = 1413;
                    this.field3717[3][3] = 947;
                    this.field3717[5][0] = 3686;
                    this.field3717[6][0] = 3891;
                    this.field3717[4][3] = 722;
                    this.field3717[6][2] = 1060;
                    this.field3717[4][1] = 2072;
                    this.field3717[7][0] = 4096;
                    this.field3717[5][1] = 2730;
                    this.field3717[6][1] = 2232;
                    this.field3717[7][1] = 1686;
                    this.field3717[5][3] = 1766;
                    this.field3717[6][3] = 915;
                    this.field3717[7][2] = 1413;
                    this.field3717[7][3] = 1140;
                }
            } else {
                this.field3717 = new int[2][4];
                this.field3717[0][0] = 0;
                this.field3717[1][0] = 4096;
                this.field3717[0][2] = 0;
                this.field3717[0][3] = 0;
                this.field3717[1][3] = 4096;
                this.field3717[1][2] = 4096;
                this.field3717[0][1] = 0;
                this.field3717[1][1] = 4096;
            }
        }
        int var4 = -63 % ((-25 - arg0) / 55);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (this.field3717 == null) {
            this.method1227((byte) 115, 1);
        }
        if (arg0 <= 77) {
            method1228((byte) 99);
        }
        ++field3710;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        field3714 = null;
        if (arg0 <= 69) {
            method1229(-7, -31, 27);
        }
        field3712 = null;
        field3708 = null;
        field3713 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public static final void method1229(int arg0, int arg1, int arg2) {
        ++field3707;
        if (class67.method352(arg2 + 2, arg0)) {
            if (arg2 != 0) {
                field3715 = -121;
            }
            class40.method220((byte) 81, class28.field460[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = 87 / ((42 - arg0) / 54);
        ++field3716;
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int var5 = this.field3717.length;
            int[] var6 = this.method145(0, (byte) 125, arg1);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            if (~var5 < -1) {
                for (int var10 = 0; ~class159.field3209 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var6[var10];
                    for (int var13 = 0; var5 > var13 && this.field3717[var13][0] <= var12; ++var13) {
                        ++var11;
                    }
                    if (var5 <= var11) {
                        int[] var14 = this.field3717[var5 + -1];
                        var8[var10] = var14[1];
                        var7[var10] = var14[2];
                        var9[var10] = var14[3];
                    } else {
                        int[] var15 = this.field3717[var11];
                        if (var11 <= 0) {
                            var8[var10] = var15[1];
                            var7[var10] = var15[2];
                            var9[var10] = var15[3];
                        } else {
                            int[] var16 = this.field3717[var11 + -1];
                            int var17 = (-var16[0] + var12 << 12) / (var15[0] - var16[0]);
                            int var18 = -var17 + 4096;
                            var8[var10] = var15[1] * var17 + var16[1] * var18 >> 12;
                            var7[var10] = var15[2] * var17 + var16[2] * var18 >> 12;
                            var9[var10] = var15[3] * var17 - -(var16[3] * var18) >> 12;
                        }
                    }
                }
            } else {
                for (int var19 = 0; ~var19 > ~class159.field3209; ++var19) {
                    var8[var19] = 0;
                    var7[var19] = 0;
                    var9[var19] = 0;
                }
            }
        }
        return var4;
    }
}
