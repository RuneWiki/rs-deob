import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class343 extends class256 {

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Lkaa;")
    public static class47 field4816 = new class47(1, 7);

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Z")
    public static boolean field4824 = false;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "Lhda;")
    public static class752 field4825 = new class752(29, 8);

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "[I")
    public static int[] field4826 = new int[8];

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "Lhda;")
    public static class752 field4827 = new class752(118, -2);

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I", line = 3)
    public static final int method2050(byte arg0) {
        ++field4817;
        if (class200.field3012 != null) {
            return 3;
        } else {
            if (arg0 != -112) {
                method2050((byte) 21);
            }
            return class509.field6784 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIII)V", line = 16)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field3515 = (byte) arg4;
        super.field3510 = arg1;
        super.field3508 = (byte) arg3;
        super.field3502 = arg2;
        super.field3505 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 28)
    public static void method2051(int arg0) {
        field4816 = null;
        field4825 = null;
        field4827 = null;
        if (arg0 != 3) {
            method2051(-66);
        }
        field4826 = null;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z", line = 46)
    public final boolean method798(int arg0) {
        ++field4823;
        int var2 = -31 / ((arg0 - 53) / 45);
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V", line = 57)
    public final void method803(int arg0) {
        ++field4821;
        if (arg0 != 131072) {
            this.method1558(-57);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z", line = 69)
    public final boolean method1558(int arg0) {
        if (arg0 > -100) {
            field4827 = null;
        }
        ++field4822;
        return class672.field9269[(super.field3505 >> class140.field2224) + -class458.field6258 + class183.field2779][(super.field3502 >> class140.field2224) + (-class610.field8134 - -class183.field2779)];
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 80)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 <= 109) {
            this.method798(-61);
        }
        ++field4815;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lha;B)Z", line = 92)
    public final boolean method1560(class59 arg0, byte arg1) {
        ++field4819;
        class10 var3 = class366.method2162(super.field3508, super.field3505 >> class140.field2224, super.field3502 >> class140.field2224);
        if (arg1 != 35) {
            field4824 = true;
        }
        return var3 != null && var3.field170.field9365 ? class500.method2817(super.field3502 >> class140.field2224, var3.field170.method789(arg1 + -32803) - -this.method789(-32768), super.field3508, super.field3505 >> class140.field2224, arg1 ^ 71) : class336.method2023((byte) -111, super.field3508, super.field3505 >> class140.field2224, super.field3502 >> class140.field2224);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([Ltn;B)I", line = 121)
    public final int method1557(class87[] arg0, byte arg1) {
        ++field4820;
        if (arg1 != -58) {
            this.method798(-21);
        }
        return this.method1561(arg0, super.field3505 >> class140.field2224, (byte) 85, super.field3502 >> class140.field2224);
    }
}
