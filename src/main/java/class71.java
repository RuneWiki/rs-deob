import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Lgs;")
    public static class49 field1048;

    @OriginalMember(owner = "client!qn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1047++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
    public final int method630(byte arg0) {
        field1046++;
        return arg0 == -65 ? this.field1045 : -40;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class71(String arg0, int arg1) {
        this.field1045 = arg1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
    public static void method631(byte arg0) {
        if (arg0 == -83) {
            field1048 = null;
        }
    }
}
