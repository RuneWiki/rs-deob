import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class230 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lpo;")
    public class332 field3122;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private int field3121;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
    private boolean field3123;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[I")
    private static int[] field3125 = new int[1];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I", line = 9)
    public int method380() {
        return this.field3124;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V", line = 16)
    public final void method1473(byte[] arg0, int arg1) {
        this.method383();
        if (arg1 > this.field3121) {
            this.field3122.field4752.glBufferDataARB(this.field3126, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field3123 ? 35040 : 35044);
            this.field3122.field4765 += arg1 - this.field3121;
            this.field3121 = arg1;
        } else {
            this.field3122.field4752.glBufferSubDataARB(this.field3126, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpo;I[BIZ)V", line = 35)
    public class230(class332 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3122 = arg0;
        this.field3126 = arg1;
        this.field3121 = arg3;
        this.field3123 = arg4;
        opengl var6 = arg0.field4752;
        var6.glGenBuffersARB(1, field3125, 0);
        this.field3124 = field3125[0];
        this.method383();
        var6.glBufferDataARB(arg1, this.field3121, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field3121), this.field3123 ? 35040 : 35044);
        this.field3122.field4765 += this.field3121;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpo;ILjava/nio/ByteBuffer;Z)V", line = 53)
    public class230(class332 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field3122 = arg0;
        this.field3126 = arg1;
        this.field3121 = arg2.limit();
        this.field3123 = arg3;
        opengl var5 = arg0.field4752;
        var5.glGenBuffersARB(1, field3125, 0);
        this.field3124 = field3125[0];
        this.method383();
        var5.glBufferDataARB(arg1, this.field3121, arg2, this.field3123 ? 35040 : 35044);
        this.field3122.field4765 += this.field3121;
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 71)
    protected final void finalize() throws Throwable {
        this.field3122.method2081(this.field3124, this.field3121);
        super.finalize();
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
    public abstract void method383();
}
