import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class92 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Z")
    private boolean field1509;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method718(ByteBuffer arg0) {
        GL var2 = class47.field739;
        var2.glBindBufferARB(34963, this.field1510);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1509 ? 35040 : 35044);
        class119.field2007 += arg0.limit() - this.field1507;
        this.field1507 = arg0.limit();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 16)
    public final void method719() {
        GL var1 = class47.field739;
        var1.glBindBufferARB(34963, this.field1510);
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field1510 != -1) {
            class119.method912(this.field1510, this.field1507, this.field1508);
            this.field1510 = -1;
            this.field1507 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 31)
    public class92() {
        this(false);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Z)V", line = 72)
    public class92(boolean arg0) {
        this.field1507 = 0;
        this.field1510 = -1;
        GL var2 = class47.field739;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1509 = arg0;
        this.field1510 = var3[0];
        this.field1508 = class119.field2009;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 39)
    public final void method720(ByteBuffer arg0) {
        GL var2 = class47.field739;
        var2.glBindBufferARB(34962, this.field1510);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1509 ? 35040 : 35044);
        class119.field2007 += arg0.limit() - this.field1507;
        this.field1507 = arg0.limit();
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 50)
    public final void method721(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1507) {
            GL var2 = class47.field739;
            var2.glBindBufferARB(34962, this.field1510);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method720(arg0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V", line = 66)
    public final void method722() {
        GL var1 = class47.field739;
        var1.glBindBufferARB(34962, this.field1510);
    }
}
