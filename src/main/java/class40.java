import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class40 extends class441 implements class56 {

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "Lrg;")
    public class381 field601;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "Z")
    private boolean field607;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "[I")
    public static int[] field611 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "[C")
    public static char[] field608 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "[S")
    public static short[] field605 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "Z")
    public static boolean field620 = false;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    public static int field619 = -1;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "Lir;")
    public static class185 field613;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "Lf;")
    public static class32 field602;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILtj;)V")
    public final void method111(int arg0, class298 arg1) {
        ++field618;
        if (arg0 <= -68) {
            this.field601.method2485(arg1, 126);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
    public final int method122(byte arg0) {
        ++field615;
        if (arg0 >= -103) {
            this.method118((class298) null, 22);
        }
        return this.field601.field5589;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(ILtj;)V")
    public final void method108(int arg0, class298 arg1) {
        if (arg0 > -8) {
            field611 = null;
        }
        ++field614;
        this.field601.method2478(-18021, arg1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLtj;)V")
    public final void method126(byte arg0, class298 arg1) {
        if (arg0 != 50) {
            field608 = null;
        }
        ++field604;
        class257 var3 = this.field601.method2477(true, arg1, super.field6386, true, super.field6395, -31, 131072);
        if (var3 != null) {
            this.field601.method2484(super.field6386 >> 7, false, arg1, var3, super.field6395 >> 7, super.field6395 >> 7, 5915, super.field6386 >> 7);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
    public final void method124(int arg0) {
        ++field617;
        if (arg0 < 26) {
            field620 = true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 > -112) {
            field613 = null;
        }
        ++field597;
        return this.field601.method2482(true);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        if (arg0 != 28024) {
            this.method111(29, (class298) null);
        }
        ++field599;
        return this.field601.field5582;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILtj;II)Z")
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        ++field596;
        class257 var5 = this.field601.method2477(false, arg1, super.field6386, false, super.field6395, 120, 65536);
        if (var5 == null) {
            return false;
        } else {
            class118 var6 = arg1.method519();
            if (arg3 != 0) {
                return false;
            } else {
                var6.method274(super.field6386, super.field6393, super.field6395);
                return var5.method1698(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ltj;I)Lri;")
    public final class372 method118(class298 arg0, int arg1) {
        if (arg1 != 18630) {
            field603 = 68;
        }
        ++field600;
        class257 var3 = this.field601.method2477(false, arg0, super.field6386, true, super.field6395, arg1 + -18522, 1024);
        if (var3 == null) {
            return null;
        } else {
            class118 var4 = arg0.method519();
            var4.method274(super.field6386, super.field6393, super.field6395);
            class372 var5 = null;
            if (this.field607) {
                var5 = class384.method2492(1, (byte) 126);
            }
            if (this.field601.field5588 != null) {
                class305 var6 = this.field601.field5588.method2597();
                arg0.method453(var3, var6, var4, var5 == null ? null : var5.field5481[0], 0);
            } else {
                var3.method1661(var4, var5 != null ? var5.field5481[0] : null, 0);
            }
            this.field601.method2484(super.field6386 >> 7, true, arg0, var3, super.field6395 >> 7, super.field6395 >> 7, arg1 ^ 24541, super.field6386 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 != 2) {
            field603 = -18;
        }
        ++field598;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
    public final int method116(int arg0) {
        ++field609;
        if (arg0 != 24186) {
            this.field601 = null;
        }
        return this.field601.field5562;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILtj;BIZLkm;I)V")
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        ++field610;
        int var8 = -94 / ((arg2 - 46) / 45);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ltj;IB)Lqb;")
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        if (arg2 <= 42) {
            return null;
        } else {
            ++field606;
            return this.field601.method2477(false, arg0, 0, false, 0, -71, arg1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ltj;BILsj;I)V")
    public static final void method296(class298 arg0, byte arg1, int arg2, class248 arg3, int arg4) {
        int var5 = 106 % ((arg1 - -34) / 59);
        if (arg3.field3555 != 2) {
            if (~arg3.field3555 == -6) {
                boolean var6 = class3.method16(arg3.field3538, -16777216 | arg3.field3587, -61, !arg3.field3609 ? null : class383.field5609.field4644, arg3.field3608, arg0, arg3.field3542, arg3.field3494) == null;
                if (var6) {
                    class441.field6392.method1560(-110, new class228(arg3.field3494, arg3.field3538, arg3.field3542, arg3.field3587 | -16777216, arg3.field3608, arg3.field3609));
                }
            }
        } else {
            for (int var7 = arg4; var7 <= arg2; ++var7) {
                int var8 = arg3.field3651[var7] + -1;
                if (var8 != -1) {
                    if (~class117.field1526 == -2 && class211.field2863 == var7 && ~class204.field2818 == ~arg3.field3636) {
                        boolean var9 = class3.method16(arg3.field3495[var7], 0, -61, (class436) null, arg3.field3608, arg0, 2, var8) == null;
                        if (var9) {
                            class441.field6392.method1560(-127, new class228(var8, arg3.field3495[var7], 2, 0, arg3.field3608, false));
                        }
                    } else {
                        boolean var10 = class3.method16(arg3.field3495[var7], -13623264, -118, (class436) null, arg3.field3608, arg0, 1, var8) == null;
                        if (var10) {
                            class441.field6392.method1560(-108, new class228(var8, arg3.field3495[var7], 1, -13623264, arg3.field3608, false));
                        }
                    }
                }
            }
        }
        ++field616;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
    public static void method297(int arg0) {
        if (arg0 != 1) {
            field619 = 66;
        }
        field602 = null;
        field613 = null;
        field611 = null;
        field605 = null;
        field608 = null;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field612;
        return arg0 <= 119;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIIZI)V")
    public class40(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field2895, arg1.field2909);
        this.field601 = new class381(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field607 = ~arg1.field2932 != -1;
    }
}
