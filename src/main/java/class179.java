import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class179 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Lfe;")
    public static class97 field2941 = new class97(16);

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Lph;")
    public static class229 field2944 = class266.method1858("; version=1; path=)4; domain=", 0);

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "F")
    public static float field2945;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2943++;
        if (class69.method542(arg2, -1)) {
            client.method2169(class37.field604[arg2], -1, arg7, arg1, arg6, arg4, arg5, arg0);
            int var8 = -110 / ((arg3 + 50) / 59);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 28)
    public static void method1281(int arg0) {
        if (arg0 <= 111) {
            method1280(-67, -71, 118, -63, 122, 111, -126, -100);
        }
        field2941 = null;
        field2944 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Luh;Z)Luh;")
    public abstract class254 method833(class254 arg0, boolean arg1);
}
