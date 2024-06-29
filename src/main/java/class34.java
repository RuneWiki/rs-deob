import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Z")
    private boolean field643;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 5)
    public class34() {
        this(false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 9)
    public final void method244(ByteBuffer arg0) {
        GL var2 = class271.field4641;
        var2.glBindBufferARB(34962, this.field640);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field643 ? 35040 : 35044);
        class68.field1128 += arg0.limit() - this.field641;
        this.field641 = arg0.limit();
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 22)
    public final void method245(ByteBuffer arg0) {
        GL var2 = class271.field4641;
        var2.glBindBufferARB(34963, this.field640);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field643 ? 35040 : 35044);
        class68.field1128 += arg0.limit() - this.field641;
        this.field641 = arg0.limit();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 32)
    public final void method246() {
        GL var1 = class271.field4641;
        var1.glBindBufferARB(34962, this.field640);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 36)
    public final void method247(ByteBuffer arg0) {
        if (arg0.limit() <= this.field641) {
            GL var2 = class271.field4641;
            var2.glBindBufferARB(34962, this.field640);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method244(arg0);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Z)V", line = 57)
    public class34(boolean arg0) {
        this.field641 = 0;
        this.field640 = -1;
        GL var2 = class271.field4641;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field643 = arg0;
        this.field640 = var3[0];
        this.field642 = class68.field1125;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 69)
    public final void method248() {
        GL var1 = class271.field4641;
        var1.glBindBufferARB(34963, this.field640);
    }

    @OriginalMember(owner = "client!sg", name = "finalize", descriptor = "()V", line = 73)
    protected final void finalize() throws Throwable {
        if (this.field640 != -1) {
            class68.method504(this.field640, this.field641, this.field642);
            this.field640 = -1;
            this.field641 = 0;
        }
        super.finalize();
    }
}
