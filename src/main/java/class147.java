import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class147 extends class142 {

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "Ldd;")
    public static class34 field2812 = new class34(64);

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "Lai;")
    private static class10 field2815 = class44.method278("Please wait 5 minutes before trying again)3", 111);

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lai;")
    public static class10 field2817 = class44.method278("Lade Eingabe)2Steuerungsprogramm)3)3)3", 106);

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lai;")
    private static class10 field2818 = class44.method278("Loaded title screen", -22);

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "Lai;")
    public static class10 field2813 = field2818;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "Lai;")
    public static class10 field2814 = field2815;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
    public static int[] field2816;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "[[I")
    private int[][] field2810;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1013(Component arg0, byte arg1) {
        ++field2809;
        int var2 = 75 % ((arg1 - -46) / 38);
        Method var3 = class81.field1426;
        if (var3 != null) {
            try {
                var3.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class98.field1819);
        arg0.addFocusListener(class98.field1819);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lc;ILc;)V")
    public static final void method1014(class21 arg0, int arg1, class21 arg2) {
        int var3 = -45 / ((arg1 - 20) / 54);
        class159.field3063 = arg2;
        ++field2804;
        class201.field3942 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
    public static final void method1015(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2803;
        int var5 = 0;
        if (arg0) {
            method1019(-68);
        }
        while (~class11.field175 < ~var5) {
            if (~arg1 > ~(class67.field1176[var5] - -class70.field1201[var5]) && class67.field1176[var5] < arg1 + arg2 && class4.field32[var5] + class33.field499[var5] > arg4 && ~class33.field499[var5] > ~(arg3 + arg4)) {
                class98.field1810[var5] = true;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 > -34) {
            field2816 = null;
        }
        ++field2802;
        if (~arg1 == -1) {
            int var4 = arg0.method767(true);
            if (var4 != 0) {
                this.method1018(var4, (byte) 116);
            } else {
                this.field2810 = new int[arg0.method767(true)][4];
                for (int var5 = 0; ~var5 > ~this.field2810.length; ++var5) {
                    this.field2810[var5][0] = arg0.method762((byte) 110);
                    this.field2810[var5][1] = arg0.method767(true) << 4;
                    this.field2810[var5][2] = arg0.method767(true) << 4;
                    this.field2810[var5][3] = arg0.method767(true) << 4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field2808;
        if (this.field2810 == null) {
            this.method1018(1, (byte) 116);
        }
        if (arg0 != -1) {
            method1013((Component) null, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(Z)V")
    public static final void method1016(boolean arg0) {
        class95.field1752 = new int[33];
        class71.field1226 = new int[151];
        class135.field2526 = new int[33];
        class168.field3244 = new int[151];
        for (int var1 = 0; var1 < 33; ++var1) {
            int var6 = 0;
            int var7 = 999;
            for (int var8 = 0; ~var8 > -35; ++var8) {
                if (class101.field1905.field3338[class101.field1905.field3341 * var1 + var8] == 0) {
                    if (var7 == 999) {
                        var7 = var8;
                    }
                } else if (~var7 != -1000) {
                    var6 = var8;
                    break;
                }
            }
            class95.field1752[var1] = var7;
            class135.field2526[var1] = -var7 + var6;
        }
        if (!arg0) {
            ++field2805;
            for (int var2 = 5; ~var2 > -157; ++var2) {
                int var3 = 0;
                int var4 = 999;
                for (int var5 = 25; var5 < 172; ++var5) {
                    if (class101.field1905.field3338[class101.field1905.field3341 * var2 + var5] != 0 || var5 <= 34 && var2 <= 34) {
                        if (var4 != 999) {
                            var3 = var5;
                            break;
                        }
                    } else if (var4 == 999) {
                        var4 = var5;
                    }
                }
                class168.field3244[var2 - 5] = var4 + -25;
                class71.field1226[var2 + -5] = -var4 + var3;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lme;I)Lai;")
    public static final class10 method1017(class114 arg0, int arg1) {
        ++field2801;
        return arg1 > -53 ? null : class27.method175(32767, arg0, (byte) 60);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
    private final void method1018(int arg0, byte arg1) {
        ++field2811;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2810 = new int[4][4];
                                this.field2810[0][1] = 0;
                                this.field2810[0][2] = 4096;
                                this.field2810[0][3] = 0;
                                this.field2810[1][3] = 0;
                                this.field2810[2][3] = 0;
                                this.field2810[1][1] = 4096;
                                this.field2810[3][3] = 0;
                                this.field2810[1][2] = 4096;
                                this.field2810[0][0] = 2048;
                                this.field2810[1][0] = 2867;
                                this.field2810[2][1] = 4096;
                                this.field2810[3][1] = 4096;
                                this.field2810[2][0] = 3276;
                                this.field2810[2][2] = 4096;
                                this.field2810[3][2] = 0;
                                this.field2810[3][0] = 4096;
                            } else {
                                this.field2810 = new int[16][4];
                                this.field2810[0][2] = 192;
                                this.field2810[0][0] = 0;
                                this.field2810[0][1] = 80;
                                this.field2810[1][1] = 321;
                                this.field2810[0][3] = 321;
                                this.field2810[1][3] = 562;
                                this.field2810[1][0] = 155;
                                this.field2810[2][0] = 389;
                                this.field2810[3][0] = 671;
                                this.field2810[2][1] = 578;
                                this.field2810[3][1] = 947;
                                this.field2810[4][1] = 1285;
                                this.field2810[5][1] = 1525;
                                this.field2810[2][3] = 803;
                                this.field2810[6][1] = 1734;
                                this.field2810[7][1] = 1413;
                                this.field2810[4][0] = 897;
                                this.field2810[3][3] = 1140;
                                this.field2810[4][3] = 1509;
                                this.field2810[5][0] = 1175;
                                this.field2810[1][2] = 449;
                                this.field2810[6][0] = 1368;
                                this.field2810[2][2] = 690;
                                this.field2810[5][3] = 1413;
                                this.field2810[8][1] = 1108;
                                this.field2810[9][1] = 1766;
                                this.field2810[10][1] = 2409;
                                this.field2810[3][2] = 995;
                                this.field2810[11][1] = 3116;
                                this.field2810[12][1] = 3806;
                                this.field2810[7][0] = 1507;
                                this.field2810[4][2] = 1397;
                                this.field2810[6][3] = 1333;
                                this.field2810[13][1] = 3437;
                                this.field2810[7][3] = 1702;
                                this.field2810[14][1] = 3116;
                                this.field2810[5][2] = 1429;
                                this.field2810[8][3] = 2056;
                                this.field2810[8][0] = 1736;
                                this.field2810[6][2] = 1461;
                                this.field2810[9][3] = 2666;
                                this.field2810[7][2] = 1525;
                                this.field2810[15][1] = 2377;
                                this.field2810[9][0] = 2088;
                                this.field2810[10][0] = 2355;
                                this.field2810[10][3] = 3276;
                                this.field2810[11][0] = 2691;
                                this.field2810[12][0] = 3031;
                                this.field2810[11][3] = 3228;
                                this.field2810[12][3] = 3196;
                                this.field2810[13][0] = 3522;
                                this.field2810[8][2] = 1590;
                                this.field2810[13][3] = 3019;
                                this.field2810[14][0] = 3727;
                                this.field2810[15][0] = 4096;
                                this.field2810[9][2] = 2056;
                                this.field2810[10][2] = 2586;
                                this.field2810[14][3] = 3228;
                                this.field2810[11][2] = 3148;
                                this.field2810[15][3] = 2746;
                                this.field2810[12][2] = 3710;
                                this.field2810[13][2] = 3421;
                                this.field2810[14][2] = 3148;
                                this.field2810[15][2] = 2505;
                            }
                        } else {
                            this.field2810 = new int[6][4];
                            this.field2810[0][0] = 0;
                            this.field2810[1][0] = 1843;
                            this.field2810[2][0] = 2457;
                            this.field2810[0][3] = 0;
                            this.field2810[1][3] = 1493;
                            this.field2810[2][3] = 2939;
                            this.field2810[0][1] = 0;
                            this.field2810[3][3] = 3565;
                            this.field2810[4][3] = 4031;
                            this.field2810[0][2] = 0;
                            this.field2810[1][2] = 0;
                            this.field2810[3][0] = 2781;
                            this.field2810[1][1] = 0;
                            this.field2810[2][2] = 0;
                            this.field2810[2][1] = 0;
                            this.field2810[5][3] = 4096;
                            this.field2810[3][1] = 0;
                            this.field2810[4][0] = 3481;
                            this.field2810[3][2] = 1124;
                            this.field2810[5][0] = 4096;
                            this.field2810[4][1] = 546;
                            this.field2810[4][2] = 3084;
                            this.field2810[5][1] = 4096;
                            this.field2810[5][2] = 4096;
                        }
                    } else {
                        this.field2810 = new int[7][4];
                        this.field2810[0][1] = 0;
                        this.field2810[0][3] = 4096;
                        this.field2810[0][0] = 0;
                        this.field2810[1][3] = 4096;
                        this.field2810[1][0] = 663;
                        this.field2810[2][0] = 1363;
                        this.field2810[2][3] = 0;
                        this.field2810[3][3] = 0;
                        this.field2810[4][3] = 0;
                        this.field2810[3][0] = 2048;
                        this.field2810[4][0] = 2727;
                        this.field2810[0][2] = 0;
                        this.field2810[5][0] = 3411;
                        this.field2810[1][2] = 4096;
                        this.field2810[6][0] = 4096;
                        this.field2810[1][1] = 0;
                        this.field2810[2][1] = 0;
                        this.field2810[5][3] = 4096;
                        this.field2810[3][1] = 4096;
                        this.field2810[4][1] = 4096;
                        this.field2810[2][2] = 4096;
                        this.field2810[5][1] = 4096;
                        this.field2810[6][1] = 0;
                        this.field2810[3][2] = 4096;
                        this.field2810[4][2] = 0;
                        this.field2810[5][2] = 0;
                        this.field2810[6][2] = 0;
                        this.field2810[6][3] = 4096;
                    }
                } else {
                    this.field2810 = new int[8][4];
                    this.field2810[0][2] = 2602;
                    this.field2810[0][3] = 2361;
                    this.field2810[0][1] = 2650;
                    this.field2810[0][0] = 0;
                    this.field2810[1][1] = 2313;
                    this.field2810[1][2] = 1799;
                    this.field2810[2][1] = 2618;
                    this.field2810[1][0] = 2867;
                    this.field2810[1][3] = 1558;
                    this.field2810[2][0] = 3072;
                    this.field2810[2][2] = 1734;
                    this.field2810[2][3] = 1413;
                    this.field2810[3][1] = 2296;
                    this.field2810[4][1] = 2072;
                    this.field2810[5][1] = 2730;
                    this.field2810[6][1] = 2232;
                    this.field2810[3][3] = 947;
                    this.field2810[7][1] = 1686;
                    this.field2810[3][2] = 1220;
                    this.field2810[3][0] = 3276;
                    this.field2810[4][0] = 3481;
                    this.field2810[4][3] = 722;
                    this.field2810[4][2] = 963;
                    this.field2810[5][3] = 1766;
                    this.field2810[5][0] = 3686;
                    this.field2810[6][0] = 3891;
                    this.field2810[7][0] = 4096;
                    this.field2810[6][3] = 915;
                    this.field2810[7][3] = 1140;
                    this.field2810[5][2] = 2152;
                    this.field2810[6][2] = 1060;
                    this.field2810[7][2] = 1413;
                }
            } else {
                this.field2810 = new int[2][4];
                this.field2810[0][0] = 0;
                this.field2810[1][0] = 4096;
                this.field2810[0][2] = 0;
                this.field2810[0][3] = 0;
                this.field2810[1][3] = 4096;
                this.field2810[1][2] = 4096;
                this.field2810[0][1] = 0;
                this.field2810[1][1] = 4096;
            }
        }
        if (arg1 != 116) {
            method1014((class21) null, -128, (class21) null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            method1013((Component) null, (byte) 92);
        }
        ++field2807;
        int[][] var3 = super.field2666.method956(arg0, -107);
        if (super.field2666.field2664) {
            int var4 = this.field2810.length;
            int[] var5 = this.method963((byte) -121, 0, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~var4 >= -1) {
                for (int var9 = 0; ~var9 > ~class133.field2499; ++var9) {
                    var6[var9] = 0;
                    var7[var9] = 0;
                    var8[var9] = 0;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class133.field2499; ++var10) {
                    int var11 = var5[var10];
                    int var12 = 0;
                    for (int var13 = 0; ~var4 < ~var13 && this.field2810[var13][0] <= var11; ++var13) {
                        ++var12;
                    }
                    if (~var12 <= ~var4) {
                        int[] var14 = this.field2810[var4 - 1];
                        var6[var10] = var14[1];
                        var7[var10] = var14[2];
                        var8[var10] = var14[3];
                    } else {
                        int[] var15 = this.field2810[var12];
                        if (var12 > 0) {
                            int[] var16 = this.field2810[var12 + -1];
                            int var17 = (var11 - var16[0] << 12) / (var15[0] + -var16[0]);
                            int var18 = -var17 + 4096;
                            var6[var10] = var15[1] * var17 + var16[1] * var18 >> 12;
                            var7[var10] = var15[2] * var17 + var16[2] * var18 >> 12;
                            var8[var10] = var15[3] * var17 - -(var16[3] * var18) >> 12;
                        } else {
                            var6[var10] = var15[1];
                            var7[var10] = var15[2];
                            var8[var10] = var15[3];
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static void method1019(int arg0) {
        field2818 = null;
        field2814 = null;
        field2816 = null;
        field2817 = null;
        field2812 = null;
        field2815 = null;
        if (arg0 == 7) {
            field2813 = null;
        }
    }
}
