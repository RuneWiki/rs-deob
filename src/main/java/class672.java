import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class672 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9574 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
    public static boolean field9576;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field9577;

    static {
        new class387("", 73);
        field9576 = false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 19)
    public static void method3828(int arg0) {
        if (arg0 == 32) {
            field9577 = null;
            field9574 = null;
        }
    }
}
