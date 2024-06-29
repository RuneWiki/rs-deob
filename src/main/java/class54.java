import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class54 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
    private boolean field852;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 5)
    public class54() {
        this(false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 9)
    public final void method414() {
        GL var1 = class45.field688;
        var1.glBindBufferARB(34962, this.field853);
    }

    @OriginalMember(owner = "client!wk", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() throws Throwable {
        if (this.field853 != -1) {
            class36.method258(this.field853, this.field851, this.field850);
            this.field853 = -1;
            this.field851 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 26)
    public final void method415(ByteBuffer arg0) {
        GL var2 = class45.field688;
        var2.glBindBufferARB(34962, this.field853);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field852 ? 35040 : 35044);
        class36.field575 += arg0.limit() - this.field851;
        this.field851 = arg0.limit();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 36)
    public final void method416(ByteBuffer arg0) {
        if (arg0.limit() <= this.field851) {
            GL var2 = class45.field688;
            var2.glBindBufferARB(34962, this.field853);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method415(arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 52)
    public final void method417(ByteBuffer arg0) {
        GL var2 = class45.field688;
        var2.glBindBufferARB(34963, this.field853);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field852 ? 35040 : 35044);
        class36.field575 += arg0.limit() - this.field851;
        this.field851 = arg0.limit();
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Z)V", line = 72)
    public class54(boolean arg0) {
        this.field851 = 0;
        this.field853 = -1;
        GL var2 = class45.field688;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field852 = arg0;
        this.field853 = var3[0];
        this.field850 = class36.field576;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 66)
    public final void method418() {
        GL var1 = class45.field688;
        var1.glBindBufferARB(34963, this.field853);
    }
}
