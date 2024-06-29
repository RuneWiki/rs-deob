import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class214 extends class205 {

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "[I")
    private int[] field3976 = new int[257];

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lvd;")
    public static class222 field3967 = class212.method1357("lila:", 10731);

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "[Lvd;")
    public static class222[] field3966 = new class222[100];

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "[[S")
    public static short[][] field3972 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "[Lvd;")
    public static class222[] field3969 = new class222[1000];

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "[I")
    public static int[] field3982 = new int[100];

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "Lvd;")
    private static class222 field3978 = class212.method1357("Members object", 10731);

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lvd;")
    public static class222 field3971 = field3978;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "Lve;")
    public static class223 field3974;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "[[I")
    private int[][] field3968;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 <= 98) {
            this.method1367(-105, -73);
        }
        ++field3980;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[] var4 = this.method1322(arg0, (byte) 103, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class118.field2245 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3976[var9];
                var5[var8] = class139.method876(var10 >> 12, 4080);
                var6[var8] = class139.method876(var10, 65280) >> 4;
                var7[var8] = class139.method876(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3975;
        int var4 = 117 / ((arg1 - -47) / 34);
        if (arg2 == 0) {
            int var5 = arg0.method662((byte) -101);
            if (var5 != 0) {
                this.method1367(91, var5);
            } else {
                this.field3968 = new int[arg0.method662((byte) -128)][4];
                for (int var6 = 0; this.field3968.length > var6; ++var6) {
                    this.field3968[var6][0] = arg0.method675(2);
                    this.field3968[var6][1] = arg0.method662((byte) -105) << 4;
                    this.field3968[var6][2] = arg0.method662((byte) -126) << 4;
                    this.field3968[var6][3] = arg0.method662((byte) -110) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)V")
    public static void method1364(int arg0) {
        field3969 = null;
        field3982 = null;
        if (arg0 > 48) {
            field3967 = null;
            field3966 = null;
            field3972 = null;
            field3971 = null;
            field3974 = null;
            field3978 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
    public static final byte[] method1365(byte arg0, boolean arg1, Object arg2) {
        ++field3981;
        if (arg0 < 55) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return !arg1 ? var3 : class182.method1141(103, var3);
        } else if (arg2 instanceof class18) {
            class18 var4 = (class18) arg2;
            return var4.method152(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    private final void method1366(byte arg0) {
        ++field3964;
        int var2 = this.field3968.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var2 > var6 && this.field3968[var6][0] <= var4; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var2 >= ~var5) {
                    int[] var7 = this.field3968[var2 - 1];
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field3968[var5];
                    if (var5 > 0) {
                        int[] var12 = this.field3968[var5 - 1];
                        int var13 = (var4 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var10 = var11[1];
                        var9 = var11[3];
                        var8 = var11[2];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (var15 >= 0) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                if (~var17 <= -1) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field3976[var3] = class213.method1361(class213.method1361(var15 << 8, var17 << 16), var16);
            }
        }
        if (arg0 < 66) {
            field3966 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
    private final void method1367(int arg0, int arg1) {
        ++field3977;
        if (arg0 >= 77) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field3968 = new int[4][4];
                                        this.field3968[0][0] = 2048;
                                        this.field3968[0][1] = 0;
                                        this.field3968[1][1] = 4096;
                                        this.field3968[1][0] = 2867;
                                        this.field3968[2][0] = 3276;
                                        this.field3968[0][2] = 4096;
                                        this.field3968[1][2] = 4096;
                                        this.field3968[0][3] = 0;
                                        this.field3968[1][3] = 0;
                                        this.field3968[2][3] = 0;
                                        this.field3968[2][1] = 4096;
                                        this.field3968[3][3] = 0;
                                        this.field3968[3][1] = 4096;
                                        this.field3968[3][0] = 4096;
                                        this.field3968[2][2] = 4096;
                                        this.field3968[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field3968 = new int[16][4];
                                    this.field3968[0][0] = 0;
                                    this.field3968[0][2] = 192;
                                    this.field3968[1][2] = 449;
                                    this.field3968[0][3] = 321;
                                    this.field3968[1][3] = 562;
                                    this.field3968[0][1] = 80;
                                    this.field3968[1][1] = 321;
                                    this.field3968[1][0] = 155;
                                    this.field3968[2][0] = 389;
                                    this.field3968[3][0] = 671;
                                    this.field3968[2][3] = 803;
                                    this.field3968[3][3] = 1140;
                                    this.field3968[2][2] = 690;
                                    this.field3968[3][2] = 995;
                                    this.field3968[2][1] = 578;
                                    this.field3968[4][3] = 1509;
                                    this.field3968[5][3] = 1413;
                                    this.field3968[4][0] = 897;
                                    this.field3968[3][1] = 947;
                                    this.field3968[4][1] = 1285;
                                    this.field3968[5][0] = 1175;
                                    this.field3968[5][1] = 1525;
                                    this.field3968[4][2] = 1397;
                                    this.field3968[6][1] = 1734;
                                    this.field3968[5][2] = 1429;
                                    this.field3968[7][1] = 1413;
                                    this.field3968[6][2] = 1461;
                                    this.field3968[6][3] = 1333;
                                    this.field3968[8][1] = 1108;
                                    this.field3968[7][2] = 1525;
                                    this.field3968[8][2] = 1590;
                                    this.field3968[9][1] = 1766;
                                    this.field3968[9][2] = 2056;
                                    this.field3968[10][1] = 2409;
                                    this.field3968[7][3] = 1702;
                                    this.field3968[11][1] = 3116;
                                    this.field3968[12][1] = 3806;
                                    this.field3968[6][0] = 1368;
                                    this.field3968[8][3] = 2056;
                                    this.field3968[7][0] = 1507;
                                    this.field3968[13][1] = 3437;
                                    this.field3968[14][1] = 3116;
                                    this.field3968[15][1] = 2377;
                                    this.field3968[9][3] = 2666;
                                    this.field3968[8][0] = 1736;
                                    this.field3968[9][0] = 2088;
                                    this.field3968[10][2] = 2586;
                                    this.field3968[11][2] = 3148;
                                    this.field3968[10][0] = 2355;
                                    this.field3968[12][2] = 3710;
                                    this.field3968[10][3] = 3276;
                                    this.field3968[11][3] = 3228;
                                    this.field3968[11][0] = 2691;
                                    this.field3968[13][2] = 3421;
                                    this.field3968[12][0] = 3031;
                                    this.field3968[13][0] = 3522;
                                    this.field3968[14][2] = 3148;
                                    this.field3968[15][2] = 2505;
                                    this.field3968[14][0] = 3727;
                                    this.field3968[12][3] = 3196;
                                    this.field3968[15][0] = 4096;
                                    this.field3968[13][3] = 3019;
                                    this.field3968[14][3] = 3228;
                                    this.field3968[15][3] = 2746;
                                }
                            } else {
                                this.field3968 = new int[6][4];
                                this.field3968[0][3] = 0;
                                this.field3968[0][0] = 0;
                                this.field3968[0][1] = 0;
                                this.field3968[1][3] = 1493;
                                this.field3968[0][2] = 0;
                                this.field3968[1][0] = 1843;
                                this.field3968[2][0] = 2457;
                                this.field3968[1][1] = 0;
                                this.field3968[2][1] = 0;
                                this.field3968[3][0] = 2781;
                                this.field3968[3][1] = 0;
                                this.field3968[2][3] = 2939;
                                this.field3968[4][1] = 546;
                                this.field3968[3][3] = 3565;
                                this.field3968[4][0] = 3481;
                                this.field3968[4][3] = 4031;
                                this.field3968[5][3] = 4096;
                                this.field3968[5][0] = 4096;
                                this.field3968[1][2] = 0;
                                this.field3968[5][1] = 4096;
                                this.field3968[2][2] = 0;
                                this.field3968[3][2] = 1124;
                                this.field3968[4][2] = 3084;
                                this.field3968[5][2] = 4096;
                            }
                        } else {
                            this.field3968 = new int[7][4];
                            this.field3968[0][3] = 4096;
                            this.field3968[0][1] = 0;
                            this.field3968[1][1] = 0;
                            this.field3968[1][3] = 4096;
                            this.field3968[0][0] = 0;
                            this.field3968[0][2] = 0;
                            this.field3968[2][3] = 0;
                            this.field3968[1][2] = 4096;
                            this.field3968[1][0] = 663;
                            this.field3968[2][2] = 4096;
                            this.field3968[2][1] = 0;
                            this.field3968[3][1] = 4096;
                            this.field3968[3][3] = 0;
                            this.field3968[4][1] = 4096;
                            this.field3968[3][2] = 4096;
                            this.field3968[4][2] = 0;
                            this.field3968[2][0] = 1363;
                            this.field3968[5][1] = 4096;
                            this.field3968[6][1] = 0;
                            this.field3968[4][3] = 0;
                            this.field3968[5][2] = 0;
                            this.field3968[5][3] = 4096;
                            this.field3968[6][3] = 4096;
                            this.field3968[6][2] = 0;
                            this.field3968[3][0] = 2048;
                            this.field3968[4][0] = 2727;
                            this.field3968[5][0] = 3411;
                            this.field3968[6][0] = 4096;
                        }
                    } else {
                        this.field3968 = new int[8][4];
                        this.field3968[0][3] = 2361;
                        this.field3968[0][1] = 2650;
                        this.field3968[0][2] = 2602;
                        this.field3968[1][3] = 1558;
                        this.field3968[0][0] = 0;
                        this.field3968[1][0] = 2867;
                        this.field3968[2][0] = 3072;
                        this.field3968[3][0] = 3276;
                        this.field3968[1][1] = 2313;
                        this.field3968[2][3] = 1413;
                        this.field3968[3][3] = 947;
                        this.field3968[2][1] = 2618;
                        this.field3968[1][2] = 1799;
                        this.field3968[2][2] = 1734;
                        this.field3968[4][3] = 722;
                        this.field3968[3][1] = 2296;
                        this.field3968[4][1] = 2072;
                        this.field3968[5][3] = 1766;
                        this.field3968[5][1] = 2730;
                        this.field3968[6][1] = 2232;
                        this.field3968[4][0] = 3481;
                        this.field3968[3][2] = 1220;
                        this.field3968[5][0] = 3686;
                        this.field3968[4][2] = 963;
                        this.field3968[5][2] = 2152;
                        this.field3968[6][3] = 915;
                        this.field3968[7][1] = 1686;
                        this.field3968[7][3] = 1140;
                        this.field3968[6][2] = 1060;
                        this.field3968[7][2] = 1413;
                        this.field3968[6][0] = 3891;
                        this.field3968[7][0] = 4096;
                    }
                } else {
                    this.field3968 = new int[2][4];
                    this.field3968[0][3] = 0;
                    this.field3968[0][2] = 0;
                    this.field3968[0][1] = 0;
                    this.field3968[1][3] = 4096;
                    this.field3968[1][2] = 4096;
                    this.field3968[1][1] = 4096;
                    this.field3968[0][0] = 0;
                    this.field3968[1][0] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (this.field3968 == null) {
            this.method1367(124, 1);
        }
        this.method1366((byte) 80);
        ++field3965;
        if (arg0) {
            this.method1367(87, 39);
        }
    }
}
