import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class544 {

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
    public static boolean field7585 = false;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "Lja;")
    public static class254 field7586 = new class254(11, 0, 1, 2);

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "F")
    public static float field7587;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "F")
    public static float field7589;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "[I")
    public static int[] field7588;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
    public static void method3132(byte arg0) {
        field7586 = null;
        field7588 = null;
        if (arg0 != 5) {
            method3132((byte) 46);
        }
    }
}
