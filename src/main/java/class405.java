import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class405 {

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5160 = new String[200];

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field5159;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I", line = 6)
    public final int method2299(byte arg0) {
        field5157++;
        return arg0 <= 1 ? -15 : this.field5156;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 20)
    public static void method2300(byte arg0) {
        if (arg0 < -72) {
            field5160 = null;
            field5159 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 32)
    public final String toString() {
        field5155++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 42)
    public class405(String arg0, int arg1) {
        this.field5156 = arg1;
    }
}
