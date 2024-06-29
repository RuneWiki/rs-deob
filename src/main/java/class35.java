import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class35 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    private boolean field535;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 9)
    public final void method358() {
        GL var1 = class240.field3771;
        var1.glBindBufferARB(34962, this.field534);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 14)
    public final void method359(ByteBuffer arg0) {
        GL var2 = class240.field3771;
        var2.glBindBufferARB(34962, this.field534);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field535 ? 35040 : 35044);
        class28.field454 += arg0.limit() - this.field532;
        this.field532 = arg0.limit();
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 24)
    public final void method360() {
        GL var1 = class240.field3771;
        var1.glBindBufferARB(34963, this.field534);
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() throws Throwable {
        if (this.field534 != -1) {
            class28.method328(this.field534, this.field532, this.field533);
            this.field534 = -1;
            this.field532 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 39)
    public final void method361(ByteBuffer arg0) {
        if (arg0.limit() <= this.field532) {
            GL var2 = class240.field3771;
            var2.glBindBufferARB(34962, this.field534);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method359(arg0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 54)
    public final void method362(ByteBuffer arg0) {
        GL var2 = class240.field3771;
        var2.glBindBufferARB(34963, this.field534);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field535 ? 35040 : 35044);
        class28.field454 += arg0.limit() - this.field532;
        this.field532 = arg0.limit();
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 63)
    public class35() {
        this(false);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Z)V", line = 72)
    public class35(boolean arg0) {
        this.field532 = 0;
        this.field534 = -1;
        GL var2 = class240.field3771;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field535 = arg0;
        this.field534 = var3[0];
        this.field533 = class28.field455;
    }
}
