import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class194 extends class107 {

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lwia;")
    public static class791 field2993;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIIII)V", line = 3)
    public static final void method1351(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2994++;
        class589[] var7 = class693.field9665;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class589 var9 = var7[var8];
            if (var9 != null && var9.field8302 == 2) {
                class363.method2280(arg3, 25959, var9.field8313 * 2, var9.field8305, var9.field8311, arg2 >> 1, arg4, var9.field8309, arg6 >> 1);
                if (class470.field6591[0] > -1 && class192.field2961 % 20 < 10) {
                    class241 var10 = class454.field6372[var9.field8300];
                    int var11 = class470.field6591[0] + arg0 - 12;
                    int var12 = class470.field6591[1] + arg5 - 28;
                    var10.method1604(var11, var12);
                    class33.method272(var11, var12, var12 + var10.method1505(), false, var10.method1507() + var11);
                }
            }
        }
        if (arg1 >= -14) {
            field2992 = 85;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 48)
    public static void method1352(boolean arg0) {
        field2993 = null;
        if (arg0) {
            field2992 = 14;
        }
    }
}
