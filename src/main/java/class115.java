import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class115 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Z")
    private boolean field1638;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 5)
    public class115() {
        this(false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 9)
    public final void method860(ByteBuffer arg0) {
        GL var2 = class141.field2025;
        var2.glBindBufferARB(34963, this.field1637);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1638 ? 35040 : 35044);
        class305.field4568 += arg0.limit() - this.field1635;
        this.field1635 = arg0.limit();
    }

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        if (this.field1637 != -1) {
            class305.method2151(this.field1637, this.field1635, this.field1636);
            this.field1637 = -1;
            this.field1635 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V", line = 30)
    public final void method861() {
        GL var1 = class141.field2025;
        var1.glBindBufferARB(34962, this.field1637);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method862(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1635) {
            GL var2 = class141.field2025;
            var2.glBindBufferARB(34962, this.field1637);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method864(arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Z)V", line = 72)
    public class115(boolean arg0) {
        this.field1637 = -1;
        this.field1635 = 0;
        GL var2 = class141.field2025;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1638 = arg0;
        this.field1637 = var3[0];
        this.field1636 = class305.field4573;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V", line = 56)
    public final void method863() {
        GL var1 = class141.field2025;
        var1.glBindBufferARB(34963, this.field1637);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 64)
    public final void method864(ByteBuffer arg0) {
        GL var2 = class141.field2025;
        var2.glBindBufferARB(34962, this.field1637);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1638 ? 35040 : 35044);
        class305.field4568 += arg0.limit() - this.field1635;
        this.field1635 = arg0.limit();
    }
}
