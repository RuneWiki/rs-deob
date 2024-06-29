import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class268 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
    private boolean field4524;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 6)
    public final void method1803() {
        GL var1 = class167.field2806;
        var1.glBindBufferARB(34962, this.field4526);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 12)
    public final void method1804(ByteBuffer arg0) {
        GL var2 = class167.field2806;
        var2.glBindBufferARB(34963, this.field4526);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4524 ? 35040 : 35044);
        class101.field1724 += arg0.limit() - this.field4525;
        this.field4525 = arg0.limit();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 21)
    public final void method1805(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4525) {
            GL var2 = class167.field2806;
            var2.glBindBufferARB(34962, this.field4526);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1806(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method1806(ByteBuffer arg0) {
        GL var2 = class167.field2806;
        var2.glBindBufferARB(34962, this.field4526);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4524 ? 35040 : 35044);
        class101.field1724 += arg0.limit() - this.field4525;
        this.field4525 = arg0.limit();
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() throws Throwable {
        if (this.field4526 != -1) {
            class101.method668(this.field4526, this.field4525, this.field4527);
            this.field4526 = -1;
            this.field4525 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Z)V", line = 72)
    public class268(boolean arg0) {
        this.field4526 = -1;
        this.field4525 = 0;
        GL var2 = class167.field2806;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4524 = arg0;
        this.field4526 = var3[0];
        this.field4527 = class101.field1723;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 61)
    public final void method1807() {
        GL var1 = class167.field2806;
        var1.glBindBufferARB(34963, this.field4526);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 69)
    public class268() {
        this(false);
    }
}
