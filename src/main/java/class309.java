import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class309 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
    public static int[] field4773 = new int[5];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4774 = "Loaded textures";

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
    public static volatile boolean field4776 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field4769 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[Lsf;")
    public static class139[] field4777 = new class139[29];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lrn;")
    public static class18 field4778;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lrg;")
    public static class342 field4775;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lqn;")
    public static class361 field4771;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2202(boolean arg0) {
        field4774 = null;
        field4771 = null;
        field4775 = null;
        field4773 = null;
        field4769 = null;
        if (arg0) {
            method2202(true);
        }
        field4777 = null;
        field4778 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V", line = 23)
    public static final void method2203(int arg0, int arg1, boolean arg2) {
        field4770++;
        class78.field1130 = new class66(arg1);
        class87.field1247 = new class66(arg0);
        if (arg2) {
            method2202(false);
        }
    }
}
