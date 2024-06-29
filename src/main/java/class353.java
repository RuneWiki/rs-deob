import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class353 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lao;")
    public class157 field4981;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Z")
    private boolean field4982;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
    private static int[] field4984 = new int[1];

    @OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4981.method965(this.field4979, this.field4983);
        super.finalize();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([BI)V")
    public final void method2249(byte[] arg0, int arg1) {
        this.method1548();
        if (arg1 > this.field4983) {
            this.field4981.field1927.glBufferDataARB(this.field4980, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field4982 ? 35040 : 35044);
            this.field4981.field1936 += arg1 - this.field4983;
            this.field4983 = arg1;
        } else {
            this.field4981.field1927.glBufferSubDataARB(this.field4980, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()I")
    public int method461() {
        return this.field4979;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
    public abstract void method1548();

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lao;I[BIZ)V")
    public class353(class157 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4981 = arg0;
        this.field4980 = arg1;
        this.field4983 = arg3;
        this.field4982 = arg4;
        opengl var6 = arg0.field1927;
        var6.glGenBuffersARB(1, field4984, 0);
        this.field4979 = field4984[0];
        this.method1548();
        var6.glBufferDataARB(arg1, this.field4983, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field4983), this.field4982 ? 35040 : 35044);
        this.field4981.field1936 += this.field4983;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lao;ILjava/nio/ByteBuffer;Z)V")
    public class353(class157 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field4981 = arg0;
        this.field4980 = arg1;
        this.field4983 = arg2.limit();
        this.field4982 = arg3;
        opengl var5 = arg0.field1927;
        var5.glGenBuffersARB(1, field4984, 0);
        this.field4979 = field4984[0];
        this.method1548();
        var5.glBufferDataARB(arg1, this.field4983, arg2, this.field4982 ? 35040 : 35044);
        this.field4981.field1936 += this.field4983;
    }
}
