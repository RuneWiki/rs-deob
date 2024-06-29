import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
    private boolean field1184;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V", line = 6)
    public final void method533() {
        GL var1 = class117.field2143;
        var1.glBindBufferARB(34963, this.field1182);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 12)
    public final void method534(ByteBuffer arg0) {
        GL var2 = class117.field2143;
        var2.glBindBufferARB(34962, this.field1182);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1184 ? 35040 : 35044);
        class41.field660 += arg0.limit() - this.field1183;
        this.field1183 = arg0.limit();
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 21)
    public final void method535(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1183) {
            GL var2 = class117.field2143;
            var2.glBindBufferARB(34962, this.field1182);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method534(arg0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        if (this.field1182 != -1) {
            class41.method304(this.field1182, this.field1183, this.field1185);
            this.field1182 = -1;
            this.field1183 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V", line = 47)
    public final void method536() {
        GL var1 = class117.field2143;
        var1.glBindBufferARB(34962, this.field1182);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 53)
    public class75() {
        this(false);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 57)
    public final void method537(ByteBuffer arg0) {
        GL var2 = class117.field2143;
        var2.glBindBufferARB(34963, this.field1182);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1184 ? 35040 : 35044);
        class41.field660 += arg0.limit() - this.field1183;
        this.field1183 = arg0.limit();
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Z)V", line = 72)
    public class75(boolean arg0) {
        this.field1183 = 0;
        this.field1182 = -1;
        GL var2 = class117.field2143;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1184 = arg0;
        this.field1182 = var3[0];
        this.field1185 = class41.field659;
    }
}
