import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class339 extends class72 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[J")
    public static long[] field4773 = new long[32];

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Z")
    public static boolean field4781 = false;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lqe;")
    public static class465 field4775 = new class465(16, 11);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)Z", line = 3)
    public static final boolean method2153(int arg0, int arg1, boolean arg2) {
        ++field4771;
        if (arg2) {
            method2153(-15, 113, true);
        }
        return ~(32 & arg0) != -1;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lcq;)V", line = 16)
    public class339(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 20)
    public final void method55(int arg0) {
        if (~super.field1282 > -2 || super.field1282 > 3) {
            super.field1282 = this.method60(-3271);
        }
        ++field4772;
        if (arg0 <= 30) {
            this.method58(-94, 75);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)F", line = 34)
    public static final float method2154(int arg0, float arg1) {
        int var2 = 123 % ((arg0 - -32) / 38);
        ++field4777;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I", line = 46)
    public static final int method2155(int arg0, int arg1, int arg2, int arg3) {
        ++field4778;
        if (arg0 > -8) {
            method2156(true);
        }
        if (arg1 > 243) {
            arg3 >>= 4;
        } else if (arg1 > 217) {
            arg3 >>= 3;
        } else if (~arg1 < -193) {
            arg3 >>= 2;
        } else if (~arg1 < -180) {
            arg3 >>= 1;
        }
        return (arg1 >> 1) + (((63 & arg2 >> 2) << 10) - -(arg3 >> 5 << 7));
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILcq;)V", line = 72)
    public class339(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I", line = 77)
    public final int method58(int arg0, int arg1) {
        ++field4776;
        return arg1 != 11260 ? 65 : 1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I", line = 93)
    public final int method60(int arg0) {
        ++field4780;
        if (arg0 != -3271) {
            return -67;
        } else {
            return super.field1286.method2820(false).method3611((byte) 89) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 109)
    public static void method2156(boolean arg0) {
        field4773 = null;
        field4775 = null;
        if (arg0) {
            method2154(12, 0.8131416F);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I", line = 120)
    public final int method2157(int arg0) {
        if (arg0 != 27669) {
            this.method55(-81);
        }
        ++field4774;
        return super.field1282;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 131)
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            field4775 = null;
        }
        ++field4779;
    }
}
