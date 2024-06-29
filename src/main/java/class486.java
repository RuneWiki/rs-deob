import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class486 extends class239 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lsl;")
    public static class318 field7137 = new class318(62, 8);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field7140 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method2922(byte arg0) {
        if (arg0 == -44) {
            field7137 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7136++;
        class199 var10 = null;
        for (class199 var11 = (class199) class212.field3057.method1018(63); var11 != null; var11 = (class199) class212.field3057.method1022((byte) -112)) {
            if (var11.field2909 == arg7 && var11.field2901 == arg0 && var11.field2898 == arg5 && var11.field2900 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class199();
            var10.field2901 = arg0;
            var10.field2898 = arg5;
            var10.field2900 = arg4;
            var10.field2909 = arg7;
            if (arg0 >= 0 && arg5 >= 0 && class397.field5828 > arg0 && class457.field6713 > arg5) {
                class256.method1645(16, var10);
            }
            class212.field3057.method1015(false, var10);
        }
        var10.field2902 = arg3;
        var10.field2914 = arg8;
        var10.field2904 = arg1;
        if (arg6 > -105) {
            field7135 = -119;
        }
        var10.field2907 = arg9;
        var10.field2910 = arg2;
    }
}
