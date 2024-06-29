import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class153 extends class1 {

    @OriginalMember(owner = "client!oe", name = "ob", descriptor = "I")
    private int field2769 = 409;

    @OriginalMember(owner = "client!oe", name = "rb", descriptor = "I")
    private int field2772 = 1024;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    private int field2764 = 81;

    @OriginalMember(owner = "client!oe", name = "pb", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
    private int field2765 = 4;

    @OriginalMember(owner = "client!oe", name = "Hb", descriptor = "I")
    private int field2788 = 204;

    @OriginalMember(owner = "client!oe", name = "Gb", descriptor = "I")
    private int field2787 = 1024;

    @OriginalMember(owner = "client!oe", name = "Jb", descriptor = "I")
    private int field2790 = 8;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!oe", name = "wb", descriptor = "[I")
    public static int[] field2777 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!oe", name = "vb", descriptor = "Loc;")
    public static class151 field2776 = class137.method873(2, "::");

    @OriginalMember(owner = "client!oe", name = "Ab", descriptor = "Loc;")
    public static class151 field2781 = class137.method873(2, "(U0a )2 in: ");

    @OriginalMember(owner = "client!oe", name = "sb", descriptor = "[[I")
    public static int[][] field2773 = new int[104][104];

    @OriginalMember(owner = "client!oe", name = "Eb", descriptor = "Loc;")
    public static class151 field2785 = class137.method873(2, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oe", name = "tb", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!oe", name = "yb", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!oe", name = "zb", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!oe", name = "Cb", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!oe", name = "Fb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!oe", name = "Ib", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!oe", name = "Db", descriptor = "Lsd;")
    public static class192 field2784;

    @OriginalMember(owner = "client!oe", name = "xb", descriptor = "Lwd;")
    public static class232 field2778;

    @OriginalMember(owner = "client!oe", name = "Bb", descriptor = "[I")
    private int[] field2782;

    @OriginalMember(owner = "client!oe", name = "qb", descriptor = "[[I")
    private int[][] field2771;

    @OriginalMember(owner = "client!oe", name = "ub", descriptor = "[[I")
    private int[][] field2775;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.method1007((byte) -125);
        if (arg0 != 3) {
            field2781 = null;
        }
        ++field2786;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)V")
    private final void method1007(byte arg0) {
        Random var2 = new Random((long) this.field2790);
        this.field2761 = 4096 / this.field2790;
        this.field2783 = 4096 / this.field2765;
        ++field2789;
        this.field2782 = new int[this.field2790 + 1];
        this.field2779 = this.field2764 / 2;
        this.field2775 = new int[this.field2790][this.field2765];
        this.field2782[0] = 0;
        int var3 = this.field2783 / 2;
        int var4 = this.field2761 / 2;
        this.field2771 = new int[this.field2790][this.field2765 + 1];
        if (arg0 < -15) {
            for (int var5 = 0; this.field2790 > var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field2761;
                    int var7 = (-2048 + class3.method28(var2, 109, 4096)) * this.field2788 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field2782[var5] = this.field2782[var5 + -1] + var8;
                }
                this.field2771[var5][0] = 0;
                for (int var9 = 0; ~this.field2765 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field2783;
                        int var11 = (-2048 + class3.method28(var2, 84, 4096)) * this.field2769 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field2771[var5][var9] = this.field2771[var5][var9 + -1] + var12;
                    }
                    this.field2775[var5][var9] = this.field2787 > 0 ? 4096 - class3.method28(var2, 113, this.field2787) : 4096;
                }
                this.field2771[var5][this.field2765] = 4096;
            }
            this.field2782[this.field2790] = 4096;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 != 0) {
            field2784 = null;
        }
        ++field2766;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field2787 = arg2.method1490((byte) 73);
                                    }
                                } else {
                                    this.field2764 = arg2.method1490((byte) 73);
                                }
                            } else {
                                this.field2770 = arg2.method1490((byte) 73);
                            }
                        } else {
                            this.field2772 = arg2.method1490((byte) 73);
                        }
                    } else {
                        this.field2788 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field2769 = arg2.method1490((byte) 73);
                }
            } else {
                this.field2790 = arg2.method1475(255);
            }
        } else {
            this.field2765 = arg2.method1475(255);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field2768;
        int[] var3 = super.field21.method1182(arg1, arg0 + -31816);
        if (arg0 != 107) {
            method1008((byte) 9);
        }
        if (super.field21.field3388) {
            int var4 = 0;
            int var5;
            for (var5 = class23.field509[arg1] + this.field2770; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field2790 && ~this.field2782[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = (1 & var4) == 0;
            int var7 = this.field2782[var4 + -1];
            int var8 = var4 - 1;
            int var9 = this.field2782[var4];
            if (~(this.field2779 + var7) > ~var5 && ~(-this.field2779 + var9) < ~var5) {
                for (int var10 = 0; ~var10 > ~class202.field3603; ++var10) {
                    int var11 = 0;
                    int var12 = var6 ? this.field2772 : -this.field2772;
                    int var13;
                    for (var13 = (this.field2783 * var12 >> 12) + class195.field3477[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field2765 < ~var11 && var13 >= this.field2771[var8][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2771[var8][var14];
                    int var16 = this.field2771[var8][var11];
                    if (~var13 < ~(this.field2779 + var15) && var13 < -this.field2779 + var16) {
                        var3[var10] = this.field2775[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class145.method923(var3, 0, class202.field3603, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        field2776 = null;
        field2773 = null;
        field2784 = null;
        int var1 = -118 / ((arg0 - -36) / 45);
        field2781 = null;
        field2785 = null;
        field2778 = null;
        field2777 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILba;)V")
    public static final void method1009(int arg0, class13 arg1) {
        ++field2774;
        if (class233.field4295) {
            class152.method1000(81, arg1);
        } else {
            if (class112.field1987 == 1 && class2.field61 >= 715 && class209.field3677 >= 453) {
                class13.field309 = !class13.field309;
                if (!class13.field309) {
                    class189.method1168(false, class16.field363, 0, 255, class156.field2819, (byte) -105);
                } else {
                    class1.method3(false);
                }
            }
            if (class200.field3534 != 5) {
                ++class43.field882;
                if (~class200.field3534 == -11) {
                    if (class159.field2869 != 2) {
                        if (~class112.field1987 == -2) {
                            byte var2 = 5;
                            byte var3 = 100;
                            byte var4 = 35;
                            short var5 = 463;
                            if (~var2 >= ~class2.field61 && ~class2.field61 >= ~(var2 + var3) && ~class209.field3677 <= ~var5 && ~class209.field3677 >= ~(var4 + var5)) {
                                class59.method395(false);
                                return;
                            }
                        }
                        if (class206.field3656 != null) {
                            class59.method395(false);
                        }
                    }
                    int var6 = class112.field1987;
                    int var7 = class2.field61;
                    int var8 = class209.field3677;
                    if (class161.field2906 == 0) {
                        short var9 = 291;
                        short var10 = 302;
                        boolean var11 = false;
                        if (~var6 == -2 && ~(var10 + -75) >= ~var7 && ~(var10 + 75) <= ~var7 && ~(var9 + -20) >= ~var8 && ~(var9 + 20) <= ~var8) {
                            class161.field2906 = 3;
                            class103.field1860 = 0;
                        }
                        short var12 = 462;
                        if (~class115.field2052 != -1) {
                            while (class78.method504(-73)) {
                                if (class38.field782 == 84) {
                                    var11 = true;
                                    break;
                                }
                            }
                        }
                        if (var11 || ~var6 == -2 && var7 >= var12 + -75 && ~var7 >= ~(var12 - -75) && var9 - 20 <= var8 && var9 + 20 >= var8) {
                            class160.field2879 = class106.field1875;
                            class160.field2895 = class235.field4346;
                            class161.field2906 = 2;
                            class103.field1860 = 0;
                            class160.field2873 = class235.field4379;
                        }
                    } else if (~class161.field2906 == -3) {
                        short var13 = 231;
                        short var14 = 321;
                        short var15 = 302;
                        int var21 = var13 + 30;
                        if (var6 == 1 && ~(var21 + -15) >= ~var8 && var8 < var21) {
                            class103.field1860 = 0;
                        }
                        var21 += 15;
                        if (~var6 == -2 && ~var8 <= ~(var21 + -15) && var21 > var8) {
                            class103.field1860 = 1;
                        }
                        var21 += 15;
                        if (~var6 == -2 && var15 + -75 <= var7 && var15 - -75 >= var7 && ~(var14 + -20) >= ~var8 && ~(var14 - -20) <= ~var8) {
                            class160.field2899 = class160.field2899.method962(arg0 + -209).method994(arg0 ^ -316);
                            if (class160.field2899.method988(-1) == 0) {
                                class203.method1286(class90.field1654, arg0 + -28909, class235.field4343, class235.field4362);
                                return;
                            }
                            if (class160.field2871.method988(-1) == 0) {
                                class203.method1286(class20.field453, arg0 + -28909, class235.field4354, class235.field4341);
                                return;
                            }
                            class203.method1286(class141.field2564, -28588, class235.field4369, class235.field4380);
                            class137.method871(20, (byte) 120);
                            return;
                        }
                        short var16 = 462;
                        if (var6 == 1 && ~(var16 + -75) >= ~var7 && var16 + 75 >= var7 && ~(var14 + -20) >= ~var8 && ~(var14 + 20) <= ~var8) {
                            class160.field2871 = class160.field2876;
                            class161.field2906 = 0;
                            class160.field2899 = class160.field2876;
                        }
                        label215: while (true) {
                            boolean var17;
                            do {
                                while (true) {
                                    if (!class78.method504(-103)) {
                                        break label215;
                                    }
                                    var17 = false;
                                    for (int var18 = 0; ~class209.field3674.method988(-1) < ~var18; ++var18) {
                                        if (~class41.field855 == ~class209.field3674.method979(var18, (byte) -120)) {
                                            var17 = true;
                                            break;
                                        }
                                    }
                                    if (class103.field1860 != 0) {
                                        break;
                                    }
                                    if (~class38.field782 == -86 && ~class160.field2899.method988(-1) < -1) {
                                        class160.field2899 = class160.field2899.method987((byte) 118, -1 + class160.field2899.method988(-1), 0);
                                    }
                                    if (class38.field782 == 84 || class38.field782 == 80) {
                                        class103.field1860 = 1;
                                    }
                                    if (var17 && ~class160.field2899.method988(arg0 ^ -322) > -13) {
                                        class160.field2899 = class160.field2899.method968(class41.field855, 0);
                                    }
                                }
                            } while (class103.field1860 != 1);
                            if (~class38.field782 == -86 && class160.field2871.method988(arg0 ^ -322) > 0) {
                                class160.field2871 = class160.field2871.method987((byte) 122, -1 + class160.field2871.method988(-1), 0);
                            }
                            if (~class38.field782 == -85 || ~class38.field782 == -81) {
                                class103.field1860 = 0;
                            }
                            if (~class115.field2052 != -1 && ~class38.field782 == -85) {
                                class160.field2899 = class160.field2899.method962(arg0 ^ 280).method994(-123);
                                if (class160.field2899.method988(arg0 + -322) == 0) {
                                    class203.method1286(class90.field1654, arg0 + -28909, class235.field4343, class235.field4362);
                                    return;
                                }
                                if (~class160.field2871.method988(-1) == -1) {
                                    class203.method1286(class20.field453, -28588, class235.field4354, class235.field4341);
                                    return;
                                }
                                class203.method1286(class141.field2564, -28588, class235.field4369, class235.field4380);
                                class137.method871(20, (byte) 121);
                                return;
                            }
                            if (var17 && class160.field2871.method988(-1) < 20) {
                                class160.field2871 = class160.field2871.method968(class41.field855, arg0 ^ 321);
                            }
                        }
                    } else if (class161.field2906 == 3) {
                        short var19 = 382;
                        short var20 = 321;
                        if (~var6 == -2 && var19 + -75 <= var7 && var19 + 75 >= var7 && ~var8 <= ~(var20 - 20) && var20 - -20 >= var8) {
                            class161.field2906 = 0;
                        }
                    }
                    if (arg0 != 321) {
                        field2777 = null;
                    }
                }
            }
        }
    }
}
