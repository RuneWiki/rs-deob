import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    private boolean field616;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 6)
    public final void method301() {
        GL var1 = class123.field2212;
        var1.glBindBufferARB(34962, this.field615);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 11)
    public final void method302(ByteBuffer arg0) {
        GL var2 = class123.field2212;
        var2.glBindBufferARB(34963, this.field615);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field616 ? 35040 : 35044);
        class285.field4889 += arg0.limit() - this.field614;
        this.field614 = arg0.limit();
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()V", line = 21)
    public final void method303() {
        GL var1 = class123.field2212;
        var1.glBindBufferARB(34963, this.field615);
    }

    @OriginalMember(owner = "client!ul", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        if (this.field615 != -1) {
            class285.method1980(this.field615, this.field614, this.field617);
            this.field615 = -1;
            this.field614 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 36)
    public final void method304(ByteBuffer arg0) {
        if (arg0.limit() <= this.field614) {
            GL var2 = class123.field2212;
            var2.glBindBufferARB(34962, this.field615);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method305(arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 51)
    public final void method305(ByteBuffer arg0) {
        GL var2 = class123.field2212;
        var2.glBindBufferARB(34962, this.field615);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field616 ? 35040 : 35044);
        class285.field4889 += arg0.limit() - this.field614;
        this.field614 = arg0.limit();
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Z)V", line = 72)
    public class39(boolean arg0) {
        this.field615 = -1;
        this.field614 = 0;
        GL var2 = class123.field2212;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field616 = arg0;
        this.field615 = var3[0];
        this.field617 = class285.field4893;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 65)
    public class39() {
        this(false);
    }
}
