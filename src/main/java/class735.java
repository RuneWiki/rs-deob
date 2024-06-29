import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class735 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "J")
    public static long field10133 = 0L;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "F")
    public static float field10131;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Luia;")
    public static class589 field10134;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 9)
    public static final void method4080(int arg0) {
        if (arg0 != 0) {
            field10131 = 0.8532635F;
        }
        field10132++;
        class361.method2268(124);
        class263.field3850 = false;
        class453.method2733(class221.field3026, class625.field8753, class788.field10819, arg0 - 26, class689.field9609);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V", line = 23)
    public static void method4081(boolean arg0) {
        field10134 = null;
        if (arg0) {
            method4081(false);
        }
    }
}
