import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class283 extends class132 {

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "J")
    public static long field3775 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lpca;")
    public static class529 field3777 = new class529();

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Liba;")
    public static class211 field3784 = new class211(28, 2);

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "F")
    public static float field3783;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lew;")
    public static class226 field3776;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Lf;")
    private class256 field3779;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lmv;")
    public static class295 field3785;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 3)
    public static void method1675(byte arg0) {
        field3777 = null;
        field3785 = null;
        field3784 = null;
        if (arg0 != -128) {
            field3775 = -24L;
        }
        field3776 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)V", line = 16)
    public final void method939(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3773;
        int var5 = this.method942(arg0 ^ 9508) * super.field1909.field2337 / 10000;
        if (arg0 == 24626) {
            int[] var6 = new int[4];
            class332.field4821.method628(var6);
            class332.field4821.method652(arg3, arg2 - -2, arg3 + var5, super.field1909.field2332 + arg2);
            this.field3779.method1528(arg3, arg2 - -2, super.field1909.field2337, super.field1909.field2332);
            class332.field4821.method652(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIII)V", line = 34)
    public final void method945(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3782;
        class332.field4821.method633(arg1 - 2, arg3, super.field1909.field2337 + 4, super.field1909.field2332 + 2, ((class508) super.field1909).field7177, 0);
        class332.field4821.method633(arg1 + -1, arg3 + 1, super.field1909.field2337 + 2, super.field1909.field2332, 0, 0);
        if (arg2 >= -25) {
            field3775 = 33L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lmv;Lmv;Lsv;)V", line = 50)
    public class283(class295 arg0, class295 arg1, class508 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)[B", line = 53)
    public static final byte[] method1676(int arg0, byte[] arg1) {
        ++field3774;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class667.method3739(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Lsda;", line = 70)
    public static final class489 method1677(int arg0) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field3781;
            class489 var1 = (class489) class487.field6925.method1126(86);
            if (var1 != null) {
                var1.method2360((byte) 66);
                var1.method1989((byte) 118);
                return var1;
            } else {
                class489 var2;
                do {
                    var2 = (class489) class248.field3266.method1126(-116);
                    if (var2 == null) {
                        return null;
                    }
                    if (var2.method2791((byte) -76) > class60.method371(false)) {
                        return null;
                    }
                    var2.method2360((byte) 66);
                    var2.method1989((byte) 89);
                } while ((var2.field4679 & Long.MIN_VALUE) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z", line = 114)
    public final boolean method941(byte arg0) {
        ++field3778;
        if (!super.method941((byte) -21)) {
            return false;
        } else {
            return arg0 >= -15 ? true : super.field1923.method1818(((class508) super.field1909).field7172, 4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 129)
    public final void method940(int arg0) {
        ++field3780;
        super.method940(arg0);
        this.field3779 = class201.method1305(super.field1923, true, ((class508) super.field1909).field7172);
    }
}
