import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class206 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    private int field3512;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Z")
    private boolean field3510;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 7)
    public final void method1538(ByteBuffer arg0) {
        GL var2 = class43.field651;
        var2.glBindBufferARB(34962, this.field3512);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field3510 ? 35040 : 35044);
        class151.field2670 += arg0.limit() - this.field3511;
        this.field3511 = arg0.limit();
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 16)
    public class206() {
        this(false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 20)
    public final void method1539() {
        GL var1 = class43.field651;
        var1.glBindBufferARB(34962, this.field3512);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 27)
    public final void method1540(ByteBuffer arg0) {
        GL var2 = class43.field651;
        var2.glBindBufferARB(34963, this.field3512);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field3510 ? 35040 : 35044);
        class151.field2670 += arg0.limit() - this.field3511;
        this.field3511 = arg0.limit();
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 37)
    public final void method1541() {
        GL var1 = class43.field651;
        var1.glBindBufferARB(34963, this.field3512);
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field3512 != -1) {
            class151.method1191(this.field3512, this.field3511, this.field3509);
            this.field3512 = -1;
            this.field3511 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 51)
    public final void method1542(ByteBuffer arg0) {
        if (arg0.limit() <= this.field3511) {
            GL var2 = class43.field651;
            var2.glBindBufferARB(34962, this.field3512);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method1538(arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Z)V", line = 72)
    public class206(boolean arg0) {
        this.field3511 = 0;
        this.field3512 = -1;
        GL var2 = class43.field651;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field3510 = arg0;
        this.field3512 = var3[0];
        this.field3509 = class151.field2669;
    }
}
