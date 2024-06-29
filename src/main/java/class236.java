import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class236 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Z")
    private boolean field3590;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 8)
    public final void method1643(ByteBuffer arg0) {
        GL var2 = class73.field1051;
        var2.glBindBufferARB(34962, this.field3592);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3590 ? 35040 : 35044);
        class80.field1185 += arg0.limit() - this.field3591;
        this.field3591 = arg0.limit();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V", line = 18)
    public final void method1644() {
        GL var1 = class73.field1051;
        var1.glBindBufferARB(34962, this.field3592);
    }

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        if (this.field3592 != -1) {
            class80.method622(this.field3592, this.field3591, this.field3593);
            this.field3592 = -1;
            this.field3591 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 32)
    public final void method1645(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3591) {
            GL var2 = class73.field1051;
            var2.glBindBufferARB(34962, this.field3592);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1643(arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V", line = 72)
    public class236(boolean arg0) {
        this.field3591 = 0;
        this.field3592 = -1;
        GL var2 = class73.field1051;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3590 = arg0;
        this.field3592 = var3[0];
        this.field3593 = class80.field1183;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V", line = 51)
    public final void method1646() {
        GL var1 = class73.field1051;
        var1.glBindBufferARB(34963, this.field3592);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 57)
    public final void method1647(ByteBuffer arg0) {
        GL var2 = class73.field1051;
        var2.glBindBufferARB(34963, this.field3592);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3590 ? 35040 : 35044);
        class80.field1185 += arg0.limit() - this.field3591;
        this.field3591 = arg0.limit();
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 67)
    public class236() {
        this(false);
    }
}
