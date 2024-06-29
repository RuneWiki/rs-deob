import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public abstract class class115 {

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Lro;")
    public static class2 field1594;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Lkr;")
    public static class748 field1596;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)J", line = 6)
    public static final long method847(int arg0) {
        if (arg0 > -78) {
            method848(-128);
        }
        field1593++;
        return class184.field2813.method5(56);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V", line = 17)
    public static void method848(int arg0) {
        if (arg0 != -2) {
            method848(96);
        }
        field1596 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(Z)V", line = 34)
    public static final void method851(boolean arg0) {
        field1595++;
        if (!arg0) {
            return;
        }
        if (class11.field154 <= 1) {
            class63.field916.method4111(69, 2, class63.field916.field10188);
        } else {
            class63.field916.method4111(83, 4, class63.field916.field10188);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V")
    public abstract void method846(boolean arg0);

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[BII)V")
    public abstract void method849(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
    public abstract void method850(int arg0);

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)Z")
    public abstract boolean method852(int arg0, boolean arg1) throws IOException;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I[BII)I")
    public abstract int method853(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;
}
