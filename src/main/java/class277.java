import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class277 extends class220 {

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    private int field3928 = -1;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    private int field3929;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
    public final void method44() {
        this.field3101.field1927.glFramebufferTexture3DEXT(36160, this.field3928, this.field3102, 0, 0, 0);
        this.field3928 = -1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lao;IIII[BI)V")
    public class277(class157 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3931 = arg2;
        this.field3929 = arg3;
        this.field3930 = arg4;
        opengl var8 = arg0.field1927;
        this.field3101.method1003(this);
        var8.glTexImage3D(this.field3102, 0, this.field3100, this.field3931, this.field3929, this.field3930, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1476(true);
    }
}
