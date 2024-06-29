import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class389 extends class293 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    private int field5859;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lsq;II[BI)V", line = 4)
    public class389(class96 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5859 = arg2;
        opengl var6 = arg0.field1156;
        this.field4690.method688(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field4695, 0, this.field4696, this.field5859, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1980(true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V", line = 21)
    public final void method2460(boolean arg0, int arg1) {
        opengl var3 = this.field4690.field1156;
        this.field4690.method688(this);
        var3.glTexParameteri(this.field4695, arg1, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 31)
    public final void method1824() {
    }
}
