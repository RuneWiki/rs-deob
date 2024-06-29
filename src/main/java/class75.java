import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class75 extends class344 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    private int field1044 = -1;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lse;IIII)V")
    public class75(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1047 = arg2;
        this.field1045 = arg3;
        this.field1046 = arg4;
        opengl var6 = arg0.field4140;
        this.field5130.method1915(this);
        var6.glTexImage3D(this.field5129, 0, this.field5131, this.field1047, this.field1045, this.field1046, 0, method2272(this.field5131), 5121, (Buffer) null);
        this.method2277(true);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lse;IIII[BI)V")
    public class75(class282 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1047 = arg2;
        this.field1045 = arg3;
        this.field1046 = arg4;
        opengl var8 = arg0.field4140;
        this.field5130.method1915(this);
        var8.glTexImage3D(this.field5129, 0, this.field5131, this.field1047, this.field1045, this.field1046, 0, arg6, 5121, ByteBuffer.wrap(arg5));
        this.method2277(true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final void method603(int arg0, int arg1, int arg2) {
        this.field5130.field4140.glFramebufferTexture3DEXT(36160, arg0, this.field5129, this.field5127, arg1, arg2);
        this.field1044 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public final void method28() {
        this.field5130.field4140.glFramebufferTexture3DEXT(36160, this.field1044, this.field5129, 0, 0, 0);
        this.field1044 = -1;
    }
}
