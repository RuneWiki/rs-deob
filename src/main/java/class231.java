import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class231 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private int field3631;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Z")
    private boolean field3634;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    private int field3632;

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        if (this.field3631 != -1) {
            class258.method1733(this.field3631, this.field3633, this.field3632);
            this.field3631 = -1;
            this.field3633 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 15)
    public final void method1528(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3633) {
            GL var2 = class249.field3898;
            var2.glBindBufferARB(34962, this.field3631);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1532(arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 31)
    public final void method1529() {
        GL var1 = class249.field3898;
        var1.glBindBufferARB(34962, this.field3631);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method1530(ByteBuffer arg0) {
        GL var2 = class249.field3898;
        var2.glBindBufferARB(34963, this.field3631);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3634 ? 35040 : 35044);
        class258.field4010 += arg0.limit() - this.field3633;
        this.field3633 = arg0.limit();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 46)
    public class231() {
        this(false);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Z)V", line = 72)
    public class231(boolean arg0) {
        this.field3633 = 0;
        this.field3631 = -1;
        GL var2 = class249.field3898;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3634 = arg0;
        this.field3631 = var3[0];
        this.field3632 = class258.field4013;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 55)
    public final void method1531() {
        GL var1 = class249.field3898;
        var1.glBindBufferARB(34963, this.field3631);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 63)
    public final void method1532(ByteBuffer arg0) {
        GL var2 = class249.field3898;
        var2.glBindBufferARB(34962, this.field3631);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3634 ? 35040 : 35044);
        class258.field4010 += arg0.limit() - this.field3633;
        this.field3633 = arg0.limit();
    }
}
