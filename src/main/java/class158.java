import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class158 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([[IB)V")
    public static final void method1142(int[][] arg0, byte arg1) {
        class402.field5946 = arg0;
        if (arg1 != 113) {
            method1142(null, (byte) 110);
        }
        field2409++;
    }
}
