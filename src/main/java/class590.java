import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class590 extends class93 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
    public static boolean field8734 = false;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    public static int[] field8735 = new int[1];

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lqu;")
    public static class364 field8733 = new class364(24, 0);

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
    public static boolean field8736 = false;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 6)
    public static void method3438(int arg0) {
        if (arg0 < 58) {
            method3438(117);
        }
        field8735 = null;
        field8733 = null;
    }
}
