import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[[I")
    public static int[][] field249 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lul;")
    public static class406 field250;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V", line = 3)
    public static final void method161(int arg0, int arg1, int arg2) {
        field252++;
        class211 var3 = class452.method2749(arg1, 127, arg0);
        var3.method1463(0);
        var3.field3441 = arg2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 16)
    public static void method162(byte arg0) {
        field250 = null;
        if (arg0 != 96) {
            method163(-29, -110, -11, (byte) -3, 0);
        }
        field249 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIBI)V", line = 29)
    public static final void method163(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 112) {
            method162((byte) -35);
        }
        if (class404.field5987 <= arg2 && arg2 <= class433.field6414) {
            int var5 = class385.method2403(class184.field2777, class327.field4931, arg4, true);
            int var6 = class385.method2403(class184.field2777, class327.field4931, arg1, true);
            class346.method2155(arg2, var6, var5, arg0, -85);
        }
        field251++;
    }
}
