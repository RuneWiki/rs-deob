import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class142 {

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIB)V", line = 6)
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2054++;
        class16 var5 = class94.method753(18, 13175, (long) arg0 << 32 | (long) arg2);
        var5.method119(arg4 - 36);
        var5.field244 = arg1;
        if (arg4 == -52) {
            var5.field237 = arg3;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIZLjava/lang/String;Lqn;)V", line = 21)
    public static final void method1088(boolean arg0, int arg1, boolean arg2, String arg3, class70 arg4) {
        if (arg1 != -22283) {
            field2056 = -69;
        }
        field2053++;
        class700.method3898(0, arg2, arg4, "openjs", arg3, arg0);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method1089(int arg0, int arg1, int arg2) {
        field2055++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        int var3 = -55 % ((-arg0 - 50) / 63);
        class589 var4 = class350.field5132.method3732((byte) 52, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method3292(0, arg2);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIZ)V", line = 59)
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2052++;
        if (arg1 != -352753888) {
            field2056 = -10;
        }
        class332.method2082(109);
        class5.field50 = 0L;
        int var5 = class485.method2816(-116);
        if (arg2 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class379.field5542.method501()) {
            arg4 = true;
        }
        class451.method2688(arg1 ^ 0xEAF96748, var5, arg4, arg0, arg2, arg3);
    }
}
