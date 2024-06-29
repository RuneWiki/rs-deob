import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class237 extends class397 {

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Lgn;")
    public static class475 field3318 = new class475(58, 2);

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        field3320++;
        return arg0 == -780833076 ? class228.field3210 : null;
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        if (arg0 > -104) {
            method1436((byte) -101);
        }
        field3318 = null;
    }
}
