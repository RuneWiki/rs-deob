import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class291 extends class321 {

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    private int field3947 = -1;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lmm;IIII[BI)V", line = 4)
    public class291(class357 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3948 = arg2;
        this.field3946 = arg3;
        this.field3945 = arg4;
        opengl var8 = arg0.field4794;
        this.field4370.method2180(this);
        var8.glTexImage3D(this.field4369, 0, this.field4364, this.field3948, this.field3946, this.field3945, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1954(true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 16)
    public final void method377() {
        this.field4370.field4794.glFramebufferTexture3DEXT(36160, this.field3947, this.field4369, 0, 0, 0);
        this.field3947 = -1;
    }
}
