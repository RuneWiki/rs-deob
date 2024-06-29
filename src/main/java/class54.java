import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class54 extends class205 {

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    private int field668 = -1;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "()V", line = 6)
    public final void method419() {
        this.field2875.field2253.glFramebufferTexture3DEXT(36160, this.field668, this.field2878, 0, 0, 0);
        this.field668 = -1;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lks;IIII[BI)V", line = 12)
    public class54(class173 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field667 = arg2;
        this.field669 = arg3;
        this.field666 = arg4;
        opengl var8 = arg0.field2253;
        this.field2875.method1160(this);
        var8.glTexImage3D(this.field2878, 0, this.field2876, this.field667, this.field669, this.field666, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1405(true);
    }
}
