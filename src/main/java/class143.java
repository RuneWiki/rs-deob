import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class143 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Llm;")
    public static class150 field1964 = new class150(128);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIZBII)V")
    public static final void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9, int arg10) {
        field1963++;
        if (arg8 != -19) {
            return;
        }
        if (class250.field3905.method1683(-88) == 2) {
            class23.method152(arg6, arg9, (byte) -117, arg2, arg7, arg4, arg3, arg10, arg0, arg1, arg5);
        } else if (class250.field3905.method1683(-76) <= 2) {
            class265.method1721(arg3, arg9, arg2, arg7, arg10, arg1, true, arg6, arg4, arg0, arg5);
        } else {
            class261.method1701(arg7, arg1, arg10, arg0, class250.field3905.method1683(-79), false, arg6, arg5, arg9, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static void method899(boolean arg0) {
        field1964 = null;
        if (arg0) {
            field1964 = null;
        }
    }
}
