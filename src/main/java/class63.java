import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    public static int[] field953 = new int[14];

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "F")
    public static float field950;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field951;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 6)
    public static void method551(boolean arg0) {
        field951 = null;
        field953 = null;
        if (!arg0) {
            field950 = -1.4388074F;
        }
    }
}
