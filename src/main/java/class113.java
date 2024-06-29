import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class113 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Z")
    private boolean field1747;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V", line = 7)
    public final void method837() {
        GL var1 = class94.field1473;
        var1.glBindBufferARB(34962, this.field1745);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 11)
    public class113() {
        this(false);
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field1745 != -1) {
            class198.method1407(this.field1745, this.field1746, this.field1748);
            this.field1745 = -1;
            this.field1746 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 24)
    public final void method838(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1746) {
            GL var2 = class94.field1473;
            var2.glBindBufferARB(34962, this.field1745);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method841(arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 39)
    public final void method839(ByteBuffer arg0) {
        GL var2 = class94.field1473;
        var2.glBindBufferARB(34963, this.field1745);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1747 ? 35040 : 35044);
        class198.field2962 += arg0.limit() - this.field1746;
        this.field1746 = arg0.limit();
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V", line = 72)
    public class113(boolean arg0) {
        this.field1745 = -1;
        this.field1746 = 0;
        GL var2 = class94.field1473;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1747 = arg0;
        this.field1745 = var3[0];
        this.field1748 = class198.field2966;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V", line = 55)
    public final void method840() {
        GL var1 = class94.field1473;
        var1.glBindBufferARB(34963, this.field1745);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 60)
    public final void method841(ByteBuffer arg0) {
        GL var2 = class94.field1473;
        var2.glBindBufferARB(34962, this.field1745);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1747 ? 35040 : 35044);
        class198.field2962 += arg0.limit() - this.field1746;
        this.field1746 = arg0.limit();
    }
}
