import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class115 implements class647 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Lwaa;")
    public static class652 field1492 = new class652(32);

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "F")
    public static float field1495 = 0.0F;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Z")
    public static boolean field1493 = false;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Ljk;")
    public static class585 field1494 = new class585(27, 3);

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Lrf;")
    public static class74 field1497 = new class74();

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "Lrm;")
    public static class377 field1496;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method823(byte arg0) {
        field1494 = null;
        field1497 = null;
        field1492 = null;
        if (arg0 < -50) {
            field1496 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1491++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBII)V")
    public static final void method824(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 85) {
            field1490++;
            class73.field1104 = new byte[arg0][arg2][arg3];
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class115(String arg0, int arg1) {
        this.field1489 = arg1;
    }
}
