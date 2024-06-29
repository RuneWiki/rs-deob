import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class147 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Lwq;")
    public static class492 field1903 = new class492();

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1092(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            field1904++;
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 18)
    public static void method1093(int arg0) {
        field1903 = null;
        if (arg0 != 12) {
            field1903 = null;
        }
    }
}
