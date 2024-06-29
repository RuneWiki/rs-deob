import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class155 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "D")
    public static double field2124;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[Ls;")
    public static class339[] field2126;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != -5724) {
            method984(66);
        }
        field2126 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static final void method984(int arg0) {
        field2125++;
        if (arg0 != -3) {
            field2124 = -1.8746356167446008D;
        }
        class142.field1971++;
        class120 var1 = class292.method1716(class608.field8668, true, class706.field9851);
        var1.field1653.method147((byte) 53, class19.field236);
        class471.method2805(127, var1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
    public static final boolean method985(int arg0, int arg1) {
        field2127++;
        int var2 = -89 / ((arg1 - 37) / 60);
        return arg0 == 0 || arg0 == 2;
    }
}
