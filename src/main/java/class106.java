import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class106 extends class4 {

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    private int field1555 = -1;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lhd;IIII)V", line = 4)
    public class106(class17 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1553 = arg2;
        this.field1554 = arg3;
        this.field1552 = arg4;
        opengl var6 = arg0.field198;
        this.field24.method207(this);
        var6.glTexImage3D(this.field26, 0, this.field27, this.field1553, this.field1554, this.field1552, 0, method18(this.field27), 5121, (Buffer) null);
        this.method17(true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V", line = 16)
    public final void method889() {
        this.field24.field198.glFramebufferTexture3DEXT(36160, this.field1555, this.field26, 0, 0, 0);
        this.field1555 = -1;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lhd;IIII[BI)V", line = 22)
    public class106(class17 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1553 = arg2;
        this.field1554 = arg3;
        this.field1552 = arg4;
        opengl var8 = arg0.field198;
        this.field24.method207(this);
        var8.glTexImage3D(this.field26, 0, this.field27, this.field1553, this.field1554, this.field1552, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method17(true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V", line = 34)
    public final void method890(int arg0, int arg1, int arg2) {
        this.field24.field198.glFramebufferTexture3DEXT(36160, arg0, this.field26, this.field28, arg1, arg2);
        this.field1555 = arg0;
    }
}
