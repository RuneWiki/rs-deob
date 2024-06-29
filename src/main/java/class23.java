import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class23 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lf;")
    public static class492 field200;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 8)
    public static final void method102(int arg0) {
        class625.field9166 = new class419();
        if (arg0 == -13489) {
            field202++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 19)
    public static void method103(boolean arg0) {
        if (!arg0) {
            field200 = null;
        }
    }
}
