import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class95 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
    public static boolean field1662 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)I")
    public final int method892(int arg0, int arg1, byte arg2) {
        field1663++;
        int var4 = arg0 < class467.field6559 ? class467.field6559 : arg0;
        if (class311.field4330 == this) {
            return 0;
        }
        if (arg2 >= -103) {
            field1662 = true;
        }
        if (class426.field6126 == this) {
            return var4 - arg1;
        } else if (class416.field6019 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1660++;
        throw new IllegalStateException();
    }
}
