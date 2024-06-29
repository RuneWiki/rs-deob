import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class143 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lwf;")
    public static class79 field1893 = new class79(29, 3);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[S")
    public static short[] field1894 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lku;")
    public static class232 field1895 = new class232(260);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1897 = new String[100];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method895(byte arg0) {
        field1893 = null;
        field1897 = null;
        field1895 = null;
        field1894 = null;
        if (arg0 < 79) {
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Luj;")
    public static final class237 method896(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1082;
    }
}
