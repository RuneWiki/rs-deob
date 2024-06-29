import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class425 {

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    private int field210 = -1;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "()V")
    public final void method95() {
        this.field5957.field4445.glFramebufferTexture3DEXT(36160, this.field210, this.field5962, 0, 0, 0);
        this.field210 = -1;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lmi;IIII[BI)V")
    public class17(class315 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field211 = arg2;
        this.field209 = arg3;
        this.field212 = arg4;
        opengl var8 = arg0.field4445;
        this.field5957.method1967(this);
        var8.glTexImage3D(this.field5962, 0, this.field5960, this.field211, this.field209, this.field212, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2501(true);
    }
}
