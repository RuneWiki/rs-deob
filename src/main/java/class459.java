import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class459 extends class375 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    private int field6474 = -1;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    private int field6472;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field6475;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    private int field6473;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lfu;IIII[BI)V", line = 4)
    public class459(class42 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6472 = arg2;
        this.field6475 = arg3;
        this.field6473 = arg4;
        opengl var8 = arg0.field557;
        this.field5186.method303(this);
        var8.glTexImage3D(this.field5180, 0, this.field5187, this.field6472, this.field6475, this.field6473, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2297(true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 24)
    public final void method88() {
        this.field5186.field557.glFramebufferTexture3DEXT(36160, this.field6474, this.field5180, 0, 0, 0);
        this.field6474 = -1;
    }
}
