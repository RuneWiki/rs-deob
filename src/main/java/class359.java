import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class359 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field5567 = 2;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lgf;")
    public static class46 field5568 = new class46("", 13);

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "[I")
    public static int[] field5571 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
    public static boolean field5570 = true;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Leq;")
    public static class259 field5569;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method2376(int arg0) {
        if (arg0 != 13) {
            method2376(29);
        }
        field5568 = null;
        field5569 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLnu;)V")
    public static final void method2377(boolean arg0, class313 arg1) {
        arg1.field4909 = arg0;
        field5572++;
        if (arg1.field4908 != null) {
            arg1.field4908.field7440 = 0;
        }
        for (class313 var2 = arg1.method374(); var2 != null; var2 = arg1.method400()) {
            method2377(arg0, var2);
        }
    }
}
