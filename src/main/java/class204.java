import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class204 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2366 = 4;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2368 = new String[100];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1185(int arg0, int arg1) {
        if (class76.field1000 == 0) {
            class367.field4751.method1984(-127, arg0);
        } else {
            class60.field757 = arg0;
        }
        int var2 = -63 % ((22 - arg1) / 39);
        field2365++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 28)
    public static void method1186(int arg0) {
        if (arg0 == 9) {
            field2368 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)Ljava/lang/String;", line = 38)
    public static final String method1187(int arg0, int arg1) {
        field2367++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - arg1; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class671.field9147.method3726((byte) 78, class71.field912) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class671.field9149.method3726((byte) 59, class71.field912) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
