import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class82 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "[I")
    public static int[] field1176 = new int[2048];

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[I")
    public static int[] field1177;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
    public static final int method673(int arg0) {
        if (arg0 != 2) {
            field1176 = null;
        }
        field1178++;
        return class171.field2093 == null ? 0 : class171.field2093.length * 2;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static void method674(boolean arg0) {
        field1177 = null;
        if (!arg0) {
            field1176 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1179++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(II)V")
    public class82(int arg0, int arg1) {
    }
}
