import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class179 extends class220 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V", line = 6)
    public final void method1212(byte arg0, boolean arg1) {
        opengl var3 = this.field3101.field1927;
        this.field3101.method1003(this);
        var3.glTexParameteri(this.field3102, 10242, arg1 ? 10497 : 33071);
        if (arg0 > -86) {
            this.method1212((byte) 60, false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 19)
    public final void method44() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lao;II[BI)V", line = 21)
    public class179(class157 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field2453 = arg2;
        opengl var6 = arg0.field1927;
        this.field3101.method1003(this);
        var6.glPixelStorei(3317, 1);
        var6.glTexImage1D(this.field3102, 0, this.field3100, this.field2453, 0, arg4, 5121, ByteBuffer.wrap(arg3));
        var6.glPixelStorei(3317, 4);
        this.method1476(true);
    }
}
