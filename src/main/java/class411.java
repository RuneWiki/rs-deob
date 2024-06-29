import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class411 extends class439 {

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/String;")
    public String field6046;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lvp;")
    public static class123 field6044 = new class123(10, 0);

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[I")
    public static int[] field6047 = new int[32];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "F")
    public static float field6048;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lqs;")
    public static class425 field6045;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method2541(byte arg0) {
        field6047 = null;
        if (arg0 < 52) {
            method2541((byte) -30);
        }
        field6044 = null;
        field6045 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class411() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class411(String arg0) {
        this.field6046 = arg0;
    }

    static {
        new class180("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
