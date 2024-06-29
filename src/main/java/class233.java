import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class233 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lkr;")
    public static class602 field3468 = new class602(20, 6);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public abstract void method1551(int arg0);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Lq;")
    public abstract class674 method1552(boolean arg0);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
    public abstract int method1553(byte arg0);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
    public abstract void method1554(byte arg0);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
    public abstract boolean method1555(int arg0);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)I")
    public abstract int method1556(int arg0);

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Z")
    public final boolean method1557(int arg0) {
        field3470++;
        if (arg0 != -32543) {
            field3468 = null;
        }
        return this.method1560(true) || this.method1559(true) || this.method1555(-25195);
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
    public static void method1558(int arg0) {
        field3468 = null;
        if (arg0 != 6) {
            field3469 = -114;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1559(boolean arg0);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(Z)Z")
    public abstract boolean method1560(boolean arg0);
}
