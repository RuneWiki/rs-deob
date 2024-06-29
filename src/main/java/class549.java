import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class549 extends class467 {

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field7847;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field7848;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public int field7849;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field7851;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "J")
    public long field7850;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(B)I")
    public final int method1795(byte arg0) {
        int var2 = 114 % ((27 - arg0) / 59);
        return this.field7848;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(B)I")
    public final int method1792(byte arg0) {
        return arg0 > -35 ? 43 : this.field7847;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(B)I")
    public final int method1793(byte arg0) {
        int var2 = 121 / ((arg0 - 51) / 49);
        return this.field7851;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)J")
    public final long method1791(byte arg0) {
        if (arg0 != -102) {
            this.field7849 = 57;
        }
        return this.field7850;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
    public final int method1794(byte arg0) {
        if (arg0 <= 114) {
            this.field7849 = 3;
        }
        return this.field7849;
    }
}
