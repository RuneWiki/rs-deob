import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class438 {

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "[Z")
    public static boolean[] field6082 = new boolean[100];

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lss;")
    public static class307 field6080 = new class307("", 11);

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Z")
    public static boolean field6083 = true;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "[I")
    public static int[] field6085 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "J")
    public static long field6081;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
    public static void method2609(int arg0) {
        field6085 = null;
        if (arg0 != -28192) {
            method2609(-24);
        }
        field6082 = null;
        field6080 = null;
    }
}
