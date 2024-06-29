import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class286 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
    public static boolean field4661 = false;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "J")
    public static long field4660 = 0L;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4662 = "wave2:";

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Ldf;")
    public static class171 field4663;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2082(int arg0) {
        class98.field1603 = arg0;
        for (int var1 = 0; var1 < class273.field4526; var1++) {
            for (int var2 = 0; var2 < class162.field2574; var2++) {
                if (class129.field2184[arg0][var1][var2] == null) {
                    class129.field2184[arg0][var1][var2] = new class36(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 43)
    public static void method2083(boolean arg0) {
        if (!arg0) {
            field4661 = true;
        }
        field4662 = null;
        field4663 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 67)
    public static final int method2084(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
