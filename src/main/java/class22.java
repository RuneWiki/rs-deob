import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class22 extends class344 {

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public final void method28() {
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lse;II[BI)V")
    public class22(class282 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field395 = arg2;
        opengl var6 = arg0.field4140;
        this.field5130.method1915(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5129, 0, this.field5131, this.field395, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2277(true);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
    public final void method197(int arg0, boolean arg1) {
        opengl var3 = this.field5130.field4140;
        this.field5130.method1915(this);
        var3.glTexParameteri(this.field5129, 10242, arg1 ? 10497 : 33071);
        if (arg0 != 10497) {
            this.field395 = -115;
        }
    }
}
