import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class179 extends class243 {

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "[I")
    private int[] field3079 = new int[257];

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "Lub;")
    public static class227 field3067 = class257.method1749(" x ", 17263);

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "Lub;")
    public static class227 field3068 = class257.method1749("(U5", 17263);

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    public static int field3072 = 255;

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lub;")
    private static class227 field3078 = class257.method1749("Loaded textures", 17263);

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "Lub;")
    public static class227 field3075 = field3078;

    @OriginalMember(owner = "client!jf", name = "sb", descriptor = "I")
    public static int field3082 = -1;

    @OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lub;")
    public static class227 field3081 = class257.method1749("<)4col>", 17263);

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "Lnf;")
    public static class213 field3063;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "[[I")
    private int[][] field3076;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field3070;
        if (this.field3076 == null) {
            this.method1152(0, 1);
        }
        this.method1151(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static void method1148(int arg0) {
        field3081 = null;
        field3067 = null;
        if (arg0 != 255) {
            field3081 = null;
        }
        field3068 = null;
        field3078 = null;
        field3063 = null;
        field3075 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3074;
        if (arg0 != 230) {
            field3062 = 53;
        }
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[] var4 = this.method1614(0, arg1, 120);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class212.field3586; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3079[var9];
                var7[var8] = class76.method446(var10, 16711680) >> 12;
                var6[var8] = class76.method446(4080, var10 >> 4);
                var5[var8] = class76.method446(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method1471(255);
            if (~var4 == -1) {
                this.field3076 = new int[arg0.method1471(255)][4];
                for (int var5 = 0; this.field3076.length > var5; ++var5) {
                    this.field3076[var5][0] = arg0.method1447(0);
                    this.field3076[var5][1] = arg0.method1471(255) << 4;
                    this.field3076[var5][2] = arg0.method1471(255) << 4;
                    this.field3076[var5][3] = arg0.method1471(255) << 4;
                }
            } else {
                this.method1152(0, var4);
            }
        }
        if (arg1) {
            this.method1151(true);
        }
        ++field3077;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)Ljj;")
    public static final class145 method1149(int arg0, int arg1) {
        class145 var2 = (class145) class7.field150.method1735((long) arg0, (byte) -69);
        ++field3069;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class242.field4206.method884(class186.method1183(3, arg0), 82, class106.method658((byte) 73, arg0));
            class145 var4 = new class145();
            var4.field2488 = arg0;
            if (var3 != null) {
                var4.method912((byte) 20, new class226(var3));
            }
            class7.field150.method1730(var4, (long) arg0, (byte) -96);
            return arg1 >= -76 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(BI)I")
    public static final int method1150(byte arg0, int arg1) {
        ++field3080;
        if (arg0 != 93) {
            method1149(75, -70);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
    private final void method1151(boolean arg0) {
        ++field3064;
        if (!arg0) {
            int var2 = this.field3076.length;
            if (~var2 < -1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field3076[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (var4 < var2) {
                        int[] var7 = this.field3076[var4];
                        if (var4 <= 0) {
                            var8 = var7[2];
                            var9 = var7[1];
                            var10 = var7[3];
                        } else {
                            int[] var11 = this.field3076[var4 + -1];
                            int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                            int var13 = -var12 + 4096;
                            var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                            var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                            var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                        }
                    } else {
                        int[] var14 = this.field3076[var2 + -1];
                        var8 = var14[2];
                        var9 = var14[1];
                        var10 = var14[3];
                    }
                    int var15 = var8 >> 4;
                    if (var15 >= 0) {
                        if (~var15 < -256) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    int var16 = var10 >> 4;
                    int var17 = var9 >> 4;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (var17 > 255) {
                        var17 = 255;
                    }
                    this.field3079[var3] = class246.method1640(class246.method1640(var17 << 16, var15 << 8), var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V")
    private final void method1152(int arg0, int arg1) {
        ++field3065;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3076 = new int[4][4];
                                this.field3076[0][3] = 0;
                                this.field3076[0][2] = 4096;
                                this.field3076[1][2] = 4096;
                                this.field3076[0][1] = 0;
                                this.field3076[0][0] = 2048;
                                this.field3076[2][2] = 4096;
                                this.field3076[1][1] = 4096;
                                this.field3076[1][0] = 2867;
                                this.field3076[2][0] = 3276;
                                this.field3076[2][1] = 4096;
                                this.field3076[3][0] = 4096;
                                this.field3076[3][2] = 0;
                                this.field3076[3][1] = 4096;
                                this.field3076[1][3] = 0;
                                this.field3076[2][3] = 0;
                                this.field3076[3][3] = 0;
                            } else {
                                this.field3076 = new int[16][4];
                                this.field3076[0][2] = 192;
                                this.field3076[1][2] = 449;
                                this.field3076[0][3] = 321;
                                this.field3076[2][2] = 690;
                                this.field3076[0][1] = 80;
                                this.field3076[1][3] = 562;
                                this.field3076[2][3] = 803;
                                this.field3076[3][2] = 995;
                                this.field3076[1][1] = 321;
                                this.field3076[0][0] = 0;
                                this.field3076[3][3] = 1140;
                                this.field3076[2][1] = 578;
                                this.field3076[3][1] = 947;
                                this.field3076[1][0] = 155;
                                this.field3076[4][2] = 1397;
                                this.field3076[2][0] = 389;
                                this.field3076[4][3] = 1509;
                                this.field3076[5][3] = 1413;
                                this.field3076[3][0] = 671;
                                this.field3076[4][1] = 1285;
                                this.field3076[4][0] = 897;
                                this.field3076[5][0] = 1175;
                                this.field3076[5][1] = 1525;
                                this.field3076[6][3] = 1333;
                                this.field3076[7][3] = 1702;
                                this.field3076[5][2] = 1429;
                                this.field3076[8][3] = 2056;
                                this.field3076[6][1] = 1734;
                                this.field3076[7][1] = 1413;
                                this.field3076[6][2] = 1461;
                                this.field3076[9][3] = 2666;
                                this.field3076[6][0] = 1368;
                                this.field3076[7][0] = 1507;
                                this.field3076[8][0] = 1736;
                                this.field3076[7][2] = 1525;
                                this.field3076[8][2] = 1590;
                                this.field3076[9][2] = 2056;
                                this.field3076[10][2] = 2586;
                                this.field3076[8][1] = 1108;
                                this.field3076[9][0] = 2088;
                                this.field3076[11][2] = 3148;
                                this.field3076[10][3] = 3276;
                                this.field3076[12][2] = 3710;
                                this.field3076[13][2] = 3421;
                                this.field3076[11][3] = 3228;
                                this.field3076[9][1] = 1766;
                                this.field3076[10][0] = 2355;
                                this.field3076[14][2] = 3148;
                                this.field3076[10][1] = 2409;
                                this.field3076[12][3] = 3196;
                                this.field3076[11][0] = 2691;
                                this.field3076[12][0] = 3031;
                                this.field3076[11][1] = 3116;
                                this.field3076[13][3] = 3019;
                                this.field3076[12][1] = 3806;
                                this.field3076[13][1] = 3437;
                                this.field3076[14][1] = 3116;
                                this.field3076[14][3] = 3228;
                                this.field3076[15][1] = 2377;
                                this.field3076[15][2] = 2505;
                                this.field3076[15][3] = 2746;
                                this.field3076[13][0] = 3522;
                                this.field3076[14][0] = 3727;
                                this.field3076[15][0] = 4096;
                            }
                        } else {
                            this.field3076 = new int[6][4];
                            this.field3076[0][3] = 0;
                            this.field3076[1][3] = 1493;
                            this.field3076[0][0] = 0;
                            this.field3076[1][0] = 1843;
                            this.field3076[2][0] = 2457;
                            this.field3076[2][3] = 2939;
                            this.field3076[0][1] = 0;
                            this.field3076[3][3] = 3565;
                            this.field3076[3][0] = 2781;
                            this.field3076[0][2] = 0;
                            this.field3076[1][1] = 0;
                            this.field3076[1][2] = 0;
                            this.field3076[2][1] = 0;
                            this.field3076[4][0] = 3481;
                            this.field3076[4][3] = 4031;
                            this.field3076[3][1] = 0;
                            this.field3076[5][0] = 4096;
                            this.field3076[5][3] = 4096;
                            this.field3076[4][1] = 546;
                            this.field3076[2][2] = 0;
                            this.field3076[5][1] = 4096;
                            this.field3076[3][2] = 1124;
                            this.field3076[4][2] = 3084;
                            this.field3076[5][2] = 4096;
                        }
                    } else {
                        this.field3076 = new int[7][4];
                        this.field3076[0][1] = 0;
                        this.field3076[0][3] = 4096;
                        this.field3076[0][0] = 0;
                        this.field3076[1][1] = 0;
                        this.field3076[1][0] = 663;
                        this.field3076[2][1] = 0;
                        this.field3076[3][1] = 4096;
                        this.field3076[0][2] = 0;
                        this.field3076[4][1] = 4096;
                        this.field3076[2][0] = 1363;
                        this.field3076[1][2] = 4096;
                        this.field3076[2][2] = 4096;
                        this.field3076[1][3] = 4096;
                        this.field3076[2][3] = 0;
                        this.field3076[3][0] = 2048;
                        this.field3076[4][0] = 2727;
                        this.field3076[5][1] = 4096;
                        this.field3076[5][0] = 3411;
                        this.field3076[6][0] = 4096;
                        this.field3076[6][1] = 0;
                        this.field3076[3][2] = 4096;
                        this.field3076[3][3] = 0;
                        this.field3076[4][2] = 0;
                        this.field3076[4][3] = 0;
                        this.field3076[5][2] = 0;
                        this.field3076[6][2] = 0;
                        this.field3076[5][3] = 4096;
                        this.field3076[6][3] = 4096;
                    }
                } else {
                    this.field3076 = new int[8][4];
                    this.field3076[0][2] = 2602;
                    this.field3076[0][3] = 2361;
                    this.field3076[1][2] = 1799;
                    this.field3076[0][0] = 0;
                    this.field3076[0][1] = 2650;
                    this.field3076[1][1] = 2313;
                    this.field3076[1][3] = 1558;
                    this.field3076[2][1] = 2618;
                    this.field3076[3][1] = 2296;
                    this.field3076[4][1] = 2072;
                    this.field3076[5][1] = 2730;
                    this.field3076[2][2] = 1734;
                    this.field3076[2][3] = 1413;
                    this.field3076[6][1] = 2232;
                    this.field3076[3][2] = 1220;
                    this.field3076[1][0] = 2867;
                    this.field3076[4][2] = 963;
                    this.field3076[3][3] = 947;
                    this.field3076[2][0] = 3072;
                    this.field3076[4][3] = 722;
                    this.field3076[3][0] = 3276;
                    this.field3076[5][3] = 1766;
                    this.field3076[5][2] = 2152;
                    this.field3076[4][0] = 3481;
                    this.field3076[6][3] = 915;
                    this.field3076[5][0] = 3686;
                    this.field3076[7][1] = 1686;
                    this.field3076[6][0] = 3891;
                    this.field3076[6][2] = 1060;
                    this.field3076[7][2] = 1413;
                    this.field3076[7][0] = 4096;
                    this.field3076[7][3] = 1140;
                }
            } else {
                this.field3076 = new int[2][4];
                this.field3076[0][2] = 0;
                this.field3076[0][0] = 0;
                this.field3076[1][0] = 4096;
                this.field3076[0][3] = 0;
                this.field3076[1][3] = 4096;
                this.field3076[0][1] = 0;
                this.field3076[1][2] = 4096;
                this.field3076[1][1] = 4096;
            }
        }
        if (arg0 != 0) {
            method1149(94, 38);
        }
    }
}
