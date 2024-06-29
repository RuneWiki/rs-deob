import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class127 {

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "[I")
    public static int[] field1954 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Z")
    public static boolean field1955 = true;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method953(int arg0) {
        field1954 = null;
        if (arg0 != -21830) {
            method953(-8);
        }
    }
}
