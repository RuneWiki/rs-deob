import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wd")
public class class206 extends class85 {

    @OriginalMember(owner = "wd", name = "Q", descriptor = "I")
    private int field4029 = 81;

    @OriginalMember(owner = "wd", name = "V", descriptor = "I")
    private int field4034 = 1024;

    @OriginalMember(owner = "wd", name = "Z", descriptor = "I")
    private int field4038 = 204;

    @OriginalMember(owner = "wd", name = "gb", descriptor = "I")
    private int field4045 = 1024;

    @OriginalMember(owner = "wd", name = "cb", descriptor = "I")
    private int field4041 = 0;

    @OriginalMember(owner = "wd", name = "bb", descriptor = "I")
    private int field4040 = 4;

    @OriginalMember(owner = "wd", name = "pb", descriptor = "I")
    private int field4054 = 8;

    @OriginalMember(owner = "wd", name = "db", descriptor = "I")
    private int field4042 = 409;

    @OriginalMember(owner = "wd", name = "eb", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "wd", name = "jb", descriptor = "Ltf;")
    public static class181 field4048 = new class181();

    @OriginalMember(owner = "wd", name = "kb", descriptor = "[Llf;")
    public static class109[] field4049 = new class109[8];

    @OriginalMember(owner = "wd", name = "ob", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "wd", name = "R", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "wd", name = "S", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "wd", name = "T", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "wd", name = "W", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "wd", name = "X", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "wd", name = "ab", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "wd", name = "fb", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "wd", name = "hb", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "wd", name = "ib", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "wd", name = "lb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "wd", name = "nb", descriptor = "[I")
    private int[] field4052;

    @OriginalMember(owner = "wd", name = "U", descriptor = "[[I")
    private int[][] field4033;

    @OriginalMember(owner = "wd", name = "Y", descriptor = "[[I")
    private int[][] field4037;

    @OriginalMember(owner = "wd", name = "mb", descriptor = "[[[I")
    public static int[][][] field4051;

    @OriginalMember(owner = "wd", name = "c", descriptor = "(II)Llf;")
    public static final class109 method1349(int arg0, int arg1) {
        if (arg0 <= 18) {
            return null;
        } else {
            ++field4036;
            class109 var2 = class52.method345((byte) 85, arg1);
            for (int var3 = var2.method786(-30593) - 3; var3 > 0; var3 -= 3) {
                var2 = class36.method279(new class109[] { var2.method794(var3, 0, 44), class88.field1837, var2.method798(-41, var3) }, 117);
            }
            if (~var2.method786(-30593) < -10) {
                return class36.method279(new class109[] { class69.field1342, var2.method794(var2.method786(-30593) - 8, 0, 92), class14.field231, class29.field627, var2, class20.field448 }, 126);
            } else {
                return var2.method786(-30593) > 6 ? class36.method279(new class109[] { class169.field3132, var2.method794(-4 + var2.method786(-30593), 0, 44), class53.field1072, class29.field627, var2, class20.field448 }, 119) : class36.method279(new class109[] { class44.field910, var2, class72.field1402 }, 120);
            }
        }
    }

    @OriginalMember(owner = "wd", name = "a", descriptor = "(IIIIIILka;IJ)Z")
    public static final boolean method1350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class123.method881(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "wd", name = "a", descriptor = "([BIIZ)Llf;")
    public static final class109 method1351(byte[] arg0, int arg1, int arg2, boolean arg3) {
        ++field4046;
        class109 var4 = new class109();
        var4.field2182 = new byte[arg1];
        var4.field2176 = 0;
        if (arg3) {
            field4043 = 38;
        }
        for (int var5 = arg2; arg1 + arg2 > var5; ++var5) {
            if (~arg0[var5] != -1) {
                var4.field2182[var4.field2176++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "wd", name = "d", descriptor = "(B)V")
    private final void method1352(byte arg0) {
        ++field4032;
        Random var2 = new Random((long) this.field4054);
        this.field4044 = this.field4029 / 2;
        this.field4031 = 4096 / this.field4040;
        int var3 = this.field4031 / 2;
        this.field4033 = new int[this.field4054][this.field4040];
        this.field4037 = new int[this.field4054][this.field4040 + 1];
        this.field4052 = new int[this.field4054 + 1];
        this.field4047 = 4096 / this.field4054;
        int var4 = this.field4047 / 2;
        if (arg0 != -49) {
            this.field4054 = -111;
        }
        this.field4052[0] = 0;
        for (int var5 = 0; ~this.field4054 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field4047;
                int var7 = (class123.method882(4096, var2, true) - 2048) * this.field4038 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4052[var5] = this.field4052[var5 + -1] + var8;
            }
            this.field4037[var5][0] = 0;
            for (int var9 = 0; this.field4040 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field4031;
                    int var11 = (-2048 + class123.method882(4096, var2, true)) * this.field4042 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4037[var5][var9] = this.field4037[var5][var9 + -1] - -var12;
                }
                this.field4033[var5][var9] = this.field4045 <= 0 ? 4096 : 4096 - class123.method882(this.field4045, var2, true);
            }
            this.field4037[var5][this.field4040] = 4096;
        }
        this.field4052[this.field4054] = 4096;
    }

    @OriginalMember(owner = "wd", name = "e", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field4051 = null;
        field4048 = null;
        field4049 = null;
        if (arg0 >= -23) {
            field4048 = null;
        }
    }

    @OriginalMember(owner = "wd", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        this.method1352((byte) -49);
        ++field4030;
        if (arg0 != 25614) {
            method1351((byte[]) null, 86, -85, true);
        }
    }

    @OriginalMember(owner = "wd", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "wd", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 > -120) {
            this.field4034 = -17;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field4045 = arg2.method569(true);
                                    }
                                } else {
                                    this.field4029 = arg2.method569(true);
                                }
                            } else {
                                this.field4041 = arg2.method569(true);
                            }
                        } else {
                            this.field4034 = arg2.method569(true);
                        }
                    } else {
                        this.field4038 = arg2.method569(true);
                    }
                } else {
                    this.field4042 = arg2.method569(true);
                }
            } else {
                this.field4054 = arg2.method598((byte) 85);
            }
        } else {
            this.field4040 = arg2.method598((byte) 77);
        }
        ++field4039;
    }

    @OriginalMember(owner = "wd", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            this.method199(-46);
        }
        ++field4035;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int var4 = 0;
            int var5;
            for (var5 = class54.field1083[arg1] + this.field4041; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field4054 < ~var4 && var5 >= this.field4052[var4]) {
                ++var4;
            }
            float var6 = (float) this.field4052[var4 - 1];
            float var7 = (float) this.field4052[var4];
            if ((float) var5 > (float) this.field4044 + var6 && (float) var5 < var7 - (float) this.field4044) {
                for (int var8 = 0; class57.field1152 > var8; ++var8) {
                    int var9 = 0;
                    int var10 = ~(var4 % 2) == -1 ? this.field4034 : -this.field4034;
                    int var11;
                    for (var11 = (this.field4031 * var10 >> 12) + class47.field980[var8]; ~var11 > -1; var11 += 4096) {
                    }
                    while (var11 > 4096) {
                        var11 -= 4096;
                    }
                    while (var9 < this.field4040 && ~this.field4037[var4 - 1][var9] >= ~var11) {
                        ++var9;
                    }
                    float var12 = (float) this.field4037[var4 - 1][var9 + -1];
                    float var13 = (float) this.field4037[var4 + -1][var9];
                    if ((float) this.field4044 + var12 < (float) var11 && (float) var11 < (float) (-this.field4044) + var13) {
                        var3[var8] = this.field4033[var4 - 1][var9 + -1];
                    } else {
                        var3[var8] = 0;
                    }
                }
            } else {
                class122.method877(var3, 0, class57.field1152, 0);
            }
        }
        return var3;
    }
}
