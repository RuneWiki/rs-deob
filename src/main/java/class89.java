import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class class89 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lcg;")
    public class393 field1264;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
    private boolean field1268;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
    private static int[] field1267 = new int[1];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()I")
    public int method586() {
        return this.field1266;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()V")
    public abstract void method587();

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([BI)V")
    public final void method588(byte[] arg0, int arg1) {
        this.method587();
        if (arg1 > this.field1269) {
            this.field1264.field5783.glBufferDataARB(this.field1265, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field1268 ? 35040 : 35044);
            this.field1264.field5789 += arg1 - this.field1269;
            this.field1269 = arg1;
        } else {
            this.field1264.field5783.glBufferSubDataARB(this.field1265, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1264.method2426(this.field1266, this.field1269);
        super.finalize();
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lcg;I[BIZ)V")
    public class89(class393 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1264 = arg0;
        this.field1265 = arg1;
        this.field1269 = arg3;
        this.field1268 = arg4;
        opengl var6 = arg0.field5783;
        var6.glGenBuffersARB(1, field1267, 0);
        this.field1266 = field1267[0];
        this.method587();
        var6.glBufferDataARB(arg1, this.field1269, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field1269), this.field1268 ? 35040 : 35044);
        this.field1264.field5789 += this.field1269;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lcg;ILjava/nio/ByteBuffer;Z)V")
    public class89(class393 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field1264 = arg0;
        this.field1265 = arg1;
        this.field1269 = arg2.limit();
        this.field1268 = arg3;
        opengl var5 = arg0.field5783;
        var5.glGenBuffersARB(1, field1267, 0);
        this.field1266 = field1267[0];
        this.method587();
        var5.glBufferDataARB(arg1, this.field1269, arg2, this.field1268 ? 35040 : 35044);
        this.field1264.field5789 += this.field1269;
    }
}
