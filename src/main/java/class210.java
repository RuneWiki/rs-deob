import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class210 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lig;")
    public class132 field2997;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    private int field2999;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Z")
    private boolean field2998;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "[I")
    private static int[] field2995 = new int[1];

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
    public abstract void method1487();

    @OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2997.method916(this.field3000, this.field2996);
        super.finalize();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BI)V")
    public final void method1488(byte[] arg0, int arg1) {
        this.method1487();
        if (arg1 > this.field2996) {
            this.field2997.field1918.glBufferDataARB(this.field2999, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field2998 ? 35040 : 35044);
            this.field2997.field1932 += arg1 - this.field2996;
            this.field2996 = arg1;
        } else {
            this.field2997.field1918.glBufferSubDataARB(this.field2999, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()I")
    public int method34() {
        return this.field3000;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lig;I[BIZ)V")
    public class210(class132 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2997 = arg0;
        this.field2999 = arg1;
        this.field2996 = arg3;
        this.field2998 = arg4;
        opengl var6 = arg0.field1918;
        var6.glGenBuffersARB(1, field2995, 0);
        this.field3000 = field2995[0];
        this.method1487();
        var6.glBufferDataARB(arg1, this.field2996, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field2996), this.field2998 ? 35040 : 35044);
        this.field2997.field1932 += this.field2996;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lig;ILjava/nio/ByteBuffer;Z)V")
    public class210(class132 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field2997 = arg0;
        this.field2999 = arg1;
        this.field2996 = arg2.limit();
        this.field2998 = arg3;
        opengl var5 = arg0.field1918;
        var5.glGenBuffersARB(1, field2995, 0);
        this.field3000 = field2995[0];
        this.method1487();
        var5.glBufferDataARB(arg1, this.field2996, arg2, this.field2998 ? 35040 : 35044);
        this.field2997.field1932 += this.field2996;
    }
}
