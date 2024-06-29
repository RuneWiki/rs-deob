import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class245 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    private int field4071;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
    private boolean field4069;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Z)V", line = 72)
    public class245(boolean arg0) {
        this.field4068 = -1;
        this.field4071 = 0;
        GL var2 = class21.field377;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4069 = arg0;
        this.field4068 = var3[0];
        this.field4070 = class136.field2300;
    }

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        if (this.field4068 != -1) {
            class136.method1009(this.field4068, this.field4071, this.field4070);
            this.field4068 = -1;
            this.field4071 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 21)
    public final void method1734() {
        GL var1 = class21.field377;
        var1.glBindBufferARB(34963, this.field4068);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 25)
    public final void method1735(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4071) {
            GL var2 = class21.field377;
            var2.glBindBufferARB(34962, this.field4068);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1736(arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 41)
    public final void method1736(ByteBuffer arg0) {
        GL var2 = class21.field377;
        var2.glBindBufferARB(34962, this.field4068);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4069 ? 35040 : 35044);
        class136.field2304 += arg0.limit() - this.field4071;
        this.field4071 = arg0.limit();
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 52)
    public final void method1737(ByteBuffer arg0) {
        GL var2 = class21.field377;
        var2.glBindBufferARB(34963, this.field4068);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4069 ? 35040 : 35044);
        class136.field2304 += arg0.limit() - this.field4071;
        this.field4071 = arg0.limit();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 62)
    public class245() {
        this(false);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 69)
    public final void method1738() {
        GL var1 = class21.field377;
        var1.glBindBufferARB(34962, this.field4068);
    }
}
