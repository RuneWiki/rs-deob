import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class453 extends class4 {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    private int field6596;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lhd;II[BI)V", line = 5)
    public class453(class17 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6596 = arg2;
        opengl var6 = arg0.field198;
        this.field24.method207(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field26, 0, this.field27, this.field6596, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method17(true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V", line = 22)
    public final void method889() {
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method2823(int arg0, boolean arg1) {
        opengl var3 = this.field24.field198;
        if (arg0 != -16072) {
            this.field6596 = 117;
        }
        this.field24.method207(this);
        var3.glTexParameteri(this.field26, 10242, arg1 ? 10497 : 33071);
    }
}
