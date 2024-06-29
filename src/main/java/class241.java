import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class241 extends class26 {

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    private int field3483 = -1;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    private int field3486;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    private int field3485;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lnm;IIII[BI)V", line = 7)
    public class241(class254 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3486 = arg2;
        this.field3485 = arg3;
        this.field3484 = arg4;
        opengl var8 = arg0.field3648;
        this.field329.method1653(this);
        var8.glTexImage3D(this.field330, 0, this.field331, this.field3486, this.field3485, this.field3484, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method228(true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 23)
    public final void method309() {
        this.field329.field3648.glFramebufferTexture3DEXT(36160, this.field3483, this.field330, 0, 0, 0);
        this.field3483 = -1;
    }
}
