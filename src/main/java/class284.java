import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class284 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
    public static int[] field3876 = new int[5];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3877 = 2;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
    public static int[] field3878;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field3879;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1670(boolean arg0) {
        if (arg0) {
            field3878 = null;
            field3876 = null;
            field3879 = null;
        }
    }
}
