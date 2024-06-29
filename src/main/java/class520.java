import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class520 extends class140 implements class68 {

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lgs;")
    public class33 field7636;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
    private boolean field7642;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lla;")
    public static class319 field7650;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lla;")
    public static class319 field7655;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "F")
    public static float field7657;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field7654;

    static {
        new class446("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field7650 = new class319(108, 0);
        field7655 = new class319(113, 0);
        field7656 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 4)
    public static void method3094(byte arg0) {
        field7655 = null;
        field7650 = null;
        if (arg0 != 113) {
            field7650 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILqa;I)Lka;", line = 18)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            this.method337(-103, (class165) null, 77);
        }
        ++field7652;
        return this.field7636.method280((byte) -25, 0, false, 0, false, arg0, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqa;I)V", line = 29)
    public final void method330(class165 arg0, int arg1) {
        this.field7636.method282(false, arg0);
        ++field7644;
        if (arg1 != 14470) {
            method3095((byte) 46, -103);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIZIIIIIII)V", line = 41)
    public class520(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2909 == -2, class359.method2293(arg13, arg12, true));
        this.field7636 = new class33(arg0, arg1, arg12, arg13, super.field1866, arg3, arg4, arg6, arg7, arg14);
        this.field7642 = arg1.field2930 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Z", line = 55)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            field7655 = null;
        }
        ++field7654;
        return this.field7636.method278(-1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I", line = 66)
    public final int method174(byte arg0) {
        if (arg0 >= -126) {
            this.method338(-123);
        }
        ++field7646;
        return this.field7636.method279(-1);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)I", line = 78)
    public final int method338(int arg0) {
        if (arg0 < 75) {
            this.method135(false, (class165) null);
        }
        ++field7638;
        return this.field7636.field475;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 90)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        ++field7641;
        if (arg2 >= -4) {
            field7656 = -111;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILqa;)Lou;", line = 101)
    public final class437 method136(int arg0, class165 arg1) {
        ++field7640;
        class334 var3 = this.field7636.method280((byte) -25, super.field1862, false, super.field1867, true, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class14 var4 = arg1.method751();
            var4.method141(super.field1867, super.field1873, super.field1862);
            class437 var5 = null;
            if (this.field7642) {
                var5 = class530.method3133(false, 1);
            }
            if (this.field7636.field474 == null) {
                var3.method53(var4, var5 != null ? var5.field6608[0] : null, 0);
            } else {
                class137 var6 = this.field7636.field474.method1533();
                arg1.method840(var3, var6, var4, var5 != null ? var5.field6608[0] : null, 0);
            }
            this.field7636.method285(super.field1874, super.field1868, super.field1863, arg1, true, var3, arg0, super.field1871);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)I", line = 135)
    public static final int method3095(byte arg0, int arg1) {
        ++field7647;
        int var2 = arg1 >>> 1;
        if (arg0 > -39) {
            return -39;
        } else {
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)Z", line = 153)
    public final boolean method176(boolean arg0) {
        ++field7639;
        return !arg0;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V", line = 170)
    public final void method175(int arg0) {
        ++field7637;
        if (arg0 != 0) {
            field7653 = 8;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIILqa;)Z", line = 183)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field7651;
        class334 var5 = this.field7636.method280((byte) -25, super.field1862, false, super.field1867, false, 131072, arg3);
        if (arg0 <= 121) {
            this.method337(-49, (class165) null, -9);
        }
        if (var5 == null) {
            return false;
        } else {
            class14 var6 = arg3.method751();
            var6.method141(super.field1867, super.field1873, super.field1862);
            return var5.method68(arg2, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I", line = 207)
    public final int method336(int arg0) {
        ++field7635;
        return arg0 != -6130 ? 123 : this.field7636.field492;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLqa;)V", line = 218)
    public final void method333(boolean arg0, class165 arg1) {
        if (!arg0) {
            this.method136(-10, (class165) null);
        }
        this.field7636.method283(arg1, -127);
        ++field7649;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)I", line = 229)
    public final int method332(int arg0) {
        ++field7645;
        return arg0 != 6359 ? -87 : this.field7636.field486;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZLqa;)V", line = 241)
    public final void method135(boolean arg0, class165 arg1) {
        ++field7643;
        class334 var3 = this.field7636.method280((byte) -25, super.field1862, true, super.field1867, true, 262144, arg1);
        if (arg0) {
            this.field7642 = true;
        }
        if (var3 != null) {
            this.field7636.method285(super.field1874, super.field1868, super.field1863, arg1, false, var3, 0, super.field1871);
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V", line = 258)
    public final void method334(int arg0) {
        if (arg0 != 29893) {
            this.method175(-1);
        }
        ++field7648;
    }
}
