import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class349 {

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Lhd;")
    public class17 field4727;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    private int field4724;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    private int field4725;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Z")
    private boolean field4726;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "[I")
    private static int[] field4728 = new int[1];

    @OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field4727.method139(this.field4729, this.field4725);
        super.finalize();
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([BI)V", line = 12)
    public final void method2203(byte[] arg0, int arg1) {
        this.method825();
        if (arg1 > this.field4725) {
            this.field4727.field198.glBufferDataARB(this.field4724, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field4726 ? 35040 : 35044);
            this.field4727.field220 += arg1 - this.field4725;
            this.field4725 = arg1;
        } else {
            this.field4727.field198.glBufferSubDataARB(this.field4724, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "()I", line = 28)
    public int method353() {
        return this.field4729;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lhd;I[BIZ)V", line = 39)
    public class349(class17 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4727 = arg0;
        this.field4724 = arg1;
        this.field4725 = arg3;
        this.field4726 = arg4;
        opengl var6 = arg0.field198;
        var6.glGenBuffersARB(1, field4728, 0);
        this.field4729 = field4728[0];
        this.method825();
        var6.glBufferDataARB(arg1, this.field4725, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field4725), this.field4726 ? 35040 : 35044);
        this.field4727.field220 += this.field4725;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lhd;ILjava/nio/ByteBuffer;Z)V", line = 56)
    public class349(class17 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field4727 = arg0;
        this.field4724 = arg1;
        this.field4725 = arg2.limit();
        this.field4726 = arg3;
        opengl var5 = arg0.field198;
        var5.glGenBuffersARB(1, field4728, 0);
        this.field4729 = field4728[0];
        this.method825();
        var5.glBufferDataARB(arg1, this.field4725, arg2, this.field4726 ? 35040 : 35044);
        this.field4727.field220 += this.field4725;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
    public abstract void method825();
}
