import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class235 extends class205 {

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    private int field4380 = 8;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    private int field4384 = 1024;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field4378 = 1024;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    private int field4389 = 0;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    private int field4387 = 409;

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    private int field4399 = 204;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    private int field4391 = 4;

    @OriginalMember(owner = "client!wg", name = "sb", descriptor = "I")
    private int field4400 = 81;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "Lvd;")
    public static class222 field4385 = class212.method1357("_", 10731);

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "Lvd;")
    public static class222 field4394 = class212.method1357("::qa_op_test", 10731);

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "[I")
    public static int[] field4395 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "[I")
    public static int[] field4398;

    @OriginalMember(owner = "client!wg", name = "tb", descriptor = "[I")
    private int[] field4401;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "[Lbg;")
    public static class19[] field4379;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "[[I")
    private int[][] field4383;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "[[I")
    private int[][] field4386;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field4384 = arg0.method675(2);
                                    }
                                } else {
                                    this.field4400 = arg0.method675(2);
                                }
                            } else {
                                this.field4389 = arg0.method675(2);
                            }
                        } else {
                            this.field4378 = arg0.method675(2);
                        }
                    } else {
                        this.field4399 = arg0.method675(2);
                    }
                } else {
                    this.field4387 = arg0.method675(2);
                }
            } else {
                this.field4380 = arg0.method662((byte) -127);
            }
        } else {
            this.field4391 = arg0.method662((byte) -108);
        }
        ++field4382;
        int var5 = -98 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILab;)V")
    public static final void method1533(int arg0, class3 arg1) {
        if (arg0 != 8) {
            method1534(true);
        }
        class159.field3038 = arg1;
        ++field4381;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field4377;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int var4 = 0;
            int var5;
            for (var5 = class218.field4051[arg1] + this.field4389; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field4380 && this.field4401[var4] <= var5) {
                ++var4;
            }
            boolean var6 = ~(var4 & 1) == -1;
            int var7 = var4 + -1;
            int var8 = this.field4401[var4];
            int var9 = this.field4401[var4 - 1];
            if (var5 > this.field4388 + var9 && var5 < -this.field4388 + var8) {
                for (int var10 = 0; var10 < class118.field2245; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field4378 : this.field4378;
                    int var13;
                    for (var13 = (this.field4396 * var12 >> 12) + class230.field4319[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field4391 > var11 && ~var13 <= ~this.field4386[var7][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field4386[var7][var14];
                    int var16 = this.field4386[var7][var11];
                    if (var13 > this.field4388 + var15 && var13 < var16 - this.field4388) {
                        var3[var10] = this.field4383[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class163.method1027(var3, 0, class118.field2245, 0);
            }
        }
        if (arg0 != 0) {
            field4398 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
    public static void method1534(boolean arg0) {
        field4394 = null;
        field4385 = null;
        if (!arg0) {
            field4395 = null;
        }
        field4395 = null;
        field4379 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        ++field4397;
        this.method1535((byte) -89);
        if (arg0) {
            this.method2((class109) null, (byte) -5, -65);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    private final void method1535(byte arg0) {
        Random var2 = new Random((long) this.field4380);
        this.field4401 = new int[this.field4380 - -1];
        this.field4401[0] = 0;
        ++field4390;
        this.field4386 = new int[this.field4380][this.field4391 - -1];
        this.field4388 = this.field4400 / 2;
        this.field4392 = 4096 / this.field4380;
        this.field4396 = 4096 / this.field4391;
        int var3 = this.field4396 / 2;
        this.field4383 = new int[this.field4380][this.field4391];
        int var4 = this.field4392 / 2;
        for (int var5 = 0; this.field4380 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field4392;
                int var7 = (class217.method1384(Integer.MIN_VALUE, 4096, var2) - 2048) * this.field4399 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4401[var5] = this.field4401[var5 - 1] - -var8;
            }
            this.field4386[var5][0] = 0;
            for (int var9 = 0; ~this.field4391 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field4396;
                    int var11 = (class217.method1384(Integer.MIN_VALUE, 4096, var2) - 2048) * this.field4387 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4386[var5][var9] = this.field4386[var5][var9 + -1] - -var12;
                }
                this.field4383[var5][var9] = ~this.field4384 < -1 ? 4096 + -class217.method1384(Integer.MIN_VALUE, this.field4384, var2) : 4096;
            }
            this.field4386[var5][this.field4391] = 4096;
        }
        if (arg0 > -25) {
            this.method2((class109) null, (byte) 100, -110);
        }
        this.field4401[this.field4380] = 4096;
    }
}
