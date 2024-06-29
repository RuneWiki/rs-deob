import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class698 extends class435 {

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lfj;")
    public static class75 field9895 = new class75();

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 11)
    public static void method3925(boolean arg0) {
        if (!arg0) {
            method3925(true);
        }
        field9895 = null;
    }
}
