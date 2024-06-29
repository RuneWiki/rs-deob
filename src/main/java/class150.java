import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class150 extends class223 {

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    private int field1970 = -1;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lih;IIII[BI)V")
    public class150(class330 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1971 = arg2;
        this.field1969 = arg3;
        this.field1972 = arg4;
        opengl var8 = arg0.field4741;
        this.field3152.method2186(this);
        var8.glTexImage3D(this.field3156, 0, this.field3151, this.field1971, this.field1969, this.field1972, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1390(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public final void method570() {
        this.field3152.field4741.glFramebufferTexture3DEXT(36160, this.field1970, this.field3156, 0, 0, 0);
        this.field1970 = -1;
    }
}
