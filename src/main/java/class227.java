import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class227 extends class102 {

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "[I")
    private int[] field4201 = new int[257];

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "[I")
    public static int[] field4199 = new int[50];

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "Z")
    public static boolean field4207 = false;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Lqe;")
    public static class179 field4200 = class206.method1380("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", (byte) 60);

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lqe;")
    private static class179 field4203 = class206.method1380("Discard", (byte) -3);

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field4206 = -1;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Lqe;")
    public static class179 field4195 = field4203;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lqe;")
    public static class179 field4209 = class206.method1380("Sie haben gerade eine andere Welt verlassen)3", (byte) -126);

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
    public static int[] field4204 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field4205 = -1;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lqe;")
    public static class179 field4212 = class206.method1380("(U4", (byte) -126);

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lee;")
    public static class49 field4192;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Leh;")
    public static class52 field4202;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "[[I")
    private int[][] field4210;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIB)Lae;")
    public static final class6 method1485(int arg0, int arg1, byte arg2) {
        ++field4211;
        if (arg2 < 111) {
            return null;
        } else {
            class6 var3 = class87.method580(arg1, 109);
            if (~arg0 == 0) {
                return var3;
            } else {
                return var3 != null && var3.field206 != null && ~arg0 > ~var3.field206.length ? var3.field206[arg0] : null;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (this.field4210 == null) {
            this.method1487(1, (byte) 77);
        }
        ++field4197;
        if (arg0 != 14005) {
            this.method1488(true);
        }
        this.method1488(true);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            field4212 = null;
        }
        ++field4208;
        int[][] var3 = super.field1950.method598((byte) -124, arg0);
        if (super.field1950.field1724) {
            int[] var4 = this.method679(arg0, 0, (byte) -109);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class155.field2796; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4201[var9];
                var5[var8] = class107.method696(var10, 16711680) >> 12;
                var6[var8] = class107.method696(4080, var10 >> 4);
                var7[var8] = class107.method696(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1486(int arg0) {
        field4212 = null;
        field4202 = null;
        field4200 = null;
        field4203 = null;
        field4199 = null;
        field4209 = null;
        field4204 = null;
        field4195 = null;
        int var1 = -27 / ((arg0 - -67) / 43);
        field4192 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    private final void method1487(int arg0, byte arg1) {
        ++field4198;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4210 = new int[4][4];
                                this.field4210[0][3] = 0;
                                this.field4210[0][2] = 4096;
                                this.field4210[0][1] = 0;
                                this.field4210[1][2] = 4096;
                                this.field4210[0][0] = 2048;
                                this.field4210[1][3] = 0;
                                this.field4210[2][3] = 0;
                                this.field4210[3][3] = 0;
                                this.field4210[2][2] = 4096;
                                this.field4210[1][1] = 4096;
                                this.field4210[3][2] = 0;
                                this.field4210[2][1] = 4096;
                                this.field4210[1][0] = 2867;
                                this.field4210[2][0] = 3276;
                                this.field4210[3][1] = 4096;
                                this.field4210[3][0] = 4096;
                            } else {
                                this.field4210 = new int[16][4];
                                this.field4210[0][3] = 321;
                                this.field4210[0][1] = 80;
                                this.field4210[1][3] = 562;
                                this.field4210[1][1] = 321;
                                this.field4210[0][0] = 0;
                                this.field4210[1][0] = 155;
                                this.field4210[2][3] = 803;
                                this.field4210[2][0] = 389;
                                this.field4210[3][3] = 1140;
                                this.field4210[2][1] = 578;
                                this.field4210[3][0] = 671;
                                this.field4210[3][1] = 947;
                                this.field4210[4][0] = 897;
                                this.field4210[5][0] = 1175;
                                this.field4210[4][1] = 1285;
                                this.field4210[5][1] = 1525;
                                this.field4210[4][3] = 1509;
                                this.field4210[6][0] = 1368;
                                this.field4210[6][1] = 1734;
                                this.field4210[0][2] = 192;
                                this.field4210[5][3] = 1413;
                                this.field4210[6][3] = 1333;
                                this.field4210[7][1] = 1413;
                                this.field4210[1][2] = 449;
                                this.field4210[8][1] = 1108;
                                this.field4210[9][1] = 1766;
                                this.field4210[10][1] = 2409;
                                this.field4210[7][3] = 1702;
                                this.field4210[8][3] = 2056;
                                this.field4210[2][2] = 690;
                                this.field4210[3][2] = 995;
                                this.field4210[7][0] = 1507;
                                this.field4210[11][1] = 3116;
                                this.field4210[8][0] = 1736;
                                this.field4210[9][0] = 2088;
                                this.field4210[12][1] = 3806;
                                this.field4210[10][0] = 2355;
                                this.field4210[11][0] = 2691;
                                this.field4210[13][1] = 3437;
                                this.field4210[12][0] = 3031;
                                this.field4210[13][0] = 3522;
                                this.field4210[9][3] = 2666;
                                this.field4210[4][2] = 1397;
                                this.field4210[14][0] = 3727;
                                this.field4210[14][1] = 3116;
                                this.field4210[5][2] = 1429;
                                this.field4210[6][2] = 1461;
                                this.field4210[15][1] = 2377;
                                this.field4210[10][3] = 3276;
                                this.field4210[7][2] = 1525;
                                this.field4210[15][0] = 4096;
                                this.field4210[11][3] = 3228;
                                this.field4210[12][3] = 3196;
                                this.field4210[13][3] = 3019;
                                this.field4210[8][2] = 1590;
                                this.field4210[14][3] = 3228;
                                this.field4210[15][3] = 2746;
                                this.field4210[9][2] = 2056;
                                this.field4210[10][2] = 2586;
                                this.field4210[11][2] = 3148;
                                this.field4210[12][2] = 3710;
                                this.field4210[13][2] = 3421;
                                this.field4210[14][2] = 3148;
                                this.field4210[15][2] = 2505;
                            }
                        } else {
                            this.field4210 = new int[6][4];
                            this.field4210[0][1] = 0;
                            this.field4210[0][3] = 0;
                            this.field4210[1][1] = 0;
                            this.field4210[2][1] = 0;
                            this.field4210[0][0] = 0;
                            this.field4210[1][3] = 1493;
                            this.field4210[1][0] = 1843;
                            this.field4210[2][0] = 2457;
                            this.field4210[3][1] = 0;
                            this.field4210[4][1] = 546;
                            this.field4210[3][0] = 2781;
                            this.field4210[2][3] = 2939;
                            this.field4210[4][0] = 3481;
                            this.field4210[0][2] = 0;
                            this.field4210[5][0] = 4096;
                            this.field4210[5][1] = 4096;
                            this.field4210[1][2] = 0;
                            this.field4210[2][2] = 0;
                            this.field4210[3][2] = 1124;
                            this.field4210[3][3] = 3565;
                            this.field4210[4][2] = 3084;
                            this.field4210[4][3] = 4031;
                            this.field4210[5][2] = 4096;
                            this.field4210[5][3] = 4096;
                        }
                    } else {
                        this.field4210 = new int[7][4];
                        this.field4210[0][3] = 4096;
                        this.field4210[0][0] = 0;
                        this.field4210[0][1] = 0;
                        this.field4210[1][1] = 0;
                        this.field4210[2][1] = 0;
                        this.field4210[3][1] = 4096;
                        this.field4210[4][1] = 4096;
                        this.field4210[1][0] = 663;
                        this.field4210[2][0] = 1363;
                        this.field4210[5][1] = 4096;
                        this.field4210[6][1] = 0;
                        this.field4210[1][3] = 4096;
                        this.field4210[3][0] = 2048;
                        this.field4210[4][0] = 2727;
                        this.field4210[5][0] = 3411;
                        this.field4210[6][0] = 4096;
                        this.field4210[0][2] = 0;
                        this.field4210[1][2] = 4096;
                        this.field4210[2][2] = 4096;
                        this.field4210[2][3] = 0;
                        this.field4210[3][3] = 0;
                        this.field4210[4][3] = 0;
                        this.field4210[5][3] = 4096;
                        this.field4210[6][3] = 4096;
                        this.field4210[3][2] = 4096;
                        this.field4210[4][2] = 0;
                        this.field4210[5][2] = 0;
                        this.field4210[6][2] = 0;
                    }
                } else {
                    this.field4210 = new int[8][4];
                    this.field4210[0][3] = 2361;
                    this.field4210[0][0] = 0;
                    this.field4210[1][3] = 1558;
                    this.field4210[0][2] = 2602;
                    this.field4210[1][0] = 2867;
                    this.field4210[2][0] = 3072;
                    this.field4210[2][3] = 1413;
                    this.field4210[3][3] = 947;
                    this.field4210[4][3] = 722;
                    this.field4210[1][2] = 1799;
                    this.field4210[5][3] = 1766;
                    this.field4210[0][1] = 2650;
                    this.field4210[1][1] = 2313;
                    this.field4210[2][1] = 2618;
                    this.field4210[3][1] = 2296;
                    this.field4210[3][0] = 3276;
                    this.field4210[2][2] = 1734;
                    this.field4210[3][2] = 1220;
                    this.field4210[4][0] = 3481;
                    this.field4210[4][1] = 2072;
                    this.field4210[4][2] = 963;
                    this.field4210[5][0] = 3686;
                    this.field4210[5][2] = 2152;
                    this.field4210[6][3] = 915;
                    this.field4210[6][0] = 3891;
                    this.field4210[5][1] = 2730;
                    this.field4210[7][0] = 4096;
                    this.field4210[7][3] = 1140;
                    this.field4210[6][1] = 2232;
                    this.field4210[7][1] = 1686;
                    this.field4210[6][2] = 1060;
                    this.field4210[7][2] = 1413;
                }
            } else {
                this.field4210 = new int[2][4];
                this.field4210[0][1] = 0;
                this.field4210[0][3] = 0;
                this.field4210[1][1] = 4096;
                this.field4210[0][0] = 0;
                this.field4210[0][2] = 0;
                this.field4210[1][0] = 4096;
                this.field4210[1][2] = 4096;
                this.field4210[1][3] = 4096;
            }
        }
        int var4 = -108 % ((arg1 - -6) / 60);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4196;
        if (arg2) {
            method1486(125);
        }
        if (~arg1 == -1) {
            int var4 = arg0.method1243(3);
            if (var4 != 0) {
                this.method1487(var4, (byte) -67);
            } else {
                this.field4210 = new int[arg0.method1243(3)][4];
                for (int var5 = 0; var5 < this.field4210.length; ++var5) {
                    this.field4210[var5][0] = arg0.method1252(2);
                    this.field4210[var5][1] = arg0.method1243(3) << 4;
                    this.field4210[var5][2] = arg0.method1243(3) << 4;
                    this.field4210[var5][3] = arg0.method1243(3) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    private final void method1488(boolean arg0) {
        ++field4194;
        if (arg0) {
            int var2 = this.field4210.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5 = 0;
                    for (int var6 = 0; var2 > var6 && var4 >= this.field4210[var6][0]; ++var6) {
                        ++var5;
                    }
                    int var8;
                    int var9;
                    int var10;
                    if (~var5 <= ~var2) {
                        int[] var7 = this.field4210[var2 - 1];
                        var8 = var7[2];
                        var9 = var7[3];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field4210[var5];
                        if (var5 <= 0) {
                            var9 = var11[3];
                            var10 = var11[1];
                            var8 = var11[2];
                        } else {
                            int[] var12 = this.field4210[var5 + -1];
                            int var13 = (-var12[0] + var4 << 12) / (var11[0] + -var12[0]);
                            int var14 = -var13 + 4096;
                            var8 = var11[2] * var13 - -(var12[2] * var14) >> 12;
                            var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                            var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        }
                    }
                    int var15 = var10 >> 4;
                    int var16 = var8 >> 4;
                    int var17 = var9 >> 4;
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (~var16 <= -1) {
                        if (~var16 < -256) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field4201[var3] = class125.method790(var17, class125.method790(var16 << 8, var15 << 16));
                }
            }
        }
    }
}
