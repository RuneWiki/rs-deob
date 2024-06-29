import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class227 extends class386 {

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    private int field2994 = -1;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lbf;IIII[BI)V")
    public class227(class344 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2991 = arg2;
        this.field2992 = arg3;
        this.field2993 = arg4;
        opengl var8 = arg0.field4604;
        this.field5346.method2106(this);
        var8.glTexImage3D(this.field5342, 0, this.field5343, this.field2991, this.field2992, this.field2993, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2370(true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V")
    public final void method411() {
        this.field5346.field4604.glFramebufferTexture3DEXT(36160, this.field2994, this.field5342, 0, 0, 0);
        this.field2994 = -1;
    }
}
