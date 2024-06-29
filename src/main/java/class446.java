import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class446 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lsk;")
    public static class423 field6865 = new class423("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field6866 = -50;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method2668(byte arg0) {
        field6865 = null;
        if (arg0 >= -103) {
            field6865 = null;
        }
    }
}
