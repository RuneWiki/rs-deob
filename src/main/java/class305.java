import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class305 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
    private boolean field4575;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method2074(ByteBuffer arg0) {
        GL var2 = class67.field899;
        var2.glBindBufferARB(34963, this.field4577);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4575 ? 35040 : 35044);
        class180.field2409 += arg0.limit() - this.field4578;
        this.field4578 = arg0.limit();
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 17)
    public final void method2075(ByteBuffer arg0) {
        GL var2 = class67.field899;
        var2.glBindBufferARB(34962, this.field4577);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4575 ? 35040 : 35044);
        class180.field2409 += arg0.limit() - this.field4578;
        this.field4578 = arg0.limit();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 28)
    public final void method2076() {
        GL var1 = class67.field899;
        var1.glBindBufferARB(34962, this.field4577);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 33)
    public final void method2077() {
        GL var1 = class67.field899;
        var1.glBindBufferARB(34963, this.field4577);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method2078(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4578) {
            GL var2 = class67.field899;
            var2.glBindBufferARB(34962, this.field4577);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2075(arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Z)V", line = 69)
    public class305(boolean arg0) {
        this.field4577 = -1;
        this.field4578 = 0;
        GL var2 = class67.field899;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4575 = arg0;
        this.field4577 = var3[0];
        this.field4576 = class180.field2413;
    }

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        if (this.field4577 != -1) {
            class180.method1252(this.field4577, this.field4578, this.field4576);
            this.field4577 = -1;
            this.field4578 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 80)
    public class305() {
        this(false);
    }
}
