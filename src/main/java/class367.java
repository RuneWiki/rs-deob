import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class367 extends class379 {

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    private int field4563;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    private int field4559;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "I")
    private int field4558;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "I")
    private int field4561;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    private int field4554;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "[I")
    public static int[] field4547 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IBI)Z", line = 11)
    public final boolean method2134(int arg0, byte arg1, int arg2) {
        field4549++;
        if (arg1 >= -56) {
            this.method2134(102, (byte) 112, 120);
        }
        return this.field4552 <= arg2 && this.field4551 >= arg2 && arg0 >= this.field4550 && this.field4557 >= arg0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lqq;", line = 27)
    public static final class502 method2135(int arg0) {
        field4556++;
        if (arg0 > -63) {
            method2139(94);
        }
        return class665.field9130;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B[III)V", line = 38)
    public final void method2136(byte arg0, int[] arg1, int arg2, int arg3) {
        field4562++;
        arg1[0] = 0;
        arg1[2] = arg2 + this.field4550 - this.field4563;
        if (arg0 == -109) {
            arg1[1] = this.field4552 + arg3 - this.field4558;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)Z", line = 51)
    public final boolean method2137(int arg0, int arg1, int arg2, int arg3) {
        field4553++;
        if (arg3 == 2) {
            return this.field4561 == arg1 && arg0 >= this.field4558 && this.field4559 >= arg0 && arg2 >= this.field4563 && this.field4554 >= arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)Z", line = 69)
    public final boolean method2138(int arg0, int arg1, int arg2) {
        int var4 = -128 % ((arg2 - 17) / 39);
        field4560++;
        return this.field4558 <= arg1 && arg1 <= this.field4559 && this.field4563 <= arg0 && this.field4554 >= arg0;
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V", line = 86)
    public static void method2139(int arg0) {
        field4547 = null;
        if (arg0 >= -114) {
            method2135(-125);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([IIII)V", line = 98)
    public final void method2140(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[1] = this.field4558 + arg2 - this.field4552;
        field4555++;
        arg0[arg1] = this.field4561;
        arg0[2] = this.field4563 + arg3 - this.field4550;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIIIIII)V", line = 111)
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4557 = arg8;
        this.field4563 = arg2;
        this.field4559 = arg3;
        this.field4558 = arg1;
        this.field4561 = arg0;
        this.field4554 = arg4;
        this.field4550 = arg6;
        this.field4551 = arg7;
        this.field4552 = arg5;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZIILkq;)V", line = 127)
    public static final void method2141(boolean arg0, int arg1, int arg2, class620 arg3) {
        field4548++;
        if (class634.field8654 != null || class672.field9218 || arg3 == null || class580.method3340(-24688, arg3) == null) {
            return;
        }
        class634.field8654 = arg3;
        if (!arg0) {
            field4547 = null;
        }
        class395.field5122 = class580.method3340(-24688, arg3);
        class56.field763 = 0;
        class18.field343 = false;
        class140.field1756 = arg1;
        class209.field2481 = arg2;
    }
}
