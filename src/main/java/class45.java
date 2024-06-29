import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class45 extends class50 {

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
    public final void method211(boolean arg0, boolean arg1) {
        if (!arg0) {
            opengl var3 = this.field482.field4697;
            this.field482.method2032(this);
            var3.glTexParameteri(this.field484, 10242, arg1 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public final void method119() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lql;II[BI)V")
    public class45(class346 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field457 = arg2;
        opengl var6 = arg0.field4697;
        this.field482.method2032(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field484, 0, this.field481, this.field457, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method242(true);
    }
}
