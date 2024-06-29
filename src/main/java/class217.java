import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class217 extends class34 {

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Lgf;")
    public static class26 field3338;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILpk;IB)[Lji;")
    public static final class256[] method1457(int arg0, class237 arg1, int arg2, byte arg3) {
        ++field3336;
        if (!class223.method1526(arg0, arg2, (byte) 112, arg1)) {
            return null;
        } else {
            int var4 = -69 % ((24 - arg3) / 42);
            return class59.method481(18);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            field3337 = -23;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[][] var4 = this.method231(arg1, (byte) 108, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class226.field3527; ++var8) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        ++field3333;
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILca;)Lsf;")
    public static final class169 method1458(int arg0, class54 arg1) {
        if (arg0 != 4096) {
            method1460(41);
        }
        ++field3339;
        return new class169(arg1.method457((byte) 45), arg1.method457((byte) 72), arg1.method457((byte) 65), arg1.method457((byte) 89), arg1.method408(arg0 + -4088), arg1.method408(arg0 ^ 4104), arg1.method407(255));
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)I")
    public static final int method1459(int arg0, int arg1) {
        if (arg0 != 31435) {
            return -68;
        } else {
            ++field3335;
            return arg1 >> 11 & 127;
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static void method1460(int arg0) {
        if (arg0 == 3917) {
            field3338 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class217() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILca;)V")
    public static final void method1461(int arg0, class54 arg1) {
        if (arg0 != -32223) {
            method1457(-1, (class237) null, 107, (byte) 125);
        }
        ++field3334;
        while (true) {
            while (~arg1.field848.length < ~arg1.field887) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg1.method407(arg0 + 32478) == -2) {
                    var3 = arg1.method407(arg0 + 32478);
                    var2 = true;
                    var4 = arg1.method407(arg0 + 32478);
                }
                int var5 = arg1.method407(255);
                int var6 = arg1.method407(255);
                int var7 = var5 * 64 - class141.field2029;
                int var8 = class67.field1114 - var6 * 64 + class235.field3619 + -1;
                if (var7 >= 0 && var8 + -63 >= 0 && class133.field1956 > var7 + 63 && ~var8 > ~class235.field3619) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        for (int var12 = 0; ~var12 > -65; ++var12) {
                            if (!var2 || ~var11 <= ~(var3 * 8) && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method407(arg0 + 32478);
                                if (~var13 != -1) {
                                    if ((1 & var13) == 1) {
                                        int var14 = arg1.method407(arg0 ^ -32034);
                                        if (class218.field3344[var9][var10] == null) {
                                            class218.field3344[var9][var10] = new byte[4096];
                                        }
                                        class218.field3344[var9][var10][(-var12 + 63 << 6) + var11] = (byte) var14;
                                    }
                                    if (~(2 & var13) == -3) {
                                        int var15 = arg1.method408(8);
                                        if (class208.field3119[var9][var10] == null) {
                                            class208.field3119[var9][var10] = new int[4096];
                                        }
                                        class208.field3119[var9][var10][(-var12 + 63 << 6) + var11] = var15;
                                    }
                                    if (~(4 & var13) == -5) {
                                        int var16 = arg1.method408(8);
                                        if (class122.field1815[var9][var10] == null) {
                                            class122.field1815[var9][var10] = new int[4096];
                                        }
                                        int var10000 = arg0 ^ -32209;
                                        --var16;
                                        class188 var17 = class3.method42(var10000, var16);
                                        if (var17.field2804 != null) {
                                            var17 = var17.method1253(false);
                                            if (var17 == null || var17.field2786 == -1) {
                                                continue;
                                            }
                                        }
                                        class122.field1815[var9][var10][(-var12 + 63 << 6) + var11] = var17.field2742 + 1;
                                        class268 var18 = new class268();
                                        var18.field4171 = var8;
                                        var18.field4172 = var17.field2786;
                                        var18.field4175 = var7;
                                        class212.field3211.method1881(var18, (byte) -56);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; (!var2 ? 4096 : 64) > var19; ++var19) {
                        int var20 = arg1.method407(255);
                        if (var20 != 0) {
                            if (~(var20 & 1) == -2) {
                                ++arg1.field887;
                            }
                            if ((2 & var20) == 2) {
                                arg1.field887 += 2;
                            }
                            if ((4 & var20) == 4) {
                                arg1.field887 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
