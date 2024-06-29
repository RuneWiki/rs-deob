import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class225 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    private boolean field3636;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V", line = 7)
    public final void method1548() {
        GL var1 = class55.field812;
        var1.glBindBufferARB(34962, this.field3637);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 14)
    public final void method1549(ByteBuffer arg0) {
        GL var2 = class55.field812;
        var2.glBindBufferARB(34963, this.field3637);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3636 ? 35040 : 35044);
        class104.field1710 += arg0.limit() - this.field3634;
        this.field3634 = arg0.limit();
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 25)
    public final void method1550(ByteBuffer arg0) {
        GL var2 = class55.field812;
        var2.glBindBufferARB(34962, this.field3637);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3636 ? 35040 : 35044);
        class104.field1710 += arg0.limit() - this.field3634;
        this.field3634 = arg0.limit();
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        if (this.field3637 != -1) {
            class104.method786(this.field3637, this.field3634, this.field3635);
            this.field3637 = -1;
            this.field3634 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 45)
    public final void method1551(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3634) {
            GL var2 = class55.field812;
            var2.glBindBufferARB(34962, this.field3637);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1550(arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Z)V", line = 72)
    public class225(boolean arg0) {
        this.field3637 = -1;
        this.field3634 = 0;
        GL var2 = class55.field812;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3636 = arg0;
        this.field3637 = var3[0];
        this.field3635 = class104.field1712;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 62)
    public class225() {
        this(false);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()V", line = 66)
    public final void method1552() {
        GL var1 = class55.field812;
        var1.glBindBufferARB(34963, this.field3637);
    }
}
