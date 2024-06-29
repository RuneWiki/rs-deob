import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class108 extends class360 {

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lnf;II[BI)V", line = 4)
    public class108(class256 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1539 = arg2;
        opengl var6 = arg0.field3634;
        this.field5209.method1669(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5204, 0, this.field5203, this.field1539, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2351(true);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZB)V", line = 21)
    public final void method718(boolean arg0, byte arg1) {
        opengl var3 = this.field5209.field3634;
        this.field5209.method1669(this);
        if (arg1 <= 124) {
            this.method93();
        }
        var3.glTexParameteri(this.field5204, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 34)
    public final void method93() {
    }
}
