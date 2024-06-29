import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class66 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Z")
    private boolean field1153;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method503(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1151) {
            GL var2 = class257.field4409;
            var2.glBindBufferARB(34962, this.field1152);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method505(arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 23)
    public final void method504(ByteBuffer arg0) {
        GL var2 = class257.field4409;
        var2.glBindBufferARB(34963, this.field1152);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1153 ? 35040 : 35044);
        class196.field3438 += arg0.limit() - this.field1151;
        this.field1151 = arg0.limit();
    }

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        if (this.field1152 != -1) {
            class196.method1319(this.field1152, this.field1151, this.field1154);
            this.field1152 = -1;
            this.field1151 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Z)V", line = 72)
    public class66(boolean arg0) {
        this.field1152 = -1;
        this.field1151 = 0;
        GL var2 = class257.field4409;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1153 = arg0;
        this.field1152 = var3[0];
        this.field1154 = class196.field3439;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 47)
    public final void method505(ByteBuffer arg0) {
        GL var2 = class257.field4409;
        var2.glBindBufferARB(34962, this.field1152);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1153 ? 35040 : 35044);
        class196.field3438 += arg0.limit() - this.field1151;
        this.field1151 = arg0.limit();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 57)
    public final void method506() {
        GL var1 = class257.field4409;
        var1.glBindBufferARB(34962, this.field1152);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V", line = 62)
    public final void method507() {
        GL var1 = class257.field4409;
        var1.glBindBufferARB(34963, this.field1152);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 66)
    public class66() {
        this(false);
    }
}
