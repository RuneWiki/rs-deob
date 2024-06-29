import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class247 extends class179 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field3475 = -1;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    private int field3478;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lqi;IIII[BI)V", line = 9)
    public class247(class458 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3477 = arg2;
        this.field3476 = arg3;
        this.field3478 = arg4;
        opengl var8 = arg0.field6330;
        this.field2602.method2692(this);
        var8.glTexImage3D(this.field2598, 0, this.field2599, this.field3477, this.field3476, this.field3478, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1168(true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V", line = 23)
    public final void method1050() {
        this.field2602.field6330.glFramebufferTexture3DEXT(36160, this.field3475, this.field2598, 0, 0, 0);
        this.field3475 = -1;
    }
}
