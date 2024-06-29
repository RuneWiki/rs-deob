import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class47 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
    private boolean field580;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method252(ByteBuffer arg0) {
        GL var2 = class90.field1390;
        var2.glBindBufferARB(34962, this.field578);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field580 ? 35040 : 35044);
        class7.field86 += arg0.limit() - this.field581;
        this.field581 = arg0.limit();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 16)
    public class47() {
        this(false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 20)
    public final void method253() {
        GL var1 = class90.field1390;
        var1.glBindBufferARB(34963, this.field578);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Z)V", line = 72)
    public class47(boolean arg0) {
        this.field578 = -1;
        this.field581 = 0;
        GL var2 = class90.field1390;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field580 = arg0;
        this.field578 = var3[0];
        this.field579 = class7.field91;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 30)
    public final void method254(ByteBuffer arg0) {
        GL var2 = class90.field1390;
        var2.glBindBufferARB(34963, this.field578);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field580 ? 35040 : 35044);
        class7.field86 += arg0.limit() - this.field581;
        this.field581 = arg0.limit();
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()V", line = 40)
    public final void method255() {
        GL var1 = class90.field1390;
        var1.glBindBufferARB(34962, this.field578);
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        if (this.field578 != -1) {
            class7.method28(this.field578, this.field581, this.field579);
            this.field578 = -1;
            this.field581 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 58)
    public final void method256(ByteBuffer arg0) {
        if (arg0.limit() <= this.field581) {
            GL var2 = class90.field1390;
            var2.glBindBufferARB(34962, this.field578);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method252(arg0);
        }
    }
}
