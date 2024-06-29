import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class198 extends class436 {

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field2739 = -1;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "Z")
    public static boolean field2742 = false;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "[Lqi;")
    public static class337[] field2743;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 5)
    public class198() {
        super(0, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lqj;Lqj;Lqj;ILqj;)V", line = 8)
    public static final void method1324(class296 arg0, class296 arg1, class296 arg2, int arg3, class296 arg4) {
        class91.field1373 = arg0;
        class120.field1700 = arg1;
        class89.field1352 = arg2;
        class287.field3952 = arg4;
        field2741++;
        if (arg3 != -1) {
            method1325(false);
        }
        class333.field4511 = new class383[class120.field1700.method1915(109)][];
        class270.field3678 = new boolean[class120.field1700.method1915(84)];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 31)
    public static void method1325(boolean arg0) {
        if (arg0) {
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method14(int arg0, int arg1) {
        field2740++;
        return arg1 == 18338 ? class249.field3455 : null;
    }
}
