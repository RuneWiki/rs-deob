import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class261 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    public static int[] field3311 = new int[4];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lpfa;")
    public static class275 field3309;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lpfa;")
    public static class275 field3310;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field3311 = null;
        field3310 = null;
        if (arg0 == 4) {
            field3309 = null;
        }
    }
}
