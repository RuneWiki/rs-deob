import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class354 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    private int field5637;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Z")
    private boolean field5639;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    private int field5638;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 5)
    public class354() {
        this(false);
    }

    @OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        if (this.field5636 != -1) {
            class1.method1(this.field5636, this.field5637, this.field5638);
            this.field5636 = -1;
            this.field5637 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 20)
    public final void method2446(ByteBuffer arg0) {
        GL var2 = class272.field4310;
        var2.glBindBufferARB(34962, this.field5636);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field5639 ? 35040 : 35044);
        class1.field6 += arg0.limit() - this.field5637;
        this.field5637 = arg0.limit();
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 30)
    public final void method2447() {
        GL var1 = class272.field4310;
        var1.glBindBufferARB(34962, this.field5636);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 34)
    public final void method2448(ByteBuffer arg0) {
        if (arg0.limit() <= this.field5637) {
            GL var2 = class272.field4310;
            var2.glBindBufferARB(34962, this.field5636);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2446(arg0);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()V", line = 49)
    public final void method2449() {
        GL var1 = class272.field4310;
        var1.glBindBufferARB(34963, this.field5636);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Z)V", line = 72)
    public class354(boolean arg0) {
        this.field5636 = -1;
        this.field5637 = 0;
        GL var2 = class272.field4310;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field5639 = arg0;
        this.field5636 = var3[0];
        this.field5638 = class1.field3;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 60)
    public final void method2450(ByteBuffer arg0) {
        GL var2 = class272.field4310;
        var2.glBindBufferARB(34963, this.field5636);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field5639 ? 35040 : 35044);
        class1.field6 += arg0.limit() - this.field5637;
        this.field5637 = arg0.limit();
    }
}
