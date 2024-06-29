import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Z")
    private boolean field440;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 6)
    public final void method152(ByteBuffer arg0) {
        GL var2 = class281.field4839;
        var2.glBindBufferARB(34963, this.field442);
        var2.glBufferDataARB(34963, arg0.limit(), arg0, this.field440 ? 35040 : 35044);
        class139.field2327 += arg0.limit() - this.field439;
        this.field439 = arg0.limit();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 15)
    public final void method153(ByteBuffer arg0) {
        if (arg0.limit() <= this.field439) {
            GL var2 = class281.field4839;
            var2.glBindBufferARB(34962, this.field442);
            var2.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
        } else {
            this.method156(arg0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V", line = 32)
    public final void method154() {
        GL var1 = class281.field4839;
        var1.glBindBufferARB(34962, this.field442);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()V", line = 37)
    public final void method155() {
        GL var1 = class281.field4839;
        var1.glBindBufferARB(34963, this.field442);
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        if (this.field442 != -1) {
            class139.method1038(this.field442, this.field439, this.field441);
            this.field442 = -1;
            this.field439 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 53)
    public class28() {
        this(false);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Z)V", line = 72)
    public class28(boolean arg0) {
        this.field442 = -1;
        this.field439 = 0;
        GL var2 = class281.field4839;
        int[] var3 = new int[1];
        var2.glGenBuffersARB(1, var3, 0);
        this.field440 = arg0;
        this.field442 = var3[0];
        this.field441 = class139.field2330;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Ljava/nio/ByteBuffer;)V", line = 64)
    public final void method156(ByteBuffer arg0) {
        GL var2 = class281.field4839;
        var2.glBindBufferARB(34962, this.field442);
        var2.glBufferDataARB(34962, arg0.limit(), arg0, this.field440 ? 35040 : 35044);
        class139.field2327 += arg0.limit() - this.field439;
        this.field439 = arg0.limit();
    }
}
