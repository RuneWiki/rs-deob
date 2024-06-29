import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class212 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lkr;")
    public static class743[] field3047;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIZFIZ)[[I", line = 5)
    public static final int[][] method1486(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, int arg7, boolean arg8) {
        field3049++;
        if (!arg8) {
            field3047 = null;
        }
        int[][] var9 = new int[arg3][arg7];
        class313 var10 = new class313();
        var10.field4416 = arg5;
        var10.field4431 = (int) (arg6 * 4096.0F);
        var10.field4425 = arg0;
        var10.field4419 = arg2;
        var10.field4430 = arg4;
        var10.method121(false);
        class458.method2795(arg3, -1, arg7);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method2026(var11, var9[var11], 2);
        }
        return var9;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 38)
    public static void method1487(int arg0) {
        field3047 = null;
        if (arg0 != 0) {
            field3047 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 49)
    public static final boolean method1488(String arg0, byte arg1) {
        field3050++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class222.field3169; var2++) {
            if (arg0.equalsIgnoreCase(class349.field4928[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class186.field2673[var2])) {
                return true;
            }
        }
        if (arg1 != 19) {
            field3047 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lir;B)Lir;")
    public abstract class26 method435(class26 arg0, byte arg1);
}
