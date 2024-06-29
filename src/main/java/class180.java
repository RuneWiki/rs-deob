import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class180 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lqd;")
    private static class40 field2942 = class147.method1106(" from your friend list first)3", (byte) -43);

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lqd;")
    public static class40 field2941 = field2942;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lqd;")
    public static class40 field2943 = class147.method1106("http:)4)4", (byte) -111);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[Lde;")
    public static class58[] field2944 = new class58[27];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2940++;
        if (arg4 >= class125.field2164 && class48.field941 >= arg6 && class220.field3664 <= arg2 && class72.field1275 >= arg5) {
            if (arg0 == 1) {
                class85.method656(arg2, arg6, 71, arg5, arg4, arg3);
            } else {
                class317.method2190(arg0, arg4, arg2, -12820, arg5, arg6, arg3);
            }
        } else if (arg0 == 1) {
            class213.method1499(arg2, arg4, arg5, arg3, (byte) 120, arg6);
        } else {
            class110.method832(arg6, (byte) -115, arg5, arg2, arg0, arg4, arg3);
        }
        if (arg1 != 29106) {
            field2939 = 34;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 43)
    public static void method1318(int arg0) {
        if (arg0 != 1) {
            field2943 = (class40) null;
        }
        field2942 = null;
        field2941 = null;
        field2944 = null;
        field2943 = null;
    }
}
