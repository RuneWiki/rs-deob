import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class104 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lfh;")
    public static class266 field1393 = new class266(4, 17);

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1394 = new String[100];

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lf;")
    public static class536 field1392;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1393 = null;
        if (arg0 != 91) {
            method590((byte) 62);
        }
        field1394 = null;
        field1392 = null;
    }

    @OriginalMember(owner = "client!pk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1395++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class104(String arg0, int arg1) {
        this.field1391 = arg1;
    }
}
