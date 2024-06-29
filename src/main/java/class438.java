import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class438 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lnm;")
    public class254 field6185;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    private int field6189;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field6188;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    private boolean field6186;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    private int field6184;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    private static int[] field6187 = new int[1];

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        this.field6185.method1654(this.field6184, this.field6188);
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V", line = 26)
    public final void method2550(byte[] arg0, int arg1) {
        this.method871();
        if (arg1 > this.field6188) {
            this.field6185.field3648.glBufferDataARB(this.field6189, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field6186 ? 35040 : 35044);
            this.field6185.field3657 += arg1 - this.field6188;
            this.field6188 = arg1;
        } else {
            this.field6185.field3648.glBufferSubDataARB(this.field6189, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lnm;I[BIZ)V", line = 37)
    public class438(class254 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6185 = arg0;
        this.field6189 = arg1;
        this.field6188 = arg3;
        this.field6186 = arg4;
        opengl var6 = arg0.field3648;
        var6.glGenBuffersARB(1, field6187, 0);
        this.field6184 = field6187[0];
        this.method871();
        var6.glBufferDataARB(arg1, this.field6188, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field6188), this.field6186 ? 35040 : 35044);
        this.field6185.field3657 += this.field6188;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 55)
    public int method114() {
        return this.field6184;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lnm;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class438(class254 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field6185 = arg0;
        this.field6189 = arg1;
        this.field6188 = arg2.limit();
        this.field6186 = arg3;
        opengl var5 = arg0.field3648;
        var5.glGenBuffersARB(1, field6187, 0);
        this.field6184 = field6187[0];
        this.method871();
        var5.glBufferDataARB(arg1, this.field6188, arg2, this.field6186 ? 35040 : 35044);
        this.field6185.field3657 += this.field6188;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public abstract void method871();
}
