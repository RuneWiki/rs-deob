import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class56 extends class107 {

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "[I")
    private int[] field1158 = new int[257];

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lpj;")
    public static class237 field1159 = class33.method353("Ladevorgang )2 bitte warten Sie)3", 99);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lp;")
    public static class272 field1148 = new class272();

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field1165 = -1;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "[[I")
    private int[][] field1156;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "[[Z")
    public static boolean[][] field1152;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    private final void method493(int arg0, int arg1) {
        ++field1153;
        if (arg1 < 18) {
            field1165 = -86;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1156 = new int[4][4];
                                    this.field1156[0][0] = 2048;
                                    this.field1156[1][0] = 2867;
                                    this.field1156[0][3] = 0;
                                    this.field1156[1][3] = 0;
                                    this.field1156[0][1] = 0;
                                    this.field1156[0][2] = 4096;
                                    this.field1156[2][3] = 0;
                                    this.field1156[1][1] = 4096;
                                    this.field1156[2][0] = 3276;
                                    this.field1156[3][3] = 0;
                                    this.field1156[1][2] = 4096;
                                    this.field1156[3][0] = 4096;
                                    this.field1156[2][2] = 4096;
                                    this.field1156[2][1] = 4096;
                                    this.field1156[3][2] = 0;
                                    this.field1156[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field1156 = new int[16][4];
                                this.field1156[0][1] = 80;
                                this.field1156[0][3] = 321;
                                this.field1156[0][2] = 192;
                                this.field1156[0][0] = 0;
                                this.field1156[1][3] = 562;
                                this.field1156[1][0] = 155;
                                this.field1156[2][3] = 803;
                                this.field1156[3][3] = 1140;
                                this.field1156[1][2] = 449;
                                this.field1156[2][0] = 389;
                                this.field1156[3][0] = 671;
                                this.field1156[4][3] = 1509;
                                this.field1156[4][0] = 897;
                                this.field1156[5][3] = 1413;
                                this.field1156[1][1] = 321;
                                this.field1156[6][3] = 1333;
                                this.field1156[7][3] = 1702;
                                this.field1156[5][0] = 1175;
                                this.field1156[2][2] = 690;
                                this.field1156[2][1] = 578;
                                this.field1156[8][3] = 2056;
                                this.field1156[3][1] = 947;
                                this.field1156[3][2] = 995;
                                this.field1156[9][3] = 2666;
                                this.field1156[4][1] = 1285;
                                this.field1156[6][0] = 1368;
                                this.field1156[5][1] = 1525;
                                this.field1156[4][2] = 1397;
                                this.field1156[5][2] = 1429;
                                this.field1156[10][3] = 3276;
                                this.field1156[7][0] = 1507;
                                this.field1156[8][0] = 1736;
                                this.field1156[9][0] = 2088;
                                this.field1156[6][1] = 1734;
                                this.field1156[10][0] = 2355;
                                this.field1156[11][0] = 2691;
                                this.field1156[12][0] = 3031;
                                this.field1156[7][1] = 1413;
                                this.field1156[11][3] = 3228;
                                this.field1156[6][2] = 1461;
                                this.field1156[13][0] = 3522;
                                this.field1156[12][3] = 3196;
                                this.field1156[13][3] = 3019;
                                this.field1156[8][1] = 1108;
                                this.field1156[9][1] = 1766;
                                this.field1156[7][2] = 1525;
                                this.field1156[14][3] = 3228;
                                this.field1156[10][1] = 2409;
                                this.field1156[14][0] = 3727;
                                this.field1156[15][0] = 4096;
                                this.field1156[8][2] = 1590;
                                this.field1156[11][1] = 3116;
                                this.field1156[12][1] = 3806;
                                this.field1156[15][3] = 2746;
                                this.field1156[9][2] = 2056;
                                this.field1156[10][2] = 2586;
                                this.field1156[11][2] = 3148;
                                this.field1156[13][1] = 3437;
                                this.field1156[14][1] = 3116;
                                this.field1156[12][2] = 3710;
                                this.field1156[13][2] = 3421;
                                this.field1156[15][1] = 2377;
                                this.field1156[14][2] = 3148;
                                this.field1156[15][2] = 2505;
                            }
                        } else {
                            this.field1156 = new int[6][4];
                            this.field1156[0][1] = 0;
                            this.field1156[0][2] = 0;
                            this.field1156[1][2] = 0;
                            this.field1156[1][1] = 0;
                            this.field1156[0][3] = 0;
                            this.field1156[2][2] = 0;
                            this.field1156[1][3] = 1493;
                            this.field1156[0][0] = 0;
                            this.field1156[2][3] = 2939;
                            this.field1156[3][3] = 3565;
                            this.field1156[3][2] = 1124;
                            this.field1156[4][3] = 4031;
                            this.field1156[5][3] = 4096;
                            this.field1156[4][2] = 3084;
                            this.field1156[1][0] = 1843;
                            this.field1156[5][2] = 4096;
                            this.field1156[2][0] = 2457;
                            this.field1156[3][0] = 2781;
                            this.field1156[2][1] = 0;
                            this.field1156[4][0] = 3481;
                            this.field1156[5][0] = 4096;
                            this.field1156[3][1] = 0;
                            this.field1156[4][1] = 546;
                            this.field1156[5][1] = 4096;
                        }
                    } else {
                        this.field1156 = new int[7][4];
                        this.field1156[0][1] = 0;
                        this.field1156[0][3] = 4096;
                        this.field1156[1][1] = 0;
                        this.field1156[2][1] = 0;
                        this.field1156[0][0] = 0;
                        this.field1156[1][3] = 4096;
                        this.field1156[1][0] = 663;
                        this.field1156[3][1] = 4096;
                        this.field1156[0][2] = 0;
                        this.field1156[1][2] = 4096;
                        this.field1156[4][1] = 4096;
                        this.field1156[2][0] = 1363;
                        this.field1156[5][1] = 4096;
                        this.field1156[6][1] = 0;
                        this.field1156[3][0] = 2048;
                        this.field1156[2][3] = 0;
                        this.field1156[3][3] = 0;
                        this.field1156[4][3] = 0;
                        this.field1156[4][0] = 2727;
                        this.field1156[5][0] = 3411;
                        this.field1156[2][2] = 4096;
                        this.field1156[6][0] = 4096;
                        this.field1156[3][2] = 4096;
                        this.field1156[5][3] = 4096;
                        this.field1156[4][2] = 0;
                        this.field1156[5][2] = 0;
                        this.field1156[6][2] = 0;
                        this.field1156[6][3] = 4096;
                    }
                } else {
                    this.field1156 = new int[8][4];
                    this.field1156[0][3] = 2361;
                    this.field1156[1][3] = 1558;
                    this.field1156[0][2] = 2602;
                    this.field1156[1][2] = 1799;
                    this.field1156[0][0] = 0;
                    this.field1156[0][1] = 2650;
                    this.field1156[1][1] = 2313;
                    this.field1156[1][0] = 2867;
                    this.field1156[2][3] = 1413;
                    this.field1156[2][0] = 3072;
                    this.field1156[3][3] = 947;
                    this.field1156[2][2] = 1734;
                    this.field1156[4][3] = 722;
                    this.field1156[3][0] = 3276;
                    this.field1156[5][3] = 1766;
                    this.field1156[4][0] = 3481;
                    this.field1156[6][3] = 915;
                    this.field1156[7][3] = 1140;
                    this.field1156[2][1] = 2618;
                    this.field1156[5][0] = 3686;
                    this.field1156[6][0] = 3891;
                    this.field1156[3][1] = 2296;
                    this.field1156[4][1] = 2072;
                    this.field1156[3][2] = 1220;
                    this.field1156[7][0] = 4096;
                    this.field1156[4][2] = 963;
                    this.field1156[5][1] = 2730;
                    this.field1156[6][1] = 2232;
                    this.field1156[5][2] = 2152;
                    this.field1156[6][2] = 1060;
                    this.field1156[7][2] = 1413;
                    this.field1156[7][1] = 1686;
                }
            } else {
                this.field1156 = new int[2][4];
                this.field1156[0][2] = 0;
                this.field1156[0][1] = 0;
                this.field1156[0][3] = 0;
                this.field1156[1][2] = 4096;
                this.field1156[0][0] = 0;
                this.field1156[1][0] = 4096;
                this.field1156[1][3] = 4096;
                this.field1156[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 == -32513) {
            ++field1160;
            if (~arg1 == -1) {
                int var4 = arg0.method316((byte) -13);
                if (var4 != 0) {
                    this.method493(var4, 56);
                } else {
                    this.field1156 = new int[arg0.method316((byte) -33)][4];
                    for (int var5 = 0; var5 < this.field1156.length; ++var5) {
                        this.field1156[var5][0] = arg0.method339(-16777216);
                        this.field1156[var5][1] = arg0.method316((byte) -104) << 4;
                        this.field1156[var5][2] = arg0.method316((byte) 9) << 4;
                        this.field1156[var5][3] = arg0.method316((byte) -102) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field1161;
        int var3 = 103 % ((26 - arg0) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[] var5 = this.method797(0, arg1, (byte) 108);
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            for (int var9 = 0; var9 < class106.field1862; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field1158[var10];
                var6[var9] = class272.method1817(var11 >> 12, 4080);
                var8[var9] = class272.method1817(var11, 65280) >> 4;
                var7[var9] = class272.method1817(255, var11) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static final void method494(byte arg0) {
        if (arg0 < -122) {
            ++field1155;
            if (~class12.field211 == -6) {
                class12.field211 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    public static void method495(int arg0) {
        if (arg0 != 5) {
            method494((byte) -37);
        }
        field1152 = null;
        field1148 = null;
        field1159 = null;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
    private final void method496(byte arg0) {
        ++field1157;
        if (arg0 < -59) {
            int var2 = this.field1156.length;
            if (var2 > 0) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && this.field1156[var6][0] <= var5; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 > ~var2) {
                        int[] var7 = this.field1156[var4];
                        if (~var4 >= -1) {
                            var8 = var7[2];
                            var9 = var7[1];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field1156[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                            var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field1156[var2 + -1];
                        var8 = var14[2];
                        var9 = var14[1];
                        var10 = var14[3];
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    if (var15 >= 0) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -256) {
                        var16 = 255;
                    }
                    int var17 = var10 >> 4;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    this.field1158[var3] = class34.method362(class34.method362(var15 << 16, var16 << 8), var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (this.field1156 == null) {
            this.method493(1, 83);
        }
        if (arg0 != 31) {
            this.method124(-79);
        }
        this.method496((byte) -77);
        ++field1154;
    }
}
