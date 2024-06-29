import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class411 extends class30 {

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "[I")
    private int[] field6093 = new int[257];

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field6088 = -1;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "[I")
    public static int[] field6091 = new int[2];

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Lmo;")
    public static class447 field6085;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "[[I")
    private int[][] field6086;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "[[[I")
    public static int[][][] field6089;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field6092;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[] var4 = this.method210((byte) 82, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class369.field5610; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field6093[var9];
                var5[var8] = class37.method242(var10, 16711680) >> 12;
                var6[var8] = class37.method242(65280, var10) >> 4;
                var7[var8] = class37.method242(var10 << 4, 4080);
            }
        }
        if (arg0 != -93) {
            method2576(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
    public static final void method2576(boolean arg0) {
        ++field6096;
        class11.field155 = 0;
        class21.field274 = 0;
        class331.method2199(12529);
        class346.method2259((byte) -119);
        class353.method2297(arg0);
        for (int var1 = 0; ~var1 > ~class11.field155; ++var1) {
            int var3 = class134.field2112[var1];
            if (~class183.field2987 != ~class39.field499[var3].field1839) {
                if (class39.field499[var3].field615.method1624((byte) -81)) {
                    class337.method2222(false, class39.field499[var3]);
                }
                class39.field499[var3].method316((class226) null, 0);
                class39.field499[var3] = null;
            }
        }
        if (class345.field5331 != class158.field2514.field3044) {
            throw new RuntimeException("gnp1 pos:" + class158.field2514.field3044 + " psize:" + class345.field5331);
        } else {
            for (int var2 = 0; var2 < class397.field5940; ++var2) {
                if (class39.field499[class423.field6253[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class397.field5940);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
    private final void method2577(int arg0) {
        ++field6090;
        if (arg0 != -29340) {
            this.method2577(-2);
        }
        int var2 = this.field6086.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && var5 >= this.field6086[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field6086[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field6086[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field6086[var4 - 1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                    } else {
                        var9 = var11[2];
                        var8 = var11[1];
                        var10 = var11[3];
                    }
                }
                int var15 = var9 >> 4;
                int var16 = var10 >> 4;
                int var17 = var8 >> 4;
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                this.field6093[var3] = class35.method227(var16, class35.method227(var17 << 16, var15 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            this.method115((class186) null, -115, 29);
        }
        ++field6087;
        if (~arg2 == -1) {
            int var4 = arg0.method1322(false);
            if (var4 != 0) {
                this.method2578(arg1 ^ 6456, var4);
            } else {
                this.field6086 = new int[arg0.method1322(false)][4];
                for (int var5 = 0; this.field6086.length > var5; ++var5) {
                    this.field6086[var5][0] = arg0.method1272((byte) -114);
                    this.field6086[var5][1] = arg0.method1322(false) << 4;
                    this.field6086[var5][2] = arg0.method1322(false) << 4;
                    this.field6086[var5][3] = arg0.method1322(false) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    private final void method2578(int arg0, int arg1) {
        ++field6084;
        if (arg0 != arg1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field6086 = new int[4][4];
                                    this.field6086[0][0] = 2048;
                                    this.field6086[0][2] = 4096;
                                    this.field6086[0][1] = 0;
                                    this.field6086[0][3] = 0;
                                    this.field6086[1][0] = 2867;
                                    this.field6086[1][2] = 4096;
                                    this.field6086[1][1] = 4096;
                                    this.field6086[1][3] = 0;
                                    this.field6086[2][0] = 3276;
                                    this.field6086[2][1] = 4096;
                                    this.field6086[2][2] = 4096;
                                    this.field6086[2][3] = 0;
                                    this.field6086[3][1] = 4096;
                                    this.field6086[3][3] = 0;
                                    this.field6086[3][2] = 0;
                                    this.field6086[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field6086 = new int[16][4];
                                this.field6086[0][1] = 80;
                                this.field6086[0][3] = 321;
                                this.field6086[0][2] = 192;
                                this.field6086[0][0] = 0;
                                this.field6086[1][2] = 449;
                                this.field6086[1][0] = 155;
                                this.field6086[1][3] = 562;
                                this.field6086[1][1] = 321;
                                this.field6086[2][2] = 690;
                                this.field6086[2][1] = 578;
                                this.field6086[2][0] = 389;
                                this.field6086[2][3] = 803;
                                this.field6086[3][2] = 995;
                                this.field6086[3][0] = 671;
                                this.field6086[3][1] = 947;
                                this.field6086[3][3] = 1140;
                                this.field6086[4][1] = 1285;
                                this.field6086[4][0] = 897;
                                this.field6086[4][2] = 1397;
                                this.field6086[4][3] = 1509;
                                this.field6086[5][3] = 1413;
                                this.field6086[5][0] = 1175;
                                this.field6086[5][1] = 1525;
                                this.field6086[5][2] = 1429;
                                this.field6086[6][1] = 1734;
                                this.field6086[6][2] = 1461;
                                this.field6086[6][0] = 1368;
                                this.field6086[6][3] = 1333;
                                this.field6086[7][3] = 1702;
                                this.field6086[7][0] = 1507;
                                this.field6086[7][2] = 1525;
                                this.field6086[7][1] = 1413;
                                this.field6086[8][0] = 1736;
                                this.field6086[8][2] = 1590;
                                this.field6086[8][1] = 1108;
                                this.field6086[8][3] = 2056;
                                this.field6086[9][0] = 2088;
                                this.field6086[9][3] = 2666;
                                this.field6086[9][1] = 1766;
                                this.field6086[9][2] = 2056;
                                this.field6086[10][1] = 2409;
                                this.field6086[10][3] = 3276;
                                this.field6086[10][2] = 2586;
                                this.field6086[10][0] = 2355;
                                this.field6086[11][2] = 3148;
                                this.field6086[11][3] = 3228;
                                this.field6086[11][1] = 3116;
                                this.field6086[11][0] = 2691;
                                this.field6086[12][3] = 3196;
                                this.field6086[12][1] = 3806;
                                this.field6086[12][2] = 3710;
                                this.field6086[12][0] = 3031;
                                this.field6086[13][2] = 3421;
                                this.field6086[13][3] = 3019;
                                this.field6086[13][0] = 3522;
                                this.field6086[13][1] = 3437;
                                this.field6086[14][0] = 3727;
                                this.field6086[14][3] = 3228;
                                this.field6086[14][1] = 3116;
                                this.field6086[14][2] = 3148;
                                this.field6086[15][1] = 2377;
                                this.field6086[15][3] = 2746;
                                this.field6086[15][2] = 2505;
                                this.field6086[15][0] = 4096;
                            }
                        } else {
                            this.field6086 = new int[6][4];
                            this.field6086[0][0] = 0;
                            this.field6086[0][3] = 0;
                            this.field6086[0][2] = 0;
                            this.field6086[0][1] = 0;
                            this.field6086[1][2] = 0;
                            this.field6086[1][3] = 1493;
                            this.field6086[1][1] = 0;
                            this.field6086[1][0] = 1843;
                            this.field6086[2][3] = 2939;
                            this.field6086[2][1] = 0;
                            this.field6086[2][0] = 2457;
                            this.field6086[2][2] = 0;
                            this.field6086[3][3] = 3565;
                            this.field6086[3][1] = 0;
                            this.field6086[3][2] = 1124;
                            this.field6086[3][0] = 2781;
                            this.field6086[4][1] = 546;
                            this.field6086[4][2] = 3084;
                            this.field6086[4][3] = 4031;
                            this.field6086[4][0] = 3481;
                            this.field6086[5][1] = 4096;
                            this.field6086[5][3] = 4096;
                            this.field6086[5][2] = 4096;
                            this.field6086[5][0] = 4096;
                        }
                    } else {
                        this.field6086 = new int[7][4];
                        this.field6086[0][1] = 0;
                        this.field6086[0][2] = 0;
                        this.field6086[0][3] = 4096;
                        this.field6086[0][0] = 0;
                        this.field6086[1][2] = 4096;
                        this.field6086[1][3] = 4096;
                        this.field6086[1][1] = 0;
                        this.field6086[1][0] = 663;
                        this.field6086[2][0] = 1363;
                        this.field6086[2][2] = 4096;
                        this.field6086[2][1] = 0;
                        this.field6086[2][3] = 0;
                        this.field6086[3][3] = 0;
                        this.field6086[3][0] = 2048;
                        this.field6086[3][2] = 4096;
                        this.field6086[3][1] = 4096;
                        this.field6086[4][0] = 2727;
                        this.field6086[4][2] = 0;
                        this.field6086[4][1] = 4096;
                        this.field6086[4][3] = 0;
                        this.field6086[5][2] = 0;
                        this.field6086[5][0] = 3411;
                        this.field6086[5][1] = 4096;
                        this.field6086[5][3] = 4096;
                        this.field6086[6][3] = 4096;
                        this.field6086[6][0] = 4096;
                        this.field6086[6][1] = 0;
                        this.field6086[6][2] = 0;
                    }
                } else {
                    this.field6086 = new int[8][4];
                    this.field6086[0][0] = 0;
                    this.field6086[0][2] = 2602;
                    this.field6086[0][1] = 2650;
                    this.field6086[0][3] = 2361;
                    this.field6086[1][2] = 1799;
                    this.field6086[1][1] = 2313;
                    this.field6086[1][0] = 2867;
                    this.field6086[1][3] = 1558;
                    this.field6086[2][2] = 1734;
                    this.field6086[2][3] = 1413;
                    this.field6086[2][0] = 3072;
                    this.field6086[2][1] = 2618;
                    this.field6086[3][3] = 947;
                    this.field6086[3][0] = 3276;
                    this.field6086[3][1] = 2296;
                    this.field6086[3][2] = 1220;
                    this.field6086[4][3] = 722;
                    this.field6086[4][0] = 3481;
                    this.field6086[4][1] = 2072;
                    this.field6086[4][2] = 963;
                    this.field6086[5][0] = 3686;
                    this.field6086[5][3] = 1766;
                    this.field6086[5][2] = 2152;
                    this.field6086[5][1] = 2730;
                    this.field6086[6][2] = 1060;
                    this.field6086[6][0] = 3891;
                    this.field6086[6][3] = 915;
                    this.field6086[6][1] = 2232;
                    this.field6086[7][3] = 1140;
                    this.field6086[7][0] = 4096;
                    this.field6086[7][2] = 1413;
                    this.field6086[7][1] = 1686;
                }
            } else {
                this.field6086 = new int[2][4];
                this.field6086[0][0] = 0;
                this.field6086[0][1] = 0;
                this.field6086[0][3] = 0;
                this.field6086[0][2] = 0;
                this.field6086[1][2] = 4096;
                this.field6086[1][0] = 4096;
                this.field6086[1][1] = 4096;
                this.field6086[1][3] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method2579(String arg0, byte arg1, char arg2) {
        ++field6095;
        int var3 = 0;
        int var4 = arg0.length();
        if (arg1 <= 49) {
            field6085 = null;
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            if (~arg2 == ~arg0.charAt(var5)) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class411() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (this.field6086 == null) {
            this.method2578(0, 1);
        }
        ++field6094;
        if (arg0 >= 90) {
            this.method2577(-29340);
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method2580(int arg0) {
        field6089 = null;
        if (arg0 != 2) {
            field6085 = null;
        }
        field6091 = null;
        field6085 = null;
    }
}
