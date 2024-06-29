import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class23 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "[I")
    public static int[] field200 = new int[1000];

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Ldg;")
    public static class20 field201;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 50)
    public static void method103(int arg0) {
        field201 = null;
        int var1 = 61 % ((-arg0 - 9) / 61);
        field200 = null;
    }
}
