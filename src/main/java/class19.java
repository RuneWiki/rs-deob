import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class19 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[I")
    public static int[] field250 = new int[4];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lui;")
    public static class194 field249 = new class194();

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 9)
    public static void method125(int arg0) {
        field249 = null;
        if (arg0 == 4) {
            field250 = null;
        }
    }
}
