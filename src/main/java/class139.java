import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class139 {

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ofa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1658++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class139(String arg0, int arg1) {
        this.field1660 = arg1;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)I")
    public final int method865(boolean arg0) {
        field1659++;
        if (!arg0) {
            this.toString();
        }
        return this.field1660;
    }
}
