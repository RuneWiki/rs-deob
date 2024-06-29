import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class390 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lnj;")
    public static class133 field5715;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
    public static boolean field5714;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 5)
    public static void method2494(int arg0) {
        if (arg0 != -17204) {
            method2494(105);
        }
        field5715 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZ)V", line = 15)
    public static final void method2495(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        if (arg0) {
            class233.field3168++;
            class323.method1997(5027);
        }
        field5716++;
        if (arg1) {
            class295.field4220++;
            class237.method1517(!arg2);
        }
    }
}
