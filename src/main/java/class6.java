import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class6 extends class5 {

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    private int field64 = -1;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "()V")
    public final void method47() {
        this.field55.field3342.glFramebufferTexture3DEXT(36160, this.field64, this.field56, 0, 0, 0);
        this.field64 = -1;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lic;IIII[BI)V")
    public class6(class246 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field61 = arg2;
        this.field62 = arg3;
        this.field63 = arg4;
        opengl var8 = arg0.field3342;
        this.field55.method1379(this);
        var8.glTexImage3D(this.field56, 0, this.field53, this.field61, this.field62, this.field63, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method46(true);
    }
}
