import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class378 extends class386 {

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    private int field5198;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
    public final void method2319(boolean arg0, int arg1) {
        opengl var3 = this.field5346.field4604;
        this.field5346.method2106(this);
        var3.glTexParameteri(this.field5342, 10242, arg0 ? 10497 : 33071);
        if (arg1 != 0) {
            this.method411();
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
    public final void method411() {
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lbf;II[BI)V")
    public class378(class344 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5198 = arg2;
        opengl var6 = arg0.field4604;
        this.field5346.method2106(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field5342, 0, this.field5343, this.field5198, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method2370(true);
    }
}
