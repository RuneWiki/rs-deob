import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class74 implements class570 {

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lak;")
    public static class293 field1188 = new class293(16);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class74(String arg0, int arg1) {
        this.field1185 = arg1;
    }

    @OriginalMember(owner = "client!fca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1187++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
    public static void method581(boolean arg0) {
        if (!arg0) {
            field1188 = null;
        }
        field1188 = null;
    }
}
