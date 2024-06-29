import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class319 extends class149 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
    public static boolean field4396 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ll;")
    public static class18 field4397;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)Lnj;")
    public abstract class247 method1792(boolean arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4393++;
        if (arg0 != 10499) {
            method2050(55, -44, 14, -122, 70, 0, 127, 112);
        }
        if (arg1 == arg7) {
            class9.method50(arg3, arg7, arg5, -22728, arg6, arg4, arg2);
        } else if (class140.field2314 <= arg2 - arg7 && arg2 + arg7 <= class536.field7419 && arg6 - arg1 >= class58.field1150 && arg1 + arg6 <= class479.field6682) {
            class498.method2940(arg1, arg4, arg7, arg3, arg2, (byte) -117, arg6, arg5);
        } else {
            class297.method1950(arg7, arg2, arg6, arg0 ^ 0xFFFFD6FC, arg1, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method2051(int arg0) {
        if (arg0 == -24054) {
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public static final void method2052(boolean arg0) {
        if (!arg0) {
            field4394 = -78;
        }
        class707.method3943();
        field4395++;
    }
}
