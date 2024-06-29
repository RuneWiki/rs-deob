import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class264 extends class26 {

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lnm;II[BI)V", line = 6)
    public class264(class254 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3921 = arg2;
        opengl var6 = arg0.field3648;
        this.field329.method1653(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field330, 0, this.field331, this.field3921, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method228(true);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()V", line = 22)
    public final void method309() {
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BZ)V", line = 26)
    public final void method1735(byte arg0, boolean arg1) {
        opengl var3 = this.field329.field3648;
        if (arg0 > -35) {
            this.method309();
        }
        this.field329.method1653(this);
        var3.glTexParameteri(this.field330, 10242, arg1 ? 10497 : 33071);
    }
}
