import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class553 {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "Lfia;")
    public static class577 field7717 = new class577(15, 0, 1, 0);

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field7718 = -1;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field7719 = 0;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Z")
    public static boolean field7720 = false;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method3205(int arg0) {
        if (arg0 == -1) {
            field7717 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZ)V")
    public static final void method3206(int arg0, boolean arg1) {
        field7716++;
        class104.method822((byte) -104);
        int var2 = class115.field1703.method720(arg0, 16).field4621;
        if (var2 == 0) {
            return;
        }
        int var3 = class516.field7236.field5190[arg0];
        if (var2 == 6) {
            class558.field7756 = var3;
        }
        if (arg1) {
            field7719 = 98;
        }
        if (var2 == 5) {
            class517.field7244 = var3;
        }
    }
}
