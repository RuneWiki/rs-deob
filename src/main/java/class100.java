import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class100 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2105 = 0;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field2106 = new int[50];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)Z")
    public static final boolean method808(boolean arg0, int arg1) {
        field2104++;
        if (arg0) {
            field2103 = -23;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method809(boolean arg0) {
        if (!arg0) {
            field2102 = 37;
        }
        field2106 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Leh;")
    public static final class47 method810(int arg0, boolean arg1) {
        field2101++;
        if (arg1) {
            return null;
        } else if (class80.field1731[arg0].method376(-43) > 0) {
            return class5.method24(new class47[] { class166.field3224[arg0], class26.field492, class80.field1731[arg0] }, (byte) 119);
        } else {
            return class166.field3224[arg0];
        }
    }
}
