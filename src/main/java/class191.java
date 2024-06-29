import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class191 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lsc;")
    public static class181 field3364 = class149.method967(255, "Standort");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lsc;")
    public static class181 field3363 = class149.method967(255, "<)4col> x");

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lsc;")
    public static class181 field3365 = class149.method967(255, "::");

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public static final void method1318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3366++;
        if (arg4 > -3) {
            method1319(124);
        }
        for (int var5 = 0; var5 < class207.field3551; var5++) {
            if ((class62.field957[var5] + class25.field434[var5]) > arg1 && class25.field434[var5] < (arg0 + arg1) && class258.field4508[var5] + class137.field2252[var5] > arg2 && class137.field2252[var5] < arg2 + arg3) {
                class61.field943[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field3364 = null;
        if (arg0 != -30185) {
            method1319(-98);
        }
        field3363 = null;
        field3365 = null;
    }
}
