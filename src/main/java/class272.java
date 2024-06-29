import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class272 extends class81 {

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[Z")
    public static boolean[] field3671 = new boolean[100];

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field3673;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
    public static void method1658(byte arg0) {
        field3673 = null;
        field3671 = null;
        int var1 = -18 % ((arg0 - 80) / 42);
    }
}
