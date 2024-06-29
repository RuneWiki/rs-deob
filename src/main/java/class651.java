import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class651 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field9162++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)I", line = 14)
    public final int method3778(int arg0, int arg1, boolean arg2) {
        field9163++;
        if (arg2) {
            return -2;
        }
        int var4 = arg0 < class501.field7123 ? class501.field7123 : arg0;
        if (class434.field6450 == this) {
            return 0;
        } else if (class509.field7246 == this) {
            return var4 - arg1;
        } else if (class8.field103 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }
}
