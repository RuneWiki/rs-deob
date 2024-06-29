import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class130 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
    public static int[] field1592 = new int[1];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
    public static volatile boolean field1593 = false;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method735(int arg0) {
        if (arg0 <= 116) {
            method735(-60);
        }
        field1592 = null;
    }
}
