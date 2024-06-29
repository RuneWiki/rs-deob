import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class736 extends class173 {

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Ljn;")
    public static class341 field9975;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 7)
    public static void method4000(boolean arg0) {
        field9975 = null;
        if (arg0) {
            method4000(false);
        }
    }
}
