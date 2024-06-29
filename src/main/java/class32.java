import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class32 extends class416 {

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[Ltda;")
    public static class638[] field495 = new class638[75];

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "[Lgfa;")
    public static class753[] field496 = new class753[2048];

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method273(int arg0);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
    public abstract boolean method274(byte arg0);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(Z)V")
    public static void method275(boolean arg0) {
        field496 = null;
        if (!arg0) {
            field495 = null;
        }
        field495 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
    public class32(int arg0) {
        this.field493 = arg0;
    }
}
