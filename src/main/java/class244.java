import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class244 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    private int field4173;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    private int field4174;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Z")
    private boolean field4172;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    private int field4175;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V", line = 7)
    public final void method1660() {
        GL var1 = class247.field4253;
        var1.glBindBufferARB(34963, this.field4174);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()V", line = 14)
    public final void method1661() {
        GL var1 = class247.field4253;
        var1.glBindBufferARB(34962, this.field4174);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 19)
    public final void method1662(ByteBuffer arg0) {
        GL var2 = class247.field4253;
        var2.glBindBufferARB(34962, this.field4174);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field4172 ? 35040 : 35044);
        class274.field4745 += arg0.limit() - this.field4173;
        this.field4173 = arg0.limit();
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Z)V", line = 72)
    public class244(boolean arg0) {
        this.field4173 = 0;
        this.field4174 = -1;
        GL var2 = class247.field4253;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field4172 = arg0;
        this.field4174 = var3[0];
        this.field4175 = class274.field4748;
    }

    @OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        if (this.field4174 != -1) {
            class274.method1922(this.field4174, this.field4173, this.field4175);
            this.field4174 = -1;
            this.field4173 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 42)
    public final void method1663(ByteBuffer arg0) {
        if (arg0.limit() <= this.field4173) {
            GL var2 = class247.field4253;
            var2.glBindBufferARB(34962, this.field4174);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1662(arg0);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 56)
    public class244() {
        this(false);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 64)
    public final void method1664(ByteBuffer arg0) {
        GL var2 = class247.field4253;
        var2.glBindBufferARB(34963, this.field4174);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field4172 ? 35040 : 35044);
        class274.field4745 += arg0.limit() - this.field4173;
        this.field4173 = arg0.limit();
    }
}
