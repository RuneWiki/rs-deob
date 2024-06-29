import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class86 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lql;")
    public class346 field959;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
    private boolean field963;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
    private static int[] field961 = new int[1];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()I", line = 5)
    public int method225() {
        return this.field964;
    }

    @OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field959.method2097(this.field964, this.field962);
        super.finalize();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([BI)V", line = 21)
    public final void method470(byte[] arg0, int arg1) {
        this.method469();
        if (arg1 > this.field962) {
            this.field959.field4697.glBufferDataARB(this.field960, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field963 ? 35040 : 35044);
            this.field959.field4721 += arg1 - this.field962;
            this.field962 = arg1;
        } else {
            this.field959.field4697.glBufferSubDataARB(this.field960, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lql;I[BIZ)V", line = 40)
    public class86(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field959 = arg0;
        this.field960 = arg1;
        this.field962 = arg3;
        this.field963 = arg4;
        opengl var6 = arg0.field4697;
        var6.glGenBuffersARB(1, field961, 0);
        this.field964 = field961[0];
        this.method469();
        var6.glBufferDataARB(arg1, this.field962, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field962), this.field963 ? 35040 : 35044);
        this.field959.field4721 += this.field962;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lql;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class86(class346 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field959 = arg0;
        this.field960 = arg1;
        this.field962 = arg2.limit();
        this.field963 = arg3;
        opengl var5 = arg0.field4697;
        var5.glGenBuffersARB(1, field961, 0);
        this.field964 = field961[0];
        this.method469();
        var5.glBufferDataARB(arg1, this.field962, arg2, this.field963 ? 35040 : 35044);
        this.field959.field4721 += this.field962;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()V")
    public abstract void method469();
}
