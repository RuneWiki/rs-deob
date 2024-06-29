import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class494 extends class345 {

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field7203;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field7205;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "J")
    public long field7206;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
    public final int method1903(int arg0) {
        return arg0 == 11 ? this.field7205 : -53;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
    public final int method1905(boolean arg0) {
        if (!arg0) {
            this.method1903(-49);
        }
        return this.field7204;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
    public final int method1907(int arg0) {
        if (arg0 < 78) {
            this.method1905(false);
        }
        return this.field7203;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
    public final int method1906(byte arg0) {
        if (arg0 != 0) {
            this.method1905(true);
        }
        return this.field7202;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)J")
    public final long method1908(int arg0) {
        if (arg0 != 5) {
            this.field7202 = -57;
        }
        return this.field7206;
    }
}
