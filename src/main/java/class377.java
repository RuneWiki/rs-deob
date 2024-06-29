import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class377 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Ldj;")
    public static class197 field5117 = new class197();

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static final void method2182(int arg0) {
        if (arg0 != 60) {
            method2183(-70);
        }
        field5118++;
        class360.field4833 = false;
        class64.method346(8);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public static void method2183(int arg0) {
        if (arg0 == -1396999004) {
            field5117 = null;
        }
    }
}
