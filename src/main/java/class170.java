import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class170 extends class179 {

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lqi;II[BI)V")
    public class170(class458 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2500 = arg2;
        opengl var6 = arg0.field6330;
        this.field2602.method2692(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field2598, 0, this.field2599, this.field2500, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1168(true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
    public final void method1049(int arg0, boolean arg1) {
        if (arg0 != -31478) {
            this.field2500 = 90;
        }
        opengl var3 = this.field2602.field6330;
        this.field2602.method2692(this);
        var3.glTexParameteri(this.field2598, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()V")
    public final void method1050() {
    }
}
