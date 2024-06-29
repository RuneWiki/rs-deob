import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class53 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Z")
    private boolean field889;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method419(ByteBuffer arg0) {
        GL var2 = class42.field627;
        var2.glBindBufferARB(34963, this.field890);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field889 ? 35040 : 35044);
        class199.field3169 += arg0.limit() - this.field891;
        this.field891 = arg0.limit();
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 17)
    public final void method420(ByteBuffer arg0) {
        if (arg0.limit() <= this.field891) {
            GL var2 = class42.field627;
            var2.glBindBufferARB(34962, this.field890);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method421(arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 31)
    public class53() {
        this(false);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 35)
    public final void method421(ByteBuffer arg0) {
        GL var2 = class42.field627;
        var2.glBindBufferARB(34962, this.field890);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field889 ? 35040 : 35044);
        class199.field3169 += arg0.limit() - this.field891;
        this.field891 = arg0.limit();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 47)
    public final void method422() {
        GL var1 = class42.field627;
        var1.glBindBufferARB(34962, this.field890);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Z)V", line = 72)
    public class53(boolean arg0) {
        this.field890 = -1;
        this.field891 = 0;
        GL var2 = class42.field627;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field889 = arg0;
        this.field890 = var3[0];
        this.field888 = class199.field3172;
    }

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        if (this.field890 != -1) {
            class199.method1530(this.field890, this.field891, this.field888);
            this.field890 = -1;
            this.field891 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V", line = 65)
    public final void method423() {
        GL var1 = class42.field627;
        var1.glBindBufferARB(34963, this.field890);
    }
}
