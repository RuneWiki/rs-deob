import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class576 {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "[I")
    public static int[] field7964 = new int[1];

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "[I")
    public static int[] field7966 = new int[13];

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Le;")
    public static class479 field7965;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method3247(int arg0) {
        field7965 = null;
        field7964 = null;
        field7966 = null;
        if (arg0 != 0) {
            method3247(-86);
        }
    }
}
