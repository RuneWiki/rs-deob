import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class83 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    private boolean field1330;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method585(ByteBuffer arg0) {
        GL var2 = class56.field848;
        var2.glBindBufferARB(34962, this.field1333);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1330 ? 35040 : 35044);
        class121.field2026 += arg0.limit() - this.field1331;
        this.field1331 = arg0.limit();
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 17)
    public final void method586(ByteBuffer arg0) {
        GL var2 = class56.field848;
        var2.glBindBufferARB(34963, this.field1333);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1330 ? 35040 : 35044);
        class121.field2026 += arg0.limit() - this.field1331;
        this.field1331 = arg0.limit();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 26)
    public class83() {
        this(false);
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        if (this.field1333 != -1) {
            class121.method796(this.field1333, this.field1331, this.field1332);
            this.field1333 = -1;
            this.field1331 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Z)V", line = 72)
    public class83(boolean arg0) {
        this.field1331 = 0;
        this.field1333 = -1;
        GL var2 = class56.field848;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1330 = arg0;
        this.field1333 = var3[0];
        this.field1332 = class121.field2023;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 44)
    public final void method587() {
        GL var1 = class56.field848;
        var1.glBindBufferARB(34963, this.field1333);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V", line = 50)
    public final void method588() {
        GL var1 = class56.field848;
        var1.glBindBufferARB(34962, this.field1333);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 56)
    public final void method589(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1331) {
            GL var2 = class56.field848;
            var2.glBindBufferARB(34962, this.field1333);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method585(arg0);
        }
    }
}
