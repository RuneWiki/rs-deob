import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class161 extends class404 {

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    private int field2315 = -1;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()V", line = 9)
    public final void method434() {
        this.field5661.field1918.glFramebufferTexture3DEXT(36160, this.field2315, this.field5663, 0, 0, 0);
        this.field2315 = -1;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lig;IIII[BI)V", line = 13)
    public class161(class132 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2316 = arg2;
        this.field2317 = arg3;
        this.field2314 = arg4;
        opengl var8 = arg0.field1918;
        this.field5661.method888(this);
        var8.glTexImage3D(this.field5663, 0, this.field5662, this.field2316, this.field2317, this.field2314, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2524(true);
    }
}
