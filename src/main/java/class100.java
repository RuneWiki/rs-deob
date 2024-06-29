import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class100 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "[Ldg;")
    public static class236[] field1216 = new class236[2048];

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[Lgj;")
    public static class381[] field1215;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method554(byte arg0) {
        field1216 = null;
        if (arg0 == -100) {
            field1215 = null;
        }
    }
}
