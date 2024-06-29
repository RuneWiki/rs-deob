import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class455 {

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "[I")
    public static int[] field6218 = new int[32];

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "Lin;")
    public static class380 field6219 = new class380(90, 0);

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "Z")
    public static boolean field6220;

    @OriginalMember(owner = "client!rha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6221++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V")
    public static void method2670(byte arg0) {
        field6218 = null;
        if (arg0 >= 126) {
            field6219 = null;
        }
    }
}
