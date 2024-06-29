import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class51 extends class133 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field774 = -1;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V", line = 6)
    public final void method333() {
        this.field1844.field4607.glFramebufferTexture3DEXT(36160, this.field774, this.field1839, 0, 0, 0);
        this.field774 = -1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lhj;IIII[BI)V", line = 12)
    public class51(class338 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field772 = arg2;
        this.field773 = arg3;
        this.field775 = arg4;
        opengl var8 = arg0.field4607;
        this.field1844.method2165(this);
        var8.glTexImage3D(this.field1839, 0, this.field1845, this.field772, this.field773, this.field775, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method915(true);
    }
}
