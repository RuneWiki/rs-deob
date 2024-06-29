import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class381 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lfu;")
    public class42 field5239;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field5236;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
    private boolean field5238;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field5235;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    private static int[] field5234 = new int[1];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I", line = 4)
    public int method464() {
        return this.field5235;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BI)V", line = 13)
    public final void method2323(byte[] arg0, int arg1) {
        this.method468();
        if (arg1 > this.field5236) {
            this.field5239.field557.glBufferDataARB(this.field5237, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field5238 ? 35040 : 35044);
            this.field5239.field575 += arg1 - this.field5236;
            this.field5236 = arg1;
        } else {
            this.field5239.field557.glBufferSubDataARB(this.field5237, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        this.field5239.method425(this.field5235, this.field5236);
        super.finalize();
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lfu;I[BIZ)V", line = 40)
    public class381(class42 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5239 = arg0;
        this.field5237 = arg1;
        this.field5236 = arg3;
        this.field5238 = arg4;
        opengl var6 = arg0.field557;
        var6.glGenBuffersARB(1, field5234, 0);
        this.field5235 = field5234[0];
        this.method468();
        var6.glBufferDataARB(arg1, this.field5236, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field5236), this.field5238 ? 35040 : 35044);
        this.field5239.field575 += this.field5236;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lfu;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class381(class42 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field5239 = arg0;
        this.field5237 = arg1;
        this.field5236 = arg2.limit();
        this.field5238 = arg3;
        opengl var5 = arg0.field557;
        var5.glGenBuffersARB(1, field5234, 0);
        this.field5235 = field5234[0];
        this.method468();
        var5.glBufferDataARB(arg1, this.field5236, arg2, this.field5238 ? 35040 : 35044);
        this.field5239.field575 += this.field5236;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public abstract void method468();
}
