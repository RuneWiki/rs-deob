import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class327 extends class210 implements class425 {

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "Ljp;")
    public class239 field4957;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Z")
    private boolean field4962;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field4949 = 1;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Z")
    public static boolean field4948 = true;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field4958 = 765;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Ls;")
    public static class186 field4953 = new class186(53, 14);

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Lhr;")
    public static class368 field4966 = new class368();

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "Lbj;")
    public static class162 field4968 = new class162(2, 8);

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "[I")
    public static int[] field4969 = new int[25];

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)V")
    public static void method2072(int arg0) {
        field4953 = null;
        field4968 = null;
        if (arg0 == 8) {
            field4966 = null;
            field4969 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        if (arg0 == -4715) {
            ++field4947;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Z")
    public final boolean method228(int arg0) {
        if (arg0 != 1396) {
            field4969 = null;
        }
        ++field4963;
        return this.field4957.method1563(1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLza;II)Z")
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field4954;
        class374 var5 = this.field4957.method1559(super.field3347, super.field3344, 131072, -12, arg1, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            class124 var6 = arg1.method364();
            var6.method835(super.field3359 + super.field3347, super.field3345, super.field3352 + super.field3344);
            return var5.method763(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lza;I)V")
    public final void method233(class288 arg0, int arg1) {
        ++field4946;
        this.field4957.method1564((byte) -124, arg0);
        if (arg1 != 13367) {
            field4968 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
    public final int method227(byte arg0) {
        ++field4950;
        if (arg0 != -104) {
            this.method231(36);
        }
        return this.field4957.method1568((byte) -50);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)I")
    public final int method225(boolean arg0) {
        if (arg0) {
            field4953 = null;
        }
        ++field4961;
        return this.field4957.field3711;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lza;Ljc;IIIIIZIIIIII)V")
    public class327(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class75.method674(-118, arg11, arg12));
        this.field4957 = new class239(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field4962 = arg1.field4587 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLza;)V")
    public final void method9(byte arg0, class288 arg1) {
        if (arg0 < -98) {
            ++field4967;
            class374 var3 = this.field4957.method1559(super.field3347, super.field3344, 262144, -12, arg1, true, false);
            if (var3 != null) {
                int var4 = super.field3347 >> 7;
                int var5 = super.field3344 >> 7;
                this.field4957.method1562(var4, 1, var5, var4, var5, var3, false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILza;I)Le;")
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        if (arg0 < 99) {
            this.method234(-96, (class288) null, -53);
        }
        ++field4955;
        return this.field4957.method1559(0, 0, arg2, -12, arg1, false, false);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
    public final int method224(int arg0) {
        ++field4956;
        return arg0 != -10848 ? 119 : this.field4957.field3692;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I")
    public final int method231(int arg0) {
        if (arg0 < 7) {
            this.method225(true);
        }
        ++field4964;
        return this.field4957.field3687;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Lmv;")
    public static final class255 method2073(int arg0, byte arg1) {
        if (arg1 <= 1) {
            method2072(-3);
        }
        ++field4960;
        return class88.field1790 && ~arg0 <= ~class17.field282 && ~arg0 >= ~class21.field327 ? class324.field4933[-class17.field282 + arg0] : null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Lza;I)Lnd;")
    public final class385 method15(class288 arg0, int arg1) {
        ++field4951;
        class374 var3 = this.field4957.method1559(super.field3347, super.field3344, 2048, -12, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg0.method364();
            var4.method835(super.field3347 - -super.field3359, super.field3345, super.field3352 + super.field3344);
            class385 var5 = null;
            if (this.field4962) {
                var5 = class497.method3001(1, false);
            }
            if (this.field4957.field3707 != null) {
                class502 var6 = this.field4957.field3707.method490();
                arg0.method298(var3, var6, var4, var5 == null ? null : var5.field5620[0], 0);
            } else {
                var3.method723(var4, var5 == null ? null : var5.field5620[0], 0);
            }
            if (arg1 != 2) {
                return null;
            } else {
                int var7 = super.field3347 >> 7;
                int var8 = super.field3344 >> 7;
                this.field4957.method1562(var7, 1, var8, var7, var8, var3, true, arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lza;Z)V")
    public final void method232(class288 arg0, boolean arg1) {
        ++field4959;
        if (!arg1) {
            field4968 = null;
        }
        this.field4957.method1571(arg0, 80);
    }
}
