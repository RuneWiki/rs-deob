import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class551 {

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "J")
    public long field7267;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "Lrda;")
    private class663 field7269;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Lhda;")
    public static class752 field7270 = new class752(11, 7);

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Lkaa;")
    public static class47 field7271 = new class47(68, 11);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7269.method3596(this.field7267, true);
        field7268++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method3076(int arg0) {
        field7270 = null;
        field7271 = null;
        if (arg0 != 68) {
            field7271 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lrda;JI)V")
    public class551(class663 arg0, long arg1, int arg2) {
        this.field7267 = arg1;
        this.field7269 = arg0;
    }
}
