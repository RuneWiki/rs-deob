import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class34 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
    private boolean field450;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method220(ByteBuffer arg0) {
        GL var2 = class154.field2479;
        var2.glBindBufferARB(34962, this.field449);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field450 ? 35040 : 35044);
        class79.field1323 += arg0.limit() - this.field448;
        this.field448 = arg0.limit();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 18)
    public final void method221() {
        GL var1 = class154.field2479;
        var1.glBindBufferARB(34962, this.field449);
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        if (this.field449 != -1) {
            class79.method612(this.field449, this.field448, this.field451);
            this.field449 = -1;
            this.field448 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 33)
    public final void method222(ByteBuffer arg0) {
        GL var2 = class154.field2479;
        var2.glBindBufferARB(34963, this.field449);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field450 ? 35040 : 35044);
        class79.field1323 += arg0.limit() - this.field448;
        this.field448 = arg0.limit();
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 42)
    public final void method223(ByteBuffer arg0) {
        if (arg0.limit() <= this.field448) {
            GL var2 = class154.field2479;
            var2.glBindBufferARB(34962, this.field449);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method220(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V", line = 72)
    public class34(boolean arg0) {
        this.field448 = 0;
        this.field449 = -1;
        GL var2 = class154.field2479;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field450 = arg0;
        this.field449 = var3[0];
        this.field451 = class79.field1324;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 65)
    public class34() {
        this(false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V", line = 69)
    public final void method224() {
        GL var1 = class154.field2479;
        var1.glBindBufferARB(34963, this.field449);
    }
}
