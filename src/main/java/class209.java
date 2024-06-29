import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class209 extends class127 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field2862 = -1;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field2864;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ltb;IIII[BI)V", line = 5)
    public class209(class227 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2863 = arg2;
        this.field2864 = arg3;
        this.field2865 = arg4;
        opengl var8 = arg0.field3184;
        this.field1787.method1559(this);
        var8.glTexImage3D(this.field1789, 0, this.field1790, this.field2863, this.field2864, this.field2865, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method868(true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 20)
    public final void method152() {
        this.field1787.field3184.glFramebufferTexture3DEXT(36160, this.field2862, this.field1789, 0, 0, 0);
        this.field2862 = -1;
    }
}
