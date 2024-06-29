import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Z")
    private boolean field1442;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 5)
    public final void method560(ByteBuffer arg0) {
        if (arg0.limit() <= this.field1444) {
            GL var2 = class108.field1899;
            var2.glBindBufferARB(34962, this.field1445);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method563(arg0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 22)
    public final void method561(ByteBuffer arg0) {
        GL var2 = class108.field1899;
        var2.glBindBufferARB(34963, this.field1445);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field1442 ? 35040 : 35044);
        class263.field4545 += arg0.limit() - this.field1444;
        this.field1444 = arg0.limit();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 32)
    public final void method562() {
        GL var1 = class108.field1899;
        var1.glBindBufferARB(34963, this.field1445);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 37)
    public final void method563(ByteBuffer arg0) {
        GL var2 = class108.field1899;
        var2.glBindBufferARB(34962, this.field1445);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field1442 ? 35040 : 35044);
        class263.field4545 += arg0.limit() - this.field1444;
        this.field1444 = arg0.limit();
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 46)
    public class79() {
        this(false);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Z)V", line = 72)
    public class79(boolean arg0) {
        this.field1445 = -1;
        this.field1444 = 0;
        GL var2 = class108.field1899;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field1442 = arg0;
        this.field1445 = var3[0];
        this.field1443 = class263.field4547;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V", line = 55)
    protected final void finalize() throws Throwable {
        if (this.field1445 != -1) {
            class263.method1862(this.field1445, this.field1444, this.field1443);
            this.field1445 = -1;
            this.field1444 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()V", line = 66)
    public final void method564() {
        GL var1 = class108.field1899;
        var1.glBindBufferARB(34962, this.field1445);
    }
}
