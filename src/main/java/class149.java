import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class149 extends class425 {

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "[I")
    public static int[] field2559;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field2559 = null;
        if (arg0 != 65536) {
            field2559 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
    public static final boolean method1178(int arg0, int arg1, int arg2) {
        field2561++;
        int var3 = -57 / ((arg1 + 90) / 32);
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(I)V")
    public class149(int arg0) {
        this.field2560 = arg0;
    }
}
