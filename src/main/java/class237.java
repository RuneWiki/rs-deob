import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class237 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lht;")
    private class410 field3267;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field3268;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lht;[BI)V", line = 4)
    public class237(class410 arg0, byte[] arg1, int arg2) {
        this.field3267 = arg0;
        this.field3268 = this.field3267.field5862.method2627(arg2);
        if (arg1 != null) {
            this.field3268.method2616(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)V", line = 16)
    public final void method1379(byte[] arg0, int arg1) {
        if (this.field3268 == null || this.field3268.field6403 < arg1) {
            this.field3268 = this.field3267.field5862.method2627(arg1);
        }
        this.field3268.method2616(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lht;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class237(class410 arg0, NativeBuffer arg1) {
        this.field3267 = arg0;
        this.field3268 = arg1;
    }
}
