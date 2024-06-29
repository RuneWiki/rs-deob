import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class216 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
    private boolean field3412;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method1442(ByteBuffer arg0) {
        GL var2 = class333.field5160;
        var2.glBindBufferARB(34962, this.field3409);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3412 ? 35040 : 35044);
        class301.field4650 += arg0.limit() - this.field3410;
        this.field3410 = arg0.limit();
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 16)
    public final void method1443(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3410) {
            GL var2 = class333.field5160;
            var2.glBindBufferARB(34962, this.field3409);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1442(arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 30)
    public class216() {
        this(false);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V", line = 36)
    public final void method1444() {
        GL var1 = class333.field5160;
        var1.glBindBufferARB(34963, this.field3409);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Z)V", line = 67)
    public class216(boolean arg0) {
        this.field3410 = 0;
        this.field3409 = -1;
        GL var2 = class333.field5160;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3412 = arg0;
        this.field3409 = var3[0];
        this.field3411 = class301.field4649;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 49)
    public final void method1445(ByteBuffer arg0) {
        GL var2 = class333.field5160;
        var2.glBindBufferARB(34963, this.field3409);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3412 ? 35040 : 35044);
        class301.field4650 += arg0.limit() - this.field3410;
        this.field3410 = arg0.limit();
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() throws Throwable {
        if (this.field3409 != -1) {
            class301.method1981(this.field3409, this.field3410, this.field3411);
            this.field3409 = -1;
            this.field3410 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V", line = 79)
    public final void method1446() {
        GL var1 = class333.field5160;
        var1.glBindBufferARB(34962, this.field3409);
    }
}
