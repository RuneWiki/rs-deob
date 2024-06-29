import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class327 extends class74 {

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Llt;")
    public static class273 field4187 = new class273();

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        int var3 = 126 / ((arg0 - 52) / 36);
        ++field4186;
        super.field1011.method2567(true, -27379);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(JIIZLpl;II)V")
    public static final void method1866(long arg0, int arg1, int arg2, boolean arg3, class612 arg4, int arg5, int arg6) {
        ++field4191;
        if (arg1 > -57) {
            field4187 = null;
        }
        class486.method2633(arg2, arg4, arg5, arg6, arg0, arg3, 10000, 10000);
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 != -19092) {
            this.method341(-41, 90, (class466) null);
        }
        super.field1011.method2567(false, -27379);
        ++field4189;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V")
    public static final void method1867(boolean arg0) {
        class27.field402 = null;
        if (!arg0) {
            method1867(false);
        }
        ++field4192;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        if (arg2 != 65) {
            field4187 = null;
        }
        ++field4190;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Len;)V")
    public class327(class478 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        ++field4184;
        if (arg0 != -16777216) {
            field4187 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public static void method1868(int arg0) {
        field4187 = null;
        int var1 = 1 % (-arg0 / 49);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        if (arg1 > 47) {
            ++field4185;
            super.field1011.method2596(arg2, 0);
            super.field1011.method2595(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        ++field4188;
        if (!arg0) {
            method1867(true);
        }
    }
}
