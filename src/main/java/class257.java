import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class257 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
    private boolean field4119;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method1821(ByteBuffer arg0) {
        GL var2 = class166.field2648;
        var2.glBindBufferARB(34962, this.field4120);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4119 ? 35040 : 35044);
        class103.field1462 += arg0.limit() - this.field4118;
        this.field4118 = arg0.limit();
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 17)
    public final void method1822(ByteBuffer arg0) {
        GL var2 = class166.field2648;
        var2.glBindBufferARB(34963, this.field4120);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4119 ? 35040 : 35044);
        class103.field1462 += arg0.limit() - this.field4118;
        this.field4118 = arg0.limit();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 27)
    public final void method1823() {
        GL var1 = class166.field2648;
        var1.glBindBufferARB(34962, this.field4120);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Z)V", line = 72)
    public class257(boolean arg0) {
        this.field4118 = 0;
        this.field4120 = -1;
        GL var2 = class166.field2648;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4119 = arg0;
        this.field4120 = var3[0];
        this.field4121 = class103.field1460;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 34)
    public class257() {
        this(false);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 39)
    public final void method1824() {
        GL var1 = class166.field2648;
        var1.glBindBufferARB(34963, this.field4120);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 46)
    public final void method1825(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4118) {
            GL var2 = class166.field2648;
            var2.glBindBufferARB(34962, this.field4120);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1821(arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        if (this.field4120 != -1) {
            class103.method717(this.field4120, this.field4118, this.field4121);
            this.field4120 = -1;
            this.field4118 = 0;
        }
        super.finalize();
    }
}
