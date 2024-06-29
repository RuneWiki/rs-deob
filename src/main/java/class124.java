import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class124 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lva;")
    private static class121 field2830 = class107.method797("Could not complete login)3", -10983);

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lva;")
    public static class121 field2835 = class107.method797("p11_full", -10983);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lva;")
    public static class121 field2836 = field2830;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lm;")
    public static class72 field2832;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lm;")
    public static class72 field2833;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 17)
    public static void method977(int arg0) {
        field2836 = null;
        field2833 = null;
        field2830 = null;
        field2832 = null;
        field2835 = null;
        if (arg0 <= 5) {
            field2836 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method978(boolean arg0) {
        field2834++;
        for (int var1 = -1; var1 < class13.field231; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class71.field1680[var1];
            }
            class77 var3 = class127.field2895[var2];
            if (var3 != null) {
                class66.method467(var3, 1, 0);
            }
        }
        if (arg0) {
            method977(37);
        }
    }
}
