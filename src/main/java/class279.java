import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class279 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field4895;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
    public final boolean method1838(byte arg0) {
        if (arg0 <= 112) {
            this.method1841(23);
        }
        field4893++;
        return (this.field4895 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
    public final boolean method1839(int arg0) {
        if (arg0 != -1) {
            this.field4894 = -48;
        }
        field4898++;
        return (this.field4895 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Z")
    public final boolean method1840(int arg0) {
        if (arg0 != 16) {
            this.method1839(-43);
        }
        field4892++;
        return (this.field4895 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Z")
    public final boolean method1841(int arg0) {
        if (arg0 <= 114) {
            return false;
        } else {
            field4897++;
            return (this.field4895 & 0x2) != 0;
        }
    }
}
