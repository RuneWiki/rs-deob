import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class541 {

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field7492 = -1;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "[I")
    public static int[] field7493 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public static void method3130(byte arg0) {
        field7493 = null;
        if (arg0 > -22) {
            method3130((byte) -39);
        }
    }
}
