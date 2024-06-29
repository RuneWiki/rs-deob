import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class115 {

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field67;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method27(int arg0, byte[] arg1) {
        this.field67 = ByteBuffer.allocateDirect(arg1.length);
        this.field67.position(arg0);
        this.field67.put(arg1);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)[B", line = 17)
    public final byte[] method28(int arg0) {
        byte[] var2 = new byte[this.field67.capacity()];
        this.field67.position(arg0);
        this.field67.get(var2);
        return var2;
    }
}
