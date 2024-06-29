import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class283 extends class425 {

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lmi;II[BI)V")
    public class283(class315 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4153 = arg2;
        opengl var6 = arg0.field4445;
        this.field5957.method1967(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5962, 0, this.field5960, this.field4153, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2501(true);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
    public final void method95() {
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
    public final void method1784(boolean arg0, byte arg1) {
        if (arg1 == 106) {
            opengl var3 = this.field5957.field4445;
            this.field5957.method1967(this);
            var3.glTexParameteri(this.field5962, 10242, arg0 ? 10497 : 33071);
        }
    }
}
