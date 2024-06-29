import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class338 {

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4988 = null;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "[I")
    public static int[] field4985 = new int[2];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2128(int arg0) {
        field4986++;
        if (arg0 != 1) {
            method2130(-6, false);
        }
        class555.field7856.method1409((byte) 119);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V", line = 42)
    public static void method2129(boolean arg0) {
        if (!arg0) {
            field4985 = null;
        }
        field4985 = null;
        field4988 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V", line = 53)
    public static final void method2130(int arg0, boolean arg1) {
        field4987++;
        if (arg1) {
            method2128(84);
        }
        for (class665 var2 = class219.field3065.method1407(7); var2 != null; var2 = class219.field3065.method1413(true)) {
            if ((long) arg0 == (var2.field9386 >> 48 & 0xFFFFL)) {
                var2.method3678(-1);
            }
        }
    }
}
