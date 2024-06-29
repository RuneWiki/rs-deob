import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class330 extends class321 {

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lmm;II[BI)V")
    public class330(class357 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4473 = arg2;
        opengl var6 = arg0.field4794;
        this.field4370.method2180(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field4369, 0, this.field4364, this.field4473, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1954(true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V")
    public final void method2003(boolean arg0, int arg1) {
        if (arg1 != 3317) {
            this.method377();
        }
        opengl var3 = this.field4370.field4794;
        this.field4370.method2180(this);
        var3.glTexParameteri(this.field4369, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public final void method377() {
    }
}
