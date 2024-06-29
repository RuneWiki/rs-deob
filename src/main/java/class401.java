import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class401 extends class293 {

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    private int field5987 = -1;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field5984;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    private int field5986;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lsq;IIII[BI)V")
    public class401(class96 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5984 = arg2;
        this.field5986 = arg3;
        this.field5985 = arg4;
        opengl var8 = arg0.field1156;
        this.field4690.method688(this);
        var8.glTexImage3D(this.field4695, 0, this.field4696, this.field5984, this.field5986, this.field5985, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method1980(true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public final void method1824() {
        this.field4690.field1156.glFramebufferTexture3DEXT(36160, this.field5987, this.field4695, 0, 0, 0);
        this.field5987 = -1;
    }
}
