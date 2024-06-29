import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class351 extends class58 implements class159 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    private int field4835;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lfu;I[BI)V", line = 3)
    public class351(class42 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4834 = arg1;
        this.field4835 = this.field841.method311(this.field4834);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I[BI)V", line = 9)
    public final void method1034(int arg0, byte[] arg1, int arg2) {
        this.method525(arg1, arg2);
        this.field4834 = arg0;
        this.field4835 = this.field841.method311(this.field4834);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "()I", line = 14)
    public final int method464() {
        return 0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 19)
    public final void method1033(int arg0, int arg1, int arg2) {
        this.field841.field557.glDrawElements(arg0, arg2, this.field4834, this.field842.position(this.field4835 * arg1));
    }
}
