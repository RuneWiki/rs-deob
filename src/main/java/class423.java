import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class423 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6296 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lmia;")
    public static class63 field6298 = new class63(21, -1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 7)
    public static void method2652(int arg0) {
        if (arg0 != -13424) {
            field6298 = null;
        }
        field6298 = null;
        field6296 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)Z", line = 27)
    public static final boolean method2653(int arg0, int arg1, boolean arg2) {
        field6295++;
        if (arg2) {
            field6297 = 42;
        }
        return (arg0 & 0x100) != 0;
    }
}
