import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class306 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lmm;")
    public class357 field4157;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
    private boolean field4160;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    private static int[] field4161 = new int[1];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BI)V", line = 13)
    public final void method1847(byte[] arg0, int arg1) {
        this.method574();
        if (arg1 > this.field4159) {
            this.field4157.field4794.glBufferDataARB(this.field4158, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field4160 ? 35040 : 35044);
            this.field4157.field4807 += arg1 - this.field4159;
            this.field4159 = arg1;
        } else {
            this.field4157.field4794.glBufferSubDataARB(this.field4158, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lmm;I[BIZ)V", line = 27)
    public class306(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4157 = arg0;
        this.field4158 = arg1;
        this.field4159 = arg3;
        this.field4160 = arg4;
        opengl var6 = arg0.field4794;
        var6.glGenBuffersARB(1, field4161, 0);
        this.field4156 = field4161[0];
        this.method574();
        var6.glBufferDataARB(arg1, this.field4159, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field4159), this.field4160 ? 35040 : 35044);
        this.field4157.field4807 += this.field4159;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lmm;ILjava/nio/ByteBuffer;Z)V", line = 44)
    public class306(class357 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field4157 = arg0;
        this.field4158 = arg1;
        this.field4159 = arg2.limit();
        this.field4160 = arg3;
        opengl var5 = arg0.field4794;
        var5.glGenBuffersARB(1, field4161, 0);
        this.field4156 = field4161[0];
        this.method574();
        var5.glBufferDataARB(arg1, this.field4159, arg2, this.field4160 ? 35040 : 35044);
        this.field4157.field4807 += this.field4159;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()I", line = 66)
    public int method578() {
        return this.field4156;
    }

    @OriginalMember(owner = "client!dj", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() throws Throwable {
        this.field4157.method2155(this.field4156, this.field4159);
        super.finalize();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V")
    public abstract void method574();
}
