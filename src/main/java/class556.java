import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class556 {

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field7893 = 0;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "F")
    public static float field7892;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "[I")
    public static int[] field7894;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method3212(byte arg0) {
        if (arg0 < 23) {
            method3212((byte) 22);
        }
        field7894 = null;
    }
}
