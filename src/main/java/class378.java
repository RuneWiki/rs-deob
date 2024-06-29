import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class378 extends class397 {

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    private int field5636 = 1024;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    private int field5640 = 1024;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    private int field5637 = 8;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    private int field5634 = 4;

    @OriginalMember(owner = "client!wm", name = "fb", descriptor = "I")
    private int field5648 = 0;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    private int field5647 = 409;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    private int field5639 = 81;

    @OriginalMember(owner = "client!wm", name = "kb", descriptor = "I")
    private int field5653 = 204;

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "Ldc;")
    public static class5 field5643 = new class5(20);

    @OriginalMember(owner = "client!wm", name = "hb", descriptor = "[I")
    public static int[] field5650 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!wm", name = "jb", descriptor = "Lgn;")
    public static class475 field5652 = new class475(62, 8);

    @OriginalMember(owner = "client!wm", name = "lb", descriptor = "Luq;")
    public static class107 field5654 = new class107();

    @OriginalMember(owner = "client!wm", name = "nb", descriptor = "Liu;")
    public static class390 field5656 = new class390(62, 6);

    @OriginalMember(owner = "client!wm", name = "pb", descriptor = "I")
    public static int field5658 = 0;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field5631;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    private int field5633;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    private int field5638;

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!wm", name = "gb", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!wm", name = "ib", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!wm", name = "mb", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!wm", name = "ob", descriptor = "Ltb;")
    public static class262 field5657;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "[I")
    private int[] field5641;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "[[I")
    private int[][] field5630;

    @OriginalMember(owner = "client!wm", name = "cb", descriptor = "[[I")
    private int[][] field5645;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 5)
    public final void method24(int arg0) {
        if (arg0 != 255) {
            this.method31(-65, -90);
        }
        ++field5649;
        this.method2285(true);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)V", line = 16)
    private final void method2285(boolean arg0) {
        if (!arg0) {
            field5657 = null;
        }
        ++field5651;
        Random var2 = new Random((long) this.field5637);
        this.field5633 = this.field5639 / 2;
        this.field5631 = 4096 / this.field5634;
        this.field5638 = 4096 / this.field5637;
        int var3 = this.field5631 / 2;
        this.field5645 = new int[this.field5637][this.field5634];
        int var4 = this.field5638 / 2;
        this.field5630 = new int[this.field5637][this.field5634 + 1];
        this.field5641 = new int[this.field5637 - -1];
        this.field5641[0] = 0;
        for (int var5 = 0; this.field5637 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field5638;
                int var7 = (-2048 + class154.method931(var2, 4096, (byte) 8)) * this.field5653 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5641[var5] = this.field5641[var5 + -1] + var8;
            }
            this.field5630[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field5634; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field5631;
                    int var11 = (class154.method931(var2, 4096, (byte) 8) - 2048) * this.field5647 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5630[var5][var9] = this.field5630[var5][var9 + -1] + var12;
                }
                this.field5645[var5][var9] = this.field5636 > 0 ? -class154.method931(var2, this.field5636, (byte) 8) + 4096 : 4096;
            }
            this.field5630[var5][this.field5634] = 4096;
        }
        this.field5641[this.field5637] = 4096;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLae;)V", line = 84)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field5642;
        if (arg1 == 80) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 != 6) {
                                        if (~arg0 == -8) {
                                            this.field5636 = arg2.method993((byte) -84);
                                        }
                                    } else {
                                        this.field5639 = arg2.method993((byte) -95);
                                    }
                                } else {
                                    this.field5648 = arg2.method993((byte) -123);
                                }
                            } else {
                                this.field5640 = arg2.method993((byte) -44);
                            }
                        } else {
                            this.field5653 = arg2.method993((byte) -59);
                        }
                    } else {
                        this.field5647 = arg2.method993((byte) -115);
                    }
                } else {
                    this.field5637 = arg2.method941((byte) 127);
                }
            } else {
                this.field5634 = arg2.method941((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 167)
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILab;Lab;)V", line = 177)
    public static final void method2286(int arg0, int arg1, int arg2, class455 arg3, class455 arg4) {
        class468 var5 = class323.method1937(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6772 = arg3;
            var5.field6777 = arg4;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V", line = 190)
    public static final void method2287(int arg0, int arg1) {
        ++field5646;
        class338 var2 = class380.method2294((byte) 87, arg0, 14);
        if (arg1 != -7261) {
            field5654 = null;
        }
        var2.method2048(-46);
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)V", line = 204)
    public static final void method2288(byte arg0) {
        ++field5629;
        int var1 = 45 % ((12 - arg0) / 35);
        if (~class362.field5446 != 0 && class72.field1058 != -1) {
            int var2 = ((-class17.field243 + class485.field7025) * class449.field6548 >> 16) + class17.field243;
            class449.field6548 += var2;
            if (class449.field6548 >= 65535) {
                if (!class492.field7516) {
                    class184.field2606 = true;
                } else {
                    class184.field2606 = false;
                }
                class449.field6548 = 65535;
                class492.field7516 = true;
            } else {
                class184.field2606 = false;
                class492.field7516 = false;
            }
            float var3 = (float) class449.field6548 / 65535.0F;
            float[] var4 = new float[3];
            int var5 = class318.field4676 * 2;
            for (int var6 = 0; ~var6 > -4; ++var6) {
                int var22 = class167.field2192[class362.field5446][var5][var6] * 3;
                int var23 = class167.field2192[class362.field5446][var5 + 1][var6] * 3;
                int var24 = (class167.field2192[class362.field5446][var5 + 2][var6] + -class167.field2192[class362.field5446][var5 + 3][var6] + class167.field2192[class362.field5446][var5 + 2][var6]) * 3;
                int var25 = class167.field2192[class362.field5446][var5][var6];
                int var26 = var23 - var22;
                int var27 = -(var23 * 2) + var22 - -var24;
                int var28 = -var25 + var23 + -var24 + class167.field2192[class362.field5446][var5 + 2][var6];
                var4[var6] = (((float) var28 * var3 + (float) var27) * var3 + (float) var26) * var3 + (float) var25;
            }
            class282.field4026 = (int) var4[2] - class223.field3158 * 128;
            class205.field2843 = (int) var4[0] + -(class455.field6637 * 128);
            class432.field6338 = (int) var4[1] * -1;
            float[] var7 = new float[3];
            int var8 = class444.field6477 * 2;
            for (int var9 = 0; ~var9 > -4; ++var9) {
                int var15 = class167.field2192[class72.field1058][var8][var9] * 3;
                int var16 = class167.field2192[class72.field1058][var8 - -1][var9] * 3;
                int var17 = (class167.field2192[class72.field1058][var8 + 2][var9] - -class167.field2192[class72.field1058][var8 - -2][var9] - class167.field2192[class72.field1058][var8 + 3][var9]) * 3;
                int var18 = class167.field2192[class72.field1058][var8][var9];
                int var19 = -var15 + var16;
                int var20 = -(var16 * 2) + var17 + var15;
                int var21 = -var18 + var16 + class167.field2192[class72.field1058][var8 + 2][var9] + -var17;
                var7[var9] = (((float) var21 * var3 + (float) var20) * var3 + (float) var19) * var3 + (float) var18;
            }
            float var10 = var7[0] + -var4[0];
            float var11 = (var7[1] + -var4[1]) * -1.0F;
            float var12 = var7[2] - var4[2];
            double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
            class317.field4653 = 16383 & (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D);
            class21.field284 = 16383 & (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
            class236.field3317 = ((class167.field2192[class362.field5446][var5 + 2][3] + -class167.field2192[class362.field5446][var5][3]) * class449.field6548 >> 16) + class167.field2192[class362.field5446][var5][3];
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILeq;III[[[BIIIII)V", line = 314)
    public static final void method2289(int arg0, int arg1, int arg2, class134 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5632;
        if (~arg10 != -1 && ~arg0 != -1) {
            if (~arg10 == -10) {
                arg10 = 1;
                arg5 = 3 & arg5 + 1;
            }
            if (arg12 != -4097) {
                method2288((byte) -50);
            }
            if (~arg10 == -11) {
                arg5 = arg5 + 3 & 3;
                arg10 = 1;
            }
            if (arg10 == 11) {
                arg10 = 8;
                arg5 = arg5 - -3 & 3;
            }
            arg3.method755(arg11, arg1, arg9, arg8, arg4, arg2, arg7[arg10 + -1][arg5], arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(B)V", line = 351)
    public static void method2290(byte arg0) {
        field5652 = null;
        field5650 = null;
        field5654 = null;
        field5643 = null;
        field5657 = null;
        if (arg0 != -82) {
            field5657 = null;
        }
        field5656 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[I", line = 376)
    public final int[] method31(int arg0, int arg1) {
        ++field5635;
        int[] var3 = super.field5854.method465(arg1, 105);
        if (super.field5854.field991) {
            int var4 = 0;
            int var5;
            for (var5 = class447.field6523[arg1] + this.field5648; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field5637 && this.field5641[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field5641[var4];
            int var9 = this.field5641[var4 + -1];
            if (var5 > var9 - -this.field5633 && ~(-this.field5633 + var8) < ~var5) {
                for (int var10 = 0; var10 < class164.field2152; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field5640 : -this.field5640;
                    int var13;
                    for (var13 = class228.field3210[var10] - -(this.field5631 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field5634 < ~var11 && ~var13 <= ~this.field5630[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field5630[var6][var14];
                    int var16 = this.field5630[var6][var11];
                    if (this.field5633 + var15 < var13 && ~(-this.field5633 + var16) < ~var13) {
                        var3[var10] = this.field5645[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class268.method1644(var3, 0, class164.field2152, 0);
            }
        }
        return arg0 != -780833076 ? null : var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIZIIZ)V", line = 484)
    public static final void method2291(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        ++field5644;
        if (arg1 > arg0) {
            int var7 = (arg0 + arg1) / 2;
            int var8 = arg0;
            class450 var9 = class345.field4994[var7];
            class345.field4994[var7] = class345.field4994[arg1];
            class345.field4994[arg1] = var9;
            for (int var10 = arg0; arg1 > var10; ++var10) {
                if (class266.method1635(var9, class345.field4994[var10], arg2, arg3, arg5 + -16777315, arg6, arg4) <= 0) {
                    class450 var11 = class345.field4994[var10];
                    class345.field4994[var10] = class345.field4994[var8];
                    class345.field4994[var8++] = var11;
                }
            }
            class345.field4994[arg1] = class345.field4994[var8];
            class345.field4994[var8] = var9;
            method2291(arg0, var8 + -1, arg2, arg3, arg4, 99, arg6);
            method2291(var8 + 1, arg1, arg2, arg3, arg4, 99, arg6);
        }
        if (arg5 != 99) {
            field5650 = null;
        }
    }
}
