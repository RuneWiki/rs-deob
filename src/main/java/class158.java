import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class158 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    private int field2501;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
    private boolean field2503;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    private int field2504;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 6)
    public final void method1184() {
        GL var1 = class265.field4099;
        var1.glBindBufferARB(34962, this.field2502);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 11)
    public final void method1185(ByteBuffer arg0) {
        GL var2 = class265.field4099;
        var2.glBindBufferARB(34962, this.field2502);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field2503 ? 35040 : 35044);
        class214.field3406 += arg0.limit() - this.field2501;
        this.field2501 = arg0.limit();
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 21)
    public final void method1186() {
        GL var1 = class265.field4099;
        var1.glBindBufferARB(34963, this.field2502);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 27)
    public class158() {
        this(false);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 31)
    public final void method1187(ByteBuffer arg0) {
        GL var2 = class265.field4099;
        var2.glBindBufferARB(34963, this.field2502);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field2503 ? 35040 : 35044);
        class214.field3406 += arg0.limit() - this.field2501;
        this.field2501 = arg0.limit();
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 43)
    public final void method1188(ByteBuffer arg0) {
        if (arg0.limit() <= this.field2501) {
            GL var2 = class265.field4099;
            var2.glBindBufferARB(34962, this.field2502);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1185(arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V", line = 57)
    protected final void finalize() throws Throwable {
        if (this.field2502 != -1) {
            class214.method1554(this.field2502, this.field2501, this.field2504);
            this.field2502 = -1;
            this.field2501 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Z)V", line = 72)
    public class158(boolean arg0) {
        this.field2501 = 0;
        this.field2502 = -1;
        GL var2 = class265.field4099;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field2503 = arg0;
        this.field2502 = var3[0];
        this.field2504 = class214.field3409;
    }
}
