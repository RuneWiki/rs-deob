import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 extends class86 {

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lbe;")
    public static class283 field364 = class153.method941(126, "ul");

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Lbe;")
    public static class283 field362 = class153.method941(-109, ":duelstake:");

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Lbe;")
    private static class283 field370 = class153.method941(-34, "wishes to trade with you)3");

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Lbe;")
    public static class283 field365 = field370;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "B")
    public byte field369;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lbe;")
    public class283 field360;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Lbe;")
    public class283 field363;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 43)
    public static void method171(int arg0) {
        field370 = null;
        if (arg0 == -1) {
            field365 = null;
            field364 = null;
            field362 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 69)
    public static final void method172(int arg0, int arg1) {
        field359++;
        if (arg0 == -1 || !class92.method588(arg0, -97)) {
            return;
        }
        class69[] var2 = class122.field2036[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class69 var4 = var2[var3];
            if (var4.field1003 != null) {
                class231 var5 = new class231();
                var5.field3912 = var4;
                var5.field3919 = var4.field1003;
                class231.method1561(arg1 + 114, var5, 2000000);
            }
        }
    }
}
