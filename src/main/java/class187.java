import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class187 extends class439 {

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    private int field2545 = -1;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lpo;IIII[BI)V", line = 10)
    public class187(class332 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2543 = arg2;
        this.field2544 = arg3;
        this.field2546 = arg4;
        opengl var8 = arg0.field4752;
        this.field6436.method2085(this);
        var8.glTexImage3D(this.field6438, 0, this.field6434, this.field2543, this.field2544, this.field2546, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2725(true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V", line = 21)
    public final void method460() {
        this.field6436.field4752.glFramebufferTexture3DEXT(36160, this.field2545, this.field6438, 0, 0, 0);
        this.field2545 = -1;
    }
}
