import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class529 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
    public static boolean field7737 = true;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    public static int[] field7736 = new int[2];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7738 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lvj;")
    public static class316 field7739;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 10)
    public static void method3130(int arg0) {
        field7739 = null;
        field7736 = null;
        if (arg0 != 0) {
            method3130(93);
        }
    }
}
