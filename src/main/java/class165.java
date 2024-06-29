import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class165 extends class439 {

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method1089(int arg0, boolean arg1) {
        opengl var3 = this.field6436.field4752;
        if (arg0 == 3317) {
            this.field6436.method2085(this);
            var3.glTexParameteri(this.field6438, 10242, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lpo;II[BI)V", line = 18)
    public class165(class332 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2318 = arg2;
        opengl var6 = arg0.field4752;
        this.field6436.method2085(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field6438, 0, this.field6434, this.field2318, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2725(true);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 35)
    public final void method460() {
    }
}
