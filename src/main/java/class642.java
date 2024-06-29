import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class class642 {

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field8624 = 0;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8626 = 0;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "Lr;")
    public static class170 field8623;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Lpga;")
    public static class500 field8625;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)Z")
    public abstract boolean method3271(int arg0, int arg1);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lvc;")
    public abstract class293 method3274(byte arg0);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public abstract void method3272(int arg0);

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
    public abstract void method3273(int arg0);

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
    public static void method3534(int arg0) {
        if (arg0 > 11) {
            field8625 = null;
            field8623 = null;
        }
    }
}
