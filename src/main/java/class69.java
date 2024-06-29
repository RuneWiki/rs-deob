import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class69 extends class535 {

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "[I")
    private int[] field1130 = new int[257];

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    public static int field1139 = 104;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "Lbd;")
    public static class44 field1137 = new class44(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "Lvr;")
    public static class92 field1142 = new class92(10, 2, 2, 0);

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "Ldh;")
    public static class216 field1145 = new class216(13, 14);

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!jt", name = "V", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "Lol;")
    public static class192 field1133;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "[[I")
    private int[][] field1134;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    private final void method538(boolean arg0) {
        ++field1141;
        if (arg0) {
            int var2 = this.field1134.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && var5 >= this.field1134[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var4 > ~var2) {
                        int[] var7 = this.field1134[var4];
                        if (var4 <= 0) {
                            var8 = var7[3];
                            var9 = var7[2];
                            var10 = var7[1];
                        } else {
                            int[] var11 = this.field1134[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = 4096 - var12;
                            var9 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                            var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field1134[var2 + -1];
                        var8 = var14[3];
                        var10 = var14[1];
                        var9 = var14[2];
                    }
                    int var15 = var9 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var10 >> 4;
                    if (var17 >= 0) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (var15 >= 0) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 >= 0) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field1130[var3] = class442.method2600(class442.method2600(var17 << 16, var15 << 8), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        if (arg0 >= -116) {
            field1137 = null;
        }
        ++field1131;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[] var4 = this.method3158(-95, 0, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class174.field2597; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field1130[var9];
                var5[var8] = class168.method1203(var10, 16711680) >> 12;
                var6[var8] = class168.method1203(var10 >> 4, 4080);
                var7[var8] = class168.method1203(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(II)V")
    private final void method539(int arg0, int arg1) {
        ++field1143;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1134 = new int[4][4];
                                this.field1134[0][1] = 0;
                                this.field1134[0][2] = 4096;
                                this.field1134[0][0] = 2048;
                                this.field1134[0][3] = 0;
                                this.field1134[1][1] = 4096;
                                this.field1134[1][2] = 4096;
                                this.field1134[1][0] = 2867;
                                this.field1134[1][3] = 0;
                                this.field1134[2][0] = 3276;
                                this.field1134[2][1] = 4096;
                                this.field1134[2][2] = 4096;
                                this.field1134[2][3] = 0;
                                this.field1134[3][1] = 4096;
                                this.field1134[3][3] = 0;
                                this.field1134[3][2] = 0;
                                this.field1134[3][0] = 4096;
                            } else {
                                this.field1134 = new int[16][4];
                                this.field1134[0][2] = 192;
                                this.field1134[0][0] = 0;
                                this.field1134[0][1] = 80;
                                this.field1134[0][3] = 321;
                                this.field1134[1][1] = 321;
                                this.field1134[1][2] = 449;
                                this.field1134[1][3] = 562;
                                this.field1134[1][0] = 155;
                                this.field1134[2][3] = 803;
                                this.field1134[2][0] = 389;
                                this.field1134[2][2] = 690;
                                this.field1134[2][1] = 578;
                                this.field1134[3][2] = 995;
                                this.field1134[3][0] = 671;
                                this.field1134[3][3] = 1140;
                                this.field1134[3][1] = 947;
                                this.field1134[4][0] = 897;
                                this.field1134[4][2] = 1397;
                                this.field1134[4][1] = 1285;
                                this.field1134[4][3] = 1509;
                                this.field1134[5][2] = 1429;
                                this.field1134[5][3] = 1413;
                                this.field1134[5][1] = 1525;
                                this.field1134[5][0] = 1175;
                                this.field1134[6][3] = 1333;
                                this.field1134[6][2] = 1461;
                                this.field1134[6][0] = 1368;
                                this.field1134[6][1] = 1734;
                                this.field1134[7][0] = 1507;
                                this.field1134[7][1] = 1413;
                                this.field1134[7][2] = 1525;
                                this.field1134[7][3] = 1702;
                                this.field1134[8][1] = 1108;
                                this.field1134[8][0] = 1736;
                                this.field1134[8][2] = 1590;
                                this.field1134[8][3] = 2056;
                                this.field1134[9][2] = 2056;
                                this.field1134[9][1] = 1766;
                                this.field1134[9][0] = 2088;
                                this.field1134[9][3] = 2666;
                                this.field1134[10][0] = 2355;
                                this.field1134[10][3] = 3276;
                                this.field1134[10][2] = 2586;
                                this.field1134[10][1] = 2409;
                                this.field1134[11][1] = 3116;
                                this.field1134[11][2] = 3148;
                                this.field1134[11][3] = 3228;
                                this.field1134[11][0] = 2691;
                                this.field1134[12][0] = 3031;
                                this.field1134[12][3] = 3196;
                                this.field1134[12][2] = 3710;
                                this.field1134[12][1] = 3806;
                                this.field1134[13][3] = 3019;
                                this.field1134[13][2] = 3421;
                                this.field1134[13][0] = 3522;
                                this.field1134[13][1] = 3437;
                                this.field1134[14][2] = 3148;
                                this.field1134[14][1] = 3116;
                                this.field1134[14][0] = 3727;
                                this.field1134[14][3] = 3228;
                                this.field1134[15][1] = 2377;
                                this.field1134[15][2] = 2505;
                                this.field1134[15][0] = 4096;
                                this.field1134[15][3] = 2746;
                            }
                        } else {
                            this.field1134 = new int[6][4];
                            this.field1134[0][3] = 0;
                            this.field1134[0][1] = 0;
                            this.field1134[0][0] = 0;
                            this.field1134[0][2] = 0;
                            this.field1134[1][0] = 1843;
                            this.field1134[1][1] = 0;
                            this.field1134[1][2] = 0;
                            this.field1134[1][3] = 1493;
                            this.field1134[2][2] = 0;
                            this.field1134[2][0] = 2457;
                            this.field1134[2][3] = 2939;
                            this.field1134[2][1] = 0;
                            this.field1134[3][2] = 1124;
                            this.field1134[3][0] = 2781;
                            this.field1134[3][3] = 3565;
                            this.field1134[3][1] = 0;
                            this.field1134[4][1] = 546;
                            this.field1134[4][0] = 3481;
                            this.field1134[4][3] = 4031;
                            this.field1134[4][2] = 3084;
                            this.field1134[5][2] = 4096;
                            this.field1134[5][1] = 4096;
                            this.field1134[5][0] = 4096;
                            this.field1134[5][3] = 4096;
                        }
                    } else {
                        this.field1134 = new int[7][4];
                        this.field1134[0][1] = 0;
                        this.field1134[0][0] = 0;
                        this.field1134[0][2] = 0;
                        this.field1134[0][3] = 4096;
                        this.field1134[1][0] = 663;
                        this.field1134[1][1] = 0;
                        this.field1134[1][3] = 4096;
                        this.field1134[1][2] = 4096;
                        this.field1134[2][2] = 4096;
                        this.field1134[2][0] = 1363;
                        this.field1134[2][3] = 0;
                        this.field1134[2][1] = 0;
                        this.field1134[3][0] = 2048;
                        this.field1134[3][1] = 4096;
                        this.field1134[3][2] = 4096;
                        this.field1134[3][3] = 0;
                        this.field1134[4][2] = 0;
                        this.field1134[4][0] = 2727;
                        this.field1134[4][3] = 0;
                        this.field1134[4][1] = 4096;
                        this.field1134[5][3] = 4096;
                        this.field1134[5][2] = 0;
                        this.field1134[5][0] = 3411;
                        this.field1134[5][1] = 4096;
                        this.field1134[6][3] = 4096;
                        this.field1134[6][0] = 4096;
                        this.field1134[6][1] = 0;
                        this.field1134[6][2] = 0;
                    }
                } else {
                    this.field1134 = new int[8][4];
                    this.field1134[0][0] = 0;
                    this.field1134[0][1] = 2650;
                    this.field1134[0][3] = 2361;
                    this.field1134[0][2] = 2602;
                    this.field1134[1][1] = 2313;
                    this.field1134[1][0] = 2867;
                    this.field1134[1][2] = 1799;
                    this.field1134[1][3] = 1558;
                    this.field1134[2][1] = 2618;
                    this.field1134[2][2] = 1734;
                    this.field1134[2][3] = 1413;
                    this.field1134[2][0] = 3072;
                    this.field1134[3][3] = 947;
                    this.field1134[3][2] = 1220;
                    this.field1134[3][0] = 3276;
                    this.field1134[3][1] = 2296;
                    this.field1134[4][3] = 722;
                    this.field1134[4][1] = 2072;
                    this.field1134[4][2] = 963;
                    this.field1134[4][0] = 3481;
                    this.field1134[5][1] = 2730;
                    this.field1134[5][0] = 3686;
                    this.field1134[5][2] = 2152;
                    this.field1134[5][3] = 1766;
                    this.field1134[6][0] = 3891;
                    this.field1134[6][2] = 1060;
                    this.field1134[6][1] = 2232;
                    this.field1134[6][3] = 915;
                    this.field1134[7][1] = 1686;
                    this.field1134[7][3] = 1140;
                    this.field1134[7][2] = 1413;
                    this.field1134[7][0] = 4096;
                }
            } else {
                this.field1134 = new int[2][4];
                this.field1134[0][2] = 0;
                this.field1134[0][3] = 0;
                this.field1134[0][1] = 0;
                this.field1134[0][0] = 0;
                this.field1134[1][3] = 4096;
                this.field1134[1][0] = 4096;
                this.field1134[1][2] = 4096;
                this.field1134[1][1] = 4096;
            }
        }
        if (arg1 != 28482) {
            field1137 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(B)V")
    public final void method66(byte arg0) {
        ++field1132;
        if (arg0 <= 111) {
            this.field1134 = null;
        }
        if (this.field1134 == null) {
            this.method539(1, 28482);
        }
        this.method538(true);
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(B)V")
    public static final void method540(byte arg0) {
        class283.field4217 = new class198[class106.field1605.method2033((byte) 60)][];
        ++field1135;
        if (arg0 <= 81) {
            field1144 = -60;
        }
        class472.field6869 = new class198[class106.field1605.method2033((byte) 60)][];
        class92.field1473 = new boolean[class106.field1605.method2033((byte) 60)];
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1133 = null;
        field1137 = null;
        if (arg0 != 255) {
            method541(110);
        }
        field1142 = null;
        field1145 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZII)I")
    public static final int method542(boolean arg0, int arg1, int arg2) {
        ++field1136;
        if (~arg1 != -2 && arg1 != 3) {
            return arg0 ? 78 : class271.field4080[arg2 & 3];
        } else {
            return class235.field3500[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 == -1) {
            int var4 = arg1.method3072((byte) -121);
            if (var4 == 0) {
                this.field1134 = new int[arg1.method3072((byte) -127)][4];
                for (int var5 = 0; this.field1134.length > var5; ++var5) {
                    this.field1134[var5][0] = arg1.method3018(566990904);
                    this.field1134[var5][1] = arg1.method3072((byte) -124) << 4;
                    this.field1134[var5][2] = arg1.method3072((byte) -123) << 4;
                    this.field1134[var5][3] = arg1.method3072((byte) -127) << 4;
                }
            } else {
                this.method539(var4, 28482);
            }
        }
        if (arg2 != -6232) {
            method541(-58);
        }
        ++field1138;
    }
}
