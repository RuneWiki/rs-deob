import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Z")
    public static boolean field946 = false;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lwm;")
    public static class152 field951 = class157.method1048("(Y<)4col>", 118);

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Z")
    public static boolean field949 = true;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Z")
    public static boolean field947 = false;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lfd;")
    public static class243 field948 = new class243(16);

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    public static int[] field952;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILwm;)I", line = 11)
    public static final int method408(int arg0, class152 arg1) {
        field950++;
        if (class194.field3086 == null || arg1.method1000(0) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class194.field3086.field4773; var2++) {
            if (class194.field3086.field4766[var2].method987(class114.field1617, class26.field449, -1).method992(23292, arg1)) {
                return var2;
            }
        }
        int var3 = -41 / ((arg0 - 60) / 45);
        return -1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 35)
    public static void method409(byte arg0) {
        field948 = null;
        field952 = null;
        field951 = null;
        if (arg0 != 75) {
            method409((byte) -70);
        }
    }
}
