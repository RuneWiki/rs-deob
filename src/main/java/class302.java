import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class302 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field4802 = 20;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
    public static int[] field4803 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field4805 = 0;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
    public static boolean field4806 = false;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method2019(int arg0) {
        field4803 = null;
        if (arg0 != -1) {
            method2020(104, false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
    public static final void method2020(int arg0, boolean arg1) {
        field4801++;
        if (class29.field452 == arg1) {
            return;
        }
        class29.field452 = arg1;
        class186.method1179(4);
        if (arg0 <= 90) {
            field4800 = 28;
        }
    }
}
