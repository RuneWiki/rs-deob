import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class87 extends class195 {

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZB)V")
    public final void method657(boolean arg0, byte arg1) {
        opengl var3 = this.field2858.field1604;
        this.field2858.method929(this);
        var3.glTexParameteri(this.field2860, 10242, arg0 ? 10497 : 33071);
        if (arg1 != -81) {
            this.method658();
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lge;II[BI)V")
    public class87(class104 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1403 = arg2;
        opengl var6 = arg0.field1604;
        this.field2858.method929(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field2860, 0, this.field2862, this.field1403, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1499(true);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
    public final void method658() {
    }
}
