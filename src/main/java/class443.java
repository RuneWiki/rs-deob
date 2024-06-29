import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class443 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "[I")
    public static int[] field6164 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6167 = null;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "[Z")
    public static boolean[] field6170 = new boolean[100];

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Lvo;")
    public static class41 field6166;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 7)
    public static void method2656(int arg0) {
        field6164 = null;
        field6170 = null;
        field6167 = null;
        int var1 = 72 / ((-arg0 - 57) / 63);
        field6166 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIII)V", line = 19)
    public static final void method2657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6169++;
        if (arg0 == arg3) {
            class348.method2187(arg4, arg3, arg2, (byte) 127, arg5);
            return;
        }
        if (arg1 != 1) {
            method2658(null, (byte) 60);
        }
        if (arg5 - arg3 >= class156.field2337 && arg3 + arg5 <= class612.field8854 && class558.field7940 <= (arg4 - arg0) && class748.field10458 >= arg0 + arg4) {
            class58.method557(arg4, arg0, arg1 ^ 0x1, arg2, arg5, arg3);
        } else {
            class186.method1321(arg0, -25399, arg2, arg4, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 45)
    public static final boolean method2658(String arg0, byte arg1) {
        field6165++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class425.field5945; var2++) {
            if (arg0.equalsIgnoreCase(class583.field8236[var2])) {
                return true;
            }
        }
        if (arg1 <= 113) {
            field6167 = null;
        }
        return arg0.equalsIgnoreCase(class468.field6748.field4939);
    }
}
