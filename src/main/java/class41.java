import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class41 extends class59 {

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field731 = 0;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Lsd;")
    private static class166 field726 = class135.method935(" from your ignore list first)3", 0);

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "[I")
    public static int[] field736 = new int[128];

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lsd;")
    private static class166 field738 = class135.method935("You need a members account to login to this world)3", 0);

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "[I")
    public static int[] field724 = new int[1000];

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "Lsd;")
    public static class166 field732 = field738;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field734 = 0;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "Lsd;")
    public static class166 field742 = class135.method935("<col=00ffff>", 0);

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lsd;")
    public static class166 field741 = field726;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lnf;")
    public static class123 field728;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "Lf;")
    public static class47 field733;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
    public static int[] field723;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "[I")
    public static int[] field743;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "[Lkf;")
    public static class96[] field740;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "[[I")
    private int[][] field729;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZI)V")
    private final void method286(boolean arg0, int arg1) {
        if (!arg0) {
            ++field737;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field729 = new int[4][4];
                                        this.field729[0][2] = 4096;
                                        this.field729[0][1] = 0;
                                        this.field729[1][1] = 4096;
                                        this.field729[1][2] = 4096;
                                        this.field729[2][1] = 4096;
                                        this.field729[2][2] = 4096;
                                        this.field729[0][0] = 2048;
                                        this.field729[0][3] = 0;
                                        this.field729[1][3] = 0;
                                        this.field729[1][0] = 2867;
                                        this.field729[2][0] = 3276;
                                        this.field729[3][1] = 4096;
                                        this.field729[2][3] = 0;
                                        this.field729[3][3] = 0;
                                        this.field729[3][2] = 0;
                                        this.field729[3][0] = 4096;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field729 = new int[16][4];
                                    this.field729[0][1] = 80;
                                    this.field729[0][0] = 0;
                                    this.field729[1][0] = 155;
                                    this.field729[1][1] = 321;
                                    this.field729[2][0] = 389;
                                    this.field729[0][3] = 321;
                                    this.field729[2][1] = 578;
                                    this.field729[0][2] = 192;
                                    this.field729[3][1] = 947;
                                    this.field729[3][0] = 671;
                                    this.field729[1][3] = 562;
                                    this.field729[4][0] = 897;
                                    this.field729[5][0] = 1175;
                                    this.field729[4][1] = 1285;
                                    this.field729[5][1] = 1525;
                                    this.field729[2][3] = 803;
                                    this.field729[1][2] = 449;
                                    this.field729[2][2] = 690;
                                    this.field729[3][2] = 995;
                                    this.field729[4][2] = 1397;
                                    this.field729[3][3] = 1140;
                                    this.field729[5][2] = 1429;
                                    this.field729[6][0] = 1368;
                                    this.field729[4][3] = 1509;
                                    this.field729[6][2] = 1461;
                                    this.field729[5][3] = 1413;
                                    this.field729[7][0] = 1507;
                                    this.field729[7][2] = 1525;
                                    this.field729[8][2] = 1590;
                                    this.field729[6][3] = 1333;
                                    this.field729[6][1] = 1734;
                                    this.field729[8][0] = 1736;
                                    this.field729[9][0] = 2088;
                                    this.field729[7][1] = 1413;
                                    this.field729[7][3] = 1702;
                                    this.field729[8][3] = 2056;
                                    this.field729[8][1] = 1108;
                                    this.field729[9][2] = 2056;
                                    this.field729[10][2] = 2586;
                                    this.field729[9][1] = 1766;
                                    this.field729[11][2] = 3148;
                                    this.field729[9][3] = 2666;
                                    this.field729[12][2] = 3710;
                                    this.field729[10][3] = 3276;
                                    this.field729[10][1] = 2409;
                                    this.field729[11][3] = 3228;
                                    this.field729[11][1] = 3116;
                                    this.field729[13][2] = 3421;
                                    this.field729[10][0] = 2355;
                                    this.field729[12][3] = 3196;
                                    this.field729[11][0] = 2691;
                                    this.field729[12][1] = 3806;
                                    this.field729[14][2] = 3148;
                                    this.field729[13][3] = 3019;
                                    this.field729[15][2] = 2505;
                                    this.field729[12][0] = 3031;
                                    this.field729[13][0] = 3522;
                                    this.field729[13][1] = 3437;
                                    this.field729[14][3] = 3228;
                                    this.field729[15][3] = 2746;
                                    this.field729[14][0] = 3727;
                                    this.field729[14][1] = 3116;
                                    this.field729[15][0] = 4096;
                                    this.field729[15][1] = 2377;
                                }
                            } else {
                                this.field729 = new int[6][4];
                                this.field729[0][0] = 0;
                                this.field729[0][2] = 0;
                                this.field729[1][0] = 1843;
                                this.field729[0][1] = 0;
                                this.field729[2][0] = 2457;
                                this.field729[3][0] = 2781;
                                this.field729[4][0] = 3481;
                                this.field729[5][0] = 4096;
                                this.field729[1][1] = 0;
                                this.field729[1][2] = 0;
                                this.field729[2][1] = 0;
                                this.field729[3][1] = 0;
                                this.field729[0][3] = 0;
                                this.field729[1][3] = 1493;
                                this.field729[4][1] = 546;
                                this.field729[2][2] = 0;
                                this.field729[5][1] = 4096;
                                this.field729[2][3] = 2939;
                                this.field729[3][2] = 1124;
                                this.field729[3][3] = 3565;
                                this.field729[4][3] = 4031;
                                this.field729[5][3] = 4096;
                                this.field729[4][2] = 3084;
                                this.field729[5][2] = 4096;
                            }
                        } else {
                            this.field729 = new int[7][4];
                            this.field729[0][1] = 0;
                            this.field729[0][2] = 0;
                            this.field729[1][2] = 4096;
                            this.field729[0][0] = 0;
                            this.field729[0][3] = 4096;
                            this.field729[2][2] = 4096;
                            this.field729[1][1] = 0;
                            this.field729[1][0] = 663;
                            this.field729[2][1] = 0;
                            this.field729[3][2] = 4096;
                            this.field729[2][0] = 1363;
                            this.field729[3][1] = 4096;
                            this.field729[4][2] = 0;
                            this.field729[1][3] = 4096;
                            this.field729[4][1] = 4096;
                            this.field729[5][2] = 0;
                            this.field729[6][2] = 0;
                            this.field729[5][1] = 4096;
                            this.field729[3][0] = 2048;
                            this.field729[2][3] = 0;
                            this.field729[3][3] = 0;
                            this.field729[4][3] = 0;
                            this.field729[4][0] = 2727;
                            this.field729[6][1] = 0;
                            this.field729[5][3] = 4096;
                            this.field729[5][0] = 3411;
                            this.field729[6][0] = 4096;
                            this.field729[6][3] = 4096;
                        }
                    } else {
                        this.field729 = new int[8][4];
                        this.field729[0][1] = 2650;
                        this.field729[0][3] = 2361;
                        this.field729[1][3] = 1558;
                        this.field729[2][3] = 1413;
                        this.field729[1][1] = 2313;
                        this.field729[3][3] = 947;
                        this.field729[0][0] = 0;
                        this.field729[0][2] = 2602;
                        this.field729[4][3] = 722;
                        this.field729[1][0] = 2867;
                        this.field729[2][0] = 3072;
                        this.field729[2][1] = 2618;
                        this.field729[3][1] = 2296;
                        this.field729[4][1] = 2072;
                        this.field729[3][0] = 3276;
                        this.field729[1][2] = 1799;
                        this.field729[2][2] = 1734;
                        this.field729[3][2] = 1220;
                        this.field729[4][0] = 3481;
                        this.field729[5][1] = 2730;
                        this.field729[6][1] = 2232;
                        this.field729[5][3] = 1766;
                        this.field729[6][3] = 915;
                        this.field729[4][2] = 963;
                        this.field729[7][3] = 1140;
                        this.field729[5][2] = 2152;
                        this.field729[5][0] = 3686;
                        this.field729[6][2] = 1060;
                        this.field729[7][1] = 1686;
                        this.field729[6][0] = 3891;
                        this.field729[7][0] = 4096;
                        this.field729[7][2] = 1413;
                    }
                } else {
                    this.field729 = new int[2][4];
                    this.field729[0][2] = 0;
                    this.field729[0][0] = 0;
                    this.field729[0][3] = 0;
                    this.field729[1][3] = 4096;
                    this.field729[1][0] = 4096;
                    this.field729[0][1] = 0;
                    this.field729[1][2] = 4096;
                    this.field729[1][1] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        ++field725;
        if (arg0 == 23459) {
            if (this.field729 == null) {
                this.method286(false, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method288(byte arg0) {
        field741 = null;
        field723 = null;
        field743 = null;
        field738 = null;
        field736 = null;
        field732 = null;
        field742 = null;
        if (arg0 >= -3) {
            method288((byte) -53);
        }
        field726 = null;
        field724 = null;
        field728 = null;
        field740 = null;
        field733 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            int var4 = arg0.method400(255);
            if (var4 == 0) {
                this.field729 = new int[arg0.method400(255)][4];
                for (int var5 = 0; var5 < this.field729.length; ++var5) {
                    this.field729[var5][0] = arg0.method405(2);
                    this.field729[var5][1] = arg0.method400(255) << 4;
                    this.field729[var5][2] = arg0.method400(255) << 4;
                    this.field729[var5][3] = arg0.method400(255) << 4;
                }
            } else {
                this.method286(false, var4);
            }
        }
        ++field722;
        if (arg1 < 18) {
            this.method37(false, -89);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            this.method37(false, -42);
        }
        int[][] var3 = super.field1207.method528(114, arg1);
        if (super.field1207.field1320) {
            int var4 = this.field729.length;
            int[] var5 = this.method499(0, arg1, 0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~var4 < -1) {
                for (int var9 = 0; class98.field1879 > var9; ++var9) {
                    int var10 = 0;
                    int var11 = var5[var9];
                    for (int var12 = 0; ~var12 > ~var4 && ~this.field729[var12][0] >= ~var11; ++var12) {
                        ++var10;
                    }
                    if (var10 >= var4) {
                        int[] var13 = this.field729[var4 + -1];
                        var6[var9] = var13[1];
                        var7[var9] = var13[2];
                        var8[var9] = var13[3];
                    } else {
                        int[] var14 = this.field729[var10];
                        if (var10 <= 0) {
                            var6[var9] = var14[1];
                            var7[var9] = var14[2];
                            var8[var9] = var14[3];
                        } else {
                            int[] var15 = this.field729[var10 - 1];
                            int var16 = (-var15[0] + var11 << 12) / (var14[0] - var15[0]);
                            int var17 = -var16 + 4096;
                            var6[var9] = var14[1] * var16 + var15[1] * var17 >> 12;
                            var7[var9] = var14[2] * var16 + var15[2] * var17 >> 12;
                            var8[var9] = var14[3] * var16 + var15[3] * var17 >> 12;
                        }
                    }
                }
            } else {
                for (int var18 = 0; ~var18 > ~class98.field1879; ++var18) {
                    var6[var18] = 0;
                    var7[var18] = 0;
                    var8[var18] = 0;
                }
            }
        }
        ++field730;
        return var3;
    }
}
