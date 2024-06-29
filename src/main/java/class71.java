import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class71 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
    private boolean field906;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method432(ByteBuffer arg0) {
        GL var2 = class250.field3818;
        var2.glBindBufferARB(34962, this.field905);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field906 ? 35040 : 35044);
        class266.field4193 += arg0.limit() - this.field908;
        this.field908 = arg0.limit();
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 17)
    public final void method433(ByteBuffer arg0) {
        GL var2 = class250.field3818;
        var2.glBindBufferARB(34963, this.field905);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field906 ? 35040 : 35044);
        class266.field4193 += arg0.limit() - this.field908;
        this.field908 = arg0.limit();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 27)
    public class71() {
        this(false);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 31)
    public final void method434(ByteBuffer arg0) {
        if (arg0.limit() <= this.field908) {
            GL var2 = class250.field3818;
            var2.glBindBufferARB(34962, this.field905);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method432(arg0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Z)V", line = 72)
    public class71(boolean arg0) {
        this.field905 = -1;
        this.field908 = 0;
        GL var2 = class250.field3818;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field906 = arg0;
        this.field905 = var3[0];
        this.field907 = class266.field4192;
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        if (this.field905 != -1) {
            class266.method1928(this.field905, this.field908, this.field907);
            this.field905 = -1;
            this.field908 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 59)
    public final void method435() {
        GL var1 = class250.field3818;
        var1.glBindBufferARB(34963, this.field905);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()V", line = 64)
    public final void method436() {
        GL var1 = class250.field3818;
        var1.glBindBufferARB(34962, this.field905);
    }
}
