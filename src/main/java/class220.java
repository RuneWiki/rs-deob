import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class220 {

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "[I")
    public static int[] field2870 = new int[8];

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "Lga;")
    public static class332 field2871;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V", line = 14)
    public static void method1386(int arg0) {
        if (arg0 != -10990) {
            method1386(93);
        }
        field2871 = null;
        field2870 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIIII)V", line = 29)
    public static final void method1387(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2873++;
        if (arg1) {
            return;
        }
        if (class281.field3703 <= arg3 && class255.field3350 >= arg2 && arg5 >= class6.field66 && class151.field2071 >= arg0) {
            class440.method2486(arg2, arg3, arg4, arg0, arg5, 0);
        } else {
            class631.method3500(arg3, arg2, 32574, arg0, arg5, arg4);
        }
    }
}
