import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class134 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lbd;")
    public static class60 field1953 = new class60(6, -1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "D")
    public static double field1954;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lhaa;")
    public static class80 field1955;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public static void method959(boolean arg0) {
        field1953 = null;
        if (arg0) {
            method959(false);
        }
        field1955 = null;
    }
}
