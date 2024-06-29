import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class135 extends class233 {

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
    public final void method877(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.field1542 = -74;
        }
        opengl var3 = this.field3052.field4363;
        this.field3052.method2088(this);
        var3.glTexParameteri(this.field3058, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "()V")
    public final void method878() {
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lh;II[BI)V")
    public class135(class327 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1542 = arg2;
        opengl var6 = arg0.field4363;
        this.field3052.method2088(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field3058, 0, this.field3055, this.field1542, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1507(true);
    }
}
