import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class52 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Z")
    private boolean field643;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V", line = 6)
    public final void method345() {
        GL var1 = class117.field1801;
        var1.glBindBufferARB(34962, this.field645);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V", line = 12)
    public final void method346() {
        GL var1 = class117.field1801;
        var1.glBindBufferARB(34963, this.field645);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 17)
    public class52() {
        this(false);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Z)V", line = 72)
    public class52(boolean arg0) {
        this.field644 = 0;
        this.field645 = -1;
        GL var2 = class117.field1801;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field643 = arg0;
        this.field645 = var3[0];
        this.field646 = class174.field2589;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 25)
    public final void method347(ByteBuffer arg0) {
        GL var2 = class117.field1801;
        var2.glBindBufferARB(34963, this.field645);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field643 ? 35040 : 35044);
        class174.field2590 += arg0.limit() - this.field644;
        this.field644 = arg0.limit();
    }

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        if (this.field645 != -1) {
            class174.method1208(this.field645, this.field644, this.field646);
            this.field645 = -1;
            this.field644 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 49)
    public final void method348(ByteBuffer arg0) {
        GL var2 = class117.field1801;
        var2.glBindBufferARB(34962, this.field645);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field643 ? 35040 : 35044);
        class174.field2590 += arg0.limit() - this.field644;
        this.field644 = arg0.limit();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 58)
    public final void method349(ByteBuffer arg0) {
        if (arg0.limit() <= this.field644) {
            GL var2 = class117.field1801;
            var2.glBindBufferARB(34962, this.field645);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method348(arg0);
        }
    }
}
