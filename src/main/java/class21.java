import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class51 {

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "[Z")
    public static boolean[] field355 = new boolean[100];

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "[I")
    public static int[] field356 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Led;")
    public static class43 field363 = class191.method1219("Welt", false);

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Led;")
    public static class43 field361 = class191.method1219("mapedge", false);

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "[[S")
    public static short[][] field359 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "[I")
    public static int[] field364 = new int[100];

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "[[I")
    private int[][] field354;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field356 = null;
        }
        ++field362;
        if (~arg2 == -1) {
            int var4 = arg0.method538((byte) 114);
            if (var4 != 0) {
                this.method102(var4, arg1 + 7000);
            } else {
                this.field354 = new int[arg0.method538((byte) 105)][4];
                for (int var5 = 0; ~var5 > ~this.field354.length; ++var5) {
                    this.field354[var5][0] = arg0.method555(-1113627096);
                    this.field354[var5][1] = arg0.method538((byte) -119) << 4;
                    this.field354[var5][2] = arg0.method538((byte) -112) << 4;
                    this.field354[var5][3] = arg0.method538((byte) -110) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public static void method101(int arg0) {
        field363 = null;
        field355 = null;
        if (arg0 < 75) {
            method101(23);
        }
        field361 = null;
        field364 = null;
        field356 = null;
        field359 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
    private final void method102(int arg0, int arg1) {
        ++field365;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field354 = new int[4][4];
                                this.field354[0][3] = 0;
                                this.field354[0][1] = 0;
                                this.field354[1][3] = 0;
                                this.field354[1][1] = 4096;
                                this.field354[0][0] = 2048;
                                this.field354[2][3] = 0;
                                this.field354[1][0] = 2867;
                                this.field354[3][3] = 0;
                                this.field354[0][2] = 4096;
                                this.field354[1][2] = 4096;
                                this.field354[2][2] = 4096;
                                this.field354[2][0] = 3276;
                                this.field354[3][0] = 4096;
                                this.field354[3][2] = 0;
                                this.field354[2][1] = 4096;
                                this.field354[3][1] = 4096;
                            } else {
                                this.field354 = new int[16][4];
                                this.field354[0][3] = 321;
                                this.field354[0][1] = 80;
                                this.field354[0][0] = 0;
                                this.field354[1][1] = 321;
                                this.field354[0][2] = 192;
                                this.field354[2][1] = 578;
                                this.field354[1][3] = 562;
                                this.field354[2][3] = 803;
                                this.field354[1][0] = 155;
                                this.field354[3][1] = 947;
                                this.field354[1][2] = 449;
                                this.field354[4][1] = 1285;
                                this.field354[5][1] = 1525;
                                this.field354[6][1] = 1734;
                                this.field354[3][3] = 1140;
                                this.field354[2][2] = 690;
                                this.field354[7][1] = 1413;
                                this.field354[3][2] = 995;
                                this.field354[2][0] = 389;
                                this.field354[4][2] = 1397;
                                this.field354[4][3] = 1509;
                                this.field354[5][2] = 1429;
                                this.field354[3][0] = 671;
                                this.field354[4][0] = 897;
                                this.field354[8][1] = 1108;
                                this.field354[5][3] = 1413;
                                this.field354[6][3] = 1333;
                                this.field354[6][2] = 1461;
                                this.field354[5][0] = 1175;
                                this.field354[9][1] = 1766;
                                this.field354[7][2] = 1525;
                                this.field354[6][0] = 1368;
                                this.field354[7][3] = 1702;
                                this.field354[8][2] = 1590;
                                this.field354[8][3] = 2056;
                                this.field354[10][1] = 2409;
                                this.field354[9][2] = 2056;
                                this.field354[11][1] = 3116;
                                this.field354[10][2] = 2586;
                                this.field354[11][2] = 3148;
                                this.field354[9][3] = 2666;
                                this.field354[12][2] = 3710;
                                this.field354[13][2] = 3421;
                                this.field354[14][2] = 3148;
                                this.field354[10][3] = 3276;
                                this.field354[11][3] = 3228;
                                this.field354[12][3] = 3196;
                                this.field354[13][3] = 3019;
                                this.field354[7][0] = 1507;
                                this.field354[14][3] = 3228;
                                this.field354[15][2] = 2505;
                                this.field354[12][1] = 3806;
                                this.field354[8][0] = 1736;
                                this.field354[9][0] = 2088;
                                this.field354[15][3] = 2746;
                                this.field354[10][0] = 2355;
                                this.field354[13][1] = 3437;
                                this.field354[11][0] = 2691;
                                this.field354[14][1] = 3116;
                                this.field354[12][0] = 3031;
                                this.field354[15][1] = 2377;
                                this.field354[13][0] = 3522;
                                this.field354[14][0] = 3727;
                                this.field354[15][0] = 4096;
                            }
                        } else {
                            this.field354 = new int[6][4];
                            this.field354[0][0] = 0;
                            this.field354[0][2] = 0;
                            this.field354[1][0] = 1843;
                            this.field354[0][1] = 0;
                            this.field354[2][0] = 2457;
                            this.field354[1][1] = 0;
                            this.field354[3][0] = 2781;
                            this.field354[1][2] = 0;
                            this.field354[2][1] = 0;
                            this.field354[4][0] = 3481;
                            this.field354[2][2] = 0;
                            this.field354[3][1] = 0;
                            this.field354[0][3] = 0;
                            this.field354[3][2] = 1124;
                            this.field354[4][1] = 546;
                            this.field354[5][0] = 4096;
                            this.field354[4][2] = 3084;
                            this.field354[5][1] = 4096;
                            this.field354[5][2] = 4096;
                            this.field354[1][3] = 1493;
                            this.field354[2][3] = 2939;
                            this.field354[3][3] = 3565;
                            this.field354[4][3] = 4031;
                            this.field354[5][3] = 4096;
                        }
                    } else {
                        this.field354 = new int[7][4];
                        this.field354[0][0] = 0;
                        this.field354[0][1] = 0;
                        this.field354[0][2] = 0;
                        this.field354[0][3] = 4096;
                        this.field354[1][0] = 663;
                        this.field354[1][2] = 4096;
                        this.field354[2][0] = 1363;
                        this.field354[1][1] = 0;
                        this.field354[2][2] = 4096;
                        this.field354[2][1] = 0;
                        this.field354[1][3] = 4096;
                        this.field354[3][2] = 4096;
                        this.field354[3][0] = 2048;
                        this.field354[2][3] = 0;
                        this.field354[3][3] = 0;
                        this.field354[4][0] = 2727;
                        this.field354[4][3] = 0;
                        this.field354[5][0] = 3411;
                        this.field354[4][2] = 0;
                        this.field354[6][0] = 4096;
                        this.field354[5][2] = 0;
                        this.field354[6][2] = 0;
                        this.field354[3][1] = 4096;
                        this.field354[5][3] = 4096;
                        this.field354[4][1] = 4096;
                        this.field354[6][3] = 4096;
                        this.field354[5][1] = 4096;
                        this.field354[6][1] = 0;
                    }
                } else {
                    this.field354 = new int[8][4];
                    this.field354[0][1] = 2650;
                    this.field354[0][0] = 0;
                    this.field354[0][2] = 2602;
                    this.field354[1][2] = 1799;
                    this.field354[2][2] = 1734;
                    this.field354[3][2] = 1220;
                    this.field354[1][0] = 2867;
                    this.field354[0][3] = 2361;
                    this.field354[1][3] = 1558;
                    this.field354[1][1] = 2313;
                    this.field354[2][0] = 3072;
                    this.field354[4][2] = 963;
                    this.field354[5][2] = 2152;
                    this.field354[3][0] = 3276;
                    this.field354[2][3] = 1413;
                    this.field354[2][1] = 2618;
                    this.field354[4][0] = 3481;
                    this.field354[5][0] = 3686;
                    this.field354[3][3] = 947;
                    this.field354[4][3] = 722;
                    this.field354[6][2] = 1060;
                    this.field354[3][1] = 2296;
                    this.field354[7][2] = 1413;
                    this.field354[5][3] = 1766;
                    this.field354[4][1] = 2072;
                    this.field354[6][0] = 3891;
                    this.field354[5][1] = 2730;
                    this.field354[6][3] = 915;
                    this.field354[7][0] = 4096;
                    this.field354[6][1] = 2232;
                    this.field354[7][1] = 1686;
                    this.field354[7][3] = 1140;
                }
            } else {
                this.field354 = new int[2][4];
                this.field354[0][1] = 0;
                this.field354[1][1] = 4096;
                this.field354[0][2] = 0;
                this.field354[0][0] = 0;
                this.field354[0][3] = 0;
                this.field354[1][0] = 4096;
                this.field354[1][3] = 4096;
                this.field354[1][2] = 4096;
            }
        }
        if (arg1 != 7000) {
            field361 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (this.field354 == null) {
            this.method102(1, 7000);
        }
        ++field360;
        if (arg0 >= -83) {
            field355 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            this.method24((class89) null, -82, -112);
        }
        ++field358;
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int var4 = this.field354.length;
            int[] var5 = this.method314(0, (byte) -125, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            if (~var4 < -1) {
                for (int var9 = 0; class122.field2442 > var9; ++var9) {
                    int var10 = 0;
                    int var11 = var5[var9];
                    for (int var12 = 0; var12 < var4 && this.field354[var12][0] <= var11; ++var12) {
                        ++var10;
                    }
                    if (~var10 > ~var4) {
                        int[] var13 = this.field354[var10];
                        if (~var10 < -1) {
                            int[] var14 = this.field354[var10 + -1];
                            int var15 = (-var14[0] + var11 << 12) / (var13[0] + -var14[0]);
                            int var16 = -var15 + 4096;
                            var7[var9] = var13[1] * var15 + var14[1] * var16 >> 12;
                            var6[var9] = var13[2] * var15 + var14[2] * var16 >> 12;
                            var8[var9] = var13[3] * var15 - -(var14[3] * var16) >> 12;
                        } else {
                            var7[var9] = var13[1];
                            var6[var9] = var13[2];
                            var8[var9] = var13[3];
                        }
                    } else {
                        int[] var17 = this.field354[var4 - 1];
                        var7[var9] = var17[1];
                        var6[var9] = var17[2];
                        var8[var9] = var17[3];
                    }
                }
            } else {
                for (int var18 = 0; class122.field2442 > var18; ++var18) {
                    var7[var18] = 0;
                    var6[var18] = 0;
                    var8[var18] = 0;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, false);
    }
}
