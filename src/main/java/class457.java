import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class457 extends class325 {

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private int field6776 = -1;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    private int field6777;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    private int field6778;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lcg;IIII[BI)V")
    public class457(class393 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6777 = arg2;
        this.field6778 = arg3;
        this.field6779 = arg4;
        opengl var8 = arg0.field5783;
        this.field4883.method2460(this);
        var8.glTexImage3D(this.field4879, 0, this.field4878, this.field6777, this.field6778, this.field6779, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2001(true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public final void method70() {
        this.field4883.field5783.glFramebufferTexture3DEXT(36160, this.field6776, this.field4879, 0, 0, 0);
        this.field6776 = -1;
    }
}
