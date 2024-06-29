import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class14 extends class360 {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field211 = -1;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lnf;IIII[BI)V", line = 15)
    public class14(class256 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field213 = arg2;
        this.field214 = arg3;
        this.field212 = arg4;
        opengl var8 = arg0.field3634;
        this.field5209.method1669(this);
        var8.glTexImage3D(this.field5204, 0, this.field5203, this.field213, this.field214, this.field212, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2351(true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 10)
    public final void method93() {
        this.field5209.field3634.glFramebufferTexture3DEXT(36160, this.field211, this.field5204, 0, 0, 0);
        this.field211 = -1;
    }
}
