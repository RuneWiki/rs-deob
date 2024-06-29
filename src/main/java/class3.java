import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lui;")
    public static class266 field13;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    public static int[] field14;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 7)
    public static void method5(int arg0) {
        field13 = null;
        field14 = null;
        if (arg0 != 0) {
            method5(-128);
        }
    }
}
