import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class545 extends class569 {

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Z")
    public static boolean field7263 = false;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
    public static int[] field7264 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 3)
    public static void method2942(int arg0) {
        field7264 = null;
        if (arg0 != -3127) {
            field7263 = false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V", line = 16)
    public static final void method2943(int arg0) {
        if (class32.field452.method1026()) {
            class32.field452.method1020(class500.field6585);
            class71.method420(true);
            class32.field452.method1073(class500.field6585);
            class32.field452.method1086(class500.field6585);
        } else {
            class393.method2111(class651.field9191, true);
        }
        field7266++;
        class544.method2941(0);
        if (arg0 != 4) {
            method2943(52);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V", line = 40)
    public class545(int arg0) {
        this.field7265 = arg0;
    }
}
