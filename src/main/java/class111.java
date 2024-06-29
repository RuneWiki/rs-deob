import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class111 {

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Ljava/lang/String;")
    public String field1717;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ldea;")
    public static class205 field1715 = new class205(16);

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1721 = -2;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Lio;")
    public static class370 field1718 = new class370();

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field1715 = null;
        field1718 = null;
        if (arg0 >= -77) {
            method778((byte) 42);
        }
    }

    @OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1716++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class111(String arg0, int arg1) {
        this.field1720 = arg1;
        this.field1717 = arg0;
    }
}
