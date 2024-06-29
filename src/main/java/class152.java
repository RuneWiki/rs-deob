import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class152 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    public static int[] field2375 = new int[200];

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[Ls;")
    public static class339[] field2374;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field2375 = null;
        if (arg0 == 0) {
            field2374 = null;
        }
    }
}
