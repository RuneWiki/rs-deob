import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class332 extends class325 {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    private int field4958;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    public final void method2036(boolean arg0, int arg1) {
        if (arg1 < 88) {
            this.method2036(true, 47);
        }
        opengl var3 = this.field4883.field5783;
        this.field4883.method2460(this);
        var3.glTexParameteri(this.field4879, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public final void method70() {
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lcg;II[BI)V")
    public class332(class393 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4958 = arg2;
        opengl var6 = arg0.field5783;
        this.field4883.method2460(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field4879, 0, this.field4878, this.field4958, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2001(true);
    }
}
