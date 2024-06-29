import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class47 extends class133 {

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method332(boolean arg0, int arg1) {
        if (arg1 == 14589) {
            opengl var3 = this.field1844.field4607;
            this.field1844.method2165(this);
            var3.glTexParameteri(this.field1839, 10242, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 20)
    public final void method333() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lhj;II[BI)V", line = 22)
    public class47(class338 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field729 = arg2;
        opengl var6 = arg0.field4607;
        this.field1844.method2165(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field1839, 0, this.field1845, this.field729, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method915(true);
    }
}
