import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class251 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3463 = -1;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3464 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Loa;")
    public static class651 field3460;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 16)
    public static void method1530(int arg0) {
        field3460 = null;
        if (arg0 != -1) {
            method1530(44);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 28)
    public static final void method1531(int arg0, int arg1) {
        field3459++;
        class382 var2 = class396.method2276(93, arg1, arg0);
        var2.method2228((byte) -55);
    }
}
