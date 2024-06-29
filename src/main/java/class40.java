import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class40 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
    private boolean field603;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 6)
    public final void method314() {
        GL var1 = class264.field4313;
        var1.glBindBufferARB(34963, this.field602);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 11)
    public class40() {
        this(false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 15)
    public final void method315(ByteBuffer arg0) {
        GL var2 = class264.field4313;
        var2.glBindBufferARB(34962, this.field602);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field603 ? 35040 : 35044);
        class143.field2278 += arg0.limit() - this.field604;
        this.field604 = arg0.limit();
    }

    @OriginalMember(owner = "client!eh", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() throws Throwable {
        if (this.field602 != -1) {
            class143.method941(this.field602, this.field604, this.field601);
            this.field602 = -1;
            this.field604 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Z)V", line = 65)
    public class40(boolean arg0) {
        this.field602 = -1;
        this.field604 = 0;
        GL var2 = class264.field4313;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field603 = arg0;
        this.field602 = var3[0];
        this.field601 = class143.field2280;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()V", line = 38)
    public final void method316() {
        GL var1 = class264.field4313;
        var1.glBindBufferARB(34962, this.field602);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 42)
    public final void method317(ByteBuffer arg0) {
        if (arg0.limit() <= this.field604) {
            GL var2 = class264.field4313;
            var2.glBindBufferARB(34962, this.field602);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method315(arg0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 56)
    public final void method318(ByteBuffer arg0) {
        GL var2 = class264.field4313;
        var2.glBindBufferARB(34963, this.field602);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field603 ? 35040 : 35044);
        class143.field2278 += arg0.limit() - this.field604;
        this.field604 = arg0.limit();
    }
}
