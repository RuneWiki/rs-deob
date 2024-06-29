import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class295 extends class195 {

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    private int field4384 = -1;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "()V", line = 5)
    public final void method658() {
        this.field2858.field1604.glFramebufferTexture3DEXT(36160, this.field4384, this.field2860, 0, 0, 0);
        this.field4384 = -1;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lge;IIII[BI)V", line = 17)
    public class295(class104 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4382 = arg2;
        this.field4383 = arg3;
        this.field4381 = arg4;
        opengl var8 = arg0.field1604;
        this.field2858.method929(this);
        var8.glTexImage3D(this.field2860, 0, this.field2862, this.field4382, this.field4383, this.field4381, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1499(true);
    }
}
