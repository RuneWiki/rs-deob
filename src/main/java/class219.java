import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class219 {

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Ltb;")
    public static class450 field2682 = new class450(64);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 3)
    public static void method1298(byte arg0) {
        if (arg0 <= 99) {
            method1298((byte) -59);
        }
        field2682 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 20)
    public static final String[] method1299(int arg0, String[] arg1) {
        field2681++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0 < 43) {
            return null;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
            var3++;
        }
        return var2;
    }
}
