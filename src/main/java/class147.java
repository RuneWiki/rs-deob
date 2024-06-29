import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class147 extends class108 {

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
    public static int[] field1898 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ldg;")
    public static class20 field1899;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ln;")
    public static class473 field1901;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method801(int arg0) {
        field1901 = null;
        if (arg0 != 36069) {
            field1899 = null;
        }
        field1899 = null;
        field1898 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        field1900++;
        if (arg0 != 49) {
            field1901 = null;
        }
        if (class288.field3759 != null) {
            class288.field3759.method339(16384);
        }
        if (class226.field2891 != null) {
            class226.field2891.method339(16384);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class147() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
    public class147(int arg0) {
        this.field1902 = arg0;
    }
}
