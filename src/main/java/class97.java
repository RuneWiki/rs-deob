import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class97 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I", line = 7)
    public final int method536(int arg0, int arg1, int arg2) {
        if (arg1 != -26620) {
            this.toString();
        }
        field1195++;
        int var4 = class211.field2763 > arg0 ? class211.field2763 : arg0;
        if (class165.field2076 == this) {
            return 0;
        } else if (class530.field7334 == this) {
            return var4 - arg2;
        } else if (class142.field1811 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hv", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field1196++;
        throw new IllegalStateException();
    }
}
