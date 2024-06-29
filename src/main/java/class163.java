import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class163 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lic;")
    public class246 field1962;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    private boolean field1960;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    private static int[] field1961 = new int[1];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI)V", line = 19)
    public final void method796(byte[] arg0, int arg1) {
        this.method750();
        if (arg1 > this.field1965) {
            this.field1962.field3342.glBufferDataARB(this.field1964, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field1960 ? 35040 : 35044);
            this.field1962.field3358 += arg1 - this.field1965;
            this.field1965 = arg1;
        } else {
            this.field1962.field3342.glBufferSubDataARB(this.field1964, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()I", line = 34)
    public int method747() {
        return this.field1963;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        this.field1962.method1357(this.field1963, this.field1965);
        super.finalize();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lic;I[BIZ)V", line = 40)
    public class163(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1962 = arg0;
        this.field1964 = arg1;
        this.field1965 = arg3;
        this.field1960 = arg4;
        opengl var6 = arg0.field3342;
        var6.glGenBuffersARB(1, field1961, 0);
        this.field1963 = field1961[0];
        this.method750();
        var6.glBufferDataARB(arg1, this.field1965, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field1965), this.field1960 ? 35040 : 35044);
        this.field1962.field3358 += this.field1965;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lic;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class163(class246 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field1962 = arg0;
        this.field1964 = arg1;
        this.field1965 = arg2.limit();
        this.field1960 = arg3;
        opengl var5 = arg0.field3342;
        var5.glGenBuffersARB(1, field1961, 0);
        this.field1963 = field1961[0];
        this.method750();
        var5.glBufferDataARB(arg1, this.field1965, arg2, this.field1960 ? 35040 : 35044);
        this.field1962.field3358 += this.field1965;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public abstract void method750();
}
