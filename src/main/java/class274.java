import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class274 extends class6 {

    @OriginalMember(owner = "client!up", name = "k", descriptor = "[I")
    public static int[] field3364 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
    public static int[] field3365 = new int[50];

    @OriginalMember(owner = "client!up", name = "m", descriptor = "[I")
    public static int[] field3366;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V", line = 9)
    public static void method1622(byte arg0) {
        field3365 = null;
        if (arg0 == 31) {
            field3366 = null;
            field3364 = null;
        }
    }
}
