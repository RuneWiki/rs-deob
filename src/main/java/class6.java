import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class6 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
    private boolean field76;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 5)
    public final void method38(ByteBuffer arg0) {
        if (arg0.limit() <= this.field75) {
            GL var2 = class255.field4181;
            var2.glBindBufferARB(34962, this.field73);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method42(arg0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        if (this.field73 != -1) {
            class197.method1326(this.field73, this.field75, this.field74);
            this.field73 = -1;
            this.field75 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 31)
    public final void method39() {
        GL var1 = class255.field4181;
        var1.glBindBufferARB(34962, this.field73);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 37)
    public class6() {
        this(false);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 41)
    public final void method40(ByteBuffer arg0) {
        GL var2 = class255.field4181;
        var2.glBindBufferARB(34963, this.field73);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field76 ? 35040 : 35044);
        class197.field3061 += arg0.limit() - this.field75;
        this.field75 = arg0.limit();
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Z)V", line = 72)
    public class6(boolean arg0) {
        this.field73 = -1;
        this.field75 = 0;
        GL var2 = class255.field4181;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field76 = arg0;
        this.field73 = var3[0];
        this.field74 = class197.field3058;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V", line = 54)
    public final void method41() {
        GL var1 = class255.field4181;
        var1.glBindBufferARB(34963, this.field73);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 60)
    public final void method42(ByteBuffer arg0) {
        GL var2 = class255.field4181;
        var2.glBindBufferARB(34962, this.field73);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field76 ? 35040 : 35044);
        class197.field3061 += arg0.limit() - this.field75;
        this.field75 = arg0.limit();
    }
}
