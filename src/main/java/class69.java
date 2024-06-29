import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class69 extends class96 {

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "[I")
    private int[] field847 = new int[257];

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "Lhb;")
    public static class250 field841 = new class250(26, 7);

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "[[I")
    private int[][] field848;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method389(int arg0, boolean arg1) {
        ++field842;
        if (arg1) {
            method392((byte) -50);
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I", line = 14)
    public final int[][] method36(int arg0, int arg1) {
        ++field845;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[] var4 = this.method657(0, arg1, -1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class269.field3403; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field847[var9];
                var5[var8] = class60.method339(var10, 16711680) >> 12;
                var6[var8] = class60.method339(65280, var10) >> 4;
                var7[var8] = class60.method339(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 64)
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V", line = 69)
    public final void method390(int arg0) {
        if (this.field848 == null) {
            this.method391(0, 1);
        }
        if (arg0 <= 15) {
            this.field848 = null;
        }
        ++field849;
        this.method395((byte) 113);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V", line = 85)
    private final void method391(int arg0, int arg1) {
        ++field839;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field848 = new int[4][4];
                                this.field848[0][2] = 4096;
                                this.field848[0][0] = 2048;
                                this.field848[0][1] = 0;
                                this.field848[0][3] = 0;
                                this.field848[1][1] = 4096;
                                this.field848[1][3] = 0;
                                this.field848[1][0] = 2867;
                                this.field848[1][2] = 4096;
                                this.field848[2][3] = 0;
                                this.field848[2][0] = 3276;
                                this.field848[2][2] = 4096;
                                this.field848[2][1] = 4096;
                                this.field848[3][0] = 4096;
                                this.field848[3][2] = 0;
                                this.field848[3][3] = 0;
                                this.field848[3][1] = 4096;
                            } else {
                                this.field848 = new int[16][4];
                                this.field848[0][0] = 0;
                                this.field848[0][1] = 80;
                                this.field848[0][2] = 192;
                                this.field848[0][3] = 321;
                                this.field848[1][3] = 562;
                                this.field848[1][2] = 449;
                                this.field848[1][1] = 321;
                                this.field848[1][0] = 155;
                                this.field848[2][0] = 389;
                                this.field848[2][1] = 578;
                                this.field848[2][3] = 803;
                                this.field848[2][2] = 690;
                                this.field848[3][2] = 995;
                                this.field848[3][3] = 1140;
                                this.field848[3][0] = 671;
                                this.field848[3][1] = 947;
                                this.field848[4][2] = 1397;
                                this.field848[4][1] = 1285;
                                this.field848[4][3] = 1509;
                                this.field848[4][0] = 897;
                                this.field848[5][1] = 1525;
                                this.field848[5][2] = 1429;
                                this.field848[5][3] = 1413;
                                this.field848[5][0] = 1175;
                                this.field848[6][1] = 1734;
                                this.field848[6][2] = 1461;
                                this.field848[6][3] = 1333;
                                this.field848[6][0] = 1368;
                                this.field848[7][0] = 1507;
                                this.field848[7][3] = 1702;
                                this.field848[7][1] = 1413;
                                this.field848[7][2] = 1525;
                                this.field848[8][1] = 1108;
                                this.field848[8][2] = 1590;
                                this.field848[8][0] = 1736;
                                this.field848[8][3] = 2056;
                                this.field848[9][0] = 2088;
                                this.field848[9][1] = 1766;
                                this.field848[9][3] = 2666;
                                this.field848[9][2] = 2056;
                                this.field848[10][0] = 2355;
                                this.field848[10][1] = 2409;
                                this.field848[10][2] = 2586;
                                this.field848[10][3] = 3276;
                                this.field848[11][2] = 3148;
                                this.field848[11][3] = 3228;
                                this.field848[11][1] = 3116;
                                this.field848[11][0] = 2691;
                                this.field848[12][3] = 3196;
                                this.field848[12][0] = 3031;
                                this.field848[12][1] = 3806;
                                this.field848[12][2] = 3710;
                                this.field848[13][3] = 3019;
                                this.field848[13][2] = 3421;
                                this.field848[13][1] = 3437;
                                this.field848[13][0] = 3522;
                                this.field848[14][0] = 3727;
                                this.field848[14][2] = 3148;
                                this.field848[14][3] = 3228;
                                this.field848[14][1] = 3116;
                                this.field848[15][0] = 4096;
                                this.field848[15][3] = 2746;
                                this.field848[15][1] = 2377;
                                this.field848[15][2] = 2505;
                            }
                        } else {
                            this.field848 = new int[6][4];
                            this.field848[0][3] = 0;
                            this.field848[0][0] = 0;
                            this.field848[0][1] = 0;
                            this.field848[0][2] = 0;
                            this.field848[1][1] = 0;
                            this.field848[1][0] = 1843;
                            this.field848[1][2] = 0;
                            this.field848[1][3] = 1493;
                            this.field848[2][2] = 0;
                            this.field848[2][1] = 0;
                            this.field848[2][0] = 2457;
                            this.field848[2][3] = 2939;
                            this.field848[3][3] = 3565;
                            this.field848[3][0] = 2781;
                            this.field848[3][1] = 0;
                            this.field848[3][2] = 1124;
                            this.field848[4][1] = 546;
                            this.field848[4][2] = 3084;
                            this.field848[4][0] = 3481;
                            this.field848[4][3] = 4031;
                            this.field848[5][0] = 4096;
                            this.field848[5][1] = 4096;
                            this.field848[5][2] = 4096;
                            this.field848[5][3] = 4096;
                        }
                    } else {
                        this.field848 = new int[7][4];
                        this.field848[0][2] = 0;
                        this.field848[0][3] = 4096;
                        this.field848[0][1] = 0;
                        this.field848[0][0] = 0;
                        this.field848[1][1] = 0;
                        this.field848[1][0] = 663;
                        this.field848[1][3] = 4096;
                        this.field848[1][2] = 4096;
                        this.field848[2][1] = 0;
                        this.field848[2][3] = 0;
                        this.field848[2][2] = 4096;
                        this.field848[2][0] = 1363;
                        this.field848[3][3] = 0;
                        this.field848[3][0] = 2048;
                        this.field848[3][2] = 4096;
                        this.field848[3][1] = 4096;
                        this.field848[4][1] = 4096;
                        this.field848[4][3] = 0;
                        this.field848[4][2] = 0;
                        this.field848[4][0] = 2727;
                        this.field848[5][3] = 4096;
                        this.field848[5][1] = 4096;
                        this.field848[5][2] = 0;
                        this.field848[5][0] = 3411;
                        this.field848[6][0] = 4096;
                        this.field848[6][1] = 0;
                        this.field848[6][2] = 0;
                        this.field848[6][3] = 4096;
                    }
                } else {
                    this.field848 = new int[8][4];
                    this.field848[0][3] = 2361;
                    this.field848[0][2] = 2602;
                    this.field848[0][0] = 0;
                    this.field848[0][1] = 2650;
                    this.field848[1][0] = 2867;
                    this.field848[1][3] = 1558;
                    this.field848[1][2] = 1799;
                    this.field848[1][1] = 2313;
                    this.field848[2][0] = 3072;
                    this.field848[2][1] = 2618;
                    this.field848[2][3] = 1413;
                    this.field848[2][2] = 1734;
                    this.field848[3][3] = 947;
                    this.field848[3][2] = 1220;
                    this.field848[3][0] = 3276;
                    this.field848[3][1] = 2296;
                    this.field848[4][0] = 3481;
                    this.field848[4][3] = 722;
                    this.field848[4][2] = 963;
                    this.field848[4][1] = 2072;
                    this.field848[5][2] = 2152;
                    this.field848[5][1] = 2730;
                    this.field848[5][3] = 1766;
                    this.field848[5][0] = 3686;
                    this.field848[6][2] = 1060;
                    this.field848[6][0] = 3891;
                    this.field848[6][1] = 2232;
                    this.field848[6][3] = 915;
                    this.field848[7][2] = 1413;
                    this.field848[7][1] = 1686;
                    this.field848[7][0] = 4096;
                    this.field848[7][3] = 1140;
                }
            } else {
                this.field848 = new int[2][4];
                this.field848[0][1] = 0;
                this.field848[0][3] = 0;
                this.field848[0][0] = 0;
                this.field848[0][2] = 0;
                this.field848[1][3] = 4096;
                this.field848[1][2] = 4096;
                this.field848[1][1] = 4096;
                this.field848[1][0] = 4096;
            }
        }
        if (arg0 != 0) {
            field841 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V", line = 337)
    public static void method392(byte arg0) {
        if (arg0 >= 50) {
            field841 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILbt;)V", line = 347)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            this.field847 = null;
        }
        ++field843;
        if (arg0 == 0) {
            int var4 = arg2.method617(2);
            if (~var4 != -1) {
                this.method391(0, var4);
            } else {
                this.field848 = new int[arg2.method617(arg1 + 3)][4];
                for (int var5 = 0; ~var5 > ~this.field848.length; ++var5) {
                    this.field848[var5][0] = arg2.method568((byte) 110);
                    this.field848[var5][1] = arg2.method617(2) << 4;
                    this.field848[var5][2] = arg2.method617(2) << 4;
                    this.field848[var5][3] = arg2.method617(2) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V", line = 386)
    public static final void method393(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = -62 % ((arg0 - -54) / 42);
        int var6 = arg3 << 3;
        int var7 = arg1 << 3;
        ++field846;
        class163.field2110 = (float) var4;
        class244.field3138 = (float) var7;
        if (~class396.field5271 == -3) {
            class74.field927 = var6;
            class261.field3319 = var7;
            class430.field5935 = var4;
        }
        class21.method153(true);
        class267.field3387 = true;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V", line = 420)
    public static final void method394(boolean arg0) {
        if (!arg0) {
            ++field844;
            if (class441.field6146.toLowerCase().indexOf("microsoft") == -1) {
                class376.field4884[59] = 57;
                class376.field4884[93] = 43;
                class376.field4884[44] = 71;
                if (class441.field6159 != null) {
                    class376.field4884[520] = 59;
                    class376.field4884[222] = 58;
                    class376.field4884[192] = 28;
                } else {
                    class376.field4884[222] = 59;
                    class376.field4884[192] = 58;
                }
                class376.field4884[46] = 72;
                class376.field4884[92] = 74;
                class376.field4884[61] = 27;
                class376.field4884[91] = 42;
                class376.field4884[45] = 26;
                class376.field4884[47] = 73;
            } else {
                class376.field4884[219] = 42;
                class376.field4884[190] = 72;
                class376.field4884[222] = 59;
                class376.field4884[220] = 74;
                class376.field4884[191] = 73;
                class376.field4884[186] = 57;
                class376.field4884[221] = 43;
                class376.field4884[192] = 58;
                class376.field4884[189] = 26;
                class376.field4884[223] = 28;
                class376.field4884[188] = 71;
                class376.field4884[187] = 27;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(B)V", line = 470)
    private final void method395(byte arg0) {
        ++field840;
        if (arg0 == 113) {
            int var2 = this.field848.length;
            if (var2 > 0) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var2 > var6 && ~var5 <= ~this.field848[var6][0]; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (var4 < var2) {
                        int[] var7 = this.field848[var4];
                        if (var4 > 0) {
                            int[] var8 = this.field848[var4 + -1];
                            int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                            var12 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                            var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                        } else {
                            var11 = var7[1];
                            var13 = var7[2];
                            var12 = var7[3];
                        }
                    } else {
                        int[] var14 = this.field848[var2 + -1];
                        var11 = var14[1];
                        var12 = var14[3];
                        var13 = var14[2];
                    }
                    int var15 = var11 >> 4;
                    int var16 = var13 >> 4;
                    int var17 = var12 >> 4;
                    if (~var17 > -1) {
                        var17 = 0;
                    } else if (~var17 < -256) {
                        var17 = 255;
                    }
                    if (~var15 <= -1) {
                        if (var15 > 255) {
                            var15 = 255;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 >= 0) {
                        if (var16 > 255) {
                            var16 = 255;
                        }
                    } else {
                        var16 = 0;
                    }
                    this.field847[var3] = class31.method213(class31.method213(var15 << 16, var16 << 8), var17);
                }
            }
        }
    }
}
