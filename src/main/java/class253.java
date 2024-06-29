import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class253 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lsq;")
    public class96 field4117;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    private boolean field4119;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    private static int[] field4116 = new int[1];

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4117.method662(this.field4115, this.field4120);
        super.finalize();
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public int method85() {
        return this.field4115;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
    public abstract void method1224();

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI)V")
    public final void method1754(byte[] arg0, int arg1) {
        this.method1224();
        if (arg1 > this.field4120) {
            this.field4117.field1156.glBufferDataARB(this.field4118, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field4119 ? 35040 : 35044);
            this.field4117.field1178 += arg1 - this.field4120;
            this.field4120 = arg1;
        } else {
            this.field4117.field1156.glBufferSubDataARB(this.field4118, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lsq;I[BIZ)V")
    public class253(class96 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4117 = arg0;
        this.field4118 = arg1;
        this.field4120 = arg3;
        this.field4119 = arg4;
        opengl var6 = arg0.field1156;
        var6.glGenBuffersARB(1, field4116, 0);
        this.field4115 = field4116[0];
        this.method1224();
        var6.glBufferDataARB(arg1, this.field4120, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field4120), this.field4119 ? 35040 : 35044);
        this.field4117.field1178 += this.field4120;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lsq;ILjava/nio/ByteBuffer;Z)V")
    public class253(class96 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field4117 = arg0;
        this.field4118 = arg1;
        this.field4120 = arg2.limit();
        this.field4119 = arg3;
        opengl var5 = arg0.field1156;
        var5.glGenBuffersARB(1, field4116, 0);
        this.field4115 = field4116[0];
        this.method1224();
        var5.glBufferDataARB(arg1, this.field4120, arg2, this.field4119 ? 35040 : 35044);
        this.field4117.field1178 += this.field4120;
    }
}
