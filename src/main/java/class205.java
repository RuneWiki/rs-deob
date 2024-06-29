import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class205 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
    private boolean field3126;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method1395(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3125) {
            GL var2 = class245.field3884;
            var2.glBindBufferARB(34962, this.field3124);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1396(arg0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 21)
    public final void method1396(ByteBuffer arg0) {
        GL var2 = class245.field3884;
        var2.glBindBufferARB(34962, this.field3124);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3126 ? 35040 : 35044);
        class173.field2701 += arg0.limit() - this.field3125;
        this.field3125 = arg0.limit();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 31)
    public final void method1397() {
        GL var1 = class245.field3884;
        var1.glBindBufferARB(34962, this.field3124);
    }

    @OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        if (this.field3124 != -1) {
            class173.method1196(this.field3124, this.field3125, this.field3127);
            this.field3124 = -1;
            this.field3125 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()V", line = 50)
    public final void method1398() {
        GL var1 = class245.field3884;
        var1.glBindBufferARB(34963, this.field3124);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 54)
    public class205() {
        this(false);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Z)V", line = 72)
    public class205(boolean arg0) {
        this.field3124 = -1;
        this.field3125 = 0;
        GL var2 = class245.field3884;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3126 = arg0;
        this.field3124 = var3[0];
        this.field3127 = class173.field2703;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 61)
    public final void method1399(ByteBuffer arg0) {
        GL var2 = class245.field3884;
        var2.glBindBufferARB(34963, this.field3124);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3126 ? 35040 : 35044);
        class173.field2701 += arg0.limit() - this.field3125;
        this.field3125 = arg0.limit();
    }
}
