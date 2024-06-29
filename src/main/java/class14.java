import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class14 extends class375 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lfu;II[BI)V")
    public class14(class42 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field126 = arg2;
        opengl var6 = arg0.field557;
        this.field5186.method303(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5180, 0, this.field5187, this.field126, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2297(true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public final void method87(int arg0, boolean arg1) {
        opengl var3 = this.field5186.field557;
        int var4 = -58 / ((-arg0 - 12) / 37);
        this.field5186.method303(this);
        var3.glTexParameteri(this.field5180, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public final void method88() {
    }
}
