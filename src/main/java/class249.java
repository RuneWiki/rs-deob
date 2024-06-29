import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class249 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field4076;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
    private boolean field4079;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    private int field4077;

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        if (this.field4076 != -1) {
            class239.method1672(this.field4076, this.field4078, this.field4077);
            this.field4076 = -1;
            this.field4078 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 18)
    public final void method1752(ByteBuffer arg0) {
        GL var2 = class241.field4012;
        var2.glBindBufferARB(34963, this.field4076);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4079 ? 35040 : 35044);
        class239.field3978 += arg0.limit() - this.field4078;
        this.field4078 = arg0.limit();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 29)
    public final void method1753() {
        GL var1 = class241.field4012;
        var1.glBindBufferARB(34963, this.field4076);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 33)
    public class249() {
        this(false);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 36)
    public final void method1754(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4078) {
            GL var2 = class241.field4012;
            var2.glBindBufferARB(34962, this.field4076);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1756(arg0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Z)V", line = 72)
    public class249(boolean arg0) {
        this.field4076 = -1;
        this.field4078 = 0;
        GL var2 = class241.field4012;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4079 = arg0;
        this.field4076 = var3[0];
        this.field4077 = class239.field3974;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 58)
    public final void method1755() {
        GL var1 = class241.field4012;
        var1.glBindBufferARB(34962, this.field4076);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 63)
    public final void method1756(ByteBuffer arg0) {
        GL var2 = class241.field4012;
        var2.glBindBufferARB(34962, this.field4076);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4079 ? 35040 : 35044);
        class239.field3978 += arg0.limit() - this.field4078;
        this.field4078 = arg0.limit();
    }
}
