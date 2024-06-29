import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class71 extends class404 {

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lig;II[BI)V", line = 4)
    public class71(class132 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field938 = arg2;
        opengl var6 = arg0.field1918;
        this.field5661.method888(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5663, 0, this.field5662, this.field938, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2524(true);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V", line = 22)
    public final void method434() {
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)V", line = 26)
    public final void method435(boolean arg0, byte arg1) {
        opengl var3 = this.field5661.field1918;
        if (arg1 != 126) {
            this.field938 = -51;
        }
        this.field5661.method888(this);
        var3.glTexParameteri(this.field5663, 10242, arg0 ? 10497 : 33071);
    }
}
