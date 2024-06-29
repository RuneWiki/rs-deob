import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 extends class292 {

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "[B")
    public byte[] field579;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "[I")
    public static int[] field576 = new int[2048];

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    public static void method279(int arg0) {
        field576 = null;
        if (arg0 != 1) {
            field578 = 123;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Luf;ZLqa;Luf;)V")
    public static final void method280(class176 arg0, boolean arg1, class152 arg2, class176 arg3) {
        class289.field4555 = arg3;
        field577++;
        class130.field2021 = arg0;
        class57.field883 = arg2;
        if (class289.field4555 != null) {
            class147.field2276 = class289.field4555.method1165(3, 1);
        }
        if (class130.field2021 != null) {
            class149.field2298 = class130.field2021.method1165(3, 1);
        }
        if (arg1) {
            field578 = -5;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        this.field579 = arg0;
    }
}
