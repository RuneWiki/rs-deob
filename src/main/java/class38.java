import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class38 extends class5 {

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lic;II[BI)V")
    public class38(class246 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field466 = arg2;
        opengl var6 = arg0.field3342;
        this.field55.method1379(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field56, 0, this.field53, this.field466, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method46(true);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public final void method47() {
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
    public final void method198(boolean arg0, int arg1) {
        opengl var3 = this.field55.field3342;
        this.field55.method1379(this);
        if (arg1 == -30747) {
            var3.glTexParameteri(this.field56, 10242, arg0 ? 10497 : 33071);
        }
    }
}
