import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class441 extends class127 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    private int field6204;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
    public final void method152() {
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
    public final void method2762(int arg0, boolean arg1) {
        opengl var3 = this.field1787.field3184;
        this.field1787.method1559(this);
        var3.glTexParameteri(this.field1789, arg0, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ltb;II[BI)V")
    public class441(class227 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6204 = arg2;
        opengl var6 = arg0.field3184;
        this.field1787.method1559(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field1789, 0, this.field1790, this.field6204, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method868(true);
    }
}
