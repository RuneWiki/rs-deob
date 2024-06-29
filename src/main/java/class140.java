import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class140 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Z")
    private boolean field2272;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    private int field2270;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method1007(ByteBuffer arg0) {
        GL var2 = class99.field1682;
        var2.glBindBufferARB(34963, this.field2269);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field2272 ? 35040 : 35044);
        class274.field4580 += arg0.limit() - this.field2271;
        this.field2271 = arg0.limit();
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 17)
    public final void method1008() {
        GL var1 = class99.field1682;
        var1.glBindBufferARB(34962, this.field2269);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 21)
    public final void method1009(ByteBuffer arg0) {
        if (arg0.limit() <= this.field2271) {
            GL var2 = class99.field1682;
            var2.glBindBufferARB(34962, this.field2269);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1011(arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V", line = 36)
    public final void method1010() {
        GL var1 = class99.field1682;
        var1.glBindBufferARB(34963, this.field2269);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 41)
    public final void method1011(ByteBuffer arg0) {
        GL var2 = class99.field1682;
        var2.glBindBufferARB(34962, this.field2269);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field2272 ? 35040 : 35044);
        class274.field4580 += arg0.limit() - this.field2271;
        this.field2271 = arg0.limit();
    }

    @OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        if (this.field2269 != -1) {
            class274.method1899(this.field2269, this.field2271, this.field2270);
            this.field2269 = -1;
            this.field2271 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Z)V", line = 72)
    public class140(boolean arg0) {
        this.field2269 = -1;
        this.field2271 = 0;
        GL var2 = class99.field1682;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field2272 = arg0;
        this.field2269 = var3[0];
        this.field2270 = class274.field4577;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 66)
    public class140() {
        this(false);
    }
}
