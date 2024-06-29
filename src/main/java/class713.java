import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class713 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII)I", line = 10)
    public final int method4065(byte arg0, int arg1, int arg2) {
        if (arg0 > -124) {
            return -1;
        }
        field10053++;
        int var4 = class510.field7263 <= arg2 ? arg2 : class510.field7263;
        if (class473.field6886 == this) {
            return 0;
        } else if (class751.field10504 == this) {
            return var4 - arg1;
        } else if (class241.field3508 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field10052++;
        throw new IllegalStateException();
    }
}
