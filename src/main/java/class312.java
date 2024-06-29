import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class312 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field4921;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
    private boolean field4918;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    private int field4919;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V", line = 7)
    public final void method2199() {
        GL var1 = class162.field2654;
        var1.glBindBufferARB(34962, this.field4920);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V", line = 13)
    public final void method2200() {
        GL var1 = class162.field2654;
        var1.glBindBufferARB(34963, this.field4920);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 18)
    public final void method2201(ByteBuffer arg0) {
        GL var2 = class162.field2654;
        var2.glBindBufferARB(34963, this.field4920);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4918 ? 35040 : 35044);
        class177.field2823 += arg0.limit() - this.field4921;
        this.field4921 = arg0.limit();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 28)
    public final void method2202(ByteBuffer arg0) {
        GL var2 = class162.field2654;
        var2.glBindBufferARB(34962, this.field4920);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4918 ? 35040 : 35044);
        class177.field2823 += arg0.limit() - this.field4921;
        this.field4921 = arg0.limit();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 37)
    public class312() {
        this(false);
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field4920 != -1) {
            class177.method1301(this.field4920, this.field4921, this.field4919);
            this.field4920 = -1;
            this.field4921 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Z)V", line = 72)
    public class312(boolean arg0) {
        this.field4920 = -1;
        this.field4921 = 0;
        GL var2 = class162.field2654;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4918 = arg0;
        this.field4920 = var3[0];
        this.field4919 = class177.field2819;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 54)
    public final void method2203(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4921) {
            GL var2 = class162.field2654;
            var2.glBindBufferARB(34962, this.field4920);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2202(arg0);
        }
    }
}
