import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class288 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    private int field5137;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    private int field5138;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Z")
    private boolean field5136;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 5)
    public class288() {
        this(false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 11)
    public final void method2054(ByteBuffer arg0) {
        GL var2 = class97.field1801;
        var2.glBindBufferARB(34963, this.field5137);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field5136 ? 35040 : 35044);
        class308.field5468 += arg0.limit() - this.field5138;
        this.field5138 = arg0.limit();
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Z)V", line = 72)
    public class288(boolean arg0) {
        this.field5137 = -1;
        this.field5138 = 0;
        GL var2 = class97.field1801;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field5136 = arg0;
        this.field5137 = var3[0];
        this.field5135 = class308.field5469;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 25)
    public final void method2055(ByteBuffer arg0) {
        GL var2 = class97.field1801;
        var2.glBindBufferARB(34962, this.field5137);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field5136 ? 35040 : 35044);
        class308.field5468 += arg0.limit() - this.field5138;
        this.field5138 = arg0.limit();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 35)
    public final void method2056() {
        GL var1 = class97.field1801;
        var1.glBindBufferARB(34963, this.field5137);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 39)
    public final void method2057(ByteBuffer arg0) {
        if (arg0.limit() <= this.field5138) {
            GL var2 = class97.field1801;
            var2.glBindBufferARB(34962, this.field5137);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method2055(arg0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        if (this.field5137 != -1) {
            class308.method2197(this.field5137, this.field5138, this.field5135);
            this.field5137 = -1;
            this.field5138 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V", line = 65)
    public final void method2058() {
        GL var1 = class97.field1801;
        var1.glBindBufferARB(34962, this.field5137);
    }
}
