import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class142 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lbu;")
    private class17 field2249;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field2246 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2250 = new String[100];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "F")
    public static float field2251;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 22422) {
            return;
        }
        for (class418 var7 = (class418) class343.field5157.method1640(false); var7 != null; var7 = (class418) class343.field5157.method1641(true)) {
            if (class531.field7821 >= var7.field6244) {
                var7.method360(true);
            } else {
                class219.method1463(arg0 >> 1, arg6, var7.field6242, var7.field6243 * 2, (var7.field6248 << 7) + 64, arg1 >> 1, arg3, (byte) 97, (var7.field6245 << 7) + 64);
                class310.field4726.method2900(var7.field6249, var7.field6246 | 0xFF000000, -110, 0, class72.field1246[1] + arg5, class72.field1246[0] + arg2);
            }
        }
        field2247++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1054(int arg0) {
        if (arg0 != 15) {
            method1054(-106);
        }
        field2250 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Loq;ILbu;)V")
    public class142(class239 arg0, int arg1, class17 arg2) {
        new class55(64);
        this.field2249 = arg2;
        this.field2248 = this.field2249.method119(29630, 15);
    }
}
