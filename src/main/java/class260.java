import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class260 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
    public boolean field4059;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lcb;")
    public static class631 field4057 = new class631(50, 3);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Z")
    public static boolean field4062 = false;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Loq;")
    public class743 field4056;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Loq;")
    public class743 field4060;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Z")
    public boolean field4055;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 3)
    public static void method1739(int arg0) {
        if (arg0 <= 6) {
            method1739(7);
        }
        field4057 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 13)
    public final void method1740(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field4056 != null) {
            this.field4056.method697(-18934);
        }
        field4061++;
        this.field4055 = false;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z", line = 29)
    public final boolean method1741(int arg0) {
        field4058++;
        if (arg0 == 3) {
            return this.field4055 && !this.field4059;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Z)V", line = 44)
    public class260(boolean arg0) {
        this.field4059 = arg0;
    }
}
