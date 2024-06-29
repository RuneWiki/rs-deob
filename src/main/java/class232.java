import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class232 extends class40 {

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    private int field3429 = -1;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "[I")
    public static int[] field3434 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "Lbr;")
    public static class223 field3433 = null;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "[Lb;")
    public static class183[] field3436 = new class183[14];

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
    public int[] field3427;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(B)V")
    public final void method264(byte arg0) {
        super.method264(arg0);
        ++field3425;
        this.field3427 = null;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field3436 = null;
        field3433 = null;
        field3434 = null;
        if (arg0 != 16711680) {
            method1606((class108) null, (class108) null, 4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ltj;Ltj;I)V")
    public static final void method1606(class108 arg0, class108 arg1, int arg2) {
        if (arg2 != -1) {
            field3434 = null;
        }
        class216.field3121 = arg0;
        class294.field4249 = arg1;
        ++field3437;
        class108.field1404 = class216.field3121.method651(0, 3);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Z")
    public final boolean method1607(int arg0) {
        ++field3435;
        if (this.field3427 != null) {
            return true;
        } else {
            if (arg0 > -11) {
                this.field3427 = null;
            }
            if (this.field3429 >= 0) {
                class337 var2 = ~class357.field5167 <= -1 ? class337.method2225(class94.field1200, class357.field5167, this.field3429) : class337.method2217(class94.field1200, this.field3429);
                var2.method2211();
                this.field3427 = var2.method2223();
                this.field3423 = var2.field4888;
                this.field3430 = var2.field4886;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)I")
    public final int method262(byte arg0) {
        int var2 = -1 % ((arg0 - -68) / 42);
        ++field3428;
        return this.field3429;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lhl;IIII)V")
    public static final void method1608(class311 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3426;
        class3 var5 = arg0.method2093(-1498200479);
        int var6 = 16383 & arg0.field4582 - arg0.field4570.field5403;
        if (arg2 == -1) {
            if (var6 == 0 && arg0.field4559 <= 25) {
                if (!arg0.field4513 || !var5.method13(arg0.field4537, -18518)) {
                    arg0.field4537 = var5.method12(-4);
                    arg0.field4513 = ~arg0.field4537 != 0;
                }
            } else {
                if (arg3 < 0 && var5.field49 != -1) {
                    arg0.field4537 = var5.field49;
                } else if (~arg3 < -1 && var5.field63 != -1) {
                    arg0.field4537 = var5.field63;
                } else {
                    arg0.field4537 = var5.field21;
                }
                arg0.field4513 = false;
            }
        } else if (~arg0.field4569 == 0 || ~var6 > -10241 && var6 > 2048) {
            if (var6 == 0 && arg0.field4559 <= 25) {
                if (arg2 == 2 && ~var5.field23 != 0) {
                    arg0.field4537 = var5.field23;
                } else if (arg2 == 0 && var5.field59 != -1) {
                    arg0.field4537 = var5.field59;
                } else {
                    arg0.field4537 = var5.field21;
                }
                arg0.field4513 = false;
            } else {
                arg0.field4513 = false;
                if (~arg2 == -3 && var5.field23 != -1) {
                    if (~arg3 > -1 && var5.field54 != -1) {
                        arg0.field4537 = var5.field54;
                    } else if (arg3 > 0 && var5.field27 != -1) {
                        arg0.field4537 = var5.field27;
                    } else {
                        arg0.field4537 = var5.field23;
                    }
                } else if (~arg2 == -1 && var5.field59 != -1) {
                    if (~arg3 > -1 && var5.field37 != -1) {
                        arg0.field4537 = var5.field37;
                    } else if (arg3 > 0 && ~var5.field62 != 0) {
                        arg0.field4537 = var5.field62;
                    } else {
                        arg0.field4537 = var5.field59;
                    }
                } else if (~arg3 > -1 && var5.field25 != -1) {
                    arg0.field4537 = var5.field25;
                } else if (arg3 > 0 && ~var5.field41 != 0) {
                    arg0.field4537 = var5.field41;
                } else {
                    arg0.field4537 = var5.field21;
                }
            }
        } else {
            int var7 = 16383 & class118.field1606[arg1] + -arg0.field4570.field5403;
            if (arg2 == 2 && var5.field23 != -1) {
                if (~var7 < -2049 && ~var7 >= -6145 && var5.field33 != -1) {
                    arg0.field4537 = var5.field33;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field51 != -1) {
                    arg0.field4537 = var5.field51;
                } else if (~var7 < -6145 && var7 < 10240 && ~var5.field31 != 0) {
                    arg0.field4537 = var5.field31;
                } else {
                    arg0.field4537 = var5.field23;
                }
            } else if (arg2 == 0 && var5.field59 != -1) {
                if (var7 > 2048 && ~var7 >= -6145 && ~var5.field18 != 0) {
                    arg0.field4537 = var5.field18;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field66 != 0) {
                    arg0.field4537 = var5.field66;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field44 != -1) {
                    arg0.field4537 = var5.field44;
                } else {
                    arg0.field4537 = var5.field59;
                }
            } else if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field19 != 0) {
                arg0.field4537 = var5.field19;
            } else if (var7 >= 10240 && ~var7 > -14337 && var5.field17 != -1) {
                arg0.field4537 = var5.field17;
            } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field52 != 0) {
                arg0.field4537 = var5.field52;
            } else {
                arg0.field4537 = var5.field21;
            }
            arg0.field4513 = false;
        }
        if (arg4 <= 85) {
            field3436 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (~arg0 == -1) {
            this.field3429 = arg2.method798(false);
        }
        if (arg1 >= 79) {
            ++field3432;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
    public int[][] method112(int arg0, int arg1) {
        ++field3431;
        if (arg0 != 1) {
            this.method262((byte) -84);
        }
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489 && this.method1607(arg0 + -75)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3430 * (~class440.field6297 == ~this.field3423 ? arg1 : this.field3423 * arg1 / class440.field6297);
            if (~class410.field5886 != ~this.field3430) {
                for (int var8 = 0; ~var8 > ~class410.field5886; ++var8) {
                    int var9 = this.field3430 * var8 / class410.field5886;
                    int var10 = this.field3427[var7 + var9];
                    var6[var8] = class209.method1483(4080, var10 << 4);
                    var5[var8] = class209.method1483(4080, var10 >> 4);
                    var4[var8] = class209.method1483(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class410.field5886 < ~var11; ++var11) {
                    int var12 = this.field3427[var7++];
                    var6[var11] = class209.method1483(var12 << 4, 4080);
                    var5[var11] = class209.method1483(var12, 65280) >> 4;
                    var4[var11] = class209.method1483(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
