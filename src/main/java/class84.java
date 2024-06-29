import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class84 {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[Z")
    public static boolean[] field1367 = new boolean[5];

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "[S")
    public static short[] field1365 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "Lm;")
    public static class163 field1366;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1366 = null;
        field1365 = null;
        field1367 = null;
        if (arg0 != 12877) {
            field1367 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1364++;
        if (!class377.method2232(124, arg1)) {
            return;
        }
        int var10 = -95 / ((arg8 + 53) / 55);
        if (class75.field1198[arg1] == null) {
            client.method1545(class618.field8850[arg1], -1, arg2, arg0, arg7, arg4, arg9, arg5, arg6, arg3);
        } else {
            client.method1545(class75.field1198[arg1], -1, arg2, arg0, arg7, arg4, arg9, arg5, arg6, arg3);
        }
    }
}
