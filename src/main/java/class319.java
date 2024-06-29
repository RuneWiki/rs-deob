import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class319 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    private int field5476;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private int field5477;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
    private boolean field5479;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    private int field5478;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method2211(ByteBuffer arg0) {
        GL var2 = class231.field4052;
        var2.glBindBufferARB(34962, this.field5476);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field5479 ? 35040 : 35044);
        class124.field2100 += arg0.limit() - this.field5477;
        this.field5477 = arg0.limit();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 15)
    public final void method2212(ByteBuffer arg0) {
        if (arg0.limit() <= this.field5477) {
            GL var2 = class231.field4052;
            var2.glBindBufferARB(34962, this.field5476);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2211(arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 30)
    public final void method2213(ByteBuffer arg0) {
        GL var2 = class231.field4052;
        var2.glBindBufferARB(34963, this.field5476);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field5479 ? 35040 : 35044);
        class124.field2100 += arg0.limit() - this.field5477;
        this.field5477 = arg0.limit();
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 39)
    public class319() {
        this(false);
    }

    @OriginalMember(owner = "client!nd", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        if (this.field5476 != -1) {
            class124.method860(this.field5476, this.field5477, this.field5478);
            this.field5476 = -1;
            this.field5477 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 56)
    public final void method2214() {
        GL var1 = class231.field4052;
        var1.glBindBufferARB(34963, this.field5476);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Z)V", line = 72)
    public class319(boolean arg0) {
        this.field5476 = -1;
        this.field5477 = 0;
        GL var2 = class231.field4052;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field5479 = arg0;
        this.field5476 = var3[0];
        this.field5478 = class124.field2099;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()V", line = 65)
    public final void method2215() {
        GL var1 = class231.field4052;
        var1.glBindBufferARB(34962, this.field5476);
    }
}
