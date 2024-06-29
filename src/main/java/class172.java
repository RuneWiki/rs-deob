import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class172 extends class223 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V", line = 7)
    public final void method1058(int arg0, boolean arg1) {
        opengl var3 = this.field3152.field4741;
        this.field3152.method2186(this);
        var3.glTexParameteri(this.field3156, arg0, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 16)
    public final void method570() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lih;II[BI)V", line = 19)
    public class172(class330 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2259 = arg2;
        opengl var6 = arg0.field4741;
        this.field3152.method2186(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field3156, 0, this.field3151, this.field2259, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1390(true);
    }
}
