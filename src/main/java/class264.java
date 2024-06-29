import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class264 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field4137;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Z")
    private boolean field4134;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    private int field4135;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 7)
    public class264() {
        this(false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 11)
    public final void method1888() {
        GL var1 = class109.field1456;
        var1.glBindBufferARB(34962, this.field4136);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V", line = 16)
    public final void method1889() {
        GL var1 = class109.field1456;
        var1.glBindBufferARB(34963, this.field4136);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 21)
    public final void method1890(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4137) {
            GL var2 = class109.field1456;
            var2.glBindBufferARB(34962, this.field4136);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1892(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method1891(ByteBuffer arg0) {
        GL var2 = class109.field1456;
        var2.glBindBufferARB(34963, this.field4136);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4134 ? 35040 : 35044);
        class103.field1373 += arg0.limit() - this.field4137;
        this.field4137 = arg0.limit();
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 46)
    protected final void finalize() throws Throwable {
        if (this.field4136 != -1) {
            class103.method715(this.field4136, this.field4137, this.field4135);
            this.field4136 = -1;
            this.field4137 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Z)V", line = 72)
    public class264(boolean arg0) {
        this.field4136 = -1;
        this.field4137 = 0;
        GL var2 = class109.field1456;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4134 = arg0;
        this.field4136 = var3[0];
        this.field4135 = class103.field1369;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 60)
    public final void method1892(ByteBuffer arg0) {
        GL var2 = class109.field1456;
        var2.glBindBufferARB(34962, this.field4136);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4134 ? 35040 : 35044);
        class103.field1373 += arg0.limit() - this.field4137;
        this.field4137 = arg0.limit();
    }
}
