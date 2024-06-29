import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class297 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lh;")
    public class327 field3955;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
    private boolean field3959;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "[I")
    private static int[] field3956 = new int[1];

    @OriginalMember(owner = "client!ho", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3955.method2050(this.field3957, this.field3954);
        super.finalize();
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([BI)V")
    public final void method1885(byte[] arg0, int arg1) {
        this.method513();
        if (arg1 > this.field3954) {
            this.field3955.field4363.glBufferDataARB(this.field3958, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field3959 ? 35040 : 35044);
            this.field3955.field4375 += arg1 - this.field3954;
            this.field3954 = arg1;
        } else {
            this.field3955.field4363.glBufferSubDataARB(this.field3958, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()I")
    public int method49() {
        return this.field3957;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()V")
    public abstract void method513();

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lh;I[BIZ)V")
    public class297(class327 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3955 = arg0;
        this.field3958 = arg1;
        this.field3954 = arg3;
        this.field3959 = arg4;
        opengl var6 = arg0.field4363;
        var6.glGenBuffersARB(1, field3956, 0);
        this.field3957 = field3956[0];
        this.method513();
        var6.glBufferDataARB(arg1, this.field3954, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field3954), this.field3959 ? 35040 : 35044);
        this.field3955.field4375 += this.field3954;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lh;ILjava/nio/ByteBuffer;Z)V")
    public class297(class327 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field3955 = arg0;
        this.field3958 = arg1;
        this.field3954 = arg2.limit();
        this.field3959 = arg3;
        opengl var5 = arg0.field4363;
        var5.glGenBuffersARB(1, field3956, 0);
        this.field3957 = field3956[0];
        this.method513();
        var5.glBufferDataARB(arg1, this.field3954, arg2, this.field3959 ? 35040 : 35044);
        this.field3955.field4375 += this.field3954;
    }
}
