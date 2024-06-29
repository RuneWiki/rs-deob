import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class46 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Z")
    private boolean field777;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method334(ByteBuffer arg0) {
        if (arg0.limit() <= this.field778) {
            GL var2 = class147.field2479;
            var2.glBindBufferARB(34962, this.field779);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method338(arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 22)
    public final void method335() {
        GL var1 = class147.field2479;
        var1.glBindBufferARB(34963, this.field779);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 27)
    public class46() {
        this(false);
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        if (this.field779 != -1) {
            class6.method34(this.field779, this.field778, this.field776);
            this.field779 = -1;
            this.field778 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 41)
    public final void method336(ByteBuffer arg0) {
        GL var2 = class147.field2479;
        var2.glBindBufferARB(34963, this.field779);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field777 ? 35040 : 35044);
        class6.field46 += arg0.limit() - this.field778;
        this.field778 = arg0.limit();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V", line = 52)
    public final void method337() {
        GL var1 = class147.field2479;
        var1.glBindBufferARB(34962, this.field779);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 58)
    public final void method338(ByteBuffer arg0) {
        GL var2 = class147.field2479;
        var2.glBindBufferARB(34962, this.field779);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field777 ? 35040 : 35044);
        class6.field46 += arg0.limit() - this.field778;
        this.field778 = arg0.limit();
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Z)V", line = 72)
    public class46(boolean arg0) {
        this.field778 = 0;
        this.field779 = -1;
        GL var2 = class147.field2479;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field777 = arg0;
        this.field779 = var3[0];
        this.field776 = class6.field47;
    }
}
