import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class34 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
    private boolean field421;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 5)
    public final void method216(ByteBuffer arg0) {
        if (arg0.limit() <= this.field422) {
            GL var2 = class47.field592;
            var2.glBindBufferARB(34962, this.field423);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method218(arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        if (this.field423 != -1) {
            class298.method2038(this.field423, this.field422, this.field420);
            this.field423 = -1;
            this.field422 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 32)
    public final void method217(ByteBuffer arg0) {
        GL var2 = class47.field592;
        var2.glBindBufferARB(34963, this.field423);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field421 ? 35040 : 35044);
        class298.field4319 += arg0.limit() - this.field422;
        this.field422 = arg0.limit();
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Z)V", line = 72)
    public class34(boolean arg0) {
        this.field422 = 0;
        this.field423 = -1;
        GL var2 = class47.field592;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field421 = arg0;
        this.field423 = var3[0];
        this.field420 = class298.field4320;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 47)
    public final void method218(ByteBuffer arg0) {
        GL var2 = class47.field592;
        var2.glBindBufferARB(34962, this.field423);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field421 ? 35040 : 35044);
        class298.field4319 += arg0.limit() - this.field422;
        this.field422 = arg0.limit();
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 56)
    public class34() {
        this(false);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V", line = 60)
    public final void method219() {
        GL var1 = class47.field592;
        var1.glBindBufferARB(34963, this.field423);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()V", line = 65)
    public final void method220() {
        GL var1 = class47.field592;
        var1.glBindBufferARB(34962, this.field423);
    }
}
