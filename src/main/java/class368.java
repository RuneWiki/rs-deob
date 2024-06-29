import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class368 extends class739 {

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    private int field4738 = 81;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    private int field4747 = 4;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    private int field4739 = 1024;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    private int field4746 = 0;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field4755 = 409;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
    private int field4756 = 8;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    private int field4752 = 1024;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    private int field4753 = 204;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "Lkg;")
    public static class275 field4744 = new class275(58, 3);

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "[I")
    public static int[] field4757 = new int[32];

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lhg;")
    public static class693 field4749 = new class693(72, 0);

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "Lfh;")
    public static class653 field4759 = new class653();

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    private int field4743;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    private int field4745;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "[I")
    private int[] field4754;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "[[I")
    private int[][] field4737;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "[[I")
    private int[][] field4758;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lrba;Z[[[BIB)Z")
    public static final boolean method2123(class435 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class678.field9476) {
            return false;
        } else {
            int var5 = arg0.field5801 >> class480.field6531;
            int var6 = var5;
            int var7 = arg0.field5797 >> class480.field6531;
            int var8 = var7;
            if (arg0 instanceof class556) {
                var6 = ((class556) arg0).field7741;
                var8 = ((class556) arg0).field7744;
                var5 = ((class556) arg0).field7734;
                var7 = ((class556) arg0).field7746;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field5793 < class29.field515 && var9 >= class278.field3507 && var9 < class483.field6670 && var10 >= class412.field5239 && var10 < class193.field2649) {
                        if ((arg2 == null || arg0.field5796 < arg3 || arg2[arg0.field5796][var9][var10] != arg4) && arg0.method914((byte) 31) && !arg0.method918(-5, class681.field9504)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class428.field5737 - 16 && var9 <= class428.field5737 + 16 && var10 >= class216.field2924 - 16 && var10 <= class216.field2924 + 16) {
                            if (class454.field6071) {
                                class160.field2211[class681.field9506++].method3454(117, arg0);
                                class681.field9506 %= class93.field1294;
                            } else {
                                arg0.method744(class681.field9504, 0);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.method2124(arg0 ^ -1448777377);
        ++field4741;
        if (arg0 != -21773) {
            field4744 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field4742;
        int[] var3 = super.field10311.method2116(arg1, (byte) 90);
        if (super.field10311.field4728) {
            int var4 = 0;
            int var5;
            for (var5 = class287.field3604[arg1] + this.field4746; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field4756 && ~var5 <= ~this.field4754[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field4754[var4];
            int var9 = this.field4754[var4 + -1];
            if (~(this.field4745 + var9) > ~var5 && var5 < -this.field4745 + var8) {
                for (int var10 = 0; ~class29.field523 < ~var10; ++var10) {
                    int var11 = var7 ? this.field4752 : -this.field4752;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field4751 * var11 >> 12) + class634.field8751[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field4747 > var12 && this.field4758[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field4758[var6][var14];
                    int var16 = this.field4758[var6][var12];
                    if (var13 > this.field4745 + var15 && ~var13 > ~(-this.field4745 + var16)) {
                        var3[var10] = this.field4737[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class135.method997(var3, 0, class29.field523, 0);
            }
        }
        if (arg0 != -23347) {
            this.method2124(-112);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
    private final void method2124(int arg0) {
        ++field4740;
        Random var2 = new Random((long) this.field4756);
        this.field4745 = this.field4738 / 2;
        this.field4743 = 4096 / this.field4756;
        this.field4751 = 4096 / this.field4747;
        if (arg0 == 1448788908) {
            int var3 = this.field4751 / 2;
            this.field4758 = new int[this.field4756][this.field4747 + 1];
            this.field4737 = new int[this.field4756][this.field4747];
            this.field4754 = new int[this.field4756 + 1];
            int var4 = this.field4743 / 2;
            this.field4754[0] = 0;
            for (int var5 = 0; var5 < this.field4756; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field4743;
                    int var7 = (-2048 + class596.method3377(4096, var2, -103)) * this.field4753 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field4754[var5] = this.field4754[var5 + -1] + var8;
                }
                this.field4758[var5][0] = 0;
                for (int var9 = 0; ~this.field4747 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field4751;
                        int var11 = (-2048 + class596.method3377(4096, var2, arg0 ^ -1448788946)) * this.field4755 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field4758[var5][var9] = this.field4758[var5][var9 + -1] + var12;
                    }
                    this.field4737[var5][var9] = this.field4739 <= 0 ? 4096 : -class596.method3377(this.field4739, var2, -104) + 4096;
                }
                this.field4758[var5][this.field4747] = 4096;
            }
            this.field4754[this.field4756] = 4096;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field4739 = arg0.method2566(-2);
                                    }
                                } else {
                                    this.field4738 = arg0.method2566(-2);
                                }
                            } else {
                                this.field4746 = arg0.method2566(-2);
                            }
                        } else {
                            this.field4752 = arg0.method2566(-2);
                        }
                    } else {
                        this.field4753 = arg0.method2566(-2);
                    }
                } else {
                    this.field4755 = arg0.method2566(-2);
                }
            } else {
                this.field4756 = arg0.method2600((byte) -128);
            }
        } else {
            this.field4747 = arg0.method2600((byte) -128);
        }
        if (arg2 != -3) {
            field4749 = null;
        }
        ++field4750;
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)V")
    public static void method2125(int arg0) {
        if (arg0 <= 95) {
            field4759 = null;
        }
        field4757 = null;
        field4744 = null;
        field4759 = null;
        field4749 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class368() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([ILrl;[II[I)V")
    public static final void method2126(int[] arg0, class724 arg1, int[] arg2, int arg3, int[] arg4) {
        for (int var5 = arg3; arg4.length > var5; ++var5) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg1.field248.length > var9; ++var9) {
                if ((1 & var7) != 0) {
                    if (~var6 != 0) {
                        class56 var10 = class66.field941.method1299((byte) -123, var6);
                        int var11 = var10.field776;
                        class571 var12 = arg1.field248[var9];
                        if (var12 != null) {
                            if (~var12.field8035 == ~var6) {
                                if (~var11 != -1) {
                                    if (~var11 != -2) {
                                        if (var11 == 2) {
                                            var12.field8030 = 0;
                                        }
                                    } else {
                                        var12.field8034 = 1;
                                        var12.field8036 = 0;
                                        var12.field8038 = var8;
                                        var12.field8030 = 0;
                                        var12.field8041 = 0;
                                        if (!arg1.field206) {
                                            class758.method4218(0, arg1, 0, var10);
                                        }
                                    }
                                } else {
                                    var12 = arg1.field248[var9] = null;
                                }
                            } else if (var10.field786 >= class66.field941.method1299((byte) -77, var12.field8035).field786) {
                                var12 = arg1.field248[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class571 var13 = arg1.field248[var9] = new class571();
                            var13.field8041 = 0;
                            var13.field8038 = var8;
                            var13.field8034 = 1;
                            var13.field8035 = var6;
                            var13.field8036 = 0;
                            var13.field8030 = 0;
                            if (!arg1.field206) {
                                class758.method4218(0, arg1, 0, var10);
                            }
                        }
                    } else {
                        arg1.field248[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field4748;
    }
}
