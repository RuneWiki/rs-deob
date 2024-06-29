import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class207 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    private int field3394;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Z")
    private boolean field3393;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method1514(ByteBuffer arg0) {
        GL var2 = class186.field2990;
        var2.glBindBufferARB(34963, this.field3391);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3393 ? 35040 : 35044);
        class275.field4355 += arg0.limit() - this.field3394;
        this.field3394 = arg0.limit();
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 15)
    public final void method1515(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3394) {
            GL var2 = class186.field2990;
            var2.glBindBufferARB(34962, this.field3391);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1518(arg0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 30)
    public final void method1516() {
        GL var1 = class186.field2990;
        var1.glBindBufferARB(34963, this.field3391);
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 35)
    public class207() {
        this(false);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V", line = 40)
    public final void method1517() {
        GL var1 = class186.field2990;
        var1.glBindBufferARB(34962, this.field3391);
    }

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        if (this.field3391 != -1) {
            class275.method1962(this.field3391, this.field3394, this.field3392);
            this.field3391 = -1;
            this.field3394 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 57)
    public final void method1518(ByteBuffer arg0) {
        GL var2 = class186.field2990;
        var2.glBindBufferARB(34962, this.field3391);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3393 ? 35040 : 35044);
        class275.field4355 += arg0.limit() - this.field3394;
        this.field3394 = arg0.limit();
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Z)V", line = 72)
    public class207(boolean arg0) {
        this.field3391 = -1;
        this.field3394 = 0;
        GL var2 = class186.field2990;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3393 = arg0;
        this.field3391 = var3[0];
        this.field3392 = class275.field4359;
    }
}
