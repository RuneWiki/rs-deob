import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class125 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[I")
    public static int[] field1717 = new int[14];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I", line = 3)
    public final int method779(int arg0, int arg1, int arg2) {
        field1716++;
        if (arg2 != 14) {
            return 69;
        }
        int var4 = class553.field7716 > arg1 ? class553.field7716 : arg1;
        if (class471.field6531 == this) {
            return 0;
        } else if (class123.field1649 == this) {
            return var4 - arg0;
        } else if (class749.field10301 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 28)
    public static void method780(int arg0) {
        field1717 = null;
        if (arg0 > -51) {
            field1717 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;", line = 40)
    public final String toString() {
        field1718++;
        throw new IllegalStateException();
    }
}
