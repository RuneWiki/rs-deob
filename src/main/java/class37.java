import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class37 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lse;")
    public class282 field560;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
    private boolean field559;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[I")
    private static int[] field557 = new int[1];

    @OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field560.method1879(this.field562, this.field558);
        super.finalize();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I", line = 10)
    public int method282() {
        return this.field562;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lse;I[BIZ)V", line = 24)
    public class37(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field560 = arg0;
        this.field561 = arg1;
        this.field558 = arg3;
        this.field559 = arg4;
        opengl var6 = arg0.field4140;
        var6.glGenBuffersARB(1, field557, 0);
        this.field562 = field557[0];
        this.method283();
        var6.glBufferDataARB(arg1, this.field558, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field558), this.field559 ? 35040 : 35044);
        this.field560.field4164 += this.field558;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lse;ILjava/nio/ByteBuffer;Z)V", line = 41)
    public class37(class282 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field560 = arg0;
        this.field561 = arg1;
        this.field558 = arg2.limit();
        this.field559 = arg3;
        opengl var5 = arg0.field4140;
        var5.glGenBuffersARB(1, field557, 0);
        this.field562 = field557[0];
        this.method283();
        var5.glBufferDataARB(arg1, this.field558, arg2, this.field559 ? 35040 : 35044);
        this.field560.field4164 += this.field558;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BI)V", line = 63)
    public final void method284(byte[] arg0, int arg1) {
        this.method283();
        if (arg1 > this.field558) {
            this.field560.field4140.glBufferDataARB(this.field561, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field559 ? 35040 : 35044);
            this.field560.field4164 += arg1 - this.field558;
            this.field558 = arg1;
        } else {
            this.field560.field4140.glBufferSubDataARB(this.field561, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()V")
    public abstract void method283();
}
