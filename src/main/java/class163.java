import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class163 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lge;")
    public class104 field2460;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
    private boolean field2459;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    private static int[] field2457 = new int[1];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
    public abstract void method1267();

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2460.method858(this.field2458, this.field2455);
        super.finalize();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)V")
    public final void method1268(byte[] arg0, int arg1) {
        this.method1267();
        if (arg1 > this.field2455) {
            this.field2460.field1604.glBufferDataARB(this.field2456, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field2459 ? 35040 : 35044);
            this.field2460.field1620 += arg1 - this.field2455;
            this.field2455 = arg1;
        } else {
            this.field2460.field1604.glBufferSubDataARB(this.field2456, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
    public int method978() {
        return this.field2458;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lge;I[BIZ)V")
    public class163(class104 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2460 = arg0;
        this.field2456 = arg1;
        this.field2455 = arg3;
        this.field2459 = arg4;
        opengl var6 = arg0.field1604;
        var6.glGenBuffersARB(1, field2457, 0);
        this.field2458 = field2457[0];
        this.method1267();
        var6.glBufferDataARB(arg1, this.field2455, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field2455), this.field2459 ? 35040 : 35044);
        this.field2460.field1620 += this.field2455;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lge;ILjava/nio/ByteBuffer;Z)V")
    public class163(class104 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field2460 = arg0;
        this.field2456 = arg1;
        this.field2455 = arg2.limit();
        this.field2459 = arg3;
        opengl var5 = arg0.field1604;
        var5.glGenBuffersARB(1, field2457, 0);
        this.field2458 = field2457[0];
        this.method1267();
        var5.glBufferDataARB(arg1, this.field2455, arg2, this.field2459 ? 35040 : 35044);
        this.field2460.field1620 += this.field2455;
    }
}
