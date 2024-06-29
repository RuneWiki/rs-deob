import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class221 {

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Lnf;")
    public class256 field2910;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Z")
    private boolean field2909;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
    private static int[] field2914 = new int[1];

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([BI)V", line = 10)
    public final void method1288(byte[] arg0, int arg1) {
        this.method1289();
        if (arg1 > this.field2913) {
            this.field2910.field3634.glBufferDataARB(this.field2912, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field2909 ? 35040 : 35044);
            this.field2910.field3651 += arg1 - this.field2913;
            this.field2913 = arg1;
        } else {
            this.field2910.field3634.glBufferSubDataARB(this.field2912, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "()I", line = 22)
    public int method139() {
        return this.field2911;
    }

    @OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() throws Throwable {
        this.field2910.method1631(this.field2911, this.field2913);
        super.finalize();
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lnf;I[BIZ)V", line = 39)
    public class221(class256 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2910 = arg0;
        this.field2912 = arg1;
        this.field2913 = arg3;
        this.field2909 = arg4;
        opengl var6 = arg0.field3634;
        var6.glGenBuffersARB(1, field2914, 0);
        this.field2911 = field2914[0];
        this.method1289();
        var6.glBufferDataARB(arg1, this.field2913, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field2913), this.field2909 ? 35040 : 35044);
        this.field2910.field3651 += this.field2913;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lnf;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class221(class256 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field2910 = arg0;
        this.field2912 = arg1;
        this.field2913 = arg2.limit();
        this.field2909 = arg3;
        opengl var5 = arg0.field3634;
        var5.glGenBuffersARB(1, field2914, 0);
        this.field2911 = field2914[0];
        this.method1289();
        var5.glBufferDataARB(arg1, this.field2913, arg2, this.field2909 ? 35040 : 35044);
        this.field2910.field3651 += this.field2913;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "()V")
    public abstract void method1289();
}
