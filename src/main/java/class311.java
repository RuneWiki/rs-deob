import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class311 extends class50 {

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field4189 = -1;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lql;IIII[BI)V")
    public class311(class346 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4192 = arg2;
        this.field4190 = arg3;
        this.field4191 = arg4;
        opengl var8 = arg0.field4697;
        this.field482.method2032(this);
        var8.glTexImage3D(this.field484, 0, this.field481, this.field4192, this.field4190, this.field4191, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method242(true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public final void method119() {
        this.field482.field4697.glFramebufferTexture3DEXT(36160, this.field4189, this.field484, 0, 0, 0);
        this.field4189 = -1;
    }
}
