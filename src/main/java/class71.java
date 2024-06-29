import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class71 extends class529 {

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field952 = 1407;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Lgg;")
    public static class114 field954 = new class114(64);

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 4)
    public static void method528(boolean arg0) {
        field954 = null;
        if (!arg0) {
            field952 = -6;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 14)
    public class71() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)[I", line = 18)
    public final int[] method191(int arg0, byte arg1) {
        field953++;
        int var3 = 33 / ((27 - arg1) / 49);
        return class225.field2973;
    }
}
