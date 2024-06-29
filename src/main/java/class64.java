import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class64 extends class205 {

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZB)V")
    public final void method471(boolean arg0, byte arg1) {
        if (arg1 != -119) {
            this.field840 = -125;
        }
        opengl var3 = this.field2875.field2253;
        this.field2875.method1160(this);
        var3.glTexParameteri(this.field2878, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
    public final void method419() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lks;II[BI)V")
    public class64(class173 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field840 = arg2;
        opengl var6 = arg0.field2253;
        this.field2875.method1160(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field2878, 0, this.field2876, this.field840, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1405(true);
    }
}
