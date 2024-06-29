import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class274 extends class39 implements class70 {

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Z")
    private boolean field4448 = false;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    private int field4449 = 50;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Llc;")
    private class270 field4431;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "Llc;")
    private class270 field4441;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "Lnh;")
    private class312 field4447;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Lnh;")
    private class312 field4432;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    public static int[] field4435 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Lvb;")
    public static class73 field4439;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[S")
    public static short[] field4444;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)V")
    public final void method1906(int arg0, byte arg1) {
        class27 var3 = (class27) this.field4447.method2102(15124);
        if (arg1 > -15) {
            return;
        }
        while (var3 != null) {
            if (var3.field295) {
                var3.method177(arg0);
                var3.field295 = false;
            }
            var3 = (class27) this.field4447.method2100(-51);
        }
        field4436++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(FIB)[I")
    public final int[] method533(float arg0, int arg1, byte arg2) {
        if (arg2 < 17) {
            this.method1908(12, 12);
        }
        field4437++;
        class27 var4 = this.method1908(arg1, 104);
        if (var4 == null) {
            return null;
        } else {
            var4.field295 = true;
            return var4.method176(this, this.field4441, arg0, this.field4448 || this.method242(false, arg1).field4465);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)Z")
    public final boolean method532(int arg0, int arg1) {
        field4429++;
        if (arg1 <= 96) {
            this.method532(-101, 6);
        }
        return !this.method242(false, arg0).field4459;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIFZI)Lbc;")
    public final class148 method529(int arg0, int arg1, float arg2, boolean arg3, int arg4) {
        if (arg0 < 26) {
            return null;
        }
        field4434++;
        class27 var6 = this.method1908(arg4, 106);
        if (var6 != null && var6.method175(this, this.field4441)) {
            return arg3 ? var6.field296.method128(arg1, this.field4441, this, arg1, false, (double) arg2, 23755) : var6.field296.method130(this.field4441, false, (double) arg2, arg1, arg1, 31949, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Lvd;")
    public final class19 method245(int arg0, byte arg1) {
        field4446++;
        if (arg1 == 66) {
            class27 var3 = this.method1908(arg0, arg1 + 60);
            return var3 == null ? null : var3.field296;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Z")
    public final boolean method530(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1906(-87, (byte) -15);
        }
        field4430++;
        return this.method242(false, arg1).field4468;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public final void method1907(byte arg0) {
        if (arg0 != -76) {
            return;
        }
        this.field4447.method2101(3080);
        field4442++;
        if (this.field4432 != null) {
            this.field4432.method2101(arg0 ^ 0xFFFFF3BC);
        }
        class27.field301 = null;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)Lbd;")
    private final class27 method1908(int arg0, int arg1) {
        class27 var3 = (class27) this.field4447.method2099((byte) 125, (long) arg0);
        field4445++;
        if (var3 != null) {
            return var3;
        } else if (arg1 < 102) {
            return null;
        } else {
            byte[] var4 = this.field4431.method1868(0, arg0, 1);
            if (var4 == null) {
                return null;
            } else {
                class27 var5 = new class27(new class53(var4));
                this.field4447.method2103(var5, -1, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
    public final void method1909(boolean arg0, boolean arg1) {
        if (!arg0) {
            field4438++;
            this.field4448 = arg1;
            this.method1907((byte) -76);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method1910(int arg0) {
        field4439 = null;
        if (arg0 == 4) {
            field4435 = null;
            field4444 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)Z")
    public final boolean method528(boolean arg0, int arg1) {
        field4440++;
        if (this.field4448 || this.method242(false, arg1).field4465) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I")
    public final int method531(int arg0, int arg1) {
        if (arg1 == -8362) {
            field4443++;
            return this.method242(false, arg0).field4460 & 0xFFFF;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Llc;Llc;Llc;IZ)V")
    public class274(class270 arg0, class270 arg1, class270 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4431 = arg0;
        this.field4448 = arg4;
        this.field4449 = arg3;
        this.field4441 = arg2;
        this.field4447 = new class312(this.field4449);
        this.field4432 = null;
    }
}
