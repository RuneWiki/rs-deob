import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class182 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field2896;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Z")
    private boolean field2894;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V", line = 7)
    public final void method1208() {
        GL var1 = class217.field3551;
        var1.glBindBufferARB(34962, this.field2896);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 12)
    public final void method1209(ByteBuffer arg0) {
        GL var2 = class217.field3551;
        var2.glBindBufferARB(34963, this.field2896);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field2894 ? 35040 : 35044);
        class207.field3381 += arg0.limit() - this.field2897;
        this.field2897 = arg0.limit();
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 22)
    public final void method1210(ByteBuffer arg0) {
        GL var2 = class217.field3551;
        var2.glBindBufferARB(34962, this.field2896);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field2894 ? 35040 : 35044);
        class207.field3381 += arg0.limit() - this.field2897;
        this.field2897 = arg0.limit();
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()V", line = 32)
    public final void method1211() {
        GL var1 = class217.field3551;
        var1.glBindBufferARB(34963, this.field2896);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 38)
    public class182() {
        this(false);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 41)
    public final void method1212(ByteBuffer arg0) {
        if (arg0.limit() <= this.field2897) {
            GL var2 = class217.field3551;
            var2.glBindBufferARB(34962, this.field2896);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1210(arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Z)V", line = 72)
    public class182(boolean arg0) {
        this.field2897 = 0;
        this.field2896 = -1;
        GL var2 = class217.field3551;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field2894 = arg0;
        this.field2896 = var3[0];
        this.field2895 = class207.field3383;
    }

    @OriginalMember(owner = "client!pj", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() throws Throwable {
        if (this.field2896 != -1) {
            class207.method1394(this.field2896, this.field2897, this.field2895);
            this.field2896 = -1;
            this.field2897 = 0;
        }
        super.finalize();
    }
}
