import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class164 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Lcba;")
    public static class471 field2367 = new class471(70, 10);

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIILgi;II)Les;")
    public static final class320 method1055(int arg0, int arg1, int arg2, class583 arg3, int arg4, int arg5) {
        field2369++;
        if (arg0 != -21747) {
            return null;
        } else if (!arg3.field8249 && (!class130.method886(1, arg4) || !class130.method886(1, arg5))) {
            return arg3.field8253 ? new class320(arg3, 34037, arg2, arg1, arg4, arg5, true) : new class320(arg3, arg2, arg1, arg4, arg5, class32.method326(arg4, false), class32.method326(arg5, false), true);
        } else {
            return new class320(arg3, 3553, arg2, arg1, arg4, arg5, true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
    public static final boolean method1056(int arg0) {
        field2370++;
        if (arg0 != 34037) {
            field2367 = null;
        }
        return class210.field2958 > 0;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public static void method1057(int arg0) {
        int var1 = 108 / ((arg0 + 11) / 48);
        field2367 = null;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public static final void method1058(int arg0) {
        field2368++;
        if (arg0 != 3553) {
            method1056(-25);
        }
        class529.field7414.method3246(false);
    }
}
