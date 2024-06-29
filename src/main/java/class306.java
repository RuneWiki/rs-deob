import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class306 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
    private boolean field4780;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 6)
    public final void method2173() {
        GL var1 = class232.field3716;
        var1.glBindBufferARB(34963, this.field4779);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 11)
    public final void method2174(ByteBuffer arg0) {
        GL var2 = class232.field3716;
        var2.glBindBufferARB(34963, this.field4779);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4780 ? 35040 : 35044);
        class230.field3660 += arg0.limit() - this.field4781;
        this.field4781 = arg0.limit();
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 23)
    public final void method2175(ByteBuffer arg0) {
        GL var2 = class232.field3716;
        var2.glBindBufferARB(34962, this.field4779);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4780 ? 35040 : 35044);
        class230.field3660 += arg0.limit() - this.field4781;
        this.field4781 = arg0.limit();
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        if (this.field4779 != -1) {
            class230.method1633(this.field4779, this.field4781, this.field4782);
            this.field4779 = -1;
            this.field4781 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 42)
    public class306() {
        this(false);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 45)
    public final void method2176(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4781) {
            GL var2 = class232.field3716;
            var2.glBindBufferARB(34962, this.field4779);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2175(arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V", line = 60)
    public final void method2177() {
        GL var1 = class232.field3716;
        var1.glBindBufferARB(34962, this.field4779);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Z)V", line = 72)
    public class306(boolean arg0) {
        this.field4779 = -1;
        this.field4781 = 0;
        GL var2 = class232.field3716;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4780 = arg0;
        this.field4779 = var3[0];
        this.field4782 = class230.field3658;
    }
}
