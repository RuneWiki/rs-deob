import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class296 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field4650;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field4649;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    private boolean field4647;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 6)
    public class296() {
        this(false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 10)
    public final void method2086(ByteBuffer arg0) {
        GL var2 = class36.field518;
        var2.glBindBufferARB(34963, this.field4649);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4647 ? 35040 : 35044);
        class166.field2500 += arg0.limit() - this.field4650;
        this.field4650 = arg0.limit();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()V", line = 21)
    public final void method2087() {
        GL var1 = class36.field518;
        var1.glBindBufferARB(34963, this.field4649);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()V", line = 26)
    public final void method2088() {
        GL var1 = class36.field518;
        var1.glBindBufferARB(34962, this.field4649);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 31)
    public final void method2089(ByteBuffer arg0) {
        GL var2 = class36.field518;
        var2.glBindBufferARB(34962, this.field4649);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4647 ? 35040 : 35044);
        class166.field2500 += arg0.limit() - this.field4650;
        this.field4650 = arg0.limit();
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        if (this.field4649 != -1) {
            class166.method1215(this.field4649, this.field4650, this.field4648);
            this.field4649 = -1;
            this.field4650 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Z)V", line = 58)
    public class296(boolean arg0) {
        this.field4650 = 0;
        this.field4649 = -1;
        GL var2 = class36.field518;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4647 = arg0;
        this.field4649 = var3[0];
        this.field4648 = class166.field2498;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 69)
    public final void method2090(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4650) {
            GL var2 = class36.field518;
            var2.glBindBufferARB(34962, this.field4649);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2089(arg0);
        }
    }
}
