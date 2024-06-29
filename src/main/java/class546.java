import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class546 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
    public boolean field7929;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field7934 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lcda;")
    public class154 field7932;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lcda;")
    public class154 field7933;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
    public boolean field7930;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public final void method3206(byte arg0) {
        field7931++;
        if (this.field7933 != null) {
            this.field7933.method11((byte) -127);
        }
        this.field7930 = false;
        int var2 = -55 % ((arg0 - 57) / 43);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Z)V")
    public class546(boolean arg0) {
        this.field7929 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
    public final boolean method3207(int arg0) {
        field7928++;
        if (arg0 != 6086) {
            this.method3206((byte) -32);
        }
        return this.field7930 && !this.field7929;
    }
}
