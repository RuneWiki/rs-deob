import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class333 {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Lih;")
    private class503 field4835;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field4834;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1991(byte[] arg0, int arg1) {
        if (this.field4834 == null || this.field4834.field6249 < arg1) {
            this.field4834 = this.field4835.field7312.method2619(arg1);
        }
        this.field4834.method2608(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lih;[BI)V", line = 12)
    public class333(class503 arg0, byte[] arg1, int arg2) {
        this.field4835 = arg0;
        this.field4834 = this.field4835.field7312.method2619(arg2);
        if (arg1 != null) {
            this.field4834.method2608(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lih;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class333(class503 arg0, NativeBuffer arg1) {
        this.field4835 = arg0;
        this.field4834 = arg1;
    }
}
