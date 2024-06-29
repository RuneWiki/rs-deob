import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class454 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lvj;")
    private class422 field6491;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public int field6490;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lbo;")
    public static class245 field6489;

    @OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6488++;
        this.field6491.method2380((byte) 63, this.field6490);
        super.finalize();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method2615(int arg0) {
        field6489 = null;
        if (arg0 != 3827) {
            field6489 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lvj;II)V")
    public class454(class422 arg0, int arg1, int arg2) {
        this.field6491 = arg0;
        this.field6490 = arg2;
    }
}
