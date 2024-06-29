import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class166 extends class154 {

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "[I")
    private int[] field2757 = new int[257];

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "[I")
    public static int[] field2753 = new int[2000];

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lpa;")
    public static class140 field2750 = new class140(32);

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "[I")
    public static int[] field2761 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    public static int field2760 = 0;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "[[I")
    private int[][] field2758;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1115(boolean arg0) {
        field2750 = null;
        field2761 = null;
        field2753 = null;
        if (!arg0) {
            field2760 = -94;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)Lic;")
    public static final class274 method1116(int arg0, int arg1, boolean arg2) {
        ++field2755;
        class274 var3 = (class274) class66.field1055.method992((byte) 125, (long) arg0 << 32 | (long) arg1);
        if (!arg2) {
            return null;
        } else {
            if (var3 == null) {
                var3 = new class274(arg0, arg1);
                class66.field1055.method986(var3, var3.field1027, -1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            return null;
        } else {
            ++field2749;
            int[][] var3 = super.field2585.method1532(arg1, -21);
            if (super.field2585.field3761) {
                int[] var4 = this.method1052(0, arg1, (byte) -46);
                int[] var5 = var3[2];
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                for (int var8 = 0; var8 < class227.field3898; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field2757[var9];
                    var6[var8] = class96.method626(16711680, var10) >> 12;
                    var7[var8] = class96.method626(var10, 65280) >> 4;
                    var5[var8] = class96.method626(4080, var10 << 4);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            method1115(true);
        }
        ++field2759;
        if (arg2 == 0) {
            int var4 = arg0.method1268(arg1 + 14270);
            if (~var4 != -1) {
                this.method1117(-128, var4);
            } else {
                this.field2758 = new int[arg0.method1268(255)][4];
                for (int var5 = 0; ~this.field2758.length < ~var5; ++var5) {
                    this.field2758[var5][0] = arg0.method1244(false);
                    this.field2758[var5][1] = arg0.method1268(255) << 4;
                    this.field2758[var5][2] = arg0.method1268(255) << 4;
                    this.field2758[var5][3] = arg0.method1268(255) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
    private final void method1117(int arg0, int arg1) {
        int var3 = 40 / ((arg0 - -46) / 55);
        ++field2751;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field2758 = new int[4][4];
                                    this.field2758[0][1] = 0;
                                    this.field2758[0][2] = 4096;
                                    this.field2758[1][2] = 4096;
                                    this.field2758[0][3] = 0;
                                    this.field2758[1][3] = 0;
                                    this.field2758[2][3] = 0;
                                    this.field2758[3][3] = 0;
                                    this.field2758[0][0] = 2048;
                                    this.field2758[1][1] = 4096;
                                    this.field2758[2][2] = 4096;
                                    this.field2758[3][2] = 0;
                                    this.field2758[2][1] = 4096;
                                    this.field2758[1][0] = 2867;
                                    this.field2758[2][0] = 3276;
                                    this.field2758[3][1] = 4096;
                                    this.field2758[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2758 = new int[16][4];
                                this.field2758[0][2] = 192;
                                this.field2758[1][2] = 449;
                                this.field2758[0][0] = 0;
                                this.field2758[0][3] = 321;
                                this.field2758[2][2] = 690;
                                this.field2758[3][2] = 995;
                                this.field2758[0][1] = 80;
                                this.field2758[1][3] = 562;
                                this.field2758[4][2] = 1397;
                                this.field2758[1][0] = 155;
                                this.field2758[5][2] = 1429;
                                this.field2758[6][2] = 1461;
                                this.field2758[2][0] = 389;
                                this.field2758[7][2] = 1525;
                                this.field2758[1][1] = 321;
                                this.field2758[3][0] = 671;
                                this.field2758[2][1] = 578;
                                this.field2758[3][1] = 947;
                                this.field2758[2][3] = 803;
                                this.field2758[3][3] = 1140;
                                this.field2758[4][3] = 1509;
                                this.field2758[4][0] = 897;
                                this.field2758[5][3] = 1413;
                                this.field2758[5][0] = 1175;
                                this.field2758[6][3] = 1333;
                                this.field2758[6][0] = 1368;
                                this.field2758[4][1] = 1285;
                                this.field2758[7][3] = 1702;
                                this.field2758[7][0] = 1507;
                                this.field2758[8][0] = 1736;
                                this.field2758[9][0] = 2088;
                                this.field2758[5][1] = 1525;
                                this.field2758[8][3] = 2056;
                                this.field2758[10][0] = 2355;
                                this.field2758[6][1] = 1734;
                                this.field2758[7][1] = 1413;
                                this.field2758[11][0] = 2691;
                                this.field2758[8][1] = 1108;
                                this.field2758[9][3] = 2666;
                                this.field2758[8][2] = 1590;
                                this.field2758[12][0] = 3031;
                                this.field2758[9][2] = 2056;
                                this.field2758[13][0] = 3522;
                                this.field2758[10][2] = 2586;
                                this.field2758[9][1] = 1766;
                                this.field2758[10][1] = 2409;
                                this.field2758[14][0] = 3727;
                                this.field2758[11][1] = 3116;
                                this.field2758[15][0] = 4096;
                                this.field2758[10][3] = 3276;
                                this.field2758[11][2] = 3148;
                                this.field2758[12][2] = 3710;
                                this.field2758[13][2] = 3421;
                                this.field2758[12][1] = 3806;
                                this.field2758[11][3] = 3228;
                                this.field2758[13][1] = 3437;
                                this.field2758[12][3] = 3196;
                                this.field2758[14][2] = 3148;
                                this.field2758[13][3] = 3019;
                                this.field2758[14][3] = 3228;
                                this.field2758[14][1] = 3116;
                                this.field2758[15][1] = 2377;
                                this.field2758[15][3] = 2746;
                                this.field2758[15][2] = 2505;
                            }
                        } else {
                            this.field2758 = new int[6][4];
                            this.field2758[0][3] = 0;
                            this.field2758[0][1] = 0;
                            this.field2758[1][3] = 1493;
                            this.field2758[2][3] = 2939;
                            this.field2758[1][1] = 0;
                            this.field2758[2][1] = 0;
                            this.field2758[0][2] = 0;
                            this.field2758[3][1] = 0;
                            this.field2758[4][1] = 546;
                            this.field2758[3][3] = 3565;
                            this.field2758[5][1] = 4096;
                            this.field2758[4][3] = 4031;
                            this.field2758[1][2] = 0;
                            this.field2758[5][3] = 4096;
                            this.field2758[0][0] = 0;
                            this.field2758[2][2] = 0;
                            this.field2758[1][0] = 1843;
                            this.field2758[2][0] = 2457;
                            this.field2758[3][2] = 1124;
                            this.field2758[4][2] = 3084;
                            this.field2758[3][0] = 2781;
                            this.field2758[5][2] = 4096;
                            this.field2758[4][0] = 3481;
                            this.field2758[5][0] = 4096;
                        }
                    } else {
                        this.field2758 = new int[7][4];
                        this.field2758[0][1] = 0;
                        this.field2758[1][1] = 0;
                        this.field2758[0][3] = 4096;
                        this.field2758[2][1] = 0;
                        this.field2758[0][0] = 0;
                        this.field2758[0][2] = 0;
                        this.field2758[1][2] = 4096;
                        this.field2758[2][2] = 4096;
                        this.field2758[3][1] = 4096;
                        this.field2758[3][2] = 4096;
                        this.field2758[4][1] = 4096;
                        this.field2758[5][1] = 4096;
                        this.field2758[1][3] = 4096;
                        this.field2758[1][0] = 663;
                        this.field2758[2][3] = 0;
                        this.field2758[6][1] = 0;
                        this.field2758[4][2] = 0;
                        this.field2758[2][0] = 1363;
                        this.field2758[3][3] = 0;
                        this.field2758[4][3] = 0;
                        this.field2758[3][0] = 2048;
                        this.field2758[5][2] = 0;
                        this.field2758[4][0] = 2727;
                        this.field2758[6][2] = 0;
                        this.field2758[5][0] = 3411;
                        this.field2758[6][0] = 4096;
                        this.field2758[5][3] = 4096;
                        this.field2758[6][3] = 4096;
                    }
                } else {
                    this.field2758 = new int[8][4];
                    this.field2758[0][2] = 2602;
                    this.field2758[0][3] = 2361;
                    this.field2758[1][2] = 1799;
                    this.field2758[0][1] = 2650;
                    this.field2758[1][1] = 2313;
                    this.field2758[0][0] = 0;
                    this.field2758[1][0] = 2867;
                    this.field2758[2][2] = 1734;
                    this.field2758[2][0] = 3072;
                    this.field2758[3][0] = 3276;
                    this.field2758[1][3] = 1558;
                    this.field2758[3][2] = 1220;
                    this.field2758[2][1] = 2618;
                    this.field2758[2][3] = 1413;
                    this.field2758[3][3] = 947;
                    this.field2758[4][0] = 3481;
                    this.field2758[4][2] = 963;
                    this.field2758[5][2] = 2152;
                    this.field2758[5][0] = 3686;
                    this.field2758[3][1] = 2296;
                    this.field2758[4][1] = 2072;
                    this.field2758[5][1] = 2730;
                    this.field2758[6][0] = 3891;
                    this.field2758[7][0] = 4096;
                    this.field2758[6][2] = 1060;
                    this.field2758[6][1] = 2232;
                    this.field2758[7][2] = 1413;
                    this.field2758[4][3] = 722;
                    this.field2758[5][3] = 1766;
                    this.field2758[7][1] = 1686;
                    this.field2758[6][3] = 915;
                    this.field2758[7][3] = 1140;
                }
            } else {
                this.field2758 = new int[2][4];
                this.field2758[0][2] = 0;
                this.field2758[0][3] = 0;
                this.field2758[1][3] = 4096;
                this.field2758[1][2] = 4096;
                this.field2758[0][0] = 0;
                this.field2758[0][1] = 0;
                this.field2758[1][0] = 4096;
                this.field2758[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1118(String arg0, int arg1) {
        int var2 = arg0.indexOf("%0a");
        if (arg1 != 2) {
            field2750 = null;
        }
        while (~var2 != 0) {
            arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
            var2 = arg0.indexOf("%0a", var2);
        }
        ++field2756;
        System.out.println("Error: " + arg0);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    private final void method1119(boolean arg0) {
        ++field2754;
        if (arg0) {
            this.method1119(false);
        }
        int var2 = this.field2758.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var2 > var6 && var4 >= this.field2758[var6][0]; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (~var5 > ~var2) {
                    int[] var7 = this.field2758[var5];
                    if (var5 <= 0) {
                        var8 = var7[3];
                        var9 = var7[2];
                        var10 = var7[1];
                    } else {
                        int[] var11 = this.field2758[var5 + -1];
                        int var12 = (-var11[0] + var4 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                        var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                    }
                } else {
                    int[] var14 = this.field2758[var2 + -1];
                    var10 = var14[1];
                    var9 = var14[2];
                    var8 = var14[3];
                }
                int var15 = var8 >> 4;
                int var16 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (~var16 <= -1) {
                    if (var16 > 255) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var10 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field2757[var3] = class94.method617(var15, class94.method617(var16 << 8, var17 << 16));
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field2752;
        if (this.field2758 == null) {
            this.method1117(118, 1);
        }
        this.method1119(false);
        if (arg0 != -9) {
            this.field2757 = null;
        }
    }
}
