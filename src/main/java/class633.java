import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class633 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
    public boolean field8823;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lui;")
    public class498 field8821;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lui;")
    public class498 field8822;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    public boolean field8817;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Lsn;", line = 3)
    public static final class659 method3505(boolean arg0, int arg1) {
        if (!arg0) {
            method3505(false, -34);
        }
        field8816++;
        return arg1 >= 0 && arg1 < 100 ? class32.field471[arg1] : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method3506(int arg0) {
        if (arg0 >= -54) {
            method3505(false, -6);
        }
        field8819++;
        return this.field8817 && !this.field8823;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 40)
    public final void method3507(byte arg0) {
        field8818++;
        if (this.field8821 != null) {
            this.field8821.method645(-69);
        }
        if (arg0 != 74) {
            this.method3507((byte) 72);
        }
        this.field8817 = false;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Z)V", line = 55)
    public class633(boolean arg0) {
        this.field8823 = arg0;
    }
}
