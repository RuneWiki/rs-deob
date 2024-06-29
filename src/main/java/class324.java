import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class324 extends class233 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field4331 = -1;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    private int field4330;

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lh;IIII[BI)V", line = 4)
    public class324(class327 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4332 = arg2;
        this.field4333 = arg3;
        this.field4330 = arg4;
        opengl var8 = arg0.field4363;
        this.field3052.method2088(this);
        var8.glTexImage3D(this.field3058, 0, this.field3055, this.field4332, this.field4333, this.field4330, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1507(true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 17)
    public final void method878() {
        this.field3052.field4363.glFramebufferTexture3DEXT(36160, this.field4331, this.field3058, 0, 0, 0);
        this.field4331 = -1;
    }
}
