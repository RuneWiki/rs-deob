import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class287 extends class320 {

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field4568 = -1;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public int field4584 = 0;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Z")
    public static boolean field4570 = true;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[I")
    public static int[] field4582 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[I")
    public static int[] field4583 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4567 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "Ldd;")
    public static class272 field4586;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lvh;")
    public static class61 field4581;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
    public static boolean field4575;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V", line = 18)
    public static void method1958(boolean arg0) {
        if (!arg0) {
            method1961((class336) null, 85);
        }
        field4586 = null;
        field4583 = null;
        field4582 = null;
        field4581 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I", line = 31)
    public static final int method1959(int arg0, int arg1, int arg2) {
        field4574++;
        int var3 = 1;
        if (arg2 != -3047) {
            method1959(98, -14, 30);
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 67)
    public static final void method1960(int arg0) {
        field4576++;
        class218 var1 = class119.field2062;
        synchronized (class119.field2062) {
            class50.field782++;
            class204.field3467 = class293.field4683;
            class284.field4508 = class13.field211;
            class258.field4182 = class303.field4809;
            class284.field4509 = class308.field4902;
            class218.field3635 = class310.field4915;
            class226.field3812 = class356.field5616;
            class190.field3185 = class162.field2871;
            class308.field4902 = 0;
        }
        if (arg0 != 2047) {
            method1959(101, -26, -41);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lpi;I)Lae;", line = 102)
    public static final class305 method1961(class336 arg0, int arg1) {
        if (arg1 >= -116) {
            field4575 = true;
        }
        field4573++;
        return new class305(arg0.method2326(71), arg0.method2326(-40), arg0.method2326(-91), arg0.method2326(72), arg0.method2317(21803), arg0.method2317(21803), arg0.method2364(-9069));
    }
}
