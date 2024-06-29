import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class180 extends class431 implements class338 {

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lid;")
    public class412 field2597;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "Z")
    private boolean field2595;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "[I")
    public static int[] field2588 = new int[1];

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "[J")
    public static long[] field2598 = new long[32];

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
    public static int[] field2600;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lqa;Lus;IIIIIZII)V", line = 3)
    public class180(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field17, arg1.field4);
        this.field2597 = new class412(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field2595 = ~arg1.field83 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 12)
    public final void method342(int arg0) {
        ++field2587;
        int var2 = -110 % ((56 - arg0) / 52);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILqa;I)Z", line = 23)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field2589;
        class121 var5 = this.field2597.method2380(false, false, arg2, super.field5893, super.field5892, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg2.method611();
            var6.method971(super.field5892, super.field5894, super.field5893);
            return var5.method847(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I", line = 48)
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            return 82;
        } else {
            ++field2601;
            return this.field2597.field5671;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)Z", line = 61)
    public final boolean method338(int arg0) {
        ++field2594;
        if (arg0 >= -8) {
            this.method127(110, -90, (class162) null, (class140) null, -11, 34, false);
        }
        return this.field2597.method2387(false);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(ILqa;)Lfm;", line = 77)
    public final class514 method339(int arg0, class162 arg1) {
        ++field2592;
        class121 var3 = this.field2597.method2380(false, true, arg1, super.field5893, super.field5892, 2048, arg0 ^ -9125);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method611();
            var4.method971(super.field5892, super.field5894, super.field5893);
            if (arg0 != 9124) {
                this.method338(115);
            }
            class514 var5 = null;
            if (this.field2595) {
                var5 = class148.method1020(0, 1);
            }
            if (this.field2597.field5691 == null) {
                var3.method853(var4, var5 == null ? null : var5.field7563[0], 0);
            } else {
                class411 var6 = this.field2597.field5691.method3100();
                arg1.method534(var3, var6, var4, var5 != null ? var5.field7563[0] : null, 0);
            }
            int var7 = super.field5892 >> 7;
            int var8 = super.field5893 >> 7;
            this.field2597.method2376(var3, arg1, var7, true, var8, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I", line = 120)
    public final int method345(int arg0) {
        ++field2593;
        if (arg0 != -1736) {
            field2600 = null;
        }
        return this.field2597.field5659;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILqa;Leq;IIZ)V", line = 132)
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            this.method334((class162) null, true);
        }
        ++field2599;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqa;I)V", line = 143)
    public final void method340(class162 arg0, int arg1) {
        if (arg1 == 20203) {
            ++field2591;
            this.field2597.method2381(arg1 + -20203, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLqa;I)Lc;", line = 155)
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        ++field2585;
        return arg0 != -102 ? null : this.field2597.method2380(false, false, arg1, 0, 0, arg2, -1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqa;Z)V", line = 166)
    public final void method334(class162 arg0, boolean arg1) {
        ++field2590;
        class121 var3 = this.field2597.method2380(true, arg1, arg0, super.field5893, super.field5892, 262144, -1);
        if (var3 != null) {
            int var4 = super.field5892 >> 7;
            int var5 = super.field5893 >> 7;
            this.field2597.method2376(var3, arg0, var4, arg1, var5, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)Z", line = 188)
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.method342(-28);
        }
        ++field2596;
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I", line = 199)
    public final int method344(int arg0) {
        ++field2583;
        return arg0 != -4534 ? 41 : this.field2597.field5667;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILqa;)V", line = 216)
    public final void method337(int arg0, class162 arg1) {
        if (arg0 == -7803) {
            this.field2597.method2379(arg1, arg0 ^ 1144);
            ++field2586;
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V", line = 227)
    public static void method1191(int arg0) {
        if (arg0 == -777598329) {
            field2600 = null;
            field2598 = null;
            field2588 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 239)
    public final void method125(boolean arg0) {
        if (arg0) {
            ++field2584;
            throw new IllegalStateException();
        }
    }
}
