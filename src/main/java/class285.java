import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class285 {

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "F")
    public static float field3969;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Ltd;")
    public static class515[] field3967;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILla;BIIZ)V")
    public static final void method1818(int arg0, int arg1, class423 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 <= 0) {
            class219.method1545(arg6, 0, arg4, arg2, arg1, arg5);
        } else {
            class445.field6358 = arg2;
            class249.field3628 = 1;
            class179.field2476 = arg6;
            class11.field98 = null;
            class174.field2446 = arg4;
            class683.field9697 = arg1;
            class342.field4704 = arg5;
            class590.field8395 = class36.field325.method1954(-28004) / arg0;
            if (class590.field8395 < 1) {
                class590.field8395 = 1;
            }
        }
        if (arg3 >= -1) {
            method1819((byte) -86);
        }
        field3970++;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method1819(byte arg0) {
        field3967 = null;
        if (arg0 != 10) {
            field3968 = -117;
        }
    }
}
