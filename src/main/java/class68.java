import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class68 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lih;")
    public class330 field948;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
    private boolean field945;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    private static int[] field946 = new int[1];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I", line = 7)
    public int method90() {
        return this.field950;
    }

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        this.field948.method2085(this.field950, this.field949);
        super.finalize();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V", line = 26)
    public final void method438(byte[] arg0, int arg1) {
        this.method437();
        if (arg1 > this.field949) {
            this.field948.field4741.glBufferDataARB(this.field947, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field945 ? 35040 : 35044);
            this.field948.field4753 += arg1 - this.field949;
            this.field949 = arg1;
        } else {
            this.field948.field4741.glBufferSubDataARB(this.field947, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 40)
    public class68(class330 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field948 = arg0;
        this.field947 = arg1;
        this.field949 = arg3;
        this.field945 = arg4;
        opengl var6 = arg0.field4741;
        var6.glGenBuffersARB(1, field946, 0);
        this.field950 = field946[0];
        this.method437();
        var6.glBufferDataARB(arg1, this.field949, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field949), this.field945 ? 35040 : 35044);
        this.field948.field4753 += this.field949;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lih;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class68(class330 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field948 = arg0;
        this.field947 = arg1;
        this.field949 = arg2.limit();
        this.field945 = arg3;
        opengl var5 = arg0.field4741;
        var5.glGenBuffersARB(1, field946, 0);
        this.field950 = field946[0];
        this.method437();
        var5.glBufferDataARB(arg1, this.field949, arg2, this.field945 ? 35040 : 35044);
        this.field948.field4753 += this.field949;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
    public abstract void method437();
}
