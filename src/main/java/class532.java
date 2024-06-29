import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class532 extends class283 {

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public int field7486;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "J")
    public long field7482;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)J")
    public final long method1704(int arg0) {
        int var2 = 105 / ((25 - arg0) / 45);
        return this.field7482;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I")
    public final int method1702(byte arg0) {
        return arg0 > -26 ? -3 : this.field7484;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)I")
    public final int method1706(boolean arg0) {
        if (!arg0) {
            this.field7483 = 46;
        }
        return this.field7486;
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)I")
    public final int method1705(int arg0) {
        return arg0 == -3668 ? this.field7483 : -72;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)I")
    public final int method1701(int arg0) {
        int var2 = 63 / ((68 - arg0) / 46);
        return this.field7485;
    }
}
