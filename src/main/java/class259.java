import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class259 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    private int field4485;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
    private boolean field4483;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method1819(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4486) {
            GL var2 = class253.field4319;
            var2.glBindBufferARB(34962, this.field4485);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1822(arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 22)
    public final void method1820() {
        GL var1 = class253.field4319;
        var1.glBindBufferARB(34963, this.field4485);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 26)
    public class259() {
        this(false);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Z)V", line = 47)
    public class259(boolean arg0) {
        this.field4485 = -1;
        this.field4486 = 0;
        GL var2 = class253.field4319;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4483 = arg0;
        this.field4485 = var3[0];
        this.field4484 = class221.field3871;
    }

    @OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        if (this.field4485 != -1) {
            class221.method1519(this.field4485, this.field4486, this.field4484);
            this.field4485 = -1;
            this.field4486 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 59)
    public final void method1821() {
        GL var1 = class253.field4319;
        var1.glBindBufferARB(34962, this.field4485);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 64)
    public final void method1822(ByteBuffer arg0) {
        GL var2 = class253.field4319;
        var2.glBindBufferARB(34962, this.field4485);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4483 ? 35040 : 35044);
        class221.field3872 += arg0.limit() - this.field4486;
        this.field4486 = arg0.limit();
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 74)
    public final void method1823(ByteBuffer arg0) {
        GL var2 = class253.field4319;
        var2.glBindBufferARB(34963, this.field4485);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4483 ? 35040 : 35044);
        class221.field3872 += arg0.limit() - this.field4486;
        this.field4486 = arg0.limit();
    }
}
