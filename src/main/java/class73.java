import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class73 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lmi;")
    public class315 field900;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
    private boolean field903;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
    private static int[] field904 = new int[1];

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V")
    public abstract void method433();

    @OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field900.method2014(this.field902, this.field901);
        super.finalize();
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lmi;I[BIZ)V")
    public class73(class315 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field900 = arg0;
        this.field905 = arg1;
        this.field901 = arg3;
        this.field903 = arg4;
        opengl var6 = arg0.field4445;
        var6.glGenBuffersARB(1, field904, 0);
        this.field902 = field904[0];
        this.method433();
        var6.glBufferDataARB(arg1, this.field901, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field901), this.field903 ? 35040 : 35044);
        this.field900.field4456 += this.field901;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()I")
    public int method434() {
        return this.field902;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lmi;ILjava/nio/ByteBuffer;Z)V")
    public class73(class315 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field900 = arg0;
        this.field905 = arg1;
        this.field901 = arg2.limit();
        this.field903 = arg3;
        opengl var5 = arg0.field4445;
        var5.glGenBuffersARB(1, field904, 0);
        this.field902 = field904[0];
        this.method433();
        var5.glBufferDataARB(arg1, this.field901, arg2, this.field903 ? 35040 : 35044);
        this.field900.field4456 += this.field901;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
    public final void method435(byte[] arg0, int arg1) {
        this.method433();
        if (arg1 > this.field901) {
            this.field900.field4445.glBufferDataARB(this.field905, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field903 ? 35040 : 35044);
            this.field900.field4456 += arg1 - this.field901;
            this.field901 = arg1;
        } else {
            this.field900.field4445.glBufferSubDataARB(this.field905, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }
}
