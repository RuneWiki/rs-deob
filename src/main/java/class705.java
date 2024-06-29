import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class705 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
    public final int method3920(int arg0, int arg1, int arg2) {
        if (arg2 > -28) {
            return -119;
        }
        field9644++;
        int var4 = class693.field9222 > arg1 ? class693.field9222 : arg1;
        if (class28.field280 == this) {
            return 0;
        } else if (class318.field4528 == this) {
            return var4 - arg0;
        } else if (class719.field9784 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9642++;
        throw new IllegalStateException();
    }
}
