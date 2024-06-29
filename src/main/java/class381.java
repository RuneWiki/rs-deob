import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class381 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lib;")
    public static class105 field5778;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    public static int[] field5776;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method2372(boolean arg0) {
        field5778 = null;
        field5776 = null;
        if (arg0) {
            field5776 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method2373(int arg0, int arg1) {
        if (arg0 == 22683) {
            field5777++;
            return arg1 & 0xFF;
        } else {
            return 36;
        }
    }
}
