import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class334 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lpe;")
    public class123 field4875 = new class123();

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    public boolean field4877 = false;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field4873 = 0;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
    public static final void method2045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class436.field6304 != null) {
            class436.field6304[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class92.field1512 != null) {
            class92.field1512[arg0][arg1] = (short) arg3;
        }
        if (class34.field526 != null) {
            class34.field526[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Lgk;")
    public static final class468 method2046(int arg0) {
        field4876++;
        class29.field427 = 0;
        if (arg0 != -15401) {
            method2046(-4);
        }
        return class225.method1399(0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(JI)V")
    public static final void method2047(long arg0, int arg1) {
        field4879++;
        if ((long) arg1 >= arg0) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class331.method1956(arg0 - 1L, true);
            class331.method1956(1L, true);
        } else {
            class331.method1956(arg0, true);
        }
    }
}
