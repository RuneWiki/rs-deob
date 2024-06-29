import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class575 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lrf;")
    public static class749 field8272 = new class749();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[I")
    public static int[] field8273;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method3411(boolean arg0) {
        field8273 = null;
        field8272 = null;
        if (arg0) {
            field8272 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILqd;)Lqd;")
    public abstract class574 method3412(int arg0, class574 arg1);
}
